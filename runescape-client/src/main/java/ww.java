import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ww")
public class ww {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int be_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ao_fld;

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([J[Ljava/lang/Object;II)V"
	)
	public static void bn(long[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = Long.MAX_VALUE == var6 ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < var6 + (var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					Object var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			nd.au(var0, (Object[])var1, var2, var5 - 1);
			nd.au(var0, (Object[])var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[S)V"
	)
	public static void ax(String[] var0, short[] var1) {
		tz.ag(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([I[III)V"
	)
	public static void bz(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = Integer.MAX_VALUE == var6 ? 0 : 1;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			ti.ah(var0, var1, var2, var5 - 1);
			ti.ah(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[III)V"
	)
	public static void ad(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (null == var6 || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			mf.az(var0, var1, var2, var5 - 1);
			mf.az(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SII)V"
	)
	static void ai(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			tz.ag(var0, var1, var2, var5 - 1);
			tz.ag(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([F[I)V"
	)
	public static void bo(float[] var0, int[] var1) {
		uv.af(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[III)V"
	)
	public static void am(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (null == var6 || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			mf.az(var0, var1, var2, var5 - 1);
			mf.az(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SII)V"
	)
	static void aq(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			tz.ag(var0, var1, var2, var5 - 1);
			tz.ag(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[III)V"
	)
	public static void ao(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (null == var6 || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			mf.az(var0, var1, var2, var5 - 1);
			mf.az(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SII)V"
	)
	static void aa(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			tz.ag(var0, var1, var2, var5 - 1);
			tz.ag(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[III)V"
	)
	public static void ap(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (null == var6 || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			mf.az(var0, var1, var2, var5 - 1);
			mf.az(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[JII)V"
	)
	public static void at(String[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var9 = var2; var9 < var3; var9++) {
				if (null == var6 || null != var0[var9] && var0[var9].compareTo(var6) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					long var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			md.av(var0, var1, var2, var5 - 1);
			md.av(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[JII)V"
	)
	public static void ac(String[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var9 = var2; var9 < var3; var9++) {
				if (null == var6 || null != var0[var9] && var0[var9].compareTo(var6) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					long var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			md.av(var0, var1, var2, var5 - 1);
			md.av(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V"
	)
	public static void aj(String[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					Object var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			wn.ae(var0, (Object[])var1, var2, var5 - 1, 1669446353);
			wn.ae(var0, (Object[])var1, var5 + 1, var3, 1669446353);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V"
	)
	public static void bm(String[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					Object var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			wn.ae(var0, (Object[])var1, var2, var5 - 1, 1669446353);
			wn.ae(var0, (Object[])var1, var5 + 1, var3, 1669446353);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "([I[III)V"
	)
	public static void bd(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = Integer.MAX_VALUE == var6 ? 0 : 1;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			ti.ah(var0, var1, var2, var5 - 1);
			ti.ah(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "([J[Ljava/lang/Object;II)V"
	)
	public static void bu(long[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = Long.MAX_VALUE == var6 ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < var6 + (var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					Object var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			nd.au(var0, (Object[])var1, var2, var5 - 1);
			nd.au(var0, (Object[])var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([J[III)V"
	)
	public static void bs(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < var6 + (var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			gd.ay(var0, var1, var2, var5 - 1, 674803986);
			gd.ay(var0, var1, var5 + 1, var3, 153090981);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([I[III)V"
	)
	public static void be(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = Integer.MAX_VALUE == var6 ? 0 : 1;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			ti.ah(var0, var1, var2, var5 - 1);
			ti.ah(var0, var1, 1 + var5, var3);
		}
	}

	ww() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([J[III)V"
	)
	public static void bh(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < var6 + (var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			gd.ay(var0, var1, var2, var5 - 1, 859945806);
			gd.ay(var0, var1, var5 + 1, var3, 582879188);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[III)V"
	)
	public static void ab(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (null == var6 || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			mf.az(var0, var1, var2, var5 - 1);
			mf.az(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([J[III)V"
	)
	public static void bk(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < var6 + (var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			gd.ay(var0, var1, var2, var5 - 1, -40112679);
			gd.ay(var0, var1, var5 + 1, var3, 662492000);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([J[III)V"
	)
	public static void bf(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < var6 + (var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			gd.ay(var0, var1, var2, var5 - 1, 569159822);
			gd.ay(var0, var1, var5 + 1, var3, 1055786966);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([J[JII)V"
	)
	public static void by(long[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			long var10 = Long.MAX_VALUE == var6 ? 0L : 1L;

			for (int var12 = var2; var12 < var3; var12++) {
				if (var0[var12] < var6 + (var12 & var10)) {
					long var13 = var0[var12];
					var0[var12] = var0[var5];
					var0[var5] = var13;
					long var15 = var1[var12];
					var1[var12] = var1[var5];
					var1[var5++] = var15;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			sq.as(var0, var1, var2, var5 - 1);
			sq.as(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([J[JII)V"
	)
	public static void bl(long[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			long var10 = Long.MAX_VALUE == var6 ? 0L : 1L;

			for (int var12 = var2; var12 < var3; var12++) {
				if (var0[var12] < var6 + (var12 & var10)) {
					long var13 = var0[var12];
					var0[var12] = var0[var5];
					var0[var5] = var13;
					long var15 = var1[var12];
					var1[var12] = var1[var5];
					var1[var5++] = var15;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			sq.as(var0, var1, var2, var5 - 1);
			sq.as(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([J[JII)V"
	)
	public static void bx(long[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			long var10 = Long.MAX_VALUE == var6 ? 0L : 1L;

			for (int var12 = var2; var12 < var3; var12++) {
				if (var0[var12] < var6 + (var12 & var10)) {
					long var13 = var0[var12];
					var0[var12] = var0[var5];
					var0[var5] = var13;
					long var15 = var1[var12];
					var1[var12] = var1[var5];
					var1[var5++] = var15;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			sq.as(var0, var1, var2, var5 - 1);
			sq.as(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([J[III)V"
	)
	public static void bj(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < var6 + (var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			gd.ay(var0, var1, var2, var5 - 1, 1197214870);
			gd.ay(var0, var1, var5 + 1, var3, 868414068);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([F[III)V"
	)
	static void bp(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			uv.af(var0, var1, var2, var5 - 1);
			uv.af(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([F[III)V"
	)
	static void bt(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			uv.af(var0, var1, var2, var5 - 1);
			uv.af(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([F[III)V"
	)
	static void bv(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var2 + var3) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			uv.af(var0, var1, var2, var5 - 1);
			uv.af(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([I[Ljava/lang/Object;II)V"
	)
	public static void bi(int[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var0[var9] < var6 + (var9 & var8)) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					Object var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			id.al(var0, (Object[])var1, var2, var5 - 1, (byte)25);
			id.al(var0, (Object[])var1, 1 + var5, var3, (byte)94);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([I[III)V"
	)
	public static void br(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = Integer.MAX_VALUE == var6 ? 0 : 1;

			for (int var9 = var2; var9 < var3; var9++) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			ti.ah(var0, var1, var2, var5 - 1);
			ti.ah(var0, var1, 1 + var5, var3);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[S)V"
	)
	public static void an(String[] var0, short[] var1) {
		tz.ag(var0, var1, 0, var0.length - 1);
	}
}
