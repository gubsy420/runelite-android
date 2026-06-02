import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zy")
public class zy extends sr {
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bv_fld;

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lda;Z)V"
	)
	public static void ja(da var0, boolean var1) {
		var0.cg_fld.az_fld = var1;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lik;Ljava/lang/String;)I"
	)
	public static int he(ik var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var1 && !var1.isEmpty()) {
			for (int var2 = 0; var2 < var0.aa_fld; var2++) {
				if (var0.aj_fld[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	zy() throws Throwable {
		throw new Error();
	}
}
