import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aal")
public class aal {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public static long ak_fld;

	@ObfuscatedName("zx")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Z)V"
	)
	public static void zx(cn var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Lga;Ljava/util/HashSet;II)V"
	)
	public static void dy(ga var0, HashSet var1, int var2, int var3) throws EOFException {
		Iterator var4 = var0.au_fld.iterator();

		while (var4.hasNext()) {
			hr var5 = (hr)(hr)var4.next();
			if (var5.aq((byte)90)) {
				pc var6 = uh.ak(var5.ag(1510069897));
				if (var6 != null && var1.contains(var6.aw(1652090226))) {
					ga.lk(var0, var6, var5.ar_fld * 416995729, var5.as_fld * 1662649233, var2, var3, -1400962089);
				}
			}
		}
	}

	aal() throws Throwable {
		throw new Error();
	}
}
