import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bz")
public class bz extends vw {
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] br_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	static bd[] ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lau;"
	)
	static au[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lat;"
	)
	static at[] ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	static bm[] aw_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] ac_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bm_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean ar_fld = false;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ai_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] al_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bs_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] ax_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] an_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] aa_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean at_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aq_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	byte[][] am_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int be_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	static bh ak_fld = new bh();
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ap_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	static boolean[] ay_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] bz_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] af_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ab_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bd_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] au_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] as_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aj_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ao_fld;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I)Lal;"
	)
	al ab(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.br_fld == null) {
				this.ap_fld = 0;
				this.bz_fld = new float[av_fld];
				this.br_fld = new short[this.bm_fld];
				this.aj_fld = 0;
				this.ao_fld = 0;
			}

			for (; this.ao_fld < this.am_fld.length; this.ao_fld++) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.ah(this.ao_fld);
				if (var2 != null) {
					int var3 = this.aj_fld;
					int var4 = var2.length;
					if (var4 > this.bm_fld - var3) {
						var4 = this.bm_fld - var3;
					}

					for (int var5 = 0; var5 < var4; var5++) {
						this.br_fld[var3++] = (short)og.al(-1209348427, 244940392, (int)(var2[var5] * 32768.0F));
					}

					if (var1 != null) {
						var1[0] -= var3 - this.aj_fld;
					}

					this.aj_fld = var3;
				}
			}

			this.bz_fld = null;
			short[] var6 = this.br_fld;
			this.br_fld = null;
			return new al(this.be_fld, var6, this.ad_fld, this.bs_fld, this.bd_fld, false);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] ah(int var1) {
		bh var2 = new bh();
		var2.az(this.am_fld[var1], 0);
		this.ac_fld = new float[av_fld];
		var2.ag();
		int var3 = var2.ak(gb.as(as_fld.length - 1), 645016262);
		boolean var4 = ay_fld[var3];
		int var5 = var4 ? av_fld : az_fld;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.ag() != 0;
			var7 = var2.ag() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (az_fld >> 2);
			var10 = (var5 >> 2) + (az_fld >> 2);
			var11 = az_fld >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (az_fld >> 2);
			var13 = var5 - (var5 >> 2) + (az_fld >> 2);
			var14 = az_fld >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		bm var15 = aw_fld[as_fld[var3]];
		int var16 = var15.ag_fld;
		int var17 = var15.az_fld[var16];
		bs var18 = ae_fld[var17].ae(var2, ag_fld);
		boolean var19 = !var18.ag();

		for (int var20 = 0; var20 < var15.ak_fld; var20++) {
			at var21 = ah_fld[var15.av_fld[var20]];
			float[] var22 = this.ac_fld;
			var21.ak(var22, var5 >> 1, var19, var2, ag_fld);
		}

		if (var18.ag()) {
			var16 = var15.ag_fld;
			var17 = var15.az_fld[var16];
			var18.ak(this.ac_fld, var5 >> 1);
		}

		if (!var18.ag()) {
			for (int var45 = var5 >> 1; var45 < var5; var45++) {
				this.ac_fld[var45] = 0.0F;
			}
		} else {
			int var46 = var5 >> 1;
			int var48 = var5 >> 2;
			int var51 = var5 >> 3;
			float[] var23 = this.ac_fld;

			for (int var24 = 0; var24 < var46; var24++) {
				var23[var24] *= 0.5F;
			}

			for (int var56 = var46; var56 < var5; var56++) {
				var23[var56] = -var23[var5 - var56 - 1];
			}

			float[] var57 = var4 ? ax_fld : af_fld;
			float[] var25 = var4 ? an_fld : al_fld;
			float[] var26 = var4 ? aa_fld : au_fld;
			int[] var27 = var4 ? aq_fld : ai_fld;

			for (int var28 = 0; var28 < var48; var28++) {
				float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
				float var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
				float var31 = var57[2 * var28];
				float var32 = var57[2 * var28 + 1];
				var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
			}

			for (int var58 = 0; var58 < var51; var58++) {
				float var60 = var23[var46 + 3 + 4 * var58];
				float var73 = var23[var46 + 1 + 4 * var58];
				float var79 = var23[4 * var58 + 3];
				float var83 = var23[4 * var58 + 1];
				var23[var46 + 3 + 4 * var58] = var60 + var79;
				var23[var46 + 1 + 4 * var58] = var73 + var83;
				float var33 = var57[var46 - 4 - 4 * var58];
				float var34 = var57[var46 - 3 - 4 * var58];
				var23[4 * var58 + 3] = (var60 - var79) * var33 - (var73 - var83) * var34;
				var23[4 * var58 + 1] = (var73 - var83) * var33 + (var60 - var79) * var34;
			}

			int var59 = gb.as(var5 - 1);

			for (int var61 = 0; var61 < var59 - 3; var61++) {
				int var74 = var5 >> var61 + 2;
				int var80 = 8 << var61;

				for (int var84 = 0; var84 < 2 << var61; var84++) {
					int var87 = var5 - var74 * 2 * var84;
					int var93 = var5 - var74 * (2 * var84 + 1);

					for (int var35 = 0; var35 < var5 >> var61 + 4; var35++) {
						int var36 = 4 * var35;
						float var37 = var23[var87 - 1 - var36];
						float var38 = var23[var87 - 3 - var36];
						float var39 = var23[var93 - 1 - var36];
						float var40 = var23[var93 - 3 - var36];
						var23[var87 - 1 - var36] = var37 + var39;
						var23[var87 - 3 - var36] = var38 + var40;
						float var41 = var57[var35 * var80];
						float var42 = var57[var35 * var80 + 1];
						var23[var93 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var93 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (int var62 = 1; var62 < var51 - 1; var62++) {
				int var75 = var27[var62];
				if (var62 < var75) {
					int var81 = 8 * var62;
					int var85 = 8 * var75;
					float var88 = var23[var81 + 1];
					var23[var81 + 1] = var23[var85 + 1];
					var23[var85 + 1] = var88;
					var88 = var23[var81 + 3];
					var23[var81 + 3] = var23[var85 + 3];
					var23[var85 + 3] = var88;
					var88 = var23[var81 + 5];
					var23[var81 + 5] = var23[var85 + 5];
					var23[var85 + 5] = var88;
					var88 = var23[var81 + 7];
					var23[var81 + 7] = var23[var85 + 7];
					var23[var85 + 7] = var88;
				}
			}

			for (int var63 = 0; var63 < var46; var63++) {
				var23[var63] = var23[2 * var63 + 1];
			}

			for (int var64 = 0; var64 < var51; var64++) {
				var23[var5 - 1 - 2 * var64] = var23[4 * var64];
				var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
				var23[var5 - var48 - 1 - 2 * var64] = var23[4 * var64 + 2];
				var23[var5 - var48 - 2 - 2 * var64] = var23[4 * var64 + 3];
			}

			for (int var65 = 0; var65 < var51; var65++) {
				float var76 = var26[2 * var65];
				float var82 = var26[2 * var65 + 1];
				float var86 = var23[var46 + 2 * var65];
				float var92 = var23[var46 + 2 * var65 + 1];
				float var94 = var23[var5 - 2 - 2 * var65];
				float var95 = var23[var5 - 1 - 2 * var65];
				float var96 = var82 * (var86 - var94) + var76 * (var92 + var95);
				var23[var46 + 2 * var65] = (var86 + var94 + var96) * 0.5F;
				var23[var5 - 2 - 2 * var65] = (var86 + var94 - var96) * 0.5F;
				var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
				var23[var46 + 2 * var65 + 1] = (var92 - var95 + var96) * 0.5F;
				var23[var5 - 1 - 2 * var65] = (-var92 + var95 + var96) * 0.5F;
			}

			for (int var66 = 0; var66 < var48; var66++) {
				var23[var66] = var23[2 * var66 + var46] * var25[2 * var66] + var23[2 * var66 + 1 + var46] * var25[2 * var66 + 1];
				var23[var46 - 1 - var66] = var23[2 * var66 + var46] * var25[2 * var66 + 1] - var23[2 * var66 + 1 + var46] * var25[2 * var66];
			}

			for (int var67 = 0; var67 < var48; var67++) {
				var23[var5 - var48 + var67] = -var23[var67];
			}

			for (int var68 = 0; var68 < var48; var68++) {
				var23[var68] = var23[var48 + var68];
			}

			for (int var69 = 0; var69 < var48; var69++) {
				var23[var48 + var69] = -var23[var48 - var69 - 1];
			}

			for (int var70 = 0; var70 < var48; var70++) {
				var23[var46 + var70] = var23[var5 - var70 - 1];
			}

			for (int var71 = var9; var71 < var10; var71++) {
				float var77 = (float)Math.sin((var71 - var9 + 0.5) / var11 * 0.5 * Math.PI);
				this.ac_fld[var71] = this.ac_fld[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
			}

			for (int var72 = var12; var72 < var13; var72++) {
				float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
				this.ac_fld[var72] = this.ac_fld[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
			}
		}

		float[] var47 = null;
		if (this.ap_fld > 0) {
			int var49 = this.ap_fld + var5 >> 2;
			var47 = new float[var49];
			if (!this.at_fld) {
				for (int var52 = 0; var52 < this.ab_fld; var52++) {
					int var54 = (this.ap_fld >> 1) + var52;
					var47[var52] += this.bz_fld[var54];
				}
			}

			if (var18.ag()) {
				for (int var53 = var9; var53 < var5 >> 1; var53++) {
					int var55 = var47.length - (var5 >> 1) + var53;
					var47[var55] += this.ac_fld[var53];
				}
			}
		}

		float[] var50 = this.bz_fld;
		this.bz_fld = this.ac_fld;
		this.ac_fld = var50;
		this.ap_fld = var5;
		this.ab_fld = var13 - (var5 >> 1);
		this.at_fld = !var18.ag();
		return var47;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	static void ag(byte[] var0) {
		bh var1 = ak_fld;
		var1.az(var0, 0);
		az_fld = 1 << var1.ak(4, 1012190155);
		av_fld = 1 << var1.ak(4, 615017820);

		for (int var2 = 0; var2 < 2; var2++) {
			int var3 = var2 != 0 ? av_fld : az_fld;
			int var4 = var3 >> 1;
			int var5 = var3 >> 2;
			int var6 = var3 >> 3;
			float[] var7 = new float[var4];

			for (int var8 = 0; var8 < var5; var8++) {
				var7[2 * var8] = (float)Math.cos(4 * var8 * Math.PI / var3);
				var7[2 * var8 + 1] = -((float)Math.sin(4 * var8 * Math.PI / var3));
			}

			float[] var25 = new float[var4];

			for (int var9 = 0; var9 < var5; var9++) {
				var25[2 * var9] = (float)Math.cos((2 * var9 + 1) * Math.PI / (2 * var3));
				var25[2 * var9 + 1] = (float)Math.sin((2 * var9 + 1) * Math.PI / (2 * var3));
			}

			float[] var26 = new float[var5];

			for (int var10 = 0; var10 < var6; var10++) {
				var26[2 * var10] = (float)Math.cos((4 * var10 + 2) * Math.PI / var3);
				var26[2 * var10 + 1] = -((float)Math.sin((4 * var10 + 2) * Math.PI / var3));
			}

			int[] var27 = new int[var6];
			int var11 = gb.as(var6 - 1);

			for (int var12 = 0; var12 < var6; var12++) {
				var27[var12] = lj.ar(var12, var11);
			}

			if (var2 != 0) {
				ax_fld = var7;
				an_fld = var25;
				aa_fld = var26;
				aq_fld = var27;
			} else {
				af_fld = var7;
				al_fld = var25;
				au_fld = var26;
				ai_fld = var27;
			}
		}

		int var13 = var1.ak(8, -1419940588) + 1;
		ag_fld = new bd[var13];

		for (int var14 = 0; var14 < var13; var14++) {
			ag_fld[var14] = new bd(ak_fld);
		}

		int var15 = var1.ak(6, 771848768) + 1;

		for (int var17 = 0; var17 < var15; var17++) {
			var1.ak(16, -1549421913);
		}

		var15 = var1.ak(6, -1469473209) + 1;
		ae_fld = new au[var15];

		for (int var18 = 0; var18 < var15; var18++) {
			ae_fld[var18] = new au(ak_fld);
		}

		int var19 = var1.ak(6, -626470814) + 1;
		ah_fld = new at[var19];

		for (int var20 = 0; var20 < var19; var20++) {
			ah_fld[var20] = new at(ak_fld);
		}

		int var21 = var1.ak(6, -1919798921) + 1;
		aw_fld = new bm[var21];

		for (int var22 = 0; var22 < var21; var22++) {
			aw_fld[var22] = new bm(ak_fld);
		}

		int var23 = var1.ak(6, -608256237) + 1;
		ay_fld = new boolean[var23];
		as_fld = new int[var23];

		for (int var24 = 0; var24 < var23; var24++) {
			ay_fld[var24] = var1.ag() != 0;
			var1.ak(16, -1971510397);
			var1.ak(16, -1254953647);
			as_fld[var24] = var1.ak(8, 391799764);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lub;)Z"
	)
	static boolean az(ub var0) throws EOFException {
		try {
			if (!ar_fld) {
				byte[] var1 = var0.bb(0, 0, 584982574);
				if (var1 == null) {
					return false;
				}

				ag(var1);
				ar_fld = true;
			}

			return true;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] aq(int var1) {
		bh var2 = new bh();
		var2.az(this.am_fld[var1], 0);
		this.ac_fld = new float[av_fld];
		var2.ag();
		int var3 = var2.ak(gb.as(as_fld.length - 1), -786287366);
		boolean var4 = ay_fld[var3];
		int var5 = var4 ? av_fld : az_fld;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.ag() != 0;
			var7 = var2.ag() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (az_fld >> 2);
			var10 = (var5 >> 2) + (az_fld >> 2);
			var11 = az_fld >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (az_fld >> 2);
			var13 = var5 - (var5 >> 2) + (az_fld >> 2);
			var14 = az_fld >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		bm var15 = aw_fld[as_fld[var3]];
		int var16 = var15.ag_fld;
		int var17 = var15.az_fld[var16];
		bs var18 = ae_fld[var17].ae(var2, ag_fld);
		boolean var19 = !var18.ag();

		for (int var20 = 0; var20 < var15.ak_fld; var20++) {
			at var21 = ah_fld[var15.av_fld[var20]];
			float[] var22 = this.ac_fld;
			var21.ak(var22, var5 >> 1, var19, var2, ag_fld);
		}

		if (var18.ag()) {
			var16 = var15.ag_fld;
			var17 = var15.az_fld[var16];
			var18.ak(this.ac_fld, var5 >> 1);
		}

		if (!var18.ag()) {
			for (int var45 = var5 >> 1; var45 < var5; var45++) {
				this.ac_fld[var45] = 0.0F;
			}
		} else {
			int var46 = var5 >> 1;
			int var48 = var5 >> 2;
			int var51 = var5 >> 3;
			float[] var23 = this.ac_fld;

			for (int var24 = 0; var24 < var46; var24++) {
				var23[var24] *= 0.5F;
			}

			for (int var56 = var46; var56 < var5; var56++) {
				var23[var56] = -var23[var5 - var56 - 1];
			}

			float[] var57 = var4 ? ax_fld : af_fld;
			float[] var25 = var4 ? an_fld : al_fld;
			float[] var26 = var4 ? aa_fld : au_fld;
			int[] var27 = var4 ? aq_fld : ai_fld;

			for (int var28 = 0; var28 < var48; var28++) {
				float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
				float var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
				float var31 = var57[2 * var28];
				float var32 = var57[2 * var28 + 1];
				var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
			}

			for (int var58 = 0; var58 < var51; var58++) {
				float var60 = var23[var46 + 3 + 4 * var58];
				float var73 = var23[var46 + 1 + 4 * var58];
				float var79 = var23[4 * var58 + 3];
				float var83 = var23[4 * var58 + 1];
				var23[var46 + 3 + 4 * var58] = var60 + var79;
				var23[var46 + 1 + 4 * var58] = var73 + var83;
				float var33 = var57[var46 - 4 - 4 * var58];
				float var34 = var57[var46 - 3 - 4 * var58];
				var23[4 * var58 + 3] = (var60 - var79) * var33 - (var73 - var83) * var34;
				var23[4 * var58 + 1] = (var73 - var83) * var33 + (var60 - var79) * var34;
			}

			int var59 = gb.as(var5 - 1);

			for (int var61 = 0; var61 < var59 - 3; var61++) {
				int var74 = var5 >> var61 + 2;
				int var80 = 8 << var61;

				for (int var84 = 0; var84 < 2 << var61; var84++) {
					int var87 = var5 - var74 * 2 * var84;
					int var93 = var5 - var74 * (2 * var84 + 1);

					for (int var35 = 0; var35 < var5 >> var61 + 4; var35++) {
						int var36 = 4 * var35;
						float var37 = var23[var87 - 1 - var36];
						float var38 = var23[var87 - 3 - var36];
						float var39 = var23[var93 - 1 - var36];
						float var40 = var23[var93 - 3 - var36];
						var23[var87 - 1 - var36] = var37 + var39;
						var23[var87 - 3 - var36] = var38 + var40;
						float var41 = var57[var35 * var80];
						float var42 = var57[var35 * var80 + 1];
						var23[var93 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var93 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (int var62 = 1; var62 < var51 - 1; var62++) {
				int var75 = var27[var62];
				if (var62 < var75) {
					int var81 = 8 * var62;
					int var85 = 8 * var75;
					float var88 = var23[var81 + 1];
					var23[var81 + 1] = var23[var85 + 1];
					var23[var85 + 1] = var88;
					var88 = var23[var81 + 3];
					var23[var81 + 3] = var23[var85 + 3];
					var23[var85 + 3] = var88;
					var88 = var23[var81 + 5];
					var23[var81 + 5] = var23[var85 + 5];
					var23[var85 + 5] = var88;
					var88 = var23[var81 + 7];
					var23[var81 + 7] = var23[var85 + 7];
					var23[var85 + 7] = var88;
				}
			}

			for (int var63 = 0; var63 < var46; var63++) {
				var23[var63] = var23[2 * var63 + 1];
			}

			for (int var64 = 0; var64 < var51; var64++) {
				var23[var5 - 1 - 2 * var64] = var23[4 * var64];
				var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
				var23[var5 - var48 - 1 - 2 * var64] = var23[4 * var64 + 2];
				var23[var5 - var48 - 2 - 2 * var64] = var23[4 * var64 + 3];
			}

			for (int var65 = 0; var65 < var51; var65++) {
				float var76 = var26[2 * var65];
				float var82 = var26[2 * var65 + 1];
				float var86 = var23[var46 + 2 * var65];
				float var92 = var23[var46 + 2 * var65 + 1];
				float var94 = var23[var5 - 2 - 2 * var65];
				float var95 = var23[var5 - 1 - 2 * var65];
				float var96 = var82 * (var86 - var94) + var76 * (var92 + var95);
				var23[var46 + 2 * var65] = (var86 + var94 + var96) * 0.5F;
				var23[var5 - 2 - 2 * var65] = (var86 + var94 - var96) * 0.5F;
				var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
				var23[var46 + 2 * var65 + 1] = (var92 - var95 + var96) * 0.5F;
				var23[var5 - 1 - 2 * var65] = (-var92 + var95 + var96) * 0.5F;
			}

			for (int var66 = 0; var66 < var48; var66++) {
				var23[var66] = var23[2 * var66 + var46] * var25[2 * var66] + var23[2 * var66 + 1 + var46] * var25[2 * var66 + 1];
				var23[var46 - 1 - var66] = var23[2 * var66 + var46] * var25[2 * var66 + 1] - var23[2 * var66 + 1 + var46] * var25[2 * var66];
			}

			for (int var67 = 0; var67 < var48; var67++) {
				var23[var5 - var48 + var67] = -var23[var67];
			}

			for (int var68 = 0; var68 < var48; var68++) {
				var23[var68] = var23[var48 + var68];
			}

			for (int var69 = 0; var69 < var48; var69++) {
				var23[var48 + var69] = -var23[var48 - var69 - 1];
			}

			for (int var70 = 0; var70 < var48; var70++) {
				var23[var46 + var70] = var23[var5 - var70 - 1];
			}

			for (int var71 = var9; var71 < var10; var71++) {
				float var77 = (float)Math.sin((var71 - var9 + 0.5) / var11 * 0.5 * Math.PI);
				this.ac_fld[var71] = this.ac_fld[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
			}

			for (int var72 = var12; var72 < var13; var72++) {
				float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
				this.ac_fld[var72] = this.ac_fld[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
			}
		}

		float[] var47 = null;
		if (this.ap_fld > 0) {
			int var49 = this.ap_fld + var5 >> 2;
			var47 = new float[var49];
			if (!this.at_fld) {
				for (int var52 = 0; var52 < this.ab_fld; var52++) {
					int var54 = (this.ap_fld >> 1) + var52;
					var47[var52] += this.bz_fld[var54];
				}
			}

			if (var18.ag()) {
				for (int var53 = var9; var53 < var5 >> 1; var53++) {
					int var55 = var47.length - (var5 >> 1) + var53;
					var47[var55] += this.ac_fld[var53];
				}
			}
		}

		float[] var50 = this.bz_fld;
		this.bz_fld = this.ac_fld;
		this.ac_fld = var50;
		this.ap_fld = var5;
		this.ab_fld = var13 - (var5 >> 1);
		this.at_fld = !var18.ag();
		return var47;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void ae(byte[] var1) {
		xi var2 = new xi(var1);
		this.be_fld = var2.co((byte)1);
		this.bm_fld = var2.co((byte)-56);
		this.ad_fld = var2.co((byte)-87);
		this.bs_fld = var2.co((byte)-33);
		if (this.bs_fld < 0) {
			this.bs_fld = ~this.bs_fld;
			this.bd_fld = true;
		}

		int var3 = var2.co((byte)-19);
		this.am_fld = new byte[var3][];

		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.cg();
				var5 += var6;
			} while (var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.dh(var7, 0, var5);
			this.am_fld[var4] = var7;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I)Lal;"
	)
	al ao(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.br_fld == null) {
				this.ap_fld = 0;
				this.bz_fld = new float[av_fld];
				this.br_fld = new short[this.bm_fld];
				this.aj_fld = 0;
				this.ao_fld = 0;
			}

			for (; this.ao_fld < this.am_fld.length; this.ao_fld++) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.ah(this.ao_fld);
				if (var2 != null) {
					int var3 = this.aj_fld;
					int var4 = var2.length;
					if (var4 > this.bm_fld - var3) {
						var4 = this.bm_fld - var3;
					}

					for (int var5 = 0; var5 < var4; var5++) {
						this.br_fld[var3++] = (short)og.al(-32768, 32767, (int)(var2[var5] * 32768.0F));
					}

					if (var1 != null) {
						var1[0] -= var3 - this.aj_fld;
					}

					this.aj_fld = var3;
				}
			}

			this.bz_fld = null;
			short[] var6 = this.br_fld;
			this.br_fld = null;
			return new al(this.be_fld, var6, this.ad_fld, this.bs_fld, this.bd_fld, false);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] am(int var1) {
		bh var2 = new bh();
		var2.az(this.am_fld[var1], 0);
		this.ac_fld = new float[av_fld];
		var2.ag();
		int var3 = var2.ak(gb.as(as_fld.length - 1), -1187774496);
		boolean var4 = ay_fld[var3];
		int var5 = var4 ? av_fld : az_fld;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.ag() != 0;
			var7 = var2.ag() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (az_fld >> 2);
			var10 = (var5 >> 2) + (az_fld >> 2);
			var11 = az_fld >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (az_fld >> 2);
			var13 = var5 - (var5 >> 2) + (az_fld >> 2);
			var14 = az_fld >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		bm var15 = aw_fld[as_fld[var3]];
		int var16 = var15.ag_fld;
		int var17 = var15.az_fld[var16];
		bs var18 = ae_fld[var17].ae(var2, ag_fld);
		boolean var19 = !var18.ag();

		for (int var20 = 0; var20 < var15.ak_fld; var20++) {
			at var21 = ah_fld[var15.av_fld[var20]];
			float[] var22 = this.ac_fld;
			var21.ak(var22, var5 >> 1, var19, var2, ag_fld);
		}

		if (var18.ag()) {
			var16 = var15.ag_fld;
			var17 = var15.az_fld[var16];
			var18.ak(this.ac_fld, var5 >> 1);
		}

		if (!var18.ag()) {
			for (int var45 = var5 >> 1; var45 < var5; var45++) {
				this.ac_fld[var45] = 0.0F;
			}
		} else {
			int var46 = var5 >> 1;
			int var48 = var5 >> 2;
			int var51 = var5 >> 3;
			float[] var23 = this.ac_fld;

			for (int var24 = 0; var24 < var46; var24++) {
				var23[var24] *= 0.5F;
			}

			for (int var56 = var46; var56 < var5; var56++) {
				var23[var56] = -var23[var5 - var56 - 1];
			}

			float[] var57 = var4 ? ax_fld : af_fld;
			float[] var25 = var4 ? an_fld : al_fld;
			float[] var26 = var4 ? aa_fld : au_fld;
			int[] var27 = var4 ? aq_fld : ai_fld;

			for (int var28 = 0; var28 < var48; var28++) {
				float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
				float var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
				float var31 = var57[2 * var28];
				float var32 = var57[2 * var28 + 1];
				var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
			}

			for (int var58 = 0; var58 < var51; var58++) {
				float var60 = var23[var46 + 3 + 4 * var58];
				float var73 = var23[var46 + 1 + 4 * var58];
				float var79 = var23[4 * var58 + 3];
				float var83 = var23[4 * var58 + 1];
				var23[var46 + 3 + 4 * var58] = var60 + var79;
				var23[var46 + 1 + 4 * var58] = var73 + var83;
				float var33 = var57[var46 - 4 - 4 * var58];
				float var34 = var57[var46 - 3 - 4 * var58];
				var23[4 * var58 + 3] = (var60 - var79) * var33 - (var73 - var83) * var34;
				var23[4 * var58 + 1] = (var73 - var83) * var33 + (var60 - var79) * var34;
			}

			int var59 = gb.as(var5 - 1);

			for (int var61 = 0; var61 < var59 - 3; var61++) {
				int var74 = var5 >> var61 + 2;
				int var80 = 8 << var61;

				for (int var84 = 0; var84 < 2 << var61; var84++) {
					int var87 = var5 - var74 * 2 * var84;
					int var93 = var5 - var74 * (2 * var84 + 1);

					for (int var35 = 0; var35 < var5 >> var61 + 4; var35++) {
						int var36 = 4 * var35;
						float var37 = var23[var87 - 1 - var36];
						float var38 = var23[var87 - 3 - var36];
						float var39 = var23[var93 - 1 - var36];
						float var40 = var23[var93 - 3 - var36];
						var23[var87 - 1 - var36] = var37 + var39;
						var23[var87 - 3 - var36] = var38 + var40;
						float var41 = var57[var35 * var80];
						float var42 = var57[var35 * var80 + 1];
						var23[var93 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var93 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (int var62 = 1; var62 < var51 - 1; var62++) {
				int var75 = var27[var62];
				if (var62 < var75) {
					int var81 = 8 * var62;
					int var85 = 8 * var75;
					float var88 = var23[var81 + 1];
					var23[var81 + 1] = var23[var85 + 1];
					var23[var85 + 1] = var88;
					var88 = var23[var81 + 3];
					var23[var81 + 3] = var23[var85 + 3];
					var23[var85 + 3] = var88;
					var88 = var23[var81 + 5];
					var23[var81 + 5] = var23[var85 + 5];
					var23[var85 + 5] = var88;
					var88 = var23[var81 + 7];
					var23[var81 + 7] = var23[var85 + 7];
					var23[var85 + 7] = var88;
				}
			}

			for (int var63 = 0; var63 < var46; var63++) {
				var23[var63] = var23[2 * var63 + 1];
			}

			for (int var64 = 0; var64 < var51; var64++) {
				var23[var5 - 1 - 2 * var64] = var23[4 * var64];
				var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
				var23[var5 - var48 - 1 - 2 * var64] = var23[4 * var64 + 2];
				var23[var5 - var48 - 2 - 2 * var64] = var23[4 * var64 + 3];
			}

			for (int var65 = 0; var65 < var51; var65++) {
				float var76 = var26[2 * var65];
				float var82 = var26[2 * var65 + 1];
				float var86 = var23[var46 + 2 * var65];
				float var92 = var23[var46 + 2 * var65 + 1];
				float var94 = var23[var5 - 2 - 2 * var65];
				float var95 = var23[var5 - 1 - 2 * var65];
				float var96 = var82 * (var86 - var94) + var76 * (var92 + var95);
				var23[var46 + 2 * var65] = (var86 + var94 + var96) * 0.5F;
				var23[var5 - 2 - 2 * var65] = (var86 + var94 - var96) * 0.5F;
				var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
				var23[var46 + 2 * var65 + 1] = (var92 - var95 + var96) * 0.5F;
				var23[var5 - 1 - 2 * var65] = (-var92 + var95 + var96) * 0.5F;
			}

			for (int var66 = 0; var66 < var48; var66++) {
				var23[var66] = var23[2 * var66 + var46] * var25[2 * var66] + var23[2 * var66 + 1 + var46] * var25[2 * var66 + 1];
				var23[var46 - 1 - var66] = var23[2 * var66 + var46] * var25[2 * var66 + 1] - var23[2 * var66 + 1 + var46] * var25[2 * var66];
			}

			for (int var67 = 0; var67 < var48; var67++) {
				var23[var5 - var48 + var67] = -var23[var67];
			}

			for (int var68 = 0; var68 < var48; var68++) {
				var23[var68] = var23[var48 + var68];
			}

			for (int var69 = 0; var69 < var48; var69++) {
				var23[var48 + var69] = -var23[var48 - var69 - 1];
			}

			for (int var70 = 0; var70 < var48; var70++) {
				var23[var46 + var70] = var23[var5 - var70 - 1];
			}

			for (int var71 = var9; var71 < var10; var71++) {
				float var77 = (float)Math.sin((var71 - var9 + 0.5) / var11 * 0.5 * Math.PI);
				this.ac_fld[var71] = this.ac_fld[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
			}

			for (int var72 = var12; var72 < var13; var72++) {
				float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
				this.ac_fld[var72] = this.ac_fld[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
			}
		}

		float[] var47 = null;
		if (this.ap_fld > 0) {
			int var49 = this.ap_fld + var5 >> 2;
			var47 = new float[var49];
			if (!this.at_fld) {
				for (int var52 = 0; var52 < this.ab_fld; var52++) {
					int var54 = (this.ap_fld >> 1) + var52;
					var47[var52] += this.bz_fld[var54];
				}
			}

			if (var18.ag()) {
				for (int var53 = var9; var53 < var5 >> 1; var53++) {
					int var55 = var47.length - (var5 >> 1) + var53;
					var47[var55] += this.ac_fld[var53];
				}
			}
		}

		float[] var50 = this.bz_fld;
		this.bz_fld = this.ac_fld;
		this.ac_fld = var50;
		this.ap_fld = var5;
		this.ab_fld = var13 - (var5 >> 1);
		this.at_fld = !var18.ag();
		return var47;
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(Lbz;[B)V"
	)
	public static void rw(bz var0, byte[] var1) {
		if (var0 == null) {
			var0.getClass();
		}

		xi var2 = new xi(var1);
		var0.be_fld = var2.co((byte)-10);
		var0.bm_fld = var2.co((byte)-69);
		var0.ad_fld = var2.co((byte)2);
		var0.bs_fld = var2.co((byte)-81);
		if (var0.bs_fld < 0) {
			var0.bs_fld = ~var0.bs_fld;
			var0.bd_fld = true;
		}

		int var3 = var2.co((byte)-19);
		var0.am_fld = new byte[var3][];

		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.cg();
				var5 += var6;
			} while (var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.dh(var7, 0, var5);
			var0.am_fld[var4] = var7;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	static float ay(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & -2147483648;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)(var1 * Math.pow(2.0, var3 - 788));
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	static float as(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & -2147483648;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)(var1 * Math.pow(2.0, var3 - 788));
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] ad(int var1) {
		bh var2 = new bh();
		var2.az(this.am_fld[var1], 0);
		this.ac_fld = new float[av_fld];
		var2.ag();
		int var3 = var2.ak(gb.as(as_fld.length - 1), 1181137059);
		boolean var4 = ay_fld[var3];
		int var5 = var4 ? av_fld : az_fld;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.ag() != 0;
			var7 = var2.ag() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (az_fld >> 2);
			var10 = (var5 >> 2) + (az_fld >> 2);
			var11 = az_fld >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (az_fld >> 2);
			var13 = var5 - (var5 >> 2) + (az_fld >> 2);
			var14 = az_fld >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		bm var15 = aw_fld[as_fld[var3]];
		int var16 = var15.ag_fld;
		int var17 = var15.az_fld[var16];
		bs var18 = ae_fld[var17].ae(var2, ag_fld);
		boolean var19 = !var18.ag();

		for (int var20 = 0; var20 < var15.ak_fld; var20++) {
			at var21 = ah_fld[var15.av_fld[var20]];
			float[] var22 = this.ac_fld;
			var21.ak(var22, var5 >> 1, var19, var2, ag_fld);
		}

		if (var18.ag()) {
			var16 = var15.ag_fld;
			var17 = var15.az_fld[var16];
			var18.ak(this.ac_fld, var5 >> 1);
		}

		if (!var18.ag()) {
			for (int var45 = var5 >> 1; var45 < var5; var45++) {
				this.ac_fld[var45] = 0.0F;
			}
		} else {
			int var46 = var5 >> 1;
			int var48 = var5 >> 2;
			int var51 = var5 >> 3;
			float[] var23 = this.ac_fld;

			for (int var24 = 0; var24 < var46; var24++) {
				var23[var24] *= 0.5F;
			}

			for (int var56 = var46; var56 < var5; var56++) {
				var23[var56] = -var23[var5 - var56 - 1];
			}

			float[] var57 = var4 ? ax_fld : af_fld;
			float[] var25 = var4 ? an_fld : al_fld;
			float[] var26 = var4 ? aa_fld : au_fld;
			int[] var27 = var4 ? aq_fld : ai_fld;

			for (int var28 = 0; var28 < var48; var28++) {
				float var29 = var23[4 * var28] - var23[var5 - 4 * var28 - 1];
				float var30 = var23[4 * var28 + 2] - var23[var5 - 4 * var28 - 3];
				float var31 = var57[2 * var28];
				float var32 = var57[2 * var28 + 1];
				var23[var5 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
			}

			for (int var58 = 0; var58 < var51; var58++) {
				float var60 = var23[var46 + 3 + 4 * var58];
				float var73 = var23[var46 + 1 + 4 * var58];
				float var79 = var23[4 * var58 + 3];
				float var83 = var23[4 * var58 + 1];
				var23[var46 + 3 + 4 * var58] = var60 + var79;
				var23[var46 + 1 + 4 * var58] = var73 + var83;
				float var33 = var57[var46 - 4 - 4 * var58];
				float var34 = var57[var46 - 3 - 4 * var58];
				var23[4 * var58 + 3] = (var60 - var79) * var33 - (var73 - var83) * var34;
				var23[4 * var58 + 1] = (var73 - var83) * var33 + (var60 - var79) * var34;
			}

			int var59 = gb.as(var5 - 1);

			for (int var61 = 0; var61 < var59 - 3; var61++) {
				int var74 = var5 >> var61 + 2;
				int var80 = 8 << var61;

				for (int var84 = 0; var84 < 2 << var61; var84++) {
					int var87 = var5 - var74 * 2 * var84;
					int var93 = var5 - var74 * (2 * var84 + 1);

					for (int var35 = 0; var35 < var5 >> var61 + 4; var35++) {
						int var36 = 4 * var35;
						float var37 = var23[var87 - 1 - var36];
						float var38 = var23[var87 - 3 - var36];
						float var39 = var23[var93 - 1 - var36];
						float var40 = var23[var93 - 3 - var36];
						var23[var87 - 1 - var36] = var37 + var39;
						var23[var87 - 3 - var36] = var38 + var40;
						float var41 = var57[var35 * var80];
						float var42 = var57[var35 * var80 + 1];
						var23[var93 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var93 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (int var62 = 1; var62 < var51 - 1; var62++) {
				int var75 = var27[var62];
				if (var62 < var75) {
					int var81 = 8 * var62;
					int var85 = 8 * var75;
					float var88 = var23[var81 + 1];
					var23[var81 + 1] = var23[var85 + 1];
					var23[var85 + 1] = var88;
					var88 = var23[var81 + 3];
					var23[var81 + 3] = var23[var85 + 3];
					var23[var85 + 3] = var88;
					var88 = var23[var81 + 5];
					var23[var81 + 5] = var23[var85 + 5];
					var23[var85 + 5] = var88;
					var88 = var23[var81 + 7];
					var23[var81 + 7] = var23[var85 + 7];
					var23[var85 + 7] = var88;
				}
			}

			for (int var63 = 0; var63 < var46; var63++) {
				var23[var63] = var23[2 * var63 + 1];
			}

			for (int var64 = 0; var64 < var51; var64++) {
				var23[var5 - 1 - 2 * var64] = var23[4 * var64];
				var23[var5 - 2 - 2 * var64] = var23[4 * var64 + 1];
				var23[var5 - var48 - 1 - 2 * var64] = var23[4 * var64 + 2];
				var23[var5 - var48 - 2 - 2 * var64] = var23[4 * var64 + 3];
			}

			for (int var65 = 0; var65 < var51; var65++) {
				float var76 = var26[2 * var65];
				float var82 = var26[2 * var65 + 1];
				float var86 = var23[var46 + 2 * var65];
				float var92 = var23[var46 + 2 * var65 + 1];
				float var94 = var23[var5 - 2 - 2 * var65];
				float var95 = var23[var5 - 1 - 2 * var65];
				float var96 = var82 * (var86 - var94) + var76 * (var92 + var95);
				var23[var46 + 2 * var65] = (var86 + var94 + var96) * 0.5F;
				var23[var5 - 2 - 2 * var65] = (var86 + var94 - var96) * 0.5F;
				var96 = var82 * (var92 + var95) - var76 * (var86 - var94);
				var23[var46 + 2 * var65 + 1] = (var92 - var95 + var96) * 0.5F;
				var23[var5 - 1 - 2 * var65] = (-var92 + var95 + var96) * 0.5F;
			}

			for (int var66 = 0; var66 < var48; var66++) {
				var23[var66] = var23[2 * var66 + var46] * var25[2 * var66] + var23[2 * var66 + 1 + var46] * var25[2 * var66 + 1];
				var23[var46 - 1 - var66] = var23[2 * var66 + var46] * var25[2 * var66 + 1] - var23[2 * var66 + 1 + var46] * var25[2 * var66];
			}

			for (int var67 = 0; var67 < var48; var67++) {
				var23[var5 - var48 + var67] = -var23[var67];
			}

			for (int var68 = 0; var68 < var48; var68++) {
				var23[var68] = var23[var48 + var68];
			}

			for (int var69 = 0; var69 < var48; var69++) {
				var23[var48 + var69] = -var23[var48 - var69 - 1];
			}

			for (int var70 = 0; var70 < var48; var70++) {
				var23[var46 + var70] = var23[var5 - var70 - 1];
			}

			for (int var71 = var9; var71 < var10; var71++) {
				float var77 = (float)Math.sin((var71 - var9 + 0.5) / var11 * 0.5 * Math.PI);
				this.ac_fld[var71] = this.ac_fld[var71] * (float)Math.sin((Math.PI / 2) * var77 * var77);
			}

			for (int var72 = var12; var72 < var13; var72++) {
				float var78 = (float)Math.sin((var72 - var12 + 0.5) / var14 * 0.5 * Math.PI + (Math.PI / 2));
				this.ac_fld[var72] = this.ac_fld[var72] * (float)Math.sin((Math.PI / 2) * var78 * var78);
			}
		}

		float[] var47 = null;
		if (this.ap_fld > 0) {
			int var49 = this.ap_fld + var5 >> 2;
			var47 = new float[var49];
			if (!this.at_fld) {
				for (int var52 = 0; var52 < this.ab_fld; var52++) {
					int var54 = (this.ap_fld >> 1) + var52;
					var47[var52] += this.bz_fld[var54];
				}
			}

			if (var18.ag()) {
				for (int var53 = var9; var53 < var5 >> 1; var53++) {
					int var55 = var47.length - (var5 >> 1) + var53;
					var47[var55] += this.ac_fld[var53];
				}
			}
		}

		float[] var50 = this.bz_fld;
		this.bz_fld = this.ac_fld;
		this.ac_fld = var50;
		this.ap_fld = var5;
		this.ab_fld = var13 - (var5 >> 1);
		this.at_fld = !var18.ag();
		return var47;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	static float ak(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & -2147483648;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)(var1 * Math.pow(2.0, var3 - 788));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	static void al(byte[] var0) {
		bh var1 = ak_fld;
		var1.az(var0, 0);
		az_fld = 1 << var1.ak(4, 27152761);
		av_fld = 1 << var1.ak(4, 309783176);

		for (int var2 = 0; var2 < 2; var2++) {
			int var3 = var2 != 0 ? av_fld : az_fld;
			int var4 = var3 >> 1;
			int var5 = var3 >> 2;
			int var6 = var3 >> 3;
			float[] var7 = new float[var4];

			for (int var8 = 0; var8 < var5; var8++) {
				var7[2 * var8] = (float)Math.cos(4 * var8 * Math.PI / var3);
				var7[2 * var8 + 1] = -((float)Math.sin(4 * var8 * Math.PI / var3));
			}

			float[] var25 = new float[var4];

			for (int var9 = 0; var9 < var5; var9++) {
				var25[2 * var9] = (float)Math.cos((2 * var9 + 1) * Math.PI / (2 * var3));
				var25[2 * var9 + 1] = (float)Math.sin((2 * var9 + 1) * Math.PI / (2 * var3));
			}

			float[] var26 = new float[var5];

			for (int var10 = 0; var10 < var6; var10++) {
				var26[2 * var10] = (float)Math.cos((4 * var10 + 2) * Math.PI / var3);
				var26[2 * var10 + 1] = -((float)Math.sin((4 * var10 + 2) * Math.PI / var3));
			}

			int[] var27 = new int[var6];
			int var11 = gb.as(var6 - 1);

			for (int var12 = 0; var12 < var6; var12++) {
				var27[var12] = lj.ar(var12, var11);
			}

			if (var2 != 0) {
				ax_fld = var7;
				an_fld = var25;
				aa_fld = var26;
				aq_fld = var27;
			} else {
				af_fld = var7;
				al_fld = var25;
				au_fld = var26;
				ai_fld = var27;
			}
		}

		int var13 = var1.ak(8, 650220746) + 1;
		ag_fld = new bd[var13];

		for (int var14 = 0; var14 < var13; var14++) {
			ag_fld[var14] = new bd(ak_fld);
		}

		int var15 = var1.ak(6, -1415373823) + 1;

		for (int var17 = 0; var17 < var15; var17++) {
			var1.ak(16, 1114830492);
		}

		var15 = var1.ak(6, -348149143) + 1;
		ae_fld = new au[var15];

		for (int var18 = 0; var18 < var15; var18++) {
			ae_fld[var18] = new au(ak_fld);
		}

		int var19 = var1.ak(6, 779332288) + 1;
		ah_fld = new at[var19];

		for (int var20 = 0; var20 < var19; var20++) {
			ah_fld[var20] = new at(ak_fld);
		}

		int var21 = var1.ak(6, -580100520) + 1;
		aw_fld = new bm[var21];

		for (int var22 = 0; var22 < var21; var22++) {
			aw_fld[var22] = new bm(ak_fld);
		}

		int var23 = var1.ak(6, 333550606) + 1;
		ay_fld = new boolean[var23];
		as_fld = new int[var23];

		for (int var24 = 0; var24 < var23; var24++) {
			ay_fld[var24] = var1.ag() != 0;
			var1.ak(16, 107114116);
			var1.ak(16, -1692665541);
			as_fld[var24] = var1.ak(8, -1565019054);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	static void au(byte[] var0) {
		bh var1 = ak_fld;
		var1.az(var0, 0);
		az_fld = 1 << var1.ak(4, 158318087);
		av_fld = 1 << var1.ak(4, -1358536848);

		for (int var2 = 0; var2 < 2; var2++) {
			int var3 = var2 != 0 ? av_fld : az_fld;
			int var4 = var3 >> 1;
			int var5 = var3 >> 2;
			int var6 = var3 >> 3;
			float[] var7 = new float[var4];

			for (int var8 = 0; var8 < var5; var8++) {
				var7[2 * var8] = (float)Math.cos(4 * var8 * Math.PI / var3);
				var7[2 * var8 + 1] = -((float)Math.sin(4 * var8 * Math.PI / var3));
			}

			float[] var25 = new float[var4];

			for (int var9 = 0; var9 < var5; var9++) {
				var25[2 * var9] = (float)Math.cos((2 * var9 + 1) * Math.PI / (2 * var3));
				var25[2 * var9 + 1] = (float)Math.sin((2 * var9 + 1) * Math.PI / (2 * var3));
			}

			float[] var26 = new float[var5];

			for (int var10 = 0; var10 < var6; var10++) {
				var26[2 * var10] = (float)Math.cos((4 * var10 + 2) * Math.PI / var3);
				var26[2 * var10 + 1] = -((float)Math.sin((4 * var10 + 2) * Math.PI / var3));
			}

			int[] var27 = new int[var6];
			int var11 = gb.as(var6 - 1);

			for (int var12 = 0; var12 < var6; var12++) {
				var27[var12] = lj.ar(var12, var11);
			}

			if (var2 != 0) {
				ax_fld = var7;
				an_fld = var25;
				aa_fld = var26;
				aq_fld = var27;
			} else {
				af_fld = var7;
				al_fld = var25;
				au_fld = var26;
				ai_fld = var27;
			}
		}

		int var13 = var1.ak(8, 604482604) + 1;
		ag_fld = new bd[var13];

		for (int var14 = 0; var14 < var13; var14++) {
			ag_fld[var14] = new bd(ak_fld);
		}

		int var15 = var1.ak(6, -28938881) + 1;

		for (int var17 = 0; var17 < var15; var17++) {
			var1.ak(16, -471939447);
		}

		var15 = var1.ak(6, 936384945) + 1;
		ae_fld = new au[var15];

		for (int var18 = 0; var18 < var15; var18++) {
			ae_fld[var18] = new au(ak_fld);
		}

		int var19 = var1.ak(6, -997693596) + 1;
		ah_fld = new at[var19];

		for (int var20 = 0; var20 < var19; var20++) {
			ah_fld[var20] = new at(ak_fld);
		}

		int var21 = var1.ak(6, 749980480) + 1;
		aw_fld = new bm[var21];

		for (int var22 = 0; var22 < var21; var22++) {
			aw_fld[var22] = new bm(ak_fld);
		}

		int var23 = var1.ak(6, -176002603) + 1;
		ay_fld = new boolean[var23];
		as_fld = new int[var23];

		for (int var24 = 0; var24 < var23; var24++) {
			ay_fld[var24] = var1.ag() != 0;
			var1.ak(16, -541513643);
			var1.ak(16, 240666235);
			as_fld[var24] = var1.ak(8, 977640382);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lub;)Z"
	)
	static boolean ax(ub var0) throws EOFException {
		try {
			if (!ar_fld) {
				byte[] var1 = var0.bb(0, 0, 584982574);
				if (var1 == null) {
					return false;
				}

				ag(var1);
				ar_fld = true;
			}

			return true;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lbz;"
	)
	static bz an(ub var0, int var1, int var2) throws EOFException {
		try {
			if (!az(var0)) {
				var0.cc(var1, var2, 1731675041);
				return null;
			} else {
				byte[] var3 = var0.bb(var1, var2, 584982574);
				return var3 == null ? null : new bz(var3);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	static float af(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & -132737333;
		int var3 = (var0 & 1087557948) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)(var1 * Math.pow(2.0, var3 - -1283622794));
	}

	bz(byte[] var1) {
		this.ae(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lbz;"
	)
	static bz aa(ub var0, int var1, int var2) throws EOFException {
		try {
			if (!az(var0)) {
				var0.cc(var1, var2, -1332078071);
				return null;
			} else {
				byte[] var3 = var0.bb(var1, var2, 584982574);
				return var3 == null ? null : new bz(var3);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I)Lal;"
	)
	al aw(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.br_fld == null) {
				this.ap_fld = 0;
				this.bz_fld = new float[av_fld];
				this.br_fld = new short[this.bm_fld];
				this.aj_fld = 0;
				this.ao_fld = 0;
			}

			for (; this.ao_fld < this.am_fld.length; this.ao_fld++) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.ah(this.ao_fld);
				if (var2 != null) {
					int var3 = this.aj_fld;
					int var4 = var2.length;
					if (var4 > this.bm_fld - var3) {
						var4 = this.bm_fld - var3;
					}

					for (int var5 = 0; var5 < var4; var5++) {
						this.br_fld[var3++] = (short)og.al(-32768, 32767, (int)(var2[var5] * 32768.0F));
					}

					if (var1 != null) {
						var1[0] -= var3 - this.aj_fld;
					}

					this.aj_fld = var3;
				}
			}

			this.bz_fld = null;
			short[] var6 = this.br_fld;
			this.br_fld = null;
			return new al(this.be_fld, var6, this.ad_fld, this.bs_fld, this.bd_fld, false);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	static float ar(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & -2147483648;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)(var1 * Math.pow(2.0, var3 - 788));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([I)Lal;"
	)
	al ap(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.br_fld == null) {
				this.ap_fld = 0;
				this.bz_fld = new float[av_fld];
				this.br_fld = new short[this.bm_fld];
				this.aj_fld = 0;
				this.ao_fld = 0;
			}

			for (; this.ao_fld < this.am_fld.length; this.ao_fld++) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.ah(this.ao_fld);
				if (var2 != null) {
					int var3 = this.aj_fld;
					int var4 = var2.length;
					if (var4 > this.bm_fld - var3) {
						var4 = this.bm_fld - var3;
					}

					for (int var5 = 0; var5 < var4; var5++) {
						this.br_fld[var3++] = (short)og.al(-32768, 32767, (int)(var2[var5] * 32768.0F));
					}

					if (var1 != null) {
						var1[0] -= var3 - this.aj_fld;
					}

					this.aj_fld = var3;
				}
			}

			this.bz_fld = null;
			short[] var6 = this.br_fld;
			this.br_fld = null;
			return new al(this.be_fld, var6, this.ad_fld, this.bs_fld, this.bd_fld, false);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lbz;"
	)
	static bz av(ub var0, int var1, int var2) throws EOFException {
		try {
			if (!az(var0)) {
				var0.cc(var1, var2, 1886101145);
				return null;
			} else {
				byte[] var3 = var0.bb(var1, var2, 584982574);
				return var3 == null ? null : new bz(var3);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}
}
