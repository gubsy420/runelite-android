import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ge")
public class ge {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1805943069
	)
	int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 934427455
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1087707119
	)
	int ag_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cc_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgt;"
	)
	public static gt[] ak(int var0) {
		return new gt[]{gt.ag_fld, gt.av_fld, gt.ak_fld, gt.az_fld};
	}

	ge(int var1, int var2, int var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lcc;"
	)
	static cc[] ak(byte var0) {
		return new cc[]{cc.ak_fld, cc.az_fld, cc.ae_fld, cc.av_fld, cc.ag_fld};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B"
	)
	static byte[] ag(String var0) {
		byte var2 = 48;
		byte var3 = 87;
		int var4 = kh.ik_fld.length();
		int var5 = 0;
		byte[] var6 = new byte[8];

		while (true) {
			int var7 = var5 + var4;
			if (var7 >= var0.length()) {
				return null;
			}

			char var8 = var0.charAt(var7);
			if (var8 == ':') {
				if (var5 == 0) {
					return null;
				}

				byte[] var9 = new byte[var5];
				System.arraycopy(var6, 0, var9, 0, var5);
				return var9;
			}

			if (var6.length == var5) {
				return null;
			}

			if (var8 >= '0' && var8 <= '9') {
				var8 = (char)(var8 - '0');
			} else {
				if (var8 < 'a' || var8 > 'z') {
					return null;
				}

				var8 = (char)(var8 - 'W');
			}

			var6[var5++] = (byte)var8;
		}
	}
}
