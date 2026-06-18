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
		ak_fld.av();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ak_fld.av();
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Lyv;III)V"
	)
	public static void dw(yv var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 += var0.as_fld;
		var2 += var0.ar_fld;
		int var4 = var1 + var2 * yv.au_fld;
		int var5 = 0;
		int var6 = var0.ay_fld;
		int var7 = var0.aw_fld;
		int var8 = yv.au_fld - var7;
		int var9 = 0;
		if (var2 < yv.aa_fld) {
			int var10 = yv.aa_fld - var2;
			var6 -= var10;
			var2 = yv.aa_fld;
			var5 += var10 * var7;
			var4 += var10 * yv.au_fld;
		}

		if (var2 + var6 > yv.ai_fld) {
			var6 -= var2 + var6 - yv.ai_fld;
		}

		if (var1 < yv.aq_fld) {
			int var13 = yv.aq_fld - var1;
			var7 -= var13;
			var1 = yv.aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > yv.am_fld) {
			int var14 = var1 + var7 - yv.am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			yv.ae(yv.al_fld, var0.ah_fld, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void az() {
		ak_fld.av();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	static void av(int var0, int var1, int var2, int var3, byte var4) {
		bg var5 = (bg)xz.tw(bg.ak_fld, var0);
		if (null == var5) {
			if (var4 <= 8) {
				return;
			}

			var5 = new bg();
			xz.fe(bg.ak_fld, var5, var0);
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
		descriptor = "(I)V"
	)
	static void ap() {
		if (gv.ak()) {
			bn.dq_fld = true;
			bn.du_fld = 0;
			bn.db_fld = 0;
		}
	}
}
