package net.runelite.mp.account

import android.content.Context
import android.util.Log
import androidx.core.content.edit
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

/** One RuneScape character (what Jagex's API calls an "account") on a Jagex account. */
internal data class JagexCharacter(
    /** `JX_CHARACTER_ID`. */
    val accountId: String,
    /** `JX_DISPLAY_NAME` — the in-game name. */
    val displayName: String,
    val userHash: String,
)

/**
 * One signed-in Jagex account: the OAuth tokens plus the characters it can launch.
 *
 * There is no separate consent token here, unlike the desktop launcher's flow: the mobile
 * client [JagexAuth] uses carries `gamesso.token.create`, so its own [idToken] mints game
 * sessions directly.
 */
internal data class JagexAccount(
    /** The OAuth `sub` claim; stable per Jagex account and used as this record's id. */
    val sub: String,
    /** The Jagex account's display name, or a fallback when the profile fetch failed. */
    val displayName: String,
    val accessToken: String,
    val refreshToken: String,
    val idToken: String,
    /** Last known `JX_SESSION_ID`; renewed on demand by [JagexAccountStore.prepare]. */
    val sessionId: String?,
    val accessTokenExpiryEpochMs: Long,
    val characters: List<JagexCharacter>,
    val lastRefreshedEpochMs: Long,
)

/**
 * Persistent store for Jagex accounts signed in through [JagexLoginScreen], one
 * `<sub>.json` per account under `<appFiles>/jagex-accounts/`.
 *
 * This sits alongside [AccountStore] rather than replacing it: that store holds
 * `credentials.properties` files imported from a desktop Jagex launcher, which stays the
 * escape hatch for anyone who'd rather not sign in on the phone. Both funnel into the
 * same place — a `JX_*` map seeded into system properties by
 * [net.runelite.mp.RuneLiteLauncher].
 *
 * Bearer tokens live in app-private storage, the same protection the imported
 * `credentials.properties` files already get. They never leave the device except to
 * `account.jagex.com` / `auth.jagex.com`, and are never written to logcat.
 */
internal object JagexAccountStore
{
    private const val TAG = "JagexAccountStore"
    private const val DIR_NAME = "jagex-accounts"
    private const val PREFS = "runelite_mp_jagex"
    private const val KEY_LAST_CHARACTER = "last_character_id"

    /** Refresh the access token when it's this close to expiring. Mirrors the desktop launcher. */
    private const val REFRESH_SKEW_MS = 5 * 60 * 1000L

    fun list(context: Context): List<JagexAccount>
    {
        val dir = dir(context)
        if (!dir.isDirectory) return emptyList()
        return dir.listFiles { f -> f.name.endsWith(".json") }
            ?.mapNotNull { read(it) }
            ?.sortedBy { it.displayName.lowercase() }
            ?: emptyList()
    }

    fun save(context: Context, account: JagexAccount)
    {
        val dir = dir(context).apply { mkdirs() }
        try
        {
            File(dir, fileName(account.sub)).writeText(toJson(account).toString())
        }
        catch (t: Throwable)
        {
            Log.w(TAG, "failed to persist account", t)
        }
    }

    fun delete(context: Context, account: JagexAccount)
    {
        File(dir(context), fileName(account.sub)).delete()
        if (account.characters.any { it.accountId == lastCharacterId(context) })
        {
            setLastCharacterId(context, null)
        }
    }

    fun lastCharacterId(context: Context): String? =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(KEY_LAST_CHARACTER, null)

    fun setLastCharacterId(context: Context, id: String?)
    {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit {
            if (id == null) remove(KEY_LAST_CHARACTER) else putString(KEY_LAST_CHARACTER, id)
        }
    }

    /**
     * Brings an account up to date and returns the refreshed copy, persisting it.
     *
     * Order matters and mirrors the desktop launcher: refresh the OAuth tokens when
     * they're near expiry, then mint a *fresh* game session from the stored consent
     * id_token, then re-list the characters. Game sessions expire independently of the
     * OAuth tokens, so a stale `JX_SESSION_ID` is the usual reason a launch that "worked
     * yesterday" drops you back at the login screen.
     *
     * Each step degrades rather than failing outright where it can — a session that can't
     * be renewed falls back to the stored one, and a character list that won't load keeps
     * the cached one — so a flaky network doesn't cost you a working account. Only a
     * failed token refresh is fatal, since nothing downstream can work without it.
     *
     * Network-blocking; call from [kotlinx.coroutines.Dispatchers.IO].
     */
    fun prepare(context: Context, account: JagexAccount): JagexAccount
    {
        var current = account

        if (System.currentTimeMillis() > current.accessTokenExpiryEpochMs - REFRESH_SKEW_MS)
        {
            val tokens = JagexAuth.refreshTokens(current.refreshToken)
            current = current.copy(
                accessToken = tokens.accessToken,
                refreshToken = tokens.refreshToken,
                idToken = tokens.idToken,
                accessTokenExpiryEpochMs = tokens.expiryEpochMs,
            )
        }

        // A failure here is survivable — the stored session may still be live — so it is
        // logged rather than thrown.
        try
        {
            current = current.copy(sessionId = JagexAuth.createSession(current.idToken))
        }
        catch (t: Throwable)
        {
            Log.w(TAG, "session renewal failed (${t.javaClass.simpleName}); keeping the stored session")
        }

        val sessionId = current.sessionId
            ?: throw JagexAuth.AuthException("This account has no game session. Sign in again.")

        try
        {
            val characters = JagexAuth.getCharacters(sessionId)
            if (characters.isNotEmpty())
            {
                current = current.copy(characters = characters)
            }
        }
        catch (t: Throwable)
        {
            if (current.characters.isEmpty()) throw t
            Log.w(TAG, "character list refresh failed (${t.javaClass.simpleName}); using the cached list")
        }

        current = current.copy(lastRefreshedEpochMs = System.currentTimeMillis())
        save(context, current)
        return current
    }

    /**
     * The `JX_*` set the patched client reads at login, matching key-for-key what a
     * desktop Jagex launcher writes into `credentials.properties`. The client only needs
     * the session/character/display-name triple; the tokens are included so an imported
     * file and a signed-in account are indistinguishable downstream.
     */
    fun credentials(account: JagexAccount, character: JagexCharacter): Map<String, String> = mapOf(
        "JX_ACCESS_TOKEN" to account.accessToken,
        "JX_REFRESH_TOKEN" to account.refreshToken,
        "JX_SESSION_ID" to account.sessionId.orEmpty(),
        "JX_CHARACTER_ID" to character.accountId,
        "JX_DISPLAY_NAME" to character.displayName,
    ).filterValues { it.isNotEmpty() }

    // ------------------------------------------------------------------
    // Serialization — org.json, not Gson: this runs before RuneLite's injector boots.
    // ------------------------------------------------------------------

    private fun toJson(a: JagexAccount): JSONObject = JSONObject().apply {
        put("sub", a.sub)
        put("displayName", a.displayName)
        put("accessToken", a.accessToken)
        put("refreshToken", a.refreshToken)
        put("idToken", a.idToken)
        put("sessionId", a.sessionId ?: JSONObject.NULL)
        put("accessTokenExpiryEpochMs", a.accessTokenExpiryEpochMs)
        put("lastRefreshedEpochMs", a.lastRefreshedEpochMs)
        put("characters", JSONArray().apply {
            for (c in a.characters)
            {
                put(JSONObject()
                    .put("accountId", c.accountId)
                    .put("displayName", c.displayName)
                    .put("userHash", c.userHash))
            }
        })
    }

    private fun read(file: File): JagexAccount?
    {
        return try
        {
            val o = JSONObject(file.readText())
            val sub = o.optString("sub").takeIf { it.isNotEmpty() } ?: return null
            val chars = o.optJSONArray("characters")
            val characters = ArrayList<JagexCharacter>(chars?.length() ?: 0)
            for (i in 0 until (chars?.length() ?: 0))
            {
                val c = chars?.optJSONObject(i) ?: continue
                val id = c.optString("accountId").takeIf { it.isNotEmpty() } ?: continue
                characters += JagexCharacter(
                    accountId = id,
                    displayName = c.optString("displayName").takeIf { it.isNotEmpty() } ?: id,
                    userHash = c.optString("userHash"),
                )
            }
            JagexAccount(
                sub = sub,
                displayName = o.optString("displayName").takeIf { it.isNotEmpty() } ?: "Jagex account",
                accessToken = o.optString("accessToken"),
                refreshToken = o.optString("refreshToken"),
                idToken = o.optString("idToken"),
                sessionId = o.optString("sessionId").takeIf { it.isNotEmpty() },
                accessTokenExpiryEpochMs = o.optLong("accessTokenExpiryEpochMs"),
                characters = characters,
                lastRefreshedEpochMs = o.optLong("lastRefreshedEpochMs"),
            )
        }
        catch (t: Throwable)
        {
            // Don't log the filename: it's derived from the account's `sub`.
            Log.w(TAG, "skipping unreadable account record: ${t.javaClass.simpleName}")
            null
        }
    }

    private fun dir(context: Context): File = File(context.filesDir, DIR_NAME)

    private fun fileName(sub: String): String =
        sub.map { if (it.isLetterOrDigit() || it == '-' || it == '_') it else '_' }.joinToString("") + ".json"
}
