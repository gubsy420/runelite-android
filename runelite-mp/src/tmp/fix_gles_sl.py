import os, re

ROOT = 'C:/Users/tyler/Documents/code/runelite/runelite-mp/src/androidMain/resources/rs117/hd'

# GLES SL is strict about int<->float mixing in arithmetic and in builtin overloads.
# Desktop GLSL auto-promotes; GLES doesn't. We patch the most common patterns:
#
#  1. Integer literal in clamp/min/max/mix/step/smoothstep argument list where another
#     arg is a float — promote the bare int literal to a float literal.
#  2. Bare int divisor on a vec/float: `vec / 4` → `vec / 4.0`.
#  3. Bare int multiplier on a vec/float: `result * 2 - 1` (when "1" should be float).
#
# This is heuristic — a real GLSL preprocessor would walk the AST. We only rewrite
# integer literals that look like float-context (inside a clamp/min/max/mix call
# that already has at least one float literal arg, or where a `.0`-bearing decimal
# already exists in the same expression).

FUNCS = ('clamp', 'min', 'max', 'mix', 'step', 'smoothstep')

def looks_float(arg):
    """Heuristic: argument has a `.` somewhere (float literal or vec[xy]) or contains
    a known-float name. Bare integers / single identifiers go undecided."""
    s = arg.strip()
    if '.' in s: return True
    # Common float/vec identifiers
    if re.search(r'\b(uvw|pos|distance|opacity|fade|color|blend|fresnel|fog|alpha|height|cosLight|cosView|colorFilterFade|baseOpacity|tileCos|hsl|distBlend|heightFade)\b', s):
        return True
    return False

def promote_int_literal(arg):
    """If arg is just a bare integer literal like '0' or '17', append '.0'.
    Negative literals like '-1' also handled."""
    s = arg.strip()
    if re.fullmatch(r'-?\d+', s):
        return s + '.0'
    return arg

def fix_func_call(text):
    out = []
    i = 0
    n = len(text)
    changed = 0
    while i < n:
        # Find a builtin function name (whole-word)
        m = re.search(r'\b(' + '|'.join(FUNCS) + r')\s*\(', text[i:])
        if not m: break
        fn = m.group(1)
        open_paren = i + m.end() - 1
        # Find matching close paren
        depth = 1
        j = open_paren + 1
        while j < n and depth:
            c = text[j]
            if c == '(': depth += 1
            elif c == ')': depth -= 1
            j += 1
        if depth != 0: break
        inside = text[open_paren + 1: j - 1]
        # Split at top-level commas
        args = []
        depth2 = 0
        cur = ''
        for c in inside:
            if c == '(': depth2 += 1
            elif c == ')': depth2 -= 1
            if c == ',' and depth2 == 0:
                args.append(cur); cur = ''
            else:
                cur += c
        if cur: args.append(cur)
        # Check if any arg looks float
        any_float = any(looks_float(a) for a in args)
        if any_float:
            new_args = [promote_int_literal(a) if not looks_float(a) and re.fullmatch(r'\s*-?\d+\s*', a) else a for a in args]
            new_inside = ','.join(new_args)
            if new_inside != inside:
                out.append(text[i:open_paren + 1])
                out.append(new_inside)
                out.append(')')
                i = j
                changed += 1
                continue
        out.append(text[i:j])
        i = j
    out.append(text[i:])
    return ''.join(out), changed

def fix_vec_div_int(text):
    """`x / 4` where x is a float/vec — patch trailing integer literal divisors to .0
    when preceded by /, *, +, - and the LHS expression contains `.`."""
    # Simplified: rewrite ` / 4`, `* 2`, etc. with bare ints, only when preceded by
    # a closing paren or identifier matching a known-float name. Too risky for full
    # generality; we just target /N and *N after dotted identifiers / vec accessors.
    pat = re.compile(r'(\b[A-Za-z_]\w*\.[A-Za-z_]\w+|\b\w*[Pp]osition\b|\b\w*[Cc]olor\b|\b\w*[Ff]actor\b)\s*([\*/\+\-])\s*(-?\d+)\b(?!\.)')
    def repl(m):
        return f'{m.group(1)} {m.group(2)} {m.group(3)}.0'
    new, n = pat.subn(repl, text)
    return new, n

total_clamp = 0
total_arith = 0
for dp, _, fs in os.walk(ROOT):
    for f in fs:
        if not f.endswith('.glsl'): continue
        p = os.path.join(dp, f)
        src = open(p, encoding='utf-8').read()
        new, c1 = fix_func_call(src)
        new, c2 = fix_vec_div_int(new)
        if c1 + c2:
            open(p, 'w', encoding='utf-8').write(new)
            total_clamp += c1
            total_arith += c2
            print(f'{f}: clamp/min/max={c1} arith={c2}')
print(f'\ntotal clamp/min/max: {total_clamp}, arith: {total_arith}')
