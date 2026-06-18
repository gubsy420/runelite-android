import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lt")
public class lt {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bi_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public static boolean ah(int var0, int var1) {
		return (var0 >> var1 & 1) != 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int bq(gf var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "(Lbd;)V"
	)
	public static void tj(bd var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int[] var1 = new int[var0.ag_fld];
		int[] var2 = new int[33];

		for (int var3 = 0; var3 < var0.ag_fld; var3++) {
			int var4 = var0.az_fld[var3];
			if (var4 != 0) {
				int var5 = 1 << 32 - var4;
				int var6 = var2[var4];
				var1[var3] = var6;
				int var7;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (int var8 = var4 - 1; var8 >= 1; var8--) {
						int var9 = var2[var8];
						if (var9 != var6) {
							break;
						}

						int var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (int var17 = var4 + 1; var17 <= 32; var17++) {
					int var20 = var2[var17];
					if (var20 == var6) {
						var2[var17] = var7;
					}
				}
			}
		}

		var0.ah_fld = new int[8];
		int var11 = 0;

		for (int var12 = 0; var12 < var0.ag_fld; var12++) {
			int var13 = var0.az_fld[var12];
			if (var13 != 0) {
				int var14 = var1[var12];
				int var15 = 0;

				for (int var16 = 0; var16 < var13; var16++) {
					int var18 = Integer.MIN_VALUE >>> var16;
					if ((var14 & var18) != 0) {
						if (var0.ah_fld[var15] == 0) {
							var0.ah_fld[var15] = var11;
						}

						var15 = var0.ah_fld[var15];
					} else {
						var15++;
					}

					if (var15 >= var0.ah_fld.length) {
						int[] var21 = new int[var0.ah_fld.length * 2];

						for (int var22 = 0; var22 < var0.ah_fld.length; var22++) {
							var21[var22] = var0.ah_fld[var22];
						}

						var0.ah_fld = var21;
					}

					var18 >>>= 1;
				}

				var0.ah_fld[var15] = ~var12;
				if (var15 >= var11) {
					var11 = var15 + 1;
				}
			}
		}
	}

	lt() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean ar(int var0) {
		return (var0 >> 23 & 1) != 0;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lqg;)Lfr;"
	)
	public static fr ke(qg var0) {
		return (fr)(fr)var0.av_fld.ae();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aw(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ay(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean as(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public static boolean ae(int var0, int var1) {
		return (var0 >> var1 & 1) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean af(int var0) {
		return (var0 >> 23 & 1) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsd;"
	)
	static sd[] ak() {
		return new sd[]{sd.ak_fld, sd.ag_fld, sd.az_fld, sd.av_fld, sd.ae_fld};
	}
}
