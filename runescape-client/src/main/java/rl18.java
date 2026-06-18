import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl18")
class rl18 implements Comparator {
	// $VF: synthetic field
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev fb_fld;

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "(Lsn;)I"
	)
	public static int ra(sn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ao_fld;
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lrl17;)I"
	)
	public int my(rl17 var1) {
		int var2 = var1.zb_fld * 8 + 4 - this.fb_fld.qr_fld << 7;
		int var3 = var1.bj_fld * 8 + 4 - this.fb_fld.qr_fld << 7;
		return (var2 - this.fb_fld.du_fld) * (var2 - this.fb_fld.du_fld) + (var3 - this.fb_fld.co_fld) * (var3 - this.fb_fld.co_fld);
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.um((rl17)var1, (rl17)var2);
	}

	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "(Lrl17;Lrl17;)I"
	)
	public int um(rl17 var1, rl17 var2) {
		return Integer.compare(this.my(var1), this.my(var2));
	}

	public rl18(ev var1) {
		this.fb_fld = var1;
	}
}
