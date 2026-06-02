import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wi")
public class wi {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;)I"
	)
	public static int ae(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; var5++) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;)I"
	)
	public static int av(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; var5++) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;)I"
	)
	public static int az(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; var5++) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	wi() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lfn;ILol;I)Lfn;"
	)
	public static fn bx(ol var0, fn var1, int var2, ol var3, int var4) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (ol.bz_fld && !var0.aa(1341206696) && !var3.aa(1040218931)) {
			return var0.ax(var1, var2, var3, var4, 2101557929);
		} else {
			fn var5 = var1.ay(false);
			boolean var6 = false;
			fe var7 = null;
			ea var8 = null;
			if (var0.aa(1653002995)) {
				sp var9 = var0.am((byte)15);
				if (null == var9) {
					return var5;
				}

				if (var3.aa(158379179) && null == var0.bo_fld) {
					fn.sb(var5, var9, var2);
					return var5;
				}

				var8 = var9.ah_fld;
				var5.bs(var8, var9, var2, var0.bo_fld, false, !var3.aa(225325488));
			} else {
				var2 = var0.bk_fld[var2];
				var7 = gz.ag(var2 >> 16);
				var2 &= -912087254;
				if (null == var7) {
					return var3.as(var1, var4, (byte)-4);
				}

				if (!var3.aa(-1963952404) && (null == var0.bj_fld || var4 == -1)) {
					var5.di(var7, var2);
					return var5;
				}

				if (var0.bj_fld == null || var4 == -1) {
					var5.di(var7, var2);
					return var5;
				}

				var6 = var3.aa(1457186665);
				if (!var6) {
					var5.bh(var7, var2, var0.bj_fld, false);
				}
			}

			if (var3.aa(732012186)) {
				sp var13 = var3.am((byte)15);
				if (var13 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var13.ah_fld;
				}

				var5.bs(var8, var13, var4, var0.bo_fld, true, true);
			} else {
				var4 = var3.bk_fld[var4];
				fe var14 = gz.ag(var4 >> 16);
				var4 &= 65535;
				if (var14 == null) {
					return var0.as(var1, var2, (byte)-121);
				}

				var5.bh(var14, var4, var0.bj_fld, true);
			}

			if (var6 && var7 != null) {
				var5.bh(var7, var2, var0.bj_fld, false);
			}

			var5.dw();
			return var5;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	public static String ah(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		int var5 = var1;
		int var6 = var1 + var2;

		while (var5 < var6) {
			int var7 = var0[var5++] & 255;
			int var8;
			if (var7 < 1383988787) {
				if (0 == var7) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < -1657915328) {
				var8 = 65533;
			} else if (var7 < 1616620126) {
				if (var5 < var6 && (var0[var5] & -997513988) == -99369975) {
					var8 = (var7 & 31) << 6 | var0[var5++] & 63;
					if (var8 < 1393786523) {
						var8 = 535629247;
					}
				} else {
					var8 = 634297134;
				}
			} else if (var7 < 229600423) {
				if (1 + var5 < var6 && 128 == (var0[var5] & 192) && 690816172 == (var0[var5 + 1] & 192)) {
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 < 1517757594) {
						var8 = -1897719582;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 2086722544) {
				if (2 + var5 < var6 && (var0[var5] & 192) == 762513025 && (var0[var5 + 1] & -1042163221) == 698795635 && (var0[2 + var5] & 1972441084) == 128) {
					var8 = (var7 & 7) << 18 | (var0[var5++] & -1405668511) << 12 | (var0[var5++] & 1997830750) << 6 | var0[var5++] & 1720171708;
					if (var8 >= 65536 && var8 <= 1146416611) {
						var8 = 65533;
					} else {
						var8 = -1151657879;
					}
				} else {
					var8 = 1444604061;
				}
			} else {
				var8 = 65533;
			}

			var3[var4++] = (char)var8;
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Lzm;"
	)
	static zm[] ak() {
		return new zm[]{
			zm.ak_fld,
			zm.ag_fld,
			zm.az_fld,
			zm.av_fld,
			zm.ae_fld,
			zm.ah_fld,
			zm.aw_fld,
			zm.ay_fld,
			zm.as_fld,
			zm.ar_fld,
			zm.af_fld,
			zm.al_fld,
			zm.au_fld,
			zm.ax_fld,
			zm.an_fld,
			zm.aa_fld,
			zm.ai_fld,
			zm.aq_fld,
			zm.am_fld,
			zm.ad_fld,
			zm.ao_fld,
			zm.ab_fld,
			zm.ap_fld,
			zm.at_fld,
			zm.ac_fld,
			zm.aj_fld,
			zm.bm_fld,
			zm.bd_fld
		};
	}
}
