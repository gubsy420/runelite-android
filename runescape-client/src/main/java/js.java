import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("js")
public class js {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int by_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bn_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lql;)[Ljava/security/cert/Certificate;"
	)
	public static Certificate[] ah(ql var0) throws SSLPeerUnverifiedException {
		return var0.this$1.ak_fld;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lbh;I)I"
	)
	public static int fa(bh var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = 0;
		int var3 = 0;

		while (var1 >= 8 - var0.ak_fld) {
			int var4 = 8 - var0.ak_fld;
			int var5 = (1 << var4) - 1;
			var2 += (var0.az_fld[var0.ag_fld] >> var0.ak_fld & var5) << var3;
			var0.ak_fld = 0;
			var0.ag_fld++;
			var3 += var4;
			var1 -= var4;
		}

		if (var1 > 0) {
			int var6 = (1 << var1) - 1;
			var2 += (var0.az_fld[var0.ag_fld] >> var0.ak_fld & var6) << var3;
			var0.ak_fld += 779848757 * var1;
		}

		return var2;
	}

	js() throws Throwable {
		throw new Error();
	}
}
