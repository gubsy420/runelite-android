import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.api.SpritePixels;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yv")
@Implements({"SpritePixels"})
public class yv extends yu implements SpritePixels {
	@ObfuscatedGetter(
		intValue = -1675457065
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ay_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = -394054361
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int as_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ah_fld;
	@ObfuscatedGetter(
		intValue = -394054361
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = 1809103893
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ad_fld;
	@ObfuscatedGetter(
		intValue = -1548281861
	)
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ao_fld;

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cm() {
		du(this.ah_fld, this.aw_fld, this.ay_fld, null);
	}

	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv rd() {
		return this.al();
	}

	public yv(int var1, int var2) {
		this(new int[var1 * var2], var1, var2);
	}

	public yv(int[] var1, int var2, int var3) {
		this.ah_fld = var1;
		this.aw_fld = this.ad_fld = var2;
		this.ay_fld = this.ao_fld = var3;
		this.ar_fld = 0;
		this.as_fld = 0;
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII[I[I)V"
	)
	public void oh(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
		this.br(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIII)V"
	)
	static void ak(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; var8++) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++] | 0xFF000000) {
				var0[var3++] = var1[var2++] | 0xFF000000;
				var0[var3++] = var1[var2++] | 0xFF000000;
				var0[var3++] = var1[var2++] | 0xFF000000;
			}

			var9 += 3;

			while (var3 < var9) {
				var0[var3++] = var1[var2++] | 0xFF000000;
			}

			var3 += var6;
			var2 += var7;
		}
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)Lyv;"
	)
	public static yv or(yv var0) {
		yv var1 = new yv(var0.aw_fld, var0.ay_fld);
		var1.ad_fld = var0.ad_fld;
		var1.ao_fld = var0.ao_fld;
		var1.as_fld = var0.as_fld;
		var1.ar_fld = var0.ar_fld;
		int var2 = var0.ah_fld.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1.ah_fld[var3] = var0.ah_fld[var3];
		}

		return var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIII)V"
	)
	static void bu(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var14 = var3;

		for (int var15 = -var8; var15 < 0; var15++) {
			int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; var17++) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var18 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & 0xFF00) * var12 + (var18 & 0xFF00) * var13 & 0xFF0000) >> 8;
				} else {
					var5++;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var14;
			var5 += var6;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIII)V"
	)
	static void az(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; var13++) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; var15++) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					var0[var5++] = var2 | 0xFF000000;
				} else {
					var5++;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIII)V"
	)
	static void av(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & 0xFF00) * var11 & 0xFF0000;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; var14++) {
			for (int var15 = -var5; var15 < 0; var15++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & 0xFF00) * var9 & 0xFF0000;
					var0[var4++] = ((var12 | var13) >>> 8) + var10 | 0xFF000000;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lgn;II)Z"
	)
	public static boolean hf(gn var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 1 && var1 < var0.bx_fld - 5 && var2 >= 1 && var2 < var0.bo_fld - 5;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIII)V"
	)
	static void ae(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; var11++) {
			for (int var12 = -var5; var12 < 0; var12++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					client.vb(
						var0,
						var4++,
						((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & 0xFF00) * var9 + (var13 & 0xFF00) * var10 & 0xFF0000) >> 8,
						var9
					);
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIII)V"
	)
	static void ah(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var14 = var3;

		for (int var15 = -var8; var15 < 0; var15++) {
			int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; var17++) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var18 = var0[var5];
					client.vb(
						var0,
						var5++,
						((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & 0xFF00) * var12 + (var18 & 0xFF00) * var13 & 0xFF0000) >> 8,
						var12
					);
				} else {
					var5++;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var14;
			var5 += var6;
		}
	}

	@ObfuscatedName("setOffsetX")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setOffsetX(int var1) {
		this.as_fld = var1;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	public static void ky(yv var0) {
		if (var0.aw_fld != var0.ad_fld || var0.ay_fld != var0.ao_fld) {
			int[] var1 = new int[var0.ad_fld * var0.ao_fld];

			for (int var2 = 0; var2 < var0.ay_fld; var2++) {
				for (int var3 = 0; var3 < var0.aw_fld; var3++) {
					var1[(var2 + var0.ar_fld) * var0.ad_fld + var3 + var0.as_fld] = var0.ah_fld[var2 * var0.aw_fld + var3];
				}
			}

			var0.ah_fld = var1;
			var0.aw_fld = var0.ad_fld;
			var0.ay_fld = var0.ao_fld;
			var0.as_fld = 0;
			var0.ar_fld = 0;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III[I[IIIIIIIIII)V"
	)
	static void ba(
		int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
	) {
		for (int var22 = -var10; var22 < 0; var22++) {
			for (int var21 = -var9; var21 < 0; var21++) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var13;
					var0 = (var1 & 909117588) + (var0 * var13 - var1 & -418897543) >>> 8;
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & -1429978235) + (var1 & 16711935);
					var1 = (var0 & 570501633) + (var2 - var0 & 778382432);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var7++;
				}
			}

			var7 += var11;
			var5 += var12;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III[I[IIIIIIIIII)V"
	)
	static void ay(
		int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
	) {
		for (int var22 = -var10; var22 < 0; var22++) {
			for (int var21 = -var9; var21 < 0; var21++) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var13;
					var0 = (var1 & -16711936) + (var0 * var13 - var1 & 0xFF0000) >>> 8;
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var7++;
				}
			}

			var7 += var11;
			var5 += var12;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III[I[IIIIIIIIII)V"
	)
	static void bw(
		int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
	) {
		for (int var22 = -var10; var22 < 0; var22++) {
			for (int var21 = -var9; var21 < 0; var21++) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var13;
					var0 = (var1 & -16711936) + (var0 * var13 - var1 & 0xFF0000) >>> 8;
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var7++;
				}
			}

			var7 += var11;
			var5 += var12;
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dv(int var1) {
		for (int var2 = this.ay_fld - 1; var2 > 0; var2--) {
			int var3 = var2 * this.aw_fld;

			for (int var4 = this.aw_fld - 1; var4 > 0; var4--) {
				if (this.ah_fld[var4 + var3] == 0 && this.ah_fld[var4 + var3 - 1 - this.aw_fld] != 0) {
					this.ah_fld[var4 + var3] = var1;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv af() {
		yv var1 = new yv(this.aw_fld, this.ay_fld);
		var1.ad_fld = this.ad_fld;
		var1.ao_fld = this.ao_fld;
		var1.as_fld = this.ad_fld - this.aw_fld - this.as_fld;
		var1.ar_fld = this.ar_fld;

		for (int var2 = 0; var2 < this.ay_fld; var2++) {
			for (int var3 = 0; var3 < this.aw_fld; var3++) {
				var1.ah_fld[var2 * this.aw_fld + var3] = this.ah_fld[var2 * this.aw_fld + this.aw_fld - 1 - var3];
			}
		}

		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv al() {
		yv var1 = new yv(this.aw_fld, this.ay_fld);
		var1.ad_fld = this.ad_fld;
		var1.ao_fld = this.ao_fld;
		var1.as_fld = this.as_fld;
		var1.ar_fld = this.ar_fld;
		int var2 = this.ah_fld.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1.ah_fld[var3] = this.ah_fld[var3];
		}

		return var1;
	}

	@ObfuscatedName("setMaxHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setMaxHeight(int var1) {
		this.ao_fld = var1;
	}

	@ObfuscatedName("zg")
	@ObfuscatedSignature(
		descriptor = "(Lyv;IIII)V"
	)
	public static void zg(yv var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else if (var3 > 0 && var4 > 0) {
			int var5 = var0.aw_fld;
			int var6 = var0.ay_fld;
			int var7 = 0;
			int var8 = 0;
			int var9 = var0.ad_fld;
			int var10 = var0.ao_fld;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			if (var0.as_fld > 0) {
				int var13 = ((var0.as_fld << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (var0.as_fld << 16);
			}

			if (var0.ar_fld > 0) {
				int var16 = ((var0.ar_fld << 16) + var12 - 1) / var12;
				var2 += var16;
				var8 += var16 * var12 - (var0.ar_fld << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			int var17 = var1 + var2 * au_fld;
			int var14 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var15 = aa_fld - var2;
				var4 -= var15;
				var17 += var15 * au_fld;
				var8 += var12 * var15;
			}

			if (var1 + var3 > am_fld) {
				int var18 = var1 + var3 - am_fld;
				var3 -= var18;
				var14 += var18;
			}

			if (var1 < aq_fld) {
				int var19 = aq_fld - var1;
				var3 -= var19;
				var17 += var19;
				var7 += var11 * var19;
				var14 += var19;
			}

			az(al_fld, var0.ah_fld, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
		}
	}

	@ObfuscatedName("getMaxHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMaxHeight() {
		return this.ao_fld;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv cn() {
		yv var1 = new yv(this.ad_fld, this.ao_fld);

		for (int var2 = 0; var2 < this.ay_fld; var2++) {
			for (int var3 = 0; var3 < this.aw_fld; var3++) {
				var1.ah_fld[(var2 + this.ar_fld) * this.ad_fld + var3 + this.as_fld] = this.ah_fld[var2 * this.aw_fld + var3];
			}
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void aa(int var1) {
		if (this.aw_fld != this.ad_fld || this.ay_fld != this.ao_fld) {
			int var2 = var1;
			if (var1 > this.as_fld) {
				var2 = this.as_fld;
			}

			int var3 = var1;
			if (var1 + this.as_fld + this.aw_fld > this.ad_fld) {
				var3 = this.ad_fld - this.as_fld - this.aw_fld;
			}

			int var4 = var1;
			if (var1 > this.ar_fld) {
				var4 = this.ar_fld;
			}

			int var5 = var1;
			if (var1 + this.ar_fld + this.ay_fld > this.ao_fld) {
				var5 = this.ao_fld - this.ar_fld - this.ay_fld;
			}

			int var6 = this.aw_fld + var2 + var3;
			int var7 = this.ay_fld + var4 + var5;
			int[] var8 = new int[var6 * var7];

			for (int var9 = 0; var9 < this.ay_fld; var9++) {
				for (int var10 = 0; var10 < this.aw_fld; var10++) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.ah_fld[var9 * this.aw_fld + var10];
				}
			}

			this.ah_fld = var8;
			this.aw_fld = var6;
			this.ay_fld = var7;
			this.as_fld -= var2;
			this.ar_fld -= var4;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIII)V"
	)
	static void bf(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}
			}

			for (int var24 = var5; var24 < 0; var24++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)Lyv;"
	)
	public static yv wo(yv var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			yv var1 = new yv(var0.ad_fld, var0.ao_fld);

			for (int var2 = 0; var2 < var0.ay_fld; var2++) {
				for (int var3 = 0; var3 < var0.aw_fld; var3++) {
					var1.ah_fld[(var2 + var0.ar_fld) * var0.ad_fld + var3 + var0.as_fld] = var0.ah_fld[var2 * var0.aw_fld + var3];
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void hu(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.aw_fld;
			int var7 = this.ay_fld;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.ad_fld;
			int var11 = this.ao_fld;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			if (this.as_fld > 0) {
				int var14 = ((this.as_fld << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var17 = ((this.ar_fld << 16) + var13 - 1) / var13;
				var2 += var17;
				var9 += var17 * var13 - (this.ar_fld << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			int var18 = var1 + var2 * au_fld;
			int var15 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var16 = aa_fld - var2;
				var4 -= var16;
				var18 += var16 * au_fld;
				var9 += var13 * var16;
			}

			if (var1 + var3 > am_fld) {
				int var19 = var1 + var3 - am_fld;
				var3 -= var19;
				var15 += var19;
			}

			if (var1 < aq_fld) {
				int var20 = aq_fld - var1;
				var3 -= var20;
				var18 += var20;
				var8 += var12 * var20;
				var15 += var20;
			}

			ah(al_fld, this.ah_fld, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ad(int var1) {
		for (int var2 = this.ay_fld - 1; var2 > 0; var2--) {
			int var3 = var2 * this.aw_fld;

			for (int var4 = this.aw_fld - 1; var4 > 0; var4--) {
				if (this.ah_fld[var4 + var3] == 0 && this.ah_fld[var4 + var3 - 1 - this.aw_fld] != 0) {
					this.ah_fld[var4 + var3] = var1;
				}
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lyv;IIIIII)V"
	)
	public static void bo(yv var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0 == null) {
			var0.getClass();
		} else if (var6 != 0) {
			var1 -= var0.as_fld << 4;
			var2 -= var0.ar_fld << 4;
			double var7 = (var5 & 65535) * 9.587379924285257E-5;
			int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
			int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = -(-var1) * var9 + -var2 * var10;
			int var13 = ((var0.aw_fld << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((var0.aw_fld << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((var0.ay_fld << 4) - var2) * var9;
			int var16 = -(-var1) * var9 + ((var0.ay_fld << 4) - var2) * var10;
			int var17 = ((var0.aw_fld << 4) - var1) * var10 + ((var0.ay_fld << 4) - var2) * var9;
			int var18 = -((var0.aw_fld << 4) - var1) * var9 + ((var0.ay_fld << 4) - var2) * var10;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19) {
				var19 = var15;
			}

			if (var17 < var19) {
				var19 = var17;
			}

			if (var15 > var20) {
				var20 = var15;
			}

			if (var17 > var20) {
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21) {
				var21 = var16;
			}

			if (var18 < var21) {
				var21 = var18;
			}

			if (var16 > var22) {
				var22 = var16;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			var19 >>= 12;
			var20 = var20 + 4095 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < aq_fld) {
				var19 = aq_fld;
			}

			if (var20 > am_fld) {
				var20 = am_fld;
			}

			if (var21 < aa_fld) {
				var21 = aa_fld;
			}

			if (var22 > ai_fld) {
				var22 = ai_fld;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = var21 * au_fld + var19;
					double var24 = 1.6777216E7 / var6;
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					if (var27 == 0) {
						if (var26 == 0) {
							for (int var33 = var22; var33 < 0; var23 += au_fld) {
								int var34 = var23;
								int var35 = var30;
								int var36 = var31;
								int var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (var0.aw_fld << 12) < 0 && var31 - (var0.ay_fld << 12) < 0) {
									for (; var37 < 0; var37++) {
										int var38 = var0.ah_fld[(var36 >> 12) * var0.aw_fld + (var35 >> 12)];
										if (var38 != 0) {
											al_fld[var34++] = var38;
										} else {
											var34++;
										}
									}
								}

								var33++;
							}
						} else if (var26 < 0) {
							for (int var84 = var22; var84 < 0; var23 += au_fld) {
								int var92 = var23;
								int var100 = var30;
								int var108 = var31 + (var28 * var26 >> 4);
								int var116 = var20;
								if (var30 >= 0 && var30 - (var0.aw_fld << 12) < 0) {
									int var32;
									if ((var32 = var108 - (var0.ay_fld << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var116 = var20 + var32;
										var108 += var26 * var32;
										var92 = var23 + var32;
									}

									if ((var32 = (var108 - var26) / var26) > var116) {
										var116 = var32;
									}

									while (var116 < 0) {
										int var124 = var0.ah_fld[(var108 >> 12) * var0.aw_fld + (var100 >> 12)];
										if (var124 != 0) {
											al_fld[var92++] = var124;
										} else {
											var92++;
										}

										var108 += var26;
										var116++;
									}
								}

								var84++;
								var30 -= var26;
							}
						} else {
							for (int var85 = var22; var85 < 0; var23 += au_fld) {
								int var93 = var23;
								int var101 = var30;
								int var109 = var31 + (var28 * var26 >> 4);
								int var117 = var20;
								if (var30 >= 0 && var30 - (var0.aw_fld << 12) < 0) {
									if (var109 < 0) {
										int var57 = (var26 - 1 - var109) / var26;
										var117 = var20 + var57;
										var109 += var26 * var57;
										var93 = var23 + var57;
									}

									int var58;
									if ((var58 = (1 + var109 - (var0.ay_fld << 12) - var26) / var26) > var117) {
										var117 = var58;
									}

									while (var117 < 0) {
										int var125 = var0.ah_fld[(var109 >> 12) * var0.aw_fld + (var101 >> 12)];
										if (var125 != 0) {
											al_fld[var93++] = var125;
										} else {
											var93++;
										}

										var109 += var26;
										var117++;
									}
								}

								var85++;
								var30 -= var26;
							}
						}
					} else if (var27 < 0) {
						if (var26 == 0) {
							for (int var86 = var22; var86 < 0; var23 += au_fld) {
								int var94 = var23;
								int var102 = var30 + (var28 * var27 >> 4);
								int var110 = var31;
								int var118 = var20;
								if (var31 >= 0 && var31 - (var0.ay_fld << 12) < 0) {
									int var59;
									if ((var59 = var102 - (var0.aw_fld << 12)) >= 0) {
										var59 = (var27 - var59) / var27;
										var118 = var20 + var59;
										var102 += var27 * var59;
										var94 = var23 + var59;
									}

									if ((var59 = (var102 - var27) / var27) > var118) {
										var118 = var59;
									}

									while (var118 < 0) {
										int var126 = var0.ah_fld[(var110 >> 12) * var0.aw_fld + (var102 >> 12)];
										if (var126 != 0) {
											al_fld[var94++] = var126;
										} else {
											var94++;
										}

										var102 += var27;
										var118++;
									}
								}

								var86++;
								var31 += var27;
							}
						} else if (var26 < 0) {
							for (int var87 = var22; var87 < 0; var23 += au_fld) {
								int var95 = var23;
								int var103 = var30 + (var28 * var27 >> 4);
								int var111 = var31 + (var28 * var26 >> 4);
								int var119 = var20;
								int var62;
								if ((var62 = var103 - (var0.aw_fld << 12)) >= 0) {
									var62 = (var27 - var62) / var27;
									var119 = var20 + var62;
									var103 += var27 * var62;
									var111 += var26 * var62;
									var95 = var23 + var62;
								}

								if ((var62 = (var103 - var27) / var27) > var119) {
									var119 = var62;
								}

								if ((var62 = var111 - (var0.ay_fld << 12)) >= 0) {
									var62 = (var26 - var62) / var26;
									var119 += var62;
									var103 += var27 * var62;
									var111 += var26 * var62;
									var95 += var62;
								}

								if ((var62 = (var111 - var26) / var26) > var119) {
									var119 = var62;
								}

								while (var119 < 0) {
									int var127 = var0.ah_fld[(var111 >> 12) * var0.aw_fld + (var103 >> 12)];
									if (var127 != 0) {
										al_fld[var95++] = var127;
									} else {
										var95++;
									}

									var103 += var27;
									var111 += var26;
									var119++;
								}

								var87++;
								var30 -= var26;
								var31 += var27;
							}
						} else {
							for (int var88 = var22; var88 < 0; var23 += au_fld) {
								int var96 = var23;
								int var104 = var30 + (var28 * var27 >> 4);
								int var112 = var31 + (var28 * var26 >> 4);
								int var120 = var20;
								int var68;
								if ((var68 = var104 - (var0.aw_fld << 12)) >= 0) {
									var68 = (var27 - var68) / var27;
									var120 = var20 + var68;
									var104 += var27 * var68;
									var112 += var26 * var68;
									var96 = var23 + var68;
								}

								if ((var68 = (var104 - var27) / var27) > var120) {
									var120 = var68;
								}

								if (var112 < 0) {
									var68 = (var26 - 1 - var112) / var26;
									var120 += var68;
									var104 += var27 * var68;
									var112 += var26 * var68;
									var96 += var68;
								}

								if ((var68 = (1 + var112 - (var0.ay_fld << 12) - var26) / var26) > var120) {
									var120 = var68;
								}

								while (var120 < 0) {
									int var128 = var0.ah_fld[(var112 >> 12) * var0.aw_fld + (var104 >> 12)];
									if (var128 != 0) {
										al_fld[var96++] = var128;
									} else {
										var96++;
									}

									var104 += var27;
									var112 += var26;
									var120++;
								}

								var88++;
								var30 -= var26;
								var31 += var27;
							}
						}
					} else if (var26 == 0) {
						for (int var89 = var22; var89 < 0; var23 += au_fld) {
							int var97 = var23;
							int var105 = var30 + (var28 * var27 >> 4);
							int var113 = var31;
							int var121 = var20;
							if (var31 >= 0 && var31 - (var0.ay_fld << 12) < 0) {
								if (var105 < 0) {
									int var73 = (var27 - 1 - var105) / var27;
									var121 = var20 + var73;
									var105 += var27 * var73;
									var97 = var23 + var73;
								}

								int var74;
								if ((var74 = (1 + var105 - (var0.aw_fld << 12) - var27) / var27) > var121) {
									var121 = var74;
								}

								while (var121 < 0) {
									int var129 = var0.ah_fld[(var113 >> 12) * var0.aw_fld + (var105 >> 12)];
									if (var129 != 0) {
										al_fld[var97++] = var129;
									} else {
										var97++;
									}

									var105 += var27;
									var121++;
								}
							}

							var89++;
							var31 += var27;
						}
					} else if (var26 < 0) {
						for (int var90 = var22; var90 < 0; var23 += au_fld) {
							int var98 = var23;
							int var106 = var30 + (var28 * var27 >> 4);
							int var114 = var31 + (var28 * var26 >> 4);
							int var122 = var20;
							if (var106 < 0) {
								int var75 = (var27 - 1 - var106) / var27;
								var122 = var20 + var75;
								var106 += var27 * var75;
								var114 += var26 * var75;
								var98 = var23 + var75;
							}

							int var76;
							if ((var76 = (1 + var106 - (var0.aw_fld << 12) - var27) / var27) > var122) {
								var122 = var76;
							}

							if ((var76 = var114 - (var0.ay_fld << 12)) >= 0) {
								var76 = (var26 - var76) / var26;
								var122 += var76;
								var106 += var27 * var76;
								var114 += var26 * var76;
								var98 += var76;
							}

							if ((var76 = (var114 - var26) / var26) > var122) {
								var122 = var76;
							}

							while (var122 < 0) {
								int var130 = var0.ah_fld[(var114 >> 12) * var0.aw_fld + (var106 >> 12)];
								if (var130 != 0) {
									al_fld[var98++] = var130;
								} else {
									var98++;
								}

								var106 += var27;
								var114 += var26;
								var122++;
							}

							var90++;
							var30 -= var26;
							var31 += var27;
						}
					} else {
						for (int var91 = var22; var91 < 0; var23 += au_fld) {
							int var99 = var23;
							int var107 = var30 + (var28 * var27 >> 4);
							int var115 = var31 + (var28 * var26 >> 4);
							int var123 = var20;
							if (var107 < 0) {
								int var80 = (var27 - 1 - var107) / var27;
								var123 = var20 + var80;
								var107 += var27 * var80;
								var115 += var26 * var80;
								var99 = var23 + var80;
							}

							int var81;
							if ((var81 = (1 + var107 - (var0.aw_fld << 12) - var27) / var27) > var123) {
								var123 = var81;
							}

							if (var115 < 0) {
								var81 = (var26 - 1 - var115) / var26;
								var123 += var81;
								var107 += var27 * var81;
								var115 += var26 * var81;
								var99 += var81;
							}

							if ((var81 = (1 + var115 - (var0.ay_fld << 12) - var26) / var26) > var123) {
								var123 = var81;
							}

							while (var123 < 0) {
								int var131 = var0.ah_fld[(var115 >> 12) * var0.aw_fld + (var107 >> 12)];
								if (var131 != 0) {
									al_fld[var99++] = var131;
								} else {
									var99++;
								}

								var107 += var27;
								var115 += var26;
								var123++;
							}

							var91++;
							var30 -= var26;
							var31 += var27;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ao(int var1, int var2) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = this.ay_fld;
		int var6 = this.aw_fld;
		int var7 = au_fld - var6;
		int var8 = 0;
		if (var2 < aa_fld) {
			int var9 = aa_fld - var2;
			var5 -= var9;
			var2 = aa_fld;
			var4 += var9 * var6;
			var3 += var9 * au_fld;
		}

		if (var2 + var5 > ai_fld) {
			var5 -= var2 + var5 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var6 -= var12;
			var1 = aq_fld;
			var4 += var12;
			var3 += var12;
			var8 += var12;
			var7 += var12;
		}

		if (var1 + var6 > am_fld) {
			int var13 = var1 + var6 - am_fld;
			var6 -= var13;
			var8 += var13;
			var7 += var13;
		}

		if (var6 > 0 && var5 > 0) {
			ak(al_fld, this.ah_fld, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III[I[IIIIIIIII)V"
	)
	static void bn(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		for (int var19 = -var10; var19 < 0; var19++) {
			for (int var18 = -var9; var18 < 0; var18++) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 1357491430) + (var1 & 636759604);
					var1 = (var0 & 1753008529) + (var2 - var0 & 35797343);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var7++;
				}
			}

			var7 += var11;
			var5 += var12;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bs(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			this.ab(var1, var2);
		} else {
			var1 += this.as_fld;
			var2 += this.ar_fld;
			int var5 = var1 + var2 * au_fld;
			int var6 = 0;
			int var7 = this.ay_fld;
			int var8 = this.aw_fld;
			int var9 = au_fld - var8;
			int var10 = 0;
			if (var2 < aa_fld) {
				int var11 = aa_fld - var2;
				var7 -= var11;
				var2 = aa_fld;
				var6 += var11 * var8;
				var5 += var11 * au_fld;
			}

			if (var2 + var7 > ai_fld) {
				var7 -= var2 + var7 - ai_fld;
			}

			if (var1 < aq_fld) {
				int var14 = aq_fld - var1;
				var8 -= var14;
				var1 = aq_fld;
				var6 += var14;
				var5 += var14;
				var10 += var14;
				var9 += var14;
			}

			if (var1 + var8 > am_fld) {
				int var15 = var1 + var8 - am_fld;
				var8 -= var15;
				var10 += var15;
				var9 += var15;
			}

			if (var8 > 0 && var7 > 0) {
				av(al_fld, this.ah_fld, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ac(int var1, int var2, int var3) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var4 = var1 + var2 * au_fld;
		int var5 = 0;
		int var6 = this.ay_fld;
		int var7 = this.aw_fld;
		int var8 = au_fld - var7;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var6 -= var10;
			var2 = aa_fld;
			var5 += var10 * var7;
			var4 += var10 * au_fld;
		}

		if (var2 + var6 > ai_fld) {
			var6 -= var2 + var6 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var13 = aq_fld - var1;
			var7 -= var13;
			var1 = aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > am_fld) {
			int var14 = var1 + var7 - am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			ae(al_fld, this.ah_fld, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void aj(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.aw_fld;
			int var7 = this.ay_fld;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.ad_fld;
			int var11 = this.ao_fld;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			if (this.as_fld > 0) {
				int var14 = ((this.as_fld << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var17 = ((this.ar_fld << 16) + var13 - 1) / var13;
				var2 += var17;
				var9 += var17 * var13 - (this.ar_fld << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			int var18 = var1 + var2 * au_fld;
			int var15 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var16 = aa_fld - var2;
				var4 -= var16;
				var18 += var16 * au_fld;
				var9 += var13 * var16;
			}

			if (var1 + var3 > am_fld) {
				int var19 = var1 + var3 - am_fld;
				var3 -= var19;
				var15 += var19;
			}

			if (var1 < aq_fld) {
				int var20 = aq_fld - var1;
				var3 -= var20;
				var18 += var20;
				var8 += var12 * var20;
				var15 += var20;
			}

			ah(al_fld, this.ah_fld, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	@ObfuscatedName("zc")
	@ObfuscatedSignature(
		descriptor = "(Lyv;II)V"
	)
	public static void zc(yv var0, int var1, int var2) {
		var1 += var0.as_fld;
		var2 += var0.ar_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = var0.ay_fld;
		int var6 = var0.aw_fld;
		int var7 = au_fld - var6;
		int var8 = 0;
		if (var2 < aa_fld) {
			int var9 = aa_fld - var2;
			var5 -= var9;
			var2 = aa_fld;
			var4 += var9 * var6;
			var3 += var9 * au_fld;
		}

		if (var2 + var5 > ai_fld) {
			var5 -= var2 + var5 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var6 -= var12;
			var1 = aq_fld;
			var4 += var12;
			var3 += var12;
			var8 += var12;
			var7 += var12;
		}

		if (var1 + var6 > am_fld) {
			int var13 = var1 + var6 - am_fld;
			var6 -= var13;
			var8 += var13;
			var7 += var13;
		}

		if (var6 > 0 && var5 > 0) {
			ak(al_fld, var0.ah_fld, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void bm(int var1, int var2, int var3) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var4 = var1 + var2 * au_fld;
		int var5 = 0;
		int var6 = this.ay_fld;
		int var7 = this.aw_fld;
		int var8 = au_fld - var7;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var6 -= var10;
			var2 = aa_fld;
			var5 += var10 * var7;
			var4 += var10 * au_fld;
		}

		if (var2 + var6 > ai_fld) {
			var6 -= var2 + var6 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var13 = aq_fld - var1;
			var7 -= var13;
			var1 = aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > am_fld) {
			int var14 = var1 + var7 - am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == 256) {
				aw(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				ay(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lyv;IIII)V"
	)
	public static void an(yv var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else if (var3 > 0 && var4 > 0) {
			int var5 = var0.aw_fld;
			int var6 = var0.ay_fld;
			int var7 = 0;
			int var8 = 0;
			int var9 = var0.ad_fld;
			int var10 = var0.ao_fld;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			if (var0.as_fld > 0) {
				int var13 = ((var0.as_fld << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (var0.as_fld << 16);
			}

			if (var0.ar_fld > 0) {
				int var16 = ((var0.ar_fld << 16) + var12 - 1) / var12;
				var2 += var16;
				var8 += var16 * var12 - (var0.ar_fld << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			int var17 = var1 + var2 * au_fld;
			int var14 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var15 = aa_fld - var2;
				var4 -= var15;
				var17 += var15 * au_fld;
				var8 += var12 * var15;
			}

			if (var1 + var3 > am_fld) {
				int var18 = var1 + var3 - am_fld;
				var3 -= var18;
				var14 += var18;
			}

			if (var1 < aq_fld) {
				int var19 = aq_fld - var1;
				var3 -= var19;
				var17 += var19;
				var7 += var11 * var19;
				var14 += var19;
			}

			az(al_fld, var0.ah_fld, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
		}
	}

	@ObfuscatedName("getMaxWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMaxWidth() {
		return this.ad_fld;
	}

	@ObfuscatedName("toBufferedOutline")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/image/BufferedImage;I)V"
	)
	@Override
	public void toBufferedOutline(BufferedImage var1, int var2) {
		int var3 = this.getWidth();
		int var4 = this.getHeight();
		if (var1.getWidth() == var3 && var1.getHeight() == var4) {
			int[] var5 = this.getPixels();
			int[] var6 = new int[var3 * var4];
			int var7 = 0;

			for (int var8 = 0; var8 < var4; var8++) {
				for (int var9 = 0; var9 < var3; var9++) {
					int var10 = var5[var7];
					if (var10 == 16777215 || var10 == 0) {
						if (var9 > 0 && var5[var7 - 1] != 0) {
							var10 = var2;
						} else if (var8 > 0 && var5[var7 - var3] != 0) {
							var10 = var2;
						} else if (var9 < var3 - 1 && var5[var7 + 1] != 0) {
							var10 = var2;
						} else if (var8 < var4 - 1 && var5[var7 + var3] != 0) {
							var10 = var2;
						}

						var6[var7] = var10;
					}

					var7++;
				}
			}

			var1.setRGB(0, 0, var3, var4, var6, 0, var3);
		} else {
			throw new IllegalArgumentException("Image bounds do not match SpritePixels");
		}
	}

	@ObfuscatedName("getOffsetX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOffsetX() {
		return this.as_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void bd(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.aw_fld;
			int var7 = this.ay_fld;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.ad_fld;
			int var11 = this.ao_fld;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			if (this.as_fld > 0) {
				int var14 = ((this.as_fld << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var17 = ((this.ar_fld << 16) + var13 - 1) / var13;
				var2 += var17;
				var9 += var17 * var13 - (this.ar_fld << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			int var18 = var1 + var2 * au_fld;
			int var15 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var16 = aa_fld - var2;
				var4 -= var16;
				var18 += var16 * au_fld;
				var9 += var13 * var16;
			}

			if (var1 + var3 > am_fld) {
				int var19 = var1 + var3 - am_fld;
				var3 -= var19;
				var15 += var19;
			}

			if (var1 < aq_fld) {
				int var20 = aq_fld - var1;
				var3 -= var20;
				var18 += var20;
				var8 += var12 * var20;
				var15 += var20;
			}

			if (var5 == 256) {
				as(0, 0, 0, var8, this.ah_fld, al_fld, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
			} else {
				ar(0, 0, 0, var8, this.ah_fld, al_fld, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[I[I)V"
	)
	public void bz(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var9 = var2 < 0 ? -var2 : 0;
		int var10 = var2 + this.ay_fld <= var6 ? this.ay_fld : var6 - var2;
		int var11 = var1 < 0 ? -var1 : 0;
		if (var1 + this.aw_fld > var5) {
			int var10000 = var5 - var1;
		}

		int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * au_fld;
		int var14 = var2 + var9;

		for (int var15 = var9; var15 < var10; var15++) {
			int var16 = var7[var14];
			int var17 = var8[var14++];
			int var18 = var13;
			int var19;
			if (var1 < var16) {
				var19 = var16 - var1;
				var18 = var13 + (var19 - var11);
			} else {
				var19 = var11;
			}

			int var12;
			if (var1 + this.aw_fld <= var16 + var17) {
				var12 = this.aw_fld;
			} else {
				var12 = var16 + var17 - var1;
			}

			for (int var20 = var19; var20 < var12; var20++) {
				int var21 = this.ah_fld[var20 + var15 * this.aw_fld];
				if (var21 != 0) {
					al_fld[var18++] = var21 | 0xFF000000;
				} else {
					var18++;
				}
			}

			var13 += au_fld;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII[I[I)V"
	)
	public void br(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
		try {
			int var13 = -var3 / 2;
			int var14 = -var4 / 2;
			int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
			int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
			var15 = (int)(((long)var15 << 8) / var8);
			var16 = (int)(((long)var16 << 8) / var8);
			int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
			int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
			int var19 = var1 + var2 * au_fld;

			for (int var20 = 0; var20 < var4; var20++) {
				int var21 = var2 + var20;
				int var22 = var21 - var10;
				if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
					int var23 = var19;
					int var24 = var17;
					int var25 = var18;

					for (int var26 = -var3; var26 < 0; var26++) {
						int var27 = var1 + var3 + var26;
						int var28 = var27 - var9;
						if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
							int var29 = var24 >> 16;
							int var30 = var25 >> 16;
							if (var29 >= 0 && var29 < this.aw_fld && var30 >= 0 && var30 < this.ay_fld) {
								int var31 = var29 + var30 * this.aw_fld;
								int var32 = this.ah_fld[var31];
								if (var32 != 0) {
									al_fld[var23] = var32 | 0xFF000000;
								}
							}
						}

						var23++;
						var24 += var16;
						var25 -= var15;
					}
				}

				var17 += var15;
				var18 += var16;
				var19 += au_fld;
			}
		} catch (Exception var33) {
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIDI)V"
	)
	public void jf(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
				if (au_fld % 2 != 0) {
					var5++;
				}

				if (ax_fld % 2 != 0) {
					var6++;
				}
			}

			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int)(Math.sin(var7) * 65536.0);
			int var13 = (int)(Math.cos(var7) * 65536.0);
			var12 = (int)(((long)var12 << 8) / var9);
			var13 = (int)(((long)var13 << 8) / var9);
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * au_fld;

			for (int var26 = 0; var26 < var4; var26++) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (int var25 = -var3; var25 < 0; var25++) {
					int var20 = var18 >> 16;
					int var21 = var19 >> 16;
					if (var20 >= 0 && var20 < this.aw_fld && var21 >= 0 && var21 < this.ay_fld) {
						int var22 = var20 + var21 * this.aw_fld;
						if (var22 >= 0 && var22 < this.ah_fld.length) {
							int var23 = this.ah_fld[var22];
							if (var23 != 0) {
								al_fld[var17] = var23 | 0xFF000000;
							}
						}
					}

					var17++;
					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += au_fld;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void in(int var1, int var2, int var3, int var4) {
		this.bh(this.ad_fld << 3, this.ao_fld << 3, var1 << 4, var2 << 4, var3, var4);
	}

	@ObfuscatedName("setOffsetY")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setOffsetY(int var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cl() {
		int[] var1 = new int[this.aw_fld * this.ay_fld];
		int var2 = 0;

		for (int var3 = this.ay_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.aw_fld; var4++) {
				var1[var2++] = this.ah_fld[var4 + var3 * this.aw_fld];
			}
		}

		this.ah_fld = var1;
		this.ar_fld = this.ao_fld - this.ay_fld - this.ar_fld;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIDI)V"
	)
	public void iq(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		this.jf(var1, var2, var3, var4, var5, var6, var7, var9);
	}

	@ObfuscatedName("drawAt")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	@Override
	public void drawAt(int var1, int var2) {
		this.ab(var1, var2);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lyv;IIII)V"
	)
	public static void cv(yv var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else if (var3 <= var0.ad_fld && var4 <= var0.ao_fld) {
			int var5 = var1 + var0.as_fld * var3 / var0.ad_fld;
			int var6 = var1 + ((var0.as_fld + var0.aw_fld) * var3 + var0.ad_fld - 1) / var0.ad_fld;
			int var7 = var2 + var0.ar_fld * var4 / var0.ao_fld;
			int var8 = var2 + ((var0.ar_fld + var0.ay_fld) * var4 + var0.ao_fld - 1) / var0.ao_fld;
			if (var5 < aq_fld) {
				var5 = aq_fld;
			}

			if (var6 > am_fld) {
				var6 = am_fld;
			}

			if (var7 < aa_fld) {
				var7 = aa_fld;
			}

			if (var8 > ai_fld) {
				var8 = ai_fld;
			}

			if (var5 < var6 && var7 < var8) {
				int var9 = var7 * au_fld + var5;
				int var10 = au_fld - (var6 - var5);
				if (var9 < al_fld.length) {
					for (int var11 = var7; var11 < var8; var11++) {
						for (int var12 = var5; var12 < var6; var12++) {
							int var13 = var12 - var1 << 4;
							int var14 = var11 - var2 << 4;
							int var15 = var13 * var0.ad_fld / var3 - (var0.as_fld << 4);
							int var16 = (var13 + 16) * var0.ad_fld / var3 - (var0.as_fld << 4);
							int var17 = var14 * var0.ao_fld / var4 - (var0.ar_fld << 4);
							int var18 = (var14 + 16) * var0.ao_fld / var4 - (var0.ar_fld << 4);
							int var19 = (var16 - var15) * (var18 - var17) >> 1;
							if (var19 != 0) {
								if (var15 < 0) {
									var15 = 0;
								}

								if (var16 >= var0.aw_fld << 4) {
									var16 = var0.aw_fld << 4;
								}

								if (var17 < 0) {
									var17 = 0;
								}

								if (var18 >= var0.ay_fld << 4) {
									var18 = var0.ay_fld << 4;
								}

								var16--;
								var18--;
								int var20 = 16 - (var15 & 15);
								int var21 = (var16 & 15) + 1;
								int var22 = 16 - (var17 & 15);
								int var23 = (var18 & 15) + 1;
								var15 >>= 4;
								var16 >>= 4;
								var17 >>= 4;
								var18 >>= 4;
								int var24 = 0;
								int var25 = 0;
								int var26 = 0;
								int var27 = 0;

								for (int var28 = var17; var28 <= var18; var28++) {
									int var29 = 16;
									if (var28 == var17) {
										var29 = var22;
									}

									if (var28 == var18) {
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; var30++) {
										int var31 = var0.ah_fld[var28 * var0.aw_fld + var30];
										if (var31 != 0) {
											int var32;
											if (var30 == var15) {
												var32 = var29 * var20;
											} else if (var30 == var16) {
												var32 = var29 * var21;
											} else {
												var32 = var29 << 4;
											}

											var27 += var32;
											var24 += (var31 >> 16 & 0xFF) * var32;
											var25 += (var31 >> 8 & 692053359) * var32;
											var26 += (var31 & 1481419696) * var32;
										}
									}
								}

								if (var27 >= var19) {
									int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
									if (var39 == 0) {
										var39 = 1;
									}

									al_fld[var9] = var39;
								}

								var9++;
							}
						}

						var9 += var10;
					}
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ap(int var1, int var2, int var3, int var4) {
		if (var3 <= this.ad_fld && var4 <= this.ao_fld) {
			int var5 = var1 + this.as_fld * var3 / this.ad_fld;
			int var6 = var1 + ((this.as_fld + this.aw_fld) * var3 + this.ad_fld - 1) / this.ad_fld;
			int var7 = var2 + this.ar_fld * var4 / this.ao_fld;
			int var8 = var2 + ((this.ar_fld + this.ay_fld) * var4 + this.ao_fld - 1) / this.ao_fld;
			if (var5 < aq_fld) {
				var5 = aq_fld;
			}

			if (var6 > am_fld) {
				var6 = am_fld;
			}

			if (var7 < aa_fld) {
				var7 = aa_fld;
			}

			if (var8 > ai_fld) {
				var8 = ai_fld;
			}

			if (var5 < var6 && var7 < var8) {
				int var9 = var7 * au_fld + var5;
				int var10 = au_fld - (var6 - var5);
				if (var9 < al_fld.length) {
					for (int var11 = var7; var11 < var8; var11++) {
						for (int var12 = var5; var12 < var6; var12++) {
							int var13 = var12 - var1 << 4;
							int var14 = var11 - var2 << 4;
							int var15 = var13 * this.ad_fld / var3 - (this.as_fld << 4);
							int var16 = (var13 + 16) * this.ad_fld / var3 - (this.as_fld << 4);
							int var17 = var14 * this.ao_fld / var4 - (this.ar_fld << 4);
							int var18 = (var14 + 16) * this.ao_fld / var4 - (this.ar_fld << 4);
							int var19 = (var16 - var15) * (var18 - var17) >> 1;
							if (var19 != 0) {
								if (var15 < 0) {
									var15 = 0;
								}

								if (var16 >= this.aw_fld << 4) {
									var16 = this.aw_fld << 4;
								}

								if (var17 < 0) {
									var17 = 0;
								}

								if (var18 >= this.ay_fld << 4) {
									var18 = this.ay_fld << 4;
								}

								var16--;
								var18--;
								int var20 = 16 - (var15 & 15);
								int var21 = (var16 & 15) + 1;
								int var22 = 16 - (var17 & 15);
								int var23 = (var18 & 15) + 1;
								var15 >>= 4;
								var16 >>= 4;
								var17 >>= 4;
								var18 >>= 4;
								int var24 = 0;
								int var25 = 0;
								int var26 = 0;
								int var27 = 0;

								for (int var28 = var17; var28 <= var18; var28++) {
									int var29 = 16;
									if (var28 == var17) {
										var29 = var22;
									}

									if (var28 == var18) {
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; var30++) {
										int var31 = this.ah_fld[var28 * this.aw_fld + var30];
										if (var31 != 0) {
											int var32;
											if (var30 == var15) {
												var32 = var29 * var20;
											} else if (var30 == var16) {
												var32 = var29 * var21;
											} else {
												var32 = var29 << 4;
											}

											var27 += var32;
											var24 += (var31 >> 16 & 0xFF) * var32;
											var25 += (var31 >> 8 & 0xFF) * var32;
											var26 += (var31 & 0xFF) * var32;
										}
									}
								}

								if (var27 >= var19) {
									int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
									if (var39 == 0) {
										var39 = 1;
									}

									al_fld[var9] = var39 | 0xFF000000;
								}

								var9++;
							}
						}

						var9 += var10;
					}
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIII)V"
	)
	static void bj(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; var8++) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			var9 += 3;

			while (var3 < var9) {
				var0[var3++] = var1[var2++];
			}

			var3 += var6;
			var2 += var7;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIII)V"
	)
	static void by(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}
			}

			for (int var24 = var5; var24 < 0; var24++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIII)V"
	)
	static void bl(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; var13++) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; var15++) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					var5++;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lyv;IIII)V"
	)
	public static void me(yv var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else if (var3 <= var0.ad_fld && var4 <= var0.ao_fld) {
			int var5 = var1 + var0.as_fld * var3 / var0.ad_fld;
			int var6 = var1 + ((var0.as_fld + var0.aw_fld) * var3 + var0.ad_fld - 1) / var0.ad_fld;
			int var7 = var2 + var0.ar_fld * var4 / var0.ao_fld;
			int var8 = var2 + ((var0.ar_fld + var0.ay_fld) * var4 + var0.ao_fld - 1) / var0.ao_fld;
			if (var5 < aq_fld) {
				var5 = aq_fld;
			}

			if (var6 > am_fld) {
				var6 = am_fld;
			}

			if (var7 < aa_fld) {
				var7 = aa_fld;
			}

			if (var8 > ai_fld) {
				var8 = ai_fld;
			}

			if (var5 < var6 && var7 < var8) {
				int var9 = var7 * au_fld + var5;
				int var10 = au_fld - (var6 - var5);
				if (var9 < al_fld.length) {
					for (int var11 = var7; var11 < var8; var11++) {
						for (int var12 = var5; var12 < var6; var12++) {
							int var13 = var12 - var1 << 4;
							int var14 = var11 - var2 << 4;
							int var15 = var13 * var0.ad_fld / var3 - (var0.as_fld << 4);
							int var16 = (var13 + 16) * var0.ad_fld / var3 - (var0.as_fld << 4);
							int var17 = var14 * var0.ao_fld / var4 - (var0.ar_fld << 4);
							int var18 = (var14 + 16) * var0.ao_fld / var4 - (var0.ar_fld << 4);
							int var19 = (var16 - var15) * (var18 - var17) >> 1;
							if (var19 != 0) {
								if (var15 < 0) {
									var15 = 0;
								}

								if (var16 >= var0.aw_fld << 4) {
									var16 = var0.aw_fld << 4;
								}

								if (var17 < 0) {
									var17 = 0;
								}

								if (var18 >= var0.ay_fld << 4) {
									var18 = var0.ay_fld << 4;
								}

								var16--;
								var18--;
								int var20 = 16 - (var15 & 15);
								int var21 = (var16 & 15) + 1;
								int var22 = 16 - (var17 & 15);
								int var23 = (var18 & 15) + 1;
								var15 >>= 4;
								var16 >>= 4;
								var17 >>= 4;
								var18 >>= 4;
								int var24 = 0;
								int var25 = 0;
								int var26 = 0;
								int var27 = 0;

								for (int var28 = var17; var28 <= var18; var28++) {
									int var29 = 16;
									if (var28 == var17) {
										var29 = var22;
									}

									if (var28 == var18) {
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; var30++) {
										int var31 = var0.ah_fld[var28 * var0.aw_fld + var30];
										if (var31 != 0) {
											int var32;
											if (var30 == var15) {
												var32 = var29 * var20;
											} else if (var30 == var16) {
												var32 = var29 * var21;
											} else {
												var32 = var29 << 4;
											}

											var27 += var32;
											var24 += (var31 >> 16 & 0xFF) * var32;
											var25 += (var31 >> 8 & 0xFF) * var32;
											var26 += (var31 & 0xFF) * var32;
										}
									}
								}

								if (var27 >= var19) {
									int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
									if (var39 == 0) {
										var39 = 1;
									}

									al_fld[var9] = var39;
								}

								var9++;
							}
						}

						var9 += var10;
					}
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII[I[IIIIIIIIIIII)V"
	)
	static void ar(
		int var0,
		int var1,
		int var2,
		int var3,
		int[] var4,
		int[] var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16
	) {
		int var17 = var3;

		while (var8 < 0) {
			var7 = (var9 >> 16) * var15;

			for (int var25 = -var12; var25 < 0; var25++) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var16;
					var0 = (var1 & -16711936) + (var0 * var16 - var1 & 0xFF0000) >>> 8;
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var10++;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var17;
			var10 += var11;
			var8++;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIII)V"
	)
	static void bo(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & 0xFF00) * var11 & 0xFF0000;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; var14++) {
			for (int var15 = -var5; var15 < 0; var15++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & 0xFF00) * var9 & 0xFF0000;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIII)V"
	)
	static void bp(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & 0xFF00) * var11 & 0xFF0000;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; var14++) {
			for (int var15 = -var5; var15 < 0; var15++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & 0xFF00) * var9 & 0xFF0000;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void is(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.as_fld << 4;
			var2 -= this.ar_fld << 4;
			double var7 = (var5 & 65535) * 9.587379924285257E-5;
			int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
			int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = -(-var1) * var9 + -var2 * var10;
			int var13 = ((this.aw_fld << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((this.aw_fld << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((this.ay_fld << 4) - var2) * var9;
			int var16 = -(-var1) * var9 + ((this.ay_fld << 4) - var2) * var10;
			int var17 = ((this.aw_fld << 4) - var1) * var10 + ((this.ay_fld << 4) - var2) * var9;
			int var18 = -((this.aw_fld << 4) - var1) * var9 + ((this.ay_fld << 4) - var2) * var10;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19) {
				var19 = var15;
			}

			if (var17 < var19) {
				var19 = var17;
			}

			if (var15 > var20) {
				var20 = var15;
			}

			if (var17 > var20) {
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21) {
				var21 = var16;
			}

			if (var18 < var21) {
				var21 = var18;
			}

			if (var16 > var22) {
				var22 = var16;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			var19 >>= 12;
			var20 = var20 + 4095 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < aq_fld) {
				var19 = aq_fld;
			}

			if (var20 > am_fld) {
				var20 = am_fld;
			}

			if (var21 < aa_fld) {
				var21 = aa_fld;
			}

			if (var22 > ai_fld) {
				var22 = ai_fld;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = var21 * au_fld + var19;
					double var24 = 1.6777216E7 / var6;
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					if (var27 == 0) {
						if (var26 == 0) {
							for (int var33 = var22; var33 < 0; var23 += au_fld) {
								int var34 = var23;
								int var35 = var30;
								int var36 = var31;
								int var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (this.aw_fld << 12) < 0 && var31 - (this.ay_fld << 12) < 0) {
									for (; var37 < 0; var37++) {
										int var38 = this.ah_fld[(var36 >> 12) * this.aw_fld + (var35 >> 12)];
										if (var38 != 0) {
											al_fld[var34++] = var38;
										} else {
											var34++;
										}
									}
								}

								var33++;
							}
						} else if (var26 < 0) {
							for (int var84 = var22; var84 < 0; var23 += au_fld) {
								int var92 = var23;
								int var100 = var30;
								int var108 = var31 + (var28 * var26 >> 4);
								int var116 = var20;
								if (var30 >= 0 && var30 - (this.aw_fld << 12) < 0) {
									int var32;
									if ((var32 = var108 - (this.ay_fld << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var116 = var20 + var32;
										var108 += var26 * var32;
										var92 = var23 + var32;
									}

									if ((var32 = (var108 - var26) / var26) > var116) {
										var116 = var32;
									}

									while (var116 < 0) {
										int var124 = this.ah_fld[(var108 >> 12) * this.aw_fld + (var100 >> 12)];
										if (var124 != 0) {
											al_fld[var92++] = var124;
										} else {
											var92++;
										}

										var108 += var26;
										var116++;
									}
								}

								var84++;
								var30 -= var26;
							}
						} else {
							for (int var85 = var22; var85 < 0; var23 += au_fld) {
								int var93 = var23;
								int var101 = var30;
								int var109 = var31 + (var28 * var26 >> 4);
								int var117 = var20;
								if (var30 >= 0 && var30 - (this.aw_fld << 12) < 0) {
									if (var109 < 0) {
										int var57 = (var26 - 1 - var109) / var26;
										var117 = var20 + var57;
										var109 += var26 * var57;
										var93 = var23 + var57;
									}

									int var58;
									if ((var58 = (1 + var109 - (this.ay_fld << 12) - var26) / var26) > var117) {
										var117 = var58;
									}

									while (var117 < 0) {
										int var125 = this.ah_fld[(var109 >> 12) * this.aw_fld + (var101 >> 12)];
										if (var125 != 0) {
											al_fld[var93++] = var125;
										} else {
											var93++;
										}

										var109 += var26;
										var117++;
									}
								}

								var85++;
								var30 -= var26;
							}
						}
					} else if (var27 < 0) {
						if (var26 == 0) {
							for (int var86 = var22; var86 < 0; var23 += au_fld) {
								int var94 = var23;
								int var102 = var30 + (var28 * var27 >> 4);
								int var110 = var31;
								int var118 = var20;
								if (var31 >= 0 && var31 - (this.ay_fld << 12) < 0) {
									int var59;
									if ((var59 = var102 - (this.aw_fld << 12)) >= 0) {
										var59 = (var27 - var59) / var27;
										var118 = var20 + var59;
										var102 += var27 * var59;
										var94 = var23 + var59;
									}

									if ((var59 = (var102 - var27) / var27) > var118) {
										var118 = var59;
									}

									while (var118 < 0) {
										int var126 = this.ah_fld[(var110 >> 12) * this.aw_fld + (var102 >> 12)];
										if (var126 != 0) {
											al_fld[var94++] = var126;
										} else {
											var94++;
										}

										var102 += var27;
										var118++;
									}
								}

								var86++;
								var31 += var27;
							}
						} else if (var26 < 0) {
							for (int var87 = var22; var87 < 0; var23 += au_fld) {
								int var95 = var23;
								int var103 = var30 + (var28 * var27 >> 4);
								int var111 = var31 + (var28 * var26 >> 4);
								int var119 = var20;
								int var62;
								if ((var62 = var103 - (this.aw_fld << 12)) >= 0) {
									var62 = (var27 - var62) / var27;
									var119 = var20 + var62;
									var103 += var27 * var62;
									var111 += var26 * var62;
									var95 = var23 + var62;
								}

								if ((var62 = (var103 - var27) / var27) > var119) {
									var119 = var62;
								}

								if ((var62 = var111 - (this.ay_fld << 12)) >= 0) {
									var62 = (var26 - var62) / var26;
									var119 += var62;
									var103 += var27 * var62;
									var111 += var26 * var62;
									var95 += var62;
								}

								if ((var62 = (var111 - var26) / var26) > var119) {
									var119 = var62;
								}

								while (var119 < 0) {
									int var127 = this.ah_fld[(var111 >> 12) * this.aw_fld + (var103 >> 12)];
									if (var127 != 0) {
										al_fld[var95++] = var127;
									} else {
										var95++;
									}

									var103 += var27;
									var111 += var26;
									var119++;
								}

								var87++;
								var30 -= var26;
								var31 += var27;
							}
						} else {
							for (int var88 = var22; var88 < 0; var23 += au_fld) {
								int var96 = var23;
								int var104 = var30 + (var28 * var27 >> 4);
								int var112 = var31 + (var28 * var26 >> 4);
								int var120 = var20;
								int var68;
								if ((var68 = var104 - (this.aw_fld << 12)) >= 0) {
									var68 = (var27 - var68) / var27;
									var120 = var20 + var68;
									var104 += var27 * var68;
									var112 += var26 * var68;
									var96 = var23 + var68;
								}

								if ((var68 = (var104 - var27) / var27) > var120) {
									var120 = var68;
								}

								if (var112 < 0) {
									var68 = (var26 - 1 - var112) / var26;
									var120 += var68;
									var104 += var27 * var68;
									var112 += var26 * var68;
									var96 += var68;
								}

								if ((var68 = (1 + var112 - (this.ay_fld << 12) - var26) / var26) > var120) {
									var120 = var68;
								}

								while (var120 < 0) {
									int var128 = this.ah_fld[(var112 >> 12) * this.aw_fld + (var104 >> 12)];
									if (var128 != 0) {
										al_fld[var96++] = var128;
									} else {
										var96++;
									}

									var104 += var27;
									var112 += var26;
									var120++;
								}

								var88++;
								var30 -= var26;
								var31 += var27;
							}
						}
					} else if (var26 == 0) {
						for (int var89 = var22; var89 < 0; var23 += au_fld) {
							int var97 = var23;
							int var105 = var30 + (var28 * var27 >> 4);
							int var113 = var31;
							int var121 = var20;
							if (var31 >= 0 && var31 - (this.ay_fld << 12) < 0) {
								if (var105 < 0) {
									int var73 = (var27 - 1 - var105) / var27;
									var121 = var20 + var73;
									var105 += var27 * var73;
									var97 = var23 + var73;
								}

								int var74;
								if ((var74 = (1 + var105 - (this.aw_fld << 12) - var27) / var27) > var121) {
									var121 = var74;
								}

								while (var121 < 0) {
									int var129 = this.ah_fld[(var113 >> 12) * this.aw_fld + (var105 >> 12)];
									if (var129 != 0) {
										al_fld[var97++] = var129;
									} else {
										var97++;
									}

									var105 += var27;
									var121++;
								}
							}

							var89++;
							var31 += var27;
						}
					} else if (var26 < 0) {
						for (int var90 = var22; var90 < 0; var23 += au_fld) {
							int var98 = var23;
							int var106 = var30 + (var28 * var27 >> 4);
							int var114 = var31 + (var28 * var26 >> 4);
							int var122 = var20;
							if (var106 < 0) {
								int var75 = (var27 - 1 - var106) / var27;
								var122 = var20 + var75;
								var106 += var27 * var75;
								var114 += var26 * var75;
								var98 = var23 + var75;
							}

							int var76;
							if ((var76 = (1 + var106 - (this.aw_fld << 12) - var27) / var27) > var122) {
								var122 = var76;
							}

							if ((var76 = var114 - (this.ay_fld << 12)) >= 0) {
								var76 = (var26 - var76) / var26;
								var122 += var76;
								var106 += var27 * var76;
								var114 += var26 * var76;
								var98 += var76;
							}

							if ((var76 = (var114 - var26) / var26) > var122) {
								var122 = var76;
							}

							while (var122 < 0) {
								int var130 = this.ah_fld[(var114 >> 12) * this.aw_fld + (var106 >> 12)];
								if (var130 != 0) {
									al_fld[var98++] = var130;
								} else {
									var98++;
								}

								var106 += var27;
								var114 += var26;
								var122++;
							}

							var90++;
							var30 -= var26;
							var31 += var27;
						}
					} else {
						for (int var91 = var22; var91 < 0; var23 += au_fld) {
							int var99 = var23;
							int var107 = var30 + (var28 * var27 >> 4);
							int var115 = var31 + (var28 * var26 >> 4);
							int var123 = var20;
							if (var107 < 0) {
								int var80 = (var27 - 1 - var107) / var27;
								var123 = var20 + var80;
								var107 += var27 * var80;
								var115 += var26 * var80;
								var99 = var23 + var80;
							}

							int var81;
							if ((var81 = (1 + var107 - (this.aw_fld << 12) - var27) / var27) > var123) {
								var123 = var81;
							}

							if (var115 < 0) {
								var81 = (var26 - 1 - var115) / var26;
								var123 += var81;
								var107 += var27 * var81;
								var115 += var26 * var81;
								var99 += var81;
							}

							if ((var81 = (1 + var115 - (this.ay_fld << 12) - var26) / var26) > var123) {
								var123 = var81;
							}

							while (var123 < 0) {
								int var131 = this.ah_fld[(var115 >> 12) * this.aw_fld + (var107 >> 12)];
								if (var131 != 0) {
									al_fld[var99++] = var131;
								} else {
									var99++;
								}

								var107 += var27;
								var115 += var26;
								var123++;
							}

							var91++;
							var30 -= var26;
							var31 += var27;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ai() {
		int[] var1 = new int[this.aw_fld * this.ay_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < this.ay_fld; var3++) {
			for (int var4 = this.aw_fld - 1; var4 >= 0; var4--) {
				var1[var2++] = this.ah_fld[var4 + var3 * this.aw_fld];
			}
		}

		this.ah_fld = var1;
		this.as_fld = this.ad_fld - this.aw_fld - this.as_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III[I[IIIIIIIIII)V"
	)
	static void bq(
		int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
	) {
		for (int var22 = -var10; var22 < 0; var22++) {
			for (int var21 = -var9; var21 < 0; var21++) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var13;
					var0 = (var1 & -16711936) + (var0 * var13 - var1 & 0xFF0000) >>> 8;
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var7++;
				}
			}

			var7 += var11;
			var5 += var12;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IIII[I[IIIIIIIIIIII)V"
	)
	static void cq(
		int var0,
		int var1,
		int var2,
		int var3,
		int[] var4,
		int[] var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16
	) {
		int var17 = var3;

		while (var8 < 0) {
			var7 = (var9 >> 16) * var15;

			for (int var25 = -var12; var25 < 0; var25++) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = (var0 & -714658843) * var16;
					var0 = (var1 & -2112120812) + (var0 * var16 - var1 & 624481411) >>> 8;
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & -486391602) + (var1 & 225926004);
					var1 = (var0 & 354568953) + (var2 - var0 & -2021902580);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var10++;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var17;
			var10 += var11;
			var8++;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III[I[IIIIIIIII)V"
	)
	static void bc(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		for (int var19 = -var10; var19 < 0; var19++) {
			for (int var18 = -var9; var18 < 0; var18++) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var7++;
				}
			}

			var7 += var11;
			var5 += var12;
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cz() {
		if (this.aw_fld != this.ad_fld || this.ay_fld != this.ao_fld) {
			int[] var1 = new int[this.ad_fld * this.ao_fld];

			for (int var2 = 0; var2 < this.ay_fld; var2++) {
				for (int var3 = 0; var3 < this.aw_fld; var3++) {
					var1[(var2 + this.ar_fld) * this.ad_fld + var3 + this.as_fld] = this.ah_fld[var2 * this.aw_fld + var3];
				}
			}

			this.ah_fld = var1;
			this.aw_fld = this.ad_fld;
			this.ay_fld = this.ao_fld;
			this.as_fld = 0;
			this.ar_fld = 0;
		}
	}

	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)Lyv;"
	)
	public static yv vk(yv var0) {
		yv var1 = new yv(var0.aw_fld, var0.ay_fld);
		var1.ad_fld = var0.ad_fld;
		var1.ao_fld = var0.ao_fld;
		var1.as_fld = var0.as_fld;
		var1.ar_fld = var0.ar_fld;
		int var2 = var0.ah_fld.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1.ah_fld[var3] = var0.ah_fld[var3];
		}

		return var1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ci(int var1) {
		if (this.aw_fld != this.ad_fld || this.ay_fld != this.ao_fld) {
			int var2 = var1;
			if (var1 > this.as_fld) {
				var2 = this.as_fld;
			}

			int var3 = var1;
			if (var1 + this.as_fld + this.aw_fld > this.ad_fld) {
				var3 = this.ad_fld - this.as_fld - this.aw_fld;
			}

			int var4 = var1;
			if (var1 > this.ar_fld) {
				var4 = this.ar_fld;
			}

			int var5 = var1;
			if (var1 + this.ar_fld + this.ay_fld > this.ao_fld) {
				var5 = this.ao_fld - this.ar_fld - this.ay_fld;
			}

			int var6 = this.aw_fld + var2 + var3;
			int var7 = this.ay_fld + var4 + var5;
			int[] var8 = new int[var6 * var7];

			for (int var9 = 0; var9 < this.ay_fld; var9++) {
				for (int var10 = 0; var10 < this.aw_fld; var10++) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.ah_fld[var9 * this.aw_fld + var10];
				}
			}

			this.ah_fld = var8;
			this.aw_fld = var6;
			this.ay_fld = var7;
			this.as_fld -= var2;
			this.ar_fld -= var4;
		}
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeight() {
		return this.ay_fld;
	}

	@ObfuscatedName("getOffsetY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOffsetY() {
		return this.ar_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IIII[I[IIIIIIIIIIII)V"
	)
	static void cc(
		int var0,
		int var1,
		int var2,
		int var3,
		int[] var4,
		int[] var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16
	) {
		int var17 = var3;

		while (var8 < 0) {
			var7 = (var9 >> 16) * var15;

			for (int var25 = -var12; var25 < 0; var25++) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var16;
					var0 = (var1 & -16711936) + (var0 * var16 - var1 & 0xFF0000) >>> 8;
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var10++;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var17;
			var10 += var11;
			var8++;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIII[I[IIIIIIIIIII)V"
	)
	static void bg(
		int var0,
		int var1,
		int var2,
		int var3,
		int[] var4,
		int[] var5,
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
		int var16 = var3;

		while (var8 < 0) {
			var7 = (var9 >> 16) * var15;

			for (int var22 = -var12; var22 < 0; var22++) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var10++;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var16;
			var10 += var11;
			var8++;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIII[I[IIIIIIIIIII)V"
	)
	static void bb(
		int var0,
		int var1,
		int var2,
		int var3,
		int[] var4,
		int[] var5,
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
		int var16 = var3;

		while (var8 < 0) {
			var7 = (var9 >> 16) * var15;

			for (int var22 = -var12; var22 < 0; var22++) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & -430107848);
					var1 = (var0 & 758240799) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var10++;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var16;
			var10 += var11;
			var8++;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIII)V"
	)
	static void bx(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & 0xFF00) * var11 & 0xFF0000;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; var14++) {
			for (int var15 = -var5; var15 < 0; var15++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & 0xFF00) * var9 & 0xFF0000;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv gv() {
		return this.af();
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lyv;II)V"
	)
	public static void lp(yv var0, int var1, int var2) {
		var1 += var0.as_fld;
		var2 += var0.ar_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = var0.ay_fld;
		int var6 = var0.aw_fld;
		int var7 = au_fld - var6;
		int var8 = 0;
		if (var2 < aa_fld) {
			int var9 = aa_fld - var2;
			var5 -= var9;
			var2 = aa_fld;
			var4 += var9 * var6;
			var3 += var9 * au_fld;
		}

		if (var2 + var5 > ai_fld) {
			var5 -= var2 + var5 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var6 -= var12;
			var1 = aq_fld;
			var4 += var12;
			var3 += var12;
			var8 += var12;
			var7 += var12;
		}

		if (var1 + var6 > am_fld) {
			int var13 = var1 + var6 - am_fld;
			var6 -= var13;
			var8 += var13;
			var7 += var13;
		}

		if (var6 > 0 && var5 > 0) {
			ak(al_fld, var0.ah_fld, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("toBufferedImage")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/image/BufferedImage;)V"
	)
	@Override
	public void toBufferedImage(BufferedImage var1) {
		int var2 = this.getWidth();
		int var3 = this.getHeight();
		if (var1.getWidth() == var2 && var1.getHeight() == var3) {
			int[] var4 = this.getPixels();
			int[] var5 = new int[var4.length];

			for (int var6 = 0; var6 < var4.length; var6++) {
				if (var4[var6] != 0) {
					var5[var6] = var4[var6] | 0xFF000000;
				}
			}

			var1.setRGB(0, 0, var2, var3, var5, 0, var2);
		} else {
			throw new IllegalArgumentException("Image bounds do not match SpritePixels");
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ib(int var1, int var2, int var3) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var4 = var1 + var2 * au_fld;
		int var5 = 0;
		int var6 = this.ay_fld;
		int var7 = this.aw_fld;
		int var8 = au_fld - var7;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var6 -= var10;
			var2 = aa_fld;
			var5 += var10 * var7;
			var4 += var10 * au_fld;
		}

		if (var2 + var6 > ai_fld) {
			var6 -= var2 + var6 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var13 = aq_fld - var1;
			var7 -= var13;
			var1 = aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > am_fld) {
			int var14 = var1 + var7 - am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == -1925497183) {
				aw(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				ay(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	public static void cr(yv var0) {
		int[] var1 = new int[var0.aw_fld * var0.ay_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < var0.ay_fld; var3++) {
			for (int var4 = var0.aw_fld - 1; var4 >= 0; var4--) {
				var1[var2++] = var0.ah_fld[var4 + var3 * var0.aw_fld];
			}
		}

		var0.ah_fld = var1;
		var0.as_fld = var0.ad_fld - var0.aw_fld - var0.as_fld;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIII[I[IIIIIIIIIIII)V"
	)
	static void cv(
		int var0,
		int var1,
		int var2,
		int var3,
		int[] var4,
		int[] var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16
	) {
		int var17 = var3;

		while (var8 < 0) {
			var7 = (var9 >> 16) * var15;

			for (int var25 = -var12; var25 < 0; var25++) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var16;
					var0 = (var1 & -16711936) + (var0 * var16 - var1 & -1607718423) >>> 8;
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var10++;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var17;
			var10 += var11;
			var8++;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ab(int var1, int var2) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = this.ay_fld;
		int var6 = this.aw_fld;
		int var7 = au_fld - var6;
		int var8 = 0;
		if (var2 < aa_fld) {
			int var9 = aa_fld - var2;
			var5 -= var9;
			var2 = aa_fld;
			var4 += var9 * var6;
			var3 += var9 * au_fld;
		}

		if (var2 + var5 > ai_fld) {
			var5 -= var2 + var5 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var6 -= var12;
			var1 = aq_fld;
			var4 += var12;
			var3 += var12;
			var8 += var12;
			var7 += var12;
		}

		if (var1 + var6 > am_fld) {
			int var13 = var1 + var6 - am_fld;
			var6 -= var13;
			var8 += var13;
			var7 += var13;
		}

		if (var6 > 0 && var5 > 0) {
			ag(al_fld, this.ah_fld, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv cx() {
		yv var1 = new yv(this.aw_fld, this.ay_fld);
		var1.ad_fld = this.ad_fld;
		var1.ao_fld = this.ao_fld;
		var1.as_fld = this.ad_fld - this.aw_fld - this.as_fld;
		var1.ar_fld = this.ar_fld;

		for (int var2 = 0; var2 < this.ay_fld; var2++) {
			for (int var3 = 0; var3 < this.aw_fld; var3++) {
				var1.ah_fld[var2 * this.aw_fld + var3] = this.ah_fld[var2 * this.aw_fld + this.aw_fld - 1 - var3];
			}
		}

		return var1;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv cs() {
		yv var1 = new yv(this.aw_fld, this.ay_fld);
		var1.ad_fld = this.ad_fld;
		var1.ao_fld = this.ao_fld;
		var1.as_fld = this.as_fld;
		var1.ar_fld = this.ar_fld;
		int var2 = this.ah_fld.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1.ah_fld[var3] = this.ah_fld[var3];
		}

		return var1;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hz(int var1, int var2, int var3) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var4 = var1 + var2 * au_fld;
		int var5 = 0;
		int var6 = this.ay_fld;
		int var7 = this.aw_fld;
		int var8 = au_fld - var7;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var6 -= var10;
			var2 = aa_fld;
			var5 += var10 * var7;
			var4 += var10 * au_fld;
		}

		if (var2 + var6 > ai_fld) {
			var6 -= var2 + var6 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var13 = aq_fld - var1;
			var7 -= var13;
			var1 = aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > am_fld) {
			int var14 = var1 + var7 - am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == -1905522794) {
				aw(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				ay(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIII[I[IIIIIIIIIIII)V"
	)
	static void cd(
		int var0,
		int var1,
		int var2,
		int var3,
		int[] var4,
		int[] var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		int var13,
		int var14,
		int var15,
		int var16
	) {
		int var17 = var3;

		while (var8 < 0) {
			var7 = (var9 >> 16) * var15;

			for (int var25 = -var12; var25 < 0; var25++) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = (var0 & 1628904343) * var16;
					var0 = (var1 & -16711936) + (var0 * var16 - var1 & 0xFF0000) >>> 8;
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & -224606729);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var10++;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var17;
			var10 += var11;
			var8++;
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void dq(int var1, int var2) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = this.ay_fld;
		int var6 = this.aw_fld;
		int var7 = au_fld - var6;
		int var8 = 0;
		if (var2 < aa_fld) {
			int var9 = aa_fld - var2;
			var5 -= var9;
			var2 = aa_fld;
			var4 += var9 * var6;
			var3 += var9 * au_fld;
		}

		if (var2 + var5 > ai_fld) {
			var5 -= var2 + var5 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var6 -= var12;
			var1 = aq_fld;
			var4 += var12;
			var3 += var12;
			var8 += var12;
			var7 += var12;
		}

		if (var1 + var6 > am_fld) {
			int var13 = var1 + var6 - am_fld;
			var6 -= var13;
			var8 += var13;
			var7 += var13;
		}

		if (var6 > 0 && var5 > 0) {
			ag(al_fld, this.ah_fld, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cg() {
		du(this.ah_fld, this.aw_fld, this.ay_fld, null);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dh(int var1) {
		int[] var2 = new int[this.aw_fld * this.ay_fld];
		int var3 = 0;

		for (int var4 = 0; var4 < this.ay_fld; var4++) {
			for (int var5 = 0; var5 < this.aw_fld; var5++) {
				int var6 = this.ah_fld[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.ah_fld[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && this.ah_fld[var3 - this.aw_fld] != 0) {
						var6 = var1;
					} else if (var5 < this.aw_fld - 1 && this.ah_fld[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < this.ay_fld - 1 && this.ah_fld[var3 + this.aw_fld] != 0) {
						var6 = var1;
					}
				}

				var2[var3++] = var6;
			}
		}

		this.ah_fld = var2;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ck() {
		if (this.aw_fld != this.ad_fld || this.ay_fld != this.ao_fld) {
			int[] var1 = new int[this.ad_fld * this.ao_fld];

			for (int var2 = 0; var2 < this.ay_fld; var2++) {
				for (int var3 = 0; var3 < this.aw_fld; var3++) {
					var1[(var2 + this.ar_fld) * this.ad_fld + var3 + this.as_fld] = this.ah_fld[var2 * this.aw_fld + var3];
				}
			}

			this.ah_fld = var1;
			this.aw_fld = this.ad_fld;
			this.ay_fld = this.ao_fld;
			this.as_fld = 0;
			this.ar_fld = 0;
		}
	}

	@ObfuscatedName("zb")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	public static void zb(yv var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int[] var1 = new int[var0.aw_fld * var0.ay_fld];
			int var2 = 0;

			for (int var3 = var0.ay_fld - 1; var3 >= 0; var3--) {
				for (int var4 = 0; var4 < var0.aw_fld; var4++) {
					var1[var2++] = var0.ah_fld[var4 + var3 * var0.aw_fld];
				}
			}

			var0.ah_fld = var1;
			var0.ar_fld = var0.ao_fld - var0.ay_fld - var0.ar_fld;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIII)V"
	)
	static void bv(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; var11++) {
			for (int var12 = -var5; var12 < 0; var12++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & 0xFF00) * var9 + (var13 & 0xFF00) * var10 & 0xFF0000) >> 8;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void am(int var1) {
		int[] var2 = new int[this.aw_fld * this.ay_fld];
		int var3 = 0;

		for (int var4 = 0; var4 < this.ay_fld; var4++) {
			for (int var5 = 0; var5 < this.aw_fld; var5++) {
				int var6 = this.ah_fld[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.ah_fld[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && this.ah_fld[var3 - this.aw_fld] != 0) {
						var6 = var1;
					} else if (var5 < this.aw_fld - 1 && this.ah_fld[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < this.ay_fld - 1 && this.ah_fld[var3 + this.aw_fld] != 0) {
						var6 = var1;
					}
				}

				var2[var3++] = var6;
			}
		}

		this.ah_fld = var2;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void co(int var1) {
		if (this.aw_fld != this.ad_fld || this.ay_fld != this.ao_fld) {
			int var2 = var1;
			if (var1 > this.as_fld) {
				var2 = this.as_fld;
			}

			int var3 = var1;
			if (var1 + this.as_fld + this.aw_fld > this.ad_fld) {
				var3 = this.ad_fld - this.as_fld - this.aw_fld;
			}

			int var4 = var1;
			if (var1 > this.ar_fld) {
				var4 = this.ar_fld;
			}

			int var5 = var1;
			if (var1 + this.ar_fld + this.ay_fld > this.ao_fld) {
				var5 = this.ao_fld - this.ar_fld - this.ay_fld;
			}

			int var6 = this.aw_fld + var2 + var3;
			int var7 = this.ay_fld + var4 + var5;
			int[] var8 = new int[var6 * var7];

			for (int var9 = 0; var9 < this.ay_fld; var9++) {
				for (int var10 = 0; var10 < this.aw_fld; var10++) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.ah_fld[var9 * this.aw_fld + var10];
				}
			}

			this.ah_fld = var8;
			this.aw_fld = var6;
			this.ay_fld = var7;
			this.as_fld -= var2;
			this.ar_fld -= var4;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cu(int var1) {
		if (this.aw_fld != this.ad_fld || this.ay_fld != this.ao_fld) {
			int var2 = var1;
			if (var1 > this.as_fld) {
				var2 = this.as_fld;
			}

			int var3 = var1;
			if (var1 + this.as_fld + this.aw_fld > this.ad_fld) {
				var3 = this.ad_fld - this.as_fld - this.aw_fld;
			}

			int var4 = var1;
			if (var1 > this.ar_fld) {
				var4 = this.ar_fld;
			}

			int var5 = var1;
			if (var1 + this.ar_fld + this.ay_fld > this.ao_fld) {
				var5 = this.ao_fld - this.ar_fld - this.ay_fld;
			}

			int var6 = this.aw_fld + var2 + var3;
			int var7 = this.ay_fld + var4 + var5;
			int[] var8 = new int[var6 * var7];

			for (int var9 = 0; var9 < this.ay_fld; var9++) {
				for (int var10 = 0; var10 < this.aw_fld; var10++) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.ah_fld[var9 * this.aw_fld + var10];
				}
			}

			this.ah_fld = var8;
			this.aw_fld = var6;
			this.ay_fld = var7;
			this.as_fld -= var2;
			this.ar_fld -= var4;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void iz(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.aw_fld;
			int var7 = this.ay_fld;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.ad_fld;
			int var11 = this.ao_fld;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			if (this.as_fld > 0) {
				int var14 = ((this.as_fld << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var17 = ((this.ar_fld << 16) + var13 - 1) / var13;
				var2 += var17;
				var9 += var17 * var13 - (this.ar_fld << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			int var18 = var1 + var2 * au_fld;
			int var15 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var16 = aa_fld - var2;
				var4 -= var16;
				var18 += var16 * au_fld;
				var9 += var13 * var16;
			}

			if (var1 + var3 > am_fld) {
				int var19 = var1 + var3 - am_fld;
				var3 -= var19;
				var15 += var19;
			}

			if (var1 < aq_fld) {
				int var20 = aq_fld - var1;
				var3 -= var20;
				var18 += var20;
				var8 += var12 * var20;
				var15 += var20;
			}

			if (var5 == 256) {
				as(0, 0, 0, var8, this.ah_fld, al_fld, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
			} else {
				ar(0, 0, 0, var8, this.ah_fld, al_fld, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
			}
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ch() {
		int[] var1 = new int[this.aw_fld * this.ay_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < this.ay_fld; var3++) {
			for (int var4 = this.aw_fld - 1; var4 >= 0; var4--) {
				var1[var2++] = this.ah_fld[var4 + var3 * this.aw_fld];
			}
		}

		this.ah_fld = var1;
		this.as_fld = this.ad_fld - this.aw_fld - this.as_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ct() {
		int[] var1 = new int[this.aw_fld * this.ay_fld];
		int var2 = 0;

		for (int var3 = 0; var3 < this.ay_fld; var3++) {
			for (int var4 = this.aw_fld - 1; var4 >= 0; var4--) {
				var1[var2++] = this.ah_fld[var4 + var3 * this.aw_fld];
			}
		}

		this.ah_fld = var1;
		this.as_fld = this.ad_fld - this.aw_fld - this.as_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIDI)V"
	)
	public void be(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			if (var7 < Math.PI / 2 || var7 > Math.PI * 3.0 / 2.0) {
				if (au_fld % 2 != 0) {
					var5++;
				}

				if (ax_fld % 2 != 0) {
					var6++;
				}
			}

			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int)(Math.sin(var7) * 65536.0);
			int var13 = (int)(Math.cos(var7) * 65536.0);
			var12 = (int)(((long)var12 << 8) / var9);
			var13 = (int)(((long)var13 << 8) / var9);
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * au_fld;

			for (int var26 = 0; var26 < var4; var26++) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (int var25 = -var3; var25 < 0; var25++) {
					int var20 = var18 >> 16;
					int var21 = var19 >> 16;
					if (var20 >= 0 && var20 < this.aw_fld && var21 >= 0 && var21 < this.ay_fld) {
						int var22 = var20 + var21 * this.aw_fld;
						if (var22 >= 0 && var22 < this.ah_fld.length) {
							int var23 = this.ah_fld[var22];
							if (var23 != 0) {
								al_fld[var17] = var23;
							}
						}
					}

					var17++;
					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += au_fld;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dc() {
		int[] var1 = new int[this.aw_fld * this.ay_fld];
		int var2 = 0;

		for (int var3 = this.ay_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.aw_fld; var4++) {
				var1[var2++] = this.ah_fld[var4 + var3 * this.aw_fld];
			}
		}

		this.ah_fld = var1;
		this.ar_fld = this.ao_fld - this.ay_fld - this.ar_fld;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv cr() {
		yv var1 = new yv(this.ad_fld, this.ao_fld);

		for (int var2 = 0; var2 < this.ay_fld; var2++) {
			for (int var3 = 0; var3 < this.aw_fld; var3++) {
				var1.ah_fld[(var2 + this.ar_fld) * this.ad_fld + var3 + this.as_fld] = this.ah_fld[var2 * this.aw_fld + var3];
			}
		}

		return var1;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void dz(int var1, int var2) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = this.ay_fld;
		int var6 = this.aw_fld;
		int var7 = au_fld - var6;
		int var8 = 0;
		if (var2 < aa_fld) {
			int var9 = aa_fld - var2;
			var5 -= var9;
			var2 = aa_fld;
			var4 += var9 * var6;
			var3 += var9 * au_fld;
		}

		if (var2 + var5 > ai_fld) {
			var5 -= var2 + var5 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var6 -= var12;
			var1 = aq_fld;
			var4 += var12;
			var3 += var12;
			var8 += var12;
			var7 += var12;
		}

		if (var1 + var6 > am_fld) {
			int var13 = var1 + var6 - am_fld;
			var6 -= var13;
			var8 += var13;
			var7 += var13;
		}

		if (var6 > 0 && var5 > 0) {
			ak(al_fld, this.ah_fld, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("toBufferedImage")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/image/BufferedImage;"
	)
	@Override
	public BufferedImage toBufferedImage() {
		BufferedImage var1 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
		this.toBufferedImage(var1);
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		du(this.ah_fld, this.aw_fld, this.ay_fld, null);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void dd(int var1, int var2) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = this.ay_fld;
		int var6 = this.aw_fld;
		int var7 = au_fld - var6;
		int var8 = 0;
		if (var2 < aa_fld) {
			int var9 = aa_fld - var2;
			var5 -= var9;
			var2 = aa_fld;
			var4 += var9 * var6;
			var3 += var9 * au_fld;
		}

		if (var2 + var5 > ai_fld) {
			var5 -= var2 + var5 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var6 -= var12;
			var1 = aq_fld;
			var4 += var12;
			var3 += var12;
			var8 += var12;
			var7 += var12;
		}

		if (var1 + var6 > am_fld) {
			int var13 = var1 + var6 - am_fld;
			var6 -= var13;
			var8 += var13;
			var7 += var13;
		}

		if (var6 > 0 && var5 > 0) {
			ag(al_fld, this.ah_fld, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void do_(int var1, int var2) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = this.ay_fld;
		int var6 = this.aw_fld;
		int var7 = au_fld - var6;
		int var8 = 0;
		if (var2 < aa_fld) {
			int var9 = aa_fld - var2;
			var5 -= var9;
			var2 = aa_fld;
			var4 += var9 * var6;
			var3 += var9 * au_fld;
		}

		if (var2 + var5 > ai_fld) {
			var5 -= var2 + var5 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var12 = aq_fld - var1;
			var6 -= var12;
			var1 = aq_fld;
			var4 += var12;
			var3 += var12;
			var8 += var12;
			var7 += var12;
		}

		if (var1 + var6 > am_fld) {
			int var13 = var1 + var6 - am_fld;
			var6 -= var13;
			var8 += var13;
			var7 += var13;
		}

		if (var6 > 0 && var5 > 0) {
			ag(al_fld, this.ah_fld, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void yn(int var1, int var2) {
		this.ao(var1, var2);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIII)V"
	)
	static void bt(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; var11++) {
			for (int var12 = -var5; var12 < 0; var12++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & 0xFF00) * var9 + (var13 & 0xFF00) * var10 & 0xFF0000) >> 8;
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
		descriptor = "(IIII)V"
	)
	public void da(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.aw_fld;
			int var6 = this.ay_fld;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.ad_fld;
			int var10 = this.ao_fld;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			if (this.as_fld > 0) {
				int var13 = ((this.as_fld << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var16 = ((this.ar_fld << 16) + var12 - 1) / var12;
				var2 += var16;
				var8 += var16 * var12 - (this.ar_fld << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			int var17 = var1 + var2 * au_fld;
			int var14 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var15 = aa_fld - var2;
				var4 -= var15;
				var17 += var15 * au_fld;
				var8 += var12 * var15;
			}

			if (var1 + var3 > am_fld) {
				int var18 = var1 + var3 - am_fld;
				var3 -= var18;
				var14 += var18;
			}

			if (var1 < aq_fld) {
				int var19 = aq_fld - var1;
				var3 -= var19;
				var17 += var19;
				var7 += var11 * var19;
				var14 += var19;
			}

			az(al_fld, this.ah_fld, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ha(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.aw_fld;
			int var6 = this.ay_fld;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.ad_fld;
			int var10 = this.ao_fld;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			if (this.as_fld > 0) {
				int var13 = ((this.as_fld << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var16 = ((this.ar_fld << 16) + var12 - 1) / var12;
				var2 += var16;
				var8 += var16 * var12 - (this.ar_fld << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			int var17 = var1 + var2 * au_fld;
			int var14 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var15 = aa_fld - var2;
				var4 -= var15;
				var17 += var15 * au_fld;
				var8 += var12 * var15;
			}

			if (var1 + var3 > am_fld) {
				int var18 = var1 + var3 - am_fld;
				var3 -= var18;
				var14 += var18;
			}

			if (var1 < aq_fld) {
				int var19 = aq_fld - var1;
				var3 -= var19;
				var17 += var19;
				var7 += var11 * var19;
				var14 += var19;
			}

			az(al_fld, this.ah_fld, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ht(int var1, int var2, int var3) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var4 = var1 + var2 * au_fld;
		int var5 = 0;
		int var6 = this.ay_fld;
		int var7 = this.aw_fld;
		int var8 = au_fld - var7;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var6 -= var10;
			var2 = aa_fld;
			var5 += var10 * var7;
			var4 += var10 * au_fld;
		}

		if (var2 + var6 > ai_fld) {
			var6 -= var2 + var6 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var13 = aq_fld - var1;
			var7 -= var13;
			var1 = aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > am_fld) {
			int var14 = var1 + var7 - am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			ae(al_fld, this.ah_fld, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII[I[I)V"
	)
	public void ip(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
		try {
			int var13 = -var3 / 2;
			int var14 = -var4 / 2;
			int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
			int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
			var15 = (int)(((long)var15 << 8) / var8);
			var16 = (int)(((long)var16 << 8) / var8);
			int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
			int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
			int var19 = var1 + var2 * au_fld;

			for (int var20 = 0; var20 < var4; var20++) {
				int var21 = var2 + var20;
				int var22 = var21 - var10;
				if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
					int var23 = var19;
					int var24 = var17;
					int var25 = var18;

					for (int var26 = -var3; var26 < 0; var26++) {
						int var27 = var1 + var3 + var26;
						int var28 = var27 - var9;
						if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
							int var29 = var24 >> 16;
							int var30 = var25 >> 16;
							if (var29 >= 0 && var29 < this.aw_fld && var30 >= 0 && var30 < this.ay_fld) {
								int var31 = var29 + var30 * this.aw_fld;
								int var32 = this.ah_fld[var31];
								if (var32 != 0) {
									al_fld[var23] = var32;
								}
							}
						}

						var23++;
						var24 += var16;
						var25 -= var15;
					}
				}

				var17 += var15;
				var18 += var16;
				var19 += au_fld;
			}
		} catch (Exception var33) {
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void at(int var1, int var2, int var3, int var4) {
		if (var3 == 1196010462) {
			this.ab(var1, var2);
		} else {
			var1 += this.as_fld;
			var2 += this.ar_fld;
			int var5 = var1 + var2 * au_fld;
			int var6 = 0;
			int var7 = this.ay_fld;
			int var8 = this.aw_fld;
			int var9 = au_fld - var8;
			int var10 = 0;
			if (var2 < aa_fld) {
				int var11 = aa_fld - var2;
				var7 -= var11;
				var2 = aa_fld;
				var6 += var11 * var8;
				var5 += var11 * au_fld;
			}

			if (var2 + var7 > ai_fld) {
				var7 -= var2 + var7 - ai_fld;
			}

			if (var1 < aq_fld) {
				int var14 = aq_fld - var1;
				var8 -= var14;
				var1 = aq_fld;
				var6 += var14;
				var5 += var14;
				var10 += var14;
				var9 += var14;
			}

			if (var1 + var8 > am_fld) {
				int var15 = var1 + var8 - am_fld;
				var8 -= var15;
				var10 += var15;
				var9 += var15;
			}

			if (var8 > 0 && var7 > 0) {
				av(al_fld, this.ah_fld, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}

	@ObfuscatedName("getWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWidth() {
		return this.aw_fld;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void dx(int var1, int var2, int var3, int var4) {
		if (var3 == 766276948) {
			this.ab(var1, var2);
		} else {
			var1 += this.as_fld;
			var2 += this.ar_fld;
			int var5 = var1 + var2 * au_fld;
			int var6 = 0;
			int var7 = this.ay_fld;
			int var8 = this.aw_fld;
			int var9 = au_fld - var8;
			int var10 = 0;
			if (var2 < aa_fld) {
				int var11 = aa_fld - var2;
				var7 -= var11;
				var2 = aa_fld;
				var6 += var11 * var8;
				var5 += var11 * au_fld;
			}

			if (var2 + var7 > ai_fld) {
				var7 -= var2 + var7 - ai_fld;
			}

			if (var1 < aq_fld) {
				int var14 = aq_fld - var1;
				var8 -= var14;
				var1 = aq_fld;
				var6 += var14;
				var5 += var14;
				var10 += var14;
				var9 += var14;
			}

			if (var1 + var8 > am_fld) {
				int var15 = var1 + var8 - am_fld;
				var8 -= var15;
				var10 += var15;
				var9 += var15;
			}

			if (var8 > 0 && var7 > 0) {
				av(al_fld, this.ah_fld, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ds(int var1, int var2, int var3, int var4) {
		if (var3 == -370628808) {
			this.ab(var1, var2);
		} else {
			var1 += this.as_fld;
			var2 += this.ar_fld;
			int var5 = var1 + var2 * au_fld;
			int var6 = 0;
			int var7 = this.ay_fld;
			int var8 = this.aw_fld;
			int var9 = au_fld - var8;
			int var10 = 0;
			if (var2 < aa_fld) {
				int var11 = aa_fld - var2;
				var7 -= var11;
				var2 = aa_fld;
				var6 += var11 * var8;
				var5 += var11 * au_fld;
			}

			if (var2 + var7 > ai_fld) {
				var7 -= var2 + var7 - ai_fld;
			}

			if (var1 < aq_fld) {
				int var14 = aq_fld - var1;
				var8 -= var14;
				var1 = aq_fld;
				var6 += var14;
				var5 += var14;
				var10 += var14;
				var9 += var14;
			}

			if (var1 + var8 > am_fld) {
				int var15 = var1 + var8 - am_fld;
				var8 -= var15;
				var10 += var15;
				var9 += var15;
			}

			if (var8 > 0 && var7 > 0) {
				av(al_fld, this.ah_fld, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}

	yv() {
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	public static void jw(yv var0) {
		du(var0.ah_fld, var0.aw_fld, var0.ay_fld, null);
	}

	@ObfuscatedName("getPixels")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getPixels() {
		return this.ah_fld;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void hx(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.aw_fld;
			int var7 = this.ay_fld;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.ad_fld;
			int var11 = this.ao_fld;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			if (this.as_fld > 0) {
				int var14 = ((this.as_fld << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var17 = ((this.ar_fld << 16) + var13 - 1) / var13;
				var2 += var17;
				var9 += var17 * var13 - (this.ar_fld << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			int var18 = var1 + var2 * au_fld;
			int var15 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var16 = aa_fld - var2;
				var4 -= var16;
				var18 += var16 * au_fld;
				var9 += var13 * var16;
			}

			if (var1 + var3 > am_fld) {
				int var19 = var1 + var3 - am_fld;
				var3 -= var19;
				var15 += var19;
			}

			if (var1 < aq_fld) {
				int var20 = aq_fld - var1;
				var3 -= var20;
				var18 += var20;
				var8 += var12 * var20;
				var15 += var20;
			}

			ah(al_fld, this.ah_fld, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void wq() {
		this.ax();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III[I[IIIIIIIII)V"
	)
	static void aw(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		for (int var19 = -var10; var19 < 0; var19++) {
			for (int var18 = -var9; var18 < 0; var18++) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var7++;
				}
			}

			var7 += var11;
			var5 += var12;
		}
	}

	@ObfuscatedName("setMaxWidth")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setMaxWidth(int var1) {
		this.ad_fld = var1;
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	public static void ec(yv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.aw_fld != var0.ad_fld || var0.ay_fld != var0.ao_fld) {
			int[] var1 = new int[var0.ad_fld * var0.ao_fld];

			for (int var2 = 0; var2 < var0.ay_fld; var2++) {
				for (int var3 = 0; var3 < var0.aw_fld; var3++) {
					var1[(var2 + var0.ar_fld) * var0.ad_fld + var3 + var0.as_fld] = var0.ah_fld[var2 * var0.aw_fld + var3];
				}
			}

			var0.ah_fld = var1;
			var0.aw_fld = var0.ad_fld;
			var0.ay_fld = var0.ao_fld;
			var0.as_fld = 0;
			var0.ar_fld = 0;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void bh(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.as_fld << 4;
			var2 -= this.ar_fld << 4;
			double var7 = (var5 & 65535) * 9.587379924285257E-5;
			int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
			int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = -(-var1) * var9 + -var2 * var10;
			int var13 = ((this.aw_fld << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((this.aw_fld << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((this.ay_fld << 4) - var2) * var9;
			int var16 = -(-var1) * var9 + ((this.ay_fld << 4) - var2) * var10;
			int var17 = ((this.aw_fld << 4) - var1) * var10 + ((this.ay_fld << 4) - var2) * var9;
			int var18 = -((this.aw_fld << 4) - var1) * var9 + ((this.ay_fld << 4) - var2) * var10;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19) {
				var19 = var15;
			}

			if (var17 < var19) {
				var19 = var17;
			}

			if (var15 > var20) {
				var20 = var15;
			}

			if (var17 > var20) {
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21) {
				var21 = var16;
			}

			if (var18 < var21) {
				var21 = var18;
			}

			if (var16 > var22) {
				var22 = var16;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			var19 >>= 12;
			var20 = var20 + 4095 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < aq_fld) {
				var19 = aq_fld;
			}

			if (var20 > am_fld) {
				var20 = am_fld;
			}

			if (var21 < aa_fld) {
				var21 = aa_fld;
			}

			if (var22 > ai_fld) {
				var22 = ai_fld;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = var21 * au_fld + var19;
					double var24 = 1.6777216E7 / var6;
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					if (var27 == 0) {
						if (var26 == 0) {
							for (int var33 = var22; var33 < 0; var23 += au_fld) {
								int var34 = var23;
								int var35 = var30;
								int var36 = var31;
								int var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (this.aw_fld << 12) < 0 && var31 - (this.ay_fld << 12) < 0) {
									for (; var37 < 0; var37++) {
										int var38 = this.ah_fld[(var36 >> 12) * this.aw_fld + (var35 >> 12)];
										if (var38 != 0) {
											al_fld[var34++] = var38 | 0xFF000000;
										} else {
											var34++;
										}
									}
								}

								var33++;
							}
						} else if (var26 < 0) {
							for (int var84 = var22; var84 < 0; var23 += au_fld) {
								int var92 = var23;
								int var100 = var30;
								int var108 = var31 + (var28 * var26 >> 4);
								int var116 = var20;
								if (var30 >= 0 && var30 - (this.aw_fld << 12) < 0) {
									int var32;
									if ((var32 = var108 - (this.ay_fld << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var116 = var20 + var32;
										var108 += var26 * var32;
										var92 = var23 + var32;
									}

									if ((var32 = (var108 - var26) / var26) > var116) {
										var116 = var32;
									}

									while (var116 < 0) {
										int var124 = this.ah_fld[(var108 >> 12) * this.aw_fld + (var100 >> 12)];
										if (var124 != 0) {
											al_fld[var92++] = var124 | 0xFF000000;
										} else {
											var92++;
										}

										var108 += var26;
										var116++;
									}
								}

								var84++;
								var30 -= var26;
							}
						} else {
							for (int var85 = var22; var85 < 0; var23 += au_fld) {
								int var93 = var23;
								int var101 = var30;
								int var109 = var31 + (var28 * var26 >> 4);
								int var117 = var20;
								if (var30 >= 0 && var30 - (this.aw_fld << 12) < 0) {
									if (var109 < 0) {
										int var57 = (var26 - 1 - var109) / var26;
										var117 = var20 + var57;
										var109 += var26 * var57;
										var93 = var23 + var57;
									}

									int var58;
									if ((var58 = (1 + var109 - (this.ay_fld << 12) - var26) / var26) > var117) {
										var117 = var58;
									}

									while (var117 < 0) {
										int var125 = this.ah_fld[(var109 >> 12) * this.aw_fld + (var101 >> 12)];
										if (var125 != 0) {
											al_fld[var93++] = var125 | 0xFF000000;
										} else {
											var93++;
										}

										var109 += var26;
										var117++;
									}
								}

								var85++;
								var30 -= var26;
							}
						}
					} else if (var27 < 0) {
						if (var26 == 0) {
							for (int var86 = var22; var86 < 0; var23 += au_fld) {
								int var94 = var23;
								int var102 = var30 + (var28 * var27 >> 4);
								int var110 = var31;
								int var118 = var20;
								if (var31 >= 0 && var31 - (this.ay_fld << 12) < 0) {
									int var59;
									if ((var59 = var102 - (this.aw_fld << 12)) >= 0) {
										var59 = (var27 - var59) / var27;
										var118 = var20 + var59;
										var102 += var27 * var59;
										var94 = var23 + var59;
									}

									if ((var59 = (var102 - var27) / var27) > var118) {
										var118 = var59;
									}

									while (var118 < 0) {
										int var126 = this.ah_fld[(var110 >> 12) * this.aw_fld + (var102 >> 12)];
										if (var126 != 0) {
											al_fld[var94++] = var126 | 0xFF000000;
										} else {
											var94++;
										}

										var102 += var27;
										var118++;
									}
								}

								var86++;
								var31 += var27;
							}
						} else if (var26 < 0) {
							for (int var87 = var22; var87 < 0; var23 += au_fld) {
								int var95 = var23;
								int var103 = var30 + (var28 * var27 >> 4);
								int var111 = var31 + (var28 * var26 >> 4);
								int var119 = var20;
								int var62;
								if ((var62 = var103 - (this.aw_fld << 12)) >= 0) {
									var62 = (var27 - var62) / var27;
									var119 = var20 + var62;
									var103 += var27 * var62;
									var111 += var26 * var62;
									var95 = var23 + var62;
								}

								if ((var62 = (var103 - var27) / var27) > var119) {
									var119 = var62;
								}

								if ((var62 = var111 - (this.ay_fld << 12)) >= 0) {
									var62 = (var26 - var62) / var26;
									var119 += var62;
									var103 += var27 * var62;
									var111 += var26 * var62;
									var95 += var62;
								}

								if ((var62 = (var111 - var26) / var26) > var119) {
									var119 = var62;
								}

								while (var119 < 0) {
									int var127 = this.ah_fld[(var111 >> 12) * this.aw_fld + (var103 >> 12)];
									if (var127 != 0) {
										al_fld[var95++] = var127 | 0xFF000000;
									} else {
										var95++;
									}

									var103 += var27;
									var111 += var26;
									var119++;
								}

								var87++;
								var30 -= var26;
								var31 += var27;
							}
						} else {
							for (int var88 = var22; var88 < 0; var23 += au_fld) {
								int var96 = var23;
								int var104 = var30 + (var28 * var27 >> 4);
								int var112 = var31 + (var28 * var26 >> 4);
								int var120 = var20;
								int var68;
								if ((var68 = var104 - (this.aw_fld << 12)) >= 0) {
									var68 = (var27 - var68) / var27;
									var120 = var20 + var68;
									var104 += var27 * var68;
									var112 += var26 * var68;
									var96 = var23 + var68;
								}

								if ((var68 = (var104 - var27) / var27) > var120) {
									var120 = var68;
								}

								if (var112 < 0) {
									var68 = (var26 - 1 - var112) / var26;
									var120 += var68;
									var104 += var27 * var68;
									var112 += var26 * var68;
									var96 += var68;
								}

								if ((var68 = (1 + var112 - (this.ay_fld << 12) - var26) / var26) > var120) {
									var120 = var68;
								}

								while (var120 < 0) {
									int var128 = this.ah_fld[(var112 >> 12) * this.aw_fld + (var104 >> 12)];
									if (var128 != 0) {
										al_fld[var96++] = var128 | 0xFF000000;
									} else {
										var96++;
									}

									var104 += var27;
									var112 += var26;
									var120++;
								}

								var88++;
								var30 -= var26;
								var31 += var27;
							}
						}
					} else if (var26 == 0) {
						for (int var89 = var22; var89 < 0; var23 += au_fld) {
							int var97 = var23;
							int var105 = var30 + (var28 * var27 >> 4);
							int var113 = var31;
							int var121 = var20;
							if (var31 >= 0 && var31 - (this.ay_fld << 12) < 0) {
								if (var105 < 0) {
									int var73 = (var27 - 1 - var105) / var27;
									var121 = var20 + var73;
									var105 += var27 * var73;
									var97 = var23 + var73;
								}

								int var74;
								if ((var74 = (1 + var105 - (this.aw_fld << 12) - var27) / var27) > var121) {
									var121 = var74;
								}

								while (var121 < 0) {
									int var129 = this.ah_fld[(var113 >> 12) * this.aw_fld + (var105 >> 12)];
									if (var129 != 0) {
										al_fld[var97++] = var129 | 0xFF000000;
									} else {
										var97++;
									}

									var105 += var27;
									var121++;
								}
							}

							var89++;
							var31 += var27;
						}
					} else if (var26 < 0) {
						for (int var90 = var22; var90 < 0; var23 += au_fld) {
							int var98 = var23;
							int var106 = var30 + (var28 * var27 >> 4);
							int var114 = var31 + (var28 * var26 >> 4);
							int var122 = var20;
							if (var106 < 0) {
								int var75 = (var27 - 1 - var106) / var27;
								var122 = var20 + var75;
								var106 += var27 * var75;
								var114 += var26 * var75;
								var98 = var23 + var75;
							}

							int var76;
							if ((var76 = (1 + var106 - (this.aw_fld << 12) - var27) / var27) > var122) {
								var122 = var76;
							}

							if ((var76 = var114 - (this.ay_fld << 12)) >= 0) {
								var76 = (var26 - var76) / var26;
								var122 += var76;
								var106 += var27 * var76;
								var114 += var26 * var76;
								var98 += var76;
							}

							if ((var76 = (var114 - var26) / var26) > var122) {
								var122 = var76;
							}

							while (var122 < 0) {
								int var130 = this.ah_fld[(var114 >> 12) * this.aw_fld + (var106 >> 12)];
								if (var130 != 0) {
									al_fld[var98++] = var130 | 0xFF000000;
								} else {
									var98++;
								}

								var106 += var27;
								var114 += var26;
								var122++;
							}

							var90++;
							var30 -= var26;
							var31 += var27;
						}
					} else {
						for (int var91 = var22; var91 < 0; var23 += au_fld) {
							int var99 = var23;
							int var107 = var30 + (var28 * var27 >> 4);
							int var115 = var31 + (var28 * var26 >> 4);
							int var123 = var20;
							if (var107 < 0) {
								int var80 = (var27 - 1 - var107) / var27;
								var123 = var20 + var80;
								var107 += var27 * var80;
								var115 += var26 * var80;
								var99 = var23 + var80;
							}

							int var81;
							if ((var81 = (1 + var107 - (this.aw_fld << 12) - var27) / var27) > var123) {
								var123 = var81;
							}

							if (var115 < 0) {
								var81 = (var26 - 1 - var115) / var26;
								var123 += var81;
								var107 += var27 * var81;
								var115 += var26 * var81;
								var99 += var81;
							}

							if ((var81 = (1 + var115 - (this.ay_fld << 12) - var26) / var26) > var123) {
								var123 = var81;
							}

							while (var123 < 0) {
								int var131 = this.ah_fld[(var115 >> 12) * this.aw_fld + (var107 >> 12)];
								if (var131 != 0) {
									al_fld[var99++] = var131 | 0xFF000000;
								} else {
									var99++;
								}

								var107 += var27;
								var115 += var26;
								var123++;
							}

							var91++;
							var30 -= var26;
							var31 += var27;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv cf() {
		yv var1 = new yv(this.aw_fld, this.ay_fld);
		var1.ad_fld = this.ad_fld;
		var1.ao_fld = this.ao_fld;
		var1.as_fld = this.ad_fld - this.aw_fld - this.as_fld;
		var1.ar_fld = this.ar_fld;

		for (int var2 = 0; var2 < this.ay_fld; var2++) {
			for (int var3 = 0; var3 < this.aw_fld; var3++) {
				var1.ah_fld[var2 * this.aw_fld + var3] = this.ah_fld[var2 * this.aw_fld + this.aw_fld - 1 - var3];
			}
		}

		return var1;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)Lyv;"
	)
	public static yv dm(yv var0) {
		yv var1 = new yv(var0.aw_fld, var0.ay_fld);
		var1.ad_fld = var0.ad_fld;
		var1.ao_fld = var0.ao_fld;
		var1.as_fld = var0.ad_fld - var0.aw_fld - var0.as_fld;
		var1.ar_fld = var0.ar_fld;

		for (int var2 = 0; var2 < var0.ay_fld; var2++) {
			for (int var3 = 0; var3 < var0.aw_fld; var3++) {
				var1.ah_fld[var2 * var0.aw_fld + var3] = var0.ah_fld[var2 * var0.aw_fld + var0.aw_fld - 1 - var3];
			}
		}

		return var1;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ho(int var1, int var2, int var3) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var4 = var1 + var2 * au_fld;
		int var5 = 0;
		int var6 = this.ay_fld;
		int var7 = this.aw_fld;
		int var8 = au_fld - var7;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var6 -= var10;
			var2 = aa_fld;
			var5 += var10 * var7;
			var4 += var10 * au_fld;
		}

		if (var2 + var6 > ai_fld) {
			var6 -= var2 + var6 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var13 = aq_fld - var1;
			var7 -= var13;
			var1 = aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > am_fld) {
			int var14 = var1 + var7 - am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == -799534340) {
				aw(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				ay(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hm(int var1, int var2, int var3) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var4 = var1 + var2 * au_fld;
		int var5 = 0;
		int var6 = this.ay_fld;
		int var7 = this.aw_fld;
		int var8 = au_fld - var7;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var6 -= var10;
			var2 = aa_fld;
			var5 += var10 * var7;
			var4 += var10 * au_fld;
		}

		if (var2 + var6 > ai_fld) {
			var6 -= var2 + var6 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var13 = aq_fld - var1;
			var7 -= var13;
			var1 = aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > am_fld) {
			int var14 = var1 + var7 - am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == 1745725310) {
				aw(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				ay(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void hy(int var1, int var2, int var3) {
		var1 += this.as_fld;
		var2 += this.ar_fld;
		int var4 = var1 + var2 * au_fld;
		int var5 = 0;
		int var6 = this.ay_fld;
		int var7 = this.aw_fld;
		int var8 = au_fld - var7;
		int var9 = 0;
		if (var2 < aa_fld) {
			int var10 = aa_fld - var2;
			var6 -= var10;
			var2 = aa_fld;
			var5 += var10 * var7;
			var4 += var10 * au_fld;
		}

		if (var2 + var6 > ai_fld) {
			var6 -= var2 + var6 - ai_fld;
		}

		if (var1 < aq_fld) {
			int var13 = aq_fld - var1;
			var7 -= var13;
			var1 = aq_fld;
			var5 += var13;
			var4 += var13;
			var9 += var13;
			var8 += var13;
		}

		if (var1 + var7 > am_fld) {
			int var14 = var1 + var7 - am_fld;
			var7 -= var14;
			var9 += var14;
			var8 += var14;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == 256) {
				aw(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				ay(0, 0, 0, al_fld, this.ah_fld, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII[I[IIIIIIIIIII)V"
	)
	static void as(
		int var0,
		int var1,
		int var2,
		int var3,
		int[] var4,
		int[] var5,
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
		int var16 = var3;

		while (var8 < 0) {
			var7 = (var9 >> 16) * var15;

			for (int var22 = -var12; var22 < 0; var22++) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					var10++;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var16;
			var10 += var11;
			var8++;
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void ie(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.aw_fld;
			int var7 = this.ay_fld;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.ad_fld;
			int var11 = this.ao_fld;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			if (this.as_fld > 0) {
				int var14 = ((this.as_fld << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var17 = ((this.ar_fld << 16) + var13 - 1) / var13;
				var2 += var17;
				var9 += var17 * var13 - (this.ar_fld << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			int var18 = var1 + var2 * au_fld;
			int var15 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var16 = aa_fld - var2;
				var4 -= var16;
				var18 += var16 * au_fld;
				var9 += var13 * var16;
			}

			if (var1 + var3 > am_fld) {
				int var19 = var1 + var3 - am_fld;
				var3 -= var19;
				var15 += var19;
			}

			if (var1 < aq_fld) {
				int var20 = aq_fld - var1;
				var3 -= var20;
				var18 += var20;
				var8 += var12 * var20;
				var15 += var20;
			}

			if (var5 == 256) {
				as(0, 0, 0, var8, this.ah_fld, al_fld, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
			} else {
				ar(0, 0, 0, var8, this.ah_fld, al_fld, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
			}
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	public void iv(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.aw_fld;
			int var7 = this.ay_fld;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.ad_fld;
			int var11 = this.ao_fld;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			if (this.as_fld > 0) {
				int var14 = ((this.as_fld << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var17 = ((this.ar_fld << 16) + var13 - 1) / var13;
				var2 += var17;
				var9 += var17 * var13 - (this.ar_fld << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			int var18 = var1 + var2 * au_fld;
			int var15 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var16 = aa_fld - var2;
				var4 -= var16;
				var18 += var16 * au_fld;
				var9 += var13 * var16;
			}

			if (var1 + var3 > am_fld) {
				int var19 = var1 + var3 - am_fld;
				var3 -= var19;
				var15 += var19;
			}

			if (var1 < aq_fld) {
				int var20 = aq_fld - var1;
				var3 -= var20;
				var18 += var20;
				var8 += var12 * var20;
				var15 += var20;
			}

			if (var5 == -369194137) {
				as(0, 0, 0, var8, this.ah_fld, al_fld, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6);
			} else {
				ar(0, 0, 0, var8, this.ah_fld, al_fld, 0, 0, -var4, var9, var18, var15, var3, var12, var13, var6, var5);
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[I[I)V"
	)
	public void im(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var9 = var2 < 0 ? -var2 : 0;
		int var10 = var2 + this.ay_fld <= var6 ? this.ay_fld : var6 - var2;
		int var11 = var1 < 0 ? -var1 : 0;
		if (var1 + this.aw_fld > var5) {
			int var10000 = var5 - var1;
		}

		int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * au_fld;
		int var14 = var2 + var9;

		for (int var15 = var9; var15 < var10; var15++) {
			int var16 = var7[var14];
			int var17 = var8[var14++];
			int var18 = var13;
			int var19;
			if (var1 < var16) {
				var19 = var16 - var1;
				var18 = var13 + (var19 - var11);
			} else {
				var19 = var11;
			}

			int var12;
			if (var1 + this.aw_fld <= var16 + var17) {
				var12 = this.aw_fld;
			} else {
				var12 = var16 + var17 - var1;
			}

			for (int var20 = var19; var20 < var12; var20++) {
				int var21 = this.ah_fld[var20 + var15 * this.aw_fld];
				if (var21 != 0) {
					al_fld[var18++] = var21;
				} else {
					var18++;
				}
			}

			var13 += au_fld;
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII[I[I)V"
	)
	public void if_(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
		try {
			int var13 = -var3 / 2;
			int var14 = -var4 / 2;
			int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
			int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
			var15 = (int)(((long)var15 << 8) / var8);
			var16 = (int)(((long)var16 << 8) / var8);
			int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
			int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
			int var19 = var1 + var2 * au_fld;

			for (int var20 = 0; var20 < var4; var20++) {
				int var21 = var2 + var20;
				int var22 = var21 - var10;
				if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
					int var23 = var19;
					int var24 = var17;
					int var25 = var18;

					for (int var26 = -var3; var26 < 0; var26++) {
						int var27 = var1 + var3 + var26;
						int var28 = var27 - var9;
						if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
							int var29 = var24 >> 16;
							int var30 = var25 >> 16;
							if (var29 >= 0 && var29 < this.aw_fld && var30 >= 0 && var30 < this.ay_fld) {
								int var31 = var29 + var30 * this.aw_fld;
								int var32 = this.ah_fld[var31];
								if (var32 != 0) {
									al_fld[var23] = var32;
								}
							}
						}

						var23++;
						var24 += var16;
						var25 -= var15;
					}
				}

				var17 += var15;
				var18 += var16;
				var19 += au_fld;
			}
		} catch (Exception var33) {
		}
	}

	@ObfuscatedName("toBufferedOutline")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Color;)Ljava/awt/image/BufferedImage;"
	)
	@Override
	public BufferedImage toBufferedOutline(Color var1) {
		BufferedImage var2 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
		this.toBufferedOutline(var2, var1.getRGB());
		return var2;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII[I[I)V"
	)
	public void il(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12) {
		try {
			int var13 = -var3 / 2;
			int var14 = -var4 / 2;
			int var15 = (int)(Math.sin(var7 / 326.11) * 65536.0);
			int var16 = (int)(Math.cos(var7 / 326.11) * 65536.0);
			var15 = (int)(((long)var15 << 8) / var8);
			var16 = (int)(((long)var16 << 8) / var8);
			int var17 = (var5 << 16) + var14 * var15 + var13 * var16;
			int var18 = (var6 << 16) + (var14 * var16 - var13 * var15);
			int var19 = var1 + var2 * au_fld;

			for (int var20 = 0; var20 < var4; var20++) {
				int var21 = var2 + var20;
				int var22 = var21 - var10;
				if (var22 >= 0 && var22 < var11.length && var11[var22] >= 0) {
					int var23 = var19;
					int var24 = var17;
					int var25 = var18;

					for (int var26 = -var3; var26 < 0; var26++) {
						int var27 = var1 + var3 + var26;
						int var28 = var27 - var9;
						if (var28 >= var11[var22] && var28 < var11[var22] + var12[var22]) {
							int var29 = var24 >> 16;
							int var30 = var25 >> 16;
							if (var29 >= 0 && var29 < this.aw_fld && var30 >= 0 && var30 < this.ay_fld) {
								int var31 = var29 + var30 * this.aw_fld;
								int var32 = this.ah_fld[var31];
								if (var32 != 0) {
									al_fld[var23] = var32;
								}
							}
						}

						var23++;
						var24 += var16;
						var25 -= var15;
					}
				}

				var17 += var15;
				var18 += var16;
				var19 += au_fld;
			}
		} catch (Exception var33) {
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIIIIIII)V"
	)
	static void bi(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = -66341012 - var12;
		int var14 = var3;

		for (int var15 = -var8; var15 < 0; var15++) {
			int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; var17++) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var18 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -2089643993)
							+ ((var2 & 0xFF00) * var12 + (var18 & -1567839190) * var13 & -685096743)
						>> 8;
				} else {
					var5++;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var14;
			var5 += var6;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([I[IIIIIIII)V"
	)
	static void ag(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}
			}

			for (int var24 = var5; var24 < 0; var24++) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2 | 0xFF000000;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ik(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.aw_fld;
			int var6 = this.ay_fld;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.ad_fld;
			int var10 = this.ao_fld;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			if (this.as_fld > 0) {
				int var13 = ((this.as_fld << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.as_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var16 = ((this.ar_fld << 16) + var12 - 1) / var12;
				var2 += var16;
				var8 += var16 * var12 - (this.ar_fld << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			int var17 = var1 + var2 * au_fld;
			int var14 = au_fld - var3;
			if (var2 + var4 > ai_fld) {
				var4 -= var2 + var4 - ai_fld;
			}

			if (var2 < aa_fld) {
				int var15 = aa_fld - var2;
				var4 -= var15;
				var17 += var15 * au_fld;
				var8 += var12 * var15;
			}

			if (var1 + var3 > am_fld) {
				int var18 = var1 + var3 - am_fld;
				var3 -= var18;
				var14 += var18;
			}

			if (var1 < aq_fld) {
				int var19 = aq_fld - var1;
				var3 -= var19;
				var17 += var19;
				var7 += var11 * var19;
				var14 += var19;
			}

			az(al_fld, this.ah_fld, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void bk(int var1, int var2, int var3, int var4) {
		if (var3 <= this.ad_fld && var4 <= this.ao_fld) {
			int var5 = var1 + this.as_fld * var3 / this.ad_fld;
			int var6 = var1 + ((this.as_fld + this.aw_fld) * var3 + this.ad_fld - 1) / this.ad_fld;
			int var7 = var2 + this.ar_fld * var4 / this.ao_fld;
			int var8 = var2 + ((this.ar_fld + this.ay_fld) * var4 + this.ao_fld - 1) / this.ao_fld;
			if (var5 < aq_fld) {
				var5 = aq_fld;
			}

			if (var6 > am_fld) {
				var6 = am_fld;
			}

			if (var7 < aa_fld) {
				var7 = aa_fld;
			}

			if (var8 > ai_fld) {
				var8 = ai_fld;
			}

			if (var5 < var6 && var7 < var8) {
				int var9 = var7 * au_fld + var5;
				int var10 = au_fld - (var6 - var5);
				if (var9 < al_fld.length) {
					for (int var11 = var7; var11 < var8; var11++) {
						for (int var12 = var5; var12 < var6; var12++) {
							int var13 = var12 - var1 << 4;
							int var14 = var11 - var2 << 4;
							int var15 = var13 * this.ad_fld / var3 - (this.as_fld << 4);
							int var16 = (var13 + 16) * this.ad_fld / var3 - (this.as_fld << 4);
							int var17 = var14 * this.ao_fld / var4 - (this.ar_fld << 4);
							int var18 = (var14 + 16) * this.ao_fld / var4 - (this.ar_fld << 4);
							int var19 = (var16 - var15) * (var18 - var17) >> 1;
							if (var19 != 0) {
								if (var15 < 0) {
									var15 = 0;
								}

								if (var16 >= this.aw_fld << 4) {
									var16 = this.aw_fld << 4;
								}

								if (var17 < 0) {
									var17 = 0;
								}

								if (var18 >= this.ay_fld << 4) {
									var18 = this.ay_fld << 4;
								}

								var16--;
								var18--;
								int var20 = 16 - (var15 & 15);
								int var21 = (var16 & 15) + 1;
								int var22 = 16 - (var17 & 15);
								int var23 = (var18 & 15) + 1;
								var15 >>= 4;
								var16 >>= 4;
								var17 >>= 4;
								var18 >>= 4;
								int var24 = 0;
								int var25 = 0;
								int var26 = 0;
								int var27 = 0;

								for (int var28 = var17; var28 <= var18; var28++) {
									int var29 = 16;
									if (var28 == var17) {
										var29 = var22;
									}

									if (var28 == var18) {
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; var30++) {
										int var31 = this.ah_fld[var28 * this.aw_fld + var30];
										if (var31 != 0) {
											int var32;
											if (var30 == var15) {
												var32 = var29 * var20;
											} else if (var30 == var16) {
												var32 = var29 * var21;
											} else {
												var32 = var29 << 4;
											}

											var27 += var32;
											var24 += (var31 >> 16 & -243386724) * var32;
											var25 += (var31 >> 8 & -99882113) * var32;
											var26 += (var31 & 992957813) * var32;
										}
									}
								}

								if (var27 >= var19) {
									int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
									if (var39 == 0) {
										var39 = 1;
									}

									al_fld[var9] = var39;
								}

								var9++;
							}
						}

						var9 += var10;
					}
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv au() {
		yv var1 = new yv(this.aw_fld, this.ad_fld);
		var1.as_fld = this.ad_fld;
		var1.aw_fld = this.ao_fld;
		var1.ay_fld = this.as_fld;
		var1.ar_fld = this.ar_fld;
		int var2 = this.ah_fld.length;

		for (int var3 = 0; var3 < var2; var3++) {
			var1.ah_fld[var3] = this.ah_fld[var3];
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void an() {
		if (this.ay_fld != this.ao_fld || this.ao_fld != this.aw_fld) {
			int[] var1 = new int[this.ad_fld * this.ao_fld];

			for (int var2 = 0; var2 < this.ay_fld; var2++) {
				for (int var3 = 0; var3 < this.as_fld; var3++) {
					var1[(var2 + this.ar_fld) * this.as_fld + var3 + this.ad_fld] = this.ah_fld[var2 * this.ao_fld + var3];
				}
			}

			this.ah_fld = var1;
			this.as_fld = this.aw_fld;
			this.as_fld = this.aw_fld;
			this.ay_fld = 0;
			this.ar_fld = 0;
		}
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(Lyv;)V"
	)
	public static void qf(yv var0) {
		du(var0.ah_fld, var0.aw_fld, var0.ay_fld, null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aq() {
		int[] var1 = new int[this.ad_fld * this.ay_fld];
		int var2 = 0;

		for (int var3 = this.ao_fld - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.ao_fld; var4++) {
				var1[var2++] = this.ah_fld[var4 + var3 * this.ao_fld];
			}
		}

		this.ah_fld = var1;
		this.ar_fld = this.ao_fld - this.ad_fld - this.ar_fld;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void dr(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.ad_fld;
			int var6 = this.ao_fld;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.ao_fld;
			int var10 = this.ay_fld;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			if (this.ad_fld > 0) {
				int var13 = ((this.as_fld << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.ao_fld << 16);
			}

			if (this.ar_fld > 0) {
				int var16 = ((this.ar_fld << 16) + var12 - 1) / var12;
				var2 += var16;
				var8 += var16 * var12 - (this.ar_fld << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			int var17 = var1 + var2 * yu.am_fld;
			int var14 = yu.aq_fld - var3;
			if (var2 + var4 > yu.aa_fld) {
				var4 -= var2 + var4 - yu.am_fld;
			}

			if (var2 < aa_fld) {
				int var15 = aa_fld - var2;
				var4 -= var15;
				var17 += var15 * yu.aa_fld;
				var8 += var12 * var15;
			}

			if (var1 + var3 > yu.aa_fld) {
				int var18 = var1 + var3 - yu.ai_fld;
				var3 -= var18;
				var14 += var18;
			}

			if (var1 < aq_fld) {
				int var19 = yu.am_fld - var1;
				var3 -= var19;
				var17 += var19;
				var7 += var11 * var19;
				var14 += var19;
			}

			az(al_fld, this.ah_fld, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void dl(int var1, int var2, int var3, int var4) {
		if (var3 <= this.ay_fld && var4 <= this.as_fld) {
			int var5 = var1 + this.aw_fld * var3 / this.ad_fld;
			int var6 = var1 + ((this.aw_fld + this.ad_fld) * var3 + this.ad_fld - 1) / this.as_fld;
			int var7 = var2 + this.ar_fld * var4 / this.ad_fld;
			int var8 = var2 + ((this.ar_fld + this.ad_fld) * var4 + this.aw_fld - 1) / this.ad_fld;
			if (var5 < aq_fld) {
				var5 = yu.am_fld;
			}

			if (var6 > yu.aq_fld) {
				var6 = yu.aq_fld;
			}

			if (var7 < yu.am_fld) {
				var7 = yu.ax_fld;
			}

			if (var8 > ai_fld) {
				var8 = yu.aa_fld;
			}

			if (var5 < var6 && var7 < var8) {
				int var9 = var7 * yu.am_fld + var5;
				int var10 = au_fld - (var6 - var5);
				if (var9 < al_fld.length) {
					for (int var11 = var7; var11 < var8; var11++) {
						for (int var12 = var5; var12 < var6; var12++) {
							int var13 = var12 - var1 << 4;
							int var14 = var11 - var2 << 4;
							int var15 = var13 * this.ao_fld / var3 - (this.ad_fld << 4);
							int var16 = (var13 + 16) * this.ao_fld / var3 - (this.ad_fld << 4);
							int var17 = var14 * this.ao_fld / var4 - (this.ar_fld << 4);
							int var18 = (var14 + 16) * this.as_fld / var4 - (this.ar_fld << 4);
							int var19 = (var16 - var15) * (var18 - var17) >> 1;
							if (var19 != 0) {
								if (var15 < 0) {
									var15 = 0;
								}

								if (var16 >= this.ad_fld << 4) {
									var16 = this.as_fld << 4;
								}

								if (var17 < 0) {
									var17 = 0;
								}

								if (var18 >= this.ay_fld << 4) {
									var18 = this.as_fld << 4;
								}

								var16--;
								var18--;
								int var20 = 16 - (var15 & 15);
								int var21 = (var16 & 15) + 1;
								int var22 = 16 - (var17 & 15);
								int var23 = (var18 & 15) + 1;
								var15 >>= 4;
								var16 >>= 4;
								var17 >>= 4;
								var18 >>= 4;
								int var24 = 0;
								int var25 = 0;
								int var26 = 0;
								int var27 = 0;

								for (int var28 = var17; var28 <= var18; var28++) {
									int var29 = 16;
									if (var28 == var17) {
										var29 = var22;
									}

									if (var28 == var18) {
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; var30++) {
										int var31 = this.ah_fld[var28 * this.ad_fld + var30];
										if (var31 != 0) {
											int var32;
											if (var30 == var15) {
												var32 = var29 * var20;
											} else if (var30 == var16) {
												var32 = var29 * var21;
											} else {
												var32 = var29 << 4;
											}

											var27 += var32;
											var24 += (var31 >> 16 & 0xFF) * var32;
											var25 += (var31 >> 8 & 0xFF) * var32;
											var26 += (var31 & 0xFF) * var32;
										}
									}
								}

								if (var27 >= var19) {
									int var39 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
									if (var39 == 0) {
										var39 = 1;
									}

									al_fld[var9] = var39 | 0xFF000000;
								}

								var9++;
							}
						}

						var9 += var10;
					}
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
