import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ag")
public class ag implements Callable {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	az ag_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	ay this$0;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi ak_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int an_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bz_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llu;Z)V"
	)
	static void af(lu var0, boolean var1) {
		if (null != var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			if (var1) {
				gs.ap_fld = var0;
			} else {
				bp.ab_fld = var0;
			}
		} else {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
		}
	}

	@ObfuscatedName("call")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object call() {
		return this.ag_fld.ak(this.ak_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ak() {
		return this.ag_fld.ak(this.ak_fld);
	}

	@ObfuscatedName("agv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	protected static int agv() {
		int var1 = 0;
		if (null == bg.rt_fld || !bg.rt_fld.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)(GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						bg.rt_fld = var3;
						tf.ru_fld = -480692785040575911L;
						tf.rr_fld = -560329468120651783L;
					}
				}
			} catch (Throwable var10) {
			}
		}

		if (bg.rt_fld != null) {
			long var11 = lz.ak();
			long var4 = bg.rt_fld.getCollectionTime();
			if (tf.rr_fld != -1L) {
				long var6 = var4 - tf.rr_fld;
				long var8 = var11 - tf.ru_fld;
				if (0L != var8) {
					var1 = (int)(var6 * 100L / var8);
				}
			}

			tf.rr_fld = var4;
			tf.ru_fld = var11;
		}

		return var1;
	}

	ag(ay var1, xi var2, az var3) {
		this.this$0 = var1;
		this.ak_fld = var2;
		this.ag_fld = var3;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int bn(int var0, ba var1, boolean var2) {
		if (5504 == var0) {
			gz.ax_fld -= 2;
			int var6 = bp.au_fld[gz.ax_fld];
			int var5 = bp.au_fld[gz.ax_fld + 1];
			if (!client.ki_fld) {
				client.jf_fld = var6;
				client.dl();
				client.js_fld = var5;
			}

			return 1;
		} else if (5505 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.jf_fld;
			return 1;
		} else if (var0 == 5506) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.js_fld;
			return 1;
		} else if (5530 == var0) {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var4 < 0) {
				var4 = 0;
			}

			client.dy_fld = var4;
			return 1;
		} else if (var0 == 5531) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.dy_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	static int at(lu var0) {
		if (var0.bx_fld != 11) {
			bp.ai_fld[ef.aq_fld - 1] = "";
			return 1;
		} else {
			String var2 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var0.bk(var2, (short)-13319);
			return 1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I)Lsl;"
	)
	public static sl al(int[] var0) {
		sl var2 = new sl(yq.ak_fld, true);
		var2.aw_fld = var0;
		var2.av_fld = -69344095 * var0.length;
		var2.ae_fld = var0.length;
		return var2;
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	public static int mg(lu var0) {
		return var0.hd_fld != null && !var0.hd_fld.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void hd(int var0) {
		client.dg_fld = var0;
	}
}
