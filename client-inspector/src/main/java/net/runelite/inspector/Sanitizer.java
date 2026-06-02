package net.runelite.inspector;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableAnnotationNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeAnnotationNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Defuses obfuscation bombs in annotations by validating each annotation's value
 * structure against its declared interface. Annotations whose member values do not
 * match the declared method return types are dropped wholesale. Annotations whose
 * interface is not on the classpath are passed through untouched.
 */
public final class Sanitizer
{
	private static final Set<String> RESERVED = Set.of(
		"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
		"const", "continue", "default", "do", "double", "else", "enum", "extends", "false",
		"final", "finally", "float", "for", "goto", "if", "implements", "import",
		"instanceof", "int", "interface", "long", "native", "new", "null", "package",
		"private", "protected", "public", "return", "short", "static", "strictfp", "super",
		"switch", "synchronized", "this", "throw", "throws", "transient", "true", "try",
		"void", "volatile", "while",
		"_", "var", "yield", "record", "sealed", "permits"
	);

	// Renames fields/methods/classes whose simple name is a Java reserved word to a `<name>_` form
	// so the decompiled source is syntactically valid. Done at bytecode level so every reference
	// (including instance-field accesses via subclass instances, which Vineflower's own renamer
	// fails to rewrite) stays consistent.
	private static final Remapper RESERVED_REMAPPER = new Remapper()
	{
		@Override
		public String mapFieldName(String owner, String name, String descriptor)
		{
			return RESERVED.contains(name) ? name + "_" : name;
		}

		@Override
		public String mapMethodName(String owner, String name, String descriptor)
		{
			if ("<init>".equals(name) || "<clinit>".equals(name))
			{
				return name;
			}
			return RESERVED.contains(name) ? name + "_" : name;
		}

		@Override
		public String mapInvokeDynamicMethodName(String name, String descriptor)
		{
			return RESERVED.contains(name) ? name + "_" : name;
		}

		@Override
		public String map(String internalName)
		{
			int slash = internalName.lastIndexOf('/');
			String simple = slash < 0 ? internalName : internalName.substring(slash + 1);
			if (RESERVED.contains(simple))
			{
				return (slash < 0 ? "" : internalName.substring(0, slash + 1)) + simple + "_";
			}
			return internalName;
		}
	};

	public static void main(String[] args) throws IOException
	{
		Path in = args.length > 0 ? Paths.get(args[0]) : findLatestPatchedClient();
		if (in == null || !Files.isRegularFile(in))
		{
			System.err.println("usage: sanitizer <path-to-jar>  (or place a runelite-*-injected-*.jar under ./data/)");
			System.exit(1);
			return;
		}

		Path out = resolveOutputPath(in);
		Files.createDirectories(out.getParent());
		Stats stats = new Stats();

		// Pass 1: scan every class for name collisions that are legal in bytecode but illegal
		// in Java source (same field name with different descriptors; same method name+params
		// with different return types). Build a per-(owner, name, descriptor) rename map.
		SanitizationPlan plan = buildDuplicateRenamer(in, stats);
		// Apply DUPLICATE first (it keys on original names from the pre-scan), then RESERVED
		// on top — otherwise the reserved-word rename of `do`→`do_` would happen first, the
		// duplicate map would look up the post-rename name, and the field-shadows-class
		// detection would silently miss (leaving `da.do_` field still colliding with class `do_`).
		Remapper remapper = combine(plan.dups, RESERVED_REMAPPER);

		// Pass 1b: find fields that the obfuscator declared ACC_FINAL but writes to from outside
		// <clinit>/<init>. Bytecode allows this; javac rejects it.
		Set<String> mutableFinalFields = findMutableFinalFields(in);

		// Pass 1c: find methods whose bodies contain FieldInsn/MethodInsn references to
		// targets that don't exist anywhere in the type hierarchy. The obfuscator plants
		// these to confuse decompilers — at runtime they'd throw NoSuchFieldError/
		// NoSuchMethodError. Rather than adding phantom members to the referenced class, we
		// replace the offending method's body with a `throw` stub; the method signature is
		// preserved so callers still resolve.
		Set<String> deadMethods = findMethodsWithDeadRefs(in);

		// Pass 1d: find methods declared `throws Exception` whose override chain doesn't
		// actually throw any checked exception. The obfuscator plants `throws Exception`
		// on methods to force callers to add catch/throws clauses they wouldn't naturally
		// need. We can safely strip it when no override (or the method itself) actually
		// throws a checked exception, since the bytecode `throws` clause is purely
		// metadata (the JVM doesn't enforce it).
		Set<String> methodsToStripExceptionThrows = findStrippableExceptionThrows(in);

		// Pass 1e: inverse problem. The obfuscator emits methods whose body invokes
		// checked-throwing methods (e.g. JSONArray.getJSONObject throws JSONException)
		// without either catching the exception or declaring throws — bytecode is legal
		// since the JVM ignores throws clauses, but javac rejects the source. Compute the
		// transitive set of checked exceptions each method actually needs in its throws
		// clause and add them, propagating to callers until the set is stable.
		// `methodsToStripExceptionThrows` is passed in so the propagator doesn't propagate
		// Exception/IOException FROM methods that the strip pass will then remove them
		// from — that'd leave callers with a try-catch for an exception that's no longer
		// thrown ("never thrown in body of corresponding try statement").
		Map<String, Set<String>> requiredThrows = computeRequiredThrows(in, methodsToStripExceptionThrows);

		// Pass 1f: classes that implement an external (runelite-api or similar non-jar)
		// interface. The propagator above refuses to add throws to instance methods of
		// these classes (interface contract is fixed). When their bodies still contain
		// unhandled checked-exception calls, we wrap each such method's body in a
		// try-catch(Exception) at bytecode level so the eventual decompiled source
		// declares the catch and javac stops complaining.
		Set<String> classesNeedingBodyWrap = findClassesImplementingExternalInterfaces(in);

		// Pass 1f.5: collect every method targeted by an INVOKEDYNAMIC method-reference
		// (e.g. `client::tk`). These bind to a functional-interface SAM whose throws
		// clause we can't widen — adding throws to the target method would make the
		// method-ref incompatible. We later (a) skip throws-add for these and (b)
		// body-wrap them instead so checked exceptions stay confined.
		Set<String> methodRefTargets = findMethodReferenceTargets(in);

		// Pass 1g: build a jar-wide class hierarchy map (superNames + interfaces). Used
		// by JarAwareClassWriter below to resolve in-jar type LUBs during COMPUTE_FRAMES
		// without falling back to the system classloader (which doesn't know about the
		// obfuscated client classes).
		JarHierarchy hierarchy = buildJarHierarchy(in);

		// Track classes whose control flow we mutated this pass (ISE elide, RTE
		// strip, etc.) — those need COMPUTE_FRAMES on emit because the existing
		// FrameNodes no longer line up with the bytecode they decorate.
		Set<String> classesWithControlFlowEdits = new java.util.HashSet<>();

		// Pass 1h: port of meteor's ModArith — discover the per-field multiplier
		// constants the obfuscator uses to encode int/long field values, so the
		// per-method rewrite below can strip them. Analysis is whole-jar; the apply
		// step is per-method. We also stamp each rewritten field with an
		// @ObfuscatedGetter(intValue=D) annotation so callers that need the raw
		// encoded form (e.g. when matching server packet bytes that still carry the
		// encoding) can recover the multiplier without re-doing the analysis.
		MultiplierDeobfuscator multipliers = new MultiplierDeobfuscator();
		multipliers.analyze(in);

		// Pass 1i: port of meteor's UnusedParameters — strip trailing garbage parameters
		// the obfuscator added to method signatures (and the corresponding constant pushes
		// at every call site). Conservative: only when every call site passes a simple
		// constant for the trailing arg, and the post-strip method doesn't collide with
		// any name+args in the hierarchy.
		//
		// External-contract guard: we exclude instance methods of classes that DIRECTLY
		// implement an external (non-jar) interface — those signatures are contract-
		// bound. We pass a DIFFERENT set from classesNeedingBodyWrap, which is broader
		// (includes ancestors that inherit external impls via subclasses). xi.bc(II)V
		// is fine to strip even though xj extends xi and xj implements PacketBuffer —
		// PacketBuffer's contract is on xj's own methods, not xi's.
		Set<String> directExternalImpls = findClassesDirectlyImplementingExternal(in);
		UnusedParameters unusedParameters = new UnusedParameters();
		unusedParameters.analyze(in, methodRefTargets, directExternalImpls);

		try (JarFile jar = new JarFile(in.toFile());
			OutputStream os = Files.newOutputStream(out);
			JarOutputStream jos = new JarOutputStream(os))
		{
			List<JarEntry> entries = jar.stream()
				.sorted(Comparator.comparing(JarEntry::getName))
				.collect(Collectors.toList());

			for (JarEntry entry : entries)
			{
				if (entry.isDirectory())
				{
					jos.putNextEntry(new JarEntry(entry.getName()));
					jos.closeEntry();
					continue;
				}

				byte[] bytes;
				String outName = entry.getName();
				if (entry.getName().endsWith(".class"))
				{
					try (InputStream is = jar.getInputStream(entry))
					{
						ClassReader cr = new ClassReader(is);
						ClassNode cn = new ClassNode();
						cr.accept(cn, 0);
						sanitizeClass(cn, stats);
						// Drop covariant-bridge methods whose targets were renamed to take the
						// bridge's own name. Source emits one correctly-typed concrete method;
						// javac regenerates the bytecode bridge during recompilation.
						if (cn.methods != null && !plan.bridgesToDrop.isEmpty())
						{
							final String cnName = cn.name;
							cn.methods.removeIf(mn ->
							{
								if (plan.bridgesToDrop.contains(cnName + "#" + mn.name + mn.desc))
								{
									stats.droppedBridgeMethods++;
									return true;
								}
								return false;
							});
						}
						// Bridges we elected to KEEP (raw NameableContainer return) need an
						// explicit CHECKCAST before their ARETURN so Vineflower emits the
						// cast in source. Otherwise the bridge body returns rc directly, and
						// rc no longer implements NameableContainer at source level (we strip
						// the raw interface from impl classes).
						if (cn.methods != null && !plan.bridgesNeedingCheckcast.isEmpty())
						{
							for (MethodNode mn : cn.methods)
							{
								String key = cn.name + "#" + mn.name + mn.desc;
								if (!plan.bridgesNeedingCheckcast.contains(key))
								{
									continue;
								}
								String retL = mn.desc.substring(mn.desc.lastIndexOf(')') + 1);
								if (retL.length() < 3 || retL.charAt(0) != 'L')
								{
									continue;
								}
								String returnInternal = retL.substring(1, retL.length() - 1);
								for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext())
								{
									if (insn.getOpcode() == org.objectweb.asm.Opcodes.ARETURN)
									{
										mn.instructions.insertBefore(insn,
											new org.objectweb.asm.tree.TypeInsnNode(
												org.objectweb.asm.Opcodes.CHECKCAST, returnInternal));
										stats.injectedBridgeCheckcasts++;
										break;
									}
								}
							}
						}
						// Replace bodies of methods that reference nonexistent fields/methods.
						// Keeps the signature so callers resolve, eliminates the bad refs.
						if (cn.methods != null)
						{
							for (MethodNode mn : cn.methods)
							{
								String key = cn.name + "#" + mn.name + mn.desc;
								if (deadMethods.contains(key))
								{
									replaceWithThrowStub(mn);
									stats.stubbedDeadMethods++;
								}
								if (methodsToStripExceptionThrows.contains(key) && mn.exceptions != null)
								{
									// Only strip the planted `throws Exception`. IOException is
									// still genuinely used by callers' try-catch(IOException)
									// blocks; stripping it leaves "exception never thrown in
									// body of corresponding try statement" errors at recompile.
									if (mn.exceptions.removeIf(e -> "java/lang/Exception".equals(e)))
									{
										stats.strippedThrowsException++;
									}
								}
								// Add transitively-required checked exceptions to the method's
								// Exceptions attribute. Computed by Pass 1e. Skip classes whose
								// non-static methods will be body-wrapped (Pass 1f) — for those,
								// adding throws to a method that overrides an external contract
								// (e.g. Runnable.run, SSLSocket.startHandshake) breaks the
								// override-compatibility check at recompile. The wrap converts
								// any escaping checked into RuntimeException, so the throws
								// declaration is unnecessary there.
								boolean willBeBodyWrapped = classesNeedingBodyWrap.contains(cn.name)
									&& (mn.access & (org.objectweb.asm.Opcodes.ACC_STATIC | org.objectweb.asm.Opcodes.ACC_ABSTRACT | org.objectweb.asm.Opcodes.ACC_NATIVE | org.objectweb.asm.Opcodes.ACC_SYNTHETIC | org.objectweb.asm.Opcodes.ACC_BRIDGE)) == 0
									&& !"<init>".equals(mn.name) && !"<clinit>".equals(mn.name);
								// Synthetic/bridge methods in external-impl classes MUST stay
								// throws-clean: javac generates them as covariant-return bridges
								// over the external interface method, and adding throws makes the
								// override signature incompatible. willBeBodyWrapped excludes
								// synthetic/bridge from its TRUE branch (because the wrap can't
								// be inserted into a body-less bridge), but that left the
								// throws-add unconditioned for them. Explicitly skip throws-add
								// for synthetic/bridge methods of external-impl classes.
								boolean externalImplBridge = classesNeedingBodyWrap.contains(cn.name)
									&& (mn.access & (org.objectweb.asm.Opcodes.ACC_SYNTHETIC | org.objectweb.asm.Opcodes.ACC_BRIDGE)) != 0;
								// Methods bound by a method-reference (e.g. `client::tk`)
								// must match the target functional interface's throws clause —
								// adding throws breaks the binding ("incompatible thrown types
								// in functional expression"). Skip throws-add; the wrap step
								// below picks them up to confine the checked exceptions.
								boolean isMethodRefTarget = methodRefTargets.contains(key);
								Set<String> mustThrow = requiredThrows.get(key);
								if (mustThrow != null && !mustThrow.isEmpty() && !willBeBodyWrapped && !externalImplBridge && !isMethodRefTarget)
								{
									if (mn.exceptions == null) mn.exceptions = new ArrayList<>();
									for (String ex : mustThrow)
									{
										if (!mn.exceptions.contains(ex))
										{
											mn.exceptions.add(ex);
											stats.addedRequiredThrows++;
										}
									}
								}
								// Rewrite anti-tamper `if (x == null) x.bogus(args)` dead-call
								// sites. The bogus invoke is either (a) propagating a checked
								// `throws Exception` to callers that don't catch it, or (b)
								// targeting a method that doesn't exist on the receiver. Either
								// form blocks the recompile. Replace with `x.getClass();` —
								// exists on every type, still NPEs on null, satisfies javac.
								stats.rewroteDeadNullCall += rewriteDeadNullCalls(mn);
								// Drop `CHECKCAST T` instructions whose stack input is a literal
								// `ACONST_NULL`. Verifier-legal (null is assignable to any T) but
								// Vineflower emits `(T) null` which is noise. Port of meteor's
								// CastNull pass, structural (no execution model needed).
								stats.removedNullCasts += removeNullChecksCasts(mn);
								// Anti-tamper: replace `if (cond) { new IllegalStateException(...);
								// athrow; }` with a POP(s) + GOTO to the post-athrow target. The
								// dead NEW..ATHROW region is left in place (now unreachable) — Vineflower
								// drops unreachable code at decompile time, and leaving the instructions
								// and FrameNodes intact avoids the ClassWriter frame-mismatch we'd get
								// from a removeRange. Port of meteor's IllegalStateExceptions.
								stats.elidedIllegalStateThrows += elideIllegalStateExceptionThrows(mn);
								// Strip the obfuscator's modular-arithmetic field multipliers —
								// `GETFIELD f; LDC D; IMUL` and `LDC E; IMUL; PUTFIELD f` pairs.
								// The field-level annotation is stamped further down on the
								// ClassNode so callers that need the encoding can recover it.
								multipliers.applyToMethod(mn);
								// Strip catch (RuntimeException) handlers planted by the obfuscator.
								// Removing a table entry orphans the handler block's stack=[Throwable]
								// FrameNode (no exception edge feeds it any more), which ClassWriter(0)
								// rejects. Fix: after the strip, drop ALL FrameNodes from the method
								// and have ClassWriter regenerate them via COMPUTE_FRAMES with our
								// jar-aware super-class resolver. Skip client.init where one such
								// handler is intentional for fatal-error reporting.
								if (!("client".equals(cn.name) && "init".equals(mn.name)))
								{
									int rteStripped = stripRuntimeExceptionHandlers(mn);
									if (rteStripped > 0)
									{
										stats.droppedRuntimeExceptionHandlers += rteStripped;
										dropFrameNodes(mn);
										// ASM's analyzer needs maxStack/maxLocals too — let the
										// writer recompute them (cleared so visitMaxs ignores ours).
										mn.maxStack = 0;
										mn.maxLocals = 0;
										classesWithControlFlowEdits.add(cn.name);
									}
								}
								// Wrap method bodies in classes that implement an external
								// interface — see Pass 1f. CRITICAL gate: only wrap when the
								// method ACTUALLY HAS uncaught checked exceptions to convert
								// (mustThrow non-empty). Before this gate we wrapped every
								// method of every external-impl class, producing an avalanche
								// of `try { return this.f; } catch (Throwable t) { throw new
								// RuntimeException(t); }` noise on trivial getters. The wrap
								// is purely for "method can't declare throws, but its body
								// would propagate checked exceptions" — if there's nothing to
								// propagate, javac compiles the body cleanly without the wrap.
								// Skip constructors / abstract / native / SYNTHETIC lambda
								// bodies as before.
								boolean wrapEligible = mustThrow != null && !mustThrow.isEmpty()
									&& (mn.access & (org.objectweb.asm.Opcodes.ACC_ABSTRACT | org.objectweb.asm.Opcodes.ACC_NATIVE | org.objectweb.asm.Opcodes.ACC_SYNTHETIC | org.objectweb.asm.Opcodes.ACC_BRIDGE)) == 0
									&& !"<init>".equals(mn.name) && !"<clinit>".equals(mn.name);
								// Wrap when: (a) class implements an external interface
								// (Widget, Runnable, SSLSocket subclass, …) — adding throws to
								// the signature would break the override; OR (b) the method
								// itself is used as a method-reference somewhere — adding throws
								// would make the method-ref's target functional-interface SAM
								// reject it. Both cases require the wrap to absorb the checked
								// exceptions at the body boundary.
								if (wrapEligible
									&& (classesNeedingBodyWrap.contains(cn.name) || isMethodRefTarget))
								{
									if (wrapMethodBodyInTryCatch(mn))
									{
										stats.wrappedExternalImplBodies++;
									}
								}
							}
						}

						boolean isInterface = (cn.access & org.objectweb.asm.Opcodes.ACC_INTERFACE) != 0;
						// Drop ACC_FINAL from classes: the obfuscator marks unrelated classes
						// final, then emits `instanceof X; (X)this` patterns where X is a
						// different unrelated final class. javac statically rejects such
						// casts; without ACC_FINAL the cast is just an unchecked warning at
						// worst. Doesn't affect runtime (no class actually extends these).
						if (!isInterface && (cn.access & org.objectweb.asm.Opcodes.ACC_FINAL) != 0)
						{
							cn.access &= ~org.objectweb.asm.Opcodes.ACC_FINAL;
							stats.unFinaledClasses++;
						}
						// Stamp the per-revision name/signature/implements annotations the
						// injector reads at weave time. Must run BEFORE any pass that mutates
						// method descriptors (compareTo Object→Nameable, UnusedParameters
						// trailing-arg strip) — the injector weaves into the ORIGINAL
						// obfuscated jar whose signatures predate those mutations, so
						// @ObfuscatedSignature has to capture them as they were.
						stats.stampedObfuscatedAnnotations += stampObfuscatedAnnotations(cn);
						// Drop raw `java/lang/Comparable` when a class also implements one of
						// the runelite-api interfaces that already extends Comparable<T>. javac
						// rejects the resulting "Comparable inherited with different arguments"
						// since e.g. Nameable extends Comparable<Nameable>.
						if (cn.interfaces != null
							&& cn.interfaces.contains("java/lang/Comparable"))
						{
							boolean hasNarrowedComparable = cn.interfaces.contains("net/runelite/api/Nameable")
								|| cn.interfaces.contains("net/runelite/api/NameableContainer");
							if (hasNarrowedComparable)
							{
								cn.interfaces.remove("java/lang/Comparable");
							}
						}
						{
							// MUTATE the existing compareTo(Object) method's descriptor to
							// compareTo(Nameable) so it satisfies Comparable<Nameable> from the
							// Nameable interface chain. The body's first CHECKCAST already narrows
							// the param to a concrete subtype, so changing from Object to Nameable
							// doesn't break the bytecode. javac auto-generates the (Object) bridge
							// at recompile time. Applies to classes implementing any
							// Nameable-derived interface (Nameable, Ignore, ChatPlayer,
							// ClanChannelMember, etc.) — also walk the inheritance chain since
							// subclasses may have their own redeclared compareTo(Object) without
							// directly listing Nameable in their interfaces.
							if (implementsNameableTransitive(cn)
								&& !hasMethod(cn, "compareTo", "(Lnet/runelite/api/Nameable;)I"))
							{
								for (MethodNode mn : cn.methods)
								{
									if ("compareTo".equals(mn.name) && "(Ljava/lang/Object;)I".equals(mn.desc))
									{
										mn.desc = "(Lnet/runelite/api/Nameable;)I";
										stats.mutatedCompareToToNameable++;
										break;
									}
								}
							}
						}
						// Drop raw `net/runelite/api/NameableContainer` — subclasses pick up
						// the parameterized form via FriendsChatManager / FriendContainer, and
						// the raw declaration here causes "different arguments" inheritance
						// errors in those subclasses. Doesn't affect runtime; the methods
						// still work through the inherited contract.
						if (cn.interfaces != null)
						{
							cn.interfaces.remove("net/runelite/api/NameableContainer");
							// Classes implementing FriendsChatManager / FriendContainer need a
							// covariantly-typed findByName(String) to satisfy NameableContainer<T>.
							// The obfuscator only emits an inherited `Nameable findByName(String)`;
							// add a synthetic-ish override that casts to the specific type.
							if (cn.interfaces.contains("net/runelite/api/FriendsChatManager"))
							{
								String invokeOwner = cn.superName != null ? cn.superName : cn.name;
								if (!hasMethod(cn, "findByName", "(Ljava/lang/String;)Lnet/runelite/api/FriendsChatMember;"))
								{
									cn.methods.add(makeFindByNameBridge(invokeOwner, "net/runelite/api/FriendsChatMember"));
									stats.addedFindByNameBridges++;
								}
								if (!hasMethod(cn, "getMembers", "()[Lnet/runelite/api/FriendsChatMember;"))
								{
									cn.methods.add(makeGetMembersBridge(invokeOwner, "net/runelite/api/FriendsChatMember"));
									stats.addedFindByNameBridges++;
								}
							}
							if (cn.interfaces.contains("net/runelite/api/FriendContainer"))
							{
								String invokeOwner = cn.superName != null ? cn.superName : cn.name;
								if (!hasMethod(cn, "findByName", "(Ljava/lang/String;)Lnet/runelite/api/Friend;"))
								{
									cn.methods.add(makeFindByNameBridge(invokeOwner, "net/runelite/api/Friend"));
									stats.addedFindByNameBridges++;
								}
								if (!hasMethod(cn, "getMembers", "()[Lnet/runelite/api/Friend;"))
								{
									cn.methods.add(makeGetMembersBridge(invokeOwner, "net/runelite/api/Friend"));
									stats.addedFindByNameBridges++;
								}
							}
						}
						if (cn.fields != null && !isInterface)
						{
							for (FieldNode fn : cn.fields)
							{
								// Drop ACC_FINAL unconditionally. Bytecode permits multiple writes
								// to "final" fields (and the obfuscator exploits this); javac does not.
								// Also drop ConstantValue when paired with ACC_FINAL, since javac
								// requires final for ConstantValue inlining.
								// Skip interfaces: their fields are implicitly public static final
								// and javac requires an initializer for each one.
								if ((fn.access & org.objectweb.asm.Opcodes.ACC_FINAL) != 0)
								{
									fn.access &= ~org.objectweb.asm.Opcodes.ACC_FINAL;
									fn.value = null;
									stats.unFinaledFields++;
								}
							}
						}
						// Stamp @ObfuscatedGetter on every field whose decoder D we resolved
						// during Pass 1h analysis. We do this once per class (after all
						// per-method passes have run) so any in-bytecode multiplier stripping
						// has already happened and the annotation just records the constant.
						multipliers.annotateFields(cn);
						// Strip trailing garbage parameters from approved methods AND from
						// every call site to those methods. Done after all per-method passes
						// so we operate on the post-rewrite instruction stream.
						unusedParameters.applyToClass(cn);

						ClassWriter cw;
						if (classesWithControlFlowEdits.contains(cn.name))
						{
							// COMPUTE_FRAMES regenerates the StackMapTable from the bytecode and
							// ignores existing FrameNodes — drop them from EVERY method in the
							// class so a stale FrameNode in an untouched method can't confuse the
							// analyzer at the boundary of the bytes we did mutate.
							if (cn.methods != null)
							{
								for (MethodNode mn : cn.methods) dropFrameNodes(mn);
							}
							cw = new JarAwareClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS, hierarchy);
						}
						else
						{
							cw = new ClassWriter(0);
						}
						try
						{
							cn.accept(new ClassRemapper(cw, remapper));
							bytes = cw.toByteArray();
						}
						catch (Throwable t)
						{
							System.err.println("Sanitizer: failed emitting class " + cn.name);
							if (cn.methods != null)
							{
								for (MethodNode mn : cn.methods)
								{
									ClassWriter probe = new JarAwareClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS, hierarchy);
									probe.visit(cn.version, cn.access, cn.name, cn.signature, cn.superName,
										cn.interfaces == null ? null : cn.interfaces.toArray(new String[0]));
									try
									{
										mn.accept(probe);
										probe.visitEnd();
									}
									catch (Throwable t2)
									{
										System.err.println("  failing method: " + cn.name + "." + mn.name + mn.desc + " tcb=" + (mn.tryCatchBlocks == null ? 0 : mn.tryCatchBlocks.size()) + " — " + t2);
										int idx = 0;
										for (AbstractInsnNode ai = mn.instructions.getFirst(); ai != null; ai = ai.getNext())
										{
											String extra = "";
											switch (ai.getType())
											{
												case AbstractInsnNode.LABEL:
													extra = "id=" + System.identityHashCode(ai); break;
												case AbstractInsnNode.JUMP_INSN:
													extra = "→" + System.identityHashCode(((JumpInsnNode) ai).label); break;
												case AbstractInsnNode.FRAME:
													org.objectweb.asm.tree.FrameNode fn = (org.objectweb.asm.tree.FrameNode) ai;
													extra = "type=" + fn.type; break;
												case AbstractInsnNode.METHOD_INSN:
													MethodInsnNode mi = (MethodInsnNode) ai;
													extra = mi.owner + "." + mi.name + mi.desc; break;
												default:
													extra = "op=" + ai.getOpcode();
											}
											System.err.printf("    %3d %s %s%n", idx++, ai.getClass().getSimpleName(), extra);
										}
									}
								}
							}
							throw t;
						}
						String remapped = remapper.map(cn.name);
						if (!cn.name.equals(remapped))
						{
							outName = remapped + ".class";
						}
					}
				}
				else
				{
					try (InputStream is = jar.getInputStream(entry))
					{
						bytes = is.readAllBytes();
					}
				}

				JarEntry copy = new JarEntry(outName);
				jos.putNextEntry(copy);
				jos.write(bytes);
				jos.closeEntry();
			}
		}

		System.out.println("wrote " + out.toAbsolutePath());
		System.out.println("dropped " + stats.droppedAnnotations + " malformed annotation(s)");
		System.out.println("disambiguated " + stats.renamedFields + " duplicate field name(s) and "
			+ stats.renamedMethods + " duplicate method signature(s)");
		System.out.println("un-finaled " + stats.unFinaledFields + " field(s) with writes outside <clinit>/<init>");
		if (stats.droppedDecoyAnnotationMethods > 0)
		{
			System.out.println("dropped " + stats.droppedDecoyAnnotationMethods + " decoy method(s) from @interface declarations");
		}
		if (stats.stubbedDeadMethods > 0)
		{
			System.out.println("stubbed " + stats.stubbedDeadMethods + " method(s) whose bodies referenced nonexistent fields/methods");
		}
		if (stats.droppedBridgeMethods > 0)
		{
			System.out.println("dropped " + stats.droppedBridgeMethods + " covariant-bridge method(s) (target renamed to bridge's name)");
		}
		if (stats.scrubbedNullParamNames > 0)
		{
			System.out.println("scrubbed " + stats.scrubbedNullParamNames + " parameter name(s) literally set to \"null\"");
		}
		if (stats.strippedThrowsException > 0)
		{
			System.out.println("stripped \"throws java.lang.Exception\" from " + stats.strippedThrowsException + " method signature(s)");
		}
		if (stats.addedFindByNameBridges > 0)
		{
			System.out.println("added " + stats.addedFindByNameBridges + " covariant findByName(String) bridge(s) for FriendsChatManager / FriendContainer impls");
		}
		if (stats.mutatedCompareToToNameable > 0)
		{
			System.out.println("mutated " + stats.mutatedCompareToToNameable + " compareTo(Object) -> compareTo(Nameable) for Nameable impls");
		}
		if (stats.rewroteDeadNullCall > 0)
		{
			System.out.println("rewrote " + stats.rewroteDeadNullCall + " `if (x == null) x.bogus(...)` anti-tamper site(s) to a benign Object.getClass call");
		}
		if (stats.addedRequiredThrows > 0)
		{
			System.out.println("added " + stats.addedRequiredThrows + " transitively-required checked-exception throws clause(s) inferred from method bodies");
		}
		if (stats.wrappedExternalImplBodies > 0)
		{
			System.out.println("wrapped " + stats.wrappedExternalImplBodies + " external-interface-impl method bodies in try-catch(Exception) so checked-exception calls compile under the fixed interface contract");
		}
		if (stats.removedNullCasts > 0)
		{
			System.out.println("removed " + stats.removedNullCasts + " CHECKCAST instruction(s) on a literal null operand (CastNull port)");
		}
		if (stats.elidedIllegalStateThrows > 0)
		{
			System.out.println("elided " + stats.elidedIllegalStateThrows + " anti-tamper `if cond → throw new IllegalStateException(...)` site(s) (IllegalStateExceptions port)");
		}
		if (stats.droppedRuntimeExceptionHandlers > 0)
		{
			System.out.println("dropped " + stats.droppedRuntimeExceptionHandlers + " catch (RuntimeException) handler(s) (RuntimeExceptions port)");
		}
		if (multipliers.resolvedDecoderCount() > 0)
		{
			System.out.println("resolved decoders for " + multipliers.resolvedDecoderCount() + " obfuscated int/long field(s); "
				+ "stripped " + multipliers.rewroteReads() + " read multiplier(s), "
				+ multipliers.rewroteWrites() + " write multiplier(s), "
				+ multipliers.rewroteComparisonNoise() + " comparison-noise multiplier(s); "
				+ "decoded " + multipliers.rewroteIncrements() + " compound-assignment delta(s); "
				+ "stamped @ObfuscatedGetter on " + multipliers.annotatedFieldCount() + " field(s) (ModArith port)");
		}
		if (unusedParameters.strippedMethodSignatures() > 0)
		{
			System.out.println("stripped trailing garbage parameter from " + unusedParameters.strippedMethodSignatures() + " method signature(s) "
				+ "and " + unusedParameters.rewrittenCallSites() + " call site(s); "
				+ "rejected " + unusedParameters.candidatesRejectedByDynamicCallSite() + " candidate(s) with dynamic argument expressions (UnusedParameters port)");
		}
		if (stats.stampedObfuscatedAnnotations > 0)
		{
			System.out.println("stamped " + stats.stampedObfuscatedAnnotations + " @ObfuscatedName / @ObfuscatedSignature / @Implements annotation(s) for the injector");
		}
		if (!stats.droppedByType.isEmpty())
		{
			stats.droppedByType.forEach((k, v) -> System.out.println("  " + v + " x " + k));
		}
		if (!stats.unloadable.isEmpty())
		{
			System.out.println("kept (not on classpath, unable to validate):");
			stats.unloadable.forEach((k, v) -> System.out.println("  " + v + " x " + k));
		}
	}

	private static Path findLatestPatchedClient() throws IOException
	{
		Path data = Paths.get("data");
		if (!Files.isDirectory(data))
		{
			return null;
		}
		try (Stream<Path> stream = Files.list(data))
		{
			return stream
				.filter(p ->
				{
					String n = p.getFileName().toString();
					return n.endsWith(".jar")
						&& n.startsWith("runelite-")
						&& n.contains("-injected-")
						&& !n.endsWith("-clean.jar");
				})
				.max(Comparator.comparingLong(p -> p.toFile().lastModified()))
				.orElse(null);
		}
	}

	private static Path resolveOutputPath(Path jar)
	{
		String name = jar.getFileName().toString();
		int dot = name.lastIndexOf('.');
		String base = dot > 0 ? name.substring(0, dot) : name;
		String outName = base + "-clean.jar";

		Path parent = jar.toAbsolutePath().getParent();
		if (parent != null && "data".equals(parent.getFileName().toString()))
		{
			return parent.resolve(outName);
		}
		return Paths.get("data").resolve(outName);
	}

	private static void sanitizeClass(ClassNode cn, Stats stats)
	{
		cn.visibleAnnotations = filter(cn.visibleAnnotations, stats);
		cn.invisibleAnnotations = filter(cn.invisibleAnnotations, stats);
		cn.visibleTypeAnnotations = filterType(cn.visibleTypeAnnotations, stats);
		cn.invisibleTypeAnnotations = filterType(cn.invisibleTypeAnnotations, stats);

		// Obfuscation noise: classes flagged ACC_ANNOTATION whose method members violate the
		// annotation-interface rules (taking parameters, returning non-annotation-compatible
		// types, carrying ACC_STATIC, having bodies). These methods can't be expressed as
		// annotation members in Java source. They're never actually invoked as annotation
		// members at runtime; drop them so the @interface declaration parses.
		if ((cn.access & org.objectweb.asm.Opcodes.ACC_ANNOTATION) != 0 && cn.methods != null)
		{
			Iterator<MethodNode> it = cn.methods.iterator();
			while (it.hasNext())
			{
				MethodNode mn = it.next();
				if (!isValidAnnotationMember(mn))
				{
					it.remove();
					stats.droppedDecoyAnnotationMethods++;
				}
			}
		}

		if (cn.fields != null)
		{
			for (FieldNode fn : cn.fields)
			{
				fn.visibleAnnotations = filter(fn.visibleAnnotations, stats);
				fn.invisibleAnnotations = filter(fn.invisibleAnnotations, stats);
				fn.visibleTypeAnnotations = filterType(fn.visibleTypeAnnotations, stats);
				fn.invisibleTypeAnnotations = filterType(fn.invisibleTypeAnnotations, stats);
			}
		}
		if (cn.methods != null)
		{
			for (MethodNode mn : cn.methods)
			{
				mn.visibleAnnotations = filter(mn.visibleAnnotations, stats);
				mn.invisibleAnnotations = filter(mn.invisibleAnnotations, stats);
				mn.visibleTypeAnnotations = filterType(mn.visibleTypeAnnotations, stats);
				mn.invisibleTypeAnnotations = filterType(mn.invisibleTypeAnnotations, stats);
				// Obfuscator plants the literal Java reserved word "null" as the parameter
				// name in MethodParameters attributes. Vineflower then emits parameter
				// declarations as "nullx", "nullxx", ... (deduping the colliding names),
				// while body references for the same slots fall through to "var<N>",
				// breaking name resolution at use sites. Strip the names so Vineflower
				// falls back to "var<N>" consistently for both the declaration and body.
				if (mn.parameters != null)
				{
					for (org.objectweb.asm.tree.ParameterNode pn : mn.parameters)
					{
						if (pn != null && "null".equals(pn.name))
						{
							pn.name = null;
							stats.scrubbedNullParamNames++;
						}
					}
				}
				mn.visibleLocalVariableAnnotations = filterLocalVariable(mn.visibleLocalVariableAnnotations, stats);
				mn.invisibleLocalVariableAnnotations = filterLocalVariable(mn.invisibleLocalVariableAnnotations, stats);
				if (mn.visibleParameterAnnotations != null)
				{
					for (int i = 0; i < mn.visibleParameterAnnotations.length; i++)
					{
						mn.visibleParameterAnnotations[i] = filter(mn.visibleParameterAnnotations[i], stats);
					}
				}
				if (mn.invisibleParameterAnnotations != null)
				{
					for (int i = 0; i < mn.invisibleParameterAnnotations.length; i++)
					{
						mn.invisibleParameterAnnotations[i] = filter(mn.invisibleParameterAnnotations[i], stats);
					}
				}
			}
		}
	}

	private static List<AnnotationNode> filter(List<AnnotationNode> list, Stats stats)
	{
		if (list == null || list.isEmpty())
		{
			return list;
		}
		List<AnnotationNode> kept = new ArrayList<>(list.size());
		for (AnnotationNode an : list)
		{
			if (keep(an, stats))
			{
				kept.add(an);
			}
		}
		return kept;
	}

	private static List<TypeAnnotationNode> filterType(List<TypeAnnotationNode> list, Stats stats)
	{
		if (list == null || list.isEmpty())
		{
			return list;
		}
		List<TypeAnnotationNode> kept = new ArrayList<>(list.size());
		for (TypeAnnotationNode an : list)
		{
			if (keep(an, stats))
			{
				kept.add(an);
			}
		}
		return kept;
	}

	private static List<LocalVariableAnnotationNode> filterLocalVariable(List<LocalVariableAnnotationNode> list, Stats stats)
	{
		if (list == null || list.isEmpty())
		{
			return list;
		}
		List<LocalVariableAnnotationNode> kept = new ArrayList<>(list.size());
		for (LocalVariableAnnotationNode an : list)
		{
			if (keep(an, stats))
			{
				kept.add(an);
			}
		}
		return kept;
	}

	private static boolean keep(AnnotationNode an, Stats stats)
	{
		if (an == null)
		{
			return false;
		}
		Class<?> annotationClass;
		try
		{
			String className = Type.getType(an.desc).getClassName();
			annotationClass = Class.forName(className, false, Sanitizer.class.getClassLoader());
		}
		catch (ClassNotFoundException | LinkageError e)
		{
			stats.unloadable.merge(an.desc, 1L, Long::sum);
			return true;
		}

		if (!annotationClass.isAnnotation())
		{
			// The descriptor doesn't reference an annotation type — treat as garbage.
			stats.droppedByType.merge(an.desc, 1L, Long::sum);
			stats.droppedAnnotations++;
			return false;
		}

		if (an.values == null)
		{
			return true;
		}

		for (int i = 0; i + 1 < an.values.size(); i += 2)
		{
			String memberName = (String) an.values.get(i);
			Object value = an.values.get(i + 1);
			Method declared;
			try
			{
				declared = annotationClass.getDeclaredMethod(memberName);
			}
			catch (NoSuchMethodException e)
			{
				stats.droppedByType.merge(an.desc, 1L, Long::sum);
				stats.droppedAnnotations++;
				return false;
			}
			if (!matches(declared.getReturnType(), value))
			{
				stats.droppedByType.merge(an.desc, 1L, Long::sum);
				stats.droppedAnnotations++;
				return false;
			}
		}
		return true;
	}

	private static boolean matches(Class<?> declared, Object value)
	{
		if (value == null)
		{
			return false;
		}
		if (declared.isArray())
		{
			Class<?> component = declared.getComponentType();
			if (component.isPrimitive())
			{
				// ASM may give us a typed primitive array directly or a List of wrappers.
				if (value.getClass().isArray() && value.getClass().getComponentType() == component)
				{
					return true;
				}
				if (!(value instanceof List))
				{
					return false;
				}
				for (Object element : (List<?>) value)
				{
					if (!matches(component, element))
					{
						return false;
					}
				}
				return true;
			}
			if (!(value instanceof List))
			{
				return false;
			}
			for (Object element : (List<?>) value)
			{
				if (!matches(component, element))
				{
					return false;
				}
			}
			return true;
		}
		if (declared == String.class)
		{
			return value instanceof String;
		}
		if (declared == Class.class)
		{
			return value instanceof Type;
		}
		if (declared.isEnum())
		{
			if (!(value instanceof String[]))
			{
				return false;
			}
			String[] pair = (String[]) value;
			return pair.length == 2
				&& pair[0] != null
				&& pair[1] != null
				&& Type.getType(pair[0]).getClassName().equals(declared.getName().replace('$', '.'));
		}
		if (declared.isAnnotation())
		{
			if (!(value instanceof AnnotationNode))
			{
				return false;
			}
			AnnotationNode nested = (AnnotationNode) value;
			return Type.getType(nested.desc).getClassName().equals(declared.getName().replace('$', '.'));
		}
		if (declared == boolean.class)
		{
			return value instanceof Boolean;
		}
		if (declared == byte.class)
		{
			return value instanceof Byte;
		}
		if (declared == char.class)
		{
			return value instanceof Character;
		}
		if (declared == short.class)
		{
			return value instanceof Short;
		}
		if (declared == int.class)
		{
			return value instanceof Integer;
		}
		if (declared == long.class)
		{
			return value instanceof Long;
		}
		if (declared == float.class)
		{
			return value instanceof Float;
		}
		if (declared == double.class)
		{
			return value instanceof Double;
		}
		return false;
	}

	private static final class Stats
	{
		long droppedAnnotations;
		long droppedDecoyAnnotationMethods;
		long renamedFields;
		long renamedMethods;
		long unFinaledFields;
		long unFinaledClasses;
		long stubbedDeadMethods;
		long droppedBridgeMethods;
		long scrubbedNullParamNames;
		long strippedThrowsException;
		long addedFindByNameBridges;
		long mutatedCompareToToNameable;
		long injectedBridgeCheckcasts;
		long rewroteDeadNullCall;
		long addedRequiredThrows;
		long wrappedExternalImplBodies;
		long removedNullCasts;
		long elidedIllegalStateThrows;
		long droppedRuntimeExceptionHandlers;
		long stampedObfuscatedAnnotations;
		final Map<String, Long> droppedByType = new TreeMap<>();
		final Map<String, Long> unloadable = new TreeMap<>();
	}

	// Returns owner+"#"+name+desc keys of methods declaring `throws java.lang.Exception`
	// that can safely have that declaration stripped — i.e. neither the method itself nor
	// any override in the jar's class hierarchy actually throws a checked exception
	// (excluding RuntimeException and its subtypes). Bodies that ATHROW a checked type
	// or INVOKE a method declared to throw one count as "actually throws".
	private static Set<String> findStrippableExceptionThrows(Path jarPath) throws IOException
	{
		// Pass A: collect (owner, name+desc) -> declared exceptions list, super names,
		// and detect "actually throws checked" for each method body.
		Map<String, Set<String>> classMethods = new HashMap<>();
		Map<String, Map<String, List<String>>> methodExceptions = new HashMap<>();
		Map<String, String> superNames = new HashMap<>();
		Map<String, Set<String>> bodyThrows = new HashMap<>();

		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry e = it.next();
				if (!e.getName().endsWith(".class"))
				{
					continue;
				}
				try (InputStream is = jar.getInputStream(e))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
					if (cn.superName != null)
					{
						superNames.put(cn.name, cn.superName);
					}
					Set<String> myMethods = classMethods.computeIfAbsent(cn.name, k -> new java.util.HashSet<>());
					Map<String, List<String>> myExc = methodExceptions.computeIfAbsent(cn.name, k -> new HashMap<>());
					Set<String> myBodyThrows = bodyThrows.computeIfAbsent(cn.name, k -> new java.util.HashSet<>());
					if (cn.methods == null)
					{
						continue;
					}
					for (MethodNode mn : cn.methods)
					{
						String key = mn.name + mn.desc;
						myMethods.add(key);
						if (mn.exceptions != null && !mn.exceptions.isEmpty())
						{
							myExc.put(key, new ArrayList<>(mn.exceptions));
						}
						// Scan body for INVOKE/ATHROW that brings a checked exception into play.
						if (mn.instructions != null)
						{
							for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext())
							{
								if (insn instanceof MethodInsnNode)
								{
									// Calls to methods that may throw checked exceptions are
									// conservatively tracked by recording the invoked method's owner+key.
									MethodInsnNode min = (MethodInsnNode) insn;
									myBodyThrows.add(min.owner + "#" + min.name + min.desc);
								}
							}
						}
					}
				}
			}
		}

		// Pass B: for each candidate method (owner.key declaring throws Exception), check
		// the override chain. Strip only if NO override declares Exception (or anything
		// that isn't a RuntimeException subtype) AND its own body doesn't invoke a method
		// that declares throws something checked.
		Set<String> strippable = new java.util.HashSet<>();
		methodExceptions.forEach((owner, byKey) -> byKey.forEach((key, excs) ->
		{
			if (!excs.contains("java/lang/Exception") && !excs.contains("java/io/IOException"))
			{
				return;
			}
			// Find all overrides in subclasses. If any subclass override has non-empty
			// exceptions (declares ANYTHING beyond just inheriting), bail — we'd break
			// the override-throws-subset rule.
			boolean safeToStrip = true;
			for (Map.Entry<String, String> superEntry : superNames.entrySet())
			{
				// Walk up from subclass to see if it transitively extends `owner`
				String walker = superEntry.getValue();
				boolean isDescendant = false;
				while (walker != null)
				{
					if (walker.equals(owner))
					{
						isDescendant = true;
						break;
					}
					walker = superNames.get(walker);
				}
				if (!isDescendant)
				{
					continue;
				}
				String subclass = superEntry.getKey();
				Set<String> subMethods = classMethods.get(subclass);
				if (subMethods == null || !subMethods.contains(key))
				{
					continue;
				}
				List<String> subExc = methodExceptions.getOrDefault(subclass, java.util.Collections.emptyMap()).get(key);
				if (subExc != null && !subExc.isEmpty())
				{
					// Subclass declares at least one throws clause. Even if it's
					// `throws Exception` (which we'd also strip on the subclass), the
					// chain may have a sibling subclass with a more-specific checked
					// exception (e.g. LineUnavailableException). Bail to be safe.
					safeToStrip = false;
					break;
				}
			}
			if (safeToStrip)
			{
				strippable.add(owner + "#" + key);
			}
		}));
		return strippable;
	}

	/** Per-call site: the calling method key + the throws set that the call site can
	 *  freely cause without violating Java source rules at the caller. Used to detect
	 *  "this specific INVOKE of method X is covered by an enclosing catch / declared
	 *  throws clause" precisely (the method-level union was over-coarse). */
	private static final class CallSite
	{
		final String callerKey;
		final String calleeKey;
		final Set<String> coveringCatches; // catch types whose try-block covers this insn
		CallSite(String caller, String callee, Set<String> covers)
		{
			this.callerKey = caller;
			this.calleeKey = callee;
			this.coveringCatches = covers;
		}
	}

	/**
	 * Iteratively computes, for each method in the jar, the set of CHECKED exception
	 * types that its body actually causes but the method doesn't declare or catch.
	 * Returns a map of {@code owner#name+desc → required throws set} (only the NEWLY
	 * required ones — original declarations are excluded so the caller doesn't add
	 * duplicates).
	 *
	 * <p>Per-call coverage analysis: for each {@code INVOKE} insn we determine which
	 * tryCatchBlocks bracket it (by instruction position in the method's InsnList) and
	 * use their catch types as that call's coverage. A method-wide {@code catch (Exception)}
	 * shields all calls from propagation; a tiny inner {@code catch (Exception)} only
	 * shields the calls inside its range. The method-level union we tried earlier
	 * over-shielded {@code mj.bx}'s direct JSON calls.</p>
	 *
	 * <p>External callees (stdlib classes not in the jar) are matched against a small
	 * hardcoded throws map below — eg {@code new URL(String)} throws
	 * {@code MalformedURLException}. Without this we'd miss the obfuscator's most
	 * common checked-exception sources entirely.</p>
	 */
	/**
	 * Scans the jar for classes that directly (or via superclass chain) implement an
	 * interface whose name does NOT live in our jar and does NOT start with {@code java/}.
	 * These are runelite-api impls (or similar) whose interface contract is fixed — we
	 * can't add throws to their methods, so the main loop wraps each non-static method's
	 * body in {@code try { ... } catch (Exception e) { throw new RuntimeException(e); }}
	 * to keep the source compilable.
	 */
	/**
	 * Snapshot of the jar's class hierarchy: superclass names + implemented interfaces +
	 * isInterface flag, keyed by internal name. Used by JarAwareClassWriter to resolve
	 * common-superclass queries without bouncing through the host classloader (which
	 * doesn't know the obfuscated client classes).
	 */
	static final class JarHierarchy
	{
		final Map<String, String> superNames = new HashMap<>();
		final Map<String, List<String>> interfaces = new HashMap<>();
		final Set<String> interfaceClasses = new java.util.HashSet<>();
	}

	private static JarHierarchy buildJarHierarchy(Path jarPath) throws IOException
	{
		JarHierarchy h = new JarHierarchy();
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
					new ClassReader(is).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
					if (cn.superName != null) h.superNames.put(cn.name, cn.superName);
					if (cn.interfaces != null && !cn.interfaces.isEmpty())
					{
						h.interfaces.put(cn.name, new ArrayList<>(cn.interfaces));
					}
					if ((cn.access & org.objectweb.asm.Opcodes.ACC_INTERFACE) != 0)
					{
						h.interfaceClasses.add(cn.name);
					}
				}
			}
		}
		return h;
	}

	/**
	 * ClassWriter that knows about the obfuscated client's in-jar class hierarchy.
	 * COMPUTE_FRAMES needs to resolve common-superclass queries for every type-merge
	 * point in the method; the default impl loads classes via Class.forName, which
	 * fails for the in-jar names. We answer in-jar queries from the pre-built hierarchy
	 * map and only delegate to the default for stdlib types.
	 */
	private static final class JarAwareClassWriter extends ClassWriter
	{
		private final JarHierarchy h;

		JarAwareClassWriter(int flags, JarHierarchy h)
		{
			super(flags);
			this.h = h;
		}

		@Override
		protected String getCommonSuperClass(String type1, String type2)
		{
			if (type1.equals(type2)) return type1;
			boolean known1 = h.superNames.containsKey(type1) || h.interfaceClasses.contains(type1);
			boolean known2 = h.superNames.containsKey(type2) || h.interfaceClasses.contains(type2);
			if (!known1 && !known2)
			{
				try
				{
					return super.getCommonSuperClass(type1, type2);
				}
				catch (Throwable t)
				{
					return "java/lang/Object";
				}
			}
			// Walk type1's ancestor chain; first match against type2's chain wins.
			Set<String> chain1 = ancestorChain(type1);
			String cur = type2;
			while (cur != null && !cur.isEmpty())
			{
				if (chain1.contains(cur)) return cur;
				cur = parentOf(cur);
				if ("java/lang/Object".equals(cur)) break;
			}
			return "java/lang/Object";
		}

		private Set<String> ancestorChain(String type)
		{
			Set<String> chain = new java.util.LinkedHashSet<>();
			String cur = type;
			int hops = 0;
			while (cur != null && hops++ < 64 && chain.add(cur))
			{
				if ("java/lang/Object".equals(cur)) break;
				cur = parentOf(cur);
			}
			chain.add("java/lang/Object");
			return chain;
		}

		private String parentOf(String type)
		{
			String s = h.superNames.get(type);
			if (s != null) return s;
			if (h.interfaceClasses.contains(type)) return "java/lang/Object";
			try
			{
				Class<?> c = Class.forName(type.replace('/', '.'), false, getClass().getClassLoader());
				Class<?> sup = c.getSuperclass();
				return sup == null ? null : sup.getName().replace('.', '/');
			}
			catch (Throwable t)
			{
				return "java/lang/Object";
			}
		}
	}

	/** Strips every {@link org.objectweb.asm.tree.FrameNode} from the method's
	 *  instruction list. Called after we mutate control flow in a way the existing
	 *  frames no longer describe; the class is then emitted with
	 *  {@link ClassWriter#COMPUTE_FRAMES} so ASM regenerates them. */
	private static void dropFrameNodes(MethodNode mn)
	{
		if (mn.instructions == null || mn.instructions.size() == 0) return;
		AbstractInsnNode insn = mn.instructions.getFirst();
		while (insn != null)
		{
			AbstractInsnNode next = insn.getNext();
			if (insn instanceof org.objectweb.asm.tree.FrameNode)
			{
				mn.instructions.remove(insn);
			}
			insn = next;
		}
	}

	/**
	 * Walks every method's instruction list looking for {@code INVOKEDYNAMIC} sites whose
	 * bootstrap-method arguments include a method-reference {@link org.objectweb.asm.Handle}
	 * (the lambda-metafactory mechanism javac uses for {@code Foo::bar}). Each handle's
	 * (owner, name, desc) is added to the result. These methods must stay throws-clean —
	 * adding throws makes them incompatible with the functional-interface SAM they're
	 * bound to ("incompatible thrown types in functional expression").
	 */
	private static Set<String> findMethodReferenceTargets(Path jarPath) throws IOException
	{
		Set<String> targets = new java.util.HashSet<>();
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
							if (!(insn instanceof org.objectweb.asm.tree.InvokeDynamicInsnNode)) continue;
							org.objectweb.asm.tree.InvokeDynamicInsnNode idn =
								(org.objectweb.asm.tree.InvokeDynamicInsnNode) insn;
							if (idn.bsmArgs == null) continue;
							for (Object arg : idn.bsmArgs)
							{
								if (arg instanceof org.objectweb.asm.Handle)
								{
									org.objectweb.asm.Handle h = (org.objectweb.asm.Handle) arg;
									targets.add(h.getOwner() + "#" + h.getName() + h.getDesc());
								}
							}
						}
					}
				}
			}
		}
		return targets;
	}

	/**
	 * Narrower set than {@link #findClassesImplementingExternalInterfaces(Path)}: only
	 * classes that DIRECTLY implement an external interface or DIRECTLY extend an external
	 * superclass. Used by {@link UnusedParameters} so a class like `xi` (whose grandparent
	 * implements an external interface via a downstream subclass) doesn't get excluded
	 * from instance-method strips.
	 */
	private static Set<String> findClassesDirectlyImplementingExternal(Path jarPath) throws IOException
	{
		Set<String> classesInJar = new java.util.HashSet<>();
		Map<String, String> superNames = new HashMap<>();
		Map<String, List<String>> ifs = new HashMap<>();
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
					new ClassReader(is).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
					classesInJar.add(cn.name);
					if (cn.superName != null) superNames.put(cn.name, cn.superName);
					if (cn.interfaces != null && !cn.interfaces.isEmpty())
					{
						ifs.put(cn.name, new ArrayList<>(cn.interfaces));
					}
				}
			}
		}
		Set<String> result = new java.util.HashSet<>();
		for (String cls : classesInJar)
		{
			List<String> direct = ifs.get(cls);
			if (direct != null)
			{
				for (String iname : direct)
				{
					if (!classesInJar.contains(iname))
					{
						result.add(cls);
						break;
					}
				}
			}
			String sup = superNames.get(cls);
			if (sup != null && !classesInJar.contains(sup) && !"java/lang/Object".equals(sup))
			{
				result.add(cls);
			}
		}
		return result;
	}

	private static Set<String> findClassesImplementingExternalInterfaces(Path jarPath) throws IOException
	{
		Map<String, String> superNames = new HashMap<>();
		Map<String, List<String>> classInterfaces = new HashMap<>();
		Set<String> classesInJar = new java.util.HashSet<>();
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
					new ClassReader(is).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
					classesInJar.add(cn.name);
					if (cn.superName != null) superNames.put(cn.name, cn.superName);
					if (cn.interfaces != null && !cn.interfaces.isEmpty())
					{
						classInterfaces.put(cn.name, new ArrayList<>(cn.interfaces));
					}
				}
			}
		}
		Set<String> result = new java.util.HashSet<>();
		for (String cls : classesInJar)
		{
			String walker = cls;
			int hops = 0;
			boolean external = false;
			while (walker != null && hops++ < 20)
			{
				// Any interface not defined in this jar is an external contract —
				// includes runelite-api, java/lang/Runnable, java/util/Iterator, etc.
				// We can't widen the throws clause of any method that overrides into
				// such an interface, so the safest thing is to wrap the bodies of all
				// non-static methods in these classes.
				List<String> ifs = classInterfaces.get(walker);
				if (ifs != null)
				{
					for (String iname : ifs)
					{
						if (!classesInJar.contains(iname))
						{
							external = true;
							break;
						}
					}
				}
				if (external) break;
				// Same logic for the superclass chain: extending an external class
				// (e.g. javax.net.ssl.SSLSocket) means every overridden method is
				// also throws-contract-locked.
				String sup = superNames.get(walker);
				if (sup != null && !classesInJar.contains(sup) && !"java/lang/Object".equals(sup))
				{
					external = true;
					break;
				}
				walker = sup;
			}
			if (external) result.add(cls);
		}
		return result;
	}

	/**
	 * Wraps the method's whole body in a try-catch(Exception) that re-throws as a
	 * RuntimeException carrying the original. Doesn't touch the original bytecode of
	 * the body — just adds an outer exception-table entry whose handler appears after
	 * the existing instruction list. Bytecode shape after:
	 * <pre>
	 *   L_start:
	 *     [...original body, ending in RETURN/ATHROW/etc...]
	 *   L_end:
	 *   L_handler:
	 *     ASTORE local
	 *     NEW java/lang/RuntimeException
	 *     DUP
	 *     ALOAD local
	 *     INVOKESPECIAL RuntimeException.&lt;init&gt;(Ljava/lang/Throwable;)V
	 *     ATHROW
	 *   Exception table: L_start, L_end → L_handler  type Exception
	 * </pre>
	 * Returns true if the method had a body to wrap (false for empty bodies, abstract,
	 * native, etc. — those should be filtered by the caller anyway).
	 */
	private static boolean wrapMethodBodyInTryCatch(MethodNode mn)
	{
		if (mn.instructions == null || mn.instructions.size() == 0) return false;
		LabelNode start = new LabelNode();
		LabelNode end = new LabelNode();
		LabelNode handler = new LabelNode();
		mn.instructions.insertBefore(mn.instructions.getFirst(), start);
		mn.instructions.add(end);
		mn.instructions.add(handler);
		int local = mn.maxLocals;
		mn.instructions.add(new VarInsnNode(org.objectweb.asm.Opcodes.ASTORE, local));
		mn.instructions.add(new org.objectweb.asm.tree.TypeInsnNode(
			org.objectweb.asm.Opcodes.NEW, "java/lang/RuntimeException"));
		mn.instructions.add(new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.DUP));
		mn.instructions.add(new VarInsnNode(org.objectweb.asm.Opcodes.ALOAD, local));
		mn.instructions.add(new MethodInsnNode(
			org.objectweb.asm.Opcodes.INVOKESPECIAL,
			"java/lang/RuntimeException", "<init>",
			"(Ljava/lang/Throwable;)V", false));
		mn.instructions.add(new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.ATHROW));
		if (mn.tryCatchBlocks == null) mn.tryCatchBlocks = new ArrayList<>();
		mn.tryCatchBlocks.add(new org.objectweb.asm.tree.TryCatchBlockNode(
			start, end, handler, "java/lang/Throwable"));
		mn.maxLocals = local + 1;
		if (mn.maxStack < 3) mn.maxStack = 3;
		return true;
	}

	private static Map<String, Set<String>> computeRequiredThrows(Path jarPath, Set<String> strippableExceptionThrows) throws IOException
	{
		Map<String, Set<String>> declared = new HashMap<>();
		Map<String, List<CallSite>> methodCallSites = new HashMap<>();
		Map<String, String> superNames = new HashMap<>();
		Map<String, List<String>> classInterfaces = new HashMap<>(); // class → directly implemented interfaces
		Map<String, Set<String>> overrideTargets = new HashMap<>(); // childKey → ancestor method keys
		Set<String> staticMethods = new java.util.HashSet<>(); // keys of static methods

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
					if (cn.superName != null) superNames.put(cn.name, cn.superName);
					if (cn.interfaces != null && !cn.interfaces.isEmpty())
					{
						classInterfaces.put(cn.name, new ArrayList<>(cn.interfaces));
					}
					if (cn.methods == null) continue;
					for (MethodNode mn : cn.methods)
					{
						String key = cn.name + "#" + mn.name + mn.desc;
						if ((mn.access & org.objectweb.asm.Opcodes.ACC_STATIC) != 0)
						{
							staticMethods.add(key);
						}
						Set<String> initialDecl = mn.exceptions == null
							? new java.util.HashSet<>()
							: new java.util.HashSet<>(mn.exceptions);
						// If strip will remove Exception from this method, don't let the
						// propagator see it — otherwise we'd add it to callers whose
						// try-catch would then dangle. IOException is no longer stripped
						// (genuine callers depend on it for I/O try-catch blocks).
						if (strippableExceptionThrows != null && strippableExceptionThrows.contains(key))
						{
							initialDecl.remove("java/lang/Exception");
						}
						declared.put(key, initialDecl);
						if (mn.instructions == null || mn.instructions.size() == 0)
						{
							methodCallSites.put(key, java.util.Collections.emptyList());
							continue;
						}
						// Build position index for try-block bracketing.
						// Pre-compute which try-catch handlers are rethrows: handlers that
						// end in ATHROW without first absorbing the caught exception. Such
						// catches don't actually "cover" anything — the rethrown value
						// still needs to appear in the method's throws clause (javac uses
						// precise rethrow analysis to verify this).
						Set<org.objectweb.asm.tree.TryCatchBlockNode> rethrowHandlers = new java.util.HashSet<>();
						if (mn.tryCatchBlocks != null)
						{
							for (org.objectweb.asm.tree.TryCatchBlockNode tcb : mn.tryCatchBlocks)
							{
								if (isRethrowHandler(mn, tcb))
								{
									rethrowHandlers.add(tcb);
								}
							}
						}

						List<CallSite> mySites = new ArrayList<>();
						for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext())
						{
							int insnIdx = mn.instructions.indexOf(insn);
							String calleeKey = null;
							if (insn instanceof MethodInsnNode)
							{
								MethodInsnNode min = (MethodInsnNode) insn;
								calleeKey = min.owner + "#" + min.name + min.desc;
							}
							else if (insn.getOpcode() == org.objectweb.asm.Opcodes.ATHROW)
							{
								// Direct `throw new X()` patterns count as throwing X for
								// the propagator. The unchecked-in-hierarchy filter below
								// (in the iteration loop) skips RuntimeException/Error
								// subclasses so we don't over-propagate noise.
								String thrownType = directThrowType(insn);
								if (thrownType != null)
								{
									calleeKey = "__direct_throw__#" + thrownType;
								}
							}
							if (calleeKey == null) continue;
							Set<String> covers = new java.util.HashSet<>();
							if (mn.tryCatchBlocks != null)
							{
								for (org.objectweb.asm.tree.TryCatchBlockNode tcb : mn.tryCatchBlocks)
								{
									if (tcb.type == null) continue;
									if (rethrowHandlers.contains(tcb)) continue;
									int startIdx = mn.instructions.indexOf(tcb.start);
									int endIdx = mn.instructions.indexOf(tcb.end);
									if (insnIdx >= startIdx && insnIdx < endIdx)
									{
										covers.add(tcb.type);
									}
								}
							}
							mySites.add(new CallSite(key, calleeKey, covers));
						}
						methodCallSites.put(key, mySites);
					}
				}
			}
		}

		// Resolve per-method override ancestor set so a child's declared throws can be
		// mirrored up the chain. javac rejects "child throws more checked exceptions than
		// parent" — if we add throws X to client.foo(), client extends tf, and tf.foo()
		// is declared without throws X, the override becomes invalid. Mirroring up keeps
		// signatures compatible at compile time. We don't go down: a parent declaring
		// more throws than a child is fine (child throws subset is legal).
		Map<String, Set<String>> overrideAncestors = new HashMap<>();
		for (Map.Entry<String, List<CallSite>> e : methodCallSites.entrySet())
		{
			String key = e.getKey();
			int hash = key.indexOf('#');
			String owner = key.substring(0, hash);
			String nameDesc = key.substring(hash + 1);
			Set<String> ancestors = new java.util.HashSet<>();
			// Walk superclass chain.
			String walker = superNames.get(owner);
			while (walker != null)
			{
				String candidate = walker + "#" + nameDesc;
				if (declared.containsKey(candidate)) ancestors.add(candidate);
				walker = superNames.get(walker);
			}
			// Walk implemented-interface chain too — internal interfaces like `aaj`
			// also constrain the throws of their implementers' overrides, and the
			// override is rejected at recompile if the impl declares more throws than
			// the interface. BFS across class supers + each level's interface list.
			java.util.Deque<String> q = new java.util.ArrayDeque<>();
			Set<String> seen = new java.util.HashSet<>();
			q.add(owner);
			while (!q.isEmpty())
			{
				String cur = q.removeFirst();
				if (!seen.add(cur)) continue;
				List<String> ifs = classInterfaces.get(cur);
				if (ifs != null)
				{
					for (String inf : ifs)
					{
						String candidate = inf + "#" + nameDesc;
						if (declared.containsKey(candidate)) ancestors.add(candidate);
						q.add(inf);
					}
				}
				String sup = superNames.get(cur);
				if (sup != null) q.add(sup);
			}
			if (!ancestors.isEmpty()) overrideAncestors.put(key, ancestors);
		}

		// Iterative propagation: visit every call site, add uncovered checked throws to
		// the caller's declared set. External callees use the hardcoded stdlib table.
		// Synthetic `__direct_throw__#X` keys: register X as the callee's throws set
		// (filtered by isUncheckedInHierarchy in the iteration loop).
		Map<String, Set<String>> stdlibThrows = stdlibThrowsTable();
		for (List<CallSite> sites : methodCallSites.values())
		{
			for (CallSite cs : sites)
			{
				if (cs.calleeKey.startsWith("__direct_throw__#"))
				{
					String thrownType = cs.calleeKey.substring("__direct_throw__#".length());
					if (isUncheckedInHierarchy(thrownType, superNames)) continue;
					declared.computeIfAbsent(cs.calleeKey, k -> java.util.Collections.singleton(thrownType));
				}
			}
		}
		boolean changed = true;
		int iterations = 0;
		while (changed && iterations++ < 50)
		{
			changed = false;
			for (Map.Entry<String, List<CallSite>> e : methodCallSites.entrySet())
			{
				String callerKey = e.getKey();
				Set<String> callerDecl = declared.get(callerKey);
				for (CallSite cs : e.getValue())
				{
					Set<String> calleeThrows = resolveCalleeThrows(cs.calleeKey, declared, stdlibThrows, superNames);
					if (calleeThrows == null || calleeThrows.isEmpty()) continue;
					for (String thrown : calleeThrows)
					{
						if (isLikelyUnchecked(thrown)) continue;
						if (isUncheckedInHierarchy(thrown, superNames)) continue;
						if (callerDecl.contains(thrown)) continue;
						if (catchCovers(cs.coveringCatches, thrown)) continue;
						// NB: we used to skip propagating into external-interface-impl
						// instance methods here, on the theory that we could never add
						// the throws to the signature anyway. But the downstream throws-
						// add step ALREADY gates on `willBeBodyWrapped` to keep those
						// signatures clean — and the body-wrap step needs an accurate
						// `mustThrow` set so it can fire ONLY on methods that actually
						// propagate a checked exception (instead of blanket-wrapping
						// every method of every external-impl class, which produces the
						// `try { return this.f; } catch (Throwable t) { ... }` noise the
						// user complained about). Keep the propagation here; let the
						// downstream steps decide what to materialize.
						callerDecl.add(thrown);
						changed = true;
					}
				}
			}
			// Override-chain mirroring: anything declared on the child propagates up to
			// every ancestor's same-signature method. Repeated each iteration since new
			// throws may surface during propagation.
			for (Map.Entry<String, Set<String>> e : overrideAncestors.entrySet())
			{
				Set<String> childDecl = declared.get(e.getKey());
				if (childDecl == null || childDecl.isEmpty()) continue;
				for (String ancestorKey : e.getValue())
				{
					Set<String> ancDecl = declared.get(ancestorKey);
					if (ancDecl == null) continue;
					for (String t : childDecl)
					{
						if (isLikelyUnchecked(t)) continue;
						if (ancDecl.add(t)) changed = true;
					}
				}
			}
		}

		// Subtract original declarations so the rewrite step only adds new ones.
		Map<String, Set<String>> result = new HashMap<>();
		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry en = it.next();
				if (!en.getName().endsWith(".class")) continue;
				try (InputStream is = jar.getInputStream(en))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
					if (cn.methods == null) continue;
					for (MethodNode mn : cn.methods)
					{
						String key = cn.name + "#" + mn.name + mn.desc;
						Set<String> orig = mn.exceptions == null
							? java.util.Collections.emptySet()
							: new java.util.HashSet<>(mn.exceptions);
						Set<String> finalSet = declared.get(key);
						if (finalSet == null) continue;
						Set<String> added = new java.util.HashSet<>(finalSet);
						added.removeAll(orig);
						if (!added.isEmpty()) result.put(key, added);
					}
				}
			}
		}
		return result;
	}

	/**
	 * Walks back from an {@code ATHROW} to detect the {@code throw new X(...)} pattern
	 * and return X's internal name, or {@code null} if the value on the stack at this
	 * ATHROW didn't come from a freshly-constructed exception. Looks for either
	 * {@code NEW X; DUP; INVOKESPECIAL X.<init>(...)V; ATHROW} (the standard form) or
	 * {@code NEW X; ... INVOKESPECIAL; ASTORE n; ALOAD n; ATHROW} (Vineflower-style
	 * temporaries).
	 */
	private static String directThrowType(AbstractInsnNode athrow)
	{
		AbstractInsnNode prev = athrow.getPrevious();
		while (prev != null && prev.getOpcode() < 0) prev = prev.getPrevious();
		if (prev == null) return null;
		// Common shape: the constructor invokespecial directly precedes the athrow
		// (modulo a checkcast).
		if (prev.getOpcode() == org.objectweb.asm.Opcodes.CHECKCAST)
		{
			prev = prev.getPrevious();
			while (prev != null && prev.getOpcode() < 0) prev = prev.getPrevious();
		}
		if (prev != null && prev.getOpcode() == org.objectweb.asm.Opcodes.INVOKESPECIAL)
		{
			MethodInsnNode ctor = (MethodInsnNode) prev;
			if ("<init>".equals(ctor.name)) return ctor.owner;
		}
		return null;
	}

	/**
	 * Detects whether a try-catch handler is a "rethrow" — handler body that doesn't
	 * absorb the caught exception, only logs/translates and re-throws it. Bytecode shape:
	 * <pre>
	 *   handler:
	 *     ASTORE varN     ; capture caught exception
	 *     [... side effects: logger calls, getters, etc.]
	 *     ALOAD varN      ; reload caught exception
	 *     ATHROW          ; rethrow
	 * </pre>
	 * Optionally a {@code CHECKCAST} between the ALOAD and ATHROW is allowed (Vineflower
	 * sometimes encodes the cast even though it's redundant). Variable mismatch (storing
	 * to varN, throwing varM) is treated as absorption since the original is lost.
	 *
	 * <p>Marking such handlers as "doesn't cover" forces the propagator to keep the
	 * rethrown checked exceptions in the caller's throws clause — same conclusion javac
	 * reaches with its precise-rethrow analysis at recompile time.</p>
	 */
	private static boolean isRethrowHandler(MethodNode mn, org.objectweb.asm.tree.TryCatchBlockNode tcb)
	{
		AbstractInsnNode handler = tcb.handler;
		if (handler == null) return false;
		// Walk to the first real (non-label, non-frame, non-line) instruction.
		AbstractInsnNode first = handler;
		while (first != null && first.getOpcode() < 0) first = first.getNext();
		if (first == null || first.getOpcode() != org.objectweb.asm.Opcodes.ASTORE) return false;
		int capturedLocal = ((VarInsnNode) first).var;
		// Walk forward through the handler body. Track the final ALOAD-then-ATHROW. We
		// don't validate side effects — any number of intermediate insns is fine as long
		// as the handler eventually reaches ATHROW of the same local it stored.
		AbstractInsnNode last = null;
		AbstractInsnNode prev = null;
		for (AbstractInsnNode cur = first.getNext(); cur != null; cur = cur.getNext())
		{
			if (cur.getOpcode() < 0) continue;
			prev = last;
			last = cur;
			if (cur.getOpcode() == org.objectweb.asm.Opcodes.ATHROW) break;
			// If we hit any other control-flow outflow first, this handler isn't a
			// straight rethrow — it absorbs the exception via some other exit.
			int op = cur.getOpcode();
			if (op == org.objectweb.asm.Opcodes.GOTO
				|| op == org.objectweb.asm.Opcodes.RETURN
				|| op == org.objectweb.asm.Opcodes.ARETURN
				|| op == org.objectweb.asm.Opcodes.IRETURN
				|| op == org.objectweb.asm.Opcodes.LRETURN
				|| op == org.objectweb.asm.Opcodes.FRETURN
				|| op == org.objectweb.asm.Opcodes.DRETURN)
			{
				return false;
			}
		}
		if (last == null || last.getOpcode() != org.objectweb.asm.Opcodes.ATHROW) return false;
		// The thing on the stack at ATHROW must be the captured exception. Vineflower
		// may insert a CHECKCAST between the ALOAD and the ATHROW.
		AbstractInsnNode aload = prev;
		if (aload != null && aload.getOpcode() == org.objectweb.asm.Opcodes.CHECKCAST)
		{
			// Walk further back past the checkcast.
			AbstractInsnNode beforeCast = aload.getPrevious();
			while (beforeCast != null && beforeCast.getOpcode() < 0) beforeCast = beforeCast.getPrevious();
			aload = beforeCast;
		}
		if (aload == null || aload.getOpcode() != org.objectweb.asm.Opcodes.ALOAD) return false;
		return ((VarInsnNode) aload).var == capturedLocal;
	}

	/**
	 * True if {@code type} resolves to an unchecked exception by walking the superclass
	 * chain we have. Stops at {@code java/lang/RuntimeException} or {@code java/lang/Error}
	 * (returns true) or at {@code java/lang/Throwable} or anything outside the jar
	 * (returns false — conservatively assume checked since we can't verify).
	 */
	private static boolean isUncheckedInHierarchy(String type, Map<String, String> superNames)
	{
		String walker = type;
		int hops = 0;
		while (walker != null && hops++ < 20)
		{
			if (isLikelyUnchecked(walker)) return true;
			if ("java/lang/Exception".equals(walker) || "java/lang/Throwable".equals(walker)) return false;
			walker = superNames.get(walker);
		}
		return false;
	}

	/**
	 * Conservative block: returns true if some ancestor of {@code callerKey}'s owning
	 * class is *outside* our jar AND owns an interface this class implements (so the
	 * ancestor probably has the same name+desc in its API). The runelite-api interfaces
	 * (eg {@code IndexDataBase}) live in their own jar — adding throws to an impl of
	 * one of those methods would violate the override contract. We can't load the
	 * interface to verify the method signature exists, so we use a heuristic: any
	 * directly-implemented interface that isn't in our jar AND whose name suggests it
	 * comes from runelite-api triggers the block.
	 */
	/**
	 * True if the method's owning class directly implements any interface NOT in our jar
	 * (eg {@code net/runelite/api/Client}). Such interfaces are out of our control —
	 * their methods' declared throws clauses are fixed. Adding new throws to an impl of
	 * one would make the override "throws more than parent", which javac rejects.
	 *
	 * <p>Walks the superclass chain as well so a child class inherits the block from a
	 * parent that directly implements the external interface.</p>
	 */
	private static boolean implementsExternalInterface(
		String callerKey,
		Map<String, String> superNames,
		Map<String, List<String>> classInterfaces)
	{
		int hash = callerKey.indexOf('#');
		String owner = callerKey.substring(0, hash);
		String walker = owner;
		int hops = 0;
		while (walker != null && hops++ < 20)
		{
			List<String> ifs = classInterfaces.get(walker);
			if (ifs != null)
			{
				for (String iname : ifs)
				{
					// External (non-jar, non-stdlib) interface. Block.
					if (!superNames.containsKey(iname)
						&& !classInterfaces.containsKey(iname)
						&& !iname.startsWith("java/"))
					{
						return true;
					}
				}
			}
			walker = superNames.get(walker);
		}
		return false;
	}

	/** True if {@code coveringCatches} contains the thrown type or one of its supertypes
	 *  via the small subset of stdlib hierarchy we know about. {@code Exception} and
	 *  {@code Throwable} catch anything; otherwise we check exact-type equality. */
	/**
	 * Resolves the throws set for a call-site key, walking the callee's superclass chain
	 * when the exact key isn't declared (e.g. `INVOKEVIRTUAL uo.ak(IB)Llu;` but the
	 * method is actually defined on uo's parent `lw`). Falls back to the stdlib throws
	 * table when nothing in-jar matches. Returns null if no declaration is found
	 * anywhere — same contract as the original direct-lookup path.
	 */
	private static Set<String> resolveCalleeThrows(String calleeKey,
		Map<String, Set<String>> declared, Map<String, Set<String>> stdlibThrows,
		Map<String, String> superNames)
	{
		Set<String> direct = declared.get(calleeKey);
		if (direct != null) return direct;
		Set<String> stdlib = stdlibThrows.get(calleeKey);
		if (stdlib != null) return stdlib;
		int hash = calleeKey.indexOf('#');
		if (hash < 0) return null;
		String owner = calleeKey.substring(0, hash);
		String nameDesc = calleeKey.substring(hash + 1);
		String walker = superNames.get(owner);
		int hops = 0;
		while (walker != null && hops++ < 20)
		{
			String key = walker + "#" + nameDesc;
			Set<String> walked = declared.get(key);
			if (walked != null) return walked;
			Set<String> walkedStdlib = stdlibThrows.get(key);
			if (walkedStdlib != null) return walkedStdlib;
			walker = superNames.get(walker);
		}
		return null;
	}

	private static boolean catchCovers(Set<String> coveringCatches, String thrown)
	{
		if (coveringCatches.contains(thrown)) return true;
		if (coveringCatches.contains("java/lang/Exception")
			|| coveringCatches.contains("java/lang/Throwable"))
		{
			return true;
		}
		// IOException catches MalformedURLException and other IO subclasses.
		if ("java/net/MalformedURLException".equals(thrown) && coveringCatches.contains("java/io/IOException"))
		{
			return true;
		}
		return false;
	}

	/**
	 * Throws clauses for stdlib methods the propagator needs to know about. Augment as
	 * new failure modes show up — narrower than reflectively loading the full JDK and
	 * deterministic across machines.
	 */
	private static Map<String, Set<String>> stdlibThrowsTable()
	{
		Map<String, Set<String>> t = new HashMap<>();
		// java.net.URL constructors throw MalformedURLException.
		t.put("java/net/URL#<init>(Ljava/lang/String;)V", java.util.Collections.singleton("java/net/MalformedURLException"));
		t.put("java/net/URL#<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", java.util.Collections.singleton("java/net/MalformedURLException"));
		t.put("java/net/URL#<init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", java.util.Collections.singleton("java/net/MalformedURLException"));
		t.put("java/net/URI#toURL()Ljava/net/URL;", java.util.Collections.singleton("java/net/MalformedURLException"));
		// java.net.URLEncoder.encode throws UnsupportedEncodingException.
		t.put("java/net/URLEncoder#encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", java.util.Collections.singleton("java/io/UnsupportedEncodingException"));
		// java.lang.Class reflection — declared throws are checked.
		t.put("java/lang/Class#forName(Ljava/lang/String;)Ljava/lang/Class;", java.util.Collections.singleton("java/lang/ClassNotFoundException"));
		t.put("java/lang/Class#forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", java.util.Collections.singleton("java/lang/ClassNotFoundException"));
		// guava — ClassPath.from reads jar manifests and throws IOException on missing
		// or malformed inputs. Not in our jar so we hardcode the signature.
		t.put("com/google/common/reflect/ClassPath#from(Ljava/lang/ClassLoader;)Lcom/google/common/reflect/ClassPath;", java.util.Collections.singleton("java/io/IOException"));
		// java.util.concurrent.Future#get throws both InterruptedException AND ExecutionException.
		Set<String> futureGetThrows = new java.util.HashSet<>();
		futureGetThrows.add("java/lang/InterruptedException");
		futureGetThrows.add("java/util/concurrent/ExecutionException");
		t.put("java/util/concurrent/Future#get()Ljava/lang/Object;", futureGetThrows);
		t.put("java/util/concurrent/Future#get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", futureGetThrows);
		// java.io.RandomAccessFile — every read/write/seek throws IOException.
		Set<String> ioex = java.util.Collections.singleton("java/io/IOException");
		t.put("java/io/RandomAccessFile#read([BII)I", ioex);
		t.put("java/io/RandomAccessFile#read()I", ioex);
		t.put("java/io/RandomAccessFile#read([B)I", ioex);
		t.put("java/io/RandomAccessFile#write(I)V", ioex);
		t.put("java/io/RandomAccessFile#write([B)V", ioex);
		t.put("java/io/RandomAccessFile#write([BII)V", ioex);
		t.put("java/io/RandomAccessFile#seek(J)V", ioex);
		t.put("java/io/RandomAccessFile#length()J", ioex);
		t.put("java/io/RandomAccessFile#setLength(J)V", ioex);
		t.put("java/io/RandomAccessFile#close()V", ioex);
		t.put("java/io/RandomAccessFile#<init>(Ljava/lang/String;Ljava/lang/String;)V", java.util.Collections.singleton("java/io/FileNotFoundException"));
		t.put("java/io/RandomAccessFile#<init>(Ljava/io/File;Ljava/lang/String;)V", java.util.Collections.singleton("java/io/FileNotFoundException"));
		return t;
	}

	/**
	 * Heuristic: returns true if {@code internalName} names a class we should treat as
	 * an unchecked exception (a {@code RuntimeException} or {@code Error} subclass) for
	 * purposes of propagation. We can't load the actual class hierarchy at sanitize time
	 * without dragging in the JDK, so we match by name suffix and a small known set.
	 */
	private static boolean isLikelyUnchecked(String internalName)
	{
		if (internalName.equals("java/lang/RuntimeException")
			|| internalName.equals("java/lang/Error")
			|| internalName.equals("java/lang/Throwable"))
		{
			return true;
		}
		// Common stdlib unchecked exceptions referenced by suffix.
		return internalName.startsWith("java/lang/") && (
			internalName.endsWith("RuntimeException")
				|| internalName.endsWith("Error")
				|| internalName.equals("java/lang/NullPointerException")
				|| internalName.equals("java/lang/IllegalStateException")
				|| internalName.equals("java/lang/IllegalArgumentException")
				|| internalName.equals("java/lang/ClassCastException")
				|| internalName.equals("java/lang/ArrayIndexOutOfBoundsException")
				|| internalName.equals("java/lang/IndexOutOfBoundsException")
				|| internalName.equals("java/lang/ArithmeticException")
				|| internalName.equals("java/lang/UnsupportedOperationException")
				|| internalName.equals("java/lang/NumberFormatException")
				|| internalName.equals("java/lang/SecurityException"));
	}

	private static Set<String> findMethodsWithDeadRefs(Path jarPath) throws IOException
	{
		Map<String, Set<String>> declaredFields = new HashMap<>();
		Map<String, Set<String>> declaredMethods = new HashMap<>();
		Map<String, String> superNames = new HashMap<>();

		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry e = it.next();
				if (!e.getName().endsWith(".class"))
				{
					continue;
				}
				try (InputStream is = jar.getInputStream(e))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG);
					if (cn.superName != null)
					{
						superNames.put(cn.name, cn.superName);
					}
					Set<String> fs = declaredFields.computeIfAbsent(cn.name, k -> new java.util.HashSet<>());
					for (FieldNode fn : cn.fields)
					{
						fs.add(fn.name + "\0" + fn.desc);
					}
					Set<String> ms = declaredMethods.computeIfAbsent(cn.name, k -> new java.util.HashSet<>());
					for (MethodNode mn : cn.methods)
					{
						ms.add(mn.name + "\0" + mn.desc);
					}
				}
			}
		}

		Set<String> deadMethods = new java.util.HashSet<>();
		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry e = it.next();
				if (!e.getName().endsWith(".class"))
				{
					continue;
				}
				try (InputStream is = jar.getInputStream(e))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG);
					if (cn.methods == null)
					{
						continue;
					}
					for (MethodNode mn : cn.methods)
					{
						if (mn.instructions == null)
						{
							continue;
						}
						boolean dead = false;
						for (org.objectweb.asm.tree.AbstractInsnNode insn : mn.instructions)
						{
							if (insn instanceof org.objectweb.asm.tree.FieldInsnNode)
							{
								org.objectweb.asm.tree.FieldInsnNode f = (org.objectweb.asm.tree.FieldInsnNode) insn;
								if (declaredFields.containsKey(f.owner)
									&& !resolvesIn(f.owner, f.name, f.desc, declaredFields, superNames))
								{
									dead = true;
									break;
								}
							}
							else if (insn instanceof org.objectweb.asm.tree.MethodInsnNode)
							{
								org.objectweb.asm.tree.MethodInsnNode m = (org.objectweb.asm.tree.MethodInsnNode) insn;
								if ("<init>".equals(m.name) || "<clinit>".equals(m.name))
								{
									continue;
								}
								if (declaredMethods.containsKey(m.owner))
								{
									if (!resolvesIn(m.owner, m.name, m.desc, declaredMethods, superNames))
									{
										dead = true;
										break;
									}
								}
								else if (descriptorReferencesObfuscatedType(m.desc, declaredFields))
								{
									// External owner (e.g. JSObject.getWindow) with an obfuscated
									// argument type — bogus by construction. Standard library
									// methods never take Ltf;-style parameters.
									dead = true;
									break;
								}
							}
						}
						if (dead)
						{
							deadMethods.add(cn.name + "#" + mn.name + mn.desc);
						}
					}
				}
			}
		}
		return deadMethods;
	}

	private static boolean resolvesIn(String owner, String name, String desc,
		Map<String, Set<String>> declared, Map<String, String> superNames)
	{
		String key = name + "\0" + desc;
		String current = owner;
		while (current != null && declared.containsKey(current))
		{
			Set<String> dec = declared.get(current);
			if (dec.contains(key))
			{
				return true;
			}
			current = superNames.get(current);
		}
		// Walked off the jar's classes — the chain ends at an external class. Without the
		// full classpath we can't verify the member exists there, so use a name heuristic:
		// obfuscated short lowercase names (`au`, `rj`, …) never exist on standard Java/AWT
		// classes; longer camelCase / standard names (`getHost`, `iterator`, …) plausibly do.
		if (current == null)
		{
			return false;
		}
		return !looksObfuscated(name);
	}

	private static boolean looksObfuscated(String name)
	{
		if (name == null || name.isEmpty() || name.length() > 4)
		{
			return false;
		}
		for (int i = 0; i < name.length(); i++)
		{
			char c = name.charAt(i);
			if (!(c >= 'a' && c <= 'z'))
			{
				return false;
			}
		}
		return true;
	}

	private static boolean descriptorReferencesObfuscatedType(String desc, Map<String, Set<String>> jarClasses)
	{
		Type method = Type.getMethodType(desc);
		for (Type arg : method.getArgumentTypes())
		{
			if (referencesObfuscatedType(arg, jarClasses))
			{
				return true;
			}
		}
		return referencesObfuscatedType(method.getReturnType(), jarClasses);
	}

	private static boolean referencesObfuscatedType(Type t, Map<String, Set<String>> jarClasses)
	{
		while (t.getSort() == Type.ARRAY)
		{
			t = t.getElementType();
		}
		if (t.getSort() != Type.OBJECT)
		{
			return false;
		}
		String internal = t.getInternalName();
		// Only consider it obfuscated if the type lives in our jar AND the simple name is short/lowercase.
		if (!jarClasses.containsKey(internal))
		{
			return false;
		}
		int slash = internal.lastIndexOf('/');
		String simple = slash < 0 ? internal : internal.substring(slash + 1);
		return looksObfuscated(simple);
	}

	/**
	 * Detects the obfuscator's {@code if (x == null) x.bogus(args)} anti-tamper sites
	 * and replaces the dead {@code INVOKE} (plus any pushed args) with a call to
	 * {@link Object#getClass()} (3 bytecodes: ALOAD, INVOKEVIRTUAL, POP). Two reasons
	 * we need this:
	 * <ol>
	 *   <li>The dead target sometimes declares {@code throws Exception}, propagating
	 *       a checked exception to enclosing methods that don't declare it.</li>
	 *   <li>The dead target may not even exist on the receiver type — the obfuscator
	 *       plants the reference to break decompilers but the verifier never sees it
	 *       because the call is gated by an always-null check.</li>
	 * </ol>
	 * {@code Object.getClass()} exists on every reference type, returns a non-void value
	 * we immediately POP, and still NPEs on a null receiver — identical observable
	 * behaviour to the original "INVOKEVIRTUAL on null receiver".
	 *
	 * <p>The detector matches the canonical shape only:
	 * <pre>
	 *   ALOAD localN
	 *   IFNONNULL skipLabel
	 *   ALOAD localN          ; receiver for the dead invoke
	 *   [args ...]            ; only "safe" arg pushes (loads / constants / GETSTATIC)
	 *   INVOKE{VIRTUAL|INTERFACE|SPECIAL} (returns void OR followed by POP/POP2)
	 *   [other epilogue insns, e.g. RETURN]
	 *   skipLabel:
	 * </pre>
	 * Rejects shapes where an arg push could have side effects we'd be erasing. */
	/**
	 * Stamps {@code @ObfuscatedName}, {@code @ObfuscatedSignature}, and {@code @Implements}
	 * onto the given class so the injector can resolve mixin targets by stable friendly
	 * names instead of (revision-dependent) obfuscated class literals.
	 *
	 * <ul>
	 *   <li>Every class: {@code @ObfuscatedName(internalName)}. If the class implements
	 *       one or more {@code net/runelite/api/*} interfaces (directly OR transitively
	 *       via its supertype chain), also stamps
	 *       {@code @Implements({"Iface1", "Iface2", ...})}.</li>
	 *   <li>Every declared field: {@code @ObfuscatedName(fieldName) + @ObfuscatedSignature(descriptor=fieldDesc)}.</li>
	 *   <li>Every declared method: ditto. Constructors and static initialisers are
	 *       skipped (their names already encode their kind, and they're not addressable
	 *       through {@code @Mixin} anyway).</li>
	 * </ul>
	 *
	 * <p>Returns the number of annotations stamped, for the summary stats line.</p>
	 */
	/** Curated table of (owner, name+desc) → friendly name. The sanitizer stamps
	 *  {@code @Export(friendly)} on each match. Start with Applet override methods on
	 *  {@code client} (whose name+desc are JDK-fixed, so we can recognise them despite
	 *  every other obfuscation noise). Extend liberally as we identify more stable
	 *  members. */
	private static final Map<String, String> EXPORT_TABLE = new HashMap<>();
	static
	{
		// java.applet.Applet lifecycle methods on the obfuscated client.
		EXPORT_TABLE.put("client#init()V", "init");
		EXPORT_TABLE.put("client#start()V", "start");
		EXPORT_TABLE.put("client#stop()V", "stop");
		EXPORT_TABLE.put("client#destroy()V", "destroy");
		EXPORT_TABLE.put("client#update(Ljava/awt/Graphics;)V", "update");
		EXPORT_TABLE.put("client#paint(Ljava/awt/Graphics;)V", "paint");
		// Static field on the obfuscated client carrying the shared central state
		// (initialised once in <clinit>). Used by the @FieldHook smoke test. Key uses
		// the PRE-rename name "aq" — the @ObfuscatedName-recorded original — because the
		// stamp runs before the duplicate-renamer's `_fld` suffix is applied.
		EXPORT_TABLE.put("client#aq:Ldf;", "appletStub");

		// Device-fingerprinting surface — `vu` is the assembly point and `kg#ps` is the
		// static instance that holds it. Exposing every populated field lets a mixin
		// read what Jagex is about to ship to the server during login (machine UUID
		// branches, OS/Java probes, hardware counters, process detection, class signing
		// hash). Keys use pre-rename (single-letter) names because EXPORT_TABLE is
		// consulted before the duplicate-renamer's `_fld` suffix lands.
		EXPORT_TABLE.put("kg#ps:Lvu;", "fingerprint");
		// vu.ak's TRAILING byte param is one of the UnusedParameters strips — the
		// obfuscated jar carries (Lxi;B)V, sanitize rewrites it (and all call sites) to
		// (Lxi;)V. Stamping now runs BEFORE the strip, so the key uses the original
		// pre-strip signature and @ObfuscatedSignature records it likewise.
		EXPORT_TABLE.put("vu#ak(Lxi;B)V", "serializeFingerprint");
		EXPORT_TABLE.put("vu#bt:I", "osType");
		EXPORT_TABLE.put("vu#bv:Z", "arch64");
		EXPORT_TABLE.put("vu#bi:I", "osVersion");
		EXPORT_TABLE.put("vu#bu:I", "javaVendor");
		EXPORT_TABLE.put("vu#bq:I", "maxHeapMb");
		EXPORT_TABLE.put("vu#bg:I", "cpuCount");
		EXPORT_TABLE.put("vu#cd:I", "classSigHash");
		EXPORT_TABLE.put("vu#cf:I", "javaVersionMajor");
		EXPORT_TABLE.put("vu#cx:I", "javaVersionMinor");
		EXPORT_TABLE.put("vu#cs:I", "javaVersionPatch");
		EXPORT_TABLE.put("vu#cr:[I", "versionInts");
		EXPORT_TABLE.put("vu#cv:Ljava/lang/String;", "processName");
		EXPORT_TABLE.put("vu#cy:Ljava/lang/String;", "parentProcessName");
		EXPORT_TABLE.put("vu#cw:Ljava/lang/String;", "jvmArgsPrefix");
	}

	private static int stampObfuscatedAnnotations(ClassNode cn)
	{
		int stamped = 0;
		final String OBF_NAME = "Lnet/runelite/api/annotations/ObfuscatedName;";
		final String OBF_SIG = "Lnet/runelite/api/annotations/ObfuscatedSignature;";
		final String IMPLEMENTS = "Lnet/runelite/api/annotations/Implements;";
		final String EXPORT = "Lnet/runelite/api/annotations/Export;";

		// Class-level @ObfuscatedName.
		if (!hasAnnotation(cn.visibleAnnotations, OBF_NAME))
		{
			org.objectweb.asm.tree.AnnotationNode an =
				new org.objectweb.asm.tree.AnnotationNode(OBF_NAME);
			an.values = new ArrayList<>();
			an.values.add("value");
			an.values.add(cn.name);
			if (cn.visibleAnnotations == null) cn.visibleAnnotations = new ArrayList<>();
			cn.visibleAnnotations.add(an);
			stamped++;
		}
		// Class-level @Implements — collect every runelite-api interface this class
		// implements (transitively via direct interface list only; we'd need a jar-wide
		// hierarchy map to walk supers, which the existing helpers don't expose at this
		// site. Direct interfaces cover the common case where injection targets directly
		// declare `implements Client` etc.).
		if (!hasAnnotation(cn.visibleAnnotations, IMPLEMENTS) && cn.interfaces != null)
		{
			List<String> friendly = new ArrayList<>();
			for (String iface : cn.interfaces)
			{
				if (iface.startsWith("net/runelite/api/"))
				{
					int slash = iface.lastIndexOf('/');
					friendly.add(iface.substring(slash + 1));
				}
			}
			if (!friendly.isEmpty())
			{
				org.objectweb.asm.tree.AnnotationNode an =
					new org.objectweb.asm.tree.AnnotationNode(IMPLEMENTS);
				an.values = new ArrayList<>();
				an.values.add("value");
				an.values.add(friendly);
				cn.visibleAnnotations.add(an);
				stamped++;
			}
		}

		// Field-level annotations.
		if (cn.fields != null)
		{
			for (FieldNode fn : cn.fields)
			{
				if (!hasAnnotation(fn.visibleAnnotations, OBF_NAME))
				{
					org.objectweb.asm.tree.AnnotationNode an =
						new org.objectweb.asm.tree.AnnotationNode(OBF_NAME);
					an.values = new ArrayList<>();
					an.values.add("value");
					an.values.add(fn.name);
					if (fn.visibleAnnotations == null) fn.visibleAnnotations = new ArrayList<>();
					fn.visibleAnnotations.add(an);
					stamped++;
				}
				if (!hasAnnotation(fn.visibleAnnotations, OBF_SIG))
				{
					org.objectweb.asm.tree.AnnotationNode an =
						new org.objectweb.asm.tree.AnnotationNode(OBF_SIG);
					an.values = new ArrayList<>();
					an.values.add("descriptor");
					an.values.add(fn.desc);
					if (fn.signature != null)
					{
						an.values.add("signature");
						an.values.add(fn.signature);
					}
					fn.visibleAnnotations.add(an);
					stamped++;
				}
				// @Export for fields uses an "owner#name:desc" key shape.
				String fkey = cn.name + "#" + fn.name + ":" + fn.desc;
				String ffriendly = EXPORT_TABLE.get(fkey);
				if (ffriendly != null && !hasAnnotation(fn.visibleAnnotations, EXPORT))
				{
					org.objectweb.asm.tree.AnnotationNode an =
						new org.objectweb.asm.tree.AnnotationNode(EXPORT);
					an.values = new ArrayList<>();
					an.values.add("value");
					an.values.add(ffriendly);
					fn.visibleAnnotations.add(an);
					stamped++;
				}
			}
		}

		// Method-level annotations. Skip <init> and <clinit> — not addressable as mixin
		// targets, and the name strings would just be noise.
		if (cn.methods != null)
		{
			for (MethodNode mn : cn.methods)
			{
				if ("<init>".equals(mn.name) || "<clinit>".equals(mn.name)) continue;
				if (!hasAnnotation(mn.visibleAnnotations, OBF_NAME))
				{
					org.objectweb.asm.tree.AnnotationNode an =
						new org.objectweb.asm.tree.AnnotationNode(OBF_NAME);
					an.values = new ArrayList<>();
					an.values.add("value");
					an.values.add(mn.name);
					if (mn.visibleAnnotations == null) mn.visibleAnnotations = new ArrayList<>();
					mn.visibleAnnotations.add(an);
					stamped++;
				}
				if (!hasAnnotation(mn.visibleAnnotations, OBF_SIG))
				{
					org.objectweb.asm.tree.AnnotationNode an =
						new org.objectweb.asm.tree.AnnotationNode(OBF_SIG);
					an.values = new ArrayList<>();
					an.values.add("descriptor");
					an.values.add(mn.desc);
					if (mn.signature != null)
					{
						an.values.add("signature");
						an.values.add(mn.signature);
					}
					mn.visibleAnnotations.add(an);
					stamped++;
				}
				// @Export: stamp the friendly name from the curated EXPORT_TABLE on
				// every member whose (owner#name+desc) key matches. Skipped if the
				// member already has its own @Export (manual curation wins).
				String key = cn.name + "#" + mn.name + mn.desc;
				String friendly = EXPORT_TABLE.get(key);
				if (friendly != null && !hasAnnotation(mn.visibleAnnotations, EXPORT))
				{
					org.objectweb.asm.tree.AnnotationNode an =
						new org.objectweb.asm.tree.AnnotationNode(EXPORT);
					an.values = new ArrayList<>();
					an.values.add("value");
					an.values.add(friendly);
					mn.visibleAnnotations.add(an);
					stamped++;
				}
			}
		}
		return stamped;
	}

	private static boolean hasAnnotation(List<org.objectweb.asm.tree.AnnotationNode> annos, String desc)
	{
		if (annos == null) return false;
		for (org.objectweb.asm.tree.AnnotationNode a : annos)
		{
			if (desc.equals(a.desc)) return true;
		}
		return false;
	}

	@SuppressWarnings("UnusedAssignment")
	private static int rewriteDeadNullCalls(MethodNode mn)
	{
		if (mn.instructions == null || mn.instructions.size() == 0)
		{
			return 0;
		}
		int rewrites = 0;
		AbstractInsnNode insn = mn.instructions.getFirst();
		while (insn != null)
		{
			AbstractInsnNode next = insn.getNext();
			if (insn.getOpcode() == org.objectweb.asm.Opcodes.ALOAD)
			{
				int local = ((VarInsnNode) insn).var;
				AbstractInsnNode jump = realNext(insn);
				if (jump != null && jump.getOpcode() == org.objectweb.asm.Opcodes.IFNONNULL)
				{
					LabelNode skipLabel = ((JumpInsnNode) jump).label;
					AbstractInsnNode receiver = realNext(jump);
					if (receiver != null
						&& receiver.getOpcode() == org.objectweb.asm.Opcodes.ALOAD
						&& ((VarInsnNode) receiver).var == local)
					{
						// Walk forward from `receiver` until we hit the INVOKE or fail.
						AbstractInsnNode scan = realNext(receiver);
						boolean argsArePure = true;
						while (scan != null && !isInvoke(scan))
						{
							if (!isPureArgPush(scan))
							{
								argsArePure = false;
								break;
							}
							scan = realNext(scan);
						}
						if (argsArePure && scan != null && isInvoke(scan))
						{
							MethodInsnNode invoke = (MethodInsnNode) scan;
							AbstractInsnNode after = realNext(invoke);
							Type returnType = Type.getReturnType(invoke.desc);
							int returnPopOpcode = popOpcodeFor(returnType);
							boolean hasReturnPop = after != null && after.getOpcode() == returnPopOpcode && returnPopOpcode != -1;
							AbstractInsnNode afterPop = hasReturnPop ? realNext(after) : after;

							// The terminal-is-RETURN special case folds the dead branch's RETURN
							// (and the skipLabel that gates fall-through) into the removed range
							// and substitutes an unconditional `throw new NullPointerException`.
							// That's only valid when the bogus invoke's RETURN VALUE was the thing
							// being returned — otherwise we'd be deleting the skipLabel that the
							// surviving IFNONNULL still references, and COMPUTE_FRAMES later trips
							// over the dangling label. Restrict to: non-void invoke whose value
							// feeds an immediately-following typed return of the same sort.
							boolean terminalIsReturn = afterPop != null
								&& isReturn(afterPop)
								&& returnType.getSort() != Type.VOID
								&& matchesTypedReturn(afterPop.getOpcode(), returnType);
							AbstractInsnNode lastToRemove = terminalIsReturn
								? afterPop
								: (hasReturnPop ? after : invoke);
							removeRange(mn, receiver, lastToRemove);

							if (terminalIsReturn)
							{
								// new NPE(); throw — 4 insns, no return value needed.
								mn.instructions.insert(jump,
									new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.ATHROW));
								mn.instructions.insert(jump, new MethodInsnNode(
									org.objectweb.asm.Opcodes.INVOKESPECIAL,
									"java/lang/NullPointerException", "<init>",
									"()V", false));
								mn.instructions.insert(jump,
									new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.DUP));
								mn.instructions.insert(jump, new org.objectweb.asm.tree.TypeInsnNode(
									org.objectweb.asm.Opcodes.NEW, "java/lang/NullPointerException"));
								if (mn.maxStack < 2) mn.maxStack = 2;
							}
							else
							{
								// ALOAD local; INVOKEVIRTUAL Object.getClass(); POP — 3
								// insns, still NPEs on null, leaves stack empty so void
								// RETURN or fall-through to the skip target works.
								mn.instructions.insert(jump,
									new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.POP));
								mn.instructions.insert(jump, new MethodInsnNode(
									org.objectweb.asm.Opcodes.INVOKEVIRTUAL,
									"java/lang/Object", "getClass",
									"()Ljava/lang/Class;", false));
								mn.instructions.insert(jump, new VarInsnNode(org.objectweb.asm.Opcodes.ALOAD, local));
								if (mn.maxStack < 1) mn.maxStack = 1;
							}
							rewrites++;
							next = skipLabel;
						}
					}
				}
			}
			insn = next;
		}
		return rewrites;
	}

	/** Next instruction skipping LabelNode/LineNumberNode/FrameNode (zero-impact insns). */
	private static AbstractInsnNode realNext(AbstractInsnNode n)
	{
		AbstractInsnNode cur = n.getNext();
		while (cur != null && cur.getOpcode() < 0)
		{
			cur = cur.getNext();
		}
		return cur;
	}

	private static boolean isInvoke(AbstractInsnNode n)
	{
		int op = n.getOpcode();
		return op == org.objectweb.asm.Opcodes.INVOKEVIRTUAL
			|| op == org.objectweb.asm.Opcodes.INVOKEINTERFACE
			|| op == org.objectweb.asm.Opcodes.INVOKESPECIAL;
	}

	/** Any of the *RETURN opcodes — including void RETURN — that terminate a method. */
	private static boolean isReturn(AbstractInsnNode n)
	{
		int op = n.getOpcode();
		return op >= org.objectweb.asm.Opcodes.IRETURN && op <= org.objectweb.asm.Opcodes.RETURN;
	}

	/** True if the given *RETURN opcode would consume a value of the given Type from
	 *  the stack — i.e. {@code returnType.getSort()} matches the typed return op. */
	private static boolean matchesTypedReturn(int opcode, Type returnType)
	{
		switch (returnType.getSort())
		{
			case Type.BOOLEAN:
			case Type.BYTE:
			case Type.CHAR:
			case Type.SHORT:
			case Type.INT:
				return opcode == org.objectweb.asm.Opcodes.IRETURN;
			case Type.LONG:
				return opcode == org.objectweb.asm.Opcodes.LRETURN;
			case Type.FLOAT:
				return opcode == org.objectweb.asm.Opcodes.FRETURN;
			case Type.DOUBLE:
				return opcode == org.objectweb.asm.Opcodes.DRETURN;
			case Type.OBJECT:
			case Type.ARRAY:
				return opcode == org.objectweb.asm.Opcodes.ARETURN;
			default:
				return false;
		}
	}

	/**
	 * Conservative whitelist of insn opcodes that can appear between the receiver ALOAD
	 * and the bogus INVOKE without having any side effect we'd lose when we erase them.
	 * If a method call, store, array op, etc. shows up we bail.
	 */
	private static boolean isPureArgPush(AbstractInsnNode n)
	{
		int op = n.getOpcode();
		// Loads (constants and locals).
		if ((op >= org.objectweb.asm.Opcodes.ACONST_NULL && op <= org.objectweb.asm.Opcodes.SIPUSH)
			|| (op >= org.objectweb.asm.Opcodes.ILOAD && op <= org.objectweb.asm.Opcodes.ALOAD)
			|| op == org.objectweb.asm.Opcodes.LDC)
		{
			return true;
		}
		// GETSTATIC: reading a static field has no side effects we care about; the obfuscator
		// frequently uses it to source bogus constants for the dead call.
		if (op == org.objectweb.asm.Opcodes.GETSTATIC)
		{
			return true;
		}
		// Numeric conversions / simple arithmetic on already-pushed values are fine.
		if (op >= org.objectweb.asm.Opcodes.I2L && op <= org.objectweb.asm.Opcodes.I2S)
		{
			return true;
		}
		return false;
	}

	private static int popOpcodeFor(Type ret)
	{
		switch (ret.getSize())
		{
			case 0: return -1; // void: nothing to pop
			case 1: return org.objectweb.asm.Opcodes.POP;
			case 2: return org.objectweb.asm.Opcodes.POP2;
			default: return -1;
		}
	}

	private static void removeRange(MethodNode mn, AbstractInsnNode first, AbstractInsnNode last)
	{
		AbstractInsnNode cur = first;
		while (cur != null)
		{
			AbstractInsnNode nx = cur.getNext();
			mn.instructions.remove(cur);
			if (cur == last)
			{
				break;
			}
			cur = nx;
		}
	}

	/**
	 * Port of meteor's CastNull. Drops each {@code CHECKCAST T} whose stack input is a
	 * literal {@code ACONST_NULL} — verifier-legal (null is assignable to every reference
	 * type) but Vineflower decompiles them as ugly {@code (T) null} casts. Local pattern,
	 * no execution model needed: ACONST_NULL has no side effects and pushes exactly one
	 * value, so an immediately-following CHECKCAST always operates on that null.
	 */
	private static int removeNullChecksCasts(MethodNode mn)
	{
		if (mn.instructions == null || mn.instructions.size() == 0) return 0;
		int removed = 0;
		AbstractInsnNode insn = mn.instructions.getFirst();
		while (insn != null)
		{
			AbstractInsnNode next = insn.getNext();
			if (insn.getOpcode() == org.objectweb.asm.Opcodes.ACONST_NULL)
			{
				AbstractInsnNode after = realNext(insn);
				while (after != null && after.getOpcode() == org.objectweb.asm.Opcodes.CHECKCAST)
				{
					AbstractInsnNode toDrop = after;
					after = realNext(after);
					mn.instructions.remove(toDrop);
					removed++;
				}
			}
			insn = next;
		}
		return removed;
	}

	/**
	 * Port of meteor's IllegalStateExceptions anti-tamper pass. Recognises the shape
	 * <pre>
	 *   IF_xxx skipLabel
	 *   NEW java/lang/IllegalStateException
	 *   [DUP / arg pushes ...]
	 *   INVOKESPECIAL IllegalStateException.&lt;init&gt;(...)
	 *   ATHROW
	 *   skipLabel:
	 * </pre>
	 * and replaces the conditional jump with an unconditional GOTO to skipLabel, then
	 * removes everything from the NEW through the ATHROW. The IFs are always evaluated
	 * to "false" by the runtime check the obfuscator plants in front, but Vineflower
	 * can't prove it and emits noisy guarded blocks.
	 *
	 * <p>Note that meteor uses symbolic execution to confirm the IF is anti-tamper;
	 * we use a strict structural match — the NEW IllegalStateException sandwich
	 * immediately after the conditional is the load-bearing signal.</p>
	 */
	private static int elideIllegalStateExceptionThrows(MethodNode mn)
	{
		if (mn.instructions == null || mn.instructions.size() == 0) return 0;
		int rewrites = 0;
		AbstractInsnNode insn = mn.instructions.getFirst();
		while (insn != null)
		{
			AbstractInsnNode next = insn.getNext();
			if (insn instanceof JumpInsnNode && isConditionalJump(insn.getOpcode()))
			{
				LabelNode target = ((JumpInsnNode) insn).label;
				int opcode = insn.getOpcode();
				AbstractInsnNode after = realNext(insn);
				if (after instanceof org.objectweb.asm.tree.TypeInsnNode
					&& after.getOpcode() == org.objectweb.asm.Opcodes.NEW
					&& "java/lang/IllegalStateException".equals(((org.objectweb.asm.tree.TypeInsnNode) after).desc))
				{
					AbstractInsnNode athrow = findAthrowAfterNew(after);
					if (athrow != null)
					{
						// Replace the conditional with GOTO. We DON'T delete the NEW..ATHROW
						// region — those instructions and any FrameNodes surrounding them
						// remain valid (frames describe the original code), and they become
						// unreachable so Vineflower drops them at decompile time.
						// For the conditional's operands: if they're pure single-insn pushes
						// (ILOAD/GETSTATIC/LDC/ICONST/BIPUSH/SIPUSH/etc.), DELETE them too —
						// otherwise UnusedParameters later sees the ILOAD as a "live read" of
						// the param slot even though the value is being discarded. If we can't
						// confirm purity, fall back to inserting POPs to match the conditional's
						// stack consumption.
						int conditionalStackPops = conditionalJumpStackPops(opcode);
						AbstractInsnNode[] operandPushes = findPureOperandPushes(insn, conditionalStackPops);
						JumpInsnNode gotoInsn = new JumpInsnNode(org.objectweb.asm.Opcodes.GOTO, target);
						mn.instructions.set(insn, gotoInsn);
						if (operandPushes != null)
						{
							for (AbstractInsnNode push : operandPushes)
							{
								mn.instructions.remove(push);
							}
						}
						else
						{
							for (int p = 0; p < conditionalStackPops; p++)
							{
								mn.instructions.insertBefore(gotoInsn,
									new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.POP));
							}
						}
						rewrites++;
					}
				}
			}
			insn = next;
		}
		return rewrites;
	}

	/**
	 * Returns the N most recent pure single-insn value pushes feeding {@code jump} (where
	 * N == {@code conditionalStackPops}), or null if any of those positions isn't a pure
	 * push. "Pure" means the instruction loads / pushes a value with no side effects:
	 * ILOAD/ALOAD/FLOAD/DLOAD/LLOAD, GETSTATIC, LDC, ICONST_x/BIPUSH/SIPUSH/etc., or
	 * common numeric conversions.
	 */
	private static AbstractInsnNode[] findPureOperandPushes(AbstractInsnNode jump, int n)
	{
		AbstractInsnNode[] result = new AbstractInsnNode[n];
		AbstractInsnNode cur = realPrev(jump);
		for (int i = 0; i < n; i++)
		{
			if (cur == null) return null;
			if (!isPureSinglePush(cur)) return null;
			result[i] = cur;
			cur = realPrev(cur);
		}
		return result;
	}

	private static AbstractInsnNode realPrev(AbstractInsnNode n)
	{
		AbstractInsnNode cur = n.getPrevious();
		while (cur != null && cur.getOpcode() < 0) cur = cur.getPrevious();
		return cur;
	}

	private static boolean isPureSinglePush(AbstractInsnNode n)
	{
		int op = n.getOpcode();
		if (op == -1) return false;
		// Constant pushes.
		if (op >= org.objectweb.asm.Opcodes.ACONST_NULL && op <= org.objectweb.asm.Opcodes.SIPUSH) return true;
		// Loads.
		if (op >= org.objectweb.asm.Opcodes.ILOAD && op <= org.objectweb.asm.Opcodes.ALOAD) return true;
		// LDC.
		if (n instanceof org.objectweb.asm.tree.LdcInsnNode) return true;
		// GETSTATIC (no side effects we care about for a discarded conditional).
		if (op == org.objectweb.asm.Opcodes.GETSTATIC) return true;
		return false;
	}

	private static boolean isConditionalJump(int opcode)
	{
		return (opcode >= org.objectweb.asm.Opcodes.IFEQ && opcode <= org.objectweb.asm.Opcodes.IF_ACMPNE)
			|| opcode == org.objectweb.asm.Opcodes.IFNULL
			|| opcode == org.objectweb.asm.Opcodes.IFNONNULL;
	}

	/** Number of stack slots the given conditional-jump opcode pops. */
	private static int conditionalJumpStackPops(int opcode)
	{
		switch (opcode)
		{
			case org.objectweb.asm.Opcodes.IFEQ:
			case org.objectweb.asm.Opcodes.IFNE:
			case org.objectweb.asm.Opcodes.IFLT:
			case org.objectweb.asm.Opcodes.IFGE:
			case org.objectweb.asm.Opcodes.IFGT:
			case org.objectweb.asm.Opcodes.IFLE:
			case org.objectweb.asm.Opcodes.IFNULL:
			case org.objectweb.asm.Opcodes.IFNONNULL:
				return 1;
			case org.objectweb.asm.Opcodes.IF_ICMPEQ:
			case org.objectweb.asm.Opcodes.IF_ICMPNE:
			case org.objectweb.asm.Opcodes.IF_ICMPLT:
			case org.objectweb.asm.Opcodes.IF_ICMPGE:
			case org.objectweb.asm.Opcodes.IF_ICMPGT:
			case org.objectweb.asm.Opcodes.IF_ICMPLE:
			case org.objectweb.asm.Opcodes.IF_ACMPEQ:
			case org.objectweb.asm.Opcodes.IF_ACMPNE:
				return 2;
			default:
				return 0;
		}
	}

	/** Walk forward at most ~16 insns from a NEW IllegalStateException, returning the
	 *  paired ATHROW if the intervening ops are a constructor-call sandwich. Returns
	 *  null on anything weird so we don't accidentally rewrite real code. */
	private static AbstractInsnNode findAthrowAfterNew(AbstractInsnNode newInsn)
	{
		AbstractInsnNode cur = realNext(newInsn);
		int hops = 0;
		boolean sawInit = false;
		while (cur != null && hops++ < 16)
		{
			int op = cur.getOpcode();
			if (op == org.objectweb.asm.Opcodes.INVOKESPECIAL
				&& cur instanceof MethodInsnNode
				&& "java/lang/IllegalStateException".equals(((MethodInsnNode) cur).owner)
				&& "<init>".equals(((MethodInsnNode) cur).name))
			{
				sawInit = true;
				cur = realNext(cur);
				continue;
			}
			if (op == org.objectweb.asm.Opcodes.ATHROW && sawInit)
			{
				return cur;
			}
			// Tolerate DUP / arg pushes (constants, locals, GETSTATIC, conversions).
			if (op == org.objectweb.asm.Opcodes.DUP
				|| (op >= org.objectweb.asm.Opcodes.ACONST_NULL && op <= org.objectweb.asm.Opcodes.SIPUSH)
				|| (op >= org.objectweb.asm.Opcodes.ILOAD && op <= org.objectweb.asm.Opcodes.ALOAD)
				|| op == org.objectweb.asm.Opcodes.LDC
				|| op == org.objectweb.asm.Opcodes.GETSTATIC
				|| (op >= org.objectweb.asm.Opcodes.I2L && op <= org.objectweb.asm.Opcodes.I2S))
			{
				cur = realNext(cur);
				continue;
			}
			return null;
		}
		return null;
	}

	/**
	 * Port of meteor's RuntimeExceptions. Strips {@code catch (RuntimeException)} handler
	 * entries from the exception table. The obfuscator plants these to inflate code blocks
	 * and they decompile to confusing try/catch noise. The body bytecode of the catch
	 * handler itself is left in place — if it was only reachable from the now-deleted
	 * handler edge, the subsequent UnreachedCode-equivalent (or javac at recompile) will
	 * tidy it.
	 *
	 * <p>Caller excludes {@code client.init} which keeps one such handler intentionally
	 * for surfacing fatal client errors.</p>
	 */
	private static int stripRuntimeExceptionHandlers(MethodNode mn)
	{
		if (mn.tryCatchBlocks == null || mn.tryCatchBlocks.isEmpty()) return 0;
		int removed = 0;
		java.util.Iterator<org.objectweb.asm.tree.TryCatchBlockNode> it = mn.tryCatchBlocks.iterator();
		while (it.hasNext())
		{
			org.objectweb.asm.tree.TryCatchBlockNode tcb = it.next();
			if ("java/lang/RuntimeException".equals(tcb.type))
			{
				it.remove();
				removed++;
			}
		}
		return removed;
	}

	private static void replaceWithThrowStub(MethodNode mn)
	{
		mn.instructions.clear();
		if (mn.tryCatchBlocks != null)
		{
			mn.tryCatchBlocks.clear();
		}
		if (mn.localVariables != null)
		{
			mn.localVariables.clear();
		}
		mn.instructions.add(new org.objectweb.asm.tree.TypeInsnNode(
			org.objectweb.asm.Opcodes.NEW, "java/lang/NoSuchMethodError"));
		mn.instructions.add(new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.DUP));
		mn.instructions.add(new org.objectweb.asm.tree.LdcInsnNode("sanitized: dead bytecode referenced nonexistent symbol"));
		mn.instructions.add(new org.objectweb.asm.tree.MethodInsnNode(
			org.objectweb.asm.Opcodes.INVOKESPECIAL,
			"java/lang/NoSuchMethodError", "<init>", "(Ljava/lang/String;)V", false));
		mn.instructions.add(new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.ATHROW));
		mn.maxStack = 3;
		mn.maxLocals = Type.getMethodType(mn.desc).getArgumentTypes().length
			+ ((mn.access & org.objectweb.asm.Opcodes.ACC_STATIC) != 0 ? 0 : 1);
	}

	private static final class MissingRef
	{
		final String name;
		final String desc;
		final boolean isField;
		final boolean isStatic;

		MissingRef(String name, String desc, boolean isField, boolean isStatic)
		{
			this.name = name;
			this.desc = desc;
			this.isField = isField;
			this.isStatic = isStatic;
		}

		@Override
		public boolean equals(Object o)
		{
			if (!(o instanceof MissingRef))
			{
				return false;
			}
			MissingRef m = (MissingRef) o;
			return isField == m.isField && isStatic == m.isStatic && name.equals(m.name) && desc.equals(m.desc);
		}

		@Override
		public int hashCode()
		{
			return java.util.Objects.hash(name, desc, isField, isStatic);
		}
	}

	private static Map<String, List<MissingRef>> findMissingRefs(Path jarPath) throws IOException
	{
		// owner → set of (name, desc) tuples actually declared
		Map<String, Set<String>> declaredFields = new HashMap<>();
		Map<String, Set<String>> declaredMethods = new HashMap<>();
		Map<String, String> superNames = new HashMap<>();
		// owner → list of refs and whether they are field/static
		Map<String, Set<MissingRef>> ownerRefs = new HashMap<>();

		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry e = it.next();
				if (!e.getName().endsWith(".class"))
				{
					continue;
				}
				try (InputStream is = jar.getInputStream(e))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG);
					if (cn.superName != null)
					{
						superNames.put(cn.name, cn.superName);
					}
					Set<String> fs = declaredFields.computeIfAbsent(cn.name, k -> new java.util.HashSet<>());
					for (FieldNode fn : cn.fields)
					{
						fs.add(fn.name + "\0" + fn.desc);
					}
					Set<String> ms = declaredMethods.computeIfAbsent(cn.name, k -> new java.util.HashSet<>());
					for (MethodNode mn : cn.methods)
					{
						ms.add(mn.name + "\0" + mn.desc);
					}
					if (cn.methods == null)
					{
						continue;
					}
					for (MethodNode mn : cn.methods)
					{
						if (mn.instructions == null)
						{
							continue;
						}
						for (org.objectweb.asm.tree.AbstractInsnNode insn : mn.instructions)
						{
							if (insn instanceof org.objectweb.asm.tree.FieldInsnNode)
							{
								org.objectweb.asm.tree.FieldInsnNode f = (org.objectweb.asm.tree.FieldInsnNode) insn;
								boolean isStatic = insn.getOpcode() == org.objectweb.asm.Opcodes.GETSTATIC
									|| insn.getOpcode() == org.objectweb.asm.Opcodes.PUTSTATIC;
								ownerRefs.computeIfAbsent(f.owner, k -> new java.util.HashSet<>())
									.add(new MissingRef(f.name, f.desc, true, isStatic));
							}
							else if (insn instanceof org.objectweb.asm.tree.MethodInsnNode)
							{
								org.objectweb.asm.tree.MethodInsnNode m = (org.objectweb.asm.tree.MethodInsnNode) insn;
								if ("<init>".equals(m.name) || "<clinit>".equals(m.name))
								{
									continue;
								}
								boolean isStatic = insn.getOpcode() == org.objectweb.asm.Opcodes.INVOKESTATIC;
								ownerRefs.computeIfAbsent(m.owner, k -> new java.util.HashSet<>())
									.add(new MissingRef(m.name, m.desc, false, isStatic));
							}
						}
					}
				}
			}
		}

		Map<String, List<MissingRef>> result = new HashMap<>();
		for (Map.Entry<String, Set<MissingRef>> e : ownerRefs.entrySet())
		{
			String owner = e.getKey();
			// Only stub on classes that exist in this jar — external refs (e.g. java.* or
			// other libraries) don't need stubbing here.
			if (!declaredFields.containsKey(owner) && !declaredMethods.containsKey(owner))
			{
				continue;
			}
			for (MissingRef ref : e.getValue())
			{
				String key = ref.name + "\0" + ref.desc;
				boolean found = false;
				String current = owner;
				while (current != null)
				{
					Set<String> dec = ref.isField ? declaredFields.get(current) : declaredMethods.get(current);
					if (dec != null && dec.contains(key))
					{
						found = true;
						break;
					}
					current = superNames.get(current);
				}
				if (!found)
				{
					result.computeIfAbsent(owner, k -> new ArrayList<>()).add(ref);
				}
			}
		}
		return result;
	}

	private static boolean hasMethod(ClassNode cn, String name, String desc)
	{
		if (cn.methods == null)
		{
			return false;
		}
		for (MethodNode mn : cn.methods)
		{
			if (mn.name.equals(name) && mn.desc.equals(desc))
			{
				return true;
			}
		}
		return false;
	}

	// Build `public T findByName(String s) { return (T) super.findByName(s); }` where T is
	// the parameterized element type (e.g. FriendsChatMember). Calls the inherited
	// `Nameable findByName(String)` on the same instance, then CHECKCASTs to T. This is
	// the implicit covariant bridge javac would generate from a parameterized
	// `implements NameableContainer<T>` declaration — the obfuscated bytecode omits it
	// because the raw NameableContainer interface was dropped above.
	// Build `public T[] getMembers() { return (T[]) super.getMembers(); }` — same shape as
	// makeFindByNameBridge but for the array-returning getMembers contract.
	private static MethodNode makeGetMembersBridge(String ownerInternal, String elementTypeInternal)
	{
		MethodNode mn = new MethodNode(
			org.objectweb.asm.Opcodes.ACC_PUBLIC,
			"getMembers",
			"()[L" + elementTypeInternal + ";",
			null, null);
		mn.instructions.add(new org.objectweb.asm.tree.VarInsnNode(org.objectweb.asm.Opcodes.ALOAD, 0));
		mn.instructions.add(new org.objectweb.asm.tree.MethodInsnNode(
			org.objectweb.asm.Opcodes.INVOKEVIRTUAL, ownerInternal,
			"getMembers", "()[Lnet/runelite/api/Nameable;", false));
		mn.instructions.add(new org.objectweb.asm.tree.TypeInsnNode(
			org.objectweb.asm.Opcodes.CHECKCAST, "[L" + elementTypeInternal + ";"));
		mn.instructions.add(new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.ARETURN));
		mn.maxStack = 1;
		mn.maxLocals = 1;
		return mn;
	}

	private static MethodNode makeFindByNameBridge(String ownerInternal, String elementTypeInternal)
	{
		MethodNode mn = new MethodNode(
			org.objectweb.asm.Opcodes.ACC_PUBLIC,
			"findByName",
			"(Ljava/lang/String;)L" + elementTypeInternal + ";",
			null, null);
		mn.instructions.add(new org.objectweb.asm.tree.VarInsnNode(org.objectweb.asm.Opcodes.ALOAD, 0));
		mn.instructions.add(new org.objectweb.asm.tree.VarInsnNode(org.objectweb.asm.Opcodes.ALOAD, 1));
		// Invoke `findByName(String)` on this — virtual dispatch resolves to the inherited
		// Nameable-typed impl. Return type Nameable on the stack.
		mn.instructions.add(new org.objectweb.asm.tree.MethodInsnNode(
			org.objectweb.asm.Opcodes.INVOKEVIRTUAL, ownerInternal,
			"findByName", "(Ljava/lang/String;)Lnet/runelite/api/Nameable;", false));
		mn.instructions.add(new org.objectweb.asm.tree.TypeInsnNode(
			org.objectweb.asm.Opcodes.CHECKCAST, elementTypeInternal));
		mn.instructions.add(new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.ARETURN));
		mn.maxStack = 2;
		mn.maxLocals = 2;
		return mn;
	}

	// Returns true if cn directly lists Nameable or any of the runelite-api interfaces
	// that transitively extend Nameable (Ignore, ChatPlayer, ClanChannelMember,
	// FriendsChatMember, Friend). The list is hard-coded — the api source isn't part of
	// the obfuscated jar so we can't walk it dynamically, and these are the only
	// Nameable-extending interfaces actually used.
	private static final Set<String> NAMEABLE_DERIVED_IFACES = Set.of(
		"net/runelite/api/Nameable",
		"net/runelite/api/Ignore",
		"net/runelite/api/ChatPlayer",
		"net/runelite/api/FriendsChatMember",
		"net/runelite/api/Friend",
		"net/runelite/api/clan/ClanChannelMember"
	);

	private static boolean implementsNameableTransitive(ClassNode cn)
	{
		if (cn.interfaces == null) return false;
		for (String iface : cn.interfaces)
		{
			if (NAMEABLE_DERIVED_IFACES.contains(iface))
			{
				return true;
			}
		}
		return false;
	}

	private static MethodNode makeNameableCompareToBridge(String ownerInternal)
	{
		MethodNode mn = new MethodNode(
			org.objectweb.asm.Opcodes.ACC_PUBLIC | org.objectweb.asm.Opcodes.ACC_SYNTHETIC | org.objectweb.asm.Opcodes.ACC_BRIDGE,
			"compareTo",
			"(Lnet/runelite/api/Nameable;)I",
			null, null);
		mn.instructions.add(new org.objectweb.asm.tree.VarInsnNode(org.objectweb.asm.Opcodes.ALOAD, 0));
		mn.instructions.add(new org.objectweb.asm.tree.VarInsnNode(org.objectweb.asm.Opcodes.ALOAD, 1));
		mn.instructions.add(new org.objectweb.asm.tree.MethodInsnNode(
			org.objectweb.asm.Opcodes.INVOKEVIRTUAL, ownerInternal,
			"compareTo", "(Ljava/lang/Object;)I", false));
		mn.instructions.add(new org.objectweb.asm.tree.InsnNode(org.objectweb.asm.Opcodes.IRETURN));
		mn.maxStack = 2;
		mn.maxLocals = 2;
		return mn;
	}

	private static boolean isValidAnnotationMember(MethodNode mn)
	{
		// Annotation members must be abstract, take no parameters, return a primitive,
		// String, Class, enum, annotation, or array of any of those — and must not be
		// static, synchronized, final, native, or have a body.
		if ((mn.access & (org.objectweb.asm.Opcodes.ACC_STATIC
			| org.objectweb.asm.Opcodes.ACC_SYNCHRONIZED
			| org.objectweb.asm.Opcodes.ACC_FINAL
			| org.objectweb.asm.Opcodes.ACC_NATIVE)) != 0)
		{
			return false;
		}
		if ("<init>".equals(mn.name) || "<clinit>".equals(mn.name))
		{
			return false;
		}
		Type type = Type.getMethodType(mn.desc);
		if (type.getArgumentTypes().length > 0)
		{
			return false;
		}
		return isValidAnnotationReturnType(type.getReturnType());
	}

	private static boolean isValidAnnotationReturnType(Type t)
	{
		if (t.getSort() == Type.ARRAY)
		{
			return isValidAnnotationReturnType(t.getElementType());
		}
		switch (t.getSort())
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
			case Type.OBJECT:
				String n = t.getInternalName();
				return "java/lang/String".equals(n) || "java/lang/Class".equals(n);
			default:
				return false;
		}
	}

	private static Set<String> findMutableFinalFields(Path jarPath) throws IOException
	{
		Set<String> result = new java.util.HashSet<>();
		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry e = it.next();
				if (!e.getName().endsWith(".class"))
				{
					continue;
				}
				try (InputStream is = jar.getInputStream(e))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG);
					if (cn.methods == null)
					{
						continue;
					}
					for (MethodNode mn : cn.methods)
					{
						boolean isInitializer = "<clinit>".equals(mn.name) || "<init>".equals(mn.name);
						if (mn.instructions == null)
						{
							continue;
						}
						for (org.objectweb.asm.tree.AbstractInsnNode insn : mn.instructions)
						{
							int op = insn.getOpcode();
							if (op != org.objectweb.asm.Opcodes.PUTSTATIC && op != org.objectweb.asm.Opcodes.PUTFIELD)
							{
								continue;
							}
							org.objectweb.asm.tree.FieldInsnNode f = (org.objectweb.asm.tree.FieldInsnNode) insn;
							// A static field assigned anywhere but its own <clinit> needs ACC_FINAL stripped;
							// an instance field assigned anywhere but its own <init> needs it stripped.
							boolean ownerSelf = cn.name.equals(f.owner);
							boolean isFromOwnInitializer = ownerSelf && isInitializer;
							if (!isFromOwnInitializer)
							{
								result.add(f.owner + "." + f.name + ":" + f.desc);
							}
						}
					}
				}
			}
		}
		return result;
	}

	// Pre-scans the jar once to identify (owner, name, desc) triples whose source-level Java
	// representation would collide — fields with the same name but different descriptors, or
	// methods with the same name+params but different return type — and assigns each one a
	// deterministic suffix derived from the descriptor.
	private static SanitizationPlan buildDuplicateRenamer(Path jarPath, Stats stats) throws IOException
	{
		Map<String, Map<String, List<String>>> fieldsByOwner = new HashMap<>();
		Map<String, Map<String, List<String>>> methodsByOwner = new HashMap<>();
		Set<String> classSimpleNames = new java.util.HashSet<>();
		Map<String, String> superNames = new HashMap<>();
		Map<String, List<String>> ifacesByClass = new HashMap<>();
		Set<String> staticMethods = new java.util.HashSet<>();
		Set<String> interfaceClassNames = new java.util.HashSet<>();

		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry e = it.next();
				if (!e.getName().endsWith(".class"))
				{
					continue;
				}
				try (InputStream is = jar.getInputStream(e))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG);

					int slash = cn.name.lastIndexOf('/');
					classSimpleNames.add(slash < 0 ? cn.name : cn.name.substring(slash + 1));
					if (cn.superName != null)
					{
						superNames.put(cn.name, cn.superName);
					}
					if (cn.interfaces != null)
					{
						ifacesByClass.put(cn.name, new ArrayList<>(cn.interfaces));
					}
					if ((cn.access & org.objectweb.asm.Opcodes.ACC_INTERFACE) != 0)
					{
						interfaceClassNames.add(cn.name);
					}

					Map<String, List<String>> fields = fieldsByOwner.computeIfAbsent(cn.name, k -> new HashMap<>());
					for (FieldNode fn : cn.fields)
					{
						fields.computeIfAbsent(fn.name, k -> new ArrayList<>()).add(fn.desc);
					}

					Map<String, List<String>> methods = methodsByOwner.computeIfAbsent(cn.name, k -> new HashMap<>());
					for (MethodNode mn : cn.methods)
					{
						if ("<init>".equals(mn.name) || "<clinit>".equals(mn.name))
						{
							continue;
						}
						// Key by name + erased param list; collide on differing return type only.
						String paramsOnly = mn.desc.substring(0, mn.desc.lastIndexOf(')') + 1);
						methods.computeIfAbsent(mn.name + paramsOnly, k -> new ArrayList<>()).add(mn.desc);
						if ((mn.access & org.objectweb.asm.Opcodes.ACC_STATIC) != 0)
						{
							staticMethods.add(cn.name + "#" + mn.name + mn.desc);
						}
					}
				}
			}
		}

		Map<String, Map<String, String>> fieldRenames = new HashMap<>();
		Map<String, Map<String, String>> methodRenames = new HashMap<>();

		// Disambiguate fields whose name appears multiple times within the same class with
		// different descriptors (JVM-legal field overloading, but illegal in Java source).
		// Also disambiguate fields whose simple name matches a class name — without it
		// Vineflower emits unqualified references like `bp.au[...]` where `bp` could mean
		// the class (correct, for static field access) or the instance field of the surrounding
		// class (which javac picks first, then errors with `non-static ... in static context`
		// or `int cannot be dereferenced`).
		fieldsByOwner.forEach((owner, byName) -> byName.forEach((name, descs) ->
		{
			boolean isDuplicate = descs.size() >= 2;
			boolean shadowsClass = classSimpleNames.contains(name);
			if (!isDuplicate && !shadowsClass)
			{
				return;
			}
			for (String desc : descs)
			{
				String newName = isDuplicate ? name + descriptorSuffix(desc) : name + "_fld";
				fieldRenames
					.computeIfAbsent(owner, k -> new HashMap<>())
					.put(name + "\0" + desc, newName);
				stats.renamedFields++;
			}
		}));

		// Cross-hierarchy field-shadowing rename: when class C declares field F and a parent
		// class also declares field F with a DIFFERENT descriptor, JVM resolves `getfield C.F:<desc>`
		// to whichever class up the chain matches the desc. Vineflower's source emission picks the
		// nearest-scope (the local) regardless of desc, so a child's `rj:[Z` shadows the parent's
		// `rj:I` even when the bytecode meant the parent's. Rename the child's field so both are
		// visible at the source level.
		fieldsByOwner.forEach((owner, byName) -> byName.forEach((name, descs) ->
		{
			if (descs.size() != 1)
			{
				return; // already handled by the dup-rename above
			}
			String myDesc = descs.get(0);
			String parent = superNames.get(owner);
			while (parent != null)
			{
				Map<String, List<String>> parentFields = fieldsByOwner.get(parent);
				if (parentFields == null)
				{
					break;
				}
				List<String> parentDescs = parentFields.get(name);
				if (parentDescs != null)
				{
					boolean conflict = false;
					for (String pd : parentDescs)
					{
						if (!pd.equals(myDesc))
						{
							conflict = true;
							break;
						}
					}
					if (conflict)
					{
						// Always force the descriptor suffix here so the local field is
						// distinguished from the inherited one — a previously-assigned
						// `_fld` suffix from the shadows-class rename would collide on the
						// same name with the parent's field.
						String newName = name + descriptorSuffix(myDesc);
						fieldRenames
							.computeIfAbsent(owner, k -> new HashMap<>())
							.put(name + "\0" + myDesc, newName);
						// Also rename the parent's matching fields (with their own desc suffix)
						// so the chain stays disambiguated.
						String walker = parent;
						while (walker != null)
						{
							Map<String, List<String>> walkFields = fieldsByOwner.get(walker);
							if (walkFields != null)
							{
								List<String> walkDescs = walkFields.get(name);
								if (walkDescs != null)
								{
									for (String wd : walkDescs)
									{
										fieldRenames
											.computeIfAbsent(walker, k -> new HashMap<>())
											.put(name + "\0" + wd, name + descriptorSuffix(wd));
									}
								}
							}
							walker = superNames.get(walker);
						}
						stats.renamedFields++;
						return;
					}
				}
				parent = superNames.get(parent);
			}
		}));

		methodsByOwner.forEach((owner, byNameParams) -> byNameParams.forEach((nameParams, descs) ->
		{
			if (descs.size() < 2)
			{
				return;
			}
			int paren = nameParams.lastIndexOf('(');
			String name = nameParams.substring(0, paren);
			// Keep the first declared overload's original name; suffix the rest. Preserves
			// the interface-contract match for at least one of the overloads (better than
			// suffixing all and losing every contract). Pick deterministically by sorting
			// descs (first by lexicographic order — produces consistent results across runs).
			List<String> sortedDescs = new ArrayList<>(descs);
			java.util.Collections.sort(sortedDescs);
			boolean keptOriginal = false;
			for (String desc : sortedDescs)
			{
				if (!keptOriginal)
				{
					keptOriginal = true;
					continue;
				}
				String returnDesc = desc.substring(desc.lastIndexOf(')') + 1);
				methodRenames
					.computeIfAbsent(owner, k -> new HashMap<>())
					.put(name + "\0" + desc, name + descriptorSuffix(returnDesc));
				stats.renamedMethods++;
			}
		}));

		// Cross-hierarchy method override mismatch: when class C declares method foo(...)Ret1
		// and a parent class declares foo(...)Ret2 (same name + same params, different return),
		// JVM treats them as distinct methods but javac sees them as an invalid override
		// (return type incompatibility). Suffix the child's method so it stops looking like an
		// override attempt. Applies to each desc that survived the within-class dup-rename
		// keeping its original name (post-rename it's the only one named `foo` in this class).
		methodsByOwner.forEach((owner, byNameParams) -> byNameParams.forEach((nameParams, descs) ->
		{
			int paren = nameParams.lastIndexOf('(');
			String name = nameParams.substring(0, paren);
			Map<String, String> ownerRenames = methodRenames.get(owner);
			for (String myDesc : descs)
			{
				// Was this descriptor renamed by within-class dedup? If yes, skip — only
				// the kept-original-name version needs cross-hierarchy checking.
				if (ownerRenames != null && ownerRenames.containsKey(name + "\0" + myDesc))
				{
					continue;
				}
				String returnDesc = myDesc.substring(myDesc.lastIndexOf(')') + 1);
				boolean renamed = false;

				// Walk parent classes. When the parent method conflicts, rename the PARENT's
				// method (the child keeps its original name to satisfy any interface contract
				// it may transitively implement). Parents are in our jar; runtime callers of
				// the parent method are remapped consistently through the Remapper.
				String parent = superNames.get(owner);
				while (parent != null && !renamed)
				{
					Map<String, List<String>> parentMethods = methodsByOwner.get(parent);
					if (parentMethods == null)
					{
						break;
					}
					List<String> parentDescs = parentMethods.get(nameParams);
					if (parentDescs != null)
					{
						for (String pd : parentDescs)
						{
							if (!pd.equals(myDesc))
							{
								String parentRet = pd.substring(pd.lastIndexOf(')') + 1);
								if (!parentRet.equals(returnDesc))
								{
									String parentRetSuffix = descriptorSuffix(parentRet);
									methodRenames
										.computeIfAbsent(parent, k -> new HashMap<>())
										.put(name + "\0" + pd, name + parentRetSuffix);
									stats.renamedMethods++;
									renamed = true;
									break;
								}
							}
						}
					}
					parent = superNames.get(parent);
				}
				if (renamed)
				{
					continue;
				}

				// Walk implemented interfaces (and their parents). A static method colliding
				// with an interface default/abstract method is invalid in Java even though
				// the JVM accepts both.
				boolean isStatic = staticMethods.contains(owner + "#" + name + myDesc);
				java.util.Deque<String> worklist = new java.util.ArrayDeque<>();
				List<String> directIfaces = ifacesByClass.get(owner);
				if (directIfaces != null) worklist.addAll(directIfaces);
				String walker = superNames.get(owner);
				while (walker != null)
				{
					List<String> walkerIfaces = ifacesByClass.get(walker);
					if (walkerIfaces != null) worklist.addAll(walkerIfaces);
					walker = superNames.get(walker);
				}
				java.util.Set<String> visited = new java.util.HashSet<>();
				while (!worklist.isEmpty() && !renamed)
				{
					String iface = worklist.pop();
					if (!visited.add(iface)) continue;
					Map<String, List<String>> ifaceMethods = methodsByOwner.get(iface);
					if (ifaceMethods != null)
					{
						List<String> ifaceDescs = ifaceMethods.get(nameParams);
						if (ifaceDescs != null)
						{
							for (String pd : ifaceDescs)
							{
								String ifaceKey = iface + "#" + name + pd;
								boolean ifaceIsStatic = staticMethods.contains(ifaceKey);
								boolean staticMismatch = isStatic != ifaceIsStatic;
								String ifaceRet = pd.substring(pd.lastIndexOf(')') + 1);
								boolean returnMismatch = !ifaceRet.equals(returnDesc);
								if (staticMismatch || returnMismatch)
								{
									methodRenames
										.computeIfAbsent(owner, k -> new HashMap<>())
										.put(name + "\0" + myDesc, name + descriptorSuffix(returnDesc));
									stats.renamedMethods++;
									renamed = true;
									break;
								}
							}
						}
					}
					List<String> parentIfaces = ifacesByClass.get(iface);
					if (parentIfaces != null) worklist.addAll(parentIfaces);
				}
			}
		}));

		// Covariant-bridge unmasking. Obfuscated bytecode for classes that implement a
		// generic interface like Mesh<T extends Mesh<T>> renames the concrete
		// implementation (e.g. scale -> wu) and leaves the synthetic ACC_BRIDGE method
		// (scale, returning the raw interface type) as the only method named `scale`.
		// At source level the bridge looks like `public Mesh scale(...) { return wu(...); }`
		// which javac rejects because Mesh<T>.scale requires a T-typed return.
		//
		// Fix: rename the obfuscated target back to the bridge's name (so the
		// covariant-typed implementation IS named `scale`), then drop the bridge so
		// javac regenerates it during recompilation with the correct erased type.
		Set<String> bridgesToDrop = new java.util.HashSet<>();
		Set<String> bridgesNeedingCheckcast = new java.util.HashSet<>();
		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			Iterator<JarEntry> it = jar.stream().iterator();
			while (it.hasNext())
			{
				JarEntry e = it.next();
				if (!e.getName().endsWith(".class"))
				{
					continue;
				}
				try (InputStream is = jar.getInputStream(e))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(is).accept(cn, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
					if ((cn.access & org.objectweb.asm.Opcodes.ACC_INTERFACE) != 0)
					{
						continue;
					}
					if (cn.methods == null)
					{
						continue;
					}
					int bridgeMask = org.objectweb.asm.Opcodes.ACC_BRIDGE | org.objectweb.asm.Opcodes.ACC_SYNTHETIC;
					for (MethodNode mn : cn.methods)
					{
						if ((mn.access & bridgeMask) != bridgeMask)
						{
							continue;
						}
						if (mn.instructions == null)
						{
							continue;
						}
						MethodInsnNode invoke = null;
						int invokeCount = 0;
						for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext())
						{
							if (insn instanceof MethodInsnNode)
							{
								invoke = (MethodInsnNode) insn;
								invokeCount++;
							}
						}
						if (invokeCount != 1 || invoke == null)
						{
							continue;
						}
						if (!cn.name.equals(invoke.owner))
						{
							continue;
						}
						if (mn.name.equals(invoke.name))
						{
							continue;
						}
						// Only handle covariant-RETURN bridges (Mesh.scale style) where
						// the param erasures match and only the return type differs. Don't
						// touch generic-type-erasure bridges (Comparator.compare style)
						// whose param erasures differ from the target — those require the
						// raw bridge to satisfy a raw interface contract, since javac won't
						// regenerate them when the class implements the interface raw.
						String bridgeParams = mn.desc.substring(0, mn.desc.lastIndexOf(')') + 1);
						String invokeParamsCheck = invoke.desc.substring(0, invoke.desc.lastIndexOf(')') + 1);
						if (!bridgeParams.equals(invokeParamsCheck))
						{
							continue;
						}
						// Skip bridges that return a raw NameableContainer (we strip the raw
						// NameableContainer interface from impl classes above, so the renamed
						// target wouldn't satisfy any contract requiring NameableContainer<T>
						// without a separate covariant bridge).
						String bridgeReturn = mn.desc.substring(mn.desc.lastIndexOf(')') + 1);
						if ("Lnet/runelite/api/NameableContainer;".equals(bridgeReturn))
						{
							bridgesNeedingCheckcast.add(cn.name + "#" + mn.name + mn.desc);
							continue;
						}
						Map<String, List<String>> myMethods = methodsByOwner.get(cn.name);
						if (myMethods == null)
						{
							continue;
						}
						String invokeParams = invoke.desc.substring(0, invoke.desc.lastIndexOf(')') + 1);
						List<String> targetDescs = myMethods.get(invoke.name + invokeParams);
						if (targetDescs == null || !targetDescs.contains(invoke.desc))
						{
							continue;
						}
						List<String> conflicting = myMethods.get(mn.name + invokeParams);
						boolean conflicts = false;
						if (conflicting != null)
						{
							for (String d : conflicting)
							{
								if (!d.equals(mn.desc))
								{
									conflicts = true;
									break;
								}
							}
						}
						if (conflicts)
						{
							continue;
						}
						methodRenames
							.computeIfAbsent(cn.name, k -> new HashMap<>())
							.put(invoke.name + "\0" + invoke.desc, mn.name);
						bridgesToDrop.add(cn.name + "#" + mn.name + mn.desc);
						stats.renamedMethods++;
					}
				}
			}
		}

		return new SanitizationPlan(new DuplicateRenamer(fieldRenames, methodRenames, superNames), bridgesToDrop, bridgesNeedingCheckcast);
	}

	static final class SanitizationPlan
	{
		final DuplicateRenamer dups;
		final Set<String> bridgesToDrop;
		final Set<String> bridgesNeedingCheckcast;

		SanitizationPlan(DuplicateRenamer dups, Set<String> bridgesToDrop, Set<String> bridgesNeedingCheckcast)
		{
			this.dups = dups;
			this.bridgesToDrop = bridgesToDrop;
			this.bridgesNeedingCheckcast = bridgesNeedingCheckcast;
		}
	}

	private static String descriptorSuffix(String desc)
	{
		StringBuilder sb = new StringBuilder("_");
		int i = 0;
		while (i < desc.length() && desc.charAt(i) == '[')
		{
			sb.append("Arr");
			i++;
		}
		if (i >= desc.length())
		{
			return sb.toString();
		}
		char c = desc.charAt(i);
		switch (c)
		{
			case 'V': sb.append("void"); break;
			case 'Z': sb.append("boolean"); break;
			case 'B': sb.append("byte"); break;
			case 'C': sb.append("char"); break;
			case 'S': sb.append("short"); break;
			case 'I': sb.append("int"); break;
			case 'J': sb.append("long"); break;
			case 'F': sb.append("float"); break;
			case 'D': sb.append("double"); break;
			case 'L':
			{
				int end = desc.indexOf(';', i);
				String internal = end > i ? desc.substring(i + 1, end) : desc.substring(i + 1);
				// Use the full internal name, replacing slashes with underscores. The simple
				// name alone collides for classes that share an unqualified name across
				// packages (e.g. net/runelite/api/WorldMapData and net/runelite/api/worldmap/WorldMapData).
				sb.append(internal.replace('/', '_').replace('$', '_'));
				break;
			}
			default: sb.append(c);
		}
		return sb.toString();
	}

	private static final class DuplicateRenamer extends Remapper
	{
		final Map<String, Map<String, String>> fields;
		final Map<String, Map<String, String>> methods;
		final Map<String, String> superNames;

		DuplicateRenamer(Map<String, Map<String, String>> fields, Map<String, Map<String, String>> methods,
			Map<String, String> superNames)
		{
			this.fields = fields;
			this.methods = methods;
			this.superNames = superNames;
		}

		@Override
		public String mapFieldName(String owner, String name, String descriptor)
		{
			// Walk the inheritance chain — bytecode field accesses often record the static-type
			// owner (subclass) even when the field is actually declared in a parent class.
			String current = owner;
			while (current != null)
			{
				Map<String, String> byKey = fields.get(current);
				if (byKey != null)
				{
					String renamed = byKey.get(name + "\0" + descriptor);
					if (renamed != null)
					{
						return renamed;
					}
				}
				current = superNames.get(current);
			}
			return name;
		}

		@Override
		public String mapMethodName(String owner, String name, String descriptor)
		{
			if ("<init>".equals(name) || "<clinit>".equals(name))
			{
				return name;
			}
			String current = owner;
			while (current != null)
			{
				Map<String, String> byKey = methods.get(current);
				if (byKey != null)
				{
					String renamed = byKey.get(name + "\0" + descriptor);
					if (renamed != null)
					{
						return renamed;
					}
				}
				current = superNames.get(current);
			}
			return name;
		}
	}

	private static Remapper combine(Remapper first, Remapper second)
	{
		return new Remapper()
		{
			@Override
			public String mapFieldName(String owner, String name, String descriptor)
			{
				String afterFirst = first.mapFieldName(owner, name, descriptor);
				return second.mapFieldName(owner, afterFirst, descriptor);
			}

			@Override
			public String mapMethodName(String owner, String name, String descriptor)
			{
				String afterFirst = first.mapMethodName(owner, name, descriptor);
				return second.mapMethodName(owner, afterFirst, descriptor);
			}

			@Override
			public String mapInvokeDynamicMethodName(String name, String descriptor)
			{
				String afterFirst = first.mapInvokeDynamicMethodName(name, descriptor);
				return second.mapInvokeDynamicMethodName(afterFirst, descriptor);
			}

			@Override
			public String map(String internalName)
			{
				String afterFirst = first.map(internalName);
				return second.map(afterFirst);
			}
		};
	}
}
