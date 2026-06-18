import java.util.Random;
import net.runelite.api.FontTypeFace;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zv")
@Implements({"FontTypeFace"})
public abstract class zv extends yu implements FontTypeFace {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld = -1;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] br_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld = -1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int at_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld = -1;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld = 0;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld = 0;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] be_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld = 0;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ad_fld = 0;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Random;"
	)
	static Random ao_fld = new Random();
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] ab_fld = new String[100];
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld = 256;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ap_fld = 0;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ac_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	byte[][] aj_fld = new byte[256][];
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld = -1;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bz_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bd_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	public static yc[] ag_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bm_fld;
	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/StringBuilder;"
	)
	public static StringBuilder zo_fld = new StringBuilder(100);
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] bs_fld;

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "([II)[I"
	)
	int[] hm(int[] var1, int var2) {
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / var2;

			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = var1[(int)(var5 * var4)];
			}

			return var3;
		}
	}

	@ObfuscatedName("drawWidgetText")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIIIIIIII)V"
	)
	@Export("drawWidgetText")
	@Override
	public void drawWidgetText(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.ac(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V"
	)
	void bl(String var1, int var2, int var3) {
		var3 -= this.ap_fld;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(vj.ak(var1.charAt(var6)) & 255);
				if (var7 == '<') {
					var4 = var6;
				} else {
					if (var7 == '>' && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = '<';
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										int var14 = tf.av(var8.substring(4));
										yc var15 = ag_fld[var14];
										var15.ae(var2, var3 + this.ap_fld - var15.ay_fld);
										var2 += var15.aw_fld;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.iy(var8);
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) {
						var7 = ' ';
					}

					if (var4 == -1) {
						if (this.bs_fld != null && var5 != -1) {
							var2 += this.bs_fld[(var5 << 8) + var7];
						}

						int var13 = this.bz_fld[var7];
						int var9 = this.bm_fld[var7];
						if (var7 != ' ') {
							if (as_fld == 256) {
								if (ah_fld != -1) {
									as(this.aj_fld[var7], var2 + this.bd_fld[var7] + 1, var3 + this.br_fld[var7] + 1, var13, var9, ah_fld);
								}

								this.ak(this.aj_fld[var7], var2 + this.bd_fld[var7], var3 + this.br_fld[var7], var13, var9, ay_fld);
							} else {
								if (ah_fld != -1) {
									af(this.aj_fld[var7], var2 + this.bd_fld[var7] + 1, var3 + this.br_fld[var7] + 1, var13, var9, ah_fld, as_fld);
								}

								this.ae(this.aj_fld[var7], var2 + this.bd_fld[var7], var3 + this.br_fld[var7], var13, var9, ay_fld, as_fld);
							}
						} else if (ar_fld > 0) {
							ad_fld = ad_fld + ar_fld;
							var2 += ad_fld >> 8;
							ad_fld &= 255;
						}

						int var10 = this.be_fld[var7];
						if (az_fld != -1) {
							ew(var2, var3 + (int)(this.ap_fld * 0.7), var10, az_fld);
						}

						if (av_fld != -1) {
							ew(var2, var3 + this.ap_fld + 1, var10, av_fld);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([[B[[B[I[I[III)I"
	)
	static int aw(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String ay(String var0) {
		int var1 = var0.length();
		byte var2 = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; var7++) {
			char var5 = var0.charAt(var7);
			if (var5 == '<') {
				var6.append("<lt>");
			} else if (var5 == '>') {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIIIII)V"
	)
	static void as(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * au_fld;
		int var7 = au_fld - var3;
		int var8 = 0;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var4 -= var10;
			var2 = aa_fld;
			var9 += var10 * var3;
			var6 += var10 * au_fld;
		}

		if (var2 + var4 > ai_fld) {
			var4 -= var2 + var4 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var11 = aq_fld - var1;
			var3 -= var11;
			var1 = aq_fld;
			var9 += var11;
			var6 += var11;
			var8 += var11;
			var7 += var11;
		}

		if (var1 + var3 > am_fld) {
			int var12 = var1 + var3 - am_fld;
			var3 -= var12;
			var8 += var12;
			var7 += var12;
		}

		if (var3 > 0 && var4 > 0) {
			ar(al_fld, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([I[BIIIIIII)V"
	)
	static void ar(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}
			}

			for (int var19 = var5; var19 < 0; var19++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIII)V"
	)
	public static void in(zv var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			on(var0, var4, var5);
			as_fld = var6;
			var0.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIIIIII)V"
	)
	static void af(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * au_fld;
		int var8 = au_fld - var3;
		int var9 = 0;
		int var10 = 0;
		if (var2 < aa_fld) {
			int var11 = aa_fld - var2;
			var4 -= var11;
			var2 = aa_fld;
			var10 += var11 * var3;
			var7 += var11 * au_fld;
		}

		if (var2 + var4 > ai_fld) {
			var4 -= var2 + var4 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var3 -= var12;
			var1 = aq_fld;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (var1 + var3 > am_fld) {
			int var13 = var1 + var3 - am_fld;
			var3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (var3 > 0 && var4 > 0) {
			al(al_fld, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[BIIIIIIII)V"
	)
	static void al(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 0xFF00) * var9 & 0xFF0000) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = -var5; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					client.no(var0, var4++, (((var12 & 16711935) * var9 & -16711936) + ((var12 & 0xFF00) * var9 & 0xFF0000) >> 8) + var2, 256 - var9);
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lzv;II)V"
	)
	public static void on(zv var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		az_fld = -1;
		av_fld = -1;
		ae_fld = var2;
		ah_fld = var2;
		aw_fld = var1;
		ay_fld = var1;
		as_fld = 256;
		ar_fld = 0;
		ad_fld = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int ai(String var1, int var2) {
		int var3 = sh(this, var1, new int[]{var2}, ab_fld);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.an(ab_fld[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIIIIIIII)I"
	)
	public int dt(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			on(this, var6, var7);
			as_fld = var8;
			if (var11 == 0) {
				var11 = this.ap_fld;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.at_fld + this.ac_fld + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = sh(this, var1, var12, ab_fld);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			if (var10 == 0) {
				var14 = var3 + this.at_fld;
			} else if (var10 == 1) {
				var14 = var3 + this.at_fld + (var5 - this.at_fld - this.ac_fld - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.ac_fld - (var13 - 1) * var11;
			} else {
				int var15 = (var5 - this.at_fld - this.ac_fld - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + this.at_fld + var15;
				var11 += var15;
			}

			for (int var16 = 0; var16 < var13; var16++) {
				if (var9 == 0) {
					this.bl(ab_fld[var16], var2, var14);
				} else if (var9 == 1) {
					this.bl(ab_fld[var16], var2 + (var4 - this.an(ab_fld[var16])) / 2, var14);
				} else if (var9 == 2) {
					this.bl(ab_fld[var16], var2 + var4 - this.an(ab_fld[var16]), var14);
				} else if (var16 == var13 - 1) {
					this.bl(ab_fld[var16], var2, var14);
				} else {
					this.by(ab_fld[var16], var4);
					this.bl(ab_fld[var16], var2, var14);
					ar_fld = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int an(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); var5++) {
				char var6 = var1.charAt(var5);
				if (var6 == '<') {
					var2 = var5;
				} else {
					if (var6 == '>' && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = '<';
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = tf.av(var7.substring(4));
										var4 += ag_fld[var8].aw_fld;
										var3 = -1;
									} catch (Exception var9) {
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) {
						var6 = ' ';
					}

					if (var2 == -1) {
						var4 += this.be_fld[(char)(vj.ak(var6) & 255)];
						if (this.bs_fld != null && var3 != -1) {
							var4 += this.bs_fld[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "([I[BIIIIIIII)V"
	)
	static void cc(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 0xFF00) * var9 & 0xFF0000) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = -var5; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 0xFF00) * var9 & 0xFF0000) >> 8) + var2;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	zv(byte[] var1) {
		this.au(var1);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V"
	)
	void ik(String var1, int var2, int var3) {
		var3 -= this.ap_fld;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(vj.ak(var1.charAt(var6)) & 255);
				if (var7 == '<') {
					var4 = var6;
				} else {
					if (var7 == '>' && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = '<';
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										int var14 = tf.av(var8.substring(4));
										yc var15 = ag_fld[var14];
										var15.ae(var2, var3 + this.ap_fld - var15.ay_fld);
										var2 += var15.aw_fld;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.iy(var8);
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) {
						var7 = ' ';
					}

					if (var4 == -1) {
						if (this.bs_fld != null && var5 != -1) {
							var2 += this.bs_fld[(var5 << 8) + var7];
						}

						int var13 = this.bz_fld[var7];
						int var9 = this.bm_fld[var7];
						if (var7 != ' ') {
							if (as_fld == 256) {
								if (ah_fld != -1) {
									as(this.aj_fld[var7], var2 + this.bd_fld[var7] + 1, var3 + this.br_fld[var7] + 1, var13, var9, ah_fld);
								}

								this.ak(this.aj_fld[var7], var2 + this.bd_fld[var7], var3 + this.br_fld[var7], var13, var9, ay_fld);
							} else {
								if (ah_fld != -1) {
									af(this.aj_fld[var7], var2 + this.bd_fld[var7] + 1, var3 + this.br_fld[var7] + 1, var13, var9, ah_fld, as_fld);
								}

								this.ae(this.aj_fld[var7], var2 + this.bd_fld[var7], var3 + this.br_fld[var7], var13, var9, ay_fld, as_fld);
							}
						} else if (ar_fld > 0) {
							ad_fld = ad_fld + ar_fld;
							var2 += ad_fld >> 8;
							ad_fld &= 255;
						}

						int var10 = this.be_fld[var7];
						if (az_fld != -1) {
							ew(var2, var3 + (int)(this.ap_fld * 0.7), var10, az_fld);
						}

						if (av_fld != -1) {
							ew(var2, var3 + this.ap_fld + 1, var10, av_fld);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII)V"
	)
	public void ao(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			on(this, var4, var5);
			as_fld = var6;
			this.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void ap(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			on(this, var4, var5);
			this.bl(var1, var2 - this.an(var1) / 2, var3);
		}
	}

	@ObfuscatedName("getTextWidth")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	@Export("getTextWidth")
	@Override
	public int getTextWidth(String var1) {
		return this.an(var1);
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;II[I[I[I)V"
	)
	public static void gz(zv var0, String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		if (var0 == null) {
			var0.getClass();
		}

		var3 -= var0.ap_fld;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); var10++) {
			if (var1.charAt(var10) != 0) {
				int var11 = (char)(vj.ak(var1.charAt(var10)) & 1709946539);
				if (var11 == 60) {
					var7 = var10;
				} else {
					if (var11 == -1799658550 && var7 != -1) {
						String var12 = var1.substring(var7 + 1, var10);
						var7 = -1;
						if (var12.equals("lt")) {
							var11 = -1326050259;
						} else {
							if (!var12.equals("gt")) {
								if (var12.startsWith("img=")) {
									try {
										int var21;
										if (var5 != null) {
											var21 = var5[var9];
										} else {
											var21 = 0;
										}

										int var22;
										if (var6 != null) {
											var22 = var6[var9];
										} else {
											var22 = 0;
										}

										var9++;
										int var23 = tf.av(var12.substring(4));
										yc var24 = ag_fld[var23];
										var24.ae(var2 + var21, var3 + var0.ap_fld - var24.ay_fld + var22);
										var2 += var24.aw_fld;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									var0.iy(var12);
								}
								continue;
							}

							var11 = 62;
						}
					}

					if (var11 == 2104159167) {
						var11 = 1546542113;
					}

					if (var7 == -1) {
						if (var0.bs_fld != null && var8 != -1) {
							var2 += var0.bs_fld[(var8 << 8) + var11];
						}

						int var20 = var0.bz_fld[var11];
						int var13 = var0.bm_fld[var11];
						int var14;
						if (var5 != null) {
							var14 = var5[var9];
						} else {
							var14 = 0;
						}

						int var15;
						if (var6 != null) {
							var15 = var6[var9];
						} else {
							var15 = 0;
						}

						int var16;
						if (var4 != null) {
							var16 = var4[var9];
						} else {
							var16 = ay_fld;
						}

						var9++;
						if (var11 != 32) {
							if (as_fld == 256) {
								if (ah_fld != -1) {
									as(var0.aj_fld[var11], var2 + var0.bd_fld[var11] + 1 + var14, var3 + var0.br_fld[var11] + 1 + var15, var20, var13, ah_fld);
								}

								var0.ak(var0.aj_fld[var11], var2 + var0.bd_fld[var11] + var14, var3 + var0.br_fld[var11] + var15, var20, var13, var16);
							} else {
								if (ah_fld != -1) {
									af(var0.aj_fld[var11], var2 + var0.bd_fld[var11] + 1 + var14, var3 + var0.br_fld[var11] + 1 + var15, var20, var13, ah_fld, as_fld);
								}

								var0.ae(var0.aj_fld[var11], var2 + var0.bd_fld[var11] + var14, var3 + var0.br_fld[var11] + var15, var20, var13, var16, as_fld);
							}
						} else if (ar_fld > 0) {
							ad_fld = ad_fld + ar_fld;
							var2 += ad_fld >> 8;
							ad_fld &= 255;
						}

						int var17 = var0.be_fld[var11];
						if (az_fld != -1) {
							ew(var2, var3 + (int)(var0.ap_fld * 0.7), var17, az_fld);
						}

						if (av_fld != -1) {
							ew(var2, var3 + var0.ap_fld, var17, av_fld);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIIII[I)V"
	)
	public static void mf(zv var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var0 == null) {
			var0.getClass();
		} else if (var1 != null) {
			on(var0, var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = var0.hy(var8, var1.length());
			}

			double var10 = 7.0 - var7 / 8.0;
			if (var10 < 0.0) {
				var10 = 0.0;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); var13++) {
				var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
			}

			var0.bx(var1, var2 - var0.an(var1) / 2, var3, var9, null, var12);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIIIIIII)I"
	)
	public int at(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.ac(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lzr;IIIII)Lve;"
	)
	public ve aj(zr var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.az()) {
			on(this, var4, var5);
			var3 -= this.ap_fld;

			for (int var7 = 0; var7 < var1.av(); var7++) {
				zj var8 = var1.ay(var7);
				if (var6 != -1 && var8.ag_fld > var6) {
					return new ve(var8.az_fld, var8.ag_fld);
				}

				char var9 = var8.ak_fld;
				if (var9 != '\n') {
					if (zr.wg(var1, var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.az_fld;
						int var11 = var3 + var8.ag_fld;
						int var12 = this.bz_fld[var9];
						int var13 = this.bm_fld[var9];
						if (ah_fld != -1) {
							this.ak(this.aj_fld[var9], var10 + this.bd_fld[var9] + 1, var11 + this.br_fld[var9] + 1, var12, var13, ah_fld);
						}

						this.ak(this.aj_fld[var9], var10 + this.bd_fld[var9], var11 + this.br_fld[var9], var12, var13, ay_fld);
					}
				}
			}
		}

		return var1.aw();
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;)V"
	)
	public static void gu(zv var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		try {
			if (var1.startsWith("col=")) {
				ay_fld = lq.ae(var1.substring(4), 16);
			} else if (var1.equals("/col")) {
				ay_fld = aw_fld;
			} else if (var1.startsWith("str=")) {
				az_fld = lq.ae(var1.substring(4), 16);
			} else if (var1.equals("str")) {
				az_fld = -1121853252;
			} else if (var1.equals("/str")) {
				az_fld = -1;
			} else if (var1.startsWith("u=")) {
				av_fld = lq.ae(var1.substring(2), 16);
			} else if (var1.equals("u")) {
				av_fld = 0;
			} else if (var1.equals("/u")) {
				av_fld = -1;
			} else if (var1.startsWith("shad=")) {
				ah_fld = lq.ae(var1.substring(5), 16);
			} else if (var1.equals("shad")) {
				ah_fld = 0;
			} else if (var1.equals("/shad")) {
				ah_fld = ae_fld;
			} else if (var1.equals("br")) {
				on(var0, aw_fld, ae_fld);
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void is(int var1, int var2) {
		az_fld = -1;
		av_fld = -1;
		ae_fld = var2;
		ah_fld = var2;
		aw_fld = var1;
		ay_fld = var1;
		as_fld = 256;
		ar_fld = 0;
		ad_fld = 0;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII[I)V"
	)
	public void dd(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.hy(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); var10++) {
				var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var8, null, var9);
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void ct(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			on(this, var4, var5);
			this.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "([II)[I"
	)
	int[] hy(int[] var1, int var2) {
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / var2;

			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = var1[(int)(var5 * var4)];
			}

			return var3;
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int ce(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); var5++) {
				char var6 = var1.charAt(var5);
				if (var6 == 785786836) {
					var2 = var5;
				} else {
					if (var6 == 991292625 && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = '<';
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = tf.av(var7.substring(4));
										var4 += ag_fld[var8].aw_fld;
										var3 = -1;
									} catch (Exception var9) {
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) {
						var6 = ' ';
					}

					if (var2 == -1) {
						var4 += this.be_fld[(char)(vj.ak(var6) & 255)];
						if (this.bs_fld != null && var3 != -1) {
							var4 += this.bs_fld[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIII)V"
	)
	public static void uz(zv var0, String var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		} else if (var1 != null) {
			on(var0, var4, var5);
			var0.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bk(int var1, int var2, int var3, int var4) {
		var3 -= this.ap_fld;
		int var5 = var1 & 0xFF;
		if (var5 != 32) {
			this.ak(this.aj_fld[var5], var2 + this.bd_fld[var5], var3 + this.br_fld[var5], this.bz_fld[var5], this.bm_fld[var5], var4);
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void iy(String var1) {
		try {
			if (var1.startsWith("col=")) {
				ay_fld = lq.ae(var1.substring(4), 16);
			} else if (var1.equals("/col")) {
				ay_fld = aw_fld;
			} else if (var1.startsWith("str=")) {
				az_fld = lq.ae(var1.substring(4), 16);
			} else if (var1.equals("str")) {
				az_fld = 8388608;
			} else if (var1.equals("/str")) {
				az_fld = -1;
			} else if (var1.startsWith("u=")) {
				av_fld = lq.ae(var1.substring(2), 16);
			} else if (var1.equals("u")) {
				av_fld = 0;
			} else if (var1.equals("/u")) {
				av_fld = -1;
			} else if (var1.startsWith("shad=")) {
				ah_fld = lq.ae(var1.substring(5), 16);
			} else if (var1.equals("shad")) {
				ah_fld = 0;
			} else if (var1.equals("/shad")) {
				ah_fld = ae_fld;
			} else if (var1.equals("br")) {
				on(this, aw_fld, ae_fld);
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void by(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); var5++) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				var3++;
			}
		}

		if (var3 > 0) {
			ar_fld = (var2 - this.an(var1) << 8) / var3;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "([BIIIII)V"
	)
	static void bu(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * au_fld;
		int var7 = au_fld - var3;
		int var8 = 0;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var4 -= var10;
			var2 = aa_fld;
			var9 += var10 * var3;
			var6 += var10 * au_fld;
		}

		if (var2 + var4 > ai_fld) {
			var4 -= var2 + var4 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var11 = aq_fld - var1;
			var3 -= var11;
			var1 = aq_fld;
			var9 += var11;
			var6 += var11;
			var8 += var11;
			var7 += var11;
		}

		if (var1 + var3 > am_fld) {
			int var12 = var1 + var3 - am_fld;
			var3 -= var12;
			var8 += var12;
			var7 += var12;
		}

		if (var3 > 0 && var4 > 0) {
			ar(al_fld, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II[I[I[I)V"
	)
	void bx(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.ap_fld;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); var10++) {
			if (var1.charAt(var10) != 0) {
				char var11 = (char)(vj.ak(var1.charAt(var10)) & 255);
				if (var11 == '<') {
					var7 = var10;
				} else {
					if (var11 == '>' && var7 != -1) {
						String var12 = var1.substring(var7 + 1, var10);
						var7 = -1;
						if (var12.equals("lt")) {
							var11 = '<';
						} else {
							if (!var12.equals("gt")) {
								if (var12.startsWith("img=")) {
									try {
										int var21;
										if (var5 != null) {
											var21 = var5[var9];
										} else {
											var21 = 0;
										}

										int var22;
										if (var6 != null) {
											var22 = var6[var9];
										} else {
											var22 = 0;
										}

										var9++;
										int var23 = tf.av(var12.substring(4));
										yc var24 = ag_fld[var23];
										var24.ae(var2 + var21, var3 + this.ap_fld - var24.ay_fld + var22);
										var2 += var24.aw_fld;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									this.iy(var12);
								}
								continue;
							}

							var11 = '>';
						}
					}

					if (var11 == 160) {
						var11 = ' ';
					}

					if (var7 == -1) {
						if (this.bs_fld != null && var8 != -1) {
							var2 += this.bs_fld[(var8 << 8) + var11];
						}

						int var20 = this.bz_fld[var11];
						int var13 = this.bm_fld[var11];
						int var14;
						if (var5 != null) {
							var14 = var5[var9];
						} else {
							var14 = 0;
						}

						int var15;
						if (var6 != null) {
							var15 = var6[var9];
						} else {
							var15 = 0;
						}

						int var16;
						if (var4 != null) {
							var16 = var4[var9];
						} else {
							var16 = ay_fld;
						}

						var9++;
						if (var11 != ' ') {
							if (as_fld == 256) {
								if (ah_fld != -1) {
									as(this.aj_fld[var11], var2 + this.bd_fld[var11] + 1 + var14, var3 + this.br_fld[var11] + 1 + var15, var20, var13, ah_fld);
								}

								this.ak(this.aj_fld[var11], var2 + this.bd_fld[var11] + var14, var3 + this.br_fld[var11] + var15, var20, var13, var16);
							} else {
								if (ah_fld != -1) {
									af(this.aj_fld[var11], var2 + this.bd_fld[var11] + 1 + var14, var3 + this.br_fld[var11] + 1 + var15, var20, var13, ah_fld, as_fld);
								}

								this.ae(this.aj_fld[var11], var2 + this.bd_fld[var11] + var14, var3 + this.br_fld[var11] + var15, var20, var13, var16, as_fld);
							}
						} else if (ar_fld > 0) {
							ad_fld = ad_fld + ar_fld;
							var2 += ad_fld >> 8;
							ad_fld &= 255;
						}

						int var17 = this.be_fld[var11];
						if (az_fld != -1) {
							ew(var2, var3 + (int)(this.ap_fld * 0.7), var17, az_fld);
						}

						if (av_fld != -1) {
							ew(var2, var3 + this.ap_fld, var17, av_fld);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BIIIII)V"
	)
	abstract void ak(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIIIIII)V"
	)
	abstract void ae(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void bf(String var1) {
		try {
			if (var1.startsWith("col=")) {
				ay_fld = lq.ae(var1.substring(4), 16);
			} else if (var1.equals("/col")) {
				ay_fld = aw_fld;
			} else if (var1.startsWith("str=")) {
				az_fld = lq.ae(var1.substring(4), 16);
			} else if (var1.equals("str")) {
				az_fld = 8388608;
			} else if (var1.equals("/str")) {
				az_fld = -1;
			} else if (var1.startsWith("u=")) {
				av_fld = lq.ae(var1.substring(2), 16);
			} else if (var1.equals("u")) {
				av_fld = 0;
			} else if (var1.equals("/u")) {
				av_fld = -1;
			} else if (var1.startsWith("shad=")) {
				ah_fld = lq.ae(var1.substring(5), 16);
			} else if (var1.equals("shad")) {
				ah_fld = 0;
			} else if (var1.equals("/shad")) {
				ah_fld = ae_fld;
			} else if (var1.equals("br")) {
				on(this, aw_fld, ae_fld);
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIIIII)V"
	)
	abstract void az(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIIIII)V"
	)
	abstract void av(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;[I[Ljava/lang/String;)I"
	)
	public static int xi(zv var0, String var1, int[] var2, String[] var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			int var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; var14++) {
				char var15 = var1.charAt(var14);
				if (var15 == 926398207) {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12++] = var6.substring(var5);
							var6.setLength(0);
							var5 = 0;
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += ma.ax(var0, '<');
							if (var0.bs_fld != null && var11 != -1) {
								var4 += var0.bs_fld[(var11 << 8) + 60];
							}

							var11 = 1717970943;
						} else if (var16.equals("gt")) {
							var4 += ma.ax(var0, '>');
							if (var0.bs_fld != null && var11 != -1) {
								var4 += var0.bs_fld[(var11 << 8) + 62];
							}

							var11 = 62;
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = tf.av(var16.substring(4));
								var4 += ag_fld[var17].aw_fld;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += ma.ax(var0, var15);
							if (var0.bs_fld != null && var11 != -1) {
								var4 += var0.bs_fld[(var11 << 8) + var15];
							}

							var11 = var15;
						}

						if (var15 == -1928743122) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12++] = var6.substring(var5, var7 - var9);
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			if (var6.length() > var5) {
				var3[var12++] = var6.substring(var5);
			}

			return var12;
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V"
	)
	void ih(String var1, int var2, int var3) {
		var3 -= this.ap_fld;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				int var7 = (char)(vj.ak(var1.charAt(var6)) & -1673964349);
				if (var7 == 60) {
					var4 = var6;
				} else {
					if (var7 == 62 && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = 60;
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										int var14 = tf.av(var8.substring(4));
										yc var15 = ag_fld[var14];
										var15.ae(var2, var3 + this.ap_fld - var15.ay_fld);
										var2 += var15.aw_fld;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.iy(var8);
								}
								continue;
							}

							var7 = 1471429472;
						}
					}

					if (var7 == -566458609) {
						var7 = 32;
					}

					if (var4 == -1) {
						if (this.bs_fld != null && var5 != -1) {
							var2 += this.bs_fld[(var5 << 8) + var7];
						}

						int var13 = this.bz_fld[var7];
						int var9 = this.bm_fld[var7];
						if (var7 != -1151994137) {
							if (as_fld == 256) {
								if (ah_fld != -1) {
									as(this.aj_fld[var7], var2 + this.bd_fld[var7] + 1, var3 + this.br_fld[var7] + 1, var13, var9, ah_fld);
								}

								this.ak(this.aj_fld[var7], var2 + this.bd_fld[var7], var3 + this.br_fld[var7], var13, var9, ay_fld);
							} else {
								if (ah_fld != -1) {
									af(this.aj_fld[var7], var2 + this.bd_fld[var7] + 1, var3 + this.br_fld[var7] + 1, var13, var9, ah_fld, as_fld);
								}

								this.ae(this.aj_fld[var7], var2 + this.bd_fld[var7], var3 + this.br_fld[var7], var13, var9, ay_fld, as_fld);
							}
						} else if (ar_fld > 0) {
							ad_fld = ad_fld + ar_fld;
							var2 += ad_fld >> 8;
							ad_fld &= 255;
						}

						int var10 = this.be_fld[var7];
						if (az_fld != -1) {
							ew(var2, var3 + (int)(this.ap_fld * 0.7), var10, az_fld);
						}

						if (av_fld != -1) {
							ew(var2, var3 + this.ap_fld + 1, var10, av_fld);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BIIIIII)V"
	)
	abstract void ag(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("getBaseline")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getBaseline")
	@Override
	public int getBaseline() {
		return this.ap_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([[B[[B[I[I[III)I"
	)
	static int bo(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([[B[[B[I[I[III)I"
	)
	static int bp(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String bt(String var0) {
		int var1 = var0.length();
		byte var2 = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; var7++) {
			char var5 = var0.charAt(var7);
			if (var5 == '<') {
				var6.append("<lt>");
			} else if (var5 == '>') {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void mf(String var1, int var2, int var3, int var4, int var5) {
		uz(this, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII)V"
	)
	public void bh(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			on(this, var4, var5);
			ao_fld.setSeed(var6);
			as_fld = 192 + (ao_fld.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); var9++) {
				var7[var9] = var8;
				if ((ao_fld.nextInt() & 3) == 0) {
					var8++;
				}
			}

			this.bx(var1, var2, var3, null, var7, null);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void cf(byte[] var1) {
		this.be_fld = new int[-352745447];
		if (var1.length == 257) {
			for (int var2 = 0; var2 < this.be_fld.length; var2++) {
				this.be_fld[var2] = var1[var2] & 255;
			}

			this.ap_fld = var1[256] & 1015429464;
		} else {
			int var10 = 0;

			for (int var3 = 0; var3 < 1667666802; var3++) {
				this.be_fld[var3] = var1[var10++] & 84689809;
			}

			int[] var11 = new int[256];
			int[] var4 = new int[-1201667381];

			for (int var5 = 0; var5 < 256; var5++) {
				var11[var5] = var1[var10++] & 255;
			}

			for (int var12 = 0; var12 < 399840842; var12++) {
				var4[var12] = var1[var10++] & 255;
			}

			byte[][] var13 = new byte[256][];

			for (int var6 = 0; var6 < -1298534268; var6++) {
				var13[var6] = new byte[var11[var6]];
				byte var7 = 0;

				for (int var8 = 0; var8 < var13[var6].length; var8++) {
					var7 += var1[var10++];
					var13[var6][var8] = var7;
				}
			}

			byte[][] var14 = new byte[256][];

			for (int var15 = 0; var15 < -470642996; var15++) {
				var14[var15] = new byte[var11[var15]];
				byte var17 = 0;

				for (int var9 = 0; var9 < var14[var15].length; var9++) {
					var17 += var1[var10++];
					var14[var15][var9] = var17;
				}
			}

			this.bs_fld = new byte[1414467238];

			for (int var16 = 0; var16 < 256; var16++) {
				if (var16 != -217677869 && var16 != -1443723126) {
					for (int var18 = 0; var18 < 256; var18++) {
						if (var18 != 638469992 && var18 != -673729472) {
							this.bs_fld[(var16 << 8) + var18] = (byte)aw(var13, var14, var4, this.be_fld, var11, var16, var18);
						}
					}
				}
			}

			this.ap_fld = var4[1386382406] + var11[32];
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([I[BIIIIIII)V"
	)
	static void bn(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}
			}

			for (int var19 = var5; var19 < 0; var19++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lbw;)Z"
	)
	public static boolean hi(bw var0) {
		return var0.ag_fld.isDone();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([BIIIIII)V"
	)
	static void bc(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * au_fld;
		int var8 = au_fld - var3;
		int var9 = 0;
		int var10 = 0;
		if (var2 < aa_fld) {
			int var11 = aa_fld - var2;
			var4 -= var11;
			var2 = aa_fld;
			var10 += var11 * var3;
			var7 += var11 * au_fld;
		}

		if (var2 + var4 > ai_fld) {
			var4 -= var2 + var4 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var3 -= var12;
			var1 = aq_fld;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (var1 + var3 > am_fld) {
			int var13 = var1 + var3 - am_fld;
			var3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (var3 > 0 && var4 > 0) {
			al(al_fld, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([BIIIIII)V"
	)
	static void bw(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * au_fld;
		int var8 = au_fld - var3;
		int var9 = 0;
		int var10 = 0;
		if (var2 < aa_fld) {
			int var11 = aa_fld - var2;
			var4 -= var11;
			var2 = aa_fld;
			var10 += var11 * var3;
			var7 += var11 * au_fld;
		}

		if (var2 + var4 > ai_fld) {
			var4 -= var2 + var4 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var3 -= var12;
			var1 = aq_fld;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (var1 + var3 > am_fld) {
			int var13 = var1 + var3 - am_fld;
			var3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (var3 > 0 && var4 > 0) {
			al(al_fld, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([BIIIIII)V"
	)
	static void ba(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * au_fld;
		int var8 = au_fld - var3;
		int var9 = 0;
		int var10 = 0;
		if (var2 < aa_fld) {
			int var11 = aa_fld - var2;
			var4 -= var11;
			var2 = aa_fld;
			var10 += var11 * var3;
			var7 += var11 * au_fld;
		}

		if (var2 + var4 > ai_fld) {
			var4 -= var2 + var4 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var3 -= var12;
			var1 = aq_fld;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (var1 + var3 > am_fld) {
			int var13 = var1 + var3 - am_fld;
			var3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (var3 > 0 && var4 > 0) {
			al(al_fld, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "(Lzv;[II)[I"
	)
	public static int[] tc(zv var0, int[] var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / var2;

			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = var1[(int)(var5 * var4)];
			}

			return var3;
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Lzv;IIII)V"
	)
	public static void nu(zv var0, int var1, int var2, int var3, int var4) {
		var3 -= var0.ap_fld;
		int var5 = var1 & 0xFF;
		if (var5 != 32) {
			var0.ak(var0.aj_fld[var5], var2 + var0.bd_fld[var5], var3 + var0.br_fld[var5], var0.bz_fld[var5], var0.bm_fld[var5], var4);
		}
	}

	zv(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var6) {
		this.bd_fld = var2;
		this.br_fld = var3;
		this.bz_fld = var4;
		this.bm_fld = var5;
		this.au(var1);
		this.aj_fld = var6;
		int var7 = Integer.MAX_VALUE;
		int var8 = Integer.MIN_VALUE;

		for (int var9 = 0; var9 < 256; var9++) {
			if (this.br_fld[var9] < var7 && this.bm_fld[var9] != 0) {
				var7 = this.br_fld[var9];
			}

			if (this.br_fld[var9] + this.bm_fld[var9] > var8) {
				var8 = this.br_fld[var9] + this.bm_fld[var9];
			}
		}

		this.at_fld = this.ap_fld - var7;
		this.ac_fld = var8 - this.ap_fld;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([I[BIIIIIIII)V"
	)
	static void bb(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 2031173428) * var9 & -381889281) + ((var2 & 0xFF00) * var9 & 0xFF0000) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = -var5; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & -1886411672) * var9 & -16711936) + ((var12 & 0xFF00) * var9 & 0xFF0000) >> 8) + var2;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIIII[I)V"
	)
	public void bz(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.hy(var8, var1.length());
			}

			double var10 = 7.0 - var7 / 8.0;
			if (var10 < 0.0) {
				var10 = 0.0;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); var13++) {
				var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var9, null, var12);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BIIIIII)V"
	)
	abstract void ah(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void cy(byte[] var1) {
		this.be_fld = new int[256];
		if (var1.length == 257) {
			for (int var2 = 0; var2 < this.be_fld.length; var2++) {
				this.be_fld[var2] = var1[var2] & 255;
			}

			this.ap_fld = var1[256] & 255;
		} else {
			int var10 = 0;

			for (int var3 = 0; var3 < 256; var3++) {
				this.be_fld[var3] = var1[var10++] & 255;
			}

			int[] var11 = new int[256];
			int[] var4 = new int[256];

			for (int var5 = 0; var5 < 256; var5++) {
				var11[var5] = var1[var10++] & 255;
			}

			for (int var12 = 0; var12 < 256; var12++) {
				var4[var12] = var1[var10++] & 255;
			}

			byte[][] var13 = new byte[256][];

			for (int var6 = 0; var6 < 256; var6++) {
				var13[var6] = new byte[var11[var6]];
				byte var7 = 0;

				for (int var8 = 0; var8 < var13[var6].length; var8++) {
					var7 += var1[var10++];
					var13[var6][var8] = var7;
				}
			}

			byte[][] var14 = new byte[256][];

			for (int var15 = 0; var15 < 256; var15++) {
				var14[var15] = new byte[var11[var15]];
				byte var17 = 0;

				for (int var9 = 0; var9 < var14[var15].length; var9++) {
					var17 += var1[var10++];
					var14[var15][var9] = var17;
				}
			}

			this.bs_fld = new byte[65536];

			for (int var16 = 0; var16 < 256; var16++) {
				if (var16 != 32 && var16 != 160) {
					for (int var18 = 0; var18 < 256; var18++) {
						if (var18 != 32 && var18 != 160) {
							this.bs_fld[(var16 << 8) + var18] = (byte)aw(var13, var14, var4, this.be_fld, var11, var16, var18);
						}
					}
				}
			}

			this.ap_fld = var4[32] + var11[32];
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIII[I)V"
	)
	public static void nh(zv var0, String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			on(var0, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = var0.hy(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); var11++) {
				var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
				var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
			}

			var0.bx(var1, var2 - var0.an(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfuscatedName("zq")
	@ObfuscatedSignature(
		descriptor = "(Lzv;[B)V"
	)
	public static void zq(zv var0, byte[] var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.be_fld = new int[256];
		if (var1.length == 257) {
			for (int var2 = 0; var2 < var0.be_fld.length; var2++) {
				var0.be_fld[var2] = var1[var2] & 255;
			}

			var0.ap_fld = var1[256] & 255;
		} else {
			int var10 = 0;

			for (int var3 = 0; var3 < 256; var3++) {
				var0.be_fld[var3] = var1[var10++] & 255;
			}

			int[] var11 = new int[256];
			int[] var4 = new int[256];

			for (int var5 = 0; var5 < 256; var5++) {
				var11[var5] = var1[var10++] & 255;
			}

			for (int var12 = 0; var12 < 256; var12++) {
				var4[var12] = var1[var10++] & 255;
			}

			byte[][] var13 = new byte[256][];

			for (int var6 = 0; var6 < 256; var6++) {
				var13[var6] = new byte[var11[var6]];
				byte var7 = 0;

				for (int var8 = 0; var8 < var13[var6].length; var8++) {
					var7 += var1[var10++];
					var13[var6][var8] = var7;
				}
			}

			byte[][] var14 = new byte[256][];

			for (int var15 = 0; var15 < 256; var15++) {
				var14[var15] = new byte[var11[var15]];
				byte var17 = 0;

				for (int var9 = 0; var9 < var14[var15].length; var9++) {
					var17 += var1[var10++];
					var14[var15][var9] = var17;
				}
			}

			var0.bs_fld = new byte[65536];

			for (int var16 = 0; var16 < 256; var16++) {
				if (var16 != 32 && var16 != 160) {
					for (int var18 = 0; var18 < 256; var18++) {
						if (var18 != 32 && var18 != 160) {
							var0.bs_fld[(var16 << 8) + var18] = (byte)aw(var13, var14, var4, var0.be_fld, var11, var16, var18);
						}
					}
				}
			}

			var0.ap_fld = var4[32] + var11[32];
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void cx(byte[] var1) {
		this.be_fld = new int[1310274788];
		if (var1.length == 257) {
			for (int var2 = 0; var2 < this.be_fld.length; var2++) {
				this.be_fld[var2] = var1[var2] & 255;
			}

			this.ap_fld = var1[-1131645014] & 255;
		} else {
			int var10 = 0;

			for (int var3 = 0; var3 < 256; var3++) {
				this.be_fld[var3] = var1[var10++] & -874923861;
			}

			int[] var11 = new int[256];
			int[] var4 = new int[1485891532];

			for (int var5 = 0; var5 < 256; var5++) {
				var11[var5] = var1[var10++] & 255;
			}

			for (int var12 = 0; var12 < 256; var12++) {
				var4[var12] = var1[var10++] & 1436817991;
			}

			byte[][] var13 = new byte[-561254377][];

			for (int var6 = 0; var6 < 256; var6++) {
				var13[var6] = new byte[var11[var6]];
				byte var7 = 0;

				for (int var8 = 0; var8 < var13[var6].length; var8++) {
					var7 += var1[var10++];
					var13[var6][var8] = var7;
				}
			}

			byte[][] var14 = new byte[256][];

			for (int var15 = 0; var15 < 256; var15++) {
				var14[var15] = new byte[var11[var15]];
				byte var17 = 0;

				for (int var9 = 0; var9 < var14[var15].length; var9++) {
					var17 += var1[var10++];
					var14[var15][var9] = var17;
				}
			}

			this.bs_fld = new byte[2112814492];

			for (int var16 = 0; var16 < -386234978; var16++) {
				if (var16 != 403512867 && var16 != -1625717360) {
					for (int var18 = 0; var18 < -715398624; var18++) {
						if (var18 != -1380748088 && var18 != 965356681) {
							this.bs_fld[(var16 << 8) + var18] = (byte)aw(var13, var14, var4, this.be_fld, var11, var16, var18);
						}
					}
				}
			}

			this.ap_fld = var4[32] + var11[32];
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int cs(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.be_fld[vj.ak(var1) & -1560132440];
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII)V"
	)
	public void iv(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			on(this, var4, var5);
			ao_fld.setSeed(var6);
			as_fld = 192 + (ao_fld.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); var9++) {
				var7[var9] = var8;
				if ((ao_fld.nextInt() & 3) == 0) {
					var8++;
				}
			}

			this.bx(var1, var2, var3, null, var7, null);
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lzv;IIII)V"
	)
	public static void ig(zv var0, int var1, int var2, int var3, int var4) {
		var3 -= var0.ap_fld;
		int var5 = var1 & -1336993713;
		if (var5 != 818156031) {
			var0.ak(var0.aj_fld[var5], var2 + var0.bd_fld[var5], var3 + var0.br_fld[var5], var0.bz_fld[var5], var0.bm_fld[var5], var4);
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int cp(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.be_fld[vj.ak(var1) & 0xFF];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void au(byte[] var1) {
		this.be_fld = new int[256];
		if (var1.length == 257) {
			for (int var2 = 0; var2 < this.be_fld.length; var2++) {
				this.be_fld[var2] = var1[var2] & 255;
			}

			this.ap_fld = var1[256] & 255;
		} else {
			int var10 = 0;

			for (int var3 = 0; var3 < 256; var3++) {
				this.be_fld[var3] = var1[var10++] & 255;
			}

			int[] var11 = new int[256];
			int[] var4 = new int[256];

			for (int var5 = 0; var5 < 256; var5++) {
				var11[var5] = var1[var10++] & 255;
			}

			for (int var12 = 0; var12 < 256; var12++) {
				var4[var12] = var1[var10++] & 255;
			}

			byte[][] var13 = new byte[256][];

			for (int var6 = 0; var6 < 256; var6++) {
				var13[var6] = new byte[var11[var6]];
				byte var7 = 0;

				for (int var8 = 0; var8 < var13[var6].length; var8++) {
					var7 += var1[var10++];
					var13[var6][var8] = var7;
				}
			}

			byte[][] var14 = new byte[256][];

			for (int var15 = 0; var15 < 256; var15++) {
				var14[var15] = new byte[var11[var15]];
				byte var17 = 0;

				for (int var9 = 0; var9 < var14[var15].length; var9++) {
					var17 += var1[var10++];
					var14[var15][var9] = var17;
				}
			}

			this.bs_fld = new byte[65536];

			for (int var16 = 0; var16 < 256; var16++) {
				if (var16 != 32 && var16 != 160) {
					for (int var18 = 0; var18 < 256; var18++) {
						if (var18 != 32 && var18 != 160) {
							this.bs_fld[(var16 << 8) + var18] = (byte)aw(var13, var14, var4, this.be_fld, var11, var16, var18);
						}
					}
				}
			}

			this.ap_fld = var4[32] + var11[32];
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I"
	)
	public int ca(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			int var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; var14++) {
				char var15 = var1.charAt(var14);
				if (var15 == 1800433302) {
					var10 = var14;
				} else {
					if (var15 == 1607619968 && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append((char)-2133396905);
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12++] = var6.substring(var5);
							var6.setLength(0);
							var5 = 0;
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += ma.ax(this, '<');
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << 8) + -389328430];
							}

							var11 = 1062419716;
						} else if (var16.equals("gt")) {
							var4 += ma.ax(this, '>');
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << 8) + 1940162179];
							}

							var11 = 62;
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = tf.av(var16.substring(4));
								var4 += ag_fld[var17].aw_fld;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += ma.ax(this, var15);
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << 8) + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12++] = var6.substring(var5, var7 - var9);
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			if (var6.length() > var5) {
				var3[var12++] = var6.substring(var5);
			}

			return var12;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I"
	)
	public int cn(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; var14++) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12++] = var6.substring(var5);
							var6.setLength(0);
							var5 = 0;
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += ma.ax(this, '<');
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += ma.ax(this, '>');
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = tf.av(var16.substring(4));
								var4 += ag_fld[var17].aw_fld;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += ma.ax(this, var15);
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12++] = var6.substring(var5, var7 - var9);
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			if (var6.length() > var5) {
				var3[var12++] = var6.substring(var5);
			}

			return var12;
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int cg(String var1, int var2) {
		int var3 = sh(this, var1, new int[]{var2}, ab_fld);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.an(ab_fld[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int cw(String var1, int var2) {
		int var3 = sh(this, var1, new int[]{var2}, ab_fld);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.an(ab_fld[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIIIIII)V"
	)
	static void bq(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * au_fld;
		int var8 = au_fld - var3;
		int var9 = 0;
		int var10 = 0;
		if (var2 < aa_fld) {
			int var11 = aa_fld - var2;
			var4 -= var11;
			var2 = aa_fld;
			var10 += var11 * var3;
			var7 += var11 * au_fld;
		}

		if (var2 + var4 > ai_fld) {
			var4 -= var2 + var4 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var3 -= var12;
			var1 = aq_fld;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (var1 + var3 > am_fld) {
			int var13 = var1 + var3 - am_fld;
			var3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (var3 > 0 && var4 > 0) {
			al(al_fld, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int kw(char var1) {
		return ma.ax(this, var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)Luf;"
	)
	public uf am(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.an(var3) / 2;
			var6 += this.an(var3.substring(0, var1));
			int var7 = var5 - this.at_fld;
			int var8 = this.an(var3.substring(var1, var1 + var2));
			int var9 = this.at_fld + this.ac_fld;
			return new uf(var6, var7, var8, var9);
		} else {
			return new uf(var4, var5, 0, 0);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIII)V"
	)
	public static void aa(zv var0, String var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		} else if (var1 != null) {
			on(var0, var4, var5);
			var0.bl(var1, var2 - var0.an(var1), var3);
		}
	}

	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIII[I)V"
	)
	public static void tk(zv var0, String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			on(var0, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = var0.hy(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); var10++) {
				var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
			}

			var0.bx(var1, var2 - var0.an(var1) / 2, var3, var8, null, var9);
		}
	}

	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "(Lzv;IILjava/lang/String;II)Luf;"
	)
	public static uf sf(zv var0, int var1, int var2, String var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - var0.an(var3) / 2;
			var6 += var0.an(var3.substring(0, var1));
			int var7 = var5 - var0.at_fld;
			int var8 = var0.an(var3.substring(var1, var1 + var2));
			int var9 = var0.at_fld + var0.ac_fld;
			return new uf(var6, var7, var8, var9);
		} else {
			return new uf(var4, var5, 0, 0);
		}
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "(Lzv;IILjava/lang/String;II)Luf;"
	)
	public static uf qj(zv var0, int var1, int var2, String var3, int var4, int var5) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - var0.an(var3) / 2;
			var6 += var0.an(var3.substring(0, var1));
			int var7 = var5 - var0.at_fld;
			int var8 = var0.an(var3.substring(var1, var1 + var2));
			int var9 = var0.at_fld + var0.ac_fld;
			return new uf(var6, var7, var8, var9);
		} else {
			return new uf(var4, var5, 0, 0);
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void ci(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			on(this, var4, var5);
			this.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void cj(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			on(this, var4, var5);
			this.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void ch(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			on(this, var4, var5);
			this.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII)V"
	)
	public void dc(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			on(this, var4, var5);
			as_fld = var6;
			this.bl(var1, var2, var3);
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII)V"
	)
	public void iz(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			on(this, var4, var5);
			ao_fld.setSeed(var6);
			as_fld = 192 + (ao_fld.nextInt() & 1180095991);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); var9++) {
				var7[var9] = var8;
				if ((ao_fld.nextInt() & 3) == 0) {
					var8++;
				}
			}

			this.bx(var1, var2, var3, null, var7, null);
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void dv(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			on(this, var4, var5);
			this.bl(var1, var2 - this.an(var1), var3);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String bv(String var0) {
		int var1 = var0.length();
		byte var2 = 0;

		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == 398068800) {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; var7++) {
			char var5 = var0.charAt(var7);
			if (var5 == -888185460) {
				var6.append("<lt>");
			} else if (var5 == -1179718327) {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int cb(String var1, int var2) {
		return sh(this, var1, new int[]{var2}, ab_fld);
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIIII[I)V"
	)
	public void dx(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.hy(var8, var1.length());
			}

			double var10 = 7.0 - var7 / 8.0;
			if (var10 < 0.0) {
				var10 = 0.0;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); var13++) {
				var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var9, null, var12);
		}
	}

	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "(Lzv;[II)[I"
	)
	public static int[] su(zv var0, int[] var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / var2;

			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = var1[(int)(var5 * var4)];
			}

			return var3;
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII[I)V"
	)
	public void do_(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.hy(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); var10++) {
				var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var8, null, var9);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([I[BIIIIIIII)V"
	)
	static void cd(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 0xFF00) * var9 & 0xFF0000) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = -var5; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 0xFF00) * var9 & 0xFF0000) >> 8) + var2;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII[I)V"
	)
	public void da(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.hy(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); var11++) {
				var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
				var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;[I[Ljava/lang/String;)I"
	)
	public static int sh(zv var0, String var1, int[] var2, String[] var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			int var6 = -1;
			int var7 = 0;
			byte var8 = 0;
			int var9 = -1;
			char var10 = 0;
			int var11 = 0;
			int var12 = var1.length();
			zo_fld.setLength(0);

			for (int var13 = 0; var13 < var12; var13++) {
				char var14 = var1.charAt(var13);
				if (var14 == '<') {
					var9 = var13;
				} else {
					if (var14 == '>' && var9 != -1) {
						String var15 = var1.substring(var9 + 1, var13);
						var9 = -1;
						zo_fld.append('<');
						zo_fld.append(var15);
						zo_fld.append('>');
						if (var15.equals("br")) {
							var3[var11++] = zo_fld.substring(var5);
							zo_fld.setLength(0);
							var5 = 0;
							var4 = 0;
							var6 = -1;
							var10 = 0;
						} else if (var15.equals("lt")) {
							var4 += var0.kw('<');
							if (var0.bs_fld != null && var10 != -1) {
								var4 += var0.bs_fld[(var10 << '\b') + 60];
							}

							var10 = '<';
						} else if (var15.equals("gt")) {
							var4 += var0.kw('>');
							if (var0.bs_fld != null && var10 != -1) {
								var4 += var0.bs_fld[(var10 << '\b') + 62];
							}

							var10 = '>';
						} else if (var15.startsWith("img=")) {
							try {
								yc[] var16 = og.ci_fld.getModIcons();
								int var17 = Integer.parseInt(var15.substring(4));
								var4 += var16[var17].getOriginalWidth();
								var10 = 0;
							} catch (Exception var18) {
							}
						}

						var14 = 0;
					}

					if (var9 == -1) {
						if (var14 != 0) {
							zo_fld.append(var14);
							var4 += var0.kw(var14);
							if (var0.bs_fld != null && var10 != -1) {
								var4 += var0.bs_fld[var14 + (var10 << '\b')];
							}

							var10 = var14;
						}

						if (var14 == ' ') {
							var6 = zo_fld.length();
							var7 = var4;
							var8 = 1;
						}

						if (var2 != null && var4 > var2[var11 < var2.length ? var11 : var2.length - 1] && var6 >= 0) {
							var3[var11++] = zo_fld.substring(var5, var6 - var8);
							var5 = var6;
							var6 = -1;
							var4 -= var7;
							var10 = 0;
						}

						if (var14 == '-') {
							var6 = zo_fld.length();
							var7 = var4;
							var8 = 0;
						}
					}
				}
			}

			if (zo_fld.length() > var5) {
				var3[var11++] = zo_fld.substring(var5);
			}

			return var11;
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIIII[I)V"
	)
	public void ds(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.hy(var8, var1.length());
			}

			double var10 = 7.0 - var7 / 8.0;
			if (var10 < 0.0) {
				var10 = 0.0;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); var13++) {
				var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var9, null, var12);
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII[I)V"
	)
	public void hx(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.hy(var6, var1.length());
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var7, null, null);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII[I)V"
	)
	public void be(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.hy(var6, var1.length());
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var7, null, null);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII[I)V"
	)
	public void bd(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.hy(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); var11++) {
				var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
				var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([II)[I"
	)
	int[] bs(int[] var1, int var2) {
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / var2;

			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = var1[(int)(var5 * var4)];
			}

			return var3;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void ab(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			on(this, var4, var5);
			this.bl(var1, var2 - this.an(var1), var3);
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII)V"
	)
	public void ie(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			on(this, var4, var5);
			ao_fld.setSeed(var6);
			as_fld = 192 + (ao_fld.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); var9++) {
				var7[var9] = var8;
				if ((ao_fld.nextInt() & 3) == 0) {
					var8++;
				}
			}

			this.bx(var1, var2, var3, null, var7, null);
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lzr;IIIII)Lve;"
	)
	public ve dm(zr var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.az()) {
			on(this, var4, var5);
			var3 -= this.ap_fld;

			for (int var7 = 0; var7 < var1.av(); var7++) {
				zj var8 = var1.ay(var7);
				if (var6 != -1 && var8.ag_fld > var6) {
					return new ve(var8.az_fld * -2094756679, var8.ag_fld);
				}

				int var9 = var8.ak_fld;
				if (var9 != 10) {
					if (zr.wg(var1, var7)) {
						var9 = 1001295993;
					}

					if (var9 != 9) {
						if (var9 == 160) {
							var9 = -1541253870;
						}

						int var10 = var2 + var8.az_fld;
						int var11 = var3 + var8.ag_fld;
						int var12 = this.bz_fld[var9];
						int var13 = this.bm_fld[var9];
						if (ah_fld != -1) {
							this.ak(this.aj_fld[var9], var10 + this.bd_fld[var9] + 1, var11 + this.br_fld[var9] + 1, var12, var13, ah_fld);
						}

						this.ak(this.aj_fld[var9], var10 + this.bd_fld[var9], var11 + this.br_fld[var9], var12, var13, ay_fld);
					}
				}
			}
		}

		return var1.aw();
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void im(int var1, int var2, int var3, int var4) {
		var3 -= this.ap_fld;
		int var5 = var1 & -1513122762;
		if (var5 != 32) {
			this.ak(this.aj_fld[var5], var2 + this.bd_fld[var5], var3 + this.br_fld[var5], this.bz_fld[var5], this.bm_fld[var5], var4);
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII[I)V"
	)
	public void ht(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.hy(var6, var1.length());
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var7, null, null);
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ip(int var1, int var2, int var3, int var4) {
		var3 -= this.ap_fld;
		int var5 = var1 & 0xFF;
		if (var5 != 148250503) {
			this.ak(this.aj_fld[var5], var2 + this.bd_fld[var5], var3 + this.br_fld[var5], this.bz_fld[var5], this.bm_fld[var5], var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIIIIIIII)I"
	)
	public int ac(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			on(this, var6, var7);
			as_fld = var8;
			if (var11 == 0) {
				var11 = this.ap_fld;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.at_fld + this.ac_fld + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = sh(this, var1, var12, ab_fld);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			if (var10 == 0) {
				var14 = var3 + this.at_fld;
			} else if (var10 == 1) {
				var14 = var3 + this.at_fld + (var5 - this.at_fld - this.ac_fld - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.ac_fld - (var13 - 1) * var11;
			} else {
				int var15 = (var5 - this.at_fld - this.ac_fld - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + this.at_fld + var15;
				var11 += var15;
			}

			for (int var16 = 0; var16 < var13; var16++) {
				if (var9 == 0) {
					this.bl(ab_fld[var16], var2, var14);
				} else if (var9 == 1) {
					this.bl(ab_fld[var16], var2 + (var4 - this.an(ab_fld[var16])) / 2, var14);
				} else if (var9 == 2) {
					this.bl(ab_fld[var16], var2 + var4 - this.an(ab_fld[var16]), var14);
				} else if (var16 == var13 - 1) {
					this.bl(ab_fld[var16], var2, var14);
				} else {
					this.by(ab_fld[var16], var4);
					this.bl(ab_fld[var16], var2, var14);
					ar_fld = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ia(int var1, int var2, int var3, int var4) {
		var3 -= this.ap_fld;
		int var5 = var1 & 0xFF;
		if (var5 != 32) {
			this.ak(this.aj_fld[var5], var2 + this.bd_fld[var5], var3 + this.br_fld[var5], this.bz_fld[var5], this.bm_fld[var5], var4);
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void iq(int var1, int var2) {
		az_fld = -1;
		av_fld = -1;
		ae_fld = var2;
		ah_fld = var2;
		aw_fld = var1;
		ay_fld = var1;
		as_fld = 256;
		ar_fld = 0;
		ad_fld = 0;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([BIIIII)V"
	)
	static void bi(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * au_fld;
		int var7 = au_fld - var3;
		int var8 = 0;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var4 -= var10;
			var2 = aa_fld;
			var9 += var10 * var3;
			var6 += var10 * au_fld;
		}

		if (var2 + var4 > ai_fld) {
			var4 -= var2 + var4 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var11 = aq_fld - var1;
			var3 -= var11;
			var1 = aq_fld;
			var9 += var11;
			var6 += var11;
			var8 += var11;
			var7 += var11;
		}

		if (var1 + var3 > am_fld) {
			int var12 = var1 + var3 - am_fld;
			var3 -= var12;
			var8 += var12;
			var7 += var12;
		}

		if (var3 > 0 && var4 > 0) {
			ar(al_fld, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void in(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); var5++) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				var3++;
			}
		}

		if (var3 > 0) {
			ar_fld = (var2 - this.an(var1) << 8) / var3;
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void io(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); var5++) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				var3++;
			}
		}

		if (var3 > 0) {
			ar_fld = (var2 - this.an(var1) << 8) / var3;
		}
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(Lzv;[B)V"
	)
	public static void sm(zv var0, byte[] var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.be_fld = new int[1160097357];
		if (var1.length == -1633994384) {
			for (int var2 = 0; var2 < var0.be_fld.length; var2++) {
				var0.be_fld[var2] = var1[var2] & 255;
			}

			var0.ap_fld = var1[256] & 255;
		} else {
			int var10 = 0;

			for (int var3 = 0; var3 < 256; var3++) {
				var0.be_fld[var3] = var1[var10++] & 255;
			}

			int[] var11 = new int[1611399955];
			int[] var4 = new int[256];

			for (int var5 = 0; var5 < 256; var5++) {
				var11[var5] = var1[var10++] & 664640737;
			}

			for (int var12 = 0; var12 < -1264189910; var12++) {
				var4[var12] = var1[var10++] & 255;
			}

			byte[][] var13 = new byte[256][];

			for (int var6 = 0; var6 < 1895592768; var6++) {
				var13[var6] = new byte[var11[var6]];
				byte var7 = 0;

				for (int var8 = 0; var8 < var13[var6].length; var8++) {
					var7 += var1[var10++];
					var13[var6][var8] = var7;
				}
			}

			byte[][] var14 = new byte[256][];

			for (int var15 = 0; var15 < -579113278; var15++) {
				var14[var15] = new byte[var11[var15]];
				byte var17 = 0;

				for (int var9 = 0; var9 < var14[var15].length; var9++) {
					var17 += var1[var10++];
					var14[var15][var9] = var17;
				}
			}

			var0.bs_fld = new byte[65536];

			for (int var16 = 0; var16 < -445468459; var16++) {
				if (var16 != 32 && var16 != 160) {
					for (int var18 = 0; var18 < 256; var18++) {
						if (var18 != 2027847824 && var18 != -1943129219) {
							var0.bs_fld[(var16 << 8) + var18] = (byte)aw(var13, var14, var4, var0.be_fld, var11, var16, var18);
						}
					}
				}
			}

			var0.ap_fld = var4[1176575265] + var11[32];
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII[I)V"
	)
	public void br(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.hy(var6, var1.length());
			}

			this.bx(var1, var2, var3, var7, null, null);
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V"
	)
	void ij(String var1, int var2, int var3) {
		var3 -= this.ap_fld;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				int var7 = (char)(vj.ak(var1.charAt(var6)) & 1603148933);
				if (var7 == 60) {
					var4 = var6;
				} else {
					if (var7 == 62 && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = 60;
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										int var14 = tf.av(var8.substring(4));
										yc var15 = ag_fld[var14];
										var15.ae(var2, var3 + this.ap_fld - var15.ay_fld);
										var2 += var15.aw_fld;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.iy(var8);
								}
								continue;
							}

							var7 = -1488342706;
						}
					}

					if (var7 == -1885883287) {
						var7 = 1213074651;
					}

					if (var4 == -1) {
						if (this.bs_fld != null && var5 != -1) {
							var2 += this.bs_fld[(var5 << 8) + var7];
						}

						int var13 = this.bz_fld[var7];
						int var9 = this.bm_fld[var7];
						if (var7 != 32) {
							if (as_fld == 256) {
								if (ah_fld != -1) {
									as(this.aj_fld[var7], var2 + this.bd_fld[var7] + 1, var3 + this.br_fld[var7] + 1, var13, var9, ah_fld);
								}

								this.ak(this.aj_fld[var7], var2 + this.bd_fld[var7], var3 + this.br_fld[var7], var13, var9, ay_fld);
							} else {
								if (ah_fld != -1) {
									af(this.aj_fld[var7], var2 + this.bd_fld[var7] + 1, var3 + this.br_fld[var7] + 1, var13, var9, ah_fld, as_fld);
								}

								this.ae(this.aj_fld[var7], var2 + this.bd_fld[var7], var3 + this.br_fld[var7], var13, var9, ay_fld, as_fld);
							}
						} else if (ar_fld > 0) {
							ad_fld = ad_fld + ar_fld;
							var2 += ad_fld >> 8;
							ad_fld &= 993465666;
						}

						int var10 = this.be_fld[var7];
						if (az_fld != -1) {
							ew(var2, var3 + (int)(this.ap_fld * 0.7), var10, az_fld);
						}

						if (av_fld != -1) {
							ew(var2, var3 + this.ap_fld + 1, var10, av_fld);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}
	}

	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;I)I"
	)
	public static int sm(zv var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = sh(var0, var1, new int[]{var2}, ab_fld);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = var0.an(ab_fld[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Lzr;IIIII)Lve;"
	)
	public ve dq(zr var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.az()) {
			on(this, var4, var5);
			var3 -= this.ap_fld;

			for (int var7 = 0; var7 < var1.av(); var7++) {
				zj var8 = var1.ay(var7);
				if (var6 != -1 && var8.ag_fld > var6) {
					return new ve(var8.az_fld, var8.ag_fld);
				}

				char var9 = var8.ak_fld;
				if (var9 != '\n') {
					if (zr.wg(var1, var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.az_fld;
						int var11 = var3 + var8.ag_fld;
						int var12 = this.bz_fld[var9];
						int var13 = this.bm_fld[var9];
						if (ah_fld != -1) {
							this.ak(this.aj_fld[var9], var10 + this.bd_fld[var9] + 1, var11 + this.br_fld[var9] + 1, var12, var13, ah_fld);
						}

						this.ak(this.aj_fld[var9], var10 + this.bd_fld[var9], var11 + this.br_fld[var9], var12, var13, ay_fld);
					}
				}
			}
		}

		return var1.aw();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([I[BIIIIIIII)V"
	)
	static void bg(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & -1808787443) * var9 & -1436624780) + ((var2 & 11334491) * var9 & -1547445859) >> 8;
		var9 = -1405645620 - var9;

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = -var5; var11 < 0; var11++) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & 1897899633) + ((var12 & 0xFF00) * var9 & -1020573529) >> 8) + var2;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("xc")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;I)I"
	)
	public static int xc(zv var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return sh(var0, var1, new int[]{var2}, ab_fld);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I"
	)
	public int cr(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; var14++) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12++] = var6.substring(var5);
							var6.setLength(0);
							var5 = 0;
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += ma.ax(this, '<');
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += ma.ax(this, '>');
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = tf.av(var16.substring(4));
								var4 += ag_fld[var17].aw_fld;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += ma.ax(this, var15);
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12++] = var6.substring(var5, var7 - var9);
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			if (var6.length() > var5) {
				var3[var12++] = var6.substring(var5);
			}

			return var12;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII)V"
	)
	public void ad(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			on(this, var4, var5);
			this.ih(var1, var2 - this.ce(var1), var3);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int aq(String var1, int var2) {
		return sh(this, var1, new int[]{var2}, ab_fld);
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II[I[I[I)V"
	)
	void ix(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.ac_fld;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); var10++) {
			if (var1.charAt(var10) != 0) {
				int var11 = (char)(vj.ak(var1.charAt(var10)) & 1709946539);
				if (var11 == 60) {
					var7 = var10;
				} else {
					if (var11 == -1799658550 && var7 != -1) {
						String var12 = var1.substring(var7 + 1, var10);
						var7 = -1;
						if (var12.equals("lt")) {
							var11 = -1326050259;
						} else {
							if (!var12.equals("gt")) {
								if (var12.startsWith("img=")) {
									try {
										int var21;
										if (var5 != null) {
											var21 = var5[var9];
										} else {
											var21 = 0;
										}

										int var22;
										if (var6 != null) {
											var22 = var6[var9];
										} else {
											var22 = 0;
										}

										var9++;
										int var23 = tf.av(var12.substring(4));
										yc var24 = ag_fld[var23];
										var24.ad(var2 + var21, var3 + this.at_fld - var24.aw_fld + var22);
										var2 += var24.ay_fld;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									this.bf(var12);
								}
								continue;
							}

							var11 = 62;
						}
					}

					if (var11 == 2104159167) {
						var11 = 1546542113;
					}

					if (var7 == -1) {
						if (this.bs_fld != null && var8 != -1) {
							var2 += this.bs_fld[(var8 << 8) + var11];
						}

						int var20 = this.be_fld[var11];
						int var13 = this.bd_fld[var11];
						int var14;
						if (var5 != null) {
							var14 = var5[var9];
						} else {
							var14 = 0;
						}

						int var15;
						if (var6 != null) {
							var15 = var6[var9];
						} else {
							var15 = 0;
						}

						int var16;
						if (var4 != null) {
							var16 = var4[var9];
						} else {
							var16 = av_fld;
						}

						var9++;
						if (var11 != 32) {
							if (az_fld == 256) {
								if (ad_fld != -1) {
									bi(this.aj_fld[var11], var2 + this.bz_fld[var11] + 1 + var14, var3 + this.bm_fld[var11] + 1 + var15, var20, var13, aw_fld);
								}

								this.av(this.aj_fld[var11], var2 + this.bd_fld[var11] + var14, var3 + this.bm_fld[var11] + var15, var20, var13, var16);
							} else {
								if (ae_fld != -1) {
									bq(this.aj_fld[var11], var2 + this.bm_fld[var11] + 1 + var14, var3 + this.bm_fld[var11] + 1 + var15, var20, var13, ay_fld, av_fld);
								}

								this.ae(this.aj_fld[var11], var2 + this.bz_fld[var11] + var14, var3 + this.bz_fld[var11] + var15, var20, var13, var16, av_fld);
							}
						} else if (ay_fld > 0) {
							aw_fld = ad_fld + as_fld;
							var2 += az_fld >> 8;
							az_fld = aw_fld & 0xFF;
						}

						int var17 = this.bd_fld[var11];
						if (ar_fld != -1) {
							yu.dw(var2, var3 + (int)(this.ac_fld * 0.7), var17, az_fld);
						}

						if (av_fld != -1) {
							yu.fa(var2, var3 + this.ac_fld, var17, az_fld);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIII[I)V"
	)
	public static void sd(zv var0, String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			on(var0, var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = var0.hy(var6, var1.length());
			}

			var0.bx(var1, var2, var3, var7, null, null);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII[I)V"
	)
	public void bm(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.bs(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); var10++) {
				var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
			}

			this.ix(var1, var2 - this.getTextWidth(var1) / 2, var3, var8, null, var9);
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIII[I)V"
	)
	public void ha(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.hm(var6, var1.length());
			}

			this.bx(var1, var2, var3, var7, null, null);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bj(int var1, int var2) {
		ae_fld = -1;
		ay_fld = -1;
		ae_fld = var2;
		ar_fld = var2;
		av_fld = var1;
		aw_fld = var1;
		av_fld = 256;
		aw_fld = 0;
		av_fld = 0;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int cm(String var1, int var2) {
		int var3 = sh(this, var1, new int[]{var2}, ab_fld);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.getTextWidth(ab_fld[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int ax(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.be_fld[vj.ak(var1) & 0xFF];
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIII[I)V"
	)
	public void dl(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.bs(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); var11++) {
				var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
				var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
			}

			this.bx(var1, var2 - this.an(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIIIII[I)V"
	)
	public void dk(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			on(this, var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.hy(var8, var1.length());
			}

			double var10 = 7.0 - var7 / 8.0;
			if (var10 < 0.0) {
				var10 = 0.0;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); var13++) {
				var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
			}

			this.ix(var1, var2 - this.ce(var1) / 2, var3, var9, null, var12);
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)Luf;"
	)
	public uf cu(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.ce(var3) / 2;
			var6 += this.ce(var3.substring(0, var1));
			int var7 = var5 - this.ac_fld;
			int var8 = this.getTextWidth(var3.substring(var1, var1 + var2));
			int var9 = this.ap_fld + this.at_fld;
			return new uf(var6, var7, var8, var9);
		} else {
			return new uf(var4, var5, 0, 0);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I"
	)
	public int aa(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; var14++) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12++] = var6.substring(var5);
							var6.setLength(0);
							var5 = 0;
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += ma.ax(this, '<');
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += ma.ax(this, '>');
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = tf.av(var16.substring(4));
								var4 += ag_fld[var17].aw_fld;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += ma.ax(this, var15);
							if (this.bs_fld != null && var11 != -1) {
								var4 += this.bs_fld[(var11 << '\b') + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12++] = var6.substring(var5, var7 - var9);
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			if (var6.length() > var5) {
				var3[var12++] = var6.substring(var5);
			}

			return var12;
		}
	}
}
