import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wk")
public class wk {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedGetter(
		intValue = -127556197
	)
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ak_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laak;"
	)
	public static aak ag(Throwable var0, String var1) {
		aak var2;
		if (var0 instanceof aak) {
			var2 = (aak)var0;
		} else {
			var2 = new aak(var0, "");
		}

		if (!var1.endsWith("()")) {
			if (var2.ah_fld.length() != 0) {
				var2.ah_fld = var2.ah_fld + " ";
			}

			var2.ah_fld = var2.ah_fld + var1;
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void az() {
		px.ae_fld.vh();
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Z"
	)
	public static boolean nu(uk var0) {
		return var0.ay_fld;
	}

	wk() throws Throwable {
		throw new Error();
	}
}
