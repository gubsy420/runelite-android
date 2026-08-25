package net.runelite.mp.ui.bridge

import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.PointerType
import androidx.compose.ui.input.pointer.isPrimaryPressed
import androidx.compose.ui.input.pointer.isSecondaryPressed
import androidx.compose.ui.input.pointer.isTertiaryPressed
import androidx.compose.ui.input.pointer.pointerInput

/**
 * Swallows right/middle mouse presses over the Compose chrome (sidebar, config panel,
 * nav strip).
 *
 * `Modifier.clickable` on Android is written for touch: it starts on any pointer-down
 * without ever looking at which physical button produced it, so on a device with a mouse
 * a right-click toggles plugins, opens panels and flips checkboxes exactly like a left
 * click. Desktop RuneLite does nothing on right-click there, and silently doing the
 * primary action is worse than doing nothing — the user cannot tell the app misread the
 * button.
 *
 * Consuming on [PointerEventPass.Initial] is what makes this work: Initial runs parent →
 * child, and `clickable` awaits its down with `requireUnconsumed = true`, so a single
 * modifier high up the chrome tree covers everything beneath it. Touch pointers and
 * scroll events are left completely alone — scroll carries no pressed button, so wheel
 * scrolling over the sidebar keeps working.
 */
fun Modifier.blockNonPrimaryMouse(): Modifier = this.pointerInput(Unit) {
    awaitPointerEventScope {
        while (true) {
            val event = awaitPointerEvent(PointerEventPass.Initial)
            if (event.type == PointerEventType.Scroll) continue
            val change = event.changes.firstOrNull() ?: continue
            if (change.type != PointerType.Mouse) continue
            val buttons = event.buttons
            // Only when the primary button is not also down: a left+right chord still
            // reads as a left click, which is the forgiving reading of a slipped finger.
            if (!buttons.isPrimaryPressed &&
                (buttons.isSecondaryPressed || buttons.isTertiaryPressed)
            ) {
                event.changes.forEach { it.consume() }
            }
        }
    }
}
