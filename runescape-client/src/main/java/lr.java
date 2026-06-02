import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lr")
public class lr {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cy_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bj_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean bx_fld;

	lr() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	static void ay(lu var0, int var1, int var2) {
		if (var0.bx_fld == 0 && var0.by_fld > -1) {
			if (var1 > var0.cs_fld) {
				if (var2 != 1828744557) {
					return;
				}

				var0.cs_fld = var1;
			}

			if (var1 < var0.cx_fld) {
				var0.cx_fld = var1;
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int bc(int var0, ba var1, boolean var2) {
		if (var0 == 5630) {
			client.jk_fld = 362378318;
			return 1;
		} else {
			return 2;
		}
	}
}
