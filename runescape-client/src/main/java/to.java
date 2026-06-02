import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("to")
public class to {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] ak_fld;
	@ObfuscatedGetter(
		intValue = -1835396327
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ed_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[F)I"
	)
	public static int av(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < 1 + var1; var8++) {
			var7 += Math.abs(var0[var8]);
		}

		float var21 = (Math.abs(var2) + Math.abs(var4)) * (1 + var1) * sa.av_fld;
		if (var7 <= var21) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			for (int var10 = 0; var10 < 1 + var1; var10++) {
				var9[var10] = var0[var10] * (1.0F / var7);
			}

			while (Math.abs(var9[var1]) < var21) {
				var1--;
			}

			int var22 = 0;
			if (0 == var1) {
				return var22;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var24 = var3 ? var2 < var21 + var6[0] : var2 < var6[0] - var21;
				boolean var25 = var5 ? var4 > var6[0] - var21 : var4 > var6[0] + var21;
				var22 = var24 && var25 ? 1 : 0;
				if (var22 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var22;
			} else {
				to var11 = new to(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; var13++) {
					var12[var13 - 1] = var9[var13] * var13;
				}

				float[] var26 = new float[var1 + 1];
				int var14 = sh.ak(var12, var1 - 1, var2, false, var4, false, var26);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;

					for (int var20 = 0; var20 <= var14; var20++) {
						if (var22 > var1) {
							return var22;
						}

						float var16;
						if (0 == var20) {
							var16 = var2;
							var18 = tk.ag(var9, var1, var2);
							if (Math.abs(var18) <= var21 && var3) {
								var6[var22++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var20 == var14) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var26[var20];
						}

						var17 = tk.ag(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var21) {
							if (var14 != var20 || var5) {
								var6[var22++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							var6[var22++] = mh.az(var11, var16, var19, 0.0F);
							if (var22 > 1 && var6[var22 - 2] >= var6[var22 - 1] - var21) {
								var6[var22 - 2] = (var6[var22 - 2] + var6[var22 - 1]) * 0.5F;
								var22--;
							}
						}
					}

					return var22;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lto;FFF)F"
	)
	static float as(to var0, float var1, float var2, float var3) {
		float var4 = tk.ag(var0.ak_fld, var0.ag_fld, var1);
		if (Math.abs(var4) < sa.av_fld) {
			return var1;
		} else {
			float var5 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
			if (Math.abs(var5) < sa.av_fld) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = sa.ae_fld * Math.abs(var2) + var3 * 0.5F;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = var17 * 2.0F * var12;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = var12 * ((var10 - var11) * (var10 * (var17 * 2.0F)) - (var2 - var1) * (var11 - 1.0F));
								var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
							}

							if (var9 > 0.0) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < 3.0F * var17 * var10 - Math.abs(var10 * var16) && var9 < Math.abs(var12 * 0.5F * var10)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if (var17 > 0.0) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
						if (var5 * (var13 / Math.abs(var13)) > 0.0) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while (var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lpp;II)I"
	)
	public static int be(pp var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return my.ag(var0.ep_fld, var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([FIF)F"
	)
	static float ae(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; var4--) {
			var3 = var0[var4] + var2 * var3;
		}

		return var3;
	}

	to(float[] var1, int var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lto;FFF)F"
	)
	static float aw(to var0, float var1, float var2, float var3) {
		float var4 = tk.ag(var0.ak_fld, var0.ag_fld, var1);
		if (Math.abs(var4) < sa.av_fld) {
			return var1;
		} else {
			float var5 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
			if (Math.abs(var5) < sa.av_fld) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = sa.ae_fld * Math.abs(var2) + var3 * 0.5F;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = var17 * 2.0F * var12;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = var12 * ((var10 - var11) * (var10 * (var17 * 2.0F)) - (var2 - var1) * (var11 - 1.0F));
								var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
							}

							if (var9 > 0.0) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < 3.0F * var17 * var10 - Math.abs(var10 * var16) && var9 < Math.abs(var12 * 0.5F * var10)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if (var17 > 0.0) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
						if (var5 * (var13 / Math.abs(var13)) > 0.0) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while (var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lto;FFF)F"
	)
	static float ay(to var0, float var1, float var2, float var3) {
		float var4 = tk.ag(var0.ak_fld, var0.ag_fld, var1);
		if (Math.abs(var4) < sa.av_fld) {
			return var1;
		} else {
			float var5 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
			if (Math.abs(var5) < sa.av_fld) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = sa.ae_fld * Math.abs(var2) + var3 * 0.5F;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = var17 * 2.0F * var12;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = var12 * ((var10 - var11) * (var10 * (var17 * 2.0F)) - (var2 - var1) * (var11 - 1.0F));
								var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
							}

							if (var9 > 0.0) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < 3.0F * var17 * var10 - Math.abs(var10 * var16) && var9 < Math.abs(var12 * 0.5F * var10)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if (var17 > 0.0) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
						if (var5 * (var13 / Math.abs(var13)) > 0.0) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while (var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lto;FFF)F"
	)
	static float ah(to var0, float var1, float var2, float var3) {
		float var4 = tk.ag(var0.ak_fld, var0.ag_fld * 1060485697, var1);
		if (Math.abs(var4) < sa.av_fld) {
			return var1;
		} else {
			float var5 = tk.ag(var0.ak_fld, var0.ag_fld, var2);
			if (Math.abs(var5) < sa.av_fld) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = sa.ae_fld * Math.abs(var2) + var3 * 0.5F;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = var17 * 2.0F * var12;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = var12 * ((var10 - var11) * (var10 * (var17 * 2.0F)) - (var2 - var1) * (var11 - 1.0F));
								var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
							}

							if (var9 > 0.0) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < 3.0F * var17 * var10 - Math.abs(var10 * var16) && var9 < Math.abs(var12 * 0.5F * var10)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if (var17 > 0.0) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = tk.ag(var0.ak_fld, var0.ag_fld * -275745940, var2);
						if (var5 * (var13 / Math.abs(var13)) > 0.0) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while (var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean ak(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || 13 == var0 || var0 == 14 || var0 == 15 || 16 == var0 || var0 == 17;
	}
}
