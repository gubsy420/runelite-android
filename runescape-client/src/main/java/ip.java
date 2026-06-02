import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ip")
public class ip extends ht {
	@ObfuscatedGetter(
		intValue = -1211288735
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ia this$0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lko;)V"
	)
	public static void qi(rg var0, ko var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af_fld = var1;
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Lla;Ljava/lang/Runnable;I)Llv;"
	)
	public static lv na(la var0, Runnable var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return la.se(var0, 2, var2, 0, var1);
	}

	ip(ia var1) {
		this.this$0 = var1;
		this.ak_fld = -950055073;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lli;)I"
	)
	public static int mz(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bf_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = xi.tx(var1, 966200787);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.ay(this.ak_fld, (short)-20638);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = xi.tx(var1, 1034981764);
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Lle;I)V"
	)
	public static void rp(le var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.ae_fld == var0.ah_fld.length) {
				var0.ah_fld = Arrays.copyOf(var0.ah_fld, var0.ah_fld.length * 2);
			}

			var0.ah_fld[(var0.ae_fld += -131739243) * 384561597 - 1] = var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = xi.tx(var1, 757841802) * -726371141;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = xi.tx(var1, 1704500069) * -1383762984;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.ay(this.ak_fld, (short)-10655);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.ay(this.ak_fld, (short)-4113);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.ay(this.ak_fld, (short)-13036);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int ak() {
		return ej.cd_fld + 1;
	}
}
