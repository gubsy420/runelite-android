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

	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "(Lmu;B)Ljava/lang/String;"
	)
	public static String wi(mu var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld;
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

	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "(Lxq;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int tt(xq var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak((rl)var1, (rl)var2, 1268337538);
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String as(byte var1) {
		return this.av_fld;
	}
}
