import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ed")
public class ed extends rz {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ar_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub av_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ad_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ak(rr var1, rr var2) {
		if (var1.ae_fld == client.ch_fld) {
			if (client.ch_fld != var2.ae_fld) {
				return this.ak_fld ? -1 : 1;
			}
		} else if (var2.ae_fld == client.ch_fld) {
			return this.ak_fld ? 1 : -1;
		}

		return this.as(var1, var2, 736258687);
	}

	public ed(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int av(rr var1, rr var2) {
		if (var1.ae_fld == client.ch_fld) {
			if (client.ch_fld != var2.ae_fld) {
				return this.ak_fld ? -1 : 1;
			}
		} else if (var2.ae_fld == client.ch_fld) {
			return this.ak_fld ? 1 : -1;
		}

		return this.as(var1, var2, 845113775);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (var1.ae_fld == client.ch_fld) {
			if (client.ch_fld != var2.ae_fld) {
				return this.ak_fld ? -1 : 1;
			}
		} else if (var2.ae_fld == client.ch_fld) {
			return this.ak_fld ? 1 : -1;
		}

		return this.as(var1, var2, 815365158);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int az(rr var1, rr var2) {
		if (var1.ae_fld == client.ch_fld) {
			if (client.ch_fld != var2.ae_fld) {
				return this.ak_fld ? -1 : 1;
			}
		} else if (var2.ae_fld == client.ch_fld) {
			return this.ak_fld ? 1 : -1;
		}

		return this.as(var1, var2, 1583905169);
	}
}
