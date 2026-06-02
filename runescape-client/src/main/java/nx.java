import java.io.EOFException;
import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nx")
class nx implements Comparator {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I"
	)
	int ak(nl var1, nl var2, int var3) {
		return var1.ag_fld < var2.ag_fld ? -1 : (var2.ag_fld == var1.ag_fld ? 0 : 1);
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(Lnx;Lnl;Lnl;)I"
	)
	public static int tq(nx var0, nl var1, nl var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1.ag_fld < var2.ag_fld ? -1 : (var2.ag_fld == var1.ag_fld ? 0 : 1);
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lnx;Lnl;Lnl;)I"
	)
	public static int mp(nx var0, nl var1, nl var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1.ag_fld < var2.ag_fld ? -1 : (var2.ag_fld == var1.ag_fld ? 0 : 1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 882740727);
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "(Lnx;Ljava/lang/Object;)Z"
	)
	public static boolean yn(nx var0, Object var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.equals(var1);
		}
	}

	nx() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 2045893693);
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void gf(int var0) throws EOFException {
		try {
			jm var1 = gi.ak(jb.bd_fld, client.aq_fld.av_fld);
			client.aq_fld.az(var1);
			bp.bd_fld = true;

			for (pk var2 = (pk)cf.cg_fld.ai_fld.aq(); var2 != null; var2 = (pk)xz.aa(cf.cg_fld.ai_fld)) {
				if (var0 <= 1885599583) {
					return;
				}

				if (0 != var2.ag_fld) {
					if (var0 <= 1885599583) {
						return;
					}

					if (var2.ag_fld != 3) {
						continue;
					}

					if (var0 <= 1885599583) {
						return;
					}
				}

				cd.cw_fld.az(var2, true, cf.cg_fld);
			}

			cf.cg_fld.bh();
			bp.bd_fld = false;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
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

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 1275318847);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int ag(nl var1, nl var2) {
		return var1.ag_fld < var2.ag_fld ? -1 : (var2.ag_fld == var1.ag_fld ? 0 : 1);
	}
}
