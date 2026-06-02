import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vh")
public class vh extends vx {
	@ObfuscatedGetter(
		intValue = -1907120707
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = 1775253123
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld = 0;
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
		this.ag_fld = 0;
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		double var1 = this.au_double((byte)-36);
		return (int)Math.round(this.ak_fld + var1 * (this.ag_fld - this.ak_fld));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int az() {
		double var1 = this.au_double((byte)23);
		return (int)Math.round(this.ak_fld + var1 * (this.ag_fld - this.ak_fld));
	}

	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "(Lvh;I)I"
	)
	public static int vk(vh var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			double var2 = var0.au_double((byte)105);
			return (int)Math.round(var0.ak_fld + var2 * (var0.ag_fld - var0.ak_fld));
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	static final int au(byte var0) {
		return ej.bh_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvh;)I"
	)
	public static int ae(vh var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			double var1 = var0.au_double((byte)7);
			return (int)Math.round(-611273120 * var0.ak_fld + var1 * (var0.ag_fld - var0.ak_fld));
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I"
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
		return (int)Math.round(1775253123 * this.ag_fld + var2 * (this.ak_fld - this.ak_fld));
	}
}
