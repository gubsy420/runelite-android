import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rf")
public interface rf {
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "(Lnb;)I"
	)
	static int vz(nb var0) {
		return var0.ak_fld & 7;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(B)Laax;"
	)
	aax jn(byte var1);

	@ObfuscatedName("afd")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	aax afd();

	@ObfuscatedName("afy")
	@ObfuscatedSignature(
		descriptor = "()Laax;"
	)
	aax afy();
}
