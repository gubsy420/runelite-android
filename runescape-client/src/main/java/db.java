import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("db")
public class db {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ag_fld = ",";
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 304996695
	)
	static int bg_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 867932261
	)
	static int aa_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String az_fld = "|";
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ae_fld = ")";
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String av_fld = " (";
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String aw_fld = "<br>";
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ay_fld = "</col>";
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bm_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ak_fld = "true";
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ah_fld = "->";
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public static String az(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public static String av(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "(Leg;SS)V"
	)
	public static void ym(eg var0, short var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var3 = 0; var3 < var0.au_fld; var3++) {
			if (var0.ao_fld[var3] == var1) {
				var0.ao_fld[var3] = var2;
			}
		}
	}

	db() throws Throwable {
		throw new Error();
	}
}
