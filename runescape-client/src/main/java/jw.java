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

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Lvc;"
	)
	public static vc id(nj var0) {
		vc var1 = var0.ak_fld.fn_vc;
		if (var1 == var0.ak_fld) {
			return null;
		} else {
			var1.vi();
			return var1;
		}
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void nw(zg var0, int var1) {
		if (var0.at_fld != var1) {
			var0.at_fld = var1 * 806471629;
			var0.bj();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)Z"
	)
	public static boolean ak(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		return !nh.ag(var0, var1, var2, var3, var4, var5) ? false : nh.ag(var0, var1, var4, var5, var6, var7);
	}

	jw() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	public static boolean al(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
