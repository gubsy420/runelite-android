import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tn")
public interface tn {
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(Lay;)Lxi;"
	)
	static xi qv(ay var0) {
		try {
			return (xi)(xi)var0.av_fld.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lny;ILjava/lang/String;)Ljava/lang/String;"
	)
	static String uk(ny var0, int var1, String var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return ih.av(var0.ah_fld, var1, var2);
	}
}
