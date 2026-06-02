import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hj")
public interface hj {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z"
	)
	boolean ag(int var1, int var2, int var3, int var4);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean an(int var1, int var2);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	boolean az(int var1, int var2, byte var3);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I"
	)
	int[] av(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ap(xi var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ah(xi var1, int var2);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	void ay(hf var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	void as(hf var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	kj ad(int var1, int var2);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	boolean af(int var1, int var2, int var3);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean al(int var1, int var2);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean au(int var1, int var2);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean aa(int var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhf;B)V"
	)
	void ak(hf var1, byte var2);

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lku;)I"
	)
	static int jd(ku var0) {
		return var0.aq_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ax(int var1, int var2);

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lgn;)V"
	)
	static void ks(gn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var1 = 0; var1 < var0.bx_fld; var1++) {
			for (int var2 = 0; var2 < var0.bo_fld; var2++) {
				if (var1 >= 1 && var2 >= 1 && var1 < var0.bx_fld - 5 && var2 < var0.bo_fld - 5) {
					var0.bp_fld[var1][var2] = 1073741824;
				} else {
					var0.bp_fld[var1][var2] = -1775358218;
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	int[] ai(int var1, int var2, int var3);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	int[] aq(int var1, int var2, int var3);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	int[] am(int var1, int var2, int var3);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkj;"
	)
	kj ae(int var1, int var2, byte var3);

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Llu;"
	)
	static lu oh(uk var0) {
		return var0.ag_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;"
	)
	kj ao(int var1, int var2);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ab(xi var1);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhf;)V"
	)
	void ar(hf var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void at(xi var1);
}
