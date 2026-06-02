import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sn")
public class sn {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float as_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	sd av_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ar_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float aw_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ab_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float af_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ay_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float aa_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lsj;"
	)
	sj[] ae_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float au_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float al_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float an_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ax_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ai_fld = true;
	@ObfuscatedGetter(
		intValue = -1643290347
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] am_fld;
	@ObfuscatedGetter(
		intValue = -381878837
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedGetter(
		intValue = 885987249
	)
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ao_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	sd az_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ap_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bh_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(F)Lsj;"
	)
	sj bd(float var1) {
		int var2 = this.aw(var1);
		return var2 >= 0 && var2 < this.ae_fld.length ? this.ae_fld[var2] : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	int ak(xi var1, int var2) {
		int var4 = xi.tx(var1, 1604964136);
		int var5 = var1.cg();
		sv[] var6 = new sv[]{sv.ak_fld, sv.ag_fld, sv.az_fld, sv.av_fld, sv.ae_fld, sv.ah_fld, sv.aw_fld, sv.ay_fld, sv.as_fld};
		sv var7 = (sv)ka.ak(var6, var5);
		if (null == var7) {
			var7 = sv.as_fld;
		}

		this.az_fld = dz.az(var1.cg(), (byte)-18);
		this.av_fld = dz.az(var1.cg(), (byte)21);
		this.ak_fld = var1.cg() != 0;
		this.ae_fld = new sj[var4];
		sj var9 = null;

		for (int var11 = 0; var11 < var4; var11++) {
			sj var8 = new sj();
			var8.ak(var1, var2);
			this.ae_fld[var11] = var8;
			if (null != var9) {
				var9.aw_fld = var8;
			}

			var9 = var8;
		}

		return var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av() {
		return this.ad_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(F)I"
	)
	int aw(float var1) {
		if (this.aq_fld < 0
			|| !(this.ae_fld[this.aq_fld].ak_fld * 157988587 <= var1)
			|| this.ae_fld[this.aq_fld].aw_fld != null && !(this.ae_fld[this.aq_fld].aw_fld.ak_fld * 157988587 > var1)) {
			if (!(var1 < this.av()) && !(var1 > this.ae())) {
				int var3 = this.as();
				int var4 = this.aq_fld;
				if (var3 > 0) {
					int var5 = 0;
					int var6 = var3 - 1;

					do {
						int var7 = var6 + var5 >> 1;
						if (var1 < this.ae_fld[var7].ak_fld * 157988587) {
							if (var1 > this.ae_fld[var7 - 1].ak_fld * 157988587) {
								var4 = var7 - 1;
								break;
							}

							var6 = var7 - 1;
						} else {
							if (!(var1 > 157988587 * this.ae_fld[var7].ak_fld)) {
								var4 = var7;
								break;
							}

							if (var1 < 157988587 * this.ae_fld[1 + var7].ak_fld) {
								var4 = var7;
								break;
							}

							var5 = var7 + 1;
						}
					} while (var5 <= var6);
				}

				if (this.aq_fld != var4) {
					this.aq_fld = var4;
					this.ai_fld = true;
				}

				return this.aq_fld;
			} else {
				return -1;
			}
		} else {
			return this.aq_fld;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lsn;I)I"
	)
	public static int hl(sn var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ae() - var0.av();
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(F)Lsj;"
	)
	sj br(float var1) {
		int var2 = this.aw(var1);
		return var2 >= 0 && var2 < this.ae_fld.length ? this.ae_fld[var2] : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int as() {
		return null == this.ae_fld ? 0 : this.ae_fld.length;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	int ar(xi var1, int var2) {
		int var3 = xi.tx(var1, 1462713370);
		int var4 = var1.cg();
		sv[] var5 = new sv[]{sv.ak_fld, sv.ag_fld, sv.az_fld, sv.av_fld, sv.ae_fld, sv.ah_fld, sv.aw_fld, sv.ay_fld, sv.as_fld};
		sv var6 = (sv)ka.ak(var5, var4);
		if (null == var6) {
			var6 = sv.as_fld;
		}

		this.az_fld = dz.az(var1.cg(), (byte)29);
		this.av_fld = dz.az(var1.cg(), (byte)-32);
		this.ak_fld = var1.cg() != 0;
		this.ae_fld = new sj[var3];
		sj var8 = null;

		for (int var10 = 0; var10 < var3; var10++) {
			sj var7 = new sj();
			var7.ak(var1, var2);
			this.ae_fld[var10] = var7;
			if (null != var8) {
				var8.aw_fld = var7;
			}

			var8 = var7;
		}

		return var3;
	}

	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "(Lsn;F)Lsj;"
	)
	public static sj sh(sn var0, float var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var0.aw(var1);
		return var2 >= 0 && var2 < var0.ae_fld.length ? var0.ae_fld[var2] : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void au() {
		this.ad_fld = this.ae_fld[0].ak_fld;
		this.ao_fld = this.ae_fld[this.as() - 1].ak_fld;
		this.am_fld = new float[hl(this, -1773066626) + 1];

		for (int var1 = this.av(); var1 <= this.ae(); var1++) {
			this.am_fld[var1 - this.av()] = dr.ak(this, var1);
		}

		this.ae_fld = null;
		this.ab_fld = dr.ak(this, this.av() - 1);
		this.ap_fld = dr.ak(this, this.ae() + 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.ad_fld = this.ae_fld[0].ak_fld;
		this.ao_fld = this.ae_fld[this.as() - 1].ak_fld;
		this.am_fld = new float[hl(this, 1258112541) + 1];

		for (int var2 = this.av(); var2 <= this.ae(); var2++) {
			this.am_fld[var2 - this.av()] = dr.ak(this, var2);
		}

		this.ae_fld = null;
		this.ab_fld = dr.ak(this, this.av() - 1);
		this.ap_fld = dr.ak(this, this.ae() + 1);
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lgn;)I"
	)
	public static int kr(gn var0) {
		return var0.bx_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ax() {
		this.ad_fld = this.ae_fld[0].ak_fld;
		this.ao_fld = this.ae_fld[this.as() - 1].ak_fld;
		this.am_fld = new float[hl(this, -61841188) + 1];

		for (int var1 = this.av(); var1 <= this.ae(); var1++) {
			this.am_fld[var1 - this.av()] = dr.ak(this, var1);
		}

		this.ae_fld = null;
		this.ab_fld = dr.ak(this, this.av() - 1);
		this.ap_fld = dr.ak(this, this.ae() + 1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	public float aa(int var1) {
		if (var1 < this.av()) {
			return this.ab_fld;
		} else {
			return var1 > this.ae() ? this.ap_fld : this.am_fld[var1 - this.av()];
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aq() {
		return this.ad_fld;
	}

	sn() {
	}

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "(Lsn;)I"
	)
	public static int ws(sn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ae() - var0.av();
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lsn;)V"
	)
	public static void ja(sn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ad_fld = var0.ae_fld[0].ak_fld;
		var0.ao_fld = var0.ae_fld[var0.as() - 1].ak_fld * -484432024;
		var0.am_fld = new float[hl(var0, -1251080431) + 1];

		for (int var1 = var0.av(); var1 <= var0.ae(); var1++) {
			var0.am_fld[var1 - var0.av()] = dr.ak(var0, var1);
		}

		var0.ae_fld = null;
		var0.ab_fld = dr.ak(var0, var0.av() - 1);
		var0.ap_fld = dr.ak(var0, var0.ae() + 1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void an() {
		this.ad_fld = this.ae_fld[0].ak_fld;
		this.ao_fld = this.ae_fld[this.as() - 1].ak_fld * -755152344;
		this.am_fld = new float[hl(this, 1270526723) + 1];

		for (int var1 = this.av(); var1 <= this.ae(); var1++) {
			this.am_fld[var1 - this.av()] = dr.ak(this, var1);
		}

		this.ae_fld = null;
		this.ab_fld = dr.ak(this, this.av() - 1);
		this.ap_fld = dr.ak(this, this.ae() + 1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ap() {
		return this.ae() - this.av();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(F)Lsj;"
	)
	sj bm(float var1) {
		int var2 = this.aw(var1);
		return var2 >= 0 && var2 < this.ae_fld.length ? this.ae_fld[var2] : null;
	}

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(Lsn;)I"
	)
	public static int xi(sn var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ae() - var0.av();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(F)I"
	)
	int ac(float var1) {
		if (this.aq_fld < 0
			|| !(this.ae_fld[this.aq_fld].ak_fld * 157988587 <= var1)
			|| this.ae_fld[this.aq_fld].aw_fld != null && !(this.ae_fld[this.aq_fld].aw_fld.ak_fld * 157988587 > var1)) {
			if (!(var1 < this.av()) && !(var1 > this.ae())) {
				int var2 = this.as();
				int var3 = 731637000 * this.aq_fld;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < this.ae_fld[var6].ak_fld * -1604537877) {
							if (var1 > this.ae_fld[var6 - 1].ak_fld * -1738742708) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (!(var1 > -689566225 * this.ae_fld[var6].ak_fld)) {
								var3 = var6;
								break;
							}

							if (var1 < -1925348557 * this.ae_fld[1 + var6].ak_fld) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while (var4 <= var5);
				}

				if (this.aq_fld != var3) {
					this.aq_fld = var3 * -1713863845;
					this.ai_fld = true;
				}

				return this.aq_fld;
			} else {
				return -1;
			}
		} else {
			return this.aq_fld;
		}
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lsn;I)F"
	)
	public static float uc(sn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < var0.av()) {
			return var0.ab_fld;
		} else {
			return var1 > var0.ae() ? var0.ap_fld : var0.am_fld[var1 - var0.av()];
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ad() {
		return this.ao_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ae() {
		return this.ao_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(F)Lsj;"
	)
	sj ay(float var1) {
		int var3 = this.aw(var1);
		return var3 >= 0 && var3 < this.ae_fld.length ? this.ae_fld[var3] : null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(F)Lsj;"
	)
	sj bz(float var1) {
		int var2 = this.aw(var1);
		return var2 >= 0 && var2 < this.ae_fld.length ? this.ae_fld[var2] : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(F)I"
	)
	int at(float var1) {
		if (this.aq_fld < 0
			|| !(this.ae_fld[this.aq_fld].ak_fld * 157988587 <= var1)
			|| this.ae_fld[this.aq_fld].aw_fld != null && !(this.ae_fld[this.aq_fld].aw_fld.ak_fld * 157988587 > var1)) {
			if (!(var1 < this.av()) && !(var1 > this.ae())) {
				int var2 = this.as();
				int var3 = this.aq_fld;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < this.ae_fld[var6].ak_fld * 157988587) {
							if (var1 > this.ae_fld[var6 - 1].ak_fld * 157988587) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (!(var1 > 157988587 * this.ae_fld[var6].ak_fld)) {
								var3 = var6;
								break;
							}

							if (var1 < 157988587 * this.ae_fld[1 + var6].ak_fld) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while (var4 <= var5);
				}

				if (this.aq_fld != var3) {
					this.aq_fld = var3;
					this.ai_fld = true;
				}

				return this.aq_fld;
			} else {
				return -1;
			}
		} else {
			return this.aq_fld;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bs() {
		return null == this.ae_fld ? 0 : this.ae_fld.length;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)F"
	)
	public float az(int var1, int var2) {
		if (var1 < this.av()) {
			return this.ar_fld;
		} else {
			return var1 > this.ae() ? this.ax_fld : this.am_fld[var1 - this.av()];
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ah(int var1) {
		return this.ae() - this.av();
	}

	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "(Lsn;)V"
	)
	public static void qb(sn var0) {
		var0.ad_fld = var0.ae_fld[0].ak_fld;
		var0.ao_fld = var0.ae_fld[var0.as() - 1].ak_fld;
		var0.am_fld = new float[hl(var0, -702504720) + 1];

		for (int var1 = var0.av(); var1 <= var0.ae(); var1++) {
			var0.am_fld[var1 - var0.av()] = dr.ak(var0, var1);
		}

		var0.ae_fld = null;
		var0.ab_fld = dr.ak(var0, var0.av() - 1);
		var0.ap_fld = dr.ak(var0, var0.ae() + 1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void af() {
		this.ad_fld = this.ae_fld[0].ak_fld;
		this.ad_fld = this.ae_fld[this.as() - 1].ak_fld * -484432024;
		this.am_fld = new float[hl(this, -1251080431) + 1];

		for (int var1 = this.av(); var1 <= this.ah(1216109596); var1++) {
			this.am_fld[var1 - this.av()] = dr.ak(this, var1);
		}

		this.ae_fld = null;
		this.au_fld = dr.ak(this, this.av() - 1);
		this.af_fld = dr.ak(this, this.as() + 1);
	}

	@ObfuscatedName("ys")
	@ObfuscatedSignature(
		descriptor = "(Lsn;I)F"
	)
	public static float ys(sn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < var0.av()) {
			return var0.ab_fld;
		} else {
			return var1 > var0.ae() ? var0.ap_fld : var0.am_fld[var1 - var0.av()];
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	public float ai(int var1) {
		if (var1 < this.av()) {
			return this.af_fld;
		} else {
			return var1 > this.ah(-919401540) ? this.ap_fld : this.am_fld[var1 - this.av()];
		}
	}
}
