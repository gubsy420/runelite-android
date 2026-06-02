import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("we")
public class we extends ws {
	@ObfuscatedGetter(
		intValue = 1776046265
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		longValue = -5009916022531722617L
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ak_fld;

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Lhg;II)I"
	)
	public static int wo(hg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (9 == var2) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = 3 + var1 & 3;
		}

		if (11 == var2) {
			var1 = 3 + var1 & 3;
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		if (this.ak_fld < this.ag_fld) {
			this.ak_fld++;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnl;Lnl;)I"
	)
	public static int rk(nd var0, nl var1, nl var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1.az_fld.av_fld * -220330603 < var2.az_fld.av_fld * -220330603 ? -1 : (var2.az_fld.av_fld * -220330603 == var1.az_fld.av_fld * -220330603 ? 0 : 1);
	}

	public we(ws var1, int var2) {
		super(var1);
		this.ag_fld = var2;
		this.aw_fld = "DelayFadeTask";
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		if (this.ak_fld < this.ag_fld * 594454270) {
			this.ak_fld++;
			return false;
		} else {
			return true;
		}
	}
}
