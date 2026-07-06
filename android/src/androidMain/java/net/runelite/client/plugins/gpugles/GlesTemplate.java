package net.runelite.client.plugins.gpugles;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Shader preprocessor — handles `#include "foo.glsl"` (file include) and
 * `#include foo_token` (variable include, resolved via registered loaders).
 *
 * Ported from net.runelite.client.plugins.gpu.template.Template. The desktop
 * version uses Guava's CharStreams; we read with a small InputStream loop so we
 * don't pull Guava into this hot path.
 */
public final class GlesTemplate
{
	private static final String TAG = "GlesTemplate";

	private final List<Function<String, String>> resourceLoaders = new ArrayList<>();

	public String process(String src)
	{
		StringBuilder sb = new StringBuilder(src.length() + 128);
		for (String line : src.split("\r?\n"))
		{
			if (line.startsWith("#include "))
			{
				String resource = line.substring("#include ".length()).trim();
				if (resource.startsWith("\"") && resource.endsWith("\""))
				{
					resource = resource.substring(1, resource.length() - 1);
				}
				sb.append(load(resource));
			}
			else
			{
				sb.append(line).append('\n');
			}
		}
		return sb.toString();
	}

	public String load(String name)
	{
		for (Function<String, String> loader : resourceLoaders)
		{
			String value = loader.apply(name);
			if (value != null) return process(value);
		}
		return "";
	}

	public GlesTemplate add(Function<String, String> fn)
	{
		resourceLoaders.add(fn);
		return this;
	}

	/** Register a classpath include source (resolves `#include "foo.glsl"` by looking
	 *  up {@code foo.glsl} as a resource of {@code clazz}'s classloader). */
	public GlesTemplate addInclude(Class<?> clazz)
	{
		return add(f -> {
			try (InputStream is = clazz.getResourceAsStream(f))
			{
				if (is != null) return readUtf8(is);
			}
			catch (IOException ex)
			{
				Log.w(TAG, "include load failed: " + f, ex);
			}
			return null;
		});
	}

	private static String readUtf8(InputStream in) throws IOException
	{
		ByteArrayOutputStream out = new ByteArrayOutputStream(4096);
		byte[] buf = new byte[4096];
		int n;
		while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
		return new String(out.toByteArray(), StandardCharsets.UTF_8);
	}
}
