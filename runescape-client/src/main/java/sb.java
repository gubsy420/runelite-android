import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sb")
public class sb implements xm {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	public static sb ag_fld = new sb(1, 1, 507, 507, 507, 507);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static sb az_fld = new sb(2, 2, 338, 338, 338, 507);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static sb av_fld = new sb(3, 3, 499, 499, 499, 507);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1338455693
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2144619279
	)
	int ah_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 979286157
	)
	int as_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1227846745
	)
	int ay_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 111087335
	)
	int ar_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 487536257
	)
	int aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static sb ak_fld = new sb(0, 0, 0, 0, 0, 0);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z"
	)
	boolean aw(int var1, boolean var2, boolean var3, boolean var4) {
		byte var6 = 0;
		int var7 = var6 | (var3 ? 2 : 0);
		var7 |= var2 ? 16 : 64;
		var7 |= var4 ? 256 : 0;
		return 0 != (var1 & var7);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFFI)F"
	)
	public static float au(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var12 = (var4 - var3) * (var5 - var7) + (var2 - var4) * (var6 - var7);
		float var13 = ((var1 - var7) * (var4 - var3) + (var0 - var4) * (var6 - var7)) / var12;
		float var14 = ((var7 - var5) * (var0 - var4) + (var2 - var4) * (var1 - var7)) / var12;
		float var15 = 1.0F - var13 - var14;
		return var9 * var14 + var13 * var8 + var15 * var10;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z"
	)
	public boolean ar(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ar_fld, var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z"
	)
	public boolean as(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z"
	)
	public boolean al(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.as_fld, var1, var2, var3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z"
	)
	public boolean ax(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.ar_fld, var1, var2, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z"
	)
	public boolean ay(boolean var1, boolean var2, boolean var3) {
		return this.az(this.as_fld, var1, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()[Lsb;"
	)
	public static sb[] an() {
		return new sb[]{ak_fld, ag_fld, az_fld, av_fld};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IZZZ)Z"
	)
	boolean aa(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IZZZ)Z"
	)
	boolean ai(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZI)Z"
	)
	public static boolean jf(sb var0, boolean var1, boolean var2, boolean var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aw(var0.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZZZ)Z"
	)
	boolean am(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return 0 != (var1 & var6);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IZZZ)Z"
	)
	boolean ad(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 1982898256;
		var6 |= var4 ? 706263677 : 0;
		return 0 != (var1 & var6);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bs(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.ay_fld * 1838720024, var1, var2, var3);
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lsb;IZZZ)Z"
	)
	public static boolean us(sb var0, int var1, boolean var2, boolean var3, boolean var4) {
		if (var0 == null) {
			var0.getClass();
		}

		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return 0 != (var1 & var6);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZZZ)Z"
	)
	boolean ab(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return 0 != (var1 & var6);
	}

	@ObfuscatedName("zl")
	@ObfuscatedSignature(
		descriptor = "(Lsb;IZZZ)Z"
	)
	public static boolean zl(sb var0, int var1, boolean var2, boolean var3, boolean var4) {
		if (var0 == null) {
			var0.getClass();
		}

		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 1394462102 : 0;
		return 0 != (var1 & var6);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z"
	)
	public boolean af(boolean var1, boolean var2, boolean var3) {
		return this.az(this.aw_fld, var1, var2, var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean at(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean ac(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ay_fld, var1, var2, var3);
	}

	sb(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.ah_fld = var1;
		this.ae_fld = var2;
		this.as_fld = var3;
		this.ay_fld = var4;
		this.ar_fld = var5;
		this.aw_fld = var6;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bz(boolean var1, boolean var2, boolean var3) {
		return this.az(this.aw_fld * 346168083, var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean aj(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ar_fld, var1, var2, var3);
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZ)Z"
	)
	public static boolean mn(sb var0, boolean var1, boolean var2, boolean var3) {
		return var0.aw(var0.ar_fld, var1, var2, var3);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean be(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.as_fld * -786133429, var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean ap(boolean var1, boolean var2, boolean var3) {
		return this.az(415170308 * this.as_fld, var1, var2, var3);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bh(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bk(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.ar_fld, var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Z"
	)
	boolean az(int var1, boolean var2, boolean var3, boolean var4) {
		byte var6 = 0;
		int var7 = var6 | (var3 ? 1 : 0);
		var7 |= var2 ? 8 : 32;
		var7 |= var4 ? 128 : 0;
		return (var1 & var7) != 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bf(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.ar_fld, var1, var2, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZZZ)Z"
	)
	boolean aq(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 1394462102 : 0;
		return 0 != (var1 & var6);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z"
	)
	public boolean au(boolean var1, boolean var2, boolean var3, int var4) {
		return this.aw(this.aw_fld * -1227846745, var1, var2, var3);
	}
}
