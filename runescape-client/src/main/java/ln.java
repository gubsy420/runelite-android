import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ln")
public class ln {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1955114669
	)
	public int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 173762865
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
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1056040297
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
		descriptor = "(Llu;I)Lyb;"
	)
	static yb ak(lu var0) {
		yb var2 = new yb();
		var2.ay_fld = var0;
		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
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
