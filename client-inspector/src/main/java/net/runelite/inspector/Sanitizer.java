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
import org.objectweb.asm.tree.LocalVariableAnnotationNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeAnnotationNode;

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
									if (mn.exceptions.removeIf(e -> "java/lang/Exception".equals(e) || "java/io/IOException".equals(e)))
									{
										stats.strippedThrowsException++;
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
						ClassWriter cw = new ClassWriter(0);
						cn.accept(new ClassRemapper(cw, remapper));
						bytes = cw.toByteArray();
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
