import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tz")
public class tz {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int an_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(Lml;II)V"
	)
	public static void qo(ml var0, int var1, int var2) {
		var0.at_fld[var1] = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean al(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		long var10 = 1073741824L;
		long var12 = -1073741824L;
		long var8;
		if (var2 != var0) {
			long var14 = var3 - var1;
			long var16 = (var14 << 15) / (var2 - var0);
			var8 = Math.min(1073741824L, Math.max(-1073741824L, var16));
		} else if (var1 > var3) {
			var8 = -1073741824L;
		} else {
			var8 = 1073741824L;
		}

		long var24 = 1073741824L;
		long var25 = -1073741824L;
		if (var6 != var4) {
			long var18 = var7 - var5;
			long var20 = (var18 << 15) / (var6 - var4);
			var12 = Math.min(1073741824L, Math.max(-1073741824L, var20));
		} else if (var5 > var7) {
			var12 = -1073741824L;
		} else {
			var12 = 1073741824L;
		}

		if (var12 == var8) {
			return false;
		} else {
			var25 = ((long)var1 << 15) - var0 * var8;
			long var27 = ((long)var5 << 15) - var12 * var4;
			int var28 = -((int)((var25 - var27) / (var8 - var12)));
			if (Math.min(var0, var2) <= var28 && Math.max(var0, var2) >= var28 && Math.min(var4, var6) <= var28 && Math.max(var4, var6) >= var28) {
				long var21;
				if (Math.abs(var8) < Math.abs(var12)) {
					var21 = var25 + var28 * var8 >> 15;
				} else {
					var21 = var27 + var28 * var12 >> 15;
				}

				return Math.min(var1, var3) <= var21 && Math.max(var1, var3) >= var21 && Math.min(var5, var7) <= var21 && Math.max(var5, var7) >= var21;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V"
	)
	static void ag(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			short var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var7 == null || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					short var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			ag(var0, var1, var2, var6 - 1);
			ag(var0, var1, var6 + 1, var3);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean ae(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		return !nh.ag(var0, var1, var2, var3, var4, var5) ? false : nh.ag(var0, var1, var4, var5, var6, var7);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean ah(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		return !nh.ag(var0, var1, var2, var3, var4, var5) ? false : nh.ag(var0, var1, var4, var5, var6, var7);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean av(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		return !nh.ag(var0, var1, var2, var3, var4, var5) ? false : nh.ag(var0, var1, var4, var5, var6, var7);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	static boolean ay(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var4 - var2;
		int var7 = var5 - var3;
		int var8 = var0 - var2;
		int var9 = var1 - var3;
		int var10 = var8 * var6 + var7 * var9;
		int var12 = var7 * var7 + var6 * var6;
		return 0 <= var10 && var10 <= var12;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	static boolean as(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var4 - var2;
		int var7 = var5 - var3;
		int var8 = var0 - var2;
		int var9 = var1 - var3;
		int var10 = var8 * var6 + var7 * var9;
		int var12 = var7 * var7 + var6 * var6;
		return 0 <= var10 && var10 <= var12;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean ar(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		long var10 = 1073741824L;
		long var12 = -1073741824L;
		long var8;
		if (var2 != var0) {
			long var14 = var3 - var1;
			long var16 = (var14 << 15) / (var2 - var0);
			var8 = Math.min(1073741824L, Math.max(-1073741824L, var16));
		} else if (var1 > var3) {
			var8 = -1073741824L;
		} else {
			var8 = 1073741824L;
		}

		long var24 = 1073741824L;
		long var25 = -1073741824L;
		if (var6 != var4) {
			long var18 = var7 - var5;
			long var20 = (var18 << 15) / (var6 - var4);
			var12 = Math.min(1073741824L, Math.max(-1073741824L, var20));
		} else if (var5 > var7) {
			var12 = -1073741824L;
		} else {
			var12 = 1073741824L;
		}

		if (var12 == var8) {
			return false;
		} else {
			var25 = ((long)var1 << 15) - var0 * var8;
			long var27 = ((long)var5 << 15) - var12 * var4;
			int var28 = -((int)((var25 - var27) / (var8 - var12)));
			if (Math.min(var0, var2) <= var28 && Math.max(var0, var2) >= var28 && Math.min(var4, var6) <= var28 && Math.max(var4, var6) >= var28) {
				long var21;
				if (Math.abs(var8) < Math.abs(var12)) {
					var21 = var25 + var28 * var8 >> 15;
				} else {
					var21 = var27 + var28 * var12 >> 15;
				}

				return Math.min(var1, var3) <= var21 && Math.max(var1, var3) >= var21 && Math.min(var5, var7) <= var21 && Math.max(var5, var7) >= var21;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z"
	)
	public static boolean af(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		long var10 = 1073741824L;
		long var12 = -1073741824L;
		long var8;
		if (var2 != var0) {
			long var14 = var3 - var1;
			long var16 = (var14 << 15) / (var2 - var0);
			var8 = Math.min(1073741824L, Math.max(-1073741824L, var16));
		} else if (var1 > var3) {
			var8 = -1073741824L;
		} else {
			var8 = 1073741824L;
		}

		long var24 = 1073741824L;
		long var25 = -1073741824L;
		if (var6 != var4) {
			long var18 = var7 - var5;
			long var20 = (var18 << 15) / (var6 - var4);
			var12 = Math.min(1073741824L, Math.max(-1073741824L, var20));
		} else if (var5 > var7) {
			var12 = -1073741824L;
		} else {
			var12 = 1073741824L;
		}

		if (var12 == var8) {
			return false;
		} else {
			var25 = ((long)var1 << 15) - var0 * var8;
			long var27 = ((long)var5 << 15) - var12 * var4;
			int var28 = -((int)((var25 - var27) / (var8 - var12)));
			if (Math.min(var0, var2) <= var28 && Math.max(var0, var2) >= var28 && Math.min(var4, var6) <= var28 && Math.max(var4, var6) >= var28) {
				long var21;
				if (Math.abs(var8) < Math.abs(var12)) {
					var21 = var25 + var28 * var8 >> 15;
				} else {
					var21 = var27 + var28 * var12 >> 15;
				}

				return Math.min(var1, var3) <= var21 && Math.max(var1, var3) >= var21 && Math.min(var5, var7) <= var21 && Math.max(var5, var7) >= var21;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z"
	)
	static boolean aw(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var4 - var2;
		int var7 = var5 - var3;
		int var8 = var0 - var2;
		int var9 = var1 - var3;
		int var10 = var8 * var6 + var7 * var9;
		int var12 = var7 * var7 + var6 * var6;
		return 0 <= var10 && var10 <= var12;
	}

	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I"
	)
	public static int ud(mw var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ar(var1);
	}

	tz() throws Throwable {
		throw new Error();
	}
}
