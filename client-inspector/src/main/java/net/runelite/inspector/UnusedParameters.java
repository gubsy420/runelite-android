package net.runelite.inspector;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Strips garbage trailing parameters added by the obfuscator. The obfuscator extends method
 * signatures with an unused trailing parameter (typically an int/byte constant), and every
 * call site passes a random value for it. Removing the parameter cleans up call sites like:
 * <pre>
 *   gi.ak(jb.az_fld, aq_fld.av_fld, (byte)-126);  →  gi.ak(jb.az_fld, aq_fld.av_fld);
 *   var3.ay_fld.bc(var1, 1518031791);             →  var3.ay_fld.bc(var1);
 * </pre>
 *
 * <h2>Safety constraints</h2>
 * <ol>
 *   <li>Only consider methods declared in our jar. Stdlib / runelite-api signatures stay
 *       fixed because we can't rewrite their callers OR their declarations.</li>
 *   <li>Only consider {@code static} or {@code private} methods — they have no virtual
 *       overrides, so the descriptor change is local. Future extension can handle final
 *       classes / methods with full child analysis.</li>
 *   <li>The trailing param must be unread in the body (no ILOAD/ALOAD/etc. for that LVT
 *       slot, no IINC).</li>
 *   <li>The trailing param's type must be a primitive (I/J/B/S/C/F/D) — the obfuscator's
 *       garbage params are always primitives, and primitive constant pushes are
 *       trivially identifiable and removable at call sites.</li>
 *   <li>Every call site must push the trailing arg via a SIMPLE constant instruction
 *       (LDC / ICONST_x / BIPUSH / SIPUSH / LCONST_x / FCONST_x / DCONST_x). If any
 *       caller computes the arg with side-effect-bearing code, we abandon the rewrite
 *       to avoid changing program semantics.</li>
 *   <li>Skip {@code <init>}, {@code <clinit>}, and methods with the obfuscator-injected
 *       `throws java.lang.Exception` already stripped via the surrounding sanitizer
 *       passes (handled by checking the actual member set).</li>
 * </ol>
 *
 * <h2>Algorithm</h2>
 * <ol>
 *   <li><b>Analyze:</b> walk the jar twice. First pass collects each method's signature
 *       and computes unread params; second pass validates every call site against the
 *       candidate list, rejecting candidates whose callers compute the arg dynamically.</li>
 *   <li><b>Apply:</b> per-class, update the descriptor of every approved method (drop
 *       the trailing primitive type from the descriptor string), and rewrite every
 *       INVOKE* matching an approved method by removing the trailing constant push
 *       and updating the invoke's descriptor.</li>
 * </ol>
 */
public final class UnusedParameters
{
	/** Approved methods → unread last-param count (we only strip 1 at a time for now). */
	private final Set<String> strippableMethods = new HashSet<>();
	/** Original descriptor per stripped method (used at call sites to compute the new desc). */
	private final Map<String, String> originalDescriptors = new HashMap<>();
	/** All declared methods (owner+name+desc) in the jar — used to skip strips that would
	 *  collide with an existing same-owner/name method that has the post-strip descriptor. */
	private final Set<String> allDeclared = new HashSet<>();
	/** class → list of declared method (name+desc) strings, for fast hierarchy lookups. */
	private final Map<String, List<String>> classMethodSigs = new HashMap<>();
	/** class → superclass internal name. */
	private final Map<String, String> classSupers = new HashMap<>();
	/** class → list of directly-declared interface internal names. */
	private final Map<String, List<String>> classDirectInterfaces = new HashMap<>();

	private long strippedMethodSignatures;
	private long rewrittenCallSites;
	private long candidatesRejectedByDynamicCallSite;

	public long strippedMethodSignatures()
	{
		return strippedMethodSignatures;
	}

	public long rewrittenCallSites()
	{
		return rewrittenCallSites;
	}

	public long candidatesRejectedByDynamicCallSite()
	{
		return candidatesRejectedByDynamicCallSite;
	}

	/**
	 * Two-pass jar analysis: identifies methods whose trailing param is unread AND
	 * passed via constant at every call site. Populates {@link #strippableMethods}.
	 */
	/** Classes whose instance methods implement external (non-jar) interface contracts —
	 *  we keep those signatures fixed. Pre-built once by the caller and passed in. */
	private Set<String> externalContractClasses = java.util.Collections.emptySet();

	public void analyze(Path jarPath, Set<String> methodRefTargets, Set<String> externalContractClasses) throws IOException
	{
		this.externalContractClasses = externalContractClasses;
		analyze(jarPath, methodRefTargets);
	}

	public void analyze(Path jarPath, Set<String> methodRefTargets) throws IOException
	{
		// Pass 1: find all candidate methods (static/private, unread trailing primitive param).
		Map<String, String> declared = new HashMap<>(); // key → descriptor
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
					if (cn.superName != null) classSupers.put(cn.name, cn.superName);
					if (cn.interfaces != null && !cn.interfaces.isEmpty())
					{
						classDirectInterfaces.put(cn.name, new ArrayList<>(cn.interfaces));
					}
					List<String> sigs = new ArrayList<>();
					classMethodSigs.put(cn.name, sigs);
					for (MethodNode mn : cn.methods)
					{
						String key = cn.name + "#" + mn.name + mn.desc;
						declared.put(key, mn.desc);
						allDeclared.add(key);
						sigs.add(mn.name + mn.desc);
						if (!isCandidate(cn, mn, methodRefTargets)) continue;
						if (lastParamIsUnreadPrimitive(mn))
						{
							strippableMethods.add(key);
							originalDescriptors.put(key, mn.desc);
						}
					}
				}
			}
		}
		// Pass 2: validate every call site. If any call site for a candidate pushes the
		// trailing arg via something that isn't a simple constant, drop the candidate.
		Set<String> rejected = new HashSet<>();
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
						for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext())
						{
							if (!(insn instanceof MethodInsnNode)) continue;
							MethodInsnNode min = (MethodInsnNode) insn;
							String calleeKey = min.owner + "#" + min.name + min.desc;
							if (!strippableMethods.contains(calleeKey)) continue;
							if (rejected.contains(calleeKey)) continue;
							AbstractInsnNode prev = realPrev(insn);
							if (prev == null || !isSimpleConstantPush(prev))
							{
								rejected.add(calleeKey);
							}
						}
					}
				}
			}
		}
		strippableMethods.removeAll(rejected);
		for (String r : rejected) originalDescriptors.remove(r);
		candidatesRejectedByDynamicCallSite = rejected.size();
		// Pass 3: reject any candidate whose post-strip (name+args) would collide with a
		// method anywhere in the candidate's class hierarchy (own class, supers, subclasses,
		// interfaces). Bytecode allows return-type overloads (e.g. `ag(I)I` and `ag(I)Lyb;`)
		// but javac doesn't — once two methods on the same effective namespace share the
		// name+args portion, recompile errors. The walk covers:
		//   - the owner class itself
		//   - all super-classes (instance and static descendants share the namespace)
		//   - all sub-classes (any descendant's `hc()` competes with the stripped `hc(I)`'s
		//     new shape on the parent)
		//   - implemented + extended interfaces (interfaces declare the abstract SAM; an
		//     impl whose post-strip shape matches becomes an attempted implementation)
		Map<String, Set<String>> subclasses = new HashMap<>();
		for (Map.Entry<String, String> e : classSupers.entrySet())
		{
			subclasses.computeIfAbsent(e.getValue(), k -> new HashSet<>()).add(e.getKey());
		}
		for (Map.Entry<String, List<String>> e : classDirectInterfaces.entrySet())
		{
			for (String iface : e.getValue())
			{
				subclasses.computeIfAbsent(iface, k -> new HashSet<>()).add(e.getKey());
			}
		}
		Set<String> collisions = new HashSet<>();
		for (String key : strippableMethods)
		{
			int hash = key.indexOf('#');
			int parenOpen = key.indexOf('(', hash);
			String owner = key.substring(0, hash);
			String name = key.substring(hash + 1, parenOpen);
			String origDesc = originalDescriptors.get(key);
			String strippedDesc = stripLastArg(origDesc);
			String strippedNameArgs = name + nameAndArgsOnly(strippedDesc);
			String origNameArgs = name + nameAndArgsOnly(origDesc);
			Set<String> hierarchy = collectHierarchy(owner, subclasses);
			// Reject if any class in the hierarchy has a method with our post-strip
			// name+args (collision).
			if (anyMatchExceptSelf(hierarchy, strippedNameArgs, key)
				|| anyMatchExceptSelf(hierarchy, origNameArgs, key))
			{
				collisions.add(key);
			}
		}
		strippableMethods.removeAll(collisions);
		for (String c : collisions) originalDescriptors.remove(c);
		// Pass 4: expand the call-site rewrite map to include INVOKEVIRTUAL through
		// subclass types. Virtual call bytecode encodes the static receiver type at the
		// call site (e.g. `INVOKEVIRTUAL xj.cd(ZI)V`), and the JVM resolves to the parent's
		// method at runtime. If we strip xi.cd(ZI)V, calls written as xj.cd(ZI)V still need
		// the trailing arg dropped — otherwise javac sees a 2-arg call to the 1-arg xi.cd.
		Map<String, String> virtualAliases = new HashMap<>();
		for (String key : strippableMethods)
		{
			int hash = key.indexOf('#');
			String owner = key.substring(0, hash);
			String nameDesc = key.substring(hash + 1);
			for (String subOwner : collectSubclasses(owner, subclasses))
			{
				if (subOwner.equals(owner)) continue;
				String aliasKey = subOwner + "#" + nameDesc;
				if (!allDeclared.contains(aliasKey))
				{
					// Only register if the subclass doesn't redeclare with the same desc
					// (which would mean a separate stripped/non-stripped method).
					virtualAliases.put(aliasKey, key);
				}
			}
		}
		for (Map.Entry<String, String> e : virtualAliases.entrySet())
		{
			originalDescriptors.put(e.getKey(), originalDescriptors.get(e.getValue()));
		}
	}

	private Set<String> collectSubclasses(String owner, Map<String, Set<String>> subclasses)
	{
		Set<String> result = new HashSet<>();
		java.util.ArrayDeque<String> q = new java.util.ArrayDeque<>();
		q.add(owner);
		while (!q.isEmpty())
		{
			String cur = q.removeFirst();
			if (!result.add(cur)) continue;
			Set<String> subs = subclasses.get(cur);
			if (subs != null) q.addAll(subs);
		}
		return result;
	}

	/**
	 * Walks the owner's transitive hierarchy in two directions: ancestors-only (supers +
	 * interfaces going up) and descendants-only (subclasses going down). The two walks
	 * are kept separate so we don't traverse from an ancestor down into its OTHER
	 * descendants — e.g. when xi extends vw and vw implements Node, walking up to Node
	 * then down via Node's subclasses would pull in essentially every Node-implementing
	 * class in the jar, almost all of which are unrelated to xi for override-collision
	 * purposes.
	 */
	private Set<String> collectHierarchy(String owner, Map<String, Set<String>> subclasses)
	{
		Set<String> seen = new HashSet<>();
		// Ancestors: chase supers + interfaces going up only.
		java.util.ArrayDeque<String> q = new java.util.ArrayDeque<>();
		q.add(owner);
		while (!q.isEmpty())
		{
			String cur = q.removeFirst();
			if (!seen.add(cur)) continue;
			String sup = classSupers.get(cur);
			if (sup != null) q.add(sup);
			List<String> ifs = classDirectInterfaces.get(cur);
			if (ifs != null) q.addAll(ifs);
		}
		// Descendants: chase subclasses going down only.
		q.add(owner);
		Set<String> downSeen = new HashSet<>();
		while (!q.isEmpty())
		{
			String cur = q.removeFirst();
			if (!downSeen.add(cur)) continue;
			seen.add(cur);
			Set<String> subs = subclasses.get(cur);
			if (subs != null) q.addAll(subs);
		}
		return seen;
	}

	/** True if any class in {@code hierarchy} declares a method whose name+args portion
	 *  matches {@code strippedNameArgs}, excluding the candidate itself ({@code selfKey}). */
	private boolean anyMatchExceptSelf(Set<String> hierarchy, String strippedNameArgs, String selfKey)
	{
		for (String cls : hierarchy)
		{
			List<String> sigs = classMethodSigs.get(cls);
			if (sigs == null) continue;
			for (String sig : sigs)
			{
				String candidateKey = cls + "#" + sig;
				if (candidateKey.equals(selfKey)) continue;
				// sig is name + desc — extract name+args portion.
				int parenOpen = sig.indexOf('(');
				int parenClose = sig.indexOf(')');
				String sigName = sig.substring(0, parenOpen);
				String sigArgs = sig.substring(parenOpen, parenClose + 1);
				if ((sigName + sigArgs).equals(strippedNameArgs)) return true;
				// Also consider this sig's post-strip projection (when ANOTHER strippable
				// method ends up at the same name+args).
				if (strippableMethods.contains(candidateKey))
				{
					String sigStrippedDesc = stripLastArg(sig.substring(sig.indexOf('(')));
					if ((sigName + nameAndArgsOnly(sigStrippedDesc)).equals(strippedNameArgs)) return true;
				}
			}
		}
		return false;
	}

	/** Returns the "(args)" part of a method descriptor (drops the return type). */
	private static String nameAndArgsOnly(String desc)
	{
		int closeParen = desc.indexOf(')');
		return desc.substring(0, closeParen + 1);
	}

	private boolean isCandidate(ClassNode cn, MethodNode mn, Set<String> methodRefTargets)
	{
		if ("<init>".equals(mn.name) || "<clinit>".equals(mn.name)) return false;
		boolean isStatic = (mn.access & Opcodes.ACC_STATIC) != 0;
		boolean isPrivate = (mn.access & Opcodes.ACC_PRIVATE) != 0;
		// Instance methods of classes that implement an external (non-jar) interface
		// have fixed signature contracts we can't widen — skip.
		if (!isStatic && !isPrivate && externalContractClasses.contains(cn.name)) return false;
		// Method-ref targets must keep their exact signature for the lambda metafactory
		// bind to type-check at the SAM target.
		String key = cn.name + "#" + mn.name + mn.desc;
		if (methodRefTargets.contains(key)) return false;
		// Abstract / native methods have no body to verify reads against.
		if ((mn.access & (Opcodes.ACC_ABSTRACT | Opcodes.ACC_NATIVE)) != 0) return false;
		Type[] argTypes = Type.getArgumentTypes(mn.desc);
		if (argTypes.length == 0) return false;
		Type last = argTypes[argTypes.length - 1];
		switch (last.getSort())
		{
			case Type.BOOLEAN:
			case Type.BYTE:
			case Type.CHAR:
			case Type.SHORT:
			case Type.INT:
			case Type.LONG:
			case Type.FLOAT:
			case Type.DOUBLE:
				return true;
			default:
				return false;
		}
	}

	/**
	 * True if no instruction in the method reads the LVT slot occupied by the last
	 * parameter <i>in a way that survives the rest of the sanitizer's passes</i>. Plain
	 * reads count, except for reads that feed the obfuscator's anti-tamper
	 * {@code if (param ? something) throw new IllegalStateException} pattern — those are
	 * eliminated by {@code elideIllegalStateExceptionThrows} later in the pipeline and
	 * so don't represent a "real" use of the param. We mirror the same structural
	 * detection inline here so analyze() reaches the right conclusion without depending
	 * on the elide step having already run.
	 */
	private boolean lastParamIsUnreadPrimitive(MethodNode mn)
	{
		Type[] argTypes = Type.getArgumentTypes(mn.desc);
		int lvtIndex = ((mn.access & Opcodes.ACC_STATIC) != 0) ? 0 : 1;
		for (int i = 0; i < argTypes.length - 1; i++)
		{
			lvtIndex += argTypes[i].getSize();
		}
		if (mn.instructions == null) return true;
		for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext())
		{
			if (insn instanceof VarInsnNode)
			{
				VarInsnNode vin = (VarInsnNode) insn;
				if (vin.var == lvtIndex && !readFeedsIseAntiTamper(vin)) return false;
			}
			else if (insn instanceof IincInsnNode)
			{
				IincInsnNode iin = (IincInsnNode) insn;
				if (iin.var == lvtIndex) return false;
			}
		}
		return true;
	}

	/**
	 * Walks forward from a VarInsnNode read, looking through purely-additive operand-push
	 * insns to a conditional jump whose taken-or-fall-through path immediately encounters
	 * {@code NEW java/lang/IllegalStateException}. The ISE-elide pass deletes both the
	 * conditional and (via {@code findPureOperandPushes}) the operand pushes; from our
	 * perspective the read is effectively dead.
	 */
	private static boolean readFeedsIseAntiTamper(AbstractInsnNode read)
	{
		AbstractInsnNode cur = realNext(read);
		int hops = 0;
		while (cur != null && hops++ < 6)
		{
			int op = cur.getOpcode();
			if (isPureSinglePush(cur))
			{
				cur = realNext(cur);
				continue;
			}
			if (isConditionalJump(op))
			{
				// Check both the jump target and the fall-through for an immediate NEW ISE.
				AbstractInsnNode target = realNextFromLabel(((org.objectweb.asm.tree.JumpInsnNode) cur).label);
				if (isNewIllegalStateException(target)) return true;
				AbstractInsnNode fall = realNext(cur);
				if (isNewIllegalStateException(fall)) return true;
				return false;
			}
			return false;
		}
		return false;
	}

	private static AbstractInsnNode realNext(AbstractInsnNode n)
	{
		AbstractInsnNode cur = n.getNext();
		while (cur != null && cur.getOpcode() < 0) cur = cur.getNext();
		return cur;
	}

	private static AbstractInsnNode realNextFromLabel(AbstractInsnNode labelNode)
	{
		AbstractInsnNode cur = labelNode;
		while (cur != null && cur.getOpcode() < 0) cur = cur.getNext();
		return cur;
	}

	private static boolean isPureSinglePush(AbstractInsnNode n)
	{
		int op = n.getOpcode();
		if (op == -1) return false;
		if (op >= Opcodes.ACONST_NULL && op <= Opcodes.SIPUSH) return true;
		if (op >= Opcodes.ILOAD && op <= Opcodes.ALOAD) return true;
		if (n instanceof LdcInsnNode) return true;
		if (op == Opcodes.GETSTATIC) return true;
		return false;
	}

	private static boolean isConditionalJump(int opcode)
	{
		return (opcode >= Opcodes.IFEQ && opcode <= Opcodes.IF_ACMPNE)
			|| opcode == Opcodes.IFNULL
			|| opcode == Opcodes.IFNONNULL;
	}

	private static boolean isNewIllegalStateException(AbstractInsnNode n)
	{
		return n instanceof org.objectweb.asm.tree.TypeInsnNode
			&& n.getOpcode() == Opcodes.NEW
			&& "java/lang/IllegalStateException".equals(((org.objectweb.asm.tree.TypeInsnNode) n).desc);
	}

	/**
	 * Per-class rewrite: change the descriptor of every approved method (drop the trailing
	 * argument's type letter), then walk every method in the class and rewrite any INVOKE*
	 * to an approved method by removing the immediately-preceding constant push and
	 * updating the invoke's desc to the new signature.
	 */
	public void applyToClass(ClassNode cn)
	{
		if (cn.methods == null) return;
		// Stage 1: rewrite declarations.
		for (MethodNode mn : cn.methods)
		{
			String key = cn.name + "#" + mn.name + mn.desc;
			if (strippableMethods.contains(key))
			{
				mn.desc = stripLastArg(mn.desc);
				strippedMethodSignatures++;
			}
		}
		// Stage 2: rewrite call sites.
		for (MethodNode mn : cn.methods)
		{
			if (mn.instructions == null) continue;
			AbstractInsnNode insn = mn.instructions.getFirst();
			while (insn != null)
			{
				AbstractInsnNode next = insn.getNext();
				if (insn instanceof MethodInsnNode)
				{
					MethodInsnNode min = (MethodInsnNode) insn;
					String key = min.owner + "#" + min.name + min.desc;
					String origDesc = originalDescriptors.get(key);
					if (origDesc != null && min.desc.equals(origDesc))
					{
						AbstractInsnNode prev = realPrev(insn);
						if (prev != null && isSimpleConstantPush(prev))
						{
							mn.instructions.remove(prev);
							min.desc = stripLastArg(min.desc);
							rewrittenCallSites++;
						}
					}
				}
				insn = next;
			}
		}
	}

	private static String stripLastArg(String desc)
	{
		int closeParen = desc.indexOf(')');
		String args = desc.substring(1, closeParen);
		String ret = desc.substring(closeParen);
		// Parse args left-to-right, tracking each type's start index, then drop the last.
		int lastStart = 0;
		int pos = 0;
		while (pos < args.length())
		{
			lastStart = pos;
			char c = args.charAt(pos);
			if (c == 'L')
			{
				int end = args.indexOf(';', pos);
				pos = end + 1;
			}
			else if (c == '[')
			{
				while (pos < args.length() && args.charAt(pos) == '[') pos++;
				if (pos < args.length() && args.charAt(pos) == 'L')
				{
					int end = args.indexOf(';', pos);
					pos = end + 1;
				}
				else
				{
					pos++;
				}
			}
			else
			{
				pos++;
			}
		}
		return "(" + args.substring(0, lastStart) + ret;
	}

	private static boolean isSimpleConstantPush(AbstractInsnNode insn)
	{
		int op = insn.getOpcode();
		if (op == -1) return false;
		if (op >= Opcodes.ACONST_NULL && op <= Opcodes.SIPUSH) return true;
		if (insn instanceof LdcInsnNode)
		{
			Object cst = ((LdcInsnNode) insn).cst;
			return cst instanceof Integer
				|| cst instanceof Long
				|| cst instanceof Float
				|| cst instanceof Double
				|| cst instanceof String;
		}
		return false;
	}

	private static AbstractInsnNode realPrev(AbstractInsnNode n)
	{
		AbstractInsnNode cur = n.getPrevious();
		while (cur != null && cur.getOpcode() < 0) cur = cur.getPrevious();
		return cur;
	}
}
