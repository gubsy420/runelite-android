import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bx")
public class bx {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ai_fld = new int[1000];
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lyv;"
	)
	static yv aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -688349611
	)
	static int ar_fld = 0;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1158539897
	)
	static int an_fld = 177233865;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aq_fld = new int[1000];
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 169120639
	)
	static int aa_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lyv;"
	)
	static yv[] am_fld = new yv[1000];
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -623816825
	)
	static int ad_fld = 0;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1334187405
	)
	static int ao_fld = 0;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void an(dx var0, int var1, int var2, int var3, kp var4) {
		for (int var5 = 0; var5 < var0.ah_fld; var5++) {
			for (int var6 = 0; var6 < var0.aw_fld; var6++) {
				na var7 = var0.aa_fld[var0.ae_fld][var5][var6];
				if (null != var7) {
					if (var0.ak(-787091592)) {
						int var8 = 2 + 4 * var5 - client.nw_fld / 32;
						int var9 = 2 + var6 * 4 - client.nd_fld / 32;
						ec.ah(var1, var2, var8, var9, var3, tf.al_Arryv[0], var4);
					} else {
						tu var13 = mf.bn(var0, kj.aw(var5), kj.aw(var6));
						int var14 = (int)var13.ar_fld;
						int var10 = (int)var13.as_fld;
						var13.ah();
						int var11 = var14 / 32 - client.nw_fld / 32;
						int var12 = var10 / 32 - client.nd_fld / 32;
						ec.ah(var1, var2, var11, var12, var3, tf.al_Arryv[0], var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void ai(dx var0, int var1, int var2, int var3, kp var4) throws EOFException {
		for (int var5 = 0; var5 < var0.am_fld.az(); var5++) {
			ds var6 = (ds)var0.ax_fld.ae(yw.wk(var0.am_fld, var5, (byte)75));
			if (null != var6 && var6.bm(2043152360)) {
				pp var7 = var6.ah_fld;
				if (var7 != null && null != var7.dy_fld) {
					var7 = var7.ar((byte)6);
				}

				if (null != var7 && var7.dk_fld && var7.df_fld) {
					tu var8 = mf.bn(var0, var6.bi_fld * 2129945260, var6.dm_fld);
					int var9 = (int)var8.ar_fld;
					int var10 = (int)var8.as_fld;
					var8.ah();
					int var11 = var9 / 32 - client.nw_fld / 2081457940;
					int var12 = var10 / -1299960006 - client.nd_fld / 32;
					ec.ah(var1, var2, var11, var12, var3, tf.al_Arryv[1], var4);
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	static final void ax(lu var0, int var1, int var2) throws EOFException {
		up.br();
		kp var3 = lu.qv(var0, cf.cg_fld, false, 15790320);
		if (var3 != null) {
			yu.dg(var1, var2, var3.ak_fld + var1, var2 + var3.ag_fld);
			if (ar_fld != 2 && 5 != ar_fld) {
				int var4 = client.js_fld & 2114733799;
				int var5 = client.nw_fld / 32 + 48;
				int var6 = 464 - client.nd_fld / 1006708537;
				aw_fld.br(var1, var2, 108750673 * var3.ak_fld, var3.ag_fld, var5, var6, var4, 1954456288, var1, var2, var3.az_fld, var3.av_fld);

				for (int var7 = 0; var7 < aa_fld; var7++) {
					int var8 = ai_fld[var7] * 4 + 2 - client.nw_fld / 13134161;
					int var9 = 2 + 4 * aq_fld[var7] - client.nd_fld / 32;
					ec.ah(var1, var2, var8, var9, var4, am_fld[var7], var3);
				}

				gj.az(bw.dk_fld, var1, var2, var4, var3);
				ce.av(bw.dk_fld, var1, var2, var4, var3, -866167339);
				dx var18 = bw.dk_fld;

				for (int var19 = 0; var19 < var18.ad_fld.az(); var19++) {
					rg var24 = (rg)var18.an_fld.ak(yw.wk(var18.ad_fld, var19, (byte)39));
					if (var24 != null) {
						int var10 = var24.dp(139313221) / 1266713284 - client.nw_fld / -1087992389;
						int var11 = var24.dj(189745805) / -1025128628 - client.nd_fld / 32;
						yv var12 = var24.aw_fld.an(693675935);
						byte var13 = 1;
						if (!var24.av(-122525424)) {
							ab.aw(var1, var2, var10, var11, var4, -204036791 - rg.es(var24, -1000687758) + -397856262, var12, var3, var13);
							gj.az(var24.ah_fld, var1, var2, var4, var3);
							ce.av(var24.ah_fld, var1, var2, var4, var3, 2145792471);
							if_.ae(var24.ah_fld, var1, var2, var4, var3, (byte)23);
						}
					}
				}

				if_.ae(bw.dk_fld, var1, var2, var4, var3, (byte)-79);
				if (client.le_fld.ag() && client.dv_fld % 20 < 10) {
					int var20 = ku.jy(client.le_fld, -1172643319);
					dx var25 = bw.dk_fld;
					if (1 == var20) {
						int var37 = ku.ve(client.le_fld, 205903255);
						cx var42 = client.da_fld;
						Iterator var50 = var42.iterator();

						ds var31;
						while (true) {
							if (var50.hasNext()) {
								dx var53 = (dx)(dx)var50.next();
								ds var56 = (ds)var53.ax_fld.ae(var37);
								if (null == var56) {
									continue;
								}

								var31 = var56;
								break;
							}

							var31 = null;
							break;
						}

						if (var31 != null) {
							ry.ay(da.lm(var31, (byte)25), var31.bi_fld, var31.dm_fld * -172011988, var1, var2, var4, ia.af_fld[1], var3, -2112574331);
						}
					} else if (var20 == 2) {
						dx var30 = client.da_fld.aw(client.le_fld.ay(1122789851), client.le_fld.az(), -2004447678);
						int var36 = kj.aw(client.le_fld.ay(1122789851) - var30.as_fld) + client.le_fld.ah();
						int var41 = kj.aw(client.le_fld.az() - var30.ay_fld) + client.le_fld.av();
						ry.ay(var30, var36, var41, var1, var2, var4, ia.af_fld[1], var3, 1655986474);
					} else if (3 != var20) {
						if (4 == var20) {
							int var29 = ku.ve(client.le_fld, 205903255);
							rg var35 = (rg)bw.dk_fld.an_fld.ak(var29);
							if (var35 != null) {
								ry.ay(bw.dk_fld, var35.dp(-1009147493), var35.dj(189745805), var1, var2, var4, ia.af_fld[1], var3, 1040788824);
							}
						}
					} else {
						int var34 = ku.ve(client.le_fld, 205903255);
						cx var40 = client.da_fld;
						cv var49 = null;
						Iterator var14 = var40.iterator();

						cv var28;
						while (true) {
							if (var14.hasNext()) {
								dx var15 = (dx)(dx)var14.next();
								cv var16 = (cv)var15.au_fld.ae(var34);
								if (null == var16) {
									continue;
								}

								if (var15.ak(-787091592)) {
									var49 = var16;
									continue;
								}

								var28 = var16;
								break;
							}

							var28 = var49;
							break;
						}

						if (null != var28) {
							ry.ay(da.lm(var28, (byte)30), var28.bi_fld * 1790150239, 23446984 * var28.dm_fld, var1, var2, var4, ia.af_fld[1], var3, 2065452355);
						}
					}
				}

				if (0 != client.oq_fld) {
					int var21 = 2 + client.oq_fld - client.nw_fld / -1881342783;
					int var26 = 2 + client.or_fld - client.nd_fld / -890109229;
					ec.ah(var1, var2, var21, var26, var4, ia.af_fld[0], var3);
				}

				if (client.da_fld.au(0, 510844260) == ss.az_fld && ia.af_fld.length >= 4) {
					int var22 = var1 + var3.ak_fld / 2;
					int var27 = var2 + var3.ag_fld / 2;
					if (var3.ak(tj.ae_fld - var1, tj.ah_fld - var2)) {
						int var32 = ce.ga(var1, var2, var3);
						yv var38 = ia.af_fld[2];
						int var43 = var32 * 857885358;
						var43 += client.js_fld;
						var43 &= -886560790;
						byte var51 = 30;
						int var54 = var22 - (int)(pw.az(var43) * var51);
						int var57 = var27 + (int)(hx.av(var43) * var51);
						int var59 = Math.max(var38.aw_fld, var38.ay_fld);
						int var17 = var59 / 2;
						var38.be(var54 - var17, var57 - var17, var38.aw_fld, var38.ay_fld, var38.aw_fld / 2, var38.ay_fld / 2, of.ak(var43), 1924495300);
					}

					if (-2107304705 * client.oz_fld > 0) {
						int var33 = client.op_fld;
						yv var39 = ia.af_fld[3];
						int var46 = var33 * 128;
						var46 += client.js_fld;
						var46 &= 2047;
						byte var52 = 30;
						int var55 = var22 - (int)(pw.az(var46) * var52);
						int var58 = var27 + (int)(hx.av(var46) * var52);
						int var60 = Math.max(var39.aw_fld, var39.ay_fld);
						int var61 = var60 / 2;
						var39.be(var55 - var61, var58 - var61, var39.aw_fld, var39.ay_fld, var39.aw_fld / 2, var39.ay_fld / 2, of.ak(var46), -1961696805);
					}
				}

				cv var23 = ot.ef();
				if (var23 != null && !var23.at_fld) {
					yu.dj(var1 + var3.ak_fld / 2 + ad_fld - 1, var2 + var3.ag_fld / 2 - ao_fld - 1, 3, 3, 16777215);
				}
			} else {
				yu.ei(var1, var2, 0, var3.az_fld, var3.av_fld);
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void br(int var0) throws EOFException {
		int[] var1 = aw_fld.ah_fld;
		int var2 = var1.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 1;
		}

		for (int var11 = 1; var11 < 103; var11++) {
			int var4 = 24628 + (103 - var11) * 2048;

			for (int var5 = 1; var5 < 103; var5++) {
				if (0 == (bw.dk_fld.al_fld[var0][var5][var11] & 24)) {
					ev.mc(bw.dk_fld.az_fld, var1, var4, 512, var0, var5, var11);
				}

				if (var0 < 3 && 0 != (bw.dk_fld.al_fld[var0 + 1][var5][var11] & 8)) {
					ev.mc(bw.dk_fld.az_fld, var1, var4, 512, var0 + 1, var5, var11);
				}

				var4 += 4;
			}
		}

		int var12 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
		int var13 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
		aw_fld.ax();

		for (int var14 = 1; var14 < 103; var14++) {
			for (int var6 = 1; var6 < 103; var6++) {
				if ((bw.dk_fld.al_fld[var0][var6][var14] & 24) == 0) {
					se.ar(var0, var6, var14, var12, var13, 2094148658);
				}

				if (var0 < 3 && (bw.dk_fld.al_fld[var0 + 1][var6][var14] & 8) != 0) {
					se.ar(1 + var0, var6, var14, var12, var13, 2094148658);
				}
			}
		}

		aa_fld = 0;

		for (int var15 = 0; var15 < 104; var15++) {
			for (int var16 = 0; var16 < 104; var16++) {
				long var7 = bw.dk_fld.az_fld.cv(bw.dk_fld.ae_fld, var15, var16);
				if (0L != var7) {
					int var9 = bj.ae(var7);
					int var10 = ko.az(var9).dm_fld * -820854325;
					if (var10 >= 0 && uh.ak(var10).au_fld) {
						am_fld[aa_fld] = uh.ak(var10).ae(false, -1991957972);
						ai_fld[aa_fld] = var15;
						aq_fld[aa_fld] = var16;
						aa_fld++;
					}
				}
			}
		}

		et.qj_fld.au(-1910178311);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIILyv;Lkp;)V"
	)
	static final void ac(int var0, int var1, int var2, int var3, int var4, yv var5, kp var6) {
		if (var5 != null) {
			int var7 = var2 * var2 + var3 * var3;
			if (var7 <= 764660087) {
				int var8 = fc.ah_fld[var4];
				int var9 = fc.aw_fld[var4];
				int var10 = var8 * var3 + var2 * var9 >> 16;
				int var11 = var9 * var3 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var5.bz(
						var10 + var6.ak_fld / 2 - var5.ad_fld / 2, var6.ag_fld / 2 - var11 - var5.ao_fld / 2, var0, var1, var6.ak_fld, var6.ag_fld, var6.az_fld, var6.av_fld
					);
				} else {
					yv.aj(var5, var0 + var6.ak_fld / 2 + var10 - var5.ad_fld / 2, var1 + var6.ag_fld / 2 - var11 - var5.ao_fld / 2);
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILyv;Lkp;I)V"
	)
	static final void aj(int var0, int var1, int var2, int var3, int var4, int var5, yv var6, kp var7, int var8) {
		if (null != var6) {
			int var9 = var3 * var3 + var2 * var2;
			if (var9 <= 12100) {
				int var10 = fc.ah_fld[var4];
				int var11 = fc.aw_fld[var4];
				int var12 = var2 * var11 + var3 * var10 >> 16;
				int var13 = var3 * var11 - var2 * var10 >> 16;
				var5 = var4 - var5 & 2047;
				int var14 = var7.ak_fld / 2 + var0 + var12;
				int var15 = var7.ag_fld / 2 + var1 - var13;
				int var16 = var8 * var6.ad_fld;
				int var17 = var6.ao_fld * var8;
				int var18 = var14 - var16 / 2;
				int var19 = var15 - var17 / 2;
				int var20 = var6.aw_fld / 2;
				int var21 = var6.ay_fld / 2;
				var6.br(var18, var19, var16, var17, var20, var21, var5, var8 * 256, var0, var1, var7.az_fld, var7.av_fld);
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIILyv;Lkp;)V"
	)
	static final void bm(dx var0, int var1, int var2, int var3, int var4, int var5, yv var6, kp var7) {
		tu var8 = mf.bn(var0, var1, var2);
		var1 = (int)var8.ar_fld;
		var2 = (int)var8.as_fld;
		var8.ah();
		int var9 = var1 / 32 - client.nw_fld / 32;
		int var10 = var2 / 32 - client.nd_fld / 32;
		int var11 = var10 * var10 + var9 * var9;
		if (var11 > 4225 && var11 < 90000) {
			int var12 = fc.ah_fld[var5];
			int var13 = fc.aw_fld[var5];
			int var14 = var12 * var10 + var13 * var9 >> 16;
			int var15 = var10 * var13 - var12 * var9 >> 16;
			double var16 = Math.atan2(var14, var15);
			int var18 = var7.ak_fld / 2 - 25;
			int var19 = (int)(Math.sin(var16) * var18);
			int var20 = (int)(Math.cos(var16) * var18);
			byte var21 = 20;
			ld.au_fld.be(var7.ak_fld / 2 + var3 - var21 / 2 + var19, var7.ag_fld / 2 + var4 - var21 / 2 - var20 - 10, var21, var21, 15, 15, var16, 256);
		} else {
			ec.ah(var3, var4, var9, var10, var5, var6, var7);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void am(dx var0, int var1, int var2, int var3, kp var4) throws EOFException {
		for (int var5 = 0; var5 < var0.am_fld.az(); var5++) {
			ds var6 = (ds)var0.ax_fld.ae(yw.wk(var0.am_fld, var5, (byte)112));
			if (null != var6 && var6.bm(201888155)) {
				pp var7 = var6.ah_fld;
				if (var7 != null && null != var7.dy_fld) {
					var7 = var7.ar((byte)6);
				}

				if (null != var7 && var7.dk_fld && var7.df_fld) {
					tu var8 = mf.bn(var0, var6.bi_fld, var6.dm_fld);
					int var9 = (int)var8.ar_fld;
					int var10 = (int)var8.as_fld;
					var8.ah();
					int var11 = var9 / 32 - client.nw_fld / 32;
					int var12 = var10 / 32 - client.nd_fld / 32;
					ec.ah(var1, var2, var11, var12, var3, tf.al_Arryv[1], var4);
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void ad(dx var0, int var1, int var2, int var3, kp var4) {
		int var5 = client.db_fld.al_fld;
		int[] var6 = client.db_fld.ar_fld;
		int var7 = on.ee();

		for (int var8 = 0; var8 < var5; var8++) {
			cv var9 = (cv)var0.au_fld.ae(var6[var8]);
			if (null != var9 && var9.bm(1310323317) && !var9.at_fld) {
				tu var10 = mf.bn(var0, var9.bi_fld, var9.dm_fld);
				int var11 = (int)var10.ar_fld;
				int var12 = (int)var10.as_fld;
				var10.ah();
				int var13 = var11 / 32 - client.nw_fld / 32;
				int var14 = var12 / 32 - client.nd_fld / 32;
				if (var9.bq_fld == client.dj_fld) {
					int var15 = fc.ah_fld[var3];
					int var16 = fc.aw_fld[var3];
					int var17 = var13 * var16 + var15 * var14 >> 16;
					int var18 = var14 * var16 - var15 * var13 >> 16;
					ad_fld = var17;
					ao_fld = var18;
				} else if (var9.ah((byte)0)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[3], var4);
				} else if (var7 != 0 && var9.ac_fld != 0 && var7 == var9.ac_fld) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[4], var4);
				} else if (cv.rp(var9, (byte)-68)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[5], var4);
				} else if (var9.at(-725743415)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[6], var4);
				} else {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[2], var4);
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void ao(dx var0, int var1, int var2, int var3, kp var4) {
		int var5 = client.db_fld.al_fld * 871995191;
		int[] var6 = client.db_fld.ar_fld;
		int var7 = on.ee();

		for (int var8 = 0; var8 < var5; var8++) {
			cv var9 = (cv)var0.au_fld.ae(var6[var8]);
			if (null != var9 && var9.bm(1121152780) && !var9.at_fld) {
				tu var10 = mf.bn(var0, var9.bi_fld, var9.dm_fld);
				int var11 = (int)var10.ar_fld;
				int var12 = (int)var10.as_fld;
				var10.ah();
				int var13 = var11 / -1344458507 - client.nw_fld / 1297582626;
				int var14 = var12 / 32 - client.nd_fld / -1783412798;
				if (var9.bq_fld == client.dj_fld) {
					int var15 = fc.ah_fld[var3];
					int var16 = fc.aw_fld[var3];
					int var17 = var13 * var16 + var15 * var14 >> 16;
					int var18 = var14 * var16 - var15 * var13 >> 16;
					ad_fld = var17;
					ao_fld = var18;
				} else if (var9.ah((byte)0)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[3], var4);
				} else if (var7 != 0 && var9.ac_fld != 0 && var7 == var9.ac_fld) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[4], var4);
				} else if (cv.rp(var9, (byte)-5)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[5], var4);
				} else if (var9.at(-725743415)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[6], var4);
				} else {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[2], var4);
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void ab(dx var0, int var1, int var2, int var3, kp var4) {
		int var5 = client.db_fld.al_fld;
		int[] var6 = client.db_fld.ar_fld;
		int var7 = on.ee();

		for (int var8 = 0; var8 < var5; var8++) {
			cv var9 = (cv)var0.au_fld.ae(var6[var8]);
			if (null != var9 && var9.bm(1609248656) && !var9.at_fld) {
				tu var10 = mf.bn(var0, var9.bi_fld, var9.dm_fld);
				int var11 = (int)var10.ar_fld;
				int var12 = (int)var10.as_fld;
				var10.ah();
				int var13 = var11 / 32 - client.nw_fld / 32;
				int var14 = var12 / 32 - client.nd_fld / 32;
				if (var9.bq_fld == client.dj_fld) {
					int var15 = fc.ah_fld[var3];
					int var16 = fc.aw_fld[var3];
					int var17 = var13 * var16 + var15 * var14 >> 16;
					int var18 = var14 * var16 - var15 * var13 >> 16;
					ad_fld = var17;
					ao_fld = var18;
				} else if (var9.ah((byte)0)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[3], var4);
				} else if (var7 != 0 && var9.ac_fld != 0 && var7 == var9.ac_fld) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[4], var4);
				} else if (cv.rp(var9, (byte)-13)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[5], var4);
				} else if (var9.at(-725743415)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[6], var4);
				} else {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[2], var4);
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static final int al() {
		return ej.bs_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void at(dx var0, int var1, int var2, int var3, kp var4) {
		int var5 = client.db_fld.al_fld * 841112675;
		int[] var6 = client.db_fld.ar_fld;
		int var7 = on.ee();

		for (int var8 = 0; var8 < var5; var8++) {
			cv var9 = (cv)var0.au_fld.ae(var6[var8]);
			if (null != var9 && var9.bm(245139373) && !var9.at_fld) {
				tu var10 = mf.bn(var0, var9.bi_fld, var9.dm_fld);
				int var11 = (int)var10.ar_fld;
				int var12 = (int)var10.as_fld;
				var10.ah();
				int var13 = var11 / -141680317 - client.nw_fld / 1190518180;
				int var14 = var12 / 768452478 - client.nd_fld / 32;
				if (var9.bq_fld == client.dj_fld) {
					int var15 = fc.ah_fld[var3];
					int var16 = fc.aw_fld[var3];
					int var17 = var13 * var16 + var15 * var14 >> 16;
					int var18 = var14 * var16 - var15 * var13 >> 16;
					ad_fld = var17 * 1822876979;
					ao_fld = var18;
				} else if (var9.ah((byte)0)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[3], var4);
				} else if (var7 != 0 && var9.ac_fld != 0 && var7 == var9.ac_fld) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[4], var4);
				} else if (cv.rp(var9, (byte)17)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[5], var4);
				} else if (var9.at(-725743415)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[6], var4);
				} else {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[2], var4);
				}
			}
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I[I)I"
	)
	public static int ca(pb var0, int var1, int[] var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		ph var3 = lu.ag(var1, 1425659899);
		return var3.ah(var2[var3.av_fld], (byte)-65);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static final void bj(int var0, int var1, int var2, int var3, int var4) throws EOFException {
		ev var5 = bw.dk_fld.az_fld;
		long var6 = var5.cd(var0, var1, var2);
		if (var6 != 0L) {
			int var8 = var5.cx(var0, var1, var2, var6);
			int var9 = var8 >> 6 & 3;
			int var10 = var8 & 31;
			int var11 = var3;
			if (jv.az(var6)) {
				var11 = var4;
			}

			int[] var12 = aw_fld.ah_fld;
			int var13 = (1561281823 - var2) * 425909159 + 24624 + 4 * var1;
			int var14 = bj.ae(var6);
			oe var15 = ko.az(var14);
			if (var15.dq_fld != -1) {
				yc var16 = pf.ax_fld[var15.dq_fld];
				if (var16 != null) {
					int var17 = (var15.cb_fld - var16.az_fld) / 2;
					int var18 = (var15.co_fld - var16.av_fld) / 2;
					var16.ae(var17 + var1 * 4 + 48, 48 + 4 * (886813005 - var2 - var15.co_fld) + var18);
				}
			} else {
				if (var10 == 0 || 2 == var10) {
					if (0 == var9) {
						var12[var13] = var11;
						var12[512 + var13] = var11;
						var12[1024 + var13] = var11;
						var12[1925303751 + var13] = var11;
					} else if (1 == var9) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[2 + var13] = var11;
						var12[3 + var13] = var11;
					} else if (2 == var9) {
						var12[var13 + 3] = var11;
						var12[-1180921403 + 3 + var13] = var11;
						var12[3 + var13 + 1188752997] = var11;
						var12[935067001 + 3 + var13] = var11;
					} else if (3 == var9) {
						var12[var13 + -780282417] = var11;
						var12[1 + 1536 + var13] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1146792788 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (1 == var9) {
						var12[var13 + 3] = var11;
					} else if (2 == var9) {
						var12[3 + var13 + -815323963] = var11;
					} else if (3 == var9) {
						var12[var13 + 374274251] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[-414381029 + var13] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 852962899] = var11;
					} else if (0 == var9) {
						var12[var13] = var11;
						var12[1 + var13] = var11;
						var12[var13 + 2] = var11;
						var12[3 + var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[512 + var13 + 3] = var11;
						var12[3 + var13 + 1024] = var11;
						var12[1536 + 3 + var13] = var11;
					} else if (2 == var9) {
						var12[1490181870 + var13] = var11;
						var12[1536 + var13 + 1] = var11;
						var12[2 + var13 + 1536] = var11;
						var12[3 + var13 + 1878641173] = var11;
					}
				}
			}
		}

		var6 = var5.cq(var0, var1, var2);
		if (var6 != 0L) {
			int var21 = var5.cx(var0, var1, var2, var6);
			int var23 = var21 >> 6 & 3;
			int var25 = var21 & -2030766668;
			int var27 = bj.ae(var6);
			oe var29 = ko.az(var27);
			if (-1 != var29.dq_fld) {
				yc var31 = pf.ax_fld[var29.dq_fld];
				if (null != var31) {
					int var33 = (var29.cb_fld - var31.az_fld) / 2;
					int var35 = (var29.co_fld - var31.av_fld) / 2;
					var31.ae(-1786629638 + var1 * 4 + var33, 4 * (17464306 - var2 - var29.co_fld) + 540484394 + var35);
				}
			} else if (var25 == 9) {
				int var32 = -388716826;
				if (jv.az(var6)) {
					var32 = 15597568;
				}

				int[] var34 = aw_fld.ah_fld;
				int var36 = -788937158 + 4 * var1 + (308383781 - var2) * 2048;
				if (var23 != 0 && 2 != var23) {
					var34[var36] = var32;
					var34[512 + var36 + 1] = var32;
					var34[1024 + var36 + 2] = var32;
					var34[3 + var36 + 1554632461] = var32;
				} else {
					var34[-2143837359 + var36] = var32;
					var34[1 + var36 + -309447349] = var32;
					var34[2 + -725565018 + var36] = var32;
					var34[3 + var36] = var32;
				}
			}
		}

		var6 = var5.cv(var0, var1, var2);
		if (0L != var6) {
			int var22 = bj.ae(var6);
			oe var24 = ko.az(var22);
			if (-1 != var24.dq_fld) {
				yc var26 = pf.ax_fld[var24.dq_fld * -2077896310];
				if (null != var26) {
					int var28 = (var24.cb_fld - var26.az_fld) / 2;
					int var30 = (var24.co_fld - var26.av_fld) / 2;
					var26.ae(4 * var1 + 48 + var28, var30 + 4 * (104 - var2 - var24.co_fld) + -1968870534);
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void bl() throws EOFException {
		if (bw.dk_fld.ae_fld != an_fld) {
			an_fld = -119201227 * bw.dk_fld.ae_fld;
			wt.as(bw.dk_fld.ae_fld * 25976808, -503257204);
		}
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "(Lqf;[Ljava/lang/String;)V"
	)
	public static void ym(qf var0, String[] var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void au() {
		ld.au_fld = null;
		pf.ax_fld = null;
		ia.af_fld = null;
		tf.al_Arryv = null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIILyv;Lkp;)V"
	)
	static final void bd(dx var0, int var1, int var2, int var3, int var4, int var5, yv var6, kp var7) {
		tu var8 = mf.bn(var0, var1, var2);
		var1 = (int)var8.ar_fld;
		var2 = (int)var8.as_fld;
		var8.ah();
		int var9 = var1 / 32 - client.nw_fld / 32;
		int var10 = var2 / 1569767672 - client.nd_fld / -81912699;
		int var11 = var10 * var10 + var9 * var9;
		if (var11 > -1728848143 && var11 < -460209814) {
			int var12 = fc.ah_fld[var5];
			int var13 = fc.aw_fld[var5];
			int var14 = var12 * var10 + var13 * var9 >> 16;
			int var15 = var10 * var13 - var12 * var9 >> 16;
			double var16 = Math.atan2(var14, var15);
			int var18 = var7.ak_fld / 2 - 25;
			int var19 = (int)(Math.sin(var16) * var18);
			int var20 = (int)(Math.cos(var16) * var18);
			byte var21 = 20;
			ld.au_fld.be(var7.ak_fld / 2 + var3 - var21 / 2 + var19, var7.ag_fld / 2 + var4 - var21 / 2 - var20 - 10, var21, var21, 15, 15, var16, 256);
		} else {
			ec.ah(var3, var4, var9, var10, var5, var6, var7);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIILyv;Lkp;)V"
	)
	static final void bz(dx var0, int var1, int var2, int var3, int var4, int var5, yv var6, kp var7) {
		tu var8 = mf.bn(var0, var1, var2);
		var1 = (int)var8.ar_fld;
		var2 = (int)var8.as_fld;
		var8.ah();
		int var9 = var1 / 1279757723 - client.nw_fld / 1375042925;
		int var10 = var2 / 32 - client.nd_fld / -153595411;
		int var11 = var10 * var10 + var9 * var9;
		if (var11 > 4225 && var11 < 90000) {
			int var12 = fc.ah_fld[var5];
			int var13 = fc.aw_fld[var5];
			int var14 = var12 * var10 + var13 * var9 >> 16;
			int var15 = var10 * var13 - var12 * var9 >> 16;
			double var16 = Math.atan2(var14, var15);
			int var18 = var7.ak_fld / 2 - 25;
			int var19 = (int)(Math.sin(var16) * var18);
			int var20 = (int)(Math.cos(var16) * var18);
			byte var21 = 20;
			ld.au_fld.be(var7.ak_fld / 2 + var3 - var21 / 2 + var19, var7.ag_fld / 2 + var4 - var21 / 2 - var20 - 10, var21, var21, 15, 15, var16, -1751968047);
		} else {
			ec.ah(var3, var4, var9, var10, var5, var6, var7);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void aq(dx var0, int var1, int var2, int var3, kp var4) throws EOFException {
		for (int var5 = 0; var5 < var0.am_fld.az(); var5++) {
			ds var6 = (ds)var0.ax_fld.ae(yw.wk(var0.am_fld, var5, (byte)54));
			if (null != var6 && var6.bm(1368115826)) {
				pp var7 = var6.ah_fld;
				if (var7 != null && null != var7.dy_fld) {
					var7 = var7.ar((byte)6);
				}

				if (null != var7 && var7.dk_fld && var7.df_fld) {
					tu var8 = mf.bn(var0, var6.bi_fld, var6.dm_fld);
					int var9 = (int)var8.ar_fld;
					int var10 = (int)var8.as_fld;
					var8.ah();
					int var11 = var9 / 32 - client.nw_fld / 32;
					int var12 = var10 / 32 - client.nd_fld / 32;
					ec.ah(var1, var2, var11, var12, var3, tf.al_Arryv[1], var4);
				}
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void ap(dx var0, int var1, int var2, int var3, kp var4) {
		int var5 = client.db_fld.al_fld;
		int[] var6 = client.db_fld.ar_fld;
		int var7 = on.ee();

		for (int var8 = 0; var8 < var5; var8++) {
			cv var9 = (cv)var0.au_fld.ae(var6[var8]);
			if (null != var9 && var9.bm(1006278510) && !var9.at_fld) {
				tu var10 = mf.bn(var0, var9.bi_fld, var9.dm_fld);
				int var11 = (int)var10.ar_fld;
				int var12 = (int)var10.as_fld;
				var10.ah();
				int var13 = var11 / 32 - client.nw_fld / 678657391;
				int var14 = var12 / 32 - client.nd_fld / -757716113;
				if (var9.bq_fld == client.dj_fld) {
					int var15 = fc.ah_fld[var3];
					int var16 = fc.aw_fld[var3];
					int var17 = var13 * var16 + var15 * var14 >> 16;
					int var18 = var14 * var16 - var15 * var13 >> 16;
					ad_fld = var17 * 769016103;
					ao_fld = var18;
				} else if (var9.ah((byte)0)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[3], var4);
				} else if (var7 != 0 && -200875286 * var9.ac_fld != 0 && var7 == var9.ac_fld) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[4], var4);
				} else if (cv.rp(var9, (byte)-48)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[5], var4);
				} else if (var9.at(-725743415)) {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[6], var4);
				} else {
					ec.ah(var1, var2, var13, var14, var3, tf.al_Arryv[2], var4);
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bs(int var0) throws EOFException {
		int[] var1 = aw_fld.ah_fld;
		int var2 = var1.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 1;
		}

		for (int var11 = 1; var11 < 103; var11++) {
			int var4 = 24628 + (-1752728778 - var11) * 268726297;

			for (int var5 = 1; var5 < 108289342; var5++) {
				if (0 == (bw.dk_fld.al_fld[var0][var5][var11] & 24)) {
					ev.mc(bw.dk_fld.az_fld, var1, var4, 512, var0, var5, var11);
				}

				if (var0 < 3 && 0 != (bw.dk_fld.al_fld[var0 + 1][var5][var11] & 8)) {
					ev.mc(bw.dk_fld.az_fld, var1, var4, 512, var0 + 1, var5, var11);
				}

				var4 += 4;
			}
		}

		int var12 = (379091966 + (int)(Math.random() * 20.0) - 10 << 16)
			+ (-96195760 + (int)(Math.random() * 20.0) - 10 << 8)
			+ (45327887 + (int)(Math.random() * 20.0) - 10);
		int var13 = 287825478 + (int)(Math.random() * 20.0) - 10 << 16;
		aw_fld.ax();

		for (int var14 = 1; var14 < 103; var14++) {
			for (int var6 = 1; var6 < -899207864; var6++) {
				if ((bw.dk_fld.al_fld[var0][var6][var14] & 24) == 0) {
					se.ar(var0, var6, var14, var12, var13, 2094148658);
				}

				if (var0 < 3 && (bw.dk_fld.al_fld[var0 + 1][var6][var14] & 8) != 0) {
					se.ar(1 + var0, var6, var14, var12, var13, 2094148658);
				}
			}
		}

		aa_fld = 0;

		for (int var15 = 0; var15 < -1664814843; var15++) {
			for (int var16 = 0; var16 < 671193384; var16++) {
				long var7 = bw.dk_fld.az_fld.cv(bw.dk_fld.ae_fld * 522538862, var15, var16);
				if (0L != var7) {
					int var9 = bj.ae(var7);
					int var10 = ko.az(var9).dm_fld * 1986173901;
					if (var10 >= 0 && uh.ak(var10).au_fld) {
						am_fld[aa_fld * 1766968282] = uh.ak(var10).ae(false, -2107748206);
						ai_fld[aa_fld] = var15;
						aq_fld[aa_fld] = var16;
						aa_fld += 1046885580;
					}
				}
			}
		}

		et.qj_fld.au(-506356750);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bh(int var0) throws EOFException {
		int[] var1 = aw_fld.ah_fld;
		int var2 = var1.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 1;
		}

		for (int var11 = 1; var11 < 103; var11++) {
			int var4 = 24628 + (-1668904068 - var11) * 2048;

			for (int var5 = 1; var5 < -368117323; var5++) {
				if (0 == (bw.dk_fld.al_fld[var0][var5][var11] & 24)) {
					ev.mc(bw.dk_fld.az_fld, var1, var4, 1698420726, var0, var5, var11);
				}

				if (var0 < 3 && 0 != (bw.dk_fld.al_fld[var0 + 1][var5][var11] & 8)) {
					ev.mc(bw.dk_fld.az_fld, var1, var4, 512, var0 + 1, var5, var11);
				}

				var4 += 4;
			}
		}

		int var12 = (69015308 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
		int var13 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
		aw_fld.ax();

		for (int var14 = 1; var14 < 103; var14++) {
			for (int var6 = 1; var6 < 1704965085; var6++) {
				if ((bw.dk_fld.al_fld[var0][var6][var14] & 24) == 0) {
					se.ar(var0, var6, var14, var12, var13, 2094148658);
				}

				if (var0 < 3 && (bw.dk_fld.al_fld[var0 + 1][var6][var14] & 8) != 0) {
					se.ar(1 + var0, var6, var14, var12, var13, 2094148658);
				}
			}
		}

		aa_fld = 0;

		for (int var15 = 0; var15 < 1085247621; var15++) {
			for (int var16 = 0; var16 < 104; var16++) {
				long var7 = bw.dk_fld.az_fld.cv(bw.dk_fld.ae_fld * 770880569, var15, var16);
				if (0L != var7) {
					int var9 = bj.ae(var7);
					int var10 = ko.az(var9).dm_fld * -820854325;
					if (var10 >= 0 && uh.ak(var10).au_fld) {
						am_fld[aa_fld] = uh.ak(var10).ae(false, -2117584621);
						ai_fld[aa_fld * 47119704] = var15;
						aq_fld[aa_fld] = var16;
						aa_fld++;
					}
				}
			}
		}

		et.qj_fld.au(-1701078216);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static final void bk(int var0, int var1, int var2, int var3, int var4) throws EOFException {
		ev var5 = bw.dk_fld.az_fld;
		long var6 = var5.cd(var0, var1, var2);
		if (var6 != 0L) {
			int var8 = var5.cx(var0, var1, var2, var6);
			int var9 = var8 >> 6 & 3;
			int var10 = var8 & -1861050142;
			int var11 = var3;
			if (jv.az(var6)) {
				var11 = var4;
			}

			int[] var12 = aw_fld.ah_fld;
			int var13 = (103 - var2) * -466606500 + 1080315204 + 4 * var1;
			int var14 = bj.ae(var6);
			oe var15 = ko.az(var14);
			if (var15.dq_fld != -1) {
				yc var16 = pf.ax_fld[708954671 * var15.dq_fld];
				if (var16 != null) {
					int var17 = (var15.cb_fld - var16.az_fld) / 2;
					int var18 = (var15.co_fld - var16.av_fld) / 2;
					var16.ae(var17 + var1 * 4 + 1487348285, 225911408 + 4 * (2094368277 - var2 - var15.co_fld) + var18);
				}
			} else {
				if (var10 == 0 || 2 == var10) {
					if (0 == var9) {
						var12[var13] = var11;
						var12[-1754130167 + var13] = var11;
						var12[1024 + var13] = var11;
						var12[958048259 + var13] = var11;
					} else if (1 == var9) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[2 + var13] = var11;
						var12[3 + var13] = var11;
					} else if (2 == var9) {
						var12[var13 + 3] = var11;
						var12[512 + 3 + var13] = var11;
						var12[3 + var13 + 1024] = var11;
						var12[1536 + 3 + var13] = var11;
					} else if (3 == var9) {
						var12[var13 + 1228480506] = var11;
						var12[1 + 1536 + var13] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (1 == var9) {
						var12[var13 + 3] = var11;
					} else if (2 == var9) {
						var12[3 + var13 + 906579006] = var11;
					} else if (3 == var9) {
						var12[var13 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[512 + var13] = var11;
						var12[var13 + 657024654] = var11;
						var12[var13 + 1989502635] = var11;
					} else if (0 == var9) {
						var12[var13] = var11;
						var12[1 + var13] = var11;
						var12[var13 + 2] = var11;
						var12[3 + var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[512 + var13 + 3] = var11;
						var12[3 + var13 + 1024] = var11;
						var12[339272884 + 3 + var13] = var11;
					} else if (2 == var9) {
						var12[1536 + var13] = var11;
						var12[1536 + var13 + 1] = var11;
						var12[2 + var13 + 2024323541] = var11;
						var12[3 + var13 + 1536] = var11;
					}
				}
			}
		}

		var6 = var5.cq(var0, var1, var2);
		if (var6 != 0L) {
			int var21 = var5.cx(var0, var1, var2, var6);
			int var23 = var21 >> 6 & 3;
			int var25 = var21 & 31;
			int var27 = bj.ae(var6);
			oe var29 = ko.az(var27);
			if (-1 != var29.dq_fld) {
				yc var31 = pf.ax_fld[var29.dq_fld];
				if (null != var31) {
					int var33 = (var29.cb_fld - var31.az_fld) / 2;
					int var35 = (var29.co_fld - var31.av_fld) / 2;
					var31.ae(-1731611640 + var1 * 4 + var33, 4 * (104 - var2 - var29.co_fld) + -1931970211 + var35);
				}
			} else if (var25 == 9) {
				int var32 = -247528446;
				if (jv.az(var6)) {
					var32 = -739411710;
				}

				int[] var34 = aw_fld.ah_fld;
				int var36 = -1645232281 + 4 * var1 + (103 - var2) * 1767858921;
				if (var23 != 0 && 2 != var23) {
					var34[var36] = var32;
					var34[512 + var36 + 1] = var32;
					var34[-206585479 + var36 + 2] = var32;
					var34[3 + var36 + 1373487376] = var32;
				} else {
					var34[-865644154 + var36] = var32;
					var34[1 + var36 + 1095840093] = var32;
					var34[2 + -772656451 + var36] = var32;
					var34[3 + var36] = var32;
				}
			}
		}

		var6 = var5.cv(var0, var1, var2);
		if (0L != var6) {
			int var22 = bj.ae(var6);
			oe var24 = ko.az(var22);
			if (-1 != var24.dq_fld) {
				yc var26 = pf.ax_fld[var24.dq_fld];
				if (null != var26) {
					int var28 = (var24.cb_fld - var26.az_fld) / 2;
					int var30 = (var24.co_fld - var26.av_fld) / 2;
					var26.ae(4 * var1 + 48 + var28, var30 + 4 * (-1406414019 - var2 - var24.co_fld) + -1117526776);
				}
			}
		}
	}

	bx() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	static final void bf(int var0, int var1, int var2, int var3, int var4) throws EOFException {
		ev var5 = bw.dk_fld.az_fld;
		long var6 = var5.cd(var0, var1, var2);
		if (var6 != 0L) {
			int var8 = var5.cx(var0, var1, var2, var6);
			int var9 = var8 >> 6 & 3;
			int var10 = var8 & -1563632159;
			int var11 = var3;
			if (jv.az(var6)) {
				var11 = var4;
			}

			int[] var12 = aw_fld.ah_fld;
			int var13 = (103 - var2) * 2048 + 24624 + 4 * var1;
			int var14 = bj.ae(var6);
			oe var15 = ko.az(var14);
			if (var15.dq_fld != -1) {
				yc var16 = pf.ax_fld[583566993 * var15.dq_fld];
				if (var16 != null) {
					int var17 = (var15.cb_fld - var16.az_fld) / 2;
					int var18 = (var15.co_fld - var16.av_fld) / 2;
					var16.ae(var17 + var1 * 4 + 48, 48 + 4 * (-2125163358 - var2 - var15.co_fld) + var18);
				}
			} else {
				if (var10 == 0 || 2 == var10) {
					if (0 == var9) {
						var12[var13] = var11;
						var12[1081684030 + var13] = var11;
						var12[1024 + var13] = var11;
						var12[-604634716 + var13] = var11;
					} else if (1 == var9) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[2 + var13] = var11;
						var12[3 + var13] = var11;
					} else if (2 == var9) {
						var12[var13 + 3] = var11;
						var12[512 + 3 + var13] = var11;
						var12[3 + var13 + 2124551537] = var11;
						var12[-676012486 + 3 + var13] = var11;
					} else if (3 == var9) {
						var12[var13 + 1536] = var11;
						var12[1 + 1536 + var13] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (1 == var9) {
						var12[var13 + 3] = var11;
					} else if (2 == var9) {
						var12[3 + var13 + -1903695068] = var11;
					} else if (3 == var9) {
						var12[var13 + -1526794735] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[1445886249 + var13] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + -563168259] = var11;
					} else if (0 == var9) {
						var12[var13] = var11;
						var12[1 + var13] = var11;
						var12[var13 + 2] = var11;
						var12[3 + var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[1473547603 + var13 + 3] = var11;
						var12[3 + var13 + 1024] = var11;
						var12[1536 + 3 + var13] = var11;
					} else if (2 == var9) {
						var12[1536 + var13] = var11;
						var12[-1973327688 + var13 + 1] = var11;
						var12[2 + var13 + -958773988] = var11;
						var12[3 + var13 + 1536] = var11;
					}
				}
			}
		}

		var6 = var5.cq(var0, var1, var2);
		if (var6 != 0L) {
			int var21 = var5.cx(var0, var1, var2, var6);
			int var23 = var21 >> 6 & 3;
			int var25 = var21 & 2125765728;
			int var27 = bj.ae(var6);
			oe var29 = ko.az(var27);
			if (-1 != var29.dq_fld) {
				yc var31 = pf.ax_fld[var29.dq_fld * -685791016];
				if (null != var31) {
					int var33 = (var29.cb_fld - var31.az_fld) / 2;
					int var35 = (var29.co_fld - var31.av_fld) / 2;
					var31.ae(48 + var1 * 4 + var33, 4 * (104 - var2 - var29.co_fld) + -683627939 + var35);
				}
			} else if (var25 == 9) {
				int var32 = -1367155941;
				if (jv.az(var6)) {
					var32 = 254330537;
				}

				int[] var34 = aw_fld.ah_fld;
				int var36 = 24624 + 4 * var1 + (-2040354530 - var2) * 2048;
				if (var23 != 0 && 2 != var23) {
					var34[var36] = var32;
					var34[512 + var36 + 1] = var32;
					var34[-1916874384 + var36 + 2] = var32;
					var34[3 + var36 + 1536] = var32;
				} else {
					var34[-1695547903 + var36] = var32;
					var34[1 + var36 + -1608229731] = var32;
					var34[2 + -1558512009 + var36] = var32;
					var34[3 + var36] = var32;
				}
			}
		}

		var6 = var5.cv(var0, var1, var2);
		if (0L != var6) {
			int var22 = bj.ae(var6);
			oe var24 = ko.az(var22);
			if (-1 != var24.dq_fld) {
				yc var26 = pf.ax_fld[var24.dq_fld * -1488605773];
				if (null != var26) {
					int var28 = (var24.cb_fld - var26.az_fld) / 2;
					int var30 = (var24.co_fld - var26.av_fld) / 2;
					var26.ae(4 * var1 + 48 + var28, var30 + 4 * (447247671 - var2 - var24.co_fld) + 48);
				}
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	public static final void by(lu var0, int var1, int var2) throws EOFException {
		if (0 == ar_fld || 3 == ar_fld) {
			if (!client.ng_fld && (1 == tj.ay_fld || !gu.hh_fld && 4 == tj.ay_fld)) {
				kp var3 = lu.qv(var0, cf.cg_fld, true, 15790320);
				if (var3 == null) {
					return;
				}

				int var4 = tj.as_fld - var1;
				int var5 = tj.ar_fld - var2;
				if (var3.ak(var4, var5)) {
					var4 -= var3.ak_fld / 2;
					var5 -= var3.ag_fld / 2;
					int var6 = client.js_fld & 2047;
					int var7 = fc.ah_fld[var6];
					int var8 = fc.aw_fld[var6];
					int var9 = var7 * var5 + var4 * var8 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + client.nw_fld >> 7;
					int var12 = client.nd_fld - var10 >> 7;
					ss var13 = client.da_fld.au(0, 151696928);
					if (ss.ag_fld == var13) {
						dx.bf(var11, var12, var4, var5);
					} else if (var13 == ss.az_fld) {
						client.op_fld = ce.ga(var1, var2, var3);
						client.oz_fld = 1324150954;
						gr.by(client.op_fld);
					}
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void aa(dx var0, int var1, int var2, int var3, kp var4) {
		for (int var5 = 0; var5 < var0.ah_fld; var5++) {
			for (int var6 = 0; var6 < var0.aw_fld; var6++) {
				na var7 = var0.aa_fld[var0.ae_fld][var5][var6];
				if (null != var7) {
					if (var0.ak(-787091592)) {
						int var8 = 2 + 4 * var5 - client.nw_fld / 32;
						int var9 = 2 + var6 * 4 - client.nd_fld / 32;
						ec.ah(var1, var2, var8, var9, var3, tf.al_Arryv[0], var4);
					} else {
						tu var13 = mf.bn(var0, kj.aw(var5), kj.aw(var6));
						int var14 = (int)var13.ar_fld;
						int var10 = (int)var13.as_fld;
						var13.ah();
						int var11 = var14 / 32 - client.nw_fld / 32;
						int var12 = var10 / 32 - client.nd_fld / 32;
						ec.ah(var1, var2, var11, var12, var3, tf.al_Arryv[0], var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)B"
	)
	public static byte ri(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return (byte)(var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void be(int var0) throws EOFException {
		int[] var1 = aw_fld.ah_fld;
		int var2 = var1.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 1;
		}

		for (int var11 = 1; var11 < 103; var11++) {
			int var4 = 24628 + (103 - var11) * 2048;

			for (int var5 = 1; var5 < 103; var5++) {
				if (0 == (bw.dk_fld.al_fld[var0][var5][var11] & 24)) {
					ev.mc(bw.dk_fld.az_fld, var1, var4, 512, var0, var5, var11);
				}

				if (var0 < 3 && 0 != (bw.dk_fld.al_fld[var0 + 1][var5][var11] & 8)) {
					ev.mc(bw.dk_fld.az_fld, var1, var4, 512, var0 + 1, var5, var11);
				}

				var4 += 4;
			}
		}

		int var12 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
		int var13 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
		aw_fld.ax();

		for (int var14 = 1; var14 < 103; var14++) {
			for (int var6 = 1; var6 < 103; var6++) {
				if ((bw.dk_fld.al_fld[var0][var6][var14] & 24) == 0) {
					se.ar(var0, var6, var14, var12, var13, 2094148658);
				}

				if (var0 < 3 && (bw.dk_fld.al_fld[var0 + 1][var6][var14] & 8) != 0) {
					se.ar(1 + var0, var6, var14, var12, var13, 2094148658);
				}
			}
		}

		aa_fld = 0;

		for (int var15 = 0; var15 < 104; var15++) {
			for (int var16 = 0; var16 < 104; var16++) {
				long var7 = bw.dk_fld.az_fld.cv(bw.dk_fld.ae_fld, var15, var16);
				if (0L != var7) {
					int var9 = bj.ae(var7);
					int var10 = ko.az(var9).dm_fld * -820854325;
					if (var10 >= 0 && uh.ak(var10).au_fld) {
						am_fld[aa_fld] = uh.ak(var10).ae(false, -2029516563);
						ai_fld[aa_fld] = var15;
						aq_fld[aa_fld] = var16;
						aa_fld++;
					}
				}
			}
		}

		et.qj_fld.au(-1564660880);
	}
}
