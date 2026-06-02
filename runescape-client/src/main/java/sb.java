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
	@ObfuscatedGetter(
		intValue = -1338455693
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = 979286157
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 979286157
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = -1227846745
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = 111087335
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = 487536257
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static sb ak_fld = new sb(0, 0, 0, 0, 0, 0);

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

	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZI)Z"
	)
	public static boolean xb(sb var0, boolean var1, boolean var2, boolean var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aw(var0.aw_fld, var1, var2, var3);
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lsb;IZZZ)Z"
	)
	public static boolean ip(sb var0, int var1, boolean var2, boolean var3, boolean var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var5 = 0;
			int var6 = var5 | (var3 ? 1 : 0);
			var6 |= var2 ? 8 : 32;
			var6 |= var4 ? 128 : 0;
			return (var1 & var6) != 0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ar_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZZZ)Z"
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
		descriptor = "(IIIIIIIIFFF)F"
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
		return this.ar_fld;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZ)Z"
	)
	public static boolean lj(sb var0, boolean var1, boolean var2, boolean var3) {
		return var0.aw(var0.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Lsb;IZZZ)Z"
	)
	public static boolean nl(sb var0, int var1, boolean var2, boolean var3, boolean var4) {
		if (var0 == null) {
			var0.getClass();
		}

		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return 0 != (var1 & var6);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean as(boolean var1, boolean var2, boolean var3) {
		return this.az(this.aw_fld, var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean af(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.ah_fld, var1, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean au(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqj;)Ljava/lang/String;"
	)
	public static String as(qj var0) {
		return var0.az_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ar_fld;
	}

	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "(Lsb;IZZZ)Z"
	)
	public static boolean rj(sb var0, int var1, boolean var2, boolean var3, boolean var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var5 = 0;
			int var6 = var5 | (var3 ? 2 : 0);
			var6 |= var2 ? 16 : 1982898256;
			var6 |= var4 ? 706263677 : 0;
			return 0 != (var1 & var6);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ar_fld;
	}

	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "(Lgj;)I"
	)
	public static int ua(gj var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZB)Z"
	)
	public static boolean qv(sb var0, boolean var1, boolean var2, boolean var3, byte var4) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az(var0.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean ax(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ah_fld, var1, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()[Lsb;"
	)
	public static sb[] an() {
		return new sb[]{ak_fld, ag_fld, az_fld, av_fld};
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bs(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.aw_fld * 1838720024, var1, var2, var3);
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

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(Lsb;IZZZ)Z"
	)
	public static boolean px(sb var0, int var1, boolean var2, boolean var3, boolean var4) {
		if (var0 == null) {
			var0.getClass();
		}

		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return 0 != (var1 & var6);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean at(boolean var1, boolean var2, boolean var3) {
		return this.az(this.aw_fld, var1, var2, var3);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bm(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ay_fld, var1, var2, var3);
	}

	sb(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.ae_fld = var1 * 944194543;
		this.ar_fld = var2;
		this.ah_fld = var3;
		this.aw_fld = var4;
		this.ay_fld = var5;
		this.as_fld = var6;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bd(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bz(boolean var1, boolean var2, boolean var3) {
		return this.az(this.as_fld * 346168083, var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean aj(boolean var1, boolean var2, boolean var3) {
		return this.az(this.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean ap(boolean var1, boolean var2, boolean var3) {
		return this.az(415170308 * this.ah_fld, var1, var2, var3);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bh(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.aw_fld, var1, var2, var3);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean bk(boolean var1, boolean var2, boolean var3) {
		return this.aw(this.ay_fld, var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IZZZ)Z"
	)
	boolean az(int var1, boolean var2, boolean var3, boolean var4) {
		byte var6 = 0;
		int var7 = var6 | (var3 ? 1 : 0);
		var7 |= var2 ? 8 : 32;
		var7 |= var4 ? 128 : 0;
		return (var1 & var7) != 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZZZ)Z"
	)
	public boolean br(boolean var1, boolean var2, boolean var3) {
		return this.az(this.as_fld, var1, var2, var3);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZI)Z"
	)
	public static boolean ly(sb var0, boolean var1, boolean var2, boolean var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az(var0.as_fld, var1, var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z"
	)
	public boolean ar(boolean var1, boolean var2, boolean var3, byte var4) {
		return this.az(this.ah_fld * 111087335, var1, var2, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z"
	)
	public boolean al(boolean var1, boolean var2, boolean var3, int var4) {
		return this.az(this.ae_fld, var1, var2, var3);
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z"
	)
	public boolean ay(boolean var1, boolean var2, boolean var3, int var4) {
		return this.az(979286157 * this.as_fld, var1, var2, var3);
	}
}
