import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nz")
public class nz {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub av_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ad_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Luu;II)V"
	)
	public static void co(uu var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		long var3 = var2 + (var1 << 16);
		ut var5 = (ut)var0.ai_fld.ak(var3);
		if (null != var5) {
			var0.aa_fld.ag(var5);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)[B"
	)
	public static byte[] ag(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = var0.charAt(var3);
			if (var4 > 1134002053) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)[B"
	)
	public static byte[] az(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	nz() throws Throwable {
		throw new Error();
	}
}
