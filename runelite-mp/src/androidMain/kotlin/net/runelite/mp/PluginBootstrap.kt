package net.runelite.mp

import android.content.Context
import android.util.Log
import java.lang.reflect.Modifier

private const val TAG = "PluginBootstrap"

/**
 * Replicates [PluginManager.loadCorePlugins] on Android. Guava's `ClassPath.from(loader)`
 * relies on URL-based classloader scanning and returns nothing on Android's
 * [dalvik.system.BaseDexClassLoader], so RuneLite ends up with zero registered plugins
 * (and therefore zero toolbar nav buttons).
 *
 * We enumerate classes ourselves by walking each dex file's entries via reflection on
 * `BaseDexClassLoader.pathList.dexElements`, filter to the plugin package, then hand the
 * resulting class list to `PluginManager.loadPlugins` and start them.
 */
object PluginBootstrap {
    private const val PLUGIN_PACKAGE = "net.runelite.client.plugins"

    /**
     * Packages that won't load on Android because they depend on desktop-only natives
     * (LWJGL/JOGL/AWTContext). Loading them would fail at first static init when their
     * GL imports can't be resolved — usually caught silently, but Guice still tries
     * to enumerate their @Provides methods and we'd rather skip them up front.
     *
     * The Android GPU renderer lives at net.runelite.client.plugins.gpugles
     * ({@code GpuGlesPlugin}) — it uses Android EGL14/GLES31 instead.
     */
    private val EXCLUDED_PACKAGES = setOf(
        "net.runelite.client.plugins.gpu",
    )

    fun bootstrap(context: Context) {
        val started = System.currentTimeMillis()
        try {
            val injector = getInjector() ?: run {
                Log.e(TAG, "RuneLite.injector is null — RuneLite.start probably failed before reaching plugin loading")
                return
            }

            val pluginManagerClass = Class.forName("net.runelite.client.plugins.PluginManager")
            val getInstance = injector.javaClass.getMethod("getInstance", Class::class.java)
            val pluginManager = getInstance.invoke(injector, pluginManagerClass)
            Log.i(TAG, "got pluginManager: $pluginManager")

            val pluginClasses = enumeratePluginClasses(context)
            Log.i(TAG, "enumerated ${pluginClasses.size} candidate plugin classes")

            val loadPlugins = pluginManagerClass.getMethod(
                "loadPlugins", List::class.java, java.util.function.BiConsumer::class.java
            )
            val plugins = loadPlugins.invoke(pluginManager, pluginClasses, null) as List<*>
            Log.i(TAG, "loaded ${plugins.size} plugins")

            val loadDefaultConfig = pluginManagerClass.getMethod(
                "loadDefaultPluginConfiguration", Collection::class.java
            )
            loadDefaultConfig.invoke(pluginManager, null)
            Log.i(TAG, "loaded default plugin configurations")

            val startPlugins = pluginManagerClass.getMethod("startPlugins")
            startPlugins.invoke(pluginManager)
            Log.i(TAG, "started plugins in ${System.currentTimeMillis() - started}ms")
        } catch (t: Throwable) {
            Log.e(TAG, "bootstrap failed", t)
        }
    }

    private fun getInjector(): Any? {
        val runeLiteClass = Class.forName("net.runelite.client.RuneLite")
        val injectorField = runeLiteClass.getDeclaredField("injector")
        injectorField.isAccessible = true
        return injectorField.get(null)
    }

    /**
     * Walk every dex file in the current classloader's pathList and load every class whose
     * name starts with [PLUGIN_PACKAGE]. We don't filter for @PluginDescriptor here — that's
     * PluginManager.loadPlugins' job, and we'd rather over-include than miss a plugin.
     */
    private fun enumeratePluginClasses(context: Context): List<Class<*>> {
        val classLoader = PluginBootstrap::class.java.classLoader
            ?: return emptyList()

        val names = mutableSetOf<String>()
        try {
            val baseDexClass = Class.forName("dalvik.system.BaseDexClassLoader")
            val pathListField = baseDexClass.getDeclaredField("pathList")
            pathListField.isAccessible = true
            val pathList = pathListField.get(classLoader) ?: return emptyList()

            val dexElementsField = pathList.javaClass.getDeclaredField("dexElements")
            dexElementsField.isAccessible = true
            val dexElements = dexElementsField.get(pathList) as Array<*>

            for (element in dexElements) {
                if (element == null) continue
                val dexFileField = element.javaClass.getDeclaredField("dexFile")
                dexFileField.isAccessible = true
                val dexFile = dexFileField.get(element) ?: continue

                @Suppress("UNCHECKED_CAST")
                val entries = dexFile.javaClass.getMethod("entries")
                    .invoke(dexFile) as java.util.Enumeration<String>
                while (entries.hasMoreElements()) {
                    val name = entries.nextElement()
                    if (!name.startsWith("$PLUGIN_PACKAGE.")) continue
                    if (EXCLUDED_PACKAGES.any { excl -> name.startsWith("$excl.") || name == excl }) continue
                    names.add(name)
                }
            }
        } catch (t: Throwable) {
            Log.e(TAG, "DEX enumeration failed", t)
            return emptyList()
        }

        val classes = ArrayList<Class<*>>(names.size)
        for (name in names) {
            try {
                val cls = Class.forName(name, false, classLoader)
                // PluginManager only acts on concrete Plugin subclasses with @PluginDescriptor,
                // but it filters internally — we just pass everything that loads.
                if (!Modifier.isAbstract(cls.modifiers) && !cls.isInterface) {
                    classes.add(cls)
                }
            } catch (t: Throwable) {
                // Skip classes whose static init fails — they'd never have worked anyway.
            }
        }
        return classes
    }
}
