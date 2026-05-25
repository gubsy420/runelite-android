package net.runelite.awt

/**
 * Entry point for the AWT compatibility shim. Call [ensureReady] before any AWT class is
 * touched so the native side has a chance to initialise (logger, color management, etc).
 */
object AwtCompat {
    init {
        System.loadLibrary("runelite_awt_native")
    }

    private const val EXPECTED_ABI_VERSION = 1

    @JvmStatic external fun nativeAbiVersion(): Int

    /**
     * Idempotent. Throws if the native library is the wrong ABI version for this Kotlin
     * code — i.e. someone forgot to rebuild one of the two sides.
     */
    @JvmStatic
    fun ensureReady() {
        val abi = nativeAbiVersion()
        check(abi == EXPECTED_ABI_VERSION) {
            "runelite-awt-native ABI $abi, expected $EXPECTED_ABI_VERSION (rebuild required)"
        }
    }
}
