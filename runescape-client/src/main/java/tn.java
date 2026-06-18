import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tn")
public interface tn {
	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)I"
	)
	static int nh(gu var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld >> 7;
	}
}
