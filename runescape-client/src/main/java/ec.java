import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ec")
public class ec extends rz {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub ae_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bx_fld;

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ak(rr var1, rr var2) {
		if (var1.aw_fld != var2.aw_fld) {
			return this.ak_fld ? var1.aw_fld - var2.aw_fld : var2.aw_fld - var1.aw_fld;
		} else {
			return this.as(var1, var2, 938694724);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lub;)I"
	)
	static int ag(ub var0) {
		int var2 = bn.di_fld.length + bn.dy_fld.length;
		String[] var3 = bn.dn_fld;

		for (int var4 = 0; var4 < var3.length; var4++) {
			String var5 = var3[var4];
			if (var0.cm(var5, (byte)1) != -1) {
				var2++;
			}
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ae(Object var1, Object var2) {
		return this.ak((rr)var1, (rr)var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Lrr;)I"
	)
	int ag(rr var1, rr var2) {
		if (var1.aw_fld != var2.aw_fld) {
			return this.ak_fld ? var1.aw_fld - var2.aw_fld : var2.aw_fld - var1.aw_fld;
		} else {
			return this.as(var1, var2, 2097297573);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIILyv;Lkp;)V"
	)
	static final void ah(int var0, int var1, int var2, int var3, int var4, yv var5, kp var6) {
		try {
			int var16 = 920811827;
			if (var5 != null) {
				int var17 = var2 * var2 + var3 * var3;
				if (var17 <= 6400) {
					int var18 = fc.ah_fld[var4];
					int var19 = fc.aw_fld[var4];
					int var20 = var18 * var3 + var2 * var19 >> 16;
					int var21 = var19 * var3 - var18 * var2 >> 16;
					if (var17 > 2500) {
						var5.bz(
							var20 + var6.ak_fld / 2 - var5.ad_fld / 2, var6.ag_fld / 2 - var21 - var5.ao_fld / 2, var0, var1, var6.ak_fld, var6.ag_fld, var6.av_fld, var6.az_fld
						);
					} else {
						var5.ab(var0 + var6.ak_fld / 2 + var20 - var5.ad_fld / 2, var1 + var6.ag_fld / 2 - var21 - var5.ao_fld / 2);
					}
				}
			}
		} catch (Exception var22) {
		}
	}

	public ec(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;II)V"
	)
	static final void bg(dx var0, da var1, int var2, int var3) throws EOFException {
		try {
			da.ad(var0, var1, var2);
			ms.cq(var0, var1, 1764677584);
			jm.kr_fld.av(var0, var1.bo_fld, var1.bp_fld, var1.bx_fld == client.dj_fld);
			int var8 = cf.ak(var1.cw_fld, 1, jm.kr_fld);
			if ((var8 & 2) != 0) {
				if (var3 >= -506972580) {
					da.jp(var0, var1, var2);
					return;
				}

				var1.cw_fld.ar(461909079);
			}

			qa.ju(var1.cz_fld, var1.bi_fld, 1122482500);
			if (var1.cw_fld.al() > 0 && var1.cz_fld.al() < 30) {
				if (var1.cw_fld.ah() == var1.cz_fld.ah()) {
					var1.cz_fld.ak(var1.cw_fld);
				} else {
					int var9 = cf.ak(var1.cz_fld, 1, null);
					if (0 != (var9 & 2)) {
						var1.cz_fld.ar(461909079);
					}
				}
			}

			xk var14 = new xk(da.dc(var1, 1330810262));

			for (rq var10 = (rq)var14.az(); null != var10; var10 = (rq)(rq)var14.next()) {
				if (var10.ak_fld != -1 && client.dv_fld >= var10.az_fld) {
					qa var11 = var10.ag_fld;
					if (!var11.av()) {
						var10.gy_void();
						var1.co_fld--;
					} else {
						int var12 = cf.ak(var11, 1, jm.kr_fld);
						if ((var12 & 1) != 0) {
							var10.gy_void();
							var1.co_fld--;
						}
					}
				}
			}

			label497: {
				if (var1.cm_fld.av() && var1.ck_fld <= 1) {
					ol var15 = var1.cm_fld.ae();
					if (var15.bc_fld == 1) {
						if (var3 >= -506972580) {
							da.jp(var0, var1, var2);
							return;
						}

						if (var1.dr_fld > 0 && var1.ct_fld <= client.dv_fld && var1.cl_fld < client.dv_fld) {
							var1.ck_fld = 234859663;
							break label497;
						}
					}
				}

				if (var1.ck_fld > 0) {
					var1.ck_fld--;
				} else {
					int var16 = cf.ak(var1.cm_fld, 1, jm.kr_fld);
					if ((var16 & 2) != 0) {
						if (var3 >= -506972580) {
							da.jp(var0, var1, var2);
							return;
						}

						var1.cm_fld.ag();
						if (var1.cw_fld.ah() == var1.bi_fld && var1.eo(-1929476635)) {
							var1.cw_fld.ar(461909079);
						}
					}
				}

				boolean var10001;
				if (var1.cm_fld.av() && var1.cm_fld.ae().bt_fld) {
					if (var3 >= -506972580) {
						da.jp(var0, var1, var2);
						return;
					}

					var10001 = true;
				} else {
					var10001 = false;
				}

				var1.an_fld = var10001;
				jm.kr_fld.ae(1854892545);
			}

			da.jp(var0, var1, var2);
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}
}
