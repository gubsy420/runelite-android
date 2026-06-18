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
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1579080913
	)
	int ag_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		if (this.ak_fld != null && this.ak_fld.af_fld != null) {
			this.ak_fld.as_fld = true;

			try {
				if (this.ak_fld.ae_fld < 1153128559 * this.ak_fld.av_fld && ml.dc(this.ak_fld.af_fld, -1698174259)) {
					float var1 = this.ag_fld == 0 ? this.ag_fld : (float)(1153128559 * this.ak_fld.av_fld) / this.ag_fld;
					this.ak_fld.ae_fld = this.ak_fld.ae_fld + (var1 == 0.0F ? 1153128559 * this.ak_fld.av_fld : var1);
					if (this.ak_fld.ae_fld > 1153128559 * this.ak_fld.av_fld) {
						this.ak_fld.ae_fld = this.ak_fld.av_fld * 1153128559;
					}

					this.ak_fld.af_fld.ak((int)this.ak_fld.ae_fld);
					return false;
				}
			} catch (Exception var2) {
				ws.dx(this, var2.getMessage(), (byte)-81);
				return true;
			}

			this.ak_fld.as_fld = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)I"
	)
	public static int gm(cn var0) {
		return var0.ai_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		if (this.ak_fld != null && this.ak_fld.af_fld != null) {
			this.ak_fld.as_fld = true;

			try {
				if (this.ak_fld.ae_fld < 1153128559 * this.ak_fld.av_fld && ml.dc(this.ak_fld.af_fld, -1723012100)) {
					float var2 = this.ag_fld == 0 ? this.ag_fld : (float)(1153128559 * this.ak_fld.av_fld) / this.ag_fld;
					this.ak_fld.ae_fld = this.ak_fld.ae_fld + (var2 == 0.0F ? 1153128559 * this.ak_fld.av_fld : var2);
					if (this.ak_fld.ae_fld > 1153128559 * this.ak_fld.av_fld) {
						this.ak_fld.ae_fld = this.ak_fld.av_fld * 1153128559;
					}

					this.ak_fld.af_fld.ak((int)this.ak_fld.ae_fld);
					return false;
				}
			} catch (Exception var3) {
				ws.dx(this, var3.getMessage(), (byte)-112);
				return true;
			}

			this.ak_fld.as_fld = false;
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
