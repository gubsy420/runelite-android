import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("be")
public class be {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	int[][][] ar_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[F"
	)
	static float[][] ae_fld = new float[2][8];
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] ah_fld = new int[2][8];
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float aw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] as_fld = new int[2];
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[[I"
	)
	int[][][] af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] al_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIFI)F"
	)
	float az(int var1, int var2, float var3, int var4) {
		float var5 = this.ar_fld[var1][0][var2] + var3 * (this.ar_fld[var1][1][var2] - this.ar_fld[var1][0][var2]);
		var5 *= 1.2207031E-4F;
		return ak(var5, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FI)F"
	)
	static float ay(float var0, int var1) {
		float var2 = 32.703197F * (float)Math.pow(2.0, var0);
		return var2 * (float) Math.PI / (var1 / 2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IFI)I"
	)
	int av(int var1, float var2, int var3) {
		if (var1 == 0) {
			float var4 = this.al_fld[0] + (this.al_fld[1] - this.al_fld[0]) * var2;
			var4 *= 0.0030517578F;
			aw_fld = (float)Math.pow(0.1, var4 / 20.0F);
			ay_fld = (int)(aw_fld * 65536.0F);
		}

		if (this.as_fld[var1] == 0) {
			return 0;
		} else {
			float var10 = ck(this, var1, 0, var2);
			ae_fld[var1][0] = -2.0F * var10 * (float)Math.cos(this.az(var1, 0, var2, var3));
			ae_fld[var1][1] = var10 * var10;

			for (int var5 = 1; var5 < this.as_fld[var1]; var5++) {
				var10 = ck(this, var1, var5, var2);
				float var6 = -2.0F * var10 * (float)Math.cos(this.az(var1, var5, var2, var3));
				float var7 = var10 * var10;
				ae_fld[var1][var5 * 2 + 1] = ae_fld[var1][var5 * 2 - 1] * var7;
				ae_fld[var1][var5 * 2] = ae_fld[var1][var5 * 2 - 1] * var6 + ae_fld[var1][var5 * 2 - 2] * var7;

				for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
					ae_fld[var1][var8] = ae_fld[var1][var8] + (ae_fld[var1][var8 - 1] * var6 + ae_fld[var1][var8 - 2] * var7);
				}

				ae_fld[var1][1] = ae_fld[var1][1] + (ae_fld[var1][0] * var6 + var7);
				ae_fld[var1][0] = ae_fld[var1][0] + var6;
			}

			if (var1 == 0) {
				for (int var12 = 0; var12 < this.as_fld[0] * 2; var12++) {
					ae_fld[0][var12] = ae_fld[0][var12] * aw_fld;
				}
			}

			for (int var13 = 0; var13 < this.as_fld[var1] * 2; var13++) {
				ah_fld[var1][var13] = (int)(ae_fld[var1][var13] * 65536.0F);
			}

			return this.as_fld[var1] * 2;
		}
	}

	be() {
		this.ar_fld = new int[2][2][4];
		this.af_fld = new int[2][2][4];
		this.al_fld = new int[2];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FI)F"
	)
	static float ah(float var0, int var1) {
		float var2 = 32.703197F * (float)Math.pow(2.0, var0);
		return var2 * (float) Math.PI / (var1 / 2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FI)F"
	)
	static float ak(float var0, int var1) {
		float var2 = 32.703197F * (float)Math.pow(2.0, var0);
		return var2 * (float) Math.PI / (var1 / 2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIFI)F"
	)
	float au(int var1, int var2, float var3, int var4) {
		float var5 = this.ar_fld[var1][0][var2] + var3 * (this.ar_fld[var1][1][var2] - this.ar_fld[var1][0][var2]);
		var5 *= 1.2207031E-4F;
		return ak(var5, var4);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FI)F"
	)
	static float as(float var0, int var1) {
		float var2 = 32.703197F * (float)Math.pow(2.0, var0);
		return var2 * (float) Math.PI / (var1 / 2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIFI)F"
	)
	float ar(int var1, int var2, float var3, int var4) {
		float var5 = this.ar_fld[var1][0][var2] + var3 * (this.ar_fld[var1][1][var2] - this.ar_fld[var1][0][var2]);
		var5 *= 1.2207031E-4F;
		return ak(var5, var4);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIFI)F"
	)
	float af(int var1, int var2, float var3, int var4) {
		float var5 = this.ar_fld[var1][0][var2] + var3 * (this.ar_fld[var1][1][var2] - this.ar_fld[var1][0][var2]);
		var5 *= 1.2207031E-4F;
		return ak(var5, var4);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIFI)F"
	)
	float al(int var1, int var2, float var3, int var4) {
		float var5 = this.ar_fld[var1][0][var2] + var3 * (this.ar_fld[var1][1][var2] - this.ar_fld[var1][0][var2]);
		var5 *= 1.2207031E-4F;
		return ak(var5, var4);
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lbe;Lxi;Lax;)V"
	)
	public static void nw(be var0, xi var1, ax var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var3 = var1.cg();
			var0.as_fld[0] = var3 >> 4;
			var0.as_fld[1] = var3 & 15;
			if (var3 != 0) {
				var0.al_fld[0] = xi.tx(var1, 1836876186);
				var0.al_fld[1] = xi.tx(var1, 1546013126);
				int var4 = var1.cg();

				for (int var5 = 0; var5 < 2; var5++) {
					for (int var6 = 0; var6 < var0.as_fld[var5]; var6++) {
						var0.ar_fld[var5][0][var6] = xi.tx(var1, 411384459);
						var0.af_fld[var5][0][var6] = xi.tx(var1, 641041027);
					}
				}

				for (int var8 = 0; var8 < 2; var8++) {
					for (int var9 = 0; var9 < var0.as_fld[var8]; var9++) {
						if ((var4 & 1 << var8 * 4 << var9) != 0) {
							var0.ar_fld[var8][1][var9] = xi.tx(var1, 1102649004);
							var0.af_fld[var8][1][var9] = xi.tx(var1, 1906777956);
						} else {
							var0.ar_fld[var8][1][var9] = var0.ar_fld[var8][0][var9];
							var0.af_fld[var8][1][var9] = var0.af_fld[var8][0][var9];
						}
					}
				}

				if (var4 != 0 || var0.al_fld[1] != var0.al_fld[0]) {
					var2.ae(var1);
				}
			} else {
				int[] var7 = var0.al_fld;
				var0.al_fld[1] = 0;
				var7[0] = 0;
			}
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lbe;IIF)F"
	)
	public static float ck(be var0, int var1, int var2, float var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			float var4 = var0.af_fld[var1][0][var2] + var3 * (var0.af_fld[var1][1][var2] - var0.af_fld[var1][0][var2]);
			var4 *= 0.0015258789F;
			return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lax;)V"
	)
	final void ae(xi var1, ax var2) {
		int var3 = var1.cg();
		this.as_fld[0] = var3 >> 4;
		this.as_fld[1] = var3 & 15;
		if (var3 != 0) {
			this.al_fld[0] = xi.tx(var1, 610951953);
			this.al_fld[1] = xi.tx(var1, 1386790199);
			int var4 = var1.cg();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < this.as_fld[var5]; var6++) {
					this.ar_fld[var5][0][var6] = xi.tx(var1, 2066249684);
					this.af_fld[var5][0][var6] = xi.tx(var1, 1181184960);
				}
			}

			for (int var8 = 0; var8 < 2; var8++) {
				for (int var9 = 0; var9 < this.as_fld[var8]; var9++) {
					if ((var4 & 1 << var8 * 4 << var9) != 0) {
						this.ar_fld[var8][1][var9] = xi.tx(var1, 1436309102);
						this.af_fld[var8][1][var9] = xi.tx(var1, 1865518234);
					} else {
						this.ar_fld[var8][1][var9] = this.ar_fld[var8][0][var9];
						this.af_fld[var8][1][var9] = this.af_fld[var8][0][var9];
					}
				}
			}

			if (var4 != 0 || this.al_fld[1] != this.al_fld[0]) {
				var2.ae(var1);
			}
		} else {
			int[] var7 = this.al_fld;
			this.al_fld[1] = 0;
			var7[0] = 0;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IFI)I"
	)
	int ax(int var1, float var2, int var3) {
		if (var1 == 0) {
			float var4 = this.al_fld[0] + (this.al_fld[1] - this.al_fld[0]) * var2;
			var4 *= 0.0030517578F;
			aw_fld = (float)Math.pow(0.1, var4 / 20.0F);
			ay_fld = (int)(aw_fld * 65536.0F);
		}

		if (this.as_fld[var1] == 0) {
			return 0;
		} else {
			float var10 = ck(this, var1, 0, var2);
			ae_fld[var1][0] = -2.0F * var10 * (float)Math.cos(this.az(var1, 0, var2, var3));
			ae_fld[var1][1] = var10 * var10;

			for (int var5 = 1; var5 < this.as_fld[var1]; var5++) {
				var10 = ck(this, var1, var5, var2);
				float var6 = -2.0F * var10 * (float)Math.cos(this.az(var1, var5, var2, var3));
				float var7 = var10 * var10;
				ae_fld[var1][var5 * 2 + 1] = ae_fld[var1][var5 * 2 - 1] * var7;
				ae_fld[var1][var5 * 2] = ae_fld[var1][var5 * 2 - 1] * var6 + ae_fld[var1][var5 * 2 - 2] * var7;

				for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
					ae_fld[var1][var8] = ae_fld[var1][var8] + (ae_fld[var1][var8 - 1] * var6 + ae_fld[var1][var8 - 2] * var7);
				}

				ae_fld[var1][1] = ae_fld[var1][1] + (ae_fld[var1][0] * var6 + var7);
				ae_fld[var1][0] = ae_fld[var1][0] + var6;
			}

			if (var1 == 0) {
				for (int var12 = 0; var12 < this.as_fld[0] * 2; var12++) {
					ae_fld[0][var12] = ae_fld[0][var12] * aw_fld;
				}
			}

			for (int var13 = 0; var13 < this.as_fld[var1] * 2; var13++) {
				ah_fld[var1][var13] = (int)(ae_fld[var1][var13] * 65536.0F);
			}

			return this.as_fld[var1] * 2;
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lbe;Lxi;Lax;)V"
	)
	public static void ld(be var0, xi var1, ax var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var1.cg();
		var0.as_fld[0] = var3 >> 4;
		var0.as_fld[1] = var3 & 15;
		if (var3 != 0) {
			var0.al_fld[0] = xi.tx(var1, 440329120);
			var0.al_fld[1] = xi.tx(var1, 424616719);
			int var4 = var1.cg();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < var0.as_fld[var5]; var6++) {
					var0.ar_fld[var5][0][var6] = xi.tx(var1, 1969286193);
					var0.af_fld[var5][0][var6] = xi.tx(var1, 1185472606);
				}
			}

			for (int var8 = 0; var8 < 2; var8++) {
				for (int var9 = 0; var9 < var0.as_fld[var8]; var9++) {
					if ((var4 & 1 << var8 * 4 << var9) != 0) {
						var0.ar_fld[var8][1][var9] = xi.tx(var1, 1283066828);
						var0.af_fld[var8][1][var9] = xi.tx(var1, 1408123908);
					} else {
						var0.ar_fld[var8][1][var9] = var0.ar_fld[var8][0][var9];
						var0.af_fld[var8][1][var9] = var0.af_fld[var8][0][var9];
					}
				}
			}

			if (var4 != 0 || var0.al_fld[1] != var0.al_fld[0]) {
				var2.ae(var1);
			}
		} else {
			int[] var7 = var0.al_fld;
			var0.al_fld[1] = 0;
			var7[0] = 0;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IFI)I"
	)
	int an(int var1, float var2, int var3) {
		if (var1 == 0) {
			float var4 = this.al_fld[0] + (this.al_fld[1] - this.al_fld[0]) * var2;
			var4 *= 0.0030517578F;
			aw_fld = (float)Math.pow(0.1, var4 / 20.0F);
			ay_fld = (int)(aw_fld * 65536.0F);
		}

		if (this.as_fld[var1] == 0) {
			return 0;
		} else {
			float var10 = ck(this, var1, 0, var2);
			ae_fld[var1][0] = -2.0F * var10 * (float)Math.cos(this.az(var1, 0, var2, var3));
			ae_fld[var1][1] = var10 * var10;

			for (int var5 = 1; var5 < this.as_fld[var1]; var5++) {
				var10 = ck(this, var1, var5, var2);
				float var6 = -2.0F * var10 * (float)Math.cos(this.az(var1, var5, var2, var3));
				float var7 = var10 * var10;
				ae_fld[var1][var5 * 2 + 1] = ae_fld[var1][var5 * 2 - 1] * var7;
				ae_fld[var1][var5 * 2] = ae_fld[var1][var5 * 2 - 1] * var6 + ae_fld[var1][var5 * 2 - 2] * var7;

				for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
					ae_fld[var1][var8] = ae_fld[var1][var8] + (ae_fld[var1][var8 - 1] * var6 + ae_fld[var1][var8 - 2] * var7);
				}

				ae_fld[var1][1] = ae_fld[var1][1] + (ae_fld[var1][0] * var6 + var7);
				ae_fld[var1][0] = ae_fld[var1][0] + var6;
			}

			if (var1 == 0) {
				for (int var12 = 0; var12 < this.as_fld[0] * 2; var12++) {
					ae_fld[0][var12] = ae_fld[0][var12] * aw_fld;
				}
			}

			for (int var13 = 0; var13 < this.as_fld[var1] * 2; var13++) {
				ah_fld[var1][var13] = (int)(ae_fld[var1][var13] * 65536.0F);
			}

			return this.as_fld[var1] * 2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FI)F"
	)
	static float aw(float var0, int var1) {
		float var2 = 32.703197F * (float)Math.pow(2.0, var0);
		return var2 * (float) Math.PI / (var1 / 2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lax;)V"
	)
	final void aq(xi var1, ax var2) {
		int var3 = var1.cg();
		this.as_fld[0] = var3 >> 4;
		this.as_fld[1] = var3 & 15;
		if (var3 != 0) {
			this.al_fld[0] = xi.tx(var1, 719854016);
			this.al_fld[1] = xi.tx(var1, 1032375684);
			int var4 = var1.cg();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < this.as_fld[var5]; var6++) {
					this.ar_fld[var5][0][var6] = xi.tx(var1, 701184854);
					this.af_fld[var5][0][var6] = xi.tx(var1, 360375029);
				}
			}

			for (int var8 = 0; var8 < 2; var8++) {
				for (int var9 = 0; var9 < this.as_fld[var8]; var9++) {
					if ((var4 & 1 << var8 * 4 << var9) != 0) {
						this.ar_fld[var8][1][var9] = xi.tx(var1, 836547224);
						this.af_fld[var8][1][var9] = xi.tx(var1, 1637939450);
					} else {
						this.ar_fld[var8][1][var9] = this.ar_fld[var8][0][var9];
						this.af_fld[var8][1][var9] = this.af_fld[var8][0][var9];
					}
				}
			}

			if (var4 != 0 || this.al_fld[1] != this.al_fld[0]) {
				var2.ae(var1);
			}
		} else {
			int[] var7 = this.al_fld;
			this.al_fld[1] = 0;
			var7[0] = 0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIF)F"
	)
	float ag(int var1, int var2, float var3) {
		float var4 = this.af_fld[var1][0][var2] + var3 * (this.ar_fld[var1][1][var2] - this.af_fld[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;Lax;)V"
	)
	final void ai(xi var1, ax var2) {
		int var3 = var1.ec();
		this.al_fld[0] = var3 >> 4;
		this.as_fld[1] = var3 & 15;
		if (var3 != 0) {
			this.al_fld[0] = xi.tx(var1, 1836876186);
			this.al_fld[1] = xi.tx(var1, 1546013126);
			int var4 = var1.ew();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < this.as_fld[var5]; var6++) {
					this.ar_fld[var5][0][var6] = xi.tx(var1, 411384459);
					this.ar_fld[var5][0][var6] = xi.tx(var1, 641041027);
				}
			}

			for (int var8 = 0; var8 < 2; var8++) {
				for (int var9 = 0; var9 < this.as_fld[var8]; var9++) {
					if ((var4 & 1 << var8 * 4 << var9) != 0) {
						this.ar_fld[var8][1][var9] = xi.tx(var1, 1102649004);
						this.ar_fld[var8][1][var9] = xi.tx(var1, 1906777956);
					} else {
						this.af_fld[var8][1][var9] = this.ar_fld[var8][0][var9];
						this.af_fld[var8][1][var9] = this.af_fld[var8][0][var9];
					}
				}
			}

			if (var4 != 0 || this.as_fld[1] != this.al_fld[0]) {
				var2.ah(var1);
			}
		} else {
			int[] var7 = this.al_fld;
			this.al_fld[1] = 0;
			var7[0] = 0;
		}
	}
}
