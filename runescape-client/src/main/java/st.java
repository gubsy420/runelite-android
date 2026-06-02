import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("st")
public class st implements su {
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bu_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Leg;)V"
	)
	public static void ps(eg var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.as_fld; var1++) {
			float var2 = var0.uv_fld[var1];
			var0.uv_fld[var1] = var0.dw_fld[var1];
			var0.dw_fld[var1] = -var2;
		}

		var0.xy();
	}

	public st() {
	}
}
