import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nl")
public class nl {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedGetter(
		longValue = -1950941588164690461L
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public nb az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedGetter(
		intValue = -1790228487
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ae_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ag() {
		return this.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String av() {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String az() {
		return this.av_fld;
	}

	nl(xi var1, byte var2, int var3) {
		this.av_fld = xi.kc(var1, 871968036);
		this.ae_fld = xi.kc(var1, 739294229);
		this.ak_fld = xi.tx(var1, 1545530999);
		this.ag_fld = xi.ob(var1, -1106359358);
		int var4 = var1.co();
		int var5 = var1.co();
		this.az_fld = new nb();
		nb.qx(this.az_fld, 2);
		this.az_fld.ae(var2, 793381458);
		this.az_fld.av_fld = var4;
		this.az_fld.ag_fld = var5;
		this.az_fld.az_fld = 0;
		this.az_fld.ae_fld = 0;
		this.az_fld.ah_fld = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;"
	)
	public static oh ag(int var0) throws EOFException {
		oh var2 = (oh)oh.ae_fld.ak(var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = oh.av_fld.bb(16, var0, 584982574);
			var2 = new oh();
			if (null != var3) {
				var2.az(new xi(var3));
			}

			oh.ae_fld.az(var2, var0);
			return var2;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lsl;"
	)
	static sl ck(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (sl)var0;
		}
	}

	@ObfuscatedName("zm")
	@ObfuscatedSignature(
		descriptor = "(Lma;)[F"
	)
	public static float[] zm(ma var0) {
		return var0.af_fld.ah_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(JJLzm;)D"
	)
	public static double az(long var0, long var2, zm var4) {
		float var6;
		if (var2 > 0L) {
			float var8 = (float)var0 / (float)var2;
			float var7 = Math.max(0.0F, Math.min(var8, 1.0F));
			var6 = var7;
		} else {
			var6 = 1.0F;
		}

		double var13 = var6;
		if (!(var13 <= 0.0) && !(var13 >= 1.0)) {
			switch (var4.bz_fld) {
				case 0:
				default:
					return var13;
				case 1:
					return 1.0 - Math.cos(var13 * Math.PI / 2.0);
				case 2:
					return Math.sin(Math.PI * var13 / 2.0);
				case 3:
					return -(Math.cos(Math.PI * var13) - 1.0) / 2.0;
				case 4:
					return var13 * var13;
				case 5:
					return 1.0 - (1.0 - var13) * (1.0 - var13);
				case 6:
					return var13 < 0.5 ? var13 * (2.0 * var13) : 1.0 - Math.pow(2.0 + var13 * -2.0, 2.0) / 2.0;
				case 7:
					return var13 * (var13 * var13);
				case 8:
					return 1.0 - Math.pow(1.0 - var13, 3.0);
				case 9:
					return var13 < 0.5 ? 4.0 * var13 * var13 * var13 : 1.0 - Math.pow(-2.0 * var13 + 2.0, 3.0) / 2.0;
				case 10:
					return var13 * (var13 * var13 * var13);
				case 11:
					return 1.0 - Math.pow(1.0 - var13, 4.0);
				case 12:
					return var13 < 0.5 ? var13 * (var13 * (8.0 * var13)) * var13 : 1.0 - Math.pow(-2.0 * var13 + 2.0, 4.0) / 2.0;
				case 13:
					return var13 * (var13 * (var13 * var13 * var13));
				case 14:
					return 1.0 - Math.pow(1.0 - var13, 5.0);
				case 15:
					return var13 < 0.5 ? var13 * (var13 * (8.0 * var13) * var13 * var13) : 1.0 - Math.pow(var13 * -2.0 + 2.0, 5.0) / 2.0;
				case 16:
					return Math.pow(2.0, 10.0 * var13 - 10.0);
				case 17:
					return 1.0 - Math.pow(2.0, -10.0 * var13);
				case 18:
					return var13 < 0.5 ? Math.pow(2.0, 20.0 * var13 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, var13 * -20.0 + 10.0)) / 2.0;
				case 19:
					return 1.0 - Math.sqrt(1.0 - Math.pow(var13, 2.0));
				case 20:
					return Math.sqrt(1.0 - Math.pow(var13 - 1.0, 2.0));
				case 21:
					return var13 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var13, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * var13 + 2.0, 2.0)) + 1.0) / 2.0;
				case 22:
					double var18 = 1.70158;
					double var21 = 2.70158;
					return var13 * (var13 * 2.70158) * var13 - 1.70158 * var13 * var13;
				case 23:
					double var17 = 1.70158;
					double var20 = 2.70158;
					return 1.0 + 2.70158 * Math.pow(var13 - 1.0, 3.0) + 1.70158 * Math.pow(var13 - 1.0, 2.0);
				case 24:
					double var16 = 1.70158;
					double var19 = 2.5949095;
					return var13 < 0.5
						? Math.pow(2.0 * var13, 2.0) * (7.189819 * var13 - 2.5949095) / 2.0
						: (Math.pow(var13 * 2.0 - 2.0, 2.0) * ((2.0 * var13 - 2.0) * 3.5949095 + 2.5949095) + 2.0) / 2.0;
				case 25:
					double var15 = Math.PI * 2.0 / 3.0;
					return -Math.pow(2.0, var13 * 10.0 - 10.0) * Math.sin((Math.PI * 2.0 / 3.0) * (var13 * 10.0 - 10.75));
				case 26:
					double var14 = Math.PI * 2.0 / 3.0;
					return Math.pow(2.0, -10.0 * var13) * Math.sin((Math.PI * 2.0 / 3.0) * (10.0 * var13 - 0.75)) + 1.0;
				case 27:
					double var9 = Math.PI * 4.0 / 9.0;
					double var11 = Math.sin((Math.PI * 4.0 / 9.0) * (20.0 * var13 - 11.125));
					return var13 < 0.5 ? -(Math.pow(2.0, var13 * 20.0 - 10.0) * var11) / 2.0 : Math.pow(2.0, -20.0 * var13 + 10.0) * var11 / 2.0 + 1.0;
			}
		} else {
			return var13 <= 0.0 ? 0.0 : 1.0;
		}
	}

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)Ljava/lang/String;"
	)
	public static String rl(nl var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.av_fld;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ak(int var1) {
		return this.av_fld;
	}
}
