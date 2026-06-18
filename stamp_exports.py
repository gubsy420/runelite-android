"""
Phase 1: For every @Override method (or member directly implementing a runelite-api
interface method) in runescape-client/src/main/java/, stamp @Export with the source
member name if missing.

Verification basis: when a method has @Override against a runelite-api interface, the
Java compiler has *already* proved the source method name matches an interface method —
so labeling it as a friendly Export name is safe by construction.

Heuristic for "friendly": method name is multi-character camelCase (contains an upper
case letter after the first), OR exact match for a short whitelist (init, start, stop,
destroy, paint, update, run, main, finalize, iterator, next, hasNext, close, write,
read, getId, getName, getValue).

Side effects: writes the file back with added `@Export(...)` lines just above
@Override (or as part of the existing annotation block). Adds `import
net.runelite.api.annotations.Export;` if missing.
"""
from __future__ import annotations

import os
import re
import sys
from pathlib import Path

ROOT = Path("runescape-client/src/main/java")

CAMEL = re.compile(r"^[a-z][a-zA-Z0-9]*[A-Z][a-zA-Z0-9]*$")
SHORT_WHITELIST = {
    "init", "start", "stop", "destroy", "paint", "update", "run", "main",
    "finalize", "iterator", "next", "hasNext", "close", "write", "read",
    "toString", "hashCode", "equals", "clone", "size", "isEmpty", "clear",
    "remove", "add", "get", "set", "put", "open", "send", "load", "save",
    "tick", "render", "draw", "kill", "spawn", "post", "fire", "process",
    "decode", "encode", "reset", "flush", "wait", "notify", "compareTo",
}

# Method-declaration regex: matches the modifiers + return type + name + (.
# Captures the method name in group 1.
METHOD_DECL = re.compile(
    r"^(?P<indent>\s*)"
    r"(?:public\s+|protected\s+|private\s+|static\s+|final\s+|synchronized\s+|abstract\s+|native\s+|default\s+)+"
    r"[\w\[\]<>?,. \t]+?\s+"   # return type (non-greedy)
    r"(?P<name>[a-zA-Z_][\w$]*)\s*"
    r"\([^;]*$"                # opening paren, no semicolon on this line
)

OVERRIDE_LINE = re.compile(r"^\s*@Override\b")
EXPORT_LINE = re.compile(r"^\s*@Export\s*\(")
ANNOTATION_LINE = re.compile(r"^\s*@[A-Z]")
IMPORT_EXPORT = "import net.runelite.api.annotations.Export;"


def is_friendly(name: str) -> bool:
    if name in SHORT_WHITELIST:
        return True
    if len(name) < 4:
        return False
    return bool(CAMEL.match(name))


def process_file(path: Path) -> tuple[int, list[str]]:
    """Return (number of stamps added, modified lines)."""
    text = path.read_text(encoding="utf-8")
    lines = text.splitlines(keepends=False)
    n = len(lines)
    out: list[str] = []
    i = 0
    stamps = 0
    has_export_import = "net.runelite.api.annotations.Export" in text
    # Track whether we need to add the import.
    needs_import = False

    # Walk every line; when we hit a @Override line followed (after annotation block)
    # by a friendly-named method decl AND the annotation block doesn't already include
    # @Export, insert @Export above the @Override.
    while i < n:
        line = lines[i]
        if OVERRIDE_LINE.match(line):
            # Look back to find the start of the contiguous annotation block.
            ann_block_start = i
            j = i - 1
            while j >= 0 and ANNOTATION_LINE.match(lines[j]):
                # Could be a multi-line annotation like:
                #     @ObfuscatedSignature(
                #         descriptor = "()I"
                #     )
                # We only need to know where the block began.  Step over closing
                # parens / arg lines that don't start with @ (still part of the
                # previous annotation).
                ann_block_start = j
                j -= 1
            # The annotation block may actually extend ABOVE more than just plain @-
            # prefixed lines (multi-line annotation continuations). Walk further up
            # while we see non-empty indented lines that aren't another declaration.
            while ann_block_start > 0:
                prev = lines[ann_block_start - 1]
                stripped = prev.strip()
                if (
                    stripped.startswith("@") or
                    stripped.startswith(")") or
                    (stripped and not (stripped.endswith(";") or stripped.endswith("}") or stripped.endswith("{"))
                     and ann_block_start - 2 >= 0 and lines[ann_block_start - 2].strip().endswith(",") or
                     stripped.endswith(","))
                ):
                    ann_block_start -= 1
                else:
                    break

            # Look forward from @Override to find the method declaration line.
            k = i + 1
            while k < n and ANNOTATION_LINE.match(lines[k]):
                k += 1
            # k now points at the first non-annotation line after @Override.
            if k < n:
                decl_match = METHOD_DECL.match(lines[k])
                if decl_match:
                    name = decl_match.group("name")
                    if is_friendly(name):
                        # Check if @Export is already in the annotation block.
                        block = lines[ann_block_start : k]
                        already_has_export = any(EXPORT_LINE.match(b) for b in block)
                        if not already_has_export:
                            indent = decl_match.group("indent")
                            export_line = f'{indent}@Export("{name}")'
                            # Insert export_line just before the @Override line (i).
                            # We've already emitted lines [0..i) is *not* true — we're
                            # processing forward.  Emit the export here.
                            # Actually we need to emit the export immediately before
                            # the @Override line we're about to emit.
                            out.append(export_line)
                            stamps += 1
                            if not has_export_import:
                                needs_import = True
        out.append(line)
        i += 1

    if stamps == 0:
        return 0, lines

    # Insert import if needed.
    if needs_import and not has_export_import:
        # Find the last "import ..." line, insert after.
        last_import_idx = -1
        for idx, l in enumerate(out):
            if l.startswith("import "):
                last_import_idx = idx
        if last_import_idx >= 0:
            out.insert(last_import_idx + 1, IMPORT_EXPORT)

    path.write_text("\n".join(out) + ("\n" if text.endswith("\n") else ""), encoding="utf-8")
    return stamps, out


def main() -> int:
    total = 0
    files_touched = 0
    per_file: list[tuple[str, int]] = []
    for p in sorted(ROOT.glob("*.java")):
        added, _ = process_file(p)
        if added:
            files_touched += 1
            total += added
            per_file.append((p.name, added))

    # Top 10 by stamps.
    per_file.sort(key=lambda t: -t[1])
    print(f"Stamped {total} @Export annotations across {files_touched} files.")
    print("Top 10 by stamp count:")
    for name, count in per_file[:10]:
        print(f"  {count:5d}  {name}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
