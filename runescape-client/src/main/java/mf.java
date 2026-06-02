import java.awt.event.FocusEvent;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mf")
public abstract class mf {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cp_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bf_fld;
	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ld_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String af_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int dc_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public abstract void ak(byte var1);

	mf() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public abstract int ag(int var1, int var2, int var3);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public abstract int as(int var1, int var2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public abstract void av();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public abstract int aw(int var1, int var2);

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/FocusEvent;)V"
	)
	public static void ib(tf var0, FocusEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}

		tf.rl_fld = false;
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Log;)Z"
	)
	public static boolean pb(og var0) {
		return var0.dg_fld != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public abstract int ah(int var1, int var2);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public abstract void az();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public abstract int ay(int var1, int var2);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfn;IIIILuy;III)I"
	)
	static int ad(fn var0, int var1, int var2, int var3, int var4, uy var5, int var6, int var7, int var8) {
		mj.an(var5, var6, var7, var8);
		return bc.ao(var2 - gz.bj_fld, var3 - wk.bf_fld, var4 - bv.by_fld, bc.bl_fld, ch.bx_fld, ee.bo_fld, dc.bp_fld, bu.bt_fld, hg.bv_fld, fn.ff(var0, var1));
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(Lpn;)Lwn;"
	)
	public static wn qp(pn var0) {
		return var0.as_fld;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int nv(int var1, int var2) {
		return this.ag(var1, var2, 1099094056);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ldx;II)Ltu;"
	)
	public static tu bn(dx var0, int var1, int var2) {
		if (var0 != null && bw.dk_fld != var0) {
			rg var4 = (rg)bw.dk_fld.an_fld.ak(var0.ag_fld);
			return var4 == null ? sh.ak(var1, 0.0F, var2) : rg.ql(var4, var1, var2);
		} else {
			return sh.ak(var1, 0.0F, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[III)V"
	)
	public static void az(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; var9++) {
				if (null == var7 || null != var0[var9] && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			az(var0, var1, var2, var6 - 1);
			az(var0, var1, 1 + var6, var3);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public abstract void ae();
}
