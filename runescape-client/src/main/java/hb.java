import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hb")
public class hb {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int et_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public static hb ak_fld = new hb(1, 0, 3);
	@ObfuscatedGetter(
		intValue = 523500039
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public static hb ag_fld = new hb(2, 1, 2);
	@ObfuscatedGetter(
		intValue = 974792281
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 1512025203
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	static byte[][] lv_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public static hb az_fld = new hb(0, 2, 0);
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bi_fld;
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lyt;"
	)
	static yt kt_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lhb;"
	)
	static hb ag(int var0) {
		hb[] var2 = ak();

		for (int var3 = 0; var3 < var2.length; var3++) {
			hb var4 = var2[var3];
			if (var4.ae_fld == var0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(F)Z"
	)
	boolean ay(float var1) {
		return var1 >= this.ah_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	static long at() {
		return client.nc_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(F)Z"
	)
	boolean az(float var1) {
		return var1 >= this.ah_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()[Lhb;"
	)
	static hb[] av() {
		return new hb[]{az_fld, ak_fld, ag_fld};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[Lhb;"
	)
	static hb[] ae() {
		return new hb[]{az_fld, ak_fld, ag_fld};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lhb;"
	)
	static hb ah(int var0) {
		hb[] var1 = ak();

		for (int var2 = 0; var2 < var1.length; var2++) {
			hb var3 = var1[var2];
			if (var3.ae_fld == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(F)Z"
	)
	boolean aw(float var1) {
		return var1 >= this.ah_fld;
	}

	hb(int var1, int var2, int var3) {
		this.av_fld = var1;
		this.ae_fld = var2;
		this.ah_fld = var3;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Ldx;)Z"
	)
	static boolean cu(rg var0, dx var1) {
		for (int var3 = 0; var3 < client.db_fld.al_fld; var3++) {
			cv var4 = (cv)var1.au_fld.ak(client.db_fld.az_fld[var3]);
			if (lg.cb(var0, var4)) {
				return true;
			}
		}

		for (int var7 = 0; var7 < var1.ad_fld.az(); var7++) {
			ds var9 = (ds)var1.ax_fld.ak(var1.ad_fld.ag(var7));
			if (var9 != null && pp.es(var9.ah_fld, (byte)24).as(-440698366) && lg.cb(var0, var9)) {
				return true;
			}
		}

		uf var8 = qo.av(var0.av_fld, var0.aw_fld.al(1755258691));

		for (int var10 = 0; var10 < var1.am_fld.az(); var10++) {
			rg var5 = (rg)var1.an_fld.ak(var1.am_fld.ag(var10));
			if (var5 != null && var0 != var5 && client.dv_fld == var5.ah_fld.az_fld.by_fld) {
				uf var6 = qo.av(var5.av_fld, var5.aw_fld.al(1755258691));
				if (var8.ae(var6)) {
					var8.ak(138536557);
					var6.ak(384396867);
					return true;
				}

				var6.ak(-599200901);
			}
		}

		var8.ak(325589643);
		return false;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IZB)V"
	)
	static void cw(dx var0, int var1, boolean var2, byte var3) throws EOFException {
		cv var4 = (cv)var0.au_fld.ak(var1);
		if (null != var4 && var4.bm(1575376834)) {
			if (var3 >= 33) {
				return;
			}

			if (!var4.at_fld) {
				int var5 = var4.ac_fld * 956740035;
				var4.ab_fld = false;
				if ((client.gk_fld && client.db_fld.al_fld > 50 || client.db_fld.al_fld > 200) && var2 && var4.dt((byte)114) == var4.bi_fld) {
					var4.ab_fld = true;
				}

				int var6 = var4.bo_fld >> 7;
				int var7 = var4.bp_fld >> 7;
				if (var0.ae(var6, var7, 1049173337)) {
					long var8 = dt.ay(0, 0, 0, 0, false, var4.bx_fld, var0.ag_fld);
					boolean var10 = false;
					if (null != var4.ai_fld && client.dv_fld >= var4.af_fld && client.dv_fld < var4.al_fld) {
						var4.ab_fld = false;
						var4.ar_fld = gl.dt(var0, var4.bo_fld, var4.bp_fld, var5, var4.br((byte)115));
						var4.bs_fld = client.dv_fld;
						var10 = var0.az_fld.bf(var5, var4.bo_fld, var4.bp_fld, var4.ar_fld, 60, var4, var4.bt_fld, var8, var4.aq_fld, var4.am_fld, var4.ad_fld, var4.ao_fld);
					} else {
						if (64 == (var4.bo_fld & 127) && (var4.bp_fld & 127) == 64) {
							if (client.mi_fld == var0.ar_fld[var6][var7]) {
								return;
							}

							var0.ar_fld[var6][var7] = client.mi_fld;
						}

						var4.ar_fld = gl.dt(var0, var4.bo_fld, var4.bp_fld, var5, var4.br((byte)92));
						var4.bs_fld = client.dv_fld;
						var10 = var0.az_fld.bj(var5, var4.bo_fld, var4.bp_fld, var4.ar_fld, 60, var4, var4.bt_fld, var8, var4.an_fld);
					}

					if (var10) {
						int var11 = var4.ar_fld;
						if (var4.co_fld != 0) {
							client.du_fld.ak(var4.cb_fld);

							for (rq var12 = (rq)client.du_fld.az(); null != var12; var12 = (rq)(rq)client.du_fld.next()) {
								if (client.dv_fld >= var12.az_fld) {
									long var13 = var12.ak((byte)-67) ? var8 : -1L;
									var0.az_fld.bl(var5, var4.bo_fld, var4.bp_fld, var11, var12, var4.bt_fld, var13);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Lhb;"
	)
	static hb[] ak() {
		return new hb[]{az_fld, ak_fld, ag_fld};
	}
}
