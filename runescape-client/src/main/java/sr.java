import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sr")
public class sr {
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int by_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bj_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfn;)V"
	)
	public static void ql(fn var0, fn var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			var0.ag(var1);

			for (int var2 = 0; var2 < var1.ke_fld; var2++) {
				var0.ba_fld[var0.ke_fld] = var1.ba_fld[var2] + var0.bi_fld;
				var0.bq_fld[var0.ke_fld] = var1.bq_fld[var2] + var0.bi_fld;
				var0.bg_fld[var0.ke_fld] = var1.bg_fld[var2] + var0.bi_fld;
				var0.bb_fld[var0.ke_fld] = var1.bb_fld[var2];
				var0.cd_fld[var0.ke_fld] = var1.cd_fld[var2];
				var0.cc_fld[var0.ke_fld] = var1.cc_fld[var2];
				if (var0.cq_fld != null) {
					var0.cq_fld[var0.ke_fld] = var1.cq_fld != null ? var1.cq_fld[var2] : var1.cs_fld;
				}

				if (var0.cv_fld != null && var1.cv_fld != null) {
					var0.cv_fld[var0.ke_fld] = var1.cv_fld[var2];
				}

				if (var0.cf_fld != null) {
					var0.cf_fld[var0.ke_fld] = var1.cf_fld != null ? var1.cf_fld[var2] : -1;
				}

				if (var0.cy_fld != null) {
					if (var1.cy_fld != null && var1.cy_fld[var2] != -1) {
						var0.cy_fld[var0.ke_fld] = (byte)(var1.cy_fld[var2] + var0.cp_fld);
					} else {
						var0.cy_fld[var0.ke_fld] = -1;
					}
				}

				if (var0.cx_fld != null && var1.cx_fld != null) {
					var0.cx_fld[var0.ke_fld] = var1.cx_fld[var2];
				}

				var0.ke_fld++;
			}

			for (int var3 = 0; var3 < var1.cp_fld; var3++) {
				var0.ce_fld[var0.cp_fld] = var1.ce_fld[var3] + var0.bi_fld;
				var0.cn_fld[var0.cp_fld] = var1.cn_fld[var3] + var0.bi_fld;
				var0.cr_fld[var0.cp_fld] = var1.cr_fld[var3] + var0.bi_fld;
				var0.cp_fld++;
			}

			for (int var4 = 0; var4 < var1.bi_fld; var4++) {
				var0.fn_Arrfloat[var0.bi_fld] = var1.fn_Arrfloat[var4];
				var0.rl_fld[var0.bi_fld] = var1.rl_fld[var4];
				var0.kp_fld[var0.bi_fld] = var1.kp_fld[var4];
				var0.bi_fld++;
			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)V"
	)
	public static void ht(pd var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = (var0.ag_fld.length << 1) + 1;
		var0.ag_fld = (pj[])(pj[])Arrays.copyOf(var0.ag_fld, var1);
	}

	protected sr() throws Throwable {
		throw new Error();
	}
}
