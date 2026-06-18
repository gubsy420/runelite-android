import java.io.EOFException;
import net.runelite.api.Rasterizer;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fh")
public abstract class fh extends yu {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lnet/runelite/api/Rasterizer;"
	)
	public static Rasterizer pj_fld = new rl13();
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld = 0;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld = false;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] as_fld = fc.az_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	fo ar_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	void ay(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		byte var13 = this.ar_fld.au_fld.ae_fld;
		if (var13 > 0) {
			byte var14 = this.ar_fld.au_fld.ag_fld;
			byte var15 = this.ar_fld.au_fld.az_fld;
			byte var16 = this.ar_fld.au_fld.av_fld;
			var10 = ak(var10, var14, var15, var16, var13);
			var11 = ak(var11, var14, var15, var16, var13);
			var12 = ak(var12, var14, var15, var16, var13);
		}

		this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	public static void fj(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		fc.ab(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IBBBB)I"
	)
	static int ak(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63;
		int var6 = var0 >> 7 & 7;
		int var7 = var0 & 127;
		int var8 = var4 & 255;
		if (var1 != -1) {
			var5 += (var1 - var5) * var8 >> 7;
		}

		if (var2 != -1) {
			var6 += (var2 - var6) * var8 >> 7;
		}

		if (var3 != -1) {
			var7 += (var3 - var7) * var8 >> 7;
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ag(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int az() {
		return aw_fld;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Lfh;FFFFFFFFFIII)V"
	)
	public static void df(
		fh var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
	) {
		byte var13 = var0.ar_fld.au_fld.ae_fld;
		if (var13 > 0) {
			byte var14 = var0.ar_fld.au_fld.ag_fld;
			byte var15 = var0.ar_fld.au_fld.az_fld;
			byte var16 = var0.ar_fld.au_fld.av_fld;
			var10 = ak(var10, var14, var15, var16, var13);
			var11 = ak(var11, var14, var15, var16, var13);
			var12 = ak(var12, var14, var15, var16, var13);
		}

		var0.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void bm(int var0) {
		int var1 = var0 * 327471793;
		av(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ae(int var0) {
		int var1 = var0 * 210;
		av(var1);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	void bk(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		byte var13 = this.ar_fld.au_fld.ae_fld;
		if (var13 > 0) {
			byte var14 = this.ar_fld.au_fld.ag_fld;
			byte var15 = this.ar_fld.au_fld.az_fld;
			byte var16 = this.ar_fld.au_fld.av_fld;
			var10 = ak(var10, var14, var15, var16, var13);
			var11 = ak(var11, var14, var15, var16, var13);
			var12 = ak(var12, var14, var15, var16, var13);
		}

		this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void kf(int var0, int var1, int var2, int var3, int var4, int var5) {
		yu.dp(var0, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	void bh(int[] var1, int var2, int var3, float[] var4) {
		du(var1, var2, var3, var4);
	}

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void uz() {
		fc.ai();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void av(int var0) {
		aw_fld = var0;
	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void qw() {
		et.qj_fld.lt();
	}

	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	public static void si(
		float var0,
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21
	) throws EOFException {
		try {
			fc.at(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
		} catch (Throwable var23) {
			throw new RuntimeException(var23);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	abstract void bt(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	abstract void af(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	abstract void bx(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	public static void ir(int var0, int var1, int var2, int var3, int var4, int var5) {
		yu.et(var0, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lfh;FFFFFFFFFI)V"
	)
	public static void hn(fh var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		if (var0 == null) {
			var0.getClass();
		}

		byte var11 = var0.ar_fld.au_fld.ae_fld;
		if (var11 > 0) {
			int var12 = ak(var10, var0.ar_fld.au_fld.ag_fld, var0.ar_fld.au_fld.az_fld, var0.ar_fld.au_fld.av_fld, var0.ar_fld.au_fld.ae_fld);
			var10 = var0.as_fld[var12];
		}

		var0.af(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)V"
	)
	public static void hh(ev var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var2 += var0.qr_fld;
		var3 += var0.qr_fld;
		int var4 = var0.dj(var1, var2, var3);
		if (var0.hz(var4)) {
			en var5 = var0.oy_fld[var4];
			var0.oy_fld[var4] = null;
			var0.pg_fld[var4] = var0.pg_fld[var4] & -12289;
			rl17 var6 = var0.rx_fld[var2 >> 3][var3 >> 3];
			var6.ol_fld.remove(var5);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	abstract void bl(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IBBBB)I"
	)
	static int ax(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63;
		int var6 = var0 >> 7 & 7;
		int var7 = var0 & 127;
		int var8 = var4 & 255;
		if (var1 != -1) {
			var5 += (var1 - var5) * var8 >> 7;
		}

		if (var2 != -1) {
			var6 += (var2 - var6) * var8 >> 7;
		}

		if (var3 != -1) {
			var7 += (var3 - var7) * var8 >> 7;
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	abstract void bp(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int aa(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 1565325718) {
			var1 = -896941510;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ai(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void an(int var0, int var1, int var2, int var3) {
		yu.dg(var0, var1, var2, var3);
	}

	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void tm(int var0, int var1, int var2, int var3, int var4) {
		yu.ez(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void km(int var0, int var1, int var2, int var3) {
		yu.ew(var0, var1, var2, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int aq(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void ol(int var0, int var1, int var2, int var3, int var4) {
		yu.de(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int am(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int ad() {
		return aw_fld;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	public static void js(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		yu.ep(var0, var1, var2, var3, var4, var5, var6, var7);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int ao() {
		return aw_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ab(int var0) {
		aw_fld = var0;
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public static void lz(int var0, int var1, int var2, int var3) {
		yu.eo(var0, var1, var2, var3);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(F)F"
	)
	public static float hg(float var0) {
		var0 = (var0 - 75.0F) * 1.0100503F;
		return 1.0100503F + 150.75377F / var0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ap(int var0) {
		aw_fld = var0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void at(int var0) {
		aw_fld = var0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ac(int var0) {
		int var1 = var0 * 210;
		av(var1);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void kc() {
		yu.db();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void aj(int var0) {
		int var1 = var0 * 210;
		av(var1);
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void us(int var0, int var1, int var2, int var3, int var4) {
		yu.ec(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IBBBB)I"
	)
	static int an(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63;
		int var6 = var0 >> 7 & 7;
		int var7 = var0 & -472584951;
		int var8 = var4 & -499112380;
		if (var1 != -1) {
			var5 += (var1 - var5) * var8 >> 7;
		}

		if (var2 != -1) {
			var6 += (var2 - var6) * var8 >> 7;
		}

		if (var3 != -1) {
			var7 += (var3 - var7) * var8 >> 7;
		}

		return (var5 << 10 | var6 << 7 | var7) & 1589432899;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void bd(int var0) {
		int var1 = var0 * 888370875;
		av(var1);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void bz(int var0) {
		int var1 = var0 * 210;
		av(var1);
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean je() {
		return this.ah();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	abstract void bv(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	abstract boolean be();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	void aw(int[] var1, int var2, int var3, float[] var4) {
		du(var1, var2, var3, var4);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([III[F)V"
	)
	void bs(int[] var1, int var2, int var3, float[] var4) {
		du(var1, var2, var3, var4);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	abstract void bu(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) throws EOFException;

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	void bj(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		byte var13 = this.ar_fld.au_fld.ae_fld;
		if (var13 > 0) {
			byte var14 = this.ar_fld.au_fld.ag_fld;
			byte var15 = this.ar_fld.au_fld.az_fld;
			byte var16 = this.ar_fld.au_fld.av_fld;
			var10 = ak(var10, var14, var15, var16, var13);
			var11 = ak(var11, var14, var15, var16, var13);
			var12 = ak(var12, var14, var15, var16, var13);
		}

		this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	abstract void au(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) throws EOFException;

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III[I[I)V"
	)
	public static void bq(int var0, int var1, int var2, int[] var3, int[] var4) {
		yu.ei(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	void by(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		byte var11 = this.ar_fld.au_fld.ae_fld;
		if (var11 > 0) {
			int var12 = ak(var10, this.ar_fld.au_fld.ag_fld, this.ar_fld.au_fld.az_fld, this.ar_fld.au_fld.av_fld, this.ar_fld.au_fld.ae_fld);
			var10 = this.as_fld[var12];
		}

		this.af(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	abstract void bo(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	abstract void ar(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void br(int var0) {
		int var1 = var0 * 210;
		av(var1);
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void mq(int var0, int var1, int var2, int var3, int var4) {
		yu.dj(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	abstract boolean ah();

	fh(fo var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	abstract void bi(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void sa(int var0, int var1, int var2, int var3, int var4) {
		yu.ex(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	abstract void al(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) throws EOFException;

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	public static void gr(
		float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
	) {
		fc.ao(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public static void jc(int var0, int var1, int var2, int var3, int var4) {
		yu.ed(var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	abstract void bn(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) throws EOFException;

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	abstract void bc(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) throws EOFException;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	void as(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		byte var11 = this.ar_fld.au_fld.az_fld;
		if (var11 > 0) {
			int var12 = an(var10, this.ar_fld.au_fld.av_fld, this.ar_fld.au_fld.ag_fld, this.ar_fld.au_fld.av_fld, this.ar_fld.au_fld.ag_fld);
			var10 = this.as_fld[var12];
		}

		this.bv(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}
}
