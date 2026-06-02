import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zr")
public class zr {
	@ObfuscatedGetter(
		intValue = 1910308051
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lzg;"
	)
	zg ak_fld;
	@ObfuscatedGetter(
		intValue = -1211903427
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld = 0;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean al(int var1) {
		return this.ak_fld.bs() == 2 || this.ak_fld.bs() == 1 && (!this.ak_fld.ao_fld || var1 != this.ag_fld - 1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ak() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(jd(this, (byte)85));

			for (int var3 = this.az_fld; var3 < this.ag_fld; var3++) {
				zj var4 = this.ak_fld.ak(var3);
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
			return 1642063483 * this.ak_fld.ac_fld == 0 ? false : zg.of(this.ak_fld, 1461954646) != var1;
		}
	}

	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "(Lzr;)Ljava/lang/String;"
	)
	public static String xs(zr var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.az()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(jd(var0, (byte)4));

			for (int var2 = var0.az_fld; var2 < var0.ag_fld; var2++) {
				zj var3 = var0.ak_fld.ak(var2);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean az() {
		return this.ag_fld == this.az_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String as() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(jd(this, (byte)-79));

			for (int var2 = this.az_fld; var2 < this.ag_fld; var2++) {
				zj var3 = this.ak_fld.ak(var2);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ag(int var1) {
		return this.ak_fld.bs() == 2 || this.ak_fld.bs() == 1 && (!this.ak_fld.ao_fld || var1 != this.ag_fld - 1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lve;"
	)
	public ve at() {
		if (this.az()) {
			return new ve(0, 0);
		} else {
			zj var1 = this.ak_fld.ak(this.ag_fld - 1);
			return new ve(var1.ag_fld + this.ah(), var1.az_fld);
		}
	}

	zr(zg var1, int var2, int var3) {
		this.ak_fld = var1;
		this.az_fld = var2;
		this.ag_fld = var3;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lzr;B)I"
	)
	public static int jd(zr var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld - var0.az_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ar() {
		if (this.az()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(jd(this, (byte)-37));

			for (int var2 = this.az_fld; var2 < this.ag_fld; var2++) {
				zj var3 = this.ak_fld.ak(var2);
				var1.append(var3.ak_fld);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean au(int var1) {
		return this.ak_fld.bs() == 2 || this.ak_fld.bs() == 1 && (!this.ak_fld.ao_fld || var1 != this.ag_fld - 1);
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Lzr;)I"
	)
	public static int ez(zr var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.az()) {
			return 0;
		} else {
			zj var1 = var0.ak_fld.ak(var0.ag_fld - 1);
			if ('\n' == var1.ak_fld) {
				return 0;
			} else if (var0.ae(var1)) {
				return var0.ak_fld.ab_fld.br_fld[42];
			} else {
				int var2 = var0.ak_fld.ab_fld.br_fld[var1.ak_fld];
				if (var2 == 0) {
					return var1.ak_fld == 9 ? var0.ak_fld.ab_fld.br_fld[32] * 3 : var0.ak_fld.ab_fld.br_fld[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return this.ag_fld - this.az_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		return this.ag_fld == this.az_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean an() {
		return this.ag_fld == this.az_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lzr;I)Lzj;"
	)
	public static zj bf(zr var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= 0 && var1 < jd(var0, (byte)-20) ? var0.ak_fld.ak(var1 + var0.az_fld) : null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
		return this.ag_fld - this.az_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lzj;)Z"
	)
	boolean am(zj var1) {
		if (-1789870471 * this.ak_fld.ac_fld == 2) {
			return true;
		} else {
			return -542036636 * this.ak_fld.ac_fld == 0 ? false : zg.of(this.ak_fld, 1988999018) != var1;
		}
	}

	@ObfuscatedName("zt")
	@ObfuscatedSignature(
		descriptor = "(Lzr;Lzj;)Z"
	)
	public static boolean zt(zr var0, zj var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (-292330111 * var0.ak_fld.ac_fld == 2) {
			return true;
		} else {
			return -485061351 * var0.ak_fld.ac_fld == 0 ? false : zg.of(var0.ak_fld, 2060589756) != var1;
		}
	}

	@ObfuscatedName("yv")
	@ObfuscatedSignature(
		descriptor = "(Lzr;IB)Lzj;"
	)
	public static zj yv(zr var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 0 && var1 < jd(var0, (byte)-90) ? var0.ak_fld.ak(var1 + var0.az_fld) : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ah() {
		if (this.az()) {
			return 0;
		} else {
			zj var2 = this.ak_fld.ak(this.ag_fld - 1);
			if ('\n' == var2.ak_fld) {
				return 0;
			} else if (this.ae(var2)) {
				return this.ak_fld.ab_fld.br_fld[42];
			} else {
				int var3 = this.ak_fld.ab_fld.br_fld[var2.ak_fld];
				if (var3 == 0) {
					return var2.ak_fld == 9 ? this.ak_fld.ab_fld.br_fld[32] * 3 : this.ak_fld.ab_fld.br_fld[32];
				} else {
					return var3;
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
			zj var1 = this.ak_fld.ak(this.ag_fld - 1);
			return new ve(var1.ag_fld + this.ah(), var1.az_fld);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lzj;)Z"
	)
	boolean ae(zj var1) {
		if (1642063483 * this.ak_fld.ac_fld == 2) {
			return true;
		} else {
			return 1642063483 * this.ak_fld.ac_fld == 0 ? false : zg.of(this.ak_fld, 1597820325) != var1;
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
			zj var1 = this.ak_fld.ak(this.ag_fld - 1);
			return new ve(var1.ag_fld + this.ah(), var1.az_fld);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bm(int var1) {
		return var1 >= 0 && var1 < jd(this, (byte)105) ? this.ak_fld.ak(var1 + this.az_fld) : null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bd(int var1) {
		return var1 >= 0 && var1 < jd(this, (byte)-54) ? this.ak_fld.ak(var1 + this.az_fld) : null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj bz(int var1) {
		return var1 >= 0 && var1 < jd(this, (byte)-47) ? this.ak_fld.ak(var1 + this.az_fld) : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lve;"
	)
	public ve aw(int var1) {
		if (this.az()) {
			return new ve(0, 0);
		} else {
			zj var2 = this.ak_fld.ak(this.ag_fld - 1);
			return new ve(var2.ag_fld + this.ah(), 1209571599 * var2.ag_fld);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lzj;"
	)
	public zj ay(int var1, byte var2) {
		return var1 >= 0 && var1 < jd(this, (byte)-90) ? this.ak_fld.ak(var1 + this.az_fld) : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int av(byte var1) {
		return this.az_fld - this.ag_fld;
	}

	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "(Lgv;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int uh(gv var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return gv.xe(var0, (gh)var1, (gh)var2, (byte)0);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lzj;)Z"
	)
	boolean ad(zj var1) {
		if (1642063483 * this.ak_fld.ac_fld == 2) {
			return true;
		} else {
			return 1642063483 * this.ak_fld.at_fld == 0 ? false : zg.of(this.ak_fld, 1461954646) != var1;
		}
	}

	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "(Lzr;I)Lve;"
	)
	public static ve sz(zr var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.az()) {
			return new ve(0, 0);
		} else {
			zj var2 = var0.ak_fld.ak(var0.ag_fld - 1);
			return new ve(var2.ag_fld + var0.ah(), var2.az_fld);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lzj;"
	)
	public zj aj(int var1) {
		return var1 >= 0 && var1 < jd(this, (byte)-47) ? this.ak_fld.ak(var1 + this.ag_fld) : null;
	}
}
