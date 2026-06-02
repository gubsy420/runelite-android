import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oj")
public class oj {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ae_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	pb this$0;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ak() {
		ld.au_fld = null;
		pf.ax_fld = null;
		ia.af_fld = null;
		tf.al_Arryv = null;
	}

	oj(pb var1, String var2) {
		this.this$0 = var1;
		this.ae_fld = null;
		if (var2 != null && !var2.isEmpty()) {
			this.ae_fld = var2;
		}
	}
}
