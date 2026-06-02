import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vb")
public class vb {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = -63795729
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = 1371401807
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedGetter(
		intValue = 287960327
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedGetter(
		intValue = 451875459
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = -230169305
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = 1303599131
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return String.format("%dx%d (offset %d,%d)", (Object[])(new Object[]{this.an_fld, this.ax_fld, this.al_fld, this.af_fld}));
	}

	vb(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.an_fld = var1;
		this.ax_fld = var2;
		this.al_fld = var3;
		this.af_fld = var4;
		this.au_fld = var1 / 2;
		this.aa_fld = -1184370505 * (var2 / 2);
		this.ar_fld = -953473829 * (this.au_fld * this.au_fld + this.aa_fld * this.aa_fld);
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return String.format("%dx%d (offset %d,%d)", (Object[])(new Object[]{this.an_fld, this.ax_fld, this.al_fld * 1477932592, this.af_fld}));
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Luo;)Z"
	)
	public static boolean vr(uo var0) {
		return null == var0.ac_fld;
	}

	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "(Lce;Lyc;)V"
	)
	public static void sa(ce var0, yc var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var2 = 0; var2 < var0.aq_fld.length; var2++) {
				var0.aq_fld[var2] = 0;
			}

			for (int var8 = 0; var8 < 5000; var8++) {
				int var3 = (int)(Math.random() * 128.0 * 256.0);
				var0.aq_fld[var3] = (int)(Math.random() * 256.0);
			}

			for (int var9 = 0; var9 < 20; var9++) {
				for (int var11 = 1; var11 < -907367079; var11++) {
					for (int var4 = 1; var4 < 186716007; var4++) {
						int var5 = (var11 << 7) + var4;
						var0.am_fld[var5] = (var0.aq_fld[128 + var5] + var0.aq_fld[var5 - 1] + var0.aq_fld[1 + var5] + var0.aq_fld[var5 - 1668382607]) / 4;
					}
				}

				int[] var12 = var0.aq_fld;
				var0.aq_fld = var0.am_fld;
				var0.am_fld = var12;
			}

			if (null != var1) {
				int var10 = 0;

				for (int var13 = 0; var13 < var1.av_fld; var13++) {
					for (int var14 = 0; var14 < var1.az_fld; var14++) {
						if (var1.ak_fld[var10++] != 0) {
							int var15 = var1.ae_fld + 16 + var14;
							int var6 = var1.ah_fld + 16 + var13;
							int var7 = (var6 << 7) + var15;
							var0.aq_fld[var7] = 0;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return String.format("%dx%d (offset %d,%d)", (Object[])(new Object[]{this.an_fld * 813431297, 1419149357 * this.ax_fld, this.al_fld, this.af_fld}));
	}
}
