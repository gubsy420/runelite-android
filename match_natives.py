"""
Match obfuscated Java members to demangled native methods using:
- @Implements bridge to anchor Java class -> native class
- Per-signature-group uniqueness (signature must map 1:1 on both sides)
- Optional 'no @Override' filter (Override methods already handled in Phase 1)

Inputs:
- runescape-client/src/main/java/*.java  — Java source tree
- data/native-methods.json  — extracted native method index

Outputs:
- data/native-match-candidates.tsv  — candidate (obfClass, obfName, descriptor, friendly, confidence)
- data/native-match-report.md — human-readable report

The friendly name is the native method name with lowercase first letter (Java convention).
"""
from __future__ import annotations

import json
import re
import sys
from collections import defaultdict
from pathlib import Path

JAVA_ROOT = Path("runescape-client/src/main/java")
NATIVE_JSON = Path("data/native-methods.json")
CANDIDATES_OUT = Path("data/native-match-candidates.tsv")
REPORT_OUT = Path("data/native-match-report.md")

# Heuristic candidate-native-class names for each runelite-api interface name.
# Tried in order; first that exists in the native dataset wins.
def candidate_natives(api_name: str) -> list[str]:
    return [
        f"jag::oldscape::Client{api_name}",  # e.g. ClientPlayer for Player
        f"jag::oldscape::{api_name}",
        f"jag::game::{api_name}",
        f"jag::game::Client{api_name}",
        f"jag::oldscape::Client{api_name}Type",  # ClientItemType etc.
        f"jag::game::{api_name}Type",
    ]

# Hand-curated overrides for cases where the heuristic guesses wrong.
HAND_MAPPING = {
    # api -> native
    "Actor": "jag::oldscape::ClientEntity",
    "Client": "jag::oldscape::Client",
    "TileObject": "jag::oldscape::ClientObj",
    "Projectile": "jag::oldscape::ClientProj",
    "GameObject": "jag::oldscape::ClientLocAnim",
    "Scene": "jag::oldscape::rseven::Scene",
    "GroundObject": "jag::oldscape::ClientObj",
    "DecorativeObject": "jag::oldscape::ClientObj",
    "WallObject": "jag::oldscape::ClientObj",
    "ItemLayer": "jag::oldscape::ClientObj",
    "Renderable": "jag::oldscape::ClientEntity",  # NB. too broad — but it's used for fallback
    "Model": "jag::oldscape::ModelLit",  # uncertain
    "Animation": "jag::oldscape::SeqType",
    "ChatLineBuffer": "jag::oldscape::ChatHistory",
    "ChatMessage": "jag::oldscape::ChatLine",
    "FriendsChatManager": "jag::oldscape::FriendChat",
}


# Parse the Java source for @ObfuscatedName / @ObfuscatedSignature / @Override / @Implements / @Export
# This is a regex-based parse — robust enough for our well-formed source.

CLASS_OBF = re.compile(r'@ObfuscatedName\("([^"]+)"\)[^;{]*?@Implements\(\{([^}]+)\}\)[^;]*?(?:class|interface|enum)\s+(\w+)', re.MULTILINE)
CLASS_OBF_PLAIN = re.compile(r'@ObfuscatedName\("([^"]+)"\)[^;{]*?(?:class|interface|enum)\s+(\w+)', re.MULTILINE)


def parse_implements_list(s: str) -> list[str]:
    return [m.strip().strip('"') for m in s.split(',') if m.strip()]


def descriptor_param_groups(desc: str) -> tuple[str, str]:
    """Split a JVM descriptor into (params, ret)."""
    if not desc.startswith('('):
        return ('', desc)
    end = desc.index(')')
    return (desc[1:end], desc[end + 1:])


def args_only(canon: str) -> str:
    """Strip the return type from a canonical (PPP)R signature, keeping just (PPP)."""
    if '(' not in canon or ')' not in canon:
        return canon
    return canon[:canon.index(')') + 1]


def canonical_java_desc(desc: str) -> str:
    """Normalize JVM descriptor for matching against native canonical signature.
    JVM: ( params ) ret_type. Each param is one of B/C/D/F/I/J/S/Z/V or Lname; or [...
    We map L<name>; -> L and [<x> -> L (any object).
    """
    params, ret = descriptor_param_groups(desc)
    out_params = []
    i = 0
    while i < len(params):
        c = params[i]
        if c in 'BCDFIJSZV':
            out_params.append(c)
            i += 1
        elif c == '[':
            # array — treat as object reference 'L'
            while i < len(params) and params[i] == '[':
                i += 1
            if i < len(params) and params[i] == 'L':
                # object array
                end = params.index(';', i)
                i = end + 1
            elif i < len(params):
                i += 1
            out_params.append('L')
        elif c == 'L':
            end = params.index(';', i)
            out_params.append('L')
            i = end + 1
        else:
            i += 1
    out_ret = ret
    if out_ret.startswith('L'):
        out_ret = 'L'
    elif out_ret.startswith('['):
        # array return
        out_ret = 'L'
    return f"({''.join(out_params)}){out_ret}"


def parse_java_file(text: str) -> dict | None:
    """Return:
        { obf_class: <str>, implements: [<str>, ...], methods: [{obf_name, descriptor, source_name, has_export, has_override, is_static}, ...] }
    or None if not parseable.
    """
    # Class-level @ObfuscatedName + @Implements.
    m = CLASS_OBF.search(text)
    if m:
        obf_class = m.group(1)
        implements = parse_implements_list(m.group(2))
    else:
        m = CLASS_OBF_PLAIN.search(text)
        if m:
            obf_class = m.group(1)
            implements = []
        else:
            return None
    # Iterate methods: find @ObfuscatedName lines and read forward.
    methods = []
    lines = text.splitlines()
    i = 0
    while i < len(lines):
        line = lines[i]
        m = re.match(r'\s*@ObfuscatedName\("([^"]+)"\)\s*$', line)
        if not m:
            i += 1
            continue
        obf_name = m.group(1)
        # Walk forward to collect annotations + the declaration line.
        block_start = i
        descriptor = None
        has_export = False
        has_override = False
        is_static = False
        j = i + 1
        # Collect annotation block lines until we hit a non-annotation declaration.
        # Annotation block may include @ObfuscatedSignature(...) which spans multiple lines.
        while j < len(lines):
            l = lines[j]
            stripped = l.strip()
            if stripped.startswith('@'):
                if stripped.startswith('@ObfuscatedSignature('):
                    # Multiline annotation, find its close.
                    k = j
                    sig_text = ''
                    while k < len(lines):
                        sig_text += lines[k] + '\n'
                        if lines[k].strip().endswith(')') and lines[k].count(')') >= lines[k].count('('):
                            break
                        k += 1
                    sm = re.search(r'descriptor\s*=\s*"([^"]+)"', sig_text)
                    if sm:
                        descriptor = sm.group(1)
                    j = k + 1
                    continue
                if stripped.startswith('@Export'):
                    has_export = True
                if stripped.startswith('@Override'):
                    has_override = True
                j += 1
                continue
            # Could be continuation lines from a multi-line annotation? Skip blank.
            if not stripped:
                j += 1
                continue
            # Otherwise we've reached the declaration.
            break

        if j >= len(lines):
            break
        decl_line = lines[j]
        decl_stripped = decl_line.strip()
        # Static?
        if re.match(r'\s*(public\s+|protected\s+|private\s+)?\s*static\s+', decl_line):
            is_static = True
        # Is it a method (has '(') or a field?
        is_method = '(' in decl_stripped
        # Source name extraction (look for `name(` in the decl).
        source_name = None
        if is_method:
            mm = re.match(
                r'\s*(?:public\s+|protected\s+|private\s+|static\s+|final\s+|synchronized\s+|abstract\s+|native\s+|default\s+|@\S+\s+)*'
                r'(?:<[^>]+>\s+)?'
                r'[\w\[\]<>?,. \t&]+?\s+'
                r'(?P<name>[a-zA-Z_$][\w$]*)\s*\(',
                decl_line)
            if mm:
                source_name = mm.group('name')
        else:
            # Field
            mm = re.match(
                r'\s*(?:public\s+|protected\s+|private\s+|static\s+|final\s+|volatile\s+|transient\s+)*'
                r'[\w\[\]<>?,. \t&]+\s+(?P<name>[a-zA-Z_$][\w$]*)\s*[;=]',
                decl_line)
            if mm:
                source_name = mm.group('name')

        methods.append({
            'obf_name': obf_name,
            'descriptor': descriptor,
            'source_name': source_name,
            'has_export': has_export,
            'has_override': has_override,
            'is_static': is_static,
            'is_method': is_method,
        })
        i = j + 1

    return {
        'obf_class': obf_class,
        'implements': implements,
        'methods': methods,
    }


def main() -> int:
    native = json.loads(NATIVE_JSON.read_text(encoding='utf-8'))
    print(f"loaded {sum(len(v) for v in native.values())} native methods in {len(native)} classes", file=sys.stderr)

    # Pre-build native-method-by-canonical-sig per class. Index by ARGS-ONLY canonical
    # signature because Itanium demangling drops return types for non-template methods
    # — so we can't match on return. Dedupe (multiple symbols at the same code address
    # are aliases — e.g. external + internal export — same method).
    native_by_class_sig: dict[str, dict[str, list[dict]]] = {}
    for cls, entries in native.items():
        # Dedupe by (method_name, args_raw, is_const) — addresses are different aliases
        # of the same code but produce the same logical signature.
        seen = {}
        for e in entries:
            key = (e['method'], e['args_raw'], e['is_const'])
            if key not in seen:
                seen[key] = e
            else:
                # Keep the entry with a known size.
                if e['size'] > 0 and seen[key]['size'] <= 0:
                    seen[key] = e
        deduped = list(seen.values())

        by_sig: dict[str, list[dict]] = defaultdict(list)
        for e in deduped:
            m = e['method']
            if m.startswith('~') or m.startswith('operator '):
                continue
            # Skip ctors (method == class name without namespace prefix).
            cls_base = cls.split('::')[-1].split('<', 1)[0]
            if m == cls_base:
                continue
            args_canon = args_only(e['sig_canon'])
            by_sig[args_canon].append(e)
        native_by_class_sig[cls] = dict(by_sig)

    # Walk Java sources.
    matches = []   # (obf_class, obf_name, descriptor, friendly, confidence, reason)
    report_lines = []
    class_pairings = []  # (java_class, native_class, count_match, count_left)

    for jf in sorted(JAVA_ROOT.glob('*.java')):
        text = jf.read_text(encoding='utf-8')
        parsed = parse_java_file(text)
        if parsed is None:
            continue
        if not parsed['implements']:
            continue  # No anchor — skip.

        # Pick the BEST native class candidate.
        chosen_native = None
        for api in parsed['implements']:
            if api in HAND_MAPPING and HAND_MAPPING[api] in native_by_class_sig:
                chosen_native = HAND_MAPPING[api]
                break
            for cand in candidate_natives(api):
                if cand in native_by_class_sig:
                    chosen_native = cand
                    break
            if chosen_native:
                break
        if chosen_native is None:
            continue

        # Now group Java methods by descriptor (canonical).
        java_by_canonical: dict[str, list[dict]] = defaultdict(list)
        for m in parsed['methods']:
            if not m['is_method'] or not m['descriptor']:
                continue
            if m['has_export']:  # already labeled (Phase 1 or hand)
                continue
            # Skip @Override — these are runelite-api friendly-named already, handled by Phase 1.
            # Keep them out of the matcher to avoid false positives.
            if m['has_override']:
                continue
            # Skip methods whose source name is friendly (not obfuscated) — they're already labeled.
            sn = m['source_name'] or ''
            if len(sn) >= 4 and (any(c.isupper() for c in sn) or sn in {'init', 'start', 'stop', 'run'}):
                continue
            jcanon = args_only(canonical_java_desc(m['descriptor']))
            java_by_canonical[jcanon].append(m)

        # Match: for each signature where Java has exactly N methods and native has exactly N methods,
        # if N is small (<= 3), record candidate matches.
        per_class_matches = []
        for canon, jms in java_by_canonical.items():
            ncands = native_by_class_sig[chosen_native].get(canon, [])
            if not jms or not ncands:
                continue
            j_n = len(jms)
            n_n = len(ncands)
            if j_n == 1 and n_n == 1:
                conf = 'HIGH'
                jm = jms[0]
                nc = ncands[0]
                friendly = nc['method'][0].lower() + nc['method'][1:]
                matches.append((parsed['obf_class'], jm['obf_name'], jm['descriptor'], friendly, conf,
                                f"{chosen_native}::{nc['method']} unique-sig"))
                per_class_matches.append(((jm['obf_name'], jm['descriptor']), friendly, conf, nc['method']))
        if per_class_matches:
            class_pairings.append((parsed['obf_class'], chosen_native, len(per_class_matches), len(parsed['methods'])))
            report_lines.append(f"\n## {parsed['obf_class']} ({jf.name}) — {chosen_native}")
            for (on, desc), friendly, conf, n_method in per_class_matches:
                report_lines.append(f"- {on}{desc} → `{friendly}` ({conf}, native `{n_method}`)")

    # Write outputs.
    CANDIDATES_OUT.parent.mkdir(parents=True, exist_ok=True)
    with CANDIDATES_OUT.open('w', encoding='utf-8', newline='\n') as f:
        f.write('# Format: <obfClass>#<obfName><descriptor>\\t<friendly>\\t<confidence>\\t<reason>\n')
        for obf_class, obf_name, desc, friendly, conf, reason in matches:
            f.write(f"{obf_class}#{obf_name}{desc}\t{friendly}\t{conf}\t{reason}\n")

    with REPORT_OUT.open('w', encoding='utf-8', newline='\n') as f:
        f.write(f"# Native-symbol match candidates\n\n")
        f.write(f"**Total candidate matches**: {len(matches)}\n\n")
        f.write(f"**Class pairings made**: {len(class_pairings)}\n\n")
        f.write("## Per-class detail\n")
        f.writelines(line + "\n" for line in report_lines)
        f.write("\n## Class pairings (obf -> native, with match counts)\n")
        for jc, nc, n_match, n_total in sorted(class_pairings, key=lambda t: -t[2]):
            f.write(f"- `{jc}` -> `{nc}`: {n_match} matches\n")

    print(f"wrote {CANDIDATES_OUT} ({len(matches)} matches), {REPORT_OUT}", file=sys.stderr)
    return 0


if __name__ == '__main__':
    sys.exit(main())
