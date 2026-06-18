import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zh")
public class zh {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	static char[] az_fld = new char[]{
		' ',
		' ',
		'_',
		'-',
		'à',
		'á',
		'â',
		'ä',
		'ã',
		'À',
		'Á',
		'Â',
		'Ä',
		'Ã',
		'è',
		'é',
		'ê',
		'ë',
		'È',
		'É',
		'Ê',
		'Ë',
		'í',
		'î',
		'ï',
		'Í',
		'Î',
		'Ï',
		'ò',
		'ó',
		'ô',
		'ö',
		'õ',
		'Ò',
		'Ó',
		'Ô',
		'Ö',
		'Õ',
		'ù',
		'ú',
		'û',
		'ü',
		'Ù',
		'Ú',
		'Û',
		'Ü',
		'ç',
		'Ç',
		'ÿ',
		'Ÿ',
		'ñ',
		'Ñ',
		'ß'
	};
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	static char[] av_fld = new char[]{'[', ']', '#'};

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String am(String var0) {
		return null != var0 && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	static final boolean ay(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (ey.au(var0)) {
			return true;
		} else {
			char[] var1 = az_fld;

			for (int var2 = 0; var2 < var1.length; var2++) {
				char var3 = var1[var2];
				if (var3 == var0) {
					return true;
				}
			}

			var1 = av_fld;

			for (int var5 = 0; var5 < var1.length; var5++) {
				char var6 = var1[var5];
				if (var6 == var0) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	static final boolean aw(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (ey.au(var0)) {
			return true;
		} else {
			char[] var1 = az_fld;

			for (int var2 = 0; var2 < var1.length; var2++) {
				char var3 = var1[var2];
				if (var3 == var0) {
					return true;
				}
			}

			var1 = av_fld;

			for (int var5 = 0; var5 < var1.length; var5++) {
				char var6 = var1[var5];
				if (var6 == var0) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	static final boolean af(char var0) {
		return var0 == 160 || ' ' == var0 || var0 == '_' || '-' == var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	static final boolean ar(char var0) {
		return var0 == 160 || ' ' == var0 || var0 == '_' || '-' == var0;
	}

	zh() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	static final boolean as(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (ey.au(var0)) {
			return true;
		} else {
			char[] var1 = az_fld;

			for (int var2 = 0; var2 < var1.length; var2++) {
				char var3 = var1[var2];
				if (var3 == var0) {
					return true;
				}
			}

			var1 = av_fld;

			for (int var5 = 0; var5 < var1.length; var5++) {
				char var6 = var1[var5];
				if (var6 == var0) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lzo;)Ljava/lang/String;"
	)
	public static String al(CharSequence var0, zo var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;
			int var3 = var0.length();

			while (var2 < var3 && nb.az(var0.charAt(var2))) {
				var2++;
			}

			while (var3 > var2 && nb.az(var0.charAt(var3 - 1))) {
				var3--;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= ws.ak(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; var6++) {
					char var7 = var0.charAt(var6);
					if (yg.ag(var7)) {
						char var8;
						switch (var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var8 = var7;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var8 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var8 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 'n';
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var8 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u';
								break;
							case 'ß':
								var8 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y';
								break;
							default:
								var8 = Character.toLowerCase(var7);
						}

						if (var8 != 0) {
							var5.append(var8);
						}
					}
				}

				return var5.length() == 0 ? null : var5.toString();
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "(Laf;)Lal;"
	)
	public static al sl(af var0) {
		return var0.ag_fld == 0 ? var0.az(false) : aq.ss(var0.az_fld, 178831264);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lzo;)Ljava/lang/String;"
	)
	public static String au(CharSequence var0, zo var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;
			int var3 = var0.length();

			while (var2 < var3 && nb.az(var0.charAt(var2))) {
				var2++;
			}

			while (var3 > var2 && nb.az(var0.charAt(var3 - 1))) {
				var3--;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= ws.ak(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; var6++) {
					char var7 = var0.charAt(var6);
					if (yg.ag(var7)) {
						char var8;
						switch (var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var8 = var7;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var8 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var8 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 'n';
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var8 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u';
								break;
							case 'ß':
								var8 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y';
								break;
							default:
								var8 = Character.toLowerCase(var7);
						}

						if (var8 != 0) {
							var5.append(var8);
						}
					}
				}

				return var5.length() == 0 ? null : var5.toString();
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lzo;)Ljava/lang/String;"
	)
	public static String ax(CharSequence var0, zo var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;
			int var3 = var0.length();

			while (var2 < var3 && nb.az(var0.charAt(var2))) {
				var2++;
			}

			while (var3 > var2 && nb.az(var0.charAt(var3 - 1))) {
				var3--;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= ws.ak(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; var6++) {
					char var7 = var0.charAt(var6);
					if (yg.ag(var7)) {
						int var8;
						switch (var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = -778390540;
								break;
							case '#':
							case '[':
							case ']':
								var8 = var7;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var8 = 1930785042;
								break;
							case 'Ç':
							case 'ç':
								var8 = 233812619;
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 1772234056;
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = -98380957;
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 1899888819;
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var8 = 111;
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = -1108821140;
								break;
							case 'ß':
								var8 = 924270445;
								break;
							case 'ÿ':
							case 'Ÿ':
								var8 = -1463401362;
								break;
							default:
								var8 = Character.toLowerCase(var7);
						}

						if (var8 != 0) {
							var5.append((char)var8);
						}
					}
				}

				return var5.length() == 0 ? null : var5.toString();
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lzo;)I"
	)
	static final int ah(zo var0) {
		if (null == var0) {
			return 12;
		} else {
			switch (var0.ar_fld) {
				case 0:
					return 20;
				default:
					return 12;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String aa(String var0) {
		return null != var0 && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String ai(String var0) {
		return null != var0 && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String aq(String var0) {
		return null != var0 && !var0.isEmpty() && var0.charAt(0) != 1553818765 ? var0 : "";
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String an(String var0) {
		return null != var0 && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}
}
