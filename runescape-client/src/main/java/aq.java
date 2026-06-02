import java.io.EOFException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aq")
public class aq {
	@ObfuscatedGetter(
		intValue = 1651492503
	)
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ac_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] bd_fld;
	@ObfuscatedGetter(
		intValue = 284803571
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] ay_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lau;"
	)
	au[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lat;"
	)
	at[] ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	bm[] aw_fld;
	@ObfuscatedGetter(
		intValue = -731520795
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	bh ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] au_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] af_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] ar_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] at_fld;
	@ObfuscatedGetter(
		intValue = 1682381863
	)
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ao_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	byte[][] aq_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	bd[] ag_fld;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cb_fld;
	@ObfuscatedGetter(
		intValue = 1442461
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedGetter(
		intValue = 1166974679
	)
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ab_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] al_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] an_fld;
	@ObfuscatedGetter(
		intValue = -676025093
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 629405649
	)
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aj_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bm_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] ax_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ap_fld;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al ap() {
		this.ac_fld = 0;
		this.an_fld = new float[-2067868646 * this.av_fld];
		short[] var1 = new short[this.ad_fld * 1348142082];
		int var2 = 0;

		for (int var3 = 0; var3 < this.aq_fld.length; var3++) {
			float[] var4 = kj(this, var3);
			if (null != var4) {
				int var5 = var4.length;
				if (var5 > this.ad_fld - var2) {
					var5 = this.ad_fld - var2;
				}

				for (int var6 = 0; var6 < var5; var6++) {
					var1[var2++] = (short)og.al(-32768, -889922292, (int)(32768.0F * var4[var6]));
				}
			}
		}

		this.an_fld = null;
		return new al(this.am_fld, var1, 1974332112 * this.ao_fld, this.ab_fld * -790852801, this.ap_fld, false);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int al() {
		return this.ao_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ay() {
		return this.am_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int az() {
		return this.ab_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void av(xi var1) {
		this.am_fld = var1.co();
		this.ad_fld = var1.co();
		this.ao_fld = var1.co();
		this.ab_fld = var1.co();
		if (this.ab_fld < 0) {
			this.ab_fld ^= -1166974679;
			this.ap_fld = true;
		}

		int var3 = var1.co();
		this.aq_fld = new byte[var3][];

		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = 0;

			int var6;
			do {
				var6 = var1.cg();
				var5 += var6;
			} while (var6 >= 255);

			byte[] var7 = new byte[var5];
			xi.xp(var1, var7, 0, var5, (byte)8);
			this.aq_fld[var4] = var7;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ak() {
		return this.am_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al ae() {
		this.ac_fld = 0;
		this.an_fld = new float[this.av_fld];
		short[] var2 = new short[this.ad_fld];
		int var3 = 0;

		for (int var4 = 0; var4 < this.aq_fld.length; var4++) {
			float[] var5 = kj(this, var4);
			if (null != var5) {
				int var6 = var5.length;
				if (var6 > this.ad_fld - var3) {
					var6 = this.ad_fld - var3;
				}

				for (int var7 = 0; var7 < var6; var7++) {
					var2[var3++] = (short)og.al(-32768, 32767, (int)(32768.0F * var5[var7]));
				}
			}
		}

		this.an_fld = null;
		return new al(this.am_fld, var2, this.ao_fld, this.ab_fld, this.ap_fld, false);
	}

	aq(bh var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int as() {
		return this.am_fld;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Laq;Lxi;)V"
	)
	public static void jk(aq var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld = var1.co();
		var0.ad_fld = var1.co();
		var0.ao_fld = var1.co();
		var0.ab_fld = var1.co();
		if (var0.ab_fld < 0) {
			var0.ab_fld ^= -1166974679;
			var0.ap_fld = true;
		}

		int var2 = var1.co();
		var0.aq_fld = new byte[var2][];

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.cg();
				var4 += var5;
			} while (var5 >= 255);

			byte[] var6 = new byte[var4];
			xi.xp(var1, var6, 0, var4, (byte)8);
			var0.aq_fld[var3] = var6;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int af() {
		return this.am_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ag() {
		return this.ao_fld;
	}

	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "(Laq;Lxi;)V"
	)
	public static void wz(aq var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld = var1.co();
		var0.ad_fld = var1.co();
		var0.ao_fld = var1.co();
		var0.ab_fld = var1.co();
		if (var0.ab_fld < 0) {
			var0.ab_fld ^= -1166974679;
			var0.ap_fld = true;
		}

		int var2 = var1.co();
		var0.aq_fld = new byte[var2][];

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.cg();
				var4 += var5;
			} while (var5 >= 255);

			byte[] var6 = new byte[var4];
			xi.xp(var1, var6, 0, var4, (byte)8);
			var0.aq_fld[var3] = var6;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int au() {
		return this.ao_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int an() {
		return this.ao_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ai(xi var1) {
		this.am_fld = var1.co();
		this.ad_fld = var1.co();
		this.ao_fld = var1.co();
		this.ab_fld = var1.co() * 1721117600;
		if (331354668 * this.ab_fld < 0) {
			this.ab_fld ^= -1166974679;
			this.ap_fld = true;
		}

		int var2 = var1.co();
		this.aq_fld = new byte[var2][];

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.cg();
				var4 += var5;
			} while (var5 >= -1285512723);

			byte[] var6 = new byte[var4];
			xi.xp(var1, var6, 0, var4, (byte)8);
			this.aq_fld[var3] = var6;
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Laq;I)[F"
	)
	public static float[] kj(aq var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		bh var3 = new bh();
		bh.jm(var3, var0.aq_fld[var1], 0);
		var0.ax_fld = new float[var0.av_fld];
		var3.av();
		int var4 = var3.ak(gb.as(var0.as_fld.length - 1), 499786991);
		boolean var5 = var0.ay_fld[var4];
		int var6 = var5 ? var0.av_fld : var0.az_fld;
		boolean var7 = false;
		boolean var8 = false;
		if (var5) {
			var7 = var3.av() != 0;
			var8 = var3.av() != 0;
		}

		int var9 = var6 >> 1;
		int var10;
		int var11;
		int var12;
		if (var5 && !var7) {
			var10 = (var6 >> 2) - (var0.az_fld >> 2);
			var11 = (var6 >> 2) + (var0.az_fld >> 2);
			var12 = var0.az_fld >> 1;
		} else {
			var10 = 0;
			var11 = var9;
			var12 = var6 >> 1;
		}

		int var13;
		int var14;
		int var15;
		if (var5 && !var8) {
			var13 = var6 - (var6 >> 2) - (var0.az_fld >> 2);
			var14 = (var0.az_fld >> 2) + (var6 - (var6 >> 2));
			var15 = var0.az_fld >> 1;
		} else {
			var13 = var9;
			var14 = var6;
			var15 = var6 >> 1;
		}

		bm var16 = var0.aw_fld[var0.as_fld[var4]];
		int var17 = var16.ag_fld;
		int var18 = var16.az_fld[var17];
		bs var19 = var0.ae_fld[var18].ae(var3, var0.ag_fld);
		boolean var20 = !var19.ag();

		for (int var21 = 0; var21 < var16.ak_fld; var21++) {
			at var22 = var0.ah_fld[var16.av_fld[var21]];
			float[] var23 = var0.ax_fld;
			at.zn(var22, var23, var6 >> 1, var20, var3, var0.ag_fld);
		}

		if (var19.ag()) {
			var17 = var16.ag_fld;
			var18 = var16.az_fld[var17];
			var19.ak(var0.ax_fld, var6 >> 1);
		}

		if (!var19.ag()) {
			for (int var46 = var6 >> 1; var46 < var6; var46++) {
				var0.ax_fld[var46] = 0.0F;
			}
		} else {
			int var47 = var6 >> 1;
			int var49 = var6 >> 2;
			int var52 = var6 >> 3;
			float[] var24 = var0.ax_fld;

			for (int var25 = 0; var25 < var47; var25++) {
				var24[var25] *= 0.5F;
			}

			for (int var57 = var47; var57 < var6; var57++) {
				var24[var57] = -var24[var6 - var57 - 1];
			}

			float[] var58 = var5 ? var0.ar_fld : var0.bd_fld;
			float[] var26 = var5 ? var0.at_fld : var0.au_fld;
			float[] var27 = var5 ? var0.al_fld : var0.af_fld;
			int[] var28 = var5 ? var0.ai_fld : var0.aa_fld;

			for (int var29 = 0; var29 < var49; var29++) {
				float var30 = var24[var29 * 4] - var24[var6 - 4 * var29 - 1];
				float var31 = var24[2 + 4 * var29] - var24[var6 - var29 * 4 - 3];
				float var32 = var58[var29 * 2];
				float var33 = var58[1 + var29 * 2];
				var24[var6 - 4 * var29 - 1] = var32 * var30 - var31 * var33;
				var24[var6 - 4 * var29 - 3] = var30 * var33 + var32 * var31;
			}

			for (int var59 = 0; var59 < var52; var59++) {
				float var61 = var24[var47 + 3 + 4 * var59];
				float var74 = var24[4 * var59 + var47 + 1];
				float var80 = var24[var59 * 4 + 3];
				float var84 = var24[1 + 4 * var59];
				var24[var59 * 4 + var47 + 3] = var61 + var80;
				var24[4 * var59 + var47 + 1] = var84 + var74;
				float var34 = var58[var47 - 4 - var59 * 4];
				float var35 = var58[var47 - 3 - var59 * 4];
				var24[4 * var59 + 3] = (var61 - var80) * var34 - (var74 - var84) * var35;
				var24[1 + 4 * var59] = var35 * (var61 - var80) + var34 * (var74 - var84);
			}

			int var60 = gb.as(var6 - 1);

			for (int var62 = 0; var62 < var60 - 3; var62++) {
				int var75 = var6 >> 2 + var62;
				int var81 = 8 << var62;

				for (int var85 = 0; var85 < 2 << var62; var85++) {
					int var88 = var6 - 2 * var75 * var85;
					int var94 = var6 - (var85 * 2 + 1) * var75;

					for (int var36 = 0; var36 < var6 >> var62 + 4; var36++) {
						int var37 = 4 * var36;
						float var38 = var24[var88 - 1 - var37];
						float var39 = var24[var88 - 3 - var37];
						float var40 = var24[var94 - 1 - var37];
						float var41 = var24[var94 - 3 - var37];
						var24[var88 - 1 - var37] = var38 + var40;
						var24[var88 - 3 - var37] = var39 + var41;
						float var42 = var58[var81 * var36];
						float var43 = var58[var81 * var36 + 1];
						var24[var94 - 1 - var37] = (var38 - var40) * var42 - var43 * (var39 - var41);
						var24[var94 - 3 - var37] = var42 * (var39 - var41) + (var38 - var40) * var43;
					}
				}
			}

			for (int var63 = 1; var63 < var52 - 1; var63++) {
				int var76 = var28[var63];
				if (var63 < var76) {
					int var82 = var63 * 8;
					int var86 = var76 * 8;
					float var89 = var24[var82 + 1];
					var24[1 + var82] = var24[var86 + 1];
					var24[var86 + 1] = var89;
					var89 = var24[var82 + 3];
					var24[3 + var82] = var24[var86 + 3];
					var24[3 + var86] = var89;
					var89 = var24[var82 + 5];
					var24[5 + var82] = var24[var86 + 5];
					var24[5 + var86] = var89;
					var89 = var24[7 + var82];
					var24[var82 + 7] = var24[var86 + 7];
					var24[7 + var86] = var89;
				}
			}

			for (int var64 = 0; var64 < var47; var64++) {
				var24[var64] = var24[1 + 2 * var64];
			}

			for (int var65 = 0; var65 < var52; var65++) {
				var24[var6 - 1 - 2 * var65] = var24[var65 * 4];
				var24[var6 - 2 - var65 * 2] = var24[4 * var65 + 1];
				var24[var6 - var49 - 1 - 2 * var65] = var24[2 + var65 * 4];
				var24[var6 - var49 - 2 - 2 * var65] = var24[var65 * 4 + 3];
			}

			for (int var66 = 0; var66 < var52; var66++) {
				float var77 = var27[2 * var66];
				float var83 = var27[1 + var66 * 2];
				float var87 = var24[var47 + var66 * 2];
				float var93 = var24[1 + var47 + 2 * var66];
				float var95 = var24[var6 - 2 - var66 * 2];
				float var96 = var24[var6 - 1 - 2 * var66];
				float var97 = (var96 + var93) * var77 + var83 * (var87 - var95);
				var24[var47 + 2 * var66] = 0.5F * (var95 + var87 + var97);
				var24[var6 - 2 - var66 * 2] = (var87 + var95 - var97) * 0.5F;
				var97 = var83 * (var93 + var96) - (var87 - var95) * var77;
				var24[1 + 2 * var66 + var47] = 0.5F * (var93 - var96 + var97);
				var24[var6 - 1 - 2 * var66] = (var97 + (-var93 + var96)) * 0.5F;
			}

			for (int var67 = 0; var67 < var49; var67++) {
				var24[var67] = var26[var67 * 2 + 1] * var24[2 * var67 + 1 + var47] + var26[var67 * 2] * var24[2 * var67 + var47];
				var24[var47 - 1 - var67] = var24[2 * var67 + var47] * var26[1 + 2 * var67] - var26[var67 * 2] * var24[1 + var67 * 2 + var47];
			}

			for (int var68 = 0; var68 < var49; var68++) {
				var24[var68 + (var6 - var49)] = -var24[var68];
			}

			for (int var69 = 0; var69 < var49; var69++) {
				var24[var69] = var24[var49 + var69];
			}

			for (int var70 = 0; var70 < var49; var70++) {
				var24[var49 + var70] = -var24[var49 - var70 - 1];
			}

			for (int var71 = 0; var71 < var49; var71++) {
				var24[var71 + var47] = var24[var6 - var71 - 1];
			}

			for (int var72 = var10; var72 < var11; var72++) {
				float var78 = (float)Math.sin((0.5 + (var72 - var10)) / var12 * 0.5 * Math.PI);
				var0.ax_fld[var72] = var0.ax_fld[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
			}

			for (int var73 = var13; var73 < var14; var73++) {
				float var79 = (float)Math.sin((var73 - var13 + 0.5) / var15 * 0.5 * Math.PI + (Math.PI / 2));
				var0.ax_fld[var73] = var0.ax_fld[var73] * (float)Math.sin(var79 * (Math.PI / 2) * var79);
			}
		}

		float[] var48 = null;
		if (var0.ac_fld > 0) {
			int var50 = var6 + var0.ac_fld >> 2;
			var48 = new float[var50];
			if (!var0.bm_fld) {
				for (int var53 = 0; var53 < var0.aj_fld; var53++) {
					int var55 = (var0.ac_fld >> 1) + var53;
					var48[var53] += var0.an_fld[var55];
				}
			}

			if (var19.ag()) {
				for (int var54 = var10; var54 < var6 >> 1; var54++) {
					int var56 = var48.length - (var6 >> 1) + var54;
					var48[var56] += var0.ax_fld[var54];
				}
			}
		}

		float[] var51 = var0.an_fld;
		var0.an_fld = var0.ax_fld;
		var0.ax_fld = var51;
		var0.ac_fld = var6;
		var0.aj_fld = var14 - (var6 >> 1);
		var0.bm_fld = !var19.ag();
		return var48;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] aj(int var1) {
		bh var2 = new bh();
		bh.jm(var2, this.aq_fld[var1], 0);
		this.ax_fld = new float[this.av_fld];
		var2.av();
		int var3 = var2.ak(gb.as(this.as_fld.length - 1), 448781817);
		boolean var4 = this.ay_fld[var3];
		int var5 = var4 ? this.av_fld : this.az_fld;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.av() != 0;
			var7 = var2.av() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (this.az_fld >> 2);
			var10 = (var5 >> 2) + (this.az_fld >> 2);
			var11 = this.az_fld >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (this.az_fld >> 2);
			var13 = (this.az_fld >> 2) + (var5 - (var5 >> 2));
			var14 = this.az_fld >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		bm var15 = this.aw_fld[this.as_fld[var3]];
		int var16 = var15.ag_fld;
		int var17 = var15.az_fld[var16];
		bs var18 = this.ae_fld[var17].ae(var2, this.ag_fld);
		boolean var19 = !var18.ag();

		for (int var20 = 0; var20 < var15.ak_fld; var20++) {
			at var21 = this.ah_fld[var15.av_fld[var20]];
			float[] var22 = this.ax_fld;
			at.zn(var21, var22, var5 >> 1, var19, var2, this.ag_fld);
		}

		if (var18.ag()) {
			var16 = var15.ag_fld;
			var17 = var15.az_fld[var16];
			var18.ak(this.ax_fld, var5 >> 1);
		}

		if (!var18.ag()) {
			for (int var45 = var5 >> 1; var45 < var5; var45++) {
				this.ax_fld[var45] = 0.0F;
			}
		} else {
			int var46 = var5 >> 1;
			int var48 = var5 >> 2;
			int var51 = var5 >> 3;
			float[] var23 = this.ax_fld;

			for (int var24 = 0; var24 < var46; var24++) {
				var23[var24] *= 0.5F;
			}

			for (int var56 = var46; var56 < var5; var56++) {
				var23[var56] = -var23[var5 - var56 - 1];
			}

			float[] var57 = var4 ? this.ar_fld : this.bd_fld;
			float[] var25 = var4 ? this.at_fld : this.au_fld;
			float[] var26 = var4 ? this.al_fld : this.af_fld;
			int[] var27 = var4 ? this.ai_fld : this.aa_fld;

			for (int var28 = 0; var28 < var48; var28++) {
				float var29 = var23[var28 * 4] - var23[var5 - 4 * var28 - 1];
				float var30 = var23[2 + 4 * var28] - var23[var5 - var28 * 4 - 3];
				float var31 = var57[var28 * 2];
				float var32 = var57[1 + var28 * 2];
				var23[var5 - 4 * var28 - 1] = var31 * var29 - var30 * var32;
				var23[var5 - 4 * var28 - 3] = var29 * var32 + var31 * var30;
			}

			for (int var58 = 0; var58 < var51; var58++) {
				float var60 = var23[var46 + 3 + 4 * var58];
				float var73 = var23[4 * var58 + var46 + 1];
				float var79 = var23[var58 * 4 + 3];
				float var83 = var23[1 + 4 * var58];
				var23[var58 * 4 + var46 + 3] = var60 + var79;
				var23[4 * var58 + var46 + 1] = var83 + var73;
				float var33 = var57[var46 - 4 - var58 * 4];
				float var34 = var57[var46 - 3 - var58 * 4];
				var23[4 * var58 + 3] = (var60 - var79) * var33 - (var73 - var83) * var34;
				var23[1 + 4 * var58] = var34 * (var60 - var79) + var33 * (var73 - var83);
			}

			int var59 = gb.as(var5 - 1);

			for (int var61 = 0; var61 < var59 - 3; var61++) {
				int var74 = var5 >> 2 + var61;
				int var80 = 8 << var61;

				for (int var84 = 0; var84 < 2 << var61; var84++) {
					int var87 = var5 - 2 * var74 * var84;
					int var93 = var5 - (var84 * 2 + 1) * var74;

					for (int var35 = 0; var35 < var5 >> var61 + 4; var35++) {
						int var36 = 4 * var35;
						float var37 = var23[var87 - 1 - var36];
						float var38 = var23[var87 - 3 - var36];
						float var39 = var23[var93 - 1 - var36];
						float var40 = var23[var93 - 3 - var36];
						var23[var87 - 1 - var36] = var37 + var39;
						var23[var87 - 3 - var36] = var38 + var40;
						float var41 = var57[var80 * var35];
						float var42 = var57[var80 * var35 + 1];
						var23[var93 - 1 - var36] = (var37 - var39) * var41 - var42 * (var38 - var40);
						var23[var93 - 3 - var36] = var41 * (var38 - var40) + (var37 - var39) * var42;
					}
				}
			}

			for (int var62 = 1; var62 < var51 - 1; var62++) {
				int var75 = var27[var62];
				if (var62 < var75) {
					int var81 = var62 * 8;
					int var85 = var75 * 8;
					float var88 = var23[var81 + 1];
					var23[1 + var81] = var23[var85 + 1];
					var23[var85 + 1] = var88;
					var88 = var23[var81 + 3];
					var23[3 + var81] = var23[var85 + 3];
					var23[3 + var85] = var88;
					var88 = var23[var81 + 5];
					var23[5 + var81] = var23[var85 + 5];
					var23[5 + var85] = var88;
					var88 = var23[7 + var81];
					var23[var81 + 7] = var23[var85 + 7];
					var23[7 + var85] = var88;
				}
			}

			for (int var63 = 0; var63 < var46; var63++) {
				var23[var63] = var23[1 + 2 * var63];
			}

			for (int var64 = 0; var64 < var51; var64++) {
				var23[var5 - 1 - 2 * var64] = var23[var64 * 4];
				var23[var5 - 2 - var64 * 2] = var23[4 * var64 + 1];
				var23[var5 - var48 - 1 - 2 * var64] = var23[2 + var64 * 4];
				var23[var5 - var48 - 2 - 2 * var64] = var23[var64 * 4 + 3];
			}

			for (int var65 = 0; var65 < var51; var65++) {
				float var76 = var26[2 * var65];
				float var82 = var26[1 + var65 * 2];
				float var86 = var23[var46 + var65 * 2];
				float var92 = var23[1 + var46 + 2 * var65];
				float var94 = var23[var5 - 2 - var65 * 2];
				float var95 = var23[var5 - 1 - 2 * var65];
				float var96 = (var95 + var92) * var76 + var82 * (var86 - var94);
				var23[var46 + 2 * var65] = 0.5F * (var94 + var86 + var96);
				var23[var5 - 2 - var65 * 2] = (var86 + var94 - var96) * 0.5F;
				var96 = var82 * (var92 + var95) - (var86 - var94) * var76;
				var23[1 + 2 * var65 + var46] = 0.5F * (var92 - var95 + var96);
				var23[var5 - 1 - 2 * var65] = (var96 + (-var92 + var95)) * 0.5F;
			}

			for (int var66 = 0; var66 < var48; var66++) {
				var23[var66] = var25[var66 * 2 + 1] * var23[2 * var66 + 1 + var46] + var25[var66 * 2] * var23[2 * var66 + var46];
				var23[var46 - 1 - var66] = var23[2 * var66 + var46] * var25[1 + 2 * var66] - var25[var66 * 2] * var23[1 + var66 * 2 + var46];
			}

			for (int var67 = 0; var67 < var48; var67++) {
				var23[var67 + (var5 - var48)] = -var23[var67];
			}

			for (int var68 = 0; var68 < var48; var68++) {
				var23[var68] = var23[var48 + var68];
			}

			for (int var69 = 0; var69 < var48; var69++) {
				var23[var48 + var69] = -var23[var48 - var69 - 1];
			}

			for (int var70 = 0; var70 < var48; var70++) {
				var23[var70 + var46] = var23[var5 - var70 - 1];
			}

			for (int var71 = var9; var71 < var10; var71++) {
				float var77 = (float)Math.sin((0.5 + (var71 - var9)) / var11 * 0.5 * Math.PI);
				this.ax_fld[var71] = this.ax_fld[var71] * (float)Math.sin(var77 * (Math.PI / 2) * var77);
			}

			for (int var72 = var12; var72 < var13; var72++) {
				float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
				this.ax_fld[var72] = this.ax_fld[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
			}
		}

		float[] var47 = null;
		if (this.ac_fld > 0) {
			int var49 = var5 + this.ac_fld >> 2;
			var47 = new float[var49];
			if (!this.bm_fld) {
				for (int var52 = 0; var52 < this.aj_fld; var52++) {
					int var54 = (this.ac_fld >> 1) + var52;
					var47[var52] += this.an_fld[var54];
				}
			}

			if (var18.ag()) {
				for (int var53 = var9; var53 < var5 >> 1; var53++) {
					int var55 = var47.length - (var5 >> 1) + var53;
					var47[var55] += this.ax_fld[var53];
				}
			}
		}

		float[] var50 = this.an_fld;
		this.an_fld = this.ax_fld;
		this.ax_fld = var50;
		this.ac_fld = var5;
		this.aj_fld = var13 - (var5 >> 1);
		this.bm_fld = !var18.ag();
		return var47;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ad(xi var1) {
		this.am_fld = var1.co();
		this.ad_fld = var1.co();
		this.ao_fld = var1.co();
		this.ab_fld = var1.co();
		if (this.ab_fld < 0) {
			this.ab_fld ^= -1166974679;
			this.ap_fld = true;
		}

		int var2 = var1.co();
		this.aq_fld = new byte[var2][];

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.cg();
				var4 += var5;
			} while (var5 >= 255);

			byte[] var6 = new byte[var4];
			xi.xp(var1, var6, 0, var4, (byte)8);
			this.aq_fld[var3] = var6;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BI)V"
	)
	void aw(byte[] var1, int var2) {
		bh var4 = this.ak_fld;
		bh.jm(var4, var1, var2);
		this.az_fld = 1 << var4.ak(4, -164631397);
		this.av_fld = 1 << var4.ak(4, -71902994);

		for (int var5 = 0; var5 < 2; var5++) {
			int var6 = var5 != 0 ? this.av_fld : this.az_fld;
			int var7 = var6 >> 1;
			int var8 = var6 >> 2;
			int var9 = var6 >> 3;
			float[] var10 = new float[var7];

			for (int var11 = 0; var11 < var8; var11++) {
				var10[2 * var11] = (float)Math.cos(Math.PI * (4 * var11) / var6);
				var10[2 * var11 + 1] = -((float)Math.sin(Math.PI * (var11 * 4) / var6));
			}

			float[] var28 = new float[var7];

			for (int var12 = 0; var12 < var8; var12++) {
				var28[2 * var12] = (float)Math.cos((1 + var12 * 2) * Math.PI / (2 * var6));
				var28[1 + 2 * var12] = (float)Math.sin(Math.PI * (2 * var12 + 1) / (var6 * 2));
			}

			float[] var29 = new float[var8];

			for (int var13 = 0; var13 < var9; var13++) {
				var29[2 * var13] = (float)Math.cos((2 + var13 * 4) * Math.PI / var6);
				var29[1 + var13 * 2] = -((float)Math.sin((4 * var13 + 2) * Math.PI / var6));
			}

			int[] var30 = new int[var9];
			int var14 = gb.as(var9 - 1);

			for (int var15 = 0; var15 < var9; var15++) {
				var30[var15] = lj.ar(var15, var14);
			}

			if (0 != var5) {
				this.ar_fld = var10;
				this.at_fld = var28;
				this.al_fld = var29;
				this.ai_fld = var30;
			} else {
				this.bd_fld = var10;
				this.au_fld = var28;
				this.af_fld = var29;
				this.aa_fld = var30;
			}
		}

		int var16 = var4.ak(8, 7095894) + 1;
		this.ag_fld = new bd[var16];

		for (int var17 = 0; var17 < var16; var17++) {
			this.ag_fld[var17] = new bd(var4);
		}

		int var18 = var4.ak(6, -64789882) + 1;

		for (int var20 = 0; var20 < var18; var20++) {
			var4.ak(16, -1020192370);
		}

		var18 = var4.ak(6, 662114455) + 1;
		this.ae_fld = new au[var18];

		for (int var21 = 0; var21 < var18; var21++) {
			this.ae_fld[var21] = new au(var4);
		}

		int var22 = var4.ak(6, 161525609) + 1;
		this.ah_fld = new at[var22];

		for (int var23 = 0; var23 < var22; var23++) {
			this.ah_fld[var23] = new at(var4);
		}

		int var24 = var4.ak(6, -1108334993) + 1;
		this.aw_fld = new bm[var24];

		for (int var25 = 0; var25 < var24; var25++) {
			this.aw_fld[var25] = new bm(var4);
		}

		int var26 = var4.ak(6, -2076740479) + 1;
		this.ay_fld = new boolean[var26];
		this.as_fld = new int[var26];

		for (int var27 = 0; var27 < var26; var27++) {
			this.ay_fld[var27] = var4.av() != 0;
			var4.ak(16, 1085264965);
			var4.ak(16, 156640236);
			this.as_fld[var27] = var4.ak(8, -1160713884);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al at() {
		this.ac_fld = 0;
		this.an_fld = new float[-498215915 * this.av_fld];
		short[] var1 = new short[this.ad_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < this.aq_fld.length; var3++) {
			float[] var4 = kj(this, var3);
			if (null != var4) {
				int var5 = var4.length;
				if (var5 > this.ad_fld - var2) {
					var5 = this.ad_fld - var2;
				}

				for (int var6 = 0; var6 < var5; var6++) {
					var1[var2++] = (short)og.al(-32768, 32767, (int)(32768.0F * var4[var6]));
				}
			}
		}

		this.an_fld = null;
		return new al(500290144 * this.am_fld, var1, 1982634782 * this.ao_fld, this.ab_fld, this.ap_fld, false);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al ab() {
		this.ac_fld = 0;
		this.an_fld = new float[-998985552 * this.av_fld];
		short[] var1 = new short[this.ad_fld * 218504139];
		int var2 = 0;

		for (int var3 = 0; var3 < this.aq_fld.length; var3++) {
			float[] var4 = kj(this, var3);
			if (null != var4) {
				int var5 = var4.length;
				if (var5 > this.ad_fld - var2) {
					var5 = this.ad_fld - var2;
				}

				for (int var6 = 0; var6 < var5; var6++) {
					var1[var2++] = (short)og.al(-32768, 32767, (int)(32768.0F * var4[var6]));
				}
			}
		}

		this.an_fld = null;
		return new al(44255528 * this.am_fld, var1, this.ao_fld, this.ab_fld, this.ap_fld, false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al ac() {
		this.ac_fld = 0;
		this.an_fld = new float[this.av_fld];
		short[] var1 = new short[this.ad_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < this.aq_fld.length; var3++) {
			float[] var4 = kj(this, var3);
			if (null != var4) {
				int var5 = var4.length;
				if (var5 > this.ad_fld - var2) {
					var5 = this.ad_fld - var2;
				}

				for (int var6 = 0; var6 < var5; var6++) {
					var1[var2++] = (short)og.al(-32768, 32767, (int)(32768.0F * var4[var6]));
				}
			}
		}

		this.an_fld = null;
		return new al(this.am_fld, var1, this.ao_fld, this.ab_fld, this.ap_fld, false);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIII)V"
	)
	static void ae(dx var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		di var7 = client.db_fld;
		int var8 = client.nq_fld;
		int var9 = client.dj_fld;
		int var10 = var7.al_fld;
		int[] var11 = var7.az_fld;

		for (int var12 = 0; var12 < var10 + var0.ad_fld.az(); var12++) {
			da var13;
			if (var12 < var10) {
				var13 = (da)var0.au_fld.ak(var11[var12]);
				if (var8 == var11[var12]) {
					continue;
				}

				if (var11[var12] == var9) {
					if (var6 <= 884682988) {
						return;
					}
					continue;
				}
			} else {
				var13 = (da)var0.ax_fld.ak(var0.ad_fld.ag(var12 - var10));
			}

			ds.aw(var0, var13, var12, var1, var2, var3, var4, var5, (byte)67);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ao(xi var1) {
		this.am_fld = var1.co();
		this.ad_fld = var1.co();
		this.ao_fld = var1.co();
		this.ab_fld = var1.co();
		if (this.ab_fld < 0) {
			this.ab_fld ^= -1166974679;
			this.ap_fld = true;
		}

		int var2 = var1.co();
		this.aq_fld = new byte[var2][];

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.cg();
				var4 += var5;
			} while (var5 >= 255);

			byte[] var6 = new byte[var4];
			xi.xp(var1, var6, 0, var4, (byte)8);
			this.aq_fld[var3] = var6;
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Laq;[BI)V"
	)
	public static void dh(aq var0, byte[] var1, int var2) {
		bh var3 = var0.ak_fld;
		bh.jm(var3, var1, var2);
		var0.az_fld = 1 << var3.ak(4, 194526114);
		var0.av_fld = 1 << var3.ak(4, -8233812);

		for (int var4 = 0; var4 < 2; var4++) {
			int var5 = var4 != 0 ? var0.av_fld : var0.az_fld;
			int var6 = var5 >> 1;
			int var7 = var5 >> 2;
			int var8 = var5 >> 3;
			float[] var9 = new float[var6];

			for (int var10 = 0; var10 < var7; var10++) {
				var9[2 * var10] = (float)Math.cos(Math.PI * (4 * var10) / var5);
				var9[2 * var10 + 1] = -((float)Math.sin(Math.PI * (var10 * 4) / var5));
			}

			float[] var27 = new float[var6];

			for (int var11 = 0; var11 < var7; var11++) {
				var27[2 * var11] = (float)Math.cos((1 + var11 * 2) * Math.PI / (2 * var5));
				var27[1 + 2 * var11] = (float)Math.sin(Math.PI * (2 * var11 + 1) / (var5 * 2));
			}

			float[] var28 = new float[var7];

			for (int var12 = 0; var12 < var8; var12++) {
				var28[2 * var12] = (float)Math.cos((2 + var12 * 4) * Math.PI / var5);
				var28[1 + var12 * 2] = -((float)Math.sin((4 * var12 + 2) * Math.PI / var5));
			}

			int[] var29 = new int[var8];
			int var13 = gb.as(var8 - 1);

			for (int var14 = 0; var14 < var8; var14++) {
				var29[var14] = lj.ar(var14, var13);
			}

			if (0 != var4) {
				var0.ar_fld = var9;
				var0.at_fld = var27;
				var0.al_fld = var28;
				var0.ai_fld = var29;
			} else {
				var0.bd_fld = var9;
				var0.au_fld = var27;
				var0.af_fld = var28;
				var0.aa_fld = var29;
			}
		}

		int var15 = var3.ak(8, -1147973465) + 1;
		var0.ag_fld = new bd[var15];

		for (int var16 = 0; var16 < var15; var16++) {
			var0.ag_fld[var16] = new bd(var3);
		}

		int var17 = var3.ak(6, -684041491) + 1;

		for (int var19 = 0; var19 < var17; var19++) {
			var3.ak(16, 876156342);
		}

		var17 = var3.ak(6, -1335445382) + 1;
		var0.ae_fld = new au[var17];

		for (int var20 = 0; var20 < var17; var20++) {
			var0.ae_fld[var20] = new au(var3);
		}

		int var21 = var3.ak(6, -1978720748) + 1;
		var0.ah_fld = new at[var21];

		for (int var22 = 0; var22 < var21; var22++) {
			var0.ah_fld[var22] = new at(var3);
		}

		int var23 = var3.ak(6, -1702824406) + 1;
		var0.aw_fld = new bm[var23];

		for (int var24 = 0; var24 < var23; var24++) {
			var0.aw_fld[var24] = new bm(var3);
		}

		int var25 = var3.ak(6, -1899907562) + 1;
		var0.ay_fld = new boolean[var25];
		var0.as_fld = new int[var25];

		for (int var26 = 0; var26 < var25; var26++) {
			var0.ay_fld[var26] = var3.av() != 0;
			var3.ak(16, 110757763);
			var3.ak(16, -1376519662);
			var0.as_fld[var26] = var3.ak(8, 750857896);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([BI)V"
	)
	void bm(byte[] var1, int var2) {
		bh var3 = this.ak_fld;
		bh.jm(var3, var1, var2);
		this.az_fld = 1 << var3.ak(4, -261154629);
		this.av_fld = 1 << var3.ak(4, -335696282);

		for (int var4 = 0; var4 < 2; var4++) {
			int var5 = var4 != 0 ? this.av_fld : this.az_fld;
			int var6 = var5 >> 1;
			int var7 = var5 >> 2;
			int var8 = var5 >> 3;
			float[] var9 = new float[var6];

			for (int var10 = 0; var10 < var7; var10++) {
				var9[2 * var10] = (float)Math.cos(Math.PI * (4 * var10) / var5);
				var9[2 * var10 + 1] = -((float)Math.sin(Math.PI * (var10 * 4) / var5));
			}

			float[] var27 = new float[var6];

			for (int var11 = 0; var11 < var7; var11++) {
				var27[2 * var11] = (float)Math.cos((1 + var11 * 2) * Math.PI / (2 * var5));
				var27[1 + 2 * var11] = (float)Math.sin(Math.PI * (2 * var11 + 1) / (var5 * 2));
			}

			float[] var28 = new float[var7];

			for (int var12 = 0; var12 < var8; var12++) {
				var28[2 * var12] = (float)Math.cos((2 + var12 * 4) * Math.PI / var5);
				var28[1 + var12 * 2] = -((float)Math.sin((4 * var12 + 2) * Math.PI / var5));
			}

			int[] var29 = new int[var8];
			int var13 = gb.as(var8 - 1);

			for (int var14 = 0; var14 < var8; var14++) {
				var29[var14] = lj.ar(var14, var13);
			}

			if (0 != var4) {
				this.ar_fld = var9;
				this.at_fld = var27;
				this.al_fld = var28;
				this.ai_fld = var29;
			} else {
				this.bd_fld = var9;
				this.au_fld = var27;
				this.af_fld = var28;
				this.aa_fld = var29;
			}
		}

		int var15 = var3.ak(8, -693593510) + 1;
		this.ag_fld = new bd[var15];

		for (int var16 = 0; var16 < var15; var16++) {
			this.ag_fld[var16] = new bd(var3);
		}

		int var17 = var3.ak(6, 950047147) + 1;

		for (int var19 = 0; var19 < var17; var19++) {
			var3.ak(16, 725270938);
		}

		var17 = var3.ak(6, -1390035555) + 1;
		this.ae_fld = new au[var17];

		for (int var20 = 0; var20 < var17; var20++) {
			this.ae_fld[var20] = new au(var3);
		}

		int var21 = var3.ak(6, -1397199386) + 1;
		this.ah_fld = new at[var21];

		for (int var22 = 0; var22 < var21; var22++) {
			this.ah_fld[var22] = new at(var3);
		}

		int var23 = var3.ak(6, 341331295) + 1;
		this.aw_fld = new bm[var23];

		for (int var24 = 0; var24 < var23; var24++) {
			this.aw_fld[var24] = new bm(var3);
		}

		int var25 = var3.ak(6, 771470845) + 1;
		this.ay_fld = new boolean[var25];
		this.as_fld = new int[var25];

		for (int var26 = 0; var26 < var25; var26++) {
			this.ay_fld[var26] = var3.av() != 0;
			var3.ak(16, 503770209);
			var3.ak(16, -202260187);
			this.as_fld[var26] = var3.ak(8, -1553822631);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([BI)V"
	)
	void bz(byte[] var1, int var2) {
		bh var3 = this.ak_fld;
		bh.jm(var3, var1, var2);
		this.az_fld = 1 << var3.ak(4, -1985780210);
		this.av_fld = 1 << var3.ak(4, -710561673);

		for (int var4 = 0; var4 < 2; var4++) {
			int var5 = var4 != 0 ? this.av_fld : this.az_fld;
			int var6 = var5 >> 1;
			int var7 = var5 >> 2;
			int var8 = var5 >> 3;
			float[] var9 = new float[var6];

			for (int var10 = 0; var10 < var7; var10++) {
				var9[2 * var10] = (float)Math.cos(Math.PI * (4 * var10) / var5);
				var9[2 * var10 + 1] = -((float)Math.sin(Math.PI * (var10 * 4) / var5));
			}

			float[] var27 = new float[var6];

			for (int var11 = 0; var11 < var7; var11++) {
				var27[2 * var11] = (float)Math.cos((1 + var11 * 2) * Math.PI / (2 * var5));
				var27[1 + 2 * var11] = (float)Math.sin(Math.PI * (2 * var11 + 1) / (var5 * 2));
			}

			float[] var28 = new float[var7];

			for (int var12 = 0; var12 < var8; var12++) {
				var28[2 * var12] = (float)Math.cos((2 + var12 * 4) * Math.PI / var5);
				var28[1 + var12 * 2] = -((float)Math.sin((4 * var12 + 2) * Math.PI / var5));
			}

			int[] var29 = new int[var8];
			int var13 = gb.as(var8 - 1);

			for (int var14 = 0; var14 < var8; var14++) {
				var29[var14] = lj.ar(var14, var13);
			}

			if (0 != var4) {
				this.ar_fld = var9;
				this.at_fld = var27;
				this.al_fld = var28;
				this.ai_fld = var29;
			} else {
				this.bd_fld = var9;
				this.au_fld = var27;
				this.af_fld = var28;
				this.aa_fld = var29;
			}
		}

		int var15 = var3.ak(8, -413653110) + 1;
		this.ag_fld = new bd[var15];

		for (int var16 = 0; var16 < var15; var16++) {
			this.ag_fld[var16] = new bd(var3);
		}

		int var17 = var3.ak(6, -1507949757) + 1;

		for (int var19 = 0; var19 < var17; var19++) {
			var3.ak(16, 876514409);
		}

		var17 = var3.ak(6, 441089618) + 1;
		this.ae_fld = new au[var17];

		for (int var20 = 0; var20 < var17; var20++) {
			this.ae_fld[var20] = new au(var3);
		}

		int var21 = var3.ak(6, -842208223) + 1;
		this.ah_fld = new at[var21];

		for (int var22 = 0; var22 < var21; var22++) {
			this.ah_fld[var22] = new at(var3);
		}

		int var23 = var3.ak(6, -278388740) + 1;
		this.aw_fld = new bm[var23];

		for (int var24 = 0; var24 < var23; var24++) {
			this.aw_fld[var24] = new bm(var3);
		}

		int var25 = var3.ak(6, -1280602924) + 1;
		this.ay_fld = new boolean[var25];
		this.as_fld = new int[var25];

		for (int var26 = 0; var26 < var25; var26++) {
			this.ay_fld[var26] = var3.av() != 0;
			var3.ak(16, -2134412407);
			var3.ak(16, -1873573636);
			this.as_fld[var26] = var3.ak(8, -2127565562);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean af(int var0) {
		Date var1;
		try {
			var1 = dt.an();
		} catch (ParseException var5) {
			sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (null == var1) {
			return false;
		} else {
			Calendar var3 = Calendar.getInstance();
			var3.set(1, var3.get(1) - 13);
			var3.set(5, var3.get(5) + 1);
			var3.set(11, 0);
			var3.set(12, 0);
			var3.set(13, 0);
			var3.set(14, 0);
			Date var4 = var3.getTime();
			boolean var2 = var1.before(var4);
			boolean var6 = gi.al(var1);
			if (!var6) {
				sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var2) {
					fe.bg_fld = 1229895895;
				} else {
					fe.bg_fld = (int)(var1.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[F"
	)
	float[] ah(int var1, int var2) {
		bh var3 = new bh();
		bh.jm(var3, this.aq_fld[var1], 0);
		this.an_fld = new float[-676025093 * this.aj_fld];
		var3.av();
		int var4 = var3.ak(gb.as(this.aa_fld.length - 1), 499786991);
		boolean var5 = this.ay_fld[var4];
		int var6 = var5 ? -676025093 * this.ab_fld : 284803571 * this.aj_fld;
		boolean var7 = false;
		boolean var8 = false;
		if (var5) {
			var7 = var3.ag(1255143976) != 0;
			var8 = var3.ag(1762668887) != 0;
		}

		int var9 = var6 >> 1;
		int var10;
		int var11;
		int var12;
		if (var5 && !var7) {
			var10 = (var6 >> 2) - (this.ab_fld >> 2);
			var11 = (var6 >> 2) + (this.az_fld >> 2);
			var12 = this.az_fld >> 1;
		} else {
			var10 = 0;
			var11 = var9;
			var12 = var6 >> 1;
		}

		int var13;
		int var14;
		int var15;
		if (var5 && !var8) {
			var13 = var6 - (var6 >> 2) - (this.ad_fld >> 2);
			var14 = (this.ao_fld >> 2) + (var6 - (var6 >> 2));
			var15 = this.az_fld >> 1;
		} else {
			var13 = var9;
			var14 = var6;
			var15 = var6 >> 1;
		}

		bm var16 = this.aw_fld[this.as_fld[var4]];
		int var17 = var16.ak_fld;
		int var18 = var16.av_fld[var17];
		bs var19 = this.ae_fld[var18].ae(var3, this.ag_fld);
		boolean var20 = !var19.ag();

		for (int var21 = 0; var21 < var16.ag_fld; var21++) {
			at var22 = this.ah_fld[var16.az_fld[var21]];
			float[] var23 = this.au_fld;
			at.zn(var22, var23, var6 >> 1, var20, var3, this.ag_fld);
		}

		if (var19.ag()) {
			var17 = var16.ak_fld;
			var18 = var16.av_fld[var17];
			var19.ak(this.bd_fld, var6 >> 1);
		}

		if (!var19.ag()) {
			for (int var46 = var6 >> 1; var46 < var6; var46++) {
				this.au_fld[var46] = 0.0F;
			}
		} else {
			int var47 = var6 >> 1;
			int var49 = var6 >> 2;
			int var52 = var6 >> 3;
			float[] var24 = this.an_fld;

			for (int var25 = 0; var25 < var47; var25++) {
				var24[var25] *= 0.5F;
			}

			for (int var57 = var47; var57 < var6; var57++) {
				var24[var57] = -var24[var6 - var57 - 1];
			}

			float[] var58 = var5 ? this.ar_fld : this.at_fld;
			float[] var26 = var5 ? this.ax_fld : this.ar_fld;
			float[] var27 = var5 ? this.au_fld : this.bd_fld;
			int[] var28 = var5 ? this.ai_fld : this.as_fld;

			for (int var29 = 0; var29 < var49; var29++) {
				float var30 = var24[var29 * 4] - var24[var6 - 4 * var29 - 1];
				float var31 = var24[2 + 4 * var29] - var24[var6 - var29 * 4 - 3];
				float var32 = var58[var29 * 2];
				float var33 = var58[1 + var29 * 2];
				var24[var6 - 4 * var29 - 1] = var32 * var30 - var31 * var33;
				var24[var6 - 4 * var29 - 3] = var30 * var33 + var32 * var31;
			}

			for (int var59 = 0; var59 < var52; var59++) {
				float var61 = var24[var47 + 3 + 4 * var59];
				float var74 = var24[4 * var59 + var47 + 1];
				float var80 = var24[var59 * 4 + 3];
				float var84 = var24[1 + 4 * var59];
				var24[var59 * 4 + var47 + 3] = var61 + var80;
				var24[4 * var59 + var47 + 1] = var84 + var74;
				float var34 = var58[var47 - 4 - var59 * 4];
				float var35 = var58[var47 - 3 - var59 * 4];
				var24[4 * var59 + 3] = (var61 - var80) * var34 - (var74 - var84) * var35;
				var24[1 + 4 * var59] = var35 * (var61 - var80) + var34 * (var74 - var84);
			}

			int var60 = gb.as(var6 - 1);

			for (int var62 = 0; var62 < var60 - 3; var62++) {
				int var75 = var6 >> 2 + var62;
				int var81 = 8 << var62;

				for (int var85 = 0; var85 < 2 << var62; var85++) {
					int var88 = var6 - 2 * var75 * var85;
					int var94 = var6 - (var85 * 2 + 1) * var75;

					for (int var36 = 0; var36 < var6 >> var62 + 4; var36++) {
						int var37 = 4 * var36;
						float var38 = var24[var88 - 1 - var37];
						float var39 = var24[var88 - 3 - var37];
						float var40 = var24[var94 - 1 - var37];
						float var41 = var24[var94 - 3 - var37];
						var24[var88 - 1 - var37] = var38 + var40;
						var24[var88 - 3 - var37] = var39 + var41;
						float var42 = var58[var81 * var36];
						float var43 = var58[var81 * var36 + 1];
						var24[var94 - 1 - var37] = (var38 - var40) * var42 - var43 * (var39 - var41);
						var24[var94 - 3 - var37] = var42 * (var39 - var41) + (var38 - var40) * var43;
					}
				}
			}

			for (int var63 = 1; var63 < var52 - 1; var63++) {
				int var76 = var28[var63];
				if (var63 < var76) {
					int var82 = var63 * 8;
					int var86 = var76 * 8;
					float var89 = var24[var82 + 1];
					var24[1 + var82] = var24[var86 + 1];
					var24[var86 + 1] = var89;
					var89 = var24[var82 + 3];
					var24[3 + var82] = var24[var86 + 3];
					var24[3 + var86] = var89;
					var89 = var24[var82 + 5];
					var24[5 + var82] = var24[var86 + 5];
					var24[5 + var86] = var89;
					var89 = var24[7 + var82];
					var24[var82 + 7] = var24[var86 + 7];
					var24[7 + var86] = var89;
				}
			}

			for (int var64 = 0; var64 < var47; var64++) {
				var24[var64] = var24[1 + 2 * var64];
			}

			for (int var65 = 0; var65 < var52; var65++) {
				var24[var6 - 1 - 2 * var65] = var24[var65 * 4];
				var24[var6 - 2 - var65 * 2] = var24[4 * var65 + 1];
				var24[var6 - var49 - 1 - 2 * var65] = var24[2 + var65 * 4];
				var24[var6 - var49 - 2 - 2 * var65] = var24[var65 * 4 + 3];
			}

			for (int var66 = 0; var66 < var52; var66++) {
				float var77 = var27[2 * var66];
				float var83 = var27[1 + var66 * 2];
				float var87 = var24[var47 + var66 * 2];
				float var93 = var24[1 + var47 + 2 * var66];
				float var95 = var24[var6 - 2 - var66 * 2];
				float var96 = var24[var6 - 1 - 2 * var66];
				float var97 = (var96 + var93) * var77 + var83 * (var87 - var95);
				var24[var47 + 2 * var66] = 0.5F * (var95 + var87 + var97);
				var24[var6 - 2 - var66 * 2] = (var87 + var95 - var97) * 0.5F;
				var97 = var83 * (var93 + var96) - (var87 - var95) * var77;
				var24[1 + 2 * var66 + var47] = 0.5F * (var93 - var96 + var97);
				var24[var6 - 1 - 2 * var66] = (var97 + (-var93 + var96)) * 0.5F;
			}

			for (int var67 = 0; var67 < var49; var67++) {
				var24[var67] = var26[var67 * 2 + 1] * var24[2 * var67 + 1 + var47] + var26[var67 * 2] * var24[2 * var67 + var47];
				var24[var47 - 1 - var67] = var24[2 * var67 + var47] * var26[1 + 2 * var67] - var26[var67 * 2] * var24[1 + var67 * 2 + var47];
			}

			for (int var68 = 0; var68 < var49; var68++) {
				var24[var68 + (var6 - var49)] = -var24[var68];
			}

			for (int var69 = 0; var69 < var49; var69++) {
				var24[var69] = var24[var49 + var69];
			}

			for (int var70 = 0; var70 < var49; var70++) {
				var24[var49 + var70] = -var24[var49 - var70 - 1];
			}

			for (int var71 = 0; var71 < var49; var71++) {
				var24[var71 + var47] = var24[var6 - var71 - 1];
			}

			for (int var72 = var10; var72 < var11; var72++) {
				float var78 = (float)Math.sin((0.5 + (var72 - var10)) / var12 * 0.5 * Math.PI);
				this.ax_fld[var72] = this.ax_fld[var72] * (float)Math.sin(var78 * (Math.PI / 2) * var78);
			}

			for (int var73 = var13; var73 < var14; var73++) {
				float var79 = (float)Math.sin((var73 - var13 + 0.5) / var15 * 0.5 * Math.PI + (Math.PI / 2));
				this.al_fld[var73] = this.al_fld[var73] * (float)Math.sin(var79 * (Math.PI / 2) * var79);
			}
		}

		float[] var48 = null;
		if (this.av_fld * 1651492503 > 0) {
			int var50 = var6 + this.ab_fld >> 2;
			var48 = new float[var50];
			if (!this.bm_fld) {
				for (int var53 = 0; var53 < this.ao_fld; var53++) {
					int var55 = (this.ao_fld >> 1) + var53;
					var48[var53] += this.af_fld[var55];
				}
			}

			if (var19.ag()) {
				for (int var54 = var10; var54 < var6 >> 1; var54++) {
					int var56 = var48.length - (var6 >> 1) + var54;
					var48[var56] += this.ax_fld[var54];
				}
			}
		}

		float[] var51 = this.bd_fld;
		this.bd_fld = this.bd_fld;
		this.ax_fld = var51;
		this.aj_fld = var6 * -460580569;
		this.az_fld = (var14 - (var6 >> 1)) * -1197883087;
		this.ap_fld = !var19.ag();
		return var48;
	}
}
