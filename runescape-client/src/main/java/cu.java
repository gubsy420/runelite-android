import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cu")
public class cu {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bc_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ag_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bn_fld;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lzf;"
	)
	public static zf dl_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] ab_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int an_fld;

	cu() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lxj;)V"
	)
	static void az(dx var0, xj var1) throws EOFException {
		int var2 = var1.cg();
		if (var2 < var0.ad_fld.az()) {
			for (int var3 = var2; var3 < var0.ad_fld.az(); var3++) {
				int var4 = yw.wk(var0.ad_fld, var3, (byte)30);
				dx var5 = client.da_fld.ae(var4, (byte)-88);
				if (null != var5) {
					for (int var6 = 0; var6 < client.db_fld.al_fld; var6++) {
						int var7 = client.db_fld.ar_fld[var6];
						di.qy(client.db_fld, (cv)var5.au_fld.ae(var7), 1610651027);
					}

					cx.lk(client.da_fld, var4);
				}

				rg var19 = (rg)var0.an_fld.ak(var4);
				if (var19 != null) {
					var19.gy();
				}
			}
		}

		if (var2 > var0.ad_fld.az()) {
			throw new RuntimeException("");
		} else {
			var0.ad_fld.av();
			gu var16 = new gu();

			for (int var17 = 0; var17 < var2; var17++) {
				int var20 = yw.wk(var0.ad_fld, var17, (byte)51);
				rg var22 = (rg)var0.an_fld.ak(var20);
				int var24 = var1.cg();
				if (0 != var24) {
					var0.ad_fld.ak(var20);
					if (1 != var24) {
						var16.ay(var22.aw((byte)4));
						byte var26 = var1.cw();
						if (0 != var26) {
							int var29 = ea.ag(var1, var26, 0);
							int var31 = ea.ag(var1, var26, 2);
							int var11 = ea.ag(var1, var26, 4);
							int var12 = ea.ag(var1, var26, 6);
							gu.xn(var16, var29, var31, var11, var12);
						}

						if (2 == var24) {
							var22.am(var0, var16, (byte)39);
						} else {
							var22.ad(var16, (byte)5);
						}
					}

					int var27 = var1.cg();
					hf.ag(var22, var1, var27, (byte)0);
				} else {
					dx var8 = client.da_fld.ae(var20, (byte)-48);
					if (null != var8) {
						for (int var9 = 0; var9 < client.db_fld.al_fld; var9++) {
							int var10 = client.db_fld.ar_fld[var9];
							di.qy(client.db_fld, (cv)var8.au_fld.ae(var10), 1610651027);
						}

						cx.lk(client.da_fld, var20);
					}

					if (null != var22) {
						var22.gy();
					}
				}
			}

			while (var1.au(client.appletStub.aw_fld, 1182291587) > 0) {
				int var18 = var1.cm();
				int var21 = var1.df();
				int var23 = xi.fm(var1, (byte)28);
				int var25 = var1.de();
				int var28 = var1.cg();
				var0.ad_fld.ak(var18);
				int var30 = var28 >> 4 & 15;
				int var32 = var28 & 15;
				int var33 = 8 * var30;
				int var34 = var32 * 8;
				dx var13 = cx.cl(client.da_fld, var18, var33, var34, cx.kq_fld.ax((byte)1), er.ag_fld, (byte)119);
				rg var15 = new rg(var18, var13);
				var0.an_fld.ag(var15, var18);
				var15.ae_fld = 755061937 * var18;
				var15.ar_fld = var0.ag_fld * -115976066;
				var15.ay(hh.ag(var23), -1491541196);
				dp.ak(var1, var15.av_fld, 0, 0);
				var15.am(var0, var15.av_fld, (byte)16);
				var15.af((ko)ka.ak(ek.ak_Arrko(1148375399), var25), (byte)4);
				hf.ag(var15, var1, var21, (byte)0);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lxj;I)V"
	)
	static void aw(rg var0, xj var1, int var2) throws EOFException {
		if ((var2 & 2) != 0) {
			int var3 = var1.eo();
			int var4 = var1.cg();
			if (65535 == var3) {
				byte var5 = -1;
				qa.hs(var0.aa_fld, var5, -941443304);
				var0.aa_fld.ar(461909079);
				var0.ai_fld = var4;
			} else {
				label43: {
					ol var6 = qa.kw(var0.aa_fld, 952142506);
					if (null != var6) {
						if (var3 == rg.dp(var0, (byte)0)) {
							int var7 = var6.ba_fld;
							if (var7 == 1) {
								var0.aa_fld.ar(461909079);
								var0.ai_fld = -275969367 * var4;
							}

							if (2 == var7) {
								qa.qn(var0.aa_fld, 1416724464);
							}
							break label43;
						}

						if (hm.ak(var3).bv_fld * -1232992871 < var6.bv_fld) {
							break label43;
						}
					}

					qa.hs(var0.aa_fld, var3, 826214266);
					var0.aa_fld.ar(461909079);
					var0.ai_fld = var4;
				}
			}
		}

		if ((var2 & 1) != 0) {
			int var8 = var1.df();
			rg.xc(var0, var8, (short)-6057);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lxj;I)V"
	)
	static void ae(rg var0, xj var1, int var2) throws EOFException {
		if ((var2 & 2) != 0) {
			int var3 = var1.eo();
			int var4 = var1.cg();
			if (65535 == var3) {
				byte var5 = -1;
				qa.hs(var0.aa_fld, var5, -1798730614);
				var0.aa_fld.ar(461909079);
				var0.ai_fld = var4;
			} else {
				label42: {
					ol var6 = qa.kw(var0.aa_fld, 1870714705);
					if (null != var6) {
						if (var3 == rg.dp(var0, (byte)0)) {
							int var7 = var6.ba_fld;
							if (var7 == 1) {
								var0.aa_fld.ar(461909079);
								var0.ai_fld = 1383289516 * var4;
							}

							if (2 == var7) {
								qa.qn(var0.aa_fld, 1251977082);
							}
							break label42;
						}

						if (hm.ak(var3).bv_fld * 1596649398 < var6.bv_fld) {
							break label42;
						}
					}

					qa.hs(var0.aa_fld, var3, -1472032433);
					var0.aa_fld.ar(461909079);
					var0.ai_fld = -404766165 * var4;
				}
			}
		}

		if ((var2 & 1) != 0) {
			int var8 = var1.df();
			rg.xc(var0, var8, (short)316);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lxj;I)V"
	)
	static void ah(rg var0, xj var1, int var2) throws EOFException {
		if ((var2 & 2) != 0) {
			int var3 = var1.eo();
			int var4 = var1.cg();
			if (65535 == var3) {
				byte var5 = -1;
				qa.hs(var0.aa_fld, var5, -693903617);
				var0.aa_fld.ar(461909079);
				var0.ai_fld = var4;
			} else {
				label42: {
					ol var6 = qa.kw(var0.aa_fld, -51914944);
					if (null != var6) {
						if (var3 == rg.dp(var0, (byte)0)) {
							int var7 = var6.ba_fld * -800156302;
							if (var7 == 1) {
								var0.aa_fld.ar(461909079);
								var0.ai_fld = -1173386847 * var4;
							}

							if (2 == var7) {
								qa.qn(var0.aa_fld, -13655653);
							}
							break label42;
						}

						if (hm.ak(var3).bv_fld * -1232992871 < var6.bv_fld) {
							break label42;
						}
					}

					qa.hs(var0.aa_fld, var3, 1707587549);
					var0.aa_fld.ar(461909079);
					var0.ai_fld = 76258851 * var4;
				}
			}
		}

		if ((var2 & 1) != 0) {
			int var8 = var1.df();
			rg.xc(var0, var8, (short)-6478);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lxj;)V"
	)
	static void av(dx var0, xj var1) throws EOFException {
		int var2 = var1.cg();
		if (var2 < var0.ad_fld.az()) {
			for (int var3 = var2; var3 < var0.ad_fld.az(); var3++) {
				int var4 = yw.wk(var0.ad_fld, var3, (byte)92);
				dx var5 = client.da_fld.ae(var4, (byte)-83);
				if (null != var5) {
					for (int var6 = 0; var6 < client.db_fld.al_fld; var6++) {
						int var7 = client.db_fld.ar_fld[var6];
						di.qy(client.db_fld, (cv)var5.au_fld.ae(var7), 1610651027);
					}

					cx.lk(client.da_fld, var4);
				}

				rg var19 = (rg)var0.an_fld.ak(var4);
				if (var19 != null) {
					var19.gy();
				}
			}
		}

		if (var2 > var0.ad_fld.az()) {
			throw new RuntimeException("");
		} else {
			var0.ad_fld.av();
			gu var16 = new gu();

			for (int var17 = 0; var17 < var2; var17++) {
				int var20 = yw.wk(var0.ad_fld, var17, (byte)94);
				rg var22 = (rg)var0.an_fld.ak(var20);
				int var24 = var1.cg();
				if (0 != var24) {
					var0.ad_fld.ak(var20);
					if (1 != var24) {
						var16.ay(var22.aw((byte)4));
						byte var26 = var1.cw();
						if (0 != var26) {
							int var29 = ea.ag(var1, var26, 0);
							int var31 = ea.ag(var1, var26, 2);
							int var11 = ea.ag(var1, var26, 4);
							int var12 = ea.ag(var1, var26, 6);
							gu.xn(var16, var29, var31, var11, var12);
						}

						if (2 == var24) {
							var22.am(var0, var16, (byte)14);
						} else {
							var22.ad(var16, (byte)5);
						}
					}

					int var27 = var1.cg();
					hf.ag(var22, var1, var27, (byte)0);
				} else {
					dx var8 = client.da_fld.ae(var20, (byte)-51);
					if (null != var8) {
						for (int var9 = 0; var9 < client.db_fld.al_fld; var9++) {
							int var10 = client.db_fld.ar_fld[var9];
							di.qy(client.db_fld, (cv)var8.au_fld.ae(var10), 1610651027);
						}

						cx.lk(client.da_fld, var20);
					}

					if (null != var22) {
						var22.gy();
					}
				}
			}

			while (var1.au(client.appletStub.aw_fld, 1305712101) > 0) {
				int var18 = var1.cm();
				int var21 = var1.df();
				int var23 = xi.fm(var1, (byte)-19);
				int var25 = var1.de();
				int var28 = var1.cg();
				var0.ad_fld.ak(var18);
				int var30 = var28 >> 4 & 15;
				int var32 = var28 & 15;
				int var33 = 8 * var30;
				int var34 = var32 * 8;
				dx var13 = cx.cl(client.da_fld, var18, var33, var34, cx.kq_fld.ax((byte)1), er.ag_fld, (byte)46);
				rg var15 = new rg(var18, var13);
				var0.an_fld.ag(var15, var18);
				var15.ae_fld = var18;
				var15.ar_fld = var0.ag_fld * 1903490745;
				var15.ay(hh.ag(var23), -1346831260);
				dp.ak(var1, var15.av_fld, 0, 0);
				var15.am(var0, var15.av_fld, (byte)44);
				var15.af((ko)ka.ak(ek.ak_Arrko(1148375399), var25), (byte)4);
				hf.ag(var15, var1, var21, (byte)0);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lxj;I)V"
	)
	static void ay(rg var0, xj var1, int var2) throws EOFException {
		if ((var2 & 2) != 0) {
			int var3 = var1.eo();
			int var4 = var1.cg();
			if (2046271231 == var3) {
				byte var5 = -1;
				qa.hs(var0.aa_fld, var5, -1076305804);
				var0.aa_fld.ar(461909079);
				var0.ai_fld = 1628602387 * var4;
			} else {
				label42: {
					ol var6 = qa.kw(var0.aa_fld, -925575028);
					if (null != var6) {
						if (var3 == rg.dp(var0, (byte)0)) {
							int var7 = var6.ba_fld;
							if (var7 == 1) {
								var0.aa_fld.ar(461909079);
								var0.ai_fld = var4;
							}

							if (2 == var7) {
								qa.qn(var0.aa_fld, 906867074);
							}
							break label42;
						}

						if (hm.ak(var3).bv_fld * -1232992871 < var6.bv_fld) {
							break label42;
						}
					}

					qa.hs(var0.aa_fld, var3, -1264573544);
					var0.aa_fld.ar(461909079);
					var0.ai_fld = -729477213 * var4;
				}
			}
		}

		if ((var2 & 1) != 0) {
			int var8 = var1.df();
			rg.xc(var0, var8, (short)4793);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gt() {
		xy.kh_fld.ag(cx.kq_fld.ab(2143209424), cn.uk(cx.kq_fld, 465869533));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
	)
	static int au(int var0, ba var1, boolean var2) throws EOFException, UnsupportedEncodingException {
		lu var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var4 = cf.cg_fld.ak(var5);
		} else {
			var4 = var2 ? gs.ap_fld : bp.ab_fld;
		}

		if (var0 == 1100) {
			gz.ax_fld -= 2;
			int var40 = bp.au_fld[gz.ax_fld];
			int var46 = bp.au_fld[1 + gz.ax_fld];
			if (var4.bx_fld == 12) {
				li var47 = lu.ax(var4, -1490859162);
				if (var47 != null && var47.al(var40, var46)) {
				}
			} else {
				var4.cp_fld = var40;
				if (var4.cp_fld > var4.cn_fld - var4.bb_fld) {
					var4.cp_fld = var4.cn_fld - var4.bb_fld;
				}

				if (var4.cp_fld < 0) {
					var4.cp_fld = 0;
				}

				var4.ce_fld = var46;
				if (var4.ce_fld > var4.cr_fld - var4.cd_fld) {
					var4.ce_fld = var4.cr_fld - var4.cd_fld;
				}

				if (var4.ce_fld < 0) {
					var4.ce_fld = 0;
				}
			}

			return 1;
		} else if (1101 == var0) {
			var4.ca_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1102) {
			var4.cz_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1103 == var0) {
			var4.cb_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1104) {
			var4.cu_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1105 == var0) {
			var4.cj_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1106 == var0) {
			var4.cl_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1107) {
			var4.dc_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1108 == var0) {
			var4.dm_fld = -1800825853;
			var4.dq_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1109) {
			gz.ax_fld -= 6;
			var4.da_fld = 1016596669 * bp.au_fld[gz.ax_fld];
			var4.dk_fld = -139613485 * bp.au_fld[gz.ax_fld + 1];
			var4.dx_fld = bp.au_fld[gz.ax_fld + 2];
			var4.ds_fld = bp.au_fld[3 + gz.ax_fld];
			var4.du_fld = bp.au_fld[4 + gz.ax_fld];
			var4.db_fld = -964578897 * bp.au_fld[gz.ax_fld + 5];
			return 1;
		} else if (1110 == var0) {
			int var39 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var4.dl_fld != var39) {
				var4.dl_fld = var39;
				var4.gy_fld = 0;
				var4.gz_fld = 0;
			}

			return 1;
		} else if (var0 == 1111) {
			var4.di_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1112 == var0) {
			String var38 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			if (12 == var4.bx_fld) {
				li var45 = lu.ax(var4, -1623913455);
				if (var45 != null && var45.cq()) {
					var45.av(var38);
				} else {
					var4.dp_fld = var38;
				}
			} else if (!var38.equals(var4.dp_fld)) {
				var4.dp_fld = var38;
			}

			return 1;
		} else if (1113 == var0) {
			var4.de_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (12 == var4.bx_fld) {
				li var37 = lu.ax(var4, -1733517326);
				if (var37 != null) {
					li.oe(var37, -984124514);
				}
			}

			return 1;
		} else if (1114 == var0) {
			gz.ax_fld -= 3;
			if (var4.bx_fld == 12) {
				li var36 = lu.ax(var4, -1542167732);
				if (null != var36) {
					li.xp(var36, bp.au_fld[gz.ax_fld], bp.au_fld[1 + gz.ax_fld]);
					var36.au(bp.au_fld[2 + gz.ax_fld]);
				}
			} else {
				var4.ep_fld = bp.au_fld[gz.ax_fld];
				var4.eb_fld = 2097134267 * bp.au_fld[gz.ax_fld + 1];
				var4.es_fld = bp.au_fld[gz.ax_fld + 2];
			}

			return 1;
		} else if (var0 == 1115) {
			var4.ed_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1116 == var0) {
			var4.dh_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1117 == var0) {
			var4.dv_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1118) {
			var4.dz_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1119 == var0) {
			var4.dt_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1120 == var0) {
			gz.ax_fld -= 2;
			var4.cn_fld = bp.au_fld[gz.ax_fld];
			var4.cr_fld = -348242603 * bp.au_fld[1 + gz.ax_fld];
			if (var4.bx_fld == 0) {
				lu[] var35 = var4.by_fld == -1 ? cf.cg_fld.aw_fld[var4.bf_fld >> 16] : cf.cg_fld.ak(var4.cv_fld).ge_fld;
				tb.ag(var35, var4, false, cf.cg_fld, client.cz_fld, 1387931102);
			}

			return 1;
		} else if (var0 == 1121) {
			jg.fk(var4.bf_fld, var4.by_fld);
			uo.qt(cf.cg_fld, var4, (byte)-112);
			return 1;
		} else if (var0 == 1122) {
			var4.ch_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1123) {
			var4.cg_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1124 == var0) {
			var4.co_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1125 == var0) {
			int var34 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ym var44 = (ym)ka.ak(wt.ak(), var34);
			if (null != var44) {
				var4.ck_fld = var44;
			}

			return 1;
		} else if (1126 == var0) {
			boolean var33 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			var4.ci_fld = var33;
			return 1;
		} else if (1127 == var0) {
			boolean var32 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			var4.dn_fld = var32;
			return 1;
		} else if (var0 == 1129) {
			var4.ct_fld = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			return 1;
		} else if (1130 == var0) {
			var4.ac((String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], "", xh.jn_fld, hb.at());
			return 1;
		} else if (1131 == var0) {
			gz.ax_fld -= 2;
			var4.bz(bp.au_fld[gz.ax_fld], bp.au_fld[gz.ax_fld + 1], -1639598140);
			return 1;
		} else if (var0 == 1132) {
			var4.br((String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127], -1257377898);
			return 1;
		} else if (var0 == 1133) {
			gz.ax_fld--;
			ln var31 = var4.bi(433557637);
			if (null != var31) {
				var31.ak_fld = bp.au_fld[gz.ax_fld];
			}

			return 1;
		} else if (var0 == 1134) {
			gz.ax_fld--;
			ln var30 = var4.bi(1480955805);
			if (null != var30) {
				var30.ag_fld = 171528145 * bp.au_fld[gz.ax_fld];
			}

			return 1;
		} else if (1135 == var0) {
			ef.aq_fld--;
			li var29 = lu.ax(var4, -1666728989);
			if (null != var29) {
				var4.dj_fld = (String)bp.ai_fld[ef.aq_fld];
			}

			return 1;
		} else if (1136 == var0) {
			gz.ax_fld--;
			ln var28 = var4.bi(1079272719);
			if (null != var28) {
				var28.az_fld = bp.au_fld[gz.ax_fld];
			}

			return 1;
		} else if (var0 == 1137) {
			gz.ax_fld--;
			li var27 = lu.ax(var4, -1139226057);
			if (var27 != null && var27.ay(bp.au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1138) {
			gz.ax_fld--;
			li var26 = lu.ax(var4, -1250024763);
			if (var26 != null && var26.as(bp.au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1139) {
			gz.ax_fld--;
			li var25 = lu.ax(var4, -756682881);
			if (null != var25 && var25.ar(bp.au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1140) {
			boolean var24 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			client.fy_fld.az(-960124588);
			li var43 = lu.ax(var4, -1198421969);
			if (null != var43 && var43.ag(var24) && var24) {
				client.fy_fld.ag(var4, 114546440);
			}

			return 1;
		} else if (var0 == 1141) {
			boolean var23 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (!var23 && client.fy_fld.ak() == var4) {
				client.fy_fld.az(-1303066008);
			}

			li var42 = lu.ax(var4, -1184278282);
			if (null != var42) {
				var42.br(var23);
			}

			return 1;
		} else if (1142 == var0) {
			gz.ax_fld -= 2;
			li var22 = lu.ax(var4, -1331814710);
			if (null != var22 && var22.ap(bp.au_fld[gz.ax_fld], bp.au_fld[1 + gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1143) {
			gz.ax_fld--;
			li var21 = lu.ax(var4, -1059187441);
			if (var21 != null && var21.ap(bp.au_fld[gz.ax_fld], bp.au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (1144 == var0) {
			gz.ax_fld--;
			li var20 = lu.ax(var4, -963645206);
			if (var20 != null) {
				var20.cr(bp.au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1145) {
			gz.ax_fld--;
			li var19 = lu.ax(var4, -1042335482);
			if (null != var19) {
				var19.ce(bp.au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1146) {
			gz.ax_fld--;
			li var18 = lu.ax(var4, -1283387706);
			if (null != var18) {
				var18.ax(bp.au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1147) {
			gz.ax_fld--;
			li var17 = lu.ax(var4, -1146190688);
			if (var17 != null) {
				li.mw(var17, bp.au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1148) {
			gz.ax_fld -= 2;
			sc var16 = var4.bu(-1587502902);
			if (var16 != null) {
				var16.ak(bp.au_fld[gz.ax_fld], bp.au_fld[gz.ax_fld + 1]);
			}

			return 1;
		} else if (var0 == 1149) {
			gz.ax_fld -= 2;
			sc var15 = var4.bu(-999092036);
			if (null != var15) {
				var15.ag((char)bp.au_fld[gz.ax_fld], bp.au_fld[1 + gz.ax_fld]);
			}

			return 1;
		} else if (1150 == var0) {
			var4.bm((String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], xh.jn_fld, (byte)-90);
			return 1;
		} else if (var0 == 1151) {
			ef.aq_fld -= 3;
			String var14 = (String)bp.ai_fld[ef.aq_fld];
			String var41 = (String)bp.ai_fld[1 + ef.aq_fld];
			String var7 = (String)bp.ai_fld[ef.aq_fld + 2];
			long var8 = hb.at();
			long var10 = ha.ac();
			String var12 = lo.ae().az(lo.ae().osType * -2048773107);
			if (var8 != -1L) {
				var14 = var14.replaceAll("%userid%", Long.toString(var8));
			}

			if (-1L != var10) {
				var14 = var14.replaceAll("%userhash%", Long.toString(var10));
			}

			if (!var12.isEmpty()) {
				var14 = var14.replaceAll("%deviceid%", var12);
			}

			var4.aj(var14, var41, var7, var12, Long.toString(var10), xh.jn_fld, -566809948);
			return 1;
		} else if (1152 == var0) {
			if (11 != var4.bx_fld) {
				throw new RuntimeException();
			} else {
				ma var13 = var4.bx(794992659);
				boolean var6 = null != var13 && var13.ah() && mx.jg(cf.ak(), var13.ax(), -2032933431);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var6 ? 1 : 0;
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int ad(int var0, ba var1, boolean var2) {
		lu var4 = var2 ? gs.ap_fld : bp.ab_fld;
		if (1500 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bq_fld;
			return 1;
		} else if (1501 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bg_fld;
			return 1;
		} else if (1502 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.bb_fld;
			return 1;
		} else if (1503 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cd_fld;
			return 1;
		} else if (var0 == 1504) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cf_fld ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cv_fld;
			return 1;
		} else if (var0 != 1506) {
			return 2;
		} else {
			int var5 = var4.cv_fld;
			if (var5 == -1) {
				uo var6 = cf.cg_fld;

				for (pk var7 = (pk)var6.an_fld.av(); null != var7; var7 = (pk)var6.an_fld.ae()) {
					if (var7.ak_fld == var4.bf_fld >> 16) {
						var5 = (int)var7.hc_long;
						break;
					}
				}
			}

			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5;
			return 1;
		}
	}
}
