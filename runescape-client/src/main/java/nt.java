import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nt")
public class nt {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bs_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	public static char[] ak_fld = new char[]{
		'€',
		'\u0000',
		'‚',
		'ƒ',
		'„',
		'…',
		'†',
		'‡',
		'ˆ',
		'‰',
		'Š',
		'‹',
		'Œ',
		'\u0000',
		'Ž',
		'\u0000',
		'\u0000',
		'‘',
		'’',
		'“',
		'”',
		'•',
		'–',
		'—',
		'˜',
		'™',
		'š',
		'›',
		'œ',
		'\u0000',
		'ž',
		'Ÿ'
	};

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BI)I"
	)
	public static int an(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; var6++) {
			char var7 = var0.charAt(var1 + var6);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var3[var6 + var4] = -128;
				} else if (8218 == var7) {
					var3[var6 + var4] = -126;
				} else if (402 == var7) {
					var3[var4 + var6] = -125;
				} else if (var7 == 8222) {
					var3[var4 + var6] = -124;
				} else if (var7 == 8230) {
					var3[var6 + var4] = -123;
				} else if (var7 == 8224) {
					var3[var4 + var6] = -122;
				} else if (8225 == var7) {
					var3[var6 + var4] = -121;
				} else if (710 == var7) {
					var3[var6 + var4] = -120;
				} else if (var7 == 8240) {
					var3[var4 + var6] = -119;
				} else if (352 == var7) {
					var3[var6 + var4] = -118;
				} else if (8249 == var7) {
					var3[var4 + var6] = -117;
				} else if (var7 == 338) {
					var3[var6 + var4] = -116;
				} else if (var7 == 381) {
					var3[var6 + var4] = -114;
				} else if (8216 == var7) {
					var3[var4 + var6] = -111;
				} else if (8217 == var7) {
					var3[var4 + var6] = -110;
				} else if (8220 == var7) {
					var3[var4 + var6] = -109;
				} else if (var7 == 8221) {
					var3[var6 + var4] = -108;
				} else if (8226 == var7) {
					var3[var4 + var6] = -107;
				} else if (var7 == 8211) {
					var3[var6 + var4] = -106;
				} else if (var7 == 8212) {
					var3[var6 + var4] = -105;
				} else if (732 == var7) {
					var3[var4 + var6] = -104;
				} else if (8482 == var7) {
					var3[var4 + var6] = -103;
				} else if (353 == var7) {
					var3[var4 + var6] = -102;
				} else if (8250 == var7) {
					var3[var4 + var6] = -101;
				} else if (var7 == 339) {
					var3[var6 + var4] = -100;
				} else if (382 == var7) {
					var3[var4 + var6] = -98;
				} else if (var7 == 376) {
					var3[var6 + var4] = -97;
				} else {
					var3[var4 + var6] = 63;
				}
			} else {
				var3[var6 + var4] = (byte)var7;
			}
		}

		return var5;
	}

	@ObfuscatedName("ze")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;)V"
	)
	public static void ze(di var0, xj var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			di.lk(var0, 1442419582);
			var1.ap(-1765525869);
			int var2 = client.dj_fld * -1593647060;
			cl var3 = var0.av_fld[var2];
			int var4 = var1.ar(30, -106081977);
			var3.ag(-1);
			kj.am(var3.az_fld, var4);
			var3.av_fld = 0;
			var0.al_fld = 0;
			var0.az_fld[(var0.al_fld += 1227014965) * -1482869773 - 1] = var2;
			var0.au_fld = 0;

			for (int var5 = 1; var5 < 2048; var5++) {
				if (var5 != var2) {
					int var6 = var1.ar(18, -106081977);
					int var7 = var6 >> 16;
					int var8 = var6 >> 8 & -1813100345;
					int var9 = var6 & -252866092;
					var0.av_fld[var5].ag(kj.ak(var7, var8, var9));
					var0.as_fld[(var0.au_fld += -260300649) * 1540972327 - 1] = var5;
				}
			}

			var1.as(366283578);
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V"
	)
	static void fc(int var0, int var1, int var2, int var3, String var4, int var5) throws EOFException {
		int var6 = var0 >>> 16;
		int var7 = var0 & 65535;
		lu var8 = cf.cg_fld.ag(var1, var2, 429680137);
		if (null != var8) {
			if (var8.ft_fld != null) {
				yz var9 = yb.jo(tu.ak(var8).av((Object[])var8.ft_fld, 2125813735).au(var7, -1509689627).ae(var6, -1135016894), var4, 2076456789).ax(-554383950);
				va.ak(var9);
			}

			boolean var11 = true;
			if (var8.bp_fld > 0) {
				var11 = gd.gm(var8);
			}

			if (var11) {
				if (bh.ak(cf.cg_fld.at(var8), var7 - 1, 2062040542)) {
					if (var6 == 0) {
						if (var5 >= -789304717) {
							return;
						}

						jm var10 = gi.ak(jb.dx_fld, client.aq_fld.av_fld);
						xi.ld(var10.ay_fld, var1, (byte)107);
						var10.ay_fld.bw(var2);
						var10.ay_fld.bw(var3);
						var10.ay_fld.bc(var7);
						client.aq_fld.az(var10);
					} else {
						jm var12 = gi.ak(jb.dy_fld, client.aq_fld.av_fld);
						xi.ld(var12.ay_fld, var1, (byte)105);
						var12.ay_fld.bw(var2);
						var12.ay_fld.bw(var3);
						var12.ay_fld.bc(var7);
						var12.ay_fld.bc(var6 - 1);
						client.aq_fld.az(var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(C)B"
	)
	public static byte ah(char var0) {
		int var1;
		if ((var0 <= 0 || var0 >= -621485064) && (var0 < -409054861 || var0 > 255)) {
			if (8364 == var0) {
				var1 = 1415901959;
			} else if (var0 == 8218) {
				var1 = 1223913525;
			} else if (var0 == 402) {
				var1 = -42289688;
			} else if (1343887049 == var0) {
				var1 = -124;
			} else if (var0 == 8230) {
				var1 = -123;
			} else if (var0 == -1685461937) {
				var1 = -880645949;
			} else if (-33428597 == var0) {
				var1 = -121;
			} else if (var0 == 1953535196) {
				var1 = -120;
			} else if (var0 == 8240) {
				var1 = -943146370;
			} else if (-1771203791 == var0) {
				var1 = -1127895204;
			} else if (295665621 == var0) {
				var1 = -117;
			} else if (1458939608 == var0) {
				var1 = -957402362;
			} else if (var0 == 381) {
				var1 = -1857891891;
			} else if (-1150443898 == var0) {
				var1 = -111;
			} else if (var0 == 1850088000) {
				var1 = -360161308;
			} else if (var0 == 8220) {
				var1 = -644781726;
			} else if (var0 == 8221) {
				var1 = 1112657571;
			} else if (var0 == -463119834) {
				var1 = -1300393245;
			} else if (8211 == var0) {
				var1 = 1384739881;
			} else if (877117645 == var0) {
				var1 = 1077409152;
			} else if (732 == var0) {
				var1 = -104;
			} else if (8482 == var0) {
				var1 = -103;
			} else if (353 == var0) {
				var1 = 1546052476;
			} else if (446697816 == var0) {
				var1 = -101;
			} else if (-1239063321 == var0) {
				var1 = -635364499;
			} else if (382 == var0) {
				var1 = -98;
			} else if (var0 == 376) {
				var1 = -97;
			} else {
				var1 = 63;
			}
		} else {
			var1 = (byte)var0;
		}

		return (byte)var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(C)B"
	)
	public static byte aw(char var0) {
		byte var1;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (8364 == var0) {
				var1 = -128;
			} else if (var0 == 8218) {
				var1 = -126;
			} else if (var0 == 402) {
				var1 = -125;
			} else if (8222 == var0) {
				var1 = -124;
			} else if (var0 == 8230) {
				var1 = -123;
			} else if (var0 == 8224) {
				var1 = -122;
			} else if (8225 == var0) {
				var1 = -121;
			} else if (var0 == 710) {
				var1 = -120;
			} else if (var0 == 8240) {
				var1 = -119;
			} else if (352 == var0) {
				var1 = -118;
			} else if (8249 == var0) {
				var1 = -117;
			} else if (338 == var0) {
				var1 = -116;
			} else if (var0 == 381) {
				var1 = -114;
			} else if (8216 == var0) {
				var1 = -111;
			} else if (var0 == 8217) {
				var1 = -110;
			} else if (var0 == 8220) {
				var1 = -109;
			} else if (var0 == 8221) {
				var1 = -108;
			} else if (var0 == 8226) {
				var1 = -107;
			} else if (8211 == var0) {
				var1 = -106;
			} else if (8212 == var0) {
				var1 = -105;
			} else if (732 == var0) {
				var1 = -104;
			} else if (8482 == var0) {
				var1 = -103;
			} else if (353 == var0) {
				var1 = -102;
			} else if (8250 == var0) {
				var1 = -101;
			} else if (339 == var0) {
				var1 = -100;
			} else if (382 == var0) {
				var1 = -98;
			} else if (var0 == 376) {
				var1 = -97;
			} else {
				var1 = 63;
			}
		} else {
			var1 = (byte)var0;
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean as(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = ak_fld;

				for (int var2 = 0; var2 < var1.length; var2++) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(C)C"
	)
	static char ar(char var0) {
		return var0 != 181 && 402 != var0 ? Character.toTitleCase(var0) : var0;
	}

	nt() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(C)C"
	)
	static char af(char var0) {
		return var0 != 181 && 402 != var0 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	public static String ai(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; var5++) {
			int var6 = var0[var5 + var1] & 255;
			if (0 != var6) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = ak_fld[var6 - 128];
					if (0 == var7) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BI)I"
	)
	public static int ax(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; var6++) {
			char var7 = var0.charAt(var1 + var6);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var3[var6 + var4] = -128;
				} else if (8218 == var7) {
					var3[var6 + var4] = -126;
				} else if (402 == var7) {
					var3[var4 + var6] = -125;
				} else if (var7 == 8222) {
					var3[var4 + var6] = -124;
				} else if (var7 == 8230) {
					var3[var6 + var4] = -123;
				} else if (var7 == 8224) {
					var3[var4 + var6] = -122;
				} else if (8225 == var7) {
					var3[var6 + var4] = -121;
				} else if (710 == var7) {
					var3[var6 + var4] = -120;
				} else if (var7 == 8240) {
					var3[var4 + var6] = -119;
				} else if (352 == var7) {
					var3[var6 + var4] = -118;
				} else if (8249 == var7) {
					var3[var4 + var6] = -117;
				} else if (var7 == 338) {
					var3[var6 + var4] = -116;
				} else if (var7 == 381) {
					var3[var6 + var4] = -114;
				} else if (8216 == var7) {
					var3[var4 + var6] = -111;
				} else if (8217 == var7) {
					var3[var4 + var6] = -110;
				} else if (8220 == var7) {
					var3[var4 + var6] = -109;
				} else if (var7 == 8221) {
					var3[var6 + var4] = -108;
				} else if (8226 == var7) {
					var3[var4 + var6] = -107;
				} else if (var7 == 8211) {
					var3[var6 + var4] = -106;
				} else if (var7 == 8212) {
					var3[var6 + var4] = -105;
				} else if (732 == var7) {
					var3[var4 + var6] = -104;
				} else if (8482 == var7) {
					var3[var4 + var6] = -103;
				} else if (353 == var7) {
					var3[var4 + var6] = -102;
				} else if (8250 == var7) {
					var3[var4 + var6] = -101;
				} else if (var7 == 339) {
					var3[var6 + var4] = -100;
				} else if (382 == var7) {
					var3[var4 + var6] = -98;
				} else if (var7 == 376) {
					var3[var6 + var4] = -97;
				} else {
					var3[var4 + var6] = 63;
				}
			} else {
				var3[var6 + var4] = (byte)var7;
			}
		}

		return var5;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean ay(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= -1571791550 || var0 >= 160) && (var0 <= 1688847200 || var0 > -1973918005)) {
			if (var0 != 0) {
				char[] var1 = ak_fld;

				for (int var2 = 0; var2 < var1.length; var2++) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BI)I"
	)
	public static int aa(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; var6++) {
			char var7 = var0.charAt(var1 + var6);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var3[var6 + var4] = -128;
				} else if (8218 == var7) {
					var3[var6 + var4] = -126;
				} else if (402 == var7) {
					var3[var4 + var6] = -125;
				} else if (var7 == 8222) {
					var3[var4 + var6] = -124;
				} else if (var7 == 8230) {
					var3[var6 + var4] = -123;
				} else if (var7 == 8224) {
					var3[var4 + var6] = -122;
				} else if (8225 == var7) {
					var3[var6 + var4] = -121;
				} else if (710 == var7) {
					var3[var6 + var4] = -120;
				} else if (var7 == 8240) {
					var3[var4 + var6] = -119;
				} else if (352 == var7) {
					var3[var6 + var4] = -118;
				} else if (8249 == var7) {
					var3[var4 + var6] = -117;
				} else if (var7 == 338) {
					var3[var6 + var4] = -116;
				} else if (var7 == 381) {
					var3[var6 + var4] = -114;
				} else if (8216 == var7) {
					var3[var4 + var6] = -111;
				} else if (8217 == var7) {
					var3[var4 + var6] = -110;
				} else if (8220 == var7) {
					var3[var4 + var6] = -109;
				} else if (var7 == 8221) {
					var3[var6 + var4] = -108;
				} else if (8226 == var7) {
					var3[var4 + var6] = -107;
				} else if (var7 == 8211) {
					var3[var6 + var4] = -106;
				} else if (var7 == 8212) {
					var3[var6 + var4] = -105;
				} else if (732 == var7) {
					var3[var4 + var6] = -104;
				} else if (8482 == var7) {
					var3[var4 + var6] = -103;
				} else if (353 == var7) {
					var3[var4 + var6] = -102;
				} else if (8250 == var7) {
					var3[var4 + var6] = -101;
				} else if (var7 == 339) {
					var3[var6 + var4] = -100;
				} else if (382 == var7) {
					var3[var4 + var6] = -98;
				} else if (var7 == 376) {
					var3[var6 + var4] = -97;
				} else {
					var3[var4 + var6] = 63;
				}
			} else {
				var3[var6 + var4] = (byte)var7;
			}
		}

		return var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BI)I"
	)
	public static int au(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; var6++) {
			char var7 = var0.charAt(var1 + var6);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var3[var6 + var4] = -128;
				} else if (8218 == var7) {
					var3[var6 + var4] = -126;
				} else if (402 == var7) {
					var3[var4 + var6] = -125;
				} else if (var7 == 8222) {
					var3[var4 + var6] = -124;
				} else if (var7 == 8230) {
					var3[var6 + var4] = -123;
				} else if (var7 == 8224) {
					var3[var4 + var6] = -122;
				} else if (8225 == var7) {
					var3[var6 + var4] = -121;
				} else if (710 == var7) {
					var3[var6 + var4] = -120;
				} else if (var7 == 8240) {
					var3[var4 + var6] = -119;
				} else if (352 == var7) {
					var3[var6 + var4] = -118;
				} else if (8249 == var7) {
					var3[var4 + var6] = -117;
				} else if (var7 == 338) {
					var3[var6 + var4] = -116;
				} else if (var7 == 381) {
					var3[var6 + var4] = -114;
				} else if (8216 == var7) {
					var3[var4 + var6] = -111;
				} else if (8217 == var7) {
					var3[var4 + var6] = -110;
				} else if (8220 == var7) {
					var3[var4 + var6] = -109;
				} else if (var7 == 8221) {
					var3[var6 + var4] = -108;
				} else if (8226 == var7) {
					var3[var4 + var6] = -107;
				} else if (var7 == 8211) {
					var3[var6 + var4] = -106;
				} else if (var7 == 8212) {
					var3[var6 + var4] = -105;
				} else if (732 == var7) {
					var3[var4 + var6] = -104;
				} else if (8482 == var7) {
					var3[var4 + var6] = -103;
				} else if (353 == var7) {
					var3[var4 + var6] = -102;
				} else if (8250 == var7) {
					var3[var4 + var6] = -101;
				} else if (var7 == 339) {
					var3[var6 + var4] = -100;
				} else if (382 == var7) {
					var3[var4 + var6] = -98;
				} else if (var7 == 376) {
					var3[var6 + var4] = -97;
				} else {
					var3[var4 + var6] = 63;
				}
			} else {
				var3[var6 + var4] = (byte)var7;
			}
		}

		return var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	public static String aq(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; var5++) {
			int var6 = var0[var5 + var1] & 255;
			if (0 != var6) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = ak_fld[var6 - 128];
					if (0 == var7) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ag(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(C)C"
	)
	static char al(char var0) {
		return var0 != 181 && 402 != var0 ? Character.toTitleCase(var0) : var0;
	}
}
