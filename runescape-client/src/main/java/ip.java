import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ip")
public class ip extends ht {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1211288735
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

	ip(ia var1) {
		this.this$0 = var1;
		this.ak_fld = -950055073;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.cm();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.ay(this.ak_fld, (short)-20638);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)Ljava/lang/Object;"
	)
	public static Object ai(pd var0) {
		if (0 == var0.av_fld) {
			return null;
		} else {
			var0.ae_fld += 2023104386;
			Object var1 = var0.ag_fld[0].ak_fld;
			var0.az_fld.remove(var1);
			var0.av_fld--;
			if (1238153755 * var0.av_fld == 0) {
				var0.ag_fld[var0.av_fld] = null;
			} else {
				var0.ag_fld[0] = var0.ag_fld[var0.av_fld];
				var0.ag_fld[0].ag_fld = 0;
				var0.ag_fld[-680165016 * var0.av_fld] = null;
				pd.pz(var0, 0, -2114691761);
			}

			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.cm();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.cm() * -726371141;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.cm() * -1383762984;
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

	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "(Lrr;)I"
	)
	public static int wz(rr var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ak() {
		return ej.cd_fld + 1;
	}
}
