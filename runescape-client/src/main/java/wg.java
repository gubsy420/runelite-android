import java.awt.Component;
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
	@ObfuscatedGetter(
		intValue = -37783733
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
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
			this.ak_fld.ar_fld = true;

			try {
				if (this.ak_fld.ae_fld > 0.0F && this.ak_fld.af_fld.ax()) {
					float var2 = 0 == this.ag_fld ? this.ag_fld : (float)(this.ak_fld.av_fld * 1153128559) / this.ag_fld;
					this.ak_fld.ae_fld = this.ak_fld.ae_fld - (0.0F == var2 ? this.ak_fld.av_fld * 1153128559 : var2);
					if (this.ak_fld.ae_fld < 0.0F) {
						this.ak_fld.ae_fld = 0.0F;
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

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ltg;Ljava/awt/Component;)V"
	)
	public static void ks(tg var0, Component var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.addMouseWheelListener(var0);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		if (null != this.ak_fld && null != this.ak_fld.af_fld) {
			this.ak_fld.ar_fld = true;

			try {
				if (this.ak_fld.ae_fld > 0.0F && this.ak_fld.af_fld.ax()) {
					float var1 = 0 == this.ag_fld ? this.ag_fld : (float)(this.ak_fld.av_fld * 1153128559) / this.ag_fld;
					this.ak_fld.ae_fld = this.ak_fld.ae_fld - (0.0F == var1 ? this.ak_fld.av_fld * 1153128559 : var1);
					if (this.ak_fld.ae_fld < 0.0F) {
						this.ak_fld.ae_fld = 0.0F;
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
