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
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ae_fld = new int[16];
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
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
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Luf;"
	)
	uf[] ay_fld;
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
		this.av_fld = new int[16];
		this.az_fld = new int[16];
		this.aw_fld = new uf[16];
		this.ay_fld = new uf[16];
		this.as_fld = new uf[16];

		for (int var7 = 0; var7 < 16; var7++) {
			int var8 = 128 * var7;
			int var9 = pd.ag(var8);
			int var10 = um.ai_fld[var8 & 2047];
			this.ae_fld[var7] = -(var9 * var3 - var4 * var10 >> 16);
			this.ah_fld[var7] = var10 * var3 + var9 * var4 >> 16;
			int var12 = var9 * this.au_fld - var10 * this.aa_fld >> 16;
			int var13 = this.au_fld * var10 + this.aa_fld * var9 >> 16;
			int var14 = this.aa_fld * var10 + this.au_fld * var9 >> 16;
			int var15 = this.aa_fld * var9 - this.au_fld * var10 >> 16;
			this.ak_fld[var7] = new int[4];
			this.ag_fld[var7] = new int[4];
			this.ak_fld[var7][0] = this.ae_fld[var7] - var12;
			this.ag_fld[var7][0] = this.ah_fld[var7] + var13;
			this.ak_fld[var7][1] = this.ae_fld[var7] + var14;
			this.ag_fld[var7][1] = this.ah_fld[var7] + var15;
			this.ak_fld[var7][2] = this.ae_fld[var7] + var12;
			this.ag_fld[var7][2] = this.ah_fld[var7] - var13;
			this.ak_fld[var7][3] = this.ae_fld[var7] - var14;
			this.ag_fld[var7][3] = this.ah_fld[var7] - var15;
			int var16 = var9 * this.au_fld >> 16;
			int var17 = this.au_fld * var10 >> 16;
			int var18 = this.ae_fld[var7] - var16;
			int var19 = var17 + this.ah_fld[var7];
			int var20 = this.ae_fld[var7] + var16;
			int var21 = this.ah_fld[var7] - var17;
			this.av_fld[var7] = Math.abs(var10 * this.aa_fld) >> 16;
			this.az_fld[var7] = Math.abs(this.aa_fld * var9) >> 16;
			int var22 = Math.min(this.ak_fld[var7][0], Math.min(this.ak_fld[var7][1], Math.min(this.ak_fld[var7][2], this.ak_fld[var7][3])));
			int var23 = Math.max(this.ak_fld[var7][0], Math.max(this.ak_fld[var7][1], Math.max(this.ak_fld[var7][2], this.ak_fld[var7][3])));
			int var24 = Math.min(this.ag_fld[var7][0], Math.min(this.ag_fld[var7][1], Math.min(this.ag_fld[var7][2], this.ag_fld[var7][3])));
			int var25 = Math.max(this.ag_fld[var7][0], Math.max(this.ag_fld[var7][1], Math.max(this.ag_fld[var7][2], this.ag_fld[var7][3])));
			this.aw_fld[var7] = new uf(var22, var24, var23 - var22, var25 - var24);
			var22 = Math.min(this.ak_fld[var7][2], Math.min(this.ak_fld[var7][3], Math.min(var20, var18)));
			var23 = Math.max(this.ak_fld[var7][2], Math.max(this.ak_fld[var7][3], Math.max(var20, var18)));
			var24 = Math.min(this.ag_fld[var7][2], Math.min(this.ag_fld[var7][3], Math.min(var21, var19)));
			var25 = Math.max(this.ag_fld[var7][2], Math.max(this.ag_fld[var7][3], Math.max(var21, var19)));
			this.ay_fld[var7] = new uf(var22, var24, var23 - var22, var25 - var24);
			var22 = Math.min(this.ak_fld[var7][0], Math.min(this.ak_fld[var7][1], Math.min(var18, var20)));
			var23 = Math.max(this.ak_fld[var7][0], Math.max(this.ak_fld[var7][1], Math.max(var18, var20)));
			var24 = Math.min(this.ag_fld[var7][0], Math.min(this.ag_fld[var7][1], Math.min(var19, var21)));
			var25 = Math.max(this.ag_fld[var7][0], Math.max(this.ag_fld[var7][1], Math.max(var19, var21)));
			this.as_fld[var7] = new uf(var22, var24, var23 - var22, var25 - var24);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ak(int var1, int var2) {
		return this.ak_fld[var1][var2];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ar(int var1) {
		return this.ae_fld[var1 & 15];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int az(int var1) {
		return this.ae_fld[var1 & 15];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int av(int var1) {
		return this.ah_fld[var1 & 15];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int aw(int var1, int var2) {
		return this.ak_fld[var1][var2];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int al(int var1) {
		return this.ae_fld[var1 & 15];
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lxj;)V"
	)
	public static void oc(xj var0) {
		var0.au_fld = -1605633594 * ((var0.az_fld + 7) / 8);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int as(int var1, int var2) {
		return this.ag_fld[var1][var2];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int an(int var1) {
		return this.ah_fld[var1 & 15];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int af(int var1) {
		return this.ae_fld[var1 & 15];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ag(int var1, int var2) {
		return this.ag_fld[var1][var2];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ax(int var1) {
		return this.ah_fld[var1 & 15];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int au(int var1) {
		return this.ae_fld[var1 & 15];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aa(int var1) {
		return this.ah_fld[var1 & 15];
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Z)V"
	)
	public static void ph(cn var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = var1;
		og.ag();
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

			if (mb.av_fld.get(0) != null && ((me)mb.av_fld.get(0)).af_fld.ax() && mb.av_fld.get(1) != null && ((me)mb.av_fld.get(1)).af_fld.ax()) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ah(int var1, int var2) {
		return this.ak_fld[var1][var2];
	}
}
