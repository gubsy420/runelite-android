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
 * Read/manage existing screen markers. Creation isn't surfaced here — drawing a
 * rectangle by drag is awkward with a finger on the OSRS canvas, and the markers
 * config persists across desktop ↔ mobile sessions anyway. Users create markers on
 * desktop; on mobile they toggle/rename/delete and reorder later if we want it.
 */
@Composable
internal fun ScreenMarkersPanel()
{
    val markers = remember { androidx.compose.runtime.mutableStateListOf<ScreenMarkersBridge.Row>() }
    var bumper by remember { mutableStateOf(0) }

    LaunchedEffect(bumper)
    {
        markers.clear()
        markers.addAll(ScreenMarkersBridge.list())
        while (true)
        {
            delay(2000)
            val next = ScreenMarkersBridge.list()
            val same = next.size == markers.size && next.indices.all {
                markers[it].id == next[it].id && markers[it].visible == next[it].visible
            }
            if (!same)
            {
                markers.clear()
                markers.addAll(next)
            }
        }
    }

    PanelScaffold(title = "Screen Markers", subtitle = "${markers.size} marker(s)") {
        if (markers.isEmpty())
        {
            Text(
                "No markers yet. Create one from the desktop client; it'll sync here automatically.",
                color = RlPalette.TextSecondary, fontSize = 11.sp,
            )
            return@PanelScaffold
        }
        for (m in markers)
        {
            ScreenMarkerRow(
                row = m,
                onToggleVisible = {
                    ScreenMarkersBridge.toggleVisible(m.id)
                    bumper++
                },
                onDelete = {
                    ScreenMarkersBridge.delete(m.id)
                    bumper++
                },
            )
            PanelDivider()
        }
    }
}

@Composable
private fun ScreenMarkerRow(
    row: ScreenMarkersBridge.Row,
    onToggleVisible: () -> Unit,
    onDelete: () -> Unit,
)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
    ) {
        // Swatch shows the marker's border colour with a thin fill swatch behind so the
        // user can identify which marker is which at a glance.
        Box(
            Modifier
                .size(24.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(Color(row.fillArgb))
                .border(2.dp, Color(row.borderArgb), RoundedCornerShape(4.dp)),
        )
        Spacer(Modifier.size(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                row.name,
                color = if (row.visible) RlPalette.TextPrimary else RlPalette.TextDisabled,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                "${row.width}×${row.height} · border ${row.borderThickness}px",
                color = RlPalette.TextSecondary,
                fontSize = 10.sp,
            )
        }
        Spacer(Modifier.size(6.dp))
        Box(
            Modifier
                .clip(RoundedCornerShape(4.dp))
                .background(if (row.visible) RlPalette.AccentSurface else RlPalette.MediumGray)
                .clickable(onClick = onToggleVisible)
                .padding(horizontal = 8.dp, vertical = 5.dp),
        ) {
            Text(if (row.visible) "Shown" else "Hidden", color = Color.White, fontSize = 10.sp)
        }
        Spacer(Modifier.size(6.dp))
        Box(
            Modifier
                .clip(RoundedCornerShape(4.dp))
                .background(RlPalette.MediumGray)
                .clickable(onClick = onDelete)
                .padding(horizontal = 8.dp, vertical = 5.dp),
        ) {
            Text("Delete", color = Color.White, fontSize = 10.sp)
        }
    }
}

/**
 * Reflection bridge so we don't need a compile-time dep on `ScreenMarkerPlugin`
 * (it's in a leaf package that may not be on the classpath of every build). All
 * lookups go through [RuneLiteAccess.instance].
 */
internal object ScreenMarkersBridge
{
    data class Row(
        val id: Long,
        val name: String,
        val borderArgb: Int,
        val fillArgb: Int,
        val borderThickness: Int,
        val visible: Boolean,
        val width: Int,
        val height: Int,
    )

    private fun pluginClass(): Class<*>? = try
    {
        Class.forName("net.runelite.client.plugins.screenmarkers.ScreenMarkerPlugin")
    }
    catch (t: Throwable) { null }

    fun list(): List<Row>
    {
        val cls = pluginClass() ?: return emptyList()
        @Suppress("UNCHECKED_CAST")
        val plugin = RuneLiteAccess.instance(cls as Class<Any>) ?: return emptyList()
        return try
        {
            val field = cls.getDeclaredField("screenMarkers").apply { isAccessible = true }
            val list = field.get(plugin) as? List<*> ?: return emptyList()
            list.mapNotNull { entry ->
                if (entry == null) return@mapNotNull null
                val getMarker = entry.javaClass.getMethod("getMarker").apply { isAccessible = true }
                val marker = getMarker.invoke(entry) ?: return@mapNotNull null
                val bounds = try
                {
                    val gb = entry.javaClass.getMethod("getBounds")
                    gb.invoke(entry)
                }
                catch (t: Throwable) { null }
                val (w, h) = if (bounds != null)
                {
                    val gw = bounds.javaClass.getMethod("getWidth").invoke(bounds) as? Double ?: 0.0
                    val gh = bounds.javaClass.getMethod("getHeight").invoke(bounds) as? Double ?: 0.0
                    gw.toInt() to gh.toInt()
                }
                else 0 to 0
                val mc = marker.javaClass
                val id = mc.getMethod("getId").invoke(marker) as? Long ?: 0L
                val name = mc.getMethod("getName").invoke(marker) as? String ?: ""
                val thickness = mc.getMethod("getBorderThickness").invoke(marker) as? Int ?: 0
                val border = mc.getMethod("getColor").invoke(marker)
                val fill = mc.getMethod("getFill").invoke(marker)
                val visible = mc.getMethod("isVisible").invoke(marker) as? Boolean ?: false
                Row(
                    id = id,
                    name = name,
                    borderArgb = colorArgb(border),
                    fillArgb = colorArgb(fill),
                    borderThickness = thickness,
                    visible = visible,
                    width = w,
                    height = h,
                )
            }
        }
        catch (t: Throwable) { emptyList() }
    }

    fun toggleVisible(id: Long)
    {
        val cls = pluginClass() ?: return
        @Suppress("UNCHECKED_CAST")
        val plugin = RuneLiteAccess.instance(cls as Class<Any>) ?: return
        try
        {
            val field = cls.getDeclaredField("screenMarkers").apply { isAccessible = true }
            val list = field.get(plugin) as? List<*> ?: return
            for (entry in list)
            {
                if (entry == null) continue
                val marker = entry.javaClass.getMethod("getMarker").invoke(entry) ?: continue
                val mid = marker.javaClass.getMethod("getId").invoke(marker) as? Long ?: continue
                if (mid != id) continue
                val isVis = marker.javaClass.getMethod("isVisible").invoke(marker) as? Boolean ?: continue
                marker.javaClass.getMethod("setVisible", Boolean::class.javaPrimitiveType).invoke(marker, !isVis)
                // Persist by re-running ScreenMarkerPlugin.updateConfig(), which serialises
                // the current list to the configManager JSON blob.
                try
                {
                    val m = cls.getDeclaredMethod("updateConfig").apply { isAccessible = true }
                    m.invoke(plugin)
                }
                catch (t: Throwable) { /* host logs */ }
                return
            }
        }
        catch (t: Throwable) { /* host logs */ }
    }

    fun delete(id: Long)
    {
        val cls = pluginClass() ?: return
        @Suppress("UNCHECKED_CAST")
        val plugin = RuneLiteAccess.instance(cls as Class<Any>) ?: return
        try
        {
            val field = cls.getDeclaredField("screenMarkers").apply { isAccessible = true }
            val list = field.get(plugin) as? List<*> ?: return
            val target = list.firstOrNull { entry ->
                entry != null && (entry.javaClass.getMethod("getMarker").invoke(entry)
                    ?.javaClass?.getMethod("getId")?.invoke(
                        entry.javaClass.getMethod("getMarker").invoke(entry)
                    ) as? Long) == id
            } ?: return
            val deleteMarker = cls.getDeclaredMethod(
                "deleteMarker",
                Class.forName("net.runelite.client.plugins.screenmarkers.ScreenMarkerOverlay")
            )
            deleteMarker.invoke(plugin, target)
        }
        catch (t: Throwable) { /* host logs */ }
    }

    private fun colorArgb(awt: Any?): Int
    {
        if (awt == null) return 0xFF555555.toInt()
        return try
        {
            val getRGB = awt.javaClass.getMethod("getRGB")
            (getRGB.invoke(awt) as? Int) ?: 0xFF555555.toInt()
        }
        catch (t: Throwable) { 0xFF555555.toInt() }
    }
}
