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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int ag(int var1, int var2) {
		return this.ag_fld[var1 + var2 * 64];
	}

	hs(int[] var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	final int ak(int var1, int var2) {
		return this.ag_fld[var1 + var2 * 64];
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void om(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bt_fld = null;
	}

	hs() {
		this.ag_fld = new int[4096];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int az(int var1, int var2) {
		return this.ag_fld[var1 + var2 * 64];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
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
		descriptor = "(I)I"
	)
	static final int go() {
		float var1 = 200.0F * ((float)cn.zp(cx.kq_fld, -1822420087) - 0.5F);
		return 100 - Math.round(var1);
	}
}
