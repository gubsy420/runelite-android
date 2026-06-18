import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zw")
public class zw {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -664632441
	)
	int ak_fld;

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Lzw;B)I"
	)
	public static int je(zw var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak_fld;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return this.ak_fld;
	}

	@ObfuscatedName("xx")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void xx(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 228932457) * -661977895 - 1] = (byte)var1;
		var0.al_fld[(var0.au_fld += 1920715481) * -126086269 - 1] = (byte)(var1 >> 8);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ag() {
		return this.ak_fld;
	}

	zw(int var1, boolean var2) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int az() {
		return this.ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ak(byte var1) {
		return this.ak_fld;
	}
}
