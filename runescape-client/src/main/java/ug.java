import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ug")
public class ug extends vc {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long er_fld;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	public ug eg_fld;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	public ug en_fld;

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ms() {
		if (this.en_fld != null) {
			this.en_fld.eg_fld = this.eg_fld;
			this.eg_fld.en_fld = this.en_fld;
			this.eg_fld = null;
			this.en_fld = null;
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lse;)I"
	)
	public static int fd(se var0) {
		return var0.ay_fld;
	}

	public ug() {
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mb() {
		if (this.en_fld != null) {
			this.en_fld.eg_fld = this.eg_fld;
			this.eg_fld.en_fld = this.en_fld;
			this.eg_fld = null;
			this.en_fld = null;
		}
	}
}
