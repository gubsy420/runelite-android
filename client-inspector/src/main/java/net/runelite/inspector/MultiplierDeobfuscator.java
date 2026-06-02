package net.runelite.inspector;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Port of meteor's ModArith / MultiplicationDeobfuscator combo. Undoes the
 * obfuscator's modular-arithmetic field-protection scheme.
 *
 * <p>The obfuscator picks an odd integer {@code E} per int/long field and stores values
 * as {@code original * E} (mod 2^32 for int, 2^64 for long). Every read site multiplies
 * the stored value by the multiplicative inverse {@code D} (so {@code E*D ≡ 1}) to
 * recover the original; every write site multiplies the incoming value by {@code E}
 * before storing. The result is that source decompiles to noise like:
 * <pre>
 *   if (var0.ar_fld * 1076816293 &lt; var0.as_fld * -751100539) { ... }
 * </pre>
 *
 * <h2>Strategy</h2>
 * <ol>
 *   <li><b>Analyze:</b> scan every method, find {@code GETFIELD/GETSTATIC; PUSH K; IMUL}
 *       (and the reverse PUSH/GET ordering) patterns. Per (field-owner, field-name), tally
 *       the {@code K} multiplier constants. The mode (most-frequent) K is the field's
 *       <b>decoder D</b>.</li>
 *   <li><b>Compute encoders:</b> for each discovered D, compute {@code E = D^-1 mod 2^32}
 *       via Newton iteration. Skipped if D is even (no modular inverse exists).</li>
 *   <li><b>Apply:</b> per method, strip the decoder pattern at every read site (the
 *       {@code PUSH K; IMUL} becomes a no-op since the GETFIELD now logically returns the
 *       original). Also strip {@code PUSH E; IMUL; PUTFIELD f} at write sites.</li>
 * </ol>
 *
 * <p>Note: we treat the recompiled jar as a <i>reference artifact</i> — runtime semantics
 * of the rewritten jar are not important. Asymmetric rewrites (decoding reads but not all
 * writes) are fine; the recompile just needs to succeed and the source needs to be readable.
 * See {@code memory/deobfuscator_role.md}.</p>
 *
 * <h2>Why structural, not symbolic</h2>
 * Meteor uses an {@code Execution} engine that symbolically tracks the constants associated
 * with each instruction's stack inputs. We use ASM tree directly and don't have that. The
 * structural pattern match handles the canonical obfuscator emit shape and ignores anything
 * weirder, which trades some recall for zero risk of false positives in irregular code.
 */
public final class MultiplierDeobfuscator
{
	/** Per (owner, name) of an int/long field → its decoder constant D. */
	private final Map<String, Number> fieldDecoders = new HashMap<>();
	/** Per (owner, name) → encoder E = D^-1 mod 2^N. */
	private final Map<String, Number> fieldEncoders = new HashMap<>();

	private long rewroteReads;
	private long rewroteWrites;
	private long rewroteIncrements;
	private long rewroteComparisonNoise;
	private long annotatedFields;

	/** Internal name of the field-level annotation we stamp on each rewritten field. */
	private static final String OBFUSCATED_GETTER_DESC = "Lnet/runelite/api/annotations/ObfuscatedGetter;";

	/**
	 * Walks the jar once and discovers per-field decoders. After this returns,
	 * {@link #applyToMethod(MethodNode)} is safe to call on each method.
	 */
	public void analyze(Path jarPath) throws IOException
	{
		// (fieldKey + "|" + bitness) → (constant → count) where bitness is "I" or "J"
		Map<String, Map<Number, Integer>> votes = new HashMap<>();

		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry e = it.next();
				if (!e.getName().endsWith(".class")) continue;
				try (InputStream is = jar.getInputStream(e))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
					if (cn.methods == null) continue;
					for (MethodNode mn : cn.methods)
					{
						if (mn.instructions == null) continue;
						collectVotes(mn, votes);
					}
				}
			}
		}

		// Pick the most-voted constant per field as the decoder.
		for (Map.Entry<String, Map<Number, Integer>> entry : votes.entrySet())
		{
			Map<Number, Integer> counts = entry.getValue();
			Number best = null;
			int bestCount = 0;
			for (Map.Entry<Number, Integer> c : counts.entrySet())
			{
				if (c.getValue() > bestCount)
				{
					bestCount = c.getValue();
					best = c.getKey();
				}
			}
			if (best == null) continue;
			// Single-site votes are accepted: in the obfuscator's modarith scheme the
			// multiplier is always odd with a unique modular inverse, so even one
			// `field * K` or `K; PUTFIELD f` site with odd K is strong evidence — and
			// the recompiled jar is a reference artifact only (see deobfuscator_role
			// memory), so the worst case of a coincidental match is a slightly-wrong
			// constant in source that doesn't run.
			// Decoder must be odd (otherwise no modular inverse exists mod 2^N).
			if (best instanceof Integer && ((Integer) best & 1) == 0) continue;
			if (best instanceof Long && (((Long) best) & 1L) == 0L) continue;
			fieldDecoders.put(entry.getKey(), best);
			fieldEncoders.put(entry.getKey(),
				best instanceof Integer
					? Integer.valueOf(modularInverseInt((Integer) best))
					: Long.valueOf(modularInverseLong((Long) best)));
		}
	}

	private void collectVotes(MethodNode mn, Map<String, Map<Number, Integer>> votes)
	{
		AbstractInsnNode insn = mn.instructions.getFirst();
		while (insn != null)
		{
			int op = insn.getOpcode();
			if (op == Opcodes.IMUL || op == Opcodes.LMUL)
			{
				boolean wantLong = op == Opcodes.LMUL;
				// Read-site vote: (GETFIELD f, LDC K, IMUL) → K is candidate D for f.
				Match m = matchAtMul(insn, wantLong);
				if (m != null)
				{
					votes.computeIfAbsent(m.fieldKey, k -> new HashMap<>())
						.merge(m.constant, 1, Integer::sum);
				}
				// Write-site vote: ([any value], LDC K, IMUL, PUTFIELD f) → K is the
				// encoder for f, so inverse(K) is candidate D. Captures fields that are
				// only ever WRITTEN (or written far more than read with `*D`), which the
				// read-only voting misses entirely.
				AbstractInsnNode next2 = realNextSkipMeta(insn);
				if (next2 instanceof FieldInsnNode
					&& (next2.getOpcode() == Opcodes.PUTFIELD || next2.getOpcode() == Opcodes.PUTSTATIC))
				{
					FieldInsnNode put = (FieldInsnNode) next2;
					if (fieldDescMatches(put, wantLong))
					{
						Number encoder = pickConstantOperand(insn, wantLong);
						if (encoder != null)
						{
							// The encoder must be odd to have a modular inverse — same
							// requirement we check post-vote for read constants. Reject
							// up front so we don't pollute the histogram with even
							// constants that can never be encoders.
							boolean odd = wantLong
								? (encoder.longValue() & 1L) != 0L
								: (encoder.intValue() & 1) != 0;
							if (odd)
							{
								Number candidateD = wantLong
									? (Number) Long.valueOf(modularInverseLong(encoder.longValue()))
									: (Number) Integer.valueOf(modularInverseInt(encoder.intValue()));
								String key = put.owner + "#" + put.name;
								votes.computeIfAbsent(key, k -> new HashMap<>())
									.merge(candidateD, 1, Integer::sum);
							}
						}
					}
				}
			}
			insn = insn.getNext();
		}
	}

	/** Returns the constant push (if any) among the two operand blocks feeding
	 *  {@code mul}. Order-insensitive: if either the top or the block below it pushes a
	 *  constant, returns that constant. Used for write-side encoder discovery where the
	 *  OTHER operand can be any value. */
	private static Number pickConstantOperand(AbstractInsnNode mul, boolean wantLong)
	{
		AbstractInsnNode top = realPrev(mul);
		if (top == null) return null;
		Number c = pickPushedConstant(top, wantLong);
		if (c != null) return c;
		// Top wasn't a constant — try the block below. Walk past the top's value-block
		// if we can identify one, then look at the next constant push.
		ValueBlock topBlock = identifyValueBlock(top);
		AbstractInsnNode prev = realPrev(topBlock != null ? topBlock.firstInsn : top);
		if (prev == null) return null;
		return pickPushedConstant(prev, wantLong);
	}

	/**
	 * Walk backwards from the IMUL/LMUL identifying two value-producing blocks (top of
	 * stack first, then the one below it). Each "block" is either a single constant push
	 * (LDC / ICONST_x / BIPUSH / SIPUSH / LCONST_x) or a field load (GETSTATIC, or
	 * ALOAD-then-GETFIELD as a paired unit). Returns the (field, constant) pair iff one
	 * block is a field load matching {@code wantLong} and the other is a constant push.
	 */
	private static Match matchAtMul(AbstractInsnNode mul, boolean wantLong)
	{
		ValueBlock top = identifyValueBlock(realPrev(mul));
		if (top == null) return null;
		ValueBlock bottom = identifyValueBlock(realPrev(top.firstInsn));
		if (bottom == null) return null;
		// Order-insensitive: try (bottom=field, top=const) and (bottom=const, top=field).
		if (bottom.field != null && top.constant != null
			&& fieldDescMatches(bottom.field, wantLong))
		{
			return new Match(bottom.field.owner + "#" + bottom.field.name, top.constant, top.firstInsn);
		}
		if (top.field != null && bottom.constant != null
			&& fieldDescMatches(top.field, wantLong))
		{
			return new Match(top.field.owner + "#" + top.field.name, bottom.constant, bottom.firstInsn);
		}
		return null;
	}

	/** A single stack-producing unit immediately preceding the IMUL — either a constant
	 *  push or a field load. {@code firstInsn} is the topmost-back instruction in the
	 *  block so the caller can continue scanning backwards from it. */
	private static final class ValueBlock
	{
		AbstractInsnNode firstInsn;
		FieldInsnNode field;
		Number constant;
	}

	private static ValueBlock identifyValueBlock(AbstractInsnNode last)
	{
		if (last == null) return null;
		ValueBlock vb = new ValueBlock();
		// Field load — instance variant has an owner-pushing insn just before it.
		if (last instanceof FieldInsnNode)
		{
			FieldInsnNode f = (FieldInsnNode) last;
			if (f.getOpcode() == Opcodes.GETSTATIC)
			{
				vb.field = f;
				vb.firstInsn = f;
				return vb;
			}
			if (f.getOpcode() == Opcodes.GETFIELD)
			{
				AbstractInsnNode owner = realPrev(f);
				if (owner == null) return null;
				// Only accept SIMPLE owner-loads: ALOAD (local), THIS (ALOAD 0), or
				// GETSTATIC (single insn that pushes a ref with no input). Chained owners
				// like AALOAD/CHECKCAST/INVOKE leave the previous scan ambiguous about
				// which "below" instruction is the multiplier constant (the array index
				// for an AALOAD owner gets misidentified as the multiplier).
				int oop = owner.getOpcode();
				boolean simpleOwner = oop == Opcodes.ALOAD
					|| oop == Opcodes.GETSTATIC;
				if (!simpleOwner) return null;
				vb.field = f;
				vb.firstInsn = owner;
				return vb;
			}
			return null;
		}
		// Constant push.
		Number c = pickPushedConstant(last, false);
		if (c == null) c = pickPushedConstant(last, true);
		if (c != null)
		{
			vb.constant = c;
			vb.firstInsn = last;
			return vb;
		}
		return null;
	}

	private static boolean fieldDescMatches(FieldInsnNode f, boolean wantLong)
	{
		return wantLong ? "J".equals(f.desc) : "I".equals(f.desc);
	}

	/**
	 * Tracks stack depth forward from {@code imul} until an instruction would pop our
	 * result (the IMUL's pushed value). If that consuming instruction is in the
	 * aggressive-strip-allowed set (typed RETURN / comparison / arithmetic op), returns
	 * true. Limited to 40 hops to bound search cost.
	 */
	private static boolean resultConsumedByAggressiveContext(AbstractInsnNode imul, boolean wantLong)
	{
		AbstractInsnNode cur = realNextSkipMeta(imul);
		int depth = 1;
		int hops = 0;
		while (cur != null && hops++ < 40)
		{
			int op = cur.getOpcode();
			int pops = stackPopsOf(cur);
			int pushes = stackPushesOf(cur);
			// If this op pops at least `depth` items, our value is among the popped
			// operands and we've found the consumer.
			if (pops >= depth)
			{
				return isAggressiveStripContext(op, wantLong);
			}
			depth = depth - pops + pushes;
			if (depth <= 0) return false; // shouldn't happen for valid bytecode
			cur = realNextSkipMeta(cur);
		}
		return false;
	}

	/** Best-effort pops count for the stack-tracking forward walk. Conservative: when we
	 *  hit an instruction we don't model precisely, we return a "consumes everything"
	 *  value so the walk terminates and assumes our IMUL result was consumed. */
	private static int stackPopsOf(AbstractInsnNode insn)
	{
		int op = insn.getOpcode();
		if (op == -1) return 0;
		if (insn instanceof org.objectweb.asm.tree.MethodInsnNode)
		{
			org.objectweb.asm.tree.MethodInsnNode m = (org.objectweb.asm.tree.MethodInsnNode) insn;
			int args = Type.getArgumentTypes(m.desc).length;
			int extra = (op == Opcodes.INVOKESTATIC || op == Opcodes.INVOKEDYNAMIC) ? 0 : 1;
			return args + extra;
		}
		if (insn instanceof org.objectweb.asm.tree.InvokeDynamicInsnNode)
		{
			org.objectweb.asm.tree.InvokeDynamicInsnNode i = (org.objectweb.asm.tree.InvokeDynamicInsnNode) insn;
			return Type.getArgumentTypes(i.desc).length;
		}
		if (insn instanceof FieldInsnNode)
		{
			if (op == Opcodes.GETSTATIC) return 0;
			if (op == Opcodes.GETFIELD) return 1;
			if (op == Opcodes.PUTSTATIC) return 1;
			if (op == Opcodes.PUTFIELD) return 2;
		}
		if (op >= Opcodes.ILOAD && op <= Opcodes.ALOAD) return 0;
		if (op >= Opcodes.ISTORE && op <= Opcodes.ASTORE) return 1;
		if (op >= Opcodes.IALOAD && op <= Opcodes.SALOAD) return 2;
		if (op >= Opcodes.IASTORE && op <= Opcodes.SASTORE) return 3;
		if (op == Opcodes.POP) return 1;
		if (op == Opcodes.POP2) return 2;
		if (op == Opcodes.DUP || op == Opcodes.DUP_X1 || op == Opcodes.DUP_X2) return 1;
		if (op == Opcodes.DUP2 || op == Opcodes.DUP2_X1 || op == Opcodes.DUP2_X2) return 2;
		if (op == Opcodes.SWAP) return 2;
		if (op >= Opcodes.ACONST_NULL && op <= Opcodes.SIPUSH) return 0;
		if (insn instanceof LdcInsnNode) return 0;
		// Arithmetic / comparison / typed-returns (LCMP etc.):
		if (op >= Opcodes.IADD && op <= Opcodes.DREM) return 2;
		if (op >= Opcodes.INEG && op <= Opcodes.DNEG) return 1;
		if (op >= Opcodes.ISHL && op <= Opcodes.LUSHR) return 2;
		if (op >= Opcodes.IAND && op <= Opcodes.LXOR) return 2;
		if (op == Opcodes.IINC) return 0;
		if (op >= Opcodes.I2L && op <= Opcodes.I2S) return 1;
		if (op == Opcodes.LCMP || op == Opcodes.FCMPL || op == Opcodes.FCMPG
			|| op == Opcodes.DCMPL || op == Opcodes.DCMPG) return 2;
		if (op >= Opcodes.IFEQ && op <= Opcodes.IFLE) return 1;
		if (op >= Opcodes.IF_ICMPEQ && op <= Opcodes.IF_ACMPNE) return 2;
		if (op == Opcodes.GOTO || op == Opcodes.JSR) return 0;
		if (op == Opcodes.RET) return 0;
		if (op == Opcodes.TABLESWITCH || op == Opcodes.LOOKUPSWITCH) return 1;
		if (op >= Opcodes.IRETURN && op <= Opcodes.ARETURN) return 1;
		if (op == Opcodes.RETURN) return 0;
		if (op == Opcodes.ATHROW) return 1;
		if (op == Opcodes.CHECKCAST || op == Opcodes.INSTANCEOF) return 1;
		if (op == Opcodes.MONITORENTER || op == Opcodes.MONITOREXIT) return 1;
		if (op == Opcodes.NEW) return 0;
		if (op == Opcodes.NEWARRAY || op == Opcodes.ANEWARRAY) return 1;
		if (op == Opcodes.ARRAYLENGTH) return 1;
		if (op == Opcodes.IFNULL || op == Opcodes.IFNONNULL) return 1;
		if (op == Opcodes.MULTIANEWARRAY)
		{
			return ((org.objectweb.asm.tree.MultiANewArrayInsnNode) insn).dims;
		}
		// Fallback: treat as consumes-everything so the walk terminates safely.
		return 1000;
	}

	/** Best-effort pushes count for the stack-tracking forward walk. */
	private static int stackPushesOf(AbstractInsnNode insn)
	{
		int op = insn.getOpcode();
		if (op == -1) return 0;
		if (insn instanceof org.objectweb.asm.tree.MethodInsnNode)
		{
			org.objectweb.asm.tree.MethodInsnNode m = (org.objectweb.asm.tree.MethodInsnNode) insn;
			return Type.getReturnType(m.desc).getSort() == Type.VOID ? 0 : 1;
		}
		if (insn instanceof org.objectweb.asm.tree.InvokeDynamicInsnNode)
		{
			org.objectweb.asm.tree.InvokeDynamicInsnNode i = (org.objectweb.asm.tree.InvokeDynamicInsnNode) insn;
			return Type.getReturnType(i.desc).getSort() == Type.VOID ? 0 : 1;
		}
		if (insn instanceof FieldInsnNode)
		{
			if (op == Opcodes.GETSTATIC || op == Opcodes.GETFIELD) return 1;
			if (op == Opcodes.PUTSTATIC || op == Opcodes.PUTFIELD) return 0;
		}
		if (op >= Opcodes.ILOAD && op <= Opcodes.ALOAD) return 1;
		if (op >= Opcodes.ISTORE && op <= Opcodes.ASTORE) return 0;
		if (op >= Opcodes.IALOAD && op <= Opcodes.SALOAD) return 1;
		if (op >= Opcodes.IASTORE && op <= Opcodes.SASTORE) return 0;
		if (op == Opcodes.POP || op == Opcodes.POP2) return 0;
		if (op == Opcodes.DUP || op == Opcodes.DUP_X1 || op == Opcodes.DUP_X2) return 2;
		if (op == Opcodes.DUP2 || op == Opcodes.DUP2_X1 || op == Opcodes.DUP2_X2) return 4;
		if (op == Opcodes.SWAP) return 2;
		if (op >= Opcodes.ACONST_NULL && op <= Opcodes.SIPUSH) return 1;
		if (insn instanceof LdcInsnNode) return 1;
		// Arithmetic / comparison / conversions:
		if (op >= Opcodes.IADD && op <= Opcodes.DREM) return 1;
		if (op >= Opcodes.INEG && op <= Opcodes.DNEG) return 1;
		if (op >= Opcodes.ISHL && op <= Opcodes.LUSHR) return 1;
		if (op >= Opcodes.IAND && op <= Opcodes.LXOR) return 1;
		if (op == Opcodes.IINC) return 0;
		if (op >= Opcodes.I2L && op <= Opcodes.I2S) return 1;
		if (op == Opcodes.LCMP || op == Opcodes.FCMPL || op == Opcodes.FCMPG
			|| op == Opcodes.DCMPL || op == Opcodes.DCMPG) return 1;
		if (op >= Opcodes.IFEQ && op <= Opcodes.IF_ACMPNE) return 0;
		if (op == Opcodes.GOTO || op == Opcodes.JSR) return 0;
		if (op == Opcodes.RET) return 0;
		if (op == Opcodes.TABLESWITCH || op == Opcodes.LOOKUPSWITCH) return 0;
		if (op >= Opcodes.IRETURN && op <= Opcodes.RETURN) return 0;
		if (op == Opcodes.ATHROW) return 0;
		if (op == Opcodes.CHECKCAST) return 1;
		if (op == Opcodes.INSTANCEOF) return 1;
		if (op == Opcodes.MONITORENTER || op == Opcodes.MONITOREXIT) return 0;
		if (op == Opcodes.NEW) return 1;
		if (op == Opcodes.NEWARRAY || op == Opcodes.ANEWARRAY) return 1;
		if (op == Opcodes.ARRAYLENGTH) return 1;
		if (op == Opcodes.IFNULL || op == Opcodes.IFNONNULL) return 0;
		if (op == Opcodes.MULTIANEWARRAY) return 1;
		return 0;
	}

	/** True if {@code opcode} is the typed RETURN that would consume the IMUL's result. */
	private static boolean isTypedReturnFor(int opcode, boolean wantLong)
	{
		return wantLong ? opcode == Opcodes.LRETURN : opcode == Opcodes.IRETURN;
	}

	/**
	 * Contexts where stripping `field * K` even when K isn't the resolved D is safe for
	 * the reference jar: typed RETURN (return-value decode), comparison jumps (algebraic
	 * comparison obfuscation), and arithmetic ops that consume the IMUL's result as a
	 * sub-expression (IADD/ISUB/IDIV/IMUL/IREM/IAND/IOR/IXOR/ISHL/ISHR/IUSHR).
	 */
	private static boolean isAggressiveStripContext(int opcode, boolean wantLong)
	{
		if (isTypedReturnFor(opcode, wantLong)) return true;
		if (opcode == Opcodes.IF_ICMPEQ || opcode == Opcodes.IF_ICMPNE
			|| opcode == Opcodes.IF_ICMPLT || opcode == Opcodes.IF_ICMPLE
			|| opcode == Opcodes.IF_ICMPGT || opcode == Opcodes.IF_ICMPGE
			|| opcode == Opcodes.IF_ACMPEQ || opcode == Opcodes.IF_ACMPNE) return true;
		if (wantLong)
		{
			return opcode == Opcodes.LADD || opcode == Opcodes.LSUB
				|| opcode == Opcodes.LMUL || opcode == Opcodes.LDIV
				|| opcode == Opcodes.LREM || opcode == Opcodes.LAND
				|| opcode == Opcodes.LOR || opcode == Opcodes.LXOR
				|| opcode == Opcodes.LSHL || opcode == Opcodes.LSHR
				|| opcode == Opcodes.LUSHR || opcode == Opcodes.LCMP;
		}
		return opcode == Opcodes.IADD || opcode == Opcodes.ISUB
			|| opcode == Opcodes.IMUL || opcode == Opcodes.IDIV
			|| opcode == Opcodes.IREM || opcode == Opcodes.IAND
			|| opcode == Opcodes.IOR || opcode == Opcodes.IXOR
			|| opcode == Opcodes.ISHL || opcode == Opcodes.ISHR
			|| opcode == Opcodes.IUSHR;
	}

	/**
	 * Checks the two stack-producing blocks feeding {@code mul}; returns the constant-push
	 * instruction iff one of them is a constant equal to {@code encoder}. Used for the
	 * PUTFIELD-write rewrite, where the OTHER operand can be any expression (a local-load,
	 * a chained expression, a field read of a different field, etc.) — we only need to
	 * confirm one operand is the encoder.
	 */
	private static AbstractInsnNode constantOperandMatchesEncoder(AbstractInsnNode mul, Number encoder, boolean wantLong)
	{
		AbstractInsnNode top = realPrev(mul);
		AbstractInsnNode bottom = top == null ? null : skipValueBlock(realPrev(top));
		if (top == null) return null;
		if (isMatchingConstant(top, encoder, wantLong)) return top;
		AbstractInsnNode topBlockStart = identifyValueBlock(top) == null ? top : identifyValueBlock(top).firstInsn;
		AbstractInsnNode bot = realPrev(topBlockStart);
		if (bot != null && isMatchingConstant(bot, encoder, wantLong)) return bot;
		// Bottom block could also be a non-constant value (e.g. ILOAD) — that's fine for
		// the write-rewrite, just means the encoder is the `top` we already checked.
		return null;
	}

	private static boolean isMatchingConstant(AbstractInsnNode insn, Number encoder, boolean wantLong)
	{
		Number c = pickPushedConstant(insn, wantLong);
		return c != null && constantsEqual(c, encoder);
	}

	/** If {@code n} is the last insn of an identifiable value-block (constant push or
	 *  field load), returns the insn BEFORE that block. Otherwise returns n itself. */
	private static AbstractInsnNode skipValueBlock(AbstractInsnNode n)
	{
		if (n == null) return null;
		ValueBlock vb = identifyValueBlock(n);
		return vb == null ? n : realPrev(vb.firstInsn);
	}

	/**
	 * Detects a compound-assignment shape ending at {@code put} (PUTFIELD/PUTSTATIC f),
	 * with prev being an arithmetic op (IADD/ISUB/etc.) whose operands are (GETFIELD f,
	 * constant K). Replaces K with {@code K * D} (mod 2^32 / 2^64) so the decompiled
	 * source recovers the original source-level delta. Returns true on rewrite.
	 *
	 * <p>The PUTFIELD's <i>same-field</i> match is what makes this safe: only matching
	 * when load+store are the same field rules out ordinary `f = g + K` patterns where
	 * the load is a different field whose decoder doesn't apply.</p>
	 */
	private static boolean rewriteCompoundAssignmentDelta(MethodNode mn, FieldInsnNode put, Number decoder)
	{
		boolean wantLong = put.desc.equals("J");
		AbstractInsnNode arith = realPrev(put);
		if (arith == null) return false;
		if (!isCompoundArithOp(arith.getOpcode(), wantLong)) return false;

		AbstractInsnNode constInsn = realPrev(arith);
		if (constInsn == null) return false;
		Number k = pickPushedConstant(constInsn, wantLong);
		if (k == null) return false;

		AbstractInsnNode get = realPrev(constInsn);
		if (!(get instanceof FieldInsnNode)) return false;
		FieldInsnNode g = (FieldInsnNode) get;
		if (!g.owner.equals(put.owner) || !g.name.equals(put.name)) return false;
		boolean isStaticPair = put.getOpcode() == Opcodes.PUTSTATIC
			&& g.getOpcode() == Opcodes.GETSTATIC;
		boolean isInstancePair = put.getOpcode() == Opcodes.PUTFIELD
			&& g.getOpcode() == Opcodes.GETFIELD;
		if (!isStaticPair && !isInstancePair) return false;

		// Replace the constant push with a new push of K * D (mod 2^32 / 2^64).
		AbstractInsnNode replacement;
		if (wantLong)
		{
			long decoded = k.longValue() * decoder.longValue();
			replacement = new LdcInsnNode(decoded);
		}
		else
		{
			int decoded = k.intValue() * decoder.intValue();
			replacement = makeIntPush(decoded);
		}
		mn.instructions.set(constInsn, replacement);
		return true;
	}

	private static boolean isCompoundArithOp(int opcode, boolean wantLong)
	{
		if (wantLong)
		{
			return opcode == Opcodes.LADD || opcode == Opcodes.LSUB
				|| opcode == Opcodes.LMUL || opcode == Opcodes.LDIV
				|| opcode == Opcodes.LAND || opcode == Opcodes.LOR
				|| opcode == Opcodes.LXOR;
		}
		return opcode == Opcodes.IADD || opcode == Opcodes.ISUB
			|| opcode == Opcodes.IMUL || opcode == Opcodes.IDIV
			|| opcode == Opcodes.IAND || opcode == Opcodes.IOR
			|| opcode == Opcodes.IXOR;
	}

	/**
	 * Strips `field * K` patterns from either or both operand slots of an equality jump
	 * (IF_ICMPEQ/NE/IF_ACMPEQ/NE), when the field has a resolved decoder. The constant K
	 * doesn't have to match the decoder — by the time we know the field is encoded, any
	 * IMUL on it inside a comparison is obfuscation noise (see method-level javadoc on
	 * the call site).
	 *
	 * <p>Operand walking: the top of stack right before the jump is the right operand;
	 * the next value-block back is the left. Each operand may end with an IMUL whose
	 * operands are (field-load, constant). For each such operand we erase the LDC and
	 * the IMUL, leaving just the field-load.</p>
	 */
	private void stripEqualityComparisonMultipliers(MethodNode mn, AbstractInsnNode jump)
	{
		// Right operand: ends at realPrev(jump). May be an IMUL `field * K`.
		AbstractInsnNode rightLast = realPrev(jump);
		AbstractInsnNode leftLastSearchStart = rightLast;
		if (rightLast != null && rightLast.getOpcode() == Opcodes.IMUL)
		{
			Match m = matchAtMul(rightLast, false);
			if (m != null && fieldDecoders.containsKey(m.fieldKey))
			{
				mn.instructions.remove(m.constantInsn);
				mn.instructions.remove(rightLast);
				rewroteComparisonNoise++;
				// After the strip the new right-operand-end is the field's GETFIELD/GETSTATIC.
				leftLastSearchStart = realPrev(jump);
			}
		}
		// Identify the right-operand value-block so we can step past it to find the
		// left-operand's final instruction.
		if (leftLastSearchStart == null) return;
		ValueBlock rightBlock = identifyValueBlock(leftLastSearchStart);
		AbstractInsnNode leftLast = rightBlock == null
			? realPrev(leftLastSearchStart)
			: realPrev(rightBlock.firstInsn);
		if (leftLast != null && leftLast.getOpcode() == Opcodes.IMUL)
		{
			Match m = matchAtMul(leftLast, false);
			if (m != null && fieldDecoders.containsKey(m.fieldKey))
			{
				mn.instructions.remove(m.constantInsn);
				mn.instructions.remove(leftLast);
				rewroteComparisonNoise++;
			}
		}
	}

	/** Picks the smallest-encoding int push for the given value (ICONST_x / BIPUSH /
	 *  SIPUSH / LDC). Keeps the bytecode as compact as the obfuscator's choice would. */
	private static AbstractInsnNode makeIntPush(int value)
	{
		if (value >= -1 && value <= 5)
		{
			return new InsnNode(Opcodes.ICONST_0 + value);
		}
		if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE)
		{
			return new IntInsnNode(Opcodes.BIPUSH, value);
		}
		if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE)
		{
			return new IntInsnNode(Opcodes.SIPUSH, value);
		}
		return new LdcInsnNode(value);
	}

	/** Returns the count of rewritten read sites. */
	public long rewroteReads()
	{
		return rewroteReads;
	}

	/** Returns the count of rewritten write sites. */
	public long rewroteWrites()
	{
		return rewroteWrites;
	}

	/** Returns the count of rewritten compound-assignment delta constants. */
	public long rewroteIncrements()
	{
		return rewroteIncrements;
	}

	/** Returns the count of `field * K` patterns stripped from equality-comparison sites
	 *  where K wasn't the field's decoder (algebraic-comparison obfuscation noise). */
	public long rewroteComparisonNoise()
	{
		return rewroteComparisonNoise;
	}

	/** Returns the count of fields whose decoder we resolved. */
	public long resolvedDecoderCount()
	{
		return fieldDecoders.size();
	}

	/** Returns the count of fields we stamped with the decoder annotation. */
	public long annotatedFieldCount()
	{
		return annotatedFields;
	}

	/**
	 * Stamps every field in the given class whose decoder we resolved with an
	 * {@code @ObfuscatedGetter(intValue=D)} / {@code longValue=D} annotation. Callers that
	 * need to reconstruct the raw on-wire encoded value (e.g. when parsing packets the
	 * server sends with the same encoding) can read the decoder back out of the
	 * annotation at runtime via reflection. Call once per class after sanitization.
	 */
	public void annotateFields(ClassNode cn)
	{
		if (cn.fields == null || fieldDecoders.isEmpty()) return;
		for (FieldNode fn : cn.fields)
		{
			String key = cn.name + "#" + fn.name;
			Number decoder = fieldDecoders.get(key);
			if (decoder == null) continue;
			// Don't stamp twice if a prior pass already annotated.
			if (fn.visibleAnnotations != null)
			{
				boolean already = false;
				for (AnnotationNode existing : fn.visibleAnnotations)
				{
					if (OBFUSCATED_GETTER_DESC.equals(existing.desc))
					{
						already = true;
						break;
					}
				}
				if (already) continue;
			}
			AnnotationNode an = new AnnotationNode(OBFUSCATED_GETTER_DESC);
			an.values = new java.util.ArrayList<>();
			if (decoder instanceof Long)
			{
				an.values.add("longValue");
				an.values.add(decoder.longValue());
			}
			else
			{
				an.values.add("intValue");
				an.values.add(decoder.intValue());
			}
			if (fn.visibleAnnotations == null)
			{
				fn.visibleAnnotations = new java.util.ArrayList<>();
			}
			fn.visibleAnnotations.add(an);
			annotatedFields++;
		}
	}

	/**
	 * Applies read-site and write-site rewrites to the given method based on the
	 * decoder map discovered in {@link #analyze(Path)}. Safe to call before analyze
	 * (no-op).
	 */
	public void applyToMethod(MethodNode mn)
	{
		if (mn.instructions == null || mn.instructions.size() == 0) return;
		if (fieldDecoders.isEmpty()) return;

		AbstractInsnNode insn = mn.instructions.getFirst();
		while (insn != null)
		{
			AbstractInsnNode next = insn.getNext();
			int op = insn.getOpcode();
			// Algebraic-comparison noise. The obfuscator wraps `a CMP b` (for any
			// comparison op) as `a CMP b * K` or `a * K CMP b` for arbitrary K. For the
			// reference jar we strip the multipliers regardless of the comparison op
			// because the source-intent on both sides was always the same field. We do
			// this for fields whose decoder we already resolved (i.e. the obfuscator
			// confirmed-encoded them) so legitimate source-level multiplications on
			// plain integer fields aren't touched. Covers ==/!=/<,<=,>,>= and acmp.
			if (op == Opcodes.IF_ICMPEQ || op == Opcodes.IF_ICMPNE
				|| op == Opcodes.IF_ICMPLT || op == Opcodes.IF_ICMPLE
				|| op == Opcodes.IF_ICMPGT || op == Opcodes.IF_ICMPGE
				|| op == Opcodes.IF_ACMPEQ || op == Opcodes.IF_ACMPNE)
			{
				stripEqualityComparisonMultipliers(mn, insn);
			}
			// Compound-assignment decoder. The bytecode shape is
			//   [push owner]; DUP; GETFIELD f; LDC K; IADD/ISUB; PUTFIELD f
			// where K = N*E (E = encoder, N = original source delta). Replacing K with
			// (K * D) recovers N, so the decompiled source becomes `f += N` instead of
			// `f += K`. Same logic for static fields with GETSTATIC/PUTSTATIC. We also
			// accept IMUL/IDIV/IXOR/IAND/IOR variants since the obfuscator may use any
			// commutative-ish op in conjunction with the encoded constant.
			if (insn instanceof FieldInsnNode
				&& (op == Opcodes.PUTFIELD || op == Opcodes.PUTSTATIC))
			{
				FieldInsnNode put = (FieldInsnNode) insn;
				Number decoder = fieldDecoders.get(put.owner + "#" + put.name);
				if (decoder != null && rewriteCompoundAssignmentDelta(mn, put, decoder))
				{
					rewroteIncrements++;
					insn = next;
					continue;
				}
			}
			if (op == Opcodes.IMUL || op == Opcodes.LMUL)
			{
				// Read-side: strict match — `(field, constant) IMUL` where constant
				// equals the field's resolved decoder D. Strip the constant push and the
				// IMUL.
				Match m = matchAtMul(insn, op == Opcodes.LMUL);
				if (m != null)
				{
					Number decoder = fieldDecoders.get(m.fieldKey);
					if (decoder != null && constantsEqual(decoder, m.constant))
					{
						mn.instructions.remove(m.constantInsn);
						mn.instructions.remove(insn);
						rewroteReads++;
						insn = next;
						continue;
					}
				}
				// Aggressive strip in safe contexts: when the IMUL's result is
				// ULTIMATELY consumed by a typed RETURN, an arithmetic op
				// (IADD/ISUB/IDIV/etc.), or a comparison (IF_ICMP*), strip the IMUL
				// regardless of whether K equals our resolved D. We track stack depth
				// forward from the IMUL so chained expressions like
				// `K1*F1 + K2*F2 + ...` correctly identify IADD as the eventual
				// consumer of the first IMUL even with intermediate IMULs in between.
				// We fire whenever EITHER (a) the field has a resolved decoder, OR
				// (b) the multiplier constant is odd (the obfuscator only uses odd
				// multipliers because the modular-inverse encoding requires it).
				// Path (b) catches fields where the vote-collector couldn't resolve a
				// single decoder due to many competing multipliers, but the field is
				// still clearly part of the obfuscation scheme.
				if (m != null && resultConsumedByAggressiveContext(insn, op == Opcodes.LMUL))
				{
					boolean hasDecoder = fieldDecoders.containsKey(m.fieldKey);
					boolean oddConstant = op == Opcodes.LMUL
						? (m.constant.longValue() & 1L) != 0L
						: (m.constant.intValue() & 1) != 0;
					if (hasDecoder || oddConstant)
					{
						mn.instructions.remove(m.constantInsn);
						mn.instructions.remove(insn);
						rewroteReads++;
						insn = next;
						continue;
					}
				}
				// Write-side: `(any value, encoder) IMUL; PUTFIELD f`. Independent of the
				// shape of the value-producing operand — common shapes are local-loads
				// (`var1 * 167742821`), expression results, or even other field reads. The
				// signal is purely "IMUL with E as one operand, immediately followed by
				// PUTFIELD f".
				AbstractInsnNode next2 = realNextSkipMeta(insn);
				if (next2 instanceof FieldInsnNode
					&& (next2.getOpcode() == Opcodes.PUTFIELD || next2.getOpcode() == Opcodes.PUTSTATIC))
				{
					FieldInsnNode put = (FieldInsnNode) next2;
					Number encoder = fieldEncoders.get(put.owner + "#" + put.name);
					if (encoder != null && constantOperandMatchesEncoder(insn, encoder, op == Opcodes.LMUL) != null)
					{
						AbstractInsnNode encoderInsn = constantOperandMatchesEncoder(insn, encoder, op == Opcodes.LMUL);
						mn.instructions.remove(encoderInsn);
						mn.instructions.remove(insn);
						rewroteWrites++;
					}
				}
			}
			insn = next;
		}
	}

	private static final class Match
	{
		final String fieldKey;
		final Number constant;
		final AbstractInsnNode constantInsn;
		Match(String fieldKey, Number constant, AbstractInsnNode constantInsn)
		{
			this.fieldKey = fieldKey;
			this.constant = constant;
			this.constantInsn = constantInsn;
		}
	}

	private static Number pickPushedConstant(AbstractInsnNode n, boolean wantLong)
	{
		if (n == null) return null;
		int op = n.getOpcode();
		if (wantLong)
		{
			if (op == Opcodes.LCONST_0) return 0L;
			if (op == Opcodes.LCONST_1) return 1L;
			if (n instanceof LdcInsnNode && ((LdcInsnNode) n).cst instanceof Long)
			{
				return (Long) ((LdcInsnNode) n).cst;
			}
			return null;
		}
		if (op >= Opcodes.ICONST_M1 && op <= Opcodes.ICONST_5)
		{
			return op - Opcodes.ICONST_0;
		}
		if (n instanceof IntInsnNode && (op == Opcodes.BIPUSH || op == Opcodes.SIPUSH))
		{
			return ((IntInsnNode) n).operand;
		}
		if (n instanceof LdcInsnNode && ((LdcInsnNode) n).cst instanceof Integer)
		{
			return (Integer) ((LdcInsnNode) n).cst;
		}
		return null;
	}

	private static boolean constantsEqual(Number a, Number b)
	{
		if (a instanceof Long || b instanceof Long) return a.longValue() == b.longValue();
		return a.intValue() == b.intValue();
	}

	private static AbstractInsnNode realPrev(AbstractInsnNode n)
	{
		AbstractInsnNode cur = n.getPrevious();
		while (cur != null && cur.getOpcode() < 0) cur = cur.getPrevious();
		return cur;
	}

	private static AbstractInsnNode realNextSkipMeta(AbstractInsnNode n)
	{
		AbstractInsnNode cur = n.getNext();
		while (cur != null && cur.getOpcode() < 0) cur = cur.getNext();
		return cur;
	}

	/**
	 * Modular inverse of an odd 32-bit value mod 2^32, via Newton iteration. For odd a,
	 * {@code x_{k+1} = x_k * (2 - a*x_k) mod 2^32} doubles correct bits per step, so 5
	 * iterations suffices for 32 bits.
	 */
	public static int modularInverseInt(int a)
	{
		int x = a;
		for (int i = 0; i < 5; i++) x = x * (2 - a * x);
		return x;
	}

	/** Modular inverse of an odd 64-bit value mod 2^64; 6 Newton iterations cover 64 bits. */
	public static long modularInverseLong(long a)
	{
		long x = a;
		for (int i = 0; i < 6; i++) x = x * (2L - a * x);
		return x;
	}
}
