import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("om")
public class om extends vc {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2027027811
	)
	static int cl_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ak_fld = new iw(64);
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bp_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bt_fld;

	om() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lyq;ZB)V"
	)
	static void ap(sl var0, yq var1, boolean var2, byte var3) {
		if (null == var0) {
			throw new RuntimeException();
		} else {
			if (null != var1) {
				if (var3 != 0) {
					return;
				}

				if (var0.ag_fld != var1) {
					throw new RuntimeException();
				}
			}

			if (var2 && !var0.az_fld) {
				throw new RuntimeException();
			}
		}
	}
}
