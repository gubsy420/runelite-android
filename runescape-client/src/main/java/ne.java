import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ne")
public class ne extends vc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ak_fld = new iw(64);

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;I)I"
	)
	public static int dv(zv var0, String var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var3 = zv.sh(var0, var1, new int[]{var2}, zv.ab_fld);
			int var4 = 0;

			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = var0.an(zv.ab_fld[var5]);
				if (var6 > var4) {
					var4 = var6;
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
	)
	static int al(int var0, ba var1, boolean var2) throws EOFException {
		try {
			lu var4;
			if (var0 >= 2000) {
				var0 -= 1000;
				int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var4 = cf.cg_fld.ak(var5);
			} else {
				var4 = var2 ? gs.ap_fld : bp.ab_fld;
			}

			if (var0 == 1000) {
				gz.ax_fld -= 4;
				var4.bn_fld = bp.au_fld[gz.ax_fld];
				var4.bc_fld = bp.au_fld[1 + gz.ax_fld];
				var4.bt_fld = bp.au_fld[2 + gz.ax_fld];
				var4.bv_fld = bp.au_fld[3 + gz.ax_fld];
				kl.ah(var4, pf.qw_fld, bc.qx_fld, cf.cg_fld, client.cz_fld);
				if (var4.bx_fld == 0) {
					lu[] var9 = -1 == var4.by_fld ? cf.cg_fld.aw_fld[var4.bf_fld >> 16] : cf.cg_fld.ak(var4.cv_fld).ge_fld;
					tb.ag(var9, var4, false, cf.cg_fld, client.cz_fld, -871484525);
				}

				return 1;
			} else if (1001 == var0) {
				gz.ax_fld -= 4;
				var4.bw_fld = bp.au_fld[gz.ax_fld];
				var4.ba_fld = -794239085 * bp.au_fld[1 + gz.ax_fld];
				var4.bi_fld = -145422025 * bp.au_fld[2 + gz.ax_fld];
				var4.bu_fld = -2039943749 * bp.au_fld[3 + gz.ax_fld];
				kl.ah(var4, pf.qw_fld, bc.qx_fld, cf.cg_fld, client.cz_fld);
				if (var4.bx_fld == 0) {
					lu[] var8 = -1 == var4.by_fld ? cf.cg_fld.aw_fld[var4.bf_fld >> 16] : cf.cg_fld.ak(var4.cv_fld).ge_fld;
					tb.ag(var8, var4, false, cf.cg_fld, client.cz_fld, -898464583);
				}

				return 1;
			} else if (var0 == 1003) {
				boolean var7 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (var7 != var4.cf_fld) {
					var4.cf_fld = var7;
				}

				return 1;
			} else if (1005 == var0) {
				var4.hb_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (var0 == 1006) {
				var4.hf_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else {
				return 2;
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Lwt;)I"
	)
	public static int us(wt var0) throws EOFException {
		try {
			if (var0.ae_fld == null) {
				var0.aw_fld = 1402900404;
				var0.ay_fld = true;
			} else {
				if (var0.aw_fld < 33) {
					if (!var0.ah_fld.co(hc.ag_fld.ah_fld, var0.ae_fld.ar(-1532736615), -550674105)) {
						return var0.aw_fld;
					}

					var0.aw_fld = -267187307;
				}

				if (var0.aw_fld == 33) {
					if (var0.ah_fld.ck(hc.az_fld.ah_fld, var0.ae_fld.ar(-1001854581), (byte)-116) && !var0.ah_fld.co(hc.az_fld.ah_fld, var0.ae_fld.ar(517698192), -847456358)) {
						return var0.aw_fld;
					}

					var0.aw_fld = -534374614;
				}

				if (66 == var0.aw_fld) {
					if (!var0.ah_fld.co(var0.ae_fld.ar(-2112439658), hc.ae_fld.ah_fld, -82932198)) {
						return var0.aw_fld;
					}

					var0.aw_fld = 1402900404;
					var0.ay_fld = true;
				}
			}

			return var0.aw_fld;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	ne() throws Throwable {
		throw new Error();
	}
}
