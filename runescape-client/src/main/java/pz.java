import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pz")
public class pz extends RuntimeException {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	public static void jc(pi var0, int var1) {
		var0.av_fld[(var0.ae_fld += -866564185) * -1031606249 - 1 & 31] = var1;
	}

	public pz(String var1, Object[] var2) {
		super(String.format(var1, (Object[])var2));
	}
}
