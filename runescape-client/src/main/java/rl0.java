import java.net.URL;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl0")
interface rl0 {
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Ljava/lang/String;)V"
	)
	void qm(URL var1, String var2);

	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;)V"
	)
	void ru(URL var1);

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)Ljava/lang/String;"
	)
	static String gh(gf var0) {
		return var0.ag_fld;
	}
}
