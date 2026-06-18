import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tr")
public interface tr extends Iterable {
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lfn;IIB)Lfn;"
	)
	static fn sv(ol var0, fn var1, int var2, int var3, byte var4) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				return var0.jt(rl21.ao_fld, var1, var2, var3);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}
}
