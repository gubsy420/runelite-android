import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mi")
public class mi {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] ag_fld;
	@ObfuscatedGetter(
		intValue = -458101421
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 1353180181
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] ak_fld;
	@ObfuscatedGetter(
		intValue = 890864099
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = 1647208477
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = 1323575557
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = 365169873
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -682809745
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lno;)I"
	)
	public static int bc(no var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int var1 = 0;

		for (vw var2 = var0.ak_fld.hg_vw; var2 != var0.ak_fld; var2 = var2.hg_vw) {
			var1++;
		}

		return var1;
	}

	mi() {
	}
}
