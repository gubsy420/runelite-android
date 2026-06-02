import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ow")
public class ow extends vc {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bs_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ak_fld = new iw(64);
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv ie_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void av() {
		ak_fld.vh();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ak_fld.vh();
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int ql(pi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aq_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void az() {
		ak_fld.vh();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	static void av(int var0, int var1, int var2, int var3, byte var4) {
		bg var5 = (bg)bg.ak_fld.ak(var0);
		if (null == var5) {
			if (var4 <= 8) {
				return;
			}

			var5 = new bg();
			bg.ak_fld.az(var5, var0);
		}

		if (var5.ag_fld.length <= var1) {
			if (var4 <= 8) {
				return;
			}

			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];

			for (int var8 = 0; var8 < var5.ag_fld.length; var8++) {
				var6[var8] = var5.ag_fld[var8];
				var7[var8] = var5.az_fld[var8];
			}

			for (int var9 = var5.ag_fld.length; var9 < var1; var9++) {
				var6[var9] = -1;
				var7[var9] = 0;
			}

			var5.ag_fld = var6;
			var5.az_fld = var7;
		}

		var5.ag_fld[var1] = var2;
		var5.az_fld[var1] = var3;
	}

	ow() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ap() {
		if (gv.ak()) {
			bn.dq_fld = true;
			bn.du_fld = 0;
			bn.db_fld = 0;
		}
	}
}
