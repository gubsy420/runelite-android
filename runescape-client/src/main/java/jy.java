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

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int ei(xi var0) {
		return 128 - var0.al_fld[(var0.au_fld += 474128948) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Loy;)Lvr;"
	)
	public static vr bh(oy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bk_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;"
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
