import java.util.BitSet;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mc")
public class mc extends vw {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub at_fld;
	@ObfuscatedGetter(
		intValue = 1029185117
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/BitSet;"
	)
	BitSet ak_fld;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static final int ab(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		return var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lek;)[Lsi;"
	)
	public static si[] kt(ek var0) {
		return var0.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)[I"
	)
	static int[] ak(int var0, int var1, int var2, int var3, int var4) {
		int[] var6 = new int[256];

		for (int var7 = 0; var7 < 64; var7++) {
			var6[var7] = xy.ag(var0, var1, var7);
		}

		for (int var8 = 0; var8 < 64; var8++) {
			var6[64 + var8] = xy.ag(var1, var2, var8);
		}

		for (int var9 = 0; var9 < 64; var9++) {
			var6[128 + var9] = xy.ag(var2, var3, var9);
		}

		for (int var10 = 0; var10 < 64; var10++) {
			var6[var10 + 192] = xy.ag(var3, var4, var10);
		}

		return var6;
	}

	mc(int var1) {
		this.ag_fld = var1;
		this.ak_fld = new BitSet(128);
	}
}
