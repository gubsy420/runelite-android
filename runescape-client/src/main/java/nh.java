import java.util.Comparator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nh")
class nh implements Comparator {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;B)I"
	)
	int ak(nl var1, nl var2, byte var3) {
		return 626220965 * var1.az_fld.av_fld < var2.az_fld.av_fld * 626220965 ? -1 : (var2.az_fld.av_fld * 626220965 == 626220965 * var1.az_fld.av_fld ? 0 : 1);
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

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lfm;)I"
	)
	public static int if_(fm var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld - var0.ae_fld;
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, (byte)-78);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, (byte)10);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, (byte)-5);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, (byte)-13);
	}

	nh() {
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
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
		return 626220965 * var1.az_fld.av_fld < var2.az_fld.av_fld * 626220965 ? -1 : (var2.az_fld.av_fld * 626220965 == 626220965 * var1.az_fld.av_fld ? 0 : 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int ag(nl var1, nl var2) {
		return -1491301969 * var1.az_fld.av_fld < var2.az_fld.av_fld * 1752074092 ? -1 : (var2.az_fld.av_fld * -518216157 == 1751443406 * var1.az_fld.av_fld ? 0 : 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z"
	)
	static boolean ag(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var7 = var4 - var2;
		int var8 = var5 - var3;
		int var9 = var0 - var2;
		int var10 = var1 - var3;
		int var11 = var9 * var7 + var8 * var10;
		int var13 = var8 * var8 + var7 * var7;
		return 0 <= var11 && var11 <= var13;
	}
}
