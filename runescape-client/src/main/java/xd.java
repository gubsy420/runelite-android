import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xd")
public interface xd {
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lpd;Ljava/lang/Object;)Z"
	)
	static boolean uk(pd var0, Object var1) {
		pj var2 = (pj)(pj)var0.az_fld.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			var0.av_fld += -1298800209;
			var0.ae_fld -= -1369326977;
			if (var2.ag_fld == var0.ae_fld) {
				var0.ag_fld[var0.ae_fld * -402133395] = null;
				return true;
			} else {
				pj var3 = var0.ag_fld[var0.ae_fld * 994100644];
				var0.ag_fld[var0.ae_fld * 434008923] = null;
				var0.ag_fld[var2.ag_fld] = var3;
				var0.ag_fld[var2.ag_fld].ag_fld = var2.ag_fld * 1733271787;
				pd.tp(var0, var2.ag_fld, -2029975183);
				if (var0.ag_fld[var2.ag_fld] == var3) {
					var0.ag(var2.ag_fld, (byte)4);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	static int tr(zg var0) {
		return var0.at_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ak(xi var1, int var2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void av(xi var1);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void az(xi var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ag(xi var1);
}
