import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("il")
public class il extends ht {
	@ObfuscatedGetter(
		intValue = -1192683753
	)
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int of_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ag_fld;
	@ObfuscatedGetter(
		intValue = -781371543
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

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Luy;)F"
	)
	public static float ls(uy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.jj_fld * (var0.va_fld * var0.rw_fld) * var0.kh_fld
			+ (
				var0.my_fld * (var0.ih_fld * (var0.va_fld * var0.hx_fld))
					+ (
						var0.nz_fld * (var0.rw_fld * var0.bs_fld * var0.ki_fld)
							+ (
								var0.xv_fld * (var0.bs_fld * var0.hx_fld * var0.hj_fld)
									+ (
										var0.ja_fld * var0.or_fld * var0.ih_fld * var0.nz_fld
											- var0.hj_fld * (var0.or_fld * var0.ja_fld) * var0.xv_fld
											- var0.jj_fld * (var0.ja_fld * var0.rw_fld) * var0.nz_fld
											+ var0.my_fld * (var0.hj_fld * (var0.ja_fld * var0.rw_fld))
											+ var0.xv_fld * (var0.ja_fld * var0.ok_fld * var0.jj_fld)
											- var0.ja_fld * var0.ok_fld * var0.ih_fld * var0.my_fld
											- var0.nz_fld * (var0.hx_fld * var0.bs_fld * var0.ih_fld)
									)
							)
							- var0.hj_fld * (var0.bs_fld * var0.rw_fld) * var0.kh_fld
							- var0.xv_fld * (var0.ki_fld * (var0.ok_fld * var0.bs_fld))
							+ var0.kh_fld * (var0.bs_fld * var0.ok_fld * var0.ih_fld)
							+ var0.nz_fld * (var0.bp_fld * var0.hx_fld * var0.jj_fld)
							- var0.my_fld * (var0.hj_fld * (var0.bp_fld * var0.hx_fld))
							- var0.or_fld * var0.bp_fld * var0.ki_fld * var0.nz_fld
							+ var0.kh_fld * (var0.bp_fld * var0.or_fld * var0.hj_fld)
							+ var0.ki_fld * (var0.bp_fld * var0.ok_fld) * var0.my_fld
							- var0.kh_fld * (var0.ok_fld * var0.bp_fld * var0.jj_fld)
							- var0.xv_fld * (var0.jj_fld * (var0.hx_fld * var0.va_fld))
					)
					+ var0.xv_fld * (var0.or_fld * var0.va_fld * var0.ki_fld)
					- var0.kh_fld * (var0.ih_fld * (var0.or_fld * var0.va_fld))
					- var0.ki_fld * (var0.rw_fld * var0.va_fld) * var0.my_fld
			);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ay(ik var1) {
		var1.ax(this.ak_fld, this.ag_fld, 2143835883);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = xi.tx(var1, 441255255);
		boolean var10001;
		if (var1.cg() == 1) {
			if (var2 >= 1870278714) {
				return;
			}

			var10001 = true;
		} else {
			var10001 = false;
		}

		this.ag_fld = var10001;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = xi.tx(var1, 793358178);
		this.ag_fld = var1.cg() == 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = xi.tx(var1, 1363467378) * 645907934;
		this.ag_fld = var1.cg() == 1;
	}

	il(ia var1) {
		this.this$0 = var1;
		this.ak_fld = 1143813927;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = xi.tx(var1, 1663096047);
		this.ag_fld = var1.cg() == 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void ah(ik var1) {
		var1.ax(this.ak_fld, this.ag_fld, 927979575);
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(Ldr;)I"
	)
	public static int eh(dr var0) {
		return var0.ay_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	@Override
	void aw(ik var1) {
		var1.ax(this.ak_fld * 1067835144, this.ag_fld, 1164257457);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	@Override
	void ag(ik var1, int var2) {
		var1.ax(this.ak_fld, this.ag_fld, 2074424384);
	}
}
