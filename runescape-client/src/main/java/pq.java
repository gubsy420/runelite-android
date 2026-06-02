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
	@ObfuscatedGetter(
		intValue = -1715128639
	)
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "I"
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
		descriptor = "(Lxi;I)V"
	)
	void az(xi var1, int var2) {
		if (2 == var2) {
			this.az_fld = true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ag(xi var1) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void af(xi var1, int var2) {
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

	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)Z"
	)
	public static boolean ru(wl var0) {
		return !var0.cy_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ay(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (var2 == 0) {
				return;
			}

			this.az(var1, var2);
		}
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void al(xi var1, int var2) {
		if (2 == var2) {
			this.az_fld = true;
		}
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

	public pq() {
	}
}
