import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tc")
public abstract class tc implements tr {
	@ObfuscatedGetter(
		intValue = -1871618741
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	protected int ak_fld;

	protected tc(ju var1, xh var2, int var3) {
		this.ak_fld = var3;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Z"
	)
	public static boolean hf(cn var0) {
		return var0.ay_fld;
	}

	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)I"
	)
	public static int un(gu var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak_fld;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ah(int var0) {
		var0 += 64;
		return (var0 & 2047) / 128;
	}
}
