import java.io.EOFException;
import java.util.Random;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ya")
public class ya {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([II[III)V"
	)
	static void at(int[] var0, int var1, int[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)V"
	)
	public static void ak(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/Random;"
	)
	static Random bt(int var0, int var1) {
		if (var0 == 0 && var1 == 0) {
			var0 = (int)(Math.random() * 2.147483647E9);
			var1 = (int)(Math.random() * 2.147483647E9);
		}

		long var2 = (long)var0 << 32 | var1;
		return new Random(var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([SI[SII)V"
	)
	static void am(short[] var0, int var1, short[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([II[III)V"
	)
	static void av(int[] var0, int var1, int[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([CI[CII)V"
	)
	static void ao(char[] var0, int var1, char[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([FI[FII)V"
	)
	static void ah(float[] var0, int var1, float[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([DI[DII)V"
	)
	static void aw(double[] var0, int var1, double[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([ZI[ZII)V"
	)
	static void ay(boolean[] var0, int var1, boolean[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V"
	)
	static void as(Object[] var0, int var1, Object[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([FI[FII)V"
	)
	static void bz(float[] var0, int var1, float[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/Random;"
	)
	static Random af(int var0, int var1) {
		if (var0 == 0 && var1 == 0) {
			var0 = (int)(Math.random() * 2.147483647E9);
			var1 = (int)(Math.random() * 2.147483647E9);
		}

		long var2 = (long)var0 << 32 | var1;
		return new Random(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([IIII)V"
	)
	public static void al(int[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				int var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([JIII)V"
	)
	public static void au(long[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				long var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)V"
	)
	public static void ax(Object[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				Object var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public static void ar(int[] var0, int var1, int var2) {
		var2 = var1 + var2 - 7;

		while (var1 < var2) {
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
		}

		var2 += 7;

		while (var1 < var2) {
			var0[var1++] = 0;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)V"
	)
	public static void aa(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([SI[SII)V"
	)
	static void ai(short[] var0, int var1, short[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([IIII)V"
	)
	public static void bn(int[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				int var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public static void bp(int[] var0, int var1, int var2) {
		var2 = var1 + var2 - 7;

		while (var1 < var2) {
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
		}

		var2 += 7;

		while (var1 < var2) {
			var0[var1++] = 0;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([CI[CII)V"
	)
	static void ad(char[] var0, int var1, char[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([SI[SII)V"
	)
	static void ag(short[] var0, int var1, short[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([CI[CII)V"
	)
	static void ab(char[] var0, int var1, char[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([II[III)V"
	)
	static void ap(int[] var0, int var1, int[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([CI[CII)V"
	)
	static void az(char[] var0, int var1, char[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([II[III)V"
	)
	static void ac(int[] var0, int var1, int[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([SI[SII)V"
	)
	static void aq(short[] var0, int var1, short[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public static void bx(int[] var0, int var1, int var2) {
		var2 = var1 + var2 - 7;

		while (var1 < var2) {
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
		}

		var2 += 7;

		while (var1 < var2) {
			var0[var1++] = 0;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "([JI[JII)V"
	)
	static void bd(long[] var0, int var1, long[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	ya() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([FI[FII)V"
	)
	static void br(float[] var0, int var1, float[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([DI[DII)V"
	)
	static void be(double[] var0, int var1, double[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([DI[DII)V"
	)
	static void bs(double[] var0, int var1, double[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([JI[JII)V"
	)
	static void ae(long[] var0, int var1, long[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([DI[DII)V"
	)
	static void bk(double[] var0, int var1, double[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([DI[DII)V"
	)
	static void bh(double[] var0, int var1, double[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([ZI[ZII)V"
	)
	static void bf(boolean[] var0, int var1, boolean[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V"
	)
	static void by(Object[] var0, int var1, Object[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public static void bo(int[] var0, int var1, int var2) {
		var2 = var1 + var2 - 7;

		while (var1 < var2) {
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
		}

		var2 += 7;

		while (var1 < var2) {
			var0[var1++] = 0;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([IIII)V"
	)
	public static void bi(int[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				int var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([JI[JII)V"
	)
	static void bm(long[] var0, int var1, long[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V"
	)
	static void bl(Object[] var0, int var1, Object[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([ZI[ZII)V"
	)
	static void bj(boolean[] var0, int var1, boolean[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/Random;"
	)
	static Random bv(int var0, int var1) {
		if (var0 == 0 && var1 == 0) {
			var0 = (int)(Math.random() * 2.147483647E9);
			var1 = (int)(Math.random() * 2.147483647E9);
		}

		long var2 = (long)var0 << 32 | var1;
		return new Random(var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([JI[JII)V"
	)
	static void aj(long[] var0, int var1, long[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 3; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 3;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 3; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 3;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "([IIII)V"
	)
	public static void bu(int[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				int var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)V"
	)
	public static void an(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		if (var0 == var2) {
			if (var1 == var3) {
				return;
			}

			if (var3 > var1 && var3 < var1 + var4) {
				var1 += --var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				var4 -= 7;

				while (var1 >= var4) {
					var2[var3--] = var0[var1--];
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		var4 += 7;

		while (var1 < var4) {
			var2[var3++] = var0[var1++];
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([JIII)V"
	)
	public static void bc(long[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				long var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	public static void oz(lp var0) throws EOFException {
		var0.az(var0.ar_fld, var0.af_fld, var0.al_fld, var0.ax_fld, var0.an_fld, 1540294160);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)V"
	)
	public static void bw(Object[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				Object var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)V"
	)
	public static void ba(Object[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				Object var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)V"
	)
	public static void bq(Object[] var0, int var1, int var2, int var3) {
		Random var4 = af(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				Object var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}
	}
}
