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
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 523500039
	)
	int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public static hb ag_fld = new hb(2, 1, 2);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 974792281
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1512025203
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

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(Lyl;Lxi;I)V"
	)
	public static void rb(yl var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == 3) {
			int var3 = var1.cg();
			if (var0.az_fld == null) {
				var0.az_fld = (Object[][])(new Object[var3][]);
				var0.av_fld = new int[var3][];
			}

			for (int var4 = var1.cg(); var4 != 255; var4 = var1.cg()) {
				int var5 = var1.cg();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = var1.dz();
				}

				var0.az_fld[var4] = (Object[])wu.av(var1, var6);
				var0.av_fld[var4] = var6;
			}
		} else if (4 == var2) {
			var0.ae_fld = var1.dr();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;"
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

	@ObfuscatedName("xu")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIZ)Z"
	)
	public static boolean xu(ev var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.cz(var0.et_fld, var1, var2, var3, var4, var5);
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
		descriptor = "(B)J"
	)
	static long at() {
		return client.nc_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)Z"
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
		descriptor = "(Lrg;Ldx;B)Z"
	)
	static boolean cu(rg var0, dx var1) {
		for (int var3 = 0; var3 < client.db_fld.al_fld; var3++) {
			cv var4 = (cv)var1.au_fld.ae(client.db_fld.ar_fld[var3]);
			if (lg.cb(var0, var4)) {
				return true;
			}
		}

		for (int var7 = 0; var7 < var1.am_fld.az(); var7++) {
			ds var9 = (ds)var1.ax_fld.ae(yw.wk(var1.am_fld, var7, (byte)112));
			if (var9 != null && pp.ij(var9.ah_fld, (byte)24).ak(-440698366) && lg.cb(var0, var9)) {
				return true;
			}
		}

		uf var8 = qo.av(var0.av_fld, var0.aw_fld.al(1755258691));

		for (int var10 = 0; var10 < var1.ad_fld.az(); var10++) {
			rg var5 = (rg)var1.an_fld.ak(yw.wk(var1.ad_fld, var10, (byte)118));
			if (var5 != null && var0 != var5 && client.dv_fld == var5.ah_fld.az_fld.bp_fld) {
				uf var6 = qo.av(var5.av_fld, var5.aw_fld.al(1755258691));
				if (uf.py(var8, var6, 2133316190)) {
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
		cv var4 = (cv)var0.au_fld.ae(var1);
		if (null != var4 && var4.bm(1575376834)) {
			if (var3 >= 33) {
				return;
			}

			if (!var4.at_fld) {
				int var5 = var4.aq_fld * 956740035;
				var4.ab_fld = false;
				if ((client.gk_fld && client.db_fld.al_fld > 50 || client.db_fld.al_fld > 200) && var2 && var4.dt((byte)114) == var4.cr_fld) {
					var4.ab_fld = true;
				}

				int var6 = var4.bi_fld >> 7;
				int var7 = var4.dm_fld >> 7;
				if (var0.ae(var6, var7, 1049173337)) {
					long var8 = dt.ay(0, 0, 0, 0, false, var4.bq_fld, var0.ag_fld);
					boolean var10 = false;
					if (null != var4.ai_fld && client.dv_fld >= var4.ae_fld && client.dv_fld < var4.as_fld) {
						var4.ab_fld = false;
						var4.am_fld = gl.dt(var0, var4.bi_fld, var4.dm_fld, var5, var4.br((byte)115));
						var4.cn_fld = client.dv_fld;
						var10 = var0.az_fld.bf(var5, var4.bi_fld, var4.dm_fld, var4.am_fld, 60, var4, var4.bc_fld, var8, var4.ay_fld, var4.ah_fld, var4.ar_fld, var4.bz_fld);
					} else {
						if (64 == (var4.bi_fld & 127) && (var4.dm_fld & 127) == 64) {
							if (client.mi_fld == var0.ar_fld[var6][var7]) {
								return;
							}

							var0.ar_fld[var6][var7] = client.mi_fld;
						}

						var4.am_fld = gl.dt(var0, var4.bi_fld, var4.dm_fld, var5, var4.br((byte)92));
						var4.cn_fld = client.dv_fld;
						var10 = var0.az_fld.bj(var5, var4.bi_fld, var4.dm_fld, var4.am_fld, 60, var4, var4.bc_fld, var8, var4.an_fld);
					}

					if (var10) {
						int var11 = var4.am_fld;
						if (var4.da_fld != 0) {
							client.du_fld.ak(var4.cb_fld);

							for (rq var12 = (rq)client.du_fld.az(); null != var12; var12 = (rq)(rq)client.du_fld.next()) {
								if (client.dv_fld >= var12.ak_fld) {
									long var13 = rq.ob(var12, (byte)-67) ? var8 : -1L;
									var0.az_fld.bl(var5, var4.bi_fld, var4.dm_fld, var11, var12, var4.bc_fld, var13);
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
		descriptor = "(I)[Lhb;"
	)
	static hb[] ak() {
		return new hb[]{az_fld, ak_fld, ag_fld};
	}
}
