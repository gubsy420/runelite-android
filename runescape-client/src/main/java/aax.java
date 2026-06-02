import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aax")
public class aax implements Comparable {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;

	public aax(String var1, zo var2) {
		this.ag_fld = var1;
		this.ak_fld = dx.av(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ag(int var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Ljava/lang/String;"
	)
	public static String ha(aax var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Laax;)I"
	)
	public int ad(aax var1) {
		if (null == this.ak_fld) {
			return null == var1.ak_fld ? 0 : 1;
		} else {
			return var1.ak_fld == null ? -1 : this.ak_fld.compareTo(var1.ak_fld);
		}
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		return this.ak_fld == null ? 0 : this.ak_fld.hashCode();
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return this.ak(611146485);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)I"
	)
	public int av(aax var1, int var2) {
		if (null == this.ak_fld) {
			return null == var1.ak_fld ? 0 : 1;
		} else {
			return var1.ak_fld == null ? -1 : this.ak_fld.compareTo(var1.ak_fld);
		}
	}

	@ObfuscatedName("yw")
	@ObfuscatedSignature(
		descriptor = "(Lda;IZ)V"
	)
	public static void yw(da var0, int var1, boolean var2) {
		var0.cg_fld.av(var1, var2);
	}

	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	@Override
	public int compareTo(Object var1) {
		return this.av((aax)var1, -52146469);
	}

	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "(Lda;)Z"
	)
	public static boolean sl(da var0) {
		return var0.cg_fld.az_fld;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Laax;Ljava/lang/Object;)I"
	)
	public static int ij(aax var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av((aax)var1, 1735911889);
	}

	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String vq() {
		return this.ag_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ar() {
		return this.ak(-360414466);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (var1 instanceof aax) {
			aax var2 = (aax)var1;
			if (null == this.ak_fld) {
				return null == var2.ak_fld;
			} else if (var2.ak_fld == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.ak_fld.equals(var2.ak_fld);
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		if (var1 instanceof aax) {
			aax var2 = (aax)var1;
			if (null == this.ak_fld) {
				return null == var2.ak_fld;
			} else if (var2.ak_fld == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.ak_fld.equals(var2.ak_fld);
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Laax;)I"
	)
	public int am(aax var1) {
		if (null == this.ak_fld) {
			return null == var1.ak_fld ? 0 : 1;
		} else {
			return var1.ak_fld == null ? -1 : this.ak_fld.compareTo(var1.ak_fld);
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.ak_fld;
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public static boolean qc(aax var0) {
		return null != var0.ak_fld;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.ak_fld == null ? 0 : this.ak_fld.hashCode();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean az(int var1) {
		return null != this.ak_fld;
	}

	@ObfuscatedName("yf")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String yf() {
		return this.ag_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean au() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "(Laax;)I"
	)
	public static int ux(aax var0) {
		return var0.ak_fld == null ? 0 : var0.ak_fld.hashCode();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ak(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ay() {
		return this.ak_fld;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (var1 instanceof aax) {
			aax var2 = (aax)var1;
			if (null == this.ak_fld) {
				return null == var2.ak_fld;
			} else if (var2.ak_fld == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.ak_fld.equals(var2.ak_fld);
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean an() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ai() {
		return null != this.ak_fld;
	}

	public aax(String var1) {
		this.ag_fld = var1;
		this.ak_fld = dx.av(var1, zo.ak_fld);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ah() {
		return this.ag_fld;
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return this.ak_fld == null ? 0 : this.ak_fld.hashCode();
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public static boolean gj(aax var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return null != var0.ak_fld;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (var1 instanceof aax) {
			aax var2 = (aax)var1;
			if (null == this.ak_fld) {
				return null == var2.ak_fld;
			} else if (var2.ak_fld == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.ak_fld.equals(var2.ak_fld);
			}
		} else {
			return false;
		}
	}
}
