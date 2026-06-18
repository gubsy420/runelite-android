import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vr")
public class vr extends vb {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ak_fld = new int[16][4];
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	int[][] ag_fld = new int[16][4];
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld = new int[16];
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Luf;"
	)
	uf[] ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Luf;"
	)
	uf[] as_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Luf;"
	)
	uf[] aw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ah_fld = new int[16];

	public vr(int var1, int var2, int var3, int var4) {
		this(var1, var2, var3, var4, 2359552, 0);
	}

	vr(int var1, int var2, int var3, int var4, int var5, int var6) {
		super(var1, var2, var3, var4, var5, var6);
		this.az_fld = new int[16];
		this.ae_fld = new int[16];
		this.as_fld = new uf[16];
		this.aw_fld = new uf[16];
		this.ay_fld = new uf[16];

		for (int var7 = 0; var7 < 16; var7++) {
			int var8 = 128 * var7;
			int var9 = pd.ag(var8);
			int var10 = um.ai_fld[var8 & 2047];
			this.av_fld[var7] = -(var9 * var3 - var4 * var10 >> 16);
			this.ah_fld[var7] = var10 * var3 + var9 * var4 >> 16;
			int var12 = var9 * this.af_fld - var10 * this.an_fld >> 16;
			int var13 = this.af_fld * var10 + this.an_fld * var9 >> 16;
			int var14 = this.an_fld * var10 + this.af_fld * var9 >> 16;
			int var15 = this.an_fld * var9 - this.af_fld * var10 >> 16;
			this.ak_fld[var7] = new int[4];
			this.ag_fld[var7] = new int[4];
			this.ak_fld[var7][0] = this.av_fld[var7] - var12;
			this.ag_fld[var7][0] = this.ah_fld[var7] + var13;
			this.ak_fld[var7][1] = this.av_fld[var7] + var14;
			this.ag_fld[var7][1] = this.ah_fld[var7] + var15;
			this.ak_fld[var7][2] = this.av_fld[var7] + var12;
			this.ag_fld[var7][2] = this.ah_fld[var7] - var13;
			this.ak_fld[var7][3] = this.av_fld[var7] - var14;
			this.ag_fld[var7][3] = this.ah_fld[var7] - var15;
			int var16 = var9 * this.af_fld >> 16;
			int var17 = this.af_fld * var10 >> 16;
			int var18 = this.av_fld[var7] - var16;
			int var19 = var17 + this.ah_fld[var7];
			int var20 = this.av_fld[var7] + var16;
			int var21 = this.ah_fld[var7] - var17;
			this.az_fld[var7] = Math.abs(var10 * this.an_fld) >> 16;
			this.ae_fld[var7] = Math.abs(this.an_fld * var9) >> 16;
			int var22 = Math.min(this.ak_fld[var7][0], Math.min(this.ak_fld[var7][1], Math.min(this.ak_fld[var7][2], this.ak_fld[var7][3])));
			int var23 = Math.max(this.ak_fld[var7][0], Math.max(this.ak_fld[var7][1], Math.max(this.ak_fld[var7][2], this.ak_fld[var7][3])));
			int var24 = Math.min(this.ag_fld[var7][0], Math.min(this.ag_fld[var7][1], Math.min(this.ag_fld[var7][2], this.ag_fld[var7][3])));
			int var25 = Math.max(this.ag_fld[var7][0], Math.max(this.ag_fld[var7][1], Math.max(this.ag_fld[var7][2], this.ag_fld[var7][3])));
			this.as_fld[var7] = new uf(var22, var24, var23 - var22, var25 - var24);
			var22 = Math.min(this.ak_fld[var7][2], Math.min(this.ak_fld[var7][3], Math.min(var20, var18)));
			var23 = Math.max(this.ak_fld[var7][2], Math.max(this.ak_fld[var7][3], Math.max(var20, var18)));
			var24 = Math.min(this.ag_fld[var7][2], Math.min(this.ag_fld[var7][3], Math.min(var21, var19)));
			var25 = Math.max(this.ag_fld[var7][2], Math.max(this.ag_fld[var7][3], Math.max(var21, var19)));
			this.aw_fld[var7] = new uf(var22, var24, var23 - var22, var25 - var24);
			var22 = Math.min(this.ak_fld[var7][0], Math.min(this.ak_fld[var7][1], Math.min(var18, var20)));
			var23 = Math.max(this.ak_fld[var7][0], Math.max(this.ak_fld[var7][1], Math.max(var18, var20)));
			var24 = Math.min(this.ag_fld[var7][0], Math.min(this.ag_fld[var7][1], Math.min(var19, var21)));
			var25 = Math.max(this.ag_fld[var7][0], Math.max(this.ag_fld[var7][1], Math.max(var19, var21)));
			this.ay_fld[var7] = new uf(var22, var24, var23 - var22, var25 - var24);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int ak(int var1, int var2) {
		return this.ak_fld[var1][var2];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ar(int var1) {
		return this.av_fld[var1 & 15];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int av(int var1) {
		return this.ah_fld[var1 & 15];
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lvr;I)I"
	)
	public static int kt(vr var0, int var1) {
		return var0.av_fld[var1 & 15];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ah(int var1, int var2) {
		return this.ak_fld[var1][var2];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int az(int var1, int var2) {
		return this.ak_fld[var1][var2];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ay(int var1, int var2) {
		return this.ak_fld[var1][var2];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ae(int var1, int var2) {
		return this.ag_fld[var1][var2];
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lzv;[II)[I"
	)
	public static int[] ok(zv var0, int[] var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

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

	@ObfuscatedName("yc")
	@ObfuscatedSignature(
		descriptor = "(Lvr;II)I"
	)
	public static int yc(vr var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld[var1 & 15];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int an(int var1) {
		return this.ah_fld[var1 & 15];
	}

	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "(Lvr;I)I"
	)
	public static int se(vr var0, int var1) {
		return var0.ah_fld[var1 & 15];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int af(int var1) {
		return this.av_fld[var1 & 15];
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lvr;III)I"
	)
	public static int mq(vr var0, int var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld[var1][var2];
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int as(int var1, int var2) {
		return this.ag_fld[var1][var2];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V"
	)
	public static void ae(int var0, int var1, int var2, int var3, byte var4) {
		if (mb.av_fld.size() > 1) {
			if (var4 <= 1) {
				return;
			}

			if (mb.av_fld.get(0) != null
				&& ml.dc(((me)mb.av_fld.get(0)).af_fld, 793305274)
				&& mb.av_fld.get(1) != null
				&& ml.dc(((me)mb.av_fld.get(1)).af_fld, -596765137)) {
				cw.af(var0, var1, var2, var3);
				mb.as_fld.add(new vs(null));
				ArrayList var5 = new ArrayList();
				var5.add(new we(new wx(null, 1, false, mb.au_fld), mb.al_fld));
				var5.add(new we(new wg(null, 0, false, mb.af_fld), mb.ar_fld));
				mb.as_fld.add(new va(null, var5));
				if (mb.ay_fld.get(0) != null && mb.ay_fld.get(1) != null) {
					if (var4 <= 1) {
						return;
					}

					me var6 = (me)(me)mb.ay_fld.get(0);
					mb.ay_fld.set(0, mb.av_fld.get(1));
					mb.ay_fld.set(1, var6);
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int aw(int var1, int var2) {
		return this.ae_fld[var1 & 15];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int ag(int var1, int var2, int var3) {
		return this.ag_fld[var1][var2];
	}
}
