import java.awt.Container;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.MenuOptionClicked;

@ObfuscatedName("qd")
public class qd {
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cu_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static qd ag_fld = new qd(0);
	@ObfuscatedGetter(
		intValue = 1748728749
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	public static qd ak_fld = new qd(1);

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)I"
	)
	public static int qp(zg var0, int var1) {
		switch (var0.aq_fld) {
			case 0:
				return 0;
			case 1:
				return var1 / 2;
			case 2:
				return var1;
			default:
				return 0;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)Ljava/awt/Container;"
	)
	public static Container cs(tf var0) {
		return (Container)(null != var0.sj_fld ? var0.sj_fld : var0);
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;II)V"
	)
	public static final void fa(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) throws EOFException {
		rl5 var11 = client.eu(client.nr_fld, var0, var1, var2, var3, var4, var5, var6, var7);
		boolean var12 = false;
		if (bp.na_fld != null) {
			var12 = bp.na_fld.vl() == var2
				&& bp.na_fld.xi() == var3
				&& bp.na_fld.td() == var6
				&& bp.na_fld.jh() == var7
				&& bp.na_fld.ud() == var0
				&& bp.na_fld.su() == var1
				&& bp.na_fld.dv() == var4
				&& bp.na_fld.bp() == var5;
		}

		if (var11 == null && var12) {
			int var13;
			if (client.nr_fld.ag_fld < 500) {
				int var10000 = client.nr_fld.ag_fld * -930898849;
				client.nr_fld.ag_fld = client.nr_fld.ag_fld * -930898849 + 1;
				var13 = var10000;
			} else {
				var13 = 0;
			}

			client.nr_fld.ae_fld[var13] = var2;
			client.nr_fld.ah_fld[var13] = var3;
			client.nr_fld.as_fld[var13] = var6;
			client.nr_fld.ar_fld[var13] = var7;
			client.nr_fld.az_fld[var13] = var0;
			client.nr_fld.av_fld[var13] = var1;
			client.nr_fld.aw_fld[var13] = var4;
			client.nr_fld.ay_fld[var13] = var5;
			client.nr_fld.al_fld[var13] = false;
			client.nr_fld.af_fld[var13] = null;
			var11 = client.nr_fld.ne_fld[var13];
			if (var11 == null) {
				var11 = client.nr_fld.ne_fld[var13] = new rl5(client.nr_fld, var13);
			}

			var11.qy_fld = bp.na_fld.cn_fld;
		}

		if (var11 == null) {
			if (var8 != -1 || var9 != -1) {
				client.ii_fld
					.warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {} world {}", (Object[])(new Object[]{var6, var7, var2, var3, var0, var1, var5}));
			}
		} else {
			client.ii_fld.trace("Menu click op {} targ {} action {} id {} p0 {} p1 {} world {}", (Object[])(new Object[]{var6, var7, var2, var3, var0, var1, var5}));
			MenuOptionClicked var35 = new MenuOptionClicked(var11);
			og.ci_fld.getCallbacks().post(var35);
			if (var11.qy_fld != null) {
				try {
					var11.qy_fld.accept(var11);
				} catch (Exception var34) {
					client.ii_fld.warn("exception in menu callback", (Throwable)var34);
				}
			}

			if (var35.isConsumed()) {
				return;
			}

			var0 = var11.getParam0();
			var1 = var11.getParam1();
			var3 = var11.getIdentifier();
		}

		int var17 = var2;
		int var25 = 910500823;
		dx var26 = client.da_fld.ae(var5, (byte)-14);
		if (var26 == null) {
			if (var25 <= 879250526) {
			}
		} else {
			int var27 = var26.ay_fld;
			int var28 = var26.as_fld;
			xf var29 = var26.ax_fld;
			xf var30 = var26.au_fld;
			if (var2 >= 2000) {
				var17 = var2 - 2000;
			}

			if (var17 == 8) {
				ds var31 = (ds)var29.ak(var3);
				if (null != var31) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var32 = gi.ak(jb.av_fld, client.aq_fld.av_fld);
					xi.si(var32.ay_fld, var3);
					xi.be(var32.ay_fld, client.nn_fld);
					var32.ay_fld.ee(av.nj_fld);
					var32.ay_fld.dy(client.ej_fld.ay(82) ? 1 : 0);
					xi.si(var32.ay_fld, client.ny_fld);
					client.aq_fld.az(var32);
				}
			}

			if (29 == var17) {
				jm var36 = gi.ak(jb.bi_fld, client.aq_fld.av_fld);
				xi.ld(var36.ay_fld, var1, (byte)95);
				client.aq_fld.az(var36);
				lu var69 = cf.cg_fld.ak(var1);
				if (null != var69 && var69.gu_fld != null && 5 == var69.gu_fld[0][0]) {
					int var33 = var69.gu_fld[0][1];
					if (rt.ag_fld[var33] != var69.gv_fld[0]) {
						rt.ag_fld[var33] = var69.gv_fld[0];
						client.un(var33);
						ns.gk(var33, (byte)42);
					}
				}
			}

			if (var17 == 46) {
				cv var37 = (cv)var30.ak(var3);
				if (null != var37) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var70 = gi.ak(jb.by_fld, client.aq_fld.av_fld);
					var70.ay_fld.bc(client.ej_fld.ay(82) ? 1 : 0);
					var70.ay_fld.di(var3);
					client.aq_fld.az(var70);
				}
			}

			if (23 == var17) {
				if (client.ng_fld) {
					var26.az_fld.dd();
				} else {
					var26.az_fld.dq(true);
				}
			}

			if (var17 == 64) {
				if (var25 <= 879250526) {
					return;
				}

				client.ml_fld = var8;
				client.mw_fld = var9;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var0;
				client.or_fld = var1;
				jm var38 = gi.ak(jb.bq_fld, client.aq_fld.av_fld);
				var38.ay_fld.ek(client.ej_fld.ay(82) ? 1 : 0);
				xi.be(var38.ay_fld, var3);
				client.aq_fld.az(var38);
			}

			if (var17 == 51) {
				cv var39 = (cv)var30.ak(var3);
				if (null != var39) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var71 = gi.ak(jb.bt_fld, client.aq_fld.av_fld);
					var71.ay_fld.dy(client.ej_fld.ay(82) ? 1 : 0);
					xi.be(var71.ay_fld, var3);
					client.aq_fld.az(var71);
				}
			}

			if (var17 == 48) {
				cv var40 = (cv)var30.ak(var3);
				if (null != var40) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var72 = gi.ak(jb.ec_fld, client.aq_fld.av_fld);
					var72.ay_fld.ek(client.ej_fld.ay(82) ? 1 : 0);
					xi.si(var72.ay_fld, var3);
					client.aq_fld.az(var72);
				}
			}

			ft.fx(var29, var0, var1, var17, var3, var8, var9, (short)1885);
			if (1003 == var17) {
				client.ml_fld = var8;
				client.mw_fld = var9;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				ds var41 = (ds)var29.ak(var3);
				if (null != var41) {
					pp var73 = var41.ah_fld;
					if (null != var73.dy_fld) {
						var73 = var73.ar((byte)6);
					}

					if (var73 != null) {
						jm var89 = gi.ak(jb.dv_fld, client.aq_fld.av_fld);
						var89.ay_fld.bw(var73.ca_fld);
						client.aq_fld.az(var89);
					}
				}
			}

			label870: {
				if (var17 != 1008 && 1009 != var17 && var17 != 1010 && 1011 != var17) {
					if (var25 <= 879250526) {
						return;
					}

					if (1012 != var17) {
						break label870;
					}
				}

				ca.px_fld.cf(var17, var3, new kj(var0), new kj(var1), -97937842);
			}

			if (63 == var17) {
				client.ml_fld = var8;
				client.mw_fld = var9;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var0;
				client.or_fld = var1;
				jm var42 = gi.ak(jb.dp_fld, client.aq_fld.av_fld);
				var42.ay_fld.di(var3);
				var42.ay_fld.ek(client.ej_fld.ay(82) ? 1 : 0);
				client.aq_fld.az(var42);
			}

			if (16 == var17) {
				client.ml_fld = var8;
				client.mw_fld = var9;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var0;
				client.or_fld = var1;
				jm var43 = gi.ak(jb.dc_fld, client.aq_fld.av_fld);
				xi.si(var43.ay_fld, lu.nf_fld);
				var43.ay_fld.di(hi.iz_fld);
				var43.ay_fld.bq(vo.ix_fld);
				xi.be(var43.ay_fld, var27 + var0);
				var43.ay_fld.di(var3);
				xi.be(var43.ay_fld, var1 + var28);
				var43.ay_fld.bc(client.ej_fld.ay(82) ? 1 : 0);
				client.aq_fld.az(var43);
			}

			if (var17 == 28) {
				jm var44 = gi.ak(jb.bi_fld, client.aq_fld.av_fld);
				xi.ld(var44.ay_fld, var1, (byte)106);
				client.aq_fld.az(var44);
				lu var74 = cf.cg_fld.ak(var1);
				if (var74 != null && null != var74.gu_fld) {
					if (var25 <= 879250526) {
						return;
					}

					if (5 == var74.gu_fld[0][0]) {
						int var90 = var74.gu_fld[0][1];
						rt.ag_fld[var90] = 1 - rt.ag_fld[var90];
						client.un(var90);
						ns.gk(var90, (byte)11);
					}
				}
			}

			if (var17 == 25) {
				lu var45 = cf.cg_fld.ag(var1, var0, -621908048);
				if (var45 != null) {
					yq.fb(-73284900);
					String var75 = cf.cg_fld.ao(var45);
					if (var75 == null) {
						var75 = kh.aj_fld;
					}

					String var91;
					if (var45.bj_fld) {
						var91 = var45.eq_fld + gd.ag(16777215, -1940547058);
					} else {
						var91 = gd.ag(65280, -1940547058) + var45.gi_fld + gd.ag(16777215, -1940547058);
					}

					ls.fj(var1, var0, nt.ag(uo.sa(cf.cg_fld, var45, 508688775)), var4, var75, var91, -347388985);
					client.ee_fld = 0;
				}
			} else {
				if (var17 == 57 || var17 == 1007) {
					lu var46 = cf.cg_fld.ag(var1, var0, -634216546);
					if (null != var46) {
						nt.fc(var3, var1, var0, var4, var7, -1047367383);
					}
				}

				if (26 == var17) {
					nx.gf(2099311797);
				}

				if (var17 == 14) {
					if (var25 <= 879250526) {
						return;
					}

					cv var47 = (cv)var30.ak(var3);
					if (null != var47) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var76 = gi.ak(jb.da_fld, client.aq_fld.av_fld);
						xi.si(var76.ay_fld, hi.iz_fld);
						var76.ay_fld.ee(vo.ix_fld);
						var76.ay_fld.ek(client.ej_fld.ay(82) ? 1 : 0);
						var76.ay_fld.di(lu.nf_fld);
						var76.ay_fld.di(var3);
						client.aq_fld.az(var76);
					}
				}

				if (var17 == 49) {
					cv var48 = (cv)var30.ak(var3);
					if (null != var48) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var77 = gi.ak(jb.db_fld, client.aq_fld.av_fld);
						var77.ay_fld.di(var3);
						xj var93 = var77.ay_fld;
						byte var10001;
						if (client.ej_fld.ay(82)) {
							if (var25 <= 879250526) {
								return;
							}

							var10001 = 1;
						} else {
							var10001 = 0;
						}

						var93.bc(var10001);
						client.aq_fld.az(var77);
					}
				}

				if (1004 == var17) {
					if (var25 <= 879250526) {
						return;
					}

					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					jm var49 = gi.ak(jb.ao_fld, client.aq_fld.av_fld);
					xi.be(var49.ay_fld, var1 + var28);
					xi.si(var49.ay_fld, var0 + var27);
					var49.ay_fld.bw(var3);
					client.aq_fld.az(var49);
				}

				if (60 == var17) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = 1821296193;
					client.mn_fld = 0;
					client.op_fld = var3;
					client.oz_fld = 1324150954;
					jm var50 = gi.ak(jb.df_fld, client.aq_fld.av_fld);
					var50.ay_fld.dy(var3);
					client.aq_fld.az(var50);
				}

				if (var17 == 47) {
					if (var25 <= 879250526) {
						return;
					}

					cv var51 = (cv)var30.ak(var3);
					if (null != var51) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var78 = gi.ak(jb.aj_fld, client.aq_fld.av_fld);
						var78.ay_fld.bc(client.ej_fld.ay(82) ? 1 : 0);
						var78.ay_fld.bw(var3);
						client.aq_fld.az(var78);
					}
				}

				if (65 == var17) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var52 = gi.ak(jb.et_fld, client.aq_fld.av_fld);
					var52.ay_fld.bw(var3);
					xi.rs(var52.ay_fld, client.ej_fld.ay(82) ? 1 : 0);
					client.aq_fld.az(var52);
				}

				ng.fo(var0, var1, var17, var3, var8, var9, var27, var28, (byte)72);
				if (var17 == 7) {
					if (var25 <= 879250526) {
						return;
					}

					ds var53 = (ds)var29.ak(var3);
					if (null != var53) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var79 = gi.ak(jb.ad_fld, client.aq_fld.av_fld);
						var79.ay_fld.ee(vo.ix_fld);
						var79.ay_fld.ek(client.ej_fld.ay(82) ? 1 : 0);
						xi.si(var79.ay_fld, hi.iz_fld);
						var79.ay_fld.di(var3);
						var79.ay_fld.bw(lu.nf_fld);
						client.aq_fld.az(var79);
					}
				}

				if (var17 == 1002) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					jm var54 = gi.ak(jb.cf_fld, client.aq_fld.av_fld);
					xi.be(var54.ay_fld, var3);
					client.aq_fld.az(var54);
				}

				if (15 == var17) {
					if (var25 <= 879250526) {
						return;
					}

					cv var55 = (cv)var30.ak(var3);
					if (null != var55) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var80 = gi.ak(jb.am_fld, client.aq_fld.av_fld);
						xi.si(var80.ay_fld, var3);
						var80.ay_fld.ee(av.nj_fld);
						xi.be(var80.ay_fld, client.ny_fld);
						xi.rs(var80.ay_fld, client.ej_fld.ay(82) ? 1 : 0);
						var80.ay_fld.bw(client.nn_fld);
						client.aq_fld.az(var80);
					}
				}

				if (var17 == 66) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var56 = gi.ak(jb.dw_fld, client.aq_fld.av_fld);
					var56.ay_fld.di(var3);
					var56.ay_fld.bc(client.ej_fld.ay(82) ? 1 : 0);
					client.aq_fld.az(var56);
				}

				if (var17 == 67) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var57 = gi.ak(jb.dl_fld, client.aq_fld.av_fld);
					var57.ay_fld.dy(client.ej_fld.ay(82) ? 1 : 0);
					var57.ay_fld.bw(var3);
					client.aq_fld.az(var57);
				}

				if (var17 == 45) {
					cv var58 = (cv)var30.ak(var3);
					if (null != var58) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var81 = gi.ak(jb.bf_fld, client.aq_fld.av_fld);
						xi.rs(var81.ay_fld, client.ej_fld.ay(82) ? 1 : 0);
						xi.si(var81.ay_fld, var3);
						client.aq_fld.az(var81);
					}
				}

				if (var17 == 1013) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					jm var59 = gi.ak(jb.bm_fld, client.aq_fld.av_fld);
					xi.be(var59.ay_fld, var3);
					client.aq_fld.az(var59);
				}

				jh.fp(var0, var1, var17, var3, var8, var9, var27, var28, -896814510);
				if (50 == var17) {
					cv var60 = (cv)var30.ak(var3);
					if (null != var60) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var82 = gi.ak(jb.bp_fld, client.aq_fld.av_fld);
						xi.rs(var82.ay_fld, client.ej_fld.ay(82) ? 1 : 0);
						xi.be(var82.ay_fld, var3);
						client.aq_fld.az(var82);
					}
				}

				if (var17 == 44) {
					cv var61 = (cv)var30.ak(var3);
					if (null != var61) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var83 = gi.ak(jb.ca_fld, client.aq_fld.av_fld);
						xj var94 = var83.ay_fld;
						byte var98;
						if (client.ej_fld.ay(82)) {
							if (var25 <= 879250526) {
								return;
							}

							var98 = 1;
						} else {
							var98 = 0;
						}

						var94.dy(var98);
						var83.ay_fld.di(var3);
						client.aq_fld.az(var83);
					}
				}

				if (1 == var17) {
					if (var25 <= 879250526) {
						return;
					}

					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var62 = gi.ak(jb.eb_fld, client.aq_fld.av_fld);
					var62.ay_fld.ea(vo.ix_fld);
					xi.be(var62.ay_fld, lu.nf_fld);
					var62.ay_fld.bw(var3);
					xi.be(var62.ay_fld, var1 + var28);
					xi.si(var62.ay_fld, var0 + var27);
					var62.ay_fld.dy(client.ej_fld.ay(82) ? 1 : 0);
					xi.si(var62.ay_fld, hi.iz_fld);
					client.aq_fld.az(var62);
				}

				if (var17 == 2) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var63 = gi.ak(jb.di_fld, client.aq_fld.av_fld);
					var63.ay_fld.bw(var28 + var1);
					var63.ay_fld.di(var27 + var0);
					var63.ay_fld.bw(client.ny_fld);
					var63.ay_fld.di(client.nn_fld);
					var63.ay_fld.ee(av.nj_fld);
					xj var95 = var63.ay_fld;
					byte var99;
					if (client.ej_fld.ay(82)) {
						if (var25 <= 879250526) {
							return;
						}

						var99 = 1;
					} else {
						var99 = 0;
					}

					xi.rs(var95, var99);
					var63.ay_fld.bw(var3);
					client.aq_fld.az(var63);
				}

				if (var17 == 30 && cf.cg_fld.be()) {
					jg.fk(var1, var0);
					cf.cg_fld.bs(cf.cg_fld.ag(var1, var0, -235268617));
				}

				if (62 == var17) {
					rg var64 = (rg)var26.an_fld.ak(var3);
					if (null != var64) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var84 = gi.ak(jb.dn_fld, client.aq_fld.av_fld);
						var84.ay_fld.bw(client.nn_fld);
						var84.ay_fld.bw(var3);
						var84.ay_fld.ee(av.nj_fld);
						xj var96 = var84.ay_fld;
						byte var100;
						if (client.ej_fld.ay(82)) {
							if (var25 <= 879250526) {
								return;
							}

							var100 = 1;
						} else {
							var100 = 0;
						}

						var96.ek(var100);
						var84.ay_fld.di(client.ny_fld);
						client.aq_fld.az(var84);
					}
				}

				if (var17 == 58) {
					if (var25 <= 879250526) {
						return;
					}

					lu var65 = cf.cg_fld.ag(var1, var0, 794196101);
					if (var65 != null) {
						if (null != var65.fd_fld) {
							yz var85 = yb.jo(tu.ak(var65).av((Object[])var65.fd_fld, 1615939831).au(var3, -1416723919), var7, 1815210262).ax(-1479689890);
							va.ak(var85);
						}

						jm var86 = gi.ak(jb.ew_fld, client.aq_fld.av_fld);
						xi.ld(var86.ay_fld, var1, (byte)97);
						xi.be(var86.ay_fld, client.ny_fld);
						xi.si(var86.ay_fld, client.nn_fld);
						var86.ay_fld.bq(av.nj_fld);
						var86.ay_fld.bw(var0);
						xi.si(var86.ay_fld, var4);
						client.aq_fld.az(var86);
					}
				}

				if (17 == var17) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var66 = gi.ak(jb.cj_fld, client.aq_fld.av_fld);
					var66.ay_fld.dy(client.ej_fld.ay(82) ? 1 : 0);
					var66.ay_fld.bq(av.nj_fld);
					var66.ay_fld.di(client.nn_fld);
					var66.ay_fld.di(var3);
					xi.be(var66.ay_fld, var0 + var27);
					xi.si(var66.ay_fld, var1 + var28);
					xi.be(var66.ay_fld, client.ny_fld);
					client.aq_fld.az(var66);
				}

				if (var17 == 61) {
					rg var67 = (rg)var26.an_fld.ak(var3);
					if (null != var67) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var87 = gi.ak(jb.aa_fld, client.aq_fld.av_fld);
						var87.ay_fld.bw(var3);
						xi.si(var87.ay_fld, lu.nf_fld);
						var87.ay_fld.di(hi.iz_fld);
						xj var97 = var87.ay_fld;
						byte var101;
						if (client.ej_fld.ay(82)) {
							if (var25 <= 879250526) {
								return;
							}

							var101 = 1;
						} else {
							var101 = 0;
						}

						var97.bc(var101);
						var87.ay_fld.ee(vo.ix_fld);
						client.aq_fld.az(var87);
					}
				}

				if (24 == var17) {
					lu var68 = cf.cg_fld.ak(var1);
					if (var68 != null) {
						boolean var88 = true;
						if (var68.bp_fld > 0) {
							if (var25 <= 879250526) {
								return;
							}

							var88 = gd.gm(var68);
						}

						if (var88) {
							if (var25 <= 879250526) {
								return;
							}

							jm var92 = gi.ak(jb.bi_fld, client.aq_fld.av_fld);
							xi.ld(var92.ay_fld, var1, (byte)93);
							client.aq_fld.az(var92);
						}
					}
				}

				if (client.ee_fld != 0) {
					client.ee_fld = 0;
				}

				if (client.nk_fld) {
					yq.fb(763139522);
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([B)Lyv;"
	)
	public static final yv ak(byte[] var0) {
		BufferedImage var2 = null;

		try {
			synchronized (ImageIO.class) {
				var2 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			if (null != var2) {
				int var11 = var2.getWidth();
				int var4 = var2.getHeight();
				int[] var5 = new int[var4 * var11];
				PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var11, var4, var5, 0, var11);
				var6.grabPixels();
				return new yv(var5, var11, var4);
			}
		} catch (IOException var8) {
		} catch (InterruptedException var9) {
		}

		return null;
	}

	qd(int var1) {
		this.az_fld = var1;
	}
}
