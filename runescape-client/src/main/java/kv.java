import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kv")
public class kv {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	public static boolean[] ag_fld = new boolean[]{
		true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false
	};
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] az_fld = new int[99];

	kv() throws Throwable {
		throw new Error();
	}

	static {
		int var0 = 0;

		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int)(var2 + 300.0 * Math.pow(2.0, var2 / 7.0));
			var0 += var3;
			az_fld[var1] = var0 / 4;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public static uy ak() {
		synchronized (uy.ag_fld) {
			if (0 == uy.av_fld) {
				return new uy();
			} else {
				uy.ag_fld[(uy.av_fld -= 1453506371) * 848250219].aw();
				return uy.ag_fld[uy.av_fld];
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int aq(int var0, int var1) {
		int var3 = cf.am(var0 - 1, var1 - 1) + cf.am(var0 + 1, var1 - 1) + cf.am(var0 - 1, 1 + var1) + cf.am(var0 + 1, var1 + 1);
		int var4 = cf.am(var0 - 1, var1) + cf.am(1 + var0, var1) + cf.am(var0, var1 - 1) + cf.am(var0, var1 + 1);
		int var5 = cf.am(var0, var1);
		return var5 / 4 + var4 / 8 + var3 / 16;
	}
}
