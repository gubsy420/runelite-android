import java.util.Calendar;
import java.util.TimeZone;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zq")
public class zq {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public static String[] ag_fld = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Ljava/lang/String;"
	)
	public static String[][] ak_fld = new String[][]{
		{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"},
		{"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"},
		{"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"},
		{"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"},
		{"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"},
		{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"},
		{"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}
	};
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Calendar;"
	)
	public static Calendar az_fld = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	zq() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "(Lli;)I"
	)
	public static int uv(li var0) {
		return var0.bd_fld;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lla;Ljava/lang/Runnable;I)Llv;"
	)
	public static lv iu(la var0, Runnable var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return la.se(var0, 2, var2, 0, var1);
	}

	static {
		Calendar.getInstance();
	}
}
