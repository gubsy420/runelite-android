import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wk")
public class wk {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -127556197
	)
	static int bf_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ak_fld;

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(Lgv;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int ti(gv var0, Object var1, Object var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak((gh)var1, (gh)var2, (byte)0);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laak;"
	)
	public static aak ag(Throwable var0, String var1) {
		aak var2;
		if (var0 instanceof aak) {
			var2 = (aak)var0;
		} else {
			var2 = new aak(var0, "");
		}

		if (!var1.endsWith("()")) {
			if (var2.ah_fld.length() != 0) {
				var2.ah_fld = var2.ah_fld + " ";
			}

			var2.ah_fld = var2.ah_fld + var1;
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void az() {
		px.ae_fld.av();
	}

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "(Lek;)[Lsi;"
	)
	public static si[] vc(ek var0) {
		return var0.ag_fld;
	}

	wk() throws Throwable {
		throw new Error();
	}
}
