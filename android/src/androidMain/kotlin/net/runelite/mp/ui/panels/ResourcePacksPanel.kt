package net.runelite.mp.ui.panels

import androidx.compose.foundation.Image
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import net.runelite.mp.ui.RlPalette
import net.runelite.mp.ui.bridge.ResourcePackEntry
import net.runelite.mp.ui.bridge.ResourcePacksBridge

/**
 * Compose replacement for the resource-packs plugin's Swing hub panel ("Resource packs
 * hub"). Modelled on the External-plugins tab: icon + name + author + an Install/Remove
 * action per pack. Install downloads and applies the pack (the plugin's install() sets it
 * as the active hub pack); Remove uninstalls it.
 */
@Composable
internal fun ResourcePacksPanel()
{
    var query by remember { mutableStateOf("") }
    var loading by remember { mutableStateOf(true) }
    var entries by remember { mutableStateOf<List<ResourcePackEntry>>(emptyList()) }
    var installed by remember { mutableStateOf(setOf<String>()) }
    val icons = remember { mutableStateMapOf<String, ImageBitmap>() }
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit)
    {
        loading = true
        entries = withContext(Dispatchers.IO) { ResourcePacksBridge.available() }
        installed = withContext(Dispatchers.IO) { ResourcePacksBridge.installed() }
        loading = false
        // install()/remove() download in the background; poll the installed set so the
        // row buttons flip once the plugin has updated its config.
        while (true)
        {
            delay(1500)
            val live = withContext(Dispatchers.IO) { ResourcePacksBridge.installed() }
            if (live != installed) installed = live
        }
    }

    PanelScaffold(
        title = "Resource Packs",
        subtitle = if (loading) "Loading pack list…" else "${entries.size} pack(s)",
        scrollable = false,
    ) {
        Column(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            PanelTextInput(value = query, placeholder = "Search packs…", onChange = { query = it })
            Spacer(Modifier.size(6.dp))
            when
            {
                loading -> PanelEmptyState("Loading pack list…")
                entries.isEmpty() -> PanelEmptyState("No packs available (or offline).")
                else ->
                {
                    val live = installed
                    val filtered = entries.asSequence()
                        .filter {
                            query.isBlank() || it.displayName.contains(query, ignoreCase = true) ||
                                it.author.contains(query, ignoreCase = true)
                        }
                        .sortedWith(
                            compareByDescending<ResourcePackEntry> { live.contains(it.internalName) }
                                .thenBy { it.displayName.lowercase() }
                        )
                        .toList()
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(filtered, key = { it.rowKey }) { row ->
                            ResourcePackRow(
                                row = row.copy(installed = live.contains(row.internalName)),
                                icon = icons[row.internalName],
                                onInstall = {
                                    ResourcePacksBridge.install(row.internalName)
                                    installed = installed + row.internalName
                                    scope.launch { installed = ResourcePacksBridge.installed() }
                                },
                                onRemove = {
                                    ResourcePacksBridge.remove(row.internalName)
                                    installed = installed - row.internalName
                                    scope.launch { installed = ResourcePacksBridge.installed() }
                                },
                                onIconLoaded = { bitmap -> icons[row.internalName] = bitmap },
                            )
                            PanelDivider()
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ResourcePackRow(
    row: ResourcePackEntry,
    icon: ImageBitmap?,
    onInstall: () -> Unit,
    onRemove: () -> Unit,
    onIconLoaded: (ImageBitmap) -> Unit,
)
{
    if (icon == null && row.hasIcon && row.commit.isNotEmpty())
    {
        LaunchedEffect(row.internalName, row.commit)
        {
            val bytes = withContext(Dispatchers.IO) { ResourcePacksBridge.downloadIcon(row.commit) }
                ?: return@LaunchedEffect
            val bitmap = withContext(Dispatchers.Default) {
                android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            } ?: return@LaunchedEffect
            onIconLoaded(bitmap.asImageBitmap())
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 8.dp),
    ) {
        Box(
            Modifier.size(40.dp).clip(RoundedCornerShape(4.dp)).background(RlPalette.DarkGray),
            contentAlignment = Alignment.Center,
        ) {
            if (icon != null)
            {
                Image(
                    bitmap = icon,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize().padding(2.dp),
                )
            }
        }
        Spacer(Modifier.size(8.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                row.displayName,
                color = RlPalette.TextPrimary,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                "by ${row.author.ifEmpty { "—" }}",
                color = RlPalette.TextSecondary,
                fontSize = 11.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        Spacer(Modifier.size(8.dp))
        if (row.installed)
        {
            ActionPill("Remove", RlPalette.DangerRed, onRemove)
        }
        else
        {
            ActionPill("Install", RlPalette.OkGreen, onInstall)
        }
    }
}

@Composable
private fun ActionPill(label: String, color: Color, onClick: () -> Unit)
{
    Box(
        Modifier
            .clip(RoundedCornerShape(4.dp))
            .background(color.copy(alpha = 0.16f))
            .border(1.dp, color.copy(alpha = 0.5f), RoundedCornerShape(4.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 7.dp),
    ) {
        Text(label, color = color, fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
    }
}
