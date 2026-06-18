import java.io.EOFException;
import net.runelite.api.TileObject;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl23")
class rl23 extends Thread {
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lrl21;"
	)
	public rl21 dm_fld;
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public static ev gp_fld;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public volatile boolean if_fld = true;
	// $VF: synthetic field
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean cz_fld = !rl23.class.desiredAssertionStatus();
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	public static fw ph_fld;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ud_fld;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "[Lrl23;"
	)
	public static rl23[] vt_fld;
	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public static na ww_fld = new na();
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int gb_fld;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public static na dj_fld = new na();
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public static Object ja_fld = new Object();

	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "(ILrl21;Lrl22;)V"
	)
	public static void xz(int var0, rl21 var1, rl22 var2) throws EOFException {
		try {
			dz var3 = var2.yn_fld;
			TileObject var4 = var2.gy_fld;
			int var5 = var2.vm_fld;
			int var6 = var2.np_fld;
			int var7 = var2.xt_fld;
			int var8 = var2.vr_fld;

			fn var9;
			try {
				var9 = var3.bx(var1);
			} catch (Exception var12) {
				client.logger.debug("exception drawing dynamic game entity", (Throwable)var12);
				return;
			}

			if (var9 != null) {
				var3.setModelHeight(var9.getModelHeight());
				int var10 = var3.getAnimationHeightOffset();
				client.bt_fld.drawDynamic(var0, ph_fld, gp_fld, var4, var3, var9, var5, var6, var7 - var10, var8);
			}
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/TileObject;Ldz;IIII)V"
	)
	public static void hy(TileObject var0, dz var1, int var2, int var3, int var4, int var5) {
		if (!cz_fld && gp_fld == null) {
			throw new AssertionError();
		} else {
			rl22 var6;
			synchronized (ww_fld) {
				var6 = (rl22)ww_fld.dj();
			}

			if (var6 == null) {
				var6 = new rl22();
			}

			var6.gy_fld = var0;
			var6.yn_fld = var1;
			var6.vm_fld = var2;
			var6.np_fld = var3;
			var6.xt_fld = var4;
			var6.vr_fld = var5;
			synchronized (dj_fld) {
				dj_fld.eg(var6);
				dj_fld.notify();
			}

			synchronized (ja_fld) {
				gb_fld++;
			}
		}
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void pk(int var0) {
		if (vt_fld != null) {
			if (vt_fld.length == var0) {
				return;
			}

			for (rl23 var4 : vt_fld) {
				var4.if_fld = false;
			}

			synchronized (dj_fld) {
				dj_fld.notifyAll();
			}
		}

		vt_fld = new rl23[var0];

		for (int var8 = 0; var8 < var0; var8++) {
			vt_fld[var8] = new rl23(var8, "RenderThread" + var8);
			vt_fld[var8].start();
		}
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("run")
	@Override
	public void run() {
		try {
			client.logger.trace("{} start", this.getName());

			while (this.if_fld) {
				rl22 var1;
				synchronized (dj_fld) {
					var1 = (rl22)dj_fld.dj();
					if (var1 == null) {
						try {
							dj_fld.wait();
						} catch (InterruptedException var6) {
						}
						continue;
					}
				}

				xz(this.ud_fld, this.dm_fld, var1);
				zy(var1);
			}

			client.logger.trace("{} stop", this.getName());
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	public rl23(int var1, String var2) {
		super(var2);
		this.dm_fld = new rl21();
		this.ud_fld = var1;
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ox() {
		ph_fld = null;
		gp_fld = null;
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Lfw;Lev;)V"
	)
	public static void ow(fw var0, ev var1) {
		ph_fld = var0;
		gp_fld = var1;
	}

	@ObfuscatedName("zy")
	@ObfuscatedSignature(
		descriptor = "(Lrl22;)V"
	)
	public static void zy(rl22 var0) {
		synchronized (ww_fld) {
			ww_fld.eg(var0);
		}

		synchronized (ja_fld) {
			gb_fld--;
			if (gb_fld == 0) {
				ja_fld.notify();
			}
		}
	}

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Z"
	)
	public static boolean th(cn var0) {
		return var0.as_fld;
	}

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void qv() throws EOFException {
		try {
			while (true) {
				rl22 var0;
				synchronized (dj_fld) {
					var0 = (rl22)dj_fld.dj();
				}

				if (var0 == null) {
					while (true) {
						synchronized (ja_fld) {
							if (gb_fld == 0) {
								return;
							}

							try {
								ja_fld.wait();
							} catch (InterruptedException var5) {
							}
						}
					}
				}

				xz(-1, rl21.ao_fld, var0);
				zy(var0);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}
}
