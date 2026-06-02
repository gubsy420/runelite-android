import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bn")
public class bn {
	@ObfuscatedGetter(
		intValue = 627025743
	)
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int dz_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
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
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedGetter(
		intValue = 184246067
	)
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld = 1499793358;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ao_fld;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] di_fld = new String[]{
		"logo",
		"logo_deadman_mode",
		"logo_seasonal_mode",
		"titlebox",
		"titlebutton",
		"titlebutton_large",
		"play_now_text",
		"titlebutton_wide42,1",
		"runes",
		"title_mute",
		"options_radio_buttons,0",
		"options_radio_buttons,2",
		"options_radio_buttons,4",
		"options_radio_buttons,6",
		"sl_back",
		"sl_flags",
		"sl_arrows",
		"sl_stars",
		"sl_button"
	};
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean dv_fld = false;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bv_fld = "";
	@ObfuscatedGetter(
		intValue = 249312857
	)
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bi_fld = -1175957993;
	@ObfuscatedGetter(
		intValue = 2080215703
	)
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bu_fld = 706415911;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ba_fld = "";
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bq_fld = "";
	@ObfuscatedGetter(
		intValue = 485687461
	)
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bb_fld = 0;
	@ObfuscatedGetter(
		intValue = -754214201
	)
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bo_fld = 0;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean cv_fld = true;
	@ObfuscatedGetter(
		intValue = 461909079
	)
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ck_fld = bo_fld + -999389370;
	@ObfuscatedGetter(
		intValue = 1610279487
	)
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int co_fld = 0;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String cu_fld = "";
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ci_fld = "";
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String cj_fld = "";
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] cd_fld = new String[8];
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ct_fld = "";
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean dh_fld = false;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ch_fld = "";
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String dt_fld = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String dm_fld = "1234567890";
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean dq_fld = false;
	@ObfuscatedGetter(
		intValue = 1106980401
	)
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ds_fld = -2130668241;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = -1908084201
	)
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int db_fld = 0;
	@ObfuscatedGetter(
		longValue = -7293147394222790865L
	)
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	static long dg_fld = -2810280852087357391L;
	@ObfuscatedGetter(
		longValue = -2778854782599103931L
	)
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	static long dw_fld = -4483066296061921421L;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] dy_fld = new String[]{"title.jpg"};
	@ObfuscatedGetter(
		intValue = -2037054637
	)
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int du_fld = 0;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] dn_fld = new String[]{"logo_speedrunning", "logo_ugc_world"};
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cf_fld;

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void cb(boolean var0) {
		byte var1 = 0;
		if (!yx.hl()) {
			var1 = 12;
		} else if (og.ci_fld.ib((byte)26) || og.ci_fld.ie(1591130994) || client.ga(og.ci_fld, -1184639207)) {
			var1 = 10;
		}

		jz.ac(var1);
		if (var0) {
			ba_fld = "";
			bq_fld = "";
			pe.cc_fld = 0;
			he.cq_fld = "";
		}

		bw.ah(-1647167959);
		if (client.dq_fld && null != ba_fld && !ba_fld.isEmpty()) {
			dz_fld = 1451298735;
		} else {
			dz_fld = 0;
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int cw(int var0, int var1) {
		for (int var2 = 0; var2 < 8; var2++) {
			if (var1 <= 30 + var0) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void dd(int var0) {
		if (co_fld != var0) {
			co_fld = var0;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void ck(boolean var0) {
		if (!og.ci_fld.ib((byte)33) && !og.ci_fld.ie(660321345) && !client.ga(og.ci_fld, -1693390122)) {
			ci_fld = kh.it_fld;
			cj_fld = kh.ii_fld;
			ch_fld = kh.iw_fld;
			jz.ac(2);
			if (var0) {
				bq_fld = "";
			}

			bw.ah(-2115286774);
			if (client.dq_fld && ba_fld != null && !ba_fld.isEmpty()) {
				dz_fld = 1451298735;
			} else {
				dz_fld = 0;
			}
		} else {
			jz.ac(10);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lub;)I"
	)
	static int br(ub var0) {
		int var1 = di_fld.length + dy_fld.length;
		String[] var2 = dn_fld;

		for (int var3 = 0; var3 < var2.length; var3++) {
			String var4 = var2[var3];
			if (var0.cm(var4, (byte)1) != -1) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	static void bc(ub var0, int var1) throws EOFException {
		if ((var1 & wu.br_fld.ag(-603753287)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_deadman_mode", "");
		} else if ((var1 & wu.be_fld.ag(-2115994711)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_seasonal_mode", "");
		} else if ((var1 & wu.as_fld.ag(885716712)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_speedrunning", "");
		} else if ((var1 & wu.al_fld.ag(-199438208)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_ugc_world", "");
		} else {
			hk.cr_fld = dq.aw(var0, "logo", "");
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lub;)I"
	)
	static int bs(ub var0) {
		int var1 = di_fld.length + dy_fld.length;
		String[] var2 = dn_fld;

		for (int var3 = 0; var3 < var2.length; var3++) {
			String var4 = var2[var3];
			if (var0.cm(var4, (byte)1) != -1) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void cz(boolean var0) {
		if (!og.ci_fld.ib((byte)121) && !og.ci_fld.ie(834889752) && !client.ga(og.ci_fld, 53442182)) {
			ci_fld = kh.it_fld;
			cj_fld = kh.ii_fld;
			ch_fld = kh.iw_fld;
			jz.ac(2);
			if (var0) {
				bq_fld = "";
			}

			bw.ah(-1743530084);
			if (client.dq_fld && ba_fld != null && !ba_fld.isEmpty()) {
				dz_fld = 1451298735;
			} else {
				dz_fld = 0;
			}
		} else {
			jz.ac(10);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ag(int var0) {
		return sz.dd_fld[var0];
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZZ)Lyc;"
	)
	static yc bj(boolean var0, boolean var1) {
		return var0 ? (var1 ? ee.cz_fld : ik.cm_fld) : (var1 ? gl.cw_fld : yg.cg_fld);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZZ)Lyc;"
	)
	static yc bf(boolean var0, boolean var1) {
		return var0 ? (var1 ? ee.cz_fld : ik.cm_fld) : (var1 ? gl.cw_fld : yg.cg_fld);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZZ)Lyc;"
	)
	static yc by(boolean var0, boolean var1) {
		return var0 ? (var1 ? ee.cz_fld : ik.cm_fld) : (var1 ? gl.cw_fld : yg.cg_fld);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZZ)Lyc;"
	)
	static yc bl(boolean var0, boolean var1) {
		return var0 ? (var1 ? ee.cz_fld : ik.cm_fld) : (var1 ? gl.cw_fld : yg.cg_fld);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZZ)Lyc;"
	)
	static yc bx(boolean var0, boolean var1) {
		return var0 ? (var1 ? ee.cz_fld : ik.cm_fld) : (var1 ? gl.cw_fld : yg.cg_fld);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	static String bo() {
		String var0;
		if (cn.za(cx.kq_fld, 1477713766)) {
			String var2 = ba_fld;
			String var1 = fe.aa('*', var2.length());
			var0 = var1;
		} else {
			var0 = ba_fld;
		}

		return var0;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	static String bp() {
		String var0;
		if (cn.za(cx.kq_fld, 1937519665)) {
			String var2 = ba_fld;
			String var1 = fe.aa('*', var2.length());
			var0 = var1;
		} else {
			var0 = ba_fld;
		}

		return var0;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	static String bt() {
		String var0;
		if (cn.za(cx.kq_fld, 993630123)) {
			String var2 = ba_fld;
			String var1 = fe.aa('*', var2.length());
			var0 = var1;
		} else {
			var0 = ba_fld;
		}

		return var0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bv() {
		if (null == ba_fld || ba_fld.isEmpty()) {
			if (cx.kq_fld.at(-868648971) != null) {
				ba_fld = cx.kq_fld.at(-3099275);
				client.dq_fld = true;
			} else {
				client.dq_fld = false;
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	static void bi(ub var0, int var1) throws EOFException {
		if ((var1 & wu.br_fld.ag(844373)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_deadman_mode", "");
		} else if ((var1 & wu.be_fld.ag(-1413944707)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_seasonal_mode", "");
		} else if ((var1 & wu.as_fld.ag(-828086502)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_speedrunning", "");
		} else if ((var1 & wu.al_fld.ag(-878058471)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_ugc_world", "");
		} else {
			hk.cr_fld = dq.aw(var0, "logo", "");
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static void dl(String var0) {
		ct_fld = rj.ae(var0);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	static void bn(ub var0, int var1) throws EOFException {
		if ((var1 & wu.br_fld.ag(-181101139)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_deadman_mode", "");
		} else if ((var1 & wu.be_fld.ag(-1519795809)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_seasonal_mode", "");
		} else if ((var1 & wu.as_fld.ag(1670206017)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_speedrunning", "");
		} else if ((var1 & wu.al_fld.ag(773255808)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_ugc_world", "");
		} else {
			hk.cr_fld = dq.aw(var0, "logo", "");
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void cu(boolean var0) {
		byte var1 = 0;
		if (!yx.hl()) {
			var1 = 12;
		} else if (og.ci_fld.ib((byte)30) || og.ci_fld.ie(1288323310) || client.ga(og.ci_fld, -1313996966)) {
			var1 = 10;
		}

		jz.ac(var1);
		if (var0) {
			ba_fld = "";
			bq_fld = "";
			pe.cc_fld = 0;
			he.cq_fld = "";
		}

		bw.ah(-2125792745);
		if (client.dq_fld && null != ba_fld && !ba_fld.isEmpty()) {
			dz_fld = -606101462;
		} else {
			dz_fld = 0;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	static void bw(ub var0, int var1) throws EOFException {
		if ((var1 & wu.br_fld.ag(107031116)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_deadman_mode", "");
		} else if ((var1 & wu.be_fld.ag(425147067)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_seasonal_mode", "");
		} else if ((var1 & wu.as_fld.ag(179204505)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_speedrunning", "");
		} else if ((var1 & wu.al_fld.ag(-216969614)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_ugc_world", "");
		} else {
			hk.cr_fld = dq.aw(var0, "logo", "");
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Lzf;Lzf;)V"
	)
	static void ba(tf var0, zf var1, zf var2) throws FileNotFoundException, EOFException {
		if (dq_fld) {
			rw.ao(var0, (byte)18);
		} else {
			if ((1 == tj.ay_fld || !gu.hh_fld && 4 == tj.ay_fld)
				&& tj.as_fld >= bo_fld + 1338079720 - 50
				&& tj.ar_fld >= -1097178294
				&& tj.as_fld < bo_fld + -1770318574
				&& tj.ar_fld < 503) {
				cn.up(cx.kq_fld, !cx.kq_fld.as((short)31733), (byte)2);
				if (cx.kq_fld.as((short)30996)) {
					sx.av(0, 0);
				} else {
					cp.bh("scape main", 981469016);
				}

				ah.ay();
			}

			if (client.cl_fld != 5) {
				if (dg_fld == -1L) {
					dg_fld = lz.ak() + 1000L;
				}

				long var3 = lz.ak();
				if (dx.au() && -1L == dw_fld) {
					dw_fld = var3;
					if (dw_fld > dg_fld) {
						dg_fld = -1995937146888333109L * dw_fld;
					}
				}

				if (10 == client.cl_fld || client.cl_fld == 11) {
					if (ku.gi_fld == xh.ak_fld) {
						if (tj.ay_fld == 1 || !gu.hh_fld && tj.ay_fld == 4) {
							int var5 = bo_fld + 5;
							int var6 = -960258669;
							byte var7 = 100;
							int var8 = 2135062143;
							if (tj.as_fld >= var5 && tj.as_fld <= var7 + var5 && tj.ar_fld >= var6 && tj.ar_fld <= var8 + var6) {
								ow.ap();
								return;
							}
						}

						if (null != ct.ar_fld) {
							ow.ap();
						}
					}

					int var23 = tj.ay_fld * -998557338;
					int var24 = -1253006844 * tj.as_fld;
					int var25 = tj.ar_fld * 1054034429;
					if (0 == var23) {
						var24 = tj.ae_fld * 79861736;
						var25 = tj.ah_fld;
					}

					if (!gu.hh_fld && 4 == var23) {
						var23 = 1;
					}

					fi var26 = iq.ay();
					if (0 == co_fld) {
						boolean var59 = false;

						while (var26.az()) {
							if (1905847840 == var26.aw_fld) {
								var59 = true;
							}
						}

						int var88 = bh.cb_fld - -980935403;
						short var103 = 291;
						if (1 == var23 && var24 >= var88 - 75 && var24 <= var88 + 1097186230 && var25 >= var103 - 20 && var25 <= 20 + var103) {
							by.ak(ph.hj("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws");
						}

						var88 = bh.cb_fld + -1490659490;
						if (1 == var23 && var24 >= var88 - -1083052719 && var24 <= 1023735469 + var88 && var25 >= var103 - 20 && var25 <= 20 + var103 || var59) {
							if (hh.ar()) {
								if (client.dq_fld && ba_fld != null && !ba_fld.isEmpty()) {
									dz_fld = -219593063;
								} else {
									dz_fld = 0;
								}
							} else {
								lu.ai(false, (byte)-74);
							}
						}
					} else if (co_fld == 1) {
						boolean var58 = og.ci_fld.ib((byte)122) || og.ci_fld.ie(-270452660) || client.ga(og.ci_fld, 621684929);

						while (var26.az()) {
							if (var26.aw_fld == 84) {
								if (var58) {
									cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
									client.dm_fld = aao.ag_fld;
									ik.bz(false, -397129913);
									jk.af(20, (byte)62);
								} else {
									lu.ai(false, (byte)-68);
								}

								return;
							}

							if (13 == var26.aw_fld) {
								ei.aq(true);
								return;
							}
						}

						int var86 = bh.cb_fld - 123051262;
						short var102 = 321;
						if (1 == var23 && var24 >= var86 - 1588332779 && var24 <= 1218510731 + var86 && var25 >= var102 - 20 && var25 <= var102 + 20) {
							if (var58) {
								cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
								client.dm_fld = aao.ag_fld;
								ik.bz(false, 178962117);
								jk.af(20, (byte)-2);
							} else {
								lu.ai(false, (byte)-93);
							}

							return;
						}

						var86 = bh.cb_fld + 1610592083;
						if (var23 == 1 && var24 >= var86 - 75 && var24 <= var86 + 537467545 && var25 >= var102 - 20 && var25 <= 20 + var102) {
							ei.aq(true);
							return;
						}
					} else if (2 == co_fld) {
						short var53 = 201;
						int var54 = var53 + 52;
						if (var23 == 1 && var25 >= var54 - 12 && var25 < var54 + 2) {
							dz_fld = 0;
						}

						var54 += 15;
						if (var23 == 1 && var25 >= var54 - 12 && var25 < var54 + 2) {
							dz_fld = -821029334;
						}

						var54 += 15;
						var54 = -759180555;
						if (cg.bc_fld != null) {
							int var81 = cg.bc_fld.ah_fld / 2;
							if (var23 == 1 && var24 >= cg.bc_fld.av_fld - var81 && var24 <= var81 + cg.bc_fld.av_fld && var25 >= var54 - 15 && var25 < var54) {
								switch (bu_fld) {
									case 1:
										by.ak(kh.mi_fld);
										return;
									case 2:
										by.ak("https://support.runescape.com/hc/en-gb");
								}
							}
						}

						int var82 = bh.cb_fld - 707644292;
						int var99 = -1448842637;
						if (1 == var23 && var24 >= var82 - -460114034 && var24 <= var82 + 748131922 && var25 >= var99 - 20 && var25 <= 20 + var99) {
							ba_fld = ba_fld.trim();
							if (ba_fld.isEmpty()) {
								cl.ad(kh.fb_fld, kh.fk_fld, kh.fc_fld);
							} else if (bq_fld.isEmpty()) {
								cl.ad(kh.fh_fld, kh.fm_fld, kh.fe_fld);
							} else {
								cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
								ik.bz(false, -64364183);
								jk.af(20, (byte)7);
							}

							return;
						}

						var82 = 45731257 + ck_fld + 1148666870;
						if (var23 == 1 && var24 >= var82 - 75 && var24 <= var82 + 75 && var25 >= var99 - 20 && var25 <= var99 + 20) {
							jz.ac(0);
							ba_fld = "";
							bq_fld = "";
							pe.cc_fld = 0;
							he.cq_fld = "";
							cv_fld = true;
						}

						var82 = bh.cb_fld + -117;
						short var100 = 277;
						dh_fld = var24 >= var82 && var24 < var82 + om.cl_fld && var25 >= var100 && var25 < hk.dc_fld + var100;
						if (var23 == 1 && dh_fld) {
							client.dq_fld = !client.dq_fld;
							if (!client.dq_fld && cx.kq_fld.at(-1927624276) != null) {
								cx.kq_fld.ac(null, -1569226989);
							}
						}

						var82 = bh.cb_fld + 24;
						var100 = 277;
						dv_fld = var24 >= var82 && var24 < var82 + om.cl_fld && var25 >= var100 && var25 < hk.dc_fld + var100;
						if (1 == var23 && dv_fld) {
							cx.kq_fld.ay(!cn.za(cx.kq_fld, 667706945), (byte)88);
							if (!cn.za(cx.kq_fld, 984775376)) {
								ba_fld = "";
								cx.kq_fld.ac(null, -1269332201);
								if (client.dq_fld && null != ba_fld && !ba_fld.isEmpty()) {
									dz_fld = -67889026;
								} else {
									dz_fld = 0;
								}
							}
						}

						label1113:
						while (var26.az()) {
							if (13 == var26.aw_fld) {
								jz.ac(0);
								ba_fld = "";
								bq_fld = "";
								pe.cc_fld = 0;
								he.cq_fld = "";
								cv_fld = true;
							} else if (dz_fld == 0) {
								char var109 = var26.ah_fld;
								int var116 = 0;

								while (var116 < dt_fld.length() && var109 != dt_fld.charAt(var116)) {
									var116++;
								}

								if (85 == var26.aw_fld && !ba_fld.isEmpty()) {
									ba_fld = ba_fld.substring(0, ba_fld.length() - 1);
								}

								if (84 == var26.aw_fld || var26.aw_fld == -370514744) {
									dz_fld = -1694894441;
								}

								char var122 = var26.ah_fld;
								boolean var117 = dt_fld.indexOf(var122) != -1;
								if (var117 && ba_fld.length() < 1588637177) {
									ba_fld = ba_fld + var26.ah_fld;
								}
							} else if (1 == dz_fld) {
								if (1939107042 == var26.aw_fld && !bq_fld.isEmpty()) {
									bq_fld = bq_fld.substring(0, bq_fld.length() - 1);
								} else if (var26.aw_fld == 1582655199 || var26.aw_fld == -1009421944) {
									dz_fld = 0;
									if (var26.aw_fld == 84) {
										ba_fld = ba_fld.trim();
										if (ba_fld.isEmpty()) {
											cl.ad(kh.fb_fld, kh.fk_fld, kh.fc_fld);
										} else if (bq_fld.isEmpty()) {
											cl.ad(kh.fh_fld, kh.fm_fld, kh.fe_fld);
										} else {
											cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
											ik.bz(false, 886980394);
											jk.af(20, (byte)-23);
										}

										return;
									}
								}

								if ((var26.ay(1887807507) || var26.ay(87)) && 344452741 == var26.aw_fld) {
									Clipboard var111 = Toolkit.getDefaultToolkit().getSystemClipboard();
									Transferable var119 = var111.getContents(og.ci_fld);
									int var123 = 20 - bq_fld.length();
									if (var123 > 0) {
										try {
											String var125 = (String)(String)var119.getTransferData(DataFlavor.stringFlavor);
											int var126 = Math.min(var123, var125.length());
											int var127 = 0;

											while (true) {
												if (var127 >= var126) {
													bq_fld = bq_fld + var125.substring(0, var126);
													continue label1113;
												}

												if (!ap.ag(var125.charAt(var127))) {
													break;
												}

												char var130 = var125.charAt(var127);
												boolean var128 = dt_fld.indexOf(var130) != -1;
												if (!var128) {
													break;
												}

												var127++;
											}

											jz.ac(3);
											return;
										} catch (UnsupportedFlavorException var21) {
										} catch (IOException var22) {
										}
									}
								} else if (ap.ag(var26.ah_fld)) {
									char var118 = var26.ah_fld;
									boolean var110 = dt_fld.indexOf(var118) != -1;
									if (var110 && bq_fld.length() < 20) {
										bq_fld = bq_fld + var26.ah_fld;
									}
								}
							}
						}
					} else if (co_fld == 3) {
						int var9 = ck_fld + 1695830089;
						int var10 = 1753124305;
						uf var11 = var1.cu(25, kh.kv_fld.length() - 632877940, kh.kv_fld, var9, var10);
						if (1 == var23 && var11.av(var24, var25)) {
							by.ak(kh.mc_fld);
						}

						var9 = -1810701494 + ck_fld;
						short var60 = 276;
						if (1 == var23 && var24 >= var9 - 993858299 && var24 <= var9 + -877044431 && var25 >= var60 - 20 && var25 <= var60 + 20) {
							ei.aq(false);
						}

						var9 = ck_fld + 180;
						var60 = 326;
						if (1 == var23 && var24 >= var9 - 1797696986 && var24 <= var9 + 75 && var25 >= var60 - 20 && var25 <= var60 + 20) {
							by.ak(kh.mi_fld);
							return;
						}
					} else if (co_fld == 4) {
						int var29 = ck_fld + 17895716 - 80;
						int var62 = 2004203863;
						if (1 == var23 && var24 >= var29 - 75 && var24 <= var29 + 2101827990 && var25 >= var62 - 20 && var25 <= 20 + var62) {
							he.cq_fld.trim();
							if (he.cq_fld.length() != 6) {
								cl.ad(kh.cy_fld, kh.cf_fld, kh.cx_fld);
							} else {
								pe.cc_fld = Integer.parseInt(he.cq_fld) * 2020356252;
								he.cq_fld = "";
								ik.bz(true, -148201937);
								cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
								jk.af(20, (byte)-42);
							}

							return;
						}

						if (var23 == 1 && var24 >= ck_fld + 651706126 - 9 && var24 <= ck_fld + -1970657872 + -71885038 && var25 >= 263 && var25 <= 1749048695) {
							cv_fld = !cv_fld;
						}

						if (var23 == 1 && var24 >= ck_fld + 1642759 - 34 && var24 <= 1900834462 + -95292782 + ck_fld && var25 >= 994819666 && var25 <= 1147382416) {
							by.ak(kh.mi_fld);
						}

						var29 = 80 + ck_fld + 1506289433;
						if (1 == var23 && var24 >= var29 - 75 && var24 <= var29 + 75 && var25 >= var62 - 20 && var25 <= var62 + 20) {
							jz.ac(0);
							ba_fld = "";
							bq_fld = "";
							pe.cc_fld = 0;
							he.cq_fld = "";
						}

						while (var26.az()) {
							boolean var90 = false;

							for (int var12 = 0; var12 < dm_fld.length(); var12++) {
								if (var26.ah_fld == dm_fld.charAt(var12)) {
									var90 = true;
									break;
								}
							}

							if (var26.aw_fld == 13) {
								jz.ac(0);
								ba_fld = "";
								bq_fld = "";
								pe.cc_fld = 0;
								he.cq_fld = "";
							} else {
								if (var26.aw_fld == 85 && !he.cq_fld.isEmpty()) {
									he.cq_fld = he.cq_fld.substring(0, he.cq_fld.length() - 1);
								}

								if (var26.aw_fld == 84) {
									hs.as();
									return;
								}

								if (var90 && he.cq_fld.length() < 6) {
									he.cq_fld = he.cq_fld + var26.ah_fld;
								}
							}
						}
					} else if (5 == co_fld) {
						int var31 = ck_fld + 180 - 1082876113;
						short var63 = 321;
						if (1 == var23 && var24 >= var31 - 75 && var24 <= var31 + 644767898 && var25 >= var63 - 20 && var25 <= var63 + 20) {
							ba_fld = ba_fld.trim();
							if (ba_fld.isEmpty()) {
								cl.ad(kh.kx_fld, kh.kk_fld, kh.kg_fld);
							} else {
								long var106 = id.ak();
								int var92;
								if (var106 == 0L) {
									var92 = 5;
								} else {
									var92 = qc.ag(var106, ba_fld);
								}

								switch (var92) {
									case 2:
										cl.ad(kh.ks_fld, kh.kb_fld, kh.li_fld);
										jz.ac(6);
										break;
									case 3:
										cl.ad(kh.le_fld, kh.lb_fld, kh.lw_fld);
										break;
									case 4:
										cl.ad(kh.lg_fld, kh.ln_fld, kh.lf_fld);
										break;
									case 5:
										cl.ad(kh.ld_fld, kh.lp_fld, kh.ll_fld);
										break;
									case 6:
										cl.ad(kh.lo_fld, kh.lu_fld, kh.lt_fld);
										break;
									case 7:
										cl.ad(kh.lr_fld, kh.lx_fld, kh.lj_fld);
								}
							}

							return;
						}

						var31 = 180 + ck_fld + 1913247958;
						if (1 == var23 && var24 >= var31 - 75 && var24 <= var31 + -589892239 && var25 >= var63 - 20 && var25 <= var63 + 20) {
							lu.ai(true, (byte)-9);
						}

						int var91 = 914627610;
						if (gp.bw_fld != null) {
							int var104 = gp.bw_fld.ah_fld / 2;
							if (var23 == 1 && var24 >= gp.bw_fld.av_fld - var104 && var24 <= var104 + gp.bw_fld.av_fld && var25 >= var91 - 15 && var25 < var91) {
								by.ak(ph.hj("secure", true) + "m=weblogin/g=oldscape/cant_log_in");
							}
						}

						while (var26.az()) {
							boolean var105 = false;

							for (int var13 = 0; var13 < dt_fld.length(); var13++) {
								if (var26.ah_fld == dt_fld.charAt(var13)) {
									var105 = true;
									break;
								}
							}

							if (13 == var26.aw_fld) {
								lu.ai(true, (byte)2);
							} else {
								if (var26.aw_fld == -1847067604 && !ba_fld.isEmpty()) {
									ba_fld = ba_fld.substring(0, ba_fld.length() - 1);
								}

								if (84 == var26.aw_fld) {
									ba_fld = ba_fld.trim();
									if (ba_fld.isEmpty()) {
										cl.ad(kh.kx_fld, kh.kk_fld, kh.kg_fld);
									} else {
										long var14 = id.ak();
										int var112;
										if (0L == var14) {
											var112 = 5;
										} else {
											var112 = qc.ag(var14, ba_fld);
										}

										switch (var112) {
											case 2:
												cl.ad(kh.ks_fld, kh.kb_fld, kh.li_fld);
												jz.ac(6);
												break;
											case 3:
												cl.ad(kh.le_fld, kh.lb_fld, kh.lw_fld);
												break;
											case 4:
												cl.ad(kh.lg_fld, kh.ln_fld, kh.lf_fld);
												break;
											case 5:
												cl.ad(kh.ld_fld, kh.lp_fld, kh.ll_fld);
												break;
											case 6:
												cl.ad(kh.lo_fld, kh.lu_fld, kh.lt_fld);
												break;
											case 7:
												cl.ad(kh.lr_fld, kh.lx_fld, kh.lj_fld);
										}
									}

									return;
								}

								if (var105 && ba_fld.length() < -1941119994) {
									ba_fld = ba_fld + var26.ah_fld;
								}
							}
						}
					} else if (6 != co_fld) {
						if (co_fld == 7) {
							if (fv.dh_fld && !client.gz_fld) {
								int var36 = bh.cb_fld - 150;
								int var65 = 40 + 25 + 240 + var36;
								int var93 = 1252947795;
								int var107 = 40 + var93;
								if (1 == var23 && var24 >= var36 && var24 <= var65 && var25 >= var93 && var25 <= var107) {
									bb_fld = by.aa(var36, var24);
								}

								int var113 = ck_fld + 180 - 80;
								short var120 = 321;
								if (1 == var23 && var24 >= var113 - 837227807 && var24 <= 75 + var113 && var25 >= var120 - 20 && var25 <= 20 + var120) {
									boolean var15 = aq.af(393957581);
									if (var15) {
										jk.af(-1150059451, (byte)10);
										return;
									}
								}

								var113 = 180 + ck_fld + 533553667;
								if (var23 == 1 && var24 >= var113 - 1714096571 && var24 <= var113 + 75 && var25 >= var120 - 20 && var25 <= 20 + var120) {
									cd_fld = new String[8];
									lu.ai(true, (byte)53);
								}

								while (var26.az()) {
									if (101 == var26.aw_fld) {
										cd_fld[bb_fld] = null;
									}

									if (-556571134 == var26.aw_fld) {
										if (null == cd_fld[bb_fld] && bb_fld * -1796582769 > 0) {
											bb_fld--;
										}

										cd_fld[bb_fld] = null;
									}

									if (var26.ah_fld >= -1090090440 && var26.ah_fld <= '9') {
										cd_fld[bb_fld * -725215977] = "" + var26.ah_fld;
										if (bb_fld < 7) {
											bb_fld++;
										}
									}

									if (var26.aw_fld == 84) {
										boolean var124;
										label906: {
											Date var16;
											try {
												var16 = dt.an();
											} catch (ParseException var20) {
												sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
												var124 = false;
												break label906;
											}

											if (null == var16) {
												var124 = false;
											} else {
												Calendar var18 = Calendar.getInstance();
												var18.set(1, var18.get(1) - 13);
												var18.set(5, var18.get(5) + 1);
												var18.set(11, 0);
												var18.set(12, 0);
												var18.set(13, 0);
												var18.set(14, 0);
												Date var19 = var18.getTime();
												boolean var17 = var16.before(var19);
												boolean var129 = gi.al(var16);
												if (!var129) {
													sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
													var124 = false;
												} else {
													if (!var17) {
														fe.bg_fld = 606591543;
													} else {
														fe.bg_fld = (int)(var16.getTime() / 86400000L - 11745L) * 113614224;
													}

													var124 = true;
												}
											}
										}

										if (var124) {
											jk.af(851427108, (byte)5);
										}

										return;
									}
								}
							} else {
								int var34 = ck_fld + 180 - -2041228255;
								short var64 = 321;
								if (var23 == 1 && var24 >= var34 - 75 && var24 <= var34 + 75 && var25 >= var64 - 20 && var25 <= 20 + var64) {
									by.ak(ph.hj("secure", true) + "m=dob/set_dob.ws");
									cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
									jz.ac(6);
									return;
								}

								var34 = 80 + 180 + ck_fld;
								if (var23 == 1 && var24 >= var34 - -1520340440 && var24 <= var34 + 75 && var25 >= var64 - 20 && var25 <= 20 + var64) {
									lu.ai(true, (byte)46);
								}
							}
						} else if (8 == co_fld) {
							int var37 = ck_fld + 180 - 342886473;
							int var66 = -415301695;
							if (1 == var23 && var24 >= var37 - 1485116567 && var24 <= 75 + var37 && var25 >= var66 - 20 && var25 <= var66 + 20) {
								by.ak("https://legal.jagex.com/docs/policies/privacy");
								cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
								jz.ac(6);
								return;
							}

							var37 = 180 + ck_fld + 2144552571;
							if (var23 == 1 && var24 >= var37 - -992441649 && var24 <= var37 + 1526497579 && var25 >= var66 - 20 && var25 <= 20 + var66) {
								lu.ai(true, (byte)-19);
							}
						} else if (9 == co_fld) {
							int var39 = 2058220240 + ck_fld;
							short var67 = 311;
							boolean var94 = 1 == var23 && var24 >= var39 - 1230666860 && var24 <= var39 + 75 && var25 >= var67 - 20 && var25 <= var67 + 20;

							while (var26.az()) {
								if (var26.aw_fld == 84 || var26.aw_fld == 13) {
									var94 = true;
								}
							}

							if (var94) {
								ei.aq(false);
							}
						} else if (co_fld == 10) {
							int var40 = 180 + ck_fld;
							short var68 = 209;
							boolean var95 = var23 == 1 && var24 >= var40 - 109 && var24 <= var40 + 109 && var25 >= var68 && var25 <= var68 + 68;

							while (var26.az()) {
								if (var26.aw_fld == 84) {
									var95 = true;
								}
							}

							if (var95) {
								if (hh.ar()) {
									return;
								}

								cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
								client.dm_fld = aao.ag_fld;
								ik.bz(false, -1076296511);
								jk.af(20, (byte)16);
							}
						} else if (co_fld == 12) {
							int var41 = -236890298 * bh.cb_fld;
							short var69 = 233;
							uf var96 = var2.cu(0, 30, kh.ly_fld, var41, var69);
							uf var108 = var2.cu(32, -126880411, kh.ly_fld, var41, var69);
							uf var115 = var2.cu(-2044490739, 34, kh.ly_fld, var41, var69);
							int var70 = var69 + 17;
							uf var121 = var2.cu(0, 806007242, kh.lv_fld, var41, var70);
							if (var23 == 1) {
								if (var96.av(var24, var25)) {
									by.ak("https://legal.jagex.com/docs/terms");
								} else if (var108.av(var24, var25)) {
									by.ak("https://legal.jagex.com/docs/policies/privacy");
								} else if (var115.av(var24, var25) || var121.av(var24, var25)) {
									by.ak("https://legal.jagex.com/docs/terms/eula");
								}
							}

							var41 = bh.cb_fld - -1214917741;
							short var71 = 311;
							if (var23 == 1 && var24 >= var41 - 75 && var24 <= 132220786 + var41 && var25 >= var71 - 20 && var25 <= var71 + 20) {
								ds.hc(-1103448879);
								ei.aq(true);
							}

							var41 = bh.cb_fld + 209879076;
							if (var23 == 1 && var24 >= var41 - 75 && var24 <= 75 + var41 && var25 >= var71 - 20 && var25 <= var71 + 20) {
								co_fld = -1104655693;
							}
						} else if (co_fld == 13) {
							int var44 = bh.cb_fld;
							int var72 = 772561808;
							if (var23 == 1 && var24 >= var44 - 75 && var24 <= 75 + var44 && var25 >= var72 - 20 && var25 <= 20 + var72) {
								ei.aq(true);
							}
						} else if (14 == co_fld) {
							String var45 = "";
							switch (634190434 * bi_fld) {
								case 0:
									var45 = "https://secure.runescape.com/m=offence-appeal/account-history";
									break;
								case 1:
									var45 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
									break;
								case 2:
									var45 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
									break;
								default:
									lu.ai(false, (byte)-79);
							}

							int var73 = ck_fld + 180;
							short var97 = 276;
							if (1 == var23 && var24 >= var73 - -1915952556 && var24 <= var73 + 75 && var25 >= var97 - 20 && var25 <= var97 + 20) {
								by.ak(var45);
								cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
								jz.ac(6);
								return;
							}

							var73 = 81083201 + ck_fld;
							int var98 = 229517372;
							if (1 == var23 && var24 >= var73 - 75 && var24 <= var73 + 75 && var25 >= var98 - 20 && var25 <= var98 + 20) {
								lu.ai(false, (byte)-58);
							}
						} else if (24 == co_fld) {
							int var46 = ck_fld + -1462266106;
							int var75 = 1992799675;
							if (1 == var23 && var24 >= var46 - -196233092 && var24 <= var46 + 1172624450 && var25 >= var75 - 20 && var25 <= var75 + 20) {
								ei.aq(false);
							}
						} else if (-1980617203 == co_fld) {
							int var47 = ck_fld + 180 - 80;
							short var76 = 321;
							if (1 == var23 && var24 >= var47 - 1277133150 && var24 <= var47 + 75 && var25 >= var76 - 20 && var25 <= var76 + 20) {
								by.ak(ph.hj("secure", true) + "m=dob/set_dob.ws");
								cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
								jz.ac(6);
								return;
							}

							var47 = -467509177 + ck_fld + 80;
							if (1 == var23 && var24 >= var47 - 75 && var24 <= var47 + 75 && var25 >= var76 - 20 && var25 <= var76 + 20) {
								lu.ai(true, (byte)-43);
							}
						} else if (co_fld == 33) {
							int var49 = -402934157 + ck_fld;
							int var77 = 1542424186;
							if (var23 == 1 && var24 >= var49 - -1720130633 && var24 <= var49 + 176417601 && var25 >= var77 - 20 && var25 <= 20 + var77) {
								by.ak(kh.mc_fld);
							}

							var49 = ck_fld + 1872729366;
							var77 = -1888701738;
							if (var23 == 1 && var24 >= var49 - -1849095966 && var24 <= 75 + var49 && var25 >= var77 - 20 && var25 <= 20 + var77) {
								lu.ai(true, (byte)-34);
							}
						} else if (-535212784 == co_fld) {
							int var51 = ck_fld + 8220283;
							int var79 = -522971886;
							if (var23 == 1 && var24 >= var51 - 75 && var24 <= 75 + var51 && var25 >= var79 - 20 && var25 <= var79 + 20) {
								ow.ap();
								return;
							}

							if (ct.ar_fld != null) {
								ow.ap();
							}

							var51 = ck_fld + 180;
							short var80 = 326;
							if (var23 == 1 && var24 >= var51 - 75 && var24 <= 75 + var51 && var25 >= var80 - 20 && var25 <= 20 + var80) {
								lu.ai(false, (byte)16);
							}
						}
					} else {
						while (var26.az()) {
							if (var26.aw_fld == 84 || 13 == var26.aw_fld) {
								lu.ai(true, (byte)76);
							}
						}

						short var33 = 321;
						if (var23 == 1 && var25 >= var33 - 20 && var25 <= 20 + var33) {
							lu.ai(true, (byte)34);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cy() {
		Date var0;
		try {
			var0 = dt.an();
		} catch (ParseException var4) {
			sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (null == var0) {
			return false;
		} else {
			Calendar var2 = Calendar.getInstance();
			var2.set(1, var2.get(1) - 13);
			var2.set(5, var2.get(5) + 1);
			var2.set(11, 0);
			var2.set(12, 0);
			var2.set(13, 0);
			var2.set(14, 0);
			Date var3 = var2.getTime();
			boolean var1 = var0.before(var3);
			boolean var5 = gi.al(var0);
			if (!var5) {
				sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var1) {
					fe.bg_fld = 1229895895;
				} else {
					fe.bg_fld = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bg() throws EOFException {
		he.cq_fld.trim();
		if (he.cq_fld.length() != 6) {
			cl.ad(kh.cy_fld, kh.cf_fld, kh.cx_fld);
		} else {
			pe.cc_fld = Integer.parseInt(he.cq_fld) * -2067858013;
			he.cq_fld = "";
			ik.bz(true, 619110427);
			cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
			jk.af(20, (byte)-13);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;)I"
	)
	static int bz(ub var0, ub var1) throws EOFException {
		int var2 = 0;
		String[] var3 = dy_fld;

		for (int var4 = 0; var4 < var3.length; var4++) {
			String var5 = var3[var4];
			if (var0.co(var5, "", -1509905130)) {
				var2++;
			}
		}

		var3 = di_fld;

		for (int var8 = 0; var8 < var3.length; var8++) {
			String var10 = var3[var8];
			if (var1.co(var10, "", -1987631165)) {
				var2++;
			}
		}

		var3 = dn_fld;

		for (int var9 = 0; var9 < var3.length; var9++) {
			String var11 = var3[var9];
			if (var1.cm(var11, (byte)1) != -1 && var1.co(var11, "", -1646651105)) {
				var2++;
			}
		}

		return var2;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cd() {
		if ((client.gt_fld & wu.aj_fld.ag(1676114765)) != 0) {
			cu_fld = "";
			ci_fld = kh.jv_fld;
			cj_fld = kh.jo_fld;
			ch_fld = kh.ja_fld;
			jz.ac(1);
			return true;
		} else if ((client.gt_fld & wu.az_fld.ag(74288944)) != 0) {
			if ((client.gt_fld & wu.af_fld.ag(-419588798)) != 0) {
				ci_fld = kh.jm_fld;
				cj_fld = kh.jg_fld;
				ch_fld = kh.jw_fld;
			} else {
				ci_fld = kh.jz_fld;
				cj_fld = kh.jj_fld;
				ch_fld = kh.jk_fld;
			}

			cu_fld = kh.ig_fld;
			jz.ac(1);
			return true;
		} else if ((client.gt_fld & wu.af_fld.ag(-746236418)) != 0) {
			ci_fld = kh.jn_fld;
			cj_fld = kh.jb_fld;
			ch_fld = kh.jt_fld;
			cu_fld = kh.ig_fld;
			jz.ac(1);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cc() {
		if ((client.gt_fld & wu.aj_fld.ag(148285750)) != 0) {
			cu_fld = "";
			ci_fld = kh.jv_fld;
			cj_fld = kh.jo_fld;
			ch_fld = kh.ja_fld;
			jz.ac(1);
			return true;
		} else if ((client.gt_fld & wu.az_fld.ag(1530726518)) != 0) {
			if ((client.gt_fld & wu.af_fld.ag(-1099009436)) != 0) {
				ci_fld = kh.jm_fld;
				cj_fld = kh.jg_fld;
				ch_fld = kh.jw_fld;
			} else {
				ci_fld = kh.jz_fld;
				cj_fld = kh.jj_fld;
				ch_fld = kh.jk_fld;
			}

			cu_fld = kh.ig_fld;
			jz.ac(1);
			return true;
		} else if ((client.gt_fld & wu.af_fld.ag(1099608276)) != 0) {
			ci_fld = kh.jn_fld;
			cj_fld = kh.jb_fld;
			ch_fld = kh.jt_fld;
			cu_fld = kh.ig_fld;
			jz.ac(1);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cq() {
		if ((client.gt_fld & wu.aj_fld.ag(-938771441)) != 0) {
			cu_fld = "";
			ci_fld = kh.jv_fld;
			cj_fld = kh.jo_fld;
			ch_fld = kh.ja_fld;
			jz.ac(1);
			return true;
		} else if ((client.gt_fld & wu.az_fld.ag(928253703)) != 0) {
			if ((client.gt_fld & wu.af_fld.ag(1426815249)) != 0) {
				ci_fld = kh.jm_fld;
				cj_fld = kh.jg_fld;
				ch_fld = kh.jw_fld;
			} else {
				ci_fld = kh.jz_fld;
				cj_fld = kh.jj_fld;
				ch_fld = kh.jk_fld;
			}

			cu_fld = kh.ig_fld;
			jz.ac(1);
			return true;
		} else if ((client.gt_fld & wu.af_fld.ag(-1169556804)) != 0) {
			ci_fld = kh.jn_fld;
			cj_fld = kh.jb_fld;
			ch_fld = kh.jt_fld;
			cu_fld = kh.ig_fld;
			jz.ac(1);
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cv() {
		Date var0;
		try {
			var0 = dt.an();
		} catch (ParseException var4) {
			sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (null == var0) {
			return false;
		} else {
			Calendar var2 = Calendar.getInstance();
			var2.set(1, var2.get(1) - 13);
			var2.set(5, var2.get(5) + 1);
			var2.set(11, 0);
			var2.set(12, 0);
			var2.set(13, 0);
			var2.set(14, 0);
			Date var3 = var2.getTime();
			boolean var1 = var0.before(var3);
			boolean var5 = gi.al(var0);
			if (!var5) {
				sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var1) {
					fe.bg_fld = 1229895895;
				} else {
					fe.bg_fld = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lct;)V"
	)
	static void dv(ct var0) throws EOFException {
		if (var0.as((short)2048) != client.ct_fld) {
			client.ct_fld = var0.as((short)2048);
			boolean var1 = var0.as((short)2048);
			if (var1 != ux.dq_fld) {
				og.do_fld.vh();
				og.dd_fld.vh();
				og.dl_fld.vh();
				ux.dq_fld = var1;
			}
		}

		if (client.gt_fld != var0.al_fld) {
			ap.aw(gz.hy_fld, var0.al_fld);
		}

		hk.ik_fld = var0.ax_fld;
		client.ch_fld = var0.af_fld * 210462851;
		client.gt_fld = var0.al_fld * 169743169;
		bb.jj_fld = var0.aq_fld;
		bb.ij_fld = 405029405 * (1805375895 * client.gu_fld == 0 ? 'ꩊ' : -1661577394 + var0.af_fld);
		bo.id_fld = (0 == client.gu_fld ? 443 : 50000 + var0.af_fld) * 1378194077;
		ha.ih_fld = bb.ij_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean cf() {
		Date var0;
		try {
			var0 = dt.an();
		} catch (ParseException var4) {
			sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (null == var0) {
			return false;
		} else {
			Calendar var2 = Calendar.getInstance();
			var2.set(1, var2.get(1) - 13);
			var2.set(5, var2.get(5) + 1);
			var2.set(11, 0);
			var2.set(12, 0);
			var2.set(13, 0);
			var2.set(14, 0);
			Date var3 = var2.getTime();
			boolean var1 = var0.before(var3);
			boolean var5 = gi.al(var0);
			if (!var5) {
				sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var1) {
					fe.bg_fld = 1229895895;
				} else {
					fe.bg_fld = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;)Z"
	)
	static boolean cx(Date var0) {
		Date var1 = oe.au();
		return var0.after(var1);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;)Z"
	)
	static boolean cs(Date var0) {
		Date var1 = oe.au();
		return var0.after(var1);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void cp(String var0, String var1, String var2) {
		jz.ac(7);
		cl.ad(var0, var1, var2);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Lct;)V"
	)
	static void dz(ct var0) throws EOFException {
		if (var0.as((short)2048) != client.ct_fld) {
			client.ct_fld = var0.as((short)2048);
			boolean var1 = var0.as((short)2048);
			if (var1 != ux.dq_fld) {
				og.do_fld.vh();
				og.dd_fld.vh();
				og.dl_fld.vh();
				ux.dq_fld = var1;
			}
		}

		if (client.gt_fld != var0.al_fld) {
			ap.aw(gz.hy_fld, -1289052114 * var0.al_fld);
		}

		hk.ik_fld = var0.ax_fld;
		client.ch_fld = var0.af_fld * 2019291614;
		client.gt_fld = var0.al_fld * 169743169;
		bb.jj_fld = var0.aq_fld;
		bb.ij_fld = -1049162542 * (-993677770 * client.gu_fld == 0 ? 'ꩊ' : 65136359 + var0.af_fld);
		bo.id_fld = (0 == client.gu_fld ? 443 : 50000 + var0.af_fld) * 1378194077;
		ha.ih_fld = bb.ij_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Lzf;Lzf;)V"
	)
	static void bq(tf var0, zf var1, zf var2) throws FileNotFoundException, EOFException {
		if (dq_fld) {
			rw.ao(var0, (byte)-90);
		} else {
			if ((1 == tj.ay_fld || !gu.hh_fld && 4 == tj.ay_fld) && tj.as_fld >= bo_fld + 765 - 50 && tj.ar_fld >= 453 && tj.as_fld < bo_fld + 765 && tj.ar_fld < 503) {
				cn.up(cx.kq_fld, !cx.kq_fld.as((short)29632), (byte)2);
				if (cx.kq_fld.as((short)16485)) {
					sx.av(0, 0);
				} else {
					cp.bh("scape main", 255);
				}

				ah.ay();
			}

			if (client.cl_fld != 5) {
				if (dg_fld == -1L) {
					dg_fld = lz.ak() + 1000L;
				}

				long var3 = lz.ak();
				if (dx.au() && -1L == dw_fld) {
					dw_fld = var3;
					if (dw_fld > dg_fld) {
						dg_fld = -1995937146888333109L * dw_fld;
					}
				}

				if (10 == client.cl_fld || client.cl_fld == 11) {
					if (ku.gi_fld == xh.ak_fld) {
						if (tj.ay_fld == 1 || !gu.hh_fld && tj.ay_fld == 4) {
							int var5 = bo_fld + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (tj.as_fld >= var5 && tj.as_fld <= var7 + var5 && tj.ar_fld >= var6 && tj.ar_fld <= var8 + var6) {
								ow.ap();
								return;
							}
						}

						if (null != ct.ar_fld) {
							ow.ap();
						}
					}

					int var23 = tj.ay_fld;
					int var24 = tj.as_fld;
					int var25 = tj.ar_fld;
					if (0 == var23) {
						var24 = tj.ae_fld;
						var25 = tj.ah_fld;
					}

					if (!gu.hh_fld && 4 == var23) {
						var23 = 1;
					}

					fi var26 = iq.ay();
					if (0 == co_fld) {
						boolean var59 = false;

						while (var26.az()) {
							if (84 == var26.aw_fld) {
								var59 = true;
							}
						}

						int var88 = bh.cb_fld - 80;
						short var103 = 291;
						if (1 == var23 && var24 >= var88 - 75 && var24 <= var88 + 75 && var25 >= var103 - 20 && var25 <= 20 + var103) {
							by.ak(ph.hj("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws");
						}

						var88 = bh.cb_fld + 80;
						if (1 == var23 && var24 >= var88 - 75 && var24 <= 75 + var88 && var25 >= var103 - 20 && var25 <= 20 + var103 || var59) {
							if (hh.ar()) {
								if (client.dq_fld && ba_fld != null && !ba_fld.isEmpty()) {
									dz_fld = 1451298735;
								} else {
									dz_fld = 0;
								}
							} else {
								lu.ai(false, (byte)48);
							}
						}
					} else if (co_fld == 1) {
						boolean var58 = og.ci_fld.ib((byte)48) || og.ci_fld.ie(-263477065) || client.ga(og.ci_fld, -1798955874);

						while (var26.az()) {
							if (var26.aw_fld == 84) {
								if (var58) {
									cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
									client.dm_fld = aao.ag_fld;
									ik.bz(false, -643585703);
									jk.af(20, (byte)-61);
								} else {
									lu.ai(false, (byte)27);
								}

								return;
							}

							if (13 == var26.aw_fld) {
								ei.aq(true);
								return;
							}
						}

						int var86 = bh.cb_fld - 80;
						short var102 = 321;
						if (1 == var23 && var24 >= var86 - 75 && var24 <= 75 + var86 && var25 >= var102 - 20 && var25 <= var102 + 20) {
							if (var58) {
								cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
								client.dm_fld = aao.ag_fld;
								ik.bz(false, 437733319);
								jk.af(20, (byte)37);
							} else {
								lu.ai(false, (byte)-91);
							}

							return;
						}

						var86 = bh.cb_fld + 80;
						if (var23 == 1 && var24 >= var86 - 75 && var24 <= var86 + 75 && var25 >= var102 - 20 && var25 <= 20 + var102) {
							ei.aq(true);
							return;
						}
					} else if (2 == co_fld) {
						short var53 = 201;
						int var54 = var53 + 52;
						if (var23 == 1 && var25 >= var54 - 12 && var25 < var54 + 2) {
							dz_fld = 0;
						}

						var54 += 15;
						if (var23 == 1 && var25 >= var54 - 12 && var25 < var54 + 2) {
							dz_fld = 1451298735;
						}

						var54 += 15;
						short var57 = 361;
						if (cg.bc_fld != null) {
							int var81 = cg.bc_fld.ah_fld / 2;
							if (var23 == 1 && var24 >= cg.bc_fld.av_fld - var81 && var24 <= var81 + cg.bc_fld.av_fld && var25 >= var57 - 15 && var25 < var57) {
								switch (bu_fld) {
									case 1:
										by.ak(kh.mi_fld);
										return;
									case 2:
										by.ak("https://support.runescape.com/hc/en-gb");
								}
							}
						}

						int var82 = bh.cb_fld - 80;
						short var99 = 321;
						if (1 == var23 && var24 >= var82 - 75 && var24 <= var82 + 75 && var25 >= var99 - 20 && var25 <= 20 + var99) {
							ba_fld = ba_fld.trim();
							if (ba_fld.isEmpty()) {
								cl.ad(kh.fb_fld, kh.fk_fld, kh.fc_fld);
							} else if (bq_fld.isEmpty()) {
								cl.ad(kh.fh_fld, kh.fm_fld, kh.fe_fld);
							} else {
								cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
								ik.bz(false, 149789364);
								jk.af(20, (byte)-14);
							}

							return;
						}

						var82 = 180 + ck_fld + 80;
						if (var23 == 1 && var24 >= var82 - 75 && var24 <= var82 + 75 && var25 >= var99 - 20 && var25 <= var99 + 20) {
							jz.ac(0);
							ba_fld = "";
							bq_fld = "";
							pe.cc_fld = 0;
							he.cq_fld = "";
							cv_fld = true;
						}

						var82 = bh.cb_fld + -117;
						var99 = 277;
						dh_fld = var24 >= var82 && var24 < var82 + om.cl_fld && var25 >= var99 && var25 < hk.dc_fld + var99;
						if (var23 == 1 && dh_fld) {
							client.dq_fld = !client.dq_fld;
							if (!client.dq_fld && cx.kq_fld.at(-957641846) != null) {
								cx.kq_fld.ac(null, -1567727000);
							}
						}

						var82 = bh.cb_fld + 24;
						var99 = 277;
						dv_fld = var24 >= var82 && var24 < var82 + om.cl_fld && var25 >= var99 && var25 < hk.dc_fld + var99;
						if (1 == var23 && dv_fld) {
							cx.kq_fld.ay(!cn.za(cx.kq_fld, 493841930), (byte)24);
							if (!cn.za(cx.kq_fld, 272338277)) {
								ba_fld = "";
								cx.kq_fld.ac(null, -1104503050);
								if (client.dq_fld && null != ba_fld && !ba_fld.isEmpty()) {
									dz_fld = 1451298735;
								} else {
									dz_fld = 0;
								}
							}
						}

						label1113:
						while (var26.az()) {
							if (13 == var26.aw_fld) {
								jz.ac(0);
								ba_fld = "";
								bq_fld = "";
								pe.cc_fld = 0;
								he.cq_fld = "";
								cv_fld = true;
							} else if (dz_fld == 0) {
								char var109 = var26.ah_fld;
								int var116 = 0;

								while (var116 < dt_fld.length() && var109 != dt_fld.charAt(var116)) {
									var116++;
								}

								if (85 == var26.aw_fld && !ba_fld.isEmpty()) {
									ba_fld = ba_fld.substring(0, ba_fld.length() - 1);
								}

								if (84 == var26.aw_fld || var26.aw_fld == 80) {
									dz_fld = 1451298735;
								}

								char var122 = var26.ah_fld;
								boolean var117 = dt_fld.indexOf(var122) != -1;
								if (var117 && ba_fld.length() < 320) {
									ba_fld = ba_fld + var26.ah_fld;
								}
							} else if (1 == dz_fld) {
								if (85 == var26.aw_fld && !bq_fld.isEmpty()) {
									bq_fld = bq_fld.substring(0, bq_fld.length() - 1);
								} else if (var26.aw_fld == 84 || var26.aw_fld == 80) {
									dz_fld = 0;
									if (var26.aw_fld == 84) {
										ba_fld = ba_fld.trim();
										if (ba_fld.isEmpty()) {
											cl.ad(kh.fb_fld, kh.fk_fld, kh.fc_fld);
										} else if (bq_fld.isEmpty()) {
											cl.ad(kh.fh_fld, kh.fm_fld, kh.fe_fld);
										} else {
											cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
											ik.bz(false, 538501869);
											jk.af(20, (byte)76);
										}

										return;
									}
								}

								if ((var26.ay(82) || var26.ay(87)) && 67 == var26.aw_fld) {
									Clipboard var111 = Toolkit.getDefaultToolkit().getSystemClipboard();
									Transferable var119 = var111.getContents(og.ci_fld);
									int var123 = 20 - bq_fld.length();
									if (var123 > 0) {
										try {
											String var125 = (String)(String)var119.getTransferData(DataFlavor.stringFlavor);
											int var126 = Math.min(var123, var125.length());
											int var127 = 0;

											while (true) {
												if (var127 >= var126) {
													bq_fld = bq_fld + var125.substring(0, var126);
													continue label1113;
												}

												if (!ap.ag(var125.charAt(var127))) {
													break;
												}

												char var130 = var125.charAt(var127);
												boolean var128 = dt_fld.indexOf(var130) != -1;
												if (!var128) {
													break;
												}

												var127++;
											}

											jz.ac(3);
											return;
										} catch (UnsupportedFlavorException var21) {
										} catch (IOException var22) {
										}
									}
								} else if (ap.ag(var26.ah_fld)) {
									char var118 = var26.ah_fld;
									boolean var110 = dt_fld.indexOf(var118) != -1;
									if (var110 && bq_fld.length() < 20) {
										bq_fld = bq_fld + var26.ah_fld;
									}
								}
							}
						}
					} else if (co_fld == 3) {
						int var9 = ck_fld + 180;
						short var10 = 241;
						uf var11 = var1.cu(25, kh.kv_fld.length() - 34, kh.kv_fld, var9, var10);
						if (1 == var23 && var11.av(var24, var25)) {
							by.ak(kh.mc_fld);
						}

						var9 = 180 + ck_fld;
						var10 = 276;
						if (1 == var23 && var24 >= var9 - 75 && var24 <= var9 + 75 && var25 >= var10 - 20 && var25 <= var10 + 20) {
							ei.aq(false);
						}

						var9 = ck_fld + 180;
						var10 = 326;
						if (1 == var23 && var24 >= var9 - 75 && var24 <= var9 + 75 && var25 >= var10 - 20 && var25 <= var10 + 20) {
							by.ak(kh.mi_fld);
							return;
						}
					} else if (co_fld == 4) {
						int var29 = ck_fld + 180 - 80;
						short var62 = 321;
						if (1 == var23 && var24 >= var29 - 75 && var24 <= var29 + 75 && var25 >= var62 - 20 && var25 <= 20 + var62) {
							he.cq_fld.trim();
							if (he.cq_fld.length() != 6) {
								cl.ad(kh.cy_fld, kh.cf_fld, kh.cx_fld);
							} else {
								pe.cc_fld = Integer.parseInt(he.cq_fld);
								he.cq_fld = "";
								ik.bz(true, 288449667);
								cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
								jk.af(20, (byte)28);
							}

							return;
						}

						if (var23 == 1 && var24 >= ck_fld + 180 - 9 && var24 <= ck_fld + 180 + 130 && var25 >= 263 && var25 <= 296) {
							cv_fld = !cv_fld;
						}

						if (var23 == 1 && var24 >= ck_fld + 180 - 34 && var24 <= 34 + 180 + ck_fld && var25 >= 351 && var25 <= 363) {
							by.ak(kh.mi_fld);
						}

						var29 = 80 + ck_fld + 180;
						if (1 == var23 && var24 >= var29 - 75 && var24 <= var29 + 75 && var25 >= var62 - 20 && var25 <= var62 + 20) {
							jz.ac(0);
							ba_fld = "";
							bq_fld = "";
							pe.cc_fld = 0;
							he.cq_fld = "";
						}

						while (var26.az()) {
							boolean var90 = false;

							for (int var12 = 0; var12 < dm_fld.length(); var12++) {
								if (var26.ah_fld == dm_fld.charAt(var12)) {
									var90 = true;
									break;
								}
							}

							if (var26.aw_fld == 13) {
								jz.ac(0);
								ba_fld = "";
								bq_fld = "";
								pe.cc_fld = 0;
								he.cq_fld = "";
							} else {
								if (var26.aw_fld == 85 && !he.cq_fld.isEmpty()) {
									he.cq_fld = he.cq_fld.substring(0, he.cq_fld.length() - 1);
								}

								if (var26.aw_fld == 84) {
									hs.as();
									return;
								}

								if (var90 && he.cq_fld.length() < 6) {
									he.cq_fld = he.cq_fld + var26.ah_fld;
								}
							}
						}
					} else if (5 == co_fld) {
						int var31 = ck_fld + 180 - 80;
						short var63 = 321;
						if (1 == var23 && var24 >= var31 - 75 && var24 <= var31 + 75 && var25 >= var63 - 20 && var25 <= var63 + 20) {
							ba_fld = ba_fld.trim();
							if (ba_fld.isEmpty()) {
								cl.ad(kh.kx_fld, kh.kk_fld, kh.kg_fld);
							} else {
								long var106 = id.ak();
								int var92;
								if (var106 == 0L) {
									var92 = 5;
								} else {
									var92 = qc.ag(var106, ba_fld);
								}

								switch (var92) {
									case 2:
										cl.ad(kh.ks_fld, kh.kb_fld, kh.li_fld);
										jz.ac(6);
										break;
									case 3:
										cl.ad(kh.le_fld, kh.lb_fld, kh.lw_fld);
										break;
									case 4:
										cl.ad(kh.lg_fld, kh.ln_fld, kh.lf_fld);
										break;
									case 5:
										cl.ad(kh.ld_fld, kh.lp_fld, kh.ll_fld);
										break;
									case 6:
										cl.ad(kh.lo_fld, kh.lu_fld, kh.lt_fld);
										break;
									case 7:
										cl.ad(kh.lr_fld, kh.lx_fld, kh.lj_fld);
								}
							}

							return;
						}

						var31 = 180 + ck_fld + 80;
						if (1 == var23 && var24 >= var31 - 75 && var24 <= var31 + 75 && var25 >= var63 - 20 && var25 <= var63 + 20) {
							lu.ai(true, (byte)-12);
						}

						short var91 = 361;
						if (gp.bw_fld != null) {
							int var104 = gp.bw_fld.ah_fld / 2;
							if (var23 == 1 && var24 >= gp.bw_fld.av_fld - var104 && var24 <= var104 + gp.bw_fld.av_fld && var25 >= var91 - 15 && var25 < var91) {
								by.ak(ph.hj("secure", true) + "m=weblogin/g=oldscape/cant_log_in");
							}
						}

						while (var26.az()) {
							boolean var105 = false;

							for (int var13 = 0; var13 < dt_fld.length(); var13++) {
								if (var26.ah_fld == dt_fld.charAt(var13)) {
									var105 = true;
									break;
								}
							}

							if (13 == var26.aw_fld) {
								lu.ai(true, (byte)10);
							} else {
								if (var26.aw_fld == 85 && !ba_fld.isEmpty()) {
									ba_fld = ba_fld.substring(0, ba_fld.length() - 1);
								}

								if (84 == var26.aw_fld) {
									ba_fld = ba_fld.trim();
									if (ba_fld.isEmpty()) {
										cl.ad(kh.kx_fld, kh.kk_fld, kh.kg_fld);
									} else {
										long var14 = id.ak();
										int var112;
										if (0L == var14) {
											var112 = 5;
										} else {
											var112 = qc.ag(var14, ba_fld);
										}

										switch (var112) {
											case 2:
												cl.ad(kh.ks_fld, kh.kb_fld, kh.li_fld);
												jz.ac(6);
												break;
											case 3:
												cl.ad(kh.le_fld, kh.lb_fld, kh.lw_fld);
												break;
											case 4:
												cl.ad(kh.lg_fld, kh.ln_fld, kh.lf_fld);
												break;
											case 5:
												cl.ad(kh.ld_fld, kh.lp_fld, kh.ll_fld);
												break;
											case 6:
												cl.ad(kh.lo_fld, kh.lu_fld, kh.lt_fld);
												break;
											case 7:
												cl.ad(kh.lr_fld, kh.lx_fld, kh.lj_fld);
										}
									}

									return;
								}

								if (var105 && ba_fld.length() < 320) {
									ba_fld = ba_fld + var26.ah_fld;
								}
							}
						}
					} else if (6 != co_fld) {
						if (co_fld == 7) {
							if (fv.dh_fld && !client.gz_fld) {
								int var36 = bh.cb_fld - 150;
								int var65 = 40 + 25 + 240 + var36;
								short var93 = 231;
								int var107 = 40 + var93;
								if (1 == var23 && var24 >= var36 && var24 <= var65 && var25 >= var93 && var25 <= var107) {
									bb_fld = by.aa(var36, var24);
								}

								int var113 = ck_fld + 180 - 80;
								short var120 = 321;
								if (1 == var23 && var24 >= var113 - 75 && var24 <= 75 + var113 && var25 >= var120 - 20 && var25 <= 20 + var120) {
									boolean var15 = aq.af(-461094705);
									if (var15) {
										jk.af(50, (byte)30);
										return;
									}
								}

								var113 = 180 + ck_fld + 80;
								if (var23 == 1 && var24 >= var113 - 75 && var24 <= var113 + 75 && var25 >= var120 - 20 && var25 <= 20 + var120) {
									cd_fld = new String[8];
									lu.ai(true, (byte)-1);
								}

								while (var26.az()) {
									if (101 == var26.aw_fld) {
										cd_fld[bb_fld] = null;
									}

									if (85 == var26.aw_fld) {
										if (null == cd_fld[bb_fld] && bb_fld > 0) {
											bb_fld--;
										}

										cd_fld[bb_fld] = null;
									}

									if (var26.ah_fld >= '0' && var26.ah_fld <= '9') {
										cd_fld[bb_fld] = "" + var26.ah_fld;
										if (bb_fld < 7) {
											bb_fld++;
										}
									}

									if (var26.aw_fld == 84) {
										boolean var124;
										label906: {
											Date var16;
											try {
												var16 = dt.an();
											} catch (ParseException var20) {
												sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
												var124 = false;
												break label906;
											}

											if (null == var16) {
												var124 = false;
											} else {
												Calendar var18 = Calendar.getInstance();
												var18.set(1, var18.get(1) - 13);
												var18.set(5, var18.get(5) + 1);
												var18.set(11, 0);
												var18.set(12, 0);
												var18.set(13, 0);
												var18.set(14, 0);
												Date var19 = var18.getTime();
												boolean var17 = var16.before(var19);
												boolean var129 = gi.al(var16);
												if (!var129) {
													sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
													var124 = false;
												} else {
													if (!var17) {
														fe.bg_fld = 1229895895;
													} else {
														fe.bg_fld = (int)(var16.getTime() / 86400000L - 11745L);
													}

													var124 = true;
												}
											}
										}

										if (var124) {
											jk.af(50, (byte)-35);
										}

										return;
									}
								}
							} else {
								int var34 = ck_fld + 180 - 80;
								short var64 = 321;
								if (var23 == 1 && var24 >= var34 - 75 && var24 <= var34 + 75 && var25 >= var64 - 20 && var25 <= 20 + var64) {
									by.ak(ph.hj("secure", true) + "m=dob/set_dob.ws");
									cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
									jz.ac(6);
									return;
								}

								var34 = 80 + 180 + ck_fld;
								if (var23 == 1 && var24 >= var34 - 75 && var24 <= var34 + 75 && var25 >= var64 - 20 && var25 <= 20 + var64) {
									lu.ai(true, (byte)-49);
								}
							}
						} else if (8 == co_fld) {
							int var37 = ck_fld + 180 - 80;
							short var66 = 321;
							if (1 == var23 && var24 >= var37 - 75 && var24 <= 75 + var37 && var25 >= var66 - 20 && var25 <= var66 + 20) {
								by.ak("https://legal.jagex.com/docs/policies/privacy");
								cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
								jz.ac(6);
								return;
							}

							var37 = 180 + ck_fld + 80;
							if (var23 == 1 && var24 >= var37 - 75 && var24 <= var37 + 75 && var25 >= var66 - 20 && var25 <= 20 + var66) {
								lu.ai(true, (byte)21);
							}
						} else if (9 == co_fld) {
							int var39 = 180 + ck_fld;
							short var67 = 311;
							boolean var94 = 1 == var23 && var24 >= var39 - 75 && var24 <= var39 + 75 && var25 >= var67 - 20 && var25 <= var67 + 20;

							while (var26.az()) {
								if (var26.aw_fld == 84 || var26.aw_fld == 13) {
									var94 = true;
								}
							}

							if (var94) {
								ei.aq(false);
							}
						} else if (co_fld == 10) {
							int var40 = 180 + ck_fld;
							short var68 = 209;
							boolean var95 = var23 == 1 && var24 >= var40 - 109 && var24 <= var40 + 109 && var25 >= var68 && var25 <= var68 + 68;

							while (var26.az()) {
								if (var26.aw_fld == 84) {
									var95 = true;
								}
							}

							if (var95) {
								if (hh.ar()) {
									return;
								}

								cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
								client.dm_fld = aao.ag_fld;
								ik.bz(false, 1615102115);
								jk.af(20, (byte)36);
							}
						} else if (co_fld == 12) {
							int var41 = bh.cb_fld;
							short var69 = 233;
							uf var96 = var2.cu(0, 30, kh.ly_fld, var41, var69);
							uf var108 = var2.cu(32, 32, kh.ly_fld, var41, var69);
							uf var115 = var2.cu(70, 34, kh.ly_fld, var41, var69);
							int var70 = var69 + 17;
							uf var121 = var2.cu(0, 34, kh.lv_fld, var41, var70);
							if (var23 == 1) {
								if (var96.av(var24, var25)) {
									by.ak("https://legal.jagex.com/docs/terms");
								} else if (var108.av(var24, var25)) {
									by.ak("https://legal.jagex.com/docs/policies/privacy");
								} else if (var115.av(var24, var25) || var121.av(var24, var25)) {
									by.ak("https://legal.jagex.com/docs/terms/eula");
								}
							}

							var41 = bh.cb_fld - 80;
							short var71 = 311;
							if (var23 == 1 && var24 >= var41 - 75 && var24 <= 75 + var41 && var25 >= var71 - 20 && var25 <= var71 + 20) {
								ds.hc(1996171584);
								ei.aq(true);
							}

							var41 = bh.cb_fld + 80;
							if (var23 == 1 && var24 >= var41 - 75 && var24 <= 75 + var41 && var25 >= var71 - 20 && var25 <= var71 + 20) {
								co_fld = -1104655693;
							}
						} else if (co_fld == 13) {
							int var44 = bh.cb_fld;
							short var72 = 321;
							if (var23 == 1 && var24 >= var44 - 75 && var24 <= 75 + var44 && var25 >= var72 - 20 && var25 <= 20 + var72) {
								ei.aq(true);
							}
						} else if (14 == co_fld) {
							String var45 = "";
							switch (bi_fld) {
								case 0:
									var45 = "https://secure.runescape.com/m=offence-appeal/account-history";
									break;
								case 1:
									var45 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
									break;
								case 2:
									var45 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
									break;
								default:
									lu.ai(false, (byte)15);
							}

							int var73 = ck_fld + 180;
							short var97 = 276;
							if (1 == var23 && var24 >= var73 - 75 && var24 <= var73 + 75 && var25 >= var97 - 20 && var25 <= var97 + 20) {
								by.ak(var45);
								cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
								jz.ac(6);
								return;
							}

							var73 = 180 + ck_fld;
							var97 = 326;
							if (1 == var23 && var24 >= var73 - 75 && var24 <= var73 + 75 && var25 >= var97 - 20 && var25 <= var97 + 20) {
								lu.ai(false, (byte)-43);
							}
						} else if (24 == co_fld) {
							int var46 = ck_fld + 180;
							short var75 = 301;
							if (1 == var23 && var24 >= var46 - 75 && var24 <= var46 + 75 && var25 >= var75 - 20 && var25 <= var75 + 20) {
								ei.aq(false);
							}
						} else if (32 == co_fld) {
							int var47 = ck_fld + 180 - 80;
							short var76 = 321;
							if (1 == var23 && var24 >= var47 - 75 && var24 <= var47 + 75 && var25 >= var76 - 20 && var25 <= var76 + 20) {
								by.ak(ph.hj("secure", true) + "m=dob/set_dob.ws");
								cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
								jz.ac(6);
								return;
							}

							var47 = 180 + ck_fld + 80;
							if (1 == var23 && var24 >= var47 - 75 && var24 <= var47 + 75 && var25 >= var76 - 20 && var25 <= var76 + 20) {
								lu.ai(true, (byte)26);
							}
						} else if (co_fld == 33) {
							int var49 = 180 + ck_fld;
							short var77 = 276;
							if (var23 == 1 && var24 >= var49 - 75 && var24 <= var49 + 75 && var25 >= var77 - 20 && var25 <= 20 + var77) {
								by.ak(kh.mc_fld);
							}

							var49 = ck_fld + 180;
							var77 = 326;
							if (var23 == 1 && var24 >= var49 - 75 && var24 <= 75 + var49 && var25 >= var77 - 20 && var25 <= 20 + var77) {
								lu.ai(true, (byte)-39);
							}
						} else if (34 == co_fld) {
							int var51 = ck_fld + 180;
							short var79 = 276;
							if (var23 == 1 && var24 >= var51 - 75 && var24 <= 75 + var51 && var25 >= var79 - 20 && var25 <= var79 + 20) {
								ow.ap();
								return;
							}

							if (ct.ar_fld != null) {
								ow.ap();
							}

							var51 = ck_fld + 180;
							var79 = 326;
							if (var23 == 1 && var24 >= var51 - 75 && var24 <= 75 + var51 && var25 >= var79 - 20 && var25 <= 20 + var79) {
								lu.ai(false, (byte)-64);
							}
						}
					} else {
						while (var26.az()) {
							if (var26.aw_fld == 84 || 13 == var26.aw_fld) {
								lu.ai(true, (byte)45);
							}
						}

						short var33 = 321;
						if (var23 == 1 && var25 >= var33 - 20 && var25 <= 20 + var33) {
							lu.ai(true, (byte)42);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void ci(boolean var0) {
		byte var1 = 0;
		if (!yx.hl()) {
			var1 = 12;
		} else if (og.ci_fld.ib((byte)114) || og.ci_fld.ie(-58045194) || client.ga(og.ci_fld, -1659599699)) {
			var1 = 10;
		}

		jz.ac(var1);
		if (var0) {
			ba_fld = "";
			bq_fld = "";
			pe.cc_fld = 0;
			he.cq_fld = "";
		}

		bw.ah(-1796162301);
		if (client.dq_fld && null != ba_fld && !ba_fld.isEmpty()) {
			dz_fld = 356591732;
		} else {
			dz_fld = 0;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Date;"
	)
	static Date ca() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = cd_fld;

		for (int var3 = 0; var3 < var2.length; var3++) {
			String var4 = var2[var3];
			if (var4 == null) {
				sc.ax("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int cg(int var0, int var1) {
		for (int var2 = 0; var2 < 8; var2++) {
			if (var1 <= 30 + var0) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;Lzz;ZI)V"
	)
	static void bk(ub var0, ub var1, zz var2, boolean var3, int var4) throws EOFException {
		if (lr.bx_fld) {
			if (4 == var4) {
				jz.ac(4);
			}
		} else {
			if (var4 == 0) {
				ei.aq(var3);
			} else {
				jz.ac(var4);
			}

			yu.dn();
			byte[] var5 = var0.cb("title.jpg", "", (byte)-18);
			hu.ce_fld = qd.ak(var5);
			nq.cn_fld = hu.ce_fld.af();
			ap.aw(var1, 273501030 * client.gt_fld);
			nn.cf_fld = dq.aw(var1, "titlebox", "");
			qv.cx_fld = dq.aw(var1, "titlebutton", "");
			vn.cs_fld = dq.aw(var1, "titlebutton_large", "");
			ij.cp_fld = dq.aw(var1, "play_now_text", "");
			dq.aw(var1, "titlebutton_wide42,1", "");
			bf.cy_fld = qj.ah(var1, "runes", "");
			jm.ca_fld = qj.ah(var1, "title_mute", "");
			yg.cg_fld = dq.aw(var1, "options_radio_buttons,0", "");
			gl.cw_fld = dq.aw(var1, "options_radio_buttons,4", "");
			ik.cm_fld = dq.aw(var1, "options_radio_buttons,2", "");
			ee.cz_fld = dq.aw(var1, "options_radio_buttons,6", "");
			om.cl_fld = 926502891 * yg.cg_fld.az_fld;
			hk.dc_fld = yg.cg_fld.av_fld;
			do_.bp_fld = new ce(bf.cy_fld, var2.aw_fld);
			if (var3) {
				ba_fld = "";
				bq_fld = "";
				cd_fld = new String[8];
				bb_fld = 0;
			}

			pe.cc_fld = 0;
			he.cq_fld = "";
			cv_fld = true;
			dq_fld = false;
			if (cx.kq_fld.as((short)32187)) {
				sx.av(0, 0);
			} else {
				cp.bh("scape main", 255);
			}

			ah.ay();
			ll.hy().ag(false);
			lr.bx_fld = true;
			bo_fld = 1332414199 * ((pf.qw_fld - 2056708252) / 2);
			ck_fld = bo_fld + -1925716405;
			bh.cb_fld = 355797204 + ck_fld;
			hu.ce_fld.ao(bo_fld, 0);
			nq.cn_fld.ao(bo_fld + 382, 0);
			hk.cr_fld.ad(bo_fld + -228400630 - hk.cr_fld.az_fld / 2, 18);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bb() throws EOFException {
		he.cq_fld.trim();
		if (he.cq_fld.length() != 6) {
			cl.ad(kh.cy_fld, kh.cf_fld, kh.cx_fld);
		} else {
			pe.cc_fld = Integer.parseInt(he.cq_fld);
			he.cq_fld = "";
			ik.bz(true, -1079905947);
			cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
			jk.af(20, (byte)-33);
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void dm() {
		if (gv.ak()) {
			dq_fld = true;
			du_fld = 0;
			db_fld = 0;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Date;"
	)
	static Date cr() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = cd_fld;

		for (int var3 = 0; var3 < var2.length; var3++) {
			String var4 = var2[var3];
			if (var4 == null) {
				sc.ax("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	static void co(boolean var0) {
		byte var1 = 0;
		if (!yx.hl()) {
			var1 = 12;
		} else if (og.ci_fld.ib((byte)9) || og.ci_fld.ie(1635743359) || client.ga(og.ci_fld, -1403520164)) {
			var1 = 10;
		}

		jz.ac(var1);
		if (var0) {
			ba_fld = "";
			bq_fld = "";
			pe.cc_fld = 0;
			he.cq_fld = "";
		}

		bw.ah(-1995731672);
		if (client.dq_fld && null != ba_fld && !ba_fld.isEmpty()) {
			dz_fld = 1451298735;
		} else {
			dz_fld = 0;
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void dq() {
		jz.ac(24);
		cl.ad(kh.jh_fld, kh.jq_fld, kh.jp_fld);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V"
	)
	static void bu(ub var0, int var1) throws EOFException {
		if ((var1 & wu.br_fld.ag(545368782)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_deadman_mode", "");
		} else if ((var1 & wu.be_fld.ag(-1563236018)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_seasonal_mode", "");
		} else if ((var1 & wu.as_fld.ag(-122287039)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_speedrunning", "");
		} else if ((var1 & wu.al_fld.ag(-1608648481)) != 0) {
			hk.cr_fld = dq.aw(var0, "logo_ugc_world", "");
		} else {
			hk.cr_fld = dq.aw(var0, "logo", "");
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	static void ds(int var0, String var1) {
		bv_fld = var1;
		bt_fld = 383922963 * var0;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lzf;Lzf;Lzf;)V"
	)
	static void cj(zf var0, zf var1, zf var2) throws EOFException {
		bo_fld = (pf.qw_fld - 765) / 2;
		ck_fld = bo_fld + -999389370;
		bh.cb_fld = 355797204 + ck_fld;
		if (dq_fld) {
			if (null == ui.do_fld) {
				uv var145 = gz.hy_fld;
				yv[] var109;
				if (!ub.mo(var145, "sl_back", "", (byte)-52)) {
					var109 = null;
				} else {
					int var170 = var145.cm("sl_back", (byte)1);
					int var182 = var145.cz(var170, "", 456613536);
					var109 = km.az(var145, var170, var182);
				}

				ui.do_fld = var109;
			}

			if (bt.dd_fld == null) {
				bt.dd_fld = qj.ah(gz.hy_fld, "sl_flags", "");
			}

			if (hk.dl_fld == null) {
				hk.dl_fld = qj.ah(gz.hy_fld, "sl_arrows", "");
			}

			if (gx.dr_fld == null) {
				gx.dr_fld = qj.ah(gz.hy_fld, "sl_stars", "");
			}

			if (wt.dk_fld == null) {
				wt.dk_fld = dq.aw(gz.hy_fld, "leftarrow", "");
			}

			if (null == bi.dx_fld) {
				bi.dx_fld = dq.aw(gz.hy_fld, "rightarrow", "");
			}

			yu.dj(bo_fld, 23, 765, 480, 0);
			yu.es(bo_fld, 0, 125, 23, 12425273, 9135624);
			yu.es(bo_fld + 125, 0, 640, 23, 5197647, 2697513);
			var0.ap(kh.mm_fld, bo_fld + 62, 15, 0, -1);
			if (null != gx.dr_fld) {
				gx.dr_fld[1].ad(140 + bo_fld, 1);
				zv.uj(var1, kh.mx_fld, 152 + bo_fld, 10, 16777215, -1);
				gx.dr_fld[0].ad(bo_fld + 140, 12);
				zv.uj(var1, kh.mj_fld, bo_fld + 152, 21, 16777215, -1);
			}

			if (null != hk.dl_fld) {
				int var110 = 280 + bo_fld;
				if (0 == ct.as_fld[0] && ct.ay_fld[0] == 0) {
					hk.dl_fld[2].ad(var110, 4);
				} else {
					hk.dl_fld[0].ad(var110, 4);
				}

				if (ct.as_fld[0] == 0 && 1 == ct.ay_fld[0]) {
					hk.dl_fld[3].ad(var110 + 15, 4);
				} else {
					hk.dl_fld[1].ad(15 + var110, 4);
				}

				zv.uj(var0, kh.mr_fld, 32 + var110, 17, 16777215, -1);
				int var146 = 390 + bo_fld;
				if (1 == ct.as_fld[0] && 0 == ct.ay_fld[0]) {
					hk.dl_fld[2].ad(var146, 4);
				} else {
					hk.dl_fld[0].ad(var146, 4);
				}

				if (ct.as_fld[0] == 1 && 1 == ct.ay_fld[0]) {
					hk.dl_fld[3].ad(var146 + 15, 4);
				} else {
					hk.dl_fld[1].ad(15 + var146, 4);
				}

				zv.uj(var0, kh.mo_fld, 32 + var146, 17, 16777215, -1);
				int var171 = bo_fld + 500;
				if (2 == ct.as_fld[0] && ct.ay_fld[0] == 0) {
					hk.dl_fld[2].ad(var171, 4);
				} else {
					hk.dl_fld[0].ad(var171, 4);
				}

				if (ct.as_fld[0] == 2 && 1 == ct.ay_fld[0]) {
					hk.dl_fld[3].ad(var171 + 15, 4);
				} else {
					hk.dl_fld[1].ad(var171 + 15, 4);
				}

				zv.uj(var0, kh.mu_fld, 32 + var171, 17, 16777215, -1);
				int var183 = 610 + bo_fld;
				if (ct.as_fld[0] == 3 && ct.ay_fld[0] == 0) {
					hk.dl_fld[2].ad(var183, 4);
				} else {
					hk.dl_fld[0].ad(var183, 4);
				}

				if (3 == ct.as_fld[0] && 1 == ct.ay_fld[0]) {
					hk.dl_fld[3].ad(var183 + 15, 4);
				} else {
					hk.dl_fld[1].ad(15 + var183, 4);
				}

				zv.uj(var0, kh.mf_fld, 32 + var183, 17, 16777215, -1);
			}

			yu.dj(bo_fld + 708, 4, 50, 16, 0);
			var1.ap(kh.ky_fld, 25 + 708 + bo_fld, 16, 16777215, -1);
			ds_fld = -2130668241;
			if (null != ui.do_fld) {
				byte var111 = 88;
				byte var147 = 19;
				int var172 = 765 / (1 + var111) - 1;
				int var184 = 480 / (1 + var147);

				int var191;
				int var197;
				do {
					var191 = var184;
					var197 = var172;
					if (var184 * (var172 - 1) >= ct.ah_fld) {
						var172--;
					}

					if (var172 * (var184 - 1) >= ct.ah_fld) {
						var184--;
					}

					if (var172 * (var184 - 1) >= ct.ah_fld) {
						var184--;
					}
				} while (var191 != var184 || var197 != var172);

				var191 = (765 - var111 * var172) / (var172 + 1);
				if (var191 > 5) {
					var191 = 5;
				}

				var197 = (480 - var147 * var184) / (var184 + 1);
				if (var197 > 5) {
					var197 = 5;
				}

				int var203 = (765 - var172 * var111 - var191 * (var172 - 1)) / 2;
				int var206 = (480 - var147 * var184 - var197 * (var184 - 1)) / 2;
				int var210 = (var184 + ct.ah_fld - 1) / var184;
				db_fld = 259351975 * (var210 - var172);
				if (wt.dk_fld != null && du_fld > 0) {
					wt.dk_fld.ad(8, bc.qx_fld / 2 - wt.dk_fld.av_fld / 2);
				}

				if (null != bi.dx_fld && du_fld < db_fld) {
					bi.dx_fld.ad(pf.qw_fld - bi.dx_fld.az_fld - 8, bc.qx_fld / 2 - bi.dx_fld.av_fld / 2);
				}

				int var212 = var206 + 23;
				int var13 = bo_fld + var203;
				int var14 = 0;
				boolean var15 = false;
				int var16 = du_fld;

				for (int var17 = var184 * var16; var17 < ct.ah_fld && var16 - du_fld < var172; var17++) {
					ct var18 = yd.ae_fld[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.au_fld);
					if (-1 == var18.au_fld) {
						var20 = kh.mb_fld;
						var19 = false;
					} else if (var18.au_fld > 1980) {
						var20 = kh.ms_fld;
						var19 = false;
					}

					cw var21 = null;
					int var22 = 0;
					if (var18.ar(-1917248095)) {
						var21 = var18.as((short)2048) ? cw.ay_fld : cw.aw_fld;
					} else if (ct.cr(var18, -330234888)) {
						var21 = var18.as((short)2048) ? cw.aa_fld : cw.an_fld;
					} else if (var18.af(1485197242)) {
						var22 = 16711680;
						var21 = var18.as((short)2048) ? cw.ah_fld : cw.ae_fld;
					} else if (ct.um(var18, (byte)10)) {
						var21 = var18.as((short)2048) ? cw.ar_fld : cw.as_fld;
					} else if (var18.ax(242953442)) {
						var21 = var18.as((short)2048) ? cw.av_fld : cw.az_fld;
					} else if (var18.ai((byte)-22)) {
						var21 = var18.as((short)2048) ? cw.al_fld : cw.af_fld;
					} else if (var18.aq((byte)-95)) {
						var21 = var18.as((short)2048) ? cw.ax_fld : cw.au_fld;
					}

					if (null == var21 || var21.ai_fld >= ui.do_fld.length) {
						var21 = var18.as((short)2048) ? cw.ag_fld : cw.ak_fld;
					}

					if (tj.ae_fld >= var13 && tj.ah_fld >= var212 && tj.ae_fld < var111 + var13 && tj.ah_fld < var147 + var212 && var19) {
						ds_fld = var17;
						ui.do_fld[var21.ai_fld].bs(var13, var212, 128, 16777215);
						var15 = true;
					} else {
						ui.do_fld[var21.ai_fld].ao(var13, var212);
					}

					if (bt.dd_fld != null) {
						bt.dd_fld[(var18.as((short)2048) ? bt.dd_fld.length / 2 : 0) + var18.aa_fld].ad(var13 + 29, var212);
					}

					var0.ap(Integer.toString(var18.af_fld), var13 + 15, 5 + var147 / 2 + var212, var22, -1);
					var1.ap(var20, 60 + var13, var212 + var147 / 2 + 5, 268435455, -1);
					var212 += var147 + var197;
					if (++var14 >= var184) {
						var212 = 23 + var206;
						var13 += var111 + var191;
						var14 = 0;
						var16++;
					}
				}

				if (var15) {
					int var213 = var1.an(yd.ae_fld[ds_fld].an_fld) + 6;
					int var214 = 8 + var1.ap_fld;
					int var215 = 25 + tj.ah_fld;
					if (var214 + var215 > 480) {
						var215 = tj.ah_fld - 25 - var214;
					}

					yu.dj(tj.ae_fld - var213 / 2, var215, var213, var214, 16777120);
					yu.ed(tj.ae_fld - var213 / 2, var215, var213, var214, 0);
					var1.ap(yd.ae_fld[ds_fld].an_fld, tj.ae_fld, 4 + var1.ap_fld + var215, 0, -1);
				}
			}
		} else {
			hu.ce_fld.ao(bo_fld, 0);
			nq.cn_fld.ao(bo_fld + 382, 0);
			hk.cr_fld.ad(bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
			if (client.cl_fld == 0 || 5 == client.cl_fld) {
				byte var3 = 20;
				var0.ap(kh.ir_fld, 180 + ck_fld, 245 - var3, 16777215, -1);
				int var4 = 253 - var3;
				yu.ed(ck_fld + 180 - 152, var4, 304, 34, 9179409);
				yu.ed(ck_fld + 180 - 151, 1 + var4, 302, 32, 0);
				yu.dj(ck_fld + 180 - 150, 2 + var4, bt_fld * 552738201, 30, 9179409);
				yu.dj(ck_fld + 180 - 150 + bt_fld, var4 + 2, 300 - bt_fld, 30, 0);
				var0.ap(bv_fld, 180 + ck_fld, 276 - var3, 16777215, -1);
			}

			if (20 == client.cl_fld) {
				nn.cf_fld.ad(180 + ck_fld - nn.cf_fld.az_fld / 2, 271 - nn.cf_fld.av_fld / 2);
				short var23 = 201;
				var0.ap(ci_fld, ck_fld + 180, var23, 16776960, 0);
				int var24 = var23 + 15;
				var0.ap(cj_fld, ck_fld + 180, var24, 16776960, 0);
				var24 += 15;
				var0.ap(ch_fld, 180 + ck_fld, var24, 16776960, 0);
				var24 += 15;
				var24 += 7;
				if (4 != co_fld && co_fld != 10 && 1 != co_fld) {
					zv.uj(var0, kh.ju_fld, ck_fld + 180 - 110, var24, 16777215, 0);
					short var112 = 200;
					String var5 = ci.ae();

					while (var0.an(var5) > var112) {
						var5 = var5.substring(0, var5.length() - 1);
					}

					zv.uj(var0, zv.ay(var5), 180 + ck_fld - 70, var24, 16777215, 0);
					var24 += 15;
					String var7 = bq_fld;
					String var6 = fe.aa('*', var7.length());
					String var8 = var6;

					while (var0.an(var8) > var112) {
						var8 = var8.substring(1);
					}

					zv.uj(var0, kh.ji_fld + var8, ck_fld + 180 - 108, var24, 16777215, 0);
					var24 += 15;
				}
			}

			if (10 == client.cl_fld || 11 == client.cl_fld || 50 == client.cl_fld) {
				nn.cf_fld.ad(ck_fld, 171);
				if (0 == co_fld) {
					short var30 = 251;
					var0.ap(kh.jl_fld, ck_fld + 180, var30, 16776960, 0);
					int var31 = var30 + 30;
					int var113 = 180 + ck_fld - 80;
					short var148 = 291;
					qv.cx_fld.ad(var113 - 73, var148 - 20);
					var0.at(kh.kl_fld, var113 - 73, var148 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var113 = 80 + 180 + ck_fld;
					qv.cx_fld.ad(var113 - 73, var148 - 20);
					var0.at(kh.ko_fld, var113 - 73, var148 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (co_fld == 1) {
					var0.ap(cu_fld, ck_fld + 180, 201, 16776960, 0);
					short var32 = 236;
					var0.ap(ci_fld, 180 + ck_fld, var32, 16777215, 0);
					int var33 = var32 + 15;
					var0.ap(cj_fld, 180 + ck_fld, var33, 16777215, 0);
					var33 += 15;
					var0.ap(ch_fld, ck_fld + 180, var33, 16777215, 0);
					var33 += 15;
					int var115 = 180 + ck_fld - 80;
					short var149 = 321;
					qv.cx_fld.ad(var115 - 73, var149 - 20);
					var0.ap(kh.at_fld, var115, 5 + var149, 16777215, 0);
					var115 = 80 + ck_fld + 180;
					qv.cx_fld.ad(var115 - 73, var149 - 20);
					var0.ap(kh.ky_fld, var115, var149 + 5, 16777215, 0);
				} else if (2 == co_fld) {
					short var36 = 201;
					var0.ap(ci_fld, bh.cb_fld, var36, 16776960, 0);
					int var37 = var36 + 15;
					var0.ap(cj_fld, bh.cb_fld, var37, 16776960, 0);
					var37 += 15;
					var0.ap(ch_fld, bh.cb_fld, var37, 16776960, 0);
					var37 += 15;
					var37 += 7;
					zv.uj(var0, kh.ju_fld, bh.cb_fld - 110, var37, 16777215, 0);
					short var117 = 200;
					String var150 = ci.ae();

					while (var0.an(var150) > var117) {
						var150 = var150.substring(1);
					}

					zv.uj(var0, zv.ay(var150) + (dz_fld == 0 & client.dv_fld % 40 < 20 ? gd.ag(16776960, -1940547058) + db.az_fld : ""), bh.cb_fld - 70, var37, 16777215, 0);
					var37 += 15;
					String var185 = bq_fld;
					String var173 = fe.aa('*', var185.length());
					String var193 = var173;

					while (var0.an(var193) > var117) {
						var193 = var193.substring(1);
					}

					zv.uj(
						var0, kh.ji_fld + var193 + (1 == dz_fld & client.dv_fld % 40 < 20 ? gd.ag(16776960, -1940547058) + db.az_fld : ""), bh.cb_fld - 108, var37, 16777215, 0
					);
					var37 += 15;
					short var43 = 277;
					int var9 = -117 + bh.cb_fld;
					yc var10 = gh.av(client.dq_fld, dh_fld);
					var10.ad(var9, var43);
					var9 += 5 + var10.az_fld;
					zv.uj(var1, kh.ka_fld, var9, 13 + var43, 16776960, 0);
					var9 = 24 + bh.cb_fld;
					var10 = gh.av(cn.za(cx.kq_fld, 341870845), dv_fld);
					var10.ad(var9, var43);
					var9 += 5 + var10.az_fld;
					zv.uj(var1, kh.kt_fld, var9, var43 + 13, 16776960, 0);
					int var44 = var43 + 15;
					int var11 = bh.cb_fld - 80;
					short var12 = 321;
					qv.cx_fld.ad(var11 - 73, var12 - 20);
					var0.ap(kh.ku_fld, var11, var12 + 5, 16777215, 0);
					var11 = bh.cb_fld + 80;
					qv.cx_fld.ad(var11 - 73, var12 - 20);
					var0.ap(kh.ky_fld, var11, var12 + 5, 16777215, 0);
					short var45 = 357;
					switch (bu_fld) {
						case 2:
							gk.bn_fld = kh.kq_fld;
							break;
						default:
							gk.bn_fld = kh.ki_fld;
					}

					cg.bc_fld = new uf(bh.cb_fld, var45, var1.an(gk.bn_fld), 11);
					gp.bw_fld = new uf(bh.cb_fld, var45, var1.an(kh.ke_fld), 11);
					var1.ap(gk.bn_fld, bh.cb_fld, var45, 16777215, 0);
				} else if (3 == co_fld) {
					short var46 = 201;
					var0.ap(kh.kf_fld, ck_fld + 180, var46, 16776960, 0);
					int var47 = var46 + 20;
					var1.ap(kh.kn_fld, 180 + ck_fld, var47, 16776960, 0);
					var47 += 20;
					var1.ap(kh.kv_fld, ck_fld + 180, var47, 16776960, 0);
					var47 += 15;
					int var118 = 180 + ck_fld;
					short var151 = 276;
					qv.cx_fld.ad(var118 - 73, var151 - 20);
					var2.ap(kh.kz_fld, var118, 5 + var151, 16777215, 0);
					var118 = ck_fld + 180;
					var151 = 326;
					qv.cx_fld.ad(var118 - 73, var151 - 20);
					var2.ap(kh.kc_fld, var118, 5 + var151, 16777215, 0);
				} else if (co_fld == 4) {
					var0.ap(kh.jd_fld, 180 + ck_fld, 201, 16776960, 0);
					short var50 = 236;
					var0.ap(ci_fld, 180 + ck_fld, var50, 16777215, 0);
					int var51 = var50 + 15;
					var0.ap(cj_fld, 180 + ck_fld, var51, 16777215, 0);
					var51 += 15;
					var0.ap(ch_fld, 180 + ck_fld, var51, 16777215, 0);
					var51 += 15;
					String var153 = kh.jr_fld;
					String var186 = he.cq_fld;
					String var174 = fe.aa('*', var186.length());
					zv.uj(var0, var153 + var174 + (client.dv_fld % 40 < 20 ? gd.ag(16776960, -1940547058) + db.az_fld : ""), 180 + ck_fld - 108, var51, 16777215, 0);
					var51 -= 8;
					zv.uj(var0, kh.bm_fld, 180 + ck_fld - 9, var51, 16776960, 0);
					var51 += 15;
					zv.uj(var0, kh.bd_fld, ck_fld + 180 - 9, var51, 16776960, 0);
					int var194 = ck_fld + 180 - 9 + var0.an(kh.bd_fld) + 15;
					int var202 = var51 - var0.ap_fld;
					yc var205;
					if (cv_fld) {
						var205 = ik.cm_fld;
					} else {
						var205 = yg.cg_fld;
					}

					var205.ad(var194, var202);
					var51 += 15;
					int var208 = ck_fld + 180 - 80;
					short var211 = 321;
					qv.cx_fld.ad(var208 - 73, var211 - 20);
					var0.ap(kh.at_fld, var208, 5 + var211, 16777215, 0);
					var208 = ck_fld + 180 + 80;
					qv.cx_fld.ad(var208 - 73, var211 - 20);
					var0.ap(kh.ky_fld, var208, 5 + var211, 16777215, 0);
					var1.ap(kh.ki_fld, 180 + ck_fld, 36 + var211, 16777215, 0);
				} else if (5 == co_fld) {
					var0.ap(kh.km_fld, ck_fld + 180, 201, 16776960, 0);
					short var57 = 221;
					var2.ap(ci_fld, 180 + ck_fld, var57, 16776960, 0);
					int var58 = var57 + 15;
					var2.ap(cj_fld, ck_fld + 180, var58, 16776960, 0);
					var58 += 15;
					var2.ap(ch_fld, ck_fld + 180, var58, 16776960, 0);
					var58 += 15;
					var58 += 14;
					zv.uj(var0, kh.kw_fld, ck_fld + 180 - 145, var58, 16777215, 0);
					short var120 = 174;
					String var154 = ci.ae();

					while (var0.an(var154) > var120) {
						var154 = var154.substring(1);
					}

					zv.uj(var0, zv.ay(var154) + (client.dv_fld % 40 < 20 ? gd.ag(16776960, -1940547058) + db.az_fld : ""), ck_fld + 180 - 34, var58, 16777215, 0);
					var58 += 15;
					int var175 = 180 + ck_fld - 80;
					short var187 = 321;
					qv.cx_fld.ad(var175 - 73, var187 - 20);
					var0.ap(kh.kh_fld, var175, 5 + var187, 16777215, 0);
					var175 = 80 + ck_fld + 180;
					qv.cx_fld.ad(var175 - 73, var187 - 20);
					var0.ap(kh.kr_fld, var175, var187 + 5, 16777215, 0);
					var187 = 356;
					var1.ap(kh.ke_fld, bh.cb_fld, var187, 268435455, 0);
				} else if (6 == co_fld) {
					short var63 = 201;
					var0.ap(ci_fld, ck_fld + 180, var63, 16776960, 0);
					int var64 = var63 + 15;
					var0.ap(cj_fld, 180 + ck_fld, var64, 16776960, 0);
					var64 += 15;
					var0.ap(ch_fld, ck_fld + 180, var64, 16776960, 0);
					var64 += 15;
					int var121 = 180 + ck_fld;
					short var155 = 321;
					qv.cx_fld.ad(var121 - 73, var155 - 20);
					var0.ap(kh.kr_fld, var121, 5 + var155, 16777215, 0);
				} else if (co_fld == 7) {
					if (fv.dh_fld && !client.gz_fld) {
						short var71 = 201;
						var0.ap(ci_fld, bh.cb_fld, var71, 16776960, 0);
						int var72 = var71 + 15;
						var0.ap(cj_fld, bh.cb_fld, var72, 16776960, 0);
						var72 += 15;
						var0.ap(ch_fld, bh.cb_fld, var72, 16776960, 0);
						int var124 = bh.cb_fld - 150;
						var72 += 10;

						for (int var157 = 0; var157 < 8; var157++) {
							qv.cx_fld.ah(var124, var72, 30, 40);
							boolean var177 = var157 == bb_fld & client.dv_fld % 40 < 20;
							zv.uj(
								var0, (cd_fld[var157] == null ? "" : cd_fld[var157]) + (var177 ? gd.ag(16776960, -1940547058) + db.az_fld : ""), var124 + 10, 27 + var72, 16777215, 0
							);
							if (var157 != 1 && 3 != var157) {
								var124 += 35;
							} else {
								var124 += 50;
								zv.uj(var0, zv.ay("/"), var124 - 13, var72 + 27, 16777215, 0);
							}
						}

						int var158 = bh.cb_fld - 80;
						short var178 = 321;
						qv.cx_fld.ad(var158 - 73, var178 - 20);
						var0.ap("Submit", var158, 5 + var178, 16777215, 0);
						var158 = bh.cb_fld + 80;
						qv.cx_fld.ad(var158 - 73, var178 - 20);
						var0.ap(kh.ky_fld, var158, 5 + var178, 16777215, 0);
					} else {
						short var67 = 216;
						var0.ap(kh.lz_fld, 180 + ck_fld, var67, 16776960, 0);
						int var68 = var67 + 15;
						var2.ap(kh.lk_fld, ck_fld + 180, var68, 16776960, 0);
						var68 += 15;
						var2.ap(kh.lm_fld, ck_fld + 180, var68, 16776960, 0);
						var68 += 15;
						int var122 = 180 + ck_fld - 80;
						short var156 = 321;
						qv.cx_fld.ad(var122 - 73, var156 - 20);
						var0.ap(kh.lc_fld, var122, var156 + 5, 16777215, 0);
						var122 = 80 + ck_fld + 180;
						qv.cx_fld.ad(var122 - 73, var156 - 20);
						var0.ap(kh.kr_fld, var122, 5 + var156, 16777215, 0);
					}
				} else if (co_fld == 8) {
					short var75 = 216;
					var0.ap(kh.go_fld, ck_fld + 180, var75, 16776960, 0);
					int var76 = var75 + 15;
					var2.ap(kh.gn_fld, 180 + ck_fld, var76, 16776960, 0);
					var76 += 15;
					var2.ap(kh.gh_fld, 180 + ck_fld, var76, 16776960, 0);
					var76 += 15;
					int var125 = 180 + ck_fld - 80;
					short var160 = 321;
					qv.cx_fld.ad(var125 - 73, var160 - 20);
					var0.ap(kh.gr_fld, var125, var160 + 5, 16777215, 0);
					var125 = 180 + ck_fld + 80;
					qv.cx_fld.ad(var125 - 73, var160 - 20);
					var0.ap(kh.kr_fld, var125, 5 + var160, 16777215, 0);
				} else if (9 == co_fld) {
					short var79 = 221;
					var0.ap(ci_fld, ck_fld + 180, var79, 16776960, 0);
					int var80 = var79 + 25;
					var0.ap(cj_fld, ck_fld + 180, var80, 16776960, 0);
					var80 += 25;
					var0.ap(ch_fld, ck_fld + 180, var80, 16776960, 0);
					int var127 = ck_fld + 180;
					short var161 = 311;
					qv.cx_fld.ad(var127 - 73, var161 - 20);
					var0.ap(kh.kz_fld, var127, 5 + var161, 16777215, 0);
				} else if (10 == co_fld) {
					int var82 = 180 + ck_fld;
					short var128 = 209;
					var0.ap(kh.jl_fld, 180 + ck_fld, var128, 16776960, 0);
					int var129 = var128 + 20;
					vn.cs_fld.ad(var82 - 109, var129);
					if (ct_fld.isEmpty()) {
						ij.cp_fld.ad(var82 - 48, 18 + var129);
					} else {
						ij.cp_fld.ad(var82 - 48, var129 + 5);
						var0.ap(ct_fld, var82, var129 + 68 - 15, 16776960, 0);
					}
				} else if (12 == co_fld) {
					int var83 = bh.cb_fld;
					short var130 = 216;
					var2.ap(kh.lh_fld, var83, var130, 16777215, 0);
					int var131 = var130 + 17;
					var2.ap(kh.ly_fld, var83, var131, 16777215, 0);
					var131 += 17;
					var2.ap(kh.lv_fld, var83, var131, 16777215, 0);
					var131 += 17;
					var2.ap(kh.mt_fld, var83, var131, 16777215, 0);
					var83 = bh.cb_fld - 80;
					short var134 = 311;
					qv.cx_fld.ad(var83 - 73, var134 - 20);
					var0.ap(kh.mh_fld, var83, var134 + 5, 16777215, 0);
					var83 = bh.cb_fld + 80;
					qv.cx_fld.ad(var83 - 73, var134 - 20);
					var0.ap(kh.my_fld, var83, 5 + var134, 16777215, 0);
				} else if (13 == co_fld) {
					short var86 = 231;
					var2.ap(kh.ma_fld, 180 + ck_fld, var86, 16777215, 0);
					int var87 = var86 + 20;
					var2.ap(kh.mv_fld, 180 + ck_fld, var87, 16777215, 0);
					int var135 = ck_fld + 180;
					short var88 = 311;
					qv.cx_fld.ad(var135 - 73, var88 - 20);
					var0.ap(kh.kr_fld, var135, var88 + 5, 16777215, 0);
				} else if (co_fld == 14) {
					short var89 = 201;
					String var136 = "";
					String var162 = "";
					String var179 = "";
					switch (bi_fld) {
						case 0:
							var136 = kh.co_fld;
							var162 = kh.cu_fld;
							var179 = kh.ci_fld;
							break;
						case 1:
							var136 = kh.ex_fld;
							var162 = kh.eo_fld;
							var179 = kh.ec_fld;
							break;
						case 2:
							var136 = kh.fn_fld;
							var162 = kh.ft_fld;
							var179 = kh.fd_fld;
							break;
						default:
							lu.ai(false, (byte)7);
					}

					var0.ap(var136, ck_fld + 180, var89, 16776960, 0);
					int var90 = var89 + 20;
					var0.ap(var162, ck_fld + 180, var90, 16776960, 0);
					var90 += 20;
					var0.ap(var179, ck_fld + 180, var90, 16776960, 0);
					int var189 = 180 + ck_fld;
					short var195 = 276;
					qv.cx_fld.ad(var189 - 73, var195 - 20);
					if (1 == bi_fld) {
						var0.ap(kh.cv_fld, var189, 5 + var195, 16777215, 0);
					} else {
						var0.ap(kh.cq_fld, var189, var195 + 5, 16777215, 0);
					}

					var189 = 180 + ck_fld;
					var195 = 326;
					qv.cx_fld.ad(var189 - 73, var195 - 20);
					var0.ap(kh.kr_fld, var189, 5 + var195, 16777215, 0);
				} else if (24 == co_fld) {
					short var92 = 221;
					var0.ap(ci_fld, ck_fld + 180, var92, 16777215, 0);
					int var93 = var92 + 15;
					var0.ap(cj_fld, 180 + ck_fld, var93, 16777215, 0);
					var93 += 15;
					var0.ap(ch_fld, ck_fld + 180, var93, 16777215, 0);
					var93 += 15;
					int var137 = ck_fld + 180;
					short var163 = 301;
					qv.cx_fld.ad(var137 - 73, var163 - 20);
					var0.ap(kh.ab_fld, var137, 5 + var163, 16777215, 0);
				} else if (co_fld == 32) {
					short var96 = 216;
					var0.ap(kh.lz_fld, ck_fld + 180, var96, 16776960, 0);
					int var97 = var96 + 15;
					var2.ap(kh.lk_fld, 180 + ck_fld, var97, 16776960, 0);
					var97 += 15;
					var2.ap(kh.lm_fld, ck_fld + 180, var97, 16776960, 0);
					var97 += 15;
					int var138 = ck_fld + 180 - 80;
					short var164 = 321;
					qv.cx_fld.ad(var138 - 73, var164 - 20);
					var0.ap(kh.lc_fld, var138, var164 + 5, 16777215, 0);
					var138 = 80 + ck_fld + 180;
					qv.cx_fld.ad(var138 - 73, var164 - 20);
					var0.ap(kh.kr_fld, var138, var164 + 5, 16777215, 0);
				} else if (33 == co_fld) {
					short var100 = 201;
					var0.ap(ci_fld, ck_fld + 180, var100, 16776960, 0);
					int var101 = var100 + 20;
					var1.ap(cj_fld, ck_fld + 180, var101, 16776960, 0);
					var101 += 20;
					var1.ap(ch_fld, 180 + ck_fld, var101, 16776960, 0);
					var101 += 15;
					int var140 = ck_fld + 180;
					short var165 = 276;
					qv.cx_fld.ad(var140 - 73, var165 - 20);
					var2.ap(kh.me_fld, var140, var165 + 5, 16777215, 0);
					var140 = ck_fld + 180;
					var165 = 326;
					qv.cx_fld.ad(var140 - 73, var165 - 20);
					var2.ap(kh.kr_fld, var140, var165 + 5, 16777215, 0);
				} else if (34 == co_fld) {
					short var104 = 201;
					var0.ap(ci_fld, 180 + ck_fld, var104, 16776960, 0);
					int var105 = var104 + 20;
					var1.ap(cj_fld, ck_fld + 180, var105, 16776960, 0);
					var105 += 20;
					var1.ap(ch_fld, ck_fld + 180, var105, 16776960, 0);
					int var142 = 180 + ck_fld;
					short var167 = 276;
					qv.cx_fld.ad(var142 - 73, var167 - 20);
					String var180 = ct.ar_fld != null ? kh.mq_fld : kh.mk_fld;
					var2.ap(var180, var142, 5 + var167, 16777215, 0);
					var142 = 180 + ck_fld;
					var167 = 326;
					qv.cx_fld.ad(var142 - 73, var167 - 20);
					var2.ap(kh.kr_fld, var142, var167 + 5, 16777215, 0);
				}
			}

			if (client.cl_fld >= 10) {
				int[] var107 = new int[4];
				yu.dy(var107);
				yu.dg(bo_fld, 0, 765 + bo_fld, bc.qx_fld);
				ce.lm(do_.bp_fld, bo_fld - 22, client.dv_fld, (byte)15);
				ce.lm(do_.bp_fld, 22 + bo_fld + 765 - 128, client.dv_fld, (byte)-14);
				yu.di(var107);
			}

			jm.ca_fld[cx.kq_fld.as((short)22598) ? 1 : 0].ad(bo_fld + 765 - 40, 463);
			if (client.cl_fld > 5 && ku.gi_fld == xh.ak_fld) {
				if (hc.da_fld != null) {
					int var108 = 5 + bo_fld;
					short var144 = 463;
					byte var169 = 100;
					byte var181 = 35;
					hc.da_fld.ad(var108, var144);
					var0.ap(kh.hv_fld + " " + client.ch_fld, var169 / 2 + var108, var144 + var181 / 2 - 2, 16777215, 0);
					if (ct.ar_fld != null) {
						var1.ap(kh.mq_fld, var169 / 2 + var108, 12 + var144 + var181 / 2, 16777215, 0);
					} else {
						var1.ap(kh.md_fld, var108 + var169 / 2, 12 + var144 + var181 / 2, 16777215, 0);
					}
				} else {
					hc.da_fld = dq.aw(gz.hy_fld, "sl_button", "");
				}
			}
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void ch(String var0, String var1, String var2) {
		ci_fld = var0;
		cj_fld = var1;
		ch_fld = var2;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void ct(String var0, String var1, String var2) {
		ci_fld = var0;
		cj_fld = var1;
		ch_fld = var2;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void cl(String var0, String var1, String var2) {
		ci_fld = var0;
		cj_fld = var1;
		ch_fld = var2;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void dc(String var0, String var1, String var2) {
		ci_fld = var0;
		cj_fld = var1;
		ch_fld = var2;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Ltf;)V"
	)
	static void dh(tf var0) throws FileNotFoundException, EOFException {
		fi var1 = iq.ay();

		while (var1.az()) {
			if (13 == var1.aw_fld) {
				if (34 == co_fld) {
					lu.ai(false, (byte)-77);
				}

				dq_fld = false;
				yu.dj(0, 0, yu.au_fld, yu.ax_fld, 0);
				hu.ce_fld.ao(bo_fld, 0);
				nq.cn_fld.ao(382 + bo_fld, 0);
				hk.cr_fld.ad(bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
				return;
			}

			if (96 == var1.aw_fld) {
				if (du_fld > 0 && null != wt.dk_fld) {
					du_fld--;
				}
			} else if (var1.aw_fld == 97 && du_fld < db_fld && null != bi.dx_fld) {
				du_fld++;
			}
		}

		if (tj.ay_fld == 1 || !gu.hh_fld && 4 == tj.ay_fld) {
			int var2 = bo_fld + 280;
			if (tj.as_fld >= var2 && tj.as_fld <= 14 + var2 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(0, 0, -419100764);
				return;
			}

			if (tj.as_fld >= var2 + 15 && tj.as_fld <= 80 + var2 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(0, 1, -861002735);
				return;
			}

			int var3 = 390 + bo_fld;
			if (tj.as_fld >= var3 && tj.as_fld <= 14 + var3 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(1, 0, 918803123);
				return;
			}

			if (tj.as_fld >= var3 + 15 && tj.as_fld <= 80 + var3 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(1, 1, -1903270211);
				return;
			}

			int var4 = 500 + bo_fld;
			if (tj.as_fld >= var4 && tj.as_fld <= 14 + var4 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(2, 0, 1118814161);
				return;
			}

			if (tj.as_fld >= 15 + var4 && tj.as_fld <= var4 + 80 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(2, 1, -886662936);
				return;
			}

			int var5 = 610 + bo_fld;
			if (tj.as_fld >= var5 && tj.as_fld <= var5 + 14 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(3, 0, -1154533073);
				return;
			}

			if (tj.as_fld >= var5 + 15 && tj.as_fld <= 80 + var5 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(3, 1, 776221522);
				return;
			}

			if (tj.as_fld >= bo_fld + 708 && tj.ar_fld >= 4 && tj.as_fld <= 708 + bo_fld + 50 && tj.ar_fld <= 20) {
				if (34 == co_fld) {
					lu.ai(false, (byte)-89);
				}

				dq_fld = false;
				yu.dj(0, 0, yu.au_fld, yu.ax_fld, 0);
				hu.ce_fld.ao(bo_fld, 0);
				nq.cn_fld.ao(382 + bo_fld, 0);
				hk.cr_fld.ad(bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
				return;
			}

			if (ds_fld != -1) {
				ct var6 = yd.ae_fld[ds_fld];
				boolean var7 = bp.ak(client.gt_fld, wu.ai_fld);
				boolean var8 = ct.cr(var6, 1974474097);
				ku.dc_fld = var8;
				var6.aq_fld = var8 ? "beta" : var6.aq_fld;
				mv.ab(var6, 1546422862);
				if (34 == co_fld) {
					lu.ai(false, (byte)-74);
				}

				dq_fld = false;
				yu.dj(0, 0, yu.au_fld, yu.ax_fld, 0);
				hu.ce_fld.ao(bo_fld, 0);
				nq.cn_fld.ao(bo_fld + 382, 0);
				hk.cr_fld.ad(bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
				if (var7 != var8) {
					cb.as((byte)-93);
				}

				return;
			}

			if (du_fld > 0 && wt.dk_fld != null && tj.as_fld >= 0 && tj.as_fld <= wt.dk_fld.az_fld && tj.ar_fld >= bc.qx_fld / 2 - 50 && tj.ar_fld <= bc.qx_fld / 2 + 50
				)
			 {
				du_fld--;
			}

			if (du_fld < db_fld
				&& null != bi.dx_fld
				&& tj.as_fld >= pf.qw_fld - bi.dx_fld.az_fld - 5
				&& tj.as_fld <= pf.qw_fld
				&& tj.ar_fld >= bc.qx_fld / 2 - 50
				&& tj.ar_fld <= 50 + bc.qx_fld / 2) {
				du_fld++;
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void cn(String var0, String var1, String var2) {
		jz.ac(7);
		cl.ad(var0, var1, var2);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;Lzz;ZI)V"
	)
	static void bh(ub var0, ub var1, zz var2, boolean var3, int var4) throws EOFException {
		if (lr.bx_fld) {
			if (4 == var4) {
				jz.ac(4);
			}
		} else {
			if (var4 == 0) {
				ei.aq(var3);
			} else {
				jz.ac(var4);
			}

			yu.dn();
			byte[] var5 = var0.cb("title.jpg", "", (byte)103);
			hu.ce_fld = qd.ak(var5);
			nq.cn_fld = hu.ce_fld.af();
			ap.aw(var1, client.gt_fld);
			nn.cf_fld = dq.aw(var1, "titlebox", "");
			qv.cx_fld = dq.aw(var1, "titlebutton", "");
			vn.cs_fld = dq.aw(var1, "titlebutton_large", "");
			ij.cp_fld = dq.aw(var1, "play_now_text", "");
			dq.aw(var1, "titlebutton_wide42,1", "");
			bf.cy_fld = qj.ah(var1, "runes", "");
			jm.ca_fld = qj.ah(var1, "title_mute", "");
			yg.cg_fld = dq.aw(var1, "options_radio_buttons,0", "");
			gl.cw_fld = dq.aw(var1, "options_radio_buttons,4", "");
			ik.cm_fld = dq.aw(var1, "options_radio_buttons,2", "");
			ee.cz_fld = dq.aw(var1, "options_radio_buttons,6", "");
			om.cl_fld = yg.cg_fld.az_fld;
			hk.dc_fld = yg.cg_fld.av_fld;
			do_.bp_fld = new ce(bf.cy_fld, var2.aw_fld);
			if (var3) {
				ba_fld = "";
				bq_fld = "";
				cd_fld = new String[8];
				bb_fld = 0;
			}

			pe.cc_fld = 0;
			he.cq_fld = "";
			cv_fld = true;
			dq_fld = false;
			if (cx.kq_fld.as((short)28056)) {
				sx.av(0, 0);
			} else {
				cp.bh("scape main", 255);
			}

			ah.ay();
			ll.hy().ag(false);
			lr.bx_fld = true;
			bo_fld = 1332414199 * ((pf.qw_fld - 765) / 2);
			ck_fld = bo_fld + -999389370;
			bh.cb_fld = 355797204 + ck_fld;
			hu.ce_fld.ao(bo_fld, 0);
			nq.cn_fld.ao(bo_fld + 382, 0);
			hk.cr_fld.ad(bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void dt() {
		if (gv.ak()) {
			dq_fld = true;
			du_fld = 0;
			db_fld = 0;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lub;)I"
	)
	static int be(ub var0) {
		int var1 = di_fld.length + dy_fld.length;
		String[] var2 = dn_fld;

		for (int var3 = 0; var3 < var2.length; var3++) {
			String var4 = var2[var3];
			if (var0.cm(var4, (byte)1) != -1) {
				var1++;
			}
		}

		return var1;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static void dr(String var0) {
		ct_fld = rj.ae(var0);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void do_(int var0) {
		if (co_fld != var0) {
			co_fld = var0;
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void ce(String var0, String var1, String var2) {
		jz.ac(7);
		cl.ad(var0, var1, var2);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static void da(String var0) {
		ct_fld = rj.ae(var0);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int cm(int var0, int var1) {
		for (int var2 = 0; var2 < 8; var2++) {
			if (var1 <= 30 + var0) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	static {
		new DecimalFormat("##0.00");
		new st();
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	static void dk(int var0, String var1) {
		bv_fld = var1;
		bt_fld = 1920127839 * var0;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	static void dx(int var0, String var1) {
		bv_fld = var1;
		bt_fld = var0;
	}

	bn() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;)V"
	)
	static final void cc(dx var0, da var1) {
		int var3 = -1;
		boolean var4 = false;
		boolean var5 = var1.cg_fld.ak_fld == ll.ag_fld || var1.dm_fld == 0 || var1.dl_fld > 0;
		if (var1.ea() && var5) {
			var3 = var1.cg_fld.af_fld * 1878866955;
			var4 = var1.cg_fld.az_fld;
			var1.mt();
		} else if (var1.tr() && var1.ti()) {
			int var13 = var1.cg_fld.aw_fld * 891348101 - var0.ay_fld;
			var13 = (var13 << 7) + 64;
			int var21 = var1.cg_fld.ay_fld * -387169145 - var0.as_fld;
			int var22 = (var21 << 7) + 64;
			int var23 = var1.cg_fld.aw_fld * 891348101 + (var1.cg_fld.as_fld * 1129140675 - 1) - var0.ay_fld;
			int var24 = (var23 << 7) + 64;
			int var25 = var1.cg_fld.ay_fld * -387169145 + (var1.cg_fld.ar_fld * 580185587 - 1) - var0.as_fld;
			int var26 = (var25 << 7) + 64;
			int var19 = (var13 + var24) / 2;
			int var11 = (var22 + var26) / 2;
			int var12 = da.kj(var1, var0, var0, var19, var11);
			var3 = var12 == -1 ? var1.dv_fld : var12;
			var4 = var1.cg_fld.az_fld;
			var1.cg_fld.az_fld = false;
		} else if (var1.fi()) {
			dx var9 = null;
			xl var10 = null;
			if (var1.cg_fld.av_fld == kx.ag_fld) {
				var9 = cx.yj(var1.cg_fld.ae_fld * 974676213, client.da_fld);
				var10 = (xl)var9.ax_fld.ss(var1.cg_fld.ae_fld * 974676213);
			} else if (var1.cg_fld.av_fld == kx.az_fld) {
				int var6 = var1.cg_fld.ae_fld * 974676213;
				var9 = cx.tc(var6, client.da_fld);
				var10 = (xl)var9.au_fld.ss(var6);
			} else if (var1.cg_fld.av_fld == kx.av_fld) {
				int var14 = var1.cg_fld.ae_fld * 974676213;
				var9 = bw.dk_fld;
				var10 = (xl)var9.an_fld.get(var14);
			}

			if (var10 != null) {
				int var7 = var10.gb();
				int var8 = var10.wc();
				int var15 = da.kj(var1, var0, var9, var7, var8);
				var3 = var15 == -1 ? var1.dv_fld : var15;
			} else if (var1.cg_fld.ah_fld * 1149746715 != -1) {
				var3 = var1.cg_fld.ah_fld * 1149746715;
			} else if (var1.bj_fld) {
				var1.cg_fld.av_fld = kx.ak_fld;
				var1.cg_fld.ae_fld = -1 * 1672039261;
				var1.cg_fld.ah_fld = -1 * 1321528339;
				var1.bj_fld = false;
			}
		}

		if (var3 == -1 && var1.dm_fld > 0 && var1.wf()) {
			var3 = var1.ib();
		}

		var1.dv_fld = var3 != -1 ? var3 : var1.dv_fld;
		if (var4) {
			var1.bt_fld = var1.dv_fld;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;"
	)
	static co av(int var0, int var1) {
		bq var3 = (bq)(bq)cz.ak_fld.get(var0);
		return var3.ag(var1, -1734639500);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;)I"
	)
	static int bd(ub var0, ub var1) throws EOFException {
		int var2 = 0;
		String[] var3 = dy_fld;

		for (int var4 = 0; var4 < var3.length; var4++) {
			String var5 = var3[var4];
			if (var0.co(var5, "", 269172734)) {
				var2++;
			}
		}

		var3 = di_fld;

		for (int var8 = 0; var8 < var3.length; var8++) {
			String var10 = var3[var8];
			if (var1.co(var10, "", 517244716)) {
				var2++;
			}
		}

		var3 = dn_fld;

		for (int var9 = 0; var9 < var3.length; var9++) {
			String var11 = var3[var9];
			if (var1.cm(var11, (byte)1) != -1 && var1.co(var11, "", 923809259)) {
				var2++;
			}
		}

		return var2;
	}
}
