import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bm")
public class bm {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;

	bm(bh var1) {
		var1.ak(16, 481890397);
		this.ak_fld = var1.av() != 0 ? var1.ak(4, -697089758) + 1 : 1;
		if (var1.av() != 0) {
			var1.ak(8, 771755356);
		}

		var1.ak(2, -1112982330);
		if (this.ak_fld > 1) {
			this.ag_fld = var1.ak(4, 323889324);
		}

		this.az_fld = new int[this.ak_fld];
		this.av_fld = new int[this.ak_fld];

		for (int var2 = 0; var2 < this.ak_fld; var2++) {
			var1.ak(8, -1973942836);
			this.az_fld[var2] = var1.ak(8, -741380314);
			this.av_fld[var2] = var1.ak(8, -1056646573);
		}
	}
}
