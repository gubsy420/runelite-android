import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ud")
public class ud {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud as_fld = new ud(7);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud az_fld = new ud(1);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ar_fld = new ud(8);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud av_fld = new ud(2);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ag_fld = new ud(0);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ah_fld = new ud(4);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud aw_fld = new ud(5);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ay_fld = new ud(6);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	static ud ak_fld = new ud(255);
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bs_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud af_fld = new ud(9);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud al_fld = new ud(10);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud au_fld = new ud(11);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ax_fld = new ud(12);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud an_fld = new ud(13);
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud aa_fld = new ud(14);
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ai_fld = new ud(15);
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud aq_fld = new ud(17);
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud am_fld = new ud(18);
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ad_fld = new ud(19);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ao_fld = new ud(20);
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ab_fld = new ud(21);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ap_fld = new ud(22);
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud at_fld = new ud(23);
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	static ud ac_fld = new ud(24);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	static ud aj_fld = new ud(25);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 201272883
	)
	public int bm_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	public static ud ae_fld = new ud(3);

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)I"
	)
	public static int np(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (1.0 == var0.bk_fld) {
			return 25;
		} else if (1.5 == var0.bk_fld) {
			return 37;
		} else if (2.0 == var0.bk_fld) {
			return 50;
		} else if (var0.bk_fld == 3.0) {
			return 75;
		} else {
			return 4.0 == var0.bk_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)Z"
	)
	public static boolean wp(mw var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aw_fld.al_fld != null;
		}
	}

	ud(int var1) {
		this.bm_fld = var1;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ldx;ILfn;I)V"
	)
	static void ca(dx var0, int var1, fn var2) throws EOFException {
		short var4 = 512;
		float var5 = client.ft_fld / 334.0F;
		float var6 = client.fd_fld * 4.0F / var5;
		int var7 = Math.max(512, (int)(1400.0F - var6));
		int var8 = client.nw_fld - (int)(pw.az(var1) * var7);
		int var9 = client.nd_fld - (int)(hx.av(var1) * var7);
		long var10 = dt.ay(var0.ae_fld, kj.ay(var8), kj.ay(var9), 5, false, -1, var0.ag_fld);
		var0.az_fld.bj(var0.ae_fld, var8, var9, client.nb_fld, 60, var2, var1, var10, false);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZIII)Lyv;"
	)
	public static final yv az(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) throws EOFException {
		if (var6 != 36 || var7 != 32) {
			var4 = 0;
		} else if (var1 == -1) {
			var4 = 0;
		} else if (2 == var4 && var1 != 1) {
			var4 = 1;
		}

		long var9 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + var0 + ((long)var3 << 42);
		if (!var5 && var6 == 36 && var7 == 32) {
			yv var11 = (yv)og.dl_fld.ak(var9);
			if (var11 != null) {
				return var11;
			}
		}

		og var12 = kb.ag(var0, -1752383175);
		if (var1 > 1 && var12.ez_fld != null) {
			int var13 = -1;

			for (int var14 = 0; var14 < 10; var14++) {
				if (var1 >= var12.er_fld[var14] && var12.er_fld[var14] != 0) {
					var13 = var12.ez_fld[var14];
				}
			}

			if (-1 != var13) {
				var12 = kb.ag(var13, -1752383175);
			}
		}

		fn var27 = var12.al(1, (byte)-110);
		if (null == var27) {
			return null;
		} else {
			yv var28 = null;
			if (-1 != var12.eg_fld) {
				var28 = az(var12.en_fld, 10, 1, 0, 0, true, var6, var7);
				if (null == var28) {
					return null;
				}
			} else if (-1 != var12.ej_fld) {
				var28 = az(var12.eu_fld, var1, var2, var3, 0, false, var6, var7);
				if (var28 == null) {
					return null;
				}
			} else if (-1 != var12.fa_fld) {
				var28 = az(var12.fy_fld, var1, 0, 0, 0, false, var6, var7);
				if (var28 == null) {
					return null;
				}
			}

			int[] var15 = yu.al_fld;
			int var16 = yu.au_fld;
			int var17 = yu.ax_fld;
			float[] var18 = yu.an_fld;
			int[] var19 = new int[4];
			yu.dy(var19);
			yv var26 = new yv(var6, var7);
			fc.aa(var26.ah_fld, var6, var7, null);
			yu.dn();
			fc.ai();
			int var20 = var7 >> 1;
			fc.ad(var20, var20);
			fc.ar_fld.an_fld = false;
			if (var12.fa_fld != -1) {
				yv.aj(var28, 0, 0);
			}

			int var21 = var12.dy_fld * -1724104019;
			if (36 != var6) {
				var21 = 32 * var21 / var6;
			}

			if (var5) {
				var21 = (int)(var21 * 1.5);
			} else if (var2 == 2) {
				var21 = (int)(1.04 * var21);
			}

			int var22 = fc.ah_fld[var12.di_fld * -64616359] * var21 >> 16;
			int var23 = fc.aw_fld[var12.di_fld * -64616359] * var21 >> 16;
			var27.ap();
			var27.bv(
				0,
				-146741915 * var12.dn_fld,
				var12.df_fld * 797322967,
				var12.di_fld * -64616359,
				382174259 * var12.de_fld,
				var12.dp_fld + var22 + var27.ez_fld / 2,
				var12.dp_fld + var23
			);
			if (-1 != var12.ej_fld) {
				yv.aj(var28, 0, 0);
			}

			if (var2 >= 1) {
				var26.am(1);
			}

			if (var2 >= 2) {
				var26.am(16777215);
			}

			if (var3 != 0) {
				var26.ad(var3);
			}

			fc.aa(var26.ah_fld, var6, var7, null);
			if (var12.eg_fld != -1) {
				yv.aj(var28, 0, 0);
			}

			if (var4 == 1 || 2 == var4 && var12.dj_fld == 1) {
				zf var24 = mk.dr_fld;
				String var25;
				if (var1 < 100000) {
					var25 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var25 = "<col=ffffff>" + var1 / 1000 + kh.hg_fld + "</col>";
				} else {
					var25 = "<col=00ff80>" + var1 / 1000000 + kh.hc_fld + "</col>";
				}

				zv.uz(var24, var25, 0, 9, 16776960, 1);
			}

			if (!var5 && var6 == 36 && var7 == 32) {
				og.dl_fld.az(var26, var9);
			}

			fc.aa(var15, var16, var17, var18);
			yu.di(var19);
			fc.ai();
			fc.ar_fld.an_fld = true;
			return var26;
		}
	}
}
