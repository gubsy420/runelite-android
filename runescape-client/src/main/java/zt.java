import java.util.HashMap;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zt")
public class zt {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ag_fld;
	@ObfuscatedGetter(
		intValue = 1108417649
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap ae_fld = new HashMap();
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	uf ah_fld = new uf(0, 0);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ay_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aw_fld = new int[2048];

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	yv ay(int var1) {
		if (!this.ae_fld.containsKey(var1)) {
			this.ak(var1, (byte)-26);
		}

		return (yv)(yv)this.ae_fld.get(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void au() {
		this.as_fld = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	yv ag(int var1) {
		if (!this.ae_fld.containsKey(var1)) {
			this.ak(var1, (byte)-37);
		}

		return (yv)(yv)this.ae_fld.get(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public final void az(int var1, int var2, int var3) {
		if (this.as_fld >= this.aw_fld.length) {
			if (var3 != 1140452111) {
				;
			}
		} else {
			this.aw_fld[this.as_fld] = var1;
			this.ay_fld[this.as_fld] = var2;
			this.as_fld++;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void av() {
		this.as_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILyv;F)V"
	)
	public final void ae(int var1, int var2, yv var3, float var4) {
		int var6 = (int)(var4 * 18.0F);
		yv var7 = this.ag(var6);
		int var8 = 2 * var6 + 1;
		uf var9 = new uf(0, 0, var3.aw_fld, var3.ay_fld);
		uf var10 = new uf(0, 0);
		uf.uo(this.ah_fld, var8, var8);
		System.nanoTime();

		for (int var11 = 0; var11 < this.as_fld; var11++) {
			int var12 = this.aw_fld[var11];
			int var13 = this.ay_fld[var11];
			int var14 = (int)(var4 * (var12 - var1)) - var6;
			int var15 = (int)(var3.ay_fld - var4 * (var13 - var2)) - var6;
			this.ah_fld.ag(var14, var15);
			this.ah_fld.ah(var9, var10);
			this.ah(var7, var3, var10, 192853767);
		}

		System.nanoTime();
		System.nanoTime();

		for (int var16 = 0; var16 < var3.ah_fld.length; var16++) {
			if (0 == var3.ah_fld[var16]) {
				var3.ah_fld[var16] = -16777216;
			} else {
				int var17 = (var3.ah_fld[var16] + 64 - 1) / 256;
				if (var17 <= 0) {
					var3.ah_fld[var16] = -16777216;
				} else {
					if (var17 > av_fld.length) {
						var17 = av_fld.length;
					}

					int var18 = av_fld[var17 - 1];
					var3.ah_fld[var16] = 0xFF000000 | var18;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lyv;Luf;I)V"
	)
	void ah(yv var1, yv var2, uf var3, int var4) {
		if (var3.ah_fld != 0) {
			if (0 != var3.aw_fld) {
				int var5 = 0;
				int var6 = 0;
				if (0 == var3.av_fld) {
					var5 = var1.aw_fld - var3.ah_fld;
				}

				if (0 == var3.ae_fld) {
					if (var4 == -1017722577) {
						return;
					}

					var6 = var1.ay_fld - var3.aw_fld;
				}

				int var7 = var5 + var1.aw_fld * var6;
				int var8 = var2.aw_fld * var3.ae_fld + var3.av_fld;

				for (int var9 = 0; var9 < var3.aw_fld; var9++) {
					for (int var10 = 0; var10 < var3.ah_fld; var10++) {
						int var10001 = var8++;
						var2.ah_fld[var10001] = var2.ah_fld[var10001] + var1.ah_fld[var7++];
					}

					var7 += var1.aw_fld - var3.ah_fld;
					var8 += var2.aw_fld - var3.ah_fld;
				}

				return;
			}

			if (var4 == -1017722577) {
				return;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void ax() {
		this.as_fld = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lyv;Luf;)V"
	)
	void ai(yv var1, yv var2, uf var3) {
		if (var3.ah_fld != 0 && 0 != var3.aw_fld) {
			int var4 = 0;
			int var5 = 0;
			if (0 == var3.av_fld) {
				var4 = var1.aw_fld - var3.ah_fld;
			}

			if (0 == var3.ae_fld) {
				var5 = var1.ay_fld - var3.aw_fld;
			}

			int var6 = var4 + var1.aw_fld * var5;
			int var7 = var2.aw_fld * var3.ae_fld + var3.av_fld;

			for (int var8 = 0; var8 < var3.aw_fld; var8++) {
				for (int var9 = 0; var9 < var3.ah_fld; var9++) {
					int var10001 = var7++;
					var2.ah_fld[var10001] = var2.ah_fld[var10001] + var1.ah_fld[var6++];
				}

				var6 += var1.aw_fld - var3.ah_fld;
				var7 += var2.aw_fld - var3.ah_fld;
			}
		}
	}

	@ObfuscatedName("zt")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V"
	)
	public static void zt(ik var0, int var1) {
		if (var0.bz_fld) {
			if (var0.ac_fld != null) {
				System.arraycopy(var0.ac_fld, 0, var0.ac_fld = new long[var1], 0, var0.at_fld);
			} else {
				var0.ac_fld = new long[var1];
			}
		}

		if (var0.br_fld) {
			if (null != var0.bm_fld) {
				System.arraycopy(var0.bm_fld, 0, var0.bm_fld = new String[var1], 0, var0.at_fld);
			} else {
				var0.bm_fld = new String[var1];
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void as(int var1, int var2) {
		if (this.as_fld < this.aw_fld.length) {
			this.aw_fld[this.as_fld] = var1;
			this.ay_fld[this.as_fld] = var2;
			this.as_fld++;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void ak(int var1, byte var2) {
		int var3 = 1 + var1 * 2;
		double var5 = var1 / 3.0F;
		int var7 = 2 * var1 + 1;
		double[] var8 = new double[var7];
		int var9 = -var1;

		for (int var10 = 0; var9 <= var1; var10++) {
			if (var2 == 0) {
				return;
			}

			double var17 = (var9 - 0) / var5;
			double var15 = Math.exp(-var17 * var17 / 2.0) / Math.sqrt(Math.PI * 2);
			double var13 = var15 / var5;
			var8[var10] = var13;
			var9++;
		}

		double[] var19 = var8;
		double var20 = var8[var1] * var8[var1];
		int[] var21 = new int[var3 * var3];
		boolean var11 = false;

		for (int var12 = 0; var12 < var3; var12++) {
			for (int var23 = 0; var23 < var3; var23++) {
				int var14 = var21[var23 + var12 * var3] = (int)(var19[var12] * var19[var23] / var20 * 256.0);
				if (!var11 && var14 > 0) {
					var11 = true;
				}
			}
		}

		yv var22 = new yv(var21, var3, var3);
		this.ae_fld.put(var1, var22);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void af() {
		this.as_fld = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void al() {
		this.as_fld = 0;
	}

	public zt() {
		this.ay_fld = new int[2048];
		this.as_fld = 0;
		av_fld = new int[2000];
		int var1 = 0;
		short var2 = 240;

		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			int var4 = qj.ak(var2 / 360.0F, 0.9999F, var1 * 0.425F / 16.0F + 0.075F);
			av_fld[var1] = var4;
			var1++;
		}

		int var6 = 48;

		for (int var7 = var6 / 6; var1 < av_fld.length; var6 -= var7) {
			int var8 = 2 * var1;

			for (int var5 = qj.ak(var6 / 360.0F, 0.9999F, 0.5); var1 < var8 && var1 < av_fld.length; var1++) {
				av_fld[var1] = var5;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		int var2 = 1 + var1 * 2;
		double var4 = var1 / 3.0F;
		int var6 = 2 * var1 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; var9++) {
			double var16 = (var8 - 0) / var4;
			double var14 = Math.exp(-var16 * var16 / 2.0) / Math.sqrt(Math.PI * 2);
			double var12 = var14 / var4;
			var7[var9] = var12;
			var8++;
		}

		double[] var18 = var7;
		double var19 = var7[var1] * var7[var1];
		int[] var20 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; var11++) {
			for (int var22 = 0; var22 < var2; var22++) {
				int var13 = var20[var22 + var11 * var2] = (int)(var18[var11] * var18[var22] / var19 * 256.0);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		yv var21 = new yv(var20, var2, var2);
		this.ae_fld.put(var1, var21);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void an() {
		this.as_fld = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lyv;Lyv;Luf;)V"
	)
	void aa(yv var1, yv var2, uf var3) {
		if (var3.ah_fld != 0 && 0 != var3.aw_fld) {
			int var4 = 0;
			int var5 = 0;
			if (0 == var3.av_fld) {
				var4 = var1.aw_fld - var3.ah_fld;
			}

			if (0 == var3.ae_fld) {
				var5 = var1.ay_fld - var3.aw_fld;
			}

			int var6 = var4 + var1.aw_fld * var5;
			int var7 = var2.aw_fld * var3.ae_fld + var3.av_fld;

			for (int var8 = 0; var8 < var3.aw_fld; var8++) {
				for (int var9 = 0; var9 < var3.ah_fld; var9++) {
					int var10001 = var7++;
					var2.ah_fld[var10001] = var2.ah_fld[var10001] + var1.ah_fld[var6++];
				}

				var6 += var1.aw_fld - var3.ah_fld;
				var7 += var2.aw_fld - var3.ah_fld;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void ar(int var1, int var2) {
		if (this.as_fld < this.aw_fld.length) {
			this.aw_fld[this.as_fld] = var1;
			this.ay_fld[this.as_fld * 417592358] = var2;
			this.as_fld++;
		}
	}
}
