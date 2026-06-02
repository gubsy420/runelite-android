import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xt")
public class xt implements Comparator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;

	public xt(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return js(this, (rl)var1, (rl)var2, -1882578795);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Lxt;Lrl;Lrl;I)I"
	)
	public static int js(xt var0, rl var1, rl var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld ? var1.ad(var2, -2044606762) : var2.ad(var1, -1462759839);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return js(this, (rl)var1, (rl)var2, -1453352366);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return js(this, (rl)var1, (rl)var2, -30598218);
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lxt;Ljava/lang/Object;)Z"
	)
	public static boolean fu(xt var0, Object var1) {
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
		return js(this, (rl)var1, (rl)var2, -49878984);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Ljava/lang/String;"
	)
	public static String ak(CharSequence var0) {
		int var2 = var0.length();
		StringBuilder var3 = new StringBuilder(var2);

		for (int var4 = 0; var4 < var2; var4++) {
			char var5 = var0.charAt(var4);
			if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && '.' != var5 && var5 != '-' && var5 != '*' && var5 != '_') {
				if (var5 == ' ') {
					var3.append('+');
				} else {
					byte var6 = vj.ak(var5);
					var3.append('%');
					int var7 = var6 >> 4 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(48 + var7));
					}

					var7 = var6 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(48 + var7));
					}
				}
			} else {
				var3.append(var5);
			}
		}

		return var3.toString();
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	int ag(rl var1, rl var2) {
		return this.ak_fld ? var1.ad(var2, -2094241623) : var2.ad(var1, -1708935379);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	int av(rl var1, rl var2) {
		return this.ak_fld ? var1.ad(var2, -1683898188) : var2.ad(var1, -1675073891);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	int az(rl var1, rl var2) {
		return this.ak_fld ? var1.ad(var2, -607953307) : var2.ad(var1, -2061136989);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;I)I"
	)
	int ak(rl var1, rl var2, int var3) {
		return this.ak_fld ? var1.ad(var2, -2044606762) : var2.ad(var1, -1462759839);
	}
}
