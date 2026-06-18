import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("th")
public interface th extends tm {
	@ObfuscatedName("zj")
	@ObfuscatedSignature(
		descriptor = "(Lru;Luv;Lar;)V"
	)
	static void zj(ru var0, uv var1, ar var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1;
		var0.ag_fld = var2;
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Llp;II)V"
	)
	static void ne(lp var0, int var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.al_fld[var1] = var2;
			var0.au((short)2263);
		}
	}
}
