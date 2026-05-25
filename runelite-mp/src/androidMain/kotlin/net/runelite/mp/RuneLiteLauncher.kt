package net.runelite.mp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.mutableStateListOf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import android.util.Log
import net.runelite.awt.AwtCompat

private const val TAG = "RuneLiteLauncher"

/**
 * Drives RuneLite's headless boot from a Compose UI: kicks off `net.runelite.client.RuneLite.main`
 * on a background thread, captures everything that escapes (and everything `System.out` /
 * `System.err` print), and exposes it as state so the UI can render progress + failures.
 */
class RuneLiteLauncher(private val context: android.content.Context? = null) {
    enum class State { Idle, Starting, Running, Failed }

    var state: State by mutableStateOf(State.Idle)
        private set
    var error: Throwable? by mutableStateOf(null)
        private set

    val log: SnapshotStateList<String> = mutableStateListOf()

    private var job: Job? = null

    fun launch(scope: CoroutineScope, vararg args: String) {
        if (job?.isActive == true) return
        state = State.Starting
        error = null
        log.clear()
        log += "$ runelite ${args.joinToString(" ")}"

        job = scope.launch(Dispatchers.IO) {
            try {
                AwtCompat.ensureReady()
                logLine("android-awt native ABI ready")
                state = State.Running

                installLogTaps()

                seedLauncherCredentials()
                runNetSelfTest()

                val cls = Class.forName("net.runelite.client.RuneLite")
                val main = cls.getDeclaredMethod("main", Array<String>::class.java)
                logLine("invoking ${cls.name}.main(${args.size} args)")
                main.invoke(null, args)
                logLine("main returned cleanly")

                val safeMode = args.contains("--safe-mode")
                if (safeMode) {
                    logLine("--safe-mode: skipping PluginBootstrap entirely (no plugins will load)")
                } else if (context != null) {
                    logLine("bootstrapping plugins (RuneLite.loadCorePlugins doesn't see Android dex)")
                    PluginBootstrap.bootstrap(context)
                    logLine("plugin bootstrap done")
                } else {
                    logLine("context not provided to launcher; skipping plugin bootstrap")
                }
            } catch (t: Throwable) {
                val root = unwrap(t)
                error = root
                state = State.Failed
                logLine("FATAL: ${root.javaClass.name}: ${root.message}")
                Log.e(TAG, "RuneLite.main failed", root)
                root.stackTrace.take(20).forEach { logLine("  at $it") }
            }
        }
    }

    private fun logLine(line: String) {
        log += line
        Log.i(TAG, line)
    }

    private fun intToBE(value: Int): ByteArray = byteArrayOf(
        (value ushr 24).toByte(),
        (value ushr 16).toByte(),
        (value ushr 8).toByte(),
        value.toByte(),
    )

    // Pre-flight check: verify Android's network stack does what the patched OSRS client
    // expects before we launch into the game. Failures here narrow down whether the
    // "RuneScape has been updated" dialog is network-layer or protocol-layer.
    private fun runNetSelfTest() {
        try {
            val t0 = System.currentTimeMillis()
            val addrs = java.net.InetAddress.getAllByName("oldschool.runescape.com")
            logLine("netcheck DNS oldschool.runescape.com → ${addrs.size} addr(s) in ${System.currentTimeMillis() - t0}ms")
            for (a in addrs) logLine("  · ${a.hostAddress}")

            val configT = System.currentTimeMillis()
            val javConfigUrl = java.net.URL("https://oldschool.runescape.com/jav_config.ws")
            val conn = javConfigUrl.openConnection() as java.net.HttpURLConnection
            conn.connectTimeout = 5000
            conn.readTimeout = 5000
            conn.requestMethod = "GET"
            val code = conn.responseCode
            val bytes = conn.inputStream.use { it.readBytes() }
            conn.disconnect()
            logLine("netcheck jav_config GET ${code} (${bytes.size}B) in ${System.currentTimeMillis() - configT}ms")
            val preview = String(bytes, 0, minOf(bytes.size, 200), Charsets.US_ASCII).replace("\n", " | ")
            logLine("  jav_config preview: ${preview}")

            val socketT = System.currentTimeMillis()
            val host = addrs[0].hostAddress
            val sock = java.net.Socket()
            sock.connect(java.net.InetSocketAddress(host, 443), 5000)
            logLine("netcheck Socket TCP $host:443 connected in ${System.currentTimeMillis() - socketT}ms (local=${sock.localAddress.hostAddress}:${sock.localPort})")
            sock.close()

            // Test the actual game/js5 endpoints the patched client connects to.
            // The codebase from jav_config is "oldschool69.runescape.com" (world 69);
            // game = 43594, js5 = 43595. If these fail on Android but work on desktop
            // (same network), that's the netcode delta we're chasing.
            for (port in intArrayOf(43594, 43595)) {
                val gt = System.currentTimeMillis()
                try {
                    val gameAddrs = java.net.InetAddress.getAllByName("oldschool69.runescape.com")
                    val gsock = java.net.Socket()
                    gsock.connect(java.net.InetSocketAddress(gameAddrs[0], port), 5000)
                    logLine("netcheck Socket TCP oldschool69.runescape.com (${gameAddrs[0].hostAddress}):$port → OK in ${System.currentTimeMillis() - gt}ms")
                    // Try sending the OSRS js5 handshake (opcode 15, then revision int)
                    // and read 1 byte response. Should return 0 (OK) or a status code.
                    if (port == 43595) {
                        val out = gsock.getOutputStream()
                        // js5 handshake: opcode 15, 4-byte revision, 4-byte sub-revision
                        out.write(15)
                        out.write(intToBE(226))  // recent OSRS revision (just a probe)
                        out.write(intToBE(1))
                        out.flush()
                        val inp = gsock.getInputStream()
                        val resp = inp.read()
                        logLine("netcheck js5 handshake response byte: $resp (0=OK, 6=updated, 5=server full, 9=ip limit)")
                    }
                    gsock.close()
                } catch (e: Throwable) {
                    logLine("netcheck Socket TCP :$port FAILED: ${e.javaClass.simpleName}: ${e.message}")
                }
            }
        } catch (t: Throwable) {
            logLine("netcheck FAILED: ${t.javaClass.simpleName}: ${t.message}")
            Log.w(TAG, "netcheck failed", t)
        }
    }

    // The injected RS client reads JX_ACCESS_TOKEN / JX_REFRESH_TOKEN / JX_SESSION_ID /
    // JX_CHARACTER_ID / JX_DISPLAY_NAME from System.getenv(). On desktop these are set
    // by the Jagex launcher; on Android we ship them as an asset (credentials.properties,
    // gitignored) and seed them into the process env via Os.setenv before the client class
    // is loaded.
    private fun seedLauncherCredentials() {
        val ctx = context ?: return
        val props = try {
            ctx.assets.open("credentials.properties").use { stream ->
                java.util.Properties().apply { load(stream) }
            }
        } catch (e: java.io.FileNotFoundException) {
            logLine("no credentials.properties asset; skipping JX_* env seed")
            return
        } catch (e: Throwable) {
            logLine("failed to read credentials.properties: ${e.message}")
            return
        }
        var seeded = 0
        for (key in props.stringPropertyNames()) {
            val value = props.getProperty(key) ?: continue
            if (value.isEmpty()) continue
            try {
                android.system.Os.setenv(key, value, true)
                seeded++
            } catch (e: Throwable) {
                logLine("Os.setenv($key) failed: ${e.message}")
            }
        }
        logLine("seeded $seeded launcher env var(s) from credentials.properties")
    }

    private fun installLogTaps() {
        System.setOut(LineTap(System.out, "[stdout] "))
        System.setErr(LineTap(System.err, "[stderr] "))
    }

    private inner class LineTap(private val downstream: java.io.PrintStream, private val prefix: String)
        : java.io.PrintStream(downstream) {
        private val buf = StringBuilder()
        override fun write(b: Int) {
            downstream.write(b)
            if (b == '\n'.code) {
                appendLine()
            } else {
                buf.append(b.toChar())
            }
        }
        override fun write(b: ByteArray, off: Int, len: Int) {
            downstream.write(b, off, len)
            for (i in 0 until len) {
                val c = b[off + i].toInt().toChar()
                if (c == '\n') appendLine() else buf.append(c)
            }
        }
        private fun appendLine() {
            val line = buf.toString().trimEnd('\r')
            buf.setLength(0)
            log += prefix + line
        }
    }

    private fun unwrap(t: Throwable): Throwable {
        var cur: Throwable = t
        while (cur is java.lang.reflect.InvocationTargetException && cur.cause != null) {
            cur = cur.cause!!
        }
        return cur
    }
}
