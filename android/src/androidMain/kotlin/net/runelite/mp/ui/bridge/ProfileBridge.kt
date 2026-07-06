package net.runelite.mp.ui.bridge

import net.runelite.client.config.ConfigManager
import net.runelite.client.config.ProfileManager

/**
 * Exposes RuneLite's [ProfileManager] + [ConfigManager] profile surface to the Compose UI
 * in a stable shape. Operations are all best-effort: failed reflection / locking just
 * returns empty lists or no-ops so the UI stays responsive even if the host hasn't
 * finished booting.
 *
 * Profiles are stored under {@code ~/.runelite/profiles2/}; switching writes the active
 * flag back to the on-disk profile DB and triggers a full config reload across plugins,
 * so it MUST hold the [ProfileManager.Lock] like the Swing ProfilePanel does.
 *
 * "Internal" profiles (names starting with {@code $}, e.g. {@code $rsprofile.account-…})
 * are filtered out — those are per-RuneScape-account synthetic profiles RuneLite owns;
 * the user shouldn't see them as switchable.
 */
internal data class ProfileRow(
    val id: Long,
    val name: String,
    val active: Boolean,
    val sync: Boolean,
)
{
    /** Compose list key. ID is unique and stable across renames. */
    val rowKey: String get() = "profile/$id"
}

internal object ProfileBridge
{
    fun list(): List<ProfileRow>
    {
        val pm = RuneLiteAccess.instance(ProfileManager::class.java) ?: return emptyList()
        return try
        {
            pm.lock().use { lock ->
                lock.profiles
                    .filterNot { it.isInternal }
                    .map { ProfileRow(it.id, it.name, it.isActive, it.isSync) }
                    .sortedBy { it.name.lowercase() }
            }
        }
        catch (t: Throwable) { emptyList() }
    }

    /** Switch to the profile with the given id. Falls back silently if the id no longer
     *  exists or the host wasn't reachable. */
    fun switchTo(id: Long)
    {
        val cm = RuneLiteAccess.instance(ConfigManager::class.java) ?: return
        val pm = RuneLiteAccess.instance(ProfileManager::class.java) ?: return
        try
        {
            val target = pm.lock().use { lock -> lock.findProfile(id) } ?: return
            cm.switchProfile(target)
        }
        catch (t: Throwable) { /* host logs */ }
    }

    /** Create a new (empty) profile with the supplied name and return its id, or -1 on
     *  failure. Empty / blank names are rejected to match the Swing ProfilePanel guard. */
    fun create(name: String): Long
    {
        val trimmed = name.trim()
        if (trimmed.isEmpty()) return -1
        val pm = RuneLiteAccess.instance(ProfileManager::class.java) ?: return -1
        return try
        {
            pm.lock().use { lock -> lock.createProfile(trimmed).id }
        }
        catch (t: Throwable) { -1 }
    }

    fun rename(id: Long, newName: String)
    {
        val cm = RuneLiteAccess.instance(ConfigManager::class.java) ?: return
        val trimmed = newName.trim()
        if (trimmed.isEmpty()) return
        try
        {
            val pm = RuneLiteAccess.instance(ProfileManager::class.java) ?: return
            val profile = pm.lock().use { lock -> lock.findProfile(id) } ?: return
            cm.renameProfile(profile, trimmed)
        }
        catch (t: Throwable) { /* host logs */ }
    }

    /** Delete the profile with the given id. The active profile can't be deleted —
     *  switch first. RuneLite's ConfigManager handles the cascade (config files,
     *  rsprofile pointers, etc.). */
    fun delete(id: Long)
    {
        val pm = RuneLiteAccess.instance(ProfileManager::class.java) ?: return
        try
        {
            pm.lock().use { lock ->
                val target = lock.findProfile(id) ?: return
                if (target.isActive) return  // no-op rather than orphan the user
                lock.removeProfile(id)
            }
        }
        catch (t: Throwable) { /* host logs */ }
    }
}
