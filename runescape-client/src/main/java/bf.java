import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bf")
public class bf implements jo {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ad_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	static yc[] cy_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bu_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()[Lyc;"
	)
	@Override
	public yc[] ah() {
		return uk.mj_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxy;B)Lzf;"
	)
	@Override
	public zf ak(xy var1, byte var2) {
		return (zf)(zf)client.dr_fld.get(var1);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void hq() {
		if (null != fs.gh_fld) {
			client.gr_fld = client.dv_fld * 71286477;
			fs.gh_fld.av();
			Iterator var1 = bw.dk_fld.au_fld.iterator();

			while (var1.hasNext()) {
				cv var2 = (cv)(cv)var1.next();
				fs.gh_fld.az((var2.bo_fld >> 7) + bw.dk_fld.ay_fld, bw.dk_fld.as_fld + (var2.bp_fld >> 7), 323851189);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Lyc;"
	)
	@Override
	public yc[] ag(byte var1) {
		return uk.mj_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxy;)Lzf;"
	)
	@Override
	public zf av(xy var1) {
		return (zf)(zf)client.dr_fld.get(var1);
	}

	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "(Lvx;)D"
	)
	public static double xu(vx var0) {
		return var0.af_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxy;)Lzf;"
	)
	@Override
	public zf ae(xy var1) {
		return (zf)(zf)client.dr_fld.get(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	@Override
	public yv az(int var1) {
		return vf.mm_fld;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static final void dr(boolean var0) {
		up.br();
		client.aq_fld.ag_fld++;
		if (client.aq_fld.ag_fld >= 50 || var0) {
			client.aq_fld.ag_fld = 0;
			if (!client.lc_fld && df.xl(client.aq_fld, -1032714655) != null) {
				jm var2 = gi.ak(jb.ci_fld, client.aq_fld.av_fld);
				client.aq_fld.az(var2);

				try {
					df.yf(client.aq_fld, (byte)29);
				} catch (IOException var4) {
					client.lc_fld = true;
				}
			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean gc() {
		return client.nu_fld;
	}

	bf() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldx;S)V"
	)
	static final void an(dx var0, short var1) throws EOFException {
		int var2 = var0.ah_fld;
		int var3 = var0.aw_fld;
		int[][][] var4 = var0.af_fld;
		byte[][][] var5 = var0.al_fld;
		ev var6 = var0.az_fld;
		gn[] var7 = var0.av_fld;

		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < var2; var9++) {
				for (int var10 = 0; var10 < var3; var10++) {
					if (1 == (var0.al_fld[var8][var9][var10] & 1)) {
						int var11 = var8;
						if (2 == (var0.al_fld[1][var9][var10] & 2)) {
							var11 = var8 - 1;
						}

						if (var11 >= 0 && var7 != null) {
							var7[var11].aa(var9, var10, (byte)-111);
						}
					}
				}
			}
		}

		dt.ap_fld = dt.ap_fld + ((int)(Math.random() * 5.0) - 2) * 1061236965;
		if (dt.ap_fld < -8) {
			dt.ap_fld = 100038872;
		}

		if (dt.ap_fld > 8) {
			dt.ap_fld = -100038872;
		}

		dt.at_fld = dt.at_fld + ((int)(Math.random() * 5.0) - 2) * 1923545515;
		if (dt.at_fld < -16) {
			dt.at_fld = -711957168;
		}

		if (dt.at_fld > 16) {
			if (var1 <= 179) {
				return;
			}

			dt.at_fld = 711957168;
		}

		for (int var49 = 0; var49 < 4; var49++) {
			if (var1 <= 179) {
				return;
			}

			byte[][] var52 = fp.an_fld[var49];
			byte var55 = 96;
			short var57 = 768;
			byte var12 = -50;
			byte var13 = -10;
			byte var14 = -50;
			int var15 = (int)Math.sqrt(5100.0);
			int var16 = var15 * 768 >> 8;

			for (int var17 = 1; var17 < var3 - 1; var17++) {
				for (int var18 = 1; var18 < var2 - 1; var18++) {
					int var19 = var4[var49][1 + var18][var17] - var4[var49][var18 - 1][var17];
					int var20 = var4[var49][var18][1 + var17] - var4[var49][var18][var17 - 1];
					int var21 = (int)Math.sqrt(var20 * var20 + var19 * var19 + 65536);
					int var22 = (var19 << 8) / var21;
					int var23 = 65536 / var21;
					int var24 = (var20 << 8) / var21;
					int var25 = 96 + (var24 * -50 + var23 * -10 + -50 * var22) / var16;
					int var26 = (var52[var18][var17] >> 1)
						+ (var52[1 + var18][var17] >> 3)
						+ (var52[var18 - 1][var17] >> 2)
						+ (var52[var18][var17 - 1] >> 2)
						+ (var52[var18][var17 + 1] >> 3);
					kf.aa_fld[var18][var17] = var25 - var26;
				}
			}

			for (int var64 = 0; var64 < var3; var64++) {
				hv.ai_fld[var64] = 0;
				or.aq_fld[var64] = 0;
				cl.am_fld[var64] = 0;
				lz.ad_fld[var64] = 0;
				dt.ao_fld[var64] = 0;
			}

			for (int var65 = -5; var65 < 5 + var2; var65++) {
				for (int var68 = 0; var68 < var3; var68++) {
					int var72 = 5 + var65;
					if (var72 >= 0 && var72 < var2) {
						int var77 = (int)ji.af(15, -1705354380);
						int var83 = cq.af_fld[var49][var72][var68] & var77;
						if (var83 > 0) {
							pl var89 = ew.ak(var83 - 1);
							hv.ai_fld[var68] = hv.ai_fld[var68] + var89.av_fld;
							or.aq_fld[var68] = or.aq_fld[var68] + var89.ae_fld;
							cl.am_fld[var68] = cl.am_fld[var68] + var89.ah_fld;
							lz.ad_fld[var68] = lz.ad_fld[var68] + var89.aw_fld;
							dt.ao_fld[var68]++;
						}
					}

					int var78 = var65 - 5;
					if (var78 >= 0 && var78 < var2) {
						int var84 = (int)ji.af(15, 1939039673);
						int var90 = cq.af_fld[var49][var78][var68] & var84;
						if (var90 > 0) {
							pl var95 = ew.ak(var90 - 1);
							hv.ai_fld[var68] = hv.ai_fld[var68] - var95.av_fld;
							or.aq_fld[var68] = or.aq_fld[var68] - var95.ae_fld;
							cl.am_fld[var68] = cl.am_fld[var68] - var95.ah_fld;
							lz.ad_fld[var68] = lz.ad_fld[var68] - var95.aw_fld;
							dt.ao_fld[var68]--;
						}
					}
				}

				if (var65 >= 1 && var65 < var2 - 1) {
					int var69 = 0;
					int var73 = 0;
					int var79 = 0;
					int var85 = 0;
					int var91 = 0;

					for (int var96 = -5; var96 < 5 + var3; var96++) {
						int var107 = 5 + var96;
						if (var107 >= 0 && var107 < var3) {
							var69 += hv.ai_fld[var107];
							var73 += or.aq_fld[var107];
							var79 += cl.am_fld[var107];
							var85 += lz.ad_fld[var107];
							var91 += dt.ao_fld[var107];
						}

						int var111 = var96 - 5;
						if (var111 >= 0 && var111 < var3) {
							var69 -= hv.ai_fld[var111];
							var73 -= or.aq_fld[var111];
							var79 -= cl.am_fld[var111];
							var85 -= lz.ad_fld[var111];
							var91 -= dt.ao_fld[var111];
						}

						if (var96 >= 1) {
							if (var1 <= 179) {
								return;
							}

							if (var96 < var3 - 1) {
								if (client.gk_fld && (var5[0][var65][var96] & 2) == 0 && 0 != (var5[var49][var65][var96] & 16)) {
									if (var1 <= 179) {
										return;
									}
								} else {
									if (var49 < dt.ar_fld) {
										dt.ar_fld = var49;
									}

									int var115 = (int)ji.af(15, -1185437236);
									int var27 = cq.af_fld[var49][var65][var96] & var115;
									int var28 = tx.al_fld[var49][var65][var96] & var115;
									if (var27 <= 0) {
										if (var1 <= 179) {
											return;
										}

										if (var28 <= 0) {
											continue;
										}
									}

									int var29 = var4[var49][var65][var96];
									int var30 = var4[var49][1 + var65][var96];
									int var31 = var4[var49][1 + var65][1 + var96];
									int var32 = var4[var49][var65][1 + var96];
									int var33 = kf.aa_fld[var65][var96];
									int var34 = kf.aa_fld[1 + var65][var96];
									int var35 = kf.aa_fld[1 + var65][1 + var96];
									int var36 = kf.aa_fld[var65][1 + var96];
									int var37 = -1;
									int var38 = -1;
									if (var27 > 0) {
										int var39 = var69 * 256 / var85;
										int var40 = var73 / var91;
										int var41 = var79 / var91;
										var37 = mc.ab(var39, var40, var41);
										var39 = dt.ap_fld + var39 & 0xFF;
										var41 += dt.at_fld;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var38 = mc.ab(var39, var40, var41);
									}

									if (var49 > 0) {
										if (var1 <= 179) {
											return;
										}

										boolean var123 = true;
										if (var27 == 0 && rt.au_fld[var49][var65][var96] != 0) {
											var123 = false;
										}

										if (var28 > 0) {
											if (var1 <= 179) {
												return;
											}

											int var128 = var28 - 1;
											ov var42 = (ov)ov.ay_fld.ak(var128);
											ov var125;
											if (var42 != null) {
												var125 = var42;
											} else {
												byte[] var43 = ha.aw_fld.bb(4, var128, 584982574);
												var42 = new ov();
												if (null != var43) {
													var42.av(new xi(var43), var128);
												}

												ov.mt(var42, (byte)-31);
												ov.ay_fld.az(var42, var128);
												var125 = var42;
											}

											if (!var125.af_fld) {
												var123 = false;
											}
										}

										if (var123 && var30 == var29 && var31 == var29) {
											if (var1 <= 179) {
												return;
											}

											if (var29 == var32) {
												jw.ab_fld[var49][var65][var96] = jw.ab_fld[var49][var65][var96] | 2340;
											}
										}
									}

									int var124 = 0;
									if (var38 != -1) {
										var124 = fc.az_fld[jf.ad(var38, 96)];
									}

									if (0 == var28) {
										var6.bm(
											var49,
											var65,
											var96,
											0,
											0,
											-1,
											var29,
											var30,
											var31,
											var32,
											jf.ad(var37, var33),
											jf.ad(var37, var34),
											jf.ad(var37, var35),
											jf.ad(var37, var36),
											0,
											0,
											0,
											0,
											var124,
											0
										);
									} else {
										int var126 = rt.au_fld[var49][var65][var96] + 1;
										byte var129 = us.ax_fld[var49][var65][var96];
										ov var131 = kl.ag(var28 - 1);
										int var132 = var131.ar_fld;
										int var44;
										int var45;
										if (var132 >= 0) {
											var45 = fc.ar_fld.aq_fld.av(var132, (byte)-49);
											var44 = -1;
										} else if (16711935 == var131.as_fld) {
											var44 = -2;
											var132 = -1;
											var45 = -2;
										} else {
											var44 = mc.ab(var131.au_fld, var131.ax_fld, var131.an_fld);
											int var46 = var131.au_fld + dt.ap_fld & 0xFF;
											int var47 = dt.at_fld + var131.an_fld;
											if (var47 < 0) {
												var47 = 0;
											} else if (var47 > 255) {
												if (var1 <= 179) {
													return;
												}

												var47 = 255;
											}

											var45 = mc.ab(var46, var131.ax_fld, var47);
										}

										int var134 = 0;
										if (var45 != -2) {
											var134 = fc.az_fld[pt.ao(var45, 96)];
										}

										if (-1 != var131.al_fld) {
											int var135 = dt.ap_fld + var131.aa_fld & 0xFF;
											int var48 = dt.at_fld + var131.aq_fld;
											if (var48 < 0) {
												var48 = 0;
											} else if (var48 > 255) {
												var48 = 255;
											}

											var45 = mc.ab(var135, var131.ai_fld, var48);
											var134 = fc.az_fld[pt.ao(var45, 96)];
										}

										var6.bm(
											var49,
											var65,
											var96,
											var126,
											var129,
											var132,
											var29,
											var30,
											var31,
											var32,
											jf.ad(var37, var33),
											jf.ad(var37, var34),
											jf.ad(var37, var35),
											jf.ad(var37, var36),
											pt.ao(var44, var33),
											pt.ao(var44, var34),
											pt.ao(var44, var35),
											pt.ao(var44, var36),
											var124,
											var134
										);
									}
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < var3 - 1; var66++) {
				for (int var70 = 1; var70 < var2 - 1; var70++) {
					if (var1 <= 179) {
						return;
					}

					int var97;
					if (0 != (var0.al_fld[var49][var70][var66] & 8)) {
						var97 = 0;
					} else if (var49 > 0 && (var0.al_fld[1][var70][var66] & 2) != 0) {
						var97 = var49 - 1;
					} else {
						var97 = var49;
					}

					ev.ux(var6, var49, var70, var66, var97);
				}
			}

			cq.af_fld[var49] = (short[][])null;
			tx.al_fld[var49] = (short[][])null;
			rt.au_fld[var49] = null;
			us.ax_fld[var49] = (byte[][])null;
			fp.an_fld[var49] = (byte[][])null;
		}

		var6.cs(-50, -10, -50);

		for (int var50 = 0; var50 < var2; var50++) {
			for (int var53 = 0; var53 < var3; var53++) {
				if ((var5[1][var50][var53] & 2) == 2) {
					var6.at(var50, var53);
				}
			}
		}

		if (var0.ak(-787091592)) {
			int var51 = var0.ah_fld;
			int var54 = var0.aw_fld;
			int[][][] var56 = var0.af_fld;
			ev var58 = var0.az_fld;
			byte var59 = 1;
			byte var60 = 2;
			byte var61 = 4;

			for (int var62 = 0; var62 < 4; var62++) {
				if (var62 > 0) {
					var59 <<= 3;
					var60 <<= 3;
					var61 <<= 3;
				}

				for (int var63 = 0; var63 <= var62; var63++) {
					for (int var67 = 0; var67 <= var54; var67++) {
						for (int var71 = 0; var71 <= var51; var71++) {
							if (0 != (jw.ab_fld[var63][var71][var67] & var59)) {
								int var74 = var67;
								int var80 = var67;
								int var86 = var63;

								int var92;
								for (var92 = var63; var74 > 0 && 0 != (jw.ab_fld[var63][var71][var74 - 1] & var59); var74--) {
									if (var1 <= 179) {
										return;
									}
								}

								while (var80 < var54 && 0 != (jw.ab_fld[var63][var71][1 + var80] & var59)) {
									var80++;
								}

								label704:
								while (var86 > 0) {
									for (int var98 = var74; var98 <= var80; var98++) {
										if (0 == (jw.ab_fld[var86 - 1][var71][var98] & var59)) {
											break label704;
										}
									}

									var86--;
								}

								label693:
								while (var92 < var62) {
									for (int var99 = var74; var99 <= var80; var99++) {
										if ((jw.ab_fld[1 + var92][var71][var99] & var59) == 0) {
											break label693;
										}
									}

									var92++;
								}

								int var100 = (var80 - var74 + 1) * (1 + var92 - var86);
								if (var100 >= 8) {
									short var108 = 240;
									int var112 = var56[var92][var71][var74] - var108;
									int var116 = var56[var86][var71][var74];
									ev.my(var58, var62, 1, var71 * 128, var71 * 128, 128 * var74, 128 + 128 * var80, var112, var116);

									for (int var118 = var86; var118 <= var92; var118++) {
										for (int var120 = var74; var120 <= var80; var120++) {
											jw.ab_fld[var118][var71][var120] = jw.ab_fld[var118][var71][var120] & ~var59;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var63][var71][var67] & var60)) {
								int var75 = var71;
								int var81 = var71;
								int var87 = var63;
								int var93 = var63;

								while (var75 > 0 && (jw.ab_fld[var63][var75 - 1][var67] & var60) != 0) {
									var75--;
								}

								while (var81 < var51 && 0 != (jw.ab_fld[var63][var81 + 1][var67] & var60)) {
									if (var1 <= 179) {
										return;
									}

									var81++;
								}

								label759:
								while (var87 > 0) {
									for (int var101 = var75; var101 <= var81; var101++) {
										if ((jw.ab_fld[var87 - 1][var101][var67] & var60) == 0) {
											break label759;
										}
									}

									var87--;
								}

								label748:
								while (var93 < var62) {
									if (var1 <= 179) {
										return;
									}

									for (int var102 = var75; var102 <= var81; var102++) {
										if (var1 <= 179) {
											return;
										}

										if (0 == (jw.ab_fld[1 + var93][var102][var67] & var60)) {
											break label748;
										}
									}

									var93++;
								}

								int var103 = (var93 + 1 - var87) * (var81 - var75 + 1);
								if (var103 >= 8) {
									short var109 = 240;
									int var113 = var56[var93][var75][var67] - var109;
									int var117 = var56[var87][var75][var67];
									ev.my(var58, var62, 2, var75 * 128, 128 * var81 + 128, var67 * 128, var67 * 128, var113, var117);

									for (int var119 = var87; var119 <= var93; var119++) {
										for (int var121 = var75; var121 <= var81; var121++) {
											jw.ab_fld[var119][var121][var67] = jw.ab_fld[var119][var121][var67] & ~var60;
										}
									}
								}
							}

							if (0 != (jw.ab_fld[var63][var71][var67] & var61)) {
								if (var1 <= 179) {
									return;
								}

								int var76 = var71;
								int var82 = var71;
								int var88 = var67;

								int var94;
								for (var94 = var67; var88 > 0 && 0 != (jw.ab_fld[var63][var71][var88 - 1] & var61); var88--) {
									if (var1 <= 179) {
										return;
									}
								}

								while (var94 < var54 && (jw.ab_fld[var63][var71][1 + var94] & var61) != 0) {
									var94++;
								}

								label814:
								while (var76 > 0) {
									for (int var104 = var88; var104 <= var94; var104++) {
										if ((jw.ab_fld[var63][var76 - 1][var104] & var61) == 0) {
											break label814;
										}
									}

									var76--;
								}

								label803:
								while (var82 < var51) {
									if (var1 <= 179) {
										return;
									}

									for (int var105 = var88; var105 <= var94; var105++) {
										if (var1 <= 179) {
											return;
										}

										if ((jw.ab_fld[var63][1 + var82][var105] & var61) == 0) {
											break label803;
										}
									}

									var82++;
								}

								if ((1 + (var82 - var76)) * (var94 - var88 + 1) >= 4) {
									if (var1 <= 179) {
										return;
									}

									int var106 = var56[var63][var76][var88];
									ev.my(var58, var62, 4, var76 * 128, 128 * var82 + 128, var88 * 128, var94 * 128 + 128, var106, var106);

									for (int var110 = var76; var110 <= var82; var110++) {
										for (int var114 = var88; var114 <= var94; var114++) {
											jw.ab_fld[var63][var110][var114] = jw.ab_fld[var63][var110][var114] & ~var61;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void az(int var0, int var1) {
		tj.au_fld = var0;
		client.rw();
	}
}
