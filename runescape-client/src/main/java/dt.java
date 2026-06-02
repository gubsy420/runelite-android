import java.io.EOFException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dt")
public class dt {
	@ObfuscatedGetter(
		intValue = -465339283
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld = -836973041;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] av_fld = new int[]{1, 2, 4, 8};
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aw_fld = new int[]{0, -1, 0, 1};
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ay_fld = new int[]{1, -1, -1, 1};
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ah_fld = new int[]{1, 0, -1, 0};
	@ObfuscatedGetter(
		intValue = 573035209
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] as_fld = new int[]{-1, -1, 1, 1};
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ae_fld = new int[]{16, 32, 64, 128};
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ao_fld;
	@ObfuscatedGetter(
		intValue = 1379863789
	)
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld = (int)(Math.random() * 17.0) - 8;
	@ObfuscatedGetter(
		intValue = 1130117379
	)
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld = (int)(Math.random() * 33.0) - 16;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([BIIII)Z"
	)
	static boolean cd(byte[] var0, int var1, int var2, int var3, int var4) throws EOFException {
		boolean var5 = true;
		xi var6 = new xi(var0);
		int var7 = -1;

		label86:
		while (true) {
			int var8 = var6.dm();
			if (0 == var8) {
				return var5;
			}

			var7 += var8;
			int var9 = 0;
			boolean var10 = false;

			while (true) {
				while (!var10) {
					int var11 = var6.dz();
					if (var11 == 0) {
						continue label86;
					}

					var9 += var11 - 1;
					int var12 = var9 & 63;
					int var13 = var9 >> 6 & 63;
					int var14 = var6.cg() >> 2;
					int var15 = var1 + var13;
					int var16 = var2 + var12;
					if (var15 >= 0 && var16 >= 0 && var15 <= var3 && var16 <= var4) {
						oe var17 = ko.az(var7);
						if (!ef.aw(var14) || !client.gk_fld || var17.cj_fld != 0 || 1 == var17.cu_fld || var17.du_fld) {
							if (!oe.fq(var17, 568605147)) {
								client.jw_fld++;
								var5 = false;
							}

							var10 = true;
						}
					}
				}

				int var18 = var6.dz();
				if (0 == var18) {
					break;
				}

				var6.cg();
			}
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	static final void ce(dx var0) throws EOFException {
		int var1 = var0.ah_fld;
		int var2 = var0.aw_fld;
		int[][][] var3 = var0.af_fld;
		byte[][][] var4 = var0.al_fld;
		ev var5 = var0.az_fld;
		gn[] var6 = var0.av_fld;

		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < var1; var8++) {
				for (int var9 = 0; var9 < var2; var9++) {
					if (1 == (var0.al_fld[var7][var8][var9] & 1)) {
						int var10 = var7;
						if (2 == (var0.al_fld[1][var8][var9] & 2)) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].aa(var8, var9, (byte)-82);
						}
					}
				}
			}
		}

		ap_fld = ap_fld + ((int)(Math.random() * 5.0) - 2) * 1061236965;
		if (ap_fld < -8) {
			ap_fld = 100038872;
		}

		if (ap_fld > 8) {
			ap_fld = -100038872;
		}

		at_fld = at_fld + ((int)(Math.random() * 5.0) - 2) * 1923545515;
		if (at_fld < -16) {
			at_fld = -711957168;
		}

		if (at_fld > 16) {
			at_fld = 711957168;
		}

		for (int var48 = 0; var48 < 4; var48++) {
			byte[][] var51 = fp.an_fld[var48];
			byte var54 = 96;
			short var56 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int)Math.sqrt(5100.0);
			int var15 = var14 * 768 >> 8;

			for (int var16 = 1; var16 < var2 - 1; var16++) {
				for (int var17 = 1; var17 < var1 - 1; var17++) {
					int var18 = var3[var48][1 + var17][var16] - var3[var48][var17 - 1][var16];
					int var19 = var3[var48][var17][1 + var16] - var3[var48][var17][var16 - 1];
					int var20 = (int)Math.sqrt(var19 * var19 + var18 * var18 + 65536);
					int var21 = (var18 << 8) / var20;
					int var22 = 65536 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = 96 + (var23 * -50 + var22 * -10 + -50 * var21) / var15;
					int var25 = (var51[var17][var16] >> 1)
						+ (var51[1 + var17][var16] >> 3)
						+ (var51[var17 - 1][var16] >> 2)
						+ (var51[var17][var16 - 1] >> 2)
						+ (var51[var17][var16 + 1] >> 3);
					kf.aa_fld[var17][var16] = var24 - var25;
				}
			}

			for (int var63 = 0; var63 < var2; var63++) {
				hv.ai_fld[var63] = 0;
				or.aq_fld[var63] = 0;
				cl.am_fld[var63] = 0;
				lz.ad_fld[var63] = 0;
				ao_fld[var63] = 0;
			}

			for (int var64 = -5; var64 < 5 + var1; var64++) {
				for (int var67 = 0; var67 < var2; var67++) {
					int var71 = 5 + var64;
					if (var71 >= 0 && var71 < var1) {
						int var76 = (int)ji.af(15, -48936246);
						int var82 = cq.af_fld[var48][var71][var67] & var76;
						if (var82 > 0) {
							pl var88 = ew.ak(var82 - 1);
							hv.ai_fld[var67] = hv.ai_fld[var67] + var88.av_fld;
							or.aq_fld[var67] = or.aq_fld[var67] + var88.ae_fld;
							cl.am_fld[var67] = cl.am_fld[var67] + var88.ah_fld;
							lz.ad_fld[var67] = lz.ad_fld[var67] + var88.aw_fld;
							ao_fld[var67]++;
						}
					}

					int var77 = var64 - 5;
					if (var77 >= 0 && var77 < var1) {
						int var83 = (int)ji.af(15, -807039297);
						int var89 = cq.af_fld[var48][var77][var67] & var83;
						if (var89 > 0) {
							pl var94 = ew.ak(var89 - 1);
							hv.ai_fld[var67] = hv.ai_fld[var67] - var94.av_fld;
							or.aq_fld[var67] = or.aq_fld[var67] - var94.ae_fld;
							cl.am_fld[var67] = cl.am_fld[var67] - var94.ah_fld;
							lz.ad_fld[var67] = lz.ad_fld[var67] - var94.aw_fld;
							ao_fld[var67]--;
						}
					}
				}

				if (var64 >= 1 && var64 < var1 - 1) {
					int var68 = 0;
					int var72 = 0;
					int var78 = 0;
					int var84 = 0;
					int var90 = 0;

					for (int var95 = -5; var95 < 5 + var2; var95++) {
						int var106 = 5 + var95;
						if (var106 >= 0 && var106 < var2) {
							var68 += hv.ai_fld[var106];
							var72 += or.aq_fld[var106];
							var78 += cl.am_fld[var106];
							var84 += lz.ad_fld[var106];
							var90 += ao_fld[var106];
						}

						int var110 = var95 - 5;
						if (var110 >= 0 && var110 < var2) {
							var68 -= hv.ai_fld[var110];
							var72 -= or.aq_fld[var110];
							var78 -= cl.am_fld[var110];
							var84 -= lz.ad_fld[var110];
							var90 -= ao_fld[var110];
						}

						if (var95 >= 1 && var95 < var2 - 1 && (!client.gk_fld || (var4[0][var64][var95] & 2) != 0 || 0 == (var4[var48][var64][var95] & 16))) {
							if (var48 < ar_fld) {
								ar_fld = var48;
							}

							int var114 = (int)ji.af(15, -628724837);
							int var26 = cq.af_fld[var48][var64][var95] & var114;
							int var27 = tx.al_fld[var48][var64][var95] & var114;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var48][var64][var95];
								int var29 = var3[var48][1 + var64][var95];
								int var30 = var3[var48][1 + var64][1 + var95];
								int var31 = var3[var48][var64][1 + var95];
								int var32 = kf.aa_fld[var64][var95];
								int var33 = kf.aa_fld[1 + var64][var95];
								int var34 = kf.aa_fld[1 + var64][1 + var95];
								int var35 = kf.aa_fld[var64][1 + var95];
								int var36 = -1;
								int var37 = -1;
								if (var26 > 0) {
									int var38 = var68 * 256 / var84;
									int var39 = var72 / var90;
									int var40 = var78 / var90;
									var36 = mc.ab(var38, var39, var40);
									var38 = ap_fld + var38 & 0xFF;
									var40 += at_fld;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = mc.ab(var38, var39, var40);
								}

								if (var48 > 0) {
									boolean var122 = true;
									if (var26 == 0 && rt.au_fld[var48][var64][var95] != 0) {
										var122 = false;
									}

									if (var27 > 0) {
										int var127 = var27 - 1;
										ov var41 = (ov)ov.ay_fld.ak(var127);
										ov var124;
										if (var41 != null) {
											var124 = var41;
										} else {
											byte[] var42 = ha.aw_fld.bb(4, var127, 584982574);
											var41 = new ov();
											if (null != var42) {
												var41.av(new xi(var42), var127);
											}

											ov.mt(var41, (byte)-33);
											ov.ay_fld.az(var41, var127);
											var124 = var41;
										}

										if (!var124.af_fld) {
											var122 = false;
										}
									}

									if (var122 && var29 == var28 && var30 == var28 && var28 == var31) {
										jw.ab_fld[var48][var64][var95] = jw.ab_fld[var48][var64][var95] | 2340;
									}
								}

								int var123 = 0;
								if (var37 != -1) {
									var123 = fc.az_fld[jf.ad(var37, 96)];
								}

								if (0 == var27) {
									var5.bm(
										var48,
										var64,
										var95,
										0,
										0,
										-1,
										var28,
										var29,
										var30,
										var31,
										jf.ad(var36, var32),
										jf.ad(var36, var33),
										jf.ad(var36, var34),
										jf.ad(var36, var35),
										0,
										0,
										0,
										0,
										var123,
										0
									);
								} else {
									int var125 = rt.au_fld[var48][var64][var95] + 1;
									byte var128 = us.ax_fld[var48][var64][var95];
									ov var130 = kl.ag(var27 - 1);
									int var131 = var130.ar_fld;
									int var43;
									int var44;
									if (var131 >= 0) {
										var44 = fc.ar_fld.aq_fld.av(var131, (byte)-62);
										var43 = -1;
									} else if (16711935 == var130.as_fld) {
										var43 = -2;
										var131 = -1;
										var44 = -2;
									} else {
										var43 = mc.ab(var130.au_fld, var130.ax_fld, var130.an_fld);
										int var45 = var130.au_fld + ap_fld & 0xFF;
										int var46 = at_fld + var130.an_fld;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = mc.ab(var45, var130.ax_fld, var46);
									}

									int var133 = 0;
									if (var44 != -2) {
										var133 = fc.az_fld[pt.ao(var44, 96)];
									}

									if (-1 != var130.al_fld) {
										int var134 = ap_fld + var130.aa_fld & 0xFF;
										int var47 = at_fld + var130.aq_fld;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = mc.ab(var134, var130.ai_fld, var47);
										var133 = fc.az_fld[pt.ao(var44, 96)];
									}

									var5.bm(
										var48,
										var64,
										var95,
										var125,
										var128,
										var131,
										var28,
										var29,
										var30,
										var31,
										jf.ad(var36, var32),
										jf.ad(var36, var33),
										jf.ad(var36, var34),
										jf.ad(var36, var35),
										pt.ao(var43, var32),
										pt.ao(var43, var33),
										pt.ao(var43, var34),
										pt.ao(var43, var35),
										var123,
										var133
									);
								}
							}
						}
					}
				}
			}

			for (int var65 = 1; var65 < var2 - 1; var65++) {
				for (int var69 = 1; var69 < var1 - 1; var69++) {
					int var96;
					if (0 != (var0.al_fld[var48][var69][var65] & 8)) {
						var96 = 0;
					} else if (var48 > 0 && (var0.al_fld[1][var69][var65] & 2) != 0) {
						var96 = var48 - 1;
					} else {
						var96 = var48;
					}

					ev.ux(var5, var48, var69, var65, var96);
				}
			}

			cq.af_fld[var48] = null;
			tx.al_fld[var48] = (short[][])null;
			rt.au_fld[var48] = (byte[][])null;
			us.ax_fld[var48] = (byte[][])null;
			fp.an_fld[var48] = (byte[][])null;
		}

		var5.cs(-50, -10, -50);

		for (int var49 = 0; var49 < var1; var49++) {
			for (int var52 = 0; var52 < var2; var52++) {
				if ((var4[1][var49][var52] & 2) == 2) {
					var5.at(var49, var52);
				}
			}
		}

		if (var0.ak(-787091592)) {
			int var50 = var0.ah_fld;
			int var53 = var0.aw_fld;
			int[][][] var55 = var0.af_fld;
			ev var57 = var0.az_fld;
			byte var58 = 1;
			byte var59 = 2;
			byte var60 = 4;

			for (int var61 = 0; var61 < 4; var61++) {
				if (var61 > 0) {
					var58 <<= 3;
					var59 <<= 3;
					var60 <<= 3;
				}

				for (int var62 = 0; var62 <= var61; var62++) {
					for (int var66 = 0; var66 <= var53; var66++) {
						for (int var70 = 0; var70 <= var50; var70++) {
							if (0 != (jw.ab_fld[var62][var70][var66] & var58)) {
								int var73 = var66;
								int var79 = var66;
								int var85 = var62;
								int var91 = var62;

								while (var73 > 0 && 0 != (jw.ab_fld[var62][var70][var73 - 1] & var58)) {
									var73--;
								}

								while (var79 < var53 && 0 != (jw.ab_fld[var62][var70][1 + var79] & var58)) {
									var79++;
								}

								label528:
								while (var85 > 0) {
									for (int var97 = var73; var97 <= var79; var97++) {
										if (0 == (jw.ab_fld[var85 - 1][var70][var97] & var58)) {
											break label528;
										}
									}

									var85--;
								}

								label517:
								while (var91 < var61) {
									for (int var98 = var73; var98 <= var79; var98++) {
										if ((jw.ab_fld[1 + var91][var70][var98] & var58) == 0) {
											break label517;
										}
									}

									var91++;
								}

								int var99 = (var79 - var73 + 1) * (1 + var91 - var85);
								if (var99 >= 8) {
									short var107 = 240;
									int var111 = var55[var91][var70][var73] - var107;
									int var115 = var55[var85][var70][var73];
									ev.my(var57, var61, 1, var70 * 128, var70 * 128, 128 * var73, 128 + 128 * var79, var111, var115);

									for (int var117 = var85; var117 <= var91; var117++) {
										for (int var119 = var73; var119 <= var79; var119++) {
											jw.ab_fld[var117][var70][var119] = jw.ab_fld[var117][var70][var119] & ~var58;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var62][var70][var66] & var59)) {
								int var74 = var70;
								int var80 = var70;
								int var86 = var62;
								int var92 = var62;

								while (var74 > 0 && (jw.ab_fld[var62][var74 - 1][var66] & var59) != 0) {
									var74--;
								}

								while (var80 < var50 && 0 != (jw.ab_fld[var62][var80 + 1][var66] & var59)) {
									var80++;
								}

								label581:
								while (var86 > 0) {
									for (int var100 = var74; var100 <= var80; var100++) {
										if ((jw.ab_fld[var86 - 1][var100][var66] & var59) == 0) {
											break label581;
										}
									}

									var86--;
								}

								label570:
								while (var92 < var61) {
									for (int var101 = var74; var101 <= var80; var101++) {
										if (0 == (jw.ab_fld[1 + var92][var101][var66] & var59)) {
											break label570;
										}
									}

									var92++;
								}

								int var102 = (var92 + 1 - var86) * (var80 - var74 + 1);
								if (var102 >= 8) {
									short var108 = 240;
									int var112 = var55[var92][var74][var66] - var108;
									int var116 = var55[var86][var74][var66];
									ev.my(var57, var61, 2, var74 * 128, 128 * var80 + 128, var66 * 128, var66 * 128, var112, var116);

									for (int var118 = var86; var118 <= var92; var118++) {
										for (int var120 = var74; var120 <= var80; var120++) {
											jw.ab_fld[var118][var120][var66] = jw.ab_fld[var118][var120][var66] & ~var59;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var62][var70][var66] & var60)) {
								int var75 = var70;
								int var81 = var70;
								int var87 = var66;
								int var93 = var66;

								while (var87 > 0 && 0 != (jw.ab_fld[var62][var70][var87 - 1] & var60)) {
									var87--;
								}

								while (var93 < var53 && (jw.ab_fld[var62][var70][1 + var93] & var60) != 0) {
									var93++;
								}

								label634:
								while (var75 > 0) {
									for (int var103 = var87; var103 <= var93; var103++) {
										if ((jw.ab_fld[var62][var75 - 1][var103] & var60) == 0) {
											break label634;
										}
									}

									var75--;
								}

								label623:
								while (var81 < var50) {
									for (int var104 = var87; var104 <= var93; var104++) {
										if ((jw.ab_fld[var62][1 + var81][var104] & var60) == 0) {
											break label623;
										}
									}

									var81++;
								}

								if ((1 + (var81 - var75)) * (var93 - var87 + 1) >= 4) {
									int var105 = var55[var62][var75][var87];
									ev.my(var57, var61, 4, var75 * 128, 128 * var81 + 128, var87 * 128, var93 * 128 + 128, var105, var105);

									for (int var109 = var75; var109 <= var81; var109++) {
										for (int var113 = var87; var113 <= var93; var113++) {
											jw.ab_fld[var62][var109][var113] = jw.ab_fld[var62][var109][var113] & ~var60;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([[[IIII)V"
	)
	static final void bp(int[][][] var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				var0[var1][var4 + var2][var5 + var3] = 0;
			}
		}

		if (var2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				var0[var1][var2][var3 + var6] = var0[var1][var2 - 1][var3 + var6];
			}
		}

		if (var3 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				var0[var1][var2 + var7][var3] = var0[var1][var7 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && 0 != var0[var1][var2 - 1][var3]) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void at() {
		ar_fld = -836973041;
		cq.af_fld = new short[4][-1605225411][1902685234];
		tx.al_fld = new short[4][2063818911][-564016018];
		rt.au_fld = new byte[4][-562921169][-125739849];
		us.ax_fld = new byte[4][-1826485077][104];
		jw.ab_fld = new int[4][435851012][458631182];
		fp.an_fld = new byte[4][-1416215530][-1232144098];
		kf.aa_fld = new int[105][-686486196];
		hv.ai_fld = new int[1000308461];
		or.aq_fld = new int[104];
		cl.am_fld = new int[-1982070769];
		lz.ad_fld = new int[965208522];
		ao_fld = new int[1247964515];
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIII)V"
	)
	static final void bj(dx var0, byte[] var1, int var2, int var3, int var4, int var5) {
		if (var0.av_fld != null) {
			for (int var6 = 0; var6 < 4; var6++) {
				gn var7 = var0.av_fld[var6];

				for (int var8 = var2; var8 < var2 + 1600917833; var8++) {
					for (int var9 = var3; var9 < var3 + 64; var9++) {
						if (var7.af(var8, var9, (byte)2)) {
							var7.ar(var8, var9, 1073741824, 1651148994);
						}
					}
				}
			}
		}

		xi var12 = new xi(var1);

		for (int var13 = 0; var13 < 4; var13++) {
			for (int var15 = 0; var15 < 1375745560; var15++) {
				for (int var17 = 0; var17 < 64; var17++) {
					int var10 = var15 + var2;
					int var11 = var3 + var17;
					ck.aw(var0, var12, var13, var10, var11, var4 + var10, var5 + var11, 0, 1034112622);
				}
			}
		}

		int var14 = var12.au_fld < var12.al_fld.length ? var12.cg() : 0;
		boolean var16 = 0 != (var14 & 1);
		if (var16) {
			for (int var18 = 0; var18 < 64; var18++) {
				for (int var19 = 0; var19 < 1114846887; var19++) {
					bc.ay(var12, (byte)-27);
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void aj() {
		ar_fld = -836973041;
		cq.af_fld = new short[4][104][104];
		tx.al_fld = new short[4][104][104];
		rt.au_fld = new byte[4][104][104];
		us.ax_fld = new byte[4][104][104];
		jw.ab_fld = new int[4][105][105];
		fp.an_fld = new byte[4][105][105];
		kf.aa_fld = new int[105][105];
		hv.ai_fld = new int[104];
		or.aq_fld = new int[104];
		cl.am_fld = new int[104];
		lz.ad_fld = new int[104];
		ao_fld = new int[104];
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bm() {
		ar_fld = -836973041;
		cq.af_fld = new short[4][-1876055179][104];
		tx.al_fld = new short[4][1070581019][104];
		rt.au_fld = new byte[4][-1515446502][1186429279];
		us.ax_fld = new byte[4][-2076598839][104];
		jw.ab_fld = new int[4][389679491][-890244492];
		fp.an_fld = new byte[4][105][1697720770];
		kf.aa_fld = new int[105][105];
		hv.ai_fld = new int[320439742];
		or.aq_fld = new int[104];
		cl.am_fld = new int[-1058057069];
		lz.ad_fld = new int[-2124475453];
		ao_fld = new int[104];
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bd() {
		cq.af_fld = null;
		tx.al_fld = (short[][][])null;
		rt.au_fld = (byte[][][])null;
		us.ax_fld = (byte[][][])null;
		jw.ab_fld = (int[][][])null;
		fp.an_fld = (byte[][][])null;
		kf.aa_fld = (int[][])null;
		hv.ai_fld = null;
		or.aq_fld = null;
		cl.am_fld = null;
		lz.ad_fld = null;
		ao_fld = null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bz() {
		cq.af_fld = null;
		tx.al_fld = (short[][][])null;
		rt.au_fld = (byte[][][])null;
		us.ax_fld = (byte[][][])null;
		jw.ab_fld = (int[][][])null;
		fp.an_fld = (byte[][][])null;
		kf.aa_fld = (int[][])null;
		hv.ai_fld = null;
		or.aq_fld = null;
		cl.am_fld = null;
		lz.ad_fld = null;
		ao_fld = null;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int cb(int var0, int var1) {
		int var2 = cf.am(var0 - 1, var1 - 1) + cf.am(var0 + 1, var1 - 1) + cf.am(var0 - 1, 1 + var1) + cf.am(var0 + 1, var1 + 1);
		int var3 = cf.am(var0 - 1, var1) + cf.am(1 + var0, var1) + cf.am(var0, var1 - 1) + cf.am(var0, var1 + 1);
		int var4 = cf.am(var0, var1);
		return var4 / 4 + var3 / 8 + var2 / 16;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)V"
	)
	static final void be(dx var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.af_fld;
		int var6 = var0.ah_fld - 1;
		int var7 = var0.aw_fld - 1;

		for (int var8 = var2; var8 <= var4 + var2; var8++) {
			for (int var9 = var1; var9 <= var3 + var1; var9++) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					fp.an_fld[0][var9][var8] = 127;
					if (var1 == var9 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var3 + var1 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][1 + var9][var8];
					}

					if (var2 == var8 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var2 + var4 == var8 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)V"
	)
	static final void bs(dx var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.af_fld;
		int var6 = var0.ah_fld - 1;
		int var7 = var0.aw_fld - 1;

		for (int var8 = var2; var8 <= var4 + var2; var8++) {
			for (int var9 = var1; var9 <= var3 + var1; var9++) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					fp.an_fld[0][var9][var8] = 127;
					if (var1 == var9 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var3 + var1 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][1 + var9][var8];
					}

					if (var2 == var8 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var2 + var4 == var8 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)V"
	)
	static final void bh(dx var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.af_fld;
		int var6 = var0.ah_fld - 1;
		int var7 = var0.aw_fld - 1;

		for (int var8 = var2; var8 <= var4 + var2; var8++) {
			for (int var9 = var1; var9 <= var3 + var1; var9++) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					fp.an_fld[0][var9][var8] = (byte)525506306;
					if (var1 == var9 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var3 + var1 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][1 + var9][var8];
					}

					if (var2 == var8 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var2 + var4 == var8 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIII)V"
	)
	static final void bk(dx var0, byte[] var1, int var2, int var3, int var4, int var5) {
		if (var0.av_fld != null) {
			for (int var6 = 0; var6 < 4; var6++) {
				gn var7 = var0.av_fld[var6];

				for (int var8 = var2; var8 < var2 + 64; var8++) {
					for (int var9 = var3; var9 < var3 + 64; var9++) {
						if (var7.af(var8, var9, (byte)2)) {
							var7.ar(var8, var9, 45871986, 1105506577);
						}
					}
				}
			}
		}

		xi var12 = new xi(var1);

		for (int var13 = 0; var13 < 4; var13++) {
			for (int var15 = 0; var15 < 1529321841; var15++) {
				for (int var17 = 0; var17 < -696356233; var17++) {
					int var10 = var15 + var2;
					int var11 = var3 + var17;
					ck.aw(var0, var12, var13, var10, var11, var4 + var10, var5 + var11, 0, 1478580279);
				}
			}
		}

		int var14 = var12.au_fld < var12.al_fld.length ? var12.cg() : 0;
		boolean var16 = 0 != (var14 & 1);
		if (var16) {
			for (int var18 = 0; var18 < 64; var18++) {
				for (int var19 = 0; var19 < 64; var19++) {
					bc.ay(var12, (byte)57);
				}
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([BIIII)Z"
	)
	static boolean bb(byte[] var0, int var1, int var2, int var3, int var4) throws EOFException {
		boolean var5 = true;
		xi var6 = new xi(var0);
		int var7 = -1;

		label73:
		while (true) {
			int var8 = var6.dm();
			if (0 == var8) {
				return var5;
			}

			var7 += var8;
			int var9 = 0;
			boolean var10 = false;

			while (true) {
				while (!var10) {
					int var11 = var6.dz();
					if (var11 == 0) {
						continue label73;
					}

					var9 += var11 - 1;
					int var12 = var9 & 63;
					int var13 = var9 >> 6 & 63;
					int var14 = var6.cg() >> 2;
					int var15 = var1 + var13;
					int var16 = var2 + var12;
					if (var15 >= 0 && var16 >= 0 && var15 <= var3 && var16 <= var4) {
						oe var17 = ko.az(var7);
						if (!ef.aw(var14) || !client.gk_fld || var17.cj_fld != 0 || 1 == var17.cu_fld || var17.du_fld) {
							if (!oe.fq(var17, -1644532683)) {
								client.jw_fld++;
								var5 = false;
							}

							var10 = true;
						}
					}
				}

				int var18 = var6.dz();
				if (0 == var18) {
					break;
				}

				var6.cg();
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIII)V"
	)
	static final void bf(dx var0, byte[] var1, int var2, int var3, int var4, int var5) {
		if (var0.av_fld != null) {
			for (int var6 = 0; var6 < 4; var6++) {
				gn var7 = var0.av_fld[var6];

				for (int var8 = var2; var8 < var2 + 64; var8++) {
					for (int var9 = var3; var9 < var3 + 2108598538; var9++) {
						if (var7.af(var8, var9, (byte)2)) {
							var7.ar(var8, var9, 1073741824, 1818628005);
						}
					}
				}
			}
		}

		xi var12 = new xi(var1);

		for (int var13 = 0; var13 < 4; var13++) {
			for (int var15 = 0; var15 < 1437684862; var15++) {
				for (int var17 = 0; var17 < -488508139; var17++) {
					int var10 = var15 + var2;
					int var11 = var3 + var17;
					ck.aw(var0, var12, var13, var10, var11, var4 + var10, var5 + var11, 0, 995076330);
				}
			}
		}

		int var14 = var12.au_fld < var12.al_fld.length ? var12.cg() : 0;
		boolean var16 = 0 != (var14 & 1);
		if (var16) {
			for (int var18 = 0; var18 < 1265334248; var18++) {
				for (int var19 = 0; var19 < 64; var19++) {
					bc.ay(var12, (byte)-41);
				}
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIII)V"
	)
	static final void by(dx var0, byte[] var1, int var2, int var3, int var4, int var5) {
		if (var0.av_fld != null) {
			for (int var6 = 0; var6 < 4; var6++) {
				gn var7 = var0.av_fld[var6];

				for (int var8 = var2; var8 < var2 + 64; var8++) {
					for (int var9 = var3; var9 < var3 + 64; var9++) {
						if (var7.af(var8, var9, (byte)2)) {
							var7.ar(var8, var9, 1073741824, 1561539498);
						}
					}
				}
			}
		}

		xi var12 = new xi(var1);

		for (int var13 = 0; var13 < 4; var13++) {
			for (int var15 = 0; var15 < 64; var15++) {
				for (int var17 = 0; var17 < 64; var17++) {
					int var10 = var15 + var2;
					int var11 = var3 + var17;
					ck.aw(var0, var12, var13, var10, var11, var4 + var10, var5 + var11, 0, 771897369);
				}
			}
		}

		int var14 = var12.au_fld < var12.al_fld.length ? var12.cg() : 0;
		boolean var16 = 0 != (var14 & 1);
		if (var16) {
			for (int var18 = 0; var18 < 64; var18++) {
				for (int var19 = 0; var19 < 64; var19++) {
					bc.ay(var12, (byte)-71);
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIIIIIII)V"
	)
	static final void bl(dx var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		gn[] var11 = var0.av_fld;
		if (var11 != null && var2 >= 0 && var2 < var11.length) {
			gn var12 = var11[var2];

			for (int var13 = var3; var13 < 8 + var3; var13++) {
				for (int var14 = var4; var14 < 8 + var4; var14++) {
					if (var12.af(var13, var14, (byte)2)) {
						var12.ar(var13, var14, 1073741824, 1664405553);
					}
				}
			}
		}

		xi var25 = new xi(var1);

		for (int var26 = 0; var26 < 4; var26++) {
			for (int var28 = 0; var28 < 64; var28++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (var5 == var26 && var28 >= var6 && var28 < 8 + var6 && var15 >= var7 && var15 < 8 + var7) {
						int var18 = var28 & 7;
						int var19 = var15 & 7;
						int var20 = var8 & 3;
						int var17;
						if (0 == var20) {
							var17 = var18;
						} else if (var20 == 1) {
							var17 = var19;
						} else if (var20 == 2) {
							var17 = 7 - var18;
						} else {
							var17 = 7 - var19;
						}

						int var21 = var17 + var3;
						int var22 = var4 + rw.ak(var28 & 7, var15 & 7, var8);
						int var23 = var9 + var3 + (var28 & 7);
						int var24 = (var15 & 7) + var4 + var10;
						ck.aw(var0, var25, var2, var21, var22, var23, var24, var8, 2022366681);
					} else {
						ck.aw(var0, var25, 0, -1, -1, 0, 0, 0, 1920314713);
					}
				}
			}
		}

		int var27 = var25.au_fld < var25.al_fld.length ? var25.cg() : 0;
		boolean var29 = 0 != (var27 & 1);
		if (var29) {
			for (int var30 = 0; var30 < 64; var30++) {
				for (int var16 = 0; var16 < 64; var16++) {
					bc.ay(var25, (byte)-20);
				}
			}
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ct(int var0, int var1) {
		if (-1 == var0) {
			return -215020557;
		} else {
			var1 = (var0 & 127) * var1 / 1769345151;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & -1925550369) + var1;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([[[IIII)V"
	)
	static final void bo(int[][][] var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				var0[var1][var4 + var2][var5 + var3] = 0;
			}
		}

		if (var2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				var0[var1][var2][var3 + var6] = var0[var1][var2 - 1][var3 + var6];
			}
		}

		if (var3 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				var0[var1][var2 + var7][var3] = var0[var1][var7 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && 0 != var0[var1][var2 - 1][var3]) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	static void bn(xi var0) {
		while (true) {
			int var1 = xi.tx(var0, 684015812);
			if (0 != var1) {
				if (1 != var1) {
					if (var1 <= 49) {
						var0.cz();
					}
					continue;
				}

				var0.cg();
			}

			return;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIZII)J"
	)
	public static long ay(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		long var8 = (var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16 | (var5 & 4294967295L) << 20 | (var6 & 4095L) << 52;
		if (var4) {
			var8 |= 524288L;
		}

		return var8;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lxi;IIIIII)V"
	)
	static final void bv(dx var0, xi var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.af_fld;
		byte[][][] var9 = var0.al_fld;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				int var10 = xi.tx(var1, 747775663);
				if (var10 == 0) {
					if (0 == var2) {
						var8[0][var3][var4] = -cj.aa(var5 + -1284471509, var6 + -1704037214) * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 25848256;
					}
					break;
				}

				if (1 == var10) {
					int var11 = var1.cg();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = 8 * -var11;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= -1191899107) {
					tx.al_fld[var2][var3][var4] = (short)var1.cz();
					rt.au_fld[var2][var3][var4] = (byte)((var10 - 2) / 4);
					us.ax_fld[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= -1365850367) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					cq.af_fld[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			bc.ay(var1, (byte)-55);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	static void bi(xi var0) {
		while (true) {
			int var1 = xi.tx(var0, 2061871060);
			if (0 != var1) {
				if (1 != var1) {
					if (var1 <= 49) {
						var0.cz();
					}
					continue;
				}

				var0.cg();
			}

			return;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	static void bu(xi var0) {
		while (true) {
			int var1 = xi.tx(var0, 511803849);
			if (0 != var1) {
				if (1 != var1) {
					if (var1 <= 49) {
						var0.cz();
					}
					continue;
				}

				var0.cg();
			}

			return;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BII)Z"
	)
	static boolean bw(dx var0, byte[] var1, int var2, int var3) throws EOFException {
		return kq.af(var1, var2, var3, var0.ah_fld - 1, var0.aw_fld - 1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BII)Z"
	)
	static boolean bc(dx var0, byte[] var1, int var2, int var3) throws EOFException {
		return kq.af(var1, var2, var3, var0.ah_fld - 1, var0.aw_fld - 1);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BII)V"
	)
	static final void cq(dx var0, byte[] var1, int var2, int var3) throws EOFException {
		xi var4 = new xi(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.dm();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.dz();
				if (0 == var8) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.cg();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.af_fld[0].length - 2 && var16 < var0.af_fld[0][0].length - 2) {
					int var17 = var11;
					if (2 == (var0.al_fld[1][var15][var16] & 2)) {
						var17 = var11 - 1;
					}

					gn var18 = null;
					if (var17 >= 0 && var0.av_fld != null) {
						var18 = var0.av_fld[var17];
					}

					un.ax(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BII)Z"
	)
	static boolean ba(dx var0, byte[] var1, int var2, int var3) throws EOFException {
		return kq.af(var1, var2, var3, var0.ah_fld - 1, var0.aw_fld - 1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([B)Z"
	)
	static boolean bq(byte[] var0) throws EOFException {
		return kq.af(var0, 0, 0, -1125325830, 720433827);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([BIIII)Z"
	)
	static boolean bg(byte[] var0, int var1, int var2, int var3, int var4) throws EOFException {
		boolean var5 = true;
		xi var6 = new xi(var0);
		int var7 = -1;

		label79:
		while (true) {
			int var8 = var6.dm();
			if (0 == var8) {
				return var5;
			}

			var7 += var8;
			int var9 = 0;
			boolean var10 = false;

			while (true) {
				while (!var10) {
					int var11 = var6.dz();
					if (var11 == 0) {
						continue label79;
					}

					var9 += var11 - 1;
					int var12 = var9 & 63;
					int var13 = var9 >> 6 & 63;
					int var14 = var6.cg() >> 2;
					int var15 = var1 + var13;
					int var16 = var2 + var12;
					if (var15 >= 0 && var16 >= 0 && var15 <= var3 && var16 <= var4) {
						oe var17 = ko.az(var7);
						if (!ef.aw(var14) || !client.gk_fld || var17.cj_fld != 0 || 1 == var17.cu_fld || var17.du_fld) {
							if (!oe.fq(var17, -402531166)) {
								client.jw_fld++;
								var5 = false;
							}

							var10 = true;
						}
					}
				}

				int var18 = var6.dz();
				if (0 == var18) {
					break;
				}

				var6.cg();
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([[[IIII)V"
	)
	static final void bt(int[][][] var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				var0[var1][var4 + var2][var5 + var3] = 0;
			}
		}

		if (var2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				var0[var1][var2][var3 + var6] = var0[var1][var2 - 1][var3 + var6];
			}
		}

		if (var3 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				var0[var1][var2 + var7][var3] = var0[var1][var7 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && 0 != var0[var1][var2 - 1][var3]) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([[[IIII)V"
	)
	static final void bx(int[][][] var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				var0[var1][var4 + var2][var5 + var3] = 0;
			}
		}

		if (var2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				var0[var1][var2][var3 + var6] = var0[var1][var2 - 1][var3 + var6];
			}
		}

		if (var3 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				var0[var1][var2 + var7][var3] = var0[var1][var7 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && 0 != var0[var1][var2 - 1][var3]) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BII)V"
	)
	static final void cc(dx var0, byte[] var1, int var2, int var3) throws EOFException {
		xi var4 = new xi(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.dm();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.dz();
				if (0 == var8) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.cg();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.af_fld[0].length - 2 && var16 < var0.af_fld[0][0].length - 2) {
					int var17 = var11;
					if (2 == (var0.al_fld[1][var15][var16] & 2)) {
						var17 = var11 - 1;
					}

					gn var18 = null;
					if (var17 >= 0 && var0.av_fld != null) {
						var18 = var0.av_fld[var17];
					}

					un.ax(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIIIII)V"
	)
	static final void au(dx var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		xi var9 = new xi(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.dm();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.dz();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.cg();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < 8 + var7) {
					oe var20 = ko.az(var10);
					int var21 = var3 + fz.ag(var15 & 7, var14 & 7, var8, var20.cb_fld, var20.co_fld, var19);
					int var24 = var15 & 7;
					int var25 = var14 & 7;
					int var27 = var20.cb_fld;
					int var28 = var20.co_fld;
					if (1 == (var19 & 1)) {
						int var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var8 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var25;
					} else if (1 == var26) {
						var23 = 7 - var24 - (var27 - 1);
					} else if (2 == var26) {
						var23 = 7 - var25 - (var28 - 1);
					} else {
						var23 = var24;
					}

					int var32 = var23 + var4;
					if (var21 > 0 && var32 > 0 && var21 < var0.ah_fld - 1 && var32 < var0.aw_fld - 1) {
						int var30 = var2;
						if ((var0.al_fld[1][var21][var32] & 2) == 2) {
							var30 = var2 - 1;
						}

						gn var31 = null;
						if (var30 >= 0 && null != var0.av_fld) {
							var31 = var0.av_fld[var30];
						}

						un.ax(var0, var2, var21, var32, var10, var8 + var19 & 3, var18, var31);
					}
				}
			}
		}
	}

	dt() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void br() {
		cq.af_fld = null;
		tx.al_fld = (short[][][])null;
		rt.au_fld = (byte[][][])null;
		us.ax_fld = (byte[][][])null;
		jw.ab_fld = (int[][][])null;
		fp.an_fld = (byte[][][])null;
		kf.aa_fld = (int[][])null;
		hv.ai_fld = null;
		or.aq_fld = null;
		cl.am_fld = null;
		lz.ad_fld = null;
		ao_fld = null;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIIIII)V"
	)
	static final void cf(dx var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		xi var9 = new xi(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.dm();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.dz();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.cg();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < 8 + var7) {
					oe var20 = ko.az(var10);
					int var21 = var3 + fz.ag(var15 & 7, var14 & 7, var8, var20.cb_fld, var20.co_fld, var19);
					int var24 = var15 & 7;
					int var25 = var14 & 7;
					int var27 = var20.cb_fld;
					int var28 = var20.co_fld;
					if (1 == (var19 & 1)) {
						int var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var8 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var25;
					} else if (1 == var26) {
						var23 = 7 - var24 - (var27 - 1);
					} else if (2 == var26) {
						var23 = 7 - var25 - (var28 - 1);
					} else {
						var23 = var24;
					}

					int var32 = var23 + var4;
					if (var21 > 0 && var32 > 0 && var21 < var0.ah_fld - 1 && var32 < var0.aw_fld - 1) {
						int var30 = var2;
						if ((var0.al_fld[1][var21][var32] & 2) == 2) {
							var30 = var2 - 1;
						}

						gn var31 = null;
						if (var30 >= 0 && null != var0.av_fld) {
							var31 = var0.av_fld[var30];
						}

						un.ax(var0, var2, var21, var32, var10, var8 + var19 & 3, var18, var31);
					}
				}
			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIILgn;)V"
	)
	static final void cx(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, gn var7) throws EOFException {
		if (!client.gk_fld || (var0.al_fld[0][var2][var3] & 2) != 0 || (var0.al_fld[var1][var2][var3] & 16) == 0) {
			if (var1 < ar_fld) {
				ar_fld = var1;
			}

			oe var8 = ko.az(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = var8.cb_fld;
				var10 = var8.co_fld;
			} else {
				var9 = var8.co_fld;
				var10 = var8.cb_fld;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.ah_fld) {
				var11 = var2 + (var9 >> 1);
				var12 = (var9 + 1 >> 1) + var2;
			} else {
				var11 = var2;
				var12 = 1 + var2;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.aw_fld) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (1 + var10 >> 1);
			} else {
				var13 = var3;
				var14 = 1 + var3;
			}

			int[][] var15 = var0.af_fld[var1];
			int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2;
			int var17 = (var9 << 6) + (var2 << 7);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = ay(var1, var2, var3, 2, var8.cj_fld == 0, var4, var0.ag_fld);
			int var21 = var6 + (var5 << 6);
			if (var8.dg_fld == 1) {
				var21 += 256;
			}

			if (var8.aq((short)-16735)) {
				var0.ay(var1, var2, var3, var8, var5, -1602922209);
			}

			ev var22 = var0.az_fld;
			if (ef.aw(var6)) {
				if (!client.gk_fld || var8.cj_fld != 0 || 1 == var8.cu_fld || var8.du_fld) {
					Object var44;
					if (var8.dc_fld == -1 && var8.dy_fld == null) {
						var44 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)44);
					} else {
						var44 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
					}

					ev.yo(var22, var1, var2, var3, var16, (em)var44, var19, var21);
					if (var8.cu_fld == 1 && var7 != null) {
						var7.ai(var2, var3, (short)-27640);
					}
				}
			} else if (jk.az(var6)) {
				Object var43;
				if (-1 == var8.dc_fld && null == var8.dy_fld) {
					var43 = oe.lk(var8, kn.ao_fld.ag(-1362207007), var5, var15, var17, var16, var18, (byte)64);
				} else {
					var43 = new dz(var0, var4, kn.ao_fld.ag(-76062277), var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
				}

				if (null != var43 && var22.bh(var1, var2, var3, var16, var9, var10, (em)var43, var6 == kn.ab_fld.ag(1737533939) ? 256 : 0, var19, var21) && var8.dd_fld) {
					int var49 = 15;
					if (var43 instanceof fn) {
						var49 = ((fn)var43).ac() / 4;
						if (var49 > 30) {
							var49 = 30;
						}
					}

					for (int var50 = 0; var50 <= var9; var50++) {
						for (int var53 = 0; var53 <= var10; var53++) {
							if (var49 > fp.an_fld[var1][var2 + var50][var3 + var53]) {
								fp.an_fld[var1][var50 + var2][var3 + var53] = (byte)var49;
							}
						}
					}
				}

				if (0 != var8.cu_fld && var7 != null) {
					var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
				}
			} else {
				if (!gk.ak(var6)) {
					boolean var23 = var6 >= kn.ai_fld.at_fld && var6 <= kn.ad_fld.at_fld;
					if (!var23) {
						if (var6 == kn.ak_fld.ag(-1503454327)) {
							Object var42;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var42 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)112);
							} else {
								var42 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var42, null, av_fld[var5], 0, var19, var21);
							if (var5 == 0) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3] = 50;
									fp.an_fld[var1][var2][var3 + 1] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 585;
								}
							} else if (var5 == 1) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3 + 1] = 50;
									fp.an_fld[var1][var2 + 1][1 + var3] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3 + 1] = jw.ab_fld[var1][var2][var3 + 1] | 1170;
								}
							} else if (2 == var5) {
								if (var8.dd_fld) {
									fp.an_fld[var1][1 + var2][var3] = 50;
									fp.an_fld[var1][1 + var2][var3 + 1] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][1 + var2][var3] = jw.ab_fld[var1][1 + var2][var3] | 585;
								}
							} else if (3 == var5) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3] = 50;
									fp.an_fld[var1][var2 + 1][var3] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 1170;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -2107032575);
							}

							if (16 != var8.dh_fld) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld + 1);
							}

							return;
						}

						if (var6 == kn.ag_fld.ag(27207762)) {
							Object var41;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var41 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)73);
							} else {
								var41 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var41, null, ae_fld[var5], 0, var19, var21);
							if (var8.dd_fld) {
								if (var5 == 0) {
									fp.an_fld[var1][var2][var3 + 1] = 50;
								} else if (1 == var5) {
									fp.an_fld[var1][var2 + 1][var3 + 1] = 50;
								} else if (2 == var5) {
									fp.an_fld[var1][var2 + 1][var3] = 50;
								} else if (3 == var5) {
									fp.an_fld[var1][var2][var3] = 50;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -334144681);
							}

							return;
						}

						if (var6 == kn.az_fld.ag(-712134903)) {
							int var40 = 1 + var5 & 3;
							Object var25;
							Object var48;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var48 = oe.lk(var8, var6, var5 + 4, var15, var17, var16, var18, (byte)45);
								var25 = oe.lk(var8, var6, var40, var15, var17, var16, var18, (byte)46);
							} else {
								var48 = new dz(var0, var4, var6, 4 + var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
								var25 = new dz(var0, var4, var6, var40, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var48, (em)var25, av_fld[var5], av_fld[var40], var19, var21);
							if (var8.cl_fld) {
								if (var5 == 0) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 585;
									jw.ab_fld[var1][var2][1 + var3] = jw.ab_fld[var1][var2][1 + var3] | 1170;
								} else if (var5 == 1) {
									jw.ab_fld[var1][var2][1 + var3] = jw.ab_fld[var1][var2][1 + var3] | 1170;
									jw.ab_fld[var1][1 + var2][var3] = jw.ab_fld[var1][1 + var2][var3] | 585;
								} else if (2 == var5) {
									jw.ab_fld[var1][var2 + 1][var3] = jw.ab_fld[var1][var2 + 1][var3] | 585;
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 1170;
								} else if (var5 == 3) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 1170;
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 585;
								}
							}

							if (0 != var8.cu_fld && var7 != null) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, 360828483);
							}

							if (16 != var8.dh_fld) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld + 1);
							}

							return;
						}

						if (var6 == kn.av_fld.ag(893296546)) {
							Object var39;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var39 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)18);
							} else {
								var39 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var39, null, ae_fld[var5], 0, var19, var21);
							if (var8.dd_fld) {
								if (var5 == 0) {
									fp.an_fld[var1][var2][1 + var3] = 50;
								} else if (1 == var5) {
									fp.an_fld[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									fp.an_fld[var1][1 + var2][var3] = 50;
								} else if (var5 == 3) {
									fp.an_fld[var1][var2][var3] = 50;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, 351434284);
							}

							return;
						}

						if (var6 == kn.ae_fld.ag(-1156799530)) {
							Object var38;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var38 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)82);
							} else {
								var38 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bh(var1, var2, var3, var16, 1, 1, (em)var38, 0, var19, var21);
							if (0 != var8.cu_fld && null != var7) {
								var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
							}

							if (var8.dh_fld != 16) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld / 2 + 1);
							}

							return;
						}

						if (var6 == kn.ah_fld.ag(-1309648529)) {
							Object var37;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var37 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)81);
							} else {
								var37 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var37, null, av_fld[var5], 0, ah_fld[var5], aw_fld[var5], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.aw_fld.ag(-2032524327)) {
							int var35 = 16;
							long var47 = var22.cd(var1, var2, var3);
							if (0L != var47) {
								var35 = ko.az(bj.ae(var47)).dh_fld * -1071654907;
							}

							var35++;
							Object var52;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var52 = oe.lk(var8, kn.ah_fld.ag(-1876381553), var5, var15, var17, var16, var18, (byte)98);
							} else {
								var52 = new dz(var0, var4, kn.ah_fld.ag(-1419656425), var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var52, null, av_fld[var5], 0, var35 * ah_fld[var5], aw_fld[var5] * var35, 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.ay_fld.ag(-194675177)) {
							int var33 = 8;
							long var46 = ev.ml(var22, var1, var2, var3);
							if (0L != var46) {
								var33 = ko.az(bj.ae(var46)).dh_fld * -1071654907 / 2;
							}

							var33++;
							Object var51;
							if (var8.dc_fld == -1 && null == var8.dy_fld) {
								var51 = oe.lk(var8, kn.ah_fld.ag(-163420101), 4 + var5, var15, var17, var16, var18, (byte)57);
							} else {
								var51 = new dz(var0, var4, kn.ah_fld.ag(1070341232), var5 + 4, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var51, null, 256, var5, ay_fld[var5] * var33, var33 * as_fld[var5], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.as_fld.ag(322711084)) {
							int var45 = var5 + 2 & 3;
							Object var32;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var32 = oe.lk(var8, kn.ah_fld.ag(-460682401), var45 + 4, var15, var17, var16, var18, (byte)48);
							} else {
								var32 = new dz(var0, var4, kn.ah_fld.ag(963694231), 4 + var45, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var32, null, 256, var45, ay_fld[var45], as_fld[var45], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.ar_fld.ag(795657502)) {
							int var30 = 8;
							long var24 = ev.ml(var22, var1, var2, var3);
							if (var24 != 0L) {
								var30 = ko.az(bj.ae(var24)).dh_fld * -1071654907 / 2;
							}

							var30++;
							int var28 = var5 + 2 & 3;
							Object var26;
							Object var27;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var26 = oe.lk(var8, kn.ah_fld.ag(-722066042), 4 + var5, var15, var17, var16, var18, (byte)91);
								var27 = oe.lk(var8, kn.ah_fld.ag(605574250), 4 + var28, var15, var17, var16, var18, (byte)95);
							} else {
								var26 = new dz(var0, var4, kn.ah_fld.ag(-1255973400), 4 + var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
								var27 = new dz(var0, var4, kn.ah_fld.ag(1953577866), var28 + 4, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(
								var1, var2, var3, var16, (em)var26, (em)var27, 256, var5, ay_fld[var5] * var30, as_fld[var5] * var30, ay_fld[var28], as_fld[var28], var19, var21
							);
							return;
						}

						return;
					}
				}

				Object var29;
				if (var8.dc_fld == -1 && var8.dy_fld == null) {
					var29 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)66);
				} else {
					var29 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
				}

				var22.bh(var1, var2, var3, var16, 1, 1, (em)var29, 0, var19, var21);
				if (gk.ak(var6) && var6 != kn.al_fld.ag(-1437850404) && var1 > 0) {
					jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 2340;
				}

				if (0 != var8.cu_fld && null != var7) {
					var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
				}
			}
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIILgn;)V"
	)
	static final void cs(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, gn var7) throws EOFException {
		if (!client.gk_fld || (var0.al_fld[0][var2][var3] & 2) != 0 || (var0.al_fld[var1][var2][var3] & 16) == 0) {
			if (var1 < ar_fld) {
				ar_fld = var1 * -1607750309;
			}

			oe var8 = ko.az(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = 379764681 * var8.cb_fld;
				var10 = -1271948534 * var8.co_fld;
			} else {
				var9 = var8.co_fld * -572595180;
				var10 = var8.cb_fld;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.ah_fld) {
				var11 = var2 + (var9 >> 1);
				var12 = (var9 + 1 >> 1) + var2;
			} else {
				var11 = var2;
				var12 = 1 + var2;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.aw_fld) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (1 + var10 >> 1);
			} else {
				var13 = var3;
				var14 = 1 + var3;
			}

			int[][] var15 = var0.af_fld[var1];
			int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2;
			int var17 = (var9 << 6) + (var2 << 7);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = ay(var1, var2, var3, 2, var8.cj_fld == 0, var4, 1771051742 * var0.ag_fld);
			int var21 = var6 + (var5 << 6);
			if (var8.dg_fld == 1) {
				var21 += 256;
			}

			if (var8.aq((short)-13684)) {
				var0.ay(var1, var2, var3, var8, var5, 104787645);
			}

			ev var22 = var0.az_fld;
			if (ef.aw(var6)) {
				if (!client.gk_fld || var8.cj_fld * -1640065743 != 0 || 1 == var8.cu_fld || var8.du_fld) {
					Object var44;
					if (var8.dc_fld == -1 && var8.dy_fld == null) {
						var44 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)36);
					} else {
						var44 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
					}

					ev.yo(var22, var1, var2, var3, var16, (em)var44, var19, var21);
					if (var8.cu_fld == 1 && var7 != null) {
						var7.ai(var2, var3, (short)-31568);
					}
				}
			} else if (jk.az(var6)) {
				Object var43;
				if (-1 == var8.dc_fld && null == var8.dy_fld) {
					var43 = oe.lk(var8, kn.ao_fld.ag(1543132966), var5, var15, var17, var16, var18, (byte)40);
				} else {
					var43 = new dz(var0, var4, kn.ao_fld.ag(-2033435539), var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
				}

				if (null != var43 && var22.bh(var1, var2, var3, var16, var9, var10, (em)var43, var6 == kn.ab_fld.ag(-979905612) ? 256 : 0, var19, var21) && var8.dd_fld) {
					int var49 = 15;
					if (var43 instanceof fn) {
						var49 = ((fn)var43).ac() / 4;
						if (var49 > 30) {
							var49 = 30;
						}
					}

					for (int var50 = 0; var50 <= var9; var50++) {
						for (int var53 = 0; var53 <= var10; var53++) {
							if (var49 > fp.an_fld[var1][var2 + var50][var3 + var53]) {
								fp.an_fld[var1][var50 + var2][var3 + var53] = (byte)var49;
							}
						}
					}
				}

				if (0 != var8.cu_fld && var7 != null) {
					var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
				}
			} else {
				if (!gk.ak(var6)) {
					boolean var23 = var6 >= kn.ai_fld.at_fld && var6 <= kn.ad_fld.at_fld;
					if (!var23) {
						if (var6 == kn.ak_fld.ag(950927517)) {
							Object var42;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var42 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)107);
							} else {
								var42 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var42, null, av_fld[var5], 0, var19, var21);
							if (var5 == 0) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3] = (byte)2125048908;
									fp.an_fld[var1][var2][var3 + 1] = (byte)1079751653;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 527573630;
								}
							} else if (var5 == 1) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3 + 1] = (byte)-111653314;
									fp.an_fld[var1][var2 + 1][1 + var3] = (byte)-1562831001;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3 + 1] = jw.ab_fld[var1][var2][var3 + 1] | 1170;
								}
							} else if (2 == var5) {
								if (var8.dd_fld) {
									fp.an_fld[var1][1 + var2][var3] = (byte)683318354;
									fp.an_fld[var1][1 + var2][var3 + 1] = (byte)2035657426;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][1 + var2][var3] = jw.ab_fld[var1][1 + var2][var3] | -302289865;
								}
							} else if (3 == var5) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3] = 50;
									fp.an_fld[var1][var2 + 1][var3] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | -187898354;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -759126935);
							}

							if (16 != var8.dh_fld) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld + 1);
							}

							return;
						}

						if (var6 == kn.ag_fld.ag(-356243283)) {
							Object var41;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var41 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)62);
							} else {
								var41 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var41, null, ae_fld[var5], 0, var19, var21);
							if (var8.dd_fld) {
								if (var5 == 0) {
									fp.an_fld[var1][var2][var3 + 1] = (byte)-2097507419;
								} else if (1 == var5) {
									fp.an_fld[var1][var2 + 1][var3 + 1] = 50;
								} else if (2 == var5) {
									fp.an_fld[var1][var2 + 1][var3] = (byte)-1719049002;
								} else if (3 == var5) {
									fp.an_fld[var1][var2][var3] = 50;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -536428234);
							}

							return;
						}

						if (var6 == kn.az_fld.ag(-743053803)) {
							int var40 = 1 + var5 & 3;
							Object var25;
							Object var48;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var48 = oe.lk(var8, var6, var5 + 4, var15, var17, var16, var18, (byte)122);
								var25 = oe.lk(var8, var6, var40, var15, var17, var16, var18, (byte)20);
							} else {
								var48 = new dz(var0, var4, var6, 4 + var5, var1, var2, var3, 1432135703 * var8.dc_fld, var8.dp_fld, null);
								var25 = new dz(var0, var4, var6, var40, var1, var2, var3, -532535639 * var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var48, (em)var25, av_fld[var5], av_fld[var40], var19, var21);
							if (var8.cl_fld) {
								if (var5 == 0) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | -924805926;
									jw.ab_fld[var1][var2][1 + var3] = jw.ab_fld[var1][var2][1 + var3] | 2035686273;
								} else if (var5 == 1) {
									jw.ab_fld[var1][var2][1 + var3] = jw.ab_fld[var1][var2][1 + var3] | 1170;
									jw.ab_fld[var1][1 + var2][var3] = jw.ab_fld[var1][1 + var2][var3] | 1329816215;
								} else if (2 == var5) {
									jw.ab_fld[var1][var2 + 1][var3] = jw.ab_fld[var1][var2 + 1][var3] | 585;
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | -1476201086;
								} else if (var5 == 3) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | -1481508226;
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 82863742;
								}
							}

							if (0 != var8.cu_fld && var7 != null) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -403250168);
							}

							if (16 != var8.dh_fld) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld + 1);
							}

							return;
						}

						if (var6 == kn.av_fld.ag(2042260631)) {
							Object var39;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var39 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)95);
							} else {
								var39 = new dz(var0, var4, var6, var5, var1, var2, var3, -1176237233 * var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var39, null, ae_fld[var5], 0, var19, var21);
							if (var8.dd_fld) {
								if (var5 == 0) {
									fp.an_fld[var1][var2][1 + var3] = 50;
								} else if (1 == var5) {
									fp.an_fld[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									fp.an_fld[var1][1 + var2][var3] = 50;
								} else if (var5 == 3) {
									fp.an_fld[var1][var2][var3] = (byte)992909670;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -1262252612);
							}

							return;
						}

						if (var6 == kn.ae_fld.ag(-1900195574)) {
							Object var38;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var38 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)93);
							} else {
								var38 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bh(var1, var2, var3, var16, 1, 1, (em)var38, 0, var19, var21);
							if (0 != var8.cu_fld && null != var7) {
								var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
							}

							if (var8.dh_fld != 16) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld / 2 + 1);
							}

							return;
						}

						if (var6 == kn.ah_fld.ag(833008254)) {
							Object var37;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var37 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)90);
							} else {
								var37 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld * -421228883, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var37, null, av_fld[var5], 0, ah_fld[var5], aw_fld[var5], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.aw_fld.ag(-662714958)) {
							int var35 = 16;
							long var47 = var22.cd(var1, var2, var3);
							if (0L != var47) {
								var35 = ko.az(bj.ae(var47)).dh_fld * 1176962749;
							}

							var35++;
							Object var52;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var52 = oe.lk(var8, kn.ah_fld.ag(-1034791326), var5, var15, var17, var16, var18, (byte)125);
							} else {
								var52 = new dz(var0, var4, kn.ah_fld.ag(-405664994), var5, var1, var2, var3, 1333481715 * var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var52, null, av_fld[var5], 0, var35 * ah_fld[var5], aw_fld[var5] * var35, 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.ay_fld.ag(-1881171643)) {
							int var33 = 8;
							long var46 = ev.ml(var22, var1, var2, var3);
							if (0L != var46) {
								var33 = ko.az(bj.ae(var46)).dh_fld * -1071654907 / 2;
							}

							var33++;
							Object var51;
							if (var8.dc_fld == -1 && null == var8.dy_fld) {
								var51 = oe.lk(var8, kn.ah_fld.ag(-112140347), 4 + var5, var15, var17, var16, var18, (byte)13);
							} else {
								var51 = new dz(var0, var4, kn.ah_fld.ag(-931180485), var5 + 4, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var51, null, 256, var5, ay_fld[var5] * var33, var33 * as_fld[var5], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.as_fld.ag(901539610)) {
							int var45 = var5 + 2 & 3;
							Object var32;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var32 = oe.lk(var8, kn.ah_fld.ag(-935824265), var45 + 4, var15, var17, var16, var18, (byte)46);
							} else {
								var32 = new dz(var0, var4, kn.ah_fld.ag(-1334648811), 4 + var45, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var32, null, -1771631340, var45, ay_fld[var45], as_fld[var45], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.ar_fld.ag(-94460834)) {
							int var30 = 8;
							long var24 = ev.ml(var22, var1, var2, var3);
							if (var24 != 0L) {
								var30 = ko.az(bj.ae(var24)).dh_fld * -1030755066 / 2;
							}

							var30++;
							int var28 = var5 + 2 & 3;
							Object var26;
							Object var27;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var26 = oe.lk(var8, kn.ah_fld.ag(672543950), 4 + var5, var15, var17, var16, var18, (byte)24);
								var27 = oe.lk(var8, kn.ah_fld.ag(1796580759), 4 + var28, var15, var17, var16, var18, (byte)101);
							} else {
								var26 = new dz(var0, var4, kn.ah_fld.ag(-560925956), 4 + var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
								var27 = new dz(var0, var4, kn.ah_fld.ag(152107032), var28 + 4, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(
								var1, var2, var3, var16, (em)var26, (em)var27, 256, var5, ay_fld[var5] * var30, as_fld[var5] * var30, ay_fld[var28], as_fld[var28], var19, var21
							);
							return;
						}

						return;
					}
				}

				Object var29;
				if (var8.dc_fld == -1 && var8.dy_fld == null) {
					var29 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)10);
				} else {
					var29 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
				}

				var22.bh(var1, var2, var3, var16, 1, 1, (em)var29, 0, var19, var21);
				if (gk.ak(var6) && var6 != kn.al_fld.ag(1522766254) && var1 > 0) {
					jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | -185979219;
				}

				if (0 != var8.cu_fld && null != var7) {
					var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
				}
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIILgn;)V"
	)
	static final void cp(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, gn var7) throws EOFException {
		if (!client.gk_fld || (var0.al_fld[0][var2][var3] & 2) != 0 || (var0.al_fld[var1][var2][var3] & 16) == 0) {
			if (var1 < ar_fld) {
				ar_fld = var1;
			}

			oe var8 = ko.az(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = var8.cb_fld;
				var10 = var8.co_fld;
			} else {
				var9 = var8.co_fld;
				var10 = var8.cb_fld;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.ah_fld) {
				var11 = var2 + (var9 >> 1);
				var12 = (var9 + 1 >> 1) + var2;
			} else {
				var11 = var2;
				var12 = 1 + var2;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.aw_fld) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (1 + var10 >> 1);
			} else {
				var13 = var3;
				var14 = 1 + var3;
			}

			int[][] var15 = var0.af_fld[var1];
			int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2;
			int var17 = (var9 << 6) + (var2 << 7);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = ay(var1, var2, var3, 2, var8.cj_fld == 0, var4, var0.ag_fld);
			int var21 = var6 + (var5 << 6);
			if (var8.dg_fld == 1) {
				var21 += 256;
			}

			if (var8.aq((short)-11886)) {
				var0.ay(var1, var2, var3, var8, var5, -1848288720);
			}

			ev var22 = var0.az_fld;
			if (ef.aw(var6)) {
				if (!client.gk_fld || var8.cj_fld != 0 || 1 == var8.cu_fld || var8.du_fld) {
					Object var44;
					if (var8.dc_fld == -1 && var8.dy_fld == null) {
						var44 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)124);
					} else {
						var44 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
					}

					ev.yo(var22, var1, var2, var3, var16, (em)var44, var19, var21);
					if (var8.cu_fld == 1 && var7 != null) {
						var7.ai(var2, var3, (short)-25829);
					}
				}
			} else if (jk.az(var6)) {
				Object var43;
				if (-1 == var8.dc_fld && null == var8.dy_fld) {
					var43 = oe.lk(var8, kn.ao_fld.ag(1919434138), var5, var15, var17, var16, var18, (byte)10);
				} else {
					var43 = new dz(var0, var4, kn.ao_fld.ag(-778073542), var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
				}

				if (null != var43 && var22.bh(var1, var2, var3, var16, var9, var10, (em)var43, var6 == kn.ab_fld.ag(714164066) ? 256 : 0, var19, var21) && var8.dd_fld) {
					int var49 = 15;
					if (var43 instanceof fn) {
						var49 = ((fn)var43).ac() / 4;
						if (var49 > 30) {
							var49 = 30;
						}
					}

					for (int var50 = 0; var50 <= var9; var50++) {
						for (int var53 = 0; var53 <= var10; var53++) {
							if (var49 > fp.an_fld[var1][var2 + var50][var3 + var53]) {
								fp.an_fld[var1][var50 + var2][var3 + var53] = (byte)var49;
							}
						}
					}
				}

				if (0 != var8.cu_fld && var7 != null) {
					var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
				}
			} else {
				if (!gk.ak(var6)) {
					boolean var23 = var6 >= kn.ai_fld.at_fld && var6 <= kn.ad_fld.at_fld;
					if (!var23) {
						if (var6 == kn.ak_fld.ag(953804399)) {
							Object var42;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var42 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)50);
							} else {
								var42 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var42, null, av_fld[var5], 0, var19, var21);
							if (var5 == 0) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3] = 50;
									fp.an_fld[var1][var2][var3 + 1] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 585;
								}
							} else if (var5 == 1) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3 + 1] = 50;
									fp.an_fld[var1][var2 + 1][1 + var3] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3 + 1] = jw.ab_fld[var1][var2][var3 + 1] | 1170;
								}
							} else if (2 == var5) {
								if (var8.dd_fld) {
									fp.an_fld[var1][1 + var2][var3] = 50;
									fp.an_fld[var1][1 + var2][var3 + 1] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][1 + var2][var3] = jw.ab_fld[var1][1 + var2][var3] | 585;
								}
							} else if (3 == var5) {
								if (var8.dd_fld) {
									fp.an_fld[var1][var2][var3] = 50;
									fp.an_fld[var1][var2 + 1][var3] = 50;
								}

								if (var8.cl_fld) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 1170;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -967071095);
							}

							if (16 != var8.dh_fld) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld + 1);
							}

							return;
						}

						if (var6 == kn.ag_fld.ag(1310715397)) {
							Object var41;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var41 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)61);
							} else {
								var41 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var41, null, ae_fld[var5], 0, var19, var21);
							if (var8.dd_fld) {
								if (var5 == 0) {
									fp.an_fld[var1][var2][var3 + 1] = 50;
								} else if (1 == var5) {
									fp.an_fld[var1][var2 + 1][var3 + 1] = 50;
								} else if (2 == var5) {
									fp.an_fld[var1][var2 + 1][var3] = 50;
								} else if (3 == var5) {
									fp.an_fld[var1][var2][var3] = 50;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -1161393751);
							}

							return;
						}

						if (var6 == kn.az_fld.ag(1046270145)) {
							int var40 = 1 + var5 & 3;
							Object var25;
							Object var48;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var48 = oe.lk(var8, var6, var5 + 4, var15, var17, var16, var18, (byte)32);
								var25 = oe.lk(var8, var6, var40, var15, var17, var16, var18, (byte)99);
							} else {
								var48 = new dz(var0, var4, var6, 4 + var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
								var25 = new dz(var0, var4, var6, var40, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var48, (em)var25, av_fld[var5], av_fld[var40], var19, var21);
							if (var8.cl_fld) {
								if (var5 == 0) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 585;
									jw.ab_fld[var1][var2][1 + var3] = jw.ab_fld[var1][var2][1 + var3] | 1170;
								} else if (var5 == 1) {
									jw.ab_fld[var1][var2][1 + var3] = jw.ab_fld[var1][var2][1 + var3] | 1170;
									jw.ab_fld[var1][1 + var2][var3] = jw.ab_fld[var1][1 + var2][var3] | 585;
								} else if (2 == var5) {
									jw.ab_fld[var1][var2 + 1][var3] = jw.ab_fld[var1][var2 + 1][var3] | 585;
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 1170;
								} else if (var5 == 3) {
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 1170;
									jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 585;
								}
							}

							if (0 != var8.cu_fld && var7 != null) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -1133755840);
							}

							if (16 != var8.dh_fld) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld + 1);
							}

							return;
						}

						if (var6 == kn.av_fld.ag(410527443)) {
							Object var39;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var39 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)111);
							} else {
								var39 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.be(var1, var2, var3, var16, (em)var39, null, ae_fld[var5], 0, var19, var21);
							if (var8.dd_fld) {
								if (var5 == 0) {
									fp.an_fld[var1][var2][1 + var3] = 50;
								} else if (1 == var5) {
									fp.an_fld[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									fp.an_fld[var1][1 + var2][var3] = 50;
								} else if (var5 == 3) {
									fp.an_fld[var1][var2][var3] = 50;
								}
							}

							if (0 != var8.cu_fld && null != var7) {
								gn.kw(var7, var2, var3, var6, var5, var8.ci_fld, -939577197);
							}

							return;
						}

						if (var6 == kn.ae_fld.ag(-1837952561)) {
							Object var38;
							if (var8.dc_fld == -1 && var8.dy_fld == null) {
								var38 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)73);
							} else {
								var38 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bh(var1, var2, var3, var16, 1, 1, (em)var38, 0, var19, var21);
							if (0 != var8.cu_fld && null != var7) {
								var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
							}

							if (var8.dh_fld != 16) {
								ev.ls(var22, var1, var2, var3, var8.dh_fld / 2 + 1);
							}

							return;
						}

						if (var6 == kn.ah_fld.ag(-337920851)) {
							Object var37;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var37 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)60);
							} else {
								var37 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var37, null, av_fld[var5], 0, ah_fld[var5], aw_fld[var5], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.aw_fld.ag(-1206040291)) {
							int var35 = 16;
							long var47 = var22.cd(var1, var2, var3);
							if (0L != var47) {
								var35 = ko.az(bj.ae(var47)).dh_fld * -1071654907;
							}

							var35++;
							Object var52;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var52 = oe.lk(var8, kn.ah_fld.ag(670905789), var5, var15, var17, var16, var18, (byte)77);
							} else {
								var52 = new dz(var0, var4, kn.ah_fld.ag(-386383416), var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var52, null, av_fld[var5], 0, var35 * ah_fld[var5], aw_fld[var5] * var35, 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.ay_fld.ag(431027189)) {
							int var33 = 8;
							long var46 = ev.ml(var22, var1, var2, var3);
							if (0L != var46) {
								var33 = ko.az(bj.ae(var46)).dh_fld * -1071654907 / 2;
							}

							var33++;
							Object var51;
							if (var8.dc_fld == -1 && null == var8.dy_fld) {
								var51 = oe.lk(var8, kn.ah_fld.ag(276394771), 4 + var5, var15, var17, var16, var18, (byte)127);
							} else {
								var51 = new dz(var0, var4, kn.ah_fld.ag(-641495024), var5 + 4, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var51, null, 256, var5, ay_fld[var5] * var33, var33 * as_fld[var5], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.as_fld.ag(-144115204)) {
							int var45 = var5 + 2 & 3;
							Object var32;
							if (-1 == var8.dc_fld && null == var8.dy_fld) {
								var32 = oe.lk(var8, kn.ah_fld.ag(-1144990286), var45 + 4, var15, var17, var16, var18, (byte)37);
							} else {
								var32 = new dz(var0, var4, kn.ah_fld.ag(1062706121), 4 + var45, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(var1, var2, var3, var16, (em)var32, null, 256, var45, ay_fld[var45], as_fld[var45], 0, 0, var19, var21);
							return;
						}

						if (var6 == kn.ar_fld.ag(1131704426)) {
							int var30 = 8;
							long var24 = ev.ml(var22, var1, var2, var3);
							if (var24 != 0L) {
								var30 = ko.az(bj.ae(var24)).dh_fld * -1071654907 / 2;
							}

							var30++;
							int var28 = var5 + 2 & 3;
							Object var26;
							Object var27;
							if (-1 == var8.dc_fld && var8.dy_fld == null) {
								var26 = oe.lk(var8, kn.ah_fld.ag(1093165467), 4 + var5, var15, var17, var16, var18, (byte)74);
								var27 = oe.lk(var8, kn.ah_fld.ag(1634621897), 4 + var28, var15, var17, var16, var18, (byte)106);
							} else {
								var26 = new dz(var0, var4, kn.ah_fld.ag(-1850843911), 4 + var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
								var27 = new dz(var0, var4, kn.ah_fld.ag(-144304012), var28 + 4, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
							}

							var22.bs(
								var1, var2, var3, var16, (em)var26, (em)var27, 256, var5, ay_fld[var5] * var30, as_fld[var5] * var30, ay_fld[var28], as_fld[var28], var19, var21
							);
							return;
						}

						return;
					}
				}

				Object var29;
				if (var8.dc_fld == -1 && var8.dy_fld == null) {
					var29 = oe.lk(var8, var6, var5, var15, var17, var16, var18, (byte)33);
				} else {
					var29 = new dz(var0, var4, var6, var5, var1, var2, var3, var8.dc_fld, var8.dp_fld, null);
				}

				var22.bh(var1, var2, var3, var16, 1, 1, (em)var29, 0, var19, var21);
				if (gk.ak(var6) && var6 != kn.al_fld.ag(2013568454) && var1 > 0) {
					jw.ab_fld[var1][var2][var3] = jw.ab_fld[var1][var2][var3] | 2340;
				}

				if (0 != var8.cu_fld && null != var7) {
					var7.an(var2, var3, var9, var10, var8.ci_fld, (byte)16);
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ac() {
		ar_fld = -836973041;
		cq.af_fld = new short[4][104][-1784592880];
		tx.al_fld = new short[4][104][104];
		rt.au_fld = new byte[4][104][104];
		us.ax_fld = new byte[4][-1593580122][-1837572858];
		jw.ab_fld = new int[4][105][105];
		fp.an_fld = new byte[4][-1080795233][105];
		kf.aa_fld = new int[105][105];
		hv.ai_fld = new int[1032022151];
		or.aq_fld = new int[-1715420430];
		cl.am_fld = new int[1364724047];
		lz.ad_fld = new int[990084227];
		ao_fld = new int[104];
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	static final void cn(dx var0) throws EOFException {
		int var1 = var0.ah_fld;
		int var2 = var0.aw_fld;
		int[][][] var3 = var0.af_fld;
		byte[][][] var4 = var0.al_fld;
		ev var5 = var0.az_fld;
		gn[] var6 = var0.av_fld;

		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < var1; var8++) {
				for (int var9 = 0; var9 < var2; var9++) {
					if (1 == (var0.al_fld[var7][var8][var9] & 1)) {
						int var10 = var7;
						if (2 == (var0.al_fld[1][var8][var9] & 2)) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].aa(var8, var9, (byte)-44);
						}
					}
				}
			}
		}

		ap_fld = ap_fld + ((int)(Math.random() * 5.0) - 2) * 1061236965;
		if (ap_fld < -8) {
			ap_fld = 100038872;
		}

		if (ap_fld > 8) {
			ap_fld = -100038872;
		}

		at_fld = at_fld + ((int)(Math.random() * 5.0) - 2) * 1923545515;
		if (at_fld < -16) {
			at_fld = -711957168;
		}

		if (at_fld > 16) {
			at_fld = 711957168;
		}

		for (int var48 = 0; var48 < 4; var48++) {
			byte[][] var51 = fp.an_fld[var48];
			byte var54 = 96;
			short var56 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int)Math.sqrt(5100.0);
			int var15 = var14 * 768 >> 8;

			for (int var16 = 1; var16 < var2 - 1; var16++) {
				for (int var17 = 1; var17 < var1 - 1; var17++) {
					int var18 = var3[var48][1 + var17][var16] - var3[var48][var17 - 1][var16];
					int var19 = var3[var48][var17][1 + var16] - var3[var48][var17][var16 - 1];
					int var20 = (int)Math.sqrt(var19 * var19 + var18 * var18 + 65536);
					int var21 = (var18 << 8) / var20;
					int var22 = 65536 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = 96 + (var23 * -50 + var22 * -10 + -50 * var21) / var15;
					int var25 = (var51[var17][var16] >> 1)
						+ (var51[1 + var17][var16] >> 3)
						+ (var51[var17 - 1][var16] >> 2)
						+ (var51[var17][var16 - 1] >> 2)
						+ (var51[var17][var16 + 1] >> 3);
					kf.aa_fld[var17][var16] = var24 - var25;
				}
			}

			for (int var63 = 0; var63 < var2; var63++) {
				hv.ai_fld[var63] = 0;
				or.aq_fld[var63] = 0;
				cl.am_fld[var63] = 0;
				lz.ad_fld[var63] = 0;
				ao_fld[var63] = 0;
			}

			for (int var64 = -5; var64 < 5 + var1; var64++) {
				for (int var67 = 0; var67 < var2; var67++) {
					int var71 = 5 + var64;
					if (var71 >= 0 && var71 < var1) {
						int var76 = (int)ji.af(15, -819540062);
						int var82 = cq.af_fld[var48][var71][var67] & var76;
						if (var82 > 0) {
							pl var88 = ew.ak(var82 - 1);
							hv.ai_fld[var67] = hv.ai_fld[var67] + var88.av_fld;
							or.aq_fld[var67] = or.aq_fld[var67] + var88.ae_fld;
							cl.am_fld[var67] = cl.am_fld[var67] + var88.ah_fld;
							lz.ad_fld[var67] = lz.ad_fld[var67] + var88.aw_fld;
							ao_fld[var67]++;
						}
					}

					int var77 = var64 - 5;
					if (var77 >= 0 && var77 < var1) {
						int var83 = (int)ji.af(15, 259324689);
						int var89 = cq.af_fld[var48][var77][var67] & var83;
						if (var89 > 0) {
							pl var94 = ew.ak(var89 - 1);
							hv.ai_fld[var67] = hv.ai_fld[var67] - var94.av_fld;
							or.aq_fld[var67] = or.aq_fld[var67] - var94.ae_fld;
							cl.am_fld[var67] = cl.am_fld[var67] - var94.ah_fld;
							lz.ad_fld[var67] = lz.ad_fld[var67] - var94.aw_fld;
							ao_fld[var67]--;
						}
					}
				}

				if (var64 >= 1 && var64 < var1 - 1) {
					int var68 = 0;
					int var72 = 0;
					int var78 = 0;
					int var84 = 0;
					int var90 = 0;

					for (int var95 = -5; var95 < 5 + var2; var95++) {
						int var106 = 5 + var95;
						if (var106 >= 0 && var106 < var2) {
							var68 += hv.ai_fld[var106];
							var72 += or.aq_fld[var106];
							var78 += cl.am_fld[var106];
							var84 += lz.ad_fld[var106];
							var90 += ao_fld[var106];
						}

						int var110 = var95 - 5;
						if (var110 >= 0 && var110 < var2) {
							var68 -= hv.ai_fld[var110];
							var72 -= or.aq_fld[var110];
							var78 -= cl.am_fld[var110];
							var84 -= lz.ad_fld[var110];
							var90 -= ao_fld[var110];
						}

						if (var95 >= 1 && var95 < var2 - 1 && (!client.gk_fld || (var4[0][var64][var95] & 2) != 0 || 0 == (var4[var48][var64][var95] & 16))) {
							if (var48 < ar_fld) {
								ar_fld = var48;
							}

							int var114 = (int)ji.af(15, -1812903566);
							int var26 = cq.af_fld[var48][var64][var95] & var114;
							int var27 = tx.al_fld[var48][var64][var95] & var114;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var48][var64][var95];
								int var29 = var3[var48][1 + var64][var95];
								int var30 = var3[var48][1 + var64][1 + var95];
								int var31 = var3[var48][var64][1 + var95];
								int var32 = kf.aa_fld[var64][var95];
								int var33 = kf.aa_fld[1 + var64][var95];
								int var34 = kf.aa_fld[1 + var64][1 + var95];
								int var35 = kf.aa_fld[var64][1 + var95];
								int var36 = -1;
								int var37 = -1;
								if (false) {
									int var38 = var68 * 256 / var84;
									int var39 = var72 / var90;
									int var40 = var78 / var90;
									var36 = mc.ab(var38, var39, var40);
									var38 = ap_fld + var38 & 0xFF;
									var40 += at_fld;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = mc.ab(var38, var39, var40);
								}

								if (false) {
									boolean var122 = true;
									if (var26 == 0 && rt.au_fld[var48][var64][var95] != 0) {
										var122 = false;
									}

									if (false) {
										int var127 = var27 - 1;
										ov var41 = (ov)ov.ay_fld.ak(var127);
										ov var124;
										if (var41 != null) {
											var124 = var41;
										} else {
											byte[] var42 = ha.aw_fld.bb(4, var127, 584982574);
											var41 = new ov();
											if (null != var42) {
												var41.av(new xi(var42), var127);
											}

											ov.mt(var41, (byte)-24);
											ov.ay_fld.az(var41, var127);
											var124 = var41;
										}

										if (!var124.af_fld) {
											var122 = false;
										}
									}

									if (var122 && var29 == var28 && var30 == var28 && var28 == var31) {
										jw.ab_fld[var48][var64][var95] = jw.ab_fld[var48][var64][var95] | 2340;
									}
								}

								int var123 = 0;
								if (false) {
									var123 = fc.az_fld[jf.ad(var37, 96)];
								}

								if (0 == var27) {
									var5.bm(
										var48,
										var64,
										var95,
										0,
										0,
										-1,
										var28,
										var29,
										var30,
										var31,
										jf.ad(var36, var32),
										jf.ad(var36, var33),
										jf.ad(var36, var34),
										jf.ad(var36, var35),
										0,
										0,
										0,
										0,
										var123,
										0
									);
								} else {
									int var125 = rt.au_fld[var48][var64][var95] + 1;
									byte var128 = us.ax_fld[var48][var64][var95];
									ov var130 = kl.ag(var27 - 1);
									int var131 = var130.ar_fld;
									int var43;
									int var44;
									if (var131 >= 0) {
										var44 = fc.ar_fld.aq_fld.av(var131, (byte)-13);
										var43 = -1;
									} else if (16711935 == var130.as_fld) {
										var43 = -2;
										var131 = -1;
										var44 = -2;
									} else {
										var43 = mc.ab(var130.au_fld, var130.ax_fld, var130.an_fld);
										int var45 = var130.au_fld + ap_fld & 0xFF;
										int var46 = at_fld + var130.an_fld;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = mc.ab(var45, var130.ax_fld, var46);
									}

									int var133 = 0;
									if (false) {
										var133 = fc.az_fld[pt.ao(var44, 96)];
									}

									if (-1 != var130.al_fld) {
										int var134 = ap_fld + var130.aa_fld & 0xFF;
										int var47 = at_fld + var130.aq_fld;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = mc.ab(var134, var130.ai_fld, var47);
										var133 = fc.az_fld[pt.ao(var44, 96)];
									}

									var5.bm(
										var48,
										var64,
										var95,
										var125,
										var128,
										var131,
										var28,
										var29,
										var30,
										var31,
										jf.ad(var36, var32),
										jf.ad(var36, var33),
										jf.ad(var36, var34),
										jf.ad(var36, var35),
										pt.ao(var43, var32),
										pt.ao(var43, var33),
										pt.ao(var43, var34),
										pt.ao(var43, var35),
										var123,
										var133
									);
								}
							}
						}
					}
				}
			}

			for (int var65 = 1; var65 < var2 - 1; var65++) {
				for (int var69 = 1; var69 < var1 - 1; var69++) {
					int var96;
					if (0 != (var0.al_fld[var48][var69][var65] & 8)) {
						var96 = 0;
					} else if (var48 > 0 && (var0.al_fld[1][var69][var65] & 2) != 0) {
						var96 = var48 - 1;
					} else {
						var96 = var48;
					}

					ev.ux(var5, var48, var69, var65, var96);
				}
			}

			cq.af_fld[var48] = (short[][])null;
			tx.al_fld[var48] = (short[][])null;
			rt.au_fld[var48] = (byte[][])null;
			us.ax_fld[var48] = null;
			fp.an_fld[var48] = (byte[][])null;
		}

		var5.cs(-50, -10, -50);

		for (int var49 = 0; var49 < var1; var49++) {
			for (int var52 = 0; var52 < var2; var52++) {
				if ((var4[1][var49][var52] & 2) == 2) {
					var5.at(var49, var52);
				}
			}
		}

		if (var0.ak(-787091592)) {
			int var50 = var0.ah_fld;
			int var53 = var0.aw_fld;
			int[][][] var55 = var0.af_fld;
			ev var57 = var0.az_fld;
			byte var58 = 1;
			byte var59 = 2;
			byte var60 = 4;

			for (int var61 = 0; var61 < 4; var61++) {
				if (var61 > 0) {
					var58 <<= 3;
					var59 <<= 3;
					var60 <<= 3;
				}

				for (int var62 = 0; var62 <= var61; var62++) {
					for (int var66 = 0; var66 <= var53; var66++) {
						for (int var70 = 0; var70 <= var50; var70++) {
							if (0 != (jw.ab_fld[var62][var70][var66] & var58)) {
								int var73 = var66;
								int var79 = var66;
								int var85 = var62;
								int var91 = var62;

								while (var73 > 0 && 0 != (jw.ab_fld[var62][var70][var73 - 1] & var58)) {
									var73--;
								}

								while (var79 < var53 && 0 != (jw.ab_fld[var62][var70][1 + var79] & var58)) {
									var79++;
								}

								label529:
								while (var85 > 0) {
									for (int var97 = var73; var97 <= var79; var97++) {
										if (0 == (jw.ab_fld[var85 - 1][var70][var97] & var58)) {
											break label529;
										}
									}

									var85--;
								}

								label518:
								while (var91 < var61) {
									for (int var98 = var73; var98 <= var79; var98++) {
										if ((jw.ab_fld[1 + var91][var70][var98] & var58) == 0) {
											break label518;
										}
									}

									var91++;
								}

								int var99 = (var79 - var73 + 1) * (1 + var91 - var85);
								if (var99 >= 8) {
									short var107 = 240;
									int var111 = var55[var91][var70][var73] - var107;
									int var115 = var55[var85][var70][var73];
									ev.my(var57, var61, 1, var70 * 128, var70 * 128, 128 * var73, 128 + 128 * var79, var111, var115);

									for (int var117 = var85; var117 <= var91; var117++) {
										for (int var119 = var73; var119 <= var79; var119++) {
											jw.ab_fld[var117][var70][var119] = jw.ab_fld[var117][var70][var119] & ~var58;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var62][var70][var66] & var59)) {
								int var74 = var70;
								int var80 = var70;
								int var86 = var62;
								int var92 = var62;

								while (var74 > 0 && (jw.ab_fld[var62][var74 - 1][var66] & var59) != 0) {
									var74--;
								}

								while (var80 < var50 && 0 != (jw.ab_fld[var62][var80 + 1][var66] & var59)) {
									var80++;
								}

								label582:
								while (var86 > 0) {
									for (int var100 = var74; var100 <= var80; var100++) {
										if ((jw.ab_fld[var86 - 1][var100][var66] & var59) == 0) {
											break label582;
										}
									}

									var86--;
								}

								label571:
								while (var92 < var61) {
									for (int var101 = var74; var101 <= var80; var101++) {
										if (0 == (jw.ab_fld[1 + var92][var101][var66] & var59)) {
											break label571;
										}
									}

									var92++;
								}

								int var102 = (var92 + 1 - var86) * (var80 - var74 + 1);
								if (var102 >= 8) {
									short var108 = 240;
									int var112 = var55[var92][var74][var66] - var108;
									int var116 = var55[var86][var74][var66];
									ev.my(var57, var61, 2, var74 * 128, 128 * var80 + 128, var66 * 128, var66 * 128, var112, var116);

									for (int var118 = var86; var118 <= var92; var118++) {
										for (int var120 = var74; var120 <= var80; var120++) {
											jw.ab_fld[var118][var120][var66] = jw.ab_fld[var118][var120][var66] & ~var59;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var62][var70][var66] & var60)) {
								int var75 = var70;
								int var81 = var70;
								int var87 = var66;
								int var93 = var66;

								while (var87 > 0 && 0 != (jw.ab_fld[var62][var70][var87 - 1] & var60)) {
									var87--;
								}

								while (var93 < var53 && (jw.ab_fld[var62][var70][1 + var93] & var60) != 0) {
									var93++;
								}

								label635:
								while (var75 > 0) {
									for (int var103 = var87; var103 <= var93; var103++) {
										if ((jw.ab_fld[var62][var75 - 1][var103] & var60) == 0) {
											break label635;
										}
									}

									var75--;
								}

								label624:
								while (var81 < var50) {
									for (int var104 = var87; var104 <= var93; var104++) {
										if ((jw.ab_fld[var62][1 + var81][var104] & var60) == 0) {
											break label624;
										}
									}

									var81++;
								}

								if ((1 + (var81 - var75)) * (var93 - var87 + 1) >= 4) {
									int var105 = var55[var62][var75][var87];
									ev.my(var57, var61, 4, var75 * 128, 128 * var81 + 128, var87 * 128, var93 * 128 + 128, var105, var105);

									for (int var109 = var75; var109 <= var81; var109++) {
										for (int var113 = var87; var113 <= var93; var113++) {
											jw.ab_fld[var62][var109][var113] = jw.ab_fld[var62][var109][var113] & ~var60;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	static final void cr(dx var0) throws EOFException {
		int var1 = var0.ah_fld;
		int var2 = var0.aw_fld;
		int[][][] var3 = var0.af_fld;
		byte[][][] var4 = var0.al_fld;
		ev var5 = var0.az_fld;
		gn[] var6 = var0.av_fld;

		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < var1; var8++) {
				for (int var9 = 0; var9 < var2; var9++) {
					if (1 == (var0.al_fld[var7][var8][var9] & 1)) {
						int var10 = var7;
						if (2 == (var0.al_fld[1][var8][var9] & 2)) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].aa(var8, var9, (byte)-37);
						}
					}
				}
			}
		}

		ap_fld = ap_fld + ((int)(Math.random() * 5.0) - 2) * 1061236965;
		if (ap_fld < -8) {
			ap_fld = 100038872;
		}

		if (ap_fld > 8) {
			ap_fld = -100038872;
		}

		at_fld = at_fld + ((int)(Math.random() * 5.0) - 2) * 1923545515;
		if (at_fld < -16) {
			at_fld = -711957168;
		}

		if (at_fld > 16) {
			at_fld = 711957168;
		}

		for (int var48 = 0; var48 < 4; var48++) {
			byte[][] var51 = fp.an_fld[var48];
			byte var54 = 96;
			short var56 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int)Math.sqrt(5100.0);
			int var15 = var14 * 768 >> 8;

			for (int var16 = 1; var16 < var2 - 1; var16++) {
				for (int var17 = 1; var17 < var1 - 1; var17++) {
					int var18 = var3[var48][1 + var17][var16] - var3[var48][var17 - 1][var16];
					int var19 = var3[var48][var17][1 + var16] - var3[var48][var17][var16 - 1];
					int var20 = (int)Math.sqrt(var19 * var19 + var18 * var18 + 65536);
					int var21 = (var18 << 8) / var20;
					int var22 = 65536 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = 96 + (var23 * -50 + var22 * -10 + -50 * var21) / var15;
					int var25 = (var51[var17][var16] >> 1)
						+ (var51[1 + var17][var16] >> 3)
						+ (var51[var17 - 1][var16] >> 2)
						+ (var51[var17][var16 - 1] >> 2)
						+ (var51[var17][var16 + 1] >> 3);
					kf.aa_fld[var17][var16] = var24 - var25;
				}
			}

			for (int var63 = 0; var63 < var2; var63++) {
				hv.ai_fld[var63] = 0;
				or.aq_fld[var63] = 0;
				cl.am_fld[var63] = 0;
				lz.ad_fld[var63] = 0;
				ao_fld[var63] = 0;
			}

			for (int var64 = -5; var64 < 5 + var1; var64++) {
				for (int var67 = 0; var67 < var2; var67++) {
					int var71 = 5 + var64;
					if (var71 >= 0 && var71 < var1) {
						int var76 = (int)ji.af(15, -30377372);
						int var82 = cq.af_fld[var48][var71][var67] & var76;
						if (var82 > 0) {
							pl var88 = ew.ak(var82 - 1);
							hv.ai_fld[var67] = hv.ai_fld[var67] + var88.av_fld;
							or.aq_fld[var67] = or.aq_fld[var67] + var88.ae_fld;
							cl.am_fld[var67] = cl.am_fld[var67] + var88.ah_fld;
							lz.ad_fld[var67] = lz.ad_fld[var67] + var88.aw_fld;
							ao_fld[var67]++;
						}
					}

					int var77 = var64 - 5;
					if (var77 >= 0 && var77 < var1) {
						int var83 = (int)ji.af(15, -1210899870);
						int var89 = cq.af_fld[var48][var77][var67] & var83;
						if (var89 > 0) {
							pl var94 = ew.ak(var89 - 1);
							hv.ai_fld[var67] = hv.ai_fld[var67] - var94.av_fld;
							or.aq_fld[var67] = or.aq_fld[var67] - var94.ae_fld;
							cl.am_fld[var67] = cl.am_fld[var67] - var94.ah_fld;
							lz.ad_fld[var67] = lz.ad_fld[var67] - var94.aw_fld;
							ao_fld[var67]--;
						}
					}
				}

				if (var64 >= 1 && var64 < var1 - 1) {
					int var68 = 0;
					int var72 = 0;
					int var78 = 0;
					int var84 = 0;
					int var90 = 0;

					for (int var95 = -5; var95 < 5 + var2; var95++) {
						int var106 = 5 + var95;
						if (var106 >= 0 && var106 < var2) {
							var68 += hv.ai_fld[var106];
							var72 += or.aq_fld[var106];
							var78 += cl.am_fld[var106];
							var84 += lz.ad_fld[var106];
							var90 += ao_fld[var106];
						}

						int var110 = var95 - 5;
						if (var110 >= 0 && var110 < var2) {
							var68 -= hv.ai_fld[var110];
							var72 -= or.aq_fld[var110];
							var78 -= cl.am_fld[var110];
							var84 -= lz.ad_fld[var110];
							var90 -= ao_fld[var110];
						}

						if (var95 >= 1 && var95 < var2 - 1 && (!client.gk_fld || (var4[0][var64][var95] & 2) != 0 || 0 == (var4[var48][var64][var95] & 16))) {
							if (var48 < ar_fld) {
								ar_fld = var48;
							}

							int var114 = (int)ji.af(15, 752528683);
							int var26 = cq.af_fld[var48][var64][var95] & var114;
							int var27 = tx.al_fld[var48][var64][var95] & var114;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var48][var64][var95];
								int var29 = var3[var48][1 + var64][var95];
								int var30 = var3[var48][1 + var64][1 + var95];
								int var31 = var3[var48][var64][1 + var95];
								int var32 = kf.aa_fld[var64][var95];
								int var33 = kf.aa_fld[1 + var64][var95];
								int var34 = kf.aa_fld[1 + var64][1 + var95];
								int var35 = kf.aa_fld[var64][1 + var95];
								int var36 = -1;
								int var37 = -1;
								if (false) {
									int var38 = var68 * 256 / var84;
									int var39 = var72 / var90;
									int var40 = var78 / var90;
									var36 = mc.ab(var38, var39, var40);
									var38 = ap_fld + var38 & 0xFF;
									var40 += at_fld;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = mc.ab(var38, var39, var40);
								}

								if (false) {
									boolean var122 = true;
									if (var26 == 0 && rt.au_fld[var48][var64][var95] != 0) {
										var122 = false;
									}

									if (false) {
										int var127 = var27 - 1;
										ov var41 = (ov)ov.ay_fld.ak(var127);
										ov var124;
										if (var41 != null) {
											var124 = var41;
										} else {
											byte[] var42 = ha.aw_fld.bb(4, var127, 584982574);
											var41 = new ov();
											if (null != var42) {
												var41.av(new xi(var42), var127);
											}

											ov.mt(var41, (byte)-68);
											ov.ay_fld.az(var41, var127);
											var124 = var41;
										}

										if (!var124.af_fld) {
											var122 = false;
										}
									}

									if (var122 && var29 == var28 && var30 == var28 && var28 == var31) {
										jw.ab_fld[var48][var64][var95] = jw.ab_fld[var48][var64][var95] | 2340;
									}
								}

								int var123 = 0;
								if (false) {
									var123 = fc.az_fld[jf.ad(var37, 96)];
								}

								if (0 == var27) {
									var5.bm(
										var48,
										var64,
										var95,
										0,
										0,
										-1,
										var28,
										var29,
										var30,
										var31,
										jf.ad(var36, var32),
										jf.ad(var36, var33),
										jf.ad(var36, var34),
										jf.ad(var36, var35),
										0,
										0,
										0,
										0,
										var123,
										0
									);
								} else {
									int var125 = rt.au_fld[var48][var64][var95] + 1;
									byte var128 = us.ax_fld[var48][var64][var95];
									ov var130 = kl.ag(var27 - 1);
									int var131 = var130.ar_fld;
									int var43;
									int var44;
									if (var131 >= 0) {
										var44 = fc.ar_fld.aq_fld.av(var131, (byte)-42);
										var43 = -1;
									} else if (16711935 == var130.as_fld) {
										var43 = -2;
										var131 = -1;
										var44 = -2;
									} else {
										var43 = mc.ab(var130.au_fld, var130.ax_fld, var130.an_fld);
										int var45 = var130.au_fld + ap_fld & 0xFF;
										int var46 = at_fld + var130.an_fld;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = mc.ab(var45, var130.ax_fld, var46);
									}

									int var133 = 0;
									if (false) {
										var133 = fc.az_fld[pt.ao(var44, 96)];
									}

									if (-1 != var130.al_fld) {
										int var134 = ap_fld + var130.aa_fld & 0xFF;
										int var47 = at_fld + var130.aq_fld;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = mc.ab(var134, var130.ai_fld, var47);
										var133 = fc.az_fld[pt.ao(var44, 96)];
									}

									var5.bm(
										var48,
										var64,
										var95,
										var125,
										var128,
										var131,
										var28,
										var29,
										var30,
										var31,
										jf.ad(var36, var32),
										jf.ad(var36, var33),
										jf.ad(var36, var34),
										jf.ad(var36, var35),
										pt.ao(var43, var32),
										pt.ao(var43, var33),
										pt.ao(var43, var34),
										pt.ao(var43, var35),
										var123,
										var133
									);
								}
							}
						}
					}
				}
			}

			for (int var65 = 1; var65 < var2 - 1; var65++) {
				for (int var69 = 1; var69 < var1 - 1; var69++) {
					int var96;
					if (0 != (var0.al_fld[var48][var69][var65] & 8)) {
						var96 = 0;
					} else if (var48 > 0 && (var0.al_fld[1][var69][var65] & 2) != 0) {
						var96 = var48 - 1;
					} else {
						var96 = var48;
					}

					ev.ux(var5, var48, var69, var65, var96);
				}
			}

			cq.af_fld[var48] = (short[][])null;
			tx.al_fld[var48] = (short[][])null;
			rt.au_fld[var48] = null;
			us.ax_fld[var48] = (byte[][])null;
			fp.an_fld[var48] = (byte[][])null;
		}

		var5.cs(-50, -10, -50);

		for (int var49 = 0; var49 < var1; var49++) {
			for (int var52 = 0; var52 < var2; var52++) {
				if ((var4[1][var49][var52] & 2) == 2) {
					var5.at(var49, var52);
				}
			}
		}

		if (var0.ak(-787091592)) {
			int var50 = var0.ah_fld;
			int var53 = var0.aw_fld;
			int[][][] var55 = var0.af_fld;
			ev var57 = var0.az_fld;
			byte var58 = 1;
			byte var59 = 2;
			byte var60 = 4;

			for (int var61 = 0; var61 < 4; var61++) {
				if (var61 > 0) {
					var58 <<= 3;
					var59 <<= 3;
					var60 <<= 3;
				}

				for (int var62 = 0; var62 <= var61; var62++) {
					for (int var66 = 0; var66 <= var53; var66++) {
						for (int var70 = 0; var70 <= var50; var70++) {
							if (0 != (jw.ab_fld[var62][var70][var66] & var58)) {
								int var73 = var66;
								int var79 = var66;
								int var85 = var62;
								int var91 = var62;

								while (var73 > 0 && 0 != (jw.ab_fld[var62][var70][var73 - 1] & var58)) {
									var73--;
								}

								while (var79 < var53 && 0 != (jw.ab_fld[var62][var70][1 + var79] & var58)) {
									var79++;
								}

								label532:
								while (var85 > 0) {
									for (int var97 = var73; var97 <= var79; var97++) {
										if (0 == (jw.ab_fld[var85 - 1][var70][var97] & var58)) {
											break label532;
										}
									}

									var85--;
								}

								label521:
								while (var91 < var61) {
									for (int var98 = var73; var98 <= var79; var98++) {
										if ((jw.ab_fld[1 + var91][var70][var98] & var58) == 0) {
											break label521;
										}
									}

									var91++;
								}

								int var99 = (var79 - var73 + 1) * (1 + var91 - var85);
								if (var99 >= 8) {
									short var107 = 240;
									int var111 = var55[var91][var70][var73] - var107;
									int var115 = var55[var85][var70][var73];
									ev.my(var57, var61, 1, var70 * 128, var70 * 128, 128 * var73, 128 + 128 * var79, var111, var115);

									for (int var117 = var85; var117 <= var91; var117++) {
										for (int var119 = var73; var119 <= var79; var119++) {
											jw.ab_fld[var117][var70][var119] = jw.ab_fld[var117][var70][var119] & ~var58;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var62][var70][var66] & var59)) {
								int var74 = var70;
								int var80 = var70;
								int var86 = var62;
								int var92 = var62;

								while (var74 > 0 && (jw.ab_fld[var62][var74 - 1][var66] & var59) != 0) {
									var74--;
								}

								while (var80 < var50 && 0 != (jw.ab_fld[var62][var80 + 1][var66] & var59)) {
									var80++;
								}

								label585:
								while (var86 > 0) {
									for (int var100 = var74; var100 <= var80; var100++) {
										if ((jw.ab_fld[var86 - 1][var100][var66] & var59) == 0) {
											break label585;
										}
									}

									var86--;
								}

								label574:
								while (var92 < var61) {
									for (int var101 = var74; var101 <= var80; var101++) {
										if (0 == (jw.ab_fld[1 + var92][var101][var66] & var59)) {
											break label574;
										}
									}

									var92++;
								}

								int var102 = (var92 + 1 - var86) * (var80 - var74 + 1);
								if (var102 >= 8) {
									short var108 = 240;
									int var112 = var55[var92][var74][var66] - var108;
									int var116 = var55[var86][var74][var66];
									ev.my(var57, var61, 2, var74 * 128, 128 * var80 + 128, var66 * 128, var66 * 128, var112, var116);

									for (int var118 = var86; var118 <= var92; var118++) {
										for (int var120 = var74; var120 <= var80; var120++) {
											jw.ab_fld[var118][var120][var66] = jw.ab_fld[var118][var120][var66] & ~var59;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var62][var70][var66] & var60)) {
								int var75 = var70;
								int var81 = var70;
								int var87 = var66;
								int var93 = var66;

								while (var87 > 0 && 0 != (jw.ab_fld[var62][var70][var87 - 1] & var60)) {
									var87--;
								}

								while (var93 < var53 && (jw.ab_fld[var62][var70][1 + var93] & var60) != 0) {
									var93++;
								}

								label638:
								while (var75 > 0) {
									for (int var103 = var87; var103 <= var93; var103++) {
										if ((jw.ab_fld[var62][var75 - 1][var103] & var60) == 0) {
											break label638;
										}
									}

									var75--;
								}

								label627:
								while (var81 < var50) {
									for (int var104 = var87; var104 <= var93; var104++) {
										if ((jw.ab_fld[var62][1 + var81][var104] & var60) == 0) {
											break label627;
										}
									}

									var81++;
								}

								if ((1 + (var81 - var75)) * (var93 - var87 + 1) >= 4) {
									int var105 = var55[var62][var75][var87];
									ev.my(var57, var61, 4, var75 * 128, 128 * var81 + 128, var87 * 128, var93 * 128 + 128, var105, var105);

									for (int var109 = var75; var109 <= var81; var109++) {
										for (int var113 = var87; var113 <= var93; var113++) {
											jw.ab_fld[var62][var109][var113] = jw.ab_fld[var62][var109][var113] & ~var60;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIIIII)V"
	)
	static final void cy(dx var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		xi var9 = new xi(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.dm();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.dz();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.cg();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < 8 + var7) {
					oe var20 = ko.az(var10);
					int var21 = var3 + fz.ag(var15 & 7, var14 & 7, var8, -386749841 * var20.cb_fld, var20.co_fld, var19);
					int var24 = var15 & 7;
					int var25 = var14 & 7;
					int var27 = -1197389415 * var20.cb_fld;
					int var28 = 1471913238 * var20.co_fld;
					if (1 == (var19 & 1)) {
						int var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var8 & 3;
					int var23;
					if (false) {
						var23 = var25;
					} else if (1 == var26) {
						var23 = 7 - var24 - (var27 - 1);
					} else if (2 == var26) {
						var23 = 7 - var25 - (var28 - 1);
					} else {
						var23 = var24;
					}

					int var32 = var23 + var4;
					if (var21 > 0 && var32 > 0 && var21 < var0.ah_fld - 1 && var32 < var0.aw_fld - 1) {
						int var30 = var2;
						if ((var0.al_fld[1][var21][var32] & 2) == 2) {
							var30 = var2 - 1;
						}

						gn var31 = null;
						if (var30 >= 0 && null != var0.av_fld) {
							var31 = var0.av_fld[var30];
						}

						un.ax(var0, var2, var21, var32, var10, var8 + var19 & 3, var18, var31);
					}
				}
			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int cg(int var0, int var1) {
		int var2 = ue.ai(var0 + 45365, var1 + 91923, 4) - 128 + (ue.ai(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (ue.ai(var0, var1, 1) - 128 >> 2);
		var2 = (int)(var2 * 0.3) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ap() {
		ar_fld = -836973041;
		cq.af_fld = new short[4][104][104];
		tx.al_fld = new short[4][104][104];
		rt.au_fld = new byte[4][104][104];
		us.ax_fld = new byte[4][104][104];
		jw.ab_fld = new int[4][105][105];
		fp.an_fld = new byte[4][105][105];
		kf.aa_fld = new int[105][105];
		hv.ai_fld = new int[104];
		or.aq_fld = new int[104];
		cl.am_fld = new int[104];
		lz.ad_fld = new int[104];
		ao_fld = new int[104];
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int cm(int var0, int var1) {
		int var2 = ue.ai(var0 + 45365, var1 + 887802341, 4) - -100127622 + (ue.ai(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (ue.ai(var0, var1, 1) - 128 >> 2);
		var2 = (int)(var2 * 0.3) + -1197257443;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 1401621025) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int cz(int var0, int var1) {
		int var2 = ue.ai(var0 + 45365, var1 + 1777904129, 4)
			- 1816201747
			+ (ue.ai(var0 + 10294, var1 + 37821, 2) - 274515561 >> 1)
			+ (ue.ai(var0, var1, 1) - 2038801627 >> 2);
		var2 = (int)(var2 * 0.3) + 1959297547;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > -1808679570) {
			var2 = -1503229370;
		}

		return var2;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static final int ck(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = kv.aq(var3, var5);
		int var8 = kv.aq(var3 + 1, var5);
		int var9 = kv.aq(var3, 1 + var5);
		int var10 = kv.aq(var3 + 1, 1 + var5);
		int var12 = 65536 - fc.aw_fld[1024 * var4 / var2] >> 1;
		int var11 = (var7 * (-620763320 - var12) >> 16) + (var12 * var8 >> 16);
		int var14 = 65536 - fc.aw_fld[567010130 * var4 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
		int var16 = 65536 - fc.aw_fld[566661370 * var6 / var2] >> 1;
		return (var16 * var13 >> 16) + ((-1579021554 - var16) * var11 >> 16);
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int dc(int var0, int var1) {
		if (-1 == var0) {
			return -15956836;
		} else {
			var1 = (var0 & 1259268990) * var1 / 529528750;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 988126737) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int co(int var0, int var1) {
		int var2 = cf.am(var0 - 1, var1 - 1) + cf.am(var0 + 1, var1 - 1) + cf.am(var0 - 1, 1 + var1) + cf.am(var0 + 1, var1 + 1);
		int var3 = cf.am(var0 - 1, var1) + cf.am(1 + var0, var1) + cf.am(var0, var1 - 1) + cf.am(var0, var1 + 1);
		int var4 = cf.am(var0, var1);
		return var4 / 4 + var3 / 8 + var2 / 16;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int cu(int var0, int var1) {
		int var2 = cf.am(var0 - 1, var1 - 1) + cf.am(var0 + 1, var1 - 1) + cf.am(var0 - 1, 1 + var1) + cf.am(var0 + 1, var1 + 1);
		int var3 = cf.am(var0 - 1, var1) + cf.am(1 + var0, var1) + cf.am(var0, var1 - 1) + cf.am(var0, var1 + 1);
		int var4 = cf.am(var0, var1);
		return var4 / 4 + var3 / 8 + var2 / 16;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ci(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 = var2 << 13 ^ var2;
		int var3 = (789221 + var2 * var2 * 15731) * var2 + 1376312589 & 2147483647;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int cj(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 = var2 << 13 ^ var2;
		int var3 = (789221 + var2 * var2 * 15731) * var2 + 1376312589 & 2147483647;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int cw(int var0, int var1) {
		int var2 = ue.ai(var0 + 45365, var1 + 91923, 4) - 128 + (ue.ai(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (ue.ai(var0, var1, 1) - 128 >> 2);
		var2 = (int)(var2 * 0.3) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ch(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 = var2 << 13 ^ var2;
		int var3 = (789221 + var2 * var2 * 15731) * var2 + 1376312589 & 2147483647;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int cl(int var0, int var1) {
		if (-1 == var0) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	static final void ca(dx var0) throws EOFException {
		int var1 = var0.ah_fld;
		int var2 = var0.aw_fld;
		int[][][] var3 = var0.af_fld;
		byte[][][] var4 = var0.al_fld;
		ev var5 = var0.az_fld;
		gn[] var6 = var0.av_fld;

		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < var1; var8++) {
				for (int var9 = 0; var9 < var2; var9++) {
					if (1 == (var0.al_fld[var7][var8][var9] & 1)) {
						int var10 = var7;
						if (2 == (var0.al_fld[1][var8][var9] & 2)) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].aa(var8, var9, (byte)-6);
						}
					}
				}
			}
		}

		ap_fld = ap_fld + ((int)(Math.random() * 5.0) - 2) * 1061236965;
		if (ap_fld < -8) {
			ap_fld = 100038872;
		}

		if (ap_fld > 8) {
			ap_fld = -100038872;
		}

		at_fld = at_fld + ((int)(Math.random() * 5.0) - 2) * 1923545515;
		if (at_fld < -16) {
			at_fld = -711957168;
		}

		if (at_fld > 16) {
			at_fld = 711957168;
		}

		for (int var48 = 0; var48 < 4; var48++) {
			byte[][] var51 = fp.an_fld[var48];
			byte var54 = 96;
			short var56 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int)Math.sqrt(5100.0);
			int var15 = var14 * 768 >> 8;

			for (int var16 = 1; var16 < var2 - 1; var16++) {
				for (int var17 = 1; var17 < var1 - 1; var17++) {
					int var18 = var3[var48][1 + var17][var16] - var3[var48][var17 - 1][var16];
					int var19 = var3[var48][var17][1 + var16] - var3[var48][var17][var16 - 1];
					int var20 = (int)Math.sqrt(var19 * var19 + var18 * var18 + 65536);
					int var21 = (var18 << 8) / var20;
					int var22 = 65536 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = 96 + (var23 * -50 + var22 * -10 + -50 * var21) / var15;
					int var25 = (var51[var17][var16] >> 1)
						+ (var51[1 + var17][var16] >> 3)
						+ (var51[var17 - 1][var16] >> 2)
						+ (var51[var17][var16 - 1] >> 2)
						+ (var51[var17][var16 + 1] >> 3);
					kf.aa_fld[var17][var16] = var24 - var25;
				}
			}

			for (int var63 = 0; var63 < var2; var63++) {
				hv.ai_fld[var63] = 0;
				or.aq_fld[var63] = 0;
				cl.am_fld[var63] = 0;
				lz.ad_fld[var63] = 0;
				ao_fld[var63] = 0;
			}

			for (int var64 = -5; var64 < 5 + var1; var64++) {
				for (int var67 = 0; var67 < var2; var67++) {
					int var71 = 5 + var64;
					if (var71 >= 0 && var71 < var1) {
						int var76 = (int)ji.af(15, -728791950);
						int var82 = cq.af_fld[var48][var71][var67] & var76;
						if (var82 > 0) {
							pl var88 = ew.ak(var82 - 1);
							hv.ai_fld[var67] = hv.ai_fld[var67] + var88.av_fld;
							or.aq_fld[var67] = or.aq_fld[var67] + var88.ae_fld;
							cl.am_fld[var67] = cl.am_fld[var67] + var88.ah_fld;
							lz.ad_fld[var67] = lz.ad_fld[var67] + var88.aw_fld;
							ao_fld[var67]++;
						}
					}

					int var77 = var64 - 5;
					if (var77 >= 0 && var77 < var1) {
						int var83 = (int)ji.af(15, 148487791);
						int var89 = cq.af_fld[var48][var77][var67] & var83;
						if (var89 > 0) {
							pl var94 = ew.ak(var89 - 1);
							hv.ai_fld[var67] = hv.ai_fld[var67] - var94.av_fld;
							or.aq_fld[var67] = or.aq_fld[var67] - var94.ae_fld;
							cl.am_fld[var67] = cl.am_fld[var67] - var94.ah_fld;
							lz.ad_fld[var67] = lz.ad_fld[var67] - var94.aw_fld;
							ao_fld[var67]--;
						}
					}
				}

				if (var64 >= 1 && var64 < var1 - 1) {
					int var68 = 0;
					int var72 = 0;
					int var78 = 0;
					int var84 = 0;
					int var90 = 0;

					for (int var95 = -5; var95 < 5 + var2; var95++) {
						int var106 = 5 + var95;
						if (var106 >= 0 && var106 < var2) {
							var68 += hv.ai_fld[var106];
							var72 += or.aq_fld[var106];
							var78 += cl.am_fld[var106];
							var84 += lz.ad_fld[var106];
							var90 += ao_fld[var106];
						}

						int var110 = var95 - 5;
						if (var110 >= 0 && var110 < var2) {
							var68 -= hv.ai_fld[var110];
							var72 -= or.aq_fld[var110];
							var78 -= cl.am_fld[var110];
							var84 -= lz.ad_fld[var110];
							var90 -= ao_fld[var110];
						}

						if (var95 >= 1 && var95 < var2 - 1 && (!client.gk_fld || (var4[0][var64][var95] & 2) != 0 || 0 == (var4[var48][var64][var95] & 16))) {
							if (var48 < ar_fld) {
								ar_fld = var48;
							}

							int var114 = (int)ji.af(15, 1231188218);
							int var26 = cq.af_fld[var48][var64][var95] & var114;
							int var27 = tx.al_fld[var48][var64][var95] & var114;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var48][var64][var95];
								int var29 = var3[var48][1 + var64][var95];
								int var30 = var3[var48][1 + var64][1 + var95];
								int var31 = var3[var48][var64][1 + var95];
								int var32 = kf.aa_fld[var64][var95];
								int var33 = kf.aa_fld[1 + var64][var95];
								int var34 = kf.aa_fld[1 + var64][1 + var95];
								int var35 = kf.aa_fld[var64][1 + var95];
								int var36 = -1;
								int var37 = -1;
								if (false) {
									int var38 = var68 * 256 / var84;
									int var39 = var72 / var90;
									int var40 = var78 / var90;
									var36 = mc.ab(var38, var39, var40);
									var38 = ap_fld + var38 & 0xFF;
									var40 += at_fld;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = mc.ab(var38, var39, var40);
								}

								if (false) {
									boolean var122 = true;
									if (var26 == 0 && rt.au_fld[var48][var64][var95] != 0) {
										var122 = false;
									}

									if (false) {
										int var127 = var27 - 1;
										ov var41 = (ov)ov.ay_fld.ak(var127);
										ov var124;
										if (var41 != null) {
											var124 = var41;
										} else {
											byte[] var42 = ha.aw_fld.bb(4, var127, 584982574);
											var41 = new ov();
											if (null != var42) {
												var41.av(new xi(var42), var127);
											}

											ov.mt(var41, (byte)-59);
											ov.ay_fld.az(var41, var127);
											var124 = var41;
										}

										if (!var124.af_fld) {
											var122 = false;
										}
									}

									if (var122 && var29 == var28 && var30 == var28 && var28 == var31) {
										jw.ab_fld[var48][var64][var95] = jw.ab_fld[var48][var64][var95] | 2340;
									}
								}

								int var123 = 0;
								if (false) {
									var123 = fc.az_fld[jf.ad(var37, 96)];
								}

								if (0 == var27) {
									var5.bm(
										var48,
										var64,
										var95,
										0,
										0,
										-1,
										var28,
										var29,
										var30,
										var31,
										jf.ad(var36, var32),
										jf.ad(var36, var33),
										jf.ad(var36, var34),
										jf.ad(var36, var35),
										0,
										0,
										0,
										0,
										var123,
										0
									);
								} else {
									int var125 = rt.au_fld[var48][var64][var95] + 1;
									byte var128 = us.ax_fld[var48][var64][var95];
									ov var130 = kl.ag(var27 - 1);
									int var131 = var130.ar_fld;
									int var43;
									int var44;
									if (var131 >= 0) {
										var44 = fc.ar_fld.aq_fld.av(var131, (byte)-27);
										var43 = -1;
									} else if (16711935 == var130.as_fld) {
										var43 = -2;
										var131 = -1;
										var44 = -2;
									} else {
										var43 = mc.ab(var130.au_fld, var130.ax_fld, var130.an_fld);
										int var45 = var130.au_fld + ap_fld & 0xFF;
										int var46 = at_fld + var130.an_fld;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = mc.ab(var45, var130.ax_fld, var46);
									}

									int var133 = 0;
									if (false) {
										var133 = fc.az_fld[pt.ao(var44, 96)];
									}

									if (-1 != var130.al_fld) {
										int var134 = ap_fld + var130.aa_fld & 0xFF;
										int var47 = at_fld + var130.aq_fld;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = mc.ab(var134, var130.ai_fld, var47);
										var133 = fc.az_fld[pt.ao(var44, 96)];
									}

									var5.bm(
										var48,
										var64,
										var95,
										var125,
										var128,
										var131,
										var28,
										var29,
										var30,
										var31,
										jf.ad(var36, var32),
										jf.ad(var36, var33),
										jf.ad(var36, var34),
										jf.ad(var36, var35),
										pt.ao(var43, var32),
										pt.ao(var43, var33),
										pt.ao(var43, var34),
										pt.ao(var43, var35),
										var123,
										var133
									);
								}
							}
						}
					}
				}
			}

			for (int var65 = 1; var65 < var2 - 1; var65++) {
				for (int var69 = 1; var69 < var1 - 1; var69++) {
					int var96;
					if (0 != (var0.al_fld[var48][var69][var65] & 8)) {
						var96 = 0;
					} else if (var48 > 0 && (var0.al_fld[1][var69][var65] & 2) != 0) {
						var96 = var48 - 1;
					} else {
						var96 = var48;
					}

					ev.ux(var5, var48, var69, var65, var96);
				}
			}

			cq.af_fld[var48] = (short[][])null;
			tx.al_fld[var48] = (short[][])null;
			rt.au_fld[var48] = null;
			us.ax_fld[var48] = (byte[][])null;
			fp.an_fld[var48] = (byte[][])null;
		}

		var5.cs(-50, -10, -50);

		for (int var49 = 0; var49 < var1; var49++) {
			for (int var52 = 0; var52 < var2; var52++) {
				if ((var4[1][var49][var52] & 2) == 2) {
					var5.at(var49, var52);
				}
			}
		}

		if (var0.ak(-787091592)) {
			int var50 = var0.ah_fld;
			int var53 = var0.aw_fld;
			int[][][] var55 = var0.af_fld;
			ev var57 = var0.az_fld;
			byte var58 = 1;
			byte var59 = 2;
			byte var60 = 4;

			for (int var61 = 0; var61 < 4; var61++) {
				if (var61 > 0) {
					var58 <<= 3;
					var59 <<= 3;
					var60 <<= 3;
				}

				for (int var62 = 0; var62 <= var61; var62++) {
					for (int var66 = 0; var66 <= var53; var66++) {
						for (int var70 = 0; var70 <= var50; var70++) {
							if (0 != (jw.ab_fld[var62][var70][var66] & var58)) {
								int var73 = var66;
								int var79 = var66;
								int var85 = var62;
								int var91 = var62;

								while (var73 > 0 && 0 != (jw.ab_fld[var62][var70][var73 - 1] & var58)) {
									var73--;
								}

								while (var79 < var53 && 0 != (jw.ab_fld[var62][var70][1 + var79] & var58)) {
									var79++;
								}

								label527:
								while (var85 > 0) {
									for (int var97 = var73; var97 <= var79; var97++) {
										if (0 == (jw.ab_fld[var85 - 1][var70][var97] & var58)) {
											break label527;
										}
									}

									var85--;
								}

								label516:
								while (var91 < var61) {
									for (int var98 = var73; var98 <= var79; var98++) {
										if ((jw.ab_fld[1 + var91][var70][var98] & var58) == 0) {
											break label516;
										}
									}

									var91++;
								}

								int var99 = (var79 - var73 + 1) * (1 + var91 - var85);
								if (var99 >= 8) {
									short var107 = 240;
									int var111 = var55[var91][var70][var73] - var107;
									int var115 = var55[var85][var70][var73];
									ev.my(var57, var61, 1, var70 * 128, var70 * 128, 128 * var73, 128 + 128 * var79, var111, var115);

									for (int var117 = var85; var117 <= var91; var117++) {
										for (int var119 = var73; var119 <= var79; var119++) {
											jw.ab_fld[var117][var70][var119] = jw.ab_fld[var117][var70][var119] & ~var58;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var62][var70][var66] & var59)) {
								int var74 = var70;
								int var80 = var70;
								int var86 = var62;
								int var92 = var62;

								while (var74 > 0 && (jw.ab_fld[var62][var74 - 1][var66] & var59) != 0) {
									var74--;
								}

								while (var80 < var50 && 0 != (jw.ab_fld[var62][var80 + 1][var66] & var59)) {
									var80++;
								}

								label580:
								while (var86 > 0) {
									for (int var100 = var74; var100 <= var80; var100++) {
										if ((jw.ab_fld[var86 - 1][var100][var66] & var59) == 0) {
											break label580;
										}
									}

									var86--;
								}

								label569:
								while (var92 < var61) {
									for (int var101 = var74; var101 <= var80; var101++) {
										if (0 == (jw.ab_fld[1 + var92][var101][var66] & var59)) {
											break label569;
										}
									}

									var92++;
								}

								int var102 = (var92 + 1 - var86) * (var80 - var74 + 1);
								if (var102 >= 8) {
									short var108 = 240;
									int var112 = var55[var92][var74][var66] - var108;
									int var116 = var55[var86][var74][var66];
									ev.my(var57, var61, 2, var74 * 128, 128 * var80 + 128, var66 * 128, var66 * 128, var112, var116);

									for (int var118 = var86; var118 <= var92; var118++) {
										for (int var120 = var74; var120 <= var80; var120++) {
											jw.ab_fld[var118][var120][var66] = jw.ab_fld[var118][var120][var66] & ~var59;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var62][var70][var66] & var60)) {
								int var75 = var70;
								int var81 = var70;
								int var87 = var66;
								int var93 = var66;

								while (var87 > 0 && 0 != (jw.ab_fld[var62][var70][var87 - 1] & var60)) {
									var87--;
								}

								while (var93 < var53 && (jw.ab_fld[var62][var70][1 + var93] & var60) != 0) {
									var93++;
								}

								label633:
								while (var75 > 0) {
									for (int var103 = var87; var103 <= var93; var103++) {
										if ((jw.ab_fld[var62][var75 - 1][var103] & var60) == 0) {
											break label633;
										}
									}

									var75--;
								}

								label622:
								while (var81 < var50) {
									for (int var104 = var87; var104 <= var93; var104++) {
										if ((jw.ab_fld[var62][1 + var81][var104] & var60) == 0) {
											break label622;
										}
									}

									var81++;
								}

								if ((1 + (var81 - var75)) * (var93 - var87 + 1) >= 4) {
									int var105 = var55[var62][var75][var87];
									ev.my(var57, var61, 4, var75 * 128, 128 * var81 + 128, var87 * 128, var93 * 128 + 128, var105, var105);

									for (int var109 = var75; var109 <= var81; var109++) {
										for (int var113 = var87; var113 <= var93; var113++) {
											jw.ab_fld[var62][var109][var113] = jw.ab_fld[var62][var109][var113] & ~var60;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static final int dh(int var0, int var1, int var2) {
		if (var2 > -1826513893) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 1039757360) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		return var2 / 2 + (var1 / -1880152331 << 7) + (var0 / 4 << 10);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIIIII)V"
	)
	static final void cv(dx var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		xi var9 = new xi(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.dm();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.dz();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.cg();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var16 == var5 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < 8 + var7) {
					oe var20 = ko.az(var10);
					int var21 = var3 + fz.ag(var15 & 7, var14 & 7, var8, var20.cb_fld, var20.co_fld, var19);
					int var24 = var15 & 7;
					int var25 = var14 & 7;
					int var27 = var20.cb_fld;
					int var28 = var20.co_fld;
					if (1 == (var19 & 1)) {
						int var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var8 & 3;
					int var23;
					if (false) {
						var23 = var25;
					} else if (1 == var26) {
						var23 = 7 - var24 - (var27 - 1);
					} else if (2 == var26) {
						var23 = 7 - var25 - (var28 - 1);
					} else {
						var23 = var24;
					}

					int var32 = var23 + var4;
					if (var21 > 0 && var32 > 0 && var21 < var0.ah_fld - 1 && var32 < var0.aw_fld - 1) {
						int var30 = var2;
						if ((var0.al_fld[1][var21][var32] & 2) == 2) {
							var30 = var2 - 1;
						}

						gn var31 = null;
						if (var30 >= 0 && null != var0.av_fld) {
							var31 = var0.av_fld[var30];
						}

						un.ax(var0, var2, var21, var32, var10, var8 + var19 & 3, var18, var31);
					}
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Date;"
	)
	static Date an() throws ParseException {
		SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var1.setLenient(false);
		StringBuilder var2 = new StringBuilder();
		String[] var3 = bn.cd_fld;

		for (int var4 = 0; var4 < var3.length; var4++) {
			String var5 = var3[var4];
			if (var5 == null) {
				sc.ax("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var2.append(var5);
		}

		var2.append("12");
		return var1.parse(var2.toString());
	}
}
