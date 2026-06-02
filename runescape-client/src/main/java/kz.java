import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kz")
public class kz {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ca_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int by_fld;

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void ez(fn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ch_fld = null;
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lvc;)V"
	)
	public static void kq(nu var0, vc var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.ft_fld != null) {
			var1.mq_void();
		}

		var1.ft_fld = var0.ak_fld;
		var1.fn_fld = var0.ak_fld.fn_fld;
		var1.ft_fld.fn_fld = var1;
		var1.fn_fld.ft_fld = var1;
	}

	@ObfuscatedName("zp")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Ljava/lang/String;I)Lzw;"
	)
	public static zw zp(zg var0, String var1, int var2) {
		return var0.au(var1, var0.ap_fld.size(), var2);
	}

	static {
		Math.sqrt(8192.0);
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)I"
	)
	public static int kj(wj var0) {
		return null != var0.ak_fld ? var0.ak_fld.bx() : 0;
	}

	kz() throws Throwable {
		throw new Error();
	}
}
