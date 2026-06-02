import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lv")
public class lv {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public volatile int az_fld = 0;
	@ObfuscatedGetter(
		intValue = -2106519475
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ay_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public volatile Object ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	lv ah_fld;

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IFFFFFFFFFIII)V"
	)
	public static void ev(
		fn var0,
		int var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		float var10,
		int var11,
		int var12,
		int var13
	) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.cf_fld != null && var0.cf_fld[var1] != -1) {
				int var15;
				int var16;
				int var18;
				if (var0.cq_fld != null && var0.cq_fld[var1] != -1) {
					int var17 = var0.cq_fld[var1] & 255;
					var18 = var0.ce_fld[var17];
					var15 = var0.cn_fld[var17];
					var16 = var0.cr_fld[var17];
				} else {
					var18 = var0.ba_fld[var1];
					var15 = var0.bq_fld[var1];
					var16 = var0.bg_fld[var1];
				}

				if (var0.cc_fld[var1] == -1) {
					fc.ap(
						var2,
						var3,
						var4,
						var5,
						var6,
						var7,
						var8,
						var9,
						var10,
						var11,
						var11,
						var11,
						fn.ax_fld[var18],
						fn.ax_fld[var15],
						fn.ax_fld[var16],
						fn.an_fld[var18],
						fn.an_fld[var15],
						fn.an_fld[var16],
						fn.aa_fld[var18],
						fn.aa_fld[var15],
						fn.aa_fld[var16],
						var0.cf_fld[var1]
					);
				} else {
					fc.ap(
						var2,
						var3,
						var4,
						var5,
						var6,
						var7,
						var8,
						var9,
						var10,
						var11,
						var12,
						var13,
						fn.ax_fld[var18],
						fn.ax_fld[var15],
						fn.ax_fld[var16],
						fn.an_fld[var18],
						fn.an_fld[var15],
						fn.an_fld[var16],
						fn.aa_fld[var18],
						fn.aa_fld[var15],
						fn.aa_fld[var16],
						var0.cf_fld[var1]
					);
				}
			} else {
				boolean var14 = var0.bb(var1);
				if (var0.cc_fld[var1] == -1 && var14) {
					fc.aj(var2, var3, var4, var5, var6, var7, var8, var9, var10, fn.bm_fld[var0.bb_fld[var1]]);
				} else if (var0.cc_fld[var1] == -1) {
					fc.ab(var2, var3, var4, var5, var6, var7, var8, var9, var10, fn.bm_fld[var0.bb_fld[var1]]);
				} else if (var14) {
					fc.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
				} else {
					fc.ao(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
				}
			}
		}
	}

	lv() {
	}
}
