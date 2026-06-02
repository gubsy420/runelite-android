import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ci")
public class ci implements Comparator {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(Lci;Lnl;Lnl;)I"
	)
	public static int pm(ci var0, nl var1, nl var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.ak_fld == var2.ak_fld) {
			return 0;
		} else {
			if (var0.ak_fld) {
				if (client.ch_fld == var1.ak_fld) {
					return -1;
				}

				if (client.ch_fld == var2.ak_fld) {
					return 1;
				}
			}

			return var1.ak_fld < var2.ak_fld ? -1 : 1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	static String ae() {
		String var1;
		if (cn.za(cx.kq_fld, 743852948)) {
			String var3 = bn.ba_fld;
			String var2 = fe.aa('*', var3.length());
			var1 = var2;
		} else {
			var1 = bn.ba_fld;
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I"
	)
	int ak(nl var1, nl var2, int var3) {
		if (var1.ak_fld == var2.ak_fld) {
			return 0;
		} else {
			if (this.ak_fld) {
				if (client.ch_fld == var1.ak_fld) {
					return -1;
				}

				if (client.ch_fld == var2.ak_fld) {
					return 1;
				}
			}

			return var1.ak_fld < var2.ak_fld ? -1 : 1;
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 1576288900);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int az(nl var1, nl var2) {
		if (var1.ak_fld == var2.ak_fld) {
			return 0;
		} else {
			if (this.ak_fld) {
				if (client.ch_fld == var1.ak_fld) {
					return -1;
				}

				if (client.ch_fld == var2.ak_fld) {
					return 1;
				}
			}

			return var1.ak_fld < var2.ak_fld ? -1 : 1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int ag(nl var1, nl var2) {
		if (var1.ak_fld == var2.ak_fld) {
			return 0;
		} else {
			if (this.ak_fld) {
				if (client.ch_fld == var1.ak_fld) {
					return -1;
				}

				if (client.ch_fld == var2.ak_fld) {
					return 1;
				}
			}

			return var1.ak_fld < var2.ak_fld ? -1 : 1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 1576288900);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 1576288900);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 1576288900);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	ci() {
	}
}
