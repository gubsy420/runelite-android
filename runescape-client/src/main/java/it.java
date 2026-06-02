import java.lang.ref.SoftReference;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("it")
public class it extends ig {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/ref/SoftReference;"
	)
	SoftReference ak_fld;

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lda;Lbb;)V"
	)
	public static void bm(da var0, bb var1) {
		var0.cg_fld.ag(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	Object ae() {
		return this.ak_fld.get();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	Object ak() {
		return this.ak_fld.get();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean ag() {
		return true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	Object az() {
		return this.ak_fld.get();
	}

	it(Object var1, int var2) {
		super(var2);
		this.ak_fld = new SoftReference<>(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	Object av() {
		return this.ak_fld.get();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean ah() {
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean aw() {
		return true;
	}
}
