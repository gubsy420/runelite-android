import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jy")
@zn
public class jy {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	static HashMap az_fld = new HashMap();
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public static long ag_fld;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int eb_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;

	static {
		Calendar.getInstance(ak("Europe/London"));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;"
	)
	static TimeZone ak(String var0) {
		synchronized (az_fld) {
			TimeZone var3 = (TimeZone)(TimeZone)az_fld.get(var0);
			if (null == var3) {
				var3 = TimeZone.getTimeZone(var0);
				az_fld.put(var0, var3);
			}

			return var3;
		}
	}

	jy() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Ljava/lang/String;)V"
	)
	public static void jx(rb var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			long var5 = 0L;
			int var7 = var1.length();

			for (int var8 = 0; var8 < var7; var8++) {
				var5 *= 37L;
				char var9 = var1.charAt(var8);
				if (var9 >= 'A' && var9 <= 1782121538) {
					var5 += 1 + var9 - -1419832142;
				} else if (var9 >= -371341482 && var9 <= 'z') {
					var5 += var9 + 1 - 97;
				} else if (var9 >= -772877854 && var9 <= 324941391) {
					var5 += 27 + var9 - -647496039;
				}

				if (var5 >= 177917621779460413L) {
					break;
				}
			}

			while (var5 % 37L == 0L && 0L != var5) {
				var5 /= 37L;
			}

			String var10 = je.ak(var5);
			if (null == var10) {
				var10 = "";
			}

			var0.av_fld = var10;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;"
	)
	static TimeZone ag(String var0) {
		synchronized (az_fld) {
			TimeZone var2 = (TimeZone)(TimeZone)az_fld.get(var0);
			if (null == var2) {
				var2 = TimeZone.getTimeZone(var0);
				az_fld.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;"
	)
	static TimeZone az(String var0) {
		synchronized (az_fld) {
			TimeZone var2 = (TimeZone)(TimeZone)az_fld.get(var0);
			if (null == var2) {
				var2 = TimeZone.getTimeZone(var0);
				az_fld.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;"
	)
	static TimeZone av(String var0) {
		synchronized (az_fld) {
			TimeZone var2 = (TimeZone)(TimeZone)az_fld.get(var0);
			if (null == var2) {
				var2 = TimeZone.getTimeZone(var0);
				az_fld.put(var0, var2);
			}

			return var2;
		}
	}
}
