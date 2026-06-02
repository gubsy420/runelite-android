import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hv")
public class hv {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	public kj az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	public kj ag_fld;
	@ObfuscatedGetter(
		intValue = -1407372575
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ai_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bj_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	static final int ag(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	public hv(int var1, kj var2, kj var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}
}
