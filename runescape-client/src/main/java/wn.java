import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wn")
public class wn {
	@ObfuscatedGetter(
		intValue = -1441812743
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld;
	@ObfuscatedGetter(
		intValue = -239181913
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld = 0;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ak_fld;

	public wn() {
		this.az_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[Ljava/lang/Object;III)V"
	)
	public static void ae(String[] var0, Object[] var1, int var2, int var3, int var4) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			Object var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var4 != 1669446353) {
					return;
				}

				if (var7 != null) {
					if (var4 != 1669446353) {
						return;
					}

					if (var0[var9] == null || var0[var9].compareTo(var7) >= (var9 & 1)) {
						continue;
					}
				}

				String var10 = var0[var9];
				var0[var9] = var0[var6];
				var0[var6] = var10;
				Object var11 = var1[var9];
				var1[var9] = var1[var6];
				var1[var6++] = var11;
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			ae(var0, (Object[])var1, var2, var6 - 1, 1669446353);
			ae(var0, (Object[])var1, var6 + 1, var3, 1669446353);
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lai;)Z"
	)
	public static boolean hr(ai var0) {
		return null == var0.ak_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([J)Lsl;"
	)
	public static sl ax(long[] var0) {
		sl var2 = new sl(yq.ag_fld, false);
		var2.ay_fld = var0;
		var2.av_fld = var0.length;
		var2.ae_fld = var0.length;
		return var2;
	}
}
