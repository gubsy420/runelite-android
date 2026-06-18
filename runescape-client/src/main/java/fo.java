import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fo")
public class fo {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
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
		descriptor = "F"
	)
	static float ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ac_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean an_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ax_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	fy au_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ao_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld = 2;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	public fx aq_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bm_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ab_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ap_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int at_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1472991871
	)
	public int ai_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aj_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int br_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int be_fld;

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lfo;IIII)V"
	)
	public static void cv(fo var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld = var1 - var2;
		var0.ad_fld = var3 - var4;
		var0.ap_fld = -var0.am_fld;
		var0.at_fld = var0.ao_fld - var0.am_fld;
		var0.ac_fld = -var0.ad_fld;
		var0.aj_fld = var0.ab_fld - var0.ad_fld;
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Lfo;IIII)V"
	)
	public static void yq(fo var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.am_fld = var1 - var2;
			var0.ad_fld = var3 - var4;
			var0.ap_fld = -var0.am_fld;
			var0.at_fld = var0.ao_fld - var0.am_fld;
			var0.ac_fld = -var0.ad_fld;
			var0.aj_fld = var0.ab_fld - var0.ad_fld;
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int gc() {
		return this.ap_fld;
	}

	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int sk() {
		return this.at_fld;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int no() {
		return this.aj_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void bd(boolean var1) {
		this.an_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ak() {
		this.am_fld = this.ao_fld / 2;
		this.ad_fld = this.ab_fld / 2;
		this.ap_fld = -this.am_fld;
		this.at_fld = this.ao_fld - this.am_fld;
		this.ac_fld = -this.ad_fld;
		this.aj_fld = this.ab_fld - this.ad_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ah(int var1, int var2, int var3, int var4) {
		this.am_fld = var1 - var2;
		this.ad_fld = var3 - var4;
		this.ap_fld = -this.am_fld;
		this.at_fld = this.ao_fld - this.am_fld;
		this.ac_fld = -this.ad_fld;
		this.aj_fld = this.ab_fld - this.ad_fld;
	}

	@ObfuscatedName("zf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int zf() {
		return this.am_fld;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int dw() {
		return this.ai_fld;
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int sd() {
		return this.ad_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void az() {
		this.am_fld = this.ao_fld / 2;
		this.ad_fld = this.ab_fld / 2;
		this.ap_fld = -this.am_fld;
		this.at_fld = this.ao_fld - this.am_fld;
		this.ac_fld = -this.ad_fld;
		this.aj_fld = this.ab_fld - this.ad_fld;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean jc() {
		return this.an_fld;
	}

	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ue() {
		return this.ac_fld;
	}

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	public static void xy(fo var0) {
		var0.am_fld = var0.ao_fld / 2;
		var0.ad_fld = var0.ab_fld / 2;
		var0.ap_fld = -var0.am_fld;
		var0.at_fld = var0.ao_fld - var0.am_fld;
		var0.ac_fld = -var0.ad_fld;
		var0.aj_fld = var0.ab_fld - var0.ad_fld;
	}

	fo() {
		this.au_fld = new fy();
		this.ax_fld = false;
		this.an_fld = true;
		this.aa_fld = 0;
		this.ai_fld = 512;
		this.bm_fld = new int[1024];
		this.br_fld = -1;
		this.be_fld = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void aw(int var1, int var2, int var3, int var4) {
		this.am_fld = var1 - var2;
		this.ad_fld = var3 - var4;
		this.ap_fld = -this.am_fld;
		this.at_fld = this.ao_fld - this.am_fld;
		this.ac_fld = -this.ad_fld;
		this.aj_fld = this.ab_fld - this.ad_fld;
	}

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wg(int var1) {
		this.ai_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ag(int var1, int var2, int var3, int var4) {
		this.ap_fld = var1 - var2;
		this.br_fld = var3 - var4;
		this.al_fld = -this.aj_fld;
		this.ad_fld = this.ap_fld - this.ad_fld;
		this.br_fld = -this.ab_fld;
		this.ao_fld = this.ap_fld - this.ad_fld;
	}
}
