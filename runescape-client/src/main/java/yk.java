import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yk")
public class yk {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = -1933691783
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = 402689221
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 2057456453
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ah_fld = new int[256];
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ae_fld = new int[256];
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int ah() {
		if (this.av_fld == 0) {
			this.az((byte)-69);
			this.av_fld = -149811968;
		}

		return this.ae_fld[(this.av_fld -= -50916851) * 402689221];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void af() {
		this.ay_fld = this.ay_fld + (this.as_fld += 1645502445) * -1126753843;

		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.ah_fld[var1];
			if ((var1 & 2) == 0) {
				if (0 == (var1 & 1)) {
					this.aw_fld = this.aw_fld ^ this.aw_fld << 13;
				} else {
					this.aw_fld = -1428320371 * (this.aw_fld ^ this.aw_fld >>> 6);
				}
			} else if (0 == (var1 & 1)) {
				this.aw_fld = -1428320371 * (this.aw_fld ^ this.aw_fld << 2);
			} else {
				this.aw_fld = this.aw_fld ^ this.aw_fld >>> 16;
			}

			this.aw_fld = this.aw_fld + -1428320371 * this.ah_fld[var1 + 128 & 0xFF];
			int var3;
			this.ah_fld[var1] = var3 = this.ay_fld + this.aw_fld + this.ah_fld[(var2 & 1020) >> 2];
			this.ae_fld[var1] = (this.ay_fld = (this.ah_fld[(var3 >> 8 & 1020) >> 2] + var2) * 599389641) * -1933691783;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int ag() {
		if (this.av_fld == 0) {
			this.az((byte)7);
			this.av_fld = -149811968;
		}

		return this.ae_fld[this.av_fld - 1];
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lyk;)V"
	)
	public static void nn(yk var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var9 = -1640531527;
			int var8 = -1640531527;
			int var7 = 2118136843;
			int var6 = -1667087617;
			int var5 = -1640531527;
			int var4 = 977319014;
			int var3 = -1640531527;
			int var2 = -1640531527;

			for (int var1 = 0; var1 < 4; var1++) {
				var2 ^= var3 << 11;
				int var36 = var5 + var2;
				int var20 = var3 + var4;
				int var21 = var20 ^ var4 >>> 2;
				int var44 = var6 + var21;
				var4 += var36;
				var4 ^= var36 << 8;
				int var52 = var7 + var4;
				int var37 = var36 + var44;
				var5 = var37 ^ var44 >>> 16;
				int var60 = var8 + var5;
				int var45 = var44 + var52;
				var6 = var45 ^ var52 << 10;
				int var68 = var9 + var6;
				int var53 = var52 + var60;
				var7 = var53 ^ var60 >>> 4;
				var2 += var7;
				int var61 = var60 + var68;
				var8 = var61 ^ var68 << 8;
				var3 = var21 + var8;
				int var69 = var68 + var2;
				var9 = var69 ^ var2 >>> 9;
				var4 += var9;
				var2 += var3;
			}

			for (byte var10 = 0; var10 < 256; var10 += 8) {
				int var14 = var2 + var0.ae_fld[var10];
				int var22 = var3 + var0.ae_fld[1 + var10];
				int var30 = var4 + var0.ae_fld[var10 + 2];
				int var38 = var5 + var0.ae_fld[3 + var10];
				int var46 = var6 + var0.ae_fld[4 + var10];
				int var54 = var7 + var0.ae_fld[var10 + 5];
				int var62 = var8 + var0.ae_fld[var10 + 6];
				int var70 = var9 + var0.ae_fld[var10 + 7];
				int var15 = var14 ^ var22 << 11;
				int var39 = var38 + var15;
				int var23 = var22 + var30;
				int var24 = var23 ^ var30 >>> 2;
				int var47 = var46 + var24;
				int var31 = var30 + var39;
				int var32 = var31 ^ var39 << 8;
				int var55 = var54 + var32;
				int var40 = var39 + var47;
				var5 = var40 ^ var47 >>> 16;
				int var63 = var62 + var5;
				int var48 = var47 + var55;
				var6 = var48 ^ var55 << 10;
				int var71 = var70 + var6;
				int var56 = var55 + var63;
				var7 = var56 ^ var63 >>> 4;
				int var16 = var15 + var7;
				int var64 = var63 + var71;
				var8 = var64 ^ var71 << 8;
				var3 = var24 + var8;
				int var72 = var71 + var16;
				var9 = var72 ^ var16 >>> 9;
				var4 = var32 + var9;
				var2 = var16 + var3;
				var0.ah_fld[var10] = var2;
				var0.ah_fld[var10 + 1] = var3;
				var0.ah_fld[var10 + 2] = var4;
				var0.ah_fld[3 + var10] = var5;
				var0.ah_fld[4 + var10] = var6;
				var0.ah_fld[5 + var10] = var7;
				var0.ah_fld[var10 + 6] = var8;
				var0.ah_fld[var10 + 7] = var9;
			}

			for (byte var11 = 0; var11 < 256; var11 += 8) {
				int var17 = var2 + var0.ah_fld[var11];
				int var25 = var3 + var0.ah_fld[var11 + 1];
				int var33 = var4 + var0.ah_fld[var11 + 2];
				int var41 = var5 + var0.ah_fld[3 + var11];
				int var49 = var6 + var0.ah_fld[var11 + 4];
				int var57 = var7 + var0.ah_fld[var11 + 5];
				int var65 = var8 + var0.ah_fld[6 + var11];
				int var73 = var9 + var0.ah_fld[7 + var11];
				int var18 = var17 ^ var25 << 11;
				int var42 = var41 + var18;
				int var26 = var25 + var33;
				int var27 = var26 ^ var33 >>> 2;
				int var50 = var49 + var27;
				int var34 = var33 + var42;
				int var35 = var34 ^ var42 << 8;
				int var58 = var57 + var35;
				int var43 = var42 + var50;
				var5 = var43 ^ var50 >>> 16;
				int var66 = var65 + var5;
				int var51 = var50 + var58;
				var6 = var51 ^ var58 << 10;
				int var74 = var73 + var6;
				int var59 = var58 + var66;
				var7 = var59 ^ var66 >>> 4;
				int var19 = var18 + var7;
				int var67 = var66 + var74;
				var8 = var67 ^ var74 << 8;
				var3 = var27 + var8;
				int var75 = var74 + var19;
				var9 = var75 ^ var19 >>> 9;
				var4 = var35 + var9;
				var2 = var19 + var3;
				var0.ah_fld[var11] = var2;
				var0.ah_fld[1 + var11] = var3;
				var0.ah_fld[var11 + 2] = var4;
				var0.ah_fld[3 + var11] = var5;
				var0.ah_fld[var11 + 4] = var6;
				var0.ah_fld[5 + var11] = var7;
				var0.ah_fld[6 + var11] = var8;
				var0.ah_fld[var11 + 7] = var9;
			}

			var0.az((byte)6);
			var0.av_fld = -149811968;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	final void az(byte var1) {
		this.ay_fld = this.ay_fld + (this.as_fld += 1645502445) * -1126753843;

		for (int var2 = 0; var2 < 256; var2++) {
			int var3 = this.ah_fld[var2];
			if ((var2 & 2) == 0) {
				if (var1 == 1) {
					return;
				}

				if (0 == (var2 & 1)) {
					this.aw_fld = this.aw_fld ^ this.aw_fld << 13;
				} else {
					this.aw_fld = -1428320371 * (this.aw_fld ^ this.aw_fld >>> 6);
				}
			} else if (0 == (var2 & 1)) {
				this.aw_fld = -1428320371 * (this.aw_fld ^ this.aw_fld << 2);
			} else {
				this.aw_fld = this.aw_fld ^ this.aw_fld >>> 16;
			}

			this.aw_fld = this.aw_fld + -1428320371 * this.ah_fld[var2 + 128 & 0xFF];
			int var4;
			this.ah_fld[var2] = var4 = this.ay_fld + this.aw_fld + this.ah_fld[(var3 & 1020) >> 2];
			this.ae_fld[var2] = (this.ay_fld = (this.ah_fld[(var4 >> 8 & 1020) >> 2] + var3) * 599389641) * -1933691783;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void av() {
		int var10 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;

		for (int var2 = 0; var2 < 4; var2++) {
			var3 ^= var4 << 11;
			int var37 = var6 + var3;
			int var21 = var4 + var5;
			int var22 = var21 ^ var5 >>> 2;
			int var45 = var7 + var22;
			var5 += var37;
			var5 ^= var37 << 8;
			int var53 = var8 + var5;
			int var38 = var37 + var45;
			var6 = var38 ^ var45 >>> 16;
			int var61 = var9 + var6;
			int var46 = var45 + var53;
			var7 = var46 ^ var53 << 10;
			int var69 = var10 + var7;
			int var54 = var53 + var61;
			var8 = var54 ^ var61 >>> 4;
			var3 += var8;
			int var62 = var61 + var69;
			var9 = var62 ^ var69 << 8;
			var4 = var22 + var9;
			int var70 = var69 + var3;
			var10 = var70 ^ var3 >>> 9;
			var5 += var10;
			var3 += var4;
		}

		for (byte var11 = 0; var11 < 256; var11 += 8) {
			int var15 = var3 + this.ae_fld[var11];
			int var23 = var4 + this.ae_fld[1 + var11];
			int var31 = var5 + this.ae_fld[var11 + 2];
			int var39 = var6 + this.ae_fld[3 + var11];
			int var47 = var7 + this.ae_fld[4 + var11];
			int var55 = var8 + this.ae_fld[var11 + 5];
			int var63 = var9 + this.ae_fld[var11 + 6];
			int var71 = var10 + this.ae_fld[var11 + 7];
			int var16 = var15 ^ var23 << 11;
			int var40 = var39 + var16;
			int var24 = var23 + var31;
			int var25 = var24 ^ var31 >>> 2;
			int var48 = var47 + var25;
			int var32 = var31 + var40;
			int var33 = var32 ^ var40 << 8;
			int var56 = var55 + var33;
			int var41 = var40 + var48;
			var6 = var41 ^ var48 >>> 16;
			int var64 = var63 + var6;
			int var49 = var48 + var56;
			var7 = var49 ^ var56 << 10;
			int var72 = var71 + var7;
			int var57 = var56 + var64;
			var8 = var57 ^ var64 >>> 4;
			int var17 = var16 + var8;
			int var65 = var64 + var72;
			var9 = var65 ^ var72 << 8;
			var4 = var25 + var9;
			int var73 = var72 + var17;
			var10 = var73 ^ var17 >>> 9;
			var5 = var33 + var10;
			var3 = var17 + var4;
			this.ah_fld[var11] = var3;
			this.ah_fld[var11 + 1] = var4;
			this.ah_fld[var11 + 2] = var5;
			this.ah_fld[3 + var11] = var6;
			this.ah_fld[4 + var11] = var7;
			this.ah_fld[5 + var11] = var8;
			this.ah_fld[var11 + 6] = var9;
			this.ah_fld[var11 + 7] = var10;
		}

		for (byte var12 = 0; var12 < 256; var12 += 8) {
			int var18 = var3 + this.ah_fld[var12];
			int var26 = var4 + this.ah_fld[var12 + 1];
			int var34 = var5 + this.ah_fld[var12 + 2];
			int var42 = var6 + this.ah_fld[3 + var12];
			int var50 = var7 + this.ah_fld[var12 + 4];
			int var58 = var8 + this.ah_fld[var12 + 5];
			int var66 = var9 + this.ah_fld[6 + var12];
			int var74 = var10 + this.ah_fld[7 + var12];
			int var19 = var18 ^ var26 << 11;
			int var43 = var42 + var19;
			int var27 = var26 + var34;
			int var28 = var27 ^ var34 >>> 2;
			int var51 = var50 + var28;
			int var35 = var34 + var43;
			int var36 = var35 ^ var43 << 8;
			int var59 = var58 + var36;
			int var44 = var43 + var51;
			var6 = var44 ^ var51 >>> 16;
			int var67 = var66 + var6;
			int var52 = var51 + var59;
			var7 = var52 ^ var59 << 10;
			int var75 = var74 + var7;
			int var60 = var59 + var67;
			var8 = var60 ^ var67 >>> 4;
			int var20 = var19 + var8;
			int var68 = var67 + var75;
			var9 = var68 ^ var75 << 8;
			var4 = var28 + var9;
			int var76 = var75 + var20;
			var10 = var76 ^ var20 >>> 9;
			var5 = var36 + var10;
			var3 = var20 + var4;
			this.ah_fld[var12] = var3;
			this.ah_fld[1 + var12] = var4;
			this.ah_fld[var12 + 2] = var5;
			this.ah_fld[3 + var12] = var6;
			this.ah_fld[var12 + 4] = var7;
			this.ah_fld[5 + var12] = var8;
			this.ah_fld[6 + var12] = var9;
			this.ah_fld[var12 + 7] = var10;
		}

		this.az((byte)-10);
		this.av_fld = -149811968;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void an() {
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;
		int var2 = -1640531527;

		for (int var1 = 0; var1 < 4; var1++) {
			var2 ^= var3 << 11;
			int var36 = var5 + var2;
			int var20 = var3 + var4;
			int var21 = var20 ^ var4 >>> 2;
			int var44 = var6 + var21;
			var4 += var36;
			var4 ^= var36 << 8;
			int var52 = var7 + var4;
			int var37 = var36 + var44;
			var5 = var37 ^ var44 >>> 16;
			int var60 = var8 + var5;
			int var45 = var44 + var52;
			var6 = var45 ^ var52 << 10;
			int var68 = var9 + var6;
			int var53 = var52 + var60;
			var7 = var53 ^ var60 >>> 4;
			var2 += var7;
			int var61 = var60 + var68;
			var8 = var61 ^ var68 << 8;
			var3 = var21 + var8;
			int var69 = var68 + var2;
			var9 = var69 ^ var2 >>> 9;
			var4 += var9;
			var2 += var3;
		}

		for (byte var10 = 0; var10 < 256; var10 += 8) {
			int var14 = var2 + this.ae_fld[var10];
			int var22 = var3 + this.ae_fld[1 + var10];
			int var30 = var4 + this.ae_fld[var10 + 2];
			int var38 = var5 + this.ae_fld[3 + var10];
			int var46 = var6 + this.ae_fld[4 + var10];
			int var54 = var7 + this.ae_fld[var10 + 5];
			int var62 = var8 + this.ae_fld[var10 + 6];
			int var70 = var9 + this.ae_fld[var10 + 7];
			int var15 = var14 ^ var22 << 11;
			int var39 = var38 + var15;
			int var23 = var22 + var30;
			int var24 = var23 ^ var30 >>> 2;
			int var47 = var46 + var24;
			int var31 = var30 + var39;
			int var32 = var31 ^ var39 << 8;
			int var55 = var54 + var32;
			int var40 = var39 + var47;
			var5 = var40 ^ var47 >>> 16;
			int var63 = var62 + var5;
			int var48 = var47 + var55;
			var6 = var48 ^ var55 << 10;
			int var71 = var70 + var6;
			int var56 = var55 + var63;
			var7 = var56 ^ var63 >>> 4;
			int var16 = var15 + var7;
			int var64 = var63 + var71;
			var8 = var64 ^ var71 << 8;
			var3 = var24 + var8;
			int var72 = var71 + var16;
			var9 = var72 ^ var16 >>> 9;
			var4 = var32 + var9;
			var2 = var16 + var3;
			this.ah_fld[var10] = var2;
			this.ah_fld[var10 + 1] = var3;
			this.ah_fld[var10 + 2] = var4;
			this.ah_fld[3 + var10] = var5;
			this.ah_fld[4 + var10] = var6;
			this.ah_fld[5 + var10] = var7;
			this.ah_fld[var10 + 6] = var8;
			this.ah_fld[var10 + 7] = var9;
		}

		for (byte var11 = 0; var11 < 256; var11 += 8) {
			int var17 = var2 + this.ah_fld[var11];
			int var25 = var3 + this.ah_fld[var11 + 1];
			int var33 = var4 + this.ah_fld[var11 + 2];
			int var41 = var5 + this.ah_fld[3 + var11];
			int var49 = var6 + this.ah_fld[var11 + 4];
			int var57 = var7 + this.ah_fld[var11 + 5];
			int var65 = var8 + this.ah_fld[6 + var11];
			int var73 = var9 + this.ah_fld[7 + var11];
			int var18 = var17 ^ var25 << 11;
			int var42 = var41 + var18;
			int var26 = var25 + var33;
			int var27 = var26 ^ var33 >>> 2;
			int var50 = var49 + var27;
			int var34 = var33 + var42;
			int var35 = var34 ^ var42 << 8;
			int var58 = var57 + var35;
			int var43 = var42 + var50;
			var5 = var43 ^ var50 >>> 16;
			int var66 = var65 + var5;
			int var51 = var50 + var58;
			var6 = var51 ^ var58 << 10;
			int var74 = var73 + var6;
			int var59 = var58 + var66;
			var7 = var59 ^ var66 >>> 4;
			int var19 = var18 + var7;
			int var67 = var66 + var74;
			var8 = var67 ^ var74 << 8;
			var3 = var27 + var8;
			int var75 = var74 + var19;
			var9 = var75 ^ var19 >>> 9;
			var4 = var35 + var9;
			var2 = var19 + var3;
			this.ah_fld[var11] = var2;
			this.ah_fld[1 + var11] = var3;
			this.ah_fld[var11 + 2] = var4;
			this.ah_fld[3 + var11] = var5;
			this.ah_fld[var11 + 4] = var6;
			this.ah_fld[5 + var11] = var7;
			this.ah_fld[6 + var11] = var8;
			this.ah_fld[var11 + 7] = var9;
		}

		this.az((byte)55);
		this.av_fld = -149811968;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int ae() {
		if (this.av_fld == 0) {
			this.az((byte)-30);
			this.av_fld = -149811968;
		}

		return this.ae_fld[(this.av_fld -= -50916851) * 402689221];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int ay() {
		if (this.av_fld == 0) {
			this.az((byte)60);
			this.av_fld = 1255194173;
		}

		return this.ae_fld[this.av_fld - 1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int ak() {
		if (this.av_fld == 0) {
			this.az((byte)-1);
			this.av_fld = -149811968;
		}

		return this.ae_fld[(this.av_fld -= -50916851) * 402689221];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int ar() {
		if (this.av_fld == 0) {
			this.az((byte)-32);
			this.av_fld = -989322911;
		}

		return this.ae_fld[this.av_fld - 1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void al() {
		this.ay_fld = this.ay_fld + (this.as_fld += 1123671526) * 326493940;

		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.ah_fld[var1];
			if ((var1 & 2) == 0) {
				if (0 == (var1 & 1)) {
					this.aw_fld = this.aw_fld ^ this.aw_fld << 13;
				} else {
					this.aw_fld = -1428320371 * (this.aw_fld ^ this.aw_fld >>> 6);
				}
			} else if (0 == (var1 & 1)) {
				this.aw_fld = -1793004517 * (this.aw_fld ^ this.aw_fld << 2);
			} else {
				this.aw_fld = this.aw_fld ^ this.aw_fld >>> 16;
			}

			this.aw_fld = this.aw_fld + 1887034490 * this.ah_fld[var1 + 128 & 1223533063];
			int var3;
			this.ah_fld[var1] = var3 = this.ay_fld + this.aw_fld + this.ah_fld[(var2 & 1144388632) >> 2];
			this.ae_fld[var1] = (this.ay_fld = (this.ah_fld[(var3 >> 8 & -246360387) >> 2] + var2) * 599389641) * -1933691783;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void au() {
		int var9 = -1968809079;
		int var8 = 1727546427;
		int var7 = 1940276743;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;
		int var2 = -1640531527;

		for (int var1 = 0; var1 < 4; var1++) {
			var2 ^= var3 << 11;
			int var36 = var5 + var2;
			int var20 = var3 + var4;
			int var21 = var20 ^ var4 >>> 2;
			int var44 = var6 + var21;
			var4 += var36;
			var4 ^= var36 << 8;
			int var52 = var7 + var4;
			int var37 = var36 + var44;
			var5 = var37 ^ var44 >>> 16;
			int var60 = var8 + var5;
			int var45 = var44 + var52;
			var6 = var45 ^ var52 << 10;
			int var68 = var9 + var6;
			int var53 = var52 + var60;
			var7 = var53 ^ var60 >>> 4;
			var2 += var7;
			int var61 = var60 + var68;
			var8 = var61 ^ var68 << 8;
			var3 = var21 + var8;
			int var69 = var68 + var2;
			var9 = var69 ^ var2 >>> 9;
			var4 += var9;
			var2 += var3;
		}

		for (byte var10 = 0; var10 < 256; var10 += 8) {
			int var14 = var2 + this.ae_fld[var10];
			int var22 = var3 + this.ae_fld[1 + var10];
			int var30 = var4 + this.ae_fld[var10 + 2];
			int var38 = var5 + this.ae_fld[3 + var10];
			int var46 = var6 + this.ae_fld[4 + var10];
			int var54 = var7 + this.ae_fld[var10 + 5];
			int var62 = var8 + this.ae_fld[var10 + 6];
			int var70 = var9 + this.ae_fld[var10 + 7];
			int var15 = var14 ^ var22 << 11;
			int var39 = var38 + var15;
			int var23 = var22 + var30;
			int var24 = var23 ^ var30 >>> 2;
			int var47 = var46 + var24;
			int var31 = var30 + var39;
			int var32 = var31 ^ var39 << 8;
			int var55 = var54 + var32;
			int var40 = var39 + var47;
			var5 = var40 ^ var47 >>> 16;
			int var63 = var62 + var5;
			int var48 = var47 + var55;
			var6 = var48 ^ var55 << 10;
			int var71 = var70 + var6;
			int var56 = var55 + var63;
			var7 = var56 ^ var63 >>> 4;
			int var16 = var15 + var7;
			int var64 = var63 + var71;
			var8 = var64 ^ var71 << 8;
			var3 = var24 + var8;
			int var72 = var71 + var16;
			var9 = var72 ^ var16 >>> 9;
			var4 = var32 + var9;
			var2 = var16 + var3;
			this.ah_fld[var10] = var2;
			this.ah_fld[var10 + 1] = var3;
			this.ah_fld[var10 + 2] = var4;
			this.ah_fld[3 + var10] = var5;
			this.ah_fld[4 + var10] = var6;
			this.ah_fld[5 + var10] = var7;
			this.ah_fld[var10 + 6] = var8;
			this.ah_fld[var10 + 7] = var9;
		}

		for (byte var11 = 0; var11 < 256; var11 += 8) {
			int var17 = var2 + this.ah_fld[var11];
			int var25 = var3 + this.ah_fld[var11 + 1];
			int var33 = var4 + this.ah_fld[var11 + 2];
			int var41 = var5 + this.ah_fld[3 + var11];
			int var49 = var6 + this.ah_fld[var11 + 4];
			int var57 = var7 + this.ah_fld[var11 + 5];
			int var65 = var8 + this.ah_fld[6 + var11];
			int var73 = var9 + this.ah_fld[7 + var11];
			int var18 = var17 ^ var25 << 11;
			int var42 = var41 + var18;
			int var26 = var25 + var33;
			int var27 = var26 ^ var33 >>> 2;
			int var50 = var49 + var27;
			int var34 = var33 + var42;
			int var35 = var34 ^ var42 << 8;
			int var58 = var57 + var35;
			int var43 = var42 + var50;
			var5 = var43 ^ var50 >>> 16;
			int var66 = var65 + var5;
			int var51 = var50 + var58;
			var6 = var51 ^ var58 << 10;
			int var74 = var73 + var6;
			int var59 = var58 + var66;
			var7 = var59 ^ var66 >>> 4;
			int var19 = var18 + var7;
			int var67 = var66 + var74;
			var8 = var67 ^ var74 << 8;
			var3 = var27 + var8;
			int var75 = var74 + var19;
			var9 = var75 ^ var19 >>> 9;
			var4 = var35 + var9;
			var2 = var19 + var3;
			this.ah_fld[var11] = var2;
			this.ah_fld[1 + var11] = var3;
			this.ah_fld[var11 + 2] = var4;
			this.ah_fld[3 + var11] = var5;
			this.ah_fld[var11 + 4] = var6;
			this.ah_fld[5 + var11] = var7;
			this.ah_fld[6 + var11] = var8;
			this.ah_fld[var11 + 7] = var9;
		}

		this.az((byte)-3);
		this.av_fld = 1892595369;
	}

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "(Lyk;)I"
	)
	public static int qe(yk var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			if (var0.av_fld * 657512177 == 0) {
				var0.az((byte)61);
				var0.av_fld = -149811968;
			}

			return var0.ae_fld[var0.av_fld - 1];
		}
	}

	public yk(int[] var1) {
		for (int var2 = 0; var2 < var1.length; var2++) {
			this.ae_fld[var2] = var1[var2];
		}

		this.av();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public final int as() {
		if (this.av_fld == 0) {
			this.az((byte)-30);
			this.ay_fld = -149811968;
		}

		return this.ae_fld[(this.as_fld = this.aw_fld - -50916851) * 402689221];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void ax() {
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;
		int var2 = -1640531527;

		for (int var1 = 0; var1 < 4; var1++) {
			var2 ^= var3 << 11;
			int var36 = var5 + var2;
			int var20 = var3 + var4;
			int var21 = var20 ^ var4 >>> 2;
			int var44 = var6 + var21;
			var4 += var36;
			var4 ^= var36 << 8;
			int var52 = var7 + var4;
			int var37 = var36 + var44;
			var5 = var37 ^ var44 >>> 16;
			int var60 = var8 + var5;
			int var45 = var44 + var52;
			var6 = var45 ^ var52 << 10;
			int var68 = var9 + var6;
			int var53 = var52 + var60;
			var7 = var53 ^ var60 >>> 4;
			var2 += var7;
			int var61 = var60 + var68;
			var8 = var61 ^ var68 << 8;
			var3 = var21 + var8;
			int var69 = var68 + var2;
			var9 = var69 ^ var2 >>> 9;
			var4 += var9;
			var2 += var3;
		}

		for (byte var10 = 0; var10 < 256; var10 += 8) {
			int var14 = var2 + this.ae_fld[var10];
			int var22 = var3 + this.ae_fld[1 + var10];
			int var30 = var4 + this.ae_fld[var10 + 2];
			int var38 = var5 + this.ae_fld[3 + var10];
			int var46 = var6 + this.ah_fld[4 + var10];
			int var54 = var7 + this.ah_fld[var10 + 5];
			int var62 = var8 + this.ae_fld[var10 + 6];
			int var70 = var9 + this.ah_fld[var10 + 7];
			int var15 = var14 ^ var22 << 11;
			int var39 = var38 + var15;
			int var23 = var22 + var30;
			int var24 = var23 ^ var30 >>> 2;
			int var47 = var46 + var24;
			int var31 = var30 + var39;
			int var32 = var31 ^ var39 << 8;
			int var55 = var54 + var32;
			int var40 = var39 + var47;
			var5 = var40 ^ var47 >>> 16;
			int var63 = var62 + var5;
			int var48 = var47 + var55;
			var6 = var48 ^ var55 << 10;
			int var71 = var70 + var6;
			int var56 = var55 + var63;
			var7 = var56 ^ var63 >>> 4;
			int var16 = var15 + var7;
			int var64 = var63 + var71;
			var8 = var64 ^ var71 << 8;
			var3 = var24 + var8;
			int var72 = var71 + var16;
			var9 = var72 ^ var16 >>> 9;
			var4 = var32 + var9;
			var2 = var16 + var3;
			this.ae_fld[var10] = var2;
			this.ah_fld[var10 + 1] = var3;
			this.ae_fld[var10 + 2] = var4;
			this.ah_fld[3 + var10] = var5;
			this.ah_fld[4 + var10] = var6;
			this.ae_fld[5 + var10] = var7;
			this.ah_fld[var10 + 6] = var8;
			this.ae_fld[var10 + 7] = var9;
		}

		for (byte var11 = 0; var11 < 256; var11 += 8) {
			int var17 = var2 + this.ah_fld[var11];
			int var25 = var3 + this.ah_fld[var11 + 1];
			int var33 = var4 + this.ah_fld[var11 + 2];
			int var41 = var5 + this.ah_fld[3 + var11];
			int var49 = var6 + this.ae_fld[var11 + 4];
			int var57 = var7 + this.ah_fld[var11 + 5];
			int var65 = var8 + this.ae_fld[6 + var11];
			int var73 = var9 + this.ah_fld[7 + var11];
			int var18 = var17 ^ var25 << 11;
			int var42 = var41 + var18;
			int var26 = var25 + var33;
			int var27 = var26 ^ var33 >>> 2;
			int var50 = var49 + var27;
			int var34 = var33 + var42;
			int var35 = var34 ^ var42 << 8;
			int var58 = var57 + var35;
			int var43 = var42 + var50;
			var5 = var43 ^ var50 >>> 16;
			int var66 = var65 + var5;
			int var51 = var50 + var58;
			var6 = var51 ^ var58 << 10;
			int var74 = var73 + var6;
			int var59 = var58 + var66;
			var7 = var59 ^ var66 >>> 4;
			int var19 = var18 + var7;
			int var67 = var66 + var74;
			var8 = var67 ^ var74 << 8;
			var3 = var27 + var8;
			int var75 = var74 + var19;
			var9 = var75 ^ var19 >>> 9;
			var4 = var35 + var9;
			var2 = var19 + var3;
			this.ae_fld[var11] = var2;
			this.ah_fld[1 + var11] = var3;
			this.ae_fld[var11 + 2] = var4;
			this.ae_fld[3 + var11] = var5;
			this.ah_fld[var11 + 4] = var6;
			this.ae_fld[5 + var11] = var7;
			this.ah_fld[6 + var11] = var8;
			this.ah_fld[var11 + 7] = var9;
		}

		this.az((byte)55);
		this.aw_fld = -149811968;
	}
}
