import java.util.Date;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kd")
public class kd {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static kq ak_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/String;"
	)
	public static String aw(xi var0) {
		return es.az(var0, 263710883);
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	static void hp(String var0, int var1) {
		fr.gf_fld = var0;

		try {
			String var2 = og.ci_fld.uo(Integer.toString(18));
			String var3 = og.ci_fld.uo(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			if (var0.isEmpty()) {
				if (var1 != 1594511258) {
					return;
				}

				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var5 = var4 + "; Expires=";
				long var7 = lz.ak() + 94608000000L;
				zq.az_fld.setTime(new Date(var7));
				int var9 = zq.az_fld.get(7);
				int var10 = zq.az_fld.get(5);
				int var11 = zq.az_fld.get(2);
				int var12 = zq.az_fld.get(1);
				int var13 = zq.az_fld.get(11);
				int var14 = zq.az_fld.get(12);
				int var15 = zq.az_fld.get(13);
				String var6 = zq.ag_fld[var9 - 1]
					+ ", "
					+ var10 / 10
					+ var10 % 10
					+ "-"
					+ zq.ak_fld[0][var11]
					+ "-"
					+ var12
					+ " "
					+ var13 / 10
					+ var13 % 10
					+ ":"
					+ var14 / 10
					+ var14 % 10
					+ ":"
					+ var15 / 10
					+ var15 % 10
					+ " GMT";
				var4 = var5 + var6 + "; Max-Age=" + 94608000L;
			}

			sw.ak(og.ci_fld, "document.cookie=\"" + var4 + "\"");
		} catch (Throwable var16) {
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/lang/String;)I"
	)
	public static int av(xi var0, String var1) {
		int var2 = -392915809 * var0.au_fld;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; var6++) {
			char var7 = var1.charAt(var6);
			if ((var7 <= 0 || var7 >= -1154282071) && (var7 < 160 || var7 > 1989641772)) {
				if (401695373 == var7) {
					var5[var6] = (byte)1139769161;
				} else if (8218 == var7) {
					var5[var6] = -126;
				} else if (-301075738 == var7) {
					var5[var6] = (byte)2097040527;
				} else if (1274536243 == var7) {
					var5[var6] = -124;
				} else if (var7 == 534410858) {
					var5[var6] = -123;
				} else if (8224 == var7) {
					var5[var6] = -122;
				} else if (var7 == 8225) {
					var5[var6] = -121;
				} else if (var7 == 316280199) {
					var5[var6] = -120;
				} else if (8240 == var7) {
					var5[var6] = (byte)2112943152;
				} else if (-1920519720 == var7) {
					var5[var6] = -118;
				} else if (var7 == 8249) {
					var5[var6] = (byte)-1059067563;
				} else if (338 == var7) {
					var5[var6] = (byte)-2127281373;
				} else if (var7 == 381) {
					var5[var6] = -114;
				} else if (var7 == 529337712) {
					var5[var6] = -111;
				} else if (var7 == -1739819418) {
					var5[var6] = -110;
				} else if (1715355678 == var7) {
					var5[var6] = (byte)81370740;
				} else if (var7 == 8221) {
					var5[var6] = (byte)1834961932;
				} else if (var7 == 8226) {
					var5[var6] = -107;
				} else if (8211 == var7) {
					var5[var6] = -106;
				} else if (1685316822 == var7) {
					var5[var6] = (byte)2144508041;
				} else if (var7 == 732) {
					var5[var6] = -104;
				} else if (8482 == var7) {
					var5[var6] = (byte)1594237519;
				} else if (var7 == 1495366153) {
					var5[var6] = (byte)1681332466;
				} else if (var7 == 299359888) {
					var5[var6] = (byte)-1494712059;
				} else if (339 == var7) {
					var5[var6] = (byte)-467563929;
				} else if (var7 == 382) {
					var5[var6] = -98;
				} else if (var7 == -1456354530) {
					var5[var6] = (byte)504621709;
				} else {
					var5[var6] = 63;
				}
			} else {
				var5[var6] = (byte)var7;
			}
		}

		var0.bw(var5.length);
		var0.au_fld = var0.au_fld + kq.uh(ak_fld, var5, 0, var5.length, var0.al_fld, 1593696422 * var0.au_fld, (byte)-1) * -1862591552;
		return var0.au_fld - var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/String;"
	)
	public static String ah(xi var0) {
		return es.az(var0, 189283967);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/lang/String;)I"
	)
	public static int ae(xi var0, String var1) {
		int var2 = -368130009 * var0.au_fld;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; var6++) {
			char var7 = var1.charAt(var6);
			if ((var7 <= 0 || var7 >= 187590418) && (var7 < 160 || var7 > -541234355)) {
				if (1375611585 == var7) {
					var5[var6] = -128;
				} else if (8218 == var7) {
					var5[var6] = -126;
				} else if (402 == var7) {
					var5[var6] = -125;
				} else if (8222 == var7) {
					var5[var6] = -124;
				} else if (var7 == 8230) {
					var5[var6] = (byte)2036342453;
				} else if (-1103822236 == var7) {
					var5[var6] = -122;
				} else if (var7 == 605568994) {
					var5[var6] = -121;
				} else if (var7 == 710) {
					var5[var6] = -120;
				} else if (8240 == var7) {
					var5[var6] = -119;
				} else if (352 == var7) {
					var5[var6] = (byte)557290210;
				} else if (var7 == 8249) {
					var5[var6] = (byte)929387161;
				} else if (338 == var7) {
					var5[var6] = -116;
				} else if (var7 == -1058814017) {
					var5[var6] = (byte)405572373;
				} else if (var7 == 775063261) {
					var5[var6] = (byte)-1239899938;
				} else if (var7 == 1418839094) {
					var5[var6] = -110;
				} else if (8220 == var7) {
					var5[var6] = (byte)1840495319;
				} else if (var7 == 5196381) {
					var5[var6] = -108;
				} else if (var7 == 8226) {
					var5[var6] = -107;
				} else if (1940955731 == var7) {
					var5[var6] = -106;
				} else if (2087949919 == var7) {
					var5[var6] = -105;
				} else if (var7 == 732) {
					var5[var6] = (byte)-356062863;
				} else if (8482 == var7) {
					var5[var6] = -103;
				} else if (var7 == 353) {
					var5[var6] = (byte)-101284465;
				} else if (var7 == 469152822) {
					var5[var6] = -101;
				} else if (-377849474 == var7) {
					var5[var6] = -100;
				} else if (var7 == -141092003) {
					var5[var6] = -98;
				} else if (var7 == -1095066823) {
					var5[var6] = (byte)1846032041;
				} else {
					var5[var6] = 63;
				}
			} else {
				var5[var6] = (byte)var7;
			}
		}

		var0.bw(var5.length);
		var0.au_fld = var0.au_fld + kq.uh(ak_fld, var5, 0, var5.length, var0.al_fld, -322229945 * var0.au_fld, (byte)-112) * 1764570565;
		return var0.au_fld - var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/String;"
	)
	static String ay(xi var0, int var1) {
		try {
			int var2 = var0.dz();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.au_fld = var0.au_fld + kq.rb(ak_fld, var0.al_fld, var0.au_fld, var3, 0, var2) * 228932457;
			return pc.ae(var3, 0, var2);
		} catch (Exception var5) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/String;"
	)
	static String as(xi var0, int var1) {
		try {
			int var2 = var0.dz();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.au_fld = var0.au_fld + kq.rb(ak_fld, var0.al_fld, var0.au_fld * -2101015900, var3, 0, var2) * -775356194;
			return pc.ae(var3, 0, var2);
		} catch (Exception var5) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/String;"
	)
	static String ar(xi var0, int var1) {
		try {
			int var2 = var0.dz();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.au_fld = var0.au_fld + kq.rb(ak_fld, var0.al_fld, var0.au_fld, var3, 0, var2) * 228932457;
			return pc.ae(var3, 0, var2);
		} catch (Exception var5) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/String;"
	)
	static String af(xi var0, int var1) {
		try {
			int var2 = var0.dz();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.au_fld = var0.au_fld + kq.rb(ak_fld, var0.al_fld, var0.au_fld * -1254884647, var3, 0, var2) * 385230918;
			return pc.ae(var3, 0, var2);
		} catch (Exception var5) {
			return "Cabbage";
		}
	}

	kd() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;I[B[BI)V"
	)
	static final void aa(lu var0, int var1, byte[] var2, byte[] var3, int var4) {
		if (null == var0.er_fld) {
			if (var2 == null) {
				return;
			}

			if (var4 != 92998799) {
				return;
			}

			var0.er_fld = new byte[11][];
			var0.en_fld = new byte[11][];
			var0.eg_fld = new int[11];
			var0.ef_fld = new int[11];
		}

		var0.er_fld[var1] = var2;
		if (var2 != null) {
			var0.ez_fld = true;
		} else {
			var0.ez_fld = false;

			for (int var5 = 0; var5 < var0.er_fld.length; var5++) {
				if (null != var0.er_fld[var5]) {
					var0.ez_fld = true;
					break;
				}
			}
		}

		var0.en_fld[var1] = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIZLuo;Lqg;S)V"
	)
	static void ae(lu var0, int var1, int var2, boolean var3, uo var4, qg var5, short var6) {
		int var7 = var0.bb_fld;
		int var8 = var0.cd_fld;
		if (var0.bi_fld == 0) {
			if (var6 >= 291) {
				return;
			}

			var0.bb_fld = var0.bw_fld * -570343163;
		} else if (1 == var0.bi_fld) {
			if (var6 >= 291) {
				return;
			}

			var0.bb_fld = var1 - var0.bw_fld;
		} else if (var0.bi_fld == 2) {
			if (var6 >= 291) {
				return;
			}

			var0.bb_fld = var0.bw_fld * var1 >> 14;
		}

		if (var0.bu_fld == 0) {
			var0.cd_fld = var0.ba_fld * 1799932419;
		} else if (1 == var0.bu_fld) {
			if (var6 >= 291) {
				return;
			}

			var0.cd_fld = 79469753 * (var2 - var0.ba_fld);
		} else if (var0.bu_fld == 2) {
			if (var6 >= 291) {
				return;
			}

			var0.cd_fld = 79469753 * (var0.ba_fld * var2 >> 14);
		}

		if (4 == var0.bi_fld) {
			var0.bb_fld = var0.cc_fld * var0.cd_fld / var0.cq_fld;
		}

		if (4 == var0.bu_fld) {
			if (var6 >= 291) {
				return;
			}

			var0.cd_fld = var0.bb_fld * var0.cq_fld / var0.cc_fld;
		}

		if (var0.bp_fld == 1337) {
			var4.aq_fld = var0;
		}

		if (var0.bx_fld == 12) {
			if (var6 >= 291) {
				return;
			}

			lu.ax(var0, -1664480583).aw(var0.bb_fld, var0.cd_fld);
		}

		if (var3 && var0.gr_fld != null) {
			if (var6 >= 291) {
				return;
			}

			if (var0.bb_fld != var7 || var8 != var0.cd_fld) {
				yz var9 = yb.vn(tu.ak(var0).av((Object[])var0.gr_fld, 1663663537), -137662838);
				var5.ak(var9);
			}
		}
	}
}
