import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vp")
public class vp {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	static vp ag_fld = new vp("text/plain");
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	static vp az_fld = new vp("application/x-www-form-urlencoded");
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	public static vp ak_fld = new vp("application/json");
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String av_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String av() {
		return this.av_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ak() {
		return this.av_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ag() {
		return this.av_fld;
	}

	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "(Lvp;)Ljava/lang/String;"
	)
	public static String sg(vp var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String az() {
		return this.av_fld;
	}

	vp(String var1) {
		this.av_fld = var1;
	}
}
