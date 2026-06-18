import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wa")
public class wa {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwa;"
	)
	public static wa ag_fld = new wa(new wf());
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxw;"
	)
	public xw az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwa;"
	)
	public static wa ak_fld = new wa(new wm());

	@ObfuscatedName("xe")
	@ObfuscatedSignature(
		descriptor = "(Lwa;S)I"
	)
	public static int xe(wa var0, short var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.az_fld.ak(-481710513).as_fld * 1278114781;
		}
	}

	wa(xw var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)I"
	)
	public static int ya(gu var0) {
		return var0.ag_fld >> 7;
	}

	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V"
	)
	public static void xv(gu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var1;
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lwa;)I"
	)
	public static int mr(wa var0) {
		return var0.az_fld.ak(-605228756).as_fld * 1278114781;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	public int ak(short var1) {
		return this.az_fld.ak(-481710513).as_fld * 1278114781;
	}
}
