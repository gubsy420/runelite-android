import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tc")
public abstract class tc implements tr {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1871618741
	)
	protected int ak_fld;

	protected tc(ju var1, xh var2, int var3) {
		this.ak_fld = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public static int ah(int var0) {
		var0 += 64;
		return (var0 & 2047) / 128;
	}
}
