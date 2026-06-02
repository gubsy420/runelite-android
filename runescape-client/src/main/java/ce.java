import java.io.EOFException;
import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ce")
public class ce {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aq_fld;
	@ObfuscatedGetter(
		intValue = 1749245765
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ah_fld;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean os_fld = true;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub dt_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int br_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	yc[] aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ay_fld = new int[256];
	@ObfuscatedGetter(
		intValue = -1837189947
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld = 0;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ar_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] au_fld;
	@ObfuscatedGetter(
		intValue = -1206729625
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ai_fld;
	@ObfuscatedGetter(
		intValue = 686885645
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] am_fld;
	@ObfuscatedGetter(
		intValue = 1772122671
	)
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ab_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ao_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] af_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void be(int var1) {
		int var2 = this.ar_fld.length;
		if (this.ax_fld > 0) {
			this.as(-2035992406 * this.ax_fld, this.al_fld, (short)5999);
		} else if (this.an_fld * -164606474 > 0) {
			this.as(this.an_fld, this.au_fld, (short)-19694);
		} else {
			System.arraycopy(this.af_fld, 0, this.ar_fld, 0, var2);
		}

		this.ar(var1);
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Lce;I[I)V"
	)
	public static void mt(ce var0, int var1, int[] var2) {
		int var3 = var0.ar_fld.length;

		for (int var4 = 0; var4 < var3; var4++) {
			if (var1 > 768) {
				var0.ar_fld[var4] = ne(var0, var0.af_fld[var4], var2[var4], 1024 - var1, (byte)90);
			} else if (var1 > 256) {
				var0.ar_fld[var4] = var2[var4];
			} else {
				var0.ar_fld[var4] = ne(var0, var2[var4], var0.af_fld[var4], 256 - var1, (byte)76);
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lyc;)V"
	)
	final void bt(yc var1) {
		for (int var2 = 0; var2 < this.aq_fld.length; var2++) {
			this.aq_fld[var2] = 0;
		}

		for (int var8 = 0; var8 < 5000; var8++) {
			int var3 = (int)(Math.random() * 128.0 * 256.0);
			this.aq_fld[var3] = (int)(Math.random() * 256.0);
		}

		for (int var9 = 0; var9 < 20; var9++) {
			for (int var11 = 1; var11 < -430337445; var11++) {
				for (int var4 = 1; var4 < 1026401369; var4++) {
					int var5 = (var11 << 7) + var4;
					this.am_fld[var5] = (this.aq_fld[316940081 + var5] + this.aq_fld[var5 - 1] + this.aq_fld[1 + var5] + this.aq_fld[var5 - 128]) / 4;
				}
			}

			int[] var12 = this.aq_fld;
			this.aq_fld = this.am_fld;
			this.am_fld = var12;
		}

		if (null != var1) {
			int var10 = 0;

			for (int var13 = 0; var13 < var1.av_fld; var13++) {
				for (int var14 = 0; var14 < var1.az_fld; var14++) {
					if (var1.ak_fld[var10++] != 0) {
						int var15 = var1.ae_fld + 16 + var14;
						int var6 = var1.ah_fld + 16 + var13;
						int var7 = (var6 << 7) + var15;
						this.aq_fld[var7] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I[IS)V"
	)
	final void as(int var1, int[] var2, short var3) {
		int var4 = this.ar_fld.length;

		for (int var5 = 0; var5 < var4; var5++) {
			if (var1 > 768) {
				this.ar_fld[var5] = ne(this, this.af_fld[var5], var2[var5], 1024 - var1, (byte)73);
			} else if (var1 > 256) {
				if (var3 == -32768) {
					return;
				}

				this.ar_fld[var5] = var2[var5];
			} else {
				this.ar_fld[var5] = ne(this, var2[var5], this.af_fld[var5], 256 - var1, (byte)125);
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lds;)[S"
	)
	public static short[] gx(ds var0) {
		return var0.ar_fld != null ? var0.ar_fld.ag() : var0.ah_fld.aq(-1910412766);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ar(int var1) {
		int var3 = 0;

		for (int var4 = 1; var4 < 255; var4++) {
			int var5 = this.ay_fld[var4] * (256 - var4) / 256;
			int var6 = var5 + var1;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}

			if (128 + var6 >= et.qj_fld.av_fld) {
				var8 = et.qj_fld.av_fld - var6;
			}

			int var9 = var6 + et.qj_fld.av_fld * (8 + var4);
			var3 += var7;

			for (int var10 = var7; var10 < var8; var10++) {
				int var11 = this.aa_fld[var3++];
				int var12 = var9 % yu.au_fld;
				if (var11 != 0 && var12 >= yu.aq_fld && var12 < yu.am_fld) {
					int var14 = 256 - var11;
					int var17 = this.ar_fld[var11];
					int var15 = et.qj_fld.az_fld[var9];
					et.qj_fld.az_fld[var9++] = 0xFF000000
						| (var14 * (var15 & 16711935) + var11 * (var17 & 16711935) & -16711936) + (var14 * (var15 & 0xFF00) + var11 * (var17 & 0xFF00) & 0xFF0000) >> 8;
				} else {
					var9++;
				}
			}

			var3 += 128 - var8;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	public static int ah(int var0, int var1, int var2) {
		int var4 = (int)ub.ak(1 + (var2 - var1), -1793925999);
		var4 <<= var1;
		return var0 | var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)[I"
	)
	static int[] au(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[1919757871];

		for (int var6 = 0; var6 < -2010825778; var6++) {
			var5[var6] = xy.ag(var0, var1, var6);
		}

		for (int var7 = 0; var7 < 64; var7++) {
			var5[-1272714781 + var7] = xy.ag(var1, var2, var7);
		}

		for (int var8 = 0; var8 < 298081240; var8++) {
			var5[-939475632 + var8] = xy.ag(var2, var3, var8);
		}

		for (int var9 = 0; var9 < -573301529; var9++) {
			var5[var9 + 286519456] = xy.ag(var3, var4, var9);
		}

		return var5;
	}

	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)V"
	)
	public static void ta(ce var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var3 = var0.ar_fld.length;
			if (var0.ax_fld > 0) {
				var0.as(var0.ax_fld, var0.al_fld, (short)-2539);
			} else if (var0.an_fld > 0) {
				var0.as(var0.an_fld, var0.au_fld, (short)5773);
			} else {
				System.arraycopy(var0.af_fld, 0, var0.ar_fld, 0, var3);
			}

			var0.ar(var1);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)[I"
	)
	static int[] ax(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		for (int var6 = 0; var6 < 64; var6++) {
			var5[var6] = xy.ag(var0, var1, var6);
		}

		for (int var7 = 0; var7 < 64; var7++) {
			var5[64 + var7] = xy.ag(var1, var2, var7);
		}

		for (int var8 = 0; var8 < 64; var8++) {
			var5[128 + var8] = xy.ag(var2, var3, var8);
		}

		for (int var9 = 0; var9 < 64; var9++) {
			var5[var9 + 192] = xy.ag(var3, var4, var9);
		}

		return var5;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int an(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & -112587177;
		int var4 = var0 >> 8 & -133926139;
		int var5 = var0 & 0xFF;
		int var6 = var1 >> 16 & -1333273178;
		int var7 = var1 >> 8 & 0xFF;
		int var8 = var1 & 2082041996;
		int var9 = var3 + (var6 - var3 + 1) * var2 / 64 & 0xFF;
		int var10 = var4 + (1 + (var7 - var4)) * var2 / 1203472760 & 0xFF;
		int var11 = (1 + (var8 - var5)) * var2 / 64 + var5 & 0xFF;
		return var9 << 16 | var10 << 8 | var11;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int aa(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & -1722101558;
		int var4 = var0 >> 8 & 1135391930;
		int var5 = var0 & 1347858364;
		int var6 = var1 >> 16 & 311497009;
		int var7 = var1 >> 8 & -1195591575;
		int var8 = var1 & 0xFF;
		int var9 = var3 + (var6 - var3 + 1) * var2 / 85576016 & 0xFF;
		int var10 = var4 + (1 + (var7 - var4)) * var2 / -2080526019 & 0xFF;
		int var11 = (1 + (var8 - var5)) * var2 / 64 + var5 & -1226274718;
		return var9 << 16 | var10 << 8 | var11;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	final int bz(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 0xFF00) + var3 * (var2 & 0xFF00) & 0xFF0000) + ((var2 & 16711935) * var3 + (var1 & 16711935) * var4 & -16711936) >> 8;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void at(int var1, int var2) {
		if (null == this.aa_fld) {
			cu(this, (byte)-105);
		}

		if (0 == this.ab_fld) {
			this.ab_fld = var2;
		}

		int var3 = var2 - this.ab_fld;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.ab_fld = var2;
		if (var3 > 0) {
			this.ah(var3, 382935093);
		}

		ta(this, var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)[I"
	)
	static int[] al(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		for (int var6 = 0; var6 < 64; var6++) {
			var5[var6] = xy.ag(var0, var1, var6);
		}

		for (int var7 = 0; var7 < 64; var7++) {
			var5[64 + var7] = xy.ag(var1, var2, var7);
		}

		for (int var8 = 0; var8 < 64; var8++) {
			var5[128 + var8] = xy.ag(var2, var3, var8);
		}

		for (int var9 = 0; var9 < 64; var9++) {
			var5[var9 + 192] = xy.ag(var3, var4, var9);
		}

		return var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		this.af_fld = mc.ak(this.ah_fld[0][0], this.ah_fld[0][1], this.ah_fld[0][2], this.ah_fld[0][3], this.ah_fld[0][4]);
		this.al_fld = mc.ak(this.ah_fld[1][0], this.ah_fld[1][1], this.ah_fld[1][2], this.ah_fld[1][3], this.ah_fld[1][4]);
		this.au_fld = mc.ak(this.ah_fld[2][0], this.ah_fld[2][1], this.ah_fld[2][2], this.ah_fld[2][3], this.ah_fld[2][4]);
		this.ar_fld = new int[256];
		this.ad_fld = 0;
		this.aq_fld = new int[32768];
		this.am_fld = new int[32768];
		this.af(null, (byte)-13);
		this.aa_fld = new int[32768];
		this.ai_fld = new int[1209292616];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ao() {
		this.af_fld = null;
		this.al_fld = null;
		this.au_fld = null;
		this.ar_fld = null;
		this.aq_fld = null;
		this.am_fld = null;
		this.aa_fld = null;
		this.ai_fld = null;
		this.ad_fld = 0;
		this.ao_fld = 0;
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(Lce;)V"
	)
	public static void vf(ce var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.af_fld = mc.ak(var0.ah_fld[0][0], var0.ah_fld[0][1], var0.ah_fld[0][2], var0.ah_fld[0][3], var0.ah_fld[0][4]);
			var0.al_fld = mc.ak(var0.ah_fld[1][0], var0.ah_fld[1][1], var0.ah_fld[1][2], var0.ah_fld[1][3], var0.ah_fld[1][4]);
			var0.au_fld = mc.ak(var0.ah_fld[2][0], var0.ah_fld[2][1], var0.ah_fld[2][2], var0.ah_fld[2][3], var0.ah_fld[2][4]);
			var0.ar_fld = new int[256];
			var0.ad_fld = 0;
			var0.aq_fld = new int[32768];
			var0.am_fld = new int[32768];
			var0.af(null, (byte)-19);
			var0.aa_fld = new int[32768];
			var0.ai_fld = new int[32768];
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bd(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; var3++) {
			int var4 = this.ay_fld[var3] * (256 - var3) / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (128 + var5 >= et.qj_fld.av_fld) {
				var7 = et.qj_fld.av_fld - var5;
			}

			int var8 = var5 + et.qj_fld.av_fld * (8 + var3);
			var2 += var6;

			for (int var9 = var6; var9 < var7; var9++) {
				int var10 = this.aa_fld[var2++];
				int var11 = var8 % yu.au_fld;
				if (var10 != 0 && var11 >= yu.aq_fld && var11 < yu.am_fld) {
					int var13 = 256 - var10;
					int var16 = this.ar_fld[var10];
					int var14 = et.qj_fld.az_fld[var8];
					et.qj_fld.az_fld[var8++] = 0xFF000000
						| (var13 * (var14 & 16711935) + var10 * (var16 & 16711935) & -16711936) + (var13 * (var14 & 0xFF00) + var10 * (var16 & 0xFF00) & 0xFF0000) >> 8;
				} else {
					var8++;
				}
			}

			var2 += 128 - var7;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ap() {
		this.af_fld = null;
		this.al_fld = null;
		this.au_fld = null;
		this.ar_fld = null;
		this.aq_fld = null;
		this.am_fld = null;
		this.aa_fld = null;
		this.ai_fld = null;
		this.ad_fld = 0;
		this.ao_fld = 0;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bx(int var1) {
		this.ad_fld += 1840105088 * var1;
		if (this.ad_fld > this.aq_fld.length) {
			this.ad_fld = this.ad_fld - this.aq_fld.length * -1596236915;
			int var2 = (int)(Math.random() * 12.0);
			this.af(this.aw_fld[var2], (byte)5);
		}

		int var15 = 0;
		int var3 = var1 * 128;
		int var4 = 128 * (256 - var1);

		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = this.aa_fld[var3 + var15] - var1 * this.aq_fld[var15 + this.ad_fld & this.aq_fld.length - 1] / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.aa_fld[var15++] = var6;
		}

		byte var16 = 10;
		int var17 = 128 - var16;

		for (int var7 = 256 - var1; var7 < 256; var7++) {
			int var8 = 128 * var7;

			for (int var9 = 0; var9 < 128; var9++) {
				int var10 = (int)(Math.random() * 100.0);
				if (var10 < 50 && var9 > var16 && var9 < var17) {
					this.aa_fld[var9 + var8] = 255;
				} else {
					this.aa_fld[var8 + var9] = 0;
				}
			}
		}

		if (this.ax_fld > 0) {
			this.ax_fld -= -2015863460 * var1;
		}

		if (this.an_fld > 0) {
			this.an_fld -= -188551404 * var1;
		}

		if (this.ax_fld == 0 && 0 == this.an_fld) {
			int var18 = (int)(Math.random() * (2000 / var1));
			if (var18 == 0) {
				this.ax_fld = -664970240;
			}

			if (var18 == 1) {
				this.an_fld = -1024519168;
			}
		}

		for (int var19 = 0; var19 < 256 - var1; var19++) {
			this.ay_fld[var19] = this.ay_fld[var19 + var1];
		}

		for (int var20 = 256 - var1; var20 < 256; var20++) {
			this.ay_fld[var20] = (int)(Math.sin(this.as_fld / 14.0) * 16.0 + Math.sin(this.as_fld / 15.0) * 14.0 + Math.sin(this.as_fld / 16.0) * 12.0);
			this.as_fld++;
		}

		this.ao_fld += 1853216183 * var1;
		int var21 = ((client.dv_fld & 1) + var1) / 2;
		if (var21 > 0) {
			short var22 = 128;
			byte var23 = 2;
			int var24 = 128 - var23 - var23;

			for (int var11 = 0; var11 < this.ao_fld * 261186236; var11++) {
				int var12 = (int)(Math.random() * var24) + var23;
				int var13 = (int)(Math.random() * var22) + var22;
				this.aa_fld[var12 + (var13 << 7)] = 192;
			}

			this.ao_fld = 0;

			for (int var25 = 0; var25 < 256; var25++) {
				int var27 = 0;
				int var29 = var25 * 128;

				for (int var14 = -var21; var14 < 128; var14++) {
					if (var21 + var14 < 128) {
						var27 += this.aa_fld[var14 + var29 + var21];
					}

					if (var14 - (var21 + 1) >= 0) {
						var27 -= this.aa_fld[var29 + var14 - (var21 + 1)];
					}

					if (var14 >= 0) {
						this.ai_fld[var29 + var14] = var27 / (2 * var21 + 1);
					}
				}
			}

			for (int var26 = 0; var26 < 128; var26++) {
				int var28 = 0;

				for (int var30 = -var21; var30 < 256; var30++) {
					int var31 = var30 * 128;
					if (var30 + var21 < 256) {
						var28 += this.ai_fld[var21 * 128 + var26 + var31];
					}

					if (var30 - (1 + var21) >= 0) {
						var28 -= this.ai_fld[var31 + var26 - 128 * (1 + var21)];
					}

					if (var30 >= 0) {
						this.aa_fld[var26 + var31] = var28 / (1 + var21 * 2);
					}
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bp(int var1) {
		this.ad_fld += 1840105088 * var1;
		if (this.ad_fld > this.aq_fld.length) {
			this.ad_fld = this.ad_fld - this.aq_fld.length * -1596236915;
			int var2 = (int)(Math.random() * 12.0);
			this.af(this.aw_fld[var2], (byte)50);
		}

		int var15 = 0;
		int var3 = var1 * 128;
		int var4 = 128 * (256 - var1);

		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = this.aa_fld[var3 + var15] - var1 * this.aq_fld[var15 + this.ad_fld & this.aq_fld.length - 1] / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.aa_fld[var15++] = var6;
		}

		byte var16 = 10;
		int var17 = 128 - var16;

		for (int var7 = 256 - var1; var7 < 256; var7++) {
			int var8 = 128 * var7;

			for (int var9 = 0; var9 < 128; var9++) {
				int var10 = (int)(Math.random() * 100.0);
				if (var10 < 50 && var9 > var16 && var9 < var17) {
					this.aa_fld[var9 + var8] = 255;
				} else {
					this.aa_fld[var8 + var9] = 0;
				}
			}
		}

		if (this.ax_fld > 0) {
			this.ax_fld -= -2015863460 * var1;
		}

		if (this.an_fld > 0) {
			this.an_fld -= -188551404 * var1;
		}

		if (this.ax_fld == 0 && 0 == this.an_fld) {
			int var18 = (int)(Math.random() * (2000 / var1));
			if (var18 == 0) {
				this.ax_fld = -664970240;
			}

			if (var18 == 1) {
				this.an_fld = -1024519168;
			}
		}

		for (int var19 = 0; var19 < 256 - var1; var19++) {
			this.ay_fld[var19] = this.ay_fld[var19 + var1];
		}

		for (int var20 = 256 - var1; var20 < 256; var20++) {
			this.ay_fld[var20] = (int)(Math.sin(this.as_fld / 14.0) * 16.0 + Math.sin(this.as_fld / 15.0) * 14.0 + Math.sin(this.as_fld / 16.0) * 12.0);
			this.as_fld++;
		}

		this.ao_fld += 1853216183 * var1;
		int var21 = ((client.dv_fld & 1) + var1) / 2;
		if (var21 > 0) {
			short var22 = 128;
			byte var23 = 2;
			int var24 = 128 - var23 - var23;

			for (int var11 = 0; var11 < this.ao_fld * 261186236; var11++) {
				int var12 = (int)(Math.random() * var24) + var23;
				int var13 = (int)(Math.random() * var22) + var22;
				this.aa_fld[var12 + (var13 << 7)] = 192;
			}

			this.ao_fld = 0;

			for (int var25 = 0; var25 < 256; var25++) {
				int var27 = 0;
				int var29 = var25 * 128;

				for (int var14 = -var21; var14 < 128; var14++) {
					if (var21 + var14 < 128) {
						var27 += this.aa_fld[var14 + var29 + var21];
					}

					if (var14 - (var21 + 1) >= 0) {
						var27 -= this.aa_fld[var29 + var14 - (var21 + 1)];
					}

					if (var14 >= 0) {
						this.ai_fld[var29 + var14] = var27 / (2 * var21 + 1);
					}
				}
			}

			for (int var26 = 0; var26 < 128; var26++) {
				int var28 = 0;

				for (int var30 = -var21; var30 < 256; var30++) {
					int var31 = var30 * 128;
					if (var30 + var21 < 256) {
						var28 += this.ai_fld[var21 * 128 + var26 + var31];
					}

					if (var30 - (1 + var21) >= 0) {
						var28 -= this.ai_fld[var31 + var26 - 128 * (1 + var21)];
					}

					if (var30 >= 0) {
						this.aa_fld[var26 + var31] = var28 / (1 + var21 * 2);
					}
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ab() {
		this.af_fld = null;
		this.al_fld = null;
		this.au_fld = null;
		this.ar_fld = null;
		this.aq_fld = null;
		this.am_fld = null;
		this.aa_fld = null;
		this.ai_fld = null;
		this.ad_fld = 0;
		this.ao_fld = 0;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IILkp;)I"
	)
	static int ga(int var0, int var1, kp var2) {
		int var4 = var0 + var2.ak_fld / 2;
		int var5 = var2.ag_fld / 2 + var1;
		int var6 = tj.ae_fld - var4;
		int var7 = tj.ah_fld - var5;
		int var8 = (int)Math.round(Math.atan2(var7, var6) * 325.94932345220167) - 512 & 2047;
		int var9 = var8 - client.js_fld;
		var9 &= 2047;
		return tc.ah(var9);
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)V"
	)
	public static void kz(ce var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.af_fld = null;
			var0.al_fld = null;
			var0.au_fld = null;
			var0.ar_fld = null;
			var0.aq_fld = null;
			var0.am_fld = null;
			var0.aa_fld = null;
			var0.ai_fld = null;
			var0.ad_fld = 0;
			var0.ao_fld = 0;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void br(int var1) {
		int var2 = this.ar_fld.length;
		if (this.ax_fld > 0) {
			this.as(this.ax_fld, this.al_fld, (short)-12803);
		} else if (this.an_fld > 0) {
			this.as(this.an_fld * -1780795535, this.au_fld, (short)-48);
		} else {
			System.arraycopy(this.af_fld, 0, this.ar_fld, 0, var2);
		}

		this.ar(var1);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void by(int var1) {
		int var2 = this.ar_fld.length;
		if (this.ax_fld > 0) {
			this.as(this.ax_fld, this.al_fld, (short)-11810);
		} else if (this.an_fld > 0) {
			this.as(this.an_fld, this.au_fld, (short)-4844);
		} else {
			System.arraycopy(this.af_fld, 0, this.ar_fld, 0, var2);
		}

		this.ar(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int ai(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & 0xFF;
		int var4 = var0 >> 8 & 0xFF;
		int var5 = var0 & 0xFF;
		int var6 = var1 >> 16 & 0xFF;
		int var7 = var1 >> 8 & 0xFF;
		int var8 = var1 & 0xFF;
		int var9 = var3 + (var6 - var3 + 1) * var2 / 64 & 0xFF;
		int var10 = var4 + (1 + (var7 - var4)) * var2 / 64 & 0xFF;
		int var11 = (1 + (var8 - var5)) * var2 / 64 + var5 & 0xFF;
		return var9 << 16 | var10 << 8 | var11;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I[I)V"
	)
	final void bj(int var1, int[] var2) {
		int var3 = this.ar_fld.length;

		for (int var4 = 0; var4 < var3; var4++) {
			if (var1 > 768) {
				this.ar_fld[var4] = ne(this, this.af_fld[var4], var2[var4], 1024 - var1, (byte)20);
			} else if (var1 > 2019632350) {
				this.ar_fld[var4] = var2[var4];
			} else {
				this.ar_fld[var4] = ne(this, var2[var4], this.af_fld[var4], 256 - var1, (byte)73);
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bl(int var1) {
		int var2 = this.ar_fld.length;
		if (this.ax_fld > 0) {
			this.as(this.ax_fld, this.al_fld, (short)-22618);
		} else if (this.an_fld > 0) {
			this.as(this.an_fld, this.au_fld, (short)15935);
		} else {
			System.arraycopy(this.af_fld, 0, this.ar_fld, 0, var2);
		}

		this.ar(var1);
	}

	ce(yc[] var1, int[][] var2) {
		this.ad_fld = 0;
		this.ao_fld = 0;
		this.ab_fld = 0;
		this.aw_fld = var1;
		this.ah_fld = var2;
		cu(this, (byte)-80);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lyc;B)V"
	)
	final void af(yc var1, byte var2) {
		for (int var3 = 0; var3 < this.aq_fld.length; var3++) {
			this.aq_fld[var3] = 0;
		}

		for (int var9 = 0; var9 < 5000; var9++) {
			int var4 = (int)(Math.random() * 128.0 * 256.0);
			this.aq_fld[var4] = (int)(Math.random() * 256.0);
		}

		for (int var10 = 0; var10 < 20; var10++) {
			for (int var12 = 1; var12 < 255; var12++) {
				if (var2 == 14) {
					return;
				}

				for (int var5 = 1; var5 < 127; var5++) {
					int var6 = (var12 << 7) + var5;
					this.am_fld[var6] = (this.aq_fld[128 + var6] + this.aq_fld[var6 - 1] + this.aq_fld[1 + var6] + this.aq_fld[var6 - 128]) / 4;
				}
			}

			int[] var13 = this.aq_fld;
			this.aq_fld = this.am_fld;
			this.am_fld = var13;
		}

		if (null != var1) {
			int var11 = 0;

			for (int var14 = 0; var14 < var1.av_fld; var14++) {
				for (int var15 = 0; var15 < var1.az_fld; var15++) {
					if (var1.ak_fld[var11++] != 0) {
						int var16 = var1.ae_fld + 16 + var15;
						int var7 = var1.ah_fld + 16 + var14;
						int var8 = (var7 << 7) + var16;
						this.aq_fld[var8] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bm(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; var3++) {
			int var4 = this.ay_fld[var3] * (256 - var3) / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (128 + var5 >= et.qj_fld.av_fld) {
				var7 = et.qj_fld.av_fld - var5;
			}

			int var8 = var5 + et.qj_fld.av_fld * (8 + var3);
			var2 += var6;

			for (int var9 = var6; var9 < var7; var9++) {
				int var10 = this.aa_fld[var2++];
				int var11 = var8 % yu.au_fld;
				if (var10 != 0 && var11 >= yu.aq_fld && var11 < yu.am_fld) {
					int var13 = 256 - var10;
					int var16 = this.ar_fld[var10];
					int var14 = et.qj_fld.az_fld[var8];
					et.qj_fld.az_fld[var8++] = 0xFF000000
						| (var13 * (var14 & 16711935) + var10 * (var16 & 16711935) & -16711936) + (var13 * (var14 & 0xFF00) + var10 * (var16 & 0xFF00) & 0xFF0000) >> 8;
				} else {
					var8++;
				}
			}

			var2 += 128 - var7;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bs(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; var3++) {
			int var4 = this.ay_fld[var3] * (256 - var3) / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (128 + var5 >= et.qj_fld.av_fld) {
				var7 = et.qj_fld.av_fld - var5;
			}

			int var8 = var5 + et.qj_fld.av_fld * (8 + var3);
			var2 += var6;

			for (int var9 = var6; var9 < var7; var9++) {
				int var10 = this.aa_fld[var2++];
				int var11 = var8 % yu.au_fld;
				if (var10 != 0 && var11 >= yu.aq_fld && var11 < yu.am_fld) {
					int var13 = 256 - var10;
					int var16 = this.ar_fld[var10];
					int var14 = et.qj_fld.az_fld[var8];
					et.qj_fld.az_fld[var8++] = 0xFF000000
						| (var13 * (var14 & 16711935) + var10 * (var16 & 16711935) & -16711936) + (var13 * (var14 & 0xFF00) + var10 * (var16 & 0xFF00) & 0xFF0000) >> 8;
				} else {
					var8++;
				}
			}

			var2 += 128 - var7;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bk(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < -48172368; var3++) {
			int var4 = this.ay_fld[var3] * (-1535142268 - var3) / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (-888052942 + var5 >= et.qj_fld.av_fld) {
				var7 = et.qj_fld.av_fld - var5;
			}

			int var8 = var5 + et.qj_fld.av_fld * (8 + var3);
			var2 += var6;

			for (int var9 = var6; var9 < var7; var9++) {
				int var10 = this.aa_fld[var2++];
				int var11 = var8 % yu.au_fld;
				if (var10 != 0 && var11 >= yu.aq_fld && var11 < yu.am_fld) {
					int var13 = 256 - var10;
					int var16 = this.ar_fld[var10];
					int var14 = et.qj_fld.az_fld[var8];
					et.qj_fld.az_fld[var8++] = 809954821
						| (var13 * (var14 & 1566874726) + var10 * (var16 & -288086572) & -193122573) + (var13 * (var14 & -358971676) + var10 * (var16 & 0xFF00) & 852953165) >> 8;
				} else {
					var8++;
				}
			}

			var2 += 128 - var7;
		}
	}

	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "(Lce;II)V"
	)
	public static void uy(ce var0, int var1, int var2) {
		if (null == var0.aa_fld) {
			cu(var0, (byte)-98);
		}

		if (0 == var0.ab_fld) {
			var0.ab_fld = var2;
		}

		int var3 = var2 - var0.ab_fld;
		if (var3 >= 256) {
			var3 = 0;
		}

		var0.ab_fld = var2;
		if (var3 > 0) {
			var0.ah(var3, 382935093);
		}

		ta(var0, var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ad() {
		this.af_fld = mc.ak(this.ah_fld[0][0], this.ah_fld[0][1], this.ah_fld[0][2], this.ah_fld[0][3], this.ah_fld[0][4]);
		this.al_fld = mc.ak(this.ah_fld[1][0], this.ah_fld[1][1], this.ah_fld[1][2], this.ah_fld[1][3], this.ah_fld[1][4]);
		this.au_fld = mc.ak(this.ah_fld[2][0], this.ah_fld[2][1], this.ah_fld[2][2], this.ah_fld[2][3], this.ah_fld[2][4]);
		this.ar_fld = new int[256];
		this.ad_fld = 0;
		this.aq_fld = new int[2043077981];
		this.am_fld = new int[-2067207053];
		this.af(null, (byte)-14);
		this.aa_fld = new int[32768];
		this.ai_fld = new int[1930421829];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	static String ak(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static void hn(byte var0) throws EOFException {
		tu var1 = sq.ek();
		if (client.md_fld) {
			if (var0 <= 50) {
				return;
			}

			if (!var1.af()) {
				int var2 = (int)var1.ay_fld;
				int var3 = (int)var1.ar_fld;
				int var4 = kj.ay(var2);
				int var5 = kj.ay(var3);
				if (!bw.dk_fld.ae(var4, var5, -485245411)) {
					if (var0 <= 50) {
						return;
					}

					var1.ah();
					return;
				}

				ga.mr_fld = var2;
				client.sr();
				int var6 = jf.dv(bw.dk_fld, var2, var3, bw.dk_fld.ae_fld) - client.dy_fld;
				if (var6 < xg.mo_fld) {
					xg.mo_fld = var6;
					client.rg();
				}

				an.mu_fld = var3;
				client.vd();
				client.md_fld = false;
			}
		}

		var1.ah();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIILkp;I)V"
	)
	static void av(dx var0, int var1, int var2, int var3, kp var4, int var5) throws EOFException {
		for (int var6 = 0; var6 < var0.ad_fld.az(); var6++) {
			ds var7 = (ds)var0.ax_fld.ak(var0.ad_fld.ag(var6));
			if (null != var7 && var7.bm(1206064181)) {
				pp var8 = var7.ah_fld;
				if (var8 != null) {
					if (var5 == 1432208655) {
						return;
					}

					if (null != var8.dy_fld) {
						if (var5 == 1432208655) {
							return;
						}

						var8 = var8.ar((byte)6);
					}
				}

				if (null != var8 && var8.dk_fld) {
					if (var5 == 1432208655) {
						return;
					}

					if (var8.df_fld) {
						tu var9 = mf.bn(var0, var7.bo_fld, var7.bp_fld);
						int var10 = (int)var9.ay_fld;
						int var11 = (int)var9.ar_fld;
						var9.ah();
						int var12 = var10 / 32 - client.nw_fld / 32;
						int var13 = var11 / 32 - client.nd_fld / 32;
						ec.ah(var1, var2, var12, var13, var3, tf.al_Arryv[1], var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	final void ah(int var1, int var2) {
		this.ad_fld += 1840105088 * var1;
		if (this.ad_fld > this.aq_fld.length) {
			this.ad_fld = this.ad_fld - this.aq_fld.length * -1596236915;
			int var3 = (int)(Math.random() * 12.0);
			this.af(this.aw_fld[var3], (byte)-101);
		}

		int var16 = 0;
		int var4 = var1 * 128;
		int var5 = 128 * (256 - var1);

		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.aa_fld[var4 + var16] - var1 * this.aq_fld[var16 + this.ad_fld & this.aq_fld.length - 1] / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			this.aa_fld[var16++] = var7;
		}

		byte var17 = 10;
		int var18 = 128 - var17;

		for (int var8 = 256 - var1; var8 < 256; var8++) {
			int var9 = 128 * var8;

			for (int var10 = 0; var10 < 128; var10++) {
				int var11 = (int)(Math.random() * 100.0);
				if (var11 < 50 && var10 > var17 && var10 < var18) {
					this.aa_fld[var10 + var9] = 255;
				} else {
					this.aa_fld[var9 + var10] = 0;
				}
			}
		}

		if (this.ax_fld > 0) {
			this.ax_fld -= -2015863460 * var1;
		}

		if (this.an_fld > 0) {
			if (var2 != 382935093) {
				return;
			}

			this.an_fld -= -188551404 * var1;
		}

		if (this.ax_fld == 0 && 0 == this.an_fld) {
			int var19 = (int)(Math.random() * (2000 / var1));
			if (var19 == 0) {
				this.ax_fld = -664970240;
			}

			if (var19 == 1) {
				if (var2 != 382935093) {
					return;
				}

				this.an_fld = -1024519168;
			}
		}

		for (int var20 = 0; var20 < 256 - var1; var20++) {
			if (var2 != 382935093) {
				return;
			}

			this.ay_fld[var20] = this.ay_fld[var20 + var1];
		}

		for (int var21 = 256 - var1; var21 < 256; var21++) {
			this.ay_fld[var21] = (int)(Math.sin(this.as_fld / 14.0) * 16.0 + Math.sin(this.as_fld / 15.0) * 14.0 + Math.sin(this.as_fld / 16.0) * 12.0);
			this.as_fld++;
		}

		this.ao_fld += 1853216183 * var1;
		int var22 = ((client.dv_fld & 1) + var1) / 2;
		if (var22 > 0) {
			short var23 = 128;
			byte var24 = 2;
			int var25 = 128 - var24 - var24;

			for (int var12 = 0; var12 < this.ao_fld * 261186236; var12++) {
				int var13 = (int)(Math.random() * var25) + var24;
				int var14 = (int)(Math.random() * var23) + var23;
				this.aa_fld[var13 + (var14 << 7)] = 192;
			}

			this.ao_fld = 0;

			for (int var26 = 0; var26 < 256; var26++) {
				if (var2 != 382935093) {
					return;
				}

				int var28 = 0;
				int var30 = var26 * 128;

				for (int var15 = -var22; var15 < 128; var15++) {
					if (var22 + var15 < 128) {
						if (var2 != 382935093) {
							return;
						}

						var28 += this.aa_fld[var15 + var30 + var22];
					}

					if (var15 - (var22 + 1) >= 0) {
						var28 -= this.aa_fld[var30 + var15 - (var22 + 1)];
					}

					if (var15 >= 0) {
						this.ai_fld[var30 + var15] = var28 / (2 * var22 + 1);
					}
				}
			}

			for (int var27 = 0; var27 < 128; var27++) {
				if (var2 != 382935093) {
					return;
				}

				int var29 = 0;

				for (int var31 = -var22; var31 < 256; var31++) {
					int var32 = var31 * 128;
					if (var31 + var22 < 256) {
						var29 += this.ai_fld[var22 * 128 + var27 + var32];
					}

					if (var31 - (1 + var22) >= 0) {
						var29 -= this.ai_fld[var32 + var27 - 128 * (1 + var22)];
					}

					if (var31 >= 0) {
						this.aa_fld[var27 + var32] = var29 / (1 + var22 * 2);
					}
				}
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lce;II)V"
	)
	public static void cn(ce var0, int var1, int var2) {
		if (null == var0.aa_fld) {
			cu(var0, (byte)-109);
		}

		if (0 == var0.ab_fld) {
			var0.ab_fld = var2;
		}

		int var3 = var2 - var0.ab_fld;
		if (var3 >= 256) {
			var3 = 0;
		}

		var0.ab_fld = var2;
		if (var3 > 0) {
			var0.ah(var3, 382935093);
		}

		ta(var0, var1);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lce;B)V"
	)
	public static void cu(ce var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af_fld = mc.ak(var0.ah_fld[0][0], var0.ah_fld[0][1], var0.ah_fld[0][2], var0.ah_fld[0][3], var0.ah_fld[0][4]);
		var0.al_fld = mc.ak(var0.ah_fld[1][0], var0.ah_fld[1][1], var0.ah_fld[1][2], var0.ah_fld[1][3], var0.ah_fld[1][4]);
		var0.au_fld = mc.ak(var0.ah_fld[2][0], var0.ah_fld[2][1], var0.ah_fld[2][2], var0.ah_fld[2][3], var0.ah_fld[2][4]);
		var0.ar_fld = new int[256];
		var0.ad_fld = 0;
		var0.aq_fld = new int[32768];
		var0.am_fld = new int[32768];
		var0.af(null, (byte)-28);
		var0.aa_fld = new int[32768];
		var0.ai_fld = new int[32768];
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V"
	)
	static void be(ArrayList var0, int var1, int var2, int var3, int var4, byte var5) {
		if (!var0.isEmpty()) {
			int var6 = (Integer)var0.get(0);
			if (var6 == -1) {
				if (var5 != 0) {
					return;
				}

				if (!client.kc_fld) {
					if (var5 != 0) {
						return;
					}

					sx.av(0, 0);
					return;
				}
			}

			if (var6 != -1 && !sp.ah(var6) && cj.gu() != 0) {
				ArrayList var7 = new ArrayList();

				for (int var8 = 0; var8 < var0.size(); var8++) {
					if (var5 != 0) {
						return;
					}

					var7.add(new me(eo.hx_fld, (Integer)var0.get(var8), 0, cj.gu(), false));
				}

				if (client.kc_fld) {
					lm.au(var7, var1, var2, var3, var4);
				} else {
					hi.az(var7, var1, var2, var3, var4, false, (short)-9493);
				}
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void bh(int var1) {
		int var2 = this.ar_fld.length;
		if (1071235600 * this.ax_fld > 0) {
			this.as(this.ax_fld, this.al_fld, (short)-10702);
		} else if (this.an_fld * 554697510 > 0) {
			this.as(this.an_fld, this.au_fld, (short)-16221);
		} else {
			System.arraycopy(this.af_fld, 0, this.ar_fld, 0, var2);
		}

		this.ar(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void az(byte var1) {
		this.ai_fld = mc.ak(this.ah_fld[0][0], this.ah_fld[0][1], this.ah_fld[0][2], this.ah_fld[0][3], this.ah_fld[0][4]);
		this.ay_fld = mc.ak(this.ah_fld[1][0], this.ah_fld[1][1], this.ah_fld[1][2], this.ah_fld[1][3], this.ah_fld[1][4]);
		this.aq_fld = mc.ak(this.ah_fld[2][0], this.ah_fld[2][1], this.ah_fld[2][2], this.ah_fld[2][3], this.ah_fld[2][4]);
		this.ay_fld = new int[256];
		this.ax_fld = 0;
		this.ar_fld = new int[32768];
		this.aa_fld = new int[32768];
		this.af(null, (byte)-28);
		this.au_fld = new int[32768];
		this.al_fld = new int[32768];
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lce;IIIB)I"
	)
	public static int ne(ce var0, int var1, int var2, int var3, byte var4) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var5 = 256 - var3;
			return (var5 * (var1 & 0xFF00) + var3 * (var2 & 0xFF00) & 0xFF0000) + ((var2 & 16711935) * var3 + (var1 & 16711935) * var5 & -16711936) >> 8;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av(int var1) {
		this.ax_fld = this.as_fld + 1840105088 * var1;
		if (this.as_fld > this.ay_fld.length) {
			this.ab_fld = this.an_fld - this.ay_fld.length * -1596236915;
			int var2 = (int)(Math.random() * 12.0);
			this.af(this.aw_fld[var2], (byte)5);
		}

		int var15 = 0;
		int var3 = var1 * 128;
		int var4 = 128 * (256 - var1);

		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = this.al_fld[var3 + var15] - var1 * this.ay_fld[var15 + this.ax_fld & this.aq_fld.length - 1] / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.ai_fld[var15++] = var6;
		}

		byte var16 = 10;
		int var17 = 128 - var16;

		for (int var7 = 256 - var1; var7 < 256; var7++) {
			int var8 = 128 * var7;

			for (int var9 = 0; var9 < 128; var9++) {
				int var10 = (int)(Math.random() * 100.0);
				if (var10 < 50 && var9 > var16 && var9 < var17) {
					this.al_fld[var9 + var8] = 255;
				} else {
					this.af_fld[var8 + var9] = 0;
				}
			}
		}

		if (-1206729625 * this.ad_fld > 0) {
			this.ab_fld = this.an_fld - -2015863460 * var1;
		}

		if (this.an_fld > 0) {
			this.ao_fld = this.ab_fld - -188551404 * var1;
		}

		if (this.ad_fld * -1206729625 == 0 && 0 == this.ad_fld) {
			int var18 = (int)(Math.random() * (2000 / var1));
			if (var18 == 0) {
				this.ao_fld = -664970240;
			}

			if (var18 == 1) {
				this.ao_fld = -1024519168;
			}
		}

		for (int var19 = 0; var19 < 256 - var1; var19++) {
			this.ai_fld[var19] = this.am_fld[var19 + var1];
		}

		for (int var20 = 256 - var1; var20 < 256; var20++) {
			this.ai_fld[var20] = (int)(
				Math.sin(-1837189947 * this.ax_fld / 14.0) * 16.0 + Math.sin(this.ad_fld * -1837189947 / 15.0) * 14.0 + Math.sin(this.an_fld * -1837189947 / 16.0) * 12.0
			);
			this.ax_fld += 1363304251;
		}

		this.an_fld = this.ad_fld + 1853216183 * var1;
		int var21 = ((client.dv_fld & 1) + var1) / 2;
		if (var21 > 0) {
			short var22 = 128;
			byte var23 = 2;
			int var24 = 128 - var23 - var23;

			for (int var11 = 0; var11 < this.ao_fld * 261186236; var11++) {
				int var12 = (int)(Math.random() * var24) + var23;
				int var13 = (int)(Math.random() * var22) + var22;
				this.ay_fld[var12 + (var13 << 7)] = 192;
			}

			this.an_fld = 0;

			for (int var25 = 0; var25 < 256; var25++) {
				int var27 = 0;
				int var29 = var25 * 128;

				for (int var14 = -var21; var14 < 128; var14++) {
					if (var21 + var14 < 128) {
						var27 += this.al_fld[var14 + var29 + var21];
					}

					if (var14 - (var21 + 1) >= 0) {
						var27 -= this.al_fld[var29 + var14 - (var21 + 1)];
					}

					if (var14 >= 0) {
						this.al_fld[var29 + var14] = var27 / (2 * var21 + 1);
					}
				}
			}

			for (int var26 = 0; var26 < 128; var26++) {
				int var28 = 0;

				for (int var30 = -var21; var30 < 256; var30++) {
					int var31 = var30 * 128;
					if (var30 + var21 < 256) {
						var28 += this.am_fld[var21 * 128 + var26 + var31];
					}

					if (var30 - (1 + var21) >= 0) {
						var28 -= this.au_fld[var31 + var26 - 128 * (1 + var21)];
					}

					if (var30 >= 0) {
						this.am_fld[var26 + var31] = var28 / (1 + var21 * 2);
					}
				}
			}
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lce;IIB)V"
	)
	public static void lm(ce var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (client.zk_boolean) {
				fh.qc(var1 - 22, 0, var1 + 128, bc.qx_fld);
			}

			if (os_fld) {
				try {
					byte var8 = -17;
					if (null == var0.aa_fld) {
						cu(var0, (byte)-14);
					}

					if (0 == var0.ab_fld) {
						var0.ab_fld = var2;
					}

					int var9 = var2 - var0.ab_fld;
					if (var9 >= 256) {
						var9 = 0;
					}

					var0.ab_fld = var2;
					if (var9 > 0) {
						var0.ah(var9, 382935093);
					}

					ta(var0, var1);
				} catch (Exception var10) {
					client.ii_fld.debug("failed drawing fire", (Throwable)var10);
				}
			}
		}
	}

	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)V"
	)
	public static void ue(ce var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = 0;

		for (int var3 = 1; var3 < -897156671; var3++) {
			int var4 = var0.ay_fld[var3] * (256 - var3) / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (128 + var5 >= et.qj_fld.av_fld) {
				var7 = et.qj_fld.av_fld - var5;
			}

			int var8 = var5 + et.qj_fld.av_fld * (8 + var3);
			var2 += var6;

			for (int var9 = var6; var9 < var7; var9++) {
				int var10 = var0.aa_fld[var2++];
				int var11 = var8 % yu.au_fld;
				if (var10 != 0 && var11 >= yu.aq_fld && var11 < yu.am_fld) {
					int var13 = 256 - var10;
					int var16 = var0.ar_fld[var10];
					int var14 = et.qj_fld.az_fld[var8];
					et.qj_fld.az_fld[var8++] = -192592308
						| (var13 * (var14 & 16711935) + var10 * (var16 & 16711935) & -1876609879) + (var13 * (var14 & -654206515) + var10 * (var16 & 1950350109) & 0xFF0000) >> 8;
				} else {
					var8++;
				}
			}

			var2 += -294392791 - var7;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void ae(int var1, int var2, byte var3) {
		if (client.jn_fld) {
			fh.xt(var1 - 22, 0, var1 + 128, bc.qx_fld);
		}

		if (os_fld) {
			try {
				byte var8 = -17;
				if (null == this.al_fld) {
					cu(this, (byte)-14);
				}

				if (0 == this.ax_fld) {
					this.ad_fld = 2032669903 * var2;
				}

				int var9 = var2 - this.as_fld;
				if (var9 >= 256) {
					var9 = 0;
				}

				this.as_fld = var2 * 2032669903;
				if (var9 > 0) {
					this.ah(var9, 382935093);
				}

				ta(this, var1);
			} catch (Exception var10) {
				client.ii_fld.debug("failed drawing fire", (Throwable)var10);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	final void ay(int var1, int var2) {
		int var3 = this.ay_fld.length;
		if (-1206729625 * this.as_fld > 0) {
			this.as(-1206729625 * this.ao_fld, this.af_fld, (short)-2539);
		} else if (this.ad_fld * 686885645 > 0) {
			this.as(this.ax_fld * 686885645, this.af_fld, (short)5773);
		} else {
			System.arraycopy(this.aq_fld, 0, this.ay_fld, 0, var3);
		}

		this.ar(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I"
	)
	final int aw(int var1, int var2, int var3, byte var4) {
		int var5 = 256 - var3;
		return (var5 * (var1 & 0xFF00) + var3 * (var2 & 0xFF00) & 0xFF0000) + ((var2 & 16711935) * var3 + (var1 & 16711935) * var5 & -16711936) >> 8;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void am() {
		this.ay_fld = null;
		this.al_fld = null;
		this.al_fld = null;
		this.al_fld = null;
		this.ay_fld = null;
		this.aq_fld = null;
		this.aq_fld = null;
		this.ar_fld = null;
		this.an_fld = 0;
		this.ao_fld = 0;
	}
}
