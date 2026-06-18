import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("or")
public class or {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static or ak_fld = new or();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static or ag_fld = new or();
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aq_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bk_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static or az_fld = new or();
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int dv_fld;

	or() {
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lwz;II)I"
	)
	public static int gk(wz var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var3 = 0; var3 < var0.ot_fld; var3++) {
			int var4 = 15 * (var0.ot_fld - 1 - var3) + var0.ax_fld + 14;
			if (var0.ak_fld) {
				var4 += 17;
			}

			if (var1 > var0.au_fld && var1 < var0.an_fld + var0.au_fld && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "(Lclient;)Z"
	)
	public static boolean uj(client var0) {
		return 1 == var0.qc_fld;
	}
}
