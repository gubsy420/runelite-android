import java.util.ArrayList;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kj")
public class kj {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1479124089
	)
	public int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1846813669
	)
	public int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -621797759
	)
	public int ak_fld;

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bh(int var0) {
		return 64 + (var0 << 7);
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)I"
	)
	public static int nr(kj var0) {
		return ak(var0.az_fld, var0.ak_fld >> 13, var0.ag_fld >> 13);
	}

	public kj(int var1, int var2, int var3) {
		this.az_fld = var1;
		this.ak_fld = var2;
		this.ag_fld = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public static int aw(int var0) {
		return var0 << 7;
	}

	public kj(int var1) {
		if (-1 == var1) {
			this.az_fld = -615342573;
		} else {
			this.az_fld = 615342573 * (var1 >> 28 & 3);
			this.ak_fld = -1810751103 * (var1 >> 14 & 16383);
			this.ag_fld = -1225554487 * (var1 & 16383);
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	public static boolean dh(kj var0) {
		return -1 != var0.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	public static int ak(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ag(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ar(int var1) {
		if (-1 == var1) {
			this.az_fld = -615342573;
		} else {
			this.az_fld = var1 >> 28 & 3;
			this.ak_fld = var1 >> 14 & 16383;
			this.ag_fld = var1 & 16383;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int av(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public static int ah(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bo(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 0xFF;
		int var5 = var1 & 0xFF;
		this.az_fld = 615342573 * (var1 >> 28);
		this.ak_fld = var2 + (var4 << 13);
		this.ag_fld = -1225554487 * (var3 + (var5 << 13));
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Ljava/lang/Object;)Z"
	)
	public static boolean eg(kj var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 == var0) {
			return true;
		} else {
			return !(var1 instanceof kj) ? false : var0.an((kj)var1);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ay(int var0) {
		return var0 >> 7;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ax() {
		return -1 != this.az_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bf() {
		return !this.ax() ? -1 : ak(727004811 * this.az_fld, this.ak_fld * 1132034147, this.ag_fld * -1829855014);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int al() {
		return ak(this.az_fld, this.ak_fld >> 13, this.ag_fld >> 13);
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)I"
	)
	public static int py(kj var0) {
		return ak(var0.az_fld, var0.ak_fld >> 13, var0.ag_fld >> 13);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bm(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bz(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof kj) ? false : this.an((kj)var1);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)Z"
	)
	boolean an(kj var1) {
		if (this.az_fld != var1.az_fld) {
			return false;
		} else {
			return var1.ak_fld != this.ak_fld ? false : this.ag_fld == var1.ag_fld;
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		return this.af();
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return this.aa(",");
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;"
	)
	String aa(String var1) {
		return this.az_fld + var1 + (this.ak_fld >> 6) + var1 + (this.ag_fld >> 6) + var1 + (this.ak_fld & 63) + var1 + (this.ag_fld & 63);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int at(int var0) {
		return var0 & -583493879;
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.aa(",");
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof kj) ? false : this.an((kj)var1);
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof kj) ? false : this.an((kj)var1);
		}
	}

	public kj(kj var1) {
		this.az_fld = var1.az_fld * 1846813669;
		this.ak_fld = 1 * var1.ak_fld;
		this.ag_fld = 1 * var1.ag_fld;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.af();
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return this.af();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int ai(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int aq(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int am(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ad(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ao(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ab(int var0) {
		return var0 >> 14 & 773314184;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ap(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int az(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ac(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aj(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("yc")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;)Z"
	)
	public static boolean yc(kj var0, kj var1) {
		if (var0.az_fld != var1.az_fld) {
			return false;
		} else {
			return var1.ak_fld != var0.ak_fld ? false : var0.ag_fld == var1.ag_fld;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	boolean bu(kj var1) {
		if (this.az_fld != var1.az_fld) {
			return false;
		} else {
			return var1.ak_fld != this.ak_fld ? false : this.ag_fld == var1.ag_fld;
		}
	}

	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "(Lma;)Ljava/util/ArrayList;"
	)
	public static ArrayList rz(ma var0) {
		return var0.af_fld.ag_fld;
	}

	public kj() {
		this.az_fld = -615342573;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void au(int var1, int var2, int var3) {
		int var5 = var1 >> 14 & 0xFF;
		int var6 = var1 & 0xFF;
		this.az_fld = 615342573 * (var1 >> 28);
		this.ak_fld = var2 + (var5 << 13);
		this.ag_fld = -1225554487 * (var3 + (var6 << 13));
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int br(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V"
	)
	public static void ha(kj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (-1 == var1) {
			var0.az_fld = -615342573;
		} else {
			var0.az_fld = var1 >> 28 & 3;
			var0.ak_fld = var1 >> 14 & 16383;
			var0.ag_fld = var1 & 16383;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bs(int var0) {
		return var0 << 7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int as(int var0) {
		return 64 + (var0 << 7);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bj(int var1) {
		if (-1 == var1) {
			this.az_fld = -615342573;
		} else {
			this.az_fld = var1 >> 28 & 3;
			this.ak_fld = var1 >> 14 & 16383;
			this.ag_fld = var1 & 16383;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ae(int var0) {
		return var0 >> 3;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.aa(",");
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bx() {
		return ak(-2037318293 * this.az_fld, this.ak_fld >> 13, this.ag_fld >> 13);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	public static boolean bm(kj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return -1 != var0.az_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	String ba(String var1) {
		return this.az_fld + var1 + (this.ak_fld >> 6) + var1 + (this.ag_fld >> 6) + var1 + (this.ak_fld & -818347710) + var1 + (this.ag_fld & -1229118333);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bp(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 56356541;
		int var5 = var1 & 1803814297;
		this.az_fld = -1588576775 * (var1 >> 28);
		this.ak_fld = var2 + (var4 << 13);
		this.ag_fld = -1225554487 * (var3 + (var5 << 13));
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bd(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	boolean bw(kj var1) {
		if (this.az_fld != var1.az_fld) {
			return false;
		} else {
			return var1.ak_fld != this.ak_fld ? false : this.ag_fld == var1.ag_fld;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int be(int var0) {
		return var0 << 7;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	boolean bc(kj var1) {
		if (this.az_fld != var1.az_fld) {
			return false;
		} else {
			return var1.ak_fld != this.ak_fld ? false : this.ag_fld == var1.ag_fld;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int af() {
		return !this.ax() ? -1 : ak(this.az_fld, this.ak_fld, this.ag_fld);
	}
}
