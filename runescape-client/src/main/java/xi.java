import java.math.BigInteger;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xi")
public class xi extends vw {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] al_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] af_fld = new int[256];
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	public static long[] ar_fld = new long[256];
	@ObfuscatedGetter(
		intValue = -661977895
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int au_fld;

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int uk(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += -901701673;
		int var1 = (var0.al_fld[var0.au_fld - 1] & -1600518937) + ((var0.al_fld[var0.au_fld - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= -283626762;
		}

		return var1;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dt() {
		int var2 = this.al_fld[this.au_fld] & 255;
		return var2 < 128 ? this.cg() - 1 : tx(this, 742299727) - 32769;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cl() {
		byte var2 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		if (0 != var2) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.au_fld;

			while (this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] != 0) {
			}

			int var4 = this.au_fld - var3 - 1;
			return var4 == 0 ? "" : pc.ae(this.al_fld, var3, var4);
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fm(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aa() {
		if (null != this.al_fld) {
			kl.az(this.al_fld, (short)-29964);
		}

		this.al_fld = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak(int var1) {
		if (null != this.al_fld) {
			kl.az(this.al_fld, (short)-15237);
		}

		this.al_fld = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ax() {
		if (null != this.al_fld) {
			kl.az(this.al_fld, (short)-11146);
		}

		this.al_fld = null;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte lb() {
		return (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)B"
	)
	public static byte xh(xi var0) {
		return (byte)(var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int rp(xi var0) {
		return 128 - var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public static void lf(xi var0, BigInteger var1, BigInteger var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var0.au_fld;
		var0.au_fld = 0;
		byte[] var4 = new byte[var3];
		xp(var0, var4, 0, var3, (byte)8);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		var0.au_fld = 0;
		var0.bw(var7.length);
		pm(var0, var7, 0, var7.length);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public float if_() {
		return this.ci();
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void lo(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -1657809700 - 1] = (byte)(var1 + -1361077408);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hn() {
		this.au_fld += 712766714;
		return ((this.al_fld[this.au_fld - 2] & 0xFF) << 8) + (this.al_fld[this.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void cd(boolean var1) {
		this.bc(var1 ? 1 : 0);
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fb(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void cq(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 228932457;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void cf(xi var1) {
		pm(this, var1.al_fld, 0, var1.au_fld);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cx(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.al_fld[this.au_fld - var1 - 4] = (byte)(var1 >> 24);
			this.al_fld[this.au_fld - var1 - 3] = (byte)(var1 >> 16);
			this.al_fld[this.au_fld - var1 - 2] = (byte)(var1 >> 8);
			this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cp(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void ji(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += -1964233735) * -661977895 - 1] = (byte)(var1 >> 8);
		var0.al_fld[(var0.au_fld += -84588735) * 671753229 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] js_Arrbyte() {
		return this.al_fld;
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int zu(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var0.dr();
		return var2 >>> 1 ^ -(var2 & 1);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ce(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.bc(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.bw(32768 + var1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cr(int var1, int var2) {
		while (true) {
			if (var1 >= 0) {
				if (var2 <= -998211891) {
					return;
				}

				if (var1 <= 127) {
					this.bc(var1);
					return;
				}
			}

			this.bc(128 | var1 & 127);
			var1 >>>= 7;
		}
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte ym() {
		return rp(this, -941933763);
	}

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)B"
	)
	public static byte rx(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return (byte)(var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] - 128);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bc(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void op(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			var0.al_fld[var0.au_fld - var1 - 4] = (byte)(var1 >> 24);
			var0.al_fld[var0.au_fld - var1 - 3] = (byte)(var1 >> 16);
			var0.al_fld[var0.au_fld - var1 - 2] = (byte)(var1 >> 8);
			var0.al_fld[var0.au_fld - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ea(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int sd(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += -653500073;
		return (var0.al_fld[var0.au_fld - 1] - 128 & 0xFF) + ((var0.al_fld[var0.au_fld - 2] & -1312523502) << 8);
	}

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int qv(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 2;
		return ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 8) + (var0.al_fld[var0.au_fld - 2] & 0xFF);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cz() {
		this.au_fld += 2;
		int var2 = (this.al_fld[this.au_fld - 1] & 255) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lc() {
		this.au_fld += 1784976267;
		return ((this.al_fld[this.au_fld - 1] & -1264606990) << 8) + (this.al_fld[this.au_fld - 2] - -644542081 & 623422176);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hw() {
		this.au_fld += 2;
		int var1 = (this.al_fld[this.au_fld - 1] & 255) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	public xi(int var1, boolean var2) {
		this.bv(var1, var2);
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[III)V"
	)
	public static void kh(xi var0, int[] var1, int var2, int var3) {
		int var4 = -1676637403 * var0.au_fld;
		var0.au_fld = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = var0.co();
			int var8 = var0.co();
			int var9 = 0;
			int var10 = -1640531527;
			int var11 = 1758578141;

			while (var11-- > 0) {
				var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
				var9 += var10;
				var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
			}

			var0.au_fld -= 8;
			ld(var0, var7, (byte)100);
			ld(var0, var8, (byte)109);
		}

		var0.au_fld = var4;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int cz(xi var0) {
		return 128 - var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ch() {
		if (0 == this.al_fld[this.au_fld]) {
			this.au_fld++;
			return null;
		} else {
			return kc(this, -1908441218);
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void fd(long var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 40);
		this.al_fld[(this.au_fld += 36100320) * 1579195480 - 1] = (byte)(var1 >> 593265459);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += -1400712215) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -24290430 - 1] = (byte)var1;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public void ju(int[] var1) {
		int var2 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.co();
			int var5 = this.co();
			int var6 = 0;
			int var7 = 1935669996;
			int var8 = -1601177208;

			while (var8-- > 0) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
				var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
			}

			this.au_fld -= 8;
			ld(this, var4, (byte)103);
			ld(this, var5, (byte)102);
		}
	}

	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ul(int var1) {
		ld(this, var1, (byte)92);
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ls() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int sw(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var2 = 0;
			byte var3 = 0;

			int var1;
			do {
				var1 = var0.cg();
				var2 |= (var1 & 127) << var3;
				var3 += 7;
			} while (var1 > 127);

			return var2;
		}
	}

	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/lang/CharSequence;B)V"
	)
	public static void vs(xi var0, CharSequence var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var4 = var1.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; var6++) {
				char var7 = var1.charAt(var6);
				if (var7 <= 127) {
					var5++;
				} else if (var7 <= 2047) {
					var5 += 2;
				} else {
					var5 += 3;
				}
			}

			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = 0;
			var0.cn(var5, -1465855500);
			var0.au_fld = var0.au_fld + eh.ak(var0.al_fld, var0.au_fld, var1) * 228932457;
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lxw;)I"
	)
	public int dl(xw var1) {
		switch (var1.ak(-1147867652).ay_fld * -1892281921) {
			case 0:
				return rp(this, -941933763);
			case 1:
				return this.cg();
			case 2:
				return this.cz();
			case 3:
				return tx(this, 1596352495);
			case 4:
				return ke(this, 175491060);
			case 5:
				return this.ck();
			case 6:
				return this.co();
			default:
				throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int it() {
		int var1 = this.al_fld[this.au_fld] & 255;
		return var1 < 128 ? this.cg() : tx(this, 1949607915) - 32768;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eo() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dd() {
		byte var2 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public void kl(int[] var1, int var2, int var3) {
		int var4 = this.au_fld;
		this.au_fld = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.co();
			int var8 = this.co();
			int var9 = -957401312;
			int var10 = -1640531527;
			int var11 = 32;

			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3];
			}

			this.au_fld -= 8;
			ld(this, var7, (byte)100);
			ld(this, var8, (byte)90);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void gf(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([IB)V"
	)
	public void dk(int[] var1, byte var2) {
		int var3 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = this.co();
			int var6 = this.co();
			int var7 = 0;
			int var8 = -1640531527;
			int var9 = 32;

			while (var9-- > 0) {
				if (var2 != 45) {
					return;
				}

				var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				var7 += var8;
				var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
			}

			this.au_fld -= 8;
			ld(this, var5, (byte)112);
			ld(this, var6, (byte)104);
		}
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BII)V"
	)
	public static void ym(xi var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = var2; var4 < var2 + var3; var4++) {
			var1[var4] = var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1];
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public void ds(int[] var1, int var2, int var3) {
		int var5 = this.au_fld;
		this.au_fld = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; var7++) {
			int var8 = this.co();
			int var9 = this.co();
			int var10 = 0;
			int var11 = -1640531527;
			int var12 = 32;

			while (var12-- > 0) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
				var10 += var11;
				var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
			}

			this.au_fld -= 8;
			ld(this, var8, (byte)114);
			ld(this, var9, (byte)122);
		}

		this.au_fld = var5;
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ml(int var1) {
		this.al_fld[(this.au_fld += -524319034) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * 1729420428 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * 505314630 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * 338311082 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public void db(BigInteger var1, BigInteger var2) {
		int var4 = this.au_fld;
		this.au_fld = 0;
		byte[] var5 = new byte[var4];
		xp(this, var5, 0, var4, (byte)8);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.au_fld = 0;
		this.bw(var8.length);
		pm(this, var8, 0, var8.length);
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gd(int var1) {
		if (0 != (var1 & -128)) {
			if (0 != (var1 & -16384)) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.bc(var1 >>> 28 | 128);
					}

					this.bc(var1 >>> 21 | 128);
				}

				this.bc(var1 >>> 14 | 128);
			}

			this.bc(var1 >>> 7 | 128);
		}

		this.bc(var1 & 127);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int av(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = 0;
		byte var3 = 0;

		int var1;
		do {
			var1 = var0.cg();
			var2 |= (var1 & 127) << var3;
			var3 += 7;
		} while (var1 > -407958248);

		return var2;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void fi(String var1) {
		this.cc(var1, 1494054486);
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ek(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(128 + var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		if (null != this.al_fld) {
			kl.az(this.al_fld, (short)-24099);
		}

		this.al_fld = null;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int df() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128 & 0xFF;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void gc(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 228932457;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dp() {
		return 128 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cn(int var1, int var2) {
		if (0 != (var1 & -128)) {
			if (var2 == -1686839624) {
				return;
			}

			if (0 != (var1 & -16384)) {
				if (var2 == -1686839624) {
					return;
				}

				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						if (var2 == -1686839624) {
							return;
						}

						this.bc(var1 >>> 28 | 128);
					}

					this.bc(var1 >>> 21 | 128);
				}

				this.bc(var1 >>> 14 | 128);
			}

			this.bc(var1 >>> 7 | 128);
		}

		this.bc(var1 & 127);
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mx() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & -1689997940) + ((this.al_fld[this.au_fld - 1] & 1439234742) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int co() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 1] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fs(boolean var1) {
		this.bc(var1 ? 1 : 0);
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ez() {
		this.au_fld += 2;
		int var2 = ((this.al_fld[this.au_fld - 2] & 255) << 8) + (this.al_fld[this.au_fld - 1] - 128 & 0xFF);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int ke(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 3;
		int var2 = ((var0.al_fld[var0.au_fld - 3] & 255) << 16) + ((var0.al_fld[var0.au_fld - 2] & 255) << 8) + (var0.al_fld[var0.au_fld - 1] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void en(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int hm(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 4;
		return (var0.al_fld[var0.au_fld - 3] & 0xFF)
			+ ((var0.al_fld[var0.au_fld - 4] & 0xFF) << 8)
			+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 24)
			+ ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int eg() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & 0xFF) + ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ef(int var1) {
		this.au_fld += 3;
		int var2 = (this.al_fld[this.au_fld - 3] & 255) + ((this.al_fld[this.au_fld - 1] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int yr() {
		return nx(this, (byte)80);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int kc(xi var0) {
		return var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public float bi() {
		return Float.intBitsToFloat(this.co());
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bq(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dm() {
		short var2 = 0;

		int var3;
		for (var3 = this.dz(); 32767 == var3; var3 = this.dz()) {
			var2 += 32767;
		}

		return var2 + var3;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int mc(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 1439565497;
			int var1 = (var0.al_fld[var0.au_fld - 2] - 128 & 1098553871) + ((var0.al_fld[var0.au_fld - 1] & 140436014) << 8);
			if (var1 > -1494089407) {
				var1 -= -1143054610;
			}

			return var1;
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int em() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 2] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ee(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void el(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; var5++) {
			var1[var5] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hb() {
		return this.au_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void an() {
		if (null != this.al_fld) {
			kl.az(this.al_fld, (short)-23957);
		}

		this.al_fld = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
		if (null != this.al_fld) {
			kl.az(this.al_fld, (short)-11038);
		}

		this.al_fld = null;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ew() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] & 0xFF);
	}

	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int wm(xi var0) {
		if (var0.al_fld[-218426350 * var0.au_fld] < 0) {
			return var0.co() & -1330885262;
		} else {
			int var1 = tx(var0, 702019348);
			return 32767 == var1 ? -1 : var1;
		}
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int nz(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += -2114048040;
		return (var0.al_fld[var0.au_fld - 1] & 818263075)
			+ ((var0.al_fld[var0.au_fld - 4] & 0xFF) << 24)
			+ ((var0.al_fld[var0.au_fld - 3] & -632149447) << 16)
			+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lxw;)I"
	)
	public int jc(xw var1) {
		switch (var1.ak(-1822132369).ay_fld * 974578203) {
			case 0:
				return rp(this, -13973314);
			case 1:
				return this.cg();
			case 2:
				return this.cz();
			case 3:
				return tx(this, 1813137621);
			case 4:
				return ke(this, 25394819);
			case 5:
				return this.ck();
			case 6:
				return this.co();
			default:
				throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	public static int fy(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; var4++) {
			var3 = var3 >>> 8 ^ af_fld[(var3 ^ var0[var4]) & 0xFF];
		}

		return ~var3;
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void uk_void(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 <= 255) {
			var0.al_fld[var0.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jv() {
		byte var1 = this.al_fld[(this.au_fld += 1663175401) * -661977895 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.al_fld[(this.au_fld += 228932457) * 129526141 - 1]) {
			var2 = (var2 | var1 & 494856536) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dg(int var1) {
		int var3 = qa.bi(this.al_fld, var1, this.au_fld);
		ld(this, var3, (byte)105);
		return var3;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fe(int var1) {
		this.al_fld[(this.au_fld += 228932457) * 712369723 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)B"
	)
	public static byte rp(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1];
		}
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)B"
	)
	public static byte wc(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return (byte)(0 - var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1]);
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fx(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -9490232 - 1] = (byte)var1;
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BIIB)V"
	)
	public static void xp(xi var0, byte[] var1, int var2, int var3, byte var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var5 = var2; var5 < var2 + var3; var5++) {
				var1[var5] = var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1];
			}
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fv(int var1) {
		this.al_fld[(this.au_fld += 284452618) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fj(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ij() {
		byte var1 = this.al_fld[(this.au_fld += -1465530050) * -661977895 - 1];
		if (0 != var1) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.dd();
			if (var2 + this.au_fld > this.al_fld.length) {
				throw new IllegalStateException("");
			} else {
				String var3 = wv.ag(this.al_fld, this.au_fld, var2);
				this.au_fld += var2 * 228932457;
				return var3;
			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cg() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fc(int var1) {
		this.al_fld[(this.au_fld += -1566289341) * -1547232418 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -1716978442 - 1] = (byte)var1;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fh(int var1) {
		this.al_fld[(this.au_fld += -325666402) * -1158189352 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -1466765768 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += -66969170) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lv() {
		this.au_fld += 2;
		int var1 = (this.al_fld[this.au_fld - 2] - 128 & 0xFF) + ((this.al_fld[this.au_fld - 1] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void gb(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 <= 65535) {
			var0.al_fld[var0.au_fld - var1 - 2] = (byte)(var1 >> 8);
			var0.al_fld[var0.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public static int fa(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte lw() {
		return (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fu(boolean var1) {
		this.bc(var1 ? 1 : 0);
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void fg(long var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 40);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 32);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	static {
		for (int var1 = 0; var1 < 256; var1++) {
			int var0 = var1;

			for (int var2 = 0; var2 < 8; var2++) {
				if (1 == (var0 & 1)) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			af_fld[var1] = var0;
		}

		for (int var5 = 0; var5 < 256; var5++) {
			long var4 = var5;

			for (int var3 = 0; var3 < 8; var3++) {
				if (1L == (var4 & 1L)) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			ar_fld[var5] = var4;
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void fl(long var1) {
		this.al_fld[(this.au_fld += -1785136718) * -2029564626 - 1] = (byte)(var1 >> 56);
		this.al_fld[(this.au_fld += 183673050) * -661977895 - 1] = (byte)(var1 >> 48);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 1645327376);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 32);
		this.al_fld[(this.au_fld += -134430445) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -1445691292 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 456266782) * -1028988603 - 1] = (byte)var1;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fq(boolean var1) {
		this.bc(var1 ? 1 : 0);
	}

	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void rr(int var1) {
		this.au_fld = var1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public float ci() {
		return Float.intBitsToFloat(this.co());
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ht() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 1] & 0xFF) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fr(boolean var1) {
		this.bc(var1 ? 1 : 0);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void bb(long var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 40);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 32);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void bc(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 278376082;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void ff(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 228932457;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fw(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)V"
	)
	public void gn(CharSequence var1) {
		int var3 = var1.length();
		int var4 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			char var6 = var1.charAt(var5);
			if (var6 <= 127) {
				var4++;
			} else if (var6 <= 2047) {
				var4 += 2;
			} else {
				var4 += 3;
			}
		}

		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		this.cn(var4, 1896630517);
		this.au_fld = this.au_fld + eh.ak(this.al_fld, this.au_fld, var1) * 228932457;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ka() {
		return this.co();
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean km() {
		this.au_fld -= 4;
		int var1 = qa.bi(this.al_fld, 0, this.au_fld);
		int var2 = this.co();
		return var1 == var2;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int hc(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 2022457039;
			int var1 = (var0.al_fld[var0.au_fld - 2] & -860322310)
				+ ((var0.al_fld[var0.au_fld - 1] & -333534889) << 8)
				+ ((var0.al_fld[var0.au_fld - 3] & -1561812440) << 16);
			if (var1 > 8388607) {
				var1 -= -1326704545;
			}

			return var1;
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public void jp(int[] var1) {
		int var2 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.co();
			int var5 = this.co();
			int var6 = 0;
			int var7 = -1640531527;
			int var8 = 32;

			while (var8-- > 0) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
				var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
			}

			this.au_fld -= 8;
			ld(this, var4, (byte)92);
			ld(this, var5, (byte)121);
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void gj(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; var4++) {
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = var1[var4];
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void ie(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 < 128) {
			var0.bc(var1);
		} else if (var1 >= 0 && var1 < -72025243) {
			var0.bw(-983573190 + var1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int qa(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 4;
		return (var0.al_fld[var0.au_fld - 3] & 0xFF)
			+ ((var0.al_fld[var0.au_fld - 4] & 0xFF) << 8)
			+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 24)
			+ ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void gt(xi var1) {
		pm(this, var1.al_fld, 0, var1.au_fld);
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dr() {
		int var3 = 0;
		byte var4 = 0;

		int var2;
		do {
			var2 = this.cg();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while (var2 > 127);

		return var3;
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void pn(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gv(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gf(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.bc(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.bw(32768 + var1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gm(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.bc(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.bw(32768 + var1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ga(int var1) {
		if (0 != (var1 & -128)) {
			if (0 != (var1 & -16384)) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.bc(var1 >>> 28 | 128);
					}

					this.bc(var1 >>> 21 | 128);
				}

				this.bc(var1 >>> 14 | 128);
			}

			this.bc(var1 >>> 7 | 128);
		}

		this.bc(var1 & 127);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ec() {
		this.au_fld += 2;
		int var2 = ((this.al_fld[this.au_fld - 1] & 255) << 8) + (this.al_fld[this.au_fld - 2] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BII)V"
	)
	public static void it(xi var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var5 = var2 + var3 - 1; var5 >= var2; var5--) {
			var1[var5] = var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1];
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gb(int var1) {
		if (0 != (var1 & -128)) {
			if (0 != (var1 & -16384)) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.bc(var1 >>> 28 | 128);
					}

					this.bc(var1 >>> 21 | 128);
				}

				this.bc(var1 >>> 14 | 128);
			}

			this.bc(var1 >>> 7 | 128);
		}

		this.bc(var1 & 127);
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void gl(int var1) {
		while (var1 < 0 || var1 > 127) {
			this.bc(1814483949 | var1 & 500831518);
			var1 >>>= 7;
		}

		this.bc(var1);
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dy(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void hj(int var1) {
		var1 = var1 << 1 ^ var1 >> 31;
		this.cr(var1, -776712919);
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void hp(int var1) {
		var1 = var1 << 1 ^ var1 >> 31;
		this.cr(var1, -989913660);
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void hb(int var1) {
		var1 = var1 << 1 ^ var1 >> -298902334;
		this.cr(var1, 802256456);
	}

	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void si(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + 128);
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ei() {
		this.au_fld += 3;
		int var2 = ((this.al_fld[this.au_fld - 3] & 255) << 8) + ((this.al_fld[this.au_fld - 2] & 255) << 16) + (this.al_fld[this.au_fld - 1] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hh() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	public static void ld(xi var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ck() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 1] & 0xFF) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hd() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte hk() {
		return this.al_fld[(this.au_fld += 713137918) * -661977895 - 1];
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte hi() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hm() {
		this.au_fld += 3;
		int var1 = ((this.al_fld[this.au_fld - 3] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8) + (this.al_fld[this.au_fld - 1] & -1516935540);
		if (var1 > -932868578) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BII)V"
	)
	public static void ea(xi var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = var2 + var3 - 1; var4 >= var2; var4--) {
			var1[var4] = var0.al_fld[(var0.au_fld += -906138955) * -661977895 - 1];
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hs() {
		this.au_fld += 1564561046;
		return ((this.al_fld[this.au_fld - 2] & 0xFF) << 8) + (this.al_fld[this.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "(Lxi;J)V"
	)
	public static void ud(xi var0, long var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 56);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 48);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 40);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 32);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int ki(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 4;
			return (var0.al_fld[var0.au_fld - 3] & 0xFF)
				+ ((var0.al_fld[var0.au_fld - 4] & 0xFF) << 8)
				+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 24)
				+ ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 16);
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hq() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 2] & 0xFF) << 8) + (this.al_fld[this.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hc() {
		this.au_fld += 370635674;
		int var1 = (this.al_fld[this.au_fld - 1] & 1613169566) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var1 > 556613422) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void gg(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 228932457;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hg() {
		this.au_fld += -251391461;
		int var1 = (this.al_fld[this.au_fld - 1] & 255) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var1 > 758566295) {
			var1 -= 2142195322;
		}

		return var1;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void hl(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(128 + var1);
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)J"
	)
	public static long ob(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			long var2 = var0.co() & 4294967295L;
			long var4 = var0.co() & 4294967295L;
			return var4 + (var2 << 32);
		}
	}

	@ObfuscatedName("zx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BII)V"
	)
	public static void zx(xi var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var4 = var2; var4 < var3 + var2; var4++) {
				var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = var1[var4];
			}
		}
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void rw(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 1920715481) * -126086269 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ha() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 1] & 0xFF) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int if_int() {
		return tx(this, 1032280401);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ik() {
		byte var1 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		if (0 != var1) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.dd();
			int var10000 = var2 + this.au_fld;
			int var10001 = this.al_fld.length;
			String var3 = wv.ag(this.al_fld, this.au_fld, var2);
			this.au_fld += var2 * 228932457;
			return var3;
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hx() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 1] & 0xFF) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cj() {
		this.au_fld -= 4;
		int var2 = qa.bi(this.al_fld, 0, this.au_fld);
		int var3 = this.co();
		return var2 == var3;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hy() {
		this.au_fld += 3;
		int var1 = ((this.al_fld[this.au_fld - 3] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8) + (this.al_fld[this.au_fld - 1] & 255);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ho() {
		this.au_fld += -764327590;
		int var1 = ((this.al_fld[this.au_fld - 3] & -421490068) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8) + (this.al_fld[this.au_fld - 1] & 255);
		if (var1 > 2040455324) {
			var1 -= 633304069;
		}

		return var1;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ib() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 1] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void fn(long var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 56);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 48);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 40);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 32);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ie() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 1] & 1758737532)
			+ ((this.al_fld[this.au_fld - 4] & 1197157736) << 24)
			+ ((this.al_fld[this.au_fld - 3] & 51133806) << 16)
			+ ((this.al_fld[this.au_fld - 2] & 1180483982) << 8);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public static int fp(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public static int fo(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)Ljava/lang/String;"
	)
	public static String ag(xi var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var2 = var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1];
			if (0 != var2) {
				throw new IllegalStateException("");
			} else {
				int var3 = var0.dd();
				if (var3 + var0.au_fld > var0.al_fld.length) {
					throw new IllegalStateException("");
				} else {
					String var4 = wv.ag(var0.al_fld, var0.au_fld, var3);
					var0.au_fld += var3 * 228932457;
					return var4;
				}
			}
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ia() {
		return (this.cg() & 1) == 1;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean iq() {
		return (this.cg() & 1) == 1;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String is() {
		int var1 = this.au_fld;

		while (this.al_fld[(this.au_fld += 228932457) * -272000399 - 1] != 0) {
		}

		int var2 = this.au_fld - var1 - 1;
		return 0 == var2 ? "" : pc.ae(this.al_fld, var1, var2);
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ic() {
		byte var1 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		int var2 = this.au_fld;

		while (this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] != 0) {
		}

		int var3 = this.au_fld - var2 - 1;
		return var3 == 0 ? "" : pc.ae(this.al_fld, var2, var3);
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean il() {
		return (this.cg() & 1) == 1;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String in() {
		byte var1 = this.al_fld[(this.au_fld += 1736222786) * -661977895 - 1];
		if (0 != var1) {
			throw new IllegalStateException("");
		} else {
			int var2 = this.au_fld;

			while (this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] != 0) {
			}

			int var3 = this.au_fld - var2 - 1;
			return var3 == 0 ? "" : pc.ae(this.al_fld, var2, var3);
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void id(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var2 + var3; var4++) {
			var1[var4] = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void ih(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var2 + var3; var4++) {
			var1[var4] = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void ix(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var2 + var3; var4++) {
			var1[var4] = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dz() {
		int var2 = this.al_fld[this.au_fld] & 255;
		return var2 < 128 ? this.cg() : tx(this, 1287038070) - 32768;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int iw() {
		int var1 = this.al_fld[this.au_fld] & 155684750;
		return var1 < 128 ? this.cg() - 1 : tx(this, 349233266) - 32769;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ig() {
		int var1 = this.al_fld[this.au_fld] & 255;
		return var1 < 128 ? this.cg() - 1 : tx(this, 2000699151) - 32769;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jz() {
		short var1 = 0;

		int var2;
		for (var2 = this.dz(); 84163853 == var2; var2 = this.dz()) {
			var1 += 32767;
		}

		return var1 + var2;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jk() {
		return this.al_fld[this.au_fld] < 0 ? this.co() & -1795567856 : tx(this, 489214984);
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int uk(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return 0 - var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jn() {
		if (this.al_fld[this.au_fld] < 0) {
			return this.co() & 2147483647;
		} else {
			int var1 = tx(this, 2047849987);
			return 32767 == var1 ? -1 : var1;
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dw() {
		return (this.cg() & 1) == 1;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jw() {
		if (this.al_fld[this.au_fld] < 0) {
			return this.co() & 2147483647;
		} else {
			int var1 = tx(this, 1451386521);
			return 32767 == var1 ? -1 : var1;
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int kv(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		ld(this, var2, (byte)96);
		return var2;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jo() {
		byte var1 = this.al_fld[(this.au_fld += 228932457) * -2039696228 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.al_fld[(this.au_fld += -452642941) * -661977895 - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ja() {
		byte var1 = this.al_fld[(this.au_fld += 228932457) * -1872234357 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.al_fld[(this.au_fld += 2074933114) * -661977895 - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jd() {
		byte var1 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1]) {
			var2 = (var2 | var1 & 127) << 7;
		}

		return var2 | var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bw(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[III)V"
	)
	public static void lp(xi var0, int[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var5 = var0.au_fld;
		var0.au_fld = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; var7++) {
			int var8 = var0.co();
			int var9 = var0.co();
			int var10 = -957401312;
			int var11 = -1640531527;
			int var12 = 32;

			while (var12-- > 0) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
				var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3];
			}

			var0.au_fld -= 8;
			ld(var0, var8, (byte)127);
			ld(var0, var9, (byte)121);
		}

		var0.au_fld = var5;
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void zc(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lxw;)I"
	)
	public int jy(xw var1) {
		switch (var1.ak(172349947).ay_fld * -1892281921) {
			case 0:
				return rp(this, 692078333);
			case 1:
				return this.cg();
			case 2:
				return this.cz();
			case 3:
				return tx(this, 453547917);
			case 4:
				return ke(this, -971663931);
			case 5:
				return this.ck();
			case 6:
				return this.co();
			default:
				throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int hk(xi var0) {
		return var0.al_fld[(var0.au_fld += 228932457) * -1381264220 - 1] - 128 & -1131663940;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jx() {
		int var2 = 0;
		byte var3 = 0;

		int var1;
		do {
			var1 = this.cg();
			var2 |= (var1 & 127) << var3;
			var3 += 7;
		} while (var1 > 127);

		return var2;
	}

	public xi(int var1) {
		this.al_fld = dv.ag(var1, 1987896383);
		this.au_fld = 0;
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[IB)V"
	)
	public static void qd(xi var0, int[] var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var3 = var0.au_fld / 8;
			var0.au_fld = 0;

			for (int var4 = 0; var4 < var3; var4++) {
				if (var2 >= 0) {
					return;
				}

				int var5 = var0.co();
				int var6 = var0.co();
				int var7 = -957401312;
				int var8 = -1640531527;
				int var9 = 32;

				while (var9-- > 0) {
					var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
					var7 -= var8;
					var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				}

				var0.au_fld -= 8;
				ld(var0, var5, (byte)120);
				ld(var0, var6, (byte)115);
			}
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int js() {
		int var1 = this.dr();
		return var1 >>> 1 ^ -(var1 & 1);
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jh() {
		int var1 = this.dr();
		return var1 >>> 1 ^ -(var1 & 1);
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public void jq(int[] var1) {
		int var2 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.co();
			int var5 = this.co();
			int var6 = 0;
			int var7 = -1149579014;
			int var8 = 32;

			while (var8-- > 0) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
				var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
			}

			this.au_fld -= 255010972;
			ld(this, var4, (byte)82);
			ld(this, var5, (byte)104);
		}
	}

	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void sr(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (var1 < 0 || var1 > 127) {
			var0.bc(128 | var1 & 127);
			var1 >>>= 7;
		}

		var0.bc(var1);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int do_() {
		if (this.al_fld[this.au_fld] < 0) {
			return this.co() & 2147483647;
		} else {
			int var2 = tx(this, 1849667895);
			return 32767 == var2 ? -1 : var2;
		}
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ri() {
		return this.cz();
	}

	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void rs(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(128 - var1);
		}
	}

	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void tu(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	public void cc(String var1, int var2) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			if (var2 > -1222458196) {
				throw new IllegalArgumentException("");
			}
		} else {
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 228932457;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/String;"
	)
	public static String kc(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var0.au_fld;

		while (var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] != 0) {
		}

		int var3 = var0.au_fld - var2 - 1;
		return 0 == var3 ? "" : pc.ae(var0.al_fld, var2, var3);
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public void ji(int[] var1) {
		int var2 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.co();
			int var5 = this.co();
			int var6 = -957401312;
			int var7 = -1640531527;
			int var8 = 32;

			while (var8-- > 0) {
				var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
				var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
			}

			this.au_fld -= 8;
			ld(this, var4, (byte)112);
			ld(this, var5, (byte)116);
		}
	}

	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int uv(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 3;
			int var1 = ((var0.al_fld[var0.au_fld - 3] & 255) << 16) + ((var0.al_fld[var0.au_fld - 2] & 255) << 8) + (var0.al_fld[var0.au_fld - 1] & 255);
			if (var1 > 8388607) {
				var1 -= 16777216;
			}

			return var1;
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public void kf(BigInteger var1, BigInteger var2) {
		int var3 = this.au_fld;
		this.au_fld = 0;
		byte[] var4 = new byte[var3];
		xp(this, var4, 0, var3, (byte)8);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.au_fld = 0;
		this.bw(var7.length);
		pm(this, var7, 0, var7.length);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public void jl(int[] var1, int var2, int var3) {
		int var4 = this.au_fld;
		this.au_fld = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.co();
			int var8 = this.co();
			int var9 = 0;
			int var10 = -1640531527;
			int var11 = 32;

			while (var11-- > 0) {
				var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
				var9 += var10;
				var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
			}

			this.au_fld -= 8;
			ld(this, var7, (byte)99);
			ld(this, var8, (byte)123);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hf() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public void ku(int[] var1, int var2, int var3) {
		int var4 = this.au_fld;
		this.au_fld = 1216881092 * var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.co();
			int var8 = this.co();
			int var9 = -957401312;
			int var10 = -2123982874;
			int var11 = 32;

			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3];
			}

			this.au_fld -= 524290175;
			ld(this, var7, (byte)114);
			ld(this, var8, (byte)127);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void zw(byte[] var1, int var2, int var3) {
		xp(this, var1, var2, var3, (byte)8);
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public void ky(BigInteger var1, BigInteger var2) {
		int var3 = 699662721 * this.au_fld;
		this.au_fld = 0;
		byte[] var4 = new byte[var3];
		xp(this, var4, 0, var3, (byte)8);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.au_fld = 0;
		this.bw(var7.length);
		pm(this, var7, 0, var7.length);
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public void ka(BigInteger var1, BigInteger var2) {
		int var3 = this.au_fld;
		this.au_fld = 0;
		byte[] var4 = new byte[var3];
		xp(this, var4, 0, var3, (byte)8);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.au_fld = 0;
		this.bw(var7.length);
		pm(this, var7, 0, var7.length);
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lea;)Lek;"
	)
	public static ek nw(ea var0) {
		return var0.as_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ba(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int nm() {
		this.au_fld += -1762868462;
		return (this.al_fld[this.au_fld - 2] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & -1586981014) << 16)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int rb() {
		return this.dz();
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int kz(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		ld(this, var2, (byte)106);
		return var2;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int kc(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		ld(this, var2, (byte)84);
		return var2;
	}

	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int tx(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 2;
		return ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 8) + (var0.al_fld[var0.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void fz(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 228932457;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kr(int var1) {
		this.al_fld[(this.au_fld += 1977725980) * 1375052622 - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ki(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)J"
	)
	public static long kk(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		long var1 = var0.co() & 4294967295L;
		long var3 = var0.co() & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ke(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kp() {
		return 0 - this.al_fld[(this.au_fld += 1263514712) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kj() {
		return 128 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kx() {
		return 128 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int ju(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 2;
			return ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 8) + (var0.al_fld[var0.au_fld - 1] & 0xFF);
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kk() {
		return 187828303 - this.al_fld[(this.au_fld += 228932457) * -96957045 - 1] & 0xFF;
	}

	@ObfuscatedName("yx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int yx(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 3;
			int var1 = ((var0.al_fld[var0.au_fld - 3] & 255) << 8) + ((var0.al_fld[var0.au_fld - 2] & -672993219) << 16) + (var0.al_fld[var0.au_fld - 1] & -1955590807);
			if (var1 > 822848776) {
				var1 -= -2116844370;
			}

			return var1;
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ii() {
		int var1 = this.al_fld[this.au_fld] & 255;
		return var1 < 128 ? this.cg() - 1 : tx(this, 1040275469) - 32769;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte li() {
		return (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	public xi(byte[] var1) {
		this.al_fld = var1;
		this.au_fld = 0;
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public void ko(int[] var1, int var2, int var3) {
		int var4 = this.au_fld;
		this.au_fld = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.co();
			int var8 = this.co();
			int var9 = -957401312;
			int var10 = -1640531527;
			int var11 = 32;

			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3];
			}

			this.au_fld -= 8;
			ld(this, var7, (byte)112);
			ld(this, var8, (byte)84);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BII)V"
	)
	public static void pm(xi var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var5 = var2; var5 < var3 + var2; var5++) {
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = var1[var5];
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void di(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte lg() {
		return (byte)(0 - this.al_fld[(this.au_fld += -1976766666) * -1943578 - 1]);
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte lf() {
		return (byte)(1969008691 - this.al_fld[(this.au_fld += -1491955230) * -661977895 - 1]);
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void lp(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -2074683928 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += -305649505) * 1172151589 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ms() {
		this.au_fld += 3;
		int var1 = (this.al_fld[this.au_fld - 3] & 255) + ((this.al_fld[this.au_fld - 1] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lx() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] & 0xFF);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void bg(long var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 40);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 32);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lt() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] & 0xFF);
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lj() {
		this.au_fld += -1573195531;
		return (this.al_fld[this.au_fld - 1] - -1916818732 & -1895138755) + ((this.al_fld[this.au_fld - 2] & 1955051089) << 8);
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lz() {
		this.au_fld += 2;
		return (this.al_fld[this.au_fld - 1] - 1495946187 & 0xFF) + ((this.al_fld[this.au_fld - 2] & 1850343976) << 8);
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lm() {
		this.au_fld += 2;
		return (this.al_fld[this.au_fld - 1] - 128 & 0xFF) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lq() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int la() {
		this.au_fld += 2;
		int var1 = ((this.al_fld[this.au_fld - 1] & 255) << 8) + (this.al_fld[this.au_fld - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	public static void kn(xi var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1 >= 0) {
				if (var2 == -248283675) {
					return;
				}

				if (var1 <= 65535) {
					var0.al_fld[var0.au_fld - var1 - 2] = (byte)(var1 >> 8);
					var0.al_fld[var0.au_fld - var1 - 1] = (byte)var1;
					return;
				}
			}

			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hu() {
		this.au_fld += 1454469917;
		return (this.al_fld[this.au_fld - 1] & 1408053142) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ly() {
		this.au_fld += 1874622971;
		int var1 = ((this.al_fld[this.au_fld - 2] & 1614907628) << 8) + (this.al_fld[this.au_fld - 1] - -1132321609 & -2085700041);
		if (var1 > 1026609823) {
			var1 -= -1104022436;
		}

		return var1;
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void pj(int var1) {
		this.bc(var1);
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int gf() {
		return this.cg();
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fk(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int zk() {
		return this.dm();
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mt() {
		this.au_fld += 2;
		int var1 = (this.al_fld[this.au_fld - 2] - -935071354 & 0xFF) + ((this.al_fld[this.au_fld - 1] & -1376259473) << 8);
		if (var1 > 32767) {
			var1 -= 4978680;
		}

		return var1;
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mv(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -760274648 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += -1514112661) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void lu(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + 128);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IZ)V"
	)
	public static void sg(xi var0, int var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak(-1569172296);
		var0.al_fld = ic.ak(var1, var2);
		var0.au_fld = 0;
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void my(int var1) {
		this.al_fld[(this.au_fld += 228932457) * 10904101 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * 2019895877 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * 1606118043 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mk() {
		this.au_fld += 3;
		int var1 = ((this.al_fld[this.au_fld - 3] & 255) << 8) + ((this.al_fld[this.au_fld - 2] & 255) << 16) + (this.al_fld[this.au_fld - 1] & 255);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public float im() {
		return Float.intBitsToFloat(this.co());
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mr() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & 0xFF) + ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	void bv(int var1, boolean var2) {
		this.ak(-1569172296);
		this.al_fld = ic.ak(var1, var2);
		this.au_fld = 0;
	}

	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/lang/CharSequence;)V"
	)
	public static void zk(xi var0, CharSequence var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var1.length();
		int var4 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			char var6 = var1.charAt(var5);
			if (var6 <= 127) {
				var4++;
			} else if (var6 <= 2047) {
				var4 += 2;
			} else {
				var4 += 3;
			}
		}

		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = 0;
		var0.cn(var4, 855018277);
		var0.au_fld = var0.au_fld + eh.ak(var0.al_fld, var0.au_fld, var1) * 228932457;
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mu() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & 0xFF) + ((this.al_fld[this.au_fld - 1] & 694541637) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mf() {
		this.au_fld += 1362869764;
		int var1 = (this.al_fld[this.au_fld - 3] & 1714975676) + ((this.al_fld[this.au_fld - 1] & -451574588) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var1 > 8388607) {
			var1 -= 305888011;
		}

		return var1;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mb() {
		this.au_fld += 3;
		int var1 = (this.al_fld[this.au_fld - 3] & 255) + ((this.al_fld[this.au_fld - 1] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var1 > 8388607) {
			var1 -= 718177693;
		}

		return var1;
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mq() {
		this.au_fld += 3;
		int var1 = (this.al_fld[this.au_fld - 2] & 255) + ((this.al_fld[this.au_fld - 1] & 255) << 8) + ((this.al_fld[this.au_fld - 3] & 255) << 16);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ir() {
		int var1 = this.al_fld[this.au_fld] & 255;
		return var1 < 128 ? this.cg() - 64 : tx(this, 878246976) - 49152;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int iz(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.al_fld[var0.au_fld] < 0 ? var0.co() & 2147483647 : tx(var0, 997596270);
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mj() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & 0xFF) + ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mw(int var1) {
		this.al_fld[(this.au_fld += 1163991597) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += -1008318355) * -1126466759 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -1888998343 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += -1305204039) * 15063938 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mp(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += -408370084) * -1384044704 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int if_(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 2;
		int var1 = ((var0.al_fld[var0.au_fld - 1] & 255) << 8) + (var0.al_fld[var0.au_fld - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)V"
	)
	public void gh(CharSequence var1) {
		int var3 = var1.length();
		int var4 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			char var6 = var1.charAt(var5);
			if (var6 <= 127) {
				var4++;
			} else if (var6 <= -1459050396) {
				var4 += 2;
			} else {
				var4 += 3;
			}
		}

		this.al_fld[(this.au_fld += -2094300062) * -661977895 - 1] = 0;
		this.cn(var4, 293146235);
		this.au_fld = this.au_fld + eh.ak(this.al_fld, 2098527980 * this.au_fld, var1) * -279815358;
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mg(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)I"
	)
	public static int nx(xi var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var2 = var0.al_fld[var0.au_fld] & 255;
			return var2 < 128 ? var0.cg() - 64 : tx(var0, 718728745) - 49152;
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void nc(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -397910280 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += -1321991123) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -1193215035 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int nh() {
		this.au_fld += 1133538123;
		return (this.al_fld[this.au_fld - 4] & 97969162)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 1] & 984182016) << 24)
			+ ((this.al_fld[this.au_fld - 3] & -545717459) << 8);
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int nd() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 2] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 1] & 1757681600) << 8);
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)B"
	)
	public static byte lc(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return (byte)(128 - var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1]);
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int nx() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 2] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int nv() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 2] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 115095702) << 16)
			+ ((this.al_fld[this.au_fld - 3] & 1653407459) << 24)
			+ ((this.al_fld[this.au_fld - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "([BII)I"
	)
	public static int ej(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; var4++) {
			var3 = var3 >>> 8 ^ af_fld[(var3 ^ var0[var4]) & 0xFF];
		}

		return ~var3;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void nz(byte[] var1, int var2, int var3) {
		for (int var4 = var2 + var3 - 1; var4 >= var2; var4--) {
			var1[var4] = this.al_fld[(this.au_fld += 762204084) * -1228094440 - 1];
		}
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void ns(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; var4++) {
			var1[var4] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void nq(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; var4++) {
			var1[var4] = (byte)(this.al_fld[(this.au_fld += 803050950) * -661977895 - 1] - 128);
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void nt(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; var4++) {
			var1[var4] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void ng(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; var4++) {
			var1[var4] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V"
	)
	public void dh(byte[] var1, int var2, int var3, byte var4) {
		for (int var5 = var2; var5 < var2 + var3; var5++) {
			var1[var5] = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public long cu(int var1) {
		long var2 = this.ew() & 4294967295L;
		long var4 = this.co() & 4294967295L;
		return var4 + (var2 << 32);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V"
	)
	public void cv(CharSequence var1, byte var2) {
		int var4 = var1.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; var6++) {
			char var7 = var1.charAt(var6);
			if (var7 <= 127) {
				var5++;
			} else if (var7 <= 2047) {
				var5 += 2;
			} else {
				var5 += 3;
			}
		}

		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		this.bw(var5);
		this.au_fld = this.au_fld + eh.ak(this.al_fld, this.au_fld, var1) * 228932457;
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)I"
	)
	public static int oh(xi var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 2;
			return (var0.al_fld[var0.au_fld - 1] - 128 & 0xFF) + ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 8);
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/String;"
	)
	public static String hy(xi var0) {
		int var1 = var0.au_fld;

		while (var0.al_fld[(var0.au_fld += 290315506) * 1105359937 - 1] != 0) {
		}

		int var2 = var0.au_fld - var1 - 1;
		return 0 == var2 ? "" : pc.ae(var0.al_fld, var1, var2);
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)I"
	)
	public static int gv(xi var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 3;
			int var2 = (var0.al_fld[var0.au_fld - 2] & 255) + ((var0.al_fld[var0.au_fld - 1] & 255) << 8) + ((var0.al_fld[var0.au_fld - 3] & 255) << 16);
			if (var2 > 8388607) {
				var2 -= 16777216;
			}

			return var2;
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public void eh(byte[] var1, int var2, int var3, int var4) {
		for (int var5 = var2; var5 < var3 + var2; var5++) {
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = var1[var5];
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cs(int var1, int var2) {
		if (var1 >= 0 && var1 <= 255) {
			this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int er(int var1) {
		this.au_fld += 2;
		int var2 = (this.al_fld[this.au_fld - 2] - 128 & 0xFF) + ((this.al_fld[this.au_fld - 1] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cm(int var1) {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 2] & 0xFF) << 8) + (this.al_fld[this.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cb(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		ld(this, var2, (byte)96);
		return var2;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ct(int var1) {
		int var2 = this.au_fld;

		while (this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] != 0) {
		}

		int var3 = this.au_fld - var2 - 1;
		return 0 == var3 ? "" : pc.ae(this.al_fld, var2, var3);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int dv(byte var1) {
		int var2 = this.al_fld[this.au_fld] & 255;
		return var2 < 128 ? this.dm() : tx(this, 1287038070) - 32768;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dq(int var1) {
		return this.al_fld[this.au_fld] < 0 ? this.em() & 2147483647 : tx(this, 997596270);
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ev(int var1) {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 4] & 0xFF)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 1] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int da(int var1) {
		int var2 = this.kz(-2043071372);
		return var2 >>> 1 ^ -(var2 & 1);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "([IB)V"
	)
	public void dx(int[] var1, byte var2) {
		int var3 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = this.co();
			int var6 = this.em();
			int var7 = 0;
			int var8 = -1640531527;
			int var9 = 32;

			while (var9-- > 0) {
				if (var2 != 45) {
					return;
				}

				var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				var7 += var8;
				var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
			}

			this.au_fld -= 8;
			ld(this, var5, (byte)112);
			ld(this, var6, (byte)104);
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "([IIII)V"
	)
	public void du(int[] var1, int var2, int var3, int var4) {
		int var5 = this.au_fld;
		this.au_fld = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; var7++) {
			int var8 = this.dz();
			int var9 = this.ew();
			int var10 = -957401312;
			int var11 = -1640531527;
			int var12 = 32;

			while (var12-- > 0) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
				var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3];
			}

			this.au_fld -= 8;
			ld(this, var8, (byte)127);
			ld(this, var9, (byte)121);
		}

		this.au_fld = var5;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public byte dj(int var1) {
		return (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int ss(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 2;
			int var2 = (var0.al_fld[var0.au_fld - 2] - 128 & 0xFF) + ((var0.al_fld[var0.au_fld - 1] & 255) << 8);
			if (var2 > 32767) {
				var2 -= 65536;
			}

			return var2;
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public byte es(int var1) {
		return (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/String;"
	)
	public static String lg(xi var0) {
		byte var1 = var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1];
		int var2 = var0.au_fld;

		while (var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] != 0) {
		}

		int var3 = var0.au_fld - var2 - 1;
		return var3 == 0 ? "" : pc.ae(var0.al_fld, var2, var3);
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public byte ep(int var1) {
		return (byte)(128 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1]);
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ed(int var1, int var2) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void et(int var1, int var2) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + 128);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public static void ti(xi var0, BigInteger var1, BigInteger var2) {
		int var3 = -1233846887 * var0.au_fld;
		var0.au_fld = 0;
		byte[] var4 = new byte[var3];
		xp(var0, var4, 0, var3, (byte)8);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		var0.au_fld = 0;
		var0.bw(var7.length);
		pm(var0, var7, 0, var7.length);
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int eq(byte var1) {
		this.au_fld += 3;
		int var2 = (this.al_fld[this.au_fld - 2] & 255) + ((this.al_fld[this.au_fld - 1] & 255) << 8) + ((this.al_fld[this.au_fld - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String dc(byte var1) {
		byte var2 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		if (0 != var2) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.dd();
			if (var3 + this.au_fld > this.al_fld.length) {
				throw new IllegalStateException("");
			} else {
				String var4 = wv.ag(this.al_fld, this.au_fld, var3);
				this.au_fld += var3 * 228932457;
				return var4;
			}
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ey(int var1) {
		int var2 = this.kz(-2043071372);
		return var2 >>> 1 ^ -(var2 & 1);
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int pa(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		short var1 = 0;

		int var2;
		for (var2 = var0.dz(); 32767 == var2; var2 = var0.dz()) {
			var1 += 32767;
		}

		return var1 + var2;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public byte cw(int var1) {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ca(int var1, int var2) {
		if (var1 >= 0 && var1 <= 255) {
			this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void vp(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 = var1 << 1 ^ var1 >> 31;
		var0.cr(var1, 1489402242);
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)B"
	)
	public static byte pc(xi var0) {
		return (byte)(1330267959 - var0.al_fld[(var0.au_fld += 2115980143) * 17310972 - 1]);
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void eb(int var1, byte var2) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mn(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int fv(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 4;
		return (var0.al_fld[var0.au_fld - 4] & 0xFF)
			+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 16)
			+ ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 24)
			+ ((var0.al_fld[var0.au_fld - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void be(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public void cy(byte[] var1, int var2, int var3, int var4) {
		for (int var5 = var2 + var3 - 1; var5 >= var2; var5--) {
			var1[var5] = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void dn(int var1, int var2) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kq(int var1) {
		this.al_fld[(this.au_fld += -308482632) * -661977895 - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ex(byte var1) {
		this.au_fld += 2;
		return (this.al_fld[this.au_fld - 1] - 128 & 0xFF) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int de(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		ld(this, var2, (byte)106);
		return var2;
	}
}
