import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("iu")
public interface iu {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	void ag(Object var1);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	void az(Object var1);

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lxi;I)V"
	)
	static void gs(pq var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (2 == var2) {
				var0.az_fld = true;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)V"
	)
	void ak(Object var1);
}
