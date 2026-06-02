import java.util.Arrays;
import java.util.Objects;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uy")
public class uy {
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float va_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float bs_fld;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static uy pl_fld = new uy();
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float jj_fld;
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ki_fld;
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ja_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] ae_fld;
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float nz_fld;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float rw_fld;
	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float my_fld;
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ih_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float bp_fld;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float kh_fld;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float hj_fld;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ok_fld;
	@ObfuscatedName("xv")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float xv_fld;
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float or_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Luy;"
	)
	static uy[] ag_fld = new uy[uy.az_fld];
	@ObfuscatedGetter(
		intValue = 848250219
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld = 0;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float hx_fld;
	@ObfuscatedGetter(
		intValue = 1142885095
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld = 1745259888;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aw() {
		this.ja_fld = 1.0F;
		this.bs_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.va_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.or_fld = 1.0F;
		this.rw_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.ki_fld = 0.0F;
		this.jj_fld = 0.0F;
		this.ih_fld = 1.0F;
		this.hj_fld = 0.0F;
		this.kh_fld = 0.0F;
		this.my_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.nz_fld = 1.0F;
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Luc;)V"
	)
	public void or(uc var1) {
		this.aa(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Luy;Lul;)V"
	)
	public static void ax(uy var0, ul var1) {
		if (var0 == null) {
			var0.getClass();
		}

		float var2 = var1.ak_fld.aw_fld * var1.ak_fld.aw_fld;
		float var3 = var1.ak_fld.av_fld * var1.ak_fld.aw_fld;
		float var4 = var1.ak_fld.aw_fld * var1.ak_fld.ae_fld;
		float var5 = var1.ak_fld.ah_fld * var1.ak_fld.aw_fld;
		float var6 = var1.ak_fld.av_fld * var1.ak_fld.av_fld;
		float var7 = var1.ak_fld.ae_fld * var1.ak_fld.av_fld;
		float var8 = var1.ak_fld.av_fld * var1.ak_fld.ah_fld;
		float var9 = var1.ak_fld.ae_fld * var1.ak_fld.ae_fld;
		float var10 = var1.ak_fld.ah_fld * var1.ak_fld.ae_fld;
		float var11 = var1.ak_fld.ah_fld * var1.ak_fld.ah_fld;
		var0.ja_fld = var2 + var6 - var11 - var9;
		var0.bs_fld = var5 + (var5 + var7 + var7);
		var0.bp_fld = var8 - var4 - var4 + var8;
		var0.hx_fld = var7 - var5 - var5 + var7;
		var0.or_fld = var2 + var9 - var6 - var11;
		var0.rw_fld = var3 + (var10 + (var10 + var3));
		var0.ki_fld = var4 + (var8 + var4 + var8);
		var0.jj_fld = var10 + (var10 - var3 - var3);
		var0.ih_fld = var2 + var11 - var9 - var6;
		float[] var12 = var0.ae_fld;
		float[] var13 = var0.ae_fld;
		var0.hj_fld = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		var0.kh_fld = var1.ag_fld.ay_fld;
		var0.my_fld = var1.ag_fld.as_fld;
		var0.xv_fld = var1.ag_fld.ar_fld;
		var0.nz_fld = 1.0F;
	}

	public uy(xi var1, boolean var2) {
		this.ek(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		synchronized (ag_fld) {
			if (av_fld < az_fld) {
				ag_fld[(av_fld += 1453506371) * 848250219 - 1] = this;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;ZI)V"
	)
	void av(xi var1, boolean var2, int var3) {
		if (var2) {
			xi var4 = var1;
			uy var8 = this;
			int var6 = -1493871898;
			if (var2) {
				uc var7 = new uc();
				var7.ag(dk.ak(var1.cz(), (byte)4));
				var7.az(dk.ak(var1.cz(), (byte)4));
				var7.av(dk.ak(var1.cz(), (byte)4));
				uc.nz(var7, var1.cz(), var1.cz(), var1.cz(), -405011595);
				this.aa(var7);
			} else {
				for (int var9 = 0; var9 < 16; var9++) {
					var8.ae_fld[var9] = var4.ci();
				}
			}
		} else {
			this.ja_fld = var1.if_();
			this.bs_fld = var1.if_();
			this.bp_fld = var1.if_();
			this.va_fld = var1.if_();
			this.hx_fld = var1.if_();
			this.or_fld = var1.if_();
			this.rw_fld = var1.if_();
			this.ok_fld = var1.if_();
			this.ki_fld = var1.if_();
			this.jj_fld = var1.if_();
			this.ih_fld = var1.if_();
			this.hj_fld = var1.if_();
			this.kh_fld = var1.if_();
			this.my_fld = var1.if_();
			this.xv_fld = var1.if_();
			this.nz_fld = var1.if_();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] ah() {
		float[] var2 = new float[]{(float)(-Math.asin(this.rw_fld)), 0.0F, 0.0F};
		double var3 = Math.cos(var2[0]);
		if (Math.abs(var3) > 0.005) {
			double var5 = this.bp_fld;
			double var7 = this.ih_fld;
			double var9 = this.hx_fld;
			double var11 = this.or_fld;
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			double var13 = this.bs_fld;
			double var14 = this.ja_fld;
			if (this.rw_fld < 0.0F) {
				var2[1] = (float)Math.atan2(var13, var14);
			} else {
				var2[1] = (float)(-Math.atan2(var13, var14));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "(Luy;Lul;)V"
	)
	public static void ru(uy var0, ul var1) {
		if (var0 == null) {
			var0.getClass();
		}

		float var2 = var1.ak_fld.aw_fld * var1.ak_fld.aw_fld;
		float var3 = var1.ak_fld.av_fld * var1.ak_fld.aw_fld;
		float var4 = var1.ak_fld.aw_fld * var1.ak_fld.ae_fld;
		float var5 = var1.ak_fld.ah_fld * var1.ak_fld.aw_fld;
		float var6 = var1.ak_fld.av_fld * var1.ak_fld.av_fld;
		float var7 = var1.ak_fld.ae_fld * var1.ak_fld.av_fld;
		float var8 = var1.ak_fld.av_fld * var1.ak_fld.ah_fld;
		float var9 = var1.ak_fld.ae_fld * var1.ak_fld.ae_fld;
		float var10 = var1.ak_fld.ah_fld * var1.ak_fld.ae_fld;
		float var11 = var1.ak_fld.ah_fld * var1.ak_fld.ah_fld;
		var0.ja_fld = var2 + var6 - var11 - var9;
		var0.bs_fld = var5 + (var5 + var7 + var7);
		var0.bp_fld = var8 - var4 - var4 + var8;
		var0.hx_fld = var7 - var5 - var5 + var7;
		var0.or_fld = var2 + var9 - var6 - var11;
		var0.rw_fld = var3 + (var10 + (var10 + var3));
		var0.ki_fld = var4 + (var8 + var4 + var8);
		var0.jj_fld = var10 + (var10 - var3 - var3);
		var0.ih_fld = var2 + var11 - var9 - var6;
		float[] var12 = var0.ae_fld;
		float[] var13 = var0.ae_fld;
		var0.hj_fld = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		var0.kh_fld = var1.ag_fld.ay_fld;
		var0.my_fld = var1.ag_fld.as_fld;
		var0.xv_fld = var1.ag_fld.ar_fld;
		var0.nz_fld = 1.0F;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public static void fr(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		float var1 = 1.0F / var0.ai();
		float var2 = (
				var0.ih_fld * var0.or_fld * var0.nz_fld
					- var0.xv_fld * (var0.hj_fld * var0.or_fld)
					- var0.rw_fld * var0.jj_fld * var0.nz_fld
					+ var0.my_fld * (var0.hj_fld * var0.rw_fld)
					+ var0.xv_fld * (var0.jj_fld * var0.ok_fld)
					- var0.ih_fld * var0.ok_fld * var0.my_fld
			)
			* var1;
		float var3 = var1
			* (
				var0.ih_fld * var0.va_fld * var0.my_fld
					+ (
						var0.xv_fld * (var0.bs_fld * var0.hj_fld)
							+ var0.nz_fld * (-var0.bs_fld * var0.ih_fld)
							+ var0.bp_fld * var0.jj_fld * var0.nz_fld
							- var0.my_fld * (var0.hj_fld * var0.bp_fld)
							- var0.xv_fld * (var0.va_fld * var0.jj_fld)
					)
			);
		float var4 = var1
			* (
				var0.rw_fld * var0.bs_fld * var0.nz_fld
					- var0.bs_fld * var0.ok_fld * var0.xv_fld
					- var0.bp_fld * var0.or_fld * var0.nz_fld
					+ var0.ok_fld * var0.bp_fld * var0.my_fld
					+ var0.or_fld * var0.va_fld * var0.xv_fld
					- var0.rw_fld * var0.va_fld * var0.my_fld
			);
		float var5 = var1
			* (
				var0.jj_fld * (var0.va_fld * var0.rw_fld)
					+ (
						var0.bp_fld * var0.or_fld * var0.hj_fld
							+ (-var0.bs_fld * var0.rw_fld * var0.hj_fld + var0.bs_fld * var0.ok_fld * var0.ih_fld)
							- var0.jj_fld * (var0.ok_fld * var0.bp_fld)
							- var0.or_fld * var0.va_fld * var0.ih_fld
					)
			);
		float var6 = (
				var0.nz_fld * (var0.ki_fld * var0.rw_fld)
					+ (var0.xv_fld * (var0.hj_fld * var0.hx_fld) + var0.nz_fld * (-var0.hx_fld * var0.ih_fld))
					- var0.rw_fld * var0.hj_fld * var0.kh_fld
					- var0.xv_fld * (var0.ok_fld * var0.ki_fld)
					+ var0.kh_fld * (var0.ih_fld * var0.ok_fld)
			)
			* var1;
		float var7 = (
				var0.ih_fld * var0.ja_fld * var0.nz_fld
					- var0.hj_fld * var0.ja_fld * var0.xv_fld
					- var0.ki_fld * var0.bp_fld * var0.nz_fld
					+ var0.kh_fld * (var0.hj_fld * var0.bp_fld)
					+ var0.xv_fld * (var0.ki_fld * var0.va_fld)
					- var0.kh_fld * (var0.ih_fld * var0.va_fld)
			)
			* var1;
		float var8 = (
				var0.nz_fld * (var0.hx_fld * var0.bp_fld)
					+ (var0.xv_fld * (var0.ja_fld * var0.ok_fld) + var0.nz_fld * (-var0.ja_fld * var0.rw_fld))
					- var0.bp_fld * var0.ok_fld * var0.kh_fld
					- var0.xv_fld * (var0.hx_fld * var0.va_fld)
					+ var0.kh_fld * (var0.rw_fld * var0.va_fld)
			)
			* var1;
		float var9 = (
				var0.va_fld * var0.hx_fld * var0.ih_fld
					+ (
						var0.hj_fld * (var0.rw_fld * var0.ja_fld)
							- var0.ok_fld * var0.ja_fld * var0.ih_fld
							- var0.bp_fld * var0.hx_fld * var0.hj_fld
							+ var0.ki_fld * (var0.bp_fld * var0.ok_fld)
					)
					- var0.ki_fld * (var0.rw_fld * var0.va_fld)
			)
			* var1;
		float var10 = var1
			* (
				var0.jj_fld * var0.hx_fld * var0.nz_fld
					- var0.hj_fld * var0.hx_fld * var0.my_fld
					- var0.or_fld * var0.ki_fld * var0.nz_fld
					+ var0.kh_fld * (var0.hj_fld * var0.or_fld)
					+ var0.my_fld * (var0.ok_fld * var0.ki_fld)
					- var0.ok_fld * var0.jj_fld * var0.kh_fld
			);
		float var11 = (
				var0.hj_fld * var0.ja_fld * var0.my_fld
					+ -var0.ja_fld * var0.jj_fld * var0.nz_fld
					+ var0.ki_fld * var0.bs_fld * var0.nz_fld
					- var0.bs_fld * var0.hj_fld * var0.kh_fld
					- var0.ki_fld * var0.va_fld * var0.my_fld
					+ var0.kh_fld * (var0.va_fld * var0.jj_fld)
			)
			* var1;
		float var12 = (
				var0.bs_fld * var0.ok_fld * var0.kh_fld
					+ (var0.nz_fld * (var0.or_fld * var0.ja_fld) - var0.my_fld * (var0.ok_fld * var0.ja_fld) - var0.nz_fld * (var0.hx_fld * var0.bs_fld))
					+ var0.va_fld * var0.hx_fld * var0.my_fld
					- var0.kh_fld * (var0.or_fld * var0.va_fld)
			)
			* var1;
		float var13 = var1
			* (
				var0.ki_fld * (var0.va_fld * var0.or_fld)
					+ (
						var0.ok_fld * var0.ja_fld * var0.jj_fld
							+ var0.hj_fld * (-var0.ja_fld * var0.or_fld)
							+ var0.hx_fld * var0.bs_fld * var0.hj_fld
							- var0.ok_fld * var0.bs_fld * var0.ki_fld
							- var0.jj_fld * (var0.hx_fld * var0.va_fld)
					)
			);
		float var14 = var1
			* (
				var0.jj_fld * var0.rw_fld * var0.kh_fld
					+ (
						var0.xv_fld * (var0.ki_fld * var0.or_fld)
							+ (var0.xv_fld * (-var0.hx_fld * var0.jj_fld) + var0.hx_fld * var0.ih_fld * var0.my_fld)
							- var0.kh_fld * (var0.or_fld * var0.ih_fld)
							- var0.my_fld * (var0.rw_fld * var0.ki_fld)
					)
			);
		float var15 = (
				var0.bs_fld * var0.ih_fld * var0.kh_fld
					+ (var0.ja_fld * var0.jj_fld * var0.xv_fld - var0.ih_fld * var0.ja_fld * var0.my_fld - var0.xv_fld * (var0.ki_fld * var0.bs_fld))
					+ var0.my_fld * (var0.bp_fld * var0.ki_fld)
					- var0.bp_fld * var0.jj_fld * var0.kh_fld
			)
			* var1;
		float var16 = (
				var0.rw_fld * var0.ja_fld * var0.my_fld
					+ var0.or_fld * -var0.ja_fld * var0.xv_fld
					+ var0.xv_fld * (var0.hx_fld * var0.bs_fld)
					- var0.rw_fld * var0.bs_fld * var0.kh_fld
					- var0.hx_fld * var0.bp_fld * var0.my_fld
					+ var0.kh_fld * (var0.bp_fld * var0.or_fld)
			)
			* var1;
		float var17 = (
				var0.jj_fld * (var0.bp_fld * var0.hx_fld)
					+ (
						var0.or_fld * var0.ja_fld * var0.ih_fld
							- var0.rw_fld * var0.ja_fld * var0.jj_fld
							- var0.hx_fld * var0.bs_fld * var0.ih_fld
							+ var0.rw_fld * var0.bs_fld * var0.ki_fld
					)
					- var0.ki_fld * (var0.or_fld * var0.bp_fld)
			)
			* var1;
		var0.ja_fld = var2;
		var0.bs_fld = var3;
		var0.bp_fld = var4;
		var0.va_fld = var5;
		var0.hx_fld = var6;
		var0.or_fld = var7;
		var0.rw_fld = var8;
		var0.ok_fld = var9;
		var0.ki_fld = var10;
		var0.jj_fld = var11;
		var0.ih_fld = var12;
		var0.hj_fld = var13;
		var0.kh_fld = var14;
		var0.my_fld = var15;
		var0.xv_fld = var16;
		var0.nz_fld = var17;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void cc(float var1, float var2, float var3) {
		this.aw();
		this.ja_fld = var1;
		this.or_fld = var2;
		this.ih_fld = var3;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public void cn(ul var1) {
		float var2 = var1.ak_fld.aw_fld * var1.ak_fld.aw_fld;
		float var3 = var1.ak_fld.av_fld * var1.ak_fld.aw_fld;
		float var4 = var1.ak_fld.aw_fld * var1.ak_fld.ae_fld;
		float var5 = var1.ak_fld.ah_fld * var1.ak_fld.aw_fld;
		float var6 = var1.ak_fld.av_fld * var1.ak_fld.av_fld;
		float var7 = var1.ak_fld.ae_fld * var1.ak_fld.av_fld;
		float var8 = var1.ak_fld.av_fld * var1.ak_fld.ah_fld;
		float var9 = var1.ak_fld.ae_fld * var1.ak_fld.ae_fld;
		float var10 = var1.ak_fld.ah_fld * var1.ak_fld.ae_fld;
		float var11 = var1.ak_fld.ah_fld * var1.ak_fld.ah_fld;
		this.ja_fld = var2 + var6 - var11 - var9;
		this.bs_fld = var5 + (var5 + var7 + var7);
		this.bp_fld = var8 - var4 - var4 + var8;
		this.hx_fld = var7 - var5 - var5 + var7;
		this.or_fld = var2 + var9 - var6 - var11;
		this.rw_fld = var3 + (var10 + (var10 + var3));
		this.ki_fld = var4 + (var8 + var4 + var8);
		this.jj_fld = var10 + (var10 - var3 - var3);
		this.ih_fld = var2 + var11 - var9 - var6;
		float[] var12 = this.ae_fld;
		float[] var13 = this.ae_fld;
		this.hj_fld = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.kh_fld = var1.ag_fld.ay_fld;
		this.my_fld = var1.ag_fld.as_fld;
		this.xv_fld = var1.ag_fld.ar_fld;
		this.nz_fld = 1.0F;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void ar(float var1) {
		bg(this, var1, var1, var1, 1971846051);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void au(uy var1) {
		this.ja_fld = this.ja_fld + var1.ja_fld;
		this.bs_fld = this.bs_fld + var1.bs_fld;
		this.bp_fld = this.bp_fld + var1.bp_fld;
		this.va_fld = this.va_fld + var1.va_fld;
		this.hx_fld = this.hx_fld + var1.hx_fld;
		this.or_fld = this.or_fld + var1.or_fld;
		this.rw_fld = this.rw_fld + var1.rw_fld;
		this.ok_fld = this.ok_fld + var1.ok_fld;
		this.ki_fld = this.ki_fld + var1.ki_fld;
		this.jj_fld = this.jj_fld + var1.jj_fld;
		this.ih_fld = this.ih_fld + var1.ih_fld;
		this.hj_fld = this.hj_fld + var1.hj_fld;
		this.kh_fld = this.kh_fld + var1.kh_fld;
		this.my_fld = this.my_fld + var1.my_fld;
		this.xv_fld = this.xv_fld + var1.xv_fld;
		this.nz_fld = this.nz_fld + var1.nz_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float ay(float var1, float var2, float var3) {
		return this.ap(var1, var2, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void al(uy var1) {
		float var3 = this.bp_fld * var1.ki_fld + (var1.ja_fld * this.ja_fld + this.bs_fld * var1.hx_fld) + this.va_fld * var1.kh_fld;
		float var4 = var1.my_fld * this.va_fld + (var1.bs_fld * this.ja_fld + this.bs_fld * var1.or_fld + var1.jj_fld * this.bp_fld);
		float var5 = this.va_fld * var1.xv_fld + (this.ja_fld * var1.bp_fld + this.bs_fld * var1.rw_fld + this.bp_fld * var1.ih_fld);
		float var6 = var1.nz_fld * this.va_fld + (this.bp_fld * var1.hj_fld + (var1.ok_fld * this.bs_fld + this.ja_fld * var1.va_fld));
		float var7 = var1.kh_fld * this.ok_fld + (var1.ki_fld * this.rw_fld + (this.hx_fld * var1.ja_fld + this.or_fld * var1.hx_fld));
		float var8 = this.or_fld * var1.or_fld + var1.bs_fld * this.hx_fld + var1.jj_fld * this.rw_fld + var1.my_fld * this.ok_fld;
		float var9 = var1.bp_fld * this.hx_fld + this.or_fld * var1.rw_fld + this.rw_fld * var1.ih_fld + this.ok_fld * var1.xv_fld;
		float var10 = this.ok_fld * var1.nz_fld + (var1.ok_fld * this.or_fld + var1.va_fld * this.hx_fld + this.rw_fld * var1.hj_fld);
		float var11 = this.hj_fld * var1.kh_fld + (this.ih_fld * var1.ki_fld + (var1.hx_fld * this.jj_fld + var1.ja_fld * this.ki_fld));
		float var12 = var1.bs_fld * this.ki_fld + this.jj_fld * var1.or_fld + this.ih_fld * var1.jj_fld + this.hj_fld * var1.my_fld;
		float var13 = this.ih_fld * var1.ih_fld + (this.jj_fld * var1.rw_fld + this.ki_fld * var1.bp_fld) + var1.xv_fld * this.hj_fld;
		float var14 = var1.va_fld * this.ki_fld + var1.ok_fld * this.jj_fld + this.ih_fld * var1.hj_fld + this.hj_fld * var1.nz_fld;
		float var15 = var1.kh_fld * this.nz_fld + (var1.ki_fld * this.xv_fld + (this.my_fld * var1.hx_fld + this.kh_fld * var1.ja_fld));
		float var16 = var1.bs_fld * this.kh_fld + var1.or_fld * this.my_fld + this.xv_fld * var1.jj_fld + var1.my_fld * this.nz_fld;
		float var17 = var1.xv_fld * this.nz_fld + (var1.rw_fld * this.my_fld + this.kh_fld * var1.bp_fld + var1.ih_fld * this.xv_fld);
		float var18 = this.kh_fld * var1.va_fld + var1.ok_fld * this.my_fld + var1.hj_fld * this.xv_fld + this.nz_fld * var1.nz_fld;
		this.ja_fld = var3;
		this.bs_fld = var4;
		this.bp_fld = var5;
		this.va_fld = var6;
		this.hx_fld = var7;
		this.or_fld = var8;
		this.rw_fld = var9;
		this.ok_fld = var10;
		this.ki_fld = var11;
		this.jj_fld = var12;
		this.ih_fld = var13;
		this.hj_fld = var14;
		this.kh_fld = var15;
		this.my_fld = var16;
		this.xv_fld = var17;
		this.nz_fld = var18;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public void ax(ul var1) {
		float var3 = var1.ak_fld.aw_fld * var1.ak_fld.aw_fld;
		float var4 = var1.ak_fld.aw_fld * var1.ak_fld.av_fld;
		float var5 = var1.ak_fld.ae_fld * var1.ak_fld.aw_fld;
		float var6 = var1.ak_fld.ah_fld * var1.ak_fld.aw_fld;
		float var7 = var1.ak_fld.av_fld * var1.ak_fld.av_fld;
		float var8 = var1.ak_fld.ae_fld * var1.ak_fld.av_fld;
		float var9 = var1.ak_fld.ah_fld * var1.ak_fld.av_fld;
		float var10 = var1.ak_fld.ae_fld * var1.ak_fld.ae_fld;
		float var11 = var1.ak_fld.ah_fld * var1.ak_fld.ae_fld;
		float var12 = var1.ak_fld.ah_fld * var1.ak_fld.ah_fld;
		this.ja_fld = var3 + var7 - var12 - var10;
		this.bs_fld = var6 + var8 + var6 + var8;
		this.bp_fld = var9 - var5 - var5 + var9;
		this.hx_fld = var8 - var6 - var6 + var8;
		this.or_fld = var3 + var10 - var7 - var12;
		this.rw_fld = var11 + var11 + var4 + var4;
		this.ki_fld = var9 + var9 + var5 + var5;
		this.jj_fld = var11 - var4 - var4 + var11;
		this.ih_fld = var3 + var12 - var10 - var7;
		this.hj_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.va_fld = 0.0F;
		this.kh_fld = var1.ag_fld.ay_fld;
		this.my_fld = var1.ag_fld.as_fld;
		this.xv_fld = var1.ag_fld.ar_fld;
		this.nz_fld = 1.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luc;)V"
	)
	public void aa(uc var1) {
		this.ja_fld = var1.ak_fld;
		this.bs_fld = var1.ag_fld;
		this.bp_fld = var1.az_fld;
		this.va_fld = 0.0F;
		this.hx_fld = var1.av_fld;
		this.or_fld = var1.ae_fld;
		this.rw_fld = var1.ah_fld;
		this.ok_fld = 0.0F;
		this.ki_fld = var1.aw_fld;
		this.jj_fld = var1.ay_fld;
		this.ih_fld = var1.as_fld;
		this.hj_fld = 0.0F;
		this.kh_fld = var1.ar_fld;
		this.my_fld = var1.af_fld;
		this.xv_fld = var1.al_fld;
		this.nz_fld = 1.0F;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float ai() {
		return this.jj_fld * (this.va_fld * this.rw_fld) * this.kh_fld
			+ (
				this.my_fld * (this.ih_fld * (this.va_fld * this.hx_fld))
					+ (
						this.nz_fld * (this.rw_fld * this.bs_fld * this.ki_fld)
							+ (
								this.xv_fld * (this.bs_fld * this.hx_fld * this.hj_fld)
									+ (
										this.ja_fld * this.or_fld * this.ih_fld * this.nz_fld
											- this.hj_fld * (this.or_fld * this.ja_fld) * this.xv_fld
											- this.jj_fld * (this.ja_fld * this.rw_fld) * this.nz_fld
											+ this.my_fld * (this.hj_fld * (this.ja_fld * this.rw_fld))
											+ this.xv_fld * (this.ja_fld * this.ok_fld * this.jj_fld)
											- this.ja_fld * this.ok_fld * this.ih_fld * this.my_fld
											- this.nz_fld * (this.hx_fld * this.bs_fld * this.ih_fld)
									)
							)
							- this.hj_fld * (this.bs_fld * this.rw_fld) * this.kh_fld
							- this.xv_fld * (this.ki_fld * (this.ok_fld * this.bs_fld))
							+ this.kh_fld * (this.bs_fld * this.ok_fld * this.ih_fld)
							+ this.nz_fld * (this.bp_fld * this.hx_fld * this.jj_fld)
							- this.my_fld * (this.hj_fld * (this.bp_fld * this.hx_fld))
							- this.or_fld * this.bp_fld * this.ki_fld * this.nz_fld
							+ this.kh_fld * (this.bp_fld * this.or_fld * this.hj_fld)
							+ this.ki_fld * (this.bp_fld * this.ok_fld) * this.my_fld
							- this.kh_fld * (this.ok_fld * this.bp_fld * this.jj_fld)
							- this.xv_fld * (this.jj_fld * (this.hx_fld * this.va_fld))
					)
					+ this.xv_fld * (this.or_fld * this.va_fld * this.ki_fld)
					- this.kh_fld * (this.ih_fld * (this.or_fld * this.va_fld))
					- this.ki_fld * (this.rw_fld * this.va_fld) * this.my_fld
			);
	}

	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void sa(uy var1) {
		this.al(var1);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cu() {
		this.aq();
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void cg(uz var1) {
		float var2 = var1.aw_fld * var1.aw_fld;
		float var3 = var1.aw_fld * var1.av_fld;
		float var4 = var1.aw_fld * var1.ae_fld;
		float var5 = var1.ah_fld * var1.aw_fld;
		float var6 = var1.av_fld * var1.av_fld;
		float var7 = var1.av_fld * var1.ae_fld;
		float var8 = var1.av_fld * var1.ah_fld;
		float var9 = var1.ae_fld * var1.ae_fld;
		float var10 = var1.ae_fld * var1.ah_fld;
		float var11 = var1.ah_fld * var1.ah_fld;
		this.ja_fld = var6 + var2 - var11 - var9;
		this.bs_fld = var5 + (var7 + (var5 + var7));
		this.bp_fld = var8 + (var8 - var4 - var4);
		this.hx_fld = var7 + (var7 - var5 - var5);
		this.or_fld = var9 + var2 - var6 - var11;
		this.rw_fld = var3 + (var10 + var3 + var10);
		this.ki_fld = var4 + (var4 + var8 + var8);
		this.jj_fld = var10 - var3 - var3 + var10;
		this.ih_fld = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float co() {
		return this.jj_fld * (this.va_fld * this.rw_fld) * this.kh_fld
			+ (
				this.my_fld * (this.ih_fld * (this.va_fld * this.hx_fld))
					+ (
						this.nz_fld * (this.rw_fld * this.bs_fld * this.ki_fld)
							+ (
								this.xv_fld * (this.bs_fld * this.hx_fld * this.hj_fld)
									+ (
										this.ja_fld * this.or_fld * this.ih_fld * this.nz_fld
											- this.hj_fld * (this.or_fld * this.ja_fld) * this.xv_fld
											- this.jj_fld * (this.ja_fld * this.rw_fld) * this.nz_fld
											+ this.my_fld * (this.hj_fld * (this.ja_fld * this.rw_fld))
											+ this.xv_fld * (this.ja_fld * this.ok_fld * this.jj_fld)
											- this.ja_fld * this.ok_fld * this.ih_fld * this.my_fld
											- this.nz_fld * (this.hx_fld * this.bs_fld * this.ih_fld)
									)
							)
							- this.hj_fld * (this.bs_fld * this.rw_fld) * this.kh_fld
							- this.xv_fld * (this.ki_fld * (this.ok_fld * this.bs_fld))
							+ this.kh_fld * (this.bs_fld * this.ok_fld * this.ih_fld)
							+ this.nz_fld * (this.bp_fld * this.hx_fld * this.jj_fld)
							- this.my_fld * (this.hj_fld * (this.bp_fld * this.hx_fld))
							- this.or_fld * this.bp_fld * this.ki_fld * this.nz_fld
							+ this.kh_fld * (this.bp_fld * this.or_fld * this.hj_fld)
							+ this.ki_fld * (this.bp_fld * this.ok_fld) * this.my_fld
							- this.kh_fld * (this.ok_fld * this.bp_fld * this.jj_fld)
							- this.xv_fld * (this.jj_fld * (this.hx_fld * this.va_fld))
					)
					+ this.xv_fld * (this.or_fld * this.va_fld * this.ki_fld)
					- this.kh_fld * (this.ih_fld * (this.or_fld * this.va_fld))
					- this.ki_fld * (this.rw_fld * this.va_fld) * this.my_fld
			);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFF)Ltu;"
	)
	public tu ao(float var1, float var2, float var3) {
		float var5 = 1.0F / (this.nz_fld + (var1 * this.va_fld + var2 * this.ok_fld + this.hj_fld * var3));
		return sh.ak(
			var5 * (this.kh_fld + (var3 * this.ki_fld + (this.ja_fld * var1 + var2 * this.hx_fld))),
			(var2 * this.or_fld + var1 * this.bs_fld + var3 * this.jj_fld + this.my_fld) * var5,
			(this.xv_fld + (var3 * this.ih_fld + (this.rw_fld * var2 + this.bp_fld * var1))) * var5
		);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float at(float var1, float var2, float var3) {
		return this.kh_fld + (this.ki_fld * var3 + (this.ja_fld * var1 + var2 * this.hx_fld));
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFFI)V"
	)
	public static void bg(uy var0, float var1, float var2, float var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aw();
			var0.ja_fld = var1;
			var0.or_fld = var2;
			var0.ih_fld = var3;
		}
	}

	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void wi(uy var1) {
		this.au(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float ab(float var1, float var2, float var3) {
		return var1 * this.bp_fld + this.rw_fld * var2 + this.ih_fld * var3 + this.xv_fld;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return "Mat4{m0="
			+ this.ja_fld
			+ ", m1="
			+ this.bs_fld
			+ ", m2="
			+ this.bp_fld
			+ ", m3="
			+ this.va_fld
			+ ", m4="
			+ this.hx_fld
			+ ", m5="
			+ this.or_fld
			+ ", m6="
			+ this.rw_fld
			+ ", m7="
			+ this.ok_fld
			+ ", m8="
			+ this.ki_fld
			+ ", m9="
			+ this.jj_fld
			+ ", m10="
			+ this.ih_fld
			+ ", m11="
			+ this.hj_fld
			+ ", m12="
			+ this.kh_fld
			+ ", m13="
			+ this.my_fld
			+ ", m14="
			+ this.xv_fld
			+ ", m15="
			+ this.nz_fld
			+ "}";
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		return Objects.hash(
			(Object[])(new Object[]{
				this.ja_fld,
				this.bs_fld,
				this.bp_fld,
				this.va_fld,
				this.hx_fld,
				this.or_fld,
				this.rw_fld,
				this.ok_fld,
				this.ki_fld,
				this.jj_fld,
				this.ih_fld,
				this.hj_fld,
				this.kh_fld,
				this.my_fld,
				this.xv_fld,
				this.nz_fld
			})
		);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bu() {
		dc(this, 7063493);
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public static void wt(uy var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ja_fld = 0.0F;
			var0.bs_fld = 0.0F;
			var0.bp_fld = 0.0F;
			var0.va_fld = 0.0F;
			var0.hx_fld = 0.0F;
			var0.or_fld = 0.0F;
			var0.rw_fld = 0.0F;
			var0.ok_fld = 0.0F;
			var0.ki_fld = 0.0F;
			var0.jj_fld = 0.0F;
			var0.ih_fld = 0.0F;
			var0.hj_fld = 0.0F;
			var0.kh_fld = 0.0F;
			var0.my_fld = 0.0F;
			var0.xv_fld = 0.0F;
			var0.nz_fld = 0.0F;
		}
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else if (var1 != null && this.getClass() == var1.getClass()) {
			uy var2 = (uy)var1;
			return Float.compare(var2.ja_fld, this.ja_fld) == 0
				&& Float.compare(var2.bs_fld, this.bs_fld) == 0
				&& Float.compare(var2.bp_fld, this.bp_fld) == 0
				&& Float.compare(var2.va_fld, this.va_fld) == 0
				&& Float.compare(var2.hx_fld, this.hx_fld) == 0
				&& Float.compare(var2.or_fld, this.or_fld) == 0
				&& Float.compare(var2.rw_fld, this.rw_fld) == 0
				&& Float.compare(var2.ok_fld, this.ok_fld) == 0
				&& Float.compare(var2.ki_fld, this.ki_fld) == 0
				&& Float.compare(var2.jj_fld, this.jj_fld) == 0
				&& Float.compare(var2.ih_fld, this.ih_fld) == 0
				&& Float.compare(var2.hj_fld, this.hj_fld) == 0
				&& Float.compare(var2.kh_fld, this.kh_fld) == 0
				&& Float.compare(var2.my_fld, this.my_fld) == 0
				&& Float.compare(var2.xv_fld, this.xv_fld) == 0
				&& Float.compare(var2.nz_fld, this.nz_fld) == 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] ac() {
		float[] var2 = new float[3];
		tu var3 = new tu(this.ja_fld, this.bs_fld, this.bp_fld);
		tu var4 = new tu(this.hx_fld, this.or_fld, this.rw_fld);
		tu var5 = new tu(this.ki_fld, this.jj_fld, this.ih_fld);
		var2[0] = var3.aq();
		var2[1] = var4.aq();
		var2[2] = var5.aq();
		return var2;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)V"
	)
	public void dc(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.ki_fld * var3 + (this.hx_fld * var2 + var1 * this.ja_fld) + this.kh_fld;
		var4[1] = this.bs_fld * var1 + var2 * this.or_fld + var3 * this.jj_fld + this.my_fld;
		var4[2] = var1 * this.bp_fld + this.rw_fld * var2 + var3 * this.ih_fld + this.xv_fld;
		if (var4.length > 3) {
			var4[3] = this.va_fld * var1 + this.ok_fld * var2 + var3 * this.hj_fld + this.nz_fld;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float ap(float var1, float var2, float var3) {
		return this.my_fld + (this.bs_fld * var1 + var2 * this.or_fld + var3 * this.jj_fld);
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		StringBuilder var1 = new StringBuilder();
		this.ah();
		this.ae();

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 4; var3++) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.ae_fld[4 * var2 + var3];
				if (Math.sqrt(var4 * var4) < 1.0E-4F) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luy;Lxi;Z)V"
	)
	public static void ar(uy var0, xi var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2) {
			uc var3 = new uc();
			var3.ag(dk.ak(var1.cz(), (byte)4));
			var3.az(dk.ak(var1.cz(), (byte)4));
			var3.av(dk.ak(var1.cz(), (byte)4));
			uc.nz(var3, var1.cz(), var1.cz(), var1.cz(), -405011595);
			var0.aa(var3);
		} else {
			for (int var4 = 0; var4 < 16; var4++) {
				var0.ae_fld[var4] = var1.ci();
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Z)V"
	)
	void bf(xi var1, boolean var2) {
		if (var2) {
			uc var3 = new uc();
			var3.ag(dk.ak(var1.cz(), (byte)4));
			var3.az(dk.ak(var1.cz(), (byte)4));
			var3.av(dk.ak(var1.cz(), (byte)4));
			uc.nz(var3, var1.cz(), var1.cz(), var1.cz(), -405011595);
			this.aa(var3);
		} else {
			for (int var4 = 0; var4 < 16; var4++) {
				this.ae_fld[var4] = var1.ci();
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		if (!(var1 instanceof uy)) {
			return false;
		} else {
			uy var2 = (uy)var1;

			for (int var3 = 0; var3 < 16; var3++) {
				if (this.ae_fld[var3] != var2.ae_fld[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void ya(float var1, float var2, float var3, float var4) {
		tm(this, var1, var2, var3, var4, 471199979);
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		byte var1 = 31;
		byte var2 = 1;
		return 31 * var2 + Arrays.hashCode(this.ae_fld);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void ec(uz var1) {
		this.an(var1);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public void cr(ul var1) {
		float var2 = var1.ak_fld.aw_fld * var1.ak_fld.aw_fld;
		float var3 = var1.ak_fld.av_fld * var1.ak_fld.aw_fld;
		float var4 = var1.ak_fld.aw_fld * var1.ak_fld.ae_fld;
		float var5 = var1.ak_fld.ah_fld * var1.ak_fld.aw_fld;
		float var6 = var1.ak_fld.av_fld * var1.ak_fld.av_fld;
		float var7 = var1.ak_fld.ae_fld * var1.ak_fld.av_fld;
		float var8 = var1.ak_fld.av_fld * var1.ak_fld.ah_fld;
		float var9 = var1.ak_fld.ae_fld * var1.ak_fld.ae_fld;
		float var10 = var1.ak_fld.ah_fld * var1.ak_fld.ae_fld;
		float var11 = var1.ak_fld.ah_fld * var1.ak_fld.ah_fld;
		this.ja_fld = var2 + var6 - var11 - var9;
		this.bs_fld = var5 + (var5 + var7 + var7);
		this.bp_fld = var8 - var4 - var4 + var8;
		this.hx_fld = var7 - var5 - var5 + var7;
		this.or_fld = var2 + var9 - var6 - var11;
		this.rw_fld = var3 + (var10 + (var10 + var3));
		this.ki_fld = var4 + (var8 + var4 + var8);
		this.jj_fld = var10 + (var10 - var3 - var3);
		this.ih_fld = var2 + var11 - var9 - var6;
		float[] var12 = this.ae_fld;
		float[] var13 = this.ae_fld;
		this.hj_fld = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.kh_fld = var1.ag_fld.ay_fld;
		this.my_fld = var1.ag_fld.as_fld;
		this.xv_fld = var1.ag_fld.ar_fld;
		this.nz_fld = 1.0F;
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		byte var1 = 31;
		byte var2 = 1;
		return 1413458960 * var2 + Arrays.hashCode(this.ae_fld);
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(Luy;)Luy;"
	)
	public static uy pm(uy var0) {
		synchronized (ag_fld) {
			if (av_fld == 0) {
				return new uy(var0);
			} else {
				uy var2 = ag_fld[--av_fld];
				var2.bz_void(var0);
				return var2;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public static uy aj() {
		synchronized (ag_fld) {
			if (0 == av_fld) {
				return new uy();
			} else {
				ag_fld[(av_fld -= 1453506371) * -1114272072].aw();
				return ag_fld[687274211 * av_fld];
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aq() {
		float var2 = 1.0F / this.ai();
		float var3 = (
				this.ih_fld * this.or_fld * this.nz_fld
					- this.xv_fld * (this.hj_fld * this.or_fld)
					- this.rw_fld * this.jj_fld * this.nz_fld
					+ this.my_fld * (this.hj_fld * this.rw_fld)
					+ this.xv_fld * (this.jj_fld * this.ok_fld)
					- this.ih_fld * this.ok_fld * this.my_fld
			)
			* var2;
		float var4 = var2
			* (
				this.ih_fld * this.va_fld * this.my_fld
					+ (
						this.xv_fld * (this.bs_fld * this.hj_fld)
							+ this.nz_fld * (-this.bs_fld * this.ih_fld)
							+ this.bp_fld * this.jj_fld * this.nz_fld
							- this.my_fld * (this.hj_fld * this.bp_fld)
							- this.xv_fld * (this.va_fld * this.jj_fld)
					)
			);
		float var5 = var2
			* (
				this.rw_fld * this.bs_fld * this.nz_fld
					- this.bs_fld * this.ok_fld * this.xv_fld
					- this.bp_fld * this.or_fld * this.nz_fld
					+ this.ok_fld * this.bp_fld * this.my_fld
					+ this.or_fld * this.va_fld * this.xv_fld
					- this.rw_fld * this.va_fld * this.my_fld
			);
		float var6 = var2
			* (
				this.jj_fld * (this.va_fld * this.rw_fld)
					+ (
						this.bp_fld * this.or_fld * this.hj_fld
							+ (-this.bs_fld * this.rw_fld * this.hj_fld + this.bs_fld * this.ok_fld * this.ih_fld)
							- this.jj_fld * (this.ok_fld * this.bp_fld)
							- this.or_fld * this.va_fld * this.ih_fld
					)
			);
		float var7 = (
				this.nz_fld * (this.ki_fld * this.rw_fld)
					+ (this.xv_fld * (this.hj_fld * this.hx_fld) + this.nz_fld * (-this.hx_fld * this.ih_fld))
					- this.rw_fld * this.hj_fld * this.kh_fld
					- this.xv_fld * (this.ok_fld * this.ki_fld)
					+ this.kh_fld * (this.ih_fld * this.ok_fld)
			)
			* var2;
		float var8 = (
				this.ih_fld * this.ja_fld * this.nz_fld
					- this.hj_fld * this.ja_fld * this.xv_fld
					- this.ki_fld * this.bp_fld * this.nz_fld
					+ this.kh_fld * (this.hj_fld * this.bp_fld)
					+ this.xv_fld * (this.ki_fld * this.va_fld)
					- this.kh_fld * (this.ih_fld * this.va_fld)
			)
			* var2;
		float var9 = (
				this.nz_fld * (this.hx_fld * this.bp_fld)
					+ (this.xv_fld * (this.ja_fld * this.ok_fld) + this.nz_fld * (-this.ja_fld * this.rw_fld))
					- this.bp_fld * this.ok_fld * this.kh_fld
					- this.xv_fld * (this.hx_fld * this.va_fld)
					+ this.kh_fld * (this.rw_fld * this.va_fld)
			)
			* var2;
		float var10 = (
				this.va_fld * this.hx_fld * this.ih_fld
					+ (
						this.hj_fld * (this.rw_fld * this.ja_fld)
							- this.ok_fld * this.ja_fld * this.ih_fld
							- this.bp_fld * this.hx_fld * this.hj_fld
							+ this.ki_fld * (this.bp_fld * this.ok_fld)
					)
					- this.ki_fld * (this.rw_fld * this.va_fld)
			)
			* var2;
		float var11 = var2
			* (
				this.jj_fld * this.hx_fld * this.nz_fld
					- this.hj_fld * this.hx_fld * this.my_fld
					- this.or_fld * this.ki_fld * this.nz_fld
					+ this.kh_fld * (this.hj_fld * this.or_fld)
					+ this.my_fld * (this.ok_fld * this.ki_fld)
					- this.ok_fld * this.jj_fld * this.kh_fld
			);
		float var12 = (
				this.hj_fld * this.ja_fld * this.my_fld
					+ -this.ja_fld * this.jj_fld * this.nz_fld
					+ this.ki_fld * this.bs_fld * this.nz_fld
					- this.bs_fld * this.hj_fld * this.kh_fld
					- this.ki_fld * this.va_fld * this.my_fld
					+ this.kh_fld * (this.va_fld * this.jj_fld)
			)
			* var2;
		float var13 = (
				this.bs_fld * this.ok_fld * this.kh_fld
					+ (this.nz_fld * (this.or_fld * this.ja_fld) - this.my_fld * (this.ok_fld * this.ja_fld) - this.nz_fld * (this.hx_fld * this.bs_fld))
					+ this.va_fld * this.hx_fld * this.my_fld
					- this.kh_fld * (this.or_fld * this.va_fld)
			)
			* var2;
		float var14 = var2
			* (
				this.ki_fld * (this.va_fld * this.or_fld)
					+ (
						this.ok_fld * this.ja_fld * this.jj_fld
							+ this.hj_fld * (-this.ja_fld * this.or_fld)
							+ this.hx_fld * this.bs_fld * this.hj_fld
							- this.ok_fld * this.bs_fld * this.ki_fld
							- this.jj_fld * (this.hx_fld * this.va_fld)
					)
			);
		float var15 = var2
			* (
				this.jj_fld * this.rw_fld * this.kh_fld
					+ (
						this.xv_fld * (this.ki_fld * this.or_fld)
							+ (this.xv_fld * (-this.hx_fld * this.jj_fld) + this.hx_fld * this.ih_fld * this.my_fld)
							- this.kh_fld * (this.or_fld * this.ih_fld)
							- this.my_fld * (this.rw_fld * this.ki_fld)
					)
			);
		float var16 = (
				this.bs_fld * this.ih_fld * this.kh_fld
					+ (this.ja_fld * this.jj_fld * this.xv_fld - this.ih_fld * this.ja_fld * this.my_fld - this.xv_fld * (this.ki_fld * this.bs_fld))
					+ this.my_fld * (this.bp_fld * this.ki_fld)
					- this.bp_fld * this.jj_fld * this.kh_fld
			)
			* var2;
		float var17 = (
				this.rw_fld * this.ja_fld * this.my_fld
					+ this.or_fld * -this.ja_fld * this.xv_fld
					+ this.xv_fld * (this.hx_fld * this.bs_fld)
					- this.rw_fld * this.bs_fld * this.kh_fld
					- this.hx_fld * this.bp_fld * this.my_fld
					+ this.kh_fld * (this.bp_fld * this.or_fld)
			)
			* var2;
		float var18 = (
				this.jj_fld * (this.bp_fld * this.hx_fld)
					+ (
						this.or_fld * this.ja_fld * this.ih_fld
							- this.rw_fld * this.ja_fld * this.jj_fld
							- this.hx_fld * this.bs_fld * this.ih_fld
							+ this.rw_fld * this.bs_fld * this.ki_fld
					)
					- this.ki_fld * (this.or_fld * this.bp_fld)
			)
			* var2;
		this.ja_fld = var3;
		this.bs_fld = var4;
		this.bp_fld = var5;
		this.va_fld = var6;
		this.hx_fld = var7;
		this.or_fld = var8;
		this.rw_fld = var9;
		this.ok_fld = var10;
		this.ki_fld = var11;
		this.jj_fld = var12;
		this.ih_fld = var13;
		this.hj_fld = var14;
		this.kh_fld = var15;
		this.my_fld = var16;
		this.xv_fld = var17;
		this.nz_fld = var18;
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;B)V"
	)
	public static void nf(uy var0, uy var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ja_fld = var1.ja_fld;
			var0.bs_fld = var1.bs_fld;
			var0.bp_fld = var1.bp_fld;
			var0.va_fld = var1.va_fld;
			var0.hx_fld = var1.hx_fld;
			var0.or_fld = var1.or_fld;
			var0.rw_fld = var1.rw_fld;
			var0.ok_fld = var1.ok_fld;
			var0.ki_fld = var1.ki_fld;
			var0.jj_fld = var1.jj_fld;
			var0.ih_fld = var1.ih_fld;
			var0.hj_fld = var1.hj_fld;
			var0.kh_fld = var1.kh_fld;
			var0.my_fld = var1.my_fld;
			var0.xv_fld = var1.xv_fld;
			var0.nz_fld = var1.nz_fld;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public static void hr(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (ag_fld) {
			if (av_fld < az_fld) {
				ag_fld[(av_fld += 788485024) * 848250219 - 1] = var0;
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFF)F"
	)
	public static float fm(uy var0, float var1, float var2, float var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.my_fld + (var0.bs_fld * var1 + var2 * var0.or_fld + var3 * var0.jj_fld);
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Luy;Ljava/lang/Object;)Z"
	)
	public static boolean mc(uy var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!(var1 instanceof uy)) {
			return false;
		} else {
			uy var2 = (uy)var1;

			for (int var3 = 0; var3 < 16; var3++) {
				if (var0.ae_fld[var3] != var2.ae_fld[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Luy;)Luy;"
	)
	public static uy bz(uy var0) {
		synchronized (ag_fld) {
			if (av_fld == 0) {
				return new uy(var0);
			} else {
				nf(ag_fld[(av_fld -= 1453506371) * -2091184879], var0, (byte)-91);
				return ag_fld[av_fld];
			}
		}
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void nx() {
		synchronized (ag_fld) {
			if (av_fld < az_fld) {
				ag_fld[(av_fld += 916466747) * -1929312436 - 1] = this;
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bp() {
		synchronized (ag_fld) {
			if (av_fld < az_fld) {
				ag_fld[(av_fld += 1453506371) * 848250219 - 1] = this;
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bv() {
		this.aw();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cf(uy var1) {
		float var2 = this.bp_fld * var1.ki_fld + (var1.ja_fld * this.ja_fld + this.bs_fld * var1.hx_fld) + this.va_fld * var1.kh_fld;
		float var3 = var1.my_fld * this.va_fld + (var1.bs_fld * this.ja_fld + this.bs_fld * var1.or_fld + var1.jj_fld * this.bp_fld);
		float var4 = this.va_fld * var1.xv_fld + (this.ja_fld * var1.bp_fld + this.bs_fld * var1.rw_fld + this.bp_fld * var1.ih_fld);
		float var5 = var1.nz_fld * this.va_fld + (this.bp_fld * var1.hj_fld + (var1.ok_fld * this.bs_fld + this.ja_fld * var1.va_fld));
		float var6 = var1.kh_fld * this.ok_fld + (var1.ki_fld * this.rw_fld + (this.hx_fld * var1.ja_fld + this.or_fld * var1.hx_fld));
		float var7 = this.or_fld * var1.or_fld + var1.bs_fld * this.hx_fld + var1.jj_fld * this.rw_fld + var1.my_fld * this.ok_fld;
		float var8 = var1.bp_fld * this.hx_fld + this.or_fld * var1.rw_fld + this.rw_fld * var1.ih_fld + this.ok_fld * var1.xv_fld;
		float var9 = this.ok_fld * var1.nz_fld + (var1.ok_fld * this.or_fld + var1.va_fld * this.hx_fld + this.rw_fld * var1.hj_fld);
		float var10 = this.hj_fld * var1.kh_fld + (this.ih_fld * var1.ki_fld + (var1.hx_fld * this.jj_fld + var1.ja_fld * this.ki_fld));
		float var11 = var1.bs_fld * this.ki_fld + this.jj_fld * var1.or_fld + this.ih_fld * var1.jj_fld + this.hj_fld * var1.my_fld;
		float var12 = this.ih_fld * var1.ih_fld + (this.jj_fld * var1.rw_fld + this.ki_fld * var1.bp_fld) + var1.xv_fld * this.hj_fld;
		float var13 = var1.va_fld * this.ki_fld + var1.ok_fld * this.jj_fld + this.ih_fld * var1.hj_fld + this.hj_fld * var1.nz_fld;
		float var14 = var1.kh_fld * this.nz_fld + (var1.ki_fld * this.xv_fld + (this.my_fld * var1.hx_fld + this.kh_fld * var1.ja_fld));
		float var15 = var1.bs_fld * this.kh_fld + var1.or_fld * this.my_fld + this.xv_fld * var1.jj_fld + var1.my_fld * this.nz_fld;
		float var16 = var1.xv_fld * this.nz_fld + (var1.rw_fld * this.my_fld + this.kh_fld * var1.bp_fld + var1.ih_fld * this.xv_fld);
		float var17 = this.kh_fld * var1.va_fld + var1.ok_fld * this.my_fld + var1.hj_fld * this.xv_fld + this.nz_fld * var1.nz_fld;
		this.ja_fld = var2;
		this.bs_fld = var3;
		this.bp_fld = var4;
		this.va_fld = var5;
		this.hx_fld = var6;
		this.or_fld = var7;
		this.rw_fld = var8;
		this.ok_fld = var9;
		this.ki_fld = var10;
		this.jj_fld = var11;
		this.ih_fld = var12;
		this.hj_fld = var13;
		this.kh_fld = var14;
		this.my_fld = var15;
		this.xv_fld = var16;
		this.nz_fld = var17;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public void he(ul var1) {
		this.ax(var1);
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		StringBuilder var1 = new StringBuilder();
		this.ah();
		this.ae();

		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 4; var3++) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.ae_fld[4 * var2 + var3];
				if (Math.sqrt(var4 * var4) < 1.0E-4F) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public uy() {
		this.ja_fld = 1.0F;
		this.or_fld = 1.0F;
		this.ih_fld = 1.0F;
		this.nz_fld = 1.0F;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dl(float var1, float var2, float var3) {
		return this.my_fld + (this.bs_fld * var1 + var2 * this.or_fld + var3 * this.jj_fld);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] bl() {
		float[] var1 = new float[]{(float)(-Math.asin(this.rw_fld)), 0.0F, 0.0F};
		double var2 = Math.cos(var1[0]);
		if (Math.abs(var2) > 0.005) {
			double var4 = this.bp_fld;
			double var6 = this.ih_fld;
			double var8 = this.hx_fld;
			double var10 = this.or_fld;
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			double var12 = this.bs_fld;
			double var13 = this.ja_fld;
			if (this.rw_fld < 0.0F) {
				var1[1] = (float)Math.atan2(var12, var13);
			} else {
				var1[1] = (float)(-Math.atan2(var12, var13));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ch() {
		this.ja_fld = 0.0F;
		this.bs_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.va_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.or_fld = 0.0F;
		this.rw_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.ki_fld = 0.0F;
		this.jj_fld = 0.0F;
		this.ih_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.kh_fld = 0.0F;
		this.my_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.nz_fld = 0.0F;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void lh(float var1, float var2, float var3) {
		bg(this, var1, var2, var3, 1971846051);
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		int var1 = 1785694310;
		byte var2 = 1;
		return -274613263 * var2 + Arrays.hashCode(this.ae_fld);
	}

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void rl() {
		this.ja_fld = 0.0F;
		this.bs_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.va_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.or_fld = 0.0F;
		this.rw_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.ki_fld = 0.0F;
		this.jj_fld = 0.0F;
		this.ih_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.kh_fld = 0.0F;
		this.my_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.nz_fld = 0.0F;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)V"
	)
	public static void dc(uy var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ja_fld = 0.0F;
		var0.bs_fld = 0.0F;
		var0.bp_fld = 0.0F;
		var0.va_fld = 0.0F;
		var0.hx_fld = 0.0F;
		var0.or_fld = 0.0F;
		var0.rw_fld = 0.0F;
		var0.ok_fld = 0.0F;
		var0.ki_fld = 0.0F;
		var0.jj_fld = 0.0F;
		var0.ih_fld = 0.0F;
		var0.hj_fld = 0.0F;
		var0.kh_fld = 0.0F;
		var0.my_fld = 0.0F;
		var0.xv_fld = 0.0F;
		var0.nz_fld = 0.0F;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cj() {
		this.ja_fld = 0.0F;
		this.bs_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.va_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.or_fld = 0.0F;
		this.rw_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.ki_fld = 0.0F;
		this.jj_fld = 0.0F;
		this.ih_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.kh_fld = 0.0F;
		this.my_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.nz_fld = 0.0F;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bo() {
		this.ja_fld = 0.0F;
		this.bs_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.va_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.or_fld = 0.0F;
		this.rw_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.ki_fld = 0.0F;
		this.jj_fld = 0.0F;
		this.ih_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.kh_fld = 0.0F;
		this.my_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.nz_fld = 0.0F;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void bn(uy var1) {
		System.arraycopy(var1.ae_fld, 0, this.ae_fld, 0, 16);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Z)V"
	)
	void bh(xi var1, boolean var2) {
		if (var2) {
			uc var3 = new uc();
			var3.ag(dk.ak(var1.cz(), (byte)4));
			var3.az(dk.ak(var1.cz(), (byte)4));
			var3.av(dk.ak(var1.cz(), (byte)4));
			uc.nz(var3, var1.cz(), var1.cz(), var1.cz(), -405011595);
			this.aa(var3);
		} else {
			for (int var4 = 0; var4 < 16; var4++) {
				this.ae_fld[var4] = var1.ci();
			}
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float da(float var1, float var2, float var3) {
		return var1 * this.bp_fld + this.rw_fld * var2 + this.ih_fld * var3 + this.xv_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] bx() {
		float[] var1 = new float[]{(float)(-Math.asin(this.rw_fld)), 0.0F, 0.0F};
		double var2 = Math.cos(var1[0]);
		if (Math.abs(var2) > 0.005) {
			double var4 = this.bp_fld;
			double var6 = this.ih_fld;
			double var8 = this.hx_fld;
			double var10 = this.or_fld;
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			double var12 = this.bs_fld;
			double var13 = this.ja_fld;
			if (this.rw_fld < 0.0F) {
				var1[1] = (float)Math.atan2(var12, var13);
			} else {
				var1[1] = (float)(-Math.atan2(var12, var13));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void bq(float var1) {
		bg(this, var1, var1, var1, 1634299406);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void bg(float var1) {
		bg(this, var1, var1, var1, 1754882623);
	}

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "([F)V"
	)
	public void ra(float[] var1) {
		var1[0] = this.ja_fld;
		var1[1] = this.bs_fld;
		var1[2] = this.bp_fld;
		var1[3] = this.va_fld;
		var1[4] = this.hx_fld;
		var1[5] = this.or_fld;
		var1[6] = this.rw_fld;
		var1[7] = this.ok_fld;
		var1[8] = this.ki_fld;
		var1[9] = this.jj_fld;
		var1[10] = this.ih_fld;
		var1[11] = this.hj_fld;
		var1[12] = this.kh_fld;
		var1[13] = this.my_fld;
		var1[14] = this.xv_fld;
		var1[15] = this.nz_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void cd(float var1, float var2, float var3) {
		this.aw();
		this.ja_fld = var1;
		this.or_fld = var2;
		this.ih_fld = var3;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Luy;)Luy;"
	)
	public static uy bd(uy var0) {
		synchronized (ag_fld) {
			if (1921271704 * av_fld == 0) {
				return new uy(var0);
			} else {
				nf(ag_fld[(av_fld -= 1855122456) * 848250219], var0, (byte)-12);
				return ag_fld[av_fld];
			}
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cq(uy var1) {
		for (int var2 = 0; var2 < this.ae_fld.length; var2++) {
			this.ae_fld[var2] = this.ae_fld[var2] + var1.ae_fld[var2];
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cv(uy var1) {
		for (int var2 = 0; var2 < this.ae_fld.length; var2++) {
			this.ae_fld[var2] = this.ae_fld[var2] + var1.ae_fld[var2];
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cy(uy var1) {
		for (int var2 = 0; var2 < this.ae_fld.length; var2++) {
			this.ae_fld[var2] = this.ae_fld[var2] + var1.ae_fld[var2];
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public static uy bq() {
		synchronized (ag_fld) {
			if (av_fld == 0) {
				return new uy();
			} else {
				uy var1 = ag_fld[--av_fld];
				var1.bv();
				return var1;
			}
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float jl(float var1, float var2, float var3) {
		return this.ab(var1, var2, var3);
	}

	public uy(uy var1) {
		this.bz_void(var1);
	}

	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFF[FI)V"
	)
	public static void vt(uy var0, float var1, float var2, float var3, float[] var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var4[0] = var0.ki_fld * var3 + (var0.hx_fld * var2 + var1 * var0.ja_fld) + var0.kh_fld;
		var4[1] = var0.bs_fld * var1 + var2 * var0.or_fld + var3 * var0.jj_fld + var0.my_fld;
		var4[2] = var1 * var0.bp_fld + var0.rw_fld * var2 + var3 * var0.ih_fld + var0.xv_fld;
		if (var4.length > 3) {
			var4[3] = var0.va_fld * var1 + var0.ok_fld * var2 + var3 * var0.hj_fld + var0.nz_fld;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cx(uy var1) {
		float var2 = this.bp_fld * var1.ki_fld + (var1.ja_fld * this.ja_fld + this.bs_fld * var1.hx_fld) + this.va_fld * var1.kh_fld;
		float var3 = var1.my_fld * this.va_fld + (var1.bs_fld * this.ja_fld + this.bs_fld * var1.or_fld + var1.jj_fld * this.bp_fld);
		float var4 = this.va_fld * var1.xv_fld + (this.ja_fld * var1.bp_fld + this.bs_fld * var1.rw_fld + this.bp_fld * var1.ih_fld);
		float var5 = var1.nz_fld * this.va_fld + (this.bp_fld * var1.hj_fld + (var1.ok_fld * this.bs_fld + this.ja_fld * var1.va_fld));
		float var6 = var1.kh_fld * this.ok_fld + (var1.ki_fld * this.rw_fld + (this.hx_fld * var1.ja_fld + this.or_fld * var1.hx_fld));
		float var7 = this.or_fld * var1.or_fld + var1.bs_fld * this.hx_fld + var1.jj_fld * this.rw_fld + var1.my_fld * this.ok_fld;
		float var8 = var1.bp_fld * this.hx_fld + this.or_fld * var1.rw_fld + this.rw_fld * var1.ih_fld + this.ok_fld * var1.xv_fld;
		float var9 = this.ok_fld * var1.nz_fld + (var1.ok_fld * this.or_fld + var1.va_fld * this.hx_fld + this.rw_fld * var1.hj_fld);
		float var10 = this.hj_fld * var1.kh_fld + (this.ih_fld * var1.ki_fld + (var1.hx_fld * this.jj_fld + var1.ja_fld * this.ki_fld));
		float var11 = var1.bs_fld * this.ki_fld + this.jj_fld * var1.or_fld + this.ih_fld * var1.jj_fld + this.hj_fld * var1.my_fld;
		float var12 = this.ih_fld * var1.ih_fld + (this.jj_fld * var1.rw_fld + this.ki_fld * var1.bp_fld) + var1.xv_fld * this.hj_fld;
		float var13 = var1.va_fld * this.ki_fld + var1.ok_fld * this.jj_fld + this.ih_fld * var1.hj_fld + this.hj_fld * var1.nz_fld;
		float var14 = var1.kh_fld * this.nz_fld + (var1.ki_fld * this.xv_fld + (this.my_fld * var1.hx_fld + this.kh_fld * var1.ja_fld));
		float var15 = var1.bs_fld * this.kh_fld + var1.or_fld * this.my_fld + this.xv_fld * var1.jj_fld + var1.my_fld * this.nz_fld;
		float var16 = var1.xv_fld * this.nz_fld + (var1.rw_fld * this.my_fld + this.kh_fld * var1.bp_fld + var1.ih_fld * this.xv_fld);
		float var17 = this.kh_fld * var1.va_fld + var1.ok_fld * this.my_fld + var1.hj_fld * this.xv_fld + this.nz_fld * var1.nz_fld;
		this.ja_fld = var2;
		this.bs_fld = var3;
		this.bp_fld = var4;
		this.va_fld = var5;
		this.hx_fld = var6;
		this.or_fld = var7;
		this.rw_fld = var8;
		this.ok_fld = var9;
		this.ki_fld = var10;
		this.jj_fld = var11;
		this.ih_fld = var12;
		this.hj_fld = var13;
		this.kh_fld = var14;
		this.my_fld = var15;
		this.xv_fld = var16;
		this.nz_fld = var17;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public static uy bm() {
		synchronized (ag_fld) {
			if (0 == av_fld) {
				return new uy();
			} else {
				ag_fld[(av_fld -= -548393722) * 848250219].aw();
				return ag_fld[-1091495203 * av_fld];
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Luy;)[F"
	)
	public static float[] bl(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		float[] var1 = new float[3];
		if (var0.bp_fld < 0.999 && var0.bp_fld > -0.999) {
			var1[1] = (float)(-Math.asin(var0.bp_fld));
			double var2 = Math.cos(var1[1]);
			var1[0] = (float)Math.atan2(var0.rw_fld / var2, var0.ih_fld / var2);
			var1[2] = (float)Math.atan2(var0.bs_fld / var2, var0.ja_fld / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2(var0.bp_fld, 0.0);
			var1[2] = (float)Math.atan2(-var0.jj_fld, var0.or_fld);
		}

		return var1;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float jp(float var1, float var2, float var3) {
		return this.at(var1, var2, var3);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void bc(uy var1) {
		System.arraycopy(var1.ae_fld, 0, this.ae_fld, 0, 16);
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Luy;)[F"
	)
	public static float[] hc(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		float[] var1 = new float[3];
		tu var2 = new tu(var0.ja_fld, var0.bs_fld, var0.bp_fld);
		tu var3 = new tu(var0.hx_fld, var0.or_fld, var0.rw_fld);
		tu var4 = new tu(var0.ki_fld, var0.jj_fld, var0.ih_fld);
		var1[0] = var2.aq();
		var1[1] = var3.aq();
		var1[2] = var4.aq();
		return var1;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dq(float var1, float var2, float var3) {
		return this.my_fld + (this.bs_fld * var1 + var2 * this.or_fld + var3 * this.jj_fld);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void cw(uz var1) {
		float var2 = var1.aw_fld * var1.aw_fld;
		float var3 = var1.aw_fld * var1.av_fld;
		float var4 = var1.aw_fld * var1.ae_fld;
		float var5 = var1.ah_fld * var1.aw_fld;
		float var6 = var1.av_fld * var1.av_fld;
		float var7 = var1.av_fld * var1.ae_fld;
		float var8 = var1.av_fld * var1.ah_fld;
		float var9 = var1.ae_fld * var1.ae_fld;
		float var10 = var1.ae_fld * var1.ah_fld;
		float var11 = var1.ah_fld * var1.ah_fld;
		this.ja_fld = var6 + var2 - var11 - var9;
		this.bs_fld = var5 + (var7 + (var5 + var7));
		this.bp_fld = var8 + (var8 - var4 - var4);
		this.hx_fld = var7 + (var7 - var5 - var5);
		this.or_fld = var9 + var2 - var6 - var11;
		this.rw_fld = var3 + (var10 + var3 + var10);
		this.ki_fld = var4 + (var4 + var8 + var8);
		this.jj_fld = var10 - var3 - var3 + var10;
		this.ih_fld = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void bw(uy var1) {
		System.arraycopy(var1.ae_fld, 0, this.ae_fld, 0, 16);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Luc;)V"
	)
	public void ck(uc var1) {
		this.ja_fld = var1.ak_fld;
		this.bs_fld = var1.ag_fld;
		this.bp_fld = var1.az_fld;
		this.va_fld = 0.0F;
		this.hx_fld = var1.av_fld;
		this.or_fld = var1.ae_fld;
		this.rw_fld = var1.ah_fld;
		this.ok_fld = 0.0F;
		this.ki_fld = var1.aw_fld;
		this.jj_fld = var1.ay_fld;
		this.ih_fld = var1.as_fld;
		this.hj_fld = 0.0F;
		this.kh_fld = var1.ar_fld;
		this.my_fld = var1.af_fld;
		this.xv_fld = var1.al_fld;
		this.nz_fld = 1.0F;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void an(uz var1) {
		float var3 = var1.aw_fld * var1.aw_fld;
		float var4 = var1.aw_fld * var1.av_fld;
		float var5 = var1.aw_fld * var1.ae_fld;
		float var6 = var1.ah_fld * var1.aw_fld;
		float var7 = var1.av_fld * var1.av_fld;
		float var8 = var1.av_fld * var1.ae_fld;
		float var9 = var1.av_fld * var1.ah_fld;
		float var10 = var1.ae_fld * var1.ae_fld;
		float var11 = var1.ae_fld * var1.ah_fld;
		float var12 = var1.ah_fld * var1.ah_fld;
		this.ja_fld = var7 + var3 - var12 - var10;
		this.bs_fld = var6 + (var8 + (var6 + var8));
		this.bp_fld = var9 + (var9 - var5 - var5);
		this.hx_fld = var8 + (var8 - var6 - var6);
		this.or_fld = var10 + var3 - var7 - var12;
		this.rw_fld = var4 + (var11 + var4 + var11);
		this.ki_fld = var5 + (var5 + var9 + var9);
		this.jj_fld = var11 - var4 - var4 + var11;
		this.ih_fld = var12 + var3 - var10 - var7;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Luy;)[F"
	)
	public static float[] en(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		float[] var1 = new float[3];
		tu var2 = new tu(var0.ja_fld, var0.bs_fld, var0.bp_fld);
		tu var3 = new tu(var0.hx_fld, var0.or_fld, var0.rw_fld);
		tu var4 = new tu(var0.ki_fld, var0.jj_fld, var0.ih_fld);
		var1[0] = var2.aq();
		var1[1] = var3.aq();
		var1[2] = var4.aq();
		return var1;
	}

	static {
		new uy();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bi() {
		float var1 = 1.0F / this.ai();
		float var2 = (
				this.ih_fld * this.or_fld * this.nz_fld
					- this.xv_fld * (this.hj_fld * this.or_fld)
					- this.rw_fld * this.jj_fld * this.nz_fld
					+ this.my_fld * (this.hj_fld * this.rw_fld)
					+ this.xv_fld * (this.jj_fld * this.ok_fld)
					- this.ih_fld * this.ok_fld * this.my_fld
			)
			* var1;
		float var3 = var1
			* (
				this.ih_fld * this.va_fld * this.my_fld
					+ (
						this.xv_fld * (this.bs_fld * this.hj_fld)
							+ this.nz_fld * (-this.bs_fld * this.ih_fld)
							+ this.bp_fld * this.jj_fld * this.nz_fld
							- this.my_fld * (this.hj_fld * this.bp_fld)
							- this.xv_fld * (this.va_fld * this.jj_fld)
					)
			);
		float var4 = var1
			* (
				this.rw_fld * this.bs_fld * this.nz_fld
					- this.bs_fld * this.ok_fld * this.xv_fld
					- this.bp_fld * this.or_fld * this.nz_fld
					+ this.ok_fld * this.bp_fld * this.my_fld
					+ this.or_fld * this.va_fld * this.xv_fld
					- this.rw_fld * this.va_fld * this.my_fld
			);
		float var5 = var1
			* (
				this.jj_fld * (this.va_fld * this.rw_fld)
					+ (
						this.bp_fld * this.or_fld * this.hj_fld
							+ (-this.bs_fld * this.rw_fld * this.hj_fld + this.bs_fld * this.ok_fld * this.ih_fld)
							- this.jj_fld * (this.ok_fld * this.bp_fld)
							- this.or_fld * this.va_fld * this.ih_fld
					)
			);
		float var6 = (
				this.nz_fld * (this.ki_fld * this.rw_fld)
					+ (this.xv_fld * (this.hj_fld * this.hx_fld) + this.nz_fld * (-this.hx_fld * this.ih_fld))
					- this.rw_fld * this.hj_fld * this.kh_fld
					- this.xv_fld * (this.ok_fld * this.ki_fld)
					+ this.kh_fld * (this.ih_fld * this.ok_fld)
			)
			* var1;
		float var7 = (
				this.ih_fld * this.ja_fld * this.nz_fld
					- this.hj_fld * this.ja_fld * this.xv_fld
					- this.ki_fld * this.bp_fld * this.nz_fld
					+ this.kh_fld * (this.hj_fld * this.bp_fld)
					+ this.xv_fld * (this.ki_fld * this.va_fld)
					- this.kh_fld * (this.ih_fld * this.va_fld)
			)
			* var1;
		float var8 = (
				this.nz_fld * (this.hx_fld * this.bp_fld)
					+ (this.xv_fld * (this.ja_fld * this.ok_fld) + this.nz_fld * (-this.ja_fld * this.rw_fld))
					- this.bp_fld * this.ok_fld * this.kh_fld
					- this.xv_fld * (this.hx_fld * this.va_fld)
					+ this.kh_fld * (this.rw_fld * this.va_fld)
			)
			* var1;
		float var9 = (
				this.va_fld * this.hx_fld * this.ih_fld
					+ (
						this.hj_fld * (this.rw_fld * this.ja_fld)
							- this.ok_fld * this.ja_fld * this.ih_fld
							- this.bp_fld * this.hx_fld * this.hj_fld
							+ this.ki_fld * (this.bp_fld * this.ok_fld)
					)
					- this.ki_fld * (this.rw_fld * this.va_fld)
			)
			* var1;
		float var10 = var1
			* (
				this.jj_fld * this.hx_fld * this.nz_fld
					- this.hj_fld * this.hx_fld * this.my_fld
					- this.or_fld * this.ki_fld * this.nz_fld
					+ this.kh_fld * (this.hj_fld * this.or_fld)
					+ this.my_fld * (this.ok_fld * this.ki_fld)
					- this.ok_fld * this.jj_fld * this.kh_fld
			);
		float var11 = (
				this.hj_fld * this.ja_fld * this.my_fld
					+ -this.ja_fld * this.jj_fld * this.nz_fld
					+ this.ki_fld * this.bs_fld * this.nz_fld
					- this.bs_fld * this.hj_fld * this.kh_fld
					- this.ki_fld * this.va_fld * this.my_fld
					+ this.kh_fld * (this.va_fld * this.jj_fld)
			)
			* var1;
		float var12 = (
				this.bs_fld * this.ok_fld * this.kh_fld
					+ (this.nz_fld * (this.or_fld * this.ja_fld) - this.my_fld * (this.ok_fld * this.ja_fld) - this.nz_fld * (this.hx_fld * this.bs_fld))
					+ this.va_fld * this.hx_fld * this.my_fld
					- this.kh_fld * (this.or_fld * this.va_fld)
			)
			* var1;
		float var13 = var1
			* (
				this.ki_fld * (this.va_fld * this.or_fld)
					+ (
						this.ok_fld * this.ja_fld * this.jj_fld
							+ this.hj_fld * (-this.ja_fld * this.or_fld)
							+ this.hx_fld * this.bs_fld * this.hj_fld
							- this.ok_fld * this.bs_fld * this.ki_fld
							- this.jj_fld * (this.hx_fld * this.va_fld)
					)
			);
		float var14 = var1
			* (
				this.jj_fld * this.rw_fld * this.kh_fld
					+ (
						this.xv_fld * (this.ki_fld * this.or_fld)
							+ (this.xv_fld * (-this.hx_fld * this.jj_fld) + this.hx_fld * this.ih_fld * this.my_fld)
							- this.kh_fld * (this.or_fld * this.ih_fld)
							- this.my_fld * (this.rw_fld * this.ki_fld)
					)
			);
		float var15 = (
				this.bs_fld * this.ih_fld * this.kh_fld
					+ (this.ja_fld * this.jj_fld * this.xv_fld - this.ih_fld * this.ja_fld * this.my_fld - this.xv_fld * (this.ki_fld * this.bs_fld))
					+ this.my_fld * (this.bp_fld * this.ki_fld)
					- this.bp_fld * this.jj_fld * this.kh_fld
			)
			* var1;
		float var16 = (
				this.rw_fld * this.ja_fld * this.my_fld
					+ this.or_fld * -this.ja_fld * this.xv_fld
					+ this.xv_fld * (this.hx_fld * this.bs_fld)
					- this.rw_fld * this.bs_fld * this.kh_fld
					- this.hx_fld * this.bp_fld * this.my_fld
					+ this.kh_fld * (this.bp_fld * this.or_fld)
			)
			* var1;
		float var17 = (
				this.jj_fld * (this.bp_fld * this.hx_fld)
					+ (
						this.or_fld * this.ja_fld * this.ih_fld
							- this.rw_fld * this.ja_fld * this.jj_fld
							- this.hx_fld * this.bs_fld * this.ih_fld
							+ this.rw_fld * this.bs_fld * this.ki_fld
					)
					- this.ki_fld * (this.or_fld * this.bp_fld)
			)
			* var1;
		this.ja_fld = var2;
		this.bs_fld = var3;
		this.bp_fld = var4;
		this.va_fld = var5;
		this.hx_fld = var6;
		this.or_fld = var7;
		this.rw_fld = var8;
		this.ok_fld = var9;
		this.ki_fld = var10;
		this.jj_fld = var11;
		this.ih_fld = var12;
		this.hj_fld = var13;
		this.kh_fld = var14;
		this.my_fld = var15;
		this.xv_fld = var16;
		this.nz_fld = var17;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void ba(uy var1) {
		System.arraycopy(var1.ae_fld, 0, this.ae_fld, 0, 16);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void bz_void(uy var1) {
		nf(this, var1, (byte)-59);
	}

	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ue() {
		float var1 = 1.0F / this.ai();
		float var2 = (
				this.ih_fld * this.or_fld * this.nz_fld
					- this.xv_fld * (this.hj_fld * this.or_fld)
					- this.rw_fld * this.jj_fld * this.nz_fld
					+ this.my_fld * (this.hj_fld * this.rw_fld)
					+ this.xv_fld * (this.jj_fld * this.ok_fld)
					- this.ih_fld * this.ok_fld * this.my_fld
			)
			* var1;
		float var3 = var1
			* (
				this.ih_fld * this.va_fld * this.my_fld
					+ (
						this.xv_fld * (this.bs_fld * this.hj_fld)
							+ this.nz_fld * (-this.bs_fld * this.ih_fld)
							+ this.bp_fld * this.jj_fld * this.nz_fld
							- this.my_fld * (this.hj_fld * this.bp_fld)
							- this.xv_fld * (this.va_fld * this.jj_fld)
					)
			);
		float var4 = var1
			* (
				this.rw_fld * this.bs_fld * this.nz_fld
					- this.bs_fld * this.ok_fld * this.xv_fld
					- this.bp_fld * this.or_fld * this.nz_fld
					+ this.ok_fld * this.bp_fld * this.my_fld
					+ this.or_fld * this.va_fld * this.xv_fld
					- this.rw_fld * this.va_fld * this.my_fld
			);
		float var5 = var1
			* (
				this.jj_fld * (this.va_fld * this.rw_fld)
					+ (
						this.bp_fld * this.or_fld * this.hj_fld
							+ (-this.bs_fld * this.rw_fld * this.hj_fld + this.bs_fld * this.ok_fld * this.ih_fld)
							- this.jj_fld * (this.ok_fld * this.bp_fld)
							- this.or_fld * this.va_fld * this.ih_fld
					)
			);
		float var6 = (
				this.nz_fld * (this.ki_fld * this.rw_fld)
					+ (this.xv_fld * (this.hj_fld * this.hx_fld) + this.nz_fld * (-this.hx_fld * this.ih_fld))
					- this.rw_fld * this.hj_fld * this.kh_fld
					- this.xv_fld * (this.ok_fld * this.ki_fld)
					+ this.kh_fld * (this.ih_fld * this.ok_fld)
			)
			* var1;
		float var7 = (
				this.ih_fld * this.ja_fld * this.nz_fld
					- this.hj_fld * this.ja_fld * this.xv_fld
					- this.ki_fld * this.bp_fld * this.nz_fld
					+ this.kh_fld * (this.hj_fld * this.bp_fld)
					+ this.xv_fld * (this.ki_fld * this.va_fld)
					- this.kh_fld * (this.ih_fld * this.va_fld)
			)
			* var1;
		float var8 = (
				this.nz_fld * (this.hx_fld * this.bp_fld)
					+ (this.xv_fld * (this.ja_fld * this.ok_fld) + this.nz_fld * (-this.ja_fld * this.rw_fld))
					- this.bp_fld * this.ok_fld * this.kh_fld
					- this.xv_fld * (this.hx_fld * this.va_fld)
					+ this.kh_fld * (this.rw_fld * this.va_fld)
			)
			* var1;
		float var9 = (
				this.va_fld * this.hx_fld * this.ih_fld
					+ (
						this.hj_fld * (this.rw_fld * this.ja_fld)
							- this.ok_fld * this.ja_fld * this.ih_fld
							- this.bp_fld * this.hx_fld * this.hj_fld
							+ this.ki_fld * (this.bp_fld * this.ok_fld)
					)
					- this.ki_fld * (this.rw_fld * this.va_fld)
			)
			* var1;
		float var10 = var1
			* (
				this.jj_fld * this.hx_fld * this.nz_fld
					- this.hj_fld * this.hx_fld * this.my_fld
					- this.or_fld * this.ki_fld * this.nz_fld
					+ this.kh_fld * (this.hj_fld * this.or_fld)
					+ this.my_fld * (this.ok_fld * this.ki_fld)
					- this.ok_fld * this.jj_fld * this.kh_fld
			);
		float var11 = (
				this.hj_fld * this.ja_fld * this.my_fld
					+ -this.ja_fld * this.jj_fld * this.nz_fld
					+ this.ki_fld * this.bs_fld * this.nz_fld
					- this.bs_fld * this.hj_fld * this.kh_fld
					- this.ki_fld * this.va_fld * this.my_fld
					+ this.kh_fld * (this.va_fld * this.jj_fld)
			)
			* var1;
		float var12 = (
				this.bs_fld * this.ok_fld * this.kh_fld
					+ (this.nz_fld * (this.or_fld * this.ja_fld) - this.my_fld * (this.ok_fld * this.ja_fld) - this.nz_fld * (this.hx_fld * this.bs_fld))
					+ this.va_fld * this.hx_fld * this.my_fld
					- this.kh_fld * (this.or_fld * this.va_fld)
			)
			* var1;
		float var13 = var1
			* (
				this.ki_fld * (this.va_fld * this.or_fld)
					+ (
						this.ok_fld * this.ja_fld * this.jj_fld
							+ this.hj_fld * (-this.ja_fld * this.or_fld)
							+ this.hx_fld * this.bs_fld * this.hj_fld
							- this.ok_fld * this.bs_fld * this.ki_fld
							- this.jj_fld * (this.hx_fld * this.va_fld)
					)
			);
		float var14 = var1
			* (
				this.jj_fld * this.rw_fld * this.kh_fld
					+ (
						this.xv_fld * (this.ki_fld * this.or_fld)
							+ (this.xv_fld * (-this.hx_fld * this.jj_fld) + this.hx_fld * this.ih_fld * this.my_fld)
							- this.kh_fld * (this.or_fld * this.ih_fld)
							- this.my_fld * (this.rw_fld * this.ki_fld)
					)
			);
		float var15 = (
				this.bs_fld * this.ih_fld * this.kh_fld
					+ (this.ja_fld * this.jj_fld * this.xv_fld - this.ih_fld * this.ja_fld * this.my_fld - this.xv_fld * (this.ki_fld * this.bs_fld))
					+ this.my_fld * (this.bp_fld * this.ki_fld)
					- this.bp_fld * this.jj_fld * this.kh_fld
			)
			* var1;
		float var16 = (
				this.rw_fld * this.ja_fld * this.my_fld
					+ this.or_fld * -this.ja_fld * this.xv_fld
					+ this.xv_fld * (this.hx_fld * this.bs_fld)
					- this.rw_fld * this.bs_fld * this.kh_fld
					- this.hx_fld * this.bp_fld * this.my_fld
					+ this.kh_fld * (this.bp_fld * this.or_fld)
			)
			* var1;
		float var17 = (
				this.jj_fld * (this.bp_fld * this.hx_fld)
					+ (
						this.or_fld * this.ja_fld * this.ih_fld
							- this.rw_fld * this.ja_fld * this.jj_fld
							- this.hx_fld * this.bs_fld * this.ih_fld
							+ this.rw_fld * this.bs_fld * this.ki_fld
					)
					- this.ki_fld * (this.or_fld * this.bp_fld)
			)
			* var1;
		this.ja_fld = var2;
		this.bs_fld = var3;
		this.bp_fld = var4;
		this.va_fld = var5;
		this.hx_fld = var6;
		this.or_fld = var7;
		this.rw_fld = var8;
		this.ok_fld = var9;
		this.ki_fld = var10;
		this.jj_fld = var11;
		this.ih_fld = var12;
		this.hj_fld = var13;
		this.kh_fld = var14;
		this.my_fld = var15;
		this.xv_fld = var16;
		this.nz_fld = var17;
	}

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void yt() {
		float var1 = 1.0F / this.ai();
		float var2 = (
				this.ih_fld * this.or_fld * this.nz_fld
					- this.xv_fld * (this.hj_fld * this.or_fld)
					- this.rw_fld * this.jj_fld * this.nz_fld
					+ this.my_fld * (this.hj_fld * this.rw_fld)
					+ this.xv_fld * (this.jj_fld * this.ok_fld)
					- this.ih_fld * this.ok_fld * this.my_fld
			)
			* var1;
		float var3 = var1
			* (
				this.ih_fld * this.va_fld * this.my_fld
					+ (
						this.xv_fld * (this.bs_fld * this.hj_fld)
							+ this.nz_fld * (-this.bs_fld * this.ih_fld)
							+ this.bp_fld * this.jj_fld * this.nz_fld
							- this.my_fld * (this.hj_fld * this.bp_fld)
							- this.xv_fld * (this.va_fld * this.jj_fld)
					)
			);
		float var4 = var1
			* (
				this.rw_fld * this.bs_fld * this.nz_fld
					- this.bs_fld * this.ok_fld * this.xv_fld
					- this.bp_fld * this.or_fld * this.nz_fld
					+ this.ok_fld * this.bp_fld * this.my_fld
					+ this.or_fld * this.va_fld * this.xv_fld
					- this.rw_fld * this.va_fld * this.my_fld
			);
		float var5 = var1
			* (
				this.jj_fld * (this.va_fld * this.rw_fld)
					+ (
						this.bp_fld * this.or_fld * this.hj_fld
							+ (-this.bs_fld * this.rw_fld * this.hj_fld + this.bs_fld * this.ok_fld * this.ih_fld)
							- this.jj_fld * (this.ok_fld * this.bp_fld)
							- this.or_fld * this.va_fld * this.ih_fld
					)
			);
		float var6 = (
				this.nz_fld * (this.ki_fld * this.rw_fld)
					+ (this.xv_fld * (this.hj_fld * this.hx_fld) + this.nz_fld * (-this.hx_fld * this.ih_fld))
					- this.rw_fld * this.hj_fld * this.kh_fld
					- this.xv_fld * (this.ok_fld * this.ki_fld)
					+ this.kh_fld * (this.ih_fld * this.ok_fld)
			)
			* var1;
		float var7 = (
				this.ih_fld * this.ja_fld * this.nz_fld
					- this.hj_fld * this.ja_fld * this.xv_fld
					- this.ki_fld * this.bp_fld * this.nz_fld
					+ this.kh_fld * (this.hj_fld * this.bp_fld)
					+ this.xv_fld * (this.ki_fld * this.va_fld)
					- this.kh_fld * (this.ih_fld * this.va_fld)
			)
			* var1;
		float var8 = (
				this.nz_fld * (this.hx_fld * this.bp_fld)
					+ (this.xv_fld * (this.ja_fld * this.ok_fld) + this.nz_fld * (-this.ja_fld * this.rw_fld))
					- this.bp_fld * this.ok_fld * this.kh_fld
					- this.xv_fld * (this.hx_fld * this.va_fld)
					+ this.kh_fld * (this.rw_fld * this.va_fld)
			)
			* var1;
		float var9 = (
				this.va_fld * this.hx_fld * this.ih_fld
					+ (
						this.hj_fld * (this.rw_fld * this.ja_fld)
							- this.ok_fld * this.ja_fld * this.ih_fld
							- this.bp_fld * this.hx_fld * this.hj_fld
							+ this.ki_fld * (this.bp_fld * this.ok_fld)
					)
					- this.ki_fld * (this.rw_fld * this.va_fld)
			)
			* var1;
		float var10 = var1
			* (
				this.jj_fld * this.hx_fld * this.nz_fld
					- this.hj_fld * this.hx_fld * this.my_fld
					- this.or_fld * this.ki_fld * this.nz_fld
					+ this.kh_fld * (this.hj_fld * this.or_fld)
					+ this.my_fld * (this.ok_fld * this.ki_fld)
					- this.ok_fld * this.jj_fld * this.kh_fld
			);
		float var11 = (
				this.hj_fld * this.ja_fld * this.my_fld
					+ -this.ja_fld * this.jj_fld * this.nz_fld
					+ this.ki_fld * this.bs_fld * this.nz_fld
					- this.bs_fld * this.hj_fld * this.kh_fld
					- this.ki_fld * this.va_fld * this.my_fld
					+ this.kh_fld * (this.va_fld * this.jj_fld)
			)
			* var1;
		float var12 = (
				this.bs_fld * this.ok_fld * this.kh_fld
					+ (this.nz_fld * (this.or_fld * this.ja_fld) - this.my_fld * (this.ok_fld * this.ja_fld) - this.nz_fld * (this.hx_fld * this.bs_fld))
					+ this.va_fld * this.hx_fld * this.my_fld
					- this.kh_fld * (this.or_fld * this.va_fld)
			)
			* var1;
		float var13 = var1
			* (
				this.ki_fld * (this.va_fld * this.or_fld)
					+ (
						this.ok_fld * this.ja_fld * this.jj_fld
							+ this.hj_fld * (-this.ja_fld * this.or_fld)
							+ this.hx_fld * this.bs_fld * this.hj_fld
							- this.ok_fld * this.bs_fld * this.ki_fld
							- this.jj_fld * (this.hx_fld * this.va_fld)
					)
			);
		float var14 = var1
			* (
				this.jj_fld * this.rw_fld * this.kh_fld
					+ (
						this.xv_fld * (this.ki_fld * this.or_fld)
							+ (this.xv_fld * (-this.hx_fld * this.jj_fld) + this.hx_fld * this.ih_fld * this.my_fld)
							- this.kh_fld * (this.or_fld * this.ih_fld)
							- this.my_fld * (this.rw_fld * this.ki_fld)
					)
			);
		float var15 = (
				this.bs_fld * this.ih_fld * this.kh_fld
					+ (this.ja_fld * this.jj_fld * this.xv_fld - this.ih_fld * this.ja_fld * this.my_fld - this.xv_fld * (this.ki_fld * this.bs_fld))
					+ this.my_fld * (this.bp_fld * this.ki_fld)
					- this.bp_fld * this.jj_fld * this.kh_fld
			)
			* var1;
		float var16 = (
				this.rw_fld * this.ja_fld * this.my_fld
					+ this.or_fld * -this.ja_fld * this.xv_fld
					+ this.xv_fld * (this.hx_fld * this.bs_fld)
					- this.rw_fld * this.bs_fld * this.kh_fld
					- this.hx_fld * this.bp_fld * this.my_fld
					+ this.kh_fld * (this.bp_fld * this.or_fld)
			)
			* var1;
		float var17 = (
				this.jj_fld * (this.bp_fld * this.hx_fld)
					+ (
						this.or_fld * this.ja_fld * this.ih_fld
							- this.rw_fld * this.ja_fld * this.jj_fld
							- this.hx_fld * this.bs_fld * this.ih_fld
							+ this.rw_fld * this.bs_fld * this.ki_fld
					)
					- this.ki_fld * (this.or_fld * this.bp_fld)
			)
			* var1;
		this.ja_fld = var2;
		this.bs_fld = var3;
		this.bp_fld = var4;
		this.va_fld = var5;
		this.hx_fld = var6;
		this.or_fld = var7;
		this.rw_fld = var8;
		this.ok_fld = var9;
		this.ki_fld = var10;
		this.jj_fld = var11;
		this.ih_fld = var12;
		this.hj_fld = var13;
		this.kh_fld = var14;
		this.my_fld = var15;
		this.xv_fld = var16;
		this.nz_fld = var17;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void ct(float var1, float var2, float var3, float var4) {
		this.ja_fld = var1;
		this.bs_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.va_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.or_fld = var2;
		this.rw_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.ki_fld = 0.0F;
		this.jj_fld = 0.0F;
		this.ih_fld = var3;
		this.hj_fld = 0.0F;
		this.kh_fld = 0.0F;
		this.my_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.nz_fld = var4;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Z)V"
	)
	void bj(xi var1, boolean var2) {
		if (var2) {
			uc var3 = new uc();
			var3.ag(dk.ak(var1.cz(), (byte)4));
			var3.az(dk.ak(var1.cz(), (byte)4));
			var3.av(dk.ak(var1.cz(), (byte)4));
			uc.nz(var3, var1.cz(), var1.cz(), var1.cz(), -405011595);
			this.aa(var3);
		} else {
			for (int var4 = 0; var4 < 16; var4++) {
				this.ae_fld[var4] = var1.ci();
			}
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)V"
	)
	public void dh(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.ki_fld * var3 + (this.hx_fld * var2 + var1 * this.ja_fld) + this.kh_fld;
		var4[1] = this.bs_fld * var1 + var2 * this.or_fld + var3 * this.jj_fld + this.my_fld;
		var4[2] = var1 * this.bp_fld + this.rw_fld * var2 + var3 * this.ih_fld + this.xv_fld;
		if (var4.length > 3) {
			var4[3] = this.va_fld * var1 + this.ok_fld * var2 + var3 * this.hj_fld + this.nz_fld;
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(FFF)Ltu;"
	)
	public tu dv(float var1, float var2, float var3) {
		float var4 = 1.0F / (this.nz_fld + (var1 * this.va_fld + var2 * this.ok_fld + this.hj_fld * var3));
		return sh.ak(
			var4 * (this.kh_fld + (var3 * this.ki_fld + (this.ja_fld * var1 + var2 * this.hx_fld))),
			(var2 * this.or_fld + var1 * this.bs_fld + var3 * this.jj_fld + this.my_fld) * var4,
			(this.xv_fld + (var3 * this.ih_fld + (this.rw_fld * var2 + this.bp_fld * var1))) * var4
		);
	}

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)V"
	)
	public void vc(float var1, float var2, float var3, float[] var4) {
		vt(this, var1, var2, var3, var4, -1200868937);
	}

	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFFFI)V"
	)
	public static void tm(uy var0, float var1, float var2, float var3, float var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ja_fld = var1;
		var0.bs_fld = 0.0F;
		var0.bp_fld = 0.0F;
		var0.va_fld = 0.0F;
		var0.hx_fld = 0.0F;
		var0.or_fld = var2;
		var0.rw_fld = 0.0F;
		var0.ok_fld = 0.0F;
		var0.ki_fld = 0.0F;
		var0.jj_fld = 0.0F;
		var0.ih_fld = var3;
		var0.hj_fld = 0.0F;
		var0.kh_fld = 0.0F;
		var0.my_fld = 0.0F;
		var0.xv_fld = 0.0F;
		var0.nz_fld = var4;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dz(float var1, float var2, float var3) {
		return this.kh_fld + (this.ki_fld * var3 + (this.ja_fld * var1 + var2 * this.hx_fld));
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void be() {
		this.ja_fld = 1.0F;
		this.bs_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.va_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.or_fld = 1.0F;
		this.rw_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.ki_fld = 0.0F;
		this.jj_fld = 0.0F;
		this.ih_fld = 1.0F;
		this.hj_fld = 0.0F;
		this.kh_fld = 0.0F;
		this.my_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.nz_fld = 1.0F;
	}

	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFF)V"
	)
	public static void xm(uy var0, float var1, float var2, float var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aw();
		var0.ja_fld = var1;
		var0.or_fld = var2;
		var0.ih_fld = var3;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dm(float var1, float var2, float var3) {
		return this.kh_fld + (this.ki_fld * var3 + (this.ja_fld * var1 + var2 * this.hx_fld));
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)V"
	)
	public void cl(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.ki_fld * var3 + (this.hx_fld * var2 + var1 * this.ja_fld) + this.kh_fld;
		var4[1] = this.bs_fld * var1 + var2 * this.or_fld + var3 * this.jj_fld + this.my_fld;
		var4[2] = var1 * this.bp_fld + this.rw_fld * var2 + var3 * this.ih_fld + this.xv_fld;
		if (var4.length > 3) {
			var4[3] = this.va_fld * var1 + this.ok_fld * var2 + var3 * this.hj_fld + this.nz_fld;
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dd(float var1, float var2, float var3) {
		return this.my_fld + (this.bs_fld * var1 + var2 * this.or_fld + var3 * this.jj_fld);
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luz;)V"
	)
	public static void kp(uy var0, uz var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			float var2 = var1.aw_fld * var1.aw_fld;
			float var3 = var1.aw_fld * var1.av_fld;
			float var4 = var1.aw_fld * var1.ae_fld;
			float var5 = var1.ah_fld * var1.aw_fld;
			float var6 = var1.av_fld * var1.av_fld;
			float var7 = var1.av_fld * var1.ae_fld;
			float var8 = var1.av_fld * var1.ah_fld;
			float var9 = var1.ae_fld * var1.ae_fld;
			float var10 = var1.ae_fld * var1.ah_fld;
			float var11 = var1.ah_fld * var1.ah_fld;
			var0.ja_fld = var6 + var2 - var11 - var9;
			var0.bs_fld = var5 + (var7 + (var5 + var7));
			var0.bp_fld = var8 + (var8 - var4 - var4);
			var0.hx_fld = var7 + (var7 - var5 - var5);
			var0.or_fld = var9 + var2 - var6 - var11;
			var0.rw_fld = var3 + (var10 + var3 + var10);
			var0.ki_fld = var4 + (var4 + var8 + var8);
			var0.jj_fld = var10 - var3 - var3 + var10;
			var0.ih_fld = var11 + var2 - var9 - var6;
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] ds() {
		float[] var1 = new float[3];
		tu var2 = new tu(this.ja_fld, this.bs_fld, this.bp_fld);
		tu var3 = new tu(this.hx_fld, this.or_fld, this.rw_fld);
		tu var4 = new tu(this.ki_fld, this.jj_fld, this.ih_fld);
		var1[0] = var2.aq();
		var1[1] = var3.aq();
		var1[2] = var4.aq();
		return var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bs() {
		this.az();
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dr(float var1, float var2, float var3) {
		return var1 * this.bp_fld + this.rw_fld * var2 + this.ih_fld * var3 + this.xv_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	float[] ae() {
		float[] var2 = new float[3];
		if (this.bp_fld < 0.999 && this.bp_fld > -0.999) {
			var2[1] = (float)(-Math.asin(this.bp_fld));
			double var3 = Math.cos(var2[1]);
			var2[0] = (float)Math.atan2(this.rw_fld / var3, this.ih_fld / var3);
			var2[2] = (float)Math.atan2(this.bs_fld / var3, this.ja_fld / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2(this.bp_fld, 0.0);
			var2[2] = (float)Math.atan2(-this.jj_fld, this.or_fld);
		}

		return var2;
	}

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "(Luy;Ljava/lang/Object;)Z"
	)
	public static boolean re(uy var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!(var1 instanceof uy)) {
			return false;
		} else {
			uy var2 = (uy)var1;

			for (int var3 = 0; var3 < 16; var3++) {
				if (var0.ae_fld[var3] != var2.ae_fld[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cs(uy var1) {
		float var2 = this.bp_fld * var1.ki_fld + (var1.ja_fld * this.ja_fld + this.bs_fld * var1.hx_fld) + this.va_fld * var1.kh_fld;
		float var3 = var1.my_fld * this.va_fld + (var1.bs_fld * this.ja_fld + this.bs_fld * var1.or_fld + var1.jj_fld * this.bp_fld);
		float var4 = this.va_fld * var1.xv_fld + (this.ja_fld * var1.bp_fld + this.bs_fld * var1.rw_fld + this.bp_fld * var1.ih_fld);
		float var5 = var1.nz_fld * this.va_fld + (this.bp_fld * var1.hj_fld + (var1.ok_fld * this.bs_fld + this.ja_fld * var1.va_fld));
		float var6 = var1.kh_fld * this.ok_fld + (var1.ki_fld * this.rw_fld + (this.hx_fld * var1.ja_fld + this.or_fld * var1.hx_fld));
		float var7 = this.or_fld * var1.or_fld + var1.bs_fld * this.hx_fld + var1.jj_fld * this.rw_fld + var1.my_fld * this.ok_fld;
		float var8 = var1.bp_fld * this.hx_fld + this.or_fld * var1.rw_fld + this.rw_fld * var1.ih_fld + this.ok_fld * var1.xv_fld;
		float var9 = this.ok_fld * var1.nz_fld + (var1.ok_fld * this.or_fld + var1.va_fld * this.hx_fld + this.rw_fld * var1.hj_fld);
		float var10 = this.hj_fld * var1.kh_fld + (this.ih_fld * var1.ki_fld + (var1.hx_fld * this.jj_fld + var1.ja_fld * this.ki_fld));
		float var11 = var1.bs_fld * this.ki_fld + this.jj_fld * var1.or_fld + this.ih_fld * var1.jj_fld + this.hj_fld * var1.my_fld;
		float var12 = this.ih_fld * var1.ih_fld + (this.jj_fld * var1.rw_fld + this.ki_fld * var1.bp_fld) + var1.xv_fld * this.hj_fld;
		float var13 = var1.va_fld * this.ki_fld + var1.ok_fld * this.jj_fld + this.ih_fld * var1.hj_fld + this.hj_fld * var1.nz_fld;
		float var14 = var1.kh_fld * this.nz_fld + (var1.ki_fld * this.xv_fld + (this.my_fld * var1.hx_fld + this.kh_fld * var1.ja_fld));
		float var15 = var1.bs_fld * this.kh_fld + var1.or_fld * this.my_fld + this.xv_fld * var1.jj_fld + var1.my_fld * this.nz_fld;
		float var16 = var1.xv_fld * this.nz_fld + (var1.rw_fld * this.my_fld + this.kh_fld * var1.bp_fld + var1.ih_fld * this.xv_fld);
		float var17 = this.kh_fld * var1.va_fld + var1.ok_fld * this.my_fld + var1.hj_fld * this.xv_fld + this.nz_fld * var1.nz_fld;
		this.ja_fld = var2;
		this.bs_fld = var3;
		this.bp_fld = var4;
		this.va_fld = var5;
		this.hx_fld = var6;
		this.or_fld = var7;
		this.rw_fld = var8;
		this.ok_fld = var9;
		this.ki_fld = var10;
		this.jj_fld = var11;
		this.ih_fld = var12;
		this.hj_fld = var13;
		this.kh_fld = var14;
		this.my_fld = var15;
		this.xv_fld = var16;
		this.nz_fld = var17;
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;)V"
	)
	public static void qd(uy var0, uy var1) {
		if (var0 == null) {
			var0.getClass();
		}

		float var2 = var0.bp_fld * var1.ki_fld + (var1.ja_fld * var0.ja_fld + var0.bs_fld * var1.hx_fld) + var0.va_fld * var1.kh_fld;
		float var3 = var1.my_fld * var0.va_fld + (var1.bs_fld * var0.ja_fld + var0.bs_fld * var1.or_fld + var1.jj_fld * var0.bp_fld);
		float var4 = var0.va_fld * var1.xv_fld + (var0.ja_fld * var1.bp_fld + var0.bs_fld * var1.rw_fld + var0.bp_fld * var1.ih_fld);
		float var5 = var1.nz_fld * var0.va_fld + (var0.bp_fld * var1.hj_fld + (var1.ok_fld * var0.bs_fld + var0.ja_fld * var1.va_fld));
		float var6 = var1.kh_fld * var0.ok_fld + (var1.ki_fld * var0.rw_fld + (var0.hx_fld * var1.ja_fld + var0.or_fld * var1.hx_fld));
		float var7 = var0.or_fld * var1.or_fld + var1.bs_fld * var0.hx_fld + var1.jj_fld * var0.rw_fld + var1.my_fld * var0.ok_fld;
		float var8 = var1.bp_fld * var0.hx_fld + var0.or_fld * var1.rw_fld + var0.rw_fld * var1.ih_fld + var0.ok_fld * var1.xv_fld;
		float var9 = var0.ok_fld * var1.nz_fld + (var1.ok_fld * var0.or_fld + var1.va_fld * var0.hx_fld + var0.rw_fld * var1.hj_fld);
		float var10 = var0.hj_fld * var1.kh_fld + (var0.ih_fld * var1.ki_fld + (var1.hx_fld * var0.jj_fld + var1.ja_fld * var0.ki_fld));
		float var11 = var1.bs_fld * var0.ki_fld + var0.jj_fld * var1.or_fld + var0.ih_fld * var1.jj_fld + var0.hj_fld * var1.my_fld;
		float var12 = var0.ih_fld * var1.ih_fld + (var0.jj_fld * var1.rw_fld + var0.ki_fld * var1.bp_fld) + var1.xv_fld * var0.hj_fld;
		float var13 = var1.va_fld * var0.ki_fld + var1.ok_fld * var0.jj_fld + var0.ih_fld * var1.hj_fld + var0.hj_fld * var1.nz_fld;
		float var14 = var1.kh_fld * var0.nz_fld + (var1.ki_fld * var0.xv_fld + (var0.my_fld * var1.hx_fld + var0.kh_fld * var1.ja_fld));
		float var15 = var1.bs_fld * var0.kh_fld + var1.or_fld * var0.my_fld + var0.xv_fld * var1.jj_fld + var1.my_fld * var0.nz_fld;
		float var16 = var1.xv_fld * var0.nz_fld + (var1.rw_fld * var0.my_fld + var0.kh_fld * var1.bp_fld + var1.ih_fld * var0.xv_fld);
		float var17 = var0.kh_fld * var1.va_fld + var1.ok_fld * var0.my_fld + var1.hj_fld * var0.xv_fld + var0.nz_fld * var1.nz_fld;
		var0.ja_fld = var2;
		var0.bs_fld = var3;
		var0.bp_fld = var4;
		var0.va_fld = var5;
		var0.hx_fld = var6;
		var0.or_fld = var7;
		var0.rw_fld = var8;
		var0.ok_fld = var9;
		var0.ki_fld = var10;
		var0.jj_fld = var11;
		var0.ih_fld = var12;
		var0.hj_fld = var13;
		var0.kh_fld = var14;
		var0.my_fld = var15;
		var0.xv_fld = var16;
		var0.nz_fld = var17;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)V"
	)
	public void as(uy var1, byte var2) {
		this.or_fld = var1.hj_fld;
		this.ki_fld = var1.va_fld;
		this.nz_fld = var1.hj_fld;
		this.ih_fld = var1.nz_fld;
		this.my_fld = var1.hx_fld;
		this.nz_fld = var1.jj_fld;
		this.rw_fld = var1.nz_fld;
		this.nz_fld = var1.rw_fld;
		this.va_fld = var1.rw_fld;
		this.va_fld = var1.or_fld;
		this.bp_fld = var1.hx_fld;
		this.hj_fld = var1.ki_fld;
		this.kh_fld = var1.xv_fld;
		this.ja_fld = var1.nz_fld;
		this.bs_fld = var1.rw_fld;
		this.ki_fld = var1.hj_fld;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Z)V"
	)
	public void ek(xi var1, boolean var2) {
		this.av(var1, var2, -1493871898);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V"
	)
	public void af(float var1, float var2, float var3, int var4) {
		this.aw();
		this.nz_fld = var1;
		this.hj_fld = var2;
		this.kh_fld = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V"
	)
	public void ad(float var1, float var2, float var3, float[] var4, int var5) {
		var4[0] = this.my_fld * var3 + (this.rw_fld * var2 + var1 * this.ih_fld) + this.ki_fld;
		var4[1] = this.xv_fld * var1 + var2 * this.jj_fld + var3 * this.rw_fld + this.kh_fld;
		var4[2] = var1 * this.ih_fld + this.bp_fld * var2 + var3 * this.nz_fld + this.bs_fld;
		if (var4.length > 3) {
			var4[3] = this.ja_fld * var1 + this.ki_fld * var2 + var3 * this.va_fld + this.bs_fld;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V"
	)
	public void am(float var1, float var2, float var3, float var4, int var5) {
		this.ok_fld = var1;
		this.va_fld = 0.0F;
		this.ja_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.my_fld = 0.0F;
		this.ja_fld = var2;
		this.hj_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.my_fld = 0.0F;
		this.rw_fld = 0.0F;
		this.bs_fld = var3;
		this.hj_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.va_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.rw_fld = var4;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float cb() {
		return this.ok_fld * (this.hx_fld * this.ki_fld) * this.hj_fld
			+ (
				this.ok_fld * (this.bs_fld * (this.kh_fld * this.hx_fld))
					+ (
						this.bs_fld * (this.bp_fld * this.ih_fld * this.ok_fld)
							+ (
								this.xv_fld * (this.bs_fld * this.ok_fld * this.rw_fld)
									+ (
										this.ki_fld * this.my_fld * this.ih_fld * this.bp_fld
											- this.kh_fld * (this.bs_fld * this.ok_fld) * this.va_fld
											- this.rw_fld * (this.nz_fld * this.ok_fld) * this.bp_fld
											+ this.jj_fld * (this.ih_fld * (this.nz_fld * this.ja_fld))
											+ this.bp_fld * (this.rw_fld * this.bp_fld * this.va_fld)
											- this.hj_fld * this.or_fld * this.hx_fld * this.va_fld
											- this.ok_fld * (this.kh_fld * this.jj_fld * this.hj_fld)
									)
							)
							- this.xv_fld * (this.bs_fld * this.bs_fld) * this.kh_fld
							- this.ja_fld * (this.ok_fld * (this.rw_fld * this.ih_fld))
							+ this.xv_fld * (this.bp_fld * this.kh_fld * this.hx_fld)
							+ this.jj_fld * (this.bp_fld * this.va_fld * this.my_fld)
							- this.bp_fld * (this.hj_fld * (this.ok_fld * this.ih_fld))
							- this.xv_fld * this.va_fld * this.ja_fld * this.bp_fld
							+ this.my_fld * (this.va_fld * this.va_fld * this.ok_fld)
							+ this.ok_fld * (this.bs_fld * this.ok_fld) * this.nz_fld
							- this.hj_fld * (this.hx_fld * this.jj_fld * this.ja_fld)
							- this.ih_fld * (this.ih_fld * (this.bs_fld * this.nz_fld))
					)
					+ this.bs_fld * (this.ok_fld * this.ki_fld * this.or_fld)
					- this.ok_fld * (this.nz_fld * (this.bs_fld * this.rw_fld))
					- this.hx_fld * (this.nz_fld * this.bp_fld) * this.kh_fld
			);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ay(int var1) {
		this.ih_fld = 0.0F;
		this.ok_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.ja_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.hx_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.va_fld = 0.0F;
		this.rw_fld = 0.0F;
		this.or_fld = 0.0F;
		this.xv_fld = 0.0F;
		this.my_fld = 0.0F;
		this.ja_fld = 0.0F;
		this.bp_fld = 0.0F;
		this.bs_fld = 0.0F;
	}
}
