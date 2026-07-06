package net.runelite.mp.ui.bridge

/**
 * Thin reflection helper for grabbing Guice singletons from the host RuneLite client
 * without taking a hard compile-time dependency on Guice in the Compose UI layer. The
 * UI module sits "above" runelite-client and is loaded after [net.runelite.client.RuneLite]'s
 * injector is built — this file lazily reflects the static `RuneLite.injector` field on
 * first use and caches the lookup.
 *
 * The host already mirrors this pattern in [net.runelite.mp.PluginBootstrap]; we don't
 * share a helper to keep the UI module standalone.
 */
internal object RuneLiteAccess
{
    @Volatile private var cachedInjector: Any? = null

    /** The Guice injector, or null if [net.runelite.client.RuneLite.main] hasn't built it yet. */
    fun injector(): Any?
    {
        cachedInjector?.let { return it }
        return try
        {
            val cls = Class.forName("net.runelite.client.RuneLite")
            val field = cls.getDeclaredField("injector").apply { isAccessible = true }
            val value = field.get(null)
            if (value != null) cachedInjector = value
            value
        }
        catch (t: Throwable)
        {
            null
        }
    }

    /** Equivalent to {@code injector.getInstance(type)}. Returns null on any reflection failure. */
    @Suppress("UNCHECKED_CAST")
    fun <T : Any> instance(type: Class<T>): T?
    {
        val inj = injector() ?: return null
        return try
        {
            val m = inj.javaClass.getMethod("getInstance", Class::class.java)
            m.invoke(inj, type) as T?
        }
        catch (t: Throwable)
        {
            null
        }
    }

    /**
     * Look up the [net.runelite.client.plugins.Plugin] instance that PluginManager
     * actually loaded — NOT a fresh-from-Guice copy. Most RL plugins (including
     * WorldHopperPlugin, ScreenMarkerPlugin, QuestHelperPlugin) are not `@Singleton`,
     * so `injector.getInstance(...)` hands back a brand-new plugin every call with
     * none of the state that `startUp()` populates (no event-bus subscription, empty
     * collection fields, no live `clientThread.invoke()` reaching the right object).
     * Bridges that need to talk to the running plugin must go through this helper.
     */
    @Suppress("UNCHECKED_CAST")
    fun <T : Any> registeredPlugin(type: Class<T>): T?
    {
        return try
        {
            val pm = instance(Class.forName("net.runelite.client.plugins.PluginManager")) ?: return null
            val plugins = pm.javaClass.getMethod("getPlugins").invoke(pm) as? Collection<*> ?: return null
            plugins.firstOrNull { it != null && type.isInstance(it) } as? T
        }
        catch (t: Throwable) { null }
    }

    /** Same as [registeredPlugin] but looks up by fully-qualified class name so the
     *  caller doesn't need a compile-time reference to the plugin class (handy for
     *  reflection-heavy bridges where we only have the name as a string). */
    fun registeredPluginByName(fqcn: String): Any?
    {
        return try
        {
            // Match by the live plugin instance's class-name STRING rather than
            // Class.forName(fqcn) + isInstance. External plugin classes (e.g.
            // com.questhelper.QuestHelperPlugin) are defined by the plugin's DexClassLoader,
            // so Class.forName on the app classloader throws ClassNotFoundException and the
            // lookup returns null. String matching is classloader-agnostic and still works
            // for built-ins.
            val pm = instance(Class.forName("net.runelite.client.plugins.PluginManager")) ?: return null
            val plugins = pm.javaClass.getMethod("getPlugins").invoke(pm) as? Collection<*> ?: return null
            plugins.firstOrNull { it != null && it.javaClass.name == fqcn }
        }
        catch (t: Throwable) { null }
    }
}
