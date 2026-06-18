import java.util.Comparator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nd")
class nd implements Comparator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, -1401429349);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, -1401429349);
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

	nd() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, -1401429349);
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnl;Lnl;)I"
	)
	public static int iu(nd var0, nl var1, nl var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1.az_fld.az_fld * -220330603 < var2.az_fld.az_fld * -220330603 ? -1 : (var2.az_fld.az_fld * -220330603 == var1.az_fld.az_fld * -220330603 ? 0 : 1);
		}
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
		return var1.az_fld.az_fld * -220330603 < var2.az_fld.az_fld * -220330603 ? -1 : (var2.az_fld.az_fld * -220330603 == var1.az_fld.az_fld * -220330603 ? 0 : 1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I"
	)
	int ak(nl var1, nl var2, int var3) {
		return var1.az_fld.az_fld * -220330603 < var2.az_fld.az_fld * -220330603 ? -1 : (var2.az_fld.az_fld * -220330603 == var1.az_fld.az_fld * -220330603 ? 0 : 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int ag(nl var1, nl var2) {
		return var1.az_fld.az_fld * -220330603 < var2.az_fld.az_fld * -220330603 ? -1 : (var2.az_fld.az_fld * -220330603 == var1.az_fld.az_fld * -220330603 ? 0 : 1);
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/Object;)Z"
	)
	public static boolean ej(nd var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((nl)var1, (nl)var2, -1401429349);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;)I"
	)
	int av(nl var1, nl var2) {
		return var1.az_fld.az_fld * -220330603 < var2.az_fld.az_fld * -220330603 ? -1 : (var2.az_fld.az_fld * -220330603 == var1.az_fld.az_fld * -220330603 ? 0 : 1);
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lzg;Ljava/lang/String;I)Lzw;"
	)
	public static zw lw(zg var0, String var1, int var2) {
		return zg.hi(var0, var1, var0.ap_fld.size(), var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([J[Ljava/lang/Object;III)V"
	)
	public static void au(long[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			long var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			Object var9 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var9;
			int var10 = Long.MAX_VALUE == var7 ? 0 : 1;

			for (int var11 = var2; var11 < var3; var11++) {
				if (var0[var11] < var7 + (var11 & var10)) {
					long var12 = var0[var11];
					var0[var11] = var0[var6];
					var0[var6] = var12;
					Object var14 = var1[var11];
					var1[var11] = var1[var6];
					var1[var6++] = var14;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var9;
			au(var0, (Object[])var1, var2, var6 - 1);
			au(var0, (Object[])var1, var6 + 1, var3);
		}
	}
}
