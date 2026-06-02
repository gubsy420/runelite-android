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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String aq() {
		return "Error in task: " + this.aw_fld + ", Error message: " + this.ah_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	public abstract boolean ak(short var1);

	ws(ws var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean as() {
		return this.av_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ar() {
		return "Error in task: " + this.aw_fld + ", Error message: " + this.ah_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String am() {
		return "Error in task: " + this.aw_fld + ", Error message: " + this.ah_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void al(String var1) {
		this.ay_fld = true;
		this.ah_fld = var1;
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
		descriptor = "()Lws;"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lws;"
	)
	public ws ab() {
		return this.ae_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ay() {
		return this.ay_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lzo;)I"
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
}
