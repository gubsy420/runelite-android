import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pe")
public class pe {
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv im_fld;
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
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1176458971
	)
	static int cc_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bl_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxv;)Lxv;"
	)
	static final xv ae(xi var0, xv var1) {
		int var2 = var0.cg();
		if (null == var1) {
			int var3 = wp.ay(var2);
			var1 = new xv(var3);
		}

		for (int var7 = 0; var7 < var2; var7++) {
			int var4 = var0.cg();
			int var5 = xi.lx(var0, 1818538191);
			Object var6;
			if (var4 == 1) {
				var6 = new uj(xi.at(var0, 428267987));
			} else if (2 == var4) {
				var6 = new vk(var0.cu());
			} else {
				var6 = new vl(var0.co((byte)-45));
			}

			var1.ag((vw)var6, var5);
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxv;)Lxv;"
	)
	static final xv aw(xi var0, xv var1) {
		int var2 = var0.cg();
		if (null == var1) {
			int var3 = wp.ay(var2);
			var1 = new xv(var3);
		}

		for (int var7 = 0; var7 < var2; var7++) {
			int var4 = var0.cg();
			int var5 = xi.lx(var0, 455589998);
			Object var6;
			if (var4 == 1) {
				var6 = new uj(xi.at(var0, -882955153));
			} else if (2 == var4) {
				var6 = new vk(var0.cu());
			} else {
				var6 = new vl(var0.co((byte)-27));
			}

			var1.ag((vw)var6, var5);
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxv;)Lxv;"
	)
	static final xv ah(xi var0, xv var1) {
		int var2 = var0.cg();
		if (null == var1) {
			int var3 = wp.ay(var2);
			var1 = new xv(var3);
		}

		for (int var7 = 0; var7 < var2; var7++) {
			int var4 = var0.cg();
			int var5 = xi.lx(var0, -1171599565);
			Object var6;
			if (var4 == 1) {
				var6 = new uj(xi.at(var0, 919611212));
			} else if (2 == var4) {
				var6 = new vk(var0.cu());
			} else {
				var6 = new vl(var0.co((byte)-48));
			}

			var1.ag((vw)var6, var5);
		}

		return var1;
	}

	pe() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxv;II)I"
	)
	static int ay(xv var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			vl var3 = (vl)var0.ak(var1);
			return var3 == null ? var2 : var3.ak_fld;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lgn;III)V"
	)
	public static void hr(gn var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bp_fld[var1][var2] = var0.bp_fld[var1][var2] | var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxv;II)I"
	)
	static int as(xv var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			vl var3 = (vl)var0.ak(var1);
			return var3 == null ? var2 : var3.ak_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxv;II)I"
	)
	static int ar(xv var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			vl var3 = (vl)var0.ak(var1);
			return var3 == null ? var2 : var3.ak_fld;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxv;ILjava/lang/String;)Ljava/lang/String;"
	)
	static String af(xv var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			uj var3 = (uj)var0.ak(var1);
			return null == var3 ? var2 : (String)var3.ak_fld;
		}
	}
}
