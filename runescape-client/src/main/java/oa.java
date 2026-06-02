import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oa")
public class oa extends vc {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ak_fld = new iw(64);

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lno;)V"
	)
	public static void ys(no var0) {
		if (var0 == null) {
			var0.getClass();
		}

		while (var0.ak_fld.hg_vw != var0.ak_fld) {
			var0.ak_fld.hg_vw.gy_void();
		}
	}

	oa() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int cv(int var0, ba var1, boolean var2) {
		return 2;
	}
}
