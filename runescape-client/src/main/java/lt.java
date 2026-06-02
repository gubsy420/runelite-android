import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lt")
public class lt {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bi_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public static boolean ah(int var0, int var1) {
		return (var0 >> var1 & 1) != 0;
	}

	lt() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean ar(int var0) {
		return (var0 >> 23 & 1) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aw(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ay(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean as(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public static boolean ae(int var0, int var1) {
		return (var0 >> var1 & 1) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean af(int var0) {
		return (var0 >> 23 & 1) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Lsd;"
	)
	static sd[] ak() {
		return new sd[]{sd.ak_fld, sd.ag_fld, sd.az_fld, sd.av_fld, sd.ae_fld};
	}
}
