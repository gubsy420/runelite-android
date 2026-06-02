import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qr")
public class qr {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	static void aw(lu var0, int var1, int var2) {
		if (0 == var0.bt_fld) {
			var0.bq_fld = -1983503213 * var0.bn_fld;
		} else if (var0.bt_fld == 1) {
			var0.bq_fld = var0.bn_fld + (var1 - var0.bb_fld) / 2;
		} else if (var0.bt_fld == 2) {
			var0.bq_fld = -491438769 * (var1 - var0.bb_fld - var0.bn_fld);
		} else if (var0.bt_fld == 3) {
			var0.bq_fld = -491438769 * (var0.bn_fld * var1 >> 14);
		} else if (var0.bt_fld == 4) {
			var0.bq_fld = -491438769 * ((var0.bn_fld * var1 >> 14) + (var1 - var0.bb_fld) / 2);
		} else {
			var0.bq_fld = var1 - var0.bb_fld - (var0.bn_fld * var1 >> 14);
		}

		if (var0.bv_fld == 0) {
			var0.bg_fld = 531065689 * var0.bc_fld;
		} else if (var0.bv_fld == 1) {
			var0.bg_fld = var0.bc_fld + (var2 - var0.cd_fld) / 2;
		} else if (2 == var0.bv_fld) {
			var0.bg_fld = -298019711 * (var2 - var0.cd_fld - var0.bc_fld);
		} else if (3 == var0.bv_fld) {
			var0.bg_fld = var2 * var0.bc_fld >> 14;
		} else if (var0.bv_fld == 4) {
			var0.bg_fld = -298019711 * ((var2 - var0.cd_fld) / 2 + (var0.bc_fld * var2 >> 14));
		} else {
			var0.bg_fld = var2 - var0.cd_fld - (var2 * var0.bc_fld >> 14);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Llu;Llu;ZLuo;Lqg;)V"
	)
	public static void af(lu[] var0, lu var1, boolean var2, uo var3, qg var4) throws EOFException {
		int var5 = var1.cn_fld != 0 ? var1.cn_fld : var1.bb_fld;
		int var6 = var1.cr_fld != 0 ? var1.cr_fld : var1.cd_fld;
		fm.av(var0, var1.cx_fld, var1.cs_fld, var1.bf_fld, var1.by_fld, var5, var6, var2, var3, var4, -669983091);
		if (null != var1.ge_fld) {
			fm.av(var1.ge_fld, 0, var1.ge_fld.length - 1, var1.bf_fld, -1, var5, var6, var2, var3, var4, -1231026394);
		}

		if (var1.by_fld == -1) {
			pk var7 = (pk)var3.ai_fld.ak(var1.bf_fld);
			if (null != var7) {
				int var8 = var7.ak_fld;
				if (var3.az(var8)) {
					fm.av(var3.aw_fld[var8], 0, var3.aw_fld[var8].length - 1, -1, -1, var5, var6, var2, var3, var4, -196693189);
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V"
	)
	static void ay(lu var0, int var1, int var2) {
		if (0 == var0.bt_fld) {
			var0.bq_fld = -1983503213 * var0.bn_fld;
		} else if (var0.bt_fld == 1) {
			var0.bq_fld = var0.bn_fld + (var1 - var0.bb_fld) / 2;
		} else if (var0.bt_fld == 2) {
			var0.bq_fld = -491438769 * (var1 - var0.bb_fld - var0.bn_fld);
		} else if (var0.bt_fld == 3) {
			var0.bq_fld = -491438769 * (var0.bn_fld * var1 >> 14);
		} else if (var0.bt_fld == 4) {
			var0.bq_fld = -491438769 * ((var0.bn_fld * var1 >> 14) + (var1 - var0.bb_fld) / 2);
		} else {
			var0.bq_fld = var1 - var0.bb_fld - (var0.bn_fld * var1 >> 14);
		}

		if (var0.bv_fld == 0) {
			var0.bg_fld = 531065689 * var0.bc_fld;
		} else if (var0.bv_fld == 1) {
			var0.bg_fld = var0.bc_fld + (var2 - var0.cd_fld) / 2;
		} else if (2 == var0.bv_fld) {
			var0.bg_fld = -298019711 * (var2 - var0.cd_fld - var0.bc_fld);
		} else if (3 == var0.bv_fld) {
			var0.bg_fld = var2 * var0.bc_fld >> 14;
		} else if (var0.bv_fld == 4) {
			var0.bg_fld = -298019711 * ((var2 - var0.cd_fld) / 2 + (var0.bc_fld * var2 >> 14));
		} else {
			var0.bg_fld = var2 - var0.cd_fld - (var2 * var0.bc_fld >> 14);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([Llu;Llu;ZLuo;Lqg;)V"
	)
	public static void as(lu[] var0, lu var1, boolean var2, uo var3, qg var4) throws EOFException {
		int var5 = var1.cn_fld != 0 ? var1.cn_fld : var1.bb_fld;
		int var6 = var1.cr_fld != 0 ? var1.cr_fld : var1.cd_fld;
		fm.av(var0, var1.cx_fld, var1.cs_fld, var1.bf_fld, var1.by_fld, var5, var6, var2, var3, var4, 2028502260);
		if (null != var1.ge_fld) {
			fm.av(var1.ge_fld, 0, var1.ge_fld.length - 1, var1.bf_fld, -1, var5, var6, var2, var3, var4, 724407900);
		}

		if (var1.by_fld == -1) {
			pk var7 = (pk)var3.ai_fld.ak(var1.bf_fld);
			if (null != var7) {
				int var8 = var7.ak_fld;
				if (var3.az(var8)) {
					fm.av(var3.aw_fld[var8], 0, var3.aw_fld[var8].length - 1, -1, -1, var5, var6, var2, var3, var4, 1508491228);
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Llu;Llu;ZLuo;Lqg;)V"
	)
	public static void ar(lu[] var0, lu var1, boolean var2, uo var3, qg var4) throws EOFException {
		int var5 = var1.cn_fld != 0 ? var1.cn_fld : var1.bb_fld;
		int var6 = var1.cr_fld != 0 ? var1.cr_fld : var1.cd_fld;
		fm.av(var0, var1.cx_fld, var1.cs_fld, var1.bf_fld, var1.by_fld, var5, var6, var2, var3, var4, -788734963);
		if (null != var1.ge_fld) {
			fm.av(var1.ge_fld, 0, var1.ge_fld.length - 1, var1.bf_fld, -1, var5, var6, var2, var3, var4, 749239980);
		}

		if (var1.by_fld == -1) {
			pk var7 = (pk)var3.ai_fld.ak(var1.bf_fld);
			if (null != var7) {
				int var8 = var7.ak_fld;
				if (var3.az(var8)) {
					fm.av(var3.aw_fld[var8], 0, var3.aw_fld[var8].length - 1, -1, -1, var5, var6, var2, var3, var4, -2085527375);
				}
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Lbh;[BI)V"
	)
	public static void fx(bh var0, byte[] var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = var1;
		var0.ag_fld = var2;
		var0.ak_fld = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIZLuo;Lqg;)V"
	)
	static void aa(lu var0, int var1, int var2, boolean var3, uo var4, qg var5) {
		int var6 = var0.bb_fld;
		int var7 = var0.cd_fld;
		if (var0.bi_fld == 0) {
			var0.bb_fld = var0.bw_fld * -570343163;
		} else if (1 == var0.bi_fld) {
			var0.bb_fld = var1 - var0.bw_fld;
		} else if (var0.bi_fld == 2) {
			var0.bb_fld = var0.bw_fld * var1 >> 14;
		}

		if (var0.bu_fld == 0) {
			var0.cd_fld = var0.ba_fld * 1799932419;
		} else if (1 == var0.bu_fld) {
			var0.cd_fld = 79469753 * (var2 - var0.ba_fld);
		} else if (var0.bu_fld == 2) {
			var0.cd_fld = 79469753 * (var0.ba_fld * var2 >> 14);
		}

		if (4 == var0.bi_fld) {
			var0.bb_fld = var0.cc_fld * var0.cd_fld / var0.cq_fld;
		}

		if (4 == var0.bu_fld) {
			var0.cd_fld = var0.bb_fld * var0.cq_fld / var0.cc_fld;
		}

		if (var0.bp_fld == 1337) {
			var4.aq_fld = var0;
		}

		if (var0.bx_fld == 12) {
			lu.bv(var0, -1911815095).aw(var0.bb_fld, var0.cd_fld);
		}

		if (var3 && var0.gr_fld != null && (var0.bb_fld != var6 || var7 != var0.cd_fld)) {
			yz var8 = tu.ak(var0).av((Object[])var0.gr_fld, 1256071564).ax(-598333574);
			var5.ak(var8);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIZLuo;Lqg;)V"
	)
	public static final void al(int var0, int var1, int var2, boolean var3, uo var4, qg var5) throws EOFException {
		if (var4.az(var0)) {
			fm.av(var4.aw_fld[var0], 0, var4.aw_fld[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, 606467527);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIZLuo;Lqg;)V"
	)
	public static final void au(int var0, int var1, int var2, boolean var3, uo var4, qg var5) throws EOFException {
		if (var4.az(var0)) {
			fm.av(var4.aw_fld[var0], 0, var4.aw_fld[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, -271304942);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIZLuo;Lqg;)V"
	)
	static void ax(lu[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, uo var8, qg var9) throws EOFException {
		for (int var10 = var1; var10 <= var2; var10++) {
			lu var11 = var0[var10];
			if (null != var11 && var11.cv_fld == var3 && var11.cy_fld == var4) {
				kd.ae(var11, var5, var6, var7, var8, var9, (short)-4978);
				eo.ak(var11, var5, var6);
				if (var11.cp_fld > var11.cn_fld - var11.bb_fld) {
					var11.cp_fld = var11.cn_fld - var11.bb_fld;
				}

				if (var11.cp_fld < 0) {
					var11.cp_fld = 0;
				}

				if (var11.ce_fld > var11.cr_fld - var11.cd_fld) {
					var11.ce_fld = var11.cr_fld - var11.cd_fld;
				}

				if (var11.ce_fld < 0) {
					var11.ce_fld = 0;
				}

				if (var11.bx_fld == 0) {
					tb.ag(var0, var11, var7, var8, var9, 647429709);
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIZLuo;Lqg;)V"
	)
	static void an(lu[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, uo var8, qg var9) throws EOFException {
		for (int var10 = var1; var10 <= var2; var10++) {
			lu var11 = var0[var10];
			if (null != var11 && var11.cv_fld == var3 && var11.cy_fld == var4) {
				kd.ae(var11, var5, var6, var7, var8, var9, (short)-612);
				eo.ak(var11, var5, var6);
				if (var11.cp_fld > var11.cn_fld - var11.bb_fld) {
					var11.cp_fld = var11.cn_fld - var11.bb_fld;
				}

				if (var11.cp_fld * -1789510328 < 0) {
					var11.cp_fld = 0;
				}

				if (var11.ce_fld > var11.cr_fld - var11.cd_fld) {
					var11.ce_fld = var11.cr_fld - var11.cd_fld;
				}

				if (-73455234 * var11.ce_fld < 0) {
					var11.ce_fld = 0;
				}

				if (var11.bx_fld * -920743163 == 0) {
					tb.ag(var0, var11, var7, var8, var9, 317130431);
				}
			}
		}
	}

	qr() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIZLuo;Lqg;)V"
	)
	static void ai(lu var0, int var1, int var2, boolean var3, uo var4, qg var5) {
		int var6 = var0.bb_fld;
		int var7 = var0.cd_fld;
		if (var0.bi_fld == 0) {
			var0.bb_fld = var0.bw_fld * -570343163;
		} else if (1 == var0.bi_fld) {
			var0.bb_fld = var1 - var0.bw_fld;
		} else if (var0.bi_fld == 2) {
			var0.bb_fld = var0.bw_fld * var1 >> 14;
		}

		if (var0.bu_fld == 0) {
			var0.cd_fld = var0.ba_fld * 1799932419;
		} else if (1 == var0.bu_fld) {
			var0.cd_fld = 79469753 * (var2 - var0.ba_fld);
		} else if (var0.bu_fld == 2) {
			var0.cd_fld = 79469753 * (var0.ba_fld * var2 >> 14);
		}

		if (4 == var0.bi_fld) {
			var0.bb_fld = var0.cc_fld * var0.cd_fld / var0.cq_fld;
		}

		if (4 == var0.bu_fld) {
			var0.cd_fld = var0.bb_fld * var0.cq_fld / var0.cc_fld;
		}

		if (var0.bp_fld == 1337) {
			var4.aq_fld = var0;
		}

		if (var0.bx_fld == 12) {
			lu.bv(var0, -1266528949).aw(var0.bb_fld, var0.cd_fld);
		}

		if (var3 && var0.gr_fld != null && (var0.bb_fld != var6 || var7 != var0.cd_fld)) {
			yz var8 = tu.ak(var0).av((Object[])var0.gr_fld, 1493953966).ax(-747015613);
			var5.ak(var8);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIZLuo;Lqg;)V"
	)
	static void aq(lu var0, int var1, int var2, boolean var3, uo var4, qg var5) {
		int var6 = var0.bb_fld;
		int var7 = var0.cd_fld;
		if (var0.bi_fld == 0) {
			var0.bb_fld = var0.bw_fld * -570343163;
		} else if (1 == var0.bi_fld) {
			var0.bb_fld = var1 - var0.bw_fld;
		} else if (var0.bi_fld == 2) {
			var0.bb_fld = var0.bw_fld * var1 >> 14;
		}

		if (var0.bu_fld == 0) {
			var0.cd_fld = var0.ba_fld * 1799932419;
		} else if (1 == var0.bu_fld) {
			var0.cd_fld = 79469753 * (var2 - var0.ba_fld);
		} else if (var0.bu_fld == 2) {
			var0.cd_fld = 79469753 * (var0.ba_fld * var2 >> 14);
		}

		if (4 == var0.bi_fld) {
			var0.bb_fld = var0.cc_fld * var0.cd_fld / var0.cq_fld;
		}

		if (4 == var0.bu_fld) {
			var0.cd_fld = var0.bb_fld * var0.cq_fld / var0.cc_fld;
		}

		if (var0.bp_fld == 1337) {
			var4.aq_fld = var0;
		}

		if (var0.bx_fld == 12) {
			lu.bv(var0, -1335809912).aw(var0.bb_fld, var0.cd_fld);
		}

		if (var3 && var0.gr_fld != null && (var0.bb_fld != var6 || var7 != var0.cd_fld)) {
			yz var8 = tu.ak(var0).av((Object[])var0.gr_fld, 1377063349).ax(-69424334);
			var5.ak(var8);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Llu;IILuo;Lqg;)V"
	)
	public static void am(lu var0, int var1, int var2, uo var3, qg var4) throws EOFException {
		lu var7 = -1 == var0.cv_fld ? null : var3.ag(var0.cv_fld, var0.cy_fld, -1179752533);
		int var5;
		int var6;
		if (null == var7) {
			var5 = var1;
			var6 = var2;
		} else {
			var5 = var7.bb_fld;
			var6 = var7.cd_fld;
		}

		kd.ae(var0, var5, var6, false, var3, var4, (short)-13280);
		eo.ak(var0, var5, var6);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llu;IILuo;Lqg;)V"
	)
	public static void ad(lu var0, int var1, int var2, uo var3, qg var4) throws EOFException {
		lu var7 = -1 == var0.cv_fld ? null : var3.ag(var0.cv_fld, var0.cy_fld, -1355572053);
		int var5;
		int var6;
		if (null == var7) {
			var5 = var1;
			var6 = var2;
		} else {
			var5 = var7.bb_fld;
			var6 = var7.cd_fld;
		}

		kd.ae(var0, var5, var6, false, var3, var4, (short)-2801);
		eo.ak(var0, var5, var6);
	}
}
