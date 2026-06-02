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
	@ObfuscatedGetter(
		intValue = -2088386951
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = 372487533
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = 1462704729
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = -81365575
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 574029715
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = -2074304121
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = -1473107325
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = 708385587
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = 1707258063
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = -792367667
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld = 0;
	@ObfuscatedGetter(
		intValue = 1829447635
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = 824850307
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = -18468209
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld = 397890449;
	@ObfuscatedGetter(
		intValue = -609494231
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld = 1080504839;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = 57497381
	)
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;)V"
	)
	void ay(String[] var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean av(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.an_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean az(int var1, int var2) {
		return null != this.aa_fld && var1 >= 0 && var1 < this.aa_fld.length && null != this.aa_fld[var1];
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jx() {
		return this.ax_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)Ljava/lang/String;"
	)
	public static String cf(cs var0, int var1) {
		return var0.aa_fld != null && var1 >= 0 && var1 < var0.aa_fld.length ? var0.aa_fld[var1] : null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ap(int var1) {
		return this.av(var1);
	}

	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IB)Ljava/lang/String;"
	)
	public static String wz(cs var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aa_fld != null && var1 >= 0 && var1 < var0.aa_fld.length ? var0.aa_fld[var1] : null;
		}
	}

	cs() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) {
		this.an_fld = var1;
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Lcs;[Ljava/lang/String;I)V"
	)
	public static void vw(cs var0, String[] var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa_fld = var1;
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

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)Z"
	)
	public static boolean mk(cs var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 0 && var1 <= 4 ? (var0.an_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V"
	)
	public static void ln(cs var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.an_fld = var1;
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ky(int var1) {
		return wz(this, var1, (byte)-13);
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ib(int var1) {
		this.au_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V"
	)
	void ag(String[] var1, int var2) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("yk")
	@ObfuscatedSignature(
		descriptor = "(Ldw;Ltu;)V"
	)
	public static void yk(dw var0, tu var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ak(int var1, int var2) {
		this.av_fld = -1904807655 * var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;"
	)
	String ae(int var1, byte var2) {
		return this.aa_fld != null && var1 >= 0 && var1 < this.aa_fld.length ? this.aa_fld[var1] : null;
	}
}
