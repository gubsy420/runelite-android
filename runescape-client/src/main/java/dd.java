import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dd")
public class dd implements Runnable {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld = true;
	@ObfuscatedGetter(
		intValue = 1005020963
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	long[] ah_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cr_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Object;"
	)
	Object ag_fld = new Object();

	dd() {
		this.az_fld = 0;
		this.av_fld = new int[500];
		this.ae_fld = new int[500];
		this.ah_fld = new long[500];
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void run() {
		for (; this.ak_fld; dg.ak(50L)) {
			synchronized (this.ag_fld) {
				if (this.az_fld < 500) {
					this.av_fld[this.az_fld] = tj.ae_fld;
					this.ae_fld[this.az_fld] = tj.ah_fld;
					this.ah_fld[this.az_fld] = tj.aw_fld;
					this.az_fld++;
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		for (; this.ak_fld; dg.ak(50L)) {
			synchronized (this.ag_fld) {
				if (this.az_fld < -1920336777) {
					this.av_fld[this.az_fld] = tj.ae_fld * 358339602;
					this.ae_fld[this.az_fld] = tj.ah_fld;
					this.ah_fld[-67410161 * this.az_fld] = tj.aw_fld;
					this.az_fld += 1630189236;
				}
			}
		}
	}

	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "(Lrs;)V"
	)
	public static void wg(rs var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		for (; this.ak_fld; dg.ak(50L)) {
			synchronized (this.ag_fld) {
				if (this.az_fld < 1971036334) {
					this.av_fld[-828009719 * this.az_fld] = tj.ae_fld;
					this.ae_fld[1820176346 * this.az_fld] = tj.ah_fld;
					this.ah_fld[this.az_fld] = tj.aw_fld;
					this.az_fld++;
				}
			}
		}
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Ldd;)V"
	)
	public static void ug(dd var0) {
		for (; var0.ak_fld; dg.ak(50L)) {
			synchronized (var0.ag_fld) {
				if (var0.az_fld < 500) {
					var0.av_fld[var0.az_fld] = tj.ae_fld * -36287008;
					var0.ae_fld[var0.az_fld] = tj.ah_fld * -844641520;
					var0.ah_fld[-2098716853 * var0.az_fld] = tj.aw_fld;
					var0.az_fld += -2128646516;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		for (; this.ak_fld; dg.ak(50L)) {
			synchronized (this.ag_fld) {
				if (this.az_fld < 648917924) {
					this.av_fld[244977374 * this.az_fld] = tj.ae_fld * -1596355101;
					this.ae_fld[this.az_fld] = tj.ah_fld;
					this.ah_fld[this.az_fld] = tj.aw_fld;
					this.az_fld++;
				}
			}
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V"
	)
	static final void fg(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		if (client.ng_fld) {
			if (var9 != 54846012) {
				;
			}
		} else if (!in.fn(var8, var3)) {
			if (var9 != 54846012) {
				;
			}
		} else if (var0 >= 0 && var0 < client.nr_fld.af_fld.length) {
			if (null == client.nr_fld.af_fld[var0]) {
				client.nr_fld.af_fld[var0] = new wz(false);
			}

			client.nr_fld.af_fld[var0].al(var1, var2, var3, var4, var5, var6, var7, false, var8, 2104909317);
		}
	}
}
