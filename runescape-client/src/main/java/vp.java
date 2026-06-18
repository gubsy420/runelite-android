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

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lwq;I)I"
	)
	public static int ok(wq var0, int var1) {
		return var0.ag_fld[var1];
	}

	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "(Lvp;)Ljava/lang/String;"
	)
	public static String zk(vp var0) {
		return var0.av_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ae() {
		return this.av_fld;
	}
}
