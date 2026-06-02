import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gu")
public class gu {
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean hh_fld;
	@ObfuscatedGetter(
		intValue = 285569539
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -764828807
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -1091125853
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld = 0;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cd_fld;
	@ObfuscatedGetter(
		intValue = -889401323
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld = 0;

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bo(int var1, int var2) {
		this.ag_fld += var1 * 1986559805;
		this.az_fld += 1917081289 * var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ah() {
		return this.ag_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void al(int var1, int var2, int var3, int var4) {
		this.ag_fld += 1986559805 * var1;
		this.av_fld += var2 * 1170491563;
		this.az_fld += var3 * 1917081289;
		this.aw(this.ak_fld + var4);
	}

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)I"
	)
	public static int wg(gu var0) {
		return var0.az_fld >> 7;
	}

	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Llu;"
	)
	public static lu sq(uk var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ae() {
		return this.az_fld >> 7;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return this.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	public void ay(gu var1) {
		this.ak_fld = var1.ak_fld * -1091125853;
		this.ag_fld = 1 * var1.ag_fld;
		this.av_fld = var1.av_fld * 285569539;
		this.az_fld = var1.az_fld * -764828807;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bk(int var1, int var2) {
		this.ag_fld = -2017523747 * var1;
		this.az_fld = var2;
	}

	public gu() {
		this.az_fld = 0;
		this.av_fld = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ar(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		return var1 instanceof gu ? this.au((gu)var1) : false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return this.ak_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)Z"
	)
	boolean au(gu var1) {
		return this.ag_fld == var1.ag_fld && var1.av_fld == this.av_fld && var1.az_fld == this.az_fld && this.ak_fld == var1.ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		return this.av_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bx(int var1, int var2) {
		this.ag_fld += var1 * 1986559805;
		this.az_fld += 1917081289 * var2;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return var1 instanceof gu ? this.au((gu)var1) : false;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return var1 instanceof gu ? this.au((gu)var1) : false;
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lgu;B)I"
	)
	public static int oq(gu var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld >> 7;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ax() {
		return this.ag_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	public void be(gu var1) {
		this.ak_fld = var1.ak_fld * -1091125853;
		this.ag_fld = 1 * var1.ag_fld;
		this.av_fld = var1.av_fld * 285569539;
		this.az_fld = var1.az_fld * -764828807;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aq() {
		return this.az_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int am() {
		return this.az_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ad() {
		return this.ag_fld >> 7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ao() {
		return this.ag_fld >> 7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ab() {
		return this.ag_fld >> 7;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int at() {
		return this.az_fld >> 7;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.ag_fld + ", " + this.av_fld + ", " + 1448521729 * this.az_fld + ", " + -1378466622 * this.ak_fld;
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)V"
	)
	public static void ry(gu var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld += var1 * 1986559805;
		var0.az_fld += 1917081289 * var2;
	}

	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)I"
	)
	public static int sw(gu var0) {
		return var0.az_fld >> 7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aj() {
		return this.ak_fld;
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.ag_fld + ", " + this.av_fld + ", " + this.az_fld + ", " + this.ak_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bd(int var1) {
		this.ak_fld = var1 & 2047;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bz(int var1) {
		this.ak_fld = (var1 & 2047) * 691560772;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void br(int var1) {
		this.ak_fld = var1 & 2047;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	public void bh(gu var1) {
		this.ak_fld = var1.ak_fld * -1091125853;
		this.ag_fld = 1 * var1.ag_fld;
		this.av_fld = var1.av_fld * 285569539;
		this.az_fld = var1.az_fld * -764828807;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return var1 instanceof gu ? this.au((gu)var1) : false;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bj(int var1) {
		this.av_fld = var1 * 940449625;
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)I"
	)
	public static int mo(gu var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bf(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void by(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bl(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aw(int var1) {
		this.ak_fld = var1 & 2047;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return this.ag_fld + ", " + this.av_fld + ", " + this.az_fld + ", " + this.ak_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bp(int var1, int var2, int var3, int var4) {
		this.ag_fld += 1986559805 * var1;
		this.av_fld += var2 * 2015125725;
		this.az_fld += var3 * 1357844257;
		this.aw(this.ak_fld + var4);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bt(int var1, int var2, int var3, int var4) {
		this.ag_fld += 1986559805 * var1;
		this.av_fld += var2 * 1170491563;
		this.az_fld += var3 * 1917081289;
		this.aw(this.ak_fld + var4);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bv(int var1, int var2, int var3, int var4) {
		this.ag_fld += 1986559805 * var1;
		this.av_fld += var2 * 1170491563;
		this.az_fld += var3 * 1917081289;
		this.aw(this.ak_fld + var4);
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)I"
	)
	public static int ns(gu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bi(int var1, int var2, int var3, int var4) {
		this.ag_fld += 1986559805 * var1;
		this.av_fld += var2 * 1170491563;
		this.az_fld += var3 * -1370638487;
		this.aw(this.ak_fld + var4);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)Z"
	)
	boolean bu(gu var1) {
		return this.ag_fld == var1.ag_fld && var1.av_fld == this.av_fld && var1.az_fld == this.az_fld && this.ak_fld == var1.ak_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)Z"
	)
	boolean bn(gu var1) {
		return this.ag_fld == var1.ag_fld && var1.av_fld == this.av_fld && var1.az_fld == this.az_fld && this.ak_fld == var1.ak_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)Z"
	)
	boolean bc(gu var1) {
		return this.ag_fld == var1.ag_fld && var1.av_fld == this.av_fld && var1.az_fld == this.az_fld && this.ak_fld == var1.ak_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bm() {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int az(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void af(int var1, int var2, int var3) {
		this.av_fld = this.az_fld + var1 * 1986559805;
		this.ak_fld = this.az_fld + 1917081289 * var2;
	}

	@ObfuscatedName("yu")
	@ObfuscatedSignature(
		descriptor = "(Lgu;IIB)V"
	)
	public static void yu(gu var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ag_fld = var1;
			var0.az_fld = var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ak(byte var1) {
		return this.av_fld >> 7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	public void as(int var1, int var2, byte var3) {
		this.ak_fld = 1986559805 * var1;
		this.ag_fld = var2 * 1917081289;
	}
}
