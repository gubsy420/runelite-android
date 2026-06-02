import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ep")
public class ep extends rz {
	@ObfuscatedGetter(
		intValue = 780228781
	)
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ex_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub ao_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int av(rr var1, rr var2) {
		if (var1.ae_fld != 0 && -1021288421 * var2.ae_fld != 0) {
			return this.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
		} else {
			return this.as(var1, var2, 1392911402);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ak(rr var1, rr var2) {
		if (var1.ae_fld != 0 && var2.ae_fld != 0) {
			return this.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
		} else {
			return this.as(var1, var2, 1467583490);
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lep;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int io(ep var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int az(rr var1, rr var2) {
		if (var1.ae_fld != 0 && var2.ae_fld != 0) {
			return this.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
		} else {
			return this.as(var1, var2, 1010372860);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (var1.ae_fld != 0 && var2.ae_fld != 0) {
			return this.ak_fld ? var1.ah_fld - var2.ah_fld : var2.ah_fld - var1.ah_fld;
		} else {
			return this.as(var1, var2, 1676713544);
		}
	}

	public ep(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}
}
