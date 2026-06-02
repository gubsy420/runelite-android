import net.runelite.api.IndexedSprite;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yc")
@Implements({"IndexedSprite"})
public class yc extends yu implements IndexedSprite {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	public byte[] ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ag_fld;
	@ObfuscatedGetter(
		intValue = 1463899361
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedGetter(
		intValue = 391680949
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedGetter(
		intValue = 1809103893
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedGetter(
		intValue = -1548281861
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ay_fld;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ab(int var1, int var2, int var3, int var4) {
		int var5 = this.az_fld;
		int var6 = this.av_fld;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.aw_fld;
		int var10 = this.ay_fld;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		if (this.ae_fld > 0) {
			int var13 = ((this.ae_fld << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.ae_fld << 16);
		}

		if (this.ah_fld > 0) {
			int var16 = ((this.ah_fld << 16) + var12 - 1) / var12;
			var2 += var16;
			var8 += var16 * var12 - (this.ah_fld << 16);
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

		ag(al_fld, this.ak_fld, this.ag_fld, var7, var8, var17, var14, var3, var4, var11, var12, var5);
	}

	@ObfuscatedName("getOriginalHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOriginalHeight() {
		return this.ay_fld;
	}

	@ObfuscatedName("getPalette")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getPalette() {
		return this.ag_fld;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lyc;)V"
	)
	public static void fa(yc var0) {
		if (var0.az_fld != var0.aw_fld || var0.av_fld != var0.ay_fld) {
			byte[] var1 = new byte[var0.aw_fld * var0.ay_fld];
			int var2 = 0;

			for (int var3 = 0; var3 < var0.av_fld; var3++) {
				for (int var4 = 0; var4 < var0.az_fld; var4++) {
					var1[var4 + var0.ae_fld + (var3 + var0.ah_fld) * var0.aw_fld] = var0.ak_fld[var2++];
				}
			}

			var0.ak_fld = var1;
			var0.az_fld = var0.aw_fld;
			var0.av_fld = var0.ay_fld;
			var0.ae_fld = 0;
			var0.ah_fld = 0;
		}
	}

	@ObfuscatedName("setPalette")
	@ObfuscatedSignature(
		descriptor = "([I)V"
	)
	@Override
	public void setPalette(int[] var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("setOffsetX")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setOffsetX(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("getWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWidth() {
		return this.az_fld;
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeight() {
		return this.av_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ad(int var1, int var2) {
		var1 += this.ae_fld;
		var2 += this.ah_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = this.av_fld;
		int var6 = this.az_fld;
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
			ak(al_fld, this.ak_fld, this.ag_fld, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([I[B[IIIIIIIIII)V"
	)
	static void ag(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; var13++) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; var15++) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 255] | 0xFF000000;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		if (this.az_fld != this.aw_fld || this.av_fld != this.ay_fld) {
			byte[] var1 = new byte[this.aw_fld * this.ay_fld];
			int var2 = 0;

			for (int var3 = 0; var3 < this.av_fld; var3++) {
				for (int var4 = 0; var4 < this.az_fld; var4++) {
					var1[var4 + this.ae_fld + (var3 + this.ah_fld) * this.aw_fld] = this.ak_fld[var2++];
				}
			}

			this.ak_fld = var1;
			this.az_fld = this.aw_fld;
			this.av_fld = this.ay_fld;
			this.ae_fld = 0;
			this.ah_fld = 0;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		if (this.az_fld != this.aw_fld || this.av_fld != this.ay_fld) {
			byte[] var1 = new byte[this.aw_fld * this.ay_fld];
			int var2 = 0;

			for (int var3 = 0; var3 < this.av_fld; var3++) {
				for (int var4 = 0; var4 < this.az_fld; var4++) {
					var1[var4 + this.ae_fld + (var3 + this.ah_fld) * this.aw_fld] = this.ak_fld[var2++];
				}
			}

			this.ak_fld = var1;
			this.az_fld = this.aw_fld;
			this.av_fld = this.ay_fld;
			this.ae_fld = 0;
			this.ah_fld = 0;
		}
	}

	@ObfuscatedName("setOffsetY")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setOffsetY(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("yg")
	@ObfuscatedSignature(
		descriptor = "(Lyc;II)V"
	)
	public static void yg(yc var0, int var1, int var2) {
		var1 += var0.ae_fld;
		var2 += var0.ah_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = var0.av_fld;
		int var6 = var0.az_fld;
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
			ak(al_fld, var0.ak_fld, var0.ag_fld, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([I[B[IIIIIII)V"
	)
	static void as(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				byte var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & -422983538];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}
			}

			for (int var20 = var5; var20 < 0; var20++) {
				byte var24 = var1[var3++];
				if (var24 != 0) {
					var0[var4++] = var2[var24 & 255];
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
		descriptor = "(IIII)V"
	)
	public void ah(int var1, int var2, int var3, int var4) {
		int var5 = this.az_fld;
		int var6 = this.av_fld;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.aw_fld;
		int var10 = this.ay_fld;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		if (this.ae_fld > 0) {
			int var13 = ((this.ae_fld << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.ae_fld << 16);
		}

		if (this.ah_fld > 0) {
			int var16 = ((this.ah_fld << 16) + var12 - 1) / var12;
			var2 += var16;
			var8 += var16 * var12 - (this.ah_fld << 16);
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

		ag(al_fld, this.ak_fld, this.ag_fld, var7, var8, var17, var14, var3, var4, var11, var12, var5);
	}

	@ObfuscatedName("getOffsetY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOffsetY() {
		return this.ah_fld;
	}

	@ObfuscatedName("getOffsetX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOffsetX() {
		return this.ae_fld;
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ob(int var1, int var2, int var3, int var4) {
		this.ah(var1, var2, var3, var4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[B[IIIIIII)V"
	)
	static void aw(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				byte var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}
			}

			for (int var20 = var5; var20 < 0; var20++) {
				byte var24 = var1[var3++];
				if (var24 != 0) {
					var0[var4++] = var2[var24 & 255];
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("setOriginalWidth")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setOriginalWidth(int var1) {
		this.aw_fld = var1;
	}

	public yc() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void an(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ag_fld.length; var4++) {
			int var5 = this.ag_fld[var4] >> 16 & 0xFF;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.ag_fld[var4] >> 8 & 0xFF;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.ag_fld[var4] & 0xFF;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.ag_fld[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([I[B[IIIIIIIIII)V"
	)
	static void ar(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; var13++) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; var15++) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 304446403];
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[B[IIIIIIIIII)V"
	)
	static void af(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; var13++) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; var15++) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & -1309765619];
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ae(int var1, int var2) {
		var1 += this.ae_fld;
		var2 += this.ah_fld;
		int var3 = var1 + var2 * au_fld;
		int var4 = 0;
		int var5 = this.av_fld;
		int var6 = this.az_fld;
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
			ak(al_fld, this.ak_fld, this.ag_fld, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("getPixels")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] getPixels() {
		return this.ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[B[IIIIIII)V"
	)
	static void ak(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				byte var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255] | 0xFF000000;
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255] | 0xFF000000;
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255] | 0xFF000000;
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255] | 0xFF000000;
				} else {
					var4++;
				}
			}

			for (int var20 = var5; var20 < 0; var20++) {
				byte var24 = var1[var3++];
				if (var24 != 0) {
					var0[var4++] = var2[var24 & 255] | 0xFF000000;
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void aa(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ag_fld.length; var4++) {
			int var5 = this.ag_fld[var4] >> 16 & 0xFF;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.ag_fld[var4] >> 8 & 0xFF;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.ag_fld[var4] & 0xFF;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.ag_fld[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ai(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ag_fld.length; var4++) {
			int var5 = this.ag_fld[var4] >> 16 & 0xFF;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > -1656736165) {
				var5 = 255;
			}

			int var6 = this.ag_fld[var4] >> 8 & 1849369497;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.ag_fld[var4] & -1194848756;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > -2091114649) {
				var7 = 255;
			}

			this.ag_fld[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("setWidth")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setWidth(int var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("setPixels")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	@Override
	public void setPixels(byte[] var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void aq(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ag_fld.length; var4++) {
			int var5 = this.ag_fld[var4] >> 16 & 0xFF;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.ag_fld[var4] >> 8 & 0xFF;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.ag_fld[var4] & 0xFF;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.ag_fld[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("setOriginalHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setOriginalHeight(int var1) {
		this.ay_fld = var1;
	}

	@ObfuscatedName("getOriginalWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOriginalWidth() {
		return this.aw_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[B[IIIIIIIIII)V"
	)
	static void al(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; var13++) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; var15++) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 255];
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
		descriptor = "(III)V"
	)
	public void av(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ag_fld.length; var4++) {
			int var5 = this.ag_fld[var4] >> 16 & 0xFF;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.ag_fld[var4] >> 8 & 0xFF;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.ag_fld[var4] & 0xFF;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.ag_fld[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("setHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setHeight(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	public void ao(int var1, int var2, int var3, int var4) {
		int var5 = this.az_fld;
		int var6 = this.av_fld;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.aw_fld;
		int var10 = this.ay_fld;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		if (this.ae_fld > 0) {
			int var13 = ((this.ae_fld << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.ae_fld << 16);
		}

		if (this.ah_fld > 0) {
			int var16 = ((this.ah_fld << 16) + var12 - 1) / var12;
			var2 += var16;
			var8 += var16 * var12 - (this.ah_fld << 16);
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

		ag(al_fld, this.ak_fld, this.ag_fld, var7, var8, var17, var14, var3, var4, var11, var12, var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[B[IIIIIII)V"
	)
	static void ay(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				byte var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					var4++;
				}
			}

			for (int var20 = var5; var20 < 0; var20++) {
				byte var24 = var1[var3++];
				if (var24 != 0) {
					var0[var4++] = var2[var24 & 255];
				} else {
					var4++;
				}
			}

			var4 += var7;
			var3 += var8;
		}
	}
}
