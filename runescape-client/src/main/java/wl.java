import java.io.EOFException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.Point;
import net.runelite.api.RenderOverview;
import net.runelite.api.WorldMapData;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.WorldPoint;

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
	@ObfuscatedGetter(
		intValue = 1203303271
	)
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = 923836313
	)
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -1761679829
	)
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int cr_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	gf aj_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	gf ac_fld;
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
	@ObfuscatedGetter(
		intValue = 1298639273
	)
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bx_fld;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean cy_fld;
	@ObfuscatedGetter(
		intValue = -1097572161
	)
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int be_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap ao_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	List cx_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float bh_fld;
	@ObfuscatedGetter(
		intValue = -516858755
	)
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bj_fld;
	@ObfuscatedGetter(
		intValue = 1884500973
	)
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bf_fld;
	@ObfuscatedGetter(
		intValue = -601726567
	)
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int by_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap ap_fld;
	@ObfuscatedGetter(
		intValue = 1088176287
	)
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bw_fld;
	@ObfuscatedGetter(
		intValue = -621946937
	)
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = 1635027365
	)
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bv_fld;
	@ObfuscatedGetter(
		intValue = -9652181
	)
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bi_fld;
	@ObfuscatedGetter(
		intValue = -669418089
	)
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bu_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float bk_fld;
	@ObfuscatedGetter(
		intValue = 1901396113
	)
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bc_fld;
	@ObfuscatedGetter(
		intValue = 1903512605
	)
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int br_fld;
	@ObfuscatedGetter(
		longValue = 7161032785986769003L
	)
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ba_fld;
	@ObfuscatedGetter(
		intValue = 1549059757
	)
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bq_fld;
	@ObfuscatedGetter(
		intValue = 337493205
	)
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bg_fld;
	@ObfuscatedGetter(
		intValue = -1450942607
	)
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = 1698845519
	)
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bn_fld;
	@ObfuscatedGetter(
		intValue = -803309005
	)
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bo_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	gf at_fld;
	@ObfuscatedGetter(
		intValue = 2027603977
	)
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = 92974729
	)
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = 1094530325
	)
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ca_fld;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bb_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V"
	)
	final void ay(int var1, int var2, boolean var3, int var4) {
		this.bz_fld = var1;
		this.br_fld = var2;
		lz.ak();
		if (var3) {
			this.as(-455662490);
		}
	}

	@ObfuscatedName("zt")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIIII)Z"
	)
	public static boolean zt(wl var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.ce_fld == null) {
			return true;
		} else if (var0.ce_fld.aw_fld == var1 && var0.ce_fld.ay_fld == var2) {
			if (var0.bm_fld.av_fld * 253584221 != var0.cn_fld) {
				return true;
			} else if (client.gr_fld != var0.cg_fld) {
				return true;
			} else {
				return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lwl;Z)V"
	)
	public static void kn(wl var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bp_fld = var1;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void eh(int var1, int var2) {
		if (this.aj_fld != null && this.aj_fld.av(var1, var2, -926178337)) {
			this.be_fld = var1 - this.aj_fld.an(740556954) * 64;
			this.bs_fld = var2 - this.aj_fld.ai(-808972350) * 64;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		if (!this.ar(56564401)) {
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

			this.ay(var2 + this.bz_fld, var3 + this.br_fld, true, 183486541);
			if (this.bz_fld == this.be_fld && this.bs_fld == this.br_fld) {
				if (var1 == -282914073) {
					return;
				}

				this.be_fld = 881914049;
				this.bs_fld = 71648777;
			}
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZZ)V"
	)
	public static void lq(wl var0, int var1, int var2, boolean var3, boolean var4) {
		long var5;
		if (var0 == null) {
			var0.getClass();
		}

		label42: {
			var5 = lz.ak();
			xw(var0, var1, var2, var4, var5);
			if (!var0.ar(1997304102) && (var4 || var3)) {
				boolean var7 = cf.cg_fld.bz();
				if (!var7) {
					if (var4) {
						var0.bc_fld = var1;
						var0.bw_fld = var2;
						var0.bu_fld = 1733548895 * var0.bz_fld;
						var0.bn_fld = var0.br_fld;
					}

					if (var0.bu_fld != -1) {
						int var8 = var1 - var0.bc_fld;
						int var9 = var2 - var0.bw_fld;
						var0.ay(var0.bu_fld - (int)(var8 / var0.bh_fld), var0.bn_fld + (int)(var9 / var0.bh_fld), false, -805484493);
					}
					break label42;
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

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "()Lgd;"
	)
	public gd getWorldMapRenderer() {
		return this.bm_fld;
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
					int var9 = (int)Math.ceil(var6 / this.bk_fld);
					int var10 = (int)Math.ceil(var7 / this.bk_fld);
					List var11 = this.bm_fld
						.ah(
							this.bz_fld - var9 / 2 - 1,
							this.br_fld - var10 / 2 - 1,
							this.bz_fld + var9 / 2 + 1,
							1 + var10 / 2 + this.br_fld,
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
						if (this.aa_fld.contains(var14)) {
							var17 = gh.ag(17, (byte)-38).av((Object[])var16, 1888858062).ax(-509168371);
						} else {
							var17 = gh.ag(15, (byte)-53).av((Object[])var16, 1079969367).ax(-198458591);
						}

						va.ak(var17);
					}

					var13 = this.aa_fld.iterator();

					while (var13.hasNext()) {
						hr var20 = (hr)(hr)var13.next();
						if (!var12.contains(var20)) {
							hv var21 = new hv(var20.ag(-1077881246), var20.ay_fld, var20.aw_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = gh.ag(16, (byte)55).av((Object[])var22, 1115922350).ax(431326802);
							va.ak(var23);
						}
					}

					this.aa_fld = var12;
				}
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean bg(byte var1) {
		return !this.cy_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ah(byte var1) {
		if (null != fs.gh_fld) {
			if (var1 == 1) {
				this.bk_fld = this.bh_fld;
			}
		} else {
			if (this.bk_fld < this.bh_fld) {
				if (var1 != 1) {
					return;
				}

				this.bk_fld = Math.min(this.bh_fld, this.bk_fld / 30.0F + this.bk_fld);
			}

			if (this.bk_fld > this.bh_fld) {
				if (var1 != 1) {
					return;
				}

				this.bk_fld = Math.max(this.bh_fld, this.bk_fld - this.bk_fld / 30.0F);
			}
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
					var8 = gh.ag(10, (byte)24).av((Object[])var7, 1878954797).ax(-1517407195);
					break;
				case 1009:
					var8 = gh.ag(11, (byte)-59).av((Object[])var7, 1961502350).ax(402477561);
					break;
				case 1010:
					var8 = gh.ag(12, (byte)-5).av((Object[])var7, 1746122418).ax(-1845944097);
					break;
				case 1011:
					var8 = gh.ag(13, (byte)32).av((Object[])var7, 1019199210).ax(-1659717811);
					break;
				case 1012:
					var8 = gh.ag(14, (byte)16).av((Object[])var7, 1244973887).ax(-280547777);
			}

			if (var8 != null) {
				va.ak(var8);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bq() {
		return this.bj_fld;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ar(int var1) {
		return this.be_fld != -1 && this.bs_fld != -1;
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V"
	)
	public static void wo(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bt_fld = null;
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Lwl;Lub;Lub;Lub;Lzf;Ljava/util/HashMap;[Lyc;I)V"
	)
	public static void dt(wl var0, ub var1, ub var2, ub var3, zf var4, HashMap var5, yc[] var6, int var7) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.ab_fld = var6;
				var0.ai_fld = var1;
				var0.aq_fld = var2;
				var0.am_fld = var3;
				var0.ad_fld = var4;
				var0.ap_fld = new HashMap();
				var0.ap_fld.put(hb.ak_fld, var5.get(aw_fld));
				var0.ap_fld.put(hb.ag_fld, var5.get(ay_fld));
				var0.ap_fld.put(hb.az_fld, var5.get(as_fld));
				var0.bd_fld = new wt(var1);
				int var8 = aac.ak_fld > 237 ? hc.ak_fld.aw_fld : var0.ai_fld.cm(hc.ak_fld.ah_fld, (byte)1);
				int[] var9 = var0.ai_fld.cp(var8, (byte)61);
				int var10 = var9 == null ? 0 : var9.length;
				var0.ao_fld = new HashMap(var10);

				for (int var11 = 0; var11 < var10; var11++) {
					xi var12 = new xi(var0.ai_fld.bb(var8, var9[var11], 584982574));
					gf var13 = new gf();
					var13.ak(var12, var9[var11], (byte)65);
					var0.ao_fld.put(gf.ms(var13, -1282102330), var13);
					if (gf.mn(var13, -1339751498)) {
						if (var7 != 1382466332) {
							return;
						}

						var0.ac_fld = var13;
					}
				}

				var0.aa(var0.ac_fld, 1824227527);
				var0.at_fld = null;
			}
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)Lhr;"
	)
	public static hr sc(wl var0) {
		if (var0.cs_fld == null) {
			return null;
		} else {
			while (var0.cs_fld.hasNext()) {
				hr var1 = (hr)(hr)var0.cs_fld.next();
				if (var1.ag(973633602) != -1) {
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lgf;"
	)
	public gf af(int var1, int var2, int var3, int var4) {
		Iterator var5 = this.ao_fld.values().iterator();

		while (var5.hasNext()) {
			gf var6 = (gf)(gf)var5.next();
			if (var6.az(var1, var2, var3, (byte)25)) {
				return var6;
			}
		}

		return null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void au(int var1, byte var2) {
		try {
			gf var3 = this.be(var1, -220228277);
			if (null != var3) {
				this.aa(var3, 1809280130);
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
				if (this.aj_fld == null || var1 != this.aj_fld) {
					sb(this, var1, (byte)1);
				}

				if (!var4 && this.aj_fld.az(var2.ak_fld, var2.ag_fld, var2.az_fld, (byte)36)) {
					this.am(var2.ak_fld, var2.ag_fld, var2.az_fld, -656860088);
				} else {
					this.am(var3.ak_fld, var3.ag_fld, var3.az_fld, -656860088);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void am(int var1, int var2, int var3, int var4) {
		if (null != this.aj_fld) {
			int[] var5 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (var5 == null) {
				var5 = this.aj_fld.ae(gf.ka(this.aj_fld, 654694288), gf.dg(this.aj_fld, -52546744), this.aj_fld.ao(663324911), 2081577648);
			}

			this.ay(var5[0] - this.aj_fld.an(529669876) * 64, var5[1] - this.aj_fld.ai(-1298353472) * 64, true, -1012978217);
			this.be_fld = 881914049;
			this.bs_fld = 71648777;
			this.bk_fld = this.aj(this.aj_fld.ax(981736215), -1545925171);
			this.bh_fld = this.bk_fld;
			this.cx_fld = null;
			this.cs_fld = null;
			this.bm_fld.ag(-694297034);
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

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fe(int var1) {
		if (var1 >= 1) {
			this.bx_fld = var1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void bd(int var1, byte var2) {
		this.bh_fld = this.aj(var1, -812367652);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZZI)V"
	)
	public static void bj(wl var0, int var1, int var2, boolean var3, boolean var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		} else {
			long var6;
			label57: {
				var6 = lz.ak();
				xw(var0, var1, var2, var4, var6);
				if (!var0.ar(1595617296)) {
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
								var0.bn_fld = var0.br_fld;
							}

							if (var0.bu_fld != -1) {
								int var9 = var1 - var0.bc_fld;
								int var10 = var2 - var0.bw_fld;
								var0.ay(var0.bu_fld - (int)(var9 / var0.bh_fld), var0.bn_fld + (int)(var10 / var0.bh_fld), false, 1398045360);
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
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public void gd(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.bd_fld.av()) {
			int var7 = (int)Math.ceil(var3 / this.bk_fld);
			int var8 = (int)Math.ceil(var4 / this.bk_fld);
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
					pc var12 = uh.ak(var11.ag(-155645777));
					boolean var13 = false;

					for (int var14 = this.ax_fld.length - 1; var14 >= 0; var14--) {
						if (var12.ax_fld[var14] != null) {
							je.fe(var12.ax_fld[var14], var12.an_fld, this.ax_fld[var14], var11.ag(1265630835), kj.bk(var11.ay_fld, 1635779331), kj.bk(var11.aw_fld, -1001024923));
							var13 = true;
						}
					}

					if (var13) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean gf(int var1) {
		return this.bd_fld.av();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Lgf;"
	)
	public gf be(int var1, int var2) {
		Iterator var3 = this.ao_fld.values().iterator();

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
		if (this.aj_fld != null && this.aj_fld.av(var1, var2, -475100430)) {
			this.be_fld = var1 - this.aj_fld.an(1758679299) * 64;
			this.bs_fld = var2 - this.aj_fld.ai(-1344542974) * 64;
		}
	}

	@ObfuscatedName("getWorldMapPosition")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Point;"
	)
	@Override
	public Point getWorldMapPosition() {
		gd var1 = this.getWorldMapRenderer();
		int var2 = this.yn() + var1.xy();
		int var3 = this.kh() + var1.ho();
		return new Point(var2, var3);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V"
	)
	public void bk(int var1, int var2, int var3, short var4) {
		if (null == this.aj_fld) {
			if (var4 == 483) {
				;
			}
		} else {
			int[] var5 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (null != var5) {
				this.bs(var5[0], var5[1], (byte)-35);
			}
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lwl;II)V"
	)
	public static void mb(wl var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var0.aj_fld) {
			var0.ay(var1 - var0.aj_fld.an(1322558909) * 64, var2 - var0.aj_fld.ai(-1300508363) * 64, true, -2052993176);
			var0.be_fld = 881914049;
			var0.bs_fld = 71648777;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int bo(byte var1) {
		return null == this.aj_fld ? -1 : this.bz_fld + this.aj_fld.an(-6511177) * 64;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int by(int var1) {
		return this.aj_fld == null ? -1 : this.br_fld + this.aj_fld.ai(-1803354013) * 64;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)Lkj;"
	)
	public kj bl(byte var1) {
		return this.aj_fld == null ? null : gf.pk(this.aj_fld, this.bo((byte)8), this.by(-455987332), (byte)34);
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V"
	)
	public static void gh(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bh_fld = var0.aj(var1, -929420710);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bx(int var1) {
		return this.bj_fld;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ey() {
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bc(int var1, int var2) {
		this.bt_fld = new HashSet();
		this.bv_fld = 0;
		this.bi_fld = 0;

		for (int var3 = 0; var3 < pc.ag_fld; var3++) {
			if (uh.ak(var3) != null && uh.ak(var3).ar_fld * -1108351195 == var1) {
				this.bt_fld.add(uh.ak(var3).ah_fld * -2065753697);
			}
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kh() {
		return this.br_fld;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void hv(wl var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			ga.ae_fld.aw();
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ce() {
		ga.ae_fld.ah(5);
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

			this.bo_fld = var1;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bn(int var1, int var2) {
		this.bt_fld = new HashSet();
		this.bt_fld.add(var1);
		this.bv_fld = 0;
		this.bi_fld = 0;
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

	@ObfuscatedName("getWorldMapZoom")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float getWorldMapZoom() {
		return this.bk_fld;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IIIZ)V"
	)
	public void dm(int var1, int var2, int var3, boolean var4) {
		try {
			gf var5 = this.af(var1, var2, var3, 1161105583);
			if (null == var5) {
				if (!var4) {
					return;
				}

				var5 = this.ac_fld;
			}

			boolean var6 = false;
			if (this.at_fld != var5 || var4) {
				this.at_fld = var5;
				this.aa(var5, 1960398675);
				var6 = true;
			}

			if (var6 || var4) {
				this.am(var1, var2, var3, -656860088);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
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
			int var12 = this.bo((byte)61) - var5 / 2 - var8;
			int var13 = this.by(1924726092) - var6 / 2 - var8;
			int var14 = var1 - (var12 + var8 - this.cr_fld) * 253584221 * this.bm_fld.av_fld;
			int var15 = var2 - (var8 - (var13 - this.ca_fld)) * 253584221 * this.bm_fld.av_fld;
			if (zt(this, var9, var10, var14, var15, var3, var4)) {
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

				this.cr_fld = this.bo((byte)91) - var5 / 2 - var8;
				this.ca_fld = this.by(-1841421659) - var6 / 2 - var8;
				this.cn_fld = this.bm_fld.av_fld * -1217438565;
				fs.gh_fld.ae(this.cr_fld, this.ca_fld, this.ce_fld, this.cn_fld / var11);
				this.cg_fld = -36159293 * client.gr_fld;
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

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(IIZ)V"
	)
	public void gm(int var1, int var2, boolean var3) {
		this.ay(var1, var2, var3, -1012978217);
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
		if (this.bd_fld.av()) {
			int var8 = (int)Math.ceil(var3 / this.bk_fld);
			int var9 = (int)Math.ceil(var4 / this.bk_fld);
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

							je.fe(var13.ax_fld[var15], var13.an_fld, this.ax_fld[var15], var12.ag(1918786309), kj.bk(var12.ay_fld, -178363653), kj.bk(var12.aw_fld, 303946900));
							var14 = true;
						}
					}

					if (var14) {
						return;
					}
				}
			}
		}
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
		} else if (!this.aj_fld.av(var2.ag_fld, var2.az_fld, -278064648)) {
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
					int var10 = var9.aw_fld.ag_fld * -621797759 - var2.ag_fld;
					int var11 = var9.aw_fld.az_fld * 1479124089 - var2.az_fld;
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

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(ILkj;)Lkj;"
	)
	public kj gy(int var1, kj var2) {
		if (!this.bd_fld.av()) {
			return null;
		} else if (!this.bm_fld.ay(1258336673)) {
			return null;
		} else if (!this.aj_fld.av(var2.ag_fld, var2.az_fld, -344653794)) {
			return null;
		} else {
			HashMap var3 = this.bm_fld.ar(-132611431);
			List var4 = (List)(List)var3.get(var1);
			if (var4 != null && !var4.isEmpty()) {
				hr var5 = null;
				int var6 = -1;
				Iterator var7 = var4.iterator();

				while (var7.hasNext()) {
					hr var8 = (hr)(hr)var7.next();
					int var9 = var8.aw_fld.ag_fld * -621797759 - var2.ag_fld;
					int var10 = var8.aw_fld.az_fld * 1479124089 - var2.az_fld;
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

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void fu(int var1, int var2) {
		this.bs(var1, var2, (byte)-36);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;Lub;Lzf;Ljava/util/HashMap;[Lyc;)V"
	)
	public void cp(ub var1, ub var2, ub var3, zf var4, HashMap var5, yc[] var6) {
		try {
			this.ab_fld = var6;
			this.ai_fld = var1;
			this.aq_fld = var2;
			this.am_fld = var3;
			this.ad_fld = var4;
			this.ap_fld = new HashMap();
			this.ap_fld.put(hb.ak_fld, var5.get(aw_fld));
			this.ap_fld.put(hb.ag_fld, var5.get(ay_fld));
			this.ap_fld.put(hb.az_fld, var5.get(as_fld));
			this.bd_fld = new wt(var1);
			int var7 = aac.ak_fld > -1892240073 ? -808737389 * hc.ak_fld.aw_fld : this.ai_fld.cm(hc.ak_fld.ah_fld, (byte)1);
			int[] var8 = this.ai_fld.cp(var7, (byte)20);
			int var9 = var8 == null ? 0 : var8.length;
			this.ao_fld = new HashMap(var9);

			for (int var10 = 0; var10 < var9; var10++) {
				xi var11 = new xi(this.ai_fld.bb(var7, var8[var10], 584982574));
				gf var12 = new gf();
				var12.ak(var11, var8[var10], (byte)49);
				this.ao_fld.put(gf.ms(var12, 21528822), var12);
				if (gf.mn(var12, -1707429177)) {
					this.ac_fld = var12;
				}
			}

			this.aa(this.ac_fld, 2038231854);
			this.at_fld = null;
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("getWorldMapData")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/WorldMapData;"
	)
	@Override
	public WorldMapData getWorldMapData() {
		return this.cb();
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIIID)V"
	)
	public static void jv(wl var0, int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
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
						var0.bm_fld.ak(var0.ai_fld, var0.aj_fld, client.ct_fld, -959885383);
						if (!var0.bm_fld.ay(442995491)) {
							return;
						}
					}

					int var11 = var0.bm_fld.as((byte)1);
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

					int var13 = (int)Math.ceil(var3 / var0.bk_fld);
					int var24 = (int)Math.ceil(var4 / var0.bk_fld);
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
						zv.uj(var0.ad_fld, "Coord: " + var0.cp_fld, 10 + yu.aq_fld, 20 + yu.aa_fld, 16776960, -1);
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
					int var8 = (int)Math.ceil(var6 / this.bk_fld);
					int var9 = (int)Math.ceil(var7 / this.bk_fld);
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
							var16 = gh.ag(17, (byte)-8).av((Object[])var15, 2133102910).ax(-477825464);
						} else {
							var16 = gh.ag(15, (byte)-33).av((Object[])var15, 1462402284).ax(1158007399);
						}

						va.ak(var16);
					}

					var12 = this.aa_fld.iterator();

					while (var12.hasNext()) {
						hr var20 = (hr)(hr)var12.next();
						if (!var11.contains(var20)) {
							hv var21 = new hv(var20.ag(1288131354), var20.ay_fld, var20.aw_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = gh.ag(16, (byte)63).av((Object[])var22, 1322191719).ax(-820774616);
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
		descriptor = "(IIZZ)V"
	)
	public void cm(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label40: {
			var5 = lz.ak();
			xw(this, var1, var2, var4, var5);
			if (!this.ar(-853332127) && (var4 || var3)) {
				boolean var7 = cf.cg_fld.bz();
				if (!var7) {
					if (var4) {
						this.bc_fld = var1;
						this.bw_fld = var2;
						this.bu_fld = 1733548895 * this.bz_fld;
						this.bn_fld = this.br_fld;
					}

					if (this.bu_fld != -1) {
						int var8 = var1 - this.bc_fld;
						int var9 = var2 - this.bw_fld;
						this.ay(this.bu_fld - (int)(var8 / this.bh_fld), this.bn_fld + (int)(var9 / this.bh_fld), false, -420572242);
					}
					break label40;
				}
			}

			this.as(-1493806507);
		}

		if (var4) {
			this.ba_fld = var5;
			this.bq_fld = var1;
			this.bg_fld = var2;
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IZ)V"
	)
	public static void ko(wl var0, int var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var2) {
			var0.cd_fld.add(var1);
		} else {
			var0.cd_fld.remove(var1);
		}

		var0.cq(1148861988);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IIZZ)V"
	)
	public void cz(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label40: {
			var5 = lz.ak();
			xw(this, var1, var2, var4, var5);
			if (!this.ar(934187350) && (var4 || var3)) {
				boolean var7 = cf.cg_fld.bz();
				if (!var7) {
					if (var4) {
						this.bc_fld = var1;
						this.bw_fld = var2;
						this.bu_fld = -355139511 * this.bz_fld;
						this.bn_fld = 604717829 * this.br_fld;
					}

					if (this.bu_fld != -1) {
						int var8 = var1 - this.bc_fld;
						int var9 = var2 - this.bw_fld;
						this.ay(this.bu_fld - (int)(var8 / this.bh_fld), this.bn_fld + (int)(var9 / this.bh_fld), false, -1910599851);
					}
					break label40;
				}
			}

			this.as(2104103750);
		}

		if (var4) {
			this.ba_fld = var5;
			this.bq_fld = var1 * -585446247;
			this.bg_fld = 205130882 * var2;
		}
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
					this.bm_fld.ak(this.ai_fld, this.aj_fld, client.ct_fld, 1572421170);
					if (!this.bm_fld.ay(1357484729)) {
						return;
					}
				}

				int var11 = this.bm_fld.as((byte)1);
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

				int var13 = (int)Math.ceil(var3 / this.bk_fld);
				int var25 = (int)Math.ceil(var4 / this.bk_fld);
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
					zv.uj(this.ad_fld, "Coord: " + this.cp_fld, 10 + yu.aq_fld, 20 + yu.aa_fld, 16776960, -1);
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IIZJ)V"
	)
	void cb(int var1, int var2, boolean var3, long var4) {
		if (null != this.aj_fld) {
			int var6 = (int)(this.bz_fld * -1105842517 + (var1 - this.by_fld - this.bx(-631063347) * this.bk_fld / 2.0F) / this.bk_fld);
			int var7 = (int)(-793765464 * this.br_fld - (var2 - this.bl_fld - ag(this, (byte)-24) * this.bk_fld / 2.0F) / this.bk_fld);
			this.cp_fld = gf.pk(this.aj_fld, var6 + this.aj_fld.an(1084819534) * -204801371, var7 + this.aj_fld.ai(-1415878498) * 64, (byte)56);
			if (null != this.cp_fld && var3) {
				fi var8 = iq.ay();
				boolean var9 = client.jl_fld >= 2;
				if (var9 && var8.ay(-1180224582) && var8.ay(2086322015)) {
					bu.he(681751388 * this.cp_fld.ag_fld, this.cp_fld.az_fld * -1408554859, this.cp_fld.ak_fld * -175166672, false);
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
						jm var13 = gi.ak(jb.dz_fld, client.aq_fld.av_fld);
						var13.ay_fld.ea(kj.bk(this.cp_fld, -570136175));
						client.aq_fld.az(var13);
						this.ba_fld = 0L;
					}
				}
			}
		} else {
			this.cp_fld = null;
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void gy(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != fs.gh_fld) {
			var0.bk_fld = var0.bh_fld;
		} else {
			if (var0.bk_fld < var0.bh_fld) {
				var0.bk_fld = Math.min(var0.bh_fld, var0.bk_fld / 30.0F + var0.bk_fld);
			}

			if (var0.bk_fld > var0.bh_fld) {
				var0.bk_fld = Math.max(var0.bh_fld, var0.bk_fld - var0.bk_fld / 30.0F);
			}
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ci() {
		if (null != fs.gh_fld) {
			this.bk_fld = this.bh_fld;
		} else {
			if (this.bk_fld < this.bh_fld) {
				this.bk_fld = Math.min(this.bh_fld, this.bk_fld / 30.0F + this.bk_fld);
			}

			if (this.bk_fld > this.bh_fld) {
				this.bk_fld = Math.max(this.bh_fld, this.bk_fld - this.bk_fld / 30.0F);
			}
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()Lgf;"
	)
	public gf ds() {
		return this.aj_fld;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(III)Lgf;"
	)
	public gf dt(int var1, int var2, int var3) {
		Iterator var4 = this.ao_fld.values().iterator();

		while (var4.hasNext()) {
			gf var5 = (gf)(gf)var4.next();
			if (var5.az(var1, var2, var3, (byte)92)) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fp(int var1, int var2, int var3) {
		if (this.aj_fld != null) {
			int[] var4 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				mb(this, var4[0], var4[1]);
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void gj(int var1, boolean var2) {
		if (!var2) {
			this.cc_fld.add(var1);
		} else {
			this.cc_fld.remove(var1);
		}

		for (int var3 = 0; var3 < pc.ag_fld; var3++) {
			if (uh.ak(var3) != null && uh.ak(var3).ar_fld * -1108351195 == var1) {
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

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean dc() {
		return this.be_fld != -1 && this.bs_fld != -1;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(III)Lgf;"
	)
	public gf dh(int var1, int var2, int var3) {
		Iterator var4 = this.ao_fld.values().iterator();

		while (var4.hasNext()) {
			gf var5 = (gf)(gf)var4.next();
			if (var5.az(var1, var2, var3, (byte)113)) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void go() {
		this.bt_fld = null;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gp(boolean var1) {
		this.cy_fld = !var1;
	}

	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZZ)V"
	)
	public static void se(wl var0, int var1, int var2, boolean var3, boolean var4) {
		long var5;
		if (var0 == null) {
			var0.getClass();
		}

		label45: {
			var5 = lz.ak();
			xw(var0, var1, var2, var4, var5);
			if (!var0.ar(-308740956) && (var4 || var3)) {
				boolean var7 = cf.cg_fld.bz();
				if (!var7) {
					if (var4) {
						var0.bc_fld = var1 * -747114684;
						var0.bw_fld = var2 * -359241425;
						var0.bu_fld = 1733548895 * var0.bz_fld;
						var0.bn_fld = -1077812825 * var0.br_fld;
					}

					if (var0.bu_fld != -1) {
						int var8 = var1 - var0.bc_fld;
						int var9 = var2 - var0.bw_fld;
						var0.ay(var0.bu_fld - (int)(var8 / var0.bh_fld), var0.bn_fld + (int)(var9 / var0.bh_fld), false, 260245998);
					}
					break label45;
				}
			}

			var0.as(-462421457);
		}

		if (var4) {
			var0.ba_fld = var5;
			var0.bq_fld = var1 * 1613419007;
			var0.bg_fld = -950631131 * var2;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean br(int var1) {
		return !this.cc_fld.contains(var1);
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

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int li() {
		return this.be_fld;
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIZ)V"
	)
	public static void os(wl var0, int var1, int var2, int var3, boolean var4) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				gf var5 = var0.af(var1, var2, var3, 1163735173);
				if (null == var5) {
					if (!var4) {
						return;
					}

					var5 = var0.ac_fld;
				}

				boolean var6 = false;
				if (var0.at_fld != var5 || var4) {
					var0.at_fld = var5;
					var0.aa(var5, 1835593398);
					var6 = true;
				}

				if (var6 || var4) {
					var0.am(var1, var2, var3, -656860088);
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean em() {
		return this.bd_fld.av();
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fj() {
		return null == this.aj_fld ? -1 : this.aj_fld.ay(-143778459);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dk() {
		return this.aj_fld == null ? -1 : this.br_fld + this.aj_fld.ai(-886315980) * 64;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ef() {
		return this.bs_fld;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void di(int var1, int var2, int var3) {
		if (null != this.aj_fld) {
			int[] var4 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (var4 == null) {
				var4 = this.aj_fld.ae(gf.ka(this.aj_fld, 398306917), gf.dg(this.aj_fld, -172777017), this.aj_fld.ao(-85535541), 2081577648);
			}

			this.ay(var4[0] - this.aj_fld.an(1359824258) * -458802951, var4[1] - this.aj_fld.ai(-1568419070) * 64, true, -1952815452);
			this.be_fld = -988610727;
			this.bs_fld = 71648777;
			this.bk_fld = this.aj(this.aj_fld.ax(981736215), -38022444);
			this.bh_fld = this.bk_fld;
			this.cx_fld = null;
			this.cs_fld = null;
			this.bm_fld.ag(346583213);
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lkj;Lkj;Z)V"
	)
	public void db(gf var1, kj var2, kj var3, boolean var4) {
		try {
			if (null != var1) {
				if (this.aj_fld == null || var1 != this.aj_fld) {
					sb(this, var1, (byte)1);
				}

				if (!var4 && this.aj_fld.az(var2.ak_fld, var2.ag_fld * 333235033, -1798046778 * var2.az_fld, (byte)92)) {
					this.am(var2.ak_fld, -821599670 * var2.ag_fld, -461748712 * var2.az_fld, -656860088);
				} else {
					this.am(var3.ak_fld, var3.ag_fld, var3.az_fld, -656860088);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lkj;Lkj;Z)V"
	)
	public void dg(gf var1, kj var2, kj var3, boolean var4) {
		try {
			if (null != var1) {
				if (this.aj_fld == null || var1 != this.aj_fld) {
					sb(this, var1, (byte)1);
				}

				if (!var4 && this.aj_fld.az(var2.ak_fld, var2.ag_fld, var2.az_fld, (byte)2)) {
					this.am(var2.ak_fld, var2.ag_fld, var2.az_fld, -656860088);
				} else {
					this.am(var3.ak_fld, var3.ag_fld, var3.az_fld, -656860088);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Lgf;Lkj;Lkj;Z)V"
	)
	public void dw(gf var1, kj var2, kj var3, boolean var4) {
		try {
			if (null != var1) {
				if (this.aj_fld == null || var1 != this.aj_fld) {
					sb(this, var1, (byte)1);
				}

				if (!var4 && this.aj_fld.az(87070199 * var2.ak_fld, var2.ag_fld * 1468606211, var2.az_fld, (byte)85)) {
					this.am(-993804665 * var2.ak_fld, var2.ag_fld, -1553887216 * var2.az_fld, -656860088);
				} else {
					this.am(var3.ak_fld, 345558917 * var3.ag_fld, var3.az_fld, -656860088);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cj() {
		if (this.ar(425494224)) {
			int var1 = this.be_fld - this.bz_fld;
			int var2 = this.bs_fld - this.br_fld;
			if (0 != var1) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			this.ay(var1 + this.bz_fld, var2 + this.br_fld, true, 1071139260);
			if (this.bz_fld == this.be_fld && this.bs_fld == this.br_fld) {
				this.be_fld = 881914049;
				this.bs_fld = 345476497;
			}
		}
	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IB)V"
	)
	public static void qw(wl var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 1) {
			var0.bx_fld = var1;
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(III)Lgf;"
	)
	public gf dv(int var1, int var2, int var3) {
		Iterator var4 = this.ao_fld.values().iterator();

		while (var4.hasNext()) {
			gf var5 = (gf)(gf)var4.next();
			if (var5.az(var1, var2, var3, (byte)47)) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void dy(int var1, int var2, int var3) {
		if (null != this.aj_fld) {
			int[] var4 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (var4 == null) {
				var4 = this.aj_fld.ae(gf.ka(this.aj_fld, 1400061680), gf.dg(this.aj_fld, 1237652155), this.aj_fld.ao(533496817), 2081577648);
			}

			this.ay(var4[0] - this.aj_fld.an(2091542038) * 64, var4[1] - this.aj_fld.ai(-1205414664) * 64, true, -1708858925);
			this.be_fld = -1573314422;
			this.bs_fld = -401278951;
			this.bk_fld = this.aj(this.aj_fld.ax(981736215), -741251892);
			this.bh_fld = this.bk_fld;
			this.cx_fld = null;
			this.cs_fld = null;
			this.bm_fld.ag(-418448213);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)Z"
	)
	public static boolean aw(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return !var0.cd_fld.contains(var1);
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ee() {
		return this.by_fld;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bb(boolean var1, int var2) {
		this.cy_fld = !var1;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void es() {
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
			int var11 = this.bo((byte)60) - var5 / 2 - var7;
			int var12 = this.by(286740366) - var6 / 2 - var7;
			int var13 = var1 - (var11 + var7 - this.cr_fld) * 253584221 * this.bm_fld.av_fld;
			int var14 = var2 - (var7 - (var12 - this.ca_fld)) * 253584221 * this.bm_fld.av_fld;
			if (zt(this, var8, var9, var13, var14, var3, var4)) {
				if (this.ce_fld != null && this.ce_fld.aw_fld == var8 && var9 == this.ce_fld.ay_fld) {
					Arrays.fill(this.ce_fld.ah_fld, 0);
				} else {
					this.ce_fld = new yv(var8, var9);
				}

				this.cr_fld = this.bo((byte)120) - var5 / 2 - var7;
				this.ca_fld = this.by(288727173) - var6 / 2 - var7;
				this.cn_fld = this.bm_fld.av_fld * -1217438565;
				fs.gh_fld.ae(this.cr_fld, this.ca_fld, this.ce_fld, this.cn_fld / var10);
				this.cg_fld = -36159293 * client.gr_fld;
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void bu(boolean var1, int var2) {
		this.bp_fld = var1;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ez(int var1, int var2, int var3, int var4) {
		try {
			if (this.bd_fld.av()) {
				if (!this.bm_fld.ay(1605742480)) {
					this.bm_fld.ak(this.ai_fld, this.aj_fld, client.ct_fld, -1784463716);
					if (!this.bm_fld.ay(636485403)) {
						return;
					}
				}

				gd.ww(this.bm_fld, var1, var2, var3, var4, this.bt_fld, this.bi_fld, this.bo_fld, -623403335);
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

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)Z"
	)
	public static boolean zo(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return !var0.cc_fld.contains(var1);
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
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dj() {
		ga.ae_fld.aw();
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fh() {
		if (1.0 == this.bh_fld) {
			return 25;
		} else if (1.5 == this.bh_fld) {
			return 37;
		} else if (2.0 == this.bh_fld) {
			return 50;
		} else if (this.bh_fld == 3.0) {
			return 75;
		} else {
			return 4.0 == this.bh_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int wt() {
		if (1.0 == this.bh_fld) {
			return 25;
		} else if (1.5 == this.bh_fld) {
			return -383043811;
		} else if (2.0 == this.bh_fld) {
			return -1828560398;
		} else if (this.bh_fld == 3.0) {
			return 1378485690;
		} else {
			return 4.0 == this.bh_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int pb() {
		if (1.0 == this.bh_fld) {
			return 25;
		} else if (1.5 == this.bh_fld) {
			return 37;
		} else if (2.0 == this.bh_fld) {
			return 50;
		} else if (this.bh_fld == 3.0) {
			return 75;
		} else {
			return 4.0 == this.bh_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ei() {
		if (1.0 == this.bh_fld) {
			return 25;
		} else if (1.5 == this.bh_fld) {
			return 37;
		} else if (2.0 == this.bh_fld) {
			return 50;
		} else if (this.bh_fld == 3.0) {
			return 75;
		} else {
			return 4.0 == this.bh_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ea() {
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

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("getWorldMapData")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/worldmap/WorldMapData;"
	)
	public net.runelite.api.worldmap.WorldMapData getWorldMapData_net_runelite_api_worldmap_WorldMapData() {
		return this.cb();
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void eu(int var1, int var2) {
		if (this.aj_fld != null && this.aj_fld.av(var1, var2, -179357915)) {
			this.be_fld = var1 - this.aj_fld.an(140208519) * 64;
			this.bs_fld = var2 - this.aj_fld.ai(-1895367571) * 64;
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
		} else if (var1 == -1820692053) {
			return 2.0F;
		} else if (var1 == 303470706) {
			return 3.0F;
		} else {
			return var1 == -2134318467 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("setWorldMapPositionTarget")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/coords/WorldPoint;)V"
	)
	@Override
	public void setWorldMapPositionTarget(WorldPoint var1) {
		this.fu(var1.getX(), var1.getY());
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)Lgf;"
	)
	public gf el(int var1) {
		Iterator var2 = this.ao_fld.values().iterator();

		while (var2.hasNext()) {
			gf var3 = (gf)(gf)var2.next();
			if (var3.ay(-143778459) == var1) {
				return var3;
			}
		}

		return null;
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bt(int var1) {
		this.bx_fld = -640081973;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fy(int var1, int var2, int var3) {
		if (null != this.aj_fld) {
			int[] var4 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				this.bs(var4[0], var4[1], (byte)-57);
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()Lgf;"
	)
	public gf cb() {
		return this.aj_fld;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void fa(int var1, int var2, int var3) {
		if (null != this.aj_fld) {
			int[] var4 = this.aj_fld.ae(var1, var2, var3, 2081577648);
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
		if (this.aj_fld != null) {
			int[] var4 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				mb(this, var4[0], var4[1]);
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fx() {
		return this.bf_fld;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ej(int var1, int var2, int var3) {
		if (null != this.aj_fld) {
			int[] var4 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (null != var4) {
				this.bs(var4[0], var4[1], (byte)-66);
			}
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IZB)V"
	)
	public static void ca(wl var0, int var1, boolean var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var2) {
			var0.cc_fld.add(var1);
		} else {
			var0.cc_fld.remove(var1);
		}

		for (int var4 = 0; var4 < pc.ag_fld; var4++) {
			if (uh.ak(var4) == null) {
				if (var3 >= 1) {
					return;
				}
			} else if (uh.ak(var4).ar_fld * -1108351195 == var1) {
				int var5 = uh.ak(var4).ah_fld * -2065753697;
				if (!var2) {
					var0.cq_fld.add(var5);
				} else {
					var0.cq_fld.remove(var5);
				}
			}
		}

		var0.cq(1148861988);
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fv() {
		return this.aj_fld == null ? -1 : this.br_fld + this.aj_fld.ai(-607370313) * 64;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)Lhr;"
	)
	public static hr av(wl var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.cs_fld == null) {
			return null;
		} else {
			while (var0.cs_fld.hasNext()) {
				hr var1 = (hr)(hr)var0.cs_fld.next();
				if (var1.ag(1491536057) != -1) {
					return var1;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void dn(int var1, int var2, int var3) {
		if (null != this.aj_fld) {
			int[] var4 = this.aj_fld.ae(var1, var2, var3, 2081577648);
			if (var4 == null) {
				var4 = this.aj_fld.ae(gf.ka(this.aj_fld, 1610110589), gf.dg(this.aj_fld, -1755053692), this.aj_fld.ao(321013551), 2081577648);
			}

			this.ay(var4[0] - this.aj_fld.an(-34376213) * 64, var4[1] - this.aj_fld.ai(-1128299862) * 64, true, 1004458549);
			this.be_fld = 881914049;
			this.bs_fld = 71648777;
			this.bk_fld = this.aj(this.aj_fld.ax(981736215), -1600792723);
			this.bh_fld = this.bk_fld;
			this.cx_fld = null;
			this.cs_fld = null;
			this.bm_fld.ag(-1551528867);
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lwl;Z)V"
	)
	public static void kz(wl var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cy_fld = !var1;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIZB)V"
	)
	public static void eb(wl var0, int var1, int var2, int var3, boolean var4, byte var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				gf var6 = var0.af(var1, var2, var3, 1933130912);
				if (null == var6) {
					if (!var4) {
						return;
					}

					if (var5 != 61) {
						return;
					}

					var6 = var0.ac_fld;
				}

				boolean var7 = false;
				if (var0.at_fld != var6 || var4) {
					var0.at_fld = var6;
					var0.aa(var6, 1983959345);
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

				var0.am(var1, var2, var3, -656860088);
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "()Lkj;"
	)
	public kj fb() {
		return this.aj_fld == null ? null : gf.pk(this.aj_fld, this.bo((byte)57), this.by(1721645088), (byte)-107);
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "()Lkj;"
	)
	public kj fk() {
		return this.aj_fld == null ? null : gf.pk(this.aj_fld, this.bo((byte)25), this.by(-1498466615), (byte)1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ag(int var1) {
		ga.ae_fld.ah(5);
	}

	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIIID)V"
	)
	public static void tg(wl var0, int var1, int var2, int var3, int var4, int var5, double var6) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				int[] var8 = new int[4];
				yu.dy(var8);
				yu.dg(var1, var2, var1 + var3, var4 + var2);
				int var9 = var0.bd_fld.ae();
				if (var9 < 100) {
					var0.ac(var1, var2, var3, var4, var9, (short)-1856);
				} else {
					if (!var0.bm_fld.ay(27920418)) {
						var0.bm_fld.ak(var0.ai_fld, var0.aj_fld, client.ct_fld, -998877862);
						if (!var0.bm_fld.ay(830169769)) {
							return;
						}
					}

					int var11 = var0.bm_fld.as((byte)1);
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

					int var13 = (int)Math.ceil(var3 / var0.bk_fld);
					int var25 = (int)Math.ceil(var4 / var0.bk_fld);
					double var15 = fc.ah();
					var0.bm_fld
						.az(var0.bz_fld - var13 / 2, var0.br_fld - var25 / 2, var0.bz_fld + var13 / 2, var0.br_fld + var25 / 2, var1, var2, var1 + var3, var4 + var2, -1090567110);
					if (!var0.cy_fld) {
						boolean var17 = false;
						if (var5 - var0.cf_fld > 100) {
							var0.cf_fld = var5;
							var17 = true;
						}

						var0.bm_fld
							.av(
								var0.bz_fld - var13 / 2,
								var0.br_fld - var25 / 2,
								var13 / 2 + var0.bz_fld,
								var25 / 2 + var0.br_fld,
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

					var0.ap(var1, var2, var3, var4, var13, var25, (byte)29);
					boolean var27 = client.jl_fld >= 2;
					if (var27 && var0.an_fld && var0.cp_fld != null) {
						zv.uj(var0.ad_fld, "Coord: " + var0.cp_fld, 10 + yu.aq_fld, 20 + yu.aa_fld, 16776960, -1);
					}

					var0.bj_fld = var13;
					var0.bf_fld = var25;
					var0.by_fld = var1;
					var0.bl_fld = var2;
					yu.di(var8);
					if (var15 != fc.ah()) {
						fc.az(var15);
					}
				}
			}
		} catch (Throwable var22) {
			throw new RuntimeException(var22);
		}
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int qd() {
		return this.bf_fld;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fm(int var1) {
		if (var1 >= 1) {
			this.bx_fld = var1;
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IILkj;Lkj;)V"
	)
	public void gz(int var1, int var2, kj var3, kj var4) {
		try {
			hv var5 = new hv(var2, var3, var4);
			Object[] var6 = (Object[])(new Object[]{var5});
			yz var7 = null;
			switch (var1) {
				case 1008:
					var7 = gh.ag(10, (byte)61).av((Object[])var6, 1219540712).ax(1607118080);
					break;
				case 1009:
					var7 = gh.ag(11, (byte)18).av((Object[])var6, 2131959209).ax(-906853434);
					break;
				case 1010:
					var7 = gh.ag(12, (byte)-1).av((Object[])var6, 1843652488).ax(1652548507);
					break;
				case 1011:
					var7 = gh.ag(13, (byte)81).av((Object[])var6, 2043588295).ax(794362364);
					break;
				case 1012:
					var7 = gh.ag(14, (byte)-8).av((Object[])var6, 1107052411).ax(-960557317);
			}

			if (var7 != null) {
				va.ak(var7);
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fw(int var1) {
		if (var1 >= 1) {
			this.bx_fld = var1;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lwl;S)V"
	)
	public static void bx(wl var0, short var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bo_fld = 702894342;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cu() {
		if (this.ar(-785978940)) {
			int var1 = this.be_fld - this.bz_fld;
			int var2 = this.bs_fld - this.br_fld;
			if (0 != var1) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			this.ay(var1 + this.bz_fld, var2 + this.br_fld, true, -1722456413);
			if (this.bz_fld == this.be_fld && this.bs_fld == this.br_fld) {
				this.be_fld = 881914049;
				this.bs_fld = 71648777;
			}
		}
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int yn() {
		return this.bz_fld;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fg() {
		this.bx_fld = 1553457962;
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

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void fd() {
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
					this.bm_fld.ak(this.ai_fld, this.aj_fld, client.ct_fld, -148943851);
					if (!this.bm_fld.ay(2124149128)) {
						return;
					}
				}

				int var11 = this.bm_fld.as((byte)1);
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

				int var13 = (int)Math.ceil(var3 / this.bk_fld);
				int var25 = (int)Math.ceil(var4 / this.bk_fld);
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
					zv.uj(this.ad_fld, "Coord: " + this.cp_fld, 10 + yu.aq_fld, 20 + yu.aa_fld, 16776960, -1);
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bm(int var1) {
		if (1.0 == this.bh_fld) {
			return 25;
		} else if (1.5 == this.bh_fld) {
			return 37;
		} else if (2.0 == this.bh_fld) {
			return 50;
		} else if (this.bh_fld == 3.0) {
			return 75;
		} else {
			return 4.0 == this.bh_fld ? 100 : 200;
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fr(int var1) {
		this.bt_fld = new HashSet();
		this.bt_fld.add(var1);
		this.bv_fld = 0;
		this.bi_fld = 0;
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

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIII)V"
	)
	public static void kd(wl var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else if (var0.aj_fld == null) {
			if (var4 != 2044118889) {
				;
			}
		} else {
			int[] var5 = var0.aj_fld.ae(var1, var2, var3, 2081577648);
			if (null != var5) {
				mb(var0, var5[0], var5[1]);
			}
		}
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
			if (uh.ak(var2) != null && uh.ak(var2).ar_fld * -1108351195 == var1) {
				this.bt_fld.add(uh.ak(var2).ah_fld * -2065753697);
			}
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gg() {
		this.bt_fld = null;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gc() {
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
					int var8 = (int)Math.ceil(var6 / this.bk_fld);
					int var9 = (int)Math.ceil(var7 / this.bk_fld);
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
							var16 = gh.ag(17, (byte)-80).av((Object[])var15, 1801128604).ax(1388205908);
						} else {
							var16 = gh.ag(15, (byte)7).av((Object[])var15, 1391275600).ax(584826343);
						}

						va.ak(var16);
					}

					var12 = this.aa_fld.iterator();

					while (var12.hasNext()) {
						hr var20 = (hr)(hr)var12.next();
						if (!var11.contains(var20)) {
							hv var21 = new hv(var20.ag(1410668695), var20.ay_fld, var20.aw_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = gh.ag(16, (byte)56).av((Object[])var22, 1465726194).ax(145067806);
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

	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIIII)V"
	)
	public static void vq(wl var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		}

		if (fs.gh_fld != null) {
			int var7 = 512 / (var0.bm_fld.av_fld * -1943284007);
			int var8 = 512 + var3;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)(var8 / var10);
			var9 = (int)(var9 / var10);
			int var11 = var0.bo((byte)103) - var5 / 2 - var7;
			int var12 = var0.by(-1992906065) - var6 / 2 - var7;
			int var13 = var1 - (var11 + var7 - var0.cr_fld) * 253584221 * var0.bm_fld.av_fld;
			int var14 = var2 - (var7 - (var12 - var0.ca_fld)) * 253584221 * var0.bm_fld.av_fld;
			if (zt(var0, var8, var9, var13, var14, var3, var4)) {
				if (var0.ce_fld != null && var0.ce_fld.aw_fld == var8 && var9 == var0.ce_fld.ay_fld) {
					Arrays.fill(var0.ce_fld.ah_fld, 0);
				} else {
					var0.ce_fld = new yv(var8, var9);
				}

				var0.cr_fld = var0.bo((byte)44) - var5 / 2 - var7;
				var0.ca_fld = (var0.by(-999220824) - var6 / 2 - var7) * 1869273271;
				var0.cn_fld = var0.bm_fld.av_fld * -1217438565;
				fs.gh_fld.ae(var0.cr_fld, var0.ca_fld, var0.ce_fld, var0.cn_fld / var10);
				var0.cg_fld = -36159293 * client.gr_fld;
				var13 = var1 - (var7 + var11 - var0.cr_fld) * 253584221 * var0.bm_fld.av_fld;
				var14 = var2 - 1747881890 * var0.bm_fld.av_fld * (var7 - (var12 - var0.ca_fld));
			}

			yu.dp(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				var0.ce_fld.bm(var13, var14, -1081909073);
			} else {
				var0.ce_fld.bd(var13, var14, (int)(var10 * var8), (int)(var9 * var10), -1634610201);
			}
		}
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
			if (uh.ak(var3) != null && uh.ak(var3).ar_fld * -1108351195 == var1) {
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
			if (uh.ak(var3) != null && uh.ak(var3).ar_fld * -1108351195 == var1) {
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)I"
	)
	public static int cw(wl var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aj_fld == null ? -1 : var0.br_fld + var0.aj_fld.ai(-799456322) * 64;
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gu(boolean var1) {
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

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void gk(boolean var1) {
		this.cy_fld = !var1;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean gm(int var1) {
		return !this.cc_fld.contains(var1);
	}

	@ObfuscatedName("initializeWorldMap")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/worldmap/WorldMapData;)V"
	)
	@Override
	public void initializeWorldMap(net.runelite.api.worldmap.WorldMapData var1) {
		try {
			sb(this, (gf)var1, (byte)1);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
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
					int var8 = (int)Math.ceil(var6 / this.bk_fld);
					int var9 = (int)Math.ceil(var7 / this.bk_fld);
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
							var16 = gh.ag(17, (byte)13).av((Object[])var15, 1119667188).ax(-1040484482);
						} else {
							var16 = gh.ag(15, (byte)-71).av((Object[])var15, 1578039193).ax(-471558072);
						}

						va.ak(var16);
					}

					var12 = this.aa_fld.iterator();

					while (var12.hasNext()) {
						hr var20 = (hr)(hr)var12.next();
						if (!var11.contains(var20)) {
							hv var21 = new hv(var20.ag(-1440201344), var20.ay_fld, var20.aw_fld);
							Object[] var22 = (Object[])(new Object[]{var21, var1, var2});
							yz var23 = gh.ag(16, (byte)44).av((Object[])var22, 1251734480).ax(-1161763876);
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
			if (null == this.aj_fld || this.aj_fld != var1) {
				sb(this, var1, (byte)1);
				this.am(-1, -1, -1, -656860088);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public void ga(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.bd_fld.av()) {
			int var7 = (int)Math.ceil(var3 / this.bk_fld);
			int var8 = (int)Math.ceil(var4 / this.bk_fld);
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
							je.fe(var12.ax_fld[var14], var12.an_fld, this.ax_fld[var14], var11.ag(1779779944), kj.bk(var11.ay_fld, 1361086739), kj.bk(var11.aw_fld, 2104942685));
							var13 = true;
						}
					}

					if (var13) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IIZJ)V"
	)
	void ck(int var1, int var2, boolean var3, long var4) {
		if (null != this.aj_fld) {
			int var6 = (int)(this.bz_fld + (var1 - this.by_fld - this.bx(-1016137156) * this.bk_fld / 2.0F) / this.bk_fld);
			int var7 = (int)(this.br_fld - (var2 - this.bl_fld - ag(this, (byte)-39) * this.bk_fld / 2.0F) / this.bk_fld);
			this.cp_fld = gf.pk(this.aj_fld, var6 + this.aj_fld.an(136587880) * 2091942923, var7 + this.aj_fld.ai(-1739343437) * -1072935809, (byte)-33);
			if (null != this.cp_fld && var3) {
				fi var8 = iq.ay();
				boolean var9 = client.jl_fld >= 2;
				if (var9 && var8.ay(82) && var8.ay(-1355548651)) {
					bu.he(-1994190213 * this.cp_fld.ag_fld, this.cp_fld.az_fld * 1799103630, this.cp_fld.ak_fld * -1438806167, false);
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
						jm var13 = gi.ak(jb.dz_fld, client.aq_fld.av_fld);
						var13.ay_fld.ea(kj.bk(this.cp_fld, 1903933798));
						client.aq_fld.az(var13);
						this.ba_fld = 0L;
					}
				}
			}
		} else {
			this.cp_fld = null;
		}
	}

	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)Lgf;"
	)
	public static gf vn(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aj_fld;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "()Lhr;"
	)
	public hr ge() {
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

	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)I"
	)
	public static int xq(wl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return null == var0.aj_fld ? -1 : var0.aj_fld.ay(-143778459);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwl;B)I"
	)
	public static int ag(wl var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bf_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Lba;"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIZJ)V"
	)
	void ae(int var1, int var2, boolean var3, long var4) {
		if (null != this.ac_fld) {
			int var6 = (int)(this.bf_fld * 2027603977 + (var1 - this.bj_fld - this.bm(-1016137156) * this.bk_fld / 2.0F) / this.bk_fld);
			int var7 = (int)(1903512605 * this.bz_fld - (var2 - this.cf_fld - ag(this, (byte)-39) * this.bh_fld / 2.0F) / this.bh_fld);
			this.cp_fld = gf.pk(this.ac_fld, var6 + this.aj_fld.ay(136587880) * 2091942923, var7 + this.aj_fld.ad(-1739343437) * -1072935809, (byte)-33);
			if (null != this.cp_fld && var3) {
				fi var8 = iq.ay();
				boolean var9 = client.yr_fld >= 2;
				if (var9 && var8.as(82) && var8.ay(-1355548651)) {
					bu.he(-1994190213 * this.cp_fld.az_fld, this.cp_fld.ag_fld * 1799103630, this.cp_fld.ag_fld * -1438806167, false);
				} else {
					boolean var10 = true;
					if (this.bb_fld) {
						int var11 = var1 - this.by_fld;
						int var12 = var2 - this.be_fld;
						if (var4 - this.ba_fld > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						jm var13 = gi.ak(jb.en_fld, client.aq_fld.av_fld);
						var13.ay_fld.bc(kj.bk(this.cp_fld, 1903933798));
						client.aq_fld.az(var13);
						this.ba_fld = 0L;
					}
				}
			}
		} else {
			this.cp_fld = null;
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
			xw(this, var1, var2, var4, var6);
			if (!this.ar(1595617296)) {
				if (var5 != -1982911814) {
					return;
				}

				if (var4 || var3) {
					boolean var8 = cf.cg_fld.bz();
					if (!var8) {
						if (var4) {
							this.ca_fld = var1 * -1355890575;
							this.bg_fld = var2 * 797236063;
							this.cf_fld = 1733548895 * this.bz_fld;
							this.bn_fld = this.bf_fld;
						}

						if (this.bw_fld != -1) {
							int var9 = var1 - this.bs_fld;
							int var10 = var2 - this.bx_fld;
							this.ay(this.bu_fld - (int)(var9 / this.bh_fld), this.cn_fld + (int)(var10 / this.bh_fld), false, 1398045360);
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
			this.bq_fld = var1;
			this.bx_fld = 88448125 * var2;
		}
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

				var6 = this.ac_fld;
			}

			boolean var7 = false;
			if (this.at_fld != var6 || var4) {
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

			this.am(var1, var2, var3, -656860088);
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ax(int var1) {
		return null == this.ac_fld ? -1 : this.aj_fld.ai(-143778459);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lgf;"
	)
	public gf an(int var1) {
		return this.ac_fld;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Lwl;Lgf;)V"
	)
	public static void dt(wl var0, gf var1) throws EOFException {
		try {
			if (null == var0.aj_fld || var0.aj_fld != var1) {
				sb(var0, var1, (byte)1);
				var0.am(-1, -1, -1, -656860088);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "(Lwl;Lgf;B)V"
	)
	public static void sb(wl var0, gf var1, byte var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.aj_fld = var1;
				var0.bm_fld = new gd(var0.ab_fld, var0.ap_fld, var0.aq_fld, var0.am_fld);
				var0.bd_fld.ak(var0.aj_fld);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean cd(int var1, int var2) {
		return !this.cd_fld.contains(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIID)V"
	)
	public void ad(int var1, int var2, int var3, int var4, int var5, double var6) {
		try {
			int[] var8 = new int[4];
			yu.fx(var8);
			yu.fa(var1, var2, var1 + var3, var4 + var2);
			int var9 = this.bd_fld.ae();
			if (var9 < 100) {
				this.ac(var1, var2, var3, var4, var9, (short)-29336);
			} else {
				if (!this.bm_fld.ay(1113331811)) {
					this.bm_fld.ak(this.aq_fld, this.ac_fld, client.al_boolean, -959885383);
					if (!this.bm_fld.ay(442995491)) {
						return;
					}
				}

				int var11 = this.bm_fld.as((byte)1);
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
				yu.fl(var1, var2, var3, var4, var10);
				if (this.cv_fld != null) {
					this.bg_fld = this.ca_fld + -1073330557;
					if (0 == this.bv_fld % this.bs_fld) {
						this.cg_fld = 0;
						this.bf_fld = this.br_fld + -593545683;
					}

					if (this.cf_fld >= this.cf_fld && !this.bb_fld) {
						this.cc_fld = null;
					}
				}

				int var13 = (int)Math.ceil(var3 / this.bk_fld);
				int var24 = (int)Math.ceil(var4 / this.bk_fld);
				double var15 = fc.bo();
				this.bm_fld
					.az(this.cn_fld - var13 / 2, this.cf_fld - var24 / 2, this.bg_fld + var13 / 2, this.be_fld + var24 / 2, var1, var2, var1 + var3, var4 + var2, -192876448);
				if (!this.bp_fld) {
					boolean var17 = false;
					if (var5 - this.bz_fld > 100) {
						this.bw_fld = 141109177 * var5;
						var17 = true;
					}

					this.bm_fld
						.av(
							this.cr_fld - var13 / 2,
							this.bc_fld - var24 / 2,
							var13 / 2 + this.bc_fld,
							var24 / 2 + this.bx_fld,
							var1,
							var2,
							var1 + var3,
							var2 + var4,
							this.cq_fld,
							this.cc_fld,
							this.br_fld * -9652181,
							-803309005 * this.bq_fld,
							var17,
							568447311
						);
				}

				this.ap(var1, var2, var3, var4, var13, var24, (byte)119);
				boolean var26 = client.to_int >= 2;
				if (var26 && this.an_fld && this.cp_fld != null) {
					zv.uj(this.ad_fld, "Coord: " + this.cp_fld, 10 + yu.au_fld, 20 + yu.au_fld, 16776960, -1);
				}

				this.bw_fld = -2099249963 * var13;
				this.by_fld = var24 * 1631920613;
				this.bc_fld = var1 * 1545167529;
				this.bn_fld = var2 * -1412529775;
				yu.fb(var8);
				if (var15 != fc.bx()) {
					fc.bs(var15);
				}
			}
		} catch (Throwable var21) {
			throw new RuntimeException(var21);
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIIIS)V"
	)
	public static void ji(wl var0, int var1, int var2, int var3, int var4, short var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.bd_fld.av()) {
				if (!var0.bm_fld.ay(1604475992)) {
					var0.bm_fld.ak(var0.ai_fld, var0.aj_fld, client.ct_fld, -2062558696);
					if (!var0.bm_fld.ay(1033816324)) {
						return;
					}
				}

				gd.ww(var0.bm_fld, var1, var2, var3, var4, var0.bt_fld, var0.bi_fld, var0.bo_fld, 1564527261);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean cc(int var1, int var2) {
		return !this.bt_fld.contains(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z"
	)
	boolean ab(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.ce_fld == null) {
			return true;
		} else if (this.ce_fld.ao_fld == var1 && this.ce_fld.as_fld == var2) {
			if (this.bm_fld.av_fld * 253584221 != this.bv_fld) {
				return true;
			} else if (client.wo_fld != this.cg_fld) {
				return true;
			} else {
				return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var4 + var2 < var6 : true;
			}
		} else {
			return true;
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
					this.bm_fld.ak(this.ai_fld, this.at_fld, client.im_fld, -2062558696);
					if (!this.bm_fld.ay(1033816324)) {
						return;
					}
				}

				gd.ww(this.bm_fld, var1, var2, var3, var4, this.bt_fld, this.bx_fld * -9652181, -803309005 * this.cn_fld, 1564527261);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bh(int var1, int var2, int var3) {
		if (null != this.at_fld) {
			this.ay(var1 - this.at_fld.ay(1322558909) * 64, var2 - this.aj_fld.ay(-1300508363) * 64, true, -2052993176);
			this.bc_fld = 881914049;
			this.cn_fld = 71648777;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bj(int var1, int var2, int var3, int var4) {
		if (this.at_fld == null) {
			if (var4 != 2044118889) {
				;
			}
		} else {
			int[] var5 = this.at_fld.ae(var1, var2, var3, 2081577648);
			if (null != var5) {
				mb(this, var5[0], var5[1]);
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int bf(byte var1) {
		return this.bw_fld;
	}

	@ObfuscatedName("xw")
	@ObfuscatedSignature(
		descriptor = "(Lwl;IIZJ)V"
	)
	public static void xw(wl var0, int var1, int var2, boolean var3, long var4) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var0.aj_fld) {
			int var6 = (int)(var0.bz_fld + (var1 - var0.by_fld - var0.bx(582850144) * var0.bk_fld / 2.0F) / var0.bk_fld);
			int var7 = (int)(var0.br_fld - (var2 - var0.bl_fld - ag(var0, (byte)-65) * var0.bk_fld / 2.0F) / var0.bk_fld);
			var0.cp_fld = gf.pk(var0.aj_fld, var6 + var0.aj_fld.an(1193001203) * 64, var7 + var0.aj_fld.ai(-657231278) * 64, (byte)-1);
			if (null != var0.cp_fld && var3) {
				fi var8 = iq.ay();
				boolean var9 = client.jl_fld >= 2;
				if (var9 && var8.ay(82) && var8.ay(81)) {
					bu.he(-621797759 * var0.cp_fld.ag_fld, var0.cp_fld.az_fld * 1479124089, var0.cp_fld.ak_fld * 1846813669, false);
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
						jm var13 = gi.ak(jb.dz_fld, client.aq_fld.av_fld);
						var13.ay_fld.ea(kj.bk(var0.cp_fld, 1278196553));
						client.aq_fld.az(var13);
						var0.ba_fld = 0L;
					}
				}
			}
		} else {
			var0.cp_fld = null;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	public void bi(short var1) {
		this.by_fld = 702894342;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bw(int var1) {
		if (!this.ar(56564401)) {
			if (var1 != -282914073) {
				;
			}
		} else {
			int var2 = this.bc_fld - this.bi_fld;
			int var3 = this.br_fld - this.bc_fld;
			if (0 != var2) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			if (var3 != 0) {
				var3 /= Math.min(8, Math.abs(var3));
			}

			this.ay(var2 + this.bu_fld, var3 + this.br_fld, true, 183486541);
			if (this.bx_fld == this.cr_fld && this.bs_fld == this.bw_fld) {
				if (var1 == -282914073) {
					return;
				}

				this.bu_fld = 881914049;
				this.bc_fld = 71648777;
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IZI)V"
	)
	public void ba(int var1, boolean var2, int var3) {
		if (!var2) {
			this.cv_fld.add(var1);
		} else {
			this.aa_fld.remove(var1);
		}

		this.cq(1148861988);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lgf;B)V"
	)
	void ai(gf var1, byte var2) {
		try {
			this.ac_fld = var1;
			this.bm_fld = new gd(this.ab_fld, this.ap_fld, this.aq_fld, this.aq_fld);
			this.bd_fld.ak(this.aj_fld);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IZB)V"
	)
	public void bq(int var1, boolean var2, byte var3) {
		if (!var2) {
			this.cd_fld.add(var1);
		} else {
			this.aa_fld.remove(var1);
		}

		for (int var4 = 0; var4 < pc.ag_fld; var4++) {
			if (uh.ak(var4) == null) {
				if (var3 >= 1) {
					return;
				}
			} else if (uh.ak(var4).af_fld * -1108351195 == var1) {
				int var5 = uh.ak(var4).ah_fld * -2065753697;
				if (!var2) {
					this.cc_fld.add(var5);
				} else {
					this.bt_fld.remove(var5);
				}
			}
		}

		this.aw(1148861988);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ao(byte var1) {
		ga.ae_fld.am();
	}

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "(Lwl;B)V"
	)
	public static void th(wl var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		ga.ae_fld.aw();
	}

	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int qm() {
		return this.bl_fld;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ek(int var1) {
		this.bk_fld = this.aj(var1, -929420710);
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
			this.aq_fld = var3;
			this.ad_fld = var4;
			this.ap_fld = new HashMap();
			this.ao_fld.put(hb.ak_fld, var5.get(as_fld));
			this.ap_fld.put(hb.ag_fld, var5.get(aw_fld));
			this.ap_fld.put(hb.ag_fld, var5.get(aw_fld));
			this.bd_fld = new wt(var1);
			int var8 = aac.ak_fld > 237 ? hc.ag_fld.aw_fld : this.am_fld.cm(hc.az_fld.ah_fld, (byte)1);
			int[] var9 = this.am_fld.cp(var8, (byte)61);
			int var10 = var9 == null ? 0 : var9.length;
			this.ao_fld = new HashMap(var10);

			for (int var11 = 0; var11 < var10; var11++) {
				xi var12 = new xi(this.am_fld.cx(var8, var9[var11], 584982574));
				gf var13 = new gf();
				var13.ak(var12, var9[var11], (byte)65);
				this.ap_fld.put(gf.ms(var13, -1282102330), var13);
				if (gf.mn(var13, -1339751498)) {
					if (var7 != 1382466332) {
						return;
					}

					this.ac_fld = var13;
				}
			}

			this.aa(this.ac_fld, 1824227527);
			this.at_fld = null;
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eq() {
		return this.aj_fld == null ? -1 : this.be_fld + this.ac_fld.an(-799456322) * 64;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void bp(int var1, byte var2) {
		this.bk_fld = this.aj(var1, -812367652);
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "()Lhr;"
	)
	public hr gb() {
		if (this.cs_fld == null) {
			return null;
		} else {
			while (this.cs_fld.hasNext()) {
				hr var1 = (hr)(hr)this.cs_fld.next();
				if (var1.ag(1491536057) != -1) {
					return var1;
				}
			}

			return null;
		}
	}
}
