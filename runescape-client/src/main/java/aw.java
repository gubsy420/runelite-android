import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aw")
public interface aw {
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;)V"
	)
	static void wn(os var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			var0.az(var1, var2, (short)-8085);
		}
	}
}
