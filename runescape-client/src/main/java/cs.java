import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cs")
public class cs extends vw {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	String[] aa_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2088386951
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 372487533
	)
	int az_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1462704729
	)
	int ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -81365575
	)
	int ae_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 574029715
	)
	int ay_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2074304121
	)
	int aw_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1473107325
	)
	int af_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 708385587
	)
	int as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1707258063
	)
	int ar_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -792367667
	)
	int au_fld = 0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1829447635
	)
	int al_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 824850307
	)
	int av_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -18468209
	)
	int ax_fld = 397890449;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -609494231
	)
	int an_fld = 1080504839;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 57497381
	)
	static int jy_fld;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bn_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bi_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V"
	)
	void ag(String[] var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ak(int var1, int var2) {
		this.an_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean az(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.an_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean av(int var1) {
		return null != this.aa_fld && var1 >= 0 && var1 < this.aa_fld.length && null != this.aa_fld[var1];
	}

	cs() {
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)Ljava/lang/String;"
	)
	public static String kv(gf var0) {
		return var0.az_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ah(int var1) {
		this.an_fld = var1;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V"
	)
	public static void da(cs var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.an_fld = var1;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean fz(int var1) {
		return this.az(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ar(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.an_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String qf(int var1) {
		return this.ae(var1);
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void oj(int var1) {
		this.au_fld = var1;
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int op() {
		return this.ax_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;"
	)
	String ae(int var1) {
		return this.aa_fld != null && var1 >= 0 && var1 < this.aa_fld.length ? this.aa_fld[var1] : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	void as(String[] var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean af(int var1) {
		return null != this.aa_fld && var1 >= 0 && var1 < this.aa_fld.length && null != this.aa_fld[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	String al(int var1) {
		return this.aa_fld != null && var1 >= 0 && var1 < this.aa_fld.length ? this.aa_fld[var1] : null;
	}
}
