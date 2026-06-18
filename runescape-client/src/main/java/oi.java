import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oi")
public class oi extends vc {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ak_fld = new iw(64);

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Lrr;II)V"
	)
	public static void es(rr var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ae_fld = var1 * 267957414;
		var0.ah_fld = -1808184316 * var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ak_fld.av();
	}

	oi() throws Throwable {
		throw new Error();
	}
}
