import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fc")
public class fc {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ae_fld = new int[2048];
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	static fh ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] az_fld = new int[65536];
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] av_fld = new int[512];
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] ah_fld = new int[2048];
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] ay_fld = new float[2048];
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	public static fo ar_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] aw_fld = new int[2048];
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] as_fld = new float[2048];
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	static fh ak_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	static double af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	static fh al_fld;

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void cm(int var0, int var1) {
		int var2 = ar_fld.bm_fld[0];
		int var3 = var2 / yu.au_fld;
		int var4 = var2 - var3 * yu.au_fld;
		fo.cv(ar_fld, var0, var4, var1, var3);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	static void dv(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		fh.hn(al_fld, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void cr(int var0, int var1, int var2, int var3) {
		ar_fld.ao_fld = var2 - var0;
		ar_fld.ab_fld = var3 - var1;
		am();
		if (ar_fld.bm_fld.length < ar_fld.ab_fld) {
			ar_fld.bm_fld = new int[wp.ay(ar_fld.ab_fld)];
		}

		int var4 = var1 * yu.au_fld + var0;

		for (int var5 = 0; var5 < ar_fld.ab_fld; var5++) {
			ar_fld.bm_fld[var5] = var4;
			var4 += yu.au_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public static void az(double var0) {
		av(var0, 0, 512);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void cz(int var0, int var1) {
		int var2 = ar_fld.bm_fld[0];
		int var3 = var2 / yu.au_fld;
		int var4 = var2 - var3 * yu.au_fld;
		fo.cv(ar_fld, var0, var4, var1, var3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ID)I"
	)
	static int ae(int var0, double var1) {
		double var3 = (var0 >> 16) / 256.0;
		double var5 = (var0 >> 8 & 0xFF) / 256.0;
		double var7 = (var0 & 0xFF) / 256.0;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0);
		int var10 = (int)(var5 * 256.0);
		int var11 = (int)(var7 * 256.0);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	public static double ah() {
		return af_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lma;)Ljava/lang/String;"
	)
	public static String at(ma var0) {
		return var0.af_fld.as_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int aw() {
		return ar_fld.am_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public static void br(double var0) {
		av(var0, 0, 512);
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lml;II)V"
	)
	public static void nn(ml var0, int var1, int var2) {
		var0.bz_fld[var1] = var2;
		var0.ar_fld[var1] = (int)(2097152.0 * Math.pow(2.0, var2 * 5.493164E-4F) + 0.5);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int as() {
		return ar_fld.ap_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int ar() {
		return ar_fld.at_fld;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Luk;)I"
	)
	public static int iz(uk var0) {
		return var0.av_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int af() {
		return ar_fld.aj_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public static void ak(boolean var0) {
		if (var0 && yu.an_fld != null) {
			al_fld = ag_fld;
		} else {
			al_fld = ak_fld;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int au() {
		return ar_fld.ai_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int ax() {
		return ar_fld.ao_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean an() {
		return al_fld.ah();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	public static void aa(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && al_fld == ag_fld) {
			al_fld = ak_fld;
		}

		al_fld.bh(var0, var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ai() {
		aq(yu.aq_fld, yu.aa_fld, yu.am_fld, yu.ai_fld);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bw() {
		return ar_fld.ac_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void am() {
		ar_fld.ak();
	}

	fc() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void cn() {
		aq(yu.aq_fld, yu.aa_fld, yu.am_fld, yu.ai_fld);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	static void ab(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		al_fld.af(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	static void ap(
		float var0,
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21
	) throws EOFException {
		al_fld.al(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	static void at(
		float var0,
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21
	) throws EOFException {
		al_fld.au(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	static void ac(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		al_fld.ay(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	static void aj(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		fh.hn(al_fld, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	static {
		for (int var0 = 1; var0 < 512; var0++) {
			av_fld[var0] = 32768 / var0;
		}

		for (int var5 = 1; var5 < ae_fld.length; var5++) {
			ae_fld[var5] = 65536 / var5;
		}

		for (int var6 = 0; var6 < 2048; var6++) {
			double var1 = Math.sin(var6 * 0.0030679615);
			double var3 = Math.cos(var6 * 0.0030679615);
			ah_fld[var6] = (int)(65536.0 * var1);
			aw_fld[var6] = (int)(65536.0 * var3);
			ay_fld[var6] = (float)var1;
			as_fld[var6] = (float)var3;
		}

		ar_fld = new fo();
		ak_fld = new fd(ar_fld);
		ag_fld = new fq(ar_fld);
		al_fld = ak_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lfx;)V"
	)
	public static void bm(fx var0) {
		ar_fld.aq_fld = var0;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lfx;)V"
	)
	public static void bd(fx var0) {
		ar_fld.aq_fld = var0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lfx;)V"
	)
	public static void bz(fx var0) {
		ar_fld.aq_fld = var0;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int cc() {
		return ar_fld.ai_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public static void be(double var0) {
		av(var0, 0, 512);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	static void cl(
		float var0,
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21
	) throws EOFException {
		al_fld.au(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public static void bh(double var0) {
		av(var0, 0, 128595792);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public static void bk(double var0) {
		av(var0, 0, 512);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public static void bj(double var0) {
		av(var0, 0, 512);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(DII)V"
	)
	static void bf(double var0, int var2, int var3) {
		af_fld = var0;
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; var5++) {
			double var6 = (var5 >> 3) / 64.0 + 0.0078125;
			double var8 = (var5 & 7) / 8.0 + 0.0625;

			for (int var10 = 0; var10 < -270080977; var10++) {
				double var11 = var10 / 128.0;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0) {
					double var19;
					if (var11 < 0.5) {
						var19 = var11 * (1.0 + var8);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = 2.0 * var11 - var19;
					double var23 = var6 + 0.3333333333333333;
					if (var23 > 1.0) {
						var23--;
					}

					double var27 = var6 - 0.3333333333333333;
					if (var27 < 0.0) {
						var27++;
					}

					if (6.0 * var23 < 1.0) {
						var13 = var21 + (var19 - var21) * 6.0 * var23;
					} else if (2.0 * var23 < 1.0) {
						var13 = var19;
					} else if (3.0 * var23 < 2.0) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
					} else {
						var13 = var21;
					}

					if (6.0 * var6 < 1.0) {
						var15 = var21 + (var19 - var21) * 6.0 * var6;
					} else if (2.0 * var6 < 1.0) {
						var15 = var19;
					} else if (3.0 * var6 < 2.0) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
					} else {
						var15 = var21;
					}

					if (6.0 * var27 < 1.0) {
						var17 = var21 + (var19 - var21) * 6.0 * var27;
					} else if (2.0 * var27 < 1.0) {
						var17 = var19;
					} else if (3.0 * var27 < 2.0) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
					} else {
						var17 = var21;
					}
				}

				int var29 = (int)(var13 * 256.0);
				int var20 = (int)(var15 * 256.0);
				int var30 = (int)(var17 * 256.0);
				int var22 = (var29 << 16) + (var20 << 8) + var30;
				var22 = ae(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				az_fld[var4++] = var22;
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	public static void bs(double var0) {
		av(var0, 0, 512);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int cq() {
		return ar_fld.ao_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	public static double bx() {
		return af_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	public static double bo() {
		return af_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bp() {
		return ar_fld.am_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ID)I"
	)
	static int bl(int var0, double var1) {
		double var3 = (var0 >> 16) / 256.0;
		double var5 = (var0 >> 8 & 723581236) / 256.0;
		double var7 = (var0 & -737984298) / 256.0;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0);
		int var10 = (int)(var5 * 256.0);
		int var11 = (int)(var7 * 256.0);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bv() {
		return ar_fld.ap_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bi() {
		return ar_fld.at_fld;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ca() {
		ar_fld.ak();
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(Lgz;)V"
	)
	public static void sm(gz var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bn() {
		return ar_fld.aj_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bc() {
		return ar_fld.aj_fld;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	static void ci(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		al_fld.af(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(DII)V"
	)
	static void by(double var0, int var2, int var3) {
		af_fld = var0;
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; var5++) {
			double var6 = (var5 >> 3) / 64.0 + 0.0078125;
			double var8 = (var5 & 7) / 8.0 + 0.0625;

			for (int var10 = 0; var10 < 128; var10++) {
				double var11 = var10 / 128.0;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0) {
					double var19;
					if (var11 < 0.5) {
						var19 = var11 * (1.0 + var8);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = 2.0 * var11 - var19;
					double var23 = var6 + 0.3333333333333333;
					if (var23 > 1.0) {
						var23--;
					}

					double var27 = var6 - 0.3333333333333333;
					if (var27 < 0.0) {
						var27++;
					}

					if (6.0 * var23 < 1.0) {
						var13 = var21 + (var19 - var21) * 6.0 * var23;
					} else if (2.0 * var23 < 1.0) {
						var13 = var19;
					} else if (3.0 * var23 < 2.0) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
					} else {
						var13 = var21;
					}

					if (6.0 * var6 < 1.0) {
						var15 = var21 + (var19 - var21) * 6.0 * var6;
					} else if (2.0 * var6 < 1.0) {
						var15 = var19;
					} else if (3.0 * var6 < 2.0) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
					} else {
						var15 = var21;
					}

					if (6.0 * var27 < 1.0) {
						var17 = var21 + (var19 - var21) * 6.0 * var27;
					} else if (2.0 * var27 < 1.0) {
						var17 = var19;
					} else if (3.0 * var27 < 2.0) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
					} else {
						var17 = var21;
					}
				}

				int var29 = (int)(var13 * 256.0);
				int var20 = (int)(var15 * 256.0);
				int var30 = (int)(var17 * 256.0);
				int var22 = (var29 << 16) + (var20 << 8) + var30;
				var22 = ae(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				az_fld[var4++] = var22;
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bq() {
		return ar_fld.ac_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	static void ao(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		al_fld.bl(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	public static void cp(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && al_fld == ag_fld) {
			al_fld = ak_fld;
		}

		al_fld.bh(var0, var1, var2, var3);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	static void dh(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		fh.hn(al_fld, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int bb() {
		return ar_fld.ai_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void ad(int var0, int var1) {
		int var2 = ar_fld.bm_fld[0];
		int var3 = var2 / yu.au_fld;
		int var4 = var2 - var3 * yu.au_fld;
		fo.cv(ar_fld, var0, var4, var1, var3);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int cv() {
		return ar_fld.ao_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cy() {
		return al_fld.ah();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int al() {
		return ar_fld.ac_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cx() {
		return al_fld.ah();
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cs() {
		return al_fld.ah();
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	public static void ce(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && al_fld == ag_fld) {
			al_fld = ak_fld;
		}

		al_fld.bh(var0, var1, var2, var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfx;)V"
	)
	public static void ag(fx var0) {
		ar_fld.aq_fld = var0;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	static void ch(
		float var0,
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21
	) throws EOFException {
		al_fld.al(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(DII)V"
	)
	static void av(double var0, int var2, int var3) {
		af_fld = var0;
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; var5++) {
			double var6 = (var5 >> 3) / 64.0 + 0.0078125;
			double var8 = (var5 & 7) / 8.0 + 0.0625;

			for (int var10 = 0; var10 < 128; var10++) {
				double var11 = var10 / 128.0;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0) {
					double var19;
					if (var11 < 0.5) {
						var19 = var11 * (1.0 + var8);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = 2.0 * var11 - var19;
					double var23 = var6 + 0.3333333333333333;
					if (var23 > 1.0) {
						var23--;
					}

					double var27 = var6 - 0.3333333333333333;
					if (var27 < 0.0) {
						var27++;
					}

					if (6.0 * var23 < 1.0) {
						var13 = var21 + (var19 - var21) * 6.0 * var23;
					} else if (2.0 * var23 < 1.0) {
						var13 = var19;
					} else if (3.0 * var23 < 2.0) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
					} else {
						var13 = var21;
					}

					if (6.0 * var6 < 1.0) {
						var15 = var21 + (var19 - var21) * 6.0 * var6;
					} else if (2.0 * var6 < 1.0) {
						var15 = var19;
					} else if (3.0 * var6 < 2.0) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
					} else {
						var15 = var21;
					}

					if (6.0 * var27 < 1.0) {
						var17 = var21 + (var19 - var21) * 6.0 * var27;
					} else if (2.0 * var27 < 1.0) {
						var17 = var19;
					} else if (3.0 * var27 < 2.0) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
					} else {
						var17 = var21;
					}
				}

				int var29 = (int)(var13 * 256.0);
				int var20 = (int)(var15 * 256.0);
				int var30 = (int)(var17 * 256.0);
				int var22 = (var29 << 16) + (var20 << 8) + var30;
				var22 = ae(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				az_fld[var4++] = var22;
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int bg() {
		return ar_fld.ai_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void cg() {
		ar_fld.ak();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void cw() {
		ar_fld.ak();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int ba() {
		return ar_fld.ac_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int ay() {
		return ar_fld.ad_fld;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	static void ck(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		al_fld.bl(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	static void cb(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		al_fld.bl(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	static void co(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		al_fld.bl(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	static void cu(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		al_fld.bl(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cf() {
		return al_fld.ah();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	static void cj(
		float var0,
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21
	) throws EOFException {
		al_fld.al(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bu() {
		return ar_fld.at_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	static void ct(
		float var0,
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21
	) throws EOFException {
		al_fld.au(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int cd() {
		return ar_fld.ai_fld;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	static void dc(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		al_fld.ay(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void aq(int var0, int var1, int var2, int var3) {
		ar_fld.ao_fld = var2 - var0;
		ar_fld.ab_fld = var3 - var1;
		am();
		if (ar_fld.bm_fld.length < ar_fld.ab_fld) {
			ar_fld.bm_fld = new int[wp.ay(ar_fld.ab_fld)];
		}

		int var4 = var1 * yu.au_fld + var0;

		for (int var5 = 0; var5 < ar_fld.ab_fld; var5++) {
			ar_fld.bm_fld[var5] = var4;
			var4 += yu.au_fld;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int bt() {
		return ar_fld.ad_fld;
	}
}
