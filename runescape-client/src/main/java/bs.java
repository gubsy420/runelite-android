import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bs")
public class bs {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] ae_fld;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ig_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cc_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	au ak_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bn_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ah() {
		return this.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void az(int var1, int var2) {
		if (var1 < var2) {
			int var4 = var1;
			int var5 = this.av_fld[var1];
			int var6 = this.az_fld[var1];
			boolean var7 = this.ae_fld[var1];

			for (int var8 = 1 + var1; var8 <= var2; var8++) {
				int var9 = this.av_fld[var8];
				if (var9 < var5) {
					this.av_fld[var4] = var9;
					this.az_fld[var4] = this.az_fld[var8];
					this.ae_fld[var4] = this.ae_fld[var8];
					this.av_fld[var8] = this.av_fld[++var4];
					this.az_fld[var8] = this.az_fld[var4];
					this.ae_fld[var8] = this.ae_fld[var4];
				}
			}

			this.av_fld[var4] = var5;
			this.az_fld[var4] = var6;
			this.ae_fld[var4] = var7;
			this.az(var1, var4 - 1);
			this.az(var4 + 1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean ag() {
		return this.ag_fld;
	}

	bs(au var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.av_fld = var3;
		this.az_fld = var4;
		this.ae_fld = var5;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([FI)V"
	)
	void ae(float[] var1, int var2) {
		int var3 = this.ak_fld.az_fld.length;
		int var4 = au.ak_fld[this.ak_fld.av_fld - 1];
		boolean[] var5 = this.ae_fld;
		this.ae_fld[1] = true;
		var5[0] = true;

		for (int var6 = 2; var6 < var3; var6++) {
			int var7 = gt.tg(this.ak_fld, this.av_fld, var6);
			int var8 = au.nn(this.ak_fld, this.av_fld, var6);
			int var9 = this.ak_fld.az(this.av_fld[var7], this.az_fld[var7], this.av_fld[var8], this.az_fld[var8], this.av_fld[var6]);
			int var10 = this.az_fld[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (0 != var10) {
				boolean[] var14 = this.ae_fld;
				this.ae_fld[var8] = true;
				var14[var7] = true;
				this.ae_fld[var6] = true;
				if (var10 >= var13) {
					this.az_fld[var6] = var11 > var9 ? var9 + (var10 - var9) : var9 - var10 + var11 - 1;
				} else {
					this.az_fld[var6] = 0 != (var10 & 1) ? var9 - (var10 + 1) / 2 : var9 + var10 / 2;
				}
			} else {
				this.ae_fld[var6] = false;
				this.az_fld[var6] = var9;
			}
		}

		this.az(0, var3 - 1);
		int var16 = 0;
		int var17 = this.az_fld[0] * this.ak_fld.av_fld;

		for (int var18 = 1; var18 < var3; var18++) {
			if (this.ae_fld[var18]) {
				int var20 = this.av_fld[var18];
				int var22 = this.ak_fld.av_fld * this.az_fld[var18];
				this.ak_fld.an(var16, var17, var20, var22, var1, var2);
				if (var20 >= var2) {
					return;
				}

				var16 = var20;
				var17 = var22;
			}
		}

		float var19 = au.ag_fld[var17];

		for (int var21 = var16; var21 < var2; var21++) {
			var1[var21] *= var19;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([FI)V"
	)
	void av(float[] var1, int var2) {
		int var3 = this.ak_fld.az_fld.length;
		int var4 = au.ak_fld[this.ak_fld.av_fld - 1];
		boolean[] var5 = this.ae_fld;
		this.ae_fld[1] = true;
		var5[0] = true;

		for (int var6 = 2; var6 < var3; var6++) {
			int var7 = gt.tg(this.ak_fld, this.av_fld, var6);
			int var8 = au.nn(this.ak_fld, this.av_fld, var6);
			int var9 = this.ak_fld.az(this.av_fld[var7], this.az_fld[var7], this.av_fld[var8], this.az_fld[var8], this.av_fld[var6]);
			int var10 = this.az_fld[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (0 != var10) {
				boolean[] var14 = this.ae_fld;
				this.ae_fld[var8] = true;
				var14[var7] = true;
				this.ae_fld[var6] = true;
				if (var10 >= var13) {
					this.az_fld[var6] = var11 > var9 ? var9 + (var10 - var9) : var9 - var10 + var11 - 1;
				} else {
					this.az_fld[var6] = 0 != (var10 & 1) ? var9 - (var10 + 1) / 2 : var9 + var10 / 2;
				}
			} else {
				this.ae_fld[var6] = false;
				this.az_fld[var6] = var9;
			}
		}

		this.az(0, var3 - 1);
		int var16 = 0;
		int var17 = this.az_fld[0] * this.ak_fld.av_fld;

		for (int var18 = 1; var18 < var3; var18++) {
			if (this.ae_fld[var18]) {
				int var20 = this.av_fld[var18];
				int var22 = this.ak_fld.av_fld * this.az_fld[var18];
				this.ak_fld.an(var16, var17, var20, var22, var1, var2);
				if (var20 >= var2) {
					return;
				}

				var16 = var20;
				var17 = var22;
			}
		}

		float var19 = au.ag_fld[var17];

		for (int var21 = var16; var21 < var2; var21++) {
			var1[var21] *= var19;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void as(sl var0) {
		om.ap(var0, null, true, (byte)0);
		int var2 = var0.av();
		if (var2 > 1) {
			if (yq.ak_fld == var0.ag_fld) {
				int[] var3 = var0.ak();
				int var4 = 0;

				for (int var5 = var2 - 1; var4 < var5; var5--) {
					int var6 = var3[var4];
					var3[var4] = var3[var5];
					var3[var5] = var6;
					var4++;
				}
			} else if (var0.ag_fld == yq.ag_fld) {
				px.at(sl.ob(var0, -1088226072), 0, var2 - 1);
			} else {
				qn.ac((Object[])var0.az(), 0, var2 - 1);
			}
		}
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lbs;II)V"
	)
	public static void ns(bs var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < var2) {
			int var3 = var1;
			int var4 = var0.av_fld[var1];
			int var5 = var0.az_fld[var1];
			boolean var6 = var0.ae_fld[var1];

			for (int var7 = 1 + var1; var7 <= var2; var7++) {
				int var8 = var0.av_fld[var7];
				if (var8 < var4) {
					var0.av_fld[var3] = var8;
					var0.az_fld[var3] = var0.az_fld[var7];
					var0.ae_fld[var3] = var0.ae_fld[var7];
					var0.av_fld[var7] = var0.av_fld[++var3];
					var0.az_fld[var7] = var0.az_fld[var3];
					var0.ae_fld[var7] = var0.ae_fld[var3];
				}
			}

			var0.av_fld[var3] = var4;
			var0.az_fld[var3] = var5;
			var0.ae_fld[var3] = var6;
			var0.az(var1, var3 - 1);
			var0.az(var3 + 1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aw() {
		return this.ag_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean as() {
		return this.ag_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void af(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.av_fld[var1];
			int var5 = this.az_fld[var1];
			boolean var6 = this.ae_fld[var1];

			for (int var7 = 1 + var1; var7 <= var2; var7++) {
				int var8 = this.av_fld[var7];
				if (var8 < var4) {
					this.av_fld[var3] = var8;
					this.az_fld[var3] = this.az_fld[var7];
					this.ae_fld[var3] = this.ae_fld[var7];
					this.av_fld[var7] = this.av_fld[++var3];
					this.az_fld[var7] = this.az_fld[var3];
					this.ae_fld[var7] = this.ae_fld[var3];
				}
			}

			this.av_fld[var3] = var4;
			this.az_fld[var3] = var5;
			this.ae_fld[var3] = var6;
			this.az(var1, var3 - 1);
			this.az(var3 + 1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([FII)V"
	)
	void ak(float[] var1, int var2) {
		int var4 = this.ak_fld.az_fld.length;
		int var5 = au.ak_fld[this.ak_fld.av_fld - 1];
		boolean[] var6 = this.ae_fld;
		this.ae_fld[1] = true;
		var6[0] = true;

		for (int var7 = 2; var7 < var4; var7++) {
			int var8 = gt.tg(this.ak_fld, this.av_fld, var7);
			int var9 = au.nn(this.ak_fld, this.av_fld, var7);
			int var10 = this.ak_fld.az(this.av_fld[var8], this.az_fld[var8], this.av_fld[var9], this.az_fld[var9], this.av_fld[var7]);
			int var11 = this.az_fld[var7];
			int var12 = var5 - var10;
			int var14 = (var12 < var10 ? var12 : var10) << 1;
			if (0 != var11) {
				boolean[] var15 = this.ae_fld;
				this.ae_fld[var9] = true;
				var15[var8] = true;
				this.ae_fld[var7] = true;
				if (var11 >= var14) {
					this.az_fld[var7] = var12 > var10 ? var10 + (var11 - var10) : var10 - var11 + var12 - 1;
				} else {
					this.az_fld[var7] = 0 != (var11 & 1) ? var10 - (var11 + 1) / 2 : var10 + var11 / 2;
				}
			} else {
				this.ae_fld[var7] = false;
				this.az_fld[var7] = var10;
			}
		}

		this.az(0, var4 - 1);
		int var17 = 0;
		int var18 = this.az_fld[0] * this.ak_fld.av_fld;

		for (int var19 = 1; var19 < var4; var19++) {
			if (this.ae_fld[var19]) {
				int var21 = this.av_fld[var19];
				int var23 = this.ak_fld.av_fld * this.az_fld[var19];
				this.ak_fld.an(var17, var18, var21, var23, var1, var2);
				if (var21 >= var2) {
					return;
				}

				var17 = var21;
				var18 = var23;
			}
		}

		float var20 = au.ag_fld[var18];

		for (int var22 = var17; var22 < var2; var22++) {
			var1[var22] *= var20;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ar(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.av_fld[var1];
			int var5 = this.az_fld[var1];
			boolean var6 = this.ae_fld[var1];

			for (int var7 = 1 + var1; var7 <= var2; var7++) {
				int var8 = this.av_fld[var7];
				if (var8 < var4) {
					this.av_fld[var3] = var8;
					this.az_fld[var3] = this.az_fld[var7];
					this.ae_fld[var3] = this.ae_fld[var7];
					this.av_fld[var7] = this.av_fld[++var3];
					this.az_fld[var7] = this.az_fld[var3];
					this.ae_fld[var7] = this.ae_fld[var3];
				}
			}

			this.av_fld[var3] = var4;
			this.az_fld[var3] = var5;
			this.ae_fld[var3] = var6;
			this.az(var1, var3 - 1);
			this.az(var3 + 1, var2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public static int aq(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
