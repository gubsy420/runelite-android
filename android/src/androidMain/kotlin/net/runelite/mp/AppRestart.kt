package net.runelite.mp

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Process

/**
 * Cold-restart the app.
 *
 * Switching accounts needs a fresh process: the injected client reads its `JX_*` values once,
 * during `client.init`, and everything RuneLite has loaded since is bound to that session. An
 * Android process cannot re-exec itself, and starting our own activity and then exiting takes
 * the new activity down with us, so the relaunch is done from [RestartActivity], which runs in a
 * separate process (`android:process=":restart"` in the manifest): it kills the original pid,
 * starts [MainActivity] in a new task, and exits. No alarm or special permission involved.
 */
internal object AppRestart
{
    private const val EXTRA_PID = "net.runelite.mp.restart.pid"

    fun restart(context: Context)
    {
        val intent = Intent(context, RestartActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            .putExtra(EXTRA_PID, Process.myPid())
        context.startActivity(intent)
        // Leave immediately; the trampoline finishes the job even if this process lingers.
        Runtime.getRuntime().exit(0)
    }

    class RestartActivity : Activity()
    {
        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            val pid = intent.getIntExtra(EXTRA_PID, 0)
            if (pid > 0 && pid != Process.myPid())
            {
                Process.killProcess(pid)
            }
            startActivity(
                Intent(this, MainActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            )
            finish()
            Runtime.getRuntime().exit(0)
        }
    }
}
