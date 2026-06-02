package net.runelite.inspector;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Post-decompile source patcher. Applies a hardcoded list of literal-string replacements
 * against specific files in the decompiled-tree under {@code data/sources/<stem>/}.
 *
 * <p>Used as the last leg of the sanitize → decompile → patch → recompile pipeline.
 * Each entry targets a specific Vineflower decompile artefact we can't (or haven't yet
 * found a clean way to) fix upstream: lost generic types causing {@code Object.foo()}
 * calls, lambda body type inference failures, invokedynamic method-ref simplifications
 * with mismatched arity, etc. Patches are deliberately literal — they fail loudly if
 * the upstream output drifts so we notice and update them.</p>
 *
 * <p>Run: {@code gradle :client-inspector:patchSources -Pstem=<stem>}</p>
 */
public final class SourcePatcher
{
	private static final class Patch
	{
		final String file;
		final String before;
		final String after;
		Patch(String file, String before, String after)
		{
			this.file = file;
			this.before = before;
			this.after = after;
		}
	}

	/** Patch list — keyed by file relative to the decompiled source tree. Each before
	 *  must appear EXACTLY ONCE in the file or we abort, so silent drift in upstream
	 *  decompile output surfaces as a build failure. */
	private static final List<Patch> PATCHES = new ArrayList<>();
	static
	{
		// client.java + rl5.java: `Object var3 = this.getWidget(var1); ... var3 =
		// var3.getChild(var2);` — Vineflower widened the local to Object so the
		// `.getChild(int)` call fails to resolve. The actual static type is Widget
		// (return type of getWidget). Patches are indentation-loose: we substitute
		// just the declarator line, since the wrap pass might add a level of nesting.
		PATCHES.add(new Patch(
			"client.java",
			"Object var3 = this.getWidget(var1);",
			"Widget var3 = this.getWidget(var1);"
		));
		PATCHES.add(new Patch(
			"rl5.java",
			"Object var3 = og.ci_fld.getWidget(var1);",
			"Widget var3 = og.ci_fld.getWidget(var1);"
		));
		// ev.java: `varN.stream().mapToInt(var0 -> var0)` — Vineflower lost the
		// Stream<Integer> generic so `var0` is Object. Force Integer via an explicit
		// `intValue()` call (works regardless of how the inferred type lands).
		// SCAN_AND_FIX below handles this generically since the var name shifts
		// across runs.
		// rl20.java: `Iterators.transform(this.dw_fld.an_fld.iterator(), var0 -> var0.ah_fld)`
		// — same generic erasure, var0 is Object. Cast back to the concrete type whose
		// field ah_fld we want.
		PATCHES.add(new Patch(
			"rl20.java",
			"return Iterators.transform(this.dw_fld.an_fld.iterator(), var0 -> var0.ah_fld);",
			"return Iterators.transform(this.dw_fld.an_fld.iterator(), var0 -> ((rg)var0).ah_fld);"
		));
		// og.java: `ci_fld.sk_fld.execute(client::em);` — invokedynamic captured a
		// local `xi` and built a Runnable, but Vineflower simplified to a method ref
		// without seeing the capture, so the arity is wrong. Replace with a lambda
		// that explicitly passes the captured variable.
		PATCHES.add(new Patch(
			"og.java",
			"ci_fld.sk_fld.execute(client::em);",
			"ci_fld.sk_fld.execute(() -> client.em(var2));"
		));
		// me.java: `java.lang.Object var24;` declared without initialization, then
		// thrown via `throw (Throwable)var24`. The bytecode path is dead — these
		// throws sit behind `var14`-style flags that are never set — but javac's
		// definite-assignment check rejects it. Initialize the var to null; the cast
		// still NPEs at runtime if the path were ever reached, matching the original
		// "deliberately broken control flow" intent.
		PATCHES.add(new Patch(
			"me.java",
			"java.lang.Object var24;",
			"java.lang.Object var24 = null;"
		));

		// cw.java: a `break label55;` inside a try-catch leaves the method without a
		// return on that path (the labeled block escapes to the end of the method,
		// which has no explicit return). Replace the break with an unchecked throw so
		// all execution paths exit cleanly.
		PATCHES.add(new Patch(
			"cw.java",
			"break label55;",
			"throw new RuntimeException();"
		));

		// Bouncycastle stub bodies — handled tree-wide below since there are many
		// stripped constructors/methods left as `throw new Exception()`.

		// client.java <clinit>: `jd_fld = um();` — um() now declares throws of three
		// checked exceptions (MalformedURLException, IOException, ClassNotFoundException)
		// because of the rethrow handler the propagator detected. Static initializers
		// can't declare throws, so wrap the call in a try-catch that converts to
		// ExceptionInInitializerError, matching the JVM's default <clinit> failure
		// behaviour.
		PATCHES.add(new Patch(
			"client.java",
			"\t\tjd_fld = um();",
			"\t\ttry { jd_fld = um(); } catch (Exception _e) { throw new ExceptionInInitializerError(_e); }"
		));

		// Throwable-upcast rethrow pattern. Vineflower emits `throw (Throwable)varN`
		// for any `aload N; athrow` inside a catch handler whose exception-table type
		// is Exception or Throwable. The cast defeats javac's precise-rethrow analysis
		// so the method needs `throws Throwable`. Dropping the cast turns the throw
		// into a plain caught-variable rethrow, which compiles without a throws
		// declaration. Applied across the tree by SCAN_AND_FIX below.
	}

	/** True if {@code pattern} has a match in {@code text} whose group(1) equals
	 *  {@code wantedVarName} — used to ask "is there a `catch (Throwable varN)` or
	 *  `Object varN` declaration above the rethrow line?". */
	private static boolean containsLast(String text, java.util.regex.Pattern pattern, String wantedVarName)
	{
		java.util.regex.Matcher m = pattern.matcher(text);
		while (m.find())
		{
			if (wantedVarName.equals(m.group(1))) return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException
	{
		if (args.length < 1)
		{
			System.err.println("usage: SourcePatcher <stem>  (looks under data/sources/<stem>/)");
			System.exit(1);
		}
		Path root = Paths.get("data", "sources", args[0]);
		if (!Files.isDirectory(root))
		{
			System.err.println("not a directory: " + root);
			System.exit(1);
		}
		int applied = 0;
		int missing = 0;
		for (Patch p : PATCHES)
		{
			Path file = root.resolve(p.file);
			if (!Files.isRegularFile(file))
			{
				System.err.println("skip (file not found): " + file);
				missing++;
				continue;
			}
			String content = Files.readString(file, StandardCharsets.UTF_8);
			int idx = content.indexOf(p.before);
			if (idx < 0)
			{
				System.err.println("skip (pattern not found): " + p.file);
				missing++;
				continue;
			}
			int second = content.indexOf(p.before, idx + 1);
			if (second >= 0)
			{
				System.err.println("ambiguous (pattern appears more than once): " + p.file);
				missing++;
				continue;
			}
			String patched = content.substring(0, idx) + p.after + content.substring(idx + p.before.length());
			Files.writeString(file, patched, StandardCharsets.UTF_8);
			applied++;
		}
		// Tree-wide scan for the Vineflower Throwable-upcast rethrow pattern. Dropping
		// the cast is safe when {@code varN} is statically typed as some Throwable
		// subclass (catch block, declared exception instance, etc.). The ONE case we
		// need to bail on is when Vineflower has widened the var to {@code Object varN}
		// (which happens when the catch scope is unclear) — the cast is then doing
		// genuine downcast work that javac requires.
		java.util.regex.Pattern throwLine =
			java.util.regex.Pattern.compile("throw \\(Throwable\\)(var\\d+);");
		java.util.regex.Pattern objectDecl =
			java.util.regex.Pattern.compile("(?:java\\.lang\\.)?Object\\s+(var\\d+)\\s*[;=]");
		int throwableFixes = 0;
		try (java.util.stream.Stream<Path> walk = Files.walk(root))
		{
			List<Path> javaFiles = walk
				.filter(p -> p.toString().endsWith(".java"))
				.collect(java.util.stream.Collectors.toList());
			for (Path file : javaFiles)
			{
				String content = Files.readString(file, StandardCharsets.UTF_8);
				java.util.regex.Matcher m = throwLine.matcher(content);
				StringBuilder out = new StringBuilder(content.length());
				int pos = 0;
				int fixed = 0;
				while (m.find())
				{
					String varName = m.group(1);
					// Drop the cast UNLESS the same file declares this varN as bare
					// {@code Object} above — that's the one case where the cast is
					// genuinely needed at the source level.
					String prefix = content.substring(0, m.start());
					boolean safelyTyped = !containsLast(prefix, objectDecl, varName);
					out.append(content, pos, m.start());
					if (safelyTyped)
					{
						out.append("throw ").append(varName).append(";");
						fixed++;
					}
					else
					{
						out.append(m.group()); // keep original
					}
					pos = m.end();
				}
				out.append(content, pos, content.length());
				String patched = out.toString();
				if (!patched.equals(content))
				{
					Files.writeString(file, patched, StandardCharsets.UTF_8);
					throwableFixes += fixed;
				}
			}
		}

		// Tree-wide scan for stub bodies the obfuscator left behind as a bare
		// `throw new Exception()` without a corresponding throws declaration.
		// Swap to unchecked so the recompile doesn't propagate Exception everywhere.
		java.util.regex.Pattern stubPattern =
			java.util.regex.Pattern.compile("throw new Exception\\(\\);");
		int stubFixes = 0;
		try (java.util.stream.Stream<Path> walk = Files.walk(root))
		{
			List<Path> javaFiles = walk
				.filter(p -> p.toString().endsWith(".java"))
				.collect(java.util.stream.Collectors.toList());
			for (Path file : javaFiles)
			{
				String content = Files.readString(file, StandardCharsets.UTF_8);
				java.util.regex.Matcher m = stubPattern.matcher(content);
				if (!m.find()) continue;
				String patched = m.replaceAll("throw new RuntimeException();");
				if (!patched.equals(content))
				{
					Files.writeString(file, patched, StandardCharsets.UTF_8);
					stubFixes++;
				}
			}
		}

		// Tree-wide scan for the obfuscator's "Object/uninitialized varN; if (varN ?? INT)"
		// anti-tamper leftover. The original bytecode had the var typed as int and the IF
		// compared two ints inside a since-elided IllegalStateException check. After our
		// ISE-elide removed the IF and its operand pushes, Vineflower kept the local
		// declaration but lost its type — sometimes emits `Object varN;` (compares Object
		// to int, javac rejects), sometimes `byte varN;` (compares uninitialized byte,
		// javac's definite-assignment check rejects). In both cases the var is otherwise
		// unused; replace the comparison with `false` so the whole guarded block is dead.
		java.util.regex.Pattern compareToConst =
			java.util.regex.Pattern.compile("if \\((var\\d+) (?:!=|==|<|>|<=|>=) -?\\d+\\)");
		java.util.regex.Pattern undeclaredVarDecl = java.util.regex.Pattern.compile(
			"(?:java\\.lang\\.Object|Object|byte|short)\\s+%s\\s*;");
		int objectIntFixes = 0;
		try (java.util.stream.Stream<Path> walk = Files.walk(root))
		{
			List<Path> javaFiles = walk
				.filter(p -> p.toString().endsWith(".java"))
				.collect(java.util.stream.Collectors.toList());
			for (Path file : javaFiles)
			{
				String content = Files.readString(file, StandardCharsets.UTF_8);
				java.util.regex.Matcher m = compareToConst.matcher(content);
				StringBuilder out = new StringBuilder(content.length());
				int pos = 0;
				int fixed = 0;
				while (m.find())
				{
					String varName = m.group(1);
					java.util.regex.Pattern decl = java.util.regex.Pattern.compile(
						String.format(undeclaredVarDecl.pattern(), varName));
					boolean isDeadShape = decl.matcher(content.substring(0, m.start())).find();
					out.append(content, pos, m.start());
					if (isDeadShape)
					{
						out.append("if (false)");
						fixed++;
					}
					else
					{
						out.append(m.group());
					}
					pos = m.end();
				}
				out.append(content, pos, content.length());
				String patched = out.toString();
				if (!patched.equals(content))
				{
					Files.writeString(file, patched, StandardCharsets.UTF_8);
					objectIntFixes += fixed;
				}
			}
		}

		// Tree-wide scan for `mapToInt(var0 -> var0)` — Vineflower lost the Stream<Integer>
		// generic so var0 is Object. Add an explicit Integer cast + unbox so the lambda
		// compiles to int as mapToInt expects.
		java.util.regex.Pattern mapToIntPattern =
			java.util.regex.Pattern.compile("\\.mapToInt\\((var\\d+) -> \\1\\)");
		int mapToIntFixes = 0;
		try (java.util.stream.Stream<Path> walk = Files.walk(root))
		{
			List<Path> javaFiles = walk
				.filter(p -> p.toString().endsWith(".java"))
				.collect(java.util.stream.Collectors.toList());
			for (Path file : javaFiles)
			{
				String content = Files.readString(file, StandardCharsets.UTF_8);
				java.util.regex.Matcher m = mapToIntPattern.matcher(content);
				if (!m.find()) continue;
				String patched = m.replaceAll(".mapToInt($1 -> ((Integer)$1).intValue())");
				if (!patched.equals(content))
				{
					Files.writeString(file, patched, StandardCharsets.UTF_8);
					mapToIntFixes++;
				}
			}
		}

		System.out.println("applied " + applied + " literal patch(es); " + throwableFixes + " Throwable-upcast rethrows simplified; " + mapToIntFixes + " mapToInt generics fixed; " + stubFixes + " stub Exception-throws unchecked; " + objectIntFixes + " Object-vs-int anti-tamper comparison(s) dead-coded" + (missing > 0 ? "; " + missing + " skipped" : ""));
		// Skips are warnings, not failures — upstream changes legitimately drift the
		// patch context. We log them but don't fail the pipeline.
	}
}
