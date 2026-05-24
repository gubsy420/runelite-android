package net.runelite.inspector;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public final class Inspector
{
	public static void main(String[] args) throws IOException
	{
		Path jar = args.length > 0 ? Paths.get(args[0]) : findLatestPatchedClient();
		if (jar == null || !Files.isRegularFile(jar))
		{
			System.err.println("usage: inspector <path-to-jar>  (or place a runelite-*-injected-*.jar under ./data/)");
			System.exit(1);
			return;
		}

		JsonObject root = buildReport(jar);
		Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

		Path outFile = resolveOutputPath(jar);
		Files.createDirectories(outFile.getParent());
		try (Writer w = Files.newBufferedWriter(outFile, StandardCharsets.UTF_8))
		{
			gson.toJson(root, w);
		}
		System.out.println("wrote " + outFile.toAbsolutePath());
	}

	private static Path resolveOutputPath(Path jar)
	{
		String name = jar.getFileName().toString();
		int dot = name.lastIndexOf('.');
		String base = dot > 0 ? name.substring(0, dot) : name;
		String outName = base + ".json";

		// Prefer the jar's own directory when it lives in ./data; otherwise emit into ./data.
		Path parent = jar.toAbsolutePath().getParent();
		if (parent != null && "data".equals(parent.getFileName().toString()))
		{
			return parent.resolve(outName);
		}
		return Paths.get("data").resolve(outName);
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
					return n.endsWith(".jar") && n.startsWith("runelite-") && n.contains("-injected-");
				})
				.max(Comparator.comparingLong(p -> p.toFile().lastModified()))
				.orElse(null);
		}
	}

	private static JsonObject buildReport(Path jarPath) throws IOException
	{
		JsonObject root = new JsonObject();
		root.addProperty("jar", jarPath.toAbsolutePath().toString());

		JsonArray classes = new JsonArray();
		try (JarFile jar = new JarFile(jarPath.toFile()))
		{
			List<JarEntry> entries = jar.stream()
				.filter(e -> e.getName().endsWith(".class"))
				.sorted(Comparator.comparing(JarEntry::getName))
				.collect(Collectors.toList());

			for (JarEntry entry : entries)
			{
				try (InputStream in = jar.getInputStream(entry))
				{
					ClassNode cn = new ClassNode();
					new ClassReader(in).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG);
					classes.add(classToJson(cn));
				}
			}
		}
		root.add("classes", classes);
		return root;
	}

	private static JsonObject classToJson(ClassNode cn)
	{
		JsonObject obj = new JsonObject();
		obj.addProperty("name", cn.name);
		obj.addProperty("access", cn.access);
		obj.addProperty("superName", cn.superName);
		if (cn.signature != null)
		{
			obj.addProperty("signature", cn.signature);
		}
		if (cn.interfaces != null && !cn.interfaces.isEmpty())
		{
			JsonArray ifaces = new JsonArray();
			cn.interfaces.forEach(ifaces::add);
			obj.add("interfaces", ifaces);
		}

		JsonArray anns = annotationsToJson(cn.visibleAnnotations, cn.invisibleAnnotations);
		if (anns.size() > 0)
		{
			obj.add("annotations", anns);
		}

		JsonArray fields = new JsonArray();
		if (cn.fields != null)
		{
			for (FieldNode fn : cn.fields)
			{
				fields.add(fieldToJson(fn));
			}
		}
		obj.add("fields", fields);

		JsonArray methods = new JsonArray();
		if (cn.methods != null)
		{
			for (MethodNode mn : cn.methods)
			{
				methods.add(methodToJson(mn));
			}
		}
		obj.add("methods", methods);

		return obj;
	}

	private static JsonObject fieldToJson(FieldNode fn)
	{
		JsonObject obj = new JsonObject();
		obj.addProperty("name", fn.name);
		obj.addProperty("descriptor", fn.desc);
		if (fn.signature != null)
		{
			obj.addProperty("signature", fn.signature);
		}
		obj.addProperty("access", fn.access);
		if (fn.value != null)
		{
			obj.add("value", toJson(fn.value));
		}
		JsonArray anns = annotationsToJson(fn.visibleAnnotations, fn.invisibleAnnotations);
		if (anns.size() > 0)
		{
			obj.add("annotations", anns);
		}
		return obj;
	}

	private static JsonObject methodToJson(MethodNode mn)
	{
		JsonObject obj = new JsonObject();
		obj.addProperty("name", mn.name);
		obj.addProperty("descriptor", mn.desc);
		if (mn.signature != null)
		{
			obj.addProperty("signature", mn.signature);
		}
		obj.addProperty("access", mn.access);
		if (mn.exceptions != null && !mn.exceptions.isEmpty())
		{
			JsonArray ex = new JsonArray();
			mn.exceptions.forEach(ex::add);
			obj.add("exceptions", ex);
		}
		JsonArray anns = annotationsToJson(mn.visibleAnnotations, mn.invisibleAnnotations);
		if (anns.size() > 0)
		{
			obj.add("annotations", anns);
		}
		return obj;
	}

	private static JsonArray annotationsToJson(List<AnnotationNode> visible, List<AnnotationNode> invisible)
	{
		JsonArray arr = new JsonArray();
		if (visible != null)
		{
			for (AnnotationNode an : visible)
			{
				arr.add(annotationToJson(an, true));
			}
		}
		if (invisible != null)
		{
			for (AnnotationNode an : invisible)
			{
				arr.add(annotationToJson(an, false));
			}
		}
		return arr;
	}

	private static JsonObject annotationToJson(AnnotationNode an, boolean visible)
	{
		JsonObject obj = new JsonObject();
		obj.addProperty("descriptor", an.desc);
		obj.addProperty("visible", visible);
		if (an.values != null && !an.values.isEmpty())
		{
			JsonObject values = new JsonObject();
			for (int i = 0; i + 1 < an.values.size(); i += 2)
			{
				values.add((String) an.values.get(i), toJson(an.values.get(i + 1)));
			}
			obj.add("values", values);
		}
		return obj;
	}

	private static JsonElement toJson(Object value)
	{
		if (value == null)
		{
			return JsonNull.INSTANCE;
		}
		if (value instanceof String)
		{
			return new JsonPrimitive((String) value);
		}
		if (value instanceof Number)
		{
			return new JsonPrimitive((Number) value);
		}
		if (value instanceof Boolean)
		{
			return new JsonPrimitive((Boolean) value);
		}
		if (value instanceof Character)
		{
			return new JsonPrimitive((Character) value);
		}
		if (value instanceof Type)
		{
			JsonObject obj = new JsonObject();
			obj.addProperty("type", ((Type) value).getDescriptor());
			return obj;
		}
		if (value instanceof String[])
		{
			// ASM encodes enum constants as { descriptor, value }
			String[] enumPair = (String[]) value;
			JsonObject obj = new JsonObject();
			obj.addProperty("enumType", enumPair[0]);
			obj.addProperty("enumValue", enumPair[1]);
			return obj;
		}
		if (value instanceof AnnotationNode)
		{
			return annotationToJson((AnnotationNode) value, true);
		}
		if (value instanceof List<?>)
		{
			JsonArray arr = new JsonArray();
			for (Object o : (List<?>) value)
			{
				arr.add(toJson(o));
			}
			return arr;
		}
		if (value.getClass().isArray())
		{
			JsonArray arr = new JsonArray();
			int len = java.lang.reflect.Array.getLength(value);
			for (int i = 0; i < len; i++)
			{
				arr.add(toJson(java.lang.reflect.Array.get(value, i)));
			}
			return arr;
		}
		return new JsonPrimitive(value.toString());
	}
}
