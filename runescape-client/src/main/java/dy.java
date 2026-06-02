import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dy")
class dy implements kk {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bu_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cj_fld;
	// $VF: synthetic field
	@ObfuscatedName("val$item")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu val$item;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cd_fld;
	@ObfuscatedGetter(
		intValue = 585749103
	)
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void av() {
		if (this.val$item.bn((byte)-42).ah_fld != null) {
			yz var1 = tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)-46).ah_fld, 1792998551).ax(883809753);
			client.cz_fld.ak(var1);
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)Lhr;"
	)
	public static hr ft(wl var0) {
		if (var0.cs_fld == null) {
			return null;
		} else {
			while (var0.cs_fld.hasNext()) {
				hr var1 = (hr)(hr)var0.cs_fld.next();
				if (var1.ag(-561698242) != -1) {
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void ak(int var1) {
		if (this.val$item.bn((byte)-95).ah_fld != null) {
			yz var2 = tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)-46).ah_fld, 1385244206).ax(-1495180622);
			client.cz_fld.ak(var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([B)Z"
	)
	static boolean ar(byte[] var0) throws EOFException {
		return kq.af(var0, 0, 0, 63, 63);
	}

	dy(lu var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ag() {
		if (this.val$item.bn((byte)-5).ah_fld != null) {
			yz var1 = tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)-29).ah_fld, 1051424257).ax(-1998785509);
			client.cz_fld.ak(var1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ae() {
		if (this.val$item.bn((byte)-113).ah_fld != null) {
			yz var1 = tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)-2).ah_fld, 2003324141).ax(-541514239);
			client.cz_fld.ak(var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BI)I"
	)
	public static int av(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var6 = var2 - var1;

		for (int var7 = 0; var7 < var6; var7++) {
			char var8 = var0.charAt(var1 + var7);
			if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
				if (var8 == 8364) {
					var3[var7 + var4] = -128;
				} else if (8218 == var8) {
					var3[var7 + var4] = -126;
				} else if (402 == var8) {
					var3[var4 + var7] = -125;
				} else if (var8 == 8222) {
					var3[var4 + var7] = -124;
				} else if (var8 == 8230) {
					var3[var7 + var4] = -123;
				} else if (var8 == 8224) {
					var3[var4 + var7] = -122;
				} else if (8225 == var8) {
					var3[var7 + var4] = -121;
				} else if (710 == var8) {
					var3[var7 + var4] = -120;
				} else if (var8 == 8240) {
					var3[var4 + var7] = -119;
				} else if (352 == var8) {
					var3[var7 + var4] = -118;
				} else if (8249 == var8) {
					var3[var4 + var7] = -117;
				} else if (var8 == 338) {
					var3[var7 + var4] = -116;
				} else if (var8 == 381) {
					var3[var7 + var4] = -114;
				} else if (8216 == var8) {
					var3[var4 + var7] = -111;
				} else if (8217 == var8) {
					var3[var4 + var7] = -110;
				} else if (8220 == var8) {
					var3[var4 + var7] = -109;
				} else if (var8 == 8221) {
					var3[var7 + var4] = -108;
				} else if (8226 == var8) {
					var3[var4 + var7] = -107;
				} else if (var8 == 8211) {
					var3[var7 + var4] = -106;
				} else if (var8 == 8212) {
					var3[var7 + var4] = -105;
				} else if (732 == var8) {
					var3[var4 + var7] = -104;
				} else if (8482 == var8) {
					var3[var4 + var7] = -103;
				} else if (353 == var8) {
					var3[var4 + var7] = -102;
				} else if (8250 == var8) {
					var3[var4 + var7] = -101;
				} else if (var8 == 339) {
					var3[var7 + var4] = -100;
				} else if (382 == var8) {
					var3[var4 + var7] = -98;
				} else if (var8 == 376) {
					var3[var7 + var4] = -97;
				} else {
					var3[var4 + var7] = 63;
				}
			} else {
				var3[var7 + var4] = (byte)var8;
			}
		}

		return var6;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	static String ag(byte[] var0, int var1, int var2) {
		StringBuilder var4 = new StringBuilder();

		for (int var5 = var1; var5 < var2 + var1; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(ng.ak_fld[var6 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[1 + var5] & 255;
				var4.append(ng.ak_fld[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(ng.ak_fld[(var7 & 15) << 2 | var8 >>> 6]).append(ng.ak_fld[var8 & 63]);
				} else {
					var4.append(ng.ak_fld[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(ng.ak_fld[(var6 & 3) << 4]).append("==");
			}
		}

		return var4.toString();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void az() {
		if (this.val$item.bn((byte)-74).ah_fld != null) {
			yz var1 = tu.ak(this.val$item).av((Object[])this.val$item.bn((byte)3).ah_fld, 2039099572).ax(-373727828);
			client.cz_fld.ak(var1);
		}
	}
}
