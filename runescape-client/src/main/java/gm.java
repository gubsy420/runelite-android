import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gm")
public interface gm {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lgq;)V"
	)
	static void kf(gq var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lov;"
	)
	ov ak(int var1, int var2) throws EOFException;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	ov ag(int var1) throws EOFException;
}
