import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jj")
public class jj {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bx_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] ap_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/lang/String;I)I"
	)
	public static int ak(xi var0, String var1) {
		int var3 = var0.au_fld;
		int var5 = var1.length();
		byte[] var6 = new byte[var5];

		for (int var7 = 0; var7 < var5; var7++) {
			char var8 = var1.charAt(var7);
			if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
				if (8364 == var8) {
					var6[var7] = -128;
				} else if (8218 == var8) {
					var6[var7] = -126;
				} else if (402 == var8) {
					var6[var7] = -125;
				} else if (8222 == var8) {
					var6[var7] = -124;
				} else if (var8 == 8230) {
					var6[var7] = -123;
				} else if (8224 == var8) {
					var6[var7] = -122;
				} else if (var8 == 8225) {
					var6[var7] = -121;
				} else if (var8 == 710) {
					var6[var7] = -120;
				} else if (8240 == var8) {
					var6[var7] = -119;
				} else if (352 == var8) {
					var6[var7] = -118;
				} else if (var8 == 8249) {
					var6[var7] = -117;
				} else if (338 == var8) {
					var6[var7] = -116;
				} else if (var8 == 381) {
					var6[var7] = -114;
				} else if (var8 == 8216) {
					var6[var7] = -111;
				} else if (var8 == 8217) {
					var6[var7] = -110;
				} else if (8220 == var8) {
					var6[var7] = -109;
				} else if (var8 == 8221) {
					var6[var7] = -108;
				} else if (var8 == 8226) {
					var6[var7] = -107;
				} else if (8211 == var8) {
					var6[var7] = -106;
				} else if (8212 == var8) {
					var6[var7] = -105;
				} else if (var8 == 732) {
					var6[var7] = -104;
				} else if (8482 == var8) {
					var6[var7] = -103;
				} else if (var8 == 353) {
					var6[var7] = -102;
				} else if (var8 == 8250) {
					var6[var7] = -101;
				} else if (339 == var8) {
					var6[var7] = -100;
				} else if (var8 == 382) {
					var6[var7] = -98;
				} else if (var8 == 376) {
					var6[var7] = -97;
				} else {
					var6[var7] = 63;
				}
			} else {
				var6[var7] = (byte)var8;
			}
		}

		var0.bw(var6.length);
		var0.au_fld = var0.au_fld + kq.uh(kd.ak_fld, var6, 0, var6.length, var0.al_fld, var0.au_fld, (byte)-117) * 228932457;
		return var0.au_fld - var3;
	}

	jj() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V"
	)
	static void ds(int var0, int var1, int var2, int var3, int var4) {
		sz.du(hk.mt_fld, var0, var1, var2, var3, var4, -2069517899);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Lyv;I)V"
	)
	static void ak(yv[] var0) {
		ch.as_fld = var0;
	}
}
