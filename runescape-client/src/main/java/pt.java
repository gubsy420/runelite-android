import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pt")
public class pt extends vc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ak_fld = new iw(64);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ad_fld;

	pt() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ao(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}
}
