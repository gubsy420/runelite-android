import com.google.common.collect.ImmutableSet;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.runelite.api.Actor;
import net.runelite.api.IterableHashTable;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.OverheadTextChanged;

@ObfuscatedName("da")
@Implements({"Actor"})
public abstract class da extends em implements xl, Actor {
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -783619985
	)
	int ck_fld;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1252097089
	)
	int cn_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	List bh_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	no bk_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bj_fld;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Set;"
	)
	public static Set ow_fld = ImmutableSet.of(0, 2, 16, 17, 18, 19, new Integer[]{20, 21, 22});
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa cw_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -997542447
	)
	int ci_fld;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean nf_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -744034465
	)
	int bf_fld;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float gt_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1857618981
	)
	int bq_fld;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1009984759
	)
	int dm_fld;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 570497549
	)
	int co_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1559125397
	)
	int bc_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean an_fld;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -143157147
	)
	int dh_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 760936839
	)
	int cr_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa cz_fld;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 211698817
	)
	int cj_fld;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv cb_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 183519091
	)
	int bl_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -442509245
	)
	int bx_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1856618613
	)
	int dc_fld;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2009092031
	)
	int cl_fld;
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float uk_fld;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte tc_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -588012999
	)
	int cy_fld;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1382909849
	)
	int dt_fld;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -686799443
	)
	int dz_fld;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -126880905
	)
	int dr_fld;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean nx_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -143797063
	)
	int cc_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1903557461
	)
	int bp_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bn_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String cx_fld;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean cs_fld;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean cp_fld;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -786581447
	)
	int dl_fld;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1647819403
	)
	int cu_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bs_fld;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] do_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	bb cg_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1581158923
	)
	int bw_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa cm_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2119824673
	)
	int bt_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 791409263
	)
	int cq_fld;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -744034465
	)
	int ct_fld;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1126782829
	)
	int da_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int by_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -351151733
	)
	int ba_fld;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1074071813
	)
	int dv_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	fy be_fld = new fy();
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -900515773
	)
	int bv_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -309406545
	)
	int bb_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 338376229
	)
	int bu_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1950304843
	)
	int cd_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1528231089
	)
	int cv_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2080232115
	)
	int cf_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1254596105
	)
	int bi_fld;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[Lgt;"
	)
	gt[] dd_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ca_fld;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] dq_fld;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1010277063
	)
	int bg_fld;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 127491587
	)
	int ch_fld;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	public static da om_fld;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 685222699
	)
	int ce_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1100713367
	)
	int bo_fld;

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kt() {
		return qa.ps(this.cm_fld, (byte)-123);
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int dt(byte var1) {
		return qa.ps(this.cw_fld, (byte)-84);
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void fy(int var1, byte var2) {
		try {
			qa.hs(this.cw_fld, var1, -509097172);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	public int ae(byte var1) {
		try {
			qa var2 = this.ew((byte)73);
			qa var3 = yp(this, var2, 616643313);
			qa var4 = var3;
			if (var3 == null) {
				var4 = this.cm_fld;
				if (null == var4) {
					var4 = this.cz_fld;
				}
			}

			return qa.jv(var4, 1681195542) ? qa.kw(var4, 731528508).bp_fld * 67262061 : 0;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	public abstract fy ch();

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldx;Ldx;II)I"
	)
	public static int sd(da var0, dx var1, dx var2, int var3, int var4) {
		return lk.cd(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void do_(int var1) {
		try {
			qa.gr(this.cm_fld, -1541149531);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void fi() {
		this.ce_fld = 0;
		this.bg_fld = 0;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IILgt;B)V"
	)
	void dr(int var1, int var2, gt var3, byte var4) {
		if (this.ce_fld < 9) {
			if (var4 >= 8) {
				return;
			}

			this.ce_fld++;
		}

		for (int var5 = this.ce_fld; var5 > 0; var5--) {
			this.ca_fld[var5] = this.ca_fld[var5 - 1];
			this.dq_fld[var5] = this.dq_fld[var5 - 1];
			this.dd_fld[var5] = this.dd_fld[var5 - 1];
		}

		this.ca_fld[0] = var1;
		this.dq_fld[0] = var2;
		this.dd_fld[0] = var3;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	@Export("abortRoute")
	final void abortRoute(byte var1) {
		this.ce_fld = 0;
		this.bg_fld = 0;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void nd(int var1) {
		this.uk_fld = this.dm_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bm(int var1) {
		return false;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void oj(int var1, int var2, int var3, int var4, int var5) {
		try {
			du var6 = du.xd_fld;
			if (var6 == null) {
				var6 = new du();
				py var7 = py.pm(var1);
				if (var7.ac_fld != null) {
					var7 = var7.tf();
					if (var7 == null) {
						return;
					}
				}

				var6.sq(var1, var2, var3 + var4 + var7.ao_fld);
			}

			HitsplatApplied var10 = new HitsplatApplied();
			var10.setActor(this);
			var10.setHitsplat(var6);
			og.ci_fld.getCallbacks().post(var10);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lda;IB)V"
	)
	public static void mj(da var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cg_fld.af_fld = var1 * 1215197091;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hw_int() {
		return this.dm_fld;
	}

	@ObfuscatedName("removeSpotAnim")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("removeSpotAnim")
	@Override
	public void removeSpotAnim(int var1) {
		rq var2 = (rq)sq.jx(this.ti(), var1);
		if (var2 != null) {
			var2.pz_void();
			this.da_fld = this.da_fld * -1126782829 - 1;
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fj() {
		return qa.ps(this.cm_fld, (byte)-27);
	}

	da(int var1) {
		this.bh_fld = new ArrayList(4);
		this.bk_fld = new no();
		this.bj_fld = false;
		this.bs_fld = -1547875309;
		this.ct_fld = -63892773;
		this.bf_fld = 0;
		this.an_fld = false;
		this.bn_fld = 1283255373;
		this.cr_fld = 1804501961;
		this.bl_fld = -390804923;
		this.cj_fld = 1735001215;
		this.dr_fld = -1736627783;
		this.cy_fld = 906384375;
		this.bx_fld = -302068843;
		this.dc_fld = -1430908963;
		this.cl_fld = 1064017983;
		this.dl_fld = 723732983;
		this.dt_fld = -1891294377;
		this.dz_fld = -2026858021;
		this.ba_fld = -1193412131;
		this.cc_fld = 1154485879;
		this.bp_fld = -1351494141;
		this.co_fld = -1841939653;
		this.cx_fld = null;
		this.st(-1);
		this.cp_fld = false;
		this.ci_fld = 1304444708;
		this.cu_fld = 0;
		this.ck_fld = 0;
		this.do_fld = null;
		this.cg_fld = new bb();
		this.cw_fld = new qa();
		this.cm_fld = new qa();
		this.cz_fld = new qa();
		this.cq_fld = 0;
		this.cb_fld = new xv(4);
		this.da_fld = 0;
		this.cd_fld = -1518404952;
		this.cf_fld = 0;
		this.bw_fld = -1694682016;
		this.ce_fld = 0;
		this.ca_fld = new int[10];
		this.dq_fld = new int[10];
		this.dd_fld = new gt[10];
		this.ch_fld = 0;
		this.bg_fld = 0;
		this.bo_fld = 1574452697;
		this.bq_fld = var1;
		this.nt();
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)Lxv;"
	)
	xv dg(int var1) {
		return this.cb_fld;
	}

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIIIIB)V"
	)
	public static void zn(da var0, int var1, int var2, int var3, int var4, int var5, byte var6) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.ur(var1, var2, var3, var4, var5);
				if (var1 >= 0) {
					if (var6 >= 0) {
						var0.oj(var1, var2, var3, var4, var5);
						return;
					}

					if (var5 > 0) {
						boolean var7 = var0.bh_fld.size() >= var5;
						int var8 = 0;

						for (int var9 = 0; var9 < var0.bh_fld.size(); var9++) {
							du var10 = (du)(du)var0.bh_fld.get(var9);
							if (var10.az(-32809735) > var3) {
								var8 = (1 + var9) % var5;
							} else {
								var7 = false;
							}
						}

						py var16 = gf.ak(var1);
						if (null != var16.ac_fld) {
							var16 = var16.av();
							if (null == var16) {
								var0.oj(var1, var2, var3, var4, var5);
								return;
							}
						}

						int var17 = var16.ax_fld;
						int var11 = -1;
						if (var7) {
							if (-1 == var17) {
								if (var6 >= 0) {
									var0.oj(var1, var2, var3, var4, var5);
									return;
								}

								var0.oj(var1, var2, var3, var4, var5);
								return;
							}

							int var12 = 0;

							for (int var13 = 0; var13 < var0.bh_fld.size(); var13++) {
								du var14 = (du)(du)var0.bh_fld.get(var13);
								if (var17 == 0) {
									if (0 != var13) {
										if (var6 >= 0) {
											var0.oj(var1, var2, var3, var4, var5);
											return;
										}

										if (var14.az(-32809735) >= var12) {
											continue;
										}
									}

									var11 = var13;
									var12 = var14.az(-32809735);
								} else if (1 == var17 && (var13 == 0 || var14.av(-1409959564) < var12)) {
									var11 = var13;
									var12 = var14.av(-1409959564);
								}
							}

							if (var17 == 1) {
								if (var6 >= 0) {
									var0.oj(var1, var2, var3, var4, var5);
									return;
								}

								if (var12 >= var2) {
									var0.oj(var1, var2, var3, var4, var5);
									return;
								}
							}
						} else {
							if (var5 > 4) {
								var8 = 0;
							}

							for (int var18 = 0; var18 < var5; var18++) {
								int var20 = var8;
								var8 = (1 + var8) % var5;
								if (var20 >= var0.bh_fld.size()) {
									var0.bh_fld.add(new du());
									var11 = var0.bh_fld.size() - 1;
									break;
								}

								du var21 = (du)(du)var0.bh_fld.get(var20);
								if (var21.az(-32809735) <= var3) {
									var11 = var20;
									break;
								}
							}
						}

						if (var11 < 0) {
							var0.oj(var1, var2, var3, var4, var5);
							return;
						}

						du var19 = (du)(du)var0.bh_fld.get(var11);
						var19.ak(var1, var2, var4 + var3 + var16.ao_fld, -1045138312);
						var0.oj(var1, var2, var3, var4, var5);
						return;
					}
				}

				var0.oj(var1, var2, var3, var4, var5);
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("setIdleRotateLeft")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setIdleRotateLeft")
	@Override
	public void setIdleRotateLeft(int var1) {
		this.bl_fld = var1;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIII)V"
	)
	public static void lg(da var0, int var1, int var2, int var3, int var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var5 = var4 + client.dv_fld;
			rq var6 = (rq)var0.cb_fld.ak(var1);
			if (var6 != null) {
				var6.gy();
				var0.da_fld--;
			}

			if (var2 != 65535 && var2 != -1) {
				var0.cb_fld.ag(new rq(var2, var3, var5, var0), var1);
				var0.da_fld++;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("createSpotAnim")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Export("createSpotAnim")
	@Override
	public void createSpotAnim(int var1, int var2, int var3, int var4) {
		try {
			xv var5 = this.ti();
			rq var6 = (rq)sq.jx(var5, var1);
			if (var6 != null) {
				var6.pz_void();
				this.da_fld = this.da_fld * -1126782829 - 1;
			}

			if (var2 != -1) {
				lv.ap(var5, new rq(var2, var3, og.ci_fld.getGameCycle() + var4, this), var1);
				this.da_fld = this.da_fld * -1126782829 + 1;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean dy(int var1) {
		try {
			qa var2 = this.ew((byte)-46);
			if (null != var2 && qa.jv(var2, 2017603156) && qa.kw(var2, 565354421).ar(var2.aw(-1664336392), (byte)32)) {
				return true;
			} else {
				qa var3 = yp(this, var2, 1766785672);
				return var3 != null && qa.jv(var3, -1194616555) && qa.kw(var3, -1248308880).ar(var3.aw(-1781249902), (byte)104)
					? true
					: null == var2 && var3 == null && qa.jv(this.cz_fld, 1640387205) && qa.kw(this.cz_fld, 710050803).ar(this.cz_fld.aw(-1386044110), (byte)6);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ad_int() {
		try {
			qa var1 = this.ew((byte)-2);
			qa var2 = yp(this, var1, 335792845);
			qa var3 = var2;
			if (var2 == null) {
				var3 = this.cm_fld;
				if (null == var3) {
					var3 = this.cz_fld;
				}
			}

			return qa.jv(var3, 2042455725) ? qa.kw(var3, -1230307260).bp_fld * 820843271 : 0;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int jh() {
		return qa.ps(this.cw_fld, (byte)-117);
	}

	@ObfuscatedName("getOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOrientation")
	@Override
	public int getOrientation() {
		return this.bt_fld;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dj(int var1) {
		return this.dm_fld;
	}

	@ObfuscatedName("getGraphicHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getGraphicHeight")
	@Override
	public int getGraphicHeight() {
		Iterator var1 = this.ti().iterator();
		if (var1.hasNext()) {
			rq var2 = (rq)(rq)var1.next();
			return var2.getHeight();
		} else {
			return 0;
		}
	}

	@ObfuscatedName("getFootprintSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getFootprintSize")
	@Override
	public int getFootprintSize() {
		return this.br((byte)115);
	}

	@ObfuscatedName("za")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void za(da var0) throws EOFException {
		try {
			if (var0.bv_fld >= client.dv_fld) {
				int var14 = Math.max(1, var0.bv_fld - client.dv_fld);
				int var18 = var0.bn_fld * 64 + var0.by_fld * 128;
				int var20 = var0.bn_fld * 64 + var0.dv_fld;
				var0.bi_fld = var0.bi_fld * -1254596105 + (var18 - var0.bi_fld) / var14;
				var0.dm_fld = var0.dm_fld * -1009984759 + (var20 - var0.dm_fld) / var14;
				var0.gt_fld = var0.bi_fld;
				var0.uk_fld = var0.dm_fld;
				var0.ch_fld = 0;
				var0.bt_fld = var0.bu_fld;
			} else if (var0.bb_fld >= client.dv_fld) {
				boolean var13 = var0.bb_fld == client.dv_fld || var0.cm_fld.az_fld == null || var0.cq_fld != 0;
				if (!var13) {
					ol var16 = var0.cm_fld.az_fld;
					if (var16 != null && !var16.isMayaAnim()) {
						var13 = var0.cm_fld.av_fld * 1668710195 + 1 > var16.bf_fld[var0.cm_fld.ae_fld * 249909987];
					} else {
						var13 = true;
					}
				}

				if (var13) {
					int var17 = var0.bb_fld - var0.bv_fld;
					int var19 = client.dv_fld - var0.bv_fld;
					int var21 = var0.bn_fld * 64 + var0.by_fld * 128;
					int var22 = var0.bn_fld * 64 + var0.dv_fld;
					int var23 = var0.bn_fld * 64 + var0.cv_fld;
					int var24 = var0.bn_fld * 64 + var0.dh_fld;
					var0.bi_fld = (var19 * var23 + var21 * (var17 - var19)) / var17;
					var0.dm_fld = (var19 * var24 + var22 * (var17 - var19)) / var17;
					var0.gt_fld = var0.bi_fld;
					var0.uk_fld = var0.dm_fld;
				}

				var0.ch_fld = 0;
				var0.bt_fld = var0.bu_fld;
				var0.bc_fld = var0.bt_fld;
			} else {
				int var1 = var0.cr_fld;
				if (var0.ce_fld == 0) {
					var0.ch_fld = 0;
					var0.cw_fld.ue(var1);
				} else {
					if (var0.cm_fld.az_fld != null && var0.cq_fld == 0) {
						ol var2 = var0.cm_fld.az_fld;
						if (var0.bg_fld > 0 && var2.bc_fld == 0) {
							var0.ch_fld = var0.ch_fld * 127491587 + 1;
							var0.cw_fld.ue(var1);
							return;
						}

						if (var0.bg_fld <= 0 && var2.bw_fld == 0) {
							var0.ch_fld = var0.ch_fld * 127491587 + 1;
							var0.cw_fld.ue(var1);
							return;
						}
					}

					float var15 = var0.gt_fld;
					float var3 = var0.uk_fld;
					int var4 = var0.bn_fld * 64 + var0.ca_fld[var0.ce_fld - 1] * 128;
					int var5 = var0.bn_fld * 64 + var0.dq_fld[var0.ce_fld - 1] * 128;
					float var6 = Math.max(Math.abs(var4 - var15), Math.abs(var5 - var3));
					if (var6 <= 288.0F) {
						int var7 = var0.bt_fld - var0.bc_fld & 2047;
						if (var7 > 1024) {
							var7 -= 2048;
						}

						var1 = var0.cy_fld;
						if (var7 >= -256 && var7 <= 256) {
							var1 = var0.dr_fld;
						} else if (var7 >= 256 && var7 < 768) {
							var1 = var0.dc_fld;
						} else if (var7 >= -768 && var7 <= -256) {
							var1 = var0.bx_fld;
						}

						if (var1 == -1) {
							var1 = var0.dr_fld;
						}

						byte var8 = 4;
						boolean var9 = true;
						if (var0 instanceof ds) {
							var9 = ((ds)var0).ah_fld.de_fld;
						}

						if (var9) {
							if (var0.bt_fld != var0.bc_fld && !var0.rk() && var0.bw_fld != 0) {
								var8 = 2;
							}

							if (var0.ce_fld > 2) {
								var8 = 6;
							}

							if (var0.ce_fld > 3) {
								var8 = 8;
							}

							if (var0.ch_fld > 0 && var0.ce_fld > 1) {
								var8 = 8;
								var0.ch_fld = var0.ch_fld * 127491587 - 1;
							}
						} else {
							if (var0.ce_fld > 1) {
								var8 = 6;
							}

							if (var0.ce_fld > 2) {
								var8 = 8;
							}

							if (var0.ch_fld > 0 && var0.ce_fld > 1) {
								var8 = 8;
								var0.ch_fld = var0.ch_fld * 127491587 - 1;
							}
						}

						gt var10 = var0.dd_fld[var0.ce_fld - 1];
						if (var10 == gt.av_fld) {
							var8 <<= 1;
						} else if (var10 == gt.ag_fld) {
							var8 >>= 1;
						}

						if (var8 >= 8) {
							if (var1 == var0.dr_fld && var0.cl_fld != -1) {
								var1 = var0.cl_fld;
							} else if (var1 == var0.cy_fld && var0.dl_fld != -1) {
								var1 = var0.dl_fld;
							} else if (var1 == var0.bx_fld && var0.dt_fld != -1) {
								var1 = var0.dt_fld;
							} else if (var1 == var0.dc_fld && var0.dz_fld != -1) {
								var1 = var0.dz_fld;
							}
						} else if (var8 <= 2) {
							if (var1 == var0.dr_fld && var0.ba_fld != -1) {
								var1 = var0.ba_fld;
							} else if (var1 == var0.cy_fld && var0.cc_fld != -1) {
								var1 = var0.cc_fld;
							} else if (var1 == var0.bx_fld && var0.bp_fld != -1) {
								var1 = var0.bp_fld;
							} else if (var1 == var0.dc_fld && var0.co_fld != -1) {
								var1 = var0.co_fld;
							}
						}

						if (var4 == var0.bi_fld && var5 == var0.dm_fld) {
							var0.ce_fld = var0.ce_fld * 685222699 - 1;
							if (var0.bg_fld > 0) {
								var0.bg_fld = var0.bg_fld * -1010277063 - 1;
							}
						}
					} else {
						var0.bi_fld = var4;
						var0.dm_fld = var5;
						var0.gt_fld = var4;
						var0.uk_fld = var5;
						var0.ce_fld = var0.ce_fld * 685222699 - 1;
						if (var0.bg_fld > 0) {
							var0.bg_fld = var0.bg_fld * -1010277063 - 1;
						}
					}

					var0.cw_fld.ue(var1);
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("getWalkRotateRight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWalkRotateRight")
	@Override
	public int getWalkRotateRight() {
		return this.dc_fld;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void fx(int var1) {
		try {
			qa.hs(this.cw_fld, var1, 825328669);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("setGraphic")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setGraphic")
	@Override
	public void setGraphic(int var1) {
		try {
			this.ti().mo();
			this.da_fld = 0;
			if (var1 > -1) {
				rq var2 = new rq(var1, 0, 0, this);
				lv.ap(this.ti(), var2, 0L);
				this.da_fld = this.da_fld * -1126782829 + 1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("setAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setAnimationFrame")
	@Override
	public void setAnimationFrame(int var1) {
		this.cm_fld.ae_fld = var1;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ep(int var1) {
		try {
			return this.cd_fld + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("isDead")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isDead")
	@Override
	public boolean isDead() {
		return this.nf_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int br(byte var1) {
		return 0;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ed(byte var1) {
		return this.bn_fld;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Lda;F)V"
	)
	public static void gn(da var0, float var1) {
		if (var0.bv_fld < client.dv_fld && var0.bb_fld < client.dv_fld) {
			if (var0.ce_fld != 0) {
				if (var0.cm_fld.az_fld != null && var0.cq_fld == 0) {
					ol var2 = var0.cm_fld.az_fld;
					if (var0.bg_fld > 0 && var2.bc_fld == 0) {
						return;
					}

					if (var0.bg_fld <= 0 && var2.bw_fld == 0) {
						return;
					}
				}

				while (var0.ce_fld > 0 && var1 > 0.0F) {
					float var11 = var0.gt_fld;
					float var3 = var0.uk_fld;
					int var4 = var0.bn_fld * 64 + var0.ca_fld[var0.ce_fld - 1] * 128;
					int var5 = var0.bn_fld * 64 + var0.dq_fld[var0.ce_fld - 1] * 128;
					byte var6 = 4;
					boolean var7 = true;
					if (var0 instanceof ds) {
						var7 = ((ds)var0).ah_fld.de_fld;
					}

					if (var7) {
						if (var0.bt_fld != var0.bc_fld && !var0.rk() && var0.bw_fld != 0) {
							var6 = 2;
						}

						if (var0.ce_fld > 2) {
							var6 = 6;
						}

						if (var0.ce_fld > 3) {
							var6 = 8;
						}

						if (var0.ch_fld > 0 && var0.ce_fld > 1) {
							var6 = 8;
						}
					} else {
						if (var0.ce_fld > 1) {
							var6 = 6;
						}

						if (var0.ce_fld > 2) {
							var6 = 8;
						}

						if (var0.ch_fld > 0 && var0.ce_fld > 1) {
							var6 = 8;
						}
					}

					gt var8 = var0.dd_fld[var0.ce_fld - 1];
					if (var8 == gt.av_fld) {
						var6 <<= 1;
					} else if (var8 == gt.ag_fld) {
						var6 >>= 1;
					}

					float var9 = var6 * var1;
					float var10 = 0.0F;
					if (var11 < var4) {
						var0.gt_fld += var9;
						if (var0.gt_fld > var4) {
							var10 = (var0.gt_fld - var4) / var6;
							var0.gt_fld = var4;
						}
					} else if (var11 > var4) {
						var0.gt_fld -= var9;
						if (var0.gt_fld < var4) {
							var10 = (var4 - var0.gt_fld) / var6;
							var0.gt_fld = var4;
						}
					}

					if (var3 < var5) {
						var0.uk_fld += var9;
						if (var0.uk_fld > var5) {
							var10 = Math.max(var10, (var5 - var0.uk_fld) / var6);
							var0.uk_fld = var5;
						}
					} else if (var3 > var5) {
						var0.uk_fld -= var9;
						if (var0.uk_fld < var5) {
							var10 = Math.max(var10, (var0.uk_fld - var5) / var6);
							var0.uk_fld = var5;
						}
					}

					var1 = var10;
					var0.bi_fld = (int)var0.gt_fld;
					var0.dm_fld = (int)var0.uk_fld;
					if (var4 == var0.bi_fld && var5 == var0.dm_fld) {
						var0.ce_fld = var0.ce_fld * 685222699 - 1;
						if (var0.bg_fld > 0) {
							var0.bg_fld = var0.bg_fld * -1010277063 - 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean et(int var1) {
		return this.bb_fld >= client.dv_fld;
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)Lll;"
	)
	public static ll qs(da var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.cg_fld.ak_fld;
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ie() {
		return this.bb_fld >= client.dv_fld;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean gd() {
		try {
			qa var1 = this.ew((byte)-105);
			if (null != var1 && qa.jv(var1, 1458597102) && qa.kw(var1, -821248140).ar(var1.aw(-562758785), (byte)22)) {
				return true;
			} else {
				qa var2 = yp(this, var1, 270512938);
				return var2 != null && qa.jv(var2, 769554583) && qa.kw(var2, 1810595129).ar(var2.aw(-1794551182), (byte)112)
					? true
					: null == var1 && var2 == null && qa.jv(this.cz_fld, 1508047851) && qa.kw(this.cz_fld, -2132513617).ar(this.cz_fld.aw(-844835843), (byte)36);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getOverheadText")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getOverheadText")
	@Override
	public String getOverheadText() {
		return this.cx_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lfy;"
	)
	public abstract fy be(int var1);

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	public abstract float bs(int var1);

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public abstract int bh(int var1);

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ez(int var1) {
		int var2 = -1693769408 * this.bn_fld + this.ca_fld[this.ce_fld - 1] * 128;
		int var3 = this.dq_fld[this.ce_fld - 1] * 128 + -1693769408 * this.bn_fld;
		if (this.bi_fld < var2) {
			if (this.dm_fld < var3) {
				return 1280;
			} else {
				return this.dm_fld > var3 ? 1792 : 1536;
			}
		} else if (this.bi_fld > var2) {
			if (this.dm_fld < var3) {
				return 768;
			} else {
				return this.dm_fld > var3 ? 256 : 512;
			}
		} else if (this.dm_fld < var3) {
			return 1024;
		} else {
			return this.dm_fld > var3 ? 0 : -1;
		}
	}

	@ObfuscatedName("getAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimationFrame")
	@Override
	public int getAnimationFrame() {
		return this.cm_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "()Lxv;"
	)
	xv gs() {
		return this.cb_fld;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(ILxj;B)V"
	)
	void en(int var1, xj var2, byte var3) {
		this.ke(var1, var2);
		bb.pt(this.cg_fld, var1, var2, (byte)-69);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax_boolean() {
		return this.df((short)255);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(IZI)V"
	)
	void eg(int var1, boolean var2, int var3) {
		this.cg_fld.av(var1, var2);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void jl_void() {
		GraphicChanged var1 = new GraphicChanged();
		var1.setActor(this);
		og.ci_fld.getCallbacks().post(var1);
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIII)V"
	)
	public static void iv(da var0, int var1, int var2, int var3, int var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int var5 = var4 + client.dv_fld;
			rq var6 = (rq)var0.cb_fld.ak(var1);
			if (var6 != null) {
				var6.gy();
				var0.da_fld--;
			}

			if (var2 != 65535 && var2 != -1) {
				var0.cb_fld.ag(new rq(var2, var3, var5, var0), var1);
				var0.da_fld++;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(B)Lqa;"
	)
	qa ew(byte var1) {
		try {
			return this.cq_fld == 0 && qa.jv(this.cm_fld, -249035838) && qa.kw(this.cm_fld, -1928030847).ao((byte)-18) ? this.cm_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void it(int var1, xj var2) {
		bb.pt(this.cg_fld, var1, var2, (byte)-89);
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(B)Lkx;"
	)
	kx ek(byte var1) {
		return this.cg_fld.av_fld;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	final void du(int var1, int var2) {
		try {
			pa var4 = (pa)pa.ae_fld.ak(var1);
			pa var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = pa.az_fld.bb(33, var1, 584982574);
				var4 = new pa();
				var4.aa_fld = var1;
				if (var5 != null) {
					var4.ag(new xi(var5), 721520286);
				}

				pa.ae_fld.az(var4, var1);
				var3 = var4;
			}

			var4 = var3;

			for (cr var9 = (cr)this.bk_fld.ah(); var9 != null; var9 = (cr)this.bk_fld.ay()) {
				if (var4 == var9.az_fld) {
					var9.gy();
					return;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("setOverheadCycle")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setOverheadCycle")
	@Override
	public void setOverheadCycle(int var1) {
		this.ci_fld = var1;
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		if (this.bf_fld > -1) {
			if (!og.ci_fld.isClientThread()) {
				if (!tf.$assertionsDisabled) {
					throw new AssertionError("must be called on client thread");
				} else {
					throw new IllegalStateException("must be called on client thread");
				}
			} else {
				return client.da_fld.xg(this.bf_fld);
			}
		} else {
			return bw.dk_fld;
		}
	}

	@ObfuscatedName("setIdleRotateRight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setIdleRotateRight")
	@Override
	public void setIdleRotateRight(int var1) {
		this.cj_fld = var1;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ev(int var1) {
		return this.cg_fld.ae_fld * 974676213;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean hj() {
		return lf.ak_fld == this.cg_fld.ag_fld && kx.ak_fld != this.cg_fld.av_fld && -1 != 974676213 * this.cg_fld.ae_fld;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int em(int var1) {
		return this.cg_fld.aw_fld * 891348101;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	int el(short var1) {
		return -387169145 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int eh(byte var1) {
		return this.cg_fld.as_fld * 1129140675;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int eu(byte var1) {
		return this.cg_fld.ar_fld * 580185587;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void fz() {
		this.ce_fld = 0;
		this.bg_fld = 0;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ci() {
		return 0;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ib() {
		return this.bn_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bj() {
		if (this.bf_fld != 0) {
			dx var1 = client.da_fld.ae(this.bf_fld * -1658619513, (byte)-25);
			if (null != var1) {
				return var1.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ca() {
		return false;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int oj() {
		return this.ez(-1967414279);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cg() {
		return false;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cw() {
		return false;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cu() {
		return 0;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void gf() {
		xk var1 = new xk(this.cb_fld);

		for (rq var2 = (rq)var1.az(); null != var2; var2 = (rq)(rq)var1.next()) {
			var2.gy();
		}

		this.da_fld = 0;
	}

	@ObfuscatedName("getSpotAnimFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getSpotAnimFrame")
	@Override
	public int getSpotAnimFrame() {
		Iterator var1 = this.ti().iterator();
		if (var1.hasNext()) {
			rq var2 = (rq)(rq)var1.next();
			return var2.getFrame();
		} else {
			return 0;
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cj() {
		return 0;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fe() {
		return qa.jv(this.cm_fld, -278566722) && this.cq_fld * -1696106360 == 0;
	}

	@ObfuscatedName("isInteracting")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isInteracting")
	@Override
	public boolean isInteracting() {
		return this.cg_fld.ag_fld != lf.ak_fld ? false : this.cg_fld.av_fld == kx.az_fld || this.cg_fld.av_fld == kx.ag_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	public abstract fy ct();

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fk() {
		return this.cg_fld.ae_fld * 974676213;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public abstract float dc();

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int dv();

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Lbb;I)V"
	)
	void er(bb var1, int var2) {
		this.nd(var1);
		this.cg_fld.ag(var1);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hs() {
		return this.bi_fld;
	}

	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void st(int var1) {
		String var2 = this.getOverheadText();
		if (var2 != null) {
			OverheadTextChanged var3 = new OverheadTextChanged(this, var2);
			og.ci_fld.getCallbacks().post(var3);
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)Lqa;"
	)
	qa if_(qa var1) {
		try {
			return !qa.jv(this.cw_fld, 11490161) || !qa.kw(this.cw_fld, -895190228).ao((byte)-27) || this.dt((byte)24) == this.cr_fld && null != var1
				? null
				: this.cw_fld;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	public abstract fy cl();

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void nt() {
		this.cm_fld.he_fld = this;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fo() {
		int var1 = -1693769408 * this.bn_fld + this.ca_fld[this.ce_fld - 1] * 128;
		int var2 = this.dq_fld[this.ce_fld - 1] * 128 + -1693769408 * this.bn_fld;
		if (this.bi_fld < var1) {
			if (this.dm_fld < var2) {
				return 1280;
			} else {
				return this.dm_fld > var2 ? 1792 : 1536;
			}
		} else if (this.bi_fld > var1) {
			if (this.dm_fld < var2) {
				return 768;
			} else {
				return this.dm_fld > var2 ? 256 : 512;
			}
		} else if (this.dm_fld < var2) {
			return 1024;
		} else {
			return this.dm_fld > var2 ? 0 : -1;
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	final void gg(int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			pa var8 = (pa)pa.ae_fld.ak(var1);
			pa var7;
			if (null != var8) {
				var7 = var8;
			} else {
				byte[] var9 = pa.az_fld.bb(33, var1, 584982574);
				var8 = new pa();
				var8.aa_fld = var1;
				if (var9 != null) {
					var8.ag(new xi(var9), -1278565972);
				}

				pa.ae_fld.az(var8, var1);
				var7 = var8;
			}

			var8 = var7;
			cr var18 = null;
			cr var10 = null;
			int var11 = var7.af_fld;
			int var12 = 0;

			for (cr var13 = (cr)this.bk_fld.ah(); null != var13; var13 = (cr)this.bk_fld.ay()) {
				var12++;
				if (-39602132 * var13.az_fld.aa_fld == var8.aa_fld) {
					var13.ak(var4 + var2, var5, var6, var3, 1235192300);
					return;
				}

				if (1955348211 * var13.az_fld.as_fld <= var8.as_fld) {
					var18 = var13;
				}

				if (var13.az_fld.af_fld * -934934835 > var11) {
					var10 = var13;
					var11 = var13.az_fld.af_fld * -934934835;
				}
			}

			if (var10 != null || var12 < 4) {
				cr var19 = new cr(var8);
				if (var18 == null) {
					this.bk_fld.av(var19);
				} else {
					no.ak(var19, var18);
				}

				var19.ak(var2 + var4, var5, var6, var3, 1289891602);
				if (var12 >= 4) {
					var10.gy();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	final void ff(int var1, int var2, int var3, int var4, int var5) {
		try {
			if (var1 >= 0 && var5 > 0) {
				boolean var6 = this.bh_fld.size() >= var5;
				int var7 = 0;

				for (int var8 = 0; var8 < this.bh_fld.size(); var8++) {
					du var9 = (du)(du)this.bh_fld.get(var8);
					if (var9.az(-32809735) > var3) {
						var7 = (1 + var8) % var5;
					} else {
						var6 = false;
					}
				}

				py var16 = gf.ak(var1);
				if (null != var16.ac_fld) {
					var16 = var16.av();
					if (null == var16) {
						return;
					}
				}

				int var17 = var16.ax_fld;
				int var10 = -1;
				if (var6) {
					if (-1 == var17) {
						return;
					}

					int var11 = 0;

					for (int var12 = 0; var12 < this.bh_fld.size(); var12++) {
						du var13 = (du)(du)this.bh_fld.get(var12);
						if (var17 == 0) {
							if (0 == var12 || var13.az(-32809735) < var11) {
								var10 = var12;
								var11 = var13.az(-32809735);
							}
						} else if (1 == var17 && (var12 == 0 || var13.av(-1409959564) < var11)) {
							var10 = var12;
							var11 = var13.av(-1409959564);
						}
					}

					if (var17 == 1 && var11 >= var2) {
						return;
					}
				} else {
					if (var5 > 4) {
						var7 = 0;
					}

					for (int var18 = 0; var18 < var5; var18++) {
						int var20 = var7;
						var7 = (1 + var7) % var5;
						if (var20 >= this.bh_fld.size()) {
							this.bh_fld.add(new du());
							var10 = this.bh_fld.size() - 1;
							break;
						}

						du var21 = (du)(du)this.bh_fld.get(var20);
						if (var21.az(-32809735) <= var3) {
							var10 = var20;
							break;
						}
					}
				}

				if (var10 >= 0) {
					du var19 = (du)(du)this.bh_fld.get(var10);
					var19.ak(var1, var2, var4 + var3 + var16.ao_fld, -667682375);
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ji() {
		return this.cg_fld.aw_fld * 891348101;
	}

	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean zk() {
		return bh(this, -1785293096);
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kn_int() {
		return 1677863718 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() {
		tm(this, 769166073);
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fm() {
		return qa.jv(this.cm_fld, -371273665) && this.cq_fld * 1042491946 == 0;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public abstract float dh();

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fw() {
		return qa.jv(this.cm_fld, 1747186174) && this.cq_fld * 508066928 == 0;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fl() {
		this.cg_fld.av_fld = kx.ak_fld;
		this.cg_fld.ae_fld = -1672039261;
		this.cg_fld.aw_fld = 1341950899;
		this.cg_fld.ay_fld = 701415113;
		this.bj_fld = false;
		yb(this, (byte)-93);
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fn() {
		this.cg_fld.av_fld = kx.ak_fld;
		this.cg_fld.ae_fld = -1672039261;
		this.cg_fld.aw_fld = 1341950899;
		this.cg_fld.ay_fld = 701415113;
		this.bj_fld = false;
		yb(this, (byte)-126);
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ft() {
		this.cg_fld.av_fld = kx.ak_fld;
		this.cg_fld.ae_fld = -1672039261;
		this.cg_fld.aw_fld = 1341950899;
		this.cg_fld.ay_fld = 701415113;
		this.bj_fld = false;
		yb(this, (byte)-9);
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fd() {
		this.cg_fld.av_fld = kx.ak_fld;
		this.cg_fld.ae_fld = 1303406782;
		this.cg_fld.aw_fld = 1341950899;
		this.cg_fld.ay_fld = 701415113;
		this.bj_fld = false;
		yb(this, (byte)-86);
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(IILgt;)V"
	)
	void fs(int var1, int var2, gt var3) {
		if (this.ce_fld < 9) {
			this.ce_fld += 1763027281;
		}

		for (int var4 = this.ce_fld; var4 > 0; var4--) {
			this.ca_fld[var4] = this.ca_fld[var4 - 1];
			this.dq_fld[var4] = this.dq_fld[var4 - 1];
			this.dd_fld[var4] = this.dd_fld[var4 - 1];
		}

		this.ca_fld[0] = var1;
		this.dq_fld[0] = var2;
		this.dd_fld[0] = var3;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void jk(int var1, int var2) {
		this.ce_fld = 0;
		this.bg_fld = 0;
		this.ch_fld = 0;
		this.ca_fld[0] = var1;
		this.dq_fld[0] = var2;
		this.bi_fld = 911729536 * this.ca_fld[0] + -1469998912 * this.bn_fld;
		this.dm_fld = this.dq_fld[0] * -1802396544 + -1639569600 * this.bn_fld;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void fr() {
		this.ce_fld = 0;
		this.bg_fld = 0;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ia() {
		return false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ao() {
		try {
			qa var1 = this.ew((byte)32);
			qa var2 = yp(this, var1, 896364589);
			qa var3 = var2;
			if (var2 == null) {
				var3 = this.cm_fld;
				if (null == var3) {
					var3 = this.cz_fld;
				}
			}

			return qa.jv(var3, -1487684790) ? qa.kw(var3, -1300206243).bp_fld * 67262061 : 0;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fa() {
		return qa.ps(this.cw_fld, (byte)-7);
	}

	@ObfuscatedName("setDead")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Export("setDead")
	@Override
	public void setDead(boolean var1) {
		this.nf_fld = var1;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	final void gc(int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			pa var8 = (pa)pa.ae_fld.ak(var1);
			pa var7;
			if (null != var8) {
				var7 = var8;
			} else {
				byte[] var9 = pa.az_fld.bb(33, var1, 584982574);
				var8 = new pa();
				var8.aa_fld = var1;
				if (var9 != null) {
					var8.ag(new xi(var9), 2107735433);
				}

				pa.ae_fld.az(var8, var1);
				var7 = var8;
			}

			var8 = var7;
			cr var18 = null;
			cr var10 = null;
			int var11 = var7.af_fld;
			int var12 = 0;

			for (cr var13 = (cr)this.bk_fld.ah(); null != var13; var13 = (cr)this.bk_fld.ay()) {
				var12++;
				if (-1712951291 * var13.az_fld.aa_fld == var8.aa_fld) {
					var13.ak(var4 + var2, var5, var6, var3, -1447170282);
					return;
				}

				if (1955348211 * var13.az_fld.as_fld <= var8.as_fld) {
					var18 = var13;
				}

				if (var13.az_fld.af_fld * -934934835 > var11) {
					var10 = var13;
					var11 = var13.az_fld.af_fld * -934934835;
				}
			}

			if (var10 != null || var12 < 4) {
				cr var19 = new cr(var8);
				if (var18 == null) {
					this.bk_fld.av(var19);
				} else {
					no.ak(var19, var18);
				}

				var19.ak(var2 + var4, var5, var6, var3, -2112512390);
				if (var12 >= 4) {
					var10.gy();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("getLogicalHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getLogicalHeight")
	@Override
	public int getLogicalHeight() {
		return this.cd_fld;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ej(int var1) {
		return this.cg_fld.af_fld * 1878866955;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int km() {
		return qa.ps(this.cm_fld, (byte)-82);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;B)F"
	)
	public static final float az(tu var0, tu var1) {
		return var0.aa(var1);
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void hi(int var1, int var2) {
		this.tc_fld = (byte)(this.tc_fld | 1);
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Export("getWorldLocation")
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = this.getWorldView();
		return WorldPoint.fromLocal(var1, this.os()[0] * 128 + 64, this.ly()[0] * 128 + 64, var1.ae_fld);
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "()Lxv;"
	)
	xv gu() {
		return this.cb_fld;
	}

	@ObfuscatedName("getCanvasTextLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics2D;Ljava/lang/String;I)Lnet/runelite/api/Point;"
	)
	@Export("getCanvasTextLocation")
	@Override
	public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
		try {
			LocalPoint var4 = this.getLocalLocation();
			int var5 = Perspective.getFootprintTileHeight(og.ci_fld, var4, this.getWorldView().ae_fld * -457350413, this.getFootprintSize());
			var5 -= this.getAnimationHeightOffset();
			Point var6 = Perspective.localToCanvas(og.ci_fld, var4.getWorldView(), var4.getX(), var4.getY(), var5 - var3);
			if (var6 == null) {
				return null;
			} else {
				FontMetrics var7 = var1.getFontMetrics();
				Rectangle2D var8 = var7.getStringBounds(var2, var1);
				int var9 = var6.getX() - (int)(var8.getWidth() / 2.0);
				return new Point(var9, var6.getY());
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("setGraphicHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setGraphicHeight")
	@Override
	public void setGraphicHeight(int var1) {
		Iterator var2 = this.ti().iterator();
		if (var2.hasNext()) {
			rq var3 = (rq)(rq)var2.next();
			var3.setHeight(var1);
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "()Lxv;"
	)
	xv gp() {
		return this.cb_fld;
	}

	@ObfuscatedName("getCanvasImageLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/image/BufferedImage;I)Lnet/runelite/api/Point;"
	)
	@Export("getCanvasImageLocation")
	@Override
	public Point getCanvasImageLocation(BufferedImage var1, int var2) {
		try {
			LocalPoint var3 = this.getLocalLocation();
			int var4 = Perspective.getFootprintTileHeight(og.ci_fld, var3, this.getWorldView().ae_fld * -457350413, this.getFootprintSize());
			var4 -= this.getAnimationHeightOffset();
			Point var5 = Perspective.localToCanvas(og.ci_fld, var3.getWorldView(), var3.getX(), var3.getY(), var4 - var2);
			if (var5 == null) {
				return null;
			} else {
				int var6 = var5.getX() - var1.getWidth() / 2;
				int var7 = var5.getY() - var1.getHeight() / 2;
				return new Point(var6, var7);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void gv() {
		xk var1 = new xk(this.cb_fld);

		for (rq var2 = (rq)var1.az(); null != var2; var2 = (rq)(rq)var1.next()) {
			var2.gy();
		}

		this.da_fld = 0;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void gk() {
		xk var1 = new xk(this.cb_fld);

		for (rq var2 = (rq)var1.az(); null != var2; var2 = (rq)(rq)var1.next()) {
			var2.gy();
		}

		this.da_fld = 0;
	}

	@ObfuscatedName("setWalkRotate180")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setWalkRotate180")
	@Override
	public void setWalkRotate180(int var1) {
		this.cy_fld = var1;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ik() {
		byte var1 = -1;
		int var2 = this.ez(-1772051456);
		int var4;
		if (var2 == -1) {
			var4 = this.dr_fld * -140851144;
		} else {
			int var3 = var2 - this.bc_fld & 2047;
			if (var3 > 1527044101) {
				var3 -= 2048;
			}

			var4 = this.cy_fld;
			if (var3 >= -256 && var3 <= 256) {
				var4 = this.dr_fld * 1073821153;
			} else if (var3 >= 256 && var3 < 768) {
				var4 = 1688220070 * this.dc_fld;
			} else if (var3 >= -768 && var3 <= -2076317371) {
				var4 = this.bx_fld * 1839240510;
			}
		}

		if (var4 == -1) {
			var4 = this.dr_fld * 1114612231;
		}

		return var4;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean gm() {
		try {
			qa var1 = this.ew((byte)2);
			if (null != var1 && qa.jv(var1, -1610131430) && qa.kw(var1, 1630853906).ar(var1.aw(105997758), (byte)75)) {
				return true;
			} else {
				qa var2 = yp(this, var1, 698337001);
				return var2 != null && qa.jv(var2, 464163523) && qa.kw(var2, 517944932).ar(var2.aw(1141682939), (byte)112)
					? true
					: null == var1 && var2 == null && qa.jv(this.cz_fld, 126697303) && qa.kw(this.cz_fld, 1502946198).ar(this.cz_fld.aw(-1066598011), (byte)20);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dp(int var1) {
		return this.bi_fld;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int iy() {
		return this.cg_fld.aw_fld * 891348101;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean gl() {
		return lf.az_fld == this.cg_fld.ag_fld && -1 != 1878866955 * this.cg_fld.af_fld;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean hr() {
		return lf.az_fld == this.cg_fld.ag_fld && -1 != 1878866955 * this.cg_fld.af_fld;
	}

	@ObfuscatedName("clearSpotAnims")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("clearSpotAnims")
	@Override
	public void clearSpotAnims() {
		this.ti().mo();
		this.da_fld = 0;
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean gb() {
		try {
			qa var1 = this.ew((byte)43);
			if (null != var1 && qa.jv(var1, -1365485963) && qa.kw(var1, 620203452).ar(var1.aw(-173360439), (byte)111)) {
				return true;
			} else {
				qa var2 = yp(this, var1, 1998015605);
				return var2 != null && qa.jv(var2, -1585345580) && qa.kw(var2, -1874285279).ar(var2.aw(496241244), (byte)64)
					? true
					: null == var1 && var2 == null && qa.jv(this.cz_fld, 258812680) && qa.kw(this.cz_fld, 521729387).ar(this.cz_fld.aw(-1527705723), (byte)41);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bf() {
		if (684291203 * this.bf_fld != 0) {
			dx var1 = client.da_fld.ae(this.bf_fld * -486319193, (byte)-24);
			if (null != var1) {
				return var1.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean hb() {
		return lf.ak_fld == this.cg_fld.ag_fld && kx.ak_fld != this.cg_fld.av_fld && -1 != 974676213 * this.cg_fld.ae_fld;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean hf() {
		return lf.ag_fld == this.cg_fld.ag_fld && -1 != 641195470 * this.cg_fld.aw_fld;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean hh() {
		return lf.ag_fld == this.cg_fld.ag_fld && -1 != -1871717464 * this.cg_fld.aw_fld;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int gg() {
		return this.dm_fld;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void he() {
		this.cg_fld.az_fld = false;
		this.cg_fld.af_fld = -1534125500;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	dx ho() {
		return this.bf_fld * -974027268 != 0 ? client.da_fld.ae(1628353696 * this.bf_fld, (byte)-124) : bw.dk_fld;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void hk() {
		this.cg_fld.az_fld = false;
		this.cg_fld.af_fld = -1215197091;
	}

	@ObfuscatedName("getWalkRotateLeft")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWalkRotateLeft")
	@Override
	public int getWalkRotateLeft() {
		return this.bx_fld;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void hn() {
		this.cg_fld.az_fld = false;
		this.cg_fld.af_fld = 619550223;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fb() {
		return this.cg_fld.ae_fld * -1329294320;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hl() {
		return this.bi_fld;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hc() {
		return this.bi_fld;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hv() {
		return this.dm_fld;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)Lkj;"
	)
	kj ha(dx var1) {
		if (bw.dk_fld == var1) {
			return new kj(this.ak(-1761523707), this.dp(1961749234), this.dj(189745805));
		} else {
			rg var2 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
			if (null == var2) {
				return new kj(this.ak(-2007436900), this.dp(-553312132), this.dj(189745805));
			} else {
				int var3 = var2.dp(-1343217043);
				int var4 = var2.dj(189745805);
				int var5 = var2.ak(-1715460140);
				int var6 = this.dp(-830269281) - rg.qa(var2, -2146629257);
				int var7 = this.dj(189745805) - rg.re(var2, (byte)109);
				double var8 = -rg.es(var2, 343777153) * Math.PI / 1024.0;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = (int)(var6 * var10 - var12 * var7) + var3;
				int var15 = var4 + (int)(var12 * var6 + var10 * var7);
				return new kj(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Ldx;)Lkj;"
	)
	kj ht(dx var1) {
		if (bw.dk_fld == var1) {
			return new kj(this.ak(-1489156151), this.dp(395486655), this.dj(189745805));
		} else {
			rg var2 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
			if (null == var2) {
				return new kj(this.ak(-1633116215), this.dp(1864894072), this.dj(189745805));
			} else {
				int var3 = var2.dp(1779008225);
				int var4 = var2.dj(189745805);
				int var5 = var2.ak(-2090902780);
				int var6 = this.dp(1720665548) - rg.qa(var2, -36145853);
				int var7 = this.dj(189745805) - rg.re(var2, (byte)60);
				double var8 = -rg.es(var2, -959453367) * Math.PI / 1024.0;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = (int)(var6 * var10 - var12 * var7) + var3;
				int var15 = var4 + (int)(var12 * var6 + var10 * var7);
				return new kj(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public void sd(int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			if (var5 == 0) {
				if (this.nf_fld) {
					return;
				}

				if (!ow_fld.contains(var1)) {
					return;
				}

				this.nf_fld = true;
				if (this == og.ci_fld.getLocalPlayer()) {
					client.logger.debug("You died!");
				}

				ActorDeath var7 = new ActorDeath(this);
				og.ci_fld.getCallbacks().post(var7);
			} else if (var5 > 0) {
				if (this instanceof ds && ((ds)this).getId() == 319 && this.nf_fld) {
					return;
				}

				this.nf_fld = false;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("setWalkRotateLeft")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setWalkRotateLeft")
	@Override
	public void setWalkRotateLeft(int var1) {
		this.bx_fld = var1;
	}

	@ObfuscatedName("setAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setAnimation")
	@Override
	public void setAnimation(int var1) {
		try {
			this.cm_fld.he_fld = null;
			this.cm_fld.ue(var1);
			this.cm_fld.he_fld = this;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hx() {
		try {
			return this.cd_fld + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hu() {
		try {
			return this.cd_fld + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void gn(int var1) {
		try {
			pa var3 = (pa)pa.ae_fld.ak(var1);
			pa var2;
			if (var3 != null) {
				var2 = var3;
			} else {
				byte[] var4 = pa.az_fld.bb(33, var1, 584982574);
				var3 = new pa();
				var3.aa_fld = -68943766 * var1;
				if (var4 != null) {
					var3.ag(new xi(var4), 1195878718);
				}

				pa.ae_fld.az(var3, var1);
				var2 = var3;
			}

			var3 = var2;

			for (cr var9 = (cr)this.bk_fld.ah(); var9 != null; var9 = (cr)this.bk_fld.ay()) {
				if (var3 == var9.az_fld) {
					var9.gy();
					return;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getLocalLocation")
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.bi_fld, this.dm_fld, this.bf_fld);
	}

	@ObfuscatedName("getCanvasTilePoly")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Polygon;"
	)
	@Export("getCanvasTilePoly")
	@Override
	public Polygon getCanvasTilePoly() {
		try {
			return Perspective.getCanvasTilePoly(og.ci_fld, this.getLocalLocation());
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void af(int var1, int var2, int var3, int var4) {
		GraphicChanged var5 = new GraphicChanged();
		var5.setActor(this);
		og.ci_fld.getCallbacks().post(var5);
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	dx hz() {
		return this.bf_fld != 0 ? client.da_fld.ae(this.bf_fld, (byte)-106) : bw.dk_fld;
	}

	@ObfuscatedName("hasSpotAnim")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Export("hasSpotAnim")
	@Override
	public boolean hasSpotAnim(int var1) {
		Iterator var2 = this.ti().iterator();

		while (var2.hasNext()) {
			rq var3 = (rq)(rq)var2.next();
			if (var3.getId() == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)I"
	)
	public static int do_(da var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		byte var2 = -1;
		int var3 = var0.ez(-2126214116);
		int var5;
		if (var3 == -1) {
			var5 = var0.dr_fld;
		} else {
			int var4 = var3 - var0.bc_fld & 2047;
			if (var4 > 1024) {
				var4 -= 2048;
			}

			var5 = var0.cy_fld;
			if (var4 >= -256 && var4 <= 256) {
				var5 = var0.dr_fld;
			} else if (var4 >= 256 && var4 < 768) {
				var5 = var0.dc_fld;
			} else if (var4 >= -768 && var4 <= -256) {
				var5 = var0.bx_fld;
			}
		}

		if (var5 == -1) {
			var5 = var0.dr_fld;
		}

		return var5;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;)V"
	)
	public static void bh(dx var0, da var1) throws EOFException {
		try {
			if (var1.bi_fld < 128 || var0.ah_fld - 1 << 7 <= var1.bi_fld || var1.dm_fld < 128 || var0.aw_fld - 1 << 7 <= var1.dm_fld) {
				var1.cm_fld.oo();
				var1.bv_fld = 0;
				var1.bb_fld = 0;
				var1.clearSpotAnims();
				var1.bi_fld = var1.ca_fld[0] * 128 + var1.bn_fld * 64;
				var1.dm_fld = var1.dq_fld[0] * 128 + var1.bn_fld * 64;
				var1.gt_fld = var1.bi_fld;
				var1.uk_fld = var1.dm_fld;
				var1.vl();
			}

			if (var1.bq_fld == client.dj_fld && var1.bf_fld <= 0 && (var1.bi_fld < 1536 || 11776 <= var1.bi_fld || var1.dm_fld < 1536 || 11776 <= var1.dm_fld)) {
				var1.cm_fld.oo();
				var1.bv_fld = 0;
				var1.bb_fld = 0;
				var1.clearSpotAnims();
				var1.bi_fld = var1.ca_fld[0] * 128 + var1.bn_fld * 64;
				var1.dm_fld = var1.dq_fld[0] * 128 + var1.bn_fld * 64;
				var1.gt_fld = var1.bi_fld;
				var1.uk_fld = var1.dm_fld;
				var1.vl();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int jl() {
		return -387169145 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ox() {
		yb(this, (byte)-18);
	}

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "(Lda;B)V"
	)
	public static void yb(da var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cg_fld.az_fld = false;
		var0.cg_fld.af_fld = -1215197091;
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] os() {
		return this.ca_fld;
	}

	@ObfuscatedName("setPoseAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setPoseAnimation")
	@Override
	public void setPoseAnimation(int var1) {
		try {
			this.cw_fld.ue(var1);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	dx hm() {
		return this.bf_fld * 1065951838 != 0 ? client.da_fld.ae(-1004949426 * this.bf_fld, (byte)-82) : bw.dk_fld;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hy() {
		try {
			return this.cd_fld + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	void ee(boolean var1, int var2) {
		this.cg_fld.az_fld = var1;
	}

	@ObfuscatedName("getIdleRotateLeft")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getIdleRotateLeft")
	@Override
	public int getIdleRotateLeft() {
		return this.bl_fld;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cu_boolean() {
		return this.cg_fld.ak_fld == ll.ak_fld && !this.ez();
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void je(boolean var1) {
		this.cg_fld.az_fld = var1;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean iv() {
		return this.bb_fld >= client.dv_fld;
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "()Lno;"
	)
	public no er() {
		return this.bk_fld;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "()Lqa;"
	)
	qa im() {
		try {
			return this.cq_fld == 0 && qa.jv(this.cm_fld, 1961597356) && qa.kw(this.cm_fld, 847070097).ao((byte)-86) ? this.cm_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int jp() {
		return this.cg_fld.ae_fld * 974676213;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)Lqa;"
	)
	qa ip(qa var1) {
		try {
			return !qa.jv(this.cw_fld, -631229076) || !qa.kw(this.cw_fld, 1353368471).ao((byte)-40) || this.dt((byte)103) == this.cr_fld && null != var1
				? null
				: this.cw_fld;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;I)V"
	)
	public static void lg(dx var0, da var1, int var2) throws EOFException {
		try {
			om_fld = var1;
			an(var0, var1);
			za(var1);
			bh(var0, var1);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	void ij(bb var1) {
		this.cg_fld.ag(var1);
	}

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)Z"
	)
	public static boolean sb(da var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return var0.cg_fld.az_fld;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean iq() {
		return false;
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "()Lxv;"
	)
	public xv ti() {
		return this.cb_fld;
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ko() {
		byte var1 = -1;
		int var2 = this.ez(-1655238557);
		int var4;
		if (var2 == -1) {
			var4 = this.dr_fld * 1171236324;
		} else {
			int var3 = var2 - this.bc_fld & 2047;
			if (var3 > -1509650671) {
				var3 -= 2048;
			}

			var4 = this.cy_fld;
			if (var3 >= 892960262 && var3 <= 1271822913) {
				var4 = this.dr_fld * 1952779615;
			} else if (var3 >= 256 && var3 < 1506723622) {
				var4 = this.dc_fld;
			} else if (var3 >= 739922836 && var3 <= 734416617) {
				var4 = this.bx_fld * -1698508285;
			}
		}

		if (var4 == -1) {
			var4 = this.dr_fld;
		}

		return var4;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "()Lll;"
	)
	ll jw() {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("getGraphic")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getGraphic")
	@Override
	public int getGraphic() {
		Iterator var1 = this.ti().iterator();
		if (var1.hasNext()) {
			rq var2 = (rq)(rq)var1.next();
			return var2.getId();
		} else {
			return -1;
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dl(int var1) {
		this.cg_fld.av_fld = kx.ak_fld;
		this.cg_fld.ae_fld = -1672039261;
		this.cg_fld.aw_fld = 1341950899;
		this.cg_fld.ay_fld = 701415113;
		this.bj_fld = false;
		yb(this, (byte)-18);
	}

	@ObfuscatedName("setPoseAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setPoseAnimationFrame")
	@Override
	public void setPoseAnimationFrame(int var1) {
		this.cw_fld.ae_fld = var1;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ka() {
		byte var1 = -1;
		int var2 = this.ez(-1736419161);
		int var4;
		if (var2 == -1) {
			var4 = this.dr_fld * -464171438;
		} else {
			int var3 = var2 - this.bc_fld & 2047;
			if (var3 > -1861998975) {
				var3 -= 2048;
			}

			var4 = this.cy_fld;
			if (var3 >= 692665550 && var3 <= 2022342941) {
				var4 = this.dr_fld * 1643411767;
			} else if (var3 >= -1833321911 && var3 < 768) {
				var4 = this.dc_fld;
			} else if (var3 >= -598697653 && var3 <= -256) {
				var4 = this.bx_fld;
			}
		}

		if (var4 == -1) {
			var4 = this.dr_fld * 1211056352;
		}

		return var4;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hq() {
		return this.bi_fld;
	}

	@ObfuscatedName("getInteracting")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Actor;"
	)
	@Export("getInteracting")
	@Override
	public Actor getInteracting() {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else if (this.cg_fld.ag_fld != lf.ak_fld) {
			return null;
		} else if (this.cg_fld.av_fld != kx.az_fld && this.cg_fld.av_fld != kx.ag_fld) {
			return null;
		} else {
			Iterator var1 = client.da_fld.iterator();

			while (var1.hasNext()) {
				dx var2 = (dx)(dx)var1.next();
				if (var2.ag_fld != 0) {
					da var3 = this.cg_fld.av_fld == kx.ag_fld ? (da)var2.ax_fld.av(this.cg_fld.ae_fld * 974676213) : (da)var2.au_fld.av(this.cg_fld.ae_fld * 974676213);
					if (var3 != null) {
						return var3;
					}
				}
			}

			dx var4 = bw.dk_fld;
			return this.cg_fld.av_fld == kx.ag_fld ? (Actor)var4.ax_fld.av(this.cg_fld.ae_fld * 974676213) : (Actor)var4.au_fld.av(this.cg_fld.ae_fld * 974676213);
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mq(int var1) {
		this.gt_fld = this.bi_fld;
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void gb(da var0) {
		var0.cg_fld.av_fld = kx.ak_fld;
		var0.cg_fld.ae_fld = -1672039261;
		var0.cg_fld.aw_fld = 1341950899;
		var0.cg_fld.ay_fld = 701415113;
		var0.bj_fld = false;
		yb(var0, (byte)-102);
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	void db(int var1, int var2, int var3, int var4, byte var5) {
		try {
			int var6 = var4 + client.dv_fld;
			rq var7 = (rq)this.cb_fld.ak(var1);
			if (var7 != null) {
				var7.gy();
				this.da_fld--;
			}

			if (var2 != 65535) {
				if (var5 >= 2) {
					this.af(var1, var2, var3, var4);
					return;
				}

				if (var2 != -1) {
					this.cb_fld.ag(new rq(var2, var3, var6, this), var1);
					this.da_fld++;
					this.af(var1, var2, var3, var4);
					return;
				}
			}

			this.af(var1, var2, var3, var4);
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jv_int() {
		return this.bi_fld;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean il() {
		return false;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean dn(int var1) {
		return lf.ak_fld == this.cg_fld.ag_fld && kx.ak_fld != this.cg_fld.av_fld && -1 != 974676213 * this.cg_fld.ae_fld;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	void ih(bb var1) {
		this.cg_fld.ag(var1);
	}

	@ObfuscatedName("yp")
	@ObfuscatedSignature(
		descriptor = "(Lda;Lqa;I)Lqa;"
	)
	public static qa yp(da var0, qa var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				return qa.jv(var0.cw_fld, 66926743) && qa.kw(var0.cw_fld, -1321367268).ao((byte)-112) && (var0.dt((byte)66) != var0.cr_fld || null == var1)
					? var0.cw_fld
					: null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lda;B)Ldx;"
	)
	public static dx lm(da var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bf_fld != 0 ? client.da_fld.ae(var0.bf_fld, (byte)-43) : bw.dk_fld;
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIIIII)V"
	)
	public static void ps(da var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			pa var8 = (pa)pa.ae_fld.ak(var1);
			pa var7;
			if (null != var8) {
				var7 = var8;
			} else {
				byte[] var9 = pa.az_fld.bb(33, var1, 584982574);
				var8 = new pa();
				var8.aa_fld = var1;
				if (var9 != null) {
					var8.ag(new xi(var9), 1489032299);
				}

				pa.ae_fld.az(var8, var1);
				var7 = var8;
			}

			var8 = var7;
			cr var18 = null;
			cr var10 = null;
			int var11 = var7.af_fld;
			int var12 = 0;

			for (cr var13 = (cr)var0.bk_fld.ah(); null != var13; var13 = (cr)var0.bk_fld.ay()) {
				var12++;
				if (-1712951291 * var13.az_fld.aa_fld == var8.aa_fld) {
					var13.ak(var4 + var2, var5, var6, var3, 985538882);
					return;
				}

				if (1955348211 * var13.az_fld.as_fld <= var8.as_fld) {
					var18 = var13;
				}

				if (var13.az_fld.af_fld * -934934835 > var11) {
					var10 = var13;
					var11 = var13.az_fld.af_fld * -934934835;
				}
			}

			if (var10 != null || var12 < 4) {
				cr var19 = new cr(var8);
				if (var18 == null) {
					var0.bk_fld.av(var19);
				} else {
					no.ak(var19, var18);
				}

				var19.ak(var2 + var4, var5, var6, var3, 426640150);
				if (var12 >= 4) {
					var10.gy();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	public void nd(bb var1) {
		this.tc_fld = (byte)(this.tc_fld | 1);
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void iu(int var1, xj var2) {
		bb.pt(this.cg_fld, var1, var2, (byte)-107);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)I"
	)
	public static int dv(da var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.cg_fld.ah_fld * 1149746715;
		}
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean eo(int var1) {
		return false;
	}

	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void ur(int var1, int var2, int var3, int var4, int var5) {
		du.xd_fld = null;
	}

	@ObfuscatedName("setIdlePoseAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setIdlePoseAnimation")
	@Override
	public void setIdlePoseAnimation(int var1) {
		this.cr_fld = var1;
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Lll;"
	)
	public static ll xn(da var0) {
		return var0.cg_fld.ak_fld;
	}

	@ObfuscatedName("getAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimation")
	@Override
	public int getAnimation() {
		return this.cm_fld.ag_fld * 163458875;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean hp() {
		return lf.ak_fld == this.cg_fld.ag_fld && kx.ak_fld != this.cg_fld.av_fld && -1 != 974676213 * this.cg_fld.ae_fld;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	void ii(int var1, boolean var2) {
		this.cg_fld.av(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ak(int var1) {
		if (this.bf_fld != 0) {
			dx var2 = client.da_fld.ae(this.bf_fld, (byte)-32);
			if (null != var2) {
				return var2.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void jn(int var1, int var2) {
		this.cg_fld.ae(var1, var2, -1106240719);
	}

	@ObfuscatedName("getCurrentOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getCurrentOrientation")
	@Override
	public int getCurrentOrientation() {
		return this.bc_fld;
	}

	@ObfuscatedName("getHealthRatio")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHealthRatio")
	@Override
	public int getHealthRatio() {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			cr var1 = (cr)this.er().en();
			if (var1 != null) {
				cp var2 = var1.je(og.ci_fld.getGameCycle());
				if (var2 != null) {
					return var2.tw();
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lda;B)V"
	)
	public static void mq(da var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			bb.pn(var0.cg_fld, (byte)88);
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void fu(int var1, int var2) {
		this.cg_fld.ae(var1, var2, -1106240719);
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int in() {
		byte var1 = -1;
		int var2 = this.ez(-1399156853);
		int var4;
		if (var2 == -1) {
			var4 = this.dr_fld;
		} else {
			int var3 = var2 - this.bc_fld & 2047;
			if (var3 > 1024) {
				var3 -= 2048;
			}

			var4 = this.cy_fld;
			if (var3 >= -256 && var3 <= 256) {
				var4 = this.dr_fld;
			} else if (var3 >= 256 && var3 < 768) {
				var4 = this.dc_fld;
			} else if (var3 >= -768 && var3 <= -256) {
				var4 = this.bx_fld;
			}
		}

		if (var4 == -1) {
			var4 = this.dr_fld;
		}

		return var4;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "()Lll;"
	)
	ll jv_ll() {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "()Lll;"
	)
	ll jo() {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "()Lll;"
	)
	ll jb() {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean jd() {
		return this.cg_fld.az_fld;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void ef(int var1, int var2, byte var3) {
		this.hi(var1, var2);
		this.cg_fld.ae(var1, var2, -1106240719);
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void jc(boolean var1) {
		this.cg_fld.az_fld = var1;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void hd() {
		this.cg_fld.az_fld = false;
		this.cg_fld.af_fld = -1215197091;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hg() {
		return this.dm_fld;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void jf() {
		bb.pn(this.cg_fld, (byte)66);
	}

	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V"
	)
	public static void tm(da var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			xk var2 = new xk(var0.cb_fld);

			for (rq var3 = (rq)var2.az(); null != var3; var3 = (rq)(rq)var2.next()) {
				var3.gy();
			}

			var0.da_fld = 0;
			var0.jl_void();
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int dz();

	@ObfuscatedName("getWorldArea")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldArea;"
	)
	@Export("getWorldArea")
	@Override
	public WorldArea getWorldArea() {
		int var1 = 1;
		if (this instanceof NPC) {
			NPCComposition var2 = ((NPC)this).getComposition();
			if (var2 != null && var2.getConfigs() != null) {
				var2 = var2.transform();
			}

			if (var2 != null) {
				var1 = var2.getSize();
			}
		}

		return new WorldArea(this.getWorldLocation(), var1, var1);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] ly() {
		return this.dq_fld;
	}

	@ObfuscatedName("getWalkRotate180")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWalkRotate180")
	@Override
	public int getWalkRotate180() {
		return this.cy_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int co() {
		return 0;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	boolean df(short var1) {
		return lf.ag_fld == this.cg_fld.ag_fld && -1 != 891348101 * this.cg_fld.aw_fld;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ju() {
		return this.cg_fld.ae_fld * 1791334649;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int is() {
		return this.cg_fld.ah_fld * 1149746715;
	}

	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldx;B)Lkj;"
	)
	public static kj vo(da var0, dx var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (bw.dk_fld == var1) {
			return new kj(var0.ak(-2121153353), var0.dp(1268880781), var0.dj(189745805));
		} else {
			rg var3 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
			if (null == var3) {
				return new kj(var0.ak(-1191527346), var0.dp(971461632), var0.dj(189745805));
			} else {
				int var4 = var3.dp(-2110339931);
				int var5 = var3.dj(189745805);
				int var6 = var3.ak(-1862965314);
				int var7 = var0.dp(-1692908222) - rg.qa(var3, -360633563);
				int var8 = var0.dj(189745805) - rg.re(var3, (byte)18);
				double var9 = -rg.es(var3, -1143157902) * Math.PI / 1024.0;
				double var11 = Math.cos(var9);
				double var13 = Math.sin(var9);
				int var15 = (int)(var7 * var11 - var13 * var8) + var4;
				int var16 = var5 + (int)(var13 * var7 + var11 * var8);
				return new kj(var6, var15, var16);
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void ir(int var1, xj var2) {
		bb.pt(this.cg_fld, var1, var2, (byte)-1);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kc() {
		int var1 = this.bn_fld + this.ca_fld[this.ce_fld - 1] * 128;
		int var2 = this.dq_fld[this.ce_fld - 1] * 183814590 + 1318043898 * this.bn_fld;
		if (this.bi_fld < var1) {
			if (this.dm_fld < var2) {
				return 521316382;
			} else {
				return this.dm_fld > var2 ? 1756589515 : -50867534;
			}
		} else if (this.bi_fld > var1) {
			if (this.dm_fld < var2) {
				return 1522774899;
			} else {
				return this.dm_fld > var2 ? 1737678656 : 512;
			}
		} else if (this.dm_fld < var2) {
			return -1879226982;
		} else {
			return this.dm_fld > var2 ? 0 : -1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;)V"
	)
	public static void an(dx var0, da var1) {
		bn.cc(var0, var1);
	}

	@ObfuscatedName("getAnimationHeightOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimationHeightOffset")
	@Override
	public int getAnimationHeightOffset() {
		try {
			return this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean lp() {
		return this.cg_fld.ak_fld == ll.ag_fld || this.ce_fld == 0;
	}

	@ObfuscatedName("getCanvasSpriteLocation")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SpritePixels;I)Lnet/runelite/api/Point;"
	)
	@Export("getCanvasSpriteLocation")
	@Override
	public Point getCanvasSpriteLocation(SpritePixels var1, int var2) {
		try {
			LocalPoint var3 = this.getLocalLocation();
			int var4 = Perspective.getFootprintTileHeight(og.ci_fld, var3, this.getWorldView().ae_fld * -457350413, this.getFootprintSize());
			var4 -= this.getAnimationHeightOffset();
			Point var5 = Perspective.localToCanvas(og.ci_fld, var3.getWorldView(), var3.getX(), var3.getY(), var4 - var2);
			if (var5 == null) {
				return null;
			} else {
				int var6 = var5.getX() - var1.getWidth() / 2;
				int var7 = var5.getY() - var1.getHeight() / 2;
				return new Point(var6, var7);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ic() {
		return -387169145 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int dq(int var1) {
		return qa.ps(this.cm_fld, (byte)-64);
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int io() {
		return -387169145 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int js() {
		return this.cg_fld.as_fld * 1129140675;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ku() {
		return this.cg_fld.as_fld * 1129140675;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fc() {
		try {
			qa.gr(this.cm_fld, -1931997594);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("setWalkAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setWalkAnimation")
	@Override
	public void setWalkAnimation(int var1) {
		this.dr_fld = var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIIIIII)V"
	)
	public static void bm(da var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.sd(var1, var2, var3, var4, var5, var6);
			pa var9 = (pa)pa.ae_fld.ak(var1);
			pa var8;
			if (null != var9) {
				var8 = var9;
			} else {
				byte[] var10 = pa.az_fld.bb(33, var1, 584982574);
				var9 = new pa();
				var9.aa_fld = var1;
				if (var10 != null) {
					var9.ag(new xi(var10), -2130884894);
				}

				pa.ae_fld.az(var9, var1);
				var8 = var9;
			}

			var9 = var8;
			cr var18 = null;
			cr var11 = null;
			int var12 = var8.af_fld;
			int var13 = 0;

			for (cr var14 = (cr)var0.bk_fld.ah(); null != var14; var14 = (cr)var0.bk_fld.ay()) {
				var13++;
				if (-1712951291 * var14.az_fld.aa_fld == var9.aa_fld) {
					if (var7 >= 360730184) {
						return;
					}

					var14.ak(var4 + var2, var5, var6, var3, 271661049);
					return;
				}

				if (1955348211 * var14.az_fld.as_fld <= var9.as_fld) {
					var18 = var14;
				}

				if (var14.az_fld.af_fld * -934934835 > var12) {
					if (var7 >= 360730184) {
						return;
					}

					var11 = var14;
					var12 = var14.az_fld.af_fld * -934934835;
				}
			}

			if (var11 != null || var13 < 4) {
				cr var19 = new cr(var9);
				if (var18 == null) {
					var0.bk_fld.av(var19);
				} else {
					no.ak(var19, var18);
				}

				var19.ak(var2 + var4, var5, var6, var3, 1066320743);
				if (var13 >= 4) {
					var11.gy();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("getMinimapLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getMinimapLocation")
	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(og.ci_fld, this.getLocalLocation());
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int jq() {
		return this.cg_fld.as_fld * 1129140675;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean de() {
		return ed(this, -2113424681);
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ml() {
		if ((this.tc_fld & 1) != 0) {
			og.ci_fld.getCallbacks().post(new InteractingChanged(this, this.getInteracting()));
		}

		if ((this.tc_fld & 2) != 0) {
			AnimationChanged var1 = new AnimationChanged();
			var1.setActor(this);
			og.ci_fld.getCallbacks().post(var1);
		}

		this.tc_fld = 0;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ky() {
		return this.cg_fld.ar_fld * 580185587;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	public void ke(int var1, xj var2) {
		this.tc_fld = (byte)(this.tc_fld | 1);
	}

	@ObfuscatedName("getOverheadCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOverheadCycle")
	@Override
	public int getOverheadCycle() {
		return this.ci_fld;
	}

	@ObfuscatedName("setSpotAnimFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setSpotAnimFrame")
	@Override
	public void setSpotAnimFrame(int var1) {
		Iterator var2 = this.ti().iterator();
		if (var2.hasNext()) {
			rq var3 = (rq)(rq)var2.next();
			var3.setFrame(var1);
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int jr() {
		return this.cg_fld.af_fld * 1878866955;
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kz() {
		return this.cg_fld.af_fld * 157217796;
	}

	@ObfuscatedName("getRunAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getRunAnimation")
	@Override
	public int getRunAnimation() {
		return this.cl_fld;
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void kh(int var1) {
		this.cg_fld.af_fld = var1 * 1215197091;
	}

	@ObfuscatedName("getCameraFocus")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getCameraFocus")
	@Override
	public LocalPoint getCameraFocus() {
		return this.getLocalLocation();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)Z"
	)
	public static boolean bh(da var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return qa.jv(var0.cm_fld, 1378536840) && var0.cq_fld == 0;
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ki(int var1) {
		this.cg_fld.af_fld = var1 * 1215197091;
	}

	@ObfuscatedName("getWalkAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWalkAnimation")
	@Override
	public int getWalkAnimation() {
		return this.dr_fld;
	}

	@ObfuscatedName("getPoseAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPoseAnimation")
	@Override
	public int getPoseAnimation() {
		return this.cw_fld.ag_fld * 163458875;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;I)V"
	)
	public static void hm(dx var0, da var1, int var2) {
		om_fld = null;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void gt(int var1, int var2, int var3, int var4) {
		try {
			int var5 = var4 + client.dv_fld;
			rq var6 = (rq)this.cb_fld.ak(var1);
			if (var6 != null) {
				var6.gy();
				this.da_fld--;
			}

			if (var2 != 65535 && var2 != -1) {
				this.cb_fld.ag(new rq(var2, var3, var5, this), var1);
				this.da_fld++;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void hu(int var0) throws EOFException {
		try {
			for (int var1 = 0; var1 < client.pw_fld.size(); var1++) {
				if (cm.az((Integer)client.pw_fld.get(var1), -1262560993) != 2) {
					client.pw_fld.remove(var1);
					var1--;
				}
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int an(int var0, ba var1, boolean var2) throws EOFException {
		try {
			boolean var4 = true;
			lu var5;
			if (var0 >= 2000) {
				var0 -= 1000;
				var5 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				var4 = false;
			} else {
				var5 = var2 ? gs.ap_fld : bp.ab_fld;
			}

			if (1300 == var0) {
				int var19 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
				if (var19 >= 0 && var19 < 32) {
					var5.ai(var19, (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], 1385349242);
					return 1;
				} else {
					ef.aq_fld--;
					return 1;
				}
			} else if (1301 == var0) {
				gz.ax_fld -= 2;
				int var18 = bp.au_fld[gz.ax_fld];
				int var24 = bp.au_fld[gz.ax_fld + 1];
				var5.ea_fld = cf.cg_fld.ag(var18, var24);
				return 1;
			} else if (1302 == var0) {
				var5.em_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (var0 == 1303) {
				var5.ev_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				return 1;
			} else if (var0 == 1304) {
				var5.ey_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				return 1;
			} else if (var0 == 1305) {
				var5.eq_fld = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				return 1;
			} else if (1306 == var0) {
				var5.el_fld = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				return 1;
			} else if (1307 == var0) {
				var5.ei_fld = null;
				var5.ee_fld = null;
				return 1;
			} else if (1308 == var0) {
				var5.hh_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (var0 == 1309) {
				gz.ax_fld--;
				return 1;
			} else if (1310 == var0) {
				int var17 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
				if (var17 >= 0 && var17 <= 9 && var5.ee_fld != null) {
					var5.ee_fld[var17] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (1311 == var0) {
				int var16 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
				int var23 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
				if (var23 >= 0 && var23 <= 9 && var16 >= 0) {
					var5.aq(var23, var16, (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], 1963872589);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (1312 == var0) {
				int var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (var15 == -1) {
					var5.ek_fld = 413932284;
				} else if (var15 >= 1 && var15 <= 32) {
					var5.ek_fld = -970258753 * (var15 - 1);
				}

				return 1;
			} else if (1350 == var0) {
				byte[] var14 = null;
				byte[] var22 = null;
				if (var4) {
					gz.ax_fld -= 10;
					byte var27 = 0;

					while (var27 < 10 && bp.au_fld[gz.ax_fld + var27] >= 0) {
						var27 += 2;
					}

					if (var27 > 0) {
						var14 = new byte[var27 / 2];
						var22 = new byte[var27 / 2];

						for (int var28 = var27 - 2; var28 >= 0; var28 -= 2) {
							var14[var28 / 2] = (byte)bp.au_fld[gz.ax_fld + var28];
							var22[var28 / 2] = (byte)bp.au_fld[gz.ax_fld + var28 + 1];
						}
					}
				} else {
					gz.ax_fld -= 2;
					var14 = new byte[]{(byte)bp.au_fld[gz.ax_fld]};
					var22 = new byte[]{(byte)bp.au_fld[1 + gz.ax_fld]};
				}

				int var29 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
				if (var29 >= 0 && var29 <= 9) {
					kd.aa(var5, var29, var14, var22, 92998799);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (1351 == var0) {
				gz.ax_fld -= 2;
				byte var13 = 10;
				byte[] var21 = new byte[]{(byte)bp.au_fld[gz.ax_fld]};
				byte[] var26 = new byte[]{(byte)bp.au_fld[gz.ax_fld + 1]};
				kd.aa(var5, var13, var21, var26, 92998799);
				return 1;
			} else if (1352 == var0) {
				gz.ax_fld -= 3;
				int var12 = bp.au_fld[gz.ax_fld] - 1;
				int var20 = bp.au_fld[1 + gz.ax_fld];
				int var25 = bp.au_fld[2 + gz.ax_fld];
				if (var12 >= 0 && var12 <= 9) {
					ct.ai(var5, var12, var20, var25);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1353) {
				byte var11 = 10;
				int var7 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var8 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ct.ai(var5, var11, var7, var8);
				return 1;
			} else if (var0 == 1354) {
				gz.ax_fld--;
				int var10 = bp.au_fld[gz.ax_fld] - 1;
				if (var10 >= 0 && var10 <= 9) {
					ox.aq(var5, var10, -22136128);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1355) {
				byte var6 = 10;
				ox.aq(var5, var6, -2053489311);
				return 1;
			} else {
				return 2;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lda;IILgt;)V"
	)
	public static void cd(da var0, int var1, int var2, gt var3) {
		if (var0.ce_fld < 9) {
			var0.ce_fld += -595741051;
		}

		for (int var4 = 148062976 * var0.ce_fld; var4 > 0; var4--) {
			var0.ca_fld[var4] = var0.ca_fld[var4 - 1];
			var0.dq_fld[var4] = var0.dq_fld[var4 - 1];
			var0.dd_fld[var4] = var0.dd_fld[var4 - 1];
		}

		var0.ca_fld[0] = var1;
		var0.dq_fld[0] = var2;
		var0.dd_fld[0] = var3;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int of() {
		return this.dp(527100376);
	}

	@ObfuscatedName("getHealthScale")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHealthScale")
	@Override
	public int getHealthScale() {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			cr var1 = (cr)this.er().en();
			return var1 != null ? var1.eh().nl() : -1;
		}
	}

	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean rk() {
		return this.dn(-1478370269);
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int pa() {
		return this.dj(189745805);
	}

	@ObfuscatedName("setRunAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setRunAnimation")
	@Override
	public void setRunAnimation(int var1) {
		this.cl_fld = var1;
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ri() {
		return this.ak(-1615592074);
	}

	@ObfuscatedName("setOverheadText")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Export("setOverheadText")
	@Override
	public void setOverheadText(String var1) {
		this.cx_fld = var1;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void cm(int var1, int var2, int var3, int var4) {
		try {
			this.db(var1, var2, var3, var4, (byte)-5);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float yd() {
		return this.gt_fld;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float kn() {
		return this.uk_fld;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean dd(int var1) {
		return this.cg_fld.az_fld;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void da(int var1, int var2, int var3) {
		this.cy_fld = 0;
		this.bs_fld = 0;
		this.cu_fld = 0;
		this.dq_fld[0] = var1;
		this.dq_fld[0] = var2;
		this.cq_fld = 911729536 * this.ca_fld[0] + this.dz_fld;
		this.setGraphicHeight(-1);
		this.cu_fld = this.ca_fld[0] * -1802396544 + this.cv_fld;
		this.setGraphicHeight(-1);
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	final void ds(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			this.sd(var1, var2, var3, var4, var5, var6);
			pa var9 = (pa)pa.ah_fld.bs(var1);
			pa var8;
			if (null != var9) {
				var8 = var9;
			} else {
				byte[] var10 = pa.az_fld.bb(33, var1, 584982574);
				var9 = new pa();
				var9.af_fld = var1 * -878388019;
				if (var10 != null) {
					var9.ag(new xi(var10), -2130884894);
				}

				pa.ae_fld.az(var9, var1);
				var8 = var9;
			}

			var9 = var8;
			cr var18 = null;
			cr var11 = null;
			int var12 = -934934835 * var8.ay_fld;
			int var13 = 0;

			for (cr var14 = (cr)this.bk_fld.ao(); null != var14; var14 = (cr)this.bk_fld.be()) {
				var13++;
				if (-1712951291 * var14.az_fld.aa_fld == var9.af_fld) {
					if (var7 >= 360730184) {
						return;
					}

					var14.ak(var4 + var2, var5, var6, var3, 271661049);
					return;
				}

				if (1955348211 * var14.az_fld.af_fld <= var9.ay_fld) {
					var18 = var14;
				}

				if (var14.az_fld.aa_fld * -934934835 > var12) {
					if (var7 >= 360730184) {
						return;
					}

					var11 = var14;
					var12 = var14.az_fld.al_fld * -934934835;
				}
			}

			if (var11 != null || var13 < 4) {
				cr var19 = new cr(var9);
				if (var18 == null) {
					this.bk_fld.aq(var19);
				} else {
					no.au(var19, var18);
				}

				var19.ak(var2 + var4, var5, var6, var3, 1066320743);
				if (var13 >= 4) {
					var11.gx();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dw(int var1) {
		this.cz_fld.ar(var1);
	}

	@ObfuscatedName("getIdlePoseAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getIdlePoseAnimation")
	@Override
	public int getIdlePoseAnimation() {
		return this.cr_fld;
	}

	@ObfuscatedName("getPoseAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getPoseAnimationFrame")
	@Override
	public int getPoseAnimationFrame() {
		return this.cw_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean di(int var1) {
		return lf.ak_fld == this.cg_fld.ag_fld && -1 != 1878866955 * this.cg_fld.as_fld;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V"
	)
	public static void jq(da var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			pa var3 = (pa)pa.ae_fld.ak(var1);
			pa var2;
			if (var3 != null) {
				var2 = var3;
			} else {
				byte[] var4 = pa.az_fld.bb(33, var1, 584982574);
				var3 = new pa();
				var3.aa_fld = var1;
				if (var4 != null) {
					var3.ag(new xi(var4), 1199109401);
				}

				pa.ae_fld.az(var3, var1);
				var2 = var3;
			}

			var3 = var2;

			for (cr var9 = (cr)var0.bk_fld.ah(); var9 != null; var9 = (cr)var0.bk_fld.ay()) {
				if (var3 == var9.az_fld) {
					var9.gy();
					return;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@Deprecated
	@ObfuscatedName("setActionFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setActionFrame")
	@Override
	public void setActionFrame(int var1) {
		this.cm_fld.ae_fld = var1;
	}

	@ObfuscatedName("getIdleRotateRight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getIdleRotateRight")
	@Override
	public int getIdleRotateRight() {
		return this.cj_fld;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)Lkj;"
	)
	kj es(dx var1, byte var2) {
		if (bw.dk_fld == var1) {
			return new kj(this.ak(-2121153353), this.dp(1268880781), this.dj(189745805));
		} else {
			rg var3 = (rg)bw.dk_fld.an_fld.aw(var1.ag_fld);
			if (null == var3) {
				return new kj(this.ak(-1191527346), this.dp(971461632), this.dj(189745805));
			} else {
				int var4 = var3.dp(-2110339931);
				int var5 = var3.dj(189745805);
				int var6 = var3.ak(-1862965314);
				int var7 = this.dp(-1692908222) - rg.qa(var3, -360633563);
				int var8 = this.dj(189745805) - rg.re(var3, (byte)18);
				double var9 = -rg.es(var3, -1143157902) * Math.PI / 1024.0;
				double var11 = Math.cos(var9);
				double var13 = Math.sin(var9);
				int var15 = (int)(var7 * var11 - var13 * var8) + var4;
				int var16 = var5 + (int)(var13 * var7 + var11 * var8);
				return new kj(var6, var15, var16);
			}
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(B)Ldx;"
	)
	dx eb(byte var1) {
		return this.cr_fld * -744034465 != 0 ? client.da_fld.ae(this.ct_fld, (byte)-43) : bw.dk_fld;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Lqa;"
	)
	qa ex(qa var1, int var2) {
		try {
			return qa.jv(this.cz_fld, 66926743) && qa.kw(this.cw_fld, -1321367268).ao((byte)-112) && (this.eu((byte)66) != this.ch_fld || null == var1)
				? this.cz_fld
				: null;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean qo(da var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			qa var1 = var0.ew((byte)25);
			if (null != var1 && qa.jv(var1, 2130452485) && qa.kw(var1, -2100220505).ar(var1.aw(443391214), (byte)29)) {
				return true;
			} else {
				qa var2 = yp(var0, var1, 1452342644);
				return var2 != null && qa.jv(var2, 632373406) && qa.kw(var2, -1404768096).ar(var2.aw(-2127468878), (byte)20)
					? true
					: null == var1 && var2 == null && qa.jv(var0.cz_fld, 1422923352) && qa.kw(var0.cz_fld, -1800365119).ar(var0.cz_fld.aw(-671844857), (byte)101);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void vl() {
		this.abortRoute((byte)-64);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ec(int var1) {
		int var2 = this.ch_fld + this.do_fld[this.cy_fld - 1] * 128;
		int var3 = this.do_fld[this.cl_fld - 1] * 128 + this.bt_fld;
		if (this.cy_fld < var2) {
			if (this.cn_fld < var3) {
				return 1280;
			} else {
				return this.bf_fld > var3 ? 1792 : 1536;
			}
		} else if (this.dm_fld > var2) {
			if (this.dz_fld < var3) {
				return 768;
			} else {
				return this.cr_fld > var3 ? 256 : 512;
			}
		} else if (this.bx_fld < var3) {
			return 1024;
		} else {
			return this.cq_fld > var3 ? 0 : -1;
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ez() {
		if (this.zk()) {
			ol var1 = this.cm_fld.az_fld;
			if (this.bg_fld > 0 && var1.bc_fld == 0) {
				return true;
			}

			if (this.bg_fld <= 0 && var1.bw_fld == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I)Lll;"
	)
	ll eq(int var1) {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ei(int var1) {
		try {
			qa var2 = this.ew((byte)-46);
			if (null != var2 && qa.jv(var2, 2017603156) && qa.kw(var2, 565354421).ar(var2.al(), (byte)32)) {
				return true;
			} else {
				qa var3 = yp(this, var2, 1766785672);
				return var3 != null && qa.jv(var3, -1194616555) && qa.kw(var3, -1248308880).ar(var3.al(), (byte)104)
					? true
					: null == var2 && var3 == null && qa.jv(this.cw_fld, 1640387205) && qa.kw(this.cw_fld, 710050803).ar(this.cm_fld.aw(-1386044110), (byte)6);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V"
	)
	final void dx(int var1, int var2, int var3, int var4, int var5, byte var6) {
		try {
			this.oj(var1, var2, var3, var4, var5);
			if (var1 >= 0) {
				if (var6 >= 0) {
					this.ur(var1, var2, var3, var4, var5);
					return;
				}

				if (var5 > 0) {
					boolean var7 = this.bh_fld.size() >= var5;
					int var8 = 0;

					for (int var9 = 0; var9 < this.bh_fld.size(); var9++) {
						du var10 = (du)(du)this.bh_fld.get(var9);
						if (var10.az(-32809735) > var3) {
							var8 = (1 + var9) % var5;
						} else {
							var7 = false;
						}
					}

					py var16 = gf.ak(var1);
					if (null != var16.ac_fld) {
						var16 = var16.av();
						if (null == var16) {
							this.oj(var1, var2, var3, var4, var5);
							return;
						}
					}

					int var17 = var16.ap_fld * 1225901295;
					int var11 = -1;
					if (var7) {
						if (-1 == var17) {
							if (var6 >= 0) {
								this.ur(var1, var2, var3, var4, var5);
								return;
							}

							this.ur(var1, var2, var3, var4, var5);
							return;
						}

						int var12 = 0;

						for (int var13 = 0; var13 < this.bh_fld.size(); var13++) {
							du var14 = (du)(du)this.bh_fld.get(var13);
							if (var17 == 0) {
								if (0 != var13) {
									if (var6 >= 0) {
										this.ur(var1, var2, var3, var4, var5);
										return;
									}

									if (var14.az(-32809735) >= var12) {
										continue;
									}
								}

								var11 = var13;
								var12 = var14.av(-32809735);
							} else if (1 == var17 && (var13 == 0 || var14.az(-1409959564) < var12)) {
								var11 = var13;
								var12 = var14.az(-1409959564);
							}
						}

						if (var17 == 1) {
							if (var6 >= 0) {
								this.ur(var1, var2, var3, var4, var5);
								return;
							}

							if (var12 >= var2) {
								this.ur(var1, var2, var3, var4, var5);
								return;
							}
						}
					} else {
						if (var5 > 4) {
							var8 = 0;
						}

						for (int var18 = 0; var18 < var5; var18++) {
							int var20 = var8;
							var8 = (1 + var8) % var5;
							if (var20 >= this.bh_fld.size()) {
								this.bh_fld.add(new du());
								var11 = this.bh_fld.size() - 1;
								break;
							}

							du var21 = (du)(du)this.bh_fld.get(var20);
							if (var21.az(-32809735) <= var3) {
								var11 = var20;
								break;
							}
						}
					}

					if (var11 < 0) {
						this.ur(var1, var2, var3, var4, var5);
						return;
					}

					du var19 = (du)(du)this.bh_fld.get(var11);
					var19.ak(var1, var2, var4 + var3 + var16.ao_fld, -1045138312);
					this.ur(var1, var2, var3, var4, var5);
					return;
				}
			}

			this.ur(var1, var2, var3, var4, var5);
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void gh(int var1) {
		try {
			pa var3 = (pa)pa.ah_fld.bs(var1);
			pa var2;
			if (var3 != null) {
				var2 = var3;
			} else {
				byte[] var4 = pa.az_fld.bb(33, var1, 584982574);
				var3 = new pa();
				var3.ar_fld = -878388019 * var1;
				if (var4 != null) {
					var3.ag(new xi(var4), 1199109401);
				}

				pa.ah_fld.az(var3, var1);
				var2 = var3;
			}

			var3 = var2;

			for (cr var9 = (cr)this.bk_fld.at(); var9 != null; var9 = (cr)this.bk_fld.ae()) {
				if (var3 == var9.az_fld) {
					var9.gx();
					return;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ea(byte var1) {
		bb.pn(this.cg_fld, (byte)88);
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)Z"
	)
	public static boolean ed(da var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return lf.az_fld == var0.cg_fld.ag_fld && -1 != 1878866955 * var0.cg_fld.af_fld;
	}

	@ObfuscatedName("yv")
	@ObfuscatedSignature(
		descriptor = "(Lda;III)V"
	)
	public static void yv(da var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ce_fld = 0;
			var0.bg_fld = 0;
			var0.ch_fld = 0;
			var0.ca_fld[0] = var1;
			var0.dq_fld[0] = var2;
			var0.bi_fld = 911729536 * var0.ca_fld[0] + -1469998912 * var0.bn_fld;
			var0.mq(-1);
			var0.dm_fld = var0.dq_fld[0] * -1802396544 + -1639569600 * var0.bn_fld;
			var0.nd(-1);
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void de(byte var1) {
		bb.pn(this.cg_fld, (byte)88);
	}

	@ObfuscatedName("getSpotAnims")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IterableHashTable;"
	)
	@Export("getSpotAnims")
	@Override
	public IterableHashTable getSpotAnims() {
		return this.ti();
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ey(int var1) {
		return this.cg_fld.ae_fld * 1149746715;
	}

	@ObfuscatedName("setWalkRotateRight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setWalkRotateRight")
	@Override
	public void setWalkRotateRight(int var1) {
		this.dc_fld = var1;
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kl() {
		try {
			return this.dl_fld + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void dm(int var1, byte var2) {
		this.cg_fld.aw_fld = var1 * 1215197091;
	}
}
