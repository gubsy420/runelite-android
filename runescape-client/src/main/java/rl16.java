import java.util.BitSet;
import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl16")
class rl16 implements Comparator {
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	public static fw jy_fld;

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)I"
	)
	public static int bl(fj var0) {
		int var1 = (int)jy_fld.project(var0.ah_fld, var0.ae_fld, var0.aw_fld)[2];
		if (var0.ak_fld == cl.aj_fld) {
			var1 -= 12;
		}

		return var1;
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.vk((fj)var1, (fj)var2);
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lev;Ljava/util/BitSet;IIIIZ)Z"
	)
	public static boolean ie(ev var0, BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.set(var2 * var0.bk_fld + var3 * var0.bj_fld + var4 * var0.bf_fld + var5, var6);
		return var6;
	}

	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "(Lfj;Lfj;)I"
	)
	public int vk(fj var1, fj var2) {
		return Integer.compare(bl(var2), bl(var1));
	}

	public rl16() {
	}
}
