import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yd")
public class yd {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	static ct[] ae_fld;
	@ObfuscatedGetter(
		longValue = 1607003436380827679L
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	static long ag_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ak(int var1) {
		int var3 = (this.ak_fld.length >> 1) - 1;
		int var4 = var1 & var3;

		while (true) {
			int var5 = this.ak_fld[1 + var4 + var4];
			if (var5 == -1) {
				return -1;
			}

			if (this.ak_fld[var4 + var4] == var1) {
				return var5;
			}

			var4 = 1 + var4 & var3;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int az(int var1) {
		int var2 = (this.ak_fld.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			int var4 = this.ak_fld[1 + var3 + var3];
			if (var4 == -1) {
				return -1;
			}

			if (this.ak_fld[var3 + var3] == var1) {
				return var4;
			}

			var3 = 1 + var3 & var2;
		}
	}

	public yd(int[] var1) {
		byte var2 = 1;

		while (var2 <= (var1.length >> 1) + var1.length) {
			var2 <<= 1;
		}

		this.ak_fld = new int[var2 + var2];

		for (int var3 = 0; var3 < var2 + var2; var3++) {
			this.ak_fld[var3] = -1;
		}

		int var5 = 0;

		while (var5 < var1.length) {
			int var4 = var1[var5] & var2 - 1;

			while (this.ak_fld[1 + var4 + var4] != -1) {
				var4 = var4 + 1 & var2 - 1;
			}

			this.ak_fld[var4 + var4] = var1[var5];
			this.ak_fld[var4 + var4 + 1] = var5++;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IILuo;II)V"
	)
	public static void cx(gc var0, int var1, int var2, uo var3, int var4, int var5) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var3.aa_fld != -1) {
				var0.af(var3.aa_fld, var3, var5, (byte)-72);
				gc.aj(var0, var3.aa_fld, 0, 0, var1, var2, 0, 0, var3, var4, 145878348);
			}
		}
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "(Lyd;I)I"
	)
	public static int ym(yd var0, int var1) {
		int var2 = (var0.ak_fld.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			int var4 = var0.ak_fld[1 + var3 + var3];
			if (var4 == -1) {
				return -1;
			}

			if (var0.ak_fld[var3 + var3] == var1) {
				return var4;
			}

			var3 = 1 + var3 & var2;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		int var2 = (this.ak_fld.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			int var4 = this.ak_fld[1 + var3 + var3];
			if (var4 == -1) {
				return -1;
			}

			if (this.ak_fld[var3 + var3] == var1) {
				return var4;
			}

			var3 = 1 + var3 & var2;
		}
	}
}
