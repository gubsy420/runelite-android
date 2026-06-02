import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jl")
public class jl {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	static cj ln_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Ljq;"
	)
	public static jq[] ak() {
		return new jq[]{jq.av_fld, jq.ak_fld, jq.az_fld, jq.ag_fld};
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;)I"
	)
	public static int ye(ub var0, String var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var1 = var1.toLowerCase();
			int var2 = var0.bf_fld.ak(ov.ar(var1));
			return var0.ar(var2, -8656200);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void au() {
		yh.av_fld = null;
		yh.ae_fld = null;
		yh.ah_fld = null;
		yh.aw_fld = null;
		yh.ay_fld = null;
		yo.as_fld = null;
	}

	jl() throws Throwable {
		throw new Error();
	}
}
