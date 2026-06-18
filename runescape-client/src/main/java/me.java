import java.io.EOFException;
import net.runelite.api.MidiRequest;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements({"MidiRequest"})
public class me implements MidiRequest {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ar_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2020637421
	)
	public int ag_fld = 1881600741;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean fv_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1016349043
	)
	public int az_fld = -1165675451;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1153128559
	)
	public int av_fld = 0;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ae_fld = 0.0F;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ah_fld = false;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean aw_fld;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv hz_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean as_fld = false;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	public ap al_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ay_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	public ml af_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public mz au_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public ub ak_fld;

	@ObfuscatedName("getArchiveId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getArchiveId")
	@Override
	public int getArchiveId() {
		return this.ag_fld;
	}

	@ObfuscatedName("xw")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Z)V"
	)
	public static void xw(cn var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ad_fld = var1;
		og.ag();
	}

	public me(ub var1, String var2, String var3, int var4, boolean var5) {
		this.ar_fld = false;
		this.ag_fld = var1.cm(var2, (byte)1);
		this.az_fld = var1.cz(this.ag_fld, var3, -1157701189);
		this.ak(var1, this.ag_fld, this.az_fld, var4, var5, (byte)-74);
	}

	public me(ub var1, int var2, int var3, int var4, boolean var5) {
		this.ar_fld = false;
		this.ak(var1, var2, var3, var4, var5, (byte)-78);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;IIIZB)V"
	)
	void ak(ub var1, int var2, int var3, int var4, boolean var5, byte var6) {
		this.cb(var1, var2, var3, var4, var5);
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ah_fld = var5;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lub;IIIZ)V"
	)
	public void cb(ub var1, int var2, int var3, int var4, boolean var5) {
		uv var6 = (uv)var1;
		this.fv_fld = var6.dy() == 11;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lub;IIIZ)V"
	)
	void ag(ub var1, int var2, int var3, int var4, boolean var5) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ah_fld = var5;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Lcv;IIIII)V"
	)
	static final void fi(cv var0, int var1, int var2, int var3, int var4) throws EOFException {
		try {
			boolean var6 = ev.ti(var0, false);
			if (var6) {
				int var11 = var4;
				int var10 = var3;
				int var9 = var2;
				int var8 = var1;
				cv var7 = var0;
				int var12 = -2132635665;
				if (client.dj_fld != var0.bq_fld && client.nr_fld.ot_fld < 400) {
					int var13 = sq.ei();
					int var14 = on.ee();
					String var15;
					if (var0.au_fld == 0) {
						String var16 = var0.aw_fld[0] + var0.az_fld + var0.aw_fld[1];
						int var18 = var0.ad_fld;
						int var19 = var13 - var18;
						String var17;
						if (var19 < -9) {
							var17 = gd.ag(16711680, -1940547058);
						} else if (var19 < -6) {
							if (var12 >= -2009633436) {
								return;
							}

							var17 = gd.ag(16723968, -1940547058);
						} else if (var19 < -3) {
							var17 = gd.ag(16740352, -1940547058);
						} else if (var19 < 0) {
							var17 = gd.ag(16756736, -1940547058);
						} else if (var19 > 9) {
							var17 = gd.ag(65280, -1940547058);
						} else if (var19 > 6) {
							var17 = gd.ag(4259584, -1940547058);
						} else if (var19 > 3) {
							var17 = gd.ag(8453888, -1940547058);
						} else if (var19 > 0) {
							var17 = gd.ag(12648192, -1940547058);
						} else {
							var17 = gd.ag(16776960, -1940547058);
						}

						var15 = var16 + var17 + " " + db.av_fld + kh.hk_fld + var0.ad_fld + db.ae_fld + var0.aw_fld[2];
					} else {
						var15 = var0.aw_fld[0] + var0.az_fld + var0.aw_fld[1] + " " + db.av_fld + kh.hi_fld + var0.au_fld + db.ae_fld + var0.aw_fld[2];
					}

					if (1 == client.ee_fld) {
						if (var12 >= -2009633436) {
							return;
						}

						ky.fl(kh.hj_fld, client.it_fld + " " + db.ah_fld + " " + gd.ag(16777215, -1940547058) + var15, 14, var1, var2, var3, -1, false, var4);
					} else if (client.nk_fld) {
						if (8 == (ms.ne_fld & 8)) {
							ky.fl(client.om_fld, client.oh_fld + " " + db.ah_fld + " " + gd.ag(16777215, -1940547058) + var15, 15, var1, var2, var3, -1, false, var4);
						}
					} else {
						for (int var21 = 7; var21 >= 0; var21--) {
							if (null != client.nl_fld[var21]) {
								short var23 = 0;
								if (client.nl_fld[var21].equalsIgnoreCase(kh.hb_fld)) {
									if (ca.av_fld == client.lb_fld) {
										continue;
									}

									label195: {
										if (ca.ag_fld != client.lb_fld) {
											if (var12 >= -2009633436) {
												return;
											}

											if (ca.ak_fld != client.lb_fld) {
												break label195;
											}

											if (var12 >= -2009633436) {
												return;
											}

											if (var7.ad_fld <= var13) {
												break label195;
											}

											if (var12 >= -2009633436) {
												return;
											}
										}

										var23 = 2000;
									}

									if (0 != var14 && 0 != var7.ac_fld) {
										if (var14 == var7.ac_fld) {
											var23 = 2000;
										} else {
											var23 = 0;
										}
									} else if (client.lb_fld == ca.ae_fld && var7.at(-725743415)) {
										if (var12 >= -2009633436) {
											return;
										}

										var23 = 2000;
									}
								} else if (client.nz_fld[var21]) {
									if (var12 >= -2009633436) {
										return;
									}

									var23 = 2000;
								}

								boolean var24 = false;
								int var25 = client.cx_fld[var21] + var23;
								ky.fl(client.nl_fld[var21], gd.ag(16777215, -1940547058) + var15, var25, var8, var9, var10, -1, false, var11);
							}
						}
					}

					for (int var22 = 0; var22 < client.nr_fld.ot_fld; var22++) {
						if (client.nr_fld.ae_fld[var22] == 23) {
							if (var12 < -2009633436) {
								client.nr_fld.ar_fld[var22] = gd.ag(16777215, -1940547058) + var15;
							}
							break;
						}
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CLxh;I)I"
	)
	static int av(char var0, xh var1) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = (var0 << 4) + 1;
		}

		if (241 == var0 && var1 == xh.ah_fld) {
			var3 = 1762;
		}

		return var3;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(II)Lyo;"
	)
	static yo ha(int var0) throws EOFException {
		try {
			yo var2 = (yo)client.kj_fld.ak(var0);
			if (null == var2) {
				var2 = new yo(wo.iq_fld, var0);
				if (!var2.ak()) {
					return null;
				}

				client.kj_fld.az(var2, var0);
			}

			return var2;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("isJingle")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isJingle")
	@Override
	public boolean isJingle() {
		return this.fv_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public static boolean ag(int var0) {
		return 18 == var0;
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// $VF: Could not properly define all variable types!
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lyz;Lba;III)V"
	)
	static void az(yz var0, ba var1, int var2, int var3, int var4) throws EOFException {
		try {
			client.zt(var1);
			if (og.ci_fld.bb_fld > var2) {
				var2 = og.ci_fld.bb_fld;
			}

			if (var3 > 0 && og.ci_fld.sr_fld > var3) {
				var3 = og.ci_fld.sr_fld;
			}

			int var6 = var2;
			ba var5 = var1;
			yz var33 = var0;
			int var8 = 16711935;
			Object[] var9 = (Object[])var0.az(1697120891);
			gz.ax_fld = 0;
			db.aa_fld = 0;
			ef.aq_fld = 0;
			client.xq_fld = -1;
			int var10 = -1;
			int[] var11 = var1.av_fld;
			int[] var12 = var1.ae_fld;
			int var13 = -1;
			bp.am_fld = 0;
			bp.bm_fld = false;
			boolean var14 = false;
			bp.ao_fld = 0;
			boolean var29 = false /* VF: Semaphore variable */;

			label1344: {
				label1345: {
					try {
						label1284: {
							var29 = true;
							ie.ar_fld = new int[var5.ay_fld];
							int var34 = 0;
							jq.af_fld = new long[var5.as_fld];
							int var35 = 0;
							bp.al_fld = (Object[])(new Object[var5.ar_fld]);
							int var36 = 0;

							for (int var18 = 1; var18 < var9.length; var18++) {
								if (var9[var18] instanceof Integer) {
									int var19 = (Integer)var9[var18];
									if (var19 == -2147483647) {
										var19 = var33.ah(-1762702822);
									}

									if (var19 == -2147483646) {
										var19 = var33.aw(669757382);
									}

									if (-2147483645 == var19) {
										var19 = var33.av((short)-16756) != null ? var33.av((short)16819).bf_fld * 1461045985 : -1;
									}

									if (-2147483644 == var19) {
										var19 = yz.xl(var33, -1913812904);
									}

									if (var19 == -2147483643) {
										var19 = var33.av((short)-17026) != null ? var33.av((short)4287).by_fld * -2140649577 : -1;
									}

									if (-2147483642 == var19) {
										int var10000;
										if (var33.as(1366347087) != null) {
											if (var8 != 16711935) {
												var29 = false;
												return;
											}

											var10000 = var33.as(691457602).bf_fld * 1461045985;
										} else {
											var10000 = -1;
										}

										var19 = var10000;
									}

									if (var19 == -2147483641) {
										var19 = var33.as(129647742) != null ? var33.as(2088338282).by_fld * -2140649577 : -1;
									}

									if (var19 == -2147483640) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										var19 = var33.ar(-450034640);
									}

									if (var19 == -2147483639) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										var19 = yz.qi(var33, 1665838759);
									}

									if (var19 == -2147483638) {
										var19 = var33.al((byte)5);
									}

									ie.ar_fld[var34++] = var19;
								} else if (var9[var18] instanceof String) {
									String var53 = (String)var9[var18];
									if (var53.equals("event_opbase")) {
										var53 = yz.qf(var33, 1764760548);
									}

									bp.al_fld[var36++] = var53;
								} else if (var9[var18] instanceof sl) {
									bp.al_fld[var36++] = var9[var18];
								} else if (var9[var18] instanceof Long) {
									long var54 = (Long)var9[var18];
									jq.af_fld[var35++] = var54;
								}
							}

							bp.br_fld = var33.ax((short)-4929);

							while (true) {
								bp.ao_fld++;
								if (bp.ao_fld > var6) {
									if (var8 == 16711935) {
										throw new RuntimeException();
									}

									var29 = false;
									return;
								}

								do {
									client.xq_fld = ++var10;
									var13 = var11[var10];
								} while (client.kk(var13));

								if (var13 < 100) {
									if (var8 != 16711935) {
										var29 = false;
										return;
									}

									if (var13 == 0) {
										bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12[var10];
									} else if (1 == var13) {
										int var52 = var12[var10];
										bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = rt.ag_fld[var52];
									} else if (var13 == 2) {
										int var51 = var12[var10];
										rt.ag_fld[var51] = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
										client.sc(var51);
										ns.gk(var51, (byte)94);
									} else if (var13 == 3) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var5.ae(var10, -1684678759);
									} else if (6 == var13) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										var10 = client.xq_fld = var10 + var12[var10];
									} else if (var13 == 7) {
										gz.ax_fld -= 2;
										if (bp.au_fld[gz.ax_fld + 1] != bp.au_fld[gz.ax_fld]) {
											if (var8 != 16711935) {
												var29 = false;
												return;
											}

											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (var13 == 8) {
										gz.ax_fld -= 2;
										if (bp.au_fld[gz.ax_fld] == bp.au_fld[1 + gz.ax_fld]) {
											if (var8 != 16711935) {
												var29 = false;
												return;
											}

											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (var13 == 9) {
										gz.ax_fld -= 2;
										if (bp.au_fld[gz.ax_fld] < bp.au_fld[1 + gz.ax_fld]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (var13 == 10) {
										gz.ax_fld -= 2;
										if (bp.au_fld[gz.ax_fld] > bp.au_fld[gz.ax_fld + 1]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (var13 == 68) {
										db.aa_fld -= 2;
										if (bp.an_fld[db.aa_fld] != bp.an_fld[1 + db.aa_fld]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (69 == var13) {
										db.aa_fld -= 2;
										if (bp.an_fld[db.aa_fld] == bp.an_fld[1 + db.aa_fld]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (70 == var13) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										db.aa_fld -= 2;
										if (bp.an_fld[db.aa_fld] < bp.an_fld[db.aa_fld + 1]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (var13 == 71) {
										db.aa_fld -= 2;
										if (bp.an_fld[db.aa_fld] > bp.an_fld[1 + db.aa_fld]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (21 == var13) {
										if (bp.am_fld == 0) {
											var29 = false;
											break label1345;
										}

										bj var49 = bp.ad_fld[(bp.am_fld -= -1774771793) * -991242929];
										ba var91 = var49.ak_fld;
										client.zt(var49.ak_fld);
										var5 = var91;
										var11 = var5.av_fld;
										var12 = var5.ae_fld;
										var10 = client.xq_fld = var49.ag_fld;
										ie.ar_fld = var49.az_fld;
										bp.al_fld = (Object[])var49.av_fld;
										jq.af_fld = var49.ae_fld;
									} else if (var13 == 25) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										int var48 = var12[var10];
										bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = dv.ag(var48, (byte)92);
									} else if (var13 == 27) {
										int var47 = var12[var10];
										es.az(var47, bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
									} else if (var13 == 31) {
										gz.ax_fld -= 2;
										if (bp.au_fld[gz.ax_fld] <= bp.au_fld[gz.ax_fld + 1]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (var13 == 32) {
										gz.ax_fld -= 2;
										if (bp.au_fld[gz.ax_fld] >= bp.au_fld[1 + gz.ax_fld]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (72 == var13) {
										db.aa_fld -= 2;
										if (bp.an_fld[db.aa_fld] <= bp.an_fld[db.aa_fld + 1]) {
											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (var13 == 73) {
										db.aa_fld -= 2;
										if (bp.an_fld[db.aa_fld] >= bp.an_fld[db.aa_fld + 1]) {
											if (var8 != 16711935) {
												var29 = false;
												return;
											}

											var10 = client.xq_fld = var10 + var12[var10];
										}
									} else if (var13 == 33) {
										bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ie.ar_fld[var12[var10]];
									} else if (34 == var13) {
										ie.ar_fld[var12[var10]] = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
									} else if (35 == var13) {
										bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = bp.al_fld[var12[var10]];
									} else if (36 == var13) {
										bp.al_fld[var12[var10]] = bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
									} else if (var13 == 37) {
										int var46 = var12[var10];
										ef.aq_fld -= -211521517 * var46;
										String var62 = kc.ak((Object[])bp.ai_fld, ef.aq_fld, var46);
										bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var62;
									} else if (var13 == 38) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										gz.ax_fld--;
									} else if (39 == var13) {
										ef.aq_fld--;
									} else if (40 == var13) {
										if (bp.am_fld == 50) {
											throw new RuntimeException();
										}

										int var45 = var12[var10];
										ba var61 = an.ak(var45);
										int[] var64 = new int[var61.ay_fld];
										Object[] var21 = (Object[])(new Object[var61.ar_fld]);
										long[] var22 = new long[var61.as_fld];
										if (var61.af_fld >= 0) {
											System.arraycopy(bp.au_fld, 0 + (gz.ax_fld - var61.af_fld), var64, 0, var61.af_fld);
										}

										if (var61.al_fld >= 0) {
											System.arraycopy((Object)bp.ai_fld, 0 + (ef.aq_fld - var61.al_fld), (Object)var21, 0, var61.al_fld);
										}

										if (var61.au_fld >= 0) {
											System.arraycopy(bp.an_fld, 0 + (db.aa_fld - var61.au_fld), var22, 0, var61.au_fld);
										}

										gz.ax_fld = gz.ax_fld - var61.af_fld;
										ef.aq_fld = ef.aq_fld - var61.al_fld;
										db.aa_fld = db.aa_fld - var61.au_fld;
										bj var23 = new bj();
										var23.ak_fld = var5;
										var23.ag_fld = var10;
										var23.az_fld = ie.ar_fld;
										var23.av_fld = (Object[])bp.al_fld;
										var23.ae_fld = jq.af_fld;
										bp.ad_fld[(bp.am_fld += -1774771793) * -991242929 - 1] = var23;
										client.zt(var61);
										var5 = var61;
										var11 = var61.av_fld;
										var12 = var61.ae_fld;
										client.xq_fld = -1;
										var10 = -1;
										ie.ar_fld = var64;
										bp.al_fld = (Object[])var21;
										jq.af_fld = var22;
									} else if (var13 == 42) {
										bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = dn.dd(ob.ek_fld, var12[var10]);
									} else if (43 == var13) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										ob.ek_fld.ak(var12[var10], bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
									} else if (51 == var13) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ob.ek_fld.av(var12[var10]);
									} else if (52 == var13) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										dn.xt(ob.ek_fld, var12[var10], bp.an_fld[(db.aa_fld -= 432101741) * 867932261]);
									} else if (44 == var13) {
										int var44 = var12[var10] >> 16;
										int var60 = var12[var10] & 65535;
										int var63 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
										if (var63 < 0) {
											break;
										}

										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										if (var63 > 5000) {
											break;
										}

										if (var60 == 115) {
											if (var8 != 16711935) {
												var29 = false;
												return;
											}

											bp.al_fld[var44] = new sl(yq.az_fld, "", var63, var63);
										} else if (var60 != 105 && 49 != var60) {
											bp.al_fld[var44] = new sl(yq.ak_fld, -1, var63, var63);
										} else {
											bp.al_fld[var44] = new sl(yq.ak_fld, 0, var63, var63);
										}
									} else if (var13 == 45) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										sl var38 = eh.av(var12[var10], bp.al_fld[var12[var10]]);
										int var56 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
										nb.ae(var38, var56, (byte)116);
										if (yq.ak_fld == var38.ag_fld) {
											bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var38.ak()[var56];
										} else {
											bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var38.az()[var56];
										}
									} else if (46 == var13) {
										sl var39 = eh.av(var12[var10], bp.al_fld[var12[var10]]);
										if (!var39.az_fld) {
											throw new RuntimeException();
										}

										if (var39.ag_fld == yq.ak_fld) {
											gz.ax_fld -= 2;
											int var57 = bp.au_fld[gz.ax_fld];
											nb.ae(var39, var57, (byte)72);
											var39.ak()[var57] = bp.au_fld[1 + gz.ax_fld];
										} else {
											int var58 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
											nb.ae(var39, var58, (byte)111);
											var39.az()[var58] = bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
										}
									} else if (var13 == 49) {
										String var40 = ob.ek_fld.ah(var12[var10]);
										bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var40;
									} else if (var13 == 50) {
										dn.dd(ob.ek_fld, var12[var10], (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525]);
									} else if (var13 == 60) {
										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										xv var41 = var5.ag_fld[var12[var10]];
										vl var59 = (vl)var41.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
										if (null != var59) {
											var10 = client.xq_fld = var10 + var59.ak_fld;
										}
									} else if (63 == var13) {
										bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null;
									} else if (var13 == 61) {
										bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var5.ah(var10, -993964475);
									} else if (62 == var13) {
										db.aa_fld--;
									} else if (var13 == 66) {
										bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = jq.af_fld[var12[var10]];
									} else if (67 == var13) {
										jq.af_fld[var12[var10]] = bp.an_fld[(db.aa_fld -= 432101741) * 867932261];
									} else if (var13 == 74) {
										Integer var42 = gt.be_fld.ae(var12[var10], 26770159);
										if (null == var42) {
											if (var8 != 16711935) {
												var29 = false;
												return;
											}

											bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
										} else {
											bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var42;
										}
									} else {
										if (var13 != 76) {
											throw new IllegalStateException();
										}

										if (var8 != 16711935) {
											var29 = false;
											return;
										}

										Integer var43 = bl.ey_fld.ak(var12[var10]);
										if (null == var43) {
											bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
										} else {
											bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var43;
										}
									}
								} else {
									boolean var37 = 1 == var5.ae_fld[var10];
									int var55 = qo.ah(var13, var5, var37);
									switch (var55) {
										case 0:
											var29 = false;
											break label1284;
										case 1:
										default:
											break;
										case 2:
											throw new IllegalStateException();
									}
								}
							}

							throw new RuntimeException();
						}
					} catch (Exception var30) {
						var14 = true;
						StringBuilder var16 = new StringBuilder(30);
						var16.append("").append(var5.hc_long).append(" ");

						for (int var17 = bp.am_fld - 1; var17 >= 0; var17--) {
							var16.append("").append(bp.ad_fld[var17].ak_fld.hc_long).append(" ");
						}

						var16.append("").append(var13);
						gl.ak(var16.toString(), var30);
						var29 = false;
						break label1344;
					} finally {
						if (var29) {
							while (!bp.bz_fld.isEmpty()) {
								dg var25 = (dg)(dg)bp.bz_fld.remove(0);
								nt.fc(var25.ag(), var25.az(), var25.ak(), var25.av(), "", -1914465086);
							}

							if (bp.bm_fld) {
								if (var8 != 16711935) {
									return;
								}

								bp.bm_fld = false;
								nx.gf(2039700168);
							}

							java.lang.Object var24 = null;
							if (var14) {
								throw (Throwable)var24;
							}

							if (var8 == 16711935) {
								if (var3 <= 0 || bp.ao_fld < var3) {
									throw (Throwable)var24;
								}

								if (var8 == 16711935) {
									gl.ak("Warning: Script " + var5.az_fld + " finished at op count " + bp.ao_fld + " of max " + var6, null);
									throw (Throwable)var24;
								}
							}

							return;
						}
					}

					while (!bp.bz_fld.isEmpty()) {
						dg var20 = (dg)(dg)bp.bz_fld.remove(0);
						nt.fc(var20.ag(), var20.az(), var20.ak(), var20.av(), "", -1789236422);
					}

					if (bp.bm_fld) {
						bp.bm_fld = false;
						nx.gf(2025858625);
					}

					if (!var14 && var3 > 0 && bp.ao_fld >= var3 && var8 == 16711935) {
						gl.ak("Warning: Script " + var5.az_fld + " finished at op count " + bp.ao_fld + " of max " + var6, null);
					}

					return;
				}

				while (!bp.bz_fld.isEmpty()) {
					dg var50 = (dg)(dg)bp.bz_fld.remove(0);
					nt.fc(var50.ag(), var50.az(), var50.ak(), var50.av(), "", -1001745078);
				}

				if (bp.bm_fld) {
					bp.bm_fld = false;
					nx.gf(1916815782);
				}

				if (!var14 && var3 > 0 && bp.ao_fld >= var3 && var8 == 16711935) {
					gl.ak("Warning: Script " + var5.az_fld + " finished at op count " + bp.ao_fld + " of max " + var6, null);
				}

				return;
			}

			while (!bp.bz_fld.isEmpty()) {
				dg var15 = (dg)(dg)bp.bz_fld.remove(0);
				nt.fc(var15.ag(), var15.az(), var15.ak(), var15.av(), "", -1883035552);
			}

			if (bp.bm_fld) {
				bp.bm_fld = false;
				nx.gf(1945929625);
			}

			if (!var14 && var3 > 0 && bp.ao_fld >= var3) {
				gl.ak("Warning: Script " + var5.az_fld + " finished at op count " + bp.ao_fld + " of max " + var6, null);
			}
		} catch (Throwable var32) {
			throw new RuntimeException(var32);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ak(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
