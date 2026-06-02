import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jp")
public class jp {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Lik;IIII)I"
	)
	public static int ff(ik var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		int var5 = (1 << var3) - 1;
		int var6 = 1480549735 == var4 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = var0.be_fld[var1];
		if (var2 == (var8 & var7)) {
			return -1;
		} else {
			var8 &= ~var7;
			var0.be_fld[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void aw() {
		Iterator var1 = cz.ag_fld.iterator();

		while (var1.hasNext()) {
			co var2 = (co)(co)var1.next();
			var2.ag(-114594914);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	static void ao(int var0, int var1) throws FileNotFoundException, EOFException {
		client.zy_void(var0);
		if (56 != var0 && 57 != var0) {
			jk.af(10, (byte)35);
			jz.ac(9);
		} else {
			jk.af(11, (byte)68);
		}

		if (var0 == -3) {
			cl.ad(kh.cn_fld, kh.cr_fld, kh.ca_fld);
		} else if (-2 == var0) {
			cl.ad(kh.cg_fld, kh.cw_fld, kh.cm_fld);
		} else if (-1 == var0) {
			if (var1 <= 939878819) {
				return;
			}

			cl.ad(kh.cz_fld, kh.ck_fld, kh.cb_fld);
		} else if (3 == var0) {
			jz.ac(3);
			bn.bu_fld = 706415911;
		} else if (var0 == 4) {
			jz.ac(14);
			bn.bi_fld = 0;
		} else if (5 == var0) {
			bn.bu_fld = 1412831822;
			cl.ad(kh.cj_fld, kh.ch_fld, kh.ct_fld);
		} else if (68 == var0) {
			if (var1 <= 939878819) {
				return;
			}

			if (!client.kg_fld) {
				client.kg_fld = true;
				cb.as((byte)6);
				return;
			}

			cl.ad(kh.cl_fld, kh.dc_fld, kh.dh_fld);
		} else if (!client.gz_fld && var0 == 6) {
			cl.ad(kh.cl_fld, kh.dc_fld, kh.dh_fld);
		} else if (7 == var0) {
			cl.ad(kh.dv_fld, kh.dz_fld, kh.dt_fld);
		} else if (8 == var0) {
			if (var1 <= 939878819) {
				return;
			}

			cl.ad(kh.dm_fld, kh.dq_fld, kh.do_fld);
		} else if (var0 == 9) {
			cl.ad(kh.dd_fld, kh.dl_fld, kh.dr_fld);
		} else if (10 == var0) {
			cl.ad(kh.da_fld, kh.dk_fld, kh.dx_fld);
		} else if (var0 == 11) {
			cl.ad(kh.ds_fld, kh.du_fld, kh.db_fld);
		} else if (var0 == 12) {
			if (var1 <= 939878819) {
				return;
			}

			cl.ad(kh.dg_fld, kh.dw_fld, kh.dy_fld);
			jz.ac(34);
		} else if (var0 == 13) {
			cl.ad(kh.di_fld, kh.dn_fld, kh.df_fld);
		} else if (14 == var0) {
			cl.ad(kh.de_fld, kh.dp_fld, kh.dj_fld);
		} else if (var0 == 16) {
			cl.ad(kh.es_fld, kh.ep_fld, kh.eb_fld);
			jz.ac(33);
		} else if (var0 == 17) {
			cl.ad(kh.ed_fld, kh.et_fld, kh.ew_fld);
		} else if (18 == var0) {
			jz.ac(14);
			bn.bi_fld = 1175957993;
		} else if (19 == var0) {
			if (var1 <= 939878819) {
				return;
			}

			cl.ad(kh.ez_fld, kh.er_fld, kh.en_fld);
		} else if (var0 == 20) {
			cl.ad(kh.eg_fld, kh.ef_fld, kh.eq_fld);
		} else if (var0 == 22) {
			if (var1 <= 939878819) {
				return;
			}

			cl.ad(kh.ei_fld, kh.ee_fld, kh.ek_fld);
		} else if (var0 == 23) {
			cl.ad(kh.ea_fld, kh.ev_fld, kh.ey_fld);
		} else if (24 == var0) {
			if (var1 <= 939878819) {
				return;
			}

			cl.ad(kh.em_fld, kh.el_fld, kh.eh_fld);
		} else if (25 == var0) {
			cl.ad(kh.eu_fld, kh.ej_fld, kh.fy_fld);
		} else if (26 == var0) {
			cl.ad(kh.fa_fld, kh.fo_fld, kh.fp_fld);
		} else if (var0 == 27) {
			cl.ad(kh.fx_fld, kh.fv_fld, kh.fj_fld);
		} else if (var0 == 31) {
			cl.ad(kh.fw_fld, kh.fl_fld, kh.fg_fld);
		} else if (var0 == 32) {
			jz.ac(14);
			bn.bi_fld = -1943051310;
		} else if (var0 == 37) {
			cl.ad(kh.fq_fld, kh.fs_fld, kh.fu_fld);
		} else if (var0 == 38) {
			cl.ad(kh.fr_fld, kh.fi_fld, kh.fz_fld);
		} else if (74 == var0) {
			cl.ad(kh.ff_fld, kh.gg_fld, kh.gc_fld);
		} else if (55 == var0) {
			jz.ac(8);
		} else if (var0 == 56) {
			cl.ad(kh.gj_fld, kh.gt_fld, kh.gs_fld);
		} else if (57 == var0) {
			cl.ad(kh.gu_fld, kh.gp_fld, kh.gv_fld);
		} else if (var0 == 61) {
			if (var1 <= 939878819) {
				return;
			}

			cl.ad("", "Please enter your date of birth (DD/MM/YYYY)", "");
			jz.ac(7);
		} else if (var0 == 62) {
			cl.ad(kh.gk_fld, kh.gi_fld, kh.gq_fld);
		} else if (63 == var0) {
			cl.ad(kh.gf_fld, kh.gm_fld, kh.ga_fld);
		} else if (65 == var0 || var0 == 67) {
			cl.ad(kh.gd_fld, kh.gy_fld, kh.gz_fld);
		} else if (71 == var0) {
			jz.ac(7);
			cl.ad("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
		} else if (var0 == 73) {
			jz.ac(6);
			cl.ad(kh.ls_fld, kh.lq_fld, kh.la_fld);
		} else if (72 == var0) {
			jz.ac(32);
		} else {
			cl.ad(kh.ge_fld, kh.gw_fld, kh.gx_fld);
		}
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)V"
	)
	public static void ri(li var0, int var1) {
		var0.am_fld.ar(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ak(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	jp() throws Throwable {
		throw new Error();
	}
}
