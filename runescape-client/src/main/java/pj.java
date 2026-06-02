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
	@ObfuscatedGetter(
		intValue = 1733271787
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Lrs;)I"
	)
	public static int ow(rs var0) {
		return var0.ag_fld;
	}

	pj(Object var1, int var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}
}
