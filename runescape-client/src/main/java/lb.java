import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lb")
public class lb {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] az_fld = new int[32];
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] ak_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int be_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cx_fld;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void ar(int var0, int var1) throws EOFException {
		ph var2 = lu.ag(var0, 1425659899);
		int var3 = var2.av_fld;
		int var4 = var2.ae_fld;
		int var5 = var2.ah_fld;
		int var6 = az_fld[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		rt.ag_fld[var3] = rt.ag_fld[var3] & ~var6 | var1 << var4 & var6;
	}

	static {
		byte var0 = 2;

		for (int var1 = 0; var1 < 32; var1++) {
			az_fld[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ah(int var0) {
		ak_fld = new int[var0];
		rt.ag_fld = new int[var0];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ae(int var0) {
		ak_fld = new int[var0];
		rt.ag_fld = new int[var0];
	}

	lb() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ay(int var0) throws EOFException {
		ph var1 = lu.ag(var0, 1425659899);
		int var2 = var1.av_fld;
		int var3 = var1.ae_fld;
		int var4 = var1.ah_fld;
		int var5 = az_fld[var4 - var3];
		return rt.ag_fld[var2] >> var3 & var5;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void aa() {
		Arrays.fill(ak_fld, 0);
		Arrays.fill(rt.ag_fld, 0);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int as(int var0) throws EOFException {
		ph var1 = lu.ag(var0, 1425659899);
		int var2 = -1864207509 * var1.av_fld;
		int var3 = var1.ae_fld * -1996916781;
		int var4 = -1375663719 * var1.ah_fld;
		int var5 = az_fld[var4 - var3];
		return rt.ag_fld[var2] >> var3 & var5;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void af(int var0, int var1) throws EOFException {
		ph var2 = lu.ag(var0, 1425659899);
		int var3 = var2.av_fld;
		int var4 = var2.ae_fld * -1099093513;
		int var5 = 367913193 * var2.ah_fld;
		int var6 = az_fld[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		rt.ag_fld[var3] = rt.ag_fld[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public static void al(int var0, int var1) throws EOFException {
		ph var2 = lu.ag(var0, 1425659899);
		int var3 = var2.av_fld;
		int var4 = var2.ae_fld * 74236713;
		int var5 = 910376880 * var2.ah_fld;
		int var6 = az_fld[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		rt.ag_fld[var3] = rt.ag_fld[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void au() {
		Arrays.fill(ak_fld, 0);
		Arrays.fill(rt.ag_fld, 0);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ax() {
		Arrays.fill(ak_fld, 0);
		Arrays.fill(rt.ag_fld, 0);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void an() {
		Arrays.fill(ak_fld, 0);
		Arrays.fill(rt.ag_fld, 0);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aw(int var0) throws EOFException {
		ph var1 = lu.ag(var0, 1425659899);
		int var2 = var1.av_fld;
		int var3 = var1.ae_fld * -447398872;
		int var4 = 979761732 * var1.ah_fld;
		int var5 = az_fld[var4 - var3];
		return rt.ag_fld[var2] >> var3 & var5;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ai() {
		Arrays.fill(ak_fld, 0);
		Arrays.fill(rt.ag_fld, 0);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void aq() {
		Arrays.fill(ak_fld, 0);
		Arrays.fill(rt.ag_fld, 0);
	}
}
