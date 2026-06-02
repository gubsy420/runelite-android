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
	@ObfuscatedGetter(
		intValue = -100075829
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = 1437702003
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -254598503
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = 411694563
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ag(xi var1) {
		int var3 = var1.cg();
		if (gb.ag_fld.az_fld != var3) {
			throw new IllegalStateException("");
		} else {
			this.ar_fld = var1.cg();
			this.af_fld = var1.cg();
			this.ah_fld = xi.tx(var1, 2060964339);
			this.aw_fld = xi.tx(var1, 2116151832);
			this.ak_fld = var1.cg();
			this.ag_fld = var1.cg();
			this.ay_fld = xi.tx(var1, 346533150);
			this.as_fld = xi.tx(var1, 1821697306);
			this.az_fld = var1.cg();
			this.av_fld = var1.cg();
			this.al_fld = var1.do_();
			this.au_fld = var1.do_();
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		return this.ay_fld | this.as_fld << 8 | this.az_fld << 16 | this.av_fld << 24;
	}

	gy() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	@Override
	void av(xi var1, byte var2) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];
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
			if (var4 == this.ay_fld && var5 == this.as_fld && var6 == this.az_fld && var7 == this.av_fld) {
				for (int var8 = 0; var8 < 8; var8++) {
					for (int var9 = 0; var9 < 8; var9++) {
						hi.hu(this, var8 + this.az_fld, this.av_fld + var9, var1);
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
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				hi.hu(this, var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof gy)) {
			return false;
		} else {
			gy var2 = (gy)var1;
			return var2.ay_fld == this.ay_fld && var2.as_fld == this.as_fld ? var2.az_fld == this.az_fld && var2.av_fld == this.av_fld : false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void au(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4) * 1060027432;
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][-1862283182][64];
		this.an_fld = new byte[this.af_fld][1949322071][206906565];
		this.aa_fld = new byte[this.af_fld * -502329001][64][64];
		this.ai_fld = new ge[this.af_fld][-831293624][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				hi.hu(this, var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ae() {
		return this.ak_fld;
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Lgy;B)I"
	)
	public static int wk(gy var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ak(xi var1) {
		int var3 = var1.cg();
		if (var3 != gb.ag_fld.az_fld) {
			byte var2;
			if (false) {
				throw new IllegalStateException("");
			}
		} else {
			this.ar_fld = var1.cg();
			this.af_fld = var1.cg();
			this.ah_fld = xi.tx(var1, 519222553);
			this.aw_fld = xi.tx(var1, 691310188);
			this.ak_fld = var1.cg();
			this.ag_fld = var1.cg();
			this.ay_fld = xi.tx(var1, 1894838390);
			this.as_fld = xi.tx(var1, 1586636974);
			this.az_fld = var1.cg();
			this.av_fld = var1.cg();
		}
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
			return var2.ay_fld == this.ay_fld && var2.as_fld == this.as_fld ? var2.az_fld == this.az_fld && var2.av_fld == this.av_fld : false;
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Lgy;)I"
	)
	public static int fg(gy var0) {
		return var0.az_fld;
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
			return var2.ay_fld == this.ay_fld && var2.as_fld == this.as_fld ? var2.az_fld == this.az_fld && var2.av_fld == this.av_fld : false;
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
			return var2.ay_fld == this.ay_fld && var2.as_fld == this.as_fld ? var2.az_fld == this.az_fld && var2.av_fld == this.av_fld : false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ar(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				hi.hu(this, var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void al(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				hi.hu(this, var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.ak_fld;
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return this.ay_fld | this.as_fld << 8 | this.az_fld << 16 | this.av_fld << 24;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void an(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];
		int var2 = var1.cg();
		if (var2 != gx.ag_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.cg();
			int var4 = var1.cg();
			int var5 = var1.cg();
			int var6 = var1.cg();
			if (var3 == this.ay_fld && var4 == this.as_fld && var5 == this.az_fld && var6 == this.av_fld) {
				for (int var7 = 0; var7 < 8; var7++) {
					for (int var8 = 0; var8 < 8; var8++) {
						hi.hu(this, var7 + this.az_fld, this.av_fld + var8, var1);
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
		this.af_fld = Math.min(-1084657064 * this.af_fld, 4) * -1230025137;
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld * 1921144503][1258043458][-928274381];
		this.an_fld = new byte[-339265483 * this.af_fld][763400148][64];
		this.aa_fld = new byte[this.af_fld][-1563390519][-2079382533];
		this.ai_fld = new ge[1531388037 * this.af_fld][64][1590204841][];
		int var2 = var1.cg();
		if (var2 != gx.ag_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.cg();
			int var4 = var1.cg();
			int var5 = var1.cg();
			int var6 = var1.cg();
			if (var3 == this.ay_fld && var4 == this.as_fld && var5 == this.az_fld && var6 == this.av_fld) {
				for (int var7 = 0; var7 < 8; var7++) {
					for (int var8 = 0; var8 < 8; var8++) {
						hi.hu(this, var7 + this.az_fld, this.av_fld + var8, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;B)I"
	)
	public static int aw(gy var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lac;)Z"
	)
	public static boolean gd(ac var0) {
		return var0.al_fld != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ai(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4) * 1226534209;
		this.ae_fld = new short[1][-1495376120][83607743];
		this.ax_fld = new short[this.af_fld * 628275720][-1391995449][64];
		this.an_fld = new byte[this.af_fld][64][-1359830116];
		this.aa_fld = new byte[this.af_fld][1438314706][-170812861];
		this.ai_fld = new ge[this.af_fld][64][64][];
		int var2 = var1.cg();
		if (var2 != gx.ag_fld.az_fld) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.cg();
			int var4 = var1.cg();
			int var5 = var1.cg();
			int var6 = var1.cg();
			if (var3 == this.ay_fld && var4 == this.as_fld && var5 == this.az_fld && var6 == this.av_fld) {
				for (int var7 = 0; var7 < 8; var7++) {
					for (int var8 = 0; var8 < 8; var8++) {
						hi.hu(this, var7 + this.az_fld, this.av_fld + var8, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return this.ay_fld | this.as_fld << 8 | this.az_fld << 16 | this.av_fld << 24;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.ay_fld | this.as_fld << 8 | this.az_fld << 16 | this.av_fld << 24;
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
			this.ar_fld = var1.cg() * 1963447619;
			this.af_fld = var1.cg() * 1370158764;
			this.ah_fld = xi.tx(var1, 381467173) * 54015826;
			this.aw_fld = xi.tx(var1, 654927590);
			this.ak_fld = var1.cg();
			this.ag_fld = var1.cg();
			this.ay_fld = xi.tx(var1, 1271601493);
			this.as_fld = xi.tx(var1, 572047831) * 1163373508;
			this.az_fld = var1.cg() * -2040991055;
			this.av_fld = var1.cg();
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bm() {
		return this.av_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int am() {
		return this.ak_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ad() {
		return this.ak_fld;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lgy;Lxi;)V"
	)
	public static void ll(gy var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var1.cg();
		if (gb.ag_fld.az_fld != var2) {
			throw new IllegalStateException("");
		} else {
			var0.ar_fld = var1.cg();
			var0.af_fld = var1.cg();
			var0.ah_fld = xi.tx(var1, 1601548325);
			var0.aw_fld = xi.tx(var1, 1783702992);
			var0.ak_fld = var1.cg();
			var0.ag_fld = var1.cg();
			var0.ay_fld = xi.tx(var1, 1401997359);
			var0.as_fld = xi.tx(var1, 1423953815);
			var0.az_fld = var1.cg();
			var0.av_fld = var1.cg();
			var0.al_fld = var1.do_();
			var0.au_fld = var1.do_();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void af(xi var1) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];

		for (int var2 = 0; var2 < 8; var2++) {
			for (int var3 = 0; var3 < 8; var3++) {
				hi.hu(this, var2 + this.az_fld, var3 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lgy;B)I"
	)
	public static int ms(gy var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		return this.ag_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ap() {
		return this.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void az(xi var1, int var2) {
		this.af_fld = Math.min(this.af_fld, 4);
		this.ae_fld = new short[1][64][64];
		this.ax_fld = new short[this.af_fld][64][64];
		this.an_fld = new byte[this.af_fld][64][64];
		this.aa_fld = new byte[this.af_fld][64][64];
		this.ai_fld = new ge[this.af_fld][64][64][];

		for (int var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				if (false) {
					return;
				}

				hi.hu(this, var3 + this.az_fld, var4 + this.av_fld, var1);
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bd() {
		return this.av_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;)I"
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
				long[] var10 = var0.ag();
				long[] var12 = var1.ag();

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
		descriptor = "()[Ljv;"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ah(byte var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ay(byte var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aq(xi var1) {
		int var2 = var1.dz();
		if (gb.ak_fld.az_fld != var2) {
			throw new IllegalStateException("");
		} else {
			super.ay_fld = var1.dz() * 1434151257;
			super.ar_fld = var1.cg();
			super.aw_fld = xi.tx(var1, 1601548325);
			super.af_fld = xi.tx(var1, 1783702992) * 655381533;
			this.ak_fld = var1.ei();
			this.av_fld = var1.em() * -14544471;
			super.aw_fld = xi.tx(var1, 1401997359) * 397839381;
			super.af_fld = xi.tx(var1, 1423953815) * 801361027;
			this.av_fld = var1.em() * 300049851;
			this.av_fld = var1.ei();
			super.ah_fld = var1.ec();
			super.al_fld = var1.dm() * 420613169;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int aw(byte var1) {
		return this.av_fld;
	}
}
