import java.util.concurrent.ThreadFactory;
import net.runelite.api.annotations.Export;
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

	@ObfuscatedName("newThread")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	@Export("newThread")
	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Lmn;Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public static Thread lz(mn var0, Runnable var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread av(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public Thread ae(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	mn(ml var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public static void av() {
		og.dl_fld.av();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[[[IIII[I[I[IB)V"
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

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lmn;Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public static Thread lr(mn var0, Runnable var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lmn;Ljava/lang/Runnable;)Ljava/lang/Thread;"
	)
	public static Thread pc(mn var0, Runnable var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int bw(int var0) {
		return (int)Math.pow(2.0, 7.0F + var0 / 256.0F);
	}
}
