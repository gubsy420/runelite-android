import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hf")
public class hf {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1936218911
	)
	int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1291504879
	)
	int ag_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2115450829
	)
	int ak_fld = 820998907;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1683164347
	)
	int az_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String an_fld;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lds;)[I"
	)
	public static int[] ab(ds var0) {
		return null != var0.ar_fld ? xu.zg(var0.ar_fld, -929120066) : pp.mm(var0.ah_fld, -2079987222);
	}

	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "(Lcl;)V"
	)
	public static void uw(cl var0) {
		var0.ak_fld.clear();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;IIII)V"
	)
	public static void al(sl var0, sl var1, int var2, int var3, int var4, int var5) {
		om.ap(var0, null, false, (byte)0);
		yq var6 = var0.ag_fld;
		om.ap(var1, var6, true, (byte)0);
		int var7 = var0.av();
		int var8 = var1.av();
		if (var4 == -1) {
			var4 = var0.av() - var2;
		}

		if (0 != var4) {
			if (var5 >= -196180718) {
				return;
			}

			if (var0 != var1 || var3 != var2) {
				if (var2 >= 0 && var2 + var4 <= var7 && var3 >= 0) {
					if (var5 >= -196180718) {
						return;
					}

					if (var4 + var3 <= var8) {
						eb.aj(var0, var2, var1, var3, var4);
						return;
					}

					if (var5 >= -196180718) {
						return;
					}
				}

				throw new RuntimeException();
			}

			if (var5 >= -196180718) {
				return;
			}
		}
	}

	hf() {
		this.ag_fld = 0;
		this.az_fld = -2107418509;
		this.av_fld = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lxj;IB)V"
	)
	static void ag(rg var0, xj var1, int var2, byte var3) throws EOFException {
		if ((var2 & 2) != 0) {
			int var4 = var1.eo();
			int var5 = var1.cg();
			if (65535 == var4) {
				if (var3 != 0) {
					return;
				}

				byte var6 = -1;
				qa.hs(var0.aa_fld, var6, 108960076);
				var0.aa_fld.ar(461909079);
				var0.ai_fld = var5;
			} else {
				label54: {
					ol var7 = qa.kw(var0.aa_fld, -1445610365);
					if (null != var7) {
						if (var4 == rg.dp(var0, (byte)0)) {
							int var8 = var7.ba_fld;
							if (var8 == 1) {
								var0.aa_fld.ar(461909079);
								var0.ai_fld = var5;
							}

							if (2 == var8) {
								qa.qn(var0.aa_fld, -260982720);
							}
							break label54;
						}

						if (hm.ak(var4).bv_fld * -1232992871 < var7.bv_fld) {
							break label54;
						}
					}

					qa.hs(var0.aa_fld, var4, 1385460180);
					var0.aa_fld.ar(461909079);
					var0.ai_fld = var5;
				}
			}
		}

		if ((var2 & 1) != 0) {
			int var9 = var1.df();
			rg.xc(var0, var9, (short)5281);
		}
	}
}
