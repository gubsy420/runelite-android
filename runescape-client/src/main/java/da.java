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
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	public static da vt_fld;
	@ObfuscatedGetter(
		intValue = -783619985
	)
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cr_fld;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	public byte ec_fld;
	@ObfuscatedGetter(
		intValue = -1252097089
	)
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bs_fld;
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
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa cw_fld;
	@ObfuscatedGetter(
		intValue = -997542447
	)
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ce_fld;
	@ObfuscatedGetter(
		intValue = -744034465
	)
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bl_fld;
	@ObfuscatedGetter(
		intValue = -1857618981
	)
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bx_fld;
	@ObfuscatedGetter(
		intValue = -1009984759
	)
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bp_fld;
	@ObfuscatedGetter(
		intValue = 570497549
	)
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cf_fld;
	@ObfuscatedGetter(
		intValue = 1559125397
	)
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bt_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean an_fld;
	@ObfuscatedGetter(
		intValue = -143157147
	)
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ch_fld;
	@ObfuscatedGetter(
		intValue = 760936839
	)
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bi_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa cz_fld;
	@ObfuscatedGetter(
		intValue = 211698817
	)
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bn_fld;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	xv cb_fld;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean fl_fld;
	@ObfuscatedGetter(
		intValue = 183519091
	)
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bu_fld;
	@ObfuscatedGetter(
		intValue = -442509245
	)
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ba_fld;
	@ObfuscatedGetter(
		intValue = -1856618613
	)
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bq_fld;
	@ObfuscatedGetter(
		intValue = -2009092031
	)
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bg_fld;
	@ObfuscatedGetter(
		intValue = -588012999
	)
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bw_fld;
	@ObfuscatedGetter(
		intValue = 1382909849
	)
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cd_fld;
	@ObfuscatedGetter(
		intValue = -686799443
	)
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cc_fld;
	@ObfuscatedGetter(
		intValue = -126880905
	)
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bc_fld;
	@ObfuscatedGetter(
		intValue = -143797063
	)
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cv_fld;
	@ObfuscatedGetter(
		intValue = 1903557461
	)
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cy_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bv_fld;
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
	@ObfuscatedGetter(
		intValue = -786581447
	)
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bb_fld;
	@ObfuscatedGetter(
		intValue = -1647819403
	)
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cn_fld;
	@ObfuscatedGetter(
		intValue = 760936839
	)
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bf_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ca_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	bb cg_fld;
	@ObfuscatedGetter(
		intValue = 1581158923
	)
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dt_fld;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa cm_fld;
	@ObfuscatedGetter(
		intValue = 2119824673
	)
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dv_fld;
	@ObfuscatedGetter(
		intValue = 791409263
	)
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ck_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int by_fld;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float sv_fld;
	@ObfuscatedGetter(
		intValue = -1126782829
	)
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int co_fld;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cu_fld;
	@ObfuscatedGetter(
		intValue = -351151733
	)
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cq_fld;
	@ObfuscatedGetter(
		intValue = 1074071813
	)
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cj_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	fy be_fld = new fy();
	@ObfuscatedGetter(
		intValue = -900515773
	)
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ct_fld;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Set;"
	)
	public static Set mq_fld = ImmutableSet.of(0, 2, 16, 17, 18, 19, new Integer[]{20, 21, 22});
	@ObfuscatedGetter(
		intValue = -309406545
	)
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cl_fld;
	@ObfuscatedGetter(
		intValue = 338376229
	)
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dc_fld;
	@ObfuscatedName("zq")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean zq_fld;
	@ObfuscatedGetter(
		intValue = -1950304843
	)
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dh_fld;
	@ObfuscatedGetter(
		intValue = -1528231089
	)
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ci_fld;
	@ObfuscatedGetter(
		intValue = -2080232115
	)
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dz_fld;
	@ObfuscatedGetter(
		intValue = -1254596105
	)
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bo_fld;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[Lgt;"
	)
	gt[] dd_fld;
	@ObfuscatedName("zd")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float zd_fld;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] dq_fld;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] do_fld;
	@ObfuscatedGetter(
		intValue = -1010277063
	)
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dr_fld;
	@ObfuscatedGetter(
		intValue = 127491587
	)
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dl_fld;
	@ObfuscatedGetter(
		intValue = 685222699
	)
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int dm_fld;
	@ObfuscatedGetter(
		intValue = 1100713367
	)
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int da_fld;

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int dt(byte var1) {
		return this.cw_fld.ah();
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ti() {
		return this.cg_fld.ak_fld == ll.ag_fld || this.dm_fld == 0;
	}

	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void vz(int var1) {
		this.sv_fld = this.bo_fld;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int iz() {
		return this.bo_fld;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void dm(int var1, byte var2) {
		try {
			qa.ju(this.cw_fld, var1, -509097172);
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
			qa var3 = dp(this, var2, 616643313);
			qa var4 = var3;
			if (var3 == null) {
				var4 = this.cm_fld;
				if (null == var4) {
					var4 = this.cz_fld;
				}
			}

			return var4.av() ? var4.ae().bp_fld * 67262061 : 0;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("setIdlePoseAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setIdlePoseAnimation(int var1) {
		this.bi_fld = var1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	public abstract fy ch();

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IILgt;B)V"
	)
	void dr(int var1, int var2, gt var3, byte var4) {
		if (this.dm_fld < 9) {
			if (var4 >= 8) {
				return;
			}

			this.dm_fld++;
		}

		for (int var5 = this.dm_fld; var5 > 0; var5--) {
			this.dq_fld[var5] = this.dq_fld[var5 - 1];
			this.do_fld[var5] = this.do_fld[var5 - 1];
			this.dd_fld[var5] = this.dd_fld[var5 - 1];
		}

		this.dq_fld[0] = var1;
		this.do_fld[0] = var2;
		this.dd_fld[0] = var3;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void da(int var1, int var2, int var3) {
		this.dm_fld = 0;
		this.dr_fld = 0;
		this.dl_fld = 0;
		this.dq_fld[0] = var1;
		this.do_fld[0] = var2;
		this.bo_fld = 911729536 * this.dq_fld[0] + -1469998912 * this.bv_fld;
		this.vz(-1);
		this.bp_fld = this.do_fld[0] * -1802396544 + -1639569600 * this.bv_fld;
		this.ro(-1);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	final void dk(byte var1) {
		this.dm_fld = 0;
		this.dr_fld = 0;
	}

	@ObfuscatedName("createSpotAnim")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	@Override
	public void createSpotAnim(int var1, int var2, int var3, int var4) {
		try {
			xv var5 = this.zc();
			rq var6 = (rq)var5.get(var1);
			if (var6 != null) {
				var6.xh();
				this.co_fld = this.co_fld * -1126782829 - 1;
			}

			if (var2 != -1) {
				var5.lu(new rq(var2, var3, og.ci_fld.getGameCycle() + var4, this), var1);
				this.co_fld = this.co_fld * -1126782829 + 1;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bm(int var1) {
		return false;
	}

	@ObfuscatedName("setOverheadCycle")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setOverheadCycle(int var1) {
		this.ce_fld = var1;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hg() {
		return this.bp_fld;
	}

	@ObfuscatedName("getWorldArea")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldArea;"
	)
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

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	final void ds(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			this.sa(var1, var2, var3, var4, var5, var6);
			pa var9 = (pa)pa.ae_fld.ak(var1);
			pa var8;
			if (null != var9) {
				var8 = var9;
			} else {
				byte[] var10 = pa.az_fld.bb(33, var1, 584982574);
				var9 = new pa();
				var9.aw_fld = var1;
				if (var10 != null) {
					var9.ag(new xi(var10), -2130884894);
				}

				pa.ae_fld.az(var9, var1);
				var8 = var9;
			}

			var9 = var8;
			cr var18 = null;
			cr var11 = null;
			int var12 = var8.as_fld;
			int var13 = 0;

			for (cr var14 = (cr)this.bk_fld.ah(); null != var14; var14 = (cr)this.bk_fld.ay()) {
				var13++;
				if (-1712951291 * var14.az_fld.aw_fld == var9.aw_fld) {
					if (var7 >= 360730184) {
						return;
					}

					var14.ak(var4 + var2, var5, var6, var3, 271661049);
					return;
				}

				if (1955348211 * var14.az_fld.ay_fld <= var9.ay_fld) {
					var18 = var14;
				}

				if (var14.az_fld.as_fld * -934934835 > var12) {
					if (var7 >= 360730184) {
						return;
					}

					var11 = var14;
					var12 = var14.az_fld.as_fld * -934934835;
				}
			}

			if (var11 != null || var13 < 4) {
				cr var19 = new cr(var9);
				if (var18 == null) {
					this.bk_fld.av(var19);
				} else {
					no.ak(var19, var18);
				}

				var19.ak(var2 + var4, var5, var6, var3, 1066320743);
				if (var13 >= 4) {
					var11.gy_void();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("rn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void rn() {
		if ((this.ec_fld & 1) != 0) {
			og.ci_fld.getCallbacks().post(new InteractingChanged(this, this.getInteracting()));
		}

		if ((this.ec_fld & 2) != 0) {
			AnimationChanged var1 = new AnimationChanged();
			var1.setActor(this);
			og.ci_fld.getCallbacks().post(var1);
		}

		this.ec_fld = 0;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fb() {
		return this.cm_fld.ah();
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean gy() {
		if (this.zt()) {
			ol var1 = this.cm_fld.az_fld;
			if (this.dr_fld > 0 && var1.bc_fld == 0) {
				return true;
			}

			if (this.dr_fld <= 0 && var1.bw_fld == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("getAnimationHeightOffset")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAnimationHeightOffset() {
		try {
			return this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void jf() {
		GraphicChanged var1 = new GraphicChanged();
		var1.setActor(this);
		og.ci_fld.getCallbacks().post(var1);
	}

	da(int var1) {
		this.bh_fld = new ArrayList(4);
		this.bk_fld = new no();
		this.bj_fld = false;
		this.bf_fld = -1547875309;
		this.by_fld = -63892773;
		this.bl_fld = 0;
		this.an_fld = false;
		this.bv_fld = 1283255373;
		this.bi_fld = 1804501961;
		this.bu_fld = -390804923;
		this.bn_fld = 1735001215;
		this.bc_fld = -1736627783;
		this.bw_fld = 906384375;
		this.ba_fld = -302068843;
		this.bq_fld = -1430908963;
		this.bg_fld = 1064017983;
		this.bb_fld = 723732983;
		this.cd_fld = -1891294377;
		this.cc_fld = -2026858021;
		this.cq_fld = -1193412131;
		this.cv_fld = 1154485879;
		this.cy_fld = -1351494141;
		this.cf_fld = -1841939653;
		this.cx_fld = null;
		this.es(-1);
		this.cp_fld = false;
		this.ce_fld = 1304444708;
		this.cn_fld = 0;
		this.cr_fld = 0;
		this.ca_fld = null;
		this.cg_fld = new bb();
		this.cw_fld = new qa();
		this.cm_fld = new qa();
		this.cz_fld = new qa();
		this.ck_fld = 0;
		this.cb_fld = new xv(4);
		this.co_fld = 0;
		this.dh_fld = -1518404952;
		this.dz_fld = 0;
		this.dt_fld = -1694682016;
		this.dm_fld = 0;
		this.dq_fld = new int[10];
		this.do_fld = new int[10];
		this.dd_fld = new gt[10];
		this.dl_fld = 0;
		this.dr_fld = 0;
		this.da_fld = 1574452697;
		this.bx_fld = var1;
		this.yg();
	}

	@ObfuscatedName("getWalkRotateRight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWalkRotateRight() {
		return this.bq_fld;
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "()Lxv;"
	)
	public xv zc() {
		return this.cb_fld;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean di(int var1) {
		return lf.az_fld == this.cg_fld.ag_fld && -1 != 1878866955 * this.cg_fld.af_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ao() {
		try {
			qa var1 = this.ew((byte)-2);
			qa var2 = dp(this, var1, 335792845);
			qa var3 = var2;
			if (var2 == null) {
				var3 = this.cm_fld;
				if (null == var3) {
					var3 = this.cz_fld;
				}
			}

			return var3.av() ? var3.ae().bp_fld * 820843271 : 0;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void es(int var1) {
		String var2 = this.getOverheadText();
		if (var2 != null) {
			OverheadTextChanged var3 = new OverheadTextChanged(this, var2);
			og.ci_fld.getCallbacks().post(var3);
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kf() {
		return this.cg_fld.as_fld * 1129140675;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fa() {
		return this.cw_fld.ah();
	}

	@ObfuscatedName("getCanvasImageLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/image/BufferedImage;I)Lnet/runelite/api/Point;"
	)
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

	@ObfuscatedName("setWalkRotateRight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setWalkRotateRight(int var1) {
		this.bq_fld = var1;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dj(int var1) {
		return this.bp_fld;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)Lkj;"
	)
	kj es(dx var1, byte var2) {
		if (bw.dk_fld == var1) {
			return new kj(this.ak(-2121153353), this.dp(1268880781), this.dj(189745805));
		} else {
			rg var3 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
			if (null == var3) {
				return new kj(this.ak(-1191527346), this.dp(971461632), this.dj(189745805));
			} else {
				int var4 = var3.dp(-2110339931);
				int var5 = var3.dj(189745805);
				int var6 = var3.ak(-1862965314);
				int var7 = this.dp(-1692908222) - var3.ax(-360633563);
				int var8 = this.dj(189745805) - var3.an((byte)18);
				double var9 = -var3.ah(-1143157902) * Math.PI / 1024.0;
				double var11 = Math.cos(var9);
				double var13 = Math.sin(var9);
				int var15 = (int)(var7 * var11 - var13 * var8) + var4;
				int var16 = var5 + (int)(var13 * var7 + var11 * var8);
				return new kj(var6, var15, var16);
			}
		}
	}

	@ObfuscatedName("getPoseAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPoseAnimation() {
		return this.cw_fld.ag_fld * 163458875;
	}

	@ObfuscatedName("getCanvasSpriteLocation")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/SpritePixels;I)Lnet/runelite/api/Point;"
	)
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

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void fx(int var1) {
		try {
			qa.ju(this.cw_fld, var1, 825328669);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ep(int var1) {
		try {
			return this.dh_fld + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(B)Ldx;"
	)
	dx eb(byte var1) {
		return this.bl_fld != 0 ? client.da_fld.ae(this.bl_fld, (byte)-43) : bw.dk_fld;
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
		return this.bv_fld;
	}

	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean qu(da var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			qa var1 = var0.ew((byte)43);
			if (null != var1 && var1.av() && var1.ae().ar(qa.do_(var1, -173360439), (byte)111)) {
				return true;
			} else {
				qa var2 = dp(var0, var1, 1998015605);
				return var2 != null && var2.av() && var2.ae().ar(qa.do_(var2, 496241244), (byte)64)
					? true
					: null == var1 && var2 == null && var0.cz_fld.av() && var0.cz_fld.ae().ar(qa.do_(var0.cz_fld, -1527705723), (byte)41);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean et(int var1) {
		return this.cl_fld >= client.dv_fld;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ie() {
		return this.cl_fld >= client.dv_fld;
	}

	@ObfuscatedName("setIdleRotateLeft")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setIdleRotateLeft(int var1) {
		this.bu_fld = var1;
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

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public static void sn(hg var0) {
		byte[] var1 = new byte[var0.ak_fld * var0.ak_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < var0.ak_fld; var3++) {
			for (int var4 = 0; var4 < var0.ak_fld; var4++) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[0][0] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var11 = var0.ak_fld - 1; var11 >= 0; var11--) {
			for (int var14 = 0; var14 < var0.ak_fld; var14++) {
				if (var14 <= var11) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[0][1] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < var0.ak_fld; var12++) {
			for (int var15 = 0; var15 < var0.ak_fld; var15++) {
				if (var15 >= var12) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[0][2] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var13 = var0.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < var0.ak_fld; var16++) {
				if (var16 >= var13) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[0][3] = var1;
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ec(int var1) {
		byte var2 = -1;
		int var3 = this.ez(-2126214116);
		int var5;
		if (var3 == -1) {
			var5 = this.bc_fld;
		} else {
			int var4 = var3 - this.bt_fld & 2047;
			if (var4 > 1024) {
				var4 -= 2048;
			}

			var5 = this.bw_fld;
			if (var4 >= -256 && var4 <= 256) {
				var5 = this.bc_fld;
			} else if (var4 >= 256 && var4 < 768) {
				var5 = this.bq_fld;
			} else if (var4 >= -768 && var4 <= -256) {
				var5 = this.ba_fld;
			}
		}

		if (var5 == -1) {
			var5 = this.bc_fld;
		}

		return var5;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean ef(da var0) {
		return var0.cm_fld.av() && var0.ck_fld * 508066928 == 0;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ez(int var1) {
		int var2 = -1693769408 * this.bv_fld + this.dq_fld[this.dm_fld - 1] * 128;
		int var3 = this.do_fld[this.dm_fld - 1] * 128 + -1693769408 * this.bv_fld;
		if (this.bo_fld < var2) {
			if (this.bp_fld < var3) {
				return 1280;
			} else {
				return this.bp_fld > var3 ? 1792 : 1536;
			}
		} else if (this.bo_fld > var2) {
			if (this.bp_fld < var3) {
				return 768;
			} else {
				return this.bp_fld > var3 ? 256 : 512;
			}
		} else if (this.bp_fld < var3) {
			return 1024;
		} else {
			return this.bp_fld > var3 ? 0 : -1;
		}
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
		this.qr(var1, var2);
		this.cg_fld.az(var1, var2);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(IZI)V"
	)
	void eg(int var1, boolean var2, int var3) {
		this.cg_fld.av(var1, var2);
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(B)Lqa;"
	)
	qa ew(byte var1) {
		try {
			return this.ck_fld == 0 && this.cm_fld.av() && this.cm_fld.ae().ao((byte)-18) ? this.cm_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(I)Lll;"
	)
	ll eq(int var1) {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("getWalkRotateLeft")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWalkRotateLeft() {
		return this.ba_fld;
	}

	@ObfuscatedName("getIdleRotateLeft")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getIdleRotateLeft() {
		return this.bu_fld;
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ei(int var1) {
		return this.cg_fld.az_fld;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void it(int var1, xj var2) {
		this.cg_fld.az(var1, var2);
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
				var4.aw_fld = var1;
				if (var5 != null) {
					var4.ag(new xi(var5), 721520286);
				}

				pa.ae_fld.az(var4, var1);
				var3 = var4;
			}

			var4 = var3;

			for (cr var9 = (cr)this.bk_fld.ah(); var9 != null; var9 = (cr)this.bk_fld.ay()) {
				if (var4 == var9.az_fld) {
					var9.gy_void();
					return;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ev(int var1) {
		return this.cg_fld.ae_fld * 974676213;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	int el(short var1) {
		return -387169145 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("setWalkRotate180")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setWalkRotate180(int var1) {
		this.bw_fld = var1;
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
		this.dm_fld = 0;
		this.dr_fld = 0;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ci() {
		return 0;
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int gj() {
		return this.bv_fld;
	}

	@ObfuscatedName("setGraphic")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setGraphic(int var1) {
		try {
			this.zc().ul();
			this.co_fld = 0;
			if (var1 > -1) {
				rq var2 = new rq(var1, 0, 0, this);
				this.zc().lu(var2, 0L);
				this.co_fld = this.co_fld * -1126782829 + 1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean wf() {
		return this.cg_fld.ak_fld == ll.ak_fld && !this.gy();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bf() {
		if (this.bl_fld != 0) {
			dx var1 = client.da_fld.ae(this.bl_fld * -1658619513, (byte)-25);
			if (null != var1) {
				return var1.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void jz(int var1, int var2) {
		bb.jx(this.cg_fld, var1, var2, -1106240719);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ca() {
		return false;
	}

	@ObfuscatedName("getGraphic")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getGraphic() {
		Iterator var1 = this.zc().iterator();
		if (var1.hasNext()) {
			rq var2 = (rq)(rq)var1.next();
			return var2.getId();
		} else {
			return -1;
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V"
	)
	public static void fz(da var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.cm_fld.ag();
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
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

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ea() {
		return this.di(-2113424681);
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean jy() {
		return this.cg_fld.az_fld;
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
			var2.gy_void();
		}

		this.co_fld = 0;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int cj() {
		return 0;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mt() {
		lq(this, (byte)-18);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	public abstract fy ct();

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public abstract float dc();

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kw() {
		return this.cg_fld.af_fld * 1878866955;
	}

	@ObfuscatedName("getRunAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRunAnimation() {
		return this.bg_fld;
	}

	@ObfuscatedName("getAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAnimationFrame() {
		return this.cm_fld.ae_fld * 249909987;
	}

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
		this.xk(var1);
		this.cg_fld.ag(var1);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hq() {
		return this.bo_fld;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)Lqa;"
	)
	qa if_(qa var1) {
		try {
			return !this.cw_fld.av() || !this.cw_fld.ae().ao((byte)-27) || this.dt((byte)24) == this.bi_fld && null != var1 ? null : this.cw_fld;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("setDead")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	@Override
	public void setDead(boolean var1) {
		this.fl_fld = var1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	public abstract fy cl();

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ik() {
		int var1 = -1693769408 * this.bv_fld + this.dq_fld[this.dm_fld - 1] * 128;
		int var2 = this.do_fld[this.dm_fld - 1] * 128 + -1693769408 * this.bv_fld;
		if (this.bo_fld < var1) {
			if (this.bp_fld < var2) {
				return 1280;
			} else {
				return this.bp_fld > var2 ? 1792 : 1536;
			}
		} else if (this.bo_fld > var1) {
			if (this.bp_fld < var2) {
				return 768;
			} else {
				return this.bp_fld > var2 ? 256 : 512;
			}
		} else if (this.bp_fld < var2) {
			return 1024;
		} else {
			return this.bp_fld > var2 ? 0 : -1;
		}
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "(Lda;IILgt;)V"
	)
	public static void zw(da var0, int var1, int var2, gt var3) {
		if (var0.dm_fld < 9) {
			var0.dm_fld += -595741051;
		}

		for (int var4 = 148062976 * var0.dm_fld; var4 > 0; var4--) {
			var0.dq_fld[var4] = var0.dq_fld[var4 - 1];
			var0.do_fld[var4] = var0.do_fld[var4 - 1];
			var0.dd_fld[var4] = var0.dd_fld[var4 - 1];
		}

		var0.dq_fld[0] = var1;
		var0.do_fld[0] = var2;
		var0.dd_fld[0] = var3;
	}

	@ObfuscatedName("yp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void yp() {
		jt(this, 769166073);
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
				var8.aw_fld = var1;
				if (var9 != null) {
					var8.ag(new xi(var9), -1278565972);
				}

				pa.ae_fld.az(var8, var1);
				var7 = var8;
			}

			var8 = var7;
			cr var18 = null;
			cr var10 = null;
			int var11 = var7.as_fld;
			int var12 = 0;

			for (cr var13 = (cr)this.bk_fld.ah(); null != var13; var13 = (cr)this.bk_fld.ay()) {
				var12++;
				if (-39602132 * var13.az_fld.aw_fld == var8.aw_fld) {
					var13.ak(var4 + var2, var5, var6, var3, 1235192300);
					return;
				}

				if (1955348211 * var13.az_fld.ay_fld <= var8.ay_fld) {
					var18 = var13;
				}

				if (var13.az_fld.as_fld * -934934835 > var11) {
					var10 = var13;
					var11 = var13.az_fld.as_fld * -934934835;
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
					var10.gy_void();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean em(da var0) {
		return lf.ak_fld == var0.cg_fld.ag_fld && kx.ak_fld != var0.cg_fld.av_fld && -1 != 974676213 * var0.cg_fld.ae_fld;
	}

	@ObfuscatedName("setSpotAnimFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setSpotAnimFrame(int var1) {
		Iterator var2 = this.zc().iterator();
		if (var2.hasNext()) {
			rq var3 = (rq)(rq)var2.next();
			var3.setFrame(var1);
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V"
	)
	final void dx(int var1, int var2, int var3, int var4, int var5, byte var6) {
		try {
			this.mb(var1, var2, var3, var4, var5);
			if (var1 >= 0) {
				if (var6 >= 0) {
					this.mc(var1, var2, var3, var4, var5);
					return;
				}

				if (var5 > 0) {
					boolean var7 = this.bh_fld.size() >= var5;
					int var8 = 0;

					for (int var9 = 0; var9 < this.bh_fld.size(); var9++) {
						du var10 = (du)(du)this.bh_fld.get(var9);
						if (du.fy(var10, -32809735) > var3) {
							var8 = (1 + var9) % var5;
						} else {
							var7 = false;
						}
					}

					py var16 = gf.ak(var1);
					if (null != var16.ac_fld) {
						var16 = py.cj(var16, (byte)119);
						if (null == var16) {
							this.mc(var1, var2, var3, var4, var5);
							return;
						}
					}

					int var17 = var16.ap_fld;
					int var11 = -1;
					if (var7) {
						if (-1 == var17) {
							if (var6 >= 0) {
								this.mc(var1, var2, var3, var4, var5);
								return;
							}

							this.mc(var1, var2, var3, var4, var5);
							return;
						}

						int var12 = 0;

						for (int var13 = 0; var13 < this.bh_fld.size(); var13++) {
							du var14 = (du)(du)this.bh_fld.get(var13);
							if (var17 == 0) {
								if (0 != var13) {
									if (var6 >= 0) {
										this.mc(var1, var2, var3, var4, var5);
										return;
									}

									if (du.fy(var14, -32809735) >= var12) {
										continue;
									}
								}

								var11 = var13;
								var12 = du.fy(var14, -32809735);
							} else if (1 == var17 && (var13 == 0 || var14.az(-1409959564) < var12)) {
								var11 = var13;
								var12 = var14.az(-1409959564);
							}
						}

						if (var17 == 1) {
							if (var6 >= 0) {
								this.mc(var1, var2, var3, var4, var5);
								return;
							}

							if (var12 >= var2) {
								this.mc(var1, var2, var3, var4, var5);
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
							if (du.fy(var21, -32809735) <= var3) {
								var11 = var20;
								break;
							}
						}
					}

					if (var11 < 0) {
						this.mc(var1, var2, var3, var4, var5);
						return;
					}

					du var19 = (du)(du)this.bh_fld.get(var11);
					var19.ak(var1, var2, var4 + var3 + var16.ax_fld, -1045138312);
					this.mc(var1, var2, var3, var4, var5);
					return;
				}
			}

			this.mc(var1, var2, var3, var4, var5);
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int jl() {
		return this.cg_fld.aw_fld * 891348101;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ku() {
		return 1677863718 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bi() {
		return this.do_fld;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fm() {
		return this.cm_fld.av() && this.ck_fld * 1042491946 == 0;
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;)V"
	)
	public static void ya(dx var0, da var1) throws EOFException {
		try {
			if (var1.bo_fld < 128 || var0.ah_fld - 1 << 7 <= var1.bo_fld || var1.bp_fld < 128 || var0.aw_fld - 1 << 7 <= var1.bp_fld) {
				var1.cm_fld.cp();
				var1.ct_fld = 0;
				var1.cl_fld = 0;
				var1.clearSpotAnims();
				var1.bo_fld = var1.dq_fld[0] * 128 + var1.bv_fld * 64;
				var1.bp_fld = var1.do_fld[0] * 128 + var1.bv_fld * 64;
				var1.sv_fld = var1.bo_fld;
				var1.zd_fld = var1.bp_fld;
				var1.to();
			}

			if (var1.bx_fld == client.dj_fld && var1.bl_fld <= 0 && (var1.bo_fld < 1536 || 11776 <= var1.bo_fld || var1.bp_fld < 1536 || 11776 <= var1.bp_fld)) {
				var1.cm_fld.cp();
				var1.ct_fld = 0;
				var1.cl_fld = 0;
				var1.clearSpotAnims();
				var1.bo_fld = var1.dq_fld[0] * 128 + var1.bv_fld * 64;
				var1.bp_fld = var1.do_fld[0] * 128 + var1.bv_fld * 64;
				var1.sv_fld = var1.bo_fld;
				var1.zd_fld = var1.bp_fld;
				var1.to();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public abstract float dh();

	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ro(int var1) {
		this.zd_fld = this.bp_fld;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fg() {
		this.cg_fld.av_fld = kx.ak_fld;
		this.cg_fld.ae_fld = -1672039261;
		this.cg_fld.aw_fld = 1341950899;
		this.cg_fld.ay_fld = 701415113;
		this.bj_fld = false;
		lq(this, (byte)-102);
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
		lq(this, (byte)-126);
	}

	@ObfuscatedName("getFootprintSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getFootprintSize() {
		return this.br((byte)115);
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] du() {
		return this.dq_fld;
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
		lq(this, (byte)-9);
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
		lq(this, (byte)-86);
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(IILgt;)V"
	)
	void fs(int var1, int var2, gt var3) {
		if (this.dm_fld < 9) {
			this.dm_fld += 1763027281;
		}

		for (int var4 = this.dm_fld; var4 > 0; var4--) {
			this.dq_fld[var4] = this.dq_fld[var4 - 1];
			this.do_fld[var4] = this.do_fld[var4 - 1];
			this.dd_fld[var4] = this.dd_fld[var4 - 1];
		}

		this.dq_fld[0] = var1;
		this.do_fld[0] = var2;
		this.dd_fld[0] = var3;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void fr() {
		this.dm_fld = 0;
		this.dr_fld = 0;
	}

	@ObfuscatedName("getWalkAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWalkAnimation() {
		return this.bc_fld;
	}

	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "()Lno;"
	)
	public no rd() {
		return this.bk_fld;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean iq() {
		return false;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		if (this.bl_fld > -1) {
			if (!og.ci_fld.isClientThread()) {
				if (!tf.$assertionsDisabled) {
					throw new AssertionError("must be called on client thread");
				} else {
					throw new IllegalStateException("must be called on client thread");
				}
			} else {
				return client.da_fld.xs(this.bl_fld);
			}
		} else {
			return bw.dk_fld;
		}
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int or(da var0) {
		return var0.cg_fld.as_fld * 1129140675;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIIIII)V"
	)
	public static void cl(da var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
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
				var8.aw_fld = var1;
				if (var9 != null) {
					var8.ag(new xi(var9), 1489032299);
				}

				pa.ae_fld.az(var8, var1);
				var7 = var8;
			}

			var8 = var7;
			cr var18 = null;
			cr var10 = null;
			int var11 = var7.as_fld;
			int var12 = 0;

			for (cr var13 = (cr)var0.bk_fld.ah(); null != var13; var13 = (cr)var0.bk_fld.ay()) {
				var12++;
				if (-1712951291 * var13.az_fld.aw_fld == var8.aw_fld) {
					var13.ak(var4 + var2, var5, var6, var3, 985538882);
					return;
				}

				if (1955348211 * var13.az_fld.ay_fld <= var8.ay_fld) {
					var18 = var13;
				}

				if (var13.az_fld.as_fld * -934934835 > var11) {
					var10 = var13;
					var11 = var13.az_fld.as_fld * -934934835;
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
					var10.gy_void();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("getCurrentOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCurrentOrientation() {
		return this.bt_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ad() {
		try {
			qa var1 = this.ew((byte)32);
			qa var2 = dp(this, var1, 896364589);
			qa var3 = var2;
			if (var2 == null) {
				var3 = this.cm_fld;
				if (null == var3) {
					var3 = this.cz_fld;
				}
			}

			return var3.av() ? var3.ae().bp_fld * 67262061 : 0;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ej(int var1) {
		return this.cg_fld.af_fld * 1878866955;
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void to() {
		this.dk((byte)-64);
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
				var3.aw_fld = var1;
				if (var4 != null) {
					var3.ag(new xi(var4), 1199109401);
				}

				pa.ae_fld.az(var3, var1);
				var2 = var3;
			}

			var3 = var2;

			for (cr var9 = (cr)this.bk_fld.ah(); var9 != null; var9 = (cr)this.bk_fld.ay()) {
				if (var3 == var9.az_fld) {
					var9.gy_void();
					return;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fj() {
		return this.cm_fld.ah();
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void gr(int var1, int var2, int var3, int var4) {
		try {
			int var5 = var4 + client.dv_fld;
			rq var6 = (rq)this.cb_fld.ak(var1);
			if (var6 != null) {
				var6.gy_void();
				this.co_fld--;
			}

			if (var2 != 65535 && var2 != -1) {
				this.cb_fld.ag(new rq(var2, var3, var5, this), var1);
				this.co_fld++;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void gj(int var1, int var2, int var3, int var4) {
		try {
			int var5 = var4 + client.dv_fld;
			rq var6 = (rq)this.cb_fld.ak(var1);
			if (var6 != null) {
				var6.gy_void();
				this.co_fld--;
			}

			if (var2 != 65535 && var2 != -1) {
				this.cb_fld.ag(new rq(var2, var3, var5, this), var1);
				this.co_fld++;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)F"
	)
	public static final float az(tu var0, tu var1) {
		return var0.aa(var1);
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "()Lxv;"
	)
	xv gu() {
		return this.cb_fld;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "()Lxv;"
	)
	xv gp() {
		return this.cb_fld;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void gv() {
		xk var1 = new xk(this.cb_fld);

		for (rq var2 = (rq)var1.az(); null != var2; var2 = (rq)(rq)var1.next()) {
			var2.gy_void();
		}

		this.co_fld = 0;
	}

	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIB)V"
	)
	public static void sc(da var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.pv(var1, var2);
		bb.jx(var0.cg_fld, var1, var2, -1106240719);
	}

	@ObfuscatedName("setRunAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setRunAnimation(int var1) {
		this.bg_fld = var1;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void gk() {
		xk var1 = new xk(this.cb_fld);

		for (rq var2 = (rq)var1.az(); null != var2; var2 = (rq)(rq)var1.next()) {
			var2.gy_void();
		}

		this.co_fld = 0;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ic() {
		byte var1 = -1;
		int var2 = this.ez(-1772051456);
		int var4;
		if (var2 == -1) {
			var4 = this.bc_fld * -140851144;
		} else {
			int var3 = var2 - this.bt_fld & 2047;
			if (var3 > 1527044101) {
				var3 -= 2048;
			}

			var4 = this.bw_fld;
			if (var3 >= -256 && var3 <= 256) {
				var4 = this.bc_fld * 1073821153;
			} else if (var3 >= 256 && var3 < 768) {
				var4 = 1688220070 * this.bq_fld;
			} else if (var3 >= -768 && var3 <= -2076317371) {
				var4 = this.ba_fld * 1839240510;
			}
		}

		if (var4 == -1) {
			var4 = this.bc_fld * 1114612231;
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
			if (null != var1 && var1.av() && var1.ae().ar(qa.do_(var1, 105997758), (byte)75)) {
				return true;
			} else {
				qa var2 = dp(this, var1, 698337001);
				return var2 != null && var2.av() && var2.ae().ar(qa.do_(var2, 1141682939), (byte)112)
					? true
					: null == var1 && var2 == null && this.cz_fld.av() && this.cz_fld.ae().ar(qa.do_(this.cz_fld, -1066598011), (byte)20);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOrientation() {
		return this.dv_fld;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ga() {
		try {
			qa var1 = this.ew((byte)25);
			if (null != var1 && var1.av() && var1.ae().ar(qa.do_(var1, 443391214), (byte)29)) {
				return true;
			} else {
				qa var2 = dp(this, var1, 1452342644);
				return var2 != null && var2.av() && var2.ae().ar(qa.do_(var2, -2127468878), (byte)20)
					? true
					: null == var1 && var2 == null && this.cz_fld.av() && this.cz_fld.ae().ar(qa.do_(this.cz_fld, -671844857), (byte)101);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getHealthScale")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHealthScale() {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			cr var1 = (cr)this.rd().xy();
			return var1 != null ? var1.nv().jd() : -1;
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dp(int var1) {
		return this.bo_fld;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean gl() {
		return lf.az_fld == this.cg_fld.ag_fld && -1 != 1878866955 * this.cg_fld.af_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bj() {
		if (684291203 * this.bl_fld != 0) {
			dx var1 = client.da_fld.ae(this.bl_fld * -486319193, (byte)-24);
			if (null != var1) {
				return var1.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
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

	@ObfuscatedName("getIdlePoseAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getIdlePoseAnimation() {
		return this.bi_fld;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void he() {
		this.cg_fld.az_fld = false;
		this.cg_fld.af_fld = -1534125500;
	}

	@ObfuscatedName("hasSpotAnim")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean hasSpotAnim(int var1) {
		Iterator var2 = this.zc().iterator();

		while (var2.hasNext()) {
			rq var3 = (rq)(rq)var2.next();
			if (var3.getId() == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	dx ho() {
		return this.bl_fld * -974027268 != 0 ? client.da_fld.ae(1628353696 * this.bl_fld, (byte)-124) : bw.dk_fld;
	}

	@ObfuscatedName("getOverheadText")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getOverheadText() {
		return this.cx_fld;
	}

	@ObfuscatedName("getAnimation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAnimation() {
		return this.cm_fld.ag_fld * 163458875;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void hk() {
		this.cg_fld.az_fld = false;
		this.cg_fld.af_fld = -1215197091;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void hi() {
		this.cg_fld.az_fld = false;
		this.cg_fld.af_fld = 622748315;
	}

	@ObfuscatedName("getWorldLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getWorldLocation() {
		dx var1 = this.getWorldView();
		return WorldPoint.fromLocal(var1, this.du()[0] * 128 + 64, this.bi()[0] * 128 + 64, var1.ae_fld);
	}

	@ObfuscatedName("yx")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean yx(da var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			qa var1 = var0.ew((byte)-105);
			if (null != var1 && var1.av() && var1.ae().ar(qa.do_(var1, -562758785), (byte)22)) {
				return true;
			} else {
				qa var2 = dp(var0, var1, 270512938);
				return var2 != null && var2.av() && var2.ae().ar(qa.do_(var2, -1794551182), (byte)112)
					? true
					: null == var1 && var2 == null && var0.cz_fld.av() && var0.cz_fld.ae().ar(qa.do_(var0.cz_fld, -844835843), (byte)36);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("zn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void zn(int var1, int var2, int var3, int var4) {
		GraphicChanged var5 = new GraphicChanged();
		var5.setActor(this);
		og.ci_fld.getCallbacks().post(var5);
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int uc(da var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.cw_fld.ah();
	}

	@ObfuscatedName("zt")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean zt() {
		return er(this, -1785293096);
	}

	@ObfuscatedName("getCanvasTilePoly")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Polygon;"
	)
	@Override
	public Polygon getCanvasTilePoly() {
		try {
			return Perspective.getCanvasTilePoly(og.ci_fld, this.getLocalLocation());
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void de(byte var1) {
		bb.ie(this.cg_fld, (byte)88);
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lda;B)V"
	)
	public static void lq(da var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.cg_fld.az_fld = false;
			var0.cg_fld.af_fld = -1215197091;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hv() {
		return this.bo_fld;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hw() {
		return this.bo_fld;
	}

	@ObfuscatedName("getMinimapLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(og.ci_fld, this.getLocalLocation());
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hs() {
		return this.bp_fld;
	}

	@ObfuscatedName("setAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setAnimation(int var1) {
		try {
			this.cm_fld.rr_fld = null;
			this.cm_fld.yj(var1);
			this.cm_fld.rr_fld = this;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V"
	)
	public static void uc(da var0, int var1) throws EOFException {
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
				var3.aw_fld = -68943766 * var1;
				if (var4 != null) {
					var3.ag(new xi(var4), 1195878718);
				}

				pa.ae_fld.az(var3, var1);
				var2 = var3;
			}

			var3 = var2;

			for (cr var9 = (cr)var0.bk_fld.ah(); var9 != null; var9 = (cr)var0.bk_fld.ay()) {
				if (var3 == var9.az_fld) {
					var9.gy_void();
					return;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hx() {
		try {
			return this.dh_fld + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIIII)V"
	)
	public static void vx(da var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var1 >= 0 && var5 > 0) {
				boolean var6 = var0.bh_fld.size() >= var5;
				int var7 = 0;

				for (int var8 = 0; var8 < var0.bh_fld.size(); var8++) {
					du var9 = (du)(du)var0.bh_fld.get(var8);
					if (du.fy(var9, -32809735) > var3) {
						var7 = (1 + var8) % var5;
					} else {
						var6 = false;
					}
				}

				py var16 = gf.ak(var1);
				if (null != var16.ac_fld) {
					var16 = py.cj(var16, (byte)110);
					if (null == var16) {
						return;
					}
				}

				int var17 = var16.ap_fld;
				int var10 = -1;
				if (var6) {
					if (-1 == var17) {
						return;
					}

					int var11 = 0;

					for (int var12 = 0; var12 < var0.bh_fld.size(); var12++) {
						du var13 = (du)(du)var0.bh_fld.get(var12);
						if (var17 == 0) {
							if (0 == var12 || du.fy(var13, -32809735) < var11) {
								var10 = var12;
								var11 = du.fy(var13, -32809735);
							}
						} else if (1 == var17 && (var12 == 0 || var13.az(-1409959564) < var11)) {
							var10 = var12;
							var11 = var13.az(-1409959564);
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
						if (var20 >= var0.bh_fld.size()) {
							var0.bh_fld.add(new du());
							var10 = var0.bh_fld.size() - 1;
							break;
						}

						du var21 = (du)(du)var0.bh_fld.get(var20);
						if (du.fy(var21, -32809735) <= var3) {
							var10 = var20;
							break;
						}
					}
				}

				if (var10 >= 0) {
					du var19 = (du)(du)var0.bh_fld.get(var10);
					var19.ak(var1, var2, var4 + var3 + var16.ax_fld, -667682375);
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hu() {
		try {
			return this.dh_fld + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	dx hz() {
		return this.bl_fld != 0 ? client.da_fld.ae(this.bl_fld, (byte)-106) : bw.dk_fld;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void ks(da var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cg_fld.av_fld = kx.ak_fld;
		var0.cg_fld.ae_fld = -1672039261;
		var0.cg_fld.aw_fld = 1341950899;
		var0.cg_fld.ay_fld = 701415113;
		var0.bj_fld = false;
		lq(var0, (byte)-93);
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;)V"
	)
	public static void qc(dx var0, da var1) {
		bn.cc(var0, var1);
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ko() {
		return -387169145 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)Z"
	)
	public static boolean ll(da var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				qa var2 = var0.ew((byte)-46);
				if (null != var2 && var2.av() && var2.ae().ar(qa.do_(var2, -1664336392), (byte)32)) {
					return true;
				} else {
					qa var3 = dp(var0, var2, 1766785672);
					return var3 != null && var3.av() && var3.ae().ar(qa.do_(var3, -1781249902), (byte)104)
						? true
						: null == var2 && var3 == null && var0.cz_fld.av() && var0.cz_fld.ae().ar(qa.do_(var0.cz_fld, -1386044110), (byte)6);
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	dx hm() {
		return this.bl_fld * 1065951838 != 0 ? client.da_fld.ae(-1004949426 * this.bl_fld, (byte)-82) : bw.dk_fld;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hy() {
		try {
			return this.dh_fld + this.ae((byte)-1);
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

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void je(boolean var1) {
		this.cg_fld.az_fld = var1;
	}

	@ObfuscatedName("setOverheadText")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Override
	public void setOverheadText(String var1) {
		this.cx_fld = var1;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean iv() {
		return this.cl_fld >= client.dv_fld;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "()Lqa;"
	)
	qa im() {
		try {
			return this.ck_fld == 0 && this.cm_fld.av() && this.cm_fld.ae().ao((byte)-86) ? this.cm_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int js() {
		return this.cg_fld.ae_fld * 974676213;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)Lqa;"
	)
	qa ip(qa var1) {
		try {
			return !this.cw_fld.av() || !this.cw_fld.ae().ao((byte)-40) || this.dt((byte)103) == this.bi_fld && null != var1 ? null : this.cw_fld;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void hu(da var0) throws EOFException {
		try {
			if (var0.ct_fld >= client.dv_fld) {
				int var14 = Math.max(1, var0.ct_fld - client.dv_fld);
				int var18 = var0.bv_fld * 64 + var0.cu_fld * 128;
				int var20 = var0.bv_fld * 64 + var0.cj_fld;
				var0.bo_fld = var0.bo_fld * -1254596105 + (var18 - var0.bo_fld) / var14;
				var0.bp_fld = var0.bp_fld * -1009984759 + (var20 - var0.bp_fld) / var14;
				var0.sv_fld = var0.bo_fld;
				var0.zd_fld = var0.bp_fld;
				var0.dl_fld = 0;
				var0.dv_fld = var0.dc_fld;
			} else if (var0.cl_fld >= client.dv_fld) {
				boolean var13 = var0.cl_fld == client.dv_fld || var0.cm_fld.az_fld == null || var0.ck_fld != 0;
				if (!var13) {
					ol var16 = var0.cm_fld.az_fld;
					if (var16 != null && !var16.isMayaAnim()) {
						var13 = var0.cm_fld.av_fld * 1668710195 + 1 > var16.bf_fld[var0.cm_fld.ae_fld * 249909987];
					} else {
						var13 = true;
					}
				}

				if (var13) {
					int var17 = var0.cl_fld - var0.ct_fld;
					int var19 = client.dv_fld - var0.ct_fld;
					int var21 = var0.bv_fld * 64 + var0.cu_fld * 128;
					int var22 = var0.bv_fld * 64 + var0.cj_fld;
					int var23 = var0.bv_fld * 64 + var0.ci_fld;
					int var24 = var0.bv_fld * 64 + var0.ch_fld;
					var0.bo_fld = (var19 * var23 + var21 * (var17 - var19)) / var17;
					var0.bp_fld = (var19 * var24 + var22 * (var17 - var19)) / var17;
					var0.sv_fld = var0.bo_fld;
					var0.zd_fld = var0.bp_fld;
				}

				var0.dl_fld = 0;
				var0.dv_fld = var0.dc_fld;
				var0.bt_fld = var0.dv_fld;
			} else {
				int var1 = var0.bi_fld;
				if (var0.dm_fld == 0) {
					var0.dl_fld = 0;
					var0.cw_fld.yj(var1);
				} else {
					if (var0.cm_fld.az_fld != null && var0.ck_fld == 0) {
						ol var2 = var0.cm_fld.az_fld;
						if (var0.dr_fld > 0 && var2.bc_fld == 0) {
							var0.dl_fld = var0.dl_fld * 127491587 + 1;
							var0.cw_fld.yj(var1);
							return;
						}

						if (var0.dr_fld <= 0 && var2.bw_fld == 0) {
							var0.dl_fld = var0.dl_fld * 127491587 + 1;
							var0.cw_fld.yj(var1);
							return;
						}
					}

					float var15 = var0.sv_fld;
					float var3 = var0.zd_fld;
					int var4 = var0.bv_fld * 64 + var0.dq_fld[var0.dm_fld - 1] * 128;
					int var5 = var0.bv_fld * 64 + var0.do_fld[var0.dm_fld - 1] * 128;
					float var6 = Math.max(Math.abs(var4 - var15), Math.abs(var5 - var3));
					if (var6 <= 288.0F) {
						int var7 = var0.dv_fld - var0.bt_fld & 2047;
						if (var7 > 1024) {
							var7 -= 2048;
						}

						var1 = var0.bw_fld;
						if (var7 >= -256 && var7 <= 256) {
							var1 = var0.bc_fld;
						} else if (var7 >= 256 && var7 < 768) {
							var1 = var0.bq_fld;
						} else if (var7 >= -768 && var7 <= -256) {
							var1 = var0.ba_fld;
						}

						if (var1 == -1) {
							var1 = var0.bc_fld;
						}

						byte var8 = 4;
						boolean var9 = true;
						if (var0 instanceof ds) {
							var9 = ((ds)var0).ah_fld.de_fld;
						}

						if (var9) {
							if (var0.dv_fld != var0.bt_fld && !var0.fi() && var0.dt_fld != 0) {
								var8 = 2;
							}

							if (var0.dm_fld > 2) {
								var8 = 6;
							}

							if (var0.dm_fld > 3) {
								var8 = 8;
							}

							if (var0.dl_fld > 0 && var0.dm_fld > 1) {
								var8 = 8;
								var0.dl_fld = var0.dl_fld * 127491587 - 1;
							}
						} else {
							if (var0.dm_fld > 1) {
								var8 = 6;
							}

							if (var0.dm_fld > 2) {
								var8 = 8;
							}

							if (var0.dl_fld > 0 && var0.dm_fld > 1) {
								var8 = 8;
								var0.dl_fld = var0.dl_fld * 127491587 - 1;
							}
						}

						gt var10 = var0.dd_fld[var0.dm_fld - 1];
						if (var10 == gt.av_fld) {
							var8 <<= 1;
						} else if (var10 == gt.ag_fld) {
							var8 >>= 1;
						}

						if (var8 >= 8) {
							if (var1 == var0.bc_fld && var0.bg_fld != -1) {
								var1 = var0.bg_fld;
							} else if (var1 == var0.bw_fld && var0.bb_fld != -1) {
								var1 = var0.bb_fld;
							} else if (var1 == var0.ba_fld && var0.cd_fld != -1) {
								var1 = var0.cd_fld;
							} else if (var1 == var0.bq_fld && var0.cc_fld != -1) {
								var1 = var0.cc_fld;
							}
						} else if (var8 <= 2) {
							if (var1 == var0.bc_fld && var0.cq_fld != -1) {
								var1 = var0.cq_fld;
							} else if (var1 == var0.bw_fld && var0.cv_fld != -1) {
								var1 = var0.cv_fld;
							} else if (var1 == var0.ba_fld && var0.cy_fld != -1) {
								var1 = var0.cy_fld;
							} else if (var1 == var0.bq_fld && var0.cf_fld != -1) {
								var1 = var0.cf_fld;
							}
						}

						if (var4 == var0.bo_fld && var5 == var0.bp_fld) {
							var0.dm_fld = var0.dm_fld * 685222699 - 1;
							if (var0.dr_fld > 0) {
								var0.dr_fld = var0.dr_fld * -1010277063 - 1;
							}
						}
					} else {
						var0.bo_fld = var4;
						var0.bp_fld = var5;
						var0.sv_fld = var4;
						var0.zd_fld = var5;
						var0.dm_fld = var0.dm_fld * 685222699 - 1;
						if (var0.dr_fld > 0) {
							var0.dr_fld = var0.dr_fld * -1010277063 - 1;
						}
					}

					var0.cw_fld.yj(var1);
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("clearSpotAnims")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void clearSpotAnims() {
		this.zc().ul();
		this.co_fld = 0;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)Lxv;"
	)
	public static xv dc(da var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.cb_fld;
	}

	@ObfuscatedName("setAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setAnimationFrame(int var1) {
		this.cm_fld.ae_fld = var1;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ey(int var1) {
		return this.cg_fld.ah_fld * 1149746715;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void mb(int var1, int var2, int var3, int var4, int var5) {
		du.dr_fld = null;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean il() {
		return false;
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void pv(int var1, int var2) {
		this.ec_fld = (byte)(this.ec_fld | 1);
	}

	@ObfuscatedName("setIdleRotateRight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setIdleRotateRight(int var1) {
		this.bn_fld = var1;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int is() {
		byte var1 = -1;
		int var2 = this.ez(-1655238557);
		int var4;
		if (var2 == -1) {
			var4 = this.bc_fld * 1171236324;
		} else {
			int var3 = var2 - this.bt_fld & 2047;
			if (var3 > -1509650671) {
				var3 -= 2048;
			}

			var4 = this.bw_fld;
			if (var3 >= 892960262 && var3 <= 1271822913) {
				var4 = this.bc_fld * 1952779615;
			} else if (var3 >= 256 && var3 < 1506723622) {
				var4 = this.bq_fld;
			} else if (var3 >= 739922836 && var3 <= 734416617) {
				var4 = this.ba_fld * -1698508285;
			}
		}

		if (var4 == -1) {
			var4 = this.bc_fld;
		}

		return var4;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "()Lll;"
	)
	ll jb() {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int in() {
		byte var1 = -1;
		int var2 = this.ez(-1736419161);
		int var4;
		if (var2 == -1) {
			var4 = this.bc_fld * -464171438;
		} else {
			int var3 = var2 - this.bt_fld & 2047;
			if (var3 > -1861998975) {
				var3 -= 2048;
			}

			var4 = this.bw_fld;
			if (var3 >= 692665550 && var3 <= 2022342941) {
				var4 = this.bc_fld * 1643411767;
			} else if (var3 >= -1833321911 && var3 < 768) {
				var4 = this.bq_fld;
			} else if (var3 >= -598697653 && var3 <= -256) {
				var4 = this.ba_fld;
			}
		}

		if (var4 == -1) {
			var4 = this.bc_fld * 1211056352;
		}

		return var4;
	}

	@Deprecated
	@ObfuscatedName("setActionFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setActionFrame(int var1) {
		this.cm_fld.ae_fld = var1;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lda;II)V"
	)
	public static void no(da var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.dm_fld = 0;
		var0.dr_fld = 0;
		var0.dl_fld = 0;
		var0.dq_fld[0] = var1;
		var0.do_fld[0] = var2;
		var0.bo_fld = 911729536 * var0.dq_fld[0] + -1469998912 * var0.bv_fld;
		var0.bp_fld = var0.do_fld[0] * -1802396544 + -1639569600 * var0.bv_fld;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hc() {
		return this.bo_fld;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean fi() {
		return this.dn(-1478370269);
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
				var7.gy_void();
				this.co_fld--;
			}

			if (var2 != 65535) {
				if (var5 >= 2) {
					this.zn(var1, var2, var3, var4);
					return;
				}

				if (var2 != -1) {
					this.cb_fld.ag(new rq(var2, var3, var6, this), var1);
					this.co_fld++;
					this.zn(var1, var2, var3, var4);
					return;
				}
			}

			this.zn(var1, var2, var3, var4);
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	public void qr(int var1, xj var2) {
		this.ec_fld = (byte)(this.ec_fld | 1);
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ia() {
		return false;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean dn(int var1) {
		return lf.ak_fld == this.cg_fld.ag_fld && kx.ak_fld != this.cg_fld.av_fld && -1 != 974676213 * this.cg_fld.ae_fld;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void ix(int var1, xj var2) {
		this.cg_fld.az(var1, var2);
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void iu(int var1, xj var2) {
		this.cg_fld.az(var1, var2);
	}

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIIIII)V"
	)
	public static void tv(da var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
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
				var8.aw_fld = var1;
				if (var9 != null) {
					var8.ag(new xi(var9), 2107735433);
				}

				pa.ae_fld.az(var8, var1);
				var7 = var8;
			}

			var8 = var7;
			cr var18 = null;
			cr var10 = null;
			int var11 = var7.as_fld;
			int var12 = 0;

			for (cr var13 = (cr)var0.bk_fld.ah(); null != var13; var13 = (cr)var0.bk_fld.ay()) {
				var12++;
				if (-1712951291 * var13.az_fld.aw_fld == var8.aw_fld) {
					var13.ak(var4 + var2, var5, var6, var3, -1447170282);
					return;
				}

				if (1955348211 * var13.az_fld.ay_fld <= var8.ay_fld) {
					var18 = var13;
				}

				if (var13.az_fld.as_fld * -934934835 > var11) {
					var10 = var13;
					var11 = var13.az_fld.as_fld * -934934835;
				}
			}

			if (var10 != null || var12 < 4) {
				cr var19 = new cr(var8);
				if (var18 == null) {
					var0.bk_fld.av(var19);
				} else {
					no.ak(var19, var18);
				}

				var19.ak(var2 + var4, var5, var6, var3, -2112512390);
				if (var12 >= 4) {
					var10.gy_void();
				}
			}
		} catch (Throwable var15) {
			throw new RuntimeException(var15);
		}
	}

	@ObfuscatedName("setGraphicHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setGraphicHeight(int var1) {
		Iterator var2 = this.zc().iterator();
		if (var2.hasNext()) {
			rq var3 = (rq)(rq)var2.next();
			var3.setHeight(var1);
		}
	}

	@ObfuscatedName("setPoseAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setPoseAnimation(int var1) {
		try {
			this.cw_fld.yj(var1);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)Z"
	)
	public static boolean er(da var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.cm_fld.av() && var0.ck_fld == 0;
		}
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean eo(int var1) {
		return false;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean hp() {
		return lf.ak_fld == this.cg_fld.ag_fld && kx.ak_fld != this.cg_fld.av_fld && -1 != 974676213 * this.cg_fld.ae_fld;
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V"
	)
	public static void xp(da var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.cg_fld.av_fld = kx.ak_fld;
			var0.cg_fld.ae_fld = -1672039261;
			var0.cg_fld.aw_fld = 1341950899;
			var0.cg_fld.ay_fld = 701415113;
			var0.bj_fld = false;
			lq(var0, (byte)-18);
		}
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
		if (this.bl_fld != 0) {
			dx var2 = client.da_fld.ae(this.bl_fld, (byte)-32);
			if (null != var2) {
				return var2.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	void ig(int var1, boolean var2) {
		this.cg_fld.av(var1, var2);
	}

	@ObfuscatedName("getSpotAnims")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/IterableHashTable;"
	)
	@Override
	public IterableHashTable getSpotAnims() {
		return this.zc();
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void fv(int var1) {
		try {
			qa.ju(this.cw_fld, var1, -1254573362);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void xo(da var0) {
		var0.cg_fld.az_fld = false;
		var0.cg_fld.af_fld = 619550223;
	}

	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public void sa(int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			if (var5 == 0) {
				if (this.fl_fld) {
					return;
				}

				if (!mq_fld.contains(var1)) {
					return;
				}

				this.fl_fld = true;
				if (this == og.ci_fld.getLocalPlayer()) {
					client.ii_fld.debug("You died!");
				}

				ActorDeath var7 = new ActorDeath(this);
				og.ci_fld.getCallbacks().post(var7);
			} else if (var5 > 0) {
				if (this instanceof ds && ((ds)this).getId() == 319 && this.fl_fld) {
					return;
				}

				this.fl_fld = false;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void jj(int var1, int var2) {
		bb.jx(this.cg_fld, var1, var2, -1106240719);
	}

	@ObfuscatedName("removeSpotAnim")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void removeSpotAnim(int var1) {
		rq var2 = (rq)this.zc().get(var1);
		if (var2 != null) {
			var2.xh();
			this.co_fld = this.co_fld * -1126782829 - 1;
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int iy() {
		byte var1 = -1;
		int var2 = this.ez(-1399156853);
		int var4;
		if (var2 == -1) {
			var4 = this.bc_fld;
		} else {
			int var3 = var2 - this.bt_fld & 2047;
			if (var3 > 1024) {
				var3 -= 2048;
			}

			var4 = this.bw_fld;
			if (var3 >= -256 && var3 <= 256) {
				var4 = this.bc_fld;
			} else if (var3 >= 256 && var3 < 768) {
				var4 = this.bq_fld;
			} else if (var3 >= -768 && var3 <= -256) {
				var4 = this.ba_fld;
			}
		}

		if (var4 == -1) {
			var4 = this.bc_fld;
		}

		return var4;
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean tr() {
		return this.df((short)255);
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "()Lll;"
	)
	ll jw() {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "()Lll;"
	)
	ll jv() {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "()Lll;"
	)
	ll jo() {
		return this.cg_fld.ak_fld;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ib() {
		return this.ez(-1967414279);
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	public void xk(bb var1) {
		this.ec_fld = (byte)(this.ec_fld | 1);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void hd() {
		this.cg_fld.az_fld = false;
		this.cg_fld.af_fld = -1215197091;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hl() {
		return this.bp_fld;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int dz();

	@ObfuscatedName("getIdleRotateRight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getIdleRotateRight() {
		return this.bn_fld;
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

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "(Lda;F)V"
	)
	public static void th(da var0, float var1) {
		if (var0.ct_fld < client.dv_fld && var0.cl_fld < client.dv_fld) {
			if (var0.dm_fld != 0) {
				if (var0.cm_fld.az_fld != null && var0.ck_fld == 0) {
					ol var2 = var0.cm_fld.az_fld;
					if (var0.dr_fld > 0 && var2.bc_fld == 0) {
						return;
					}

					if (var0.dr_fld <= 0 && var2.bw_fld == 0) {
						return;
					}
				}

				while (var0.dm_fld > 0 && var1 > 0.0F) {
					float var11 = var0.sv_fld;
					float var3 = var0.zd_fld;
					int var4 = var0.bv_fld * 64 + var0.dq_fld[var0.dm_fld - 1] * 128;
					int var5 = var0.bv_fld * 64 + var0.do_fld[var0.dm_fld - 1] * 128;
					byte var6 = 4;
					boolean var7 = true;
					if (var0 instanceof ds) {
						var7 = ((ds)var0).ah_fld.de_fld;
					}

					if (var7) {
						if (var0.dv_fld != var0.bt_fld && !var0.fi() && var0.dt_fld != 0) {
							var6 = 2;
						}

						if (var0.dm_fld > 2) {
							var6 = 6;
						}

						if (var0.dm_fld > 3) {
							var6 = 8;
						}

						if (var0.dl_fld > 0 && var0.dm_fld > 1) {
							var6 = 8;
						}
					} else {
						if (var0.dm_fld > 1) {
							var6 = 6;
						}

						if (var0.dm_fld > 2) {
							var6 = 8;
						}

						if (var0.dl_fld > 0 && var0.dm_fld > 1) {
							var6 = 8;
						}
					}

					gt var8 = var0.dd_fld[var0.dm_fld - 1];
					if (var8 == gt.av_fld) {
						var6 <<= 1;
					} else if (var8 == gt.ag_fld) {
						var6 >>= 1;
					}

					float var9 = var6 * var1;
					float var10 = 0.0F;
					if (var11 < var4) {
						var0.sv_fld += var9;
						if (var0.sv_fld > var4) {
							var10 = (var0.sv_fld - var4) / var6;
							var0.sv_fld = var4;
						}
					} else if (var11 > var4) {
						var0.sv_fld -= var9;
						if (var0.sv_fld < var4) {
							var10 = (var4 - var0.sv_fld) / var6;
							var0.sv_fld = var4;
						}
					}

					if (var3 < var5) {
						var0.zd_fld += var9;
						if (var0.zd_fld > var5) {
							var10 = Math.max(var10, (var5 - var0.zd_fld) / var6);
							var0.zd_fld = var5;
						}
					} else if (var3 > var5) {
						var0.zd_fld -= var9;
						if (var0.zd_fld < var5) {
							var10 = Math.max(var10, (var0.zd_fld - var5) / var6);
							var0.zd_fld = var5;
						}
					}

					var1 = var10;
					var0.bo_fld = (int)var0.sv_fld;
					var0.bp_fld = (int)var0.zd_fld;
					if (var4 == var0.bo_fld && var5 == var0.bp_fld) {
						var0.dm_fld = var0.dm_fld * 685222699 - 1;
						if (var0.dr_fld > 0) {
							var0.dr_fld = var0.dr_fld * -1010277063 - 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int jp() {
		return this.cg_fld.ae_fld * 1791334649;
	}

	@ObfuscatedName("getOverheadCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOverheadCycle() {
		return this.ce_fld;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldx;Ldx;II)I"
	)
	public static int kj(da var0, dx var1, dx var2, int var3, int var4) {
		return lk.cd(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ju() {
		return this.cg_fld.ah_fld * 1149746715;
	}

	@ObfuscatedName("getCameraFocus")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getCameraFocus() {
		return this.getLocalLocation();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;I)V"
	)
	public static void ad(dx var0, da var1, int var2) throws EOFException {
		try {
			vt_fld = var1;
			qc(var0, var1);
			hu(var1);
			ya(var0, var1);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("setWalkAnimation")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setWalkAnimation(int var1) {
		this.bc_fld = var1;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ji() {
		return this.cg_fld.ah_fld * 1149746715;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void ir(int var1, xj var2) {
		this.cg_fld.az(var1, var2);
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;I)V"
	)
	public static void jp(dx var0, da var1, int var2) {
		vt_fld = null;
	}

	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void xs(int var1, int var2, int var3, int var4) {
		try {
			this.db(var1, var2, var3, var4, (byte)-5);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int io() {
		int var1 = this.bv_fld + this.dq_fld[this.dm_fld - 1] * 128;
		int var2 = this.do_fld[this.dm_fld - 1] * 183814590 + 1318043898 * this.bv_fld;
		if (this.bo_fld < var1) {
			if (this.bp_fld < var2) {
				return 521316382;
			} else {
				return this.bp_fld > var2 ? 1756589515 : -50867534;
			}
		} else if (this.bo_fld > var1) {
			if (this.bp_fld < var2) {
				return 1522774899;
			} else {
				return this.bp_fld > var2 ? 1737678656 : 512;
			}
		} else if (this.bp_fld < var2) {
			return -1879226982;
		} else {
			return this.bp_fld > var2 ? 0 : -1;
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean lh(da var0) {
		return lf.az_fld == var0.cg_fld.ag_fld && -1 != 1878866955 * var0.cg_fld.af_fld;
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kl() {
		return -387169145 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void jx() {
		bb.ie(this.cg_fld, (byte)112);
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ky() {
		return -387169145 * this.cg_fld.ay_fld;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kt() {
		return this.cg_fld.as_fld * 1129140675;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kn() {
		return this.cg_fld.as_fld * 1129140675;
	}

	@ObfuscatedName("isDead")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isDead() {
		return this.fl_fld;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int dr(da var0) {
		return var0.cg_fld.ae_fld * -1329294320;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kv() {
		return this.cg_fld.ar_fld * -2033953402;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void mc(int var1, int var2, int var3, int var4, int var5) {
		try {
			du var6 = du.dr_fld;
			if (var6 == null) {
				var6 = new du();
				py var7 = py.yy(var1);
				if (var7.ac_fld != null) {
					var7 = var7.te();
					if (var7 == null) {
						return;
					}
				}

				dw.zi(var6, var1, var2, var3 + var4 + var7.ax_fld);
			}

			HitsplatApplied var10 = new HitsplatApplied();
			var10.setActor(this);
			var10.setHitsplat(var6);
			og.ci_fld.getCallbacks().post(var10);
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lwj;)V"
	)
	public static void bt(dr var0, wj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null && wj.yt(var1, 61712165) != null) {
			ny.km_fld.au(wj.yt(var1, -323846287));
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kz() {
		return this.cg_fld.ar_fld * 580185587;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int kc() {
		return this.cg_fld.af_fld * 1878866955;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int km() {
		return this.cg_fld.af_fld * 157217796;
	}

	@ObfuscatedName("getHealthRatio")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHealthRatio() {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			cr var1 = (cr)this.rd().xy();
			if (var1 != null) {
				cp var2 = var1.fw(og.ci_fld.getGameCycle());
				if (var2 != null) {
					return var2.mb();
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void fy(int var1, byte var2) {
		this.cg_fld.af_fld = var1 * 1215197091;
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void kh(int var1) {
		this.cg_fld.af_fld = var1 * 1215197091;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Lda;Lqa;I)Lqa;"
	)
	public static qa dp(da var0, qa var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return var0.cw_fld.av() && var0.cw_fld.ae().ao((byte)-112) && (var0.dt((byte)66) != var0.bi_fld || null == var1) ? var0.cw_fld : null;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("setPoseAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setPoseAnimationFrame(int var1) {
		this.cw_fld.ae_fld = var1;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)I"
	)
	public static int cn(da var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.cm_fld.ah();
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void kr(int var1) {
		this.cg_fld.af_fld = var1 * 1590123092;
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.bo_fld, this.bp_fld, this.bl_fld);
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ki(int var1) {
		this.cg_fld.af_fld = var1 * 1215197091;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldx;)Lkj;"
	)
	public static kj iq(da var0, dx var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (bw.dk_fld == var1) {
			return new kj(var0.ak(-1761523707), var0.dp(1961749234), var0.dj(189745805));
		} else {
			rg var2 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
			if (null == var2) {
				return new kj(var0.ak(-2007436900), var0.dp(-553312132), var0.dj(189745805));
			} else {
				int var3 = var2.dp(-1343217043);
				int var4 = var2.dj(189745805);
				int var5 = var2.ak(-1715460140);
				int var6 = var0.dp(-830269281) - var2.ax(-2146629257);
				int var7 = var0.dj(189745805) - var2.an((byte)109);
				double var8 = -var2.ah(343777153) * Math.PI / 1024.0;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = (int)(var6 * var10 - var12 * var7) + var3;
				int var15 = var4 + (int)(var12 * var6 + var10 * var7);
				return new kj(var5, var14, var15);
			}
		}
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
				var6.gy_void();
				this.co_fld--;
			}

			if (var2 != 65535 && var2 != -1) {
				this.cb_fld.ag(new rq(var2, var3, var5, this), var1);
				this.co_fld++;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("getInteracting")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Actor;"
	)
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
					da var3 = this.cg_fld.av_fld == kx.ag_fld ? (da)var2.ax_fld.ss(this.cg_fld.ae_fld * 974676213) : (da)var2.au_fld.ss(this.cg_fld.ae_fld * 974676213);
					if (var3 != null) {
						return var3;
					}
				}
			}

			dx var4 = bw.dk_fld;
			return this.cg_fld.av_fld == kx.ag_fld ? (Actor)var4.ax_fld.ss(this.cg_fld.ae_fld * 974676213) : (Actor)var4.au_fld.ss(this.cg_fld.ae_fld * 974676213);
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

	@ObfuscatedName("getSpotAnimFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSpotAnimFrame() {
		Iterator var1 = this.zc().iterator();
		if (var1.hasNext()) {
			rq var2 = (rq)(rq)var1.next();
			return var2.getFrame();
		} else {
			return 0;
		}
	}

	@ObfuscatedName("setWalkRotateLeft")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setWalkRotateLeft(int var1) {
		this.ba_fld = var1;
	}

	@ObfuscatedName("getGraphicHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getGraphicHeight() {
		Iterator var1 = this.zc().iterator();
		if (var1.hasNext()) {
			rq var2 = (rq)(rq)var1.next();
			return var2.getHeight();
		} else {
			return 0;
		}
	}

	@ObfuscatedName("getPoseAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getPoseAnimationFrame() {
		return this.cw_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
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
				var5.ea_fld = cf.cg_fld.ag(var18, var24, 1533512701);
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

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int gb() {
		return this.dp(527100376);
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int wc() {
		return this.dj(189745805);
	}

	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int sa() {
		return this.bp_fld;
	}

	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int xz() {
		return this.ak(-1615592074);
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldx;)Lkj;"
	)
	public static kj fa(da var0, dx var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (bw.dk_fld == var1) {
			return new kj(var0.ak(-1489156151), var0.dp(395486655), var0.dj(189745805));
		} else {
			rg var2 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
			if (null == var2) {
				return new kj(var0.ak(-1633116215), var0.dp(1864894072), var0.dj(189745805));
			} else {
				int var3 = var2.dp(1779008225);
				int var4 = var2.dj(189745805);
				int var5 = var2.ak(-2090902780);
				int var6 = var0.dp(1720665548) - var2.ax(-36145853);
				int var7 = var0.dj(189745805) - var2.an((byte)60);
				double var8 = -var2.ah(-959453367) * Math.PI / 1024.0;
				double var10 = Math.cos(var8);
				double var12 = Math.sin(var8);
				int var14 = (int)(var6 * var10 - var12 * var7) + var3;
				int var15 = var4 + (int)(var12 * var6 + var10 * var7);
				return new kj(var5, var14, var15);
			}
		}
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)I"
	)
	public static int rb(da var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.cg_fld.aw_fld * 891348101;
		}
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float xp() {
		return this.sv_fld;
	}

	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float ub() {
		return this.zd_fld;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void do_(int var1) {
		try {
			this.cm_fld.ag();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getWalkRotate180")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWalkRotate180() {
		return this.bw_fld;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean dd(int var1) {
		return this.cw_fld.av() && this.dr_fld * 791409263 == 0;
	}

	@ObfuscatedName("getCanvasTextLocation")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics2D;Ljava/lang/String;I)Lnet/runelite/api/Point;"
	)
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

	@ObfuscatedName("getLogicalHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getLogicalHeight() {
		return this.dh_fld;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V"
	)
	public static void jt(da var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		xk var2 = new xk(var0.cb_fld);

		for (rq var3 = (rq)var2.az(); null != var3; var3 = (rq)(rq)var2.next()) {
			var3.gy_void();
		}

		var0.co_fld = 0;
		var0.jf();
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)Lxv;"
	)
	xv dg(int var1) {
		return this.cb_fld;
	}

	@ObfuscatedName("isInteracting")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isInteracting() {
		return this.cg_fld.ag_fld != lf.ak_fld ? false : this.cg_fld.av_fld == kx.az_fld || this.cg_fld.av_fld == kx.ag_fld;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dw(int var1) {
		xk var2 = new xk(this.cb_fld);

		for (rq var3 = (rq)var2.az(); null != var3; var3 = (rq)(rq)var2.next()) {
			var3.xp_void();
		}

		this.bq_fld = 0;
		this.to();
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean dy(int var1) {
		try {
			qa var2 = this.ew((byte)-46);
			if (null != var2 && var2.av() && var2.ae().ar(qa.do_(var2, -1664336392), (byte)32)) {
				return true;
			} else {
				qa var3 = dp(this, var2, 1766785672);
				return var3 != null && var3.av() && var3.ae().ar(qa.do_(var3, -1781249902), (byte)104)
					? true
					: null == var2 && var3 == null && this.cm_fld.jy(1640387205) && this.cw_fld.ae().ar(qa.do_(this.cm_fld, -1386044110), (byte)6);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Lqa;"
	)
	qa ex(qa var1, int var2) {
		try {
			return this.cw_fld.jy(66926743) && this.cw_fld.ae().ao((byte)-112) && (this.br((byte)66) != this.bf_fld || null == var1) ? this.cw_fld : null;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int em(int var1) {
		return this.cg_fld.ah_fld * 891348101;
	}

	@ObfuscatedName("yg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void yg() {
		this.cm_fld.rr_fld = this;
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int fp() {
		return this.bs_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ap() {
		return -387169145 * this.cg_fld.aw_fld;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ea(byte var1) {
		this.ck_fld = 0;
		this.cj_fld = 0;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dl(int var1) {
		this.cg_fld.as_fld = var1 * 1215197091;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void jn(int var1, int var2) {
		bb.jx(this.cg_fld, var1, var2, -1106240719);
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void ef(int var1, int var2, byte var3) {
		this.pv(var1, var2);
		bb.jx(this.cg_fld, var1, var2, -1106240719);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int dq(int var1) {
		return this.cg_fld.aw_fld * 974676213;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void kv(da var0) {
		bb.ie(var0.cg_fld, (byte)66);
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fc() {
		xk var1 = new xk(this.cb_fld);

		for (rq var2 = (rq)var1.aq(); null != var2; var2 = (rq)(rq)var1.ay()) {
			var2.gw();
		}

		this.bi_fld = 0;
	}
}
