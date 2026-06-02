import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ul")
public class ul {
	@ObfuscatedGetter(
		intValue = -1130352875
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public tu ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public tu az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lul;"
	)
	static ul[] av_fld = new ul[ul.ae_fld];
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	public uz ak_fld = new uz();
	@ObfuscatedGetter(
		intValue = 398936965
	)
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cs_fld;
	@ObfuscatedGetter(
		intValue = 398936965
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld = -762358576;

	ul() {
		this.ag_fld = new tu();
		this.az_fld = new tu(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void az() {
		this.ak_fld.af();
		this.ag_fld.as();
		this.az_fld.ay_fld = 1.0F;
		this.az_fld.as_fld = 1.0F;
		this.az_fld.ar_fld = 1.0F;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ih() {
		ln(this, (byte)-120);
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return "[" + this.ak_fld.toString() + "|" + this.ag_fld.toString() + "|" + this.az_fld.toString() + "]";
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lul;)I"
	)
	public static int mn(ul var0) {
		if (var0 == null) {
			var0.getClass();
		}

		byte var1 = 31;
		byte var2 = 1;
		int var3 = -251458497 * var2 + var0.ak_fld.hashCode();
		var3 = 297594300 * var3 + var0.ag_fld.hashCode();
		return 1476114331 * var3 + var0.az_fld.hashCode();
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hashCode() {
		byte var1 = 31;
		byte var2 = 1;
		int var3 = 31 * var2 + this.ak_fld.hashCode();
		var3 = 31 * var3 + this.ag_fld.hashCode();
		return 31 * var3 + this.az_fld.hashCode();
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return "[" + this.ak_fld.toString() + "|" + this.ag_fld.toString() + "|" + this.az_fld.toString() + "]";
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (null == var1) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof ul)) {
			return false;
		} else {
			ul var2 = (ul)var1;
			return this.ak_fld.equals(var2.ak_fld) && this.ag_fld.ar(var2.ag_fld) && this.az_fld.ar(var2.az_fld);
		}
	}

	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "(Lul;Ljava/lang/Object;)Z"
	)
	public static boolean vj(ul var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var1) {
			return false;
		} else if (var0 == var1) {
			return true;
		} else if (!(var1 instanceof ul)) {
			return false;
		} else {
			ul var2 = (ul)var1;
			return var0.ak_fld.equals(var2.ak_fld) && var0.ag_fld.ar(var2.ag_fld) && var0.az_fld.ar(var2.az_fld);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void as() {
		this.ak_fld.af();
		this.ag_fld.as();
		this.az_fld.ay_fld = 1.0F;
		this.az_fld.as_fld = 1.0F;
		this.az_fld.ar_fld = 1.0F;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		int var1 = -1919214807;
		byte var2 = 1;
		int var3 = 31 * var2 + this.ak_fld.hashCode();
		var3 = 31 * var3 + this.ag_fld.hashCode();
		return 31 * var3 + this.az_fld.hashCode();
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (null == var1) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof ul)) {
			return false;
		} else {
			ul var2 = (ul)var1;
			return this.ak_fld.equals(var2.ak_fld) && this.ag_fld.ar(var2.ag_fld) && this.az_fld.ar(var2.az_fld);
		}
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		byte var1 = 31;
		byte var2 = 1;
		int var3 = 31 * var2 + this.ak_fld.hashCode();
		var3 = 31 * var3 + this.ag_fld.hashCode();
		return 31 * var3 + this.az_fld.hashCode();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lul;"
	)
	public static ul av() {
		synchronized (av_fld) {
			if (ah_fld == 0) {
				return new ul();
			} else {
				av_fld[(ah_fld -= -957110211) * -1130352875].az();
				return av_fld[ah_fld];
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lul;"
	)
	public static ul ae() {
		synchronized (av_fld) {
			if (ah_fld * 1481373103 == 0) {
				return new ul();
			} else {
				av_fld[(ah_fld -= 855313655) * 1830691190].az();
				return av_fld[-165419227 * ah_fld];
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ah() {
		synchronized (av_fld) {
			if (ah_fld < ae_fld) {
				av_fld[(ah_fld += -957110211) * -1130352875 - 1] = this;
			}
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V"
	)
	public static void ln(ul var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (av_fld) {
			if (ah_fld < ae_fld) {
				av_fld[(ah_fld += -957110211) * -1130352875 - 1] = var0;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aw() {
		synchronized (av_fld) {
			if (ah_fld < ae_fld) {
				av_fld[(ah_fld += -957110211) * -1130352875 - 1] = this;
			}
		}
	}

	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "()Lul;"
	)
	public static ul sw() {
		return uv.ak();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String aq(sl var0, String var1) {
		yq var3 = yq.az_fld;
		om.ap(var0, var3, false, (byte)0);
		int var4 = var0.av();
		String[] var5 = (String[])(String[])var0.az();
		if (0 == var4) {
			return "";
		} else if (1 == var4) {
			return var5[0];
		} else {
			int var6 = var1.length();
			int var7 = (var4 - 1) * var6;

			for (int var8 = 0; var8 < var4; var8++) {
				var7 += var5[var8].length();
			}

			char[] var11 = new char[var7];
			int var9 = 0;

			for (int var10 = 0; var10 < var4; var10++) {
				if (var10 > 0) {
					var1.getChars(0, var6, var11, var9);
					var9 += var6;
				}

				var5[var10].getChars(0, var5[var10].length(), var11, var9);
				var9 += var5[var10].length();
			}

			return new String(var11);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public static void bj(ul var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			synchronized (av_fld) {
				if (ah_fld < ae_fld) {
					av_fld[(ah_fld += -957110211) * -1130352875 - 1] = var0;
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ar() {
		this.ak_fld.af();
		this.ag_fld.as();
		this.az_fld.ay_fld = 1.0F;
		this.az_fld.as_fld = 1.0F;
		this.az_fld.ar_fld = 1.0F;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return "[" + this.ak_fld.toString() + "|" + this.ag_fld.toString() + "|" + this.az_fld.toString() + "]";
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lul;Ljava/lang/Object;)Z"
	)
	public static boolean co(ul var0, Object var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (null == var1) {
			return false;
		} else if (var0 == var1) {
			return true;
		} else if (!(var1 instanceof ul)) {
			return false;
		} else {
			ul var2 = (ul)var1;
			return var0.ak_fld.equals(var2.ak_fld) && var0.ag_fld.ar(var2.ag_fld) && var0.az_fld.ar(var2.az_fld);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ag(byte var1) {
		synchronized (av_fld) {
			if (ah_fld < cs_fld) {
				av_fld[(ah_fld += -957110211) * -1130352875 - 1] = this;
			}
		}
	}
}
