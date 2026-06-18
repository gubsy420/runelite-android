import java.io.EOFException;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1005020963
	)
	int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
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

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Lek;Lsp;I)V"
	)
	public static void ec(ek var0, sp var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah(var1, var2, null, false);
	}

	dd() {
		this.az_fld = 0;
		this.ae_fld = new int[500];
		this.av_fld = new int[500];
		this.ah_fld = new long[500];
	}

	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "(Ldd;)V"
	)
	public static void vy(dd var0) {
		for (; var0.ak_fld; dg.ak(50L)) {
			synchronized (var0.ag_fld) {
				if (var0.az_fld < 1971036334) {
					var0.ae_fld[-828009719 * var0.az_fld] = tj.ae_fld;
					var0.av_fld[1820176346 * var0.az_fld] = tj.ah_fld;
					var0.ah_fld[var0.az_fld] = tj.aw_fld;
					var0.az_fld++;
				}
			}
		}
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("run")
	@Override
	public void run() {
		for (; this.ak_fld; dg.ak(50L)) {
			synchronized (this.ag_fld) {
				if (this.az_fld < 500) {
					this.ae_fld[this.az_fld] = tj.ae_fld;
					this.av_fld[this.az_fld] = tj.ah_fld;
					this.ah_fld[this.az_fld] = tj.aw_fld;
					this.az_fld++;
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		for (; this.ak_fld; dg.ak(50L)) {
			synchronized (this.ag_fld) {
				if (this.az_fld < 500) {
					this.ae_fld[this.az_fld] = tj.ae_fld * -36287008;
					this.av_fld[this.az_fld] = tj.ah_fld * -844641520;
					this.ah_fld[-2098716853 * this.az_fld] = tj.aw_fld;
					this.az_fld += -2128646516;
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
					this.ae_fld[this.az_fld] = tj.ae_fld * 358339602;
					this.av_fld[this.az_fld] = tj.ah_fld;
					this.ah_fld[-67410161 * this.az_fld] = tj.aw_fld;
					this.az_fld += 1630189236;
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
					this.ae_fld[244977374 * this.az_fld] = tj.ae_fld * -1596355101;
					this.av_fld[this.az_fld] = tj.ah_fld;
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
	static final void fg(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) throws EOFException {
		try {
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

				wz.xy(client.nr_fld.af_fld[var0], var1, var2, var3, var4, var5, var6, var7, false, var8);
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}
}
