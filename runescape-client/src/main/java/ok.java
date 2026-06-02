import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ok")
public class ok extends vc {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ak_fld = new iw(64);

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void bl(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld = var1 * 1106004157;
		og.ag();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int av(int var0) {
		return uh.ae_fld[var0 & 16383];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIII)V"
	)
	public static void ae(zv var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		} else if (var1 != null) {
			zv.es(var0, var4, var5);
			zv.as_fld = var6;
			var0.bl(var1, var2, var3);
		}
	}

	ok() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lxh;)Ljava/lang/String;"
	)
	public static String ki(xh var0) {
		return var0.af_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IIII)Z"
	)
	public static boolean ae(vv var0, int var1, int var2, int var3, int var4) {
		int var7 = var0.aw();
		int var8 = var0.ae();
		int var9 = var0.ah();
		int var10 = Math.max(var1, Math.min(var8, var3));
		int var11 = Math.max(var2, Math.min(var9, var4));
		int var12 = var8 - var10;
		int var13 = var9 - var11;
		return var13 * var13 + var12 * var12 <= var7;
	}
}
