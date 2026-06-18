import java.io.EOFException;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ve")
public class ve {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public Object ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public Object ak_fld;

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		int var1 = 0;
		if (this.ag_fld != null) {
			var1 += this.ag_fld.hashCode();
		}

		if (null != this.ak_fld) {
			var1 += 31 * this.ak_fld.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lve;)I"
	)
	public static int oi(ve var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = 0;
		if (var0.ag_fld != null) {
			var1 += var0.ag_fld.hashCode();
		}

		if (null != var0.ak_fld) {
			var1 += 31 * var0.ak_fld.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return this.ag_fld + ", " + this.ak_fld;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof ve) {
			ve var2 = (ve)var1;
			if (null == this.ag_fld) {
				if (null != var2.ag_fld) {
					return false;
				}
			} else if (!this.ag_fld.equals(var2.ag_fld)) {
				return false;
			}

			if (null == this.ak_fld) {
				if (var2.ak_fld != null) {
					return false;
				}
			} else if (!this.ak_fld.equals(var2.ak_fld)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.ag_fld + ", " + this.ak_fld;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Luk;)I"
	)
	public static int ex(uk var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.al_fld;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.ag_fld + ", " + this.ak_fld;
	}

	public ve(Object var1, Object var2) {
		this.ag_fld = var1;
		this.ak_fld = var2;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (var1 != null && var1 instanceof ve) {
			ve var2 = (ve)var1;
			if (null == this.ag_fld) {
				if (null != var2.ag_fld) {
					return false;
				}
			} else if (!this.ag_fld.equals(var2.ag_fld)) {
				return false;
			}

			if (null == this.ak_fld) {
				if (var2.ak_fld != null) {
					return false;
				}
			} else if (!this.ak_fld.equals(var2.ak_fld)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (var1 != null && var1 instanceof ve) {
			ve var2 = (ve)var1;
			if (null == this.ag_fld) {
				if (null != var2.ag_fld) {
					return false;
				}
			} else if (!this.ag_fld.equals(var2.ag_fld)) {
				return false;
			}

			if (null == this.ak_fld) {
				if (var2.ak_fld != null) {
					return false;
				}
			} else if (!this.ak_fld.equals(var2.ak_fld)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		if (var1 != null && var1 instanceof ve) {
			ve var2 = (ve)var1;
			if (null == this.ag_fld) {
				if (null != var2.ag_fld) {
					return false;
				}
			} else if (!this.ag_fld.equals(var2.ag_fld)) {
				return false;
			}

			if (null == this.ak_fld) {
				if (var2.ak_fld != null) {
					return false;
				}
			} else if (!this.ak_fld.equals(var2.ak_fld)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		int var1 = 0;
		if (this.ag_fld != null) {
			var1 += this.ag_fld.hashCode();
		}

		if (null != this.ak_fld) {
			var1 += 31 * this.ak_fld.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Lve;)I"
	)
	public static int qh(ve var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = 0;
		if (var0.ag_fld != null) {
			var1 += var0.ag_fld.hashCode();
		}

		if (null != var0.ak_fld) {
			var1 += -3351629 * var0.ak_fld.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIB)V"
	)
	static final void ez(dx var0, int var1, int var2) throws EOFException {
		xh.en(var0, var0.ae_fld, var1, var2, -633438746);
	}
}
