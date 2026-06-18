import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gy")
public class gy extends hi {
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ch_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -100075829
	)
	int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1437702003
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -254598503
	)
	int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 411694563
	)
	int av_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ag(xi var1) {
		int var3 = var1.cg();
		if (gb.ag_fld.az_fld != var3) {
			throw new IllegalStateException("");
		} else {
			this.aw_fld = var1.cg();
			this.al_fld = var1.cg();
			this.au_fld = var1.cm();
			this.ay_fld = var1.cm();
			this.ak_fld = var1.cg();
			this.ag_fld = var1.cg();
			this.ah_fld = var1.cm();
			this.af_fld = var1.cm();
			this.az_fld = var1.cg();
			this.av_fld = var1.cg();
			this.ar_fld = xi.kt(var1, (byte)-77);
			this.as_fld = xi.kt(var1, (byte)-11);
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		return this.ah_fld | this.af_fld << 8 | this.az_fld << 16 | this.av_fld << 24;
	}

	gy() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	@Override
	void av(xi var1, byte var2) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];
		int var3 = var1.cg();
		if (var3 != gx.ag_fld.az_fld) {
			if (var2 < 3) {
				throw new IllegalStateException("");
			}
		} else {
			int var4 = var1.cg();
			int var5 = var1.cg();
			int var6 = var1.cg();
			int var7 = var1.cg();
			if (var4 == this.ah_fld && var5 == this.af_fld && var6 == this.az_fld && var7 == this.av_fld) {
				for (int var8 = 0; var8 < 8; var8++) {
					for (int var9 = 0; var9 < 8; var9++) {
						this.bh(var8 + this.az_fld, this.av_fld + var9, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ax(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				this.bh(var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof gy)) {
			return false;
		} else {
			gy var2 = (gy)var1;
			return var2.ah_fld == this.ah_fld && var2.af_fld == this.af_fld ? var2.az_fld == this.az_fld && var2.av_fld == this.av_fld : false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void au(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4) * 1060027432;
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][-1862283182][64];
		this.an_fld = new byte[this.al_fld][1949322071][206906565];
		this.aa_fld = new byte[this.al_fld * -502329001][64][64];
		this.ai_fld = new ge[this.al_fld][-831293624][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				this.bh(var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ae() {
		return this.ak_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ah() {
		return this.ag_fld;
	}

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "(Lyl;I)[Ljava/lang/Object;"
	)
	public static Object[] yb(yl var0, int var1) {
		return (Object[])(null == var0.az_fld ? null : var0.az_fld[var1]);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ak(xi var1) {
		int var3 = var1.cg();
		if (var3 != gb.ag_fld.az_fld) {
			byte var2;
			if (false) {
				throw new IllegalStateException("");
			}
		} else {
			this.aw_fld = var1.cg();
			this.al_fld = var1.cg();
			this.au_fld = var1.cm();
			this.ay_fld = var1.cm();
			this.ak_fld = var1.cg();
			this.ag_fld = var1.cg();
			this.ah_fld = var1.cm();
			this.af_fld = var1.cm();
			this.az_fld = var1.cg();
			this.av_fld = var1.cg();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ay() {
		return this.av_fld;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (!(var1 instanceof gy)) {
			return false;
		} else {
			gy var2 = (gy)var1;
			return var2.ah_fld == this.ah_fld && var2.af_fld == this.af_fld ? var2.az_fld == this.az_fld && var2.av_fld == this.av_fld : false;
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (!(var1 instanceof gy)) {
			return false;
		} else {
			gy var2 = (gy)var1;
			return var2.ah_fld == this.ah_fld && var2.af_fld == this.af_fld ? var2.az_fld == this.az_fld && var2.av_fld == this.av_fld : false;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		if (!(var1 instanceof gy)) {
			return false;
		} else {
			gy var2 = (gy)var1;
			return var2.ah_fld == this.ah_fld && var2.af_fld == this.af_fld ? var2.az_fld == this.az_fld && var2.av_fld == this.av_fld : false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ar(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				this.bh(var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aq(xi var1) {
		int var2 = var1.cg();
		if (gb.ag_fld.az_fld != var2) {
			throw new IllegalStateException("");
		} else {
			this.aw_fld = var1.cg();
			this.al_fld = var1.cg();
			this.au_fld = var1.cm();
			this.ay_fld = var1.cm();
			this.ak_fld = var1.cg();
			this.ag_fld = var1.cg();
			this.ah_fld = var1.cm();
			this.af_fld = var1.cm();
			this.az_fld = var1.cg();
			this.av_fld = var1.cg();
			this.ar_fld = xi.kt(var1, (byte)-73);
			this.as_fld = xi.kt(var1, (byte)-79);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void al(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				this.bh(var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bm() {
		return this.ak_fld;
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return this.ah_fld | this.af_fld << 8 | this.az_fld << 16 | this.av_fld << 24;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void an(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];
		int var2 = var1.cg();
		if (var2 != gx.ag_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.cg();
			int var4 = var1.cg();
			int var5 = var1.cg();
			int var6 = var1.cg();
			if (var3 == this.ah_fld && var4 == this.af_fld && var5 == this.az_fld && var6 == this.av_fld) {
				for (int var7 = 0; var7 < 8; var7++) {
					for (int var8 = 0; var8 < 8; var8++) {
						this.bh(var7 + this.az_fld, this.av_fld + var8, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void aa(xi var1) {
		this.al_fld = Math.min(-1084657064 * this.al_fld, 4) * -1230025137;
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld * 1921144503][1258043458][-928274381];
		this.an_fld = new byte[-339265483 * this.al_fld][763400148][64];
		this.aa_fld = new byte[this.al_fld][-1563390519][-2079382533];
		this.ai_fld = new ge[1531388037 * this.al_fld][64][1590204841][];
		int var2 = var1.cg();
		if (var2 != gx.ag_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.cg();
			int var4 = var1.cg();
			int var5 = var1.cg();
			int var6 = var1.cg();
			if (var3 == this.ah_fld && var4 == this.af_fld && var5 == this.az_fld && var6 == this.av_fld) {
				for (int var7 = 0; var7 < 8; var7++) {
					for (int var8 = 0; var8 < 8; var8++) {
						this.bh(var7 + this.az_fld, this.av_fld + var8, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ai(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4) * 1226534209;
		this.ae_fld = new short[1][-1495376120][83607743];
		this.ax_fld = new short[this.al_fld * 628275720][-1391995449][64];
		this.an_fld = new byte[this.al_fld][64][-1359830116];
		this.aa_fld = new byte[this.al_fld][1438314706][-170812861];
		this.ai_fld = new ge[this.al_fld][64][64][];
		int var2 = var1.cg();
		if (var2 != gx.ag_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.cg();
			int var4 = var1.cg();
			int var5 = var1.cg();
			int var6 = var1.cg();
			if (var3 == this.ah_fld && var4 == this.af_fld && var5 == this.az_fld && var6 == this.av_fld) {
				for (int var7 = 0; var7 < 8; var7++) {
					for (int var8 = 0; var8 < 8; var8++) {
						this.bh(var7 + this.az_fld, this.av_fld + var8, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.ah_fld | this.af_fld << 8 | this.az_fld << 16 | this.av_fld << 24;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int aw() {
		return this.az_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void as(xi var1) {
		int var2 = var1.cg();
		if (var2 != gb.ag_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			this.aw_fld = var1.cg() * 1963447619;
			this.al_fld = var1.cg() * 1370158764;
			this.au_fld = var1.cm() * 54015826;
			this.ay_fld = var1.cm();
			this.ak_fld = var1.cg();
			this.ag_fld = var1.cg();
			this.ah_fld = var1.cm();
			this.af_fld = var1.cm() * 1163373508;
			this.az_fld = var1.cg() * -2040991055;
			this.av_fld = var1.cg();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ac() {
		return this.av_fld;
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lgy;)I"
	)
	public static int ol(gy var0) {
		return var0.ah_fld | var0.af_fld << 8 | var0.az_fld << 16 | var0.av_fld << 24;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.ak_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void af(xi var1) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				this.bh(var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ap() {
		return this.ag_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int at() {
		return this.ag_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aj() {
		return this.az_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		return this.az_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ad() {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void az(xi var1, int var2) {
		this.al_fld = Math.min(this.al_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.al_fld][64][64];
		this.an_fld = new byte[this.al_fld][64][64];
		this.aa_fld = new byte[this.al_fld][64][64];
		this.ai_fld = new ge[this.al_fld][64][64][];

		for (int var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				if (false) {
					return;
				}

				this.bh(var3 + this.az_fld, var4 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;I)I"
	)
	public static int ak(sl var0, sl var1) {
		if (var0 == var1) {
			return 0;
		} else if (var0 == null) {
			return -1;
		} else if (var1 == null) {
			return 1;
		} else {
			int var3 = var0.av();
			int var4 = var1.av();
			int var5 = Math.min(var3, var4);
			if (yq.ak_fld == var0.ag_fld && yq.ak_fld == var1.ag_fld) {
				int[] var11 = var0.ak();
				int[] var13 = var1.ak();

				for (int var15 = 0; var15 < var5; var15++) {
					if (var11[var15] < var13[var15]) {
						return -1;
					}

					if (var11[var15] > var13[var15]) {
						return 1;
					}
				}
			} else if (var0.ag_fld == yq.ag_fld && var1.ag_fld == yq.ag_fld) {
				long[] var10 = sl.ob(var0, 948608140);
				long[] var12 = sl.ob(var1, 863395644);

				for (int var14 = 0; var14 < var5; var14++) {
					if (var10[var14] < var12[var14]) {
						return -1;
					}

					if (var10[var14] > var12[var14]) {
						return 1;
					}
				}
			} else {
				if (yq.az_fld != var0.ag_fld || var1.ag_fld != yq.az_fld) {
					throw new RuntimeException();
				}

				Object[] var6 = (Object[])var0.az();
				Object[] var7 = (Object[])var1.az();

				for (int var8 = 0; var8 < var5; var8++) {
					int var9 = ((String)var6[var8]).compareTo((String)var7[var8]);
					if (var9 < 0) {
						return -1;
					}

					if (var9 > 0) {
						return 1;
					}
				}
			}

			return var3 < var4 ? -1 : (var3 == var4 ? 0 : 1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)[Ljv;"
	)
	public static jv[] ak() {
		return new jv[]{
			jv.ak_fld,
			jv.ag_fld,
			jv.az_fld,
			jv.av_fld,
			jv.ae_fld,
			jv.ah_fld,
			jv.aw_fld,
			jv.ay_fld,
			jv.as_fld,
			jv.ar_fld,
			jv.af_fld,
			jv.al_fld,
			jv.au_fld,
			jv.ax_fld,
			jv.an_fld,
			jv.aa_fld,
			jv.ai_fld,
			jv.aq_fld,
			jv.am_fld,
			jv.ad_fld,
			jv.ao_fld,
			jv.ab_fld,
			jv.ap_fld,
			jv.at_fld,
			jv.ac_fld,
			jv.aj_fld,
			jv.bm_fld,
			jv.bd_fld,
			jv.bz_fld,
			jv.br_fld,
			jv.be_fld,
			jv.bs_fld,
			jv.bh_fld,
			jv.bk_fld,
			jv.bj_fld,
			jv.bf_fld,
			jv.by_fld,
			jv.bl_fld,
			jv.bx_fld,
			jv.bo_fld,
			jv.bp_fld,
			jv.bt_fld,
			jv.bv_fld,
			jv.bi_fld,
			jv.bu_fld,
			jv.bn_fld,
			jv.bc_fld,
			jv.bw_fld,
			jv.ba_fld,
			jv.bq_fld,
			jv.bg_fld,
			jv.bb_fld,
			jv.cd_fld,
			jv.cc_fld,
			jv.cq_fld,
			jv.cv_fld,
			jv.cy_fld,
			jv.cf_fld,
			jv.cx_fld,
			jv.cs_fld,
			jv.cp_fld,
			jv.ce_fld,
			jv.cn_fld,
			jv.cr_fld,
			jv.ca_fld,
			jv.cg_fld,
			jv.cw_fld,
			jv.cm_fld,
			jv.cz_fld,
			jv.ck_fld,
			jv.cb_fld,
			jv.co_fld,
			jv.cu_fld,
			jv.ci_fld,
			jv.cj_fld,
			jv.ch_fld,
			jv.ct_fld,
			jv.cl_fld,
			jv.dc_fld,
			jv.dh_fld,
			jv.dv_fld,
			jv.dz_fld,
			jv.dt_fld,
			jv.dm_fld,
			jv.dq_fld,
			jv.do_fld,
			jv.dd_fld,
			jv.dl_fld,
			jv.dr_fld,
			jv.da_fld,
			jv.dk_fld,
			jv.dx_fld,
			jv.ds_fld,
			jv.du_fld,
			jv.db_fld,
			jv.dg_fld,
			jv.dw_fld,
			jv.dy_fld,
			jv.di_fld,
			jv.dn_fld,
			jv.df_fld,
			jv.de_fld,
			jv.dp_fld,
			jv.dj_fld,
			jv.es_fld,
			jv.ep_fld,
			jv.eb_fld,
			jv.ed_fld,
			jv.et_fld,
			jv.ew_fld,
			jv.ex_fld,
			jv.eo_fld,
			jv.ec_fld,
			jv.ez_fld,
			jv.er_fld,
			jv.en_fld,
			jv.eg_fld,
			jv.ef_fld,
			jv.eq_fld,
			jv.ei_fld,
			jv.ee_fld,
			jv.ek_fld,
			jv.ea_fld,
			jv.ev_fld,
			jv.ey_fld,
			jv.em_fld,
			jv.el_fld,
			jv.eh_fld,
			jv.eu_fld,
			jv.ej_fld,
			jv.fy_fld,
			jv.fa_fld,
			jv.fo_fld,
			jv.fp_fld,
			jv.fx_fld,
			jv.fv_fld,
			jv.fj_fld,
			jv.fb_fld,
			jv.fk_fld
		};
	}
}
