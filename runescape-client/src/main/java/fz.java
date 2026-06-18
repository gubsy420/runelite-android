import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fz")
public class fz {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
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
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1439754433
	)
	int ag_fld = 0;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ad_fld;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ax() {
		return this.ag_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void aq(int var1, int var2) {
		this.av_fld[1999865351 * this.ag_fld] = var1;
		this.az_fld[this.ag_fld * -1708718490] = var2;
		this.ag_fld += -1212410803;
	}

	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)V"
	)
	public static void sh(fz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ac(int var1) {
		return this.av_fld[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public int ae(int var1) {
		return this.av_fld[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ah(int var1) {
		return this.az_fld[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int af() {
		return this.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lsl;II)I"
	)
	public static int aa(sl var0, int var1) {
		yq var3 = yq.ak_fld;
		om.ap(var0, var3, false, (byte)0);
		if (var1 >= 0) {
			int[] var4 = var0.ak();
			int var5 = var0.av();

			for (int var6 = 0; var6 < var5; var6++) {
				if (var1 < var4[var6]) {
					return var6;
				}

				var1 -= var4[var6];
			}
		}

		return -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean aj(int var1) {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			if (this.av_fld[var2] == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int al() {
		return this.ag_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int au() {
		return this.ag_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public boolean aw(int var1) {
		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			if (this.av_fld[var3] == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFFLsn;I)V"
	)
	static void ae(float var0, float var1, float var2, float var3, sn var4) {
		float var6 = var1 - var0;
		float var7 = var2 - var1;
		float var8 = var3 - var2;
		float var9 = var7 - var6;
		var4.aa_fld = var8 - var7 - var9;
		var4.an_fld = var9 + (var9 + var9);
		var4.ax_fld = var6 + (var6 + var6);
		var4.au_fld = var0;
	}

	public fz() {
		this.az_fld = new int[128];
		this.av_fld = new int[128];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ao() {
		return this.ag_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ap(int var1) {
		return this.av_fld[var1];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ad(int var1) {
		return this.av_fld[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int at(int var1) {
		return this.az_fld[var1];
	}

	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I)Z"
	)
	public static boolean ss(fz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld >= 128;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I)[F"
	)
	public static float[] el(si var0, int var1) {
		return var0.af_fld[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.az_fld[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void as() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "(Lfz;)Z"
	)
	public static boolean xm(fz var0) {
		return var0.ag_fld >= 128;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bm(int var1) {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			if (this.av_fld[var2] == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bd(int var1) {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			if (this.av_fld[var2] == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bz(int var1) {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			if (this.av_fld[var2] == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Z)V"
	)
	public static void rd(cn var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ad_fld = var1;
		og.ag();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean br(int var1) {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			if (this.av_fld[var2] == var1) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int an() {
		return this.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void av(int var1, int var2) {
		this.av_fld[this.ag_fld] = var1;
		this.az_fld[this.ag_fld] = var2;
		this.ag_fld++;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I"
	)
	public static int ag(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var7 = var3;
			var3 = var4;
			var4 = var7;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return 2 == var2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ak(int var1) {
		this.ag_fld = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean az(int var1) {
		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			if (this.az_fld[var2] == var1) {
				return true;
			}
		}

		return false;
	}
}
