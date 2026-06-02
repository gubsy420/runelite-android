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
	@ObfuscatedGetter(
		intValue = -2027027811
	)
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean kv(ev var0, int var1, int var2, int var3, int var4) {
		return ev.aq(var0, var0.ed_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lsb;IZZZ)Z"
	)
	public static boolean bl(sb var0, int var1, boolean var2, boolean var3, boolean var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var5 = 0;
			int var6 = var5 | (var3 ? 1 : 0);
			var6 |= var2 ? 8 : 32;
			var6 |= var4 ? 128 : 0;
			return (var1 & var6) != 0;
		}
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
