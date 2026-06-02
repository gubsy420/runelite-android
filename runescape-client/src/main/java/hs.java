import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hs")
public class hs {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bo_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "C"
	)
	static char ah_fld;

	hs(int[] var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int ak(int var1, int var2) {
		return this.ag_fld[var1 + var2 * 64];
	}

	hs() {
		this.ag_fld = new int[4096];
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean jm(da var0) {
		return lf.ak_fld == var0.cg_fld.ag_fld && kx.ak_fld != var0.cg_fld.av_fld && -1 != 974676213 * var0.cg_fld.ae_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void as() throws EOFException {
		he.cq_fld.trim();
		if (he.cq_fld.length() != 6) {
			cl.ad(kh.cy_fld, kh.cf_fld, kh.cx_fld);
		} else {
			pe.cc_fld = Integer.parseInt(he.cq_fld);
			he.cq_fld = "";
			ik.bz(true, 1467933280);
			cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
			jk.af(20, (byte)-65);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int ae(int var1, int var2) {
		return this.ag_fld[var1 + var2 * 64];
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int go() {
		float var1 = 200.0F * ((float)cn.db(cx.kq_fld, -1822420087) - 0.5F);
		return 100 - Math.round(var1);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int ii(da var0) {
		return var0.cw_fld.ah();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int av(int var1, int var2) {
		return this.ag_fld[var1 + var2 * 64];
	}
}
