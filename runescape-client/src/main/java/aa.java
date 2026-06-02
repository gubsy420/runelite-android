import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aa")
public interface aa {
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lvx;)V"
	)
	static void gi(vx var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.ar_fld < var0.as_fld) {
				var0.ar_fld++;
				int var1 = var0.ar_fld;
				int var2 = var0.as_fld;
				int var4 = var0.al_fld * 17728559;
				zm var3 = zm.br_fld[var4];
				var0.af_fld = nl.az(var1, var2, var3);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lao;"
	)
	ao ak(byte var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	ao ag();
}
