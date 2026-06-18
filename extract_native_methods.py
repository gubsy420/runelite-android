"""
Extract jag::* methods from osclient-216-mac with their addresses, sizes, and raw
bytes. Demangle every relevant symbol and emit a JSON pickle keyed by demangled
class name.

Output: data/native-methods.json — a dict
    { "jag::oldscape::ClientPlayer": [
        { "demangled": "jag::oldscape::ClientPlayer::Init()", "addr": 0x...,
          "size": N, "ret": "void", "args": [], "is_const": False, "bytes_hex": "..." },
        ...
      ], ... }
"""
from __future__ import annotations

import json
import re
import sys
from pathlib import Path

import lief
from itanium_demangler import parse as demangle_parse


def parse_demangled(demangled: str) -> dict | None:
    """Best-effort split: '<ret> <namespace::Class::Method>(<args>) [const]'.
    Some symbols are NOT methods (vtables, typeinfo, etc.) — return None for those."""
    if not demangled or '(' not in demangled:
        return None
    if demangled.startswith('vtable for ') or demangled.startswith('typeinfo'):
        return None
    if 'guard variable' in demangled or 'non-virtual thunk' in demangled:
        return None
    # Find the matching ( for the method args (last one preceded by an identifier).
    # Use a simple bracket-depth split.  We split off the args clause first.
    # Walk from the END backwards to find a `)` at depth 0 closing the arg list.
    end = len(demangled)
    is_const = False
    if demangled.endswith(' const'):
        is_const = True
        end -= len(' const')
    if demangled[end - 1] != ')':
        return None
    # Walk back to matching '('.
    depth = 0
    i = end - 1
    while i >= 0:
        c = demangled[i]
        if c == ')':
            depth += 1
        elif c == '(':
            depth -= 1
            if depth == 0:
                break
        i -= 1
    if i < 0:
        return None
    args_str = demangled[i + 1:end - 1]
    head = demangled[:i].rstrip()
    # head is "<ret> <namespace::Class::Method>" or just "<Class::Method>" (ctor).
    # Find the last "::" to split class and method.
    # But beware: templated names contain `<...>` with `::` inside. Skip ranges
    # enclosed in `<...>` (templates).
    # For our use we want a clean split for jag:: classes, which usually don't
    # have angle brackets in head. We'll still walk carefully.
    # Find last "::" outside any angle bracket nesting.
    depth = 0
    last_sep = -1
    for j in range(len(head) - 2, -1, -1):
        c = head[j]
        if c == '>':
            depth += 1
        elif c == '<':
            depth -= 1
        elif depth == 0 and c == ':' and j + 1 < len(head) and head[j + 1] == ':':
            last_sep = j
            break
    if last_sep < 0:
        return None  # not enough namespaces
    method_name = head[last_sep + 2:]
    class_path = head[:last_sep]
    # Now class_path is "<ret> <namespace::Class>" OR just "<namespace::Class>" for ctors.
    # If the head was a ctor/dtor (no return type), the entire class_path is the namespace path.
    # We detect this: if the method name equals the trailing class-name portion of class_path,
    # it's a ctor; if it starts with '~', it's a dtor.
    last_class_sep = -1
    depth = 0
    for j in range(len(class_path) - 2, -1, -1):
        c = class_path[j]
        if c == '>':
            depth += 1
        elif c == '<':
            depth -= 1
        elif depth == 0 and c == ':' and j + 1 < len(class_path) and class_path[j + 1] == ':':
            last_class_sep = j
            break
    cls_name = class_path[last_class_sep + 2:] if last_class_sep >= 0 else class_path
    # Check if method_name is the class name (ctor) — strip template args if any.
    cls_base = cls_name.split('<', 1)[0]
    if method_name == cls_base or method_name == '~' + cls_base:
        # ctor/dtor — no return type, the whole class_path is just the class name (with any leading namespace).
        ret = ''
        full_class = class_path
    else:
        # There must be a SPACE separating return type from class path.
        # Walk back through class_path to find a space at depth 0.
        depth = 0
        sp = -1
        for j in range(len(class_path) - 1, -1, -1):
            c = class_path[j]
            if c == '>':
                depth += 1
            elif c == '<':
                depth -= 1
            elif depth == 0 and c == ' ':
                sp = j
                break
        if sp < 0:
            # No space — entire class_path is the class. Return type unknown.
            ret = ''
            full_class = class_path
        else:
            ret = class_path[:sp].strip()
            full_class = class_path[sp + 1:].strip()
    return {
        'class': full_class,
        'method': method_name,
        'ret': ret,
        'args_raw': args_str,
        'is_const': is_const,
    }


def split_args(args_str: str) -> list[str]:
    """Split a C++ arg list at top-level commas (respecting nested templates and parens)."""
    args_str = args_str.strip()
    if not args_str:
        return []
    out: list[str] = []
    depth = 0
    last = 0
    for i, c in enumerate(args_str):
        if c in '<([':
            depth += 1
        elif c in '>)]':
            depth -= 1
        elif c == ',' and depth == 0:
            out.append(args_str[last:i].strip())
            last = i + 1
    out.append(args_str[last:].strip())
    return [a for a in out if a]


def simplify_arg(t: str) -> str:
    """Normalize a C++ arg type to a short canonical form for matching to a Java descriptor.
    int -> I; bool -> Z; signed char/char -> B; short -> S; unsigned char -> B (Java byte);
    unsigned short -> S; long long / unsigned long long -> J; float -> F; double -> D;
    void* -> &L; eastl::basic_string<...> -> Ljava/lang/String; (heuristic);
    reference types -> & + simplified type.
    Returns the SIMPLIFIED type. Used for signature matching."""
    t = t.strip()
    # Strip 'const' and trailing ' const'
    t = re.sub(r'\bconst\b', '', t).strip()
    # Strip reference '&' / pointer '*' for now (we'll re-add as L for objects)
    is_ref_or_ptr = False
    while t.endswith('*') or t.endswith('&'):
        is_ref_or_ptr = True
        t = t[:-1].strip()
    # Primitives.
    primitives = {
        'int': 'I', 'unsigned int': 'I',
        'short': 'S', 'unsigned short': 'S',
        'char': 'B', 'signed char': 'B', 'unsigned char': 'B',
        'long': 'J', 'long long': 'J', 'unsigned long': 'J', 'unsigned long long': 'J',
        'float': 'F', 'double': 'D',
        'bool': 'Z',
        'void': 'V',
    }
    if t in primitives:
        return primitives[t]
    if 'basic_string' in t:
        return 'Ljava/lang/String;'  # heuristic
    # Otherwise it's some object type. Map to 'L' (any object).
    return 'L'


def signature_canonical(parsed: dict) -> str:
    """Return a canonical descriptor-ish string for matching."""
    args = split_args(parsed['args_raw'])
    arg_descs = ''.join(simplify_arg(a) for a in args)
    ret_desc = simplify_arg(parsed['ret']) if parsed['ret'] else 'V'
    return f"({arg_descs}){ret_desc}"


def main():
    binary_path = "data/osclient-216-mac"
    b = lief.parse(binary_path)
    print(f"format: {b.format}", file=sys.stderr)

    # Pull every symbol with an address, demangle, classify.
    raw = []  # (addr, demangled or None, mangled)
    for s in b.symbols:
        if s.value == 0:
            continue
        mangled = s.name
        # Mach-O symbol names are prefixed with _ — strip one underscore for Itanium ABI.
        # Itanium starts with _Z. Some entries are _ZN..., __ZN..., or non-mangled.
        for_demangle = mangled
        if for_demangle.startswith('__'):
            for_demangle = for_demangle[1:]
        try:
            node = demangle_parse(for_demangle)
        except Exception:
            node = None
        dem = str(node) if node else None
        raw.append((s.value, dem, mangled))

    # Sort by address and compute approximate sizes.
    raw.sort(key=lambda r: r[0])
    # Some addresses repeat (aliases). De-duplicate and capture size.
    out_addr_to = {}
    for addr, dem, mangled in raw:
        if dem is None:
            continue
        if addr not in out_addr_to:
            out_addr_to[addr] = {'demangled_list': [], 'mangled_list': []}
        out_addr_to[addr]['demangled_list'].append(dem)
        out_addr_to[addr]['mangled_list'].append(mangled)

    addrs_sorted = sorted(out_addr_to.keys())
    n = len(addrs_sorted)

    # Get the .text section bytes so we can slice each function.
    text_section = None
    for sec in b.sections:
        if sec.name == '__text':
            text_section = sec
            break
    if text_section is None:
        print('no __text section found', file=sys.stderr)
        return 2
    text_addr = text_section.virtual_address
    text_bytes = bytes(text_section.content)
    text_end = text_addr + len(text_bytes)
    print(f'__text: 0x{text_addr:x} .. 0x{text_end:x} ({len(text_bytes)} bytes)', file=sys.stderr)

    # Build per-class index, filtering to jag::* namespace (most relevant).
    by_class: dict[str, list[dict]] = {}
    for i, addr in enumerate(addrs_sorted):
        if i + 1 < n:
            size = addrs_sorted[i + 1] - addr
        else:
            size = 64  # unknown final
        if size < 0 or size > 8192:
            size = -1  # garbage / non-adjacent
        ent = out_addr_to[addr]
        for dem in ent['demangled_list']:
            parsed = parse_demangled(dem)
            if parsed is None:
                continue
            cls = parsed['class']
            if not cls.startswith('jag::') and not cls.startswith('std::') and not cls.startswith('eastl::'):
                continue
            # Skip eastl/std/template noise for now.
            if 'eastl::' in cls or 'std::' in cls:
                continue
            # Skip templated jag classes (jag::Array<...>, jag::shared_ptr<...>)
            if '<' in cls:
                continue
            sig_canon = signature_canonical(parsed)
            # Get raw bytes if within .text.
            bytes_hex = None
            if size > 0 and text_addr <= addr < text_end and addr + size <= text_end:
                bytes_hex = text_bytes[addr - text_addr : addr - text_addr + size].hex()
            by_class.setdefault(cls, []).append({
                'demangled': dem,
                'method': parsed['method'],
                'ret': parsed['ret'],
                'args_raw': parsed['args_raw'],
                'sig_canon': sig_canon,
                'addr': addr,
                'size': size,
                'is_const': parsed['is_const'],
                'bytes_hex_first_64': bytes_hex[:128] if bytes_hex else None,
            })

    out_path = Path('data/native-methods.json')
    out_path.write_text(json.dumps(by_class, indent=2), encoding='utf-8')
    total = sum(len(v) for v in by_class.values())
    print(f'wrote {out_path}: {len(by_class)} classes, {total} methods', file=sys.stderr)
    # Quick stats on a couple of named classes.
    for cls in ['jag::oldscape::Client', 'jag::oldscape::ClientPlayer',
                'jag::oldscape::ClientNpc', 'jag::oldscape::ClientEntity']:
        if cls in by_class:
            ents = by_class[cls]
            print(f'  {cls}: {len(ents)} methods', file=sys.stderr)


if __name__ == "__main__":
    main()
