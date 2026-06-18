"""
Walks runescape-client/src/main/java/ and emits a TSV of EXPORT_TABLE entries
suitable for the Sanitizer to load. Each line:

    <obfClass>#<obfName><descriptor>\t<friendlyName>

For every method that currently has @Export(...), we read its @ObfuscatedName + the
class's @ObfuscatedName + the method's @ObfuscatedSignature descriptor and produce
the matching table key. This lets the Sanitizer re-stamp the same @Export the next
time the pipeline runs (durable across syncSources).

Fields are also handled: their descriptor sits on the @ObfuscatedSignature; if
there's no @ObfuscatedSignature, we treat the descriptor as the field's declared
type.

Output file: client-inspector/src/main/resources/exports-derived.tsv
"""
from __future__ import annotations

import re
import sys
from pathlib import Path

ROOT = Path("runescape-client/src/main/java")
OUT = Path("client-inspector/src/main/resources/exports-derived.tsv")

# Regex to match @ObfuscatedName("x")
OBF_NAME = re.compile(r'@ObfuscatedName\("([^"]+)"\)')
# Regex to match @ObfuscatedSignature(descriptor = "x"), possibly multi-line.
OBF_SIG = re.compile(r'@ObfuscatedSignature\(\s*descriptor\s*=\s*"([^"]+)"\s*\)', re.MULTILINE)
# Regex to match @Export("x")
EXPORT = re.compile(r'@Export\("([^"]+)"\)')

# Method declaration regex (must end with `(` and continue, but we only need name)
METHOD_DECL = re.compile(
    r"^\s*"
    r"(?:public\s+|protected\s+|private\s+|static\s+|final\s+|synchronized\s+|abstract\s+|native\s+|default\s+|@\S+\s+)*"
    r"(?:<[^>]+>\s+)?"   # generic param
    r"[\w\[\]<>?,. \t&]+?\s+"  # return type
    r"(?P<name>[a-zA-Z_$][\w$]*)\s*"
    r"\("
)


def parse_class_obf_name(text: str) -> str | None:
    # Look for the FIRST @ObfuscatedName before a `class`/`interface`/`enum` decl.
    m = re.search(
        r'@ObfuscatedName\("([^"]+)"\)[^;]*?(?:public\s+|abstract\s+|final\s+|static\s+|protected\s+)*'
        r'(?:class|interface|enum)\s+([A-Za-z_]\w*)',
        text, re.MULTILINE)
    if m:
        return m.group(1)
    return None


def main() -> int:
    rows: list[tuple[str, str]] = []
    parse_errors = 0

    for jf in sorted(ROOT.glob("*.java")):
        text = jf.read_text(encoding="utf-8")
        cls_obf = parse_class_obf_name(text)
        if cls_obf is None:
            # Fallback: use stem.
            cls_obf = jf.stem

        # Split into lines for easier walking. Find every member that has @Export.
        lines = text.splitlines()
        i = 0
        while i < len(lines):
            if EXPORT.search(lines[i]):
                # Walk back to find @ObfuscatedName / @ObfuscatedSignature
                block_start = i
                while block_start > 0 and (lines[block_start - 1].strip().startswith("@")
                                            or lines[block_start - 1].strip().startswith(")")
                                            or "descriptor" in lines[block_start - 1]
                                            or lines[block_start - 1].strip() == ""
                                            or (block_start - 2 >= 0 and lines[block_start - 2].strip().endswith(","))
                                            or lines[block_start - 1].strip().endswith(",")):
                    if lines[block_start - 1].strip() == "":
                        # Stop on blank lines (they separate decls)
                        break
                    block_start -= 1
                # Walk forward to find the method/field declaration.
                k = i + 1
                while k < len(lines) and lines[k].strip().startswith("@"):
                    k += 1
                if k >= len(lines):
                    i += 1
                    continue
                decl_line = lines[k]

                # Get the contiguous annotation block text.
                block_text = "\n".join(lines[block_start:k + 1])
                obf_name_m = OBF_NAME.search(block_text)
                obf_sig_m = OBF_SIG.search(block_text)
                export_m = EXPORT.search(block_text)

                if not (obf_name_m and obf_sig_m and export_m):
                    # Field-with-no-signature is common — try to fall back later.
                    # For now skip if we can't fully resolve.
                    parse_errors += 1
                    i = k + 1
                    continue

                obf_name = obf_name_m.group(1)
                descriptor = obf_sig_m.group(1)
                friendly = export_m.group(1)

                # Is this a method? If decl_line has `(`, it's a method.
                # The descriptor for methods is `(...)RetType`. For fields, it's just the type.
                is_method = "(" in decl_line
                if is_method:
                    if not descriptor.startswith("("):
                        # Mismatch — likely the wrong sig regex caught a field sig; skip
                        parse_errors += 1
                        i = k + 1
                        continue
                    key = f"{cls_obf}#{obf_name}{descriptor}"
                else:
                    # Field
                    key = f"{cls_obf}#{obf_name}:{descriptor}"
                rows.append((key, friendly))
                i = k + 1
                continue
            i += 1

    OUT.parent.mkdir(parents=True, exist_ok=True)
    with OUT.open("w", encoding="utf-8", newline="\n") as f:
        # Header
        f.write("# Auto-generated by generate_exports_tsv.py\n")
        f.write("# Format: <obfClass>#<obfName><descriptor>\\t<friendlyName>\n")
        for k, v in sorted(set(rows)):
            f.write(f"{k}\t{v}\n")
    dedupe = sorted(set(rows))
    print(f"Wrote {len(dedupe)} unique entries (dropped {len(rows) - len(dedupe)} dupes) to {OUT}")
    print(f"Skipped {parse_errors} parse failures")
    return 0


if __name__ == "__main__":
    sys.exit(main())
