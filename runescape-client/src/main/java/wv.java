import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wv")
public class wv {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	public wh av_fld;
	@ObfuscatedGetter(
		intValue = 193667497
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld;
	@ObfuscatedGetter(
		intValue = 1077344343
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld = 1301974169;
	@ObfuscatedGetter(
		intValue = 1259083063
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public kr ae_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	public static String ag(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;
		int var6 = var1;
		int var7 = var1 + var2;

		while (var6 < var7) {
			int var8 = var0[var6++] & 255;
			int var9;
			if (var8 < 128) {
				if (0 == var8) {
					var9 = 65533;
				} else {
					var9 = var8;
				}
			} else if (var8 < 192) {
				var9 = 65533;
			} else if (var8 < 224) {
				if (var6 < var7 && (var0[var6] & 192) == 128) {
					var9 = (var8 & 31) << 6 | var0[var6++] & 63;
					if (var9 < 128) {
						var9 = 65533;
					}
				} else {
					var9 = 65533;
				}
			} else if (var8 < 240) {
				if (1 + var6 < var7 && 128 == (var0[var6] & 192) && 128 == (var0[var6 + 1] & 192)) {
					var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
					if (var9 < 2048) {
						var9 = 65533;
					}
				} else {
					var9 = 65533;
				}
			} else if (var8 < 248) {
				if (2 + var6 < var7 && (var0[var6] & 192) == 128 && (var0[var6 + 1] & 192) == 128 && (var0[2 + var6] & 192) == 128) {
					var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
					if (var9 >= 65536 && var9 <= 1114111) {
						var9 = 65533;
					} else {
						var9 = 65533;
					}
				} else {
					var9 = 65533;
				}
			} else {
				var9 = 65533;
			}

			var4[var5++] = (char)var9;
		}

		return new String(var4, 0, var5);
	}

	public wv() {
		this.az_fld = 0;
		this.ak_fld = 0;
		this.av_fld = new wh();
		this.ae_fld = kr.az_fld;
	}
}
