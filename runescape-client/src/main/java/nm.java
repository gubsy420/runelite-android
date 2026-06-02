import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nm")
class nm implements Comparator {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bi_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int ag(nl var1, nl var2) {
		return var1.ak_fld < var2.ak_fld ? -1 : (var1.ak_fld == var2.ak_fld ? 0 : 1);
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 1498741610);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 1030112489);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, -619223515);
	}

	nm() {
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I"
	)
	int ak(nl var1, nl var2, int var3) {
		return var1.ak_fld < var2.ak_fld ? -1 : (var1.ak_fld == var2.ak_fld ? 0 : 1);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int az(nl var1, nl var2) {
		return var1.ak_fld < var2.ak_fld ? -1 : (var1.ak_fld == var2.ak_fld ? 0 : 1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, 673321348);
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Ljava/lang/Object;)Z"
	)
	public static boolean ne(nm var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}
}
