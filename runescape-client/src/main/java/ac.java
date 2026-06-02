import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ac")
public class ac extends aj {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 3
	)
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
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean af_fld;

	ac(al var1, int var2, int var3, int var4) {
		this.aa_fld = var1;
		this.as_fld = var1.az_fld;
		this.ar_fld = var1.av_fld;
		this.af_fld = var1.ae_fld;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ak_fld = 0;
		this.er();
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int fi() {
		return this.ag_fld < 0 ? -this.ag_fld : this.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ag(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lal;II)Lac;"
	)
	public static ac az(al var0, int var1, int var2) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, (int)(var0.ak_fld * 256L * var1 / (ao.ar_fld * -493825580)), var2 << 6) : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lal;III)Lac;"
	)
	public static ac av(al var0, int var1, int var2, int var3) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILac;)I"
	)
	static int ae(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, ac var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		var5 -= 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
		}

		var5 += 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2++] * var4;
		}

		var8.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int eo() {
		int var1 = this.ae_fld >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.ay_fld == 0) {
			var1 -= var1 * this.ak_fld / (((al)this.aa_fld).ag_fld.length << 8);
		} else if (this.ay_fld >= 0) {
			var1 -= var1 * this.as_fld / ((al)this.aa_fld).ag_fld.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILac;)I"
	)
	static int al(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, ac var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		var5 -= 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
		}

		var5 += 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2--] * var4;
		}

		var8.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILac;)I"
	)
	static int au(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10) {
		var3 >>= 8;
		var9 >>= 8;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;
		var7 -= 6;

		while (var4 < var7) {
			short var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
		}

		var7 += 6;

		while (var4 < var7) {
			short var15 = var1[var3--];
			var2[var4++] += var15 * var5 >> 6;
			var2[var4++] += var15 * var6 >> 6;
		}

		var10.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILac;II)I"
	)
	static int ax(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var1 = var4 >> 8;
			short var13 = var2[var1];
			var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (int var16 = var12; var5 < var7; var4 += var11) {
			short var14 = var2[var4 >> 8];
			var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
		}

		var10.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int an(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
			var1 = var4 >> 8;
			short var14 = var2[var1];
			int var15 = var14 + ((var2[var1 + 1] - var14) * (var4 & 0xFF) >> 8);
			var3[var5++] += var15 * var6 >> 6;
			var3[var5++] += var15 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (int var19 = var13; var5 < var8; var4 += var12) {
			short var16 = var2[var4 >> 8];
			int var17 = var16 + ((var19 - var16) * (var4 & 0xFF) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var3[var5++] += var17 * var7 >> 6;
		}

		var11.ak_fld = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	synchronized void eq(int var1, int var2) {
		this.az_fld = var1;
		this.av_fld = var2;
		this.al_fld = 0;
		this.er();
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lac;[IIIII)I"
	)
	public static int me(ac var0, int[] var1, int var2, int var3, int var4, int var5) {
		while (var0.al_fld > 0) {
			int var6 = var2 + var0.al_fld;
			if (var6 > var4) {
				var6 = var4;
			}

			var0.al_fld += var2;
			if (var0.ag_fld == -256 && (var0.ak_fld & 0xFF) == 0) {
				if (jx.al_fld) {
					var2 = ao(0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ah_fld, var0.aw_fld, var0.ax_fld, var0.an_fld, 0, var6, var3, var0);
				} else {
					var2 = ad(((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ae_fld, var0.au_fld, 0, var6, var3, var0);
				}
			} else if (jx.al_fld) {
				var2 = ac(
					0, 0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ah_fld, var0.aw_fld, var0.ax_fld, var0.an_fld, 0, var6, var3, var0, var0.ag_fld, var5
				);
			} else {
				var2 = at(0, 0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ae_fld, var0.au_fld, 0, var6, var3, var0, var0.ag_fld, var5);
			}

			var0.al_fld -= var2;
			if (var0.al_fld != 0) {
				return var2;
			}

			if (var0.cy()) {
				return var4;
			}
		}

		if (var0.ag_fld == -256 && (var0.ak_fld & 0xFF) == 0) {
			return jx.al_fld
				? au(0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ah_fld, var0.aw_fld, 0, var4, var3, var0)
				: al(((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ae_fld, 0, var4, var3, var0);
		} else {
			return jx.al_fld
				? ai(0, 0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ah_fld, var0.aw_fld, 0, var4, var3, var0, var0.ag_fld, var5)
				: aa(0, 0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ae_fld, 0, var4, var3, var0, var0.ag_fld, var5);
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lal;III)Lac;"
	)
	public static ac cw(al var0, int var1, int var2, int var3) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cd() {
		return this.al_fld != 0;
	}

	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "(Lac;)Ljava/lang/String;"
	)
	public static String ub(ac var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.toString();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void bb(int var1) {
		if (this.ag_fld < 0) {
			this.ag_fld = -var1;
		} else {
			this.ag_fld = var1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILac;)I"
	)
	static int ad(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ac var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.ah_fld = var9.ah_fld + var9.ax_fld * (var6 - var3);
		var9.aw_fld = var9.aw_fld + var9.an_fld * (var6 - var3);
		var6 -= 3;

		while (var3 < var6) {
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
		}

		for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
			var1[var3++] += var0[var2--] * var4;
		}

		var9.ae_fld = var4 >> 2;
		var9.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int ea() {
		return this.az_fld == Integer.MIN_VALUE ? 0 : this.az_fld + 32 >> 6;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	synchronized void ef(int var1, int var2) {
		this.az_fld = var1;
		this.av_fld = var2;
		this.al_fld = 0;
		this.er();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int ap(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1];
			int var17 = var16 + ((var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var21 = var15; var5 < var10; var4 += var14) {
			short var18 = var2[var4 >> 8];
			int var19 = var18 + ((var21 - var18) * (var4 & 0xFF) >> 8);
			var3[var5++] += var19 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var19 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int at(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		var11.ah_fld = var11.ah_fld - var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld - var11.an_fld * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (int var17 = var12; var5 < var8; var4 += var17) {
			var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
		}

		var11.ah_fld = var11.ah_fld + var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld + var11.an_fld * var5;
		var11.ae_fld = var6;
		var11.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int ac(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1 - 1];
			int var17 = var16 + ((var2[var1] - var16) * (var4 & 0xFF) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var20 = var15; var5 < var10; var4 += var14) {
			var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int bv() {
		int var1 = this.ae_fld >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.ay_fld == 0) {
			var1 -= var1 * this.ak_fld / (((al)this.aa_fld).ag_fld.length << 8);
		} else if (this.ay_fld >= 0) {
			var1 -= var1 * this.as_fld / ((al)this.aa_fld).ag_fld.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void er() {
		this.ae_fld = this.az_fld;
		this.ah_fld = ak(this.az_fld, this.av_fld);
		this.aw_fld = ag(this.az_fld, this.av_fld);
	}

	ac(al var1, int var2, int var3) {
		this.aa_fld = var1;
		this.as_fld = var1.az_fld;
		this.ar_fld = var1.av_fld;
		this.af_fld = var1.ae_fld;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = 8192;
		this.ak_fld = 0;
		this.er();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj ah() {
		return null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int bp() {
		return this.az_fld == Integer.MIN_VALUE ? 0 : this.az_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public synchronized void af(int var1) {
		if (this.al_fld > 0) {
			if (var1 >= this.al_fld) {
				if (this.az_fld == Integer.MIN_VALUE) {
					this.az_fld = 0;
					this.aw_fld = 0;
					this.ah_fld = 0;
					this.ae_fld = 0;
					this.gy_void();
					var1 = this.al_fld;
				}

				this.al_fld = 0;
				this.er();
			} else {
				this.ae_fld = this.ae_fld + this.au_fld * var1;
				this.ah_fld = this.ah_fld + this.ax_fld * var1;
				this.aw_fld = this.aw_fld + this.an_fld * var1;
				this.al_fld -= var1;
			}
		}

		al var2 = (al)this.aa_fld;
		int var3 = this.as_fld << 8;
		int var4 = this.ar_fld << 8;
		int var5 = var2.ag_fld.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.ay_fld = 0;
		}

		if (this.ak_fld < 0) {
			if (this.ag_fld <= 0) {
				wr(this);
				this.gy_void();
				return;
			}

			this.ak_fld = 0;
		}

		if (this.ak_fld >= var5) {
			if (this.ag_fld >= 0) {
				wr(this);
				this.gy_void();
				return;
			}

			this.ak_fld = var5 - 1;
		}

		this.ak_fld = this.ak_fld + this.ag_fld * var1;
		if (this.ay_fld < 0) {
			if (!this.af_fld) {
				if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var4 - 1 - (var4 - 1 - this.ak_fld) % var6;
				} else {
					if (this.ak_fld < var4) {
						return;
					}

					this.ak_fld = var3 + (this.ak_fld - var3) % var6;
				}
			} else {
				if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var3 + var3 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
				}

				while (this.ak_fld >= var4) {
					this.ak_fld = var4 + var4 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var3 + var3 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
				}
			}
		} else {
			if (this.ay_fld > 0) {
				label181:
				if (this.af_fld) {
					if (this.ag_fld < 0) {
						if (this.ak_fld >= var3) {
							return;
						}

						this.ak_fld = var3 + var3 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
						if (--this.ay_fld == 0) {
							break label181;
						}
					}

					do {
						if (this.ak_fld < var4) {
							return;
						}

						this.ak_fld = var4 + var4 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
						if (--this.ay_fld == 0) {
							break;
						}

						if (this.ak_fld >= var3) {
							return;
						}

						this.ak_fld = var3 + var3 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
					} while (--this.ay_fld != 0);
				} else if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					int var7 = (var4 - 1 - this.ak_fld) / var6;
					if (var7 < this.ay_fld) {
						this.ak_fld += var6 * var7;
						this.ay_fld -= var7;
						return;
					}

					this.ak_fld = this.ak_fld + var6 * this.ay_fld;
					this.ay_fld = 0;
				} else {
					if (this.ak_fld < var4) {
						return;
					}

					int var8 = (this.ak_fld - var3) / var6;
					if (var8 < this.ay_fld) {
						this.ak_fld -= var6 * var8;
						this.ay_fld -= var8;
						return;
					}

					this.ak_fld = this.ak_fld - var6 * this.ay_fld;
					this.ay_fld = 0;
				}
			}

			if (this.ag_fld < 0) {
				if (this.ak_fld < 0) {
					this.ak_fld = -1;
					wr(this);
					this.gy_void();
				}
			} else if (this.ak_fld >= var5) {
				this.ak_fld = var5;
				wr(this);
				this.gy_void();
			}
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int ed(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1 - 1];
			int var17 = var16 + ((var2[var1] - var16) * (var4 & 0xFF) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var20 = var15; var5 < var10; var4 += var14) {
			var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	synchronized void bt(int var1) {
		this.bf(var1, this.bi());
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int dr(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3++];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void bu(int var1) {
		int var2 = ((al)this.aa_fld).ag_fld.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.ak_fld = var1;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public synchronized void fc(boolean var1) {
		this.ag_fld = (this.ag_fld ^ this.ag_fld >> 31) + (this.ag_fld >>> 31);
		if (var1) {
			this.ag_fld = -this.ag_fld;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public synchronized void fw(int var1, int var2) {
		this.ba(var1, var2, this.bi());
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void bo(int var1) {
		this.bf(var1 << 6, this.bi());
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int de(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		var11.ah_fld = var11.ah_fld - var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld - var11.an_fld * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (int var17 = var12; var5 < var8; var4 += var17) {
			var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
		}

		var11.ah_fld = var11.ah_fld + var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld + var11.an_fld * var5;
		var11.ae_fld = var6;
		var11.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void bq(int var1) {
		if (var1 == 0) {
			this.bt(0);
			this.gy_void();
		} else if (this.ah_fld == 0 && this.aw_fld == 0) {
			this.al_fld = 0;
			this.az_fld = 0;
			this.ae_fld = 0;
			this.gy_void();
		} else {
			int var2 = -this.ae_fld;
			if (this.ae_fld > var2) {
				var2 = this.ae_fld;
			}

			if (-this.ah_fld > var2) {
				var2 = -this.ah_fld;
			}

			if (this.ah_fld > var2) {
				var2 = this.ah_fld;
			}

			if (-this.aw_fld > var2) {
				var2 = -this.aw_fld;
			}

			if (this.aw_fld > var2) {
				var2 = this.aw_fld;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.al_fld = var1;
			this.az_fld = Integer.MIN_VALUE;
			this.au_fld = -this.ae_fld / var1;
			this.ax_fld = -this.ah_fld / var1;
			this.an_fld = -this.aw_fld / var1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int bg() {
		return this.ag_fld < 0 ? -this.ag_fld : this.ag_fld;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int dl(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3++];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cc() {
		return this.ak_fld < 0 || this.ak_fld >= ((al)this.aa_fld).ag_fld.length << 8;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean go() {
		return this.al_fld != 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj br() {
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj aw() {
		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ay() {
		return this.az_fld == 0 && this.al_fld == 0 ? 0 : 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	@Override
	public synchronized void as(int[] var1, int var2, int var3) {
		if (this.az_fld == 0 && this.al_fld == 0) {
			this.af(var3);
		} else {
			al var4 = (al)this.aa_fld;
			int var5 = this.as_fld << 8;
			int var6 = this.ar_fld << 8;
			int var7 = var4.ag_fld.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.ay_fld = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.ak_fld < 0) {
				if (this.ag_fld <= 0) {
					wr(this);
					this.gy_void();
					return;
				}

				this.ak_fld = 0;
			}

			if (this.ak_fld >= var7) {
				if (this.ag_fld >= 0) {
					wr(this);
					this.gy_void();
					return;
				}

				this.ak_fld = var7 - 1;
			}

			if (this.ay_fld < 0) {
				if (this.af_fld) {
					if (this.ag_fld < 0) {
						var9 = dd(this, var1, var2, var5, var3, var4.ag_fld[this.as_fld]);
						if (this.ak_fld >= var5) {
							return;
						}

						this.ak_fld = var5 + var5 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
					}

					while (true) {
						var9 = this.cq(var1, var9, var6, var3, var4.ag_fld[this.ar_fld - 1]);
						if (this.ak_fld < var6) {
							return;
						}

						this.ak_fld = var6 + var6 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
						var9 = dd(this, var1, var9, var5, var3, var4.ag_fld[this.as_fld]);
						if (this.ak_fld >= var5) {
							return;
						}

						this.ak_fld = var5 + var5 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
					}
				} else if (this.ag_fld < 0) {
					while (true) {
						var9 = dd(this, var1, var9, var5, var3, var4.ag_fld[this.ar_fld - 1]);
						if (this.ak_fld >= var5) {
							return;
						}

						this.ak_fld = var6 - 1 - (var6 - 1 - this.ak_fld) % var8;
					}
				} else {
					while (true) {
						var9 = this.cq(var1, var9, var6, var3, var4.ag_fld[this.as_fld]);
						if (this.ak_fld < var6) {
							return;
						}

						this.ak_fld = var5 + (this.ak_fld - var5) % var8;
					}
				}
			} else {
				if (this.ay_fld > 0) {
					label185:
					if (this.af_fld) {
						if (this.ag_fld < 0) {
							var9 = dd(this, var1, var2, var5, var3, var4.ag_fld[this.as_fld]);
							if (this.ak_fld >= var5) {
								return;
							}

							this.ak_fld = var5 + var5 - 1 - this.ak_fld;
							this.ag_fld = -this.ag_fld;
							if (--this.ay_fld == 0) {
								break label185;
							}
						}

						do {
							var9 = this.cq(var1, var9, var6, var3, var4.ag_fld[this.ar_fld - 1]);
							if (this.ak_fld < var6) {
								return;
							}

							this.ak_fld = var6 + var6 - 1 - this.ak_fld;
							this.ag_fld = -this.ag_fld;
							if (--this.ay_fld == 0) {
								break;
							}

							var9 = dd(this, var1, var9, var5, var3, var4.ag_fld[this.as_fld]);
							if (this.ak_fld >= var5) {
								return;
							}

							this.ak_fld = var5 + var5 - 1 - this.ak_fld;
							this.ag_fld = -this.ag_fld;
						} while (--this.ay_fld != 0);
					} else if (this.ag_fld < 0) {
						while (true) {
							var9 = dd(this, var1, var9, var5, var3, var4.ag_fld[this.ar_fld - 1]);
							if (this.ak_fld >= var5) {
								return;
							}

							int var13 = (var6 - 1 - this.ak_fld) / var8;
							if (var13 >= this.ay_fld) {
								this.ak_fld = this.ak_fld + var8 * this.ay_fld;
								this.ay_fld = 0;
								break;
							}

							this.ak_fld += var8 * var13;
							this.ay_fld -= var13;
						}
					} else {
						while (true) {
							var9 = this.cq(var1, var9, var6, var3, var4.ag_fld[this.as_fld]);
							if (this.ak_fld < var6) {
								return;
							}

							int var10 = (this.ak_fld - var5) / var8;
							if (var10 >= this.ay_fld) {
								this.ak_fld = this.ak_fld - var8 * this.ay_fld;
								this.ay_fld = 0;
								break;
							}

							this.ak_fld -= var8 * var10;
							this.ay_fld -= var10;
						}
					}
				}

				if (this.ag_fld < 0) {
					dd(this, var1, var9, 0, var3, 0);
					if (this.ak_fld < 0) {
						this.ak_fld = -1;
						wr(this);
						this.gy_void();
					}
				} else {
					this.cq(var1, var9, var7, var3, 0);
					if (this.ak_fld >= var7) {
						this.ak_fld = var7;
						wr(this);
						this.gy_void();
					}
				}
			}
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILac;)I"
	)
	static int co(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, ac var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		var5 -= 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
		}

		var5 += 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2--] * var4;
		}

		var8.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([IIIII)I"
	)
	int cq(int[] var1, int var2, int var3, int var4, int var5) {
		while (this.al_fld > 0) {
			int var6 = var2 + this.al_fld;
			if (var6 > var4) {
				var6 = var4;
			}

			this.al_fld += var2;
			if (this.ag_fld == 256 && (this.ak_fld & 0xFF) == 0) {
				if (jx.al_fld) {
					var2 = am(0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, this.ax_fld, this.an_fld, 0, var6, var3, this);
				} else {
					var2 = aq(((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, this.au_fld, 0, var6, var3, this);
				}
			} else if (jx.al_fld) {
				var2 = ap(
					0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, this.ax_fld, this.an_fld, 0, var6, var3, this, this.ag_fld, var5
				);
			} else {
				var2 = ab(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, this.au_fld, 0, var6, var3, this, this.ag_fld, var5);
			}

			this.al_fld -= var2;
			if (this.al_fld != 0) {
				return var2;
			}

			if (this.cy()) {
				return var4;
			}
		}

		if (this.ag_fld == 256 && (this.ak_fld & 0xFF) == 0) {
			return jx.al_fld
				? ar(0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, 0, var4, var3, this, ((al)this.aa_fld).ag())
				: ae(((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, 0, var4, var3, this);
		} else {
			return jx.al_fld
				? an(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, 0, var4, var3, this, this.ag_fld, var5)
				: ax(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, 0, var4, var3, this, this.ag_fld, var5);
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int dp(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		var11.ah_fld = var11.ah_fld - var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld - var11.an_fld * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (int var17 = var12; var5 < var8; var4 += var17) {
			var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
		}

		var11.ah_fld = var11.ah_fld + var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld + var11.an_fld * var5;
		var11.ae_fld = var6;
		var11.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "(Ltl;)I"
	)
	public static int vk(tl var0) {
		return var0.ah_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cy() {
		int var1 = this.az_fld;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = ak(var1, this.av_fld);
			var3 = ag(var1, this.av_fld);
		}

		if (this.ae_fld == var1 && this.ah_fld == var2 && this.aw_fld == var3) {
			if (this.az_fld == Integer.MIN_VALUE) {
				this.az_fld = 0;
				this.aw_fld = 0;
				this.ah_fld = 0;
				this.ae_fld = 0;
				this.gy_void();
				return true;
			} else {
				this.er();
				return false;
			}
		} else {
			if (this.ae_fld < var1) {
				this.au_fld = 1;
				this.al_fld = var1 - this.ae_fld;
			} else if (this.ae_fld > var1) {
				this.au_fld = -1;
				this.al_fld = this.ae_fld - var1;
			} else {
				this.au_fld = 0;
			}

			if (this.ah_fld < var2) {
				this.ax_fld = 1;
				if (this.al_fld == 0 || this.al_fld > var2 - this.ah_fld) {
					this.al_fld = var2 - this.ah_fld;
				}
			} else if (this.ah_fld > var2) {
				this.ax_fld = -1;
				if (this.al_fld == 0 || this.al_fld > this.ah_fld - var2) {
					this.al_fld = this.ah_fld - var2;
				}
			} else {
				this.ax_fld = 0;
			}

			if (this.aw_fld < var3) {
				this.an_fld = 1;
				if (this.al_fld == 0 || this.al_fld > var3 - this.aw_fld) {
					this.al_fld = var3 - this.aw_fld;
				}
			} else if (this.aw_fld > var3) {
				this.an_fld = -1;
				if (this.al_fld == 0 || this.al_fld > this.aw_fld - var3) {
					this.al_fld = this.aw_fld - var3;
				}
			} else {
				this.an_fld = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bz() {
		return null;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILac;)I"
	)
	static int ci(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10) {
		var3 >>= 8;
		var9 >>= 8;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;
		var7 -= 6;

		while (var4 < var7) {
			short var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
		}

		var7 += 6;

		while (var4 < var7) {
			short var15 = var1[var3--];
			var2[var4++] += var15 * var5 >> 6;
			var2[var4++] += var15 * var6 >> 6;
		}

		var10.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "([IIIII)I"
	)
	int gt(int[] var1, int var2, int var3, int var4, int var5) {
		while (this.al_fld > 0) {
			int var6 = var2 + this.al_fld;
			if (var6 > var4) {
				var6 = var4;
			}

			this.al_fld += var2;
			if (this.ag_fld == 256 && (this.ak_fld & 0xFF) == 0) {
				if (jx.al_fld) {
					var2 = am(0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, this.ax_fld, this.an_fld, 0, var6, var3, this);
				} else {
					var2 = aq(((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, this.au_fld, 0, var6, var3, this);
				}
			} else if (jx.al_fld) {
				var2 = ap(
					0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, this.ax_fld, this.an_fld, 0, var6, var3, this, this.ag_fld, var5
				);
			} else {
				var2 = ab(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, this.au_fld, 0, var6, var3, this, this.ag_fld, var5);
			}

			this.al_fld -= var2;
			if (this.al_fld != 0) {
				return var2;
			}

			if (this.cy()) {
				return var4;
			}
		}

		if (this.ag_fld == 256 && (this.ak_fld & 0xFF) == 0) {
			return jx.al_fld
				? ar(0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, 0, var4, var3, this, ((al)this.aa_fld).ag())
				: ae(((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, 0, var4, var3, this);
		} else {
			return jx.al_fld
				? an(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, 0, var4, var3, this, this.ag_fld, var5)
				: ax(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, 0, var4, var3, this, this.ag_fld, var5);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int bx() {
		return this.az_fld == Integer.MIN_VALUE ? 0 : this.az_fld + 32 >> 6;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bh() {
		return null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int bk() {
		return this.az_fld == 0 && this.al_fld == 0 ? 0 : 1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILac;II)I"
	)
	static int cl(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var1 = var4 >> 8;
			short var13 = var2[var1];
			var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (int var16 = var12; var5 < var7; var4 += var11) {
			short var14 = var2[var4 >> 8];
			var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
		}

		var10.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public synchronized void by(int var1) {
		if (this.al_fld > 0) {
			if (var1 >= this.al_fld) {
				if (this.az_fld == Integer.MIN_VALUE) {
					this.az_fld = 0;
					this.aw_fld = 0;
					this.ah_fld = 0;
					this.ae_fld = 0;
					this.gy_void();
					var1 = this.al_fld;
				}

				this.al_fld = 0;
				this.er();
			} else {
				this.ae_fld = this.ae_fld + this.au_fld * var1;
				this.ah_fld = this.ah_fld + this.ax_fld * var1;
				this.aw_fld = this.aw_fld + this.an_fld * var1;
				this.al_fld -= var1;
			}
		}

		al var2 = (al)this.aa_fld;
		int var3 = this.as_fld << 8;
		int var4 = this.ar_fld << 8;
		int var5 = var2.ag_fld.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.ay_fld = 0;
		}

		if (this.ak_fld < 0) {
			if (this.ag_fld <= 0) {
				wr(this);
				this.gy_void();
				return;
			}

			this.ak_fld = 0;
		}

		if (this.ak_fld >= var5) {
			if (this.ag_fld >= 0) {
				wr(this);
				this.gy_void();
				return;
			}

			this.ak_fld = var5 - 1;
		}

		this.ak_fld = this.ak_fld + this.ag_fld * var1;
		if (this.ay_fld < 0) {
			if (!this.af_fld) {
				if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var4 - 1 - (var4 - 1 - this.ak_fld) % var6;
				} else {
					if (this.ak_fld < var4) {
						return;
					}

					this.ak_fld = var3 + (this.ak_fld - var3) % var6;
				}
			} else {
				if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var3 + var3 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
				}

				while (this.ak_fld >= var4) {
					this.ak_fld = var4 + var4 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var3 + var3 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
				}
			}
		} else {
			if (this.ay_fld > 0) {
				label183:
				if (this.af_fld) {
					if (this.ag_fld < 0) {
						if (this.ak_fld >= var3) {
							return;
						}

						this.ak_fld = var3 + var3 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
						if (--this.ay_fld == 0) {
							break label183;
						}
					}

					do {
						if (this.ak_fld < var4) {
							return;
						}

						this.ak_fld = var4 + var4 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
						if (--this.ay_fld == 0) {
							break;
						}

						if (this.ak_fld >= var3) {
							return;
						}

						this.ak_fld = var3 + var3 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
					} while (--this.ay_fld != 0);
				} else if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					int var7 = (var4 - 1 - this.ak_fld) / var6;
					if (var7 < this.ay_fld) {
						this.ak_fld += var6 * var7;
						this.ay_fld -= var7;
						return;
					}

					this.ak_fld = this.ak_fld + var6 * this.ay_fld;
					this.ay_fld = 0;
				} else {
					if (this.ak_fld < var4) {
						return;
					}

					int var8 = (this.ak_fld - var3) / var6;
					if (var8 < this.ay_fld) {
						this.ak_fld -= var6 * var8;
						this.ay_fld -= var8;
						return;
					}

					this.ak_fld = this.ak_fld - var6 * this.ay_fld;
					this.ay_fld = 0;
				}
			}

			if (this.ag_fld < 0) {
				if (this.ak_fld < 0) {
					this.ak_fld = -1;
					wr(this);
					this.gy_void();
				}
			} else if (this.ak_fld >= var5) {
				this.ak_fld = var5;
				wr(this);
				this.gy_void();
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public synchronized void bl(int var1) {
		if (this.al_fld > 0) {
			if (var1 >= this.al_fld) {
				if (this.az_fld == Integer.MIN_VALUE) {
					this.az_fld = 0;
					this.aw_fld = 0;
					this.ah_fld = 0;
					this.ae_fld = 0;
					this.gy_void();
					var1 = this.al_fld;
				}

				this.al_fld = 0;
				this.er();
			} else {
				this.ae_fld = this.ae_fld + this.au_fld * var1;
				this.ah_fld = this.ah_fld + this.ax_fld * var1;
				this.aw_fld = this.aw_fld + this.an_fld * var1;
				this.al_fld -= var1;
			}
		}

		al var2 = (al)this.aa_fld;
		int var3 = this.as_fld << 8;
		int var4 = this.ar_fld << 8;
		int var5 = var2.ag_fld.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.ay_fld = 0;
		}

		if (this.ak_fld < 0) {
			if (this.ag_fld <= 0) {
				wr(this);
				this.gy_void();
				return;
			}

			this.ak_fld = 0;
		}

		if (this.ak_fld >= var5) {
			if (this.ag_fld >= 0) {
				wr(this);
				this.gy_void();
				return;
			}

			this.ak_fld = var5 - 1;
		}

		this.ak_fld = this.ak_fld + this.ag_fld * var1;
		if (this.ay_fld < 0) {
			if (!this.af_fld) {
				if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var4 - 1 - (var4 - 1 - this.ak_fld) % var6;
				} else {
					if (this.ak_fld < var4) {
						return;
					}

					this.ak_fld = var3 + (this.ak_fld - var3) % var6;
				}
			} else {
				if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var3 + var3 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
				}

				while (this.ak_fld >= var4) {
					this.ak_fld = var4 + var4 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
					if (this.ak_fld >= var3) {
						return;
					}

					this.ak_fld = var3 + var3 - 1 - this.ak_fld;
					this.ag_fld = -this.ag_fld;
				}
			}
		} else {
			if (this.ay_fld > 0) {
				label178:
				if (this.af_fld) {
					if (this.ag_fld < 0) {
						if (this.ak_fld >= var3) {
							return;
						}

						this.ak_fld = var3 + var3 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
						if (--this.ay_fld == 0) {
							break label178;
						}
					}

					do {
						if (this.ak_fld < var4) {
							return;
						}

						this.ak_fld = var4 + var4 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
						if (--this.ay_fld == 0) {
							break;
						}

						if (this.ak_fld >= var3) {
							return;
						}

						this.ak_fld = var3 + var3 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
					} while (--this.ay_fld != 0);
				} else if (this.ag_fld < 0) {
					if (this.ak_fld >= var3) {
						return;
					}

					int var7 = (var4 - 1 - this.ak_fld) / var6;
					if (var7 < this.ay_fld) {
						this.ak_fld += var6 * var7;
						this.ay_fld -= var7;
						return;
					}

					this.ak_fld = this.ak_fld + var6 * this.ay_fld;
					this.ay_fld = 0;
				} else {
					if (this.ak_fld < var4) {
						return;
					}

					int var8 = (this.ak_fld - var3) / var6;
					if (var8 < this.ay_fld) {
						this.ak_fld -= var6 * var8;
						this.ay_fld -= var8;
						return;
					}

					this.ak_fld = this.ak_fld - var6 * this.ay_fld;
					this.ay_fld = 0;
				}
			}

			if (this.ag_fld < 0) {
				if (this.ak_fld < 0) {
					this.ak_fld = -1;
					wr(this);
					this.gy_void();
				}
			} else if (this.ak_fld >= var5) {
				this.ak_fld = var5;
				wr(this);
				this.gy_void();
			}
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Lal;III)Lac;"
	)
	public static ac cm(al var0, int var1, int var2, int var3) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void bm(int var1) {
		this.ay_fld = var1;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int cs(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int bi() {
		return this.av_fld < 0 ? -1 : this.av_fld;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lal;III)Lac;"
	)
	public static ac cr(al var0, int var1, int var2, int var3) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lal;II)Lac;"
	)
	public static ac cn(al var0, int var1, int var2) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, (int)(var0.ak_fld * 256L * var1 / (ao.ar_fld * -493825580)), var2 << 6) : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int ai(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			int var15 = var14 + ((var2[var1] - var14) * (var4 & 0xFF) >> 8);
			var3[var5++] += var15 * var6 >> 6;
			var3[var5++] += var15 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (int var18 = var13; var5 < var8; var4 += var12) {
			var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var3[var5++] += var0 * var7 >> 6;
		}

		var11.ak_fld = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lal;III)Lac;"
	)
	public static ac ca(al var0, int var1, int var2, int var3) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lal;III)Lac;"
	)
	public static ac cg(al var0, int var1, int var2, int var3) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	synchronized void bf(int var1, int var2) {
		this.az_fld = var1;
		this.av_fld = var2;
		this.al_fld = 0;
		this.er();
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int dy(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		var11.ah_fld = var11.ah_fld - var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld - var11.an_fld * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var1 = var4 >> 8;
			short var14 = var2[var1];
			var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (int var17 = var13; var5 < var8; var4 += var12) {
			short var15 = var2[var4 >> 8];
			var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
		}

		var11.ah_fld = var11.ah_fld + var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld + var11.an_fld * var5;
		var11.ae_fld = var6;
		var11.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILac;)I"
	)
	static int cz(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, ac var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		var5 -= 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
		}

		var5 += 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2++] * var4;
		}

		var8.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILac;)I"
	)
	static int ck(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, ac var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		var5 -= 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
			var1[var3++] += var0[var2++] * var4;
		}

		var5 += 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2++] * var4;
		}

		var8.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILac;Z)I"
	)
	static int cb(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10, boolean var11) {
		var3 >>= 8;
		var9 >>= 8;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;
		var7 -= 6;
		if (var11) {
			while (var4 < var7) {
				short var17 = var1[var3++];
				var2[var4++] += var17 * var5 << 2;
				var2[var4++] += var17 * var6 << 2;
				var17 = var1[var3++];
				var2[var4++] += var17 * var5 << 2;
				var2[var4++] += var17 * var6 << 2;
				var17 = var1[var3++];
				var2[var4++] += var17 * var5 << 2;
				var2[var4++] += var17 * var6 << 2;
				var17 = var1[var3++];
				var2[var4++] += var17 * var5 << 2;
				var2[var4++] += var17 * var6 << 2;
			}

			var7 += 6;

			while (var4 < var7) {
				short var21 = var1[var3++];
				var2[var4++] += var21 * var5 << 2;
				var2[var4++] += var21 * var6 << 2;
			}
		} else {
			while (var4 < var7) {
				short var12 = var1[var3++];
				var2[var4++] += var12 * var5 >> 6;
				var2[var4++] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var2[var4++] += var12 * var5 >> 6;
				var2[var4++] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var2[var4++] += var12 * var5 >> 6;
				var2[var4++] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var2[var4++] += var12 * var5 >> 6;
				var2[var4++] += var12 * var6 >> 6;
			}

			var7 += 6;

			while (var4 < var7) {
				short var16 = var1[var3++];
				var2[var4++] += var16 * var5 >> 6;
				var2[var4++] += var16 * var6 >> 6;
			}
		}

		var10.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void el(int var1) {
		this.bf(var1 << 6, this.bi());
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILac;)I"
	)
	static int cu(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, ac var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		var5 -= 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
			var1[var3++] += var0[var2--] * var4;
		}

		var5 += 3;

		while (var3 < var5) {
			var1[var3++] += var0[var2--] * var4;
		}

		var8.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int fj() {
		return this.av_fld < 0 ? -1 : this.av_fld;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int ey() {
		return this.az_fld == 1696629696 ? 0 : this.az_fld + 32 >> 6;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILac;)I"
	)
	static int ch(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10) {
		var3 >>= 8;
		var9 >>= 8;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;
		var7 -= 6;

		while (var4 < var7) {
			short var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
		}

		var7 += 6;

		while (var4 < var7) {
			short var15 = var1[var3--];
			var2[var4++] += var15 * var5 >> 6;
			var2[var4++] += var15 * var6 >> 6;
		}

		var10.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void fe() {
		this.ae_fld = this.az_fld;
		this.ah_fld = ak(this.az_fld, this.av_fld);
		this.aw_fld = ag(this.az_fld, this.av_fld);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	synchronized void fp(int var1) {
		this.bf(var1, this.bi());
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int dc(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
			var1 = var4 >> 8;
			short var14 = var2[var1];
			int var15 = var14 + ((var2[var1 + 1] - var14) * (var4 & -1135217169) >> 8);
			var3[var5++] += var15 * var6 >> 6;
			var3[var5++] += var15 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (int var19 = var13; var5 < var8; var4 += var12) {
			short var16 = var2[var4 >> 8];
			int var17 = var16 + ((var19 - var16) * (var4 & 0xFF) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var3[var5++] += var17 * var7 >> 6;
		}

		var11.ak_fld = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILac;II)I"
	)
	static int dh(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var1 = var4 >> 8;
			short var13 = var2[var1 - 1];
			var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (int var16 = var11; var5 < var7; var4 += var16) {
			var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
		}

		var10.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILac;II)I"
	)
	static int dv(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var1 = var4 >> 8;
			short var13 = var2[var1 - 1];
			var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (int var16 = var11; var5 < var7; var4 += var16) {
			var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
		}

		var10.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int dz(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			int var15 = var14 + ((var2[var1] - var14) * (var4 & 0xFF) >> 8);
			var3[var5++] += var15 * var6 >> 6;
			var3[var5++] += var15 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (int var18 = var13; var5 < var8; var4 += var12) {
			var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & -1249526651) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var3[var5++] += var0 * var7 >> 6;
		}

		var11.ak_fld = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int dt(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			int var15 = var14 + ((var2[var1] - var14) * (var4 & 0xFF) >> 8);
			var3[var5++] += var15 * var6 >> 6;
			var3[var5++] += var15 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (int var18 = var13; var5 < var8; var4 += var12) {
			var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var3[var5++] += var0 * var7 >> 6;
		}

		var11.ak_fld = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int dm(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			int var15 = var14 + ((var2[var1] - var14) * (var4 & 0xFF) >> 8);
			var3[var5++] += var15 * var6 >> 6;
			var3[var5++] += var15 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (int var18 = var13; var5 < var8; var4 += var12) {
			var0 = var18 + ((var2[var4 >> 8] - var18) * (var4 & 0xFF) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var3[var5++] += var0 * var7 >> 6;
		}

		var11.ak_fld = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILac;)I"
	)
	static int dq(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ac var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.ah_fld = var9.ah_fld + var9.ax_fld * (var6 - var3);
		var9.aw_fld = var9.aw_fld + var9.an_fld * (var6 - var3);
		var6 -= 3;

		while (var3 < var6) {
			var1[var3++] += var0[var2++] * var4;
			var4 += var5;
			var1[var3++] += var0[var2++] * var4;
			var4 += var5;
			var1[var3++] += var0[var2++] * var4;
			var4 += var5;
			var1[var3++] += var0[var2++] * var4;
			var4 += var5;
		}

		for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
			var1[var3++] += var0[var2++] * var4;
		}

		var9.ae_fld = var4 >> 2;
		var9.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int do_(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3++];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILac;)I"
	)
	static int cj(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10) {
		var3 >>= 8;
		var9 >>= 8;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;
		var7 -= 6;

		while (var4 < var7) {
			short var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var2[var4++] += var11 * var5 >> 6;
			var2[var4++] += var11 * var6 >> 6;
		}

		var7 += 6;

		while (var4 < var7) {
			short var15 = var1[var3--];
			var2[var4++] += var15 * var5 >> 6;
			var2[var4++] += var15 * var6 >> 6;
		}

		var10.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int ao(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3--];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILac;Z)I"
	)
	static int ar(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10, boolean var11) {
		var3 >>= 8;
		var9 >>= 8;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;
		var7 -= 6;
		if (var11) {
			while (var4 < var7) {
				short var17 = var1[var3++];
				var2[var4++] += var17 * var5 << 2;
				var2[var4++] += var17 * var6 << 2;
				var17 = var1[var3++];
				var2[var4++] += var17 * var5 << 2;
				var2[var4++] += var17 * var6 << 2;
				var17 = var1[var3++];
				var2[var4++] += var17 * var5 << 2;
				var2[var4++] += var17 * var6 << 2;
				var17 = var1[var3++];
				var2[var4++] += var17 * var5 << 2;
				var2[var4++] += var17 * var6 << 2;
			}

			var7 += 6;

			while (var4 < var7) {
				short var21 = var1[var3++];
				var2[var4++] += var21 * var5 << 2;
				var2[var4++] += var21 * var6 << 2;
			}
		} else {
			while (var4 < var7) {
				short var12 = var1[var3++];
				var2[var4++] += var12 * var5 >> 6;
				var2[var4++] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var2[var4++] += var12 * var5 >> 6;
				var2[var4++] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var2[var4++] += var12 * var5 >> 6;
				var2[var4++] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var2[var4++] += var12 * var5 >> 6;
				var2[var4++] += var12 * var6 >> 6;
			}

			var7 += 6;

			while (var4 < var7) {
				short var16 = var1[var3++];
				var2[var4++] += var16 * var5 >> 6;
				var2[var4++] += var16 * var6 >> 6;
			}
		}

		var10.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILac;)I"
	)
	static int da(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ac var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.ah_fld = var9.ah_fld + var9.ax_fld * (var6 - var3);
		var9.aw_fld = var9.aw_fld + var9.an_fld * (var6 - var3);
		var6 -= 3;

		while (var3 < var6) {
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
		}

		for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
			var1[var3++] += var0[var2--] * var4;
		}

		var9.ae_fld = var4 >> 2;
		var9.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILac;)I"
	)
	static int dk(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ac var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.ah_fld = var9.ah_fld + var9.ax_fld * (var6 - var3);
		var9.aw_fld = var9.aw_fld + var9.an_fld * (var6 - var3);
		var6 -= 3;

		while (var3 < var6) {
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
		}

		for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
			var1[var3++] += var0[var2--] * var4;
		}

		var9.ae_fld = var4 >> 2;
		var9.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILac;)I"
	)
	static int dx(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ac var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.ah_fld = var9.ah_fld + var9.ax_fld * (var6 - var3);
		var9.aw_fld = var9.aw_fld + var9.an_fld * (var6 - var3);
		var6 -= 3;

		while (var3 < var6) {
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
			var1[var3++] += var0[var2--] * var4;
			var4 += var5;
		}

		for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
			var1[var3++] += var0[var2--] * var4;
		}

		var9.ae_fld = var4 >> 2;
		var9.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "(Lac;)V"
	)
	public static void wr(ac var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.al_fld != 0) {
				if (var0.az_fld == Integer.MIN_VALUE) {
					var0.az_fld = 0;
				}

				var0.al_fld = 0;
				var0.er();
			}
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int ds(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3--];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int du(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3--];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	@Override
	public synchronized void bj(int[] var1, int var2, int var3) {
		if (this.az_fld == 0 && this.al_fld == 0) {
			this.af(var3);
		} else {
			al var4 = (al)this.aa_fld;
			int var5 = this.as_fld << 8;
			int var6 = this.ar_fld << 8;
			int var7 = var4.ag_fld.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.ay_fld = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.ak_fld < 0) {
				if (this.ag_fld <= 0) {
					wr(this);
					this.gy_void();
					return;
				}

				this.ak_fld = 0;
			}

			if (this.ak_fld >= var7) {
				if (this.ag_fld >= 0) {
					wr(this);
					this.gy_void();
					return;
				}

				this.ak_fld = var7 - 1;
			}

			if (this.ay_fld < 0) {
				if (this.af_fld) {
					if (this.ag_fld < 0) {
						var9 = dd(this, var1, var2, var5, var3, var4.ag_fld[this.as_fld]);
						if (this.ak_fld >= var5) {
							return;
						}

						this.ak_fld = var5 + var5 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
					}

					while (true) {
						var9 = this.cq(var1, var9, var6, var3, var4.ag_fld[this.ar_fld - 1]);
						if (this.ak_fld < var6) {
							return;
						}

						this.ak_fld = var6 + var6 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
						var9 = dd(this, var1, var9, var5, var3, var4.ag_fld[this.as_fld]);
						if (this.ak_fld >= var5) {
							return;
						}

						this.ak_fld = var5 + var5 - 1 - this.ak_fld;
						this.ag_fld = -this.ag_fld;
					}
				} else if (this.ag_fld < 0) {
					while (true) {
						var9 = dd(this, var1, var9, var5, var3, var4.ag_fld[this.ar_fld - 1]);
						if (this.ak_fld >= var5) {
							return;
						}

						this.ak_fld = var6 - 1 - (var6 - 1 - this.ak_fld) % var8;
					}
				} else {
					while (true) {
						var9 = this.cq(var1, var9, var6, var3, var4.ag_fld[this.as_fld]);
						if (this.ak_fld < var6) {
							return;
						}

						this.ak_fld = var5 + (this.ak_fld - var5) % var8;
					}
				}
			} else {
				if (this.ay_fld > 0) {
					label183:
					if (this.af_fld) {
						if (this.ag_fld < 0) {
							var9 = dd(this, var1, var2, var5, var3, var4.ag_fld[this.as_fld]);
							if (this.ak_fld >= var5) {
								return;
							}

							this.ak_fld = var5 + var5 - 1 - this.ak_fld;
							this.ag_fld = -this.ag_fld;
							if (--this.ay_fld == 0) {
								break label183;
							}
						}

						do {
							var9 = this.cq(var1, var9, var6, var3, var4.ag_fld[this.ar_fld - 1]);
							if (this.ak_fld < var6) {
								return;
							}

							this.ak_fld = var6 + var6 - 1 - this.ak_fld;
							this.ag_fld = -this.ag_fld;
							if (--this.ay_fld == 0) {
								break;
							}

							var9 = dd(this, var1, var9, var5, var3, var4.ag_fld[this.as_fld]);
							if (this.ak_fld >= var5) {
								return;
							}

							this.ak_fld = var5 + var5 - 1 - this.ak_fld;
							this.ag_fld = -this.ag_fld;
						} while (--this.ay_fld != 0);
					} else if (this.ag_fld < 0) {
						while (true) {
							var9 = dd(this, var1, var9, var5, var3, var4.ag_fld[this.ar_fld - 1]);
							if (this.ak_fld >= var5) {
								return;
							}

							int var13 = (var6 - 1 - this.ak_fld) / var8;
							if (var13 >= this.ay_fld) {
								this.ak_fld = this.ak_fld + var8 * this.ay_fld;
								this.ay_fld = 0;
								break;
							}

							this.ak_fld += var8 * var13;
							this.ay_fld -= var13;
						}
					} else {
						while (true) {
							var9 = this.cq(var1, var9, var6, var3, var4.ag_fld[this.as_fld]);
							if (this.ak_fld < var6) {
								return;
							}

							int var10 = (this.ak_fld - var5) / var8;
							if (var10 >= this.ay_fld) {
								this.ak_fld = this.ak_fld - var8 * this.ay_fld;
								this.ay_fld = 0;
								break;
							}

							this.ak_fld -= var8 * var10;
							this.ay_fld -= var10;
						}
					}
				}

				if (this.ag_fld < 0) {
					dd(this, var1, var9, 0, var3, 0);
					if (this.ak_fld < 0) {
						this.ak_fld = -1;
						wr(this);
						this.gy_void();
					}
				} else {
					this.cq(var1, var9, var7, var3, 0);
					if (this.ak_fld >= var7) {
						this.ak_fld = var7;
						wr(this);
						this.gy_void();
					}
				}
			}
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int dg(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3--];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int dw(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		var11.ah_fld = var11.ah_fld - var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld - var11.an_fld * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 124470660) / var12) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var1 = var4 >> 8;
			short var14 = var2[var1];
			var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (int var17 = var13; var5 < var8; var4 += var12) {
			short var15 = var2[var4 >> 8];
			var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
		}

		var11.ah_fld = var11.ah_fld + var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld + var11.an_fld * var5;
		var11.ae_fld = var6;
		var11.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILac;II)I"
	)
	static int ab(
		int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, ac var11, int var12, int var13
	) {
		var11.ah_fld = var11.ah_fld - var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld - var11.an_fld * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		while (var5 < var8) {
			var1 = var4 >> 8;
			short var14 = var2[var1];
			var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (int var17 = var13; var5 < var8; var4 += var12) {
			short var15 = var2[var4 >> 8];
			var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
		}

		var11.ah_fld = var11.ah_fld + var11.ax_fld * var5;
		var11.aw_fld = var11.aw_fld + var11.an_fld * var5;
		var11.ae_fld = var6;
		var11.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int ev() {
		return this.az_fld == Integer.MIN_VALUE ? 0 : this.az_fld + 32 >> 6;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int dn(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1];
			int var17 = var16 + ((var2[var1 + 1] - var16) * (var4 & 8846385) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var21 = var15; var5 < var10; var4 += var14) {
			short var18 = var2[var4 >> 8];
			int var19 = var18 + ((var21 - var18) * (var4 & 0xFF) >> 8);
			var3[var5++] += var19 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var19 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int df(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1];
			int var17 = var16 + ((var2[var1 + 1] - var16) * (var4 & 0xFF) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var21 = var15; var5 < var10; var4 += var14) {
			short var18 = var2[var4 >> 8];
			int var19 = var18 + ((var21 - var18) * (var4 & 0xFF) >> 8);
			var3[var5++] += var19 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var19 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void fq(int var1) {
		if (var1 == 0) {
			this.bt(0);
			this.gy_void();
		} else if (this.ah_fld == 0 && this.aw_fld == 0) {
			this.al_fld = 0;
			this.az_fld = 0;
			this.ae_fld = 0;
			this.gy_void();
		} else {
			int var2 = -this.ae_fld;
			if (this.ae_fld > var2) {
				var2 = this.ae_fld;
			}

			if (-this.ah_fld > var2) {
				var2 = -this.ah_fld;
			}

			if (this.ah_fld > var2) {
				var2 = this.ah_fld;
			}

			if (-this.aw_fld > var2) {
				var2 = -this.aw_fld;
			}

			if (this.aw_fld > var2) {
				var2 = this.aw_fld;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.al_fld = var1;
			this.az_fld = Integer.MIN_VALUE;
			this.au_fld = -this.ae_fld / var1;
			this.ax_fld = -this.ah_fld / var1;
			this.an_fld = -this.aw_fld / var1;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public synchronized void bw(int var1, int var2) {
		this.ba(var1, var2, this.bi());
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int dj(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1 - 1];
			int var17 = var16 + ((var2[var1] - var16) * (var4 & 0xFF) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var20 = var15; var5 < var10; var4 += var14) {
			var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int es(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1 - 1];
			int var17 = var16 + ((var2[var1] - var16) * (var4 & 0xFF) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var20 = var15; var5 < var10; var4 += var14) {
			var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILac;II)I"
	)
	static int ct(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var1 = var4 >> 8;
			short var13 = var2[var1];
			var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (int var16 = var12; var5 < var7; var4 += var11) {
			short var14 = var2[var4 >> 8];
			var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
		}

		var10.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ss(int var1) {
		this.bm(var1);
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int eb(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1 - 1];
			int var17 = var16 + ((var2[var1] - var16) * (var4 & -1674322913) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var20 = var15; var5 < var10; var4 += var14) {
			var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & -2117957052) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int fz() {
		return this.ag_fld < 0 ? -this.ag_fld : this.ag_fld;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int et() {
		int var1 = this.ae_fld >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.ay_fld == 0) {
			var1 -= var1 * this.ak_fld / (((al)this.aa_fld).ag_fld.length << 8);
		} else if (this.ay_fld >= 0) {
			var1 -= var1 * this.as_fld / ((al)this.aa_fld).ag_fld.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ew() {
		int var1 = this.ae_fld >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.ay_fld == 0) {
			var1 -= var1 * this.ak_fld / (((al)this.aa_fld).ag_fld.length << 8);
		} else if (this.ay_fld >= 0) {
			var1 -= var1 * this.as_fld / ((al)this.aa_fld).ag_fld.length;
		}

		return var1 > -1571173391 ? 810637839 : var1;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ex() {
		int var1 = this.ae_fld >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.ay_fld == 0) {
			var1 -= var1 * this.ak_fld / (((al)this.aa_fld).ag_fld.length << 8);
		} else if (this.ay_fld >= 0) {
			var1 -= var1 * this.as_fld / ((al)this.aa_fld).ag_fld.length;
		}

		return var1 > 1000338225 ? 255 : var1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int cx(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	synchronized void ei(int var1, int var2) {
		this.az_fld = var1;
		this.av_fld = var2;
		this.al_fld = 0;
		this.er();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
		this.ae_fld = this.az_fld;
		this.ah_fld = ak(this.az_fld, this.av_fld);
		this.aw_fld = ag(this.az_fld, this.av_fld);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public synchronized void ba(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.bf(var2, var3);
		} else {
			int var4 = ak(var2, var3);
			int var5 = ag(var2, var3);
			if (this.ah_fld == var4 && this.aw_fld == var5) {
				this.al_fld = 0;
			} else {
				int var6 = var2 - this.ae_fld;
				if (this.ae_fld - var2 > var6) {
					var6 = this.ae_fld - var2;
				}

				if (var4 - this.ah_fld > var6) {
					var6 = var4 - this.ah_fld;
				}

				if (this.ah_fld - var4 > var6) {
					var6 = this.ah_fld - var4;
				}

				if (var5 - this.aw_fld > var6) {
					var6 = var5 - this.aw_fld;
				}

				if (this.aw_fld - var5 > var6) {
					var6 = this.aw_fld - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.al_fld = var1;
				this.az_fld = var2;
				this.av_fld = var3;
				this.au_fld = (var2 - this.ae_fld) / var1;
				this.ax_fld = (var4 - this.ah_fld) / var1;
				this.an_fld = (var5 - this.aw_fld) / var1;
			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ec() {
		this.ae_fld = this.az_fld;
		this.ah_fld = ak(this.az_fld, this.av_fld);
		this.aw_fld = ag(this.az_fld, this.av_fld);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void eg(int var1) {
		this.ay_fld = var1;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean gk() {
		int var1 = this.az_fld;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = ak(var1, this.av_fld);
			var3 = ag(var1, this.av_fld);
		}

		if (this.ae_fld == var1 && this.ah_fld == var2 && this.aw_fld == var3) {
			if (this.az_fld == Integer.MIN_VALUE) {
				this.az_fld = 0;
				this.aw_fld = 0;
				this.ah_fld = 0;
				this.ae_fld = 0;
				this.gy_void();
				return true;
			} else {
				this.er();
				return false;
			}
		} else {
			if (this.ae_fld < var1) {
				this.au_fld = 1;
				this.al_fld = var1 - this.ae_fld;
			} else if (this.ae_fld > var1) {
				this.au_fld = -1;
				this.al_fld = this.ae_fld - var1;
			} else {
				this.au_fld = 0;
			}

			if (this.ah_fld < var2) {
				this.ax_fld = 1;
				if (this.al_fld == 0 || this.al_fld > var2 - this.ah_fld) {
					this.al_fld = var2 - this.ah_fld;
				}
			} else if (this.ah_fld > var2) {
				this.ax_fld = -1;
				if (this.al_fld == 0 || this.al_fld > this.ah_fld - var2) {
					this.al_fld = this.ah_fld - var2;
				}
			} else {
				this.ax_fld = 0;
			}

			if (this.aw_fld < var3) {
				this.an_fld = 1;
				if (this.al_fld == 0 || this.al_fld > var3 - this.aw_fld) {
					this.al_fld = var3 - this.aw_fld;
				}
			} else if (this.aw_fld > var3) {
				this.an_fld = -1;
				if (this.al_fld == 0 || this.al_fld > this.aw_fld - var3) {
					this.al_fld = this.aw_fld - var3;
				}
			} else {
				this.an_fld = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int dd(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3++];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public synchronized void ft(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.bf(var2, var3);
		} else {
			int var4 = ak(var2, var3);
			int var5 = ag(var2, var3);
			if (this.ah_fld == var4 && this.aw_fld == var5) {
				this.al_fld = 0;
			} else {
				int var6 = var2 - this.ae_fld;
				if (this.ae_fld - var2 > var6) {
					var6 = this.ae_fld - var2;
				}

				if (var4 - this.ah_fld > var6) {
					var6 = var4 - this.ah_fld;
				}

				if (this.ah_fld - var4 > var6) {
					var6 = this.ah_fld - var4;
				}

				if (var5 - this.aw_fld > var6) {
					var6 = var5 - this.aw_fld;
				}

				if (this.aw_fld - var5 > var6) {
					var6 = this.aw_fld - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.al_fld = var1;
				this.az_fld = var2;
				this.av_fld = var3;
				this.au_fld = (var2 - this.ae_fld) / var1;
				this.ax_fld = (var4 - this.ah_fld) / var1;
				this.an_fld = (var5 - this.aw_fld) / var1;
			}
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	synchronized void ee(int var1, int var2) {
		this.az_fld = var1;
		this.av_fld = var2;
		this.al_fld = 0;
		this.er();
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int ek() {
		return this.az_fld == 781424571 ? 0 : this.az_fld + -1723108356 >> 6;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int cp(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void en() {
		this.ae_fld = this.az_fld;
		this.ah_fld = ak(this.az_fld, this.av_fld);
		this.aw_fld = ag(this.az_fld, this.av_fld);
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void em(int var1) {
		this.bf(var1 << 6, this.bi());
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bs() {
		return null;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void eh(int var1) {
		this.bf(var1 << 6, this.bi());
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void eu(int var1) {
		this.bf(var1 << 6, this.bi());
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int ej() {
		return this.az_fld == Integer.MIN_VALUE ? 0 : this.az_fld;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int fy() {
		return this.az_fld == Integer.MIN_VALUE ? 0 : this.az_fld;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	synchronized void fa(int var1) {
		this.bf(var1, this.bi());
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	synchronized void fo(int var1) {
		this.bf(var1, this.bi());
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILac;II)I"
	)
	static int aa(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, ac var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		while (var5 < var7) {
			var1 = var4 >> 8;
			short var13 = var2[var1 - 1];
			var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (int var16 = var11; var5 < var7; var4 += var16) {
			var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
		}

		var10.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	synchronized void fx(int var1) {
		this.bf(var1, this.bi());
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	synchronized void fv(int var1) {
		this.bf(var1, this.bi());
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ak(int var0, int var1) {
		return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((16384 - var1) * 1.2207031E-4F) + 0.5);
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public synchronized int fb() {
		return this.av_fld < 0 ? -1 : this.av_fld;
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void fk(int var1) {
		int var2 = ((al)this.aa_fld).ag_fld.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.ak_fld = var1;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public synchronized void fh(boolean var1) {
		this.ag_fld = (this.ag_fld ^ this.ag_fld >> 31) + (this.ag_fld >>> 31);
		if (var1) {
			this.ag_fld = -this.ag_fld;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public synchronized void bn(boolean var1) {
		this.ag_fld = (this.ag_fld ^ this.ag_fld >> 1812320944) + (this.ag_fld >>> 31);
		if (var1) {
			this.ag_fld = -this.ag_fld;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bd() {
		return null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bc() {
		if (this.al_fld != 0) {
			if (this.az_fld == Integer.MIN_VALUE) {
				this.az_fld = 0;
			}

			this.al_fld = 0;
			this.er();
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int db(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3--];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public synchronized void fl(int var1, int var2) {
		this.ba(var1, var2, this.bi());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILac;)I"
	)
	static int am(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, ac var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.ae_fld = var12.ae_fld + var12.au_fld * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		var9 -= 6;

		while (var4 < var9) {
			short var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var2[var4++] += var13 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var13 * var6 >> 6;
			var6 += var8;
		}

		for (int var40 = var9 + 6; var4 < var40; var6 += var8) {
			short var17 = var1[var3++];
			var2[var4++] += var17 * var5 >> 6;
			var5 += var7;
			var2[var4++] += var17 * var6 >> 6;
		}

		var12.ah_fld = var5;
		var12.aw_fld = var6;
		var12.ak_fld = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public synchronized void fn(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.bf(var2, var3);
		} else {
			int var4 = ak(var2, var3);
			int var5 = ag(var2, var3);
			if (this.ah_fld == var4 && this.aw_fld == var5) {
				this.al_fld = 0;
			} else {
				int var6 = var2 - this.ae_fld;
				if (this.ae_fld - var2 > var6) {
					var6 = this.ae_fld - var2;
				}

				if (var4 - this.ah_fld > var6) {
					var6 = var4 - this.ah_fld;
				}

				if (this.ah_fld - var4 > var6) {
					var6 = this.ah_fld - var4;
				}

				if (var5 - this.aw_fld > var6) {
					var6 = var5 - this.aw_fld;
				}

				if (this.aw_fld - var5 > var6) {
					var6 = this.aw_fld - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.al_fld = var1;
				this.az_fld = var2;
				this.av_fld = var3;
				this.au_fld = (var2 - this.ae_fld) / var1;
				this.ax_fld = (var4 - this.ah_fld) / var1;
				this.an_fld = (var5 - this.aw_fld) / var1;
			}
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lal;II)Lac;"
	)
	public static ac ce(al var0, int var1, int var2) {
		return var0.ag_fld != null && var0.ag_fld.length != 0 ? new ac(var0, (int)(var0.ak_fld * 256L * var1 / (ao.ar_fld * -493825580)), var2 << 6) : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILac;)I"
	)
	static int aq(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ac var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.ah_fld = var9.ah_fld + var9.ax_fld * (var6 - var3);
		var9.aw_fld = var9.aw_fld + var9.an_fld * (var6 - var3);
		var6 -= 3;

		while (var3 < var6) {
			var1[var3++] += var0[var2++] * var4;
			var4 += var5;
			var1[var3++] += var0[var2++] * var4;
			var4 += var5;
			var1[var3++] += var0[var2++] * var4;
			var4 += var5;
			var1[var3++] += var0[var2++] * var4;
			var4 += var5;
		}

		for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
			var1[var3++] += var0[var2++] * var4;
		}

		var9.ae_fld = var4 >> 2;
		var9.ak_fld = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int cf(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.2207031E-4F) + 0.5);
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void fs(int var1) {
		if (var1 == 0) {
			this.bt(0);
			this.gy_void();
		} else if (this.ah_fld == 0 && this.aw_fld == 0) {
			this.al_fld = 0;
			this.az_fld = 0;
			this.ae_fld = 0;
			this.gy_void();
		} else {
			int var2 = -this.ae_fld;
			if (this.ae_fld > var2) {
				var2 = this.ae_fld;
			}

			if (-this.ah_fld > var2) {
				var2 = -this.ah_fld;
			}

			if (this.ah_fld > var2) {
				var2 = this.ah_fld;
			}

			if (-this.aw_fld > var2) {
				var2 = -this.aw_fld;
			}

			if (this.aw_fld > var2) {
				var2 = this.aw_fld;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.al_fld = var1;
			this.az_fld = Integer.MIN_VALUE;
			this.au_fld = -this.ae_fld / var1;
			this.ax_fld = -this.ah_fld / var1;
			this.an_fld = -this.aw_fld / var1;
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void ff(int var1) {
		if (this.ag_fld < 0) {
			this.ag_fld = -var1;
		} else {
			this.ag_fld = var1;
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void fr(int var1) {
		if (var1 == 0) {
			this.bt(0);
			this.gy_void();
		} else if (this.ah_fld == 0 && this.aw_fld == 0) {
			this.al_fld = 0;
			this.az_fld = 0;
			this.ae_fld = 0;
			this.gy_void();
		} else {
			int var2 = -this.ae_fld;
			if (this.ae_fld > var2) {
				var2 = this.ae_fld;
			}

			if (-this.ah_fld > var2) {
				var2 = -this.ah_fld;
			}

			if (this.ah_fld > var2) {
				var2 = this.ah_fld;
			}

			if (-this.aw_fld > var2) {
				var2 = -this.aw_fld;
			}

			if (this.aw_fld > var2) {
				var2 = this.aw_fld;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.al_fld = var1;
			this.az_fld = Integer.MIN_VALUE;
			this.au_fld = -this.ae_fld / var1;
			this.ax_fld = -this.ah_fld / var1;
			this.an_fld = -this.aw_fld / var1;
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void fu(int var1) {
		if (var1 == 0) {
			this.bt(0);
			this.gy_void();
		} else if (this.ah_fld == 0 && this.aw_fld == 0) {
			this.al_fld = 0;
			this.az_fld = 0;
			this.ae_fld = 0;
			this.gy_void();
		} else {
			int var2 = -this.ae_fld;
			if (this.ae_fld > var2) {
				var2 = this.ae_fld;
			}

			if (-this.ah_fld > var2) {
				var2 = -this.ah_fld;
			}

			if (this.ah_fld > var2) {
				var2 = this.ah_fld;
			}

			if (-this.aw_fld > var2) {
				var2 = -this.aw_fld;
			}

			if (this.aw_fld > var2) {
				var2 = this.aw_fld;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.al_fld = var1;
			this.az_fld = 141125984;
			this.au_fld = -this.ae_fld / var1;
			this.ax_fld = -this.ah_fld / var1;
			this.an_fld = -this.aw_fld / var1;
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lac;[IIIII)I"
	)
	public static int dd(ac var0, int[] var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		while (var0.al_fld > 0) {
			int var6 = var2 + var0.al_fld;
			if (var6 > var4) {
				var6 = var4;
			}

			var0.al_fld += var2;
			if (var0.ag_fld == -256 && (var0.ak_fld & 0xFF) == 0) {
				if (jx.al_fld) {
					var2 = ao(0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ah_fld, var0.aw_fld, var0.ax_fld, var0.an_fld, 0, var6, var3, var0);
				} else {
					var2 = ad(((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ae_fld, var0.au_fld, 0, var6, var3, var0);
				}
			} else if (jx.al_fld) {
				var2 = ac(
					0, 0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ah_fld, var0.aw_fld, var0.ax_fld, var0.an_fld, 0, var6, var3, var0, var0.ag_fld, var5
				);
			} else {
				var2 = at(0, 0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ae_fld, var0.au_fld, 0, var6, var3, var0, var0.ag_fld, var5);
			}

			var0.al_fld -= var2;
			if (var0.al_fld != 0) {
				return var2;
			}

			if (var0.cy()) {
				return var4;
			}
		}

		if (var0.ag_fld == -256 && (var0.ak_fld & 0xFF) == 0) {
			return jx.al_fld
				? au(0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ah_fld, var0.aw_fld, 0, var4, var3, var0)
				: al(((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ae_fld, 0, var4, var3, var0);
		} else {
			return jx.al_fld
				? ai(0, 0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ah_fld, var0.aw_fld, 0, var4, var3, var0, var0.ag_fld, var5)
				: aa(0, 0, ((al)var0.aa_fld).ag_fld, var1, var0.ak_fld, var2, var0.ae_fld, 0, var4, var3, var0, var0.ag_fld, var5);
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int ep(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1 - 1];
			int var17 = var16 + ((var2[var1] - var16) * (var4 & 268554461) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var20 = var15; var5 < var10; var4 += var14) {
			var0 = var20 + ((var2[var4 >> 8] - var20) * (var4 & 0xFF) >> 8);
			var3[var5++] += var0 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void fd(int var1) {
		if (var1 == 0) {
			this.bt(0);
			this.gy_void();
		} else if (this.ah_fld == 0 && this.aw_fld == 0) {
			this.al_fld = 0;
			this.az_fld = 0;
			this.ae_fld = 0;
			this.gy_void();
		} else {
			int var2 = -this.ae_fld;
			if (this.ae_fld > var2) {
				var2 = this.ae_fld;
			}

			if (-this.ah_fld > var2) {
				var2 = -this.ah_fld;
			}

			if (this.ah_fld > var2) {
				var2 = this.ah_fld;
			}

			if (-this.aw_fld > var2) {
				var2 = -this.aw_fld;
			}

			if (this.aw_fld > var2) {
				var2 = this.aw_fld;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.al_fld = var1;
			this.az_fld = Integer.MIN_VALUE;
			this.au_fld = -this.ae_fld / var1;
			this.ax_fld = -this.ah_fld / var1;
			this.an_fld = -this.aw_fld / var1;
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public synchronized void gg(int var1) {
		if (this.ag_fld < 0) {
			this.ag_fld = -var1;
		} else {
			this.ag_fld = var1;
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean gn() {
		return this.ak_fld < 0 || this.ak_fld >= ((al)this.aa_fld).ag_fld.length << 8;
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean gr() {
		return this.ak_fld < 0 || this.ak_fld >= ((al)this.aa_fld).ag_fld.length << 8;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public synchronized void fg(int var1, int var2) {
		this.ba(var1, var2, this.bi());
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean gc() {
		return this.al_fld != 0;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean gh() {
		return this.al_fld != 0;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILac;II)I"
	)
	static int di(
		int var0,
		int var1,
		short[] var2,
		int[] var3,
		int var4,
		int var5,
		int var6,
		int var7,
		int var8,
		int var9,
		int var10,
		int var11,
		int var12,
		ac var13,
		int var14,
		int var15
	) {
		var13.ae_fld = var13.ae_fld - var13.au_fld * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1];
			int var17 = var16 + ((var2[var1 + 1] - var16) * (var4 & -1550362272) >> 8);
			var3[var5++] += var17 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var17 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (int var21 = var15; var5 < var10; var4 += var14) {
			short var18 = var2[var4 >> 8];
			int var19 = var18 + ((var21 - var18) * (var4 & 573614926) >> 8);
			var3[var5++] += var19 * var6 >> 6;
			var6 += var8;
			var3[var5++] += var19 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.ae_fld = var13.ae_fld + var13.au_fld * var5;
		var13.ah_fld = var6;
		var13.aw_fld = var7;
		var13.ak_fld = var4;
		return var5;
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "([IIIII)I"
	)
	int gs(int[] var1, int var2, int var3, int var4, int var5) {
		while (this.al_fld > 0) {
			int var6 = var2 + this.al_fld;
			if (var6 > var4) {
				var6 = var4;
			}

			this.al_fld += var2;
			if (this.ag_fld == 256 && (this.ak_fld & 0xFF) == 0) {
				if (jx.al_fld) {
					var2 = am(0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, this.ax_fld, this.an_fld, 0, var6, var3, this);
				} else {
					var2 = aq(((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, this.au_fld, 0, var6, var3, this);
				}
			} else if (jx.al_fld) {
				var2 = ap(
					0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, this.ax_fld, this.an_fld, 0, var6, var3, this, this.ag_fld, var5
				);
			} else {
				var2 = ab(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, this.au_fld, 0, var6, var3, this, this.ag_fld, var5);
			}

			this.al_fld -= var2;
			if (this.al_fld != 0) {
				return var2;
			}

			if (this.cy()) {
				return var4;
			}
		}

		if (this.ag_fld == 256 && (this.ak_fld & 0xFF) == 0) {
			return jx.al_fld
				? ar(0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, 0, var4, var3, this, ((al)this.aa_fld).ag())
				: ae(((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, 0, var4, var3, this);
		} else {
			return jx.al_fld
				? an(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, 0, var4, var3, this, this.ag_fld, var5)
				: ax(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, 0, var4, var3, this, this.ag_fld, var5);
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "([IIIII)I"
	)
	int gp(int[] var1, int var2, int var3, int var4, int var5) {
		while (this.al_fld > 0) {
			int var6 = var2 + this.al_fld;
			if (var6 > var4) {
				var6 = var4;
			}

			this.al_fld += var2;
			if (this.ag_fld == -256 && (this.ak_fld & 0xFF) == 0) {
				if (jx.al_fld) {
					var2 = ao(0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, this.ax_fld, this.an_fld, 0, var6, var3, this);
				} else {
					var2 = ad(((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, this.au_fld, 0, var6, var3, this);
				}
			} else if (jx.al_fld) {
				var2 = ac(
					0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, this.ax_fld, this.an_fld, 0, var6, var3, this, this.ag_fld, var5
				);
			} else {
				var2 = at(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, this.au_fld, 0, var6, var3, this, this.ag_fld, var5);
			}

			this.al_fld -= var2;
			if (this.al_fld != 0) {
				return var2;
			}

			if (this.cy()) {
				return var4;
			}
		}

		if (this.ag_fld == -256 && (this.ak_fld & 0xFF) == 0) {
			return jx.al_fld
				? au(0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, 0, var4, var3, this)
				: al(((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, 0, var4, var3, this);
		} else {
			return jx.al_fld
				? ai(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ah_fld, this.aw_fld, 0, var4, var3, this, this.ag_fld, var5)
				: aa(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ak_fld, var2, this.ae_fld, 0, var4, var3, this, this.ag_fld, var5);
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean gv() {
		int var1 = this.az_fld;
		int var2;
		int var3;
		if (var1 == 2034583800) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = ak(var1, this.av_fld);
			var3 = ag(var1, this.av_fld);
		}

		if (this.ae_fld == var1 && this.ah_fld == var2 && this.aw_fld == var3) {
			if (this.az_fld == Integer.MIN_VALUE) {
				this.az_fld = 0;
				this.aw_fld = 0;
				this.ah_fld = 0;
				this.ae_fld = 0;
				this.gy_void();
				return true;
			} else {
				this.er();
				return false;
			}
		} else {
			if (this.ae_fld < var1) {
				this.au_fld = 1;
				this.al_fld = var1 - this.ae_fld;
			} else if (this.ae_fld > var1) {
				this.au_fld = -1;
				this.al_fld = this.ae_fld - var1;
			} else {
				this.au_fld = 0;
			}

			if (this.ah_fld < var2) {
				this.ax_fld = 1;
				if (this.al_fld == 0 || this.al_fld > var2 - this.ah_fld) {
					this.al_fld = var2 - this.ah_fld;
				}
			} else if (this.ah_fld > var2) {
				this.ax_fld = -1;
				if (this.al_fld == 0 || this.al_fld > this.ah_fld - var2) {
					this.al_fld = this.ah_fld - var2;
				}
			} else {
				this.ax_fld = 0;
			}

			if (this.aw_fld < var3) {
				this.an_fld = 1;
				if (this.al_fld == 0 || this.al_fld > var3 - this.aw_fld) {
					this.al_fld = var3 - this.aw_fld;
				}
			} else if (this.aw_fld > var3) {
				this.an_fld = -1;
				if (this.al_fld == 0 || this.al_fld > this.aw_fld - var3) {
					this.al_fld = this.aw_fld - var3;
				}
			} else {
				this.an_fld = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj be() {
		return null;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return super.toString();
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ez() {
		if (this.ax_fld != 0) {
			if (this.az_fld == Integer.MIN_VALUE) {
				this.as_fld = 0;
			}

			this.as_fld = 0;
			this.bc();
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "([IIIII)I"
	)
	int cv(int[] var1, int var2, int var3, int var4, int var5) {
		while (this.aw_fld > 0) {
			int var6 = var2 + this.an_fld;
			if (var6 > var4) {
				var6 = var4;
			}

			this.ay_fld = this.av_fld + var2;
			if (this.ay_fld == -256 && (this.aw_fld & 0xFF) == 0) {
				if (jx.al_fld) {
					var2 = db(0, ((al)this.aa_fld).ag_fld, var1, this.ar_fld, var2, this.av_fld, this.al_fld, this.az_fld, this.az_fld, 0, var6, var3, this);
				} else {
					var2 = dk(((al)this.aa_fld).ag_fld, var1, this.ae_fld, var2, this.aw_fld, this.au_fld, 0, var6, var3, this);
				}
			} else if (jx.al_fld) {
				var2 = ac(
					0, 0, ((al)this.aa_fld).ag_fld, var1, this.ag_fld, var2, this.ak_fld, this.as_fld, this.al_fld, this.ay_fld, 0, var6, var3, this, this.aw_fld, var5
				);
			} else {
				var2 = ai(0, 0, ((al)this.aa_fld).ag_fld, var1, this.as_fld, var2, this.ah_fld, this.ak_fld, 0, var6, var3, this, this.ay_fld, var5);
			}

			this.ay_fld = this.ak_fld - var2;
			if (this.ag_fld != 0) {
				return var2;
			}

			if (this.gv()) {
				return var4;
			}
		}

		if (this.ak_fld == -256 && (this.as_fld & 0xFF) == 0) {
			return jx.al_fld
				? ch(0, ((al)this.aa_fld).ag_fld, var1, this.as_fld, var2, this.as_fld, this.av_fld, 0, var4, var3, this)
				: ck(((al)this.aa_fld).ag_fld, var1, this.as_fld, var2, this.an_fld, 0, var4, var3, this);
		} else {
			return jx.al_fld
				? dw(0, 0, ((al)this.aa_fld).ag_fld, var1, this.ae_fld, var2, this.ak_fld, this.ah_fld, 0, var4, var3, this, this.aw_fld, var5)
				: aa(0, 0, ((al)this.aa_fld).ag_fld, var1, this.az_fld, var2, this.ar_fld, 0, var4, var3, this, this.ag_fld, var5);
		}
	}
}
