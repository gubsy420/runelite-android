import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.EOFException;
import java.net.URI;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tx")
public class tx {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	static short[][][] al_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public static void az(String var0) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(var0));
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lbk;III)[I"
	)
	public static int[] iv(bk var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		ya.ar(bk.ag_fld, 0, var1);
		if (var2 < 10) {
			return bk.ag_fld;
		} else {
			double var4 = var1 / (var2 + 0.0);
			var0.al_fld.az();
			var0.au_fld.az();
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (var0.ax_fld != null) {
				var0.ax_fld.az();
				var0.an_fld.az();
				var6 = (int)((var0.ax_fld.ag_fld - var0.ax_fld.ak_fld) * 32.768 / var4);
				var7 = (int)(var0.ax_fld.ak_fld * 32.768 / var4);
			}

			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (var0.aa_fld != null) {
				var0.aa_fld.az();
				var0.ai_fld.az();
				var9 = (int)((var0.aa_fld.ag_fld - var0.aa_fld.ak_fld) * 32.768 / var4);
				var10 = (int)(var0.aa_fld.ak_fld * 32.768 / var4);
			}

			for (int var12 = 0; var12 < 5; var12++) {
				if (var0.ab_fld[var12] != 0) {
					bk.ae_fld[var12] = 0;
					bk.ah_fld[var12] = (int)(var0.ao_fld[var12] * var4);
					bk.aw_fld[var12] = (var0.ab_fld[var12] << 14) / 100;
					bk.ay_fld[var12] = (int)((var0.al_fld.ag_fld - var0.al_fld.ak_fld) * 32.768 * Math.pow(1.0057929410678534, var0.ad_fld[var12]) / var4);
					bk.as_fld[var12] = (int)(var0.al_fld.ak_fld * 32.768 / var4);
				}
			}

			for (int var20 = 0; var20 < var1; var20++) {
				int var13 = var0.al_fld.av(var1);
				int var14 = var0.au_fld.av(var1);
				if (var0.ax_fld != null) {
					int var15 = var0.ax_fld.av(var1);
					int var16 = var0.an_fld.av(var1);
					var13 += var0.ag(var8, var16, var0.ax_fld.az_fld) >> 1;
					var8 += (var15 * var6 >> 16) + var7;
				}

				if (var0.aa_fld != null) {
					int var32 = var0.aa_fld.av(var1);
					int var36 = var0.ai_fld.av(var1);
					var14 = var14 * ((var0.ag(var11, var36, var0.aa_fld.az_fld) >> 1) + 32768) >> 15;
					var11 += (var32 * var9 >> 16) + var10;
				}

				for (int var33 = 0; var33 < 5; var33++) {
					if (var0.ab_fld[var33] != 0) {
						int var37 = var20 + bk.ah_fld[var33];
						if (var37 < var1) {
							bk.ag_fld[var37] = bk.ag_fld[var37] + var0.ag(bk.ae_fld[var33], var14 * bk.aw_fld[var33] >> 15, var0.al_fld.az_fld);
							bk.ae_fld[var33] = bk.ae_fld[var33] + (var13 * bk.ay_fld[var33] >> 16) + bk.as_fld[var33];
						}
					}
				}
			}

			if (var0.aq_fld != null) {
				var0.aq_fld.az();
				var0.am_fld.az();
				short var21 = 0;
				boolean var26 = false;
				boolean var30 = true;

				for (int var34 = 0; var34 < var1; var34++) {
					int var38 = var0.aq_fld.av(var1);
					int var17 = var0.am_fld.av(var1);
					int var27;
					if (var30) {
						var27 = var0.aq_fld.ak_fld + ((var0.aq_fld.ag_fld - var0.aq_fld.ak_fld) * var38 >> 8);
					} else {
						var27 = var0.aq_fld.ak_fld + ((var0.aq_fld.ag_fld - var0.aq_fld.ak_fld) * var17 >> 8);
					}

					var21 += 256;
					if (var21 >= var27) {
						var21 = 0;
						var30 = !var30;
					}

					if (var30) {
						bk.ag_fld[var34] = 0;
					}
				}
			}

			if (var0.ap_fld > 0 && var0.at_fld > 0) {
				int var22 = (int)(var0.ap_fld * var4);

				for (int var28 = var22; var28 < var1; var28++) {
					bk.ag_fld[var28] = bk.ag_fld[var28] + bk.ag_fld[var28 - var22] * var0.at_fld / 100;
				}
			}

			if (var0.ac_fld.as_fld[0] > 0 || var0.ac_fld.as_fld[1] > 0) {
				var0.aj_fld.az();
				int var23 = var0.aj_fld.av(var1 + 1);
				int var29 = var0.ac_fld.av(0, var23 / 65536.0F, var3);
				int var31 = var0.ac_fld.av(1, var23 / 65536.0F, var3);
				if (var1 >= var29 + var31) {
					int var35 = 0;
					int var39 = var31;
					if (var31 > var1 - var29) {
						var39 = var1 - var29;
					}

					while (var35 < var39) {
						int var41 = (int)((long)bk.ag_fld[var35 + var29] * be.ay_fld >> 16);

						for (int var18 = 0; var18 < var29; var18++) {
							var41 += (int)((long)bk.ag_fld[var35 + var29 - 1 - var18] * be.ah_fld[0][var18] >> 16);
						}

						for (int var43 = 0; var43 < var35; var43++) {
							var41 -= (int)((long)bk.ag_fld[var35 - 1 - var43] * be.ah_fld[1][var43] >> 16);
						}

						bk.ag_fld[var35] = var41;
						var23 = var0.aj_fld.av(var1 + 1);
						var35++;
					}

					short var42 = 128;
					var39 = 128;

					while (true) {
						if (var39 > var1 - var29) {
							var39 = var1 - var29;
						}

						while (var35 < var39) {
							int var44 = (int)((long)bk.ag_fld[var35 + var29] * be.ay_fld >> 16);

							for (int var19 = 0; var19 < var29; var19++) {
								var44 += (int)((long)bk.ag_fld[var35 + var29 - 1 - var19] * be.ah_fld[0][var19] >> 16);
							}

							for (int var46 = 0; var46 < var31; var46++) {
								var44 -= (int)((long)bk.ag_fld[var35 - 1 - var46] * be.ah_fld[1][var46] >> 16);
							}

							bk.ag_fld[var35] = var44;
							var23 = var0.aj_fld.av(var1 + 1);
							var35++;
						}

						if (var35 >= var1 - var29) {
							while (var35 < var1) {
								int var45 = 0;

								for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
									var45 += (int)((long)bk.ag_fld[var35 + var29 - 1 - var47] * be.ah_fld[0][var47] >> 16);
								}

								for (int var48 = 0; var48 < var31; var48++) {
									var45 -= (int)((long)bk.ag_fld[var35 - 1 - var48] * be.ah_fld[1][var48] >> 16);
								}

								bk.ag_fld[var35] = var45;
								var23 = var0.aj_fld.av(var1 + 1);
								var35++;
							}
							break;
						}

						var29 = var0.ac_fld.av(0, var23 / 65536.0F, var3);
						var31 = var0.ac_fld.av(1, var23 / 65536.0F, var3);
						var39 += 128;
					}
				}
			}

			for (int var25 = 0; var25 < var1; var25++) {
				if (bk.ag_fld[var25] < -32768) {
					bk.ag_fld[var25] = -32768;
				}

				if (bk.ag_fld[var25] > 32767) {
					bk.ag_fld[var25] = 32767;
				}
			}

			return bk.ag_fld;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public static void ag(String var0) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(var0));
			} catch (Exception var2) {
			}
		}
	}

	tx() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldw;)Loo;"
	)
	public static oo ae(dw var0) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.as_fld;
	}

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)Lrx;"
	)
	public static rx zo(di var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 0 && var1 < var0.av_fld.length ? var0.av_fld[var1] : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public static void av(String var0) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(var0));
			} catch (Exception var2) {
			}
		}
	}
}
