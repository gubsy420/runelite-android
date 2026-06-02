import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ta")
public class ta {
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bq_fld;
	@ObfuscatedName("yg")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean yg_fld;
	@ObfuscatedGetter(
		intValue = -1425659435
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ct_fld;
	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean xm_fld;
	@ObfuscatedGetter(
		intValue = 601491703
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	static long as_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lts;)Z"
	)
	boolean az(ts var1) {
		if (null == var1) {
			return false;
		} else {
			switch (256783734 * this.aw_fld) {
				case 1:
					return var1.av(this.ay_fld, 2106477002);
				case 2:
					return var1.ae(this.ay_fld * 469625163, 545390506);
				case 3:
					return var1.ah((char)(this.ay_fld * 1031940425), (short)-21393);
				case 4:
					return var1.aw(this.ay_fld == 1, 1838794664);
				default:
					return false;
			}
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lts;)V"
	)
	public void jy(ts var1) {
		xm_fld = false;
	}

	@ObfuscatedName("zm")
	@ObfuscatedSignature(
		descriptor = "(Lts;)V"
	)
	public void zm(ts var1) {
		xm_fld = this.ct_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lts;)Z"
	)
	boolean ak(ts var1) {
		this.zm(var1);
		if (null == var1) {
			this.jy(var1);
			return false;
		} else {
			switch (this.aw_fld) {
				case 1:
					boolean var4 = var1.av(this.ay_fld, 1905801461);
					this.jy(var1);
					return var4;
				case 2:
					boolean var3 = var1.ae(this.ay_fld, 1080632209);
					this.jy(var1);
					return var3;
				case 3:
					boolean var2 = var1.ah((char)this.ay_fld, (short)-3730);
					this.jy(var1);
					return var2;
				case 4:
					boolean var10000 = var1.aw(this.ay_fld == 1, 1906190534);
					this.jy(var1);
					return var10000;
				default:
					this.jy(var1);
					return false;
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Loe;IJ)J"
	)
	public static long kn(oe var0, int var1, long var2) {
		return hq.az(var0.es_fld, var1, var2);
	}

	ta(int var1, int var2) {
		this.ct_fld = yg_fld;
		this.aw_fld = var1;
		this.ay_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lts;)Z"
	)
	boolean ag(ts var1) {
		if (null == var1) {
			return false;
		} else {
			switch (-105105418 * this.aw_fld) {
				case 1:
					return var1.av(1441053575 * this.ay_fld, 2015032444);
				case 2:
					return var1.ae(this.ay_fld, 659887621);
				case 3:
					return var1.ah((char)this.ay_fld, (short)-12456);
				case 4:
					return var1.aw(this.ay_fld == 1, 576622783);
				default:
					return false;
			}
		}
	}
}
