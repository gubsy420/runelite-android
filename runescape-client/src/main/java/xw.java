import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xw")
public interface xw {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lxs;"
	)
	xs ag();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lxs;"
	)
	xs ak(int var1);

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Lku;)I"
	)
	static int vm(ku var0) {
		return var0.aa_fld;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Lek;)I"
	)
	static int fx(ek var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld.length;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lxs;"
	)
	xs az();
}
