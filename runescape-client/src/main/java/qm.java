import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qm")
public class qm {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static qm ak_fld = new qm();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	static qm ag_fld = new qm();

	qm() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	static boolean av(int var0) {
		return 0 != (var0 & 128);
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	static void hh(xi var0) {
		if (client.lr_fld != null) {
			var0.cy(client.lr_fld, 0, client.lr_fld.length);
		} else {
			byte[] var2 = bv.ae((byte)-21);
			var0.cy(var2, 0, var2.length);
		}
	}
}
