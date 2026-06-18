import java.io.EOFException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.Point;
import net.runelite.api.RenderOverview;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapData;

@ObfuscatedName("wl")
@Implements({"RenderOverview"})
public class wl implements RenderOverview {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashSet;"
	)
	HashSet aa_fld;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashSet;"
	)
	HashSet cv_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	static xy aw_fld = xy.av_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	static xy ay_fld = xy.ae_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	static xy as_fld = xy.ah_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ax_fld = new int[]{1008, 1009, 1010, 1011, 1012};
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean an_fld = false;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1203303271
	)
	int cn_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub aq_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub am_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lzf;"
	)
	zf ad_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 158887915
	)
	int cg_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	yc[] ab_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1761679829
	)
	int cr_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	gf ac_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	gf at_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	gd bm_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	wt bd_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1298639273
	)
	int bx_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean cy_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1097572161
	)
	int be_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap ap_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	List cx_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float bk_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -516858755
	)
	int bj_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1884500973
	)
	int bf_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -601726567
	)
	int by_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap ao_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1088176287
	)
	int bw_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -621946937
	)
	int bs_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bp_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashSet;"
	)
	HashSet bt_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1635027365
	)
	int bv_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -9652181
	)
	int bi_fld;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -669418089
	)
	int bu_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float bh_fld;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1901396113
	)
	int bc_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1903512605
	)
	int br_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 7161032785986769003L
	)
	long ba_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1549059757
	)
	int bq_fld;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 337493205
	)
	int bg_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1450942607
	)
	int bl_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashSet;"
	)
	HashSet cd_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashSet;"
	)
	HashSet cc_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashSet;"
	)
	HashSet cq_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 458875891
	)
	int bn_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -803309005
	)
	int bo_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	gf aj_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2027603977
	)
	int bz_fld;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Iterator;"
	)
	Iterator cs_fld;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	kj cp_fld;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 92974729
	)
	int cf_fld;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lyv;"
	)
	yv ce_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1094530325
	)
	int ca_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bb_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		if (!fv(this, 56564401)) {
			if (var1 != -282914073) {
				;
			}
		} else {
			int var2 = this.be_fld - this.bz_fld;
			int var3 = this.bs_fld - this.br_fld;
			if (0 != var2) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			if (var3 != 0) {
				var3 /= Math.min(8, Math.abs(var3));
			}

			fi(this, var2 + this.bz_fld, var3 + this.br_fld, true);
			if (this.bz_fld == this.be_fld && this.bs_fld == this.br_fld) {
				if (var1 == -282914073) {
					return;
				}

				this.be_fld = 881914049;
				this.bs_fld = 71648777;
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ii() {
		return this.bj_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean bg(byte var1) {
		return !this.cy_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void bk(wl var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (aac.ak_fld < 238) {
				var0.bd_fld.az();
			} else {
				var0.bd_fld.ag();
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ah(byte var1) {
		if (null != fs.gh_fld) {
			if (var1 == 1) {
				this.bh_fld = this.bk_fld;
			}
		} else {
			if (this.bh_fld < this.bk_fld) {
				if (var1 != 1) {
					return;
				}

				this.bh_fld = Math.min(this.bk_fld, this.bh_fld / 30.0F + this.bh_fld);
			}

			if (this.bh_fld > this.bk_fld) {
				if (var1 != 1) {
					return;
				}

				this.bh_fld = Math.max(this.bk_fld, this.bh_fld - this.bh_fld / 30.0F);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void as(int var1) {
		this.bw_fld = -797236063;
		this.bc_fld = 1355890575;
		this.bn_fld = 1554092741;
		this.bu_fld = -1084805671;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lgf;"
	)
	public gf af(int var1, int var2, int var3, int var4) {
		Iterator var5 = this.ap_fld.values().iterator();

		while (var5.hasNext()) {
			gf var6 = (gf)(gf)var5.next();
			if (gf.fv(var6, var1, var2, var3, (byte)25)) {
				return var6;
			}
		}

		return null;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZI)V"
	)
	public static void fi(wl var0, int var1, int var2, boolean var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bz_fld = var1;
			var0.br_fld = var2;
			lz.ak();
			if (var3) {
				var0.as(-455662490);
			}
		}
	}

	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int st() {
		return this.bz_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V"
	)
	public void al(int var1, int var2, int var3, boolean var4, byte var5) {
		try {
			gf var6 = this.af(var1, var2, var3, 1933130912);
			if (null == var6) {
				if (!var4) {
					return;
				}

				if (var5 != 61) {
					return;
				}

				var6 = this.at_fld;
			}

			boolean var7 = false;
			if (this.aj_fld != var6 || var4) {
				this.aj_fld = var6;
				this.aa(var6, 1983959345);
				var7 = true;
			}

			if (!var7) {
				if (var5 != 61) {
					return;
				}

				if (!var4) {
					return;
				}
			}

			ys(this, var1, var2, var3);
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;II)F"
	)
	public static float tq(wl var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 == 25) {
			return 1.0F;
		} else if (37 == var1) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ax(int var1) {
		return null == this.ac_fld ? -1 : this.ac_fld.ay(-143778459);
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)Lgf;"
	)
	public gf el(int var1) {
		return this.ac_fld;
	}

	@ObfuscatedName("zb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int zb() {
		return this.br_fld;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int oj() {
		return this.bf_fld;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void da(int var1) {
		try {
			gf var2 = this.be(var1, -204323328);
			if (null != var2) {
				this.aa(var2, 1899149716);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lkj;Lkj;ZI)V"
	)
	public void aq(gf var1, kj var2, kj var3, boolean var4, int var5) {
		try {
			if (null == var1) {
				if (var5 == 773462580) {
					;
				}
			} else {
				if (this.ac_fld == null || var1 != this.ac_fld) {
					this.ai(var1, (byte)1);
				}

				if (!var4 && gf.fv(this.ac_fld, var2.az_fld, var2.ak_fld, var2.ag_fld, (byte)36)) {
					ys(this, var2.az_fld, var2.ak_fld, var2.ag_fld);
				} else {
					ys(this, var3.az_fld, var3.ak_fld, var3.ag_fld);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z"
	)
	boolean ab(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.ce_fld == null) {
			return true;
		} else if (this.ce_fld.aw_fld == var1 && this.ce_fld.ay_fld == var2) {
			if (this.bm_fld.av_fld * 253584221 != this.cn_fld) {
				return true;
			} else if (client.gr_fld != this.cg_fld) {
				return true;
			} else {
				return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IIZ)V"
	)
	final void ct(int var1, int var2, boolean var3) {
		this.bz_fld = var1;
		this.br_fld = var2;
		lz.ak();
		if (var3) {
			this.as(1617225818);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V"
	)
	public void at(int var1, int var2, int var3, int var4, short var5) {
		try {
			if (this.bd_fld.av()) {
				if (!this.bm_fld.ay(1604475992)) {
					this.bm_fld.ak(this.ai_fld, this.ac_fld, client.ct_fld, -2062558696);
					if (!this.bm_fld.ay(1033816324)) {
						return;
					}
				}

				this.bm_fld.ae(var1, var2, var3, var4, this.bt_fld, this.bi_fld, this.bo_fld, 1564527261);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V"
	)
	void ac(int var1, int var2, int var3, int var4, int var5, short var6) {
		byte var7 = 20;
		int var8 = var1 + var3 / 2;
		int var9 = var4 / 2 + var2 - 18 - var7;
		yu.dj(var1, var2, var3, var4, -16777216);
		yu.ed(var8 - 152, var9, 304, 34, -65536);
		yu.dj(var8 - 150, 2 + var9, var5 * 3, 30, -65536);
		this.ad_fld.ap(kh.mq_fld, var8, var7 + var9, -1, -1);
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "()Lgf;"
	)
	public gf wx() {
		return this.ac_fld;
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lwl;S)V"
	)
	public static void lw(wl var0, short var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bo_fld = 702894342;
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void oq(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bx_fld = 1553457962;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fe(int var1) {
		if (var1 >= 1) {
			this.bx_fld = var1;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean br(int var1) {
		return this.bd_fld.av();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Lgf;"
	)
	public gf be(int var1, int var2) {
		Iterator var3 = this.ap_fld.values().iterator();

		while (var3.hasNext()) {
			gf var4 = (gf)(gf)var3.next();
			if (var4.ay(-143778459) == var1) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	public void bs(int var1, int var2, byte var3) {
		if (this.ac_fld != null && this.ac_fld.av(var1, var2, -475100430)) {
			this.be_fld = var1 - this.ac_fld.an(1758679299) * 64;
			this.bs_fld = var2 - this.ac_fld.ai(-1344542974) * 64;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bh(int var1, int var2, int var3) {
		if (null != this.ac_fld) {
			fi(this, var1 - this.ac_fld.an(1322558909) * 64, var2 - this.ac_fld.ai(-1300508363) * 64, true);
			this.be_fld = 881914049;
			this.bs_fld = 71648777;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V"
	)
	public void bk(int var1, int var2, int var3, short var4) {
		if (null == this.ac_fld) {
			if (var4 == 483) {
				;
			}
		} else {
			int[] var5 = this.ac_fld.ae(var1, var2, var3, 2081577648);
			if (null != var5) {
				this.bs(var5[0], var5[1], (byte)-35);
			}
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ez(int var1, int var2, int var3, int var4) {
		if (this.ac_fld == null) {
			if (var4 != 2044118889) {
				;
			}
		} else {
			int[] var5 = this.ac_fld.ae(var1, var2, var3, 2081577648);
			if (null != var5) {
				this.bh(var5[0], var5[1], 2114817074);
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int by(int var1) {
		return this.ac_fld == null ? -1 : this.br_fld + this.ac_fld.ai(-1803354013) * 64;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bx(int var1) {
		return this.bj_fld;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ce() {
		ga.ae_fld.ah(5);
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	boolean ew(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ce_fld == null) {
			return true;
		} else if (this.ce_fld.aw_fld == var1 && this.ce_fld.ay_fld == var2) {
			if (this.bm_fld.av_fld * 101076074 != this.cn_fld) {
				return true;
			} else if (client.gr_fld != this.cg_fld) {
				return true;
			} else {
				return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bw(int var1) {
		this.bt_fld = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lgf;B)V"
	)
	void ai(gf var1, byte var2) {
		try {
			this.ac_fld = var1;
			this.bm_fld = new gd(this.ab_fld, this.ao_fld, this.aq_fld, this.am_fld);
			wt.xx(this.bd_fld, this.ac_fld, 16711935);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean gs() {
		return !this.cy_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V"
	)
	void ap(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
		if (fs.gh_fld != null) {
			if (var7 <= 12) {
				return;
			}

			int var8 = 512 / (this.bm_fld.av_fld * 507168442);
			int var9 = 512 + var3;
			int var10 = var4 + 512;
			float var11 = 1.0F;
			var9 = (int)(var9 / var11);
			var10 = (int)(var10 / var11);
			int var12 = et(this, (byte)61) - var5 / 2 - var8;
			int var13 = this.by(1924726092) - var6 / 2 - var8;
			int var14 = var1 - (var12 + var8 - this.cr_fld) * 253584221 * this.bm_fld.av_fld;
			int var15 = var2 - (var8 - (var13 - this.ca_fld)) * 253584221 * this.bm_fld.av_fld;
			if (this.ab(var9, var10, var14, var15, var3, var4, 618868950)) {
				label52: {
					if (this.ce_fld != null) {
						if (var7 <= 12) {
							return;
						}

						if (this.ce_fld.aw_fld == var9) {
							if (var7 <= 12) {
								return;
							}

							if (var10 == this.ce_fld.ay_fld) {
								Arrays.fill(this.ce_fld.ah_fld, 0);
								break label52;
							}
						}
					}

					this.ce_fld = new yv(var9, var10);
				}

				this.cr_fld = et(this, (byte)91) - var5 / 2 - var8;
				this.ca_fld = this.by(-1841421659) - var6 / 2 - var8;
				this.cn_fld = this.bm_fld.av_fld * -1217438565;
				fs.gh_fld.ae(this.cr_fld, this.ca_fld, this.ce_fld, this.cn_fld / var11);
				this.cg_fld = client.gr_fld;
				var14 = var1 - (var8 + var12 - this.cr_fld) * 253584221 * this.bm_fld.av_fld;
				var15 = var2 - 253584221 * this.bm_fld.av_fld * (var8 - (var13 - this.ca_fld));
			}

			yu.dp(var1, var2, var3, var4, 0, 128);
			if (var11 == 1.0F) {
				this.ce_fld.bm(var14, var15, 192);
			} else {
				this.ce_fld.bd(var14, var15, (int)(var11 * var9), (int)(var10 * var11), 192);
			}
		}
	}

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V"
	)
	public static void wa(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bt_fld = new HashSet();
		var0.bt_fld.add(var1);
		var0.bv_fld = 0;
		var0.bi_fld = 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IILkj;Lkj;I)V"
	)
	public static void bo(wl var0, int var1, int var2, kj var3, kj var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			hv var6 = new hv(var2, var3, var4);
			Object[] var7 = (Object[])(new Object[]{var6});
			yz var8 = null;
			switch (var1) {
				case 1008:
					var8 = yb.vn(gh.ag(10, (byte)24).av((Object[])var7, 1878954797), -1517407195);
					break;
				case 1009:
					var8 = yb.vn(gh.ag(11, (byte)-59).av((Object[])var7, 1961502350), 402477561);
					break;
				case 1010:
					var8 = yb.vn(gh.ag(12, (byte)-5).av((Object[])var7, 1746122418), -1845944097);
					break;
				case 1011:
					var8 = yb.vn(gh.ag(13, (byte)32).av((Object[])var7, 1019199210), -1659717811);
					break;
				case 1012:
					var8 = yb.vn(gh.ag(14, (byte)16).av((Object[])var7, 1244973887), -280547777);
			}

			if (var8 != null) {
				va.ak(var8);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ev() {
		try {
			if (aac.ak_fld < 1606458038) {
				this.bd_fld.az();
			} else {
				this.bd_fld.ag();
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void cq(int var1) {
		this.cv_fld.clear();
		this.cv_fld.addAll(this.cd_fld);
		this.cv_fld.addAll(this.cq_fld);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	public void cv(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			if (this.bd_fld.av()) {
				int var8 = (int)Math.ceil(var3 / this.bh_fld);
				int var9 = (int)Math.ceil(var4 / this.bh_fld);
				List var10 = this.bm_fld
					.ah(
						this.bz_fld - var8 / 2 - 1,
						this.br_fld - var9 / 2 - 1,
						var8 / 2 + this.bz_fld + 1,
						1 + var9 / 2 + this.br_fld,
						var1,
						var2,
						var3,
						var4,
						var5,
						var6,
						207491391
					);
				if (var10.isEmpty()) {
					if (var7 > 694320263) {
						;
					}
				} else {
					Iterator var11 = var10.iterator();

					while (var11.hasNext()) {
						if (var7 <= 694320263) {
							return;
						}

						hr var12 = (hr)(hr)var11.next();
						pc var13 = uh.ak(var12.ag(-529582523));
						boolean var14 = false;

						for (int var15 = this.ax_fld.length - 1; var15 >= 0; var15--) {
							if (var13.ax_fld[var15] != null) {
								if (var7 <= 694320263) {
									return;
								}

								je.fe(var13.ax_fld[var15], var13.an_fld, this.ax_fld[var15], var12.ag(1918786309), var12.ay_fld.af(), var12.aw_fld.af());
								var14 = true;
							}
						}

						if (var14) {
							return;
						}
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(S)Lhr;"
	)
	public hr cx(short var1) {
		if (!this.bd_fld.av()) {
			return null;
		} else if (!this.bm_fld.ay(513428804)) {
			return null;
		} else {
			HashMap var2 = this.bm_fld.ar(1172807247);
			this.cx_fld = new LinkedList();
			Iterator var3 = var2.values().iterator();

			while (var3.hasNext()) {
				List var4 = (List)(List)var3.next();
				this.cx_fld.addAll(var4);
			}

			this.cs_fld = this.cx_fld.iterator();
			return this.cs((byte)-116);
		}
	}

	public wl() {
		this.aa_fld = new HashSet();
		this.be_fld = 881914049;
		this.bs_fld = 71648777;
		this.bj_fld = 2099249963;
		this.bf_fld = -1631920613;
		this.by_fld = -1545167529;
		this.bl_fld = 1412529775;
		this.bx_fld = -640081973;
		this.bo_fld = 702894342;
		this.bp_fld = false;
		this.bt_fld = null;
		this.bv_fld = 593545683;
		this.bi_fld = 1073330557;
		this.bu_fld = -1084805671;
		this.bn_fld = 1554092741;
		this.bc_fld = 1355890575;
		this.bw_fld = -797236063;
		this.bb_fld = true;
		this.cd_fld = new HashSet();
		this.cc_fld = new HashSet();
		this.cq_fld = new HashSet();
		this.cv_fld = new HashSet();
		this.cy_fld = false;
		this.cf_fld = 0;
		this.cp_fld = null;
		this.cr_fld = -1066182787;
		this.ca_fld = 1217695171;
		this.cg_fld = -1710376105;
	}

	@ObfuscatedName("getWorldMapPosition")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Export("getWorldMapPosition")
	@Override
	public Point getWorldMapPosition() {
		gd var1 = this.getWorldMapRenderer();
		int var2 = this.st() + var1.ni();
		int var3 = this.zb() + var1.xy();
		return new Point(var2, var3);
	}

	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V"
	)
	public static void ty(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bx_fld = -640081973;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIZ)V"
	)
	public void bu(int var1, int var2, boolean var3) {
		fi(this, var1, var2, var3);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IZB)V"
	)
	public void bq(int var1, boolean var2, byte var3) {
		if (!var2) {
			this.cc_fld.add(var1);
		} else {
			this.cc_fld.remove(var1);
		}

		for (int var4 = 0; var4 < pc.ag_fld; var4++) {
			if (uh.ak(var4) == null) {
				if (var3 >= 1) {
					return;
				}
			} else if (uh.ak(var4).ac_fld * -1108351195 == var1) {
				int var5 = uh.ak(var4).ah_fld * -2065753697;
				if (!var2) {
					this.cq_fld.add(var5);
				} else {
					this.cq_fld.remove(var5);
				}
			}
		}

		this.cq(1148861988);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IIZIIII)V"
	)
	public void cn(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		try {
			if (this.bd_fld.av()) {
				this.ah((byte)1);
				this.aw(711096867);
				if (var3) {
					int var8 = (int)Math.ceil(var6 / this.bh_fld);
					int var9 = (int)Math.ceil(var7 / this.bh_fld);
					List var10 = this.bm_fld
						.ah(
							this.bz_fld - var8 / 2 - 1,
							this.br_fld - var9 / 2 - 1,
							this.bz_fld + var8 / 2 + 1,
							1 + var9 / 2 + this.br_fld,
							var4,
							var5,
							var6,
							var7,
							var1,
							var2,
							207491391
						);
					HashSet var11 = new HashSet();
					Iterator var12 = var10.iterator();

					while (var12.hasNext()) {
						hr var13 = (hr)(hr)var12.next();
						var11.add(var13);
						hv var14 = new hv(var13.ag(1229168353), var13.ay_fld, var13.aw_fld);
						Object[] var15 = (Object[])(new Object[]{var14, var1, var2});
						yz var16;
						if (this.aa_fld.contains(var13)) {
							var16 = yb.vn(gh.ag(17, (byte)-8).av((Object[])var15, 2133102910), -477825464);
						} else {
							var16 = yb.vn(gh.ag(15, (byte)-33).av((Object[])var15, 1462402284), 1158007399);
						}

						va.ak(var16);
					}

					var12 = this.aa_fld.iterator();

					while (var12.hasNext()) {
						hr var20 = (hr)(hr)var12.next();
						if (!var11.contains(var20)) {
							hv var21 = new hv(var20.ag(1288131354), var20.ay_fld, var20.aw_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = yb.vn(gh.ag(16, (byte)63).av((Object[])var22, 1322191719), -820774616);
							va.ak(var23);
						}
					}

					this.aa_fld = var11;
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Lwl;II)Z"
	)
	public static boolean cm(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return !var0.cc_fld.contains(var1);
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IB)V"
	)
	public static void ml(wl var0, int var1, byte var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				gf var3 = var0.be(var1, -220228277);
				if (null != var3) {
					var0.aa(var3, 1809280130);
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fc() {
		return this.bf_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ao(byte var1) {
		ga.ae_fld.aw();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IIZZ)V"
	)
	public void cw(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label42: {
			var5 = lz.ak();
			lg(this, var1, var2, var4, var5);
			if (!fv(this, -308740956) && (var4 || var3)) {
				boolean var7 = cf.cg_fld.bz();
				if (!var7) {
					if (var4) {
						this.bc_fld = var1 * -747114684;
						this.bw_fld = var2 * -359241425;
						this.bu_fld = 1733548895 * this.bz_fld;
						this.bn_fld = -1077812825 * this.br_fld;
					}

					if (this.bu_fld != -1) {
						int var8 = var1 - this.bc_fld;
						int var9 = var2 - this.bw_fld;
						fi(this, this.bu_fld - (int)(var8 / this.bk_fld), this.bn_fld + (int)(var9 / this.bk_fld), false);
					}
					break label42;
				}
			}

			this.as(-462421457);
		}

		if (var4) {
			this.ba_fld = var5;
			this.bq_fld = var1 * 1613419007;
			this.bg_fld = -950631131 * var2;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZZ)V"
	)
	public static void hr(wl var0, int var1, int var2, boolean var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				long var5;
				label46: {
					var5 = lz.ak();
					lg(var0, var1, var2, var4, var5);
					if (!fv(var0, 1997304102) && (var4 || var3)) {
						boolean var7 = cf.cg_fld.bz();
						if (!var7) {
							if (var4) {
								var0.bc_fld = var1;
								var0.bw_fld = var2;
								var0.bu_fld = 1733548895 * var0.bz_fld;
								var0.bn_fld = -2129206353 * var0.br_fld;
							}

							if (var0.bu_fld != -1) {
								int var8 = var1 - var0.bc_fld;
								int var9 = var2 - var0.bw_fld;
								fi(var0, var0.bu_fld - (int)(var8 / var0.bk_fld), var0.bn_fld + (int)(var9 / var0.bk_fld), false);
							}
							break label46;
						}
					}

					var0.as(750637737);
				}

				if (var4) {
					var0.ba_fld = var5;
					var0.bq_fld = var1;
					var0.bg_fld = var2;
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("getWorldMapZoom")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Export("getWorldMapZoom")
	@Override
	public float getWorldMapZoom() {
		return this.bh_fld;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	public void df(int var1, int var2, int var3, int var4, int var5, double var6) {
		try {
			int[] var8 = new int[4];
			yu.dy(var8);
			yu.dg(var1, var2, var1 + var3, var4 + var2);
			int var9 = this.bd_fld.ae();
			if (var9 < 100) {
				this.ac(var1, var2, var3, var4, var9, (short)-498);
			} else {
				if (!this.bm_fld.ay(848763501)) {
					this.bm_fld.ak(this.ai_fld, this.ac_fld, client.ct_fld, 1572421170);
					if (!this.bm_fld.ay(1357484729)) {
						return;
					}
				}

				int var11 = gd.tt(this.bm_fld, (byte)1);
				double var12 = (var11 >> 16 & 0xFF) / 256.0;
				double var14 = (var11 >> 8 & 0xFF) / 256.0;
				double var16 = (var11 & 0xFF) / 256.0;
				var12 = Math.pow(var12, var6);
				var14 = Math.pow(var14, var6);
				var16 = Math.pow(var16, var6);
				int var18 = (int)(256.0 * var12);
				int var19 = (int)(256.0 * var14);
				int var20 = (int)(256.0 * var16);
				int var10 = var20 + (var19 << 8) + -16777216 + (var18 << 16);
				yu.dj(var1, var2, var3, var4, var10);
				if (this.bt_fld != null) {
					this.bi_fld++;
					if (0 == this.bi_fld % this.bo_fld) {
						this.bi_fld = 0;
						this.bv_fld++;
					}

					if (this.bv_fld >= this.bx_fld && !this.bp_fld) {
						this.bt_fld = null;
					}
				}

				int var13 = (int)Math.ceil(var3 / this.bh_fld);
				int var25 = (int)Math.ceil(var4 / this.bh_fld);
				double var15 = fc.ah();
				this.bm_fld
					.az(this.bz_fld - var13 / 2, this.br_fld - var25 / 2, this.bz_fld + var13 / 2, this.br_fld + var25 / 2, var1, var2, var1 + var3, var4 + var2, -467129971);
				if (!this.cy_fld) {
					boolean var17 = false;
					if (var5 - this.cf_fld > 100) {
						this.cf_fld = var5;
						var17 = true;
					}

					this.bm_fld
						.av(
							this.bz_fld - var13 / 2,
							this.br_fld - var25 / 2,
							var13 / 2 + this.bz_fld,
							var25 / 2 + this.br_fld,
							var1,
							var2,
							var1 + var3,
							var2 + var4,
							this.cv_fld,
							this.bt_fld,
							this.bi_fld,
							this.bo_fld,
							var17,
							568447311
						);
				}

				this.ap(var1, var2, var3, var4, var13, var25, (byte)59);
				boolean var27 = client.jl_fld >= 2;
				if (var27 && this.an_fld && this.cp_fld != null) {
					zv.uz(this.ad_fld, "Coord: " + this.cp_fld, 10 + yu.aq_fld, 20 + yu.aa_fld, 16776960, -1);
				}

				this.bj_fld = var13;
				this.bf_fld = var25;
				this.by_fld = var1;
				this.bl_fld = var2;
				yu.di(var8);
				if (var15 != fc.ah()) {
					fc.az(var15);
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)Z"
	)
	public static boolean fv(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.be_fld != -1 && var0.bs_fld != -1;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IIZJ)V"
	)
	void cb(int var1, int var2, boolean var3, long var4) {
		if (null != this.ac_fld) {
			int var6 = (int)(this.bz_fld * -1105842517 + (var1 - this.by_fld - this.bx(-631063347) * this.bh_fld / 2.0F) / this.bh_fld);
			int var7 = (int)(-793765464 * this.br_fld - (var2 - this.bl_fld - am(this, (byte)-24) * this.bh_fld / 2.0F) / this.bh_fld);
			this.cp_fld = this.ac_fld.ah(var6 + this.ac_fld.an(1084819534) * -204801371, var7 + this.ac_fld.ai(-1415878498) * 64, (byte)56);
			if (null != this.cp_fld && var3) {
				fi var8 = iq.ay();
				boolean var9 = client.jl_fld >= 2;
				if (var9 && var8.as(-1180224582) && var8.as(2086322015)) {
					bu.he(681751388 * this.cp_fld.ak_fld, this.cp_fld.ag_fld * -1408554859, this.cp_fld.az_fld * -175166672, false);
				} else {
					boolean var10 = true;
					if (this.bb_fld) {
						int var11 = var1 - this.bq_fld;
						int var12 = var2 - this.bg_fld;
						if (var4 - this.ba_fld > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						jm var13 = gi.ak(jb.dz_fld, client.appletStub.av_fld);
						var13.ay_fld.et(this.cp_fld.af());
						client.appletStub.az(var13);
						this.ba_fld = 0L;
					}
				}
			}
		} else {
			this.cp_fld = null;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void co() {
		if (null != fs.gh_fld) {
			this.bh_fld = this.bk_fld;
		} else {
			if (this.bh_fld < this.bk_fld) {
				this.bh_fld = Math.min(this.bk_fld, this.bh_fld / 30.0F + this.bh_fld);
			}

			if (this.bh_fld > this.bk_fld) {
				this.bh_fld = Math.max(this.bk_fld, this.bh_fld - this.bh_fld / 30.0F);
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IZ)V"
	)
	public static void ii(wl var0, int var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var2) {
			var0.cc_fld.add(var1);
		} else {
			var0.cc_fld.remove(var1);
		}

		for (int var3 = 0; var3 < pc.ag_fld; var3++) {
			if (uh.ak(var3) != null && uh.ak(var3).ac_fld * -1108351195 == var1) {
				int var4 = uh.ak(var3).ah_fld * -2065753697;
				if (!var2) {
					var0.cq_fld.add(var4);
				} else {
					var0.cq_fld.remove(var4);
				}
			}
		}

		var0.cq(1148861988);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cu() {
		if (null != fs.gh_fld) {
			this.bh_fld = this.bk_fld;
		} else {
			if (this.bh_fld < this.bk_fld) {
				this.bh_fld = Math.min(this.bk_fld, this.bh_fld / 30.0F + this.bh_fld);
			}

			if (this.bh_fld > this.bk_fld) {
				this.bh_fld = Math.max(this.bk_fld, this.bh_fld - this.bh_fld / 30.0F);
			}
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fp(int var1, int var2, int var3) {
		if (this.ac_fld != null) {
			int[] var4 = this.ac_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				this.bh(var4[0], var4[1], 2097844194);
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bz(int var1) {
		try {
			if (aac.ak_fld < 238) {
				this.bd_fld.az();
			} else {
				this.bd_fld.ag();
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("yc")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIIII)V"
	)
	public static void yc(wl var0, int var1, int var2, int var3, int var4, int var5, int var6) throws EOFException {
		try {
			if (var0.bd_fld.av()) {
				int var7 = (int)Math.ceil(var3 / var0.bh_fld);
				int var8 = (int)Math.ceil(var4 / var0.bh_fld);
				List var9 = var0.bm_fld
					.ah(
						var0.bz_fld - var7 / 2 - 1,
						var0.br_fld - var8 / 2 - 1,
						var7 / 2 + var0.bz_fld + 1,
						1 + var8 / 2 + var0.br_fld,
						var1,
						var2,
						var3,
						var4,
						var5,
						var6,
						207491391
					);
				if (!var9.isEmpty()) {
					Iterator var10 = var9.iterator();

					while (var10.hasNext()) {
						hr var11 = (hr)(hr)var10.next();
						pc var12 = uh.ak(var11.ag(-155645777));
						boolean var13 = false;

						for (int var14 = var0.ax_fld.length - 1; var14 >= 0; var14--) {
							if (var12.ax_fld[var14] != null) {
								je.fe(var12.ax_fld[var14], var12.an_fld, var0.ax_fld[var14], var11.ag(1265630835), var11.ay_fld.af(), var11.aw_fld.af());
								var13 = true;
							}
						}

						if (var13) {
							return;
						}
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(III)Lgf;"
	)
	public gf dv(int var1, int var2, int var3) {
		Iterator var4 = this.ap_fld.values().iterator();

		while (var4.hasNext()) {
			gf var5 = (gf)(gf)var4.next();
			if (gf.fv(var5, var1, var2, var3, (byte)113)) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(III)Lgf;"
	)
	public gf dz(int var1, int var2, int var3) {
		Iterator var4 = this.ap_fld.values().iterator();

		while (var4.hasNext()) {
			gf var5 = (gf)(gf)var4.next();
			if (gf.fv(var5, var1, var2, var3, (byte)27)) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gu(boolean var1) {
		this.cy_fld = !var1;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IILkj;Lkj;)V"
	)
	public static void ht(wl var0, int var1, int var2, kj var3, kj var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			hv var5 = new hv(var2, var3, var4);
			Object[] var6 = (Object[])(new Object[]{var5});
			yz var7 = null;
			switch (var1) {
				case 1008:
					var7 = yb.vn(gh.ag(10, (byte)61).av((Object[])var6, 1219540712), 1607118080);
					break;
				case 1009:
					var7 = yb.vn(gh.ag(11, (byte)18).av((Object[])var6, 2131959209), -906853434);
					break;
				case 1010:
					var7 = yb.vn(gh.ag(12, (byte)-1).av((Object[])var6, 1843652488), 1652548507);
					break;
				case 1011:
					var7 = yb.vn(gh.ag(13, (byte)81).av((Object[])var6, 2043588295), 794362364);
					break;
				case 1012:
					var7 = yb.vn(gh.ag(14, (byte)-8).av((Object[])var6, 1107052411), -960557317);
			}

			if (var7 != null) {
				va.ak(var7);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	boolean ex(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ce_fld == null) {
			return true;
		} else if (this.ce_fld.aw_fld == var1 && this.ce_fld.ay_fld == var2) {
			if (this.bm_fld.av_fld * 253584221 != this.cn_fld) {
				return true;
			} else if (client.gr_fld != this.cg_fld) {
				return true;
			} else {
				return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;ILkj;)Lkj;"
	)
	public static kj dq(wl var0, int var1, kj var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.bd_fld.av()) {
			return null;
		} else if (!var0.bm_fld.ay(1258336673)) {
			return null;
		} else if (!var0.ac_fld.av(var2.ak_fld, var2.ag_fld, -344653794)) {
			return null;
		} else {
			HashMap var3 = var0.bm_fld.ar(-132611431);
			List var4 = (List)(List)var3.get(var1);
			if (var4 != null && !var4.isEmpty()) {
				hr var5 = null;
				int var6 = -1;
				Iterator var7 = var4.iterator();

				while (var7.hasNext()) {
					hr var8 = (hr)(hr)var7.next();
					int var9 = var8.aw_fld.ak_fld * -621797759 - var2.ak_fld;
					int var10 = var8.aw_fld.ag_fld * 1479124089 - var2.ag_fld;
					int var11 = var9 * var9 + var10 * var10;
					if (0 == var11) {
						return var8.aw_fld;
					}

					if (var11 < var6 || null == var5) {
						var5 = var8;
						var6 = var11;
					}
				}

				return var5.aw_fld;
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void do_(int var1) {
		try {
			gf var2 = this.be(var1, 1361773441);
			if (null != var2) {
				this.aa(var2, 2012382002);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dd(int var1) {
		try {
			gf var2 = this.be(var1, 1987211982);
			if (null != var2) {
				this.aa(var2, 1802258372);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dl(int var1) {
		try {
			gf var2 = this.be(var1, 1091617085);
			if (null != var2) {
				this.aa(var2, 1790376191);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZIIIII)V"
	)
	public static void dm(wl var0, int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else if (!var0.bd_fld.av()) {
				if (var8 < -284686385) {
					;
				}
			} else {
				var0.ah((byte)1);
				var0.aw(2012964961);
				if (var3) {
					int var9 = (int)Math.ceil(var6 / var0.bh_fld);
					int var10 = (int)Math.ceil(var7 / var0.bh_fld);
					List var11 = var0.bm_fld
						.ah(
							var0.bz_fld - var9 / 2 - 1,
							var0.br_fld - var10 / 2 - 1,
							var0.bz_fld + var9 / 2 + 1,
							1 + var10 / 2 + var0.br_fld,
							var4,
							var5,
							var6,
							var7,
							var1,
							var2,
							207491391
						);
					HashSet var12 = new HashSet();
					Iterator var13 = var11.iterator();

					while (var13.hasNext()) {
						hr var14 = (hr)(hr)var13.next();
						var12.add(var14);
						hv var15 = new hv(var14.ag(1458166108), var14.ay_fld, var14.aw_fld);
						Object[] var16 = (Object[])(new Object[]{var15, var1, var2});
						yz var17;
						if (var0.aa_fld.contains(var14)) {
							var17 = yb.vn(gh.ag(17, (byte)-38).av((Object[])var16, 1888858062), -509168371);
						} else {
							var17 = yb.vn(gh.ag(15, (byte)-53).av((Object[])var16, 1079969367), -198458591);
						}

						va.ak(var17);
					}

					var13 = var0.aa_fld.iterator();

					while (var13.hasNext()) {
						hr var20 = (hr)(hr)var13.next();
						if (!var12.contains(var20)) {
							hv var21 = new hv(var20.ag(-1077881246), var20.ay_fld, var20.aw_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = yb.vn(gh.ag(16, (byte)55).av((Object[])var22, 1115922350), 431326802);
							va.ak(var23);
						}
					}

					var0.aa_fld = var12;
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fv() {
		return this.ac_fld == null ? -1 : this.br_fld + this.ac_fld.ai(-886315980) * 64;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "()Lgf;"
	)
	public gf dx() {
		return this.ac_fld;
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lwl;Lub;Lub;Lub;Lzf;Ljava/util/HashMap;[Lyc;)V"
	)
	public static void ly(wl var0, ub var1, ub var2, ub var3, zf var4, HashMap var5, yc[] var6) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.ab_fld = var6;
			var0.ai_fld = var1;
			var0.aq_fld = var2;
			var0.am_fld = var3;
			var0.ad_fld = var4;
			var0.ao_fld = new HashMap();
			var0.ao_fld.put(hb.ak_fld, var5.get(aw_fld));
			var0.ao_fld.put(hb.ag_fld, var5.get(ay_fld));
			var0.ao_fld.put(hb.az_fld, var5.get(as_fld));
			var0.bd_fld = new wt(var1);
			int var7 = aac.ak_fld > -1892240073 ? -808737389 * hc.ak_fld.aw_fld : var0.ai_fld.cm(hc.ak_fld.ah_fld, (byte)1);
			int[] var8 = var0.ai_fld.cp(var7, (byte)20);
			int var9 = var8 == null ? 0 : var8.length;
			var0.ap_fld = new HashMap(var9);

			for (int var10 = 0; var10 < var9; var10++) {
				xi var11 = new xi(var0.ai_fld.bb(var7, var8[var10], 584982574));
				gf var12 = new gf();
				var12.ak(var11, var8[var10], (byte)49);
				var0.ap_fld.put(var12.ar(21528822), var12);
				if (gf.tz(var12, -1707429177)) {
					var0.at_fld = var12;
				}
			}

			var0.aa(var0.at_fld, 2038231854);
			var0.aj_fld = null;
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	void du(gf var1) {
		try {
			if (null == this.ac_fld || this.ac_fld != var1) {
				this.ai(var1, (byte)1);
				ys(this, -1, -1, -1);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lkj;Lkj;Z)V"
	)
	public void db(gf var1, kj var2, kj var3, boolean var4) {
		try {
			if (null != var1) {
				if (this.ac_fld == null || var1 != this.ac_fld) {
					this.ai(var1, (byte)1);
				}

				if (!var4 && gf.fv(this.ac_fld, var2.az_fld, var2.ak_fld * 333235033, -1798046778 * var2.ag_fld, (byte)92)) {
					ys(this, var2.az_fld, -821599670 * var2.ak_fld, -461748712 * var2.ag_fld);
				} else {
					ys(this, var3.az_fld, var3.ak_fld, var3.ag_fld);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;III)V"
	)
	public static void jq(wl var0, int var1, int var2, int var3) {
		if (null != var0.ac_fld) {
			int[] var4 = var0.ac_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				var0.bs(var4[0], var4[1], (byte)-66);
			}
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lkj;Lkj;Z)V"
	)
	public void dg(gf var1, kj var2, kj var3, boolean var4) {
		try {
			if (null != var1) {
				if (this.ac_fld == null || var1 != this.ac_fld) {
					this.ai(var1, (byte)1);
				}

				if (!var4 && gf.fv(this.ac_fld, var2.az_fld, var2.ak_fld, var2.ag_fld, (byte)2)) {
					ys(this, var2.az_fld, var2.ak_fld, var2.ag_fld);
				} else {
					ys(this, var3.az_fld, var3.ak_fld, var3.ag_fld);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(III)Lgf;"
	)
	public gf dt(int var1, int var2, int var3) {
		Iterator var4 = this.ap_fld.values().iterator();

		while (var4.hasNext()) {
			gf var5 = (gf)(gf)var4.next();
			if (gf.fv(var5, var1, var2, var3, (byte)47)) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void ec(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (fs.gh_fld != null) {
			int var7 = 512 / (this.bm_fld.av_fld * -1943284007);
			int var8 = 512 + var3;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)(var8 / var10);
			var9 = (int)(var9 / var10);
			int var11 = et(this, (byte)103) - var5 / 2 - var7;
			int var12 = this.by(-1992906065) - var6 / 2 - var7;
			int var13 = var1 - (var11 + var7 - this.cr_fld) * 253584221 * this.bm_fld.av_fld;
			int var14 = var2 - (var7 - (var12 - this.ca_fld)) * 253584221 * this.bm_fld.av_fld;
			if (this.ab(var8, var9, var13, var14, var3, var4, 618868950)) {
				if (this.ce_fld != null && this.ce_fld.aw_fld == var8 && var9 == this.ce_fld.ay_fld) {
					Arrays.fill(this.ce_fld.ah_fld, 0);
				} else {
					this.ce_fld = new yv(var8, var9);
				}

				this.cr_fld = et(this, (byte)44) - var5 / 2 - var7;
				this.ca_fld = (this.by(-999220824) - var6 / 2 - var7) * 1869273271;
				this.cn_fld = this.bm_fld.av_fld * -1217438565;
				fs.gh_fld.ae(this.cr_fld, this.ca_fld, this.ce_fld, this.cn_fld / var10);
				this.cg_fld = client.gr_fld;
				var13 = var1 - (var7 + var11 - this.cr_fld) * 253584221 * this.bm_fld.av_fld;
				var14 = var2 - 1747881890 * this.bm_fld.av_fld * (var7 - (var12 - this.ca_fld));
			}

			yu.dp(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				this.ce_fld.bm(var13, var14, -1081909073);
			} else {
				this.ce_fld.bd(var13, var14, (int)(var10 * var8), (int)(var9 * var10), -1634610201);
			}
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	public void de(int var1, int var2, int var3, int var4, int var5, double var6) {
		try {
			int[] var8 = new int[4];
			yu.dy(var8);
			yu.dg(var1, var2, var1 + var3, var4 + var2);
			int var9 = this.bd_fld.ae();
			if (var9 < 100) {
				this.ac(var1, var2, var3, var4, var9, (short)-1856);
			} else {
				if (!this.bm_fld.ay(27920418)) {
					this.bm_fld.ak(this.ai_fld, this.ac_fld, client.ct_fld, -998877862);
					if (!this.bm_fld.ay(830169769)) {
						return;
					}
				}

				int var11 = gd.tt(this.bm_fld, (byte)1);
				double var12 = (var11 >> 16 & 0xFF) / 256.0;
				double var14 = (var11 >> 8 & 0xFF) / 256.0;
				double var16 = (var11 & 0xFF) / 256.0;
				var12 = Math.pow(var12, var6);
				var14 = Math.pow(var14, var6);
				var16 = Math.pow(var16, var6);
				int var18 = (int)(256.0 * var12);
				int var19 = (int)(256.0 * var14);
				int var20 = (int)(256.0 * var16);
				int var10 = var20 + (var19 << 8) + -16777216 + (var18 << 16);
				yu.dj(var1, var2, var3, var4, var10);
				if (this.bt_fld != null) {
					this.bi_fld++;
					if (0 == this.bi_fld % this.bo_fld) {
						this.bi_fld = 0;
						this.bv_fld++;
					}

					if (this.bv_fld >= this.bx_fld && !this.bp_fld) {
						this.bt_fld = null;
					}
				}

				int var13 = (int)Math.ceil(var3 / this.bh_fld);
				int var25 = (int)Math.ceil(var4 / this.bh_fld);
				double var15 = fc.ah();
				this.bm_fld
					.az(this.bz_fld - var13 / 2, this.br_fld - var25 / 2, this.bz_fld + var13 / 2, this.br_fld + var25 / 2, var1, var2, var1 + var3, var4 + var2, -1090567110);
				if (!this.cy_fld) {
					boolean var17 = false;
					if (var5 - this.cf_fld > 100) {
						this.cf_fld = var5;
						var17 = true;
					}

					this.bm_fld
						.av(
							this.bz_fld - var13 / 2,
							this.br_fld - var25 / 2,
							var13 / 2 + this.bz_fld,
							var25 / 2 + this.br_fld,
							var1,
							var2,
							var1 + var3,
							var2 + var4,
							this.cv_fld,
							this.bt_fld,
							this.bi_fld,
							this.bo_fld,
							var17,
							568447311
						);
				}

				this.ap(var1, var2, var3, var4, var13, var25, (byte)29);
				boolean var27 = client.jl_fld >= 2;
				if (var27 && this.an_fld && this.cp_fld != null) {
					zv.uz(this.ad_fld, "Coord: " + this.cp_fld, 10 + yu.aq_fld, 20 + yu.aa_fld, 16776960, -1);
				}

				this.bj_fld = var13;
				this.bf_fld = var25;
				this.by_fld = var1;
				this.bl_fld = var2;
				yu.di(var8);
				if (var15 != fc.ah()) {
					fc.az(var15);
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IIZ)V"
	)
	final void ch(int var1, int var2, boolean var3) {
		this.bz_fld = -209542790 * var1;
		this.br_fld = var2;
		lz.ak();
		if (var3) {
			this.as(-32046126);
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IB)V"
	)
	public static void jj(wl var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bk_fld = tq(var0, var1);
		}
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "(Lwl;ZI)V"
	)
	public static void yn(wl var0, boolean var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.cy_fld = !var1;
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void es() {
		ga.ae_fld.aw();
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ep() {
		ga.ae_fld.aw();
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void eb() {
		ga.ae_fld.aw();
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	boolean ed(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ce_fld == null) {
			return true;
		} else if (this.ce_fld.aw_fld == var1 && this.ce_fld.ay_fld == var2) {
			if (this.bm_fld.av_fld * 753322080 != this.cn_fld) {
				return true;
			} else if (client.gr_fld != this.cg_fld) {
				return true;
			} else {
				return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	boolean et(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ce_fld == null) {
			return true;
		} else if (this.ce_fld.aw_fld == var1 && this.ce_fld.ay_fld == var2) {
			if (this.bm_fld.av_fld * -914859763 != this.cn_fld) {
				return true;
			} else if (client.gr_fld != this.cg_fld) {
				return true;
			} else {
				return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)Z"
	)
	public static boolean hv(wl var0, int var1) {
		return !var0.cc_fld.contains(var1);
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fu(int var1) {
		this.bt_fld = new HashSet();
		this.bt_fld.add(var1);
		this.bv_fld = 0;
		this.bi_fld = 0;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fl() {
		this.bx_fld = -787164484;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void eo(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (fs.gh_fld != null) {
			int var7 = 512 / (this.bm_fld.av_fld * 507168442);
			int var8 = 512 + var3;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)(var8 / var10);
			var9 = (int)(var9 / var10);
			int var11 = et(this, (byte)60) - var5 / 2 - var7;
			int var12 = this.by(286740366) - var6 / 2 - var7;
			int var13 = var1 - (var11 + var7 - this.cr_fld) * 253584221 * this.bm_fld.av_fld;
			int var14 = var2 - (var7 - (var12 - this.ca_fld)) * 253584221 * this.bm_fld.av_fld;
			if (this.ab(var8, var9, var13, var14, var3, var4, 618868950)) {
				if (this.ce_fld != null && this.ce_fld.aw_fld == var8 && var9 == this.ce_fld.ay_fld) {
					Arrays.fill(this.ce_fld.ah_fld, 0);
				} else {
					this.ce_fld = new yv(var8, var9);
				}

				this.cr_fld = et(this, (byte)120) - var5 / 2 - var7;
				this.ca_fld = this.by(288727173) - var6 / 2 - var7;
				this.cn_fld = this.bm_fld.av_fld * -1217438565;
				fs.gh_fld.ae(this.cr_fld, this.ca_fld, this.ce_fld, this.cn_fld / var10);
				this.cg_fld = client.gr_fld;
				var13 = var1 - (var7 + var11 - this.cr_fld) * 253584221 * this.bm_fld.av_fld;
				var14 = var2 - 253584221 * this.bm_fld.av_fld * (var7 - (var12 - this.ca_fld));
			}

			yu.dp(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				this.ce_fld.bm(var13, var14, 192);
			} else {
				this.ce_fld.bd(var13, var14, (int)(var10 * var8), (int)(var9 * var10), 192);
			}
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lwl;II)V"
	)
	public static void dh(wl var0, int var1, int var2) {
		if (var0.ac_fld != null && var0.ac_fld.av(var1, var2, -926178337)) {
			var0.be_fld = var1 - var0.ac_fld.an(740556954) * 64;
			var0.bs_fld = var2 - var0.ac_fld.ai(-808972350) * 64;
		}
	}

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int yo() {
		return this.bl_fld;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eg() {
		return this.by_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bu(boolean var1, int var2) {
		this.bp_fld = var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bj(int var1, int var2, int var3, int var4) {
		try {
			if (this.bd_fld.av()) {
				if (!this.bm_fld.ay(1605742480)) {
					this.bm_fld.ak(this.ai_fld, this.ac_fld, client.ct_fld, -1784463716);
					if (!this.bm_fld.ay(636485403)) {
						return;
					}
				}

				this.bm_fld.ae(var1, var2, var3, var4, this.bt_fld, this.bi_fld, this.bo_fld, -623403335);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void er(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var1 + var3 / 2;
		int var8 = var4 / 2 + var2 - 18 - var6;
		yu.dj(var1, var2, var3, var4, -16777216);
		yu.ed(var7 - 152, var8, 304, 34, -65536);
		yu.dj(var7 - 150, 2 + var8, var5 * 3, 30, -65536);
		this.ad_fld.ap(kh.mq_fld, var7, var6 + var8, -1, -1);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lwl;II)Z"
	)
	public static boolean kk(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return !var0.cd_fld.contains(var1);
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lwl;III)V"
	)
	public static void uc(wl var0, int var1, int var2, int var3) {
		if (null != var0.ac_fld) {
			int[] var4 = var0.ac_fld.ae(var1, var2, var3, 2081577648);
			if (var4 == null) {
				var4 = var0.ac_fld.ae(var0.ac_fld.ad(1400061680), var0.ac_fld.am(1237652155), var0.ac_fld.ao(533496817), 2081577648);
			}

			fi(var0, var4[0] - var0.ac_fld.an(2091542038) * 64, var4[1] - var0.ac_fld.ai(-1205414664) * 64, true);
			var0.be_fld = -1573314422;
			var0.bs_fld = -401278951;
			var0.bh_fld = tq(var0, var0.ac_fld.ax(981736215));
			var0.bk_fld = var0.bh_fld;
			var0.cx_fld = null;
			var0.cs_fld = null;
			var0.bm_fld.ag(-418448213);
		}
	}

	@ObfuscatedName("setWorldMapPositionTarget")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/coords/WorldPoint;)V"
	)
	@Export("setWorldMapPositionTarget")
	@Override
	public void setWorldMapPositionTarget(WorldPoint var1) {
		this.wc(var1.getX(), var1.getY());
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "(Lwl;Lgf;Lkj;Lkj;Z)V"
	)
	public static void ve(wl var0, gf var1, kj var2, kj var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else if (null != var1) {
				if (var0.ac_fld == null || var1 != var0.ac_fld) {
					var0.ai(var1, (byte)1);
				}

				if (!var4 && gf.fv(var0.ac_fld, 87070199 * var2.az_fld, var2.ak_fld * 1468606211, var2.ag_fld, (byte)85)) {
					ys(var0, -993804665 * var2.az_fld, var2.ak_fld, -1553887216 * var2.ag_fld);
				} else {
					ys(var0, var3.az_fld, 345558917 * var3.ak_fld, var3.ag_fld);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	float en(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (37 == var1) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eq() {
		if (1.0 == this.bk_fld) {
			return 25;
		} else if (1.5 == this.bk_fld) {
			return -383043811;
		} else if (2.0 == this.bk_fld) {
			return -1828560398;
		} else if (this.bk_fld == 3.0) {
			return 1378485690;
		} else {
			return 4.0 == this.bk_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ei() {
		if (1.0 == this.bk_fld) {
			return 25;
		} else if (1.5 == this.bk_fld) {
			return 37;
		} else if (2.0 == this.bk_fld) {
			return 50;
		} else if (this.bk_fld == 3.0) {
			return 75;
		} else {
			return 4.0 == this.bk_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ee() {
		if (1.0 == this.bk_fld) {
			return 25;
		} else if (1.5 == this.bk_fld) {
			return 37;
		} else if (2.0 == this.bk_fld) {
			return 50;
		} else if (this.bk_fld == 3.0) {
			return 75;
		} else {
			return 4.0 == this.bk_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ek(int var1) {
		this.bk_fld = tq(this, var1);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)Lhr;"
	)
	public hr cs(byte var1) {
		if (this.cs_fld == null) {
			return null;
		} else {
			while (this.cs_fld.hasNext()) {
				hr var2 = (hr)(hr)this.cs_fld.next();
				if (var2.ag(581516850) != -1) {
					return var2;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void wc(int var1, int var2) {
		this.bs(var1, var2, (byte)-36);
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void eu(int var1, int var2) {
		if (this.ac_fld != null && this.ac_fld.av(var1, var2, -179357915)) {
			this.be_fld = var1 - this.ac_fld.an(140208519) * 64;
			this.bs_fld = var2 - this.ac_fld.ai(-1895367571) * 64;
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	float eg(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (37 == var1) {
			return 1.5F;
		} else if (var1 == -1820692053) {
			return 2.0F;
		} else if (var1 == 303470706) {
			return 3.0F;
		} else {
			return var1 == -2134318467 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lgf;"
	)
	public gf an(int var1) {
		Iterator var2 = this.ap_fld.values().iterator();

		while (var2.hasNext()) {
			gf var3 = (gf)(gf)var2.next();
			if (var3.ay(-143778459) == var1) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;Lub;Lzf;Ljava/util/HashMap;[Lyc;I)V"
	)
	public void ak(ub var1, ub var2, ub var3, zf var4, HashMap var5, yc[] var6, int var7) {
		try {
			this.ab_fld = var6;
			this.ai_fld = var1;
			this.aq_fld = var2;
			this.am_fld = var3;
			this.ad_fld = var4;
			this.ao_fld = new HashMap();
			this.ao_fld.put(hb.ak_fld, var5.get(aw_fld));
			this.ao_fld.put(hb.ag_fld, var5.get(ay_fld));
			this.ao_fld.put(hb.az_fld, var5.get(as_fld));
			this.bd_fld = new wt(var1);
			int var8 = aac.ak_fld > 237 ? hc.ak_fld.aw_fld : this.ai_fld.cm(hc.ak_fld.ah_fld, (byte)1);
			int[] var9 = this.ai_fld.cp(var8, (byte)61);
			int var10 = var9 == null ? 0 : var9.length;
			this.ap_fld = new HashMap(var10);

			for (int var11 = 0; var11 < var10; var11++) {
				xi var12 = new xi(this.ai_fld.bb(var8, var9[var11], 584982574));
				gf var13 = new gf();
				var13.ak(var12, var9[var11], (byte)65);
				this.ap_fld.put(var13.ar(-1282102330), var13);
				if (gf.tz(var13, -1339751498)) {
					if (var7 != 1382466332) {
						return;
					}

					this.at_fld = var13;
				}
			}

			this.aa(this.at_fld, 1824227527);
			this.aj_fld = null;
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dr(int var1) {
		try {
			gf var2 = this.be(var1, 2105132410);
			if (null != var2) {
				this.aa(var2, 1825932129);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fa(int var1, int var2, int var3) {
		if (null != this.ac_fld) {
			int[] var4 = this.ac_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				this.bs(var4[0], var4[1], (byte)3);
			}
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fo(int var1, int var2, int var3) {
		if (this.ac_fld != null) {
			int[] var4 = this.ac_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				this.bh(var4[0], var4[1], 2114141780);
			}
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZZI)V"
	)
	public static void mi(wl var0, int var1, int var2, boolean var3, boolean var4, int var5) {
		long var6;
		if (var0 == null) {
			var0.getClass();
		}

		label57: {
			var6 = lz.ak();
			lg(var0, var1, var2, var4, var6);
			if (!fv(var0, 1595617296)) {
				if (var5 != -1982911814) {
					return;
				}

				if (var4 || var3) {
					boolean var8 = cf.cg_fld.bz();
					if (!var8) {
						if (var4) {
							var0.bc_fld = var1;
							var0.bw_fld = var2;
							var0.bu_fld = 1733548895 * var0.bz_fld;
							var0.bn_fld = -2129206353 * var0.br_fld;
						}

						if (var0.bu_fld != -1) {
							int var9 = var1 - var0.bc_fld;
							int var10 = var2 - var0.bw_fld;
							fi(var0, var0.bu_fld - (int)(var9 / var0.bk_fld), var0.bn_fld + (int)(var10 / var0.bk_fld), false);
						}
						break label57;
					}
				}
			}

			var0.as(-98179499);
		}

		if (var4) {
			if (var5 != -1982911814) {
				return;
			}

			var0.ba_fld = var6;
			var0.bq_fld = var1;
			var0.bg_fld = var2;
		}
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IZI)V"
	)
	public static void wq(wl var0, int var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (!var2) {
				var0.cd_fld.add(var1);
			} else {
				var0.cd_fld.remove(var1);
			}

			var0.cq(1148861988);
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fx() {
		return this.ac_fld == null ? -1 : this.br_fld + this.ac_fld.ai(-607370313) * 64;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Lwl;B)I"
	)
	public static int et(wl var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return null == var0.ac_fld ? -1 : var0.bz_fld + var0.ac_fld.an(-6511177) * 64;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void di(int var1, int var2, int var3) {
		if (null != this.ac_fld) {
			int[] var4 = this.ac_fld.ae(var1, var2, var3, 2081577648);
			if (var4 == null) {
				var4 = this.ac_fld.ae(this.ac_fld.ad(1610110589), this.ac_fld.am(-1755053692), this.ac_fld.ao(321013551), 2081577648);
			}

			fi(this, var4[0] - this.ac_fld.an(-34376213) * 64, var4[1] - this.ac_fld.ai(-1128299862) * 64, true);
			this.be_fld = 881914049;
			this.bs_fld = 71648777;
			this.bh_fld = tq(this, this.ac_fld.ax(981736215));
			this.bk_fld = this.bh_fld;
			this.cx_fld = null;
			this.cs_fld = null;
			this.bm_fld.ag(-1551528867);
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fj() {
		return this.ac_fld == null ? -1 : this.br_fld + this.ac_fld.ai(-799456322) * 64;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "()Lkj;"
	)
	public kj fb() {
		return this.ac_fld == null ? null : this.ac_fld.ah(et(this, (byte)57), this.by(1721645088), (byte)-107);
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "()Lgd;"
	)
	public gd getWorldMapRenderer() {
		return this.bm_fld;
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "()Lkj;"
	)
	public kj fk() {
		return this.ac_fld == null ? null : this.ac_fld.ah(et(this, (byte)25), this.by(-1498466615), (byte)1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ag(int var1) {
		ga.ae_fld.ah(5);
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fh() {
		return this.bf_fld;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fn(int var1) {
		if (var1 >= 1) {
			this.bo_fld = var1 * 1030955465;
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ft() {
		this.bo_fld = 702894342;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	public void dp(int var1, int var2, int var3, int var4, int var5, double var6) {
		try {
			int[] var8 = new int[4];
			yu.dy(var8);
			yu.dg(var1, var2, var1 + var3, var4 + var2);
			int var9 = this.bd_fld.ae();
			if (var9 < 100) {
				this.ac(var1, var2, var3, var4, var9, (short)1664);
			} else {
				if (!this.bm_fld.ay(1770877191)) {
					this.bm_fld.ak(this.ai_fld, this.ac_fld, client.ct_fld, -148943851);
					if (!this.bm_fld.ay(2124149128)) {
						return;
					}
				}

				int var11 = gd.tt(this.bm_fld, (byte)1);
				double var12 = (var11 >> 16 & 0xFF) / 256.0;
				double var14 = (var11 >> 8 & 0xFF) / 256.0;
				double var16 = (var11 & 0xFF) / 256.0;
				var12 = Math.pow(var12, var6);
				var14 = Math.pow(var14, var6);
				var16 = Math.pow(var16, var6);
				int var18 = (int)(256.0 * var12);
				int var19 = (int)(256.0 * var14);
				int var20 = (int)(256.0 * var16);
				int var10 = var20 + (var19 << 8) + -16777216 + (var18 << 16);
				yu.dj(var1, var2, var3, var4, var10);
				if (this.bt_fld != null) {
					this.bi_fld++;
					if (0 == this.bi_fld % this.bo_fld) {
						this.bi_fld = 0;
						this.bv_fld++;
					}

					if (this.bv_fld >= this.bx_fld && !this.bp_fld) {
						this.bt_fld = null;
					}
				}

				int var13 = (int)Math.ceil(var3 / this.bh_fld);
				int var25 = (int)Math.ceil(var4 / this.bh_fld);
				double var15 = fc.ah();
				this.bm_fld
					.az(this.bz_fld - var13 / 2, this.br_fld - var25 / 2, this.bz_fld + var13 / 2, this.br_fld + var25 / 2, var1, var2, var1 + var3, var4 + var2, 1160236533);
				if (!this.cy_fld) {
					boolean var17 = false;
					if (var5 - this.cf_fld > 100) {
						this.cf_fld = var5;
						var17 = true;
					}

					this.bm_fld
						.av(
							this.bz_fld - var13 / 2,
							this.br_fld - var25 / 2,
							var13 / 2 + this.bz_fld,
							var25 / 2 + this.br_fld,
							var1,
							var2,
							var1 + var3,
							var2 + var4,
							this.cv_fld,
							this.bt_fld,
							this.bi_fld,
							this.bo_fld,
							var17,
							568447311
						);
				}

				this.ap(var1, var2, var3, var4, var13, var25, (byte)119);
				boolean var27 = client.jl_fld >= 2;
				if (var27 && this.an_fld && this.cp_fld != null) {
					zv.uz(this.ad_fld, "Coord: " + this.cp_fld, 10 + yu.aq_fld, 20 + yu.aa_fld, 16776960, -1);
				}

				this.bj_fld = var13;
				this.bf_fld = var25;
				this.by_fld = var1;
				this.bl_fld = var2;
				yu.di(var8);
				if (var15 != fc.ah()) {
					fc.az(var15);
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gp(boolean var1) {
		this.bp_fld = var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bm(int var1) {
		if (1.0 == this.bk_fld) {
			return 25;
		} else if (1.5 == this.bk_fld) {
			return 37;
		} else if (2.0 == this.bk_fld) {
			return 50;
		} else if (this.bk_fld == 3.0) {
			return 75;
		} else {
			return 4.0 == this.bk_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ha() {
		return this.bs_fld;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lwl;III)Lgf;"
	)
	public static gf ci(wl var0, int var1, int var2, int var3) {
		Iterator var4 = var0.ap_fld.values().iterator();

		while (var4.hasNext()) {
			gf var5 = (gf)(gf)var4.next();
			if (gf.fv(var5, var1, var2, var3, (byte)92)) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fi(int var1) {
		this.bt_fld = new HashSet();
		this.bt_fld.add(var1);
		this.bv_fld = 0;
		this.bi_fld = 0;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fz(int var1) {
		this.bt_fld = new HashSet();
		this.bv_fld = 0;
		this.bi_fld = 0;

		for (int var2 = 0; var2 < pc.ag_fld; var2++) {
			if (uh.ak(var2) != null && uh.ak(var2).ac_fld * -1108351195 == var1) {
				this.bt_fld.add(uh.ak(var2).ah_fld * -2065753697);
			}
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ff() {
		this.bt_fld = null;
	}

	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void sz(wl var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (aac.ak_fld < 238) {
				var0.bd_fld.az();
			} else {
				var0.bd_fld.ag();
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gg() {
		this.bt_fld = null;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IIZIIII)V"
	)
	public void cr(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		try {
			if (this.bd_fld.av()) {
				this.ah((byte)1);
				this.aw(494345981);
				if (var3) {
					int var8 = (int)Math.ceil(var6 / this.bh_fld);
					int var9 = (int)Math.ceil(var7 / this.bh_fld);
					List var10 = this.bm_fld
						.ah(
							this.bz_fld - var8 / 2 - 1,
							this.br_fld - var9 / 2 - 1,
							this.bz_fld + var8 / 2 + 1,
							1 + var9 / 2 + this.br_fld,
							var4,
							var5,
							var6,
							var7,
							var1,
							var2,
							207491391
						);
					HashSet var11 = new HashSet();
					Iterator var12 = var10.iterator();

					while (var12.hasNext()) {
						hr var13 = (hr)(hr)var12.next();
						var11.add(var13);
						hv var14 = new hv(var13.ag(1967739517), var13.ay_fld, var13.aw_fld);
						Object[] var15 = (Object[])(new Object[]{var14, var1, var2});
						yz var16;
						if (this.aa_fld.contains(var13)) {
							var16 = yb.vn(gh.ag(17, (byte)-80).av((Object[])var15, 1801128604), 1388205908);
						} else {
							var16 = yb.vn(gh.ag(15, (byte)7).av((Object[])var15, 1391275600), 584826343);
						}

						va.ak(var16);
					}

					var12 = this.aa_fld.iterator();

					while (var12.hasNext()) {
						hr var20 = (hr)(hr)var12.next();
						if (!var11.contains(var20)) {
							hv var21 = new hv(var20.ag(1410668695), var20.ay_fld, var20.aw_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = yb.vn(gh.ag(16, (byte)56).av((Object[])var22, 1465726194), 145067806);
							va.ak(var23);
						}
					}

					this.aa_fld = var11;
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void gn(int var1, boolean var2) {
		if (!var2) {
			this.cd_fld.add(var1);
		} else {
			this.cd_fld.remove(var1);
		}

		this.cq(1148861988);
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tw() {
		return this.be_fld;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fq() {
		this.bo_fld = 702894342;
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void gr(int var1, boolean var2) {
		if (!var2) {
			this.cc_fld.add(var1);
		} else {
			this.cc_fld.remove(var1);
		}

		for (int var3 = 0; var3 < pc.ag_fld; var3++) {
			if (uh.ak(var3) != null && uh.ak(var3).ac_fld * -1108351195 == var1) {
				int var4 = uh.ak(var3).ah_fld * -2065753697;
				if (!var2) {
					this.cq_fld.add(var4);
				} else {
					this.cq_fld.remove(var4);
				}
			}
		}

		this.cq(1148861988);
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void gt(int var1, boolean var2) {
		if (!var2) {
			this.cc_fld.add(var1);
		} else {
			this.cc_fld.remove(var1);
		}

		for (int var3 = 0; var3 < pc.ag_fld; var3++) {
			if (uh.ak(var3) != null && uh.ak(var3).ac_fld * -1108351195 == var1) {
				int var4 = uh.ak(var3).ah_fld * 1193955704;
				if (!var2) {
					this.cq_fld.add(var4);
				} else {
					this.cq_fld.remove(var4);
				}
			}
		}

		this.cq(1148861988);
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V"
	)
	public static void oj(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 1) {
			var0.bx_fld = var1;
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void gh(int var1, boolean var2) {
		if (!var2) {
			this.cd_fld.add(var1);
		} else {
			this.cd_fld.remove(var1);
		}

		this.cq(1148861988);
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("getWorldMapData")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/worldmap/WorldMapData;"
	)
	public WorldMapData getWorldMapData_net_runelite_api_worldmap_WorldMapData() {
		return this.wx();
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gk(boolean var1) {
		this.cy_fld = !var1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IIZ)V"
	)
	final void cl(int var1, int var2, boolean var3) {
		this.bz_fld = -218723745 * var1;
		this.br_fld = var2;
		lz.ak();
		if (var3) {
			this.as(1212777994);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIZ)V"
	)
	public static void al(wl var0, int var1, int var2, int var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			gf var5 = var0.af(var1, var2, var3, 1161105583);
			if (null == var5) {
				if (!var4) {
					return;
				}

				var5 = var0.at_fld;
			}

			boolean var6 = false;
			if (var0.aj_fld != var5 || var4) {
				var0.aj_fld = var5;
				var0.aa(var5, 1960398675);
				var6 = true;
			}

			if (var6 || var4) {
				ys(var0, var1, var2, var3);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIII)V"
	)
	public static void ys(wl var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var0.ac_fld) {
			int[] var5 = var0.ac_fld.ae(var1, var2, var3, 2081577648);
			if (var5 == null) {
				var5 = var0.ac_fld.ae(var0.ac_fld.ad(654694288), var0.ac_fld.am(-52546744), var0.ac_fld.ao(663324911), 2081577648);
			}

			fi(var0, var5[0] - var0.ac_fld.an(529669876) * 64, var5[1] - var0.ac_fld.ai(-1298353472) * 64, true);
			var0.be_fld = 881914049;
			var0.bs_fld = 71648777;
			var0.bh_fld = tq(var0, var0.ac_fld.ax(981736215));
			var0.bk_fld = var0.bh_fld;
			var0.cx_fld = null;
			var0.cs_fld = null;
			var0.bm_fld.ag(-694297034);
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fs(boolean var1) {
		this.cy_fld = !var1;
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lwl;III)V"
	)
	public static void mr(wl var0, int var1, int var2, int var3) {
		if (null != var0.ac_fld) {
			int[] var4 = var0.ac_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				var0.bs(var4[0], var4[1], (byte)-57);
			}
		}
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V"
	)
	public static void pw(wl var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				if (var1 >= 1) {
					var0.bx_fld = var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lwl;B)Lkj;"
	)
	public static kj nk(wl var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ac_fld == null ? null : var0.ac_fld.ah(et(var0, (byte)8), var0.by(-455987332), (byte)34);
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IIZIIII)V"
	)
	public void ca(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		try {
			if (this.bd_fld.av()) {
				this.ah((byte)1);
				this.aw(-1418733464);
				if (var3) {
					int var8 = (int)Math.ceil(var6 / this.bh_fld);
					int var9 = (int)Math.ceil(var7 / this.bh_fld);
					List var10 = this.bm_fld
						.ah(
							this.bz_fld - var8 / 2 - 1,
							this.br_fld - var9 / 2 - 1,
							this.bz_fld + var8 / 2 + 1,
							1 + var9 / 2 + this.br_fld,
							var4,
							var5,
							var6,
							var7,
							var1,
							var2,
							207491391
						);
					HashSet var11 = new HashSet();
					Iterator var12 = var10.iterator();

					while (var12.hasNext()) {
						hr var13 = (hr)(hr)var12.next();
						var11.add(var13);
						hv var14 = new hv(var13.ag(-154161489), var13.ay_fld, var13.aw_fld);
						Object[] var15 = (Object[])(new Object[]{var14, var1, var2});
						yz var16;
						if (this.aa_fld.contains(var13)) {
							var16 = yb.vn(gh.ag(17, (byte)13).av((Object[])var15, 1119667188), -1040484482);
						} else {
							var16 = yb.vn(gh.ag(15, (byte)-71).av((Object[])var15, 1578039193), -471558072);
						}

						va.ak(var16);
					}

					var12 = this.aa_fld.iterator();

					while (var12.hasNext()) {
						hr var20 = (hr)(hr)var12.next();
						if (!var11.contains(var20)) {
							hv var21 = new hv(var20.ag(-1440201344), var20.ay_fld, var20.aw_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = yb.vn(gh.ag(16, (byte)44).av((Object[])var22, 1251734480), -1161763876);
							va.ak(var23);
						}
					}

					this.aa_fld = var11;
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lgf;I)V"
	)
	void aa(gf var1, int var2) {
		try {
			if (null == this.ac_fld || this.ac_fld != var1) {
				this.ai(var1, (byte)1);
				ys(this, -1, -1, -1);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public void gd(int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			if (this.bd_fld.av()) {
				int var7 = (int)Math.ceil(var3 / this.bh_fld);
				int var8 = (int)Math.ceil(var4 / this.bh_fld);
				List var9 = this.bm_fld
					.ah(
						this.bz_fld - var7 / 2 - 1,
						this.br_fld - var8 / 2 - 1,
						var7 / 2 + this.bz_fld + 1,
						1 + var8 / 2 + this.br_fld,
						var1,
						var2,
						var3,
						var4,
						var5,
						var6,
						207491391
					);
				if (!var9.isEmpty()) {
					Iterator var10 = var9.iterator();

					while (var10.hasNext()) {
						hr var11 = (hr)(hr)var10.next();
						pc var12 = uh.ak(var11.ag(-1900046552));
						boolean var13 = false;

						for (int var14 = this.ax_fld.length - 1; var14 >= 0; var14--) {
							if (var12.ax_fld[var14] != null) {
								je.fe(var12.ax_fld[var14], var12.an_fld, this.ax_fld[var14], var11.ag(1779779944), var11.ay_fld.af(), var11.aw_fld.af());
								var13 = true;
							}
						}

						if (var13) {
							return;
						}
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Lwl;II)V"
	)
	public static void eo(wl var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 >= 1) {
				if (var2 >= -1252807831) {
					return;
				}

				var0.bo_fld = var1;
			}
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IIZJ)V"
	)
	void ck(int var1, int var2, boolean var3, long var4) {
		if (null != this.ac_fld) {
			int var6 = (int)(this.bz_fld + (var1 - this.by_fld - this.bx(-1016137156) * this.bh_fld / 2.0F) / this.bh_fld);
			int var7 = (int)(this.br_fld - (var2 - this.bl_fld - am(this, (byte)-39) * this.bh_fld / 2.0F) / this.bh_fld);
			this.cp_fld = this.ac_fld.ah(var6 + this.ac_fld.an(136587880) * 2091942923, var7 + this.ac_fld.ai(-1739343437) * -1072935809, (byte)-33);
			if (null != this.cp_fld && var3) {
				fi var8 = iq.ay();
				boolean var9 = client.jl_fld >= 2;
				if (var9 && var8.as(82) && var8.as(-1355548651)) {
					bu.he(-1994190213 * this.cp_fld.ak_fld, this.cp_fld.ag_fld * 1799103630, this.cp_fld.az_fld * -1438806167, false);
				} else {
					boolean var10 = true;
					if (this.bb_fld) {
						int var11 = var1 - this.bq_fld;
						int var12 = var2 - this.bg_fld;
						if (var4 - this.ba_fld > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						jm var13 = gi.ak(jb.dz_fld, client.appletStub.av_fld);
						var13.ay_fld.et(this.cp_fld.af());
						client.appletStub.az(var13);
						this.ba_fld = 0L;
					}
				}
			}
		} else {
			this.cp_fld = null;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void bd(int var1, byte var2) {
		if (var1 >= 1) {
			this.bx_fld = var1;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void ff(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (fv(var0, 425494224)) {
			int var1 = var0.be_fld - var0.bz_fld;
			int var2 = var0.bs_fld - var0.br_fld;
			if (0 != var1) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			fi(var0, var1 + var0.bz_fld, var2 + var0.br_fld, true);
			if (var0.bz_fld == var0.be_fld && var0.bs_fld == var0.br_fld) {
				var0.be_fld = 881914049;
				var0.bs_fld = 345476497;
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "()Lhr;"
	)
	public hr gx() {
		if (!this.bd_fld.av()) {
			return null;
		} else if (!this.bm_fld.ay(2080999009)) {
			return null;
		} else {
			HashMap var1 = this.bm_fld.ar(-803840207);
			this.cx_fld = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)(List)var2.next();
				this.cx_fld.addAll(var3);
			}

			this.cs_fld = this.cx_fld.iterator();
			return this.cs((byte)-105);
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lwl;II)V"
	)
	public static void ip(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bt_fld = new HashSet();
		var0.bt_fld.add(var1);
		var0.bv_fld = 0;
		var0.bi_fld = 0;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "()Lhr;"
	)
	public hr ge() {
		if (this.cs_fld == null) {
			return null;
		} else {
			while (this.cs_fld.hasNext()) {
				hr var1 = (hr)(hr)this.cs_fld.next();
				if (var1.ag(973633602) != -1) {
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void fi(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (fv(var0, -785978940)) {
			int var1 = var0.be_fld - var0.bz_fld;
			int var2 = var0.bs_fld - var0.br_fld;
			if (0 != var1) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			fi(var0, var1 + var0.bz_fld, var2 + var0.br_fld, true);
			if (var0.bz_fld == var0.be_fld && var0.bs_fld == var0.br_fld) {
				var0.be_fld = 881914049;
				var0.bs_fld = 71648777;
			}
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "()Lhr;"
	)
	public hr gw() {
		if (this.cs_fld == null) {
			return null;
		} else {
			while (this.cs_fld.hasNext()) {
				hr var1 = (hr)(hr)this.cs_fld.next();
				if (var1.ag(-561698242) != -1) {
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)I"
	)
	public static int an(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return null == var0.ac_fld ? -1 : var0.ac_fld.ay(-143778459);
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Lwl;ILkj;B)Lkj;"
	)
	public static kj yu(wl var0, int var1, kj var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (!var0.bd_fld.av()) {
			return null;
		} else if (!var0.bm_fld.ay(976423968)) {
			return null;
		} else if (!var0.ac_fld.av(var2.ak_fld, var2.ag_fld, -278064648)) {
			return null;
		} else {
			HashMap var4 = var0.bm_fld.ar(-2007497604);
			List var5 = (List)(List)var4.get(var1);
			if (var5 != null && !var5.isEmpty()) {
				hr var6 = null;
				int var7 = -1;
				Iterator var8 = var5.iterator();

				while (var8.hasNext()) {
					hr var9 = (hr)(hr)var8.next();
					int var10 = var9.aw_fld.ak_fld * -621797759 - var2.ak_fld;
					int var11 = var9.aw_fld.ag_fld * 1479124089 - var2.ag_fld;
					int var12 = var10 * var10 + var11 * var11;
					if (0 == var12) {
						return var9.aw_fld;
					}

					if (var12 < var7 || null == var6) {
						var6 = var9;
						var7 = var12;
					}
				}

				return var6.aw_fld;
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lba;"
	)
	static ba ag(int var0, int var1, int var2) throws EOFException {
		try {
			int var4 = ik.ak(var1, var0);
			ba var5 = wj.az(var4, var0);
			if (null != var5) {
				return var5;
			} else {
				var4 = dh.ag(var2, var0);
				var5 = wj.az(var4, var0);
				if (null != var5) {
					return var5;
				} else {
					var4 = fr.az(var0);
					var5 = wj.az(var4, var0);
					return var5 != null ? var5 : null;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V"
	)
	final void ay(int var1, int var2, boolean var3, int var4) {
		this.be_fld = -1885387207 * var1;
		this.bw_fld = 2009323061 * var2;
		lz.ak();
		if (var3) {
			this.as(-455662490);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V"
	)
	public void az(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
		try {
			if (!this.bd_fld.av()) {
				if (var8 < -284686385) {
					;
				}
			} else {
				this.ah((byte)1);
				this.aw(2012964961);
				if (var3) {
					int var9 = (int)Math.ceil(var6 / this.bh_fld);
					int var10 = (int)Math.ceil(var7 / this.bh_fld);
					List var11 = this.bm_fld
						.ah(
							this.bl_fld - var9 / 2 - 1,
							this.bi_fld - var10 / 2 - 1,
							this.bn_fld + var9 / 2 + 1,
							1 + var10 / 2 + this.cg_fld,
							var4,
							var5,
							var6,
							var7,
							var1,
							var2,
							207491391
						);
					HashSet var12 = new HashSet();
					Iterator var13 = var11.iterator();

					while (var13.hasNext()) {
						hr var14 = (hr)(hr)var13.next();
						var12.add(var14);
						hv var15 = new hv(var14.ag(1458166108), var14.ay_fld, var14.ay_fld);
						Object[] var16 = (Object[])(new Object[]{var15, var1, var2});
						yz var17;
						if (this.cq_fld.contains(var14)) {
							var17 = yb.vn(gh.ag(17, (byte)-38).av((Object[])var16, 1888858062), -509168371);
						} else {
							var17 = yb.vn(gh.ag(15, (byte)-53).av((Object[])var16, 1079969367), -198458591);
						}

						va.ak(var17);
					}

					var13 = this.cq_fld.iterator();

					while (var13.hasNext()) {
						hr var20 = (hr)(hr)var13.next();
						if (!var12.contains(var20)) {
							hv var21 = new hv(var20.ag(-1077881246), var20.aw_fld, var20.ay_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = yb.vn(gh.ag(16, (byte)55).av((Object[])var22, 1115922350), 431326802);
							va.ak(var23);
						}
					}

					this.cq_fld = var12;
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIZJ)V"
	)
	void ae(int var1, int var2, boolean var3, long var4) {
		if (null != this.ac_fld) {
			int var6 = (int)(this.bv_fld * 2027603977 + (var1 - this.bl_fld - this.ax(-1016137156) * this.bk_fld / 2.0F) / this.bk_fld);
			int var7 = (int)(1903512605 * this.cr_fld - (var2 - this.cf_fld - am(this, (byte)-39) * this.bh_fld / 2.0F) / this.bk_fld);
			this.cp_fld = this.at_fld.ah(var6 + this.ac_fld.an(136587880) * 2091942923, var7 + this.at_fld.ax(-1739343437) * -1072935809, (byte)-33);
			if (null != this.cp_fld && var3) {
				fi var8 = iq.ay();
				boolean var9 = client.wt_fld >= 2;
				if (var9 && var8.as(82) && var8.ay(-1355548651)) {
					bu.he(-1994190213 * this.cp_fld.ag_fld, this.cp_fld.ag_fld * 1799103630, this.cp_fld.az_fld * -1438806167, false);
				} else {
					boolean var10 = true;
					if (this.bb_fld) {
						int var11 = var1 - this.br_fld;
						int var12 = var2 - this.bj_fld;
						if (var4 - this.ba_fld > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						jm var13 = gi.ak(jb.cd_fld, client.appletStub.av_fld);
						var13.ay_fld.ce(this.cp_fld.al());
						client.appletStub.az(var13);
						this.ba_fld = 0L;
					}
				}
			}
		} else {
			this.cp_fld = null;
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZJ)V"
	)
	public static void lg(wl var0, int var1, int var2, boolean var3, long var4) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var0.ac_fld) {
			int var6 = (int)(var0.bz_fld + (var1 - var0.by_fld - var0.bx(582850144) * var0.bh_fld / 2.0F) / var0.bh_fld);
			int var7 = (int)(var0.br_fld - (var2 - var0.bl_fld - am(var0, (byte)-65) * var0.bh_fld / 2.0F) / var0.bh_fld);
			var0.cp_fld = var0.ac_fld.ah(var6 + var0.ac_fld.an(1193001203) * 64, var7 + var0.ac_fld.ai(-657231278) * 64, (byte)-1);
			if (null != var0.cp_fld && var3) {
				fi var8 = iq.ay();
				boolean var9 = client.jl_fld >= 2;
				if (var9 && var8.as(82) && var8.as(81)) {
					bu.he(-621797759 * var0.cp_fld.ak_fld, var0.cp_fld.ag_fld * 1479124089, var0.cp_fld.az_fld * 1846813669, false);
				} else {
					boolean var10 = true;
					if (var0.bb_fld) {
						int var11 = var1 - var0.bq_fld;
						int var12 = var2 - var0.bg_fld;
						if (var4 - var0.ba_fld > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						jm var13 = gi.ak(jb.dz_fld, client.appletStub.av_fld);
						var13.ay_fld.et(var0.cp_fld.af());
						client.appletStub.az(var13);
						var0.ba_fld = 0L;
					}
				}
			}
		} else {
			var0.cp_fld = null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V"
	)
	public void av(int var1, int var2, boolean var3, boolean var4, int var5) {
		long var6;
		label54: {
			var6 = lz.ak();
			lg(this, var1, var2, var4, var6);
			if (!fv(this, 1595617296)) {
				if (var5 != -1982911814) {
					return;
				}

				if (var4 || var3) {
					boolean var8 = cf.cg_fld.bz();
					if (!var8) {
						if (var4) {
							this.cg_fld = var1 * -1355890575;
							this.bv_fld = var2 * 797236063;
							this.bw_fld = 1733548895 * this.ca_fld;
							this.cn_fld = -2129206353 * this.bg_fld;
						}

						if (this.cn_fld != -1) {
							int var9 = var1 - this.bc_fld;
							int var10 = var2 - this.bi_fld;
							fi(this, this.bx_fld - (int)(var9 / this.bh_fld), this.bn_fld + (int)(var10 / this.bh_fld), false);
						}
						break label54;
					}
				}
			}

			this.as(-98179499);
		}

		if (var4) {
			if (var5 != -1982911814) {
				return;
			}

			this.ba_fld = var6;
			this.cf_fld = var1 * -1009087195;
			this.cf_fld = 88448125 * var2;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IILkj;Lkj;I)V"
	)
	public void cf(int var1, int var2, kj var3, kj var4, int var5) {
		try {
			hv var6 = new hv(var2, var3, var4);
			Object[] var7 = (Object[])(new Object[]{var6});
			yz var8 = null;
			switch (var1) {
				case 1008:
					var8 = yb.vn(gh.ag(10, (byte)24).av((Object[])var7, 1878954797), -1517407195);
					break;
				case 1009:
					var8 = yb.vn(gh.ag(11, (byte)-59).av((Object[])var7, 1961502350), 402477561);
					break;
				case 1010:
					var8 = yb.vn(gh.ag(12, (byte)-5).av((Object[])var7, 1746122418), -1845944097);
					break;
				case 1011:
					var8 = yb.vn(gh.ag(13, (byte)32).av((Object[])var7, 1019199210), -1659717811);
					break;
				case 1012:
					var8 = yb.vn(gh.ag(14, (byte)16).av((Object[])var7, 1244973887), -280547777);
			}

			if (var8 != null) {
				va.ak(var8);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIIID)V"
	)
	public static void yb(wl var0, int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				int[] var8 = new int[4];
				yu.dy(var8);
				yu.dg(var1, var2, var1 + var3, var4 + var2);
				int var9 = var0.bd_fld.ae();
				if (var9 < 100) {
					var0.ac(var1, var2, var3, var4, var9, (short)-29336);
				} else {
					if (!var0.bm_fld.ay(1113331811)) {
						var0.bm_fld.ak(var0.ai_fld, var0.ac_fld, client.ct_fld, -959885383);
						if (!var0.bm_fld.ay(442995491)) {
							return;
						}
					}

					int var11 = gd.tt(var0.bm_fld, (byte)1);
					double var12 = (var11 >> 16 & 0xFF) / 256.0;
					double var14 = (var11 >> 8 & 0xFF) / 256.0;
					double var16 = (var11 & 0xFF) / 256.0;
					var12 = Math.pow(var12, var6);
					var14 = Math.pow(var14, var6);
					var16 = Math.pow(var16, var6);
					int var18 = (int)(256.0 * var12);
					int var19 = (int)(256.0 * var14);
					int var20 = (int)(256.0 * var16);
					int var10 = var20 + (var19 << 8) + -16777216 + (var18 << 16);
					yu.dj(var1, var2, var3, var4, var10);
					if (var0.bt_fld != null) {
						var0.bi_fld++;
						if (0 == var0.bi_fld % var0.bo_fld) {
							var0.bi_fld = 0;
							var0.bv_fld++;
						}

						if (var0.bv_fld >= var0.bx_fld && !var0.bp_fld) {
							var0.bt_fld = null;
						}
					}

					int var13 = (int)Math.ceil(var3 / var0.bh_fld);
					int var24 = (int)Math.ceil(var4 / var0.bh_fld);
					double var15 = fc.ah();
					var0.bm_fld
						.az(var0.bz_fld - var13 / 2, var0.br_fld - var24 / 2, var0.bz_fld + var13 / 2, var0.br_fld + var24 / 2, var1, var2, var1 + var3, var4 + var2, -192876448);
					if (!var0.cy_fld) {
						boolean var17 = false;
						if (var5 - var0.cf_fld > 100) {
							var0.cf_fld = var5;
							var17 = true;
						}

						var0.bm_fld
							.av(
								var0.bz_fld - var13 / 2,
								var0.br_fld - var24 / 2,
								var13 / 2 + var0.bz_fld,
								var24 / 2 + var0.br_fld,
								var1,
								var2,
								var1 + var3,
								var2 + var4,
								var0.cv_fld,
								var0.bt_fld,
								var0.bi_fld,
								var0.bo_fld,
								var17,
								568447311
							);
					}

					var0.ap(var1, var2, var3, var4, var13, var24, (byte)119);
					boolean var26 = client.jl_fld >= 2;
					if (var26 && var0.an_fld && var0.cp_fld != null) {
						zv.uz(var0.ad_fld, "Coord: " + var0.cp_fld, 10 + yu.aq_fld, 20 + yu.aa_fld, 16776960, -1);
					}

					var0.bj_fld = var13;
					var0.bf_fld = var24;
					var0.by_fld = var1;
					var0.bl_fld = var2;
					yu.di(var8);
					if (var15 != fc.ah()) {
						fc.az(var15);
					}
				}
			}
		} catch (Throwable var21) {
			throw new RuntimeException(var21);
		}
	}

	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "(Lpn;I)I"
	)
	public static int tf(pn var0, int var1) {
		return var0.ay_fld[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ar(int var1) {
		return this.cg_fld != -1 && this.br_fld != -1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void bp(int var1, byte var2) {
		if (var1 >= 1) {
			this.br_fld = -1645016423 * var1;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean cc(int var1, int var2) {
		return !this.cq_fld.contains(var1);
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Lwl;III)V"
	)
	public static void rp(wl var0, int var1, int var2, int var3) {
		if (null != var0.ac_fld) {
			int[] var4 = var0.ac_fld.ae(var1, var2, var3, 2081577648);
			if (var4 == null) {
				var4 = var0.ac_fld.ae(var0.ac_fld.ad(398306917), var0.ac_fld.am(-172777017), var0.ac_fld.ao(-85535541), 2081577648);
			}

			fi(var0, var4[0] - var0.ac_fld.an(1359824258) * -458802951, var4[1] - var0.ac_fld.ai(-1568419070) * 64, true);
			var0.be_fld = -988610727;
			var0.bs_fld = 71648777;
			var0.bh_fld = tq(var0, var0.ac_fld.ax(981736215));
			var0.bk_fld = var0.bh_fld;
			var0.cx_fld = null;
			var0.cs_fld = null;
			var0.bm_fld.ag(346583213);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void am(int var1, int var2, int var3, int var4) {
		if (null != this.ac_fld) {
			int[] var5 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (var5 == null) {
				var5 = this.ac_fld.ae(this.aj_fld.ai(654694288), this.ac_fld.ao(-52546744), this.at_fld.ai(663324911), 2081577648);
			}

			fi(this, var5[0] - this.ac_fld.ai(529669876) * 64, var5[1] - this.ac_fld.ay(-1298353472) * 64, true);
			this.cf_fld = 881914049;
			this.cn_fld = 71648777;
			this.bh_fld = tq(this, this.at_fld.ao(981736215));
			this.bh_fld = this.bh_fld;
			this.cx_fld = null;
			this.cs_fld = null;
			this.bm_fld.ag(-694297034);
		}
	}

	@ObfuscatedName("initializeWorldMap")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/worldmap/WorldMapData;)V"
	)
	@Export("initializeWorldMap")
	@Override
	public void initializeWorldMap(WorldMapData var1) {
		try {
			this.ai((gf)var1, (byte)1);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZZ)V"
	)
	public static void yn(wl var0, int var1, int var2, boolean var3, boolean var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			long var5;
			label43: {
				var5 = lz.ak();
				lg(var0, var1, var2, var4, var5);
				if (!fv(var0, -853332127) && (var4 || var3)) {
					boolean var7 = cf.cg_fld.bz();
					if (!var7) {
						if (var4) {
							var0.bc_fld = var1;
							var0.bw_fld = var2;
							var0.bu_fld = 1733548895 * var0.bz_fld;
							var0.bn_fld = -2129206353 * var0.br_fld;
						}

						if (var0.bu_fld != -1) {
							int var8 = var1 - var0.bc_fld;
							int var9 = var2 - var0.bw_fld;
							fi(var0, var0.bu_fld - (int)(var8 / var0.bk_fld), var0.bn_fld + (int)(var9 / var0.bk_fld), false);
						}
						break label43;
					}
				}

				var0.as(-1493806507);
			}

			if (var4) {
				var0.ba_fld = var5;
				var0.bq_fld = var1;
				var0.bg_fld = var2;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	public void ad(int var1, int var2, int var3, int var4, int var5, double var6) {
		try {
			int[] var8 = new int[4];
			yu.di(var8);
			yu.gs(var1, var2, var1 + var3, var4 + var2);
			int var9 = this.bd_fld.ae();
			if (var9 < 100) {
				this.ac(var1, var2, var3, var4, var9, (short)-1856);
			} else {
				if (!this.bm_fld.ay(27920418)) {
					this.bm_fld.ak(this.ai_fld, this.at_fld, client.hl_fld, -998877862);
					if (!this.bm_fld.ay(830169769)) {
						return;
					}
				}

				int var11 = gd.tt(this.bm_fld, (byte)1);
				double var12 = (var11 >> 16 & 0xFF) / 256.0;
				double var14 = (var11 >> 8 & 0xFF) / 256.0;
				double var16 = (var11 & 0xFF) / 256.0;
				var12 = Math.pow(var12, var6);
				var14 = Math.pow(var14, var6);
				var16 = Math.pow(var16, var6);
				int var18 = (int)(256.0 * var12);
				int var19 = (int)(256.0 * var14);
				int var20 = (int)(256.0 * var16);
				int var10 = var20 + (var19 << 8) + -16777216 + (var18 << 16);
				yu.gn(var1, var2, var3, var4, var10);
				if (this.cq_fld != null) {
					this.ca_fld = this.bz_fld + -1073330557;
					if (0 == this.bo_fld % this.bj_fld) {
						this.cr_fld = 0;
						this.bz_fld = this.bu_fld + -593545683;
					}

					if (this.bc_fld >= this.bv_fld && !this.bb_fld) {
						this.cv_fld = null;
					}
				}

				int var13 = (int)Math.ceil(var3 / this.bh_fld);
				int var25 = (int)Math.ceil(var4 / this.bh_fld);
				double var15 = fc.bx();
				this.bm_fld
					.az(this.by_fld - var13 / 2, this.bi_fld - var25 / 2, this.bn_fld + var13 / 2, this.bl_fld + var25 / 2, var1, var2, var1 + var3, var4 + var2, -1090567110);
				if (!this.bb_fld) {
					boolean var17 = false;
					if (var5 - this.cg_fld > 100) {
						this.bu_fld = 141109177 * var5;
						var17 = true;
					}

					this.bm_fld
						.av(
							this.bz_fld - var13 / 2,
							this.bf_fld - var25 / 2,
							var13 / 2 + this.bn_fld,
							var25 / 2 + this.br_fld,
							var1,
							var2,
							var1 + var3,
							var2 + var4,
							this.aa_fld,
							this.cc_fld,
							this.by_fld * -9652181,
							this.bo_fld,
							var17,
							568447311
						);
				}

				this.ap(var1, var2, var3, var4, var13, var25, (byte)29);
				boolean var27 = client.zj_fld >= 2;
				if (var27 && this.an_fld && this.cp_fld != null) {
					zv.uz(this.ad_fld, "Coord: " + this.cp_fld, 10 + yu.aq_fld, 20 + yu.ai_fld, 16776960, -1);
				}

				this.bq_fld = -2099249963 * var13;
				this.bs_fld = var25 * 1631920613;
				this.bn_fld = var1 * 1545167529;
				this.bo_fld = var2 * -1412529775;
				yu.fx(var8);
				if (var15 != fc.bo()) {
					fc.bh(var15);
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZZ)V"
	)
	public static void jp(wl var0, int var1, int var2, boolean var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				long var5;
				label46: {
					var5 = lz.ak();
					lg(var0, var1, var2, var4, var5);
					if (!fv(var0, 934187350) && (var4 || var3)) {
						boolean var7 = cf.cg_fld.bz();
						if (!var7) {
							if (var4) {
								var0.bc_fld = var1;
								var0.bw_fld = var2;
								var0.bu_fld = -355139511 * var0.bz_fld;
								var0.bn_fld = 604717829 * var0.br_fld;
							}

							if (var0.bu_fld != -1) {
								int var8 = var1 - var0.bc_fld;
								int var9 = var2 - var0.bw_fld;
								fi(var0, var0.bu_fld - (int)(var8 / var0.bk_fld), var0.bn_fld + (int)(var9 / var0.bk_fld), false);
							}
							break label46;
						}
					}

					var0.as(2104103750);
				}

				if (var4) {
					var0.ba_fld = var5;
					var0.bq_fld = var1 * -585446247;
					var0.bg_fld = 205130882 * var2;
				}
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean cd(int var1, int var2) {
		return !this.bt_fld.contains(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)F"
	)
	float aj(int var1, int var2) {
		if (var1 == 25) {
			return 1.0F;
		} else if (37 == var1) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void au(int var1, byte var2) {
		if (var1 >= 1) {
			this.bz_fld = -1645016423 * var1;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int bf(byte var1) {
		return this.bf_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)Lkj;"
	)
	public kj bl(byte var1) {
		return this.ac_fld == null ? null : this.aj_fld.ah(et(this, (byte)8), this.by(-455987332), (byte)34);
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("getWorldMapData")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/WorldMapData;"
	)
	@Export("getWorldMapData")
	@Override
	public net.runelite.api.WorldMapData getWorldMapData() {
		return this.wx();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int bo(byte var1) {
		return this.bo_fld;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lwl;II)V"
	)
	public static void if_(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bt_fld = new HashSet();
		var0.bv_fld = 0;
		var0.bi_fld = 0;

		for (int var3 = 0; var3 < pc.ag_fld; var3++) {
			if (uh.ak(var3) != null && uh.ak(var3).ac_fld * -1108351195 == var1) {
				var0.bt_fld.add(uh.ak(var3).ah_fld * -2065753697);
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bc(int var1, int var2) {
		this.bs(var1, var2, (byte)-36);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	public void bi(short var1) {
		this.bg_fld = 702894342;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bv(int var1, int var2) {
		if (var1 >= 1) {
			if (var2 >= -1252807831) {
				return;
			}

			this.br_fld = var1 * -157740805;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bn(int var1, int var2) {
		if (this.ac_fld != null && this.ac_fld.av(var1, var2, -179357915)) {
			this.bj_fld = (var1 - this.at_fld.ay(140208519) * 64) * -881914049;
			this.cf_fld = (var2 - this.at_fld.aa(-1895367571) * 64) * -71648777;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IZI)V"
	)
	public void ba(int var1, boolean var2, int var3) {
		if (!var2) {
			this.cq_fld.add(var1);
		} else {
			this.cc_fld.remove(var1);
		}

		this.cq(1148861988);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(ILkj;B)Lkj;"
	)
	public kj cy(int var1, kj var2, byte var3) {
		if (!this.bd_fld.av()) {
			return null;
		} else if (!this.bm_fld.ay(976423968)) {
			return null;
		} else if (!this.aj_fld.be(-621797759 * var2.ag_fld, var2.ag_fld, -278064648)) {
			return null;
		} else {
			HashMap var4 = this.bm_fld.ar(-2007497604);
			List var5 = (List)(List)var4.get(var1);
			if (var5 != null && !var5.isEmpty()) {
				hr var6 = null;
				int var7 = -1;
				Iterator var8 = var5.iterator();

				while (var8.hasNext()) {
					hr var9 = (hr)(hr)var8.next();
					int var10 = var9.ay_fld.az_fld * -621797759 - var2.ak_fld;
					int var11 = var9.ay_fld.az_fld * 1479124089 - var2.ak_fld;
					int var12 = var10 * var10 + var11 * var11;
					if (0 == var12) {
						return var9.ay_fld;
					}

					if (var12 < var7 || null == var6) {
						var6 = var9;
						var7 = var12;
					}
				}

				return var6.ay_fld;
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean dc() {
		return this.bs_fld != -1 && this.bu_fld != -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lwl;B)I"
	)
	public static int am(wl var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.bf_fld;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bb(boolean var1, int var2) {
		this.bp_fld = var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bt(int var1) {
		this.bs_fld = -640081973;
	}
}
