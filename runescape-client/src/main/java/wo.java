import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wo")
public class wo {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv iq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	static byte[] ak_fld = new byte[]{
		0,
		0,
		0,
		-20,
		-15,
		-10,
		15,
		-10,
		15,
		10,
		0,
		20,
		-15,
		10,
		-30,
		-10,
		-15,
		-30,
		0,
		-40,
		15,
		-30,
		30,
		-10,
		30,
		10,
		15,
		30,
		0,
		40,
		-15,
		30,
		-30,
		10,
		-45,
		-10,
		-30,
		-30,
		-15,
		-50,
		0,
		-60,
		15,
		-50,
		30,
		-30,
		45,
		-10,
		45,
		10,
		30,
		30,
		15,
		50,
		0,
		60,
		-15,
		50,
		-30,
		30,
		-45,
		10,
		-60,
		-10,
		-45,
		-30,
		-30,
		-50,
		-15,
		-70,
		0,
		-80,
		15,
		-70,
		30,
		-50,
		45,
		-30,
		60,
		-10,
		60,
		10,
		45,
		30,
		30,
		50,
		15,
		70,
		0,
		80,
		-15,
		70,
		-30,
		50,
		-45,
		30,
		-60,
		10,
		-75,
		-10,
		-60,
		-30,
		-45,
		-50,
		-30,
		-70,
		-15,
		-90,
		0,
		-100,
		15,
		-90,
		30,
		-70,
		45,
		-50,
		60,
		-30,
		75,
		-10,
		75,
		10,
		60,
		30,
		45,
		50,
		30,
		70,
		15,
		90,
		0,
		100,
		-15,
		90,
		-30,
		70,
		-45,
		50,
		-60,
		30,
		-75,
		10,
		-90,
		-10,
		-75,
		-30,
		-60,
		-50,
		-45,
		-70,
		-30,
		-90,
		-15,
		-110,
		0,
		120,
		15,
		-110,
		30,
		-90,
		45,
		-70,
		60,
		-50,
		75,
		-30,
		90,
		-10,
		90,
		10,
		75,
		30,
		60,
		50,
		45,
		70,
		30,
		90,
		15,
		110,
		0,
		120,
		-15,
		110,
		-30,
		90,
		-45,
		70,
		-60,
		50,
		-75,
		30,
		-90,
		10,
		-105,
		-10,
		-90,
		-30,
		-75,
		-50
	};

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int az(int var0) {
		return ak_fld[var0 << 1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int av(int var0) {
		return ak_fld[var0 << 1];
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIB)Z"
	)
	static boolean dz(dx var0, int var1, int var2, int var3) {
		return var1 < 3 && 2 == (var0.al_fld[1][var2][var3] & 2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ae(int var0) {
		return ak_fld[var0 << 1 | 1];
	}

	wo() throws Throwable {
		throw new Error();
	}
}
