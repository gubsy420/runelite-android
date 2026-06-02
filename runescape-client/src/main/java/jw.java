import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jw")
public class jw {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bm_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bk_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	static int[][][] ab_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean ak(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		return !nh.ag(var0, var1, var2, var3, var4, var5) ? false : nh.ag(var0, var1, var4, var5, var6, var7);
	}

	jw() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean al(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
