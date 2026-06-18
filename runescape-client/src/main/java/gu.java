import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 285569539
	)
	int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -764828807
	)
	int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1091125853
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
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -889401323
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ak() {
		return this.ag_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bm() {
		return this.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int az() {
		return this.az_fld;
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V"
	)
	public static void ng(gu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1 & 2047;
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
		descriptor = "(Lgu;I)V"
	)
	public void ay(gu var1) {
		this.ak_fld = var1.ak_fld * -1091125853;
		this.ag_fld = 1 * var1.ag_fld;
		this.av_fld = var1.av_fld * 285569539;
		this.az_fld = var1.az_fld * -764828807;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)I"
	)
	public static int kd(gu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld >> 7;
	}

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Lgu;B)I"
	)
	public static int rg(gu var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld;
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(Lgu;IIIII)V"
	)
	public static void xn(gu var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld += 1986559805 * var1;
		var0.av_fld += var2 * 1170491563;
		var0.az_fld += var3 * 1917081289;
		var0.aw(var0.ak_fld + var4);
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lgu;)V"
	)
	public static void nb(gu var0, gu var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1.ak_fld * -1091125853;
		var0.ag_fld = 1 * var1.ag_fld;
		var0.av_fld = var1.av_fld * 285569539;
		var0.az_fld = var1.az_fld * -764828807;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void bk(int var1, int var2) {
		this.ag_fld = -2017523747 * var1;
		this.az_fld = var2;
	}

	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "(Lgu;III)V"
	)
	public static void tt(gu var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld += var1 * 1986559805;
		var0.az_fld += 1917081289 * var2;
	}

	public gu() {
		this.az_fld = 0;
		this.av_fld = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ar(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		return var1 instanceof gu ? this.au((gu)var1) : false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)Z"
	)
	boolean au(gu var1) {
		return this.ag_fld == var1.ag_fld && var1.av_fld == this.av_fld && var1.az_fld == this.az_fld && this.ak_fld == var1.ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag() {
		return this.av_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int an() {
		return this.ag_fld;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)Ljava/lang/String;"
	)
	public static String cj(gu var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld + ", " + var0.av_fld + ", " + 1448521729 * var0.az_fld + ", " + -1378466622 * var0.ak_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ap() {
		return this.az_fld >> 7;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(Lgu;B)I"
	)
	public static int ey(gu var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld >> 7;
		}
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V"
	)
	public static void xn(gu var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var1 * 940449625;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int am() {
		return this.az_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ao() {
		return this.ag_fld >> 7;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int at() {
		return this.az_fld >> 7;
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bz(int var1) {
		this.ak_fld = (var1 & 2047) * 691560772;
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ac() {
		return this.az_fld >> 7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	public void as(int var1, int var2) {
		this.ag_fld = var1;
		this.az_fld = var2;
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

	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "(Lgu;IIII)V"
	)
	public static void uf(gu var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ag_fld += 1986559805 * var1;
			var0.av_fld += var2 * 1170491563;
			var0.az_fld += var3 * -1370638487;
			var0.aw(var0.ak_fld + var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void aw(int var1) {
		this.ak_fld = var1 & 2047;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
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

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lgu;)V"
	)
	public static void my(gu var0, gu var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1.ak_fld * -1091125853;
		var0.ag_fld = 1 * var1.ag_fld;
		var0.av_fld = var1.av_fld * 285569539;
		var0.az_fld = var1.az_fld * -764828807;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)Z"
	)
	boolean bc(gu var1) {
		return this.ag_fld == var1.ag_fld && var1.av_fld == this.av_fld && var1.az_fld == this.az_fld && this.ak_fld == var1.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void al(int var1, int var2, int var3, int var4, int var5) {
		this.az_fld += 1986559805 * var1;
		this.az_fld = this.ag_fld + var2 * 1170491563;
		this.az_fld = this.ag_fld + var3 * 1917081289;
		this.aw(this.av_fld + var4);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae(int var1) {
		return this.az_fld >> 7;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void af(int var1, int var2, int var3) {
		this.av_fld = this.az_fld + var1 * 1986559805;
		this.az_fld = this.ak_fld + 1917081289 * var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ah(byte var1) {
		return this.az_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ad() {
		return this.ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int av(byte var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bd(int var1) {
		this.av_fld = var1;
	}
}
