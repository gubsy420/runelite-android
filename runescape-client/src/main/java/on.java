import java.awt.FontMetrics;
import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("on")
public class on {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static on aw_fld = new on(6);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static on ag_fld = new on(1);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] as_fld = null;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static on az_fld = new on(2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static on av_fld = new on(3);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static on ah_fld = new on(5);
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/FontMetrics;"
	)
	static FontMetrics bf_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static on ak_fld = new on(0);
	@ObfuscatedGetter(
		intValue = -974014265
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean kb_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static on ae_fld = new on(4);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int au_fld;

	on(int var1) {
		this.ar_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ak() {
		as_fld = new int[7];
		as_fld[ak_fld.ar_fld] = of.as_fld.aa_fld;
		as_fld[ag_fld.ar_fld] = of.al_fld.aa_fld;
		as_fld[az_fld.ar_fld] = of.ae_fld.aa_fld;
		as_fld[av_fld.ar_fld] = of.aw_fld.aa_fld;
		as_fld[ae_fld.ar_fld] = of.ar_fld.aa_fld;
		as_fld[ah_fld.ar_fld] = of.ay_fld.aa_fld;
		as_fld[aw_fld.ar_fld] = of.af_fld.aa_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ag(int var0) {
		if (null == as_fld) {
			ak();
		}

		return as_fld[var0];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void av() {
		as_fld = new int[7];
		as_fld[ak_fld.ar_fld] = of.as_fld.aa_fld;
		as_fld[ag_fld.ar_fld * 1884840086] = of.al_fld.aa_fld;
		as_fld[az_fld.ar_fld] = 659864319 * of.ae_fld.aa_fld;
		as_fld[av_fld.ar_fld] = of.aw_fld.aa_fld;
		as_fld[-1768514548 * ae_fld.ar_fld] = of.ar_fld.aa_fld;
		as_fld[ah_fld.ar_fld] = 1174197528 * of.ay_fld.aa_fld;
		as_fld[-574393321 * aw_fld.ar_fld] = 635252603 * of.af_fld.aa_fld;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb ef(yb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var1;
		return var0;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int cy(int var0, ba var1, boolean var2) {
		if (var0 == 7108) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = qa.ej() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ae() {
		as_fld = new int[7];
		as_fld[ak_fld.ar_fld * 539363237] = of.as_fld.aa_fld;
		as_fld[ag_fld.ar_fld] = of.al_fld.aa_fld;
		as_fld[az_fld.ar_fld] = 2014988084 * of.ae_fld.aa_fld;
		as_fld[av_fld.ar_fld] = 521359478 * of.aw_fld.aa_fld;
		as_fld[-1240800666 * ae_fld.ar_fld] = of.ar_fld.aa_fld;
		as_fld[ah_fld.ar_fld * 741995123] = of.ay_fld.aa_fld;
		as_fld[aw_fld.ar_fld] = -30090908 * of.af_fld.aa_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void az() {
		as_fld = new int[7];
		as_fld[ak_fld.ar_fld] = of.as_fld.aa_fld;
		as_fld[ag_fld.ar_fld] = of.al_fld.aa_fld;
		as_fld[az_fld.ar_fld] = of.ae_fld.aa_fld;
		as_fld[av_fld.ar_fld] = of.aw_fld.aa_fld;
		as_fld[ae_fld.ar_fld] = of.ar_fld.aa_fld;
		as_fld[ah_fld.ar_fld] = of.ay_fld.aa_fld;
		as_fld[aw_fld.ar_fld] = of.af_fld.aa_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void bw() throws EOFException {
		int var1 = client.db_fld.al_fld;
		int[] var2 = client.db_fld.az_fld;
		Iterator var3 = client.da_fld.iterator();

		while (var3.hasNext()) {
			dx var4 = (dx)(dx)var3.next();

			for (int var5 = 0; var5 < var1; var5++) {
				cv var6 = (cv)var4.au_fld.ak(var2[var5]);
				if (null != var6) {
					ec.bg(var4, var6, 1, -572279513);
				}
			}
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "()Lrx;"
	)
	static rx eq() {
		return di.bh(client.db_fld, client.dj_fld, (byte)76);
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int ee() {
		cv var1 = ot.ef();
		return var1 != null ? var1.ap_fld : 0;
	}
}
