import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ug")
public class ug extends vc {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long er_fld;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	public ug en_fld;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	public ug eg_fld;

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lug;)V"
	)
	public static void ml(ug var0) {
		if (var0.eg_fld != null) {
			var0.eg_fld.en_fld = var0.en_fld;
			var0.en_fld.eg_fld = var0.eg_fld;
			var0.en_fld = null;
			var0.eg_fld = null;
		}
	}

	public ug() {
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mb() {
		if (this.eg_fld != null) {
			this.eg_fld.en_fld = this.en_fld;
			this.en_fld.eg_fld = this.eg_fld;
			this.en_fld = null;
			this.eg_fld = null;
		}
	}
}
