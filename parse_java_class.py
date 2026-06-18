"""
Read a Java file under runescape-client/src/main/java and emit a per-method
structural summary that we can compare against native disassembly.

Per method we collect:
  - obf class, obf method name (from @ObfuscatedName)
  - source name, descriptor, return type
  - is_static, has_override, has_export, is_abstract
  - instance field reads / writes (`this.X_fld`)
  - static field reads (`Cls.X_fld`) — qualified by class
  - method calls — qualified by receiver when statically resolvable
  - approximate body length (#lines + #statements)
  - return profile (returns_self_field, returns_constant, etc.)

Usage:
    python parse_java_class.py da [--methods-only] [--no-override] [--no-export]

Output: prints to stdout in a structured human-readable format.
"""
from __future__ import annotations

import re
import sys
import argparse
from collections import OrderedDict
from pathlib import Path

JAVA_ROOT = Path("runescape-client/src/main/java")

# Patterns
OBF_NAME_LINE = re.compile(r'\s*@ObfuscatedName\("([^"]+)"\)\s*$')
OBF_SIG_DESC = re.compile(r'descriptor\s*=\s*"([^"]+)"')
EXPORT_LINE = re.compile(r'\s*@Export\(')
OVERRIDE_LINE = re.compile(r'\s*@Override\b')
CLASS_HEADER = re.compile(
    r'@ObfuscatedName\("([^"]+)"\)[^;{]*?(?:public\s+|abstract\s+|final\s+|static\s+|protected\s+)*'
    r'(?:class|interface|enum)\s+(\w+)(?:[^{]*?extends\s+(\w+))?',
    re.DOTALL)
METHOD_DECL = re.compile(
    r"^(?P<head>(?:\s*(?:public|protected|private|static|final|synchronized|abstract|native|default)\s+)*)"
    r"(?:<[^>]+>\s+)?"
    r"(?P<ret>[\w\[\]<>?,. \t&]+?)\s+"
    r"(?P<name>[a-zA-Z_$][\w$]*)\s*"
    r"\((?P<args>[^)]*)\)\s*"
    r"(?:throws\s+[\w$.,\s]+)?\s*"
    r"(?P<openbrace>\{)?\s*$"
)
FIELD_READ = re.compile(r'\bthis\.([a-zA-Z_$][\w$]*)\b')
FIELD_WRITE = re.compile(r'\bthis\.([a-zA-Z_$][\w$]*)\s*(?:=(?!=)|\+\+|\-\-|\+=|\-=|\*=|/=)')
STATIC_READ = re.compile(r'\b([A-Za-z_$][\w$]*)\.([a-zA-Z_$][\w$]*_fld)\b')
METHOD_CALL = re.compile(r'(?:([A-Za-z_$][\w$]*)\.)?([a-zA-Z_$][\w$]*)\s*\(')
RETURN_LITERAL = re.compile(r'^\s*return\s+(.*?);\s*$')


def find_brace_end(lines: list[str], start_idx: int, start_col: int) -> int:
    """Given lines and a position in lines[start_idx] where '{' is at start_col,
    return the line index of the matching '}'."""
    depth = 0
    s = lines[start_idx]
    # Walk from start_col
    for c in s[start_col:]:
        if c == '{':
            depth += 1
        elif c == '}':
            depth -= 1
            if depth == 0:
                return start_idx
    i = start_idx + 1
    while i < len(lines):
        for c in lines[i]:
            if c == '{':
                depth += 1
            elif c == '}':
                depth -= 1
                if depth == 0:
                    return i
        i += 1
    return len(lines) - 1


def parse_method_body(lines: list[str], begin: int, end: int) -> dict:
    body = "\n".join(lines[begin:end + 1])
    field_reads = set()
    field_writes = set()
    # Field writes first so we don't double-count.
    for m in FIELD_WRITE.finditer(body):
        field_writes.add(m.group(1))
    for m in FIELD_READ.finditer(body):
        f = m.group(1)
        if f not in field_writes:
            field_reads.add(f)
    static_reads = set()
    for m in STATIC_READ.finditer(body):
        static_reads.add(f"{m.group(1)}.{m.group(2)}")
    calls = []
    for m in METHOD_CALL.finditer(body):
        recv = m.group(1) or ""
        meth = m.group(2)
        if meth in {"if", "for", "while", "switch", "return", "throw", "new",
                    "catch", "synchronized", "instanceof", "true", "false", "null"}:
            continue
        calls.append((recv, meth))
    # Dedupe call list
    call_set = OrderedDict()
    for r, m in calls:
        call_set[(r, m)] = None
    return {
        'body_lines': end - begin + 1,
        'body_chars': len(body),
        'field_reads': sorted(field_reads),
        'field_writes': sorted(field_writes),
        'static_reads': sorted(static_reads),
        'calls': list(call_set.keys()),
    }


def parse_descriptor_ret(desc: str) -> str:
    if not desc.startswith("("):
        return desc
    return desc[desc.index(")") + 1:]


def parse_file(path: Path) -> dict:
    text = path.read_text(encoding="utf-8")
    lines = text.splitlines()
    cls_match = CLASS_HEADER.search(text)
    if not cls_match:
        # Plain class with no @ObfuscatedName? Use file stem.
        cls_obf = path.stem
        cls_src = path.stem
        cls_parent = None
    else:
        cls_obf, cls_src, cls_parent = cls_match.group(1), cls_match.group(2), cls_match.group(3)

    methods = []
    i = 0
    n = len(lines)
    pending_obf_name = None
    pending_obf_desc = None
    pending_has_export = False
    pending_has_override = False
    while i < n:
        line = lines[i]
        m = OBF_NAME_LINE.match(line)
        if m:
            body_end = None
            pending_obf_name = m.group(1)
            pending_obf_desc = None
            pending_has_export = False
            pending_has_override = False
            j = i + 1
            # Walk forward through the annotation block
            while j < n:
                ls = lines[j].strip()
                if not ls:
                    j += 1
                    continue
                if ls.startswith('@ObfuscatedSignature'):
                    # may be multi-line; collect until matching ')'
                    chunk = lines[j]
                    k = j
                    while not chunk.rstrip().endswith(')'):
                        k += 1
                        if k >= n:
                            break
                        chunk += '\n' + lines[k]
                    dm = OBF_SIG_DESC.search(chunk)
                    if dm:
                        pending_obf_desc = dm.group(1)
                    j = k + 1
                    continue
                if EXPORT_LINE.match(lines[j]):
                    pending_has_export = True
                    j += 1
                    continue
                if OVERRIDE_LINE.match(lines[j]):
                    pending_has_override = True
                    j += 1
                    continue
                if ls.startswith('@'):
                    # Skip other annotations.
                    j += 1
                    continue
                # Declaration line.
                decl = lines[j]
                # Multi-line declarations: keep collecting until we see { or ; at end.
                rest = decl
                k = j
                while not (rest.rstrip().endswith('{') or rest.rstrip().endswith(';') or
                           rest.rstrip().endswith(')') and rest.count('(') == rest.count(')')):
                    k += 1
                    if k >= n:
                        break
                    rest += ' ' + lines[k].lstrip()
                # Try to match as method.
                mm = METHOD_DECL.match(rest)
                if mm:
                    head = mm.group('head')
                    ret_type = mm.group('ret').strip()
                    src_name = mm.group('name')
                    args = mm.group('args')
                    body_begin = k if 'openbrace' in mm.groupdict() and mm.group('openbrace') else k
                    # If decl line ends with ';' it's abstract — no body.
                    if rest.rstrip().endswith(';'):
                        is_abstract = True
                        body_info = {'body_lines': 0, 'body_chars': 0, 'field_reads': [],
                                     'field_writes': [], 'static_reads': [], 'calls': []}
                        body_end = k
                    else:
                        # Locate the '{' and matching '}'.
                        is_abstract = False
                        # Find the opening brace in lines[k] or one of the prior lines.
                        oc_line = None
                        oc_col = None
                        for ol in range(j, k + 1):
                            if '{' in lines[ol]:
                                oc_line = ol
                                oc_col = lines[ol].index('{')
                                break
                        if oc_line is None:
                            # not really a method? skip
                            j = k + 1
                            continue
                        body_end = find_brace_end(lines, oc_line, oc_col)
                        body_info = parse_method_body(lines, oc_line, body_end)
                    is_static = 'static' in head
                    methods.append({
                        'obf_name': pending_obf_name,
                        'obf_descriptor': pending_obf_desc,
                        'source_name': src_name,
                        'ret_type': ret_type,
                        'args': args,
                        'is_static': is_static,
                        'is_abstract': is_abstract,
                        'has_export': pending_has_export,
                        'has_override': pending_has_override,
                        **body_info,
                    })
                else:
                    # Probably a field declaration; we don't summarize fields here.
                    body_end = k
                i = (body_end + 1) if body_end is not None else (k + 1)
                pending_obf_name = None
                break
            else:
                i = j
            continue
        i += 1

    return {
        'obf_class': cls_obf,
        'source_class': cls_src,
        'parent': cls_parent,
        'methods': methods,
    }


def fmt_method(m: dict, max_calls: int = 12) -> str:
    flags = []
    if m['is_static']:
        flags.append('static')
    if m['is_abstract']:
        flags.append('abstract')
    if m['has_override']:
        flags.append('@Override')
    if m['has_export']:
        flags.append('@Export')
    flag_str = ' '.join(flags)
    head = f"  {m['obf_name']}{m['obf_descriptor'] or '?'}  src={m['source_name']}  ret={m['ret_type']}  [{flag_str}]"
    out = [head]
    if m['is_abstract']:
        return '\n'.join(out)
    body = (f"    body: {m['body_lines']}L/{m['body_chars']}c  "
            f"reads={len(m['field_reads'])} writes={len(m['field_writes'])} "
            f"static={len(m['static_reads'])} calls={len(m['calls'])}")
    out.append(body)
    if m['field_writes']:
        out.append(f"    writes: {', '.join(m['field_writes'])}")
    if m['field_reads']:
        out.append(f"    reads:  {', '.join(m['field_reads'])}")
    if m['static_reads']:
        out.append(f"    static: {', '.join(m['static_reads'][:max_calls])}")
    if m['calls']:
        cstr = ', '.join(f"{r + '.' if r else ''}{x}" for r, x in m['calls'][:max_calls])
        if len(m['calls']) > max_calls:
            cstr += f', ...(+{len(m["calls"]) - max_calls})'
        out.append(f"    calls:  {cstr}")
    return '\n'.join(out)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('class_stem', help='Java file stem (e.g., da, cv, client)')
    ap.add_argument('--no-override', action='store_true', help='Skip @Override methods')
    ap.add_argument('--no-export', action='store_true', help='Skip @Export methods')
    ap.add_argument('--obfuscated-only', action='store_true', help='Only methods whose source name is 1-3 char obfuscated')
    ap.add_argument('--touches-fields', help='Comma-separated field name list; only show methods that read OR write any of these')
    args = ap.parse_args()

    path = JAVA_ROOT / f"{args.class_stem}.java"
    info = parse_file(path)
    print(f"# Class {info['source_class']} (obf={info['obf_class']}) parent={info['parent']}")
    print(f"# {len(info['methods'])} methods total")
    print()

    filter_fields = set(args.touches_fields.split(',')) if args.touches_fields else None
    keep = []
    for m in info['methods']:
        if args.no_override and m['has_override']:
            continue
        if args.no_export and m['has_export']:
            continue
        if args.obfuscated_only:
            sn = m['source_name']
            if len(sn) > 3 or sn != m['obf_name']:
                # source name renamed — skip
                continue
        if filter_fields:
            touched = set(m['field_reads']) | set(m['field_writes'])
            if not (filter_fields & touched):
                continue
        keep.append(m)

    print(f"# After filters: {len(keep)} methods")
    print()
    for m in keep:
        print(fmt_method(m))
        print()


if __name__ == '__main__':
    main()
