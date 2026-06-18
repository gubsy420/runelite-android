import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("eh")
public class eh {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1436839769
	)
	int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -36494669
	)
	int ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2013936001
	)
	int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -937649509
	)
	int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1309058627
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1279172147
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1915460767
	)
	int ak_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2094881381
	)
	int af_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 803950911
	)
	int as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1425297727
	)
	int ar_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 525603807
	)
	int az_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -116346001
	)
	int al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2057227127
	)
	int au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1526989493
	)
	int ax_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -210112885
	)
	int an_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1144925503
	)
	int aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1628135513
	)
	int ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1466983103
	)
	int aq_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cf_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I"
	)
	public static int ak(byte[] var0, int var1, CharSequence var2) {
		int var4 = var2.length();
		int var5 = var1;

		for (int var6 = 0; var6 < var4; var6++) {
			char var7 = var2.charAt(var6);
			if (var7 <= 127) {
				var0[var5++] = (byte)var7;
			} else if (var7 <= 2047) {
				var0[var5++] = (byte)(192 | var7 >> 6);
				var0[var5++] = (byte)(128 | var7 & '?');
			} else {
				var0[var5++] = (byte)(224 | var7 >> '\f');
				var0[var5++] = (byte)(128 | var7 >> 6 & 63);
				var0[var5++] = (byte)(128 | var7 & '?');
			}
		}

		return var5 - var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void an(int var0, int var1) {
		int[] var3 = new int[ev.af_fld];

		for (int var4 = 0; var4 < var3.length; var4++) {
			int var5 = ev.as() + var4 * 32 + 15;
			int var6 = var5 * 3 + 600;
			int var8 = fc.ah_fld[var5];
			int var7 = eu.dm(var6, var1);
			var3[var4] = var8 * var7 >> 16;
		}

		bw.dk_fld.az_fld.dh(var3, 500, 800, var0 * 334 / var1, 334);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Lsl;"
	)
	static sl av(int var0, Object var1) {
		sl var3 = (sl)var1;
		if (null == var3) {
			throw new RuntimeException();
		} else {
			return var3;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ag(int var0) {
		return var0 >> 8;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIB)V"
	)
	static final void az(dx var0, int var1, int var2, int var3, int var4, byte var5) {
		int[][][] var6 = var0.af_fld;
		int var7 = var0.ah_fld - 1;
		int var8 = var0.aw_fld - 1;

		for (int var9 = var2; var9 <= var4 + var2; var9++) {
			for (int var10 = var1; var10 <= var3 + var1; var10++) {
				if (var10 >= 0 && var10 < var6[0].length - 1) {
					if (var5 >= 1) {
						return;
					}

					if (var9 >= 0 && var9 < var6[0][0].length - 1) {
						if (var5 >= 1) {
							return;
						}

						fp.an_fld[0][var10][var9] = 127;
						if (var1 == var10 && var10 > 0) {
							var6[0][var10][var9] = var6[0][var10 - 1][var9];
						}

						if (var3 + var1 == var10 && var10 < var7) {
							var6[0][var10][var9] = var6[0][1 + var10][var9];
						}

						if (var2 == var9) {
							if (var5 >= 1) {
								return;
							}

							if (var9 > 0) {
								var6[0][var10][var9] = var6[0][var10][var9 - 1];
							}
						}

						if (var2 + var4 == var9 && var9 < var8) {
							var6[0][var10][var9] = var6[0][var10][var9 + 1];
						}
					}
				}
			}
		}
	}

	eh() {
	}
}
