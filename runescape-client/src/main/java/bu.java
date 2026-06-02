import java.io.EOFException;
import java.math.BigInteger;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bu")
public class bu {
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv hv_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/math/BigInteger;"
	)
	static BigInteger ag_fld = new BigInteger(
		"a7b1ae885e95f7c5ea4e2fcdde65a02ea9e37539818a80e81e923f874a7454426401a58defc93f41f7f1209fac21dcbe31517b3bb090a2ab114c507703c15a454047b103ed22cc16199c820c87a073c6ec3fa0252d2522c53c4f78ed393e065ef5b0ed32aa4fd9f1d37d33589237457b380ecbe58d100e975d539167f318f8f3",
		16
	);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedGetter(
		intValue = -1625136171
	)
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/math/BigInteger;"
	)
	static BigInteger ak_fld = new BigInteger("10001", 16);

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIZ)V"
	)
	public static void he(int var0, int var1, int var2, boolean var3) {
		jm var5 = gi.ak(jb.ae_fld, client.aq_fld.av_fld);
		xi.rs(var5.ay_fld, var2);
		var5.ay_fld.ea(var3 ? client.mq_fld : 0);
		xi.si(var5.ay_fld, var1);
		xi.be(var5.ay_fld, var0);
		client.aq_fld.az(var5);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void bt(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.an_fld = var1;
		og.ag();
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)Lyo;"
	)
	static yo hv(int var0) throws EOFException {
		yo var2 = (yo)client.kp_fld.ak(var0);
		if (var2 == null) {
			var2 = new yo(wo.iq_fld, mk.ak(var0), my.ag(var0));
			if (!yo.ms(var2, (short)189)) {
				return null;
			}

			client.kp_fld.az(var2, var0);
		}

		return var2;
	}

	bu() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lor;I)V"
	)
	static final void cm(dx var0, or var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < var0.ad_fld.az(); var3++) {
			ds var4 = (ds)var0.ax_fld.ak(var0.ad_fld.ag(var3));
			if (null != var4) {
				if (var2 >= 1003509737) {
					return;
				}

				if (var4.bm(1646425248)) {
					if (var2 >= 1003509737) {
						return;
					}

					if (var4.ah_fld.ek_fld == var1) {
						if (var2 >= 1003509737) {
							return;
						}

						if (var4.ah_fld.an(-1019607204)) {
							int var5 = var0.ae_fld;
							int var6 = kj.ay(var4.bo_fld);
							int var7 = kj.ay(var4.bp_fld);
							if (var0.ae(var6, var7, 1853908949)) {
								if (1 == var4.bv_fld && (var4.bo_fld & 127) == 64) {
									if (var2 >= 1003509737) {
										return;
									}

									if ((var4.bp_fld & 127) == 64) {
										if (client.mi_fld == var0.ar_fld[var6][var7]) {
											if (var2 >= 1003509737) {
												return;
											}
											continue;
										}

										var0.ar_fld[var6][var7] = client.mi_fld;
									}
								}

								long var8 = dt.ay(0, 0, 0, 1, !var4.ah_fld.df_fld, var4.bx_fld, var0.ag_fld);
								var4.bs_fld = client.dv_fld;
								int var10 = gl.dt(var0, var4.bo_fld, var4.bp_fld, var5, var4.br((byte)49));
								int var11 = var4.bv_fld - 64 + 60;
								boolean var12 = mp.co(var4);
								var4.au_fld = var12;
								boolean var13 = var0.az_fld.bj(var5, var4.bo_fld, var4.bp_fld, var10, var11, var4, var4.bt_fld, var8, var4.an_fld);
								if (var13 && var4.co_fld != 0) {
									client.du_fld.ak(var4.cb_fld);

									for (rq var14 = (rq)client.du_fld.az(); null != var14; var14 = (rq)(rq)client.du_fld.next()) {
										if (var2 >= 1003509737) {
											return;
										}

										if (client.dv_fld < var14.az_fld) {
											if (var2 >= 1003509737) {
												return;
											}
										} else {
											long var15 = var14.ak((byte)-21) ? var8 : -1L;
											var0.az_fld.bl(var5, var4.bo_fld, var4.bp_fld, var10, var14, var4.bt_fld, var15);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
