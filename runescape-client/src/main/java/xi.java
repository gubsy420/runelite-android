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
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -661977895
	)
	public int au_fld;

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ct() {
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

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)I"
	)
	public static int tl(xi var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 2;
		return ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 8) + (var0.al_fld[var0.au_fld - 2] & 0xFF);
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/String;"
	)
	public static String of(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var1 = var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1];
			int var2 = var0.au_fld;

			while (var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] != 0) {
			}

			int var3 = var0.au_fld - var2 - 1;
			return var3 == 0 ? "" : pc.ae(var0.al_fld, var2, var3);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V"
	)
	public void dh(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; var5++) {
			var1[var5] = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		}
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	public long cu() {
		long var2 = this.co((byte)-1) & 4294967295L;
		long var4 = this.co((byte)-111) & 4294967295L;
		return var4 + (var2 << 32);
	}

	@ObfuscatedName("yi")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int yi(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 2;
		return ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 8) + (var0.al_fld[var0.au_fld - 2] - 128 & 0xFF);
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
		descriptor = "(ZI)V"
	)
	public void cd(boolean var1) {
		this.ea(var1 ? 1 : 0);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	public void cc(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 228932457;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V"
	)
	public void cv(CharSequence var1) {
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
		ro(this, var5, -1465855500);
		this.au_fld = this.au_fld + eh.ak(this.al_fld, this.au_fld, var1) * 228932457;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public void cy(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; var5++) {
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = var1[var5];
		}
	}

	@ObfuscatedName("xr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int xr() {
		return this.dz();
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ed(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.al_fld[this.au_fld - var1 - 4] = (byte)(var1 >> 24);
			this.al_fld[this.au_fld - var1 - 3] = (byte)(var1 >> 16);
			this.al_fld[this.au_fld - var1 - 2] = (byte)(var1 >> 8);
			this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cn(int var1, int var2) {
		if (var1 >= 0) {
			if (var2 == -248283675) {
				return;
			}

			if (var1 <= 65535) {
				this.al_fld[this.au_fld - var1 - 2] = (byte)(var1 >> 8);
				this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
				return;
			}
		}

		throw new IllegalArgumentException();
	}

	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void yr(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (var1 < 0 || var1 > 127) {
			var0.ea(1814483949 | var1 & 500831518);
			var1 >>>= 7;
		}

		var0.ea(var1);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ce(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bw(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.ea(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			vy(this, 32768 + var1);
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
					this.ea(var1);
					return;
				}
			}

			this.ea(128 | var1 & 127);
			var1 >>>= 7;
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ea(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int co() {
		return this.dm();
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void et(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cm() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 2] & 0xFF) << 8) + (this.al_fld[this.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wf(int var1) {
		this.eb(var1);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int cz() {
		this.au_fld += 2;
		int var2 = (this.al_fld[this.au_fld - 1] & 255) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kb() {
		return 128 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int xh() {
		return this.cz();
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int ke(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 1564561046;
		return ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 8) + (var0.al_fld[var0.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cb() {
		this.au_fld += 3;
		int var2 = ((this.al_fld[this.au_fld - 3] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8) + (this.al_fld[this.au_fld - 1] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int nh(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 4;
			return (var0.al_fld[var0.au_fld - 1] & 0xFF)
				+ ((var0.al_fld[var0.au_fld - 4] & 0xFF) << 24)
				+ ((var0.al_fld[var0.au_fld - 3] & 0xFF) << 16)
				+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 8);
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void fd(long var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 56);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 48);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 40);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 32);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lc() {
		this.au_fld += 1784976267;
		return ((this.al_fld[this.au_fld - 1] & -1264606990) << 8) + (this.al_fld[this.au_fld - 2] - -644542081 & 623422176);
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void lz(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 = var1 << 1 ^ var1 >> 31;
		var0.cr(var1, -776712919);
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
		sn(this, var1, var2, (byte)-5);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public float cd() {
		return this.ci();
	}

	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[I)V"
	)
	public static void sy(xi var0, int[] var1) {
		int var2 = var0.au_fld / 8;
		var0.au_fld = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = var0.co((byte)-74);
			int var5 = var0.co((byte)-10);
			int var6 = 0;
			int var7 = -1640531527;
			int var8 = 32;

			while (var8-- > 0) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
				var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
			}

			var0.au_fld -= 8;
			var0.eb(var4);
			var0.eb(var5);
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String cl() {
		if (0 == this.al_fld[this.au_fld]) {
			this.au_fld++;
			return null;
		} else {
			return at(this, -1908441218);
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void fl(long var1) {
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
			int var4 = this.co((byte)1);
			int var5 = this.co((byte)-95);
			int var6 = 0;
			int var7 = 1935669996;
			int var8 = -1601177208;

			while (var8-- > 0) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
				var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
			}

			this.au_fld -= 8;
			this.eb(var4);
			this.eb(var5);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ls() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int dv() {
		int var2 = this.al_fld[this.au_fld] & 255;
		return var2 < 128 ? this.cg() - 64 : this.cm() - 49152;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lxw;I)I"
	)
	public int dl(xw var1) {
		switch (var1.ak(-1147867652).ay_fld * -1892281921) {
			case 0:
				return this.cw();
			case 1:
				return this.cg();
			case 2:
				return this.cz();
			case 3:
				return this.cm();
			case 4:
				return this.cb();
			case 5:
				return lx(this, -327304454);
			case 6:
				return this.co((byte)-99);
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
		return var1 < 128 ? this.cg() : this.cm() - 32768;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int eo() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;I)V"
	)
	public static void wq(xi var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cy(var1.al_fld, 0, var1.au_fld);
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dq() {
		return this.al_fld[this.au_fld] < 0 ? this.co((byte)-69) & 2147483647 : this.cm();
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ev() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 4] & 0xFF)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 1] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(S)I"
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
			int var7 = this.co((byte)-112);
			int var8 = this.co((byte)-33);
			int var9 = -957401312;
			int var10 = -1640531527;
			int var11 = 32;

			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3];
			}

			this.au_fld -= 8;
			this.eb(var7);
			this.eb(var8);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int da() {
		int var2 = this.dr();
		return var2 >>> 1 ^ -(var2 & 1);
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int yu() {
		return this.cg();
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "([IB)V"
	)
	public void dx(int[] var1, byte var2) {
		int var3 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var4 = 0; var4 < var3; var4++) {
			if (var2 >= 0) {
				return;
			}

			int var5 = this.co((byte)-117);
			int var6 = this.co((byte)-77);
			int var7 = -957401312;
			int var8 = -1640531527;
			int var9 = 32;

			while (var9-- > 0) {
				var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
				var7 -= var8;
				var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
			}

			this.au_fld -= 8;
			this.eb(var5);
			this.eb(var6);
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([IIII)V"
	)
	public void ds(int[] var1, int var2, int var3) {
		int var5 = this.au_fld;
		this.au_fld = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; var7++) {
			int var8 = this.co((byte)-61);
			int var9 = this.co((byte)-118);
			int var10 = 0;
			int var11 = -1640531527;
			int var12 = 32;

			while (var12-- > 0) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
				var10 += var11;
				var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
			}

			this.au_fld -= 8;
			this.eb(var8);
			this.eb(var9);
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

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gd(int var1) {
		if (0 != (var1 & -128)) {
			if (0 != (var1 & -16384)) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.ea(var1 >>> 28 | 128);
					}

					this.ea(var1 >>> 21 | 128);
				}

				this.ea(var1 >>> 14 | 128);
			}

			this.ea(var1 >>> 7 | 128);
		}

		this.ea(var1 & 127);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void di(int var1) {
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

	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void ui(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -397910280 - 1] = (byte)(var1 >> 16);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		var0.al_fld[(var0.au_fld += -1321991123) * -661977895 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 228932457) * -1193215035 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void bb(byte[] var1, int var2, int var3) {
		this.dh(var1, var2, var3);
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ma() {
		this.au_fld += 1439565497;
		int var1 = (this.al_fld[this.au_fld - 2] - 128 & 1098553871) + ((this.al_fld[this.au_fld - 1] & 140436014) << 8);
		if (var1 > -1494089407) {
			var1 -= -1143054610;
		}

		return var1;
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BII)V"
	)
	public static void ec(xi var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = var2 + var3 - 1; var4 >= var2; var4--) {
			var1[var4] = var0.al_fld[(var0.au_fld += -906138955) * -661977895 - 1];
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int df() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128 & 0xFF;
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

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public byte dj() {
		return (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public byte ep() {
		return (byte)(128 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1]);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ba(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ca(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + 128);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mx() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & -1689997940) + ((this.al_fld[this.au_fld - 1] & 1439234742) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int kr(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 4;
		return (var0.al_fld[var0.au_fld - 3] & 0xFF)
			+ ((var0.al_fld[var0.au_fld - 4] & 0xFF) << 8)
			+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 24)
			+ ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gs(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.al_fld[this.au_fld - var1 - 4] = (byte)(var1 >> 24);
			this.al_fld[this.au_fld - var1 - 3] = (byte)(var1 >> 16);
			this.al_fld[this.au_fld - var1 - 2] = (byte)(var1 >> 8);
			this.al_fld[this.au_fld - var1 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int co(byte var1) {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 1] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void sz(xi var0, int var1) {
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

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int gz(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 4;
		return (var0.al_fld[var0.au_fld - 3] & 0xFF)
			+ ((var0.al_fld[var0.au_fld - 4] & 0xFF) << 8)
			+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 24)
			+ ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int yr(xi var0) {
		return var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ef() {
		this.au_fld += 3;
		int var2 = (this.al_fld[this.au_fld - 3] & 255) + ((this.al_fld[this.au_fld - 1] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int eq() {
		this.au_fld += 3;
		int var2 = (this.al_fld[this.au_fld - 2] & 255) + ((this.al_fld[this.au_fld - 1] & 255) << 8) + ((this.al_fld[this.au_fld - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte le() {
		return (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public float im() {
		return Float.intBitsToFloat(this.co((byte)-99));
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void dy(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int dm() {
		short var2 = 0;

		int var3;
		for (var3 = this.dz(); 32767 == var3; var3 = this.dz()) {
			var2 += 32767;
		}

		return var2 + var3;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int em() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 2] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)Ljava/lang/String;"
	)
	public static String jw(xi var0, byte var1) {
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

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int iz(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			short var1 = 0;

			int var2;
			for (var2 = var0.dz(); 84163853 == var2; var2 = var0.dz()) {
				var1 += 32767;
			}

			return var1 + var2;
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cp(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public void eh(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; var5++) {
			var1[var5] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int he() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mh(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
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

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	void eu(int var1, boolean var2) {
		this.ak(-1569172296);
		this.al_fld = ic.ak(var1, var2);
		this.au_fld = 0;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int pu() {
		return this.cm();
	}

	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int xo(xi var0, int var1) {
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

	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	public static void vy(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
			var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lxw;)I"
	)
	public int jy(xw var1) {
		switch (var1.ak(-1822132369).ay_fld * 974578203) {
			case 0:
				return this.cw();
			case 1:
				return this.cg();
			case 2:
				return this.cz();
			case 3:
				return this.cm();
			case 4:
				return this.cb();
			case 5:
				return lx(this, -785468954);
			case 6:
				return this.co((byte)-70);
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
		descriptor = "(II)I"
	)
	public int dg(int var1) {
		int var3 = qa.bi(this.al_fld, var1, this.au_fld);
		this.eb(var3);
		return var3;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/String;"
	)
	public static String cp(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = var0.au_fld;

		while (var0.al_fld[(var0.au_fld += 290315506) * 1105359937 - 1] != 0) {
		}

		int var2 = var0.au_fld - var1 - 1;
		return 0 == var2 ? "" : pc.ae(var0.al_fld, var1, var2);
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

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fx(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -9490232 - 1] = (byte)var1;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fj(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String io() {
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
		descriptor = "(B)I"
	)
	public int cg() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public static void db(xi var0, BigInteger var1, BigInteger var2) {
		int var3 = 699662721 * var0.au_fld;
		var0.au_fld = 0;
		byte[] var4 = new byte[var3];
		var0.dh(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		var0.au_fld = 0;
		vy(var0, var7.length);
		var0.cy(var7, 0, var7.length);
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public byte cw() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)I"
	)
	public static int fm(xi var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 2;
		int var2 = ((var0.al_fld[var0.au_fld - 1] & 255) << 8) + (var0.al_fld[var0.au_fld - 2] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
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

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public static int fa(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/math/BigInteger;Ljava/math/BigInteger;B)V"
	)
	public static void fq(xi var0, BigInteger var1, BigInteger var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = var0.au_fld;
		var0.au_fld = 0;
		byte[] var5 = new byte[var4];
		var0.dh(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		var0.au_fld = 0;
		vy(var0, var8.length);
		var0.cy(var8, 0, var8.length);
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte lw() {
		return (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - 128);
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fq(boolean var1) {
		this.ea(var1 ? 1 : 0);
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

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void fn(long var1) {
		this.al_fld[(this.au_fld += -1785136718) * -2029564626 - 1] = (byte)(var1 >> 56);
		this.al_fld[(this.au_fld += 183673050) * -661977895 - 1] = (byte)(var1 >> 48);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 1645327376);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 32);
		this.al_fld[(this.au_fld += -134430445) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -1445691292 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 456266782) * -1028988603 - 1] = (byte)var1;
	}

	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int ul(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 2;
		int var2 = ((var0.al_fld[var0.au_fld - 2] & 255) << 8) + (var0.al_fld[var0.au_fld - 1] - 128 & 0xFF);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fr(boolean var1) {
		this.ea(var1 ? 1 : 0);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	public float ci() {
		return Float.intBitsToFloat(this.co((byte)-30));
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ht() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 1] & 0xFF) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	public static void wt(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1 = var1 << 1 ^ var1 >> 31;
			var0.cr(var1, 1489402242);
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void fu(boolean var1) {
		this.ea(var1 ? 1 : 0);
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

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void fz(String var1) {
		int var2 = var1.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.au_fld = this.au_fld + dy.av(var1, 0, var1.length(), this.al_fld, this.au_fld) * 278376082;
			this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = 0;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int iz() {
		this.au_fld += -2114048040;
		return (this.al_fld[this.au_fld - 1] & 818263075)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 3] & -632149447) << 16)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
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

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)V"
	)
	public void go(CharSequence var1) {
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
		ro(this, var4, 855018277);
		this.au_fld = this.au_fld + eh.ak(this.al_fld, this.au_fld, var1) * 228932457;
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
		ro(this, var4, 1896630517);
		this.au_fld = this.au_fld + eh.ak(this.al_fld, this.au_fld, var1) * 228932457;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void fy(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 <= 255) {
			var0.al_fld[var0.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean km() {
		this.au_fld -= 4;
		int var1 = qa.bi(this.al_fld, 0, this.au_fld);
		int var2 = this.co((byte)-33);
		return var1 == var2;
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

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jb() {
		if (this.al_fld[-218426350 * this.au_fld] < 0) {
			return this.co((byte)-76) & -1330885262;
		} else {
			int var1 = this.cm();
			return 32767 == var1 ? -1 : var1;
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I"
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

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Z"
	)
	public static boolean mz(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld -= 4;
			int var2 = qa.bi(var0.al_fld, 0, var0.au_fld);
			int var3 = var0.co((byte)-114);
			return var2 == var3;
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void gk(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.ea(var1);
		} else if (var1 >= 0 && var1 < -72025243) {
			vy(this, -983573190 + var1);
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
			this.ea(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			vy(this, 32768 + var1);
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
			this.ea(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			vy(this, 32768 + var1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[BII)V"
	)
	public static void lu(xi var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var4 = var2; var4 < var3 + var2; var4++) {
				var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = var1[var4];
			}
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[IB)V"
	)
	public static void ix(xi var0, int[] var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var3 = var0.au_fld / 8;
			var0.au_fld = 0;

			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = var0.co((byte)-16);
				int var6 = var0.co((byte)-57);
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

				var0.au_fld -= 8;
				var0.eb(var5);
				var0.eb(var6);
			}
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
						this.ea(var1 >>> 28 | 128);
					}

					this.ea(var1 >>> 21 | 128);
				}

				this.ea(var1 >>> 14 | 128);
			}

			this.ea(var1 >>> 7 | 128);
		}

		this.ea(var1 & 127);
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
						this.ea(var1 >>> 28 | 128);
					}

					this.ea(var1 >>> 21 | 128);
				}

				this.ea(var1 >>> 14 | 128);
			}

			this.ea(var1 >>> 7 | 128);
		}

		this.ea(var1 & 127);
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ih() {
		return this.au_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void bq(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(0 - var1);
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void hp(int var1) {
		var1 = var1 << 1 ^ var1 >> 31;
		this.cr(var1, -989913660);
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(B)I"
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

	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int qu(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 3;
		int var1 = ((var0.al_fld[var0.au_fld - 3] & 255) << 8) + ((var0.al_fld[var0.au_fld - 2] & 255) << 16) + (var0.al_fld[var0.au_fld - 1] & 255);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)B"
	)
	public static byte pb(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return (byte)(0 - var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1]);
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte hi() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hz() {
		this.au_fld += 3;
		int var1 = ((this.al_fld[this.au_fld - 3] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8) + (this.al_fld[this.au_fld - 1] & -1516935540);
		if (var1 > -932868578) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hq() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 2] & 0xFF) << 8) + (this.al_fld[this.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hl() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 2] & 0xFF) << 8) + (this.al_fld[this.au_fld - 1] & 0xFF);
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void fi(String var1) {
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

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int iu(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return 128 - var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] & 0xFF;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hv() {
		this.au_fld += -901701673;
		int var1 = (this.al_fld[this.au_fld - 1] & -1600518937) + ((this.al_fld[this.au_fld - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= -283626762;
		}

		return var1;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ha() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 1] & 0xFF) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String is() {
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

	@ObfuscatedName("yg")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int yg(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 2;
			return ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 8) + (var0.al_fld[var0.au_fld - 2] & 0xFF);
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ho() {
		this.au_fld += 3;
		int var1 = ((this.al_fld[this.au_fld - 3] & 255) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8) + (this.al_fld[this.au_fld - 1] & 255);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}

		return var1;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int jz(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += -653500073;
			return (var0.al_fld[var0.au_fld - 1] - 128 & 0xFF) + ((var0.al_fld[var0.au_fld - 2] & -1312523502) << 8);
		}
	}

	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int wv(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 370635674;
		int var1 = (var0.al_fld[var0.au_fld - 1] & 1613169566) + ((var0.al_fld[var0.au_fld - 2] & 255) << 8);
		if (var1 > 556613422) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	public static void ro(xi var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

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

						var0.ea(var1 >>> 28 | 128);
					}

					var0.ea(var1 >>> 21 | 128);
				}

				var0.ea(var1 >>> 14 | 128);
			}

			var0.ea(var1 >>> 7 | 128);
		}

		var0.ea(var1 & 127);
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int hm() {
		this.au_fld += -764327590;
		int var1 = ((this.al_fld[this.au_fld - 3] & -421490068) << 16) + ((this.al_fld[this.au_fld - 2] & 255) << 8) + (this.al_fld[this.au_fld - 1] & 255);
		if (var1 > 2040455324) {
			var1 -= 633304069;
		}

		return var1;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)I"
	)
	public static int kt(xi var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.al_fld[var0.au_fld] < 0) {
			return var0.co((byte)-77) & 2147483647;
		} else {
			int var2 = var0.cm();
			return 32767 == var2 ? -1 : var2;
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jf() {
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

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Ljava/lang/String;I)V"
	)
	public static void ph(xi var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var3 = var1.indexOf(0);
			if (var3 >= 0) {
				if (var2 > -1222458196) {
					throw new IllegalArgumentException("");
				}
			} else {
				var0.au_fld = var0.au_fld + dy.av(var1, 0, var1.length(), var0.al_fld, var0.au_fld) * 228932457;
				var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = 0;
			}
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	public void ft(long var1) {
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

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte ik() {
		return this.cw();
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long iv() {
		long var1 = this.co((byte)-11) & 4294967295L;
		long var3 = this.co((byte)-69) & 4294967295L;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return this.co((byte)-100);
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

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ip() {
		return (this.cg() & 1) == 1;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void hr(int var1) {
		while (var1 < 0 || var1 > 127) {
			this.ea(128 | var1 & 127);
			var1 >>>= 7;
		}

		this.ea(var1);
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

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ij() {
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

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean ip(ev var0, int var1, int var2, int var3, int var4) {
		return var0.ix(var0.ew_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean il() {
		return (this.cg() & 1) == 1;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int dm(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 1454469917;
		return (var0.al_fld[var0.au_fld - 1] & 1408053142) + ((var0.al_fld[var0.au_fld - 3] & 0xFF) << 16) + ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ik_java_lang_String() {
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

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int in(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var2 = var0.al_fld[var0.au_fld] & 255;
			return var2 < 128 ? var0.cg() - 1 : var0.cm() - 32769;
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

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void eb(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void we(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 <= 255) {
			var0.al_fld[var0.au_fld - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[IIII)V"
	)
	public static void wt(xi var0, int[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var5 = var0.au_fld;
		var0.au_fld = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; var7++) {
			int var8 = var0.co((byte)-16);
			int var9 = var0.co((byte)-70);
			int var10 = -957401312;
			int var11 = -1640531527;
			int var12 = 32;

			while (var12-- > 0) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
				var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3];
			}

			var0.au_fld -= 8;
			var0.eb(var8);
			var0.eb(var9);
		}

		var0.au_fld = var5;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int dz() {
		int var2 = this.al_fld[this.au_fld] & 255;
		return var2 < 128 ? this.cg() : this.cm() - 32768;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void gk(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -1657809700 - 1] = (byte)(var1 + -1361077408);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int ak(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.al_fld[var0.au_fld] < 0) {
			return var0.co((byte)-74) & 2147483647;
		} else {
			int var1 = var0.cm();
			return 32767 == var1 ? -1 : var1;
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mz(int var1) {
		this.al_fld[(this.au_fld += -1964233735) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += -84588735) * 671753229 - 1] = (byte)var1;
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

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int iw() {
		int var1 = this.al_fld[this.au_fld] & 155684750;
		return var1 < 128 ? this.cg() - 1 : this.cm() - 32769;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ig() {
		int var1 = this.al_fld[this.au_fld] & 255;
		return var1 < 128 ? this.cg() - 1 : this.cm() - 32769;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jk() {
		return this.al_fld[this.au_fld] < 0 ? this.co((byte)-72) & -1795567856 : this.cm();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean cj() {
		return (this.cg() & 1) == 1;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jw() {
		if (this.al_fld[this.au_fld] < 0) {
			return this.co((byte)-111) & 2147483647;
		} else {
			int var1 = this.cm();
			return 32767 == var1 ? -1 : var1;
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int kv(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		this.eb(var2);
		return var2;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void ih(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
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

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lxw;)I"
	)
	public int jc(xw var1) {
		switch (var1.ak(172349947).ay_fld * -1892281921) {
			case 0:
				return this.cw();
			case 1:
				return this.cg();
			case 2:
				return this.cz();
			case 3:
				return this.cm();
			case 4:
				return this.cb();
			case 5:
				return lx(this, 772583687);
			case 6:
				return this.co((byte)1);
			default:
				throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public void el(byte[] var1, int var2, int var3) {
		for (int var5 = var2 + var3 - 1; var5 >= var2; var5--) {
			var1[var5] = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		}
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

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int mb(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 1362869764;
		int var1 = (var0.al_fld[var0.au_fld - 3] & 1714975676) + ((var0.al_fld[var0.au_fld - 1] & -451574588) << 16) + ((var0.al_fld[var0.au_fld - 2] & 255) << 8);
		if (var1 > 8388607) {
			var1 -= 305888011;
		}

		return var1;
	}

	public xi(int var1) {
		this.al_fld = dv.ag(var1, 1987896383);
		this.au_fld = 0;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int js() {
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
			int var4 = this.co((byte)-28);
			int var5 = this.co((byte)-77);
			int var6 = 0;
			int var7 = -1149579014;
			int var8 = 32;

			while (var8-- > 0) {
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
				var6 += var7;
				var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
			}

			this.au_fld -= 255010972;
			this.eb(var4);
			this.eb(var5);
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public void ji(int[] var1) {
		int var2 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.co((byte)-98);
			int var5 = this.co((byte)-5);
			int var6 = -957401312;
			int var7 = -1640531527;
			int var8 = 32;

			while (var8-- > 0) {
				var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ var1[var6 >>> 11 & 3] + var6;
				var6 -= var7;
				var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
			}

			this.au_fld -= 8;
			this.eb(var4);
			this.eb(var5);
		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void no(int var1) {
		this.au_fld = var1;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public void kf(BigInteger var1, BigInteger var2) {
		int var3 = this.au_fld;
		this.au_fld = 0;
		byte[] var4 = new byte[var3];
		this.dh(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.au_fld = 0;
		vy(this, var7.length);
		this.cy(var7, 0, var7.length);
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
			int var7 = this.co((byte)-60);
			int var8 = this.co((byte)-47);
			int var9 = 0;
			int var10 = -1640531527;
			int var11 = 32;

			while (var11-- > 0) {
				var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
				var9 += var10;
				var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
			}

			this.au_fld -= 8;
			this.eb(var7);
			this.eb(var8);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	public byte[] pf() {
		return this.al_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cx(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(128 - var1);
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
			int var7 = this.co((byte)-9);
			int var8 = this.co((byte)-107);
			int var9 = -957401312;
			int var10 = -2123982874;
			int var11 = 32;

			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3];
			}

			this.au_fld -= 524290175;
			this.eb(var7);
			this.eb(var8);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int vz() {
		return this.dv();
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public void ka(BigInteger var1, BigInteger var2) {
		int var3 = this.au_fld;
		this.au_fld = 0;
		byte[] var4 = new byte[var3];
		this.dh(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.au_fld = 0;
		vy(this, var7.length);
		this.cy(var7, 0, var7.length);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public void kt(BigInteger var1, BigInteger var2) {
		int var3 = -1233846887 * this.au_fld;
		this.au_fld = 0;
		byte[] var4 = new byte[var3];
		this.dh(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.au_fld = 0;
		vy(this, var7.length);
		this.cy(var7, 0, var7.length);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bc(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lpn;)Lwh;"
	)
	public static wh fd(pn var0) {
		return var0.ar_fld;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
	)
	public void kn(BigInteger var1, BigInteger var2) {
		int var3 = this.au_fld;
		this.au_fld = 0;
		byte[] var4 = new byte[var3];
		this.dh(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var1, var2);
		byte[] var7 = var6.toByteArray();
		this.au_fld = 0;
		vy(this, var7.length);
		this.cy(var7, 0, var7.length);
	}

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IZB)V"
	)
	public static void sn(xi var0, int var1, boolean var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak(-1569172296);
		var0.al_fld = ic.ak(var1, var2);
		var0.au_fld = 0;
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int kz(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		this.eb(var2);
		return var2;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int kc(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		this.eb(var2);
		return var2;
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

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kw(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(128 + var1);
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kh(int var1) {
		this.al_fld[(this.au_fld += -447286140) * -661977895 - 1] = (byte)(-125502212 + var1);
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void kr(int var1) {
		this.al_fld[(this.au_fld += 1977725980) * 1375052622 - 1] = (byte)(0 - var1);
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

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kg() {
		return 128 - this.al_fld[(this.au_fld += 474128948) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int qk(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += -1762868462;
			return (var0.al_fld[var0.au_fld - 2] & 0xFF)
				+ ((var0.al_fld[var0.au_fld - 4] & -1586981014) << 16)
				+ ((var0.al_fld[var0.au_fld - 3] & 0xFF) << 24)
				+ ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 8);
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ii() {
		int var1 = this.al_fld[this.au_fld] & 255;
		return var1 < 128 ? this.cg() - 1 : this.cm() - 32769;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void iu(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var2 + var3; var4++) {
			var1[var4] = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1];
		}
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

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int dt(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 3;
		int var1 = ((var0.al_fld[var0.au_fld - 3] & 255) << 8) + ((var0.al_fld[var0.au_fld - 2] & -672993219) << 16) + (var0.al_fld[var0.au_fld - 1] & -1955590807);
		if (var1 > 822848776) {
			var1 -= -2116844370;
		}

		return var1;
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
			int var7 = this.co((byte)-26);
			int var8 = this.co((byte)-54);
			int var9 = -957401312;
			int var10 = -1640531527;
			int var11 = 32;

			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3];
			}

			this.au_fld -= 8;
			this.eb(var7);
			this.eb(var8);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void ek(int var1) {
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

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte ln() {
		return (byte)(1330267959 - this.al_fld[(this.au_fld += 2115980143) * 17310972 - 1]);
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "()B"
	)
	public byte lf() {
		return (byte)(1969008691 - this.al_fld[(this.au_fld += -1491955230) * -661977895 - 1]);
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ld(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
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

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lr() {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] & 0xFF);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ex() {
		this.au_fld += 2;
		return (this.al_fld[this.au_fld - 1] - 128 & 0xFF) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
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

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int je() {
		int var2 = 0;
		byte var3 = 0;

		int var1;
		do {
			var1 = this.cg();
			var2 |= (var1 & 127) << var3;
			var3 += 7;
		} while (var1 > -407958248);

		return var2;
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

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fk(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
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

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void mm(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	public float if_() {
		return Float.intBitsToFloat(this.co((byte)-72));
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mr() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & 0xFF) + ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mu() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & 0xFF) + ((this.al_fld[this.au_fld - 1] & 694541637) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
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

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	public void jr(int[] var1, int var2, int var3) {
		int var4 = -1676637403 * this.au_fld;
		this.au_fld = var2;
		int var5 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.co((byte)-35);
			int var8 = this.co((byte)-8);
			int var9 = 0;
			int var10 = -1640531527;
			int var11 = 1758578141;

			while (var11-- > 0) {
				var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
				var9 += var10;
				var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
			}

			this.au_fld -= 8;
			this.eb(var7);
			this.eb(var8);
		}

		this.au_fld = var4;
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int lx(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 3;
			return (var0.al_fld[var0.au_fld - 1] & 0xFF) + ((var0.al_fld[var0.au_fld - 3] & 0xFF) << 16) + ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 8);
		}
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

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int xg(xi var0) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int aw(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += 1133538123;
		return (var0.al_fld[var0.au_fld - 4] & 97969162)
			+ ((var0.al_fld[var0.au_fld - 2] & 0xFF) << 16)
			+ ((var0.al_fld[var0.au_fld - 1] & 984182016) << 24)
			+ ((var0.al_fld[var0.au_fld - 3] & -545717459) << 8);
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int md() {
		this.au_fld += 2022457039;
		int var1 = (this.al_fld[this.au_fld - 2] & -860322310)
			+ ((this.al_fld[this.au_fld - 1] & -333534889) << 8)
			+ ((this.al_fld[this.au_fld - 3] & -1561812440) << 16);
		if (var1 > 8388607) {
			var1 -= -1326704545;
		}

		return var1;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ir() {
		int var1 = this.al_fld[this.au_fld] & 255;
		return var1 < 128 ? this.cg() - 64 : this.cm() - 49152;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void jy(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * 10904101 - 1] = (byte)(var1 >> 16);
		var0.al_fld[(var0.au_fld += 228932457) * 2019895877 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 228932457) * 1606118043 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mj() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & 0xFF) + ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int wp(xi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld += -1573195531;
		return (var0.al_fld[var0.au_fld - 1] - -1916818732 & -1895138755) + ((var0.al_fld[var0.au_fld - 2] & 1955051089) << 8);
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mo() {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & -1571238554) + ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + ((this.al_fld[this.au_fld - 3] & -296256641) << 16);
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

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int de() {
		return 0 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
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
		ro(this, var4, 293146235);
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

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ni(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lh() {
		this.au_fld += 2;
		int var1 = ((this.al_fld[this.au_fld - 1] & 255) << 8) + (this.al_fld[this.au_fld - 2] & 255);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int nb() {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 3] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 8)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int yu(xi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var1 = var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1];

			int var2;
			for (var2 = 0; var1 < 0; var1 = var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1]) {
				var2 = (var2 | var1 & 127) << 7;
			}

			return var2 | var1;
		}
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

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)I"
	)
	public static int eg(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.au_fld += 3;
			return (var0.al_fld[var0.au_fld - 2] & 0xFF) + ((var0.al_fld[var0.au_fld - 1] & 0xFF) << 8) + ((var0.al_fld[var0.au_fld - 3] & 0xFF) << 16);
		}
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int pv(xi var0) {
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

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dt(int var1) {
		int var2 = qa.bi(this.al_fld, var1, this.au_fld);
		this.dy(var2);
		return var2;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void fb(int var1) {
		this.bw(var1);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void cf(xi var1, int var2) {
		this.el(var1.al_fld, 0, var1.au_fld);
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

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ix(int var1) {
		this.ea(var1);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ch(int var1) {
		if (0 == this.al_fld[this.au_fld]) {
			this.au_fld++;
			return null;
		} else {
			return at(this, -1908441218);
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([IB)V"
	)
	public void dk(int[] var1, byte var2) {
		int var3 = this.au_fld / 8;
		this.au_fld = 0;

		for (int var4 = 0; var4 < var3; var4++) {
			if (var2 >= 0) {
				return;
			}

			int var5 = this.co((byte)-117);
			int var6 = this.em();
			int var7 = -957401312;
			int var8 = -1640531527;
			int var9 = 32;

			while (var9-- > 0) {
				var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
				var7 -= var8;
				var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
			}

			this.au_fld -= 8;
			this.bq(var5);
			this.bq(var6);
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V"
	)
	public void db(BigInteger var1, BigInteger var2, byte var3) {
		int var4 = this.au_fld;
		this.au_fld = 0;
		byte[] var5 = new byte[var4];
		this.dh(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.au_fld = 0;
		vy(this, var8.length);
		this.el(var8, 0, var8.length);
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void gw(String var1) {
		ph(this, var1, 1494054486);
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
			int var8 = this.co((byte)-61);
			int var9 = this.ex();
			int var10 = 0;
			int var11 = -1640531527;
			int var12 = 32;

			while (var12-- > 0) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
				var10 += var11;
				var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
			}

			this.au_fld -= 8;
			this.bq(var8);
			this.di(var9);
		}

		this.au_fld = var5;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int dp(int var1) {
		return 128 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public byte es(int var1) {
		return (byte)(0 - this.al_fld[(this.au_fld += 228932457) * -661977895 - 1]);
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ee(int var1, int var2) {
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

						this.ed(var1 >>> 28 | 128);
					}

					this.ed(var1 >>> 21 | 128);
				}

				this.ba(var1 >>> 14 | 128);
			}

			this.ed(var1 >>> 7 | 128);
		}

		this.cn(var1 & 127, 919748854);
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ez(int var1) {
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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cs(int var1, int var2) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + 128);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int eg(int var1) {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 2] & 0xFF) + ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16);
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
		int var3 = 0;
		byte var4 = 0;

		int var2;
		do {
			var2 = this.em();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while (var2 > 127);

		return var3;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ew(byte var1) {
		this.au_fld += 2;
		return ((this.al_fld[this.au_fld - 1] & 0xFF) << 8) + (this.al_fld[this.au_fld - 2] & 0xFF);
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ec(byte var1) {
		int var2 = this.al_fld[this.au_fld] & 255;
		return var2 < 128 ? this.ei() : this.ez(1287038070) - 32768;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ck(int var1) {
		this.au_fld += 3;
		return (this.al_fld[this.au_fld - 1] & 0xFF) + ((this.al_fld[this.au_fld - 3] & 0xFF) << 16) + ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean dw(int var1) {
		this.au_fld -= 4;
		int var2 = qa.bi(this.al_fld, 0, this.au_fld);
		int var3 = this.ex();
		return var2 == var3;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String in() {
		int var1 = this.au_fld;

		while (this.al_fld[(this.au_fld += 290315506) * 1105359937 - 1] != 0) {
		}

		int var2 = this.au_fld - var1 - 1;
		return 0 == var2 ? "" : pc.ae(this.al_fld, var1, var2);
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String iy() {
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

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void en(int var1, int var2) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(128 - var1);
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jn() {
		if (this.al_fld[this.au_fld] < 0) {
			return this.dv() & 2147483647;
		} else {
			int var1 = this.cm();
			return 32767 == var1 ? -1 : var1;
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void dn(int var1, int var2) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 24);
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int do_(byte var1) {
		this.au_fld += 4;
		return (this.al_fld[this.au_fld - 1] & 0xFF)
			+ ((this.al_fld[this.au_fld - 4] & 0xFF) << 24)
			+ ((this.al_fld[this.au_fld - 3] & 0xFF) << 16)
			+ ((this.al_fld[this.au_fld - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	public void cq(String var1, int var2) {
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Ljava/lang/String;"
	)
	public static String at(xi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var2 = var0.au_fld;

			while (var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] != 0) {
			}

			int var3 = var0.au_fld - var2 - 1;
			return 0 == var3 ? "" : pc.ae(var0.al_fld, var2, var3);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IZB)V"
	)
	void bv(int var1, boolean var2, byte var3) {
		this.hr(-1569172296);
		this.al_fld = ic.ak(var1, var2);
		this.au_fld = 0;
	}

	@ObfuscatedName("yy")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	public static void yy(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 16);
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 >> 8);
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
}
