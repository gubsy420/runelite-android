import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl18")
class rl18 implements Comparator {
	// $VF: synthetic field
	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev mw_fld;

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.oc((rl17)var1, (rl17)var2);
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lrl18;Lrl17;)I"
	)
	public static int mm(rl18 var0, rl17 var1) {
		int var2 = var1.go_fld * 8 + 4 - var0.mw_fld.jh_fld << 7;
		int var3 = var1.kq_fld * 8 + 4 - var0.mw_fld.jh_fld << 7;
		return (var2 - var0.mw_fld.cw_fld) * (var2 - var0.mw_fld.cw_fld) + (var3 - var0.mw_fld.cy_fld) * (var3 - var0.mw_fld.cy_fld);
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lrl17;Lrl17;)I"
	)
	public int oc(rl17 var1, rl17 var2) {
		return Integer.compare(mm(this, var1), mm(this, var2));
	}

	public rl18(ev var1) {
		this.mw_fld = var1;
	}
}
