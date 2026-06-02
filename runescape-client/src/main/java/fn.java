import java.awt.Shape;
import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.model.Jarvis;

@ObfuscatedName("fn")
@Implements({"Model"})
public class fn extends em implements Model {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bi_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ca_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] cc_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bn_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ax_fld = new int[6500];
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	static boolean[] as_fld = new boolean[6500];
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	static boolean[] aw_fld = new boolean[6500];
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ba_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] ar_fld = new float[6500];
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] af_fld = new float[6500];
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ck_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] au_fld = new int[6500];
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cz_fld = 0;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] an_fld = new int[6500];
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aa_fld = new int[6500];
	@ObfuscatedName("yk")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] yk_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	static char[] ai_fld = new char[6000];
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[[C"
	)
	static char[][] aq_fld = new char[6000][512];
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] am_fld = new int[12];
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] ad_fld = new int[12][2500];
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ao_fld = new int[2500];
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] cq_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ap_fld = new int[12];
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int pn_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean at_fld = true;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ac_fld = fc.ah_fld;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] rc_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aj_fld = fc.aw_fld;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "S"
	)
	short cl_fld;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ib_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] bd_fld = fc.ae_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] bz_fld = new float[3];
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static fn br_fld = new fn();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static fn bs_fld = new fn();
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cp_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	static uy bk_fld = new uy();
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] dj_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	static uy bj_fld = new uy();
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	static uy bf_fld = new uy();
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] bx_fld = new int[10];
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] bl_fld = new int[10];
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] cy_fld;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int co_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bp_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bv_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] by_fld = new int[10];
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bc_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bu_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] bm_fld = fc.az_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int bw_fld = 0;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] qo_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] bo_fld = new float[10];
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	static boolean[] ay_fld = new boolean[6500];
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bg_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bb_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] cd_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	static byte[] bh_fld = new byte[1];
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bq_fld;
	// $VF: synthetic field
	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean zi_fld = !fn.class.desiredAssertionStatus();
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] cv_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] cg_fld;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int oq_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] cf_fld;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	public float[] vr_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte cs_fld = 0;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cb_fld = 0;
	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] tg_fld;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ce_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] cn_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	static byte[] be_fld = new byte[1];
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] cx_fld;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean cw_fld = false;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	public short[] el_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] cr_fld;
	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	public fn lf_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	static float[] al_fld = new float[6500];
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cm_fld;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] cu_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ci_fld;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	fm cj_fld;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	fy ch_fld = null;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	fk ct_fld = fk.ak_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ab_fld = new int[2500];

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Lfe;ILfe;III)V"
	)
	public void nr(rl21 var1, fe var2, int var3, fe var4, int var5, int var6, int var7) {
		if (this.cu_fld != null && var3 != -1) {
			eq var8 = var2.ak_fld[var3];
			ea var9 = var8.ae_fld;
			eq var10 = null;
			if (var4 != null) {
				var10 = var4.ak_fld[var5];
				if (var10.ae_fld != var9) {
					var10 = null;
				}
			}

			var1.qc_fld = var1.ct_fld = var1.dx_fld = 0.0F;
			this.hn(var1, var9, var8, var10, var6 + (float)mt.rg_fld, var7);
			this.bl();
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void fn(boolean var1) {
		try {
			for (char var2 = 0; var2 < this.bw_fld; var2++) {
				if (!as_fld[var2]) {
					int var3 = (au_fld[this.ba_fld[var2]] + au_fld[this.bq_fld[var2]] + au_fld[this.bg_fld[var2]]) / 3 + this.cm_fld;
					char[] var10000 = aq_fld[var3];
					ai_fld[var3]++;
					var10000[ai_fld[var3]] = var2;
				}
			}

			if (this.cx_fld != null && var1) {
				this.bq();
			} else {
				for (int var8 = this.co_fld - 1; var8 >= 0; var8--) {
					char var9 = ai_fld[var8];
					if (var9 > 0) {
						char[] var4 = aq_fld[var8];

						for (int var5 = 0; var5 < var9; var5++) {
							zp(this, var4[var5]);
						}
					}
				}
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("getOverrideAmount")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Override
	public byte getOverrideAmount() {
		return this.ch_fld != null ? this.ch_fld.ae_fld : 0;
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(ZLfn;[B)Lfn;"
	)
	public fn pe(boolean var1, fn var2, byte[] var3) {
		return this.ar(var1, var2, var3);
	}

	fn(fn var1) {
		this.cz_fld = var1.cz_fld;
		this.bw_fld = var1.bw_fld;
		this.cb_fld = var1.cb_fld;
		this.yk_fld = var1.yk_fld;
		this.vr_fld = var1.vr_fld;
		this.qo_fld = var1.qo_fld;
		this.ba_fld = var1.ba_fld;
		this.bq_fld = var1.bq_fld;
		this.bg_fld = var1.bg_fld;
		this.bb_fld = var1.bb_fld;
		this.cd_fld = var1.cd_fld;
		this.cc_fld = var1.cc_fld;
		this.cx_fld = var1.cx_fld;
		this.cv_fld = var1.cv_fld;
		this.cq_fld = var1.cq_fld;
		this.cf_fld = var1.cf_fld;
		this.cy_fld = var1.cy_fld;
		this.cs_fld = var1.cs_fld;
		this.ce_fld = var1.ce_fld;
		this.cn_fld = var1.cn_fld;
		this.cr_fld = var1.cr_fld;
		this.cu_fld = var1.cu_fld;
		this.ci_fld = var1.ci_fld;
		this.cw_fld = var1.cw_fld;
		this.mw(var1);
	}

	public fn(fn[] var1, int var2) {
		this.cz_fld = 0;
		this.bw_fld = 0;
		this.cb_fld = 0;
		this.cs_fld = -1;

		for (int var3 = 0; var3 < var2; var3++) {
			fn var4 = var1[var3];
			if (var4 != null) {
				this.cz_fld = this.cz_fld + var4.cz_fld;
				this.bw_fld = this.bw_fld + var4.bw_fld;
				this.cb_fld = this.cb_fld + var4.cb_fld;
				if (this.cs_fld == -1) {
					this.cs_fld = var4.cs_fld;
				}
			}
		}

		this.cw(this.cz_fld, this.bw_fld, this.cb_fld);
		this.cz_fld = 0;
		this.bw_fld = 0;
		this.cb_fld = 0;

		for (int var5 = 0; var5 < var2; var5++) {
			this.ah(var1[var5]);
		}

		this.jg(var1, var2);
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;I[IFFF)V"
	)
	public void mv(rl21 var1, int var2, int[] var3, float var4, float var5, float var6) {
		if (var2 == 0) {
			int var7 = 0;
			var1.qc_fld = var1.ct_fld = var1.dx_fld = 0.0F;

			for (int var8 = 0; var8 < var3.length; var8++) {
				int var9 = var3[var8];
				if (var9 < this.cu_fld.length) {
					int[] var10 = this.cu_fld[var9];

					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						var1.qc_fld = var1.qc_fld + this.yk_fld[var12];
						var1.ct_fld = var1.ct_fld + this.vr_fld[var12];
						var1.dx_fld = var1.dx_fld + this.qo_fld[var12];
						var7++;
					}
				}
			}

			if (var7 > 0) {
				var1.qc_fld = var4 + var1.qc_fld / var7;
				var1.ct_fld = var5 + var1.ct_fld / var7;
				var1.dx_fld = var6 + var1.dx_fld / var7;
			} else {
				var1.qc_fld = var4;
				var1.ct_fld = var5;
				var1.dx_fld = var6;
			}
		} else if (var2 == 1) {
			for (int var22 = 0; var22 < var3.length; var22++) {
				int var26 = var3[var22];
				if (var26 < this.cu_fld.length) {
					int[] var30 = this.cu_fld[var26];

					for (int var34 = 0; var34 < var30.length; var34++) {
						int var38 = var30[var34];
						this.yk_fld[var38] = this.yk_fld[var38] + var4;
						this.vr_fld[var38] = this.vr_fld[var38] + var5;
						this.qo_fld[var38] = this.qo_fld[var38] + var6;
					}
				}
			}
		} else if (var2 == 2) {
			float var23 = var4 * 8.0F * 0.0030679617F;
			float var27 = var5 * 8.0F * 0.0030679617F;
			float var31 = var6 * 8.0F * 0.0030679617F;
			float var35 = 0.0F;
			float var39 = 0.0F;
			float var42 = 0.0F;
			float var13 = 0.0F;
			float var14 = 0.0F;
			float var15 = 0.0F;
			if (var23 != 0.0F) {
				var35 = (float)Math.sin(var23);
				var39 = (float)Math.cos(var23);
			}

			if (var27 != 0.0F) {
				var42 = (float)Math.sin(var27);
				var13 = (float)Math.cos(var27);
			}

			if (var31 != 0.0F) {
				var14 = (float)Math.sin(var31);
				var15 = (float)Math.cos(var31);
			}

			for (int var16 = 0; var16 < var3.length; var16++) {
				int var17 = var3[var16];
				if (var17 < this.cu_fld.length) {
					int[] var18 = this.cu_fld[var17];

					for (int var19 = 0; var19 < var18.length; var19++) {
						int var20 = var18[var19];
						this.yk_fld[var20] = this.yk_fld[var20] - var1.qc_fld;
						this.vr_fld[var20] = this.vr_fld[var20] - var1.ct_fld;
						this.qo_fld[var20] = this.qo_fld[var20] - var1.dx_fld;
						if (var31 != 0.0F) {
							float var21 = var14 * this.vr_fld[var20] + var15 * this.yk_fld[var20];
							this.vr_fld[var20] = var15 * this.vr_fld[var20] - var14 * this.yk_fld[var20];
							this.yk_fld[var20] = var21;
						}

						if (var23 != 0.0F) {
							float var44 = var39 * this.vr_fld[var20] - var35 * this.qo_fld[var20];
							this.qo_fld[var20] = var35 * this.vr_fld[var20] + var39 * this.qo_fld[var20];
							this.vr_fld[var20] = var44;
						}

						if (var27 != 0.0F) {
							float var45 = var42 * this.qo_fld[var20] + var13 * this.yk_fld[var20];
							this.qo_fld[var20] = var13 * this.qo_fld[var20] - var42 * this.yk_fld[var20];
							this.yk_fld[var20] = var45;
						}

						this.yk_fld[var20] = this.yk_fld[var20] + var1.qc_fld;
						this.vr_fld[var20] = this.vr_fld[var20] + var1.ct_fld;
						this.qo_fld[var20] = this.qo_fld[var20] + var1.dx_fld;
					}
				}
			}
		} else if (var2 == 3) {
			for (int var24 = 0; var24 < var3.length; var24++) {
				int var28 = var3[var24];
				if (var28 < this.cu_fld.length) {
					int[] var32 = this.cu_fld[var28];

					for (int var36 = 0; var36 < var32.length; var36++) {
						int var40 = var32[var36];
						this.yk_fld[var40] = this.yk_fld[var40] - var1.qc_fld;
						this.vr_fld[var40] = this.vr_fld[var40] - var1.ct_fld;
						this.qo_fld[var40] = this.qo_fld[var40] - var1.dx_fld;
						this.yk_fld[var40] = var4 * this.yk_fld[var40] / 128.0F;
						this.vr_fld[var40] = var5 * this.vr_fld[var40] / 128.0F;
						this.qo_fld[var40] = var6 * this.qo_fld[var40] / 128.0F;
						this.yk_fld[var40] = this.yk_fld[var40] + var1.qc_fld;
						this.vr_fld[var40] = this.vr_fld[var40] + var1.ct_fld;
						this.qo_fld[var40] = this.qo_fld[var40] + var1.dx_fld;
					}
				}
			}
		} else if (var2 == 5 && this.ci_fld != null && this.cv_fld != null) {
			for (int var25 = 0; var25 < var3.length; var25++) {
				int var29 = var3[var25];
				if (var29 < this.ci_fld.length) {
					int[] var33 = this.ci_fld[var29];

					for (int var37 = 0; var37 < var33.length; var37++) {
						int var41 = var33[var37];
						int var43 = (this.cv_fld[var41] & 255) + (int)var4 * 8;
						if (var43 < 0) {
							var43 = 0;
						} else if (var43 > 255) {
							var43 = 255;
						}

						this.cv_fld[var41] = (byte)var43;
					}
				}
			}
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void cw(int var1, int var2, int var3) {
		this.fp(var1, var2, var3);
		this.yk_fld = new float[var1];
		this.vr_fld = new float[var1];
		this.qo_fld = new float[var1];
		this.ba_fld = new int[var2];
		this.bq_fld = new int[var2];
		this.bg_fld = new int[var2];
		this.bb_fld = new int[var2];
		this.cd_fld = new int[var2];
		this.cc_fld = new int[var2];
		if (var3 > 0) {
			this.ce_fld = new int[var3];
			this.cn_fld = new int[var3];
			this.cr_fld = new int[var3];
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fo(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			this.yk_fld[var4] = this.yk_fld[var4] + var1;
			this.vr_fld[var4] = this.vr_fld[var4] + var2;
			this.qo_fld[var4] = this.qo_fld[var4] + var3;
		}

		this.bl();
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void fr(int var1) {
		try {
			if (this.cv_fld == null) {
				fc.ar_fld.aj_fld = 0;
			} else {
				fc.ar_fld.aj_fld = (this.cv_fld[var1] == -1 ? 253 : this.cv_fld[var1]) & 255;
			}

			if (fc.ar_fld.aa_fld != 1 || fc.ar_fld.aj_fld != 0) {
				if (fc.ar_fld.aa_fld != 0 || fc.ar_fld.aj_fld == 0) {
					if (ay_fld[var1]) {
						this.cc(var1);
					} else {
						int var2 = this.ba_fld[var1];
						int var3 = this.bq_fld[var1];
						int var4 = this.bg_fld[var1];
						fc.ar_fld.ax_fld = aw_fld[var1];
						int var5 = this.cy_fld == null ? 0 : this.cy_fld[var1] * 2;
						float var6 = ap.av(al_fld[var2] - var5);
						float var7 = ap.av(al_fld[var3] - var5);
						float var8 = ap.av(al_fld[var4] - var5);
						this.cd(
							var1,
							af_fld[var2],
							af_fld[var3],
							af_fld[var4],
							ar_fld[var2],
							ar_fld[var3],
							ar_fld[var4],
							var6,
							var7,
							var8,
							this.bb_fld[var1],
							this.cd_fld[var1],
							this.cc_fld[var1]
						);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("getOverrideLuminance")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Override
	public byte getOverrideLuminance() {
		return this.ch_fld != null ? this.ch_fld.av_fld : 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Z)Lfn;"
	)
	public fn ay(boolean var1) {
		if (!var1 && be_fld.length < this.bw_fld) {
			be_fld = new byte[this.bw_fld + 100];
		}

		return this.ar(var1, br_fld, be_fld);
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(ZZZJ)V"
	)
	final void fw(boolean var1, boolean var2, boolean var3, long var4) {
		try {
			if (this.co_fld < 6000) {
				for (int var6 = 0; var6 < this.co_fld; var6++) {
					ai_fld[var6] = 0;
				}

				int var33 = var3 ? 20 : 5;
				int var7 = fc.ax();

				for (int var8 = 0; var8 < this.bw_fld; var8++) {
					if (this.cc_fld[var8] == -2) {
						as_fld[var8] = true;
					} else {
						if (this.ct_fld != fk.az_fld) {
							if (fc.ar_fld.aa_fld == 1 && (this.cv_fld == null || this.cv_fld[var8] == 0)) {
								as_fld[var8] = true;
								continue;
							}

							if (fc.ar_fld.aa_fld == 0 && this.cv_fld != null && this.cv_fld[var8] != 0) {
								as_fld[var8] = true;
								continue;
							}
						}

						int var9 = this.ba_fld[var8];
						int var10 = this.bq_fld[var8];
						int var11 = this.bg_fld[var8];
						float var12 = ar_fld[var9];
						float var13 = ar_fld[var10];
						float var14 = ar_fld[var11];
						ay_fld[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
						if (ay_fld[var8]) {
							int var15 = ax_fld[var9];
							int var16 = ax_fld[var10];
							int var17 = ax_fld[var11];
							int var18 = an_fld[var9];
							int var19 = an_fld[var10];
							int var20 = an_fld[var11];
							int var21 = aa_fld[var9];
							int var22 = aa_fld[var10];
							int var23 = aa_fld[var11];
							var15 -= var16;
							var17 -= var16;
							var18 -= var19;
							var20 -= var19;
							var21 -= var22;
							var23 -= var22;
							int var24 = var18 * var23 - var21 * var20;
							int var25 = var21 * var17 - var15 * var23;
							int var26 = var15 * var20 - var18 * var17;
							as_fld[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
						} else {
							as_fld[var8] = (var12 - var13) * (af_fld[var11] - af_fld[var10]) - (af_fld[var9] - af_fld[var10]) * (var14 - var13) <= 0.0F;
							aw_fld[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
							if (var2) {
								int var39 = (int)af_fld[var9];
								int var41 = (int)af_fld[var10];
								int var43 = (int)af_fld[var11];
								int var44 = (int)var12;
								int var46 = (int)var13;
								int var48 = (int)var14;
								int var49 = ej.bh_fld + var33;
								boolean var38;
								if (var49 < var39 && var49 < var41 && var49 < var43) {
									var38 = false;
								} else {
									var49 = ej.bh_fld - var33;
									if (var49 > var39 && var49 > var41 && var49 > var43) {
										var38 = false;
									} else {
										var49 = var33 + ej.bs_fld;
										if (var49 < var44 && var49 < var46 && var49 < var48) {
											var38 = false;
										} else {
											var49 = ej.bs_fld - var33;
											if (var49 > var44 && var49 > var46 && var49 > var48) {
												var38 = false;
											} else {
												var38 = true;
											}
										}
									}
								}

								if (var38) {
									var49 = (int)(al_fld[var9] + al_fld[var10] + al_fld[var11]) / 3;
									lw.ar(var4, var49);
								}
							}
						}
					}
				}

				short var34 = this.cl_fld;
				boolean var35 = false;
				if (fc.ar_fld.au_fld.av()) {
					this.cl_fld = (short)this.bw_fld;
				} else if (this.ch_fld != null && this.ch_fld.av()) {
					fc.ar_fld.au_fld.ae(this.ch_fld);
					var35 = true;
				}

				try {
					if (!fc.an()) {
						this.ba(true);
					} else {
						fk var36 = this.ct_fld;
						if (var36 == fk.ak_fld) {
							if (fc.ar_fld.aa_fld != 0 && this.cv_fld != null) {
								var36 = fk.ag_fld;
							} else {
								var36 = fk.av_fld;
							}
						}

						switch (var36.ah_fld) {
							case 1:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								this.ba(false);
								break;
							case 2:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = 0;
								this.ba(true);
								fc.ar_fld.ap_fld = 0;
								fc.ar_fld.ad_fld = -1;
								this.ba(true);
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								break;
							case 3:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								zg(this);
								break;
							case 4:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = 0;
								zg(this);
						}
					}
				} finally {
					this.cl_fld = var34;
					if (var35) {
						fc.ar_fld.au_fld.ar();
					}
				}
			}
		} catch (Throwable var32) {
			throw new RuntimeException(var32);
		}
	}

	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void xh(fn var0) {
		if (var0.ck_fld != 2) {
			var0.ck_fld = 2;
			var0.bi_fld = 0;

			for (int var1 = 0; var1 < var0.cz_fld; var1++) {
				int var2 = (int)var0.yk_fld[var1];
				int var3 = (int)var0.vr_fld[var1];
				int var4 = (int)var0.qo_fld[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > var0.bi_fld) {
					var0.bi_fld = var5;
				}
			}

			var0.bi_fld = (int)(Math.sqrt(var0.bi_fld) + 0.99);
			var0.cm_fld = var0.bi_fld;
			var0.co_fld = var0.bi_fld + var0.bi_fld;
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void eu() {
		if (this.ck_fld != 1) {
			this.ck_fld = 1;
			float var1 = 0.0F;
			float var2 = 0.0F;
			float var3 = 0.0F;

			for (int var4 = 0; var4 < this.cz_fld; var4++) {
				float var5 = this.yk_fld[var4];
				float var6 = this.vr_fld[var4];
				float var7 = this.qo_fld[var4];
				if (-var6 > var1) {
					var1 = -var6;
				}

				if (var6 > var2) {
					var2 = var6;
				}

				float var8 = var5 * var5 + var7 * var7;
				if (var8 > var3) {
					var3 = var8;
				}
			}

			this.cp_fld = (int)Math.ceil(var2);
			super.ez_fld = (int)Math.ceil(var1);
			this.bi_fld = (int)Math.ceil(Math.sqrt(var3));
			this.cm_fld = (int)Math.ceil(Math.sqrt(this.bi_fld * this.bi_fld + super.ez_fld * super.ez_fld));
			this.co_fld = this.cm_fld + (int)Math.ceil(Math.sqrt(this.bi_fld * this.bi_fld + this.cp_fld * this.cp_fld));
		}
	}

	@ObfuscatedName("setBufferOffset")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setBufferOffset(int var1) {
		this.pn_fld = var1;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I[IIII)V"
	)
	public static void ip(fn var0, int var1, int[] var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		int var6 = var2.length;
		if (var1 == 0) {
			int var21 = 0;
			bp_fld = 0;
			bt_fld = 0;
			bv_fld = 0;

			for (int var25 = 0; var25 < var6; var25++) {
				int var29 = var2[var25];
				if (var29 < var0.cu_fld.length) {
					int[] var33 = var0.cu_fld[var29];

					for (int var37 = 0; var37 < var33.length; var37++) {
						int var39 = var33[var37];
						bp_fld = bp_fld + (int)var0.yk_fld[var39];
						bt_fld = bt_fld + (int)var0.vr_fld[var39];
						bv_fld = bv_fld + (int)var0.qo_fld[var39];
						var21++;
					}
				}
			}

			if (var21 > 0) {
				bp_fld = bp_fld / var21 + var3;
				bt_fld = bt_fld / var21 + var4;
				bv_fld = bv_fld / var21 + var5;
			} else {
				bp_fld = var3;
				bt_fld = var4;
				bv_fld = var5;
			}
		} else if (var1 == 1) {
			for (int var20 = 0; var20 < var6; var20++) {
				int var24 = var2[var20];
				if (var24 < var0.cu_fld.length) {
					int[] var28 = var0.cu_fld[var24];

					for (int var32 = 0; var32 < var28.length; var32++) {
						int var36 = var28[var32];
						var0.yk_fld[var36] = (int)var0.yk_fld[var36] + var3;
						var0.vr_fld[var36] = (int)var0.vr_fld[var36] + var4;
						var0.qo_fld[var36] = (int)var0.qo_fld[var36] + var5;
					}
				}
			}
		} else if (var1 == 2) {
			for (int var19 = 0; var19 < var6; var19++) {
				int var23 = var2[var19];
				if (var23 < var0.cu_fld.length) {
					int[] var27 = var0.cu_fld[var23];

					for (int var31 = 0; var31 < var27.length; var31++) {
						int var35 = var27[var31];
						var0.yk_fld[var35] = (int)var0.yk_fld[var35] - bp_fld;
						var0.vr_fld[var35] = (int)var0.vr_fld[var35] - bt_fld;
						var0.qo_fld[var35] = (int)var0.qo_fld[var35] - bv_fld;
						int var38 = (var3 & 0xFF) * 8;
						int var13 = (var4 & 0xFF) * 8;
						int var14 = (var5 & 0xFF) * 8;
						if (var14 != 0) {
							int var15 = ac_fld[var14];
							int var16 = aj_fld[var14];
							int var17 = (int)var0.vr_fld[var35] * var15 + (int)var0.yk_fld[var35] * var16 >> 16;
							var0.vr_fld[var35] = (int)var0.vr_fld[var35] * var16 - (int)var0.yk_fld[var35] * var15 >> 16;
							var0.yk_fld[var35] = var17;
						}

						if (var38 != 0) {
							int var40 = ac_fld[var38];
							int var42 = aj_fld[var38];
							int var44 = (int)var0.vr_fld[var35] * var42 - (int)var0.qo_fld[var35] * var40 >> 16;
							var0.qo_fld[var35] = (int)var0.vr_fld[var35] * var40 + (int)var0.qo_fld[var35] * var42 >> 16;
							var0.vr_fld[var35] = var44;
						}

						if (var13 != 0) {
							int var41 = ac_fld[var13];
							int var43 = aj_fld[var13];
							int var45 = (int)var0.qo_fld[var35] * var41 + (int)var0.yk_fld[var35] * var43 >> 16;
							var0.qo_fld[var35] = (int)var0.qo_fld[var35] * var43 - (int)var0.yk_fld[var35] * var41 >> 16;
							var0.yk_fld[var35] = var45;
						}

						var0.yk_fld[var35] = (int)var0.yk_fld[var35] + bp_fld;
						var0.vr_fld[var35] = (int)var0.vr_fld[var35] + bt_fld;
						var0.qo_fld[var35] = (int)var0.qo_fld[var35] + bv_fld;
					}
				}
			}
		} else if (var1 == 3) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var22 = var2[var18];
				if (var22 < var0.cu_fld.length) {
					int[] var26 = var0.cu_fld[var22];

					for (int var30 = 0; var30 < var26.length; var30++) {
						int var34 = var26[var30];
						var0.yk_fld[var34] = (int)var0.yk_fld[var34] - bp_fld;
						var0.vr_fld[var34] = (int)var0.vr_fld[var34] - bt_fld;
						var0.qo_fld[var34] = (int)var0.qo_fld[var34] - bv_fld;
						var0.yk_fld[var34] = (int)var0.yk_fld[var34] * var3 / 128;
						var0.vr_fld[var34] = (int)var0.vr_fld[var34] * var4 / 128;
						var0.qo_fld[var34] = (int)var0.qo_fld[var34] * var5 / 128;
						var0.yk_fld[var34] = (int)var0.yk_fld[var34] + bp_fld;
						var0.vr_fld[var34] = (int)var0.vr_fld[var34] + bt_fld;
						var0.qo_fld[var34] = (int)var0.qo_fld[var34] + bv_fld;
					}
				}
			}
		} else if (var1 == 5) {
			if (var0.ci_fld != null && var0.cv_fld != null) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = var2[var7];
					if (var8 < var0.ci_fld.length) {
						int[] var9 = var0.ci_fld[var8];

						for (int var10 = 0; var10 < var9.length; var10++) {
							int var11 = var9[var10];
							int var12 = (var0.cv_fld[var11] & 255) + var3 * 8;
							if (var12 < 0) {
								var12 = 0;
							} else if (var12 > 255) {
								var12 = 255;
							}

							var0.cv_fld[var11] = (byte)var12;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)Lfm;"
	)
	public fm gx(int var1) {
		return ff(this, var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void at() {
		if (this.ck_fld != 2) {
			this.ck_fld = 2;
			float var1 = 0.0F;

			for (int var2 = 0; var2 < this.cz_fld; var2++) {
				float var3 = this.yk_fld[var2];
				float var4 = this.vr_fld[var2];
				float var5 = this.qo_fld[var2];
				float var6 = var3 * var3 + var5 * var5 + var4 * var4;
				if (var6 > var1) {
					var1 = var6;
				}
			}

			this.bi_fld = (int)Math.ceil(Math.sqrt(var1));
			this.cm_fld = this.bi_fld;
			this.co_fld = this.bi_fld + this.bi_fld;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ac() {
		this.eu();
		return this.bi_fld;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dw() {
		this.ck_fld = 0;
		this.cj_fld = null;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V"
	)
	public void di(fe var1, int var2) {
		if (this.cu_fld != null) {
			if (var2 != -1) {
				eq var3 = var1.ak_fld[var2];
				ea var4 = var3.ae_fld;
				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				et();

				for (int var5 = 0; var5 < var3.ah_fld; var5++) {
					int var6 = var3.aw_fld[var5];
					this.ei(var4.aw_fld[var6], var4.ay_fld[var6], var3.ay_fld[var5], var3.as_fld[var5], var3.ar_fld[var5]);
				}

				this.dw();
			}
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void et() {
		if (!zi_fld && !og.ci_fld.isClientThread()) {
			throw new AssertionError();
		} else {
			rl21 var1 = rl21.no_fld;
			var1.wh_fld = var1.mw_fld = var1.ci_fld = 0;
			var1.qc_fld = var1.ct_fld = var1.dx_fld = 0.0F;
		}
	}

	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "(III)Lfn;"
	)
	public fn scale(int var1, int var2, int var3) {
		this.bp(var1, var2, var3);
		return this;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	void bz(sp var1, int var2) {
		ea var3 = var1.ah_fld;
		byte[] var4 = this.getFaceTransparencies();

		for (int var5 = 0; var5 < var3.ah_fld; var5++) {
			int var6 = var3.aw_fld[var5];
			if (var6 == 5 && var1.ul_fld != null && var1.ul_fld[var5 * 1 + 0] != 0 && this.ci_fld != null && var4 != null) {
				int var7 = var1.ul_fld[var5 * 1 + 0];

				for (int var11 : var3.ay_fld[var5]) {
					if (var11 < this.ci_fld.length) {
						int[] var12 = this.ci_fld[var11];

						for (int var13 = 0; var13 < var12.length; var13++) {
							int var14 = var12[var13];
							int var15 = (int)((var4[var14] & 255) + var1.vb(var7, var2) * 255.0F);
							if (var15 < 0) {
								var15 = 0;
							} else if (var15 > 255) {
								var15 = 255;
							}

							var4[var14] = (byte)var15;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void yt(fn var0) {
		if (var0.ck_fld != 1) {
			var0.ck_fld = 1;
			var0.ez_fld = 0;
			var0.cp_fld = 0;
			var0.bi_fld = 0;

			for (int var1 = 0; var1 < var0.cz_fld; var1++) {
				int var2 = (int)var0.yk_fld[var1];
				int var3 = (int)var0.vr_fld[var1];
				int var4 = (int)var0.qo_fld[var1];
				if (-var3 > var0.ez_fld) {
					var0.ez_fld = -var3;
				}

				if (var3 > var0.cp_fld) {
					var0.cp_fld = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > var0.bi_fld) {
					var0.bi_fld = var5;
				}
			}

			var0.bi_fld = (int)(Math.sqrt(var0.bi_fld) + 0.99);
			var0.cm_fld = (int)(Math.sqrt(var0.bi_fld * var0.bi_fld + var0.ez_fld * var0.ez_fld) + 0.99);
			var0.co_fld = var0.cm_fld + (int)(Math.sqrt(var0.bi_fld * var0.bi_fld + var0.cp_fld * var0.cp_fld) + 0.99);
		}
	}

	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn rotateY270Ccw() {
		this.ea();
		return this;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V"
	)
	void br(ek var1, int var2) {
		this.cv(var1, var2);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "([Lfn;I)V"
	)
	public void jg(fn[] var1, int var2) {
		this.bf();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bp(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			this.yk_fld[var4] = var1 * this.yk_fld[var4] / 128.0F;
			this.vr_fld[var4] = var2 * this.vr_fld[var4] / 128.0F;
			this.qo_fld[var4] = var3 * this.qo_fld[var4] / 128.0F;
		}

		this.bl();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I[IZ)V"
	)
	public void bh(fe var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.di(var1, var2);
		} else {
			eq var5 = var1.ak_fld[var2];
			ea var6 = var5.ae_fld;
			int var7 = 0;
			int var8 = var3[var7++];
			bp_fld = 0;
			bt_fld = 0;
			bv_fld = 0;
			et();

			for (int var9 = 0; var9 < var5.ah_fld; var9++) {
				int var10 = var5.aw_fld[var9];

				while (var10 > var8) {
					var8 = var3[var7++];
				}

				if (var4) {
					if (var10 == var8 || var6.aw_fld[var10] == 0) {
						this.ei(var6.aw_fld[var10], var6.ay_fld[var10], var5.ay_fld[var9], var5.as_fld[var9], var5.ar_fld[var9]);
					}
				} else if (var10 != var8 || var6.aw_fld[var10] == 0) {
					this.ei(var6.aw_fld[var10], var6.ay_fld[var10], var5.ay_fld[var9], var5.as_fld[var9], var5.ar_fld[var9]);
				}
			}
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfe;ILfe;I[I)V"
	)
	public static void fl(fn var0, fe var1, int var2, fe var3, int var4, int[] var5) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				eq var6 = var1.ak_fld[var2];
				eq var7 = var3.ak_fld[var4];
				ea var8 = var6.ae_fld;
				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				et();
				int var9 = 0;
				int var10 = var5[var9++];

				for (int var11 = 0; var11 < var6.ah_fld; var11++) {
					int var12 = var6.aw_fld[var11];

					while (var12 > var10) {
						var10 = var5[var9++];
					}

					if (var12 != var10 || var8.aw_fld[var12] == 0) {
						var0.ei(var8.aw_fld[var12], var8.ay_fld[var12], var6.ay_fld[var11], var6.as_fld[var11], var6.ar_fld[var11]);
					}
				}

				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				et();
				var9 = 0;
				var10 = var5[var9++];

				for (int var17 = 0; var17 < var7.ah_fld; var17++) {
					int var18 = var7.aw_fld[var17];

					while (var18 > var10) {
						var10 = var5[var9++];
					}

					if (var18 == var10 || var8.aw_fld[var18] == 0) {
						var0.ei(var8.aw_fld[var18], var8.ay_fld[var18], var7.ay_fld[var17], var7.as_fld[var17], var7.ar_fld[var17]);
					}
				}

				var0.dw();
			} else {
				var0.di(var1, var2);
			}
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I[IIII)V"
	)
	void ei(int var1, int[] var2, int var3, int var4, int var5) {
		if (!zi_fld && !og.ci_fld.isClientThread()) {
			throw new AssertionError();
		} else {
			this.yg(rl21.no_fld, var1, var2, var3, var4, var5);
		}
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	@Override
	void mu(int var1, uy var2, int var3, int var4, int var5, long var6) {
		if (fc.ar_fld.aa_fld != 1 || this.cv_fld != null) {
			if (this.ck_fld != 1) {
				this.eu();
			}

			this.af(var1);
			ul var8 = uv.ak();
			var8.ak_fld.ar(var1 * 0.0030679614F, 0.0F, 0.0F);
			tu.md(var8.az_fld, 1.0F, 1.0F, 1.0F, (byte)48);
			tu.md(var8.ag_fld, var3, var4, var5, (byte)-50);
			uy var9 = kv.ak();
			var9.ax(var8);
			var9.al(var2);
			int var10 = (int)var9.ab(0.0F, 0.0F, 0.0F);
			boolean var11 = false;
			int var12 = var10 - this.cm_fld;
			boolean var13 = var12 <= 50 || this.cf_fld != null;
			boolean var14 = jv.az(var6);
			boolean var15 = false;
			if (var14 && rt.af()) {
				boolean var16 = ee.aq(this, var1, var3, var4, var5, var2, fc.aw(), fc.ay(), fc.au());
				if (var16) {
					if (this.cw_fld) {
						int var17 = mf.ad(this, var1, var3, var4, var5, var2, fc.aw(), fc.ay(), fc.au());
						var17 += 32;
						lw.ar(var6, var17);
					} else {
						var15 = true;
					}
				}
			}

			int var23 = fc.aw();
			int var25 = fc.ay();

			for (int var18 = 0; var18 < this.cz_fld; var18++) {
				float var19 = (int)this.yk_fld[var18];
				float var20 = (int)this.vr_fld[var18];
				float var21 = (int)this.qo_fld[var18];
				uy.vt(var9, var19, var20, var21, bz_fld, 680776838);
				var19 = bz_fld[0];
				var20 = bz_fld[1];
				var21 = bz_fld[2];
				var11 |= this.bn(var18, var19, var20, var21, var10, var23, var25, var13);
			}

			ul.ln(var8, (byte)-99);
			var9.az();

			try {
				this.fw(var11, var15, this.cw_fld, var6);
			} catch (Exception var22) {
			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Lea;Lsp;I[ZZZ)V"
	)
	public void ec(ea var1, sp var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		ek var7 = var1.ag();
		if (var7 != null) {
			var7.ah(var2, var3, var4, var5);
			if (var6) {
				this.br(var7, sp.zf(var2, 647445380));
			}
		}

		if (!var5 && var2.ah()) {
			this.bz(var2, var3);
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ea() {
		for (int var1 = 0; var1 < this.cz_fld; var1++) {
			float var2 = this.qo_fld[var1];
			this.qo_fld[var1] = this.yk_fld[var1];
			this.yk_fld[var1] = -var2;
		}

		this.bl();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void bo(uz var1) {
		tu var2 = tu.ar(0.0F, 0.0F, 0.0F);

		for (int var3 = 0; var3 < this.cz_fld; var3++) {
			var2.bj(this.yk_fld[var3], this.vr_fld[var3], this.qo_fld[var3]);
			var2.hm(var1);
			this.yk_fld[var3] = var2.ay_fld;
			this.vr_fld[var3] = var2.as_fld;
			this.qo_fld[var3] = var2.ar_fld;
		}

		var2.bz();
		this.bl();
	}

	@ObfuscatedName("getVerticesZ")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	@Override
	public float[] getVerticesZ() {
		return this.qo_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Z)Lfn;"
	)
	public fn ax(boolean var1) {
		return this.as(var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	public final void bv(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			int var16 = var7;
			int var15 = var6;
			int var14 = var5;
			int var12 = var3;
			int var11 = var2;
			int var10 = var1;
			fn var9 = this;
			if (this.ck_fld != 2) {
				this.at();
			}

			int var17 = fc.aw();
			int var18 = fc.ay();
			int var19 = ac_fld[var1];
			int var20 = aj_fld[var1];
			int var21 = ac_fld[var2];
			int var22 = aj_fld[var2];
			int var23 = ac_fld[var3];
			int var24 = aj_fld[var3];
			int var25 = ac_fld[var4];
			int var26 = aj_fld[var4];
			int var27 = var6 * var25 + var7 * var26 >> 16;

			for (int var28 = 0; var28 < var9.cz_fld; var28++) {
				int var29 = (int)var9.yk_fld[var28];
				int var30 = (int)var9.vr_fld[var28];
				int var31 = (int)var9.qo_fld[var28];
				if (var12 != 0) {
					int var32 = var30 * var23 + var29 * var24 >> 16;
					var30 = var30 * var24 - var29 * var23 >> 16;
					var29 = var32;
				}

				if (var10 != 0) {
					int var39 = var30 * var20 - var31 * var19 >> 16;
					var31 = var30 * var19 + var31 * var20 >> 16;
					var30 = var39;
				}

				if (var11 != 0) {
					int var40 = var31 * var21 + var29 * var22 >> 16;
					var31 = var31 * var22 - var29 * var21 >> 16;
					var29 = var40;
				}

				var29 += var14;
				var30 += var15;
				var31 += var16;
				int var41 = var30 * var26 - var31 * var25 >> 16;
				var31 = var30 * var25 + var31 * var26 >> 16;
				au_fld[var28] = var31 - var27;
				ar_fld[var28] = var17 + var29 * fc.au() / var31;
				af_fld[var28] = var18 + var41 * fc.au() / var31;
				al_fld[var28] = var31;
				if (var9.cf_fld != null) {
					ax_fld[var28] = var29;
					an_fld[var28] = var41;
					aa_fld[var28] = var31;
				}
			}

			try {
				var9.fw(false, false, false, 0L);
			} catch (Exception var33) {
			}
		} catch (Exception var34) {
			client.ii_fld.debug("failed drawing model", (Throwable)var34);
		}
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void ya(fn var0) {
		for (int var1 = 0; var1 < var0.cz_fld; var1++) {
			int var2 = (int)var0.qo_fld[var1];
			var0.qo_fld[var1] = var0.yk_fld[var1];
			var0.yk_fld[var1] = -var2;
		}

		var0.dw();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	void cu(fn var1) {
		if (var1 != null) {
			this.ag(var1);

			for (int var2 = 0; var2 < var1.bw_fld; var2++) {
				this.ba_fld[this.bw_fld] = var1.ba_fld[var2] + this.cz_fld;
				this.bq_fld[this.bw_fld] = var1.bq_fld[var2] + this.cz_fld;
				this.bg_fld[this.bw_fld] = var1.bg_fld[var2] + this.cz_fld;
				this.bb_fld[this.bw_fld] = var1.bb_fld[var2];
				this.cd_fld[this.bw_fld] = var1.cd_fld[var2];
				this.cc_fld[this.bw_fld] = var1.cc_fld[var2];
				if (this.cx_fld != null) {
					this.cx_fld[this.bw_fld] = var1.cx_fld != null ? var1.cx_fld[var2] : var1.cs_fld;
				}

				if (this.cv_fld != null && var1.cv_fld != null) {
					this.cv_fld[this.bw_fld] = var1.cv_fld[var2];
				}

				if (this.cf_fld != null) {
					this.cf_fld[this.bw_fld] = var1.cf_fld != null ? var1.cf_fld[var2] : -1;
				}

				if (this.cq_fld != null) {
					if (var1.cq_fld != null && var1.cq_fld[var2] != -1) {
						this.cq_fld[this.bw_fld] = (byte)(var1.cq_fld[var2] + this.cb_fld);
					} else {
						this.cq_fld[this.bw_fld] = -1;
					}
				}

				if (this.cy_fld != null && var1.cy_fld != null) {
					this.cy_fld[this.bw_fld] = var1.cy_fld[var2];
				}

				this.bw_fld++;
			}

			for (int var3 = 0; var3 < var1.cb_fld; var3++) {
				this.ce_fld[this.cb_fld] = var1.ce_fld[var3] + this.cz_fld;
				this.cn_fld[this.cb_fld] = var1.cn_fld[var3] + this.cz_fld;
				this.cr_fld[this.cb_fld] = var1.cr_fld[var3] + this.cz_fld;
				this.cb_fld++;
			}

			for (int var4 = 0; var4 < var1.cz_fld; var4++) {
				this.yk_fld[this.cz_fld] = var1.yk_fld[var4];
				this.vr_fld[this.cz_fld] = var1.vr_fld[var4];
				this.qo_fld[this.cz_fld] = var1.qo_fld[var4];
				this.cz_fld++;
			}
		}
	}

	@ObfuscatedName("getVertexNormalsZ")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getVertexNormalsZ() {
		return this.rc_fld;
	}

	@ObfuscatedName("getSceneId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSceneId() {
		return this.ib_fld;
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V"
	)
	public static void pr(fn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			fm var2 = ff(var0, var1);
			if (var2 == null) {
				int var3 = 0;
				int var4 = 0;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = 0;
				int var9 = aj_fld[var1];
				int var10 = ac_fld[var1];

				for (int var11 = 0; var11 < var0.cz_fld; var11++) {
					int var12 = av.ak((int)var0.yk_fld[var11], (int)var0.qo_fld[var11], var9, var10);
					int var13 = (int)var0.vr_fld[var11];
					int var14 = hv.ag((int)var0.yk_fld[var11], (int)var0.qo_fld[var11], var9, var10);
					if (var12 < var3) {
						var3 = var12;
					}

					if (var12 > var6) {
						var6 = var12;
					}

					if (var13 < var4) {
						var4 = var13;
					}

					if (var13 > var7) {
						var7 = var13;
					}

					if (var14 < var5) {
						var5 = var14;
					}

					if (var14 > var8) {
						var8 = var14;
					}
				}

				var2 = new fm(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
				byte var16 = 32;
				if (var2.ae_fld < 2122456794) {
					var2.ae_fld = 902131596;
				}

				if (var2.aw_fld < 32) {
					var2.aw_fld = 234523600;
				}

				if (var0.cw_fld) {
					byte var17 = 8;
					var2.ae_fld += 835772793;
					var2.aw_fld += 8;
				}

				var2.ay_fld = var0.cj_fld;
				var0.cj_fld = var2;
			}
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void lp(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		this.bu(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("zg")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void zg(fn var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				for (int var1 = 0; var1 < var0.bw_fld; var1++) {
					if (!as_fld[var1]) {
						zp(var0, var1);
					}
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIJ)V"
	)
	void bu(int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
		if (fc.ar_fld.aa_fld != 1 || this.cv_fld != null) {
			int var9 = fc.ah_fld[var2];
			int var10 = fc.aw_fld[var2];
			int var11 = fc.ah_fld[var3];
			int var12 = fc.aw_fld[var3];
			float var13 = fc.ay_fld[var2];
			float var14 = fc.as_fld[var2];
			float var15 = fc.ay_fld[var3];
			float var16 = fc.as_fld[var3];
			if (this.ck_fld != 1) {
				this.eu();
			}

			this.af(var1);
			int var17 = var6 * var12 - var4 * var11 >> 16;
			int var18 = var5 * var9 + var17 * var10 >> 16;
			int var19 = this.bi_fld * var10 >> 16;
			int var20 = var18 + var19;
			if (var20 > 50 && var18 < fh.az()) {
				int var21 = var6 * var11 + var4 * var12 >> 16;
				int var22 = (var21 - this.bi_fld) * fc.au();
				if (var22 / var20 < fc.ar()) {
					int var23 = (var21 + this.bi_fld) * fc.au();
					if (var23 / var20 > fc.as()) {
						int var24 = var5 * var10 - var17 * var9 >> 16;
						int var25 = this.bi_fld * var9 >> 16;
						int var26 = var25 + (this.cp_fld * var10 >> 16);
						int var27 = (var24 + var26) * fc.au();
						if (var27 / var20 > fc.al()) {
							int var28 = var25 + (this.ez_fld * var10 >> 16);
							int var29 = (var24 - var28) * fc.au();
							if (var29 / var20 < fc.af()) {
								int var30 = var19 + (this.ez_fld * var9 >> 16);
								boolean var31 = false;
								boolean var32 = false;
								if (var18 - var30 <= 50) {
									var32 = true;
								}

								boolean var33 = var32 || this.cf_fld != null;
								int var34 = bx.al();
								int var35 = vh.au((byte)2);
								boolean var36 = rt.af();
								boolean var37 = jv.az(var7);
								boolean var38 = false;
								if (var37 && var36) {
									boolean var39 = false;
									if (at_fld) {
										var39 = qa.ai(this, var1, var4, var5, var6, var13, var14, var15, var16, fc.aw(), fc.ay(), fc.au());
									} else {
										int var40 = var18 - var19;
										if (var40 <= 50) {
											var40 = 50;
										}

										if (var21 > 0) {
											var22 /= var20;
											var23 /= var40;
										} else {
											var23 /= var20;
											var22 /= var40;
										}

										if (var24 > 0) {
											var29 /= var20;
											var27 /= var40;
										} else {
											var27 /= var20;
											var29 /= var40;
										}

										int var41 = var34 - fc.aw();
										int var42 = var35 - fc.ay();
										if (var41 > var22 && var41 < var23 && var42 > var29 && var42 < var27) {
											var39 = true;
										}
									}

									if (var39) {
										if (this.cw_fld) {
											int var57 = fc.aw();
											int var43 = fc.ay();
											int var44 = fc.au();
											en.ax(var13, var14, var15, var16, var57, var43, var44);
											int var54 = bc.ao(var4, var5, var6, bc.bl_fld, ch.bx_fld, ee.bo_fld, dc.bp_fld, bu.bt_fld, hg.bv_fld, ff(this, var1));
											int var45 = var54 + 32;
											lw.ar(var7, var45);
										} else {
											var38 = true;
										}
									}
								}

								int var53 = fc.aw();
								int var55 = fc.ay();
								float var56 = 0.0F;
								float var58 = 0.0F;
								if (var1 != 0) {
									var56 = fc.ay_fld[var1];
									var58 = fc.as_fld[var1];
								}

								for (int var59 = 0; var59 < this.cz_fld; var59++) {
									float var60 = (int)this.yk_fld[var59];
									float var63 = (int)this.vr_fld[var59];
									float var46 = (int)this.qo_fld[var59];
									if (var1 != 0) {
										float var47 = var46 * var56 + var60 * var58;
										var46 = var46 * var58 - var60 * var56;
										var60 = var47;
									}

									var60 += var4;
									var63 += var5;
									var46 += var6;
									float var68 = var46 * var15 + var60 * var16;
									var46 = var46 * var16 - var60 * var15;
									float var69 = var63 * var14 - var46 * var13;
									var46 = var63 * var13 + var46 * var14;
									var31 |= this.bn(var59, var68, var69, var46, var18, var53, var55, var33);
								}

								try {
									this.fw(var31, var38, this.cw_fld, var7);
								} catch (Exception var48) {
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I[IIII)V"
	)
	void eq(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		if (var1 == 0) {
			int var21 = 0;
			bp_fld = 0;
			bt_fld = 0;
			bv_fld = 0;

			for (int var25 = 0; var25 < var6; var25++) {
				int var29 = var2[var25];
				if (var29 < this.cu_fld.length) {
					int[] var33 = this.cu_fld[var29];

					for (int var37 = 0; var37 < var33.length; var37++) {
						int var39 = var33[var37];
						bp_fld = bp_fld + (int)this.yk_fld[var39];
						bt_fld = bt_fld + (int)this.vr_fld[var39];
						bv_fld = bv_fld + (int)this.qo_fld[var39];
						var21++;
					}
				}
			}

			if (var21 > 0) {
				bp_fld = bp_fld / var21 + var3;
				bt_fld = bt_fld / var21 + var4;
				bv_fld = bv_fld / var21 + var5;
			} else {
				bp_fld = var3;
				bt_fld = var4;
				bv_fld = var5;
			}
		} else if (var1 == 1) {
			for (int var20 = 0; var20 < var6; var20++) {
				int var24 = var2[var20];
				if (var24 < this.cu_fld.length) {
					int[] var28 = this.cu_fld[var24];

					for (int var32 = 0; var32 < var28.length; var32++) {
						int var36 = var28[var32];
						this.yk_fld[var36] = (int)this.yk_fld[var36] + var3;
						this.vr_fld[var36] = (int)this.vr_fld[var36] + var4;
						this.qo_fld[var36] = (int)this.qo_fld[var36] + var5;
					}
				}
			}
		} else if (var1 == 2) {
			for (int var19 = 0; var19 < var6; var19++) {
				int var23 = var2[var19];
				if (var23 < this.cu_fld.length) {
					int[] var27 = this.cu_fld[var23];

					for (int var31 = 0; var31 < var27.length; var31++) {
						int var35 = var27[var31];
						this.yk_fld[var35] = (int)this.yk_fld[var35] - bp_fld;
						this.vr_fld[var35] = (int)this.vr_fld[var35] - bt_fld;
						this.qo_fld[var35] = (int)this.qo_fld[var35] - bv_fld;
						int var38 = (var3 & 0xFF) * 8;
						int var13 = (var4 & 0xFF) * 8;
						int var14 = (var5 & 0xFF) * 8;
						if (var14 != 0) {
							int var15 = ac_fld[var14];
							int var16 = aj_fld[var14];
							int var17 = (int)this.vr_fld[var35] * var15 + (int)this.yk_fld[var35] * var16 >> 16;
							this.vr_fld[var35] = (int)this.vr_fld[var35] * var16 - (int)this.yk_fld[var35] * var15 >> 16;
							this.yk_fld[var35] = var17;
						}

						if (var38 != 0) {
							int var40 = ac_fld[var38];
							int var42 = aj_fld[var38];
							int var44 = (int)this.vr_fld[var35] * var42 - (int)this.qo_fld[var35] * var40 >> 16;
							this.qo_fld[var35] = (int)this.vr_fld[var35] * var40 + (int)this.qo_fld[var35] * var42 >> 16;
							this.vr_fld[var35] = var44;
						}

						if (var13 != 0) {
							int var41 = ac_fld[var13];
							int var43 = aj_fld[var13];
							int var45 = (int)this.qo_fld[var35] * var41 + (int)this.yk_fld[var35] * var43 >> 16;
							this.qo_fld[var35] = (int)this.qo_fld[var35] * var43 - (int)this.yk_fld[var35] * var41 >> 16;
							this.yk_fld[var35] = var45;
						}

						this.yk_fld[var35] = (int)this.yk_fld[var35] + bp_fld;
						this.vr_fld[var35] = (int)this.vr_fld[var35] + bt_fld;
						this.qo_fld[var35] = (int)this.qo_fld[var35] + bv_fld;
					}
				}
			}
		} else if (var1 == 3) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var22 = var2[var18];
				if (var22 < this.cu_fld.length) {
					int[] var26 = this.cu_fld[var22];

					for (int var30 = 0; var30 < var26.length; var30++) {
						int var34 = var26[var30];
						this.yk_fld[var34] = (int)this.yk_fld[var34] - bp_fld;
						this.vr_fld[var34] = (int)this.vr_fld[var34] - bt_fld;
						this.qo_fld[var34] = (int)this.qo_fld[var34] - bv_fld;
						this.yk_fld[var34] = (int)this.yk_fld[var34] * var3 / 128;
						this.vr_fld[var34] = (int)this.vr_fld[var34] * var4 / 128;
						this.qo_fld[var34] = (int)this.qo_fld[var34] * var5 / 128;
						this.yk_fld[var34] = (int)this.yk_fld[var34] + bp_fld;
						this.vr_fld[var34] = (int)this.vr_fld[var34] + bt_fld;
						this.qo_fld[var34] = (int)this.qo_fld[var34] + bv_fld;
					}
				}
			}
		} else if (var1 == 5) {
			if (this.ci_fld != null && this.cv_fld != null) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = var2[var7];
					if (var8 < this.ci_fld.length) {
						int[] var9 = this.ci_fld[var8];

						for (int var10 = 0; var10 < var9.length; var10++) {
							int var11 = var9[var10];
							int var12 = (this.cv_fld[var11] & 255) + var3 * 8;
							if (var12 < 0) {
								var12 = 0;
							} else if (var12 > 255) {
								var12 = 255;
							}

							this.cv_fld[var11] = (byte)var12;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IFFFIIIZ)Z"
	)
	boolean bn(int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
		au_fld[var1] = (int)var4 - var5;
		if (var8) {
			ax_fld[var1] = (int)var2;
			an_fld[var1] = (int)var3;
			aa_fld[var1] = (int)var4;
		}

		if (var4 >= 50.0F) {
			ar_fld[var1] = var6 + var2 * fc.au() / var4;
			af_fld[var1] = var7 + var3 * fc.au() / var4;
			al_fld[var1] = var4;
			return false;
		} else {
			ar_fld[var1] = -5000.0F;
			return true;
		}
	}

	@ObfuscatedName("getFaceColors2")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getFaceColors2() {
		return this.cd_fld;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fd() {
		try {
			for (int var1 = 0; var1 < 12; var1++) {
				am_fld[var1] = 0;
				ap_fld[var1] = 0;
			}

			for (int var15 = this.co_fld - 1; var15 >= 0; var15--) {
				char var2 = ai_fld[var15];
				if (var2 > 0) {
					char[] var3 = aq_fld[var15];

					for (int var4 = 0; var4 < var2; var4++) {
						char var5 = var3[var4];
						byte var6 = this.cx_fld[var5];
						int var7 = am_fld[var6]++;
						ad_fld[var6][var7] = var5;
						if (var6 < 10) {
							ap_fld[var6] = ap_fld[var6] + var15;
						} else if (var6 == 10) {
							ao_fld[var7] = var15;
						} else {
							ab_fld[var7] = var15;
						}
					}
				}
			}

			int var16 = 0;
			if (am_fld[1] > 0 || am_fld[2] > 0) {
				var16 = (ap_fld[1] + ap_fld[2]) / (am_fld[1] + am_fld[2]);
			}

			int var17 = 0;
			if (am_fld[3] > 0 || am_fld[4] > 0) {
				var17 = (ap_fld[3] + ap_fld[4]) / (am_fld[3] + am_fld[4]);
			}

			int var18 = 0;
			if (am_fld[6] > 0 || am_fld[8] > 0) {
				var18 = (ap_fld[6] + ap_fld[8]) / (am_fld[6] + am_fld[8]);
			}

			int var20 = 0;
			int var21 = am_fld[10];
			int[] var22 = ad_fld[10];
			int[] var8 = ao_fld;
			if (var20 == var21) {
				var20 = 0;
				var21 = am_fld[11];
				var22 = ad_fld[11];
				var8 = ab_fld;
			}

			int var19;
			if (var20 < var21) {
				var19 = var8[var20];
			} else {
				var19 = 1524579060;
			}

			for (int var9 = 0; var9 < 10; var9++) {
				while (var9 == 0 && var19 > var16) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = 2122645245;
					}
				}

				while (var9 == 3 && var19 > var17) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1135126128;
					}
				}

				while (var9 == 5 && var19 > var18) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				int var10 = am_fld[var9];
				int[] var11 = ad_fld[var9];

				for (int var12 = 0; var12 < var10; var12++) {
					zp(this, var11[var12]);
				}
			}

			while (var19 != -1000) {
				zp(this, var22[var20++]);
				if (var20 == var21 && var22 != ad_fld[11]) {
					var20 = 0;
					var22 = ad_fld[11];
					var21 = am_fld[11];
					var8 = ab_fld;
				}

				if (var20 < var21) {
					var19 = var8[var20];
				} else {
					var19 = -1000;
				}
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void ba(boolean var1) {
		try {
			for (char var2 = 0; var2 < this.bw_fld; var2++) {
				if (!as_fld[var2]) {
					int var3 = (au_fld[this.ba_fld[var2]] + au_fld[this.bq_fld[var2]] + au_fld[this.bg_fld[var2]]) / 3 + this.cm_fld;
					char[] var10000 = aq_fld[var3];
					ai_fld[var3]++;
					var10000[ai_fld[var3]] = var2;
				}
			}

			if (this.cx_fld != null && var1) {
				this.bq();
			} else {
				for (int var8 = this.co_fld - 1; var8 >= 0; var8--) {
					char var9 = ai_fld[var8];
					if (var9 > 0) {
						char[] var4 = aq_fld[var8];

						for (int var5 = 0; var5 < var9; var5++) {
							zp(this, var4[var5]);
						}
					}
				}
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bq() {
		try {
			for (int var1 = 0; var1 < 12; var1++) {
				am_fld[var1] = 0;
				ap_fld[var1] = 0;
			}

			for (int var15 = this.co_fld - 1; var15 >= 0; var15--) {
				char var2 = ai_fld[var15];
				if (var2 > 0) {
					char[] var3 = aq_fld[var15];

					for (int var4 = 0; var4 < var2; var4++) {
						char var5 = var3[var4];
						byte var6 = this.cx_fld[var5];
						int var7 = am_fld[var6]++;
						ad_fld[var6][var7] = var5;
						if (var6 < 10) {
							ap_fld[var6] = ap_fld[var6] + var15;
						} else if (var6 == 10) {
							ao_fld[var7] = var15;
						} else {
							ab_fld[var7] = var15;
						}
					}
				}
			}

			int var16 = 0;
			if (am_fld[1] > 0 || am_fld[2] > 0) {
				var16 = (ap_fld[1] + ap_fld[2]) / (am_fld[1] + am_fld[2]);
			}

			int var17 = 0;
			if (am_fld[3] > 0 || am_fld[4] > 0) {
				var17 = (ap_fld[3] + ap_fld[4]) / (am_fld[3] + am_fld[4]);
			}

			int var18 = 0;
			if (am_fld[6] > 0 || am_fld[8] > 0) {
				var18 = (ap_fld[6] + ap_fld[8]) / (am_fld[6] + am_fld[8]);
			}

			int var20 = 0;
			int var21 = am_fld[10];
			int[] var22 = ad_fld[10];
			int[] var8 = ao_fld;
			if (var20 == var21) {
				var20 = 0;
				var21 = am_fld[11];
				var22 = ad_fld[11];
				var8 = ab_fld;
			}

			int var19;
			if (var20 < var21) {
				var19 = var8[var20];
			} else {
				var19 = -1000;
			}

			for (int var9 = 0; var9 < 10; var9++) {
				while (var9 == 0 && var19 > var16) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				while (var9 == 3 && var19 > var17) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				while (var9 == 5 && var19 > var18) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				int var10 = am_fld[var9];
				int[] var11 = ad_fld[var9];

				for (int var12 = 0; var12 < var10; var12++) {
					zp(this, var11[var12]);
				}
			}

			while (var19 != -1000) {
				zp(this, var22[var20++]);
				if (var20 == var21 && var22 != ad_fld[11]) {
					var20 = 0;
					var22 = ad_fld[11];
					var21 = am_fld[11];
					var8 = ab_fld;
				}

				if (var20 < var21) {
					var19 = var8[var20];
				} else {
					var19 = -1000;
				}
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bb(int var1) {
		return var1 < this.cl_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IFFFFFFFFFIII)V"
	)
	final void cd(
		int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13
	) {
		try {
			if (this.cf_fld != null && this.cf_fld[var1] != -1) {
				int var15;
				int var16;
				int var20;
				if (this.cq_fld != null && this.cq_fld[var1] != -1) {
					int var17 = this.cq_fld[var1] & 255;
					var20 = this.ce_fld[var17];
					var15 = this.cn_fld[var17];
					var16 = this.cr_fld[var17];
				} else {
					var20 = this.ba_fld[var1];
					var15 = this.bq_fld[var1];
					var16 = this.bg_fld[var1];
				}

				if (this.cc_fld[var1] == -1) {
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
						ax_fld[var20],
						ax_fld[var15],
						ax_fld[var16],
						an_fld[var20],
						an_fld[var15],
						an_fld[var16],
						aa_fld[var20],
						aa_fld[var15],
						aa_fld[var16],
						this.cf_fld[var1]
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
						ax_fld[var20],
						ax_fld[var15],
						ax_fld[var16],
						an_fld[var20],
						an_fld[var15],
						an_fld[var16],
						aa_fld[var20],
						aa_fld[var15],
						aa_fld[var16],
						this.cf_fld[var1]
					);
				}
			} else {
				boolean var14 = this.bb(var1);
				if (this.cc_fld[var1] == -1 && var14) {
					fc.aj(var2, var3, var4, var5, var6, var7, var8, var9, var10, bm_fld[this.bb_fld[var1]]);
				} else if (this.cc_fld[var1] == -1) {
					fc.ab(var2, var3, var4, var5, var6, var7, var8, var9, var10, bm_fld[this.bb_fld[var1]]);
				} else if (var14) {
					fc.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
				} else {
					fc.ao(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
				}
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("getBufferOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBufferOffset() {
		return this.pn_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void cc(int var1) {
		try {
			int var2 = fc.aw();
			int var3 = fc.ay();
			int var4 = 0;
			int var5 = this.ba_fld[var1];
			int var6 = this.bq_fld[var1];
			int var7 = this.bg_fld[var1];
			int var8 = aa_fld[var5];
			int var9 = aa_fld[var6];
			int var10 = aa_fld[var7];
			if (this.cv_fld == null) {
				fc.ar_fld.aj_fld = 0;
			} else {
				fc.ar_fld.aj_fld = this.cv_fld[var1] & 255;
			}

			if (var8 >= 50) {
				by_fld[var4] = (int)ar_fld[var5];
				bl_fld[var4] = (int)af_fld[var5];
				bo_fld[var4] = al_fld[var5];
				bx_fld[var4++] = this.bb_fld[var1];
			} else {
				int var11 = ax_fld[var5];
				int var12 = an_fld[var5];
				int var13 = this.bb_fld[var1];
				if (var10 >= 50) {
					int var14 = (50 - var8) * bd_fld[var10 - var8];
					by_fld[var4] = var2 + (var11 + ((ax_fld[var7] - var11) * var14 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var12 + ((an_fld[var7] - var12) * var14 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var13 + ((this.cc_fld[var1] - var13) * var14 >> 16);
				}

				if (var9 >= 50) {
					int var37 = (50 - var8) * bd_fld[var9 - var8];
					by_fld[var4] = var2 + (var11 + ((ax_fld[var6] - var11) * var37 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var12 + ((an_fld[var6] - var12) * var37 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var13 + ((this.cd_fld[var1] - var13) * var37 >> 16);
				}
			}

			if (var9 >= 50) {
				by_fld[var4] = (int)ar_fld[var6];
				bl_fld[var4] = (int)af_fld[var6];
				bo_fld[var4] = al_fld[var6];
				bx_fld[var4++] = this.cd_fld[var1];
			} else {
				int var28 = ax_fld[var6];
				int var31 = an_fld[var6];
				int var34 = this.cd_fld[var1];
				if (var8 >= 50) {
					int var38 = (50 - var9) * bd_fld[var8 - var9];
					by_fld[var4] = var2 + (var28 + ((ax_fld[var5] - var28) * var38 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var31 + ((an_fld[var5] - var31) * var38 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var34 + ((this.bb_fld[var1] - var34) * var38 >> 16);
				}

				if (var10 >= 50) {
					int var39 = (50 - var9) * bd_fld[var10 - var9];
					by_fld[var4] = var2 + (var28 + ((ax_fld[var7] - var28) * var39 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var31 + ((an_fld[var7] - var31) * var39 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var34 + ((this.cc_fld[var1] - var34) * var39 >> 16);
				}
			}

			if (var10 >= 50) {
				by_fld[var4] = (int)ar_fld[var7];
				bl_fld[var4] = (int)af_fld[var7];
				bo_fld[var4] = al_fld[var7];
				bx_fld[var4++] = this.cc_fld[var1];
			} else {
				int var29 = ax_fld[var7];
				int var32 = an_fld[var7];
				int var35 = this.cc_fld[var1];
				if (var9 >= 50) {
					int var40 = (50 - var10) * bd_fld[var9 - var10];
					by_fld[var4] = var2 + (var29 + ((ax_fld[var6] - var29) * var40 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var32 + ((an_fld[var6] - var32) * var40 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var35 + ((this.cd_fld[var1] - var35) * var40 >> 16);
				}

				if (var8 >= 50) {
					int var41 = (50 - var10) * bd_fld[var8 - var10];
					by_fld[var4] = var2 + (var29 + ((ax_fld[var5] - var29) * var41 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var32 + ((an_fld[var5] - var32) * var41 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var35 + ((this.bb_fld[var1] - var35) * var41 >> 16);
				}
			}

			int var30 = by_fld[0];
			int var33 = by_fld[1];
			int var36 = by_fld[2];
			int var42 = bl_fld[0];
			int var15 = bl_fld[1];
			int var16 = bl_fld[2];
			int var17 = this.cy_fld == null ? 0 : this.cy_fld[var1] * 2;
			float var18 = ap.av(bo_fld[0] - var17);
			float var19 = ap.av(bo_fld[1] - var17);
			float var20 = ap.av(bo_fld[2] - var17);
			fc.ar_fld.ax_fld = false;
			int var21 = fc.ax();
			if (var4 == 3) {
				if (var30 < 0 || var33 < 0 || var36 < 0 || var30 > var21 || var33 > var21 || var36 > var21) {
					fc.ar_fld.ax_fld = true;
				}

				this.cd(var1, var42, var15, var16, var30, var33, var36, var18, var19, var20, bx_fld[0], bx_fld[1], bx_fld[2]);
			}

			if (var4 == 4) {
				if (var30 < 0 || var33 < 0 || var36 < 0 || var30 > var21 || var33 > var21 || var36 > var21 || by_fld[3] < 0 || by_fld[3] > var21) {
					fc.ar_fld.ax_fld = true;
				}

				if (this.cf_fld != null && this.cf_fld[var1] != -1) {
					int var24;
					int var43;
					int var45;
					if (this.cq_fld != null && this.cq_fld[var1] != -1) {
						int var25 = this.cq_fld[var1] & 255;
						var43 = this.ce_fld[var25];
						var45 = this.cn_fld[var25];
						var24 = this.cr_fld[var25];
					} else {
						var43 = var5;
						var45 = var6;
						var24 = var7;
					}

					short var46 = this.cf_fld[var1];
					if (this.cc_fld[var1] == -1) {
						fc.ap(
							var42,
							var15,
							var16,
							var30,
							var33,
							var36,
							var18,
							var19,
							var20,
							this.bb_fld[var1],
							this.bb_fld[var1],
							this.bb_fld[var1],
							ax_fld[var43],
							ax_fld[var45],
							ax_fld[var24],
							an_fld[var43],
							an_fld[var45],
							an_fld[var24],
							aa_fld[var43],
							aa_fld[var45],
							aa_fld[var24],
							var46
						);
						fc.ap(
							var42,
							var16,
							bl_fld[3],
							var30,
							var36,
							by_fld[3],
							var18,
							var20,
							bo_fld[3],
							this.bb_fld[var1],
							this.bb_fld[var1],
							this.bb_fld[var1],
							ax_fld[var43],
							ax_fld[var45],
							ax_fld[var24],
							an_fld[var43],
							an_fld[var45],
							an_fld[var24],
							aa_fld[var43],
							aa_fld[var45],
							aa_fld[var24],
							var46
						);
					} else {
						fc.ap(
							var42,
							var15,
							var16,
							var30,
							var33,
							var36,
							var18,
							var19,
							var20,
							bx_fld[0],
							bx_fld[1],
							bx_fld[2],
							ax_fld[var43],
							ax_fld[var45],
							ax_fld[var24],
							an_fld[var43],
							an_fld[var45],
							an_fld[var24],
							aa_fld[var43],
							aa_fld[var45],
							aa_fld[var24],
							var46
						);
						fc.ap(
							var42,
							var16,
							bl_fld[3],
							var30,
							var36,
							by_fld[3],
							var18,
							var20,
							bo_fld[3],
							bx_fld[0],
							bx_fld[2],
							bx_fld[3],
							ax_fld[var43],
							ax_fld[var45],
							ax_fld[var24],
							an_fld[var43],
							an_fld[var45],
							an_fld[var24],
							aa_fld[var43],
							aa_fld[var45],
							aa_fld[var24],
							var46
						);
					}
				} else {
					boolean var22 = this.bb(var1);
					if (this.cc_fld[var1] == -1 && var22) {
						int var44 = bm_fld[this.bb_fld[var1]];
						fc.aj(var42, var15, var16, var30, var33, var36, var18, var19, var20, var44);
						fc.aj(var42, var16, bl_fld[3], var30, var36, by_fld[3], var18, var20, bo_fld[3], var44);
					} else if (this.cc_fld[var1] == -1) {
						int var23 = bm_fld[this.bb_fld[var1]];
						fc.ab(var42, var15, var16, var30, var33, var36, var18, var19, var20, var23);
						fc.ab(var42, var16, bl_fld[3], var30, var36, by_fld[3], var18, var20, bo_fld[3], var23);
					} else if (var22) {
						fc.ac(var42, var15, var16, var30, var33, var36, var18, var19, var20, bx_fld[0], bx_fld[1], bx_fld[2]);
						fc.ac(var42, var16, bl_fld[3], var30, var36, by_fld[3], var18, var20, bo_fld[3], bx_fld[0], bx_fld[2], bx_fld[3]);
					} else {
						fc.ao(var42, var15, var16, var30, var33, var36, var18, var19, var20, bx_fld[0], bx_fld[1], bx_fld[2]);
						fc.ao(var42, var16, bl_fld[3], var30, var36, by_fld[3], var18, var20, bo_fld[3], bx_fld[0], bx_fld[2], bx_fld[3]);
					}
				}
			}
		} catch (Throwable var27) {
			throw new RuntimeException(var27);
		}
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(ILuy;)V"
	)
	public void mt(int var1, uy var2) {
		this.cq(var1, var2);
	}

	@ObfuscatedName("getFaceTextures")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Override
	public short[] getFaceTextures() {
		return this.cf_fld;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void hw(fn var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var1 = 0; var1 < var0.cz_fld; var1++) {
				float var2 = var0.yk_fld[var1];
				var0.yk_fld[var1] = var0.qo_fld[var1];
				var0.qo_fld[var1] = -var2;
			}

			var0.bl();
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILuy;)V"
	)
	void cq(int var1, uy var2) {
		float var3 = this.yk_fld[var1];
		float var4 = -this.vr_fld[var1];
		float var5 = -this.qo_fld[var1];
		float var6 = 1.0F;
		this.yk_fld[var1] = var2.ja_fld * var3 + var2.hx_fld * var4 + var2.ki_fld * var5 + var2.kh_fld * var6;
		this.vr_fld[var1] = -(var2.bs_fld * var3 + var2.or_fld * var4 + var2.jj_fld * var5 + var2.my_fld * var6);
		this.qo_fld[var1] = -(var2.bp_fld * var3 + var2.rw_fld * var4 + var2.ih_fld * var5 + var2.xv_fld * var6);
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Lea;Lsp;I[ZZZ)V"
	)
	public void ez(ea var1, sp var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		ek var7 = var1.ag();
		if (var7 != null) {
			var7.ah(var2, var3, var4, var5);
			if (var6) {
				this.br(var7, sp.zf(var2, 1070255250));
			}
		}

		if (!var5 && var2.ah()) {
			this.bz(var2, var3);
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void dx(fn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.cz_fld; var1++) {
			int var2 = (int)var0.yk_fld[var1];
			var0.yk_fld[var1] = var0.qo_fld[var1];
			var0.qo_fld[var1] = -var2;
		}

		var0.dw();
	}

	@ObfuscatedName("getFaceBias")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] getFaceBias() {
		return this.cy_fld;
	}

	@ObfuscatedName("getVertexNormalsX")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getVertexNormalsX() {
		return this.dj_fld;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfy;S)V"
	)
	public static void cj(fn var0, fy var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 == null) {
			rl1.lx(var0);
		} else {
			if (var0.ch_fld == null) {
				var0.ch_fld = new fy();
			}

			var0.ch_fld.ae(var1);
			var0.cl_fld = var2;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bt(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			this.yk_fld[var4] = (int)this.yk_fld[var4] + var1;
			this.vr_fld[var4] = (int)this.vr_fld[var4] + var2;
			this.qo_fld[var4] = (int)this.qo_fld[var4] + var3;
		}

		this.dw();
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lfk;)V"
	)
	void cn(fk var1) {
		this.ct_fld = var1;
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mm(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		this.bu(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("getTexIndices2")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getTexIndices2() {
		return this.cn_fld;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mx(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		this.bu(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIJIIZ)V"
	)
	@Override
	void mj(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		this.bu(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	@Override
	void mo(int var1, uy var2, int var3, int var4, int var5, long var6) {
		if (fc.ar_fld.aa_fld != 1 || this.cv_fld != null) {
			if (this.ck_fld != 1) {
				this.eu();
			}

			this.af(var1);
			ul var8 = uv.ak();
			var8.ak_fld.ar(var1 * 0.0030679614F, 0.0F, 0.0F);
			tu.md(var8.az_fld, 1.0F, 1.0F, 1.0F, (byte)10);
			tu.md(var8.ag_fld, var3, var4, var5, (byte)80);
			uy var9 = kv.ak();
			var9.ax(var8);
			var9.al(var2);
			int var10 = (int)var9.ab(0.0F, 0.0F, 0.0F);
			boolean var11 = false;
			int var12 = var10 - this.cm_fld;
			boolean var13 = var12 <= 50 || this.cf_fld != null;
			boolean var14 = jv.az(var6);
			boolean var15 = false;
			if (var14 && rt.af()) {
				boolean var16 = ee.aq(this, var1, var3, var4, var5, var2, fc.aw(), fc.ay(), fc.au());
				if (var16) {
					if (this.cw_fld) {
						int var17 = mf.ad(this, var1, var3, var4, var5, var2, fc.aw(), fc.ay(), fc.au());
						var17 += 32;
						lw.ar(var6, var17);
					} else {
						var15 = true;
					}
				}
			}

			int var23 = fc.aw();
			int var25 = fc.ay();

			for (int var18 = 0; var18 < this.cz_fld; var18++) {
				float var19 = (int)this.yk_fld[var18];
				float var20 = (int)this.vr_fld[var18];
				float var21 = (int)this.qo_fld[var18];
				uy.vt(var9, var19, var20, var21, bz_fld, -449981689);
				var19 = bz_fld[0];
				var20 = bz_fld[1];
				var21 = bz_fld[2];
				var11 |= this.bn(var18, var19, var20, var21, var10, var23, var25, var13);
			}

			ul.ln(var8, (byte)-89);
			var9.az();

			try {
				this.fw(var11, var15, this.cw_fld, var6);
			} catch (Exception var22) {
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Z)Lfn;"
	)
	public static fn bk(fn var0, boolean var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (!var1 && bh_fld.length < var0.bw_fld) {
				bh_fld = new byte[var0.bw_fld + 100];
			}

			return var0.ar(var1, bs_fld, bh_fld);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)Lfm;"
	)
	public static fm vr(fn var0, int var1) {
		for (fm var2 = var0.cj_fld; var2 != null; var2 = var2.ay_fld) {
			if (var2.ak_fld == var1) {
				return var2;
			}
		}

		return null;
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lfy;S)V"
	)
	public void gj(fy var1, short var2) {
		if (var1 == null) {
			rl1.lx(this);
		} else {
			if (this.ch_fld == null) {
				this.ch_fld = new fy();
			}

			this.ch_fld.ae(var1);
			this.cl_fld = var2;
		}
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIIIIJ)V"
	)
	public static void qo(fn var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7) {
		if (fc.ar_fld.aa_fld != 1 || var0.cv_fld != null) {
			int var9 = fc.ah_fld[var2];
			int var10 = fc.aw_fld[var2];
			int var11 = fc.ah_fld[var3];
			int var12 = fc.aw_fld[var3];
			float var13 = fc.ay_fld[var2];
			float var14 = fc.as_fld[var2];
			float var15 = fc.ay_fld[var3];
			float var16 = fc.as_fld[var3];
			if (var0.ck_fld != 1) {
				var0.eu();
			}

			var0.af(var1);
			int var17 = var6 * var12 - var4 * var11 >> 16;
			int var18 = var5 * var9 + var17 * var10 >> 16;
			int var19 = var0.bi_fld * var10 >> 16;
			int var20 = var18 + var19;
			if (var20 > 1221926920 && var18 < fh.az()) {
				int var21 = var6 * var11 + var4 * var12 >> 16;
				int var22 = (var21 - var0.bi_fld) * fc.au();
				if (var22 / var20 < fc.ar()) {
					int var23 = (var21 + var0.bi_fld) * fc.au();
					if (var23 / var20 > fc.as()) {
						int var24 = var5 * var10 - var17 * var9 >> 16;
						int var25 = var0.bi_fld * var9 >> 16;
						int var26 = var25 + (var0.cp_fld * var10 >> 16);
						int var27 = (var24 + var26) * fc.au();
						if (var27 / var20 > fc.al()) {
							int var28 = var25 + (var0.ez_fld * var10 >> 16);
							int var29 = (var24 - var28) * fc.au();
							if (var29 / var20 < fc.af()) {
								int var30 = var19 + (var0.ez_fld * var9 >> 16);
								boolean var31 = false;
								boolean var32 = false;
								if (var18 - var30 <= 50) {
									var32 = true;
								}

								boolean var33 = var32 || var0.cf_fld != null;
								int var34 = bx.al();
								int var35 = vh.au((byte)100);
								boolean var36 = rt.af();
								boolean var37 = jv.az(var7);
								boolean var38 = false;
								if (var37 && var36) {
									boolean var39 = false;
									if (at_fld) {
										var39 = qa.ai(var0, var1, var4, var5, var6, var13, var14, var15, var16, fc.aw(), fc.ay(), fc.au());
									} else {
										int var40 = var18 - var19;
										if (var40 <= -1900274231) {
											var40 = 830665391;
										}

										if (var21 > 0) {
											var22 /= var20;
											var23 /= var40;
										} else {
											var23 /= var20;
											var22 /= var40;
										}

										if (var24 > 0) {
											var29 /= var20;
											var27 /= var40;
										} else {
											var27 /= var20;
											var29 /= var40;
										}

										int var41 = var34 - fc.aw();
										int var42 = var35 - fc.ay();
										if (var41 > var22 && var41 < var23 && var42 > var29 && var42 < var27) {
											var39 = true;
										}
									}

									if (var39) {
										if (var0.cw_fld) {
											int var57 = fc.aw();
											int var43 = fc.ay();
											int var44 = fc.au();
											en.ax(var13, var14, var15, var16, var57, var43, var44);
											int var54 = bc.ao(var4, var5, var6, bc.bl_fld, ch.bx_fld, ee.bo_fld * -619932386, dc.bp_fld, bu.bt_fld, hg.bv_fld * -1160816069, ff(var0, var1));
											int var45 = var54 + 32;
											lw.ar(var7, var45);
										} else {
											var38 = true;
										}
									}
								}

								int var53 = fc.aw();
								int var55 = fc.ay();
								float var56 = 0.0F;
								float var58 = 0.0F;
								if (var1 != 0) {
									var56 = fc.ay_fld[var1];
									var58 = fc.as_fld[var1];
								}

								for (int var59 = 0; var59 < var0.cz_fld; var59++) {
									float var60 = (int)var0.yk_fld[var59];
									float var63 = (int)var0.vr_fld[var59];
									float var46 = (int)var0.qo_fld[var59];
									if (var1 != 0) {
										float var47 = var46 * var56 + var60 * var58;
										var46 = var46 * var58 - var60 * var56;
										var60 = var47;
									}

									var60 += var4;
									var63 += var5;
									var46 += var6;
									float var68 = var46 * var15 + var60 * var16;
									var46 = var46 * var16 - var60 * var15;
									float var69 = var63 * var14 - var46 * var13;
									var46 = var63 * var13 + var46 * var14;
									var31 |= var0.bn(var59, var68, var69, var46, var18, var53, var55, var33);
								}

								try {
									var0.fw(var31, var38, var0.cw_fld, var7);
								} catch (Exception var48) {
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	@Override
	void mf(int var1, uy var2, int var3, int var4, int var5, long var6) {
		if (fc.ar_fld.aa_fld != 1 || this.cv_fld != null) {
			if (this.ck_fld != 1) {
				this.eu();
			}

			this.af(var1);
			ul var8 = uv.ak();
			var8.ak_fld.ar(var1 * 0.0030679614F, 0.0F, 0.0F);
			tu.md(var8.az_fld, 1.0F, 1.0F, 1.0F, (byte)-96);
			tu.md(var8.ag_fld, var3, var4, var5, (byte)41);
			uy var9 = kv.ak();
			var9.ax(var8);
			var9.al(var2);
			int var10 = (int)var9.ab(0.0F, 0.0F, 0.0F);
			boolean var11 = false;
			int var12 = var10 - this.cm_fld;
			boolean var13 = var12 <= 50 || this.cf_fld != null;
			boolean var14 = jv.az(var6);
			boolean var15 = false;
			if (var14 && rt.af()) {
				boolean var16 = ee.aq(this, var1, var3, var4, var5, var2, fc.aw(), fc.ay(), fc.au());
				if (var16) {
					if (this.cw_fld) {
						int var17 = mf.ad(this, var1, var3, var4, var5, var2, fc.aw(), fc.ay(), fc.au());
						var17 += 32;
						lw.ar(var6, var17);
					} else {
						var15 = true;
					}
				}
			}

			int var23 = fc.aw();
			int var25 = fc.ay();

			for (int var18 = 0; var18 < this.cz_fld; var18++) {
				float var19 = (int)this.yk_fld[var18];
				float var20 = (int)this.vr_fld[var18];
				float var21 = (int)this.qo_fld[var18];
				uy.vt(var9, var19, var20, var21, bz_fld, -1190106168);
				var19 = bz_fld[0];
				var20 = bz_fld[1];
				var21 = bz_fld[2];
				var11 |= this.bn(var18, var19, var20, var21, var10, var23, var25, var13);
			}

			ul.ln(var8, (byte)-54);
			var9.az();

			try {
				this.fw(var11, var15, this.cw_fld, var6);
			} catch (Exception var22) {
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public final void bi(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.ck_fld != 2) {
			this.at();
		}

		int var9 = fc.aw();
		int var10 = fc.ay();
		int var11 = ac_fld[var1];
		int var12 = aj_fld[var1];
		int var13 = ac_fld[var2];
		int var14 = aj_fld[var2];
		int var15 = ac_fld[var3];
		int var16 = aj_fld[var3];
		int var17 = ac_fld[var4];
		int var18 = aj_fld[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < this.cz_fld; var20++) {
			int var21 = (int)this.yk_fld[var20];
			int var22 = (int)this.vr_fld[var20];
			int var23 = (int)this.qo_fld[var20];
			if (var3 != 0) {
				int var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				int var30 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var30;
			}

			if (var2 != 0) {
				int var31 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var31;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			int var32 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			au_fld[var20] = var23 - var19;
			ar_fld[var20] = var9 + var21 * fc.au() / var8;
			af_fld[var20] = var10 + var32 * fc.au() / var8;
			al_fld[var20] = var8;
			if (this.cf_fld != null) {
				ax_fld[var20] = var21;
				an_fld[var20] = var32;
				aa_fld[var20] = var23;
			}
		}

		try {
			this.fw(false, false, false, 0L);
		} catch (Exception var25) {
		}
	}

	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IFFFIIIZ)Z"
	)
	public static boolean ua(fn var0, int var1, float var2, float var3, float var4, int var5, int var6, int var7, boolean var8) {
		if (var0 == null) {
			var0.getClass();
		}

		au_fld[var1] = (int)var4 - var5;
		if (var8) {
			ax_fld[var1] = (int)var2;
			an_fld[var1] = (int)var3;
			aa_fld[var1] = (int)var4;
		}

		if (var4 >= 50.0F) {
			ar_fld[var1] = var6 + var2 * fc.au() / var4;
			af_fld[var1] = var7 + var3 * fc.au() / var4;
			al_fld[var1] = var4;
			return false;
		} else {
			ar_fld[var1] = -5000.0F;
			return true;
		}
	}

	@ObfuscatedName("getFaceColors3")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getFaceColors3() {
		return this.cc_fld;
	}

	@ObfuscatedName("getFaceIndices2")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getFaceIndices2() {
		return this.bq_fld;
	}

	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IFFFFFFFFFIII)V"
	)
	public static void uh(
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
		try {
			if (var0.cf_fld != null && var0.cf_fld[var1] != -1) {
				int var15;
				int var16;
				int var20;
				if (var0.cq_fld != null && var0.cq_fld[var1] != -1) {
					int var17 = var0.cq_fld[var1] & 255;
					var20 = var0.ce_fld[var17];
					var15 = var0.cn_fld[var17];
					var16 = var0.cr_fld[var17];
				} else {
					var20 = var0.ba_fld[var1];
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
						ax_fld[var20],
						ax_fld[var15],
						ax_fld[var16],
						an_fld[var20],
						an_fld[var15],
						an_fld[var16],
						aa_fld[var20],
						aa_fld[var15],
						aa_fld[var16],
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
						ax_fld[var20],
						ax_fld[var15],
						ax_fld[var16],
						an_fld[var20],
						an_fld[var15],
						an_fld[var16],
						aa_fld[var20],
						aa_fld[var15],
						aa_fld[var16],
						var0.cf_fld[var1]
					);
				}
			} else {
				boolean var14 = var0.bb(var1);
				if (var0.cc_fld[var1] == -1 && var14) {
					fc.aj(var2, var3, var4, var5, var6, var7, var8, var9, var10, bm_fld[var0.bb_fld[var1]]);
				} else if (var0.cc_fld[var1] == -1) {
					fc.ab(var2, var3, var4, var5, var6, var7, var8, var9, var10, bm_fld[var0.bb_fld[var1]]);
				} else if (var14) {
					fc.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
				} else {
					fc.ao(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
				}
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void uk(fn var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var1 = 0; var1 < var0.cz_fld; var1++) {
				int var2 = (int)var0.yk_fld[var1];
				var0.yk_fld[var1] = var0.qo_fld[var1];
				var0.qo_fld[var1] = -var2;
			}

			var0.dw();
		}
	}

	@ObfuscatedName("getUnlitFaceColors")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Override
	public short[] getUnlitFaceColors() {
		return this.el_fld;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Z)Lfn;"
	)
	public static fn fb(fn var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var1 && be_fld.length < var0.bw_fld) {
			be_fld = new byte[var0.bw_fld + 1748296602];
		}

		return var0.ar(var1, br_fld, be_fld);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fp(int var1, int var2, int var3) {
		if ((client.jb_fld & 64) != 0) {
			this.el_fld = new short[var2];
		}
	}

	@ObfuscatedName("getUvBufferOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getUvBufferOffset() {
		return this.oq_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Lek;I)V"
	)
	public void bm(rl21 var1, ek var2, int var3) {
		if (this.ca_fld != null) {
			for (int var4 = 0; var4 < this.cz_fld; var4++) {
				int[] var5 = this.ca_fld[var4];
				if (var5 != null && var5.length != 0) {
					int[] var6 = this.cg_fld[var4];
					var1.gv_fld.bu();

					for (int var7 = 0; var7 < var5.length; var7++) {
						int var8 = var5[var7];
						si var9 = var2.al(var8);
						if (var9 != null) {
							float var10 = var6[var7] / 255.0F;
							var1.ze_fld.lh(var10, var10, var10);
							var1.kn_fld.bz_void(var9.is(var1, var3));
							var1.kn_fld.sa(var1.ze_fld);
							var1.gv_fld.wi(var1.kn_fld);
						}
					}

					this.mt(var4, var1.gv_fld);
				}
			}
		}
	}

	@ObfuscatedName("drawFrustum")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	@Override
	public void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.bv(var1, var2, var3, var4, var5, var6, var7);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void cg(int var1, int var2, int var3) {
		this.yk_fld = new float[var1];
		this.vr_fld = new float[var1];
		this.qo_fld = new float[var1];
		this.ba_fld = new int[var2];
		this.bq_fld = new int[var2];
		this.bg_fld = new int[var2];
		this.bb_fld = new int[var2];
		this.cd_fld = new int[var2];
		this.cc_fld = new int[var2];
		if (var3 > 0) {
			this.ce_fld = new int[var3];
			this.cn_fld = new int[var3];
			this.cr_fld = new int[var3];
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ak(int var1, int var2, int var3) {
		this.yk_fld = new float[var1];
		this.vr_fld = new float[var1];
		this.qo_fld = new float[var1];
		this.ba_fld = new int[var2];
		this.bq_fld = new int[var2];
		this.bg_fld = new int[var2];
		this.bb_fld = new int[var2];
		this.cd_fld = new int[var2];
		this.cc_fld = new int[var2];
		if (var3 > 0) {
			this.ce_fld = new int[var3];
			this.cn_fld = new int[var3];
			this.cr_fld = new int[var3];
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	void cz(fn var1) {
		int var2 = this.ba_fld.length;
		if (this.cx_fld == null && (var1.cx_fld != null || this.cs_fld != var1.cs_fld)) {
			this.cx_fld = new byte[var2];
			Arrays.fill(this.cx_fld, this.cs_fld);
		}

		if (this.cv_fld == null && var1.cv_fld != null) {
			this.cv_fld = new byte[var2];
			Arrays.fill(this.cv_fld, (byte)0);
		}

		if (this.cf_fld == null && var1.cf_fld != null) {
			this.cf_fld = new short[var2];
			Arrays.fill(this.cf_fld, (short)-1);
		}

		if (this.cq_fld == null && var1.cq_fld != null) {
			this.cq_fld = new byte[var2];
			Arrays.fill(this.cq_fld, (byte)-1);
		}

		if (this.cy_fld == null && var1.cy_fld != null) {
			this.cy_fld = new byte[var2];
			Arrays.fill(this.cy_fld, (byte)0);
		}
	}

	@ObfuscatedName("getVerticesY")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	@Override
	public float[] getVerticesY() {
		return this.vr_fld;
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public final void fk(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.ck_fld != 2) {
			this.at();
		}

		int var9 = fc.aw();
		int var10 = fc.ay();
		int var11 = ac_fld[var1];
		int var12 = aj_fld[var1];
		int var13 = ac_fld[var2];
		int var14 = aj_fld[var2];
		int var15 = ac_fld[var3];
		int var16 = aj_fld[var3];
		int var17 = ac_fld[var4];
		int var18 = aj_fld[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < this.cz_fld; var20++) {
			int var21 = (int)this.yk_fld[var20];
			int var22 = (int)this.vr_fld[var20];
			int var23 = (int)this.qo_fld[var20];
			if (var3 != 0) {
				int var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				int var30 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var30;
			}

			if (var2 != 0) {
				int var31 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var31;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			int var32 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			au_fld[var20] = var23 - var19;
			ar_fld[var20] = var9 + var21 * fc.au() / var8;
			af_fld[var20] = var10 + var32 * fc.au() / var8;
			al_fld[var20] = var8;
			if (this.cf_fld != null) {
				ax_fld[var20] = var21;
				an_fld[var20] = var32;
				aa_fld[var20] = var23;
			}
		}

		try {
			this.fw(false, false, false, 0L);
		} catch (Exception var25) {
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	void ck(fn var1) {
		int var2 = this.ba_fld.length;
		if (this.cx_fld == null && (var1.cx_fld != null || this.cs_fld != var1.cs_fld)) {
			this.cx_fld = new byte[var2];
			Arrays.fill(this.cx_fld, this.cs_fld);
		}

		if (this.cv_fld == null && var1.cv_fld != null) {
			this.cv_fld = new byte[var2];
			Arrays.fill(this.cv_fld, (byte)0);
		}

		if (this.cf_fld == null && var1.cf_fld != null) {
			this.cf_fld = new short[var2];
			Arrays.fill(this.cf_fld, (short)-1);
		}

		if (this.cq_fld == null && var1.cq_fld != null) {
			this.cq_fld = new byte[var2];
			Arrays.fill(this.cq_fld, (byte)-1);
		}

		if (this.cy_fld == null && var1.cy_fld != null) {
			this.cy_fld = new byte[var2];
			Arrays.fill(this.cy_fld, (byte)0);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	void co(fn var1) {
		if (var1 != null) {
			this.ag(var1);

			for (int var2 = 0; var2 < var1.bw_fld; var2++) {
				this.ba_fld[this.bw_fld] = var1.ba_fld[var2] + this.cz_fld;
				this.bq_fld[this.bw_fld] = var1.bq_fld[var2] + this.cz_fld;
				this.bg_fld[this.bw_fld] = var1.bg_fld[var2] + this.cz_fld;
				this.bb_fld[this.bw_fld] = var1.bb_fld[var2];
				this.cd_fld[this.bw_fld] = var1.cd_fld[var2];
				this.cc_fld[this.bw_fld] = var1.cc_fld[var2];
				if (this.cx_fld != null) {
					this.cx_fld[this.bw_fld] = var1.cx_fld != null ? var1.cx_fld[var2] : var1.cs_fld;
				}

				if (this.cv_fld != null && var1.cv_fld != null) {
					this.cv_fld[this.bw_fld] = var1.cv_fld[var2];
				}

				if (this.cf_fld != null) {
					this.cf_fld[this.bw_fld] = var1.cf_fld != null ? var1.cf_fld[var2] : -1;
				}

				if (this.cq_fld != null) {
					if (var1.cq_fld != null && var1.cq_fld[var2] != -1) {
						this.cq_fld[this.bw_fld] = (byte)(var1.cq_fld[var2] + this.cb_fld);
					} else {
						this.cq_fld[this.bw_fld] = -1;
					}
				}

				if (this.cy_fld != null && var1.cy_fld != null) {
					this.cy_fld[this.bw_fld] = var1.cy_fld[var2];
				}

				this.bw_fld++;
			}

			for (int var3 = 0; var3 < var1.cb_fld; var3++) {
				this.ce_fld[this.cb_fld] = var1.ce_fld[var3] + this.cz_fld;
				this.cn_fld[this.cb_fld] = var1.cn_fld[var3] + this.cz_fld;
				this.cr_fld[this.cb_fld] = var1.cr_fld[var3] + this.cz_fld;
				this.cb_fld++;
			}

			for (int var4 = 0; var4 < var1.cz_fld; var4++) {
				this.yk_fld[this.cz_fld] = var1.yk_fld[var4];
				this.vr_fld[this.cz_fld] = var1.vr_fld[var4];
				this.qo_fld[this.cz_fld] = var1.qo_fld[var4];
				this.cz_fld++;
			}
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V"
	)
	public void dy(fe var1, int var2) {
		if (this.cu_fld != null) {
			if (var2 != -1) {
				eq var3 = var1.ak_fld[var2];
				ea var4 = var3.ae_fld;
				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;

				for (int var5 = 0; var5 < var3.ah_fld; var5++) {
					int var6 = var3.aw_fld[var5];
					this.ei(var4.aw_fld[var6], var4.ay_fld[var6], var3.ay_fld[var5], var3.as_fld[var5], var3.ar_fld[var5]);
				}

				this.dw();
			}
		}
	}

	@ObfuscatedName("getVerticesCount")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getVerticesCount() {
		return this.cz_fld;
	}

	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	public void ur(sp var1, int var2) {
		this.bz(var1, var2);
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn rotateY180Ccw() {
		this.em();
		return this;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Z)Lfn;"
	)
	public fn as(boolean var1) {
		if (!var1 && bh_fld.length < this.bw_fld) {
			bh_fld = new byte[this.bw_fld + 100];
		}

		return this.ar(var1, bs_fld, bh_fld);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lfn;"
	)
	public fn cj(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.eu();
		int var7 = var2 - this.bi_fld;
		int var8 = var2 + this.bi_fld;
		int var9 = var4 - this.bi_fld;
		int var10 = var4 + this.bi_fld;
		if (var7 >= 0 && var8 + 2100264299 >> 7 < var1.length && var9 >= 0 && var10 + 1258048409 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				fn var11;
				if (var5) {
					var11 = new fn(this);
					var11.vr_fld = new float[var11.cz_fld];
				} else {
					var11 = this;
				}

				if (var6 == 0) {
					for (int var12 = 0; var12 < var11.cz_fld; var12++) {
						int var13 = (int)this.yk_fld[var12] + var2;
						int var14 = (int)this.qo_fld[var12] + var4;
						int var15 = var13 & 1556947140;
						int var16 = var14 & 1913570148;
						int var17 = var13 >> 7;
						int var18 = var14 >> 7;
						int var19 = var1[var17][var18] * (-1552582421 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.vr_fld[var12] = (int)this.vr_fld[var12] + var21 - var3;
					}
				} else {
					for (int var27 = 0; var27 < var11.cz_fld; var27++) {
						int var28 = (-((int)this.vr_fld[var27]) << 16) / this.ez_fld;
						if (var28 < var6) {
							int var29 = (int)this.yk_fld[var27] + var2;
							int var30 = (int)this.qo_fld[var27] + var4;
							int var31 = var29 & 127;
							int var32 = var30 & 127;
							int var33 = var29 >> 7;
							int var34 = var30 >> 7;
							int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
							int var36 = var1[var33][var34 + 1] * (-1391655980 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
							int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
							var11.vr_fld[var27] = (int)this.vr_fld[var27] + (var22 - var3) * (var6 - var28) / var6;
						} else {
							var11.vr_fld[var27] = this.vr_fld[var27];
						}
					}
				}

				var11.dw();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfy;S)V"
	)
	public static void li(fn var0, fy var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		} else if (var1 == null) {
			rl1.lx(var0);
		} else {
			if (var0.ch_fld == null) {
				var0.ch_fld = new fy();
			}

			var0.ch_fld.ae(var1);
			var0.cl_fld = var2;
		}
	}

	@ObfuscatedName("getVerticesX")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	@Override
	public float[] getVerticesX() {
		return this.yk_fld;
	}

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void wj(fn var0) {
		if (var0.ck_fld != 1) {
			var0.ck_fld = 1;
			var0.ez_fld = 0;
			var0.cp_fld = 0;
			var0.bi_fld = 0;

			for (int var1 = 0; var1 < var0.cz_fld; var1++) {
				int var2 = (int)var0.yk_fld[var1];
				int var3 = (int)var0.vr_fld[var1];
				int var4 = (int)var0.qo_fld[var1];
				if (-var3 > var0.ez_fld) {
					var0.ez_fld = -var3;
				}

				if (var3 > var0.cp_fld) {
					var0.cp_fld = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > var0.bi_fld) {
					var0.bi_fld = var5;
				}
			}

			var0.bi_fld = (int)(Math.sqrt(var0.bi_fld) + 0.99);
			var0.cm_fld = (int)(Math.sqrt(var0.bi_fld * var0.bi_fld + var0.ez_fld * var0.ez_fld) + 0.99);
			var0.co_fld = var0.cm_fld + (int)(Math.sqrt(var0.bi_fld * var0.bi_fld + var0.cp_fld * var0.cp_fld) + 0.99);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Z)Lfn;"
	)
	public fn ch(boolean var1) {
		if (!var1 && be_fld.length < this.bw_fld) {
			be_fld = new byte[this.bw_fld + -37147096];
		}

		return this.ar(var1, br_fld, be_fld);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int du() {
		this.eu();
		return this.bi_fld;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I[IIII)V"
	)
	public void kf(int var1, int[] var2, int var3, int var4, int var5) {
		this.ei(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Lfn;ILuy;)V"
	)
	public static void dk(fn var0, int var1, uy var2) {
		if (var0 == null) {
			var0.getClass();
		}

		float var3 = (int)var0.yk_fld[var1];
		float var4 = -((int)var0.vr_fld[var1]);
		float var5 = -((int)var0.qo_fld[var1]);
		float var6 = 1.0F;
		var0.yk_fld[var1] = var2.ja_fld * var3 + var2.hx_fld * var4 + var2.ki_fld * var5 + var2.kh_fld * var6;
		var0.vr_fld[var1] = -((int)(var2.bs_fld * var3 + var2.or_fld * var4 + var2.jj_fld * var5 + var2.my_fld * var6));
		var0.qo_fld[var1] = -((int)(var2.bp_fld * var3 + var2.rw_fld * var4 + var2.ih_fld * var5 + var2.xv_fld * var6));
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(ZZZJ)V"
	)
	final void fl(boolean var1, boolean var2, boolean var3, long var4) {
		try {
			if (this.co_fld < 6000) {
				for (int var6 = 0; var6 < this.co_fld; var6++) {
					ai_fld[var6] = 0;
				}

				int var33 = var3 ? 20 : 5;
				int var7 = fc.ax();

				for (int var8 = 0; var8 < this.bw_fld; var8++) {
					if (this.cc_fld[var8] == -2) {
						as_fld[var8] = true;
					} else {
						if (this.ct_fld != fk.az_fld) {
							if (fc.ar_fld.aa_fld == 1 && (this.cv_fld == null || this.cv_fld[var8] == 0)) {
								as_fld[var8] = true;
								continue;
							}

							if (fc.ar_fld.aa_fld == 0 && this.cv_fld != null && this.cv_fld[var8] != 0) {
								as_fld[var8] = true;
								continue;
							}
						}

						int var9 = this.ba_fld[var8];
						int var10 = this.bq_fld[var8];
						int var11 = this.bg_fld[var8];
						float var12 = ar_fld[var9];
						float var13 = ar_fld[var10];
						float var14 = ar_fld[var11];
						ay_fld[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
						if (ay_fld[var8]) {
							int var15 = ax_fld[var9];
							int var16 = ax_fld[var10];
							int var17 = ax_fld[var11];
							int var18 = an_fld[var9];
							int var19 = an_fld[var10];
							int var20 = an_fld[var11];
							int var21 = aa_fld[var9];
							int var22 = aa_fld[var10];
							int var23 = aa_fld[var11];
							var15 -= var16;
							var17 -= var16;
							var18 -= var19;
							var20 -= var19;
							var21 -= var22;
							var23 -= var22;
							int var24 = var18 * var23 - var21 * var20;
							int var25 = var21 * var17 - var15 * var23;
							int var26 = var15 * var20 - var18 * var17;
							as_fld[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
						} else {
							as_fld[var8] = (var12 - var13) * (af_fld[var11] - af_fld[var10]) - (af_fld[var9] - af_fld[var10]) * (var14 - var13) <= 0.0F;
							aw_fld[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
							if (var2) {
								int var39 = (int)af_fld[var9];
								int var41 = (int)af_fld[var10];
								int var43 = (int)af_fld[var11];
								int var44 = (int)var12;
								int var46 = (int)var13;
								int var48 = (int)var14;
								int var49 = ej.bh_fld + var33;
								boolean var38;
								if (var49 < var39 && var49 < var41 && var49 < var43) {
									var38 = false;
								} else {
									var49 = ej.bh_fld - var33;
									if (var49 > var39 && var49 > var41 && var49 > var43) {
										var38 = false;
									} else {
										var49 = var33 + ej.bs_fld;
										if (var49 < var44 && var49 < var46 && var49 < var48) {
											var38 = false;
										} else {
											var49 = ej.bs_fld - var33;
											if (var49 > var44 && var49 > var46 && var49 > var48) {
												var38 = false;
											} else {
												var38 = true;
											}
										}
									}
								}

								if (var38) {
									var49 = (int)(al_fld[var9] + al_fld[var10] + al_fld[var11]) / 3;
									lw.ar(var4, var49);
								}
							}
						}
					}
				}

				short var34 = this.cl_fld;
				boolean var35 = false;
				if (fc.ar_fld.au_fld.av()) {
					this.cl_fld = (short)this.bw_fld;
				} else if (this.ch_fld != null && this.ch_fld.av()) {
					fc.ar_fld.au_fld.ae(this.ch_fld);
					var35 = true;
				}

				try {
					if (!fc.an()) {
						this.ba(true);
					} else {
						fk var36 = this.ct_fld;
						if (var36 == fk.ak_fld) {
							if (fc.ar_fld.aa_fld != 0 && this.cv_fld != null) {
								var36 = fk.ag_fld;
							} else {
								var36 = fk.av_fld;
							}
						}

						switch (var36.ah_fld) {
							case 1:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								this.ba(false);
								break;
							case 2:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = 0;
								this.ba(true);
								fc.ar_fld.ap_fld = 0;
								fc.ar_fld.ad_fld = -1;
								this.ba(true);
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								break;
							case 3:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								zg(this);
								break;
							case 4:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = 0;
								zg(this);
						}
					}
				} finally {
					this.cl_fld = var34;
					if (var35) {
						fc.ar_fld.au_fld.ar();
					}
				}
			}
		} catch (Throwable var32) {
			throw new RuntimeException(var32);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(ZLfn;[B)Lfn;"
	)
	fn dh(boolean var1, fn var2, byte[] var3) {
		var2.cz_fld = this.cz_fld;
		var2.bw_fld = this.bw_fld;
		var2.cb_fld = this.cb_fld;
		if (var2.yk_fld == null || var2.yk_fld.length < this.cz_fld) {
			var2.yk_fld = new float[this.cz_fld + 100];
			var2.vr_fld = new float[this.cz_fld + -1624173973];
			var2.qo_fld = new float[this.cz_fld + 1473246213];
		}

		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			var2.yk_fld[var4] = this.yk_fld[var4];
			var2.vr_fld[var4] = this.vr_fld[var4];
			var2.qo_fld[var4] = this.qo_fld[var4];
		}

		if (var1) {
			var2.cv_fld = this.cv_fld;
		} else {
			var2.cv_fld = var3;
			if (this.cv_fld == null) {
				for (int var5 = 0; var5 < this.bw_fld; var5++) {
					var2.cv_fld[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.bw_fld; var6++) {
					var2.cv_fld[var6] = this.cv_fld[var6];
				}
			}
		}

		var2.ba_fld = this.ba_fld;
		var2.bq_fld = this.bq_fld;
		var2.bg_fld = this.bg_fld;
		var2.bb_fld = this.bb_fld;
		var2.cd_fld = this.cd_fld;
		var2.cc_fld = this.cc_fld;
		var2.cx_fld = this.cx_fld;
		var2.cq_fld = this.cq_fld;
		var2.cf_fld = this.cf_fld;
		var2.cy_fld = this.cy_fld;
		var2.cs_fld = this.cs_fld;
		var2.ce_fld = this.ce_fld;
		var2.cn_fld = this.cn_fld;
		var2.cr_fld = this.cr_fld;
		var2.cu_fld = this.cu_fld;
		var2.ci_fld = this.ci_fld;
		var2.ca_fld = this.ca_fld;
		var2.cg_fld = this.cg_fld;
		var2.cw_fld = this.cw_fld;
		var2.ch_fld = this.ch_fld;
		var2.cl_fld = this.cl_fld;
		var2.dw();
		return var2;
	}

	@ObfuscatedName("getBottomY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getBottomY() {
		return this.cp_fld;
	}

	@ObfuscatedName("calculateBoundsCylinder")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void calculateBoundsCylinder() {
		this.eu();
	}

	@ObfuscatedName("getFaceTransparencies")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] getFaceTransparencies() {
		return this.cv_fld;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(ZLfn;[B)Lfn;"
	)
	fn dv(boolean var1, fn var2, byte[] var3) {
		var2.cz_fld = this.cz_fld;
		var2.bw_fld = this.bw_fld;
		var2.cb_fld = this.cb_fld;
		if (var2.yk_fld == null || var2.yk_fld.length < this.cz_fld) {
			var2.yk_fld = new float[this.cz_fld + -170519589];
			var2.vr_fld = new float[this.cz_fld + -491758488];
			var2.qo_fld = new float[this.cz_fld + 100];
		}

		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			var2.yk_fld[var4] = this.yk_fld[var4];
			var2.vr_fld[var4] = this.vr_fld[var4];
			var2.qo_fld[var4] = this.qo_fld[var4];
		}

		if (var1) {
			var2.cv_fld = this.cv_fld;
		} else {
			var2.cv_fld = var3;
			if (this.cv_fld == null) {
				for (int var5 = 0; var5 < this.bw_fld; var5++) {
					var2.cv_fld[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.bw_fld; var6++) {
					var2.cv_fld[var6] = this.cv_fld[var6];
				}
			}
		}

		var2.ba_fld = this.ba_fld;
		var2.bq_fld = this.bq_fld;
		var2.bg_fld = this.bg_fld;
		var2.bb_fld = this.bb_fld;
		var2.cd_fld = this.cd_fld;
		var2.cc_fld = this.cc_fld;
		var2.cx_fld = this.cx_fld;
		var2.cq_fld = this.cq_fld;
		var2.cf_fld = this.cf_fld;
		var2.cy_fld = this.cy_fld;
		var2.cs_fld = this.cs_fld;
		var2.ce_fld = this.ce_fld;
		var2.cn_fld = this.cn_fld;
		var2.cr_fld = this.cr_fld;
		var2.cu_fld = this.cu_fld;
		var2.ci_fld = this.ci_fld;
		var2.ca_fld = this.ca_fld;
		var2.cg_fld = this.cg_fld;
		var2.cw_fld = this.cw_fld;
		var2.ch_fld = this.ch_fld;
		var2.cl_fld = this.cl_fld;
		var2.dw();
		return var2;
	}

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(Lfn;III)V"
	)
	public static void xi(fn var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var4 = 0; var4 < var0.cz_fld; var4++) {
				var0.yk_fld[var4] = (int)var0.yk_fld[var4] + var1;
				var0.vr_fld[var4] = (int)var0.vr_fld[var4] + var2;
				var0.qo_fld[var4] = (int)var0.qo_fld[var4] + var3;
			}

			var0.dw();
		}
	}

	@ObfuscatedName("setSceneId")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setSceneId(int var1) {
		this.ib_fld = var1;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dz(int var1) {
		fm var2 = ff(this, var1);
		if (var2 == null) {
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			int var9 = aj_fld[var1];
			int var10 = ac_fld[var1];

			for (int var11 = 0; var11 < this.cz_fld; var11++) {
				int var12 = av.ak((int)this.yk_fld[var11], (int)this.qo_fld[var11], var9, var10);
				int var13 = (int)this.vr_fld[var11];
				int var14 = hv.ag((int)this.yk_fld[var11], (int)this.qo_fld[var11], var9, var10);
				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}

				if (var14 < var5) {
					var5 = var14;
				}

				if (var14 > var8) {
					var8 = var14;
				}
			}

			var2 = new fm(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
			byte var16 = 32;
			if (var2.ae_fld < 32) {
				var2.ae_fld = 961439648;
			}

			if (var2.aw_fld < 32) {
				var2.aw_fld = -967064672;
			}

			if (this.cw_fld) {
				byte var17 = 8;
				var2.ae_fld += 8;
				var2.aw_fld += 8;
			}

			var2.ay_fld = this.cj_fld;
			this.cj_fld = var2;
		}
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public void ve(fn var1) {
		if (var1 != null && this.el_fld != null && var1.el_fld != null) {
			for (int var2 = 0; var2 < var1.bw_fld; var2++) {
				this.el_fld[this.bw_fld + var2] = var1.el_fld[var2];
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V"
	)
	void cv(ek var1, int var2) {
		this.bm(rl21.no_fld, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lfm;"
	)
	fm ab(int var1) {
		for (fm var2 = this.cj_fld; var2 != null; var2 = var2.ay_fld) {
			if (var2.ak_fld == var1) {
				return var2;
			}
		}

		return null;
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(I)Lfm;"
	)
	public fm getAABB(int var1) {
		this.calculateExtreme(var1);
		fm var2 = this.gx(var1);
		if (!zi_fld && var2 == null) {
			throw new AssertionError();
		} else {
			return var2;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cs() {
		if (this.ck_fld != 1) {
			this.ck_fld = 1;
			this.ez_fld = 0;
			this.cp_fld = 0;
			this.bi_fld = 0;

			for (int var1 = 0; var1 < this.cz_fld; var1++) {
				int var2 = (int)this.yk_fld[var1];
				int var3 = (int)this.vr_fld[var1];
				int var4 = (int)this.qo_fld[var1];
				if (-var3 > this.ez_fld) {
					this.ez_fld = -var3;
				}

				if (var3 > this.cp_fld) {
					this.cp_fld = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.bi_fld) {
					this.bi_fld = var5;
				}
			}

			this.bi_fld = (int)(Math.sqrt(this.bi_fld) + 0.99);
			this.cm_fld = (int)(Math.sqrt(this.bi_fld * this.bi_fld + this.ez_fld * this.ez_fld) + 0.99);
			this.co_fld = this.cm_fld + (int)(Math.sqrt(this.bi_fld * this.bi_fld + this.cp_fld * this.cp_fld) + 0.99);
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)Lfm;"
	)
	fm do_(int var1) {
		for (fm var2 = this.cj_fld; var2 != null; var2 = var2.ay_fld) {
			if (var2.ak_fld == var1) {
				return var2;
			}
		}

		return null;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void dx() {
		if (this.ck_fld != 2) {
			this.ck_fld = 2;
			this.bi_fld = 0;

			for (int var1 = 0; var1 < this.cz_fld; var1++) {
				int var2 = (int)this.yk_fld[var1];
				int var3 = (int)this.vr_fld[var1];
				int var4 = (int)this.qo_fld[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.bi_fld) {
					this.bi_fld = var5;
				}
			}

			this.bi_fld = (int)(Math.sqrt(this.bi_fld) + 0.99);
			this.cm_fld = this.bi_fld;
			this.co_fld = this.bi_fld + this.bi_fld;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lsp;I)V"
	)
	public static void bt(fn var0, sp var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			ea var3 = var1.ah_fld;

			for (int var4 = 0; var4 < var3.ah_fld; var4++) {
				int var5 = var3.aw_fld[var4];
				if (var5 == 5 && var1.av_fld != null && var1.av_fld[var4] != null && var1.av_fld[var4][0] != null && var0.ci_fld != null && var0.cv_fld != null) {
					sn var6 = var1.av_fld[var4][0];

					for (int var10 : var3.ay_fld[var4]) {
						if (var10 < var0.ci_fld.length) {
							int[] var11 = var0.ci_fld[var10];

							for (int var12 = 0; var12 < var11.length; var12++) {
								int var13 = var11[var12];
								int var14 = (int)((var0.cv_fld[var13] & 255) + sn.ys(var6, var2) * 255.0F);
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}

								var0.cv_fld[var13] = (byte)var14;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ds() {
		this.eu();
		return this.bi_fld;
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Z)Lfn;"
	)
	public fn to(rl21 var1, boolean var2) {
		if (!var2 && var1.it_fld.length < this.bw_fld) {
			var1.it_fld = new byte[this.bw_fld + 100];
		}

		return this.pe(var2, var1.kx_fld, var1.it_fld);
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ek() {
		this.ck_fld = 0;
		this.cj_fld = null;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int db() {
		this.eu();
		return this.bi_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)Lfn;"
	)
	public fn translate(int var1, int var2, int var3) {
		this.fo(var1, var2, var3);
		return this;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void da() {
		if (this.ck_fld != 2) {
			this.ck_fld = 2;
			this.bi_fld = 0;

			for (int var1 = 0; var1 < this.cz_fld; var1++) {
				int var2 = (int)this.yk_fld[var1];
				int var3 = (int)this.vr_fld[var1];
				int var4 = (int)this.qo_fld[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.bi_fld) {
					this.bi_fld = var5;
				}
			}

			this.bi_fld = (int)(Math.sqrt(this.bi_fld) + 0.99);
			this.cm_fld = this.bi_fld;
			this.co_fld = this.bi_fld + this.bi_fld;
		}
	}

	@ObfuscatedName("getFaceColors1")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getFaceColors1() {
		return this.bb_fld;
	}

	@ObfuscatedName("getXYZMag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getXYZMag() {
		return this.bi_fld;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public final void fc(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.ck_fld != 2) {
			this.at();
		}

		int var9 = fc.aw();
		int var10 = fc.ay();
		int var11 = ac_fld[var1];
		int var12 = aj_fld[var1];
		int var13 = ac_fld[var2];
		int var14 = aj_fld[var2];
		int var15 = ac_fld[var3];
		int var16 = aj_fld[var3];
		int var17 = ac_fld[var4];
		int var18 = aj_fld[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < this.cz_fld; var20++) {
			int var21 = (int)this.yk_fld[var20];
			int var22 = (int)this.vr_fld[var20];
			int var23 = (int)this.qo_fld[var20];
			if (var3 != 0) {
				int var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				int var30 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var30;
			}

			if (var2 != 0) {
				int var31 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var31;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			int var32 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			au_fld[var20] = var23 - var19;
			ar_fld[var20] = var9 + var21 * fc.au() / var8;
			af_fld[var20] = var10 + var32 * fc.au() / var8;
			al_fld[var20] = var8;
			if (this.cf_fld != null) {
				ax_fld[var20] = var21;
				an_fld[var20] = var32;
				aa_fld[var20] = var23;
			}
		}

		try {
			this.fw(false, false, false, 0L);
		} catch (Exception var25) {
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	public void dn(sp var1, int var2) {
		ea var3 = var1.ah_fld;
		ek var4 = var3.ag();
		if (var4 != null) {
			var4.ae(var1, var2);
			this.br(var4, sp.zf(var1, 856242506));
		}

		if (var1.ah()) {
			this.bz(var1, var2);
		}

		this.dw();
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	public void df(sp var1, int var2) {
		ea var3 = var1.ah_fld;
		ek var4 = var3.ag();
		if (var4 != null) {
			var4.ae(var1, var2);
			this.br(var4, sp.zf(var1, 432543398));
		}

		if (var1.ah()) {
			this.bz(var1, var2);
		}

		this.dw();
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void em() {
		for (int var1 = 0; var1 < this.cz_fld; var1++) {
			this.yk_fld[var1] = -this.yk_fld[var1];
			this.qo_fld[var1] = -this.qo_fld[var1];
		}

		this.bl();
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	public void dp(sp var1, int var2) {
		ea var3 = var1.ah_fld;
		ek var4 = var3.ag();
		if (var4 != null) {
			var4.ae(var1, var2);
			this.br(var4, sp.zf(var1, 379993613));
		}

		if (var1.ah()) {
			this.bz(var1, var2);
		}

		this.dw();
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	void dj(sp var1, int var2) {
		ea var3 = var1.ah_fld;

		for (int var4 = 0; var4 < var3.ah_fld; var4++) {
			int var5 = var3.aw_fld[var4];
			if (var5 == 5 && var1.av_fld != null && var1.av_fld[var4] != null && var1.av_fld[var4][0] != null && this.ci_fld != null && this.cv_fld != null) {
				sn var6 = var1.av_fld[var4][0];

				for (int var10 : var3.ay_fld[var4]) {
					if (var10 < this.ci_fld.length) {
						int[] var11 = this.ci_fld[var10];

						for (int var12 = 0; var12 < var11.length; var12++) {
							int var13 = var11[var12];
							int var14 = (int)((this.cv_fld[var13] & 255) + sn.ys(var6, var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.cv_fld[var13] = (byte)var14;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	void ep(sp var1, int var2) {
		ea var3 = var1.ah_fld;

		for (int var4 = 0; var4 < var3.ah_fld; var4++) {
			int var5 = var3.aw_fld[var4];
			if (var5 == 5 && var1.av_fld != null && var1.av_fld[var4] != null && var1.av_fld[var4][0] != null && this.ci_fld != null && this.cv_fld != null) {
				sn var6 = var1.av_fld[var4][0];

				for (int var10 : var3.ay_fld[var4]) {
					if (var10 < this.ci_fld.length) {
						int[] var11 = this.ci_fld[var10];

						for (int var12 = 0; var12 < var11.length; var12++) {
							int var13 = var11[var12];
							int var14 = (int)((this.cv_fld[var13] & 255) + sn.ys(var6, var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.cv_fld[var13] = (byte)var14;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lea;Lsp;I[ZZZ)V"
	)
	public void bs(ea var1, sp var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		ek var7 = var1.ag();
		if (var7 != null) {
			var7.ah(var2, var3, var4, var5);
			if (var6) {
				this.br(var7, sp.zf(var2, 573295745));
			}
		}

		if (!var5 && var2.ah()) {
			this.bz(var2, var3);
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V"
	)
	void ed(ek var1, int var2) {
		this.cv(var1, var2);
	}

	@ObfuscatedName("getDiameter")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getDiameter() {
		return this.co_fld;
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public static void pd(fn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.cz_fld; var1++) {
			int var2 = (int)var0.yk_fld[var1];
			var0.yk_fld[var1] = var0.qo_fld[var1];
			var0.qo_fld[var1] = -var2;
		}

		var0.dw();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Luz;)V"
	)
	public static void cx(fn var0, uz var1) {
		if (var0 == null) {
			var0.getClass();
		}

		tu var2;
		synchronized (tu.ae_fld) {
			if (0 == tu.aw_fld) {
				var2 = new tu();
			} else {
				tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].as();
				var2 = tu.ae_fld[tu.aw_fld];
			}
		}

		tu var6 = var2;

		for (int var4 = 0; var4 < var0.cz_fld; var4++) {
			tu.md(var6, (int)var0.yk_fld[var4], (int)var0.vr_fld[var4], (int)var0.qo_fld[var4], (byte)-31);
			tu.vu(var6, var1, -1867064929);
			var0.yk_fld[var4] = var6.ay_fld;
			var0.vr_fld[var4] = var6.as_fld;
			var0.qo_fld[var4] = var6.ar_fld;
		}

		var6.ah();
		var0.dw();
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "(Lfn;F)V"
	)
	public static void uv(fn var0, float var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 != 1.0F) {
				for (int var2 = 0; var2 < var0.cz_fld; var2++) {
					var0.vr_fld[var2] = var0.vr_fld[var2] * var1;
				}
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lfn;"
	)
	public fn bc(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		return this.aw(var1, var2, var3, var4, var5, var6);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void by() {
		this.at();
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	public void mw(fn var1) {
		this.dj_fld = var1.dj_fld;
		this.tg_fld = var1.tg_fld;
		this.rc_fld = var1.rc_fld;
		this.el_fld = var1.el_fld;
	}

	@ObfuscatedName("useBoundingBox")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean useBoundingBox() {
		return this.cw_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I)V"
	)
	public void bm(fe var1, int var2) {
		if (this.cu_fld != null) {
			if (var2 != -1) {
				eq var3 = var1.ak_fld[var2];
				ea var4 = var3.ae_fld;
				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;

				for (int var5 = 0; var5 < var3.ah_fld; var5++) {
					int var6 = var3.aw_fld[var5];
					this.ei(var4.aw_fld[var6], var4.ay_fld[var6], var3.ay_fld[var5], var3.as_fld[var5], var3.ar_fld[var5]);
				}

				this.dw();
			}
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void el() {
		for (int var1 = 0; var1 < this.cz_fld; var1++) {
			int var2 = (int)this.yk_fld[var1];
			this.yk_fld[var1] = this.qo_fld[var1];
			this.qo_fld[var1] = -var2;
		}

		this.dw();
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Lfe;ILfe;I[I)V"
	)
	public void eo(fe var1, int var2, fe var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				eq var6 = var1.ak_fld[var2];
				eq var7 = var3.ak_fld[var4];
				ea var8 = var6.ae_fld;
				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				int var9 = 0;
				int var10 = var5[var9++];

				for (int var11 = 0; var11 < var6.ah_fld; var11++) {
					int var12 = var6.aw_fld[var11];

					while (var12 > var10) {
						var10 = var5[var9++];
					}

					if (var12 != var10 || var8.aw_fld[var12] == 0) {
						this.ei(var8.aw_fld[var12], var8.ay_fld[var12], var6.ay_fld[var11], var6.as_fld[var11], var6.ar_fld[var11]);
					}
				}

				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				var9 = 0;
				var10 = var5[var9++];

				for (int var17 = 0; var17 < var7.ah_fld; var17++) {
					int var18 = var7.aw_fld[var17];

					while (var18 > var10) {
						var10 = var5[var9++];
					}

					if (var18 == var10 || var8.aw_fld[var18] == 0) {
						this.ei(var8.aw_fld[var18], var8.ay_fld[var18], var7.ay_fld[var17], var7.as_fld[var17], var7.ar_fld[var17]);
					}
				}

				this.dw();
			} else {
				this.di(var1, var2);
			}
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(ILuy;IIIJ)V"
	)
	@Override
	void mr(int var1, uy var2, int var3, int var4, int var5, long var6) {
		if (fc.ar_fld.aa_fld != 1 || this.cv_fld != null) {
			if (this.ck_fld != 1) {
				this.eu();
			}

			this.af(var1);
			ul var8 = uv.ak();
			var8.ak_fld.ar(var1 * 0.0030679614F, 0.0F, 0.0F);
			tu.md(var8.az_fld, 1.0F, 1.0F, 1.0F, (byte)15);
			tu.md(var8.ag_fld, var3, var4, var5, (byte)53);
			uy var9 = kv.ak();
			var9.ax(var8);
			var9.al(var2);
			int var10 = (int)var9.ab(0.0F, 0.0F, 0.0F);
			boolean var11 = false;
			int var12 = var10 - this.cm_fld;
			boolean var13 = var12 <= 50 || this.cf_fld != null;
			boolean var14 = jv.az(var6);
			boolean var15 = false;
			if (var14 && rt.af()) {
				boolean var16 = ee.aq(this, var1, var3, var4, var5, var2, fc.aw(), fc.ay(), fc.au());
				if (var16) {
					if (this.cw_fld) {
						int var17 = mf.ad(this, var1, var3, var4, var5, var2, fc.aw(), fc.ay(), fc.au());
						var17 += 32;
						lw.ar(var6, var17);
					} else {
						var15 = true;
					}
				}
			}

			int var23 = fc.aw();
			int var25 = fc.ay();

			for (int var18 = 0; var18 < this.cz_fld; var18++) {
				float var19 = (int)this.yk_fld[var18];
				float var20 = (int)this.vr_fld[var18];
				float var21 = (int)this.qo_fld[var18];
				uy.vt(var9, var19, var20, var21, bz_fld, 844461626);
				var19 = bz_fld[0];
				var20 = bz_fld[1];
				var21 = bz_fld[2];
				var11 |= this.bn(var18, var19, var20, var21, var10, var23, var25, var13);
			}

			ul.ln(var8, (byte)-59);
			var9.az();

			try {
				this.fw(var11, var15, this.cw_fld, var6);
			} catch (Exception var22) {
			}
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gp(int var1) {
		if (var1 != 0) {
			for (int var2 = 0; var2 < this.cz_fld; var2++) {
				this.vr_fld[var2] = (int)this.vr_fld[var2] + var1;
			}
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I[IZ)V"
	)
	public void er(fe var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.di(var1, var2);
		} else {
			eq var5 = var1.ak_fld[var2];
			ea var6 = var5.ae_fld;
			int var7 = 0;
			int var8 = var3[var7++];
			bp_fld = 0;
			bt_fld = 0;
			bv_fld = 0;

			for (int var9 = 0; var9 < var5.ah_fld; var9++) {
				int var10 = var5.aw_fld[var9];

				while (var10 > var8) {
					var8 = var3[var7++];
				}

				if (var4) {
					if (var10 == var8 || var6.aw_fld[var10] == 0) {
						this.ei(var6.aw_fld[var10], var6.ay_fld[var10], var5.ay_fld[var9], var5.as_fld[var9], var5.ar_fld[var9]);
					}
				} else if (var10 != var8 || var6.aw_fld[var10] == 0) {
					this.ei(var6.aw_fld[var10], var6.ay_fld[var10], var5.ay_fld[var9], var5.as_fld[var9], var5.ar_fld[var9]);
				}
			}
		}
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(ZLfn;[B)V"
	)
	public void wc(boolean var1, fn var2, byte[] var3) {
		var2.dj_fld = this.dj_fld;
		var2.tg_fld = this.tg_fld;
		var2.rc_fld = this.rc_fld;
		var2.el_fld = this.el_fld;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Lfe;I[IZ)V"
	)
	public void en(fe var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.di(var1, var2);
		} else {
			eq var5 = var1.ak_fld[var2];
			ea var6 = var5.ae_fld;
			int var7 = 0;
			int var8 = var3[var7++];
			bp_fld = 0;
			bt_fld = 0;
			bv_fld = 0;

			for (int var9 = 0; var9 < var5.ah_fld; var9++) {
				int var10 = var5.aw_fld[var9];

				while (var10 > var8) {
					var8 = var3[var7++];
				}

				if (var4) {
					if (var10 == var8 || var6.aw_fld[var10] == 0) {
						this.ei(var6.aw_fld[var10], var6.ay_fld[var10], var5.ay_fld[var9], var5.as_fld[var9], var5.ar_fld[var9]);
					}
				} else if (var10 != var8 || var6.aw_fld[var10] == 0) {
					this.ei(var6.aw_fld[var10], var6.ay_fld[var10], var5.ay_fld[var9], var5.as_fld[var9], var5.ar_fld[var9]);
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	void ag(fn var1) {
		int var2 = this.ba_fld.length;
		if (this.cx_fld == null && (var1.cx_fld != null || this.cs_fld != var1.cs_fld)) {
			this.cx_fld = new byte[var2];
			Arrays.fill(this.cx_fld, this.cs_fld);
		}

		if (this.cv_fld == null && var1.cv_fld != null) {
			this.cv_fld = new byte[var2];
			Arrays.fill(this.cv_fld, (byte)0);
		}

		if (this.cf_fld == null && var1.cf_fld != null) {
			this.cf_fld = new short[var2];
			Arrays.fill(this.cf_fld, (short)-1);
		}

		if (this.cq_fld == null && var1.cq_fld != null) {
			this.cq_fld = new byte[var2];
			Arrays.fill(this.cq_fld, (byte)-1);
		}

		if (this.cy_fld == null && var1.cy_fld != null) {
			this.cy_fld = new byte[var2];
			Arrays.fill(this.cy_fld, (byte)0);
		}
	}

	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ux() {
		for (int var1 = 0; var1 < this.cz_fld; var1++) {
			int var2 = (int)this.yk_fld[var1];
			this.yk_fld[var1] = this.qo_fld[var1];
			this.qo_fld[var1] = -var2;
		}

		this.dw();
	}

	@ObfuscatedName("getTextureFaces")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] getTextureFaces() {
		return this.cq_fld;
	}

	fn() {
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fy(int var1) {
		int var2 = ac_fld[var1];
		int var3 = aj_fld[var1];

		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			int var5 = (int)this.vr_fld[var4] * var3 - (int)this.qo_fld[var4] * var2 >> 16;
			this.qo_fld[var4] = (int)this.vr_fld[var4] * var2 + (int)this.qo_fld[var4] * var3 >> 16;
			this.vr_fld[var4] = var5;
		}

		this.dw();
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dg() {
		for (int var1 = 0; var1 < this.cz_fld; var1++) {
			int var2 = (int)this.qo_fld[var1];
			this.qo_fld[var1] = this.yk_fld[var1];
			this.yk_fld[var1] = -var2;
		}

		this.dw();
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fs() {
		try {
			for (int var1 = 0; var1 < 12; var1++) {
				am_fld[var1] = 0;
				ap_fld[var1] = 0;
			}

			for (int var15 = this.co_fld - 1; var15 >= 0; var15--) {
				char var2 = ai_fld[var15];
				if (var2 > 0) {
					char[] var3 = aq_fld[var15];

					for (int var4 = 0; var4 < var2; var4++) {
						char var5 = var3[var4];
						byte var6 = this.cx_fld[var5];
						int var7 = am_fld[var6]++;
						ad_fld[var6][var7] = var5;
						if (var6 < 10) {
							ap_fld[var6] = ap_fld[var6] + var15;
						} else if (var6 == 10) {
							ao_fld[var7] = var15;
						} else {
							ab_fld[var7] = var15;
						}
					}
				}
			}

			int var16 = 0;
			if (am_fld[1] > 0 || am_fld[2] > 0) {
				var16 = (ap_fld[1] + ap_fld[2]) / (am_fld[1] + am_fld[2]);
			}

			int var17 = 0;
			if (am_fld[3] > 0 || am_fld[4] > 0) {
				var17 = (ap_fld[3] + ap_fld[4]) / (am_fld[3] + am_fld[4]);
			}

			int var18 = 0;
			if (am_fld[6] > 0 || am_fld[8] > 0) {
				var18 = (ap_fld[6] + ap_fld[8]) / (am_fld[6] + am_fld[8]);
			}

			int var20 = 0;
			int var21 = am_fld[10];
			int[] var22 = ad_fld[10];
			int[] var8 = ao_fld;
			if (var20 == var21) {
				var20 = 0;
				var21 = am_fld[11];
				var22 = ad_fld[11];
				var8 = ab_fld;
			}

			int var19;
			if (var20 < var21) {
				var19 = var8[var20];
			} else {
				var19 = -1000;
			}

			for (int var9 = 0; var9 < 10; var9++) {
				while (var9 == 0 && var19 > var16) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				while (var9 == 3 && var19 > var17) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				while (var9 == 5 && var19 > var18) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				int var10 = am_fld[var9];
				int[] var11 = ad_fld[var9];

				for (int var12 = 0; var12 < var10; var12++) {
					zp(this, var11[var12]);
				}
			}

			while (var19 != -1000) {
				zp(this, var22[var20++]);
				if (var20 == var21 && var22 != ad_fld[11]) {
					var20 = 0;
					var22 = ad_fld[11];
					var21 = am_fld[11];
					var8 = ab_fld;
				}

				if (var20 < var21) {
					var19 = var8[var20];
				} else {
					var19 = -1000;
				}
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("zj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void zj() {
		for (int var1 = 0; var1 < this.cz_fld; var1++) {
			int var2 = (int)this.qo_fld[var1];
			this.qo_fld[var1] = this.yk_fld[var1];
			this.yk_fld[var1] = -var2;
		}

		this.dw();
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ce(int var1) {
		int var2 = ac_fld[var1];
		int var3 = aj_fld[var1];

		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			int var5 = (int)this.vr_fld[var4] * var3 - (int)this.qo_fld[var4] * var2 >> 16;
			this.qo_fld[var4] = (int)this.vr_fld[var4] * var2 + (int)this.qo_fld[var4] * var3 >> 16;
			this.vr_fld[var4] = var5;
		}

		this.dw();
	}

	@ObfuscatedName("yh")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfy;S)V"
	)
	public static void yh(fn var0, fy var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 == null) {
			rl1.lx(var0);
		} else {
			if (var0.ch_fld == null) {
				var0.ch_fld = new fy();
			}

			var0.ch_fld.ae(var1);
			var0.cl_fld = var2;
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gv(int var1) {
		int var2 = ac_fld[var1];
		int var3 = aj_fld[var1];

		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			int var5 = (int)this.vr_fld[var4] * var3 - (int)this.qo_fld[var4] * var2 >> 16;
			this.qo_fld[var4] = (int)this.vr_fld[var4] * var2 + (int)this.qo_fld[var4] * var3 >> 16;
			this.vr_fld[var4] = var5;
		}

		this.dw();
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fj(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			this.yk_fld[var4] = (int)this.yk_fld[var4] + var1;
			this.vr_fld[var4] = (int)this.vr_fld[var4] + var2;
			this.qo_fld[var4] = (int)this.qo_fld[var4] + var3;
		}

		this.dw();
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fx(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			this.yk_fld[var4] = (int)this.yk_fld[var4] + var1;
			this.vr_fld[var4] = (int)this.vr_fld[var4] + var2;
			this.qo_fld[var4] = (int)this.qo_fld[var4] + var3;
		}

		this.dw();
	}

	@ObfuscatedName("calculateExtreme")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void calculateExtreme(int var1) {
		this.af(var1);
	}

	@ObfuscatedName("getTexIndices3")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getTexIndices3() {
		return this.cr_fld;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fq() {
		try {
			for (int var1 = 0; var1 < 12; var1++) {
				am_fld[var1] = 0;
				ap_fld[var1] = 0;
			}

			for (int var15 = this.co_fld - 1; var15 >= 0; var15--) {
				char var2 = ai_fld[var15];
				if (var2 > 0) {
					char[] var3 = aq_fld[var15];

					for (int var4 = 0; var4 < var2; var4++) {
						char var5 = var3[var4];
						byte var6 = this.cx_fld[var5];
						int var7 = am_fld[var6]++;
						ad_fld[var6][var7] = var5;
						if (var6 < 10) {
							ap_fld[var6] = ap_fld[var6] + var15;
						} else if (var6 == 10) {
							ao_fld[var7] = var15;
						} else {
							ab_fld[var7] = var15;
						}
					}
				}
			}

			int var16 = 0;
			if (am_fld[1] > 0 || am_fld[2] > 0) {
				var16 = (ap_fld[1] + ap_fld[2]) / (am_fld[1] + am_fld[2]);
			}

			int var17 = 0;
			if (am_fld[3] > 0 || am_fld[4] > 0) {
				var17 = (ap_fld[3] + ap_fld[4]) / (am_fld[3] + am_fld[4]);
			}

			int var18 = 0;
			if (am_fld[6] > 0 || am_fld[8] > 0) {
				var18 = (ap_fld[6] + ap_fld[8]) / (am_fld[6] + am_fld[8]);
			}

			int var20 = 0;
			int var21 = am_fld[10];
			int[] var22 = ad_fld[10];
			int[] var8 = ao_fld;
			if (var20 == var21) {
				var20 = 0;
				var21 = am_fld[11];
				var22 = ad_fld[11];
				var8 = ab_fld;
			}

			int var19;
			if (var20 < var21) {
				var19 = var8[var20];
			} else {
				var19 = -1000;
			}

			for (int var9 = 0; var9 < 10; var9++) {
				while (var9 == 0 && var19 > var16) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				while (var9 == 3 && var19 > var17) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				while (var9 == 5 && var19 > var18) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				int var10 = am_fld[var9];
				int[] var11 = ad_fld[var9];

				for (int var12 = 0; var12 < var10; var12++) {
					zp(this, var11[var12]);
				}
			}

			while (var19 != -1000) {
				zp(this, var22[var20++]);
				if (var20 == var21 && var22 != ad_fld[11]) {
					var20 = 0;
					var22 = ad_fld[11];
					var21 = am_fld[11];
					var8 = ab_fld;
				}

				if (var20 < var21) {
					var19 = var8[var20];
				} else {
					var19 = -1000;
				}
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void py(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			this.yk_fld[var4] = (int)this.yk_fld[var4] + var1;
			this.vr_fld[var4] = (int)this.vr_fld[var4] + var2;
			this.qo_fld[var4] = (int)this.qo_fld[var4] + var3;
		}

		this.dw();
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Lfe;I)V"
	)
	public void na(rl21 var1, fe var2, int var3) {
		if (this.cu_fld != null && var3 != -1) {
			eq var4 = var2.ak_fld[var3];
			ea var5 = var4.ae_fld;
			var1.wh_fld = 0;
			var1.mw_fld = 0;
			var1.ci_fld = 0;

			for (int var6 = 0; var6 < var4.ah_fld; var6++) {
				int var7 = var4.aw_fld[var6];
				this.yg(var1, var5.aw_fld[var7], var5.ay_fld[var7], var4.ay_fld[var6], var4.as_fld[var6], var4.ar_fld[var6]);
			}

			this.bl();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lfn;"
	)
	public fn ci(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.eu();
		int var7 = var2 - this.bi_fld;
		int var8 = var2 + this.bi_fld;
		int var9 = var4 - this.bi_fld;
		int var10 = var4 + this.bi_fld;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				fn var11;
				if (var5) {
					var11 = new fn(this);
					var11.vr_fld = new float[var11.cz_fld];
				} else {
					var11 = this;
				}

				if (var6 == 0) {
					for (int var12 = 0; var12 < var11.cz_fld; var12++) {
						int var13 = (int)this.yk_fld[var12] + var2;
						int var14 = (int)this.qo_fld[var12] + var4;
						int var15 = var13 & 127;
						int var16 = var14 & 127;
						int var17 = var13 >> 7;
						int var18 = var14 >> 7;
						int var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						int var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						int var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.vr_fld[var12] = (int)this.vr_fld[var12] + var21 - var3;
					}
				} else {
					for (int var27 = 0; var27 < var11.cz_fld; var27++) {
						int var28 = (-((int)this.vr_fld[var27]) << 16) / this.ez_fld;
						if (var28 < var6) {
							int var29 = (int)this.yk_fld[var27] + var2;
							int var30 = (int)this.qo_fld[var27] + var4;
							int var31 = var29 & 127;
							int var32 = var30 & 127;
							int var33 = var29 >> 7;
							int var34 = var30 >> 7;
							int var35 = var1[var33][var34] * (128 - var31) + var1[var33 + 1][var34] * var31 >> 7;
							int var36 = var1[var33][var34 + 1] * (128 - var31) + var1[var33 + 1][var34 + 1] * var31 >> 7;
							int var22 = var35 * (128 - var32) + var36 * var32 >> 7;
							var11.vr_fld[var27] = (int)this.vr_fld[var27] + (var22 - var3) * (var6 - var28) / var6;
						} else {
							var11.vr_fld[var27] = this.vr_fld[var27];
						}
					}
				}

				var11.dw();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fu() {
		try {
			for (int var1 = 0; var1 < 12; var1++) {
				am_fld[var1] = 0;
				ap_fld[var1] = 0;
			}

			for (int var15 = this.co_fld - 1; var15 >= 0; var15--) {
				char var2 = ai_fld[var15];
				if (var2 > 0) {
					char[] var3 = aq_fld[var15];

					for (int var4 = 0; var4 < var2; var4++) {
						char var5 = var3[var4];
						byte var6 = this.cx_fld[var5];
						int var7 = am_fld[var6]++;
						ad_fld[var6][var7] = var5;
						if (var6 < 10) {
							ap_fld[var6] = ap_fld[var6] + var15;
						} else if (var6 == 10) {
							ao_fld[var7] = var15;
						} else {
							ab_fld[var7] = var15;
						}
					}
				}
			}

			int var16 = 0;
			if (am_fld[1] > 0 || am_fld[2] > 0) {
				var16 = (ap_fld[1] + ap_fld[2]) / (am_fld[1] + am_fld[2]);
			}

			int var17 = 0;
			if (am_fld[3] > 0 || am_fld[4] > 0) {
				var17 = (ap_fld[3] + ap_fld[4]) / (am_fld[3] + am_fld[4]);
			}

			int var18 = 0;
			if (am_fld[6] > 0 || am_fld[8] > 0) {
				var18 = (ap_fld[6] + ap_fld[8]) / (am_fld[6] + am_fld[8]);
			}

			int var20 = 0;
			int var21 = am_fld[10];
			int[] var22 = ad_fld[10];
			int[] var8 = ao_fld;
			if (var20 == var21) {
				var20 = 0;
				var21 = am_fld[11];
				var22 = ad_fld[11];
				var8 = ab_fld;
			}

			int var19;
			if (var20 < var21) {
				var19 = var8[var20];
			} else {
				var19 = -1000;
			}

			for (int var9 = 0; var9 < 10; var9++) {
				while (var9 == 0 && var19 > var16) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -361981940;
					}
				}

				while (var9 == 3 && var19 > var17) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = -1000;
					}
				}

				while (var9 == 5 && var19 > var18) {
					zp(this, var22[var20++]);
					if (var20 == var21 && var22 != ad_fld[11]) {
						var20 = 0;
						var21 = am_fld[11];
						var22 = ad_fld[11];
						var8 = ab_fld;
					}

					if (var20 < var21) {
						var19 = var8[var20];
					} else {
						var19 = 450878904;
					}
				}

				int var10 = am_fld[var9];
				int[] var11 = ad_fld[var9];

				for (int var12 = 0; var12 < var10; var12++) {
					zp(this, var11[var12]);
				}
			}

			while (var19 != -1000) {
				zp(this, var22[var20++]);
				if (var20 == var21 && var22 != ad_fld[11]) {
					var20 = 0;
					var22 = ad_fld[11];
					var21 = am_fld[11];
					var8 = ab_fld;
				}

				if (var20 < var21) {
					var19 = var8[var20];
				} else {
					var19 = -1000;
				}
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I[IIII)V"
	)
	void bj(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		if (var1 == 0) {
			int var21 = 0;
			bp_fld = 0;
			bt_fld = 0;
			bv_fld = 0;

			for (int var25 = 0; var25 < var6; var25++) {
				int var29 = var2[var25];
				if (var29 < this.cu_fld.length) {
					int[] var33 = this.cu_fld[var29];

					for (int var37 = 0; var37 < var33.length; var37++) {
						int var39 = var33[var37];
						bp_fld = bp_fld + (int)this.yk_fld[var39];
						bt_fld = bt_fld + (int)this.vr_fld[var39];
						bv_fld = bv_fld + (int)this.qo_fld[var39];
						var21++;
					}
				}
			}

			if (var21 > 0) {
				bp_fld = bp_fld / var21 + var3;
				bt_fld = bt_fld / var21 + var4;
				bv_fld = bv_fld / var21 + var5;
			} else {
				bp_fld = var3;
				bt_fld = var4;
				bv_fld = var5;
			}
		} else if (var1 == 1) {
			for (int var20 = 0; var20 < var6; var20++) {
				int var24 = var2[var20];
				if (var24 < this.cu_fld.length) {
					int[] var28 = this.cu_fld[var24];

					for (int var32 = 0; var32 < var28.length; var32++) {
						int var36 = var28[var32];
						this.yk_fld[var36] = (int)this.yk_fld[var36] + var3;
						this.vr_fld[var36] = (int)this.vr_fld[var36] + var4;
						this.qo_fld[var36] = (int)this.qo_fld[var36] + var5;
					}
				}
			}
		} else if (var1 == 2) {
			for (int var19 = 0; var19 < var6; var19++) {
				int var23 = var2[var19];
				if (var23 < this.cu_fld.length) {
					int[] var27 = this.cu_fld[var23];

					for (int var31 = 0; var31 < var27.length; var31++) {
						int var35 = var27[var31];
						this.yk_fld[var35] = (int)this.yk_fld[var35] - bp_fld;
						this.vr_fld[var35] = (int)this.vr_fld[var35] - bt_fld;
						this.qo_fld[var35] = (int)this.qo_fld[var35] - bv_fld;
						int var38 = (var3 & 0xFF) * 8;
						int var13 = (var4 & 693169652) * 8;
						int var14 = (var5 & 0xFF) * 8;
						if (var14 != 0) {
							int var15 = ac_fld[var14];
							int var16 = aj_fld[var14];
							int var17 = (int)this.vr_fld[var35] * var15 + (int)this.yk_fld[var35] * var16 >> 16;
							this.vr_fld[var35] = (int)this.vr_fld[var35] * var16 - (int)this.yk_fld[var35] * var15 >> 16;
							this.yk_fld[var35] = var17;
						}

						if (var38 != 0) {
							int var40 = ac_fld[var38];
							int var42 = aj_fld[var38];
							int var44 = (int)this.vr_fld[var35] * var42 - (int)this.qo_fld[var35] * var40 >> 16;
							this.qo_fld[var35] = (int)this.vr_fld[var35] * var40 + (int)this.qo_fld[var35] * var42 >> 16;
							this.vr_fld[var35] = var44;
						}

						if (var13 != 0) {
							int var41 = ac_fld[var13];
							int var43 = aj_fld[var13];
							int var45 = (int)this.qo_fld[var35] * var41 + (int)this.yk_fld[var35] * var43 >> 16;
							this.qo_fld[var35] = (int)this.qo_fld[var35] * var43 - (int)this.yk_fld[var35] * var41 >> 16;
							this.yk_fld[var35] = var45;
						}

						this.yk_fld[var35] = (int)this.yk_fld[var35] + bp_fld;
						this.vr_fld[var35] = (int)this.vr_fld[var35] + bt_fld;
						this.qo_fld[var35] = (int)this.qo_fld[var35] + bv_fld;
					}
				}
			}
		} else if (var1 == 3) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var22 = var2[var18];
				if (var22 < this.cu_fld.length) {
					int[] var26 = this.cu_fld[var22];

					for (int var30 = 0; var30 < var26.length; var30++) {
						int var34 = var26[var30];
						this.yk_fld[var34] = (int)this.yk_fld[var34] - bp_fld;
						this.vr_fld[var34] = (int)this.vr_fld[var34] - bt_fld;
						this.qo_fld[var34] = (int)this.qo_fld[var34] - bv_fld;
						this.yk_fld[var34] = (int)this.yk_fld[var34] * var3 / -1124510401;
						this.vr_fld[var34] = (int)this.vr_fld[var34] * var4 / 256966300;
						this.qo_fld[var34] = (int)this.qo_fld[var34] * var5 / 128;
						this.yk_fld[var34] = (int)this.yk_fld[var34] + bp_fld;
						this.vr_fld[var34] = (int)this.vr_fld[var34] + bt_fld;
						this.qo_fld[var34] = (int)this.qo_fld[var34] + bv_fld;
					}
				}
			}
		} else if (var1 == 5) {
			if (this.ci_fld != null && this.cv_fld != null) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = var2[var7];
					if (var8 < this.ci_fld.length) {
						int[] var9 = this.ci_fld[var8];

						for (int var10 = 0; var10 < var9.length; var10++) {
							int var11 = var9[var10];
							int var12 = (this.cv_fld[var11] & 255) + var3 * 8;
							if (var12 < 0) {
								var12 = 0;
							} else if (var12 > 255) {
								var12 = 255;
							}

							this.cv_fld[var11] = (byte)var12;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lfn;III)V"
	)
	public static void qd(fn var0, int var1, int var2, int var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				for (int var4 = 0; var4 < var0.cz_fld; var4++) {
					var0.yk_fld[var4] = (int)var0.yk_fld[var4] * var1 / 128;
					var0.vr_fld[var4] = (int)var0.vr_fld[var4] * var2 / 128;
					var0.qo_fld[var4] = (int)var0.qo_fld[var4] * var3 / 128;
				}

				var0.dw();
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	void ah(fn var1) {
		this.ve(var1);
		if (var1 != null) {
			this.ag(var1);

			for (int var2 = 0; var2 < var1.bw_fld; var2++) {
				this.ba_fld[this.bw_fld] = var1.ba_fld[var2] + this.cz_fld;
				this.bq_fld[this.bw_fld] = var1.bq_fld[var2] + this.cz_fld;
				this.bg_fld[this.bw_fld] = var1.bg_fld[var2] + this.cz_fld;
				this.bb_fld[this.bw_fld] = var1.bb_fld[var2];
				this.cd_fld[this.bw_fld] = var1.cd_fld[var2];
				this.cc_fld[this.bw_fld] = var1.cc_fld[var2];
				if (this.cx_fld != null) {
					this.cx_fld[this.bw_fld] = var1.cx_fld != null ? var1.cx_fld[var2] : var1.cs_fld;
				}

				if (this.cv_fld != null && var1.cv_fld != null) {
					this.cv_fld[this.bw_fld] = var1.cv_fld[var2];
				}

				if (this.cf_fld != null) {
					this.cf_fld[this.bw_fld] = var1.cf_fld != null ? var1.cf_fld[var2] : -1;
				}

				if (this.cq_fld != null) {
					if (var1.cq_fld != null && var1.cq_fld[var2] != -1) {
						this.cq_fld[this.bw_fld] = (byte)(var1.cq_fld[var2] + this.cb_fld);
					} else {
						this.cq_fld[this.bw_fld] = -1;
					}
				}

				if (this.cy_fld != null && var1.cy_fld != null) {
					this.cy_fld[this.bw_fld] = var1.cy_fld[var2];
				}

				this.bw_fld++;
			}

			for (int var3 = 0; var3 < var1.cb_fld; var3++) {
				this.ce_fld[this.cb_fld] = var1.ce_fld[var3] + this.cz_fld;
				this.cn_fld[this.cb_fld] = var1.cn_fld[var3] + this.cz_fld;
				this.cr_fld[this.cb_fld] = var1.cr_fld[var3] + this.cz_fld;
				this.cb_fld++;
			}

			for (int var4 = 0; var4 < var1.cz_fld; var4++) {
				this.yk_fld[this.cz_fld] = var1.yk_fld[var4];
				this.vr_fld[this.cz_fld] = var1.vr_fld[var4];
				this.qo_fld[this.cz_fld] = var1.qo_fld[var4];
				this.cz_fld++;
			}
		}
	}

	@ObfuscatedName("getVertexNormalsY")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getVertexNormalsY() {
		return this.tg_fld;
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfn;)V"
	)
	public static void wx(fn var0, fn var1) {
		int var2 = var0.ba_fld.length;
		if (var0.cx_fld == null && (var1.cx_fld != null || var0.cs_fld != var1.cs_fld)) {
			var0.cx_fld = new byte[var2];
			Arrays.fill(var0.cx_fld, var0.cs_fld);
		}

		if (var0.cv_fld == null && var1.cv_fld != null) {
			var0.cv_fld = new byte[var2];
			Arrays.fill(var0.cv_fld, (byte)0);
		}

		if (var0.cf_fld == null && var1.cf_fld != null) {
			var0.cf_fld = new short[var2];
			Arrays.fill(var0.cf_fld, (short)-1);
		}

		if (var0.cq_fld == null && var1.cq_fld != null) {
			var0.cq_fld = new byte[var2];
			Arrays.fill(var0.cq_fld, (byte)-1);
		}

		if (var0.cy_fld == null && var1.cy_fld != null) {
			var0.cy_fld = new byte[var2];
			Arrays.fill(var0.cy_fld, (byte)0);
		}
	}

	@ObfuscatedName("getFaceCount")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getFaceCount() {
		return this.bw_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bf() {
		if (this.dj_fld == null && (client.jb_fld & 4) == 4) {
			int var1 = this.getVerticesCount();
			this.dj_fld = new int[var1];
			this.tg_fld = new int[var1];
			this.rc_fld = new int[var1];
			int[] var2 = this.getFaceIndices1();
			int[] var3 = this.getFaceIndices2();
			int[] var4 = this.getFaceIndices3();
			float[] var5 = this.getVerticesX();
			float[] var6 = this.getVerticesY();
			float[] var7 = this.getVerticesZ();

			for (int var8 = 0; var8 < this.getFaceCount(); var8++) {
				int var9 = var2[var8];
				int var10 = var3[var8];
				int var11 = var4[var8];
				int var12 = (int)(var5[var10] - var5[var9]);
				int var13 = (int)(var6[var10] - var6[var9]);
				int var14 = (int)(var7[var10] - var7[var9]);
				int var15 = (int)(var5[var11] - var5[var9]);
				int var16 = (int)(var6[var11] - var6[var9]);
				int var17 = (int)(var7[var11] - var7[var9]);
				int var18 = var13 * var17 - var16 * var14;
				int var19 = var14 * var15 - var17 * var12;

				int var20;
				for (var20 = var12 * var16 - var15 * var13; var18 > 8192 || var19 > 8192 || var20 > 8192 || var18 < -8192 || var19 < -8192 || var20 < -8192; var20 >>= 1) {
					var18 >>= 1;
					var19 >>= 1;
				}

				int var21 = (int)Math.sqrt(var18 * var18 + var19 * var19 + var20 * var20);
				if (var21 <= 0) {
					var21 = 1;
				}

				var18 = var18 * 256 / var21;
				var19 = var19 * 256 / var21;
				var20 = var20 * 256 / var21;
				this.dj_fld[var9] = this.dj_fld[var9] + var18;
				this.tg_fld[var9] = this.tg_fld[var9] + var19;
				this.rc_fld[var9] = this.rc_fld[var9] + var20;
				this.dj_fld[var10] = this.dj_fld[var10] + var18;
				this.tg_fld[var10] = this.tg_fld[var10] + var19;
				this.rc_fld[var10] = this.rc_fld[var10] + var20;
				this.dj_fld[var11] = this.dj_fld[var11] + var18;
				this.tg_fld[var11] = this.tg_fld[var11] + var19;
				this.rc_fld[var11] = this.rc_fld[var11] + var20;
			}
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ca(int var1, int var2, int var3) {
		this.yk_fld = new float[var1];
		this.vr_fld = new float[var1];
		this.qo_fld = new float[var1];
		this.ba_fld = new int[var2];
		this.bq_fld = new int[var2];
		this.bg_fld = new int[var2];
		this.bb_fld = new int[var2];
		this.cd_fld = new int[var2];
		this.cc_fld = new int[var2];
		if (var3 > 0) {
			this.ce_fld = new int[var3];
			this.cn_fld = new int[var3];
			this.cr_fld = new int[var3];
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(ZZZJ)V"
	)
	final void fe(boolean var1, boolean var2, boolean var3, long var4) {
		try {
			if (this.co_fld < 6000) {
				for (int var6 = 0; var6 < this.co_fld; var6++) {
					ai_fld[var6] = 0;
				}

				int var33 = var3 ? 20 : 5;
				int var7 = fc.ax();

				for (int var8 = 0; var8 < this.bw_fld; var8++) {
					if (this.cc_fld[var8] == -2) {
						as_fld[var8] = true;
					} else {
						if (this.ct_fld != fk.az_fld) {
							if (fc.ar_fld.aa_fld == 1 && (this.cv_fld == null || this.cv_fld[var8] == 0)) {
								as_fld[var8] = true;
								continue;
							}

							if (fc.ar_fld.aa_fld == 0 && this.cv_fld != null && this.cv_fld[var8] != 0) {
								as_fld[var8] = true;
								continue;
							}
						}

						int var9 = this.ba_fld[var8];
						int var10 = this.bq_fld[var8];
						int var11 = this.bg_fld[var8];
						float var12 = ar_fld[var9];
						float var13 = ar_fld[var10];
						float var14 = ar_fld[var11];
						ay_fld[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
						if (ay_fld[var8]) {
							int var15 = ax_fld[var9];
							int var16 = ax_fld[var10];
							int var17 = ax_fld[var11];
							int var18 = an_fld[var9];
							int var19 = an_fld[var10];
							int var20 = an_fld[var11];
							int var21 = aa_fld[var9];
							int var22 = aa_fld[var10];
							int var23 = aa_fld[var11];
							var15 -= var16;
							var17 -= var16;
							var18 -= var19;
							var20 -= var19;
							var21 -= var22;
							var23 -= var22;
							int var24 = var18 * var23 - var21 * var20;
							int var25 = var21 * var17 - var15 * var23;
							int var26 = var15 * var20 - var18 * var17;
							as_fld[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
						} else {
							as_fld[var8] = (var12 - var13) * (af_fld[var11] - af_fld[var10]) - (af_fld[var9] - af_fld[var10]) * (var14 - var13) <= 0.0F;
							aw_fld[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
							if (var2) {
								int var39 = (int)af_fld[var9];
								int var41 = (int)af_fld[var10];
								int var43 = (int)af_fld[var11];
								int var44 = (int)var12;
								int var46 = (int)var13;
								int var48 = (int)var14;
								int var49 = ej.bh_fld + var33;
								boolean var38;
								if (var49 < var39 && var49 < var41 && var49 < var43) {
									var38 = false;
								} else {
									var49 = ej.bh_fld - var33;
									if (var49 > var39 && var49 > var41 && var49 > var43) {
										var38 = false;
									} else {
										var49 = var33 + ej.bs_fld;
										if (var49 < var44 && var49 < var46 && var49 < var48) {
											var38 = false;
										} else {
											var49 = ej.bs_fld - var33;
											if (var49 > var44 && var49 > var46 && var49 > var48) {
												var38 = false;
											} else {
												var38 = true;
											}
										}
									}
								}

								if (var38) {
									var49 = (int)(al_fld[var9] + al_fld[var10] + al_fld[var11]) / 3;
									lw.ar(var4, var49);
								}
							}
						}
					}
				}

				short var34 = this.cl_fld;
				boolean var35 = false;
				if (fc.ar_fld.au_fld.av()) {
					this.cl_fld = (short)this.bw_fld;
				} else if (this.ch_fld != null && this.ch_fld.av()) {
					fc.ar_fld.au_fld.ae(this.ch_fld);
					var35 = true;
				}

				try {
					if (!fc.an()) {
						this.ba(true);
					} else {
						fk var36 = this.ct_fld;
						if (var36 == fk.ak_fld) {
							if (fc.ar_fld.aa_fld != 0 && this.cv_fld != null) {
								var36 = fk.ag_fld;
							} else {
								var36 = fk.av_fld;
							}
						}

						switch (var36.ah_fld) {
							case 1:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								this.ba(false);
								break;
							case 2:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = 0;
								this.ba(true);
								fc.ar_fld.ap_fld = 0;
								fc.ar_fld.ad_fld = -1;
								this.ba(true);
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								break;
							case 3:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								zg(this);
								break;
							case 4:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = 0;
								zg(this);
						}
					}
				} finally {
					this.cl_fld = var34;
					if (var35) {
						fc.ar_fld.au_fld.ar();
					}
				}
			}
		} catch (Throwable var32) {
			throw new RuntimeException(var32);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZZZJ)V"
	)
	final void bc(boolean var1, boolean var2, boolean var3, long var4) {
		try {
			if (this.co_fld < 6000) {
				for (int var6 = 0; var6 < this.co_fld; var6++) {
					ai_fld[var6] = 0;
				}

				int var33 = var3 ? 20 : 5;
				int var7 = fc.ax();

				for (int var8 = 0; var8 < this.bw_fld; var8++) {
					if (this.cc_fld[var8] == 1990654048) {
						as_fld[var8] = true;
					} else {
						if (this.ct_fld != fk.az_fld) {
							if (fc.ar_fld.aa_fld == 1 && (this.cv_fld == null || this.cv_fld[var8] == 0)) {
								as_fld[var8] = true;
								continue;
							}

							if (fc.ar_fld.aa_fld == 0 && this.cv_fld != null && this.cv_fld[var8] != 0) {
								as_fld[var8] = true;
								continue;
							}
						}

						int var9 = this.ba_fld[var8];
						int var10 = this.bq_fld[var8];
						int var11 = this.bg_fld[var8];
						float var12 = ar_fld[var9];
						float var13 = ar_fld[var10];
						float var14 = ar_fld[var11];
						ay_fld[var8] = var1 && (var12 == -5000.0F || var13 == -5000.0F || var14 == -5000.0F);
						if (ay_fld[var8]) {
							int var15 = ax_fld[var9];
							int var16 = ax_fld[var10];
							int var17 = ax_fld[var11];
							int var18 = an_fld[var9];
							int var19 = an_fld[var10];
							int var20 = an_fld[var11];
							int var21 = aa_fld[var9];
							int var22 = aa_fld[var10];
							int var23 = aa_fld[var11];
							var15 -= var16;
							var17 -= var16;
							var18 -= var19;
							var20 -= var19;
							var21 -= var22;
							var23 -= var22;
							int var24 = var18 * var23 - var21 * var20;
							int var25 = var21 * var17 - var15 * var23;
							int var26 = var15 * var20 - var18 * var17;
							as_fld[var8] = var16 * var24 + var19 * var25 + var22 * var26 <= 0.0F;
						} else {
							as_fld[var8] = (var12 - var13) * (af_fld[var11] - af_fld[var10]) - (af_fld[var9] - af_fld[var10]) * (var14 - var13) <= 0.0F;
							aw_fld[var8] = var12 < 0.0F || var13 < 0.0F || var14 < 0.0F || var12 > var7 || var13 > var7 || var14 > var7;
							if (var2) {
								int var39 = (int)af_fld[var9];
								int var41 = (int)af_fld[var10];
								int var43 = (int)af_fld[var11];
								int var44 = (int)var12;
								int var46 = (int)var13;
								int var48 = (int)var14;
								int var49 = ej.bh_fld + var33;
								boolean var38;
								if (var49 < var39 && var49 < var41 && var49 < var43) {
									var38 = false;
								} else {
									var49 = ej.bh_fld - var33;
									if (var49 > var39 && var49 > var41 && var49 > var43) {
										var38 = false;
									} else {
										var49 = var33 + ej.bs_fld;
										if (var49 < var44 && var49 < var46 && var49 < var48) {
											var38 = false;
										} else {
											var49 = ej.bs_fld - var33;
											if (var49 > var44 && var49 > var46 && var49 > var48) {
												var38 = false;
											} else {
												var38 = true;
											}
										}
									}
								}

								if (var38) {
									var49 = (int)(al_fld[var9] + al_fld[var10] + al_fld[var11]) / 3;
									lw.ar(var4, var49);
								}
							}
						}
					}
				}

				short var34 = this.cl_fld;
				boolean var35 = false;
				if (fc.ar_fld.au_fld.av()) {
					this.cl_fld = (short)this.bw_fld;
				} else if (this.ch_fld != null && this.ch_fld.av()) {
					fc.ar_fld.au_fld.ae(this.ch_fld);
					var35 = true;
				}

				try {
					if (!fc.an()) {
						this.ba(true);
					} else {
						fk var36 = this.ct_fld;
						if (var36 == fk.ak_fld) {
							if (fc.ar_fld.aa_fld != 0 && this.cv_fld != null) {
								var36 = fk.ag_fld;
							} else {
								var36 = fk.av_fld;
							}
						}

						switch (var36.ah_fld) {
							case 1:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								this.ba(false);
								break;
							case 2:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = 0;
								this.ba(true);
								fc.ar_fld.ap_fld = 0;
								fc.ar_fld.ad_fld = -1;
								this.ba(true);
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								break;
							case 3:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = -1;
								zg(this);
								break;
							case 4:
								fc.ar_fld.ap_fld = -1;
								fc.ar_fld.ad_fld = 0;
								zg(this);
						}
					}
				} finally {
					this.cl_fld = var34;
					if (var35) {
						fc.ar_fld.au_fld.ar();
					}
				}
			}
		} catch (Throwable var32) {
			throw new RuntimeException(var32);
		}
	}

	@ObfuscatedName("getFaceRenderPriorities")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] getFaceRenderPriorities() {
		return this.cx_fld;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fg() {
		try {
			for (int var1 = 0; var1 < this.bw_fld; var1++) {
				if (!as_fld[var1]) {
					zp(this, var1);
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	public void de(sp var1, int var2) {
		ea var3 = var1.ah_fld;
		ek var4 = var3.ag();
		if (var4 != null) {
			var4.ae(var1, var2);
			this.br(var4, sp.zf(var1, 679561783));
		}

		if (var1.ah()) {
			this.bz(var1, var2);
		}

		this.dw();
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void ft(boolean var1) {
		try {
			for (char var2 = 0; var2 < this.bw_fld; var2++) {
				if (!as_fld[var2]) {
					int var3 = (au_fld[this.ba_fld[var2]] + au_fld[this.bq_fld[var2]] + au_fld[this.bg_fld[var2]]) / 3 + this.cm_fld;
					char[] var10000 = aq_fld[var3];
					ai_fld[var3]++;
					var10000[ai_fld[var3]] = var2;
				}
			}

			if (this.cx_fld != null && var1) {
				this.bq();
			} else {
				for (int var8 = this.co_fld - 1; var8 >= 0; var8--) {
					char var9 = ai_fld[var8];
					if (var9 > 0) {
						char[] var4 = aq_fld[var8];

						for (int var5 = 0; var5 < var9; var5++) {
							zp(this, var4[var5]);
						}
					}
				}
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;I[IIII)V"
	)
	public void cl(rl21 var1, int var2, int[] var3, int var4, int var5, int var6) {
		if (var2 == 0) {
			int var7 = 0;
			var1.wh_fld = 0;
			var1.mw_fld = 0;
			var1.ci_fld = 0;

			for (int var8 = 0; var8 < var3.length; var8++) {
				int var9 = var3[var8];
				if (var9 < this.cu_fld.length) {
					int[] var10 = this.cu_fld[var9];

					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						var1.wh_fld = (int)(var1.wh_fld + this.yk_fld[var12]);
						var1.mw_fld = (int)(var1.mw_fld + this.vr_fld[var12]);
						var1.ci_fld = (int)(var1.ci_fld + this.qo_fld[var12]);
						var7++;
					}
				}
			}

			if (var7 > 0) {
				var1.wh_fld = var4 + var1.wh_fld / var7;
				var1.mw_fld = var5 + var1.mw_fld / var7;
				var1.ci_fld = var6 + var1.ci_fld / var7;
			} else {
				var1.wh_fld = var4;
				var1.mw_fld = var5;
				var1.ci_fld = var6;
			}
		} else if (var2 == 1) {
			for (int var18 = 0; var18 < var3.length; var18++) {
				int var22 = var3[var18];
				if (var22 < this.cu_fld.length) {
					int[] var26 = this.cu_fld[var22];

					for (int var30 = 0; var30 < var26.length; var30++) {
						int var34 = var26[var30];
						this.yk_fld[var34] = this.yk_fld[var34] + var4;
						this.vr_fld[var34] = this.vr_fld[var34] + var5;
						this.qo_fld[var34] = this.qo_fld[var34] + var6;
					}
				}
			}
		} else if (var2 == 2) {
			for (int var19 = 0; var19 < var3.length; var19++) {
				int var23 = var3[var19];
				if (var23 < this.cu_fld.length) {
					int[] var27 = this.cu_fld[var23];

					for (int var31 = 0; var31 < var27.length; var31++) {
						int var35 = var27[var31];
						this.yk_fld[var35] = this.yk_fld[var35] - var1.wh_fld;
						this.vr_fld[var35] = this.vr_fld[var35] - var1.mw_fld;
						this.qo_fld[var35] = this.qo_fld[var35] - var1.ci_fld;
						int var38 = (var4 & 0xFF) * 8;
						int var13 = (var5 & 0xFF) * 8;
						int var14 = (var6 & 0xFF) * 8;
						if (var14 != 0) {
							int var15 = fc.ah_fld[var14];
							int var16 = fc.aw_fld[var14];
							int var17 = var15 * (int)this.vr_fld[var35] + var16 * (int)this.yk_fld[var35] >> 16;
							this.vr_fld[var35] = var16 * (int)this.vr_fld[var35] - var15 * (int)this.yk_fld[var35] >> 16;
							this.yk_fld[var35] = var17;
						}

						if (var38 != 0) {
							int var40 = fc.ah_fld[var38];
							int var42 = fc.aw_fld[var38];
							int var44 = var42 * (int)this.vr_fld[var35] - var40 * (int)this.qo_fld[var35] >> 16;
							this.qo_fld[var35] = var40 * (int)this.vr_fld[var35] + var42 * (int)this.qo_fld[var35] >> 16;
							this.vr_fld[var35] = var44;
						}

						if (var13 != 0) {
							int var41 = fc.ah_fld[var13];
							int var43 = fc.aw_fld[var13];
							int var45 = var41 * (int)this.qo_fld[var35] + var43 * (int)this.yk_fld[var35] >> 16;
							this.qo_fld[var35] = var43 * (int)this.qo_fld[var35] - var41 * (int)this.yk_fld[var35] >> 16;
							this.yk_fld[var35] = var45;
						}

						this.yk_fld[var35] = this.yk_fld[var35] + var1.wh_fld;
						this.vr_fld[var35] = this.vr_fld[var35] + var1.mw_fld;
						this.qo_fld[var35] = this.qo_fld[var35] + var1.ci_fld;
					}
				}
			}
		} else if (var2 == 3) {
			for (int var20 = 0; var20 < var3.length; var20++) {
				int var24 = var3[var20];
				if (var24 < this.cu_fld.length) {
					int[] var28 = this.cu_fld[var24];

					for (int var32 = 0; var32 < var28.length; var32++) {
						int var36 = var28[var32];
						this.yk_fld[var36] = this.yk_fld[var36] - var1.wh_fld;
						this.vr_fld[var36] = this.vr_fld[var36] - var1.mw_fld;
						this.qo_fld[var36] = this.qo_fld[var36] - var1.ci_fld;
						this.yk_fld[var36] = var4 * (int)this.yk_fld[var36] / 128;
						this.vr_fld[var36] = var5 * (int)this.vr_fld[var36] / 128;
						this.qo_fld[var36] = var6 * (int)this.qo_fld[var36] / 128;
						this.yk_fld[var36] = this.yk_fld[var36] + var1.wh_fld;
						this.vr_fld[var36] = this.vr_fld[var36] + var1.mw_fld;
						this.qo_fld[var36] = this.qo_fld[var36] + var1.ci_fld;
					}
				}
			}
		} else if (var2 == 5 && this.ci_fld != null && this.cv_fld != null) {
			for (int var21 = 0; var21 < var3.length; var21++) {
				int var25 = var3[var21];
				if (var25 < this.ci_fld.length) {
					int[] var29 = this.ci_fld[var25];

					for (int var33 = 0; var33 < var29.length; var33++) {
						int var37 = var29[var33];
						int var39 = (this.cv_fld[var37] & 255) + var4 * 8;
						if (var39 < 0) {
							var39 = 0;
						} else if (var39 > 255) {
							var39 = 255;
						}

						this.cv_fld[var37] = (byte)var39;
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZLfn;[B)Lfn;"
	)
	fn ar(boolean var1, fn var2, byte[] var3) {
		this.wc(var1, var2, var3);
		var2.cz_fld = this.cz_fld;
		var2.bw_fld = this.bw_fld;
		var2.cb_fld = this.cb_fld;
		if (var2.yk_fld == null || var2.yk_fld.length < this.cz_fld) {
			var2.yk_fld = new float[this.cz_fld + 100];
			var2.vr_fld = new float[this.cz_fld + 100];
			var2.qo_fld = new float[this.cz_fld + 100];
		}

		for (int var4 = 0; var4 < this.cz_fld; var4++) {
			var2.yk_fld[var4] = this.yk_fld[var4];
			var2.vr_fld[var4] = this.vr_fld[var4];
			var2.qo_fld[var4] = this.qo_fld[var4];
		}

		if (var1) {
			var2.cv_fld = this.cv_fld;
		} else {
			var2.cv_fld = var3;
			if (this.cv_fld == null) {
				for (int var5 = 0; var5 < this.bw_fld; var5++) {
					var2.cv_fld[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.bw_fld; var6++) {
					var2.cv_fld[var6] = this.cv_fld[var6];
				}
			}
		}

		var2.ba_fld = this.ba_fld;
		var2.bq_fld = this.bq_fld;
		var2.bg_fld = this.bg_fld;
		var2.bb_fld = this.bb_fld;
		var2.cd_fld = this.cd_fld;
		var2.cc_fld = this.cc_fld;
		var2.cx_fld = this.cx_fld;
		var2.cq_fld = this.cq_fld;
		var2.cf_fld = this.cf_fld;
		var2.cy_fld = this.cy_fld;
		var2.cs_fld = this.cs_fld;
		var2.ce_fld = this.ce_fld;
		var2.cn_fld = this.cn_fld;
		var2.cr_fld = this.cr_fld;
		var2.cu_fld = this.cu_fld;
		var2.ci_fld = this.ci_fld;
		var2.ca_fld = this.ca_fld;
		var2.cg_fld = this.cg_fld;
		var2.cw_fld = this.cw_fld;
		var2.ch_fld = this.ch_fld;
		var2.cl_fld = this.cl_fld;
		var2.dw();
		return var2;
	}

	@ObfuscatedName("getOverrideHue")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Override
	public byte getOverrideHue() {
		return this.ch_fld != null ? this.ch_fld.ag_fld : 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfe;ILfe;I[I)V"
	)
	public static void bf(fn var0, fe var1, int var2, fe var3, int var4, int[] var5) {
		if (var0 == null) {
			var0.getClass();
		} else if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				eq var6 = var1.ak_fld[var2];
				eq var7 = var3.ak_fld[var4];
				ea var8 = var6.ae_fld;
				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				int var9 = 0;
				int var10 = var5[var9++];

				for (int var11 = 0; var11 < var6.ah_fld; var11++) {
					int var12 = var6.aw_fld[var11];

					while (var12 > var10) {
						var10 = var5[var9++];
					}

					if (var12 != var10 || var8.aw_fld[var12] == 0) {
						var0.ei(var8.aw_fld[var12], var8.ay_fld[var12], var6.ay_fld[var11], var6.as_fld[var11], var6.ar_fld[var11]);
					}
				}

				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				var9 = 0;
				var10 = var5[var9++];

				for (int var17 = 0; var17 < var7.ah_fld; var17++) {
					int var18 = var7.aw_fld[var17];

					while (var18 > var10) {
						var10 = var5[var9++];
					}

					if (var18 == var10 || var8.aw_fld[var18] == 0) {
						var0.ei(var8.aw_fld[var18], var8.ay_fld[var18], var7.ay_fld[var17], var7.as_fld[var17], var7.ar_fld[var17]);
					}
				}

				var0.dw();
			} else {
				var0.di(var1, var2);
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)Lfn;"
	)
	public fn ap(boolean var1) {
		return this.ay(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) {
		fm var2 = ff(this, var1);
		if (var2 == null) {
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			int var9 = aj_fld[var1];
			int var10 = ac_fld[var1];

			for (int var11 = 0; var11 < this.cz_fld; var11++) {
				int var12 = av.ak((int)this.yk_fld[var11], (int)this.qo_fld[var11], var9, var10);
				int var13 = (int)this.vr_fld[var11];
				int var14 = hv.ag((int)this.yk_fld[var11], (int)this.qo_fld[var11], var9, var10);
				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}

				if (var14 < var5) {
					var5 = var14;
				}

				if (var14 > var8) {
					var8 = var14;
				}
			}

			var2 = new fm(var1, (var6 + var3) / 2, (var7 + var4) / 2, (var8 + var5) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2, (var8 - var5 + 1) / 2);
			byte var16 = 32;
			if (var2.ae_fld < 32) {
				var2.ae_fld = 961439648;
			}

			if (var2.aw_fld < 32) {
				var2.aw_fld = -967064672;
			}

			if (this.cw_fld) {
				byte var17 = 8;
				var2.ae_fld += 8;
				var2.aw_fld += 8;
			}

			var2.ay_fld = this.cj_fld;
			this.cj_fld = var2;
		}
	}

	@ObfuscatedName("getOverrideSaturation")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	@Override
	public byte getOverrideSaturation() {
		return this.ch_fld != null ? this.ch_fld.az_fld : 0;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn getUnskewedModel() {
		return this.lf_fld;
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void gu(float var1) {
		if (var1 != 1.0F) {
			for (int var2 = 0; var2 < this.cz_fld; var2++) {
				this.vr_fld[var2] = (int)this.vr_fld[var2] * var1;
			}
		}
	}

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lsp;I)V"
	)
	public static void sb(fn var0, sp var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		ea var3 = var1.ah_fld;
		ek var4 = var3.ag();
		if (var4 != null) {
			var4.ae(var1, var2);
			var0.br(var4, sp.zf(var1, 1077668979));
		}

		if (var1.ah()) {
			var0.bz(var1, var2);
		}

		var0.dw();
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void lt() {
		for (int var1 = 0; var1 < this.cz_fld; var1++) {
			this.yk_fld[var1] = -((int)this.yk_fld[var1]);
			this.qo_fld[var1] = -((int)this.qo_fld[var1]);
		}

		this.dw();
	}

	@ObfuscatedName("getFaceIndices1")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getFaceIndices1() {
		return this.ba_fld;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V"
	)
	void et(ek var1, int var2) {
		this.cv(var1, var2);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)Ljava/awt/Shape;"
	)
	public Shape bz(dx var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[this.cz_fld];
		int[] var7 = new int[this.cz_fld];
		Perspective.modelToCanvas(og.ci_fld, var1, this.cz_fld, var2, var3, var5, var4, this.yk_fld, this.qo_fld, this.vr_fld, var6, var7);
		return Jarvis.convexHull(var6, var7);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Lea;Leq;Leq;FI)V"
	)
	public void hn(rl21 var1, ea var2, eq var3, eq var4, float var5, int var6) {
		if (var4 != null && var5 != 0.0F) {
			int var26 = 0;
			int var27 = 0;

			for (int var9 = 0; var9 < var2.ah_fld; var9++) {
				boolean var10 = false;
				if (var26 < var3.ah_fld && var3.aw_fld[var26] == var9) {
					var10 = true;
				}

				boolean var11 = false;
				if (var27 < var4.ah_fld && var4.aw_fld[var27] == var9) {
					var11 = true;
				}

				if (var10 || var11) {
					short var12 = 0;
					int var13 = var2.aw_fld[var9];
					if (var13 == 3) {
						var12 = 128;
					}

					int var14 = var12;
					int var15 = var12;
					int var16 = var12;
					if (var10) {
						var14 = var3.ay_fld[var26];
						var15 = var3.as_fld[var26];
						var16 = var3.ar_fld[var26];
						var26++;
					}

					int var17 = var12;
					int var18 = var12;
					int var19 = var12;
					if (var11) {
						var17 = var4.ay_fld[var27];
						var18 = var4.as_fld[var27];
						var19 = var4.ar_fld[var27];
						var27++;
					}

					float var20;
					float var21;
					float var22;
					if (var13 == 2) {
						int var23 = var17 - var14 & 0xFF;
						int var24 = var18 - var15 & 0xFF;
						int var25 = var19 - var16 & 0xFF;
						if (var23 >= 128) {
							var23 -= 256;
						}

						if (var24 >= 128) {
							var24 -= 256;
						}

						if (var25 >= 128) {
							var25 -= 256;
						}

						var20 = var14 + var23 * var5 / var6;
						var21 = var15 + var24 * var5 / var6;
						var22 = var16 + var25 * var5 / var6;
					} else if (var13 == 5) {
						var20 = var14;
						var21 = 0.0F;
						var22 = 0.0F;
					} else {
						var20 = var14 + (var17 - var14) * var5 / var6;
						var21 = var15 + (var18 - var15) * var5 / var6;
						var22 = var16 + (var19 - var16) * var5 / var6;
					}

					this.mv(var1, var13, var2.ay_fld[var9], var20, var21, var22);
				}
			}
		} else {
			for (int var7 = 0; var7 < var3.ah_fld; var7++) {
				int var8 = var3.aw_fld[var7];
				this.mv(var1, var2.aw_fld[var8], var2.ay_fld[var8], var3.ay_fld[var7], var3.as_fld[var7], var3.ar_fld[var7]);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lfn;"
	)
	public fn aw(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		int var14 = var6;
		int var12 = var4;
		int var11 = var3;
		int var10 = var2;
		int[][] var9 = var1;
		fn var8 = this;
		this.eu();
		int var15 = var2 - this.bi_fld;
		int var16 = var2 + this.bi_fld;
		int var17 = var4 - this.bi_fld;
		int var18 = var4 + this.bi_fld;
		fn var10000;
		if (var15 >= 0 && var16 + 128 >> 7 < var1.length && var17 >= 0 && var18 + 128 >> 7 < var1[0].length) {
			var15 >>= 7;
			var16 = var16 + 127 >> 7;
			var17 >>= 7;
			var18 = var18 + 127 >> 7;
			if (var1[var15][var17] == var3 && var1[var16][var17] == var3 && var1[var15][var18] == var3 && var1[var16][var18] == var3) {
				var10000 = this;
			} else {
				fn var19;
				if (var5) {
					var19 = new fn(this);
					var19.vr_fld = new float[var19.cz_fld];
				} else {
					var19 = this;
				}

				if (var6 == 0) {
					for (int var35 = 0; var35 < var19.cz_fld; var35++) {
						int var36 = (int)var8.yk_fld[var35] + var10;
						int var37 = (int)var8.qo_fld[var35] + var12;
						int var38 = var36 & 127;
						int var39 = var37 & 127;
						int var40 = var36 >> 7;
						int var41 = var37 >> 7;
						int var42 = var9[var40][var41] * (128 - var38) + var9[var40 + 1][var41] * var38 >> 7;
						int var43 = var9[var40][var41 + 1] * (128 - var38) + var9[var40 + 1][var41 + 1] * var38 >> 7;
						int var44 = var42 * (128 - var39) + var43 * var39 >> 7;
						var19.vr_fld[var35] = (int)var8.vr_fld[var35] + var44 - var11;
					}
				} else {
					for (int var20 = 0; var20 < var19.cz_fld; var20++) {
						int var21 = (-((int)var8.vr_fld[var20]) << 16) / var8.ez_fld;
						if (var21 < var14) {
							int var22 = (int)var8.yk_fld[var20] + var10;
							int var23 = (int)var8.qo_fld[var20] + var12;
							int var24 = var22 & 127;
							int var25 = var23 & 127;
							int var26 = var22 >> 7;
							int var27 = var23 >> 7;
							int var28 = var9[var26][var27] * (128 - var24) + var9[var26 + 1][var27] * var24 >> 7;
							int var29 = var9[var26][var27 + 1] * (128 - var24) + var9[var26 + 1][var27 + 1] * var24 >> 7;
							int var30 = var28 * (128 - var25) + var29 * var25 >> 7;
							var19.vr_fld[var20] = (int)var8.vr_fld[var20] + (var30 - var11) * (var14 - var21) / var14;
						} else {
							var19.vr_fld[var20] = var8.vr_fld[var20];
						}
					}
				}

				var19.dw();
				var10000 = var19;
			}
		} else {
			var10000 = this;
		}

		fn var7 = var10000;
		if (var7 != this && (client.jb_fld & 2) == 2 && var6 == 0) {
			var7.lf_fld = this;
		}

		return var7;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IFFFFFFFFFIII)V"
	)
	final void ff(
		int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12, int var13
	) {
		try {
			if (this.cf_fld != null && this.cf_fld[var1] != -1) {
				int var15;
				int var16;
				int var20;
				if (this.cq_fld != null && this.cq_fld[var1] != -1) {
					int var17 = this.cq_fld[var1] & -1865445309;
					var20 = this.ce_fld[var17];
					var15 = this.cn_fld[var17];
					var16 = this.cr_fld[var17];
				} else {
					var20 = this.ba_fld[var1];
					var15 = this.bq_fld[var1];
					var16 = this.bg_fld[var1];
				}

				if (this.cc_fld[var1] == -1) {
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
						ax_fld[var20],
						ax_fld[var15],
						ax_fld[var16],
						an_fld[var20],
						an_fld[var15],
						an_fld[var16],
						aa_fld[var20],
						aa_fld[var15],
						aa_fld[var16],
						this.cf_fld[var1]
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
						ax_fld[var20],
						ax_fld[var15],
						ax_fld[var16],
						an_fld[var20],
						an_fld[var15],
						an_fld[var16],
						aa_fld[var20],
						aa_fld[var15],
						aa_fld[var16],
						this.cf_fld[var1]
					);
				}
			} else {
				boolean var14 = this.bb(var1);
				if (this.cc_fld[var1] == -1 && var14) {
					fc.aj(var2, var3, var4, var5, var6, var7, var8, var9, var10, bm_fld[this.bb_fld[var1]]);
				} else if (this.cc_fld[var1] == -1) {
					fc.ab(var2, var3, var4, var5, var6, var7, var8, var9, var10, bm_fld[this.bb_fld[var1]]);
				} else if (var14) {
					fc.ac(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
				} else {
					fc.ao(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
				}
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bl() {
		this.dw();
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn rotateY90Ccw() {
		hw(this);
		return this;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void gg(int var1) {
		try {
			int var2 = fc.aw();
			int var3 = fc.ay();
			int var4 = 0;
			int var5 = this.ba_fld[var1];
			int var6 = this.bq_fld[var1];
			int var7 = this.bg_fld[var1];
			int var8 = aa_fld[var5];
			int var9 = aa_fld[var6];
			int var10 = aa_fld[var7];
			if (this.cv_fld == null) {
				fc.ar_fld.aj_fld = 0;
			} else {
				fc.ar_fld.aj_fld = this.cv_fld[var1] & -462305252;
			}

			if (var8 >= 50) {
				by_fld[var4] = (int)ar_fld[var5];
				bl_fld[var4] = (int)af_fld[var5];
				bo_fld[var4] = al_fld[var5];
				bx_fld[var4++] = this.bb_fld[var1];
			} else {
				int var11 = ax_fld[var5];
				int var12 = an_fld[var5];
				int var13 = this.bb_fld[var1];
				if (var10 >= 50) {
					int var14 = (50 - var8) * bd_fld[var10 - var8];
					by_fld[var4] = var2 + (var11 + ((ax_fld[var7] - var11) * var14 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var12 + ((an_fld[var7] - var12) * var14 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var13 + ((this.cc_fld[var1] - var13) * var14 >> 16);
				}

				if (var9 >= 50) {
					int var37 = (-1968405654 - var8) * bd_fld[var9 - var8];
					by_fld[var4] = var2 + (var11 + ((ax_fld[var6] - var11) * var37 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var12 + ((an_fld[var6] - var12) * var37 >> 16)) * fc.au() / -1802462414;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var13 + ((this.cd_fld[var1] - var13) * var37 >> 16);
				}
			}

			if (var9 >= -1122722146) {
				by_fld[var4] = (int)ar_fld[var6];
				bl_fld[var4] = (int)af_fld[var6];
				bo_fld[var4] = al_fld[var6];
				bx_fld[var4++] = this.cd_fld[var1];
			} else {
				int var28 = ax_fld[var6];
				int var31 = an_fld[var6];
				int var34 = this.cd_fld[var1];
				if (var8 >= 50) {
					int var38 = (338403081 - var9) * bd_fld[var8 - var9];
					by_fld[var4] = var2 + (var28 + ((ax_fld[var5] - var28) * var38 >> 16)) * fc.au() / 1611400996;
					bl_fld[var4] = var3 + (var31 + ((an_fld[var5] - var31) * var38 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var34 + ((this.bb_fld[var1] - var34) * var38 >> 16);
				}

				if (var10 >= 445059720) {
					int var39 = (1578750127 - var9) * bd_fld[var10 - var9];
					by_fld[var4] = var2 + (var28 + ((ax_fld[var7] - var28) * var39 >> 16)) * fc.au() / 547071816;
					bl_fld[var4] = var3 + (var31 + ((an_fld[var7] - var31) * var39 >> 16)) * fc.au() / 50;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var34 + ((this.cc_fld[var1] - var34) * var39 >> 16);
				}
			}

			if (var10 >= -1504529718) {
				by_fld[var4] = (int)ar_fld[var7];
				bl_fld[var4] = (int)af_fld[var7];
				bo_fld[var4] = al_fld[var7];
				bx_fld[var4++] = this.cc_fld[var1];
			} else {
				int var29 = ax_fld[var7];
				int var32 = an_fld[var7];
				int var35 = this.cc_fld[var1];
				if (var9 >= 50) {
					int var40 = (50 - var10) * bd_fld[var9 - var10];
					by_fld[var4] = var2 + (var29 + ((ax_fld[var6] - var29) * var40 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var32 + ((an_fld[var6] - var32) * var40 >> 16)) * fc.au() / -1747552677;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var35 + ((this.cd_fld[var1] - var35) * var40 >> 16);
				}

				if (var8 >= 50) {
					int var41 = (50 - var10) * bd_fld[var8 - var10];
					by_fld[var4] = var2 + (var29 + ((ax_fld[var5] - var29) * var41 >> 16)) * fc.au() / 50;
					bl_fld[var4] = var3 + (var32 + ((an_fld[var5] - var32) * var41 >> 16)) * fc.au() / 1277797542;
					bo_fld[var4] = 50.0F;
					bx_fld[var4++] = var35 + ((this.bb_fld[var1] - var35) * var41 >> 16);
				}
			}

			int var30 = by_fld[0];
			int var33 = by_fld[1];
			int var36 = by_fld[2];
			int var42 = bl_fld[0];
			int var15 = bl_fld[1];
			int var16 = bl_fld[2];
			int var17 = this.cy_fld == null ? 0 : this.cy_fld[var1] * 2;
			float var18 = ap.av(bo_fld[0] - var17);
			float var19 = ap.av(bo_fld[1] - var17);
			float var20 = ap.av(bo_fld[2] - var17);
			fc.ar_fld.ax_fld = false;
			int var21 = fc.ax();
			if (var4 == 3) {
				if (var30 < 0 || var33 < 0 || var36 < 0 || var30 > var21 || var33 > var21 || var36 > var21) {
					fc.ar_fld.ax_fld = true;
				}

				this.cd(var1, var42, var15, var16, var30, var33, var36, var18, var19, var20, bx_fld[0], bx_fld[1], bx_fld[2]);
			}

			if (var4 == 4) {
				if (var30 < 0 || var33 < 0 || var36 < 0 || var30 > var21 || var33 > var21 || var36 > var21 || by_fld[3] < 0 || by_fld[3] > var21) {
					fc.ar_fld.ax_fld = true;
				}

				if (this.cf_fld != null && this.cf_fld[var1] != -1) {
					int var24;
					int var43;
					int var45;
					if (this.cq_fld != null && this.cq_fld[var1] != -1) {
						int var25 = this.cq_fld[var1] & 255;
						var43 = this.ce_fld[var25];
						var45 = this.cn_fld[var25];
						var24 = this.cr_fld[var25];
					} else {
						var43 = var5;
						var45 = var6;
						var24 = var7;
					}

					short var46 = this.cf_fld[var1];
					if (this.cc_fld[var1] == -1) {
						fc.ap(
							var42,
							var15,
							var16,
							var30,
							var33,
							var36,
							var18,
							var19,
							var20,
							this.bb_fld[var1],
							this.bb_fld[var1],
							this.bb_fld[var1],
							ax_fld[var43],
							ax_fld[var45],
							ax_fld[var24],
							an_fld[var43],
							an_fld[var45],
							an_fld[var24],
							aa_fld[var43],
							aa_fld[var45],
							aa_fld[var24],
							var46
						);
						fc.ap(
							var42,
							var16,
							bl_fld[3],
							var30,
							var36,
							by_fld[3],
							var18,
							var20,
							bo_fld[3],
							this.bb_fld[var1],
							this.bb_fld[var1],
							this.bb_fld[var1],
							ax_fld[var43],
							ax_fld[var45],
							ax_fld[var24],
							an_fld[var43],
							an_fld[var45],
							an_fld[var24],
							aa_fld[var43],
							aa_fld[var45],
							aa_fld[var24],
							var46
						);
					} else {
						fc.ap(
							var42,
							var15,
							var16,
							var30,
							var33,
							var36,
							var18,
							var19,
							var20,
							bx_fld[0],
							bx_fld[1],
							bx_fld[2],
							ax_fld[var43],
							ax_fld[var45],
							ax_fld[var24],
							an_fld[var43],
							an_fld[var45],
							an_fld[var24],
							aa_fld[var43],
							aa_fld[var45],
							aa_fld[var24],
							var46
						);
						fc.ap(
							var42,
							var16,
							bl_fld[3],
							var30,
							var36,
							by_fld[3],
							var18,
							var20,
							bo_fld[3],
							bx_fld[0],
							bx_fld[2],
							bx_fld[3],
							ax_fld[var43],
							ax_fld[var45],
							ax_fld[var24],
							an_fld[var43],
							an_fld[var45],
							an_fld[var24],
							aa_fld[var43],
							aa_fld[var45],
							aa_fld[var24],
							var46
						);
					}
				} else {
					boolean var22 = this.bb(var1);
					if (this.cc_fld[var1] == -1 && var22) {
						int var44 = bm_fld[this.bb_fld[var1]];
						fc.aj(var42, var15, var16, var30, var33, var36, var18, var19, var20, var44);
						fc.aj(var42, var16, bl_fld[3], var30, var36, by_fld[3], var18, var20, bo_fld[3], var44);
					} else if (this.cc_fld[var1] == -1) {
						int var23 = bm_fld[this.bb_fld[var1]];
						fc.ab(var42, var15, var16, var30, var33, var36, var18, var19, var20, var23);
						fc.ab(var42, var16, bl_fld[3], var30, var36, by_fld[3], var18, var20, bo_fld[3], var23);
					} else if (var22) {
						fc.ac(var42, var15, var16, var30, var33, var36, var18, var19, var20, bx_fld[0], bx_fld[1], bx_fld[2]);
						fc.ac(var42, var16, bl_fld[3], var30, var36, by_fld[3], var18, var20, bo_fld[3], bx_fld[0], bx_fld[2], bx_fld[3]);
					} else {
						fc.ao(var42, var15, var16, var30, var33, var36, var18, var19, var20, bx_fld[0], bx_fld[1], bx_fld[2]);
						fc.ao(var42, var16, bl_fld[3], var30, var36, by_fld[3], var18, var20, bo_fld[3], bx_fld[0], bx_fld[2], bx_fld[3]);
					}
				}
			}
		} catch (Throwable var27) {
			throw new RuntimeException(var27);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bx(int var1) {
		if (var1 != 0) {
			for (int var2 = 0; var2 < this.cz_fld; var2++) {
				this.vr_fld[var2] = this.vr_fld[var2] + var1;
			}
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V"
	)
	void go(ek var1, int var2) {
		if (this.ca_fld != null) {
			for (int var3 = 0; var3 < this.cz_fld; var3++) {
				int[] var4 = this.ca_fld[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.cg_fld[var3];
					uy.dc(bk_fld, -1948389027);

					for (int var6 = 0; var6 < var4.length; var6++) {
						int var7 = var4[var6];
						si var8 = ek.mt(var1, var7, (byte)4);
						if (var8 != null) {
							bj_fld.ar(var5[var6] / 255.0F);
							uy.nf(bf_fld, var8.ay(var2), (byte)8);
							bf_fld.al(bj_fld);
							bk_fld.au(bf_fld);
						}
					}

					this.cq(var3, bk_fld);
				}
			}
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V"
	)
	void gn(ek var1, int var2) {
		if (this.ca_fld != null) {
			for (int var3 = 0; var3 < this.cz_fld; var3++) {
				int[] var4 = this.ca_fld[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.cg_fld[var3];
					uy.dc(bk_fld, -1217214402);

					for (int var6 = 0; var6 < var4.length; var6++) {
						int var7 = var4[var6];
						si var8 = ek.mt(var1, var7, (byte)4);
						if (var8 != null) {
							bj_fld.ar(var5[var6] / 255.0F);
							uy.nf(bf_fld, var8.ay(var2), (byte)12);
							bf_fld.al(bj_fld);
							bk_fld.au(bf_fld);
						}
					}

					this.cq(var3, bk_fld);
				}
			}
		}
	}

	@ObfuscatedName("setUvBufferOffset")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setUvBufferOffset(int var1) {
		this.oq_fld = var1;
	}

	@ObfuscatedName("zp")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V"
	)
	public static void zp(fn var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.cv_fld == null) {
				fc.ar_fld.aj_fld = 0;
			} else {
				fc.ar_fld.aj_fld = (var0.cv_fld[var1] == -1 ? 253 : var0.cv_fld[var1]) & 255;
			}

			if (fc.ar_fld.aa_fld != 1 || fc.ar_fld.aj_fld != 0) {
				if (fc.ar_fld.aa_fld != 0 || fc.ar_fld.aj_fld == 0) {
					if (ay_fld[var1]) {
						var0.cc(var1);
					} else {
						int var2 = var0.ba_fld[var1];
						int var3 = var0.bq_fld[var1];
						int var4 = var0.bg_fld[var1];
						fc.ar_fld.ax_fld = aw_fld[var1];
						int var5 = var0.cy_fld == null ? 0 : var0.cy_fld[var1] * 2;
						float var6 = ap.av(al_fld[var2] - var5);
						float var7 = ap.av(al_fld[var3] - var5);
						float var8 = ap.av(al_fld[var4] - var5);
						var0.cd(
							var1,
							af_fld[var2],
							af_fld[var3],
							af_fld[var4],
							ar_fld[var2],
							ar_fld[var3],
							ar_fld[var4],
							var6,
							var7,
							var8,
							var0.bb_fld[var1],
							var0.cd_fld[var1],
							var0.cc_fld[var1]
						);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ap() {
		this.ck_fld = 0;
		this.cj_fld = null;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ej(int var1) {
		if (var1 != 0) {
			for (int var2 = 0; var2 < this.cz_fld; var2++) {
				this.vr_fld[var2] = (int)this.vr_fld[var2] + var1;
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Z)Lfn;"
	)
	public fn cl(boolean var1) {
		if (!var1 && bh_fld.length < this.bw_fld) {
			bh_fld = new byte[this.bw_fld + -1731350485];
		}

		return this.ar(var1, bs_fld, bh_fld);
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lfk;)V"
	)
	void gk(fk var1) {
		this.ct_fld = var1;
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Lsp;I)V"
	)
	public void pe(rl21 var1, sp var2, int var3) {
		ea var4 = var2.ah_fld;
		ek var5 = var4.as_fld;
		if (var5 != null) {
			var5.xv(var1, var2, var3, null, false);
			this.bm(var1, var5, var2.aw_fld);
		}

		if (var2.ay_fld) {
			this.ur(var2, var3);
		}

		this.bl();
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)Lfm;"
	)
	fm dq(int var1) {
		for (fm var2 = this.cj_fld; var2 != null; var2 = var2.ay_fld) {
			if (var2.ak_fld == var1) {
				return var2;
			}
		}

		return null;
	}

	@ObfuscatedName("drawOrtho")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	@Override
	public void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		this.bi(var1, var2, var3, var4, var5, var6, var7, var8);
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)Lfm;"
	)
	public static fm ff(fn var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			for (fm var2 = var0.cj_fld; var2 != null; var2 = var2.ay_fld) {
				if (var2.ak_fld == var1) {
					return var2;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("getRadius")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRadius() {
		return this.cm_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V"
	)
	public void bd(sp var1, int var2) {
		ea var3 = var1.ah_fld;
		ek var4 = var3.ag();
		if (var4 != null) {
			var4.ae(var1, var2);
			this.cv(var4, sp.zf(var1, 1077668979));
		}

		if (var1.ah()) {
			this.ep(var1, var2);
		}

		this.bf();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lfe;ILfe;I[I)V"
	)
	public void be(fe var1, int var2, fe var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				eq var6 = var1.ak_fld[var2];
				eq var7 = var3.ak_fld[var4];
				ea var8 = var6.ae_fld;
				bv_fld = 0;
				bv_fld = 0;
				bv_fld = 0;
				int var9 = 0;
				int var10 = var5[var9++];

				for (int var11 = 0; var11 < var6.ah_fld; var11++) {
					int var12 = var6.aw_fld[var11];

					while (var12 > var10) {
						var10 = var5[var9++];
					}

					if (var12 != var10 || var8.aw_fld[var12] == 0) {
						this.eq(var8.aw_fld[var12], var8.ay_fld[var12], var6.aw_fld[var11], var6.ar_fld[var11], var6.as_fld[var11]);
					}
				}

				bt_fld = 0;
				bt_fld = 0;
				bt_fld = 0;
				var9 = 0;
				var10 = var5[var9++];

				for (int var17 = 0; var17 < var7.ah_fld; var17++) {
					int var18 = var7.aw_fld[var17];

					while (var18 > var10) {
						var10 = var5[var9++];
					}

					if (var18 == var10 || var8.aw_fld[var18] == 0) {
						this.bj(var8.aw_fld[var18], var8.ay_fld[var18], var7.ay_fld[var17], var7.as_fld[var17], var7.ar_fld[var17]);
					}
				}

				this.ap();
			} else {
				this.di(var1, var2);
			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(ILuy;)V"
	)
	void gc(int var1, uy var2) {
		float var3 = (int)this.vr_fld[var1];
		float var4 = -((int)this.qo_fld[var1]);
		float var5 = -((int)this.qo_fld[var1]);
		float var6 = 1.0F;
		this.vr_fld[var1] = var2.ok_fld * var3 + var2.va_fld * var4 + var2.bp_fld * var5 + var2.rw_fld * var6;
		this.vr_fld[var1] = -((int)(var2.or_fld * var3 + var2.kh_fld * var4 + var2.kh_fld * var5 + var2.ja_fld * var6));
		this.yk_fld[var1] = -((int)(var2.ok_fld * var3 + var2.ih_fld * var4 + var2.or_fld * var5 + var2.or_fld * var6));
	}

	@ObfuscatedName("getFaceIndices3")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getFaceIndices3() {
		return this.bg_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bw() {
		try {
			for (int var1 = 0; var1 < this.ib_fld; var1++) {
				if (!aw_fld[var1]) {
					zp(this, var1);
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("yg")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;I[IIII)V"
	)
	public void yg(rl21 var1, int var2, int[] var3, int var4, int var5, int var6) {
		if ((client.jb_fld & 8) != 0) {
			this.mv(var1, var2, var3, var4, var5, var6);
		} else {
			this.cl(var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bg(int var1) {
		try {
			if (this.cv_fld == null) {
				fc.ar_fld.aj_fld = 0;
			} else {
				fc.ar_fld.be_fld = (this.cv_fld[var1] == -1 ? 253 : this.cv_fld[var1]) & 255;
			}

			if (fc.ar_fld.aj_fld != 1 || fc.ar_fld.ao_fld != 0) {
				if (fc.ar_fld.al_fld != 0 || fc.ar_fld.al_fld == 0) {
					if (ay_fld[var1]) {
						this.fr(var1);
					} else {
						int var2 = this.bq_fld[var1];
						int var3 = this.bq_fld[var1];
						int var4 = this.cc_fld[var1];
						fc.ar_fld.ax_fld = aw_fld[var1];
						int var5 = this.cx_fld == null ? 0 : this.cy_fld[var1] * 2;
						float var6 = ap.av(af_fld[var2] - var5);
						float var7 = ap.av(af_fld[var3] - var5);
						float var8 = ap.av(bo_fld[var4] - var5);
						this.ff(
							var1,
							ar_fld[var2],
							bz_fld[var3],
							bo_fld[var4],
							bo_fld[var2],
							af_fld[var3],
							bz_fld[var4],
							var6,
							var7,
							var8,
							this.ce_fld[var1],
							this.bu_fld[var1],
							this.bg_fld[var1]
						);
					}
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("getTexIndices1")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getTexIndices1() {
		return this.ce_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lfy;S)V"
	)
	public void cx(fy var1, short var2) {
		if (var1 == null) {
			rl1.lx(this);
		} else {
			if (this.ch_fld == null) {
				this.ch_fld = new fy();
			}

			this.ch_fld.ah(var1);
			this.cl_fld = var2;
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lfe;ILfe;I[I)V"
	)
	public static void el(fn var0, fe var1, int var2, fe var3, int var4, int[] var5) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				eq var6 = var1.ak_fld[var2];
				eq var7 = var3.ak_fld[var4];
				ea var8 = var6.ae_fld;
				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				int var9 = 0;
				int var10 = var5[var9++];

				for (int var11 = 0; var11 < var6.ah_fld; var11++) {
					int var12 = var6.aw_fld[var11];

					while (var12 > var10) {
						var10 = var5[var9++];
					}

					if (var12 != var10 || var8.aw_fld[var12] == 0) {
						var0.ei(var8.aw_fld[var12], var8.ay_fld[var12], var6.ay_fld[var11], var6.as_fld[var11], var6.ar_fld[var11]);
					}
				}

				bp_fld = 0;
				bt_fld = 0;
				bv_fld = 0;
				var9 = 0;
				var10 = var5[var9++];

				for (int var17 = 0; var17 < var7.ah_fld; var17++) {
					int var18 = var7.aw_fld[var17];

					while (var18 > var10) {
						var10 = var5[var9++];
					}

					if (var18 == var10 || var8.aw_fld[var18] == 0) {
						var0.ei(var8.aw_fld[var18], var8.ay_fld[var18], var7.ay_fld[var17], var7.as_fld[var17], var7.ar_fld[var17]);
					}
				}

				var0.dw();
			} else {
				var0.di(var1, var2);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aj() {
		this.ch_fld = null;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dl() {
		for (int var1 = 0; var1 < this.cp_fld; var1++) {
			float var2 = this.qo_fld[var1];
			this.yk_fld[var1] = this.yk_fld[var1];
			this.qo_fld[var1] = -var2;
		}

		this.bl();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	public void cp(float var1) {
		if (var1 != 1.0F) {
			for (int var2 = 0; var2 < this.cb_fld; var2++) {
				this.vr_fld[var2] = this.vr_fld[var2] * var1;
			}
		}
	}
}
