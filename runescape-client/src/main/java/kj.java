import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kj")
public class kj {
	@ObfuscatedGetter(
		intValue = 1479124089
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld;
	@ObfuscatedGetter(
		intValue = 1846813669
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedGetter(
		intValue = -621797759
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bh(int var0) {
		return 64 + (var0 << 7);
	}

	public kj(int var1, int var2, int var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aw(int var0) {
		return var0 << 7;
	}

	public kj(int var1) {
		if (-1 == var1) {
			this.ak_fld = -615342573;
		} else {
			this.ak_fld = 615342573 * (var1 >> 28 & 3);
			this.ag_fld = -1810751103 * (var1 >> 14 & 16383);
			this.az_fld = -1225554487 * (var1 & 16383);
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Ljava/lang/Object;)Z"
	)
	public static boolean mj(kj var0, Object var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 == var0) {
			return true;
		} else {
			return !(var1 instanceof kj) ? false : ef(var0, (kj)var1, (byte)16);
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Ljava/lang/String;B)Ljava/lang/String;"
	)
	public static String dp(kj var0, String var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak_fld + var1 + (var0.ag_fld >> 6) + var1 + (var0.az_fld >> 6) + var1 + (var0.ag_fld & 63) + var1 + (var0.az_fld & 63);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int ak(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ag(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int av(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
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
		this.ak_fld = 615342573 * (var1 >> 28);
		this.ag_fld = var2 + (var4 << 13);
		this.az_fld = -1225554487 * (var3 + (var5 << 13));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ay(int var0) {
		return var0 >> 7;
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
	@Override
	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof kj) ? false : ef(this, (kj)var1, (byte)16);
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		return bk(this, 561515521);
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return dp(this, ",", (byte)2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int at(int var0) {
		return var0 & -583493879;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return dp(this, ",", (byte)2);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof kj) ? false : ef(this, (kj)var1, (byte)16);
		}
	}

	public kj(kj var1) {
		this.ak_fld = var1.ak_fld * 1846813669;
		this.ag_fld = 1 * var1.ag_fld;
		this.az_fld = 1 * var1.az_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bi() {
		return -1 != this.ak_fld;
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		return bk(this, 1234804704);
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

	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V"
	)
	public static void up(kj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (-1 == var1) {
			var0.ak_fld = -615342573;
		} else {
			var0.ak_fld = var1 >> 28 & 3;
			var0.ag_fld = var1 >> 14 & 16383;
			var0.az_fld = var1 & 16383;
		}
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

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)I"
	)
	public static int pe(kj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return ak(var0.ak_fld, var0.ag_fld >> 13, var0.az_fld >> 13);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	boolean bn(kj var1) {
		if (this.ak_fld != var1.ak_fld) {
			return false;
		} else {
			return var1.ag_fld != this.ag_fld ? false : this.az_fld == var1.az_fld;
		}
	}

	public kj() {
		this.ak_fld = -615342573;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void au(int var1, int var2, int var3) {
		int var5 = var1 >> 14 & 0xFF;
		int var6 = var1 & 0xFF;
		this.ak_fld = 615342573 * (var1 >> 28);
		this.ag_fld = var2 + (var5 << 13);
		this.az_fld = -1225554487 * (var3 + (var6 << 13));
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V"
	)
	public static void am(kj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (-1 == var1) {
			var0.ak_fld = -615342573;
		} else {
			var0.ak_fld = var1 >> 28 & 3;
			var0.ag_fld = var1 >> 14 & 16383;
			var0.az_fld = var1 & 16383;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int br(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bv() {
		return -1 != this.ak_fld;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Ljava/lang/Object;)Z"
	)
	public static boolean go(kj var0, Object var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 == var0) {
			return true;
		} else {
			return !(var1 instanceof kj) ? false : ef(var0, (kj)var1, (byte)16);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)I"
	)
	public static int bk(kj var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return !en(var0, 316289649) ? -1 : ak(var0.ak_fld, var0.ag_fld, var0.az_fld);
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
		descriptor = "(I)I"
	)
	public static int as(int var0) {
		return 64 + (var0 << 7);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bk(int var1) {
		if (-1 == var1) {
			this.ak_fld = -615342573;
		} else {
			this.ak_fld = var1 >> 28 & 3;
			this.ag_fld = var1 >> 14 & 16383;
			this.az_fld = var1 & 16383;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ae(int var0) {
		return var0 >> 3;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int by() {
		return ak(this.ak_fld, this.ag_fld >> 13, this.az_fld >> 13);
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return dp(this, ",", (byte)2);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bx() {
		return ak(-2037318293 * this.ak_fld, this.ag_fld >> 13, this.az_fld >> 13);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	String ba(String var1) {
		return this.ak_fld + var1 + (this.ag_fld >> 6) + var1 + (this.az_fld >> 6) + var1 + (this.ag_fld & -818347710) + var1 + (this.az_fld & -1229118333);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bp(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 56356541;
		int var5 = var1 & 1803814297;
		this.ak_fld = -1588576775 * (var1 >> 28);
		this.ag_fld = var2 + (var4 << 13);
		this.az_fld = -1225554487 * (var3 + (var5 << 13));
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bt() {
		return -1 != this.ak_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int bd(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;B)Z"
	)
	public static boolean ef(kj var0, kj var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ak_fld != var1.ak_fld) {
			return false;
		} else {
			return var1.ag_fld != var0.ag_fld ? false : var0.az_fld == var1.az_fld;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bl() {
		return ak(this.ak_fld, this.ag_fld >> 13, this.az_fld >> 13);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	boolean bw(kj var1) {
		if (this.ak_fld != var1.ak_fld) {
			return false;
		} else {
			return var1.ag_fld != this.ag_fld ? false : this.az_fld == var1.az_fld;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)Z"
	)
	boolean bu(kj var1) {
		if (this.ak_fld != var1.ak_fld) {
			return false;
		} else {
			return var1.ag_fld != this.ag_fld ? false : this.az_fld == var1.az_fld;
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Lkj;)I"
	)
	public static int dy(kj var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return !en(var0, -1389792406) ? -1 : ak(727004811 * var0.ak_fld, var0.ag_fld * 1132034147, var0.az_fld * -1829855014);
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
		if (this.ak_fld != var1.ak_fld) {
			return false;
		} else {
			return var1.ag_fld != this.ag_fld ? false : this.az_fld == var1.az_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ar(int var1, int var2) {
		if (-1 == var1) {
			this.ag_fld = -615342573;
		} else {
			this.az_fld = (var1 >> 28 & 3) * 615342573;
			this.ag_fld = var1 >> 14 & 16383;
			this.ag_fld = (var1 & 16383) * -1225554487;
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)Z"
	)
	public static boolean en(kj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return -1 != var0.ak_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ax(int var1) {
		return -1 != this.az_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bf() {
		return bk(this, 561515521);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int al(int var1) {
		return !en(this, 316289649) ? -1 : ak(1846813669 * this.ag_fld, this.ak_fld * -621797759, this.ag_fld * 1479124089);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)Z"
	)
	boolean an(kj var1, byte var2) {
		if (this.az_fld != var1.ak_fld) {
			return false;
		} else {
			return var1.ag_fld != this.ag_fld ? false : this.ag_fld == var1.ak_fld;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;"
	)
	String aa(String var1, byte var2) {
		return 1846813669 * this.az_fld + var1 + (this.ag_fld >> 6) + var1 + (this.az_fld >> 6) + var1 + (this.az_fld & 63) + var1 + (this.az_fld & 63);
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return ak(this.ak_fld, this.ag_fld >> 13, this.ag_fld >> 13);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int af(int var1) {
		return !en(this, 316289649) ? -1 : ak(this.ak_fld, this.ag_fld, this.ag_fld * 1479124089);
	}
}
