package net.runelite.mp.ui.panels

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import net.runelite.client.game.WorldService
import net.runelite.http.api.worlds.World
import net.runelite.http.api.worlds.WorldType
import net.runelite.mp.ui.RlPalette
import net.runelite.mp.ui.bridge.RuneLiteAccess

/**
 * Browse all OSRS worlds and hop to one with a tap. Population is read from the
 * [WorldService] cache (the host polls runelite.net every ~10min). The "Hop" button
 * delegates to `WorldHopperPlugin.hopTo(World)` so the in-game world-switcher flow
 * fires and the chat message + quick-hop overlay come from RL's existing machinery.
 *
 * Mobile-specific deltas vs. desktop:
 *  - Pings are sampled by us (not the WorldHopperPlugin's gated path) using
 *    `Ping.ping(world, false)` which routes to a TCP connect to port 43594 on Android.
 *    Concurrency capped at 8 simultaneous probes so we don't hammer the radio.
 *  - Whole-row taps trigger Hop — no separate Hop button cluttering each row.
 *  - Star toggles a favorite. Favorited worlds sort to the top, then by ping ascending.
 */
@Composable
internal fun WorldHopperPanel()
{
    var query by remember { mutableStateOf("") }
    var worlds by remember { mutableStateOf<List<WorldHopperBridge.Row>>(emptyList()) }
    var loading by remember { mutableStateOf(true) }
    var lastError by remember { mutableStateOf<String?>(null) }
    var favoriteIds by remember { mutableStateOf(WorldHopperBridge.favorites()) }
    var filter by remember { mutableStateOf(WorldFilter.ALL) }
    var refreshTick by remember { mutableStateOf(0) }
    var hopStatus by remember { mutableStateOf<String?>(null) }
    // World id → ping in ms. Sentinel values:
    //   null  → never pinged this session (rendered as "…")
    //    -1   → ping completed and failed (DNS / connect refused / timeout)
    //   >=0   → real RTT in ms
    // Concurrent updates land here as each ping coroutine finishes; Compose recomposes
    // any row keyed on the changed id.
    val pings = remember { mutableStateMapOf<Int, Int>() }
    var pingProgress by remember { mutableStateOf(0 to 0) }  // done, total

    LaunchedEffect(refreshTick)
    {
        loading = worlds.isEmpty()
        val (list, err) = withContext(Dispatchers.IO) { WorldHopperBridge.list() }
        worlds = list
        lastError = err
        loading = false
        favoriteIds = WorldHopperBridge.favorites()

        // Fire off the ping sweep. Concurrency 8 hits a sweet spot — the TCP handshake
        // for any given world is single-RTT and mostly waiting on the network, so we
        // gain a lot from parallelism, but past ~10 simultaneous sockets the radio + DNS
        // resolver start to contend and ping times skew upward.
        if (list.isNotEmpty())
        {
            pingProgress = 0 to list.size
            val sem = Semaphore(8)
            val results = withContext(Dispatchers.IO) {
                coroutineScope {
                    list.map { row ->
                        async {
                            sem.withPermit {
                                val ms = WorldHopperBridge.pingWorld(row.id)
                                row.id to ms
                            }
                        }
                    }.map { deferred ->
                        val r = deferred.await()
                        pings[r.first] = r.second
                        pingProgress = pingProgress.first + 1 to pingProgress.second
                        r
                    }
                }
            }
            @Suppress("UNUSED_EXPRESSION") results
        }
    }

    PanelScaffold(
        title = "World Hopper",
        subtitle = when
        {
            loading -> "Fetching world list…"
            hopStatus != null -> hopStatus
            lastError != null -> lastError
            pingProgress.second > 0 && pingProgress.first < pingProgress.second ->
                "Pinging ${pingProgress.first}/${pingProgress.second}…"
            else -> "${worlds.size} worlds · sorted by ping · tap to hop"
        },
        scrollable = false,
    ) {
        Column(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            PanelTextInput(value = query, placeholder = "Search by id, region, activity", onChange = { query = it })
            Spacer(Modifier.size(6.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                FilterPill("All", filter == WorldFilter.ALL) { filter = WorldFilter.ALL }
                Spacer(Modifier.size(4.dp))
                FilterPill("F2P", filter == WorldFilter.F2P) { filter = WorldFilter.F2P }
                Spacer(Modifier.size(4.dp))
                FilterPill("P2P", filter == WorldFilter.MEMBERS) { filter = WorldFilter.MEMBERS }
                Spacer(Modifier.size(4.dp))
                FilterPill("PvP", filter == WorldFilter.PVP) { filter = WorldFilter.PVP }
                Spacer(Modifier.size(4.dp))
                FilterPill("★", filter == WorldFilter.FAVORITES) { filter = WorldFilter.FAVORITES }
                Spacer(Modifier.weight(1f))
                FilterPill("↻", false) { refreshTick++ }
            }
            Spacer(Modifier.size(6.dp))
            val q = query.trim().lowercase()
            val filtered = worlds.asSequence()
                .filter { row ->
                    when (filter)
                    {
                        WorldFilter.ALL -> true
                        WorldFilter.F2P -> !row.members
                        WorldFilter.MEMBERS -> row.members
                        WorldFilter.PVP -> row.pvp
                        WorldFilter.FAVORITES -> favoriteIds.contains(row.id)
                    }
                }
                .filter { row ->
                    q.isEmpty() ||
                        row.id.toString().contains(q) ||
                        row.activity.lowercase().contains(q) ||
                        row.regionName.lowercase().contains(q)
                }
                .sortedWith(
                    // Favorites pinned on top, then by ping ascending. Unpinged worlds
                    // (null) and failed-ping worlds (-1) sink to the bottom — Int.MAX_VALUE
                    // sentinel makes both sort behind any real ping value, then alphabetical
                    // (numeric id) tiebreaker keeps the order stable while pings stream in.
                    compareByDescending<WorldHopperBridge.Row> { favoriteIds.contains(it.id) }
                        .thenBy { pings[it.id].let { p -> if (p == null || p < 0) Int.MAX_VALUE else p } }
                        .thenBy { it.id }
                )
                .toList()

            when
            {
                worlds.isEmpty() && !loading -> PanelEmptyState(
                    lastError ?: "World list isn't loaded yet. Tap ↻ to retry."
                )
                filtered.isEmpty() -> PanelEmptyState("No worlds match the current filters.")
                else -> LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(filtered, key = { it.id }) { row ->
                        WorldRowItem(
                            row = row,
                            favorite = favoriteIds.contains(row.id),
                            ping = pings[row.id],
                            onToggleFavorite = {
                                val next = !favoriteIds.contains(row.id)
                                WorldHopperBridge.setFavorite(row.id, next)
                                favoriteIds = if (next) favoriteIds + row.id else favoriteIds - row.id
                            },
                            onHop = {
                                val ok = WorldHopperBridge.hopTo(row.id)
                                hopStatus = if (ok) "Hopping to world ${row.id}…"
                                else "Couldn't hop — WorldHopper plugin isn't loaded"
                            },
                        )
                        PanelDivider()
                    }
                }
            }
        }
    }
}

private enum class WorldFilter { ALL, F2P, MEMBERS, PVP, FAVORITES }

@Composable
private fun FilterPill(label: String, active: Boolean, onClick: () -> Unit)
{
    Box(
        Modifier
            .clip(RoundedCornerShape(4.dp))
            .background(if (active) RlPalette.AccentSurface else RlPalette.MediumGray)
            .clickable(onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 4.dp),
    ) {
        Text(
            label,
            color = if (active) Color.White else RlPalette.TextSecondary,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Composable
private fun WorldRowItem(
    row: WorldHopperBridge.Row,
    favorite: Boolean,
    ping: Int?,
    onToggleFavorite: () -> Unit,
    onHop: () -> Unit,
)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onHop)
            .padding(vertical = 6.dp),
    ) {
        // Favorite star — own click target so it doesn't trigger the row-wide hop.
        Box(
            Modifier
                .size(20.dp)
                .clickable(onClick = onToggleFavorite),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                if (favorite) "★" else "☆",
                color = if (favorite) Color(0xFFFFC857) else RlPalette.TextSecondary,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Spacer(Modifier.size(4.dp))
        // World number — bold so it scans first.
        Text(
            row.id.toString(),
            color = RlPalette.TextPrimary,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(end = 6.dp),
        )
        // Region + activity stacked. Activity often has a content tag ("Soul Wars",
        // "Beta world", "Skill Total 2000"); region is the geographic location.
        Column(modifier = Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (row.regionName.isNotEmpty())
                {
                    Text(row.regionName, color = RlPalette.TextSecondary, fontSize = 10.sp)
                    Spacer(Modifier.size(4.dp))
                }
                if (row.members) WorldBadge("P2P", Color(0xFFFFC857))
                if (row.pvp) { Spacer(Modifier.size(3.dp)); WorldBadge("PvP", Color(0xFFE57373)) }
                if (row.skillTotal) { Spacer(Modifier.size(3.dp)); WorldBadge("ST", Color(0xFF8FB0FF)) }
                if (row.deadman) { Spacer(Modifier.size(3.dp)); WorldBadge("DMM", Color(0xFFD0A0FF)) }
            }
            if (row.activity.isNotEmpty() && row.activity != "-")
            {
                Text(
                    row.activity,
                    color = RlPalette.TextSecondary,
                    fontSize = 10.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        Spacer(Modifier.size(6.dp))
        // Ping — colour-coded so the user can scan green→yellow→red. Sentinels:
        // null = "…" (probe queued/in-flight), -1 = "x" (DNS/connect failed).
        val (pingText, pingColor) = when
        {
            ping == null -> "…" to RlPalette.TextDisabled
            ping < 0 -> "✕" to Color(0xFFE57373)
            ping <= 60 -> "${ping}ms" to Color(0xFF8FE188)
            ping <= 150 -> "${ping}ms" to Color(0xFFFFC857)
            else -> "${ping}ms" to Color(0xFFE57373)
        }
        Text(
            pingText,
            color = pingColor,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Composable
private fun WorldBadge(label: String, color: Color)
{
    Box(
        Modifier
            .clip(RoundedCornerShape(2.dp))
            .background(color.copy(alpha = 0.18f))
            .border(0.5.dp, color, RoundedCornerShape(2.dp))
            .padding(horizontal = 3.dp, vertical = 0.dp),
    ) {
        Text(label, color = color, fontSize = 9.sp, fontWeight = FontWeight.Bold)
    }
}

internal object WorldHopperBridge
{
    private const val FAV_GROUP = "runelite-mp"
    private const val FAV_KEY = "worlds-favorites"

    data class Row(
        val id: Int,
        val players: Int,
        val activity: String,
        val regionName: String,
        val members: Boolean,
        val pvp: Boolean,
        val skillTotal: Boolean,
        val deadman: Boolean,
    )

    /** Fetches the world list. Returns (list, errorMessage). The error is non-null only
     *  when the service hasn't loaded its first manifest yet — UI shows it as a hint. */
    fun list(): Pair<List<Row>, String?>
    {
        val service = RuneLiteAccess.instance(WorldService::class.java)
            ?: return emptyList<Row>() to "WorldService not bound yet — try again in a moment."
        val result = try { service.getWorlds() } catch (t: Throwable)
        {
            return emptyList<Row>() to "World list fetch failed: ${t.message ?: t.javaClass.simpleName}"
        }
        if (result == null)
        {
            return emptyList<Row>() to "World list still loading from runelite.net…"
        }
        val list = try
        {
            result.worlds.map { w ->
                Row(
                    id = w.id,
                    players = w.players,
                    activity = w.activity ?: "",
                    regionName = regionLabel(w),
                    members = w.types.contains(WorldType.MEMBERS),
                    pvp = w.types.contains(WorldType.PVP),
                    skillTotal = w.types.contains(WorldType.SKILL_TOTAL),
                    deadman = w.types.contains(WorldType.DEADMAN),
                )
            }
        }
        catch (t: Throwable)
        {
            return emptyList<Row>() to "Couldn't parse world list: ${t.message ?: t.javaClass.simpleName}"
        }
        return list to null
    }

    /** Returns true iff the hop request was dispatched. The Compose row uses the bool to
     *  show a transient "couldn't hop" hint instead of swallowing the failure silently. */
    fun hopTo(worldId: Int): Boolean
    {
        val plugin = RuneLiteAccess.registeredPluginByName(
            "net.runelite.client.plugins.worldhopper.WorldHopperPlugin"
        ) ?: run {
            android.util.Log.w("WorldHopperBridge", "hopTo: WorldHopperPlugin is not loaded/registered")
            return false
        }
        val service = RuneLiteAccess.instance(WorldService::class.java) ?: return false
        val world = try
        {
            val result = service.getWorlds() ?: return false
            result.findWorld(worldId) ?: return false
        }
        catch (t: Throwable) { return false }
        return try
        {
            // hopTo is package-private. We call it on the *registered* plugin so its
            // ClientThread/EventBus wiring is the live one — a fresh-from-injector copy
            // would queue the hop into a throwaway instance whose onGameTick never runs.
            val hopTo = plugin.javaClass.getDeclaredMethod("hopTo", World::class.java).apply { isAccessible = true }
            hopTo.invoke(plugin, world)
            true
        }
        catch (t: Throwable)
        {
            android.util.Log.w("WorldHopperBridge", "hopTo: invocation failed", t)
            false
        }
    }

    /** TCP-pings the given world via [net.runelite.client.plugins.worldhopper.ping.Ping].
     *  Routes through that class's Android branch which opens a TCP connect to port 43594
     *  on the world's host — same RTT measurement the desktop plugin uses when the OS
     *  doesn't allow raw ICMP. Returns -1 on any failure (DNS, refused, timeout) so the
     *  UI can render a clear "failed" state without us having to surface the actual
     *  exception. Blocking; call from a background dispatcher. */
    fun pingWorld(worldId: Int): Int
    {
        val service = RuneLiteAccess.instance(WorldService::class.java) ?: return -1
        val world = try { service.getWorlds()?.findWorld(worldId) ?: return -1 }
            catch (t: Throwable) { return -1 }
        return try
        {
            net.runelite.client.plugins.worldhopper.ping.Ping.ping(world, false)
        }
        catch (t: Throwable) { -1 }
    }

    fun favorites(): Set<Int>
    {
        val cm = RuneLiteAccess.instance(net.runelite.client.config.ConfigManager::class.java) ?: return emptySet()
        val raw = try { cm.getConfiguration(FAV_GROUP, FAV_KEY) } catch (t: Throwable) { null } ?: return emptySet()
        return raw.split(',').mapNotNull { it.trim().toIntOrNull() }.toSet()
    }

    fun setFavorite(id: Int, favorite: Boolean)
    {
        val cm = RuneLiteAccess.instance(net.runelite.client.config.ConfigManager::class.java) ?: return
        val current = favorites().toMutableSet()
        if (favorite) current.add(id) else current.remove(id)
        try
        {
            if (current.isEmpty()) cm.unsetConfiguration(FAV_GROUP, FAV_KEY)
            else cm.setConfiguration(FAV_GROUP, FAV_KEY, current.sorted().joinToString(","))
        }
        catch (t: Throwable) { /* host logs */ }
    }

    private fun regionLabel(w: World): String
    {
        return try
        {
            val region = w.region ?: return ""
            // WorldRegion enum names are like UNITED_STATES_OF_AMERICA — give them title
            // case with spaces.
            region.name.lowercase().split('_').joinToString(" ") { it.replaceFirstChar(Char::uppercase) }
        }
        catch (t: Throwable) { "" }
    }
}
