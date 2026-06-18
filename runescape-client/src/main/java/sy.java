import java.util.concurrent.Callable;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sy")
class sy implements Callable {
	// $VF: synthetic field
	@ObfuscatedName("val$curveLoadJobs")
	@ObfuscatedSignature(
		descriptor = "[Lsg;"
	)
	sg[] val$curveLoadJobs;
	// $VF: synthetic field
	@ObfuscatedName("val$workEnd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int val$workEnd;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	sp this$0;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cv_fld;
	// $VF: synthetic field
	@ObfuscatedName("val$workStart")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int val$workStart;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ad_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static lv hk_fld;

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)I"
	)
	public static int cb(xi var0) {
		return 187828303 - var0.al_fld[(var0.au_fld += 228932457) * -96957045 - 1] & 0xFF;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ag() {
		for (int var1 = this.val$workEnd; var1 < this.val$workStart; var1++) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("call")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	@Override
	public Object call() {
		for (int var1 = this.val$workEnd; var1 < this.val$workStart; var1++) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object ak() {
		for (int var1 = this.val$workEnd; var1 < this.val$workStart; var1++) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	sy(sp var1, int var2, int var3, sg[] var4) {
		this.this$0 = var1;
		this.val$workEnd = var2;
		this.val$workStart = var3;
		this.val$curveLoadJobs = var4;
	}
}
