package net.runelite.mp

import android.graphics.Bitmap
import android.view.SurfaceView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.changedToUpIgnoreConsumed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.viewinterop.AndroidView
import kotlinx.coroutines.withTimeoutOrNull

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
 * into a stable Android Bitmap, and renders it. The AWT Window is resized each frame to
 * match the viewport's actual pixel size — that way the BufferedImage backing the canvas
 * is 1:1 with what Compose displays and text / overlays render crisply at native device
 * resolution instead of being bilinear-upscaled from a 1280×720 source.
 */
@Composable
private fun GameViewport(modifier: Modifier = Modifier) {
    var bitmap: Bitmap? by remember { mutableStateOf(null) }
    var imageBitmap: ImageBitmap? by remember { mutableStateOf(null) }
    var boxSize by remember { mutableStateOf(IntSize.Zero) }
    // Canvas rect in window-space; null until the first frame after the AWT Canvas attaches
    // to a Window. The Compose SurfaceView host re-maps this through ContentScale.Fit each
    // recomposition to track resizes and the canvas being moved around inside the frame.
    var canvasRect by remember { mutableStateOf<java.awt.Rectangle?>(null) }

    // Step 1 of GpuGlesPlugin: enable the host pipeline so Window.hostPaint punches an
    // alpha=0 hole at the Canvas rect and the SurfaceView underneath shows through. Later
    // steps will gate this on the actual plugin being active; for now we always-on it to
    // validate layering before EGL/shaders land.
    LaunchedEffect(Unit) { java.awt.Canvas.setRenderedByGles(true) }

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
                var bmp = bitmap
                if (bmp == null || bmp.width != w || bmp.height != h) {
                    bmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
                    // OSRS rasterizer writes RGB ints with alpha=0. Telling the Bitmap
                    // "treat all pixels as opaque" lets the renderer skip alpha sampling
                    // entirely — ~10% of frame time on this hot path. Disabled when the
                    // GLES host owns the canvas, because we *need* an honest alpha channel
                    // so the SurfaceView shows through the punched hole.
                    if (!java.awt.Canvas.isRenderedByGles()) bmp.setHasAlpha(false)
                    bitmap = bmp
                }
                bmp.setPixels(src.backingArray(), 0, w, 0, 0, w, h)
                imageBitmap = bmp.asImageBitmap()
            }
            canvasRect = java.awt.Canvas.latest()?.boundsInWindow
        }
    }

    Box(
        modifier = modifier
            .background(Color.Black)
            .onSizeChanged { boxSize = it }
            // Hover tracking: stylus / mouse / trackpad moves with no button down emit
            // PointerEventType.Move events whose changes are not pressed. Forward those
            // to MOUSE_MOVED so cursor-tracked UI (tooltips, hover highlights, the OSRS
            // "look at" reticle) updates as the pointer glides over the surface. Kept in
            // a separate pointerInput so it doesn't race with the gesture state machine.
            .pointerInput(Unit) {
                awaitPointerEventScope {
                    while (true) {
                        val event = awaitPointerEvent(PointerEventPass.Initial)
                        val change = event.changes.firstOrNull() ?: continue
                        if (change.pressed) continue
                        when (event.type) {
                            PointerEventType.Move, PointerEventType.Enter -> {
                                dispatchMove(change.position, boxSize)
                            }
                        }
                    }
                }
            }
            .pointerInput(Unit) {
                val longPressMs = android.view.ViewConfiguration.getLongPressTimeout().toLong()
                val touchSlop = viewConfiguration.touchSlop
                awaitEachGesture {
                    val down = awaitFirstDown(requireUnconsumed = false)
                    val downId = down.id
                    val downTime = System.currentTimeMillis()
                    var lastPos: Offset = down.position
                    var totalMoved = 0f
                    var session: DragSession? = null
                    var fired = false  // true once we've emitted tap / long-press / drag-start
                    var sawUp = false

                    // Park the cursor at the down location so the next press is at the right spot.
                    dispatchMove(down.position, boxSize)

                    while (true) {
                        // Until we've committed to a gesture, race the next pointer event
                        // against the long-press deadline. Compose only emits events on touch
                        // updates, so a perfectly still finger would otherwise never trigger
                        // the long-press path.
                        val ev = if (!fired) {
                            val remaining = longPressMs - (System.currentTimeMillis() - downTime)
                            if (remaining > 0) {
                                withTimeoutOrNull(remaining) { awaitPointerEvent(PointerEventPass.Main) }
                            } else {
                                null
                            }
                        } else {
                            awaitPointerEvent(PointerEventPass.Main)
                        }

                        if (ev == null) {
                            // Long-press deadline expired without movement → right-click.
                            fired = true
                            dispatchClick(lastPos, boxSize, BUTTON3)
                            // Swallow remaining pointer events so the held-down finger doesn't
                            // get re-interpreted as a second gesture when it finally lifts.
                            while (!sawUp) {
                                val tail = awaitPointerEvent(PointerEventPass.Main)
                                val tc = tail.changes.firstOrNull { it.id == downId } ?: break
                                tc.consume()
                                if (tc.changedToUpIgnoreConsumed() || !tc.pressed) sawUp = true
                            }
                            break
                        }

                        val change = ev.changes.firstOrNull { it.id == downId } ?: break
                        totalMoved += change.positionChange().getDistance()
                        lastPos = change.position

                        if (!fired) {
                            if (totalMoved > touchSlop) {
                                // Begin a drag — pick BUTTON2 inside Canvas (camera) or
                                // BUTTON1 in any other UI surface (scroll/list/slider).
                                fired = true
                                session = beginDrag(down.position, change.position, boxSize)
                                if (session == null) break
                            }
                        } else if (session != null) {
                            session.update(change.position, boxSize)
                        }

                        if (change.changedToUpIgnoreConsumed() || !change.pressed) {
                            change.consume()
                            sawUp = true
                            break
                        }
                        change.consume()
                    }

                    if (session != null) {
                        session.end()
                    } else if (!fired) {
                        // Quick tap with little movement → left click
                        dispatchClick(down.position, boxSize, BUTTON1)
                    }
                }
            },
    ) {
        // GLES SurfaceView — sits underneath the chrome image, sized + offset to land
        // exactly where the AWT Canvas would be after the chrome Image's ContentScale.Fit
        // letterbox. Currently painted solid red for visual validation of step 1; the
        // EGL/GLES drawing path lands in step 2.
        val rect = canvasRect
        val density = LocalDensity.current
        if (rect != null && boxSize.width > 0 && boxSize.height > 0) {
            val ww = FRAME_WIDTH.toFloat()
            val wh = FRAME_HEIGHT.toFloat()
            val scale = minOf(boxSize.width / ww, boxSize.height / wh)
            val padX = ((boxSize.width - ww * scale) / 2f).toInt()
            val padY = ((boxSize.height - wh * scale) / 2f).toInt()
            val sx = padX + (rect.x * scale).toInt()
            val sy = padY + (rect.y * scale).toInt()
            val sw = (rect.width * scale).toInt().coerceAtLeast(1)
            val sh = (rect.height * scale).toInt().coerceAtLeast(1)
            val swDp = with(density) { sw.toDp() }
            val shDp = with(density) { sh.toDp() }
            AndroidView(
                factory = { ctx ->
                    SurfaceView(ctx).also { view ->
                        // Hand the surface over to the GLES host so GpuGlesPlugin can
                        // create its EGL window surface against it. The host caches the
                        // view internally and re-registers callbacks if reattached.
                        net.runelite.client.plugins.gpugles.GlesHost.get().attachSurfaceView(view)
                    }
                },
                modifier = Modifier
                    .offset { IntOffset(sx, sy) }
                    .size(swDp, shDp),
            )
        }
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

// ---------------------------------------------------------------------------------------
// Input bridge: Compose pointer events → shadow AWT MouseEvent dispatch.
//
// Three gestures supported:
//   - Tap (down → up with < touchSlop movement, < longPressTimeout): left click (BUTTON1).
//   - Long press (down → hold > longPressTimeout without moving): right click (BUTTON3).
//   - Drag (down → exceeds touchSlop): BUTTON2 (middle, camera) inside the game Canvas,
//     BUTTON1 elsewhere (scrollbars, list items, etc.).
//
// Walk-up dispatch: the patched RS Applet registers its MouseListener on itself, not on
// the inner Canvas. A tap hit-tests to the deepest Canvas which has zero listeners. We
// climb the parent chain until finding a component with mouseListeners, then translate
// the click coords into that component's local space.
// ---------------------------------------------------------------------------------------

private const val BUTTON1 = java.awt.event.MouseEvent.BUTTON1
private const val BUTTON2 = java.awt.event.MouseEvent.BUTTON2
private const val BUTTON3 = java.awt.event.MouseEvent.BUTTON3

/** Maps a Compose offset (Box-local pixels) into the AWT Window's coordinate space,
 *  undoing ContentScale.Fit's letterbox. Returns null when the tap lands outside the
 *  rendered bitmap (in the black letterbox margins). */
private fun composeToWindow(offset: Offset, boxSize: IntSize, window: java.awt.Window): Pair<Int, Int>? {
    if (boxSize.width <= 0 || boxSize.height <= 0) return null
    val ww = window.width.toFloat().coerceAtLeast(1f)
    val wh = window.height.toFloat().coerceAtLeast(1f)
    val scale = minOf(boxSize.width / ww, boxSize.height / wh)
    if (scale <= 0f) return null
    val drawnW = ww * scale
    val drawnH = wh * scale
    val padX = (boxSize.width - drawnW) / 2f
    val padY = (boxSize.height - drawnH) / 2f
    val x = ((offset.x - padX) / scale).toInt()
    val y = ((offset.y - padY) / scale).toInt()
    if (x < 0 || y < 0 || x >= window.width || y >= window.height) return null
    return x to y
}

/** Result of hit-testing: the deepest visible Component, plus the (absX, absY) origin
 *  of that component within the window so we can translate later to whichever ancestor
 *  ends up being the dispatch target. */
private data class Hit(val comp: java.awt.Component, val absX: Int, val absY: Int)

private fun hitTest(window: java.awt.Window, winX: Int, winY: Int): Hit? {
    fun walk(c: java.awt.Component, tx: Int, ty: Int): Hit? {
        if (!c.isVisible || c.width <= 0 || c.height <= 0) return null
        val ax = tx + c.x
        val ay = ty + c.y
        if (winX < ax || winY < ay || winX >= ax + c.width || winY >= ay + c.height) return null
        var deepest: Hit? = Hit(c, ax, ay)
        if (c is java.awt.Container) {
            // Iterate children in reverse so later-added siblings (drawn on top) win.
            val kids = c.components
            for (i in kids.indices.reversed()) {
                val child = kids[i] ?: continue
                val sub = walk(child, ax, ay)
                if (sub != null) { deepest = sub; break }
            }
        }
        return deepest
    }
    return walk(window, 0, 0)
}

/** Fire MOUSE_MOVED on the topmost component-with-motion-listeners at the given point.
 *  RuneScape (and most AWT input code) caches the last mouse position from MOTION events
 *  and uses it when it sees the press; if we never send a MOVED, the next press lands at
 *  whatever stale coordinate the client last saw — which manifests as the click being
 *  applied to the previous click location, with the press cursor jumping in afterward.
 *  Call this immediately before any MOUSE_PRESSED so the client's tracked cursor is at
 *  the new spot first. */
private fun dispatchMove(offset: Offset, boxSize: IntSize) {
    val window = java.awt.Window.primaryFrame() ?: return
    val (winX, winY) = composeToWindow(offset, boxSize, window) ?: return
    val hit = hitTest(window, winX, winY) ?: return
    val target = walkUpToListener(hit.comp) ?: hit.comp
    val (lx, ly) = localCoords(target, winX, winY)
    fireMouse(target, java.awt.event.MouseEvent.MOUSE_MOVED, lx, ly, java.awt.event.MouseEvent.NOBUTTON, false)
}

/** Walk up from `hit` until we find a component with mouse listeners, then dispatch a
 *  MOVED → PRESSED → RELEASED → CLICKED sequence translated into that component's local
 *  space. Falls back to the hit target if nothing up the chain subscribes. */
private fun dispatchClick(offset: Offset, boxSize: IntSize, button: Int) {
    val window = java.awt.Window.primaryFrame() ?: return
    val (winX, winY) = composeToWindow(offset, boxSize, window) ?: return
    val hit = hitTest(window, winX, winY) ?: return
    val target = walkUpToListener(hit.comp) ?: hit.comp
    val (lx, ly) = localCoords(target, winX, winY)
    fireMouse(target, java.awt.event.MouseEvent.MOUSE_MOVED, lx, ly, java.awt.event.MouseEvent.NOBUTTON, false)
    fireMouse(target, java.awt.event.MouseEvent.MOUSE_PRESSED, lx, ly, button, true)
    fireMouse(target, java.awt.event.MouseEvent.MOUSE_RELEASED, lx, ly, button, false)
    fireMouse(target, java.awt.event.MouseEvent.MOUSE_CLICKED, lx, ly, button, false)

    // Compose-side widget helpers — these aren't reachable via AWT MouseListener so we
    // call their high-level click APIs directly when the hit lands on them.
    when (val direct = hit.comp) {
        is javax.swing.JTabbedPane -> {
            val (dx, dy) = localCoords(direct, winX, winY)
            val idx = direct.indexAtLocation(dx, dy)
            if (idx >= 0 && button == BUTTON1) {
                direct.selectedIndex = if (direct.selectedIndex == idx) -1 else idx
            }
        }
        is javax.swing.AbstractButton -> if (button == BUTTON1) direct.doClick()
        else -> { /* Mouse event dispatch covers everything else. */ }
    }
}

/** Multiplier applied to canvas-drag deltas. The shadow window is rendered with
 *  ContentScale.Fit, so a finger movement of N Compose-px maps to <N AWT-px after the
 *  inverse-scale, which makes camera rotation feel sluggish. Amplifying inside the
 *  Canvas only keeps UI drags (scrollbars, etc.) at 1:1. */
private const val CANVAS_DRAG_GAIN = 2.5f

/** Common contract for "in-progress drag" handlers. The gesture state machine just
 *  feeds Compose pointer updates here; concrete implementations decide whether to
 *  dispatch MOUSE_DRAGGED, MOUSE_WHEEL, or something else. */
private interface DragSession {
    fun update(pos: Offset, boxSize: IntSize)
    fun end()
}

/** Live drag session — sends MOUSE_PRESSED to start, MOUSE_DRAGGED on each move, and
 *  MOUSE_RELEASED on end. button is BUTTON2 inside the game Canvas (camera-look) and
 *  BUTTON1 elsewhere (scrollbar, list, etc.). For canvas drags we accumulate scaled
 *  delta instead of replaying absolute coords, so finger speed → camera speed feels
 *  responsive even though the underlying window is letterboxed. */
private class MouseDragSession(
    val target: java.awt.Component,
    val originAbsX: Int,
    val originAbsY: Int,
    val button: Int,
    val originWinX: Int,
    val originWinY: Int,
    val amplify: Boolean,
) : DragSession {
    private var lastX = originWinX - originAbsX
    private var lastY = originWinY - originAbsY
    private var virtualX = lastX.toFloat()
    private var virtualY = lastY.toFloat()
    private var lastWinX = originWinX
    private var lastWinY = originWinY

    fun start() {
        // MOVED to park the cursor at the press point, then the actual PRESSED.
        fireMouse(target, java.awt.event.MouseEvent.MOUSE_MOVED, lastX, lastY, java.awt.event.MouseEvent.NOBUTTON, false)
        fireMouse(target, java.awt.event.MouseEvent.MOUSE_PRESSED, lastX, lastY, button, true)
    }

    override fun update(pos: Offset, boxSize: IntSize) {
        val window = java.awt.Window.primaryFrame() ?: return
        val (wx, wy) = composeToWindow(pos, boxSize, window) ?: return
        if (amplify) {
            virtualX += (wx - lastWinX) * CANVAS_DRAG_GAIN
            virtualY += (wy - lastWinY) * CANVAS_DRAG_GAIN
            lastWinX = wx
            lastWinY = wy
            lastX = virtualX.toInt()
            lastY = virtualY.toInt()
        } else {
            lastX = wx - originAbsX
            lastY = wy - originAbsY
        }
        fireMouse(target, java.awt.event.MouseEvent.MOUSE_DRAGGED, lastX, lastY, button, true)
    }

    override fun end() {
        fireMouse(target, java.awt.event.MouseEvent.MOUSE_RELEASED, lastX, lastY, button, false)
    }
}

/** Translates a finger drag inside a JScrollPane into MOUSE_WHEEL events targeted at
 *  the scrollpane — same code path real Swing takes when the user wheels. Accumulates
 *  drag deltas until a notch threshold is crossed, then dispatches one wheel-rotation
 *  event with the integer notch count. Natural-touch direction: drag down → scroll up
 *  (negative wheel rotation), like a phone list. */
private class ScrollDragSession(
    val scrollPane: javax.swing.JScrollPane,
    var lastWinX: Int,
    var lastWinY: Int,
) : DragSession {
    private var accumulated = 0f

    override fun update(pos: Offset, boxSize: IntSize) {
        val window = java.awt.Window.primaryFrame() ?: return
        val (wx, wy) = composeToWindow(pos, boxSize, window) ?: return
        val dy = wy - lastWinY
        lastWinX = wx
        lastWinY = wy
        // Negate so finger-down moves content UP (touchscreen convention).
        accumulated += -dy / NOTCH_PX
        val notches = accumulated.toInt()
        if (notches != 0) {
            accumulated -= notches.toFloat()
            val ev = java.awt.event.MouseWheelEvent(
                scrollPane,
                java.awt.event.MouseEvent.MOUSE_WHEEL,
                System.currentTimeMillis(),
                0,
                wx - scrollPaneAbsX(),
                wy - scrollPaneAbsY(),
                0,
                false,
                java.awt.event.MouseWheelEvent.WHEEL_UNIT_SCROLL,
                1,
                notches,
            )
            scrollPane.dispatchMouseEvent(ev)
        }
    }

    override fun end() {
        // No-op; wheel events are independent.
    }

    private fun scrollPaneAbsX(): Int {
        var x = 0; var c: java.awt.Component? = scrollPane
        while (c != null) { x += c.x; c = c.parent }
        return x
    }
    private fun scrollPaneAbsY(): Int {
        var y = 0; var c: java.awt.Component? = scrollPane
        while (c != null) { y += c.y; c = c.parent }
        return y
    }

    companion object {
        /** Pixels of finger movement per wheel-notch. ~32 ≈ one list-row per ~32px,
         *  which matches the feel of stock Android scrolling. */
        private const val NOTCH_PX = 32f
    }
}

private fun beginDrag(downPos: Offset, currentPos: Offset, boxSize: IntSize): DragSession? {
    val window = java.awt.Window.primaryFrame() ?: return null
    // Start the press at the original down location, not the slop-crossing point — that
    // way the press lands where the finger first landed and the subsequent drag deltas
    // align with the user's intent.
    val (winX, winY) = composeToWindow(downPos, boxSize, window) ?: return null
    val hit = hitTest(window, winX, winY) ?: return null
    val ancestry = ancestorChain(hit.comp).toList()
    val draggingCanvas = ancestry.any { it is java.awt.Canvas }
    // Outside the game Canvas: if there's a JScrollPane in the ancestry the drag
    // translates into MOUSE_WHEEL events on that scrollpane (same path real Swing
    // takes when you wheel-scroll the plugin list). Replicates the desktop UX
    // without us needing to draw a scrollbar thumb to grab.
    if (!draggingCanvas) {
        val scrollPane = ancestry.firstOrNull { it is javax.swing.JScrollPane } as? javax.swing.JScrollPane
        if (scrollPane != null) {
            val session = ScrollDragSession(scrollPane, winX, winY)
            session.update(currentPos, boxSize)
            return session
        }
    }
    val button = if (draggingCanvas) BUTTON2 else BUTTON1
    val target = walkUpToListener(hit.comp) ?: hit.comp
    // Compute target's absolute origin so update() can re-translate moves.
    val tHit = hitTestExact(window, target) ?: return null
    val session = MouseDragSession(target, tHit.absX, tHit.absY, button, winX, winY, amplify = draggingCanvas)
    session.start()
    // Process the current pos as the first drag step so we don't lose the slop-crossing motion.
    session.update(currentPos, boxSize)
    return session
}

/** Hit-test a known component to recover its absolute screen-space origin. */
private fun hitTestExact(window: java.awt.Window, target: java.awt.Component): Hit? {
    fun walk(c: java.awt.Component, tx: Int, ty: Int): Hit? {
        val ax = tx + c.x
        val ay = ty + c.y
        if (c === target) return Hit(c, ax, ay)
        if (c is java.awt.Container) {
            for (child in c.components) {
                if (child == null) continue
                val r = walk(child, ax, ay)
                if (r != null) return r
            }
        }
        return null
    }
    return walk(window, 0, 0)
}

private fun ancestorChain(c: java.awt.Component): Sequence<java.awt.Component> = sequence {
    var cur: java.awt.Component? = c
    while (cur != null) { yield(cur); cur = cur.parent }
}

/** From a hit, find the closest ancestor (inclusive) that has any mouse listeners. */
private fun walkUpToListener(c: java.awt.Component): java.awt.Component? {
    var cur: java.awt.Component? = c
    while (cur != null) {
        if (cur.hasMouseListeners()) return cur
        cur = cur.parent
    }
    return null
}

/** Translate window-absolute (wx, wy) into target-local coords. */
private fun localCoords(target: java.awt.Component, wx: Int, wy: Int): Pair<Int, Int> {
    var dx = 0
    var dy = 0
    var cur: java.awt.Component? = target
    while (cur != null) {
        dx += cur.x
        dy += cur.y
        cur = cur.parent
    }
    return (wx - dx) to (wy - dy)
}

private fun fireMouse(target: java.awt.Component, id: Int, x: Int, y: Int, button: Int, pressed: Boolean) {
    val mods = if (pressed) when (button) {
        BUTTON1 -> java.awt.event.InputEvent.BUTTON1_DOWN_MASK
        BUTTON2 -> java.awt.event.InputEvent.BUTTON2_DOWN_MASK
        BUTTON3 -> java.awt.event.InputEvent.BUTTON3_DOWN_MASK
        else -> 0
    } else 0
    target.dispatchMouseEvent(
        java.awt.event.MouseEvent(
            target, id, System.currentTimeMillis(),
            mods, x, y, 1, button == BUTTON3, button,
        ),
    )
}
