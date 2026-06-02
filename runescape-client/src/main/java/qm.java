import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qm")
public class qm {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static qm ak_fld = new qm();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	static qm ag_fld = new qm();

	qm() {
	}

	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I[IIII)V"
	)
	public static void xh(fn var0, int var1, int[] var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		int var6 = var2.length;
		if (var1 == 0) {
			int var21 = 0;
			fn.bp_fld = 0;
			fn.bt_fld = 0;
			fn.bv_fld = 0;

			for (int var25 = 0; var25 < var6; var25++) {
				int var29 = var2[var25];
				if (var29 < var0.cu_fld.length) {
					int[] var33 = var0.cu_fld[var29];

					for (int var37 = 0; var37 < var33.length; var37++) {
						int var39 = var33[var37];
						fn.bp_fld = fn.bp_fld + (int)var0.yk_fld[var39];
						fn.bt_fld = fn.bt_fld + (int)var0.vr_fld[var39];
						fn.bv_fld = fn.bv_fld + (int)var0.qo_fld[var39];
						var21++;
					}
				}
			}

			if (var21 > 0) {
				fn.bp_fld = fn.bp_fld / var21 + var3;
				fn.bt_fld = fn.bt_fld / var21 + var4;
				fn.bv_fld = fn.bv_fld / var21 + var5;
			} else {
				fn.bp_fld = var3;
				fn.bt_fld = var4;
				fn.bv_fld = var5;
			}
		} else if (var1 == 1) {
			for (int var20 = 0; var20 < var6; var20++) {
				int var24 = var2[var20];
				if (var24 < var0.cu_fld.length) {
					int[] var28 = var0.cu_fld[var24];

					for (int var32 = 0; var32 < var28.length; var32++) {
						int var36 = var28[var32];
						var0.yk_fld[var36] = (int)var0.yk_fld[var36] + var3;
						var0.vr_fld[var36] = (int)var0.vr_fld[var36] + var4;
						var0.qo_fld[var36] = (int)var0.qo_fld[var36] + var5;
					}
				}
			}
		} else if (var1 == 2) {
			for (int var19 = 0; var19 < var6; var19++) {
				int var23 = var2[var19];
				if (var23 < var0.cu_fld.length) {
					int[] var27 = var0.cu_fld[var23];

					for (int var31 = 0; var31 < var27.length; var31++) {
						int var35 = var27[var31];
						var0.yk_fld[var35] = (int)var0.yk_fld[var35] - fn.bp_fld;
						var0.vr_fld[var35] = (int)var0.vr_fld[var35] - fn.bt_fld;
						var0.qo_fld[var35] = (int)var0.qo_fld[var35] - fn.bv_fld;
						int var38 = (var3 & 0xFF) * 8;
						int var13 = (var4 & 0xFF) * 8;
						int var14 = (var5 & 0xFF) * 8;
						if (var14 != 0) {
							int var15 = fn.ac_fld[var14];
							int var16 = fn.aj_fld[var14];
							int var17 = (int)var0.vr_fld[var35] * var15 + (int)var0.yk_fld[var35] * var16 >> 16;
							var0.vr_fld[var35] = (int)var0.vr_fld[var35] * var16 - (int)var0.yk_fld[var35] * var15 >> 16;
							var0.yk_fld[var35] = var17;
						}

						if (var38 != 0) {
							int var40 = fn.ac_fld[var38];
							int var42 = fn.aj_fld[var38];
							int var44 = (int)var0.vr_fld[var35] * var42 - (int)var0.qo_fld[var35] * var40 >> 16;
							var0.qo_fld[var35] = (int)var0.vr_fld[var35] * var40 + (int)var0.qo_fld[var35] * var42 >> 16;
							var0.vr_fld[var35] = var44;
						}

						if (var13 != 0) {
							int var41 = fn.ac_fld[var13];
							int var43 = fn.aj_fld[var13];
							int var45 = (int)var0.qo_fld[var35] * var41 + (int)var0.yk_fld[var35] * var43 >> 16;
							var0.qo_fld[var35] = (int)var0.qo_fld[var35] * var43 - (int)var0.yk_fld[var35] * var41 >> 16;
							var0.yk_fld[var35] = var45;
						}

						var0.yk_fld[var35] = (int)var0.yk_fld[var35] + fn.bp_fld;
						var0.vr_fld[var35] = (int)var0.vr_fld[var35] + fn.bt_fld;
						var0.qo_fld[var35] = (int)var0.qo_fld[var35] + fn.bv_fld;
					}
				}
			}
		} else if (var1 == 3) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var22 = var2[var18];
				if (var22 < var0.cu_fld.length) {
					int[] var26 = var0.cu_fld[var22];

					for (int var30 = 0; var30 < var26.length; var30++) {
						int var34 = var26[var30];
						var0.yk_fld[var34] = (int)var0.yk_fld[var34] - fn.bp_fld;
						var0.vr_fld[var34] = (int)var0.vr_fld[var34] - fn.bt_fld;
						var0.qo_fld[var34] = (int)var0.qo_fld[var34] - fn.bv_fld;
						var0.yk_fld[var34] = (int)var0.yk_fld[var34] * var3 / 128;
						var0.vr_fld[var34] = (int)var0.vr_fld[var34] * var4 / 128;
						var0.qo_fld[var34] = (int)var0.qo_fld[var34] * var5 / 128;
						var0.yk_fld[var34] = (int)var0.yk_fld[var34] + fn.bp_fld;
						var0.vr_fld[var34] = (int)var0.vr_fld[var34] + fn.bt_fld;
						var0.qo_fld[var34] = (int)var0.qo_fld[var34] + fn.bv_fld;
					}
				}
			}
		} else if (var1 == 5) {
			if (var0.ci_fld != null && var0.cv_fld != null) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = var2[var7];
					if (var8 < var0.ci_fld.length) {
						int[] var9 = var0.ci_fld[var8];

						for (int var10 = 0; var10 < var9.length; var10++) {
							int var11 = var9[var10];
							int var12 = (var0.cv_fld[var11] & 255) + var3 * 8;
							if (var12 < 0) {
								var12 = 0;
							} else if (var12 > 255) {
								var12 = 255;
							}

							var0.cv_fld[var11] = (byte)var12;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean av(int var0) {
		return 0 != (var0 & 128);
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	static void hh(xi var0) {
		if (client.lr_fld != null) {
			xi.pm(var0, client.lr_fld, 0, client.lr_fld.length);
		} else {
			byte[] var2 = bv.ae((byte)-21);
			xi.pm(var0, var2, 0, var2.length);
		}
	}
}
