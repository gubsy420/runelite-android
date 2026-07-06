package net.runelite.mp.ui.panels

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import net.runelite.mp.ui.RlPalette
import net.runelite.mp.ui.bridge.RuneLiteAccess

/**
 * Free-text scratchpad backed by the existing `notes/notesData` config key — the same
 * row Swing's [net.runelite.client.plugins.notes.NotesPanel] reads/writes, so notes
 * sync seamlessly with the desktop client when both share a config profile.
 *
 * Persistence cadence: 750ms after the last keystroke, plus an immediate flush when
 * the user backs out of the panel (composition leaves). Mirrors Swing's "save on
 * focus lost" without needing a focus model on mobile.
 */
@Composable
internal fun NotesPanel()
{
    var text by remember { mutableStateOf(NotesBridge.read()) }
    var savedText by remember { mutableStateOf(text) }

    LaunchedEffect(text)
    {
        if (text == savedText) return@LaunchedEffect
        delay(750)
        NotesBridge.write(text)
        savedText = text
    }

    androidx.compose.runtime.DisposableEffect(Unit)
    {
        onDispose { if (text != savedText) NotesBridge.write(text) }
    }

    val status = when
    {
        text == savedText -> "Saved"
        else -> "Unsaved changes…"
    }

    PanelScaffold(title = "Notes", subtitle = status, scrollable = false) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
        ) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color(0xFF1A1A1A))
                    .border(1.dp, RlPalette.SurfaceBorder, RoundedCornerShape(4.dp))
                    .padding(8.dp)
                    .verticalScroll(rememberScrollState()),
            ) {
                BasicTextField(
                    value = text,
                    onValueChange = { text = it },
                    textStyle = TextStyle(color = Color.White, fontSize = 12.sp),
                    cursorBrush = SolidColor(RlPalette.Accent),
                    modifier = Modifier.fillMaxSize(),
                )
                if (text.isEmpty())
                {
                    Text("Tap to start typing…", color = RlPalette.TextDisabled, fontSize = 12.sp)
                }
            }
            Spacer(Modifier.size(8.dp))
            Row {
                PanelButton(
                    label = "Save",
                    enabled = text != savedText,
                    onClick = { NotesBridge.write(text); savedText = text },
                )
                Spacer(Modifier.size(8.dp))
                PanelButton(
                    label = "Reload",
                    onClick = {
                        val live = NotesBridge.read()
                        text = live
                        savedText = live
                    },
                )
            }
        }
    }
}

internal object NotesBridge
{
    private const val GROUP = "notes"
    private const val KEY = "notesData"

    fun read(): String
    {
        val cm = RuneLiteAccess.instance(net.runelite.client.config.ConfigManager::class.java) ?: return ""
        return try { cm.getConfiguration(GROUP, KEY) } catch (t: Throwable) { null } ?: ""
    }

    fun write(value: String)
    {
        val cm = RuneLiteAccess.instance(net.runelite.client.config.ConfigManager::class.java) ?: return
        try
        {
            if (value.isEmpty()) cm.unsetConfiguration(GROUP, KEY)
            else cm.setConfiguration(GROUP, KEY, value)
        }
        catch (t: Throwable) { /* host logs */ }
    }
}
