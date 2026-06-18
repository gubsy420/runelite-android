package net.runelite.inspector;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Builds a per-method in-degree call graph over a sanitized-client jar and reports
 * methods that are unreachable from any caller.
 *
 * <p>Why it exists: Jagex's obfuscator emits multiple methods with identical bodies
 * but different names (e.g. {@code da.fi()V}, {@code da.fz()V}, {@code da.fr()V},
 * {@code da.dk(B)V} all zero the same two route-state fields). At source level
 * they're indistinguishable, but only one is actually invoked — the others are
 * decoys to confuse decompilers. This pass identifies the decoys by counting
 * MethodInsn references (plus InvokeDynamic Handle args for lambda targets) and
 * propagating in-degrees down the override hierarchy so polymorphic dispatch
 * doesn't get treated as unused.</p>
 *
 * <p>Output: TSV at {@code data/<stem>-unused.tsv} with one row per method:
 * {@code owner, name, desc, access_flags, direct_in_degree, polymorphic_in_degree,
 * is_entry_point, is_polymorphic_target, callers (up to 10, semicolon-separated)}.
 * A method is "definitely unused" iff both in-degrees are 0 AND it is not an entry
 * point AND it does not override an out-of-jar API method (Applet, Object, etc.).</p>
 */
public final class UnusedMethods
{
	public static void main(String[] args) throws IOException
	{
		Path inJar = args.length > 0 ? Paths.get(args[0]) : findLatestCleanJar();
		if (inJar == null || !Files.isRegularFile(inJar))
		{
			System.err.println("usage: UnusedMethods <jar>  (or place a *-clean.jar under ./data/)");
			System.exit(1);
			return;
		}
		System.out.println("scanning " + inJar.toAbsolutePath());

		Map<String, ClassNode> classes = readJar(inJar);
		System.out.println("read " + classes.size() + " classes");

		// 1. Direct call graph (MethodInsn + InvokeDynamic Handle args).
		Map<String, Integer> directInDegree = new HashMap<>();
		Map<String, Set<String>> callers = new HashMap<>();
		// Initialize entries so methods with 0 callers still appear.
		for (ClassNode cn : classes.values())
		{
			if (cn.methods == null) continue;
			for (MethodNode mn : cn.methods)
			{
				directInDegree.putIfAbsent(key(cn.name, mn.name, mn.desc), 0);
			}
		}
		for (ClassNode cn : classes.values())
		{
			if (cn.methods == null) continue;
			for (MethodNode mn : cn.methods)
			{
				String fromKey = key(cn.name, mn.name, mn.desc);
				if (mn.instructions == null) continue;
				for (AbstractInsnNode insn : mn.instructions)
				{
					if (insn instanceof MethodInsnNode)
					{
						MethodInsnNode mi = (MethodInsnNode) insn;
						recordCall(directInDegree, callers, mi.owner, mi.name, mi.desc, fromKey);
					}
					else if (insn instanceof InvokeDynamicInsnNode)
					{
						InvokeDynamicInsnNode idn = (InvokeDynamicInsnNode) insn;
						if (idn.bsmArgs != null)
						{
							for (Object arg : idn.bsmArgs)
							{
								if (arg instanceof Handle)
								{
									Handle h = (Handle) arg;
									recordCall(directInDegree, callers,
										h.getOwner(), h.getName(), h.getDesc(),
										fromKey + " [indy]");
								}
							}
						}
					}
				}
			}
		}

		// 2. Classify each instance method as override-of-internal,
		// override-of-external, or non-override. Externally-overriding methods
		// (Applet#init, Object#toString, runelite-api interface impls, etc.) are
		// treated as always reachable since outside code dispatches into them.
		Set<String> polymorphicTargets = new HashSet<>();   // overrides ANY parent method
		Set<String> externalOverride = new HashSet<>();     // overrides an OUT-OF-JAR API
		for (ClassNode cn : classes.values())
		{
			if (cn.methods == null) continue;
			for (MethodNode mn : cn.methods)
			{
				if ((mn.access & Opcodes.ACC_STATIC) != 0) continue;
				if ((mn.access & Opcodes.ACC_PRIVATE) != 0) continue;
				if ("<init>".equals(mn.name) || "<clinit>".equals(mn.name)) continue;
				OverrideKind k = classifyOverride(cn, mn, classes);
				String mk = key(cn.name, mn.name, mn.desc);
				if (k != OverrideKind.NONE) polymorphicTargets.add(mk);
				if (k == OverrideKind.EXTERNAL) externalOverride.add(mk);
			}
		}

		// 3. Propagate in-degrees through the override hierarchy. A call to a
		// virtual method on a parent could dispatch to any in-jar override; account
		// for that by adding each ancestor's in-degree to the override's effective
		// count. (One hop above plus interfaces is enough in practice — we walk the
		// whole transitive supertype set anyway.)
		Map<String, Integer> polyInDegree = new HashMap<>();
		for (ClassNode cn : classes.values())
		{
			if (cn.methods == null) continue;
			for (MethodNode mn : cn.methods)
			{
				if ((mn.access & Opcodes.ACC_STATIC) != 0) continue;
				if ((mn.access & Opcodes.ACC_PRIVATE) != 0) continue;
				if ("<init>".equals(mn.name) || "<clinit>".equals(mn.name)) continue;
				int extra = 0;
				for (ClassNode ancestor : ancestors(cn, classes))
				{
					if (ancestor.methods == null) continue;
					for (MethodNode pmn : ancestor.methods)
					{
						if (pmn.name.equals(mn.name) && pmn.desc.equals(mn.desc)
							&& (pmn.access & Opcodes.ACC_PRIVATE) == 0
							&& (pmn.access & Opcodes.ACC_STATIC) == 0)
						{
							extra += directInDegree.getOrDefault(key(ancestor.name, pmn.name, pmn.desc), 0);
							break;
						}
					}
				}
				if (extra > 0)
				{
					polyInDegree.put(key(cn.name, mn.name, mn.desc), extra);
				}
			}
		}

		// 4. Mark well-known entry points.
		Set<String> entryPoints = new HashSet<>(externalOverride);
		for (ClassNode cn : classes.values())
		{
			if (cn.methods == null) continue;
			for (MethodNode mn : cn.methods)
			{
				String k = key(cn.name, mn.name, mn.desc);
				if ("<clinit>".equals(mn.name) || "<init>".equals(mn.name))
				{
					entryPoints.add(k);
					continue;
				}
				if ((mn.access & Opcodes.ACC_STATIC) != 0
					&& "main".equals(mn.name)
					&& "([Ljava/lang/String;)V".equals(mn.desc))
				{
					entryPoints.add(k);
				}
			}
		}

		// 5. Emit TSV.
		Path outTsv = inJar.resolveSibling(stripExt(inJar.getFileName().toString()) + "-unused.tsv");
		List<String> lines = new ArrayList<>();
		lines.add("# owner\tname\tdescriptor\taccess\tdirect_in\tpoly_in\tis_entry\tis_poly_target\tcallers");

		// Sort: by class, then name, then desc, so duplicate-named decoy variants
		// appear adjacent in the output.
		Map<String, ClassNode> sortedClasses = new TreeMap<>(classes);
		int totalMethods = 0;
		int definitelyUnused = 0;
		Map<String, List<MethodNode>> decoyGroups = new TreeMap<>();
		for (Map.Entry<String, ClassNode> ce : sortedClasses.entrySet())
		{
			ClassNode cn = ce.getValue();
			if (cn.methods == null) continue;
			List<MethodNode> sortedMethods = new ArrayList<>(cn.methods);
			sortedMethods.sort(Comparator
				.comparing((MethodNode m) -> m.name)
				.thenComparing(m -> m.desc));
			for (MethodNode mn : sortedMethods)
			{
				totalMethods++;
				String mk = key(cn.name, mn.name, mn.desc);
				int din = directInDegree.getOrDefault(mk, 0);
				int pin = polyInDegree.getOrDefault(mk, 0);
				boolean ep = entryPoints.contains(mk);
				boolean pt = polymorphicTargets.contains(mk);
				if (din == 0 && pin == 0 && !ep && !pt) definitelyUnused++;
				Set<String> cl = callers.get(mk);
				String callerStr = cl == null ? "" :
					cl.stream().sorted().limit(10).collect(Collectors.joining(";"));
				lines.add(String.format("%s\t%s\t%s\t0x%x\t%d\t%d\t%s\t%s\t%s",
					cn.name, mn.name, mn.desc, mn.access, din, pin, ep, pt, callerStr));
			}
		}
		Files.write(outTsv, lines, StandardCharsets.UTF_8);

		System.out.println("wrote " + outTsv);
		System.out.println("total methods: " + totalMethods);
		System.out.println("definitely unused (direct_in=0 && poly_in=0 && !entry && !poly_target): " + definitelyUnused);
	}

	private enum OverrideKind
	{
		NONE, INTERNAL, EXTERNAL
	}

	private static OverrideKind classifyOverride(ClassNode cn, MethodNode mn, Map<String, ClassNode> classes)
	{
		// Reflectively probe out-of-jar supertypes via Class.forName so we can ask
		// "does this method exist on the external API?" — this gets us Applet's
		// init/start/stop, Runnable.run, Iterator.hasNext, and the runelite-api
		// interface contracts. Falls back to the well-known short-name list below
		// for Object members (which need special handling because every class has
		// Object as an ancestor and we don't want to mark every method as external).
		OverrideKind result = OverrideKind.NONE;
		Set<String> seen = new HashSet<>();
		Deque<String> stack = new ArrayDeque<>();
		if (cn.superName != null) stack.push(cn.superName);
		if (cn.interfaces != null)
		{
			for (String i : cn.interfaces) stack.push(i);
		}
		while (!stack.isEmpty())
		{
			String t = stack.pop();
			if (!seen.add(t)) continue;
			ClassNode parent = classes.get(t);
			if (parent == null)
			{
				// Out-of-jar parent. Reflectively check whether this exact
				// (name, desc) is declared on it. If yes, EXTERNAL. If not, this
				// branch of the hierarchy isn't relevant; keep walking — we don't
				// stack further unknowns from here because we can't list the
				// reflected class's supers without loading them.
				if (externalDeclares(t, mn.name, mn.desc))
				{
					result = OverrideKind.EXTERNAL;
				}
				continue;
			}
			for (MethodNode pmn : parent.methods)
			{
				if (pmn.name.equals(mn.name) && pmn.desc.equals(mn.desc)
					&& (pmn.access & Opcodes.ACC_PRIVATE) == 0
					&& (pmn.access & Opcodes.ACC_STATIC) == 0)
				{
					if (result == OverrideKind.NONE) result = OverrideKind.INTERNAL;
					break;
				}
			}
			if (parent.superName != null) stack.push(parent.superName);
			if (parent.interfaces != null)
			{
				for (String i : parent.interfaces) stack.push(i);
			}
		}
		return result;
	}

	private static boolean externalDeclares(String internalName, String methodName, String desc)
	{
		// java/lang/Object members are reachable from anywhere — equals/hashCode/
		// toString/clone/finalize. The rest (wait, notify, getClass) are final and
		// can't be overridden, so they never trigger this code path. Hard-code the
		// Object short list to avoid loading java.lang.Object reflectively.
		if ("java/lang/Object".equals(internalName))
		{
			switch (methodName + desc)
			{
				case "equals(Ljava/lang/Object;)Z":
				case "hashCode()I":
				case "toString()Ljava/lang/String;":
				case "clone()Ljava/lang/Object;":
				case "finalize()V":
					return true;
				default:
					return false;
			}
		}
		Class<?> reflected = EXTERNAL_CACHE.get(internalName);
		if (reflected == NULL_SENTINEL) return false;
		if (reflected == null)
		{
			try
			{
				reflected = Class.forName(internalName.replace('/', '.'), false,
					UnusedMethods.class.getClassLoader());
			}
			catch (Throwable t)
			{
				EXTERNAL_CACHE.put(internalName, NULL_SENTINEL);
				return false;
			}
			EXTERNAL_CACHE.put(internalName, reflected);
		}
		// Walk declared + inherited methods looking for a name+desc match.
		Class<?> cur = reflected;
		while (cur != null)
		{
			for (Method m : cur.getDeclaredMethods())
			{
				if (m.getName().equals(methodName)
					&& org.objectweb.asm.Type.getMethodDescriptor(m).equals(desc))
				{
					return true;
				}
			}
			for (Class<?> i : cur.getInterfaces())
			{
				if (externalDeclares(i.getName().replace('.', '/'), methodName, desc))
				{
					return true;
				}
			}
			cur = cur.getSuperclass();
		}
		return false;
	}

	private static final Class<?> NULL_SENTINEL = NullSentinel.class;
	private static final Map<String, Class<?>> EXTERNAL_CACHE = new HashMap<>();
	private static final class NullSentinel {}

	private static Iterable<ClassNode> ancestors(ClassNode cn, Map<String, ClassNode> classes)
	{
		List<ClassNode> out = new ArrayList<>();
		Set<String> seen = new HashSet<>();
		Deque<String> stack = new ArrayDeque<>();
		if (cn.superName != null) stack.push(cn.superName);
		if (cn.interfaces != null)
		{
			for (String i : cn.interfaces) stack.push(i);
		}
		while (!stack.isEmpty())
		{
			String t = stack.pop();
			if (!seen.add(t)) continue;
			ClassNode parent = classes.get(t);
			if (parent == null) continue;
			out.add(parent);
			if (parent.superName != null) stack.push(parent.superName);
			if (parent.interfaces != null)
			{
				for (String i : parent.interfaces) stack.push(i);
			}
		}
		return out;
	}

	private static void recordCall(Map<String, Integer> inDegree,
		Map<String, Set<String>> callers,
		String owner, String name, String desc, String fromKey)
	{
		String toKey = key(owner, name, desc);
		inDegree.merge(toKey, 1, Integer::sum);
		callers.computeIfAbsent(toKey, k -> new TreeSet<>()).add(fromKey);
	}

	private static String key(String owner, String name, String desc)
	{
		return owner + "#" + name + desc;
	}

	private static Map<String, ClassNode> readJar(Path jar) throws IOException
	{
		Map<String, ClassNode> out = new HashMap<>();
		try (JarFile jf = new JarFile(jar.toFile()))
		{
			Enumeration<JarEntry> en = jf.entries();
			while (en.hasMoreElements())
			{
				JarEntry e = en.nextElement();
				if (!e.getName().endsWith(".class")) continue;
				try (InputStream is = jf.getInputStream(e))
				{
					ClassReader cr = new ClassReader(is);
					ClassNode cn = new ClassNode();
					cr.accept(cn, ClassReader.SKIP_FRAMES);
					out.put(cn.name, cn);
				}
			}
		}
		return out;
	}

	private static String stripExt(String name)
	{
		int dot = name.lastIndexOf('.');
		return dot > 0 ? name.substring(0, dot) : name;
	}

	private static Path findLatestCleanJar() throws IOException
	{
		Path data = Paths.get("data");
		if (!Files.isDirectory(data)) return null;
		try (Stream<Path> s = Files.list(data))
		{
			return s.filter(p -> p.getFileName().toString().endsWith("-clean.jar"))
				.max(Comparator.comparingLong(p -> p.toFile().lastModified()))
				.orElse(null);
		}
	}
}
