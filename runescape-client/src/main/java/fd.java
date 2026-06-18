import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fd")
public class fd extends fh {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void bi(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		int var11 = (int)var4;
		int var12 = (int)var5;
		int var13 = (int)var6;
		int var14 = (int)var1;
		int var15 = (int)var2;
		int var16 = (int)var3;
		int var17 = 0;
		if (var15 != var14) {
			var17 = (var12 - var11 << 14) / (var15 - var14);
		}

		int var18 = 0;
		if (var16 != var15) {
			var18 = (var13 - var12 << 14) / (var16 - var15);
		}

		int var19 = 0;
		if (var16 != var14) {
			var19 = (var11 - var13 << 14) / (var14 - var16);
		}

		int[] var20 = this.ar_fld.bm_fld;
		int var21 = this.ar_fld.ab_fld;
		if (var14 <= var15 && var14 <= var16) {
			if (var14 < var21) {
				if (var15 > var21) {
					var15 = var21;
				}

				if (var16 > var21) {
					var16 = var21;
				}

				if (var15 < var16) {
					int var27;
					var13 = var27 = var11 << 14;
					if (var14 < 0) {
						var13 -= var19 * var14;
						var27 -= var17 * var14;
						var14 = 0;
					}

					var12 <<= 14;
					if (var15 < 0) {
						var12 -= var18 * var15;
						var15 = 0;
					}

					if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var27 >> 14, var13 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var13 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					} else {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var27 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var12 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					}
				} else {
					int var26;
					var12 = var26 = var11 << 14;
					if (var14 < 0) {
						var12 -= var19 * var14;
						var26 -= var17 * var14;
						var14 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var18 * var16;
						var16 = 0;
					}

					if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var12 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var13 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					} else {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var26 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var26 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					}
				}
			}
		} else if (var15 <= var16) {
			if (var15 < var21) {
				if (var16 > var21) {
					var16 = var21;
				}

				if (var14 > var21) {
					var14 = var21;
				}

				if (var16 < var14) {
					int var31;
					var11 = var31 = var12 << 14;
					if (var15 < 0) {
						var11 -= var17 * var15;
						var31 -= var18 * var15;
						var15 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var19 * var16;
						var16 = 0;
					}

					if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var31 >> 14, var11 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var11 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					} else {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var31 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var13 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					}
				} else {
					int var30;
					var13 = var30 = var12 << 14;
					if (var15 < 0) {
						var13 -= var17 * var15;
						var30 -= var18 * var15;
						var15 = 0;
					}

					var11 <<= 14;
					if (var14 < 0) {
						var11 -= var19 * var14;
						var14 = 0;
					}

					if (var17 < var18) {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var30 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var30 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					} else {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var13 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var11 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					}
				}
			}
		} else if (var16 < var21) {
			if (var14 > var21) {
				var14 = var21;
			}

			if (var15 > var21) {
				var15 = var21;
			}

			if (var14 < var15) {
				int var35;
				var12 = var35 = var13 << 14;
				if (var16 < 0) {
					var12 -= var18 * var16;
					var35 -= var19 * var16;
					var16 = 0;
				}

				var11 <<= 14;
				if (var14 < 0) {
					var11 -= var17 * var14;
					var14 = 0;
				}

				if (var18 < var19) {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var35 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var11 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				} else {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var35 >> 14, var12 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var12 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				}
			} else {
				int var34;
				var11 = var34 = var13 << 14;
				if (var16 < 0) {
					var11 -= var18 * var16;
					var34 -= var19 * var16;
					var16 = 0;
				}

				var12 <<= 14;
				if (var15 < 0) {
					var12 -= var17 * var15;
					var15 = 0;
				}

				if (var18 < var19) {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var34 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var34 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				} else {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var11 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var12 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean ah() {
		return false;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void ca(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += (var13 >> 3) * var24;
			var11 += (var14 >> 3) * var24;
			var12 += (var15 >> 3) * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
				if (var19 < 0) {
					var19 = 0;
				} else if (var19 > 16256) {
					var19 = 16256;
				}
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13;
			var11 += var14;
			var12 += var15;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (this.ar_fld.aa_fld == 0) {
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 16256;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
						} while (--var18 > 0);
					}
				} else {
					int var25 = this.ar_fld.aa_fld;
					int var26 = 256 - this.ar_fld.aa_fld;
					int var27 = var16 * var26 >> 8;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							int var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 16256;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							int var183 = var1[var5];
							var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
						} while (--var18 > 0);
					}
				}
			} else if (this.ar_fld.aa_fld == 0) {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				int var173 = this.ar_fld.aa_fld;
				int var174 = 256 - this.ar_fld.aa_fld;
				int var175 = var16 * var174 >> 8;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var184 = var1[var5];
							var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var185 = var1[var5];
							var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var186 = var1[var5];
							var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var187 = var1[var5];
							var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var188 = var1[var5];
							var1[var5] = var4 + (((var188 & 16711935) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var189 = var1[var5];
							var1[var5] = var4 + (((var189 & 16711935) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var190 = var1[var5];
							var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var191 = var1[var5];
							var1[var5] = var4 + (((var191 & 16711935) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var192 = var1[var5];
							var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lfd;[IIIIII)V"
	)
	public static void in(fd var0, int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.ar_fld.ax_fld) {
				if (var6 > var0.ar_fld.ao_fld) {
					var6 = var0.ar_fld.ao_fld;
				}

				if (var5 < 0) {
					var5 = 0;
				}
			}

			if (var5 < var6) {
				var2 += var5;
				var4 = var6 - var5 >> 2;
				if (var0.ar_fld.aa_fld != 0) {
					if (var0.ar_fld.aa_fld == 254) {
						while (--var4 >= 0) {
							var1[var2++] = var1[var2];
							var1[var2++] = var1[var2];
							var1[var2++] = var1[var2];
							var1[var2++] = var1[var2];
						}

						var4 = var6 - var5 & 3;

						while (--var4 >= 0) {
							var1[var2++] = var1[var2];
						}
					} else {
						int var7 = var0.ar_fld.aa_fld;
						int var8 = 256 - var0.ar_fld.aa_fld;
						var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

						while (--var4 >= 0) {
							int var9 = var1[var2];
							var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
							var9 = var1[var2];
							var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
							var9 = var1[var2];
							var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
							var9 = var1[var2];
							var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						}

						var4 = var6 - var5 & 3;

						while (--var4 >= 0) {
							int var28 = var1[var2];
							var1[var2++] = var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00);
						}
					}
				} else {
					while (--var4 >= 0) {
						var1[var2++] = var3;
						var1[var2++] = var3;
						var1[var2++] = var3;
						var1[var2++] = var3;
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						var1[var2++] = var3;
					}
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void af(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		int var11 = (int)var4;
		int var12 = (int)var5;
		int var13 = (int)var6;
		int var14 = (int)var1;
		int var15 = (int)var2;
		int var16 = (int)var3;
		int var17 = 0;
		if (var15 != var14) {
			var17 = (var12 - var11 << 14) / (var15 - var14);
		}

		int var18 = 0;
		if (var16 != var15) {
			var18 = (var13 - var12 << 14) / (var16 - var15);
		}

		int var19 = 0;
		if (var16 != var14) {
			var19 = (var11 - var13 << 14) / (var14 - var16);
		}

		int[] var20 = this.ar_fld.bm_fld;
		int var21 = this.ar_fld.ab_fld;
		if (var14 <= var15 && var14 <= var16) {
			if (var14 < var21) {
				if (var15 > var21) {
					var15 = var21;
				}

				if (var16 > var21) {
					var16 = var21;
				}

				if (var15 < var16) {
					int var27;
					var13 = var27 = var11 << 14;
					if (var14 < 0) {
						var13 -= var19 * var14;
						var27 -= var17 * var14;
						var14 = 0;
					}

					var12 <<= 14;
					if (var15 < 0) {
						var12 -= var18 * var15;
						var15 = 0;
					}

					if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var27 >> 14, var13 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var13 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					} else {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var27 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var12 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					}
				} else {
					int var26;
					var12 = var26 = var11 << 14;
					if (var14 < 0) {
						var12 -= var19 * var14;
						var26 -= var17 * var14;
						var14 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var18 * var16;
						var16 = 0;
					}

					if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var12 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var13 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					} else {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var26 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var26 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					}
				}
			}
		} else if (var15 <= var16) {
			if (var15 < var21) {
				if (var16 > var21) {
					var16 = var21;
				}

				if (var14 > var21) {
					var14 = var21;
				}

				if (var16 < var14) {
					int var31;
					var11 = var31 = var12 << 14;
					if (var15 < 0) {
						var11 -= var17 * var15;
						var31 -= var18 * var15;
						var15 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var19 * var16;
						var16 = 0;
					}

					if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var31 >> 14, var11 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var11 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					} else {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var31 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var13 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					}
				} else {
					int var30;
					var13 = var30 = var12 << 14;
					if (var15 < 0) {
						var13 -= var17 * var15;
						var30 -= var18 * var15;
						var15 = 0;
					}

					var11 <<= 14;
					if (var14 < 0) {
						var11 -= var19 * var14;
						var14 = 0;
					}

					if (var17 < var18) {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var30 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var30 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					} else {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var13 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var11 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					}
				}
			}
		} else if (var16 < var21) {
			if (var14 > var21) {
				var14 = var21;
			}

			if (var15 > var21) {
				var15 = var21;
			}

			if (var14 < var15) {
				int var35;
				var12 = var35 = var13 << 14;
				if (var16 < 0) {
					var12 -= var18 * var16;
					var35 -= var19 * var16;
					var16 = 0;
				}

				var11 <<= 14;
				if (var14 < 0) {
					var11 -= var17 * var14;
					var14 = 0;
				}

				if (var18 < var19) {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var35 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var11 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				} else {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var35 >> 14, var12 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var12 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				}
			} else {
				int var34;
				var11 = var34 = var13 << 14;
				if (var16 < 0) {
					var11 -= var18 * var16;
					var34 -= var19 * var16;
					var16 = 0;
				}

				var12 <<= 14;
				if (var15 < 0) {
					var12 -= var17 * var15;
					var15 = 0;
				}

				if (var18 < var19) {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var34 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var34 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				} else {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var11 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var12 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				}
			}
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	void cq(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			if (this.ar_fld.aa_fld != 0) {
				if (this.ar_fld.aa_fld == 254) {
					while (--var4 >= 0) {
						client.no(var1, var2++, var1[var2], 255 - super.ar_fld.aa_fld);
						client.no(var1, var2++, var1[var2], 255 - super.ar_fld.aa_fld);
						client.no(var1, var2++, var1[var2], 255 - super.ar_fld.aa_fld);
						client.no(var1, var2++, var1[var2], 255 - super.ar_fld.aa_fld);
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						client.no(var1, var2++, var1[var2], 255 - super.ar_fld.aa_fld);
					}
				} else {
					int var7 = this.ar_fld.aa_fld;
					int var8 = 256 - this.ar_fld.aa_fld;
					var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

					while (--var4 >= 0) {
						int var9 = var1[var2];
						client.no(var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.ar_fld.aa_fld);
						var9 = var1[var2];
						client.no(var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.ar_fld.aa_fld);
						var9 = var1[var2];
						client.no(var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.ar_fld.aa_fld);
						var9 = var1[var2];
						client.no(var1, var2++, var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.ar_fld.aa_fld);
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						int var28 = var1[var2];
						client.no(var1, var2++, var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00), 255 - super.ar_fld.aa_fld);
					}
				}
			} else {
				while (--var4 >= 0) {
					client.no(var1, var2++, var3, 255 - super.ar_fld.aa_fld);
					client.no(var1, var2++, var3, 255 - super.ar_fld.aa_fld);
					client.no(var1, var2++, var3, 255 - super.ar_fld.aa_fld);
					client.no(var1, var2++, var3, 255 - super.ar_fld.aa_fld);
				}

				var4 = var6 - var5 & 3;

				while (--var4 >= 0) {
					client.no(var1, var2++, var3, 255 - super.ar_fld.aa_fld);
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	@Override
	void al(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) {
		try {
			int[] var23 = this.ar_fld.aq_fld.az(var22, -386542318);
			if (var23 == null) {
				int var72 = this.ar_fld.aq_fld.av(var22, (byte)-62);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var72, var10), ag(var72, var11), ag(var72, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1180503331);
				int var24 = (int)var4;
				int var25 = (int)var5;
				int var26 = (int)var6;
				int var27 = (int)var1;
				int var28 = (int)var2;
				int var29 = (int)var3;
				int var30 = var25 - var24;
				int var31 = var28 - var27;
				int var32 = var26 - var24;
				int var33 = var29 - var27;
				int var34 = var11 - var10;
				int var35 = var12 - var10;
				int var36 = 0;
				if (var28 != var27) {
					var36 = (var25 - var24 << 14) / (var28 - var27);
				}

				int var37 = 0;
				if (var29 != var28) {
					var37 = (var26 - var25 << 14) / (var29 - var28);
				}

				int var38 = 0;
				if (var29 != var27) {
					var38 = (var24 - var26 << 14) / (var27 - var29);
				}

				int var39 = var30 * var33 - var32 * var31;
				if (var39 != 0) {
					int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
					int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
					int var42 = this.ar_fld.ai_fld;
					var14 = var13 - var14;
					var17 = var16 - var17;
					var20 = var19 - var20;
					var15 -= var13;
					var18 -= var16;
					var21 -= var19;
					int var43 = var15 * var16 - var18 * var13 << 14;
					int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
					int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
					int var46 = var14 * var16 - var17 * var13 << 14;
					int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
					int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
					int var49 = var17 * var15 - var14 * var18 << 14;
					int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
					int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
					int[] var52 = this.ar_fld.bm_fld;
					int var53 = this.ar_fld.ab_fld;
					if (var27 <= var28 && var27 <= var29) {
						if (var27 < var53) {
							if (var28 > var53) {
								var28 = var53;
							}

							if (var29 > var53) {
								var29 = var53;
							}

							var10 = (var10 << 9) - var40 * var24 + var40;
							if (var28 < var29) {
								int var71;
								var26 = var71 = var24 << 14;
								if (var27 < 0) {
									var26 -= var38 * var27;
									var71 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var25 <<= 14;
								if (var28 < 0) {
									var25 -= var37 * var28;
									var28 = 0;
								}

								int var143 = var27 - this.ar_fld.ad_fld;
								var43 += var45 * var143;
								var46 += var48 * var143;
								var49 += var51 * var143;
								if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var71 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var71 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var70;
								var25 = var70 = var24 << 14;
								if (var27 < 0) {
									var25 -= var38 * var27;
									var70 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var37 * var29;
									var29 = 0;
								}

								int var142 = var27 - this.ar_fld.ad_fld;
								var43 += var45 * var142;
								var46 += var48 * var142;
								var49 += var51 * var142;
								if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var70 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var25 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var28 <= var29) {
						if (var28 < var53) {
							if (var29 > var53) {
								var29 = var53;
							}

							if (var27 > var53) {
								var27 = var53;
							}

							var11 = (var11 << 9) - var40 * var25 + var40;
							if (var29 < var27) {
								int var76;
								var24 = var76 = var25 << 14;
								if (var28 < 0) {
									var24 -= var36 * var28;
									var76 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var38 * var29;
									var29 = 0;
								}

								int var141 = var28 - this.ar_fld.ad_fld;
								var43 += var45 * var141;
								var46 += var48 * var141;
								var49 += var51 * var141;
								if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var76 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var76 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var75;
								var26 = var75 = var25 << 14;
								if (var28 < 0) {
									var26 -= var36 * var28;
									var75 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var24 <<= 14;
								if (var27 < 0) {
									var24 -= var38 * var27;
									var27 = 0;
								}

								int var140 = var28 - this.ar_fld.ad_fld;
								var43 += var45 * var140;
								var46 += var48 * var140;
								var49 += var51 * var140;
								if (var36 < var37) {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var26 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var75 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var29 < var53) {
						if (var27 > var53) {
							var27 = var53;
						}

						if (var28 > var53) {
							var28 = var53;
						}

						var12 = (var12 << 9) - var40 * var26 + var40;
						if (var27 < var28) {
							int var80;
							var25 = var80 = var26 << 14;
							if (var29 < 0) {
								var25 -= var37 * var29;
								var80 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var24 <<= 14;
							if (var27 < 0) {
								var24 -= var36 * var27;
								var27 = 0;
							}

							int var139 = var29 - this.ar_fld.ad_fld;
							var43 += var45 * var139;
							var46 += var48 * var139;
							var49 += var51 * var139;
							if (var37 < var38) {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var80 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var80 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							int var79;
							var24 = var79 = var26 << 14;
							if (var29 < 0) {
								var24 -= var37 * var29;
								var79 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var25 <<= 14;
							if (var28 < 0) {
								var25 -= var36 * var28;
								var28 = 0;
							}

							int var54 = var29 - this.ar_fld.ad_fld;
							var43 += var45 * var54;
							var46 += var48 * var54;
							var49 += var51 * var54;
							if (var37 < var38) {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var24 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var79 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				}
			}
		} catch (Throwable var56) {
			throw new RuntimeException(var56);
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void cr(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += var13 * var24;
			var11 += var14 * var24;
			var12 += var15 * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13 * var18;
			var11 += var14 * var18;
			var12 += var15 * var18;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	@Override
	void au(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) {
		try {
			int[] var23 = this.ar_fld.aq_fld.az(var22, -386542318);
			if (var23 == null) {
				int var73 = this.ar_fld.aq_fld.av(var22, (byte)-25);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var73, var10), ag(var73, var11), ag(var73, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1562465766);
				int var24 = (int)var4;
				int var25 = (int)var5;
				int var26 = (int)var6;
				int var27 = (int)var1;
				int var28 = (int)var2;
				int var29 = (int)var3;
				int var30 = var25 - var24;
				int var31 = var28 - var27;
				int var32 = var26 - var24;
				int var33 = var29 - var27;
				int var34 = var11 - var10;
				int var35 = var12 - var10;
				int var36 = 0;
				if (var28 != var27) {
					var36 = (var25 - var24 << 14) / (var28 - var27);
				}

				int var37 = 0;
				if (var29 != var28) {
					var37 = (var26 - var25 << 14) / (var29 - var28);
				}

				int var38 = 0;
				if (var29 != var27) {
					var38 = (var24 - var26 << 14) / (var27 - var29);
				}

				int var39 = var30 * var33 - var32 * var31;
				if (var39 != 0) {
					int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
					int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
					int var42 = this.ar_fld.ai_fld;
					var14 = var13 - var14;
					var17 = var16 - var17;
					var20 = var19 - var20;
					var15 -= var13;
					var18 -= var16;
					var21 -= var19;
					int var43 = var15 * var16 - var18 * var13 << 14;
					int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
					int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
					int var46 = var14 * var16 - var17 * var13 << 14;
					int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
					int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
					int var49 = var17 * var15 - var14 * var18 << 14;
					int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
					int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
					int[] var52 = this.ar_fld.bm_fld;
					int var53 = this.ar_fld.ab_fld;
					int var54 = this.ar_fld.ad_fld;
					if (var27 <= var28 && var27 <= var29) {
						if (var27 < var53) {
							if (var28 > var53) {
								var28 = var53;
							}

							if (var29 > var53) {
								var29 = var53;
							}

							var10 = (var10 << 9) - var40 * var24 + var40;
							if (var28 < var29) {
								int var72;
								var26 = var72 = var24 << 14;
								if (var27 < 0) {
									var26 -= var38 * var27;
									var72 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var25 <<= 14;
								if (var28 < 0) {
									var25 -= var37 * var28;
									var28 = 0;
								}

								int var144 = var27 - var54;
								var43 += var45 * var144;
								var46 += var48 * var144;
								var49 += var51 * var144;
								if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var27, var72 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var72 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.ce(al_fld, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var27, var26 >> 14, var72 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var72 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.ce(al_fld, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var71;
								var25 = var71 = var24 << 14;
								if (var27 < 0) {
									var25 -= var38 * var27;
									var71 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var37 * var29;
									var29 = 0;
								}

								int var143 = var27 - var54;
								var43 += var45 * var143;
								var46 += var48 * var143;
								var49 += var51 * var143;
								if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var27, var71 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.ce(al_fld, var23, 0, 0, var27, var71 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var27, var25 >> 14, var71 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.ce(al_fld, var23, 0, 0, var27, var26 >> 14, var71 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var28 <= var29) {
						if (var28 < var53) {
							if (var29 > var53) {
								var29 = var53;
							}

							if (var27 > var53) {
								var27 = var53;
							}

							var11 = (var11 << 9) - var40 * var25 + var40;
							if (var29 < var27) {
								int var77;
								var24 = var77 = var25 << 14;
								if (var28 < 0) {
									var24 -= var36 * var28;
									var77 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var38 * var29;
									var29 = 0;
								}

								int var142 = var28 - var54;
								var43 += var45 * var142;
								var46 += var48 * var142;
								var49 += var51 * var142;
								if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var28, var77 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var77 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.ce(al_fld, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var28, var24 >> 14, var77 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var77 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.ce(al_fld, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var76;
								var26 = var76 = var25 << 14;
								if (var28 < 0) {
									var26 -= var36 * var28;
									var76 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var24 <<= 14;
								if (var27 < 0) {
									var24 -= var38 * var27;
									var27 = 0;
								}

								int var141 = var28 - var54;
								var43 += var45 * var141;
								var46 += var48 * var141;
								var49 += var51 * var141;
								if (var36 < var37) {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var28, var26 >> 14, var76 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.ce(al_fld, var23, 0, 0, var28, var24 >> 14, var76 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var28, var76 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.ce(al_fld, var23, 0, 0, var28, var76 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var29 < var53) {
						if (var27 > var53) {
							var27 = var53;
						}

						if (var28 > var53) {
							var28 = var53;
						}

						var12 = (var12 << 9) - var40 * var26 + var40;
						if (var27 < var28) {
							int var81;
							var25 = var81 = var26 << 14;
							if (var29 < 0) {
								var25 -= var37 * var29;
								var81 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var24 <<= 14;
							if (var27 < 0) {
								var24 -= var36 * var27;
								var27 = 0;
							}

							int var140 = var29 - var54;
							var43 += var45 * var140;
							var46 += var48 * var140;
							var49 += var51 * var140;
							if (var37 < var38) {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.ce(al_fld, var23, 0, 0, var29, var25 >> 14, var81 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var81 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.ce(al_fld, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.ce(al_fld, var23, 0, 0, var29, var81 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var81 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.ce(al_fld, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							int var80;
							var24 = var80 = var26 << 14;
							if (var29 < 0) {
								var24 -= var37 * var29;
								var80 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var25 <<= 14;
							if (var28 < 0) {
								var25 -= var36 * var28;
								var28 = 0;
							}

							int var55 = var29 - var54;
							var43 += var45 * var55;
							var46 += var48 * var55;
							var49 += var51 * var55;
							if (var37 < var38) {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.ce(al_fld, var23, 0, 0, var29, var24 >> 14, var80 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.ce(al_fld, var23, 0, 0, var29, var25 >> 14, var80 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.ce(al_fld, var23, 0, 0, var29, var80 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.ce(al_fld, var23, 0, 0, var29, var80 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				}
			}
		} catch (Throwable var57) {
			throw new RuntimeException(var57);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void ce(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += var13 * var24;
			var11 += var14 * var24;
			var12 += var15 * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13 * var18;
			var11 += var14 * var18;
			var12 += var15 * var18;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void cn(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += (var13 >> 3) * var24;
			var11 += (var14 >> 3) * var24;
			var12 += (var15 >> 3) * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
				if (var19 < 0) {
					var19 = 0;
				} else if (var19 > 16256) {
					var19 = 16256;
				}
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13;
			var11 += var14;
			var12 += var15;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (this.ar_fld.aa_fld == 0) {
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 16256;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
							var3 += var17;
						} while (--var18 > 0);
					}
				} else {
					int var25 = this.ar_fld.aa_fld;
					int var26 = 256 - this.ar_fld.aa_fld;
					int var27 = var16 * var26 >> 8;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							int var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 16256;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							int var183 = var1[var5];
							var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8) | 0xFF000000;
							var3 += var17;
						} while (--var18 > 0);
					}
				}
			} else if (this.ar_fld.aa_fld == 0) {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8 | 0xFF000000;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				int var173 = this.ar_fld.aa_fld;
				int var174 = 256 - this.ar_fld.aa_fld;
				int var175 = var16 * var174 >> 8;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var184 = var1[var5];
							var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var185 = var1[var5];
							var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var186 = var1[var5];
							var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var187 = var1[var5];
							var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var188 = var1[var5];
							var1[var5] = var4 + (((var188 & 16711935) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var189 = var1[var5];
							var1[var5] = var4 + (((var189 & 16711935) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var190 = var1[var5];
							var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var191 = var1[var5];
							var1[var5] = var4 + (((var191 & 16711935) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var192 = var1[var5];
							var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8) | 0xFF000000;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	fd(fo var1) {
		super(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	@Override
	void ar(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = (int)var4;
		int var14 = (int)var5;
		int var15 = (int)var6;
		int var16 = (int)var1;
		int var17 = (int)var2;
		int var18 = (int)var3;
		int var19 = var14 - var13;
		int var20 = var17 - var16;
		int var21 = var15 - var13;
		int var22 = var18 - var16;
		int var23 = var11 - var10;
		int var24 = var12 - var10;
		int var25;
		if (var18 != var17) {
			var25 = (var15 - var14 << 14) / (var18 - var17);
		} else {
			var25 = 0;
		}

		int var26;
		if (var17 != var16) {
			var26 = (var19 << 14) / var20;
		} else {
			var26 = 0;
		}

		int var27;
		if (var18 != var16) {
			var27 = (var21 << 14) / var22;
		} else {
			var27 = 0;
		}

		int var28 = var19 * var22 - var21 * var20;
		if (var28 != 0) {
			int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
			int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
			int[] var31 = this.ar_fld.bm_fld;
			int var32 = this.ar_fld.ab_fld;
			if (var16 <= var17 && var16 <= var18) {
				if (var16 < var32) {
					if (var17 > var32) {
						var17 = var32;
					}

					if (var18 > var32) {
						var18 = var32;
					}

					var10 = (var10 << 8) - var29 * var13 + var29;
					if (var17 < var18) {
						int var41;
						var15 = var41 = var13 << 14;
						if (var16 < 0) {
							var15 -= var27 * var16;
							var41 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var14 <<= 14;
						if (var17 < 0) {
							var14 -= var25 * var17;
							var17 = 0;
						}

						if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
							var18 -= var17;
							var17 -= var16;

							for (var16 = var31[var16]; --var17 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var41 += var26;
								var10 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var14 += var25;
								var10 += var30;
								var16 += au_fld;
							}
						} else {
							var18 -= var17;
							var17 -= var16;

							for (var16 = var31[var16]; --var17 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
								var15 += var27;
								var41 += var26;
								var10 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
								var15 += var27;
								var14 += var25;
								var10 += var30;
								var16 += au_fld;
							}
						}
					} else {
						int var40;
						var14 = var40 = var13 << 14;
						if (var16 < 0) {
							var14 -= var27 * var16;
							var40 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var25 * var18;
							var18 = 0;
						}

						if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
							var17 -= var18;
							var18 -= var16;

							for (var16 = var31[var16]; --var18 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
								var14 += var27;
								var40 += var26;
								var10 += var30;
							}

							while (--var17 >= 0) {
								ob(this, al_fld, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
								var15 += var25;
								var40 += var26;
								var10 += var30;
								var16 += au_fld;
							}
						} else {
							var17 -= var18;
							var18 -= var16;

							for (var16 = var31[var16]; --var18 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
								var14 += var27;
								var40 += var26;
								var10 += var30;
							}

							while (--var17 >= 0) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
								var15 += var25;
								var40 += var26;
								var10 += var30;
								var16 += au_fld;
							}
						}
					}
				}
			} else if (var17 <= var18) {
				if (var17 < var32) {
					if (var18 > var32) {
						var18 = var32;
					}

					if (var16 > var32) {
						var16 = var32;
					}

					var11 = (var11 << 8) - var29 * var14 + var29;
					if (var18 < var16) {
						int var45;
						var13 = var45 = var14 << 14;
						if (var17 < 0) {
							var13 -= var26 * var17;
							var45 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var27 * var18;
							var18 = 0;
						}

						if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
							var16 -= var18;
							var18 -= var17;

							for (var17 = var31[var17]; --var18 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var45 += var25;
								var11 += var30;
							}

							while (--var16 >= 0) {
								ob(this, al_fld, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var15 += var27;
								var11 += var30;
								var17 += au_fld;
							}
						} else {
							var16 -= var18;
							var18 -= var17;

							for (var17 = var31[var17]; --var18 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
								var13 += var26;
								var45 += var25;
								var11 += var30;
							}

							while (--var16 >= 0) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
								var13 += var26;
								var15 += var27;
								var11 += var30;
								var17 += au_fld;
							}
						}
					} else {
						int var44;
						var15 = var44 = var14 << 14;
						if (var17 < 0) {
							var15 -= var26 * var17;
							var44 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var13 <<= 14;
						if (var16 < 0) {
							var13 -= var27 * var16;
							var16 = 0;
						}

						if (var26 < var25) {
							var18 -= var16;
							var16 -= var17;

							for (var17 = var31[var17]; --var16 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
								var15 += var26;
								var44 += var25;
								var11 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
								var13 += var27;
								var44 += var25;
								var11 += var30;
								var17 += au_fld;
							}
						} else {
							var18 -= var16;
							var16 -= var17;

							for (var17 = var31[var17]; --var16 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
								var15 += var26;
								var44 += var25;
								var11 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
								var13 += var27;
								var44 += var25;
								var11 += var30;
								var17 += au_fld;
							}
						}
					}
				}
			} else if (var18 < var32) {
				if (var16 > var32) {
					var16 = var32;
				}

				if (var17 > var32) {
					var17 = var32;
				}

				var12 = (var12 << 8) - var29 * var15 + var29;
				if (var16 < var17) {
					int var49;
					var14 = var49 = var15 << 14;
					if (var18 < 0) {
						var14 -= var25 * var18;
						var49 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var26 * var16;
						var16 = 0;
					}

					if (var25 < var27) {
						var17 -= var16;
						var16 -= var18;

						for (var18 = var31[var18]; --var16 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
							var14 += var25;
							var49 += var27;
							var12 += var30;
						}

						while (--var17 >= 0) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
							var14 += var25;
							var13 += var26;
							var12 += var30;
							var18 += au_fld;
						}
					} else {
						var17 -= var16;
						var16 -= var18;

						for (var18 = var31[var18]; --var16 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var49 += var27;
							var12 += var30;
						}

						while (--var17 >= 0) {
							ob(this, al_fld, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var13 += var26;
							var12 += var30;
							var18 += au_fld;
						}
					}
				} else {
					int var48;
					var13 = var48 = var15 << 14;
					if (var18 < 0) {
						var13 -= var25 * var18;
						var48 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var14 <<= 14;
					if (var17 < 0) {
						var14 -= var26 * var17;
						var17 = 0;
					}

					if (var25 < var27) {
						var16 -= var17;
						var17 -= var18;

						for (var18 = var31[var18]; --var17 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
							var13 += var25;
							var48 += var27;
							var12 += var30;
						}

						while (--var16 >= 0) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
							var14 += var26;
							var48 += var27;
							var12 += var30;
							var18 += au_fld;
						}
					} else {
						var16 -= var17;
						var17 -= var18;

						for (var18 = var31[var18]; --var17 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
							var13 += var25;
							var48 += var27;
							var12 += var30;
						}

						while (--var16 >= 0) {
							ob(this, al_fld, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
							var14 += var26;
							var48 += var27;
							var12 += var30;
							var18 += au_fld;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	@Override
	void bx(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = (int)var4;
		int var14 = (int)var5;
		int var15 = (int)var6;
		int var16 = (int)var1;
		int var17 = (int)var2;
		int var18 = (int)var3;
		int var19 = var14 - var13;
		int var20 = var17 - var16;
		int var21 = var15 - var13;
		int var22 = var18 - var16;
		int var23 = var11 - var10;
		int var24 = var12 - var10;
		int var25;
		if (var18 != var17) {
			var25 = (var15 - var14 << 14) / (var18 - var17);
		} else {
			var25 = 0;
		}

		int var26;
		if (var17 != var16) {
			var26 = (var19 << 14) / var20;
		} else {
			var26 = 0;
		}

		int var27;
		if (var18 != var16) {
			var27 = (var21 << 14) / var22;
		} else {
			var27 = 0;
		}

		int var28 = var19 * var22 - var21 * var20;
		if (var28 != 0) {
			int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
			int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
			int[] var31 = this.ar_fld.bm_fld;
			int var32 = this.ar_fld.ab_fld;
			if (var16 <= var17 && var16 <= var18) {
				if (var16 < var32) {
					if (var17 > var32) {
						var17 = var32;
					}

					if (var18 > var32) {
						var18 = var32;
					}

					var10 = (var10 << 8) - var29 * var13 + var29;
					if (var17 < var18) {
						int var41;
						var15 = var41 = var13 << 14;
						if (var16 < 0) {
							var15 -= var27 * var16;
							var41 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var14 <<= 14;
						if (var17 < 0) {
							var14 -= var25 * var17;
							var17 = 0;
						}

						if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
							var18 -= var17;
							var17 -= var16;

							for (var16 = var31[var16]; --var17 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var41 += var26;
								var10 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var14 += var25;
								var10 += var30;
								var16 += au_fld;
							}
						} else {
							var18 -= var17;
							var17 -= var16;

							for (var16 = var31[var16]; --var17 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
								var15 += var27;
								var41 += var26;
								var10 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
								var15 += var27;
								var14 += var25;
								var10 += var30;
								var16 += au_fld;
							}
						}
					} else {
						int var40;
						var14 = var40 = var13 << 14;
						if (var16 < 0) {
							var14 -= var27 * var16;
							var40 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var25 * var18;
							var18 = 0;
						}

						if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
							var17 -= var18;
							var18 -= var16;

							for (var16 = var31[var16]; --var18 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
								var14 += var27;
								var40 += var26;
								var10 += var30;
							}

							while (--var17 >= 0) {
								ob(this, al_fld, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
								var15 += var25;
								var40 += var26;
								var10 += var30;
								var16 += au_fld;
							}
						} else {
							var17 -= var18;
							var18 -= var16;

							for (var16 = var31[var16]; --var18 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
								var14 += var27;
								var40 += var26;
								var10 += var30;
							}

							while (--var17 >= 0) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
								var15 += var25;
								var40 += var26;
								var10 += var30;
								var16 += au_fld;
							}
						}
					}
				}
			} else if (var17 <= var18) {
				if (var17 < var32) {
					if (var18 > var32) {
						var18 = var32;
					}

					if (var16 > var32) {
						var16 = var32;
					}

					var11 = (var11 << 8) - var29 * var14 + var29;
					if (var18 < var16) {
						int var45;
						var13 = var45 = var14 << 14;
						if (var17 < 0) {
							var13 -= var26 * var17;
							var45 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var27 * var18;
							var18 = 0;
						}

						if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
							var16 -= var18;
							var18 -= var17;

							for (var17 = var31[var17]; --var18 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var45 += var25;
								var11 += var30;
							}

							while (--var16 >= 0) {
								ob(this, al_fld, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var15 += var27;
								var11 += var30;
								var17 += au_fld;
							}
						} else {
							var16 -= var18;
							var18 -= var17;

							for (var17 = var31[var17]; --var18 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
								var13 += var26;
								var45 += var25;
								var11 += var30;
							}

							while (--var16 >= 0) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
								var13 += var26;
								var15 += var27;
								var11 += var30;
								var17 += au_fld;
							}
						}
					} else {
						int var44;
						var15 = var44 = var14 << 14;
						if (var17 < 0) {
							var15 -= var26 * var17;
							var44 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var13 <<= 14;
						if (var16 < 0) {
							var13 -= var27 * var16;
							var16 = 0;
						}

						if (var26 < var25) {
							var18 -= var16;
							var16 -= var17;

							for (var17 = var31[var17]; --var16 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
								var15 += var26;
								var44 += var25;
								var11 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
								var13 += var27;
								var44 += var25;
								var11 += var30;
								var17 += au_fld;
							}
						} else {
							var18 -= var16;
							var16 -= var17;

							for (var17 = var31[var17]; --var16 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
								var15 += var26;
								var44 += var25;
								var11 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
								var13 += var27;
								var44 += var25;
								var11 += var30;
								var17 += au_fld;
							}
						}
					}
				}
			} else if (var18 < var32) {
				if (var16 > var32) {
					var16 = var32;
				}

				if (var17 > var32) {
					var17 = var32;
				}

				var12 = (var12 << 8) - var29 * var15 + var29;
				if (var16 < var17) {
					int var49;
					var14 = var49 = var15 << 14;
					if (var18 < 0) {
						var14 -= var25 * var18;
						var49 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var26 * var16;
						var16 = 0;
					}

					if (var25 < var27) {
						var17 -= var16;
						var16 -= var18;

						for (var18 = var31[var18]; --var16 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
							var14 += var25;
							var49 += var27;
							var12 += var30;
						}

						while (--var17 >= 0) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
							var14 += var25;
							var13 += var26;
							var12 += var30;
							var18 += au_fld;
						}
					} else {
						var17 -= var16;
						var16 -= var18;

						for (var18 = var31[var18]; --var16 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var49 += var27;
							var12 += var30;
						}

						while (--var17 >= 0) {
							ob(this, al_fld, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var13 += var26;
							var12 += var30;
							var18 += au_fld;
						}
					}
				} else {
					int var48;
					var13 = var48 = var15 << 14;
					if (var18 < 0) {
						var13 -= var25 * var18;
						var48 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var14 <<= 14;
					if (var17 < 0) {
						var14 -= var26 * var17;
						var17 = 0;
					}

					if (var25 < var27) {
						var16 -= var17;
						var17 -= var18;

						for (var18 = var31[var18]; --var17 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
							var13 += var25;
							var48 += var27;
							var12 += var30;
						}

						while (--var16 >= 0) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
							var14 += var26;
							var48 += var27;
							var12 += var30;
							var18 += au_fld;
						}
					} else {
						var16 -= var17;
						var17 -= var18;

						for (var18 = var31[var18]; --var17 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
							var13 += var25;
							var48 += var27;
							var12 += var30;
						}

						while (--var16 >= 0) {
							ob(this, al_fld, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
							var14 += var26;
							var48 += var27;
							var12 += var30;
							var18 += au_fld;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	@Override
	void bl(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = (int)var4;
		int var14 = (int)var5;
		int var15 = (int)var6;
		int var16 = (int)var1;
		int var17 = (int)var2;
		int var18 = (int)var3;
		int var19 = var14 - var13;
		int var20 = var17 - var16;
		int var21 = var15 - var13;
		int var22 = var18 - var16;
		int var23 = var11 - var10;
		int var24 = var12 - var10;
		int var25;
		if (var18 != var17) {
			var25 = (var15 - var14 << 14) / (var18 - var17);
		} else {
			var25 = 0;
		}

		int var26;
		if (var17 != var16) {
			var26 = (var19 << 14) / var20;
		} else {
			var26 = 0;
		}

		int var27;
		if (var18 != var16) {
			var27 = (var21 << 14) / var22;
		} else {
			var27 = 0;
		}

		int var28 = var19 * var22 - var21 * var20;
		if (var28 != 0) {
			int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
			int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
			int[] var31 = this.ar_fld.bm_fld;
			int var32 = this.ar_fld.ab_fld;
			if (var16 <= var17 && var16 <= var18) {
				if (var16 < var32) {
					if (var17 > var32) {
						var17 = var32;
					}

					if (var18 > var32) {
						var18 = var32;
					}

					var10 = (var10 << 8) - var29 * var13 + var29;
					if (var17 < var18) {
						int var41;
						var15 = var41 = var13 << 14;
						if (var16 < 0) {
							var15 -= var27 * var16;
							var41 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var14 <<= 14;
						if (var17 < 0) {
							var14 -= var25 * var17;
							var17 = 0;
						}

						if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
							var18 -= var17;
							var17 -= var16;

							for (var16 = var31[var16]; --var17 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var41 += var26;
								var10 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var14 += var25;
								var10 += var30;
								var16 += au_fld;
							}
						} else {
							var18 -= var17;
							var17 -= var16;

							for (var16 = var31[var16]; --var17 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
								var15 += var27;
								var41 += var26;
								var10 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
								var15 += var27;
								var14 += var25;
								var10 += var30;
								var16 += au_fld;
							}
						}
					} else {
						int var40;
						var14 = var40 = var13 << 14;
						if (var16 < 0) {
							var14 -= var27 * var16;
							var40 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var25 * var18;
							var18 = 0;
						}

						if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
							var17 -= var18;
							var18 -= var16;

							for (var16 = var31[var16]; --var18 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
								var14 += var27;
								var40 += var26;
								var10 += var30;
							}

							while (--var17 >= 0) {
								ob(this, al_fld, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
								var15 += var25;
								var40 += var26;
								var10 += var30;
								var16 += au_fld;
							}
						} else {
							var17 -= var18;
							var18 -= var16;

							for (var16 = var31[var16]; --var18 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
								var14 += var27;
								var40 += var26;
								var10 += var30;
							}

							while (--var17 >= 0) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
								var15 += var25;
								var40 += var26;
								var10 += var30;
								var16 += au_fld;
							}
						}
					}
				}
			} else if (var17 <= var18) {
				if (var17 < var32) {
					if (var18 > var32) {
						var18 = var32;
					}

					if (var16 > var32) {
						var16 = var32;
					}

					var11 = (var11 << 8) - var29 * var14 + var29;
					if (var18 < var16) {
						int var45;
						var13 = var45 = var14 << 14;
						if (var17 < 0) {
							var13 -= var26 * var17;
							var45 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var27 * var18;
							var18 = 0;
						}

						if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
							var16 -= var18;
							var18 -= var17;

							for (var17 = var31[var17]; --var18 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var45 += var25;
								var11 += var30;
							}

							while (--var16 >= 0) {
								ob(this, al_fld, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var15 += var27;
								var11 += var30;
								var17 += au_fld;
							}
						} else {
							var16 -= var18;
							var18 -= var17;

							for (var17 = var31[var17]; --var18 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
								var13 += var26;
								var45 += var25;
								var11 += var30;
							}

							while (--var16 >= 0) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
								var13 += var26;
								var15 += var27;
								var11 += var30;
								var17 += au_fld;
							}
						}
					} else {
						int var44;
						var15 = var44 = var14 << 14;
						if (var17 < 0) {
							var15 -= var26 * var17;
							var44 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var13 <<= 14;
						if (var16 < 0) {
							var13 -= var27 * var16;
							var16 = 0;
						}

						if (var26 < var25) {
							var18 -= var16;
							var16 -= var17;

							for (var17 = var31[var17]; --var16 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
								var15 += var26;
								var44 += var25;
								var11 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
								var13 += var27;
								var44 += var25;
								var11 += var30;
								var17 += au_fld;
							}
						} else {
							var18 -= var16;
							var16 -= var17;

							for (var17 = var31[var17]; --var16 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
								var15 += var26;
								var44 += var25;
								var11 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
								var13 += var27;
								var44 += var25;
								var11 += var30;
								var17 += au_fld;
							}
						}
					}
				}
			} else if (var18 < var32) {
				if (var16 > var32) {
					var16 = var32;
				}

				if (var17 > var32) {
					var17 = var32;
				}

				var12 = (var12 << 8) - var29 * var15 + var29;
				if (var16 < var17) {
					int var49;
					var14 = var49 = var15 << 14;
					if (var18 < 0) {
						var14 -= var25 * var18;
						var49 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var26 * var16;
						var16 = 0;
					}

					if (var25 < var27) {
						var17 -= var16;
						var16 -= var18;

						for (var18 = var31[var18]; --var16 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
							var14 += var25;
							var49 += var27;
							var12 += var30;
						}

						while (--var17 >= 0) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
							var14 += var25;
							var13 += var26;
							var12 += var30;
							var18 += au_fld;
						}
					} else {
						var17 -= var16;
						var16 -= var18;

						for (var18 = var31[var18]; --var16 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var49 += var27;
							var12 += var30;
						}

						while (--var17 >= 0) {
							ob(this, al_fld, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var13 += var26;
							var12 += var30;
							var18 += au_fld;
						}
					}
				} else {
					int var48;
					var13 = var48 = var15 << 14;
					if (var18 < 0) {
						var13 -= var25 * var18;
						var48 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var14 <<= 14;
					if (var17 < 0) {
						var14 -= var26 * var17;
						var17 = 0;
					}

					if (var25 < var27) {
						var16 -= var17;
						var17 -= var18;

						for (var18 = var31[var18]; --var17 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
							var13 += var25;
							var48 += var27;
							var12 += var30;
						}

						while (--var16 >= 0) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
							var14 += var26;
							var48 += var27;
							var12 += var30;
							var18 += au_fld;
						}
					} else {
						var16 -= var17;
						var17 -= var18;

						for (var18 = var31[var18]; --var17 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
							var13 += var25;
							var48 += var27;
							var12 += var30;
						}

						while (--var16 >= 0) {
							ob(this, al_fld, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
							var14 += var26;
							var48 += var27;
							var12 += var30;
							var18 += au_fld;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void bt(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		int var11 = (int)var4;
		int var12 = (int)var5;
		int var13 = (int)var6;
		int var14 = (int)var1;
		int var15 = (int)var2;
		int var16 = (int)var3;
		int var17 = 0;
		if (var15 != var14) {
			var17 = (var12 - var11 << 14) / (var15 - var14);
		}

		int var18 = 0;
		if (var16 != var15) {
			var18 = (var13 - var12 << 14) / (var16 - var15);
		}

		int var19 = 0;
		if (var16 != var14) {
			var19 = (var11 - var13 << 14) / (var14 - var16);
		}

		int[] var20 = this.ar_fld.bm_fld;
		int var21 = this.ar_fld.ab_fld;
		if (var14 <= var15 && var14 <= var16) {
			if (var14 < var21) {
				if (var15 > var21) {
					var15 = var21;
				}

				if (var16 > var21) {
					var16 = var21;
				}

				if (var15 < var16) {
					int var27;
					var13 = var27 = var11 << 14;
					if (var14 < 0) {
						var13 -= var19 * var14;
						var27 -= var17 * var14;
						var14 = 0;
					}

					var12 <<= 14;
					if (var15 < 0) {
						var12 -= var18 * var15;
						var15 = 0;
					}

					if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var27 >> 14, var13 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var13 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					} else {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var27 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var12 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					}
				} else {
					int var26;
					var12 = var26 = var11 << 14;
					if (var14 < 0) {
						var12 -= var19 * var14;
						var26 -= var17 * var14;
						var14 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var18 * var16;
						var16 = 0;
					}

					if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var12 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var13 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					} else {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var26 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var26 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					}
				}
			}
		} else if (var15 <= var16) {
			if (var15 < var21) {
				if (var16 > var21) {
					var16 = var21;
				}

				if (var14 > var21) {
					var14 = var21;
				}

				if (var16 < var14) {
					int var31;
					var11 = var31 = var12 << 14;
					if (var15 < 0) {
						var11 -= var17 * var15;
						var31 -= var18 * var15;
						var15 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var19 * var16;
						var16 = 0;
					}

					if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var31 >> 14, var11 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var11 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					} else {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var31 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var13 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					}
				} else {
					int var30;
					var13 = var30 = var12 << 14;
					if (var15 < 0) {
						var13 -= var17 * var15;
						var30 -= var18 * var15;
						var15 = 0;
					}

					var11 <<= 14;
					if (var14 < 0) {
						var11 -= var19 * var14;
						var14 = 0;
					}

					if (var17 < var18) {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var30 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var30 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					} else {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var13 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var11 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					}
				}
			}
		} else if (var16 < var21) {
			if (var14 > var21) {
				var14 = var21;
			}

			if (var15 > var21) {
				var15 = var21;
			}

			if (var14 < var15) {
				int var35;
				var12 = var35 = var13 << 14;
				if (var16 < 0) {
					var12 -= var18 * var16;
					var35 -= var19 * var16;
					var16 = 0;
				}

				var11 <<= 14;
				if (var14 < 0) {
					var11 -= var17 * var14;
					var14 = 0;
				}

				if (var18 < var19) {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var35 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var11 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				} else {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var35 >> 14, var12 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var12 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				}
			} else {
				int var34;
				var11 = var34 = var13 << 14;
				if (var16 < 0) {
					var11 -= var18 * var16;
					var34 -= var19 * var16;
					var16 = 0;
				}

				var12 <<= 14;
				if (var15 < 0) {
					var12 -= var17 * var15;
					var15 = 0;
				}

				if (var18 < var19) {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var34 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var34 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				} else {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var11 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var12 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				}
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void bv(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		int var11 = (int)var4;
		int var12 = (int)var5;
		int var13 = (int)var6;
		int var14 = (int)var1;
		int var15 = (int)var2;
		int var16 = (int)var3;
		int var17 = 0;
		if (var15 != var14) {
			var17 = (var12 - var11 << 14) / (var15 - var14);
		}

		int var18 = 0;
		if (var16 != var15) {
			var18 = (var13 - var12 << 14) / (var16 - var15);
		}

		int var19 = 0;
		if (var16 != var14) {
			var19 = (var11 - var13 << 14) / (var14 - var16);
		}

		int[] var20 = this.ar_fld.bm_fld;
		int var21 = this.ar_fld.ab_fld;
		if (var14 <= var15 && var14 <= var16) {
			if (var14 < var21) {
				if (var15 > var21) {
					var15 = var21;
				}

				if (var16 > var21) {
					var16 = var21;
				}

				if (var15 < var16) {
					int var27;
					var13 = var27 = var11 << 14;
					if (var14 < 0) {
						var13 -= var19 * var14;
						var27 -= var17 * var14;
						var14 = 0;
					}

					var12 <<= 14;
					if (var15 < 0) {
						var12 -= var18 * var15;
						var15 = 0;
					}

					if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var27 >> 14, var13 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var13 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					} else {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var27 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var12 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					}
				} else {
					int var26;
					var12 = var26 = var11 << 14;
					if (var14 < 0) {
						var12 -= var19 * var14;
						var26 -= var17 * var14;
						var14 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var18 * var16;
						var16 = 0;
					}

					if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var12 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var13 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					} else {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var26 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var26 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					}
				}
			}
		} else if (var15 <= var16) {
			if (var15 < var21) {
				if (var16 > var21) {
					var16 = var21;
				}

				if (var14 > var21) {
					var14 = var21;
				}

				if (var16 < var14) {
					int var31;
					var11 = var31 = var12 << 14;
					if (var15 < 0) {
						var11 -= var17 * var15;
						var31 -= var18 * var15;
						var15 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var19 * var16;
						var16 = 0;
					}

					if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var31 >> 14, var11 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var11 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					} else {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var31 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var13 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					}
				} else {
					int var30;
					var13 = var30 = var12 << 14;
					if (var15 < 0) {
						var13 -= var17 * var15;
						var30 -= var18 * var15;
						var15 = 0;
					}

					var11 <<= 14;
					if (var14 < 0) {
						var11 -= var19 * var14;
						var14 = 0;
					}

					if (var17 < var18) {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var30 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var30 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					} else {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var13 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var11 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					}
				}
			}
		} else if (var16 < var21) {
			if (var14 > var21) {
				var14 = var21;
			}

			if (var15 > var21) {
				var15 = var21;
			}

			if (var14 < var15) {
				int var35;
				var12 = var35 = var13 << 14;
				if (var16 < 0) {
					var12 -= var18 * var16;
					var35 -= var19 * var16;
					var16 = 0;
				}

				var11 <<= 14;
				if (var14 < 0) {
					var11 -= var17 * var14;
					var14 = 0;
				}

				if (var18 < var19) {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var35 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var11 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				} else {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var35 >> 14, var12 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var12 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				}
			} else {
				int var34;
				var11 = var34 = var13 << 14;
				if (var16 < 0) {
					var11 -= var18 * var16;
					var34 -= var19 * var16;
					var16 = 0;
				}

				var12 <<= 14;
				if (var15 < 0) {
					var12 -= var17 * var15;
					var15 = 0;
				}

				if (var18 < var19) {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var34 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var34 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				} else {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var11 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var12 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				}
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean be() {
		return false;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void cx(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += (var13 >> 3) * var24;
			var11 += (var14 >> 3) * var24;
			var12 += (var15 >> 3) * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
				if (var19 < 0) {
					var19 = 0;
				} else if (var19 > 16256) {
					var19 = 885839846;
				}
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13;
			var11 += var14;
			var12 += var15;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (this.ar_fld.aa_fld == 0) {
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -1182763239) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 755412605) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & -1147140823) * var16 & -16711936) + ((var4 & 2014621577) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 1718384168) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -263501883) + ((var4 & -644893535) * var16 & 749106772) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 1735996789) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 2037143234) * var16 & -872329967) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 1961156716) + (var3 >>> 25)];
							var1[var5++] = ((var4 & -1828589340) * var16 & -905452892) + ((var4 & 0xFF00) * var16 & -262096228) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 1480345913) * var16 & -2062200705) + ((var4 & 575784660) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & 998534632) + ((var4 & 2037715390) * var16 & -1287232362) >> 8;
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > -1198856990) {
									var21 = 879902742;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 2093542458) * var16 & -1180012721) + ((var4 & -797767873) * var16 & 0xFF0000) >> 8;
							var3 += var17;
						} while (--var18 > 0);
					}
				} else {
					int var25 = this.ar_fld.aa_fld;
					int var26 = 256 - this.ar_fld.aa_fld;
					int var27 = var16 * var26 >> 8;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 806196409) + (var3 >>> 25)];
							var4 = ((var4 & -1679114645) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 978749211) >> 8;
							int var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 1906029511) * var27 & 289737574 | (var4 & -64646320) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & -2146105193) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 921504476) * var27 & -180238121 | (var4 & -104279139) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -860536069 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & -455763675) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -218050785 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 1142779722) * var25 & 1605022564) >> 8);
							var3 += var17;
							var4 = var2[(var3 & -1501471537) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -1900064033 | (var4 & 0xFF00) * var27 & 439231958) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & -707916308) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 1430915554) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 240363671) + (var3 >>> 25)];
							var4 = ((var4 & 291697912) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & -1920776583) * var25 & -1530433461 | (var28 & -1611176221) * var25 & -1951924843) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & -1874359820) * var27 & 345951079 | (var4 & 0xFF00) * var27 & -1420174001) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & -727649645) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 365747235) * var27 & -16711936 | (var4 & 1893296098) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -2091408548 | (var28 & 164095399) * var25 & -116281879) >> 8);
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 1557303407;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & -2099422116) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & 1922362812 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							int var183 = var1[var5];
							var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
						} while (--var18 > 0);
					}
				}
			} else if (this.ar_fld.aa_fld == 0) {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 1405830774) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 1500512206) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & -755830189) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & -895755214) * var16 & -16711936) + ((var4 & 1463746649) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 817121469) * var16 & -16711936) + ((var4 & 404625614) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & -689727032) * var16 & -16711936) + ((var4 & -123980412) * var16 & 1635742100) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -873426204) + ((var4 & 36780311) * var16 & 1635626743) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 330230722) * var16 & -16711936) + ((var4 & 2020651234) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 1368302225) * var16 & -2143668569) + ((var4 & -1447596960) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > -441437946) {
								var21 = 289469689;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 953142277) >> 8;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				int var173 = this.ar_fld.aa_fld;
				int var174 = -245886350 - this.ar_fld.aa_fld;
				int var175 = var16 * var174 >> 8;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & 932615350 | (var4 & 363913941) * var175 & 0xFF0000) >> 8;
							int var184 = var1[var5];
							var1[var5] = var4 + (((var184 & -317008792) * var173 & -16711936 | (var184 & 0xFF00) * var173 & -1620785910) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & -259692824) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var185 = var1[var5];
							var1[var5] = var4 + (((var185 & 1960981246) * var173 & -16711936 | (var185 & 0xFF00) * var173 & -1666583457) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & -2042876325) * var175 & 0xFF0000) >> 8;
							int var186 = var1[var5];
							var1[var5] = var4 + (((var186 & 16711935) * var173 & -1282678071 | (var186 & 0xFF00) * var173 & 1817086018) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var187 = var1[var5];
							var1[var5] = var4 + (((var187 & 193670547) * var173 & -16711936 | (var187 & 0xFF00) * var173 & -1166375249) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 881848651) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 1071011942) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 140054454) >> 8;
							int var188 = var1[var5];
							var1[var5] = var4 + (((var188 & -540370386) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & -1553348067) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & -1446471731) * var175 & -1940998895) >> 8;
							int var189 = var1[var5];
							var1[var5] = var4 + (((var189 & 2140854766) * var173 & 1146243732 | (var189 & -393260692) * var173 & 416178510) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 1226212378) * var175 & 587521840 | (var4 & 1315750344) * var175 & 677693914) >> 8;
							int var190 = var1[var5];
							var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 1350743306) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 1290980791) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & -71984032) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var191 = var1[var5];
							var1[var5] = var4 + (((var191 & 16711935) * var173 & 1963140336 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 1876751005) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 1154434033) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & 1415866690 | (var4 & 0xFF00) * var175 & 86285674) >> 8;
							int var192 = var1[var5];
							var1[var5] = var4 + (((var192 & 16711935) * var173 & -664089544 | (var192 & 0xFF00) * var173 & 389485703) >> 8);
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	@Override
	void bn(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) {
		try {
			int[] var23 = this.ar_fld.aq_fld.az(var22, -386542318);
			if (var23 == null) {
				int var72 = this.ar_fld.aq_fld.av(var22, (byte)-22);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var72, var10), ag(var72, var11), ag(var72, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1682755123);
				int var24 = (int)var4;
				int var25 = (int)var5;
				int var26 = (int)var6;
				int var27 = (int)var1;
				int var28 = (int)var2;
				int var29 = (int)var3;
				int var30 = var25 - var24;
				int var31 = var28 - var27;
				int var32 = var26 - var24;
				int var33 = var29 - var27;
				int var34 = var11 - var10;
				int var35 = var12 - var10;
				int var36 = 0;
				if (var28 != var27) {
					var36 = (var25 - var24 << 14) / (var28 - var27);
				}

				int var37 = 0;
				if (var29 != var28) {
					var37 = (var26 - var25 << 14) / (var29 - var28);
				}

				int var38 = 0;
				if (var29 != var27) {
					var38 = (var24 - var26 << 14) / (var27 - var29);
				}

				int var39 = var30 * var33 - var32 * var31;
				if (var39 != 0) {
					int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
					int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
					int var42 = this.ar_fld.ai_fld;
					var14 = var13 - var14;
					var17 = var16 - var17;
					var20 = var19 - var20;
					var15 -= var13;
					var18 -= var16;
					var21 -= var19;
					int var43 = var15 * var16 - var18 * var13 << 14;
					int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
					int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
					int var46 = var14 * var16 - var17 * var13 << 14;
					int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
					int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
					int var49 = var17 * var15 - var14 * var18 << 14;
					int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
					int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
					int[] var52 = this.ar_fld.bm_fld;
					int var53 = this.ar_fld.ab_fld;
					if (var27 <= var28 && var27 <= var29) {
						if (var27 < var53) {
							if (var28 > var53) {
								var28 = var53;
							}

							if (var29 > var53) {
								var29 = var53;
							}

							var10 = (var10 << 9) - var40 * var24 + var40;
							if (var28 < var29) {
								int var71;
								var26 = var71 = var24 << 14;
								if (var27 < 0) {
									var26 -= var38 * var27;
									var71 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var25 <<= 14;
								if (var28 < 0) {
									var25 -= var37 * var28;
									var28 = 0;
								}

								int var143 = var27 - this.ar_fld.ad_fld;
								var43 += var45 * var143;
								var46 += var48 * var143;
								var49 += var51 * var143;
								if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var71 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var71 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var70;
								var25 = var70 = var24 << 14;
								if (var27 < 0) {
									var25 -= var38 * var27;
									var70 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var37 * var29;
									var29 = 0;
								}

								int var142 = var27 - this.ar_fld.ad_fld;
								var43 += var45 * var142;
								var46 += var48 * var142;
								var49 += var51 * var142;
								if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var70 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var25 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var28 <= var29) {
						if (var28 < var53) {
							if (var29 > var53) {
								var29 = var53;
							}

							if (var27 > var53) {
								var27 = var53;
							}

							var11 = (var11 << 9) - var40 * var25 + var40;
							if (var29 < var27) {
								int var76;
								var24 = var76 = var25 << 14;
								if (var28 < 0) {
									var24 -= var36 * var28;
									var76 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var38 * var29;
									var29 = 0;
								}

								int var141 = var28 - this.ar_fld.ad_fld;
								var43 += var45 * var141;
								var46 += var48 * var141;
								var49 += var51 * var141;
								if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var76 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var76 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var75;
								var26 = var75 = var25 << 14;
								if (var28 < 0) {
									var26 -= var36 * var28;
									var75 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var24 <<= 14;
								if (var27 < 0) {
									var24 -= var38 * var27;
									var27 = 0;
								}

								int var140 = var28 - this.ar_fld.ad_fld;
								var43 += var45 * var140;
								var46 += var48 * var140;
								var49 += var51 * var140;
								if (var36 < var37) {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var26 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var75 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var29 < var53) {
						if (var27 > var53) {
							var27 = var53;
						}

						if (var28 > var53) {
							var28 = var53;
						}

						var12 = (var12 << 9) - var40 * var26 + var40;
						if (var27 < var28) {
							int var80;
							var25 = var80 = var26 << 14;
							if (var29 < 0) {
								var25 -= var37 * var29;
								var80 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var24 <<= 14;
							if (var27 < 0) {
								var24 -= var36 * var27;
								var27 = 0;
							}

							int var139 = var29 - this.ar_fld.ad_fld;
							var43 += var45 * var139;
							var46 += var48 * var139;
							var49 += var51 * var139;
							if (var37 < var38) {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var80 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var80 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							int var79;
							var24 = var79 = var26 << 14;
							if (var29 < 0) {
								var24 -= var37 * var29;
								var79 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var25 <<= 14;
							if (var28 < 0) {
								var25 -= var36 * var28;
								var28 = 0;
							}

							int var54 = var29 - this.ar_fld.ad_fld;
							var43 += var45 * var54;
							var46 += var48 * var54;
							var49 += var51 * var54;
							if (var37 < var38) {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var24 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var79 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				}
			}
		} catch (Throwable var56) {
			throw new RuntimeException(var56);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	@Override
	void bc(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) {
		try {
			int[] var23 = this.ar_fld.aq_fld.az(var22, -386542318);
			if (var23 == null) {
				int var73 = this.ar_fld.aq_fld.av(var22, (byte)-99);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var73, var10), ag(var73, var11), ag(var73, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1476088238);
				int var24 = (int)var4;
				int var25 = (int)var5;
				int var26 = (int)var6;
				int var27 = (int)var1;
				int var28 = (int)var2;
				int var29 = (int)var3;
				int var30 = var25 - var24;
				int var31 = var28 - var27;
				int var32 = var26 - var24;
				int var33 = var29 - var27;
				int var34 = var11 - var10;
				int var35 = var12 - var10;
				int var36 = 0;
				if (var28 != var27) {
					var36 = (var25 - var24 << 14) / (var28 - var27);
				}

				int var37 = 0;
				if (var29 != var28) {
					var37 = (var26 - var25 << 14) / (var29 - var28);
				}

				int var38 = 0;
				if (var29 != var27) {
					var38 = (var24 - var26 << 14) / (var27 - var29);
				}

				int var39 = var30 * var33 - var32 * var31;
				if (var39 != 0) {
					int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
					int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
					int var42 = this.ar_fld.ai_fld;
					var14 = var13 - var14;
					var17 = var16 - var17;
					var20 = var19 - var20;
					var15 -= var13;
					var18 -= var16;
					var21 -= var19;
					int var43 = var15 * var16 - var18 * var13 << 14;
					int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var42);
					int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
					int var46 = var14 * var16 - var17 * var13 << 14;
					int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var42);
					int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
					int var49 = var17 * var15 - var14 * var18 << 14;
					int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var42);
					int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
					int[] var52 = this.ar_fld.bm_fld;
					int var53 = this.ar_fld.ab_fld;
					int var54 = this.ar_fld.ad_fld;
					if (var27 <= var28 && var27 <= var29) {
						if (var27 < var53) {
							if (var28 > var53) {
								var28 = var53;
							}

							if (var29 > var53) {
								var29 = var53;
							}

							var10 = (var10 << 9) - var40 * var24 + var40;
							if (var28 < var29) {
								int var72;
								var26 = var72 = var24 << 14;
								if (var27 < 0) {
									var26 -= var38 * var27;
									var72 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var25 <<= 14;
								if (var28 < 0) {
									var25 -= var37 * var28;
									var28 = 0;
								}

								int var144 = var27 - var54;
								var43 += var45 * var144;
								var46 += var48 * var144;
								var49 += var51 * var144;
								if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var27, var72 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var72 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.ce(al_fld, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var27, var26 >> 14, var72 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var72 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.ce(al_fld, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var71;
								var25 = var71 = var24 << 14;
								if (var27 < 0) {
									var25 -= var38 * var27;
									var71 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var37 * var29;
									var29 = 0;
								}

								int var143 = var27 - var54;
								var43 += var45 * var143;
								var46 += var48 * var143;
								var49 += var51 * var143;
								if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var27, var71 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.ce(al_fld, var23, 0, 0, var27, var71 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var27, var25 >> 14, var71 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.ce(al_fld, var23, 0, 0, var27, var26 >> 14, var71 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var28 <= var29) {
						if (var28 < var53) {
							if (var29 > var53) {
								var29 = var53;
							}

							if (var27 > var53) {
								var27 = var53;
							}

							var11 = (var11 << 9) - var40 * var25 + var40;
							if (var29 < var27) {
								int var77;
								var24 = var77 = var25 << 14;
								if (var28 < 0) {
									var24 -= var36 * var28;
									var77 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var38 * var29;
									var29 = 0;
								}

								int var142 = var28 - var54;
								var43 += var45 * var142;
								var46 += var48 * var142;
								var49 += var51 * var142;
								if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var28, var77 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var77 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.ce(al_fld, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var28, var24 >> 14, var77 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var77 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.ce(al_fld, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var76;
								var26 = var76 = var25 << 14;
								if (var28 < 0) {
									var26 -= var36 * var28;
									var76 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var24 <<= 14;
								if (var27 < 0) {
									var24 -= var38 * var27;
									var27 = 0;
								}

								int var141 = var28 - var54;
								var43 += var45 * var141;
								var46 += var48 * var141;
								var49 += var51 * var141;
								if (var36 < var37) {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var28, var26 >> 14, var76 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.ce(al_fld, var23, 0, 0, var28, var24 >> 14, var76 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.ce(al_fld, var23, 0, 0, var28, var76 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.ce(al_fld, var23, 0, 0, var28, var76 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var29 < var53) {
						if (var27 > var53) {
							var27 = var53;
						}

						if (var28 > var53) {
							var28 = var53;
						}

						var12 = (var12 << 9) - var40 * var26 + var40;
						if (var27 < var28) {
							int var81;
							var25 = var81 = var26 << 14;
							if (var29 < 0) {
								var25 -= var37 * var29;
								var81 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var24 <<= 14;
							if (var27 < 0) {
								var24 -= var36 * var27;
								var27 = 0;
							}

							int var140 = var29 - var54;
							var43 += var45 * var140;
							var46 += var48 * var140;
							var49 += var51 * var140;
							if (var37 < var38) {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.ce(al_fld, var23, 0, 0, var29, var25 >> 14, var81 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var81 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.ce(al_fld, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.ce(al_fld, var23, 0, 0, var29, var81 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var81 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.ce(al_fld, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							int var80;
							var24 = var80 = var26 << 14;
							if (var29 < 0) {
								var24 -= var37 * var29;
								var80 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var25 <<= 14;
							if (var28 < 0) {
								var25 -= var36 * var28;
								var28 = 0;
							}

							int var55 = var29 - var54;
							var43 += var45 * var55;
							var46 += var48 * var55;
							var49 += var51 * var55;
							if (var37 < var38) {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.ce(al_fld, var23, 0, 0, var29, var24 >> 14, var80 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.ce(al_fld, var23, 0, 0, var29, var25 >> 14, var80 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.ce(al_fld, var23, 0, 0, var29, var80 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.ce(al_fld, var23, 0, 0, var29, var80 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				}
			}
		} catch (Throwable var57) {
			throw new RuntimeException(var57);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([IIIIIIII)V"
	)
	final void bb(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var7 += var8 * var5;
			if (this.ar_fld.an_fld) {
				var4 = var6 - var5 >> 2;
				var8 <<= 2;
				if (this.ar_fld.aa_fld == 0) {
					if (var4 > 0) {
						do {
							int var35 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = this.as_fld[var35];
							var7 += var8;
							var1[var2++] = var3;
							var1[var2++] = var3;
							var1[var2++] = var3;
							var1[var2++] = var3;
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var36 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = this.as_fld[var36];

						do {
							var1[var2++] = var3;
						} while (--var4 > 0);
					}
				} else {
					int var37 = this.ar_fld.aa_fld;
					int var38 = 256 - this.ar_fld.aa_fld;
					if (var4 > 0) {
						do {
							int var39 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = this.as_fld[var39];
							var7 += var8;
							var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
							int var41 = var1[var2];
							var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
							var41 = var1[var2];
							var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
							var41 = var1[var2];
							var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
							var41 = var1[var2];
							var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var40 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = this.as_fld[var40];
						var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

						do {
							int var45 = var1[var2];
							var1[var2++] = var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00);
						} while (--var4 > 0);
					}
				}
			} else {
				var4 = var6 - var5;
				if (this.ar_fld.aa_fld == 0) {
					do {
						int var9 = (var7 & ~(var7 >> 31)) >> 8;
						var1[var2++] = this.as_fld[var9];
						var7 += var8;
					} while (--var4 > 0);
				} else {
					int var34 = this.ar_fld.aa_fld;
					int var10 = 256 - this.ar_fld.aa_fld;

					do {
						int var11 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = this.as_fld[var11];
						var7 += var8;
						var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
						int var12 = var1[var2];
						var1[var2++] = var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00);
					} while (--var4 > 0);
				}
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	void cy(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			if (this.ar_fld.aa_fld != 0) {
				if (this.ar_fld.aa_fld == -148976278) {
					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
					}
				} else {
					int var7 = this.ar_fld.aa_fld;
					int var8 = 256 - this.ar_fld.aa_fld;
					var3 = ((var3 & -104591292) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

					while (--var4 >= 0) {
						int var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 967630710) * var7 >> 8 & 109740570) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & -1062577389) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 637945) * var7 >> 8 & 1785025681) + ((var9 & -1287625499) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 1472775336) * var7 >> 8 & 16711935) + ((var9 & 1800505173) * var7 >> 8 & 0xFF00);
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						int var28 = var1[var2];
						var1[var2++] = var3 + ((var28 & 671889841) * var7 >> 8 & -1060142974) + ((var28 & -1949603242) * var7 >> 8 & 0xFF00);
					}
				}
			} else {
				while (--var4 >= 0) {
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
				}

				var4 = var6 - var5 & 3;

				while (--var4 >= 0) {
					var1[var2++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	void cf(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			if (this.ar_fld.aa_fld != 0) {
				if (this.ar_fld.aa_fld == -275393184) {
					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
					}
				} else {
					int var7 = this.ar_fld.aa_fld;
					int var8 = 23720699 - this.ar_fld.aa_fld;
					var3 = ((var3 & 856406988) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 1893326031);

					while (--var4 >= 0) {
						int var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & -1259126517);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 1950352373) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & -1376893782) + ((var9 & 0xFF00) * var7 >> 8 & 1361672641);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 1384921808) * var7 >> 8 & -714789862) + ((var9 & 1286596288) * var7 >> 8 & 0xFF00);
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						int var28 = var1[var2];
						var1[var2++] = var3 + ((var28 & -345919020) * var7 >> 8 & 16711935) + ((var28 & 951390929) * var7 >> 8 & -130348953);
					}
				}
			} else {
				while (--var4 >= 0) {
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
				}

				var4 = var6 - var5 & 3;

				while (--var4 >= 0) {
					var1[var2++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lfd;[IIIIIIII)V"
	)
	public static void bm(fd var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var0.ar_fld.ax_fld) {
			if (var6 > var0.ar_fld.ao_fld) {
				var6 = var0.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var7 += var8 * var5;
			if (var0.ar_fld.an_fld) {
				var4 = var6 - var5 >> 2;
				var8 <<= 2;
				if (var0.ar_fld.aa_fld == 0) {
					if (var4 > 0) {
						do {
							int var35 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = var0.as_fld[var35];
							var7 += var8;
							var1[var2++] = var3;
							var1[var2++] = var3;
							var1[var2++] = var3;
							var1[var2++] = var3;
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var36 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = var0.as_fld[var36];

						do {
							var1[var2++] = var3;
						} while (--var4 > 0);
					}
				} else {
					int var37 = var0.ar_fld.aa_fld;
					int var38 = 256 - var0.ar_fld.aa_fld;
					if (var4 > 0) {
						do {
							int var39 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = var0.as_fld[var39];
							var7 += var8;
							var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
							int var41 = var1[var2];
							var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
							var41 = var1[var2];
							var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
							var41 = var1[var2];
							var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
							var41 = var1[var2];
							var1[var2++] = var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00);
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var40 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = var0.as_fld[var40];
						var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

						do {
							int var45 = var1[var2];
							var1[var2++] = var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00);
						} while (--var4 > 0);
					}
				}
			} else {
				var4 = var6 - var5;
				if (var0.ar_fld.aa_fld == 0) {
					do {
						int var9 = (var7 & ~(var7 >> 31)) >> 8;
						var1[var2++] = var0.as_fld[var9];
						var7 += var8;
					} while (--var4 > 0);
				} else {
					int var34 = var0.ar_fld.aa_fld;
					int var10 = 256 - var0.ar_fld.aa_fld;

					do {
						int var11 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = var0.as_fld[var11];
						var7 += var8;
						var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
						int var12 = var1[var2];
						var1[var2++] = var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00);
					} while (--var4 > 0);
				}
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	void cv(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			if (this.ar_fld.aa_fld != 0) {
				if (this.ar_fld.aa_fld == 254) {
					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
					}
				} else {
					int var7 = this.ar_fld.aa_fld;
					int var8 = 256 - this.ar_fld.aa_fld;
					var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

					while (--var4 >= 0) {
						int var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						int var28 = var1[var2];
						var1[var2++] = var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00);
					}
				}
			} else {
				while (--var4 >= 0) {
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
				}

				var4 = var6 - var5 & 3;

				while (--var4 >= 0) {
					var1[var2++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	void ba(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			if (this.ar_fld.aa_fld != 0) {
				if (this.ar_fld.aa_fld == 254) {
					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
					}
				} else {
					int var7 = this.ar_fld.aa_fld;
					int var8 = 256 - this.ar_fld.aa_fld;
					var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

					while (--var4 >= 0) {
						int var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						int var28 = var1[var2];
						var1[var2++] = var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00);
					}
				}
			} else {
				while (--var4 >= 0) {
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
				}

				var4 = var6 - var5 & 3;

				while (--var4 >= 0) {
					var1[var2++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lfd;[IIIIIIII)V"
	)
	public static void ob(fd var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ar_fld.ax_fld) {
			if (var6 > var0.ar_fld.ao_fld) {
				var6 = var0.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var7 += var8 * var5;
			if (var0.ar_fld.an_fld) {
				var4 = var6 - var5 >> 2;
				var8 <<= 2;
				if (var0.ar_fld.aa_fld == 0) {
					if (var4 > 0) {
						do {
							int var35 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = var0.as_fld[var35];
							var7 += var8;
							client.no(var1, var2++, var3, 255 - var0.ar_fld.aa_fld);
							client.no(var1, var2++, var3, 255 - var0.ar_fld.aa_fld);
							client.no(var1, var2++, var3, 255 - var0.ar_fld.aa_fld);
							client.no(var1, var2++, var3, 255 - var0.ar_fld.aa_fld);
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var36 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = var0.as_fld[var36];

						do {
							client.no(var1, var2++, var3, 255 - var0.ar_fld.aa_fld);
						} while (--var4 > 0);
					}
				} else {
					int var37 = var0.ar_fld.aa_fld;
					int var38 = 256 - var0.ar_fld.aa_fld;
					if (var4 > 0) {
						do {
							int var39 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = var0.as_fld[var39];
							var7 += var8;
							var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
							int var41 = var1[var2];
							client.no(var1, var2++, var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - var0.ar_fld.aa_fld);
							var41 = var1[var2];
							client.no(var1, var2++, var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - var0.ar_fld.aa_fld);
							var41 = var1[var2];
							client.no(var1, var2++, var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - var0.ar_fld.aa_fld);
							var41 = var1[var2];
							client.no(var1, var2++, var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - var0.ar_fld.aa_fld);
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var40 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = var0.as_fld[var40];
						var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

						do {
							int var45 = var1[var2];
							client.no(var1, var2++, var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - var0.ar_fld.aa_fld);
						} while (--var4 > 0);
					}
				}
			} else {
				var4 = var6 - var5;
				if (var0.ar_fld.aa_fld == 0) {
					do {
						int var9 = (var7 & ~(var7 >> 31)) >> 8;
						client.no(var1, var2++, var0.as_fld[var9], 255 - var0.ar_fld.aa_fld);
						var7 += var8;
					} while (--var4 > 0);
				} else {
					int var34 = var0.ar_fld.aa_fld;
					int var10 = 256 - var0.ar_fld.aa_fld;

					do {
						int var11 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = var0.as_fld[var11];
						var7 += var8;
						var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
						int var12 = var1[var2];
						client.no(var1, var2++, var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00), 255 - var0.ar_fld.aa_fld);
					} while (--var4 > 0);
				}
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V"
	)
	@Override
	void bu(
		float var1,
		float var2,
		float var3,
		float var4,
		float var5,
		float var6,
		float var7,
		float var8,
		float var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17,
		int var18,
		int var19,
		int var20,
		int var21,
		int var22
	) {
		try {
			int[] var23 = this.ar_fld.aq_fld.az(var22, -386542318);
			if (var23 == null) {
				int var72 = this.ar_fld.aq_fld.av(var22, (byte)-79);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var72, var10), ag(var72, var11), ag(var72, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1852794950);
				int var24 = (int)var4;
				int var25 = (int)var5;
				int var26 = (int)var6;
				int var27 = (int)var1;
				int var28 = (int)var2;
				int var29 = (int)var3;
				int var30 = var25 - var24;
				int var31 = var28 - var27;
				int var32 = var26 - var24;
				int var33 = var29 - var27;
				int var34 = var11 - var10;
				int var35 = var12 - var10;
				int var36 = 0;
				if (var28 != var27) {
					var36 = (var25 - var24 << 14) / (var28 - var27);
				}

				int var37 = 0;
				if (var29 != var28) {
					var37 = (var26 - var25 << 14) / (var29 - var28);
				}

				int var38 = 0;
				if (var29 != var27) {
					var38 = (var24 - var26 << 14) / (var27 - var29);
				}

				int var39 = var30 * var33 - var32 * var31;
				if (var39 != 0) {
					int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
					int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
					int var42 = this.ar_fld.ai_fld;
					var14 = var13 - var14;
					var17 = var16 - var17;
					var20 = var19 - var20;
					var15 -= var13;
					var18 -= var16;
					var21 -= var19;
					int var43 = var15 * var16 - var18 * var13 << 14;
					int var44 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var42);
					int var45 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var42);
					int var46 = var14 * var16 - var17 * var13 << 14;
					int var47 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var42);
					int var48 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var42);
					int var49 = var17 * var15 - var14 * var18 << 14;
					int var50 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var42);
					int var51 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var42);
					int[] var52 = this.ar_fld.bm_fld;
					int var53 = this.ar_fld.ab_fld;
					if (var27 <= var28 && var27 <= var29) {
						if (var27 < var53) {
							if (var28 > var53) {
								var28 = var53;
							}

							if (var29 > var53) {
								var29 = var53;
							}

							var10 = (var10 << 9) - var40 * var24 + var40;
							if (var28 < var29) {
								int var71;
								var26 = var71 = var24 << 14;
								if (var27 < 0) {
									var26 -= var38 * var27;
									var71 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var25 <<= 14;
								if (var28 < 0) {
									var25 -= var37 * var28;
									var28 = 0;
								}

								int var143 = var27 - this.ar_fld.ad_fld;
								var43 += var45 * var143;
								var46 += var48 * var143;
								var49 += var51 * var143;
								if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var71 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var28;
									var28 -= var27;

									for (var27 = var52[var27]; --var28 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var71 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var71 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var38;
										var25 += var37;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var70;
								var25 = var70 = var24 << 14;
								if (var27 < 0) {
									var25 -= var38 * var27;
									var70 -= var36 * var27;
									var10 -= var41 * var27;
									var27 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var37 * var29;
									var29 = 0;
								}

								int var142 = var27 - this.ar_fld.ad_fld;
								var43 += var45 * var142;
								var46 += var48 * var142;
								var49 += var51 * var142;
								if ((var27 == var29 || var38 >= var36) && (var27 != var29 || var37 <= var36)) {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var70 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var70 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var28 -= var29;
									var29 -= var27;

									for (var27 = var52[var27]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var27, var25 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var25 += var38;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var28 >= 0) {
										this.cn(al_fld, var23, 0, 0, var27, var26 >> 14, var70 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
										var26 += var37;
										var70 += var36;
										var10 += var41;
										var27 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var28 <= var29) {
						if (var28 < var53) {
							if (var29 > var53) {
								var29 = var53;
							}

							if (var27 > var53) {
								var27 = var53;
							}

							var11 = (var11 << 9) - var40 * var25 + var40;
							if (var29 < var27) {
								int var76;
								var24 = var76 = var25 << 14;
								if (var28 < 0) {
									var24 -= var36 * var28;
									var76 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var26 <<= 14;
								if (var29 < 0) {
									var26 -= var38 * var29;
									var29 = 0;
								}

								int var141 = var28 - this.ar_fld.ad_fld;
								var43 += var45 * var141;
								var46 += var48 * var141;
								var49 += var51 * var141;
								if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var76 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var27 -= var29;
									var29 -= var28;

									for (var28 = var52[var28]; --var29 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var76 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var76 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var27 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var36;
										var26 += var38;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							} else {
								int var75;
								var26 = var75 = var25 << 14;
								if (var28 < 0) {
									var26 -= var36 * var28;
									var75 -= var37 * var28;
									var11 -= var41 * var28;
									var28 = 0;
								}

								var24 <<= 14;
								if (var27 < 0) {
									var24 -= var38 * var27;
									var27 = 0;
								}

								int var140 = var28 - this.ar_fld.ad_fld;
								var43 += var45 * var140;
								var46 += var48 * var140;
								var49 += var51 * var140;
								if (var36 < var37) {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var26 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var24 >> 14, var75 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								} else {
									var29 -= var27;
									var27 -= var28;

									for (var28 = var52[var28]; --var27 >= 0; var49 += var51) {
										this.cn(al_fld, var23, 0, 0, var28, var75 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var26 += var36;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
									}

									while (--var29 >= 0) {
										this.cn(al_fld, var23, 0, 0, var28, var75 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
										var24 += var38;
										var75 += var37;
										var11 += var41;
										var28 += au_fld;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}
							}
						}
					} else if (var29 < var53) {
						if (var27 > var53) {
							var27 = var53;
						}

						if (var28 > var53) {
							var28 = var53;
						}

						var12 = (var12 << 9) - var40 * var26 + var40;
						if (var27 < var28) {
							int var80;
							var25 = var80 = var26 << 14;
							if (var29 < 0) {
								var25 -= var37 * var29;
								var80 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var24 <<= 14;
							if (var27 < 0) {
								var24 -= var36 * var27;
								var27 = 0;
							}

							int var139 = var29 - this.ar_fld.ad_fld;
							var43 += var45 * var139;
							var46 += var48 * var139;
							var49 += var51 * var139;
							if (var37 < var38) {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var80 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var28 -= var27;
								var27 -= var29;

								for (var29 = var52[var29]; --var27 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var80 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var80 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var28 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var37;
									var24 += var36;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							int var79;
							var24 = var79 = var26 << 14;
							if (var29 < 0) {
								var24 -= var37 * var29;
								var79 -= var38 * var29;
								var12 -= var41 * var29;
								var29 = 0;
							}

							var25 <<= 14;
							if (var28 < 0) {
								var25 -= var36 * var28;
								var28 = 0;
							}

							int var54 = var29 - this.ar_fld.ad_fld;
							var43 += var45 * var54;
							var46 += var48 * var54;
							var49 += var51 * var54;
							if (var37 < var38) {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var24 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var25 >> 14, var79 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var27 -= var28;
								var28 -= var29;

								for (var29 = var52[var29]; --var28 >= 0; var49 += var51) {
									this.cn(al_fld, var23, 0, 0, var29, var79 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var24 += var37;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
								}

								while (--var27 >= 0) {
									this.cn(al_fld, var23, 0, 0, var29, var79 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
									var25 += var36;
									var79 += var38;
									var12 += var41;
									var29 += au_fld;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				}
			}
		} catch (Throwable var56) {
			throw new RuntimeException(var56);
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void cs(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += var13 * var24;
			var11 += var14 * var24;
			var12 += var15 * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13 * var18;
			var11 += var14 * var18;
			var12 += var15 * var18;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & -649522074) + (var3 >>> 25)];
						var1[var5++] = ((var4 & -2102675429) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & -894153219) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 112516777) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & -316039657) + (var3 >>> 25)];
						var1[var5++] = ((var4 & -2037695282) * var16 & -16711936) + ((var4 & 1839659994) * var16 & -2130419414) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 280143572) * var16 & -16711936) + ((var4 & 1426180399) * var16 & 895018285) >> 8;
						var3 += var17;
						var4 = var2[(var3 & -1103033278) + (var3 >>> 25)];
						var1[var5++] = ((var4 & -1643903039) * var16 & -626233750) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & -666011913) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -1502200298) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & 691339284) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 1451324617) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & -1870045497) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 622513144) * var16 & 209971032) + ((var4 & -2003150024) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 1650409518) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -338647292) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 1979864978) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1779958454) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & -2076880874) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -2136855571) + ((var4 & 0xFF00) * var16 & -1711632081) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 1090042670) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & -2030271302) * var16 & -1098135830) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & 529496246) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 112789134) * var16 & -855002150) + ((var4 & -534633193) * var16 & -166476146) >> 8;
						}

						var5++;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & 358687225) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void bp(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		int var11 = (int)var4;
		int var12 = (int)var5;
		int var13 = (int)var6;
		int var14 = (int)var1;
		int var15 = (int)var2;
		int var16 = (int)var3;
		int var17 = 0;
		if (var15 != var14) {
			var17 = (var12 - var11 << 14) / (var15 - var14);
		}

		int var18 = 0;
		if (var16 != var15) {
			var18 = (var13 - var12 << 14) / (var16 - var15);
		}

		int var19 = 0;
		if (var16 != var14) {
			var19 = (var11 - var13 << 14) / (var14 - var16);
		}

		int[] var20 = this.ar_fld.bm_fld;
		int var21 = this.ar_fld.ab_fld;
		if (var14 <= var15 && var14 <= var16) {
			if (var14 < var21) {
				if (var15 > var21) {
					var15 = var21;
				}

				if (var16 > var21) {
					var16 = var21;
				}

				if (var15 < var16) {
					int var27;
					var13 = var27 = var11 << 14;
					if (var14 < 0) {
						var13 -= var19 * var14;
						var27 -= var17 * var14;
						var14 = 0;
					}

					var12 <<= 14;
					if (var15 < 0) {
						var12 -= var18 * var15;
						var15 = 0;
					}

					if ((var14 == var15 || var19 >= var17) && (var14 != var15 || var19 <= var18)) {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var27 >> 14, var13 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var13 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					} else {
						var16 -= var15;
						var15 -= var14;

						for (var14 = var20[var14]; --var15 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var27 >> 14);
							var13 += var19;
							var27 += var17;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var12 >> 14);
							var13 += var19;
							var12 += var18;
							var14 += au_fld;
						}
					}
				} else {
					int var26;
					var12 = var26 = var11 << 14;
					if (var14 < 0) {
						var12 -= var19 * var14;
						var26 -= var17 * var14;
						var14 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var18 * var16;
						var16 = 0;
					}

					if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var12 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var26 >> 14, var13 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					} else {
						var15 -= var16;
						var16 -= var14;

						for (var14 = var20[var14]; --var16 >= 0; var14 += au_fld) {
							this.cq(al_fld, var14, var10, 0, var12 >> 14, var26 >> 14);
							var12 += var19;
							var26 += var17;
						}

						while (--var15 >= 0) {
							this.cq(al_fld, var14, var10, 0, var13 >> 14, var26 >> 14);
							var13 += var18;
							var26 += var17;
							var14 += au_fld;
						}
					}
				}
			}
		} else if (var15 <= var16) {
			if (var15 < var21) {
				if (var16 > var21) {
					var16 = var21;
				}

				if (var14 > var21) {
					var14 = var21;
				}

				if (var16 < var14) {
					int var31;
					var11 = var31 = var12 << 14;
					if (var15 < 0) {
						var11 -= var17 * var15;
						var31 -= var18 * var15;
						var15 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var19 * var16;
						var16 = 0;
					}

					if ((var15 == var16 || var17 >= var18) && (var15 != var16 || var17 <= var19)) {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var31 >> 14, var11 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var11 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					} else {
						var14 -= var16;
						var16 -= var15;

						for (var15 = var20[var15]; --var16 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var31 >> 14);
							var11 += var17;
							var31 += var18;
						}

						while (--var14 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var13 >> 14);
							var11 += var17;
							var13 += var19;
							var15 += au_fld;
						}
					}
				} else {
					int var30;
					var13 = var30 = var12 << 14;
					if (var15 < 0) {
						var13 -= var17 * var15;
						var30 -= var18 * var15;
						var15 = 0;
					}

					var11 <<= 14;
					if (var14 < 0) {
						var11 -= var19 * var14;
						var14 = 0;
					}

					if (var17 < var18) {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var13 >> 14, var30 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var11 >> 14, var30 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					} else {
						var16 -= var14;
						var14 -= var15;

						for (var15 = var20[var15]; --var14 >= 0; var15 += au_fld) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var13 >> 14);
							var13 += var17;
							var30 += var18;
						}

						while (--var16 >= 0) {
							this.cq(al_fld, var15, var10, 0, var30 >> 14, var11 >> 14);
							var11 += var19;
							var30 += var18;
							var15 += au_fld;
						}
					}
				}
			}
		} else if (var16 < var21) {
			if (var14 > var21) {
				var14 = var21;
			}

			if (var15 > var21) {
				var15 = var21;
			}

			if (var14 < var15) {
				int var35;
				var12 = var35 = var13 << 14;
				if (var16 < 0) {
					var12 -= var18 * var16;
					var35 -= var19 * var16;
					var16 = 0;
				}

				var11 <<= 14;
				if (var14 < 0) {
					var11 -= var17 * var14;
					var14 = 0;
				}

				if (var18 < var19) {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var35 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var11 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				} else {
					var15 -= var14;
					var14 -= var16;

					for (var16 = var20[var16]; --var14 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var35 >> 14, var12 >> 14);
						var12 += var18;
						var35 += var19;
					}

					while (--var15 >= 0) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var12 >> 14);
						var12 += var18;
						var11 += var17;
						var16 += au_fld;
					}
				}
			} else {
				int var34;
				var11 = var34 = var13 << 14;
				if (var16 < 0) {
					var11 -= var18 * var16;
					var34 -= var19 * var16;
					var16 = 0;
				}

				var12 <<= 14;
				if (var15 < 0) {
					var12 -= var17 * var15;
					var15 = 0;
				}

				if (var18 < var19) {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var11 >> 14, var34 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var12 >> 14, var34 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				} else {
					var14 -= var15;
					var15 -= var16;

					for (var16 = var20[var16]; --var15 >= 0; var16 += au_fld) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var11 >> 14);
						var11 += var18;
						var34 += var19;
					}

					while (--var14 >= 0) {
						this.cq(al_fld, var16, var10, 0, var34 >> 14, var12 >> 14);
						var12 += var17;
						var34 += var19;
						var16 += au_fld;
					}
				}
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void cp(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += (var13 >> 3) * var24;
			var11 += (var14 >> 3) * var24;
			var12 += (var15 >> 3) * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
				if (var19 < 0) {
					var19 = 0;
				} else if (var19 > 16256) {
					var19 = 16256;
				}
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13;
			var11 += var14;
			var12 += var15;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (this.ar_fld.aa_fld == 0) {
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 16256;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
						} while (--var18 > 0);
					}
				} else {
					int var25 = this.ar_fld.aa_fld;
					int var26 = 256 - this.ar_fld.aa_fld;
					int var27 = var16 * var26 >> 8;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							int var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 16256;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							int var183 = var1[var5];
							var1[var5++] = var4 + (((var183 & 16711935) * var25 & -16711936 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
						} while (--var18 > 0);
					}
				}
			} else if (this.ar_fld.aa_fld == 0) {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				int var173 = this.ar_fld.aa_fld;
				int var174 = 256 - this.ar_fld.aa_fld;
				int var175 = var16 * var174 >> 8;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var184 = var1[var5];
							var1[var5] = var4 + (((var184 & 16711935) * var173 & -16711936 | (var184 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var185 = var1[var5];
							var1[var5] = var4 + (((var185 & 16711935) * var173 & -16711936 | (var185 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var186 = var1[var5];
							var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var187 = var1[var5];
							var1[var5] = var4 + (((var187 & 16711935) * var173 & -16711936 | (var187 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var188 = var1[var5];
							var1[var5] = var4 + (((var188 & 16711935) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var189 = var1[var5];
							var1[var5] = var4 + (((var189 & 16711935) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var190 = var1[var5];
							var1[var5] = var4 + (((var190 & 16711935) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var191 = var1[var5];
							var1[var5] = var4 + (((var191 & 16711935) * var173 & -16711936 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var192 = var1[var5];
							var1[var5] = var4 + (((var192 & 16711935) * var173 & -16711936 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	@Override
	void bo(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = (int)var4;
		int var14 = (int)var5;
		int var15 = (int)var6;
		int var16 = (int)var1;
		int var17 = (int)var2;
		int var18 = (int)var3;
		int var19 = var14 - var13;
		int var20 = var17 - var16;
		int var21 = var15 - var13;
		int var22 = var18 - var16;
		int var23 = var11 - var10;
		int var24 = var12 - var10;
		int var25;
		if (var18 != var17) {
			var25 = (var15 - var14 << 14) / (var18 - var17);
		} else {
			var25 = 0;
		}

		int var26;
		if (var17 != var16) {
			var26 = (var19 << 14) / var20;
		} else {
			var26 = 0;
		}

		int var27;
		if (var18 != var16) {
			var27 = (var21 << 14) / var22;
		} else {
			var27 = 0;
		}

		int var28 = var19 * var22 - var21 * var20;
		if (var28 != 0) {
			int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
			int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
			int[] var31 = this.ar_fld.bm_fld;
			int var32 = this.ar_fld.ab_fld;
			if (var16 <= var17 && var16 <= var18) {
				if (var16 < var32) {
					if (var17 > var32) {
						var17 = var32;
					}

					if (var18 > var32) {
						var18 = var32;
					}

					var10 = (var10 << 8) - var29 * var13 + var29;
					if (var17 < var18) {
						int var41;
						var15 = var41 = var13 << 14;
						if (var16 < 0) {
							var15 -= var27 * var16;
							var41 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var14 <<= 14;
						if (var17 < 0) {
							var14 -= var25 * var17;
							var17 = 0;
						}

						if ((var16 == var17 || var27 >= var26) && (var16 != var17 || var27 <= var25)) {
							var18 -= var17;
							var17 -= var16;

							for (var16 = var31[var16]; --var17 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var41 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var41 += var26;
								var10 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var14 += var25;
								var10 += var30;
								var16 += au_fld;
							}
						} else {
							var18 -= var17;
							var17 -= var16;

							for (var16 = var31[var16]; --var17 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var41 >> 14, var10, var29);
								var15 += var27;
								var41 += var26;
								var10 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
								var15 += var27;
								var14 += var25;
								var10 += var30;
								var16 += au_fld;
							}
						}
					} else {
						int var40;
						var14 = var40 = var13 << 14;
						if (var16 < 0) {
							var14 -= var27 * var16;
							var40 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var25 * var18;
							var18 = 0;
						}

						if ((var16 == var18 || var27 >= var26) && (var16 != var18 || var25 <= var26)) {
							var17 -= var18;
							var18 -= var16;

							for (var16 = var31[var16]; --var18 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var40 >> 14, var14 >> 14, var10, var29);
								var14 += var27;
								var40 += var26;
								var10 += var30;
							}

							while (--var17 >= 0) {
								ob(this, al_fld, var16, 0, 0, var40 >> 14, var15 >> 14, var10, var29);
								var15 += var25;
								var40 += var26;
								var10 += var30;
								var16 += au_fld;
							}
						} else {
							var17 -= var18;
							var18 -= var16;

							for (var16 = var31[var16]; --var18 >= 0; var16 += au_fld) {
								ob(this, al_fld, var16, 0, 0, var14 >> 14, var40 >> 14, var10, var29);
								var14 += var27;
								var40 += var26;
								var10 += var30;
							}

							while (--var17 >= 0) {
								ob(this, al_fld, var16, 0, 0, var15 >> 14, var40 >> 14, var10, var29);
								var15 += var25;
								var40 += var26;
								var10 += var30;
								var16 += au_fld;
							}
						}
					}
				}
			} else if (var17 <= var18) {
				if (var17 < var32) {
					if (var18 > var32) {
						var18 = var32;
					}

					if (var16 > var32) {
						var16 = var32;
					}

					var11 = (var11 << 8) - var29 * var14 + var29;
					if (var18 < var16) {
						int var45;
						var13 = var45 = var14 << 14;
						if (var17 < 0) {
							var13 -= var26 * var17;
							var45 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var27 * var18;
							var18 = 0;
						}

						if ((var17 == var18 || var26 >= var25) && (var17 != var18 || var26 <= var27)) {
							var16 -= var18;
							var18 -= var17;

							for (var17 = var31[var17]; --var18 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var45 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var45 += var25;
								var11 += var30;
							}

							while (--var16 >= 0) {
								ob(this, al_fld, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var15 += var27;
								var11 += var30;
								var17 += au_fld;
							}
						} else {
							var16 -= var18;
							var18 -= var17;

							for (var17 = var31[var17]; --var18 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var45 >> 14, var11, var29);
								var13 += var26;
								var45 += var25;
								var11 += var30;
							}

							while (--var16 >= 0) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
								var13 += var26;
								var15 += var27;
								var11 += var30;
								var17 += au_fld;
							}
						}
					} else {
						int var44;
						var15 = var44 = var14 << 14;
						if (var17 < 0) {
							var15 -= var26 * var17;
							var44 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var13 <<= 14;
						if (var16 < 0) {
							var13 -= var27 * var16;
							var16 = 0;
						}

						if (var26 < var25) {
							var18 -= var16;
							var16 -= var17;

							for (var17 = var31[var17]; --var16 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var15 >> 14, var44 >> 14, var11, var29);
								var15 += var26;
								var44 += var25;
								var11 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var17, 0, 0, var13 >> 14, var44 >> 14, var11, var29);
								var13 += var27;
								var44 += var25;
								var11 += var30;
								var17 += au_fld;
							}
						} else {
							var18 -= var16;
							var16 -= var17;

							for (var17 = var31[var17]; --var16 >= 0; var17 += au_fld) {
								ob(this, al_fld, var17, 0, 0, var44 >> 14, var15 >> 14, var11, var29);
								var15 += var26;
								var44 += var25;
								var11 += var30;
							}

							while (--var18 >= 0) {
								ob(this, al_fld, var17, 0, 0, var44 >> 14, var13 >> 14, var11, var29);
								var13 += var27;
								var44 += var25;
								var11 += var30;
								var17 += au_fld;
							}
						}
					}
				}
			} else if (var18 < var32) {
				if (var16 > var32) {
					var16 = var32;
				}

				if (var17 > var32) {
					var17 = var32;
				}

				var12 = (var12 << 8) - var29 * var15 + var29;
				if (var16 < var17) {
					int var49;
					var14 = var49 = var15 << 14;
					if (var18 < 0) {
						var14 -= var25 * var18;
						var49 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var26 * var16;
						var16 = 0;
					}

					if (var25 < var27) {
						var17 -= var16;
						var16 -= var18;

						for (var18 = var31[var18]; --var16 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var49 >> 14, var12, var29);
							var14 += var25;
							var49 += var27;
							var12 += var30;
						}

						while (--var17 >= 0) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
							var14 += var25;
							var13 += var26;
							var12 += var30;
							var18 += au_fld;
						}
					} else {
						var17 -= var16;
						var16 -= var18;

						for (var18 = var31[var18]; --var16 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var49 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var49 += var27;
							var12 += var30;
						}

						while (--var17 >= 0) {
							ob(this, al_fld, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var13 += var26;
							var12 += var30;
							var18 += au_fld;
						}
					}
				} else {
					int var48;
					var13 = var48 = var15 << 14;
					if (var18 < 0) {
						var13 -= var25 * var18;
						var48 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var14 <<= 14;
					if (var17 < 0) {
						var14 -= var26 * var17;
						var17 = 0;
					}

					if (var25 < var27) {
						var16 -= var17;
						var17 -= var18;

						for (var18 = var31[var18]; --var17 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var13 >> 14, var48 >> 14, var12, var29);
							var13 += var25;
							var48 += var27;
							var12 += var30;
						}

						while (--var16 >= 0) {
							ob(this, al_fld, var18, 0, 0, var14 >> 14, var48 >> 14, var12, var29);
							var14 += var26;
							var48 += var27;
							var12 += var30;
							var18 += au_fld;
						}
					} else {
						var16 -= var17;
						var17 -= var18;

						for (var18 = var31[var18]; --var17 >= 0; var18 += au_fld) {
							ob(this, al_fld, var18, 0, 0, var48 >> 14, var13 >> 14, var12, var29);
							var13 += var25;
							var48 += var27;
							var12 += var30;
						}

						while (--var16 >= 0) {
							ob(this, al_fld, var18, 0, 0, var48 >> 14, var14 >> 14, var12, var29);
							var14 += var26;
							var48 += var27;
							var12 += var30;
							var18 += au_fld;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void bq(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += (var13 >> 3) * var24;
			var11 += (var14 >> 3) * var24;
			var12 += (var15 >> 3) * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
				if (var19 < 0) {
					var19 = 0;
				} else if (var19 > 16256) {
					var19 = -1110751300;
				}
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13;
			var11 += var14;
			var12 += var15;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 693829314) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (this.ar_fld.aa_fld == 0) {
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & -1171938476) + (var3 >>> 25)];
							var1[var5++] = ((var4 & -946117912) * var16 & 1983649982) + ((var4 & -839332256) * var16 & 224763157) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & -565724252) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -1246142219) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 1410084531) + (var3 >>> 25)];
							var1[var5++] = ((var4 & -1600228676) * var16 & -16711936) + ((var4 & 229701609) * var16 & 1918120817) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 504808718) * var16 & -16711936) + ((var4 & 833596869) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 1554715688) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 220211426) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 1623895863) + (var3 >>> 25)];
							var1[var5++] = ((var4 & -842820646) * var16 & -1011580318) + ((var4 & 0xFF00) * var16 & 994699484) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = ((var4 & -236381813) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 1958121127;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 1769951736) + (var3 >>> 25)];
							var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1297384499) * var16 & 0xFF0000) >> 8;
							var3 += var17;
						} while (--var18 > 0);
					}
				} else {
					int var25 = this.ar_fld.aa_fld;
					int var26 = -653630075 - this.ar_fld.aa_fld;
					int var27 = var16 * var26 >> 8;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & -88838922) + (var3 >>> 25)];
							var4 = ((var4 & 1955042135) * var27 & -16711936 | (var4 & 1624142745) * var27 & -1678881674) >> 8;
							int var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & -298025699) * var25 & 1454555140 | (var28 & 1488062752) * var25 & 1015576120) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 1133256394) * var27 & -16711936 | (var4 & 0xFF00) * var27 & -2090925208) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & -960581622) * var25 & -1228277649) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 1732142894) * var27 & -434393003 | (var4 & 0xFF00) * var27 & 669481019) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | (var28 & -1738157256) * var25 & -364974031) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 2126692693) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -1733221417 | (var4 & 0xFF00) * var27 & -312307470) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & 1069494279 | (var28 & -221510697) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & -1902306192) * var25 & -16711936 | (var28 & 1027641544) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & -610253646) + (var3 >>> 25)];
							var4 = ((var4 & 704245953) * var27 & 1440796728 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -1799696172 | (var28 & -433855525) * var25 & -599575546) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & 62492725 | (var4 & 0xFF00) * var27 & -419372267) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & -688738573) * var25 & 1637863303 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 1855853189) + (var3 >>> 25)];
							var4 = ((var4 & 16711935) * var27 & -16711936 | (var4 & -169450534) * var27 & 0xFF0000) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & -1443146349) * var25 & 964383481 | (var28 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 1938975858;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
							var8 += var9;
							var16 = var8 >> 8;
						} while (--var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 1945233944) + (var3 >>> 25)];
							var4 = ((var4 & 1705735313) * var27 & -16711936 | (var4 & 0xFF00) * var27 & 0xFF0000) >> 8;
							int var183 = var1[var5];
							var1[var5++] = var4 + (((var183 & -1362142394) * var25 & 702533495 | (var183 & 0xFF00) * var25 & 0xFF0000) >> 8);
							var3 += var17;
						} while (--var18 > 0);
					}
				}
			} else if (this.ar_fld.aa_fld == 0) {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 958938722) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & 1529424058) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 1477267731) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & 1072545154) + ((var4 & -1965532293) * var16 & -535785815) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & -918901111) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 1730053532) * var16 & -16711936) + ((var4 & -474286527) * var16 & 2136130035) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 1908598657) * var16 & -16711936) + ((var4 & -1837395562) * var16 & 1025830967) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & -487335595) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 708597725) * var16 & 1584672760) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 2005646160) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & -1180959729) * var16 & 1181036782) + ((var4 & -2110372068) * var16 & -1307449694) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & -2123690521) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & -227980722) * var16 & -16711936) + ((var4 & -1285198875) * var16 & -2041397344) >> 8;
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 107788547) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -1791213037) + ((var4 & -1014074299) * var16 & -189193202) >> 8;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				int var173 = this.ar_fld.aa_fld;
				int var174 = -1009790287 - this.ar_fld.aa_fld;
				int var175 = var16 * var174 >> 8;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 1276704709) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 128273368) * var175 & -16711936 | (var4 & -774629293) * var175 & -841997323) >> 8;
							int var184 = var1[var5];
							var1[var5] = var4 + (((var184 & 16711935) * var173 & -1882991481 | (var184 & 923288048) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & -286118627) * var175 & -16711936 | (var4 & -843204370) * var175 & 235939749) >> 8;
							int var185 = var1[var5];
							var1[var5] = var4 + (((var185 & 16711935) * var173 & 1693664387 | (var185 & 439630448) * var173 & 1946699923) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & -660927086) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -1394053533 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var186 = var1[var5];
							var1[var5] = var4 + (((var186 & 16711935) * var173 & -16711936 | (var186 & -198504524) * var173 & -533111539) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & -54532264) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var187 = var1[var5];
							var1[var5] = var4 + (((var187 & -153468075) * var173 & -896167657 | (var187 & 1177710491) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & -460909464) * var175 & -16711936 | (var4 & 0xFF00) * var175 & -48378301) >> 8;
							int var188 = var1[var5];
							var1[var5] = var4 + (((var188 & -113254007) * var173 & -16711936 | (var188 & 0xFF00) * var173 & 1950736746) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -204422108 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var189 = var1[var5];
							var1[var5] = var4 + (((var189 & 1356557273) * var173 & -16711936 | (var189 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -16711936 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var190 = var1[var5];
							var1[var5] = var4 + (((var190 & -1959172075) * var173 & -16711936 | (var190 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & -349627323) * var175 & -1782634836 | (var4 & 418137854) * var175 & -1335952032) >> 8;
							int var191 = var1[var5];
							var1[var5] = var4 + (((var191 & 16711935) * var173 & 1095932843 | (var191 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > -965783194) {
								var21 = 1873229571;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = ((var4 & 16711935) * var175 & -2094657365 | (var4 & 0xFF00) * var175 & 0xFF0000) >> 8;
							int var192 = var1[var5];
							var1[var5] = var4 + (((var192 & -207278287) * var173 & 1428203505 | (var192 & 0xFF00) * var173 & 0xFF0000) >> 8);
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIIIII)V"
	)
	void bg(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			int var18 = var7 - var6;
			int var24 = var6 - this.ar_fld.am_fld;
			var10 += var13 * var24;
			var11 += var14 * var24;
			var12 += var15 * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13 * var18;
			var11 += var14 * var18;
			var12 += var15 * var18;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (this.ay_fld) {
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 1939944659) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & -1972663759) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & 503093611) + ((var4 & -1612579450) * var16 & 1368409506) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 1201285704) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 268142288) * var16 & -235357422) + ((var4 & -777975322) * var16 & 648123577) >> 8;
						var3 += var17;
						var4 = var2[(var3 & -116173487) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -1147536887) + ((var4 & 380872287) * var16 & 504286776) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & -1993271676) * var16 & -274564735) + ((var4 & -185316481) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 517817358) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 0xFF00) * var16 & 139828016) >> 8;
						var3 += var17;
						var4 = var2[(var3 & -921842791) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & 797681591) + ((var4 & -120379929) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 336963256) * var16 & 0xFF0000) >> 8;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1569834261) * var16 & 0xFF0000) >> 8;
						var3 += var17;
					} while (--var18 > 0);
				}
			} else {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 1195254563) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 596596885) * var16 & -16711936) + ((var4 & -1290957075) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & -638912080) * var16 & 914223218) + ((var4 & 0xFF00) * var16 & -1883115374) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & -1848150520) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1561807392) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 1135366782) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 309915404) * var16 & -16711936) + ((var4 & -750925501) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -1342505450) + ((var4 & 1313117572) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & 1381736786) + ((var4 & 2023958845) * var16 & 605145506) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 1978555971) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 143464953) * var16 & 1807554987) + ((var4 & 1876083380) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -1786718658) + ((var4 & -593122314) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
					} while (--var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & -64188024) + (var3 >>> 25)]) != 0) {
							var1[var5] = ((var4 & 16711935) * var16 & -1220002311) + ((var4 & 1963135487) * var16 & 0xFF0000) >> 8;
						}

						var5++;
						var3 += var17;
					} while (--var18 > 0);
				}
			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([IIIIIIII)V"
	)
	final void bw(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.am_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var7 += var8 * var5;
			if (this.ar_fld.an_fld) {
				var4 = var6 - var5 >> 2;
				var8 <<= 2;
				if (this.ar_fld.ad_fld == 0) {
					if (var4 > 0) {
						do {
							int var35 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = this.as_fld[var35];
							var7 += var8;
							client.no(var1, var2++, var3, 255 - super.ar_fld.ap_fld);
							client.no(var1, var2++, var3, 255 - super.ar_fld.ao_fld);
							client.no(var1, var2++, var3, 255 - super.ar_fld.al_fld);
							client.no(var1, var2++, var3, 255 - super.ar_fld.be_fld);
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var36 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = this.as_fld[var36];

						do {
							client.no(var1, var2++, var3, 255 - super.ar_fld.am_fld);
						} while (--var4 > 0);
					}
				} else {
					int var37 = this.ar_fld.ac_fld;
					int var38 = 256 - this.ar_fld.ac_fld;
					if (var4 > 0) {
						do {
							int var39 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = this.as_fld[var39];
							var7 += var8;
							var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);
							int var41 = var1[var2];
							client.no(var1, var2++, var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - super.ar_fld.al_fld);
							var41 = var1[var2];
							client.no(var1, var2++, var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - super.ar_fld.ac_fld);
							var41 = var1[var2];
							client.no(var1, var2++, var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - super.ar_fld.at_fld);
							var41 = var1[var2];
							client.no(var1, var2++, var3 + ((var41 & 16711935) * var37 >> 8 & 16711935) + ((var41 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - super.ar_fld.ad_fld);
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var40 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = this.as_fld[var40];
						var3 = ((var3 & 16711935) * var38 >> 8 & 16711935) + ((var3 & 0xFF00) * var38 >> 8 & 0xFF00);

						do {
							int var45 = var1[var2];
							client.no(var1, var2++, var3 + ((var45 & 16711935) * var37 >> 8 & 16711935) + ((var45 & 0xFF00) * var37 >> 8 & 0xFF00), 255 - super.ar_fld.aj_fld);
						} while (--var4 > 0);
					}
				}
			} else {
				var4 = var6 - var5;
				if (this.ar_fld.ac_fld == 0) {
					do {
						int var9 = (var7 & ~(var7 >> 31)) >> 8;
						client.no(var1, var2++, this.as_fld[var9], 255 - super.ar_fld.ao_fld);
						var7 += var8;
					} while (--var4 > 0);
				} else {
					int var34 = this.ar_fld.be_fld;
					int var10 = 256 - this.ar_fld.ad_fld;

					do {
						int var11 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = this.as_fld[var11];
						var7 += var8;
						var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);
						int var12 = var1[var2];
						client.no(var1, var2++, var3 + ((var12 & 16711935) * var34 >> 8 & 16711935) + ((var12 & 0xFF00) * var34 >> 8 & 0xFF00), 255 - super.ar_fld.aa_fld);
					} while (--var4 > 0);
				}
			}
		}
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(Los;I)Ljava/lang/String;"
	)
	public static String pi(os var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			for (int var2 = 0; var2 < var0.aa_fld; var2++) {
				if (var1 == var0.ai_fld[var2]) {
					return var0.ad_fld[var2];
				}
			}

			return var0.au_fld;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "([IIIIII)V"
	)
	void cc(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.al_fld) {
				var6 = this.ar_fld.aj_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			if (this.ar_fld.am_fld != 0) {
				if (this.ar_fld.am_fld == 254) {
					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						var1[var2++] = var1[var2];
					}
				} else {
					int var7 = this.ar_fld.ad_fld;
					int var8 = 256 - this.ar_fld.ad_fld;
					var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & 0xFF00) * var8 >> 8 & 0xFF00);

					while (--var4 >= 0) {
						int var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & 0xFF00) * var7 >> 8 & 0xFF00);
					}

					var4 = var6 - var5 & 3;

					while (--var4 >= 0) {
						int var28 = var1[var2];
						var1[var2++] = var3 + ((var28 & 16711935) * var7 >> 8 & 16711935) + ((var28 & 0xFF00) * var7 >> 8 & 0xFF00);
					}
				}
			} else {
				while (--var4 >= 0) {
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
				}

				var4 = var6 - var5 & 3;

				while (--var4 >= 0) {
					var1[var2++] = var3;
				}
			}
		}
	}
}
