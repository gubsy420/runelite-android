import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jo")
public interface jo {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	static void iv(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ax_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Lyc;"
	)
	yc[] ag(byte var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxy;B)Lzf;"
	)
	zf ak(xy var1, byte var2);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	yv az(int var1);

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)[Ljava/lang/Object;"
	)
	static Object[] kt(sl var0) {
		return (Object[])var0.as_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxy;)Lzf;"
	)
	zf av(xy var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxy;)Lzf;"
	)
	zf ae(xy var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()[Lyc;"
	)
	yc[] ah();
}
