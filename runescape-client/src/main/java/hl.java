import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hl")
public class hl implements gm {
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int br_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int co_fld;

	hl() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lov;"
	)
	@Override
	public ov ak(int var1, int var2) throws EOFException {
		return kl.ag(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	@Override
	public ov ag(int var1) throws EOFException {
		return kl.ag(var1);
	}
}
