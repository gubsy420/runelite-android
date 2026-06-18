import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aac")
public class aac {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2080132325
	)
	public static int ak_fld = 994275091;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lql;)[Ljava/security/cert/Certificate;"
	)
	public static Certificate[] gy(ql var0) throws SSLPeerUnverifiedException {
		return var0.this$1.ak_fld;
	}

	aac() throws Throwable {
		throw new Error();
	}
}
