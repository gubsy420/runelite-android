import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mv")
public class mv {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ci_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)Lgf;"
	)
	public static gf ir(wl var0) {
		return var0.ac_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void ab() {
		boolean var1;
		do {
			var1 = true;

			for (int var2 = 0; var2 < ej.cd_fld; var2++) {
				if (ej.cq_fld[var2] < ej.cq_fld[1 + var2]) {
					long var3 = ej.cc_fld[var2];
					ej.cc_fld[var2] = ej.cc_fld[var2 + 1];
					ej.cc_fld[1 + var2] = var3;
					int var5 = ej.cq_fld[var2];
					ej.cq_fld[var2] = ej.cq_fld[var2 + 1];
					ej.cq_fld[1 + var2] = var5;
					var1 = false;
				}
			}
		} while (!var1);

		for (int var6 = 0; var6 < ej.cd_fld; var6++) {
			for (int var7 = var6 + 1; var7 <= ej.cd_fld; var7++) {
				if (ej.cc_fld[var6] == ej.cc_fld[var7]) {
					ej.cc_fld[var6] = -1L;
					break;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V"
	)
	static void ab(ct var0, int var1) throws EOFException {
		if (var0.as((short)2048) != client.ct_fld) {
			client.ct_fld = var0.as((short)2048);
			boolean var2 = var0.as((short)2048);
			if (var2 != ux.dq_fld) {
				og.do_fld.av();
				og.dd_fld.av();
				og.dl_fld.av();
				ux.dq_fld = var2;
			}
		}

		if (client.gt_fld != var0.au_fld) {
			ap.aw(gz.hy_fld, var0.au_fld);
		}

		hk.ik_fld = var0.aq_fld;
		client.ch_fld = var0.aa_fld * 210462851;
		client.gt_fld = var0.au_fld * 169743169;
		bb.jj_fld = var0.an_fld;
		int var10001;
		if (client.gu_fld == 0) {
			if (var1 <= -1106363349) {
				client.ep();
				return;
			}

			var10001 = 43594;
		} else {
			var10001 = 40000 + var0.aa_fld;
		}

		bb.ij_fld = 405029405 * var10001;
		int var10000;
		if (0 == client.gu_fld) {
			if (var1 <= -1106363349) {
				client.ep();
				return;
			}

			var10000 = 443;
		} else {
			var10000 = 50000 + var0.aa_fld;
		}

		bo.id_fld = var10000 * 1378194077;
		ha.ih_fld = bb.ij_fld;
		client.ep();
	}

	mv() throws Throwable {
		throw new Error();
	}
}
