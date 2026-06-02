import java.io.EOFException;
import net.runelite.api.TileObject;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl23")
class rl23 extends Thread {
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public volatile boolean bx_boolean = true;
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "[Lrl23;"
	)
	public static rl23[] vx_fld;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public static ev ri_fld;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lrl21;"
	)
	public rl21 ck_fld = new rl21();
	// $VF: synthetic field
	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean xg_fld = !rl23.class.desiredAssertionStatus();
	@ObfuscatedName("zx")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public static na zx_fld = new na();
	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public static Object tf_fld = new Object();
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bx_int;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public static na uh_fld = new na();
	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	public static fw nl_fld;
	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nj_fld;

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/TileObject;Ldz;IIII)V"
	)
	public static void ih(TileObject var0, dz var1, int var2, int var3, int var4, int var5) {
		if (!xg_fld && ri_fld == null) {
			throw new AssertionError();
		} else {
			rl22 var6;
			synchronized (zx_fld) {
				var6 = (rl22)zx_fld.gu();
			}

			if (var6 == null) {
				var6 = new rl22();
			}

			var6.hl_fld = var0;
			var6.br_fld = var1;
			var6.of_fld = var2;
			var6.cu_fld = var3;
			var6.yl_fld = var4;
			var6.bt_fld = var5;
			synchronized (uh_fld) {
				uh_fld.az(var6);
				uh_fld.notify();
			}

			synchronized (tf_fld) {
				bx_int++;
			}
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void vm(int var0) {
		if (vx_fld != null) {
			if (vx_fld.length == var0) {
				return;
			}

			for (rl23 var4 : vx_fld) {
				var4.bx_boolean = false;
			}

			synchronized (uh_fld) {
				uh_fld.notifyAll();
			}
		}

		vx_fld = new rl23[var0];

		for (int var8 = 0; var8 < var0; var8++) {
			vx_fld[var8] = new rl23(var8, "RenderThread" + var8);
			vx_fld[var8].start();
		}
	}

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "(ILrl21;Lrl22;)V"
	)
	public static void tb(int var0, rl21 var1, rl22 var2) throws EOFException {
		try {
			dz var3 = var2.br_fld;
			TileObject var4 = var2.hl_fld;
			int var5 = var2.of_fld;
			int var6 = var2.cu_fld;
			int var7 = var2.yl_fld;
			int var8 = var2.bt_fld;

			fn var9;
			try {
				var9 = var3.qr(var1);
			} catch (Exception var12) {
				client.ii_fld.debug("exception drawing dynamic game entity", (Throwable)var12);
				return;
			}

			if (var9 != null) {
				var3.setModelHeight(var9.getModelHeight());
				int var10 = var3.getAnimationHeightOffset();
				client.fa_fld.drawDynamic(var0, nl_fld, ri_fld, var4, var3, var9, var5, var6, var7 - var10, var8);
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lev;)V"
	)
	public static void qq(fw var0, ev var1) {
		nl_fld = var0;
		ri_fld = var1;
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void gw() {
		nl_fld = null;
		ri_fld = null;
	}

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void tv() throws EOFException {
		try {
			while (true) {
				rl22 var0;
				synchronized (uh_fld) {
					var0 = (rl22)uh_fld.gu();
				}

				if (var0 == null) {
					while (true) {
						synchronized (tf_fld) {
							if (bx_int == 0) {
								return;
							}

							try {
								tf_fld.wait();
							} catch (InterruptedException var5) {
							}
						}
					}
				}

				tb(-1, rl21.no_fld, var0);
				xq(var0);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "(Lrl22;)V"
	)
	public static void xq(rl22 var0) {
		synchronized (zx_fld) {
			zx_fld.az(var0);
		}

		synchronized (tf_fld) {
			bx_int--;
			if (bx_int == 0) {
				tf_fld.notify();
			}
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lclient;IZ)Z"
	)
	public static boolean mp(client var0, int var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return (client.nt_fld && client.nr_fld.ag_fld > 2 || mg.fy(var1)) && !var2;
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void run() {
		try {
			client.ii_fld.trace("{} start", this.getName());

			while (this.bx_boolean) {
				rl22 var1;
				synchronized (uh_fld) {
					var1 = (rl22)uh_fld.gu();
					if (var1 == null) {
						try {
							uh_fld.wait();
						} catch (InterruptedException var6) {
						}
						continue;
					}
				}

				tb(this.nj_fld, this.ck_fld, var1);
				xq(var1);
			}

			client.ii_fld.trace("{} stop", this.getName());
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	public rl23(int var1, String var2) {
		super(var2);
		this.nj_fld = var1;
	}
}
