import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gw")
public class gw {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String al_fld;
	@ObfuscatedGetter(
		intValue = 403560097
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -1352122419
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	hb av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ak_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static ib bs_fld;

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	public static int bj(zg var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.at_fld;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void aw() {
		ba.ak_fld.vh();
	}

	gw(String var1, int var2, int var3, hb var4) {
		this.ak_fld = var1;
		this.az_fld = var2;
		this.ag_fld = var3;
		this.av_fld = var4;
	}
}
