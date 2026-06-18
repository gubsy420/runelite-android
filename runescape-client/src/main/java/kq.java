import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kq")
public class kq {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ak_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bs_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)I"
	)
	int aw(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (0 == var5) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				int var9;
				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 64)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 32) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 16)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 8) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 4) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 2) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 1)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				var7++;
			}

			return 1 + var7 - var2;
		}
	}

	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "(Lkq;[BII[BIB)I"
	)
	public static int uh(kq var0, byte[] var1, int var2, int var3, byte[] var4, int var5, byte var6) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var7 = 0;
			int var8 = var5 << 3;

			for (int var15 = var3 + var2; var2 < var15; var2++) {
				int var9 = var1[var2] & 255;
				int var10 = var0.ak_fld[var9];
				byte var11 = var0.ag_fld[var9];
				if (0 == var11) {
					throw new RuntimeException("" + var9);
				}

				int var12 = var8 >> 3;
				int var13 = var8 & 7;
				int var16 = var7 & -var13 >> 31;
				int var14 = var12 + (var11 + var13 - 1 >> 3);
				var13 += 24;
				var4[var12] = (byte)(var7 = var16 | var10 >>> var13);
				if (var12 < var14) {
					var12++;
					var13 -= 8;
					var4[var12] = (byte)(var7 = var10 >>> var13);
					if (var12 < var14) {
						var12++;
						var13 -= 8;
						var4[var12] = (byte)(var7 = var10 >>> var13);
						if (var12 < var14) {
							var12++;
							var13 -= 8;
							var4[var12] = (byte)(var7 = var10 >>> var13);
							if (var12 < var14) {
								var12++;
								var13 -= 8;
								var4[var12] = (byte)(var7 = var10 << -var13);
							}
						}
					}
				}

				var8 += var11;
			}

			return (var8 + 7 >> 3) - var5;
		}
	}

	public kq(byte[] var1) {
		int var2 = var1.length;
		this.ak_fld = new int[var2];
		this.ag_fld = var1;
		int[] var3 = new int[33];
		this.az_fld = new int[8];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; var5++) {
			byte var6 = var1[var5];
			if (0 != var6) {
				int var7 = 1 << 32 - var6;
				int var8 = var3[var6];
				this.ak_fld[var5] = var8;
				int var9;
				if ((var8 & var7) != 0) {
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7;

					for (int var10 = var6 - 1; var10 >= 1; var10--) {
						int var11 = var3[var10];
						if (var8 != var11) {
							break;
						}

						int var12 = 1 << 32 - var10;
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}

						var3[var10] = var11 | var12;
					}
				}

				var3[var6] = var9;

				for (int var15 = 1 + var6; var15 <= 32; var15++) {
					if (var3[var15] == var8) {
						var3[var15] = var9;
					}
				}

				int var16 = 0;

				for (int var17 = 0; var17 < var6; var17++) {
					int var18 = Integer.MIN_VALUE >>> var17;
					if ((var8 & var18) != 0) {
						if (this.az_fld[var16] == 0) {
							this.az_fld[var16] = var4;
						}

						var16 = this.az_fld[var16];
					} else {
						var16++;
					}

					if (var16 >= this.az_fld.length) {
						int[] var13 = new int[this.az_fld.length * 2];

						for (int var14 = 0; var14 < this.az_fld.length; var14++) {
							var13[var14] = this.az_fld[var14];
						}

						this.az_fld = var13;
					}

					var18 >>>= 1;
				}

				this.az_fld[var16] = ~var5;
				if (var16 >= var4) {
					var4 = var16 + 1;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BII[BI)I"
	)
	int av(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var7 = var5 << 3;

		for (int var14 = var3 + var2; var2 < var14; var2++) {
			int var8 = var1[var2] & 255;
			int var9 = this.ak_fld[var8];
			byte var10 = this.ag_fld[var8];
			if (0 == var10) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			int var15 = var6 & -var12 >> 31;
			int var13 = var11 + (var10 + var12 - 1 >> 3);
			var12 += 24;
			var4[var11] = (byte)(var6 = var15 | var9 >>> var12);
			if (var11 < var13) {
				var11++;
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12);
				if (var11 < var13) {
					var11++;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						var11++;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							var11++;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return (var7 + 7 >> 3) - var5;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Loy;)Ljf;"
	)
	public static jf eq(oy var0) {
		return var0.bx_fld;
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(Lkq;[BI[BIII)I"
	)
	public static int rb(kq var0, byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		if (0 == var5) {
			return 0;
		} else {
			int var7 = 0;
			var5 += var4;
			int var8 = var2;

			while (true) {
				byte var9 = var1[var8];
				if (var9 < 0) {
					var7 = var0.az_fld[var7];
				} else {
					var7++;
				}

				int var10;
				if ((var10 = var0.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if (0 != (var9 & 64)) {
					var7 = var0.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = var0.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 32) != 0) {
					var7 = var0.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = var0.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if (0 != (var9 & 16)) {
					var7 = var0.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = var0.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 8) != 0) {
					var7 = var0.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = var0.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 4) != 0) {
					var7 = var0.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = var0.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 2) != 0) {
					var7 = var0.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = var0.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if (0 != (var9 & 1)) {
					var7 = var0.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = var0.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				var8++;
			}

			return 1 + var8 - var2;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BII[BI)I"
	)
	int az(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var7 = var5 << 3;

		for (int var14 = var3 + var2; var2 < var14; var2++) {
			int var8 = var1[var2] & 255;
			int var9 = this.ak_fld[var8];
			byte var10 = this.ag_fld[var8];
			if (0 == var10) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			int var15 = var6 & -var12 >> 857111301;
			int var13 = var11 + (var10 + var12 - 1 >> 3);
			var12 += 24;
			var4[var11] = (byte)(var6 = var15 | var9 >>> var12);
			if (var11 < var13) {
				var11++;
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12);
				if (var11 < var13) {
					var11++;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						var11++;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							var11++;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return (var7 + 7 >> 3) - var5;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)I"
	)
	int ay(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (0 == var5) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				int var9;
				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 64)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 32) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 16)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 8) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 4) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 2) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 1)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				var7++;
			}

			return 1 + var7 - var2;
		}
	}

	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "(Lkq;[BII[BI)I"
	)
	public static int wz(kq var0, byte[] var1, int var2, int var3, byte[] var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		int var6 = 0;
		int var7 = var5 << 3;

		for (int var14 = var3 + var2; var2 < var14; var2++) {
			int var8 = var1[var2] & 255;
			int var9 = var0.ak_fld[var8];
			byte var10 = var0.ag_fld[var8];
			if (0 == var10) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			int var15 = var6 & -var12 >> 31;
			int var13 = var11 + (var10 + var12 - 1 >> 3);
			var12 += 24;
			var4[var11] = (byte)(var6 = var15 | var9 >>> var12);
			if (var11 < var13) {
				var11++;
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12);
				if (var11 < var13) {
					var11++;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						var11++;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							var11++;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return (var7 + 7 >> 3) - var5;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)I"
	)
	int as(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (0 == var5) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				int var9;
				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 64)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 32) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 16)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 8) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 4) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 2) != 0) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if (0 != (var8 & 1)) {
					var6 = this.az_fld[var6];
				} else {
					var6++;
				}

				if ((var9 = this.az_fld[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				var7++;
			}

			return 1 + var7 - var2;
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lkq;[BII[BI)I"
	)
	public static int lk(kq var0, byte[] var1, int var2, int var3, byte[] var4, int var5) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var6 = 0;
			int var7 = var5 << 3;

			for (int var14 = var3 + var2; var2 < var14; var2++) {
				int var8 = var1[var2] & 255;
				int var9 = var0.ak_fld[var8];
				byte var10 = var0.ag_fld[var8];
				if (0 == var10) {
					throw new RuntimeException("" + var8);
				}

				int var11 = var7 >> 3;
				int var12 = var7 & 7;
				int var15 = var6 & -var12 >> 31;
				int var13 = var11 + (var10 + var12 - 1 >> 3);
				var12 += 24;
				var4[var11] = (byte)(var6 = var15 | var9 >>> var12);
				if (var11 < var13) {
					var11++;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						var11++;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							var11++;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 >>> var12);
							if (var11 < var13) {
								var11++;
								var12 -= 8;
								var4[var11] = (byte)(var6 = var9 << -var12);
							}
						}
					}
				}

				var7 += var10;
			}

			return (var7 + 7 >> 3) - var5;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIIIII)Z"
	)
	static boolean af(byte[] var0, int var1, int var2, int var3, int var4) throws EOFException {
		boolean var6 = true;
		xi var7 = new xi(var0);
		int var8 = -1;

		label99:
		while (true) {
			int var9 = var7.dm();
			if (0 == var9) {
				return var6;
			}

			var8 += var9;
			int var10 = 0;
			boolean var11 = false;

			while (true) {
				while (!var11) {
					int var12 = var7.dz();
					if (var12 == 0) {
						continue label99;
					}

					var10 += var12 - 1;
					int var13 = var10 & 63;
					int var14 = var10 >> 6 & 63;
					int var15 = var7.cg() >> 2;
					int var16 = var1 + var14;
					int var17 = var2 + var13;
					if (var16 >= 0 && var17 >= 0 && var16 <= var3 && var17 <= var4) {
						oe var18 = ko.az(var8);
						if (!ef.aw(var15) || !client.gk_fld || var18.cj_fld != 0 || 1 == var18.cu_fld || var18.du_fld) {
							if (!oe.fn(var18, -1094057003)) {
								client.jw_fld++;
								var6 = false;
							}

							var11 = true;
						}
					}
				}

				int var19 = var7.dz();
				if (0 == var19) {
					break;
				}

				var7.cg();
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BI[BIII)I"
	)
	int ag(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
		if (0 == var5) {
			return 0;
		} else {
			int var7 = 0;
			var5 += var4;
			int var8 = var2;

			while (true) {
				byte var9 = var1[var8];
				if (var9 < 0) {
					var7 = this.ak_fld[var7];
				} else {
					var7++;
				}

				int var10;
				if ((var10 = this.ak_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if (0 != (var9 & 64)) {
					var7 = this.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = this.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 32) != 0) {
					var7 = this.ak_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = this.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if (0 != (var9 & 16)) {
					var7 = this.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = this.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 8) != 0) {
					var7 = this.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = this.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 4) != 0) {
					var7 = this.ak_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = this.ak_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 2) != 0) {
					var7 = this.ak_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = this.ak_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if (0 != (var9 & 1)) {
					var7 = this.az_fld[var7];
				} else {
					var7++;
				}

				if ((var10 = this.az_fld[var7]) < 0) {
					var3[var4++] = (byte)(~var10);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				var8++;
			}

			return 1 + var8 - var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BII[BIB)I"
	)
	int ak(byte[] var1, int var2, int var3, byte[] var4, int var5, byte var6) {
		int var7 = 0;
		int var8 = var5 << 3;

		for (int var15 = var3 + var2; var2 < var15; var2++) {
			int var9 = var1[var2] & 255;
			int var10 = this.az_fld[var9];
			byte var11 = this.ag_fld[var9];
			if (0 == var11) {
				throw new RuntimeException("" + var9);
			}

			int var12 = var8 >> 3;
			int var13 = var8 & 7;
			int var16 = var7 & -var13 >> 31;
			int var14 = var12 + (var11 + var13 - 1 >> 3);
			var13 += 24;
			var4[var12] = (byte)(var7 = var16 | var10 >>> var13);
			if (var12 < var14) {
				var12++;
				var13 -= 8;
				var4[var12] = (byte)(var7 = var10 >>> var13);
				if (var12 < var14) {
					var12++;
					var13 -= 8;
					var4[var12] = (byte)(var7 = var10 >>> var13);
					if (var12 < var14) {
						var12++;
						var13 -= 8;
						var4[var12] = (byte)(var7 = var10 >>> var13);
						if (var12 < var14) {
							var12++;
							var13 -= 8;
							var4[var12] = (byte)(var7 = var10 << -var13);
						}
					}
				}
			}

			var8 += var11;
		}

		return (var8 + 7 >> 3) - var5;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BII[BI)I"
	)
	int ah(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var7 = var5 << 3;

		for (int var14 = var3 + var2; var2 < var14; var2++) {
			int var8 = var1[var2] & 255;
			int var9 = this.ak_fld[var8];
			byte var10 = this.ag_fld[var8];
			if (0 == var10) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			int var15 = var6 & -var12 >> 31;
			int var13 = var11 + (var10 + var12 - 1 >> 3);
			var12 += 24;
			var4[var11] = (byte)(var6 = var15 | var9 >>> var12);
			if (var11 < var13) {
				var11++;
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12);
				if (var11 < var13) {
					var11++;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						var11++;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							var11++;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return (var7 + 7 >> 3) - var5;
	}
}
