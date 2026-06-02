import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wc")
public abstract class wc {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int be_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILwu;)Z"
	)
	public static boolean ag(int var0, wu var1) {
		return (var0 & var1.ag(-1107763154)) != 0;
	}

	wc() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILwu;)Z"
	)
	public static boolean az(int var0, wu var1) {
		return (var0 & var1.ag(-336879893)) != 0;
	}
}
