import java.awt.datatransfer.Clipboard;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("el")
public class el {
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -208598331
	)
	int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2136676069
	)
	int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -185008781
	)
	int az_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int rg(pi var0) {
		return var0.ai_fld;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/awt/datatransfer/Clipboard;"
	)
	public static Clipboard ht() {
		return og.ci_fld.age(-175905683);
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean gt(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (!var0.dj_boolean(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = var0.cv_fld[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > var0.du_fld) {
						if (!var0.mh(var5, var7, var6)) {
							return false;
						}

						if (!var0.mh(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!var0.mh(var5, var8, var6)) {
							return false;
						}

						if (!var0.mh(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!var0.mh(var5, var9, var6)) {
						return false;
					}

					if (!var0.mh(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < var0.co_fld) {
						if (!var0.mh(var5, var7, var6 + 128)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!var0.mh(var5, var8, var6 + 128)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!var0.mh(var5, var9, var6 + 128)) {
						return false;
					}

					if (!var0.mh(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < var0.du_fld) {
						if (!var0.mh(var5 + 128, var7, var6)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!var0.mh(var5 + 128, var8, var6)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!var0.mh(var5 + 128, var9, var6)) {
						return false;
					}

					if (!var0.mh(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > var0.co_fld) {
						if (!var0.mh(var5, var7, var6)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!var0.mh(var5, var8, var6)) {
							return false;
						}

						if (!var0.mh(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!var0.mh(var5, var9, var6)) {
						return false;
					}

					if (!var0.mh(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!var0.mh(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return var0.mh(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return var0.mh(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return var0.mh(var5 + 128, var9, var6);
			} else {
				return var4 == 128 ? var0.mh(var5, var9, var6) : true;
			}
		}
	}

	el() {
	}
}
