import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hy")
public class hy extends ho {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1786729189
	)
	int ag_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	static long ad_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bp_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ak_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ao_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	hm this$0;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bv_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			var1.cu();
		}

		this.ak_fld = var1.cl();
		this.ag_fld = var1.cm();
		this.az_fld = var1.cw();
		var1.cu();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			var1.cu();
		}

		this.ak_fld = var1.cl();
		this.ag_fld = var1.cm();
		this.az_fld = var1.cw();
		var1.cu();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ah(ib var1) {
		hx var2 = new hx();
		var2.az_fld = new aax(this.ak_fld);
		var2.ag_fld = 1466495264 * this.ag_fld;
		var2.ak_fld = this.az_fld;
		var1.ag(var2, -1613729020);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		if (var1.cg() != 255) {
			var1.au_fld--;
			var1.cu();
		}

		this.ak_fld = var1.cl();
		this.ag_fld = var1.cm();
		this.az_fld = var1.cw();
		var1.cu();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void aw(ib var1) {
		hx var2 = new hx();
		var2.az_fld = new aax(this.ak_fld);
		var2.ag_fld = 2085191939 * this.ag_fld;
		var2.ak_fld = this.az_fld;
		var1.ag(var2, -1757160166);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		if (var1.cg() != -828161769) {
			var1.au_fld--;
			var1.cu();
		}

		this.ak_fld = var1.cl();
		this.ag_fld = var1.cm();
		this.az_fld = var1.cw();
		var1.cu();
	}

	hy(hm var1) {
		this.this$0 = var1;
		this.ak_fld = null;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;I)V"
	)
	static void cz(lu var0, lu var1) {
		if (var0.bx_fld == 0) {
			for (int var3 = var0.cx_fld; var3 <= var0.cs_fld; var3++) {
				lu var4 = var1.ge_fld[var3];
				if (null != var4 && var4.cy_fld == var0.by_fld) {
					cz(var4, var1);
				}
			}
		}

		var1.ge_fld[var0.by_fld] = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ay(ib var1) {
		hx var2 = new hx();
		var2.az_fld = new aax(this.ak_fld);
		var2.ag_fld = 2085191939 * this.ag_fld;
		var2.ak_fld = this.az_fld;
		var1.ag(var2, -1466294004);
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lds;IIIII)V"
	)
	static final void fu(ds var0, int var1, int var2, int var3, int var4) throws EOFException {
		try {
			boolean var6 = ev.ti(var0, false);
			if (var6) {
				int var12 = 295181013;
				pp var13 = var0.ah_fld;
				if (client.nr_fld.ot_fld < 400) {
					if (var13.dy_fld != null) {
						var13 = var13.ar((byte)6);
					}

					if (null == var13) {
						if (var12 >= 1445788648) {
						}
					} else if (var13.df_fld && (!var13.dp_fld || client.kl_fld == var1)) {
						int var14 = sq.ei();
						String var15 = ds.lh(var0, (byte)1);
						if (var13.dx_fld != 0 && 0 != var0.bo_fld) {
							int var16 = var0.bo_fld != -1 ? var0.bo_fld : var13.dx_fld;
							int var19 = var14 - var16;
							String var18;
							if (var19 < -9) {
								var18 = gd.ag(16711680, -1940547058);
							} else if (var19 < -6) {
								var18 = gd.ag(16723968, -1940547058);
							} else if (var19 < -3) {
								var18 = gd.ag(16740352, -1940547058);
							} else if (var19 < 0) {
								var18 = gd.ag(16756736, -1940547058);
							} else if (var19 > 9) {
								if (var12 >= 1445788648) {
									return;
								}

								var18 = gd.ag(65280, -1940547058);
							} else if (var19 > 6) {
								if (var12 >= 1445788648) {
									return;
								}

								var18 = gd.ag(4259584, -1940547058);
							} else if (var19 > 3) {
								if (var12 >= 1445788648) {
									return;
								}

								var18 = gd.ag(8453888, -1940547058);
							} else if (var19 > 0) {
								var18 = gd.ag(12648192, -1940547058);
							} else {
								var18 = gd.ag(16776960, -1940547058);
							}

							var15 = var15 + var18 + " " + db.av_fld + kh.hk_fld + var16 + db.ae_fld;
						}

						if (var13.dj_fld && client.eq_fld) {
							ky.fl(kh.hp_fld, gd.ag(16776960, -1940547058) + var15, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!tl.ks_fld && client.ee_fld == 1) {
							if (var12 < 1445788648) {
								ky.fl(kh.hj_fld, client.it_fld + " " + db.ah_fld + " " + gd.ag(16776960, -1940547058) + var15, 7, var1, var2, var3, -1, false, var4);
							}
						} else if (client.nk_fld) {
							if (!tl.ks_fld && (ms.ne_fld & 2) == 2) {
								ky.fl(client.om_fld, client.oh_fld + " " + db.ah_fld + " " + gd.ag(16776960, -1940547058) + var15, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							int var21 = var13.dj_fld && client.eq_fld ? 2000 : 0;
							hp.fr(var21, var13, var14, false, var0, gd.ag(16776960, -1940547058) + var15, var1, var2, var3, var4, -1333760723);
							hp.fr(var21, var13, var14, true, var0, gd.ag(16776960, -1940547058) + var15, var1, var2, var3, var4, -1405910078);
							if (!var13.dj_fld || !client.eq_fld) {
								ky.fl(kh.hp_fld, gd.ag(16776960, -1940547058) + var15, 1003, var1, var2, var3, -1, false, var4);
							}
						}
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V"
	)
	@Override
	void ag(ib var1, byte var2) {
		hx var3 = new hx();
		var3.az_fld = new aax(this.ak_fld);
		var3.ag_fld = 2085191939 * this.ag_fld;
		var3.ak_fld = this.az_fld;
		var1.ag(var3, -1568625618);
	}
}
