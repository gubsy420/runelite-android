import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("iz")
public class iz {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	@ObfuscatedName("xd")
	@ObfuscatedSignature(
		descriptor = "(Lpn;)I"
	)
	public static int xd(pn var0) {
		return var0.ay_fld.length;
	}

	iz() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public static void tg(cv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bm_fld = rw.ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	static int ag(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
