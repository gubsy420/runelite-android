import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fq")
public class fq extends fh {
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(FF)I"
	)
	static final int cn(float var0, float var1) {
		return Float.floatToRawIntBits(var0 - var1) >> -1870094038;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(FF)I"
	)
	static final int bw(float var0, float var1) {
		return Float.floatToRawIntBits(var0 - var1) >> 31;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIIF)V"
	)
	final void cd(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
		int var10 = var1[var4];
		var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
		int var11 = this.ar_fld.br_fld & bw(var2[var4], var8);
		var1[var4] = (var11 & var9) + (~var11 & var10);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void af(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		float var11 = (int)(var4 + 0.5F);
		float var12 = (int)(var5 + 0.5F);
		float var13 = (int)(var6 + 0.5F);
		float var14 = (int)(var1 + 0.5F);
		float var15 = (int)(var2 + 0.5F);
		float var16 = (int)(var3 + 0.5F);
		float var17 = var12 - var11;
		float var18 = var15 - var14;
		float var19 = var13 - var11;
		float var20 = var16 - var14;
		float var21 = var5 - var4;
		float var22 = var2 - var1;
		float var23 = var6 - var4;
		float var24 = var3 - var1;
		float var25 = var21 * var24 - var23 * var22;
		if (var25 != 0.0F) {
			float var26 = var8 - var7;
			float var27 = var9 - var7;
			float var28 = (var26 * var24 - var27 * var22) / var25;
			float var29 = (var27 * var21 - var26 * var23) / var25;
			float var30;
			if (var16 != var15) {
				var30 = (var13 - var12) / (var16 - var15);
			} else {
				var30 = 0.0F;
			}

			float var31;
			if (var15 != var14) {
				var31 = var17 / var18;
			} else {
				var31 = 0.0F;
			}

			float var32;
			if (var16 != var14) {
				var32 = var19 / var20;
			} else {
				var32 = 0.0F;
			}

			int[] var33 = this.ar_fld.bm_fld;
			int var34 = this.ar_fld.ab_fld;
			if (var14 <= var15 && var14 <= var16) {
				if (!(var14 >= var34)) {
					if (var15 > var34) {
						var15 = var34;
					}

					if (var16 > var34) {
						var16 = var34;
					}

					var7 = this.cf(var4, var1, var7, var28, var29);
					if (var15 < var16) {
						var13 = var11;
						if (var14 < 0.0F) {
							var13 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var15 < 0.0F) {
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var88;
							for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var88, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var32;
								var11 += var31;
								var88 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var88, var10, 0, (int)var12, (int)var13, var7, var28);
								var13 += var32;
								var12 += var30;
								var88 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var87;
							for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var32;
								var11 += var31;
								var87 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var12, var7, var28);
								var13 += var32;
								var12 += var30;
								var87 += au_fld;
								var7 += var29;
							}
						}
					} else {
						var12 = var11;
						if (var14 < 0.0F) {
							var12 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var30 * var16;
							var16 = 0.0F;
						}

						if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var86;
							for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var12, var7, var28);
								var12 += var32;
								var11 += var31;
								var86 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var30;
								var11 += var31;
								var86 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var85;
							for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var85, var10, 0, (int)var12, (int)var11, var7, var28);
								var12 += var32;
								var11 += var31;
								var85 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var85, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var30;
								var11 += var31;
								var85 += au_fld;
								var7 += var29;
							}
						}
					}
				}
			} else if (var15 <= var16) {
				if (!(var15 >= var34)) {
					if (var16 > var34) {
						var16 = var34;
					}

					if (var14 > var34) {
						var14 = var34;
					}

					var8 = this.cf(var5, var2, var8, var28, var29);
					if (var16 < var14) {
						var11 = var12;
						if (var15 < 0.0F) {
							var11 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var32 * var16;
							var16 = 0.0F;
						}

						if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var84;
							for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var84, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var31;
								var12 += var30;
								var84 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var84, var10, 0, (int)var13, (int)var11, var8, var28);
								var11 += var31;
								var13 += var32;
								var84 += au_fld;
								var8 += var29;
							}
						} else {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var83;
							for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var31;
								var12 += var30;
								var83 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var13, var8, var28);
								var11 += var31;
								var13 += var32;
								var83 += au_fld;
								var8 += var29;
							}
						}
					} else {
						var13 = var12;
						if (var15 < 0.0F) {
							var13 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var14 < 0.0F) {
							var11 -= var32 * var14;
							var14 = 0.0F;
						}

						var15 = (int)(var15 + 0.5F);
						var14 = (int)(var14 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var14;
						var14 -= var15;
						int var82 = var33[(int)var15];
						if (var31 < var30) {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var13, (int)var12, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						} else {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var13, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						}
					}
				}
			} else if (!(var16 >= var34)) {
				if (var14 > var34) {
					var14 = var34;
				}

				if (var15 > var34) {
					var15 = var34;
				}

				var9 = this.cf(var6, var3, var9, var28, var29);
				if (var14 < var15) {
					var12 = var13;
					if (var16 < 0.0F) {
						var12 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var14 < 0.0F) {
						var11 -= var31 * var14;
						var14 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var14 = (int)(var14 + 0.5F);
					var15 = (int)(var15 + 0.5F) - var14;
					var14 -= var16;
					int var81 = var33[(int)var16];
					if (var30 < var32) {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var11, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var11, (int)var12, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					}
				} else {
					var11 = var13;
					if (var16 < 0.0F) {
						var11 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var15 < 0.0F) {
						var12 -= var31 * var15;
						var15 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var15 = (int)(var15 + 0.5F);
					var14 = (int)(var14 + 0.5F) - var15;
					var15 -= var16;
					int var35 = var33[(int)var16];
					if (var30 < var32) {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var11, (int)var13, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var11, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIF)V"
	)
	final void cb(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		if (var8 != 0) {
			var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
			this.ba(var1, var2, var4, var8, var7, bw(var2[var4], var7));
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIIF)V"
	)
	final void ck(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		if (var9 != 0) {
			var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
			int var10 = var1[var4];
			var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
			int var11 = this.ar_fld.br_fld & bw(var2[var4], var8);
			var1[var4] = (var11 & var9) + (~var11 & var10);
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "([I[FIIF)V"
	)
	final void cc(int[] var1, float[] var2, int var3, int var4, float var5) {
		this.ba(var1, var2, var3, var4, var5, bw(var2[var3], var5));
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([I[FIIF)V"
	)
	final void cq(int[] var1, float[] var2, int var3, int var4, float var5) {
		this.ba(var1, var2, var3, this.as_fld[var4], var5, bw(var2[var3], var5));
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "([I[FIIIF)V"
	)
	final void cv(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var1[var3];
		var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
		int var8 = this.ar_fld.br_fld & bw(var2[var3], var6);
		var1[var3] = (var8 & var4) + (~var8 & var7);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIFFIIIIII)V"
	)
	final void ce(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		float var10,
		float var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17
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
			var10 += var11 * var6;
			int var20 = var7 - var6;
			int var26 = var6 - this.ar_fld.am_fld;
			var12 += var15 * var26;
			var13 += var16 * var26;
			var14 += var17 * var26;
			int var25 = var14 >> 14;
			int var21;
			int var22;
			if (var25 != 0) {
				var21 = var12 / var25;
				var22 = var13 / var25;
			} else {
				var21 = 0;
				var22 = 0;
			}

			var12 += var15 * var20;
			var13 += var16 * var20;
			var14 += var17 * var20;
			var25 = var14 >> 14;
			int var23;
			int var24;
			if (var25 != 0) {
				var23 = var12 / var25;
				var24 = var13 / var25;
			} else {
				var23 = 0;
				var24 = 0;
			}

			var3 = (var21 << 18) + var22;
			int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
			var20 >>= 3;
			var9 <<= 3;
			int var18 = var8 >> 8;
			if (this.ay_fld) {
				while (var20-- > 0) {
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
				}
			} else {
				while (var20-- > 0) {
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
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
		return true;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(FFFFF)F"
	)
	float cf(float var1, float var2, float var3, float var4, float var5) {
		var3 = var3 - var4 * var1 + var4;
		if (var2 < 0.0F) {
			var3 -= var5 * (int)var2;
		}

		return var3 - var5 * (var2 - (int)(var2 + 0.5F));
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	@Override
	void bl(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		float var13 = (int)(var4 + 0.5F);
		float var14 = (int)(var5 + 0.5F);
		float var15 = (int)(var6 + 0.5F);
		float var16 = (int)(var1 + 0.5F);
		float var17 = (int)(var2 + 0.5F);
		float var18 = (int)(var3 + 0.5F);
		float var19 = var14 - var13;
		float var20 = var17 - var16;
		float var21 = var15 - var13;
		float var22 = var18 - var16;
		float var23 = var19 * var22 - var21 * var20;
		if (var23 != 0.0F) {
			float var24 = var10;
			float var25 = var11;
			float var26 = var12;
			float var27 = var25 - var24;
			float var28 = var26 - var24;
			float var29 = (var27 * var22 - var28 * var20) / var23;
			float var30 = (var28 * var19 - var27 * var21) / var23;
			float var31 = var5 - var4;
			float var32 = var2 - var1;
			float var33 = var6 - var4;
			float var34 = var3 - var1;
			float var35 = var31 * var34 - var33 * var32;
			if (var35 != 0.0F) {
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * var34 - var37 * var32) / var35;
				float var39 = (var37 * var31 - var36 * var33) / var35;
				float var40;
				if (var18 != var17) {
					var40 = (var15 - var14) / (var18 - var17);
				} else {
					var40 = 0.0F;
				}

				float var41;
				if (var17 != var16) {
					var41 = var19 / var20;
				} else {
					var41 = 0.0F;
				}

				float var42;
				if (var18 != var16) {
					var42 = var21 / var22;
				} else {
					var42 = 0.0F;
				}

				int[] var43 = this.ar_fld.bm_fld;
				int var44 = this.ar_fld.ab_fld;
				if (var16 <= var17 && var16 <= var18) {
					if (!(var16 >= var44)) {
						if (var17 > var44) {
							var17 = var44;
						}

						if (var18 > var44) {
							var18 = var44;
						}

						var24 = var24 - var29 * var13 + var29;
						var7 = this.cf(var4, var1, var7, var38, var39);
						if (var17 < var18) {
							var15 = var13;
							if (var16 < 0.0F) {
								var15 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var17 < 0.0F) {
								var14 -= var40 * var17;
								var17 = 0.0F;
							}

							if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
								var16 = (int)(var16 + 0.5F);
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F) - var17;
								var17 -= var16;

								int var101;
								for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var101 += au_fld;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var101 += au_fld;
									var7 += var39;
								}
							} else {
								var16 = (int)(var16 + 0.5F);
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F) - var17;
								var17 -= var16;

								int var100;
								for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var100 += au_fld;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var100 += au_fld;
									var7 += var39;
								}
							}
						} else {
							var14 = var13;
							if (var16 < 0.0F) {
								var14 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var40 * var18;
								var18 = 0.0F;
							}

							if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
								var16 = (int)(var16 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var17 = (int)(var17 + 0.5F) - var18;
								var18 -= var16;

								int var99;
								for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var99 += au_fld;
								}

								while (--var17 >= 0.0F) {
									xp(this, al_fld, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var99 += au_fld;
									var7 += var39;
								}
							} else {
								var16 = (int)(var16 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var17 = (int)(var17 + 0.5F) - var18;
								var18 -= var16;

								int var98;
								for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var98 += au_fld;
								}

								while (--var17 >= 0.0F) {
									xp(this, al_fld, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var98 += au_fld;
									var7 += var39;
								}
							}
						}
					}
				} else if (var17 <= var18) {
					if (!(var17 >= var44)) {
						if (var18 > var44) {
							var18 = var44;
						}

						if (var16 > var44) {
							var16 = var44;
						}

						var25 = var25 - var29 * var14 + var29;
						var8 = this.cf(var5, var2, var8, var38, var39);
						if (var18 < var16) {
							var13 = var14;
							if (var17 < 0.0F) {
								var13 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var42 * var18;
								var18 = 0.0F;
							}

							if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var16 = (int)(var16 + 0.5F) - var18;
								var18 -= var17;

								int var97;
								for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									xp(this, al_fld, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var97 += au_fld;
								}

								while (--var16 >= 0.0F) {
									xp(this, al_fld, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var97 += au_fld;
									var8 += var39;
								}
							} else {
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var16 = (int)(var16 + 0.5F) - var18;
								var18 -= var17;

								int var96;
								for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									xp(this, al_fld, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var96 += au_fld;
								}

								while (--var16 >= 0.0F) {
									xp(this, al_fld, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var96 += au_fld;
									var8 += var39;
								}
							}
						} else {
							var15 = var14;
							if (var17 < 0.0F) {
								var15 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var16 < 0.0F) {
								var13 -= var42 * var16;
								var16 = 0.0F;
							}

							var17 = (int)(var17 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var18 = (int)(var18 + 0.5F) - var16;
							var16 -= var17;
							int var95 = var43[(int)var17];
							if (var41 < var40) {
								while (--var16 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}
							} else {
								while (--var16 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}
							}
						}
					}
				} else if (!(var18 >= var44)) {
					if (var16 > var44) {
						var16 = var44;
					}

					if (var17 > var44) {
						var17 = var44;
					}

					var26 = var26 - var29 * var15 + var29;
					var9 = this.cf(var6, var3, var9, var38, var39);
					if (var16 < var17) {
						var14 = var15;
						if (var18 < 0.0F) {
							var14 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var41 * var16;
							var16 = 0.0F;
						}

						var18 = (int)(var18 + 0.5F);
						var16 = (int)(var16 + 0.5F);
						var17 = (int)(var17 + 0.5F) - var16;
						var16 -= var18;
						int var94 = var43[(int)var18];
						if (var40 < var42) {
							while (--var16 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}
						} else {
							while (--var16 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}
						}
					} else {
						var13 = var15;
						if (var18 < 0.0F) {
							var13 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var17 < 0.0F) {
							var14 -= var41 * var17;
							var17 = 0.0F;
						}

						var18 = (int)(var18 + 0.5F);
						var17 = (int)(var17 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var17;
						var17 -= var18;
						int var45 = var43[(int)var18];
						if (var40 < var42) {
							while (--var17 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}
						} else {
							while (--var17 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}
						}
					}
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
		float var13 = (int)(var4 + 0.5F);
		float var14 = (int)(var5 + 0.5F);
		float var15 = (int)(var6 + 0.5F);
		float var16 = (int)(var1 + 0.5F);
		float var17 = (int)(var2 + 0.5F);
		float var18 = (int)(var3 + 0.5F);
		float var19 = var14 - var13;
		float var20 = var17 - var16;
		float var21 = var15 - var13;
		float var22 = var18 - var16;
		float var23 = var19 * var22 - var21 * var20;
		if (var23 != 0.0F) {
			float var24 = var10;
			float var25 = var11;
			float var26 = var12;
			float var27 = var25 - var24;
			float var28 = var26 - var24;
			float var29 = (var27 * var22 - var28 * var20) / var23;
			float var30 = (var28 * var19 - var27 * var21) / var23;
			float var31 = var5 - var4;
			float var32 = var2 - var1;
			float var33 = var6 - var4;
			float var34 = var3 - var1;
			float var35 = var31 * var34 - var33 * var32;
			if (var35 != 0.0F) {
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * var34 - var37 * var32) / var35;
				float var39 = (var37 * var31 - var36 * var33) / var35;
				float var40;
				if (var18 != var17) {
					var40 = (var15 - var14) / (var18 - var17);
				} else {
					var40 = 0.0F;
				}

				float var41;
				if (var17 != var16) {
					var41 = var19 / var20;
				} else {
					var41 = 0.0F;
				}

				float var42;
				if (var18 != var16) {
					var42 = var21 / var22;
				} else {
					var42 = 0.0F;
				}

				int[] var43 = this.ar_fld.bm_fld;
				int var44 = this.ar_fld.ab_fld;
				if (var16 <= var17 && var16 <= var18) {
					if (!(var16 >= var44)) {
						if (var17 > var44) {
							var17 = var44;
						}

						if (var18 > var44) {
							var18 = var44;
						}

						var24 = var24 - var29 * var13 + var29;
						var7 = this.cf(var4, var1, var7, var38, var39);
						if (var17 < var18) {
							var15 = var13;
							if (var16 < 0.0F) {
								var15 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var17 < 0.0F) {
								var14 -= var40 * var17;
								var17 = 0.0F;
							}

							if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
								var16 = (int)(var16 + 0.5F);
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F) - var17;
								var17 -= var16;

								int var101;
								for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var101 += au_fld;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var101 += au_fld;
									var7 += var39;
								}
							} else {
								var16 = (int)(var16 + 0.5F);
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F) - var17;
								var17 -= var16;

								int var100;
								for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var100 += au_fld;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var100 += au_fld;
									var7 += var39;
								}
							}
						} else {
							var14 = var13;
							if (var16 < 0.0F) {
								var14 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var40 * var18;
								var18 = 0.0F;
							}

							if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
								var16 = (int)(var16 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var17 = (int)(var17 + 0.5F) - var18;
								var18 -= var16;

								int var99;
								for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var99 += au_fld;
								}

								while (--var17 >= 0.0F) {
									xp(this, al_fld, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var99 += au_fld;
									var7 += var39;
								}
							} else {
								var16 = (int)(var16 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var17 = (int)(var17 + 0.5F) - var18;
								var18 -= var16;

								int var98;
								for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var98 += au_fld;
								}

								while (--var17 >= 0.0F) {
									xp(this, al_fld, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var98 += au_fld;
									var7 += var39;
								}
							}
						}
					}
				} else if (var17 <= var18) {
					if (!(var17 >= var44)) {
						if (var18 > var44) {
							var18 = var44;
						}

						if (var16 > var44) {
							var16 = var44;
						}

						var25 = var25 - var29 * var14 + var29;
						var8 = this.cf(var5, var2, var8, var38, var39);
						if (var18 < var16) {
							var13 = var14;
							if (var17 < 0.0F) {
								var13 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var42 * var18;
								var18 = 0.0F;
							}

							if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var16 = (int)(var16 + 0.5F) - var18;
								var18 -= var17;

								int var97;
								for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									xp(this, al_fld, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var97 += au_fld;
								}

								while (--var16 >= 0.0F) {
									xp(this, al_fld, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var97 += au_fld;
									var8 += var39;
								}
							} else {
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var16 = (int)(var16 + 0.5F) - var18;
								var18 -= var17;

								int var96;
								for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									xp(this, al_fld, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var96 += au_fld;
								}

								while (--var16 >= 0.0F) {
									xp(this, al_fld, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var96 += au_fld;
									var8 += var39;
								}
							}
						} else {
							var15 = var14;
							if (var17 < 0.0F) {
								var15 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var16 < 0.0F) {
								var13 -= var42 * var16;
								var16 = 0.0F;
							}

							var17 = (int)(var17 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var18 = (int)(var18 + 0.5F) - var16;
							var16 -= var17;
							int var95 = var43[(int)var17];
							if (var41 < var40) {
								while (--var16 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}
							} else {
								while (--var16 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}
							}
						}
					}
				} else if (!(var18 >= var44)) {
					if (var16 > var44) {
						var16 = var44;
					}

					if (var17 > var44) {
						var17 = var44;
					}

					var26 = var26 - var29 * var15 + var29;
					var9 = this.cf(var6, var3, var9, var38, var39);
					if (var16 < var17) {
						var14 = var15;
						if (var18 < 0.0F) {
							var14 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var41 * var16;
							var16 = 0.0F;
						}

						var18 = (int)(var18 + 0.5F);
						var16 = (int)(var16 + 0.5F);
						var17 = (int)(var17 + 0.5F) - var16;
						var16 -= var18;
						int var94 = var43[(int)var18];
						if (var40 < var42) {
							while (--var16 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}
						} else {
							while (--var16 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}
						}
					} else {
						var13 = var15;
						if (var18 < 0.0F) {
							var13 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var17 < 0.0F) {
							var14 -= var41 * var17;
							var17 = 0.0F;
						}

						var18 = (int)(var18 + 0.5F);
						var17 = (int)(var17 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var17;
						var17 -= var18;
						int var45 = var43[(int)var18];
						if (var40 < var42) {
							while (--var17 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}
						} else {
							while (--var17 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}
						}
					}
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
				int var81 = this.ar_fld.aq_fld.av(var22, (byte)-123);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var81, var10), ag(var81, var11), ag(var81, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1405700627);
				float var24 = (int)(var4 + 0.5F);
				float var25 = (int)(var5 + 0.5F);
				float var26 = (int)(var6 + 0.5F);
				float var27 = (int)(var1 + 0.5F);
				float var28 = (int)(var2 + 0.5F);
				float var29 = (int)(var3 + 0.5F);
				float var30 = var25 - var24;
				float var31 = var28 - var27;
				float var32 = var26 - var24;
				float var33 = var29 - var27;
				float var34 = var30 * var33 - var32 * var31;
				if (var34 != 0.0F) {
					float var35 = var11 - var10;
					float var36 = var12 - var10;
					int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
					int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
					float var39 = var5 - var4;
					float var40 = var2 - var1;
					float var41 = var6 - var4;
					float var42 = var3 - var1;
					float var43 = var39 * var42 - var41 * var40;
					if (var43 != 0.0F) {
						float var44 = var8 - var7;
						float var45 = var9 - var7;
						float var46 = (var44 * var42 - var45 * var40) / var43;
						float var47 = (var45 * var39 - var44 * var41) / var43;
						float var48;
						if (var29 != var28) {
							var48 = (var26 - var25) / (var29 - var28);
						} else {
							var48 = 0.0F;
						}

						float var49;
						if (var28 != var27) {
							var49 = var30 / var31;
						} else {
							var49 = 0.0F;
						}

						float var50;
						if (var29 != var27) {
							var50 = var32 / var33;
						} else {
							var50 = 0.0F;
						}

						int var51 = this.ar_fld.ai_fld;
						var14 = var13 - var14;
						var17 = var16 - var17;
						var20 = var19 - var20;
						var15 -= var13;
						var18 -= var16;
						var21 -= var19;
						int var52 = var15 * var16 - var18 * var13 << 14;
						int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
						int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
						int var55 = var14 * var16 - var17 * var13 << 14;
						int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
						int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
						int var58 = var17 * var15 - var14 * var18 << 14;
						int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
						int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
						int[] var61 = this.ar_fld.bm_fld;
						int var62 = this.ar_fld.ab_fld;
						if (var27 <= var28 && var27 <= var29) {
							if (!(var27 >= var62)) {
								if (var28 > var62) {
									var28 = var62;
								}

								if (var29 > var62) {
									var29 = var62;
								}

								var10 = (var10 << 9) - var37 * (int)var24 + var37;
								var7 = this.cf(var4, var1, var7, var46, var47);
								if (var28 < var29) {
									var26 = var24;
									if (var27 < 0.0F) {
										var26 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 -= var38 * (int)var27;
										var27 = 0.0F;
									}

									if (var28 < 0.0F) {
										var25 -= var48 * var28;
										var28 = 0.0F;
									}

									int var144 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var144;
									var55 += var57 * var144;
									var58 += var60 * var144;
									if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var152;
										for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var152, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var152, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var151;
										for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var151, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var151, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								} else {
									var25 = var24;
									if (var27 < 0.0F) {
										var25 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 = (int)(var10 - var38 * var27);
										var27 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var48 * var29;
										var29 = 0.0F;
									}

									int var143 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var143;
									var55 += var57 * var143;
									var58 += var60 * var143;
									if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var150;
										for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var150, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var149;
										for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var149, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								}
							}
						} else if (var28 <= var29) {
							if (!(var28 >= var62)) {
								if (var29 > var62) {
									var29 = var62;
								}

								if (var27 > var62) {
									var27 = var62;
								}

								var11 = (var11 << 9) - var37 * (int)var25 + var37;
								var8 = this.cf(var5, var2, var8, var46, var47);
								if (var29 < var27) {
									var24 = var25;
									if (var28 < 0.0F) {
										var24 = var25 - var49 * var28;
										var25 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var50 * var29;
										var29 = 0.0F;
									}

									int var142 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var142;
									var55 += var57 * var142;
									var58 += var60 * var142;
									if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var148;
										for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											ka(this, al_fld, var23, 0, 0, var148, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var148, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var147;
										for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											ka(this, al_fld, var23, 0, 0, var147, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var147 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var147, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var147 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								} else {
									var26 = var25;
									if (var28 < 0.0F) {
										var26 = var25 - var49 * var28;
										var25 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var27 < 0.0F) {
										var24 -= var50 * var27;
										var27 = 0.0F;
									}

									int var141 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var141;
									var55 += var57 * var141;
									var58 += var60 * var141;
									var28 = (int)(var28 + 0.5F);
									var27 = (int)(var27 + 0.5F);
									var29 = (int)(var29 + 0.5F) - var27;
									var27 -= var28;
									int var146 = var61[(int)var28];
									if (var49 < var48) {
										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var26, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var25, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								}
							}
						} else if (!(var29 >= var62)) {
							if (var27 > var62) {
								var27 = var62;
							}

							if (var28 > var62) {
								var28 = var62;
							}

							var12 = (var12 << 9) - var37 * (int)var26 + var37;
							var9 = this.cf(var6, var3, var9, var46, var47);
							if (var27 < var28) {
								var25 = var26;
								if (var29 < 0.0F) {
									var25 = var26 - var48 * var29;
									var26 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var27 < 0.0F) {
									var24 -= var49 * var27;
									var27 = 0.0F;
								}

								int var140 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var140;
								var55 += var57 * var140;
								var58 += var60 * var140;
								var29 = (int)(var29 + 0.5F);
								var27 = (int)(var27 + 0.5F);
								var28 = (int)(var28 + 0.5F) - var27;
								var27 -= var29;
								int var145 = var61[(int)var29];
								if (var48 < var50) {
									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							} else {
								var24 = var26;
								if (var29 < 0.0F) {
									var24 = var26 - var48 * var29;
									var26 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var28 < 0.0F) {
									var25 -= var49 * var28;
									var28 = 0.0F;
								}

								int var63 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								var29 = (int)(var29 + 0.5F);
								var28 = (int)(var28 + 0.5F);
								var27 = (int)(var27 + 0.5F) - var28;
								var28 -= var29;
								int var64 = var61[(int)var29];
								if (var48 < var50) {
									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var24, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var26, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var66) {
			throw new RuntimeException(var66);
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[IIIIIIIIFFIIIIII)V"
	)
	public static void ka(
		fq var0,
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		float var10,
		float var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17
	) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ar_fld.ax_fld) {
			if (var7 > var0.ar_fld.ao_fld) {
				var7 = var0.ar_fld.ao_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			var10 += var11 * var6;
			int var20 = var7 - var6;
			int var26 = var6 - var0.ar_fld.am_fld;
			var12 += (var15 >> 3) * var26;
			var13 += (var16 >> 3) * var26;
			var14 += (var17 >> 3) * var26;
			int var25 = var14 >> 14;
			int var21;
			int var22;
			if (var25 != 0) {
				var21 = var12 / var25;
				var22 = var13 / var25;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var12 += var15;
			var13 += var16;
			var14 += var17;
			var25 = var14 >> 14;
			int var23;
			int var24;
			if (var25 != 0) {
				var23 = var12 / var25;
				var24 = var13 / var25;
				if (var23 < 0) {
					var23 = 0;
				} else if (var23 > 16256) {
					var23 = 16256;
				}
			} else {
				var23 = 0;
				var24 = 0;
			}

			var3 = (var21 << 18) + var22;
			int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
			var20 >>= 3;
			var9 <<= 3;
			int var18 = var8 >> 8;
			if (var0.ay_fld) {
				if (var0.ar_fld.aa_fld != 0) {
					int var27 = var0.ar_fld.aa_fld;
					int var28 = 256 - var0.ar_fld.aa_fld;
					int var29 = var18 * var28 >> 8;

					while (var20-- > 0) {
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var21 = var23;
						var22 = var24;
						var12 += var15;
						var13 += var16;
						var14 += var17;
						var25 = var14 >> 14;
						if (var25 != 0) {
							var23 = var12 / var25;
							var24 = var13 / var25;
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 > 16256) {
								var23 = 16256;
							}
						} else {
							var23 = 0;
							var24 = 0;
						}

						var3 = (var21 << 18) + var22;
						var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
						var8 += var9;
						var18 = var8 >> 8;
					}

					for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
						var0.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
					}
				} else {
					while (var20-- > 0) {
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var21 = var23;
						var22 = var24;
						var12 += var15;
						var13 += var16;
						var14 += var17;
						var25 = var14 >> 14;
						if (var25 != 0) {
							var23 = var12 / var25;
							var24 = var13 / var25;
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 > 16256) {
								var23 = 16256;
							}
						} else {
							var23 = 0;
							var24 = 0;
						}

						var3 = (var21 << 18) + var22;
						var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
						var8 += var9;
						var18 = var8 >> 8;
					}

					for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
						ha(var0, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
					}
				}
			} else if (var0.ar_fld.aa_fld != 0) {
				int var149 = var0.ar_fld.aa_fld;
				int var150 = 256 - var0.ar_fld.aa_fld;
				int var151 = var18 * var150 >> 8;

				while (var20-- > 0) {
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var21 = var23;
					var22 = var24;
					var12 += var15;
					var13 += var16;
					var14 += var17;
					var25 = var14 >> 14;
					if (var25 != 0) {
						var23 = var12 / var25;
						var24 = var13 / var25;
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 16256) {
							var23 = 16256;
						}
					} else {
						var23 = 0;
						var24 = 0;
					}

					var3 = (var21 << 18) + var22;
					var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
					var0.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
				}
			} else {
				while (var20-- > 0) {
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var21 = var23;
					var22 = var24;
					var12 += var15;
					var13 += var16;
					var14 += var17;
					var25 = var14 >> 14;
					if (var25 != 0) {
						var23 = var12 / var25;
						var24 = var13 / var25;
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 16256) {
							var23 = 16256;
						}
					} else {
						var23 = 0;
						var24 = 0;
					}

					var3 = (var21 << 18) + var22;
					var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
					var0.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
				}
			}
		}
	}

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[F[IIIIIF)V"
	)
	public static void tv(fq var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		if (var0 == null) {
			var0.getClass();
		}

		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		if (var9 != 0) {
			var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
			int var10 = var1[var4];
			var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 1283530046) * var5 & -1061422618) >> 8;
			int var11 = var0.ar_fld.br_fld & bw(var2[var4], var8);
			var1[var4] = (var11 & var9) + (~var11 & var10);
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "([IIIIIIFFFF)V"
	)
	final void dr(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5 - 1;
			var7 += var8 * var5;
			var9 += var10 * var5;
			if (this.ar_fld.an_fld) {
				var4 = var6 - var5 >> 2;
				var8 *= 4.0F;
				if (this.ar_fld.aa_fld == 0) {
					if (var4 > 0) {
						do {
							int var40 = (int)var7 & 65535;
							var3 = this.as_fld[var40];
							var7 += var8;
							this.cc(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
							this.cc(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
							this.cc(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
							this.cc(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var41 = (int)var7 & 65535;
						var3 = this.as_fld[var41];

						do {
							this.cc(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
						} while (--var4 > 0);
					}
				} else {
					int var42 = this.ar_fld.aa_fld;
					int var43 = 256 - this.ar_fld.aa_fld;
					if (var4 > 0) {
						do {
							int var13 = (int)var7 & 65535;
							var3 = this.as_fld[var13];
							var7 += var8;
							var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);
							this.cv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
							this.cv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
							this.cv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
							this.cv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var44 = (int)var7 & 65535;
						var3 = this.as_fld[var44];
						var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);

						do {
							this.cv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
						} while (--var4 > 0);
					}
				}
			} else {
				var4 = var6 - var5;
				if (this.ar_fld.aa_fld == 0) {
					do {
						this.cq(var1, an_fld, ++var2, (int)var7 & 65535, var9);
						var9 += var10;
						var7 += var8;
					} while (--var4 > 0);
				} else {
					int var11 = this.ar_fld.aa_fld;
					int var12 = 256 - this.ar_fld.aa_fld;

					do {
						sz(this, var1, an_fld, ++var2, (int)var7 & 65535, var11, var12, var9);
						var9 += var10;
						var7 += var8;
					} while (--var4 > 0);
				}
			}
		}
	}

	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[F[IIIIF)V"
	)
	public static void qg(fq var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var8 = var3[(var6 & -554176188) + (var6 >>> 25)];
			var8 = ((var8 & -1968795152) * var5 & -16711936) + ((var8 & -1486676961) * var5 & 0xFF0000) >> 8;
			var0.ba(var1, var2, var4, var8, var7, bw(var2[var4], var7));
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
				int var81 = this.ar_fld.aq_fld.av(var22, (byte)-12);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var81, var10), ag(var81, var11), ag(var81, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1165295483);
				float var24 = (int)(var4 + 0.5F);
				float var25 = (int)(var5 + 0.5F);
				float var26 = (int)(var6 + 0.5F);
				float var27 = (int)(var1 + 0.5F);
				float var28 = (int)(var2 + 0.5F);
				float var29 = (int)(var3 + 0.5F);
				float var30 = var25 - var24;
				float var31 = var28 - var27;
				float var32 = var26 - var24;
				float var33 = var29 - var27;
				float var34 = var30 * var33 - var32 * var31;
				if (var34 != 0.0F) {
					float var35 = var11 - var10;
					float var36 = var12 - var10;
					int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
					int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
					float var39 = var5 - var4;
					float var40 = var2 - var1;
					float var41 = var6 - var4;
					float var42 = var3 - var1;
					float var43 = var39 * var42 - var41 * var40;
					if (var43 != 0.0F) {
						float var44 = var8 - var7;
						float var45 = var9 - var7;
						float var46 = (var44 * var42 - var45 * var40) / var43;
						float var47 = (var45 * var39 - var44 * var41) / var43;
						float var48;
						if (var29 != var28) {
							var48 = (var26 - var25) / (var29 - var28);
						} else {
							var48 = 0.0F;
						}

						float var49;
						if (var28 != var27) {
							var49 = var30 / var31;
						} else {
							var49 = 0.0F;
						}

						float var50;
						if (var29 != var27) {
							var50 = var32 / var33;
						} else {
							var50 = 0.0F;
						}

						int var51 = this.ar_fld.ai_fld;
						var14 = var13 - var14;
						var17 = var16 - var17;
						var20 = var19 - var20;
						var15 -= var13;
						var18 -= var16;
						var21 -= var19;
						int var52 = var15 * var16 - var18 * var13 << 14;
						int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
						int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
						int var55 = var14 * var16 - var17 * var13 << 14;
						int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
						int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
						int var58 = var17 * var15 - var14 * var18 << 14;
						int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
						int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
						int[] var61 = this.ar_fld.bm_fld;
						int var62 = this.ar_fld.ab_fld;
						if (var27 <= var28 && var27 <= var29) {
							if (!(var27 >= var62)) {
								if (var28 > var62) {
									var28 = var62;
								}

								if (var29 > var62) {
									var29 = var62;
								}

								var10 = (var10 << 9) - var37 * (int)var24 + var37;
								var7 = this.cf(var4, var1, var7, var46, var47);
								if (var28 < var29) {
									var26 = var24;
									if (var27 < 0.0F) {
										var26 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 -= var38 * (int)var27;
										var27 = 0.0F;
									}

									if (var28 < 0.0F) {
										var25 -= var48 * var28;
										var28 = 0.0F;
									}

									int var146 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var146;
									var55 += var57 * var146;
									var58 += var60 * var146;
									if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var154;
										for (var154 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											this.ce(al_fld, var23, 0, 0, var154, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var154 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var154, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var154 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var153;
										for (var153 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											this.ce(al_fld, var23, 0, 0, var153, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var153 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var153, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var153 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								} else {
									var25 = var24;
									if (var27 < 0.0F) {
										var25 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 -= var38 * (int)var27;
										var27 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var48 * var29;
										var29 = 0.0F;
									}

									int var145 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var145;
									var55 += var57 * var145;
									var58 += var60 * var145;
									if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var152;
										for (var152 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											this.ce(al_fld, var23, 0, 0, var152, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var152, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var151;
										for (var151 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											this.ce(al_fld, var23, 0, 0, var151, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var151, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								}
							}
						} else if (var28 <= var29) {
							if (!(var28 >= var62)) {
								if (var29 > var62) {
									var29 = var62;
								}

								if (var27 > var62) {
									var27 = var62;
								}

								var11 = (var11 << 9) - var37 * (int)var25 + var37;
								var8 = this.cf(var5, var2, var8, var46, var47);
								if (var29 < var27) {
									var24 = var25;
									if (var28 < 0.0F) {
										var24 = var25 - var49 * var28;
										var25 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var50 * var29;
										var29 = 0.0F;
									}

									int var144 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var144;
									var55 += var57 * var144;
									var58 += var60 * var144;
									if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var150;
										for (var150 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											this.ce(al_fld, var23, 0, 0, var150, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var150, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var149;
										for (var149 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											this.ce(al_fld, var23, 0, 0, var149, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var149, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								} else {
									float var83;
									var26 = var83 = var25;
									if (var28 < 0.0F) {
										var26 -= var49 * var28;
										var83 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var27 < 0.0F) {
										var24 -= var50 * var27;
										var27 = 0.0F;
									}

									int var143 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var143;
									var55 += var57 * var143;
									var58 += var60 * var143;
									var28 = (int)(var28 + 0.5F);
									var27 = (int)(var27 + 0.5F);
									var29 = (int)(var29 + 0.5F) - var27;
									var27 -= var28;
									int var148 = var61[(int)var28];
									if (var49 < var48) {
										while (--var27 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var148, (int)var26, (int)var83, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var83 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var148, (int)var24, (int)var83, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var83 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										while (--var27 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var148, (int)var83, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var83 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var148, (int)var83, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var83 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								}
							}
						} else if (!(var29 >= var62)) {
							if (var27 > var62) {
								var27 = var62;
							}

							if (var28 > var62) {
								var28 = var62;
							}

							var12 = (var12 << 9) - var37 * (int)var26 + var37;
							var9 = this.cf(var6, var3, var9, var46, var47);
							if (var27 < var28) {
								var25 = var26;
								if (var29 < 0.0F) {
									var25 = var26 - var48 * var29;
									var26 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var27 < 0.0F) {
									var24 -= var49 * var27;
									var27 = 0.0F;
								}

								int var142 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var142;
								var55 += var57 * var142;
								var58 += var60 * var142;
								var29 = (int)(var29 + 0.5F);
								var27 = (int)(var27 + 0.5F);
								var28 = (int)(var28 + 0.5F) - var27;
								var27 -= var29;
								int var147 = var61[(int)var29];
								if (var48 < var50) {
									while (--var27 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var147, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var147 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var147, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var147 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var27 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var147, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var147 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var147, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var147 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							} else {
								float var85;
								var24 = var85 = var26;
								if (var29 < 0.0F) {
									var24 -= var48 * var29;
									var85 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var28 < 0.0F) {
									var25 -= var49 * var28;
									var28 = 0.0F;
								}

								int var63 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								var29 = (int)(var29 + 0.5F);
								var28 = (int)(var28 + 0.5F);
								var27 = (int)(var27 + 0.5F) - var28;
								var28 -= var29;
								int var64 = var61[(int)var29];
								if (var48 < var50) {
									while (--var28 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var64, (int)var24, (int)var85, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var85 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var64, (int)var25, (int)var85, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var85 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var28 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var64, (int)var85, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var85 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var64, (int)var85, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var85 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var66) {
			throw new RuntimeException(var66);
		}
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(Ldr;)I"
	)
	public static int mu(dr var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aw_fld;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "([I[FIIIF)V"
	)
	final void dt(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var1[var3];
		var4 = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
		int var8 = this.ar_fld.br_fld & bw(var2[var3], var6);
		var1[var3] = (var8 & var4) + (~var8 & var7);
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
				int var81 = this.ar_fld.aq_fld.av(var22, (byte)-89);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var81, var10), ag(var81, var11), ag(var81, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1308269498);
				float var24 = (int)(var4 + 0.5F);
				float var25 = (int)(var5 + 0.5F);
				float var26 = (int)(var6 + 0.5F);
				float var27 = (int)(var1 + 0.5F);
				float var28 = (int)(var2 + 0.5F);
				float var29 = (int)(var3 + 0.5F);
				float var30 = var25 - var24;
				float var31 = var28 - var27;
				float var32 = var26 - var24;
				float var33 = var29 - var27;
				float var34 = var30 * var33 - var32 * var31;
				if (var34 != 0.0F) {
					float var35 = var11 - var10;
					float var36 = var12 - var10;
					int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
					int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
					float var39 = var5 - var4;
					float var40 = var2 - var1;
					float var41 = var6 - var4;
					float var42 = var3 - var1;
					float var43 = var39 * var42 - var41 * var40;
					if (var43 != 0.0F) {
						float var44 = var8 - var7;
						float var45 = var9 - var7;
						float var46 = (var44 * var42 - var45 * var40) / var43;
						float var47 = (var45 * var39 - var44 * var41) / var43;
						float var48;
						if (var29 != var28) {
							var48 = (var26 - var25) / (var29 - var28);
						} else {
							var48 = 0.0F;
						}

						float var49;
						if (var28 != var27) {
							var49 = var30 / var31;
						} else {
							var49 = 0.0F;
						}

						float var50;
						if (var29 != var27) {
							var50 = var32 / var33;
						} else {
							var50 = 0.0F;
						}

						int var51 = this.ar_fld.ai_fld;
						var14 = var13 - var14;
						var17 = var16 - var17;
						var20 = var19 - var20;
						var15 -= var13;
						var18 -= var16;
						var21 -= var19;
						int var52 = var15 * var16 - var18 * var13 << 14;
						int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
						int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
						int var55 = var14 * var16 - var17 * var13 << 14;
						int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
						int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
						int var58 = var17 * var15 - var14 * var18 << 14;
						int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
						int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
						int[] var61 = this.ar_fld.bm_fld;
						int var62 = this.ar_fld.ab_fld;
						if (var27 <= var28 && var27 <= var29) {
							if (!(var27 >= var62)) {
								if (var28 > var62) {
									var28 = var62;
								}

								if (var29 > var62) {
									var29 = var62;
								}

								var10 = (var10 << 9) - var37 * (int)var24 + var37;
								var7 = this.cf(var4, var1, var7, var46, var47);
								if (var28 < var29) {
									var26 = var24;
									if (var27 < 0.0F) {
										var26 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 -= var38 * (int)var27;
										var27 = 0.0F;
									}

									if (var28 < 0.0F) {
										var25 -= var48 * var28;
										var28 = 0.0F;
									}

									int var144 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var144;
									var55 += var57 * var144;
									var58 += var60 * var144;
									if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var152;
										for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var152, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var152, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var151;
										for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var151, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var151, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								} else {
									var25 = var24;
									if (var27 < 0.0F) {
										var25 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 = (int)(var10 - var38 * var27);
										var27 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var48 * var29;
										var29 = 0.0F;
									}

									int var143 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var143;
									var55 += var57 * var143;
									var58 += var60 * var143;
									if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var150;
										for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var150, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var149;
										for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var149, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								}
							}
						} else if (var28 <= var29) {
							if (!(var28 >= var62)) {
								if (var29 > var62) {
									var29 = var62;
								}

								if (var27 > var62) {
									var27 = var62;
								}

								var11 = (var11 << 9) - var37 * (int)var25 + var37;
								var8 = this.cf(var5, var2, var8, var46, var47);
								if (var29 < var27) {
									var24 = var25;
									if (var28 < 0.0F) {
										var24 = var25 - var49 * var28;
										var25 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var50 * var29;
										var29 = 0.0F;
									}

									int var142 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var142;
									var55 += var57 * var142;
									var58 += var60 * var142;
									if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var148;
										for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											ka(this, al_fld, var23, 0, 0, var148, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var148, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var147;
										for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											ka(this, al_fld, var23, 0, 0, var147, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var147 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var147, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var147 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								} else {
									var26 = var25;
									if (var28 < 0.0F) {
										var26 = var25 - var49 * var28;
										var25 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var27 < 0.0F) {
										var24 -= var50 * var27;
										var27 = 0.0F;
									}

									int var141 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var141;
									var55 += var57 * var141;
									var58 += var60 * var141;
									var28 = (int)(var28 + 0.5F);
									var27 = (int)(var27 + 0.5F);
									var29 = (int)(var29 + 0.5F) - var27;
									var27 -= var28;
									int var146 = var61[(int)var28];
									if (var49 < var48) {
										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var26, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var25, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								}
							}
						} else if (!(var29 >= var62)) {
							if (var27 > var62) {
								var27 = var62;
							}

							if (var28 > var62) {
								var28 = var62;
							}

							var12 = (var12 << 9) - var37 * (int)var26 + var37;
							var9 = this.cf(var6, var3, var9, var46, var47);
							if (var27 < var28) {
								var25 = var26;
								if (var29 < 0.0F) {
									var25 = var26 - var48 * var29;
									var26 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var27 < 0.0F) {
									var24 -= var49 * var27;
									var27 = 0.0F;
								}

								int var140 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var140;
								var55 += var57 * var140;
								var58 += var60 * var140;
								var29 = (int)(var29 + 0.5F);
								var27 = (int)(var27 + 0.5F);
								var28 = (int)(var28 + 0.5F) - var27;
								var27 -= var29;
								int var145 = var61[(int)var29];
								if (var48 < var50) {
									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							} else {
								var24 = var26;
								if (var29 < 0.0F) {
									var24 = var26 - var48 * var29;
									var26 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var28 < 0.0F) {
									var25 -= var49 * var28;
									var28 = 0.0F;
								}

								int var63 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								var29 = (int)(var29 + 0.5F);
								var28 = (int)(var28 + 0.5F);
								var27 = (int)(var27 + 0.5F) - var28;
								var28 -= var29;
								int var64 = var61[(int)var29];
								if (var48 < var50) {
									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var24, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var26, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var66) {
			throw new RuntimeException(var66);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	@Override
	void bx(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		float var13 = (int)(var4 + 0.5F);
		float var14 = (int)(var5 + 0.5F);
		float var15 = (int)(var6 + 0.5F);
		float var16 = (int)(var1 + 0.5F);
		float var17 = (int)(var2 + 0.5F);
		float var18 = (int)(var3 + 0.5F);
		float var19 = var14 - var13;
		float var20 = var17 - var16;
		float var21 = var15 - var13;
		float var22 = var18 - var16;
		float var23 = var19 * var22 - var21 * var20;
		if (var23 != 0.0F) {
			float var24 = var10;
			float var25 = var11;
			float var26 = var12;
			float var27 = var25 - var24;
			float var28 = var26 - var24;
			float var29 = (var27 * var22 - var28 * var20) / var23;
			float var30 = (var28 * var19 - var27 * var21) / var23;
			float var31 = var5 - var4;
			float var32 = var2 - var1;
			float var33 = var6 - var4;
			float var34 = var3 - var1;
			float var35 = var31 * var34 - var33 * var32;
			if (var35 != 0.0F) {
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * var34 - var37 * var32) / var35;
				float var39 = (var37 * var31 - var36 * var33) / var35;
				float var40;
				if (var18 != var17) {
					var40 = (var15 - var14) / (var18 - var17);
				} else {
					var40 = 0.0F;
				}

				float var41;
				if (var17 != var16) {
					var41 = var19 / var20;
				} else {
					var41 = 0.0F;
				}

				float var42;
				if (var18 != var16) {
					var42 = var21 / var22;
				} else {
					var42 = 0.0F;
				}

				int[] var43 = this.ar_fld.bm_fld;
				int var44 = this.ar_fld.ab_fld;
				if (var16 <= var17 && var16 <= var18) {
					if (!(var16 >= var44)) {
						if (var17 > var44) {
							var17 = var44;
						}

						if (var18 > var44) {
							var18 = var44;
						}

						var24 = var24 - var29 * var13 + var29;
						var7 = this.cf(var4, var1, var7, var38, var39);
						if (var17 < var18) {
							var15 = var13;
							if (var16 < 0.0F) {
								var15 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var17 < 0.0F) {
								var14 -= var40 * var17;
								var17 = 0.0F;
							}

							if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
								var16 = (int)(var16 + 0.5F);
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F) - var17;
								var17 -= var16;

								int var101;
								for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var101 += au_fld;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var101 += au_fld;
									var7 += var39;
								}
							} else {
								var16 = (int)(var16 + 0.5F);
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F) - var17;
								var17 -= var16;

								int var100;
								for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var100 += au_fld;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var100 += au_fld;
									var7 += var39;
								}
							}
						} else {
							var14 = var13;
							if (var16 < 0.0F) {
								var14 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var40 * var18;
								var18 = 0.0F;
							}

							if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
								var16 = (int)(var16 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var17 = (int)(var17 + 0.5F) - var18;
								var18 -= var16;

								int var99;
								for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var99 += au_fld;
								}

								while (--var17 >= 0.0F) {
									xp(this, al_fld, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var99 += au_fld;
									var7 += var39;
								}
							} else {
								var16 = (int)(var16 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var17 = (int)(var17 + 0.5F) - var18;
								var18 -= var16;

								int var98;
								for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var98 += au_fld;
								}

								while (--var17 >= 0.0F) {
									xp(this, al_fld, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var98 += au_fld;
									var7 += var39;
								}
							}
						}
					}
				} else if (var17 <= var18) {
					if (!(var17 >= var44)) {
						if (var18 > var44) {
							var18 = var44;
						}

						if (var16 > var44) {
							var16 = var44;
						}

						var25 = var25 - var29 * var14 + var29;
						var8 = this.cf(var5, var2, var8, var38, var39);
						if (var18 < var16) {
							var13 = var14;
							if (var17 < 0.0F) {
								var13 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var42 * var18;
								var18 = 0.0F;
							}

							if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var16 = (int)(var16 + 0.5F) - var18;
								var18 -= var17;

								int var97;
								for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									xp(this, al_fld, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var97 += au_fld;
								}

								while (--var16 >= 0.0F) {
									xp(this, al_fld, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var97 += au_fld;
									var8 += var39;
								}
							} else {
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var16 = (int)(var16 + 0.5F) - var18;
								var18 -= var17;

								int var96;
								for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									xp(this, al_fld, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var96 += au_fld;
								}

								while (--var16 >= 0.0F) {
									xp(this, al_fld, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var96 += au_fld;
									var8 += var39;
								}
							}
						} else {
							var15 = var14;
							if (var17 < 0.0F) {
								var15 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var16 < 0.0F) {
								var13 -= var42 * var16;
								var16 = 0.0F;
							}

							var17 = (int)(var17 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var18 = (int)(var18 + 0.5F) - var16;
							var16 -= var17;
							int var95 = var43[(int)var17];
							if (var41 < var40) {
								while (--var16 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}
							} else {
								while (--var16 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}
							}
						}
					}
				} else if (!(var18 >= var44)) {
					if (var16 > var44) {
						var16 = var44;
					}

					if (var17 > var44) {
						var17 = var44;
					}

					var26 = var26 - var29 * var15 + var29;
					var9 = this.cf(var6, var3, var9, var38, var39);
					if (var16 < var17) {
						var14 = var15;
						if (var18 < 0.0F) {
							var14 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var41 * var16;
							var16 = 0.0F;
						}

						var18 = (int)(var18 + 0.5F);
						var16 = (int)(var16 + 0.5F);
						var17 = (int)(var17 + 0.5F) - var16;
						var16 -= var18;
						int var94 = var43[(int)var18];
						if (var40 < var42) {
							while (--var16 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}
						} else {
							while (--var16 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}
						}
					} else {
						var13 = var15;
						if (var18 < 0.0F) {
							var13 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var17 < 0.0F) {
							var14 -= var41 * var17;
							var17 = 0.0F;
						}

						var18 = (int)(var18 + 0.5F);
						var17 = (int)(var17 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var17;
						var17 -= var18;
						int var45 = var43[(int)var18];
						if (var40 < var42) {
							while (--var17 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}
						} else {
							while (--var17 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}
						}
					}
				}
			}
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
				int var81 = this.ar_fld.aq_fld.av(var22, (byte)-13);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var81, var10), ag(var81, var11), ag(var81, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -1906860792);
				float var24 = (int)(var4 + 0.5F);
				float var25 = (int)(var5 + 0.5F);
				float var26 = (int)(var6 + 0.5F);
				float var27 = (int)(var1 + 0.5F);
				float var28 = (int)(var2 + 0.5F);
				float var29 = (int)(var3 + 0.5F);
				float var30 = var25 - var24;
				float var31 = var28 - var27;
				float var32 = var26 - var24;
				float var33 = var29 - var27;
				float var34 = var30 * var33 - var32 * var31;
				if (var34 != 0.0F) {
					float var35 = var11 - var10;
					float var36 = var12 - var10;
					int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
					int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
					float var39 = var5 - var4;
					float var40 = var2 - var1;
					float var41 = var6 - var4;
					float var42 = var3 - var1;
					float var43 = var39 * var42 - var41 * var40;
					if (var43 != 0.0F) {
						float var44 = var8 - var7;
						float var45 = var9 - var7;
						float var46 = (var44 * var42 - var45 * var40) / var43;
						float var47 = (var45 * var39 - var44 * var41) / var43;
						float var48;
						if (var29 != var28) {
							var48 = (var26 - var25) / (var29 - var28);
						} else {
							var48 = 0.0F;
						}

						float var49;
						if (var28 != var27) {
							var49 = var30 / var31;
						} else {
							var49 = 0.0F;
						}

						float var50;
						if (var29 != var27) {
							var50 = var32 / var33;
						} else {
							var50 = 0.0F;
						}

						int var51 = this.ar_fld.ai_fld;
						var14 = var13 - var14;
						var17 = var16 - var17;
						var20 = var19 - var20;
						var15 -= var13;
						var18 -= var16;
						var21 -= var19;
						int var52 = var15 * var16 - var18 * var13 << 14;
						int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / var51);
						int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
						int var55 = var14 * var16 - var17 * var13 << 14;
						int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / var51);
						int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
						int var58 = var17 * var15 - var14 * var18 << 14;
						int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / var51);
						int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
						int[] var61 = this.ar_fld.bm_fld;
						int var62 = this.ar_fld.ab_fld;
						if (var27 <= var28 && var27 <= var29) {
							if (!(var27 >= var62)) {
								if (var28 > var62) {
									var28 = var62;
								}

								if (var29 > var62) {
									var29 = var62;
								}

								var10 = (var10 << 9) - var37 * (int)var24 + var37;
								var7 = this.cf(var4, var1, var7, var46, var47);
								if (var28 < var29) {
									var26 = var24;
									if (var27 < 0.0F) {
										var26 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 -= var38 * (int)var27;
										var27 = 0.0F;
									}

									if (var28 < 0.0F) {
										var25 -= var48 * var28;
										var28 = 0.0F;
									}

									int var146 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var146;
									var55 += var57 * var146;
									var58 += var60 * var146;
									if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var154;
										for (var154 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											this.ce(al_fld, var23, 0, 0, var154, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var154 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var154, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var154 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var153;
										for (var153 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											this.ce(al_fld, var23, 0, 0, var153, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var153 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var153, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var153 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								} else {
									var25 = var24;
									if (var27 < 0.0F) {
										var25 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 -= var38 * (int)var27;
										var27 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var48 * var29;
										var29 = 0.0F;
									}

									int var145 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var145;
									var55 += var57 * var145;
									var58 += var60 * var145;
									if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var152;
										for (var152 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											this.ce(al_fld, var23, 0, 0, var152, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var152, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var151;
										for (var151 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											this.ce(al_fld, var23, 0, 0, var151, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var151, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								}
							}
						} else if (var28 <= var29) {
							if (!(var28 >= var62)) {
								if (var29 > var62) {
									var29 = var62;
								}

								if (var27 > var62) {
									var27 = var62;
								}

								var11 = (var11 << 9) - var37 * (int)var25 + var37;
								var8 = this.cf(var5, var2, var8, var46, var47);
								if (var29 < var27) {
									var24 = var25;
									if (var28 < 0.0F) {
										var24 = var25 - var49 * var28;
										var25 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var50 * var29;
										var29 = 0.0F;
									}

									int var144 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var144;
									var55 += var57 * var144;
									var58 += var60 * var144;
									if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var150;
										for (var150 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											this.ce(al_fld, var23, 0, 0, var150, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var150, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var149;
										for (var149 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											this.ce(al_fld, var23, 0, 0, var149, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var149, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								} else {
									float var83;
									var26 = var83 = var25;
									if (var28 < 0.0F) {
										var26 -= var49 * var28;
										var83 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var27 < 0.0F) {
										var24 -= var50 * var27;
										var27 = 0.0F;
									}

									int var143 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var143;
									var55 += var57 * var143;
									var58 += var60 * var143;
									var28 = (int)(var28 + 0.5F);
									var27 = (int)(var27 + 0.5F);
									var29 = (int)(var29 + 0.5F) - var27;
									var27 -= var28;
									int var148 = var61[(int)var28];
									if (var49 < var48) {
										while (--var27 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var148, (int)var26, (int)var83, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var83 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var148, (int)var24, (int)var83, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var83 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										while (--var27 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var148, (int)var83, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var83 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											this.ce(al_fld, var23, 0, 0, var148, (int)var83, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var83 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								}
							}
						} else if (!(var29 >= var62)) {
							if (var27 > var62) {
								var27 = var62;
							}

							if (var28 > var62) {
								var28 = var62;
							}

							var12 = (var12 << 9) - var37 * (int)var26 + var37;
							var9 = this.cf(var6, var3, var9, var46, var47);
							if (var27 < var28) {
								var25 = var26;
								if (var29 < 0.0F) {
									var25 = var26 - var48 * var29;
									var26 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var27 < 0.0F) {
									var24 -= var49 * var27;
									var27 = 0.0F;
								}

								int var142 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var142;
								var55 += var57 * var142;
								var58 += var60 * var142;
								var29 = (int)(var29 + 0.5F);
								var27 = (int)(var27 + 0.5F);
								var28 = (int)(var28 + 0.5F) - var27;
								var27 -= var29;
								int var147 = var61[(int)var29];
								if (var48 < var50) {
									while (--var27 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var147, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var147 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var147, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var147 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var27 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var147, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var147 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var147, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var147 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							} else {
								float var85;
								var24 = var85 = var26;
								if (var29 < 0.0F) {
									var24 -= var48 * var29;
									var85 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var28 < 0.0F) {
									var25 -= var49 * var28;
									var28 = 0.0F;
								}

								int var63 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								var29 = (int)(var29 + 0.5F);
								var28 = (int)(var28 + 0.5F);
								var27 = (int)(var27 + 0.5F) - var28;
								var28 -= var29;
								int var64 = var61[(int)var29];
								if (var48 < var50) {
									while (--var28 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var64, (int)var24, (int)var85, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var85 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var64, (int)var25, (int)var85, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var85 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var28 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var64, (int)var85, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var85 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										this.ce(al_fld, var23, 0, 0, var64, (int)var85, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var85 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var66) {
			throw new RuntimeException(var66);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void bt(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		float var11 = (int)(var4 + 0.5F);
		float var12 = (int)(var5 + 0.5F);
		float var13 = (int)(var6 + 0.5F);
		float var14 = (int)(var1 + 0.5F);
		float var15 = (int)(var2 + 0.5F);
		float var16 = (int)(var3 + 0.5F);
		float var17 = var12 - var11;
		float var18 = var15 - var14;
		float var19 = var13 - var11;
		float var20 = var16 - var14;
		float var21 = var5 - var4;
		float var22 = var2 - var1;
		float var23 = var6 - var4;
		float var24 = var3 - var1;
		float var25 = var21 * var24 - var23 * var22;
		if (var25 != 0.0F) {
			float var26 = var8 - var7;
			float var27 = var9 - var7;
			float var28 = (var26 * var24 - var27 * var22) / var25;
			float var29 = (var27 * var21 - var26 * var23) / var25;
			float var30;
			if (var16 != var15) {
				var30 = (var13 - var12) / (var16 - var15);
			} else {
				var30 = 0.0F;
			}

			float var31;
			if (var15 != var14) {
				var31 = var17 / var18;
			} else {
				var31 = 0.0F;
			}

			float var32;
			if (var16 != var14) {
				var32 = var19 / var20;
			} else {
				var32 = 0.0F;
			}

			int[] var33 = this.ar_fld.bm_fld;
			int var34 = this.ar_fld.ab_fld;
			if (var14 <= var15 && var14 <= var16) {
				if (!(var14 >= var34)) {
					if (var15 > var34) {
						var15 = var34;
					}

					if (var16 > var34) {
						var16 = var34;
					}

					var7 = this.cf(var4, var1, var7, var28, var29);
					if (var15 < var16) {
						var13 = var11;
						if (var14 < 0.0F) {
							var13 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var15 < 0.0F) {
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var88;
							for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var88, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var32;
								var11 += var31;
								var88 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var88, var10, 0, (int)var12, (int)var13, var7, var28);
								var13 += var32;
								var12 += var30;
								var88 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var87;
							for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var32;
								var11 += var31;
								var87 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var12, var7, var28);
								var13 += var32;
								var12 += var30;
								var87 += au_fld;
								var7 += var29;
							}
						}
					} else {
						var12 = var11;
						if (var14 < 0.0F) {
							var12 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var30 * var16;
							var16 = 0.0F;
						}

						if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var86;
							for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var12, var7, var28);
								var12 += var32;
								var11 += var31;
								var86 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var30;
								var11 += var31;
								var86 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var85;
							for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var85, var10, 0, (int)var12, (int)var11, var7, var28);
								var12 += var32;
								var11 += var31;
								var85 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var85, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var30;
								var11 += var31;
								var85 += au_fld;
								var7 += var29;
							}
						}
					}
				}
			} else if (var15 <= var16) {
				if (!(var15 >= var34)) {
					if (var16 > var34) {
						var16 = var34;
					}

					if (var14 > var34) {
						var14 = var34;
					}

					var8 = this.cf(var5, var2, var8, var28, var29);
					if (var16 < var14) {
						var11 = var12;
						if (var15 < 0.0F) {
							var11 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var32 * var16;
							var16 = 0.0F;
						}

						if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var84;
							for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var84, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var31;
								var12 += var30;
								var84 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var84, var10, 0, (int)var13, (int)var11, var8, var28);
								var11 += var31;
								var13 += var32;
								var84 += au_fld;
								var8 += var29;
							}
						} else {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var83;
							for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var31;
								var12 += var30;
								var83 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var13, var8, var28);
								var11 += var31;
								var13 += var32;
								var83 += au_fld;
								var8 += var29;
							}
						}
					} else {
						var13 = var12;
						if (var15 < 0.0F) {
							var13 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var14 < 0.0F) {
							var11 -= var32 * var14;
							var14 = 0.0F;
						}

						var15 = (int)(var15 + 0.5F);
						var14 = (int)(var14 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var14;
						var14 -= var15;
						int var82 = var33[(int)var15];
						if (var31 < var30) {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var13, (int)var12, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						} else {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var13, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						}
					}
				}
			} else if (!(var16 >= var34)) {
				if (var14 > var34) {
					var14 = var34;
				}

				if (var15 > var34) {
					var15 = var34;
				}

				var9 = this.cf(var6, var3, var9, var28, var29);
				if (var14 < var15) {
					var12 = var13;
					if (var16 < 0.0F) {
						var12 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var14 < 0.0F) {
						var11 -= var31 * var14;
						var14 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var14 = (int)(var14 + 0.5F);
					var15 = (int)(var15 + 0.5F) - var14;
					var14 -= var16;
					int var81 = var33[(int)var16];
					if (var30 < var32) {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var11, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var11, (int)var12, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					}
				} else {
					var11 = var13;
					if (var16 < 0.0F) {
						var11 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var15 < 0.0F) {
						var12 -= var31 * var15;
						var15 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var15 = (int)(var15 + 0.5F);
					var14 = (int)(var14 + 0.5F) - var15;
					var15 -= var16;
					int var35 = var33[(int)var16];
					if (var30 < var32) {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var11, (int)var13, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var11, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
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
		float var11 = (int)(var4 + 0.5F);
		float var12 = (int)(var5 + 0.5F);
		float var13 = (int)(var6 + 0.5F);
		float var14 = (int)(var1 + 0.5F);
		float var15 = (int)(var2 + 0.5F);
		float var16 = (int)(var3 + 0.5F);
		float var17 = var12 - var11;
		float var18 = var15 - var14;
		float var19 = var13 - var11;
		float var20 = var16 - var14;
		float var21 = var5 - var4;
		float var22 = var2 - var1;
		float var23 = var6 - var4;
		float var24 = var3 - var1;
		float var25 = var21 * var24 - var23 * var22;
		if (var25 != 0.0F) {
			float var26 = var8 - var7;
			float var27 = var9 - var7;
			float var28 = (var26 * var24 - var27 * var22) / var25;
			float var29 = (var27 * var21 - var26 * var23) / var25;
			float var30;
			if (var16 != var15) {
				var30 = (var13 - var12) / (var16 - var15);
			} else {
				var30 = 0.0F;
			}

			float var31;
			if (var15 != var14) {
				var31 = var17 / var18;
			} else {
				var31 = 0.0F;
			}

			float var32;
			if (var16 != var14) {
				var32 = var19 / var20;
			} else {
				var32 = 0.0F;
			}

			int[] var33 = this.ar_fld.bm_fld;
			int var34 = this.ar_fld.ab_fld;
			if (var14 <= var15 && var14 <= var16) {
				if (!(var14 >= var34)) {
					if (var15 > var34) {
						var15 = var34;
					}

					if (var16 > var34) {
						var16 = var34;
					}

					var7 = this.cf(var4, var1, var7, var28, var29);
					if (var15 < var16) {
						var13 = var11;
						if (var14 < 0.0F) {
							var13 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var15 < 0.0F) {
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var88;
							for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var88, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var32;
								var11 += var31;
								var88 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var88, var10, 0, (int)var12, (int)var13, var7, var28);
								var13 += var32;
								var12 += var30;
								var88 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var87;
							for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var32;
								var11 += var31;
								var87 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var12, var7, var28);
								var13 += var32;
								var12 += var30;
								var87 += au_fld;
								var7 += var29;
							}
						}
					} else {
						var12 = var11;
						if (var14 < 0.0F) {
							var12 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var30 * var16;
							var16 = 0.0F;
						}

						if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var86;
							for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var12, var7, var28);
								var12 += var32;
								var11 += var31;
								var86 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var30;
								var11 += var31;
								var86 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var85;
							for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var85, var10, 0, (int)var12, (int)var11, var7, var28);
								var12 += var32;
								var11 += var31;
								var85 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var85, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var30;
								var11 += var31;
								var85 += au_fld;
								var7 += var29;
							}
						}
					}
				}
			} else if (var15 <= var16) {
				if (!(var15 >= var34)) {
					if (var16 > var34) {
						var16 = var34;
					}

					if (var14 > var34) {
						var14 = var34;
					}

					var8 = this.cf(var5, var2, var8, var28, var29);
					if (var16 < var14) {
						var11 = var12;
						if (var15 < 0.0F) {
							var11 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var32 * var16;
							var16 = 0.0F;
						}

						if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var84;
							for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var84, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var31;
								var12 += var30;
								var84 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var84, var10, 0, (int)var13, (int)var11, var8, var28);
								var11 += var31;
								var13 += var32;
								var84 += au_fld;
								var8 += var29;
							}
						} else {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var83;
							for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var31;
								var12 += var30;
								var83 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var13, var8, var28);
								var11 += var31;
								var13 += var32;
								var83 += au_fld;
								var8 += var29;
							}
						}
					} else {
						var13 = var12;
						if (var15 < 0.0F) {
							var13 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var14 < 0.0F) {
							var11 -= var32 * var14;
							var14 = 0.0F;
						}

						var15 = (int)(var15 + 0.5F);
						var14 = (int)(var14 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var14;
						var14 -= var15;
						int var82 = var33[(int)var15];
						if (var31 < var30) {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var13, (int)var12, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						} else {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var13, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						}
					}
				}
			} else if (!(var16 >= var34)) {
				if (var14 > var34) {
					var14 = var34;
				}

				if (var15 > var34) {
					var15 = var34;
				}

				var9 = this.cf(var6, var3, var9, var28, var29);
				if (var14 < var15) {
					var12 = var13;
					if (var16 < 0.0F) {
						var12 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var14 < 0.0F) {
						var11 -= var31 * var14;
						var14 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var14 = (int)(var14 + 0.5F);
					var15 = (int)(var15 + 0.5F) - var14;
					var14 -= var16;
					int var81 = var33[(int)var16];
					if (var30 < var32) {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var11, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var11, (int)var12, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					}
				} else {
					var11 = var13;
					if (var16 < 0.0F) {
						var11 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var15 < 0.0F) {
						var12 -= var31 * var15;
						var15 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var15 = (int)(var15 + 0.5F);
					var14 = (int)(var14 + 0.5F) - var15;
					var15 -= var16;
					int var35 = var33[(int)var16];
					if (var30 < var32) {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var11, (int)var13, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var11, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void bi(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		float var11 = (int)(var4 + 0.5F);
		float var12 = (int)(var5 + 0.5F);
		float var13 = (int)(var6 + 0.5F);
		float var14 = (int)(var1 + 0.5F);
		float var15 = (int)(var2 + 0.5F);
		float var16 = (int)(var3 + 0.5F);
		float var17 = var12 - var11;
		float var18 = var15 - var14;
		float var19 = var13 - var11;
		float var20 = var16 - var14;
		float var21 = var5 - var4;
		float var22 = var2 - var1;
		float var23 = var6 - var4;
		float var24 = var3 - var1;
		float var25 = var21 * var24 - var23 * var22;
		if (var25 != 0.0F) {
			float var26 = var8 - var7;
			float var27 = var9 - var7;
			float var28 = (var26 * var24 - var27 * var22) / var25;
			float var29 = (var27 * var21 - var26 * var23) / var25;
			float var30;
			if (var16 != var15) {
				var30 = (var13 - var12) / (var16 - var15);
			} else {
				var30 = 0.0F;
			}

			float var31;
			if (var15 != var14) {
				var31 = var17 / var18;
			} else {
				var31 = 0.0F;
			}

			float var32;
			if (var16 != var14) {
				var32 = var19 / var20;
			} else {
				var32 = 0.0F;
			}

			int[] var33 = this.ar_fld.bm_fld;
			int var34 = this.ar_fld.ab_fld;
			if (var14 <= var15 && var14 <= var16) {
				if (!(var14 >= var34)) {
					if (var15 > var34) {
						var15 = var34;
					}

					if (var16 > var34) {
						var16 = var34;
					}

					var7 = this.cf(var4, var1, var7, var28, var29);
					if (var15 < var16) {
						var13 = var11;
						if (var14 < 0.0F) {
							var13 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var15 < 0.0F) {
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var88;
							for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var88, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var32;
								var11 += var31;
								var88 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var88, var10, 0, (int)var12, (int)var13, var7, var28);
								var13 += var32;
								var12 += var30;
								var88 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var87;
							for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var32;
								var11 += var31;
								var87 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var12, var7, var28);
								var13 += var32;
								var12 += var30;
								var87 += au_fld;
								var7 += var29;
							}
						}
					} else {
						var12 = var11;
						if (var14 < 0.0F) {
							var12 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var30 * var16;
							var16 = 0.0F;
						}

						if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var86;
							for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var12, var7, var28);
								var12 += var32;
								var11 += var31;
								var86 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var30;
								var11 += var31;
								var86 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var85;
							for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var85, var10, 0, (int)var12, (int)var11, var7, var28);
								var12 += var32;
								var11 += var31;
								var85 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var85, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var30;
								var11 += var31;
								var85 += au_fld;
								var7 += var29;
							}
						}
					}
				}
			} else if (var15 <= var16) {
				if (!(var15 >= var34)) {
					if (var16 > var34) {
						var16 = var34;
					}

					if (var14 > var34) {
						var14 = var34;
					}

					var8 = this.cf(var5, var2, var8, var28, var29);
					if (var16 < var14) {
						var11 = var12;
						if (var15 < 0.0F) {
							var11 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var32 * var16;
							var16 = 0.0F;
						}

						if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var84;
							for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var84, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var31;
								var12 += var30;
								var84 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var84, var10, 0, (int)var13, (int)var11, var8, var28);
								var11 += var31;
								var13 += var32;
								var84 += au_fld;
								var8 += var29;
							}
						} else {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var83;
							for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var31;
								var12 += var30;
								var83 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var13, var8, var28);
								var11 += var31;
								var13 += var32;
								var83 += au_fld;
								var8 += var29;
							}
						}
					} else {
						var13 = var12;
						if (var15 < 0.0F) {
							var13 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var14 < 0.0F) {
							var11 -= var32 * var14;
							var14 = 0.0F;
						}

						var15 = (int)(var15 + 0.5F);
						var14 = (int)(var14 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var14;
						var14 -= var15;
						int var82 = var33[(int)var15];
						if (var31 < var30) {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var13, (int)var12, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						} else {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var13, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						}
					}
				}
			} else if (!(var16 >= var34)) {
				if (var14 > var34) {
					var14 = var34;
				}

				if (var15 > var34) {
					var15 = var34;
				}

				var9 = this.cf(var6, var3, var9, var28, var29);
				if (var14 < var15) {
					var12 = var13;
					if (var16 < 0.0F) {
						var12 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var14 < 0.0F) {
						var11 -= var31 * var14;
						var14 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var14 = (int)(var14 + 0.5F);
					var15 = (int)(var15 + 0.5F) - var14;
					var14 -= var16;
					int var81 = var33[(int)var16];
					if (var30 < var32) {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var11, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var11, (int)var12, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					}
				} else {
					var11 = var13;
					if (var16 < 0.0F) {
						var11 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var15 < 0.0F) {
						var12 -= var31 * var15;
						var15 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var15 = (int)(var15 + 0.5F);
					var14 = (int)(var14 + 0.5F) - var15;
					var15 -= var16;
					int var35 = var33[(int)var16];
					if (var30 < var32) {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var11, (int)var13, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var11, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(FFFFF)F"
	)
	float dd(float var1, float var2, float var3, float var4, float var5) {
		var3 = var3 - var4 * var1 + var4;
		if (var2 < 0.0F) {
			var3 -= var5 * (int)var2;
		}

		return var3 - var5 * (var2 - (int)(var2 + 0.5F));
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[IIIIIIFFFF)V"
	)
	public static void xp(fq var0, int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
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
				var2 += var5 - 1;
				var7 += var8 * var5;
				var9 += var10 * var5;
				if (var0.ar_fld.an_fld) {
					var4 = var6 - var5 >> 2;
					var8 *= 4.0F;
					if (var0.ar_fld.aa_fld == 0) {
						if (var4 > 0) {
							do {
								int var40 = (int)var7 & 65535;
								var3 = var0.as_fld[var40];
								var7 += var8;
								var0.cc(var1, an_fld, ++var2, var3, var9);
								var9 += var10;
								var0.cc(var1, an_fld, ++var2, var3, var9);
								var9 += var10;
								var0.cc(var1, an_fld, ++var2, var3, var9);
								var9 += var10;
								var0.cc(var1, an_fld, ++var2, var3, var9);
								var9 += var10;
							} while (--var4 > 0);
						}

						var4 = var6 - var5 & 3;
						if (var4 > 0) {
							int var41 = (int)var7 & 65535;
							var3 = var0.as_fld[var41];

							do {
								var0.cc(var1, an_fld, ++var2, var3, var9);
								var9 += var10;
							} while (--var4 > 0);
						}
					} else {
						int var42 = var0.ar_fld.aa_fld;
						int var43 = 256 - var0.ar_fld.aa_fld;
						if (var4 > 0) {
							do {
								int var13 = (int)var7 & 65535;
								var3 = var0.as_fld[var13];
								var7 += var8;
								var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);
								var0.cv(var1, an_fld, ++var2, var3, var42, var9);
								var9 += var10;
								var0.cv(var1, an_fld, ++var2, var3, var42, var9);
								var9 += var10;
								var0.cv(var1, an_fld, ++var2, var3, var42, var9);
								var9 += var10;
								var0.cv(var1, an_fld, ++var2, var3, var42, var9);
								var9 += var10;
							} while (--var4 > 0);
						}

						var4 = var6 - var5 & 3;
						if (var4 > 0) {
							int var44 = (int)var7 & 65535;
							var3 = var0.as_fld[var44];
							var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);

							do {
								var0.cv(var1, an_fld, ++var2, var3, var42, var9);
								var9 += var10;
							} while (--var4 > 0);
						}
					}
				} else {
					var4 = var6 - var5;
					if (var0.ar_fld.aa_fld == 0) {
						do {
							var0.cq(var1, an_fld, ++var2, (int)var7 & 65535, var9);
							var9 += var10;
							var7 += var8;
						} while (--var4 > 0);
					} else {
						int var11 = var0.ar_fld.aa_fld;
						int var12 = 256 - var0.ar_fld.aa_fld;

						do {
							sz(var0, var1, an_fld, ++var2, (int)var7 & 65535, var11, var12, var9);
							var9 += var10;
							var7 += var8;
						} while (--var4 > 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[FIIIIF)V"
	)
	public static void sz(fq var0, int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		if (var0 == null) {
			var0.getClass();
		}

		int var8 = var0.as_fld[var4];
		var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
		int var9 = var1[var3];
		var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
		int var10 = var0.ar_fld.br_fld & bw(var2[var3], var7);
		var1[var3] = (var10 & var8) + (~var10 & var9);
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
				int var81 = this.ar_fld.aq_fld.av(var22, (byte)-128);
				this.bl(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var81, var10), ag(var81, var11), ag(var81, var12));
			} else {
				this.ay_fld = this.ar_fld.aq_fld.ae(var22, -2025467883);
				float var24 = (int)(var4 + 0.5F);
				float var25 = (int)(var5 + 0.5F);
				float var26 = (int)(var6 + 0.5F);
				float var27 = (int)(var1 + 0.5F);
				float var28 = (int)(var2 + 0.5F);
				float var29 = (int)(var3 + 0.5F);
				float var30 = var25 - var24;
				float var31 = var28 - var27;
				float var32 = var26 - var24;
				float var33 = var29 - var27;
				float var34 = var30 * var33 - var32 * var31;
				if (var34 != 0.0F) {
					float var35 = var11 - var10;
					float var36 = var12 - var10;
					int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
					int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
					float var39 = var5 - var4;
					float var40 = var2 - var1;
					float var41 = var6 - var4;
					float var42 = var3 - var1;
					float var43 = var39 * var42 - var41 * var40;
					if (var43 != 0.0F) {
						float var44 = var8 - var7;
						float var45 = var9 - var7;
						float var46 = (var44 * var42 - var45 * var40) / var43;
						float var47 = (var45 * var39 - var44 * var41) / var43;
						float var48;
						if (var29 != var28) {
							var48 = (var26 - var25) / (var29 - var28);
						} else {
							var48 = 0.0F;
						}

						float var49;
						if (var28 != var27) {
							var49 = var30 / var31;
						} else {
							var49 = 0.0F;
						}

						float var50;
						if (var29 != var27) {
							var50 = var32 / var33;
						} else {
							var50 = 0.0F;
						}

						int var51 = this.ar_fld.ai_fld;
						var14 = var13 - var14;
						var17 = var16 - var17;
						var20 = var19 - var20;
						var15 -= var13;
						var18 -= var16;
						var21 -= var19;
						int var52 = var15 * var16 - var18 * var13 << 14;
						int var53 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / var51);
						int var54 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / var51);
						int var55 = var14 * var16 - var17 * var13 << 14;
						int var56 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / var51);
						int var57 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / var51);
						int var58 = var17 * var15 - var14 * var18 << 14;
						int var59 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / var51);
						int var60 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / var51);
						int[] var61 = this.ar_fld.bm_fld;
						int var62 = this.ar_fld.ab_fld;
						if (var27 <= var28 && var27 <= var29) {
							if (!(var27 >= var62)) {
								if (var28 > var62) {
									var28 = var62;
								}

								if (var29 > var62) {
									var29 = var62;
								}

								var10 = (var10 << 9) - var37 * (int)var24 + var37;
								var7 = this.cf(var4, var1, var7, var46, var47);
								if (var28 < var29) {
									var26 = var24;
									if (var27 < 0.0F) {
										var26 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 -= var38 * (int)var27;
										var27 = 0.0F;
									}

									if (var28 < 0.0F) {
										var25 -= var48 * var28;
										var28 = 0.0F;
									}

									int var144 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var144;
									var55 += var57 * var144;
									var58 += var60 * var144;
									if ((var27 == var28 || !(var50 < var49)) && (var27 != var28 || !(var50 > var48))) {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var152;
										for (var152 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var152, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var152, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var152 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F) - var28;
										var28 -= var27;

										int var151;
										for (var151 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var151, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var24 += var49;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var151, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var50;
											var25 += var48;
											var10 += var38;
											var151 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								} else {
									var25 = var24;
									if (var27 < 0.0F) {
										var25 = var24 - var50 * var27;
										var24 -= var49 * var27;
										var10 = (int)(var10 - var38 * var27);
										var27 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var48 * var29;
										var29 = 0.0F;
									}

									int var143 = (int)var27 - this.ar_fld.ad_fld;
									var52 += var54 * var143;
									var55 += var57 * var143;
									var58 += var60 * var143;
									if ((var27 == var29 || !(var50 < var49)) && (var27 != var29 || !(var48 > var49))) {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var150;
										for (var150 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var150, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var150, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var150 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									} else {
										var27 = (int)(var27 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var28 = (int)(var28 + 0.5F) - var29;
										var29 -= var27;

										int var149;
										for (var149 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
											ka(this, al_fld, var23, 0, 0, var149, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var25 += var50;
											var24 += var49;
											var10 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var28 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var149, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
											var26 += var48;
											var24 += var49;
											var10 += var38;
											var149 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var7 += var47;
										}
									}
								}
							}
						} else if (var28 <= var29) {
							if (!(var28 >= var62)) {
								if (var29 > var62) {
									var29 = var62;
								}

								if (var27 > var62) {
									var27 = var62;
								}

								var11 = (var11 << 9) - var37 * (int)var25 + var37;
								var8 = this.cf(var5, var2, var8, var46, var47);
								if (var29 < var27) {
									var24 = var25;
									if (var28 < 0.0F) {
										var24 = var25 - var49 * var28;
										var25 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var29 < 0.0F) {
										var26 -= var50 * var29;
										var29 = 0.0F;
									}

									int var142 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var142;
									var55 += var57 * var142;
									var58 += var60 * var142;
									if ((var28 == var29 || !(var49 < var48)) && (var28 != var29 || !(var49 > var50))) {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var148;
										for (var148 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											ka(this, al_fld, var23, 0, 0, var148, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var148, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var148 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										var28 = (int)(var28 + 0.5F);
										var29 = (int)(var29 + 0.5F);
										var27 = (int)(var27 + 0.5F) - var29;
										var29 -= var28;

										int var147;
										for (var147 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
											ka(this, al_fld, var23, 0, 0, var147, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var25 += var48;
											var11 += var38;
											var147 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
										}

										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var147, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var49;
											var26 += var50;
											var11 += var38;
											var147 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								} else {
									var26 = var25;
									if (var28 < 0.0F) {
										var26 = var25 - var49 * var28;
										var25 -= var48 * var28;
										var11 -= var38 * (int)var28;
										var28 = 0.0F;
									}

									if (var27 < 0.0F) {
										var24 -= var50 * var27;
										var27 = 0.0F;
									}

									int var141 = (int)var28 - this.ar_fld.ad_fld;
									var52 += var54 * var141;
									var55 += var57 * var141;
									var58 += var60 * var141;
									var28 = (int)(var28 + 0.5F);
									var27 = (int)(var27 + 0.5F);
									var29 = (int)(var29 + 0.5F) - var27;
									var27 -= var28;
									int var146 = var61[(int)var28];
									if (var49 < var48) {
										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var26, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									} else {
										while (--var27 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var25, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var26 += var49;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}

										while (--var29 >= 0.0F) {
											ka(this, al_fld, var23, 0, 0, var146, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
											var24 += var50;
											var25 += var48;
											var11 += var38;
											var146 += au_fld;
											var52 += var54;
											var55 += var57;
											var58 += var60;
											var8 += var47;
										}
									}
								}
							}
						} else if (!(var29 >= var62)) {
							if (var27 > var62) {
								var27 = var62;
							}

							if (var28 > var62) {
								var28 = var62;
							}

							var12 = (var12 << 9) - var37 * (int)var26 + var37;
							var9 = this.cf(var6, var3, var9, var46, var47);
							if (var27 < var28) {
								var25 = var26;
								if (var29 < 0.0F) {
									var25 = var26 - var48 * var29;
									var26 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var27 < 0.0F) {
									var24 -= var49 * var27;
									var27 = 0.0F;
								}

								int var140 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var140;
								var55 += var57 * var140;
								var58 += var60 * var140;
								var29 = (int)(var29 + 0.5F);
								var27 = (int)(var27 + 0.5F);
								var28 = (int)(var28 + 0.5F) - var27;
								var27 -= var29;
								int var145 = var61[(int)var29];
								if (var48 < var50) {
									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var26 += var50;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var145, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var48;
										var24 += var49;
										var12 += var38;
										var145 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							} else {
								var24 = var26;
								if (var29 < 0.0F) {
									var24 = var26 - var48 * var29;
									var26 -= var50 * var29;
									var12 -= var38 * (int)var29;
									var29 = 0.0F;
								}

								if (var28 < 0.0F) {
									var25 -= var49 * var28;
									var28 = 0.0F;
								}

								int var63 = (int)var29 - this.ar_fld.ad_fld;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								var29 = (int)(var29 + 0.5F);
								var28 = (int)(var28 + 0.5F);
								var27 = (int)(var27 + 0.5F) - var28;
								var28 -= var29;
								int var64 = var61[(int)var29];
								if (var48 < var50) {
									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var24, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								} else {
									while (--var28 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var26, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var24 += var48;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}

									while (--var27 >= 0.0F) {
										ka(this, al_fld, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
										var25 += var49;
										var26 += var50;
										var12 += var38;
										var64 += au_fld;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var9 += var47;
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var66) {
			throw new RuntimeException(var66);
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(FFFFF)F"
	)
	float do_(float var1, float var2, float var3, float var4, float var5) {
		var3 = var3 - var4 * var1 + var4;
		if (var2 < 0.0F) {
			var3 -= var5 * (int)var2;
		}

		return var3 - var5 * (var2 - (int)(var2 + 0.5F));
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIIF)V"
	)
	final void cu(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
		int var10 = var1[var4];
		var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
		int var11 = this.ar_fld.br_fld & bw(var2[var4], var8);
		var1[var4] = (var11 & var9) + (~var11 & var10);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(FF)I"
	)
	static final int cr(float var0, float var1) {
		return Float.floatToRawIntBits(var0 - var1) >> 31;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(FF)I"
	)
	static final int ca(float var0, float var1) {
		return Float.floatToRawIntBits(var0 - var1) >> 31;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIF)V"
	)
	final void bq(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		var8 = ((var8 & 16711935) * var5 & 1813987938) + ((var8 & 364717990) * var5 & 0xFF0000) >> 8;
		this.ba(var1, var2, var4, var8, var7, bw(var2[var4], var7));
	}

	fq(fo var1) {
		super(var1);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIIF)V"
	)
	final void cj(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
		int var10 = var1[var4];
		var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
		int var11 = this.ar_fld.br_fld & bw(var2[var4], var8);
		var1[var4] = (var11 & var9) + (~var11 & var10);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIF)V"
	)
	final void co(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		if (var8 != 0) {
			var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
			this.ba(var1, var2, var4, var8, var7, bw(var2[var4], var7));
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIF)V"
	)
	final void cm(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		if (var8 != 0) {
			var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
			this.ba(var1, var2, var4, var8, var7, bw(var2[var4], var7));
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIIF)V"
	)
	final void bg(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		if (var9 != 0) {
			var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 0xFF00) * var6 & 0xFF0000) >> 8;
			int var10 = var1[var4];
			var9 += ((var10 & 16711935) * var5 & -16711936 | (var10 & 0xFF00) * var5 & 0xFF0000) >> 8;
			int var11 = this.ar_fld.br_fld & bw(var2[var4], var8);
			var1[var4] = (var11 & var9) + (~var11 & var10);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean be() {
		return true;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIIF)V"
	)
	final void cz(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		if (var9 != 0) {
			var9 = ((var9 & -1305297893) * var6 & -16711936 | (var9 & 1447677727) * var6 & -578967248) >> 8;
			int var10 = var1[var4];
			var9 += ((var10 & 16711935) * var5 & -2092023530 | (var10 & -827184534) * var5 & -467887168) >> 8;
			int var11 = this.ar_fld.br_fld & bw(var2[var4], var8);
			var1[var4] = (var11 & var9) + (~var11 & var10);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([I[FIIF)V"
	)
	final void ch(int[] var1, float[] var2, int var3, int var4, float var5) {
		this.ba(var1, var2, var3, var4, var5, bw(var2[var3], var5));
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "([I[FIIF)V"
	)
	final void cl(int[] var1, float[] var2, int var3, int var4, float var5) {
		this.ba(var1, var2, var3, this.as_fld[var4], var5, bw(var2[var3], var5));
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "([IIIIIIFF)V"
	)
	final void cs(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5 - 1;
			var4 = var6 - var5 >> 2;
			var7 += var8 * var5;
			if (this.ar_fld.aa_fld != 0) {
				if (this.ar_fld.aa_fld == 254) {
					if (var5 == 0 || var6 > this.ar_fld.ao_fld - 1) {
						return;
					}

					while (--var4 >= 0) {
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
					}

					for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
					}
				} else {
					int var9 = this.ar_fld.aa_fld;
					int var10 = 256 - this.ar_fld.aa_fld;
					var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

					while (--var4 >= 0) {
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
					}

					for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
					}
				}
			} else {
				while (--var4 >= 0) {
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
				}

				for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
					this.cc(var1, an_fld, ++var2, var3, var7);
				}
			}
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "([I[FIIF)V"
	)
	final void dh(int[] var1, float[] var2, int var3, int var4, float var5) {
		this.ba(var1, var2, var3, this.as_fld[var4], var5, bw(var2[var3], var5));
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFI)V"
	)
	@Override
	void bp(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		float var11 = (int)(var4 + 0.5F);
		float var12 = (int)(var5 + 0.5F);
		float var13 = (int)(var6 + 0.5F);
		float var14 = (int)(var1 + 0.5F);
		float var15 = (int)(var2 + 0.5F);
		float var16 = (int)(var3 + 0.5F);
		float var17 = var12 - var11;
		float var18 = var15 - var14;
		float var19 = var13 - var11;
		float var20 = var16 - var14;
		float var21 = var5 - var4;
		float var22 = var2 - var1;
		float var23 = var6 - var4;
		float var24 = var3 - var1;
		float var25 = var21 * var24 - var23 * var22;
		if (var25 != 0.0F) {
			float var26 = var8 - var7;
			float var27 = var9 - var7;
			float var28 = (var26 * var24 - var27 * var22) / var25;
			float var29 = (var27 * var21 - var26 * var23) / var25;
			float var30;
			if (var16 != var15) {
				var30 = (var13 - var12) / (var16 - var15);
			} else {
				var30 = 0.0F;
			}

			float var31;
			if (var15 != var14) {
				var31 = var17 / var18;
			} else {
				var31 = 0.0F;
			}

			float var32;
			if (var16 != var14) {
				var32 = var19 / var20;
			} else {
				var32 = 0.0F;
			}

			int[] var33 = this.ar_fld.bm_fld;
			int var34 = this.ar_fld.ab_fld;
			if (var14 <= var15 && var14 <= var16) {
				if (!(var14 >= var34)) {
					if (var15 > var34) {
						var15 = var34;
					}

					if (var16 > var34) {
						var16 = var34;
					}

					var7 = this.cf(var4, var1, var7, var28, var29);
					if (var15 < var16) {
						var13 = var11;
						if (var14 < 0.0F) {
							var13 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var15 < 0.0F) {
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if ((var14 == var15 || !(var32 < var31)) && (var14 != var15 || !(var32 > var30))) {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var88;
							for (var88 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var88, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var32;
								var11 += var31;
								var88 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var88, var10, 0, (int)var12, (int)var13, var7, var28);
								var13 += var32;
								var12 += var30;
								var88 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F) - var15;
							var15 -= var14;

							int var87;
							for (var87 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var32;
								var11 += var31;
								var87 += au_fld;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var87, var10, 0, (int)var13, (int)var12, var7, var28);
								var13 += var32;
								var12 += var30;
								var87 += au_fld;
								var7 += var29;
							}
						}
					} else {
						var12 = var11;
						if (var14 < 0.0F) {
							var12 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var30 * var16;
							var16 = 0.0F;
						}

						if ((var14 == var16 || !(var32 < var31)) && (var14 != var16 || !(var30 > var31))) {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var86;
							for (var86 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var12, var7, var28);
								var12 += var32;
								var11 += var31;
								var86 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var86, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var30;
								var11 += var31;
								var86 += au_fld;
								var7 += var29;
							}
						} else {
							var14 = (int)(var14 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var15 = (int)(var15 + 0.5F) - var16;
							var16 -= var14;

							int var85;
							for (var85 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.cs(al_fld, var85, var10, 0, (int)var12, (int)var11, var7, var28);
								var12 += var32;
								var11 += var31;
								var85 += au_fld;
							}

							while (--var15 >= 0.0F) {
								this.cs(al_fld, var85, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var30;
								var11 += var31;
								var85 += au_fld;
								var7 += var29;
							}
						}
					}
				}
			} else if (var15 <= var16) {
				if (!(var15 >= var34)) {
					if (var16 > var34) {
						var16 = var34;
					}

					if (var14 > var34) {
						var14 = var34;
					}

					var8 = this.cf(var5, var2, var8, var28, var29);
					if (var16 < var14) {
						var11 = var12;
						if (var15 < 0.0F) {
							var11 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var32 * var16;
							var16 = 0.0F;
						}

						if ((var15 == var16 || !(var31 < var30)) && (var15 != var16 || !(var31 > var32))) {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var84;
							for (var84 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var84, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var31;
								var12 += var30;
								var84 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var84, var10, 0, (int)var13, (int)var11, var8, var28);
								var11 += var31;
								var13 += var32;
								var84 += au_fld;
								var8 += var29;
							}
						} else {
							var15 = (int)(var15 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var14 = (int)(var14 + 0.5F) - var16;
							var16 -= var15;

							int var83;
							for (var83 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var31;
								var12 += var30;
								var83 += au_fld;
							}

							while (--var14 >= 0.0F) {
								this.cs(al_fld, var83, var10, 0, (int)var11, (int)var13, var8, var28);
								var11 += var31;
								var13 += var32;
								var83 += au_fld;
								var8 += var29;
							}
						}
					} else {
						var13 = var12;
						if (var15 < 0.0F) {
							var13 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var14 < 0.0F) {
							var11 -= var32 * var14;
							var14 = 0.0F;
						}

						var15 = (int)(var15 + 0.5F);
						var14 = (int)(var14 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var14;
						var14 -= var15;
						int var82 = var33[(int)var15];
						if (var31 < var30) {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var13, (int)var12, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						} else {
							while (--var14 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var13, var8, var28);
								var13 += var31;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.cs(al_fld, var82, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var32;
								var12 += var30;
								var82 += au_fld;
								var8 += var29;
							}
						}
					}
				}
			} else if (!(var16 >= var34)) {
				if (var14 > var34) {
					var14 = var34;
				}

				if (var15 > var34) {
					var15 = var34;
				}

				var9 = this.cf(var6, var3, var9, var28, var29);
				if (var14 < var15) {
					var12 = var13;
					if (var16 < 0.0F) {
						var12 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var14 < 0.0F) {
						var11 -= var31 * var14;
						var14 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var14 = (int)(var14 + 0.5F);
					var15 = (int)(var15 + 0.5F) - var14;
					var14 -= var16;
					int var81 = var33[(int)var16];
					if (var30 < var32) {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var12, (int)var11, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var14 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var30;
							var13 += var32;
							var81 += au_fld;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.cs(al_fld, var81, var10, 0, (int)var11, (int)var12, var9, var28);
							var12 += var30;
							var11 += var31;
							var81 += au_fld;
							var9 += var29;
						}
					}
				} else {
					var11 = var13;
					if (var16 < 0.0F) {
						var11 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var15 < 0.0F) {
						var12 -= var31 * var15;
						var15 = 0.0F;
					}

					var16 = (int)(var16 + 0.5F);
					var15 = (int)(var15 + 0.5F);
					var14 = (int)(var14 + 0.5F) - var15;
					var15 -= var16;
					int var35 = var33[(int)var16];
					if (var30 < var32) {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var11, (int)var13, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					} else {
						while (--var15 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var11, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.cs(al_fld, var35, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += au_fld;
							var9 += var29;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[F[IIIIF)V"
	)
	public static void wj(fq var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		if (var0 == null) {
			var0.getClass();
		}

		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & -1986623305) * var5 & 571288885) >> 8;
		var0.ba(var1, var2, var4, var8, var7, bw(var2[var4], var7));
	}

	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIZ)Z"
	)
	public static boolean vz(ev var0, int var1, int var2, int var3, int var4, boolean var5) {
		return var0.cj(var0.ex_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFFFFFFFIII)V"
	)
	@Override
	void ar(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		float var13 = (int)(var4 + 0.5F);
		float var14 = (int)(var5 + 0.5F);
		float var15 = (int)(var6 + 0.5F);
		float var16 = (int)(var1 + 0.5F);
		float var17 = (int)(var2 + 0.5F);
		float var18 = (int)(var3 + 0.5F);
		float var19 = var14 - var13;
		float var20 = var17 - var16;
		float var21 = var15 - var13;
		float var22 = var18 - var16;
		float var23 = var19 * var22 - var21 * var20;
		if (var23 != 0.0F) {
			float var24 = var10;
			float var25 = var11;
			float var26 = var12;
			float var27 = var25 - var24;
			float var28 = var26 - var24;
			float var29 = (var27 * var22 - var28 * var20) / var23;
			float var30 = (var28 * var19 - var27 * var21) / var23;
			float var31 = var5 - var4;
			float var32 = var2 - var1;
			float var33 = var6 - var4;
			float var34 = var3 - var1;
			float var35 = var31 * var34 - var33 * var32;
			if (var35 != 0.0F) {
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * var34 - var37 * var32) / var35;
				float var39 = (var37 * var31 - var36 * var33) / var35;
				float var40;
				if (var18 != var17) {
					var40 = (var15 - var14) / (var18 - var17);
				} else {
					var40 = 0.0F;
				}

				float var41;
				if (var17 != var16) {
					var41 = var19 / var20;
				} else {
					var41 = 0.0F;
				}

				float var42;
				if (var18 != var16) {
					var42 = var21 / var22;
				} else {
					var42 = 0.0F;
				}

				int[] var43 = this.ar_fld.bm_fld;
				int var44 = this.ar_fld.ab_fld;
				if (var16 <= var17 && var16 <= var18) {
					if (!(var16 >= var44)) {
						if (var17 > var44) {
							var17 = var44;
						}

						if (var18 > var44) {
							var18 = var44;
						}

						var24 = var24 - var29 * var13 + var29;
						var7 = this.cf(var4, var1, var7, var38, var39);
						if (var17 < var18) {
							var15 = var13;
							if (var16 < 0.0F) {
								var15 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var17 < 0.0F) {
								var14 -= var40 * var17;
								var17 = 0.0F;
							}

							if ((var16 == var17 || !(var42 < var41)) && (var16 != var17 || !(var42 > var40))) {
								var16 = (int)(var16 + 0.5F);
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F) - var17;
								var17 -= var16;

								int var101;
								for (var101 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var101, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var101 += au_fld;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var101, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var101 += au_fld;
									var7 += var39;
								}
							} else {
								var16 = (int)(var16 + 0.5F);
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F) - var17;
								var17 -= var16;

								int var100;
								for (var100 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var100, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var100 += au_fld;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var100, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var100 += au_fld;
									var7 += var39;
								}
							}
						} else {
							var14 = var13;
							if (var16 < 0.0F) {
								var14 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var40 * var18;
								var18 = 0.0F;
							}

							if ((var16 == var18 || !(var42 < var41)) && (var16 != var18 || !(var40 > var41))) {
								var16 = (int)(var16 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var17 = (int)(var17 + 0.5F) - var18;
								var18 -= var16;

								int var99;
								for (var99 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var99, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var99 += au_fld;
								}

								while (--var17 >= 0.0F) {
									xp(this, al_fld, var99, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var99 += au_fld;
									var7 += var39;
								}
							} else {
								var16 = (int)(var16 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var17 = (int)(var17 + 0.5F) - var18;
								var18 -= var16;

								int var98;
								for (var98 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									xp(this, al_fld, var98, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var98 += au_fld;
								}

								while (--var17 >= 0.0F) {
									xp(this, al_fld, var98, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var98 += au_fld;
									var7 += var39;
								}
							}
						}
					}
				} else if (var17 <= var18) {
					if (!(var17 >= var44)) {
						if (var18 > var44) {
							var18 = var44;
						}

						if (var16 > var44) {
							var16 = var44;
						}

						var25 = var25 - var29 * var14 + var29;
						var8 = this.cf(var5, var2, var8, var38, var39);
						if (var18 < var16) {
							var13 = var14;
							if (var17 < 0.0F) {
								var13 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var42 * var18;
								var18 = 0.0F;
							}

							if ((var17 == var18 || !(var41 < var40)) && (var17 != var18 || !(var41 > var42))) {
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var16 = (int)(var16 + 0.5F) - var18;
								var18 -= var17;

								int var97;
								for (var97 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									xp(this, al_fld, var97, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var97 += au_fld;
								}

								while (--var16 >= 0.0F) {
									xp(this, al_fld, var97, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var97 += au_fld;
									var8 += var39;
								}
							} else {
								var17 = (int)(var17 + 0.5F);
								var18 = (int)(var18 + 0.5F);
								var16 = (int)(var16 + 0.5F) - var18;
								var18 -= var17;

								int var96;
								for (var96 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									xp(this, al_fld, var96, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var96 += au_fld;
								}

								while (--var16 >= 0.0F) {
									xp(this, al_fld, var96, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var96 += au_fld;
									var8 += var39;
								}
							}
						} else {
							var15 = var14;
							if (var17 < 0.0F) {
								var15 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var16 < 0.0F) {
								var13 -= var42 * var16;
								var16 = 0.0F;
							}

							var17 = (int)(var17 + 0.5F);
							var16 = (int)(var16 + 0.5F);
							var18 = (int)(var18 + 0.5F) - var16;
							var16 -= var17;
							int var95 = var43[(int)var17];
							if (var41 < var40) {
								while (--var16 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}
							} else {
								while (--var16 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									xp(this, al_fld, var95, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var95 += au_fld;
									var8 += var39;
								}
							}
						}
					}
				} else if (!(var18 >= var44)) {
					if (var16 > var44) {
						var16 = var44;
					}

					if (var17 > var44) {
						var17 = var44;
					}

					var26 = var26 - var29 * var15 + var29;
					var9 = this.cf(var6, var3, var9, var38, var39);
					if (var16 < var17) {
						var14 = var15;
						if (var18 < 0.0F) {
							var14 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var41 * var16;
							var16 = 0.0F;
						}

						var18 = (int)(var18 + 0.5F);
						var16 = (int)(var16 + 0.5F);
						var17 = (int)(var17 + 0.5F) - var16;
						var16 -= var18;
						int var94 = var43[(int)var18];
						if (var40 < var42) {
							while (--var16 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}
						} else {
							while (--var16 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								xp(this, al_fld, var94, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var94 += au_fld;
								var9 += var39;
							}
						}
					} else {
						var13 = var15;
						if (var18 < 0.0F) {
							var13 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var17 < 0.0F) {
							var14 -= var41 * var17;
							var17 = 0.0F;
						}

						var18 = (int)(var18 + 0.5F);
						var17 = (int)(var17 + 0.5F);
						var16 = (int)(var16 + 0.5F) - var17;
						var17 -= var18;
						int var45 = var43[(int)var18];
						if (var40 < var42) {
							while (--var17 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}
						} else {
							while (--var17 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								xp(this, al_fld, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += au_fld;
								var9 += var39;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[FIIIIF)V"
	)
	public static void pf(fq var0, int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		int var8 = var0.as_fld[var4];
		var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
		int var9 = var1[var3];
		var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
		int var10 = var0.ar_fld.br_fld & bw(var2[var3], var7);
		var1[var3] = (var10 & var8) + (~var10 & var9);
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[F[IIIIF)V"
	)
	public static void ha(fq var0, int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		if (var0 == null) {
			var0.getClass();
		}

		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
		var0.ba(var1, var2, var4, var8, var7, bw(var2[var4], var7));
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([I[FIIFI)V"
	)
	final void ba(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
		int var7 = this.ar_fld.br_fld & var6;
		int var8 = this.ar_fld.be_fld & var6;
		var1[var3] = var7 & var4 | ~var7 & var1[var3];
		int var9 = var8 & Float.floatToRawIntBits(var5);
		int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
		var2[var3] = Float.intBitsToFloat(var9 | var10);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "([I[FIIIF)V"
	)
	final void dv(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var1[var3];
		var4 = var4 + ((var7 & -1963584867) * var5 >> 8 & 686266414) + ((var7 & -958827850) * var5 >> 8 & 0xFF00);
		int var8 = this.ar_fld.br_fld & bw(var2[var3], var6);
		var1[var3] = (var8 & var4) + (~var8 & var7);
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(FFFFF)F"
	)
	float dl(float var1, float var2, float var3, float var4, float var5) {
		var3 = var3 - var4 * var1 + var4;
		if (var2 < 0.0F) {
			var3 -= var5 * (int)var2;
		}

		return var3 - var5 * (var2 - (int)(var2 + 0.5F));
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "([I[FIIF)V"
	)
	final void dc(int[] var1, float[] var2, int var3, int var4, float var5) {
		this.ba(var1, var2, var3, this.as_fld[var4], var5, bw(var2[var3], var5));
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "([IIIIIIFF)V"
	)
	final void da(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5 - 1;
			var4 = var6 - var5 >> 2;
			var7 += var8 * var5;
			if (this.ar_fld.aa_fld != 0) {
				if (this.ar_fld.aa_fld == 254) {
					if (var5 == 0 || var6 > this.ar_fld.ao_fld - 1) {
						return;
					}

					while (--var4 >= 0) {
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
					}

					for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
					}
				} else {
					int var9 = this.ar_fld.aa_fld;
					int var10 = 256 - this.ar_fld.aa_fld;
					var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

					while (--var4 >= 0) {
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
					}

					for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
					}
				}
			} else {
				while (--var4 >= 0) {
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
				}

				for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
					this.cc(var1, an_fld, ++var2, var3, var7);
				}
			}
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([IIIIIIFF)V"
	)
	final void dk(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.ao_fld) {
				var6 = this.ar_fld.ao_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5 - 1;
			var4 = var6 - var5 >> 2;
			var7 += var8 * var5;
			if (this.ar_fld.aa_fld != 0) {
				if (this.ar_fld.aa_fld == 254) {
					if (var5 == 0 || var6 > this.ar_fld.ao_fld - 1) {
						return;
					}

					while (--var4 >= 0) {
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
						var7 += var8;
					}

					for (int var24 = var6 - var5 & 3; --var24 >= 0; var7 += var8) {
						var2++;
						this.cv(var1, an_fld, var2 - 1, var1[var2], 0, var7);
					}
				} else {
					int var9 = this.ar_fld.aa_fld;
					int var10 = 256 - this.ar_fld.aa_fld;
					var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 0xFF00) * var10 >> 8 & 0xFF00);

					while (--var4 >= 0) {
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
						var7 += var8;
					}

					for (int var25 = var6 - var5 & 3; --var25 >= 0; var7 += var8) {
						this.cv(var1, an_fld, ++var2, var3, var9, var7);
					}
				}
			} else {
				while (--var4 >= 0) {
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
					this.cc(var1, an_fld, ++var2, var3, var7);
					var7 += var8;
				}

				for (int var23 = var6 - var5 & 3; --var23 >= 0; var7 += var8) {
					this.cc(var1, an_fld, ++var2, var3, var7);
				}
			}
		}
	}

	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[FIIIF)V"
	)
	public static void vs(fq var0, int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var1[var3];
		var4 = var4 + ((var7 & 16711935) * var5 >> 8 & -622836552) + ((var7 & 0xFF00) * var5 >> 8 & 0xFF00);
		int var8 = var0.ar_fld.br_fld & bw(var2[var3], var6);
		var1[var3] = (var8 & var4) + (~var8 & var7);
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Lfq;[I[FIIF)V"
	)
	public static void pz(fq var0, int[] var1, float[] var2, int var3, int var4, float var5) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ba(var1, var2, var3, var4, var5, bw(var2[var3], var5));
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIFFIIIIII)V"
	)
	final void dx(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		float var10,
		float var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17
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
			var10 += var11 * var6;
			int var20 = var7 - var6;
			int var26 = var6 - this.ar_fld.am_fld;
			var12 += (var15 >> 3) * var26;
			var13 += (var16 >> 3) * var26;
			var14 += (var17 >> 3) * var26;
			int var25 = var14 >> 14;
			int var21;
			int var22;
			if (var25 != 0) {
				var21 = var12 / var25;
				var22 = var13 / var25;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var12 += var15;
			var13 += var16;
			var14 += var17;
			var25 = var14 >> 14;
			int var23;
			int var24;
			if (var25 != 0) {
				var23 = var12 / var25;
				var24 = var13 / var25;
				if (var23 < 0) {
					var23 = 0;
				} else if (var23 > 16256) {
					var23 = 16256;
				}
			} else {
				var23 = 0;
				var24 = 0;
			}

			var3 = (var21 << 18) + var22;
			int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
			var20 >>= 3;
			var9 <<= 3;
			int var18 = var8 >> 8;
			if (this.ay_fld) {
				if (this.ar_fld.aa_fld != 0) {
					int var27 = this.ar_fld.aa_fld;
					int var28 = 256 - this.ar_fld.aa_fld;
					int var29 = var18 * var28 >> 8;

					while (var20-- > 0) {
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var21 = var23;
						var22 = var24;
						var12 += var15;
						var13 += var16;
						var14 += var17;
						var25 = var14 >> 14;
						if (var25 != 0) {
							var23 = var12 / var25;
							var24 = var13 / var25;
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 > 370119408) {
								var23 = 556494785;
							}
						} else {
							var23 = 0;
							var24 = 0;
						}

						var3 = (var21 << 18) + var22;
						var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
						var8 += var9;
						var18 = var8 >> 8;
					}

					for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
						this.cd(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
					}
				} else {
					while (var20-- > 0) {
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var21 = var23;
						var22 = var24;
						var12 += var15;
						var13 += var16;
						var14 += var17;
						var25 = var14 >> 14;
						if (var25 != 0) {
							var23 = var12 / var25;
							var24 = var13 / var25;
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 > 145061795) {
								var23 = 16256;
							}
						} else {
							var23 = 0;
							var24 = 0;
						}

						var3 = (var21 << 18) + var22;
						var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
						var8 += var9;
						var18 = var8 >> 8;
					}

					for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
					}
				}
			} else if (this.ar_fld.aa_fld != 0) {
				int var149 = this.ar_fld.aa_fld;
				int var150 = 1274352213 - this.ar_fld.aa_fld;
				int var151 = var18 * var150 >> 8;

				while (var20-- > 0) {
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var21 = var23;
					var22 = var24;
					var12 += var15;
					var13 += var16;
					var14 += var17;
					var25 = var14 >> 14;
					if (var25 != 0) {
						var23 = var12 / var25;
						var24 = var13 / var25;
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 16256) {
							var23 = 16256;
						}
					} else {
						var23 = 0;
						var24 = 0;
					}

					var3 = (var21 << 18) + var22;
					var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
				}
			} else {
				while (var20-- > 0) {
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var21 = var23;
					var22 = var24;
					var12 += var15;
					var13 += var16;
					var14 += var17;
					var25 = var14 >> 14;
					if (var25 != 0) {
						var23 = var12 / var25;
						var24 = var13 / var25;
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 16256) {
							var23 = -874723503;
						}
					} else {
						var23 = 0;
						var24 = 0;
					}

					var3 = (var21 << 18) + var22;
					var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
				}
			}
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIFFIIIIII)V"
	)
	final void ds(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		float var10,
		float var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17
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
			var10 += var11 * var6;
			int var20 = var7 - var6;
			int var26 = var6 - this.ar_fld.am_fld;
			var12 += var15 * var26;
			var13 += var16 * var26;
			var14 += var17 * var26;
			int var25 = var14 >> 14;
			int var21;
			int var22;
			if (var25 != 0) {
				var21 = var12 / var25;
				var22 = var13 / var25;
			} else {
				var21 = 0;
				var22 = 0;
			}

			var12 += var15 * var20;
			var13 += var16 * var20;
			var14 += var17 * var20;
			var25 = var14 >> 14;
			int var23;
			int var24;
			if (var25 != 0) {
				var23 = var12 / var25;
				var24 = var13 / var25;
			} else {
				var23 = 0;
				var24 = 0;
			}

			var3 = (var21 << 18) + var22;
			int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
			var20 >>= 3;
			var9 <<= 3;
			int var18 = var8 >> 8;
			if (this.ay_fld) {
				while (var20-- > 0) {
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
					ha(this, var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
				}
			} else {
				while (var20-- > 0) {
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
				}
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([I[F[IIIIF)V"
	)
	final void bb(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		var8 = ((var8 & 16711935) * var5 & -16711936) + ((var8 & 0xFF00) * var5 & 0xFF0000) >> 8;
		this.ba(var1, var2, var4, var8, var7, cn(var2[var4], var7));
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "([IIIIIIFFFF)V"
	)
	final void cx(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
		if (this.ar_fld.ax_fld) {
			if (var6 > this.ar_fld.at_fld) {
				var6 = this.ar_fld.al_fld;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5 - 1;
			var7 += var8 * var5;
			var9 += var10 * var5;
			if (this.ar_fld.an_fld) {
				var4 = var6 - var5 >> 2;
				var8 *= 4.0F;
				if (this.ar_fld.at_fld == 0) {
					if (var4 > 0) {
						do {
							int var40 = (int)var7 & 65535;
							var3 = this.as_fld[var40];
							var7 += var8;
							this.cq(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
							this.cc(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
							this.cq(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
							this.cq(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var41 = (int)var7 & 65535;
						var3 = this.as_fld[var41];

						do {
							this.cc(var1, an_fld, ++var2, var3, var9);
							var9 += var10;
						} while (--var4 > 0);
					}
				} else {
					int var42 = this.ar_fld.al_fld;
					int var43 = 256 - this.ar_fld.ac_fld;
					if (var4 > 0) {
						do {
							int var13 = (int)var7 & 65535;
							var3 = this.as_fld[var13];
							var7 += var8;
							var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);
							this.dt(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
							this.cv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
							this.cv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
							this.cv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
						} while (--var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						int var44 = (int)var7 & 65535;
						var3 = this.as_fld[var44];
						var3 = ((var3 & 16711935) * var43 >> 8 & 16711935) + ((var3 & 0xFF00) * var43 >> 8 & 0xFF00);

						do {
							this.dv(var1, an_fld, ++var2, var3, var42, var9);
							var9 += var10;
						} while (--var4 > 0);
					}
				}
			} else {
				var4 = var6 - var5;
				if (this.ar_fld.ab_fld == 0) {
					do {
						this.ch(var1, an_fld, ++var2, (int)var7 & 65535, var9);
						var9 += var10;
						var7 += var8;
					} while (--var4 > 0);
				} else {
					int var11 = this.ar_fld.ad_fld;
					int var12 = 256 - this.ar_fld.al_fld;

					do {
						sz(this, var1, an_fld, ++var2, (int)var7 & 65535, var11, var12, var9);
						var9 += var10;
						var7 += var8;
					} while (--var4 > 0);
				}
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIFFIIIIII)V"
	)
	final void cp(
		int[] var1,
		int[] var2,
		int var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		float var10,
		float var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16,
		int var17
	) {
		if (this.ar_fld.ax_fld) {
			if (var7 > this.ar_fld.ao_fld) {
				var7 = this.ar_fld.aj_fld;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			var10 += var11 * var6;
			int var20 = var7 - var6;
			int var26 = var6 - this.ar_fld.ac_fld;
			var12 += (var15 >> 3) * var26;
			var13 += (var16 >> 3) * var26;
			var14 += (var17 >> 3) * var26;
			int var25 = var14 >> 14;
			int var21;
			int var22;
			if (var25 != 0) {
				var21 = var12 / var25;
				var22 = var13 / var25;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var12 += var15;
			var13 += var16;
			var14 += var17;
			var25 = var14 >> 14;
			int var23;
			int var24;
			if (var25 != 0) {
				var23 = var12 / var25;
				var24 = var13 / var25;
				if (var23 < 0) {
					var23 = 0;
				} else if (var23 > 16256) {
					var23 = 16256;
				}
			} else {
				var23 = 0;
				var24 = 0;
			}

			var3 = (var21 << 18) + var22;
			int var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
			var20 >>= 3;
			var9 <<= 3;
			int var18 = var8 >> 8;
			if (this.ay_fld) {
				if (this.ar_fld.ao_fld != 0) {
					int var27 = this.ar_fld.am_fld;
					int var28 = 256 - this.ar_fld.at_fld;
					int var29 = var18 * var28 >> 8;

					while (var20-- > 0) {
						this.cj(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.ck(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.bg(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.ck(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cz(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cj(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cj(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						this.cu(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var21 = var23;
						var22 = var24;
						var12 += var15;
						var13 += var16;
						var14 += var17;
						var25 = var14 >> 14;
						if (var25 != 0) {
							var23 = var12 / var25;
							var24 = var13 / var25;
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 > 370119408) {
								var23 = 556494785;
							}
						} else {
							var23 = 0;
							var24 = 0;
						}

						var3 = (var21 << 18) + var22;
						var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
						var8 += var9;
						var18 = var8 >> 8;
					}

					for (int var133 = var7 - var6 & 7; var133-- > 0; var10 += var11) {
						this.bg(var1, an_fld, var2, var5, var27, var29, var3, var10);
						var5++;
						var3 += var19;
					}
				} else {
					while (var20-- > 0) {
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
						var10 += var11;
						var21 = var23;
						var22 = var24;
						var12 += var15;
						var13 += var16;
						var14 += var17;
						var25 = var14 >> 14;
						if (var25 != 0) {
							var23 = var12 / var25;
							var24 = var13 / var25;
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 > 145061795) {
								var23 = 16256;
							}
						} else {
							var23 = 0;
							var24 = 0;
						}

						var3 = (var21 << 18) + var22;
						var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
						var8 += var9;
						var18 = var8 >> 8;
					}

					for (int var132 = var7 - var6 & 7; var132-- > 0; var10 += var11) {
						ha(this, var1, an_fld, var2, var5, var18, var3, var10);
						var5++;
						var3 += var19;
					}
				}
			} else if (this.ar_fld.aa_fld != 0) {
				int var149 = this.ar_fld.ao_fld;
				int var150 = 1274352213 - this.ar_fld.ao_fld;
				int var151 = var18 * var150 >> 8;

				while (var20-- > 0) {
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cj(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.bg(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cd(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.bg(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cj(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.bg(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.ck(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var21 = var23;
					var22 = var24;
					var12 += var15;
					var13 += var16;
					var14 += var17;
					var25 = var14 >> 14;
					if (var25 != 0) {
						var23 = var12 / var25;
						var24 = var13 / var25;
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 16256) {
							var23 = 16256;
						}
					} else {
						var23 = 0;
						var24 = 0;
					}

					var3 = (var21 << 18) + var22;
					var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var135 = var7 - var6 & 7; var135-- > 0; var10 += var11) {
					this.cd(var1, an_fld, var2, var5, var149, var151, var3, var10);
					var5++;
					var3 += var19;
				}
			} else {
				while (var20-- > 0) {
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.bb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.bb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.bb(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.cm(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.co(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					this.co(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
					var10 += var11;
					var21 = var23;
					var22 = var24;
					var12 += var15;
					var13 += var16;
					var14 += var17;
					var25 = var14 >> 14;
					if (var25 != 0) {
						var23 = var12 / var25;
						var24 = var13 / var25;
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 16256) {
							var23 = -874723503;
						}
					} else {
						var23 = 0;
						var24 = 0;
					}

					var3 = (var21 << 18) + var22;
					var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (int var134 = var7 - var6 & 7; var134-- > 0; var10 += var11) {
					this.co(var1, an_fld, var2, var5, var18, var3, var10);
					var5++;
					var3 += var19;
				}
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([I[FIIIIF)V"
	)
	final void cy(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		int var8 = this.as_fld[var4];
		var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
		int var9 = var1[var3];
		var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + ((var9 & 0xFF00) * var5 >> 8 & 0xFF00);
		int var10 = this.ar_fld.al_fld & ca(var2[var3], var7);
		var1[var3] = (var10 & var8) + (~var10 & var9);
	}
}
