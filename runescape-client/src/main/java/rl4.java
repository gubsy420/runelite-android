import java.io.EOFException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PreMapLoad;
import net.runelite.api.hooks.DrawCallbacks;

@ObfuscatedName("rl4")
public class rl4 implements Runnable {
	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int xs_fld;
	// $VF: synthetic field
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean eh_fld = !rl4.class.desiredAssertionStatus();
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ru_fld;
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] tv_fld;
	@ObfuscatedGetter(
		intValue = -1124760005
	)
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int me_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	public byte[][] av_fld;
	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] rf_fld;
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lnet/runelite/api/hooks/DrawCallbacks;"
	)
	public DrawCallbacks wn_fld;
	@ObfuscatedGetter(
		intValue = 865476309
	)
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] vj_ArrArrArrint;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] nk_ArrArrArrbyte;
	@ObfuscatedGetter(
		intValue = 1935598751
	)
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int rt_fld;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	public gn[] rp_fld;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	public short[][][] qp_ArrArrArrshort;
	@ObfuscatedGetter(
		intValue = 865476309
	)
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int vj_int;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] ra_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] by_Arrint;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	public int[][] qp_ArrArrint;
	@ObfuscatedName("yp")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev yp_fld;
	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] xi_fld;
	@ObfuscatedGetter(
		intValue = -1741771799
	)
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int vy_fld;
	@ObfuscatedName("yv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int yv_fld;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nk_int;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bx_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Thread;"
	)
	public static Thread by_java_lang_Thread;
	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public dx zu_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/Future;"
	)
	public Future bl_fld;
	@ObfuscatedGetter(
		intValue = 649742121
	)
	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nv_fld;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ExecutorService;"
	)
	public static ExecutorService hu_fld = Executors.newSingleThreadExecutor(var0 -> {
		Thread var1 = new Thread(var0, "Map Loader");
		by_java_lang_Thread = var1;
		var1.setDaemon(true);
		return var1;
	});
	@ObfuscatedGetter(
		intValue = 1702037623
	)
	@ObfuscatedName("yl")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public iw yl_iw = new iw(64);
	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] lm_fld;
	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int mg_fld;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] sw_fld;
	@ObfuscatedGetter(
		intValue = 1702037623
	)
	@ObfuscatedName("yl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int yl_int;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int gn_fld;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int sm_fld;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	public short[][][] hj_fld;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lwq;"
	)
	public wq pp_fld;
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] lz_fld;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public iw gj_fld = new iw(64);
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	public byte[][] qc_fld;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] mh_fld;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public na wc_fld = new na();
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] bf_fld;
	@ObfuscatedGetter(
		intValue = -2093135687
	)
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int wq_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cy_fld;

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean xg() {
		try {
			uv var1 = client.xz_Arruv[5];
			int var2 = 0;

			for (int var3 = 0; var3 < this.pp_fld.ag_fld.length; var3++) {
				int var4 = this.pp_fld.ag_fld[var3];
				if (var4 != -1) {
					if (this.av_fld[var3] == null) {
						boolean var5 = var1.getFileIds(var4) != null;
						this.av_fld[var3] = var1.loadData(var4, 0);
						if (var5 && this.av_fld[var3] == null) {
							var2++;
						}
					}

					if (this.qc_fld[var3] == null) {
						boolean var36 = var1.getFileIds(var4) != null;
						this.qc_fld[var3] = var1.loadData(var4, 1);
						if (var36 && this.qc_fld[var3] == null) {
							var2++;
						}
					}
				}
			}

			if (var2 > 0) {
				return false;
			} else {
				boolean var29 = true;

				for (int var30 = 0; var30 < this.av_fld.length; var30++) {
					byte[] var37 = this.qc_fld[var30];
					if (var37 != null) {
						int var6 = (this.pp_fld.ag_fld[var30] >> 8) * 64 - this.yl_int;
						int var7 = (this.pp_fld.ag_fld[var30] & 0xFF) * 64 - this.nv_fld;
						var29 &= this.gs(var37, var6, var7);
					}
				}

				if (!var29) {
					return false;
				} else {
					this.bf_fld = new int[4][this.nk_int + 1][this.bx_fld + 1];
					this.yp_fld = new ev(this.zu_fld == bw.dk_fld, 4, this.nk_int, this.bx_fld, cx.kq_fld.aq_fld, er.ak_fld, this.bf_fld);
					this.yp_fld.po_fld = this.zu_fld.ag_fld;
					this.yp_fld.in_ArrArrArrrl10 = new rl10[4][this.rt_fld][this.vy_fld];
					this.yp_fld.jh_fld = this.gn_fld;
					this.yp_fld.oq_fld = this.sm_fld;
					this.yp_fld.rm_fld = this.xs_fld;
					this.yp_fld.zc_fld = this.cy_fld;
					this.yp_fld.jq_fld = this.mg_fld;
					this.yp_fld.sv_fld = false;
					this.rp_fld = new gn[4];

					for (int var31 = 0; var31 < 4; var31++) {
						this.rp_fld[var31] = new gn(this.rt_fld, this.vy_fld, !this.zu_fld.isTopLevel());
					}

					this.tv_fld = new byte[4][this.nk_int][this.bx_fld];
					dt.ar_fld = 99;
					this.qp_ArrArrArrshort = new short[4][this.nk_int][this.bx_fld];
					this.hj_fld = new short[4][this.nk_int][this.bx_fld];
					this.nk_ArrArrArrbyte = new byte[4][this.nk_int][this.bx_fld];
					this.sw_fld = new byte[4][this.nk_int][this.bx_fld];
					this.yp_fld.rz_ArrArrArrshort = this.qp_ArrArrArrshort;
					this.yp_fld.yb_fld = this.hj_fld;
					this.yp_fld.xc_ArrArrArrbyte = this.nk_ArrArrArrbyte;
					this.yp_fld.la_fld = this.tv_fld;
					this.yp_fld.yr_fld = this.yl_int;
					this.yp_fld.nd_fld = this.nv_fld;
					this.yp_fld.hg_boolean = this.pp_fld.ak_fld;
					this.yp_fld.xl_fld = this.pp_fld.az_fld;
					this.yp_fld.mp_fld = this.pp_fld.ag_fld;
					if (!this.pp_fld.ak_fld) {
						byte var8 = 6;
						int var9 = 6 + this.yv_fld;
						int var10 = this.vj_int - var9 >> 3;
						int var11 = this.vj_int + var9 >> 3;
						int var12 = this.wq_fld - var9 >> 3;
						int var13 = this.wq_fld + var9 >> 3;
						int var14 = this.vj_int - var8 >> 3;
						int var15 = this.vj_int + var8 >> 3;
						int var16 = this.wq_fld - var8 >> 3;
						int var17 = this.wq_fld + var8 >> 3;
						int var18 = 0;

						for (int var19 = var10; var19 <= var11; var19++) {
							for (int var20 = var12; var20 <= var13; var20++) {
								if (var19 < var14 || var19 > var15 || var20 < var16 || var20 > var17) {
									var18++;
								}
							}
						}

						int[] var32 = new int[var18];
						byte[][] var38 = new byte[var18][];
						byte[][] var41 = new byte[var18][];
						boolean[] var46 = new boolean[var18];
						int var100 = var10;

						for (int var101 = 0; var100 <= var11; var100++) {
							for (int var21 = var12; var21 <= var13; var21++) {
								if (var100 < var14 || var100 > var15 || var21 < var16 || var21 > var17) {
									int var22 = var21 | var100 << 8;
									var32[var101] = var22;
									var38[var101] = var1.loadData(var22, 0);
									var41[var101] = var1.loadData(var22, 1);
									int var23 = var100 * 64 - this.yl_int;
									int var24 = var21 * 64 - this.nv_fld;
									var46[var101] = var38[var101] != null && var41[var101] != null && this.gs(var41[var101], var23, var24);
									var101++;
								}
							}
						}

						for (int var51 = 0; var51 < this.av_fld.length; var51++) {
							byte[] var61 = this.av_fld[var51];
							if (var61 != null) {
								var10 = this.pp_fld.ag_fld[var51];
								var11 = (var10 >> 8 << 6) - this.yl_int;
								var12 = ((var10 & 0xFF) << 6) - this.nv_fld;
								if (!eh_fld && this.vj_int - 48 != this.yl_int) {
									throw new AssertionError();
								}

								if (!eh_fld && this.wq_fld - 48 != this.nv_fld) {
									throw new AssertionError();
								}

								this.iq(var61, var11, var12, this.yl_int, this.nv_fld, this.rp_fld);
							}
						}

						for (int var52 = 0; var52 < var32.length; var52++) {
							if (var46[var52]) {
								var9 = var32[var52];
								var10 = (var9 >> 8 << 6) - this.yl_int;
								var11 = ((var9 & 0xFF) << 6) - this.nv_fld;
								this.iq(var38[var52], var10, var11, this.yl_int, this.nv_fld, this.rp_fld);
							}
						}

						for (int var53 = 0; var53 < this.av_fld.length; var53++) {
							byte[] var63 = this.av_fld[var53];
							if (var63 == null && this.wq_fld < 800) {
								var10 = this.pp_fld.ag_fld[var53];
								var11 = (var10 >> 8 << 6) - this.yl_int;
								var12 = ((var10 & 0xFF) << 6) - this.nv_fld;
								this.dr(var11, var12, 64, 64);
							}
						}

						for (int var54 = 0; var54 < var32.length; var54++) {
							if (!var46[var54] && this.wq_fld < 800) {
								var9 = var32[var54];
								var10 = (var9 >> 8 << 6) - this.yl_int;
								var11 = ((var9 & 0xFF) << 6) - this.nv_fld;
								this.dr(var10, var11, 64, 64);
							}
						}

						client.ef();

						for (int var55 = 0; var55 < this.av_fld.length; var55++) {
							byte[] var65 = this.qc_fld[var55];
							if (var65 != null) {
								var10 = this.pp_fld.ag_fld[var55];
								var11 = (var10 >> 8 << 6) - this.yl_int;
								var12 = ((var10 & 0xFF) << 6) - this.nv_fld;
								this.yu(this.zu_fld, var65, var11, var12, this.rp_fld);
							}
						}

						for (int var56 = 0; var56 < var32.length; var56++) {
							if (var46[var56]) {
								var9 = var32[var56];
								var10 = (var9 >> 8 << 6) - this.yl_int;
								var11 = ((var9 & 0xFF) << 6) - this.nv_fld;
								this.yu(this.zu_fld, var41[var56], var10, var11, this.rp_fld);
							}
						}

						client.tm_void();
						client.ef();
					} else {
						int var33 = this.rt_fld / 8;
						int var39 = this.vy_fld / 8;

						for (int var42 = 0; var42 < 4; var42++) {
							for (int var47 = 0; var47 < var33; var47++) {
								for (int var57 = 0; var57 < var39; var57++) {
									boolean var67 = false;
									int var76 = this.pp_fld.az_fld[var42][var47][var57];
									if (var76 != -1) {
										int var84 = var76 >> 24 & 3;
										int var89 = var76 >> 1 & 3;
										int var91 = var76 >> 14 & 1023;
										int var93 = var76 >> 3 & 2047;
										int var95 = (var91 / 8 << 8) + var93 / 8;

										for (int var97 = 0; var97 < this.pp_fld.ag_fld.length; var97++) {
											if (this.pp_fld.ag_fld[var97] == var95 && this.av_fld[var97] != null) {
												int var98 = (var91 - var47) * 8;
												int var99 = (var93 - var57) * 8;
												this.us(this.av_fld[var97], var42, var47 * 8, var57 * 8, var84, (var91 & 7) * 8, (var93 & 7) * 8, var89, var98, var99);
												var67 = true;
												break;
											}
										}
									}

									if (!var67) {
										this.gu(var42, var47 * 8, var57 * 8);
									}
								}
							}
						}

						for (int var43 = 0; var43 < 13; var43++) {
							for (int var48 = 0; var48 < 13; var48++) {
								int var58 = this.pp_fld.az_fld[0][var43][var48];
								if (var58 == -1) {
									this.dr(var43 * 8, var48 * 8, 8, 8);
								}
							}
						}

						for (int var44 = 0; var44 < 4; var44++) {
							for (int var49 = 0; var49 < var33; var49++) {
								for (int var59 = 0; var59 < var39; var59++) {
									int var68 = this.pp_fld.az_fld[var44][var49][var59];
									if (var68 != -1) {
										int var77 = var68 >> 24 & 3;
										int var85 = var68 >> 1 & 3;
										int var90 = var68 >> 14 & 1023;
										int var92 = var68 >> 3 & 2047;
										int var94 = (var90 / 8 << 8) + var92 / 8;

										for (int var96 = 0; var96 < this.pp_fld.ag_fld.length; var96++) {
											if (this.pp_fld.ag_fld[var96] == var94 && this.qc_fld[var96] != null) {
												this.hs(this.zu_fld, this.qc_fld[var96], var44, var49 * 8, var59 * 8, var77, (var90 & 7) * 8, (var92 & 7) * 8, var85, this.rp_fld);
												break;
											}
										}
									}
								}
							}
						}
					}

					this.ff();
					synchronized (oe.cv_fld) {
						oe.cv_fld.reset();
					}

					oe.cs_fld.reset();
					if (this.zu_fld.isTopLevel()) {
						if (client.gk_fld) {
							this.yp_fld.kb(dt.ar_fld);
						} else {
							this.yp_fld.kb(0);
						}

						if (!this.pp_fld.ak_fld) {
							int var35 = (this.vj_int - 6) / 8;
							int var40 = (this.vj_int + 6) / 8;
							int var45 = (this.wq_fld - 6) / 8;
							int var50 = (this.wq_fld + 6) / 8;

							for (int var60 = var35 - 1; var60 <= var40 + 1; var60++) {
								for (int var69 = var45 - 1; var69 <= var50 + 1; var69++) {
									if (var60 < var35 || var60 > var40 || var69 < var45 || var69 > var50) {
										var1.ib((var60 << 8) + var69);
									}
								}
							}
						}
					}

					this.yp_fld.vn();
					this.vj_ArrArrArrint = this.nt();
					this.lz_fld = this.ik();
					if (!this.zu_fld.isTopLevel()) {
						if (this.wn_fld != null) {
							this.wn_fld.loadScene(this.zu_fld, this.yp_fld);
						}

						return true;
					} else {
						client.hl(this.yp_fld);
						og.ci_fld.getCallbacks().post(new PreMapLoad(this.zu_fld, this.yp_fld));
						if (this.wn_fld != null) {
							this.wn_fld.loadScene(this.yp_fld);
							this.wn_fld.loadScene(this.zu_fld, this.yp_fld);
						}

						return true;
					}
				}
			}
		} catch (Throwable var28) {
			throw new RuntimeException(var28);
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IIIIII)V"
	)
	public void ys(xi var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 0 && var2 < 4 && var3 >= this.sm_fld && var3 < this.xs_fld && var4 >= this.cy_fld && var4 < this.mg_fld) {
			int var12 = var3 + this.gn_fld;
			int var9 = var4 + this.gn_fld;
			this.tv_fld[var2][var12][var9] = 0;

			while (true) {
				int var10 = var1.if_int();
				if (var10 == 0) {
					if (var2 == 0) {
						this.bf_fld[0][var12][var9] = -vu(var5 + 932731, var6 + 556238) * 8;
					} else {
						this.bf_fld[var2][var12][var9] = this.bf_fld[var2 - 1][var12][var9] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.gf();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						this.bf_fld[0][var12][var9] = -var11 * 8;
					} else {
						this.bf_fld[var2][var12][var9] = this.bf_fld[var2 - 1][var12][var9] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					this.hj_fld[var2][var12][var9] = (short)var1.ri();
					this.nk_ArrArrArrbyte[var2][var12][var9] = (byte)((var10 - 2) / 4);
					this.sw_fld[var2][var12][var9] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					this.tv_fld[var2][var12][var9] = (byte)(var10 - 49);
				} else {
					this.qp_ArrArrArrshort[var2][var12][var9] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				int var8 = var1.if_int();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var1.gf();
					break;
				}

				if (var8 <= 49) {
					var1.ri();
				}
			}
		}
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIILgn;)V"
	)
	public static void ps(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, gn var7) throws EOFException {
		try {
			un.ax(var0, var1, var2, var3, var4, var5, var6, var7);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int me(int var0, int var1, int var2) {
		return ue.ai(var0, var1, var2);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIIIII[Lgn;)V"
	)
	public void hs(dx var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, gn[] var10) {
		try {
			xi var11 = new xi(var2);
			int var12 = -1;

			while (true) {
				int var13 = var11.zk();
				if (var13 == 0) {
					return;
				}

				var12 += var13;
				int var14 = 0;

				while (true) {
					int var15 = var11.rb();
					if (var15 == 0) {
						break;
					}

					var14 += var15 - 1;
					int var16 = var14 & 63;
					int var17 = var14 >> 6 & 63;
					int var18 = var14 >> 12;
					int var19 = var11.gf();
					int var20 = var19 >> 2;
					int var21 = var19 & 3;
					if (var18 == var6 && var17 >= var7 && var17 < var7 + 8 && var16 >= var8 && var16 < var8 + 8) {
						oe var22 = oe.ke(var12);
						int var23 = var4 + si(var17 & 7, var16 & 7, var9, var22.cb_fld, var22.co_fld, var21);
						int var24 = var5 + iw(var17 & 7, var16 & 7, var9, var22.cb_fld, var22.co_fld, var21);
						if (var23 > this.sm_fld && var24 > this.cy_fld && var23 < this.xs_fld - 1 && var24 < this.mg_fld - 1) {
							int var25 = var3;
							if ((this.tv_fld[1][var23 + this.gn_fld][var24 + this.gn_fld] & 2) == 2) {
								var25 = var3 - 1;
							}

							gn var26 = null;
							if (var25 >= 0) {
								var26 = var10[var25];
							}

							ps(var1, var3, var23, var24, var12, var21 + var9 & 3, var20, var26);
						}
					}
				}
			}
		} catch (Throwable var28) {
			throw new RuntimeException(var28);
		}
	}

	@ObfuscatedName("yy")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int yy(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void run() {
		try {
			try {
				while (!this.xg()) {
					try {
						Thread.sleep(20L);
					} catch (InterruptedException var3) {
					}
				}
			} catch (Throwable var4) {
				mk("map loading", var4);
				throw var4;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void it() {
		try {
			try {
				this.bl_fld.get();
			} catch (Throwable var3) {
				throw var3;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int na(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	public int[][][] nt() {
		int[][][] var1 = new int[4][this.rt_fld + 1][this.vy_fld + 1];

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < this.rt_fld + 1; var3++) {
				for (int var4 = 0; var4 < this.vy_fld + 1; var4++) {
					var1[var2][var3][var4] = this.bf_fld[var2][var3 + this.gn_fld][var4 + this.gn_fld];
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V"
	)
	public static void mk(String var0, Throwable var1) {
		gl.ak(var0, var1);
	}

	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int vu(int var0, int var1) {
		int var2 = me(45365 + var0, 91923 + var1, 4) - 128 + (me(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (me(var0, var1, 1) - 128 >> 2);
		var2 = (int)(var2 * 0.3) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "(Lno;Lvw;)Lvw;"
	)
	public static vw tg(no var0, vw var1) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var2;
		if (var1 == null) {
			var2 = var0.ak_fld.hg_vw;
		} else {
			var2 = var1;
		}

		if (var2 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var2.hg_vw;
			return var2;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ff() {
		try {
			for (int var1 = 0; var1 < 4; var1++) {
				for (int var2 = 0; var2 < this.rt_fld; var2++) {
					int var3 = var2 + this.gn_fld;

					for (int var4 = 0; var4 < this.vy_fld; var4++) {
						int var5 = var4 + this.gn_fld;
						if ((this.tv_fld[var1][var3][var5] & 1) == 1) {
							int var6 = var1;
							if ((this.tv_fld[1][var3][var5] & 2) == 2) {
								var6 = var1 - 1;
							}

							if (var6 >= 0) {
								this.rp_fld[var6].jw(var2, var4);
							}
						}
					}
				}
			}

			int var35 = (int)Math.sqrt(5100.0) * 768 >> 8;

			for (int var36 = 0; var36 < 4; var36++) {
				byte[][] var38 = this.ra_fld[var36];

				for (int var40 = 1; var40 < this.yp_fld.cq_fld - 1; var40++) {
					for (int var44 = 1; var44 < this.yp_fld.cc_fld - 1; var44++) {
						int var48 = this.bf_fld[var36][var44 + 1][var40] - this.bf_fld[var36][var44 - 1][var40];
						int var7 = this.bf_fld[var36][var44][var40 + 1] - this.bf_fld[var36][var44][var40 - 1];
						int var8 = (int)Math.sqrt(var7 * var7 + var48 * var48 + 65536);
						int var9 = (var48 << 8) / var8;
						int var10 = 65536 / var8;
						int var11 = (var7 << 8) / var8;
						int var12 = (var11 * -50 + var9 * -50 + var10 * -10) / var35 + 96;
						int var13 = (var38[var44][var40 + 1] >> 3)
							+ (var38[var44 - 1][var40] >> 2)
							+ (var38[var44][var40 - 1] >> 2)
							+ (var38[var44 + 1][var40] >> 3)
							+ (var38[var44][var40] >> 1);
						this.qp_ArrArrint[var44][var40] = var12 - var13;
					}
				}

				for (int var41 = 0; var41 < this.bx_fld; var41++) {
					this.rf_fld[var41] = 0;
					this.mh_fld[var41] = 0;
					this.lm_fld[var41] = 0;
					this.ru_fld[var41] = 0;
					this.by_Arrint[var41] = 0;
				}

				for (int var42 = -5; var42 < this.nk_int + 5; var42++) {
					for (int var45 = 0; var45 < this.bx_fld; var45++) {
						int var49 = var42 + 5;
						if (var49 >= 0 && var49 < this.nk_int) {
							int var51 = this.qp_ArrArrArrshort[var36][var49][var45] & 32767;
							if (var51 > 0) {
								pl var54 = this.ej(var51 - 1);
								this.rf_fld[var45] = this.rf_fld[var45] + var54.or();
								this.mh_fld[var45] = this.mh_fld[var45] + var54.oq();
								this.lm_fld[var45] = this.lm_fld[var45] + var54.xg();
								this.ru_fld[var45] = this.ru_fld[var45] + var54.ka();
								this.by_Arrint[var45]++;
							}
						}

						int var52 = var42 - 5;
						if (var52 >= 0 && var52 < this.nk_int) {
							int var55 = this.qp_ArrArrArrshort[var36][var52][var45] & 32767;
							if (var55 > 0) {
								pl var57 = this.ej(var55 - 1);
								this.rf_fld[var45] = this.rf_fld[var45] - var57.or();
								this.mh_fld[var45] = this.mh_fld[var45] - var57.oq();
								this.lm_fld[var45] = this.lm_fld[var45] - var57.xg();
								this.ru_fld[var45] = this.ru_fld[var45] - var57.ka();
								this.by_Arrint[var45]--;
							}
						}
					}

					if (var42 >= 1 && var42 < this.nk_int - 1) {
						int var46 = 0;
						int var50 = 0;
						int var53 = 0;
						int var56 = 0;
						int var58 = 0;

						for (int var59 = -5; var59 < this.bx_fld + 5; var59++) {
							int var60 = var59 + 5;
							if (var60 >= 0 && var60 < this.bx_fld) {
								var46 += this.rf_fld[var60];
								var50 += this.mh_fld[var60];
								var53 += this.lm_fld[var60];
								var56 += this.ru_fld[var60];
								var58 += this.by_Arrint[var60];
							}

							int var61 = var59 - 5;
							if (var61 >= 0 && var61 < this.bx_fld) {
								var46 -= this.rf_fld[var61];
								var50 -= this.mh_fld[var61];
								var53 -= this.lm_fld[var61];
								var56 -= this.ru_fld[var61];
								var58 -= this.by_Arrint[var61];
							}

							if (var59 >= 1 && var59 < this.bx_fld - 1 && (!client.gk_fld || (this.tv_fld[0][var42][var59] & 2) != 0 || (this.tv_fld[var36][var42][var59] & 16) == 0)
								)
							 {
								if (var36 < dt.ar_fld) {
									dt.ar_fld = var36;
								}

								int var62 = this.qp_ArrArrArrshort[var36][var42][var59] & 32767;
								int var14 = this.hj_fld[var36][var42][var59] & 32767;
								if (var62 > 0 || var14 > 0) {
									int var15 = this.bf_fld[var36][var42][var59];
									int var16 = this.bf_fld[var36][var42 + 1][var59];
									int var17 = this.bf_fld[var36][var42 + 1][var59 + 1];
									int var18 = this.bf_fld[var36][var42][var59 + 1];
									int var19 = this.qp_ArrArrint[var42][var59];
									int var20 = this.qp_ArrArrint[var42 + 1][var59];
									int var21 = this.qp_ArrArrint[var42 + 1][var59 + 1];
									int var22 = this.qp_ArrArrint[var42][var59 + 1];
									int var23 = -1;
									int var24 = -1;
									if (var62 > 0) {
										int var25 = var46 * 256 / var56;
										int var26 = var50 / var58;
										int var27 = var53 / var58;
										var23 = fw(var25, var26, var27);
										var24 = var23;
									}

									int var63 = 0;
									if (var24 != -1) {
										var63 = fc.az_fld[tw(var24, 96)];
									}

									if (var14 == 0) {
										this.yp_fld
											.wk(
												var36,
												var42,
												var59,
												0,
												0,
												-1,
												var15,
												var16,
												var17,
												var18,
												tw(var23, var19),
												tw(var23, var20),
												tw(var23, var21),
												tw(var23, var22),
												0,
												0,
												0,
												0,
												var63,
												0
											);
									} else {
										int var64 = this.nk_ArrArrArrbyte[var36][var42][var59] + 1;
										byte var65 = this.sw_fld[var36][var42][var59];
										ov var28 = this.id(var14 - 1);
										int var29 = var28.ly();
										int var30;
										int var31;
										if (var29 >= 0) {
											var31 = hi.ni_fld.getDefaultColor(var29);
											var30 = -1;
										} else if (var28.rx() == 16711935) {
											var30 = -2;
											var29 = -1;
											var31 = -2;
										} else {
											var30 = fw(vl.ye(var28), var28.yy(), var28.ky());
											var31 = var30;
										}

										int var32 = 0;
										if (var31 != -2) {
											var32 = fc.az_fld[pl(var31, 96)];
										}

										if (var28.pf() != -1) {
											var31 = fw(var28.uo(), var28.bp(), var28.im());
											var32 = fc.az_fld[pl(var31, 96)];
										}

										this.yp_fld
											.wk(
												var36,
												var42,
												var59,
												var64,
												var65,
												var29,
												var15,
												var16,
												var17,
												var18,
												tw(var23, var19),
												tw(var23, var20),
												tw(var23, var21),
												tw(var23, var22),
												pl(var30, var19),
												pl(var30, var20),
												pl(var30, var21),
												pl(var30, var22),
												var63,
												var32
											);
									}
								}
							}
						}
					}
				}

				for (int var43 = 1; var43 < this.bx_fld - 1; var43++) {
					for (int var47 = 1; var47 < this.nk_int - 1; var47++) {
						this.yp_fld.fy(var36, var47, var43, 0);
					}
				}
			}

			this.yp_fld.zn(-50, -10, -50);

			for (int var37 = 0; var37 < this.nk_int; var37++) {
				for (int var39 = 0; var39 < this.bx_fld; var39++) {
					if ((this.tv_fld[1][var37][var39] & 2) == 2) {
						this.yp_fld.oa(var37, var39);
					}
				}
			}
		} catch (Throwable var34) {
			throw new RuntimeException(var34);
		}
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int tw(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gb() {
		if (!eh_fld && this.bl_fld != null) {
			throw new AssertionError();
		} else {
			this.bl_fld = hu_fld.submit(this);
		}
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII)V"
	)
	public void us(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		gn var11 = this.rp_fld[var2];

		for (int var12 = var3; var12 < var3 + 8; var12++) {
			for (int var13 = var4; var13 < var4 + 8; var13++) {
				if (var11.ry(var12, var13)) {
					var11.nd(var12, var13, 1073741824);
				}
			}
		}

		xi var20 = new xi(var1);

		for (int var21 = 0; var21 < 4; var21++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (var21 == var5 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var16 = var3 + yy(var14 & 7, var15 & 7, var8);
						int var17 = var4 + na(var14 & 7, var15 & 7, var8);
						int var18 = var9 + var3 + (var14 & 7);
						int var19 = var10 + var4 + (var15 & 7);
						this.ys(var20, var2, var16, var17, var18, var19, var8);
					} else {
						this.ys(var20, -1, -1, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void gu(int var1, int var2, int var3) {
		int var4 = var2 + this.gn_fld;
		int var5 = var3 + this.gn_fld;

		for (int var6 = 0; var6 < 8; var6++) {
			for (int var7 = 0; var7 < 8; var7++) {
				this.bf_fld[var1][var6 + var4][var7 + var5] = 0;
			}
		}

		if (var4 > 0) {
			for (int var8 = 1; var8 < 8; var8++) {
				this.bf_fld[var1][var4][var8 + var5] = this.bf_fld[var1][var4 - 1][var8 + var5];
			}
		}

		if (var5 > 0) {
			for (int var9 = 1; var9 < 8; var9++) {
				this.bf_fld[var1][var9 + var4][var5] = this.bf_fld[var1][var9 + var4][var5 - 1];
			}
		}

		if (var4 > 0 && this.bf_fld[var1][var4 - 1][var5] != 0) {
			this.bf_fld[var1][var4][var5] = this.bf_fld[var1][var4 - 1][var5];
		} else if (var5 > 0 && this.bf_fld[var1][var4][var5 - 1] != 0) {
			this.bf_fld[var1][var4][var5] = this.bf_fld[var1][var4][var5 - 1];
		} else if (var4 > 0 && var5 > 0 && this.bf_fld[var1][var4 - 1][var5 - 1] != 0) {
			this.bf_fld[var1][var4][var5] = this.bf_fld[var1][var4 - 1][var5 - 1];
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgn;)V"
	)
	public void iq(byte[] var1, int var2, int var3, int var4, int var5, gn[] var6) {
		if (!eh_fld && var6 == null) {
			throw new AssertionError();
		} else {
			for (int var7 = 0; var7 < 4; var7++) {
				for (int var8 = var2; var8 < var2 + 64; var8++) {
					for (int var9 = var3; var9 < var3 + 64; var9++) {
						if (var6[var7].ry(var8, var9)) {
							var6[var7].nd(var8, var9, 1073741824);
						}
					}
				}
			}

			xi var13 = new xi(var1);

			for (int var14 = 0; var14 < 4; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					for (int var10 = 0; var10 < 64; var10++) {
						int var11 = var15 + var2;
						int var12 = var10 + var3;
						this.ys(var13, var14, var11, var12, var4 + var11, var12 + var5, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;"
	)
	public pl ej(int var1) {
		try {
			pl var2 = (pl)this.yl_iw.de(var1);
			if (var2 != null) {
				return var2;
			} else {
				uv var3 = client.xz_Arruv[2];
				byte[] var4 = var3.loadData(1, var1);
				var2 = new pl();
				if (var4 != null) {
					var2.pj(new xi(var4), var1);
				}

				var2.fi();
				this.yl_iw.nk(var2, var1);
				return var2;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean kh() {
		return this.bl_fld.isDone();
	}

	public rl4(DrawCallbacks var1, int var2, dx var3, wq var4) {
		if (!eh_fld && var2 != 0 && !var3.isTopLevel()) {
			throw new AssertionError();
		} else {
			this.wn_fld = var1;
			this.rt_fld = var3.ah_fld;
			this.vy_fld = var3.aw_fld;
			int var5 = var3.isTopLevel() ? 40 : 0;
			this.nk_int = var3.ah_fld + var5 * 2;
			this.bx_fld = var3.aw_fld + var5 * 2;
			this.gn_fld = var5;
			this.yv_fld = var2;
			this.sm_fld = -var2 * 8;
			this.cy_fld = -var2 * 8;
			this.xs_fld = var3.ah_fld + var2 * 8;
			this.mg_fld = var3.aw_fld + var2 * 8;
			this.zu_fld = var3;
			this.pp_fld = var4;
			this.av_fld = new byte[var4.ag_fld.length][];
			this.qc_fld = new byte[var4.ag_fld.length][];
			this.xi_fld = new int[4][this.nk_int + 1][this.bx_fld + 1];
			this.ra_fld = new byte[4][this.nk_int + 1][this.bx_fld + 1];
			this.qp_ArrArrint = new int[this.nk_int + 1][this.bx_fld + 1];
			this.rf_fld = new int[this.bx_fld];
			this.mh_fld = new int[this.bx_fld];
			this.lm_fld = new int[this.bx_fld];
			this.ru_fld = new int[this.bx_fld];
			this.by_Arrint = new int[this.bx_fld];
		}
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int pl(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "([BII)Z"
	)
	public boolean gs(byte[] var1, int var2, int var3) {
		try {
			xi var4 = new xi(var1);
			int var5 = -1;
			boolean var6 = true;

			while (true) {
				int var7 = var4.zk();
				if (var7 == 0) {
					return var6;
				}

				var5 += var7;
				int var8 = 0;

				while (true) {
					int var9 = var4.rb();
					if (var9 == 0) {
						break;
					}

					var8 += var9 - 1;
					int var10 = var8 & 63;
					int var11 = var8 >> 6 & 63;
					var4.gf();
					int var12 = var11 + var2;
					int var13 = var10 + var3;
					if (this.pp_fld.ak_fld || var12 > this.sm_fld && var13 > this.cy_fld && var12 < this.xs_fld - 1 && var13 < this.mg_fld - 1) {
						oe var14 = oe.ke(var5);
						if ((client.jb_fld & 16) != 0 && var14.dy_fld != null) {
							if (!var14.cl()) {
								var6 = false;
							}

							for (int var15 = 0; var15 < var14.dy_fld.length; var15++) {
								oe var16 = oe.ke(var14.dy_fld[var15]);
								if (!var16.cl()) {
									var6 = false;
								}
							}
						} else if (!var14.cl()) {
							var6 = false;
						}
					}
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BII[Lgn;)V"
	)
	public void yu(dx var1, byte[] var2, int var3, int var4, gn[] var5) {
		try {
			xi var6 = new xi(var2);
			int var7 = -1;

			while (true) {
				int var8 = var6.zk();
				if (var8 == 0) {
					return;
				}

				var7 += var8;
				int var9 = 0;

				while (true) {
					int var10 = var6.rb();
					if (var10 == 0) {
						break;
					}

					var9 += var10 - 1;
					int var11 = var9 & 63;
					int var12 = var9 >> 6 & 63;
					int var13 = var9 >> 12;
					int var14 = var6.gf();
					int var15 = var14 >> 2;
					int var16 = var14 & 3;
					int var17 = var12 + var3;
					int var18 = var11 + var4;
					if (var17 > this.sm_fld && var18 > this.cy_fld && var17 < this.xs_fld - 1 && var18 < this.mg_fld - 1) {
						int var19 = var13;
						if ((this.tv_fld[1][var17 + this.gn_fld][var18 + this.gn_fld] & 2) == 2) {
							var19 = var13 - 1;
						}

						gn var20 = null;
						if (var19 >= 0) {
							var20 = var5[var19];
						}

						ps(var1, var13, var17, var18, var7, var16, var15, var20);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int fw(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		return (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "()[[[B"
	)
	public byte[][][] ik() {
		byte[][][] var1 = new byte[4][this.rt_fld][this.vy_fld];

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < this.rt_fld; var3++) {
				for (int var4 = 0; var4 < this.vy_fld; var4++) {
					var1[var2][var3][var4] = this.tv_fld[var2][var3 + this.gn_fld][var4 + this.gn_fld];
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)I"
	)
	public static int iw(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)I"
	)
	public static int si(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		int var7 = var2 & 3;
		if (var7 == 0) {
			return var0;
		} else if (var7 == 1) {
			return var1;
		} else {
			return var7 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void dr(int var1, int var2, int var3, int var4) {
		for (int var5 = var2; var5 <= var4 + var2; var5++) {
			for (int var6 = var1; var6 <= var1 + var3; var6++) {
				if (var6 >= this.sm_fld && var6 < this.xs_fld && var5 >= this.cy_fld && var5 < this.mg_fld) {
					int var7 = var6 + this.gn_fld;
					int var8 = var5 + this.gn_fld;
					this.ra_fld[0][var7][var8] = 127;
					if (var1 == var6 && var6 > 0) {
						this.bf_fld[0][var7][var8] = this.bf_fld[0][var7 - 1][var8];
					}

					if (var1 + var3 == var6 && var6 < this.nk_int - 1) {
						this.bf_fld[0][var7][var8] = this.bf_fld[0][var7 + 1][var8];
					}

					if (var5 == var2 && var5 > 0) {
						this.bf_fld[0][var7][var8] = this.bf_fld[0][var7][var8 - 1];
					}

					if (var5 == var4 + var2 && var5 < this.bx_fld - 1) {
						this.bf_fld[0][var7][var8] = this.bf_fld[0][var7][var8 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	public ov id(int var1) {
		try {
			ov var2 = (ov)this.gj_fld.de(var1);
			if (var2 != null) {
				return var2;
			} else {
				uv var3 = client.xz_Arruv[2];
				byte[] var4 = var3.loadData(4, var1);
				var2 = new ov();
				if (var4 != null) {
					var2.xa(new xi(var4), var1);
				}

				var2.au();
				return var2;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}
}
