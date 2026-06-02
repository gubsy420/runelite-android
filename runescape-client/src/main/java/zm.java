import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zm")
public class zm implements xm {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ar_fld = new zm(9, 9);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ag_fld = new zm(1, 1);
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ab_fld = new zm(21, 21);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm bm_fld = new zm(26, 26);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ae_fld = new zm(4, 4);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ah_fld = new zm(5, 5);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm av_fld = new zm(3, 3);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ay_fld = new zm(7, 7);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm as_fld = new zm(8, 8);
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "[Lzm;"
	)
	public static zm[] br_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm af_fld = new zm(10, 10);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm al_fld = new zm(11, 11);
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ai_fld = new zm(16, 16);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ax_fld = new zm(13, 13);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm an_fld = new zm(14, 14);
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm aa_fld = new zm(15, 15);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm az_fld = new zm(2, 2);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ap_fld = new zm(22, 22);
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm am_fld = new zm(18, 18);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	public static zm ak_fld = new zm(0, 0);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ao_fld = new zm(20, 20);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm au_fld = new zm(12, 12);
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ad_fld = new zm(19, 19);
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm at_fld = new zm(23, 23);
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm ac_fld = new zm(24, 24);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm aj_fld = new zm(25, 25);
	@ObfuscatedGetter(
		intValue = -1993632925
	)
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int be_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm bd_fld = new zm(27, 27);
	@ObfuscatedGetter(
		intValue = 878213953
	)
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bz_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm aw_fld = new zm(6, 6);
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lzm;"
	)
	static zm aq_fld = new zm(17, 17);
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(JJLzm;)D"
	)
	public static double ar(long var0, long var2, zm var4) {
		float var5;
		if (var2 > 0L) {
			float var7 = (float)var0 / (float)var2;
			float var6 = Math.max(0.0F, Math.min(var7, 1.0F));
			var5 = var6;
		} else {
			var5 = 1.0F;
		}

		double var12 = var5;
		if (!(var12 <= 0.0) && !(var12 >= 1.0)) {
			switch (var4.bz_fld) {
				case 0:
				default:
					return var12;
				case 1:
					return 1.0 - Math.cos(var12 * Math.PI / 2.0);
				case 2:
					return Math.sin(Math.PI * var12 / 2.0);
				case 3:
					return -(Math.cos(Math.PI * var12) - 1.0) / 2.0;
				case 4:
					return var12 * var12;
				case 5:
					return 1.0 - (1.0 - var12) * (1.0 - var12);
				case 6:
					return var12 < 0.5 ? var12 * (2.0 * var12) : 1.0 - Math.pow(2.0 + var12 * -2.0, 2.0) / 2.0;
				case 7:
					return var12 * (var12 * var12);
				case 8:
					return 1.0 - Math.pow(1.0 - var12, 3.0);
				case 9:
					return var12 < 0.5 ? 4.0 * var12 * var12 * var12 : 1.0 - Math.pow(-2.0 * var12 + 2.0, 3.0) / 2.0;
				case 10:
					return var12 * (var12 * var12 * var12);
				case 11:
					return 1.0 - Math.pow(1.0 - var12, 4.0);
				case 12:
					return var12 < 0.5 ? var12 * (var12 * (8.0 * var12)) * var12 : 1.0 - Math.pow(-2.0 * var12 + 2.0, 4.0) / 2.0;
				case 13:
					return var12 * (var12 * (var12 * var12 * var12));
				case 14:
					return 1.0 - Math.pow(1.0 - var12, 5.0);
				case 15:
					return var12 < 0.5 ? var12 * (var12 * (8.0 * var12) * var12 * var12) : 1.0 - Math.pow(var12 * -2.0 + 2.0, 5.0) / 2.0;
				case 16:
					return Math.pow(2.0, 10.0 * var12 - 10.0);
				case 17:
					return 1.0 - Math.pow(2.0, -10.0 * var12);
				case 18:
					return var12 < 0.5 ? Math.pow(2.0, 20.0 * var12 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, var12 * -20.0 + 10.0)) / 2.0;
				case 19:
					return 1.0 - Math.sqrt(1.0 - Math.pow(var12, 2.0));
				case 20:
					return Math.sqrt(1.0 - Math.pow(var12 - 1.0, 2.0));
				case 21:
					return var12 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var12, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * var12 + 2.0, 2.0)) + 1.0) / 2.0;
				case 22:
					double var17 = 1.70158;
					double var20 = 2.70158;
					return var12 * (var12 * 2.70158) * var12 - 1.70158 * var12 * var12;
				case 23:
					double var16 = 1.70158;
					double var19 = 2.70158;
					return 1.0 + 2.70158 * Math.pow(var12 - 1.0, 3.0) + 1.70158 * Math.pow(var12 - 1.0, 2.0);
				case 24:
					double var15 = 1.70158;
					double var18 = 2.5949095;
					return var12 < 0.5
						? Math.pow(2.0 * var12, 2.0) * (7.189819 * var12 - 2.5949095) / 2.0
						: (Math.pow(var12 * 2.0 - 2.0, 2.0) * ((2.0 * var12 - 2.0) * 3.5949095 + 2.5949095) + 2.0) / 2.0;
				case 25:
					double var14 = Math.PI * 2.0 / 3.0;
					return -Math.pow(2.0, var12 * 10.0 - 10.0) * Math.sin((Math.PI * 2.0 / 3.0) * (var12 * 10.0 - 10.75));
				case 26:
					double var13 = Math.PI * 2.0 / 3.0;
					return Math.pow(2.0, -10.0 * var12) * Math.sin((Math.PI * 2.0 / 3.0) * (10.0 * var12 - 0.75)) + 1.0;
				case 27:
					double var8 = Math.PI * 4.0 / 9.0;
					double var10 = Math.sin((Math.PI * 4.0 / 9.0) * (20.0 * var12 - 11.125));
					return var12 < 0.5 ? -(Math.pow(2.0, var12 * 20.0 - 10.0) * var10) / 2.0 : Math.pow(2.0, -20.0 * var12 + 10.0) * var10 / 2.0 + 1.0;
			}
		} else {
			return var12 <= 0.0 ? 0.0 : 1.0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.be_fld;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Loo;I)I"
	)
	public static int lk(oo var0, int var1) {
		return var1 == 0 ? var0.as_fld : var0.ar_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lzm;"
	)
	static zm[] ay() {
		return new zm[]{
			ak_fld,
			ag_fld,
			az_fld,
			av_fld,
			ae_fld,
			ah_fld,
			aw_fld,
			ay_fld,
			as_fld,
			ar_fld,
			af_fld,
			al_fld,
			au_fld,
			ax_fld,
			an_fld,
			aa_fld,
			ai_fld,
			aq_fld,
			am_fld,
			ad_fld,
			ao_fld,
			ab_fld,
			ap_fld,
			at_fld,
			ac_fld,
			aj_fld,
			bm_fld,
			bd_fld
		};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.be_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.be_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.be_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lzm;"
	)
	static zm[] aw() {
		return new zm[]{
			ak_fld,
			ag_fld,
			az_fld,
			av_fld,
			ae_fld,
			ah_fld,
			aw_fld,
			ay_fld,
			as_fld,
			ar_fld,
			af_fld,
			al_fld,
			au_fld,
			ax_fld,
			an_fld,
			aa_fld,
			ai_fld,
			aq_fld,
			am_fld,
			ad_fld,
			ao_fld,
			ab_fld,
			ap_fld,
			at_fld,
			ac_fld,
			aj_fld,
			bm_fld,
			bd_fld
		};
	}

	zm(int var1, int var2) {
		this.bz_fld = var1;
		this.be_fld = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(JJLzm;)D"
	)
	public static double as(long var0, long var2, zm var4) {
		float var5;
		if (var2 > 0L) {
			float var7 = (float)var0 / (float)var2;
			float var6 = Math.max(0.0F, Math.min(var7, 1.0F));
			var5 = var6;
		} else {
			var5 = 1.0F;
		}

		double var12 = var5;
		if (!(var12 <= 0.0) && !(var12 >= 1.0)) {
			switch (var4.bz_fld) {
				case 0:
				default:
					return var12;
				case 1:
					return 1.0 - Math.cos(var12 * Math.PI / 2.0);
				case 2:
					return Math.sin(Math.PI * var12 / 2.0);
				case 3:
					return -(Math.cos(Math.PI * var12) - 1.0) / 2.0;
				case 4:
					return var12 * var12;
				case 5:
					return 1.0 - (1.0 - var12) * (1.0 - var12);
				case 6:
					return var12 < 0.5 ? var12 * (2.0 * var12) : 1.0 - Math.pow(2.0 + var12 * -2.0, 2.0) / 2.0;
				case 7:
					return var12 * (var12 * var12);
				case 8:
					return 1.0 - Math.pow(1.0 - var12, 3.0);
				case 9:
					return var12 < 0.5 ? 4.0 * var12 * var12 * var12 : 1.0 - Math.pow(-2.0 * var12 + 2.0, 3.0) / 2.0;
				case 10:
					return var12 * (var12 * var12 * var12);
				case 11:
					return 1.0 - Math.pow(1.0 - var12, 4.0);
				case 12:
					return var12 < 0.5 ? var12 * (var12 * (8.0 * var12)) * var12 : 1.0 - Math.pow(-2.0 * var12 + 2.0, 4.0) / 2.0;
				case 13:
					return var12 * (var12 * (var12 * var12 * var12));
				case 14:
					return 1.0 - Math.pow(1.0 - var12, 5.0);
				case 15:
					return var12 < 0.5 ? var12 * (var12 * (8.0 * var12) * var12 * var12) : 1.0 - Math.pow(var12 * -2.0 + 2.0, 5.0) / 2.0;
				case 16:
					return Math.pow(2.0, 10.0 * var12 - 10.0);
				case 17:
					return 1.0 - Math.pow(2.0, -10.0 * var12);
				case 18:
					return var12 < 0.5 ? Math.pow(2.0, 20.0 * var12 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, var12 * -20.0 + 10.0)) / 2.0;
				case 19:
					return 1.0 - Math.sqrt(1.0 - Math.pow(var12, 2.0));
				case 20:
					return Math.sqrt(1.0 - Math.pow(var12 - 1.0, 2.0));
				case 21:
					return var12 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var12, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * var12 + 2.0, 2.0)) + 1.0) / 2.0;
				case 22:
					double var17 = 1.70158;
					double var20 = 2.70158;
					return var12 * (var12 * 2.70158) * var12 - 1.70158 * var12 * var12;
				case 23:
					double var16 = 1.70158;
					double var19 = 2.70158;
					return 1.0 + 2.70158 * Math.pow(var12 - 1.0, 3.0) + 1.70158 * Math.pow(var12 - 1.0, 2.0);
				case 24:
					double var15 = 1.70158;
					double var18 = 2.5949095;
					return var12 < 0.5
						? Math.pow(2.0 * var12, 2.0) * (7.189819 * var12 - 2.5949095) / 2.0
						: (Math.pow(var12 * 2.0 - 2.0, 2.0) * ((2.0 * var12 - 2.0) * 3.5949095 + 2.5949095) + 2.0) / 2.0;
				case 25:
					double var14 = Math.PI * 2.0 / 3.0;
					return -Math.pow(2.0, var12 * 10.0 - 10.0) * Math.sin((Math.PI * 2.0 / 3.0) * (var12 * 10.0 - 10.75));
				case 26:
					double var13 = Math.PI * 2.0 / 3.0;
					return Math.pow(2.0, -10.0 * var12) * Math.sin((Math.PI * 2.0 / 3.0) * (10.0 * var12 - 0.75)) + 1.0;
				case 27:
					double var8 = Math.PI * 4.0 / 9.0;
					double var10 = Math.sin((Math.PI * 4.0 / 9.0) * (20.0 * var12 - 11.125));
					return var12 < 0.5 ? -(Math.pow(2.0, var12 * 20.0 - 10.0) * var10) / 2.0 : Math.pow(2.0, -20.0 * var12 + 10.0) * var10 / 2.0 + 1.0;
			}
		} else {
			return var12 <= 0.0 ? 0.0 : 1.0;
		}
	}

	static {
		zm[] var0 = wi.ak();
		br_fld = new zm[var0.length];
		zm[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; var2++) {
			zm var3 = var1[var2];
			br_fld[var3.be_fld] = var3;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(JJLzm;)D"
	)
	public static double af(long var0, long var2, zm var4) {
		float var5;
		if (var2 > 0L) {
			float var7 = (float)var0 / (float)var2;
			float var6 = Math.max(0.0F, Math.min(var7, 1.0F));
			var5 = var6;
		} else {
			var5 = 1.0F;
		}

		double var12 = var5;
		if (!(var12 <= 0.0) && !(var12 >= 1.0)) {
			switch (var4.bz_fld) {
				case 0:
				default:
					return var12;
				case 1:
					return 1.0 - Math.cos(var12 * Math.PI / 2.0);
				case 2:
					return Math.sin(Math.PI * var12 / 2.0);
				case 3:
					return -(Math.cos(Math.PI * var12) - 1.0) / 2.0;
				case 4:
					return var12 * var12;
				case 5:
					return 1.0 - (1.0 - var12) * (1.0 - var12);
				case 6:
					return var12 < 0.5 ? var12 * (2.0 * var12) : 1.0 - Math.pow(2.0 + var12 * -2.0, 2.0) / 2.0;
				case 7:
					return var12 * (var12 * var12);
				case 8:
					return 1.0 - Math.pow(1.0 - var12, 3.0);
				case 9:
					return var12 < 0.5 ? 4.0 * var12 * var12 * var12 : 1.0 - Math.pow(-2.0 * var12 + 2.0, 3.0) / 2.0;
				case 10:
					return var12 * (var12 * var12 * var12);
				case 11:
					return 1.0 - Math.pow(1.0 - var12, 4.0);
				case 12:
					return var12 < 0.5 ? var12 * (var12 * (8.0 * var12)) * var12 : 1.0 - Math.pow(-2.0 * var12 + 2.0, 4.0) / 2.0;
				case 13:
					return var12 * (var12 * (var12 * var12 * var12));
				case 14:
					return 1.0 - Math.pow(1.0 - var12, 5.0);
				case 15:
					return var12 < 0.5 ? var12 * (var12 * (8.0 * var12) * var12 * var12) : 1.0 - Math.pow(var12 * -2.0 + 2.0, 5.0) / 2.0;
				case 16:
					return Math.pow(2.0, 10.0 * var12 - 10.0);
				case 17:
					return 1.0 - Math.pow(2.0, -10.0 * var12);
				case 18:
					return var12 < 0.5 ? Math.pow(2.0, 20.0 * var12 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, var12 * -20.0 + 10.0)) / 2.0;
				case 19:
					return 1.0 - Math.sqrt(1.0 - Math.pow(var12, 2.0));
				case 20:
					return Math.sqrt(1.0 - Math.pow(var12 - 1.0, 2.0));
				case 21:
					return var12 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var12, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * var12 + 2.0, 2.0)) + 1.0) / 2.0;
				case 22:
					double var17 = 1.70158;
					double var20 = 2.70158;
					return var12 * (var12 * 2.70158) * var12 - 1.70158 * var12 * var12;
				case 23:
					double var16 = 1.70158;
					double var19 = 2.70158;
					return 1.0 + 2.70158 * Math.pow(var12 - 1.0, 3.0) + 1.70158 * Math.pow(var12 - 1.0, 2.0);
				case 24:
					double var15 = 1.70158;
					double var18 = 2.5949095;
					return var12 < 0.5
						? Math.pow(2.0 * var12, 2.0) * (7.189819 * var12 - 2.5949095) / 2.0
						: (Math.pow(var12 * 2.0 - 2.0, 2.0) * ((2.0 * var12 - 2.0) * 3.5949095 + 2.5949095) + 2.0) / 2.0;
				case 25:
					double var14 = Math.PI * 2.0 / 3.0;
					return -Math.pow(2.0, var12 * 10.0 - 10.0) * Math.sin((Math.PI * 2.0 / 3.0) * (var12 * 10.0 - 10.75));
				case 26:
					double var13 = Math.PI * 2.0 / 3.0;
					return Math.pow(2.0, -10.0 * var12) * Math.sin((Math.PI * 2.0 / 3.0) * (10.0 * var12 - 0.75)) + 1.0;
				case 27:
					double var8 = Math.PI * 4.0 / 9.0;
					double var10 = Math.sin((Math.PI * 4.0 / 9.0) * (20.0 * var12 - 11.125));
					return var12 < 0.5 ? -(Math.pow(2.0, var12 * 20.0 - 10.0) * var10) / 2.0 : Math.pow(2.0, -20.0 * var12 + 10.0) * var10 / 2.0 + 1.0;
			}
		} else {
			return var12 <= 0.0 ? 0.0 : 1.0;
		}
	}
}
