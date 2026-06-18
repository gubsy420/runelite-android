import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rk")
public class rk {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aq_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1375760171
	)
	int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	gu ak_fld = new gu();
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int at_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Luq;)V"
	)
	public static void ni(np var0, uq var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.av_fld != null) {
			uq.xr(var1);
		}

		var1.av_fld = var0.ag_fld.av_fld;
		var1.ae_fld = var0.ag_fld;
		var1.av_fld.ae_fld = var1;
		var1.ae_fld.av_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luz;B)Luz;"
	)
	static uz az(uz var0) {
		synchronized (uz.ak_fld) {
			if (uz.az_fld == 0) {
				return new uz(var0);
			} else {
				uz.ik(uz.ak_fld[(uz.az_fld -= -1833938397) * 770960779], var0, (byte)-16);
				return uz.ak_fld[uz.az_fld];
			}
		}
	}

	rk() {
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int cf(int var0, ba var1, boolean var2) {
		if (var0 == 7463) {
			boolean var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			ox.hg(var4);
			return 1;
		} else {
			return 2;
		}
	}
}
