import java.util.Random;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bk")
public class bk {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ab_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ah_fld = new int[5];
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] az_fld = new int[32768];
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ae_fld = new int[5];
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax ai_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ad_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	static double ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] as_fld = new int[5];
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld = 500;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld = 0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax al_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax aa_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ay_fld = new int[5];
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax an_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int at_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aw_fld = new int[5];
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax aq_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax am_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ag_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ao_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax au_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ap_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax ax_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	be ac_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	ax aj_fld;

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lbk;Lxi;)V"
	)
	public static void fu(bk var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = new ax();
		var0.al_fld.ak(var1);
		var0.au_fld = new ax();
		var0.au_fld.ak(var1);
		int var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			var0.ax_fld = new ax();
			var0.ax_fld.ak(var1);
			var0.an_fld = new ax();
			var0.an_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			var0.aa_fld = new ax();
			var0.aa_fld.ak(var1);
			var0.ai_fld = new ax();
			var0.ai_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			var0.aq_fld = new ax();
			var0.aq_fld.ak(var1);
			var0.am_fld = new ax();
			var0.am_fld.ak(var1);
		}

		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = var1.dz();
			if (var4 == 0) {
				break;
			}

			var0.ad_fld[var3] = var4;
			var0.ao_fld[var3] = var1.dv();
			var0.ab_fld[var3] = var1.dz();
		}

		var0.ap_fld = var1.dz();
		var0.at_fld = var1.dz();
		var0.ar_fld = var1.cm();
		var0.af_fld = var1.cm();
		var0.ac_fld = new be();
		var0.aj_fld = new ax();
		var0.ac_fld.ae(var1, var0.aj_fld);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void al(xi var1) {
		this.al_fld = new ax();
		this.al_fld.ak(var1);
		this.au_fld = new ax();
		this.au_fld.ak(var1);
		int var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			this.ax_fld = new ax();
			this.ax_fld.ak(var1);
			this.an_fld = new ax();
			this.an_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			this.aa_fld = new ax();
			this.aa_fld.ak(var1);
			this.ai_fld = new ax();
			this.ai_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			this.aq_fld = new ax();
			this.aq_fld.ak(var1);
			this.am_fld = new ax();
			this.am_fld.ak(var1);
		}

		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = var1.dz();
			if (var4 == 0) {
				break;
			}

			this.ad_fld[var3] = var4;
			this.ao_fld[var3] = var1.dv();
			this.ab_fld[var3] = var1.dz();
		}

		this.ap_fld = var1.dz();
		this.at_fld = var1.dz();
		this.ar_fld = var1.cm();
		this.af_fld = var1.cm();
		this.ac_fld = new be();
		this.aj_fld = new ax();
		this.ac_fld.ae(var1, this.aj_fld);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	final int ag(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return av_fld[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? az_fld[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	final int[] ak(int var1, int var2, int var3) {
		ya.ar(ag_fld, 0, var1);
		if (var2 < 10) {
			return ag_fld;
		} else {
			double var4 = var1 / (var2 + 0.0);
			this.al_fld.az();
			this.au_fld.az();
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (this.ax_fld != null) {
				this.ax_fld.az();
				this.an_fld.az();
				var6 = (int)((this.ax_fld.ag_fld - this.ax_fld.ak_fld) * 32.768 / var4);
				var7 = (int)(this.ax_fld.ak_fld * 32.768 / var4);
			}

			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (this.aa_fld != null) {
				this.aa_fld.az();
				this.ai_fld.az();
				var9 = (int)((this.aa_fld.ag_fld - this.aa_fld.ak_fld) * 32.768 / var4);
				var10 = (int)(this.aa_fld.ak_fld * 32.768 / var4);
			}

			for (int var12 = 0; var12 < 5; var12++) {
				if (this.ad_fld[var12] != 0) {
					ae_fld[var12] = 0;
					ah_fld[var12] = (int)(this.ab_fld[var12] * var4);
					aw_fld[var12] = (this.ad_fld[var12] << 14) / 100;
					ay_fld[var12] = (int)((this.al_fld.ag_fld - this.al_fld.ak_fld) * 32.768 * Math.pow(1.0057929410678534, this.ao_fld[var12]) / var4);
					as_fld[var12] = (int)(this.al_fld.ak_fld * 32.768 / var4);
				}
			}

			for (int var20 = 0; var20 < var1; var20++) {
				int var13 = this.al_fld.av(var1);
				int var14 = this.au_fld.av(var1);
				if (this.ax_fld != null) {
					int var15 = this.ax_fld.av(var1);
					int var16 = this.an_fld.av(var1);
					var13 += this.ag(var8, var16, this.ax_fld.az_fld) >> 1;
					var8 += (var15 * var6 >> 16) + var7;
				}

				if (this.aa_fld != null) {
					int var32 = this.aa_fld.av(var1);
					int var36 = this.ai_fld.av(var1);
					var14 = var14 * ((this.ag(var11, var36, this.aa_fld.az_fld) >> 1) + 32768) >> 15;
					var11 += (var32 * var9 >> 16) + var10;
				}

				for (int var33 = 0; var33 < 5; var33++) {
					if (this.ad_fld[var33] != 0) {
						int var37 = var20 + ah_fld[var33];
						if (var37 < var1) {
							ag_fld[var37] = ag_fld[var37] + this.ag(ae_fld[var33], var14 * aw_fld[var33] >> 15, this.al_fld.az_fld);
							ae_fld[var33] = ae_fld[var33] + (var13 * ay_fld[var33] >> 16) + as_fld[var33];
						}
					}
				}
			}

			if (this.aq_fld != null) {
				this.aq_fld.az();
				this.am_fld.az();
				short var21 = 0;
				boolean var26 = false;
				boolean var30 = true;

				for (int var34 = 0; var34 < var1; var34++) {
					int var38 = this.aq_fld.av(var1);
					int var17 = this.am_fld.av(var1);
					int var27;
					if (var30) {
						var27 = this.aq_fld.ak_fld + ((this.aq_fld.ag_fld - this.aq_fld.ak_fld) * var38 >> 8);
					} else {
						var27 = this.aq_fld.ak_fld + ((this.aq_fld.ag_fld - this.aq_fld.ak_fld) * var17 >> 8);
					}

					var21 += 256;
					if (var21 >= var27) {
						var21 = 0;
						var30 = !var30;
					}

					if (var30) {
						ag_fld[var34] = 0;
					}
				}
			}

			if (this.ap_fld > 0 && this.at_fld > 0) {
				int var22 = (int)(this.ap_fld * var4);

				for (int var28 = var22; var28 < var1; var28++) {
					ag_fld[var28] = ag_fld[var28] + ag_fld[var28 - var22] * this.at_fld / 100;
				}
			}

			if (this.ac_fld.as_fld[0] > 0 || this.ac_fld.as_fld[1] > 0) {
				this.aj_fld.az();
				int var23 = this.aj_fld.av(var1 + 1);
				int var29 = this.ac_fld.ax(0, var23 / 65536.0F, var3);
				int var31 = this.ac_fld.ax(1, var23 / 65536.0F, var3);
				if (var1 >= var29 + var31) {
					int var35 = 0;
					int var39 = var31;
					if (var31 > var1 - var29) {
						var39 = var1 - var29;
					}

					while (var35 < var39) {
						int var41 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

						for (int var18 = 0; var18 < var29; var18++) {
							var41 += (int)((long)ag_fld[var35 + var29 - 1 - var18] * be.ah_fld[0][var18] >> 16);
						}

						for (int var43 = 0; var43 < var35; var43++) {
							var41 -= (int)((long)ag_fld[var35 - 1 - var43] * be.ah_fld[1][var43] >> 16);
						}

						ag_fld[var35] = var41;
						var23 = this.aj_fld.av(var1 + 1);
						var35++;
					}

					short var42 = 128;
					var39 = 128;

					while (true) {
						if (var39 > var1 - var29) {
							var39 = var1 - var29;
						}

						while (var35 < var39) {
							int var44 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

							for (int var19 = 0; var19 < var29; var19++) {
								var44 += (int)((long)ag_fld[var35 + var29 - 1 - var19] * be.ah_fld[0][var19] >> 16);
							}

							for (int var46 = 0; var46 < var31; var46++) {
								var44 -= (int)((long)ag_fld[var35 - 1 - var46] * be.ah_fld[1][var46] >> 16);
							}

							ag_fld[var35] = var44;
							var23 = this.aj_fld.av(var1 + 1);
							var35++;
						}

						if (var35 >= var1 - var29) {
							while (var35 < var1) {
								int var45 = 0;

								for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
									var45 += (int)((long)ag_fld[var35 + var29 - 1 - var47] * be.ah_fld[0][var47] >> 16);
								}

								for (int var48 = 0; var48 < var31; var48++) {
									var45 -= (int)((long)ag_fld[var35 - 1 - var48] * be.ah_fld[1][var48] >> 16);
								}

								ag_fld[var35] = var45;
								var23 = this.aj_fld.av(var1 + 1);
								var35++;
							}
							break;
						}

						var29 = this.ac_fld.ax(0, var23 / 65536.0F, var3);
						var31 = this.ac_fld.ax(1, var23 / 65536.0F, var3);
						var39 += 128;
					}
				}
			}

			for (int var25 = 0; var25 < var1; var25++) {
				if (ag_fld[var25] < -32768) {
					ag_fld[var25] = -32768;
				}

				if (ag_fld[var25] > 32767) {
					ag_fld[var25] = 32767;
				}
			}

			return ag_fld;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void au(xi var1) {
		this.al_fld = new ax();
		this.al_fld.ak(var1);
		this.au_fld = new ax();
		this.au_fld.ak(var1);
		int var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			this.ax_fld = new ax();
			this.ax_fld.ak(var1);
			this.an_fld = new ax();
			this.an_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			this.aa_fld = new ax();
			this.aa_fld.ak(var1);
			this.ai_fld = new ax();
			this.ai_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			this.aq_fld = new ax();
			this.aq_fld.ak(var1);
			this.am_fld = new ax();
			this.am_fld.ak(var1);
		}

		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = var1.dz();
			if (var4 == 0) {
				break;
			}

			this.ad_fld[var3] = var4;
			this.ao_fld[var3] = var1.dv();
			this.ab_fld[var3] = var1.dz();
		}

		this.ap_fld = var1.dz();
		this.at_fld = var1.dz();
		this.ar_fld = var1.cm();
		this.af_fld = var1.cm();
		this.ac_fld = new be();
		this.aj_fld = new ax();
		this.ac_fld.ae(var1, this.aj_fld);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lbk;III)I"
	)
	public static int bl(bk var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return av_fld[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? az_fld[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lbk;III)[I"
	)
	public static int[] ls(bk var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		ya.ar(ag_fld, 0, var1);
		if (var2 < 10) {
			return ag_fld;
		} else {
			double var4 = var1 / (var2 + 0.0);
			var0.al_fld.az();
			var0.au_fld.az();
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (var0.ax_fld != null) {
				var0.ax_fld.az();
				var0.an_fld.az();
				var6 = (int)((var0.ax_fld.ag_fld - var0.ax_fld.ak_fld) * 32.768 / var4);
				var7 = (int)(var0.ax_fld.ak_fld * 32.768 / var4);
			}

			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (var0.aa_fld != null) {
				var0.aa_fld.az();
				var0.ai_fld.az();
				var9 = (int)((var0.aa_fld.ag_fld - var0.aa_fld.ak_fld) * 32.768 / var4);
				var10 = (int)(var0.aa_fld.ak_fld * 32.768 / var4);
			}

			for (int var12 = 0; var12 < 5; var12++) {
				if (var0.ad_fld[var12] != 0) {
					ae_fld[var12] = 0;
					ah_fld[var12] = (int)(var0.ab_fld[var12] * var4);
					aw_fld[var12] = (var0.ad_fld[var12] << 14) / -1876847036;
					ay_fld[var12] = (int)((var0.al_fld.ag_fld - var0.al_fld.ak_fld) * 32.768 * Math.pow(1.0057929410678534, var0.ao_fld[var12]) / var4);
					as_fld[var12] = (int)(var0.al_fld.ak_fld * 32.768 / var4);
				}
			}

			for (int var20 = 0; var20 < var1; var20++) {
				int var13 = var0.al_fld.av(var1);
				int var14 = var0.au_fld.av(var1);
				if (var0.ax_fld != null) {
					int var15 = var0.ax_fld.av(var1);
					int var16 = var0.an_fld.av(var1);
					var13 += var0.ag(var8, var16, var0.ax_fld.az_fld) >> 1;
					var8 += (var15 * var6 >> 16) + var7;
				}

				if (var0.aa_fld != null) {
					int var32 = var0.aa_fld.av(var1);
					int var36 = var0.ai_fld.av(var1);
					var14 = var14 * ((var0.ag(var11, var36, var0.aa_fld.az_fld) >> 1) + 32768) >> 15;
					var11 += (var32 * var9 >> 16) + var10;
				}

				for (int var33 = 0; var33 < 5; var33++) {
					if (var0.ad_fld[var33] != 0) {
						int var37 = var20 + ah_fld[var33];
						if (var37 < var1) {
							ag_fld[var37] = ag_fld[var37] + var0.ag(ae_fld[var33], var14 * aw_fld[var33] >> 15, var0.al_fld.az_fld);
							ae_fld[var33] = ae_fld[var33] + (var13 * ay_fld[var33] >> 16) + as_fld[var33];
						}
					}
				}
			}

			if (var0.aq_fld != null) {
				var0.aq_fld.az();
				var0.am_fld.az();
				short var21 = 0;
				boolean var26 = false;
				boolean var30 = true;

				for (int var34 = 0; var34 < var1; var34++) {
					int var38 = var0.aq_fld.av(var1);
					int var17 = var0.am_fld.av(var1);
					int var27;
					if (var30) {
						var27 = var0.aq_fld.ak_fld + ((var0.aq_fld.ag_fld - var0.aq_fld.ak_fld) * var38 >> 8);
					} else {
						var27 = var0.aq_fld.ak_fld + ((var0.aq_fld.ag_fld - var0.aq_fld.ak_fld) * var17 >> 8);
					}

					var21 += 256;
					if (var21 >= var27) {
						var21 = 0;
						var30 = !var30;
					}

					if (var30) {
						ag_fld[var34] = 0;
					}
				}
			}

			if (var0.ap_fld > 0 && var0.at_fld > 0) {
				int var22 = (int)(var0.ap_fld * var4);

				for (int var28 = var22; var28 < var1; var28++) {
					ag_fld[var28] = ag_fld[var28] + ag_fld[var28 - var22] * var0.at_fld / 450230553;
				}
			}

			if (var0.ac_fld.as_fld[0] > 0 || var0.ac_fld.as_fld[1] > 0) {
				var0.aj_fld.az();
				int var23 = var0.aj_fld.av(var1 + 1);
				int var29 = var0.ac_fld.ax(0, var23 / 65536.0F, var3);
				int var31 = var0.ac_fld.ax(1, var23 / 65536.0F, var3);
				if (var1 >= var29 + var31) {
					int var35 = 0;
					int var39 = var31;
					if (var31 > var1 - var29) {
						var39 = var1 - var29;
					}

					while (var35 < var39) {
						int var41 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

						for (int var18 = 0; var18 < var29; var18++) {
							var41 += (int)((long)ag_fld[var35 + var29 - 1 - var18] * be.ah_fld[0][var18] >> 16);
						}

						for (int var43 = 0; var43 < var35; var43++) {
							var41 -= (int)((long)ag_fld[var35 - 1 - var43] * be.ah_fld[1][var43] >> 16);
						}

						ag_fld[var35] = var41;
						var23 = var0.aj_fld.av(var1 + 1);
						var35++;
					}

					int var42 = -2114075153;
					var39 = 884171527;

					while (true) {
						if (var39 > var1 - var29) {
							var39 = var1 - var29;
						}

						while (var35 < var39) {
							int var44 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

							for (int var19 = 0; var19 < var29; var19++) {
								var44 += (int)((long)ag_fld[var35 + var29 - 1 - var19] * be.ah_fld[0][var19] >> 16);
							}

							for (int var46 = 0; var46 < var31; var46++) {
								var44 -= (int)((long)ag_fld[var35 - 1 - var46] * be.ah_fld[1][var46] >> 16);
							}

							ag_fld[var35] = var44;
							var23 = var0.aj_fld.av(var1 + 1);
							var35++;
						}

						if (var35 >= var1 - var29) {
							while (var35 < var1) {
								int var45 = 0;

								for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
									var45 += (int)((long)ag_fld[var35 + var29 - 1 - var47] * be.ah_fld[0][var47] >> 16);
								}

								for (int var48 = 0; var48 < var31; var48++) {
									var45 -= (int)((long)ag_fld[var35 - 1 - var48] * be.ah_fld[1][var48] >> 16);
								}

								ag_fld[var35] = var45;
								var23 = var0.aj_fld.av(var1 + 1);
								var35++;
							}
							break;
						}

						var29 = var0.ac_fld.ax(0, var23 / 65536.0F, var3);
						var31 = var0.ac_fld.ax(1, var23 / 65536.0F, var3);
						var39 += 128;
					}
				}
			}

			for (int var25 = 0; var25 < var1; var25++) {
				if (ag_fld[var25] < -32768) {
					ag_fld[var25] = 1221368003;
				}

				if (ag_fld[var25] > 32767) {
					ag_fld[var25] = 1530111251;
				}
			}

			return ag_fld;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	final int[] ah(int var1, int var2, int var3) {
		ya.ar(ag_fld, 0, var1);
		if (var2 < 10) {
			return ag_fld;
		} else {
			double var4 = var1 / (var2 + 0.0);
			this.al_fld.az();
			this.au_fld.az();
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (this.ax_fld != null) {
				this.ax_fld.az();
				this.an_fld.az();
				var6 = (int)((this.ax_fld.ag_fld - this.ax_fld.ak_fld) * 32.768 / var4);
				var7 = (int)(this.ax_fld.ak_fld * 32.768 / var4);
			}

			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (this.aa_fld != null) {
				this.aa_fld.az();
				this.ai_fld.az();
				var9 = (int)((this.aa_fld.ag_fld - this.aa_fld.ak_fld) * 32.768 / var4);
				var10 = (int)(this.aa_fld.ak_fld * 32.768 / var4);
			}

			for (int var12 = 0; var12 < 5; var12++) {
				if (this.ad_fld[var12] != 0) {
					ae_fld[var12] = 0;
					ah_fld[var12] = (int)(this.ab_fld[var12] * var4);
					aw_fld[var12] = (this.ad_fld[var12] << 14) / 100;
					ay_fld[var12] = (int)((this.al_fld.ag_fld - this.al_fld.ak_fld) * 32.768 * Math.pow(1.0057929410678534, this.ao_fld[var12]) / var4);
					as_fld[var12] = (int)(this.al_fld.ak_fld * 32.768 / var4);
				}
			}

			for (int var20 = 0; var20 < var1; var20++) {
				int var13 = this.al_fld.av(var1);
				int var14 = this.au_fld.av(var1);
				if (this.ax_fld != null) {
					int var15 = this.ax_fld.av(var1);
					int var16 = this.an_fld.av(var1);
					var13 += this.ag(var8, var16, this.ax_fld.az_fld) >> 1;
					var8 += (var15 * var6 >> 16) + var7;
				}

				if (this.aa_fld != null) {
					int var32 = this.aa_fld.av(var1);
					int var36 = this.ai_fld.av(var1);
					var14 = var14 * ((this.ag(var11, var36, this.aa_fld.az_fld) >> 1) + 32768) >> 15;
					var11 += (var32 * var9 >> 16) + var10;
				}

				for (int var33 = 0; var33 < 5; var33++) {
					if (this.ad_fld[var33] != 0) {
						int var37 = var20 + ah_fld[var33];
						if (var37 < var1) {
							ag_fld[var37] = ag_fld[var37] + this.ag(ae_fld[var33], var14 * aw_fld[var33] >> 15, this.al_fld.az_fld);
							ae_fld[var33] = ae_fld[var33] + (var13 * ay_fld[var33] >> 16) + as_fld[var33];
						}
					}
				}
			}

			if (this.aq_fld != null) {
				this.aq_fld.az();
				this.am_fld.az();
				short var21 = 0;
				boolean var26 = false;
				boolean var30 = true;

				for (int var34 = 0; var34 < var1; var34++) {
					int var38 = this.aq_fld.av(var1);
					int var17 = this.am_fld.av(var1);
					int var27;
					if (var30) {
						var27 = this.aq_fld.ak_fld + ((this.aq_fld.ag_fld - this.aq_fld.ak_fld) * var38 >> 8);
					} else {
						var27 = this.aq_fld.ak_fld + ((this.aq_fld.ag_fld - this.aq_fld.ak_fld) * var17 >> 8);
					}

					var21 += 256;
					if (var21 >= var27) {
						var21 = 0;
						var30 = !var30;
					}

					if (var30) {
						ag_fld[var34] = 0;
					}
				}
			}

			if (this.ap_fld > 0 && this.at_fld > 0) {
				int var22 = (int)(this.ap_fld * var4);

				for (int var28 = var22; var28 < var1; var28++) {
					ag_fld[var28] = ag_fld[var28] + ag_fld[var28 - var22] * this.at_fld / 100;
				}
			}

			if (this.ac_fld.as_fld[0] > 0 || this.ac_fld.as_fld[1] > 0) {
				this.aj_fld.az();
				int var23 = this.aj_fld.av(var1 + 1);
				int var29 = this.ac_fld.ax(0, var23 / 65536.0F, var3);
				int var31 = this.ac_fld.ax(1, var23 / 65536.0F, var3);
				if (var1 >= var29 + var31) {
					int var35 = 0;
					int var39 = var31;
					if (var31 > var1 - var29) {
						var39 = var1 - var29;
					}

					while (var35 < var39) {
						int var41 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

						for (int var18 = 0; var18 < var29; var18++) {
							var41 += (int)((long)ag_fld[var35 + var29 - 1 - var18] * be.ah_fld[0][var18] >> 16);
						}

						for (int var43 = 0; var43 < var35; var43++) {
							var41 -= (int)((long)ag_fld[var35 - 1 - var43] * be.ah_fld[1][var43] >> 16);
						}

						ag_fld[var35] = var41;
						var23 = this.aj_fld.av(var1 + 1);
						var35++;
					}

					short var42 = 128;
					var39 = 128;

					while (true) {
						if (var39 > var1 - var29) {
							var39 = var1 - var29;
						}

						while (var35 < var39) {
							int var44 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

							for (int var19 = 0; var19 < var29; var19++) {
								var44 += (int)((long)ag_fld[var35 + var29 - 1 - var19] * be.ah_fld[0][var19] >> 16);
							}

							for (int var46 = 0; var46 < var31; var46++) {
								var44 -= (int)((long)ag_fld[var35 - 1 - var46] * be.ah_fld[1][var46] >> 16);
							}

							ag_fld[var35] = var44;
							var23 = this.aj_fld.av(var1 + 1);
							var35++;
						}

						if (var35 >= var1 - var29) {
							while (var35 < var1) {
								int var45 = 0;

								for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
									var45 += (int)((long)ag_fld[var35 + var29 - 1 - var47] * be.ah_fld[0][var47] >> 16);
								}

								for (int var48 = 0; var48 < var31; var48++) {
									var45 -= (int)((long)ag_fld[var35 - 1 - var48] * be.ah_fld[1][var48] >> 16);
								}

								ag_fld[var35] = var45;
								var23 = this.aj_fld.av(var1 + 1);
								var35++;
							}
							break;
						}

						var29 = this.ac_fld.ax(0, var23 / 65536.0F, var3);
						var31 = this.ac_fld.ax(1, var23 / 65536.0F, var3);
						var39 += 128;
					}
				}
			}

			for (int var25 = 0; var25 < var1; var25++) {
				if (ag_fld[var25] < -32768) {
					ag_fld[var25] = -32768;
				}

				if (ag_fld[var25] > 32767) {
					ag_fld[var25] = 32767;
				}
			}

			return ag_fld;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	final int[] aw(int var1, int var2, int var3) {
		ya.ar(ag_fld, 0, var1);
		if (var2 < 10) {
			return ag_fld;
		} else {
			double var4 = var1 / (var2 + 0.0);
			this.al_fld.az();
			this.au_fld.az();
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (this.ax_fld != null) {
				this.ax_fld.az();
				this.an_fld.az();
				var6 = (int)((this.ax_fld.ag_fld - this.ax_fld.ak_fld) * 32.768 / var4);
				var7 = (int)(this.ax_fld.ak_fld * 32.768 / var4);
			}

			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (this.aa_fld != null) {
				this.aa_fld.az();
				this.ai_fld.az();
				var9 = (int)((this.aa_fld.ag_fld - this.aa_fld.ak_fld) * 32.768 / var4);
				var10 = (int)(this.aa_fld.ak_fld * 32.768 / var4);
			}

			for (int var12 = 0; var12 < 5; var12++) {
				if (this.ad_fld[var12] != 0) {
					ae_fld[var12] = 0;
					ah_fld[var12] = (int)(this.ab_fld[var12] * var4);
					aw_fld[var12] = (this.ad_fld[var12] << 14) / 100;
					ay_fld[var12] = (int)((this.al_fld.ag_fld - this.al_fld.ak_fld) * 32.768 * Math.pow(1.0057929410678534, this.ao_fld[var12]) / var4);
					as_fld[var12] = (int)(this.al_fld.ak_fld * 32.768 / var4);
				}
			}

			for (int var20 = 0; var20 < var1; var20++) {
				int var13 = this.al_fld.av(var1);
				int var14 = this.au_fld.av(var1);
				if (this.ax_fld != null) {
					int var15 = this.ax_fld.av(var1);
					int var16 = this.an_fld.av(var1);
					var13 += this.ag(var8, var16, this.ax_fld.az_fld) >> 1;
					var8 += (var15 * var6 >> 16) + var7;
				}

				if (this.aa_fld != null) {
					int var32 = this.aa_fld.av(var1);
					int var36 = this.ai_fld.av(var1);
					var14 = var14 * ((this.ag(var11, var36, this.aa_fld.az_fld) >> 1) + 32768) >> 15;
					var11 += (var32 * var9 >> 16) + var10;
				}

				for (int var33 = 0; var33 < 5; var33++) {
					if (this.ad_fld[var33] != 0) {
						int var37 = var20 + ah_fld[var33];
						if (var37 < var1) {
							ag_fld[var37] = ag_fld[var37] + this.ag(ae_fld[var33], var14 * aw_fld[var33] >> 15, this.al_fld.az_fld);
							ae_fld[var33] = ae_fld[var33] + (var13 * ay_fld[var33] >> 16) + as_fld[var33];
						}
					}
				}
			}

			if (this.aq_fld != null) {
				this.aq_fld.az();
				this.am_fld.az();
				short var21 = 0;
				boolean var26 = false;
				boolean var30 = true;

				for (int var34 = 0; var34 < var1; var34++) {
					int var38 = this.aq_fld.av(var1);
					int var17 = this.am_fld.av(var1);
					int var27;
					if (var30) {
						var27 = this.aq_fld.ak_fld + ((this.aq_fld.ag_fld - this.aq_fld.ak_fld) * var38 >> 8);
					} else {
						var27 = this.aq_fld.ak_fld + ((this.aq_fld.ag_fld - this.aq_fld.ak_fld) * var17 >> 8);
					}

					var21 += 256;
					if (var21 >= var27) {
						var21 = 0;
						var30 = !var30;
					}

					if (var30) {
						ag_fld[var34] = 0;
					}
				}
			}

			if (this.ap_fld > 0 && this.at_fld > 0) {
				int var22 = (int)(this.ap_fld * var4);

				for (int var28 = var22; var28 < var1; var28++) {
					ag_fld[var28] = ag_fld[var28] + ag_fld[var28 - var22] * this.at_fld / 100;
				}
			}

			if (this.ac_fld.as_fld[0] > 0 || this.ac_fld.as_fld[1] > 0) {
				this.aj_fld.az();
				int var23 = this.aj_fld.av(var1 + 1);
				int var29 = this.ac_fld.ax(0, var23 / 65536.0F, var3);
				int var31 = this.ac_fld.ax(1, var23 / 65536.0F, var3);
				if (var1 >= var29 + var31) {
					int var35 = 0;
					int var39 = var31;
					if (var31 > var1 - var29) {
						var39 = var1 - var29;
					}

					while (var35 < var39) {
						int var41 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

						for (int var18 = 0; var18 < var29; var18++) {
							var41 += (int)((long)ag_fld[var35 + var29 - 1 - var18] * be.ah_fld[0][var18] >> 16);
						}

						for (int var43 = 0; var43 < var35; var43++) {
							var41 -= (int)((long)ag_fld[var35 - 1 - var43] * be.ah_fld[1][var43] >> 16);
						}

						ag_fld[var35] = var41;
						var23 = this.aj_fld.av(var1 + 1);
						var35++;
					}

					short var42 = 128;
					var39 = 128;

					while (true) {
						if (var39 > var1 - var29) {
							var39 = var1 - var29;
						}

						while (var35 < var39) {
							int var44 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

							for (int var19 = 0; var19 < var29; var19++) {
								var44 += (int)((long)ag_fld[var35 + var29 - 1 - var19] * be.ah_fld[0][var19] >> 16);
							}

							for (int var46 = 0; var46 < var31; var46++) {
								var44 -= (int)((long)ag_fld[var35 - 1 - var46] * be.ah_fld[1][var46] >> 16);
							}

							ag_fld[var35] = var44;
							var23 = this.aj_fld.av(var1 + 1);
							var35++;
						}

						if (var35 >= var1 - var29) {
							while (var35 < var1) {
								int var45 = 0;

								for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
									var45 += (int)((long)ag_fld[var35 + var29 - 1 - var47] * be.ah_fld[0][var47] >> 16);
								}

								for (int var48 = 0; var48 < var31; var48++) {
									var45 -= (int)((long)ag_fld[var35 - 1 - var48] * be.ah_fld[1][var48] >> 16);
								}

								ag_fld[var35] = var45;
								var23 = this.aj_fld.av(var1 + 1);
								var35++;
							}
							break;
						}

						var29 = this.ac_fld.ax(0, var23 / 65536.0F, var3);
						var31 = this.ac_fld.ax(1, var23 / 65536.0F, var3);
						var39 += 128;
					}
				}
			}

			for (int var25 = 0; var25 < var1; var25++) {
				if (ag_fld[var25] < -32768) {
					ag_fld[var25] = -32768;
				}

				if (ag_fld[var25] > 32767) {
					ag_fld[var25] = 32767;
				}
			}

			return ag_fld;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	final int ay(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return av_fld[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? az_fld[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "(Lbk;Lxi;)V"
	)
	public static void sy(bk var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = new ax();
		var0.al_fld.ak(var1);
		var0.au_fld = new ax();
		var0.au_fld.ak(var1);
		int var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			var0.ax_fld = new ax();
			var0.ax_fld.ak(var1);
			var0.an_fld = new ax();
			var0.an_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			var0.aa_fld = new ax();
			var0.aa_fld.ak(var1);
			var0.ai_fld = new ax();
			var0.ai_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			var0.aq_fld = new ax();
			var0.aq_fld.ak(var1);
			var0.am_fld = new ax();
			var0.am_fld.ak(var1);
		}

		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = var1.dz();
			if (var4 == 0) {
				break;
			}

			var0.ad_fld[var3] = var4;
			var0.ao_fld[var3] = var1.dv();
			var0.ab_fld[var3] = var1.dz();
		}

		var0.ap_fld = var1.dz();
		var0.at_fld = var1.dz();
		var0.ar_fld = var1.cm();
		var0.af_fld = var1.cm();
		var0.ac_fld = new be();
		var0.aj_fld = new ax();
		var0.ac_fld.ae(var1, var0.aj_fld);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	final int as(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return av_fld[var1 & 40252293] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? az_fld[var1 / 2607 & 100321501] * var2 : 0;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)[I"
	)
	final int[] ae(int var1, int var2, int var3) {
		ya.ar(ag_fld, 0, var1);
		if (var2 < 10) {
			return ag_fld;
		} else {
			double var4 = var1 / (var2 + 0.0);
			this.al_fld.az();
			this.au_fld.az();
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (this.ax_fld != null) {
				this.ax_fld.az();
				this.an_fld.az();
				var6 = (int)((this.ax_fld.ag_fld - this.ax_fld.ak_fld) * 32.768 / var4);
				var7 = (int)(this.ax_fld.ak_fld * 32.768 / var4);
			}

			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (this.aa_fld != null) {
				this.aa_fld.az();
				this.ai_fld.az();
				var9 = (int)((this.aa_fld.ag_fld - this.aa_fld.ak_fld) * 32.768 / var4);
				var10 = (int)(this.aa_fld.ak_fld * 32.768 / var4);
			}

			for (int var12 = 0; var12 < 5; var12++) {
				if (this.ad_fld[var12] != 0) {
					ae_fld[var12] = 0;
					ah_fld[var12] = (int)(this.ab_fld[var12] * var4);
					aw_fld[var12] = (this.ad_fld[var12] << 14) / 100;
					ay_fld[var12] = (int)((this.al_fld.ag_fld - this.al_fld.ak_fld) * 32.768 * Math.pow(1.0057929410678534, this.ao_fld[var12]) / var4);
					as_fld[var12] = (int)(this.al_fld.ak_fld * 32.768 / var4);
				}
			}

			for (int var20 = 0; var20 < var1; var20++) {
				int var13 = this.al_fld.av(var1);
				int var14 = this.au_fld.av(var1);
				if (this.ax_fld != null) {
					int var15 = this.ax_fld.av(var1);
					int var16 = this.an_fld.av(var1);
					var13 += this.ag(var8, var16, this.ax_fld.az_fld) >> 1;
					var8 += (var15 * var6 >> 16) + var7;
				}

				if (this.aa_fld != null) {
					int var32 = this.aa_fld.av(var1);
					int var36 = this.ai_fld.av(var1);
					var14 = var14 * ((this.ag(var11, var36, this.aa_fld.az_fld) >> 1) + 32768) >> 15;
					var11 += (var32 * var9 >> 16) + var10;
				}

				for (int var33 = 0; var33 < 5; var33++) {
					if (this.ad_fld[var33] != 0) {
						int var37 = var20 + ah_fld[var33];
						if (var37 < var1) {
							ag_fld[var37] = ag_fld[var37] + this.ag(ae_fld[var33], var14 * aw_fld[var33] >> 15, this.al_fld.az_fld);
							ae_fld[var33] = ae_fld[var33] + (var13 * ay_fld[var33] >> 16) + as_fld[var33];
						}
					}
				}
			}

			if (this.aq_fld != null) {
				this.aq_fld.az();
				this.am_fld.az();
				short var21 = 0;
				boolean var26 = false;
				boolean var30 = true;

				for (int var34 = 0; var34 < var1; var34++) {
					int var38 = this.aq_fld.av(var1);
					int var17 = this.am_fld.av(var1);
					int var27;
					if (var30) {
						var27 = this.aq_fld.ak_fld + ((this.aq_fld.ag_fld - this.aq_fld.ak_fld) * var38 >> 8);
					} else {
						var27 = this.aq_fld.ak_fld + ((this.aq_fld.ag_fld - this.aq_fld.ak_fld) * var17 >> 8);
					}

					var21 += 256;
					if (var21 >= var27) {
						var21 = 0;
						var30 = !var30;
					}

					if (var30) {
						ag_fld[var34] = 0;
					}
				}
			}

			if (this.ap_fld > 0 && this.at_fld > 0) {
				int var22 = (int)(this.ap_fld * var4);

				for (int var28 = var22; var28 < var1; var28++) {
					ag_fld[var28] = ag_fld[var28] + ag_fld[var28 - var22] * this.at_fld / 100;
				}
			}

			if (this.ac_fld.as_fld[0] > 0 || this.ac_fld.as_fld[1] > 0) {
				this.aj_fld.az();
				int var23 = this.aj_fld.av(var1 + 1);
				int var29 = this.ac_fld.ax(0, var23 / 65536.0F, var3);
				int var31 = this.ac_fld.ax(1, var23 / 65536.0F, var3);
				if (var1 >= var29 + var31) {
					int var35 = 0;
					int var39 = var31;
					if (var31 > var1 - var29) {
						var39 = var1 - var29;
					}

					while (var35 < var39) {
						int var41 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

						for (int var18 = 0; var18 < var29; var18++) {
							var41 += (int)((long)ag_fld[var35 + var29 - 1 - var18] * be.ah_fld[0][var18] >> 16);
						}

						for (int var43 = 0; var43 < var35; var43++) {
							var41 -= (int)((long)ag_fld[var35 - 1 - var43] * be.ah_fld[1][var43] >> 16);
						}

						ag_fld[var35] = var41;
						var23 = this.aj_fld.av(var1 + 1);
						var35++;
					}

					short var42 = 128;
					var39 = 128;

					while (true) {
						if (var39 > var1 - var29) {
							var39 = var1 - var29;
						}

						while (var35 < var39) {
							int var44 = (int)((long)ag_fld[var35 + var29] * be.ay_fld >> 16);

							for (int var19 = 0; var19 < var29; var19++) {
								var44 += (int)((long)ag_fld[var35 + var29 - 1 - var19] * be.ah_fld[0][var19] >> 16);
							}

							for (int var46 = 0; var46 < var31; var46++) {
								var44 -= (int)((long)ag_fld[var35 - 1 - var46] * be.ah_fld[1][var46] >> 16);
							}

							ag_fld[var35] = var44;
							var23 = this.aj_fld.av(var1 + 1);
							var35++;
						}

						if (var35 >= var1 - var29) {
							while (var35 < var1) {
								int var45 = 0;

								for (int var47 = var35 + var29 - var1; var47 < var29; var47++) {
									var45 += (int)((long)ag_fld[var35 + var29 - 1 - var47] * be.ah_fld[0][var47] >> 16);
								}

								for (int var48 = 0; var48 < var31; var48++) {
									var45 -= (int)((long)ag_fld[var35 - 1 - var48] * be.ah_fld[1][var48] >> 16);
								}

								ag_fld[var35] = var45;
								var23 = this.aj_fld.av(var1 + 1);
								var35++;
							}
							break;
						}

						var29 = this.ac_fld.ax(0, var23 / 65536.0F, var3);
						var31 = this.ac_fld.ax(1, var23 / 65536.0F, var3);
						var39 += 128;
					}
				}
			}

			for (int var25 = 0; var25 < var1; var25++) {
				if (ag_fld[var25] < -32768) {
					ag_fld[var25] = -32768;
				}

				if (ag_fld[var25] > 32767) {
					ag_fld[var25] = 32767;
				}
			}

			return ag_fld;
		}
	}

	static {
		Random var0 = new Random(0L);

		for (int var1 = 0; var1 < 32768; var1++) {
			az_fld[var1] = (var0.nextInt() & 2) - 1;
		}

		av_fld = new int[32768];

		for (int var2 = 0; var2 < 32768; var2++) {
			av_fld[var2] = (int)(Math.sin(var2 / 5215.1903) * 16384.0);
		}

		ag_fld = new int[220500];
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lwt;)Z"
	)
	public static boolean gb(wt var0) {
		return var0.ay_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void af(xi var1) {
		this.al_fld = new ax();
		this.al_fld.ak(var1);
		this.au_fld = new ax();
		this.au_fld.ak(var1);
		int var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld -= 2026647244;
			this.ax_fld = new ax();
			this.ax_fld.ak(var1);
			this.an_fld = new ax();
			this.an_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld -= -883446229;
			this.aa_fld = new ax();
			this.aa_fld.ak(var1);
			this.ai_fld = new ax();
			this.ai_fld.ak(var1);
		}

		var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld -= -1470865781;
			this.aq_fld = new ax();
			this.aq_fld.ak(var1);
			this.am_fld = new ax();
			this.am_fld.ak(var1);
		}

		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = var1.dz();
			if (var4 == 0) {
				break;
			}

			this.ad_fld[var3] = var4;
			this.ao_fld[var3] = var1.dv();
			this.ab_fld[var3] = var1.dz();
		}

		this.ap_fld = var1.dz();
		this.at_fld = var1.dz();
		this.ar_fld = var1.cm();
		this.af_fld = var1.cm();
		this.ac_fld = new be();
		this.aj_fld = new ax();
		this.ac_fld.ae(var1, this.aj_fld);
	}

	bk() {
		this.ad_fld = new int[]{0, 0, 0, 0, 0};
		this.ao_fld = new int[]{0, 0, 0, 0, 0};
		this.ab_fld = new int[]{0, 0, 0, 0, 0};
		this.ap_fld = 0;
		this.at_fld = 100;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void az(xi var1) {
		this.am_fld = new ax();
		this.am_fld.ag(var1);
		this.an_fld = new ax();
		this.ax_fld.ar(var1);
		int var2 = var1.cg();
		if (var2 != 0) {
			var1.au_fld--;
			this.ax_fld = new ax();
			this.aq_fld.ah(var1);
			this.al_fld = new ax();
			this.am_fld.ag(var1);
		}

		var2 = var1.dz();
		if (var2 != 0) {
			var1.au_fld--;
			this.am_fld = new ax();
			this.au_fld.ag(var1);
			this.al_fld = new ax();
			this.al_fld.ar(var1);
		}

		var2 = var1.co((byte)-62);
		if (var2 != 0) {
			var1.au_fld--;
			this.am_fld = new ax();
			this.aa_fld.ag(var1);
			this.am_fld = new ax();
			this.al_fld.ah(var1);
		}

		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = var1.eq();
			if (var4 == 0) {
				break;
			}

			this.ad_fld[var3] = var4;
			this.ao_fld[var3] = var1.co((byte)91);
			this.ao_fld[var3] = var1.ei();
		}

		this.at_fld = var1.dv();
		this.ar_fld = var1.dv();
		this.ap_fld = var1.kc(876466099);
		this.ar_fld = var1.kv(982864321);
		this.ac_fld = new be();
		this.ai_fld = new ax();
		this.ac_fld.ae(var1, this.ai_fld);
	}
}
