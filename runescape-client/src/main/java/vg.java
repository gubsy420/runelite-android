import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vg")
public class vg extends vq {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1174679197
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -709780697
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1952802087
	)
	int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1725483091
	)
	int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1504666749
	)
	int ak_fld = 0;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1140759777
	)
	int ah_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ay() {
		double var1 = this.au_double((byte)77);
		return (int)Math.round((this.ae_fld - this.ag_fld) * var1 + 1259913070 * this.ag_fld);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int az(int var1) {
		double var2 = this.au_double((byte)61);
		return (int)Math.round((this.av_fld - this.ak_fld) * var2 + this.ak_fld);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		double var1 = this.au_double((byte)-10);
		return (int)Math.round((this.av_fld - this.ak_fld) * var1 + 805275539 * this.ak_fld);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		double var2 = this.au_double((byte)10);
		return (int)Math.round(var2 * (this.ah_fld - this.az_fld) + this.az_fld);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		double var1 = this.au_double((byte)-41);
		return (int)Math.round((this.av_fld - this.ak_fld) * var1 + 46674774 * this.ak_fld);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		double var1 = this.au_double((byte)-35);
		return (int)Math.round((this.av_fld - this.ak_fld) * var1 + this.ak_fld);
	}

	public vg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.ag_fld = 0;
		this.az_fld = 0;
		this.av_fld = 0;
		this.ae_fld = 0;
		this.ah_fld = 0;
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = var6;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int aw() {
		double var1 = this.au_double((byte)79);
		return (int)Math.round((this.ae_fld - this.ag_fld) * var1 + this.ag_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ak(int var1) {
		double var2 = this.au_double((byte)-72);
		return (int)Math.round((this.ae_fld - this.ag_fld) * var2 + this.ag_fld);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int as() {
		double var1 = this.au_double((byte)83);
		return (int)Math.round(var1 * (this.ah_fld - this.az_fld) + this.az_fld);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ar() {
		double var1 = this.au_double((byte)-34);
		return (int)Math.round(var1 * (this.ah_fld - this.az_fld) + this.az_fld);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int af() {
		double var1 = this.au_double((byte)23);
		return (int)Math.round(var1 * (this.ah_fld - this.az_fld) + -1403489974 * this.az_fld);
	}
}
