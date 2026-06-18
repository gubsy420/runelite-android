import java.awt.event.FocusEvent;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yu")
public class yu extends vc {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ai_fld = 0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public static float[] an_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld = 0;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aq_fld = 0;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float af_fld;

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	protected static void du(int[] var0, int var1, int var2, float[] var3) {
		al_fld = var0;
		au_fld = var1;
		ax_fld = var2;
		an_fld = var3;
		dg(0, 0, var1, var2);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void ex(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 0xFF) * var4;
			int var7 = (var3 >> 8 & 0xFF) * var4;
			int var8 = (var3 & 0xFF) * var4;
			int var12 = var0 + var1 * au_fld;

			for (int var13 = 0; var13 < var2; var13++) {
				int var9 = (al_fld[var12] >> 16 & 0xFF) * var5;
				int var10 = (al_fld[var12] >> 8 & 0xFF) * var5;
				int var11 = (al_fld[var12] & 0xFF) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				client.no(al_fld, var12++, var14, var4);
			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[BIZ)V"
	)
	public static void gc(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
		if (var0 + var2 >= 0 && var1 + var3 >= 0) {
			if (var0 < au_fld && var1 < ax_fld) {
				int var9 = 0;
				int var10 = 0;
				if (var0 < 0) {
					var9 -= var0;
					var2 += var0;
				}

				if (var1 < 0) {
					var10 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > au_fld) {
					var2 = au_fld - var0;
				}

				if (var1 + var3 > ax_fld) {
					var3 = ax_fld - var1;
				}

				int var11 = var6.length / var7;
				int var12 = au_fld - var2;
				int var13 = var4 >>> 24;
				int var14 = var5 >>> 24;
				if (var8 && (var13 != 1198604149 || var14 != -1621146016)) {
					int var25 = (var1 + var10) * au_fld + var0 + var9;

					for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
						for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
							int var28 = (var26 - var1) % var11;
							int var29 = (var27 - var0) % var7;
							int var20 = var4;
							if (var6[var28 * var7 + var29] != 0) {
								var20 = var5;
							}

							int var21 = var20 >>> 24;
							int var22 = 255 - var21;
							int var23 = al_fld[var25];
							int var24 = ((var20 & 1881668407) * var21 + (var23 & 16711935) * var22 & -15038462)
									+ ((var20 & 1296001171) * var21 + (var23 & -1318551276) * var22 & 0xFF0000)
								>> 8;
							al_fld[var25++] = var24;
						}

						var25 += var12;
					}
				} else {
					int var15 = (var1 + var10) * au_fld + var0 + var9;

					for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
						for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
							int var18 = (var16 - var1) % var11;
							int var19 = (var17 - var0) % var7;
							if (var6[var18 * var7 + var19] != 0) {
								al_fld[var15++] = var5;
							} else {
								al_fld[var15++] = var4;
							}
						}

						var15 += var12;
					}
				}
			}
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void dg(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > au_fld) {
			var2 = au_fld;
		}

		if (var3 > ax_fld) {
			var3 = ax_fld;
		}

		aq_fld = var0;
		aa_fld = var1;
		am_fld = var2;
		ai_fld = var3;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void hd(int var0, int var1, int var2, int var3, int var4, int var5) {
		var5 |= -16777216;
		if (var4 <= 1) {
			ez(var0, var1, var2, var3, var5);
		} else {
			int var6 = var4 / 2;
			int var7 = var4 - var6;
			int var8 = var2 - var0;
			int var9 = var3 - var1;
			if (var9 == 0) {
				int var30 = var0;
				int var34 = var2;
				if (var0 > var2) {
					var30 = var2;
					var34 = var0;
				}

				int var44 = var1 - var6;
				int var50 = var1 + var7;
				var44 = Math.max(var44, aa_fld);
				var50 = Math.min(var50, ai_fld - 1);
				if (var44 <= var50) {
					var30 = Math.max(var30, aq_fld);
					var34 = Math.min(var34, am_fld - 1);
					if (var30 <= var34) {
						for (int var55 = var44; var55 <= var50; var55++) {
							ew(var30, var55, var34 - var30 + 1, var5);
						}
					}
				}
			} else if (var8 == 0) {
				int var28 = var1;
				int var32 = var3;
				if (var1 > var3) {
					var28 = var3;
					var32 = var1;
				}

				int var42 = var0 - var6;
				int var48 = var0 + var7;
				var42 = Math.max(var42, aq_fld);
				var48 = Math.min(var48, am_fld - 1);
				if (var42 <= var48) {
					var28 = Math.max(var28, aa_fld);
					var32 = Math.min(var32, ai_fld - 1);
					if (var28 <= var32) {
						for (int var54 = var42; var54 <= var48; var54++) {
							eo(var54, var28, var32 - var28 + 1, var5);
						}
					}
				}
			} else {
				int var10 = Math.abs(var8);
				int var11 = Math.abs(var9);
				if (var10 == var11) {
					int var41 = var8 >= 0 ? 1 : -1;
					int var47 = var9 >= 0 ? 1 : -1;
					int var53 = -var47;
					int var57 = var41;
					int var59 = var0;
					int var61 = var1;

					for (int var63 = 0; var63 <= var10; var63++) {
						for (int var65 = -var6; var65 <= var7 - 1; var65++) {
							int var20 = var53 * var65;
							int var21 = var57 * var65;
							eg(var59 + var20, var61 + var21, var5);
							boolean var22 = (var63 & 1) != 0;
							if (var22) {
								eg(var59 + var20 + 1, var61 + var21, var5);
							}

							eg(var59 + var20 + var41, var61 + var21, var5);
						}

						var59 += var41;
						var61 += var47;
					}
				} else {
					if (var10 >= var11) {
						if (var2 < var0) {
							int var12 = var0;
							var0 = var2;
							var2 = var12;
							var12 = var1;
							var1 = var3;
							var3 = var12;
						}

						var8 = var2 - var0;
						var9 = var3 - var1;
						int var37 = (var1 << 16) + 32768;
						int var14 = var9 << 16;
						int var13;
						if (var14 >= 0) {
							var13 = (var8 / 2 + var14) / var8;
						} else {
							var13 = -((var8 / 2 + -var14) / var8);
						}

						int var15 = var13;
						int var16 = var0;
						if (var0 < aq_fld) {
							var37 += var13 * (aq_fld - var0);
							var16 = aq_fld;
						}

						int var17 = Math.min(var2, am_fld - 1);

						for (int var18 = var16; var18 <= var17; var18++) {
							int var19 = var37 >> 16;
							en(var18, var19, var6, var7, var5);
							var37 += var15;
						}
					} else {
						if (var3 < var1) {
							int var38 = var0;
							var0 = var2;
							var2 = var38;
							var38 = var1;
							var1 = var3;
							var3 = var38;
						}

						var8 = var2 - var0;
						var9 = var3 - var1;
						int var40 = (var0 << 16) + 32768;
						int var52 = var8 << 16;
						int var46;
						if (var52 >= 0) {
							var46 = (var52 + var9 / 2) / var9;
						} else {
							var46 = -((var9 / 2 + -var52) / var9);
						}

						int var56 = var46;
						int var58 = var1;
						if (var1 < aa_fld) {
							var40 += var46 * (aa_fld - var1);
							var58 = aa_fld;
						}

						int var60 = Math.min(var3, ai_fld - 1);

						for (int var62 = var58; var62 <= var60; var62++) {
							int var64 = var40 >> 16;
							er(var64, var62, var6, var7, var5);
							var40 += var56;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public static void dy(int[] var0) {
		var0[0] = aq_fld;
		var0[1] = aa_fld;
		var0[2] = am_fld;
		var0[3] = ai_fld;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void ew(int var0, int var1, int var2, int var3) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var4 = var0 + var1 * au_fld;

			for (int var5 = 0; var5 < var2; var5++) {
				al_fld[var4 + var5] = var3 | 0xFF000000;
			}
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public static void fv(int[] var0) {
		var0[0] = aq_fld;
		var0[1] = aa_fld;
		var0[2] = am_fld;
		var0[3] = ai_fld;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void df(int var0, int var1, int var2, int var3) {
		if (var2 == 0) {
			eq(var0, var1, var3);
		} else {
			if (var2 < 0) {
				var2 = -var2;
			}

			int var4 = var1 - var2;
			if (var4 < aa_fld) {
				var4 = aa_fld;
			}

			int var5 = var1 + var2 + 1;
			if (var5 > ai_fld) {
				var5 = ai_fld;
			}

			int var6 = var4;
			int var7 = var2 * var2;
			int var8 = 0;
			int var9 = var1 - var4;
			int var10 = var9 * var9;
			int var11 = var10 - var9;
			if (var1 > var5) {
				var1 = var5;
			}

			while (var6 < var1) {
				while (var11 <= var7 || var10 <= var7) {
					var10 += var8 + var8;
					var11 += var8++ + var8;
				}

				int var12 = var0 - var8 + 1;
				if (var12 < aq_fld) {
					var12 = aq_fld;
				}

				int var13 = var0 + var8;
				if (var13 > am_fld) {
					var13 = am_fld;
				}

				int var14 = var12 + var6 * au_fld;

				for (int var15 = var12; var15 < var13; var15++) {
					al_fld[var14++] = var3 | 0xFF000000;
				}

				var6++;
				var10 -= var9-- + var9;
				var11 -= var9 + var9;
			}

			var8 = var2;
			var9 = var6 - var1;
			var11 = var9 * var9 + var7;
			var10 = var11 - var2;

			for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
				while (var20 > var7 && var10 > var7) {
					var20 -= var8-- + var8;
					var10 -= var8 + var8;
				}

				int var21 = var0 - var8;
				if (var21 < aq_fld) {
					var21 = aq_fld;
				}

				int var22 = var0 + var8;
				if (var22 > am_fld - 1) {
					var22 = am_fld - 1;
				}

				int var23 = var21 + var6 * au_fld;

				for (int var24 = var21; var24 <= var22; var24++) {
					al_fld[var23++] = var3 | 0xFF000000;
				}

				var6++;
				var20 += var9 + var9;
			}
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void de(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) {
			if (var4 == 256) {
				df(var0, var1, var2, var3);
			} else {
				if (var2 < 0) {
					var2 = -var2;
				}

				int var5 = 256 - var4;
				int var6 = (var3 >> 16 & 0xFF) * var4;
				int var7 = (var3 >> 8 & 0xFF) * var4;
				int var8 = (var3 & 0xFF) * var4;
				int var12 = var1 - var2;
				if (var12 < aa_fld) {
					var12 = aa_fld;
				}

				int var13 = var1 + var2 + 1;
				if (var13 > ai_fld) {
					var13 = ai_fld;
				}

				int var14 = var12;
				int var15 = var2 * var2;
				int var16 = 0;
				int var17 = var1 - var12;
				int var18 = var17 * var17;
				int var19 = var18 - var17;
				if (var1 > var13) {
					var1 = var13;
				}

				while (var14 < var1) {
					while (var19 <= var15 || var18 <= var15) {
						var18 += var16 + var16;
						var19 += var16++ + var16;
					}

					int var20 = var0 - var16 + 1;
					if (var20 < aq_fld) {
						var20 = aq_fld;
					}

					int var21 = var0 + var16;
					if (var21 > am_fld) {
						var21 = am_fld;
					}

					int var22 = var20 + var14 * au_fld;

					for (int var23 = var20; var23 < var21; var23++) {
						int var9 = (al_fld[var22] >> 16 & 0xFF) * var5;
						int var10 = (al_fld[var22] >> 8 & 0xFF) * var5;
						int var11 = (al_fld[var22] & 0xFF) * var5;
						int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
						client.no(al_fld, var22++, var24, var4);
					}

					var14++;
					var18 -= var17-- + var17;
					var19 -= var17 + var17;
				}

				var16 = var2;
				var17 = -var17;
				var19 = var17 * var17 + var15;
				var18 = var19 - var2;

				for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
					while (var32 > var15 && var18 > var15) {
						var32 -= var16-- + var16;
						var18 -= var16 + var16;
					}

					int var33 = var0 - var16;
					if (var33 < aq_fld) {
						var33 = aq_fld;
					}

					int var34 = var0 + var16;
					if (var34 > am_fld - 1) {
						var34 = am_fld - 1;
					}

					int var35 = var33 + var14 * au_fld;

					for (int var36 = var33; var36 <= var34; var36++) {
						int var25 = (al_fld[var35] >> 16 & 0xFF) * var5;
						int var26 = (al_fld[var35] >> 8 & 0xFF) * var5;
						int var27 = (al_fld[var35] & 0xFF) * var5;
						int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
						client.no(al_fld, var35++, var37, var4);
					}

					var14++;
					var32 += var17 + var17;
				}
			}
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void dp(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < aq_fld) {
			var2 -= aq_fld - var0;
			var0 = aq_fld;
		}

		if (var1 < aa_fld) {
			var3 -= aa_fld - var1;
			var1 = aa_fld;
		}

		if (var0 + var2 > am_fld) {
			var2 = am_fld - var0;
		}

		if (var1 + var3 > ai_fld) {
			var3 = ai_fld - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 0xFF00) * var5 >> 8 & 0xFF00);
		int var6 = 256 - var5;
		int var7 = au_fld - var2;
		int var8 = var0 + var1 * au_fld;

		for (int var9 = 0; var9 < var3; var9++) {
			for (int var10 = -var2; var10 < 0; var10++) {
				int var11 = al_fld[var8];
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 0xFF00) * var6 >> 8 & 0xFF00);
				client.no(al_fld, var8++, var4 + var11, var5);
			}

			var8 += var7;
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void dj(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < aq_fld) {
			var2 -= aq_fld - var0;
			var0 = aq_fld;
		}

		if (var1 < aa_fld) {
			var3 -= aa_fld - var1;
			var1 = aa_fld;
		}

		if (var0 + var2 > am_fld) {
			var2 = am_fld - var0;
		}

		if (var1 + var3 > ai_fld) {
			var3 = ai_fld - var1;
		}

		int var5 = au_fld - var2;
		int var6 = var0 + var1 * au_fld;

		for (int var7 = -var3; var7 < 0; var7++) {
			for (int var8 = -var2; var8 < 0; var8++) {
				al_fld[var6++] = var4 | 0xFF000000;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void es(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) {
			int var6 = 0;
			int var7 = 65536 / var3;
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var1 < aa_fld) {
				var6 += (aa_fld - var1) * var7;
				var3 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			if (var1 + var3 > ai_fld) {
				var3 = ai_fld - var1;
			}

			int var8 = au_fld - var2;
			int var9 = var0 + var1 * au_fld;

			for (int var10 = -var3; var10 < 0; var10++) {
				int var11 = 65536 - var6 >> 8;
				int var12 = var6 >> 8;
				int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 0xFF00) * var11 + (var5 & 0xFF00) * var12 & 0xFF0000) >>> 8;

				for (int var14 = -var2; var14 < 0; var14++) {
					al_fld[var9++] = var13 | 0xFF000000;
				}

				var9 += var8;
				var6 += var7;
			}
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public static void ep(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = au_fld;
		int var9 = aq_fld;
		int var10 = aa_fld;
		int var11 = am_fld;
		int var12 = ai_fld;
		int[] var13 = al_fld;
		if (!og.ci_fld.isGpu()) {
			int var34 = var7;
			int var33 = var6;
			int var32 = var5;
			int var31 = var4;
			int var30 = var3;
			int var29 = var2;
			int var28 = var1;
			int var27 = var0;
			if (var2 > 0 && var3 > 0) {
				int var35 = 0;
				int var36 = 65536 / var3;
				if (var0 < aq_fld) {
					var29 = var2 - (aq_fld - var0);
					var27 = aq_fld;
				}

				if (var1 < aa_fld) {
					var35 += (aa_fld - var1) * var36;
					var30 = var3 - (aa_fld - var1);
					var28 = aa_fld;
				}

				if (var27 + var29 > am_fld) {
					var29 = am_fld - var27;
				}

				if (var28 + var30 > ai_fld) {
					var30 = ai_fld - var28;
				}

				int var37 = au_fld - var29;
				int var38 = var27 + var28 * au_fld;

				for (int var39 = -var30; var39 < 0; var39++) {
					int var40 = 65536 - var35 >> 8;
					int var41 = var35 >> 8;
					int var42 = (var33 * var40 + var34 * var41 & 0xFF00) >>> 8;
					if (var42 == 0) {
						var38 += au_fld;
						var35 += var36;
					} else {
						int var43 = ((var31 & 16711935) * var40 + (var32 & 16711935) * var41 & -16711936) + ((var31 & 0xFF00) * var40 + (var32 & 0xFF00) * var41 & 0xFF0000)
							>>> 8;
						int var44 = 255 - var42;
						int var45 = ((var43 & 16711935) * var42 >> 8 & 16711935) + ((var43 & 0xFF00) * var42 >> 8 & 0xFF00);

						for (int var46 = -var29; var46 < 0; var46++) {
							int var47 = al_fld[var38];
							if (var47 == 0) {
								al_fld[var38++] = var45;
							} else {
								var47 = ((var47 & 16711935) * var44 >> 8 & 16711935) + ((var47 & 0xFF00) * var44 >> 8 & 0xFF00);
								al_fld[var38++] = var45 + var47;
							}
						}

						var38 += var37;
						var35 += var36;
					}
				}
			}
		} else {
			if (var2 > 0 && var3 > 0) {
				int var14 = 0;
				int var15 = 65536 / var3;
				if (var0 < var9) {
					var2 -= var9 - var0;
					var0 = var9;
				}

				if (var1 < var10) {
					var14 += (var10 - var1) * var15;
					var3 -= var10 - var1;
					var1 = var10;
				}

				if (var0 + var2 > var11) {
					var2 = var11 - var0;
				}

				if (var3 + var1 > var12) {
					var3 = var12 - var1;
				}

				int var16 = var8 - var2;
				int var17 = var0 + var8 * var1;

				for (int var18 = -var3; var18 < 0; var18++) {
					int var19 = 65536 - var14 >> 8;
					int var20 = var14 >> 8;
					int var21 = (var19 * var6 + var20 * var7 & 0xFF00) >>> 8;
					if (var21 == 0) {
						var17 += var8;
						var14 += var15;
					} else {
						int var22 = (var20 * (var5 & 16711935) + var19 * (var4 & 16711935) & -16711936) + (var20 * (var5 & 0xFF00) + var19 * (var4 & 0xFF00) & 0xFF0000) >>> 8;
						int var23 = 255 - var21;
						int var24 = ((var22 & 16711935) * var21 >> 8 & 16711935) + (var21 * (var22 & 0xFF00) >> 8 & 0xFF00);

						for (int var25 = -var2; var25 < 0; var25++) {
							int var26 = var13[var17];
							var26 = ((var26 & 16711935) * var23 >> 8 & 16711935) + (var23 * (var26 & 0xFF00) >> 8 & 0xFF00);
							client.no(var13, var17++, var24 + var26, var21);
						}

						var17 += var16;
						var14 += var15;
					}
				}
			}
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[BIZ)V"
	)
	public static void eb(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
		int var9 = au_fld;
		int var10 = ax_fld;
		int[] var11 = al_fld;
		if (!og.ci_fld.isGpu()) {
			int var35 = var7;
			byte[] var34 = var6;
			int var33 = var5;
			int var32 = var4;
			int var31 = var3;
			int var30 = var2;
			int var29 = var1;
			int var28 = var0;
			boolean var36 = true;
			if (var0 + var2 >= 0 && var1 + var3 >= 0 && var0 < au_fld && var1 < ax_fld) {
				int var37 = 0;
				int var38 = 0;
				if (var0 < 0) {
					var37 -= var0;
					var30 = var2 + var0;
				}

				if (var1 < 0) {
					var38 -= var1;
					var31 = var3 + var1;
				}

				if (var0 + var30 > au_fld) {
					var30 = au_fld - var0;
				}

				if (var1 + var31 > ax_fld) {
					var31 = ax_fld - var1;
				}

				int var39 = var6.length / var7;
				int var40 = au_fld - var30;
				int var41 = var4 >>> 24;
				int var42 = var5 >>> 24;
				if (var36 && (var41 != 255 || var42 != 255)) {
					int var58 = (var1 + var38) * au_fld + var0 + var37;

					for (int var59 = var1 + var38; var59 < var29 + var38 + var31; var59++) {
						for (int var60 = var28 + var37; var60 < var28 + var37 + var30; var60++) {
							int var61 = (var59 - var29) % var39;
							int var62 = (var60 - var28) % var35;
							int var48 = var32;
							if (var34[var61 * var35 + var62] != 0) {
								var48 = var33;
							}

							int var49 = var48 >>> 24;
							int var50 = 255 - var49;
							int var51 = al_fld[var58];
							int var52 = ((var48 & 16711935) * var49 + (var51 & 16711935) * var50 & -16711936) + ((var48 & 0xFF00) * var49 + (var51 & 0xFF00) * var50 & 0xFF0000)
								>> 8;
							al_fld[var58++] = var52;
						}

						var58 += var40;
					}
				} else {
					int var43 = (var1 + var38) * au_fld + var0 + var37;

					for (int var44 = var1 + var38; var44 < var29 + var38 + var31; var44++) {
						for (int var45 = var28 + var37; var45 < var28 + var37 + var30; var45++) {
							int var46 = (var44 - var29) % var39;
							int var47 = (var45 - var28) % var35;
							if (var34[var46 * var35 + var47] != 0) {
								al_fld[var43++] = var33;
							} else {
								al_fld[var43++] = var32;
							}
						}

						var43 += var40;
					}
				}
			}
		} else {
			if (var0 + var2 >= 0 && var3 + var1 >= 0 && var0 < var9 && var1 < var10) {
				int var12 = 0;
				int var13 = 0;
				if (var0 < 0) {
					var12 -= var0;
					var2 += var0;
				}

				if (var1 < 0) {
					var13 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > var9) {
					var2 = var9 - var0;
				}

				if (var3 + var1 > var10) {
					var3 = var10 - var1;
				}

				int var14 = var6.length / var7;
				int var15 = var9 - var2;
				int var16 = var4 >>> 24;
				int var17 = var5 >>> 24;
				if (var16 == 255 && var17 == 255) {
					int var53 = var0 + var12 + (var13 + var1) * var9;

					for (int var54 = var13 + var1; var54 < var3 + var13 + var1; var54++) {
						for (int var55 = var0 + var12; var55 < var0 + var12 + var2; var55++) {
							int var56 = (var54 - var1) % var14;
							int var57 = (var55 - var0) % var7;
							if (var6[var57 + var56 * var7] != 0) {
								var11[var53++] = var5;
							} else {
								var11[var53++] = var4;
							}
						}

						var53 += var15;
					}
				} else {
					int var18 = var0 + var12 + (var13 + var1) * var9;

					for (int var19 = var13 + var1; var19 < var3 + var13 + var1; var19++) {
						for (int var20 = var0 + var12; var20 < var0 + var12 + var2; var20++) {
							int var21 = (var19 - var1) % var14;
							int var22 = (var20 - var0) % var7;
							int var23 = var4;
							if (var6[var22 + var21 * var7] != 0) {
								var23 = var5;
							}

							int var24 = var23 >>> 24;
							int var25 = 255 - var24;
							int var26 = var11[var18];
							int var27 = ((var23 & 16711935) * var24 + (var26 & 16711935) * var25 & -16711936) + (var24 * (var23 & 0xFF00) + var25 * (var26 & 0xFF00) & 0xFF0000)
								>> 8;
							client.no(var11, var18++, var27, var24);
						}

						var18 += var15;
					}
				}
			}
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void hh(int var0, int var1, int var2) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 >= aq_fld && var0 < am_fld) {
				al_fld[var0 + var1 * au_fld] = var2;
			}
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void et(int var0, int var1, int var2, int var3, int var4, int var5) {
		ex(var0, var1, var2, var4, var5);
		ex(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			ec(var0, var1 + 1, var3 - 2, var4, var5);
			ec(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void fh() {
		int var0 = 0;

		int var1;
		for (var1 = au_fld * ax_fld - 7; var0 < var1; al_fld[var0++] = 0) {
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
		}

		var1 += 7;

		while (var0 < var1) {
			al_fld[var0++] = 0;
		}

		ee();
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void dw(int var0, int var1, int var2, int var3) {
		if (aq_fld < var0) {
			aq_fld = var0;
		}

		if (aa_fld < var1) {
			aa_fld = var1;
		}

		if (am_fld > var2) {
			am_fld = var2;
		}

		if (ai_fld > var3) {
			ai_fld = var3;
		}
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/FocusEvent;)V"
	)
	public static void ss(tf var0, FocusEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}

		tf.rl_fld = true;
		var0.si_fld = true;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void eo(int var0, int var1, int var2, int var3) {
		if (var0 >= aq_fld && var0 < am_fld) {
			if (var1 < aa_fld) {
				var2 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var1 + var2 > ai_fld) {
				var2 = ai_fld - var1;
			}

			int var4 = var0 + var1 * au_fld;

			for (int var5 = 0; var5 < var2; var5++) {
				al_fld[var4 + var5 * au_fld] = var3 | 0xFF000000;
			}
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void dn() {
		int var0 = 0;

		int var1;
		for (var1 = au_fld * ax_fld - 7; var0 < var1; al_fld[var0++] = 0) {
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
		}

		var1 += 7;

		while (var0 < var1) {
			al_fld[var0++] = 0;
		}

		ee();
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void hf(int var0, int var1, int var2) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 >= aq_fld && var0 < am_fld) {
				al_fld[var0 + var1 * au_fld] = var2;
			}
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	protected static void em(int[] var0, int var1, int var2, float[] var3) {
		al_fld = var0;
		au_fld = var1;
		ax_fld = var2;
		an_fld = var3;
		dg(0, 0, var1, var2);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void en(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= aq_fld && var0 < am_fld) {
			int var5 = var1 - var2;
			int var6 = var1 + var3;
			var5 = Math.max(var5, aa_fld);
			var6 = Math.min(var6, ai_fld - 1);
			if (var5 <= var6) {
				eo(var0, var5, var6 - var5 + 1, var4);
			}
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void eg(int var0, int var1, int var2) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 >= aq_fld && var0 < am_fld) {
				al_fld[var0 + var1 * au_fld] = var2;
			}
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void eq(int var0, int var1, int var2) {
		if (var0 >= aq_fld && var1 >= aa_fld && var0 < am_fld && var1 < ai_fld) {
			al_fld[var0 + var1 * au_fld] = var2 | 0xFF000000;
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void gs(int var0, int var1, int var2, int var3) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var4 = var0 + var1 * au_fld;

			for (int var5 = 0; var5 < var2; var5++) {
				al_fld[var4 + var5] = var3;
			}
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(III[I[I)V"
	)
	public static void ei(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * au_fld;

		for (int var8 = 0; var8 < var3.length; var8++) {
			int var6 = var5 + var3[var8];

			for (int var7 = -var4[var8]; var7 < 0; var7++) {
				al_fld[var6++] = var2 | 0xFF000000;
			}

			var5 += au_fld;
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ee() {
		if (!og.ci_fld.isGpu() && an_fld != null) {
			if (aq_fld == 0 && am_fld == au_fld && aa_fld == 0 && ai_fld == ax_fld) {
				int var16 = an_fld.length;
				int var17 = var16 - (var16 & 7);

				int var18;
				for (var18 = 0; var18 < var17; an_fld[var18++] = 0.0F) {
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
				}

				while (var18 < var16) {
					an_fld[var18++] = 0.0F;
				}
			} else {
				int var0 = am_fld - aq_fld;
				int var1 = ai_fld - aa_fld;
				int var2 = au_fld - var0;
				int var3 = aq_fld + aa_fld * au_fld;
				int var4 = var0 >> 3;
				int var5 = var0 & 7;
				var0 = var3 - 1;

				for (int var7 = -var1; var7 < 0; var7++) {
					if (var4 > 0) {
						int var6 = var4;

						do {
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
						} while (--var6 > 0);
					}

					if (var5 > 0) {
						int var26 = var5;

						do {
							an_fld[++var0] = 0.0F;
						} while (--var26 > 0);
					}

					var0 += var2;
				}
			}
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ek() {
		if (an_fld != null) {
			int var0 = an_fld.length;

			for (int var1 = 0; var1 < var0; var1++) {
				if (var1 % au_fld < au_fld / 2 && an_fld[var1] > 0.0F) {
					int var2 = (int)(255.0F * ai.ae(an_fld[var1]));
					al_fld[var1] = var2 << 16 | var2 << 8 | var2;
				}
			}
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	protected static void ea(int[] var0, int var1, int var2, float[] var3) {
		al_fld = var0;
		au_fld = var1;
		ax_fld = var2;
		an_fld = var3;
		dg(0, 0, var1, var2);
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	protected static void ev(int[] var0, int var1, int var2, float[] var3) {
		al_fld = var0;
		au_fld = var1;
		ax_fld = var2;
		an_fld = var3;
		dg(0, 0, var1, var2);
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	protected static void ey(int[] var0, int var1, int var2, float[] var3) {
		al_fld = var0;
		au_fld = var1;
		ax_fld = var2;
		an_fld = var3;
		dg(0, 0, var1, var2);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void hj(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			int var5 = var0 - var2;
			int var6 = var0 + var3;
			var5 = Math.max(var5, aq_fld);
			var6 = Math.min(var6, am_fld - 1);
			if (var5 <= var6) {
				ew(var5, var1, var6 - var5 + 1, var4);
			}
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void el() {
		aq_fld = 0;
		aa_fld = 0;
		am_fld = au_fld;
		ai_fld = ax_fld;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void gm(int var0, int var1, int var2, int var3) {
		if (var0 >= aq_fld && var0 < am_fld) {
			if (var1 < aa_fld) {
				var2 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var1 + var2 > ai_fld) {
				var2 = ai_fld - var1;
			}

			int var4 = var0 + var1 * au_fld;

			for (int var5 = 0; var5 < var2; var5++) {
				al_fld[var4 + var5 * au_fld] = var3;
			}
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void eu() {
		aq_fld = 0;
		aa_fld = 0;
		am_fld = au_fld;
		ai_fld = ax_fld;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void hb(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= aq_fld && var0 < am_fld) {
			int var5 = var1 - var2;
			int var6 = var1 + var3;
			var5 = Math.max(var5, aa_fld);
			var6 = Math.min(var6, ai_fld - 1);
			if (var5 <= var6) {
				eo(var0, var5, var6 - var5 + 1, var4);
			}
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void fy(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > au_fld) {
			var2 = au_fld;
		}

		if (var3 > ax_fld) {
			var3 = ax_fld;
		}

		aq_fld = var0;
		aa_fld = var1;
		am_fld = var2;
		ai_fld = var3;
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public static void fp(int[] var0) {
		var0[0] = aq_fld;
		var0[1] = aa_fld;
		var0[2] = am_fld;
		var0[3] = ai_fld;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void fo(int var0, int var1, int var2, int var3) {
		if (aq_fld < var0) {
			aq_fld = var0;
		}

		if (aa_fld < var1) {
			aa_fld = var1;
		}

		if (am_fld > var2) {
			am_fld = var2;
		}

		if (ai_fld > var3) {
			ai_fld = var3;
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void ec(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= aq_fld && var0 < am_fld) {
			if (var1 < aa_fld) {
				var2 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var1 + var2 > ai_fld) {
				var2 = ai_fld - var1;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 0xFF) * var4;
			int var7 = (var3 >> 8 & 0xFF) * var4;
			int var8 = (var3 & 0xFF) * var4;
			int var12 = var0 + var1 * au_fld;

			for (int var13 = 0; var13 < var2; var13++) {
				int var9 = (al_fld[var12] >> 16 & 0xFF) * var5;
				int var10 = (al_fld[var12] >> 8 & 0xFF) * var5;
				int var11 = (al_fld[var12] & 0xFF) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				client.no(al_fld, var12, var14, var4);
				var12 += au_fld;
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public static void fx(int[] var0) {
		var0[0] = aq_fld;
		var0[1] = aa_fld;
		var0[2] = am_fld;
		var0[3] = ai_fld;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void ed(int var0, int var1, int var2, int var3, int var4) {
		ew(var0, var1, var2, var4);
		ew(var0, var1 + var3 - 1, var2, var4);
		eo(var0, var1, var3, var4);
		eo(var0 + var2 - 1, var1, var3, var4);
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public static void fj(int[] var0) {
		aq_fld = var0[0];
		aa_fld = var0[1];
		am_fld = var0[2];
		ai_fld = var0[3];
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void fl(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) {
			if (var4 == 256) {
				df(var0, var1, var2, var3);
			} else {
				if (var2 < 0) {
					var2 = -var2;
				}

				int var5 = 256 - var4;
				int var6 = (var3 >> 16 & 0xFF) * var4;
				int var7 = (var3 >> 8 & 0xFF) * var4;
				int var8 = (var3 & 0xFF) * var4;
				int var12 = var1 - var2;
				if (var12 < aa_fld) {
					var12 = aa_fld;
				}

				int var13 = var1 + var2 + 1;
				if (var13 > ai_fld) {
					var13 = ai_fld;
				}

				int var14 = var12;
				int var15 = var2 * var2;
				int var16 = 0;
				int var17 = var1 - var12;
				int var18 = var17 * var17;
				int var19 = var18 - var17;
				if (var1 > var13) {
					var1 = var13;
				}

				while (var14 < var1) {
					while (var19 <= var15 || var18 <= var15) {
						var18 += var16 + var16;
						var19 += var16++ + var16;
					}

					int var20 = var0 - var16 + 1;
					if (var20 < aq_fld) {
						var20 = aq_fld;
					}

					int var21 = var0 + var16;
					if (var21 > am_fld) {
						var21 = am_fld;
					}

					int var22 = var20 + var14 * au_fld;

					for (int var23 = var20; var23 < var21; var23++) {
						int var9 = (al_fld[var22] >> 16 & 0xFF) * var5;
						int var10 = (al_fld[var22] >> 8 & 0xFF) * var5;
						int var11 = (al_fld[var22] & 0xFF) * var5;
						int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
						al_fld[var22++] = var24;
					}

					var14++;
					var18 -= var17-- + var17;
					var19 -= var17 + var17;
				}

				var16 = var2;
				var17 = -var17;
				var19 = var17 * var17 + var15;
				var18 = var19 - var2;

				for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
					while (var32 > var15 && var18 > var15) {
						var32 -= var16-- + var16;
						var18 -= var16 + var16;
					}

					int var33 = var0 - var16;
					if (var33 < aq_fld) {
						var33 = aq_fld;
					}

					int var34 = var0 + var16;
					if (var34 > am_fld - 1) {
						var34 = am_fld - 1;
					}

					int var35 = var33 + var14 * au_fld;

					for (int var36 = var33; var36 <= var34; var36++) {
						int var25 = (al_fld[var35] >> 16 & 0xFF) * var5;
						int var26 = (al_fld[var35] >> 8 & 0xFF) * var5;
						int var27 = (al_fld[var35] & 0xFF) * var5;
						int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
						al_fld[var35++] = var37;
					}

					var14++;
					var32 += var17 + var17;
				}
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void gl(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			int var5 = var0 - var2;
			int var6 = var0 + var3;
			var5 = Math.max(var5, aq_fld);
			var6 = Math.min(var6, am_fld - 1);
			if (var5 <= var6) {
				ew(var5, var1, var6 - var5 + 1, var4);
			}
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void fc() {
		int var0 = 0;

		int var1;
		for (var1 = au_fld * ax_fld - 7; var0 < var1; al_fld[var0++] = 0) {
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
		}

		var1 += 7;

		while (var0 < var1) {
			al_fld[var0++] = 0;
		}

		ee();
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public static void fi(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var1 < aa_fld) {
				var8 += (aa_fld - var1) * var9;
				var3 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			if (var1 + var3 > ai_fld) {
				var3 = ai_fld - var1;
			}

			int var10 = au_fld - var2;
			int var11 = var0 + var1 * au_fld;

			for (int var12 = -var3; var12 < 0; var12++) {
				int var13 = 65536 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var6 * var13 + var7 * var14 & 0xFF00) >>> 8;
				if (var15 == 0) {
					var11 += au_fld;
					var8 += var9;
				} else {
					int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 0xFF00) * var13 + (var5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
					int var17 = 255 - var15;
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);

					for (int var19 = -var2; var19 < 0; var19++) {
						int var20 = al_fld[var11];
						if (var20 == 0) {
							al_fld[var11++] = var18;
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
							al_fld[var11++] = var18 + var20;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void fm(int var0, int var1, int var2, int var3) {
		if (var2 == 0) {
			eq(var0, var1, var3);
		} else {
			if (var2 < 0) {
				var2 = -var2;
			}

			int var4 = var1 - var2;
			if (var4 < aa_fld) {
				var4 = aa_fld;
			}

			int var5 = var1 + var2 + 1;
			if (var5 > ai_fld) {
				var5 = ai_fld;
			}

			int var6 = var4;
			int var7 = var2 * var2;
			int var8 = 0;
			int var9 = var1 - var4;
			int var10 = var9 * var9;
			int var11 = var10 - var9;
			if (var1 > var5) {
				var1 = var5;
			}

			while (var6 < var1) {
				while (var11 <= var7 || var10 <= var7) {
					var10 += var8 + var8;
					var11 += var8++ + var8;
				}

				int var12 = var0 - var8 + 1;
				if (var12 < aq_fld) {
					var12 = aq_fld;
				}

				int var13 = var0 + var8;
				if (var13 > am_fld) {
					var13 = am_fld;
				}

				int var14 = var12 + var6 * au_fld;

				for (int var15 = var12; var15 < var13; var15++) {
					al_fld[var14++] = var3;
				}

				var6++;
				var10 -= var9-- + var9;
				var11 -= var9 + var9;
			}

			var8 = var2;
			var9 = var6 - var1;
			var11 = var9 * var9 + var7;
			var10 = var11 - var2;

			for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
				while (var20 > var7 && var10 > var7) {
					var20 -= var8-- + var8;
					var10 -= var8 + var8;
				}

				int var21 = var0 - var8;
				if (var21 < aq_fld) {
					var21 = aq_fld;
				}

				int var22 = var0 + var8;
				if (var22 > am_fld - 1) {
					var22 = am_fld - 1;
				}

				int var23 = var21 + var6 * au_fld;

				for (int var24 = var21; var24 <= var22; var24++) {
					al_fld[var23++] = var3;
				}

				var6++;
				var20 += var9 + var9;
			}
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	static void fe(int var0, int var1, int var2, int var3) {
		if (var2 == 0) {
			eq(var0, var1, var3);
		} else {
			if (var2 < 0) {
				var2 = -var2;
			}

			int var4 = var1 - var2;
			if (var4 < aa_fld) {
				var4 = aa_fld;
			}

			int var5 = var1 + var2 + 1;
			if (var5 > ai_fld) {
				var5 = ai_fld;
			}

			int var6 = var4;
			int var7 = var2 * var2;
			int var8 = 0;
			int var9 = var1 - var4;
			int var10 = var9 * var9;
			int var11 = var10 - var9;
			if (var1 > var5) {
				var1 = var5;
			}

			while (var6 < var1) {
				while (var11 <= var7 || var10 <= var7) {
					var10 += var8 + var8;
					var11 += var8++ + var8;
				}

				int var12 = var0 - var8 + 1;
				if (var12 < aq_fld) {
					var12 = aq_fld;
				}

				int var13 = var0 + var8;
				if (var13 > am_fld) {
					var13 = am_fld;
				}

				int var14 = var12 + var6 * au_fld;

				for (int var15 = var12; var15 < var13; var15++) {
					al_fld[var14++] = var3;
				}

				var6++;
				var10 -= var9-- + var9;
				var11 -= var9 + var9;
			}

			var8 = var2;
			var9 = var6 - var1;
			var11 = var9 * var9 + var7;
			var10 = var11 - var2;

			for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
				while (var20 > var7 && var10 > var7) {
					var20 -= var8-- + var8;
					var10 -= var8 + var8;
				}

				int var21 = var0 - var8;
				if (var21 < aq_fld) {
					var21 = aq_fld;
				}

				int var22 = var0 + var8;
				if (var22 > am_fld - 1) {
					var22 = am_fld - 1;
				}

				int var23 = var21 + var6 * au_fld;

				for (int var24 = var21; var24 <= var22; var24++) {
					al_fld[var23++] = var3;
				}

				var6++;
				var20 += var9 + var9;
			}
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void fw(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) {
			if (var4 == 256) {
				df(var0, var1, var2, var3);
			} else {
				if (var2 < 0) {
					var2 = -var2;
				}

				int var5 = 256 - var4;
				int var6 = (var3 >> 16 & -613362560) * var4;
				int var7 = (var3 >> 8 & 0xFF) * var4;
				int var8 = (var3 & 0xFF) * var4;
				int var12 = var1 - var2;
				if (var12 < aa_fld) {
					var12 = aa_fld;
				}

				int var13 = var1 + var2 + 1;
				if (var13 > ai_fld) {
					var13 = ai_fld;
				}

				int var14 = var12;
				int var15 = var2 * var2;
				int var16 = 0;
				int var17 = var1 - var12;
				int var18 = var17 * var17;
				int var19 = var18 - var17;
				if (var1 > var13) {
					var1 = var13;
				}

				while (var14 < var1) {
					while (var19 <= var15 || var18 <= var15) {
						var18 += var16 + var16;
						var19 += var16++ + var16;
					}

					int var20 = var0 - var16 + 1;
					if (var20 < aq_fld) {
						var20 = aq_fld;
					}

					int var21 = var0 + var16;
					if (var21 > am_fld) {
						var21 = am_fld;
					}

					int var22 = var20 + var14 * au_fld;

					for (int var23 = var20; var23 < var21; var23++) {
						int var9 = (al_fld[var22] >> 16 & 1868468119) * var5;
						int var10 = (al_fld[var22] >> 8 & 0xFF) * var5;
						int var11 = (al_fld[var22] & 778194812) * var5;
						int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
						al_fld[var22++] = var24;
					}

					var14++;
					var18 -= var17-- + var17;
					var19 -= var17 + var17;
				}

				var16 = var2;
				var17 = -var17;
				var19 = var17 * var17 + var15;
				var18 = var19 - var2;

				for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
					while (var32 > var15 && var18 > var15) {
						var32 -= var16-- + var16;
						var18 -= var16 + var16;
					}

					int var33 = var0 - var16;
					if (var33 < aq_fld) {
						var33 = aq_fld;
					}

					int var34 = var0 + var16;
					if (var34 > am_fld - 1) {
						var34 = am_fld - 1;
					}

					int var35 = var33 + var14 * au_fld;

					for (int var36 = var33; var36 <= var34; var36++) {
						int var25 = (al_fld[var35] >> 16 & 0xFF) * var5;
						int var26 = (al_fld[var35] >> 8 & 1457511912) * var5;
						int var27 = (al_fld[var35] & 0xFF) * var5;
						int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
						al_fld[var35++] = var37;
					}

					var14++;
					var32 += var17 + var17;
				}
			}
		}
	}

	protected yu() {
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void fg(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < aq_fld) {
			var2 -= aq_fld - var0;
			var0 = aq_fld;
		}

		if (var1 < aa_fld) {
			var3 -= aa_fld - var1;
			var1 = aa_fld;
		}

		if (var0 + var2 > am_fld) {
			var2 = am_fld - var0;
		}

		if (var1 + var3 > ai_fld) {
			var3 = ai_fld - var1;
		}

		int var5 = au_fld - var2;
		int var6 = var0 + var1 * au_fld;

		for (int var7 = -var3; var7 < 0; var7++) {
			for (int var8 = -var2; var8 < 0; var8++) {
				al_fld[var6++] = var4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void fn(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < aq_fld) {
			var2 -= aq_fld - var0;
			var0 = aq_fld;
		}

		if (var1 < aa_fld) {
			var3 -= aa_fld - var1;
			var1 = aa_fld;
		}

		if (var0 + var2 > am_fld) {
			var2 = am_fld - var0;
		}

		if (var1 + var3 > ai_fld) {
			var3 = ai_fld - var1;
		}

		int var5 = au_fld - var2;
		int var6 = var0 + var1 * au_fld;

		for (int var7 = -var3; var7 < 0; var7++) {
			for (int var8 = -var2; var8 < 0; var8++) {
				al_fld[var6++] = var4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void ft(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) {
			int var6 = 0;
			int var7 = 65536 / var3;
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var1 < aa_fld) {
				var6 += (aa_fld - var1) * var7;
				var3 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			if (var1 + var3 > ai_fld) {
				var3 = ai_fld - var1;
			}

			int var8 = au_fld - var2;
			int var9 = var0 + var1 * au_fld;

			for (int var10 = -var3; var10 < 0; var10++) {
				int var11 = 65536 - var6 >> 8;
				int var12 = var6 >> 8;
				int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 0xFF00) * var11 + (var5 & -1994488851) * var12 & 1139718622)
					>>> 8;

				for (int var14 = -var2; var14 < 0; var14++) {
					al_fld[var9++] = var13;
				}

				var9 += var8;
				var6 += var7;
			}
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void fd(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) {
			int var6 = 0;
			int var7 = 65536 / var3;
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var1 < aa_fld) {
				var6 += (aa_fld - var1) * var7;
				var3 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			if (var1 + var3 > ai_fld) {
				var3 = ai_fld - var1;
			}

			int var8 = au_fld - var2;
			int var9 = var0 + var1 * au_fld;

			for (int var10 = -var3; var10 < 0; var10++) {
				int var11 = 65536 - var6 >> 8;
				int var12 = var6 >> 8;
				int var13 = ((var4 & -1056089082) * var11 + (var5 & -331004932) * var12 & -16711936)
						+ ((var4 & 100353201) * var11 + (var5 & 384018532) * var12 & -997198010)
					>>> 8;

				for (int var14 = -var2; var14 < 0; var14++) {
					al_fld[var9++] = var13;
				}

				var9 += var8;
				var6 += var7;
			}
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public static void fq(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var1 < aa_fld) {
				var8 += (aa_fld - var1) * var9;
				var3 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			if (var1 + var3 > ai_fld) {
				var3 = ai_fld - var1;
			}

			int var10 = au_fld - var2;
			int var11 = var0 + var1 * au_fld;

			for (int var12 = -var3; var12 < 0; var12++) {
				int var13 = 1744847613 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var6 * var13 + var7 * var14 & -2126638791) >>> 8;
				if (var15 == 0) {
					var11 += au_fld;
					var8 += var9;
				} else {
					int var16 = ((var4 & -581455248) * var13 + (var5 & 16711935) * var14 & 1518939487) + ((var4 & 1484309885) * var13 + (var5 & 0xFF00) * var14 & 839897906)
						>>> 8;
					int var17 = -735168830 - var15;
					int var18 = ((var16 & -423989105) * var15 >> 8 & 16711935) + ((var16 & 1685945445) * var15 >> 8 & 0xFF00);

					for (int var19 = -var2; var19 < 0; var19++) {
						int var20 = al_fld[var11];
						if (var20 == 0) {
							al_fld[var11++] = var18;
						} else {
							var20 = ((var20 & -71988247) * var17 >> 8 & 1052565490) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
							al_fld[var11++] = var18 + var20;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public static void fs(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var1 < aa_fld) {
				var8 += (aa_fld - var1) * var9;
				var3 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			if (var1 + var3 > ai_fld) {
				var3 = ai_fld - var1;
			}

			int var10 = au_fld - var2;
			int var11 = var0 + var1 * au_fld;

			for (int var12 = -var3; var12 < 0; var12++) {
				int var13 = -2086563547 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var6 * var13 + var7 * var14 & -717578531) >>> 8;
				if (var15 == 0) {
					var11 += au_fld;
					var8 += var9;
				} else {
					int var16 = ((var4 & -1732056549) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 0xFF00) * var13 + (var5 & -1348331542) * var14 & 0xFF0000)
						>>> 8;
					int var17 = 255 - var15;
					int var18 = ((var16 & -145732563) * var15 >> 8 & 16711935) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);

					for (int var19 = -var2; var19 < 0; var19++) {
						int var20 = al_fld[var11];
						if (var20 == 0) {
							al_fld[var11++] = var18;
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 0xFF00) * var17 >> 8 & -527256811);
							al_fld[var11++] = var18 + var20;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public static void fu(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var1 < aa_fld) {
				var8 += (aa_fld - var1) * var9;
				var3 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			if (var1 + var3 > ai_fld) {
				var3 = ai_fld - var1;
			}

			int var10 = au_fld - var2;
			int var11 = var0 + var1 * au_fld;

			for (int var12 = -var3; var12 < 0; var12++) {
				int var13 = 65536 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var6 * var13 + var7 * var14 & 0xFF00) >>> 8;
				if (var15 == 0) {
					var11 += au_fld;
					var8 += var9;
				} else {
					int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 0xFF00) * var13 + (var5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
					int var17 = 255 - var15;
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);

					for (int var19 = -var2; var19 < 0; var19++) {
						int var20 = al_fld[var11];
						if (var20 == 0) {
							al_fld[var11++] = var18;
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
							al_fld[var11++] = var18 + var20;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public static void fr(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = -1410612766 / var3;
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var1 < aa_fld) {
				var8 += (aa_fld - var1) * var9;
				var3 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			if (var1 + var3 > ai_fld) {
				var3 = ai_fld - var1;
			}

			int var10 = au_fld - var2;
			int var11 = var0 + var1 * au_fld;

			for (int var12 = -var3; var12 < 0; var12++) {
				int var13 = 1384936238 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var6 * var13 + var7 * var14 & 0xFF00) >>> 8;
				if (var15 == 0) {
					var11 += au_fld;
					var8 += var9;
				} else {
					int var16 = ((var4 & 16711935) * var13 + (var5 & -1563496131) * var14 & -16711936) + ((var4 & 0xFF00) * var13 + (var5 & 1383360502) * var14 & 0xFF0000)
						>>> 8;
					int var17 = 1736461757 - var15;
					int var18 = ((var16 & 16711935) * var15 >> 8 & -197316126) + ((var16 & 0xFF00) * var15 >> 8 & -415885779);

					for (int var19 = -var2; var19 < 0; var19++) {
						int var20 = al_fld[var11];
						if (var20 == 0) {
							al_fld[var11++] = var18;
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 708285507) + ((var20 & 1849439313) * var17 >> 8 & 0xFF00);
							al_fld[var11++] = var18 + var20;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void ez(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				ew(var0, var1, var2 + 1, var4);
			} else {
				ew(var0 + var2, var1, -var2 + 1, var4);
			}
		} else if (var2 == 0) {
			if (var3 >= 0) {
				eo(var0, var1, var3 + 1, var4);
			} else {
				eo(var0, var1 + var3, -var3 + 1, var4);
			}
		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			if (var2 > var3) {
				var1 <<= 16;
				var1 += 32768;
				var3 <<= 16;
				int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
				var2 += var0;
				if (var0 < aq_fld) {
					var1 += var5 * (aq_fld - var0);
					var0 = aq_fld;
				}

				if (var2 >= am_fld) {
					var2 = am_fld - 1;
				}

				while (var0 <= var2) {
					int var6 = var1 >> 16;
					if (var6 >= aa_fld && var6 < ai_fld) {
						al_fld[var0 + var6 * au_fld] = var4 | 0xFF000000;
					}

					var1 += var5;
					var0++;
				}
			} else {
				var0 <<= 16;
				var0 += 32768;
				var2 <<= 16;
				int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
				var3 += var1;
				if (var1 < aa_fld) {
					var0 += var17 * (aa_fld - var1);
					var1 = aa_fld;
				}

				if (var3 >= ai_fld) {
					var3 = ai_fld - 1;
				}

				while (var1 <= var3) {
					int var18 = var0 >> 16;
					if (var18 >= aq_fld && var18 < am_fld) {
						al_fld[var18 + var1 * au_fld] = var4 | 0xFF000000;
					}

					var0 += var17;
					var1++;
				}
			}
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[BIZ)V"
	)
	public static void fz(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
		if (var0 + var2 >= 0 && var1 + var3 >= 0) {
			if (var0 < au_fld && var1 < ax_fld) {
				int var9 = 0;
				int var10 = 0;
				if (var0 < 0) {
					var9 -= var0;
					var2 += var0;
				}

				if (var1 < 0) {
					var10 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > au_fld) {
					var2 = au_fld - var0;
				}

				if (var1 + var3 > ax_fld) {
					var3 = ax_fld - var1;
				}

				int var11 = var6.length / var7;
				int var12 = au_fld - var2;
				int var13 = var4 >>> 24;
				int var14 = var5 >>> 24;
				if (!var8 || var13 == 551604902 && var14 == 255) {
					int var25 = (var1 + var10) * au_fld + var0 + var9;

					for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
						for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
							int var28 = (var26 - var1) % var11;
							int var29 = (var27 - var0) % var7;
							if (var6[var28 * var7 + var29] != 0) {
								al_fld[var25++] = var5;
							} else {
								al_fld[var25++] = var4;
							}
						}

						var25 += var12;
					}
				} else {
					int var15 = (var1 + var10) * au_fld + var0 + var9;

					for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
						for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
							int var18 = (var16 - var1) % var11;
							int var19 = (var17 - var0) % var7;
							int var20 = var4;
							if (var6[var18 * var7 + var19] != 0) {
								var20 = var5;
							}

							int var21 = var20 >>> 24;
							int var22 = 255 - var21;
							int var23 = al_fld[var15];
							int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -1907903395)
									+ ((var20 & 494130359) * var21 + (var23 & -46387639) * var22 & 0xFF0000)
								>> 8;
							al_fld[var15++] = var24;
						}

						var15 += var12;
					}
				}
			}
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void fk() {
		int var0 = 0;

		int var1;
		for (var1 = au_fld * ax_fld - 7; var0 < var1; al_fld[var0++] = 0) {
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
			al_fld[var0++] = 0;
		}

		var1 += 7;

		while (var0 < var1) {
			al_fld[var0++] = 0;
		}

		ee();
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void gk(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 0xFF) * var4;
			int var7 = (var3 >> 8 & 0xFF) * var4;
			int var8 = (var3 & 0xFF) * var4;
			int var12 = var0 + var1 * au_fld;

			for (int var13 = 0; var13 < var2; var13++) {
				int var9 = (al_fld[var12] >> 16 & 0xFF) * var5;
				int var10 = (al_fld[var12] >> 8 & 0xFF) * var5;
				int var11 = (al_fld[var12] & 0xFF) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				al_fld[var12++] = var14;
			}
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void ej(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > au_fld) {
			var2 = au_fld;
		}

		if (var3 > ax_fld) {
			var3 = ax_fld;
		}

		aq_fld = var0;
		aa_fld = var1;
		am_fld = var2;
		ai_fld = var3;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void go(int var0, int var1, int var2, int var3, int var4) {
		ew(var0, var1, var2, var4);
		ew(var0, var1 + var3 - 1, var2, var4);
		eo(var0, var1, var3, var4);
		eo(var0 + var2 - 1, var1, var3, var4);
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void hp(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= aq_fld && var0 < am_fld) {
			int var5 = var1 - var2;
			int var6 = var1 + var3;
			var5 = Math.max(var5, aa_fld);
			var6 = Math.min(var6, ai_fld - 1);
			if (var5 <= var6) {
				eo(var0, var5, var6 - var5 + 1, var4);
			}
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void gh(int var0, int var1, int var2, int var3, int var4, int var5) {
		ex(var0, var1, var2, var4, var5);
		ex(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			ec(var0, var1 + 1, var3 - 2, var4, var5);
			ec(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void gb(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				ew(var0, var1, var2 + 1, var4);
			} else {
				ew(var0 + var2, var1, -var2 + 1, var4);
			}
		} else if (var2 == 0) {
			if (var3 >= 0) {
				eo(var0, var1, var3 + 1, var4);
			} else {
				eo(var0, var1 + var3, -var3 + 1, var4);
			}
		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			if (var2 > var3) {
				var1 <<= 16;
				var1 += 32768;
				var3 <<= 16;
				int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
				var2 += var0;
				if (var0 < aq_fld) {
					var1 += var5 * (aq_fld - var0);
					var0 = aq_fld;
				}

				if (var2 >= am_fld) {
					var2 = am_fld - 1;
				}

				while (var0 <= var2) {
					int var6 = var1 >> 16;
					if (var6 >= aa_fld && var6 < ai_fld) {
						al_fld[var0 + var6 * au_fld] = var4;
					}

					var1 += var5;
					var0++;
				}
			} else {
				var0 <<= 16;
				var0 += 32768;
				var2 <<= 16;
				int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
				var3 += var1;
				if (var1 < aa_fld) {
					var0 += var17 * (aa_fld - var1);
					var1 = aa_fld;
				}

				if (var3 >= ai_fld) {
					var3 = ai_fld - 1;
				}

				while (var1 <= var3) {
					int var18 = var0 >> 16;
					if (var18 >= aq_fld && var18 < am_fld) {
						al_fld[var18 + var1 * au_fld] = var4;
					}

					var0 += var17;
					var1++;
				}
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void gj(int var0, int var1, int var2, int var3, int var4, int var5) {
		ex(var0, var1, var2, var4, var5);
		ex(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			ec(var0, var1 + 1, var3 - 2, var4, var5);
			ec(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void gt(int var0, int var1, int var2, int var3) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var4 = var0 + var1 * au_fld;

			for (int var5 = 0; var5 < var2; var5++) {
				al_fld[var4 + var5] = var3;
			}
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public static void di(int[] var0) {
		aq_fld = var0[0];
		aa_fld = var0[1];
		am_fld = var0[2];
		ai_fld = var0[3];
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void gu(int var0, int var1, int var2, int var3) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var4 = var0 + var1 * au_fld;

			for (int var5 = 0; var5 < var2; var5++) {
				al_fld[var4 + var5] = var3;
			}
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void gp(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 0xFF) * var4;
			int var7 = (var3 >> 8 & 0xFF) * var4;
			int var8 = (var3 & 0xFF) * var4;
			int var12 = var0 + var1 * au_fld;

			for (int var13 = 0; var13 < var2; var13++) {
				int var9 = (al_fld[var12] >> 16 & 0xFF) * var5;
				int var10 = (al_fld[var12] >> 8 & 0xFF) * var5;
				int var11 = (al_fld[var12] & 0xFF) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				al_fld[var12++] = var14;
			}
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void gv(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var5 = -772554983 - var4;
			int var6 = (var3 >> 16 & 0xFF) * var4;
			int var7 = (var3 >> 8 & 303154951) * var4;
			int var8 = (var3 & -158420127) * var4;
			int var12 = var0 + var1 * au_fld;

			for (int var13 = 0; var13 < var2; var13++) {
				int var9 = (al_fld[var12] >> 16 & 500586200) * var5;
				int var10 = (al_fld[var12] >> 8 & 0xFF) * var5;
				int var11 = (al_fld[var12] & 0xFF) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				al_fld[var12++] = var14;
			}
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void er(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			int var5 = var0 - var2;
			int var6 = var0 + var3;
			var5 = Math.max(var5, aq_fld);
			var6 = Math.min(var6, am_fld - 1);
			if (var5 <= var6) {
				ew(var5, var1, var6 - var5 + 1, var4);
			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void gf(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 < aq_fld) {
				var2 -= aq_fld - var0;
				var0 = aq_fld;
			}

			if (var0 + var2 > am_fld) {
				var2 = am_fld - var0;
			}

			int var5 = -1956919671 - var4;
			int var6 = (var3 >> 16 & 0xFF) * var4;
			int var7 = (var3 >> 8 & -1113809828) * var4;
			int var8 = (var3 & 0xFF) * var4;
			int var12 = var0 + var1 * au_fld;

			for (int var13 = 0; var13 < var2; var13++) {
				int var9 = (al_fld[var12] >> 16 & 0xFF) * var5;
				int var10 = (al_fld[var12] >> 8 & 0xFF) * var5;
				int var11 = (al_fld[var12] & 0xFF) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				al_fld[var12++] = var14;
			}
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[BIZ)V"
	)
	public static void gg(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
		if (var0 + var2 >= 0 && var1 + var3 >= 0) {
			if (var0 < au_fld && var1 < ax_fld) {
				int var9 = 0;
				int var10 = 0;
				if (var0 < 0) {
					var9 -= var0;
					var2 += var0;
				}

				if (var1 < 0) {
					var10 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > au_fld) {
					var2 = au_fld - var0;
				}

				if (var1 + var3 > ax_fld) {
					var3 = ax_fld - var1;
				}

				int var11 = var6.length / var7;
				int var12 = au_fld - var2;
				int var13 = var4 >>> 24;
				int var14 = var5 >>> 24;
				if (var8 && (var13 != 1592308528 || var14 != 255)) {
					int var25 = (var1 + var10) * au_fld + var0 + var9;

					for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
						for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
							int var28 = (var26 - var1) % var11;
							int var29 = (var27 - var0) % var7;
							int var20 = var4;
							if (var6[var28 * var7 + var29] != 0) {
								var20 = var5;
							}

							int var21 = var20 >>> 24;
							int var22 = -1798584527 - var21;
							int var23 = al_fld[var25];
							int var24 = ((var20 & -64201102) * var21 + (var23 & 1187333206) * var22 & -16711936)
									+ ((var20 & 144910120) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000)
								>> 8;
							al_fld[var25++] = var24;
						}

						var25 += var12;
					}
				} else {
					int var15 = (var1 + var10) * au_fld + var0 + var9;

					for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
						for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
							int var18 = (var16 - var1) % var11;
							int var19 = (var17 - var0) % var7;
							if (var6[var18 * var7 + var19] != 0) {
								al_fld[var15++] = var5;
							} else {
								al_fld[var15++] = var4;
							}
						}

						var15 += var12;
					}
				}
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void ga(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= aq_fld && var0 < am_fld) {
			if (var1 < aa_fld) {
				var2 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var1 + var2 > ai_fld) {
				var2 = ai_fld - var1;
			}

			int var5 = -916062167 - var4;
			int var6 = (var3 >> 16 & 0xFF) * var4;
			int var7 = (var3 >> 8 & 2000477192) * var4;
			int var8 = (var3 & 0xFF) * var4;
			int var12 = var0 + var1 * au_fld;

			for (int var13 = 0; var13 < var2; var13++) {
				int var9 = (al_fld[var12] >> 16 & 0xFF) * var5;
				int var10 = (al_fld[var12] >> 8 & 0xFF) * var5;
				int var11 = (al_fld[var12] & 0xFF) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				al_fld[var12] = var14;
				var12 += au_fld;
			}
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void gd(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= aq_fld && var0 < am_fld) {
			if (var1 < aa_fld) {
				var2 -= aa_fld - var1;
				var1 = aa_fld;
			}

			if (var1 + var2 > ai_fld) {
				var2 = ai_fld - var1;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 0xFF) * var4;
			int var7 = (var3 >> 8 & 0xFF) * var4;
			int var8 = (var3 & 0xFF) * var4;
			int var12 = var0 + var1 * au_fld;

			for (int var13 = 0; var13 < var2; var13++) {
				int var9 = (al_fld[var12] >> 16 & 0xFF) * var5;
				int var10 = (al_fld[var12] >> 8 & 0xFF) * var5;
				int var11 = (al_fld[var12] & 0xFF) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				al_fld[var12] = var14;
				var12 += au_fld;
			}
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void db() {
		aq_fld = 0;
		aa_fld = 0;
		am_fld = au_fld;
		ai_fld = ax_fld;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void fa(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > au_fld) {
			var2 = au_fld;
		}

		if (var3 > ax_fld) {
			var3 = ax_fld;
		}

		aq_fld = var0;
		aa_fld = var1;
		am_fld = var2;
		ai_fld = var3;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void gn(int var0, int var1, int var2, int var3, int var4) {
		ew(var0, var1, var2, var4);
		ew(var0, var1 + var3 - 1, var2, var4);
		eo(var0, var1, var3, var4);
		eo(var0 + var2 - 1, var1, var3, var4);
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void ef(int var0, int var1, int var2, int var3, int var4, int var5) {
		var5 |= -16777216;
		if (var4 <= 1) {
			ez(var0, var1, var2, var3, var5);
		} else {
			int var6 = var4 / 2;
			int var7 = var4 - var6;
			int var8 = var2 - var0;
			int var9 = var3 - var1;
			if (var9 == 0) {
				int var30 = var0;
				int var34 = var2;
				if (var0 > var2) {
					var30 = var2;
					var34 = var0;
				}

				int var44 = var1 - var6;
				int var50 = var1 + var7;
				var44 = Math.max(var44, aa_fld);
				var50 = Math.min(var50, ai_fld - 1);
				if (var44 <= var50) {
					var30 = Math.max(var30, aq_fld);
					var34 = Math.min(var34, am_fld - 1);
					if (var30 <= var34) {
						for (int var55 = var44; var55 <= var50; var55++) {
							ew(var30, var55, var34 - var30 + 1, var5);
						}
					}
				}
			} else if (var8 == 0) {
				int var28 = var1;
				int var32 = var3;
				if (var1 > var3) {
					var28 = var3;
					var32 = var1;
				}

				int var42 = var0 - var6;
				int var48 = var0 + var7;
				var42 = Math.max(var42, aq_fld);
				var48 = Math.min(var48, am_fld - 1);
				if (var42 <= var48) {
					var28 = Math.max(var28, aa_fld);
					var32 = Math.min(var32, ai_fld - 1);
					if (var28 <= var32) {
						for (int var54 = var42; var54 <= var48; var54++) {
							eo(var54, var28, var32 - var28 + 1, var5);
						}
					}
				}
			} else {
				int var10 = Math.abs(var8);
				int var11 = Math.abs(var9);
				if (var10 == var11) {
					int var41 = var8 >= 0 ? 1 : -1;
					int var47 = var9 >= 0 ? 1 : -1;
					int var53 = -var47;
					int var57 = var41;
					int var59 = var0;
					int var61 = var1;

					for (int var63 = 0; var63 <= var10; var63++) {
						for (int var65 = -var6; var65 <= var7 - 1; var65++) {
							int var20 = var53 * var65;
							int var21 = var57 * var65;
							eg(var59 + var20, var61 + var21, var5);
							boolean var22 = (var63 & 1) != 0;
							if (var22) {
								eg(var59 + var20 + 1, var61 + var21, var5);
							}

							eg(var59 + var20 + var41, var61 + var21, var5);
						}

						var59 += var41;
						var61 += var47;
					}
				} else {
					if (var10 >= var11) {
						if (var2 < var0) {
							int var12 = var0;
							var0 = var2;
							var2 = var12;
							var12 = var1;
							var1 = var3;
							var3 = var12;
						}

						var8 = var2 - var0;
						var9 = var3 - var1;
						int var37 = (var1 << 16) + 32768;
						int var14 = var9 << 16;
						int var13;
						if (var14 >= 0) {
							var13 = (var8 / 2 + var14) / var8;
						} else {
							var13 = -((var8 / 2 + -var14) / var8);
						}

						int var15 = var13;
						int var16 = var0;
						if (var0 < aq_fld) {
							var37 += var13 * (aq_fld - var0);
							var16 = aq_fld;
						}

						int var17 = Math.min(var2, am_fld - 1);

						for (int var18 = var16; var18 <= var17; var18++) {
							int var19 = var37 >> 16;
							en(var18, var19, var6, var7, var5);
							var37 += var15;
						}
					} else {
						if (var3 < var1) {
							int var38 = var0;
							var0 = var2;
							var2 = var38;
							var38 = var1;
							var1 = var3;
							var3 = var38;
						}

						var8 = var2 - var0;
						var9 = var3 - var1;
						int var40 = (var0 << 16) + 32768;
						int var52 = var8 << 16;
						int var46;
						if (var52 >= 0) {
							var46 = (var52 + var9 / 2) / var9;
						} else {
							var46 = -((var9 / 2 + -var52) / var9);
						}

						int var56 = var46;
						int var58 = var1;
						if (var1 < aa_fld) {
							var40 += var46 * (aa_fld - var1);
							var58 = aa_fld;
						}

						int var60 = Math.min(var3, ai_fld - 1);

						for (int var62 = var58; var62 <= var60; var62++) {
							int var64 = var40 >> 16;
							er(var64, var62, var6, var7, var5);
							var40 += var56;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void eh() {
		aq_fld = 0;
		aa_fld = 0;
		am_fld = au_fld;
		ai_fld = ax_fld;
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void gr(int var0, int var1, int var2, int var3, int var4, int var5) {
		ex(var0, var1, var2, var4, var5);
		ex(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			ec(var0, var1 + 1, var3 - 2, var4, var5);
			ec(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static void hr(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			int var5 = var0 - var2;
			int var6 = var0 + var3;
			var5 = Math.max(var5, aq_fld);
			var6 = Math.min(var6, am_fld - 1);
			if (var5 <= var6) {
				ew(var5, var1, var6 - var5 + 1, var4);
			}
		}
	}

	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "(Lda;II)V"
	)
	public static void xv(da var0, int var1, int var2) {
		var0.cg_fld.ae(var1, var2, -1106240719);
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[BIZ)V"
	)
	public static void ff(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
		if (var0 + var2 >= 0 && var1 + var3 >= 0) {
			if (var0 < au_fld && var1 < ax_fld) {
				int var9 = 0;
				int var10 = 0;
				if (var0 < 0) {
					var9 -= var0;
					var2 += var0;
				}

				if (var1 < 0) {
					var10 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > au_fld) {
					var2 = au_fld - var0;
				}

				if (var1 + var3 > ax_fld) {
					var3 = ax_fld - var1;
				}

				int var11 = var6.length / var7;
				int var12 = au_fld - var2;
				int var13 = var4 >>> 24;
				int var14 = var5 >>> 24;
				if (!var8 || var13 == 1563313874 && var14 == 255) {
					int var25 = (var1 + var10) * au_fld + var0 + var9;

					for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
						for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
							int var28 = (var26 - var1) % var11;
							int var29 = (var27 - var0) % var7;
							if (var6[var28 * var7 + var29] != 0) {
								al_fld[var25++] = var5;
							} else {
								al_fld[var25++] = var4;
							}
						}

						var25 += var12;
					}
				} else {
					int var15 = (var1 + var10) * au_fld + var0 + var9;

					for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
						for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
							int var18 = (var16 - var1) % var11;
							int var19 = (var17 - var0) % var7;
							int var20 = var4;
							if (var6[var18 * var7 + var19] != 0) {
								var20 = var5;
							}

							int var21 = var20 >>> 24;
							int var22 = 255 - var21;
							int var23 = al_fld[var15];
							int var24 = ((var20 & 16711935) * var21 + (var23 & 627662932) * var22 & -16711936)
									+ ((var20 & -428228822) * var21 + (var23 & 0xFF00) * var22 & -1090570133)
								>> 8;
							al_fld[var15++] = var24;
						}

						var15 += var12;
					}
				}
			}
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void he(int var0, int var1, int var2) {
		if (var1 >= aa_fld && var1 < ai_fld) {
			if (var0 >= aq_fld && var0 < am_fld) {
				al_fld[var0 + var1 * au_fld] = var2;
			}
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public static void fb(int[] var0) {
		aq_fld = var0[0];
		aa_fld = var0[1];
		am_fld = var0[2];
		ai_fld = var0[3];
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void hk(int var0, int var1, int var2, int var3, int var4, int var5) {
		var5 |= -16777216;
		if (var4 <= 1) {
			ez(var0, var1, var2, var3, var5);
		} else {
			int var6 = var4 / 2;
			int var7 = var4 - var6;
			int var8 = var2 - var0;
			int var9 = var3 - var1;
			if (var9 == 0) {
				int var30 = var0;
				int var34 = var2;
				if (var0 > var2) {
					var30 = var2;
					var34 = var0;
				}

				int var44 = var1 - var6;
				int var50 = var1 + var7;
				var44 = Math.max(var44, aa_fld);
				var50 = Math.min(var50, ai_fld - 1);
				if (var44 <= var50) {
					var30 = Math.max(var30, aq_fld);
					var34 = Math.min(var34, am_fld - 1);
					if (var30 <= var34) {
						for (int var55 = var44; var55 <= var50; var55++) {
							ew(var30, var55, var34 - var30 + 1, var5);
						}
					}
				}
			} else if (var8 == 0) {
				int var28 = var1;
				int var32 = var3;
				if (var1 > var3) {
					var28 = var3;
					var32 = var1;
				}

				int var42 = var0 - var6;
				int var48 = var0 + var7;
				var42 = Math.max(var42, aq_fld);
				var48 = Math.min(var48, am_fld - 1);
				if (var42 <= var48) {
					var28 = Math.max(var28, aa_fld);
					var32 = Math.min(var32, ai_fld - 1);
					if (var28 <= var32) {
						for (int var54 = var42; var54 <= var48; var54++) {
							eo(var54, var28, var32 - var28 + 1, var5);
						}
					}
				}
			} else {
				int var10 = Math.abs(var8);
				int var11 = Math.abs(var9);
				if (var10 == var11) {
					int var41 = var8 >= 0 ? 1 : -1;
					int var47 = var9 >= 0 ? 1 : -1;
					int var53 = -var47;
					int var57 = var41;
					int var59 = var0;
					int var61 = var1;

					for (int var63 = 0; var63 <= var10; var63++) {
						for (int var65 = -var6; var65 <= var7 - 1; var65++) {
							int var20 = var53 * var65;
							int var21 = var57 * var65;
							eg(var59 + var20, var61 + var21, var5);
							boolean var22 = (var63 & 1) != 0;
							if (var22) {
								eg(var59 + var20 + 1, var61 + var21, var5);
							}

							eg(var59 + var20 + var41, var61 + var21, var5);
						}

						var59 += var41;
						var61 += var47;
					}
				} else {
					if (var10 >= var11) {
						if (var2 < var0) {
							int var12 = var0;
							var0 = var2;
							var2 = var12;
							var12 = var1;
							var1 = var3;
							var3 = var12;
						}

						var8 = var2 - var0;
						var9 = var3 - var1;
						int var37 = (var1 << 16) + 32768;
						int var14 = var9 << 16;
						int var13;
						if (var14 >= 0) {
							var13 = (var8 / 2 + var14) / var8;
						} else {
							var13 = -((var8 / 2 + -var14) / var8);
						}

						int var15 = var13;
						int var16 = var0;
						if (var0 < aq_fld) {
							var37 += var13 * (aq_fld - var0);
							var16 = aq_fld;
						}

						int var17 = Math.min(var2, am_fld - 1);

						for (int var18 = var16; var18 <= var17; var18++) {
							int var19 = var37 >> 16;
							en(var18, var19, var6, var7, var5);
							var37 += var15;
						}
					} else {
						if (var3 < var1) {
							int var38 = var0;
							var0 = var2;
							var2 = var38;
							var38 = var1;
							var1 = var3;
							var3 = var38;
						}

						var8 = var2 - var0;
						var9 = var3 - var1;
						int var40 = (var0 << 16) + 32768;
						int var52 = var8 << 16;
						int var46;
						if (var52 >= 0) {
							var46 = (var52 + var9 / 2) / var9;
						} else {
							var46 = -((var9 / 2 + -var52) / var9);
						}

						int var56 = var46;
						int var58 = var1;
						if (var1 < aa_fld) {
							var40 += var46 * (aa_fld - var1);
							var58 = aa_fld;
						}

						int var60 = Math.min(var3, ai_fld - 1);

						for (int var62 = var58; var62 <= var60; var62++) {
							int var64 = var40 >> 16;
							er(var64, var62, var6, var7, var5);
							var40 += var56;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void hi(int var0, int var1, int var2) {
		if (var0 >= aq_fld && var1 >= aa_fld && var0 < am_fld && var1 < ai_fld) {
			al_fld[var0 + var1 * au_fld] = var2;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void hn(int var0, int var1, int var2) {
		if (var0 >= aq_fld && var1 >= aa_fld && var0 < am_fld && var1 < ai_fld) {
			al_fld[var0 + var1 * au_fld] = var2;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void hs(int var0, int var1, int var2) {
		if (var0 >= aq_fld && var1 >= aa_fld && var0 < am_fld && var1 < ai_fld) {
			al_fld[var0 + var1 * au_fld] = var2;
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III[I[I)V"
	)
	public static void hq(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * au_fld;

		for (int var8 = 0; var8 < var3.length; var8++) {
			int var6 = var5 + var3[var8];

			for (int var7 = -var4[var8]; var7 < 0; var7++) {
				al_fld[var6++] = var2;
			}

			var5 += au_fld;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(III[I[I)V"
	)
	public static void hl(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * au_fld;

		for (int var8 = 0; var8 < var3.length; var8++) {
			int var6 = var5 + var3[var8];

			for (int var7 = -var4[var8]; var7 < 0; var7++) {
				al_fld[var6++] = var2;
			}

			var5 += au_fld;
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(III[I[I)V"
	)
	public static void hc(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * au_fld;

		for (int var8 = 0; var8 < var3.length; var8++) {
			int var6 = var5 + var3[var8];

			for (int var7 = -var4[var8]; var7 < 0; var7++) {
				al_fld[var6++] = var2;
			}

			var5 += au_fld;
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void hw() {
		if (an_fld != null) {
			if (aq_fld == 0 && am_fld == au_fld && aa_fld == 0 && ai_fld == ax_fld) {
				int var16 = an_fld.length;
				int var17 = var16 - (var16 & 7);

				int var18;
				for (var18 = 0; var18 < var17; an_fld[var18++] = 0.0F) {
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
					an_fld[var18++] = 0.0F;
				}

				while (var18 < var16) {
					an_fld[var18++] = 0.0F;
				}
			} else {
				int var0 = am_fld - aq_fld;
				int var1 = ai_fld - aa_fld;
				int var2 = au_fld - var0;
				int var3 = aq_fld + aa_fld * au_fld;
				int var4 = var0 >> 3;
				int var5 = var0 & 7;
				var0 = var3 - 1;

				for (int var7 = -var1; var7 < 0; var7++) {
					if (var4 > 0) {
						int var6 = var4;

						do {
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
							an_fld[++var0] = 0.0F;
						} while (--var6 > 0);
					}

					if (var5 > 0) {
						int var26 = var5;

						do {
							an_fld[++var0] = 0.0F;
						} while (--var26 > 0);
					}

					var0 += var2;
				}
			}
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void hg() {
		if (an_fld != null) {
			int var0 = an_fld.length;

			for (int var1 = 0; var1 < var0; var1++) {
				if (var1 % au_fld < au_fld / 2 && an_fld[var1] > 0.0F) {
					int var2 = (int)(255.0F * ai.ae(an_fld[var1]));
					al_fld[var1] = var2 << 16 | var2 << 8 | var2;
				}
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void hv() {
		if (an_fld != null) {
			int var0 = an_fld.length;

			for (int var1 = 0; var1 < var0; var1++) {
				if (var1 % au_fld < au_fld / 2 && an_fld[var1] > 0.0F) {
					int var2 = (int)(255.0F * ai.ae(an_fld[var1]));
					al_fld[var1] = var2 << 16 | var2 << 8 | var2;
				}
			}
		}
	}
}
