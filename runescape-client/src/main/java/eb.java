import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("eb")
public class eb extends rz {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bk_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;

	@ObfuscatedName("zi")
	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	public static void zi(fo var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ao_fld = var0.ac_fld / 2;
			var0.br_fld = var0.at_fld / 2;
			var0.ab_fld = -var0.ao_fld;
			var0.al_fld = var0.ac_fld - var0.ao_fld;
			var0.be_fld = -var0.br_fld;
			var0.am_fld = var0.at_fld - var0.br_fld;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ak(rr var1, rr var2) {
		if (var1.ae_fld != 0 && 0 != var2.ae_fld) {
			return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), 158513740) : var2.ap(-1939318074).av(var1.ap(-1939318074), 1738354569);
		} else {
			return this.as(var1, var2, 633526057);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljm;"
	)
	public static jm ag() {
		jm var1;
		if (jm.ae_fld == 0) {
			var1 = new jm();
		} else {
			var1 = jm.av_fld[(jm.ae_fld -= -586111491) * -245342379];
		}

		var1.ah_fld = null;
		var1.aw_fld = 0;
		var1.ay_fld = new xj(5000);
		return var1;
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	public eb(boolean var1) {
		this.ak_fld = var1;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (var1.ae_fld != 0 && 0 != var2.ae_fld) {
			return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), 1318979182) : var2.ap(-1939318074).av(var1.ap(-1939318074), -2048889283);
		} else {
			return this.as(var1, var2, 1163887798);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int cn(int var0, ba var1, boolean var2) {
		if (var0 == 13337) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bp.ao_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsl;ILsl;II)V"
	)
	static void aj(sl var0, int var1, sl var2, int var3, int var4) {
		if (var0.ag_fld == yq.ak_fld) {
			System.arraycopy(var0.aw_fld, var1, var2.aw_fld, var3, var4);
		} else if (yq.ag_fld == var0.ag_fld) {
			System.arraycopy(var0.ay_fld, var1, var2.ay_fld, var3, var4);
		} else {
			System.arraycopy((Object)var0.as_fld, var1, (Object)var2.as_fld, var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void as() {
		synchronized (uw.ag_fld) {
			if (0 != uw.ah_fld) {
				uw.ah_fld = 811930207;

				try {
					uw.ag_fld.wait();
				} catch (InterruptedException var6) {
				}
			}
		}

		synchronized (uw.ak_fld) {
			uw.ak_fld.ag();
			uw.ae_fld.ag();
		}
	}
}
