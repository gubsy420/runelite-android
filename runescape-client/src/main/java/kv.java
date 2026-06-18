import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kv")
public class kv {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	public static boolean[] ag_fld = new boolean[]{
		true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false
	};
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] az_fld = new int[99];

	kv() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	public static void lt(tf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (tf.qs_fld == var0 && !tf.qo_fld) {
			tf.qu_fld = lz.ak() + 4000L;
		}
	}

	static {
		int var0 = 0;

		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int)(var2 + 300.0 * Math.pow(2.0, var2 / 7.0));
			var0 += var3;
			az_fld[var1] = var0 / 4;
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)[Ljava/lang/Object;"
	)
	public static Object[] hu(sl var0) {
		return (Object[])var0.as_fld;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lwq;)Z"
	)
	public static boolean hb(wq var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Luy;"
	)
	public static uy ak() {
		synchronized (uy.ag_fld) {
			if (0 == uy.av_fld) {
				return new uy();
			} else {
				uy.ag_fld[(uy.av_fld -= 1453506371) * 848250219].ay();
				return uy.ag_fld[uy.av_fld];
			}
		}
	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(Lpp;II)I"
	)
	public static int qt(pp var0, int var1, int var2) {
		return my.ag(var0.ep_fld, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static final int aq(int var0, int var1) {
		int var3 = cf.am(var0 - 1, var1 - 1) + cf.am(var0 + 1, var1 - 1) + cf.am(var0 - 1, 1 + var1) + cf.am(var0 + 1, var1 + 1);
		int var4 = cf.am(var0 - 1, var1) + cf.am(1 + var0, var1) + cf.am(var0, var1 - 1) + cf.am(var0, var1 + 1);
		int var5 = cf.am(var0, var1);
		return var5 / 4 + var4 / 8 + var3 / 16;
	}
}
