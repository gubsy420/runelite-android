import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aw")
public interface aw {
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Z"
	)
	static boolean pb(uk var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Lli;)V"
	)
	static void fe(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bf_fld = Math.max(0, var0.bf_fld - zg.ae(var0.am_fld, 1917156394));
	}
}
