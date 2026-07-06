package net.runelite.mp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "RuneLite MP (Desktop preview)",
    ) {
        App()
    }
}
