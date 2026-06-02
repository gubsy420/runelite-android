import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oz")
public class oz extends vc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ak_fld = new iw(64);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	static byte ah_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int at_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int bg(int var0, ba var1, boolean var2) throws EOFException {
		try {
			if (6500 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gv.ak() ? 1 : 0;
				return 1;
			} else if (6501 == var0) {
				ct var17 = gk.aw();
				if (null != var17) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17.af_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17.al_fld;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var17.an_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17.aa_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17.au_fld;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var17.ax_fld;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				}

				return 1;
			} else if (6502 == var0) {
				ct var16 = ey.ay();
				if (var16 != null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16.af_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16.al_fld;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var16.an_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16.aa_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16.au_fld;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var16.ax_fld;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				}

				return 1;
			} else if (var0 == 6506) {
				int var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ct var24 = null;

				for (int var30 = 0; var30 < ct.ah_fld; var30++) {
					if (-407267201 * yd.ae_fld[var30].af_fld == var15) {
						var24 = yd.ae_fld[var30];
						break;
					}
				}

				if (null != var24) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var24.af_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var24.al_fld;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var24.an_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var24.aa_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var24.au_fld;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var24.ax_fld;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				}

				return 1;
			} else if (var0 == 6507) {
				gz.ax_fld -= 4;
				int var14 = bp.au_fld[gz.ax_fld];
				boolean var23 = bp.au_fld[gz.ax_fld + 1] == 1;
				int var29 = bp.au_fld[2 + gz.ax_fld];
				boolean var7 = bp.au_fld[3 + gz.ax_fld] == 1;
				tw.av(var14, var23, var29, var7, -1109727321);
				return 1;
			} else if (6511 == var0) {
				int var13 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (var13 >= 0 && var13 < ct.ah_fld) {
					ct var22 = yd.ae_fld[var13];
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.af_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.al_fld;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var22.an_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.aa_fld;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.au_fld;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var22.ax_fld;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				}

				return 1;
			} else if (6512 == var0) {
				client.eq_fld = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (var0 == 6513) {
				gz.ax_fld -= 2;
				int var12 = bp.au_fld[gz.ax_fld];
				int var21 = bp.au_fld[1 + gz.ax_fld];
				px var28 = kb.ag_px(var21, -735774509);
				if (var28.aw()) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ca.az(var12).ax(var21, var28.as_fld, (byte)30);
				} else if (px.ll(var28, (short)10000)) {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ca.az(var12).au(var21, var28.ay_fld);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = pp.kt(ca.az(var12), var21, var28.aw_fld, (byte)0);
				}

				return 1;
			} else if (var0 == 6514) {
				gz.ax_fld -= 2;
				int var11 = bp.au_fld[gz.ax_fld];
				int var20 = bp.au_fld[gz.ax_fld + 1];
				px var27 = kb.ag_px(var20, -1076937145);
				if (var27.aw()) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ko.az(var11).ai(var20, var27.as_fld, -1233003183);
				} else if (px.ll(var27, (short)10000)) {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ko.az(var11).aa(var20, var27.ay_fld);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ko.az(var11).an(var20, var27.aw_fld, -2126021483);
				}

				return 1;
			} else if (var0 == 6515) {
				gz.ax_fld -= 2;
				int var10 = bp.au_fld[gz.ax_fld];
				int var19 = bp.au_fld[gz.ax_fld + 1];
				px var26 = kb.ag_px(var19, -1099583768);
				if (var26.aw()) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = og.sw(kb.ag(var10, -1752383175), var19, var26.as_fld, (byte)59);
				} else if (px.ll(var26, (short)10000)) {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = og.pv(kb.ag(var10, -1752383175), var19, var26.ay_fld);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var10, -1752383175).ad(var19, var26.aw_fld, -1190576956);
				}

				return 1;
			} else if (6516 == var0) {
				gz.ax_fld -= 2;
				int var9 = bp.au_fld[gz.ax_fld];
				int var18 = bp.au_fld[1 + gz.ax_fld];
				px var25 = kb.ag_px(var18, -1928113232);
				if (var25.aw()) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = cr.ak(var9).aw(var18, var25.as_fld, 1087418095);
				} else if (px.ll(var25, (short)10000)) {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = pw.bv(cr.ak(var9), var18, var25.ay_fld);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cr.ak(var9).ae(var18, var25.aw_fld, -1466857487);
				}

				return 1;
			} else if (var0 == 6518) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gz_fld ? 1 : 0;
				return 1;
			} else if (6519 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gd_fld;
				return 1;
			} else if (6520 == var0) {
				return 1;
			} else if (6521 == var0) {
				return 1;
			} else if (6522 == var0) {
				ef.aq_fld--;
				gz.ax_fld--;
				return 1;
			} else if (var0 == 6523) {
				ef.aq_fld--;
				gz.ax_fld--;
				return 1;
			} else if (var0 == 6524) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				return 1;
			} else if (var0 == 6525) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				return 1;
			} else if (6526 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				return 1;
			} else if (6527 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gy_fld;
				return 1;
			} else if (var0 == 6528) {
				gz.ax_fld -= 2;
				int var4 = bp.au_fld[gz.ax_fld];
				int var5 = bp.au_fld[1 + gz.ax_fld];
				px var6 = kb.ag_px(var5, 69716761);
				if (var6.aw()) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = lg.ak(var4, 1850431589).ae(var5, var6.as_fld);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lg.ak(var4, 1416199934).av(var5, var6.aw_fld, 2011751109);
				}

				return 1;
			} else if (var0 == 6531) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 238;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				return 1;
			} else {
				return 2;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	oz() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void az() {
		ak_fld.vh();
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static final int ch() throws EOFException {
		try {
			if (cx.kq_fld.ae((byte)-81)) {
				return bw.dk_fld.ae_fld;
			} else {
				int var1 = ke.jd_fld >> 7;
				int var2 = gk.jc_fld >> 7;
				if (!bw.dk_fld.ae(var1, var2, -746282980)) {
					return bw.dk_fld.ae_fld;
				} else {
					int var3 = jf.dv(bw.dk_fld, ke.jd_fld, gk.jc_fld, bw.dk_fld.ae_fld);
					return var3 - cs.jy_fld < 800 && 0 != (bw.dk_fld.al_fld[bw.dk_fld.ae_fld][var1][var2] & 4) ? bw.dk_fld.ae_fld : 3;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ak_fld.vh();
	}
}
