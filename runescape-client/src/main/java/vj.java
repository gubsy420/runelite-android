import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vj")
public class vj extends ws {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ak_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		if (this.ak_fld.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.ak_fld.iterator();

			while (var1.hasNext()) {
				me var2 = (me)(me)var1.next();

				try {
					if (mb.av_fld.contains(var2)) {
						if (null == var2) {
							mb.av_fld.remove(var2);
						} else {
							if (var2.af_fld.aw_fld * -1034371599 > 0) {
								var2.af_fld.aw_fld--;
							}

							if (var2.af_fld.aw_fld * -1034371599 == 0) {
								var2.af_fld.au();
								var2.af_fld.ar();
								var2.af_fld.ak(0);
							}

							je.ag(var2.ag_fld, var2.az_fld);
							mb.av_fld.remove(var2);
						}
					}
				} catch (Exception var4) {
					gl.ak(null, var4);
					this.al(var4.getMessage());
					mb.av_fld.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		if (this.ak_fld.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.ak_fld.iterator();

			while (var2.hasNext()) {
				me var3 = (me)(me)var2.next();

				try {
					if (mb.av_fld.contains(var3)) {
						if (null == var3) {
							mb.av_fld.remove(var3);
						} else {
							if (var3.af_fld.aw_fld * -1034371599 > 0) {
								var3.af_fld.aw_fld--;
							}

							if (var3.af_fld.aw_fld * -1034371599 == 0) {
								var3.af_fld.au();
								var3.af_fld.ar();
								var3.af_fld.ak(0);
							}

							je.ag(var3.ag_fld, var3.az_fld);
							mb.av_fld.remove(var3);
						}
					}
				} catch (Exception var5) {
					gl.ak(null, var5);
					this.al(var5.getMessage());
					mb.av_fld.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int be(int var0, ba var1, boolean var2) throws EOFException {
		lu var4 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		if (var0 == 2800) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = nt.ag(uo.sa(cf.cg_fld, var4, 195514530));
			return 1;
		} else if (2801 != var0) {
			if (var0 == 2802) {
				if (null == var4.eq_fld) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				} else {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.eq_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var5--;
			if (var4.ei_fld != null && var5 < var4.ei_fld.length && null != var4.ei_fld[var5]) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.ei_fld[var5];
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Lds;)V"
	)
	static void el(ds var0) {
		var0.bv_fld = -152112395 * var0.ah_fld.cw_fld;
		var0.dt_fld = 101542575 * var0.ah_fld.dw_fld;
		var0.bc_fld = var0.ah_fld.cu_fld * -591887589;
		var0.bw_fld = var0.ah_fld.ci_fld * -1302247577;
		var0.ba_fld = -1394609019 * var0.ah_fld.cj_fld;
		var0.bq_fld = -181977101 * var0.ah_fld.ch_fld;
		var0.bi_fld = -2079640667 * var0.ah_fld.ck_fld;
		var0.bu_fld = var0.ah_fld.cb_fld * -652084157;
		var0.bn_fld = var0.ah_fld.co_fld * 823353091;
		var0.bg_fld = var0.ah_fld.ct_fld * 1644659833;
		var0.bb_fld = -768103617 * var0.ah_fld.cl_fld;
		var0.cd_fld = -1416230141 * var0.ah_fld.dc_fld;
		var0.cc_fld = -1974742505 * var0.ah_fld.dh_fld;
		var0.cq_fld = var0.ah_fld.dv_fld * 139103385;
		var0.cv_fld = var0.ah_fld.dz_fld * 1778724481;
		var0.cy_fld = var0.ah_fld.dt_fld * -436652797;
		var0.cf_fld = var0.ah_fld.dm_fld;
	}

	public vj(ws var1, ArrayList var2) {
		super(var1);
		this.aw_fld = "ClearRequestTask";
		this.ak_fld = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(C)B"
	)
	public static byte ak(char var0) {
		byte var2;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (8364 == var0) {
				var2 = -128;
			} else if (var0 == 8218) {
				var2 = -126;
			} else if (var0 == 402) {
				var2 = -125;
			} else if (8222 == var0) {
				var2 = -124;
			} else if (var0 == 8230) {
				var2 = -123;
			} else if (var0 == 8224) {
				var2 = -122;
			} else if (8225 == var0) {
				var2 = -121;
			} else if (var0 == 710) {
				var2 = -120;
			} else if (var0 == 8240) {
				var2 = -119;
			} else if (352 == var0) {
				var2 = -118;
			} else if (8249 == var0) {
				var2 = -117;
			} else if (338 == var0) {
				var2 = -116;
			} else if (var0 == 381) {
				var2 = -114;
			} else if (8216 == var0) {
				var2 = -111;
			} else if (var0 == 8217) {
				var2 = -110;
			} else if (var0 == 8220) {
				var2 = -109;
			} else if (var0 == 8221) {
				var2 = -108;
			} else if (var0 == 8226) {
				var2 = -107;
			} else if (8211 == var0) {
				var2 = -106;
			} else if (8212 == var0) {
				var2 = -105;
			} else if (732 == var0) {
				var2 = -104;
			} else if (8482 == var0) {
				var2 = -103;
			} else if (353 == var0) {
				var2 = -102;
			} else if (8250 == var0) {
				var2 = -101;
			} else if (339 == var0) {
				var2 = -100;
			} else if (382 == var0) {
				var2 = -98;
			} else if (var0 == 376) {
				var2 = -97;
			} else {
				var2 = 63;
			}
		} else {
			var2 = (byte)var0;
		}

		return var2;
	}
}
