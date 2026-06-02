import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cf")
public class cf {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bk_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bg_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	public static uo cg_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cn_fld;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int am(int var0, int var1) {
		int var3 = var0 + var1 * 57;
		var3 = var3 << 13 ^ var3;
		int var4 = (789221 + var3 * var3 * 15731) * var3 + 1376312589 & 2147483647;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	static void aa(short var0) throws FileNotFoundException, EOFException {
		if (cy.ag_fld == client.hd_fld) {
			if (var0 > 251) {
				do_.ha_fld = ho.am(ud.ah_fld.bm_fld, false, true, true, false);
				eo.hx_fld = ho.am(ud.ay_fld.bm_fld, true, true, true, false);
				gz.hy_fld = ho.am(ud.ar_fld.bm_fld, false, true, true, false);
				by.ho_fld = ho.am(ud.al_fld.bm_fld, false, true, true, false);
				ow.ie_fld = ho.am(ud.an_fld.bm_fld, true, false, true, false);
				gl.iv_fld = ho.am(ud.aa_fld.bm_fld, false, true, true, false);
				pe.im_fld = ho.am(ud.ai_fld.bm_fld, false, true, true, false);
				pn.ia_fld = ho.am(ud.aq_fld.bm_fld, true, true, true, false);
				ea.bm(20, kh.bh_fld);
				ao.aq(cy.av_fld);
			}
		} else if (client.hd_fld == cy.av_fld) {
			byte var51 = 0;
			int var52 = var51 + uv.sl(do_.ha_fld, -860704360) * 53 / 100;
			var52 += uv.sl(eo.hx_fld, -129365693) * 5 / 100;
			var52 += uv.sl(gz.hy_fld, -717491472) * 36 / 100;
			var52 += uv.sl(by.ho_fld, 252774397) * 1 / 100;
			var52 += uv.sl(ow.ie_fld, 1052548274) * 1 / 100;
			var52 += uv.sl(gl.iv_fld, 365158655) * 2 / 100;
			var52 += uv.sl(pe.im_fld, -1748926177) * 1 / 100;
			var52 += pn.ia_fld.bc() && pn.ia_fld.cy((byte)1) ? 1 : 0;
			if (var52 != 100) {
				if (var52 != 0) {
					ea.bm(30, kh.bk_fld + var52 + "%");
				}
			} else {
				rd.al(do_.ha_fld, "Sound FX");
				rd.al(eo.hx_fld, "Music Tracks");
				rd.al(gz.hy_fld, "Sprites");
				rd.al(gl.iv_fld, "Music Samples");
				rd.al(pe.im_fld, "Music Patches");
				cz.lg_fld = new zz();
				cz.lg_fld.ak(pn.ia_fld);
				ea.bm(40, kh.bj_fld);
				ao.aq(cy.ah_fld);
			}
		} else if (cy.ah_fld == client.hd_fld) {
			if (var0 > 251) {
				dx.ak(22050, !client.gk_fld, 2);
				ArrayList var50 = new ArrayList(3);
				la var69 = fw.qz_fld;
				short var75 = 2048;
				if (ao.ar_fld == 0) {
					throw new IllegalStateException();
				} else {
					if (var75 < 512) {
						var75 = 512;
					}

					ao var64;
					try {
						ao var77 = dz.aa_fld.ak((byte)-6);
						byte var10001;
						if (jx.al_fld) {
							if (var0 <= 251) {
								return;
							}

							var10001 = 2;
						} else {
							var10001 = 1;
						}

						var77.aq_fld = new int[var10001 * 512];
						var77.ab_fld = var75;
						var77.af(828369735);
						var77.ao_fld = -693090371 * (2048 + (var75 & -2048));
						if (var77.ao_fld > 32768) {
							var77.ao_fld = 601784320;
						}

						var77.al(var77.ao_fld, -177361062);
						if (ni.ax_fld > 0 && null == if_.an_fld) {
							if_.an_fld = new ab();
							eo.au_fld = Executors.newScheduledThreadPool(1);
							eo.au_fld.scheduleAtFixedRate(if_.an_fld, 0L, 10L, TimeUnit.MILLISECONDS);
						}

						if (if_.an_fld != null) {
							if (if_.an_fld.ak_fld[0] != null) {
								if (var0 <= 251) {
									return;
								}

								throw new IllegalArgumentException();
							}

							if_.an_fld.ak_fld[0] = var77;
						}

						var64 = var77;
					} catch (Throwable var26) {
						client.qz(var26);
						var64 = new ao();
					}

					dx.on_fld = var64;
					ny.km_fld = new ar();
					ar var78 = new ar();
					var78.ax(ny.km_fld);

					for (int var80 = 0; var80 < 3; var80++) {
						ml var83 = new ml(dx.on_fld);
						var83.aa(9, 128);
						var78.ax(var83);
						var50.add(var83);
					}

					dx.on_fld.az(var78);
					uv var81 = pe.im_fld;
					uv var84 = gl.iv_fld;
					uv var85 = do_.ha_fld;
					ec.ae_fld = var81;
					mb.ah_fld = var84;
					mb.aw_fld = var85;
					mb.ag_fld = var50;
					ru.kz(client.kd_fld, do_.ha_fld, ny.km_fld, 479116823);
					ea.bm(60, kh.bf_fld);
					ao.aq(cy.aw_fld);
				}
			}
		} else if (cy.aw_fld == client.hd_fld) {
			if (var0 > 251) {
				if (ke.lq_fld == null) {
					ke.lq_fld = new xc(gz.hy_fld, ow.ie_fld);
				}

				xy[] var49 = new xy[]{xy.av_fld, xy.ae_fld, xy.az_fld, xy.ag_fld, xy.ak_fld, xy.ah_fld};
				int var63 = var49.length;
				xc var68 = ke.lq_fld;
				xy[] var74 = new xy[]{xy.av_fld, xy.ae_fld, xy.az_fld, xy.ag_fld, xy.ak_fld, xy.ah_fld};
				client.dr_fld = var68.ak(var74);
				if (client.dr_fld.size() < var63) {
					ea.bm(80, kh.by_fld + client.dr_fld.size() * 100 / var63 + "%");
				} else {
					ej.do_fld = (zf)(zf)client.dr_fld.get(xy.ak_fld);
					ls.dd_fld = (zf)(zf)client.dr_fld.get(xy.ag_fld);
					cu.dl_fld = (zf)(zf)client.dr_fld.get(xy.az_fld);
					kg.ps_fld = client.pb_fld.ak(1466214623);
					vu.en();
					ea.bm(80, kh.bl_fld);
					ao.aq(cy.ay_fld);
				}
			}
		} else if (cy.ay_fld == client.hd_fld) {
			int var48 = rz.ak(by.ho_fld, gz.hy_fld);
			int var62 = ec.ag(gz.hy_fld);
			if (var48 < var62) {
				if (var0 > 251) {
					ea.bm(90, kh.bx_fld + 100 * var48 / var62 + "%");
				}
			} else {
				ea.bm(100, kh.bo_fld);
				if (ku.dc_fld) {
					jk.af(5, (byte)3);
					ao.aq(cy.ai_fld);
				} else {
					ao.aq(cy.az_fld);
				}
			}
		} else if (client.hd_fld == cy.ai_fld) {
			jk.af(10, (byte)-60);
		} else if (cy.az_fld == client.hd_fld) {
			hi.hl_fld = ho.am(ud.ag_fld.bm_fld, false, true, true, false);
			client.hc_fld = ho.am(ud.ap_fld.bm_fld, false, true, true, true);
			zs.hw_fld = ho.am(ud.az_fld.bm_fld, false, true, true, false);
			client.hg_fld = ho.am(ud.av_fld.bm_fld, true, false, true, false);
			bu.hv_fld = ho.am(ud.ae_fld.bm_fld, false, true, true, false);
			ga.ht_fld = ho.am(ud.aw_fld.bm_fld, true, true, true, false);
			ab.hu_fld = ho.am(ud.as_fld.bm_fld, false, true, true, false);
			me.hz_fld = ho.am(ud.af_fld.bm_fld, false, true, true, false);
			ih.hm_fld = ho.am(ud.au_fld.bm_fld, false, true, true, false);
			bj.ib_fld = ho.am(ud.ax_fld.bm_fld, false, true, true, false);
			in.ip_fld = ho.am(ud.am_fld.bm_fld, false, true, true, false);
			bq.if_fld = ho.am(ud.ad_fld.bm_fld, false, true, true, false);
			py.il_fld = ho.am(ud.ao_fld.bm_fld, false, true, true, false);
			wo.iq_fld = ho.am(ud.ab_fld.bm_fld, false, true, true, false);
			int var61 = ud.at_fld.bm_fld;
			un var67 = null;
			if (null != mh.af_fld) {
				var67 = new un(var61, mh.af_fld, tw.au_fld[var61], 1000000);
			}

			uv var47 = new uv(var67, cp.ph_fld, ef.pt_fld, var61, false, true, true, true, true);
			dm.is_fld = var47;
			ea.bm(20, kh.bh_fld);
			ao.aq(cy.ae_fld);
		} else if (client.hd_fld == cy.ae_fld) {
			if (var0 > 251) {
				byte var31 = 0;
				int var32 = var31 + uv.sl(hi.hl_fld, 1616464225) * 4 / 100;
				var32 += uv.sl(client.hc_fld, -1698966247) * 1 / 100;
				var32 += uv.sl(zs.hw_fld, 825155048) * 2 / 100;
				var32 += uv.sl(client.hg_fld, 1413387642) * 1 / 100;
				var32 += uv.sl(bu.hv_fld, 204263638) * 1 / 100;
				var32 += uv.sl(ga.ht_fld, 258666849) * 10 / 100;
				var32 += uv.sl(ab.hu_fld, 157590714) * 65 / 100;
				var32 += uv.sl(me.hz_fld, -1168701055) * 1 / 100;
				var32 += uv.sl(ih.hm_fld, 78562366) * 1 / 100;
				var32 += uv.sl(bj.ib_fld, -1012968334) * 6 / 100;
				var32 += uv.sl(bq.if_fld, 171427581) * 1 / 100;
				var32 += uv.sl(in.ip_fld, 856160257) * 2 / 100;
				var32 += uv.sl(py.il_fld, 2083205964) * 2 / 100;
				var32 += uv.sl(wo.iq_fld, -1239914623) * 1 / 100;
				var32 += uv.sl(dm.is_fld, -256471795) * 2 / 100;
				if (var32 != 100) {
					if (var0 > 251) {
						if (var32 != 0) {
							ea.bm(30, kh.bk_fld + var32 + "%");
						}
					}
				} else {
					rd.al(hi.hl_fld, "Animations");
					rd.al(client.hc_fld, "Animation Keyframes");
					rd.al(zs.hw_fld, "Skeletons");
					rd.al(ga.ht_fld, "Maps");
					rd.al(ab.hu_fld, "Models");
					rd.al(ih.hm_fld, "Music Jingles");
					rd.al(bq.if_fld, "World Map");
					rd.al(in.ip_fld, "World Map Geography");
					rd.al(py.il_fld, "World Map Ground");
					ea.bm(30, kh.bj_fld);
					ao.aq(cy.ak_fld);
				}
			}
		} else if (client.hd_fld == cy.ak_fld) {
			bw.dk_fld = client.da_fld.ak(104, 104, cn.ka(cx.kq_fld, (byte)1), 1802951577);
			hk.mt_fld = bw.dk_fld;
			bx.aw_fld = new yv(512, 512);
			ea.bm(30, kh.bs_fld);
			ao.aq(cy.as_fld);
		} else if (client.hd_fld == cy.as_fld) {
			if (!client.hg_fld.cy((byte)1)) {
				ea.bm(40, kh.bp_fld + client.hg_fld.ag() + "%");
			} else if (!wo.iq_fld.cy((byte)1)) {
				if (var0 > 251) {
					ea.bm(40, kh.bp_fld + (80 + bj.ib_fld.ag() / 6) + "%");
				}
			} else {
				tu.ak(client.hg_fld);
				uv var30 = client.hg_fld;
				pl.ak_fld = var30;
				uv var60 = client.hg_fld;
				uv var66 = ab.hu_fld;
				nz.ad_fld = var60;
				cl.ao_fld = var66;
				fi.am_fld = rl1.ei(nz.ad_fld, 3);
				bb.ag(client.hg_fld, ab.hu_fld, client.gk_fld);
				wt.ag(client.hg_fld, ab.hu_fld);
				uv var73 = client.hg_fld;
				pw.ak_fld = var73;
				uv var76 = client.hg_fld;
				uv var79 = ab.hu_fld;
				boolean var82 = client.ct_fld;
				zf var8 = ej.do_fld;
				ce.dt_fld = var76;
				bl.dm_fld = var79;
				ux.dq_fld = var82;
				ob.dz_fld = rl1.ei(ce.dt_fld, 10);
				mk.dr_fld = var8;
				uv var9 = client.hg_fld;
				uv var10 = hi.hl_fld;
				uv var11 = client.hc_fld;
				uv var12 = zs.hw_fld;
				ln.ab_fld = var9;
				gd.ap_fld = var10;
				mc.at_fld = var11;
				pm.ac_fld = var12;
				uv var13 = client.hg_fld;
				uv var14 = ab.hu_fld;
				hc.af_fld = var13;
				iq.al_fld = var14;
				rc.ak(client.hg_fld);
				ns.ak(client.hg_fld);
				iy.ak(dt.az_fld);
				cg_fld = new uo(bu.hv_fld, ab.hu_fld, gz.hy_fld, ow.ie_fld, dm.is_fld);
				uv var15 = client.hg_fld;
				ny.az_fld = var15;
				uv var16 = client.hg_fld;
				de.as_fld = var16;
				do_.ak(client.hg_fld);
				uv var17 = client.hg_fld;
				my.ak(client.hg_fld);
				ej.ak(client.hg_fld, gz.hy_fld);
				iq.ak(client.hg_fld);
				uv var18 = client.hg_fld;
				yl.ak_fld = var18;
				ny.ea_fld = new wd(es.gp_fld, 54, ku.gi_fld, client.hg_fld);
				us.ev_fld = new wd(es.gp_fld, 47, ku.gi_fld, client.hg_fld);
				ob.ek_fld = new dn();
				uv var19 = client.hg_fld;
				uv var20 = gz.hy_fld;
				uv var21 = ow.ie_fld;
				ex.ah_fld = var19;
				od.aw_fld = var20;
				ap.ay_fld = var21;
				vu var10000 = kg.ps_fld;
				kg.ps_fld.cd_fld = (Arrays.hashCode((Object[])og.ci_fld.lz_fld.getClass().getSigners()) >> 2) * 1725617152
					+ 38967296
					+ ((lu.im_fld ? 1 : 0) - 1) * -604588640;
				var10000.cg_fld = client.zw();
				cm.ak(client.hg_fld, gz.hy_fld);
				uv var22 = client.hg_fld;
				uv var23 = gz.hy_fld;
				nz.av_fld = var23;
				pc.ag_fld = rl1.ei(var22, 35);
				lq.ae_fld = new pc[pc.ag_fld];

				for (int var24 = 0; var24 < pc.ag_fld; var24++) {
					byte[] var25 = var22.bb(35, var24, 584982574);
					lq.ae_fld[var24] = new pc(var24);
					if (var25 != null) {
						lq.ae_fld[var24].ag(new xi(var25), -1350612840);
						lq.ae_fld[var24].av(24957735);
					}
				}

				im.ak(client.hg_fld);
				ea.bm(50, kh.bt_fld);
				ao.aq(cy.ar_fld);
			}
		} else if (client.hd_fld == cy.ar_fld) {
			int var29 = 0;
			if (null == vf.mm_fld) {
				vf.mm_fld = wf.av(gz.hy_fld, cz.lg_fld.ay_fld, 0);
			} else {
				var29++;
			}

			if (null == ld.au_fld) {
				ld.au_fld = wf.av(gz.hy_fld, cz.lg_fld.as_fld, 0);
			} else {
				var29++;
			}

			if (pf.ax_fld == null) {
				pf.ax_fld = ck.ak(gz.hy_fld, cz.lg_fld.ar_fld, 0);
			} else {
				var29++;
			}

			boolean var2 = null != ch.ay_fld;
			if (!var2) {
				yv[] var3 = km.az(gz.hy_fld, cz.lg_fld.af_fld, 0);
				ch.ay_fld = var3;
			} else {
				var29++;
			}

			if (!xg.ag_boolean(-1903675851)) {
				if (var0 <= 251) {
					return;
				}

				jj.ak(km.az(gz.hy_fld, cz.lg_fld.al_fld, 0));
			} else {
				var29++;
			}

			boolean var65 = null != do_.ar_fld;
			if (!var65) {
				yv[] var4 = km.az(gz.hy_fld, cz.lg_fld.au_fld, 0);
				do_.ar_fld = var4;
			} else {
				var29++;
			}

			if (null == ia.af_fld) {
				ia.af_fld = km.az(gz.hy_fld, cz.lg_fld.ax_fld, 0);
			} else {
				var29++;
			}

			if (null == client.mx_fld) {
				if (var0 <= 251) {
					return;
				}

				client.mx_fld = km.az(gz.hy_fld, cz.lg_fld.an_fld, 0);
			} else {
				var29++;
			}

			if (null == tf.al_Arryv) {
				if (var0 <= 251) {
					return;
				}

				tf.al_Arryv = km.az(gz.hy_fld, cz.lg_fld.aa_fld, 0);
			} else {
				var29++;
			}

			if (uk.mj_fld == null) {
				uk.mj_fld = ck.ak(gz.hy_fld, cz.lg_fld.ai_fld, 0);
			} else {
				var29++;
			}

			if (dv.ja_fld == null) {
				dv.ja_fld = ck.ak(gz.hy_fld, cz.lg_fld.aq_fld, 0);
			} else {
				var29++;
			}

			label494: {
				if (null == cb.mz_fld) {
					if (var0 <= 251) {
						return;
					}

					if (cz.lg_fld.am_fld != -1) {
						eg var70 = eg.ak(ab.hu_fld, cz.lg_fld.am_fld, 0);
						if (null != var70) {
							if (var0 <= 251) {
								return;
							}

							cb.mz_fld = dn.ki(var70);
						}
						break label494;
					}
				}

				var29++;
			}

			if (null == by.mg_fld && -1 != cz.lg_fld.ad_fld) {
				eg var71 = eg.ak(ab.hu_fld, cz.lg_fld.ad_fld, 0);
				if (var71 != null) {
					if (var0 <= 251) {
						return;
					}

					by.mg_fld = dn.ki(var71);
				}
			} else {
				var29++;
			}

			if (var29 < 13) {
				if (var0 > 251) {
					ea.bm(70, kh.bv_fld + var29 * 100 / 14 + "%");
				}
			} else {
				zv.ag_fld = dv.ja_fld;
				yv.ec(ld.au_fld);
				int var72 = (int)(Math.random() * 21.0) - 10;
				int var5 = (int)(Math.random() * 21.0) - 10;
				int var6 = (int)(Math.random() * 21.0) - 10;
				int var7 = (int)(Math.random() * 41.0) - 20;
				pf.ax_fld[0].av(var72 + var7, var7 + var5, var7 + var6);
				ea.bm(60, kh.bi_fld);
				ao.aq(cy.af_fld);
			}
		} else if (cy.af_fld == client.hd_fld) {
			if (!me.hz_fld.cy((byte)1)) {
				if (var0 > 251) {
					ea.bm(70, kh.bu_fld + "0%");
				}
			} else {
				hi.ni_fld = new eu(me.hz_fld, gz.hy_fld, 20, cn.db(cx.kq_fld, -1633526702), 128);
				fc.ag(hi.ni_fld);
				fc.az(cn.db(cx.kq_fld, -2033870425));
				ao.aq(cy.al_fld);
			}
		} else if (cy.al_fld == client.hd_fld) {
			if (var0 > 251) {
				int var28 = hi.ni_fld.ak((byte)-23);
				if (var28 < 100) {
					ea.bm(80, kh.bu_fld + var28 + "%");
				} else {
					ea.bm(90, kh.bn_fld);
					ao.aq(cy.au_fld);
				}
			}
		} else if (client.hd_fld == cy.au_fld) {
			gz.gb_fld = new dd();
			la.kg(fw.qz_fld, gz.gb_fld, 10, (byte)-128);
			ea.bm(92, kh.bc_fld);
			ao.aq(cy.ax_fld);
		} else if (cy.ax_fld == client.hd_fld) {
			if (!by.ho_fld.co("huffman", "", -1924868098)) {
				ea.bm(94, kh.bw_fld + 0 + "%");
			} else {
				kq var27 = new kq(by.ho_fld.cb("huffman", "", (byte)30));
				kd.ak_fld = var27;
				ea.bm(94, kh.ba_fld);
				ao.aq(cy.an_fld);
			}
		} else if (cy.an_fld == client.hd_fld) {
			if (!bu.hv_fld.cy((byte)1)) {
				ea.bm(96, kh.bq_fld + bu.hv_fld.ag() * 4 / 5 + "%");
			} else if (!dm.is_fld.cy((byte)1)) {
				ea.bm(96, kh.bq_fld + dm.is_fld.ag() * 4 / 5 + "%");
			} else if (!bj.ib_fld.cy((byte)1)) {
				ea.bm(96, kh.bq_fld + (80 + bj.ib_fld.ag() / 6) + "%");
			} else if (!ow.ie_fld.cy((byte)1)) {
				ea.bm(96, kh.bq_fld + (96 + ow.ie_fld.ag() / 50) + "%");
			} else {
				ea.bm(98, kh.bg_fld);
				if (ub.mo(bj.ib_fld, "version.dat", "", (byte)-85)) {
					xi var1 = new xi(bj.ib_fld.cb("version.dat", "", (byte)34));
					xi.tx(var1, 856683651);
				}

				ao.aq(cy.aa_fld);
			}
		} else if (client.hd_fld == cy.aa_fld) {
			if (aac.ak_fld < 238) {
				if (ub.sn(bq.if_fld, (byte)109) > 0 && !ub.zx(bq.if_fld, hc.ak_fld.ah_fld, (byte)-29)) {
					ea.bm(100, kh.bb_fld + bq.if_fld.ci(hc.ak_fld.ah_fld, 1653275309) / 10 + "%");
					return;
				}
			} else if (ub.sn(bq.if_fld, (byte)112) > 0 && !bq.if_fld.cv(hc.ak_fld.aw_fld, -1472281419)) {
				ea.bm(100, kh.bb_fld + bq.if_fld.ar(hc.ak_fld.aw_fld, -8656200) / 10 + "%");
				return;
			}

			if (ca.px_fld == null) {
				ca.px_fld = new wl();
				wl.dt(ca.px_fld, bq.if_fld, in.ip_fld, py.il_fld, cu.dl_fld, client.dr_fld, pf.ax_fld, 1382466332);
			}

			ea.bm(100, kh.cd_fld);
			if (ku.dc_fld) {
				ao.aq(cy.aq_fld);
			} else {
				ao.aq(cy.ai_fld);
			}
		} else {
			if (client.hd_fld == cy.aq_fld) {
				jt.dz_fld = false;
				jk.af(20, (byte)41);
				ot.hw(cj.ac_fld);
			}
		}
	}

	cf() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Lct;II[I[II)V"
	)
	static void az(ct[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = 1 + var2;
			int var8 = (var2 + var1) / 2;
			ct var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				if (var5 >= 1955653013) {
					return;
				}

				boolean var10 = true;

				do {
					var7--;

					for (int var11 = 0; var11 < 4; var11++) {
						if (var5 >= 1955653013) {
							return;
						}

						int var12;
						int var13;
						if (var3[var11] == 2) {
							var12 = -2112375145 * var0[var7].ai_fld;
							var13 = var9.ai_fld;
						} else if (1 == var3[var11]) {
							var12 = var0[var7].au_fld * 2045182223;
							var13 = var9.au_fld;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								if (var5 >= 1955653013) {
									return;
								}

								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var7].as((short)2048) ? 1 : 0;
							var13 = var9.as((short)2048) ? 1 : 0;
						} else {
							var12 = -407267201 * var0[var7].af_fld;
							var13 = var9.af_fld;
						}

						if (var13 != var12) {
							if (var4[var11] == 1 && var12 > var13) {
								break;
							}

							if (0 == var4[var11]) {
								if (var5 >= 1955653013) {
									return;
								}

								if (var12 < var13) {
									if (var5 >= 1955653013) {
										return;
									}
									break;
								}
							}

							var10 = false;
							break;
						}

						if (3 == var11) {
							if (var5 >= 1955653013) {
								return;
							}

							var10 = false;
						}
					}
				} while (var10);

				var10 = true;

				do {
					var6++;

					for (int var15 = 0; var15 < 4; var15++) {
						int var17;
						int var18;
						if (2 == var3[var15]) {
							var17 = -2112375145 * var0[var6].ai_fld;
							var18 = var9.ai_fld;
						} else if (var3[var15] == 1) {
							if (var5 >= 1955653013) {
								return;
							}

							var17 = var0[var6].au_fld * 2045182223;
							var18 = var9.au_fld;
							if (var17 == -1 && var4[var15] == 1) {
								var17 = 2001;
							}

							if (var18 == -1 && var4[var15] == 1) {
								var18 = 2001;
							}
						} else if (var3[var15] == 3) {
							var17 = var0[var6].as((short)2048) ? 1 : 0;
							byte var10000;
							if (var9.as((short)2048)) {
								if (var5 >= 1955653013) {
									return;
								}

								var10000 = 1;
							} else {
								var10000 = 0;
							}

							var18 = var10000;
						} else {
							var17 = var0[var6].af_fld * -407267201;
							var18 = var9.af_fld;
						}

						if (var18 != var17) {
							if ((1 != var4[var15] || var17 >= var18) && (0 != var4[var15] || var17 <= var18)) {
								var10 = false;
							}
							break;
						}

						if (3 == var15) {
							var10 = false;
						}
					}
				} while (var10);

				if (var6 < var7) {
					ct var16 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var16;
				}
			}

			az(var0, var1, var7, var3, var4, 1390304725);
			az(var0, 1 + var7, var2, var3, var4, -1294416160);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	public static int ak(qa var0, int var1, qy var2) throws EOFException {
		byte var4 = 0;
		if (!var0.av()) {
			var0.au(0);
			return var4;
		} else {
			ol var5 = var0.ae();
			if (-1 == var5.bl_fld) {
				var4 |= 8;
			}

			if (var5.ao((byte)-6)) {
				var0.au(0);
			} else {
				var0.au(var0.al() + var1);
			}

			int var6;
			if (!var5.aa(-848244389)) {
				var6 = var4 | hd.ag(var0, var1, var2);
			} else {
				var6 = var4 | pl.az(var0, var1, var2);
			}

			return var6;
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I)V"
	)
	static final void dx(jt var0, int var1) throws EOFException {
		xj var2 = client.aq_fld.ae_fld;
		if (jt.aw_fld != var0) {
			if (jt.al_fld == var0) {
				int var32 = xi.tx(var2, 1722404358);
				int var44 = var2.dp();
				int var56 = xi.uk(var2, 1898450231);
				int var68 = pg.ma_fld + (var56 >> 4 & 7);
				int var81 = (var56 & 7) + ly.mv_fld;
				int var94 = xi.oh(var2, (byte)122);
				if (hk.mt_fld.ae(var68, var81, 261879087)) {
					var68 = kj.as(var68);
					var81 = kj.as(var81);
					int var104 = -1 == client.mh_fld ? hk.mt_fld.ae_fld : client.mh_fld;
					bt var112 = new bt(hk.mt_fld, var32, var104, var68, var81, jf.dv(hk.mt_fld, var68, var81, var104) - var44, var94, client.dv_fld);
					hk.mt_fld.aq_fld.av(var112);
				}
			} else if (var0 == jt.az_fld) {
				if (var1 > -552440474) {
					int var31 = var2.cg();
					int var43 = pg.ma_fld + (var31 >> 4 & 7);
					int var55 = ly.mv_fld + (var31 & 7);
					int var67 = var2.eo();
					int var80 = xi.ki(var2, 1381263331);
					int var93 = hk.mt_fld.ae_fld;
					if (hk.mt_fld.ae(var43, var55, 170541658)) {
						int var103 = client.mh_fld == -1 ? var93 : client.mh_fld;
						dn.de(var103, var43, var55, var67, var80);
					}
				}
			} else if (var0 == jt.ag_fld) {
				int var30 = xi.oh(var2, (byte)63);
				int var42 = var2.eo();
				int var54 = var2.cz();
				short var66 = (short)var2.cz();
				short var79 = (short)var2.cz();
				int var92 = var2.ec();
				int var102 = var2.co();
				int var111 = var2.dp();
				int var118 = (var111 >> 4 & 7) + pg.ma_fld;
				int var124 = (var111 & 7) + ly.mv_fld;
				if (hk.mt_fld.ae(var118, var124, 1611247677)) {
					int var131 = client.mh_fld == -1 ? hk.mt_fld.ae_fld : client.mh_fld;
					by.dw(var131, var118, var124, var42, var102, var79, var92, var66, var54, var30);
				}
			} else {
				if (var0 == jt.af_fld) {
					byte var21 = xi.wc(var2, -1857088296);
					int var33 = var2.ew();
					byte var45 = xi.rx(var2, -1134409442);
					int var57 = xi.uk(var2, 1898450231);
					int var70 = pg.ma_fld + (var57 >> 4 & 7);
					int var83 = ly.mv_fld + (var57 & 7);
					int var95 = var2.ew();
					byte var105 = xi.rp(var2, -1119107767);
					int var114 = var2.ew();
					int var120 = var2.eo();
					int var126 = var2.df();
					int var132 = var126 >> 2;
					int var15 = var126 & 3;
					int var16 = client.cq_fld[var132];
					byte var17 = xi.wc(var2, -1990888444);
					cv var18 = (cv)hk.mt_fld.au_fld.ak(var95);
					if (null != var18) {
						int var19 = -1 == client.mh_fld ? hk.mt_fld.ae_fld : client.mh_fld;
						wj.df(var19, var70, var83, var132, var15, var16, var114, var33, var120, var17, var21, var105, var45, var18);
					}
				}

				if (var0 == jt.ah_fld) {
					if (var1 > -552440474) {
						int var29 = var2.dp();
						int var41 = var29 >> 2;
						int var53 = var29 & 3;
						int var65 = client.cq_fld[var41];
						int var78 = var2.dp();
						int var91 = pg.ma_fld + (var78 >> 4 & 7);
						int var101 = ly.mv_fld + (var78 & 7);
						if (hk.mt_fld.ae(var91, var101, 709612188)) {
							int var139;
							if (-1 == client.mh_fld) {
								if (var1 <= -552440474) {
									return;
								}

								var139 = hk.mt_fld.ae_fld;
							} else {
								var139 = client.mh_fld;
							}

							int var110 = var139;
							yx.ed(hk.mt_fld, var110, var91, var101, var65, -1, var41, var53, 31, null, 0, -1, (byte)-18);
						}
					}
				} else if (var0 == jt.au_fld) {
					int var28 = xi.oh(var2, (byte)18);
					int var40 = var2.df();
					int var52 = xi.tx(var2, 801179513);
					boolean var64 = var2.cg() == 1;
					int var77 = xi.tx(var2, 805040912);
					int var90 = xi.ki(var2, 2038665642);
					int var100 = var2.df();
					int var109 = (var100 >> 4 & 7) + pg.ma_fld;
					int var117 = ly.mv_fld + (var100 & 7);
					int var123 = xi.uk(var2, 1898450231);
					if (hk.mt_fld.ae(var109, var117, -748946191)) {
						int var10000;
						if (client.mh_fld == -1) {
							if (var1 <= -552440474) {
								return;
							}

							var10000 = hk.mt_fld.ae_fld;
						} else {
							var10000 = client.mh_fld;
						}

						int var130 = var10000;
						jf.dj(var130, var109, var117, var52, var90, var40, var77, var28, var123, var64);
					}
				} else if (var0 == jt.ae_fld) {
					int var27 = var2.ew();
					int var39 = xi.uk(var2, 1898450231);
					int var51 = xi.uk(var2, 1898450231);
					int var63 = (var51 >> 4 & 7) + pg.ma_fld;
					int var76 = (var51 & 7) + ly.mv_fld;
					if (hk.mt_fld.ae(var63, var76, -449513971)) {
						if (var1 <= -552440474) {
							return;
						}

						int var89 = -1 == client.mh_fld ? hk.mt_fld.ae_fld : client.mh_fld;
						jj.ds(var89, var63, var76, var27, var39);
					}
				} else if (jt.av_fld == var0) {
					int var26 = var2.cg();
					int var38 = pg.ma_fld + (var26 >> 4 & 7);
					int var50 = (var26 & 7) + ly.mv_fld;
					int var62 = var2.em();
					int var75 = var2.em();
					int var88 = var2.ew();
					if (hk.mt_fld.ae(var38, var50, -22622780)) {
						int var99 = client.mh_fld == -1 ? hk.mt_fld.ae_fld : client.mh_fld;
						jb.db(var99, var38, var50, var88, var75, var62);
					}
				} else if (var0 == jt.ak_fld) {
					int var25 = xi.uk(var2, 1898450231);
					int var37 = (var25 >> 4 & 7) + pg.ma_fld;
					int var49 = ly.mv_fld + (var25 & 7);
					int var61 = xi.tx(var2, 783917879);
					int var74 = var2.dp();
					int var87 = var74 >> 2;
					int var98 = var74 & 3;
					int var108 = client.cq_fld[var87];
					if (0 <= var37) {
						if (var1 <= -552440474) {
							return;
						}

						if (var37 < hk.mt_fld.ah_fld - 1 && 0 <= var49 && var49 < hk.mt_fld.aw_fld - 1) {
							int var116 = client.mh_fld == -1 ? hk.mt_fld.ae_fld : client.mh_fld;
							cs var122 = bc.et(hk.mt_fld, var116, var37, var49, var108);
							if (var122 != null) {
								oe var128 = ko.az(var122.as_fld);
								if (var128.dj_fld) {
									if (var1 <= -552440474) {
										return;
									}

									lw.eb(var116, var37, var49, var87, var98, var108, var61);
									var122.al_fld = var61;
									return;
								}
							}

							boolean var129 = lw.eb(var116, var37, var49, var87, var98, var108, var61);
							if (var129) {
								if (var1 <= -552440474) {
									return;
								}

								return;
							}

							if (null != var122) {
								var122.al_fld = var61;
							}
						}
					}
				} else if (jt.ay_fld == var0) {
					int var24 = var2.ei();
					int var36 = var2.df();
					int var48 = hk.mt_fld.ae_fld;
					int var60 = hk.mt_fld.ay_fld + pg.ma_fld + (var36 >> 4 & 7);
					int var73 = hk.mt_fld.as_fld + (var36 & 7) + ly.mv_fld;
					int var86 = var2.ef(-404582138);
					int var97 = var2.em();
					int var107 = kj.ag(var97);
					int var115 = kj.az(var97);
					int var121 = kj.av(var97);
					int var127 = var2.ew();
					int var133 = var2.ew();
					int var134 = var2.df();
					int var135 = xi.oh(var2, (byte)53);
					int var136 = var2.eo();
					int var137 = xi.tx(var2, 1582170718);
					int var138 = xi.oh(var2, (byte)101);
					if (var137 != 65535) {
						bc var20 = new bc(
							var48, var60, var73, var133, var86, var107, var115, var121, var135, var24, var137, var127 + client.dv_fld, client.dv_fld + var136, var134, var138
						);
						client.ds_fld.av(var20);
					}
				} else if (var0 == jt.as_fld) {
					int var23 = var2.dp();
					int var35 = pg.ma_fld + (var23 >> 4 & 7);
					int var47 = ly.mv_fld + (var23 & 7);
					int var59 = xi.oh(var2, (byte)22);
					int var72 = xi.uk(var2, 1898450231);
					int var85 = var2.df() & 31;
					int var96 = var2.df();
					int var106 = xi.uk(var2, 1898450231);
					if (hk.mt_fld.ae(var35, var47, 970130535)) {
						ah.kw_fld.ag(hk.mt_fld.ag_fld, var59, var35, var47, var85, var106, var72, var96, 688777510);
					}
				} else if (var0 == jt.ar_fld) {
					if (var1 > -552440474) {
						int var22 = xi.uk(var2, 1898450231);
						int var34 = pg.ma_fld + (var22 >> 4 & 7);
						int var46 = ly.mv_fld + (var22 & 7);
						int var58 = var2.co();
						int var71 = var2.eo();
						if (hk.mt_fld.ae(var34, var46, 2104724162)) {
							int var84 = client.mh_fld == -1 ? hk.mt_fld.ae_fld : client.mh_fld;
							cn.di(var84, var34, var46, var71, var58);
						}
					}
				}
			}
		} else {
			int var3 = var2.cg();
			int var4 = var3 >> 2;
			int var5 = var3 & 3;
			int var6 = client.cq_fld[var4];
			int var7 = var2.df();
			int var8 = xi.oh(var2, (byte)107);
			int var9 = var2.df();
			String[] var10 = null;
			if (var9 > 0) {
				var10 = new String[5];

				for (int var11 = 0; var11 < var9; var11++) {
					if (var1 <= -552440474) {
						return;
					}

					int var12 = var2.df();
					String var13 = xi.kc(var2, -725890175);
					if (var12 >= 0 && var12 < 5) {
						if (var1 <= -552440474) {
							return;
						}

						var10[var12] = var13;
					}
				}
			}

			int var113 = var2.df();
			int var119 = pg.ma_fld + (var113 >> 4 & 7);
			int var125 = (var113 & 7) + ly.mv_fld;
			if (hk.mt_fld.ae(var119, var125, -492328527)) {
				int var14 = -1 == client.mh_fld ? hk.mt_fld.ae_fld : client.mh_fld;
				yx.ed(hk.mt_fld, var14, var119, var125, var6, var8, var4, var5, var7, var10, 0, -1, (byte)-58);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Lmx;"
	)
	public static mx ak() {
		return mx.ae_fld;
	}
}
