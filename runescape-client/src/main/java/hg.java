import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hg")
public class hg {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bn_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static dx dx_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedGetter(
		intValue = -603983145
	)
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedGetter(
		intValue = -2045274159
	)
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bv_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bo_fld;
	@ObfuscatedGetter(
		intValue = 205903255
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[[B"
	)
	byte[][][] ag_fld;

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public static void cu(hg var0) {
		if (var0.ag_fld == null) {
			var0.ag_fld = new byte[8][4][];
			var0.ae((short)20639);
			var0.ah(1030548390);
			lt(var0, -907171554);
			var0.as((byte)20);
			var0.ay((byte)-22);
			var0.ar(-2137386409);
			var0.af(-1106572357);
			var0.al(195029822);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bi() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		boolean var2 = false;
		var1 = new byte[this.ak_fld * this.ak_fld];
		int var9 = 0;

		for (int var3 = 0; var3 < this.ak_fld; var3++) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 >= var3 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[7][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 >= var13 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[7][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 >= var14 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[7][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var15 = 0; var15 < this.ak_fld; var15++) {
			for (int var18 = this.ak_fld - 1; var18 >= 0; var18--) {
				if (var18 >= var15 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[7][3] = var1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bv() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		boolean var2 = false;
		var1 = new byte[this.ak_fld * this.ak_fld];
		int var9 = 0;

		for (int var3 = 0; var3 < this.ak_fld; var3++) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 >= var3 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[7][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 >= var13 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[7][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 >= var14 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[7][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var15 = 0; var15 < this.ak_fld; var15++) {
			for (int var18 = this.ak_fld - 1; var18 >= 0; var18--) {
				if (var18 >= var15 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[7][3] = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) {
		byte[] var2 = new byte[this.ak_fld * this.ak_fld];
		boolean var3 = false;
		var2 = new byte[this.ak_fld * this.ak_fld];
		int var10 = 0;

		for (int var4 = 0; var4 < this.ak_fld; var4++) {
			for (int var5 = 0; var5 < this.ak_fld; var5++) {
				if (var1 >= 1083632932) {
					return;
				}

				if (var5 <= var4 - this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[6][0] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			if (var1 >= 1083632932) {
				return;
			}

			for (int var17 = 0; var17 < this.ak_fld; var17++) {
				if (var17 <= var14 - this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[6][1] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var15 = this.ak_fld - 1; var15 >= 0; var15--) {
			for (int var18 = this.ak_fld - 1; var18 >= 0; var18--) {
				if (var18 <= var15 - this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[6][2] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var16 = 0; var16 < this.ak_fld; var16++) {
			for (int var19 = this.ak_fld - 1; var19 >= 0; var19--) {
				if (var19 <= var16 - this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[6][3] = var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ar(int var1) {
		byte[] var2 = new byte[this.ak_fld * this.ak_fld];
		boolean var3 = false;
		var2 = new byte[this.ak_fld * this.ak_fld];
		int var10 = 0;

		for (int var4 = 0; var4 < this.ak_fld; var4++) {
			for (int var5 = 0; var5 < this.ak_fld; var5++) {
				if (var5 <= this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[5][0] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var14 = 0; var14 < this.ak_fld; var14++) {
			if (var1 >= -2126401672) {
				return;
			}

			for (int var17 = 0; var17 < this.ak_fld; var17++) {
				if (var14 <= this.ak_fld / 2) {
					if (var1 >= -2126401672) {
						return;
					}

					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[5][1] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var15 = 0; var15 < this.ak_fld; var15++) {
			for (int var18 = 0; var18 < this.ak_fld; var18++) {
				if (var18 >= this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[5][2] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var16 = 0; var16 < this.ak_fld; var16++) {
			for (int var19 = 0; var19 < this.ak_fld; var19++) {
				if (var16 >= this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[5][3] = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void at(int var0) {
		jz.ac(24);
		cl.ad(kh.jh_fld, kh.jq_fld, kh.jp_fld);
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V"
	)
	public static void lt(hg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		byte[] var2 = new byte[var0.ak_fld * var0.ak_fld];
		int var3 = 0;

		for (int var4 = var0.ak_fld - 1; var4 >= 0; var4--) {
			for (int var5 = var0.ak_fld - 1; var5 >= 0; var5--) {
				if (var1 >= -582610164) {
					return;
				}

				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		var0.ag_fld[2][0] = var2;
		var2 = new byte[var0.ak_fld * var0.ak_fld];
		var3 = 0;

		for (int var12 = var0.ak_fld - 1; var12 >= 0; var12--) {
			for (int var15 = 0; var15 < var0.ak_fld; var15++) {
				if (var15 >= var12 << 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		var0.ag_fld[2][1] = var2;
		var2 = new byte[var0.ak_fld * var0.ak_fld];
		var3 = 0;

		for (int var13 = 0; var13 < var0.ak_fld; var13++) {
			for (int var16 = 0; var16 < var0.ak_fld; var16++) {
				if (var16 <= var13 >> 1) {
					if (var1 >= -582610164) {
						return;
					}

					var2[var3] = -1;
				}

				var3++;
			}
		}

		var0.ag_fld[2][2] = var2;
		var2 = new byte[var0.ak_fld * var0.ak_fld];
		var3 = 0;

		for (int var14 = 0; var14 < var0.ak_fld; var14++) {
			if (var1 >= -582610164) {
				return;
			}

			for (int var17 = var0.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 >= var14 << 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		var0.ag_fld[2][3] = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void as(byte var1) {
		byte[] var2 = new byte[this.ak_fld * this.ak_fld];
		int var3 = 0;

		for (int var4 = this.ak_fld - 1; var4 >= 0; var4--) {
			for (int var5 = 0; var5 < this.ak_fld; var5++) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[3][0] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var15 <= var12 << 1) {
					if (var1 <= 0) {
						return;
					}

					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[3][1] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var13 = 0; var13 < this.ak_fld; var13++) {
			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 >= var13 >> 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[3][2] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 <= var14 << 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[3][3] = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	void au(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (0 != var7 && 0 != this.ak_fld && null != this.ag_fld) {
			var8 = pl(this, var8, var7, (byte)-45);
			var7 = this.az(var7);
			yu.eb(var1, var2, var5, var6, var3, var4, this.ag_fld[var7 - 1][var8], -133216427 * this.ak_fld);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int az(int var1) {
		if (var1 == 9 || 10 == var1) {
			return 1;
		} else {
			return 11 == var1 ? 8 : var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void al(int var1) {
		byte[] var2 = new byte[this.ak_fld * this.ak_fld];
		boolean var3 = false;
		var2 = new byte[this.ak_fld * this.ak_fld];
		int var10 = 0;

		for (int var4 = 0; var4 < this.ak_fld; var4++) {
			if (var1 == 2049336674) {
				return;
			}

			for (int var5 = 0; var5 < this.ak_fld; var5++) {
				if (var5 >= var4 - this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[7][0] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = 0; var17 < this.ak_fld; var17++) {
				if (var1 == 2049336674) {
					return;
				}

				if (var17 >= var14 - this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[7][1] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var15 = this.ak_fld - 1; var15 >= 0; var15--) {
			if (var1 == 2049336674) {
				return;
			}

			for (int var18 = this.ak_fld - 1; var18 >= 0; var18--) {
				if (var18 >= var15 - this.ak_fld / 2) {
					if (var1 == 2049336674) {
						return;
					}

					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[7][2] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var10 = 0;

		for (int var16 = 0; var16 < this.ak_fld; var16++) {
			for (int var19 = this.ak_fld - 1; var19 >= 0; var19--) {
				if (var1 == 2049336674) {
					return;
				}

				if (var19 >= var16 - this.ak_fld / 2) {
					var2[var10] = -1;
				}

				var10++;
			}
		}

		this.ag_fld[7][3] = var2;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bs() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = this.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = 0; var11 < this.ak_fld; var11++) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var14 <= var11 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = this.ak_fld - 1; var15 >= 0; var15--) {
				if (var15 >= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 <= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][3] = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	void an(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (0 != var7 && 0 != this.ak_fld && null != this.ag_fld) {
			var8 = pl(this, var8, var7, (byte)-72);
			var7 = this.az(var7);
			yu.eb(var1, var2, var5, var6, var3, var4, this.ag_fld[var7 - 1][var8], 1620514599 * this.ak_fld);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ah(int var1) {
		byte[] var2 = new byte[this.ak_fld * this.ak_fld];
		int var3 = 0;

		for (int var4 = this.ak_fld - 1; var4 >= 0; var4--) {
			for (int var5 = 0; var5 < this.ak_fld; var5++) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[1][0] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var3 >= 0 && var3 < var2.length) {
					if (var15 >= var12 << 1) {
						var2[var3] = -1;
					}

					var3++;
				} else {
					var3++;
				}
			}
		}

		this.ag_fld[1][1] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var13 = 0; var13 < this.ak_fld; var13++) {
			if (var1 == 385699803) {
				return;
			}

			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var1 == 385699803) {
					return;
				}

				if (var16 <= var13 >> 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[1][2] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 >= var14 << 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[1][3] = var2;
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IIB)I"
	)
	public static int pl(hg var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (9 == var2) {
				var1 = var1 + 1 & 3;
			}

			if (var2 == 10) {
				var1 = 3 + var1 & 3;
			}

			if (11 == var2) {
				var1 = 3 + var1 & 3;
			}

			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ay(byte var1) {
		byte[] var2 = new byte[this.ak_fld * this.ak_fld];
		int var3 = 0;

		for (int var4 = this.ak_fld - 1; var4 >= 0; var4--) {
			if (var1 >= -1) {
				return;
			}

			for (int var5 = this.ak_fld - 1; var5 >= 0; var5--) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[4][0] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var12 = this.ak_fld - 1; var12 >= 0; var12--) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var15 <= var12 << 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[4][1] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var13 = 0; var13 < this.ak_fld; var13++) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 >= var13 >> 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[4][2] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var14 = 0; var14 < this.ak_fld; var14++) {
			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 <= var14 << 1) {
					if (var1 >= -1) {
						return;
					}

					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[4][3] = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int am(int var1, int var2) {
		if (9 == var2) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = 3 + var1 & 3;
		}

		if (11 == var2) {
			var1 = 3 + var1 & 3;
		}

		return var1;
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public static void nk(hg var0) {
		byte[] var1 = new byte[var0.ak_fld * var0.ak_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < var0.ak_fld; var3++) {
			for (int var4 = 0; var4 < var0.ak_fld; var4++) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[0][0] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var11 = var0.ak_fld - 1; var11 >= 0; var11--) {
			for (int var14 = 0; var14 < var0.ak_fld; var14++) {
				if (var14 <= var11) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[0][1] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < var0.ak_fld; var12++) {
			for (int var15 = 0; var15 < var0.ak_fld; var15++) {
				if (var15 >= var12) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[0][2] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var13 = var0.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < var0.ak_fld; var16++) {
				if (var16 >= var13) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[0][3] = var1;
	}

	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public static void wh(hg var0) {
		byte[] var1 = new byte[var0.ak_fld * var0.ak_fld];
		int var2 = 0;

		for (int var3 = var0.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = var0.ak_fld - 1; var4 >= 0; var4--) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[4][0] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var11 = var0.ak_fld - 1; var11 >= 0; var11--) {
			for (int var14 = 0; var14 < var0.ak_fld; var14++) {
				if (var14 <= var11 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[4][1] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < var0.ak_fld; var12++) {
			for (int var15 = 0; var15 < var0.ak_fld; var15++) {
				if (var15 >= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[4][2] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var13 = 0; var13 < var0.ak_fld; var13++) {
			for (int var16 = var0.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 <= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[4][3] = var1;
	}

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "(Lhg;II)I"
	)
	public static int tb(hg var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (9 == var2) {
				var1 = var1 + 1 & 3;
			}

			if (var2 == 10) {
				var1 = 3 + var1 & 3;
			}

			if (11 == var2) {
				var1 = 3 + var1 & 3;
			}

			return var1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ad(int var1) {
		if (var1 == 9 || 10 == var1) {
			return 1;
		} else {
			return 11 == var1 ? 8 : var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V"
	)
	void ak(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		if (0 != var7 && 0 != this.ak_fld) {
			if (var9 != -828063812) {
				return;
			}

			if (null != this.ag_fld) {
				var8 = pl(this, var8, var7, (byte)-26);
				var7 = this.az(var7);
				yu.eb(var1, var2, var5, var6, var3, var4, this.ag_fld[var7 - 1][var8], this.ak_fld);
				return;
			}
		}
	}

	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public static void zs(hg var0) {
		byte[] var1 = new byte[var0.ak_fld * var0.ak_fld];
		boolean var2 = false;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		int var9 = 0;

		for (int var3 = 0; var3 < var0.ak_fld; var3++) {
			for (int var4 = 0; var4 < var0.ak_fld; var4++) {
				if (var4 <= var0.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		var0.ag_fld[5][0] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var9 = 0;

		for (int var13 = 0; var13 < var0.ak_fld; var13++) {
			for (int var16 = 0; var16 < var0.ak_fld; var16++) {
				if (var13 <= var0.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		var0.ag_fld[5][1] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var9 = 0;

		for (int var14 = 0; var14 < var0.ak_fld; var14++) {
			for (int var17 = 0; var17 < var0.ak_fld; var17++) {
				if (var17 >= var0.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		var0.ag_fld[5][2] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var9 = 0;

		for (int var15 = 0; var15 < var0.ak_fld; var15++) {
			for (int var18 = 0; var18 < var0.ak_fld; var18++) {
				if (var15 >= var0.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		var0.ag_fld[5][3] = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V"
	)
	void ax(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (0 != var7 && 0 != this.ak_fld && null != this.ag_fld) {
			var8 = pl(this, var8, var7, (byte)38);
			var7 = this.az(var7);
			yu.eb(var1, var2, var5, var6, var3, var4, this.ag_fld[var7 - 1][var8], this.ak_fld);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void at() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < this.ak_fld; var3++) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[0][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = this.ak_fld - 1; var11 >= 0; var11--) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var14 <= var11) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[0][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var15 >= var12) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[0][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 >= var13) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[0][3] = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < this.ak_fld; var3++) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[0][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = this.ak_fld - 1; var11 >= 0; var11--) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var14 <= var11) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[0][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var15 >= var12) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[0][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 >= var13) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[0][3] = var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bm() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = this.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[1][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = 0; var11 < this.ak_fld; var11++) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var2 >= 0 && var2 < var1.length) {
					if (var14 >= var11 << 1) {
						var1[var2] = -1;
					}

					var2++;
				} else {
					var2++;
				}
			}
		}

		this.ag_fld[1][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = this.ak_fld - 1; var15 >= 0; var15--) {
				if (var15 <= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[1][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 >= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[1][3] = var1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bd() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = this.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[1][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = 0; var11 < this.ak_fld; var11++) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var2 >= 0 && var2 < var1.length) {
					if (var14 >= var11 << 1) {
						var1[var2] = -1;
					}

					var2++;
				} else {
					var2++;
				}
			}
		}

		this.ag_fld[1][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = this.ak_fld - 1; var15 >= 0; var15--) {
				if (var15 <= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[1][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 >= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[1][3] = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bz() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = this.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = this.ak_fld - 1; var4 >= 0; var4--) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[2][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = this.ak_fld - 1; var11 >= 0; var11--) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var14 >= var11 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[2][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var15 <= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[2][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = 0; var13 < this.ak_fld; var13++) {
			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 >= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[2][3] = var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void be() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = this.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = this.ak_fld - 1; var4 >= 0; var4--) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[2][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = this.ak_fld - 1; var11 >= 0; var11--) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var14 >= var11 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[2][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var15 <= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[2][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = 0; var13 < this.ak_fld; var13++) {
			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 >= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[2][3] = var1;
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public static void on(hg var0) {
		byte[] var1 = new byte[var0.ak_fld * var0.ak_fld];
		boolean var2 = false;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		int var9 = 0;

		for (int var3 = 0; var3 < var0.ak_fld; var3++) {
			for (int var4 = 0; var4 < var0.ak_fld; var4++) {
				if (var4 <= var3 - var0.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		var0.ag_fld[6][0] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var9 = 0;

		for (int var13 = var0.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < var0.ak_fld; var16++) {
				if (var16 <= var13 - var0.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		var0.ag_fld[6][1] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var9 = 0;

		for (int var14 = var0.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = var0.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 <= var14 - var0.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		var0.ag_fld[6][2] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var9 = 0;

		for (int var15 = 0; var15 < var0.ak_fld; var15++) {
			for (int var18 = var0.ak_fld - 1; var18 >= 0; var18--) {
				if (var18 <= var15 - var0.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		var0.ag_fld[6][3] = var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bo() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		boolean var2 = false;
		var1 = new byte[this.ak_fld * this.ak_fld];
		int var9 = 0;

		for (int var3 = 0; var3 < this.ak_fld; var3++) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 <= var3 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 <= var13 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 <= var14 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var15 = 0; var15 < this.ak_fld; var15++) {
			for (int var18 = this.ak_fld - 1; var18 >= 0; var18--) {
				if (var18 <= var15 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][3] = var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bh() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = this.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = 0; var11 < this.ak_fld; var11++) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var14 <= var11 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = this.ak_fld - 1; var15 >= 0; var15--) {
				if (var15 >= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 <= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][3] = var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bk() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		int var2 = 0;

		for (int var3 = this.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var11 = 0; var11 < this.ak_fld; var11++) {
			for (int var14 = 0; var14 < this.ak_fld; var14++) {
				if (var14 <= var11 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < this.ak_fld; var12++) {
			for (int var15 = this.ak_fld - 1; var15 >= 0; var15--) {
				if (var15 >= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var2 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = this.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 <= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		this.ag_fld[3][3] = var1;
	}

	hg(int var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bl() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		boolean var2 = false;
		var1 = new byte[this.ak_fld * this.ak_fld];
		int var9 = 0;

		for (int var3 = 0; var3 < this.ak_fld; var3++) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 <= var3 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 <= var13 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 <= var14 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var15 = 0; var15 < this.ak_fld; var15++) {
			for (int var18 = this.ak_fld - 1; var18 >= 0; var18--) {
				if (var18 <= var15 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][3] = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av(int var1) {
		if (this.ag_fld != null) {
			if (var1 > 1931024968) {
				;
			}
		} else {
			this.ag_fld = new byte[8][4][];
			this.ae((short)22195);
			this.ah(266113646);
			lt(this, -1186096597);
			this.as((byte)72);
			this.ay((byte)-15);
			this.ar(-2138557516);
			this.af(580962054);
			this.al(1418300524);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bp() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		boolean var2 = false;
		var1 = new byte[this.ak_fld * this.ak_fld];
		int var9 = 0;

		for (int var3 = 0; var3 < this.ak_fld; var3++) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 <= var3 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var13 = this.ak_fld - 1; var13 >= 0; var13--) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 <= var13 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 <= var14 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var15 = 0; var15 < this.ak_fld; var15++) {
			for (int var18 = this.ak_fld - 1; var18 >= 0; var18--) {
				if (var18 <= var15 - this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[6][3] = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	void ae(short var1) {
		byte[] var2 = new byte[this.ak_fld * this.ak_fld];
		int var3 = 0;

		for (int var4 = 0; var4 < this.ak_fld; var4++) {
			for (int var5 = 0; var5 < this.ak_fld; var5++) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[0][0] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var12 = this.ak_fld - 1; var12 >= 0; var12--) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var15 <= var12) {
					if (var1 <= 158) {
						return;
					}

					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[0][1] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var13 = 0; var13 < this.ak_fld; var13++) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 >= var13) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[0][2] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var14 = this.ak_fld - 1; var14 >= 0; var14--) {
			if (var1 <= 158) {
				return;
			}

			for (int var17 = 0; var17 < this.ak_fld; var17++) {
				if (var1 <= 158) {
					return;
				}

				if (var17 >= var14) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[0][3] = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ao(int var1) {
		if (var1 == 9 || 10 == var1) {
			return 1;
		} else {
			return 11 == var1 ? 8 : var1;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	static void cm(lu var0) {
		var0.bt((byte)-64);
		li.ek(lu.bv(var0, -1390889471), new dy(var0), -80794516);
		li.vj(lu.bv(var0, -1511742159), new cg(var0), (byte)56);
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Lds;Lpg;)V"
	)
	public static void oe(ds var0, pg var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.af_fld = var1;
		}
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public static void vw(hg var0) {
		byte[] var1 = new byte[var0.ak_fld * var0.ak_fld];
		int var2 = 0;

		for (int var3 = var0.ak_fld - 1; var3 >= 0; var3--) {
			for (int var4 = var0.ak_fld - 1; var4 >= 0; var4--) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[2][0] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var11 = var0.ak_fld - 1; var11 >= 0; var11--) {
			for (int var14 = 0; var14 < var0.ak_fld; var14++) {
				if (var14 >= var11 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[2][1] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var12 = 0; var12 < var0.ak_fld; var12++) {
			for (int var15 = 0; var15 < var0.ak_fld; var15++) {
				if (var15 <= var12 >> 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[2][2] = var1;
		var1 = new byte[var0.ak_fld * var0.ak_fld];
		var2 = 0;

		for (int var13 = 0; var13 < var0.ak_fld; var13++) {
			for (int var16 = var0.ak_fld - 1; var16 >= 0; var16--) {
				if (var16 >= var13 << 1) {
					var1[var2] = -1;
				}

				var2++;
			}
		}

		var0.ag_fld[2][3] = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I"
	)
	int ag(int var1, int var2, byte var3) {
		if (9 == var2) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = 3 + var1 & 3;
		}

		if (11 == var2) {
			var1 = 3 + var1 & 3;
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		byte[] var2 = new byte[this.ak_fld * this.ak_fld];
		int var3 = 0;

		for (int var4 = this.ak_fld - 1; var4 >= 0; var4--) {
			for (int var5 = this.ak_fld - 1; var5 >= 0; var5--) {
				if (var1 >= -582610164) {
					return;
				}

				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[2][0] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var12 = this.ak_fld - 1; var12 >= 0; var12--) {
			for (int var15 = 0; var15 < this.ak_fld; var15++) {
				if (var15 >= var12 << 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[2][1] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var13 = 0; var13 < this.ak_fld; var13++) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var16 <= var13 >> 1) {
					if (var1 >= -582610164) {
						return;
					}

					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[2][2] = var2;
		var2 = new byte[this.ak_fld * this.ak_fld];
		var3 = 0;

		for (int var14 = 0; var14 < this.ak_fld; var14++) {
			if (var1 >= -582610164) {
				return;
			}

			for (int var17 = this.ak_fld - 1; var17 >= 0; var17--) {
				if (var17 >= var14 << 1) {
					var2[var3] = -1;
				}

				var3++;
			}
		}

		this.ag_fld[2][3] = var2;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bf() {
		byte[] var1 = new byte[this.ak_fld * this.ak_fld];
		boolean var2 = false;
		var1 = new byte[this.ak_fld * this.ak_fld];
		int var9 = 0;

		for (int var3 = 0; var3 < this.ak_fld; var3++) {
			for (int var4 = 0; var4 < this.ak_fld; var4++) {
				if (var4 <= this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[5][0] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var13 = 0; var13 < this.ak_fld; var13++) {
			for (int var16 = 0; var16 < this.ak_fld; var16++) {
				if (var13 <= this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[5][1] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var14 = 0; var14 < this.ak_fld; var14++) {
			for (int var17 = 0; var17 < this.ak_fld; var17++) {
				if (var17 >= this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[5][2] = var1;
		var1 = new byte[this.ak_fld * this.ak_fld];
		var9 = 0;

		for (int var15 = 0; var15 < this.ak_fld; var15++) {
			for (int var18 = 0; var18 < this.ak_fld; var18++) {
				if (var15 >= this.ak_fld / 2) {
					var1[var9] = -1;
				}

				var9++;
			}
		}

		this.ag_fld[5][3] = var1;
	}
}
