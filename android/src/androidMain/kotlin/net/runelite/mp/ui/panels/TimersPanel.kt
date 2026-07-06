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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import net.runelite.mp.ui.RlPalette
import net.runelite.mp.ui.bridge.RuneLiteAccess

/**
 * Time Tracking — Compose-side surface for the desktop plugin's four tabs (Overview,
 * Clocks, Farming, Bird Houses). The most useful mobile view is "what's ready right
 * now" so we lead with that.
 *
 * - **Overview**: union of farming / birdhouse next-ready slots sorted by time-to-ready.
 * - **Clocks**: user-defined timers + stopwatches with start/pause/reset.
 *
 * Farming and Bird Houses get their own placeholder tabs that point at the desktop
 * client for now — porting their patch UI involves icon-per-crop assets we'd need to
 * resolve through ItemManager async, which would balloon this file. Compose the bare
 * data here; if the user wants those tabs filled out we can iterate.
 */
@Composable
internal fun TimersPanel()
{
    var tab by remember { mutableStateOf(TimersTab.OVERVIEW) }
    var tick by remember { mutableStateOf(0L) }
    LaunchedEffect(Unit)
    {
        while (true)
        {
            tick = System.currentTimeMillis() / 1000
            delay(1000)
        }
    }
    PanelScaffold(title = "Time Tracking", scrollable = false) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 6.dp),
            ) {
                for (entry in TimersTab.values())
                {
                    TabPill(entry.label, tab == entry) { tab = entry }
                    Spacer(Modifier.size(4.dp))
                }
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
            ) {
                @Suppress("UNUSED_VARIABLE") val pulse = tick // re-renders on tick
                when (tab)
                {
                    TimersTab.OVERVIEW -> OverviewTab()
                    TimersTab.CLOCKS -> ClocksTab()
                    TimersTab.FARMING -> PortToDesktopHint("farming")
                    TimersTab.BIRDHOUSES -> PortToDesktopHint("bird houses")
                }
            }
        }
    }
}

private enum class TimersTab(val label: String)
{
    OVERVIEW("Overview"),
    CLOCKS("Clocks"),
    FARMING("Farming"),
    BIRDHOUSES("Birdhouses"),
}

@Composable
private fun TabPill(label: String, active: Boolean, onClick: () -> Unit)
{
    Box(
        Modifier
            .clip(RoundedCornerShape(4.dp))
            .background(if (active) RlPalette.AccentSurface else RlPalette.MediumGray)
            .clickable(onClick = onClick)
            .padding(horizontal = 10.dp, vertical = 5.dp),
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
private fun OverviewTab()
{
    val timers = ClocksBridge.activeTimers()
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(Modifier.size(8.dp))
        Text("Active clocks", color = RlPalette.Accent, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        if (timers.isEmpty())
        {
            Text(
                "No active timers or stopwatches.",
                color = RlPalette.TextSecondary,
                fontSize = 11.sp,
            )
        }
        for (t in timers)
        {
            ClockSummaryRow(t)
            PanelDivider()
        }
        Spacer(Modifier.size(10.dp))
        Text("Farming & bird houses", color = RlPalette.Accent, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        Text(
            "Per-patch view not yet ported. Use the desktop Time Tracking tabs for those — data syncs through ConfigManager.",
            color = RlPalette.TextSecondary,
            fontSize = 11.sp,
        )
    }
}

@Composable
private fun ClocksTab()
{
    val timers = ClocksBridge.allTimers()
    val stopwatches = ClocksBridge.allStopwatches()
    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(Modifier.size(8.dp))
        Row {
            PanelButton(label = "+ Timer", onClick = { ClocksBridge.addTimer() })
            Spacer(Modifier.size(6.dp))
            PanelButton(label = "+ Stopwatch", onClick = { ClocksBridge.addStopwatch() })
        }
        Spacer(Modifier.size(8.dp))
        Text("Timers", color = RlPalette.Accent, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        if (timers.isEmpty()) Text("No timers.", color = RlPalette.TextSecondary, fontSize = 11.sp)
        for (t in timers)
        {
            ClockControlRow(t)
            PanelDivider()
        }
        Spacer(Modifier.size(8.dp))
        Text("Stopwatches", color = RlPalette.Accent, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        if (stopwatches.isEmpty()) Text("No stopwatches.", color = RlPalette.TextSecondary, fontSize = 11.sp)
        for (t in stopwatches)
        {
            ClockControlRow(t)
            PanelDivider()
        }
    }
}

@Composable
private fun ClockSummaryRow(row: ClocksBridge.ClockRow)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
    ) {
        Text(row.name, color = RlPalette.TextPrimary, fontSize = 12.sp, modifier = Modifier.weight(1f),
            maxLines = 1, overflow = TextOverflow.Ellipsis)
        Text(formatSecs(row.displaySeconds),
            color = if (row.active) Color(0xFF8FE188) else RlPalette.TextSecondary,
            fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
    }
}

@Composable
private fun ClockControlRow(row: ClocksBridge.ClockRow)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(row.name, color = RlPalette.TextPrimary, fontSize = 12.sp, maxLines = 1,
                overflow = TextOverflow.Ellipsis)
            Text(formatSecs(row.displaySeconds),
                color = if (row.active) Color(0xFF8FE188) else RlPalette.TextSecondary,
                fontSize = 11.sp)
        }
        ToolPill(if (row.active) "⏸" else "▶") {
            if (row.active) ClocksBridge.pause(row.id) else ClocksBridge.start(row.id)
        }
        Spacer(Modifier.size(4.dp))
        ToolPill("↺") { ClocksBridge.reset(row.id) }
        Spacer(Modifier.size(4.dp))
        ToolPill("✕") { ClocksBridge.remove(row.id) }
    }
}

@Composable
private fun ToolPill(label: String, onClick: () -> Unit)
{
    Box(
        Modifier
            .size(28.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(RlPalette.MediumGray)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Text(label, color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
private fun PortToDesktopHint(area: String)
{
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
            .border(1.dp, RlPalette.SurfaceBorder, RoundedCornerShape(4.dp))
            .background(RlPalette.DarkGray, RoundedCornerShape(4.dp))
            .padding(12.dp),
    ) {
        Text(
            "The $area tab isn't ported yet on mobile. Use the desktop client's Time Tracking panel — both clients share the same config rows so data follows you across.",
            color = RlPalette.TextSecondary,
            fontSize = 11.sp,
        )
    }
}

private fun formatSecs(secs: Long): String
{
    val s = secs.coerceAtLeast(0L)
    val h = s / 3600
    val m = (s % 3600) / 60
    val sec = s % 60
    return if (h > 0) "%d:%02d:%02d".format(h, m, sec) else "%02d:%02d".format(m, sec)
}

internal object ClocksBridge
{
    data class ClockRow(
        val id: String,
        val name: String,
        val displaySeconds: Long,
        val active: Boolean,
        val isTimer: Boolean,
    )

    private fun manager(): Any? = try
    {
        @Suppress("UNCHECKED_CAST")
        RuneLiteAccess.instance(Class.forName(
            "net.runelite.client.plugins.timetracking.clocks.ClockManager"
        ) as Class<Any>)
    }
    catch (t: Throwable) { null }

    private fun timersList(): List<Any> = readList("getTimers")
    private fun stopwatchesList(): List<Any> = readList("getStopwatches")

    private fun readList(getter: String): List<Any>
    {
        val mgr = manager() ?: return emptyList()
        return try
        {
            val list = mgr.javaClass.getMethod(getter).invoke(mgr) as? List<*> ?: return emptyList()
            list.filterNotNull()
        }
        catch (t: Throwable) { emptyList() }
    }

    fun allTimers(): List<ClockRow> = timersList().mapNotNull { toRow(it, isTimer = true) }
    fun allStopwatches(): List<ClockRow> = stopwatchesList().mapNotNull { toRow(it, isTimer = false) }
    fun activeTimers(): List<ClockRow> = (allTimers() + allStopwatches()).filter { it.active }

    private fun toRow(clock: Any, isTimer: Boolean): ClockRow?
    {
        return try
        {
            val name = clock.javaClass.getMethod("getName").invoke(clock) as? String ?: ""
            val display = clock.javaClass.getMethod("getDisplayTime").apply { isAccessible = true }
                .invoke(clock) as? Long ?: 0L
            val active = (clock.javaClass.getMethod("isActive").apply { isAccessible = true }
                .invoke(clock) as? Boolean) ?: false
            ClockRow(
                id = "${System.identityHashCode(clock)}",
                name = name,
                displaySeconds = display,
                active = active,
                isTimer = isTimer,
            )
        }
        catch (t: Throwable) { null }
    }

    fun addTimer() = invokePackagePrivate("addTimer")
    fun addStopwatch() = invokePackagePrivate("addStopwatch")

    fun start(id: String) = invokeOnMatch(id, "start")
    fun pause(id: String) = invokeOnMatch(id, "pause")
    fun reset(id: String) = invokeOnMatch(id, "reset")
    fun remove(id: String)
    {
        val mgr = manager() ?: return
        val timer = findClock(id, isTimer = true)
        if (timer != null)
        {
            try
            {
                val m = mgr.javaClass.getDeclaredMethod("removeTimer", timer.javaClass.superclass.let {
                    Class.forName("net.runelite.client.plugins.timetracking.clocks.Timer")
                }).apply { isAccessible = true }
                m.invoke(mgr, timer)
            }
            catch (t: Throwable) { /* host logs */ }
            return
        }
        val sw = findClock(id, isTimer = false) ?: return
        try
        {
            val m = mgr.javaClass.getDeclaredMethod("removeStopwatch",
                Class.forName("net.runelite.client.plugins.timetracking.clocks.Stopwatch")
            ).apply { isAccessible = true }
            m.invoke(mgr, sw)
        }
        catch (t: Throwable) { /* host logs */ }
    }

    private fun invokePackagePrivate(name: String)
    {
        val mgr = manager() ?: return
        try
        {
            val m = mgr.javaClass.getDeclaredMethod(name).apply { isAccessible = true }
            m.invoke(mgr)
        }
        catch (t: Throwable) { /* host logs */ }
    }

    private fun invokeOnMatch(id: String, method: String)
    {
        val clock = findClock(id, isTimer = true) ?: findClock(id, isTimer = false) ?: return
        try
        {
            val m = clock.javaClass.getDeclaredMethod(method).apply { isAccessible = true }
            m.invoke(clock)
        }
        catch (t: Throwable) { /* host logs */ }
    }

    private fun findClock(id: String, isTimer: Boolean): Any?
    {
        val list = if (isTimer) timersList() else stopwatchesList()
        return list.firstOrNull { "${System.identityHashCode(it)}" == id }
    }
}
