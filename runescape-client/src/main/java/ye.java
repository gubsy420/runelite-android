import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ye")
public class ye {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2045262503
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -126719159
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -716222557
	)
	int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1769993935
	)
	int av_fld;

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		byte var1 = 10;
		int var2 = 10 - Integer.toString(this.ak_fld).length();
		int var3 = 10 - Integer.toString(this.az_fld).length();
		int var4 = 10 - Integer.toString(this.ag_fld * -1326264172).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: "
			+ 1791962747 * this.ak_fld
			+ var5
			+ "Created: "
			+ -500721676 * this.ag_fld
			+ var7
			+ "Total used: "
			+ -369272981 * this.az_fld
			+ var6
			+ "Max-In-Use: "
			+ this.av_fld;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		byte var1 = 10;
		int var2 = 10 - Integer.toString(this.ak_fld).length();
		int var3 = 10 - Integer.toString(this.az_fld).length();
		int var4 = 10 - Integer.toString(this.ag_fld).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.ak_fld + var5 + "Created: " + this.ag_fld + var7 + "Total used: " + this.az_fld + var6 + "Max-In-Use: " + this.av_fld;
	}

	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "(Lye;)Ljava/lang/String;"
	)
	public static String zk(ye var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var1 = 10;
			int var2 = 10 - Integer.toString(var0.ak_fld).length();
			int var3 = 10 - Integer.toString(var0.az_fld).length();
			int var4 = 10 - Integer.toString(var0.ag_fld).length();
			String var5 = "          ".substring(10 - var2);
			String var6 = "          ".substring(10 - var3);
			String var7 = "          ".substring(10 - var4);
			return "    Size: " + var0.ak_fld + var5 + "Created: " + var0.ag_fld + var7 + "Total used: " + var0.az_fld + var6 + "Max-In-Use: " + var0.av_fld;
		}
	}

	ye() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)I"
	)
	public static int md(fn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ap();
		return var0.ck_fld;
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		byte var1 = 10;
		int var2 = 10 - Integer.toString(this.ag_fld * -716222557).length();
		int var3 = 10 - Integer.toString(this.az_fld).length();
		int var4 = 10 - Integer.toString(this.av_fld * -2045262503).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: "
			+ this.ak_fld
			+ var5
			+ "Created: "
			+ -2045262503 * this.ak_fld
			+ var7
			+ "Total used: "
			+ -126719159 * this.ag_fld
			+ var6
			+ "Max-In-Use: "
			+ this.ak_fld * 1769993935;
	}
}
