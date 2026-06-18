import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.Projection;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements({"Projection"})
public abstract class fw implements Projection {
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int dh_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedName("xw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int xw_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_int;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	protected static la qz_fld;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int co_fld;

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	public void et(ev var1, fl var2, int var3, int var4) {
		this.az(var1, var2, var3, var4, (byte)-120);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	abstract void ak(em var1, int var2, int var3, int var4, int var5, long var6) throws EOFException;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;IIFFFFFFFFFFFF)V"
	)
	void an(
		ev var1,
		fa var2,
		int var3,
		int var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		float var10,
		float var11,
		float var12,
		float var13,
		float var14,
		float var15,
		float var16
	) {
		try {
			float var17 = fc.aw() + var5 * fc.au() / var13;
			float var18 = fc.ay() + var9 * fc.au() / var13;
			float var19 = fc.aw() + var6 * fc.au() / var14;
			float var20 = fc.ay() + var10 * fc.au() / var14;
			float var21 = fc.aw() + var7 * fc.au() / var15;
			float var22 = fc.ay() + var11 * fc.au() / var15;
			float var23 = fc.aw() + var8 * fc.au() / var16;
			float var24 = fc.ay() + var12 * fc.au() / var16;
			float var25 = ap.av(var13);
			float var26 = ap.av(var14);
			float var27 = ap.av(var15);
			float var28 = ap.av(var16);
			fc.ar_fld.aa_fld = 0;
			if ((var21 - var23) * (var20 - var24) - (var19 - var23) * (var22 - var24) > 0.0F) {
				fc.ar_fld.ax_fld = false;
				int var29 = fc.ax();
				if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
					fc.ar_fld.ax_fld = true;
				}

				if (ev.af(var1.ck_fld, var1.cw_fld, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
					float var30 = sb.au(var1.ck_fld, var1.cw_fld, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26);
					if (var30 > var1.bc_fld) {
						var1.cm_fld = var3;
						var1.dg_fld = var4;
						var1.bc_fld = var30;
					}
				}

				if (-1 == var2.ae_fld) {
					if (var2.az_fld != 12345678) {
						fc.ao(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.az_fld, var2.av_fld, var2.ag_fld);
					}
				} else if (!ev.ac_fld) {
					if (var2.ah_fld) {
						fc.at(
							var22,
							var24,
							var20,
							var21,
							var23,
							var19,
							var27,
							var28,
							var26,
							var2.az_fld,
							var2.av_fld,
							var2.ag_fld,
							(int)var5,
							(int)var6,
							(int)var8,
							(int)var9,
							(int)var10,
							(int)var12,
							(int)var13,
							(int)var14,
							(int)var16,
							var2.ae_fld
						);
					} else {
						fc.at(
							var22,
							var24,
							var20,
							var21,
							var23,
							var19,
							var27,
							var28,
							var26,
							var2.az_fld,
							var2.av_fld,
							var2.ag_fld,
							(int)var7,
							(int)var8,
							(int)var6,
							(int)var11,
							(int)var12,
							(int)var10,
							(int)var15,
							(int)var16,
							(int)var14,
							var2.ae_fld
						);
					}
				} else {
					int var34 = fc.ar_fld.aq_fld.av(var2.ae_fld, (byte)-50);
					fc.ao(var22, var24, var20, var21, var23, var19, var27, var28, var26, ev.ar(var34, var2.az_fld), ev.ar(var34, var2.av_fld), ev.ar(var34, var2.ag_fld));
				}
			}

			if ((var17 - var19) * (var24 - var20) - (var23 - var19) * (var18 - var20) > 0.0F) {
				fc.ar_fld.ax_fld = false;
				int var33 = fc.ax();
				if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var33 || var19 > var33 || var23 > var33) {
					fc.ar_fld.ax_fld = true;
				}

				if (ev.af(var1.ck_fld, var1.cw_fld, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
					float var35 = sb.au(var1.ck_fld, var1.cw_fld, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28);
					if (var35 > var1.bc_fld) {
						var1.cm_fld = var3;
						var1.dg_fld = var4;
						var1.bc_fld = var35;
					}
				}

				if (var2.ae_fld == -1) {
					if (var2.ak_fld != 12345678) {
						fc.ao(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.ak_fld, var2.ag_fld, var2.av_fld);
					}
				} else if (!ev.ac_fld) {
					fc.at(
						var18,
						var20,
						var24,
						var17,
						var19,
						var23,
						var25,
						var26,
						var28,
						var2.ak_fld,
						var2.ag_fld,
						var2.av_fld,
						(int)var5,
						(int)var6,
						(int)var8,
						(int)var9,
						(int)var10,
						(int)var12,
						(int)var13,
						(int)var14,
						(int)var16,
						var2.ae_fld
					);
				} else {
					int var36 = fc.ar_fld.aq_fld.av(var2.ae_fld, (byte)-11);
					fc.ao(var18, var20, var24, var17, var19, var23, var25, var26, var28, ev.ar(var36, var2.ak_fld), ev.ar(var36, var2.ag_fld), ev.ar(var36, var2.av_fld));
				}
			}
		} catch (Throwable var32) {
			throw new RuntimeException(var32);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;IIII)V"
	)
	abstract void ag(ev var1, fa var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;IIB)V"
	)
	abstract void az(ev var1, fl var2, int var3, int var4, byte var5);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;III)V"
	)
	void au(ev var1, fl var2, int var3, int var4, int var5) {
		try {
			fo var6 = fc.ar_fld;
			boolean var7 = og.ci_fld.isGpu();
			if (client.bt_fld != null) {
				client.bt_fld.drawSceneTileModel(var1, var2, var3, var4);
			}

			rl10 var8 = var1.vo_fld[var1.fb_fld.ae_fld * -457350413][var3 + var1.qr_fld][var4 + var1.qr_fld];
			var6.aa_fld = 0;
			int var9 = var2.an_fld.length;

			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = var2.an_fld[var10];
				int var12 = var2.aa_fld[var10];
				int var13 = var2.ai_fld[var10];
				float var14 = fl.az_fld[var11];
				float var15 = fl.az_fld[var12];
				float var16 = fl.az_fld[var13];
				float var17 = fl.av_fld[var11];
				float var18 = fl.av_fld[var12];
				float var19 = fl.av_fld[var13];
				float var20 = fl.ae_fld[var11];
				float var21 = fl.ae_fld[var12];
				float var22 = fl.ae_fld[var13];
				if ((var14 - var15) * (var19 - var18) - (var17 - var18) * (var16 - var15) > 0.0F) {
					if (ev.ou(var1.ck_fld, var1.cw_fld, (int)var17, (int)var18, (int)var19, (int)var14, (int)var15, (int)var16)) {
						float var23 = br(var1.ck_fld, var1.cw_fld, (int)var14, (int)var15, (int)var16, (int)var17, (int)var18, (int)var19, var20, var21, var22);
						if (var23 > var1.bc_fld && xw_fld <= var1.fb_fld.ae_fld * -457350413) {
							var1.wc(var3, var4, var23);
						}

						if (var8 != null
							&& var2 == var8.getSceneTileModel()
							&& var1.ck_fld >= og.ci_fld.getViewportXOffset()
							&& var1.ck_fld < og.ci_fld.getViewportXOffset() + og.ci_fld.getViewportWidth()
							&& var1.cw_fld >= og.ci_fld.getViewportYOffset()
							&& var1.cw_fld < og.ci_fld.getViewportYOffset() + og.ci_fld.getViewportHeight()) {
							var1.ox(var3, var4, var8.ux());
						}
					}

					if (!var7) {
						var6.ax_fld = false;
						int var26 = var6.ao_fld;
						if (var14 < 0.0F || var15 < 0.0F || var16 < 0.0F || var14 > var26 || var15 > var26 || var16 > var26) {
							var6.ax_fld = true;
						}

						if (var2.aq_fld != null && var2.aq_fld[var10] != -1) {
							if (!ev.ac_fld) {
								if (var2.am_fld) {
									fh.si(
										var17,
										var18,
										var19,
										var14,
										var15,
										var16,
										var20,
										var21,
										var22,
										var2.al_fld[var10],
										var2.au_fld[var10],
										var2.ax_fld[var10],
										fl.ah_fld[0],
										fl.ah_fld[1],
										fl.ah_fld[3],
										fl.aw_fld[0],
										fl.aw_fld[1],
										fl.aw_fld[3],
										fl.ay_fld[0],
										fl.ay_fld[1],
										fl.ay_fld[3],
										var2.aq_fld[var10]
									);
								} else {
									fh.si(
										var17,
										var18,
										var19,
										var14,
										var15,
										var16,
										var20,
										var21,
										var22,
										var2.al_fld[var10],
										var2.au_fld[var10],
										var2.ax_fld[var10],
										fl.ah_fld[var11],
										fl.ah_fld[var12],
										fl.ah_fld[var13],
										fl.aw_fld[var11],
										fl.aw_fld[var12],
										fl.aw_fld[var13],
										fl.ay_fld[var11],
										fl.ay_fld[var12],
										fl.ay_fld[var13],
										var2.aq_fld[var10]
									);
								}
							} else {
								int var24 = var6.aq_fld.tt(var2.aq_fld[var10]);
								fh.gr(
									var17,
									var18,
									var19,
									var14,
									var15,
									var16,
									var20,
									var21,
									var22,
									ev.we(var24, var2.al_fld[var10]),
									ev.we(var24, var2.au_fld[var10]),
									ev.we(var24, var2.ax_fld[var10])
								);
							}
						} else if (var2.al_fld[var10] != 12345678) {
							fh.gr(var17, var18, var19, var14, var15, var16, var20, var21, var22, var2.al_fld[var10], var2.au_fld[var10], var2.ax_fld[var10]);
						}
					}
				}
			}
		} catch (Exception var25) {
			client.logger.warn("error during overlay rendering", (Throwable)var25);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;III)V"
	)
	abstract void ah(ev var1, fa var2, int var3, int var4, int var5);

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;IIII)V"
	)
	public void io(ev var1, fa var2, int var3, int var4, int var5, int var6) {
		xw_fld = var3;
		this.em(var1, var2, var4, var5, var6);
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;III)V"
	)
	public void em(ev var1, fa var2, int var3, int var4, int var5) {
		this.ag(var1, var2, var3, var4, var5, -882138923);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	abstract void ae(em var1, int var2, int var3, int var4, int var5, long var6) throws EOFException;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	abstract void av(em var1, int var2, int var3, int var4, int var5, long var6) throws EOFException;

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(Lyb;Llu;)Lyb;"
	)
	public static yb pd(yb var0, lu var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = var1;
		return var0;
	}

	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;III)V"
	)
	public void xo(ev var1, fl var2, int var3, int var4, int var5) {
		xw_fld = var3;
		this.et(var1, var2, var4, var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	abstract void ay(ev var1, fl var2, int var3, int var4);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	abstract void aw(ev var1, fl var2, int var3, int var4);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;IIFFFFFFFFFFFF)V"
	)
	void ax(
		ev var1,
		fa var2,
		int var3,
		int var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		float var10,
		float var11,
		float var12,
		float var13,
		float var14,
		float var15,
		float var16
	) {
		try {
			float var17 = fc.aw() + var5 * fc.au() / var13;
			float var18 = fc.ay() + var9 * fc.au() / var13;
			float var19 = fc.aw() + var6 * fc.au() / var14;
			float var20 = fc.ay() + var10 * fc.au() / var14;
			float var21 = fc.aw() + var7 * fc.au() / var15;
			float var22 = fc.ay() + var11 * fc.au() / var15;
			float var23 = fc.aw() + var8 * fc.au() / var16;
			float var24 = fc.ay() + var12 * fc.au() / var16;
			float var25 = ap.av(var13);
			float var26 = ap.av(var14);
			float var27 = ap.av(var15);
			float var28 = ap.av(var16);
			fc.ar_fld.aa_fld = 0;
			if ((var21 - var23) * (var20 - var24) - (var19 - var23) * (var22 - var24) > 0.0F) {
				fc.ar_fld.ax_fld = false;
				int var29 = fc.ax();
				if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > var29 || var23 > var29 || var19 > var29) {
					fc.ar_fld.ax_fld = true;
				}

				if (ev.af(var1.ck_fld, var1.cw_fld, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
					float var30 = sb.au(var1.ck_fld, var1.cw_fld, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26);
					if (var30 > var1.bc_fld) {
						var1.cm_fld = var3;
						var1.dg_fld = var4;
						var1.bc_fld = var30;
					}
				}

				if (-1 == var2.ae_fld) {
					if (var2.az_fld != 12345678) {
						fc.ao(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.az_fld, var2.av_fld, var2.ag_fld);
					}
				} else if (!ev.ac_fld) {
					if (var2.ah_fld) {
						fc.at(
							var22,
							var24,
							var20,
							var21,
							var23,
							var19,
							var27,
							var28,
							var26,
							var2.az_fld,
							var2.av_fld,
							var2.ag_fld,
							(int)var5,
							(int)var6,
							(int)var8,
							(int)var9,
							(int)var10,
							(int)var12,
							(int)var13,
							(int)var14,
							(int)var16,
							var2.ae_fld
						);
					} else {
						fc.at(
							var22,
							var24,
							var20,
							var21,
							var23,
							var19,
							var27,
							var28,
							var26,
							var2.az_fld,
							var2.av_fld,
							var2.ag_fld,
							(int)var7,
							(int)var8,
							(int)var6,
							(int)var11,
							(int)var12,
							(int)var10,
							(int)var15,
							(int)var16,
							(int)var14,
							var2.ae_fld
						);
					}
				} else {
					int var34 = fc.ar_fld.aq_fld.av(var2.ae_fld, (byte)-18);
					fc.ao(var22, var24, var20, var21, var23, var19, var27, var28, var26, ev.ar(var34, var2.az_fld), ev.ar(var34, var2.av_fld), ev.ar(var34, var2.ag_fld));
				}
			}

			if ((var17 - var19) * (var24 - var20) - (var23 - var19) * (var18 - var20) > 0.0F) {
				fc.ar_fld.ax_fld = false;
				int var33 = fc.ax();
				if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > var33 || var19 > var33 || var23 > var33) {
					fc.ar_fld.ax_fld = true;
				}

				if (ev.af(var1.ck_fld, var1.cw_fld, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
					float var35 = sb.au(var1.ck_fld, var1.cw_fld, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28);
					if (var35 > var1.bc_fld) {
						var1.cm_fld = var3;
						var1.dg_fld = var4;
						var1.bc_fld = var35;
					}
				}

				if (var2.ae_fld == -1) {
					if (var2.ak_fld != 12345678) {
						fc.ao(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.ak_fld, var2.ag_fld, var2.av_fld);
					}
				} else if (!ev.ac_fld) {
					fc.at(
						var18,
						var20,
						var24,
						var17,
						var19,
						var23,
						var25,
						var26,
						var28,
						var2.ak_fld,
						var2.ag_fld,
						var2.av_fld,
						(int)var5,
						(int)var6,
						(int)var8,
						(int)var9,
						(int)var10,
						(int)var12,
						(int)var13,
						(int)var14,
						(int)var16,
						var2.ae_fld
					);
				} else {
					int var36 = fc.ar_fld.aq_fld.av(var2.ae_fld, (byte)-117);
					fc.ao(var18, var20, var24, var17, var19, var23, var25, var26, var28, ev.ar(var36, var2.ak_fld), ev.ar(var36, var2.ag_fld), ev.ar(var36, var2.av_fld));
				}
			}
		} catch (Throwable var32) {
			throw new RuntimeException(var32);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	void aa(ev var1, fl var2, int var3, int var4) {
		try {
			fc.ar_fld.aa_fld = 0;
			int var5 = var2.an_fld.length;

			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = var2.an_fld[var6];
				int var8 = var2.aa_fld[var6];
				int var9 = var2.ai_fld[var6];
				float var10 = fl.az_fld[var7];
				float var11 = fl.az_fld[var8];
				float var12 = fl.az_fld[var9];
				float var13 = fl.av_fld[var7];
				float var14 = fl.av_fld[var8];
				float var15 = fl.av_fld[var9];
				float var16 = fl.ae_fld[var7];
				float var17 = fl.ae_fld[var8];
				float var18 = fl.ae_fld[var9];
				if ((var15 - var14) * (var10 - var11) - (var13 - var14) * (var12 - var11) > 0.0F) {
					fc.ar_fld.ax_fld = false;
					int var19 = fc.ax();
					if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > var19 || var11 > var19 || var12 > var19) {
						fc.ar_fld.ax_fld = true;
					}

					if (ev.af(var1.ck_fld, var1.cw_fld, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
						float var20 = sb.au(var1.ck_fld, var1.cw_fld, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18);
						if (var20 > var1.bc_fld) {
							var1.cm_fld = var3;
							var1.dg_fld = var4;
							var1.bc_fld = var20;
						}
					}

					if (var2.aq_fld != null && -1 != var2.aq_fld[var6]) {
						if (!ev.ac_fld) {
							if (var2.am_fld) {
								fc.at(
									var13,
									var14,
									var15,
									var10,
									var11,
									var12,
									var16,
									var17,
									var18,
									var2.al_fld[var6],
									var2.au_fld[var6],
									var2.ax_fld[var6],
									fl.ah_fld[0],
									fl.ah_fld[1],
									fl.ah_fld[3],
									fl.aw_fld[0],
									fl.aw_fld[1],
									fl.aw_fld[3],
									fl.ay_fld[0],
									fl.ay_fld[1],
									fl.ay_fld[3],
									var2.aq_fld[var6]
								);
							} else {
								fc.at(
									var13,
									var14,
									var15,
									var10,
									var11,
									var12,
									var16,
									var17,
									var18,
									var2.al_fld[var6],
									var2.au_fld[var6],
									var2.ax_fld[var6],
									fl.ah_fld[var7],
									fl.ah_fld[var8],
									fl.ah_fld[var9],
									fl.aw_fld[var7],
									fl.aw_fld[var8],
									fl.aw_fld[var9],
									fl.ay_fld[var7],
									fl.ay_fld[var8],
									fl.ay_fld[var9],
									var2.aq_fld[var6]
								);
							}
						} else {
							int var23 = fc.ar_fld.aq_fld.av(var2.aq_fld[var6], (byte)-72);
							fc.ao(
								var13,
								var14,
								var15,
								var10,
								var11,
								var12,
								var16,
								var17,
								var18,
								ev.ar(var23, var2.al_fld[var6]),
								ev.ar(var23, var2.au_fld[var6]),
								ev.ar(var23, var2.ax_fld[var6])
							);
						}
					} else if (12345678 != var2.al_fld[var6]) {
						fc.ao(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.al_fld[var6], var2.au_fld[var6], var2.ax_fld[var6]);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFF)F"
	)
	public static float br(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		return sb.au(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
	)
	static int br(int var0, ba var1, boolean var2) throws EOFException {
		try {
			if (var0 == 2700) {
				lu var15 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var15.ga_fld;
				return 1;
			} else if (2701 == var0) {
				lu var14 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				if (var14.ga_fld != -1) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var14.gd_fld;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (var0 == 2702) {
				int var13 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				pk var17 = (pk)xz.tw(cf.cg_fld.an_fld, var13);
				if (null != var17) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (var0 == 2703) {
				gz.ax_fld -= 3;
				int var12 = bp.au_fld[gz.ax_fld];
				lu var16 = cf.cg_fld.ag(bp.au_fld[1 + gz.ax_fld], bp.au_fld[2 + gz.ax_fld]);
				px var18 = kb.ag_px(var12, 498694653);
				if (var18.aw()) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = lu.go(var16, var12, var18.as_fld);
				} else if (var18.ay()) {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var16.ap(var12, var18.ay_fld);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.hg(var16, var12, var18.aw_fld);
				}

				return 1;
			} else if (var0 == 2704) {
				gz.ax_fld -= 3;
				lu var11 = cf.cg_fld.ag(bp.au_fld[gz.ax_fld], bp.au_fld[gz.ax_fld + 1]);
				int var5 = bp.au_fld[2 + gz.ax_fld];
				Object var6 = he.cg(var5);
				int var7 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var11.at(var7, var6, 583965381);
				return 1;
			} else if (2706 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cf.cg_fld.aa_fld;
				return 1;
			} else if (var0 == 2707) {
				lu var10 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var10.bs_boolean(993764193) ? 1 : 0;
				return 1;
			} else if (2708 == var0) {
				lu var9 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				return bp.ap(var9);
			} else if (2709 == var0) {
				lu var4 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				return ag.at(var4);
			} else {
				return 2;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	public static void rs(xj var0) {
		var0.au_fld = 228932457 * ((var0.az_fld + 7) / 8);
	}

	@ObfuscatedName("yw")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;IIFFFFFFFFFFFF)V"
	)
	public void yw(
		ev var1,
		fa var2,
		int var3,
		int var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		float var10,
		float var11,
		float var12,
		float var13,
		float var14,
		float var15,
		float var16
	) {
		us(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	void ai(ev var1, fl var2, int var3, int var4) {
		try {
			fc.ar_fld.aa_fld = 0;
			int var5 = var2.an_fld.length;

			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = var2.an_fld[var6];
				int var8 = var2.aa_fld[var6];
				int var9 = var2.ai_fld[var6];
				float var10 = fl.az_fld[var7];
				float var11 = fl.az_fld[var8];
				float var12 = fl.az_fld[var9];
				float var13 = fl.av_fld[var7];
				float var14 = fl.av_fld[var8];
				float var15 = fl.av_fld[var9];
				float var16 = fl.ae_fld[var7];
				float var17 = fl.ae_fld[var8];
				float var18 = fl.ae_fld[var9];
				if ((var15 - var14) * (var10 - var11) - (var13 - var14) * (var12 - var11) > 0.0F) {
					fc.ar_fld.ax_fld = false;
					int var19 = fc.ax();
					if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > var19 || var11 > var19 || var12 > var19) {
						fc.ar_fld.ax_fld = true;
					}

					if (ev.af(var1.ck_fld, var1.cw_fld, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
						float var20 = sb.au(var1.ck_fld, var1.cw_fld, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18);
						if (var20 > var1.bc_fld) {
							var1.cm_fld = var3;
							var1.dg_fld = var4;
							var1.bc_fld = var20;
						}
					}

					if (var2.aq_fld != null && -1 != var2.aq_fld[var6]) {
						if (!ev.ac_fld) {
							if (var2.am_fld) {
								fc.at(
									var13,
									var14,
									var15,
									var10,
									var11,
									var12,
									var16,
									var17,
									var18,
									var2.al_fld[var6],
									var2.au_fld[var6],
									var2.ax_fld[var6],
									fl.ah_fld[0],
									fl.ah_fld[1],
									fl.ah_fld[3],
									fl.aw_fld[0],
									fl.aw_fld[1],
									fl.aw_fld[3],
									fl.ay_fld[0],
									fl.ay_fld[1],
									fl.ay_fld[3],
									var2.aq_fld[var6]
								);
							} else {
								fc.at(
									var13,
									var14,
									var15,
									var10,
									var11,
									var12,
									var16,
									var17,
									var18,
									var2.al_fld[var6],
									var2.au_fld[var6],
									var2.ax_fld[var6],
									fl.ah_fld[var7],
									fl.ah_fld[var8],
									fl.ah_fld[var9],
									fl.aw_fld[var7],
									fl.aw_fld[var8],
									fl.aw_fld[var9],
									fl.ay_fld[var7],
									fl.ay_fld[var8],
									fl.ay_fld[var9],
									var2.aq_fld[var6]
								);
							}
						} else {
							int var23 = fc.ar_fld.aq_fld.av(var2.aq_fld[var6], (byte)-46);
							fc.ao(
								var13,
								var14,
								var15,
								var10,
								var11,
								var12,
								var16,
								var17,
								var18,
								ev.ar(var23, var2.al_fld[var6]),
								ev.ar(var23, var2.au_fld[var6]),
								ev.ar(var23, var2.ax_fld[var6])
							);
						}
					} else if (12345678 != var2.al_fld[var6]) {
						fc.ao(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.al_fld[var6], var2.au_fld[var6], var2.ax_fld[var6]);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lvp;)Ljava/lang/String;"
	)
	public static String bg(vp var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	public void lf(em var1, int var2, int var3, int var4, int var5, long var6) {
		try {
			this.ak(var1, var2, var3, var4, var5, var6);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;B)V"
	)
	public static void au(sl var0, sl var1, byte var2) {
		if (null != var0) {
			if (var0.av() > 1) {
				om.ap(var0, null, true, (byte)0);
				if (null != var1) {
					om.ap(var1, null, true, (byte)0);
				}

				int var3 = var0.av();
				if (null != var1 && var1.av() < var3) {
					throw new RuntimeException();
				}

				if (var0.ag_fld == yq.ak_fld) {
					if (var2 >= 64) {
						return;
					}

					if (null == var1) {
						ti.ah(var0.ak(), sq.ak_fld, 0, var3 - 1);
					} else if (var1.ag_fld == yq.ak_fld) {
						ti.ah(var0.ak(), var1.ak(), 0, var3 - 1);
					} else if (var1.ag_fld == yq.ag_fld) {
						ft.aw(var0.ak(), sl.ob(var1, -1067193592), 0, var3 - 1);
					} else {
						id.al(var0.ak(), (Object[])var1.az(), 0, var3 - 1, (byte)64);
					}
				} else if (var0.ag_fld == yq.ag_fld) {
					if (var2 >= 64) {
						return;
					}

					if (var1 == null) {
						Arrays.sort(sl.ob(var0, 1653955574), 0, var3);
					} else if (var1.ag_fld == yq.ak_fld) {
						gd.ay(sl.ob(var0, -1963324739), var1.ak(), 0, var3 - 1, 950952380);
					} else if (yq.ag_fld == var1.ag_fld) {
						sq.as(sl.ob(var0, 1753852713), sl.ob(var1, 960276464), 0, var3 - 1);
					} else {
						nd.au(sl.ob(var0, 1467068528), (Object[])var1.az(), 0, var3 - 1);
					}
				} else {
					if (yq.az_fld != var0.ag_fld) {
						throw new RuntimeException();
					}

					if (var1 == null) {
						Arrays.sort((Object[])var0.az(), 0, var3);
					} else if (yq.ak_fld == var1.ag_fld) {
						mf.az((String[])(String[])var0.az(), var1.ak(), 0, var3 - 1);
					} else if (var1.ag_fld == yq.ag_fld) {
						md.av((String[])(String[])var0.az(), sl.ob(var1, -133291217), 0, var3 - 1);
					} else {
						wn.ae((String[])(String[])var0.az(), (Object[])var1.az(), 0, var3 - 1, 1669446353);
					}
				}

				return;
			}

			if (var2 >= 64) {
				return;
			}
		}
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lev;Lfa;IIFFFFFFFFFFFFI)V"
	)
	public static void us(
		fw var0,
		ev var1,
		fa var2,
		int var3,
		int var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		float var10,
		float var11,
		float var12,
		float var13,
		float var14,
		float var15,
		float var16
	) {
		if (var0 == null) {
			var0.getClass();
		}

		try {
			fo var18 = fc.ar_fld;
			int var19 = var18.ai_fld;
			int var20 = var18.am_fld;
			int var21 = var18.ad_fld;
			float var22 = var20 + var5 * var19 / var13;
			float var23 = var21 + var9 * var19 / var13;
			float var24 = var20 + var6 * var19 / var14;
			float var25 = var21 + var10 * var19 / var14;
			float var26 = var20 + var7 * var19 / var15;
			float var27 = var21 + var11 * var19 / var15;
			float var28 = var20 + var8 * var19 / var16;
			float var29 = var21 + var12 * var19 / var16;
			float var30 = fh.hg(var13);
			float var31 = fh.hg(var14);
			float var32 = fh.hg(var15);
			float var33 = fh.hg(var16);
			var18.aa_fld = 0;
			rl10 var34 = var1.vo_fld[var1.fb_fld.ae_fld * -457350413][var3 + var1.qr_fld][var4 + var1.qr_fld];
			if ((var25 - var29) * (var26 - var28) - (var27 - var29) * (var24 - var28) > 0.0F) {
				if (ev.ou(var1.ck_fld, var1.cw_fld, (int)var27, (int)var29, (int)var25, (int)var26, (int)var28, (int)var24)) {
					float var35 = br(var1.ck_fld, var1.cw_fld, (int)var26, (int)var28, (int)var24, (int)var27, (int)var29, (int)var25, var32, var33, var31);
					if (var35 > var1.bc_fld && xw_fld <= var1.fb_fld.ae_fld * -457350413) {
						var1.wc(var3, var4, var35);
					}

					if (var1.ck_fld >= og.ci_fld.getViewportXOffset()
						&& var1.ck_fld < og.ci_fld.getViewportXOffset() + og.ci_fld.getViewportWidth()
						&& var1.cw_fld >= og.ci_fld.getViewportYOffset()
						&& var1.cw_fld < og.ci_fld.getViewportYOffset() + og.ci_fld.getViewportHeight()
						&& var34 != null
						&& var2 == var34.getSceneTilePaint()) {
						var1.ox(var3, var4, var34.ux());
					}
				}

				if (!og.ci_fld.isGpu()) {
					var18.ax_fld = false;
					int var38 = var18.ao_fld;
					if (var26 < 0.0F || var28 < 0.0F || var24 < 0.0F || var26 > var38 || var28 > var38 || var24 > var38) {
						var18.ax_fld = true;
					}

					if (var2.ae_fld == -1) {
						if (var2.az_fld != 12345678) {
							fh.gr(var27, var29, var25, var26, var28, var24, var32, var33, var31, var2.az_fld, var2.av_fld, var2.ag_fld);
						}
					} else if (!ev.ac_fld) {
						if (var2.ah_fld) {
							fh.si(
								var27,
								var29,
								var25,
								var26,
								var28,
								var24,
								var32,
								var33,
								var31,
								var2.az_fld,
								var2.av_fld,
								var2.ag_fld,
								(int)var5,
								(int)var6,
								(int)var8,
								(int)var9,
								(int)var10,
								(int)var12,
								(int)var13,
								(int)var14,
								(int)var16,
								var2.ae_fld
							);
						} else {
							fh.si(
								var27,
								var29,
								var25,
								var26,
								var28,
								var24,
								var32,
								var33,
								var31,
								var2.az_fld,
								var2.av_fld,
								var2.ag_fld,
								(int)var7,
								(int)var8,
								(int)var6,
								(int)var11,
								(int)var12,
								(int)var10,
								(int)var15,
								(int)var16,
								(int)var14,
								var2.ae_fld
							);
						}
					} else {
						int var36 = var18.aq_fld.tt(var2.ae_fld);
						fh.gr(var27, var29, var25, var26, var28, var24, var32, var33, var31, ev.we(var36, var2.az_fld), ev.we(var36, var2.av_fld), ev.we(var36, var2.ag_fld));
					}
				}
			}

			if ((var29 - var25) * (var22 - var24) - (var23 - var25) * (var28 - var24) > 0.0F) {
				if (ev.ou(var1.ck_fld, var1.cw_fld, (int)var23, (int)var25, (int)var29, (int)var22, (int)var24, (int)var28)) {
					float var39 = br(var1.ck_fld, var1.cw_fld, (int)var22, (int)var24, (int)var28, (int)var23, (int)var25, (int)var29, var30, var31, var33);
					if (var39 > var1.bc_fld && xw_fld <= var1.fb_fld.ae_fld * -457350413) {
						var1.wc(var3, var4, var39);
					}

					if (var1.ck_fld >= og.ci_fld.getViewportXOffset()
						&& var1.ck_fld < og.ci_fld.getViewportXOffset() + og.ci_fld.getViewportWidth()
						&& var1.cw_fld >= og.ci_fld.getViewportYOffset()
						&& var1.cw_fld < og.ci_fld.getViewportYOffset() + og.ci_fld.getViewportHeight()
						&& var34 != null
						&& var2 == var34.getSceneTilePaint()) {
						var1.ox(var3, var4, var34.ux());
					}
				}

				if (!og.ci_fld.isGpu()) {
					var18.ax_fld = false;
					int var40 = var18.ao_fld;
					if (var22 < 0.0F || var24 < 0.0F || var28 < 0.0F || var22 > var40 || var24 > var40 || var28 > var40) {
						var18.ax_fld = true;
					}

					if (var2.ae_fld == -1) {
						if (var2.ak_fld != 12345678) {
							fh.gr(var23, var25, var29, var22, var24, var28, var30, var31, var33, var2.ak_fld, var2.ag_fld, var2.av_fld);
						}
					} else if (!ev.ac_fld) {
						fh.si(
							var23,
							var25,
							var29,
							var22,
							var24,
							var28,
							var30,
							var31,
							var33,
							var2.ak_fld,
							var2.ag_fld,
							var2.av_fld,
							(int)var5,
							(int)var6,
							(int)var8,
							(int)var9,
							(int)var10,
							(int)var12,
							(int)var13,
							(int)var14,
							(int)var16,
							var2.ae_fld
						);
					} else {
						int var41 = var18.aq_fld.tt(var2.ae_fld);
						fh.gr(var23, var25, var29, var22, var24, var28, var30, var31, var33, ev.we(var41, var2.ak_fld), ev.we(var41, var2.ag_fld), ev.we(var41, var2.av_fld));
					}
				}
			}
		} catch (Exception var37) {
			client.logger.warn("error during underlay rendering", (Throwable)var37);
		}
	}

	fw() {
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gr() {
		gd.gj((byte)-78);
		cu.gt();
		cd.gs();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;IIFFFFFFFFFFFFI)V"
	)
	void al(
		ev var1,
		fa var2,
		int var3,
		int var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		float var10,
		float var11,
		float var12,
		float var13,
		float var14,
		float var15,
		float var16,
		int var17
	) {
		try {
			fo var18 = fc.ar_fld;
			int var19 = var18.ai_fld;
			int var20 = var18.ac_fld;
			int var21 = var18.at_fld;
			float var22 = var20 + var5 * var19 / var13;
			float var23 = var21 + var9 * var19 / var13;
			float var24 = var20 + var6 * var19 / var14;
			float var25 = var21 + var10 * var19 / var14;
			float var26 = var20 + var7 * var19 / var15;
			float var27 = var21 + var11 * var19 / var15;
			float var28 = var20 + var8 * var19 / var16;
			float var29 = var21 + var12 * var19 / var16;
			float var30 = fh.hg(var13);
			float var31 = fh.hg(var14);
			float var32 = fh.hg(var15);
			float var33 = fh.hg(var16);
			var18.al_fld = 0;
			rl10 var34 = var1.ky_fld[var1.fb_fld.ae_fld * -457350413][var3 + var1.ba_fld][var4 + var1.bp_fld];
			if ((var25 - var29) * (var26 - var28) - (var27 - var29) * (var24 - var28) > 0.0F) {
				if (ev.af(var1.dg_fld, var1.dk_fld, (int)var27, (int)var29, (int)var25, (int)var26, (int)var28, (int)var24)) {
					float var35 = br(var1.ds_fld, var1.cx_fld, (int)var26, (int)var28, (int)var24, (int)var27, (int)var29, (int)var25, var32, var33, var31);
					if (var35 > var1.cj_fld && xw_fld <= var1.fb_fld.ah_fld * -457350413) {
						var1.wc(var3, var4, var35);
					}

					if (var1.cq_fld >= og.ci_fld.getIdleTimeout()
						&& var1.cd_fld < og.ci_fld.getCameraPitchTarget() + og.ci_fld.getCameraYaw()
						&& var1.dv_fld >= og.ci_fld.getExpandedMapLoading()
						&& var1.cx_fld < og.ci_fld.getRasterizer3D_clipNegativeMidX() + og.ci_fld.getExpandedMapLoading()
						&& var34 != null
						&& var2 == var34.getSceneTilePaint()) {
						var1.ox(var3, var4, var34.ex());
					}
				}

				if (!og.ci_fld.acz()) {
					var18.ax_fld = false;
					int var38 = var18.al_fld;
					if (var26 < 0.0F || var28 < 0.0F || var24 < 0.0F || var26 > var38 || var28 > var38 || var24 > var38) {
						var18.ax_fld = true;
					}

					if (var2.aw_fld == -1) {
						if (var2.ag_fld != 12345678) {
							fh.gr(var27, var29, var25, var26, var28, var24, var32, var33, var31, var2.az_fld, var2.ae_fld * -1100348175, var2.az_fld * -1192865817);
						}
					} else if (!ev.ac_fld) {
						if (var2.ah_fld) {
							fh.si(
								var27,
								var29,
								var25,
								var26,
								var28,
								var24,
								var32,
								var33,
								var31,
								var2.aw_fld * -1656357861,
								var2.ag_fld * -1100348175,
								var2.ae_fld * -1192865817,
								(int)var5,
								(int)var6,
								(int)var8,
								(int)var9,
								(int)var10,
								(int)var12,
								(int)var13,
								(int)var14,
								(int)var16,
								var2.av_fld * 1753954009
							);
						} else {
							fh.si(
								var27,
								var29,
								var25,
								var26,
								var28,
								var24,
								var32,
								var33,
								var31,
								var2.av_fld * -1656357861,
								var2.ae_fld * -1100348175,
								var2.ak_fld * -1192865817,
								(int)var7,
								(int)var8,
								(int)var6,
								(int)var11,
								(int)var12,
								(int)var10,
								(int)var15,
								(int)var16,
								(int)var14,
								var2.az_fld * 1753954009
							);
						}
					} else {
						int var36 = var18.aq_fld.tt(var2.ag_fld * 1753954009);
						fh.gr(
							var27,
							var29,
							var25,
							var26,
							var28,
							var24,
							var32,
							var33,
							var31,
							ev.we(var36, var2.az_fld),
							ev.we(var36, var2.az_fld * -1100348175),
							ev.we(var36, var2.ae_fld * -1192865817)
						);
					}
				}
			}

			if ((var29 - var25) * (var22 - var24) - (var23 - var25) * (var28 - var24) > 0.0F) {
				if (ev.af(var1.cn_fld, var1.ep_fld, (int)var23, (int)var25, (int)var29, (int)var22, (int)var24, (int)var28)) {
					float var39 = br(var1.es_fld, var1.cd_fld, (int)var22, (int)var24, (int)var28, (int)var23, (int)var25, (int)var29, var30, var31, var33);
					if (var39 > var1.ci_fld && xw_fld <= var1.fb_fld.ae_fld * -457350413) {
						var1.wc(var3, var4, var39);
					}

					if (var1.cd_fld >= og.ci_fld.getCenterX()
						&& var1.dh_fld < og.ci_fld.getRevision() + og.ci_fld.getWeight()
						&& var1.dh_fld >= og.ci_fld.getTickCount()
						&& var1.dt_fld < og.ci_fld.getOculusOrbState() + og.ci_fld.getSkyboxColor()
						&& var34 != null
						&& var2 == var34.getSceneTilePaint()) {
						var1.bw(var3, var4, var34.getPlane());
					}
				}

				if (!og.ci_fld.isResized()) {
					var18.ax_fld = false;
					int var40 = var18.ap_fld;
					if (var22 < 0.0F || var24 < 0.0F || var28 < 0.0F || var22 > var40 || var24 > var40 || var28 > var40) {
						var18.ax_fld = true;
					}

					if (var2.ae_fld == -1) {
						if (var2.az_fld != 12345678) {
							fh.gr(var23, var25, var29, var22, var24, var28, var30, var31, var33, var2.av_fld * -350741579, var2.av_fld * -1192865817, var2.ak_fld * -1100348175);
						}
					} else if (!ev.ac_fld) {
						fh.si(
							var23,
							var25,
							var29,
							var22,
							var24,
							var28,
							var30,
							var31,
							var33,
							var2.ak_fld,
							var2.ak_fld * -1192865817,
							var2.ae_fld * -1100348175,
							(int)var5,
							(int)var6,
							(int)var8,
							(int)var9,
							(int)var10,
							(int)var12,
							(int)var13,
							(int)var14,
							(int)var16,
							var2.aw_fld * 1753954009
						);
					} else {
						int var41 = var18.aq_fld.tt(var2.av_fld * 1753954009);
						fh.gr(
							var23,
							var25,
							var29,
							var22,
							var24,
							var28,
							var30,
							var31,
							var33,
							ev.we(var41, var2.aw_fld * -350741579),
							ev.we(var41, var2.ak_fld * -1192865817),
							ev.we(var41, var2.ak_fld * -1100348175)
						);
					}
				}
			}
		} catch (Exception var37) {
			client.logger.warn("error during underlay rendering", (Throwable)var37);
		}
	}
}
