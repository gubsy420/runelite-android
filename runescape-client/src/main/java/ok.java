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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int av(int var0) {
		return uh.ae_fld[var0 & 16383];
	}

	ok() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IIIII)Z"
	)
	public static boolean ae(vv var0, int var1, int var2, int var3, int var4) {
		int var7 = vv.dh(var0, 617329210);
		int var8 = var0.ae();
		int var9 = var0.ah();
		int var10 = Math.max(var1, Math.min(var8, var3));
		int var11 = Math.max(var2, Math.min(var9, var4));
		int var12 = var8 - var10;
		int var13 = var9 - var11;
		return var13 * var13 + var12 * var12 <= var7;
	}
}
