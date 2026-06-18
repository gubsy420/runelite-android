import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tk")
public class tk extends td {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ag(xi var1, int var2) {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	@Override
	void ak(xi var1, int var2, byte var3) {
	}

	public tk(int var1) {
		super(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void av(xi var1, int var2) {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void az(xi var1, int var2) {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F"
	)
	static float ag(float[] var0, int var1, float var2) {
		float var4 = var0[var1];

		for (int var5 = var1 - 1; var5 >= 0; var5--) {
			var4 = var0[var5] + var2 * var4;
		}

		return var4;
	}
}
