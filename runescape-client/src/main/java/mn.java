import java.util.Iterator;
import java.util.concurrent.ThreadFactory;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mn")
class mn implements ThreadFactory {
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int co_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	ml this$0;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[S"
	)
	public static short[][] av_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread az(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(Lmn;Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public static Thread qo(mn var0, Runnable var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return new Thread(var1, "OSRS WAV Load");
		}
	}

	@ObfuscatedName("newThread")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread ag(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread ak(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread av(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "(Lli;)Z"
	)
	public static boolean tu(li var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "(Lgf;III)[I"
	)
	public static int[] uw(gf var0, int var1, int var2, int var3) {
		Iterator var4 = var0.ar_fld.iterator();

		while (var4.hasNext()) {
			hj var5 = (hj)(hj)var4.next();
			if (var5.ag(var1, var2, var3, -1501648118)) {
				return var5.av(var1, var2, var3, -145367476);
			}
		}

		return null;
	}

	mn(ml var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(Lfo;IIII)V"
	)
	public static void qz(fo var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ao_fld = var1 - var2;
		var0.br_fld = var3 - var4;
		var0.ab_fld = -var0.ao_fld;
		var0.al_fld = var0.ac_fld - var0.ao_fld;
		var0.be_fld = -var0.br_fld;
		var0.am_fld = var0.at_fld - var0.br_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void av() {
		og.dl_fld.vh();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[[[IIII[I[I[I)V"
	)
	public static void ak(int var0, int[][][] var1, int var2, int var3, int var4, int[] var5, int[] var6, int[] var7) {
		int[] var9 = fa.ar_fld[var0];

		for (int var10 = 0; var10 < var9.length; var10++) {
			var5[var10] = gt.ag(var9[var10], var3);
			int var14 = var9[var10];
			int var13 = var1[var2][fa.ay_fld[var14] + var3][fa.as_fld[var14] + var4];
			var6[var10] = var13;
			var7[var10] = ke.az(var9[var10], var4);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int bw(int var0) {
		return (int)Math.pow(2.0, 7.0F + var0 / 256.0F);
	}
}
