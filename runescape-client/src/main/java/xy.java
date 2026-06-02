import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xy")
public class xy {
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ce_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	public static xy ag_fld = new xy("p12_full");
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	public static xy az_fld = new xy("b12_full");
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static dh kh_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	public static xy ak_fld = new xy("p11_full");
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	public static xy ah_fld = new xy("verdana_15pt_regular");
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	public static xy ae_fld = new xy("verdana_13pt_regular");
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int qv_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	public static xy av_fld = new xy("verdana_11pt_regular");

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int cy() {
		return client.el_fld ? 2 : 1;
	}

	xy(String var1) {
		this.aw_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int ag(int var0, int var1, int var2) {
		int var4 = var0 >> 16 & 0xFF;
		int var5 = var0 >> 8 & 0xFF;
		int var6 = var0 & 0xFF;
		int var7 = var1 >> 16 & 0xFF;
		int var8 = var1 >> 8 & 0xFF;
		int var9 = var1 & 0xFF;
		int var10 = var4 + (var7 - var4 + 1) * var2 / 64 & 0xFF;
		int var11 = var5 + (1 + (var8 - var5)) * var2 / 64 & 0xFF;
		int var12 = (1 + (var9 - var6)) * var2 / 64 + var6 & 0xFF;
		return var10 << 16 | var11 << 8 | var12;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int as(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == 100) {
			gz.ax_fld -= 4;
			int var37 = bp.au_fld[gz.ax_fld];
			int var57 = bp.au_fld[1 + gz.ax_fld];
			int var72 = bp.au_fld[gz.ax_fld + 2];
			boolean var85 = 0 != bp.au_fld[3 + gz.ax_fld];
			if (var72 < 0) {
				throw new RuntimeException("");
			} else {
				lu var97 = cf.cg_fld.ak(var37);
				if (0 != var97.bx_fld) {
					throw new RuntimeException("");
				} else {
					mg.aw(var97, var72, var85, var1, (short)-4683);
					lu var101 = new lu();
					var101.bx_fld = var57;
					var101.cv_fld = (var101.bf_fld = var97.bf_fld * 1) * 1050017623;
					var101.by_fld = var72;
					var101.bj_fld = true;
					if (12 == var57) {
						hg.cm(var101);
					}

					var97.ge_fld[var72] = var101;
					if (var2) {
						gs.ap_fld = var101;
					} else {
						bp.ab_fld = var101;
					}

					return 1;
				}
			}
		} else if (var0 == 101) {
			lu var36 = var2 ? gs.ap_fld : bp.ab_fld;
			lu var56 = cf.cg_fld.ak(var36.bf_fld);
			hy.cz(var36, var56);
			return 1;
		} else if (102 == var0) {
			gz.ax_fld--;
			int var35 = bp.au_fld[gz.ax_fld];
			lu var55 = cf.cg_fld.ak(var35);
			var55.ge_fld = null;
			return 1;
		} else if (var0 == 105) {
			gz.ax_fld -= 3;
			int var34 = bp.au_fld[gz.ax_fld];
			int var54 = bp.au_fld[1 + gz.ax_fld];
			int var71 = bp.au_fld[gz.ax_fld + 2];
			lu var84 = cf.cg_fld.ak(var34);
			lu var96 = cf.cg_fld.ag(var34, var54, -752005764);
			if (var84 == null) {
				throw new RuntimeException("");
			} else if (var54 < 0) {
				throw new RuntimeException("");
			} else if (null == var96) {
				throw new RuntimeException("");
			} else if (var96.bx_fld == 0) {
				throw new RuntimeException("");
			} else {
				mg.aw(var84, var71, true, var1, (short)8050);
				if (-1 != var96.cy_fld) {
					lu var99 = cf.cg_fld.ag(var34, var96.cy_fld, -980002027);
					lr.ay(var99, var71, 1828744557);
				}

				lu var100 = new lu(var96);
				var100.by_fld = var71;
				if (12 == var96.bx_fld) {
					hg.cm(var100);
				}

				var84.ge_fld[var71] = var100;
				if (var2) {
					gs.ap_fld = var100;
				} else {
					bp.ab_fld = var100;
				}

				return 1;
			}
		} else if (106 == var0) {
			gz.ax_fld -= 2;
			int var33 = bp.au_fld[gz.ax_fld];
			int var53 = bp.au_fld[gz.ax_fld + 1];
			lu var70 = var2 ? gs.ap_fld : bp.ab_fld;
			if (var70 == null) {
				throw new RuntimeException("");
			} else {
				lu var83 = cf.cg_fld.ak(var70.cv_fld);
				if (var70.bx_fld != 0) {
					throw new RuntimeException("");
				} else if (var83.bx_fld != 0) {
					throw new RuntimeException();
				} else {
					mg.aw(var83, var53, true, var1, (short)-19604);
					lr.ay(var70, var53, 1828744557);
					lu var95 = new lu();
					var95.bx_fld = var33;
					var95.cv_fld = (var95.bf_fld = var83.bf_fld * 1) * 1050017623;
					var95.cy_fld = var70.by_fld * -281153977;
					var95.by_fld = var53;
					var95.bj_fld = true;
					if (var33 == 12) {
						hg.cm(var95);
					}

					var83.ge_fld[var53] = var95;
					if (var2) {
						gs.ap_fld = var95;
					} else {
						bp.ab_fld = var95;
					}

					return 1;
				}
			}
		} else if (var0 == 107) {
			gz.ax_fld -= 2;
			int var32 = bp.au_fld[gz.ax_fld];
			int var52 = bp.au_fld[1 + gz.ax_fld];
			lu var69 = var2 ? gs.ap_fld : bp.ab_fld;
			if (null == var69) {
				throw new RuntimeException("");
			} else {
				lu var82 = cf.cg_fld.ag(var69.cv_fld, var69.cy_fld, 1908846347);
				lu var94 = cf.cg_fld.ak(var82.cv_fld);
				if (var82.bx_fld != 0) {
					throw new RuntimeException("");
				} else if (0 != var94.bx_fld) {
					throw new RuntimeException();
				} else {
					mg.aw(var94, var52, true, var1, (short)6623);
					lr.ay(var82, var52, 1828744557);
					lu var98 = new lu();
					var98.bx_fld = var32;
					var98.cv_fld = (var98.bf_fld = 1 * var94.bf_fld) * 1050017623;
					var98.cy_fld = var82.by_fld * -281153977;
					var98.by_fld = var52;
					var98.bj_fld = true;
					if (var32 == 12) {
						hg.cm(var98);
					}

					var94.ge_fld[var52] = var98;
					if (var2) {
						gs.ap_fld = var98;
					} else {
						bp.ab_fld = var98;
					}

					return 1;
				}
			}
		} else if (200 == var0) {
			gz.ax_fld -= 2;
			int var31 = bp.au_fld[gz.ax_fld];
			int var51 = bp.au_fld[1 + gz.ax_fld];
			lu var68 = var51 != -1 ? cf.cg_fld.ag(var31, var51, 1181831116) : null;
			ag.af(var68, var2);
			return 1;
		} else if (var0 == 201) {
			ag.af(cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]), var2);
			return 1;
		} else if (var0 == 204) {
			lu var30 = var2 ? gs.ap_fld : bp.ab_fld;
			lu var50 = var30 != null ? cf.cg_fld.ag(var30.cv_fld, var30.cy_fld, -449049237) : null;
			ag.af(var50, var2);
			return 1;
		} else if (var0 == 205) {
			lu var29 = var2 ? gs.ap_fld : bp.ab_fld;
			lu var49 = null != var29 ? cf.cg_fld.ak(var29.cv_fld) : null;
			ag.af(var49, var2);
			return 1;
		} else if (206 == var0) {
			lu var28 = var2 ? gs.ap_fld : bp.ab_fld;
			if (var28 == null) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var28.by_fld == -1) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var48 = cf.cg_fld.ak(var28.cv_fld);
				lu var67 = null;

				for (int var81 = var28.by_fld + 1; var81 < var48.ge_fld.length; var81++) {
					lu var93 = var48.ge_fld[var81];
					if (null != var93 && var93.cy_fld == var28.cy_fld) {
						var67 = var93;
						break;
					}
				}

				ag.af(var67, var2);
				return 1;
			}
		} else if (207 == var0) {
			lu var27 = var2 ? gs.ap_fld : bp.ab_fld;
			if (var27 == null) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (-1 == var27.by_fld) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var47 = cf.cg_fld.ak(var27.cv_fld);
				lu var66 = null;

				for (int var80 = var27.by_fld - 1; var80 >= 0; var80--) {
					lu var92 = var47.ge_fld[var80];
					if (var92 != null && var27.cy_fld == var92.cy_fld) {
						var66 = var92;
						break;
					}
				}

				ag.af(var66, var2);
				return 1;
			}
		} else if (208 == var0) {
			lu var26 = var2 ? gs.ap_fld : bp.ab_fld;
			if (null == var26) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (0 != var26.bx_fld) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var46 = cf.cg_fld.ak(var26.cv_fld);
				if (var46.ge_fld == null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				} else {
					int var65 = 0;

					for (int var79 = 0; var79 < var46.ge_fld.length; var79++) {
						lu var91 = var46.ge_fld[var79];
						if (var91 != null && var26.by_fld == var91.cy_fld) {
							var65++;
						}
					}

					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var65;
					return 1;
				}
			}
		} else if (var0 == 209) {
			lu var25 = var2 ? gs.ap_fld : bp.ab_fld;
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var25 != null ? var25.cy_fld : -1;
			return 1;
		} else if (var0 == 210) {
			int var24 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var45 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var64 = he.cg(var24);
			int var78 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var90 = he.cg(var45);
			int var9 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			px var10 = kb.ag_px(var9, -1412598824);
			Object var11 = var10.as();
			Object var12 = null;
			if (var78 >= 0) {
				px var13 = kb.ag_px(var78, -533674787);
				var12 = var13.as();
			}

			lu var102 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			lu var14 = null;
			if (null != var102 && null != var102.ge_fld) {
				for (int var15 = 0; var15 < var102.ge_fld.length; var15++) {
					lu var16 = var102.ge_fld[var15];
					if (var16 != null && (var9 < 0 || var16.ao(var9, var11, -2126113188).equals(var90)) && (var78 < 0 || var16.ao(var78, var12, -1940803331).equals(var64))) {
						var14 = var16;
						break;
					}
				}
			}

			ag.af(var14, var2);
			return 1;
		} else if (var0 == 211) {
			gz.ax_fld -= 3;
			int var23 = bp.au_fld[gz.ax_fld];
			lu var44 = cf.cg_fld.ak(bp.au_fld[gz.ax_fld + 1]);
			int var63 = bp.au_fld[2 + gz.ax_fld];
			bp.at_fld.ak(var23, var44, var63, 1632525604);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bp.at_fld.av();
			return 1;
		} else if (212 == var0) {
			int var22 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			lu var43 = var2 ? gs.ap_fld : bp.ab_fld;
			if (-1 == var43.by_fld) {
				bp.at_fld.ak(var22, var43, -1, 1922871212);
			} else {
				bp.at_fld.ak(var22, cf.cg_fld.ak(var43.cv_fld), var43.by_fld, 1631847615);
			}

			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bp.at_fld.av();
			return 1;
		} else if (213 == var0) {
			ag.af(bp.at_fld.ae(), var2);
			return 1;
		} else if (var0 == 214) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bp.at_fld.ah();
			return 1;
		} else if (215 == var0) {
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ag.al(bp.at_fld.aw());
			return 1;
		} else if (var0 == 216) {
			int var21 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var42 = he.cg(var21);
			int var62 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			px var77 = kb.ag_px(var62, 224470058);
			Object var89 = var77.as();
			bp.at_fld.ay(var62, var42, var89, -2044640177);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bp.at_fld.av();
			return 1;
		} else if (217 == var0) {
			int var20 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			lu var41 = var2 ? gs.ap_fld : bp.ab_fld;
			if (var41 == null) {
				throw new RuntimeException("");
			} else if (var41.bx_fld != 0) {
				throw new RuntimeException("");
			} else {
				lu var61 = cf.cg_fld.ak(var41.cv_fld);
				if (var61.bx_fld != 0) {
					throw new RuntimeException();
				} else {
					lu var76 = cx.ar(var20, var61, var41);
					ag.af(var76, var2);
					return 1;
				}
			}
		} else if (218 == var0) {
			lu var19 = var2 ? gs.ap_fld : bp.ab_fld;
			if (var19 == null) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var40 = cf.cg_fld.ak(var19.cv_fld);
				if (var40 != null && null != var40.ge_fld) {
					lu var60 = null;

					for (int var75 = 0; var75 < var40.ge_fld.length; var75++) {
						lu var88 = var40.ge_fld[var75];
						if (null != var88 && var19.cy_fld == var88.cy_fld) {
							var60 = var88;
							break;
						}
					}

					ag.af(var60, var2);
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 219) {
			lu var18 = var2 ? gs.ap_fld : bp.ab_fld;
			if (null == var18) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var39 = cf.cg_fld.ak(var18.cv_fld);
				if (null != var39 && null != var39.ge_fld) {
					lu var59 = null;

					for (int var74 = var39.ge_fld.length - 1; var74 >= 0; var74--) {
						lu var87 = var39.ge_fld[var74];
						if (null != var87 && var87.cy_fld == var18.cy_fld) {
							var59 = var87;
							break;
						}
					}

					ag.af(var59, var2);
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 220) {
			lu var17 = var2 ? gs.ap_fld : bp.ab_fld;
			if (null == var17) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var17.bx_fld != 0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var38 = cf.cg_fld.ak(var17.cv_fld);
				if (var38 != null && var38.ge_fld != null) {
					lu var58 = null;

					for (int var73 = 0; var73 < var38.ge_fld.length; var73++) {
						lu var86 = var38.ge_fld[var73];
						if (null != var86 && var86.cy_fld == var17.by_fld) {
							var58 = var86;
							break;
						}
					}

					ag.af(var58, var2);
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 221) {
			lu var4 = var2 ? gs.ap_fld : bp.ab_fld;
			if (null == var4) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (0 != var4.bx_fld) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var5 = cf.cg_fld.ak(var4.cv_fld);
				if (var5 != null && null != var5.ge_fld) {
					lu var6 = null;

					for (int var7 = var5.ge_fld.length - 1; var7 >= 0; var7--) {
						lu var8 = var5.ge_fld[var7];
						if (var8 != null && var8.cy_fld == var4.by_fld) {
							var6 = var8;
							break;
						}
					}

					ag.af(var6, var2);
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;J)V"
	)
	static void ak(xi var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.bw((int)var1);
	}
}
