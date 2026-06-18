import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jz")
public class jz {
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -758044461
	)
	static int iw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bv_fld;

	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V"
	)
	public static void wu(gu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1 & 2047;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	static void ac(int var0) {
		if (bn.co_fld != var0) {
			bn.co_fld = var0;
		}
	}

	jz() throws Throwable {
		throw new Error();
	}
}
