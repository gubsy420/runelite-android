import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lk")
public class lk {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;

	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[FIIIIF)V"
	)
	public static void tg(fq var0, int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		int var8 = var0.as_fld[var4];
		var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
		int var9 = var1[var3];
		var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
		int var10 = var0.ar_fld.ap_fld & fq.bw(var2[var3], var7);
		var1[var3] = (var10 & var8) + (~var10 & var9);
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lct;)Z"
	)
	public static boolean gx(ct var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return (wu.as_fld.ag(1065494983) & var0.al_fld) != 0;
		}
	}

	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "(Lbc;Lcx;II)V"
	)
	public static void sp(bc var0, cx var1, int var2, int var3) throws EOFException {
		if (var2 >= var0.af_fld) {
			tu var4 = ah.ay(var0.ar_fld, var0.aw_fld, var0.ay_fld, var0.ah_fld * -1732353834, var1);
			int var5 = (int)var4.ay_fld;
			int var6 = (int)var4.ar_fld;
			int var7 = (int)var4.as_fld - var0.as_fld;
			var4.ah();
			if (!var0.ad_fld) {
				tu var8 = ah.ay(var0.ae_fld * 204177513, var0.ag_fld * 1969368194, var0.az_fld, var0.ak_fld, var1);
				int var9 = (int)var8.ay_fld;
				int var10 = (int)var8.ar_fld;
				int var11 = (int)var8.as_fld - var0.av_fld;
				var8.ah();
				double var12 = var5 - var9;
				double var14 = var6 - var10;
				double var16 = Math.sqrt(var12 * var12 + var14 * var14);
				var0.an_fld = Math.abs(var16) < 0.01F ? var9 : var9 + var0.ax_fld * 2110140176 * var12 / var16;
				var0.aa_fld = Math.abs(var16) < 0.01F ? var10 : var10 + var0.ax_fld * -1290030616 * var14 / var16;
				var0.ai_fld = var11;
			}

			double var18 = 1 + var0.al_fld - var2;
			double var19 = (var5 - var0.an_fld) / var18;
			double var20 = (var6 - var0.aa_fld) / var18;
			double var21 = Math.sqrt(var19 * var19 + var20 * var20);
			if (!var0.ad_fld) {
				var0.ao_fld = -var21 * Math.tan(0.02454369 * (var0.au_fld * -2046919192));
			}

			double var22 = 2.0 * (var7 - var0.ai_fld - var0.ao_fld * var18) / (var18 * var18);
			var0.ad_fld = true;
			var0.an_fld += var19 * var3;
			var0.aa_fld += var20 * var3;
			var0.ai_fld = var0.ai_fld + (var0.ao_fld * var3 + var3 * (var3 * (0.5 * var22)));
			var0.ao_fld += var3 * var22;
			var0.aq_fld = ((int)(Math.atan2(var19, var20) * 325.949) + 162334955 & -1838915414) * -1863331505;
			var0.am_fld = ((int)(Math.atan2(var0.ao_fld, var21) * 325.949) & 2047) * 655166084;
			jm.kr_fld.av(bw.dk_fld, (int)var0.an_fld, (int)var0.aa_fld, false);
			cf.ak(var0.ap_fld, var3, jm.kr_fld);
			jm.kr_fld.ae(1836392950);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldx;Ldx;II)I"
	)
	static int cd(da var0, dx var1, dx var2, int var3, int var4) {
		tu var6 = sh.ak(var0.bo_fld, 0.0F, var0.bp_fld);
		tu var7;
		if (var1.ag_fld != var2.ag_fld) {
			if (0 == var1.ag_fld) {
				rg var8 = (rg)bw.dk_fld.an_fld.ak(var2.ag_fld);
				var7 = rg.ql(var8, var3, var4);
			} else if (0 == var2.ag_fld) {
				rg var12 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
				var7 = var12.at(var3, var4, 172968906);
			} else {
				rg var13 = (rg)bw.dk_fld.an_fld.ak(var2.ag_fld);
				rg var9 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
				tu var10 = rg.ql(var13, var3, var4);
				var7 = var9.at((int)var10.ay_fld, (int)var10.ar_fld, 1589175229);
				var10.ah();
			}
		} else {
			var7 = sh.ak(var3, 0.0F, var4);
		}

		int var14 = -1;
		int var15 = (int)(var6.ay_fld - var7.ay_fld);
		int var16 = (int)(var6.ar_fld - var7.ar_fld);
		if (0 != var15 || 0 != var16) {
			int var11 = (int)(Math.atan2(var15, var16) * 325.94932345220167) & 2047;
			var14 = var11;
		}

		var6.ah();
		var7.ah();
		return var14;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb cs(yb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = var1;
		return var0;
	}

	lk() throws Throwable {
		throw new Error();
	}
}
