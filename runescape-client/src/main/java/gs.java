import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gs")
public class gs {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	static lu ap_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;BI)I"
	)
	public static int av(xi var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (3 == var3) {
			return var0.co();
		} else if (2 == var3) {
			return var0.cz();
		} else {
			return 1 == var3 ? xi.rp(var0, -43858923) : 0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lgu;II)V"
	)
	public static void az(xi var0, gu var1, int var2, int var3) {
		gu.yu(var1, kj.aw(var2), kj.aw(var3), (byte)-23);
		var1.ar(0);
		var1.aw(0);
		byte var4 = xi.rp(var0, 272171642);
		if (var4 != 0) {
			int var5 = ea.ag(var0, var4, 0);
			int var6 = ea.ag(var0, var4, 2);
			int var7 = ea.ag(var0, var4, 4);
			int var8 = ea.ag(var0, var4, 6);
			var1.al(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ac(int var0, ba var1, boolean var2) {
		lu var4 = var2 ? ap_fld : bp.ab_fld;
		if (var0 == 1800) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = nt.ag(uo.sa(cf.cg_fld, var4, 1907181620));
			return 1;
		} else if (1801 != var0) {
			if (var0 == 1802) {
				if (var4.eq_fld == null) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				} else {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.eq_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var5--;
			if (null != var4.ei_fld && var5 < var4.ei_fld.length && null != var4.ei_fld[var5]) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.ei_fld[var5];
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lgu;)V"
	)
	public static void ne(gu var0, gu var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1.ak_fld * -1091125853;
		var0.ag_fld = 1 * var1.ag_fld;
		var0.av_fld = var1.av_fld * 285569539;
		var0.az_fld = var1.az_fld * -764828807;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;BI)I"
	)
	public static int ae(xi var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (3 == var3) {
			return var0.co();
		} else if (2 == var3) {
			return var0.cz();
		} else {
			return 1 == var3 ? xi.rp(var0, -647428498) : 0;
		}
	}

	gs() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	static yb ag(int var0) {
		yb var2 = new yb();
		var2.au_fld = var0;
		return var2;
	}
}
