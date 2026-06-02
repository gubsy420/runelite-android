import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jn")
public interface jn {
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	static void ic(mx var0) {
		if (var0.au_fld != null) {
			qv.ye(var0.au_fld, (byte)111);
		}
	}

	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	static boolean ui(ev var0, int var1, int var2, int var3, int var4) {
		return ev.aq(var0, var0.et_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Loe;I)I"
	)
	static int hj(oe var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 != 1 && var1 != 3 ? var0.co_fld : var0.cb_fld;
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Lnj;)Lvc;"
	)
	static vc pl(nj var0) {
		vc var1 = var0.ag_fld;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.fn_fld;
			return var1;
		}
	}
}
