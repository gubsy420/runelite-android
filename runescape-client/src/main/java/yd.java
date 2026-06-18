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
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 1607003436380827679L
	)
	static long ag_fld;

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Lyd;II)I"
	)
	public static int fx(yd var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var3 = (var0.ak_fld.length >> 1) - 1;
			int var4 = var1 & var3;

			while (true) {
				int var5 = var0.ak_fld[1 + var4 + var4];
				if (var5 == -1) {
					return -1;
				}

				if (var0.ak_fld[var4 + var4] == var1) {
					return var5;
				}

				var4 = 1 + var4 & var3;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av(int var1) {
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

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Ljava/lang/String;)V"
	)
	public static void th(qt var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null && !var1.isEmpty()) {
			var0.av_fld.remove(var1);
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ak(int var1, int var2) {
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
}
