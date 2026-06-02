import java.awt.Component;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bd")
public class bd {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[F"
	)
	float[][] ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ah_fld;

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Z"
	)
	public static boolean px(uk var0) {
		return var0.af_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ak(int var0, int var1) {
		int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

		while (true) {
			int var4 = var2;
			int var5 = var1;

			int var6;
			for (var6 = 1; var5 > 1; var5 >>= 1) {
				if ((var5 & 1) != 0) {
					var6 *= var4;
				}

				var4 *= var4;
			}

			int var3;
			if (1 == var5) {
				var3 = var4 * var6;
			} else {
				var3 = var6;
			}

			if (var3 <= var0) {
				return var2;
			}

			var2--;
		}
	}

	bd(bh var1) {
		var1.ak(24, -153385893);
		this.ak_fld = var1.ak(16, -1676559650);
		this.ag_fld = var1.ak(24, -581944502);
		this.av_fld = new int[this.ag_fld];
		boolean var2 = var1.av() != 0;
		if (var2) {
			int var3 = 0;

			for (int var4 = var1.ak(5, 407964288) + 1; var3 < this.ag_fld; var4++) {
				int var5 = var1.ak(gb.as(this.ag_fld - var3), 875372779);

				for (int var6 = 0; var6 < var5; var6++) {
					this.av_fld[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.av() != 0;

			for (int var17 = 0; var17 < this.ag_fld; var17++) {
				if (var15 && var1.av() == 0) {
					this.av_fld[var17] = 0;
				} else {
					this.av_fld[var17] = var1.ak(5, -144848772) + 1;
				}
			}
		}

		this.aw();
		int var16 = var1.ak(4, -213185551);
		if (var16 > 0) {
			float var18 = bz.ak(var1.ak(32, -1186074355));
			float var19 = bz.ak(var1.ak(32, -684771319));
			int var20 = var1.ak(4, 761576003) + 1;
			boolean var7 = var1.av() != 0;
			int var8;
			if (var16 == 1) {
				var8 = ak(this.ag_fld, this.ak_fld);
			} else {
				var8 = this.ag_fld * this.ak_fld;
			}

			this.ah_fld = new int[var8];

			for (int var9 = 0; var9 < var8; var9++) {
				this.ah_fld[var9] = var1.ak(var20, -1871740994);
			}

			this.ae_fld = new float[this.ag_fld][this.ak_fld];
			if (var16 == 1) {
				for (int var21 = 0; var21 < this.ag_fld; var21++) {
					float var10 = 0.0F;
					int var11 = 1;

					for (int var12 = 0; var12 < this.ak_fld; var12++) {
						int var13 = var21 / var11 % var8;
						float var14 = this.ah_fld[var13] * var19 + var18 + var10;
						this.ae_fld[var21][var12] = var14;
						if (var7) {
							var10 = var14;
						}

						var11 *= var8;
					}
				}
			} else {
				for (int var22 = 0; var22 < this.ag_fld; var22++) {
					float var23 = 0.0F;
					int var24 = var22 * this.ak_fld;

					for (int var25 = 0; var25 < this.ak_fld; var25++) {
						float var26 = this.ah_fld[var24] * var19 + var18 + var23;
						this.ae_fld[var22][var25] = var26;
						if (var7) {
							var23 = var26;
						}

						var24++;
					}
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		int[] var1 = new int[this.ag_fld];
		int[] var2 = new int[33];

		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			int var4 = this.av_fld[var3];
			if (var4 != 0) {
				int var5 = 1 << 32 - var4;
				int var6 = var2[var4];
				var1[var3] = var6;
				int var7;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (int var8 = var4 - 1; var8 >= 1; var8--) {
						int var9 = var2[var8];
						if (var9 != var6) {
							break;
						}

						int var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (int var17 = var4 + 1; var17 <= 32; var17++) {
					int var20 = var2[var17];
					if (var20 == var6) {
						var2[var17] = var7;
					}
				}
			}
		}

		this.az_fld = new int[8];
		int var11 = 0;

		for (int var12 = 0; var12 < this.ag_fld; var12++) {
			int var13 = this.av_fld[var12];
			if (var13 != 0) {
				int var14 = var1[var12];
				int var15 = 0;

				for (int var16 = 0; var16 < var13; var16++) {
					int var18 = Integer.MIN_VALUE >>> var16;
					if ((var14 & var18) != 0) {
						if (this.az_fld[var15] == 0) {
							this.az_fld[var15] = var11;
						}

						var15 = this.az_fld[var15];
					} else {
						var15++;
					}

					if (var15 >= this.az_fld.length) {
						int[] var21 = new int[this.az_fld.length * 2];

						for (int var22 = 0; var22 < this.az_fld.length; var22++) {
							var21[var22] = this.az_fld[var22];
						}

						this.az_fld = var21;
					}

					var18 >>>= 1;
				}

				this.az_fld[var15] = ~var12;
				if (var15 >= var11) {
					var11 = var15 + 1;
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbh;)I"
	)
	int az(bh var1) {
		int var2 = 0;

		while (this.az_fld[var2] >= 0) {
			var2 = var1.av() != 0 ? this.az_fld[var2] : var2 + 1;
		}

		return ~this.az_fld[var2];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbh;)[F"
	)
	float[] as(bh var1) {
		return this.ae_fld[this.az(var1)];
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ljava/awt/Component;)V"
	)
	public static void ij(tl var0, Component var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(var0);
		var1.addFocusListener(var0);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ae(int var0, int var1) {
		int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

		while (true) {
			int var4 = var2;
			int var5 = var1;

			int var6;
			for (var6 = 1; var5 > 1; var5 >>= 1) {
				if ((var5 & 1) != 0) {
					var6 *= var4;
				}

				var4 *= var4;
			}

			int var3;
			if (1 == var5) {
				var3 = var4 * var6;
			} else {
				var3 = var6;
			}

			if (var3 <= var0) {
				return var2;
			}

			var2--;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		int[] var1 = new int[this.ag_fld];
		int[] var2 = new int[33];

		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			int var4 = this.av_fld[var3];
			if (var4 != 0) {
				int var5 = 1 << 32 - var4;
				int var6 = var2[var4];
				var1[var3] = var6;
				int var7;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (int var8 = var4 - 1; var8 >= 1; var8--) {
						int var9 = var2[var8];
						if (var9 != var6) {
							break;
						}

						int var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (int var17 = var4 + 1; var17 <= 32; var17++) {
					int var20 = var2[var17];
					if (var20 == var6) {
						var2[var17] = var7;
					}
				}
			}
		}

		this.az_fld = new int[8];
		int var11 = 0;

		for (int var12 = 0; var12 < this.ag_fld; var12++) {
			int var13 = this.av_fld[var12];
			if (var13 != 0) {
				int var14 = var1[var12];
				int var15 = 0;

				for (int var16 = 0; var16 < var13; var16++) {
					int var18 = Integer.MIN_VALUE >>> var16;
					if ((var14 & var18) != 0) {
						if (this.az_fld[var15] == 0) {
							this.az_fld[var15] = var11;
						}

						var15 = this.az_fld[var15];
					} else {
						var15++;
					}

					if (var15 >= this.az_fld.length) {
						int[] var21 = new int[this.az_fld.length * 2];

						for (int var22 = 0; var22 < this.az_fld.length; var22++) {
							var21[var22] = this.az_fld[var22];
						}

						this.az_fld = var21;
					}

					var18 >>>= 1;
				}

				this.az_fld[var15] = ~var12;
				if (var15 >= var11) {
					var11 = var15 + 1;
				}
			}
		}
	}

	@ObfuscatedName("yk")
	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	public static void yk(de var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = true;

		try {
			synchronized (var0) {
				var0.notify();
			}

			var0.ak_fld.join();
		} catch (InterruptedException var4) {
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ah() {
		int[] var1 = new int[this.ag_fld];
		int[] var2 = new int[33];

		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			int var4 = this.av_fld[var3];
			if (var4 != 0) {
				int var5 = 1 << 32 - var4;
				int var6 = var2[var4];
				var1[var3] = var6;
				int var7;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (int var8 = var4 - 1; var8 >= 1; var8--) {
						int var9 = var2[var8];
						if (var9 != var6) {
							break;
						}

						int var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (int var17 = var4 + 1; var17 <= 32; var17++) {
					int var20 = var2[var17];
					if (var20 == var6) {
						var2[var17] = var7;
					}
				}
			}
		}

		this.az_fld = new int[8];
		int var11 = 0;

		for (int var12 = 0; var12 < this.ag_fld; var12++) {
			int var13 = this.av_fld[var12];
			if (var13 != 0) {
				int var14 = var1[var12];
				int var15 = 0;

				for (int var16 = 0; var16 < var13; var16++) {
					int var18 = Integer.MIN_VALUE >>> var16;
					if ((var14 & var18) != 0) {
						if (this.az_fld[var15] == 0) {
							this.az_fld[var15] = var11;
						}

						var15 = this.az_fld[var15];
					} else {
						var15++;
					}

					if (var15 >= this.az_fld.length) {
						int[] var21 = new int[this.az_fld.length * 2];

						for (int var22 = 0; var22 < this.az_fld.length; var22++) {
							var21[var22] = this.az_fld[var22];
						}

						this.az_fld = var21;
					}

					var18 >>>= 1;
				}

				this.az_fld[var15] = ~var12;
				if (var15 >= var11) {
					var11 = var15 + 1;
				}
			}
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IJ)I"
	)
	public static int jd(wj var0, int var1, long var2) {
		if (var0.ah_fld == var1) {
			return var1;
		} else if (var1 > var0.ah_fld) {
			double var6 = 1.0 - nl.az(var2, var0.ae_fld, var0.ag_fld);
			return (int)(var6 * (var0.av_fld - var0.ah_fld)) + var0.ah_fld;
		} else {
			double var4 = nl.az(var2, var0.ae_fld, var0.ag_fld);
			return (int)(var4 * (var0.ah_fld - var0.av_fld)) + var0.av_fld;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbh;)[F"
	)
	float[] av(bh var1) {
		return this.ae_fld[this.az(var1)];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbh;)I"
	)
	int ay(bh var1) {
		int var2 = 0;

		while (this.az_fld[var2] >= 0) {
			var2 = var1.av() != 0 ? this.az_fld[var2] : var2 + 1;
		}

		return ~this.az_fld[var2];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lbh;)[F"
	)
	float[] ar(bh var1) {
		return this.ae_fld[this.az(var1)];
	}
}
