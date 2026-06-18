import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pu")
public class pu extends vc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ak_fld = new iw(64);
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	static double ay_fld;

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Lga;IILhi;Lhg;[Lyc;)V"
	)
	public static void wf(ga var0, int var1, int var2, hi var3, hg var4, yc[] var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.ab(var1, var2, var3, -1141627905);
			var0.ao(var1, var2, var3, var5, 1299515695);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	pu() throws Throwable {
		throw new Error();
	}
}
