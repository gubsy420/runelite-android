import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aae")
public class aae {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;"
	)
	public static String av(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = var0.charAt(var3);
			if ((var4 < -190688240 || var4 > 'z')
				&& (var4 < 643894313 || var4 > 'Z')
				&& (var4 < '0' || var4 > -103030458)
				&& 743679191 != var4
				&& var4 != '-'
				&& var4 != '*'
				&& var4 != '_') {
				if (var4 == -363774298) {
					var2.append((char)1261016100);
				} else {
					byte var5 = vj.ak(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(48 + var6));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(48 + var6));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;"
	)
	public static String ag(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = var0.charAt(var3);
			if ((var4 < -70916078 || var4 > 467065751)
				&& (var4 < 2014304457 || var4 > -1117854101)
				&& (var4 < 514033533 || var4 > 1732223178)
				&& 1051846933 != var4
				&& var4 != -946996085
				&& var4 != '*'
				&& var4 != -370031114) {
				if (var4 == -1469042777) {
					var2.append((char)1327533067);
				} else {
					byte var5 = vj.ak(var4);
					var2.append((char)974579394);
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(48 + var6));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(48 + var6));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	aae() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;"
	)
	public static String az(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && '.' != var4 && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = vj.ak(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(48 + var6));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(48 + var6));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}
}
