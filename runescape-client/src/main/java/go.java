import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("go")
public class go {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1597855019
	)
	int ax_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 215472675
	)
	int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 388465491
	)
	int av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -909369013
	)
	int ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1933848651
	)
	int ae_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1280333855
	)
	int al_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 593777895
	)
	int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 49742223
	)
	int ay_fld = 0;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -877260683
	)
	int as_fld = 0;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1370830533
	)
	int af_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1319426805
	)
	int au_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 206243219
	)
	int az_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bj_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cf_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V"
	)
	void ak(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.ag_fld = var1;
		this.az_fld = var2;
		this.av_fld = var3;
		this.ae_fld = var4;
		this.ah_fld = var5;
		this.aw_fld = var6;
		this.ay_fld = var7;
		this.as_fld = var8;
		this.ar_fld = var9;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Lzf;)V"
	)
	void as(zg var1, zf var2) {
		if (null != var2) {
			int var3 = var2.ap_fld;
			int var4 = Math.min(this.ae_fld, (int)(0.9F * var3));
			int var5 = var1.bh(this.av_fld);
			int var6 = zg.ul(var1, this.ae_fld);
			int var7 = var5 + (this.ag_fld - this.ah_fld);
			int var8 = this.az_fld - this.aw_fld + var6 + var3;
			yu.dg(this.ag_fld, this.az_fld, this.av_fld + this.ag_fld, this.ae_fld + this.az_fld);
			int var9 = this.as_fld;
			int var10 = this.ay_fld;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			zr var21 = zg.kc(var1, 0, var9);
			zr var12 = zg.kc(var1, var9, var10);
			zr var13 = zg.kc(var1, var10, var1.ae());
			zr var14 = zg.kc(var1, 0, this.ay_fld);
			if (!var12.az()) {
				int var15 = var2.ac_fld + var2.at_fld;

				for (int var16 = 0; var16 < var12.av(); var16++) {
					zj var17 = var12.ay(var16);
					int var18 = var7 + var17.az_fld;
					int var19 = ma.ax(var2, var17.ak_fld);
					int var20 = var8 + var17.ag_fld - var3;
					yu.dj(var18, var20, var19, var15, this.ax_fld);
				}
			}

			if (!var21.az()) {
				var2.aj(var21, var7, var8, this.af_fld, this.al_fld, -1);
			}

			if (!var12.az()) {
				var2.aj(var12, var7, var8, this.au_fld, this.al_fld, -1);
			}

			if (!var13.az()) {
				var2.aj(var13, var7, var8, this.af_fld, this.al_fld, -1);
			}

			if (this.ar_fld) {
				ve var22 = var14.aw();
				int var23 = var7 + (Integer)var22.ag_fld;
				int var24 = var8 + (Integer)var22.ak_fld;
				int var25 = var24 - var4;
				yu.ez(var23, var24, var23, var25, this.af_fld);
				if (this.al_fld != -1) {
					yu.ez(1 + var23, var24 + 1, var23 + 1, 1 + var25, this.al_fld);
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void ag(int var1, int var2, int var3, int var4, int var5) {
		this.af_fld = var1;
		this.al_fld = var2;
		this.au_fld = var3;
		this.ax_fld = var4;
	}

	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "(Lgo;IIII)V"
	)
	public static void qm(go var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af_fld = -2083132335 * var1;
		var0.al_fld = 587755876 * var2;
		var0.au_fld = var3 * -1126605122;
		var0.ax_fld = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Lzf;B)V"
	)
	void az(zg var1, zf var2, byte var3) {
		if (null != var2) {
			int var4 = var2.ap_fld;
			int var5 = Math.min(this.ae_fld, (int)(0.9F * var4));
			int var6 = var1.bh(this.av_fld);
			int var7 = zg.ul(var1, this.ae_fld);
			int var8 = var6 + (this.ag_fld - this.ah_fld);
			int var9 = this.az_fld - this.aw_fld + var7 + var4;
			yu.dg(this.ag_fld, this.az_fld, this.av_fld + this.ag_fld, this.ae_fld + this.az_fld);
			int var10 = this.as_fld;
			int var11 = this.ay_fld;
			if (var10 > var11) {
				if (var3 != 77) {
					return;
				}

				int var12 = var10;
				var10 = var11;
				var11 = var12;
			}

			zr var22 = zg.kc(var1, 0, var10);
			zr var13 = zg.kc(var1, var10, var11);
			zr var14 = zg.kc(var1, var11, var1.ae());
			zr var15 = zg.kc(var1, 0, this.ay_fld);
			if (!var13.az()) {
				int var16 = var2.ac_fld + var2.at_fld;

				for (int var17 = 0; var17 < var13.av(); var17++) {
					zj var18 = var13.ay(var17);
					int var19 = var8 + var18.az_fld;
					int var20 = ma.ax(var2, var18.ak_fld);
					int var21 = var9 + var18.ag_fld - var4;
					yu.dj(var19, var21, var20, var16, this.ax_fld);
				}
			}

			if (!var22.az()) {
				var2.aj(var22, var8, var9, this.af_fld, this.al_fld, -1);
			}

			if (!var13.az()) {
				if (var3 != 77) {
					return;
				}

				var2.aj(var13, var8, var9, this.au_fld, this.al_fld, -1);
			}

			if (!var14.az()) {
				var2.aj(var14, var8, var9, this.af_fld, this.al_fld, -1);
			}

			if (this.ar_fld) {
				ve var23 = var15.aw();
				int var24 = var8 + (Integer)var23.ag_fld;
				int var25 = var9 + (Integer)var23.ak_fld;
				int var26 = var25 - var5;
				yu.ez(var24, var25, var24, var26, this.af_fld);
				if (this.al_fld != -1) {
					yu.ez(1 + var24, var25 + 1, var24 + 1, 1 + var26, this.al_fld);
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	void av(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.ag_fld = var1;
		this.az_fld = var2;
		this.av_fld = var3;
		this.ae_fld = var4;
		this.ah_fld = var5;
		this.aw_fld = var6;
		this.ay_fld = var7;
		this.as_fld = var8;
		this.ar_fld = var9;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	void ah(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.ag_fld = var1;
		this.az_fld = var2;
		this.av_fld = var3;
		this.ae_fld = var4;
		this.ah_fld = var5 * -1079289439;
		this.aw_fld = var6;
		this.ay_fld = var7;
		this.as_fld = var8;
		this.ar_fld = var9;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void aw(int var1, int var2, int var3, int var4) {
		this.af_fld = -207549009 * var1;
		this.al_fld = -603348344 * var2;
		this.au_fld = var3 * 1979584764;
		this.ax_fld = var4;
	}

	go() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZ)V"
	)
	void ae(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.ag_fld = var1;
		this.az_fld = var2;
		this.av_fld = var3;
		this.ae_fld = var4;
		this.ah_fld = var5;
		this.aw_fld = var6;
		this.ay_fld = var7;
		this.as_fld = var8;
		this.ar_fld = var9;
	}
}
