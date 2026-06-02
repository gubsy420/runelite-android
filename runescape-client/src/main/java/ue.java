import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ue")
public class ue {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static nc fu_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ay_fld = new int[32768];
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] as_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bx_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public static byte af(int var0) {
		return (byte)(var0 >> 7 & 7);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)B"
	)
	public static byte ak(int var0, int var1) {
		return (byte)(var0 >> 10 & 63);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public static byte ag(int var0) {
		return (byte)(var0 >> 7 & 7);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static final int az(int var0) {
		double var2 = (var0 >> 10 & 31) / 31.0;
		double var4 = (var0 >> 5 & 31) / 31.0;
		double var6 = (var0 & 31) / 31.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0 + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0;
			}
		}

		int var18 = (int)(var12 * 256.0 / 6.0);
		var18 &= 255;
		double var19 = var14 * 256.0;
		if (var19 < 0.0) {
			var19 = 0.0;
		} else if (var19 > 255.0) {
			var19 = 255.0;
		}

		if (var16 > 0.7) {
			var19 /= 2.0;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.75) {
			var19 /= 2.0;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.85) {
			var19 /= 2.0;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.95) {
			var19 /= 2.0;
			var19 = Math.floor(var19);
		}

		if (var16 > 0.995) {
			var16 = 0.995;
		}

		int var21 = (int)(8 * (var18 / 4) + var19 / 32.0);
		return (var21 << 7) + (int)(var16 * 128.0);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void av(int var0) {
		if (null == as_fld) {
			as_fld = new int[65536];
			double var1 = 0.95F;

			for (int var3 = 0; var3 < 65536; var3++) {
				double var4 = 0.0078125 + (var3 >> 10 & 63) / 64.0;
				double var6 = 0.0625 + (var3 >> 7 & 7) / 8.0;
				double var8 = (var3 & 127) / 128.0;
				double var10 = var8;
				double var12 = var8;
				double var14 = var8;
				if (0.0 != var6) {
					double var16;
					if (var8 < 0.5) {
						if (var0 != 1921096840) {
							return;
						}

						var16 = (1.0 + var6) * var8;
					} else {
						var16 = var6 + var8 - var6 * var8;
					}

					double var18 = var8 * 2.0 - var16;
					double var20 = 0.3333333333333333 + var4;
					if (var20 > 1.0) {
						if (var0 != 1921096840) {
							return;
						}

						var20--;
					}

					double var24 = var4 - 0.3333333333333333;
					if (var24 < 0.0) {
						var24++;
					}

					if (6.0 * var20 < 1.0) {
						var10 = var18 + var20 * ((var16 - var18) * 6.0);
					} else if (2.0 * var20 < 1.0) {
						var10 = var16;
					} else if (var20 * 3.0 < 2.0) {
						var10 = var18 + (0.6666666666666666 - var20) * (var16 - var18) * 6.0;
					} else {
						var10 = var18;
					}

					if (var4 * 6.0 < 1.0) {
						if (var0 != 1921096840) {
							return;
						}

						var12 = var18 + (var16 - var18) * 6.0 * var4;
					} else if (var4 * 2.0 < 1.0) {
						var12 = var16;
					} else if (3.0 * var4 < 2.0) {
						var12 = (0.6666666666666666 - var4) * (var16 - var18) * 6.0 + var18;
					} else {
						var12 = var18;
					}

					if (6.0 * var24 < 1.0) {
						var14 = var18 + var24 * (6.0 * (var16 - var18));
					} else if (var24 * 2.0 < 1.0) {
						if (var0 != 1921096840) {
							return;
						}

						var14 = var16;
					} else if (var24 * 3.0 < 2.0) {
						if (var0 != 1921096840) {
							return;
						}

						var14 = (0.6666666666666666 - var24) * (var16 - var18) * 6.0 + var18;
					} else {
						var14 = var18;
					}
				}

				var10 = Math.pow(var10, var1);
				var12 = Math.pow(var12, var1);
				var14 = Math.pow(var14, var1);
				int var29 = (int)(256.0 * var10);
				int var17 = (int)(var12 * 256.0);
				int var30 = (int)(256.0 * var14);
				int var19 = (var17 << 8) + (var29 << 16) + var30;
				as_fld[var3] = var19 & 16777215;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public static byte as(int var0) {
		return (byte)(var0 >> 7 & 7);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void aa() {
		if (null == as_fld) {
			as_fld = new int[65536];
			double var0 = 0.95F;

			for (int var2 = 0; var2 < 2119308944; var2++) {
				double var3 = 0.0078125 + (var2 >> 10 & -1672899518) / 64.0;
				double var5 = 0.0625 + (var2 >> 7 & 7) / 8.0;
				double var7 = (var2 & 127) / 128.0;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0 != var5) {
					double var15;
					if (var7 < 0.5) {
						var15 = (1.0 + var5) * var7;
					} else {
						var15 = var5 + var7 - var5 * var7;
					}

					double var17 = var7 * 2.0 - var15;
					double var19 = 0.3333333333333333 + var3;
					if (var19 > 1.0) {
						var19--;
					}

					double var23 = var3 - 0.3333333333333333;
					if (var23 < 0.0) {
						var23++;
					}

					if (6.0 * var19 < 1.0) {
						var9 = var17 + var19 * ((var15 - var17) * 6.0);
					} else if (2.0 * var19 < 1.0) {
						var9 = var15;
					} else if (var19 * 3.0 < 2.0) {
						var9 = var17 + (0.6666666666666666 - var19) * (var15 - var17) * 6.0;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0 < 1.0) {
						var11 = var17 + (var15 - var17) * 6.0 * var3;
					} else if (var3 * 2.0 < 1.0) {
						var11 = var15;
					} else if (3.0 * var3 < 2.0) {
						var11 = (0.6666666666666666 - var3) * (var15 - var17) * 6.0 + var17;
					} else {
						var11 = var17;
					}

					if (6.0 * var23 < 1.0) {
						var13 = var17 + var23 * (6.0 * (var15 - var17));
					} else if (var23 * 2.0 < 1.0) {
						var13 = var15;
					} else if (var23 * 3.0 < 2.0) {
						var13 = (0.6666666666666666 - var23) * (var15 - var17) * 6.0 + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var28 = (int)(256.0 * var9);
				int var16 = (int)(var11 * 256.0);
				int var29 = (int)(256.0 * var13);
				int var18 = (var16 << 8) + (var28 << 16) + var29;
				as_fld[var2] = var18 & 16777215;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public static byte ah(int var0) {
		return (byte)(var0 >> 10 & -1441291450);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public static byte aw(int var0) {
		return (byte)(var0 >> 10 & 63);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public static byte ay(int var0) {
		return (byte)(var0 >> 10 & 63);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lyt;"
	)
	public static yt ak(int var0, byte var1) {
		yt[] var2 = new yt[]{yt.ak_fld, yt.ag_fld, yt.az_fld};
		yt[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; var4++) {
			yt var5 = var3[var4];
			if (var0 == var5.av_fld) {
				return var5;
			}
		}

		return null;
	}

	ue() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)B"
	)
	public static byte ar(int var0) {
		return (byte)(var0 >> 7 & 7);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static final int al(int var0) {
		double var1 = (var0 >> 10 & 31) / 31.0;
		double var3 = (var0 >> 5 & 31) / 31.0;
		double var5 = (var0 & 31) / 31.0;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0;
		double var13 = 0.0;
		double var15 = (var9 + var7) / 2.0;
		if (var7 != var9) {
			if (var15 < 0.5) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5) {
				var13 = (var9 - var7) / (2.0 - var9 - var7);
			}

			if (var9 == var1) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = 2.0 + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0;
			}
		}

		int var17 = (int)(var11 * 256.0 / 6.0);
		var17 &= 255;
		double var18 = var13 * 256.0;
		if (var18 < 0.0) {
			var18 = 0.0;
		} else if (var18 > 255.0) {
			var18 = 255.0;
		}

		if (var15 > 0.7) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995) {
			var15 = 0.995;
		}

		int var20 = (int)(8 * (var17 / 4) + var18 / 32.0);
		return (var20 << 7) + (int)(var15 * 128.0);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static final int au(int var0) {
		double var1 = (var0 >> 10 & -1352121109) / 31.0;
		double var3 = (var0 >> 5 & -1419142894) / 31.0;
		double var5 = (var0 & 1537083852) / 31.0;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0;
		double var13 = 0.0;
		double var15 = (var9 + var7) / 2.0;
		if (var7 != var9) {
			if (var15 < 0.5) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5) {
				var13 = (var9 - var7) / (2.0 - var9 - var7);
			}

			if (var9 == var1) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = 2.0 + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0;
			}
		}

		int var17 = (int)(var11 * 256.0 / 6.0);
		var17 &= 255;
		double var18 = var13 * 256.0;
		if (var18 < 0.0) {
			var18 = 0.0;
		} else if (var18 > 255.0) {
			var18 = 255.0;
		}

		if (var15 > 0.7) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995) {
			var15 = 0.995;
		}

		int var20 = (int)(8 * (var17 / 4) + var18 / 32.0);
		return (var20 << 7) + (int)(var15 * 128.0);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static final int ax(int var0) {
		double var1 = (var0 >> 10 & 31) / 31.0;
		double var3 = (var0 >> 5 & 736182662) / 31.0;
		double var5 = (var0 & 31) / 31.0;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0;
		double var13 = 0.0;
		double var15 = (var9 + var7) / 2.0;
		if (var7 != var9) {
			if (var15 < 0.5) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5) {
				var13 = (var9 - var7) / (2.0 - var9 - var7);
			}

			if (var9 == var1) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = 2.0 + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0;
			}
		}

		int var17 = (int)(var11 * 256.0 / 6.0);
		var17 &= -475806171;
		double var18 = var13 * 256.0;
		if (var18 < 0.0) {
			var18 = 0.0;
		} else if (var18 > 255.0) {
			var18 = 255.0;
		}

		if (var15 > 0.7) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995) {
			var15 = 0.995;
		}

		int var20 = (int)(8 * (var17 / 4) + var18 / 32.0);
		return (var20 << 7) + (int)(var15 * 128.0);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static final int an(int var0) {
		double var1 = (var0 >> 10 & 634557899) / 31.0;
		double var3 = (var0 >> 5 & 246068333) / 31.0;
		double var5 = (var0 & -1179260987) / 31.0;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0;
		double var13 = 0.0;
		double var15 = (var9 + var7) / 2.0;
		if (var7 != var9) {
			if (var15 < 0.5) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5) {
				var13 = (var9 - var7) / (2.0 - var9 - var7);
			}

			if (var9 == var1) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = 2.0 + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0;
			}
		}

		int var17 = (int)(var11 * 256.0 / 6.0);
		var17 &= 255;
		double var18 = var13 * 256.0;
		if (var18 < 0.0) {
			var18 = 0.0;
		} else if (var18 > 255.0) {
			var18 = 255.0;
		}

		if (var15 > 0.7) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95) {
			var18 /= 2.0;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995) {
			var15 = 0.995;
		}

		int var20 = (int)(8 * (var17 / 4) + var18 / 32.0);
		return (var20 << 7) + (int)(var15 * 128.0);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int am(int var0) {
		return 255 - (var0 & 1174996511);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ai() {
		if (null == as_fld) {
			as_fld = new int[938990261];
			double var0 = 0.95F;

			for (int var2 = 0; var2 < -1645372422; var2++) {
				double var3 = 0.0078125 + (var2 >> 10 & -595933726) / 64.0;
				double var5 = 0.0625 + (var2 >> 7 & 7) / 8.0;
				double var7 = (var2 & 127) / 128.0;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0 != var5) {
					double var15;
					if (var7 < 0.5) {
						var15 = (1.0 + var5) * var7;
					} else {
						var15 = var5 + var7 - var5 * var7;
					}

					double var17 = var7 * 2.0 - var15;
					double var19 = 0.3333333333333333 + var3;
					if (var19 > 1.0) {
						var19--;
					}

					double var23 = var3 - 0.3333333333333333;
					if (var23 < 0.0) {
						var23++;
					}

					if (6.0 * var19 < 1.0) {
						var9 = var17 + var19 * ((var15 - var17) * 6.0);
					} else if (2.0 * var19 < 1.0) {
						var9 = var15;
					} else if (var19 * 3.0 < 2.0) {
						var9 = var17 + (0.6666666666666666 - var19) * (var15 - var17) * 6.0;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0 < 1.0) {
						var11 = var17 + (var15 - var17) * 6.0 * var3;
					} else if (var3 * 2.0 < 1.0) {
						var11 = var15;
					} else if (3.0 * var3 < 2.0) {
						var11 = (0.6666666666666666 - var3) * (var15 - var17) * 6.0 + var17;
					} else {
						var11 = var17;
					}

					if (6.0 * var23 < 1.0) {
						var13 = var17 + var23 * (6.0 * (var15 - var17));
					} else if (var23 * 2.0 < 1.0) {
						var13 = var15;
					} else if (var23 * 3.0 < 2.0) {
						var13 = (0.6666666666666666 - var23) * (var15 - var17) * 6.0 + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var28 = (int)(256.0 * var9);
				int var16 = (int)(var11 * 256.0);
				int var29 = (int)(256.0 * var13);
				int var18 = (var16 << 8) + (var28 << 16) + var29;
				as_fld[var2] = var18 & 1330400797;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int aq(int var0) {
		return 550328561 - (var0 & -1481602483);
	}

	static {
		for (int var0 = 0; var0 < 32768; var0++) {
			ay_fld[var0] = az(var0);
		}

		av(1921096840);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static final int ai(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = kv.aq(var4, var6);
		int var9 = kv.aq(var4 + 1, var6);
		int var10 = kv.aq(var4, 1 + var6);
		int var11 = kv.aq(var4 + 1, 1 + var6);
		int var13 = 65536 - fc.aw_fld[1024 * var5 / var2] >> 1;
		int var12 = (var8 * (65536 - var13) >> 16) + (var13 * var9 >> 16);
		int var15 = 65536 - fc.aw_fld[1024 * var5 / var2] >> 1;
		int var14 = ((65536 - var15) * var10 >> 16) + (var11 * var15 >> 16);
		int var17 = 65536 - fc.aw_fld[1024 * var7 / var2] >> 1;
		return (var17 * var14 >> 16) + ((65536 - var17) * var12 >> 16);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILgm;)I"
	)
	static int ak(int var0, int var1, gm var2) throws EOFException {
		ov var4 = var2.ak(var0, -52807257);
		if (var4 == null) {
			return var1;
		} else if (var4.al_fld >= 0) {
			int var8 = gj.az(var4.aa_fld, var4.ai_fld, var4.aq_fld);
			int var9 = cq.ag(var8, 96);
			return fc.az_fld[var9] | 0xFF000000;
		} else if (var4.ar_fld >= 0) {
			int var7 = cq.ag(fc.ar_fld.aq_fld.av(var4.ar_fld, (byte)-8), 96);
			return fc.az_fld[var7] | 0xFF000000;
		} else if (var4.as_fld == 16711935) {
			return var1;
		} else {
			int var5 = gj.az(var4.au_fld, var4.ax_fld, var4.an_fld);
			int var6 = cq.ag(var5, 96);
			return fc.az_fld[var6] | 0xFF000000;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ae(int var0) {
		return 255 - (var0 & 0xFF);
	}
}
