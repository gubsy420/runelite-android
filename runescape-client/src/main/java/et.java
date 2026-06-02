import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("et")
public class et extends rz {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ba_fld;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Lyx;"
	)
	public static yx qj_fld;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ex_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bj_fld;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIII)Z"
	)
	static boolean am(fn var0, int var1, int var2, int var3, int var4) {
		fm var6 = fn.ff(var0, var1);
		int var7 = var2 + var6.ag_fld;
		int var8 = var3 + var6.az_fld;
		int var9 = var6.av_fld + var4;
		int var10 = var6.ae_fld;
		int var11 = var6.ah_fld;
		int var12 = var6.aw_fld;
		int var13 = se.bi_fld - var7;
		int var14 = fp.bu_fld - var8;
		int var15 = bw.bn_fld - var9;
		if (Math.abs(var13) > ki.bq_fld + var10) {
			return false;
		} else if (Math.abs(var14) > db.bg_fld + var11) {
			return false;
		} else if (Math.abs(var15) > hm.bb_fld + var12) {
			return false;
		} else if (Math.abs(hg.bw_fld * var15 - var14 * ei.ba_fld) > hm.bb_fld * var11 + db.bg_fld * var12) {
			return false;
		} else {
			return Math.abs(ei.ba_fld * var13 - kl.bc_fld * var15) > ki.bq_fld * var12 + var10 * hm.bb_fld
				? false
				: Math.abs(kl.bc_fld * var14 - hg.bw_fld * var13) <= var10 * db.bg_fld + var11 * ki.bq_fld;
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return vf(this, (rr)var1, (rr)var2, 1050017623);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return vf(this, (rr)var1, (rr)var2, 1050017623);
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(Let;Lrr;Lrr;I)I"
	)
	public static int vf(et var0, rr var1, rr var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (0 != var1.ae_fld) {
			if (var2.ae_fld == 0) {
				return var0.ak_fld ? -1 : 1;
			}
		} else if (var2.ae_fld != 0) {
			return var0.ak_fld ? 1 : -1;
		}

		return var0.as(var1, var2, 37063467);
	}

	public et(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return vf(this, (rr)var1, (rr)var2, 1050017623);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (0 != var1.ae_fld) {
			if (var2.ae_fld == 0) {
				return this.ak_fld ? -1 : 1;
			}
		} else if (var2.ae_fld != 0) {
			return this.ak_fld ? 1 : -1;
		}

		return this.as(var1, var2, 32773602);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int az(rr var1, rr var2) {
		if (0 != var1.ae_fld) {
			if (var2.ae_fld == 0) {
				return this.ak_fld ? -1 : 1;
			}
		} else if (var2.ae_fld != 0) {
			return this.ak_fld ? 1 : -1;
		}

		return this.as(var1, var2, -542554571);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void bt() {
		bc.bv(jq.pa_fld, rl.pe_fld, hr.pr_fld, (byte)47);
		mk.bi(hh.pg_fld, pr.pv_fld, -233689290);
		if (jq.pa_fld == ke.jd_fld && rl.pe_fld == cs.jy_fld && gk.jc_fld == hr.pr_fld && hu.je_fld == hh.pg_fld && ab.jx_fld == pr.pv_fld) {
			client.ke_fld = false;
			client.ki_fld = false;
			client.oe_fld = false;
			client.og_fld = false;
			fu.ol_fld = 0;
			il.of_fld = 0;
			pq.oo_fld = 0;
			hm.oa_fld = 0;
			bt.oj_fld = 0;
			sp.oc_fld = 0;
			ml.ob_fld = 0;
			ca.ot_fld = 0;
			ob.oy_fld = 0;
			eo.od_fld = 0;
			client.oi_fld = null;
			client.pq_fld = null;
			client.pc_fld = null;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void bc(int var0) throws EOFException {
		try {
			if (client.dg_fld == 0) {
				dx var1 = kl.hk();
				if (null == var1) {
					return;
				}

				Object var2 = null;
				switch (dn.ed_fld.ae_fld) {
					case 0:
						var2 = (xl)var1.au_fld.ak(client.et_fld);
						break;
					case 1:
						var2 = (xl)var1.ax_fld.ak(client.et_fld);
						break;
					case 2:
						var2 = (xl)var1.an_fld.ak(client.et_fld);
						break;
					case 3:
						int var3 = kj.ag(client.et_fld);
						int var4 = kj.az(client.et_fld);
						int var5 = kj.av(client.et_fld);
						int var6 = var4 - var1.ay_fld;
						int var7 = var5 - var1.as_fld;
						xp.mh(client.ew_fld, var3, var6, var7, (byte)-26);
						var2 = client.ew_fld;
				}

				if (null == var2) {
					return;
				}

				client.nw_fld = ((xl)var2).dp(920633349);
				client.nd_fld = ((xl)var2).dj(189745805);
				if (bw.dk_fld != var1) {
					if (var0 >= 1759064092) {
						return;
					}

					tu var20 = mf.bn(var1, ((xl)var2).dp(-145047274), ((xl)var2).dj(189745805));
					client.nw_fld = 819335889 * (int)var20.ay_fld;
					client.nd_fld = -1289807201 * (int)var20.ar_fld;
					var20.ah();
				}

				client.nx_fld = ((xl)var2).ak(-1615592074);
				if (ga.mr_fld - client.nw_fld >= -500 && ga.mr_fld - client.nw_fld <= 500 && an.mu_fld - client.nd_fld >= -500 && an.mu_fld - client.nd_fld <= 500) {
					if (client.nw_fld != ga.mr_fld) {
						ga.mr_fld = ga.mr_fld + 1909255969 * ((client.nw_fld - ga.mr_fld) / 16);
						client.sr();
					}

					if (an.mu_fld != client.nd_fld) {
						an.mu_fld = an.mu_fld + (client.nd_fld - an.mu_fld) / 16 * -1167715809;
						client.vd();
					}
				} else {
					ga.mr_fld = 1939999569 * client.nw_fld;
					client.sr();
					an.mu_fld = client.nd_fld * -1014146943;
					client.vd();
				}

				int var21 = ga.mr_fld >> 7;
				int var24 = an.mu_fld >> 7;
				int var27 = jf.dv(bw.dk_fld, ga.mr_fld, an.mu_fld, client.nx_fld);
				int var29 = 0;
				if (var21 > 3 && var24 > 3 && var21 < 100 && var24 < 100) {
					for (int var31 = var21 - 4; var31 <= var21 + 4; var31++) {
						if (var0 >= 1759064092) {
							return;
						}

						for (int var8 = var24 - 4; var8 <= 4 + var24; var8++) {
							int var9 = client.nx_fld;
							if (var9 < 3 && (bw.dk_fld.al_fld[1][var31][var8] & 2) == 2) {
								var9++;
							}

							int var10 = var27 - bw.dk_fld.af_fld[var9][var31][var8];
							if (var10 > var29) {
								var29 = var10;
							}
						}
					}
				}

				int var32 = 192 * var29;
				if (var32 > ev.ay(client.dw_fld) * 256) {
					var32 = ev.ay(client.dw_fld) * 256;
				}

				if (var32 < ev.aw(client.dw_fld) * 256) {
					var32 = ev.aw(client.dw_fld) * 256;
				}

				if (var32 > client.mc_fld) {
					client.mc_fld = client.mc_fld + (var32 - client.mc_fld) / 24 * -970994453;
					client.sy();
				} else if (var32 < client.mc_fld) {
					client.mc_fld = client.mc_fld + (var32 - client.mc_fld) / 80 * -970994453;
					client.sy();
				}

				int var33 = ((xl)var2).dp(328644018);
				int var34 = ((xl)var2).dj(189745805);
				int var11 = client.nx_fld;
				int var12 = jf.dv(var1, var33, var34, var11);
				rg var13 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
				if (var13 != null) {
					var12 += jf.dv(bw.dk_fld, var13.dp(-1420651562), var13.dj(189745805), var13.ak(-1872121867));
				}

				client.nb_fld = var12;
				xg.mo_fld = client.nb_fld - client.dy_fld;
				client.rg();
			} else if (1 == client.dg_fld) {
				int var22;
				ce.hn((byte)100);
				short var15 = -1;
				if (client.ej_fld.ay(33)) {
					var15 = 0;
				} else if (client.ej_fld.ay(49)) {
					if (var0 >= 1759064092) {
						return;
					}

					var15 = 1024;
				}

				if (client.ej_fld.ay(48)) {
					if (var15 == 0) {
						var15 = 1792;
					} else if (1024 == var15) {
						var15 = 1280;
					} else {
						var15 = 1536;
					}
				} else if (client.ej_fld.ay(50)) {
					if (var0 >= 1759064092) {
						return;
					}

					if (var15 == 0) {
						if (var0 >= 1759064092) {
							return;
						}

						var15 = 256;
					} else if (var15 == 1024) {
						var15 = 768;
					} else {
						var15 = 512;
					}
				}

				byte var18 = 0;
				if (client.ej_fld.ay(35)) {
					if (var0 >= 1759064092) {
						return;
					}

					var18 = -1;
				} else if (client.ej_fld.ay(51)) {
					var18 = 1;
				}

				label495: {
					var22 = 0;
					if (var15 < 0) {
						if (var0 >= 1759064092) {
							return;
						}

						if (0 == var18) {
							break label495;
						}
					}

					var22 = client.ej_fld.ay(81) ? client.dn_fld : client.di_fld;
					var22 *= 16;
					client.mb_fld = var15;
					client.ms_fld = var18;
				}

				if (client.mf_fld < var22) {
					if (var0 >= 1759064092) {
						return;
					}

					client.mf_fld += var22 / 8 * 1150570797;
					if (client.mf_fld > var22) {
						client.mf_fld = var22;
					}
				} else if (client.mf_fld > var22) {
					client.mf_fld /= 1854374514;
				}

				if (client.mf_fld > 0) {
					if (var0 >= 1759064092) {
						return;
					}

					int var25 = client.mf_fld / 16;
					if (client.mb_fld >= 0) {
						if (var0 >= 1759064092) {
							return;
						}

						int var16 = client.mb_fld - ab.jx_fld & 2047;
						int var28 = fc.ah_fld[var16];
						int var30 = fc.aw_fld[var16];
						ga.mr_fld += var25 * var28 / 65536 * 1909255969;
						client.sr();
						an.mu_fld += -1167715809 * (var30 * var25 / 65536);
						client.vd();
					}

					if (client.ms_fld != 0) {
						xg.mo_fld = xg.mo_fld + -1135704151 * client.ms_fld * var25;
						client.rg();
						if (xg.mo_fld > 0) {
							xg.mo_fld = 0;
							client.rg();
						}
					}
				} else {
					client.mb_fld = -497920629;
					client.ms_fld = -1738258369;
				}

				int var26 = ev.aw(client.dw_fld);
				if (var26 > client.mc_fld) {
					client.mc_fld = client.mc_fld + (var26 - client.mc_fld) / 24 * -970994453;
					client.sy();
				} else if (var26 < client.mc_fld) {
					if (var0 >= 1759064092) {
						return;
					}

					client.mc_fld = client.mc_fld + (var26 - client.mc_fld) / 80 * -970994453;
					client.sy();
				}

				if (client.ej_fld.ay(13)) {
					client.aq_fld.az(gi.ak(jb.dq_fld, client.aq_fld.av_fld));
					client.dg_fld = 0;
				}
			}

			if (tj.av_fld == 4 && gu.hh_fld) {
				int var17 = tj.ah_fld - client.ju_fld;
				client.jq_fld = var17 * -482602174;
				client.rn();
				client.ju_fld = -400692885 * (-1 != var17 && var17 != 1 ? (tj.ah_fld + client.ju_fld) / 2 : tj.ah_fld);
				int var19 = client.jp_fld - tj.ae_fld;
				client.jh_fld = -1527264990 * var19;
				client.jp_fld = var19 != -1 && var19 != 1 ? (tj.ae_fld + client.jp_fld) / 2 : tj.ae_fld;
			} else {
				if (client.ej_fld.ay(96)) {
					client.jh_fld = client.jh_fld + -763632495 * ((-24 - client.jh_fld) / 2);
				} else if (client.ej_fld.ay(97)) {
					client.jh_fld = client.jh_fld + (24 - client.jh_fld) / 2 * -763632495;
				} else {
					client.jh_fld /= -925320990;
				}

				if (client.ej_fld.ay(98)) {
					client.jq_fld = client.jq_fld + (12 - client.jq_fld) / 2 * 1906182561;
					client.rn();
				} else if (client.ej_fld.ay(99)) {
					client.jq_fld = client.jq_fld + 1906182561 * ((-12 - client.jq_fld) / 2);
					client.rn();
				} else {
					client.jq_fld = 1906182561 * (client.jq_fld / 2);
					client.rn();
				}

				client.ju_fld = tj.ah_fld * 1015002685;
				client.jp_fld = -1348365663 * tj.ae_fld;
			}

			client.js_fld = 814406037 * (client.jh_fld / 2 + client.js_fld & 2047);
			client.jf_fld = client.jf_fld + -1814572343 * (client.jq_fld / 2);
			client.dl();
			client.jf_fld = ji.bo(client.jf_fld);
			client.dl();
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIIIIIIII)V"
	)
	static final void ae(dx var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		gn[] var12 = var0.av_fld;
		if (var12 != null && var2 >= 0 && var2 < var12.length) {
			if (var11 >= 895882521) {
				return;
			}

			gn var13 = var12[var2];

			for (int var14 = var3; var14 < 8 + var3; var14++) {
				if (var11 >= 895882521) {
					return;
				}

				for (int var15 = var4; var15 < 8 + var4; var15++) {
					if (var13.af(var14, var15, (byte)2)) {
						var13.ar(var14, var15, 1073741824, 1115189408);
					}
				}
			}
		}

		xi var26 = new xi(var1);

		for (int var27 = 0; var27 < 4; var27++) {
			for (int var29 = 0; var29 < 64; var29++) {
				for (int var16 = 0; var16 < 64; var16++) {
					if (var5 == var27 && var29 >= var6 && var29 < 8 + var6 && var16 >= var7 && var16 < 8 + var7) {
						int var19 = var29 & 7;
						int var20 = var16 & 7;
						int var21 = var8 & 3;
						int var18;
						if (0 == var21) {
							var18 = var19;
						} else if (var21 == 1) {
							var18 = var20;
						} else if (var21 == 2) {
							var18 = 7 - var19;
						} else {
							var18 = 7 - var20;
						}

						int var22 = var18 + var3;
						int var23 = var4 + rw.ak(var29 & 7, var16 & 7, var8);
						int var24 = var9 + var3 + (var29 & 7);
						int var25 = (var16 & 7) + var4 + var10;
						ck.aw(var0, var26, var2, var22, var23, var24, var25, var8, 522078337);
					} else {
						ck.aw(var0, var26, 0, -1, -1, 0, 0, 0, 250196760);
					}
				}
			}
		}

		int var28 = var26.au_fld < var26.al_fld.length ? var26.cg() : 0;
		boolean var30 = 0 != (var28 & 1);
		if (var30) {
			for (int var31 = 0; var31 < 64; var31++) {
				for (int var17 = 0; var17 < 64; var17++) {
					bc.ay(var26, (byte)104);
				}
			}
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Let;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int fa(et var0, Object var1, Object var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return vf(var0, (rr)var1, (rr)var2, 1050017623);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;I)I"
	)
	int ak(rr var1, rr var2, int var3) {
		if (0 != var1.aw_fld) {
			if (1107825689 * var2.ah_fld == 0) {
				return this.ak_fld ? -1 : 1;
			}
		} else if (1107825689 * var2.aw_fld != 0) {
			return this.ak_fld ? 1 : -1;
		}

		return this.as(var1, var2, 37063467);
	}
}
