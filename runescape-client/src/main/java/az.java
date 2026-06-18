import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("az")
public interface az {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	static int fn(zg var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lxi;"
	)
	xi az(xi var1);

	@ObfuscatedName("zg")
	@ObfuscatedSignature(
		descriptor = "(Lds;)V"
	)
	static void zg(ds var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lxi;"
	)
	xi ak(xi var1);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Lxi;"
	)
	xi av(xi var1);
}
