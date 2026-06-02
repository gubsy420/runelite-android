import java.io.EOFException;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.WidgetConfigNode;

@ObfuscatedName("lg")
@Implements({"WidgetConfigNode"})
public class lg extends vw implements WidgetConfigNode {
	@ObfuscatedGetter(
		intValue = 272571727
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -1666372233
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;
	@ObfuscatedGetter(
		intValue = 1428995369
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public lg ae_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bt_fld;
	@ObfuscatedGetter(
		intValue = 233761761
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ae() {
		return this.az_fld;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lda;)Z"
	)
	static boolean cb(rg var0, da var1) {
		if (var0 != null && var1 != null) {
			int var3 = -1693769408 * var1.bv_fld;
			int var4 = var1.bo_fld - var3;
			int var5 = var1.bp_fld - var3;
			int var6 = var1.bo_fld + var3 - 1;
			int var7 = var1.bp_fld + var3 - 1;
			vv var8;
			synchronized (vv.ah_fld) {
				if (0 == vv.ay_fld) {
					var8 = new vv();
				} else {
					vv.ah_fld[(vv.ay_fld -= -235759801) * -2124815753].ag();
					var8 = vv.ah_fld[vv.ay_fld];
				}
			}

			var8.ay(var0.aw_fld.al(1755258691), var0.dp(-727594710), var0.dj(189745805), var0.ah(1650531664));
			boolean var10;
			if (!ok.ae(var8, var4, var5, var6, var7)) {
				var10 = false;
			} else {
				int var12 = var8.av(0);
				int var13 = vv.tz(var8, 0, (byte)1);
				int var14 = var8.av(1);
				int var15 = vv.tz(var8, 1, (byte)1);
				int var16 = var8.av(2);
				int var17 = vv.tz(var8, 2, (byte)1);
				int var18 = var8.av(3);
				int var19 = vv.tz(var8, 3, (byte)1);
				int var20 = var4 + 1;
				int var21 = var5 + 1;
				int var22 = var6 - 1;
				int var23 = var7 - 1;
				boolean var11;
				if (var12 >= var20 && var12 <= var22 && var13 >= var21 && var13 <= var23) {
					var11 = true;
				} else if (var14 >= var20 && var14 <= var22 && var15 >= var21 && var15 <= var23) {
					var11 = true;
				} else if (var16 >= var20 && var16 <= var22 && var17 >= var21 && var17 <= var23) {
					var11 = true;
				} else if (var18 >= var20 && var18 <= var22 && var19 >= var21 && var19 <= var23) {
					var11 = true;
				} else if (jw.ak(var20, var21, var12, var13, var14, var15, var16, var17)
					|| jw.ak(var20, var23, var12, var13, var14, var15, var16, var17)
					|| jw.ak(var22, var21, var12, var13, var14, var15, var16, var17)
					|| jw.ak(var22, var23, var12, var13, var14, var15, var16, var17)) {
					var11 = true;
				} else if (!sq.ak(var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var21)
					&& !sq.ak(var12, var13, var14, var15, var16, var17, var18, var19, var22, var21, var22, var23)
					&& !sq.ak(var12, var13, var14, var15, var16, var17, var18, var19, var22, var23, var20, var23)
					&& !sq.ak(var12, var13, var14, var15, var16, var17, var18, var19, var20, var23, var20, var21)) {
					var11 = false;
				} else {
					var11 = true;
				}

				var10 = var11;
			}

			var8.ak();
			return var10;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("getOpMask")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOpMask() {
		return this.av_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return this.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ak(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ah() {
		return this.az_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	public static void cq(uk var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ah_fld * 148711961 == 0) {
			var0.ag();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aw() {
		return this.av_fld;
	}

	lg(int var1, int var2, int var3, int var4) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lev;Lfl;II)V"
	)
	public static void fl(fw var0, ev var1, fl var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		try {
			fo var6 = fc.ar_fld;
			boolean var7 = og.ci_fld.isGpu();
			if (client.fa_fld != null) {
				client.fa_fld.drawSceneTileModel(var1, var2, var3, var4);
			}

			rl10 var8 = var1.iy_fld[var1.fj_fld.ae_fld * -457350413][var3 + var1.jh_fld][var4 + var1.jh_fld];
			var6.aj_fld = 0;
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
					if (ev.na(var1.dv_fld, var1.dz_fld, (int)var17, (int)var18, (int)var19, (int)var14, (int)var15, (int)var16)) {
						float var23 = fw.ri(var1.dv_fld, var1.dz_fld, (int)var14, (int)var15, (int)var16, (int)var17, (int)var18, (int)var19, var20, var21, var22);
						if (var23 > var1.bc_fld && fw.dy_fld <= var1.fj_fld.ae_fld * -457350413) {
							var1.oj(var3, var4, var23);
						}

						if (var8 != null
							&& var2 == var8.getSceneTileModel()
							&& var1.dv_fld >= og.ci_fld.getViewportXOffset()
							&& var1.dv_fld < og.ci_fld.getViewportXOffset() + og.ci_fld.getViewportWidth()
							&& var1.dz_fld >= og.ci_fld.getViewportYOffset()
							&& var1.dz_fld < og.ci_fld.getViewportYOffset() + og.ci_fld.getViewportHeight()) {
							var1.xn(var3, var4, var8.cu());
						}
					}

					if (!var7) {
						var6.ax_fld = false;
						int var26 = var6.ac_fld;
						if (var14 < 0.0F || var15 < 0.0F || var16 < 0.0F || var14 > var26 || var15 > var26 || var16 > var26) {
							var6.ax_fld = true;
						}

						if (var2.aq_fld != null && var2.aq_fld[var10] != -1) {
							if (!ev.ac_fld) {
								if (var2.am_fld) {
									fh.yl(
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
									fh.yl(
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
								int var24 = var6.aq_fld.tx(var2.aq_fld[var10]);
								fh.yy(
									var17,
									var18,
									var19,
									var14,
									var15,
									var16,
									var20,
									var21,
									var22,
									ev.fp(var24, var2.al_fld[var10]),
									ev.fp(var24, var2.au_fld[var10]),
									ev.fp(var24, var2.ax_fld[var10])
								);
							}
						} else if (var2.al_fld[var10] != 12345678) {
							fh.yy(var17, var18, var19, var14, var15, var16, var20, var21, var22, var2.al_fld[var10], var2.au_fld[var10], var2.ax_fld[var10]);
						}
					}
				}
			}
		} catch (Exception var25) {
			client.ii_fld.warn("error during overlay rendering", (Throwable)var25);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIII)Llg;"
	)
	public static lg as(lg var0, int var1, int var2, int var3, int var4) {
		lg var5 = var0;

		for (lg var6 = null; var5 != null; var5 = var5.ae_fld) {
			if (var5.ag_fld >= var1 && var5.ak_fld <= var2) {
				if (var6 != null) {
					var6.ae_fld = var5.ae_fld;
				} else {
					var0 = var5.ae_fld;
				}

				if (var5.ak_fld < var1) {
					lg var7 = new lg(-494194735 * var5.ak_fld, var1 - 1, var5.az_fld, 1703873415 * var5.av_fld);
					if (null != var6) {
						var7.ae_fld = var6.ae_fld;
					} else {
						var7.ae_fld = var0;
					}

					if (null != var6) {
						var6.ae_fld = var7;
					} else {
						var0 = var7;
					}

					var6 = var7;
				}

				if (var5.ag_fld > var2) {
					lg var11 = new lg(1 + var2, -1597529789 * var5.ag_fld, var5.az_fld, var5.av_fld * -93858024);
					if (null != var6) {
						var11.ae_fld = var6.ae_fld;
					} else {
						var11.ae_fld = var0;
					}

					if (var6 != null) {
						var6.ae_fld = var11;
					} else {
						var0 = var11;
					}
				}
			}

			var6 = var5;
		}

		var5 = null;

		for (lg var9 = var0; null != var9 && var9.ak_fld <= var1; var9 = var9.ae_fld) {
			var5 = var9;
		}

		lg var10 = new lg(var1, var2, var3, var4);
		if (var5 != null) {
			var10.ae_fld = var5.ae_fld;
		} else {
			var10.ae_fld = var0;
		}

		if (null != var5) {
			var5.ae_fld = var10;
		} else {
			var0 = var10;
		}

		return var0;
	}

	@ObfuscatedName("getClickMask")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getClickMask() {
		return this.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lny;"
	)
	public static ny ak(int var0, int var1) throws EOFException {
		try {
			ny var2 = (ny)ny.av_fld.ak(var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = ny.az_fld.bb(5, var0, 584982574);
				var2 = new ny();
				if (var3 != null) {
					ny.bf(var2, new xi(var3), 1921676905);
				}

				ny.av_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIII)Llg;"
	)
	public static lg ay(lg var0, int var1, int var2, int var3, int var4) {
		lg var5 = var0;

		for (lg var6 = null; var5 != null; var5 = var5.ae_fld) {
			if (var5.ag_fld >= var1 && var5.ak_fld <= var2) {
				if (var6 != null) {
					var6.ae_fld = var5.ae_fld;
				} else {
					var0 = var5.ae_fld;
				}

				if (var5.ak_fld < var1) {
					lg var7 = new lg(var5.ak_fld, var1 - 1, var5.az_fld, var5.av_fld);
					if (null != var6) {
						var7.ae_fld = var6.ae_fld;
					} else {
						var7.ae_fld = var0;
					}

					if (null != var6) {
						var6.ae_fld = var7;
					} else {
						var0 = var7;
					}

					var6 = var7;
				}

				if (var5.ag_fld > var2) {
					lg var11 = new lg(1 + var2, 328511182 * var5.ag_fld, var5.az_fld, var5.av_fld * -796962343);
					if (null != var6) {
						var11.ae_fld = var6.ae_fld;
					} else {
						var11.ae_fld = var0;
					}

					if (var6 != null) {
						var6.ae_fld = var11;
					} else {
						var0 = var11;
					}
				}
			}

			var6 = var5;
		}

		var5 = null;

		for (lg var9 = var0; null != var9 && var9.ak_fld <= var1; var9 = var9.ae_fld) {
			var5 = var9;
		}

		lg var10 = new lg(var1, var2, var3, var4);
		if (var5 != null) {
			var10.ae_fld = var5.ae_fld;
		} else {
			var10.ae_fld = var0;
		}

		if (null != var5) {
			var5.ae_fld = var10;
		} else {
			var0 = var10;
		}

		return var0;
	}
}
