import net.runelite.api.Texture;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements({"Texture"})
public class fb extends vw implements Texture {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean al_fld = false;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
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
	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float xo_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float it_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] af_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(DILub;)Z"
	)
	boolean ak(double var1, int var3, ub var4) {
		try {
			if (var4.cs(this.ah_fld, 1571746682) == null) {
				return false;
			} else {
				int var5 = var3 * var3;
				this.af_fld = new int[var5];
				int var7 = this.ah_fld;
				yc var6;
				if (!gv.af(var4, var7)) {
					var6 = null;
				} else {
					yc var9 = new yc();
					var9.aw_fld = yh.ag_fld;
					var9.ay_fld = yh.az_fld;
					var9.ae_fld = yh.av_fld[0];
					var9.ah_fld = yh.ae_fld[0];
					var9.az_fld = yh.ah_fld[0];
					var9.av_fld = yh.aw_fld[0];
					var9.ag_fld = yh.ay_fld;
					var9.ak_fld = yo.as_fld[0];
					jl.au();
					var6 = var9;
				}

				return this.ay(var1, var3, var6, var5);
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("getV")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Export("getV")
	@Override
	public float getV() {
		return this.xo_fld;
	}

	@ObfuscatedName("setU")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	@Export("setU")
	@Override
	public void setU(float var1) {
		this.it_fld = var1;
	}

	@ObfuscatedName("setV")
	@ObfuscatedSignature(
		descriptor = "(F)V"
	)
	@Export("setV")
	@Override
	public void setV(float var1) {
		this.xo_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void as() {
		this.af_fld = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void az() {
		this.af_fld = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void av(int var1) {
		if (this.af_fld != null && this.as_fld >= 1 && this.as_fld <= 4) {
			if (ae_fld == null || ae_fld.length < this.af_fld.length) {
				ae_fld = new int[this.af_fld.length];
			}

			short var2;
			if (this.af_fld.length == 4096) {
				var2 = 64;
			} else {
				var2 = 128;
			}

			int var3 = this.af_fld.length;
			if (this.as_fld == 1 || this.as_fld == 2) {
				int var4 = var2 * var1 * this.ar_fld;
				int var5 = var3 - 1;
				if (this.as_fld == 1) {
					var4 = -var4;
				}

				for (int var6 = 0; var6 < var3; var6++) {
					int var7 = var6 + var4 & var5;
					ae_fld[var6] = this.af_fld[var7];
				}
			}

			if (this.as_fld == 3 || this.as_fld == 4) {
				int var10 = var1 * this.ar_fld;
				int var12 = var2 - 1;
				if (this.as_fld == 3) {
					var10 = -var10;
				}

				for (short var13 = 0; var13 < var3; var13 += var2) {
					for (int var14 = 0; var14 < var2; var14++) {
						int var8 = var13 + var14;
						int var9 = var13 + (var14 + var10 & var12);
						ae_fld[var8] = this.af_fld[var9];
					}
				}
			}

			int[] var11 = this.af_fld;
			this.af_fld = ae_fld;
			ae_fld = var11;
		}
	}

	fb(xi var1) {
		this.ah_fld = var1.cm();
		this.aw_fld = var1.cm();
		this.ay_fld = var1.cg() == 1;
		this.as_fld = var1.cg();
		this.ar_fld = var1.cg();
		this.af_fld = null;
	}

	@ObfuscatedName("isLoaded")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isLoaded")
	@Override
	public boolean isLoaded() {
		return this.al_fld;
	}

	@ObfuscatedName("getU")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Export("getU")
	@Override
	public float getU() {
		return this.it_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(DILyc;I)Z"
	)
	boolean ag(double var1, int var3, yc var4, int var5) {
		var4.au();
		int[] var6 = var4.ag_fld;

		for (int var7 = 0; var7 < var6.length; var7++) {
			var6[var7] = fc.ae(var6[var7], var1);
		}

		byte[] var11 = var4.ak_fld;
		if (var4.az_fld == var3) {
			for (int var13 = 0; var13 < var5; var13++) {
				this.af_fld[var13] = var6[var11[var13] & 255];
			}
		} else if (var4.az_fld == 64 && var3 == 128) {
			int var12 = 0;

			for (int var14 = 0; var14 < var3; var14++) {
				for (int var15 = 0; var15 < var3; var15++) {
					this.af_fld[var12++] = var6[var11[(var15 >> 1) + (var14 >> 1 << 6)] & 255];
				}
			}
		} else {
			if (var4.az_fld != 128 || var3 != 64) {
				throw new RuntimeException();
			}

			int var8 = 0;

			for (int var9 = 0; var9 < var3; var9++) {
				for (int var10 = 0; var10 < var3; var10++) {
					this.af_fld[var8++] = var6[var11[(var10 << 1) + (var9 << 1 << 7)] & 255];
				}
			}
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(DILyc;I)Z"
	)
	boolean ah(double var1, int var3, yc var4, int var5) {
		var4.au();
		int[] var6 = var4.ag_fld;

		for (int var7 = 0; var7 < var6.length; var7++) {
			var6[var7] = fc.ae(var6[var7], var1);
		}

		byte[] var11 = var4.ak_fld;
		if (var4.az_fld == var3) {
			for (int var13 = 0; var13 < var5; var13++) {
				this.af_fld[var13] = var6[var11[var13] & 255];
			}
		} else if (var4.az_fld == 64 && var3 == 128) {
			int var12 = 0;

			for (int var14 = 0; var14 < var3; var14++) {
				for (int var15 = 0; var15 < var3; var15++) {
					this.af_fld[var12++] = var6[var11[(var15 >> 1) + (var14 >> 1 << 6)] & 255];
				}
			}
		} else {
			if (var4.az_fld != 128 || var3 != 64) {
				throw new RuntimeException();
			}

			int var8 = 0;

			for (int var9 = 0; var9 < var3; var9++) {
				for (int var10 = 0; var10 < var3; var10++) {
					this.af_fld[var8++] = var6[var11[(var10 << 1) + (var9 << 1 << 7)] & 255];
				}
			}
		}

		return true;
	}

	@ObfuscatedName("getAnimationSpeed")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimationSpeed")
	@Override
	public int getAnimationSpeed() {
		return this.ar_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void af() {
		this.af_fld = null;
	}

	@ObfuscatedName("getPixels")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getPixels")
	@Override
	public int[] getPixels() {
		return this.af_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lfb;DILyc;I)Z"
	)
	public static boolean by(fb var0, double var1, int var3, yc var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var4.au();
		int[] var6 = var4.ag_fld;

		for (int var7 = 0; var7 < var6.length; var7++) {
			var6[var7] = fc.ae(var6[var7], var1);
		}

		byte[] var11 = var4.ak_fld;
		if (var4.az_fld == var3) {
			for (int var13 = 0; var13 < var5; var13++) {
				var0.af_fld[var13] = var6[var11[var13] & 255];
			}
		} else if (var4.az_fld == 64 && var3 == 128) {
			int var12 = 0;

			for (int var14 = 0; var14 < var3; var14++) {
				for (int var15 = 0; var15 < var3; var15++) {
					var0.af_fld[var12++] = var6[var11[(var15 >> 1) + (var14 >> 1 << 6)] & 255];
				}
			}
		} else {
			if (var4.az_fld != 128 || var3 != 64) {
				throw new RuntimeException();
			}

			int var8 = 0;

			for (int var9 = 0; var9 < var3; var9++) {
				for (int var10 = 0; var10 < var3; var10++) {
					var0.af_fld[var8++] = var6[var11[(var10 << 1) + (var9 << 1 << 7)] & 255];
				}
			}
		}

		return true;
	}

	@ObfuscatedName("getAnimationDirection")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimationDirection")
	@Override
	public int getAnimationDirection() {
		return this.as_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(DILyc;I)Z"
	)
	boolean aw(double var1, int var3, yc var4, int var5) {
		var4.au();
		int[] var6 = var4.ag_fld;

		for (int var7 = 0; var7 < var6.length; var7++) {
			var6[var7] = fc.ae(var6[var7], var1);
		}

		byte[] var11 = var4.ak_fld;
		if (var4.az_fld == var3) {
			for (int var13 = 0; var13 < var5; var13++) {
				this.af_fld[var13] = var6[var11[var13] & 647784689];
			}
		} else if (var4.az_fld == 64 && var3 == -813685758) {
			int var12 = 0;

			for (int var14 = 0; var14 < var3; var14++) {
				for (int var15 = 0; var15 < var3; var15++) {
					this.af_fld[var12++] = var6[var11[(var15 >> 1) + (var14 >> 1 << 6)] & 255];
				}
			}
		} else {
			if (var4.az_fld != -938775840 || var3 != 64) {
				throw new RuntimeException();
			}

			int var8 = 0;

			for (int var9 = 0; var9 < var3; var9++) {
				for (int var10 = 0; var10 < var3; var10++) {
					this.af_fld[var8++] = var6[var11[(var10 << 1) + (var9 << 1 << 7)] & 461477302];
				}
			}
		}

		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ar() {
		this.af_fld = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(DILyc;I)Z"
	)
	boolean ay(double var1, int var3, yc var4, int var5) {
		var4.au();
		int[] var6 = var4.ag_fld;

		for (int var7 = 0; var7 < var6.length; var7++) {
			var6[var7] = fc.ae(var6[var7], var1);
		}

		byte[] var11 = var4.ak_fld;
		if (var4.az_fld == var3) {
			for (int var13 = 0; var13 < var5; var13++) {
				this.af_fld[var13] = var6[var11[var13] & 255];
			}
		} else if (var4.az_fld == 64 && var3 == 128) {
			int var12 = 0;

			for (int var14 = 0; var14 < var3; var14++) {
				for (int var15 = 0; var15 < var3; var15++) {
					this.af_fld[var12++] = var6[var11[(var15 >> 1) + (var14 >> 1 << 6)] & 255];
				}
			}
		} else {
			if (var4.az_fld != 128 || var3 != 64) {
				throw new RuntimeException();
			}

			int var8 = 0;

			for (int var9 = 0; var9 < var3; var9++) {
				for (int var10 = 0; var10 < var3; var10++) {
					this.af_fld[var8++] = var6[var11[(var10 << 1) + (var9 << 1 << 7)] & 255];
				}
			}
		}

		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void al(int var1) {
		if (this.af_fld != null && this.as_fld >= 1 && this.as_fld <= 4) {
			if (ae_fld == null || ae_fld.length < this.af_fld.length) {
				ae_fld = new int[this.af_fld.length];
			}

			short var2;
			if (this.af_fld.length == 4096) {
				var2 = 64;
			} else {
				var2 = 128;
			}

			int var3 = this.af_fld.length;
			if (this.as_fld == 1 || this.as_fld == 2) {
				int var4 = var2 * var1 * this.ar_fld;
				int var5 = var3 - 1;
				if (this.as_fld == 1) {
					var4 = -var4;
				}

				for (int var6 = 0; var6 < var3; var6++) {
					int var7 = var6 + var4 & var5;
					ae_fld[var6] = this.af_fld[var7];
				}
			}

			if (this.as_fld == 3 || this.as_fld == 4) {
				int var10 = var1 * this.ar_fld;
				int var12 = var2 - 1;
				if (this.as_fld == 3) {
					var10 = -var10;
				}

				for (short var13 = 0; var13 < var3; var13 += var2) {
					for (int var14 = 0; var14 < var2; var14++) {
						int var8 = var13 + var14;
						int var9 = var13 + (var14 + var10 & var12);
						ae_fld[var8] = this.af_fld[var9];
					}
				}
			}

			int[] var11 = this.af_fld;
			this.af_fld = ae_fld;
			ae_fld = var11;
		}
	}
}
