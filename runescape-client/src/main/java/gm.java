import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gm")
public interface gm {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lov;"
	)
	ov ak(int var1, int var2) throws EOFException;

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZ)Z"
	)
	static boolean hg(sb var0, boolean var1, boolean var2, boolean var3) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az(var0.aw_fld, var1, var2, var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	ov ag(int var1) throws EOFException;
}
