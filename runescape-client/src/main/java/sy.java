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

	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;)I"
	)
	public static int sq(uo var0, lu var1) {
		lg var2 = (lg)var0.an_fld.ak(var1.bf_fld * -2097943517);
		int var4 = -1146048298 * var1.by_fld;
		lg var5 = var2;

		lg var3;
		while (true) {
			if (null == var5) {
				var3 = null;
				break;
			}

			if (var4 >= var5.ak_fld && var4 <= var5.ag_fld) {
				var3 = var5;
				break;
			}

			var5 = var5.ae_fld;
		}

		return null != var3 ? var3.ak(-1724411564) : var1.ec_fld;
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
