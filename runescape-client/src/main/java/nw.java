import java.util.Comparator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nw")
class nw implements Comparator {
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bl_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int ag(nl var1, nl var2) {
		return nl.dq(var1, -1153614698).compareTo(nl.dq(var2, -1977237832));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I"
	)
	int ak(nl var1, nl var2, int var3) {
		return nl.dq(var1, -1831942091).compareTo(nl.dq(var2, -1882616510));
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, -1371272090);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	nw() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, -1371272090);
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Lnw;Ljava/lang/Object;)Z"
	)
	public static boolean gt(nw var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int az(nl var1, nl var2) {
		return nl.dq(var1, -1187213681).compareTo(nl.dq(var2, -2026244468));
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Lnw;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int vr(nw var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak((nl)var1, (nl)var2, -1371272090);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int ay(nl var1, nl var2) {
		return nl.dq(var1, -1432631896).compareTo(nl.dq(var2, -1628469181));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int av(nl var1, nl var2) {
		return nl.dq(var1, -1365224266).compareTo(nl.dq(var2, -1807905021));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, -1371272090);
	}
}
