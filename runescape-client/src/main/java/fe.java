import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fe")
public class fe extends vc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Leq;"
	)
	eq[] ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -365804263
	)
	static int bg_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bl_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CIB)Ljava/lang/String;"
	)
	public static String aa(char var0, int var1) {
		char[] var3 = new char[var1];

		for (int var4 = 0; var4 < var1; var4++) {
			var3[var4] = var0;
		}

		return new String(var3);
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean pu(int var1) {
		return this.ag(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ag(int var1) {
		return this.ak_fld[var1].af_fld;
	}

	fe(ub var1, ub var2, int var3) throws EOFException {
		int var4 = var1.ce(var3, -532144643);
		this.ak_fld = new eq[var4];
		ea var5 = null;
		int[] var6 = var1.cp(var3, (byte)50);

		for (int var7 = 0; var7 < var6.length; var7++) {
			byte[] var8 = var1.bb(var3, var6[var7], 584982574);
			if (null == var5) {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10 = var2.cx(var9, 0, -1209533637);
				var5 = new ea(var9, var10);
			}

			this.ak_fld[var6[var7]] = new eq(var8, var5);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean av(int var1) {
		return this.ak_fld[var1].af_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean az(int var1) {
		return this.ak_fld[var1].af_fld;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Lfe;"
	)
	public static fe ci(int var0) throws EOFException {
		try {
			return gz.ag(var0);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean aw() {
		return !mb.ay_fld.isEmpty();
	}
}
