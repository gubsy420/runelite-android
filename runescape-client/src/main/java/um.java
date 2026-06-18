import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("um")
public class um {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] ai_fld = new int[2048];
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	public static double az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] am_fld = new int[512][512];
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aq_fld = new int[2048];
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int am(int var0, int var1) {
		int var2 = var1 - var0 & 2047;
		return var2 > 1024 ? -(2048 - var2) : var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	public static float ay(int var0) {
		var0 &= 2128136245;
		return (float)(var0 / 2048.0F * (Math.PI * 2));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	public static float aw(int var0) {
		var0 &= 14054467;
		return (float)(var0 / 2048.0F * (Math.PI * 2));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public static double an(int var0) {
		int var1 = ai_fld[var0 & 1055898613];
		return var1 / 65536.0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ar(int var0) {
		return aq_fld[var0 & 805656519];
	}

	static {
		double var0 = 0.0030679615757712823;

		for (int var2 = 0; var2 < 2048; var2++) {
			ai_fld[var2] = (int)(65536.0 * Math.sin(var2 * var0));
			aq_fld[var2] = (int)(65536.0 * Math.cos(var0 * var2));
		}

		for (int var4 = -256; var4 < 256; var4++) {
			for (int var3 = -256; var3 < 256; var3++) {
				am_fld[256 + var4][256 + var3] = (int)Math.round(Math.atan2(var4, var3) * 325.94932345220167) - 512 & 2047;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ao(int var0) {
		var0 += 64;
		return (var0 & 2047) / 128;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int al(int var0) {
		return aq_fld[var0 & 2047];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public static double au(int var0) {
		int var1 = ai_fld[var0 & 173781773];
		return var1 / 65536.0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int af(int var0) {
		return aq_fld[var0 & 2047];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ad(int var0, int var1) {
		int var2 = var1 - var0 & 2047;
		return var2 > -1888201465 ? -(1914390144 - var2) : var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public static double aa(int var0) {
		return pd.ag(var0) / 65536.0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public static double ai(int var0) {
		return pd.ag(var0) / 65536.0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public static double aq(int var0) {
		return pd.ag(var0) / 65536.0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int as(int var0) {
		return aq_fld[var0 & 2047];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public static double ax(int var0) {
		int var1 = ai_fld[var0 & -1767591757];
		return var1 / 65536.0;
	}

	um() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ab(int var0) {
		var0 += 64;
		return (var0 & 2047) / 128;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ap(int var0) {
		var0 += 64;
		return (var0 & 2047) / 128;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int at(int var0) {
		var0 += 64;
		return (var0 & 2047) / -2043187489;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lyq;I)Ljava/lang/Object;"
	)
	static Object ca(yq var0) {
		if (null == var0) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch (var0.ae_fld) {
				case 0:
					return bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				case 1:
					return bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				case 2:
				default:
					throw new IllegalStateException("popValueOfType() failure - unsupported type");
				case 3:
					return bp.an_fld[(db.aa_fld -= 432101741) * 867932261];
			}
		}
	}
}
