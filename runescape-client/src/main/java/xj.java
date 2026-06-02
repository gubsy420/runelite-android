import net.runelite.api.PacketBuffer;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xj")
@Implements({"PacketBuffer"})
public class xj extends xi implements PacketBuffer {
	@ObfuscatedGetter(
		intValue = -1399532557
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ak_fld = new int[]{
		0,
		1,
		3,
		7,
		15,
		31,
		63,
		127,
		255,
		511,
		1023,
		2047,
		4095,
		8191,
		16383,
		32767,
		65535,
		131071,
		262143,
		524287,
		1048575,
		2097151,
		4194303,
		8388607,
		16777215,
		33554431,
		67108863,
		134217727,
		268435455,
		536870911,
		1073741823,
		Integer.MAX_VALUE,
		-1
	};
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lyk;"
	)
	yk ag_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void ak(int var1) {
		super.ak(-1569172296);
		this.ag_fld = null;
		this.az_fld = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([IB)V"
	)
	public void ag(int[] var1, byte var2) {
		this.ag_fld = new yk(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void as(int var1) {
		this.au_fld = 228932457 * ((this.az_fld + 7) / 8);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void aq() {
		super.ak(-1569172296);
		this.ag_fld = null;
		this.az_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae(int var1) {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak() & 0xFF;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ah(int var1) {
		int var2 = this.al_fld[this.au_fld] - this.ag_fld.ag() & 0xFF;
		return var2 >= 128;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int aw(byte var1) {
		int var2 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak() & 0xFF;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak() & 0xFF);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BIII)V"
	)
	public void ay(byte[] var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < var3; var5++) {
			var1[var2 + var5] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak());
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bz() {
		int var1 = this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak() & 0xFF;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak() & 0xFF);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ar(int var1, int var2) {
		int var3 = this.az_fld >> 3;
		int var4 = 8 - (this.az_fld & 7);
		int var5 = 0;

		for (this.az_fld += var1 * -1512768197; var1 > var4; var4 = 8) {
			var5 += (this.al_fld[var3++] & ak_fld[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += this.al_fld[var3] & ak_fld[var4];
		} else {
			var5 += this.al_fld[var3] >> var4 - var1 & ak_fld[var1];
		}

		return var5;
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)I"
	)
	public static int wc(xj var0) {
		return var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] - var0.ag_fld.ak() & 0xFF;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bl() {
		this.au_fld = 228932457 * ((this.az_fld + 7) / 8);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void av(int var1, int var2) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + this.ag_fld.ak());
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ap(int var1) {
		this.az_fld = this.au_fld * 1682216984;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ax() {
		super.ak(-1569172296);
		this.ag_fld = null;
		this.az_fld = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void an() {
		super.ak(-1569172296);
		this.ag_fld = null;
		this.az_fld = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void aa() {
		super.ak(-1569172296);
		this.ag_fld = null;
		this.az_fld = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lyk;)V"
	)
	public void ao(yk var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	public void am(int[] var1) {
		this.ag_fld = new yk(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lyk;)V"
	)
	public void ab(yk var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lyk;I)V"
	)
	public void az(yk var1, int var2) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int at() {
		return this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak() & 0xFF;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void bh(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; var4++) {
			var1[var2 + var4] = (byte)(this.al_fld[(this.au_fld += -1875446162) * -661977895 - 1] - this.ag_fld.ak());
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void ai() {
		super.ak(-1569172296);
		this.ag_fld = null;
		this.az_fld = 0;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bm() {
		int var1 = this.al_fld[this.au_fld] - this.ag_fld.ag() & 0xFF;
		return var1 >= 128;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)I"
	)
	public static int go(xj var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return 8 * var1 - var0.az_fld;
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	public static void oh(xj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + var0.ag_fld.ak());
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	public static void on(xj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld = 228932457 * ((var0.az_fld + 7) / 8);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bd() {
		int var1 = this.al_fld[this.au_fld] - this.ag_fld.ag() & 0xFF;
		return var1 >= 128;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ac() {
		return this.al_fld[(this.au_fld += 228932457) * 160485274 - 1] - this.ag_fld.ak() & 0xFF;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int au(int var1, int var2) {
		return var1 - this.au_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void bk(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; var4++) {
			var1[var2 + var4] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak());
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void be(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; var4++) {
			var1[var2 + var4] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak());
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)I"
	)
	public static int nd(xj var0, int var1) {
		int var2 = var0.az_fld >> 3;
		int var3 = 8 - (var0.az_fld & 7);
		int var4 = 0;

		for (var0.az_fld += var1 * -1512768197; var1 > var3; var3 = 8) {
			var4 += (var0.al_fld[var2++] & ak_fld[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += var0.al_fld[var2] & ak_fld[var3];
		} else {
			var4 += var0.al_fld[var2] >> var3 - var1 & ak_fld[var1];
		}

		return var4;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bf(int var1) {
		int var2 = this.az_fld >> 3;
		int var3 = 8 - (this.az_fld & 7);
		int var4 = 0;

		for (this.az_fld += var1 * -1884898354; var1 > var3; var3 = 8) {
			var4 += (this.al_fld[var2++] & ak_fld[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += this.al_fld[var2] & ak_fld[var3];
		} else {
			var4 += this.al_fld[var2] >> var3 - var1 & ak_fld[var1];
		}

		return var4;
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void tq(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += -447286140) * -661977895 - 1] = (byte)(-125502212 + var1);
	}

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	public static void yo(xj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.au_fld = 228932457 * ((var0.az_fld + 7) / 8);
	}

	public xj(int var1) {
		super(var1);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bp(int var1) {
		return var1 - this.au_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int bt(int var1) {
		return var1 - this.au_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int al(int var1, int var2) {
		return var1 - this.au_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void af(int var1) {
		this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] = (byte)(var1 + this.ag_fld.ak());
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lxj;[BII)V"
	)
	public static void gb(xj var0, byte[] var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var4 = 0; var4 < var3; var4++) {
			var1[var2 + var4] = (byte)(var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] - var0.ag_fld.ak());
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	public void bs(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; var4++) {
			var1[var2 + var4] = (byte)(this.al_fld[(this.au_fld += 228932457) * -661977895 - 1] - this.ag_fld.ak());
		}
	}

	@ObfuscatedName("zr")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V"
	)
	public static void zr(rg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bx() {
		this.au_fld = 228932457 * ((this.az_fld + 7) / 8);
	}
}
