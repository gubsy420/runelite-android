import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ju")
public class ju implements xm {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static ju ae_fld = new ju("game5", "Game 5", 4);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static ju az_fld = new ju("game3", "Game 3", 2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static ju av_fld = new ju("game4", "Game 4", 3);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static ju ag_fld = new ju("stellardawn", "Stellar Dawn", 1);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	static ju ak_fld = new ju("runescape", "RuneScape", 0);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String aw_fld;
	@ObfuscatedGetter(
		intValue = 2129464951
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int at_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public static ju ah_fld = new ju("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ay_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ay_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()[Lju;"
	)
	public static ju[] as() {
		return new ju[]{ah_fld, av_fld, ae_fld, az_fld, ag_fld, ak_fld};
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(Lyl;I)[Ljava/lang/Object;"
	)
	public static Object[] vl(yl var0, int var1) {
		return (Object[])(null == var0.az_fld ? null : var0.az_fld[var1]);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ay_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[Lju;"
	)
	public static ju[] ar() {
		return new ju[]{ah_fld, av_fld, ae_fld, az_fld, ag_fld, ak_fld};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lju;"
	)
	public static ju[] az() {
		return new ju[]{ah_fld, av_fld, ae_fld, az_fld, ag_fld, ak_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lju;"
	)
	public static ju[] aw() {
		return new ju[]{ah_fld, av_fld, ae_fld, az_fld, ag_fld, ak_fld};
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lpp;IJ)J"
	)
	public static long hi(pp var0, int var1, long var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		return hq.az(var0.ep_fld, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lju;"
	)
	public static ju[] ay() {
		return new ju[]{ah_fld, av_fld, ae_fld, az_fld, ag_fld, ak_fld};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ay_fld;
	}

	ju(String var1, String var2, int var3) {
		this.aw_fld = var1;
		this.ay_fld = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;Lzz;ZIB)V"
	)
	static void az(ub var0, ub var1, zz var2, boolean var3, int var4, byte var5) throws EOFException {
		client.rx(var0, var1, var2, var3, var4);
		if (lr.bx_fld) {
			if (var5 == 0) {
				client.zx(var0, var1, var2, var3, var4);
			} else {
				if (4 == var4) {
					jz.ac(4);
				}

				client.zx(var0, var1, var2, var3, var4);
			}
		} else {
			if (var4 == 0) {
				ei.aq(var3);
			} else {
				jz.ac(var4);
			}

			yu.dn();
			byte[] var6 = var0.cb("title.jpg", "", (byte)85);
			hu.ce_fld = qd.ak(var6);
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
				if (var5 == 0) {
					client.zx(var0, var1, var2, var3, var4);
					return;
				}

				bn.ba_fld = "";
				client.lq();
				bn.bq_fld = "";
				bn.cd_fld = new String[8];
				bn.bb_fld = 0;
			}

			pe.cc_fld = 0;
			he.cq_fld = "";
			bn.cv_fld = true;
			bn.dq_fld = false;
			if (cx.kq_fld.as((short)22901)) {
				sx.av(0, 0);
			} else {
				cp.bh("scape main", 255);
			}

			ah.ay();
			ll.hy().ag(false);
			lr.bx_fld = true;
			client.hw();
			bn.bo_fld = 1332414199 * ((pf.qw_fld - 765) / 2);
			bn.ck_fld = bn.bo_fld + -999389370;
			bh.cb_fld = 355797204 + bn.ck_fld;
			hu.ce_fld.ao(bn.bo_fld, 0);
			nq.cn_fld.ao(bn.bo_fld + 382, 0);
			hk.cr_fld.ad(bn.bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
			client.zx(var0, var1, var2, var3, var4);
		}
	}
}
