import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jr")
public class jr {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bb_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static rb fa_fld;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)Lsl;"
	)
	public static sl ai(String var0, String var1) {
		if (null != var1 && !var1.isEmpty()) {
			int var3 = var1.length();
			int var4 = 1;
			int var5 = 0;

			while ((var5 = var0.indexOf(var1, var5)) != -1) {
				var4++;
				var5 += var3;
			}

			sl var6 = new sl(yq.az_fld, null, var4, var4);
			int var7 = 0;
			var5 = 0;

			for (var4 = 0; (var5 = var0.indexOf(var1, var5)) != -1; var7 = var5) {
				var6.az()[var4++] = var0.substring(var7, var5);
				var5 += var3;
			}

			var6.az()[var4] = var0.substring(var7);
			return var6;
		} else {
			throw new RuntimeException();
		}
	}

	jr() throws Throwable {
		throw new Error();
	}
}
