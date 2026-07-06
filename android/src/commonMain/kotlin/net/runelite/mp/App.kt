package net.runelite.mp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Cross-target placeholder. The Android target overrides this via {@code AppAndroid} (see
 * src/androidMain/kotlin/.../AppAndroid.kt) to host the live RuneLite launcher; the
 * desktop preview keeps this stub.
 */
@Composable
fun App() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier.fillMaxSize().padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text("RuneLite MP", style = MaterialTheme.typography.headlineMedium)
                Text(
                    "Desktop preview — the Android target hosts the live RuneLite launcher.",
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
    }
}
