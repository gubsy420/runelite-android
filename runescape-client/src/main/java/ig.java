import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ig")
public abstract class ig extends vc {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	abstract Object az();

	ig(int var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	abstract boolean ag();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	abstract boolean ah();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	abstract Object av();

	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "(Lfz;)Z"
	)
	public static boolean zk(fz var0) {
		return var0.ag_fld >= 128;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	abstract Object ae();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	abstract Object ak();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	abstract boolean aw();
}
