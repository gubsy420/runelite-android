import java.io.EOFException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PreMapLoad;
import net.runelite.api.hooks.DrawCallbacks;

@ObfuscatedName("rl4")
public class rl4 implements Runnable {
	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int tx_fld;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ExecutorService;"
	)
	public static ExecutorService ru_fld = Executors.newSingleThreadExecutor(var0 -> {
		Thread var1 = new Thread(var0, "Map Loader");
		rl4.zp_fld = var1;
		var1.setDaemon(true);
		return var1;
	});
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/Future;"
	)
	@ObfuscatedGetter(
		intValue = -2093135687
	)
	public Future hs_java_util_concurrent_Future;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1702037623
	)
	public int gh_fld;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] vr_fld;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	public int[][] vj_fld;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] fn_fld;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2093135687
	)
	public int hs_int;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1741771799
	)
	public int py_int;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] ro_fld;
	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public dx lk_fld;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	public int[][][] rc_fld;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] td_fld;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int sl_fld;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	public gn[] gu_fld;
	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "Lnet/runelite/api/hooks/DrawCallbacks;"
	)
	public DrawCallbacks yb_fld;
	@ObfuscatedName("yx")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] yx_ArrArrArrbyte;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public iw oh_fld;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	@ObfuscatedGetter(
		intValue = -1741771799
	)
	public byte[][] py_ArrArrbyte;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cb_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int cg_fld;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1935598751
	)
	public int jf_fld;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public na ss_fld;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	public short[][][] ob_fld;
	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 649742121
	)
	public int vu_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 865476309
	)
	public int be_fld;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	public short[][][] ng_fld;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] st_fld;
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Lwq;"
	)
	public wq ry_fld;
	@ObfuscatedName("yi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int yi_fld;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] fx_fld;
	@ObfuscatedName("yx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int yx_int;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] qf_fld;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int uh_fld;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] ox_fld;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public iw dp_fld = new iw(64);
	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev zi_fld;
	@ObfuscatedName("xf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1124760005
	)
	public int xf_fld;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] et_fld;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ig_fld;
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	public byte[][] qh_fld;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] cp_fld;
	@ObfuscatedName("zp")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Thread;"
	)
	public static Thread zp_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	public byte[][][] bk_fld;
	// $VF: synthetic field
	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean nl_fld = !rl4.class.desiredAssertionStatus();

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII)V"
	)
	public void jl(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		gn var11 = this.gu_fld[var2];

		for (int var12 = var3; var12 < var3 + 8; var12++) {
			for (int var13 = var4; var13 < var4 + 8; var13++) {
				if (var11.fh(var12, var13)) {
					var11.hv(var12, var13, 1073741824);
				}
			}
		}

		xi var20 = new xi(var1);

		for (int var21 = 0; var21 < 4; var21++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (var21 == var5 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var16 = var3 + zu(var14 & 7, var15 & 7, var8);
						int var17 = var4 + rx(var14 & 7, var15 & 7, var8);
						int var18 = var9 + var3 + (var14 & 7);
						int var19 = var10 + var4 + (var15 & 7);
						this.gj(var20, var2, var16, var17, var18, var19, var8);
					} else {
						this.gj(var20, -1, -1, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int gb(int var0, int var1) {
		int var2 = fj(45365 + var0, 91923 + var1, 4) - 128 + (fj(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (fj(var0, var1, 1) - 128 >> 2);
		var2 = (int)(var2 * 0.3) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("run")
	@Override
	public void run() {
		try {
			try {
				while (!this.ld()) {
					try {
						Thread.sleep(20L);
					} catch (InterruptedException var3) {
					}
				}
			} catch (Throwable var4) {
				ah("map loading", var4);
				throw var4;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgn;)V"
	)
	public void jo(byte[] var1, int var2, int var3, int var4, int var5, gn[] var6) {
		if (!nl_fld && var6 == null) {
			throw new AssertionError();
		} else {
			for (int var7 = 0; var7 < 4; var7++) {
				for (int var8 = var2; var8 < var2 + 64; var8++) {
					for (int var9 = var3; var9 < var3 + 64; var9++) {
						if (var6[var7].fh(var8, var9)) {
							var6[var7].hv(var8, var9, 1073741824);
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
						this.gj(var13, var14, var11, var12, var4 + var11, var12 + var5, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void qz(int var1, int var2, int var3) {
		int var4 = var2 + this.uh_fld;
		int var5 = var3 + this.uh_fld;

		for (int var6 = 0; var6 < 8; var6++) {
			for (int var7 = 0; var7 < 8; var7++) {
				this.ro_fld[var1][var6 + var4][var7 + var5] = 0;
			}
		}

		if (var4 > 0) {
			for (int var8 = 1; var8 < 8; var8++) {
				this.ro_fld[var1][var4][var8 + var5] = this.ro_fld[var1][var4 - 1][var8 + var5];
			}
		}

		if (var5 > 0) {
			for (int var9 = 1; var9 < 8; var9++) {
				this.ro_fld[var1][var9 + var4][var5] = this.ro_fld[var1][var9 + var4][var5 - 1];
			}
		}

		if (var4 > 0 && this.ro_fld[var1][var4 - 1][var5] != 0) {
			this.ro_fld[var1][var4][var5] = this.ro_fld[var1][var4 - 1][var5];
		} else if (var5 > 0 && this.ro_fld[var1][var4][var5 - 1] != 0) {
			this.ro_fld[var1][var4][var5] = this.ro_fld[var1][var4][var5 - 1];
		} else if (var4 > 0 && var5 > 0 && this.ro_fld[var1][var4 - 1][var5 - 1] != 0) {
			this.ro_fld[var1][var4][var5] = this.ro_fld[var1][var4 - 1][var5 - 1];
		}
	}

	public rl4(DrawCallbacks var1, int var2, dx var3, wq var4) {
		this.oh_fld = new iw(64);
		this.ss_fld = new na();
		if (!nl_fld && var2 != 0 && !var3.isTopLevel()) {
			throw new AssertionError();
		} else {
			this.yb_fld = var1;
			this.jf_fld = var3.ah_fld;
			this.py_int = var3.aw_fld;
			int var5 = var3.isTopLevel() ? 40 : 0;
			this.yi_fld = var3.ah_fld + var5 * 2;
			this.sl_fld = var3.aw_fld + var5 * 2;
			this.uh_fld = var5;
			this.yx_int = var2;
			this.cb_fld = -var2 * 8;
			this.tx_fld = -var2 * 8;
			this.cg_fld = var3.ah_fld + var2 * 8;
			this.ig_fld = var3.aw_fld + var2 * 8;
			this.lk_fld = var3;
			this.ry_fld = var4;
			this.qh_fld = new byte[var4.ag_fld.length][];
			this.py_ArrArrbyte = new byte[var4.ag_fld.length][];
			this.fn_fld = new int[4][this.yi_fld + 1][this.sl_fld + 1];
			this.ox_fld = new byte[4][this.yi_fld + 1][this.sl_fld + 1];
			this.vj_fld = new int[this.yi_fld + 1][this.sl_fld + 1];
			this.td_fld = new int[this.sl_fld];
			this.fx_fld = new int[this.sl_fld];
			this.et_fld = new int[this.sl_fld];
			this.cp_fld = new int[this.sl_fld];
			this.st_fld = new int[this.sl_fld];
		}
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIIIII[Lgn;)V"
	)
	public void uo(dx var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, gn[] var10) {
		try {
			xi var11 = new xi(var2);
			int var12 = -1;

			while (true) {
				int var13 = var11.co();
				if (var13 == 0) {
					return;
				}

				var12 += var13;
				int var14 = 0;

				while (true) {
					int var15 = var11.xr();
					if (var15 == 0) {
						break;
					}

					var14 += var15 - 1;
					int var16 = var14 & 63;
					int var17 = var14 >> 6 & 63;
					int var18 = var14 >> 12;
					int var19 = var11.yu();
					int var20 = var19 >> 2;
					int var21 = var19 & 3;
					if (var18 == var6 && var17 >= var7 && var17 < var7 + 8 && var16 >= var8 && var16 < var8 + 8) {
						oe var22 = oe.ep(var12);
						int var23 = var4 + ny(var17 & 7, var16 & 7, var9, var22.cb_fld, var22.co_fld, var21);
						int var24 = var5 + ii(var17 & 7, var16 & 7, var9, var22.cb_fld, var22.co_fld, var21);
						if (var23 > this.cb_fld && var24 > this.tx_fld && var23 < this.cg_fld - 1 && var24 < this.ig_fld - 1) {
							int var25 = var3;
							if ((this.qf_fld[1][var23 + this.uh_fld][var24 + this.uh_fld] & 2) == 2) {
								var25 = var3 - 1;
							}

							gn var26 = null;
							if (var25 >= 0) {
								var26 = var10[var25];
							}

							rr(var1, var3, var23, var24, var12, var21 + var9 & 3, var20, var26);
						}
					}
				}
			}
		} catch (Throwable var28) {
			throw new RuntimeException(var28);
		}
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int zu(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hh() {
		try {
			for (int var1 = 0; var1 < 4; var1++) {
				for (int var2 = 0; var2 < this.jf_fld; var2++) {
					int var3 = var2 + this.uh_fld;

					for (int var4 = 0; var4 < this.py_int; var4++) {
						int var5 = var4 + this.uh_fld;
						if ((this.qf_fld[var1][var3][var5] & 1) == 1) {
							int var6 = var1;
							if ((this.qf_fld[1][var3][var5] & 2) == 2) {
								var6 = var1 - 1;
							}

							if (var6 >= 0) {
								this.gu_fld[var6].mt(var2, var4);
							}
						}
					}
				}
			}

			int var35 = (int)Math.sqrt(5100.0) * 768 >> 8;

			for (int var36 = 0; var36 < 4; var36++) {
				byte[][] var38 = this.ox_fld[var36];

				for (int var40 = 1; var40 < this.zi_fld.dk_fld - 1; var40++) {
					for (int var44 = 1; var44 < this.zi_fld.dv_fld - 1; var44++) {
						int var48 = this.ro_fld[var36][var44 + 1][var40] - this.ro_fld[var36][var44 - 1][var40];
						int var7 = this.ro_fld[var36][var44][var40 + 1] - this.ro_fld[var36][var44][var40 - 1];
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
						this.vj_fld[var44][var40] = var12 - var13;
					}
				}

				for (int var41 = 0; var41 < this.sl_fld; var41++) {
					this.td_fld[var41] = 0;
					this.fx_fld[var41] = 0;
					this.et_fld[var41] = 0;
					this.cp_fld[var41] = 0;
					this.st_fld[var41] = 0;
				}

				for (int var42 = -5; var42 < this.yi_fld + 5; var42++) {
					for (int var45 = 0; var45 < this.sl_fld; var45++) {
						int var49 = var42 + 5;
						if (var49 >= 0 && var49 < this.yi_fld) {
							int var51 = this.ng_fld[var36][var49][var45] & 32767;
							if (var51 > 0) {
								pl var54 = this.dl(var51 - 1);
								this.td_fld[var45] = this.td_fld[var45] + var54.nu();
								this.fx_fld[var45] = this.fx_fld[var45] + var54.sp();
								this.et_fld[var45] = this.et_fld[var45] + var54.fw();
								this.cp_fld[var45] = this.cp_fld[var45] + var54.wu();
								this.st_fld[var45]++;
							}
						}

						int var52 = var42 - 5;
						if (var52 >= 0 && var52 < this.yi_fld) {
							int var55 = this.ng_fld[var36][var52][var45] & 32767;
							if (var55 > 0) {
								pl var57 = this.dl(var55 - 1);
								this.td_fld[var45] = this.td_fld[var45] - var57.nu();
								this.fx_fld[var45] = this.fx_fld[var45] - var57.sp();
								this.et_fld[var45] = this.et_fld[var45] - var57.fw();
								this.cp_fld[var45] = this.cp_fld[var45] - var57.wu();
								this.st_fld[var45]--;
							}
						}
					}

					if (var42 >= 1 && var42 < this.yi_fld - 1) {
						int var46 = 0;
						int var50 = 0;
						int var53 = 0;
						int var56 = 0;
						int var58 = 0;

						for (int var59 = -5; var59 < this.sl_fld + 5; var59++) {
							int var60 = var59 + 5;
							if (var60 >= 0 && var60 < this.sl_fld) {
								var46 += this.td_fld[var60];
								var50 += this.fx_fld[var60];
								var53 += this.et_fld[var60];
								var56 += this.cp_fld[var60];
								var58 += this.st_fld[var60];
							}

							int var61 = var59 - 5;
							if (var61 >= 0 && var61 < this.sl_fld) {
								var46 -= this.td_fld[var61];
								var50 -= this.fx_fld[var61];
								var53 -= this.et_fld[var61];
								var56 -= this.cp_fld[var61];
								var58 -= this.st_fld[var61];
							}

							if (var59 >= 1 && var59 < this.sl_fld - 1 && (!client.gk_fld || (this.qf_fld[0][var42][var59] & 2) != 0 || (this.qf_fld[var36][var42][var59] & 16) == 0)
								)
							 {
								if (var36 < dt.ar_fld) {
									dt.ar_fld = var36;
								}

								int var62 = this.ng_fld[var36][var42][var59] & 32767;
								int var14 = this.ob_fld[var36][var42][var59] & 32767;
								if (var62 > 0 || var14 > 0) {
									int var15 = this.ro_fld[var36][var42][var59];
									int var16 = this.ro_fld[var36][var42 + 1][var59];
									int var17 = this.ro_fld[var36][var42 + 1][var59 + 1];
									int var18 = this.ro_fld[var36][var42][var59 + 1];
									int var19 = this.vj_fld[var42][var59];
									int var20 = this.vj_fld[var42 + 1][var59];
									int var21 = this.vj_fld[var42 + 1][var59 + 1];
									int var22 = this.vj_fld[var42][var59 + 1];
									int var23 = -1;
									int var24 = -1;
									if (var62 > 0) {
										int var25 = var46 * 256 / var56;
										int var26 = var50 / var58;
										int var27 = var53 / var58;
										var23 = bj(var25, var26, var27);
										var24 = var23;
									}

									int var63 = 0;
									if (var24 != -1) {
										var63 = fc.az_fld[xt(var24, 96)];
									}

									if (var14 == 0) {
										this.zi_fld
											.kw(
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
												xt(var23, var19),
												xt(var23, var20),
												xt(var23, var21),
												xt(var23, var22),
												0,
												0,
												0,
												0,
												var63,
												0
											);
									} else {
										int var64 = this.vr_fld[var36][var42][var59] + 1;
										byte var65 = this.bk_fld[var36][var42][var59];
										ov var28 = this.kx(var14 - 1);
										int var29 = var28.wj();
										int var30;
										int var31;
										if (var29 >= 0) {
											var31 = hi.ni_fld.getDefaultColor(var29);
											var30 = -1;
										} else if (var28.qs() == 16711935) {
											var30 = -2;
											var29 = -1;
											var31 = -2;
										} else {
											var30 = bj(var28.hn(), var28.lf(), var28.xj());
											var31 = var30;
										}

										int var32 = 0;
										if (var31 != -2) {
											var32 = fc.az_fld[pu(var31, 96)];
										}

										if (var28.tu() != -1) {
											var31 = bj(var28.tn(), var28.gt(), var28.jj());
											var32 = fc.az_fld[pu(var31, 96)];
										}

										this.zi_fld
											.kw(
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
												xt(var23, var19),
												xt(var23, var20),
												xt(var23, var21),
												xt(var23, var22),
												pu(var30, var19),
												pu(var30, var20),
												pu(var30, var21),
												pu(var30, var22),
												var63,
												var32
											);
									}
								}
							}
						}
					}
				}

				for (int var43 = 1; var43 < this.sl_fld - 1; var43++) {
					for (int var47 = 1; var47 < this.yi_fld - 1; var47++) {
						this.zi_fld.ka(var36, var47, var43, 0);
					}
				}
			}

			this.zi_fld.lt(-50, -10, -50);

			for (int var37 = 0; var37 < this.yi_fld; var37++) {
				for (int var39 = 0; var39 < this.sl_fld; var39++) {
					if ((this.qf_fld[1][var37][var39] & 2) == 2) {
						this.zi_fld.er(var37, var39);
					}
				}
			}
		} catch (Throwable var34) {
			throw new RuntimeException(var34);
		}
	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "()[[[I"
	)
	public int[][][] qy() {
		int[][][] var1 = new int[4][this.jf_fld + 1][this.py_int + 1];

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < this.jf_fld + 1; var3++) {
				for (int var4 = 0; var4 < this.py_int + 1; var4++) {
					var1[var2][var3][var4] = this.ro_fld[var2][var3 + this.uh_fld][var4 + this.uh_fld];
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int fj(int var0, int var1, int var2) {
		return ue.ai(var0, var1, var2);
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIILgn;)V"
	)
	public static void rr(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, gn var7) throws EOFException {
		try {
			un.ax(var0, var1, var2, var3, var4, var5, var6, var7);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BII[Lgn;)V"
	)
	public void uw(dx var1, byte[] var2, int var3, int var4, gn[] var5) {
		try {
			xi var6 = new xi(var2);
			int var7 = -1;

			while (true) {
				int var8 = var6.co();
				if (var8 == 0) {
					return;
				}

				var7 += var8;
				int var9 = 0;

				while (true) {
					int var10 = var6.xr();
					if (var10 == 0) {
						break;
					}

					var9 += var10 - 1;
					int var11 = var9 & 63;
					int var12 = var9 >> 6 & 63;
					int var13 = var9 >> 12;
					int var14 = var6.yu();
					int var15 = var14 >> 2;
					int var16 = var14 & 3;
					int var17 = var12 + var3;
					int var18 = var11 + var4;
					if (var17 > this.cb_fld && var18 > this.tx_fld && var17 < this.cg_fld - 1 && var18 < this.ig_fld - 1) {
						int var19 = var13;
						if ((this.qf_fld[1][var17 + this.uh_fld][var18 + this.uh_fld] & 2) == 2) {
							var19 = var13 - 1;
						}

						gn var20 = null;
						if (var19 >= 0) {
							var20 = var5[var19];
						}

						rr(var1, var13, var17, var18, var7, var16, var15, var20);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IIIIII)V"
	)
	public void gj(xi var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 0 && var2 < 4 && var3 >= this.cb_fld && var3 < this.cg_fld && var4 >= this.tx_fld && var4 < this.ig_fld) {
			int var12 = var3 + this.uh_fld;
			int var9 = var4 + this.uh_fld;
			this.qf_fld[var2][var12][var9] = 0;

			while (true) {
				int var10 = var1.pu();
				if (var10 == 0) {
					if (var2 == 0) {
						this.ro_fld[0][var12][var9] = -gb(var5 + 932731, var6 + 556238) * 8;
					} else {
						this.ro_fld[var2][var12][var9] = this.ro_fld[var2 - 1][var12][var9] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.yu();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						this.ro_fld[0][var12][var9] = -var11 * 8;
					} else {
						this.ro_fld[var2][var12][var9] = this.ro_fld[var2 - 1][var12][var9] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					this.ob_fld[var2][var12][var9] = (short)var1.xh();
					this.vr_fld[var2][var12][var9] = (byte)((var10 - 2) / 4);
					this.bk_fld[var2][var12][var9] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					this.qf_fld[var2][var12][var9] = (byte)(var10 - 49);
				} else {
					this.ng_fld[var2][var12][var9] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				int var8 = var1.pu();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var1.yu();
					break;
				}

				if (var8 <= 49) {
					var1.xh();
				}
			}
		}
	}

	@ObfuscatedName("zj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean zj() {
		return this.hs_java_util_concurrent_Future.isDone();
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)I"
	)
	public static int ii(int var0, int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ld() {
		try {
			uv var1 = client.sd_fld[5];
			int var2 = 0;

			for (int var3 = 0; var3 < this.ry_fld.ag_fld.length; var3++) {
				int var4 = this.ry_fld.ag_fld[var3];
				if (var4 != -1) {
					if (this.qh_fld[var3] == null) {
						boolean var5 = var1.getFileIds(var4) != null;
						this.qh_fld[var3] = var1.loadData(var4, 0);
						if (var5 && this.qh_fld[var3] == null) {
							var2++;
						}
					}

					if (this.py_ArrArrbyte[var3] == null) {
						boolean var36 = var1.getFileIds(var4) != null;
						this.py_ArrArrbyte[var3] = var1.loadData(var4, 1);
						if (var36 && this.py_ArrArrbyte[var3] == null) {
							var2++;
						}
					}
				}
			}

			if (var2 > 0) {
				return false;
			} else {
				boolean var29 = true;

				for (int var30 = 0; var30 < this.qh_fld.length; var30++) {
					byte[] var37 = this.py_ArrArrbyte[var30];
					if (var37 != null) {
						int var6 = (this.ry_fld.ag_fld[var30] >> 8) * 64 - this.gh_fld;
						int var7 = (this.ry_fld.ag_fld[var30] & 0xFF) * 64 - this.vu_fld;
						var29 &= this.ud(var37, var6, var7);
					}
				}

				if (!var29) {
					return false;
				} else {
					this.ro_fld = new int[4][this.yi_fld + 1][this.sl_fld + 1];
					this.zi_fld = new ev(this.lk_fld == bw.dk_fld, 4, this.yi_fld, this.sl_fld, cx.kq_fld.aq_fld, er.ak_fld, this.ro_fld);
					this.zi_fld.bt_fld = this.lk_fld.ag_fld;
					this.zi_fld.ky_fld = new rl10[4][this.jf_fld][this.py_int];
					this.zi_fld.qr_fld = this.uh_fld;
					this.zi_fld.oe_fld = this.cb_fld;
					this.zi_fld.tj_fld = this.cg_fld;
					this.zi_fld.by_fld = this.tx_fld;
					this.zi_fld.ba_fld = this.ig_fld;
					this.zi_fld.wy_fld = false;
					this.gu_fld = new gn[4];

					for (int var31 = 0; var31 < 4; var31++) {
						this.gu_fld[var31] = new gn(this.jf_fld, this.py_int, !this.lk_fld.isTopLevel());
					}

					this.qf_fld = new byte[4][this.yi_fld][this.sl_fld];
					dt.ar_fld = 99;
					this.ng_fld = new short[4][this.yi_fld][this.sl_fld];
					this.ob_fld = new short[4][this.yi_fld][this.sl_fld];
					this.vr_fld = new byte[4][this.yi_fld][this.sl_fld];
					this.bk_fld = new byte[4][this.yi_fld][this.sl_fld];
					this.zi_fld.kq_ArrArrArrshort = this.ng_fld;
					this.zi_fld.fl_fld = this.ob_fld;
					this.zi_fld.ns_fld = this.vr_fld;
					this.zi_fld.nl_fld = this.qf_fld;
					this.zi_fld.eu_int = this.gh_fld;
					this.zi_fld.ou_fld = this.vu_fld;
					this.zi_fld.mf_boolean = this.ry_fld.ak_fld;
					this.zi_fld.po_fld = this.ry_fld.az_fld;
					this.zi_fld.jj_fld = this.ry_fld.ag_fld;
					if (!this.ry_fld.ak_fld) {
						byte var8 = 6;
						int var9 = 6 + this.yx_int;
						int var10 = this.be_fld - var9 >> 3;
						int var11 = this.be_fld + var9 >> 3;
						int var12 = this.hs_int - var9 >> 3;
						int var13 = this.hs_int + var9 >> 3;
						int var14 = this.be_fld - var8 >> 3;
						int var15 = this.be_fld + var8 >> 3;
						int var16 = this.hs_int - var8 >> 3;
						int var17 = this.hs_int + var8 >> 3;
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
									int var23 = var100 * 64 - this.gh_fld;
									int var24 = var21 * 64 - this.vu_fld;
									var46[var101] = var38[var101] != null && var41[var101] != null && this.ud(var41[var101], var23, var24);
									var101++;
								}
							}
						}

						for (int var51 = 0; var51 < this.qh_fld.length; var51++) {
							byte[] var61 = this.qh_fld[var51];
							if (var61 != null) {
								var10 = this.ry_fld.ag_fld[var51];
								var11 = (var10 >> 8 << 6) - this.gh_fld;
								var12 = ((var10 & 0xFF) << 6) - this.vu_fld;
								if (!nl_fld && this.be_fld - 48 != this.gh_fld) {
									throw new AssertionError();
								}

								if (!nl_fld && this.hs_int - 48 != this.vu_fld) {
									throw new AssertionError();
								}

								this.jo(var61, var11, var12, this.gh_fld, this.vu_fld, this.gu_fld);
							}
						}

						for (int var52 = 0; var52 < var32.length; var52++) {
							if (var46[var52]) {
								var9 = var32[var52];
								var10 = (var9 >> 8 << 6) - this.gh_fld;
								var11 = ((var9 & 0xFF) << 6) - this.vu_fld;
								this.jo(var38[var52], var10, var11, this.gh_fld, this.vu_fld, this.gu_fld);
							}
						}

						for (int var53 = 0; var53 < this.qh_fld.length; var53++) {
							byte[] var63 = this.qh_fld[var53];
							if (var63 == null && this.hs_int < 800) {
								var10 = this.ry_fld.ag_fld[var53];
								var11 = (var10 >> 8 << 6) - this.gh_fld;
								var12 = ((var10 & 0xFF) << 6) - this.vu_fld;
								this.ic(var11, var12, 64, 64);
							}
						}

						for (int var54 = 0; var54 < var32.length; var54++) {
							if (!var46[var54] && this.hs_int < 800) {
								var9 = var32[var54];
								var10 = (var9 >> 8 << 6) - this.gh_fld;
								var11 = ((var9 & 0xFF) << 6) - this.vu_fld;
								this.ic(var10, var11, 64, 64);
							}
						}

						client.ub();

						for (int var55 = 0; var55 < this.qh_fld.length; var55++) {
							byte[] var65 = this.py_ArrArrbyte[var55];
							if (var65 != null) {
								var10 = this.ry_fld.ag_fld[var55];
								var11 = (var10 >> 8 << 6) - this.gh_fld;
								var12 = ((var10 & 0xFF) << 6) - this.vu_fld;
								this.uw(this.lk_fld, var65, var11, var12, this.gu_fld);
							}
						}

						for (int var56 = 0; var56 < var32.length; var56++) {
							if (var46[var56]) {
								var9 = var32[var56];
								var10 = (var9 >> 8 << 6) - this.gh_fld;
								var11 = ((var9 & 0xFF) << 6) - this.vu_fld;
								this.uw(this.lk_fld, var41[var56], var10, var11, this.gu_fld);
							}
						}

						client.gd();
						client.ub();
					} else {
						int var33 = this.jf_fld / 8;
						int var39 = this.py_int / 8;

						for (int var42 = 0; var42 < 4; var42++) {
							for (int var47 = 0; var47 < var33; var47++) {
								for (int var57 = 0; var57 < var39; var57++) {
									boolean var67 = false;
									int var76 = this.ry_fld.az_fld[var42][var47][var57];
									if (var76 != -1) {
										int var84 = var76 >> 24 & 3;
										int var89 = var76 >> 1 & 3;
										int var91 = var76 >> 14 & 1023;
										int var93 = var76 >> 3 & 2047;
										int var95 = (var91 / 8 << 8) + var93 / 8;

										for (int var97 = 0; var97 < this.ry_fld.ag_fld.length; var97++) {
											if (this.ry_fld.ag_fld[var97] == var95 && this.qh_fld[var97] != null) {
												int var98 = (var91 - var47) * 8;
												int var99 = (var93 - var57) * 8;
												this.jl(this.qh_fld[var97], var42, var47 * 8, var57 * 8, var84, (var91 & 7) * 8, (var93 & 7) * 8, var89, var98, var99);
												var67 = true;
												break;
											}
										}
									}

									if (!var67) {
										this.qz(var42, var47 * 8, var57 * 8);
									}
								}
							}
						}

						for (int var43 = 0; var43 < 13; var43++) {
							for (int var48 = 0; var48 < 13; var48++) {
								int var58 = this.ry_fld.az_fld[0][var43][var48];
								if (var58 == -1) {
									this.ic(var43 * 8, var48 * 8, 8, 8);
								}
							}
						}

						for (int var44 = 0; var44 < 4; var44++) {
							for (int var49 = 0; var49 < var33; var49++) {
								for (int var59 = 0; var59 < var39; var59++) {
									int var68 = this.ry_fld.az_fld[var44][var49][var59];
									if (var68 != -1) {
										int var77 = var68 >> 24 & 3;
										int var85 = var68 >> 1 & 3;
										int var90 = var68 >> 14 & 1023;
										int var92 = var68 >> 3 & 2047;
										int var94 = (var90 / 8 << 8) + var92 / 8;

										for (int var96 = 0; var96 < this.ry_fld.ag_fld.length; var96++) {
											if (this.ry_fld.ag_fld[var96] == var94 && this.py_ArrArrbyte[var96] != null) {
												this.uo(this.lk_fld, this.py_ArrArrbyte[var96], var44, var49 * 8, var59 * 8, var77, (var90 & 7) * 8, (var92 & 7) * 8, var85, this.gu_fld);
												break;
											}
										}
									}
								}
							}
						}
					}

					this.hh();
					synchronized (oe.cv_fld) {
						oe.cv_fld.reset();
					}

					oe.cs_fld.reset();
					if (this.lk_fld.isTopLevel()) {
						if (client.gk_fld) {
							this.zi_fld.iy(dt.ar_fld);
						} else {
							this.zi_fld.iy(0);
						}

						if (!this.ry_fld.ak_fld) {
							int var35 = (this.be_fld - 6) / 8;
							int var40 = (this.be_fld + 6) / 8;
							int var45 = (this.hs_int - 6) / 8;
							int var50 = (this.hs_int + 6) / 8;

							for (int var60 = var35 - 1; var60 <= var40 + 1; var60++) {
								for (int var69 = var45 - 1; var69 <= var50 + 1; var69++) {
									if (var60 < var35 || var60 > var40 || var69 < var45 || var69 > var50) {
										var1.sb((var60 << 8) + var69);
									}
								}
							}
						}
					}

					this.zi_fld.go();
					this.rc_fld = this.qy();
					this.yx_ArrArrArrbyte = this.sk();
					if (!this.lk_fld.isTopLevel()) {
						if (this.yb_fld != null) {
							this.yb_fld.loadScene(this.lk_fld, this.zi_fld);
						}

						return true;
					} else {
						client.kl(this.zi_fld);
						og.ci_fld.getCallbacks().post(new PreMapLoad(this.lk_fld, this.zi_fld));
						if (this.yb_fld != null) {
							this.yb_fld.loadScene(this.zi_fld);
							this.yb_fld.loadScene(this.lk_fld, this.zi_fld);
						}

						return true;
					}
				}
			}
		} catch (Throwable var28) {
			throw new RuntimeException(var28);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;"
	)
	public pl dl(int var1) {
		try {
			pl var2 = (pl)this.dp_fld.bs(var1);
			if (var2 != null) {
				return var2;
			} else {
				uv var3 = client.sd_fld[2];
				byte[] var4 = var3.loadData(1, var1);
				var2 = new pl();
				if (var4 != null) {
					var2.qs(new xi(var4), var1);
				}

				var2.cv();
				this.dp_fld.at(var2, var1);
				return var2;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("xt")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int xt(int var0, int var1) {
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

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int rx(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int bj(int var0, int var1, int var2) {
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

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ic(int var1, int var2, int var3, int var4) {
		for (int var5 = var2; var5 <= var4 + var2; var5++) {
			for (int var6 = var1; var6 <= var1 + var3; var6++) {
				if (var6 >= this.cb_fld && var6 < this.cg_fld && var5 >= this.tx_fld && var5 < this.ig_fld) {
					int var7 = var6 + this.uh_fld;
					int var8 = var5 + this.uh_fld;
					this.ox_fld[0][var7][var8] = 127;
					if (var1 == var6 && var6 > 0) {
						this.ro_fld[0][var7][var8] = this.ro_fld[0][var7 - 1][var8];
					}

					if (var1 + var3 == var6 && var6 < this.yi_fld - 1) {
						this.ro_fld[0][var7][var8] = this.ro_fld[0][var7 + 1][var8];
					}

					if (var5 == var2 && var5 > 0) {
						this.ro_fld[0][var7][var8] = this.ro_fld[0][var7][var8 - 1];
					}

					if (var5 == var4 + var2 && var5 < this.sl_fld - 1) {
						this.ro_fld[0][var7][var8] = this.ro_fld[0][var7][var8 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V"
	)
	public static void ah(String var0, Throwable var1) {
		gl.ak(var0, var1);
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void wp() {
		if (!nl_fld && this.hs_java_util_concurrent_Future != null) {
			throw new AssertionError();
		} else {
			this.hs_java_util_concurrent_Future = ru_fld.submit(this);
		}
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ya() {
		try {
			try {
				this.hs_java_util_concurrent_Future.get();
			} catch (Throwable var3) {
				throw var3;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "()[[[B"
	)
	public byte[][][] sk() {
		byte[][][] var1 = new byte[4][this.jf_fld][this.py_int];

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < this.jf_fld; var3++) {
				for (int var4 = 0; var4 < this.py_int; var4++) {
					var1[var2][var3][var4] = this.qf_fld[var2][var3 + this.uh_fld][var4 + this.uh_fld];
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)I"
	)
	public static int ny(int var0, int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lgy;)I"
	)
	public static int kn(gy var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int pu(int var0, int var1) {
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

	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "([BII)Z"
	)
	public boolean ud(byte[] var1, int var2, int var3) {
		try {
			xi var4 = new xi(var1);
			int var5 = -1;
			boolean var6 = true;

			while (true) {
				int var7 = var4.co();
				if (var7 == 0) {
					return var6;
				}

				var5 += var7;
				int var8 = 0;

				while (true) {
					int var9 = var4.xr();
					if (var9 == 0) {
						break;
					}

					var8 += var9 - 1;
					int var10 = var8 & 63;
					int var11 = var8 >> 6 & 63;
					var4.yu();
					int var12 = var11 + var2;
					int var13 = var10 + var3;
					if (this.ry_fld.ak_fld || var12 > this.cb_fld && var13 > this.tx_fld && var12 < this.cg_fld - 1 && var13 < this.ig_fld - 1) {
						oe var14 = oe.ep(var5);
						if ((client.ly_fld & 16) != 0 && var14.dy_fld != null) {
							if (!var14.sq()) {
								var6 = false;
							}

							for (int var15 = 0; var15 < var14.dy_fld.length; var15++) {
								oe var16 = oe.ep(var14.dy_fld[var15]);
								if (!var16.sq()) {
									var6 = false;
								}
							}
						} else if (!var14.sq()) {
							var6 = false;
						}
					}
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	public ov kx(int var1) {
		try {
			ov var2 = (ov)this.oh_fld.bs(var1);
			if (var2 != null) {
				return var2;
			} else {
				uv var3 = client.sd_fld[2];
				byte[] var4 = var3.loadData(4, var1);
				var2 = new ov();
				if (var4 != null) {
					var2.an(new xi(var4), var1);
				}

				var2.yd();
				return var2;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}
}
