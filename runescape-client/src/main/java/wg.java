import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wg")
public class wg extends ws {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -37783733
	)
	int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	me ak_fld = null;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		if (null != this.ak_fld && null != this.ak_fld.af_fld) {
			this.ak_fld.as_fld = true;

			try {
				if (this.ak_fld.ae_fld > 0.0F && ml.dc(this.ak_fld.af_fld, -1152871334)) {
					float var2 = 0 == this.ag_fld ? this.ag_fld : (float)(this.ak_fld.av_fld * 1153128559) / this.ag_fld;
					this.ak_fld.ae_fld = this.ak_fld.ae_fld - (0.0F == var2 ? this.ak_fld.av_fld * 1153128559 : var2);
					if (this.ak_fld.ae_fld < 0.0F) {
						this.ak_fld.ae_fld = 0.0F;
					}

					this.ak_fld.af_fld.ak((int)this.ak_fld.ae_fld);
					return false;
				}
			} catch (Exception var3) {
				ws.dx(this, var3.getMessage(), (byte)-113);
				return true;
			}

			this.ak_fld.as_fld = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		if (null != this.ak_fld && null != this.ak_fld.af_fld) {
			this.ak_fld.as_fld = true;

			try {
				if (this.ak_fld.ae_fld > 0.0F && ml.dc(this.ak_fld.af_fld, -2131840072)) {
					float var1 = 0 == this.ag_fld ? this.ag_fld : (float)(this.ak_fld.av_fld * 1153128559) / this.ag_fld;
					this.ak_fld.ae_fld = this.ak_fld.ae_fld - (0.0F == var1 ? this.ak_fld.av_fld * 1153128559 : var1);
					if (this.ak_fld.ae_fld < 0.0F) {
						this.ak_fld.ae_fld = 0.0F;
					}

					this.ak_fld.af_fld.ak((int)this.ak_fld.ae_fld);
					return false;
				}
			} catch (Exception var2) {
				ws.dx(this, var2.getMessage(), (byte)-11);
				return true;
			}

			this.ak_fld.as_fld = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(Lku;)V"
	)
	public static void qp(ku var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ax_fld = 0;
	}

	public wg(ws var1, int var2, boolean var3, int var4) {
		super(var1);
		this.ag_fld = 0;
		this.aw_fld = "FadeOutTask";
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
