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

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)Lhr;"
	)
	public static hr sx(wl var0) {
		if (var0.cs_fld == null) {
			return null;
		} else {
			while (var0.cs_fld.hasNext()) {
				hr var1 = (hr)(hr)var0.cs_fld.next();
				if (var1.ag(1491536057) != -1) {
					return var1;
				}
			}

			return null;
		}
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
