package net.runelite.mp.ui.panels

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import net.runelite.client.hiscore.HiscoreClient
import net.runelite.client.hiscore.HiscoreEndpoint
import net.runelite.client.hiscore.HiscoreResult
import net.runelite.client.hiscore.HiscoreSkill
import net.runelite.client.hiscore.HiscoreSkillType
import net.runelite.mp.ui.RlPalette
import net.runelite.mp.ui.bridge.RuneLiteAccess

/**
 * Hiscores lookup — type a name, pick an endpoint, hit lookup. Sections itself by
 * [HiscoreSkillType] (Overall / Skills / Activities / Bosses). Persists the last
 * queried name to the same `hiscore/name` config row the desktop panel uses so the
 * field is pre-filled across launches.
 */
@Composable
internal fun HiscoresPanel()
{
    var name by remember { mutableStateOf("") }
    var endpoint by remember { mutableStateOf(HiscoreEndpoint.NORMAL) }
    var result by remember { mutableStateOf<HiscoreResult?>(null) }
    var status by remember { mutableStateOf<String?>(null) }
    var busy by remember { mutableStateOf(false) }
    var pickerOpen by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        name = HiscoresBridge.loadLastName()
    }

    // Consume any pending lookup queued by HiscorePlugin.externalLookupListener (eg.
    // the user right-clicked a player in-game and picked "Lookup"). Drain the slot,
    // pre-fill our state, and fire the lookup so the result is already on-screen by
    // the time the user looks at the panel.
    LaunchedEffect(Unit) {
        while (true) {
            val pending = HiscoresBridge.pendingLookup
            if (pending != null) {
                HiscoresBridge.pendingLookup = null
                name = pending.first
                endpoint = pending.second
                busy = true
                status = "Looking up ${pending.first} on ${pending.second.name}…"
                result = null
                val (res, err) = HiscoresBridge.lookup(pending.first, pending.second)
                if (err != null) { status = err; result = null }
                else { result = res; status = null; HiscoresBridge.saveLastName(pending.first) }
                busy = false
            }
            kotlinx.coroutines.delay(200)
        }
    }

    fun runLookup()
    {
        val target = name.trim()
        if (target.isEmpty()) return
        busy = true
        status = "Looking up $target on ${endpoint.name}…"
        result = null
        scope.launch {
            val (res, err) = HiscoresBridge.lookup(target, endpoint)
            if (err != null)
            {
                status = err
                result = null
            }
            else
            {
                result = res
                status = null
                HiscoresBridge.saveLastName(target)
            }
            busy = false
        }
    }

    PanelScaffold(
        title = "HiScore",
        subtitle = when
        {
            busy -> "Searching…"
            result != null -> "Showing ${result!!.player}"
            status != null -> status
            else -> "Look up any OSRS player"
        },
    ) {
        PanelTextInput(value = name, placeholder = "Player name", onChange = { name = it })
        Spacer(Modifier.size(6.dp))
        // Endpoint picker + Lookup button. The picker is a tap-to-expand dropdown — there
        // are 10 endpoints and a horizontal pill row would wrap and look ugly on mobile.
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(4.dp))
                    .background(RlPalette.MediumGray)
                    .clickable { pickerOpen = !pickerOpen }
                    .padding(horizontal = 10.dp, vertical = 7.dp),
            ) {
                Text(
                    "${endpoint.name}  ▾",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                )
            }
            Spacer(Modifier.size(6.dp))
            PanelButton(
                label = if (busy) "…" else "Lookup",
                enabled = !busy && name.isNotBlank(),
                onClick = ::runLookup,
            )
        }
        if (pickerOpen)
        {
            Spacer(Modifier.size(6.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
                    .background(RlPalette.DarkGray)
                    .border(1.dp, RlPalette.SurfaceBorder, RoundedCornerShape(4.dp)),
            ) {
                for (ep in HiscoreEndpoint.values())
                {
                    val active = ep == endpoint
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .background(if (active) RlPalette.AccentSurface else Color.Transparent)
                            .clickable {
                                endpoint = ep
                                pickerOpen = false
                            }
                            .padding(horizontal = 8.dp, vertical = 7.dp),
                    ) {
                        Text(
                            ep.name,
                            color = if (active) Color.White else RlPalette.TextPrimary,
                            fontSize = 12.sp,
                            fontWeight = if (active) FontWeight.Bold else FontWeight.Medium,
                        )
                    }
                }
            }
        }
        Spacer(Modifier.size(10.dp))
        val res = result
        when
        {
            res != null -> ResultSections(res)
            status != null && !busy -> Text(status!!, color = RlPalette.Accent, fontSize = 11.sp)
            !busy -> Text(
                "Enter a player name and tap Lookup.",
                color = RlPalette.TextSecondary, fontSize = 11.sp,
            )
        }
    }
}

@Composable
private fun ResultSections(res: HiscoreResult)
{
    // Group skills by their HiscoreSkillType. HiscoreSkill is a Java enum with a
    // Lombok `@Getter`-generated `getName()`/`getType()` — we have to call them
    // explicitly because Kotlin's built-in `name` shadows the lombok one.
    data class Entry(val display: String, val type: HiscoreSkillType, val level: Int, val rank: Int, val xp: Long)
    val entries = HiscoreSkill.values().mapNotNull { s ->
        val sk = res.getSkill(s) ?: return@mapNotNull null
        Entry(s.getName(), s.type, sk.level, sk.rank, sk.experience)
    }
    val grouped = entries.groupBy { it.type }

    listOf(HiscoreSkillType.OVERALL, HiscoreSkillType.SKILL, HiscoreSkillType.ACTIVITY, HiscoreSkillType.BOSS)
        .forEach { type ->
            val rows = grouped[type] ?: return@forEach
            SectionHeader(when (type) {
                HiscoreSkillType.OVERALL -> "Overall"
                HiscoreSkillType.SKILL -> "Skills"
                HiscoreSkillType.ACTIVITY -> "Activities"
                HiscoreSkillType.BOSS -> "Bosses"
            })
            for (row in rows)
            {
                HiscoreRow(row.display, row.level, row.rank, row.xp, isSkillRow = type == HiscoreSkillType.SKILL)
                PanelDivider()
            }
            Spacer(Modifier.size(4.dp))
        }
}

@Composable
private fun SectionHeader(label: String)
{
    Box(
        Modifier
            .fillMaxWidth()
            .padding(top = 6.dp, bottom = 3.dp),
    ) {
        Text(label, color = RlPalette.Accent, fontSize = 11.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
private fun HiscoreRow(name: String, level: Int, rank: Int, xp: Long, isSkillRow: Boolean)
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            name,
            color = RlPalette.TextPrimary,
            fontSize = 12.sp,
            modifier = Modifier.weight(1f),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        if (level > 0)
        {
            // Skill rows show "Lv 99 (200m xp)" together; activity/boss rows just show
            // their score number, which the hiscore endpoint stores in the level slot.
            Text(
                if (isSkillRow) "Lv $level" else "%,d".format(level),
                color = Color(0xFFFFC857),
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
            )
            if (isSkillRow && xp > 0)
            {
                Spacer(Modifier.size(6.dp))
                Text(formatXpLong(xp), color = RlPalette.TextSecondary, fontSize = 10.sp)
            }
        }
        else
        {
            // Hiscore endpoint returns -1 for "no data" — render an em-dash so the column
            // stays balanced.
            Text("—", color = RlPalette.TextDisabled, fontSize = 12.sp)
        }
        Spacer(Modifier.size(6.dp))
        Text(
            if (rank > 0) "#${"%,d".format(rank)}" else "—",
            color = RlPalette.TextSecondary,
            fontSize = 10.sp,
        )
    }
}

private fun formatXpLong(xp: Long): String = when
{
    xp < 10_000L -> "%,d".format(xp)
    xp < 10_000_000L -> "%.1fk".format(xp / 1000.0)
    xp < 1_000_000_000L -> "%.2fm".format(xp / 1_000_000.0)
    else -> "%.2fb".format(xp / 1_000_000_000.0)
}

internal object HiscoresBridge
{
    private const val LAST_NAME_GROUP = "hiscore"
    private const val LAST_NAME_KEY = "name"

    /**
     * A name + endpoint queued by [HiscorePlugin.externalLookupListener] when someone
     * fires a lookup from outside our Compose panel (eg. right-click "Lookup" on a
     * player in-game). The panel polls this on composition and consumes it — applying
     * the name/endpoint and running the lookup, then clearing the slot.
     */
    @Volatile var pendingLookup: Pair<String, HiscoreEndpoint>? = null

    /** Called once at boot by [net.runelite.mp.PluginBootstrap]. Hooks both static
     *  listeners on the desktop client classes so the Compose UI sees both the
     *  generic panel-open intent and the hiscore-specific lookup payload. */
    fun installExternalHooks()
    {
        net.runelite.client.plugins.hiscore.HiscorePlugin.externalLookupListener =
            java.util.function.BiConsumer { name, endpoint ->
                pendingLookup = name to endpoint
                // Switch the visible Compose panel to HiScore on the main thread —
                // mutating Compose state from arbitrary background threads is unsafe.
                android.os.Handler(android.os.Looper.getMainLooper()).post {
                    net.runelite.mp.ui.WindowImpl.showPanel("Hiscore")
                }
            }

        net.runelite.client.ui.ClientUI.externalPanelOpenListener =
            java.util.function.Consumer { btn ->
                val tt = btn.tooltip ?: return@Consumer
                if (!net.runelite.mp.ui.panels.PanelRegistry.hasPanel(tt)) return@Consumer
                android.os.Handler(android.os.Looper.getMainLooper()).post {
                    net.runelite.mp.ui.WindowImpl.showPanel(tt)
                }
            }
    }

    /** Returns (result, errorMessage). Exactly one is non-null. */
    suspend fun lookup(name: String, endpoint: HiscoreEndpoint): Pair<HiscoreResult?, String?>
    {
        val client = RuneLiteAccess.instance(HiscoreClient::class.java)
            ?: return null to "HiscoreClient unavailable — is the injector built?"
        return try
        {
            val res = withContext(Dispatchers.IO) { client.lookupAsync(name, endpoint).get() }
            if (res == null) null to "No hiscores for \"$name\" on ${endpoint.name}."
            else res to null
        }
        catch (t: Throwable)
        {
            val root = generateSequence<Throwable>(t) { it.cause }.last()
            null to "Lookup failed: ${root.message ?: root.javaClass.simpleName}"
        }
    }

    fun loadLastName(): String
    {
        val cm = RuneLiteAccess.instance(net.runelite.client.config.ConfigManager::class.java) ?: return ""
        return try { cm.getConfiguration(LAST_NAME_GROUP, LAST_NAME_KEY) } catch (t: Throwable) { null } ?: ""
    }

    fun saveLastName(name: String)
    {
        val cm = RuneLiteAccess.instance(net.runelite.client.config.ConfigManager::class.java) ?: return
        try
        {
            if (name.isEmpty()) cm.unsetConfiguration(LAST_NAME_GROUP, LAST_NAME_KEY)
            else cm.setConfiguration(LAST_NAME_GROUP, LAST_NAME_KEY, name)
        }
        catch (t: Throwable) { /* host logs */ }
    }
}
