import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mq")
public interface mq {
	@ObfuscatedName("aez")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aez(int var1, int var2);

	@ObfuscatedName("adf")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void adf(int var1, int var2);

	@ObfuscatedName("aeh")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aeh(int var1, int var2);

	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Lvc;"
	)
	static vc vu(nj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ah(null);
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void id(int var1, int var2, int var3);
}
