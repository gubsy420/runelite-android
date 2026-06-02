import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sj")
public class sj {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float az_fld = Float.MAX_VALUE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	sj aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float av_fld = Float.MAX_VALUE;
	@ObfuscatedGetter(
		intValue = 157988587
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bc_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cf_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bu_fld;

	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "(Lgo;IIIIIIIIZ)V"
	)
	public static void rd(go var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = var1;
		var0.az_fld = var2;
		var0.av_fld = var3;
		var0.ae_fld = var4;
		var0.ah_fld = var5;
		var0.aw_fld = var6;
		var0.ay_fld = var7;
		var0.as_fld = var8;
		var0.ar_fld = var9;
	}

	sj() {
		this.ae_fld = Float.MAX_VALUE;
		this.ah_fld = Float.MAX_VALUE;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ak(xi var1, int var2) {
		this.ak_fld = var1.cz();
		this.ag_fld = var1.ci();
		this.az_fld = var1.ci();
		this.av_fld = var1.ci();
		this.ae_fld = var1.ci();
		this.ah_fld = var1.ci();
	}
}
