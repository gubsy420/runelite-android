import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ek")
public class ek {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bz_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1843486633
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lsi;"
	)
	si[] ag_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bo_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I[ZZB)V"
	)
	void ah(sp var1, int var2, boolean[] var3, boolean var4) {
		this.cw(rl21.ao_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)I"
	)
	public static int cg(ek var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld.length;
	}

	ek(xi var1, int var2) {
		this.ag_fld = new si[var2];
		this.az_fld = var1.cg();

		for (int var3 = 0; var3 < this.ag_fld.length; var3++) {
			si var4 = new si(this.az_fld, var1, false);
			this.ag_fld[var3] = var4;
		}

		this.ak(958235395);
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mu() {
		for (int var1 = 0; var1 < this.az_fld; var1++) {
			for (si var5 : this.ag_fld) {
				var5.ja(var1);
			}
		}

		for (int var6 = 0; var6 < this.az_fld; var6++) {
			for (si var10 : this.ag_fld) {
				var10.as(var6);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsi;"
	)
	si[] av() {
		return this.ag_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsp;II)V"
	)
	public void ae(sp var1, int var2) {
		this.ah(var1, var2, null, false);
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void jk() {
		int var1 = 0;

		while (var1 < this.ag_fld.length) {
			this.ag_fld[var1].kk_fld = var1++;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		si[] var1 = this.ag_fld;

		for (int var2 = 0; var2 < var1.length; var2++) {
			si var3 = var1[var2];
			if (var3.ak_fld >= 0) {
				var3.az_fld = this.ag_fld[961913907 * var3.ak_fld];
			}
		}
	}

	@ObfuscatedName("zj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int zj() {
		return cg(this, 1768035152);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lko;"
	)
	public static ko[] ak_Arrko(int var0) {
		return new ko[]{ko.ak_fld, ko.ag_fld, ko.az_fld};
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ar() {
		return this.ag_fld.length;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int af() {
		return this.ag_fld.length;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lsi;"
	)
	public si al(int var1) {
		return var1 >= cg(this, 1513130550) ? null : this.ag_fld[var1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()[Lsi;"
	)
	si[] ax() {
		return this.ag_fld;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Lek;IB)Lsi;"
	)
	public static si jo(ek var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= cg(var0, 1323759014) ? null : var0.ag_fld[var1];
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(I)Lsi;"
	)
	public si ks(int var1) {
		return jo(this, var1, (byte)4);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIIIII)V"
	)
	static final void ec(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		boolean var10 = client.gk_fld;

		try {
			client.gk_fld = false;
			int var21 = -2108712184;
			ev var22 = var0.az_fld;
			if (var3 >= 1 && var4 >= 1 && var3 <= var0.ah_fld - 2 && var4 <= var0.aw_fld - 2 && var21 != 241328171 && (!client.gk_fld || var1 == var0.ae_fld)) {
				em var23 = null;
				em var24 = null;
				int var25 = -1;
				long var26 = 0L;
				boolean var28 = false;
				boolean var29 = false;
				if (var2 == 0) {
					var26 = var22.cd(var1, var3, var4);
				}

				if (1 == var2) {
					var26 = ev.vm(var22, var1, var3, var4);
				}

				if (var2 == 2) {
					if (var21 == 241328171) {
						return;
					}

					var26 = var22.cq(var1, var3, var4);
				}

				if (3 == var2) {
					var26 = var22.cv(var1, var3, var4);
				}

				if (0L != var26) {
					int var30 = var22.cx(var1, var3, var4, var26);
					var25 = bj.ae(var26);
					int var56 = var30 & 31;
					int var57 = var30 >> 6 & 3;
					oe var31 = ko.az(var25);
					var0.af(var1, var3, var4, var31, var57, -2113890987);
					if (0 == var2) {
						fs var32 = ev.zr(var22, var1, var3, var4);
						var23 = var32.ak_fld;
						var24 = var32.ag_fld;
						var22.bi(var1, var3, var4);
						if (0 != var31.cu_fld) {
							var0.av_fld[var1].aq(var3, var4, var56, var57, var31.ci_fld, (byte)120);
						}
					}

					if (var2 == 1) {
						fv var60 = ev.tn(var22, var1, var3, var4);
						var23 = var60.ak_fld;
						var24 = var60.ag_fld;
						ev.kq(var22, var1, var3, var4);
					}

					if (var2 == 2) {
						if (var21 == 241328171) {
							return;
						}

						var23 = var22.bg(var1, var3, var4).ak_fld;
						var22.bn(var1, var3, var4);
						if (var3 + var31.cb_fld > var0.ah_fld - 1 || var21 == 241328171 || var31.cb_fld + var4 > var0.aw_fld - 1 || var3 + var31.co_fld > var0.ah_fld - 1) {
							return;
						}

						if (var31.co_fld + var4 > var0.aw_fld - 1) {
							if (var21 == 241328171) {
							}

							return;
						}

						if (0 != var31.cu_fld) {
							var0.av_fld[var1].am(var3, var4, var31.cb_fld, var31.co_fld, var57, var31.ci_fld, -1434304688);
						}
					}

					if (3 == var2) {
						var23 = var22.bb(var1, var3, var4).ak_fld;
						ev.fl(var22, var1, var3, var4);
						if (1 == var31.cu_fld) {
							var0.av_fld[var1].ad(var3, var4, -26286638);
						}
					}
				}

				if (var5 >= 0) {
					int var58 = var1;
					if (wo.dz(var0, var1, var3, var4)) {
						var58 = var1 + 1;
					}

					if (var25 != var5) {
						var23 = null;
						var24 = null;
					}

					gn var59 = var0.av_fld[var1];
					oe var61 = ko.az(var5);
					int var33 = var8 >= 0 ? var8 : var61.dc_fld;
					int var34;
					int var35;
					if (var6 != 1 && var6 != 3) {
						var34 = var61.cb_fld;
						var35 = var61.co_fld;
					} else {
						var34 = var61.co_fld;
						var35 = var61.cb_fld;
					}

					int var36;
					int var37;
					if (var34 + var3 <= var0.ah_fld) {
						var36 = (var34 >> 1) + var3;
						var37 = (1 + var34 >> 1) + var3;
					} else {
						var36 = var3;
						var37 = var3 + 1;
					}

					int var38;
					int var39;
					if (var4 + var35 <= var0.aw_fld) {
						var38 = var4 + (var35 >> 1);
						var39 = var4 + (var35 + 1 >> 1);
					} else {
						var38 = var4;
						var39 = var4 + 1;
					}

					int[][] var40 = var0.af_fld[var58];
					int var41 = var40[var36][var38] + var40[var37][var38] + var40[var36][var39] + var40[var37][var39] >> 2;
					int var42 = (var34 << 6) + (var3 << 7);
					int var43 = (var35 << 6) + (var4 << 7);
					ev var44 = var0.az_fld;
					long var45 = dt.ay(var1, var3, var4, 2, var61.cj_fld == 0, var5, var0.ag_fld);
					int var47 = (var6 << 6) + var7;
					if (1 == var61.dg_fld) {
						var47 += 256;
					}

					if (var7 == 22) {
						Object var48;
						if (var21 == 241328171) {
							return;
						}

						label810: {
							if (var33 == -1) {
								if (var21 == 241328171) {
									return;
								}

								if (null == var61.dy_fld) {
									var48 = var61.af(22, var6, var40, var42, var41, var43, (byte)-73);
									break label810;
								}
							}

							var48 = new dz(var0, var5, 22, var6, var58, var3, var4, var33, var61.dp_fld, var23);
						}

						ev.ap(var44, var1, var3, var4, var41, (em)var48, var45, var47);
						if (var61.cu_fld == 1 && null != var59) {
							gn.vi(var59, var3, var4, (short)-32727);
						}
					} else {
						label971: {
							if (10 != var7) {
								if (var21 == 241328171) {
									return;
								}

								if (var7 != 11) {
									if (var7 >= 12) {
										Object var64;
										if (-1 == var33 && var61.dy_fld == null) {
											if (var21 == 241328171) {
												return;
											}

											var64 = var61.af(var7, var6, var40, var42, var41, var43, (byte)-89);
										} else {
											var64 = new dz(var0, var5, var7, var6, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										ev.hx(var44, var1, var3, var4, var41, 1, 1, (em)var64, 0, var45, var47);
										if (0 != var61.cu_fld && null != var59) {
											var59.an(var3, var4, var34, var35, var61.ci_fld, (byte)16);
										}
									} else if (var7 == 0) {
										Object var65;
										label827: {
											if (var33 == -1) {
												if (var21 == 241328171) {
													return;
												}

												if (null == var61.dy_fld) {
													var65 = var61.af(0, var6, var40, var42, var41, var43, (byte)-50);
													break label827;
												}
											}

											var65 = new dz(var0, var5, 0, var6, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										ev.rp(var44, var1, var3, var4, var41, (em)var65, null, dt.av_fld[var6], 0, var45, var47);
										if (var61.cu_fld != 0 && var59 != null) {
											gn.wt(var59, var3, var4, var7, var6, var61.ci_fld, -2144555044);
										}
									} else if (1 == var7) {
										Object var66;
										if (-1 == var33 && null == var61.dy_fld) {
											var66 = var61.af(1, var6, var40, var42, var41, var43, (byte)-123);
										} else {
											var66 = new dz(var0, var5, 1, var6, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										ev.rp(var44, var1, var3, var4, var41, (em)var66, null, dt.ae_fld[var6], 0, var45, var47);
										if (var61.cu_fld != 0) {
											if (var21 == 241328171) {
												return;
											}

											if (null != var59) {
												gn.wt(var59, var3, var4, var7, var6, var61.ci_fld, -108851157);
											}
										}
									} else if (2 == var7) {
										int var67 = 1 + var6 & 3;
										Object var49;
										Object var50;
										if (-1 == var33 && var61.dy_fld == null) {
											var49 = var61.af(2, var6 + 4, var40, var42, var41, var43, (byte)-109);
											var50 = var61.af(2, var67, var40, var42, var41, var43, (byte)-128);
										} else {
											var49 = new dz(var0, var5, 2, var6 + 4, var58, var3, var4, var33, var61.dp_fld, var23);
											var50 = new dz(var0, var5, 2, var67, var58, var3, var4, var33, var61.dp_fld, var24);
										}

										ev.rp(var44, var1, var3, var4, var41, (em)var49, (em)var50, dt.av_fld[var6], dt.av_fld[var67], var45, var47);
										if (var61.cu_fld != 0 && null != var59) {
											gn.wt(var59, var3, var4, var7, var6, var61.ci_fld, -192678836);
										}
									} else if (3 == var7) {
										Object var68;
										if (-1 == var33 && null == var61.dy_fld) {
											if (var21 == 241328171) {
												return;
											}

											var68 = var61.af(3, var6, var40, var42, var41, var43, (byte)-26);
										} else {
											var68 = new dz(var0, var5, 3, var6, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										ev.rp(var44, var1, var3, var4, var41, (em)var68, null, dt.ae_fld[var6], 0, var45, var47);
										if (var61.cu_fld != 0 && var59 != null) {
											gn.wt(var59, var3, var4, var7, var6, var61.ci_fld, -97460635);
										}
									} else if (9 == var7) {
										Object var69;
										if (var33 == -1 && var61.dy_fld == null) {
											if (var21 == 241328171) {
												return;
											}

											var69 = var61.af(var7, var6, var40, var42, var41, var43, (byte)-104);
										} else {
											var69 = new dz(var0, var5, var7, var6, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										ev.hx(var44, var1, var3, var4, var41, 1, 1, (em)var69, 0, var45, var47);
										if (var61.cu_fld != 0 && var59 != null) {
											if (var21 == 241328171) {
												return;
											}

											var59.an(var3, var4, var34, var35, var61.ci_fld, (byte)16);
										}
									} else if (var7 == kn.ah_fld.ag(1225333840)) {
										Object var70;
										if (-1 == var33 && var61.dy_fld == null) {
											var70 = var61.af(var7, var6, var40, var42, var41, var43, (byte)-113);
										} else {
											var70 = new dz(var0, var5, var7, var6, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										var44.bs(var1, var3, var4, var41, (em)var70, null, dt.av_fld[var6], 0, dt.ah_fld[var6], dt.aw_fld[var6], 0, 0, var45, var47);
									} else if (var7 == kn.aw_fld.ag(1561749511)) {
										int var71 = 16;
										long var78 = var44.cd(var1, var3, var4);
										if (var78 != 0L) {
											if (var21 == 241328171) {
												return;
											}

											var71 = ko.az(bj.ae(var78)).dh_fld * -1071654907;
										}

										var71++;
										Object var51;
										if (var33 == -1 && null == var61.dy_fld) {
											if (var21 == 241328171) {
												return;
											}

											var51 = var61.af(kn.ah_fld.ag(-219440377), var6, var40, var42, var41, var43, (byte)-15);
										} else {
											var51 = new dz(var0, var5, kn.ah_fld.ag(-280775827), var6, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										var44.bs(var1, var3, var4, var41, (em)var51, null, dt.av_fld[var6], 0, var71 * dt.ah_fld[var6], dt.aw_fld[var6] * var71, 0, 0, var45, var47);
									} else if (var7 == kn.ay_fld.ag(-602425662)) {
										int var73 = 8;
										long var79 = var44.cq(var1, var3, var4);
										if (var79 != 0L) {
											var73 = ko.az(bj.ae(var79)).dh_fld * -1071654907 / 2;
										}

										var73++;
										Object var82;
										if (var33 == -1 && var61.dy_fld == null) {
											var82 = var61.af(kn.ah_fld.ag(-1810762830), var6 + 4, var40, var42, var41, var43, (byte)-114);
										} else {
											var82 = new dz(var0, var5, kn.ah_fld.ag(-581615470), 4 + var6, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										var44.bs(var1, var3, var4, var41, (em)var82, null, 256, var6, dt.ay_fld[var6] * var73, var73 * dt.as_fld[var6], 0, 0, var45, var47);
									} else if (var7 == kn.as_fld.ag(253136446)) {
										int var80 = 2 + var6 & 3;
										Object var75;
										if (var33 == -1 && null == var61.dy_fld) {
											var75 = var61.af(kn.ah_fld.ag(1413939200), 4 + var80, var40, var42, var41, var43, (byte)-84);
										} else {
											var75 = new dz(var0, var5, kn.ah_fld.ag(-1330202083), 4 + var80, var58, var3, var4, var33, var61.dp_fld, var23);
										}

										var44.bs(var1, var3, var4, var41, (em)var75, null, 256, var80, dt.ay_fld[var80], dt.as_fld[var80], 0, 0, var45, var47);
									} else if (var7 == kn.ar_fld.ag(1314718112)) {
										Object var52;
										int var53;
										Object var83;
										int var76 = 8;
										long var81 = var44.cq(var1, var3, var4);
										if (var81 != 0L) {
											var76 = ko.az(bj.ae(var81)).dh_fld * -1071654907 / 2;
										}

										label964: {
											var76++;
											var53 = 2 + var6 & 3;
											if (var33 == -1) {
												if (var21 == 241328171) {
													return;
												}

												if (var61.dy_fld == null) {
													if (var21 == 241328171) {
														return;
													}

													var83 = var61.af(kn.ah_fld.ag(547051790), var6 + 4, var40, var42, var41, var43, (byte)-87);
													var52 = var61.af(kn.ah_fld.ag(-1093452131), var53 + 4, var40, var42, var41, var43, (byte)-13);
													break label964;
												}
											}

											var83 = new dz(var0, var5, kn.ah_fld.ag(-1951444595), 4 + var6, var58, var3, var4, var33, var61.dp_fld, var23);
											var52 = new dz(var0, var5, kn.ah_fld.ag(1367944522), var53 + 4, var58, var3, var4, var33, var61.dp_fld, var24);
										}

										var44.bs(
											var1,
											var3,
											var4,
											var41,
											(em)var83,
											(em)var52,
											256,
											var6,
											var76 * dt.ay_fld[var6],
											dt.as_fld[var6] * var76,
											dt.ay_fld[var53],
											dt.as_fld[var53],
											var45,
											var47
										);
									}
									break label971;
								}
							}

							Object var63;
							if (var33 == -1 && var61.dy_fld == null) {
								var63 = var61.af(10, var6, var40, var42, var41, var43, (byte)-59);
							} else {
								var63 = new dz(var0, var5, 10, var6, var58, var3, var4, var33, var61.dp_fld, var23);
							}

							if (var63 != null) {
								ev.hx(var44, var1, var3, var4, var41, var34, var35, (em)var63, 11 == var7 ? 256 : 0, var45, var47);
							}

							if (0 != var61.cu_fld && var59 != null) {
								var59.an(var3, var4, var34, var35, var61.ci_fld, (byte)16);
							}
						}
					}

					var61 = ko.az(var5);
					if (var61 != null && var61.aq((short)-11774)) {
						dx.al(var0, var58, var3, var4, var61, var6);
					}
				}
			}
		} finally {
			client.gk_fld = var10;
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int nc(xi var0) {
		byte var1 = var0.al_fld[(var0.au_fld += 228932457) * -2039696228 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = var0.al_fld[(var0.au_fld += -452642941) * -661977895 - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	public void aa(sp var1, int var2) {
		this.ah(var1, var2, null, false);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	public void an(sp var1, int var2) {
		this.ah(var1, var2, null, false);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Lsp;I[ZZ)V"
	)
	public void cw(rl21 var1, sp var2, int var3, boolean[] var4, boolean var5) {
		int var6 = var2.aw_fld;
		int var7 = 0;

		for (si var11 : this.ag_fld) {
			if (var4 == null || var5 == var4[var7]) {
				var2.uw(var1, var3, var11, var7, var6);
			}

			var7++;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I[ZZ)V"
	)
	void aq(sp var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.ae();
		int var6 = 0;
		si[] var7 = this.av();

		for (int var8 = 0; var8 < var7.length; var8++) {
			si var9 = var7[var8];
			if (null == var3 || var3[var6] == var4) {
				var1.aw(var2, var9, var6, var5);
			}

			var6++;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	static final void ag(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ay() {
		si[] var1 = this.ag_fld;

		for (int var2 = 0; var2 < var1.length; var2++) {
			si var3 = var1[var2];
			if (var3.ak_fld * -1519375524 >= 0) {
				var3.az_fld = this.ag_fld[976340768 * var3.ak_fld];
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak(int var1) {
		this.jk();
		si[] var2 = this.ag_fld;

		for (int var3 = 0; var3 < var2.length; var3++) {
			si var4 = var2[var3];
			if (var4.ak_fld >= 0) {
				var4.az_fld = this.ag_fld[var4.ak_fld];
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.ag_fld.length;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsi;"
	)
	public si az(int var1, byte var2) {
		return var1 >= cg(this, 1323759014) ? null : this.ag_fld[var1];
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(Lqg;)Lfr;"
	)
	public static fr ya(qg var0) {
		return (fr)(fr)var0.av_fld.ae();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int as() {
		return this.ag_fld.length;
	}
}
