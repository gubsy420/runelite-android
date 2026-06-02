import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ln")
public class ln {
	@ObfuscatedGetter(
		intValue = 1955114669
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld;
	@ObfuscatedGetter(
		intValue = 173762865
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ab_fld;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cl_fld;
	@ObfuscatedGetter(
		intValue = -1056040297
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float be_fld;

	ln() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	static yb ak(lu var0) {
		yb var2 = new yb();
		var2.ay_fld = var0;
		return var2;
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Z"
	)
	public static boolean op(uk var0) {
		return null != var0.ak_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void ah(xi var0, int var1) {
		if (null != mh.ad_fld) {
			try {
				mh.ad_fld.af(0L);
				mh.ad_fld.ay(var0.al_fld, var1, 24, 1997494798);
			} catch (Exception var4) {
			}
		}
	}
}
