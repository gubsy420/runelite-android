"""Quick: list method (name, desc) pairs declared in a specific .class entry of a jar."""
import sys
import zipfile
import struct

def parse_class(data: bytes) -> list[tuple[str, str]]:
    # Skip magic + version
    p = 8
    # constant_pool_count
    cp_count, = struct.unpack_from('>H', data, p); p += 2
    cp = [None] * cp_count
    i = 1
    while i < cp_count:
        tag = data[p]; p += 1
        if tag == 1:  # Utf8
            length, = struct.unpack_from('>H', data, p); p += 2
            cp[i] = data[p:p+length].decode('utf-8', errors='replace'); p += length
        elif tag in (3, 4):  # Integer/Float
            p += 4
        elif tag in (5, 6):  # Long/Double — takes 2 slots
            p += 8
            i += 1
        elif tag in (7, 8, 16, 19, 20):  # Class, String, MethodType, Module, Package
            p += 2
        elif tag in (9, 10, 11, 12, 17, 18):  # Fieldref/Methodref/InterfaceMethodref/NameAndType/Dynamic/InvokeDynamic
            p += 4
        elif tag == 15:  # MethodHandle
            p += 3
        else:
            raise ValueError(f'unknown cp tag {tag} at {p-1}')
        i += 1
    # access_flags, this_class, super_class
    p += 6
    # interfaces_count
    ic, = struct.unpack_from('>H', data, p); p += 2 + 2*ic
    # fields_count
    fc, = struct.unpack_from('>H', data, p); p += 2
    for _ in range(fc):
        p += 6  # access, name_index, desc_index
        ac, = struct.unpack_from('>H', data, p); p += 2
        for _ in range(ac):
            p += 2  # attr name index
            al, = struct.unpack_from('>I', data, p); p += 4 + al
    # methods_count
    mc, = struct.unpack_from('>H', data, p); p += 2
    methods = []
    for _ in range(mc):
        p += 2  # access
        ni, = struct.unpack_from('>H', data, p); p += 2
        di, = struct.unpack_from('>H', data, p); p += 2
        ac, = struct.unpack_from('>H', data, p); p += 2
        for _ in range(ac):
            p += 2
            al, = struct.unpack_from('>I', data, p); p += 4 + al
        methods.append((cp[ni], cp[di]))
    return methods

if __name__ == '__main__':
    jar = sys.argv[1]
    entry = sys.argv[2]
    needle = sys.argv[3] if len(sys.argv) > 3 else None
    with zipfile.ZipFile(jar) as z:
        data = z.read(entry)
    methods = parse_class(data)
    for name, desc in methods:
        if needle and needle not in name and needle not in desc:
            continue
        print(f'{name}{desc}')
