import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xs")
public class xs {
	@ObfuscatedGetter(
		intValue = 1278114781
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int as_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	static xs ag_fld = new xs(1, 1);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	static xs ak_fld = new xs(0, 1);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	static xs av_fld = new xs(3, 2);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	static xs az_fld = new xs(2, 2);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	static xs ah_fld = new xs(5, 3);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	public static xs aw_fld = new xs(6, 4);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	static xs ae_fld = new xs(4, 3);
	@ObfuscatedGetter(
		intValue = -1892281921
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Lda;II)V"
	)
	public static void kd(da var0, int var1, int var2) {
		bb.jx(var0.cg_fld, var1, var2, -1106240719);
	}

	@ObfuscatedName("yi")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int yi(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 3;
		return (var0.al_fld[var0.au_fld - 2] & -1571238554) + ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 8) + ((var0.al_fld[var0.au_fld - 3] & -296256641) << 16);
	}

	xs(int var1, int var2) {
		this.ay_fld = var1;
		this.as_fld = var2;
	}
}
