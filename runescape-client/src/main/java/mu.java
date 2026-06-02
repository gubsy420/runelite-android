import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mu")
public abstract class mu {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aq_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String av_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	mj this$0;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int dz_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ae() {
		return -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int az();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public abstract int ak(byte var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ah(int var1) {
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ag(byte var1) {
		return -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String aw() {
		return null;
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lmu;B)Ljava/lang/String;"
	)
	public static String mw(mu var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.av_fld;
		}
	}

	mu(mj var1, String var2) {
		this.this$0 = var1;
		this.av_fld = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ay() {
		return null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public abstract int av();

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)F"
	)
	public static float gy(tu var0) {
		return (float)Math.sqrt(var0.ay_fld * var0.ay_fld + var0.as_fld * var0.as_fld + var0.ar_fld * var0.ar_fld);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String as(byte var1) {
		return this.av_fld;
	}
}
