import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ji")
public class ji {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int dt_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int as(int var0) {
		return var0 >> 14 & 1023;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I[I)I"
	)
	public static int gp(pb var0, int var1, int[] var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		ph var3 = lu.ag(var1, 1425659899);
		return var3.ah(var2[var3.av_fld], (byte)-24);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ae(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ah(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aw(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int bo(int var0) {
		return Math.min(Math.max(var0, ev.aw(client.dw_fld)), ev.ay(client.dw_fld));
	}

	ji() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ar(int var0) {
		return var0 >> 14 & 1023;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int af(int var0) {
		return var0 >> 14 & 1023;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int al(int var0) {
		return var0 >> 3 & 2047;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int au(int var0) {
		return var0 >> 3 & 2047;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ax(int var0) {
		return var0 >> 1 & 3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ay(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)J"
	)
	public static long af(int var0, int var1) {
		if (var0 > 63) {
			throw new pz(
				"Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d",
				(Object[])(new Object[]{var0})
			);
		} else {
			return (long)Math.pow(2.0, var0) - 1L;
		}
	}
}
