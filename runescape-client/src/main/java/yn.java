import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yn")
public interface yn {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	Object aw(xi var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	void as(Object var1, xi var2);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	Object ah(xi var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/Object;"
	)
	Object ag(xi var1, int var2);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	void ay(Object var1, xi var2);

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lno;Ljava/lang/Object;)Z"
	)
	static boolean cn(no var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.al((vw)var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;B)V"
	)
	void az(Object var1, xi var2, byte var3);
}
