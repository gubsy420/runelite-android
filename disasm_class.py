"""
Disassemble every method of a specific native C++ class (and its callees we care about).
Print disassembly + extract:
- field offsets accessed via [rdi+OFFSET] (this+offset)
- callees (other functions called via call rel32)
- string-table references (lea rax, [rip+...]) pointing into __cstring
- size and address

Usage:
    python disasm_class.py jag::oldscape::ClientEntity > data/disasm-ClientEntity.txt
"""
from __future__ import annotations

import json
import sys
from collections import defaultdict
from pathlib import Path

import lief
import capstone


def main():
    if len(sys.argv) < 2:
        print("usage: disasm_class.py <native-class>", file=sys.stderr)
        return 2
    target_class = sys.argv[1]

    native = json.loads(Path('data/native-methods.json').read_text(encoding='utf-8'))
    if target_class not in native:
        print(f"class {target_class} not in native methods", file=sys.stderr)
        # Suggest near-matches.
        suggestions = [c for c in native if target_class in c][:10]
        if suggestions:
            print('did you mean:', file=sys.stderr)
            for s in suggestions:
                print('  ' + s, file=sys.stderr)
        return 2

    # Load binary + text section + cstrings.
    b = lief.parse('data/osclient-216-mac')
    text = None
    cstring = None
    for sec in b.sections:
        if sec.name == '__text':
            text = sec
        elif sec.name == '__cstring':
            cstring = sec
    text_addr = text.virtual_address
    text_bytes = bytes(text.content)
    cstring_addr = cstring.virtual_address
    cstring_bytes = bytes(cstring.content)

    # Build address -> demangled name map (only for jag::* methods; that's all we have demangled)
    addr_to_name = {}
    for cls, entries in native.items():
        for e in entries:
            # Use a short label "Class::method"
            addr_to_name[e['addr']] = f"{cls.split('::')[-1]}::{e['method']}"

    md = capstone.Cs(capstone.CS_ARCH_X86, capstone.CS_MODE_64)
    md.detail = True

    entries = native[target_class]
    # Dedupe by method+args+const.
    seen = {}
    for e in entries:
        key = (e['method'], e['args_raw'], e['is_const'])
        if key not in seen or (e['size'] > 0 and seen[key]['size'] <= 0):
            seen[key] = e
    entries = sorted(seen.values(), key=lambda e: e['addr'])

    print(f"# Disassembly of {target_class} ({len(entries)} unique methods)")
    print(f"# binary text section: 0x{text_addr:09x} .. 0x{text_addr + len(text_bytes):09x}")
    print()

    field_offset_usage = defaultdict(set)   # offset -> {(method, mode)} where mode='r' or 'w'

    for e in entries:
        addr = e['addr']
        size = e['size']
        if size <= 0 or size > 4096:
            continue
        if not (text_addr <= addr < text_addr + len(text_bytes)):
            continue
        rel = addr - text_addr
        if rel + size > len(text_bytes):
            continue
        code = text_bytes[rel:rel + size]

        print(f"## {e['method']}({e['args_raw']}){' const' if e['is_const'] else ''}  addr=0x{addr:x} size={size}")
        # Disassemble.
        for ins in md.disasm(code, addr):
            op = ins.mnemonic
            opstr = ins.op_str
            # Annotate field accesses on rdi (this), arg accesses on rsi/rdx/rcx/r8/r9.
            annot = ''
            # Resolve call targets and rip-relative lea.
            if op == 'call':
                # Capstone may give us a hex value as op_str.
                try:
                    tgt = int(opstr, 16) if opstr.startswith('0x') else None
                except ValueError:
                    tgt = None
                if tgt is not None and tgt in addr_to_name:
                    annot = f"  ; -> {addr_to_name[tgt]}"
            elif op == 'lea' and 'rip' in opstr.lower():
                # Format like "rax, [rip + 0x123456]"
                # Resolve the target address.
                try:
                    plus = opstr.lower().find('rip +')
                    if plus < 0:
                        plus = opstr.lower().find('rip-')
                    # capstone uses 'rip + 0xN' or 'rip - 0xN'. The instruction's address is ins.address + size.
                    # We can use ins.operands to compute.
                    if len(ins.operands) >= 2 and ins.operands[1].type == capstone.x86.X86_OP_MEM:
                        mem = ins.operands[1].mem
                        if mem.base == capstone.x86.X86_REG_RIP:
                            target = ins.address + ins.size + mem.disp
                            if cstring_addr <= target < cstring_addr + len(cstring_bytes):
                                # Pull C string at target.
                                off = target - cstring_addr
                                end = cstring_bytes.find(b'\x00', off)
                                if end > off:
                                    s = cstring_bytes[off:end].decode('utf-8', errors='replace')
                                    if len(s) <= 80:
                                        annot = f'  ; "{s}"'
                            elif target in addr_to_name:
                                annot = f"  ; -> {addr_to_name[target]}"
                except Exception:
                    pass

            # Field-offset tracking: look at any operand of the form [rdi+OFFSET].
            for o in ins.operands:
                if o.type == capstone.x86.X86_OP_MEM:
                    mem = o.mem
                    if mem.base == capstone.x86.X86_REG_RDI and mem.disp >= 0 and mem.disp < 0x8000:
                        # Heuristic: 'mov [rdi+X], ...' = write; otherwise read.
                        mode = 'w' if op == 'mov' and ins.operands[0] is o else 'r'
                        field_offset_usage[mem.disp].add((e['method'], mode))

            print(f"  0x{ins.address:08x}: {op:7s} {opstr}{annot}")
        print()

    print("# Field offset usage summary")
    for off in sorted(field_offset_usage.keys()):
        users = field_offset_usage[off]
        readers = sorted(m for m, mode in users if mode == 'r')
        writers = sorted(m for m, mode in users if mode == 'w')
        print(f"  +0x{off:03x} ({off:4d})  read by: {', '.join(readers[:8])}{' ...' if len(readers) > 8 else ''}")
        if writers:
            print(f"             write by: {', '.join(writers[:8])}{' ...' if len(writers) > 8 else ''}")


if __name__ == "__main__":
    main()
