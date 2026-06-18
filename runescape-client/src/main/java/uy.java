import java.util.Arrays;
import java.util.Objects;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uy")
public class uy {
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float mp_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float cg_fld;
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float qe_fld;
	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float xn_fld;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static uy gw_fld = new uy();
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float hj_fld;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float na_fld;
	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float to_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float bf_fld;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float fs_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] ae_fld;
	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float yo_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Luy;"
	)
	static uy[] ag_fld = new uy[uy.az_fld];
	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float jk_fld;
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float jx_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float an_fld;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float nm_fld;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ql_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 848250219
	)
	static int av_fld = 0;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ga_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1142885095
	)
	static int az_fld = 1745259888;

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float vr(float var1, float var2, float var3) {
		return xc(this, var1, var2, var3, 1082803709);
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
			uc.in(var3, var1.cz(), var1.cz(), var1.cz(), -405011595);
			wf(this, var3, 643366528);
		} else {
			for (int var4 = 0; var4 < 16; var4++) {
				this.ae_fld[var4] = var1.ci();
			}
		}
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public static uy uo() {
		synchronized (ag_fld) {
			if (av_fld == 0) {
				return new uy();
			} else {
				uy var1 = ag_fld[--av_fld];
				var1.bo();
				return var1;
			}
		}
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luc;I)V"
	)
	public static void wf(uy var0, uc var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cg_fld = var1.ah_fld;
		var0.an_fld = var1.aw_fld;
		var0.to_fld = var1.ay_fld;
		var0.jk_fld = 0.0F;
		var0.bf_fld = var1.ag_fld;
		var0.mp_fld = var1.ak_fld;
		var0.nm_fld = var1.al_fld;
		var0.xn_fld = 0.0F;
		var0.hj_fld = var1.af_fld;
		var0.yo_fld = var1.av_fld;
		var0.ga_fld = var1.ar_fld;
		var0.fs_fld = 0.0F;
		var0.qe_fld = var1.az_fld;
		var0.na_fld = var1.ae_fld;
		var0.ql_fld = var1.as_fld;
		var0.jx_fld = 1.0F;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ay() {
		this.cg_fld = 1.0F;
		this.an_fld = 0.0F;
		this.to_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.bf_fld = 0.0F;
		this.mp_fld = 1.0F;
		this.nm_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.yo_fld = 0.0F;
		this.ga_fld = 1.0F;
		this.fs_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.na_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.jx_fld = 1.0F;
	}

	public uy(xi var1, boolean var2) {
		this.hj(var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aq() {
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
				uc.in(var7, var1.cz(), var1.cz(), var1.cz(), -405011595);
				wf(this, var7, 1787855714);
			} else {
				for (int var9 = 0; var9 < 16; var9++) {
					var8.ae_fld[var9] = var4.ci();
				}
			}
		} else {
			this.cg_fld = var1.cd();
			this.an_fld = var1.cd();
			this.to_fld = var1.cd();
			this.jk_fld = var1.cd();
			this.bf_fld = var1.cd();
			this.mp_fld = var1.cd();
			this.nm_fld = var1.cd();
			this.xn_fld = var1.cd();
			this.hj_fld = var1.cd();
			this.yo_fld = var1.cd();
			this.ga_fld = var1.cd();
			this.fs_fld = var1.cd();
			this.qe_fld = var1.cd();
			this.na_fld = var1.cd();
			this.ql_fld = var1.cd();
			this.jx_fld = var1.cd();
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void cm(uz var1) {
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
		this.cg_fld = var6 + var2 - var11 - var9;
		this.an_fld = var5 + (var7 + (var5 + var7));
		this.to_fld = var8 + (var8 - var4 - var4);
		this.bf_fld = var7 + (var7 - var5 - var5);
		this.mp_fld = var9 + var2 - var6 - var11;
		this.nm_fld = var3 + (var10 + var3 + var10);
		this.hj_fld = var4 + (var4 + var8 + var8);
		this.yo_fld = var10 - var3 - var3 + var10;
		this.ga_fld = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[F"
	)
	public float[] ah() {
		float[] var2 = new float[]{(float)(-Math.asin(this.nm_fld)), 0.0F, 0.0F};
		double var3 = Math.cos(var2[0]);
		if (Math.abs(var3) > 0.005) {
			double var5 = this.to_fld;
			double var7 = this.ga_fld;
			double var9 = this.bf_fld;
			double var11 = this.mp_fld;
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			double var13 = this.an_fld;
			double var14 = this.cg_fld;
			if (this.nm_fld < 0.0F) {
				var2[1] = (float)Math.atan2(var13, var14);
			} else {
				var2[1] = (float)(-Math.atan2(var13, var14));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bo() {
		this.ay();
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
		this.cg_fld = var2 + var6 - var11 - var9;
		this.an_fld = var5 + (var5 + var7 + var7);
		this.to_fld = var8 - var4 - var4 + var8;
		this.bf_fld = var7 - var5 - var5 + var7;
		this.mp_fld = var2 + var9 - var6 - var11;
		this.nm_fld = var3 + (var10 + (var10 + var3));
		this.hj_fld = var4 + (var8 + var4 + var8);
		this.yo_fld = var10 + (var10 - var3 - var3);
		this.ga_fld = var2 + var11 - var9 - var6;
		float[] var12 = this.ae_fld;
		float[] var13 = this.ae_fld;
		this.fs_fld = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.qe_fld = var1.ag_fld.ar_fld;
		this.na_fld = var1.ag_fld.ay_fld;
		this.ql_fld = var1.ag_fld.as_fld;
		this.jx_fld = 1.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)V"
	)
	public void as(uy var1) {
		this.cg_fld = var1.cg_fld;
		this.an_fld = var1.an_fld;
		this.to_fld = var1.to_fld;
		this.jk_fld = var1.jk_fld;
		this.bf_fld = var1.bf_fld;
		this.mp_fld = var1.mp_fld;
		this.nm_fld = var1.nm_fld;
		this.xn_fld = var1.xn_fld;
		this.hj_fld = var1.hj_fld;
		this.yo_fld = var1.yo_fld;
		this.ga_fld = var1.ga_fld;
		this.fs_fld = var1.fs_fld;
		this.qe_fld = var1.qe_fld;
		this.na_fld = var1.na_fld;
		this.ql_fld = var1.ql_fld;
		this.jx_fld = var1.jx_fld;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luc;)V"
	)
	public static void go(uy var0, uc var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cg_fld = var1.ah_fld;
		var0.an_fld = var1.aw_fld;
		var0.to_fld = var1.ay_fld;
		var0.jk_fld = 0.0F;
		var0.bf_fld = var1.ag_fld;
		var0.mp_fld = var1.ak_fld;
		var0.nm_fld = var1.al_fld;
		var0.xn_fld = 0.0F;
		var0.hj_fld = var1.af_fld;
		var0.yo_fld = var1.av_fld;
		var0.ga_fld = var1.ar_fld;
		var0.fs_fld = 0.0F;
		var0.qe_fld = var1.az_fld;
		var0.na_fld = var1.ae_fld;
		var0.ql_fld = var1.as_fld;
		var0.jx_fld = 1.0F;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FI)V"
	)
	public void ar(float var1) {
		this.af(var1, var1, var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V"
	)
	public void af(float var1, float var2, float var3) {
		this.ay();
		this.cg_fld = var1;
		this.mp_fld = var2;
		this.ga_fld = var3;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)Lrx;"
	)
	public static rx og(di var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 0 && var1 < var0.av_fld.length ? var0.av_fld[var1] : null;
	}

	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "(Luy;F)V"
	)
	public static void zk(uy var0, float var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af(var1, var1, var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)V"
	)
	public void al(uy var1) {
		this.cg_fld = this.cg_fld + var1.cg_fld;
		this.an_fld = this.an_fld + var1.an_fld;
		this.to_fld = this.to_fld + var1.to_fld;
		this.jk_fld = this.jk_fld + var1.jk_fld;
		this.bf_fld = this.bf_fld + var1.bf_fld;
		this.mp_fld = this.mp_fld + var1.mp_fld;
		this.nm_fld = this.nm_fld + var1.nm_fld;
		this.xn_fld = this.xn_fld + var1.xn_fld;
		this.hj_fld = this.hj_fld + var1.hj_fld;
		this.yo_fld = this.yo_fld + var1.yo_fld;
		this.ga_fld = this.ga_fld + var1.ga_fld;
		this.fs_fld = this.fs_fld + var1.fs_fld;
		this.qe_fld = this.qe_fld + var1.qe_fld;
		this.na_fld = this.na_fld + var1.na_fld;
		this.ql_fld = this.ql_fld + var1.ql_fld;
		this.jx_fld = this.jx_fld + var1.jx_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V"
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
		this.cg_fld = var3 + var7 - var12 - var10;
		this.an_fld = var6 + var8 + var6 + var8;
		this.to_fld = var9 - var5 - var5 + var9;
		this.bf_fld = var8 - var6 - var6 + var8;
		this.mp_fld = var3 + var10 - var7 - var12;
		this.nm_fld = var11 + var11 + var4 + var4;
		this.hj_fld = var9 + var9 + var5 + var5;
		this.yo_fld = var11 - var4 - var4 + var11;
		this.ga_fld = var3 + var12 - var10 - var7;
		this.fs_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.qe_fld = var1.ag_fld.ar_fld;
		this.na_fld = var1.ag_fld.ay_fld;
		this.ql_fld = var1.ag_fld.as_fld;
		this.jx_fld = 1.0F;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V"
	)
	public void ad(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.hj_fld * var3 + (this.bf_fld * var2 + var1 * this.cg_fld) + this.qe_fld;
		var4[1] = this.an_fld * var1 + var2 * this.mp_fld + var3 * this.yo_fld + this.na_fld;
		var4[2] = var1 * this.to_fld + this.nm_fld * var2 + var3 * this.ga_fld + this.ql_fld;
		if (var4.length > 3) {
			var4[3] = this.jk_fld * var1 + this.xn_fld * var2 + var3 * this.fs_fld + this.jx_fld;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	float ai() {
		return this.yo_fld * (this.jk_fld * this.nm_fld) * this.qe_fld
			+ (
				this.na_fld * (this.ga_fld * (this.jk_fld * this.bf_fld))
					+ (
						this.jx_fld * (this.nm_fld * this.an_fld * this.hj_fld)
							+ (
								this.ql_fld * (this.an_fld * this.bf_fld * this.fs_fld)
									+ (
										this.cg_fld * this.mp_fld * this.ga_fld * this.jx_fld
											- this.fs_fld * (this.mp_fld * this.cg_fld) * this.ql_fld
											- this.yo_fld * (this.cg_fld * this.nm_fld) * this.jx_fld
											+ this.na_fld * (this.fs_fld * (this.cg_fld * this.nm_fld))
											+ this.ql_fld * (this.cg_fld * this.xn_fld * this.yo_fld)
											- this.cg_fld * this.xn_fld * this.ga_fld * this.na_fld
											- this.jx_fld * (this.bf_fld * this.an_fld * this.ga_fld)
									)
							)
							- this.fs_fld * (this.an_fld * this.nm_fld) * this.qe_fld
							- this.ql_fld * (this.hj_fld * (this.xn_fld * this.an_fld))
							+ this.qe_fld * (this.an_fld * this.xn_fld * this.ga_fld)
							+ this.jx_fld * (this.to_fld * this.bf_fld * this.yo_fld)
							- this.na_fld * (this.fs_fld * (this.to_fld * this.bf_fld))
							- this.mp_fld * this.to_fld * this.hj_fld * this.jx_fld
							+ this.qe_fld * (this.to_fld * this.mp_fld * this.fs_fld)
							+ this.hj_fld * (this.to_fld * this.xn_fld) * this.na_fld
							- this.qe_fld * (this.xn_fld * this.to_fld * this.yo_fld)
							- this.ql_fld * (this.yo_fld * (this.bf_fld * this.jk_fld))
					)
					+ this.ql_fld * (this.mp_fld * this.jk_fld * this.hj_fld)
					- this.qe_fld * (this.ga_fld * (this.mp_fld * this.jk_fld))
					- this.hj_fld * (this.nm_fld * this.jk_fld) * this.na_fld
			);
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
		this.cg_fld = var6 + var2 - var11 - var9;
		this.an_fld = var5 + (var7 + (var5 + var7));
		this.to_fld = var8 + (var8 - var4 - var4);
		this.bf_fld = var7 + (var7 - var5 - var5);
		this.mp_fld = var9 + var2 - var6 - var11;
		this.nm_fld = var3 + (var10 + var3 + var10);
		this.hj_fld = var4 + (var4 + var8 + var8);
		this.yo_fld = var10 - var3 - var3 + var10;
		this.ga_fld = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V"
	)
	public void am(float var1, float var2, float var3, float var4) {
		this.cg_fld = var1;
		this.an_fld = 0.0F;
		this.to_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.bf_fld = 0.0F;
		this.mp_fld = var2;
		this.nm_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.yo_fld = 0.0F;
		this.ga_fld = var3;
		this.fs_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.na_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.jx_fld = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F"
	)
	public float ab(float var1, float var2, float var3) {
		return this.qe_fld + (this.hj_fld * var3 + (this.cg_fld * var1 + var2 * this.bf_fld));
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float cb() {
		return this.yo_fld * (this.jk_fld * this.nm_fld) * this.qe_fld
			+ (
				this.na_fld * (this.ga_fld * (this.jk_fld * this.bf_fld))
					+ (
						this.jx_fld * (this.nm_fld * this.an_fld * this.hj_fld)
							+ (
								this.ql_fld * (this.an_fld * this.bf_fld * this.fs_fld)
									+ (
										this.cg_fld * this.mp_fld * this.ga_fld * this.jx_fld
											- this.fs_fld * (this.mp_fld * this.cg_fld) * this.ql_fld
											- this.yo_fld * (this.cg_fld * this.nm_fld) * this.jx_fld
											+ this.na_fld * (this.fs_fld * (this.cg_fld * this.nm_fld))
											+ this.ql_fld * (this.cg_fld * this.xn_fld * this.yo_fld)
											- this.cg_fld * this.xn_fld * this.ga_fld * this.na_fld
											- this.jx_fld * (this.bf_fld * this.an_fld * this.ga_fld)
									)
							)
							- this.fs_fld * (this.an_fld * this.nm_fld) * this.qe_fld
							- this.ql_fld * (this.hj_fld * (this.xn_fld * this.an_fld))
							+ this.qe_fld * (this.an_fld * this.xn_fld * this.ga_fld)
							+ this.jx_fld * (this.to_fld * this.bf_fld * this.yo_fld)
							- this.na_fld * (this.fs_fld * (this.to_fld * this.bf_fld))
							- this.mp_fld * this.to_fld * this.hj_fld * this.jx_fld
							+ this.qe_fld * (this.to_fld * this.mp_fld * this.fs_fld)
							+ this.hj_fld * (this.to_fld * this.xn_fld) * this.na_fld
							- this.qe_fld * (this.xn_fld * this.to_fld * this.yo_fld)
							- this.ql_fld * (this.yo_fld * (this.bf_fld * this.jk_fld))
					)
					+ this.ql_fld * (this.mp_fld * this.jk_fld * this.hj_fld)
					- this.qe_fld * (this.ga_fld * (this.mp_fld * this.jk_fld))
					- this.hj_fld * (this.nm_fld * this.jk_fld) * this.na_fld
			);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F"
	)
	public float at(float var1, float var2, float var3) {
		return var1 * this.to_fld + this.nm_fld * var2 + this.ga_fld * var3 + this.ql_fld;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return "Mat4{m0="
			+ this.cg_fld
			+ ", m1="
			+ this.an_fld
			+ ", m2="
			+ this.to_fld
			+ ", m3="
			+ this.jk_fld
			+ ", m4="
			+ this.bf_fld
			+ ", m5="
			+ this.mp_fld
			+ ", m6="
			+ this.nm_fld
			+ ", m7="
			+ this.xn_fld
			+ ", m8="
			+ this.hj_fld
			+ ", m9="
			+ this.yo_fld
			+ ", m10="
			+ this.ga_fld
			+ ", m11="
			+ this.fs_fld
			+ ", m12="
			+ this.qe_fld
			+ ", m13="
			+ this.na_fld
			+ ", m14="
			+ this.ql_fld
			+ ", m15="
			+ this.jx_fld
			+ "}";
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void el(float var1, float var2, float var3, float var4) {
		this.am(var1, var2, var3, var4);
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		return Objects.hash(
			(Object[])(new Object[]{
				this.cg_fld,
				this.an_fld,
				this.to_fld,
				this.jk_fld,
				this.bf_fld,
				this.mp_fld,
				this.nm_fld,
				this.xn_fld,
				this.hj_fld,
				this.yo_fld,
				this.ga_fld,
				this.fs_fld,
				this.qe_fld,
				this.na_fld,
				this.ql_fld,
				this.jx_fld
			})
		);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else if (var1 != null && this.getClass() == var1.getClass()) {
			uy var2 = (uy)var1;
			return Float.compare(var2.cg_fld, this.cg_fld) == 0
				&& Float.compare(var2.an_fld, this.an_fld) == 0
				&& Float.compare(var2.to_fld, this.to_fld) == 0
				&& Float.compare(var2.jk_fld, this.jk_fld) == 0
				&& Float.compare(var2.bf_fld, this.bf_fld) == 0
				&& Float.compare(var2.mp_fld, this.mp_fld) == 0
				&& Float.compare(var2.nm_fld, this.nm_fld) == 0
				&& Float.compare(var2.xn_fld, this.xn_fld) == 0
				&& Float.compare(var2.hj_fld, this.hj_fld) == 0
				&& Float.compare(var2.yo_fld, this.yo_fld) == 0
				&& Float.compare(var2.ga_fld, this.ga_fld) == 0
				&& Float.compare(var2.fs_fld, this.fs_fld) == 0
				&& Float.compare(var2.qe_fld, this.qe_fld) == 0
				&& Float.compare(var2.na_fld, this.na_fld) == 0
				&& Float.compare(var2.ql_fld, this.ql_fld) == 0
				&& Float.compare(var2.jx_fld, this.jx_fld) == 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Luy;Lul;)V"
	)
	public static void je(uy var0, ul var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
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
			var0.cg_fld = var2 + var6 - var11 - var9;
			var0.an_fld = var5 + (var5 + var7 + var7);
			var0.to_fld = var8 - var4 - var4 + var8;
			var0.bf_fld = var7 - var5 - var5 + var7;
			var0.mp_fld = var2 + var9 - var6 - var11;
			var0.nm_fld = var3 + (var10 + (var10 + var3));
			var0.hj_fld = var4 + (var8 + var4 + var8);
			var0.yo_fld = var10 + (var10 - var3 - var3);
			var0.ga_fld = var2 + var11 - var9 - var6;
			float[] var12 = var0.ae_fld;
			float[] var13 = var0.ae_fld;
			var0.fs_fld = 0.0F;
			var13[7] = 0.0F;
			var12[3] = 0.0F;
			var0.qe_fld = var1.ag_fld.ar_fld;
			var0.na_fld = var1.ag_fld.ay_fld;
			var0.ql_fld = var1.ag_fld.as_fld;
			var0.jx_fld = 1.0F;
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public static void ii(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (ag_fld) {
			if (av_fld < az_fld) {
				ag_fld[(av_fld += 916466747) * -1929312436 - 1] = var0;
			}
		}
	}

	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;)V"
	)
	public static void ty(uy var0, uy var1) {
		System.arraycopy(var1.ae_fld, 0, var0.ae_fld, 0, 16);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[F"
	)
	public float[] ac() {
		float[] var2 = new float[3];
		tu var3 = new tu(this.cg_fld, this.an_fld, this.to_fld);
		tu var4 = new tu(this.bf_fld, this.mp_fld, this.nm_fld);
		tu var5 = new tu(this.hj_fld, this.yo_fld, this.ga_fld);
		var2[0] = tu.ml(var3, (byte)-97);
		var2[1] = tu.ml(var4, (byte)-111);
		var2[2] = tu.ml(var5, (byte)-17);
		return var2;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cy(uy var1) {
		this.al(var1);
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)V"
	)
	public void dc(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.hj_fld * var3 + (this.bf_fld * var2 + var1 * this.cg_fld) + this.qe_fld;
		var4[1] = this.an_fld * var1 + var2 * this.mp_fld + var3 * this.yo_fld + this.na_fld;
		var4[2] = var1 * this.to_fld + this.nm_fld * var2 + var3 * this.ga_fld + this.ql_fld;
		if (var4.length > 3) {
			var4[3] = this.jk_fld * var1 + this.xn_fld * var2 + var3 * this.fs_fld + this.jx_fld;
		}
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

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void qi(uz var1) {
		this.an(var1);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Z)V"
	)
	void bk(xi var1, boolean var2) {
		if (var2) {
			uc var3 = new uc();
			var3.ag(dk.ak(var1.cz(), (byte)4));
			var3.az(dk.ak(var1.cz(), (byte)4));
			var3.av(dk.ak(var1.cz(), (byte)4));
			uc.in(var3, var1.cz(), var1.cz(), var1.cz(), -405011595);
			wf(this, var3, 2000963076);
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

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)V"
	)
	public void po(float var1, float var2, float var3, float[] var4) {
		this.ad(var1, var2, var3, var4);
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

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		byte var1 = 31;
		byte var2 = 1;
		return 1413458960 * var2 + Arrays.hashCode(this.ae_fld);
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
				ag_fld[(av_fld -= 1453506371) * -1114272072].ay();
				return ag_fld[687274211 * av_fld];
			}
		}
	}

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "(Luc;)V"
	)
	public void yt(uc var1) {
		wf(this, var1, 1787855714);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Z)V"
	)
	public void hj(xi var1, boolean var2) {
		this.av(var1, var2, -1493871898);
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dt(float var1, float var2, float var3) {
		return this.qe_fld + (this.hj_fld * var3 + (this.cg_fld * var1 + var2 * this.bf_fld));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aw() {
		float var2 = 1.0F / this.ai();
		float var3 = (
				this.ga_fld * this.mp_fld * this.jx_fld
					- this.ql_fld * (this.fs_fld * this.mp_fld)
					- this.nm_fld * this.yo_fld * this.jx_fld
					+ this.na_fld * (this.fs_fld * this.nm_fld)
					+ this.ql_fld * (this.yo_fld * this.xn_fld)
					- this.ga_fld * this.xn_fld * this.na_fld
			)
			* var2;
		float var4 = var2
			* (
				this.ga_fld * this.jk_fld * this.na_fld
					+ (
						this.ql_fld * (this.an_fld * this.fs_fld)
							+ this.jx_fld * (-this.an_fld * this.ga_fld)
							+ this.to_fld * this.yo_fld * this.jx_fld
							- this.na_fld * (this.fs_fld * this.to_fld)
							- this.ql_fld * (this.jk_fld * this.yo_fld)
					)
			);
		float var5 = var2
			* (
				this.nm_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.xn_fld * this.ql_fld
					- this.to_fld * this.mp_fld * this.jx_fld
					+ this.xn_fld * this.to_fld * this.na_fld
					+ this.mp_fld * this.jk_fld * this.ql_fld
					- this.nm_fld * this.jk_fld * this.na_fld
			);
		float var6 = var2
			* (
				this.yo_fld * (this.jk_fld * this.nm_fld)
					+ (
						this.to_fld * this.mp_fld * this.fs_fld
							+ (-this.an_fld * this.nm_fld * this.fs_fld + this.an_fld * this.xn_fld * this.ga_fld)
							- this.yo_fld * (this.xn_fld * this.to_fld)
							- this.mp_fld * this.jk_fld * this.ga_fld
					)
			);
		float var7 = (
				this.jx_fld * (this.hj_fld * this.nm_fld)
					+ (this.ql_fld * (this.fs_fld * this.bf_fld) + this.jx_fld * (-this.bf_fld * this.ga_fld))
					- this.nm_fld * this.fs_fld * this.qe_fld
					- this.ql_fld * (this.xn_fld * this.hj_fld)
					+ this.qe_fld * (this.ga_fld * this.xn_fld)
			)
			* var2;
		float var8 = (
				this.ga_fld * this.cg_fld * this.jx_fld
					- this.fs_fld * this.cg_fld * this.ql_fld
					- this.hj_fld * this.to_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.to_fld)
					+ this.ql_fld * (this.hj_fld * this.jk_fld)
					- this.qe_fld * (this.ga_fld * this.jk_fld)
			)
			* var2;
		float var9 = (
				this.jx_fld * (this.bf_fld * this.to_fld)
					+ (this.ql_fld * (this.cg_fld * this.xn_fld) + this.jx_fld * (-this.cg_fld * this.nm_fld))
					- this.to_fld * this.xn_fld * this.qe_fld
					- this.ql_fld * (this.bf_fld * this.jk_fld)
					+ this.qe_fld * (this.nm_fld * this.jk_fld)
			)
			* var2;
		float var10 = (
				this.jk_fld * this.bf_fld * this.ga_fld
					+ (
						this.fs_fld * (this.nm_fld * this.cg_fld)
							- this.xn_fld * this.cg_fld * this.ga_fld
							- this.to_fld * this.bf_fld * this.fs_fld
							+ this.hj_fld * (this.to_fld * this.xn_fld)
					)
					- this.hj_fld * (this.nm_fld * this.jk_fld)
			)
			* var2;
		float var11 = var2
			* (
				this.yo_fld * this.bf_fld * this.jx_fld
					- this.fs_fld * this.bf_fld * this.na_fld
					- this.mp_fld * this.hj_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.mp_fld)
					+ this.na_fld * (this.xn_fld * this.hj_fld)
					- this.xn_fld * this.yo_fld * this.qe_fld
			);
		float var12 = (
				this.fs_fld * this.cg_fld * this.na_fld
					+ -this.cg_fld * this.yo_fld * this.jx_fld
					+ this.hj_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.fs_fld * this.qe_fld
					- this.hj_fld * this.jk_fld * this.na_fld
					+ this.qe_fld * (this.jk_fld * this.yo_fld)
			)
			* var2;
		float var13 = (
				this.an_fld * this.xn_fld * this.qe_fld
					+ (this.jx_fld * (this.mp_fld * this.cg_fld) - this.na_fld * (this.xn_fld * this.cg_fld) - this.jx_fld * (this.bf_fld * this.an_fld))
					+ this.jk_fld * this.bf_fld * this.na_fld
					- this.qe_fld * (this.mp_fld * this.jk_fld)
			)
			* var2;
		float var14 = var2
			* (
				this.hj_fld * (this.jk_fld * this.mp_fld)
					+ (
						this.xn_fld * this.cg_fld * this.yo_fld
							+ this.fs_fld * (-this.cg_fld * this.mp_fld)
							+ this.bf_fld * this.an_fld * this.fs_fld
							- this.xn_fld * this.an_fld * this.hj_fld
							- this.yo_fld * (this.bf_fld * this.jk_fld)
					)
			);
		float var15 = var2
			* (
				this.yo_fld * this.nm_fld * this.qe_fld
					+ (
						this.ql_fld * (this.hj_fld * this.mp_fld)
							+ (this.ql_fld * (-this.bf_fld * this.yo_fld) + this.bf_fld * this.ga_fld * this.na_fld)
							- this.qe_fld * (this.mp_fld * this.ga_fld)
							- this.na_fld * (this.nm_fld * this.hj_fld)
					)
			);
		float var16 = (
				this.an_fld * this.ga_fld * this.qe_fld
					+ (this.cg_fld * this.yo_fld * this.ql_fld - this.ga_fld * this.cg_fld * this.na_fld - this.ql_fld * (this.hj_fld * this.an_fld))
					+ this.na_fld * (this.to_fld * this.hj_fld)
					- this.to_fld * this.yo_fld * this.qe_fld
			)
			* var2;
		float var17 = (
				this.nm_fld * this.cg_fld * this.na_fld
					+ this.mp_fld * -this.cg_fld * this.ql_fld
					+ this.ql_fld * (this.bf_fld * this.an_fld)
					- this.nm_fld * this.an_fld * this.qe_fld
					- this.bf_fld * this.to_fld * this.na_fld
					+ this.qe_fld * (this.to_fld * this.mp_fld)
			)
			* var2;
		float var18 = (
				this.yo_fld * (this.to_fld * this.bf_fld)
					+ (
						this.mp_fld * this.cg_fld * this.ga_fld
							- this.nm_fld * this.cg_fld * this.yo_fld
							- this.bf_fld * this.an_fld * this.ga_fld
							+ this.nm_fld * this.an_fld * this.hj_fld
					)
					- this.hj_fld * (this.mp_fld * this.to_fld)
			)
			* var2;
		this.cg_fld = var3;
		this.an_fld = var4;
		this.to_fld = var5;
		this.jk_fld = var6;
		this.bf_fld = var7;
		this.mp_fld = var8;
		this.nm_fld = var9;
		this.xn_fld = var10;
		this.hj_fld = var11;
		this.yo_fld = var12;
		this.ga_fld = var13;
		this.fs_fld = var14;
		this.qe_fld = var15;
		this.na_fld = var16;
		this.ql_fld = var17;
		this.jx_fld = var18;
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
				ag_fld[(av_fld -= 1453506371) * -2091184879].as(var0);
				return ag_fld[av_fld];
			}
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cu() {
		synchronized (ag_fld) {
			if (av_fld < az_fld) {
				ag_fld[(av_fld += 1453506371) * 848250219 - 1] = this;
			}
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cq(uy var1) {
		float var2 = this.to_fld * var1.hj_fld + (var1.cg_fld * this.cg_fld + this.an_fld * var1.bf_fld) + this.jk_fld * var1.qe_fld;
		float var3 = var1.na_fld * this.jk_fld + (var1.an_fld * this.cg_fld + this.an_fld * var1.mp_fld + var1.yo_fld * this.to_fld);
		float var4 = this.jk_fld * var1.ql_fld + (this.cg_fld * var1.to_fld + this.an_fld * var1.nm_fld + this.to_fld * var1.ga_fld);
		float var5 = var1.jx_fld * this.jk_fld + (this.to_fld * var1.fs_fld + (var1.xn_fld * this.an_fld + this.cg_fld * var1.jk_fld));
		float var6 = var1.qe_fld * this.xn_fld + (var1.hj_fld * this.nm_fld + (this.bf_fld * var1.cg_fld + this.mp_fld * var1.bf_fld));
		float var7 = this.mp_fld * var1.mp_fld + var1.an_fld * this.bf_fld + var1.yo_fld * this.nm_fld + var1.na_fld * this.xn_fld;
		float var8 = var1.to_fld * this.bf_fld + this.mp_fld * var1.nm_fld + this.nm_fld * var1.ga_fld + this.xn_fld * var1.ql_fld;
		float var9 = this.xn_fld * var1.jx_fld + (var1.xn_fld * this.mp_fld + var1.jk_fld * this.bf_fld + this.nm_fld * var1.fs_fld);
		float var10 = this.fs_fld * var1.qe_fld + (this.ga_fld * var1.hj_fld + (var1.bf_fld * this.yo_fld + var1.cg_fld * this.hj_fld));
		float var11 = var1.an_fld * this.hj_fld + this.yo_fld * var1.mp_fld + this.ga_fld * var1.yo_fld + this.fs_fld * var1.na_fld;
		float var12 = this.ga_fld * var1.ga_fld + (this.yo_fld * var1.nm_fld + this.hj_fld * var1.to_fld) + var1.ql_fld * this.fs_fld;
		float var13 = var1.jk_fld * this.hj_fld + var1.xn_fld * this.yo_fld + this.ga_fld * var1.fs_fld + this.fs_fld * var1.jx_fld;
		float var14 = var1.qe_fld * this.jx_fld + (var1.hj_fld * this.ql_fld + (this.na_fld * var1.bf_fld + this.qe_fld * var1.cg_fld));
		float var15 = var1.an_fld * this.qe_fld + var1.mp_fld * this.na_fld + this.ql_fld * var1.yo_fld + var1.na_fld * this.jx_fld;
		float var16 = var1.ql_fld * this.jx_fld + (var1.nm_fld * this.na_fld + this.qe_fld * var1.to_fld + var1.ga_fld * this.ql_fld);
		float var17 = this.qe_fld * var1.jk_fld + var1.xn_fld * this.na_fld + var1.fs_fld * this.ql_fld + this.jx_fld * var1.jx_fld;
		this.cg_fld = var2;
		this.an_fld = var3;
		this.to_fld = var4;
		this.jk_fld = var5;
		this.bf_fld = var6;
		this.mp_fld = var7;
		this.nm_fld = var8;
		this.xn_fld = var9;
		this.hj_fld = var10;
		this.yo_fld = var11;
		this.ga_fld = var12;
		this.fs_fld = var13;
		this.qe_fld = var14;
		this.na_fld = var15;
		this.ql_fld = var16;
		this.jx_fld = var17;
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
		this.cg_fld = 1.0F;
		this.mp_fld = 1.0F;
		this.ga_fld = 1.0F;
		this.jx_fld = 1.0F;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dl(float var1, float var2, float var3) {
		return this.na_fld + (this.an_fld * var1 + var2 * this.mp_fld + var3 * this.yo_fld);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	float[] by() {
		float[] var1 = new float[3];
		if (this.to_fld < 0.999 && this.to_fld > -0.999) {
			var1[1] = (float)(-Math.asin(this.to_fld));
			double var2 = Math.cos(var1[1]);
			var1[0] = (float)Math.atan2(this.nm_fld / var2, this.ga_fld / var2);
			var1[2] = (float)Math.atan2(this.an_fld / var2, this.cg_fld / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2(this.to_fld, 0.0);
			var1[2] = (float)Math.atan2(-this.yo_fld, this.mp_fld);
		}

		return var1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] bl() {
		float[] var1 = new float[]{(float)(-Math.asin(this.nm_fld)), 0.0F, 0.0F};
		double var2 = Math.cos(var1[0]);
		if (Math.abs(var2) > 0.005) {
			double var4 = this.to_fld;
			double var6 = this.ga_fld;
			double var8 = this.bf_fld;
			double var10 = this.mp_fld;
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			double var12 = this.an_fld;
			double var13 = this.cg_fld;
			if (this.nm_fld < 0.0F) {
				var1[1] = (float)Math.atan2(var12, var13);
			} else {
				var1[1] = (float)(-Math.atan2(var12, var13));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bi() {
		this.cg_fld = 0.0F;
		this.an_fld = 0.0F;
		this.to_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.bf_fld = 0.0F;
		this.mp_fld = 0.0F;
		this.nm_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.yo_fld = 0.0F;
		this.ga_fld = 0.0F;
		this.fs_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.na_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.jx_fld = 0.0F;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bu() {
		this.cg_fld = 0.0F;
		this.an_fld = 0.0F;
		this.to_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.bf_fld = 0.0F;
		this.mp_fld = 0.0F;
		this.nm_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.yo_fld = 0.0F;
		this.ga_fld = 0.0F;
		this.fs_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.na_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.jx_fld = 0.0F;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hb() {
		this.cg_fld = 0.0F;
		this.an_fld = 0.0F;
		this.to_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.bf_fld = 0.0F;
		this.mp_fld = 0.0F;
		this.nm_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.yo_fld = 0.0F;
		this.ga_fld = 0.0F;
		this.fs_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.na_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.jx_fld = 0.0F;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void nm() {
		this.cg_fld = 0.0F;
		this.an_fld = 0.0F;
		this.to_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.bf_fld = 0.0F;
		this.mp_fld = 0.0F;
		this.nm_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.yo_fld = 0.0F;
		this.ga_fld = 0.0F;
		this.fs_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.na_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.jx_fld = 0.0F;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([F)V"
	)
	public void an(float[] var1) {
		var1[0] = this.cg_fld;
		var1[1] = this.an_fld;
		var1[2] = this.to_fld;
		var1[3] = this.jk_fld;
		var1[4] = this.bf_fld;
		var1[5] = this.mp_fld;
		var1[6] = this.nm_fld;
		var1[7] = this.xn_fld;
		var1[8] = this.hj_fld;
		var1[9] = this.yo_fld;
		var1[10] = this.ga_fld;
		var1[11] = this.fs_fld;
		var1[12] = this.qe_fld;
		var1[13] = this.na_fld;
		var1[14] = this.ql_fld;
		var1[15] = this.jx_fld;
	}

	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void xu(uy var1) {
		System.arraycopy(var1.ae_fld, 0, this.ae_fld, 0, 16);
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
			uc.in(var3, var1.cz(), var1.cz(), var1.cz(), -405011595);
			wf(this, var3, 1963420154);
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
		return var1 * this.to_fld + this.nm_fld * var2 + this.ga_fld * var3 + this.ql_fld;
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float lu(float var1, float var2, float var3) {
		return this.ab(var1, var2, var3);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] bx() {
		float[] var1 = new float[]{(float)(-Math.asin(this.nm_fld)), 0.0F, 0.0F};
		double var2 = Math.cos(var1[0]);
		if (Math.abs(var2) > 0.005) {
			double var4 = this.to_fld;
			double var6 = this.ga_fld;
			double var8 = this.bf_fld;
			double var10 = this.mp_fld;
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			double var12 = this.an_fld;
			double var13 = this.cg_fld;
			if (this.nm_fld < 0.0F) {
				var1[1] = (float)Math.atan2(var12, var13);
			} else {
				var1[1] = (float)(-Math.atan2(var12, var13));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void bg(float var1) {
		this.af(var1, var1, var1);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void bb(float var1, float var2, float var3) {
		this.ay();
		this.cg_fld = var1;
		this.mp_fld = var2;
		this.ga_fld = var3;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void cd(float var1, float var2, float var3) {
		this.ay();
		this.cg_fld = var1;
		this.mp_fld = var2;
		this.ga_fld = var3;
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
				ag_fld[(av_fld -= 1855122456) * 848250219].as(var0);
				return ag_fld[av_fld];
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void bn(uy var1) {
		for (int var2 = 0; var2 < this.ae_fld.length; var2++) {
			this.ae_fld[var2] = this.ae_fld[var2] + var1.ae_fld[var2];
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cf(uy var1) {
		for (int var2 = 0; var2 < this.ae_fld.length; var2++) {
			this.ae_fld[var2] = this.ae_fld[var2] + var1.ae_fld[var2];
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;I)V"
	)
	public static void es(uy var0, uy var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		float var3 = var0.to_fld * var1.hj_fld + (var1.cg_fld * var0.cg_fld + var0.an_fld * var1.bf_fld) + var0.jk_fld * var1.qe_fld;
		float var4 = var1.na_fld * var0.jk_fld + (var1.an_fld * var0.cg_fld + var0.an_fld * var1.mp_fld + var1.yo_fld * var0.to_fld);
		float var5 = var0.jk_fld * var1.ql_fld + (var0.cg_fld * var1.to_fld + var0.an_fld * var1.nm_fld + var0.to_fld * var1.ga_fld);
		float var6 = var1.jx_fld * var0.jk_fld + (var0.to_fld * var1.fs_fld + (var1.xn_fld * var0.an_fld + var0.cg_fld * var1.jk_fld));
		float var7 = var1.qe_fld * var0.xn_fld + (var1.hj_fld * var0.nm_fld + (var0.bf_fld * var1.cg_fld + var0.mp_fld * var1.bf_fld));
		float var8 = var0.mp_fld * var1.mp_fld + var1.an_fld * var0.bf_fld + var1.yo_fld * var0.nm_fld + var1.na_fld * var0.xn_fld;
		float var9 = var1.to_fld * var0.bf_fld + var0.mp_fld * var1.nm_fld + var0.nm_fld * var1.ga_fld + var0.xn_fld * var1.ql_fld;
		float var10 = var0.xn_fld * var1.jx_fld + (var1.xn_fld * var0.mp_fld + var1.jk_fld * var0.bf_fld + var0.nm_fld * var1.fs_fld);
		float var11 = var0.fs_fld * var1.qe_fld + (var0.ga_fld * var1.hj_fld + (var1.bf_fld * var0.yo_fld + var1.cg_fld * var0.hj_fld));
		float var12 = var1.an_fld * var0.hj_fld + var0.yo_fld * var1.mp_fld + var0.ga_fld * var1.yo_fld + var0.fs_fld * var1.na_fld;
		float var13 = var0.ga_fld * var1.ga_fld + (var0.yo_fld * var1.nm_fld + var0.hj_fld * var1.to_fld) + var1.ql_fld * var0.fs_fld;
		float var14 = var1.jk_fld * var0.hj_fld + var1.xn_fld * var0.yo_fld + var0.ga_fld * var1.fs_fld + var0.fs_fld * var1.jx_fld;
		float var15 = var1.qe_fld * var0.jx_fld + (var1.hj_fld * var0.ql_fld + (var0.na_fld * var1.bf_fld + var0.qe_fld * var1.cg_fld));
		float var16 = var1.an_fld * var0.qe_fld + var1.mp_fld * var0.na_fld + var0.ql_fld * var1.yo_fld + var1.na_fld * var0.jx_fld;
		float var17 = var1.ql_fld * var0.jx_fld + (var1.nm_fld * var0.na_fld + var0.qe_fld * var1.to_fld + var1.ga_fld * var0.ql_fld);
		float var18 = var0.qe_fld * var1.jk_fld + var1.xn_fld * var0.na_fld + var1.fs_fld * var0.ql_fld + var0.jx_fld * var1.jx_fld;
		var0.cg_fld = var3;
		var0.an_fld = var4;
		var0.to_fld = var5;
		var0.jk_fld = var6;
		var0.bf_fld = var7;
		var0.mp_fld = var8;
		var0.nm_fld = var9;
		var0.xn_fld = var10;
		var0.hj_fld = var11;
		var0.yo_fld = var12;
		var0.ga_fld = var13;
		var0.fs_fld = var14;
		var0.qe_fld = var15;
		var0.na_fld = var16;
		var0.ql_fld = var17;
		var0.jx_fld = var18;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void ba(uy var1) {
		for (int var2 = 0; var2 < this.ae_fld.length; var2++) {
			this.ae_fld[var2] = this.ae_fld[var2] + var1.ae_fld[var2];
		}
	}

	public uy(uy var1) {
		this.cv(var1);
	}

	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void tz(uy var1) {
		float var2 = this.to_fld * var1.hj_fld + (var1.cg_fld * this.cg_fld + this.an_fld * var1.bf_fld) + this.jk_fld * var1.qe_fld;
		float var3 = var1.na_fld * this.jk_fld + (var1.an_fld * this.cg_fld + this.an_fld * var1.mp_fld + var1.yo_fld * this.to_fld);
		float var4 = this.jk_fld * var1.ql_fld + (this.cg_fld * var1.to_fld + this.an_fld * var1.nm_fld + this.to_fld * var1.ga_fld);
		float var5 = var1.jx_fld * this.jk_fld + (this.to_fld * var1.fs_fld + (var1.xn_fld * this.an_fld + this.cg_fld * var1.jk_fld));
		float var6 = var1.qe_fld * this.xn_fld + (var1.hj_fld * this.nm_fld + (this.bf_fld * var1.cg_fld + this.mp_fld * var1.bf_fld));
		float var7 = this.mp_fld * var1.mp_fld + var1.an_fld * this.bf_fld + var1.yo_fld * this.nm_fld + var1.na_fld * this.xn_fld;
		float var8 = var1.to_fld * this.bf_fld + this.mp_fld * var1.nm_fld + this.nm_fld * var1.ga_fld + this.xn_fld * var1.ql_fld;
		float var9 = this.xn_fld * var1.jx_fld + (var1.xn_fld * this.mp_fld + var1.jk_fld * this.bf_fld + this.nm_fld * var1.fs_fld);
		float var10 = this.fs_fld * var1.qe_fld + (this.ga_fld * var1.hj_fld + (var1.bf_fld * this.yo_fld + var1.cg_fld * this.hj_fld));
		float var11 = var1.an_fld * this.hj_fld + this.yo_fld * var1.mp_fld + this.ga_fld * var1.yo_fld + this.fs_fld * var1.na_fld;
		float var12 = this.ga_fld * var1.ga_fld + (this.yo_fld * var1.nm_fld + this.hj_fld * var1.to_fld) + var1.ql_fld * this.fs_fld;
		float var13 = var1.jk_fld * this.hj_fld + var1.xn_fld * this.yo_fld + this.ga_fld * var1.fs_fld + this.fs_fld * var1.jx_fld;
		float var14 = var1.qe_fld * this.jx_fld + (var1.hj_fld * this.ql_fld + (this.na_fld * var1.bf_fld + this.qe_fld * var1.cg_fld));
		float var15 = var1.an_fld * this.qe_fld + var1.mp_fld * this.na_fld + this.ql_fld * var1.yo_fld + var1.na_fld * this.jx_fld;
		float var16 = var1.ql_fld * this.jx_fld + (var1.nm_fld * this.na_fld + this.qe_fld * var1.to_fld + var1.ga_fld * this.ql_fld);
		float var17 = this.qe_fld * var1.jk_fld + var1.xn_fld * this.na_fld + var1.fs_fld * this.ql_fld + this.jx_fld * var1.jx_fld;
		this.cg_fld = var2;
		this.an_fld = var3;
		this.to_fld = var4;
		this.jk_fld = var5;
		this.bf_fld = var6;
		this.mp_fld = var7;
		this.nm_fld = var8;
		this.xn_fld = var9;
		this.hj_fld = var10;
		this.yo_fld = var11;
		this.ga_fld = var12;
		this.fs_fld = var13;
		this.qe_fld = var14;
		this.na_fld = var15;
		this.ql_fld = var16;
		this.jx_fld = var17;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void aa(float var1, float var2, float var3) {
		this.af(var1, var2, var3);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cx(uy var1) {
		float var2 = this.to_fld * var1.hj_fld + (var1.cg_fld * this.cg_fld + this.an_fld * var1.bf_fld) + this.jk_fld * var1.qe_fld;
		float var3 = var1.na_fld * this.jk_fld + (var1.an_fld * this.cg_fld + this.an_fld * var1.mp_fld + var1.yo_fld * this.to_fld);
		float var4 = this.jk_fld * var1.ql_fld + (this.cg_fld * var1.to_fld + this.an_fld * var1.nm_fld + this.to_fld * var1.ga_fld);
		float var5 = var1.jx_fld * this.jk_fld + (this.to_fld * var1.fs_fld + (var1.xn_fld * this.an_fld + this.cg_fld * var1.jk_fld));
		float var6 = var1.qe_fld * this.xn_fld + (var1.hj_fld * this.nm_fld + (this.bf_fld * var1.cg_fld + this.mp_fld * var1.bf_fld));
		float var7 = this.mp_fld * var1.mp_fld + var1.an_fld * this.bf_fld + var1.yo_fld * this.nm_fld + var1.na_fld * this.xn_fld;
		float var8 = var1.to_fld * this.bf_fld + this.mp_fld * var1.nm_fld + this.nm_fld * var1.ga_fld + this.xn_fld * var1.ql_fld;
		float var9 = this.xn_fld * var1.jx_fld + (var1.xn_fld * this.mp_fld + var1.jk_fld * this.bf_fld + this.nm_fld * var1.fs_fld);
		float var10 = this.fs_fld * var1.qe_fld + (this.ga_fld * var1.hj_fld + (var1.bf_fld * this.yo_fld + var1.cg_fld * this.hj_fld));
		float var11 = var1.an_fld * this.hj_fld + this.yo_fld * var1.mp_fld + this.ga_fld * var1.yo_fld + this.fs_fld * var1.na_fld;
		float var12 = this.ga_fld * var1.ga_fld + (this.yo_fld * var1.nm_fld + this.hj_fld * var1.to_fld) + var1.ql_fld * this.fs_fld;
		float var13 = var1.jk_fld * this.hj_fld + var1.xn_fld * this.yo_fld + this.ga_fld * var1.fs_fld + this.fs_fld * var1.jx_fld;
		float var14 = var1.qe_fld * this.jx_fld + (var1.hj_fld * this.ql_fld + (this.na_fld * var1.bf_fld + this.qe_fld * var1.cg_fld));
		float var15 = var1.an_fld * this.qe_fld + var1.mp_fld * this.na_fld + this.ql_fld * var1.yo_fld + var1.na_fld * this.jx_fld;
		float var16 = var1.ql_fld * this.jx_fld + (var1.nm_fld * this.na_fld + this.qe_fld * var1.to_fld + var1.ga_fld * this.ql_fld);
		float var17 = this.qe_fld * var1.jk_fld + var1.xn_fld * this.na_fld + var1.fs_fld * this.ql_fld + this.jx_fld * var1.jx_fld;
		this.cg_fld = var2;
		this.an_fld = var3;
		this.to_fld = var4;
		this.jk_fld = var5;
		this.bf_fld = var6;
		this.mp_fld = var7;
		this.nm_fld = var8;
		this.xn_fld = var9;
		this.hj_fld = var10;
		this.yo_fld = var11;
		this.ga_fld = var12;
		this.fs_fld = var13;
		this.qe_fld = var14;
		this.na_fld = var15;
		this.ql_fld = var16;
		this.jx_fld = var17;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bs() {
		float var1 = 1.0F / this.ai();
		float var2 = (
				this.ga_fld * this.mp_fld * this.jx_fld
					- this.ql_fld * (this.fs_fld * this.mp_fld)
					- this.nm_fld * this.yo_fld * this.jx_fld
					+ this.na_fld * (this.fs_fld * this.nm_fld)
					+ this.ql_fld * (this.yo_fld * this.xn_fld)
					- this.ga_fld * this.xn_fld * this.na_fld
			)
			* var1;
		float var3 = var1
			* (
				this.ga_fld * this.jk_fld * this.na_fld
					+ (
						this.ql_fld * (this.an_fld * this.fs_fld)
							+ this.jx_fld * (-this.an_fld * this.ga_fld)
							+ this.to_fld * this.yo_fld * this.jx_fld
							- this.na_fld * (this.fs_fld * this.to_fld)
							- this.ql_fld * (this.jk_fld * this.yo_fld)
					)
			);
		float var4 = var1
			* (
				this.nm_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.xn_fld * this.ql_fld
					- this.to_fld * this.mp_fld * this.jx_fld
					+ this.xn_fld * this.to_fld * this.na_fld
					+ this.mp_fld * this.jk_fld * this.ql_fld
					- this.nm_fld * this.jk_fld * this.na_fld
			);
		float var5 = var1
			* (
				this.yo_fld * (this.jk_fld * this.nm_fld)
					+ (
						this.to_fld * this.mp_fld * this.fs_fld
							+ (-this.an_fld * this.nm_fld * this.fs_fld + this.an_fld * this.xn_fld * this.ga_fld)
							- this.yo_fld * (this.xn_fld * this.to_fld)
							- this.mp_fld * this.jk_fld * this.ga_fld
					)
			);
		float var6 = (
				this.jx_fld * (this.hj_fld * this.nm_fld)
					+ (this.ql_fld * (this.fs_fld * this.bf_fld) + this.jx_fld * (-this.bf_fld * this.ga_fld))
					- this.nm_fld * this.fs_fld * this.qe_fld
					- this.ql_fld * (this.xn_fld * this.hj_fld)
					+ this.qe_fld * (this.ga_fld * this.xn_fld)
			)
			* var1;
		float var7 = (
				this.ga_fld * this.cg_fld * this.jx_fld
					- this.fs_fld * this.cg_fld * this.ql_fld
					- this.hj_fld * this.to_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.to_fld)
					+ this.ql_fld * (this.hj_fld * this.jk_fld)
					- this.qe_fld * (this.ga_fld * this.jk_fld)
			)
			* var1;
		float var8 = (
				this.jx_fld * (this.bf_fld * this.to_fld)
					+ (this.ql_fld * (this.cg_fld * this.xn_fld) + this.jx_fld * (-this.cg_fld * this.nm_fld))
					- this.to_fld * this.xn_fld * this.qe_fld
					- this.ql_fld * (this.bf_fld * this.jk_fld)
					+ this.qe_fld * (this.nm_fld * this.jk_fld)
			)
			* var1;
		float var9 = (
				this.jk_fld * this.bf_fld * this.ga_fld
					+ (
						this.fs_fld * (this.nm_fld * this.cg_fld)
							- this.xn_fld * this.cg_fld * this.ga_fld
							- this.to_fld * this.bf_fld * this.fs_fld
							+ this.hj_fld * (this.to_fld * this.xn_fld)
					)
					- this.hj_fld * (this.nm_fld * this.jk_fld)
			)
			* var1;
		float var10 = var1
			* (
				this.yo_fld * this.bf_fld * this.jx_fld
					- this.fs_fld * this.bf_fld * this.na_fld
					- this.mp_fld * this.hj_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.mp_fld)
					+ this.na_fld * (this.xn_fld * this.hj_fld)
					- this.xn_fld * this.yo_fld * this.qe_fld
			);
		float var11 = (
				this.fs_fld * this.cg_fld * this.na_fld
					+ -this.cg_fld * this.yo_fld * this.jx_fld
					+ this.hj_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.fs_fld * this.qe_fld
					- this.hj_fld * this.jk_fld * this.na_fld
					+ this.qe_fld * (this.jk_fld * this.yo_fld)
			)
			* var1;
		float var12 = (
				this.an_fld * this.xn_fld * this.qe_fld
					+ (this.jx_fld * (this.mp_fld * this.cg_fld) - this.na_fld * (this.xn_fld * this.cg_fld) - this.jx_fld * (this.bf_fld * this.an_fld))
					+ this.jk_fld * this.bf_fld * this.na_fld
					- this.qe_fld * (this.mp_fld * this.jk_fld)
			)
			* var1;
		float var13 = var1
			* (
				this.hj_fld * (this.jk_fld * this.mp_fld)
					+ (
						this.xn_fld * this.cg_fld * this.yo_fld
							+ this.fs_fld * (-this.cg_fld * this.mp_fld)
							+ this.bf_fld * this.an_fld * this.fs_fld
							- this.xn_fld * this.an_fld * this.hj_fld
							- this.yo_fld * (this.bf_fld * this.jk_fld)
					)
			);
		float var14 = var1
			* (
				this.yo_fld * this.nm_fld * this.qe_fld
					+ (
						this.ql_fld * (this.hj_fld * this.mp_fld)
							+ (this.ql_fld * (-this.bf_fld * this.yo_fld) + this.bf_fld * this.ga_fld * this.na_fld)
							- this.qe_fld * (this.mp_fld * this.ga_fld)
							- this.na_fld * (this.nm_fld * this.hj_fld)
					)
			);
		float var15 = (
				this.an_fld * this.ga_fld * this.qe_fld
					+ (this.cg_fld * this.yo_fld * this.ql_fld - this.ga_fld * this.cg_fld * this.na_fld - this.ql_fld * (this.hj_fld * this.an_fld))
					+ this.na_fld * (this.to_fld * this.hj_fld)
					- this.to_fld * this.yo_fld * this.qe_fld
			)
			* var1;
		float var16 = (
				this.nm_fld * this.cg_fld * this.na_fld
					+ this.mp_fld * -this.cg_fld * this.ql_fld
					+ this.ql_fld * (this.bf_fld * this.an_fld)
					- this.nm_fld * this.an_fld * this.qe_fld
					- this.bf_fld * this.to_fld * this.na_fld
					+ this.qe_fld * (this.to_fld * this.mp_fld)
			)
			* var1;
		float var17 = (
				this.yo_fld * (this.to_fld * this.bf_fld)
					+ (
						this.mp_fld * this.cg_fld * this.ga_fld
							- this.nm_fld * this.cg_fld * this.yo_fld
							- this.bf_fld * this.an_fld * this.ga_fld
							+ this.nm_fld * this.an_fld * this.hj_fld
					)
					- this.hj_fld * (this.mp_fld * this.to_fld)
			)
			* var1;
		this.cg_fld = var2;
		this.an_fld = var3;
		this.to_fld = var4;
		this.jk_fld = var5;
		this.bf_fld = var6;
		this.mp_fld = var7;
		this.nm_fld = var8;
		this.xn_fld = var9;
		this.hj_fld = var10;
		this.yo_fld = var11;
		this.ga_fld = var12;
		this.fs_fld = var13;
		this.qe_fld = var14;
		this.na_fld = var15;
		this.ql_fld = var16;
		this.jx_fld = var17;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public void ce(ul var1) {
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
		this.cg_fld = var2 + var6 - var11 - var9;
		this.an_fld = var5 + (var5 + var7 + var7);
		this.to_fld = var8 - var4 - var4 + var8;
		this.bf_fld = var7 - var5 - var5 + var7;
		this.mp_fld = var2 + var9 - var6 - var11;
		this.nm_fld = var3 + (var10 + (var10 + var3));
		this.hj_fld = var4 + (var8 + var4 + var8);
		this.yo_fld = var10 + (var10 - var3 - var3);
		this.ga_fld = var2 + var11 - var9 - var6;
		float[] var12 = this.ae_fld;
		float[] var13 = this.ae_fld;
		this.fs_fld = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.qe_fld = var1.ag_fld.ar_fld;
		this.na_fld = var1.ag_fld.ay_fld;
		this.ql_fld = var1.ag_fld.as_fld;
		this.jx_fld = 1.0F;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public static uy bm() {
		synchronized (ag_fld) {
			if (0 == av_fld) {
				return new uy();
			} else {
				ag_fld[(av_fld -= -548393722) * 848250219].ay();
				return ag_fld[-1091495203 * av_fld];
			}
		}
	}

	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void xo() {
		yu(this, 7063493);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dq(float var1, float var2, float var3) {
		return this.na_fld + (this.an_fld * var1 + var2 * this.mp_fld + var3 * this.yo_fld);
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
		this.cg_fld = var6 + var2 - var11 - var9;
		this.an_fld = var5 + (var7 + (var5 + var7));
		this.to_fld = var8 + (var8 - var4 - var4);
		this.bf_fld = var7 + (var7 - var5 - var5);
		this.mp_fld = var9 + var2 - var6 - var11;
		this.nm_fld = var3 + (var10 + var3 + var10);
		this.hj_fld = var4 + (var4 + var8 + var8);
		this.yo_fld = var10 - var3 - var3 + var10;
		this.ga_fld = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Luz;B)V"
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
		this.cg_fld = var7 + var3 - var12 - var10;
		this.an_fld = var6 + (var8 + (var6 + var8));
		this.to_fld = var9 + (var9 - var5 - var5);
		this.bf_fld = var8 + (var8 - var6 - var6);
		this.mp_fld = var10 + var3 - var7 - var12;
		this.nm_fld = var4 + (var11 + var4 + var11);
		this.hj_fld = var5 + (var5 + var9 + var9);
		this.yo_fld = var11 - var4 - var4 + var11;
		this.ga_fld = var12 + var3 - var10 - var7;
	}

	static {
		new uy();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void be() {
		float var1 = 1.0F / this.ai();
		float var2 = (
				this.ga_fld * this.mp_fld * this.jx_fld
					- this.ql_fld * (this.fs_fld * this.mp_fld)
					- this.nm_fld * this.yo_fld * this.jx_fld
					+ this.na_fld * (this.fs_fld * this.nm_fld)
					+ this.ql_fld * (this.yo_fld * this.xn_fld)
					- this.ga_fld * this.xn_fld * this.na_fld
			)
			* var1;
		float var3 = var1
			* (
				this.ga_fld * this.jk_fld * this.na_fld
					+ (
						this.ql_fld * (this.an_fld * this.fs_fld)
							+ this.jx_fld * (-this.an_fld * this.ga_fld)
							+ this.to_fld * this.yo_fld * this.jx_fld
							- this.na_fld * (this.fs_fld * this.to_fld)
							- this.ql_fld * (this.jk_fld * this.yo_fld)
					)
			);
		float var4 = var1
			* (
				this.nm_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.xn_fld * this.ql_fld
					- this.to_fld * this.mp_fld * this.jx_fld
					+ this.xn_fld * this.to_fld * this.na_fld
					+ this.mp_fld * this.jk_fld * this.ql_fld
					- this.nm_fld * this.jk_fld * this.na_fld
			);
		float var5 = var1
			* (
				this.yo_fld * (this.jk_fld * this.nm_fld)
					+ (
						this.to_fld * this.mp_fld * this.fs_fld
							+ (-this.an_fld * this.nm_fld * this.fs_fld + this.an_fld * this.xn_fld * this.ga_fld)
							- this.yo_fld * (this.xn_fld * this.to_fld)
							- this.mp_fld * this.jk_fld * this.ga_fld
					)
			);
		float var6 = (
				this.jx_fld * (this.hj_fld * this.nm_fld)
					+ (this.ql_fld * (this.fs_fld * this.bf_fld) + this.jx_fld * (-this.bf_fld * this.ga_fld))
					- this.nm_fld * this.fs_fld * this.qe_fld
					- this.ql_fld * (this.xn_fld * this.hj_fld)
					+ this.qe_fld * (this.ga_fld * this.xn_fld)
			)
			* var1;
		float var7 = (
				this.ga_fld * this.cg_fld * this.jx_fld
					- this.fs_fld * this.cg_fld * this.ql_fld
					- this.hj_fld * this.to_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.to_fld)
					+ this.ql_fld * (this.hj_fld * this.jk_fld)
					- this.qe_fld * (this.ga_fld * this.jk_fld)
			)
			* var1;
		float var8 = (
				this.jx_fld * (this.bf_fld * this.to_fld)
					+ (this.ql_fld * (this.cg_fld * this.xn_fld) + this.jx_fld * (-this.cg_fld * this.nm_fld))
					- this.to_fld * this.xn_fld * this.qe_fld
					- this.ql_fld * (this.bf_fld * this.jk_fld)
					+ this.qe_fld * (this.nm_fld * this.jk_fld)
			)
			* var1;
		float var9 = (
				this.jk_fld * this.bf_fld * this.ga_fld
					+ (
						this.fs_fld * (this.nm_fld * this.cg_fld)
							- this.xn_fld * this.cg_fld * this.ga_fld
							- this.to_fld * this.bf_fld * this.fs_fld
							+ this.hj_fld * (this.to_fld * this.xn_fld)
					)
					- this.hj_fld * (this.nm_fld * this.jk_fld)
			)
			* var1;
		float var10 = var1
			* (
				this.yo_fld * this.bf_fld * this.jx_fld
					- this.fs_fld * this.bf_fld * this.na_fld
					- this.mp_fld * this.hj_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.mp_fld)
					+ this.na_fld * (this.xn_fld * this.hj_fld)
					- this.xn_fld * this.yo_fld * this.qe_fld
			);
		float var11 = (
				this.fs_fld * this.cg_fld * this.na_fld
					+ -this.cg_fld * this.yo_fld * this.jx_fld
					+ this.hj_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.fs_fld * this.qe_fld
					- this.hj_fld * this.jk_fld * this.na_fld
					+ this.qe_fld * (this.jk_fld * this.yo_fld)
			)
			* var1;
		float var12 = (
				this.an_fld * this.xn_fld * this.qe_fld
					+ (this.jx_fld * (this.mp_fld * this.cg_fld) - this.na_fld * (this.xn_fld * this.cg_fld) - this.jx_fld * (this.bf_fld * this.an_fld))
					+ this.jk_fld * this.bf_fld * this.na_fld
					- this.qe_fld * (this.mp_fld * this.jk_fld)
			)
			* var1;
		float var13 = var1
			* (
				this.hj_fld * (this.jk_fld * this.mp_fld)
					+ (
						this.xn_fld * this.cg_fld * this.yo_fld
							+ this.fs_fld * (-this.cg_fld * this.mp_fld)
							+ this.bf_fld * this.an_fld * this.fs_fld
							- this.xn_fld * this.an_fld * this.hj_fld
							- this.yo_fld * (this.bf_fld * this.jk_fld)
					)
			);
		float var14 = var1
			* (
				this.yo_fld * this.nm_fld * this.qe_fld
					+ (
						this.ql_fld * (this.hj_fld * this.mp_fld)
							+ (this.ql_fld * (-this.bf_fld * this.yo_fld) + this.bf_fld * this.ga_fld * this.na_fld)
							- this.qe_fld * (this.mp_fld * this.ga_fld)
							- this.na_fld * (this.nm_fld * this.hj_fld)
					)
			);
		float var15 = (
				this.an_fld * this.ga_fld * this.qe_fld
					+ (this.cg_fld * this.yo_fld * this.ql_fld - this.ga_fld * this.cg_fld * this.na_fld - this.ql_fld * (this.hj_fld * this.an_fld))
					+ this.na_fld * (this.to_fld * this.hj_fld)
					- this.to_fld * this.yo_fld * this.qe_fld
			)
			* var1;
		float var16 = (
				this.nm_fld * this.cg_fld * this.na_fld
					+ this.mp_fld * -this.cg_fld * this.ql_fld
					+ this.ql_fld * (this.bf_fld * this.an_fld)
					- this.nm_fld * this.an_fld * this.qe_fld
					- this.bf_fld * this.to_fld * this.na_fld
					+ this.qe_fld * (this.to_fld * this.mp_fld)
			)
			* var1;
		float var17 = (
				this.yo_fld * (this.to_fld * this.bf_fld)
					+ (
						this.mp_fld * this.cg_fld * this.ga_fld
							- this.nm_fld * this.cg_fld * this.yo_fld
							- this.bf_fld * this.an_fld * this.ga_fld
							+ this.nm_fld * this.an_fld * this.hj_fld
					)
					- this.hj_fld * (this.mp_fld * this.to_fld)
			)
			* var1;
		this.cg_fld = var2;
		this.an_fld = var3;
		this.to_fld = var4;
		this.jk_fld = var5;
		this.bf_fld = var6;
		this.mp_fld = var7;
		this.nm_fld = var8;
		this.xn_fld = var9;
		this.hj_fld = var10;
		this.yo_fld = var11;
		this.ga_fld = var12;
		this.fs_fld = var13;
		this.qe_fld = var14;
		this.na_fld = var15;
		this.ql_fld = var16;
		this.jx_fld = var17;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bf() {
		this.aw();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cp(uy var1) {
		System.arraycopy(var1.ae_fld, 0, this.ae_fld, 0, 16);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bt() {
		float var1 = 1.0F / this.ai();
		float var2 = (
				this.ga_fld * this.mp_fld * this.jx_fld
					- this.ql_fld * (this.fs_fld * this.mp_fld)
					- this.nm_fld * this.yo_fld * this.jx_fld
					+ this.na_fld * (this.fs_fld * this.nm_fld)
					+ this.ql_fld * (this.yo_fld * this.xn_fld)
					- this.ga_fld * this.xn_fld * this.na_fld
			)
			* var1;
		float var3 = var1
			* (
				this.ga_fld * this.jk_fld * this.na_fld
					+ (
						this.ql_fld * (this.an_fld * this.fs_fld)
							+ this.jx_fld * (-this.an_fld * this.ga_fld)
							+ this.to_fld * this.yo_fld * this.jx_fld
							- this.na_fld * (this.fs_fld * this.to_fld)
							- this.ql_fld * (this.jk_fld * this.yo_fld)
					)
			);
		float var4 = var1
			* (
				this.nm_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.xn_fld * this.ql_fld
					- this.to_fld * this.mp_fld * this.jx_fld
					+ this.xn_fld * this.to_fld * this.na_fld
					+ this.mp_fld * this.jk_fld * this.ql_fld
					- this.nm_fld * this.jk_fld * this.na_fld
			);
		float var5 = var1
			* (
				this.yo_fld * (this.jk_fld * this.nm_fld)
					+ (
						this.to_fld * this.mp_fld * this.fs_fld
							+ (-this.an_fld * this.nm_fld * this.fs_fld + this.an_fld * this.xn_fld * this.ga_fld)
							- this.yo_fld * (this.xn_fld * this.to_fld)
							- this.mp_fld * this.jk_fld * this.ga_fld
					)
			);
		float var6 = (
				this.jx_fld * (this.hj_fld * this.nm_fld)
					+ (this.ql_fld * (this.fs_fld * this.bf_fld) + this.jx_fld * (-this.bf_fld * this.ga_fld))
					- this.nm_fld * this.fs_fld * this.qe_fld
					- this.ql_fld * (this.xn_fld * this.hj_fld)
					+ this.qe_fld * (this.ga_fld * this.xn_fld)
			)
			* var1;
		float var7 = (
				this.ga_fld * this.cg_fld * this.jx_fld
					- this.fs_fld * this.cg_fld * this.ql_fld
					- this.hj_fld * this.to_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.to_fld)
					+ this.ql_fld * (this.hj_fld * this.jk_fld)
					- this.qe_fld * (this.ga_fld * this.jk_fld)
			)
			* var1;
		float var8 = (
				this.jx_fld * (this.bf_fld * this.to_fld)
					+ (this.ql_fld * (this.cg_fld * this.xn_fld) + this.jx_fld * (-this.cg_fld * this.nm_fld))
					- this.to_fld * this.xn_fld * this.qe_fld
					- this.ql_fld * (this.bf_fld * this.jk_fld)
					+ this.qe_fld * (this.nm_fld * this.jk_fld)
			)
			* var1;
		float var9 = (
				this.jk_fld * this.bf_fld * this.ga_fld
					+ (
						this.fs_fld * (this.nm_fld * this.cg_fld)
							- this.xn_fld * this.cg_fld * this.ga_fld
							- this.to_fld * this.bf_fld * this.fs_fld
							+ this.hj_fld * (this.to_fld * this.xn_fld)
					)
					- this.hj_fld * (this.nm_fld * this.jk_fld)
			)
			* var1;
		float var10 = var1
			* (
				this.yo_fld * this.bf_fld * this.jx_fld
					- this.fs_fld * this.bf_fld * this.na_fld
					- this.mp_fld * this.hj_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.mp_fld)
					+ this.na_fld * (this.xn_fld * this.hj_fld)
					- this.xn_fld * this.yo_fld * this.qe_fld
			);
		float var11 = (
				this.fs_fld * this.cg_fld * this.na_fld
					+ -this.cg_fld * this.yo_fld * this.jx_fld
					+ this.hj_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.fs_fld * this.qe_fld
					- this.hj_fld * this.jk_fld * this.na_fld
					+ this.qe_fld * (this.jk_fld * this.yo_fld)
			)
			* var1;
		float var12 = (
				this.an_fld * this.xn_fld * this.qe_fld
					+ (this.jx_fld * (this.mp_fld * this.cg_fld) - this.na_fld * (this.xn_fld * this.cg_fld) - this.jx_fld * (this.bf_fld * this.an_fld))
					+ this.jk_fld * this.bf_fld * this.na_fld
					- this.qe_fld * (this.mp_fld * this.jk_fld)
			)
			* var1;
		float var13 = var1
			* (
				this.hj_fld * (this.jk_fld * this.mp_fld)
					+ (
						this.xn_fld * this.cg_fld * this.yo_fld
							+ this.fs_fld * (-this.cg_fld * this.mp_fld)
							+ this.bf_fld * this.an_fld * this.fs_fld
							- this.xn_fld * this.an_fld * this.hj_fld
							- this.yo_fld * (this.bf_fld * this.jk_fld)
					)
			);
		float var14 = var1
			* (
				this.yo_fld * this.nm_fld * this.qe_fld
					+ (
						this.ql_fld * (this.hj_fld * this.mp_fld)
							+ (this.ql_fld * (-this.bf_fld * this.yo_fld) + this.bf_fld * this.ga_fld * this.na_fld)
							- this.qe_fld * (this.mp_fld * this.ga_fld)
							- this.na_fld * (this.nm_fld * this.hj_fld)
					)
			);
		float var15 = (
				this.an_fld * this.ga_fld * this.qe_fld
					+ (this.cg_fld * this.yo_fld * this.ql_fld - this.ga_fld * this.cg_fld * this.na_fld - this.ql_fld * (this.hj_fld * this.an_fld))
					+ this.na_fld * (this.to_fld * this.hj_fld)
					- this.to_fld * this.yo_fld * this.qe_fld
			)
			* var1;
		float var16 = (
				this.nm_fld * this.cg_fld * this.na_fld
					+ this.mp_fld * -this.cg_fld * this.ql_fld
					+ this.ql_fld * (this.bf_fld * this.an_fld)
					- this.nm_fld * this.an_fld * this.qe_fld
					- this.bf_fld * this.to_fld * this.na_fld
					+ this.qe_fld * (this.to_fld * this.mp_fld)
			)
			* var1;
		float var17 = (
				this.yo_fld * (this.to_fld * this.bf_fld)
					+ (
						this.mp_fld * this.cg_fld * this.ga_fld
							- this.nm_fld * this.cg_fld * this.yo_fld
							- this.bf_fld * this.an_fld * this.ga_fld
							+ this.nm_fld * this.an_fld * this.hj_fld
					)
					- this.hj_fld * (this.mp_fld * this.to_fld)
			)
			* var1;
		this.cg_fld = var2;
		this.an_fld = var3;
		this.to_fld = var4;
		this.jk_fld = var5;
		this.bf_fld = var6;
		this.mp_fld = var7;
		this.nm_fld = var8;
		this.xn_fld = var9;
		this.hj_fld = var10;
		this.yo_fld = var11;
		this.ga_fld = var12;
		this.fs_fld = var13;
		this.qe_fld = var14;
		this.na_fld = var15;
		this.ql_fld = var16;
		this.jx_fld = var17;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ci() {
		float var1 = 1.0F / this.ai();
		float var2 = (
				this.ga_fld * this.mp_fld * this.jx_fld
					- this.ql_fld * (this.fs_fld * this.mp_fld)
					- this.nm_fld * this.yo_fld * this.jx_fld
					+ this.na_fld * (this.fs_fld * this.nm_fld)
					+ this.ql_fld * (this.yo_fld * this.xn_fld)
					- this.ga_fld * this.xn_fld * this.na_fld
			)
			* var1;
		float var3 = var1
			* (
				this.ga_fld * this.jk_fld * this.na_fld
					+ (
						this.ql_fld * (this.an_fld * this.fs_fld)
							+ this.jx_fld * (-this.an_fld * this.ga_fld)
							+ this.to_fld * this.yo_fld * this.jx_fld
							- this.na_fld * (this.fs_fld * this.to_fld)
							- this.ql_fld * (this.jk_fld * this.yo_fld)
					)
			);
		float var4 = var1
			* (
				this.nm_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.xn_fld * this.ql_fld
					- this.to_fld * this.mp_fld * this.jx_fld
					+ this.xn_fld * this.to_fld * this.na_fld
					+ this.mp_fld * this.jk_fld * this.ql_fld
					- this.nm_fld * this.jk_fld * this.na_fld
			);
		float var5 = var1
			* (
				this.yo_fld * (this.jk_fld * this.nm_fld)
					+ (
						this.to_fld * this.mp_fld * this.fs_fld
							+ (-this.an_fld * this.nm_fld * this.fs_fld + this.an_fld * this.xn_fld * this.ga_fld)
							- this.yo_fld * (this.xn_fld * this.to_fld)
							- this.mp_fld * this.jk_fld * this.ga_fld
					)
			);
		float var6 = (
				this.jx_fld * (this.hj_fld * this.nm_fld)
					+ (this.ql_fld * (this.fs_fld * this.bf_fld) + this.jx_fld * (-this.bf_fld * this.ga_fld))
					- this.nm_fld * this.fs_fld * this.qe_fld
					- this.ql_fld * (this.xn_fld * this.hj_fld)
					+ this.qe_fld * (this.ga_fld * this.xn_fld)
			)
			* var1;
		float var7 = (
				this.ga_fld * this.cg_fld * this.jx_fld
					- this.fs_fld * this.cg_fld * this.ql_fld
					- this.hj_fld * this.to_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.to_fld)
					+ this.ql_fld * (this.hj_fld * this.jk_fld)
					- this.qe_fld * (this.ga_fld * this.jk_fld)
			)
			* var1;
		float var8 = (
				this.jx_fld * (this.bf_fld * this.to_fld)
					+ (this.ql_fld * (this.cg_fld * this.xn_fld) + this.jx_fld * (-this.cg_fld * this.nm_fld))
					- this.to_fld * this.xn_fld * this.qe_fld
					- this.ql_fld * (this.bf_fld * this.jk_fld)
					+ this.qe_fld * (this.nm_fld * this.jk_fld)
			)
			* var1;
		float var9 = (
				this.jk_fld * this.bf_fld * this.ga_fld
					+ (
						this.fs_fld * (this.nm_fld * this.cg_fld)
							- this.xn_fld * this.cg_fld * this.ga_fld
							- this.to_fld * this.bf_fld * this.fs_fld
							+ this.hj_fld * (this.to_fld * this.xn_fld)
					)
					- this.hj_fld * (this.nm_fld * this.jk_fld)
			)
			* var1;
		float var10 = var1
			* (
				this.yo_fld * this.bf_fld * this.jx_fld
					- this.fs_fld * this.bf_fld * this.na_fld
					- this.mp_fld * this.hj_fld * this.jx_fld
					+ this.qe_fld * (this.fs_fld * this.mp_fld)
					+ this.na_fld * (this.xn_fld * this.hj_fld)
					- this.xn_fld * this.yo_fld * this.qe_fld
			);
		float var11 = (
				this.fs_fld * this.cg_fld * this.na_fld
					+ -this.cg_fld * this.yo_fld * this.jx_fld
					+ this.hj_fld * this.an_fld * this.jx_fld
					- this.an_fld * this.fs_fld * this.qe_fld
					- this.hj_fld * this.jk_fld * this.na_fld
					+ this.qe_fld * (this.jk_fld * this.yo_fld)
			)
			* var1;
		float var12 = (
				this.an_fld * this.xn_fld * this.qe_fld
					+ (this.jx_fld * (this.mp_fld * this.cg_fld) - this.na_fld * (this.xn_fld * this.cg_fld) - this.jx_fld * (this.bf_fld * this.an_fld))
					+ this.jk_fld * this.bf_fld * this.na_fld
					- this.qe_fld * (this.mp_fld * this.jk_fld)
			)
			* var1;
		float var13 = var1
			* (
				this.hj_fld * (this.jk_fld * this.mp_fld)
					+ (
						this.xn_fld * this.cg_fld * this.yo_fld
							+ this.fs_fld * (-this.cg_fld * this.mp_fld)
							+ this.bf_fld * this.an_fld * this.fs_fld
							- this.xn_fld * this.an_fld * this.hj_fld
							- this.yo_fld * (this.bf_fld * this.jk_fld)
					)
			);
		float var14 = var1
			* (
				this.yo_fld * this.nm_fld * this.qe_fld
					+ (
						this.ql_fld * (this.hj_fld * this.mp_fld)
							+ (this.ql_fld * (-this.bf_fld * this.yo_fld) + this.bf_fld * this.ga_fld * this.na_fld)
							- this.qe_fld * (this.mp_fld * this.ga_fld)
							- this.na_fld * (this.nm_fld * this.hj_fld)
					)
			);
		float var15 = (
				this.an_fld * this.ga_fld * this.qe_fld
					+ (this.cg_fld * this.yo_fld * this.ql_fld - this.ga_fld * this.cg_fld * this.na_fld - this.ql_fld * (this.hj_fld * this.an_fld))
					+ this.na_fld * (this.to_fld * this.hj_fld)
					- this.to_fld * this.yo_fld * this.qe_fld
			)
			* var1;
		float var16 = (
				this.nm_fld * this.cg_fld * this.na_fld
					+ this.mp_fld * -this.cg_fld * this.ql_fld
					+ this.ql_fld * (this.bf_fld * this.an_fld)
					- this.nm_fld * this.an_fld * this.qe_fld
					- this.bf_fld * this.to_fld * this.na_fld
					+ this.qe_fld * (this.to_fld * this.mp_fld)
			)
			* var1;
		float var17 = (
				this.yo_fld * (this.to_fld * this.bf_fld)
					+ (
						this.mp_fld * this.cg_fld * this.ga_fld
							- this.nm_fld * this.cg_fld * this.yo_fld
							- this.bf_fld * this.an_fld * this.ga_fld
							+ this.nm_fld * this.an_fld * this.hj_fld
					)
					- this.hj_fld * (this.mp_fld * this.to_fld)
			)
			* var1;
		this.cg_fld = var2;
		this.an_fld = var3;
		this.to_fld = var4;
		this.jk_fld = var5;
		this.bf_fld = var6;
		this.mp_fld = var7;
		this.nm_fld = var8;
		this.xn_fld = var9;
		this.hj_fld = var10;
		this.yo_fld = var11;
		this.ga_fld = var12;
		this.fs_fld = var13;
		this.qe_fld = var14;
		this.na_fld = var15;
		this.ql_fld = var16;
		this.jx_fld = var17;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float fb(float var1, float var2, float var3) {
		return this.at(var1, var2, var3);
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Luy;)F"
	)
	public static float pl(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.yo_fld * (var0.jk_fld * var0.nm_fld) * var0.qe_fld
			+ (
				var0.na_fld * (var0.ga_fld * (var0.jk_fld * var0.bf_fld))
					+ (
						var0.jx_fld * (var0.nm_fld * var0.an_fld * var0.hj_fld)
							+ (
								var0.ql_fld * (var0.an_fld * var0.bf_fld * var0.fs_fld)
									+ (
										var0.cg_fld * var0.mp_fld * var0.ga_fld * var0.jx_fld
											- var0.fs_fld * (var0.mp_fld * var0.cg_fld) * var0.ql_fld
											- var0.yo_fld * (var0.cg_fld * var0.nm_fld) * var0.jx_fld
											+ var0.na_fld * (var0.fs_fld * (var0.cg_fld * var0.nm_fld))
											+ var0.ql_fld * (var0.cg_fld * var0.xn_fld * var0.yo_fld)
											- var0.cg_fld * var0.xn_fld * var0.ga_fld * var0.na_fld
											- var0.jx_fld * (var0.bf_fld * var0.an_fld * var0.ga_fld)
									)
							)
							- var0.fs_fld * (var0.an_fld * var0.nm_fld) * var0.qe_fld
							- var0.ql_fld * (var0.hj_fld * (var0.xn_fld * var0.an_fld))
							+ var0.qe_fld * (var0.an_fld * var0.xn_fld * var0.ga_fld)
							+ var0.jx_fld * (var0.to_fld * var0.bf_fld * var0.yo_fld)
							- var0.na_fld * (var0.fs_fld * (var0.to_fld * var0.bf_fld))
							- var0.mp_fld * var0.to_fld * var0.hj_fld * var0.jx_fld
							+ var0.qe_fld * (var0.to_fld * var0.mp_fld * var0.fs_fld)
							+ var0.hj_fld * (var0.to_fld * var0.xn_fld) * var0.na_fld
							- var0.qe_fld * (var0.xn_fld * var0.to_fld * var0.yo_fld)
							- var0.ql_fld * (var0.yo_fld * (var0.bf_fld * var0.jk_fld))
					)
					+ var0.ql_fld * (var0.mp_fld * var0.jk_fld * var0.hj_fld)
					- var0.qe_fld * (var0.ga_fld * (var0.mp_fld * var0.jk_fld))
					- var0.hj_fld * (var0.nm_fld * var0.jk_fld) * var0.na_fld
			);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void ct(float var1, float var2, float var3, float var4) {
		this.cg_fld = var1;
		this.an_fld = 0.0F;
		this.to_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.bf_fld = 0.0F;
		this.mp_fld = var2;
		this.nm_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.yo_fld = 0.0F;
		this.ga_fld = var3;
		this.fs_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.na_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.jx_fld = var4;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cj() {
		this.aq();
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
			uc.in(var3, var1.cz(), var1.cz(), var1.cz(), -405011595);
			wf(this, var3, 2099060501);
		} else {
			for (int var4 = 0; var4 < 16; var4++) {
				this.ae_fld[var4] = var1.ci();
			}
		}
	}

	@ObfuscatedName("xc")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFFI)F"
	)
	public static float xc(uy var0, float var1, float var2, float var3, int var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.na_fld + (var0.an_fld * var1 + var2 * var0.mp_fld + var3 * var0.yo_fld);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public static void cz(uy var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.cg_fld = 0.0F;
			var0.an_fld = 0.0F;
			var0.to_fld = 0.0F;
			var0.jk_fld = 0.0F;
			var0.bf_fld = 0.0F;
			var0.mp_fld = 0.0F;
			var0.nm_fld = 0.0F;
			var0.xn_fld = 0.0F;
			var0.hj_fld = 0.0F;
			var0.yo_fld = 0.0F;
			var0.ga_fld = 0.0F;
			var0.fs_fld = 0.0F;
			var0.qe_fld = 0.0F;
			var0.na_fld = 0.0F;
			var0.ql_fld = 0.0F;
			var0.jx_fld = 0.0F;
		}
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public void wx(ul var1) {
		this.ax(var1);
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFF)F"
	)
	public static float ne(uy var0, float var1, float var2, float var3) {
		return var0.na_fld + (var0.an_fld * var1 + var2 * var0.mp_fld + var3 * var0.yo_fld);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public void ca(ul var1) {
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
		this.cg_fld = var2 + var6 - var11 - var9;
		this.an_fld = var5 + (var5 + var7 + var7);
		this.to_fld = var8 - var4 - var4 + var8;
		this.bf_fld = var7 - var5 - var5 + var7;
		this.mp_fld = var2 + var9 - var6 - var11;
		this.nm_fld = var3 + (var10 + (var10 + var3));
		this.hj_fld = var4 + (var8 + var4 + var8);
		this.yo_fld = var10 + (var10 - var3 - var3);
		this.ga_fld = var2 + var11 - var9 - var6;
		float[] var12 = this.ae_fld;
		float[] var13 = this.ae_fld;
		this.fs_fld = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.qe_fld = var1.ag_fld.ar_fld;
		this.na_fld = var1.ag_fld.ay_fld;
		this.ql_fld = var1.ag_fld.as_fld;
		this.jx_fld = 1.0F;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)V"
	)
	public void dh(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.hj_fld * var3 + (this.bf_fld * var2 + var1 * this.cg_fld) + this.qe_fld;
		var4[1] = this.an_fld * var1 + var2 * this.mp_fld + var3 * this.yo_fld + this.na_fld;
		var4[2] = var1 * this.to_fld + this.nm_fld * var2 + var3 * this.ga_fld + this.ql_fld;
		if (var4.length > 3) {
			var4[3] = this.jk_fld * var1 + this.xn_fld * var2 + var3 * this.fs_fld + this.jx_fld;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Luy;)[F"
	)
	public static float[] ca(uy var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			float[] var1 = new float[3];
			tu var2 = new tu(var0.cg_fld, var0.an_fld, var0.to_fld);
			tu var3 = new tu(var0.bf_fld, var0.mp_fld, var0.nm_fld);
			tu var4 = new tu(var0.hj_fld, var0.yo_fld, var0.ga_fld);
			var1[0] = tu.ml(var2, (byte)-120);
			var1[1] = tu.ml(var3, (byte)-73);
			var1[2] = tu.ml(var4, (byte)-120);
			return var1;
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(FFF)Ltu;"
	)
	public tu dv(float var1, float var2, float var3) {
		float var4 = 1.0F / (this.jx_fld + (var1 * this.jk_fld + var2 * this.xn_fld + this.fs_fld * var3));
		return sh.ak(
			var4 * (this.qe_fld + (var3 * this.hj_fld + (this.cg_fld * var1 + var2 * this.bf_fld))),
			(var2 * this.mp_fld + var1 * this.an_fld + var3 * this.yo_fld + this.na_fld) * var4,
			(this.ql_fld + (var3 * this.ga_fld + (this.nm_fld * var2 + this.to_fld * var1))) * var4
		);
	}

	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;)V"
	)
	public static void qu(uy var0, uy var1) {
		System.arraycopy(var1.ae_fld, 0, var0.ae_fld, 0, 16);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dz(float var1, float var2, float var3) {
		return this.qe_fld + (this.hj_fld * var3 + (this.cg_fld * var1 + var2 * this.bf_fld));
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)V"
	)
	public static void yu(uy var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.cg_fld = 0.0F;
			var0.an_fld = 0.0F;
			var0.to_fld = 0.0F;
			var0.jk_fld = 0.0F;
			var0.bf_fld = 0.0F;
			var0.mp_fld = 0.0F;
			var0.nm_fld = 0.0F;
			var0.xn_fld = 0.0F;
			var0.hj_fld = 0.0F;
			var0.yo_fld = 0.0F;
			var0.ga_fld = 0.0F;
			var0.fs_fld = 0.0F;
			var0.qe_fld = 0.0F;
			var0.na_fld = 0.0F;
			var0.ql_fld = 0.0F;
			var0.jx_fld = 0.0F;
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ch() {
		this.cg_fld = 1.0F;
		this.an_fld = 0.0F;
		this.to_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.bf_fld = 0.0F;
		this.mp_fld = 1.0F;
		this.nm_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.yo_fld = 0.0F;
		this.ga_fld = 1.0F;
		this.fs_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.na_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.jx_fld = 1.0F;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dm(float var1, float var2, float var3) {
		return this.qe_fld + (this.hj_fld * var3 + (this.cg_fld * var1 + var2 * this.bf_fld));
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luc;)V"
	)
	public static void jy(uy var0, uc var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cg_fld = var1.ah_fld;
		var0.an_fld = var1.aw_fld;
		var0.to_fld = var1.ay_fld;
		var0.jk_fld = 0.0F;
		var0.bf_fld = var1.ag_fld;
		var0.mp_fld = var1.ak_fld;
		var0.nm_fld = var1.al_fld;
		var0.xn_fld = 0.0F;
		var0.hj_fld = var1.af_fld;
		var0.yo_fld = var1.av_fld;
		var0.ga_fld = var1.ar_fld;
		var0.fs_fld = 0.0F;
		var0.qe_fld = var1.az_fld;
		var0.na_fld = var1.ae_fld;
		var0.ql_fld = var1.as_fld;
		var0.jx_fld = 1.0F;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)V"
	)
	public void cl(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.hj_fld * var3 + (this.bf_fld * var2 + var1 * this.cg_fld) + this.qe_fld;
		var4[1] = this.an_fld * var1 + var2 * this.mp_fld + var3 * this.yo_fld + this.na_fld;
		var4[2] = var1 * this.to_fld + this.nm_fld * var2 + var3 * this.ga_fld + this.ql_fld;
		if (var4.length > 3) {
			var4[3] = this.jk_fld * var1 + this.xn_fld * var2 + var3 * this.fs_fld + this.jx_fld;
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float do_(float var1, float var2, float var3) {
		return this.na_fld + (this.an_fld * var1 + var2 * this.mp_fld + var3 * this.yo_fld);
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] ds() {
		float[] var1 = new float[3];
		tu var2 = new tu(this.cg_fld, this.an_fld, this.to_fld);
		tu var3 = new tu(this.bf_fld, this.mp_fld, this.nm_fld);
		tu var4 = new tu(this.hj_fld, this.yo_fld, this.ga_fld);
		var1[0] = tu.ml(var2, (byte)-15);
		var1[1] = tu.ml(var3, (byte)-112);
		var1[2] = tu.ml(var4, (byte)-41);
		return var1;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(FFF)F"
	)
	public float dr(float var1, float var2, float var3) {
		return var1 * this.to_fld + this.nm_fld * var2 + this.ga_fld * var3 + this.ql_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[F"
	)
	float[] ae() {
		float[] var2 = new float[3];
		if (this.to_fld < 0.999 && this.to_fld > -0.999) {
			var2[1] = (float)(-Math.asin(this.to_fld));
			double var3 = Math.cos(var2[1]);
			var2[0] = (float)Math.atan2(this.nm_fld / var3, this.ga_fld / var3);
			var2[2] = (float)Math.atan2(this.an_fld / var3, this.cg_fld / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2(this.to_fld, 0.0);
			var2[2] = (float)Math.atan2(-this.yo_fld, this.mp_fld);
		}

		return var2;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] dk() {
		float[] var1 = new float[3];
		tu var2 = new tu(this.cg_fld, this.an_fld, this.to_fld);
		tu var3 = new tu(this.bf_fld, this.mp_fld, this.nm_fld);
		tu var4 = new tu(this.hj_fld, this.yo_fld, this.ga_fld);
		var1[0] = tu.ml(var2, (byte)-69);
		var1[1] = tu.ml(var3, (byte)-21);
		var1[2] = tu.ml(var4, (byte)-62);
		return var1;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Luy;)V"
	)
	public void cv(uy var1) {
		this.as(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)V"
	)
	public void au(uy var1, int var2) {
		float var3 = this.bf_fld * var1.jk_fld + (var1.jx_fld * this.jx_fld + this.xn_fld * var1.qe_fld) + this.ql_fld * var1.mp_fld;
		float var4 = var1.jx_fld * this.fs_fld + (var1.jx_fld * this.ga_fld + this.hj_fld * var1.jk_fld + var1.ql_fld * this.to_fld);
		float var5 = this.hj_fld * var1.na_fld + (this.nm_fld * var1.cg_fld + this.jx_fld * var1.mp_fld + this.jx_fld * var1.qe_fld);
		float var6 = var1.yo_fld * this.mp_fld + (this.mp_fld * var1.ga_fld + (var1.hj_fld * this.na_fld + this.an_fld * var1.ql_fld));
		float var7 = var1.jx_fld * this.fs_fld + (var1.jk_fld * this.mp_fld + (this.yo_fld * var1.nm_fld + this.an_fld * var1.bf_fld));
		float var8 = this.hj_fld * var1.nm_fld + var1.jk_fld * this.qe_fld + var1.yo_fld * this.nm_fld + var1.xn_fld * this.to_fld;
		float var9 = var1.qe_fld * this.fs_fld + this.fs_fld * var1.ql_fld + this.mp_fld * var1.qe_fld + this.yo_fld * var1.cg_fld;
		float var10 = this.an_fld * var1.xn_fld + (var1.yo_fld * this.cg_fld + var1.xn_fld * this.to_fld + this.an_fld * var1.xn_fld);
		float var11 = this.xn_fld * var1.mp_fld + (this.hj_fld * var1.xn_fld + (var1.an_fld * this.hj_fld + var1.an_fld * this.cg_fld));
		float var12 = var1.nm_fld * this.cg_fld + this.xn_fld * var1.ql_fld + this.na_fld * var1.bf_fld + this.hj_fld * var1.qe_fld;
		float var13 = this.ga_fld * var1.na_fld + (this.jk_fld * var1.nm_fld + this.mp_fld * var1.nm_fld) + var1.mp_fld * this.xn_fld;
		float var14 = var1.na_fld * this.an_fld + var1.hj_fld * this.an_fld + this.nm_fld * var1.jk_fld + this.an_fld * var1.mp_fld;
		float var15 = var1.ga_fld * this.yo_fld + (var1.yo_fld * this.hj_fld + (this.yo_fld * var1.nm_fld + this.xn_fld * var1.to_fld));
		float var16 = var1.jx_fld * this.mp_fld + var1.ql_fld * this.yo_fld + this.to_fld * var1.bf_fld + var1.jk_fld * this.fs_fld;
		float var17 = var1.na_fld * this.cg_fld + (var1.ql_fld * this.qe_fld + this.hj_fld * var1.na_fld + var1.fs_fld * this.xn_fld);
		float var18 = this.qe_fld * var1.jk_fld + var1.ql_fld * this.ga_fld + var1.an_fld * this.an_fld + this.cg_fld * var1.yo_fld;
		this.nm_fld = var3;
		this.cg_fld = var4;
		this.yo_fld = var5;
		this.ql_fld = var6;
		this.cg_fld = var7;
		this.xn_fld = var8;
		this.cg_fld = var9;
		this.to_fld = var10;
		this.cg_fld = var11;
		this.ql_fld = var12;
		this.hj_fld = var13;
		this.qe_fld = var14;
		this.an_fld = var15;
		this.jx_fld = var16;
		this.yo_fld = var17;
		this.cg_fld = var18;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)V"
	)
	public void aa(uc var1, int var2) {
		this.mp_fld = var1.av_fld;
		this.yo_fld = var1.ae_fld;
		this.jx_fld = var1.ae_fld;
		this.hj_fld = 0.0F;
		this.jx_fld = var1.av_fld;
		this.na_fld = var1.ak_fld;
		this.cg_fld = var1.af_fld;
		this.xn_fld = 0.0F;
		this.bf_fld = var1.aw_fld;
		this.bf_fld = var1.aw_fld;
		this.bf_fld = var1.ah_fld;
		this.nm_fld = 0.0F;
		this.to_fld = var1.ay_fld;
		this.cg_fld = var1.ay_fld;
		this.mp_fld = var1.aw_fld;
		this.yo_fld = 1.0F;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Ltu;"
	)
	public tu ao(float var1, float var2, float var3, int var4) {
		float var5 = 1.0F / (this.fs_fld + (var1 * this.jk_fld + var2 * this.hj_fld + this.na_fld * var3));
		return sh.ak(
			var5 * (this.cg_fld + (var3 * this.hj_fld + (this.hj_fld * var1 + var2 * this.hj_fld))),
			(var2 * this.jx_fld + var1 * this.hj_fld + var3 * this.an_fld + this.mp_fld) * var5,
			(this.nm_fld + (var3 * this.jk_fld + (this.fs_fld * var2 + this.to_fld * var1))) * var5
		);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F"
	)
	public float ap(float var1, float var2, float var3, int var4) {
		return this.xn_fld + (this.bf_fld * var1 + var2 * this.mp_fld + var3 * this.jk_fld);
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Luy;)Luy;"
	)
	public static uy or(uy var0) {
		synchronized (ag_fld) {
			if (av_fld == 0) {
				return new uy(var0);
			} else {
				uy var2 = ag_fld[--av_fld];
				var2.cv(var0);
				return var2;
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
				ag_fld[(av_fld += 916466747) * -1929312436 - 1] = this;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void az(int var1) {
		this.ga_fld = 0.0F;
		this.an_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.nm_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.xn_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.ql_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.ga_fld = 0.0F;
		this.an_fld = 0.0F;
		this.jk_fld = 0.0F;
		this.qe_fld = 0.0F;
		this.hj_fld = 0.0F;
		this.mp_fld = 0.0F;
	}

	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "(Luy;FFFI)Ltu;"
	)
	public static tu tp(uy var0, float var1, float var2, float var3, int var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			float var5 = 1.0F / (var0.jx_fld + (var1 * var0.jk_fld + var2 * var0.xn_fld + var0.fs_fld * var3));
			return sh.ak(
				var5 * (var0.qe_fld + (var3 * var0.hj_fld + (var0.cg_fld * var1 + var2 * var0.bf_fld))),
				(var2 * var0.mp_fld + var1 * var0.an_fld + var3 * var0.yo_fld + var0.na_fld) * var5,
				(var0.ql_fld + (var3 * var0.ga_fld + (var0.nm_fld * var2 + var0.to_fld * var1))) * var5
			);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Luc;)V"
	)
	public void cz(uc var1) {
		this.ga_fld = var1.ay_fld;
		this.fs_fld = var1.ak_fld;
		this.yo_fld = var1.af_fld;
		this.nm_fld = 0.0F;
		this.to_fld = var1.as_fld;
		this.an_fld = var1.ah_fld;
		this.hj_fld = var1.ar_fld;
		this.jk_fld = 0.0F;
		this.hj_fld = var1.ar_fld;
		this.ql_fld = var1.as_fld;
		this.to_fld = var1.ah_fld;
		this.xn_fld = 0.0F;
		this.bf_fld = var1.ak_fld;
		this.xn_fld = var1.aw_fld;
		this.hj_fld = var1.as_fld;
		this.jx_fld = 1.0F;
	}
}
