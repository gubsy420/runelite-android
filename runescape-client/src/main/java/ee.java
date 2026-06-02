import net.runelite.api.IntProjection;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements({"IntProjection"})
public class ee extends fw implements IntProjection {
	@ObfuscatedName("yx")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	public static ee yx_fld;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float wk_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ah_fld;
	@ObfuscatedGetter(
		intValue = -1512941391
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float hz_fld;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float if_fld;
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] kw_Arrfloat = new float[3];
	@ObfuscatedGetter(
		intValue = 93778481
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -318643991
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 758407385
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ht_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float dc_fld;
	@ObfuscatedGetter(
		intValue = -1506382237
	)
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bo_fld;
	@ObfuscatedGetter(
		intValue = 1440256733
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ay_fld;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float jz_fld;
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float tv_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float as_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float aw_fld;
	@ObfuscatedName("zv")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float zv_fld;
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float kw_float;
	@ObfuscatedGetter(
		intValue = -1597762623
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lyc;"
	)
	static yc cz_fld;
	@ObfuscatedGetter(
		intValue = 62106817
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;

	ee(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = fc.ay_fld[var4];
		this.aw_fld = fc.as_fld[var4];
		this.ay_fld = fc.ay_fld[var5];
		this.as_fld = fc.as_fld[var5];
		this.ar_fld = var6;
		this.af_fld = var7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	@Override
	void ak(em var1, int var2, int var3, int var4, int var5, long var6) {
		try {
			if ((client.jb_fld & 17) == 1) {
				client.fa_fld.draw(this, null, var1, var2, var3, var4 - var1.getAnimationHeightOffset(), var5, var6);
			} else {
				var1.dz(var2, this.av_fld, this.ae_fld, var3, var4, var5, this.ak_fld, this.ag_fld, this.az_fld, var6, this.ar_fld, this.af_fld, false);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lxh;)I"
	)
	public static int ak(CharSequence var0, CharSequence var1, xh var2) {
		int var4 = var0.length();
		int var5 = var1.length();
		int var6 = 0;
		int var7 = 0;
		char var8 = 0;
		char var9 = 0;

		while (var6 - var8 < var4 || var7 - var9 < var5) {
			if (var6 - var8 >= var4) {
				return -1;
			}

			if (var7 - var9 >= var5) {
				return 1;
			}

			char var10;
			if (0 != var8) {
				var10 = var8;
				boolean var17 = false;
			} else {
				var10 = var0.charAt(var6++);
			}

			char var11;
			if (var9 != 0) {
				var11 = var9;
				boolean var18 = false;
			} else {
				var11 = var1.charAt(var7++);
			}

			var8 = ao.az(var10);
			var9 = ao.az(var11);
			var10 = cp.ag(var10, var2);
			var11 = cp.ag(var11, var2);
			if (var10 != var11 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
				var10 = Character.toLowerCase(var10);
				var11 = Character.toLowerCase(var11);
				if (var11 != var10) {
					return me.av(var10, var2) - me.av(var11, var2);
				}
			}
		}

		int var21 = Math.min(var4, var5);

		for (int var24 = 0; var24 < var21; var24++) {
			if (var2 == xh.az_fld) {
				var6 = var4 - 1 - var24;
				var7 = var5 - 1 - var24;
			} else {
				var7 = var24;
				var6 = var24;
			}

			char var12 = var0.charAt(var6);
			char var13 = var1.charAt(var7);
			if (var13 != var12 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
				var12 = Character.toLowerCase(var12);
				var13 = Character.toLowerCase(var13);
				if (var13 != var12) {
					return me.av(var12, var2) - me.av(var13, var2);
				}
			}
		}

		int var25 = var4 - var5;
		if (var25 != 0) {
			return var25;
		} else {
			for (int var27 = 0; var27 < var21; var27++) {
				char var29 = var0.charAt(var27);
				char var14 = var1.charAt(var27);
				if (var29 != var14) {
					return me.av(var29, var2) - me.av(var14, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;IIB)V"
	)
	@Override
	void az(ev var1, fl var2, int var3, int var4, byte var5) {
		if (1 != fc.ar_fld.aa_fld) {
			int var6 = var2.as_fld.length;

			for (int var7 = 0; var7 < var6; var7++) {
				float var8 = var2.as_fld[var7] - this.ak_fld;
				float var9 = var2.ar_fld[var7] - this.ag_fld;
				float var10 = var2.af_fld[var7] - this.az_fld;
				float var11 = var10 * this.ay_fld + var8 * this.as_fld;
				var10 = this.as_fld * var10 - var8 * this.ay_fld;
				var11 = var9 * this.aw_fld - var10 * this.ah_fld;
				var10 = this.ah_fld * var9 + this.aw_fld * var10;
				if (var10 < 50.0F) {
					if (var5 >= 127) {
						return;
					}

					return;
				}

				if (null != var2.aq_fld) {
					fl.ah_fld[var7] = (int)var11;
					fl.aw_fld[var7] = (int)var11;
					fl.ay_fld[var7] = (int)var10;
				}

				fl.az_fld[var7] = fc.aw() + var11 * fc.au() / var10;
				fl.av_fld[var7] = fc.ay() + var11 * fc.au() / var10;
				fl.ae_fld[var7] = ap.av(var10);
			}

			lg.fl(this, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("getYawSin")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float getYawSin() {
		return this.ay_fld;
	}

	@ObfuscatedName("project")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)[F"
	)
	@Override
	public float[] project(float var1, float var2, float var3, float[] var4) {
		var1 -= this.tv_fld;
		var2 -= this.jz_fld;
		var3 -= this.ht_fld;
		float var5 = var1 * this.kw_float + var3 * this.wk_fld;
		float var6 = var3 * this.kw_float - var1 * this.wk_fld;
		float var7 = var2 * this.hz_fld - var6 * this.dc_fld;
		float var8 = var6 * this.hz_fld + var2 * this.dc_fld;
		var4[0] = var5;
		var4[1] = var7;
		var4[2] = var8;
		return var4;
	}

	@ObfuscatedName("getPitchSin")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float getPitchSin() {
		return this.ah_fld;
	}

	@ObfuscatedName("getYawCos")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float getYawCos() {
		return this.as_fld;
	}

	@ObfuscatedName("getPitchCos")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float getPitchCos() {
		return this.aw_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	@Override
	void av(em var1, int var2, int var3, int var4, int var5, long var6) {
		try {
			var1.lp(var2, this.av_fld, this.ae_fld, var3, var4, var5, this.ak_fld, this.ag_fld, this.az_fld, var6, this.ar_fld, this.af_fld, false);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("getCameraX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCameraX() {
		return this.ak_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	@Override
	void aw(ev var1, fl var2, int var3, int var4) {
		if (1 != fc.ar_fld.aa_fld) {
			int var5 = var2.as_fld.length;

			for (int var6 = 0; var6 < var5; var6++) {
				float var7 = var2.as_fld[var6] - this.ak_fld;
				float var8 = var2.ar_fld[var6] - this.ag_fld;
				float var9 = var2.af_fld[var6] - this.az_fld;
				float var10 = var9 * this.ay_fld + var7 * this.as_fld;
				var9 = this.as_fld * var9 - var7 * this.ay_fld;
				var10 = var8 * this.aw_fld - var9 * this.ah_fld;
				var9 = this.ah_fld * var8 + this.aw_fld * var9;
				if (var9 < 50.0F) {
					return;
				}

				if (null != var2.aq_fld) {
					fl.ah_fld[var6] = (int)var10;
					fl.aw_fld[var6] = (int)var10;
					fl.ay_fld[var6] = (int)var9;
				}

				fl.az_fld[var6] = fc.aw() + var10 * fc.au() / var9;
				fl.av_fld[var6] = fc.ay() + var10 * fc.au() / var9;
				fl.ae_fld[var6] = ap.av(var9);
			}

			lg.fl(this, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	public static void op(ry var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			synchronized (var0) {
				var0.ag_fld.clear();
				var0.az_fld.clear();
				if (var0.ak()) {
					var0.av_fld.clear();
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;III)V"
	)
	@Override
	void ah(ev var1, fa var2, int var3, int var4, int var5) {
		if (fc.ar_fld.aa_fld != 1) {
			float var6;
			float var7 = var6 = (var4 << 7) - this.ak_fld;
			float var8;
			float var9 = var8 = (var5 << 7) - this.az_fld;
			float var10;
			float var11 = var10 = 128.0F + var7;
			float var12;
			float var13 = var12 = var9 + 128.0F;
			float var14 = var1.cs_fld[var3][var4][var5] - this.ag_fld;
			float var15 = var1.cs_fld[var3][1 + var4][var5] - this.ag_fld;
			float var16 = var1.cs_fld[var3][var4 + 1][var5 + 1] - this.ag_fld;
			float var17 = var1.cs_fld[var3][var4][1 + var5] - this.ag_fld;
			float var18 = var7 * this.as_fld + this.ay_fld * var9;
			var9 = this.as_fld * var9 - this.ay_fld * var7;
			var18 = var14 * this.aw_fld - this.ah_fld * var9;
			var9 = var9 * this.aw_fld + this.ah_fld * var14;
			if (!(var9 < 50.0F)) {
				var18 = this.ay_fld * var8 + this.as_fld * var11;
				var8 = var8 * this.as_fld - this.ay_fld * var11;
				var18 = var15 * this.aw_fld - this.ah_fld * var8;
				var8 = var15 * this.ah_fld + this.aw_fld * var8;
				if (!(var8 < 50.0F)) {
					var18 = var10 * this.as_fld + this.ay_fld * var13;
					var13 = var13 * this.as_fld - var10 * this.ay_fld;
					var18 = this.aw_fld * var16 - var13 * this.ah_fld;
					var13 = this.aw_fld * var13 + this.ah_fld * var16;
					if (!(var13 < 50.0F)) {
						var18 = var12 * this.ay_fld + this.as_fld * var6;
						var12 = var12 * this.as_fld - var6 * this.ay_fld;
						var18 = this.aw_fld * var17 - this.ah_fld * var12;
						var12 = this.aw_fld * var12 + this.ah_fld * var17;
						if (!(var12 < 50.0F)) {
							this.al(var1, var2, var4, var5, var18, var18, var18, var18, var18, var18, var18, var18, var9, var8, var13, var12, -1482843702);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("getCameraZ")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCameraZ() {
		return this.az_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	@Override
	void ae(em var1, int var2, int var3, int var4, int var5, long var6) {
		try {
			var1.lp(
				var2,
				this.av_fld,
				this.ae_fld * -1823321502,
				var3,
				var4,
				var5,
				this.ak_fld,
				this.ag_fld * -1658993982,
				this.az_fld * -692103452,
				var6,
				this.ar_fld,
				this.af_fld * -1143188810,
				false
			);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	@Override
	void ay(ev var1, fl var2, int var3, int var4) {
		if (1 != fc.ar_fld.aa_fld) {
			int var5 = var2.as_fld.length;

			for (int var6 = 0; var6 < var5; var6++) {
				float var7 = var2.as_fld[var6] - this.ak_fld;
				float var8 = var2.ar_fld[var6] - this.ag_fld;
				float var9 = var2.af_fld[var6] - this.az_fld;
				float var10 = var9 * this.ay_fld + var7 * this.as_fld;
				var9 = this.as_fld * var9 - var7 * this.ay_fld;
				var10 = var8 * this.aw_fld - var9 * this.ah_fld;
				var9 = this.ah_fld * var8 + this.aw_fld * var9;
				if (var9 < 50.0F) {
					return;
				}

				if (null != var2.aq_fld) {
					fl.ah_fld[var6] = (int)var10;
					fl.aw_fld[var6] = (int)var10;
					fl.ay_fld[var6] = (int)var9;
				}

				fl.az_fld[var6] = fc.aw() + var10 * fc.au() / var9;
				fl.av_fld[var6] = fc.ay() + var10 * fc.au() / var9;
				fl.ae_fld[var6] = ap.av(var9);
			}

			lg.fl(this, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIILuy;III)Z"
	)
	static final boolean aq(fn var0, int var1, int var2, int var3, int var4, uy var5, int var6, int var7, int var8) {
		if (!rt.af()) {
			return false;
		} else {
			mj.an(var5, var6, var7, var8);
			return et.am(var0, var1, var2 - gz.bj_fld, var3 - wk.bf_fld, var4 - bv.by_fld);
		}
	}

	@ObfuscatedName("getCameraY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCameraY() {
		return this.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;IIII)V"
	)
	@Override
	void ag(ev var1, fa var2, int var3, int var4, int var5, int var6) {
		if (fc.ar_fld.aa_fld == 1) {
			if (var6 != 871974497) {
				;
			}
		} else {
			float var7;
			float var8 = var7 = (var4 << 7) - this.ak_fld;
			float var9;
			float var10 = var9 = (var5 << 7) - this.az_fld;
			float var11;
			float var12 = var11 = 128.0F + var8;
			float var13;
			float var14 = var13 = var10 + 128.0F;
			float var15 = var1.cs_fld[var3][var4][var5] - this.ag_fld;
			float var16 = var1.cs_fld[var3][1 + var4][var5] - this.ag_fld;
			float var17 = var1.cs_fld[var3][var4 + 1][var5 + 1] - this.ag_fld;
			float var18 = var1.cs_fld[var3][var4][1 + var5] - this.ag_fld;
			float var19 = var8 * this.as_fld + this.ay_fld * var10;
			var10 = this.as_fld * var10 - this.ay_fld * var8;
			var19 = var15 * this.aw_fld - this.ah_fld * var10;
			var10 = var10 * this.aw_fld + this.ah_fld * var15;
			if (!(var10 < 50.0F)) {
				var19 = this.ay_fld * var9 + this.as_fld * var12;
				var9 = var9 * this.as_fld - this.ay_fld * var12;
				var19 = var16 * this.aw_fld - this.ah_fld * var9;
				var9 = var16 * this.ah_fld + this.aw_fld * var9;
				if (!(var9 < 50.0F)) {
					var19 = var11 * this.as_fld + this.ay_fld * var14;
					var14 = var14 * this.as_fld - var11 * this.ay_fld;
					var19 = this.aw_fld * var17 - var14 * this.ah_fld;
					var14 = this.aw_fld * var14 + this.ah_fld * var17;
					if (var14 < 50.0F) {
						if (var6 != 871974497) {
							;
						}
					} else {
						var19 = var13 * this.ay_fld + this.as_fld * var7;
						var13 = var13 * this.as_fld - var7 * this.ay_fld;
						var19 = this.aw_fld * var18 - this.ah_fld * var13;
						var13 = this.aw_fld * var13 + this.ah_fld * var18;
						if (!(var13 < 50.0F)) {
							this.al(var1, var2, var4, var5, var19, var19, var19, var19, var19, var19, var19, var19, var10, var9, var14, var13, -1547734757);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("project")
	@ObfuscatedSignature(
		descriptor = "(FFF)[F"
	)
	@Override
	public float[] project(float var1, float var2, float var3) {
		return this.project(var1, var2, var3, this.kw_Arrfloat);
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;III)V"
	)
	@Override
	public void yu(ev var1, fa var2, int var3, int var4, int var5) {
		if (fc.ar_fld.aa_fld != 1) {
			int var6 = var4 + var1.jh_fld;
			int var7 = var5 + var1.jh_fld;
			float var8;
			float var9 = var8 = (var4 << 7) - this.ak_fld;
			float var10;
			float var11 = var10 = (var5 << 7) - this.az_fld;
			float var12;
			float var13 = var12 = var9 + 128.0F;
			float var14;
			float var15 = var14 = var11 + 128.0F;
			float var16 = var1.cs_fld[var3][var6][var7] - this.ag_fld;
			float var17 = var1.cs_fld[var3][var6 + 1][var7] - this.ag_fld;
			float var18 = var1.cs_fld[var3][var6 + 1][var7 + 1] - this.ag_fld;
			float var19 = var1.cs_fld[var3][var6][var7 + 1] - this.ag_fld;
			float var20 = var9 * this.as_fld + var11 * this.ay_fld;
			var11 = var11 * this.as_fld - var9 * this.ay_fld;
			var20 = var16 * this.aw_fld - var11 * this.ah_fld;
			var11 = var11 * this.aw_fld + var16 * this.ah_fld;
			if (var11 >= 50.0F) {
				var20 = var10 * this.ay_fld + var13 * this.as_fld;
				var10 = var10 * this.as_fld - var13 * this.ay_fld;
				var20 = var17 * this.aw_fld - var10 * this.ah_fld;
				var10 = var10 * this.aw_fld + var17 * this.ah_fld;
				if (var10 >= 50.0F) {
					var20 = var12 * this.as_fld + var15 * this.ay_fld;
					var15 = var15 * this.as_fld - var12 * this.ay_fld;
					var20 = var18 * this.aw_fld - var15 * this.ah_fld;
					var15 = var18 * this.ah_fld + var15 * this.aw_fld;
					if (var15 >= 50.0F) {
						var20 = var8 * this.as_fld + var14 * this.ay_fld;
						var14 = var14 * this.as_fld - var8 * this.ay_fld;
						var20 = var19 * this.aw_fld - var14 * this.ah_fld;
						var14 = var19 * this.ah_fld + var14 * this.aw_fld;
						if (var14 >= 50.0F) {
							if (client.fa_fld != null) {
								client.fa_fld.drawScenePaint(var1, var2, var3, var4, var5);
							}

							this.zl(var1, var2, var4, var5, var20, var20, var20, var20, var20, var20, var20, var20, var11, var10, var15, var14);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	@Override
	public void qd(ev var1, fl var2, int var3, int var4) {
		this.az(var1, var2, var3, var4, (byte)-120);
	}
}
