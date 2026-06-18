"""Count @Export annotations on methods/fields in a jar using ASM-light parsing."""
import sys
import zipfile
import struct

EXPORT_DESC = b'Lnet/runelite/api/annotations/Export;'

def find_method_attribute_export(data: bytes) -> tuple[int, int]:
    """Returns (method_count_with_export, field_count_with_export)."""
    # Crude: scan for the RuntimeVisibleAnnotations attribute pattern.
    # Each annotation is: u2 type_index (Utf8 cp index). The Utf8 entry value is the descriptor.
    # We need to find the Utf8 cp index for the @Export descriptor, then count how many
    # annotation entries have that type_index.

    # Parse constant pool to find Export descriptor's cp index.
    p = 8  # skip magic + version
    cp_count, = struct.unpack_from('>H', data, p); p += 2
    utf8_values = {}  # index -> bytes value
    cp_end_offsets = {}  # for double-slot entries
    i = 1
    while i < cp_count:
        tag = data[p]; p += 1
        if tag == 1:  # Utf8
            length, = struct.unpack_from('>H', data, p); p += 2
            utf8_values[i] = data[p:p+length]
            p += length
        elif tag in (3, 4):
            p += 4
        elif tag in (5, 6):
            p += 8
            i += 1
        elif tag in (7, 8, 16, 19, 20):
            p += 2
        elif tag in (9, 10, 11, 12, 17, 18):
            p += 4
        elif tag == 15:
            p += 3
        else:
            raise ValueError(f'tag {tag}')
        i += 1

    export_cp_index = None
    for idx, val in utf8_values.items():
        if val == EXPORT_DESC:
            export_cp_index = idx
            break

    if export_cp_index is None:
        return (0, 0)

    # Now parse the class body to find annotations
    # access(2), this_class(2), super_class(2), interfaces_count(2) + interfaces*2
    cls_start = p
    p += 6
    ic, = struct.unpack_from('>H', data, p); p += 2 + 2*ic

    method_count_with_export = 0
    field_count_with_export = 0

    def scan_attributes(p, count_export_in):
        # u2 attributes_count, then attributes
        ac, = struct.unpack_from('>H', data, p); p += 2
        found = False
        for _ in range(ac):
            name_idx, = struct.unpack_from('>H', data, p); p += 2
            length, = struct.unpack_from('>I', data, p); p += 4
            attr_name = utf8_values.get(name_idx, b'')
            if attr_name in (b'RuntimeVisibleAnnotations', b'RuntimeInvisibleAnnotations'):
                # u2 num_annotations, then each: u2 type_index, u2 num_pairs, pairs...
                ap = p
                num_anns, = struct.unpack_from('>H', data, ap); ap += 2
                for _ in range(num_anns):
                    type_idx, = struct.unpack_from('>H', data, ap); ap += 2
                    if type_idx == export_cp_index:
                        found = True
                    # skip num_pairs and pairs (we just need to advance past this annotation)
                    num_pairs, = struct.unpack_from('>H', data, ap); ap += 2
                    for _ in range(num_pairs):
                        ap += 2  # name_idx
                        ap = skip_element_value(ap)
            p += length
        return p, found

    def skip_element_value(p):
        tag = data[p]; p += 1
        if tag in (ord('B'), ord('C'), ord('D'), ord('F'), ord('I'), ord('J'), ord('S'), ord('Z'), ord('s')):
            p += 2
        elif tag == ord('e'):
            p += 4
        elif tag == ord('c'):
            p += 2
        elif tag == ord('@'):
            # nested annotation
            p += 2  # type_index
            num_pairs, = struct.unpack_from('>H', data, p); p += 2
            for _ in range(num_pairs):
                p += 2
                p = skip_element_value(p)
        elif tag == ord('['):
            num, = struct.unpack_from('>H', data, p); p += 2
            for _ in range(num):
                p = skip_element_value(p)
        else:
            raise ValueError(f'element_value tag {tag}')
        return p

    # fields
    fc, = struct.unpack_from('>H', data, p); p += 2
    for _ in range(fc):
        p += 6  # access, name_idx, desc_idx
        p, has_export = scan_attributes(p, True)
        if has_export:
            field_count_with_export += 1

    # methods
    mc, = struct.unpack_from('>H', data, p); p += 2
    for _ in range(mc):
        p += 6  # access, name_idx, desc_idx
        p, has_export = scan_attributes(p, True)
        if has_export:
            method_count_with_export += 1

    return (method_count_with_export, field_count_with_export)


def main():
    jar = sys.argv[1]
    total_methods = 0
    total_fields = 0
    with zipfile.ZipFile(jar) as z:
        for name in z.namelist():
            if not name.endswith('.class'): continue
            try:
                data = z.read(name)
                m, f = find_method_attribute_export(data)
                total_methods += m
                total_fields += f
            except Exception as e:
                pass
    print(f'{jar}: {total_methods} methods + {total_fields} fields with @Export')


if __name__ == '__main__':
    main()
