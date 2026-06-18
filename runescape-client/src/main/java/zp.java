import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zp")
public class zp {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2024908617
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lzp;"
	)
	static zp ag_fld = new zp(3);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lzp;"
	)
	static zp ak_fld = new zp(1);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;

	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "(Lib;)I"
	)
	public static int xb(ib var0) {
		return var0.ak_fld.size();
	}

	zp(int var1) {
		this.az_fld = var1;
	}
}
