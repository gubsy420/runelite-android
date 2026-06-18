import java.io.EOFException;
import net.runelite.api.FloatProjection;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements({"FloatProjection"})
public class ey extends fw implements FloatProjection {
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bp_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] ag_fld = new float[3];
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ad_fld;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1121909987
	)
	static int gn_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public static float[] kx_fld = new float[16];
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	uy ak_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -6634889479316900091L
	)
	long az_fld = 0L;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lct;"
	)
	static ct ay() {
		return ct.aw_fld < ct.ah_fld ? yd.ae_fld[(ct.aw_fld += 531181239) * 427101959 - 1] : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void as(long var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	@Override
	void ak(em var1, int var2, int var3, int var4, int var5, long var6) {
		try {
			if (client.ly_fld == 0) {
				int var8 = ej.cd_fld;
				var6 = this.wu(var6);
				var1.sd(var2, this.ak_fld, var3, var4, var5, var6);
				if (var8 != ej.cd_fld) {
					this.du();
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;IIII)V"
	)
	@Override
	void ag(ev var1, fa var2, int var3, int var4, int var5, int var6) {
		if (fc.ar_fld.al_fld != 1) {
			float var7;
			float var8 = var7 = var4 << 7;
			float var9;
			float var10 = var9 = var5 << 7;
			float var11;
			float var12 = var11 = 128.0F + var8;
			float var13;
			float var14 = var13 = var10 + 128.0F;
			float var15 = var1.cv_fld[var3][var4][var5];
			float var16 = var1.cv_fld[var3][var4 + 1][var5];
			float var17 = var1.cv_fld[var3][var4 + 1][var5 + 1];
			float var18 = var1.cv_fld[var3][var4][1 + var5];
			this.ak_fld.ad(var8, var15, var10, this.ag_fld);
			var8 = this.ag_fld[0];
			var15 = this.ag_fld[1];
			var10 = this.ag_fld[2];
			if (!(var10 < 50.0F)) {
				this.ak_fld.ad(var12, var16, var9, this.ag_fld);
				var12 = this.ag_fld[0];
				var16 = this.ag_fld[1];
				var9 = this.ag_fld[2];
				if (!(var9 < 50.0F)) {
					this.ak_fld.ad(var11, var17, var14, this.ag_fld);
					var11 = this.ag_fld[0];
					var17 = this.ag_fld[1];
					var14 = this.ag_fld[2];
					if (!(var14 < 50.0F)) {
						this.ak_fld.ad(var7, var18, var13, this.ag_fld);
						var7 = this.ag_fld[0];
						var18 = this.ag_fld[1];
						var13 = this.ag_fld[2];
						if (!(var13 < 50.0F)) {
							fw.us(this, var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var18, var10, var9, var14, var13);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lal;)Z"
	)
	public static boolean ah(al var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;IIB)V"
	)
	@Override
	void az(ev var1, fl var2, int var3, int var4, byte var5) {
		if (fc.ar_fld.al_fld != 1) {
			int var6 = var2.as_fld.length;

			for (int var7 = 0; var7 < var6; var7++) {
				if (var5 >= 127) {
					return;
				}

				float var8 = var2.as_fld[var7];
				float var9 = var2.ar_fld[var7];
				float var10 = var2.af_fld[var7];
				this.ak_fld.ad(var8, var9, var10, this.ag_fld);
				var8 = this.ag_fld[0];
				var9 = this.ag_fld[1];
				var10 = this.ag_fld[2];
				if (var10 < 50.0F) {
					return;
				}

				if (null != var2.aq_fld) {
					fl.ah_fld[var7] = (int)var8;
					fl.aw_fld[var7] = (int)var9;
					fl.ay_fld[var7] = (int)var10;
				}

				fl.az_fld[var7] = fc.aw() + var8 * fc.au() / var10;
				fl.av_fld[var7] = fc.ay() + var9 * fc.au() / var10;
				fl.ae_fld[var7] = ap.av(var10);
			}

			this.au(var1, var2, var3, var4, 883851757);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	@Override
	void av(em var1, int var2, int var3, int var4, int var5, long var6) {
		try {
			int var8 = ip.ak();
			if (this.az_fld != 0L) {
				boolean var9 = jv.az(var6);
				boolean var10 = !var9 || jv.az(this.az_fld);
				if (var10) {
					var6 = cc.aw(this.az_fld);
				}
			}

			var1.mr(var2, this.ak_fld, var3, var4, var5, var6);
			if (this.az_fld != 0L && var8 != ip.ak()) {
				this.az_fld = dt.ay(0, 0, 0, 5, !jv.az(this.az_fld), 0, 0);
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("project")
	@ObfuscatedSignature(
		descriptor = "(FFF)[F"
	)
	@Override
	public float[] project(float var1, float var2, float var3) {
		return this.project(var1, var2, var3, this.ag_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	@Override
	void aw(ev var1, fl var2, int var3, int var4) {
		if (fc.ar_fld.al_fld != 1) {
			int var5 = var2.as_fld.length;

			for (int var6 = 0; var6 < var5; var6++) {
				float var7 = var2.as_fld[var6];
				float var8 = var2.ar_fld[var6];
				float var9 = var2.af_fld[var6];
				this.ak_fld.ad(var7, var8, var9, this.ag_fld);
				var7 = this.ag_fld[0];
				var8 = this.ag_fld[1];
				var9 = this.ag_fld[2];
				if (var9 < 50.0F) {
					return;
				}

				if (null != var2.aq_fld) {
					fl.ah_fld[var6] = (int)var7;
					fl.aw_fld[var6] = (int)var8;
					fl.ay_fld[var6] = (int)var9;
				}

				fl.az_fld[var6] = fc.aw() + var7 * fc.au() / var9;
				fl.av_fld[var6] = fc.ay() + var8 * fc.au() / var9;
				fl.ae_fld[var6] = ap.av(var9);
			}

			this.au(var1, var2, var3, var4, -391465408);
		}
	}

	ey(uy var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("project")
	@ObfuscatedSignature(
		descriptor = "(FFF[F)[F"
	)
	@Override
	public float[] project(float var1, float var2, float var3, float[] var4) {
		this.ak_fld.po(var1, var2, var3, var4);
		return var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void af(long var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;III)V"
	)
	@Override
	void ah(ev var1, fa var2, int var3, int var4, int var5) {
		if (fc.ar_fld.al_fld != 1) {
			float var6;
			float var7 = var6 = var4 << 7;
			float var8;
			float var9 = var8 = var5 << 7;
			float var10;
			float var11 = var10 = 128.0F + var7;
			float var12;
			float var13 = var12 = var9 + 128.0F;
			float var14 = var1.cv_fld[var3][var4][var5];
			float var15 = var1.cv_fld[var3][var4 + 1][var5];
			float var16 = var1.cv_fld[var3][var4 + 1][var5 + 1];
			float var17 = var1.cv_fld[var3][var4][1 + var5];
			this.ak_fld.ad(var7, var14, var9, this.ag_fld);
			var7 = this.ag_fld[0];
			var14 = this.ag_fld[1];
			var9 = this.ag_fld[2];
			if (!(var9 < 50.0F)) {
				this.ak_fld.ad(var11, var15, var8, this.ag_fld);
				var11 = this.ag_fld[0];
				var15 = this.ag_fld[1];
				var8 = this.ag_fld[2];
				if (!(var8 < 50.0F)) {
					this.ak_fld.ad(var10, var16, var13, this.ag_fld);
					var10 = this.ag_fld[0];
					var16 = this.ag_fld[1];
					var13 = this.ag_fld[2];
					if (!(var13 < 50.0F)) {
						this.ak_fld.ad(var6, var17, var12, this.ag_fld);
						var6 = this.ag_fld[0];
						var17 = this.ag_fld[1];
						var12 = this.ag_fld[2];
						if (!(var12 < 50.0F)) {
							fw.us(this, var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lem;IIIIJ)V"
	)
	@Override
	void ae(em var1, int var2, int var3, int var4, int var5, long var6) {
		try {
			int var8 = ip.ak();
			if (this.az_fld != 0L) {
				boolean var9 = jv.az(var6);
				boolean var10 = !var9 || jv.az(this.az_fld);
				if (var10) {
					var6 = cc.aw(this.az_fld);
				}
			}

			var1.mr(var2, this.ak_fld, var3, var4, var5, var6);
			if (this.az_fld != 0L && var8 != ip.ak()) {
				this.az_fld = dt.ay(0, 0, 0, 5, !jv.az(this.az_fld), 0, 0);
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void du() {
		if (this.az_fld != 0L) {
			this.az_fld = this.az_fld & 524288L | 327680L;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	public static boolean au(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "(J)J"
	)
	public long wu(long var1) {
		return this.az_fld == 0L || pc(var1) && !pc(this.az_fld) ? var1 : this.az_fld & -524289L;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	@Override
	void ay(ev var1, fl var2, int var3, int var4) {
		if (fc.ar_fld.al_fld != 1) {
			int var5 = var2.as_fld.length;

			for (int var6 = 0; var6 < var5; var6++) {
				float var7 = var2.as_fld[var6];
				float var8 = var2.ar_fld[var6];
				float var9 = var2.af_fld[var6];
				this.ak_fld.ad(var7, var8, var9, this.ag_fld);
				var7 = this.ag_fld[0];
				var8 = this.ag_fld[1];
				var9 = this.ag_fld[2];
				if (var9 < 50.0F) {
					return;
				}

				if (null != var2.aq_fld) {
					fl.ah_fld[var6] = (int)var7;
					fl.aw_fld[var6] = (int)var8;
					fl.ay_fld[var6] = (int)var9;
				}

				fl.az_fld[var6] = fc.aw() + var7 * fc.au() / var9;
				fl.av_fld[var6] = fc.ay() + var8 * fc.au() / var9;
				fl.ae_fld[var6] = ap.av(var9);
			}

			this.au(var1, var2, var3, var4, 699146480);
		}
	}

	@ObfuscatedName("getProjection")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	@Export("getProjection")
	@Override
	public float[] getProjection() {
		this.ak_fld.an(kx_fld);
		return kx_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bk(int var0, ba var1, boolean var2) throws EOFException {
		try {
			if (var0 == 3300) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.dv_fld;
				return 1;
			} else if (3301 == var0) {
				gz.ax_fld -= 2;
				int var25 = bp.au_fld[gz.ax_fld];
				int var33 = bp.au_fld[1 + gz.ax_fld];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = av.ak(var25, var33);
				return 1;
			} else if (var0 == 3302) {
				gz.ax_fld -= 2;
				int var24 = bp.au_fld[gz.ax_fld];
				int var32 = bp.au_fld[gz.ax_fld + 1];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gx.ag(var24, var32);
				return 1;
			} else if (3303 == var0) {
				gz.ax_fld -= 2;
				int var23 = bp.au_fld[gz.ax_fld];
				int var31 = bp.au_fld[gz.ax_fld + 1];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.az(var23, var31);
				return 1;
			} else if (3304 == var0) {
				int var22 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lg.ak(var22, 1845206717).ae_fld * 508058309;
				return 1;
			} else if (var0 == 3305) {
				int var21 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.er_fld[var21];
				return 1;
			} else if (var0 == 3306) {
				int var20 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.en_fld[var20];
				return 1;
			} else if (var0 == 3307) {
				int var19 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.eg_fld[var19];
				return 1;
			} else if (var0 != 3308) {
				if (var0 == 3309) {
					int var18 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.az(var18);
					return 1;
				} else if (var0 == 3310) {
					int var17 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.ag(var17);
					return 1;
				} else if (3311 == var0) {
					int var16 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.av(var16);
					return 1;
				} else if (var0 == 3312) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ct_fld ? 1 : 0;
					return 1;
				} else if (3313 == var0) {
					gz.ax_fld -= 2;
					int var15 = 32768 + bp.au_fld[gz.ax_fld];
					int var30 = bp.au_fld[1 + gz.ax_fld];
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = av.ak(var15, var30);
					return 1;
				} else if (var0 == 3314) {
					gz.ax_fld -= 2;
					int var14 = 32768 + bp.au_fld[gz.ax_fld];
					int var29 = bp.au_fld[1 + gz.ax_fld];
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gx.ag(var14, var29);
					return 1;
				} else if (var0 == 3315) {
					gz.ax_fld -= 2;
					int var13 = 32768 + bp.au_fld[gz.ax_fld];
					int var28 = bp.au_fld[gz.ax_fld + 1];
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.az(var13, var28);
					return 1;
				} else if (var0 == 3316) {
					if (client.jl_fld >= 2) {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.jl_fld;
					} else {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					}

					return 1;
				} else if (3317 == var0) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.hb_fld;
					return 1;
				} else if (3318 == var0) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ch_fld;
					return 1;
				} else if (var0 == 3321) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ji_fld / 100;
					return 1;
				} else if (var0 == 3322) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.jr_fld;
					return 1;
				} else if (3323 == var0) {
					if (client.ko_fld) {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					} else {
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					}

					return 1;
				} else if (3324 == var0) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gt_fld;
					return 1;
				} else if (3325 == var0) {
					gz.ax_fld -= 4;
					int var12 = bp.au_fld[gz.ax_fld];
					int var27 = bp.au_fld[gz.ax_fld + 1];
					int var34 = bp.au_fld[gz.ax_fld + 2];
					int var35 = bp.au_fld[3 + gz.ax_fld];
					int var8 = kj.ak(var34, var27, var35);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12 + var8;
					return 1;
				} else if (var0 == 3326) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gl_fld;
					return 1;
				} else if (3327 == var0) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.hr_fld;
					return 1;
				} else if (var0 == 3331) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ji_fld;
					return 1;
				} else if (var0 == 3332) {
					int var11 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ef_fld[var11];
					return 1;
				} else if (3333 == var0) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.eb_fld;
					return 1;
				} else if (3334 == var0) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.hf_fld;
					return 1;
				} else if (3339 == var0) {
					int var10 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
					if (var10 == -1) {
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
					} else {
						oy var26 = hh.ag(var10);
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var26 == null ? "" : var26.at_fld;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				rx var4 = on.eq();
				if (null != var4 && var4.aw(-1066288811)) {
					int var5 = var4.al(-665177991);
					int var6 = var4.ar(-2118589343);
					int var7 = var4.af((byte)26);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.ak(var5, var6, var7);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				}

				return 1;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfa;III)V"
	)
	@Override
	public void em(ev var1, fa var2, int var3, int var4, int var5) {
		this.ag(var1, var2, var3, var4, var5, -882138923);
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(J)Z"
	)
	public static boolean pc(long var0) {
		return var0 != 0L && (var0 >>> 19 & 1L) == 0L;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Lev;Lfl;II)V"
	)
	@Override
	public void et(ev var1, fl var2, int var3, int var4) {
		this.az(var1, var2, var3, var4, (byte)-120);
	}
}
