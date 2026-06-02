import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hf")
public class hf {
	@ObfuscatedGetter(
		intValue = -1936218911
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = -1291504879
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedGetter(
		intValue = 2115450829
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld = 820998907;
	@ObfuscatedGetter(
		intValue = -1683164347
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String an_fld;

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

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void fz(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld = var1;
		og.ag();
	}

	hf() {
		this.ak_fld = 0;
		this.av_fld = -2107418509;
		this.ag_fld = 0;
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
				qa.ju(var0.aa_fld, var6, 108960076);
				var0.aa_fld.ar(461909079);
				var0.ai_fld = var5;
			} else {
				label54: {
					ol var7 = var0.aa_fld.ae();
					if (null != var7) {
						if (var4 == rg.zv(var0, (byte)0)) {
							int var8 = var7.ba_fld;
							if (var8 == 1) {
								var0.aa_fld.ar(461909079);
								var0.ai_fld = var5;
							}

							if (2 == var8) {
								var0.aa_fld.af();
							}
							break label54;
						}

						if (hm.ak(var4).bv_fld * -1232992871 < var7.bv_fld) {
							break label54;
						}
					}

					qa.ju(var0.aa_fld, var4, 1385460180);
					var0.aa_fld.ar(461909079);
					var0.ai_fld = var5;
				}
			}
		}

		if ((var2 & 1) != 0) {
			int var9 = var1.df();
			rg.em(var0, var9, (short)5281);
		}
	}
}
