package net.runelite.inspector;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.jar.Manifest;
import java.util.stream.Stream;
import org.jetbrains.java.decompiler.main.decompiler.BaseDecompiler;
import org.jetbrains.java.decompiler.main.extern.IFernflowerLogger;
import org.jetbrains.java.decompiler.main.extern.IFernflowerPreferences;
import org.jetbrains.java.decompiler.main.extern.IResultSaver;

/**
 * Decompiles a jar to .java sources using Vineflower's API.
 * Sources are emitted under data/sources/&lt;jar-name&gt;/; full decompiler log
 * (TRACE + stack traces, per-class context) is written to data/&lt;jar-name&gt;-decompile.log
 * with a summary of failures printed to stdout.
 */
public final class Decompiler
{
	public static void main(String[] args) throws IOException
	{
		Path jar = args.length > 0 ? Paths.get(args[0]) : findInputJar();
		if (jar == null || !Files.isRegularFile(jar))
		{
			System.err.println("usage: decompiler <path-to-jar>  (or place a runelite-*-injected-*-clean.jar under ./data/)");
			System.exit(1);
			return;
		}

		String stem = stripExtension(jar.getFileName().toString());
		Path outDir = Paths.get("data", "sources", stem);
		if (Files.exists(outDir))
		{
			deleteRecursive(outDir);
		}
		Files.createDirectories(outDir);

		Path logFile = Paths.get("data", stem + "-decompile.log");
		Files.createDirectories(logFile.getParent());

		Map<String, Object> options = new HashMap<>();
		options.put(IFernflowerPreferences.LOG_LEVEL, "TRACE");
		options.put(IFernflowerPreferences.DECOMPILE_GENERIC_SIGNATURES, "1");
		options.put(IFernflowerPreferences.INCLUDE_ENTIRE_CLASSPATH, "1");
		// Vineflower's REMOVE_SYNTHETIC drops the `$assertionsDisabled` field declaration but leaves
		// references to it from `assert` statements, producing "cannot find symbol" everywhere.
		// REMOVE_BRIDGE has a similar issue with covariant-return bridges. Instead we keep both
		// and let the Sanitizer's duplicate-method disambiguation handle bridges via the suffix.
		options.put(IFernflowerPreferences.REMOVE_BRIDGE, "0");
		options.put(IFernflowerPreferences.REMOVE_SYNTHETIC, "0");
		options.put(IFernflowerPreferences.HIDE_DEFAULT_CONSTRUCTOR, "0");
		options.put(IFernflowerPreferences.INDENT_STRING, "\t");
		// LVT (LocalVariableTable) entries in obfuscated bytecode are unreliable — types and
		// names are often poisoned to confuse decompilers. Disable LVT-based naming/typing
		// so Vineflower's own inference (which sees the actual use sites) decides.
		options.put(IFernflowerPreferences.USE_DEBUG_VAR_NAMES, "0");
		// Vineflower's RENAME_ENTITIES is buggy on this jar — its LambdaProcessor NPEs on rename-mismatched
		// lambda metadata for `client`/`rl20`, and it fails to rewrite instance-field references
		// (`this.do[0]`) in subclasses after renaming the parent's field declaration. Reserved-word
		// identifiers are renamed via ASM in the Sanitizer step instead, where every reference is fixed
		// consistently before Vineflower runs.

		System.out.println("decompiling " + jar.toAbsolutePath());
		System.out.println("       into " + outDir.toAbsolutePath());
		System.out.println("        log " + logFile.toAbsolutePath());

		try (Writer log = Files.newBufferedWriter(logFile, StandardCharsets.UTF_8))
		{
			log.write("# decompile log " + Instant.now() + "\n");
			log.write("# input: " + jar.toAbsolutePath() + "\n");
			log.write("# output: " + outDir.toAbsolutePath() + "\n\n");
			ContextLogger logger = new ContextLogger(log);
			BaseDecompiler dec = new BaseDecompiler(new DirectorySaver(outDir), options, logger);
			dec.addSource(jar.toFile());
			dec.decompileContext();

			log.write("\n# summary\n");
			log.write("classes processed: " + logger.classesSeen + "\n");
			log.write("classes that produced WARN: " + logger.warnedClasses.size() + "\n");
			log.write("classes that produced ERROR: " + logger.erroredClasses.size() + "\n");
			logger.errorsPerClass.forEach((k, v) ->
			{
				try
				{
					log.write("  " + k + " — " + v + " error(s)\n");
				}
				catch (IOException e)
				{
					throw new UncheckedIOException(e);
				}
			});

			System.out.println();
			System.out.println("== decompile summary ==");
			System.out.println("classes processed: " + logger.classesSeen);
			System.out.println("with errors:       " + logger.erroredClasses.size());
			System.out.println("with warnings:     " + logger.warnedClasses.size());
			if (!logger.errorsPerClass.isEmpty())
			{
				System.out.println("error counts (top):");
				logger.errorsPerClass.entrySet().stream()
					.sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
					.limit(20)
					.forEach(e -> System.out.println("  " + e.getValue() + " x " + e.getKey()));
			}
		}

		long count;
		try (Stream<Path> walk = Files.walk(outDir))
		{
			count = walk.filter(p -> p.toString().endsWith(".java")).count();
		}
		System.out.println("wrote " + count + " .java files");

		// Post-decompile: inject missing declarations for variables that Vineflower
		// assigns inside a labeled break-block but uses outside (the scope-hoisting
		// fails in VarDefinitionHelper for these cases). javac then rejects them as
		// 'cannot find symbol'. Walk each .java file and detect the pattern.
		int injected = postProcessMissingDecls(outDir);
		if (injected > 0)
		{
			System.out.println("injected " + injected + " missing variable declaration(s)");
		}
	}

	// Detect variables that are assigned inside a labeled block and used outside it,
	// then insert a declaration at the parent-scope level. Heuristic based on regex
	// patterns observed in obfuscated output:
	//   label\d+: \{
	//       ...
	//       var(\d+) = (true|false);  -> declare as boolean
	//       var(\d+) = bp.au_fld;     -> declare as int[]  (bp.au_fld is a known int[] field)
	//   \}
	//   var\d+\[...] = ...;           -> array use, confirms int[]
	private static int postProcessMissingDecls(Path sourcesRoot) throws IOException
	{
		java.util.regex.Pattern arrayAssignPat = java.util.regex.Pattern.compile("^(\\s+)var(\\d+) = bp\\.au_fld;");
		java.util.regex.Pattern boolAssignPat = java.util.regex.Pattern.compile("^(\\s+)var(\\d+) = (?:true|false);");
		java.util.regex.Pattern labelPat = java.util.regex.Pattern.compile("^(\\s+)label\\d+: \\{");
		int injected = 0;
		try (Stream<Path> walk = Files.walk(sourcesRoot))
		{
			java.util.List<Path> files = walk.filter(p -> p.toString().endsWith(".java")).collect(java.util.stream.Collectors.toList());
			for (Path p : files)
			{
				java.util.List<String> lines = new java.util.ArrayList<>(Files.readAllLines(p, StandardCharsets.UTF_8));
				boolean changed = false;
				// Scan for label blocks; collect var assignments inside; check post-block array uses; insert decl before label.
				for (int i = 0; i < lines.size(); i++)
				{
					java.util.regex.Matcher lm = labelPat.matcher(lines.get(i));
					if (!lm.find())
					{
						continue;
					}
					String labelIndent = lm.group(1);
					// Find matching `}` at same indent
					int depth = 1;
					int endIdx = -1;
					for (int j = i + 1; j < lines.size(); j++)
					{
						String ln = lines.get(j);
						for (int k = 0; k < ln.length(); k++)
						{
							char c = ln.charAt(k);
							if (c == '{')
							{
								depth++;
							}
							else if (c == '}')
							{
								depth--;
								if (depth == 0)
								{
									endIdx = j;
									break;
								}
							}
						}
						if (endIdx >= 0)
						{
							break;
						}
					}
					if (endIdx < 0)
					{
						continue;
					}
					// Scan inside label block for assignments to varN
					java.util.Map<String, String> needed = new java.util.LinkedHashMap<>();
					for (int j = i + 1; j < endIdx; j++)
					{
						String ln = lines.get(j);
						java.util.regex.Matcher am = arrayAssignPat.matcher(ln);
						if (am.find())
						{
							needed.put("var" + am.group(2), "int[]");
							continue;
						}
						java.util.regex.Matcher bm = boolAssignPat.matcher(ln);
						if (bm.find())
						{
							needed.put("var" + bm.group(2), "boolean");
						}
					}
					if (needed.isEmpty())
					{
						continue;
					}
					// Confirm at least one var is used AFTER the block (read or array-write)
					java.util.Set<String> usedAfter = new java.util.HashSet<>();
					for (int j = endIdx + 1; j < Math.min(lines.size(), endIdx + 100); j++)
					{
						String ln = lines.get(j);
						for (String name : needed.keySet())
						{
							if (ln.matches("(?s).*\\b" + name + "\\b.*"))
							{
								usedAfter.add(name);
							}
						}
					}
					if (usedAfter.isEmpty())
					{
						continue;
					}
					// Confirm the var ISN'T declared already, anywhere in the file. Vineflower
					// occasionally emits a declaration in an outer scope already; we'd
					// duplicate by adding another. Be conservative: skip if ANY line in the
					// file has "<type> varN" or "varN[]" or "[] varN" with what looks like a
					// declaration. (Cheap textual check; the false-positive rate is fine
					// because false positives just mean we don't inject — the existing
					// `cannot find symbol` would persist as before.)
					java.util.Set<String> toInject = new java.util.LinkedHashSet<>();
					for (java.util.Map.Entry<String, String> en : needed.entrySet())
					{
						String name = en.getKey();
						if (!usedAfter.contains(name))
						{
							continue;
						}
						boolean declared = false;
						String typeName = en.getValue();
						// Look for any line containing the typed declaration of this var
						// anywhere in the file. Conservative — if any such line exists,
						// trust it and don't inject. Allows " " or "\t" preceding the type.
						String suffixSemi = " " + name + ";";
						String suffixEq = " " + name + " =";
						for (int j = 0; j < lines.size(); j++)
						{
							String ln = lines.get(j);
							if (!ln.contains(suffixSemi) && !ln.contains(suffixEq))
							{
								continue;
							}
							String trim = ln.replaceFirst("^\\s+", "");
							if (trim.startsWith(typeName + " " + name)
								|| trim.matches("\\w+(?:<[^>]+>)?(?:\\[\\])?\\s+" + name + "\\s*[;=].*"))
							{
								declared = true;
								break;
							}
						}
						if (!declared)
						{
							toInject.add(name + ":" + en.getValue());
						}
					}
					if (toInject.isEmpty())
					{
						continue;
					}
					// Insert declarations right before the label line
					java.util.List<String> decls = new java.util.ArrayList<>();
					for (String entry : toInject)
					{
						int colon = entry.lastIndexOf(':');
						String name = entry.substring(0, colon);
						String type = entry.substring(colon + 1);
						decls.add(labelIndent + type + " " + name + ";");
					}
					lines.addAll(i, decls);
					injected += decls.size();
					i += decls.size(); // skip past inserted lines + the label line gets reprocessed
					changed = true;
				}
				if (changed)
				{
					Files.write(p, lines, StandardCharsets.UTF_8);
				}
			}
		}
		return injected;
	}

	private static Path findInputJar() throws IOException
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
					return n.endsWith("-clean.jar")
						&& n.startsWith("runelite-")
						&& n.contains("-injected-");
				})
				.max(Comparator.comparingLong(p -> p.toFile().lastModified()))
				.orElse(null);
		}
	}

	private static String stripExtension(String name)
	{
		int dot = name.lastIndexOf('.');
		return dot > 0 ? name.substring(0, dot) : name;
	}

	private static void deleteRecursive(Path p) throws IOException
	{
		try (Stream<Path> walk = Files.walk(p))
		{
			walk.sorted(Comparator.reverseOrder()).forEach(child ->
			{
				try
				{
					Files.delete(child);
				}
				catch (IOException e)
				{
					throw new UncheckedIOException(e);
				}
			});
		}
	}

	private static final class ContextLogger extends IFernflowerLogger
	{
		private final Writer out;
		private final AtomicReference<String> currentClass = new AtomicReference<>();
		private final AtomicReference<String> currentMethod = new AtomicReference<>();
		final Map<String, Long> errorsPerClass = new TreeMap<>();
		final java.util.Set<String> warnedClasses = new java.util.LinkedHashSet<>();
		final java.util.Set<String> erroredClasses = new java.util.LinkedHashSet<>();
		long classesSeen;

		ContextLogger(Writer out)
		{
			this.out = out;
			setSeverity(Severity.TRACE);
		}

		private void write(String s)
		{
			try
			{
				out.write(s);
				out.flush();
			}
			catch (IOException e)
			{
				throw new UncheckedIOException(e);
			}
		}

		private String context()
		{
			String cls = currentClass.get();
			String mth = currentMethod.get();
			StringBuilder sb = new StringBuilder();
			if (cls != null)
			{
				sb.append('[').append(cls);
				if (mth != null)
				{
					sb.append('#').append(mth);
				}
				sb.append("] ");
			}
			return sb.toString();
		}

		@Override
		public void writeMessage(String message, Severity severity)
		{
			write(severity.prefix + " " + context() + message + "\n");
			if (severity == Severity.WARN && currentClass.get() != null)
			{
				warnedClasses.add(currentClass.get());
			}
			if (severity == Severity.ERROR)
			{
				String key = currentClass.get() == null ? "<unknown>" : currentClass.get();
				erroredClasses.add(key);
				errorsPerClass.merge(key, 1L, Long::sum);
			}
		}

		@Override
		public void writeMessage(String message, Severity severity, Throwable t)
		{
			StringWriter sw = new StringWriter();
			t.printStackTrace(new PrintWriter(sw));
			write(severity.prefix + " " + context() + message + "\n" + sw + "\n");
			if (severity == Severity.WARN && currentClass.get() != null)
			{
				warnedClasses.add(currentClass.get());
			}
			if (severity == Severity.ERROR)
			{
				String key = currentClass.get() == null ? "<unknown>" : currentClass.get();
				erroredClasses.add(key);
				errorsPerClass.merge(key, 1L, Long::sum);
			}
		}

		@Override
		public void startProcessingClass(String className)
		{
			classesSeen++;
			currentClass.set(className);
		}

		@Override
		public void endProcessingClass()
		{
			currentClass.set(null);
		}

		@Override
		public void startClass(String className)
		{
			currentClass.set(className);
		}

		@Override
		public void endClass()
		{
			currentClass.set(null);
		}

		@Override
		public void startMethod(String methodName)
		{
			currentMethod.set(methodName);
		}

		@Override
		public void endMethod()
		{
			currentMethod.set(null);
		}
	}

	private static final class DirectorySaver implements IResultSaver
	{
		private final Path outDir;

		DirectorySaver(Path outDir)
		{
			this.outDir = outDir;
		}

		@Override
		public void saveFolder(String path)
		{
			try
			{
				Files.createDirectories(outDir.resolve(path));
			}
			catch (IOException e)
			{
				throw new UncheckedIOException(e);
			}
		}

		@Override
		public void copyFile(String source, String path, String entryName)
		{
		}

		@Override
		public void saveClassFile(String path, String qualifiedName, String entryName, String content, int[] mapping)
		{
			try
			{
				Path target = outDir.resolve(entryName);
				Path parent = target.getParent();
				if (parent != null)
				{
					Files.createDirectories(parent);
				}
				Files.writeString(target, content, StandardCharsets.UTF_8);
			}
			catch (IOException e)
			{
				throw new UncheckedIOException(e);
			}
		}

		@Override
		public void createArchive(String path, String archiveName, Manifest manifest)
		{
		}

		@Override
		public void saveDirEntry(String path, String archiveName, String entryName)
		{
			try
			{
				Files.createDirectories(outDir.resolve(entryName));
			}
			catch (IOException e)
			{
				throw new UncheckedIOException(e);
			}
		}

		@Override
		public void copyEntry(String source, String path, String archiveName, String entry)
		{
		}

		@Override
		public void saveClassEntry(String path, String archiveName, String qualifiedName, String entryName, String content)
		{
			saveClassFile(path, qualifiedName, entryName, content, null);
		}

		@Override
		public void closeArchive(String path, String archiveName)
		{
		}
	}
}
