import net.runelite.api.TileObject;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl22")
class rl22 extends vw {
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Lnet/runelite/api/TileObject;"
	)
	public TileObject gy_fld;
	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	public dz yn_fld;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int vr_fld;
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int vm_fld;
	@ObfuscatedName("xt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int xt_fld;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int np_fld;

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public static void ig(hg var0) {
		byte[] var1 = new byte[var0.ak_fld * var0.ak_fld];
		int var2 = 0;

		for (int var3 = var0.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < var0.ak_fld; var4++) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[3][0] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var11 = 0; var11 < var0.ak_fld; var11++) {
			for (int var14 = 0; var14 < var0.ak_fld; var14++) {
				if (var14 <= var11 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[3][1] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < var0.ak_fld; var12++) {
			for (int var15 = var0.ak_fld - 1; var15 >= 0; var15--) {
				if (var15 >= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[3][2] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var13 = var0.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = var0.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 <= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[3][3] = var1;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Z)V"
	)
	public static void du(cn var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var1;
		og.ag();
	}

	public rl22() {
	}
}
