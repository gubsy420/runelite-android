package net.runelite.mp.security

import android.content.Context
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.os.Build
import android.util.Log
import net.runelite.mp.BuildConfig
import java.security.MessageDigest

/**
 * Boot-time anti-tamper check. Computes the SHA-256 of the running APK's signing
 * certificate and compares against the expected hash compiled into [BuildConfig].
 *
 * The expected hash is itself derived at build time from the release keystore (see
 * `runelite-mp/build.gradle.kts:expectedReleaseSigSha`) — there is no static
 * constant to flip during reverse engineering, and rotating signing keys
 * automatically updates the expected value on the next release build.
 *
 * Defense model: catches a third party disassembling the shipped APK, patching it,
 * re-signing with their own key, and redistributing. They'd have to additionally
 * patch out this check (or find every callsite of `BuildConfig.EXPECTED_SIGNING_SHA256`
 * R8 inlined) — possible but raises the bar past trivial tooling.
 *
 * Debug builds (and release builds that fell back to the debug keystore because no
 * production signing was wired) carry an empty expected value and skip the check —
 * dev iteration is not gated.
 */
object SignatureGuard {

    private const val TAG = "SignatureGuard"

    /**
     * Throws [SecurityException] if the on-device APK's signing cert doesn't match
     * the expected hash. Call from [android.app.Activity.onCreate] before any other
     * init so a tampered APK fails before it can do harm.
     */
    fun verify(context: Context) {
        val expected = BuildConfig.EXPECTED_SIGNING_SHA256
        if (expected.isEmpty()) {
            Log.i(TAG, "no expected fingerprint configured; skipping check")
            return
        }
        val actual = currentSigningSha256(context)
        if (actual == null) {
            Log.e(TAG, "could not read signing certificate; failing closed")
            throw SecurityException("signing certificate unavailable")
        }
        if (!actual.equals(expected, ignoreCase = true)) {
            Log.e(TAG, "signing fingerprint mismatch (expected=$expected actual=$actual)")
            throw SecurityException("signing fingerprint mismatch")
        }
        Log.i(TAG, "signing fingerprint verified")
    }

    private fun currentSigningSha256(context: Context): String? {
        return try {
            val pm = context.packageManager
            val pkg = context.packageName
            val signatures: Array<Signature>? =
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                    val info = pm.getPackageInfo(pkg, PackageManager.GET_SIGNING_CERTIFICATES)
                    val si = info.signingInfo ?: return null
                    if (si.hasMultipleSigners()) si.apkContentsSigners else si.signingCertificateHistory
                } else {
                    // GET_SIGNATURES is deprecated as of P but is the only API on O / O_MR1.
                    @Suppress("DEPRECATION", "PackageManagerGetSignatures")
                    pm.getPackageInfo(pkg, PackageManager.GET_SIGNATURES).signatures
                }
            if (signatures.isNullOrEmpty()) return null
            val digest = MessageDigest.getInstance("SHA-256")
            val hash = digest.digest(signatures[0].toByteArray())
            hash.joinToString("") { "%02x".format(it) }
        } catch (t: Throwable) {
            Log.e(TAG, "failed to compute signing fingerprint", t)
            null
        }
    }
}
