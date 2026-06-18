import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pj")
public class pj {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1733271787
	)
	int ag_fld;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int dq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ak_fld;

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lce;III)I"
	)
	public static int cw(ce var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = 256 - var3;
		return (var4 * (var1 & 0xFF00) + var3 * (var2 & 0xFF00) & 0xFF0000) + ((var2 & 16711935) * var3 + (var1 & 16711935) * var4 & -16711936) >> 8;
	}

	pj(Object var1, int var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}
}
