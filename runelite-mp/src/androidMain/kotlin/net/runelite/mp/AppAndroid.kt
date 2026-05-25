package net.runelite.mp

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntSize

private const val FRAME_WIDTH = 1280
private const val FRAME_HEIGHT = 720

@Composable
fun AndroidApp() {
    val context = LocalContext.current.applicationContext
    val launcher = remember { RuneLiteLauncher(context) }
    val scope = rememberCoroutineScope()
    LaunchedEffect(Unit) { launcher.launch(scope) }

    Box(
        modifier = Modifier.fillMaxSize().background(Color.Black)
    ) {
        GameViewport(Modifier.fillMaxSize())
    }
}

/**
 * Polls java.awt.Window.primaryFrame() each frame, copies its BufferedImage int[] backbuffer
 * into a stable Android Bitmap, and renders it. The window is forced to 1280×720 logical
 * pixels — ClientUI.Layout positions everything in that space regardless of physical screen.
 */
@Composable
private fun GameViewport(modifier: Modifier = Modifier) {
    var bitmap: Bitmap? by remember { mutableStateOf(null) }
    var imageBitmap: ImageBitmap? by remember { mutableStateOf(null) }
    var boxSize by remember { mutableStateOf(IntSize.Zero) }
    // Scratch buffer we own, so we don't mutate the BufferedImage's int[] that the OSRS
    // rasterizer is reading/writing each frame. Mutating the source array (e.g. ORing
    // alpha into it) poisons the next frame — the client expects alpha=0 sentinels for
    // its own draw bookkeeping, and SRC_OVER composites against the now-opaque previous
    // pixels stop overwriting cleanly, so old frames leak through (login screen visible
    // behind the welcome screen, etc.).
    var scratch: IntArray? by remember { mutableStateOf(null) }

    LaunchedEffect(Unit) {
        var nextDumpAt = 0L
        var lastWindow: java.awt.Window? = null
        while (true) {
            withFrameNanos { /* tie sampling to display vsync */ }
            val window = java.awt.Window.primaryFrame()
            if (window != null && (window.width != FRAME_WIDTH || window.height != FRAME_HEIGHT)) {
                window.setSize(FRAME_WIDTH, FRAME_HEIGHT)
            }
            val now = System.currentTimeMillis()
            if (window != null && window.width > 0 && (window !== lastWindow || now > nextDumpAt)) {
                android.util.Log.i("TreeDump", "tree (${window.javaClass.simpleName} ${window.width}x${window.height}):\n${window.dumpTree()}")
                lastWindow = window
                nextDumpAt = now + 8_000
            }
            val src = window?.renderToBackbuffer()
                ?: java.awt.Canvas.latest()?.backbuffer
            if (src != null && src.width > 0 && src.height > 0) {
                val w = src.width
                val h = src.height
                val n = w * h
                var bmp = bitmap
                if (bmp == null || bmp.width != w || bmp.height != h) {
                    bmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
                    bitmap = bmp
                }
                var buf = scratch
                if (buf == null || buf.size < n) {
                    buf = IntArray(n)
                    scratch = buf
                }
                // The OSRS 3D rasterizer writes raw RGB ints with the alpha byte left as
                // 0; on desktop the AWT Canvas is opaque so the bits are ignored at
                // composite time. Compose's ARGB_8888 honors them, so force alpha=0xFF
                // in the *copy* (never in `backing` — see scratch declaration).
                val backing = src.backingArray()
                System.arraycopy(backing, 0, buf, 0, n)
                for (i in 0 until n) buf[i] = buf[i] or 0xFF000000.toInt()
                bmp.setPixels(buf, 0, w, 0, 0, w, h)
                imageBitmap = bmp.asImageBitmap()
            }
        }
    }

    Box(
        modifier = modifier
            .background(Color.Black)
            .onSizeChanged { boxSize = it }
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress = { offset ->
                        dispatchTap(offset, boxSize)
                    },
                )
            },
    ) {
        val img = imageBitmap
        if (img != null) {
            Image(
                bitmap = img,
                contentDescription = "RuneLite",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit,
            )
        }
    }
}

/**
 * Converts a Compose-px tap into a click on whichever shadow Component lives at that point.
 * Undoes the ContentScale.Fit letterbox, hit-tests the Window tree top-down to find the
 * deepest visible Component at (winX, winY), then routes the click appropriately:
 *  - JTabbedPane: map y → tab index, setSelectedIndex (fires ChangeListener)
 *  - AbstractButton (JButton): doClick() (fires ActionListener)
 *  - Otherwise (Canvas or any leaf with mouse listeners): dispatchMouseEvent
 */
private fun dispatchTap(offset: Offset, boxSize: IntSize) {
    if (boxSize.width <= 0 || boxSize.height <= 0) return
    val window = java.awt.Window.primaryFrame() ?: return
    val ww = window.width.toFloat().coerceAtLeast(1f)
    val wh = window.height.toFloat().coerceAtLeast(1f)
    val scale = minOf(boxSize.width / ww, boxSize.height / wh)
    if (scale <= 0f) return
    val drawnW = ww * scale
    val drawnH = wh * scale
    val padX = (boxSize.width - drawnW) / 2f
    val padY = (boxSize.height - drawnH) / 2f
    val winX = ((offset.x - padX) / scale).toInt()
    val winY = ((offset.y - padY) / scale).toInt()
    if (winX < 0 || winY < 0 || winX >= window.width || winY >= window.height) return

    // Hit-test: walk tree top-down, accumulating offsets, return deepest visible
    // Component containing (winX, winY) plus its local coords.
    data class Hit(val comp: java.awt.Component, val localX: Int, val localY: Int)
    fun hitTest(c: java.awt.Component, absX: Int, absY: Int, tx: Int, ty: Int): Hit? {
        if (!c.isVisible || c.width <= 0 || c.height <= 0) return null
        val ax = tx + c.x
        val ay = ty + c.y
        if (absX < ax || absY < ay || absX >= ax + c.width || absY >= ay + c.height) return null
        var deepest: Hit? = Hit(c, absX - ax, absY - ay)
        if (c is java.awt.Container) {
            // Iterate children in reverse to favor top-most siblings (later add => on top).
            val kids = c.components
            for (i in kids.indices.reversed()) {
                val child = kids[i] ?: continue
                val sub = hitTest(child, absX, absY, ax, ay)
                if (sub != null) { deepest = sub; break }
            }
        }
        return deepest
    }
    val hit = hitTest(window, winX, winY, 0, 0) ?: return

    when (val target = hit.comp) {
        is javax.swing.JTabbedPane -> {
            val idx = target.indexAtLocation(hit.localX, hit.localY)
            if (idx >= 0) {
                val newIdx = if (target.selectedIndex == idx) -1 else idx
                target.selectedIndex = newIdx
            }
        }
        is javax.swing.AbstractButton -> {
            target.doClick()
        }
        else -> {
            val now = System.currentTimeMillis()
            val mods = java.awt.event.InputEvent.BUTTON1_DOWN_MASK
            target.dispatchMouseEvent(
                java.awt.event.MouseEvent(
                    target, java.awt.event.MouseEvent.MOUSE_PRESSED, now,
                    mods, hit.localX, hit.localY, 1, false, java.awt.event.MouseEvent.BUTTON1,
                ),
            )
            target.dispatchMouseEvent(
                java.awt.event.MouseEvent(
                    target, java.awt.event.MouseEvent.MOUSE_RELEASED, now,
                    0, hit.localX, hit.localY, 1, false, java.awt.event.MouseEvent.BUTTON1,
                ),
            )
            target.dispatchMouseEvent(
                java.awt.event.MouseEvent(
                    target, java.awt.event.MouseEvent.MOUSE_CLICKED, now,
                    0, hit.localX, hit.localY, 1, false, java.awt.event.MouseEvent.BUTTON1,
                ),
            )
        }
    }
}
