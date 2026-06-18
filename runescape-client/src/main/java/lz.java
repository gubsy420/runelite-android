import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lz")
public class lz {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1334874899
	)
	static int am_fld;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ch_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ad_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)J"
	)
	public static final synchronized long ak() {
		long var1 = System.currentTimeMillis();
		if (var1 < jc.ak_fld) {
			yd.ag_fld = yd.ag_fld + (jc.ak_fld - var1) * 4642038299483163615L;
		}

		jc.ak_fld = var1;
		return var1 + yd.ag_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int at(xi var0) {
		return 128 - var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] & 0xFF;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lwl;"
	)
	static wl ah() {
		return ca.px_fld;
	}

	lz() throws Throwable {
		throw new Error();
	}
}
