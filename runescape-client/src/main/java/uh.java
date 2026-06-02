import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uh")
public class uh {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ae_fld = new int[16384];
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] ah_fld = new float[16384];
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] av_fld = new int[16384];
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] aw_fld = new float[16384];
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String gq_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int aw(int var0, int var1) {
		return (int)Math.round(Math.atan2(var0, var1) * 2607.5945876176133) & 16383;
	}

	static {
		double var0 = 3.834951969714103E-4;

		for (int var2 = 0; var2 < 16384; var2++) {
			av_fld[var2] = (int)(16384.0 * Math.sin(var0 * var2));
			ae_fld[var2] = (int)(16384.0 * Math.cos(var2 * var0));
			ah_fld[var2] = (float)Math.sin(var0 * var2);
			aw_fld[var2] = (float)Math.cos(var2 * var0);
		}
	}

	uh() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int af(int var0) {
		return ae_fld[var0 & 16383];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	public static float ae(int var0) {
		var0 &= 16383;
		return (float)(var0 * 3.834951969714103E-4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ay(int var0, int var1) {
		return (int)Math.round(Math.atan2(var0, var1) * 2607.5945876176133) & 16383;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int as(int var0) {
		return av_fld[var0 & 16383];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ar(int var0) {
		return ae_fld[var0 & 16383];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ah(int var0, int var1) {
		return (int)Math.round(Math.atan2(var0, var1) * 2607.5945876176133) & 16383;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int al(int var0) {
		return ae_fld[var0 & 16383];
	}

	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)V"
	)
	public static void rs(zg var0, int var1) {
		if (var1 != var0.ad_fld) {
			var0.ad_fld = var1;
			zg.vf(var0, (byte)0);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int au(int var0) {
		return ae_fld[var0 & 16383];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;"
	)
	public static pc ak(int var0) {
		return var0 >= 0 && var0 < lq.ae_fld.length && lq.ae_fld[var0] != null ? lq.ae_fld[var0] : new pc(var0);
	}
}
