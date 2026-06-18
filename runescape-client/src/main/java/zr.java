import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zr")
public class zr {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1910308051
	)
	int ag_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lzg;"
	)
	zg ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1211903427
	)
	int az_fld = 0;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean al(int var1) {
		return this.ak_fld.bs() == 2 || this.ak_fld.bs() == 1 && (!this.ak_fld.ao_fld || var1 != this.az_fld - 1);
	}

	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "(Lzr;I)Lzj;"
	)
	public static zj xm(zr var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 0 && var1 < var0.av() ? var0.ak_fld.ak(var1 + var0.ag_fld, 1757780495) : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ak() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.av());

			for (int var3 = this.ag_fld; var3 < this.az_fld; var3++) {
				zj var4 = this.ak_fld.ak(var3, -823834059);
				var2.append(var4.ak_fld);
			}

			return var2.toString();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lzj;)Z"
	)
	boolean aq(zj var1) {
		if (1642063483 * this.ak_fld.ac_fld == 2) {
			return true;
		} else {
			return 1642063483 * this.ak_fld.ac_fld == 0 ? false : this.ak_fld.ag() != var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean az() {
		return this.az_fld == this.ag_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String as() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.av());

			for (int var2 = this.ag_fld; var2 < this.az_fld; var2++) {
				zj var3 = this.ak_fld.ak(var2, 490171813);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lve;"
	)
	public ve at() {
		if (this.az()) {
			return new ve(0, 0);
		} else {
			zj var1 = this.ak_fld.ak(this.az_fld - 1, 1632496144);
			return new ve(var1.az_fld + hv(this, (byte)-18), var1.ag_fld);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lve;"
	)
	public ve aw() {
		if (this.az()) {
			return new ve(0, 0);
		} else {
			zj var2 = this.ak_fld.ak(this.az_fld - 1, -1591846234);
			return new ve(var2.az_fld + hv(this, (byte)7), var2.ag_fld);
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lzr;Lzj;)Z"
	)
	public static boolean iq(zr var0, zj var1) {
		if (-292330111 * var0.ak_fld.ac_fld == 2) {
			return true;
		} else {
			return -485061351 * var0.ak_fld.ac_fld == 0 ? false : var0.ak_fld.ag() != var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lzj;"
	)
	public zj ay(int var1) {
		return var1 >= 0 && var1 < this.av() ? this.ak_fld.ak(var1 + this.ag_fld, 1606527883) : null;
	}

	zr(zg var1, int var2, int var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ar() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.av());

			for (int var2 = this.ag_fld; var2 < this.az_fld; var2++) {
				zj var3 = this.ak_fld.ak(var2, -156003921);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String af() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.av());

			for (int var2 = this.ag_fld; var2 < this.az_fld; var2++) {
				zj var3 = this.ak_fld.ak(var2, -2040865724);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("zz")
	@ObfuscatedSignature(
		descriptor = "(Lzr;)Z"
	)
	public static boolean zz(zr var0) {
		return var0.az_fld == var0.ag_fld;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lzr;I)Lzj;"
	)
	public static zj nz(zr var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 0 && var1 < var0.av() ? var0.ak_fld.ak(var1 + var0.ag_fld, -748763657) : null;
	}

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "(Lzr;II)Z"
	)
	public static boolean wg(zr var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld.bs() == 2 || var0.ak_fld.bs() == 1 && (!var0.ak_fld.ao_fld || var1 != var0.az_fld - 1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean au(int var1) {
		return this.ak_fld.bs() == 2 || this.ak_fld.bs() == 1 && (!this.ak_fld.ao_fld || var1 != this.az_fld - 1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
		return this.az_fld - this.ag_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		return this.az_fld == this.ag_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return this.az_fld - this.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int av() {
		return this.az_fld - this.ag_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		if (this.az()) {
			return 0;
		} else {
			zj var1 = this.ak_fld.ak(this.az_fld - 1, 1844511910);
			if ('\n' == var1.ak_fld) {
				return 0;
			} else if (this.ae(var1)) {
				return this.ak_fld.ab_fld.be_fld[-1376771355];
			} else {
				int var2 = this.ak_fld.ab_fld.be_fld[var1.ak_fld];
				if (var2 == 0) {
					return var1.ak_fld == 9 ? this.ak_fld.ab_fld.be_fld[2131008016] * 3 : this.ak_fld.ab_fld.be_fld[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lzj;)Z"
	)
	boolean am(zj var1) {
		if (-1789870471 * this.ak_fld.ac_fld == 2) {
			return true;
		} else {
			return -542036636 * this.ak_fld.ac_fld == 0 ? false : this.ak_fld.ag() != var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		if (this.az()) {
			return 0;
		} else {
			zj var1 = this.ak_fld.ak(this.az_fld - 1, 1480961818);
			if ('\n' == var1.ak_fld) {
				return 0;
			} else if (this.ae(var1)) {
				return this.ak_fld.ab_fld.be_fld[42];
			} else {
				int var2 = this.ak_fld.ab_fld.be_fld[var1.ak_fld];
				if (var2 == 0) {
					return var1.ak_fld == 9 ? this.ak_fld.ab_fld.be_fld[32] * 3 : this.ak_fld.ab_fld.be_fld[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lve;"
	)
	public ve ap() {
		if (this.az()) {
			return new ve(0, 0);
		} else {
			zj var1 = this.ak_fld.ak(this.az_fld - 1, 811204297);
			return new ve(var1.az_fld + hv(this, (byte)-10), var1.ag_fld);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lzj;B)Z"
	)
	boolean ae(zj var1) {
		if (1642063483 * this.ak_fld.ac_fld == 2) {
			return true;
		} else {
			return 1642063483 * this.ak_fld.ac_fld == 0 ? false : this.ak_fld.ag() != var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lve;"
	)
	public ve ac() {
		if (this.az()) {
			return new ve(0, 0);
		} else {
			zj var1 = this.ak_fld.ak(this.az_fld - 1, -749961142);
			return new ve(var1.az_fld + hv(this, (byte)63), var1.ag_fld);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bm(int var1) {
		return var1 >= 0 && var1 < this.av() ? this.ak_fld.ak(var1 + this.ag_fld, -2083629249) : null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bz(int var1) {
		return var1 >= 0 && var1 < this.av() ? this.ak_fld.ak(var1 + this.ag_fld, -1008118794) : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ag(int var1, int var2) {
		return this.ak_fld.br() == 2 || this.ak_fld.br() == 1 && (!this.ak_fld.ao_fld || var1 != this.az_fld - 1);
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lzr;B)I"
	)
	public static int hv(zr var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.az()) {
			return 0;
		} else {
			zj var2 = var0.ak_fld.ak(var0.az_fld - 1, 1167114146);
			if ('\n' == var2.ak_fld) {
				return 0;
			} else if (var0.ae(var2)) {
				return var0.ak_fld.ab_fld.be_fld[42];
			} else {
				int var3 = var0.ak_fld.ab_fld.be_fld[var2.ak_fld];
				if (var3 == 0) {
					return var2.ak_fld == 9 ? var0.ak_fld.ab_fld.be_fld[32] * 3 : var0.ak_fld.ab_fld.be_fld[32];
				} else {
					return var3;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ah(byte var1) {
		return this.ag_fld - this.ag_fld;
	}
}
