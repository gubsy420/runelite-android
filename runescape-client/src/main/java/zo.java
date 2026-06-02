import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zo")
public class zo {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	static zo av_fld = new zo(6, 3, "", "");
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	public static zo ak_fld = new zo(2, 0, "", "");
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	static zo ag_fld = new zo(8, 1, "", "");
	@ObfuscatedGetter(
		intValue = -1806818013
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	static zo ae_fld = new zo(7, 4, "", "");
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	static zo ah_fld = new zo(0, 5, "", "");
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	static zo aw_fld = new zo(4, 6, "", "");
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	static zo ay_fld = new zo(3, 7, "", "");
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	public static zo as_fld = new zo(1, -1, "", "", true, new zo[]{ak_fld, ag_fld, zo.az_fld, ae_fld, av_fld});
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	static zo az_fld = new zo(5, 2, "", "");
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String af_fld;

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.af_fld;
	}

	zo(int var1, int var2, String var3, String var4, boolean var5, zo[] var6) {
		this.ar_fld = var1;
		this.af_fld = var4;
	}

	zo(int var1, int var2, String var3, String var4) {
		this.ar_fld = var1;
		this.af_fld = var4;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return this.af_fld;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.af_fld;
	}
}
