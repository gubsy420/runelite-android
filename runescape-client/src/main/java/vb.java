import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vb")
public class vb {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -63795729
	)
	int af_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1371401807
	)
	int au_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 287960327
	)
	int an_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 451875459
	)
	int ar_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -230169305
	)
	int aa_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1303599131
	)
	int al_fld;

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return String.format("%dx%d (offset %d,%d)", (Object[])(new Object[]{this.al_fld, this.au_fld, this.ar_fld, this.aa_fld}));
	}

	@ObfuscatedName("yr")
	@ObfuscatedSignature(
		descriptor = "(Lvb;)Ljava/lang/String;"
	)
	public static String yr(vb var0) {
		return String.format("%dx%d (offset %d,%d)", (Object[])(new Object[]{var0.al_fld * 813431297, 1419149357 * var0.au_fld, var0.ar_fld, var0.aa_fld}));
	}

	vb(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.al_fld = var1;
		this.au_fld = var2;
		this.ar_fld = var3;
		this.aa_fld = var4;
		this.af_fld = var1 / 2;
		this.an_fld = -1184370505 * (var2 / 2);
		this.ax_fld = -953473829 * (this.af_fld * this.af_fld + this.an_fld * this.an_fld);
	}
}
