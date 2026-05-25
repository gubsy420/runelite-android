package net.runelite.mp

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // RuneLite hard-codes ~/.runelite for caches, logs, config, and the patched-client
        // backup. Map both user.home and the temp dir into our private app storage so all
        // file operations land somewhere we have permission to write.
        val home = filesDir.absolutePath
        System.setProperty("user.home", home)
        System.setProperty("user.dir", home)
        System.setProperty("java.io.tmpdir", cacheDir.absolutePath)

        // Fullscreen + edge-to-edge, hide system bars (immersive sticky behavior).
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        WindowInsetsControllerCompat(window, window.decorView).apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        setContent { AndroidApp() }
    }
}
