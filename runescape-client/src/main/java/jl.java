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
		descriptor = "(I)[Ljq;"
	)
	public static jq[] ak() {
		return new jq[]{jq.av_fld, jq.ak_fld, jq.az_fld, jq.ag_fld};
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "(Les;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int qs(es var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return es.dl(var0, (rr)var1, (rr)var2, (byte)-115);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public static void au() {
		yh.av_fld = null;
		yh.ae_fld = null;
		yh.ah_fld = null;
		yh.aw_fld = null;
		yh.ay_fld = null;
		yo.as_fld = null;
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Z"
	)
	public static boolean pc(uk var0) {
		return null != var0.ak_fld;
	}

	@ObfuscatedName("yi")
	@ObfuscatedSignature(
		descriptor = "(Loo;)Z"
	)
	public static boolean yi(oo var0) {
		return var0.ah_fld != null;
	}

	jl() throws Throwable {
		throw new Error();
	}
}
