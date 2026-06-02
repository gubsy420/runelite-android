import java.io.File;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dm")
public class dm implements Callable {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljava/io/File;"
	)
	static File ai_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub cx_fld;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv is_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ag() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	dm() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ak() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("call")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}
}
