import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tt")
public class tt {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ak_fld;

	@ObfuscatedName("xw")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrl;)V"
	)
	public static void xw(rc var0, rl var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var0.bg(var1, -1855322650);
		if (-1 != var2) {
			rc.yq(var0, var2);
			var0.bu(var1, -2020924551);
		}
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(Lbq;)I"
	)
	public static int tq(bq var0) {
		return var0.az_fld;
	}

	tt() throws Throwable {
		throw new Error();
	}
}
