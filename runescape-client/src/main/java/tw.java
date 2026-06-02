import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tw")
public class tw implements aa {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lzu;"
	)
	public static zu[] au_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;

	tw() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lao;"
	)
	@Override
	public ao ak(byte var1) {
		return new so();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Override
	public ao ag() {
		return new so();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V"
	)
	static void av(int var0, boolean var1, int var2, boolean var3, int var4) {
		if (null != yd.ae_fld) {
			if (var4 >= -542866807) {
				return;
			}

			bw.ae(0, yd.ae_fld.length - 1, var0, var1, var2, var3);
		}
	}
}
