import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ws")
public abstract class ws {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	ws ae_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String aw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lws;I)Ljava/lang/String;"
	)
	public static String hs(ws var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return "Error in task: " + var0.aw_fld + ", Error message: " + var0.ah_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String aq() {
		return "Error in task: " + this.aw_fld + ", Error message: " + this.ah_fld;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Lws;Ljava/lang/String;B)V"
	)
	public static void dx(ws var0, String var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = true;
		var0.ah_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	public abstract boolean ak(short var1);

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lws;)Z"
	)
	public static boolean ij(ws var0) {
		return var0.av_fld;
	}

	ws(ws var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean as() {
		return this.av_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String am() {
		return "Error in task: " + this.aw_fld + ", Error message: " + this.ah_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public abstract boolean ag();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ap(String var1) {
		this.ay_fld = true;
		this.ah_fld = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		return this.ay_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean an() {
		return this.ay_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lws;"
	)
	public ws af() {
		return this.ae_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ai() {
		return this.av_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ad() {
		return "Error in task: " + this.aw_fld + ", Error message: " + this.ah_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lws;"
	)
	public ws ao() {
		return this.ae_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean ay() {
		return this.ay_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lzo;B)I"
	)
	static final int ak(zo var0) {
		if (null == var0) {
			return 12;
		} else {
			switch (var0.ar_fld) {
				case 0:
					return 20;
				default:
					return 12;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ar(int var1) {
		return "Error in task: " + this.aw_fld + ", Error message: " + this.aw_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	void al(String var1, byte var2) {
		this.ay_fld = true;
		this.aw_fld = var1;
	}
}
