"""Find the method(s) with @Export(<friendly>) in a specific jar+class."""
import sys
import zipfile
import struct

EXPORT_DESC = b'Lnet/runelite/api/annotations/Export;'

def parse(data: bytes, target_friendly: bytes):
    p = 8
    cp_count, = struct.unpack_from('>H', data, p); p += 2
    utf8 = {}
    i = 1
    while i < cp_count:
        tag = data[p]; p += 1
        if tag == 1:
            length, = struct.unpack_from('>H', data, p); p += 2
            utf8[i] = data[p:p+length]; p += length
        elif tag in (3, 4): p += 4
        elif tag in (5, 6): p += 8; i += 1
        elif tag in (7, 8, 16, 19, 20): p += 2
        elif tag in (9, 10, 11, 12, 17, 18): p += 4
        elif tag == 15: p += 3
        else: raise ValueError(f'tag {tag}')
        i += 1

    export_cp = None
    friendly_cp = None
    for idx, val in utf8.items():
        if val == EXPORT_DESC: export_cp = idx
        if val == target_friendly: friendly_cp = idx
    if export_cp is None or friendly_cp is None:
        return []

    p += 6
    ic, = struct.unpack_from('>H', data, p); p += 2 + 2*ic
    matches = []

    def skip_ev(p):
        tag = data[p]; p += 1
        if tag in (ord('B'),ord('C'),ord('D'),ord('F'),ord('I'),ord('J'),ord('S'),ord('Z'),ord('s')):
            p += 2
        elif tag == ord('e'): p += 4
        elif tag == ord('c'): p += 2
        elif tag == ord('@'):
            p += 2
            nps, = struct.unpack_from('>H', data, p); p += 2
            for _ in range(nps): p += 2; p = skip_ev(p)
        elif tag == ord('['):
            n, = struct.unpack_from('>H', data, p); p += 2
            for _ in range(n): p = skip_ev(p)
        return p

    def check_attrs(p, member_name, member_desc):
        ac, = struct.unpack_from('>H', data, p); p += 2
        for _ in range(ac):
            ni, = struct.unpack_from('>H', data, p); p += 2
            ln, = struct.unpack_from('>I', data, p); p += 4
            an = utf8.get(ni, b'')
            if an in (b'RuntimeVisibleAnnotations', b'RuntimeInvisibleAnnotations'):
                ap = p
                na, = struct.unpack_from('>H', data, ap); ap += 2
                for _ in range(na):
                    ti, = struct.unpack_from('>H', data, ap); ap += 2
                    nps, = struct.unpack_from('>H', data, ap); ap += 2
                    is_export = (ti == export_cp)
                    has_friendly = False
                    for _ in range(nps):
                        name_idx, = struct.unpack_from('>H', data, ap); ap += 2
                        # element value
                        tag = data[ap]
                        if is_export and tag == ord('s'):
                            sidx, = struct.unpack_from('>H', data, ap+1)
                            if sidx == friendly_cp:
                                has_friendly = True
                        ap = skip_ev(ap)
                    if is_export and has_friendly:
                        matches.append((member_name.decode(), member_desc.decode()))
            p += ln
        return p

    fc, = struct.unpack_from('>H', data, p); p += 2
    for _ in range(fc):
        p += 2
        ni, = struct.unpack_from('>H', data, p); p += 2
        di, = struct.unpack_from('>H', data, p); p += 2
        p = check_attrs(p, utf8.get(ni, b''), utf8.get(di, b''))

    mc, = struct.unpack_from('>H', data, p); p += 2
    for _ in range(mc):
        p += 2
        ni, = struct.unpack_from('>H', data, p); p += 2
        di, = struct.unpack_from('>H', data, p); p += 2
        p = check_attrs(p, utf8.get(ni, b''), utf8.get(di, b''))

    return matches


def main():
    jar = sys.argv[1]
    friendly = sys.argv[2].encode()
    with zipfile.ZipFile(jar) as z:
        for name in sorted(z.namelist()):
            if not name.endswith('.class'): continue
            data = z.read(name)
            ms = parse(data, friendly)
            for nm, desc in ms:
                cls = name[:-6]
                print(f'{cls}#{nm}{desc}')


if __name__ == '__main__':
    main()
