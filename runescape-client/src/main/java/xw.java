import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xw")
public interface xw {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lxs;"
	)
	xs az();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lxs;"
	)
	xs ak(int var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	static void at(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bo_fld = 702894342;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lae;)Ljava/security/MessageDigest;"
	)
	static MessageDigest ak(ae var0) {
		if (var0 == null) {
			var0.getClass();
		}

		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lxs;"
	)
	xs ag();
}
