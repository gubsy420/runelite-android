import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl16")
class rl16 implements Comparator {
	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	public static fw uz_fld;

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "(Lds;)Lpg;"
	)
	public static pg zo(ds var0) {
		return var0.al_fld;
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.sl((fj)var1, (fj)var2);
	}

	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "(Lfj;Lfj;)I"
	)
	public int sl(fj var1, fj var2) {
		return Integer.compare(fv(var2), fv(var1));
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lfj;)I"
	)
	public static int fv(fj var0) {
		int var1 = (int)uz_fld.project(var0.ah_fld, var0.ae_fld, var0.aw_fld)[2];
		if (var0.ak_fld == cl.qs_fld) {
			var1 -= 12;
		}

		return var1;
	}

	public rl16() {
	}
}
