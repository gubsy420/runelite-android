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
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.LocalVariableAnnotationNode;
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
		DuplicateRenamer dups = buildDuplicateRenamer(in, stats);
		// Apply DUPLICATE first (it keys on original names from the pre-scan), then RESERVED
		// on top — otherwise the reserved-word rename of `do`→`do_` would happen first, the
		// duplicate map would look up the post-rename name, and the field-shadows-class
		// detection would silently miss (leaving `da.do_` field still colliding with class `do_`).
		Remapper remapper = combine(dups, RESERVED_REMAPPER);

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
		final Map<String, Long> droppedByType = new TreeMap<>();
		final Map<String, Long> unloadable = new TreeMap<>();
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
	private static DuplicateRenamer buildDuplicateRenamer(Path jarPath, Stats stats) throws IOException
	{
		Map<String, Map<String, List<String>>> fieldsByOwner = new HashMap<>();
		Map<String, Map<String, List<String>>> methodsByOwner = new HashMap<>();
		Set<String> classSimpleNames = new java.util.HashSet<>();
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
					new ClassReader(is).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG);

					int slash = cn.name.lastIndexOf('/');
					classSimpleNames.add(slash < 0 ? cn.name : cn.name.substring(slash + 1));
					if (cn.superName != null)
					{
						superNames.put(cn.name, cn.superName);
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

		methodsByOwner.forEach((owner, byNameParams) -> byNameParams.forEach((nameParams, descs) ->
		{
			if (descs.size() < 2)
			{
				return;
			}
			int paren = nameParams.lastIndexOf('(');
			String name = nameParams.substring(0, paren);
			for (String desc : descs)
			{
				String returnDesc = desc.substring(desc.lastIndexOf(')') + 1);
				methodRenames
					.computeIfAbsent(owner, k -> new HashMap<>())
					.put(name + "\0" + desc, name + descriptorSuffix(returnDesc));
				stats.renamedMethods++;
			}
		}));

		return new DuplicateRenamer(fieldRenames, methodRenames, superNames);
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
				int lastSlash = internal.lastIndexOf('/');
				sb.append(lastSlash >= 0 ? internal.substring(lastSlash + 1) : internal);
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
