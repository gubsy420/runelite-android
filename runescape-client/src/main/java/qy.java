import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qy")
public interface qy {
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V"
	)
	void qv(ol var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lol;II)V"
	)
	void ak(ol var1, int var2, int var3);

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)V"
	)
	static void ks(qa var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 >= 0) {
				if (var0.ag_fld != var1) {
					var0.ag_fld = var1 * -1457597965;
					var0.az_fld = hm.ak(var1);
					var0.aw_fld = 0;
					if (-1 == var0.ae_fld) {
						var0.ae_fld = 0;
					}
				}
			} else {
				var0.ag_fld = 1457597965;
				var0.az_fld = null;
				var0.ae_fld = -1085309643;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V"
	)
	void ag(ol var1, int var2);

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Ljava/lang/String;"
	)
	static String cw(cn var0) {
		return var0.aa_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V"
	)
	void az(ol var1, int var2);
}
