import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gj")
public class gj {
	@ObfuscatedGetter(
		intValue = -366700813
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bj_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ak_fld;
	@ObfuscatedGetter(
		intValue = -82916989
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = -1105208983
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ag_fld;

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	int[] bx() {
		return this.az_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ai() {
		return this.ah_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av() {
		return this.aw_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ae() {
		return this.ak_fld.length;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ah() {
		return this.ak_fld[0].length;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	int[][] aw() {
		return this.ak_fld;
	}

	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "(Lgj;)[I"
	)
	public static int[] uy(gj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int at() {
		return this.ak_fld.length;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	int[] ar() {
		return this.av_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	int[] bl() {
		return this.az_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	int[][] br() {
		return this.ak_fld;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)I"
	)
	public static int iq(gj var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ae_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void al() {
		for (int var1 = 0; var1 < this.ak_fld.length; var1++) {
			for (int var2 = 0; var2 < this.ak_fld[var1].length; var2++) {
				this.ak_fld[var1][var2] = 0;
				this.ag_fld[var1][var2] = 99999999;
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	int[][] be() {
		return this.ak_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void an(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = 648532805 * var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aa(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = 487007836 * var2;
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V"
	)
	public static void wk(gj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var2 = 0; var2 < var0.ak_fld.length; var2++) {
			for (int var3 = 0; var3 < var0.ak_fld[var2].length; var3++) {
				var0.ak_fld[var2][var3] = 0;
				var0.ag_fld[var2][var3] = 99999999;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aq() {
		return this.ah_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int am() {
		return this.ah_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bv() {
		return this.ae_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aj() {
		return this.ak_fld.length;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ap() {
		return this.ak_fld.length;
	}

	gj(int var1, int var2) {
		this.ak_fld = new int[var1][var2];
		this.ag_fld = new int[var1][var2];
		int var3 = var1 * var2;
		int var4 = wp.ay(var3 / 4);
		this.az_fld = new int[var4];
		this.av_fld = new int[var4];
		this.ae_fld = var4 - 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ac() {
		return this.ak_fld.length;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ax() {
		for (int var1 = 0; var1 < this.ak_fld.length; var1++) {
			for (int var2 = 0; var2 < this.ak_fld[var1].length; var2++) {
				this.ak_fld[var1][var2] = 0;
				this.ag_fld[var1][var2] = 944705022;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ad() {
		return this.aw_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bd() {
		return this.ak_fld[0].length;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bm() {
		return this.ak_fld[0].length;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bt() {
		return this.ae_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bu() {
		return this.ae_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	int[][] bs() {
		return this.ak_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	int[][] bh() {
		return this.ak_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	int[][] bj() {
		return this.ag_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	int[][] bf() {
		return this.ag_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	int[] by() {
		return this.az_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void au() {
		for (int var1 = 0; var1 < this.ak_fld.length; var1++) {
			for (int var2 = 0; var2 < this.ak_fld[var1].length; var2++) {
				this.ak_fld[var1][var2] = 0;
				this.ag_fld[var1][var2] = 1859315732;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[[I"
	)
	int[][] ay() {
		return this.ag_fld;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)I"
	)
	public static int nd(gj var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ah_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	int[] bo() {
		return this.av_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		return this.aw_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.aw_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int az(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		return (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;)V"
	)
	static void az(dx var0, int var1, int var2, int var3, kp var4) {
		for (int var6 = 0; var6 < var0.ah_fld; var6++) {
			for (int var7 = 0; var7 < var0.aw_fld; var7++) {
				na var8 = var0.aa_fld[var0.ae_fld][var6][var7];
				if (null != var8) {
					if (var0.ak(-787091592)) {
						int var9 = 2 + 4 * var6 - client.nw_fld / 32;
						int var10 = 2 + var7 * 4 - client.nd_fld / 32;
						ec.ah(var1, var2, var9, var10, var3, tf.al_Arryv[0], var4);
					} else {
						tu var14 = mf.bn(var0, kj.aw(var6), kj.aw(var7));
						int var15 = (int)var14.ay_fld;
						int var11 = (int)var14.ar_fld;
						var14.ah();
						int var12 = var15 / 32 - client.nw_fld / 32;
						int var13 = var11 / 32 - client.nd_fld / 32;
						ec.ah(var1, var2, var12, var13, var3, tf.al_Arryv[0], var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ae(int var0, int var1) {
		int var3 = var1 - var0 & 2047;
		return var3 > 1024 ? -(2048 - var3) : var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgj;II)V"
	)
	public static void aj(gj var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = var1;
		var0.aw_fld = var2;
	}

	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)[I"
	)
	public static int[] sy(gj var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)J"
	)
	public static long aw(CharSequence var0) {
		boolean var4 = false;
		boolean var5 = false;
		long var6 = 0L;
		int var8 = var0.length();

		for (int var9 = 0; var9 < var8; var9++) {
			char var10 = var0.charAt(var9);
			if (var9 == 0) {
				if ('-' == var10) {
					var4 = true;
					continue;
				}

				if (var10 == '+') {
					continue;
				}
			}

			int var13;
			if (var10 >= '0' && var10 <= '9') {
				var13 = var10 - '0';
			} else if (var10 >= 'A' && var10 <= 'Z') {
				var13 = var10 - '7';
			} else {
				if (var10 < 'a' || var10 > 'z') {
					throw new NumberFormatException();
				}

				var13 = var10 - 'W';
			}

			if (var13 >= 10) {
				throw new NumberFormatException();
			}

			if (var4) {
				var13 = -var13;
			}

			long var11 = var6 * 10L + var13;
			if (var6 != var11 / 10L) {
				throw new NumberFormatException();
			}

			var6 = var11;
			var5 = true;
		}

		if (!var5) {
			throw new NumberFormatException();
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ag(int var1, int var2, int var3) {
		this.ah_fld = var1;
		this.ah_fld = 1163806425 * var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int az(byte var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	int[] as(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int af(byte var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak(int var1) {
		for (int var2 = 0; var2 < this.ak_fld.length; var2++) {
			for (int var3 = 0; var3 < this.ak_fld[var2].length; var3++) {
				this.ag_fld[var2][var3] = 0;
				this.ak_fld[var2][var3] = 99999999;
			}
		}
	}
}
