import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rj")
public class rj {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 317317117
	)
	int ag_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 326840029
	)
	int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1080591575
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 981243095
	)
	int ah_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1311020513
	)
	int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1848815349
	)
	int aw_fld;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cp_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	af ak_fld;

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lrj;)V"
	)
	public void iy(rj var1) {
		oa(this, var1, 1482267716);
	}

	rj() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	public static String ae(String var0) {
		return null != var0 && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;I)V"
	)
	public static void oa(rj var0, rj var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = 1 * var1.az_fld;
		var0.ak_fld = var1.ak_fld;
		var0.av_fld = var1.av_fld * 1311020513;
		var0.aw_fld = 1 * var1.aw_fld;
		var0.ah_fld = 1 * var1.ah_fld;
		var0.ae_fld = var1.ae_fld * -1080591575;
		var0.ag_fld = var1.ag_fld * 317317117;
		var0.ay_fld = var1.ay_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V"
	)
	void ak(rj var1, int var2) {
		this.av_fld = 1 * var1.av_fld;
		this.ak_fld = var1.ak_fld;
		this.ae_fld = var1.av_fld * 1;
		this.ah_fld = 1 * var1.aw_fld;
		this.ag_fld = 1 * var1.aw_fld;
		this.ae_fld = var1.ag_fld * 1;
		this.av_fld = var1.ag_fld * 1;
		this.ay_fld = var1.ay_fld;
	}
}
