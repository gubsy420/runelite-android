import java.awt.Component;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mg")
public class mg extends vw {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	al av_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1054541543
	)
	int ai_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	ms az_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 16156829
	)
	int au_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	mi ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2028726843
	)
	int ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1564474297
	)
	int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2052070105
	)
	int ay_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1903305675
	)
	int al_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bv_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -985835055
	)
	int af_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2076400981
	)
	int an_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1108093983
	)
	int ax_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2134604149
	)
	int as_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1533340913
	)
	int aa_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2012409431
	)
	int ag_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 191301659
	)
	int aq_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 30547673
	)
	int am_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	ac ad_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 869169375
	)
	int ar_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1982568771
	)
	int ab_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 495375143
	)
	int ao_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V"
	)
	static void ak(Component var0) {
		var0.addMouseListener(tj.al_fld);
		var0.addMouseMotionListener(tj.al_fld);
		var0.addFocusListener(tj.al_fld);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ak() {
		this.az_fld = null;
		this.av_fld = null;
		this.ae_fld = null;
		this.ad_fld = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.az_fld = null;
		this.av_fld = null;
		this.ae_fld = null;
		this.ad_fld = null;
	}

	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "(Lyv;IIIII)V"
	)
	public static void tk(yv var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		} else if (var3 > 0 && var4 > 0) {
			int var6 = var0.aw_fld;
			int var7 = var0.ay_fld;
			int var8 = 0;
			int var9 = 0;
			int var10 = var0.ad_fld;
			int var11 = var0.ao_fld;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			if (var0.as_fld > 0) {
				int var14 = ((var0.as_fld << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (var0.as_fld << 16);
			}

			if (var0.ar_fld > 0) {
				int var17 = ((var0.ar_fld << 16) + var13 - 1) / var13;
				var2 += var17;
				var9 += var17 * var13 - (var0.ar_fld << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			int var18 = var1 + var2 * yv.au_fld;
			int var15 = yv.au_fld - var3;
			if (var2 + var4 > yv.ai_fld) {
				var4 -= var2 + var4 - yv.ai_fld;
			}

			if (var2 < yv.aa_fld) {
				int var16 = yv.aa_fld - var2;
				var4 -= var16;
				var18 += var16 * yv.au_fld;
				var9 += var13 * var16;
			}

			if (var1 + var3 > yv.am_fld) {
				int var19 = var1 + var3 - yv.am_fld;
				var3 -= var19;
				var15 += var19;
			}

			if (var1 < yv.aq_fld) {
				int var20 = yv.aq_fld - var1;
				var3 -= var20;
				var18 += var20;
				var8 += var12 * var20;
				var15 += var20;
			}

			yv.ah(yv.al_fld, var0.ah_fld, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void az() {
		this.az_fld = null;
		this.av_fld = null;
		this.ae_fld = null;
		this.ad_fld = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void av() {
		this.az_fld = null;
		this.av_fld = null;
		this.ae_fld = null;
		this.ad_fld = null;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	static final boolean fy(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return 1007 == var0;
	}

	mg() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Llu;IZLba;S)V"
	)
	static void aw(lu var0, int var1, boolean var2, ba var3, short var4) {
		if (null == var0.ge_fld) {
			if (var4 == 301) {
				return;
			}

			var0.ge_fld = new lu[var1 + 1];
		}

		if (var0.ge_fld.length <= var1) {
			if (var4 == 301) {
				return;
			}

			lu[] var5 = new lu[1 + var1];
			System.arraycopy(var0.ge_fld, 0, var5, 0, var0.ge_fld.length);
			var0.ge_fld = var5;
		} else {
			lu var6 = var0.ge_fld[var1];
			if (null != var6) {
				if (var2) {
					throw new RuntimeException("");
				}

				hy.cz(var6, var0);
			}
		}
	}
}
