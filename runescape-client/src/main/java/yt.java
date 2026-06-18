import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yt")
public class yt {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lyt;"
	)
	static yt ak_fld = new yt(0);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lyt;"
	)
	public static yt ag_fld = new yt(1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lyt;"
	)
	static yt az_fld = new yt(2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -967501787
	)
	public int av_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lyt;"
	)
	public static yt az(int var0) {
		yt[] var1 = new yt[]{ak_fld, ag_fld, az_fld};
		yt[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; var3++) {
			yt var4 = var2[var3];
			if (var0 == var4.av_fld) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lvb;)Ljava/lang/String;"
	)
	public static String ge(vb var0) {
		return String.format("%dx%d (offset %d,%d)", (Object[])(new Object[]{var0.al_fld, var0.au_fld, var0.ar_fld * 1477932592, var0.aa_fld}));
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(Laf;Z)[S"
	)
	public static short[] qi(af var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = 0;

		for (int var3 = 0; var3 < 10; var3++) {
			if (var0.ae_fld[var3] != null && var0.ae_fld[var3].ar_fld + var0.ae_fld[var3].af_fld > var2) {
				var2 = var0.ae_fld[var3].ar_fld + var0.ae_fld[var3].af_fld;
			}
		}

		if (var2 == 0) {
			return new short[0];
		} else {
			int var11 = var0.ak_fld * var2 / 1000;
			short[] var4 = new short[var11];

			for (int var5 = 0; var5 < 10; var5++) {
				if (var0.ae_fld[var5] != null) {
					int var6 = var0.ae_fld[var5].ar_fld * var0.ak_fld / 1000;
					int var7 = var0.ae_fld[var5].af_fld * var0.ak_fld / 1000;
					int[] var8 = var0.ae_fld[var5].ak(var6, var0.ae_fld[var5].ar_fld, var0.ak_fld);
					if (var1) {
						for (int var12 = 0; var12 < var6; var12++) {
							int var14 = var4[var12 + var7] + (var8[var12] >> 8);
							var14 = og.al(-128, 127, var14);
							var4[var12 + var7] = (byte)var14;
						}
					} else {
						for (int var9 = 0; var9 < var6; var9++) {
							int var10 = var4[var9 + var7] + var8[var9];
							var10 = og.al(-32768, 32767, var10);
							var4[var9 + var7] = (short)var10;
						}
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int ms(rg var0) {
		return -558426560 * var0.ah_fld.aw_fld + var0.aw_fld.ar((byte)0);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lyt;"
	)
	public static yt ag(int var0) {
		yt[] var1 = new yt[]{ak_fld, ag_fld, az_fld};
		yt[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; var3++) {
			yt var4 = var2[var3];
			if (var0 == var4.av_fld) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lyt;"
	)
	public static yt ae(int var0) {
		yt[] var1 = new yt[]{ak_fld, ag_fld, az_fld};
		yt[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; var3++) {
			yt var4 = var2[var3];
			if (var0 == var4.av_fld) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)I"
	)
	public static int js(kj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.af();
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int dm(gf var0) {
		return var0.aw_fld.az_fld * 1846813669;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lyt;"
	)
	public static yt av(int var0) {
		yt[] var1 = new yt[]{ak_fld, ag_fld, az_fld};
		yt[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; var3++) {
			yt var4 = var2[var3];
			if (var0 == var4.av_fld) {
				return var4;
			}
		}

		return null;
	}

	yt(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lyt;"
	)
	public static yt ah(int var0) {
		yt[] var1 = new yt[]{ak_fld, ag_fld, az_fld};
		yt[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; var3++) {
			yt var4 = var2[var3];
			if (var0 == var4.av_fld) {
				return var4;
			}
		}

		return null;
	}
}
