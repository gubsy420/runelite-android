import java.io.EOFException;
import net.runelite.api.SpritePixels;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wf")
class wf implements xw {
	@ObfuscatedGetter(
		intValue = 241587713
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lnl;)Ljava/lang/String;"
	)
	public static String cu(nl var0) {
		return var0.av_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lxs;"
	)
	@Override
	public xs ag() {
		return xs.aw_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lyv;"
	)
	public static yv av(ub var0, int var1, int var2) throws EOFException {
		SpritePixels var4 = (SpritePixels)(SpritePixels)client.vf_fld.get(var1);
		if (var4 != null) {
			return ((yv)var4).rd();
		} else {
			int var8 = -447891562;
			yv var10000;
			if (!ms.ar(var0, var1, var2)) {
				Object var5 = null;
				var10000 = (yv)var5;
			} else {
				yv var9 = kh.as();
				var10000 = var9;
			}

			return var10000;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lxs;"
	)
	@Override
	public xs az() {
		return xs.aw_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lxs;"
	)
	@Override
	public xs ak(int var1) {
		return xs.aw_fld;
	}

	wf() {
	}
}
