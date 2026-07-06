package net.runelite.mp.ui.bridge

/**
 * Drives the external "resource-packs" plugin (melky.resourcepacks) from the Compose UI.
 *
 * The plugin's classes live in its own DexClassLoader (it's a plugin-hub external), so we
 * can't reference them by type — everything here is reflection against the live plugin
 * instance and its child injector, mirroring [QuestHelperBridge].
 *
 * - [available]  builds a fresh HubClient (public `HubClient(OkHttpClient)` ctor) and calls
 *   downloadManifest() to list every published pack.
 * - [installed]  reads PacksManager.getInstalledResourcePacks() (the `hubPacks` config CSV).
 * - [install]/[remove] call the live PacksManager (which is @Singleton in the plugin's
 *   injector). install() also downloads + applies the pack; remove() unsets it if active.
 * - [downloadIcon] fetches `<raw-github>/resource-packs/<commit>/icon.png` via the host
 *   OkHttpClient — same source the plugin's HubClient.downloadIcon uses, but returning the
 *   raw PNG bytes so Compose can decode them directly (no BufferedImage round-trip).
 */
internal data class ResourcePackEntry(
    val internalName: String,
    val displayName: String,
    val author: String,
    val version: String,
    val commit: String,
    val hasIcon: Boolean,
    val installed: Boolean,
)
{
    val rowKey: String get() = "rp/$internalName"
}

internal object ResourcePacksBridge
{
    private const val PLUGIN = "melky.resourcepacks.ResourcePacksPlugin"
    private const val PACKS_MANAGER = "melky.resourcepacks.features.packs.PacksManager"
    private const val HUB_CLIENT = "melky.resourcepacks.features.hub.HubClient"

    private fun plugin(): Any? = RuneLiteAccess.registeredPluginByName(PLUGIN)

    /** Live @Singleton PacksManager from the plugin's child injector (not a fresh,
     *  unwired copy — same reasoning as QuestHelperBridge.plugin()). */
    private fun packsManager(): Any?
    {
        val p = plugin() ?: return null
        return try
        {
            val injector = p.javaClass.getMethod("getInjector").invoke(p) ?: return null
            val pmCls = Class.forName(PACKS_MANAGER, false, p.javaClass.classLoader)
            injector.javaClass.getMethod("getInstance", Class::class.java).invoke(injector, pmCls)
        }
        catch (t: Throwable) { null }
    }

    private fun str(o: Any, getter: String): String? =
        try { o.javaClass.getMethod(getter).invoke(o) as? String } catch (t: Throwable) { null }

    fun installed(): Set<String>
    {
        val pm = packsManager() ?: return emptySet()
        return try
        {
            (pm.javaClass.getMethod("getInstalledResourcePacks").invoke(pm) as? List<*>)
                ?.filterIsInstance<String>()?.toSet() ?: emptySet()
        }
        catch (t: Throwable) { emptySet() }
    }

    /** Full published pack list. Blocks (HTTP) — run on a background coroutine. Empty on
     *  any failure so the UI shows "no packs" rather than crashing. */
    fun available(): List<ResourcePackEntry>
    {
        val p = plugin() ?: return emptyList()
        val okhttp = RuneLiteAccess.instance(okhttp3.OkHttpClient::class.java) ?: return emptyList()
        val inst = installed()
        return try
        {
            val hubCls = Class.forName(HUB_CLIENT, false, p.javaClass.classLoader)
            val hub = hubCls.getConstructor(okhttp3.OkHttpClient::class.java).newInstance(okhttp)
            val list = hubCls.getMethod("downloadManifest").invoke(hub) as? List<*> ?: return emptyList()
            list.mapNotNull { m ->
                if (m == null) return@mapNotNull null
                val internalName = str(m, "getInternalName") ?: return@mapNotNull null
                val hasIcon = try { m.javaClass.getMethod("isHasIcon").invoke(m) as? Boolean ?: false }
                    catch (t: Throwable) { false }
                ResourcePackEntry(
                    internalName = internalName,
                    displayName = str(m, "getDisplayName") ?: internalName,
                    author = str(m, "getAuthor") ?: "",
                    version = str(m, "getCompatibleVersion") ?: "",
                    commit = str(m, "getCommit") ?: "",
                    hasIcon = hasIcon,
                    installed = inst.contains(internalName),
                )
            }
        }
        catch (t: Throwable) { emptyList() }
    }

    fun install(internalName: String)
    {
        val pm = packsManager() ?: return
        try { pm.javaClass.getMethod("install", String::class.java).invoke(pm, internalName) }
        catch (t: Throwable) { android.util.Log.w("ResourcePacksBridge", "install($internalName)", t) }
    }

    fun remove(internalName: String)
    {
        val pm = packsManager() ?: return
        try { pm.javaClass.getMethod("remove", String::class.java).invoke(pm, internalName) }
        catch (t: Throwable) { android.util.Log.w("ResourcePacksBridge", "remove($internalName)", t) }
    }

    /** Raw PNG bytes for a pack icon, or null. Blocks; run on a background coroutine. */
    fun downloadIcon(commit: String): ByteArray?
    {
        if (commit.isEmpty()) return null
        val client = RuneLiteAccess.instance(okhttp3.OkHttpClient::class.java) ?: return null
        val url = "https://raw.githubusercontent.com/melkypie/resource-packs/$commit/icon.png"
        return try
        {
            val req = okhttp3.Request.Builder().url(url).build()
            client.newCall(req).execute().use { resp ->
                if (!resp.isSuccessful) return null
                resp.body()?.bytes()
            }
        }
        catch (t: Throwable) { null }
    }
}
