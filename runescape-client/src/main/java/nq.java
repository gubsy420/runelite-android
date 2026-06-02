import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nq")
public class nq {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	static long[] ag_fld = new long[12];
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lyv;"
	)
	static yv cn_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	public static char[] ak_fld = new char[]{
		'_',
		'a',
		'b',
		'c',
		'd',
		'e',
		'f',
		'g',
		'h',
		'i',
		'j',
		'k',
		'l',
		'm',
		'n',
		'o',
		'p',
		'q',
		'r',
		's',
		't',
		'u',
		'v',
		'w',
		'x',
		'y',
		'z',
		'0',
		'1',
		'2',
		'3',
		'4',
		'5',
		'6',
		'7',
		'8',
		'9'
	};
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bz_fld;

	nq() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(J)Ljava/lang/String;"
	)
	public static String av(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					var2++;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					char var8 = ak_fld[(int)(var6 - var0 * 37L)];
					if (var8 == -1986288135) {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}

					var5.append(var8);
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(J)Ljava/lang/String;"
	)
	public static String ag(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					var2++;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					char var8 = ak_fld[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}

					var5.append(var8);
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public static void vp(cv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bd_fld = rw.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(J)Ljava/lang/String;"
	)
	public static String az(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					var2++;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					char var8 = ak_fld[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}

					var5.append(var8);
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	static {
		for (int var0 = 0; var0 < ag_fld.length; var0++) {
			ag_fld[var0] = (long)Math.pow(37.0, var0);
		}
	}
}
