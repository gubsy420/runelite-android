import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("iz")
public class iz {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	iz() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqm;Luo;)V"
	)
	public static void il(qh var0, qm var1, uo var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2.aa_fld != -1) {
			var0.ar(var2.aa_fld, var1, var2, -379261936);
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lml;III)V"
	)
	public static void gb(ml var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	static int ag(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
