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
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1425659435
	)
	int ay_fld;
	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean la_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 601491703
	)
	int aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ni_fld;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean pw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	static long as_fld;

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Lts;)V"
	)
	public void fg(ts var1) {
		pw_fld = this.ni_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lts;)Z"
	)
	boolean az(ts var1) {
		if (null == var1) {
			return false;
		} else {
			switch (256783734 * this.ay_fld) {
				case 1:
					return var1.av(this.aw_fld, 2106477002);
				case 2:
					return var1.ae(this.aw_fld * 469625163, 545390506);
				case 3:
					return var1.ah((char)(this.aw_fld * 1031940425), (short)-21393);
				case 4:
					return var1.aw(this.aw_fld == 1, 1838794664);
				default:
					return false;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lts;)V"
	)
	public void ag(ts var1) {
		pw_fld = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lts;I)Z"
	)
	boolean ak(ts var1) {
		this.fg(var1);
		if (null == var1) {
			this.ag(var1);
			return false;
		} else {
			switch (this.ay_fld) {
				case 1:
					boolean var4 = var1.av(this.aw_fld, 1905801461);
					this.ag(var1);
					return var4;
				case 2:
					boolean var3 = var1.ae(this.aw_fld, 1080632209);
					this.ag(var1);
					return var3;
				case 3:
					boolean var2 = var1.ah((char)this.aw_fld, (short)-3730);
					this.ag(var1);
					return var2;
				case 4:
					boolean var10000 = var1.aw(this.aw_fld == 1, 1906190534);
					this.ag(var1);
					return var10000;
				default:
					this.ag(var1);
					return false;
			}
		}
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lxi;)V"
	)
	public static void ph(xi var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cy(var1.al_fld, 0, var1.au_fld);
	}

	ta(int var1, int var2) {
		this.ni_fld = la_fld;
		this.ay_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lts;)Z"
	)
	boolean ag_boolean(ts var1) {
		if (null == var1) {
			return false;
		} else {
			switch (-105105418 * this.ay_fld) {
				case 1:
					return var1.av(1441053575 * this.aw_fld, 2015032444);
				case 2:
					return var1.ae(this.aw_fld, 659887621);
				case 3:
					return var1.ah((char)this.aw_fld, (short)-12456);
				case 4:
					return var1.aw(this.aw_fld == 1, 576622783);
				default:
					return false;
			}
		}
	}
}
