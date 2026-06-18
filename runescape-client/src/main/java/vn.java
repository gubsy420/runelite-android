import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vn")
public class vn extends vq {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double ah_fld;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lyc;"
	)
	static yc cs_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -297575783
	)
	int ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -586448425
	)
	int ak_fld = 0;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		double var1 = this.au_double((byte)18);
		double var3 = this.ah_fld + var1 * (this.aw_fld - this.ah_fld);
		return (int)Math.round(this.az_fld + this.ae_fld * Math.cos(var3));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int az(int var1) {
		double var2 = this.au_double((byte)69);
		double var4 = this.ah_fld + var2 * (this.aw_fld - this.ah_fld);
		return (int)Math.round(this.az_fld + this.ae_fld * Math.cos(var4));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ak(int var1) {
		double var2 = this.au_double((byte)4);
		double var4 = this.ah_fld + var2 * (this.aw_fld - this.ah_fld);
		return (int)Math.round(this.av_fld + this.ae_fld * Math.sin(var4));
	}

	public vn(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.ag_fld = 0;
		this.az_fld = 0.0;
		this.av_fld = 0.0;
		this.ae_fld = 0.0;
		this.ah_fld = 0.0;
		this.aw_fld = 0.0;
		this.ak_fld = var3;
		this.ag_fld = var6;
		if ((var5 - var8) * (var7 - var1) == (var8 - var2) * (var4 - var7)) {
			this.az_fld = var4;
			this.av_fld = var5;
		} else {
			double var11 = (var1 + var7) / 2.0;
			double var13 = (var8 + var2) / 2.0;
			double var15 = (var7 + var4) / 2.0;
			double var17 = (var8 + var5) / 2.0;
			double var19 = (var7 - var1) * -1.0 / (var8 - var2);
			double var21 = (var4 - var7) * -1.0 / (var5 - var8);
			this.az_fld = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
			this.av_fld = var13 + var19 * (this.az_fld - var11);
			this.ae_fld = Math.sqrt(Math.pow(this.az_fld - var1, 2.0) + Math.pow(this.av_fld - var2, 2.0));
			this.ah_fld = Math.atan2(var2 - this.av_fld, var1 - this.az_fld);
			double var23 = Math.atan2(var8 - this.av_fld, var7 - this.az_fld);
			this.aw_fld = Math.atan2(var5 - this.av_fld, var4 - this.az_fld);
			boolean var25 = this.ah_fld <= var23 && var23 <= this.aw_fld || this.aw_fld <= var23 && var23 <= this.ah_fld;
			if (!var25) {
				this.aw_fld = this.aw_fld + Math.PI * (this.ah_fld - this.aw_fld > 0.0 ? 2 : -2);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		double var1 = this.au_double((byte)123);
		double var3 = this.ah_fld + var1 * (this.aw_fld - this.ah_fld);
		return (int)Math.round(this.az_fld + this.ae_fld * Math.cos(var3));
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int as() {
		double var1 = this.au_double((byte)9);
		return (int)Math.round((this.ag_fld - this.ak_fld) * var1 + 1702400681 * this.ak_fld);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		double var2 = this.au_double((byte)70);
		return (int)Math.round((this.ag_fld - this.ak_fld) * var2 + this.ak_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int aw() {
		double var1 = this.au_double((byte)44);
		double var3 = this.ah_fld + var1 * (this.aw_fld - this.ah_fld);
		return (int)Math.round(this.av_fld + this.ae_fld * Math.sin(var3));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ay() {
		double var1 = this.au_double((byte)-67);
		double var3 = this.ah_fld + var1 * (this.aw_fld - this.ah_fld);
		return (int)Math.round(this.av_fld + this.ae_fld * Math.sin(var3));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		double var1 = this.au_double((byte)-14);
		double var3 = this.ah_fld + var1 * (this.aw_fld - this.ah_fld);
		return (int)Math.round(this.az_fld + this.ae_fld * Math.cos(var3));
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ar() {
		double var1 = this.au_double((byte)-28);
		return (int)Math.round((this.ag_fld - this.ak_fld) * var1 + this.ak_fld);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int af() {
		double var1 = this.au_double((byte)84);
		return (int)Math.round((this.ag_fld - this.ak_fld) * var1 + 2135408968 * this.ak_fld);
	}
}
