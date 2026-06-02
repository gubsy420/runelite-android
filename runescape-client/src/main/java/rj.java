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
	@ObfuscatedGetter(
		intValue = 317317117
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedGetter(
		intValue = 326840029
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -1080591575
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 981243095
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = 1311020513
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 1848815349
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIII)V"
	)
	public static void wq(gn var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.by_fld = var1;
		var0.bl_fld = var2;
		var0.bx_fld = var3 * 146099809;
		var0.bo_fld = var4 * -1891825202;
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lrj;)V"
	)
	public void me(rj var1) {
		this.ak(var1);
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)V"
	)
	public static void dl(mw var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aw_fld.al_fld = null;
		var0.af_fld = null;
		var0.al_fld = null;
		var0.as_fld = null;
		var0.au_fld = null;
	}

	rj() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrj;)V"
	)
	void ak(rj var1) {
		this.az_fld = 1 * var1.az_fld;
		this.ak_fld = var1.ak_fld;
		this.av_fld = var1.av_fld * 1311020513;
		this.aw_fld = 1 * var1.aw_fld;
		this.ah_fld = 1 * var1.ah_fld;
		this.ae_fld = var1.ae_fld * -1080591575;
		this.ag_fld = var1.ag_fld * 317317117;
		this.ay_fld = var1.ay_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String ae(String var0) {
		return null != var0 && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}
}
