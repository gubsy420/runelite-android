import java.util.Iterator;
import net.runelite.api.annotations.Export;
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

	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "(Laax;I)Ljava/lang/String;"
	)
	public static String xq(aax var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aa() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		return this.ak_fld == null ? 0 : this.ak_fld.hashCode();
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return this.ak(611146485);
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Lbt;)Z"
	)
	public static boolean fj(bt var0) {
		return !qa.jv(var0.ay_fld, -100148566);
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

	@ObfuscatedName("compareTo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	@Export("compareTo")
	@Override
	public int compareTo(Object var1) {
		return this.av((aax)var1, -52146469);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ay() {
		return this.ag_fld;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
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

	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String vg() {
		return this.ak_fld;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		return this.ak_fld == null ? 0 : this.ak_fld.hashCode();
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public static boolean jx(aax var0) {
		return null != var0.ak_fld;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cl() {
		return this.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean az(int var1) {
		return null != this.ak_fld;
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.ak(-698622201);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)I"
	)
	public int ae(Object var1) {
		return this.av((aax)var1, 1735911889);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String as() {
		return this.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ak(int var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ar() {
		return this.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String al() {
		return this.ak_fld;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
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

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Laax;)I"
	)
	public static int kd(aax var0) {
		return var0.ak_fld == null ? 0 : var0.ak_fld.hashCode();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String af() {
		return this.ak_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lxf;)Ljava/util/Iterator;"
	)
	public static Iterator bk(xf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		xr.ls(var0.ak_fld);
		return var0.ak_fld;
	}

	public aax(String var1) {
		this.ag_fld = var1;
		this.ak_fld = dx.av(var1, zo.ak_fld);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aq() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		return this.ak_fld == null ? 0 : this.ak_fld.hashCode();
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ag(int var1) {
		return this.ag_fld;
	}
}
