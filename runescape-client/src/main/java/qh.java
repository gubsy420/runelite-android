import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.events.WidgetDrag;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.WidgetUtil;

@ObfuscatedName("qh")
public class qh {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	jd ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	po az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	ja ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	qc av_fld = new qc();

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lpk;ZLuo;)V"
	)
	public void fd(pk var1, boolean var2, uo var3) {
		og.ci_fld.getCallbacks().post(new WidgetClosed(var1.getId(), var1.getModalMode(), var2));
		if (var2) {
			int var4 = var1.getId();
			hy(var4, client.cz_fld.ak_fld);
			hy(var4, client.cz_fld.az_fld);
			hy(var4, client.cz_fld.ag_fld);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;)V"
	)
	public void bk(qm var1, uo var2) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.aa_fld, var1, var2, -2110822276);
		}
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Llu;IIIIIILuo;)V"
	)
	public static void us(qh var0, lu var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			byte var9;
			if (var8.bd_fld) {
				var9 = 32;
			} else {
				var9 = 0;
			}

			var8.bd_fld = false;
			if (var0.av_fld.ag() == 1 || !var0.ag_fld.ae(1735302627) && var0.av_fld.ag() == 4) {
				if (var6 >= var2 && var6 < var2 + 16 && var7 >= var3 && var7 < 16 + var3) {
					var1.ce_fld -= 1258742179;
				} else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var4 + var3 - 16 && var7 < var4 + var3) {
					var1.ce_fld += 1843342543;
				} else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
					int var10 = var4 * (var4 - 32) / var5;
					if (var10 < 8) {
						var10 = 8;
					}

					int var11 = var7 - var3 - 16 - var10 / 2;
					int var12 = var4 - 32 - var10;
					var1.ce_fld = -1143292511 * (var11 * (var5 - var4) / var12);
					var8.bd_fld = true;
				}
			}

			if (var0.av_fld.ay() != 0) {
				int var13 = var1.bb_fld;
				if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
					var1.ce_fld = var1.ce_fld + var0.av_fld.ay() * 91444557;
				}
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;)V"
	)
	public void bf(qm var1, uo var2) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.aa_fld, var1, var2, 712201130);
		}
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "(Lpk;ZLuo;)V"
	)
	public void ve(pk var1, boolean var2, uo var3) throws EOFException {
		this.az(var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lpk;ZLuo;I)V"
	)
	public void az(pk var1, boolean var2, uo var3) throws EOFException {
		this.fd(var1, var2, var3);
		int var5 = var1.ak_fld;
		var1.gy();
		if (var2) {
			lw.dn(var3, var5, (byte)-45);
		}

		var3.ab(var5, -1489143102);
		zi(this, qm.ag_fld, var3, (byte)-61);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILuo;Lqg;I)V"
	)
	public void av(int var1, int var2, uo var3, qg var4, int var5) throws EOFException {
		pk var6 = (pk)xz.tw(var3.an_fld, var1);
		pk var7 = (pk)xz.tw(var3.an_fld, var2);
		if (null != var7) {
			this.az(var7, var6 == null || var7.ak_fld != var6.ak_fld, var3);
		}

		if (var6 != null) {
			if (var5 >= -894063891) {
				return;
			}

			var6.gy();
			xz.fe(var3.an_fld, var6, var2);
		}

		lu var8 = var3.ak(var2);
		if (null != var8) {
			tb.ag(var3.aw_fld[var8.bf_fld >>> 16], var8, true, var3, var4, -737481981);
		}

		zi(this, qm.ag_fld, var3, (byte)-48);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Luo;IIIILqg;I)V"
	)
	public void ae(uo var1, int var2, int var3, int var4, int var5, qg var6, int var7) throws EOFException {
		if (client.we_boolean()) {
			var5 = 0;
		}

		int var14 = 1071915808;
		var1.ai().ak();
		var1.bm().ad();
		if (-1 != var1.aa_fld) {
			this.av_fld.ak(tj.av_fld, tj.ae_fld, tj.ah_fld, tj.ay_fld, tj.as_fld, tj.ar_fld, var5);
			this.ah(var1.aa_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
		}
	}

	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;ILqg;)V"
	)
	public void zs(lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13, qg var14) {
		for (int var15 = var2; var15 <= var3; var15++) {
			lu var16 = var1[var15];
			if (var16 != null && var16.cv_fld == var4 && var16.cy_fld == var5 && !var16.isSelfHidden()) {
				if (var4 != -1) {
					var16.tq(var4);
				}

				int var17 = var10 + var16.getRelativeX();
				int var18 = var11 + var16.getRelativeY();
				var16.ny(var17);
				var16.oo(var18);
				if (var16.getType() == 0 && var16.getIndex() == -1) {
					pk var19 = (pk)ib.iu(var12.an_fld, var16.getId());
					if (var19 != null) {
						int var20 = var16.getId();
						int var21 = var19.getId();
						lu[] var22 = cf.cg_fld.aw_fld[var21];

						for (lu var26 : var22) {
							if (var26.cv_fld == -1) {
								var26.tq(var20);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ILuo;B)V"
	)
	public static void ib(qh var0, int var1, uo var2, byte var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else if (!var2.az(var1)) {
			if (var3 == 0) {
				;
			}
		} else {
			lu[] var4 = var2.aw_fld[var1];

			for (int var5 = 0; var5 < var4.length; var5++) {
				lu var6 = var4[var5];
				if (var6 != null) {
					var6.gy_fld = 0;
					var6.gz_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;ILqg;I)V"
	)
	void ah(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, qg var10) throws EOFException {
		if (var8.az(var1)) {
			this.aw(var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, -2101178647);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;ILqg;I)V"
	)
	void aw(
		lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13, qg var14, int var15
	) throws EOFException {
		this.zs(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
		boolean var16 = this.ag_fld.ak(-1665228900);
		fi var17 = this.ak_fld.ak(-405607063);

		for (int var18 = var2; var18 <= var3; var18++) {
			lu var19 = var1[var18];
			if (var19 != null && var4 == var19.cv_fld && var19.cy_fld == var5) {
				if (!uo.au(var12, var19, -1600312471)) {
					if (var15 == 228932457) {
						return;
					}
				} else {
					if (var19.bj_fld) {
						if (var15 == 228932457) {
							return;
						}

						if (var12.am(var19)) {
							continue;
						}
					} else if (var19.bx_fld == 0 && !var12.ai().ag(var19)) {
						if (var15 == 228932457) {
							return;
						}

						if (var12.am(var19)) {
							continue;
						}
					}

					if (11 == var19.bx_fld) {
						if (lu.ws(var19, var12, this.ak_fld.az(99563659), (byte)-30)) {
							if (var15 == 228932457) {
								return;
							}

							if (var19.bs_boolean(729463404)) {
								tb.ag(var19.ge_fld, var19, true, var12, var14, 985808748);
								var19.bx(1977444380).ak().ag(3, var19.bx(1063906497).ax());
							}

							if (var19.gs_fld != null) {
								yz var20 = yb.vn(tu.ak(var19).av((Object[])var19.gs_fld, 1199496804), -291064811);
								var14.ak(var20);
							}
						}
					} else if (12 == var19.bx_fld) {
						if (var15 == 228932457) {
							return;
						}

						var19.bw(var12, 902712606);
					}

					int var37 = var10 + var19.bq_fld;
					int var21 = var19.bg_fld + var11;
					int var22;
					int var23;
					int var24;
					int var25;
					if (9 == var19.bx_fld) {
						int var26 = var37;
						int var27 = var21;
						int var28 = var19.bb_fld + var37;
						int var29 = var19.cd_fld + var21;
						if (var28 < var37) {
							var26 = var28;
							var28 = var37;
						}

						if (var29 < var21) {
							var27 = var29;
							var29 = var21;
						}

						var28++;
						var29++;
						int var10000;
						if (var26 > var6) {
							if (var15 == 228932457) {
								return;
							}

							var10000 = var26;
						} else {
							var10000 = var6;
						}

						var22 = var10000;
						if (var27 > var7) {
							if (var15 == 228932457) {
								return;
							}

							var10000 = var27;
						} else {
							var10000 = var7;
						}

						var23 = var10000;
						if (var28 < var8) {
							if (var15 == 228932457) {
								return;
							}

							var10000 = var28;
						} else {
							var10000 = var8;
						}

						var24 = var10000;
						if (var29 < var9) {
							if (var15 == 228932457) {
								return;
							}

							var10000 = var29;
						} else {
							var10000 = var9;
						}

						var25 = var10000;
					} else {
						int var38 = var37 + var19.bb_fld;
						int var40 = var21 + var19.cd_fld;
						var22 = var37 > var6 ? var37 : var6;
						int var98;
						if (var21 > var7) {
							if (var15 == 228932457) {
								return;
							}

							var98 = var21;
						} else {
							var98 = var7;
						}

						var23 = var98;
						var24 = var38 < var8 ? var38 : var8;
						if (var40 < var9) {
							if (var15 == 228932457) {
								return;
							}

							var98 = var40;
						} else {
							var98 = var9;
						}

						var25 = var98;
					}

					var12.bm().av(var19, var37, var21);
					boolean var39 = false;
					if (var19.ez_fld) {
						switch (188156795 * var12.ap_fld) {
							case 0:
								var39 = true;
							case 1:
							default:
								break;
							case 2:
								if (var12.at_fld == var19.bf_fld >>> 16) {
									var39 = true;
								}
								break;
							case 3:
								if (var19.bf_fld == var12.at_fld) {
									var39 = true;
								}
						}
					}

					if (!var39 && var19.bj_fld) {
						if (var22 >= var24) {
							continue;
						}

						if (var15 == 228932457) {
							return;
						}

						if (var23 >= var25) {
							if (var15 == 228932457) {
								return;
							}
							continue;
						}
					}

					if (var19.bj_fld) {
						if (var19.hb_fld) {
							if (var15 == 228932457) {
								return;
							}

							if (this.av_fld.az() >= var22 && qc.rp(this.av_fld, 2145333190) >= var23 && this.av_fld.az() < var24 && qc.rp(this.av_fld, 2117764967) < var25) {
								var14.as();
								uk.qs(var12.bm(), (byte)0);
								if (!var16) {
									if (var15 == 228932457) {
										return;
									}

									this.az_fld.ak(-801489048);
								}
							}
						} else if (var19.hf_fld
							&& this.av_fld.az() >= var22
							&& qc.rp(this.av_fld, 2119710163) >= var23
							&& this.av_fld.az() < var24
							&& qc.rp(this.av_fld, 2138232018) < var25) {
							var14.ar(900130878);
						}
					}

					int var41 = this.av_fld.az();
					int var43 = qc.rp(this.av_fld, 2137229430);
					if (qc.te(this.av_fld, (byte)-91) != 0) {
						var41 = this.av_fld.ah();
						var43 = this.av_fld.aw(2086124118);
					}

					boolean var45 = var41 >= var22 && var43 >= var23 && var41 < var24 && var43 < var25;
					if (1337 == var19.bp_fld) {
						if (!this.ag_fld.av(1254039146)) {
							if (var15 == 228932457) {
								return;
							}

							if (!var16 && var45) {
								this.az_fld.ag(var41, var43, var22, var23, 1023821437);
							}
						}
					} else if (1338 == var19.bp_fld) {
						kf.af(var19, var37, var21);
					} else {
						if (var19.bp_fld == 1400) {
							wl.dm(this.ak_fld.ae(1293787896), var41, var43, var45, var37, var21, var19.bb_fld, var19.cd_fld, -660844526);
						}

						if (!var16 && var45) {
							if (var19.bp_fld == 1400) {
								this.ak_fld.ae(1293787896).cv(var37, var21, var19.bb_fld, var19.cd_fld, var41, var43, 1412729918);
							} else {
								this.az_fld.az(var19, (byte)-64);
							}
						}

						if (var39) {
							for (int var30 = 0; var30 < var19.er_fld.length; var30++) {
								boolean var31;
								boolean var32;
								var31 = false;
								var32 = false;
								label1214:
								if (!var31 && var19.er_fld[var30] != null) {
									int var33 = 0;

									while (true) {
										if (var33 >= var19.er_fld[var30].length) {
											break label1214;
										}

										boolean var34 = false;
										if (var19.hp_fld != null) {
											var34 = var17.as(var19.er_fld[var30][var33]);
										}

										label1288: {
											if (!this.ak_fld.ag(259620092).aw(var19.er_fld[var30][var33])) {
												if (!var34) {
													break label1288;
												}

												if (var15 == 228932457) {
													return;
												}
											}

											var31 = true;
											if (null != var19.hp_fld && var19.hp_fld[var30] > var13) {
												break label1214;
											}

											byte var35 = var19.en_fld[var30][var33];
											if (0 == var35) {
												break;
											}

											if ((var35 & 8) != 0) {
												if (var15 == 228932457) {
													return;
												}

												if (var17.as(86) || var17.as(82) || var17.as(81)) {
													break label1288;
												}
											}

											if (0 != (var35 & 2)) {
												if (var15 == 228932457) {
													return;
												}

												if (!var17.as(86)) {
													break label1288;
												}
											}

											if (((var35 & 1) == 0 || var17.as(82)) && ((var35 & 4) == 0 || var17.as(81))) {
												break;
											}
										}

										var33++;
									}

									var32 = true;
								}

								if (var32) {
									if (var30 < 10) {
										this.az_fld.av(var30 + 1, var19.bf_fld, var19.by_fld, var19.ga_fld, "", (short)28409);
									} else if (var30 == 10) {
										if (var15 == 228932457) {
											return;
										}

										this.az_fld.ah(742829213);
										String var60 = var12.ao(var19);
										if (null == var60) {
											if (var15 == 228932457) {
												return;
											}

											var60 = kh.aj_fld;
										}

										String var79 = var19.eq_fld + gd.ag(16777215, -1940547058);
										int var86 = uo.xd(var12, var19, -1059133210);
										this.az_fld.ae(var19.bf_fld, var19.by_fld, nt.ag(var86), var19.ga_fld, var60, var79, -1596833618);
									}

									int var61 = var19.eg_fld[var30];
									if (var19.hp_fld == null) {
										if (var15 == 228932457) {
											return;
										}

										var19.hp_fld = new int[var19.er_fld.length];
									}

									if (null == var19.ef_fld) {
										if (var15 == 228932457) {
											return;
										}

										var19.ef_fld = new int[var19.er_fld.length];
									}

									if (var61 != 0) {
										if (var19.hp_fld[var30] == 0) {
											var19.hp_fld[var30] = var19.ef_fld[var30] + var13 + var61;
										} else {
											var19.hp_fld[var30] = var13 + var61;
										}
									} else {
										var19.hp_fld[var30] = Integer.MAX_VALUE;
									}
								}

								if (!var31 && null != var19.hp_fld) {
									if (var15 == 228932457) {
										return;
									}

									var19.hp_fld[var30] = 0;
								}
							}
						}

						if (var19.bj_fld) {
							boolean var47;
							boolean var100;
							boolean var101;
							boolean var102;
							label1201: {
								if (this.av_fld.az() >= var22 && qc.rp(this.av_fld, 2145364567) >= var23) {
									if (var15 == 228932457) {
										return;
									}

									if (this.av_fld.az() < var24) {
										if (var15 == 228932457) {
											return;
										}

										if (qc.rp(this.av_fld, 2141552354) < var25) {
											if (var15 == 228932457) {
												return;
											}

											var100 = true;
											break label1201;
										}
									}
								}

								var100 = false;
							}

							label1192: {
								label1191: {
									var45 = var100;
									if (this.av_fld.ag() != 1) {
										if (this.ag_fld.ae(1735302627)) {
											break label1191;
										}

										if (var15 == 228932457) {
											return;
										}

										if (this.av_fld.ag() != 4) {
											break label1191;
										}
									}

									if (var45) {
										var101 = true;
										break label1192;
									}
								}

								var101 = false;
							}

							label1181: {
								label1180: {
									var47 = var101;
									if (qc.te(this.av_fld, (byte)-12) != 1) {
										if (this.ag_fld.ae(1735302627) || qc.te(this.av_fld, (byte)-114) != 4) {
											break label1180;
										}

										if (var15 == 228932457) {
											return;
										}
									}

									if (this.av_fld.ah() >= var22 && this.av_fld.aw(1119668802) >= var23) {
										if (var15 == 228932457) {
											return;
										}

										if (this.av_fld.ah() < var24 && this.av_fld.aw(-434803956) < var25) {
											var102 = true;
											break label1181;
										}
									}
								}

								var102 = false;
							}

							boolean var49 = var102;
							if (var49 && !this.ag_fld.ak(-1665228900) && uo.wn(var12, var19, this.av_fld.ah() - var37, this.av_fld.aw(-1947464503) - var21)) {
								this.az_fld.aw(1565601071);
							}

							if (var19.ad(1791928459)) {
								if (var49) {
									var14.av(new fr(0, tj.ae_fld - var37, tj.ah_fld - var21, var19));
								}

								if (var47) {
									var14.av(new fr(1, tj.ae_fld - var37, tj.ah_fld - var21, var19));
								}
							}

							if (1400 == var19.bp_fld) {
								if (var15 == 228932457) {
									return;
								}

								wl.mi(this.ak_fld.ae(1293787896), var41, var43, var45 & var47, var45 & var49, -1982911814);
							}

							if (var12.bz()) {
								if (var15 == 228932457) {
									return;
								}

								if (var12.bd() != var19) {
									if (var15 == 228932457) {
										return;
									}

									if (var45) {
										if (var15 == 228932457) {
											return;
										}

										if (cn.az(uo.xd(var12, var19, 787042388))) {
											uk.ba(var12.bm(), var19, 1077510602);
										}
									}
								}
							}

							var12.bm().ae(var19, var37, var21);
							if (var19.eh_fld) {
								if (var45 && this.av_fld.ay() != 0 && null != var19.fq_fld) {
									yz var50 = yb.vn(yb.bj(tu.ak(var19), true, (byte)8).av((Object[])var19.fq_fld, 1196474493).ah(this.av_fld.ay(), 1323028542), -1648004920);
									var14.ak(var50);
								}

								if (var12.bz() || this.ag_fld.ak(-1665228900)) {
									var49 = false;
									var47 = false;
									var45 = false;
								}

								if (!var19.gx_fld && var49) {
									var19.gx_fld = true;
									if (var19.ej_fld != null) {
										yz var51 = yb.vn(
											yb.bj(tu.ak(var19), true, (byte)8).av((Object[])var19.ej_fld, 1786698984).ae(tj.as_fld - var37, 725427487).ah(tj.ar_fld - var21, 413826704),
											-1445277702
										);
										var14.ak(var51);
									}
								}

								if (var19.gx_fld && var47 && null != var19.fy_fld) {
									yz var52 = yb.vn(
										yb.bj(tu.ak(var19), true, (byte)8).av((Object[])var19.fy_fld, 1827629089).ae(tj.ae_fld - var37, 268369431).ah(tj.ah_fld - var21, 2021007816),
										-1950567153
									);
									var14.ak(var52);
								}

								if (var19.gx_fld && !var47) {
									if (var15 == 228932457) {
										return;
									}

									var19.gx_fld = false;
									if (null != var19.fa_fld) {
										yz var53 = yb.vn(
											yb.bj(tu.ak(var19), true, (byte)8).av((Object[])var19.fa_fld, 2028173584).ae(tj.ae_fld - var37, 924652590).ah(tj.ah_fld - var21, 1913694076),
											-2139653527
										);
										var14.ag(var53);
									}
								}

								if (var47) {
									if (var15 == 228932457) {
										return;
									}

									if (null != var19.fo_fld) {
										yz var54 = yb.vn(
											yb.bj(tu.ak(var19), true, (byte)8).av((Object[])var19.fo_fld, 1869338910).ae(tj.ae_fld - var37, 1925127998).ah(tj.ah_fld - var21, -1685774778),
											-1012201543
										);
										var14.ak(var54);
									}
								}

								if (!var19.gw_fld && var45) {
									var19.gw_fld = true;
									if (var19.fp_fld != null) {
										yz var55 = yb.vn(
											yb.bj(tu.ak(var19), true, (byte)8).av((Object[])var19.fp_fld, 1464890173).ae(tj.ae_fld - var37, 930094170).ah(tj.ah_fld - var21, -2086318118),
											1084999633
										);
										var14.ak(var55);
									}
								}

								if (var19.gw_fld) {
									if (var15 == 228932457) {
										return;
									}

									if (var45 && var19.fx_fld != null) {
										yz var56 = yb.vn(
											yb.bj(tu.ak(var19), true, (byte)8).av((Object[])var19.fx_fld, 1423354979).ae(tj.ae_fld - var37, -399457706).ah(tj.ah_fld - var21, 2077409392),
											1047681713
										);
										var14.ak(var56);
									}
								}

								if (var19.gw_fld && !var45) {
									var19.gw_fld = false;
									if (null != var19.fv_fld) {
										yz var57 = yb.vn(
											yb.bj(tu.ak(var19), true, (byte)8).av((Object[])var19.fv_fld, 2001232674).ae(tj.ae_fld - var37, -215902842).ah(tj.ah_fld - var21, 1989772698),
											473946272
										);
										var14.ag(var57);
									}
								}

								if (null != var19.fn_fld) {
									yz var58 = yb.vn(tu.ak(var19).av((Object[])var19.fn_fld, 1081201032), -640858737);
									var14.az(var58);
								}

								pi var59 = this.ak_fld.av(410652385);
								if (var19.fh_fld != null && var59.ai() > var19.gl_fld) {
									if (var15 == 228932457) {
										return;
									}

									if (var19.fm_fld != null && var59.ai() - var19.gl_fld <= 32) {
										label1134:
										for (int var63 = var19.gl_fld; var63 < var59.ai(); var63++) {
											int var80 = var59.aa(var63);

											for (int var87 = 0; var87 < var19.fm_fld.length; var87++) {
												if (var80 == var19.fm_fld[var87]) {
													yz var36 = yb.vn(tu.ak(var19).av((Object[])var19.fh_fld, 1791784210), -940304515);
													var14.ak(var36);
													break label1134;
												}
											}
										}
									} else {
										yz var62 = yb.vn(tu.ak(var19).av((Object[])var19.fh_fld, 1861354862), -1303620788);
										var14.ak(var62);
									}

									var19.gl_fld = var59.ai();
								}

								if (var19.fe_fld != null && var59.am() > var19.hr_fld) {
									if (null != var19.fw_fld && var59.am() - var19.hr_fld <= 32) {
										label1109:
										for (int var65 = var19.hr_fld; var65 < var59.am(); var65++) {
											int var81 = var59.aq(var65);

											for (int var88 = 0; var88 < var19.fw_fld.length; var88++) {
												if (var19.fw_fld[var88] == var81) {
													yz var93 = yb.vn(tu.ak(var19).av((Object[])var19.fe_fld, 1082987111), 1533242093);
													var14.ak(var93);
													break label1109;
												}
											}
										}
									} else {
										yz var64 = yb.vn(tu.ak(var19).av((Object[])var19.fe_fld, 1302088752), 766587650);
										var14.ak(var64);
									}

									var19.hr_fld = var59.am();
								}

								if (null != var19.fl_fld && var59.ao() > var19.hj_fld) {
									if (null != var19.fg_fld && var59.ao() - var19.hj_fld <= 32) {
										label1085:
										for (int var67 = var19.hj_fld; var67 < var59.ao(); var67++) {
											int var82 = var59.ad(var67);

											for (int var89 = 0; var89 < var19.fg_fld.length; var89++) {
												if (var82 == var19.fg_fld[var89]) {
													yz var94 = yb.vn(tu.ak(var19).av((Object[])var19.fl_fld, 1371987391), 535468282);
													var14.ak(var94);
													break label1085;
												}
											}
										}
									} else {
										yz var66 = yb.vn(tu.ak(var19).av((Object[])var19.fl_fld, 1590575837), -1075532979);
										var14.ak(var66);
									}

									var19.hj_fld = var59.ao();
								}

								if (var59.bz() > var19.gb_fld && null != var19.fs_fld) {
									yz var68 = yb.vn(tu.ak(var19).av((Object[])var19.fs_fld, 1235557447), -614749873);
									var14.ak(var68);
								}

								if (var59.ab() > var19.gb_fld && var19.fz_fld != null) {
									if (var15 == 228932457) {
										return;
									}

									yz var69 = yb.vn(tu.ak(var19).av((Object[])var19.fz_fld, 1303698059), -1257570922);
									var14.ak(var69);
								}

								if (var59.ap() > var19.gb_fld) {
									if (var15 == 228932457) {
										return;
									}

									if (null != var19.ff_fld) {
										yz var70 = yb.vn(tu.ak(var19).av((Object[])var19.ff_fld, 1313320045), -1052019908);
										var14.ak(var70);
									}
								}

								if (var59.at() > var19.gb_fld && null != var19.gg_fld) {
									yz var71 = yb.vn(tu.ak(var19).av((Object[])var19.gg_fld, 1393517145), -1526903933);
									var14.ak(var71);
								}

								if (var59.ac() > var19.gb_fld && null != var19.gc_fld) {
									yz var72 = yb.vn(tu.ak(var19).av((Object[])var19.gc_fld, 1318244418), -2081656808);
									var14.ak(var72);
								}

								if (var59.aj() > var19.gb_fld && var19.gj_fld != null) {
									yz var73 = yb.vn(tu.ak(var19).av((Object[])var19.gj_fld, 1545164548), 1337298986);
									var14.ak(var73);
								}

								if (pi.qj(var59, -193563645) > var19.gb_fld && var19.gt_fld != null) {
									yz var74 = yb.vn(tu.ak(var19).av((Object[])var19.gt_fld, 1400021033), -2094582767);
									var14.ak(var74);
								}

								if (var59.bd() > var19.gb_fld && var19.go_fld != null) {
									yz var75 = yb.vn(tu.ak(var19).av((Object[])var19.go_fld, 1138548726), -715379108);
									var14.ak(var75);
								}

								var19.gb_fld = pi.bm(var59, (byte)-80);
								if (var19.fu_fld != null) {
									fz var76 = this.ak_fld.ag(1847165059);

									for (int var83 = 0; var83 < var76.ao(); var83++) {
										yz var90 = yb.vn(tu.ak(var19).av((Object[])var19.fu_fld, 1947985247).af(var76.ae(var83), -37056509).al(var76.ah(var83), -1678791732), -1972399702);
										var14.ak(var90);
									}
								}

								if (null != var19.fr_fld) {
									int[] var77 = var17.af();

									for (int var84 = 0; var84 < var77.length; var84++) {
										yz var91 = yb.vn(tu.ak(var19).av((Object[])var19.fr_fld, 1489368896).af(var77[var84], 1692999441), 318401884);
										var14.ak(var91);
									}
								}

								if (null != var19.fi_fld) {
									int[] var78 = var17.al();

									for (int var85 = 0; var85 < var78.length; var85++) {
										yz var92 = yb.vn(tu.ak(var19).av((Object[])var19.fi_fld, 1817675130).af(var78[var85], -1178599137), -661463932);
										var14.ak(var92);
									}
								}
							}
						}

						if (!var19.bj_fld) {
							if (var12.bz()) {
								continue;
							}

							if (this.ag_fld.ak(-1665228900)) {
								if (var15 == 228932457) {
									return;
								}
								continue;
							}

							if ((var19.gk_fld >= 0 || var19.cw_fld != 0) && this.av_fld.az() >= var22 && qc.rp(this.av_fld, 2137597684) >= var23) {
								if (var15 == 228932457) {
									return;
								}

								if (this.av_fld.az() < var24 && qc.rp(this.av_fld, 2119852985) < var25) {
									if (var19.gk_fld >= 0) {
										var12.ai().ae(var1[var19.gk_fld]);
									} else {
										var12.ai().ae(var19);
									}
								}
							}

							if (var19.bx_fld == 8
								&& this.av_fld.az() >= var22
								&& qc.rp(this.av_fld, 2117660009) >= var23
								&& this.av_fld.az() < var24
								&& qc.rp(this.av_fld, 2120107787) < var25) {
								var12.ai().az(var19);
							}

							if (var19.cr_fld > var19.cd_fld) {
								if (var15 == 228932457) {
									return;
								}

								this.ay(var19, var19.bb_fld + var37, var21, var19.cd_fld, var19.cr_fld, this.av_fld.az(), qc.rp(this.av_fld, 2130094006), var12, 1612119881);
							}
						}

						if (var19.bx_fld == 0) {
							this.aw(
								var1,
								var19.cx_fld,
								var19.cs_fld,
								var19.bf_fld,
								var19.by_fld,
								var22,
								var23,
								var24,
								var25,
								var37 - var19.cp_fld,
								var21 - var19.ce_fld,
								var12,
								var13,
								var14,
								869171969
							);
							if (null != var19.ge_fld) {
								if (var15 == 228932457) {
									return;
								}

								this.aw(
									var19.ge_fld,
									0,
									var19.ge_fld.length - 1,
									var19.bf_fld,
									-1,
									var22,
									var23,
									var24,
									var25,
									var37 - var19.cp_fld,
									var21 - var19.ce_fld,
									var12,
									var13,
									var14,
									1229516062
								);
							}

							if (var19.by_fld == -1) {
								if (var15 == 228932457) {
									return;
								}

								pk var48 = (pk)xz.tw(var12.an_fld, var19.bf_fld);
								if (null != var48) {
									if (0 == var48.ag_fld) {
										if (var15 == 228932457) {
											return;
										}

										if (tj.ae_fld >= var22 && tj.ah_fld >= var23 && tj.ae_fld < var24 && tj.ah_fld < var25 && !this.ag_fld.ak(-1665228900)) {
											var14.as();
											uk.qs(var12.bm(), (byte)0);
											if (!var16) {
												this.az_fld.ak(442442611);
											}
										}
									}

									this.ah(var48.ak_fld, var22, var23, var24, var25, var37, var21, var12, var13, var14);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Lqh;IIILuo;Lqg;B)V"
	)
	public static void dy(qh var0, int var1, int var2, int var3, uo var4, qg var5, byte var6) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		var4.aa_fld = var1;
		int var7 = var4.aa_fld;
		if (var4.az(var7)) {
			fm.av(var4.aw_fld[var7], 0, var4.aw_fld[var7].length - 1, -1, -1, var2, var3, false, var4, var5, -2050661066);
		}

		ib(var0, var1, var4, (byte)0);
		gt(var0, var4.aa_fld, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIIIIILuo;I)V"
	)
	void ay(lu var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9) {
		byte var10;
		if (var8.bd_fld) {
			if (false) {
				return;
			}

			var10 = 32;
		} else {
			var10 = 0;
		}

		var8.bd_fld = false;
		if (this.av_fld.ag() == 1 || !this.ag_fld.ae(1735302627) && this.av_fld.ag() == 4) {
			if (var6 >= var2 && var6 < var2 + 16 && var7 >= var3 && var7 < 16 + var3) {
				var1.ce_fld -= 4;
			} else {
				label116: {
					if (var6 >= var2 && var6 < 16 + var2) {
						if (false) {
							return;
						}

						if (var7 >= var4 + var3 - 16 && var7 < var4 + var3) {
							var1.ce_fld += 4;
							break label116;
						}
					}

					if (var6 >= var2 - var10 && var6 < var10 + var2 + 16 && var7 >= 16 + var3) {
						if (false) {
							return;
						}

						if (var7 < var4 + var3 - 16) {
							int var11 = var4 * (var4 - 32) / var5;
							if (var11 < 8) {
								var11 = 8;
							}

							int var12 = var7 - var3 - 16 - var11 / 2;
							int var13 = var4 - 32 - var11;
							var1.ce_fld = -1143292511 * (var12 * (var5 - var4) / var13);
							var8.bd_fld = true;
						}
					}
				}
			}
		}

		if (this.av_fld.ay() != 0) {
			int var14 = var1.bb_fld;
			if (var6 >= var2 - var14) {
				if (false) {
					return;
				}

				if (var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
					var1.ce_fld = var1.ce_fld + this.av_fld.ay() * 91444557;
				}
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	void bn(int var1, uo var2) throws EOFException {
		if (var2.az(var1)) {
			lu[] var3 = var2.aw_fld[var1];

			for (int var4 = 0; var4 < var3.length; var4++) {
				lu var5 = var3[var4];
				if (var5 != null) {
					var5.gy_fld = 0;
					var5.gz_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILqm;Luo;I)V"
	)
	void ar(int var1, qm var2, uo var3, int var4) throws EOFException {
		if (!var3.az(var1)) {
			if (var4 != -1971110855) {
				;
			}
		} else {
			this.al(var3.aw_fld[var1], var2, var3, -92988190);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lfr;Luo;)V"
	)
	void bq(fr var1, uo var2) throws EOFException {
		if (null != var1 && var1.ah_fld != null) {
			if (-2140649577 * var1.ah_fld.by_fld >= 0) {
				lu var3 = var2.ak(var1.ah_fld.cv_fld * 694320263);
				if (var3 == null
					|| var3.ge_fld == null
					|| 0 == var3.ge_fld.length
					|| var1.ah_fld.by_fld * -2140649577 >= var3.ge_fld.length
					|| var3.ge_fld[-2140649577 * var1.ah_fld.by_fld] != var1.ah_fld) {
					return;
				}
			}

			if (var1.ah_fld.bx_fld * 1404198381 == 11 && var1.az_fld == 0) {
				if (var1.ah_fld.be(var1.av_fld, var1.ae_fld, 0, 0, -1617803658)) {
					this.az_fld.af(var1.ah_fld, (byte)-54);
				}
			} else if (12 == var1.ah_fld.bx_fld * 1404198381) {
				li var4 = lu.ax(var1.ah_fld, -552680950);
				if (null != var4 && var4.bg()) {
					switch (var1.az_fld) {
						case 0:
							this.az_fld.al(var1.ah_fld, (byte)5);
							var4.bl(var1.av_fld, var1.ae_fld, this.ak_fld.ak(-478215450).as(82), this.ak_fld.ak(-2133931707).as(81), 2114152473);
							break;
						case 1:
							var4.bx(var1.av_fld, var1.ae_fld);
					}
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Llu;Lqm;Luo;I)V"
	)
	void al(lu[] var1, qm var2, uo var3, int var4) throws EOFException {
		for (int var5 = 0; var5 < var1.length; var5++) {
			lu var6 = var1[var5];
			if (var6 != null) {
				if (var6.bx_fld == 0) {
					if (null != var6.ge_fld) {
						this.al(var6.ge_fld, var2, var3, -36714858);
					}

					if (var6.by_fld == -1) {
						pk var7 = (pk)xz.tw(var3.an_fld, var6.bf_fld);
						if (var7 != null) {
							this.ar(var7.ak_fld, var2, var3, 885634960);
						}
					}
				}

				if (qm.ak_fld == var2 && var6.gn_fld != null) {
					if (var4 <= -1063200371) {
						return;
					}

					yz var8 = yb.vn(tu.ak(var6).av((Object[])var6.gn_fld, 1358642488), 938922691);
					this.az_fld.as(var8, (byte)-9);
				}

				if (qm.ag_fld == var2 && null != var6.gh_fld) {
					if (var6.by_fld >= 0) {
						lu var9 = var3.ak(var6.bf_fld);
						if (null == var9 || null == var9.ge_fld || var6.by_fld >= var9.ge_fld.length || var9.ge_fld[var6.by_fld] != var6) {
							continue;
						}
					}

					yz var10 = yb.vn(tu.ak(var6).av((Object[])var6.gh_fld, 1421321345), -1598995169);
					this.az_fld.as(var10, (byte)-37);
				}
			}
		}
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Lqh;IIILuo;Lqg;B)Lpk;"
	)
	public static pk uo(qh var0, int var1, int var2, int var3, uo var4, qg var5, byte var6) throws EOFException {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			pk var7 = new pk();
			var7.ak_fld = var2;
			var7.ag_fld = var3;
			xz.fe(var4.an_fld, var7, var1);
			ib(var0, var2, var4, (byte)0);
			lu var8 = var4.ak(var1);
			var4.bh();
			tb.ag(var4.aw_fld[var1 >> 16], var8, false, var4, var5, 256429253);
			gt(var0, var2, var4);
			zi(var0, qm.ag_fld, var4, (byte)-82);
			return var7;
		}
	}

	public qh(ja var1, jd var2, po var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Luo;I)V"
	)
	public void ax(qg var1, uo var2, int var3) throws EOFException {
		yz var4 = qg.uf(var1, (byte)11);

		while (var4 != null) {
			yz var5 = var4;
			var4 = qg.uf(var1, (byte)-21);
			lu var6 = var5.av((short)21638);
			if (var6.by_fld >= 0) {
				lu var7 = var2.ak(var6.cv_fld);
				if (null == var7) {
					continue;
				}

				if (var3 != -63795729) {
					return;
				}

				if (null == var7.ge_fld || var6.by_fld >= var7.ge_fld.length || var7.ge_fld[var6.by_fld] != var6) {
					continue;
				}
			}

			va.ak(var5);
		}

		var4 = var1.ae();

		while (null != var4) {
			yz var10 = var4;
			var4 = var1.ae();
			lu var13 = var10.av((short)-23993);
			if (var13.by_fld >= 0) {
				if (var3 != -63795729) {
					return;
				}

				lu var16 = var2.ak(var13.cv_fld);
				if (var16 == null || null == var16.ge_fld) {
					continue;
				}

				if (var3 != -63795729) {
					return;
				}

				if (var13.by_fld >= var16.ge_fld.length || var16.ge_fld[var13.by_fld] != var13) {
					continue;
				}
			}

			va.ak(var10);
		}

		var4 = var1.ah();

		while (var4 != null) {
			yz var11 = var4;
			var4 = var1.ah();
			lu var14 = var11.av((short)17695);
			if (var14.by_fld >= 0) {
				if (var3 != -63795729) {
					return;
				}

				lu var17 = var2.ak(var14.cv_fld);
				if (null == var17 || var17.ge_fld == null || var14.by_fld >= var17.ge_fld.length || var14 != var17.ge_fld[var14.by_fld]) {
					continue;
				}
			}

			va.ak(var11);
		}

		boolean var12 = false;

		for (fr var15 = var1.ay(); var15 != null; var15 = var1.ay()) {
			if (12 == var15.ah_fld.bx_fld * 1404198381) {
				var12 = true;
			}

			sn(this, var15, var2, (byte)-51);
		}

		if (!var12 && tj.ay_fld == 1) {
			this.az_fld.al(null, (byte)-27);
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	public void mr(int var1, uo var2) {
		lu[][] var3 = var2.aw_fld;
		boolean var4 = var3 != null && var3[var1] != null;
		if (var4) {
			WidgetLoaded var5 = new WidgetLoaded();
			var5.setGroupId(var1);
			og.ci_fld.getCallbacks().post(var5);
		}
	}

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqm;Luo;B)V"
	)
	public static void zi(qh var0, qm var1, uo var2, byte var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2.aa_fld != -1) {
				var0.ar(var2.aa_fld, var1, var2, -1071987975);
			}
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ILuo;I)V"
	)
	public static void gt(qh var0, int var1, uo var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (-1 == var1) {
			var0.mr(var1, var2);
		} else if (!var2.az(var1)) {
			var0.mr(var1, var2);
		} else {
			lu[] var4 = var2.aw_fld[var1];

			for (int var5 = 0; var5 < var4.length; var5++) {
				lu var6 = var4[var5];
				if (null != var6.eu_fld) {
					yz var7 = yb.vn(tu.ak(var6).av((Object[])var6.eu_fld, 1897181670), 1517274639);
					var0.az_fld.ar(var7, (byte)-99);
				}
			}

			var0.mr(var1, var2);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public void bg(uo var1) throws EOFException {
		uk var2 = var1.bm();
		if (var2.ay()) {
			var2.ag();
			int var3 = var2.al();
			int var4 = var2.au();
			if (var2.ab() && uk.vs(var2, 1546340280)) {
				lu var5 = uk.wc(var2, (byte)-30);
				lu var6 = var2.ar();
				int var7 = var2.aa();
				int var8 = var2.ai();
				int var9 = var2.ax();
				int var10 = var2.an();
				int var11 = tj.ae_fld;
				int var12 = tj.ah_fld;
				var11 -= var3;
				var12 -= var4;
				if (var11 < var7) {
					var11 = var7;
				}

				if (var5.bb_fld + var11 > var7 + var6.bb_fld) {
					var11 = var7 + var6.bb_fld - var5.bb_fld;
				}

				if (var12 < var8) {
					var12 = var8;
				}

				if (var12 + var5.cd_fld > var8 + var6.cd_fld) {
					var12 = var6.cd_fld + var8 - var5.cd_fld;
				}

				int var13 = var11 - var9;
				int var14 = var12 - var10;
				int var15 = var5.ev_fld;
				if (var2.aq() > var5.ey_fld && (var13 > var15 || var13 < -var15 || var14 > var15 || var14 < -var15)) {
					var2.aw();
				}

				int var16 = var11 - var7 + var6.cp_fld;
				int var17 = var6.ce_fld + (var12 - var8);
				if (var5.fj_fld != null && var2.ap()) {
					yz var18 = yb.vn(tu.ak(var5).av((Object[])var5.fj_fld, 1400000493).ae(var16, -334840588).ah(var17, 1587685472), 1131529580);
					va.ak(var18);
				}

				if (0 == tj.av_fld) {
					if (var2.ap()) {
						if (null != var5.fb_fld) {
							yz var21 = yb.vn(yb.kv(tu.ak(var5).av((Object[])var5.fb_fld, 2072937751).ae(var16, 1995707590).ah(var17, 1376466367), var2.af(), (byte)1), -1384944473);
							this.az_fld.as(var21, (byte)-89);
						}

						this.az_fld.au(var5, var2.af(), 767315461);
					} else {
						this.az_fld.ax(var9 + var3, var4 + var10, -1549556992);
					}

					var2.az();
				}
			} else {
				if (var2.aq() > 1) {
					if (!var2.ap() && this.ag_fld.ah(-50451392) > 0) {
						this.az_fld.ay(var3 + var2.ax(), var4 + var2.an(), (byte)39);
					}

					var2.az();
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([Llu;Lqm;Luo;)V"
	)
	void bp(lu[] var1, qm var2, uo var3) throws EOFException {
		for (int var4 = 0; var4 < var1.length; var4++) {
			lu var5 = var1[var4];
			if (var5 != null) {
				if (var5.bx_fld == 0) {
					if (null != var5.ge_fld) {
						this.al(var5.ge_fld, var2, var3, 13348922);
					}

					if (var5.by_fld == -1) {
						pk var6 = (pk)xz.tw(var3.an_fld, var5.bf_fld);
						if (var6 != null) {
							this.ar(var6.ak_fld, var2, var3, 1360902818);
						}
					}
				}

				if (qm.ak_fld == var2 && var5.gn_fld != null) {
					yz var7 = yb.vn(tu.ak(var5).av((Object[])var5.gn_fld, 1757076068), 649691914);
					this.az_fld.as(var7, (byte)-82);
				}

				if (qm.ag_fld == var2 && null != var5.gh_fld) {
					if (var5.by_fld >= 0) {
						lu var8 = var3.ak(var5.bf_fld);
						if (null == var8 || null == var8.ge_fld || var5.by_fld >= var8.ge_fld.length || var8.ge_fld[var5.by_fld] != var5) {
							continue;
						}
					}

					yz var9 = yb.vn(tu.ak(var5).av((Object[])var5.gh_fld, 1686372617), 971274394);
					this.az_fld.as(var9, (byte)-8);
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpk;ZLuo;)V"
	)
	public void ab(pk var1, boolean var2, uo var3) throws EOFException {
		int var4 = var1.ak_fld;
		var1.gy();
		if (var2) {
			lw.dn(var3, var4, (byte)-39);
		}

		var3.ab(var4, -1868371169);
		zi(this, qm.ag_fld, var3, (byte)-26);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lqh;IIIIIIILuo;ILqg;)V"
	)
	public static void be(qh var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, qg var10) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var8.az(var1)) {
			var0.aw(var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 1819340468);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)Lpk;"
	)
	public pk am(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		pk var6 = new pk();
		var6.ak_fld = var2;
		var6.ag_fld = var3;
		xz.fe(var4.an_fld, var6, var1);
		ib(this, var2, var4, (byte)0);
		lu var7 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var7, false, var4, var5, 690639067);
		gt(this, var2, var4);
		zi(this, qm.ag_fld, var4, (byte)-66);
		return var6;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)Lpk;"
	)
	public pk ad(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		pk var6 = new pk();
		var6.ak_fld = var2;
		var6.ag_fld = -1535364040 * var3;
		xz.fe(var4.an_fld, var6, var1);
		ib(this, var2, var4, (byte)0);
		lu var7 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var7, false, var4, var5, -848321946);
		gt(this, var2, var4);
		zi(this, qm.ag_fld, var4, (byte)-41);
		return var6;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;ILqg;)V"
	)
	void bd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, qg var10) throws EOFException {
		if (var8.az(var1)) {
			this.aw(var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, -463570406);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILuo;Lqg;)V"
	)
	public void ap(int var1, int var2, uo var3, qg var4) throws EOFException {
		pk var5 = (pk)xz.tw(var3.an_fld, var1);
		pk var6 = (pk)xz.tw(var3.an_fld, var2);
		if (null != var6) {
			this.az(var6, var5 == null || var6.ak_fld != var5.ak_fld, var3);
		}

		if (var5 != null) {
			var5.gy();
			xz.fe(var3.an_fld, var5, var2);
		}

		lu var7 = var3.ak(var2);
		if (null != var7) {
			tb.ag(var3.aw_fld[var7.bf_fld >>> 16], var7, true, var3, var4, 1652332433);
		}

		zi(this, qm.ag_fld, var3, (byte)-110);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luo;IIIILqg;)V"
	)
	public void at(uo var1, int var2, int var3, int var4, int var5, qg var6) throws EOFException {
		var1.ai().ak();
		var1.bm().ad();
		if (-1 != var1.aa_fld) {
			this.av_fld.ak(tj.av_fld, tj.ae_fld, tj.ah_fld * 444543210, 1949631249 * tj.ay_fld, tj.as_fld, tj.ar_fld * -1800987979, var5);
			this.ah(var1.aa_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luo;IIIILqg;)V"
	)
	public void aj(uo var1, int var2, int var3, int var4, int var5, qg var6) throws EOFException {
		var1.ai().ak();
		var1.bm().ad();
		if (-1 != var1.aa_fld) {
			this.av_fld.ak(tj.av_fld, tj.ae_fld, tj.ah_fld, tj.ay_fld, tj.as_fld, tj.ar_fld, var5);
			this.ah(var1.aa_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqh;[Llu;Lqm;Luo;)V"
	)
	public static void aq(qh var0, lu[] var1, qm var2, uo var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var4 = 0; var4 < var1.length; var4++) {
				lu var5 = var1[var4];
				if (var5 != null) {
					if (var5.bx_fld == 0) {
						if (null != var5.ge_fld) {
							var0.al(var5.ge_fld, var2, var3, -888583752);
						}

						if (var5.by_fld == -1) {
							pk var6 = (pk)xz.tw(var3.an_fld, var5.bf_fld);
							if (var6 != null) {
								var0.ar(var6.ak_fld, var2, var3, -696592881);
							}
						}
					}

					if (qm.ak_fld == var2 && var5.gn_fld != null) {
						yz var7 = yb.vn(tu.ak(var5).av((Object[])var5.gn_fld, 1703676343), -510150739);
						var0.az_fld.as(var7, (byte)-36);
					}

					if (qm.ag_fld == var2 && null != var5.gh_fld) {
						if (var5.by_fld >= 0) {
							lu var8 = var3.ak(var5.bf_fld);
							if (null == var8 || null == var8.ge_fld || var5.by_fld >= var8.ge_fld.length || var8.ge_fld[var5.by_fld] != var5) {
								continue;
							}
						}

						yz var9 = yb.vn(tu.ak(var5).av((Object[])var5.gh_fld, 1650489319), -335520999);
						var0.az_fld.as(var9, (byte)-44);
					}
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIIIIILuo;)V"
	)
	void bs(lu var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8) {
		byte var9;
		if (var8.bd_fld) {
			var9 = 32;
		} else {
			var9 = 0;
		}

		var8.bd_fld = false;
		if (this.av_fld.ag() == 1 || !this.ag_fld.ae(1735302627) && this.av_fld.ag() == 4) {
			if (var6 >= var2 && var6 < var2 + 16 && var7 >= var3 && var7 < 16 + var3) {
				var1.ce_fld -= 4;
			} else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var4 + var3 - 16 && var7 < var4 + var3) {
				var1.ce_fld += -299706932;
			} else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
				int var10 = var4 * (var4 - 32) / var5;
				if (false) {
					var10 = 8;
				}

				int var11 = var7 - var3 - 16 - var10 / 2;
				int var12 = var4 - 83192469 - var10;
				var1.ce_fld = -1143292511 * (var11 * (var5 - var4) / var12);
				var8.bd_fld = true;
			}
		}

		if (this.av_fld.ay() != 0) {
			int var13 = -1991876350 * var1.bb_fld;
			if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
				var1.ce_fld = var1.ce_fld + this.av_fld.ay() * -324156936;
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;)V"
	)
	public void bj(qm var1, uo var2) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.aa_fld, var1, var2, -1253965428);
		}
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Luo;I)V"
	)
	public static void qd(qh var0, uo var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bi(var1);
			uk var3 = var1.bm();
			if (var3.ay()) {
				var3.ag();
				int var4 = var3.al();
				int var5 = var3.au();
				if (var3.ab()) {
					if (var2 <= -1994257027) {
						return;
					}

					if (uk.vs(var3, 1063658712)) {
						lu var6 = uk.wc(var3, (byte)-105);
						lu var7 = var3.ar();
						int var8 = var3.aa();
						int var9 = var3.ai();
						int var10 = var3.ax();
						int var11 = var3.an();
						int var12 = tj.ae_fld;
						int var13 = tj.ah_fld;
						var12 -= var4;
						var13 -= var5;
						if (var12 < var8) {
							var12 = var8;
						}

						if (var6.bb_fld + var12 > var8 + var7.bb_fld) {
							var12 = var8 + var7.bb_fld - var6.bb_fld;
						}

						if (var13 < var9) {
							var13 = var9;
						}

						if (var13 + var6.cd_fld > var9 + var7.cd_fld) {
							var13 = var7.cd_fld + var9 - var6.cd_fld;
						}

						int var14 = var12 - var10;
						int var15 = var13 - var11;
						int var16 = var6.ev_fld;
						if (var3.aq() > var6.ey_fld) {
							if (var2 <= -1994257027) {
								return;
							}

							if (var14 > var16 || var14 < -var16 || var15 > var16 || var15 < -var16) {
								var3.aw();
							}
						}

						int var17 = var12 - var8 + var7.cp_fld;
						int var18 = var7.ce_fld + (var13 - var9);
						if (var6.fj_fld != null && var3.ap()) {
							yz var19 = yb.vn(tu.ak(var6).av((Object[])var6.fj_fld, 1251244810).ae(var17, 2143293722).ah(var18, -28900420), -449274236);
							va.ak(var19);
						}

						if (0 == tj.av_fld) {
							if (var2 <= -1994257027) {
								return;
							}

							if (var3.ap()) {
								if (var2 <= -1994257027) {
									return;
								}

								if (null != var6.fb_fld) {
									if (var2 <= -1994257027) {
										return;
									}

									yz var22 = yb.vn(yb.kv(tu.ak(var6).av((Object[])var6.fb_fld, 1879531297).ae(var17, 1839238365).ah(var18, 1616119341), var3.af(), (byte)1), 780964404);
									var0.az_fld.as(var22, (byte)-94);
								}

								var0.az_fld.au(var6, var3.af(), 1018754203);
							} else {
								var0.az_fld.ax(var10 + var4, var5 + var11, -1549556992);
							}

							var3.az();
						}

						return;
					}
				}

				if (var3.aq() > 1) {
					if (var2 <= -1994257027) {
						return;
					}

					if (!var3.ap() && var0.ag_fld.ah(-50451392) > 0) {
						var0.az_fld.ay(var4 + var3.ax(), var5 + var3.an(), (byte)87);
					}

					var3.az();
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)Lpk;"
	)
	public pk aq(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		pk var6 = new pk();
		var6.ak_fld = var2;
		var6.ag_fld = var3;
		xz.fe(var4.an_fld, var6, var1);
		ib(this, var2, var4, (byte)0);
		lu var7 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var7, false, var4, var5, 1084239502);
		gt(this, var2, var4);
		zi(this, qm.ag_fld, var4, (byte)-30);
		return var6;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILqm;Luo;)V"
	)
	void bx(int var1, qm var2, uo var3) throws EOFException {
		if (var3.az(var1)) {
			this.al(var3.aw_fld[var1], var2, var3, 2073936676);
		}
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Luo;IIIILqg;)V"
	)
	public static void vi(qh var0, uo var1, int var2, int var3, int var4, int var5, qg var6) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1.ai().ak();
			var1.bm().ad();
			if (-1 != var1.aa_fld) {
				var0.av_fld.ak(tj.av_fld, tj.ae_fld * -844200357, tj.ah_fld, 1419428763 * tj.ay_fld, tj.as_fld, tj.ar_fld, var5);
				var0.ah(var1.aa_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
			}
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(ILno;)V"
	)
	public static void hy(int var0, no var1) {
		for (yz var2 = (yz)var1.en(); var2 != null; var2 = (yz)var1.pk()) {
			lu var3 = var2.getSource();
			int var4 = WidgetUtil.componentToInterface(var3.getId());
			if (var0 == var4) {
				var2.pz_void();
			}
		}
	}

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lfr;Luo;B)V"
	)
	public static void sn(qh var0, fr var1, uo var2, byte var3) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (null != var1) {
				if (var1.ah_fld != null) {
					if (-2140649577 * var1.ah_fld.by_fld >= 0) {
						lu var4 = var2.ak(var1.ah_fld.cv_fld * 694320263);
						if (var4 == null) {
							return;
						}

						if (var3 == 3) {
							return;
						}

						if (var4.ge_fld == null
							|| 0 == var4.ge_fld.length
							|| var1.ah_fld.by_fld * -2140649577 >= var4.ge_fld.length
							|| var4.ge_fld[-2140649577 * var1.ah_fld.by_fld] != var1.ah_fld) {
							return;
						}
					}

					if (var1.ah_fld.bx_fld * 1404198381 == 11) {
						if (var3 == 3) {
							return;
						}

						if (var1.az_fld == 0) {
							if (var3 == 3) {
								return;
							}

							if (var1.ah_fld.be(var1.av_fld, var1.ae_fld, 0, 0, -1617803658)) {
								var0.az_fld.af(var1.ah_fld, (byte)-83);
							}

							return;
						}
					}

					if (12 == var1.ah_fld.bx_fld * 1404198381) {
						li var5 = lu.ax(var1.ah_fld, -1980498044);
						if (null != var5 && var5.bg()) {
							switch (var1.az_fld) {
								case 0:
									var0.az_fld.al(var1.ah_fld, (byte)50);
									var5.bl(var1.av_fld, var1.ae_fld, var0.ak_fld.ak(-966082127).as(82), var0.ak_fld.ak(-703214137).as(81), 2138552032);
									break;
								case 1:
									var5.bx(var1.av_fld, var1.ae_fld);
							}
						}
					}

					return;
				}

				if (var3 == 3) {
					return;
				}
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	void bi(int var1, uo var2) throws EOFException {
		if (-1 != var1) {
			if (var2.az(var1)) {
				lu[] var3 = var2.aw_fld[var1];

				for (int var4 = 0; var4 < var3.length; var4++) {
					lu var5 = var3[var4];
					if (null != var5.eu_fld) {
						yz var6 = yb.vn(tu.ak(var5).av((Object[])var5.eu_fld, 1574982457), -420709538);
						this.az_fld.ar(var6, (byte)-72);
					}
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;)V"
	)
	public void ai(int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		var4.aa_fld = var1;
		int var6 = var4.aa_fld;
		if (var4.az(var6)) {
			fm.av(var4.aw_fld[var6], 0, var4.aw_fld[var6].length - 1, -1, -1, var2, var3, false, var4, var5, -12824464);
		}

		ib(this, var1, var4, (byte)0);
		gt(this, var4.aa_fld, var4);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([Llu;Lqm;Luo;)V"
	)
	void bv(lu[] var1, qm var2, uo var3) throws EOFException {
		for (int var4 = 0; var4 < var1.length; var4++) {
			lu var5 = var1[var4];
			if (var5 != null) {
				if (var5.bx_fld == 0) {
					if (null != var5.ge_fld) {
						this.al(var5.ge_fld, var2, var3, 1614460720);
					}

					if (var5.by_fld == -1) {
						pk var6 = (pk)xz.tw(var3.an_fld, var5.bf_fld);
						if (var6 != null) {
							this.ar(var6.ak_fld, var2, var3, -2054611631);
						}
					}
				}

				if (qm.ak_fld == var2 && var5.gn_fld != null) {
					yz var7 = yb.vn(tu.ak(var5).av((Object[])var5.gn_fld, 1912252800), -782323171);
					this.az_fld.as(var7, (byte)-44);
				}

				if (qm.ag_fld == var2 && null != var5.gh_fld) {
					if (var5.by_fld >= 0) {
						lu var8 = var3.ak(var5.bf_fld);
						if (null == var8 || null == var8.ge_fld || var5.by_fld >= var8.ge_fld.length || var8.ge_fld[var5.by_fld] != var5) {
							continue;
						}
					}

					yz var9 = yb.vn(tu.ak(var5).av((Object[])var5.gh_fld, 1604952894), -1013595655);
					this.az_fld.as(var9, (byte)-42);
				}
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	void bu(int var1, uo var2) throws EOFException {
		if (var2.az(var1)) {
			lu[] var3 = var2.aw_fld[var1];

			for (int var4 = 0; var4 < var3.length; var4++) {
				lu var5 = var3[var4];
				if (var5 != null) {
					var5.gy_fld = 0;
					var5.gz_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "(Lqh;[Llu;IIIIIIIIIILuo;ILqg;)V"
	)
	public static void th(
		qh var0, lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13, qg var14
	) throws EOFException {
		boolean var15 = var0.ag_fld.ak(-1665228900);
		fi var16 = var0.ak_fld.ak(-1567586216);

		for (int var17 = var2; var17 <= var3; var17++) {
			lu var18 = var1[var17];
			if (var18 != null
				&& var4 == var18.cv_fld
				&& var18.cy_fld == var5
				&& uo.au(var12, var18, -1734973692)
				&& (var18.bj_fld ? !var12.am(var18) : var18.bx_fld != 0 || var12.ai().ag(var18) || !var12.am(var18))) {
				if (11 == var18.bx_fld) {
					if (lu.ws(var18, var12, var0.ak_fld.az(-951958469), (byte)81)) {
						if (var18.bs_boolean(2035992404)) {
							tb.ag(var18.ge_fld, var18, true, var12, var14, 1086727520);
							var18.bx(1183322552).ak().ag(3, var18.bx(1442782925).ax());
						}

						if (var18.gs_fld != null) {
							yz var19 = yb.vn(tu.ak(var18).av((Object[])var18.gs_fld, 1471210717), 1285798291);
							var14.ak(var19);
						}
					}
				} else if (12 == var18.bx_fld) {
					var18.bw(var12, 1081334298);
				}

				int var36 = var10 + var18.bq_fld;
				int var20 = var18.bg_fld + var11;
				int var21;
				int var22;
				int var23;
				int var24;
				if (9 == var18.bx_fld) {
					int var25 = var36;
					int var26 = var20;
					int var27 = var18.bb_fld + var36;
					int var28 = var18.cd_fld + var20;
					if (var27 < var36) {
						var25 = var27;
						var27 = var36;
					}

					if (var28 < var20) {
						var26 = var28;
						var28 = var20;
					}

					var27++;
					var28++;
					var21 = var25 > var6 ? var25 : var6;
					var22 = var26 > var7 ? var26 : var7;
					var23 = var27 < var8 ? var27 : var8;
					var24 = var28 < var9 ? var28 : var9;
				} else {
					int var37 = var36 + var18.bb_fld;
					int var39 = var20 + var18.cd_fld;
					var21 = var36 > var6 ? var36 : var6;
					var22 = var20 > var7 ? var20 : var7;
					var23 = var37 < var8 ? var37 : var8;
					var24 = var39 < var9 ? var39 : var9;
				}

				var12.bm().av(var18, var36, var20);
				boolean var38 = false;
				if (var18.ez_fld) {
					switch (188156795 * var12.ap_fld) {
						case 0:
							var38 = true;
						case 1:
						default:
							break;
						case 2:
							if (var12.at_fld == var18.bf_fld >>> 16) {
								var38 = true;
							}
							break;
						case 3:
							if (var18.bf_fld == var12.at_fld) {
								var38 = true;
							}
					}
				}

				if (var38 || !var18.bj_fld || var21 < var23 && var22 < var24) {
					if (var18.bj_fld) {
						if (var18.hb_fld) {
							if (var0.av_fld.az() >= var21 && qc.rp(var0.av_fld, 2131951483) >= var22 && var0.av_fld.az() < var23 && qc.rp(var0.av_fld, 2132757355) < var24) {
								var14.as();
								uk.qs(var12.bm(), (byte)0);
								if (!var15) {
									var0.az_fld.ak(564030271);
								}
							}
						} else if (var18.hf_fld
							&& var0.av_fld.az() >= var21
							&& qc.rp(var0.av_fld, 2121508631) >= var22
							&& var0.av_fld.az() < var23
							&& qc.rp(var0.av_fld, 2119477804) < var24) {
							var14.ar(900130878);
						}
					}

					int var40 = var0.av_fld.az();
					int var42 = qc.rp(var0.av_fld, 2147352425);
					if (qc.te(var0.av_fld, (byte)-81) != 0) {
						var40 = var0.av_fld.ah();
						var42 = var0.av_fld.aw(-382839423);
					}

					boolean var44 = var40 >= var21 && var42 >= var22 && var40 < var23 && var42 < var24;
					if (1337 == var18.bp_fld) {
						if (!var0.ag_fld.av(1767424052) && !var15 && var44) {
							var0.az_fld.ag(var40, var42, var21, var22, 2066339195);
						}
					} else if (1338 == var18.bp_fld) {
						kf.af(var18, var36, var20);
					} else {
						if (var18.bp_fld == 1400) {
							wl.dm(var0.ak_fld.ae(1293787896), var40, var42, var44, var36, var20, var18.bb_fld, var18.cd_fld, -528102792);
						}

						if (!var15 && var44) {
							if (var18.bp_fld == 1400) {
								var0.ak_fld.ae(1293787896).cv(var36, var20, var18.bb_fld, var18.cd_fld, var40, var42, 1809736504);
							} else {
								var0.az_fld.az(var18, (byte)-37);
							}
						}

						if (var38) {
							for (int var29 = 0; var29 < var18.er_fld.length; var29++) {
								boolean var30 = false;
								boolean var31 = false;
								if (!var30 && var18.er_fld[var29] != null) {
									for (int var32 = 0; var32 < var18.er_fld[var29].length; var32++) {
										boolean var33 = false;
										if (var18.hp_fld != null) {
											var33 = var16.as(var18.er_fld[var29][var32]);
										}

										if (var0.ak_fld.ag(-607999722).aw(var18.er_fld[var29][var32]) || var33) {
											var30 = true;
											if (null != var18.hp_fld && var18.hp_fld[var29] > var13) {
												break;
											}

											byte var34 = var18.en_fld[var29][var32];
											if (0 == var34
												|| ((var34 & 8) == 0 || !var16.as(86) && !var16.as(82) && !var16.as(81))
													&& (0 == (var34 & 2) || var16.as(86))
													&& ((var34 & 1) == 0 || var16.as(82))
													&& ((var34 & 4) == 0 || var16.as(81))) {
												var31 = true;
												break;
											}
										}
									}
								}

								if (var31) {
									if (var29 < 10) {
										var0.az_fld.av(var29 + 1, var18.bf_fld, var18.by_fld, var18.ga_fld, "", (short)7451);
									} else if (var29 == 10) {
										var0.az_fld.ah(742829213);
										String var59 = var12.ao(var18);
										if (null == var59) {
											var59 = kh.aj_fld;
										}

										String var78 = var18.eq_fld + gd.ag(16777215, -1940547058);
										int var85 = uo.xd(var12, var18, -1325849523);
										var0.az_fld.ae(var18.bf_fld, var18.by_fld, nt.ag(var85), var18.ga_fld, var59, var78, -1596833618);
									}

									int var60 = var18.eg_fld[var29];
									if (var18.hp_fld == null) {
										var18.hp_fld = new int[var18.er_fld.length];
									}

									if (null == var18.ef_fld) {
										var18.ef_fld = new int[var18.er_fld.length];
									}

									if (var60 != 0) {
										if (var18.hp_fld[var29] == 0) {
											var18.hp_fld[var29] = var18.ef_fld[var29] + var13 + var60;
										} else {
											var18.hp_fld[var29] = var13 + var60;
										}
									} else {
										var18.hp_fld[var29] = Integer.MAX_VALUE;
									}
								}

								if (!var30 && null != var18.hp_fld) {
									var18.hp_fld[var29] = 0;
								}
							}
						}

						if (var18.bj_fld) {
							var44 = var0.av_fld.az() >= var21 && qc.rp(var0.av_fld, 2134307436) >= var22 && var0.av_fld.az() < var23 && qc.rp(var0.av_fld, 2122540342) < var24;
							boolean var46 = (var0.av_fld.ag() == 1 || !var0.ag_fld.ae(1735302627) && var0.av_fld.ag() == 4) && var44;
							boolean var48 = (qc.te(var0.av_fld, (byte)-28) == 1 || !var0.ag_fld.ae(1735302627) && qc.te(var0.av_fld, (byte)-117) == 4)
								&& var0.av_fld.ah() >= var21
								&& var0.av_fld.aw(-771468319) >= var22
								&& var0.av_fld.ah() < var23
								&& var0.av_fld.aw(834644886) < var24;
							if (var48 && !var0.ag_fld.ak(-1665228900) && uo.wn(var12, var18, var0.av_fld.ah() - var36, var0.av_fld.aw(1272964936) - var20)) {
								var0.az_fld.aw(1477385749);
							}

							if (var18.ad(-1576504735)) {
								if (var48) {
									var14.av(new fr(0, tj.ae_fld - var36, tj.ah_fld - var20, var18));
								}

								if (var46) {
									var14.av(new fr(1, tj.ae_fld - var36, tj.ah_fld - var20, var18));
								}
							}

							if (1400 == var18.bp_fld) {
								wl.mi(var0.ak_fld.ae(1293787896), var40, var42, var44 & var46, var44 & var48, -1982911814);
							}

							if (var12.bz() && var12.bd() != var18 && var44 && cn.az(uo.xd(var12, var18, 1898611905))) {
								uk.ba(var12.bm(), var18, -579162235);
							}

							var12.bm().ae(var18, var36, var20);
							if (var18.eh_fld) {
								if (var44 && var0.av_fld.ay() != 0 && null != var18.fq_fld) {
									yz var49 = yb.vn(yb.bj(tu.ak(var18), true, (byte)8).av((Object[])var18.fq_fld, 1446081472).ah(var0.av_fld.ay(), 1485443885), 1335455478);
									var14.ak(var49);
								}

								if (var12.bz() || var0.ag_fld.ak(-1665228900)) {
									var48 = false;
									var46 = false;
									var44 = false;
								}

								if (!var18.gx_fld && var48) {
									var18.gx_fld = true;
									if (var18.ej_fld != null) {
										yz var50 = yb.vn(
											yb.bj(tu.ak(var18), true, (byte)8).av((Object[])var18.ej_fld, 1677657341).ae(tj.as_fld - var36, 1616246708).ah(tj.ar_fld - var20, -271937063),
											1532582378
										);
										var14.ak(var50);
									}
								}

								if (var18.gx_fld && var46 && null != var18.fy_fld) {
									yz var51 = yb.vn(
										yb.bj(tu.ak(var18), true, (byte)8).av((Object[])var18.fy_fld, 1316129056).ae(tj.ae_fld - var36, 518595263).ah(tj.ah_fld - var20, 635999523),
										-1022862058
									);
									var14.ak(var51);
								}

								if (var18.gx_fld && !var46) {
									var18.gx_fld = false;
									if (null != var18.fa_fld) {
										yz var52 = yb.vn(
											yb.bj(tu.ak(var18), true, (byte)8).av((Object[])var18.fa_fld, 1474103497).ae(tj.ae_fld - var36, 958944856).ah(tj.ah_fld - var20, -1743051765),
											1247462736
										);
										var14.ag(var52);
									}
								}

								if (var46 && null != var18.fo_fld) {
									yz var53 = yb.vn(
										yb.bj(tu.ak(var18), true, (byte)8).av((Object[])var18.fo_fld, 1747842858).ae(tj.ae_fld - var36, 1872744970).ah(tj.ah_fld - var20, 979297321),
										-311204995
									);
									var14.ak(var53);
								}

								if (!var18.gw_fld && var44) {
									var18.gw_fld = true;
									if (var18.fp_fld != null) {
										yz var54 = yb.vn(
											yb.bj(tu.ak(var18), true, (byte)8).av((Object[])var18.fp_fld, 1279674379).ae(tj.ae_fld - var36, 750212512).ah(tj.ah_fld - var20, 509501606),
											132556753
										);
										var14.ak(var54);
									}
								}

								if (var18.gw_fld && var44 && var18.fx_fld != null) {
									yz var55 = yb.vn(
										yb.bj(tu.ak(var18), true, (byte)8).av((Object[])var18.fx_fld, 1691177600).ae(tj.ae_fld - var36, 1534118321).ah(tj.ah_fld - var20, 1143801036),
										-1617099531
									);
									var14.ak(var55);
								}

								if (var18.gw_fld && !var44) {
									var18.gw_fld = false;
									if (null != var18.fv_fld) {
										yz var56 = yb.vn(
											yb.bj(tu.ak(var18), true, (byte)8).av((Object[])var18.fv_fld, 1085585399).ae(tj.ae_fld - var36, -401729384).ah(tj.ah_fld - var20, 351372878),
											1439544119
										);
										var14.ag(var56);
									}
								}

								if (null != var18.fn_fld) {
									yz var57 = yb.vn(tu.ak(var18).av((Object[])var18.fn_fld, 1743371089), 637130748);
									var14.az(var57);
								}

								pi var58 = var0.ak_fld.av(410652385);
								if (var18.fh_fld != null && var58.ai() > var18.gl_fld) {
									if (var18.fm_fld != null && var58.ai() - var18.gl_fld <= 32) {
										label813:
										for (int var62 = var18.gl_fld; var62 < var58.ai(); var62++) {
											int var79 = var58.aa(var62);

											for (int var86 = 0; var86 < var18.fm_fld.length; var86++) {
												if (var79 == var18.fm_fld[var86]) {
													yz var35 = yb.vn(tu.ak(var18).av((Object[])var18.fh_fld, 1234117362), -829610746);
													var14.ak(var35);
													break label813;
												}
											}
										}
									} else {
										yz var61 = yb.vn(tu.ak(var18).av((Object[])var18.fh_fld, 1010522546), 1065658768);
										var14.ak(var61);
									}

									var18.gl_fld = var58.ai();
								}

								if (var18.fe_fld != null && var58.am() > var18.hr_fld) {
									if (null != var18.fw_fld && var58.am() - var18.hr_fld <= 32) {
										label789:
										for (int var64 = var18.hr_fld; var64 < var58.am(); var64++) {
											int var80 = var58.aq(var64);

											for (int var87 = 0; var87 < var18.fw_fld.length; var87++) {
												if (var18.fw_fld[var87] == var80) {
													yz var92 = yb.vn(tu.ak(var18).av((Object[])var18.fe_fld, 1894313341), -1449421259);
													var14.ak(var92);
													break label789;
												}
											}
										}
									} else {
										yz var63 = yb.vn(tu.ak(var18).av((Object[])var18.fe_fld, 2030536538), -643057197);
										var14.ak(var63);
									}

									var18.hr_fld = var58.am();
								}

								if (null != var18.fl_fld && var58.ao() > var18.hj_fld) {
									if (null != var18.fg_fld && var58.ao() - var18.hj_fld <= 32) {
										label765:
										for (int var66 = var18.hj_fld; var66 < var58.ao(); var66++) {
											int var81 = var58.ad(var66);

											for (int var88 = 0; var88 < var18.fg_fld.length; var88++) {
												if (var81 == var18.fg_fld[var88]) {
													yz var93 = yb.vn(tu.ak(var18).av((Object[])var18.fl_fld, 1011185924), 562674636);
													var14.ak(var93);
													break label765;
												}
											}
										}
									} else {
										yz var65 = yb.vn(tu.ak(var18).av((Object[])var18.fl_fld, 1716248089), 464313340);
										var14.ak(var65);
									}

									var18.hj_fld = var58.ao();
								}

								if (var58.bz() > var18.gb_fld && null != var18.fs_fld) {
									yz var67 = yb.vn(tu.ak(var18).av((Object[])var18.fs_fld, 1738435062), -922256219);
									var14.ak(var67);
								}

								if (var58.ab() > var18.gb_fld && var18.fz_fld != null) {
									yz var68 = yb.vn(tu.ak(var18).av((Object[])var18.fz_fld, 1032564806), 93131941);
									var14.ak(var68);
								}

								if (var58.ap() > var18.gb_fld && null != var18.ff_fld) {
									yz var69 = yb.vn(tu.ak(var18).av((Object[])var18.ff_fld, 2074333223), -512483723);
									var14.ak(var69);
								}

								if (var58.at() > var18.gb_fld && null != var18.gg_fld) {
									yz var70 = yb.vn(tu.ak(var18).av((Object[])var18.gg_fld, 1064560985), 23053735);
									var14.ak(var70);
								}

								if (var58.ac() > var18.gb_fld && null != var18.gc_fld) {
									yz var71 = yb.vn(tu.ak(var18).av((Object[])var18.gc_fld, 1638541003), -614685864);
									var14.ak(var71);
								}

								if (var58.aj() > var18.gb_fld && var18.gj_fld != null) {
									yz var72 = yb.vn(tu.ak(var18).av((Object[])var18.gj_fld, 1180281494), 1129394371);
									var14.ak(var72);
								}

								if (pi.qj(var58, 578816271) > var18.gb_fld && var18.gt_fld != null) {
									yz var73 = yb.vn(tu.ak(var18).av((Object[])var18.gt_fld, 1563178318), 519417917);
									var14.ak(var73);
								}

								if (var58.bd() > var18.gb_fld && var18.go_fld != null) {
									yz var74 = yb.vn(tu.ak(var18).av((Object[])var18.go_fld, 1764484548), -691108809);
									var14.ak(var74);
								}

								var18.gb_fld = pi.bm(var58, (byte)-44);
								if (var18.fu_fld != null) {
									fz var75 = var0.ak_fld.ag(-2129338400);

									for (int var82 = 0; var82 < var75.ao(); var82++) {
										yz var89 = yb.vn(tu.ak(var18).av((Object[])var18.fu_fld, 1970626845).af(var75.ae(var82), 837029375).al(var75.ah(var82), -2004628831), 250926747);
										var14.ak(var89);
									}
								}

								if (null != var18.fr_fld) {
									int[] var76 = var16.af();

									for (int var83 = 0; var83 < var76.length; var83++) {
										yz var90 = yb.vn(tu.ak(var18).av((Object[])var18.fr_fld, 1005882745).af(var76[var83], 1917956163), -327693018);
										var14.ak(var90);
									}
								}

								if (null != var18.fi_fld) {
									int[] var77 = var16.al();

									for (int var84 = 0; var84 < var77.length; var84++) {
										yz var91 = yb.vn(tu.ak(var18).av((Object[])var18.fi_fld, 1525634496).af(var77[var84], -1284366868), -935718391);
										var14.ak(var91);
									}
								}
							}
						}

						if (!var18.bj_fld) {
							if (var12.bz() || var0.ag_fld.ak(-1665228900)) {
								continue;
							}

							if ((var18.gk_fld >= 0 || var18.cw_fld != 0)
								&& var0.av_fld.az() >= var21
								&& qc.rp(var0.av_fld, 2135540342) >= var22
								&& var0.av_fld.az() < var23
								&& qc.rp(var0.av_fld, 2146441457) < var24) {
								if (var18.gk_fld >= 0) {
									var12.ai().ae(var1[var18.gk_fld]);
								} else {
									var12.ai().ae(var18);
								}
							}

							if (var18.bx_fld == 8
								&& var0.av_fld.az() >= var21
								&& qc.rp(var0.av_fld, 2133999263) >= var22
								&& var0.av_fld.az() < var23
								&& qc.rp(var0.av_fld, 2130553459) < var24) {
								var12.ai().az(var18);
							}

							if (var18.cr_fld > var18.cd_fld) {
								var0.ay(var18, var18.bb_fld + var36, var20, var18.cd_fld, var18.cr_fld, var0.av_fld.az(), qc.rp(var0.av_fld, 2130516399), var12, 804524353);
							}
						}

						if (var18.bx_fld == 0) {
							var0.aw(
								var1,
								var18.cx_fld,
								var18.cs_fld,
								var18.bf_fld,
								var18.by_fld,
								var21,
								var22,
								var23,
								var24,
								var36 - var18.cp_fld,
								var20 - var18.ce_fld,
								var12,
								var13,
								var14,
								353861815
							);
							if (null != var18.ge_fld) {
								var0.aw(
									var18.ge_fld,
									0,
									var18.ge_fld.length - 1,
									var18.bf_fld,
									-1,
									var21,
									var22,
									var23,
									var24,
									var36 - var18.cp_fld,
									var20 - var18.ce_fld,
									var12,
									var13,
									var14,
									1924360831
								);
							}

							if (var18.by_fld == -1) {
								pk var47 = (pk)xz.tw(var12.an_fld, var18.bf_fld);
								if (null != var47) {
									if (0 == var47.ag_fld && tj.ae_fld >= var21 && tj.ah_fld >= var22 && tj.ae_fld < var23 && tj.ah_fld < var24 && !var0.ag_fld.ak(-1665228900)) {
										var14.as();
										uk.qs(var12.bm(), (byte)0);
										if (!var15) {
											var0.az_fld.ak(-92374106);
										}
									}

									var0.ah(var47.ak_fld, var21, var22, var23, var24, var36, var20, var12, var13, var14);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILqm;Luo;)V"
	)
	void bl(int var1, qm var2, uo var3) throws EOFException {
		if (var3.az(var1)) {
			this.al(var3.aw_fld[var1], var2, var3, -1054097256);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	void bo(int var1, uo var2) throws EOFException {
		if (var2.az(var1)) {
			lu[] var3 = var2.aw_fld[var1];

			for (int var4 = 0; var4 < var3.length; var4++) {
				lu var5 = var3[var4];
				if (var5 != null) {
					var5.gy_fld = 0;
					var5.gz_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqg;Luo;)V"
	)
	public static void ss(qh var0, qg var1, uo var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		yz var3 = qg.uf(var1, (byte)-64);

		while (var3 != null) {
			yz var4 = var3;
			var3 = qg.uf(var1, (byte)-16);
			lu var5 = var4.av((short)8819);
			if (var5.by_fld >= 0) {
				lu var6 = var2.ak(-415602862 * var5.cv_fld);
				if (null == var6 || null == var6.ge_fld || var5.by_fld >= var6.ge_fld.length || var6.ge_fld[var5.by_fld * -530214163] != var5) {
					continue;
				}
			}

			va.ak(var4);
		}

		var3 = var1.ae();

		while (null != var3) {
			yz var9 = var3;
			var3 = var1.ae();
			lu var12 = var9.av((short)-26041);
			if (-1088565344 * var12.by_fld >= 0) {
				lu var15 = var2.ak(var12.cv_fld);
				if (var15 == null || null == var15.ge_fld || var12.by_fld >= var15.ge_fld.length || var15.ge_fld[-1604000195 * var12.by_fld] != var12) {
					continue;
				}
			}

			va.ak(var9);
		}

		var3 = var1.ah();

		while (var3 != null) {
			yz var10 = var3;
			var3 = var1.ah();
			lu var13 = var10.av((short)-14997);
			if (var13.by_fld >= 0) {
				lu var16 = var2.ak(var13.cv_fld);
				if (null == var16 || var16.ge_fld == null || var13.by_fld >= var16.ge_fld.length || var13 != var16.ge_fld[var13.by_fld]) {
					continue;
				}
			}

			va.ak(var10);
		}

		boolean var11 = false;

		for (fr var14 = var1.ay(); var14 != null; var14 = var1.ay()) {
			if (12 == var14.ah_fld.bx_fld * 2003617435) {
				var11 = true;
			}

			sn(var0, var14, var2, (byte)-31);
		}

		if (!var11 && tj.ay_fld == 1) {
			var0.az_fld.al(null, (byte)36);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Luo;)V"
	)
	public void bw(qg var1, uo var2) throws EOFException {
		yz var3 = qg.uf(var1, (byte)19);

		while (var3 != null) {
			yz var4 = var3;
			var3 = qg.uf(var1, (byte)13);
			lu var5 = var4.av((short)11914);
			if (-1300933893 * var5.by_fld >= 0) {
				lu var6 = var2.ak(var5.cv_fld);
				if (null == var6 || null == var6.ge_fld || var5.by_fld >= var6.ge_fld.length || var6.ge_fld[var5.by_fld * -749329908] != var5) {
					continue;
				}
			}

			va.ak(var4);
		}

		var3 = var1.ae();

		while (null != var3) {
			yz var9 = var3;
			var3 = var1.ae();
			lu var12 = var9.av((short)22812);
			if (253302015 * var12.by_fld >= 0) {
				lu var15 = var2.ak(var12.cv_fld);
				if (var15 == null || null == var15.ge_fld || var12.by_fld >= var15.ge_fld.length || var15.ge_fld[-1361332695 * var12.by_fld] != var12) {
					continue;
				}
			}

			va.ak(var9);
		}

		var3 = var1.ah();

		while (var3 != null) {
			yz var10 = var3;
			var3 = var1.ah();
			lu var13 = var10.av((short)6040);
			if (-102619421 * var13.by_fld >= 0) {
				lu var16 = var2.ak(var13.cv_fld * -406422949);
				if (null == var16 || var16.ge_fld == null || var13.by_fld >= var16.ge_fld.length || var13 != var16.ge_fld[var13.by_fld]) {
					continue;
				}
			}

			va.ak(var10);
		}

		boolean var11 = false;

		for (fr var14 = var1.ay(); var14 != null; var14 = var1.ay()) {
			if (12 == var14.ah_fld.bx_fld * -226005197) {
				var11 = true;
			}

			sn(this, var14, var2, (byte)19);
		}

		if (!var11 && tj.ay_fld == 1) {
			this.az_fld.al(null, (byte)-87);
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lqh;IIIIIIILuo;ILqg;)V"
	)
	public static void ks(qh var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, qg var10) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var8.az(var1)) {
			var0.aw(var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 447621643);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public void bi(uo var1) {
		uk var2 = var1.aj_fld;
		if (var2.ak_fld != null && var2.ay_fld && var2.ae_fld) {
			int var3 = tj.ae_fld;
			int var4 = tj.ah_fld;
			var3 -= var2.az_fld;
			var4 -= var2.av_fld;
			if (var3 < var2.as_fld) {
				var3 = var2.as_fld;
			}

			if (var3 + var2.ak_fld.bb_fld * -1223437005 > var2.as_fld + var2.ag_fld.bb_fld * -1223437005) {
				var3 = var2.as_fld + var2.ag_fld.bb_fld * -1223437005 - var2.ak_fld.bb_fld * -1223437005;
			}

			if (var4 < var2.ar_fld) {
				var4 = var2.ar_fld;
			}

			if (var4 + var2.ak_fld.cd_fld * 124430729 > var2.ar_fld + var2.ag_fld.cd_fld * 124430729) {
				var4 = var2.ar_fld + var2.ag_fld.cd_fld * 124430729 - var2.ak_fld.cd_fld * 124430729;
			}

			int var5 = var3 - var2.al_fld;
			int var6 = var4 - var2.au_fld;
			int var7 = var2.ak_fld.ev_fld * -763835689;
			if (var2.ah_fld + 1 > var2.ak_fld.ey_fld * -1721404151 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
				WidgetDrag var8 = new WidgetDrag();
				og.ci_fld.getCallbacks().post(var8);
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public void bb(uo var1) throws EOFException {
		uk var2 = var1.bm();
		if (var2.ay()) {
			var2.ag();
			int var3 = var2.al();
			int var4 = var2.au();
			if (var2.ab() && uk.vs(var2, -1205103815)) {
				lu var5 = uk.wc(var2, (byte)-49);
				lu var6 = var2.ar();
				int var7 = var2.aa();
				int var8 = var2.ai();
				int var9 = var2.ax();
				int var10 = var2.an();
				int var11 = tj.ae_fld;
				int var12 = tj.ah_fld;
				var11 -= var3;
				var12 -= var4;
				if (var11 < var7) {
					var11 = var7;
				}

				if (var5.bb_fld + var11 > var7 + var6.bb_fld) {
					var11 = var7 + var6.bb_fld - var5.bb_fld;
				}

				if (var12 < var8) {
					var12 = var8;
				}

				if (var12 + var5.cd_fld > var8 + var6.cd_fld) {
					var12 = var6.cd_fld + var8 - var5.cd_fld;
				}

				int var13 = var11 - var9;
				int var14 = var12 - var10;
				int var15 = var5.ev_fld;
				if (var2.aq() > var5.ey_fld && (var13 > var15 || var13 < -var15 || var14 > var15 || var14 < -var15)) {
					var2.aw();
				}

				int var16 = var11 - var7 + var6.cp_fld;
				int var17 = var6.ce_fld + (var12 - var8);
				if (var5.fj_fld != null && var2.ap()) {
					yz var18 = yb.vn(tu.ak(var5).av((Object[])var5.fj_fld, 1403119005).ae(var16, 1414363825).ah(var17, -2098492199), 10714315);
					va.ak(var18);
				}

				if (0 == tj.av_fld) {
					if (var2.ap()) {
						if (null != var5.fb_fld) {
							yz var21 = yb.vn(yb.kv(tu.ak(var5).av((Object[])var5.fb_fld, 1870654981).ae(var16, 357167684).ah(var17, 2001952283), var2.af(), (byte)1), -546925048);
							this.az_fld.as(var21, (byte)-49);
						}

						this.az_fld.au(var5, var2.af(), 952037609);
					} else {
						this.az_fld.ax(var9 + var3, var4 + var10, -1549556992);
					}

					var2.az();
				}
			} else {
				if (var2.aq() > 1) {
					if (!var2.ap() && this.ag_fld.ah(-50451392) > 0) {
						this.az_fld.ay(var3 + var2.ax(), var4 + var2.an(), (byte)121);
					}

					var2.az();
				}
			}
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lqh;IIILuo;Lqg;)Lpk;"
	)
	public static pk ma(qh var0, int var1, int var2, int var3, uo var4, qg var5) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		pk var6 = new pk();
		var6.ak_fld = var2;
		var6.ag_fld = var3;
		xz.fe(var4.an_fld, var6, var1);
		ib(var0, var2, var4, (byte)0);
		lu var7 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var7, false, var4, var5, -902278560);
		gt(var0, var2, var4);
		zi(var0, qm.ag_fld, var4, (byte)-85);
		return var6;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;B)V"
	)
	public void ak(int var1, int var2, int var3, uo var4, qg var5, byte var6) throws EOFException {
		var4.aa_fld = var1;
		int var7 = var4.ap_fld;
		if (var4.az(var7)) {
			fm.av(var4.aw_fld[var7], 0, var4.aw_fld[var7].length - 1, -1, -1, var2, var3, false, var4, var5, -2050661066);
		}

		ib(this, var1, var4, (byte)0);
		gt(this, var4.at_fld * 243771749, var4);
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Llu;IIIIIILuo;)V"
	)
	public static void jr(qh var0, lu var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		byte var9;
		if (var8.bd_fld) {
			var9 = 32;
		} else {
			var9 = 0;
		}

		var8.bd_fld = false;
		if (var0.av_fld.ag() == 1 || !var0.ag_fld.ae(1735302627) && var0.av_fld.ag() == 4) {
			if (var6 >= var2 && var6 < var2 + 16 && var7 >= var3 && var7 < 16 + var3) {
				var1.ce_fld -= 4;
			} else if (var6 >= var2 && var6 < 16 + var2 && var7 >= var4 + var3 - 16 && var7 < var4 + var3) {
				var1.ce_fld += 4;
			} else if (var6 >= var2 - var9 && var6 < var9 + var2 + 16 && var7 >= 16 + var3 && var7 < var4 + var3 - 16) {
				int var10 = var4 * (var4 - -1878441998) / var5;
				if (false) {
					var10 = 8;
				}

				int var11 = var7 - var3 - 16 - var10 / 2;
				int var12 = var4 - 575509108 - var10;
				var1.ce_fld = -1143292511 * (var11 * (var5 - var4) / var12);
				var8.bd_fld = true;
			}
		}

		if (var0.av_fld.ay() != 0) {
			int var13 = -1484556566 * var1.bb_fld;
			if (var6 >= var2 - var13 && var7 >= var3 && var6 < 16 + var2 && var7 <= var3 + var4) {
				var1.ce_fld = var1.ce_fld + var0.av_fld.ay() * 91444557;
			}
		}
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(ILuo;)V"
	)
	public void vf(int var1, uo var2) throws EOFException {
		gt(this, var1, var2);
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "([Llu;Lqm;Luo;)V"
	)
	public void wt(lu[] var1, qm var2, uo var3) throws EOFException {
		this.al(var1, var2, var3, -92988190);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luo;I)V"
	)
	public void aa(uo var1, int var2) throws EOFException {
		this.bb(var1);
		uk var3 = var1.bm();
		if (var3.ay()) {
			var3.aw();
			int var4 = var3.al();
			int var5 = var3.ax();
			if (var3.ab()) {
				if (var2 <= -1994257027) {
					return;
				}

				if (uk.vs(var3, 1063658712)) {
					lu var6 = uk.wc(var3, (byte)-105);
					lu var7 = var3.ar();
					int var8 = var3.aa();
					int var9 = var3.aq();
					int var10 = var3.an();
					int var11 = var3.an();
					int var12 = -1655706797 * tj.ar_fld;
					int var13 = tj.ae_fld * 239763703;
					var12 -= var4;
					var13 -= var5;
					if (var12 < var8) {
						var12 = var8;
					}

					if (var6.cb_fld + var12 > var8 + var7.es_fld) {
						var12 = var8 + var7.cr_fld - var6.ss_fld;
					}

					if (var13 < var9) {
						var13 = var9;
					}

					if (var13 + var6.gz_fld > var9 + var7.cr_fld) {
						var13 = var7.bv_fld + var9 - var6.dq_fld;
					}

					int var14 = var12 - var10;
					int var15 = var13 - var11;
					int var16 = var6.bw_fld * -763835689;
					if (var3.aq() > var6.ey_fld) {
						if (var2 <= -1994257027) {
							return;
						}

						if (var14 > var16 || var14 < -var16 || var15 > var16 || var15 < -var16) {
							var3.aw();
						}
					}

					int var17 = var12 - var8 + var7.hr_fld;
					int var18 = var7.cg_fld + (var13 - var9);
					if (var6.fa_fld != null && var3.ap()) {
						yz var19 = yb.vn(tu.ak(var6).av((Object[])var6.ff_fld, 1251244810).aw(var17, 2143293722).aw(var18, -28900420), -449274236);
						va.ak(var19);
					}

					if (0 == tj.av_fld) {
						if (var2 <= -1994257027) {
							return;
						}

						if (var3.ap()) {
							if (var2 <= -1994257027) {
								return;
							}

							if (null != var6.fq_fld) {
								if (var2 <= -1994257027) {
									return;
								}

								yz var22 = yb.vn(yb.kv(tu.ak(var6).av((Object[])var6.fj_fld, 1879531297).ay(var17, 1839238365).aw(var18, 1616119341), var3.af(), (byte)1), 780964404);
								this.az_fld.as(var22, (byte)-94);
							}

							this.az_fld.au(var6, var3.af(), 1018754203);
						} else {
							this.az_fld.ax(var10 + var4, var5 + var11, -1549556992);
						}

						var3.az();
					}

					return;
				}
			}

			if (var3.aa() > 1) {
				if (var2 <= -1994257027) {
					return;
				}

				if (!var3.ap() && this.ag_fld.ah(-50451392) > 0) {
					this.az_fld.ay(var4 + var3.ax(), var5 + var3.au(), (byte)87);
				}

				var3.az();
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILuo;I)V"
	)
	void af(int var1, uo var2, int var3) throws EOFException {
		if (-1 == var1) {
			this.vf(var1, var2);
		} else if (!var2.az(var1)) {
			this.vf(var1, var2);
		} else {
			lu[] var4 = var2.aw_fld[var1];

			for (int var5 = 0; var5 < var4.length; var5++) {
				lu var6 = var4[var5];
				if (null != var6.fx_fld) {
					yz var7 = yb.vn(tu.ak(var6).av((Object[])var6.go_fld, 1897181670), 1517274639);
					this.az_fld.ar(var7, (byte)-99);
				}
			}

			this.vf(var1, var2);
		}
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqg;Luo;)V"
	)
	public static void sm(qh var0, qg var1, uo var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			yz var3 = qg.uf(var1, (byte)42);

			while (var3 != null) {
				yz var4 = var3;
				var3 = qg.uf(var1, (byte)69);
				lu var5 = var4.av((short)-6744);
				if (var5.by_fld >= 0) {
					lu var6 = var2.ak(-223620049 * var5.cv_fld);
					if (null == var6 || null == var6.ge_fld || var5.by_fld >= var6.ge_fld.length || var6.ge_fld[var5.by_fld * 766321167] != var5) {
						continue;
					}
				}

				va.ak(var4);
			}

			var3 = var1.ae();

			while (null != var3) {
				yz var9 = var3;
				var3 = var1.ae();
				lu var12 = var9.av((short)13831);
				if (var12.by_fld >= 0) {
					lu var15 = var2.ak(var12.cv_fld);
					if (var15 == null || null == var15.ge_fld || var12.by_fld >= var15.ge_fld.length || var15.ge_fld[408918063 * var12.by_fld] != var12) {
						continue;
					}
				}

				va.ak(var9);
			}

			var3 = var1.ah();

			while (var3 != null) {
				yz var10 = var3;
				var3 = var1.ah();
				lu var13 = var10.av((short)-4502);
				if (-1550657972 * var13.by_fld >= 0) {
					lu var16 = var2.ak(var13.cv_fld);
					if (null == var16 || var16.ge_fld == null || var13.by_fld >= var16.ge_fld.length || var13 != var16.ge_fld[var13.by_fld]) {
						continue;
					}
				}

				va.ak(var10);
			}

			boolean var11 = false;

			for (fr var14 = var1.ay(); var14 != null; var14 = var1.ay()) {
				if (12 == var14.ah_fld.bx_fld * -1689764747) {
					var11 = true;
				}

				sn(var0, var14, var2, (byte)-118);
			}

			if (!var11 && tj.ay_fld == 1) {
				var0.az_fld.al(null, (byte)-10);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILuo;B)V"
	)
	void au(int var1, uo var2, byte var3) throws EOFException {
		if (!var2.az(var1)) {
			if (var3 == 0) {
				;
			}
		} else {
			lu[] var4 = var2.aw_fld[var1];

			for (int var5 = 0; var5 < var4.length; var5++) {
				lu var6 = var4[var5];
				if (var6 != null) {
					var6.ce_fld = 0;
					var6.db_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfr;Luo;B)V"
	)
	void an(fr var1, uo var2, byte var3) throws EOFException {
		if (null != var1) {
			if (var1.ah_fld != null) {
				if (-2140649577 * var1.ah_fld.hj_fld >= 0) {
					lu var4 = var2.ak(var1.ah_fld.dh_fld * 694320263);
					if (var4 == null) {
						return;
					}

					if (var3 == 3) {
						return;
					}

					if (var4.ge_fld == null
						|| 0 == var4.ge_fld.length
						|| var1.ah_fld.dw_fld * -2140649577 >= var4.ge_fld.length
						|| var4.ge_fld[-2140649577 * var1.ah_fld.cr_fld] != var1.ah_fld) {
						return;
					}
				}

				if (var1.ah_fld.es_fld * 1404198381 == 11) {
					if (var3 == 3) {
						return;
					}

					if (250112973 * var1.av_fld == 0) {
						if (var3 == 3) {
							return;
						}

						if (var1.ah_fld.be(var1.av_fld, var1.az_fld * -979830545, 0, 0, -1617803658)) {
							this.az_fld.af(var1.ah_fld, (byte)-83);
						}

						return;
					}
				}

				if (12 == var1.ah_fld.mv_fld * 1404198381) {
					li var5 = lu.ax(var1.ah_fld, -1980498044);
					if (null != var5 && var5.ez(-1887234013)) {
						switch (var1.ae_fld * 250112973) {
							case 0:
								this.az_fld.al(var1.ah_fld, (byte)50);
								var5.bl(var1.az_fld * 1034708409, var1.ae_fld, this.ak_fld.ak(-966082127).as(82), this.ak_fld.ak(-703214137).as(81), 2138552032);
								break;
							case 1:
								var5.bx(var1.av_fld, -979830545 * var1.av_fld);
						}
					}
				}

				return;
			}

			if (var3 == 3) {
				return;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Luo;B)V"
	)
	public void as(qm var1, uo var2, byte var3) throws EOFException {
		if (var2.aa_fld != -1) {
			this.ar(var2.ap_fld, var1, var2, -1071987975);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILuo;Lqg;B)Lpk;"
	)
	public pk ag(int var1, int var2, int var3, uo var4, qg var5, byte var6) throws EOFException {
		pk var7 = new pk();
		var7.ag_fld = -1718686003 * var2;
		var7.ak_fld = -739843299 * var3;
		xz.fe(var4.ai_fld, var7, var1);
		ib(this, var2, var4, (byte)0);
		lu var8 = var4.ak(var1);
		var4.bh();
		tb.ag(var4.aw_fld[var1 >> 16], var8, false, var4, var5, 256429253);
		gt(this, var2, var4);
		zi(this, qm.ag_fld, var4, (byte)-82);
		return var7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Luo;IIIILqg;)V"
	)
	public void ac(uo var1, int var2, int var3, int var4, int var5, qg var6) throws EOFException {
		var1.ai().ak();
		var1.bm().aw();
		if (-1 != var1.ap_fld) {
			this.av_fld.ak(tj.ay_fld * 520063087, tj.ay_fld * -844200357, tj.ay_fld * 239763703, 1419428763 * tj.as_fld, 1541106701 * tj.ae_fld, tj.ar_fld, var5);
			this.ah(243771749 * var1.at_fld, 0, 0, var2, var3, 0, 0, var1, var4, var6);
		}
	}
}
