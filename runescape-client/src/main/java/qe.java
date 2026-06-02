import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qe")
public class qe implements xm {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static qe av_fld = new qe(3, "PATCH", false, true);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	public static qe ag_fld = new qe(1, "GET", true, false);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	public static qe ak_fld = new qe(0, "POST", true, true);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean as_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static qe ae_fld = new qe(4, "DELETE", false, true);
	@ObfuscatedGetter(
		intValue = -1605516367
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static qe az_fld = new qe(2, "PUT", false, true);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String aw_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean as() {
		return this.ay_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aw() {
		return this.ay_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String az() {
		return this.aw_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ak(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ah_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ah_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String au() {
		return this.aw_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean an() {
		return this.as_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ay() {
		return this.ay_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ar() {
		return this.ay_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ah_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String al() {
		return this.aw_fld;
	}

	qe(int var1, String var2, boolean var3, boolean var4) {
		this.ah_fld = var1;
		this.aw_fld = var2;
		this.ay_fld = var3;
		this.as_fld = var4;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aa() {
		return this.as_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lss;"
	)
	public static ss[] ak(byte var0) {
		return new ss[]{ss.ak_fld, ss.ag_fld, ss.az_fld};
	}
}
