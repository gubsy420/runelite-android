/*
 * Copyright (c) 2019 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.externalplugins;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import lombok.Getter;
import lombok.Setter;
import net.runelite.client.util.ReflectUtil;

class PluginHubClassLoader extends URLClassLoader implements ReflectUtil.PrivateLookupableClassLoader
{
	/** Dalvik doesn't run JVM bytecode, so URLClassLoader can't actually load .class files from
	 *  a hub jar on Android. The pluginhub-lib pipeline dexes each jar (classes.dex + resources
	 *  at the root), and on Android we delegate findClass to a DexClassLoader pointed at the
	 *  same file. URLClassLoader still owns resource lookup so the stub-read in the constructor
	 *  and any later getResource calls keep working through the same code path. */
	private static final boolean IS_ANDROID = "Dalvik".equals(System.getProperty("java.vm.name"));

	@Getter
	private final PluginHubManifest.JarData jarData;

	@Getter
	private final PluginHubManifest.Stub stub;

	@Getter
	@Setter
	private MethodHandles.Lookup lookup;

	private final ClassLoader dexClassLoader;

	PluginHubClassLoader(PluginHubManifest.JarData jarData, URL[] urls, Gson gson) throws IOException
	{
		super(urls, PluginHubClassLoader.class.getClassLoader());
		this.jarData = jarData;
		try (InputStream is = getResourceAsStream("runelite_plugin.json"))
		{
			this.stub = gson.fromJson(new InputStreamReader(is, StandardCharsets.UTF_8), PluginHubManifest.Stub.class);
		}
		this.dexClassLoader = IS_ANDROID ? createDexClassLoader(jarData.getJarFile()) : null;
		ReflectUtil.installLookupHelper(this);
	}

	/** Reflective so runelite-client still compiles on a plain JDK (no dalvik.system on
	 *  the desktop classpath). The constructor signature has been stable since API 14:
	 *  (dexPath, optimizedDirectory, librarySearchPath, parent). optimizedDirectory has been
	 *  ignored since Android 8 but is still non-null-required on older devices. Files
	 *  downloaded by ExternalPluginManager land RW by default; Android API 29+ throws
	 *  SecurityException("Writable dex file ... is not allowed.") so flip to read-only
	 *  before handing the path to the class loader. */
	private static ClassLoader createDexClassLoader(File jarFile)
	{
		try
		{
			if (jarFile.canWrite() && !jarFile.setReadOnly())
			{
				throw new IOException("Could not chmod " + jarFile + " to read-only");
			}
			Class<?> dcl = Class.forName("dalvik.system.DexClassLoader");
			return (ClassLoader) dcl
				.getConstructor(String.class, String.class, String.class, ClassLoader.class)
				.newInstance(
					jarFile.getAbsolutePath(),
					jarFile.getParentFile().getAbsolutePath(),
					null,
					PluginHubClassLoader.class.getClassLoader());
		}
		catch (ReflectiveOperationException | IOException e)
		{
			throw new RuntimeException("Failed to create DexClassLoader for " + jarFile, e);
		}
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException
	{
		if (dexClassLoader != null)
		{
			return dexClassLoader.loadClass(name);
		}
		return super.findClass(name);
	}

	@Override
	public Class<?> defineClass0(String name, byte[] b, int off, int len) throws ClassFormatError
	{
		return super.defineClass(name, b, off, len);
	}
}
