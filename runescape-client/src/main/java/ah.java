import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ah")
public class ah implements xm {
	@ObfuscatedGetter(
		intValue = 43614233
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	static ah ak_fld = new ah(0, 0);
	@ObfuscatedGetter(
		intValue = -1591339213
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static rs kw_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.az_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.az_fld;
	}

	@ObfuscatedName("zv")
	@ObfuscatedSignature(
		descriptor = "(Loh;)V"
	)
	public static void zv(oh var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lah;"
	)
	public static ah[] az() {
		return new ah[]{ak_fld};
	}

	ah(int var1, int var2) {
		this.ag_fld = var1;
		this.az_fld = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIILcx;)Ltu;"
	)
	static tu ay(int var0, int var1, int var2, int var3, cx var4) throws EOFException {
		tu var6 = null;
		dx var7 = null;
		boolean var8 = 0 != var0;
		if (var8) {
			Object var9;
			if (ux.ak(var0)) {
				int var10 = qs.ag(var0);
				var7 = pd.ag(var10, var4);
				var9 = (da)var7.ax_fld.ak(var10);
			} else {
				int var17 = -var0 - 1;
				var7 = kx.ak(var17, var4);
				var9 = dx.ii(var7, var17);
			}

			if (null != var9) {
				kj var18 = ((da)var9).es(var7, (byte)73);
				tu var11;
				synchronized (tu.ae_fld) {
					if (0 == tu.aw_fld) {
						var11 = new tu();
					} else {
						tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].as();
						var11 = tu.ae_fld[tu.aw_fld];
					}
				}

				var6 = var11;
				var11.ay_fld = var18.ag_fld;
				var11.ar_fld = var18.az_fld;
			}
		}

		if (null == var6) {
			var7 = var4.aw(var1, var2, -2091588016);
			int var16 = var1 - var7.ay_fld;
			int var19 = var2 - var7.as_fld;
			rg var20 = (rg)var4.ah(-225377813).an_fld.ak(var7.ag_fld);
			if (var20 != null) {
				var6 = rg.ql(var20, kj.as(var16), kj.as(var19));
			} else {
				var6 = sh.ak(kj.as(var16), 0.0F, kj.as(var19));
			}
		}

		int var21 = (int)var6.ay_fld;
		int var22 = (int)var6.ar_fld;
		int var13 = jf.dv(var7, var21, var22, var3);
		rg var14 = (rg)bw.dk_fld.an_fld.ak(var7.ag_fld);
		if (null != var14) {
			var13 += jf.dv(bw.dk_fld, var14.dp(-850860381), var14.dj(189745805), var14.ak(-1672997243));
		}

		var6.as_fld = var13;
		return var6;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.az_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void al() throws EOFException {
		if (bw.dk_fld.ae_fld != bx.an_fld) {
			bx.an_fld = -119201227 * bw.dk_fld.ae_fld;
			wt.as(bw.dk_fld.ae_fld, 1461120471);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ay() {
		mb.ay_fld.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.az_fld;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	static final void ff(lu var0, int var1) {
		if (var0.bo_fld == 1) {
			if (var1 == 878041371) {
				return;
			}

			oy.fw(var0.gq_fld, "", 24, 0, 0, var0.bf_fld, var0.ga_fld);
		}

		if (var0.bo_fld == 2 && !client.nk_fld) {
			String var2 = cf.cg_fld.ao(var0);
			if (null != var2) {
				oy.fw(var2, gd.ag(65280, -1940547058) + var0.gi_fld, 25, 0, -1, var0.bf_fld, var0.ga_fld);
			}
		}

		if (var0.bo_fld == 3) {
			if (var1 == 878041371) {
				return;
			}

			je.fe(kh.hs_fld, "", 26, 0, 0, var0.bf_fld);
		}

		if (var0.bo_fld == 4) {
			je.fe(var0.gq_fld, "", 28, 0, 0, var0.bf_fld);
		}

		if (5 == var0.bo_fld) {
			je.fe(var0.gq_fld, "", 29, 0, 0, var0.bf_fld);
		}

		if (6 == var0.bo_fld && cf.cg_fld.be()) {
			if (var1 == 878041371) {
				return;
			}

			je.fe(var0.gq_fld, "", 30, 0, -1, var0.bf_fld);
		}

		if (var0.bj_fld) {
			if (client.nk_fld) {
				if (var1 == 878041371) {
					return;
				}

				int var3 = uo.sa(cf.cg_fld, var0, 1673637537);
				boolean var9 = (var3 >> 21 & 1) != 0;
				if (var9 && (ms.ne_fld & 32) == 32) {
					if (var1 == 878041371) {
						return;
					}

					oy.fw(client.om_fld, client.oh_fld + " " + db.ah_fld + " " + var0.eq_fld, 58, 0, var0.by_fld, var0.bf_fld, var0.ga_fld);
				}
			} else {
				for (int var10 = 31; var10 >= 0; var10--) {
					if (var10 == var0.ek_fld) {
						String var12 = cf.cg_fld.ao(var0);
						if (null != var12) {
							oy.fw(var12, var0.eq_fld, 25, 0, var0.by_fld, var0.bf_fld, var0.ga_fld);
						}
					}

					String var13 = cf.cg_fld.ad(var0, var10);
					if (null != var13) {
						int var4;
						short var5;
						if (var10 > var0.ek_fld) {
							var5 = 1007;
							var4 = oy.fw(var13, var0.eq_fld, var5, 1 + var10, var0.by_fld, var0.bf_fld, var0.ga_fld);
						} else {
							var5 = 57;
							var4 = ky.fl(var13, var0.eq_fld, var5, var10 + 1, var0.by_fld, var0.bf_fld, var0.ga_fld, var0.hh_fld, 0);
						}

						if (null != var0.ee_fld && var10 < var0.ee_fld.length && var0.ee_fld[var10] != null) {
							String[] var6 = var0.ee_fld[var10];

							for (int var7 = var6.length - 1; var7 >= 0; var7--) {
								if (var1 == 878041371) {
									return;
								}

								int var8 = 1 + var7 << 16 | var10 + 1;
								if (var6[var7] != null && !var6[var7].isEmpty()) {
									dd.fg(var4, var6[var7], "", var5, var8, var0.by_fld, var0.bf_fld, var0.ga_fld, 0, -2137191583);
								}
							}
						}
					}
				}

				int var14 = uo.sa(cf.cg_fld, var0, -343116807);
				boolean var11 = 0 != (var14 & 1);
				if (var11) {
					je.fe(kh.at_fld, "", 30, 0, var0.by_fld, var0.bf_fld);
				}
			}
		}
	}
}
