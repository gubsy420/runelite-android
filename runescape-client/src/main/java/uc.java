import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uc")
public class uc {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float al_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	public static uc by_fld = new uc();
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ak_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float af_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ah_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ar_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ae_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float as_fld;

	static {
		new uc();
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Luc;F)V"
	)
	public static void cz(uc var0, float var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			float var2 = (float)Math.cos(var1);
			float var3 = (float)Math.sin(var1);
			float var4 = var0.aw_fld;
			float var5 = var0.ak_fld;
			float var6 = var0.av_fld;
			float var7 = var0.ae_fld;
			var0.aw_fld = var2 * var4 - var0.ay_fld * var3;
			var0.ay_fld = var0.ay_fld * var2 + var3 * var4;
			var0.ak_fld = var5 * var2 - var0.al_fld * var3;
			var0.al_fld = var0.al_fld * var2 + var5 * var3;
			var0.av_fld = var6 * var2 - var3 * var0.ar_fld;
			var0.ar_fld = var6 * var3 + var2 * var0.ar_fld;
			var0.ae_fld = var2 * var7 - var3 * var0.as_fld;
			var0.as_fld = var3 * var7 + var2 * var0.as_fld;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)V"
	)
	public void ag(float var1) {
		float var3 = (float)Math.cos(var1);
		float var4 = (float)Math.sin(var1);
		float var5 = this.aw_fld;
		float var6 = this.ak_fld;
		float var7 = this.av_fld;
		float var8 = this.ae_fld;
		this.aw_fld = var3 * var5 - this.ay_fld * var4;
		this.ay_fld = this.ay_fld * var3 + var4 * var5;
		this.ak_fld = var6 * var3 - this.al_fld * var4;
		this.al_fld = this.al_fld * var3 + var6 * var4;
		this.av_fld = var7 * var3 - var4 * this.ar_fld;
		this.ar_fld = var7 * var4 + var3 * this.ar_fld;
		this.ae_fld = var3 * var8 - var4 * this.as_fld;
		this.as_fld = var4 * var8 + var3 * this.as_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void ar(float var1) {
		float var2 = (float)Math.cos(var1);
		float var3 = (float)Math.sin(var1);
		float var4 = this.aw_fld;
		float var5 = this.ak_fld;
		float var6 = this.av_fld;
		float var7 = this.ae_fld;
		this.aw_fld = var2 * var4 - this.ay_fld * var3;
		this.ay_fld = this.ay_fld * var2 + var3 * var4;
		this.ak_fld = var5 * var2 - this.al_fld * var3;
		this.al_fld = this.al_fld * var2 + var5 * var3;
		this.av_fld = var6 * var2 - var3 * this.ar_fld;
		this.ar_fld = var6 * var3 + var2 * this.ar_fld;
		this.ae_fld = var2 * var7 - var3 * this.as_fld;
		this.as_fld = var3 * var7 + var2 * this.as_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FB)V"
	)
	public void az(float var1) {
		float var3 = (float)Math.cos(var1);
		float var4 = (float)Math.sin(var1);
		float var5 = this.ah_fld;
		float var6 = this.ag_fld;
		float var7 = this.af_fld;
		float var8 = this.az_fld;
		this.ah_fld = var4 * this.ay_fld + var5 * var3;
		this.ay_fld = this.ay_fld * var3 - var4 * var5;
		this.ag_fld = var6 * var3 + this.al_fld * var4;
		this.al_fld = this.al_fld * var3 - var4 * var6;
		this.af_fld = var4 * this.ar_fld + var7 * var3;
		this.ar_fld = var3 * this.ar_fld - var4 * var7;
		this.az_fld = var8 * var3 + var4 * this.as_fld;
		this.as_fld = this.as_fld * var3 - var4 * var8;
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void oh(float var1, float var2, float var3) {
		in(this, var1, var2, var3, -405011595);
	}

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void tl(float var1) {
		this.ag(var1);
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return this.ah_fld
			+ ","
			+ this.ag_fld
			+ ","
			+ this.af_fld
			+ ","
			+ this.az_fld
			+ "\n"
			+ this.aw_fld
			+ ","
			+ this.ak_fld
			+ ","
			+ this.av_fld
			+ ","
			+ this.ae_fld
			+ "\n"
			+ this.ay_fld
			+ ","
			+ this.al_fld
			+ ","
			+ this.ar_fld
			+ ","
			+ this.as_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	void au(float var1) {
		float var2 = (float)Math.cos(var1);
		float var3 = (float)Math.sin(var1);
		float var4 = this.ah_fld;
		float var5 = this.ag_fld;
		float var6 = this.af_fld;
		float var7 = this.az_fld;
		this.ah_fld = var4 * var2 - this.aw_fld * var3;
		this.aw_fld = var3 * var4 + var2 * this.aw_fld;
		this.ag_fld = var5 * var2 - var3 * this.ak_fld;
		this.ak_fld = var2 * this.ak_fld + var5 * var3;
		this.af_fld = var6 * var2 - this.av_fld * var3;
		this.av_fld = var3 * var6 + this.av_fld * var2;
		this.az_fld = var2 * var7 - this.ae_fld * var3;
		this.ae_fld = var2 * this.ae_fld + var7 * var3;
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.ah_fld
			+ ","
			+ this.ag_fld
			+ ","
			+ this.af_fld
			+ ","
			+ this.az_fld
			+ "\n"
			+ this.aw_fld
			+ ","
			+ this.ak_fld
			+ ","
			+ this.av_fld
			+ ","
			+ this.ae_fld
			+ "\n"
			+ this.ay_fld
			+ ","
			+ this.al_fld
			+ ","
			+ this.ar_fld
			+ ","
			+ this.as_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)V"
	)
	void av(float var1) {
		float var3 = (float)Math.cos(var1);
		float var4 = (float)Math.sin(var1);
		float var5 = this.ah_fld;
		float var6 = this.ag_fld;
		float var7 = this.af_fld;
		float var8 = this.az_fld;
		this.ah_fld = var5 * var3 - this.aw_fld * var4;
		this.aw_fld = var4 * var5 + var3 * this.aw_fld;
		this.ag_fld = var6 * var3 - var4 * this.ak_fld;
		this.ak_fld = var3 * this.ak_fld + var6 * var4;
		this.af_fld = var7 * var3 - this.av_fld * var4;
		this.av_fld = var4 * var7 + this.av_fld * var3;
		this.az_fld = var3 * var8 - this.ae_fld * var4;
		this.ae_fld = var3 * this.ae_fld + var8 * var4;
	}

	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "(Luc;)V"
	)
	public static void un(uc var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = 0.0F;
		var0.ae_fld = 0.0F;
		var0.az_fld = 0.0F;
		var0.av_fld = 0.0F;
		var0.af_fld = 0.0F;
		var0.al_fld = 0.0F;
		var0.ag_fld = 0.0F;
		var0.ay_fld = 0.0F;
		var0.aw_fld = 0.0F;
		var0.ar_fld = 1.0F;
		var0.ak_fld = 1.0F;
		var0.ah_fld = 1.0F;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void hr(float var1) {
		this.az(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ah() {
		this.as_fld = 0.0F;
		this.ae_fld = 0.0F;
		this.az_fld = 0.0F;
		this.av_fld = 0.0F;
		this.af_fld = 0.0F;
		this.al_fld = 0.0F;
		this.ag_fld = 0.0F;
		this.ay_fld = 0.0F;
		this.aw_fld = 0.0F;
		this.ar_fld = 1.0F;
		this.ak_fld = 1.0F;
		this.ah_fld = 1.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void as(float var1) {
		float var2 = (float)Math.cos(var1);
		float var3 = (float)Math.sin(var1);
		float var4 = this.aw_fld;
		float var5 = this.ak_fld;
		float var6 = this.av_fld;
		float var7 = this.ae_fld;
		this.aw_fld = var2 * var4 - this.ay_fld * var3;
		this.ay_fld = this.ay_fld * var2 + var3 * var4;
		this.ak_fld = var5 * var2 - this.al_fld * var3;
		this.al_fld = this.al_fld * var2 + var5 * var3;
		this.av_fld = var6 * var2 - var3 * this.ar_fld;
		this.ar_fld = var6 * var3 + var2 * this.ar_fld;
		this.ae_fld = var2 * var7 - var3 * this.as_fld;
		this.as_fld = var3 * var7 + var2 * this.as_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void af(float var1) {
		float var2 = (float)Math.cos(var1);
		float var3 = (float)Math.sin(var1);
		float var4 = this.ah_fld;
		float var5 = this.ag_fld;
		float var6 = this.af_fld;
		float var7 = this.az_fld;
		this.ah_fld = var3 * this.ay_fld + var4 * var2;
		this.ay_fld = this.ay_fld * var2 - var3 * var4;
		this.ag_fld = var5 * var2 + this.al_fld * var3;
		this.al_fld = this.al_fld * var2 - var3 * var5;
		this.af_fld = var3 * this.ar_fld + var6 * var2;
		this.ar_fld = var2 * this.ar_fld - var3 * var6;
		this.az_fld = var7 * var2 + var3 * this.as_fld;
		this.as_fld = this.as_fld * var2 - var3 * var7;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.ah_fld
			+ ","
			+ this.ag_fld
			+ ","
			+ this.af_fld
			+ ","
			+ this.az_fld
			+ "\n"
			+ this.aw_fld
			+ ","
			+ this.ak_fld
			+ ","
			+ this.av_fld
			+ ","
			+ this.ae_fld
			+ "\n"
			+ this.ay_fld
			+ ","
			+ this.al_fld
			+ ","
			+ this.ar_fld
			+ ","
			+ this.as_fld;
	}

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)V"
	)
	public static void ra(uc var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = 0.0F;
		var0.ae_fld = 0.0F;
		var0.az_fld = 0.0F;
		var0.av_fld = 0.0F;
		var0.af_fld = 0.0F;
		var0.al_fld = 0.0F;
		var0.ag_fld = 0.0F;
		var0.ay_fld = 0.0F;
		var0.aw_fld = 0.0F;
		var0.ar_fld = 1.0F;
		var0.ak_fld = 1.0F;
		var0.ah_fld = 1.0F;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void ck(float var1) {
		this.av(var1);
	}

	public uc() {
		ra(this, 7759444);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void al(float var1) {
		float var2 = (float)Math.cos(var1);
		float var3 = (float)Math.sin(var1);
		float var4 = this.ah_fld;
		float var5 = this.ag_fld;
		float var6 = this.af_fld;
		float var7 = this.az_fld;
		this.ah_fld = var3 * this.ay_fld + var4 * var2;
		this.ay_fld = this.ay_fld * var2 - var3 * var4;
		this.ag_fld = var5 * var2 + this.al_fld * var3;
		this.al_fld = this.al_fld * var2 - var3 * var5;
		this.af_fld = var3 * this.ar_fld + var6 * var2;
		this.ar_fld = var2 * this.ar_fld - var3 * var6;
		this.az_fld = var7 * var2 + var3 * this.as_fld;
		this.as_fld = this.as_fld * var2 - var3 * var7;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	void ax(float var1) {
		float var2 = (float)Math.cos(var1);
		float var3 = (float)Math.sin(var1);
		float var4 = this.ah_fld;
		float var5 = this.ag_fld;
		float var6 = this.af_fld;
		float var7 = this.az_fld;
		this.ah_fld = var4 * var2 - this.aw_fld * var3;
		this.aw_fld = var3 * var4 + var2 * this.aw_fld;
		this.ag_fld = var5 * var2 - var3 * this.ak_fld;
		this.ak_fld = var2 * this.ak_fld + var5 * var3;
		this.af_fld = var6 * var2 - this.av_fld * var3;
		this.av_fld = var3 * var6 + this.av_fld * var2;
		this.az_fld = var2 * var7 - this.ae_fld * var3;
		this.ae_fld = var2 * this.ae_fld + var7 * var3;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Luc;FFFI)V"
	)
	public static void in(uc var0, float var1, float var2, float var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld += var1;
			var0.ae_fld += var2;
			var0.as_fld += var3;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak(int var1) {
		this.az_fld = 0.0F;
		this.as_fld = 0.0F;
		this.aw_fld = 0.0F;
		this.ar_fld = 0.0F;
		this.ay_fld = 0.0F;
		this.ay_fld = 0.0F;
		this.av_fld = 0.0F;
		this.aw_fld = 0.0F;
		this.ag_fld = 0.0F;
		this.af_fld = 1.0F;
		this.as_fld = 1.0F;
		this.ag_fld = 1.0F;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ca() {
		ra(this, 7759444);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V"
	)
	public void ae(float var1, float var2, float var3, int var4) {
		this.ay_fld = this.ak_fld + var1;
		this.az_fld = this.al_fld + var2;
		this.ar_fld = this.az_fld + var3;
	}
}
