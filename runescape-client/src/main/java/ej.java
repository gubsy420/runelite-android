import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ej")
public class ej {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean bk_fld = false;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedGetter(
		intValue = 1348149579
	)
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bs_fld = 0;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public static tu br_fld = new tu();
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean be_fld = false;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedGetter(
		intValue = 1743370615
	)
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bh_fld = 0;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	public static long[] cc_fld = new long[1000];
	@ObfuscatedGetter(
		intValue = 2104290501
	)
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cd_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] cq_fld = new int[1000];
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lzf;"
	)
	static zf do_fld;

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int bi() {
		return bs_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int ap() {
		return cd_fld + 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(J)Z"
	)
	static boolean at(long var0) {
		int var2 = (int)(var0 >>> 16 & 7L);
		return var2 == 2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(J)Z"
	)
	static boolean ac(long var0) {
		int var2 = (int)(var0 >>> 16 & 7L);
		return var2 == 2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(J)Z"
	)
	public static boolean aj(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = 1 == (int)(var0 >>> 19 & 1L);
			var2 = !var3;
		}

		return var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int br(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(J)Z"
	)
	public static boolean bd(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = 1 == (int)(var0 >>> 19 & 1L);
			var2 = !var3;
		}

		return var2;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(FFFFIII)V"
	)
	public static final void bw(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
		if (!bk_fld) {
			float var11 = 50.0F;
			float var12 = fh.az();
			float var13 = (bs_fld - var4) * var11 / var6;
			float var14 = var11 * (bh_fld - var5) / var6;
			float var15 = var12 * (bs_fld - var4) / var6;
			float var16 = var12 * (bh_fld - var5) / var6;
			float var18 = var11 * var0 + var14 * var1;
			float var19 = var1 * var11 - var14 * var0;
			float var20 = var16 * var1 + var12 * var0;
			float var21 = var12 * var1 - var0 * var16;
			float var17 = bh.az(var13, var19, var3, var2);
			float var22 = var2 * var13 + var19 * var3;
			float var25 = bh.az(var15, var21, var3, var2);
			float var23 = var21 * var3 + var15 * var2;
			lp.aa((int)var17, (int)var18, (int)var22, (int)var25, (int)var20, (int)var23);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	static void bb(int var0, int var1, int var2, int var3, int var4, int var5) {
		bc.bl_fld = var0;
		ch.bx_fld = var1;
		ee.bo_fld = var2;
		dc.bp_fld = var3;
		bu.bt_fld = var4;
		hg.bv_fld = var5;
		se.bi_fld = (var3 + var0) / 2;
		fp.bu_fld = 1612252849 * ((var4 + var1) / 2);
		bw.bn_fld = (var5 + var2) / 2;
		kl.bc_fld = -411987027 * ((var3 - var0) / 2);
		hg.bw_fld = -1967709977 * ((var4 - var1) / 2);
		ei.ba_fld = -601056317 * ((var5 - var2) / 2);
		ki.bq_fld = Math.abs(kl.bc_fld);
		db.bg_fld = Math.abs(hg.bw_fld);
		hm.bb_fld = Math.abs(ei.ba_fld);
		tu.md(br_fld, var3 - var0, var4 - var1, var5 - var2, (byte)5);
		br_fld.al();
		bk_fld = true;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int be(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int bh(long var0) {
		return (int)(var0 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIZII)J"
	)
	public static long by(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		long var7 = (var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16 | (var5 & 4294967295L) << 20 | (var6 & 4095L) << -979056054;
		if (var4) {
			var7 |= 524288L;
		}

		return var7;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZ)Z"
	)
	public static boolean gl(sb var0, boolean var1, boolean var2, boolean var3) {
		return var0.aw(var0.ah_fld * -786133429, var1, var2, var3);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int bu() {
		return bs_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static final boolean bp() {
		return be_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(J)J"
	)
	static long bf(long var0) {
		return var0 & -524289L;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(J)Z"
	)
	public static boolean bm(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = 1 == (int)(var0 >>> 19 & 1L);
			var2 = !var3;
		}

		return var2;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIIIZII)J"
	)
	public static long bl(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		long var7 = (var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16 | (var5 & 4294967295L) << 20 | (var6 & 4095L) << 52;
		if (var4) {
			var7 |= 524288L;
		}

		return var7;
	}

	ej() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(JI)V"
	)
	static final void bo(long var0, int var2) {
		if (cq_fld[cd_fld] != Integer.MAX_VALUE && cc_fld[cd_fld] != var0) {
			cd_fld++;
			cq_fld[cd_fld] = Integer.MAX_VALUE;
		}

		cc_fld[cd_fld] = var0;
		cq_fld[cd_fld] = Math.min(cq_fld[cd_fld], var2);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIILuy;III)Z"
	)
	static final boolean cx(fn var0, int var1, int var2, int var3, int var4, uy var5, int var6, int var7, int var8) {
		if (!rt.af()) {
			return false;
		} else {
			mj.an(var5, var6, var7, var8);
			return et.am(var0, var1, var2 - gz.bj_fld, var3 - wk.bf_fld, var4 - bv.by_fld);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int bs(long var0) {
		return (int)(var0 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static final boolean bv() {
		return be_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	static void cd(int var0, int var1, int var2, int var3, int var4, int var5) {
		bc.bl_fld = var0;
		ch.bx_fld = -656932694 * var1;
		ee.bo_fld = var2 * 1105316734;
		dc.bp_fld = var3;
		bu.bt_fld = var4;
		hg.bv_fld = var5;
		se.bi_fld = (var3 + var0) / 2;
		fp.bu_fld = 436706904 * ((var4 + var1) / 2);
		bw.bn_fld = (var5 + var2) / 2 * -784245954;
		kl.bc_fld = -1237664646 * ((var3 - var0) / 2);
		hg.bw_fld = 878397092 * ((var4 - var1) / 2);
		ei.ba_fld = -601056317 * ((var5 - var2) / 2);
		ki.bq_fld = Math.abs(kl.bc_fld * 1426603213) * 600840382;
		db.bg_fld = Math.abs(hg.bw_fld);
		hm.bb_fld = Math.abs(1155642031 * ei.ba_fld) * -382803323;
		tu.md(br_fld, var3 - var0, var4 - var1, var5 - var2, (byte)-98);
		br_fld.al();
		bk_fld = true;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int bn() {
		return bs_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int bz(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int bc() {
		return bh_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(J)J"
	)
	static long bj(long var0) {
		return var0 & -524289L;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(FFFFIII)V"
	)
	public static final void ba(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
		if (!bk_fld) {
			float var11 = 50.0F;
			float var12 = fh.az();
			float var13 = (bs_fld - var4) * var11 / var6;
			float var14 = var11 * (bh_fld - var5) / var6;
			float var15 = var12 * (bs_fld - var4) / var6;
			float var16 = var12 * (bh_fld - var5) / var6;
			float var18 = var11 * var0 + var14 * var1;
			float var19 = var1 * var11 - var14 * var0;
			float var20 = var16 * var1 + var12 * var0;
			float var21 = var12 * var1 - var0 * var16;
			float var17 = bh.az(var13, var19, var3, var2);
			float var22 = var2 * var13 + var19 * var3;
			float var25 = bh.az(var15, var21, var3, var2);
			float var23 = var21 * var3 + var15 * var2;
			lp.aa((int)var17, (int)var18, (int)var22, (int)var25, (int)var20, (int)var23);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(FFFFIII)V"
	)
	public static final void bq(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
		if (!bk_fld) {
			float var11 = 50.0F;
			float var12 = fh.az();
			float var13 = (bs_fld - var4) * var11 / var6;
			float var14 = var11 * (bh_fld - var5) / var6;
			float var15 = var12 * (bs_fld - var4) / var6;
			float var16 = var12 * (bh_fld - var5) / var6;
			float var18 = var11 * var0 + var14 * var1;
			float var19 = var1 * var11 - var14 * var0;
			float var20 = var16 * var1 + var12 * var0;
			float var21 = var12 * var1 - var0 * var16;
			float var17 = bh.az(var13, var19, var3, var2);
			float var22 = var2 * var13 + var19 * var3;
			float var25 = bh.az(var15, var21, var3, var2);
			float var23 = var21 * var3 + var15 * var2;
			lp.aa((int)var17, (int)var18, (int)var22, (int)var25, (int)var20, (int)var23);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Luy;III)V"
	)
	static void bg(uy var0, int var1, int var2, int var3) {
		if (!bk_fld) {
			int var4 = -1516480651;
			int var5 = fh.az();
			int var6 = var4 * (bs_fld - var1) / var3;
			int var7 = (bh_fld - var2) * var4 / var3;
			int var8 = (bs_fld - var1) * var5 / var3;
			int var9 = var5 * (bh_fld - var2) / var3;
			uy var10 = cv.ag(var0);
			var10.aq();
			float[] var11 = new float[3];
			uy.vt(var10, var6, var7, var4, var11, 1812384499);
			var6 = (int)var11[0];
			var7 = (int)var11[1];
			var4 = (int)var11[2];
			uy.vt(var10, var8, var9, var5, var11, 1093570263);
			var8 = (int)var11[0];
			var9 = (int)var11[1];
			var5 = (int)var11[2];
			uy.vt(var10, 0.0F, 0.0F, 0.0F, var11, -1899939469);
			gz.bj_fld = -141247257 * (int)var11[0];
			wk.bf_fld = (int)var11[1] * -254727418;
			bv.by_fld = (int)var11[2];
			var6 -= gz.bj_fld;
			var7 -= wk.bf_fld;
			var4 -= bv.by_fld;
			var8 -= gz.bj_fld;
			var9 -= wk.bf_fld;
			var5 -= bv.by_fld;
			lp.aa(var6, var7, var4, var8, var9, var5);
			var10.az();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int bk(long var0) {
		int var2 = (int)(var0 >>> 513606348 & 4095L);
		if (var2 == 4095L) {
			var2 = -1;
		}

		return var2;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIIFFFFIII)Z"
	)
	static final boolean cv(fn var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		if (!rt.af()) {
			return false;
		} else {
			en.ax(var5, var6, var7, var8, var9, var10, var11);
			return et.am(var0, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIIFFFFIII)Z"
	)
	static final boolean cc(fn var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		if (!rt.af()) {
			return false;
		} else {
			en.ax(var5, var6, var7, var8, var9, var10, var11);
			return et.am(var0, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIIFFFFIII)Z"
	)
	static final boolean cq(fn var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		if (!rt.af()) {
			return false;
		} else {
			en.ax(var5, var6, var7, var8, var9, var10, var11);
			return et.am(var0, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static final void bx() {
		be_fld = false;
		cd_fld = 0;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIIFFFFIII)Z"
	)
	static final boolean cy(fn var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		if (!rt.af()) {
			return false;
		} else {
			en.ax(var5, var6, var7, var8, var9, var10, var11);
			return et.am(var0, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIILuy;III)Z"
	)
	static final boolean cf(fn var0, int var1, int var2, int var3, int var4, uy var5, int var6, int var7, int var8) {
		if (!rt.af()) {
			return false;
		} else {
			mj.an(var5, var6, var7, var8);
			return et.am(var0, var1, var2 - gz.bj_fld, var3 - wk.bf_fld, var4 - bv.by_fld);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static final boolean bt() {
		return be_fld;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIII)Z"
	)
	static boolean cs(fn var0, int var1, int var2, int var3, int var4) {
		fm var5 = fn.ff(var0, var1);
		int var6 = var2 + var5.ag_fld;
		int var7 = var3 + var5.az_fld;
		int var8 = var5.av_fld + var4;
		int var9 = var5.ae_fld;
		int var10 = var5.ah_fld;
		int var11 = var5.aw_fld;
		int var12 = se.bi_fld - var6;
		int var13 = fp.bu_fld - var7;
		int var14 = bw.bn_fld - var8;
		if (Math.abs(var12) > ki.bq_fld + var9) {
			return false;
		} else if (Math.abs(var13) > db.bg_fld + var10) {
			return false;
		} else if (Math.abs(var14) > hm.bb_fld + var11) {
			return false;
		} else if (Math.abs(hg.bw_fld * var14 - var13 * ei.ba_fld) > hm.bb_fld * var10 + db.bg_fld * var11) {
			return false;
		} else {
			return Math.abs(ei.ba_fld * var12 - kl.bc_fld * var14) > ki.bq_fld * var11 + var9 * hm.bb_fld
				? false
				: Math.abs(kl.bc_fld * var13 - hg.bw_fld * var12) <= var9 * db.bg_fld + var10 * ki.bq_fld;
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIII)Z"
	)
	static boolean cp(fn var0, int var1, int var2, int var3, int var4) {
		fm var5 = fn.ff(var0, var1);
		int var6 = var2 + var5.ag_fld;
		int var7 = var3 + var5.az_fld;
		int var8 = var5.av_fld + var4;
		int var9 = var5.ae_fld;
		int var10 = var5.ah_fld;
		int var11 = var5.aw_fld;
		int var12 = se.bi_fld - var6;
		int var13 = fp.bu_fld - var7;
		int var14 = bw.bn_fld - var8;
		if (Math.abs(var12) > ki.bq_fld + var9) {
			return false;
		} else if (Math.abs(var13) > db.bg_fld + var10) {
			return false;
		} else if (Math.abs(var14) > hm.bb_fld + var11) {
			return false;
		} else if (Math.abs(hg.bw_fld * var14 - var13 * ei.ba_fld) > hm.bb_fld * var10 + db.bg_fld * var11) {
			return false;
		} else {
			return Math.abs(ei.ba_fld * var12 - kl.bc_fld * var14) > ki.bq_fld * var11 + var9 * hm.bb_fld
				? false
				: Math.abs(kl.bc_fld * var13 - hg.bw_fld * var12) <= var9 * db.bg_fld + var10 * ki.bq_fld;
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIILuy;III)I"
	)
	static int ce(fn var0, int var1, int var2, int var3, int var4, uy var5, int var6, int var7, int var8) {
		mj.an(var5, var6, var7, var8);
		return bc.ao(
			var2 - gz.bj_fld,
			var3 - wk.bf_fld,
			var4 - bv.by_fld,
			706265226 * bc.bl_fld,
			ch.bx_fld,
			ee.bo_fld * -1981801719,
			dc.bp_fld,
			-244829934 * bu.bt_fld,
			hg.bv_fld,
			fn.ff(var0, var1)
		);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIILuy;III)I"
	)
	static int cn(fn var0, int var1, int var2, int var3, int var4, uy var5, int var6, int var7, int var8) {
		mj.an(var5, var6, var7, var8);
		return bc.ao(
			var2 - gz.bj_fld,
			var3 - wk.bf_fld,
			var4 - bv.by_fld,
			453075860 * bc.bl_fld,
			-597682768 * ch.bx_fld,
			ee.bo_fld,
			-855547566 * dc.bp_fld,
			bu.bt_fld,
			hg.bv_fld,
			fn.ff(var0, var1)
		);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIILfm;)I"
	)
	static int cr(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, fm var9) {
		int var10 = var0 + fm.lx(var9, 1585665713);
		int var11 = var0 + var9.ag(1604734638);
		int var12 = var1 + var9.az(-230572589);
		int var13 = var1 + var9.av((byte)0);
		int var14 = var2 + var9.ae((short)2534);
		int var15 = var2 + var9.ah(-1688346444);
		float var16 = var6 - var3;
		float var17 = var7 - var4;
		float var18 = var8 - var5;
		float var19 = 0.0F;
		float var20 = 1.0F;
		float var21 = 1.0E-9F;
		if (Math.abs(var16) < 1.0E-9F) {
			if (var3 < var10 || var3 > var11) {
				return -1;
			}
		} else {
			float var22 = 1.0F / var16;
			float var23 = var22 * (var10 - var3);
			float var24 = var22 * (var11 - var3);
			if (var23 > var24) {
				float var25 = var23;
				var23 = var24;
				var24 = var25;
			}

			var19 = Math.max(var19, var23);
			var20 = Math.min(var20, var24);
			if (var19 > var20) {
				return -1;
			}
		}

		if (Math.abs(var17) < 1.0E-9F) {
			if (var4 < var12 || var4 > var13) {
				return -1;
			}
		} else {
			float var27 = 1.0F / var17;
			float var30 = var27 * (var12 - var4);
			float var33 = (var13 - var4) * var27;
			if (var30 > var33) {
				float var36 = var30;
				var30 = var33;
				var33 = var36;
			}

			var19 = Math.max(var19, var30);
			var20 = Math.min(var20, var33);
			if (var19 > var20) {
				return -1;
			}
		}

		if (Math.abs(var18) < 1.0E-9F) {
			if (var5 < var14 || var5 > var15) {
				return -1;
			}
		} else {
			float var28 = 1.0F / var18;
			float var31 = var28 * (var14 - var5);
			float var34 = (var15 - var5) * var28;
			if (var31 > var34) {
				float var37 = var31;
				var31 = var34;
				var34 = var37;
			}

			var19 = Math.max(var19, var31);
			var20 = Math.min(var20, var34);
			if (var19 > var20) {
				return -1;
			}
		}

		float var29 = var3 + var16 * var19;
		float var32 = var4 + var17 * var19;
		float var35 = var5 + var19 * var18;
		return (int)Math.sqrt(var29 * var29 + var32 * var32 + var35 * var35);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIILfm;)I"
	)
	static int ca(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, fm var9) {
		int var10 = var0 + fm.lx(var9, 1585665713);
		int var11 = var0 + var9.ag(-1051411352);
		int var12 = var1 + var9.az(-230572589);
		int var13 = var1 + var9.av((byte)0);
		int var14 = var2 + var9.ae((short)8468);
		int var15 = var2 + var9.ah(-1874783755);
		float var16 = var6 - var3;
		float var17 = var7 - var4;
		float var18 = var8 - var5;
		float var19 = 0.0F;
		float var20 = 1.0F;
		float var21 = 1.0E-9F;
		if (Math.abs(var16) < 1.0E-9F) {
			if (var3 < var10 || var3 > var11) {
				return -1;
			}
		} else {
			float var22 = 1.0F / var16;
			float var23 = var22 * (var10 - var3);
			float var24 = var22 * (var11 - var3);
			if (var23 > var24) {
				float var25 = var23;
				var23 = var24;
				var24 = var25;
			}

			var19 = Math.max(var19, var23);
			var20 = Math.min(var20, var24);
			if (var19 > var20) {
				return -1;
			}
		}

		if (Math.abs(var17) < 1.0E-9F) {
			if (var4 < var12 || var4 > var13) {
				return -1;
			}
		} else {
			float var27 = 1.0F / var17;
			float var30 = var27 * (var12 - var4);
			float var33 = (var13 - var4) * var27;
			if (var30 > var33) {
				float var36 = var30;
				var30 = var33;
				var33 = var36;
			}

			var19 = Math.max(var19, var30);
			var20 = Math.min(var20, var33);
			if (var19 > var20) {
				return -1;
			}
		}

		if (Math.abs(var18) < 1.0E-9F) {
			if (var5 < var14 || var5 > var15) {
				return -1;
			}
		} else {
			float var28 = 1.0F / var18;
			float var31 = var28 * (var14 - var5);
			float var34 = (var15 - var5) * var28;
			if (var31 > var34) {
				float var37 = var31;
				var31 = var34;
				var34 = var37;
			}

			var19 = Math.max(var19, var31);
			var20 = Math.min(var20, var34);
			if (var19 > var20) {
				return -1;
			}
		}

		float var29 = var3 + var16 * var19;
		float var32 = var4 + var17 * var19;
		float var35 = var5 + var19 * var18;
		return (int)Math.sqrt(var29 * var29 + var32 * var32 + var35 * var35);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIILfm;)I"
	)
	static int cg(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, fm var9) {
		int var10 = var0 + fm.lx(var9, 1585665713);
		int var11 = var0 + var9.ag(1934719562);
		int var12 = var1 + var9.az(-230572589);
		int var13 = var1 + var9.av((byte)0);
		int var14 = var2 + var9.ae((short)1929);
		int var15 = var2 + var9.ah(-1802381292);
		float var16 = var6 - var3;
		float var17 = var7 - var4;
		float var18 = var8 - var5;
		float var19 = 0.0F;
		float var20 = 1.0F;
		float var21 = 1.0E-9F;
		if (Math.abs(var16) < 1.0E-9F) {
			if (var3 < var10 || var3 > var11) {
				return -1;
			}
		} else {
			float var22 = 1.0F / var16;
			float var23 = var22 * (var10 - var3);
			float var24 = var22 * (var11 - var3);
			if (var23 > var24) {
				float var25 = var23;
				var23 = var24;
				var24 = var25;
			}

			var19 = Math.max(var19, var23);
			var20 = Math.min(var20, var24);
			if (var19 > var20) {
				return -1;
			}
		}

		if (Math.abs(var17) < 1.0E-9F) {
			if (var4 < var12 || var4 > var13) {
				return -1;
			}
		} else {
			float var27 = 1.0F / var17;
			float var30 = var27 * (var12 - var4);
			float var33 = (var13 - var4) * var27;
			if (var30 > var33) {
				float var36 = var30;
				var30 = var33;
				var33 = var36;
			}

			var19 = Math.max(var19, var30);
			var20 = Math.min(var20, var33);
			if (var19 > var20) {
				return -1;
			}
		}

		if (Math.abs(var18) < 1.0E-9F) {
			if (var5 < var14 || var5 > var15) {
				return -1;
			}
		} else {
			float var28 = 1.0F / var18;
			float var31 = var28 * (var14 - var5);
			float var34 = (var15 - var5) * var28;
			if (var31 > var34) {
				float var37 = var31;
				var31 = var34;
				var34 = var37;
			}

			var19 = Math.max(var19, var31);
			var20 = Math.min(var20, var34);
			if (var19 > var20) {
				return -1;
			}
		}

		float var29 = var3 + var16 * var19;
		float var32 = var4 + var17 * var19;
		float var35 = var5 + var19 * var18;
		return (int)Math.sqrt(var29 * var29 + var32 * var32 + var35 * var35);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void cw() {
		boolean var0;
		do {
			var0 = true;

			for (int var1 = 0; var1 < cd_fld; var1++) {
				if (cq_fld[var1] < cq_fld[1 + var1]) {
					long var2 = cc_fld[var1];
					cc_fld[var1] = cc_fld[var1 + 1];
					cc_fld[1 + var1] = var2;
					int var4 = cq_fld[var1];
					cq_fld[var1] = cq_fld[var1 + 1];
					cq_fld[1 + var1] = var4;
					var0 = false;
				}
			}
		} while (!var0);

		for (int var5 = 0; var5 < cd_fld; var5++) {
			for (int var6 = var5 + 1; var6 <= cd_fld; var6++) {
				if (cc_fld[var5] == cc_fld[var6]) {
					cc_fld[var5] = -1L;
					break;
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;)V"
	)
	public static void ak(ub var0, ub var1) {
		ep.ao_fld = var0;
		ma.bv_fld = var1;
	}
}
