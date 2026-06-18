import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("at")
public class at {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([FIZLbh;[Lbd;)V"
	)
	void ag(float[] var1, int var2, boolean var3, bh var4, bd[] var5) {
		for (int var6 = 0; var6 < var2; var6++) {
			var1[var6] = 0.0F;
		}

		if (!var3) {
			int var21 = var5[this.ah_fld].ak_fld;
			int var7 = this.az_fld - this.ag_fld;
			int var8 = var7 / this.av_fld;
			int[] var9 = new int[var8];

			for (int var10 = 0; var10 < 8; var10++) {
				int var11 = 0;

				while (var11 < var8) {
					if (var10 == 0) {
						int var12 = pg.hm(var5[this.ah_fld], var4);

						for (int var13 = var21 - 1; var13 >= 0; var13--) {
							if (var11 + var13 < var8) {
								var9[var11 + var13] = var12 % this.ae_fld;
							}

							var12 /= this.ae_fld;
						}
					}

					for (int var22 = 0; var22 < var21; var22++) {
						int var23 = var9[var11];
						int var14 = this.aw_fld[var23 * 8 + var10];
						if (var14 >= 0) {
							int var15 = this.ag_fld + var11 * this.av_fld;
							bd var16 = var5[var14];
							if (this.ak_fld == 0) {
								int var24 = this.av_fld / var16.ak_fld;

								for (int var25 = 0; var25 < var24; var25++) {
									float[] var26 = var16.av(var4);

									for (int var20 = 0; var20 < var16.ak_fld; var20++) {
										var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
									}
								}
							} else {
								int var17 = 0;

								while (var17 < this.av_fld) {
									float[] var18 = var16.av(var4);

									for (int var19 = 0; var19 < var16.ak_fld; var19++) {
										var1[var15 + var17] = var1[var15 + var17] + var18[var19];
										var17++;
									}
								}
							}
						}

						if (++var11 >= var8) {
							break;
						}
					}
				}
			}
		}
	}

	at(bh var1) {
		this.ak_fld = var1.ak(16, 1088262844);
		this.ag_fld = var1.ak(24, -1291668627);
		this.az_fld = var1.ak(24, 179027089);
		this.av_fld = var1.ak(24, -459635914) + 1;
		this.ae_fld = var1.ak(6, -1828055687) + 1;
		this.ah_fld = var1.ak(8, 697669982);
		int[] var2 = new int[this.ae_fld];

		for (int var3 = 0; var3 < this.ae_fld; var3++) {
			int var4 = 0;
			int var5 = var1.ak(3, -1381858557);
			boolean var6 = var1.ag() != 0;
			if (var6) {
				var4 = var1.ak(5, -1203332422);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.aw_fld = new int[this.ae_fld * 8];

		for (int var7 = 0; var7 < this.ae_fld * 8; var7++) {
			this.aw_fld[var7] = (var2[var7 >> 3] & 1 << (var7 & 7)) != 0 ? var1.ak(8, 1102130890) : -1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([FIZLbh;[Lbd;)V"
	)
	void ak(float[] var1, int var2, boolean var3, bh var4, bd[] var5) {
		for (int var6 = 0; var6 < var2; var6++) {
			var1[var6] = 0.0F;
		}

		if (!var3) {
			int var21 = var5[this.ah_fld].ak_fld;
			int var7 = this.az_fld - this.ag_fld;
			int var8 = var7 / this.av_fld;
			int[] var9 = new int[var8];

			for (int var10 = 0; var10 < 8; var10++) {
				int var11 = 0;

				while (var11 < var8) {
					if (var10 == 0) {
						int var12 = pg.hm(var5[this.ah_fld], var4);

						for (int var13 = var21 - 1; var13 >= 0; var13--) {
							if (var11 + var13 < var8) {
								var9[var11 + var13] = var12 % this.ae_fld;
							}

							var12 /= this.ae_fld;
						}
					}

					for (int var22 = 0; var22 < var21; var22++) {
						int var23 = var9[var11];
						int var14 = this.aw_fld[var23 * 8 + var10];
						if (var14 >= 0) {
							int var15 = this.ag_fld + var11 * this.av_fld;
							bd var16 = var5[var14];
							if (this.ak_fld == 0) {
								int var24 = this.av_fld / var16.ak_fld;

								for (int var25 = 0; var25 < var24; var25++) {
									float[] var26 = var16.av(var4);

									for (int var20 = 0; var20 < var16.ak_fld; var20++) {
										var1[var15 + var25 + var20 * var24] = var1[var15 + var25 + var20 * var24] + var26[var20];
									}
								}
							} else {
								int var17 = 0;

								while (var17 < this.av_fld) {
									float[] var18 = var16.av(var4);

									for (int var19 = 0; var19 < var16.ak_fld; var19++) {
										var1[var15 + var17] = var1[var15 + var17] + var18[var19];
										var17++;
									}
								}
							}
						}

						if (++var11 >= var8) {
							break;
						}
					}
				}
			}
		}
	}
}
