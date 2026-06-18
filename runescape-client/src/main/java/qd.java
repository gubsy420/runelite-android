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
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1748728749
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	public static qd ak_fld = new qd(1);

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb rg(yb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ae_fld = var1;
		return var0;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V"
	)
	public static final void fa(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) throws EOFException {
		rl5 var11 = client.oj(client.nr_fld, var0, var1, var2, var3, var4, var5, var6, var7);
		boolean var12 = false;
		if (bp.na_fld != null) {
			var12 = bp.na_fld.ed() == var2
				&& bp.na_fld.sv() == var3
				&& bp.na_fld.xp() == var6
				&& bp.na_fld.fv() == var7
				&& bp.na_fld.rz() == var0
				&& bp.na_fld.ym() == var1
				&& bp.na_fld.yf() == var4
				&& bp.na_fld.oq() == var5;
		}

		if (var11 == null && var12) {
			int var13;
			if (client.nr_fld.ot_fld < 500) {
				int var10000 = client.nr_fld.ot_fld * -930898849;
				client.nr_fld.ot_fld = client.nr_fld.ot_fld * -930898849 + 1;
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
			var11 = client.nr_fld.vh_fld[var13];
			if (var11 == null) {
				var11 = client.nr_fld.vh_fld[var13] = new rl5(client.nr_fld, var13);
			}

			var11.le_fld = bp.na_fld.xr_fld;
		}

		if (var11 == null) {
			if (var8 != -1 || var9 != -1) {
				client.logger
					.warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {} world {}", (Object[])(new Object[]{var6, var7, var2, var3, var0, var1, var5}));
			}
		} else {
			client.logger.trace("Menu click op {} targ {} action {} id {} p0 {} p1 {} world {}", (Object[])(new Object[]{var6, var7, var2, var3, var0, var1, var5}));
			MenuOptionClicked var35 = new MenuOptionClicked(var11);
			og.ci_fld.getCallbacks().post(var35);
			if (var11.le_fld != null) {
				try {
					var11.le_fld.accept(var11);
				} catch (Exception var34) {
					client.logger.warn("exception in menu callback", (Throwable)var34);
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
			int var27 = var26.as_fld;
			int var28 = var26.ay_fld;
			xf var29 = var26.ax_fld;
			xf var30 = var26.au_fld;
			if (var2 >= 2000) {
				var17 = var2 - 2000;
			}

			if (var17 == 8) {
				ds var31 = (ds)var29.ae(var3);
				if (null != var31) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var32 = gi.ak(jb.av_fld, client.appletStub.av_fld);
					var32.ay_fld.ca(var3);
					var32.ay_fld.ba(client.nn_fld);
					var32.ay_fld.cp(av.nj_fld);
					var32.ay_fld.bq(client.ej_fld.as(82) ? 1 : 0);
					var32.ay_fld.ca(client.ny_fld);
					client.appletStub.az(var32);
				}
			}

			if (29 == var17) {
				jm var36 = gi.ak(jb.bi_fld, client.appletStub.av_fld);
				var36.ay_fld.eb(var1);
				client.appletStub.az(var36);
				lu var69 = cf.cg_fld.ak(var1);
				if (null != var69 && var69.gu_fld != null && 5 == var69.gu_fld[0][0]) {
					int var33 = var69.gu_fld[0][1];
					if (rt.ag_fld[var33] != var69.gv_fld[0]) {
						rt.ag_fld[var33] = var69.gv_fld[0];
						client.sc(var33);
						ns.gk(var33, (byte)42);
					}
				}
			}

			if (var17 == 46) {
				cv var37 = (cv)var30.ae(var3);
				if (null != var37) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var70 = gi.ak(jb.by_fld, client.appletStub.av_fld);
					var70.ay_fld.ea(client.ej_fld.as(82) ? 1 : 0);
					var70.ay_fld.ek(var3);
					client.appletStub.az(var70);
				}
			}

			if (23 == var17) {
				if (client.ng_fld) {
					var26.az_fld.dd();
				} else {
					ev.cf(var26.az_fld, true);
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
				jm var38 = gi.ak(jb.bq_fld, client.appletStub.av_fld);
				var38.ay_fld.di(client.ej_fld.as(82) ? 1 : 0);
				var38.ay_fld.ba(var3);
				client.appletStub.az(var38);
			}

			if (var17 == 51) {
				cv var39 = (cv)var30.ae(var3);
				if (null != var39) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var71 = gi.ak(jb.bt_fld, client.appletStub.av_fld);
					var71.ay_fld.bq(client.ej_fld.as(82) ? 1 : 0);
					var71.ay_fld.ba(var3);
					client.appletStub.az(var71);
				}
			}

			if (var17 == 48) {
				cv var40 = (cv)var30.ae(var3);
				if (null != var40) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var72 = gi.ak(jb.ec_fld, client.appletStub.av_fld);
					var72.ay_fld.di(client.ej_fld.as(82) ? 1 : 0);
					var72.ay_fld.ca(var3);
					client.appletStub.az(var72);
				}
			}

			ft.fx(var29, var0, var1, var17, var3, var8, var9, (short)1885);
			if (1003 == var17) {
				client.ml_fld = var8;
				client.mw_fld = var9;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				ds var41 = (ds)var29.ae(var3);
				if (null != var41) {
					pp var73 = var41.ah_fld;
					if (null != var73.dy_fld) {
						var73 = var73.ar((byte)6);
					}

					if (var73 != null) {
						jm var89 = gi.ak(jb.dv_fld, client.appletStub.av_fld);
						xi.vy(var89.ay_fld, var73.ca_fld);
						client.appletStub.az(var89);
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

				wl.bo(ca.px_fld, var17, var3, new kj(var0), new kj(var1));
			}

			if (63 == var17) {
				client.ml_fld = var8;
				client.mw_fld = var9;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var0;
				client.or_fld = var1;
				jm var42 = gi.ak(jb.dp_fld, client.appletStub.av_fld);
				var42.ay_fld.ek(var3);
				var42.ay_fld.di(client.ej_fld.as(82) ? 1 : 0);
				client.appletStub.az(var42);
			}

			if (16 == var17) {
				client.ml_fld = var8;
				client.mw_fld = var9;
				client.mp_fld = -652374910;
				client.mn_fld = 0;
				client.oq_fld = var0;
				client.or_fld = var1;
				jm var43 = gi.ak(jb.dc_fld, client.appletStub.av_fld);
				var43.ay_fld.ca(lu.nf_fld);
				var43.ay_fld.ek(hi.iz_fld);
				var43.ay_fld.dy(vo.ix_fld);
				var43.ay_fld.ba(var27 + var0);
				var43.ay_fld.ek(var3);
				var43.ay_fld.ba(var1 + var28);
				var43.ay_fld.ea(client.ej_fld.as(82) ? 1 : 0);
				client.appletStub.az(var43);
			}

			if (var17 == 28) {
				jm var44 = gi.ak(jb.bi_fld, client.appletStub.av_fld);
				var44.ay_fld.eb(var1);
				client.appletStub.az(var44);
				lu var74 = cf.cg_fld.ak(var1);
				if (var74 != null && null != var74.gu_fld) {
					if (var25 <= 879250526) {
						return;
					}

					if (5 == var74.gu_fld[0][0]) {
						int var90 = var74.gu_fld[0][1];
						rt.ag_fld[var90] = 1 - rt.ag_fld[var90];
						client.sc(var90);
						ns.gk(var90, (byte)11);
					}
				}
			}

			if (var17 == 25) {
				lu var45 = cf.cg_fld.ag(var1, var0);
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

					ls.fj(var1, var0, nt.ag(uo.xd(cf.cg_fld, var45, 508688775)), var4, var75, var91, -347388985);
					client.ee_fld = 0;
				}
			} else {
				if (var17 == 57 || var17 == 1007) {
					lu var46 = cf.cg_fld.ag(var1, var0);
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

					cv var47 = (cv)var30.ae(var3);
					if (null != var47) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var76 = gi.ak(jb.da_fld, client.appletStub.av_fld);
						var76.ay_fld.ca(hi.iz_fld);
						var76.ay_fld.cp(vo.ix_fld);
						var76.ay_fld.di(client.ej_fld.as(82) ? 1 : 0);
						var76.ay_fld.ek(lu.nf_fld);
						var76.ay_fld.ek(var3);
						client.appletStub.az(var76);
					}
				}

				if (var17 == 49) {
					cv var48 = (cv)var30.ae(var3);
					if (null != var48) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var77 = gi.ak(jb.db_fld, client.appletStub.av_fld);
						var77.ay_fld.ek(var3);
						xj var93 = var77.ay_fld;
						byte var10001;
						if (client.ej_fld.as(82)) {
							if (var25 <= 879250526) {
								return;
							}

							var10001 = 1;
						} else {
							var10001 = 0;
						}

						var93.ea(var10001);
						client.appletStub.az(var77);
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
					jm var49 = gi.ak(jb.ao_fld, client.appletStub.av_fld);
					var49.ay_fld.ba(var1 + var28);
					var49.ay_fld.ca(var0 + var27);
					xi.vy(var49.ay_fld, var3);
					client.appletStub.az(var49);
				}

				if (60 == var17) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = 1821296193;
					client.mn_fld = 0;
					client.op_fld = var3;
					client.oz_fld = 1324150954;
					jm var50 = gi.ak(jb.df_fld, client.appletStub.av_fld);
					var50.ay_fld.bq(var3);
					client.appletStub.az(var50);
				}

				if (var17 == 47) {
					if (var25 <= 879250526) {
						return;
					}

					cv var51 = (cv)var30.ae(var3);
					if (null != var51) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var78 = gi.ak(jb.aj_fld, client.appletStub.av_fld);
						var78.ay_fld.ea(client.ej_fld.as(82) ? 1 : 0);
						xi.vy(var78.ay_fld, var3);
						client.appletStub.az(var78);
					}
				}

				if (65 == var17) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var52 = gi.ak(jb.et_fld, client.appletStub.av_fld);
					xi.vy(var52.ay_fld, var3);
					var52.ay_fld.cx(client.ej_fld.as(82) ? 1 : 0);
					client.appletStub.az(var52);
				}

				ng.fo(var0, var1, var17, var3, var8, var9, var27, var28, (byte)72);
				if (var17 == 7) {
					if (var25 <= 879250526) {
						return;
					}

					ds var53 = (ds)var29.ae(var3);
					if (null != var53) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var79 = gi.ak(jb.ad_fld, client.appletStub.av_fld);
						var79.ay_fld.cp(vo.ix_fld);
						var79.ay_fld.di(client.ej_fld.as(82) ? 1 : 0);
						var79.ay_fld.ca(hi.iz_fld);
						var79.ay_fld.ek(var3);
						xi.vy(var79.ay_fld, lu.nf_fld);
						client.appletStub.az(var79);
					}
				}

				if (var17 == 1002) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					jm var54 = gi.ak(jb.cf_fld, client.appletStub.av_fld);
					var54.ay_fld.ba(var3);
					client.appletStub.az(var54);
				}

				if (15 == var17) {
					if (var25 <= 879250526) {
						return;
					}

					cv var55 = (cv)var30.ae(var3);
					if (null != var55) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var80 = gi.ak(jb.am_fld, client.appletStub.av_fld);
						var80.ay_fld.ca(var3);
						var80.ay_fld.cp(av.nj_fld);
						var80.ay_fld.ba(client.ny_fld);
						var80.ay_fld.cx(client.ej_fld.as(82) ? 1 : 0);
						xi.vy(var80.ay_fld, client.nn_fld);
						client.appletStub.az(var80);
					}
				}

				if (var17 == 66) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var56 = gi.ak(jb.dw_fld, client.appletStub.av_fld);
					var56.ay_fld.ek(var3);
					var56.ay_fld.ea(client.ej_fld.as(82) ? 1 : 0);
					client.appletStub.az(var56);
				}

				if (var17 == 67) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var57 = gi.ak(jb.dl_fld, client.appletStub.av_fld);
					var57.ay_fld.bq(client.ej_fld.as(82) ? 1 : 0);
					xi.vy(var57.ay_fld, var3);
					client.appletStub.az(var57);
				}

				if (var17 == 45) {
					cv var58 = (cv)var30.ae(var3);
					if (null != var58) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var81 = gi.ak(jb.bf_fld, client.appletStub.av_fld);
						var81.ay_fld.cx(client.ej_fld.as(82) ? 1 : 0);
						var81.ay_fld.ca(var3);
						client.appletStub.az(var81);
					}
				}

				if (var17 == 1013) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					jm var59 = gi.ak(jb.bm_fld, client.appletStub.av_fld);
					var59.ay_fld.ba(var3);
					client.appletStub.az(var59);
				}

				jh.fp(var0, var1, var17, var3, var8, var9, var27, var28, -896814510);
				if (50 == var17) {
					cv var60 = (cv)var30.ae(var3);
					if (null != var60) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var82 = gi.ak(jb.bp_fld, client.appletStub.av_fld);
						var82.ay_fld.cx(client.ej_fld.as(82) ? 1 : 0);
						var82.ay_fld.ba(var3);
						client.appletStub.az(var82);
					}
				}

				if (var17 == 44) {
					cv var61 = (cv)var30.ae(var3);
					if (null != var61) {
						client.ml_fld = var8;
						client.mw_fld = var9;
						client.mp_fld = -652374910;
						client.mn_fld = 0;
						client.oq_fld = var0;
						client.or_fld = var1;
						jm var83 = gi.ak(jb.ca_fld, client.appletStub.av_fld);
						xj var94 = var83.ay_fld;
						byte var98;
						if (client.ej_fld.as(82)) {
							if (var25 <= 879250526) {
								return;
							}

							var98 = 1;
						} else {
							var98 = 0;
						}

						var94.bq(var98);
						var83.ay_fld.ek(var3);
						client.appletStub.az(var83);
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
					jm var62 = gi.ak(jb.eb_fld, client.appletStub.av_fld);
					var62.ay_fld.et(vo.ix_fld);
					var62.ay_fld.ba(lu.nf_fld);
					xi.vy(var62.ay_fld, var3);
					var62.ay_fld.ba(var1 + var28);
					var62.ay_fld.ca(var0 + var27);
					var62.ay_fld.bq(client.ej_fld.as(82) ? 1 : 0);
					var62.ay_fld.ca(hi.iz_fld);
					client.appletStub.az(var62);
				}

				if (var17 == 2) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var63 = gi.ak(jb.di_fld, client.appletStub.av_fld);
					xi.vy(var63.ay_fld, var28 + var1);
					var63.ay_fld.ek(var27 + var0);
					xi.vy(var63.ay_fld, client.ny_fld);
					var63.ay_fld.ek(client.nn_fld);
					var63.ay_fld.cp(av.nj_fld);
					xj var95 = var63.ay_fld;
					byte var99;
					if (client.ej_fld.as(82)) {
						if (var25 <= 879250526) {
							return;
						}

						var99 = 1;
					} else {
						var99 = 0;
					}

					var95.cx(var99);
					xi.vy(var63.ay_fld, var3);
					client.appletStub.az(var63);
				}

				if (var17 == 30 && cf.cg_fld.be()) {
					jg.fk(var1, var0);
					uo.qt(cf.cg_fld, cf.cg_fld.ag(var1, var0), (byte)-41);
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
						jm var84 = gi.ak(jb.dn_fld, client.appletStub.av_fld);
						xi.vy(var84.ay_fld, client.nn_fld);
						xi.vy(var84.ay_fld, var3);
						var84.ay_fld.cp(av.nj_fld);
						xj var96 = var84.ay_fld;
						byte var100;
						if (client.ej_fld.as(82)) {
							if (var25 <= 879250526) {
								return;
							}

							var100 = 1;
						} else {
							var100 = 0;
						}

						var96.di(var100);
						var84.ay_fld.ek(client.ny_fld);
						client.appletStub.az(var84);
					}
				}

				if (var17 == 58) {
					if (var25 <= 879250526) {
						return;
					}

					lu var65 = cf.cg_fld.ag(var1, var0);
					if (var65 != null) {
						if (null != var65.fd_fld) {
							yz var85 = yb.vn(yb.mn(tu.ak(var65).av((Object[])var65.fd_fld, 1615939831).aw(var3, -1416723919), var7, 1815210262), -1479689890);
							va.ak(var85);
						}

						jm var86 = gi.ak(jb.ew_fld, client.appletStub.av_fld);
						var86.ay_fld.eb(var1);
						var86.ay_fld.ba(client.ny_fld);
						var86.ay_fld.ca(client.nn_fld);
						var86.ay_fld.dy(av.nj_fld);
						xi.vy(var86.ay_fld, var0);
						var86.ay_fld.ca(var4);
						client.appletStub.az(var86);
					}
				}

				if (17 == var17) {
					client.ml_fld = var8;
					client.mw_fld = var9;
					client.mp_fld = -652374910;
					client.mn_fld = 0;
					client.oq_fld = var0;
					client.or_fld = var1;
					jm var66 = gi.ak(jb.cj_fld, client.appletStub.av_fld);
					var66.ay_fld.bq(client.ej_fld.as(82) ? 1 : 0);
					var66.ay_fld.dy(av.nj_fld);
					var66.ay_fld.ek(client.nn_fld);
					var66.ay_fld.ek(var3);
					var66.ay_fld.ba(var0 + var27);
					var66.ay_fld.ca(var1 + var28);
					var66.ay_fld.ba(client.ny_fld);
					client.appletStub.az(var66);
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
						jm var87 = gi.ak(jb.aa_fld, client.appletStub.av_fld);
						xi.vy(var87.ay_fld, var3);
						var87.ay_fld.ca(lu.nf_fld);
						var87.ay_fld.ek(hi.iz_fld);
						xj var97 = var87.ay_fld;
						byte var101;
						if (client.ej_fld.as(82)) {
							if (var25 <= 879250526) {
								return;
							}

							var101 = 1;
						} else {
							var101 = 0;
						}

						var97.ea(var101);
						var87.ay_fld.cp(vo.ix_fld);
						client.appletStub.az(var87);
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

							jm var92 = gi.ak(jb.bi_fld, client.appletStub.av_fld);
							var92.ay_fld.eb(var1);
							client.appletStub.az(var92);
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
		descriptor = "([BB)Lyv;"
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
