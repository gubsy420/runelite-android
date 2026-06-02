import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zc")
public class zc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	static long[] ak_fld = new long[65];

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ai(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 0xFF;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ab(int var0) {
		var0 = (var0 & -1890783705) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 173066631) + (var0 >>> 2 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 0xFF;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public static long ax(int var0) {
		return ak_fld[var0];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public static long an(int var0) {
		return ak_fld[var0];
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lsn;)I"
	)
	public static int op(sn var0) {
		return var0.ao_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public static long aa(int var0) {
		return ak_fld[var0];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int aj(int var0, int var1, int var2) {
		int var3 = (int)ub.ak(1 + (var2 - var1), -1793925999);
		var3 <<= var1;
		int var4;
		return var4 = var0 & ~var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aq(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 0xFF;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int ac(int var0, int var1, int var2) {
		int var3 = (int)ub.ak(1 + (var2 - var1), -1793925999);
		var3 <<= var1;
		int var4;
		return var4 = var0 & ~var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ad(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 0xFF;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ao(int var0) {
		var0 = (var0 & -965390325) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 1170446163) + (var0 >>> 2 & 858993459);
		var0 = var0 + (var0 >>> 4) & -1307732892;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 0xFF;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int am(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 0xFF;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int ap(long var0) {
		var0 = (var0 >>> 1 & 6148914691236517205L) + (var0 & 6148914691236517205L);
		var0 = (var0 & 3689348814741910323L) + (var0 >>> 2 & 3689348814741910323L);
		var0 = (var0 >>> 4) + var0 & 1085102592571150095L;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		var0 += var0 >>> 12121022;
		return (int)(var0 & 255L);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int at(int var0, int var1, int var2) {
		int var3 = (int)ub.ak(1 + (var2 - var1), -1793925999);
		var3 <<= var1;
		int var4;
		return var4 = var0 & ~var3;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int by(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			var1++;
		}

		return var0 + var1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public static long bv(int var0) {
		if (var0 > 63) {
			throw new pz(
				"Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d",
				(Object[])(new Object[]{var0})
			);
		} else {
			return (long)Math.pow(2.0, var0) - 1L;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(JII)J"
	)
	public static long bd(long var0, int var2, int var3) {
		long var4 = ub.ak(1 + (var3 - var2), -1793925999);
		var4 <<= var2;
		long var6;
		return var6 = var0 & ~var4;
	}

	static {
		new Object();
		ak_fld[0] = 0L;
		long var0 = 2L;

		for (int var2 = 1; var2 < ak_fld.length; var2++) {
			ak_fld[var2] = var0 - 1L;
			var0 += var0;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(JII)J"
	)
	public static long bz(long var0, int var2, int var3) {
		long var4 = ub.ak(1 + (var3 - var2), -1793925999);
		var4 <<= var2;
		long var6;
		return var6 = var0 & ~var4;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int br(int var0, int var1, int var2) {
		int var3 = (int)ub.ak(1 + (var2 - var1), -1793925999);
		var3 <<= var1;
		return var0 | var3;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int be(int var0, int var1, int var2) {
		int var3 = (int)ub.ak(1 + (var2 - var1), -1793925999);
		var3 <<= var1;
		return var0 | var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int bs(int var0, int var1, int var2) {
		int var3 = (int)ub.ak(1 + (var2 - var1), -1793925999);
		var3 <<= var1;
		return var0 | var3;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bh(int var0) {
		var0 = --var0 | var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(JII)J"
	)
	public static long bm(long var0, int var2, int var3) {
		long var4 = ub.ak(1 + (var3 - var2), -1793925999);
		var4 <<= var2;
		long var6;
		return var6 = var0 & ~var4;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bj(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 633878396) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			var1++;
		}

		return var0 + var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bk(int var0) {
		var0 = --var0 | var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	zc() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bl(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= -1638979836) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			var1++;
		}

		return var0 + var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int bx(int var0, int var1) {
		int var2 = 0;

		while (var1 > 0) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
			var1--;
		}

		return var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int bo(int var0, int var1) {
		int var2 = 0;

		while (var1 > 0) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
			var1--;
		}

		return var2;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int bp(int var0, int var1) {
		int var2 = 0;

		while (var1 > 0) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
			var1--;
		}

		return var2;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public static long bt(int var0) {
		if (var0 > 63) {
			throw new pz(
				"Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d",
				(Object[])(new Object[]{var0})
			);
		} else {
			return (long)Math.pow(2.0, var0) - 1L;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bf(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			var1++;
		}

		return var0 + var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int bi(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int bu(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFF)F"
	)
	public static float bn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var11 = (var4 - var3) * (var5 - var7) + (var2 - var4) * (var6 - var7);
		float var12 = ((var1 - var7) * (var4 - var3) + (var0 - var4) * (var6 - var7)) / var11;
		float var13 = ((var7 - var5) * (var0 - var4) + (var2 - var4) * (var1 - var7)) / var11;
		float var14 = 1.0F - var12 - var13;
		return var9 * var13 + var12 * var8 + var14 * var10;
	}
}
