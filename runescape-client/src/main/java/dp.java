import java.io.EOFException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dp")
public class dp extends de {
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bq_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bx_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ai_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ae_fld;

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)Ljava/net/URLConnection;"
	)
	URLConnection bz(dj var1) throws IOException {
		URLConnection var2 = var1.az_fld.openConnection();
		this.aw(var2, 958190300);
		return var2;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)Ljava/net/URLConnection;"
	)
	URLConnection bs(dj var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.az_fld.openConnection();
		if (!this.ae_fld) {
			var2.setSSLSocketFactory(qz.ak());
		}

		this.aw(var2, 958190300);
		return var2;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)Ljava/net/URLConnection;"
	)
	URLConnection bm(dj var1) throws IOException {
		URLConnection var3 = var1.az_fld.openConnection();
		this.aw(var3, 958190300);
		return var3;
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldj;B)V"
	)
	@Override
	void ae(dj var1, byte var2) throws IOException {
		URLConnection var3 = null;
		boolean var10 = false /* VF: Semaphore variable */;

		label135: {
			label126: {
				try {
					label131: {
						var10 = true;
						String var13 = var1.az_fld.getProtocol();
						if (var13.equals("http")) {
							var3 = this.bm(var1);
						} else {
							if (!var13.equals("https")) {
								var1.av_fld = dj.ag_fld;
								var10 = false;
								break label131;
							}

							var3 = this.bd(var1);
						}

						this.ay(var3, var1, (short)-12956);
						var10 = false;
						break label135;
					}
				} catch (IOException var11) {
					var1.av_fld = dj.ag_fld;
					var10 = false;
					break label126;
				} finally {
					if (var10) {
						if (var3 != null) {
							if (var2 >= 1) {
								return;
							}

							if (var3 instanceof HttpURLConnection) {
								HttpURLConnection var7 = (HttpURLConnection)var3;
								var7.disconnect();
							}
						}
					}
				}

				if (var3 != null && var3 instanceof HttpURLConnection) {
					HttpURLConnection var5 = (HttpURLConnection)var3;
					var5.disconnect();
				}

				return;
			}

			if (var3 != null && var3 instanceof HttpURLConnection) {
				HttpURLConnection var4 = (HttpURLConnection)var3;
				var4.disconnect();
			}

			return;
		}

		if (var3 != null && var3 instanceof HttpURLConnection) {
			if (var2 >= 1) {
				return;
			}

			HttpURLConnection var14 = (HttpURLConnection)var3;
			var14.disconnect();
		}
	}

	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "(Lik;IB)I"
	)
	public static int wl(ik var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 != 126 && var2 != 162182662) {
			if (var1 != var0.ab_fld || var0.ap_fld != -1 && var0.aq_fld[-461820507 * var0.ap_fld] >= 125) {
				if (var0.aq_fld[var1] == var2) {
					return -1;
				} else {
					var0.aq_fld[var1] = var2;
					ik.hi(var0, (byte)-112);
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	public dp(boolean var1, int var2) {
		super(var2);
		this.ae_fld = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)V"
	)
	@Override
	void al(dj var1) throws IOException {
		URLConnection var2 = null;

		try {
			try {
				String var3 = var1.az_fld.getProtocol();
				if (var3.equals("http")) {
					var2 = this.bm(var1);
				} else {
					if (!var3.equals("https")) {
						var1.av_fld = dj.ag_fld;
						return;
					}

					var2 = this.bd(var1);
				}

				this.ay(var2, var1, (short)-19016);
			} catch (IOException var9) {
				var1.av_fld = dj.ag_fld;
			}
		} finally {
			if (var2 != null && var2 instanceof HttpURLConnection) {
				HttpURLConnection var6 = (HttpURLConnection)var2;
				var6.disconnect();
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)V"
	)
	@Override
	void au(dj var1) throws IOException {
		URLConnection var2 = null;

		try {
			try {
				String var3 = var1.az_fld.getProtocol();
				if (var3.equals("http")) {
					var2 = this.bm(var1);
				} else {
					if (!var3.equals("https")) {
						var1.av_fld = dj.ag_fld * -628978206;
						return;
					}

					var2 = this.bd(var1);
				}

				this.ay(var2, var1, (short)-16071);
			} catch (IOException var9) {
				var1.av_fld = -1827674483 * dj.ag_fld;
			}
		} finally {
			if (var2 != null && var2 instanceof HttpURLConnection) {
				HttpURLConnection var6 = (HttpURLConnection)var2;
				var6.disconnect();
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)Ljava/net/URLConnection;"
	)
	URLConnection bd(dj var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection)var1.az_fld.openConnection();
		if (!this.ae_fld) {
			var3.setSSLSocketFactory(qz.ak());
		}

		this.aw(var3, 958190300);
		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)V"
	)
	@Override
	void af(dj var1) throws IOException {
		URLConnection var2 = null;

		try {
			try {
				String var3 = var1.az_fld.getProtocol();
				if (var3.equals("http")) {
					var2 = this.bm(var1);
				} else {
					if (!var3.equals("https")) {
						var1.av_fld = dj.ag_fld;
						return;
					}

					var2 = this.bd(var1);
				}

				this.ay(var2, var1, (short)-21610);
			} catch (IOException var9) {
				var1.av_fld = dj.ag_fld;
			}
		} finally {
			if (var2 != null && var2 instanceof HttpURLConnection) {
				HttpURLConnection var6 = (HttpURLConnection)var2;
				var6.disconnect();
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)Ljava/net/URLConnection;"
	)
	URLConnection be(dj var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.az_fld.openConnection();
		if (!this.ae_fld) {
			var2.setSSLSocketFactory(qz.ak());
		}

		this.aw(var2, 958190300);
		return var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ldj;)Ljava/net/URLConnection;"
	)
	URLConnection br(dj var1) throws IOException {
		URLConnection var2 = var1.az_fld.openConnection();
		this.aw(var2, 958190300);
		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lgu;II)V"
	)
	public static void ak(xi var0, gu var1, int var2, int var3) {
		gu.yu(var1, kj.aw(var2), kj.aw(var3), (byte)-77);
		var1.ar(0);
		var1.aw(0);
		byte var5 = xi.rp(var0, -2011094074);
		if (var5 != 0) {
			int var6 = ea.ag(var0, var5, 0);
			int var7 = ea.ag(var0, var5, 2);
			int var8 = ea.ag(var0, var5, 4);
			int var9 = ea.ag(var0, var5, 6);
			var1.al(var6, var7, var8, var9);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lzf;Lzf;Lzf;I)V"
	)
	static void am(zf var0, zf var1, zf var2, int var3) throws EOFException {
		try {
			client.mu(var0, var1, var2);
			bn.bo_fld = (pf.qw_fld - 765) / 2;
			bn.ck_fld = bn.bo_fld + -999389370;
			bh.cb_fld = 355797204 + bn.ck_fld;
			if (bn.dq_fld) {
				if (var3 != -776631127) {
					if (null == ui.do_fld) {
						uv var148 = gz.hy_fld;
						yv[] var112;
						if (!ub.mo(var148, "sl_back", "", (byte)-57)) {
							var112 = null;
						} else {
							int var173 = var148.cm("sl_back", (byte)1);
							int var185 = var148.cz(var173, "", -1020179395);
							var112 = km.az(var148, var173, var185);
						}

						ui.do_fld = var112;
					}

					if (bt.dd_fld == null) {
						bt.dd_fld = qj.ah(gz.hy_fld, "sl_flags", "");
					}

					if (hk.dl_fld == null) {
						if (var3 == -776631127) {
							return;
						}

						hk.dl_fld = qj.ah(gz.hy_fld, "sl_arrows", "");
					}

					if (gx.dr_fld == null) {
						gx.dr_fld = qj.ah(gz.hy_fld, "sl_stars", "");
					}

					if (wt.dk_fld == null) {
						wt.dk_fld = dq.aw(gz.hy_fld, "leftarrow", "");
					}

					if (null == bi.dx_fld) {
						bi.dx_fld = dq.aw(gz.hy_fld, "rightarrow", "");
					}

					yu.dj(bn.bo_fld, 23, 765, 480, 0);
					yu.es(bn.bo_fld, 0, 125, 23, 12425273, 9135624);
					yu.es(bn.bo_fld + 125, 0, 640, 23, 5197647, 2697513);
					var0.ap(kh.mm_fld, bn.bo_fld + 62, 15, 0, -1);
					if (null != gx.dr_fld) {
						if (var3 == -776631127) {
							return;
						}

						gx.dr_fld[1].ad(140 + bn.bo_fld, 1);
						zv.uj(var1, kh.mx_fld, 152 + bn.bo_fld, 10, 16777215, -1);
						gx.dr_fld[0].ad(bn.bo_fld + 140, 12);
						zv.uj(var1, kh.mj_fld, bn.bo_fld + 152, 21, 16777215, -1);
					}

					if (null != hk.dl_fld) {
						int var113;
						int var174;
						label863: {
							var113 = 280 + bn.bo_fld;
							if (0 == ct.as_fld[0]) {
								if (var3 == -776631127) {
									return;
								}

								if (ct.ay_fld[0] == 0) {
									hk.dl_fld[2].ad(var113, 4);
									break label863;
								}
							}

							hk.dl_fld[0].ad(var113, 4);
						}

						if (ct.as_fld[0] == 0 && 1 == ct.ay_fld[0]) {
							hk.dl_fld[3].ad(var113 + 15, 4);
						} else {
							hk.dl_fld[1].ad(15 + var113, 4);
						}

						zv.uj(var0, kh.mr_fld, 32 + var113, 17, 16777215, -1);
						int var149 = 390 + bn.bo_fld;
						if (1 == ct.as_fld[0] && 0 == ct.ay_fld[0]) {
							hk.dl_fld[2].ad(var149, 4);
						} else {
							hk.dl_fld[0].ad(var149, 4);
						}

						if (ct.as_fld[0] == 1 && 1 == ct.ay_fld[0]) {
							hk.dl_fld[3].ad(var149 + 15, 4);
						} else {
							hk.dl_fld[1].ad(15 + var149, 4);
						}

						label842: {
							zv.uj(var0, kh.mo_fld, 32 + var149, 17, 16777215, -1);
							var174 = bn.bo_fld + 500;
							if (2 == ct.as_fld[0]) {
								if (var3 == -776631127) {
									return;
								}

								if (ct.ay_fld[0] == 0) {
									hk.dl_fld[2].ad(var174, 4);
									break label842;
								}
							}

							hk.dl_fld[0].ad(var174, 4);
						}

						if (ct.as_fld[0] == 2 && 1 == ct.ay_fld[0]) {
							hk.dl_fld[3].ad(var174 + 15, 4);
						} else {
							hk.dl_fld[1].ad(var174 + 15, 4);
						}

						zv.uj(var0, kh.mu_fld, 32 + var174, 17, 16777215, -1);
						int var186 = 610 + bn.bo_fld;
						if (ct.as_fld[0] == 3 && ct.ay_fld[0] == 0) {
							hk.dl_fld[2].ad(var186, 4);
						} else {
							hk.dl_fld[0].ad(var186, 4);
						}

						if (3 == ct.as_fld[0] && 1 == ct.ay_fld[0]) {
							hk.dl_fld[3].ad(var186 + 15, 4);
						} else {
							hk.dl_fld[1].ad(15 + var186, 4);
						}

						zv.uj(var0, kh.mf_fld, 32 + var186, 17, 16777215, -1);
					}

					yu.dj(bn.bo_fld + 708, 4, 50, 16, 0);
					var1.ap(kh.ky_fld, 25 + 708 + bn.bo_fld, 16, 16777215, -1);
					bn.ds_fld = -2130668241;
					if (null != ui.do_fld) {
						byte var114 = 88;
						byte var150 = 19;
						int var175 = 765 / (1 + var114) - 1;
						int var187 = 480 / (1 + var150);

						int var194;
						int var200;
						do {
							var194 = var187;
							var200 = var175;
							if (var187 * (var175 - 1) >= ct.ah_fld) {
								var175--;
							}

							if (var175 * (var187 - 1) >= ct.ah_fld) {
								if (var3 == -776631127) {
									return;
								}

								var187--;
							}

							if (var175 * (var187 - 1) >= ct.ah_fld) {
								var187--;
							}
						} while (var194 != var187 || var200 != var175);

						var194 = (765 - var114 * var175) / (var175 + 1);
						if (var194 > 5) {
							var194 = 5;
						}

						var200 = (480 - var150 * var187) / (var187 + 1);
						if (var200 > 5) {
							var200 = 5;
						}

						int var206 = (765 - var175 * var114 - var194 * (var175 - 1)) / 2;
						int var209 = (480 - var150 * var187 - var200 * (var187 - 1)) / 2;
						int var213 = (var187 + ct.ah_fld - 1) / var187;
						bn.db_fld = 259351975 * (var213 - var175);
						if (wt.dk_fld != null && bn.du_fld > 0) {
							wt.dk_fld.ad(8, bc.qx_fld / 2 - wt.dk_fld.av_fld / 2);
						}

						if (null != bi.dx_fld && bn.du_fld < bn.db_fld) {
							bi.dx_fld.ad(pf.qw_fld - bi.dx_fld.az_fld - 8, bc.qx_fld / 2 - bi.dx_fld.av_fld / 2);
						}

						int var215 = var209 + 23;
						int var14 = bn.bo_fld + var206;
						int var15 = 0;
						boolean var16 = false;
						int var17 = bn.du_fld;

						for (int var18 = var187 * var17; var18 < ct.ah_fld; var18++) {
							if (var3 == -776631127) {
								return;
							}

							if (var17 - bn.du_fld >= var175) {
								break;
							}

							ct var19 = yd.ae_fld[var18];
							boolean var20 = true;
							String var21 = Integer.toString(var19.au_fld);
							if (-1 == var19.au_fld) {
								var21 = kh.mb_fld;
								var20 = false;
							} else if (var19.au_fld > 1980) {
								var21 = kh.ms_fld;
								var20 = false;
							}

							cw var22 = null;
							int var23 = 0;
							if (var19.ar(-1407626265)) {
								cw var220;
								if (var19.as((short)2048)) {
									if (var3 == -776631127) {
										return;
									}

									var220 = cw.ay_fld;
								} else {
									var220 = cw.aw_fld;
								}

								var22 = var220;
							} else if (ct.cr(var19, 96068156)) {
								cw var221;
								if (var19.as((short)2048)) {
									if (var3 == -776631127) {
										return;
									}

									var221 = cw.aa_fld;
								} else {
									var221 = cw.an_fld;
								}

								var22 = var221;
							} else if (var19.af(2000042525)) {
								var23 = 16711680;
								var22 = var19.as((short)2048) ? cw.ah_fld : cw.ae_fld;
							} else if (ct.um(var19, (byte)10)) {
								var22 = var19.as((short)2048) ? cw.ar_fld : cw.as_fld;
							} else if (var19.ax(1785888637)) {
								var22 = var19.as((short)2048) ? cw.av_fld : cw.az_fld;
							} else if (var19.ai((byte)-84)) {
								cw var222;
								if (var19.as((short)2048)) {
									if (var3 == -776631127) {
										return;
									}

									var222 = cw.al_fld;
								} else {
									var222 = cw.af_fld;
								}

								var22 = var222;
							} else if (var19.aq((byte)15)) {
								var22 = var19.as((short)2048) ? cw.ax_fld : cw.au_fld;
							}

							label964: {
								if (null != var22) {
									if (var3 == -776631127) {
										return;
									}

									if (var22.ai_fld < ui.do_fld.length) {
										break label964;
									}
								}

								var22 = var19.as((short)2048) ? cw.ag_fld : cw.ak_fld;
							}

							label799: {
								if (tj.ae_fld >= var14) {
									if (var3 == -776631127) {
										return;
									}

									if (tj.ah_fld >= var215 && tj.ae_fld < var114 + var14 && tj.ah_fld < var150 + var215 && var20) {
										bn.ds_fld = var18;
										ui.do_fld[var22.ai_fld].bs(var14, var215, 128, 16777215);
										var16 = true;
										break label799;
									}
								}

								ui.do_fld[var22.ai_fld].ao(var14, var215);
							}

							if (bt.dd_fld != null) {
								bt.dd_fld[(var19.as((short)2048) ? bt.dd_fld.length / 2 : 0) + var19.aa_fld].ad(var14 + 29, var215);
							}

							var0.ap(Integer.toString(var19.af_fld), var14 + 15, 5 + var150 / 2 + var215, var23, -1);
							var1.ap(var21, 60 + var14, var215 + var150 / 2 + 5, 268435455, -1);
							var215 += var150 + var200;
							if (++var15 >= var187) {
								var215 = 23 + var209;
								var14 += var114 + var194;
								var15 = 0;
								var17++;
							}
						}

						if (var16) {
							if (var3 == -776631127) {
								return;
							}

							int var216 = var1.an(yd.ae_fld[bn.ds_fld].an_fld) + 6;
							int var217 = 8 + var1.ap_fld;
							int var218 = 25 + tj.ah_fld;
							if (var217 + var218 > 480) {
								if (var3 == -776631127) {
									return;
								}

								var218 = tj.ah_fld - 25 - var217;
							}

							yu.dj(tj.ae_fld - var216 / 2, var218, var216, var217, 16777120);
							yu.ed(tj.ae_fld - var216 / 2, var218, var216, var217, 0);
							var1.ap(yd.ae_fld[bn.ds_fld].an_fld, tj.ae_fld, 4 + var1.ap_fld + var218, 0, -1);
						}
					}
				}
			} else {
				hu.ce_fld.ao(bn.bo_fld, 0);
				nq.cn_fld.ao(bn.bo_fld + 382, 0);
				hk.cr_fld.ad(bn.bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
				if (client.cl_fld == 0 || 5 == client.cl_fld) {
					byte var4 = 20;
					var0.ap(kh.ir_fld, 180 + bn.ck_fld, 245 - var4, 16777215, -1);
					int var5 = 253 - var4;
					yu.ed(bn.ck_fld + 180 - 152, var5, 304, 34, 9179409);
					yu.ed(bn.ck_fld + 180 - 151, 1 + var5, 302, 32, 0);
					yu.dj(bn.ck_fld + 180 - 150, 2 + var5, bn.bt_fld * 552738201, 30, 9179409);
					yu.dj(bn.ck_fld + 180 - 150 + bn.bt_fld, var5 + 2, 300 - bn.bt_fld, 30, 0);
					var0.ap(bn.bv_fld, 180 + bn.ck_fld, 276 - var4, 16777215, -1);
				}

				if (20 == client.cl_fld) {
					nn.cf_fld.ad(180 + bn.ck_fld - nn.cf_fld.az_fld / 2, 271 - nn.cf_fld.av_fld / 2);
					short var26 = 201;
					var0.ap(bn.ci_fld, bn.ck_fld + 180, var26, 16776960, 0);
					int var27 = var26 + 15;
					var0.ap(bn.cj_fld, bn.ck_fld + 180, var27, 16776960, 0);
					var27 += 15;
					var0.ap(bn.ch_fld, 180 + bn.ck_fld, var27, 16776960, 0);
					var27 += 15;
					var27 += 7;
					if (4 != bn.co_fld && bn.co_fld != 10 && 1 != bn.co_fld) {
						zv.uj(var0, kh.ju_fld, bn.ck_fld + 180 - 110, var27, 16777215, 0);
						short var115 = 200;

						String var6;
						for (var6 = ci.ae(); var0.an(var6) > var115; var6 = var6.substring(0, var6.length() - 1)) {
							if (var3 == -776631127) {
								return;
							}
						}

						zv.uj(var0, zv.ay(var6), 180 + bn.ck_fld - 70, var27, 16777215, 0);
						var27 += 15;
						String var8 = bn.bq_fld;
						String var7 = fe.aa('*', var8.length());
						String var9 = var7;

						while (var0.an(var9) > var115) {
							var9 = var9.substring(1);
						}

						zv.uj(var0, kh.ji_fld + var9, bn.ck_fld + 180 - 108, var27, 16777215, 0);
						var27 += 15;
					}
				}

				label932: {
					if (10 != client.cl_fld && 11 != client.cl_fld) {
						if (var3 == -776631127) {
							return;
						}

						if (50 != client.cl_fld) {
							break label932;
						}
					}

					nn.cf_fld.ad(bn.ck_fld, 171);
					if (0 == bn.co_fld) {
						short var33 = 251;
						var0.ap(kh.jl_fld, bn.ck_fld + 180, var33, 16776960, 0);
						int var34 = var33 + 30;
						int var116 = 180 + bn.ck_fld - 80;
						short var151 = 291;
						qv.cx_fld.ad(var116 - 73, var151 - 20);
						var0.at(kh.kl_fld, var116 - 73, var151 - 20, 144, 40, 16777215, 0, 1, 1, 0);
						var116 = 80 + 180 + bn.ck_fld;
						qv.cx_fld.ad(var116 - 73, var151 - 20);
						var0.at(kh.ko_fld, var116 - 73, var151 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					} else if (bn.co_fld == 1) {
						var0.ap(bn.cu_fld, bn.ck_fld + 180, 201, 16776960, 0);
						short var35 = 236;
						var0.ap(bn.ci_fld, 180 + bn.ck_fld, var35, 16777215, 0);
						int var36 = var35 + 15;
						var0.ap(bn.cj_fld, 180 + bn.ck_fld, var36, 16777215, 0);
						var36 += 15;
						var0.ap(bn.ch_fld, bn.ck_fld + 180, var36, 16777215, 0);
						var36 += 15;
						int var118 = 180 + bn.ck_fld - 80;
						short var152 = 321;
						qv.cx_fld.ad(var118 - 73, var152 - 20);
						var0.ap(kh.at_fld, var118, 5 + var152, 16777215, 0);
						var118 = 80 + bn.ck_fld + 180;
						qv.cx_fld.ad(var118 - 73, var152 - 20);
						var0.ap(kh.ky_fld, var118, var152 + 5, 16777215, 0);
					} else if (2 == bn.co_fld) {
						short var39 = 201;
						var0.ap(bn.ci_fld, bh.cb_fld, var39, 16776960, 0);
						int var40 = var39 + 15;
						var0.ap(bn.cj_fld, bh.cb_fld, var40, 16776960, 0);
						var40 += 15;
						var0.ap(bn.ch_fld, bh.cb_fld, var40, 16776960, 0);
						var40 += 15;
						var40 += 7;
						zv.uj(var0, kh.ju_fld, bh.cb_fld - 110, var40, 16777215, 0);
						short var120 = 200;
						String var153 = ci.ae();

						while (var0.an(var153) > var120) {
							var153 = var153.substring(1);
						}

						zv.uj(
							var0, zv.ay(var153) + (bn.dz_fld == 0 & client.dv_fld % 40 < 20 ? gd.ag(16776960, -1940547058) + db.az_fld : ""), bh.cb_fld - 70, var40, 16777215, 0
						);
						var40 += 15;
						String var188 = bn.bq_fld;
						String var176 = fe.aa('*', var188.length());
						String var196 = var176;

						while (var0.an(var196) > var120) {
							var196 = var196.substring(1);
						}

						StringBuilder var10001 = new StringBuilder().append(kh.ji_fld).append(var196);
						boolean var10002 = 1 == bn.dz_fld;
						boolean var10003;
						if (client.dv_fld % 40 < 20) {
							if (var3 == -776631127) {
								return;
							}

							var10003 = true;
						} else {
							var10003 = false;
						}

						zv.uj(var0, var10001.append(var10002 & var10003 ? gd.ag(16776960, -1940547058) + db.az_fld : "").toString(), bh.cb_fld - 108, var40, 16777215, 0);
						var40 += 15;
						short var46 = 277;
						int var10 = -117 + bh.cb_fld;
						yc var11 = gh.av(client.dq_fld, bn.dh_fld);
						var11.ad(var10, var46);
						var10 += 5 + var11.az_fld;
						zv.uj(var1, kh.ka_fld, var10, 13 + var46, 16776960, 0);
						var10 = 24 + bh.cb_fld;
						var11 = gh.av(cn.za(cx.kq_fld, 1120832785), bn.dv_fld);
						var11.ad(var10, var46);
						var10 += 5 + var11.az_fld;
						zv.uj(var1, kh.kt_fld, var10, var46 + 13, 16776960, 0);
						int var47 = var46 + 15;
						int var12 = bh.cb_fld - 80;
						short var13 = 321;
						qv.cx_fld.ad(var12 - 73, var13 - 20);
						var0.ap(kh.ku_fld, var12, var13 + 5, 16777215, 0);
						var12 = bh.cb_fld + 80;
						qv.cx_fld.ad(var12 - 73, var13 - 20);
						var0.ap(kh.ky_fld, var12, var13 + 5, 16777215, 0);
						short var48 = 357;
						switch (bn.bu_fld) {
							case 2:
								gk.bn_fld = kh.kq_fld;
								break;
							default:
								gk.bn_fld = kh.ki_fld;
						}

						cg.bc_fld = new uf(bh.cb_fld, var48, var1.an(gk.bn_fld), 11);
						gp.bw_fld = new uf(bh.cb_fld, var48, var1.an(kh.ke_fld), 11);
						var1.ap(gk.bn_fld, bh.cb_fld, var48, 16777215, 0);
					} else if (3 == bn.co_fld) {
						if (var3 == -776631127) {
							return;
						}

						short var49 = 201;
						var0.ap(kh.kf_fld, bn.ck_fld + 180, var49, 16776960, 0);
						int var50 = var49 + 20;
						var1.ap(kh.kn_fld, 180 + bn.ck_fld, var50, 16776960, 0);
						var50 += 20;
						var1.ap(kh.kv_fld, bn.ck_fld + 180, var50, 16776960, 0);
						var50 += 15;
						int var121 = 180 + bn.ck_fld;
						short var154 = 276;
						qv.cx_fld.ad(var121 - 73, var154 - 20);
						var2.ap(kh.kz_fld, var121, 5 + var154, 16777215, 0);
						var121 = bn.ck_fld + 180;
						var154 = 326;
						qv.cx_fld.ad(var121 - 73, var154 - 20);
						var2.ap(kh.kc_fld, var121, 5 + var154, 16777215, 0);
					} else if (bn.co_fld == 4) {
						var0.ap(kh.jd_fld, 180 + bn.ck_fld, 201, 16776960, 0);
						short var53 = 236;
						var0.ap(bn.ci_fld, 180 + bn.ck_fld, var53, 16777215, 0);
						int var54 = var53 + 15;
						var0.ap(bn.cj_fld, 180 + bn.ck_fld, var54, 16777215, 0);
						var54 += 15;
						var0.ap(bn.ch_fld, 180 + bn.ck_fld, var54, 16777215, 0);
						var54 += 15;
						String var156 = kh.jr_fld;
						String var189 = he.cq_fld;
						String var177 = fe.aa('*', var189.length());
						zv.uj(var0, var156 + var177 + (client.dv_fld % 40 < 20 ? gd.ag(16776960, -1940547058) + db.az_fld : ""), 180 + bn.ck_fld - 108, var54, 16777215, 0);
						var54 -= 8;
						zv.uj(var0, kh.bm_fld, 180 + bn.ck_fld - 9, var54, 16776960, 0);
						var54 += 15;
						zv.uj(var0, kh.bd_fld, bn.ck_fld + 180 - 9, var54, 16776960, 0);
						int var197 = bn.ck_fld + 180 - 9 + var0.an(kh.bd_fld) + 15;
						int var205 = var54 - var0.ap_fld;
						yc var208;
						if (bn.cv_fld) {
							if (var3 == -776631127) {
								return;
							}

							var208 = ik.cm_fld;
						} else {
							var208 = yg.cg_fld;
						}

						var208.ad(var197, var205);
						var54 += 15;
						int var211 = bn.ck_fld + 180 - 80;
						short var214 = 321;
						qv.cx_fld.ad(var211 - 73, var214 - 20);
						var0.ap(kh.at_fld, var211, 5 + var214, 16777215, 0);
						var211 = bn.ck_fld + 180 + 80;
						qv.cx_fld.ad(var211 - 73, var214 - 20);
						var0.ap(kh.ky_fld, var211, 5 + var214, 16777215, 0);
						var1.ap(kh.ki_fld, 180 + bn.ck_fld, 36 + var214, 16777215, 0);
					} else if (5 == bn.co_fld) {
						var0.ap(kh.km_fld, bn.ck_fld + 180, 201, 16776960, 0);
						short var60 = 221;
						var2.ap(bn.ci_fld, 180 + bn.ck_fld, var60, 16776960, 0);
						int var61 = var60 + 15;
						var2.ap(bn.cj_fld, bn.ck_fld + 180, var61, 16776960, 0);
						var61 += 15;
						var2.ap(bn.ch_fld, bn.ck_fld + 180, var61, 16776960, 0);
						var61 += 15;
						var61 += 14;
						zv.uj(var0, kh.kw_fld, bn.ck_fld + 180 - 145, var61, 16777215, 0);
						short var123 = 174;
						String var157 = ci.ae();

						while (var0.an(var157) > var123) {
							var157 = var157.substring(1);
						}

						zv.uj(var0, zv.ay(var157) + (client.dv_fld % 40 < 20 ? gd.ag(16776960, -1940547058) + db.az_fld : ""), bn.ck_fld + 180 - 34, var61, 16777215, 0);
						var61 += 15;
						int var178 = 180 + bn.ck_fld - 80;
						short var190 = 321;
						qv.cx_fld.ad(var178 - 73, var190 - 20);
						var0.ap(kh.kh_fld, var178, 5 + var190, 16777215, 0);
						var178 = 80 + bn.ck_fld + 180;
						qv.cx_fld.ad(var178 - 73, var190 - 20);
						var0.ap(kh.kr_fld, var178, var190 + 5, 16777215, 0);
						var190 = 356;
						var1.ap(kh.ke_fld, bh.cb_fld, var190, 268435455, 0);
					} else if (6 == bn.co_fld) {
						short var66 = 201;
						var0.ap(bn.ci_fld, bn.ck_fld + 180, var66, 16776960, 0);
						int var67 = var66 + 15;
						var0.ap(bn.cj_fld, 180 + bn.ck_fld, var67, 16776960, 0);
						var67 += 15;
						var0.ap(bn.ch_fld, bn.ck_fld + 180, var67, 16776960, 0);
						var67 += 15;
						int var124 = 180 + bn.ck_fld;
						short var158 = 321;
						qv.cx_fld.ad(var124 - 73, var158 - 20);
						var0.ap(kh.kr_fld, var124, 5 + var158, 16777215, 0);
					} else if (bn.co_fld == 7) {
						if (var3 == -776631127) {
							return;
						}

						if (fv.dh_fld && !client.gz_fld) {
							if (var3 == -776631127) {
								return;
							}

							short var74 = 201;
							var0.ap(bn.ci_fld, bh.cb_fld, var74, 16776960, 0);
							int var75 = var74 + 15;
							var0.ap(bn.cj_fld, bh.cb_fld, var75, 16776960, 0);
							var75 += 15;
							var0.ap(bn.ch_fld, bh.cb_fld, var75, 16776960, 0);
							int var127 = bh.cb_fld - 150;
							var75 += 10;

							for (int var160 = 0; var160 < 8; var160++) {
								if (var3 == -776631127) {
									return;
								}

								qv.cx_fld.ah(var127, var75, 30, 40);
								boolean var10000 = var160 == bn.bb_fld;
								boolean var223;
								if (client.dv_fld % 40 < 20) {
									if (var3 == -776631127) {
										return;
									}

									var223 = true;
								} else {
									var223 = false;
								}

								boolean var180 = var10000 & var223;
								zv.uj(
									var0,
									(bn.cd_fld[var160] == null ? "" : bn.cd_fld[var160]) + (var180 ? gd.ag(16776960, -1940547058) + db.az_fld : ""),
									var127 + 10,
									27 + var75,
									16777215,
									0
								);
								if (var160 != 1) {
									if (var3 == -776631127) {
										return;
									}

									if (3 != var160) {
										var127 += 35;
										continue;
									}
								}

								var127 += 50;
								zv.uj(var0, zv.ay("/"), var127 - 13, var75 + 27, 16777215, 0);
							}

							int var161 = bh.cb_fld - 80;
							short var181 = 321;
							qv.cx_fld.ad(var161 - 73, var181 - 20);
							var0.ap("Submit", var161, 5 + var181, 16777215, 0);
							var161 = bh.cb_fld + 80;
							qv.cx_fld.ad(var161 - 73, var181 - 20);
							var0.ap(kh.ky_fld, var161, 5 + var181, 16777215, 0);
						} else {
							short var70 = 216;
							var0.ap(kh.lz_fld, 180 + bn.ck_fld, var70, 16776960, 0);
							int var71 = var70 + 15;
							var2.ap(kh.lk_fld, bn.ck_fld + 180, var71, 16776960, 0);
							var71 += 15;
							var2.ap(kh.lm_fld, bn.ck_fld + 180, var71, 16776960, 0);
							var71 += 15;
							int var125 = 180 + bn.ck_fld - 80;
							short var159 = 321;
							qv.cx_fld.ad(var125 - 73, var159 - 20);
							var0.ap(kh.lc_fld, var125, var159 + 5, 16777215, 0);
							var125 = 80 + bn.ck_fld + 180;
							qv.cx_fld.ad(var125 - 73, var159 - 20);
							var0.ap(kh.kr_fld, var125, 5 + var159, 16777215, 0);
						}
					} else if (bn.co_fld == 8) {
						short var78 = 216;
						var0.ap(kh.go_fld, bn.ck_fld + 180, var78, 16776960, 0);
						int var79 = var78 + 15;
						var2.ap(kh.gn_fld, 180 + bn.ck_fld, var79, 16776960, 0);
						var79 += 15;
						var2.ap(kh.gh_fld, 180 + bn.ck_fld, var79, 16776960, 0);
						var79 += 15;
						int var128 = 180 + bn.ck_fld - 80;
						short var163 = 321;
						qv.cx_fld.ad(var128 - 73, var163 - 20);
						var0.ap(kh.gr_fld, var128, var163 + 5, 16777215, 0);
						var128 = 180 + bn.ck_fld + 80;
						qv.cx_fld.ad(var128 - 73, var163 - 20);
						var0.ap(kh.kr_fld, var128, 5 + var163, 16777215, 0);
					} else if (9 == bn.co_fld) {
						short var82 = 221;
						var0.ap(bn.ci_fld, bn.ck_fld + 180, var82, 16776960, 0);
						int var83 = var82 + 25;
						var0.ap(bn.cj_fld, bn.ck_fld + 180, var83, 16776960, 0);
						var83 += 25;
						var0.ap(bn.ch_fld, bn.ck_fld + 180, var83, 16776960, 0);
						int var130 = bn.ck_fld + 180;
						short var164 = 311;
						qv.cx_fld.ad(var130 - 73, var164 - 20);
						var0.ap(kh.kz_fld, var130, 5 + var164, 16777215, 0);
					} else if (10 == bn.co_fld) {
						int var85 = 180 + bn.ck_fld;
						short var131 = 209;
						var0.ap(kh.jl_fld, 180 + bn.ck_fld, var131, 16776960, 0);
						int var132 = var131 + 20;
						vn.cs_fld.ad(var85 - 109, var132);
						if (bn.ct_fld.isEmpty()) {
							ij.cp_fld.ad(var85 - 48, 18 + var132);
						} else {
							ij.cp_fld.ad(var85 - 48, var132 + 5);
							var0.ap(bn.ct_fld, var85, var132 + 68 - 15, 16776960, 0);
						}
					} else if (12 == bn.co_fld) {
						int var86 = bh.cb_fld;
						short var133 = 216;
						var2.ap(kh.lh_fld, var86, var133, 16777215, 0);
						int var134 = var133 + 17;
						var2.ap(kh.ly_fld, var86, var134, 16777215, 0);
						var134 += 17;
						var2.ap(kh.lv_fld, var86, var134, 16777215, 0);
						var134 += 17;
						var2.ap(kh.mt_fld, var86, var134, 16777215, 0);
						var86 = bh.cb_fld - 80;
						short var137 = 311;
						qv.cx_fld.ad(var86 - 73, var137 - 20);
						var0.ap(kh.mh_fld, var86, var137 + 5, 16777215, 0);
						var86 = bh.cb_fld + 80;
						qv.cx_fld.ad(var86 - 73, var137 - 20);
						var0.ap(kh.my_fld, var86, 5 + var137, 16777215, 0);
					} else if (13 == bn.co_fld) {
						if (var3 == -776631127) {
							return;
						}

						short var89 = 231;
						var2.ap(kh.ma_fld, 180 + bn.ck_fld, var89, 16777215, 0);
						int var90 = var89 + 20;
						var2.ap(kh.mv_fld, 180 + bn.ck_fld, var90, 16777215, 0);
						int var138 = bn.ck_fld + 180;
						short var91 = 311;
						qv.cx_fld.ad(var138 - 73, var91 - 20);
						var0.ap(kh.kr_fld, var138, var91 + 5, 16777215, 0);
					} else if (bn.co_fld == 14) {
						short var92 = 201;
						String var139 = "";
						String var165 = "";
						String var182 = "";
						switch (bn.bi_fld) {
							case 0:
								var139 = kh.co_fld;
								var165 = kh.cu_fld;
								var182 = kh.ci_fld;
								break;
							case 1:
								var139 = kh.ex_fld;
								var165 = kh.eo_fld;
								var182 = kh.ec_fld;
								break;
							case 2:
								var139 = kh.fn_fld;
								var165 = kh.ft_fld;
								var182 = kh.fd_fld;
								break;
							default:
								lu.ai(false, (byte)-27);
						}

						var0.ap(var139, bn.ck_fld + 180, var92, 16776960, 0);
						int var93 = var92 + 20;
						var0.ap(var165, bn.ck_fld + 180, var93, 16776960, 0);
						var93 += 20;
						var0.ap(var182, bn.ck_fld + 180, var93, 16776960, 0);
						int var192 = 180 + bn.ck_fld;
						short var198 = 276;
						qv.cx_fld.ad(var192 - 73, var198 - 20);
						if (1 == bn.bi_fld) {
							var0.ap(kh.cv_fld, var192, 5 + var198, 16777215, 0);
						} else {
							var0.ap(kh.cq_fld, var192, var198 + 5, 16777215, 0);
						}

						var192 = 180 + bn.ck_fld;
						var198 = 326;
						qv.cx_fld.ad(var192 - 73, var198 - 20);
						var0.ap(kh.kr_fld, var192, 5 + var198, 16777215, 0);
					} else if (24 == bn.co_fld) {
						if (var3 == -776631127) {
							return;
						}

						short var95 = 221;
						var0.ap(bn.ci_fld, bn.ck_fld + 180, var95, 16777215, 0);
						int var96 = var95 + 15;
						var0.ap(bn.cj_fld, 180 + bn.ck_fld, var96, 16777215, 0);
						var96 += 15;
						var0.ap(bn.ch_fld, bn.ck_fld + 180, var96, 16777215, 0);
						var96 += 15;
						int var140 = bn.ck_fld + 180;
						short var166 = 301;
						qv.cx_fld.ad(var140 - 73, var166 - 20);
						var0.ap(kh.ab_fld, var140, 5 + var166, 16777215, 0);
					} else if (bn.co_fld == 32) {
						short var99 = 216;
						var0.ap(kh.lz_fld, bn.ck_fld + 180, var99, 16776960, 0);
						int var100 = var99 + 15;
						var2.ap(kh.lk_fld, 180 + bn.ck_fld, var100, 16776960, 0);
						var100 += 15;
						var2.ap(kh.lm_fld, bn.ck_fld + 180, var100, 16776960, 0);
						var100 += 15;
						int var141 = bn.ck_fld + 180 - 80;
						short var167 = 321;
						qv.cx_fld.ad(var141 - 73, var167 - 20);
						var0.ap(kh.lc_fld, var141, var167 + 5, 16777215, 0);
						var141 = 80 + bn.ck_fld + 180;
						qv.cx_fld.ad(var141 - 73, var167 - 20);
						var0.ap(kh.kr_fld, var141, var167 + 5, 16777215, 0);
					} else if (33 == bn.co_fld) {
						short var103 = 201;
						var0.ap(bn.ci_fld, bn.ck_fld + 180, var103, 16776960, 0);
						int var104 = var103 + 20;
						var1.ap(bn.cj_fld, bn.ck_fld + 180, var104, 16776960, 0);
						var104 += 20;
						var1.ap(bn.ch_fld, 180 + bn.ck_fld, var104, 16776960, 0);
						var104 += 15;
						int var143 = bn.ck_fld + 180;
						short var168 = 276;
						qv.cx_fld.ad(var143 - 73, var168 - 20);
						var2.ap(kh.me_fld, var143, var168 + 5, 16777215, 0);
						var143 = bn.ck_fld + 180;
						var168 = 326;
						qv.cx_fld.ad(var143 - 73, var168 - 20);
						var2.ap(kh.kr_fld, var143, var168 + 5, 16777215, 0);
					} else if (34 == bn.co_fld) {
						short var107 = 201;
						var0.ap(bn.ci_fld, 180 + bn.ck_fld, var107, 16776960, 0);
						int var108 = var107 + 20;
						var1.ap(bn.cj_fld, bn.ck_fld + 180, var108, 16776960, 0);
						var108 += 20;
						var1.ap(bn.ch_fld, bn.ck_fld + 180, var108, 16776960, 0);
						int var145 = 180 + bn.ck_fld;
						short var170 = 276;
						qv.cx_fld.ad(var145 - 73, var170 - 20);
						String var219;
						if (ct.ar_fld != null) {
							if (var3 == -776631127) {
								return;
							}

							var219 = kh.mq_fld;
						} else {
							var219 = kh.mk_fld;
						}

						String var183 = var219;
						var2.ap(var183, var145, 5 + var170, 16777215, 0);
						var145 = 180 + bn.ck_fld;
						var170 = 326;
						qv.cx_fld.ad(var145 - 73, var170 - 20);
						var2.ap(kh.kr_fld, var145, var170 + 5, 16777215, 0);
					}
				}

				if (client.cl_fld >= 10) {
					int[] var110 = new int[4];
					yu.dy(var110);
					yu.dg(bn.bo_fld, 0, 765 + bn.bo_fld, bc.qx_fld);
					ce.lm(do_.bp_fld, bn.bo_fld - 22, client.dv_fld, (byte)-17);
					ce.lm(do_.bp_fld, 22 + bn.bo_fld + 765 - 128, client.dv_fld, (byte)9);
					yu.di(var110);
				}

				jm.ca_fld[cx.kq_fld.as((short)27068) ? 1 : 0].ad(bn.bo_fld + 765 - 40, 463);
				if (client.cl_fld > 5) {
					if (var3 == -776631127) {
						return;
					}

					if (ku.gi_fld == xh.ak_fld) {
						if (var3 == -776631127) {
							return;
						}

						if (hc.da_fld != null) {
							int var111 = 5 + bn.bo_fld;
							short var147 = 463;
							byte var172 = 100;
							byte var184 = 35;
							hc.da_fld.ad(var111, var147);
							var0.ap(kh.hv_fld + " " + client.ch_fld, var172 / 2 + var111, var147 + var184 / 2 - 2, 16777215, 0);
							if (ct.ar_fld != null) {
								var1.ap(kh.mq_fld, var172 / 2 + var111, 12 + var147 + var184 / 2, 16777215, 0);
							} else {
								var1.ap(kh.md_fld, var111 + var172 / 2, 12 + var147 + var184 / 2, 16777215, 0);
							}
						} else {
							hc.da_fld = dq.aw(gz.hy_fld, "sl_button", "");
						}
					}
				}
			}
		} catch (Throwable var25) {
			throw new RuntimeException(var25);
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lgd;)I"
	)
	public static int kk(gd var0) {
		return var0.aw_fld.au((short)-14022);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BII)Z"
	)
	static boolean as(dx var0, byte[] var1, int var2, int var3) throws EOFException {
		try {
			return kq.af(var1, var2, var3, var0.ah_fld - 1, var0.aw_fld - 1);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}
}
