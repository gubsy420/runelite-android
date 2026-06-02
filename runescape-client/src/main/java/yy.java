import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yy")
public class yy {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedGetter(
		intValue = 809952885
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld = (int)(Math.pow(2.0, 4.0) - 1.0);
	@ObfuscatedGetter(
		intValue = 1589713857
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld = (int)(Math.pow(2.0, 8.0) - 1.0);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ay(int var0) {
		return var0 >>> 4 & av_fld;
	}

	yy() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ah(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aw(int var0) {
		return var0 >>> 4 & av_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ae(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int au(int var0) {
		return (var0 & az_fld) - 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ar(int var0) {
		return (var0 & az_fld) - 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int af(int var0) {
		return (var0 & az_fld) - 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int al(int var0) {
		return (var0 & az_fld) - 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[I)[Ljava/lang/Object;"
	)
	static Object[] aa(xi var0, int[] var1) {
		int var2 = var0.dz();
		Object[] var3 = (Object[])(new Object[var1.length * var2]);

		for (int var4 = 0; var4 < var2; var4++) {
			for (int var5 = 0; var5 < var1.length; var5++) {
				int var6 = var5 + var1.length * var4;
				yq var7 = eu.ag(var1[var5], -2121045167);
				var3[var6] = var7.as(var0);
			}
		}

		return (Object[])var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[I)[Ljava/lang/Object;"
	)
	static Object[] ax(xi var0, int[] var1) {
		int var2 = var0.dz();
		Object[] var3 = (Object[])(new Object[var1.length * var2]);

		for (int var4 = 0; var4 < var2; var4++) {
			for (int var5 = 0; var5 < var1.length; var5++) {
				int var6 = var5 + var1.length * var4;
				yq var7 = eu.ag(var1[var5], -1902999616);
				var3[var6] = var7.as(var0);
			}
		}

		return (Object[])var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;[I)[Ljava/lang/Object;"
	)
	static Object[] an(xi var0, int[] var1) {
		int var2 = var0.dz();
		Object[] var3 = (Object[])(new Object[var1.length * var2]);

		for (int var4 = 0; var4 < var2; var4++) {
			for (int var5 = 0; var5 < var1.length; var5++) {
				int var6 = var5 + var1.length * var4;
				yq var7 = eu.ag(var1[var5], -1877067631);
				var3[var6] = var7.as(var0);
			}
		}

		return (Object[])var3;
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Lsi;)Luy;"
	)
	public static uy pz(si var0) {
		return var0.ay_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int as(int var0) {
		return (var0 & az_fld) - 1;
	}
}
