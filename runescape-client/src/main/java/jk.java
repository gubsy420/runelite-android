import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jk")
public class jk {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ad_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cx_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ai_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean az(int var0) {
		return var0 >= kn.ao_fld.at_fld && var0 <= kn.ab_fld.at_fld;
	}

	jk() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static final void gw(String var0) {
		if (!var0.equals("")) {
			jm var2 = gi.ak(jb.cm_fld, client.aq_fld.av_fld);
			var2.ay_fld.bc(iq.bu(var0));
			var2.ay_fld.cc(var0, 2069175604);
			client.aq_fld.az(var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	static void af(int var0, byte var1) throws EOFException {
		if (var0 == client.cl_fld) {
			if (var1 != 1) {
				;
			}
		} else {
			if (client.cl_fld == 30) {
				fu.xp(client.fy_fld, -1652016426);
			}

			if (0 == client.cl_fld) {
				tf.er(og.ci_fld, -968541318);
			}

			label129: {
				if (var0 != 20 && var0 != 40 && var0 != 45) {
					if (var0 != 50) {
						break label129;
					}

					if (var1 == 1) {
						return;
					}
				}

				ot.hw(cj.ak_fld);
				client.ic_fld = 0;
				client.in_fld = 0;
				lj.az(client.ls_fld, var0);
				if (20 != var0) {
					ik.bz(false, -937431811);
				}
			}

			if (20 != var0 && var0 != 40 && null != ky.lm_fld) {
				ky.lm_fld.ah((byte)41);
				ky.lm_fld = null;
			}

			if (25 == client.cl_fld) {
				client.jo_fld = 0;
				client.jm_fld = 0;
				client.jg_fld = -617346361;
				client.jw_fld = 0;
				client.jv_fld = -1525516535;
			}

			if (5 == var0 || 10 == var0) {
				int var3 = yx.hl() ? 0 : 12;
				ju.az(by.ho_fld, gz.hy_fld, cz.lg_fld, true, var3, (byte)22);
			} else if (20 == var0) {
				int var2 = 11 == client.cl_fld ? 4 : 0;
				ju.az(by.ho_fld, gz.hy_fld, cz.lg_fld, false, var2, (byte)45);
			} else if (var0 == 11) {
				ju.az(by.ho_fld, gz.hy_fld, cz.lg_fld, false, 4, (byte)-23);
			} else if (var0 == 50) {
				if (var1 == 1) {
					return;
				}

				cl.ad("", "Updating date of birth...", "");
				ju.az(by.ho_fld, gz.hy_fld, cz.lg_fld, false, 7, (byte)25);
			} else if (var0 != 0 && lr.bx_fld) {
				nn.cf_fld = null;
				qv.cx_fld = null;
				bf.cy_fld = null;
				hu.ce_fld = null;
				nq.cn_fld = null;
				hk.cr_fld = null;
				jm.ca_fld = null;
				yg.cg_fld = null;
				ik.cm_fld = null;
				ui.do_fld = null;
				bt.dd_fld = null;
				hk.dl_fld = null;
				gx.dr_fld = null;
				hc.da_fld = null;
				ce.kz(do_.bp_fld, 241117523);
				sx.av(0, 100);
				ll.hy().ag(true);
				lr.bx_fld = false;
				client.hw();
			}

			client.cl_fld = var0;
			client.fr();
		}
	}

	@ObfuscatedName("agp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	protected static final void agp() {
		bl.rf_fld.ak((byte)0);

		for (int var1 = 0; var1 < 32; var1++) {
			tf.ro_fld[var1] = 0L;
		}

		for (int var2 = 0; var2 < 32; var2++) {
			tf.rz_fld[var2] = 0L;
		}

		lq.ry_fld = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	static void ag(int var0, int var1, int var2) {
		int[] var3 = new int[4];
		int[] var4 = new int[4];
		var3[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var6 = 0; var6 < 4; var6++) {
			if (ct.as_fld[var6] != var0) {
				if (var2 == 797777063) {
					return;
				}

				var3[var5] = ct.as_fld[var6];
				var4[var5] = ct.ay_fld[var6];
				var5++;
			}
		}

		ct.as_fld = var3;
		ct.ay_fld = var4;
		cf.az(yd.ae_fld, 0, yd.ae_fld.length - 1, ct.as_fld, ct.ay_fld, -1489437064);
	}
}
