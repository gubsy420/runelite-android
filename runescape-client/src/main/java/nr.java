import java.util.Arrays;
import java.util.regex.Pattern;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nr")
@zn
public class nr {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bz_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean bi(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Z"
	)
	public static boolean ap(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label90: {
				char var7 = var0.charAt(var6);
				if (0 == var6) {
					if (var7 == '-') {
						var2 = true;
						break label90;
					}

					if (var7 == '+') {
						break label90;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var9 + 10 * var4;
				if (var8 / 10 != var4) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			var6++;
		}

		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;"
	)
	public static String am(Object[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var8 = (CharSequence)var0[var1];
			return null == var8 ? "null" : var8.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; var5++) {
				CharSequence var6 = (CharSequence)var0[var5];
				if (null == var6) {
					var4 += 4;
				} else {
					var4 += var6.length();
				}
			}

			StringBuilder var9 = new StringBuilder(var4);

			for (int var10 = var1; var10 < var3; var10++) {
				CharSequence var7 = (CharSequence)var0[var10];
				if (null == var7) {
					var9.append("null");
				} else {
					var9.append(var7);
				}
			}

			return var9.toString();
		}
	}

	nr() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)I"
	)
	public static int bo(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			var2 = (var2 << 5) - var2 + vj.ak(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Z"
	)
	public static boolean ab(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label88: {
				char var7 = var0.charAt(var6);
				if (0 == var6) {
					if (var7 == 1204562655) {
						var2 = true;
						break label88;
					}

					if (var7 == 1771902989) {
						break label88;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 581883087 && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 7206005 || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var9 + 10 * var4;
				if (var8 / 10 != var4) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			var6++;
		}

		return var1;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int cv(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Z"
	)
	public static boolean at(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		long var4 = 0L;
		int var6 = var0.length();
		int var7 = 0;

		boolean var1;
		while (true) {
			if (var7 >= var6) {
				var1 = var3;
				break;
			}

			label91: {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if ('-' == var8) {
						var2 = true;
						break label91;
					}

					if (var8 == '+') {
						break label91;
					}
				}

				int var11;
				if (var8 >= '0' && var8 <= '9') {
					var11 = var8 - '0';
				} else if (var8 >= 1184719927 && var8 <= 487220076) {
					var11 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > -1647605008) {
						var1 = false;
						break;
					}

					var11 = var8 - 'W';
				}

				if (var11 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var11 = -var11;
				}

				long var9 = 10L * var4 + var11;
				if (var9 / 10L != var4) {
					var1 = false;
					break;
				}

				var4 = var9;
				var3 = true;
			}

			var7++;
		}

		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;"
	)
	public static String ad(Object[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var8 = (CharSequence)var0[var1];
			return null == var8 ? "null" : var8.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; var5++) {
				CharSequence var6 = (CharSequence)var0[var5];
				if (null == var6) {
					var4 += 4;
				} else {
					var4 += var6.length();
				}
			}

			StringBuilder var9 = new StringBuilder(var4);

			for (int var10 = var1; var10 < var3; var10++) {
				CharSequence var7 = (CharSequence)var0[var10];
				if (null == var7) {
					var9.append("null");
				} else {
					var9.append(var7);
				}
			}

			return var9.toString();
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I"
	)
	public static int be(CharSequence var0, int var1) {
		return jt.ah(var0, var1, true);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)I"
	)
	public static int bm(CharSequence var0) {
		return jt.ah(var0, 10, true);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)I"
	)
	public static int bd(CharSequence var0) {
		return jt.ah(var0, 10, true);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)I"
	)
	public static int bz(CharSequence var0) {
		return jt.ah(var0, 10, true);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I"
	)
	public static int br(CharSequence var0, int var1) {
		return jt.ah(var0, var1, true);
	}

	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I"
	)
	public static int bs(CharSequence var0, int var1) {
		return jt.ah(var0, var1, true);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZ)I"
	)
	static int bh(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 161440498) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; var7++) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if ('-' == var8) {
						var3 = true;
						continue;
					}

					if (var8 == 614890562 && var2) {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= -1447630966) {
					var10 = var8 - '0';
				} else if (var8 >= 1055611155 && var8 <= -1321247584) {
					var10 = var8 - '7';
				} else {
					if (var8 < -243281144 || var8 > -573327096) {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var5 != var9 / var1) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Z"
	)
	public static boolean aj(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		long var4 = 0L;
		int var6 = var0.length();
		int var7 = 0;

		boolean var1;
		while (true) {
			if (var7 >= var6) {
				var1 = var3;
				break;
			}

			label91: {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if ('-' == var8) {
						var2 = true;
						break label91;
					}

					if (var8 == '+') {
						break label91;
					}
				}

				int var11;
				if (var8 >= '0' && var8 <= '9') {
					var11 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var11 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						var1 = false;
						break;
					}

					var11 = var8 - 'W';
				}

				if (var11 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var11 = -var11;
				}

				long var9 = 10L * var4 + var11;
				if (var9 / 10L != var4) {
					var1 = false;
					break;
				}

				var4 = var9;
				var3 = true;
			}

			var7++;
		}

		return var1;
	}

	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "(Lwz;II)Z"
	)
	public static boolean vi(wz var0, int var1, int var2) {
		if (var0.ai_fld != -1 && var0.af_fld[var0.ai_fld] != null && var0.af_fld[var0.ai_fld].aw(var1, var2, (byte)-10)) {
			return true;
		} else if (var1 >= var0.au_fld - 10 && var1 <= 10 + var0.an_fld + var0.au_fld && var2 >= var0.ax_fld - 10 && var2 <= var0.aa_fld + var0.ax_fld + 10) {
			int var3 = var0.ae(var1, var2, (byte)-119);
			if (-1 != var3 && var3 != var0.ai_fld) {
				if (var3 != var0.aq_fld) {
					var0.aq_fld = var3;
					var0.am_fld = lz.ak();
					if (var0.ai_fld != -1) {
						var0.am_fld += 300L;
					}
				}

				if (var0.am_fld <= lz.ak()) {
					var0.aq_fld = 1715384015;
					var0.af((short)1453);
					if (null != var0.af_fld[var3]) {
						var0.ai_fld = var3;
						wz.cf(var0.af_fld[var3], var0, (byte)49);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)J"
	)
	public static long bj(CharSequence var0) {
		boolean var3 = false;
		boolean var4 = false;
		long var5 = 0L;
		int var7 = var0.length();

		for (int var8 = 0; var8 < var7; var8++) {
			char var9 = var0.charAt(var8);
			if (var8 == 0) {
				if ('-' == var9) {
					var3 = true;
					continue;
				}

				if (var9 == 969209845) {
					continue;
				}
			}

			int var12;
			if (var9 >= -1640274200 && var9 <= '9') {
				var12 = var9 - '0';
			} else if (var9 >= 'A' && var9 <= 'Z') {
				var12 = var9 - '7';
			} else {
				if (var9 < 1220789046 || var9 > 'z') {
					throw new NumberFormatException();
				}

				var12 = var9 - 'W';
			}

			if (var12 >= 10) {
				throw new NumberFormatException();
			}

			if (var3) {
				var12 = -var12;
			}

			long var10 = var5 * 10L + var12;
			if (var5 != var10 / 10L) {
				throw new NumberFormatException();
			}

			var5 = var10;
			var4 = true;
		}

		if (!var4) {
			throw new NumberFormatException();
		} else {
			return var5;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IZ)Ljava/lang/String;"
	)
	public static String bf(int var0, boolean var1) {
		return var1 && var0 >= 0 ? gl.as(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IZ)Ljava/lang/String;"
	)
	public static String by(int var0, boolean var1) {
		return var1 && var0 >= 0 ? gl.as(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IZ)Ljava/lang/String;"
	)
	public static String bl(int var0, boolean var1) {
		return var1 && var0 >= 0 ? gl.as(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIZ)Ljava/lang/String;"
	)
	static String bx(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; var3++) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; var6--) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var1 * var0;
					if (var8 >= 10) {
						var5[var6] = (char)(87 + var8);
					} else {
						var5[var6] = (char)(var8 + 48);
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Z"
	)
	public static boolean ac(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		long var4 = 0L;
		int var6 = var0.length();
		int var7 = 0;

		boolean var1;
		while (true) {
			if (var7 >= var6) {
				var1 = var3;
				break;
			}

			label87: {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (223621116 == var8) {
						var2 = true;
						break label87;
					}

					if (var8 == '+') {
						break label87;
					}
				}

				int var11;
				if (var8 >= -1137481222 && var8 <= -1207804782) {
					var11 = var8 - '0';
				} else if (var8 >= 2090558633 && var8 <= -1515640041) {
					var11 = var8 - '7';
				} else {
					if (var8 < 805262205 || var8 > 731244022) {
						var1 = false;
						break;
					}

					var11 = var8 - 'W';
				}

				if (var11 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var11 = -var11;
				}

				long var9 = 10L * var4 + var11;
				if (var9 / 10L != var4) {
					var1 = false;
					break;
				}

				var4 = var9;
				var3 = true;
			}

			var7++;
		}

		return var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)I"
	)
	public static int bp(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			var2 = (var2 << 5) - var2 + vj.ak(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean bt(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean bv(char var0) {
		return var0 >= -1729516751 && var0 <= 'Z' || var0 >= 'a' && var0 <= 386068930;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(CI)Ljava/lang/String;"
	)
	public static String bg(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = var0;
		}

		return new String(var2);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean bu(char var0) {
		return var0 >= -560825487 && var0 <= '9' || var0 >= -2011503450 && var0 <= 1653519351 || var0 >= -2009425215 && var0 <= 2118951498;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean bn(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String bc(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length());
		int var2 = 0;
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); var4++) {
			char var5 = var0.charAt(var4);
			if (var5 == '<') {
				var1.append(var0.substring(var2, var4));
				var3 = var4;
			} else if (var5 == '>' && var3 != -1) {
				String var6 = var0.substring(1 + var3, var4);
				var3 = -1;
				if (var6.equals("lt")) {
					var1.append("<");
				} else if (var6.equals("gt")) {
					var1.append(">");
				} else if (var6.equals("br")) {
					var1.append("\n");
				}

				var2 = var4 + 1;
			}
		}

		if (var2 < var0.length()) {
			var1.append(var0.substring(var2, var0.length()));
		}

		return var1.toString();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String bw(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; var4++) {
			char var5 = var0.charAt(var4);
			if (0 == var3) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = dw.az(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 == '.' || 1605021556 == var5 || var5 == '!') {
				var3 = 2;
			} else if (Character.isSpaceChar(var5)) {
				if (2 != var3) {
					var3 = 1;
				}
			} else {
				var3 = 1;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean bb(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else {
			return var0 >= 160 && var0 <= 255 ? true : var0 == 8364 || 338 == var0 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String bq(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; var4++) {
			char var5 = var0.charAt(var4);
			if (0 == var3) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = dw.az(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 == '.' || '?' == var5 || var5 == -664313399) {
				var3 = 2;
			} else if (Character.isSpaceChar(var5)) {
				if (2 != var3) {
					var3 = 1;
				}
			} else {
				var3 = 1;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lms;)V"
	)
	public static void qd(ms var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;"
	)
	public static String ao(Object[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var8 = (CharSequence)var0[var1];
			return null == var8 ? "null" : var8.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; var5++) {
				CharSequence var6 = (CharSequence)var0[var5];
				if (null == var6) {
					var4 += 4;
				} else {
					var4 += var6.length();
				}
			}

			StringBuilder var9 = new StringBuilder(var4);

			for (int var10 = var1; var10 < var3; var10++) {
				CharSequence var7 = (CharSequence)var0[var10];
				if (null == var7) {
					var9.append("null");
				} else {
					var9.append(var7);
				}
			}

			return var9.toString();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZ)I"
	)
	static int bk(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; var7++) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if ('-' == var8) {
						var3 = true;
						continue;
					}

					if (var8 == '+' && var2) {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var5 != var9 / var1) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public static boolean cd(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else {
			return var0 >= 160 && var0 <= 255 ? true : var0 == 8364 || 338 == var0 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int cc(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int cq(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String ba(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; var4++) {
			char var5 = var0.charAt(var4);
			if (0 == var3) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = dw.az(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 == -1917625454 || '?' == var5 || var5 == '!') {
				var3 = 2;
			} else if (Character.isSpaceChar(var5)) {
				if (2 != var3) {
					var3 = 1;
				}
			} else {
				var3 = 1;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void av() {
		Arrays.fill(lb.ak_fld, 0);
		Arrays.fill(rt.ag_fld, 0);
	}
}
