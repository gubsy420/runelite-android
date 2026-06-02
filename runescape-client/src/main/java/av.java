import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("av")
public class av {
	@ObfuscatedGetter(
		intValue = 1809168103
	)
	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int nj_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cv_fld;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void ar(sl var0, int var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		int var3 = var0.av();
		if (var3 <= 1) {
			if (var2 == 948723319) {
				;
			}
		} else {
			var1 %= var3;
			if (0 != var1) {
				if (var1 < 0) {
					var1 += var3;
				}

				if (var0.ag_fld == yq.ak_fld) {
					int[] var4 = var0.ak();
					int[] var5 = var4;
					int var6 = 0;

					for (int var7 = var3 - 1; var6 < var7; var7--) {
						int var8 = var5[var6];
						var5[var6] = var5[var7];
						var5[var7] = var8;
						var6++;
					}

					int[] var18 = var4;
					int var9 = 0;

					for (int var10 = var1 - 1; var9 < var10; var10--) {
						int var11 = var18[var9];
						var18[var9] = var18[var10];
						var18[var10] = var11;
						var9++;
					}

					int[] var19 = var4;
					int var12 = var1;

					for (int var13 = var3 - 1; var12 < var13; var13--) {
						if (var2 != 948723319) {
							return;
						}

						int var14 = var19[var12];
						var19[var12] = var19[var13];
						var19[var13] = var14;
						var12++;
					}
				} else if (yq.ag_fld == var0.ag_fld) {
					long[] var16 = var0.ag();
					px.at(var16, 0, var3 - 1);
					px.at(var16, 0, var1 - 1);
					px.at(var16, var1, var3 - 1);
				} else {
					Object[] var17 = (Object[])var0.az();
					qn.ac((Object[])var17, 0, var3 - 1);
					qn.ac((Object[])var17, 0, var1 - 1);
					qn.ac((Object[])var17, var1, var3 - 1);
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	static final int ak(int var0, int var1, int var2, int var3) {
		return var2 * var0 + var1 * var3 >> 16;
	}

	av() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ak(int var0, int var1) {
		bg var3 = (bg)bg.ak_fld.ak(var0);
		if (var3 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.ag_fld.length ? var3.ag_fld[var1] : -1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ak(int var0) {
		return wo.ak_fld[var0 << 1];
	}
}
