import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wx")
public class wx extends ws {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	me ak_fld = null;
	@ObfuscatedGetter(
		intValue = -1579080913
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lfj;"
	)
	public static fj lk(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.ah_fld; var5++) {
				fj var6 = var4.aw_fld[var5];
				if (bw.ag(var6.az_fld) && var6.ay_fld == var2 && var6.ar_fld == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		if (this.ak_fld != null && this.ak_fld.af_fld != null) {
			this.ak_fld.ar_fld = true;

			try {
				if (this.ak_fld.ae_fld < 1153128559 * this.ak_fld.av_fld && this.ak_fld.af_fld.ax()) {
					float var1 = this.ag_fld == 0 ? this.ag_fld : (float)(1153128559 * this.ak_fld.av_fld) / this.ag_fld;
					this.ak_fld.ae_fld = this.ak_fld.ae_fld + (var1 == 0.0F ? 1153128559 * this.ak_fld.av_fld : var1);
					if (this.ak_fld.ae_fld > 1153128559 * this.ak_fld.av_fld) {
						this.ak_fld.ae_fld = this.ak_fld.av_fld * 1153128559;
					}

					this.ak_fld.af_fld.ak((int)this.ak_fld.ae_fld);
					return false;
				}
			} catch (Exception var2) {
				this.al(var2.getMessage());
				return true;
			}

			this.ak_fld.ar_fld = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		if (this.ak_fld != null && this.ak_fld.af_fld != null) {
			this.ak_fld.ar_fld = true;

			try {
				if (this.ak_fld.ae_fld < 1153128559 * this.ak_fld.av_fld && this.ak_fld.af_fld.ax()) {
					float var2 = this.ag_fld == 0 ? this.ag_fld : (float)(1153128559 * this.ak_fld.av_fld) / this.ag_fld;
					this.ak_fld.ae_fld = this.ak_fld.ae_fld + (var2 == 0.0F ? 1153128559 * this.ak_fld.av_fld : var2);
					if (this.ak_fld.ae_fld > 1153128559 * this.ak_fld.av_fld) {
						this.ak_fld.ae_fld = this.ak_fld.av_fld * 1153128559;
					}

					this.ak_fld.af_fld.ak((int)this.ak_fld.ae_fld);
					return false;
				}
			} catch (Exception var3) {
				this.al(var3.getMessage());
				return true;
			}

			this.ak_fld.ar_fld = false;
			return true;
		} else {
			return true;
		}
	}

	public wx(ws var1, int var2, boolean var3, int var4) {
		super(var1);
		this.aw_fld = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < mb.az_fld.size()) {
				this.ak_fld = (me)(me)mb.az_fld.get(var2);
			} else if (!var3 && var2 < mb.av_fld.size()) {
				this.ak_fld = (me)(me)mb.av_fld.get(var2);
			}

			this.ag_fld = var4;
		}
	}
}
