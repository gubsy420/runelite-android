import java.io.EOFException;
import java.io.UnsupportedEncodingException;
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
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1647528853
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
		descriptor = "(B)I"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
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
		descriptor = "(II)F"
	)
	public static float ak(int var0) {
		var0 &= 2047;
		return (float)(var0 / 2048.0F * (Math.PI * 2));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static void ai() {
		if (bw.dk_fld != null) {
			bw.dk_fld.az_fld.al(cx.kq_fld.ax((byte)1));
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Lwq;IIZI)V"
	)
	static final void dl(wq var0, int var1, int var2, boolean var3) throws ExecutionException, InterruptedException, EOFException {
		if (var3 || var1 != ef.jb_fld || var2 != cz.jt_fld) {
			if (!client.$assertionsDisabled && client.sw_fld != null) {
				throw new AssertionError();
			}

			if (client.sw_fld != null) {
				client.logger.error("Loading map {},{},{} while another map load is in progress!", (Object[])(new Object[]{var1, var2, var3}));
				client.sw_fld.ya();
				client.ua("concurrent map load", null);
			}

			rl4 var5 = new rl4(client.bt_fld, client.yk_fld, bw.dk_fld, client.qf_fld);
			var5.gh_fld = (var1 - 6) * 8;
			var5.vu_fld = (var2 - 6) * 8;
			var5.be_fld = var1;
			var5.hs_int = var2;
			var5.xf_fld = hk.mt_fld.ae_fld;
			if (!client.$assertionsDisabled && client.vf_fld) {
				throw new AssertionError();
			}

			if (client.cl_fld != 30) {
				client.pz(var5);
				if (!client.$assertionsDisabled && client.cl_fld != 25) {
					throw new AssertionError();
				}

				client.la_rl4 = null;
			} else {
				client.qf_fld = client.td_fld;
				client.vf_fld = true;
				hk.mt_fld.ae_fld = hk.mt_fld.hc_int;
				if (!client.$assertionsDisabled && client.la_rl4 != null) {
					throw new AssertionError();
				}
			}

			client.sw_fld = var5;
			var5.wp();
		}
	}
}
