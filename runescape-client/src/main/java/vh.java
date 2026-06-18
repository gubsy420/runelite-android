import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vh")
public class vh extends vx {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1907120707
	)
	int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1775253123
	)
	int ag_fld = 0;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bd_fld;

	public vh(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.ak_fld = 0;
		this.ag_fld = var1;
		this.ak_fld = var2;
	}

	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "(Lvh;)I"
	)
	public static int un(vh var0) {
		if (var0 == null) {
			var0.getClass();
		}

		double var1 = var0.au_double((byte)23);
		return (int)Math.round(var0.ag_fld + var1 * (var0.ak_fld - var0.ag_fld));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		double var1 = this.au_double((byte)-36);
		return (int)Math.round(this.ag_fld + var1 * (this.ak_fld - this.ag_fld));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		double var1 = this.au_double((byte)7);
		return (int)Math.round(-611273120 * this.ag_fld + var1 * (this.ak_fld - this.ag_fld));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	static final int au(byte var0) {
		return ej.bh_fld;
	}

	@ObfuscatedName("zb")
	@ObfuscatedSignature(
		descriptor = "(Lvh;I)I"
	)
	public static int zb(vh var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		double var2 = var0.au_double((byte)105);
		return (int)Math.round(var0.ag_fld + var2 * (var0.ak_fld - var0.ag_fld));
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Loe;Lxi;)V"
	)
	public static void kq(oe var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			var0.aw(var1, var2, 1705389376);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	public static int av(int var0, int var1, int var2) {
		int var4 = (int)ub.ak(1 + (var2 - var1), -1793925999);
		var4 <<= var1;
		int var5;
		return var5 = var0 & ~var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ak(int var1) {
		double var2 = this.au_double((byte)105);
		return (int)Math.round(this.ag_fld + var2 * (this.ag_fld - this.ag_fld));
	}
}
