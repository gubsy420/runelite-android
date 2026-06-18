import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pq")
public class pq extends vc {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ag_fld = new iw(64);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean az_fld = false;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ak_fld;
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1715128639
	)
	static int oo_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ah(ub var0) {
		ak_fld = var0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void as(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.az(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	void az(xi var1, int var2) {
		if (2 == var2) {
			this.az_fld = true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ag(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			this.az(var1, var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void av(ub var0) {
		ak_fld = var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ae(ub var0) {
		ak_fld = var0;
	}

	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)Lcv;"
	)
	public static cv vt(dx var0, int var1) {
		return (cv)(cv)var0.au_fld.ae(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void au(xi var1, int var2) {
		if (2 == var2) {
			this.az_fld = true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void aw(ub var0) {
		ak_fld = var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ar(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.az(var1, var2);
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lxi;)V"
	)
	public static void ez(pq var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			var0.az(var1, var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void af(xi var1, int var2) {
		if (2 == var2) {
			this.az_fld = true;
		}
	}

	public pq() {
	}
}
