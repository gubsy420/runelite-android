package net.runelite.mp

import android.Manifest
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import net.runelite.mp.crash.AndroidCrashReporter
import net.runelite.mp.security.SignatureGuard

class MainActivity : ComponentActivity() {
    companion object {
        lateinit var instance: MainActivity
    }
    init {
        instance = this
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Anti-tamper. Runs before EVERY other init so a re-signed APK can't even reach
        // Crashlytics (let alone the launcher) to leak any state. No-op on debug builds.
        SignatureGuard.verify(applicationContext)

        // Install before any other init so a crash inside the System.setProperty calls
        // below (or anything else this activity touches) still reaches Crashlytics. The
        // SDK auto-installs its uncaught handler on first getInstance(); this call also
        // stamps device/app context as custom keys.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            AndroidCrashReporter.install(applicationContext)
        }

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
        // Draw under the camera notch / display cutout instead of leaving a black bar
        // there — the AWT chrome (sidebar, title bar) is empty in that strip otherwise.
        // ALWAYS lets the layout extend into the cutout in any orientation; SHORT_EDGES
        // is the fallback for API 28–29 where ALWAYS doesn't exist.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.attributes.layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            window.attributes.layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
        }
        WindowInsetsControllerCompat(window, window.decorView).apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            requestPermissions(
                arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                100
            )
        }

        setContent { AndroidApp() }
    }
}
