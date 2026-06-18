import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ic")
public class ic extends ho {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	hm this$0;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bp_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1754788897
	)
	int ak_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.cm();
		var1.cg();
		if (var1.cg() != 609791365) {
			var1.au_fld -= -1301696665;
			var1.cu();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V"
	)
	@Override
	void ag(ib var1, byte var2) {
		var1.az(this.ak_fld, -2137836981);
	}

	ic(hm var1) {
		this.this$0 = var1;
		this.ak_fld = -1318359009;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.cm();
		var1.cg();
		if (var1.cg() != 255) {
			var1.au_fld--;
			var1.cu();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.cm();
		var1.cg();
		if (var1.cg() != 255) {
			var1.au_fld--;
			var1.cu();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.cm() * 1952510641;
		var1.cg();
		if (var1.cg() != 1648679957) {
			var1.au_fld -= 355395575;
			var1.cu();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ah(ib var1) {
		var1.az(this.ak_fld * 1451797213, -2129628985);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void aw(ib var1) {
		var1.az(this.ak_fld * 1974361991, -2136914290);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ay(ib var1) {
		var1.az(this.ak_fld * 1901455139, -2128602860);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B"
	)
	public static byte[] ak(int var0, boolean var1) {
		synchronized (zi.ae_fld) {
			if ((var0 == 100 || var0 < 100 && var1) && zi.ah_fld > 0) {
				byte[] var12 = zi.ax_fld[(zi.ah_fld -= -682137057) * 241275359];
				zi.ax_fld[zi.ah_fld] = null;
				return var12;
			}

			if ((5000 == var0 || var0 < 5000 && var1) && zi.aw_fld > 0) {
				byte[] var11 = zi.an_fld[(zi.aw_fld -= -1402984011) * 1245723805];
				zi.an_fld[zi.aw_fld] = null;
				return var11;
			}

			if ((10000 == var0 || var0 < 10000 && var1) && zi.ay_fld > 0) {
				byte[] var10 = zi.aa_fld[(zi.ay_fld -= 203987159) * -1700668697];
				zi.aa_fld[zi.ay_fld] = null;
				return var10;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && zi.as_fld > 0) {
				byte[] var9 = zi.ai_fld[(zi.as_fld -= -145169513) * -741356505];
				zi.ai_fld[zi.as_fld] = null;
				return var9;
			}

			if (null != co.ad_fld) {
				for (int var4 = 0; var4 < ay.aq_fld.length; var4++) {
					if ((ay.aq_fld[var4] == var0 || var0 < ay.aq_fld[var4] && var1) && zi.am_fld[var4] > 0) {
						byte[] var5 = co.ad_fld[var4][--zi.am_fld[var4]];
						co.ad_fld[var4][zi.am_fld[var4]] = null;
						return var5;
					}
				}
			}

			if (var1 && null != ay.aq_fld) {
				for (int var8 = 0; var8 < ay.aq_fld.length; var8++) {
					if (var0 <= ay.aq_fld[var8] && zi.am_fld[var8] < co.ad_fld[var8].length) {
						return new byte[ay.aq_fld[var8]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
