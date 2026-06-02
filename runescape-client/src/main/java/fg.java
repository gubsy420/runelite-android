import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fg")
public class fg {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cy_fld;
	@ObfuscatedGetter(
		intValue = -695506525
	)
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int rw_fld;

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V"
	)
	public static void bp(cl var0, int var1) {
		var0.az_fld.ak_fld = var1;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIIIIIIZ)V"
	)
	static void es(dx var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) throws EOFException {
		dw var12 = new dw();
		var12.ag_fld = var4;
		int var10001 = var5 * -1329750057;
		var12.iq(var5 * -1329750057 * -1736653849);
		var12.az_fld = var10001;
		var12.ak(var6, 317035601);
		var12.av_fld = 1511522651 * (client.gw_fld + var7);
		var12.ae_fld = 1785931029 * (client.gw_fld + var8);
		var12.ah_fld = var9;
		var12.aw_fld = var10;
		if (var0.aa_fld[var1][var2][var3] == null) {
			var0.aa_fld[var1][var2][var3] = new na();
		}

		var0.aa_fld[var1][var2][var3].av(var12);
		xh.en(var0, var1, var2, var3, 632922540);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	static final int ah(int var0, int var1, int var2, int var3) {
		return var2 * var0 + var1 * var3 >> 16;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	static final int aw(int var0, int var1, int var2, int var3) {
		return var2 * var0 + var1 * var3 >> 16;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	static final int ay(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	static final int as(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(F)F"
	)
	public static final float al(float var0) {
		float var1 = 150.75377F / (var0 - 1.0100503F);
		return var1 / 14925.0F / 1.0100503F;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFF)F"
	)
	static final float af(float var0, float var1, float var2, float var3) {
		return var0 * var2 - var1 * var3;
	}

	fg() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	static final int ar(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(F)F"
	)
	public static final float ax(float var0) {
		float var1 = 150.75377F / (var0 - 1.0100503F);
		return var1 / 14925.0F / 1.0100503F;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(F)F"
	)
	public static final float au(float var0) {
		float var1 = 150.75377F / (var0 - 1.0100503F);
		return var1 / 14925.0F / 1.0100503F;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ba(int var0) {
		return (int)((Math.log(var0) / bp.as_fld - 7.0) * 256.0);
	}
}
