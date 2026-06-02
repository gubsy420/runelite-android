// Default-package mixin — runescape-client's obfuscated types live in the default
// package, and Java forbids importing default-package types from a packaged source.

import net.runelite.mixins.annotations.Inject;
import net.runelite.mixins.annotations.MethodHook;
import net.runelite.mixins.annotations.Mixin;

/**
 * Hooks the obfuscated fingerprint serializer so every login attempt prints the
 * payload Jagex is about to ship to the server. Target is {@code vu.ak(xi)V}
 * (exported as {@code serializeFingerprint} by the sanitizer), called from three
 * call sites in {@code client} during session init.
 *
 * <p>Field access uses {@code (vu)(Object) this} so javac looks up the fields on
 * {@code vu} rather than on the (synthetic) mixin class — at runtime the method has
 * been woven into {@code vu} and {@code this} really is a {@code vu} instance. The
 * injector's deobf-reference rewrite then maps each {@code vu.<deobf>_fld} reference
 * to the obfuscated single-letter name baked into the target jar.</p>
 *
 * <p>Each int field is stored multiplier-encoded by the obfuscator (the "ModArith"
 * trick: writes multiply by an encoder E, reads multiply by the decoder D = E^-1 mod
 * 2^32, so {@code field*D = originalValue}). MultiplierDeobfuscator strips both
 * halves in the SANITIZED jar but the obfuscated jar — which is what mp loads —
 * still holds the encoded value. The DECODE_* constants are the {@code intValue}
 * field of {@code @ObfuscatedGetter} on each vu field (lifted out of the sanitized
 * source); we multiply on read to recover the human-readable value.</p>
 *
 * <p>Read-only by design. Mutating any of these fields here would change what mp
 * ships to Jagex — which is a fingerprint-spoof and a different conversation.</p>
 */
@Mixin("vu")
public abstract class FingerprintMixin
{
	private static final int DECODE_BT = -2048773107;
	private static final int DECODE_BI = 205734307;
	private static final int DECODE_BU = 855290095;
	private static final int DECODE_BQ = 2076850581;
	private static final int DECODE_BG = -263334553;
	private static final int DECODE_CD = -792819237;
	private static final int DECODE_CF = -168945063;
	private static final int DECODE_CX = 99794559;
	private static final int DECODE_CS = 1907875181;

	@MethodHook("serializeFingerprint")
	public void onSerializeFingerprint()
	{
		vu self = (vu) (Object) this;
		int osType = self.bt_fld * DECODE_BT;
		int osVersion = self.bi_fld * DECODE_BI;
		int javaVendor = self.bu_fld * DECODE_BU;
		int maxHeapMb = self.bq_fld * DECODE_BQ;
		int cpuCount = self.bg_fld * DECODE_BG;
		int classSigHash = self.cd_fld * DECODE_CD;
		int jvMajor = self.cf_fld * DECODE_CF;
		int jvMinor = self.cx_fld * DECODE_CX;
		int jvPatch = self.cs_fld * DECODE_CS;

		System.out.println("===== Jagex device fingerprint =====");
		System.out.println("OS type:           " + osType + " (" + osTypeLabel(osType) + ")");
		System.out.println("64-bit arch:       " + self.bv_fld);
		System.out.println("OS version code:   " + osVersion);
		System.out.println("Java vendor:       " + javaVendor + " (" + javaVendorLabel(javaVendor) + ")");
		System.out.println("Java version:      " + jvMajor + "." + jvMinor + "." + jvPatch);
		System.out.println("Max heap (MB):     " + maxHeapMb);
		System.out.println("CPU count:         " + cpuCount);
		System.out.println("Class sig hash:    0x" + Integer.toHexString(classSigHash));
		System.out.println("Process name:      " + self.cv_fld);
		System.out.println("Parent process:    " + self.cy_fld);
		System.out.println("JVM args prefix:   " + self.cw_fld);
		System.out.println("Version ints:      " + java.util.Arrays.toString(self.cr_fld));
		System.out.println("====================================");
	}

	@Inject
	private static String osTypeLabel(int code)
	{
		switch (code)
		{
			case 1: return "Windows";
			case 2: return "macOS";
			case 3: return "Linux";
			case 4: return "other";
			default: return "unknown";
		}
	}

	@Inject
	private static String javaVendorLabel(int code)
	{
		switch (code)
		{
			case 1: return "Sun";
			case 2: return "Microsoft";
			case 3: return "Apple";
			case 4: return "other";
			case 5: return "Oracle";
			default: return "unknown";
		}
	}
}
