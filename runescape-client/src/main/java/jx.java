import java.io.FileNotFoundException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jx")
public class jx {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean al_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	static jx ag_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	static jx ak_fld;

	jx(int var1) {
	}

	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	public static void rn(dn var0) throws FileNotFoundException {
		if (var0.ae_fld && var0.ah_fld < lz.ak() - 60000L) {
			var0.as((byte)108);
		}
	}

	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Llu;"
	)
	public static lu up(uk var0) {
		return var0.ak_fld;
	}

	static {
		short var1 = 25286;
		ak_fld = new jx(1 + var1);
		var1 = 25286;
		ag_fld = new jx(1 + var1);
	}
}
