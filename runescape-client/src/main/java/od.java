import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("od")
public class od {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub aw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static od ag_fld = new od(1);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static od ak_fld = new od(0);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static od av_fld = new od(3);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static od ae_fld = new od(4);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static od az_fld = new od(2);

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V"
	)
	static void dn(dx var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		na var7 = var0.aa_fld[var1][var2][var3];
		if (var7 != null) {
			for (dw var8 = (dw)var7.aw(); null != var8; var8 = (dw)var7.as()) {
				if (var4 == var8.ag_fld && var5 == var8.az_fld) {
					dw.ez(var8, -1795549268);
					break;
				}
			}

			jv.er(var1, var2, var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lku;)V"
	)
	public static void ag(ku var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ax_fld = 0;
	}

	od(int var1) {
	}
}
