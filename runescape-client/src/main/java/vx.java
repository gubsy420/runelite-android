import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vx")
public abstract class vx {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ad_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double af_fld;
	@ObfuscatedGetter(
		intValue = 1076816293
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedGetter(
		intValue = 1076816293
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = -751100539
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld = 0;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)D"
	)
	double au_double(byte var1) {
		return this.af_fld;
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Lvx;B)V"
	)
	public static void wk(vx var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.ar_fld < var0.as_fld) {
				var0.ar_fld++;
				int var2 = var0.ar_fld;
				int var3 = var0.as_fld;
				int var5 = var0.al_fld * 17728559;
				zm var4 = zm.br_fld[var5];
				var0.af_fld = nl.az(var2, var3, var4);
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		if (this.ar_fld < this.as_fld) {
			this.ar_fld++;
			int var1 = 503677329 * this.ar_fld;
			int var2 = this.as_fld;
			int var4 = this.al_fld * 892574040;
			zm var3 = zm.br_fld[var4];
			this.af_fld = nl.az(var1, var2, var3);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	double ai() {
		return this.af_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltu;FFF)V"
	)
	public static void az(tu var0, float var1, float var2, float var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var1;
		var0.as_fld = var2;
		var0.ar_fld = var3;
	}

	vx(int var1, int var2) {
		this.ar_fld = 0;
		this.af_fld = 0.0;
		this.al_fld = 0;
		this.as_fld = var1;
		this.ar_fld = 0;
		this.al_fld = -1929297201 * (var2 >= 0 && var2 <= 27 ? var2 : 0);
		int var4 = this.ar_fld;
		int var5 = this.as_fld;
		int var7 = 17728559 * this.al_fld;
		zm var6 = zm.br_fld[var7];
		this.af_fld = nl.az(var4, var5, var6);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	double aq() {
		return this.af_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void al(byte var1) {
		if (this.al_fld < this.as_fld) {
			this.as_fld = this.ar_fld + 165533229;
			int var2 = this.al_fld;
			int var3 = this.as_fld;
			int var5 = this.ar_fld * 17728559;
			zm var4 = zm.br_fld[var5];
			this.af_fld = nl.az(var2, var3, var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		if (this.al_fld < this.ar_fld) {
			this.al_fld = this.as_fld + 165533229;
			int var1 = this.al_fld;
			int var2 = -751100539 * this.ar_fld;
			int var4 = this.as_fld * 17728559;
			zm var3 = zm.br_fld[var4];
			this.af_fld = nl.az(var1, var2, var3);
		}
	}
}
