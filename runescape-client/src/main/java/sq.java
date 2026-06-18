import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sq")
public class sq {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ak_fld = new int[5000];

	sq() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;)I"
	)
	public static int bm(sl var0, sl var1) {
		if (var0 == var1) {
			return 0;
		} else if (var0 == null) {
			return -1;
		} else if (var1 == null) {
			return 1;
		} else {
			int var2 = var0.av();
			int var3 = var1.av();
			int var4 = Math.min(var2, var3);
			if (yq.ak_fld == var0.ag_fld && yq.ak_fld == var1.ag_fld) {
				int[] var10 = var0.ak();
				int[] var12 = var1.ak();

				for (int var14 = 0; var14 < var4; var14++) {
					if (var10[var14] < var12[var14]) {
						return -1;
					}

					if (var10[var14] > var12[var14]) {
						return 1;
					}
				}
			} else if (var0.ag_fld == yq.ag_fld && var1.ag_fld == yq.ag_fld) {
				long[] var9 = sl.ob(var0, -1072346235);
				long[] var11 = sl.ob(var1, 565439115);

				for (int var13 = 0; var13 < var4; var13++) {
					if (var9[var13] < var11[var13]) {
						return -1;
					}

					if (var9[var13] > var11[var13]) {
						return 1;
					}
				}
			} else {
				if (yq.az_fld != var0.ag_fld || var1.ag_fld != yq.az_fld) {
					throw new RuntimeException();
				}

				Object[] var5 = (Object[])var0.az();
				Object[] var6 = (Object[])var1.az();

				for (int var7 = 0; var7 < var4; var7++) {
					int var8 = ((String)var5[var7]).compareTo((String)var6[var7]);
					if (var8 < 0) {
						return -1;
					}

					if (var8 > 0) {
						return 1;
					}
				}
			}

			return var2 < var3 ? -1 : (var2 == var3 ? 0 : 1);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int bd(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		if (yq.ak_fld == var0.ag_fld) {
			int[] var9 = var0.ak();
			int var11 = (Integer)var1;

			for (int var6 = var2; var6 < var3; var6++) {
				if (var9[var6] == var11) {
					return var6;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, 852438277);
			long var10 = (Long)var1;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var10 == var8[var7]) {
					return var7;
				}
			}
		} else {
			Object[] var4 = (Object[])var0.az();

			for (int var5 = var2; var5 < var3; var5++) {
				if (var1 == var4[var5] || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int bz(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();
			int var5 = (Integer)var1;

			for (int var6 = var2; var6 < var3; var6++) {
				if (var4[var6] == var5) {
					return var6;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, -1923213528);
			long var10 = (Long)var1;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var10 == var8[var7]) {
					return var7;
				}
			}
		} else {
			Object[] var9 = (Object[])var0.az();

			for (int var11 = var2; var11 < var3; var11++) {
				if (var1 == var9[var11] || var9[var11] != null && var9[var11].equals(var1)) {
					return var11;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int bs(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		if (yq.ak_fld == var0.ag_fld) {
			int[] var9 = var0.ak();
			int var11 = (Integer)var1;

			for (int var6 = var3 - 1; var6 >= var2; var6--) {
				if (var11 == var9[var6]) {
					return var6;
				}
			}
		} else if (var0.ag_fld == yq.ag_fld) {
			long[] var8 = sl.ob(var0, 1758745430);
			long var10 = (Long)var1;

			for (int var7 = var3 - 1; var7 >= var2; var7--) {
				if (var8[var7] == var10) {
					return var7;
				}
			}
		} else {
			Object[] var4 = (Object[])var0.az();

			for (int var5 = var3 - 1; var5 >= var2; var5--) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int bj(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		int var4 = 0;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var5 = var0.ak();
			int var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var6 == var5[var7]) {
					var4++;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var9 = sl.ob(var0, -1420841789);
			long var11 = (Long)var1;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var9[var8] == var11) {
					var4++;
				}
			}
		} else {
			Object[] var10 = (Object[])var0.az();

			for (int var12 = var2; var12 < var3; var12++) {
				if (var1 == var10[var12] || var10[var12] != null && var10[var12].equals(var1)) {
					var4++;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void cd(sl var0, int var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 >= 0 && var2 >= 0 && var1 < var0.av() && var2 < var0.av()) {
			if (var1 != var2) {
				if (yq.ak_fld == var0.ag_fld) {
					int[] var3 = var0.ak();
					int var4 = var3[var1];
					var3[var1] = var3[var2];
					var3[var2] = var4;
				} else if (var0.ag_fld == yq.ag_fld) {
					long[] var6 = sl.ob(var0, -2006579029);
					long var8 = var6[var1];
					var6[var1] = var6[var2];
					var6[var2] = var8;
				} else {
					Object[] var7 = (Object[])var0.az();
					Object var9 = var7[var1];
					var7[var1] = var7[var2];
					var7[var2] = var9;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int bh(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		int var4 = 0;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var5 = var0.ak();
			int var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var6 == var5[var7]) {
					var4++;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var9 = sl.ob(var0, 744197251);
			long var11 = (Long)var1;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var9[var8] == var11) {
					var4++;
				}
			}
		} else {
			Object[] var10 = (Object[])var0.az();

			for (int var12 = var2; var12 < var3; var12++) {
				if (var1 == var10[var12] || var10[var12] != null && var10[var12].equals(var1)) {
					var4++;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int bk(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		int var4 = 0;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var5 = var0.ak();
			int var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var6 == var5[var7]) {
					var4++;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var9 = sl.ob(var0, 1680499339);
			long var11 = (Long)var1;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var9[var8] == var11) {
					var4++;
				}
			}
		} else {
			Object[] var10 = (Object[])var0.az();

			for (int var12 = var2; var12 < var3; var12++) {
				if (var1 == var10[var12] || var10[var12] != null && var10[var12].equals(var1)) {
					var4++;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int br(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();
			int var5 = (Integer)var1;

			for (int var6 = var2; var6 < var3; var6++) {
				if (var4[var6] == var5) {
					return var6;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, 1428502617);
			long var10 = (Long)var1;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var10 == var8[var7]) {
					return var7;
				}
			}
		} else {
			Object[] var9 = (Object[])var0.az();

			for (int var11 = var2; var11 < var3; var11++) {
				if (var1 == var9[var11] || var9[var11] != null && var9[var11].equals(var1)) {
					return var11;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int bf(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		int var4 = 0;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var5 = var0.ak();
			int var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; var7++) {
				if (var6 == var5[var7]) {
					var4++;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var9 = sl.ob(var0, -798434355);
			long var11 = (Long)var1;

			for (int var8 = var2; var8 < var3; var8++) {
				if (var9[var8] == var11) {
					var4++;
				}
			}
		} else {
			Object[] var10 = (Object[])var0.az();

			for (int var12 = var2; var12 < var3; var12++) {
				if (var1 == var10[var12] || var10[var12] != null && var10[var12].equals(var1)) {
					var4++;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILsl;II)V"
	)
	static void dh(sl var0, int var1, sl var2, int var3, int var4) {
		if (var0.ag_fld == yq.ak_fld) {
			System.arraycopy(var0.aw_fld, var1, var2.aw_fld, var3, var4);
		} else if (yq.ag_fld == var0.ag_fld) {
			System.arraycopy(var0.ay_fld, var1, var2.ay_fld, var3, var4);
		} else {
			System.arraycopy((Object)var0.as_fld, var1, (Object)var2.as_fld, var3, var4);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void cz(sl var0, int var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.av_fld && var1 >= 0 && var1 + var2 <= var0.av_fld) {
				if (var2 < var0.av_fld - var1) {
					eb.aj(var0, var2 + var1, var0, var2, var0.av_fld - (var2 + var1));
				}

				var0.af(var0.av_fld - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)I"
	)
	public static int by(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var1 = 0;
		int var2 = var0.av();
		int var3 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();

			for (int var5 = var1; var5 < var2; var5++) {
				if (var3 == -1 || var4[var5] < var4[var3]) {
					var3 = var5;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, -148687895);

			for (int var10 = var1; var10 < var2; var10++) {
				if (-1 == var3 || var8[var10] < var8[var3]) {
					var3 = var10;
				}
			}
		} else if (yq.az_fld == var0.ag_fld) {
			String var9 = null;
			Object[] var11 = (Object[])var0.az();

			for (int var6 = var1; var6 < var2; var6++) {
				String var7 = (String)var11[var6];
				if (-1 == var3 || var7 != null && var7.compareTo(var9) < 0) {
					var3 = var6;
					var9 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)I"
	)
	public static int bo(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var1 = 0;
		int var2 = var0.av();
		int var3 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();

			for (int var5 = var1; var5 < var2; var5++) {
				if (-1 == var3 || var4[var5] > var4[var3]) {
					var3 = var5;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, -497096542);

			for (int var10 = var1; var10 < var2; var10++) {
				if (var3 == -1 || var8[var10] > var8[var3]) {
					var3 = var10;
				}
			}
		} else if (var0.ag_fld == yq.az_fld) {
			String var9 = null;
			Object[] var11 = (Object[])var0.az();

			for (int var6 = var1; var6 < var2; var6++) {
				String var7 = (String)var11[var6];
				if (var3 == -1 || null != var7 && var7.compareTo(var9) > 0) {
					var3 = var6;
					var9 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)I"
	)
	public static int bp(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var1 = 0;
		int var2 = var0.av();
		int var3 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();

			for (int var5 = var1; var5 < var2; var5++) {
				if (-1 == var3 || var4[var5] > var4[var3]) {
					var3 = var5;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, 1080773509);

			for (int var10 = var1; var10 < var2; var10++) {
				if (var3 == -1 || var8[var10] > var8[var3]) {
					var3 = var10;
				}
			}
		} else if (var0.ag_fld == yq.az_fld) {
			String var9 = null;
			Object[] var11 = (Object[])var0.az();

			for (int var6 = var1; var6 < var2; var6++) {
				String var7 = (String)var11[var6];
				if (var3 == -1 || null != var7 && var7.compareTo(var9) > 0) {
					var3 = var6;
					var9 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)I"
	)
	public static int bt(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var1 = 0;
		int var2 = var0.av();
		int var3 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();

			for (int var5 = var1; var5 < var2; var5++) {
				if (-1 == var3 || var4[var5] > var4[var3]) {
					var3 = var5;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, -1730206883);

			for (int var10 = var1; var10 < var2; var10++) {
				if (var3 == -1 || var8[var10] > var8[var3]) {
					var3 = var10;
				}
			}
		} else if (var0.ag_fld == yq.az_fld) {
			String var9 = null;
			Object[] var11 = (Object[])var0.az();

			for (int var6 = var1; var6 < var2; var6++) {
				String var7 = (String)var11[var6];
				if (var3 == -1 || null != var7 && var7.compareTo(var9) > 0) {
					var3 = var6;
					var9 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)I"
	)
	public static int bv(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var1 = 0;
		int var2 = var0.av();
		int var3 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();

			for (int var5 = var1; var5 < var2; var5++) {
				if (-1 == var3 || var4[var5] > var4[var3]) {
					var3 = var5;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, 1157632386);

			for (int var10 = var1; var10 < var2; var10++) {
				if (var3 == -1 || var8[var10] > var8[var3]) {
					var3 = var10;
				}
			}
		} else if (var0.ag_fld == yq.az_fld) {
			String var9 = null;
			Object[] var11 = (Object[])var0.az();

			for (int var6 = var1; var6 < var2; var6++) {
				String var7 = (String)var11[var6];
				if (var3 == -1 || null != var7 && var7.compareTo(var9) > 0) {
					var3 = var6;
					var9 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIB)Z"
	)
	public static boolean ak(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		return client.az(var0, var1, var2, var3, var8, var9, var10, var11)
			|| client.az(var2, var3, var4, var5, var8, var9, var10, var11)
			|| client.az(var4, var5, var6, var7, var8, var9, var10, var11)
			|| client.az(var6, var7, var0, var1, var8, var9, var10, var11);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)V"
	)
	public static void bu(sl var0, Object var1, int var2, int var3) {
		om.ap(var0, null, true, (byte)0);
		if (var2 < 0) {
			var2 = 0;
		}

		int var4 = var3 + var2;
		if (var3 < 0 || var4 < 0 || var4 > var0.av()) {
			var4 = var0.av();
		}

		if (var0.ag_fld == yq.ak_fld) {
			Arrays.fill(var0.ak(), var2, var4, ((Integer)var1).intValue());
		} else if (yq.ag_fld == var0.ag_fld) {
			Arrays.fill(sl.ob(var0, -2109867372), var2, var4, ((Long)var1).longValue());
		} else {
			Arrays.fill((Object[])var0.az(), var2, var4, var1);
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)V"
	)
	public static void bn(sl var0, Object var1, int var2, int var3) {
		om.ap(var0, null, true, (byte)0);
		if (var2 < 0) {
			var2 = 0;
		}

		int var4 = var3 + var2;
		if (var3 < 0 || var4 < 0 || var4 > var0.av()) {
			var4 = var0.av();
		}

		if (var0.ag_fld == yq.ak_fld) {
			Arrays.fill(var0.ak(), var2, var4, ((Integer)var1).intValue());
		} else if (yq.ag_fld == var0.ag_fld) {
			Arrays.fill(sl.ob(var0, 416181263), var2, var4, ((Long)var1).longValue());
		} else {
			Arrays.fill((Object[])var0.az(), var2, var4, var1);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lsl;IIII)V"
	)
	public static void bc(sl var0, int var1, int var2, int var3, int var4) {
		yq var5 = yq.ak_fld;
		om.ap(var0, var5, true, (byte)0);
		if (var3 < 0) {
			var3 = 0;
		}

		int var6 = var3 + var4;
		if (var4 < 0 || var6 < 0 || var6 > var0.av()) {
			var6 = var0.av();
		}

		int[] var7 = var0.ak();
		int var8 = var1;

		for (int var9 = var3; var9 < var6; var9++) {
			var7[var9] = var8;
			var8 += var2;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lsl;IIII)V"
	)
	public static void bw(sl var0, int var1, int var2, int var3, int var4) {
		yq var5 = yq.ak_fld;
		om.ap(var0, var5, true, (byte)0);
		if (var3 < 0) {
			var3 = 0;
		}

		int var6 = var3 + var4;
		if (var4 < 0 || var6 < 0 || var6 > var0.av()) {
			var6 = var0.av();
		}

		int[] var7 = var0.ak();
		int var8 = var1;

		for (int var9 = var3; var9 < var6; var9++) {
			var7[var9] = var8;
			var8 += var2;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void ba(sl var0, int var1) {
		om.ap(var0, null, true, (byte)0);
		int var2 = var0.av();
		if (var2 > 1) {
			var1 %= var2;
			if (0 != var1) {
				if (var1 < 0) {
					var1 += var2;
				}

				if (var0.ag_fld == yq.ak_fld) {
					int[] var3 = var0.ak();
					int[] var4 = var3;
					int var5 = 0;

					for (int var6 = var2 - 1; var5 < var6; var6--) {
						int var7 = var4[var5];
						var4[var5] = var4[var6];
						var4[var6] = var7;
						var5++;
					}

					int[] var17 = var3;
					int var8 = 0;

					for (int var9 = var1 - 1; var8 < var9; var9--) {
						int var10 = var17[var8];
						var17[var8] = var17[var9];
						var17[var9] = var10;
						var8++;
					}

					int[] var18 = var3;
					int var11 = var1;

					for (int var12 = var2 - 1; var11 < var12; var12--) {
						int var13 = var18[var11];
						var18[var11] = var18[var12];
						var18[var12] = var13;
						var11++;
					}
				} else if (yq.ag_fld == var0.ag_fld) {
					long[] var15 = sl.ob(var0, 15898882);
					px.at(var15, 0, var2 - 1);
					px.at(var15, 0, var1 - 1);
					px.at(var15, var1, var2 - 1);
				} else {
					Object[] var16 = (Object[])var0.az();
					qn.ac((Object[])var16, 0, var2 - 1);
					qn.ac((Object[])var16, 0, var1 - 1);
					qn.ac((Object[])var16, var1, var2 - 1);
				}
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void bq(sl var0, int var1) {
		om.ap(var0, null, true, (byte)0);
		int var2 = var0.av();
		if (var2 > 1) {
			var1 %= var2;
			if (0 != var1) {
				if (var1 < 0) {
					var1 += var2;
				}

				if (var0.ag_fld == yq.ak_fld) {
					int[] var3 = var0.ak();
					int[] var4 = var3;
					int var5 = 0;

					for (int var6 = var2 - 1; var5 < var6; var6--) {
						int var7 = var4[var5];
						var4[var5] = var4[var6];
						var4[var6] = var7;
						var5++;
					}

					int[] var17 = var3;
					int var8 = 0;

					for (int var9 = var1 - 1; var8 < var9; var9--) {
						int var10 = var17[var8];
						var17[var8] = var17[var9];
						var17[var9] = var10;
						var8++;
					}

					int[] var18 = var3;
					int var11 = var1;

					for (int var12 = var2 - 1; var11 < var12; var12--) {
						int var13 = var18[var11];
						var18[var11] = var18[var12];
						var18[var12] = var13;
						var11++;
					}
				} else if (yq.ag_fld == var0.ag_fld) {
					long[] var15 = sl.ob(var0, 1756279572);
					px.at(var15, 0, var2 - 1);
					px.at(var15, 0, var1 - 1);
					px.at(var15, var1, var2 - 1);
				} else {
					Object[] var16 = (Object[])var0.az();
					qn.ac((Object[])var16, 0, var2 - 1);
					qn.ac((Object[])var16, 0, var1 - 1);
					qn.ac((Object[])var16, var1, var2 - 1);
				}
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;II)V"
	)
	static void cl(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			var1++;
			var2--;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void bb(sl var0, int var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 >= 0 && var2 >= 0 && var1 < var0.av() && var2 < var0.av()) {
			if (var1 != var2) {
				if (yq.ak_fld == var0.ag_fld) {
					int[] var3 = var0.ak();
					int var4 = var3[var1];
					var3[var1] = var3[var2];
					var3[var2] = var4;
				} else if (var0.ag_fld == yq.ag_fld) {
					long[] var6 = sl.ob(var0, -1943872960);
					long var8 = var6[var1];
					var6[var1] = var6[var2];
					var6[var2] = var8;
				} else {
					Object[] var7 = (Object[])var0.az();
					Object var9 = var7[var1];
					var7[var1] = var7[var2];
					var7[var2] = var9;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void bg(sl var0, int var1) {
		om.ap(var0, null, true, (byte)0);
		int var2 = var0.av();
		if (var2 > 1) {
			var1 %= var2;
			if (0 != var1) {
				if (var1 < 0) {
					var1 += var2;
				}

				if (var0.ag_fld == yq.ak_fld) {
					int[] var3 = var0.ak();
					int[] var4 = var3;
					int var5 = 0;

					for (int var6 = var2 - 1; var5 < var6; var6--) {
						int var7 = var4[var5];
						var4[var5] = var4[var6];
						var4[var6] = var7;
						var5++;
					}

					int[] var17 = var3;
					int var8 = 0;

					for (int var9 = var1 - 1; var8 < var9; var9--) {
						int var10 = var17[var8];
						var17[var8] = var17[var9];
						var17[var9] = var10;
						var8++;
					}

					int[] var18 = var3;
					int var11 = var1;

					for (int var12 = var2 - 1; var11 < var12; var12--) {
						int var13 = var18[var11];
						var18[var11] = var18[var12];
						var18[var12] = var13;
						var11++;
					}
				} else if (yq.ag_fld == var0.ag_fld) {
					long[] var15 = sl.ob(var0, 92758881);
					px.at(var15, 0, var2 - 1);
					px.at(var15, 0, var1 - 1);
					px.at(var15, var1, var2 - 1);
				} else {
					Object[] var16 = (Object[])var0.az();
					qn.ac((Object[])var16, 0, var2 - 1);
					qn.ac((Object[])var16, 0, var1 - 1);
					qn.ac((Object[])var16, var1, var2 - 1);
				}
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)V"
	)
	public static void bi(sl var0, Object var1, int var2, int var3) {
		om.ap(var0, null, true, (byte)0);
		if (var2 < 0) {
			var2 = 0;
		}

		int var4 = var3 + var2;
		if (var3 < 0 || var4 < 0 || var4 > var0.av()) {
			var4 = var0.av();
		}

		if (var0.ag_fld == yq.ak_fld) {
			Arrays.fill(var0.ak(), var2, var4, ((Integer)var1).intValue());
		} else if (yq.ag_fld == var0.ag_fld) {
			Arrays.fill(sl.ob(var0, -1095206244), var2, var4, ((Long)var1).longValue());
		} else {
			Arrays.fill((Object[])var0.az(), var2, var4, var1);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;)V"
	)
	public static void cq(sl var0, sl var1) {
		if (null != var0 && var0.av() > 1) {
			om.ap(var0, null, true, (byte)0);
			if (null != var1) {
				om.ap(var1, null, true, (byte)0);
			}

			int var2 = var0.av();
			if (null != var1 && var1.av() < var2) {
				throw new RuntimeException();
			} else {
				if (var0.ag_fld == yq.ak_fld) {
					if (null == var1) {
						ti.ah(var0.ak(), ak_fld, 0, var2 - 1);
					} else if (var1.ag_fld == yq.ak_fld) {
						ti.ah(var0.ak(), var1.ak(), 0, var2 - 1);
					} else if (var1.ag_fld == yq.ag_fld) {
						ft.aw(var0.ak(), sl.ob(var1, -1885383181), 0, var2 - 1);
					} else {
						id.al(var0.ak(), (Object[])var1.az(), 0, var2 - 1, (byte)50);
					}
				} else if (var0.ag_fld == yq.ag_fld) {
					if (var1 == null) {
						Arrays.sort(sl.ob(var0, 1385428298), 0, var2);
					} else if (var1.ag_fld == yq.ak_fld) {
						gd.ay(sl.ob(var0, -1556105245), var1.ak(), 0, var2 - 1, 382724211);
					} else if (yq.ag_fld == var1.ag_fld) {
						as(sl.ob(var0, -383313626), sl.ob(var1, -1016558671), 0, var2 - 1);
					} else {
						nd.au(sl.ob(var0, 4652730), (Object[])var1.az(), 0, var2 - 1);
					}
				} else {
					if (yq.az_fld != var0.ag_fld) {
						throw new RuntimeException();
					}

					if (var1 == null) {
						Arrays.sort((Object[])var0.az(), 0, var2);
					} else if (yq.ak_fld == var1.ag_fld) {
						mf.az((String[])(String[])var0.az(), var1.ak(), 0, var2 - 1);
					} else if (var1.ag_fld == yq.ag_fld) {
						md.av((String[])(String[])var0.az(), sl.ob(var1, -719295368), 0, var2 - 1);
					} else {
						wn.ae((String[])(String[])var0.az(), (Object[])var1.az(), 0, var2 - 1, 1669446353);
					}
				}
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;)V"
	)
	public static void cv(sl var0, sl var1) {
		if (null != var0 && var0.av() > 1) {
			om.ap(var0, null, true, (byte)0);
			if (null != var1) {
				om.ap(var1, null, true, (byte)0);
			}

			int var2 = var0.av();
			if (null != var1 && var1.av() < var2) {
				throw new RuntimeException();
			} else {
				if (var0.ag_fld == yq.ak_fld) {
					if (null == var1) {
						ti.ah(var0.ak(), ak_fld, 0, var2 - 1);
					} else if (var1.ag_fld == yq.ak_fld) {
						ti.ah(var0.ak(), var1.ak(), 0, var2 - 1);
					} else if (var1.ag_fld == yq.ag_fld) {
						ft.aw(var0.ak(), sl.ob(var1, -326221019), 0, var2 - 1);
					} else {
						id.al(var0.ak(), (Object[])var1.az(), 0, var2 - 1, (byte)3);
					}
				} else if (var0.ag_fld == yq.ag_fld) {
					if (var1 == null) {
						Arrays.sort(sl.ob(var0, 1002103640), 0, var2);
					} else if (var1.ag_fld == yq.ak_fld) {
						gd.ay(sl.ob(var0, 1758560048), var1.ak(), 0, var2 - 1, 753623135);
					} else if (yq.ag_fld == var1.ag_fld) {
						as(sl.ob(var0, 1653120782), sl.ob(var1, 126988652), 0, var2 - 1);
					} else {
						nd.au(sl.ob(var0, -1024879489), (Object[])var1.az(), 0, var2 - 1);
					}
				} else {
					if (yq.az_fld != var0.ag_fld) {
						throw new RuntimeException();
					}

					if (var1 == null) {
						Arrays.sort((Object[])var0.az(), 0, var2);
					} else if (yq.ak_fld == var1.ag_fld) {
						mf.az((String[])(String[])var0.az(), var1.ak(), 0, var2 - 1);
					} else if (var1.ag_fld == yq.ag_fld) {
						md.av((String[])(String[])var0.az(), sl.ob(var1, -609142473), 0, var2 - 1);
					} else {
						wn.ae((String[])(String[])var0.az(), (Object[])var1.az(), 0, var2 - 1, 1669446353);
					}
				}
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void cy(sl var0, int var1, int var2) {
		if (var0 != null && var0.av() > 1) {
			om.ap(var0, null, true, (byte)0);
			if (yq.ak_fld == var0.ag_fld) {
				ya.al(var0.ak(), var0.av(), var1, var2);
			} else if (yq.ag_fld == var0.ag_fld) {
				ya.au(sl.ob(var0, -1906927545), var0.av(), var1, var2);
			} else {
				ya.ax((Object[])var0.az(), var0.av(), var1, var2);
			}
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void cf(sl var0, int var1, int var2) {
		if (var0 != null && var0.av() > 1) {
			om.ap(var0, null, true, (byte)0);
			if (yq.ak_fld == var0.ag_fld) {
				ya.al(var0.ak(), var0.av(), var1, var2);
			} else if (yq.ag_fld == var0.ag_fld) {
				ya.au(sl.ob(var0, 1818456784), var0.av(), var1, var2);
			} else {
				ya.ax((Object[])var0.az(), var0.av(), var1, var2);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([J[JIII)V"
	)
	public static void as(long[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			long var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			long var9 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var9;
			long var11 = Long.MAX_VALUE == var7 ? 0L : 1L;

			for (int var13 = var2; var13 < var3; var13++) {
				if (var0[var13] < var7 + (var13 & var11)) {
					long var14 = var0[var13];
					var0[var13] = var0[var6];
					var0[var6] = var14;
					long var16 = var1[var13];
					var1[var13] = var1[var6];
					var1[var6++] = var16;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var9;
			as(var0, var1, var2, var6 - 1);
			as(var0, var1, var6 + 1, var3);
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)J"
	)
	public static long cs(sl var0) {
		yq var1 = yq.ak_fld;
		om.ap(var0, var1, false, (byte)0);
		int[] var2 = var0.ak();
		int var3 = var0.av();
		long var4 = 0L;

		for (int var6 = 0; var6 < var3; var6++) {
			var4 += var2[var6];
		}

		return var4;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)I"
	)
	public static int cp(sl var0, int var1) {
		yq var2 = yq.ak_fld;
		om.ap(var0, var2, false, (byte)0);
		if (var1 >= 0) {
			int[] var3 = var0.ak();
			int var4 = var0.av();

			for (int var5 = 0; var5 < var4; var5++) {
				if (var1 < var3[var5]) {
					return var5;
				}

				var1 -= var3[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)Lsl;"
	)
	public static sl ce(String var0, String var1) {
		if (null != var1 && !var1.isEmpty()) {
			int var2 = var1.length();
			int var3 = 1;
			int var4 = 0;

			while ((var4 = var0.indexOf(var1, var4)) != -1) {
				var3++;
				var4 += var2;
			}

			sl var5 = new sl(yq.az_fld, null, var3, var3);
			int var6 = 0;
			var4 = 0;

			for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
				var5.az()[var3++] = var0.substring(var6, var4);
				var4 += var2;
			}

			var5.az()[var3] = var0.substring(var6);
			return var5;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String cn(sl var0, String var1) {
		yq var2 = yq.az_fld;
		om.ap(var0, var2, false, (byte)0);
		int var3 = var0.av();
		String[] var4 = (String[])(String[])var0.az();
		if (0 == var3) {
			return "";
		} else if (1 == var3) {
			return var4[0];
		} else {
			int var5 = var1.length();
			int var6 = (var3 - 1) * var5;

			for (int var7 = 0; var7 < var3; var7++) {
				var6 += var4[var7].length();
			}

			char[] var10 = new char[var6];
			int var8 = 0;

			for (int var9 = 0; var9 < var3; var9++) {
				if (var9 > 0) {
					var1.getChars(0, var5, var10, var8);
					var8 += var5;
				}

				var4[var9].getChars(0, var4[var9].length(), var10, var8);
				var8 += var4[var9].length();
			}

			return new String(var10);
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)Ltu;"
	)
	static tu ek() {
		dx var1 = client.da_fld.ae(client.es_fld, (byte)-7);
		cv var3 = dx.pe(var1, client.dj_fld);
		if (var3 != null) {
			tu var8 = mf.bn(var1, var3.dp(694494426), var3.dj(189745805));
			var8.ay_fld = var3.ak(-1212899817);
			return var8;
		} else {
			synchronized (tu.ae_fld) {
				tu var4;
				if (tu.aw_fld == 0) {
					var4 = new tu();
				} else {
					tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].as();
					var4 = tu.ae_fld[tu.aw_fld];
				}

				return var4;
			}
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILjava/lang/Object;)V"
	)
	public static void ca(sl var0, int var1, Object var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 >= 0 && var1 <= var0.av_fld) {
			var0.ay(1 + var0.av_fld, -210674912);
			if (var1 < var0.av_fld) {
				eb.aj(var0, var1, var0, 1 + var1, var0.av_fld - var1);
			}

			var0.ah(var1, var2);
			var0.av_fld++;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILjava/lang/Object;)V"
	)
	public static void cg(sl var0, int var1, Object var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 >= 0 && var1 <= var0.av_fld) {
			var0.ay(1 + var0.av_fld, -210674912);
			if (var1 < var0.av_fld) {
				eb.aj(var0, var1, var0, 1 + var1, var0.av_fld - var1);
			}

			var0.ah(var1, var2);
			var0.av_fld++;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)J"
	)
	public static long cx(sl var0) {
		yq var1 = yq.ak_fld;
		om.ap(var0, var1, false, (byte)0);
		int[] var2 = var0.ak();
		int var3 = var0.av();
		long var4 = 0L;

		for (int var6 = 0; var6 < var3; var6++) {
			var4 += var2[var6];
		}

		return var4;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;I)V"
	)
	public static void cm(sl var0, sl var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		yq var3 = var0.ag_fld;
		om.ap(var1, var3, false, (byte)0);
		if (var2 < 0 || var2 > var0.av_fld) {
			throw new RuntimeException();
		} else if (0 != var1.av_fld) {
			var0.ay(var0.av_fld + var1.av_fld, -210674912);
			if (var2 < var0.av_fld) {
				eb.aj(var0, var2, var0, var1.av_fld + var2, var0.av_fld - var2);
			}

			eb.aj(var1, 0, var0, var2, var1.av_fld);
			var0.av_fld = var0.av_fld + var1.av_fld;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)I"
	)
	public static int bl(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var1 = 0;
		int var2 = var0.av();
		int var3 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();

			for (int var5 = var1; var5 < var2; var5++) {
				if (var3 == -1 || var4[var5] < var4[var3]) {
					var3 = var5;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, 1131672013);

			for (int var10 = var1; var10 < var2; var10++) {
				if (-1 == var3 || var8[var10] < var8[var3]) {
					var3 = var10;
				}
			}
		} else if (yq.az_fld == var0.ag_fld) {
			String var9 = null;
			Object[] var11 = (Object[])var0.az();

			for (int var6 = var1; var6 < var2; var6++) {
				String var7 = (String)var11[var6];
				if (-1 == var3 || var7 != null && var7.compareTo(var9) < 0) {
					var3 = var6;
					var9 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void ck(sl var0, int var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.av_fld && var1 >= 0 && var1 + var2 <= var0.av_fld) {
				if (var2 < var0.av_fld - var1) {
					eb.aj(var0, var2 + var1, var0, var2, var0.av_fld - (var2 + var1));
				}

				var0.af(var0.av_fld - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void cb(sl var0, int var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.av_fld && var1 >= 0 && var1 + var2 <= var0.av_fld) {
				if (var2 < var0.av_fld - var1) {
					eb.aj(var0, var2 + var1, var0, var2, var0.av_fld - (var2 + var1));
				}

				var0.af(var0.av_fld - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)Ljava/lang/Object;"
	)
	public static Object cw(sl var0, int var1) {
		om.ap(var0, null, true, (byte)0);
		if (var1 >= 0 && var1 < var0.av_fld) {
			Object var2 = var0.ae(var1);
			if (var1 < var0.av_fld - 1) {
				eb.aj(var0, 1 + var1, var0, var1, var0.av_fld - (1 + var1));
			}

			var0.af(var0.av_fld - 1);
			return var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lyq;Z)V"
	)
	static void cu(sl var0, yq var1, boolean var2) {
		if (null == var0) {
			throw new RuntimeException();
		} else if (null != var1 && var0.ag_fld != var1) {
			throw new RuntimeException();
		} else if (var2 && !var0.az_fld) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lyq;Z)V"
	)
	static void ci(sl var0, yq var1, boolean var2) {
		if (null == var0) {
			throw new RuntimeException();
		} else if (null != var1 && var0.ag_fld != var1) {
			throw new RuntimeException();
		} else if (var2 && !var0.az_fld) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([JII)V"
	)
	static void cj(long[] var0, int var1, int var2) {
		while (var1 < var2) {
			long var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			var1++;
			var2--;
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([JII)V"
	)
	static void ch(long[] var0, int var1, int var2) {
		while (var1 < var2) {
			long var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			var1++;
			var2--;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)V"
	)
	public static void co(sl var0, int var1, int var2) {
		om.ap(var0, null, true, (byte)0);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.av_fld && var1 >= 0 && var1 + var2 <= var0.av_fld) {
				if (var2 < var0.av_fld - var1) {
					eb.aj(var0, var2 + var1, var0, var2, var0.av_fld - (var2 + var1));
				}

				var0.af(var0.av_fld - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/Object;II)I"
	)
	public static int be(sl var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.av()) {
			var3 = var0.av();
		}

		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();
			int var5 = (Integer)var1;

			for (int var6 = var3 - 1; var6 >= var2; var6--) {
				if (var5 == var4[var6]) {
					return var6;
				}
			}
		} else if (var0.ag_fld == yq.ag_fld) {
			long[] var8 = sl.ob(var0, -1843585910);
			long var10 = (Long)var1;

			for (int var7 = var3 - 1; var7 >= var2; var7--) {
				if (var8[var7] == var10) {
					return var7;
				}
			}
		} else {
			Object[] var9 = (Object[])var0.az();

			for (int var11 = var3 - 1; var11 >= var2; var11--) {
				if (var9[var11] == var1 || var9[var11] != null && var9[var11].equals(var1)) {
					return var11;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;III)V"
	)
	public static void cc(sl var0, sl var1, int var2, int var3, int var4) {
		om.ap(var0, null, false, (byte)0);
		yq var5 = var0.ag_fld;
		om.ap(var1, var5, true, (byte)0);
		int var6 = var0.av();
		int var7 = var1.av();
		if (var4 == -1) {
			var4 = var0.av() - var2;
		}

		if (0 != var4 && (var0 != var1 || var3 != var2)) {
			if (var2 >= 0 && var2 + var4 <= var6 && var3 >= 0 && var4 + var3 <= var7) {
				eb.aj(var0, var2, var1, var3, var4);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String cr(sl var0, String var1) {
		yq var2 = yq.az_fld;
		om.ap(var0, var2, false, (byte)0);
		int var3 = var0.av();
		String[] var4 = (String[])(String[])var0.az();
		if (0 == var3) {
			return "";
		} else if (1 == var3) {
			return var4[0];
		} else {
			int var5 = var1.length();
			int var6 = (var3 - 1) * var5;

			for (int var7 = 0; var7 < var3; var7++) {
				var6 += var4[var7].length();
			}

			char[] var10 = new char[var6];
			int var8 = 0;

			for (int var9 = 0; var9 < var3; var9++) {
				if (var9 > 0) {
					var1.getChars(0, var5, var10, var8);
					var8 += var5;
				}

				var4[var9].getChars(0, var4[var9].length(), var10, var8);
				var8 += var4[var9].length();
			}

			return new String(var10);
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILsl;II)V"
	)
	static void dv(sl var0, int var1, sl var2, int var3, int var4) {
		if (var0.ag_fld == yq.ak_fld) {
			System.arraycopy(var0.aw_fld, var1, var2.aw_fld, var3, var4);
		} else if (yq.ag_fld == var0.ag_fld) {
			System.arraycopy(var0.ay_fld, var1, var2.ay_fld, var3, var4);
		} else {
			System.arraycopy((Object)var0.as_fld, var1, (Object)var2.as_fld, var3, var4);
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILsl;II)V"
	)
	static void dz(sl var0, int var1, sl var2, int var3, int var4) {
		if (var0.ag_fld == yq.ak_fld) {
			System.arraycopy(var0.aw_fld, var1, var2.aw_fld, var3, var4);
		} else if (yq.ag_fld == var0.ag_fld) {
			System.arraycopy(var0.ay_fld, var1, var2.ay_fld, var3, var4);
		} else {
			System.arraycopy((Object)var0.as_fld, var1, (Object)var2.as_fld, var3, var4);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	static final boolean ag(int var0) {
		return 7 == var0 || 8 == var0 || var0 >= 9 && var0 <= 13;
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ei() {
		cv var1 = ot.ef();
		return null != var1 ? var1.ad_fld : 0;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)I"
	)
	public static int bx(sl var0) {
		om.ap(var0, null, false, (byte)0);
		byte var1 = 0;
		int var2 = var0.av();
		int var3 = -1;
		if (yq.ak_fld == var0.ag_fld) {
			int[] var4 = var0.ak();

			for (int var5 = var1; var5 < var2; var5++) {
				if (var3 == -1 || var4[var5] < var4[var3]) {
					var3 = var5;
				}
			}
		} else if (yq.ag_fld == var0.ag_fld) {
			long[] var8 = sl.ob(var0, -411056230);

			for (int var10 = var1; var10 < var2; var10++) {
				if (-1 == var3 || var8[var10] < var8[var3]) {
					var3 = var10;
				}
			}
		} else if (yq.az_fld == var0.ag_fld) {
			String var9 = null;
			Object[] var11 = (Object[])var0.az();

			for (int var6 = var1; var6 < var2; var6++) {
				String var7 = (String)var11[var6];
				if (-1 == var3 || var7 != null && var7.compareTo(var9) < 0) {
					var3 = var6;
					var9 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;II)V"
	)
	static void ct(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			var1++;
			var2--;
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lxv;J)Lvw;"
	)
	public static vw jx(xv var0, long var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak(var1);
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;II)V"
	)
	static void dc(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			var1++;
			var2--;
		}
	}
}
