import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oi")
public class oi extends vc {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ak_fld = new iw(64);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnl;Lnl;)I"
	)
	public static int bj(nd var0, nl var1, nl var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1.az_fld.av_fld * -220330603 < var2.az_fld.av_fld * -220330603 ? -1 : (var2.az_fld.av_fld * -220330603 == var1.az_fld.av_fld * -220330603 ? 0 : 1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ak_fld.vh();
	}

	oi() throws Throwable {
		throw new Error();
	}
}
