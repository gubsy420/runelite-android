import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qk")
public class qk {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljavax/net/ssl/HttpsURLConnection;"
	)
	HttpsURLConnection ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	qt ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 474696075
	)
	int aw_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	vd av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ae_fld = false;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ah_fld = false;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	qe az_fld;

	public qk(URL var1, qe var2, boolean var3) throws IOException, UnsupportedEncodingException {
		this(var1, var2, new qt(), var3);
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lqk;)Z"
	)
	public static boolean dl(qk var0) throws IOException, ProtocolException, UnsupportedEncodingException {
		if (!var0.ae_fld) {
			ct(var0, (byte)29);
		}

		var0.ak_fld.connect();
		return var0.ak_fld.getResponseCode() == -1;
	}

	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I)Lqt;"
	)
	public static qt ua(qk var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld;
	}

	public qk(URL var1, qe var2, qt var3, boolean var4) throws IOException, UnsupportedEncodingException {
		this.aw_fld = 1211463584;
		if (!var2.ak(1876125894)) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.az());
		} else {
			this.ak_fld = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.ak_fld.setSSLSocketFactory(qz.ak());
			}

			this.az_fld = var2;
			this.ag_fld = null != var3 ? var3 : new qt();
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lqk;)Z"
	)
	public static boolean kz(qk var0) throws IOException, ProtocolException, UnsupportedEncodingException {
		if (!var0.ae_fld) {
			ct(var0, (byte)-27);
		}

		var0.ak_fld.connect();
		return var0.ak_fld.getResponseCode() == -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lqt;"
	)
	public qt aw() {
		return this.ag_fld;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I)Lqx;"
	)
	public static qx it(qk var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			try {
				if (!var0.ae_fld || var0.ak_fld.getResponseCode() == -1) {
					return new qx("No REST response has been received yet.");
				}
			} catch (IOException var11) {
				var0.ak_fld.disconnect();
				return new qx("Error decoding REST response code: " + var11.getMessage());
			}

			qx var4;
			try {
				return new qx(var0.ak_fld);
			} catch (IOException var9) {
				var4 = new qx("Error decoding REST response: " + var9.getMessage());
			} finally {
				var0.ak_fld.disconnect();
			}

			return var4;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvd;I)V"
	)
	public void ag(vd var1) {
		if (!this.ae_fld) {
			if (null == var1) {
				this.ag_fld.ah("Content-Type", (byte)-95);
				this.av_fld = null;
			} else {
				this.av_fld = var1;
				if (this.av_fld.ak(1557254738) != null) {
					this.ag_fld.ay(this.av_fld.ak(1557254738));
				} else {
					qt.mz(this.ag_fld, -3986505);
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean an() throws IOException, ProtocolException, UnsupportedEncodingException {
		if (!this.ae_fld) {
			ct(this, (byte)74);
		}

		this.ak_fld.connect();
		return this.ak_fld.getResponseCode() == -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean av() throws IOException, ProtocolException, UnsupportedEncodingException {
		if (!this.ae_fld) {
			ct(this, (byte)75);
		}

		this.ak_fld.connect();
		return this.ak_fld.getResponseCode() == -1;
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lqk;)V"
	)
	public static void my(qk var0) throws ProtocolException, UnsupportedEncodingException {
		if (!var0.ae_fld) {
			var0.ak_fld.setRequestMethod(var0.az_fld.az());
			var0.ag_fld.ak(var0.ak_fld);
			if (var0.az_fld.aw() && null != var0.av_fld) {
				var0.ak_fld.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(var0.av_fld.ag(1486071840));
					var1.writeTo(var0.ak_fld.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}
				}
			}

			var0.ak_fld.setConnectTimeout(var0.aw_fld);
			var0.ak_fld.setInstanceFollowRedirects(var0.ah_fld);
			var0.ae_fld = true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvd;)V"
	)
	public void ay(vd var1) {
		if (!this.ae_fld) {
			if (null == var1) {
				this.ag_fld.ah("Content-Type", (byte)-6);
				this.av_fld = null;
			} else {
				this.av_fld = var1;
				if (this.av_fld.ak(1557254738) != null) {
					this.ag_fld.ay(this.av_fld.ak(1557254738));
				} else {
					qt.mz(this.ag_fld, -443012565);
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvd;)V"
	)
	public void as(vd var1) {
		if (!this.ae_fld) {
			if (null == var1) {
				this.ag_fld.ah("Content-Type", (byte)-76);
				this.av_fld = null;
			} else {
				this.av_fld = var1;
				if (this.av_fld.ak(1557254738) != null) {
					this.ag_fld.ay(this.av_fld.ak(1557254738));
				} else {
					qt.mz(this.ag_fld, -716847042);
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvd;)V"
	)
	public void af(vd var1) {
		if (!this.ae_fld) {
			if (null == var1) {
				this.ag_fld.ah("Content-Type", (byte)-71);
				this.av_fld = null;
			} else {
				this.av_fld = var1;
				if (this.av_fld.ak(1557254738) != null) {
					this.ag_fld.ay(this.av_fld.ak(1557254738));
				} else {
					qt.mz(this.ag_fld, 1499229479);
				}
			}
		}
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "(Lox;Lxi;)V"
	)
	public static void yn(ox var0, xi var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			var0.az(var1, var2);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ax() throws IOException, ProtocolException, UnsupportedEncodingException {
		if (!this.ae_fld) {
			ct(this, (byte)60);
		}

		this.ak_fld.connect();
		return this.ak_fld.getResponseCode() == -1;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V"
	)
	static void fv(int var0, String var1, int var2) {
		int var3 = client.db_fld.al_fld;
		int[] var4 = client.db_fld.ar_fld;
		boolean var5 = false;
		aax var6 = new aax(var1, fr.gv_fld);
		dx var7 = client.da_fld.ae(client.es_fld, (byte)-46);
		dx var8 = var7;
		if (null == var7) {
			if (var2 == 966695779) {
				io.ag(4, "", kh.hr_fld + var1 + ", current world null.");
			}
		} else {
			for (int var9 = 0; var9 < var3; var9++) {
				cv var10 = (cv)var8.au_fld.ae(var4[var9]);
				if (var10 != null && client.dj_fld != var10.bq_fld && null != var10.az_fld && var10.az_fld.equals(var6)) {
					if (var0 == 1) {
						jm var11 = gi.ak(jb.ca_fld, client.appletStub.av_fld);
						var11.ay_fld.bq(0);
						var11.ay_fld.ek(var4[var9]);
						client.appletStub.az(var11);
					} else if (4 == var0) {
						jm var12 = gi.ak(jb.aj_fld, client.appletStub.av_fld);
						var12.ay_fld.ea(0);
						xi.vy(var12.ay_fld, var4[var9]);
						client.appletStub.az(var12);
					} else if (6 == var0) {
						jm var13 = gi.ak(jb.db_fld, client.appletStub.av_fld);
						var13.ay_fld.ek(var4[var9]);
						var13.ay_fld.ea(0);
						client.appletStub.az(var13);
					} else if (var0 == 7) {
						if (var2 != 966695779) {
							return;
						}

						jm var14 = gi.ak(jb.bp_fld, client.appletStub.av_fld);
						var14.ay_fld.cx(0);
						var14.ay_fld.ba(var4[var9]);
						client.appletStub.az(var14);
					}

					var5 = true;
					break;
				}
			}

			if (!var5) {
				if (var2 != 966695779) {
					return;
				}

				io.ag(4, "", kh.hr_fld + var1);
			}
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lqk;B)V"
	)
	public static void ct(qk var0, byte var1) throws ProtocolException, UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.ae_fld) {
			var0.ak_fld.setRequestMethod(var0.az_fld.az());
			var0.ag_fld.ak(var0.ak_fld);
			if (var0.az_fld.aw() && null != var0.av_fld) {
				var0.ak_fld.setDoOutput(true);
				ByteArrayOutputStream var2 = new ByteArrayOutputStream();

				try {
					var2.write(var0.av_fld.ag(857916643));
					var2.writeTo(var0.ak_fld.getOutputStream());
				} catch (IOException var12) {
					var12.printStackTrace();
				} finally {
					try {
						var2.close();
					} catch (IOException var11) {
						var11.printStackTrace();
					}
				}
			}

			var0.ak_fld.setConnectTimeout(var0.aw_fld);
			var0.ak_fld.setInstanceFollowRedirects(var0.ah_fld);
			var0.ae_fld = true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lqx;"
	)
	qx aq() {
		try {
			if (!this.ae_fld || this.ak_fld.getResponseCode() == -1) {
				return new qx("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.ak_fld.disconnect();
			return new qx("Error decoding REST response code: " + var10.getMessage());
		}

		qx var3;
		try {
			return new qx(this.ak_fld);
		} catch (IOException var8) {
			var3 = new qx("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.ak_fld.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lqx;"
	)
	qx am() {
		try {
			if (!this.ae_fld || this.ak_fld.getResponseCode() == -1) {
				return new qx("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.ak_fld.disconnect();
			return new qx("Error decoding REST response code: " + var10.getMessage());
		}

		qx var3;
		try {
			return new qx(this.ak_fld);
		} catch (IOException var8) {
			var3 = new qx("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.ak_fld.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	static final void fq(int var0, int var1, int var2, int var3, byte var4) throws EOFException {
		if (client.ee_fld == 0 && !client.nk_fld) {
			int var5 = var0 - var2;
			int var6 = var1 - var3;
			int[] var7 = new int[cx.as(client.da_fld, (byte)-2)];
			float[] var8 = new float[cx.as(client.da_fld, (byte)44)];
			int var9 = 0;

			for (Iterator var10 = client.da_fld.iterator(); var10.hasNext(); var9++) {
				dx var11 = (dx)(dx)var10.next();
				var7[var9] = var11.ag_fld;
				var8[var9] = var11.az_fld.bc_fld;
			}

			mj.ar(var8, var7);
			HashMap var46 = new HashMap();

			for (int var43 = var7.length - 1; var43 >= 0; var43--) {
				if (var8[var43] > 0.0F || 0 == var7[var43]) {
					ss var48 = client.da_fld.au(var7[var43], 521201413);
					if (!var46.containsKey(var48)) {
						var46.put(var48, var7[var43]);
					}
				}
			}

			for (int var44 = 0; var44 < var7.length; var44++) {
				int var49 = var7[var44];
				ss var12 = client.da_fld.au(var49, 1753697475);
				Integer var13 = (Integer)(Integer)var46.get(var12);
				if (var13 != null && var13.equals(var49)) {
					if (var12 == ss.ag_fld) {
						ky.fl(kh.he_fld, "", 23, 0, var5, var6, 0, false, var49);
					} else if (var12 == ss.az_fld) {
						int var14 = client.fn_fld / 2;
						int var15 = client.ft_fld / 2;
						int var16 = client.fd_fld;
						ev var18 = bw.dk_fld.az_fld;
						int var19 = client.nb_fld;
						int var20 = ke.jd_fld;
						int var21 = cs.jy_fld;
						int var22 = gk.jc_fld;
						float var23 = 1.0E-5F;
						ej.bk_fld = false;
						en.ax(var18.ci_fld, var18.cj_fld, var18.ch_fld, var18.ct_fld, var14, var15, var16);
						tu var24 = sh.ak(0.0F, 1.0F, 0.0F);
						tu var26 = ej.br_fld;
						float var25 = var24.aa(var26);
						tu var17;
						if (Math.abs(var25) < 1.0E-5F) {
							var24.ah();
							var17 = null;
						} else {
							tu var28 = sh.ak(var20, var21, var22);
							tu var29 = sh.ak(var28.ar_fld, var28.ay_fld - var19, var28.as_fld);
							float var30 = -da.az(var24, var29) / var25;
							var24.ah();
							if (var30 < 0.0F) {
								var29.ah();
								var28.ah();
								var17 = null;
							} else {
								tu var31 = ol.ae(ej.br_fld, var30);
								tu var33;
								synchronized (tu.ae_fld) {
									if (tu.aw_fld == 0) {
										var33 = new tu(var28);
									} else {
										tu.fu(tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465], var28, -1645983469);
										var33 = tu.ae_fld[tu.aw_fld];
									}
								}

								var33.au(var31);
								var31.ah();
								var29.ah();
								var28.ah();
								var17 = var33;
							}
						}

						tu var66 = var17;
						if (null != var17) {
							var24 = sh.ak(client.nw_fld, client.nb_fld, client.nd_fld);
							synchronized (tu.ae_fld) {
								if (0 == tu.aw_fld) {
									var26 = new tu(var66);
								} else {
									tu.fu(tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465], var66, -1645983469);
									var26 = tu.ae_fld[tu.aw_fld];
								}
							}

							var26.an(var24);
							tu var93 = dn.av(tu.az_fld, var26);
							float var99 = (float)Math.atan2(da.az(var93, tu.ag_fld), da.az(tu.az_fld, var26));
							int var104 = (int)(2048.0 * (var99 / (Math.PI * 2))) & 2047;
							int var107 = tc.ah(var104);
							ky.fl(kh.hd_fld, "", 60, var107, 0, 0, 0, false, var49);
							var24.ah();
							var26.ah();
							var93.ah();
							var17.ah();
						}
					}
				}
			}
		}

		long var39 = -1L;
		int var40 = 0;

		for (int var41 = 0; var41 < ip.ak(); var41++) {
			long var45 = ej.cc_fld[var41];
			if (var45 != -1L) {
				int var52 = (int)(var45 >>> 0 & 127L);
				int var54 = var52;
				int var56 = jf.av(var45);
				int var58 = (int)(var45 >>> 16 & 7L);
				int var61 = bj.ae(var45);
				int var62 = ty.ah(var45);
				dx var63 = null;
				rg var64 = null;
				if (0 == var62) {
					if (var4 != 25) {
						return;
					}

					var63 = bw.dk_fld;
				} else {
					var64 = (rg)bw.dk_fld.an_fld.ak(var62);
					if (var64 != null) {
						if (var64.av(-1345832895)) {
							continue;
						}

						var63 = var64.ah_fld;
					}
				}

				if (var63 != null) {
					int var67 = -1;
					if (client.es_fld == var62) {
						var67 = var63.ae_fld;
					} else if (0 == client.es_fld) {
						if (var4 != 25) {
							return;
						}

						var67 = oy.ib(var64.aw_fld, (byte)16);
					} else {
						rg var70 = dx.eg();
						if (var70 != null) {
							dx var76 = var70.ah_fld;
							if (var76.ae_fld == oy.ib(var70.aw_fld, (byte)28)) {
								if (var62 == 0) {
									var67 = var70.ak(-1254551839);
								} else {
									var67 = oy.ib(var64.aw_fld, (byte)46);
								}
							}
						}
					}

					var67 = var67;
					if (var67 != -1) {
						if (var58 == 2) {
							if (var4 != 25) {
								return;
							}

							if (var63.az_fld.cx(var67, var52, var56, var45) >= 0) {
								if (var4 != 25) {
									return;
								}

								oe var71 = ko.az(var61);
								if (var71.dy_fld != null) {
									var71 = oe.bm(var71, (byte)102);
								}

								if (var71 == null) {
									continue;
								}

								cs var77 = null;

								for (cs var85 = (cs)var63.ai_fld.aw(); null != var85; var85 = (cs)na.iy(var63.ai_fld)) {
									if (var67 == var85.ag_fld && var85.av_fld == var54 && var85.ae_fld == var56 && var85.as_fld == var61) {
										var77 = var85;
										break;
									}
								}

								if (!on.kb_fld && client.ee_fld == 1) {
									ky.fl(kh.hj_fld, client.it_fld + " " + db.ah_fld + " " + gd.ag(65535, -1940547058) + var71.cg_fld, 1, var61, var54, var56, -1, false, var62);
								} else if (client.nk_fld) {
									if (!on.kb_fld && 4 == (ms.ne_fld & 4)) {
										ky.fl(client.om_fld, client.oh_fld + " " + db.ah_fld + " " + gd.ag(65535, -1940547058) + var71.cg_fld, 2, var61, var54, var56, -1, false, var62);
									}
								} else {
									if (var71.ak((byte)27).ak(-1156672079)) {
										for (int var86 = 4; var86 >= 0; var86--) {
											if (!on.kb_fld) {
												if (var4 != 25) {
													return;
												}

												if (var77 == null || var77.az(var86)) {
													String var94 = var71.ak((byte)86).ae(var86, rt.ag_fld, 1899227782);
													if (null != var77 && var77.av(var86)) {
														var94 = var77.ae(var86);
													}

													if (client.cp_fld) {
														var94 = hp.be(var94, var86);
													}

													if (null != var94) {
														short var100 = 0;
														if (var86 == 0) {
															if (var4 != 25) {
																return;
															}

															var100 = 3;
														}

														if (1 == var86) {
															var100 = 4;
														}

														if (var86 == 2) {
															var100 = 5;
														}

														if (var86 == 3) {
															var100 = 6;
														}

														if (var86 == 4) {
															var100 = 1001;
														}

														int var105 = ky.fl(var94, gd.ag(65535, -1940547058) + var71.cg_fld, var100, var61, var54, var56, -1, false, var62);
														pg.fs(var105, var71.ak((byte)72), var86, gd.ag(65535, -1940547058) + var71.cg_fld, var100, var61, var54, var56, var62, -1355642205);
													}
												}
											}
										}
									}

									ky.fl(kh.hp_fld, gd.ag(65535, -1940547058) + var71.cg_fld, 1002, var71.cn_fld, var54, var56, -1, false, var62);
								}
							}
						}

						if (1 == var58) {
							ds var72 = (ds)var63.ax_fld.ae(var61);
							if (var72 == null) {
								continue;
							}

							if (1 == var72.ah_fld.cw_fld * 1161975113 && 64 == (var72.bi_fld & 127) && 64 == (var72.dm_fld & 127)) {
								for (int var78 = 0; var78 < var63.am_fld.az(); var78++) {
									ds var87 = (ds)var63.ax_fld.ae(yw.wk(var63.am_fld, var78, (byte)85));
									if (null != var87) {
										if (var4 != 25) {
											return;
										}

										if (var72 != var87 && var87.ah_fld.cw_fld * 1161975113 == 1 && var87.bi_fld == var72.bi_fld && var72.dm_fld == var87.dm_fld) {
											hy.fu(var87, var87.bq_fld, var54, var56, var62);
										}
									}
								}

								int var79 = client.db_fld.al_fld;
								int[] var88 = client.db_fld.ar_fld;

								for (int var95 = 0; var95 < var79; var95++) {
									if (var4 != 25) {
										return;
									}

									cv var101 = (cv)var63.au_fld.ae(var88[var95]);
									if (var101 != null && var72.bi_fld == var101.bi_fld && var101.dm_fld == var72.dm_fld) {
										me.fi(var101, var88[var95], var54, var56, var62);
									}
								}
							}

							hy.fu(var72, var61, var54, var56, var62);
						}

						if (var58 == 0) {
							cv var73 = (cv)var63.au_fld.ae(var61);
							if (null == var73) {
								if (var4 != 25) {
									return;
								}
								continue;
							}

							if ((var73.bi_fld & 127) == 64) {
								if (var4 != 25) {
									return;
								}

								if ((var73.dm_fld & 127) == 64) {
									for (int var80 = 0; var80 < var63.am_fld.az(); var80++) {
										ds var89 = (ds)var63.ax_fld.ae(yw.wk(var63.am_fld, var80, (byte)3));
										if (var89 != null && 1 == var89.ah_fld.cw_fld * 1161975113 && var89.bi_fld == var73.bi_fld && var89.dm_fld == var73.dm_fld) {
											hy.fu(var89, yw.wk(var63.am_fld, var80, (byte)34), var54, var56, var62);
										}
									}

									int var81 = client.db_fld.al_fld;
									int[] var90 = client.db_fld.ar_fld;

									for (int var96 = 0; var96 < var81; var96++) {
										if (var4 != 25) {
											return;
										}

										cv var102 = (cv)var63.au_fld.ae(var90[var96]);
										if (var102 != null && var102 != var73 && var73.bi_fld == var102.bi_fld && var73.dm_fld == var102.dm_fld) {
											me.fi(var102, var90[var96], var54, var56, var62);
										}
									}
								}
							}

							if (var61 != client.nq_fld) {
								me.fi(var73, var61, var54, var56, var62);
							} else {
								var39 = var45;
								var40 = var62;
							}
						}

						if (var58 == 3) {
							na var74 = var63.aa_fld[var67][var54][var56];
							if (var74 != null) {
								for (dw var82 = (dw)var74.ay(); null != var82; var82 = (dw)var74.ar()) {
									og var91 = kb.ag(var82.ah_fld, -1752383175);
									if (!lj.li_fld && client.ee_fld == 1) {
										ky.fl(
											kh.hj_fld, client.it_fld + " " + db.ah_fld + " " + gd.ag(16748608, -1940547058) + var91.dx_fld, 16, var82.ah_fld, var54, var56, -1, false, var62
										);
									} else if (client.nk_fld) {
										if (!lj.li_fld && 1 == (ms.ne_fld & 1)) {
											ky.fl(
												client.om_fld,
												client.oh_fld + " " + db.ah_fld + " " + gd.ag(16748608, -1940547058) + var91.dx_fld,
												17,
												var82.ah_fld,
												var54,
												var56,
												-1,
												false,
												var62
											);
										}
									} else {
										for (int var97 = 4; var97 >= 0; var97--) {
											if (!lj.li_fld && var82.ag(var97, (short)-10883)) {
												String var103 = og.tk(var91, -2139788883).ae(var97, rt.ag_fld, 1899227782);
												if (client.cp_fld) {
													var103 = hp.be(var103, var97);
												}

												if (var103 != null) {
													if (var4 != 25) {
														return;
													}

													byte var106 = 0;
													if (0 == var97) {
														if (var4 != 25) {
															return;
														}

														var106 = 18;
													}

													if (var97 == 1) {
														var106 = 19;
													}

													if (var97 == 2) {
														var106 = 20;
													}

													if (3 == var97) {
														var106 = 21;
													}

													if (var97 == 4) {
														var106 = 22;
													}

													int var108 = ky.fl(var103, gd.ag(16748608, -1940547058) + var91.dx_fld, var106, var82.ah_fld, var54, var56, -1, false, var62);
													pg.fs(
														var108, og.tk(var91, -2139788883), var97, gd.ag(16748608, -1940547058) + var91.dx_fld, var106, var82.ah_fld, var54, var56, var62, -1355642205
													);
												}
											}
										}

										ky.fl(kh.hp_fld, gd.ag(16748608, -1940547058) + var91.dx_fld, 1004, var82.ah_fld, var54, var56, -1, false, var62);
									}
								}
							}
						}

						if (var58 == 4) {
							var64 = (rg)var63.an_fld.ak(var61);
							if (null != var64) {
								oy var75 = var64.aw_fld;
								if (1 == client.ee_fld) {
									ky.fl(kh.hj_fld, client.it_fld + " " + db.ah_fld + " " + gd.ag(15574765, -1940547058) + var75.at_fld, 61, var61, var54, var56, -1, false, var62);
								} else if (!client.nk_fld) {
									String[] var83 = var75.ac_fld;
									if (var83 != null) {
										for (int var92 = 4; var92 >= 0; var92--) {
											if (var4 != 25) {
												return;
											}

											if (!var64.au(var92, -311238333)) {
												if (var4 != 25) {
													return;
												}
											} else if (null != var83[var92]) {
												byte var98 = 0;
												if (0 == var92) {
													var98 = 63;
												}

												if (1 == var92) {
													var98 = 64;
												}

												if (2 == var92) {
													var98 = 65;
												}

												if (3 == var92) {
													var98 = 66;
												}

												if (4 == var92) {
													var98 = 67;
												}

												ky.fl(var83[var92], gd.ag(15574765, -1940547058) + var75.at_fld, var98, var61, var54, var56, -1, false, var62);
											}
										}
									}

									ky.fl(kh.hp_fld, gd.ag(15574765, -1940547058) + var75.at_fld, 1013, var75.az((byte)-29), var54, var56, -1, false, var62);
								}
							}
						}
					}
				}
			}
		}

		if (-1L != var39) {
			int var42 = (int)(var39 >>> 0 & 127L);
			int var47 = jf.av(var39);
			int var51 = client.nq_fld;
			cx var53 = client.da_fld;
			cv var55 = null;
			Iterator var57 = var53.iterator();

			cv var50;
			while (true) {
				if (!var57.hasNext()) {
					var50 = var55;
					break;
				}

				dx var59 = (dx)(dx)var57.next();
				cv var60 = (cv)var59.au_fld.ae(var51);
				if (var60 != null) {
					if (!var59.ak(-787091592)) {
						var50 = var60;
						break;
					}

					var55 = var60;
				}
			}

			if (null != var50) {
				if (var4 != 25) {
					return;
				}

				me.fi(var50, client.nq_fld, var42, var47, var40);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lqx;"
	)
	qx ai() {
		try {
			if (!this.ae_fld || this.ak_fld.getResponseCode() == -1) {
				return new qx("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.ak_fld.disconnect();
			return new qx("Error decoding REST response code: " + var10.getMessage());
		}

		qx var3;
		try {
			return new qx(this.ak_fld);
		} catch (IOException var8) {
			var3 = new qx("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.ak_fld.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void az(byte var1) throws ProtocolException, UnsupportedEncodingException {
		if (!this.ah_fld) {
			this.ak_fld.setRequestMethod(this.az_fld.az());
			this.ag_fld.ak(this.ak_fld);
			if (this.az_fld.aw() && null != this.av_fld) {
				this.ak_fld.setDoOutput(true);
				ByteArrayOutputStream var2 = new ByteArrayOutputStream();

				try {
					var2.write(this.av_fld.ag(857916643));
					var2.writeTo(this.ak_fld.getOutputStream());
				} catch (IOException var12) {
					var12.printStackTrace();
				} finally {
					try {
						var2.close();
					} catch (IOException var11) {
						var11.printStackTrace();
					}
				}
			}

			this.ak_fld.setConnectTimeout(this.aw_fld);
			this.ak_fld.setInstanceFollowRedirects(this.ae_fld);
			this.ae_fld = true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lqx;"
	)
	qx ae(int var1) {
		try {
			if (!this.ah_fld || this.ak_fld.getResponseCode() == -1) {
				return new qx("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.ak_fld.disconnect();
			return new qx("Error decoding REST response code: " + var11.getMessage());
		}

		qx var4;
		try {
			return new qx(this.ak_fld);
		} catch (IOException var9) {
			var4 = new qx("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.ak_fld.disconnect();
		}

		return var4;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Lcl;Lcv;)V"
	)
	public static void fw(cl var0, cv var1) {
		var0.ak_fld.remove(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lqt;"
	)
	public qt ak(int var1) {
		return this.ag_fld;
	}
}
