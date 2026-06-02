import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ve")
public class ve {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public Object ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	public Object ag_fld;

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		int var1 = 0;
		if (this.ak_fld != null) {
			var1 += this.ak_fld.hashCode();
		}

		if (null != this.ag_fld) {
			var1 += 31 * this.ag_fld.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return this.ak_fld + ", " + this.ag_fld;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof ve) {
			ve var2 = (ve)var1;
			if (null == this.ak_fld) {
				if (null != var2.ak_fld) {
					return false;
				}
			} else if (!this.ak_fld.equals(var2.ak_fld)) {
				return false;
			}

			if (null == this.ag_fld) {
				if (var2.ag_fld != null) {
					return false;
				}
			} else if (!this.ag_fld.equals(var2.ag_fld)) {
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
		return this.ak_fld + ", " + this.ag_fld;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.ak_fld + ", " + this.ag_fld;
	}

	public ve(Object var1, Object var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (var1 != null && var1 instanceof ve) {
			ve var2 = (ve)var1;
			if (null == this.ak_fld) {
				if (null != var2.ak_fld) {
					return false;
				}
			} else if (!this.ak_fld.equals(var2.ak_fld)) {
				return false;
			}

			if (null == this.ag_fld) {
				if (var2.ag_fld != null) {
					return false;
				}
			} else if (!this.ag_fld.equals(var2.ag_fld)) {
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
			if (null == this.ak_fld) {
				if (null != var2.ak_fld) {
					return false;
				}
			} else if (!this.ak_fld.equals(var2.ak_fld)) {
				return false;
			}

			if (null == this.ag_fld) {
				if (var2.ag_fld != null) {
					return false;
				}
			} else if (!this.ag_fld.equals(var2.ag_fld)) {
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
			if (null == this.ak_fld) {
				if (null != var2.ak_fld) {
					return false;
				}
			} else if (!this.ak_fld.equals(var2.ak_fld)) {
				return false;
			}

			if (null == this.ag_fld) {
				if (var2.ag_fld != null) {
					return false;
				}
			} else if (!this.ag_fld.equals(var2.ag_fld)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Llj;)V"
	)
	public static void ow(lj var0) {
		if (var0.ag_fld != -1L) {
			var0.ae_fld = lz.ak() - var0.ag_fld;
			var0.ag_fld = 5440310270008829263L;
		}
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		int var1 = 0;
		if (this.ak_fld != null) {
			var1 += this.ak_fld.hashCode();
		}

		if (null != this.ag_fld) {
			var1 += -3351629 * this.ag_fld.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		int var1 = 0;
		if (this.ak_fld != null) {
			var1 += this.ak_fld.hashCode();
		}

		if (null != this.ag_fld) {
			var1 += 31 * this.ag_fld.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		int var1 = 0;
		if (this.ak_fld != null) {
			var1 += this.ak_fld.hashCode();
		}

		if (null != this.ag_fld) {
			var1 += 31 * this.ag_fld.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Ldx;II)V"
	)
	static final void ez(dx var0, int var1, int var2) throws EOFException {
		xh.en(var0, var0.ae_fld, var1, var2, -633438746);
	}
}
