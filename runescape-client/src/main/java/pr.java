import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pr")
public class pr extends vc {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ak_fld = new iw(64);
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bw_fld;
	@ObfuscatedGetter(
		intValue = -1765791691
	)
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int pv_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Z)Z"
	)
	static boolean az(File var0, boolean var1) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var5) {
			return false;
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Luk;Llu;Llu;II)V"
	)
	public static void fa(uk var0, lu var1, lu var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1;
		var0.ag_fld = var2;
		var0.az_fld = var3;
		var0.av_fld = var4;
		var0.ah_fld = 0;
		var0.ay_fld = false;
	}

	pr() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("yp")
	@ObfuscatedSignature(
		descriptor = "(Los;I)Ljava/lang/String;"
	)
	public static String yp(os var0, int var1) {
		for (int var2 = 0; var2 < var0.aa_fld; var2++) {
			if (var1 == var0.ai_fld[var2]) {
				return var0.ad_fld[var2];
			}
		}

		return var0.au_fld;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lfr;)V"
	)
	public static void oj(qg var0, fr var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld.az(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ak_fld.vh();
	}
}
