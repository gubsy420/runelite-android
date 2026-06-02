import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jx")
public class jx {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean al_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	static jx ag_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	static jx ak_fld;

	jx(int var1) {
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public static void na(wz var0) {
		if (var0.aa_fld != -1) {
			if (var0.af_fld[var0.aa_fld] != null) {
				var0.af_fld[var0.aa_fld].ar(1167085109);
			}

			var0.aa_fld = -176008309;
		}
	}

	static {
		short var1 = 25286;
		ak_fld = new jx(1 + var1);
		var1 = 25286;
		ag_fld = new jx(1 + var1);
	}
}
