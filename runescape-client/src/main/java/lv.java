import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lv")
public class lv {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public volatile int az_fld = 0;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2106519475
	)
	int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ay_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public volatile Object ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	lv ah_fld;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxv;Lvw;J)V"
	)
	public static void ap(xv var0, vw var1, long var2) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var4 = sq.jx(var0, var2);
		if (var4 != null) {
			var4.pz_void();
		}

		var0.oy(var1, var2);
	}

	lv() {
	}
}
