import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("of")
public class of {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of ay_fld = new of(7);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of ag_fld = new of(1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of az_fld = new of(2);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of ak_fld = new of(0);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of ae_fld = new of(4);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static of al_fld = new of(11);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of ax_fld = new of(13);
	@ObfuscatedGetter(
		intValue = 1647528853
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aa_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of as_fld = new of(8);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of ar_fld = new of(9);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of af_fld = new of(10);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of aw_fld = new of(6);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static of au_fld = new of(12);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static of av_fld = new of(3);
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static of ah_fld = new of(5);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	static int ax() {
		if (null != client.py_fld && client.pz_fld < client.py_fld.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= client.pz_fld; var2++) {
				var1 += ((dq)client.py_fld.get(var2)).av_fld * -2117186421;
			}

			return 10000 * var1 / client.pj_fld;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(Loy;Lxi;I)V"
	)
	public static void pw(oy var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		switch (var2) {
			case 2:
				var0.by_fld = var1.cg() * 1181419444;
			case 3:
			case 10:
			case 11:
			case 13:
			case 21:
			case 22:
			default:
				break;
			case 4:
				var0.bm_fld = var1.cz() * -1371700209;
				break;
			case 5:
				var0.bd_fld = var1.cz() * -1128046032;
				break;
			case 6:
				var0.bz_fld = var1.cz();
				break;
			case 7:
				var0.br_fld = var1.cz() * 556078522;
				break;
			case 8:
				var0.be_fld = xi.tx(var1, 930652541);
				break;
			case 9:
				var0.bs_fld = xi.tx(var1, 1086880211) * -1122161708;
				break;
			case 12:
				var0.at_fld = xi.kc(var1, -1609502902);
				break;
			case 14:
				var0.aj_fld = true;
				break;
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				int var5 = var2 - 15;
				var0.ac_fld[var5] = xi.kc(var1, 508518201);
				if (var0.ac_fld[var5].equalsIgnoreCase(kh.ao_fld)) {
					var0.ac_fld[var5] = null;
				}

				var0.aj_fld = true;
				break;
			case 20:
				xi.tx(var1, 1669419760);
				break;
			case 23:
				kt[] var3 = new kt[]{kt.ak_fld, kt.ag_fld, kt.az_fld, kt.av_fld};
				var0.bl_fld = (kt)ka.ak(var3, var1.cg());
				break;
			case 24:
				jf[] var4 = new jf[]{jf.ak_fld, jf.ag_fld, jf.az_fld};
				var0.bx_fld = (jf)ka.ak(var4, var1.cg());
				break;
			case 25:
				var0.bh_fld = xi.tx(var1, 1300747974) * -2067169532;
				break;
			case 26:
				var0.bo_fld = var1.do_();
				break;
			case 27:
				var0.bp_fld = xi.tx(var1, 1909141280) * 53820900;
		}
	}

	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)V"
	)
	public static void sv(li var0, int var1) {
		var0.am_fld.aw(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void ap(int var0) throws EOFException, UnsupportedEncodingException {
		kx.ab((short)-18934);
		switch (var0) {
			case 1:
				hg.at(-2092818622);
				break;
			case 2:
				jz.ac(24);
				cl.ad(kh.jx_fld, kh.jf_fld, kh.js_fld);
		}
	}

	of(int var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	public static float ak(int var0) {
		var0 &= 2047;
		return (float)(var0 / 2048.0F * (Math.PI * 2));
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)I"
	)
	public static int fv(qa var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ai() {
		if (bw.dk_fld != null) {
			bw.dk_fld.az_fld.cg(cn.ka(cx.kq_fld, (byte)1));
		}
	}

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "(Lwl;III)Lgf;"
	)
	public static gf yt(wl var0, int var1, int var2, int var3) {
		Iterator var4 = var0.ao_fld.values().iterator();

		while (var4.hasNext()) {
			gf var5 = (gf)(gf)var4.next();
			if (var5.az(var1, var2, var3, (byte)27)) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lwq;IIZ)V"
	)
	static final void dl(wq var0, int var1, int var2, boolean var3) throws ExecutionException, InterruptedException, EOFException {
		if (var3 || var1 != ef.jb_fld || var2 != cz.jt_fld) {
			if (!client.$assertionsDisabled && client.ul_fld != null) {
				throw new AssertionError();
			}

			if (client.ul_fld != null) {
				client.ii_fld.error("Loading map {},{},{} while another map load is in progress!", (Object[])(new Object[]{var1, var2, var3}));
				client.ul_fld.it();
				client.qn("concurrent map load", null);
			}

			rl4 var5 = new rl4(client.fa_fld, client.wo_fld, bw.dk_fld, client.qf_fld);
			var5.yl_int = (var1 - 6) * 8;
			var5.nv_fld = (var2 - 6) * 8;
			var5.vj_int = var1;
			var5.wq_fld = var2;
			var5.me_fld = hk.mt_fld.ae_fld;
			if (!client.$assertionsDisabled && client.al_boolean) {
				throw new AssertionError();
			}

			if (client.cl_fld != 30) {
				client.yv(var5);
				if (!client.$assertionsDisabled && client.cl_fld != 25) {
					throw new AssertionError();
				}

				client.je_rl4 = null;
			} else {
				client.qf_fld = client.ll_wq;
				client.al_boolean = true;
				hk.mt_fld.ae_fld = hk.mt_fld.xn_fld;
				if (!client.$assertionsDisabled && client.je_rl4 != null) {
					throw new AssertionError();
				}
			}

			client.ul_fld = var5;
			var5.gb();
		}
	}
}
