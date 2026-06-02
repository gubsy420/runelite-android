import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ye")
public class ye {
	@ObfuscatedGetter(
		intValue = -2045262503
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -126719159
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -716222557
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = 1769993935
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)J"
	)
	public static long gm(ba var0, int var1) {
		return var0.aw_fld[var1];
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		byte var1 = 10;
		int var2 = 10 - Integer.toString(this.ak_fld).length();
		int var3 = 10 - Integer.toString(this.az_fld).length();
		int var4 = 10 - Integer.toString(this.ag_fld).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.ak_fld + var5 + "Created: " + this.ag_fld + var7 + "Total used: " + this.az_fld + var6 + "Max-In-Use: " + this.av_fld;
	}

	ye() throws Throwable {
		throw new Error();
	}
}
