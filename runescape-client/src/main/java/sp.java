import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sp")
public class sp extends vc {
	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] xy_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cx_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	static ThreadPoolExecutor ag_fld;
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] rt_fld;
	// $VF: synthetic field
	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean zu_fld = !sp.class.desiredAssertionStatus();
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw oo_fld = new iw(128);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1575998025
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1323278145
	)
	static int ak_fld;
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	public short[] vv_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Lsn;"
	)
	sn[][] ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[Lsn;"
	)
	public sn[][] av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1323923203
	)
	int aw_fld;
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public static float[] lq_fld = new float[5];
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] qt_fld;
	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] xz_fld;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public static float[] kz_fld = new float[4];
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] cb_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	List ar_fld;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] gk_fld;
	@ObfuscatedName("zx")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public static float zx_fld = Math.ulp(1.0F);
	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ix_fld;
	@ObfuscatedName("xe")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] xe_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	public ea ah_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/Future;"
	)
	Future as_fld;
	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] xp_fld;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 490956371
	)
	static int oc_fld;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)Lsp;"
	)
	public static sp al(ub var0, ub var1, int var2) throws EOFException {
		try {
			boolean var3 = pl.ag(var0, var1, var2);
			if (!var3) {
				return null;
			} else {
				if (ag_fld == null) {
					ak_fld = Runtime.getRuntime().availableProcessors();
					ag_fld = new ThreadPoolExecutor(0, ak_fld, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(ak_fld + 100), new sh());
				}

				try {
					return new sp(var0, var1, var2);
				} catch (Exception var6) {
					return null;
				}
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae() {
		return this.aw_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean ah() {
		return this.ay_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILsi;IIB)V"
	)
	public void aw(int var1, si var2, int var3, int var4) {
		this.uw(rl21.ao_fld, var1, var2, var3, var4);
	}

	sp(ub var1, ub var2, int var3) throws EOFException {
		this.az_fld = var3;
		xi var4 = new xi(var1.loadData(this.az_fld >> 16 & 65535, this.az_fld & 65535));
		int var5 = var4.yu();
		int var6 = var4.pu();
		byte[] var7 = var2.qi(var6, 0);
		this.ah_fld = new ea(var6, var7);
		this.as_fld = ag_fld.submit(() -> this.vt(var4));
		ag_fld.submit(() -> this.ah_fld.as_fld.mu());
		this.ar_fld = Collections.emptyList();
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "(IF)F"
	)
	public float yn(int var1, float var2) {
		return this.sv(var1 - 1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILsi;II)V"
	)
	public void ac(int var1, si var2, int var3) {
		uy var5 = kv.ak();
		rq(this, var5, var3, var2, var1);
		this.ar(var5, var3, var2, var1);
		dd(this, var5, var3, var2, var1, (byte)-19);
		var2.ah(var5);
		var5.aq();
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int oe(int var0) {
		if (var0 >= 0 && var0 <= 9) {
			return var0 - 1;
		} else if (var0 >= 10 && var0 <= 15) {
			return var0 - 10;
		} else {
			return var0 == 16 ? 0 : -1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)Lsp;"
	)
	public static sp af(ub var0, ub var1, int var2) throws EOFException {
		try {
			boolean var3 = pl.ag(var0, var1, var2);
			if (!var3) {
				return null;
			} else {
				if (ag_fld == null) {
					ak_fld = Runtime.getRuntime().availableProcessors();
					ag_fld = new ThreadPoolExecutor(0, ak_fld, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(ak_fld + 100), new sh());
				}

				try {
					return new sp(var0, var1, var2);
				} catch (Exception var6) {
					return null;
				}
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;F)V"
	)
	public void wu(uy var1, int var2, si var3, float var4) {
		float[] var5 = var3.an(this.aw_fld);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		int var9 = this.gk_fld[var2 * 9 + 3];
		int var10 = this.gk_fld[var2 * 9 + 4];
		int var11 = this.gk_fld[var2 * 9 + 5];
		if (var9 != 0) {
			var6 = this.yn(var9, var4);
		}

		if (var10 != 0) {
			var7 = this.yn(var10, var4);
		}

		if (var11 != 0) {
			var8 = this.yn(var11, var4);
		}

		var1.qe_fld = var6;
		var1.na_fld = var7;
		var1.ql_fld = var8;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)Z"
	)
	static boolean au(ub var0, ub var1, int var2) throws EOFException {
		try {
			byte[] var3 = var0.cx(var2 >> 16 & 65535, var2 & 65535, -953192485);
			if (null == var3) {
				return false;
			} else {
				int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
				byte[] var5 = var1.cx(var4, 0, -1463284291);
				return null != var5;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lsp;Luy;ILsi;IB)V"
	)
	public static void dd(sp var0, uy var1, int var2, si var3, int var4, byte var5) {
		if (var0 == null) {
			var0.getClass();
		}

		float[] var6 = var3.ar(var0.aw_fld);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (var0.ae_fld[var2] != null) {
			sn var10 = var0.ae_fld[var2][3];
			sn var11 = var0.ae_fld[var2][4];
			sn var12 = var0.ae_fld[var2][5];
			if (var10 != null) {
				if (var5 >= 0) {
					return;
				}

				var7 = var10.az(var4);
			}

			if (null != var11) {
				var8 = var11.az(var4);
			}

			if (var12 != null) {
				if (var5 >= 0) {
					return;
				}

				var9 = var12.az(var4);
			}
		}

		var1.qe_fld = var7;
		var1.na_fld = var8;
		var1.ql_fld = var9;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)Z"
	)
	static boolean ax(ub var0, ub var1, int var2) throws EOFException {
		try {
			byte[] var3 = var0.cx(var2 >> 16 & 1460918851, var2 & 65535, -794431578);
			if (null == var3) {
				return false;
			} else {
				int var4 = (var3[1] & 33552928) << 8 | var3[2] & 255;
				byte[] var5 = var1.cx(var4, 0, -2049613974);
				return null != var5;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lsp;Lxi;II)V"
	)
	public static void lp(sp var0, xi var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1.cm();
			var1.cm();
			var0.aw_fld = var1.cg();
			int var4 = var1.cm();
			var0.ae_fld = new sn[ek.cg(ea.ql(var0.ah_fld, (byte)-90), 1768035152)][];
			var0.av_fld = new sn[ea.mb(var0.ah_fld, -1950750840)][];
			sg[] var5 = new sg[var4];

			for (int var6 = 0; var6 < var4; var6++) {
				int var8 = var1.cg();
				se[] var9 = new se[]{se.ak_fld, se.ag_fld, se.az_fld, se.av_fld, se.ae_fld, se.ah_fld};
				se var10 = (se)ka.ak(var9, var8);
				if (var10 == null) {
					var10 = se.ak_fld;
				}

				int var19 = var1.dv();
				sf var11 = mx.ak(var1.cg());
				sn var12 = new sn();
				var12.ak(var1, var2);
				var5[var6] = new sg(var0, var12, var10, var11, var19);
				int var13 = var10.ak();
				sn[][] var14;
				if (se.ag_fld == var10) {
					var14 = var0.ae_fld;
				} else {
					var14 = var0.av_fld;
				}

				if (null == var14[var19]) {
					var14[var19] = new sn[var13];
				}

				if (se.ae_fld == var10) {
					var0.ay_fld = true;
				}
			}

			int var15 = var4 / ak_fld;
			int var7 = var4 % ak_fld;
			int var18 = 0;

			for (int var20 = 0; var20 < ak_fld; var20++) {
				if (var3 <= -358456440) {
					return;
				}

				int var16 = var18;
				var18 += var15;
				if (var7 > 0) {
					var18++;
					var7--;
				}

				if (var18 == var16) {
					break;
				}

				var0.ar_fld.add(ag_fld.submit(new sy(var0, var16, var18, var5)));
			}

			return;
		}
	}

	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;ILsi;II)V"
	)
	public void uw(rl21 var1, int var2, si var3, int var4, int var5) {
		float var6 = var2 + (float)mt.vp_fld;
		uy var7 = uy.uo();
		this.to(var7, var4, var3, var6);
		this.co(var7, var4, var3, var6);
		this.wu(var7, var4, var3, var6);
		var1.bz(var7, var4);
		var7.cj();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;F)V"
	)
	public void co(uy var1, int var2, si var3, float var4) {
		float[] var5 = var3.qo(this.aw_fld);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		int var9 = this.gk_fld[var2 * 9 + 6];
		int var10 = this.gk_fld[var2 * 9 + 7];
		int var11 = this.gk_fld[var2 * 9 + 8];
		if (var9 != 0) {
			var6 = this.yn(var9, var4);
		}

		if (var10 != 0) {
			var7 = this.yn(var10, var4);
		}

		if (var11 != 0) {
			var8 = this.yn(var11, var4);
		}

		uy var12 = uy.uo();
		var12.aa(var6, var7, var8);
		sv.ii(var1, var12);
		var12.cj();
	}

	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "(IF)F"
	)
	public float sv(int var1, float var2) {
		int var3 = this.xp_fld[var1 * 2];
		int var4 = this.xp_fld[var1 * 2 + 1];
		short var5 = this.vv_fld[var3];
		short var6 = this.vv_fld[var4 - 1];
		if (var2 < var5) {
			byte var40 = this.rt_fld[var1 * 2];
			return var40 == 0 ? this.xz_fld[var3 * 5 + 0] : this.pg(var1, var2, true);
		} else if (var2 > var6) {
			byte var39 = this.rt_fld[var1 * 2 + 1];
			return var39 == 0 ? this.xz_fld[(var4 - 1) * 5 + 0] : this.pg(var1, var2, false);
		} else {
			boolean var7 = this.rl(var1, (int)var2, var3, var4);
			int var8 = this.qt_fld[var1];
			int var9 = this.ix_fld[var1];
			int var10 = var4 - var3;
			if (var10 <= 0) {
				return 0.0F;
			} else {
				float var11 = this.xz_fld[var8 * 5 + 3];
				float var12 = this.xz_fld[var8 * 5 + 4];
				boolean var13 = false;
				boolean var14 = false;
				if (0.0F == var11 && 0.0F == var12) {
					var13 = true;
				} else if (Float.MAX_VALUE == var11 && Float.MAX_VALUE == var12) {
					var14 = true;
				} else if (var8 + 1 < var4) {
					if (var7) {
						float var16 = this.vv_fld[var8];
						float var17 = this.xz_fld[var8 * 5 + 0];
						float var18 = var16 + 0.33333334F * var11;
						float var19 = var12 * 0.33333334F + var17;
						float var20 = this.vv_fld[var8 + 1];
						float var21 = this.xz_fld[(var8 + 1) * 5 + 0];
						float var22 = var20 - 0.33333334F * this.xz_fld[var8 * 5 + 6];
						float var23 = var21 - this.xz_fld[(var8 + 1) * 5 + 2] * 0.33333334F;
						if (var9 != -1) {
							float var24 = var20 - var16;
							if (var24 != 0.0F) {
								float var25 = var18 - var16;
								float var26 = var22 - var16;
								float var27 = var25 / var24;
								float var28 = var26 / var24;
								this.xe_fld[var9 + 5] = var27 == 0.33333334F && var28 == 0.6666667F ? 1.0F : 0.0F;
								float var29 = var27;
								float var30 = var28;
								if (var27 < 0.0F) {
									var27 = 0.0F;
								}

								if (var28 > 1.0F) {
									var28 = 1.0F;
								}

								if (var27 > 1.0F || var28 < -1.0F) {
									var28 = 1.0F - var28;
									if (var28 < 0.0F) {
										var28 = 0.0F;
									}

									if (var27 > 1.0F || var28 > 1.0F) {
										float var31 = 1.0F + var27 * (var27 - 2.0F + var28) + (var28 - 2.0F) * var28;
										if (var31 + zx_fld > 0.0F) {
											if (zx_fld + var27 < 1.3333334F) {
												float var32 = var27 - 2.0F;
												float var33 = var27 - 1.0F;
												float var34 = (float)Math.sqrt(var32 * var32 - var33 * 4.0F * var33);
												float var35 = (-var32 + var34) * 0.5F;
												if (var28 + zx_fld > var35) {
													var28 = var35 - zx_fld;
												} else {
													var35 = 0.5F * (-var32 - var34);
													if (var28 < var35 + zx_fld) {
														var28 = var35 + zx_fld;
													}
												}
											} else {
												var27 = 1.3333334F - zx_fld;
												var28 = 0.33333334F - zx_fld;
											}
										}
									}

									var28 = 1.0F - var28;
								}

								if (var27 != var29 && var29 != 0.0F) {
									var19 = var17 + (var19 - var17) * var27 / var29;
								}

								if (var28 != var30 && var30 != 0.0F) {
									var23 = var21 - (var21 - var23) * (1.0F - var28) / (1.0F - var30);
								}

								this.cb_fld[var1 * 5 + 4] = var16;
								this.xe_fld[var9 + 4] = var20;
								float var54 = var27 - 0.0F;
								float var55 = var28 - var27;
								float var56 = 1.0F - var28;
								float var57 = var55 - var54;
								this.cb_fld[var1 * 5 + 3] = var56 - var55 - var57;
								this.cb_fld[var1 * 5 + 2] = var57 + var57 + var57;
								this.cb_fld[var1 * 5 + 1] = var54 + var54 + var54;
								this.cb_fld[var1 * 5 + 0] = 0.0F;
								float var59 = var19 - var17;
								float var36 = var23 - var19;
								float var37 = var21 - var23;
								float var38 = var36 - var59;
								this.xe_fld[var9 + 3] = var37 - var36 - var38;
								this.xe_fld[var9 + 2] = var38 + var38 + var38;
								this.xe_fld[var9 + 1] = var59 + var59 + var59;
								this.xe_fld[var9 + 0] = var17;
							}
						} else {
							this.cb_fld[var1 * 5 + 4] = var16;
							float var15 = var20 - var16;
							float var45 = var21 - var17;
							float var46 = var18 - var16;
							float var48 = 0.0F;
							float var49 = 0.0F;
							if (var46 != 0.0F) {
								var48 = (var19 - var17) / var46;
							}

							var46 = var20 - var22;
							if (var46 != 0.0F) {
								var49 = (var21 - var23) / var46;
							}

							float var51 = 1.0F / (var15 * var15);
							float var52 = var15 * var48;
							float var53 = var15 * var49;
							this.cb_fld[var1 * 5 + 0] = var51 * (var52 + var53 - var45 - var45) / var15;
							this.cb_fld[var1 * 5 + 1] = (var45 + var45 + var45 - var52 - var52 - var53) * var51;
							this.cb_fld[var1 * 5 + 2] = var48;
							this.cb_fld[var1 * 5 + 3] = var17;
						}
					}
				} else {
					var13 = true;
				}

				if (var13) {
					return this.xz_fld[var8 * 5 + 0];
				} else if (!var14) {
					if (var9 != -1) {
						float var43;
						if (this.cb_fld[var1 * 5 + 4] == var2) {
							var43 = 0.0F;
						} else if (var2 == this.xe_fld[var9 + 4]) {
							var43 = 1.0F;
						} else {
							var43 = (var2 - this.cb_fld[var1 * 5 + 4]) / (this.xe_fld[var9 + 4] - this.cb_fld[var1 * 5 + 4]);
						}

						float var42;
						if (this.xe_fld[var9 + 5] != 0.0F) {
							var42 = var43;
						} else {
							kz_fld[3] = this.cb_fld[var1 * 5 + 3];
							kz_fld[2] = this.cb_fld[var1 * 5 + 2];
							kz_fld[1] = this.cb_fld[var1 * 5 + 1];
							kz_fld[0] = this.cb_fld[var1 * 5 + 0] - var43;
							Arrays.fill(lq_fld, 0.0F);
							int var44 = ku(kz_fld, 3, 0.0F, true, 1.0F, true, lq_fld);
							if (var44 == 1) {
								var42 = lq_fld[0];
							} else {
								var42 = 0.0F;
							}
						}

						return var42 * (this.xe_fld[var9 + 1] + (var42 * this.xe_fld[var9 + 3] + this.xe_fld[var9 + 2]) * var42) + this.xe_fld[var9 + 0];
					} else {
						float var41 = var2 - this.cb_fld[var1 * 5 + 4];
						return this.cb_fld[var1 * 5 + 3] + var41 * (this.cb_fld[var1 * 5 + 2] + (this.cb_fld[var1 * 5 + 1] + var41 * this.cb_fld[var1 * 5 + 0]) * var41);
					}
				} else {
					return this.vv_fld[var8] != var2 && var8 + 1 < var4 ? this.xz_fld[(var8 + 1) * 5 + 0] : this.xz_fld[var8 * 5 + 0];
				}
			}
		}
	}

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	public boolean rl(int var1, int var2, int var3, int var4) {
		int var5 = this.qt_fld[var1];
		if (var5 < 0 || this.vv_fld[var5] > var2 || var5 + 1 < var4 && this.vv_fld[var5 + 1] <= var2) {
			int var6 = var4 - var3;
			if (var6 > 0) {
				int var7 = var3;
				int var8 = var4 - 1;

				do {
					int var9 = var8 + var7 >> 1;
					if (var2 < this.vv_fld[var9]) {
						if (var2 > this.vv_fld[var9 - 1]) {
							var5 = var9 - 1;
							break;
						}

						var8 = var9 - 1;
					} else {
						if (var2 <= this.vv_fld[var9]) {
							var5 = var9;
							break;
						}

						if (var2 < this.vv_fld[var9 + 1]) {
							var5 = var9;
							break;
						}

						var7 = var9 + 1;
					}
				} while (var7 <= var8);
			}

			if (!zu_fld && var5 == -1) {
				throw new AssertionError();
			}

			if (var5 != this.qt_fld[var1]) {
				this.qt_fld[var1] = var5;
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)Lsp;"
	)
	public static synchronized sp hc(int var0) throws EOFException {
		try {
			sp var1 = (sp)oo_fld.bs(var0);
			if (var1 != null) {
				return var1;
			} else {
				uv var3 = client.sd_fld[22];
				uv var4 = client.sd_fld[1];
				byte[] var5 = var3.qi(var0 >> 16 & 65535, var0 & 65535);
				boolean var2;
				if (var5 == null) {
					var2 = false;
				} else {
					int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
					byte[] var7 = var4.qi(var6, 0);
					var2 = var7 != null;
				}

				if (!var2) {
					return null;
				} else {
					if (ag_fld == null) {
						ak_fld = Runtime.getRuntime().availableProcessors();
						ag_fld = new ThreadPoolExecutor(0, ak_fld, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(ak_fld + 100), new sh());
					}

					var1 = new sp(client.sd_fld[22], client.sd_fld[1], var0);
					oo_fld.at(var1, var0);
					return var1;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)Z"
	)
	static boolean an(ub var0, ub var1, int var2) throws EOFException {
		try {
			byte[] var3 = var0.cx(var2 >> 16 & 65535, var2 & 65535, -763835459);
			if (null == var3) {
				return false;
			} else {
				int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
				byte[] var5 = var1.cx(var4, 0, -2049212336);
				return null != var5;
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILsi;II)V"
	)
	public void at(int var1, si var2, int var3, int var4) {
		uy var5 = kv.ak();
		rq(this, var5, var3, var2, var1);
		this.ar(var5, var3, var2, var1);
		dd(this, var5, var3, var2, var1, (byte)-116);
		var2.ah(var5);
		var5.aq();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aq() {
		if (this.as_fld == null && null == this.ar_fld) {
			return true;
		} else {
			if (null != this.as_fld) {
				if (!this.as_fld.isDone()) {
					return false;
				}

				this.as_fld = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.ar_fld.size(); var2++) {
				if (!((Future)this.ar_fld.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.ar_fld.remove(var2);
					var2--;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.ar_fld = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lsp;)Z"
	)
	public static boolean ig(sp var0) {
		if (var0.as_fld == null && null == var0.ar_fld) {
			return true;
		} else {
			if (null != var0.as_fld) {
				if (!var0.as_fld.isDone()) {
					return false;
				}

				var0.as_fld = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < var0.ar_fld.size(); var2++) {
				if (!((Future)var0.ar_fld.get(var2)).isDone()) {
					var1 = false;
				} else {
					var0.ar_fld.remove(var2);
					var2--;
				}
			}

			if (!var1) {
				return false;
			} else {
				var0.ar_fld = null;
				return true;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean am() {
		if (this.as_fld == null && null == this.ar_fld) {
			return true;
		} else {
			if (null != this.as_fld) {
				if (!this.as_fld.isDone()) {
					return false;
				}

				this.as_fld = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.ar_fld.size(); var2++) {
				if (!((Future)this.ar_fld.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.ar_fld.remove(var2);
					var2--;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.ar_fld = null;
				return true;
			}
		}
	}

	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)Z"
	)
	public static boolean sp(sp var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			Future var2 = var0.as_fld;
			if (var2 == null) {
				return true;
			} else if (var2.isDone()) {
				var0.as_fld = null;
				var0.ar_fld = null;
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ad() {
		return this.ay_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;I)V"
	)
	void bd(uy var1, int var2, si var3, int var4) {
		float[] var5 = var3.ar(this.aw_fld);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.ae_fld[var2] != null) {
			sn var9 = this.ae_fld[var2][3];
			sn var10 = this.ae_fld[var2][4];
			sn var11 = this.ae_fld[var2][5];
			if (var9 != null) {
				var6 = var9.az(var4);
			}

			if (null != var10) {
				var7 = var10.az(var4);
			}

			if (var11 != null) {
				var8 = var11.az(var4);
			}
		}

		var1.qe_fld = var6;
		var1.na_fld = var7;
		var1.ql_fld = var8;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILsi;II)V"
	)
	public void aj(int var1, si var2, int var3) {
		uy var5 = kv.ak();
		rq(this, var5, var3, var2, var1);
		this.ar(var5, var3, var2, var1);
		dd(this, var5, var3, var2, var1, (byte)-78);
		var2.ah(var5);
		var5.aq();
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lsp;ILsi;II)V"
	)
	public static void jd(sp var0, int var1, si var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			uy var5 = kv.ak();
			rq(var0, var5, var3, var2, var1);
			var0.ar(var5, var3, var2, var1);
			dd(var0, var5, var3, var2, var1, (byte)-74);
			var2.ah(var5);
			var5.aq();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aa(xi var1, int var2) {
		var1.cm();
		var1.cm();
		this.aw_fld = var1.cg();
		int var3 = var1.cm();
		this.ae_fld = new sn[ek.cg(ea.ql(this.ah_fld, (byte)7), 1514443757)][];
		this.av_fld = new sn[ea.mb(this.ah_fld, 383214187)][];
		sg[] var4 = new sg[var3];

		for (int var5 = 0; var5 < var3; var5++) {
			int var7 = var1.cg();
			se[] var8 = new se[]{se.ak_fld, se.ag_fld, se.az_fld, se.av_fld, se.ae_fld, se.ah_fld};
			se var9 = (se)ka.ak(var8, var7);
			if (var9 == null) {
				var9 = se.ak_fld;
			}

			int var18 = var1.dv();
			sf var10 = mx.ak(var1.cg());
			sn var11 = new sn();
			var11.ak(var1, var2);
			var4[var5] = new sg(this, var11, var9, var10, var18);
			int var12 = var9.ak();
			sn[][] var13;
			if (se.ag_fld == var9) {
				var13 = this.ae_fld;
			} else {
				var13 = this.av_fld;
			}

			if (null == var13[var18]) {
				var13[var18] = new sn[var12];
			}

			if (se.ae_fld == var9) {
				this.ay_fld = true;
			}
		}

		int var14 = var3 / ak_fld;
		int var6 = var3 % ak_fld;
		int var17 = 0;

		for (int var19 = 0; var19 < ak_fld; var19++) {
			int var15 = var17;
			var17 += var14;
			if (var6 > 0) {
				var17++;
				var6--;
			}

			if (var17 == var15) {
				break;
			}

			this.ar_fld.add(ag_fld.submit(new sy(this, var15, var17, var4)));
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[F)I"
	)
	public static int ku(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		return sh.ak(var0, var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ul() {
		return sp(this, -2079036724);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILsi;II)V"
	)
	public void ab(int var1, si var2, int var3) {
		uy var5 = kv.ak();
		rq(this, var5, var3, var2, var1);
		this.ar(var5, var3, var2, var1);
		dd(this, var5, var3, var2, var1, (byte)-108);
		var2.ah(var5);
		var5.aq();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;I)V"
	)
	void bm(uy var1, int var2, si var3, int var4) {
		float[] var5 = si.tb(var3, this.aw_fld);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (null != this.ae_fld[var2]) {
			sn var9 = this.ae_fld[var2][0];
			sn var10 = this.ae_fld[var2][1];
			sn var11 = this.ae_fld[var2][2];
			if (var9 != null) {
				var6 = var9.az(var4);
			}

			if (var10 != null) {
				var7 = var10.az(var4);
			}

			if (var11 != null) {
				var8 = var11.az(var4);
			}
		}

		uz var14 = qo.ak();
		var14.as(1.0F, 0.0F, 0.0F, var6);
		uz var15 = qo.ak();
		var15.as(0.0F, 1.0F, 0.0F, var7);
		uz var16 = qo.ak();
		var16.as(0.0F, 0.0F, 1.0F, var8);
		uz var12 = qo.ak();
		var12.an(var16);
		var12.an(var14);
		var12.an(var15);
		uy var13 = kv.ak();
		var13.an(var12);
		uy.es(var1, var13, -1169659103);
		var14.ae();
		var15.ae();
		var16.ae();
		var12.ae();
		var13.aq();
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;F)V"
	)
	public void to(uy var1, int var2, si var3, float var4) {
		float[] var5 = var3.wn(this.aw_fld);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		int var9 = this.gk_fld[var2 * 9 + 0];
		int var10 = this.gk_fld[var2 * 9 + 1];
		int var11 = this.gk_fld[var2 * 9 + 2];
		if (var9 != 0) {
			var6 = this.yn(var9, var4);
		}

		if (var10 != 0) {
			var7 = this.yn(var10, var4);
		}

		if (var11 != 0) {
			var8 = this.yn(var11, var4);
		}

		uz var12 = uz.ma();
		uz var13 = uz.ma();
		var13.bs(0.0F, 0.0F, 1.0F, var8);
		var12.wa(var13);
		var13.bs(1.0F, 0.0F, 0.0F, var6);
		var12.wa(var13);
		var13.bs(0.0F, 1.0F, 0.0F, var7);
		var12.wa(var13);
		uy var14 = uy.uo();
		var14.qi(var12);
		sv.ii(var1, var14);
		var14.cj();
		var12.ba();
		var13.ba();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;IB)V"
	)
	void ar(uy var1, int var2, si var3, int var4) {
		float[] var6 = var3.af(this.aw_fld);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.ae_fld[var2] != null) {
			sn var10 = this.ae_fld[var2][6];
			sn var11 = this.ae_fld[var2][7];
			sn var12 = this.ae_fld[var2][8];
			if (var10 != null) {
				var7 = var10.az(var4);
			}

			if (null != var11) {
				var8 = var11.az(var4);
			}

			if (null != var12) {
				var9 = var12.az(var4);
			}
		}

		uy var13 = kv.ak();
		var13.af(var7, var8, var9);
		uy.es(var1, var13, -789459167);
		var13.aq();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;I)V"
	)
	void bz(uy var1, int var2, si var3, int var4) {
		float[] var5 = var3.ar(this.aw_fld);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.ae_fld[var2] != null) {
			sn var9 = this.ae_fld[var2][3];
			sn var10 = this.ae_fld[var2][4];
			sn var11 = this.ae_fld[var2][5];
			if (var9 != null) {
				var6 = var9.az(var4);
			}

			if (null != var10) {
				var7 = var10.az(var4);
			}

			if (var11 != null) {
				var8 = var11.az(var4);
			}
		}

		var1.qe_fld = var6;
		var1.na_fld = var7;
		var1.ql_fld = var8;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;I)V"
	)
	void br(uy var1, int var2, si var3, int var4) {
		float[] var5 = var3.af(this.aw_fld);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.ae_fld[var2] != null) {
			sn var9 = this.ae_fld[var2][6];
			sn var10 = this.ae_fld[var2][7];
			sn var11 = this.ae_fld[var2][8];
			if (var9 != null) {
				var6 = var9.az(var4);
			}

			if (null != var10) {
				var7 = var10.az(var4);
			}

			if (null != var11) {
				var8 = var11.az(var4);
			}
		}

		uy var12 = kv.ak();
		var12.af(var6, var7, var8);
		uy.es(var1, var12, -1864846445);
		var12.aq();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public static boolean ah(int var0) {
		if (mb.ay_fld.isEmpty()) {
			return false;
		} else {
			me var2 = (me)(me)mb.ay_fld.get(0);
			return var2 != null && var0 == var2.ag_fld;
		}
	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(IFZ)F"
	)
	public float pg(int var1, float var2, boolean var3) {
		byte var4 = this.rt_fld[var1 * 2];
		byte var5 = this.rt_fld[var1 * 2 + 1];
		int var6 = this.xp_fld[var1 * 2];
		int var7 = this.xp_fld[var1 * 2 + 1];
		float var8 = 0.0F;
		int var9 = var7 - var6;
		if (var9 == 0) {
			return var8;
		} else {
			float var10 = this.vv_fld[var6];
			float var11 = this.vv_fld[var7 - 1];
			float var12 = var11 - var10;
			if (0.0F == var12) {
				return this.xz_fld[var6 * 5 + 0];
			} else {
				float var13;
				if (var2 > var11) {
					var13 = (var2 - var11) / var12;
				} else {
					var13 = (var2 - var10) / var12;
				}

				float var14 = (int)var13;
				float var15 = Math.abs(var13 - var14);
				float var16 = var15 * var12;
				var14 = Math.abs(var14 + 1.0F);
				float var17 = var14 / 2.0F;
				float var18 = (int)var17;
				var15 = var17 - var18;
				if (var3) {
					if (var4 == 4) {
						if (0.0F != var15) {
							var16 += var10;
						} else {
							var16 = var11 - var16;
						}
					} else if (var4 != 2 && var4 != 3) {
						if (var4 == 1) {
							var16 = var10 - var2;
							float var19 = this.xz_fld[var6 * 5 + 1];
							float var20 = this.xz_fld[var6 * 5 + 2];
							var8 = this.xz_fld[var6 * 5 + 0];
							if (0.0F != var19) {
								var8 -= var20 * var16 / var19;
							}

							return var8;
						}
					} else {
						var16 = var11 - var16;
					}
				} else if (var5 == 4) {
					if (var15 != 0.0F) {
						var16 = var11 - var16;
					} else {
						var16 += var10;
					}
				} else if (var5 != 2 && var5 != 3) {
					if (var5 == 1) {
						var16 = var2 - var11;
						float var29 = this.xz_fld[(var7 - 1) * 5 + 3];
						float var30 = this.xz_fld[(var7 - 1) * 5 + 4];
						var8 = this.xz_fld[(var7 - 1) * 5 + 0];
						if (0.0F != var29) {
							var8 += var30 * var16 / var29;
						}

						return var8;
					}
				} else {
					var16 += var10;
				}

				var8 = this.sv(var1, var16);
				if (var3 && var4 == 3) {
					float var31 = this.xz_fld[(var7 - 1) * 5 + 0] - this.xz_fld[var6 * 5 + 0];
					var8 -= var14 * var31;
				} else if (!var3 && var5 == 3) {
					float var21 = this.xz_fld[(var7 - 1) * 5 + 0] - this.xz_fld[var6 * 5 + 0];
					var8 += var21 * var14;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void az(xi var1, int var2, int var3) {
		var1.da();
		var1.kc(1895659501);
		this.az_fld = var1.eq() * 1806707627;
		int var4 = var1.kz(1940020458);
		this.ae_fld = new sn[ek.cg(ea.ql(this.ah_fld, (byte)-90), 1768035152)][];
		this.av_fld = new sn[ea.mb(this.ah_fld, -1950750840)][];
		sg[] var5 = new sg[var4];

		for (int var6 = 0; var6 < var4; var6++) {
			int var8 = var1.co((byte)56);
			se[] var9 = new se[]{se.ak_fld, se.ak_fld, se.ak_fld, se.ag_fld, se.av_fld, se.ah_fld};
			se var10 = (se)ka.ak(var9, var8);
			if (var10 == null) {
				var10 = se.ag_fld;
			}

			int var19 = var1.dm();
			sf var11 = mx.ak(var1.em());
			sn var12 = new sn();
			var12.ak(var1, var2);
			var5[var6] = new sg(this, var12, var10, var11, var19);
			int var13 = var10.ak();
			sn[][] var14;
			if (se.ae_fld == var10) {
				var14 = this.ae_fld;
			} else {
				var14 = this.av_fld;
			}

			if (null == var14[var19]) {
				var14[var19] = new sn[var13];
			}

			if (se.ae_fld == var10) {
				this.ay_fld = true;
			}
		}

		int var15 = var4 / ak_fld;
		int var7 = var4 % oc_fld;
		int var18 = 0;

		for (int var20 = 0; var20 < ak_fld; var20++) {
			if (var3 <= -358456440) {
				return;
			}

			int var16 = var18;
			var18 += var15;
			if (var7 > 0) {
				var18++;
				var7--;
			}

			if (var18 == var16) {
				break;
			}

			this.ar_fld.add(ag_fld.submit(new sy(this, var16, var18, var5)));
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean av(int var1) {
		Future var2 = this.as_fld;
		if (var2 == null) {
			return true;
		} else if (var2.isDone()) {
			this.as_fld = null;
			this.ar_fld = null;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "(Lsp;Luy;ILsi;II)V"
	)
	public static void rq(sp var0, uy var1, int var2, si var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		float[] var6 = si.tb(var3, var0.aw_fld);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != var0.ae_fld[var2]) {
			sn var10 = var0.ae_fld[var2][0];
			sn var11 = var0.ae_fld[var2][1];
			sn var12 = var0.ae_fld[var2][2];
			if (var10 != null) {
				var7 = var10.az(var4);
			}

			if (var11 != null) {
				var8 = var11.az(var4);
			}

			if (var12 != null) {
				var9 = var12.az(var4);
			}
		}

		uz var15 = qo.ak();
		var15.as(1.0F, 0.0F, 0.0F, var7);
		uz var16 = qo.ak();
		var16.as(0.0F, 1.0F, 0.0F, var8);
		uz var17 = qo.ak();
		var17.as(0.0F, 0.0F, 1.0F, var9);
		uz var13 = qo.ak();
		var13.an(var17);
		var13.an(var15);
		var13.an(var16);
		uy var14 = kv.ak();
		var14.an(var13);
		uy.es(var1, var14, -1690079226);
		var15.ae();
		var16.ae();
		var17.ae();
		var13.ae();
		var14.aq();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;II)V"
	)
	void ay(uy var1, int var2, si var3, int var4, int var5) {
		float[] var6 = si.tb(var3, this.aw_fld);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.ae_fld[var2]) {
			sn var10 = this.ae_fld[var2][0];
			sn var11 = this.ae_fld[var2][1];
			sn var12 = this.ae_fld[var2][2];
			if (var10 != null) {
				var7 = var10.az(var4);
			}

			if (var11 != null) {
				var8 = var11.az(var4);
			}

			if (var12 != null) {
				var9 = var12.az(var4);
			}
		}

		uz var15 = qo.ak();
		var15.as(1.0F, 0.0F, 0.0F, var7);
		uz var16 = qo.ak();
		var16.as(0.0F, 1.0F, 0.0F, var8);
		uz var17 = qo.ak();
		var17.as(0.0F, 0.0F, 1.0F, var9);
		uz var13 = qo.ak();
		var13.an(var17);
		var13.an(var15);
		var13.an(var16);
		uy var14 = kv.ak();
		var14.an(var13);
		uy.es(var1, var14, -1690079226);
		var15.ae();
		var16.ae();
		var17.ae();
		var13.ae();
		var14.aq();
	}

	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void vt(xi var1) {
		try {
			int var2 = var1.pu();
			int var3 = var1.pu();
			this.aw_fld = var1.yu();
			this.gk_fld = new int[this.ah_fld.as_fld.zj() * 9];
			this.xy_fld = new int[this.ah_fld.ah_fld * -1233104955 * 1];
			int var4 = var1.pu();
			int[] var5 = new int[var4];
			this.xp_fld = new int[var4 * 2];
			this.qt_fld = new int[var4];
			Arrays.fill(this.qt_fld, -1);
			this.ix_fld = new int[var4];
			this.cb_fld = new float[var4 * 5];
			this.rt_fld = new byte[var4 * 2];
			int var6 = 0;
			int var7 = 0;

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = var1.yu();
				int var10 = var1.vz();
				int var11 = var1.yu();
				int var12 = var1.pu();
				var1.yu();
				this.rt_fld[var8 * 2] = var1.ik();
				this.rt_fld[var8 * 2 + 1] = var1.ik();
				boolean var13 = var1.yu() != 0;
				this.ix_fld[var8] = var13 ? 6 * var7++ : -1;
				var5[var8] = var1.ih();
				this.xp_fld[var8 * 2] = var6;
				this.xp_fld[var8 * 2 + 1] = var6 + var12;
				var6 += var12;
				var1.no(var1.ih() + 22 * var12);
				int[] var20;
				byte var21;
				if (var9 == 1) {
					var20 = this.gk_fld;
					var21 = 9;
				} else {
					var20 = this.xy_fld;
					var21 = 1;
				}

				int var14 = oe(var11);
				if (var14 < var21) {
					var20[var10 * var21 + var14] = var8 + 1;
				}

				if (var9 == 4) {
					this.ay_fld = true;
				}
			}

			this.xe_fld = new float[6 * var7];
			this.vv_fld = new short[var6];
			this.xz_fld = new float[var6 * 5];

			for (int var16 = 0; var16 < var4; var16++) {
				var1.no(var5[var16]);
				int var17 = this.xp_fld[var16 * 2];

				for (int var18 = this.xp_fld[var16 * 2 + 1]; var17 < var18; var17++) {
					this.vv_fld[var17] = (short)var1.xh();

					for (int var19 = 0; var19 < 5; var19++) {
						this.xz_fld[var17 * 5 + var19] = var1.cd();
					}
				}
			}
		} catch (Exception var15) {
			client.logger.error("AnimMaya{}", this.az_fld, var15);
			throw var15;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luy;ILsi;IB)V"
	)
	void as(uy var1, int var2, si var3, int var4, byte var5) {
		float[] var6 = var3.ar(this.az_fld * 1323923203);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.ae_fld[var2] != null) {
			sn var10 = this.ae_fld[var2][3];
			sn var11 = this.ae_fld[var2][4];
			sn var12 = this.ae_fld[var2][5];
			if (var10 != null) {
				if (var5 >= 0) {
					return;
				}

				var7 = var10.az(var4);
			}

			if (null != var11) {
				var8 = var11.az(var4);
			}

			if (var12 != null) {
				if (var5 >= 0) {
					return;
				}

				var9 = var12.az(var4);
			}
		}

		var1.cg_fld = var7;
		var1.hj_fld = var8;
		var1.na_fld = var9;
	}
}
