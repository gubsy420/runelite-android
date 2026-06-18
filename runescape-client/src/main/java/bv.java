import java.io.EOFException;
import java.io.IOException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bv")
public class bv implements ja {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ag_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -490901309
	)
	static int by_fld;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String jz_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[B"
	)
	public static byte[] ae(byte var0) {
		byte[] var1 = new byte[24];

		try {
			mh.ad_fld.af(0L);
			mh.ad_fld.ae(var1);
			int var2 = 0;

			while (var2 < 24 && var1[var2] == 0) {
				var2++;
			}

			if (var2 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var3 = 0; var3 < 24; var3++) {
				var1[var3] = -1;
			}
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lfi;"
	)
	@Override
	public fi ak(int var1) {
		return client.ej_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lfz;"
	)
	@Override
	public fz ag(int var1) {
		return client.kv_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lde;"
	)
	@Override
	public de az(int var1) {
		return xh.jn_fld;
	}

	bv() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lwl;"
	)
	@Override
	public wl ae(int var1) {
		return lz.ah();
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lsn;)I"
	)
	public static int on(sn var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lcn;"
	)
	@Override
	public cn ah(int var1) {
		return cx.kq_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lfz;"
	)
	@Override
	public fz as() {
		return client.kv_fld;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	static void hx(int var0) throws EOFException {
		ol var2 = hm.ak(var0);
		if (var2.aa(-844258176)) {
			if (cm.az(var2.br_fld, -1594681059) == 2) {
				client.pw_fld.add(var2.br_fld);
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int bp(int var0) {
		return Math.abs(var0 - ab.jx_fld) > 1024 ? 2048 * (var0 < ab.jx_fld ? 1 : -1) + var0 : var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lfz;"
	)
	@Override
	public fz ar() {
		return client.kv_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	@Override
	public de af() {
		return xh.jn_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;"
	)
	@Override
	public pi av(int var1) {
		return client.ck_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lpi;"
	)
	@Override
	public pi au() {
		return client.ck_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	@Override
	public de al() {
		return xh.jn_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lwl;"
	)
	@Override
	public wl an() {
		return lz.ah();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lfi;"
	)
	@Override
	public fi ay() {
		return client.ej_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	@Override
	public cn ad() {
		return cx.kq_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	@Override
	public cn ai() {
		return cx.kq_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	@Override
	public cn ao() {
		return cx.kq_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	@Override
	public cn am() {
		return cx.kq_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lfi;"
	)
	@Override
	public fi aw() {
		return client.ej_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	@Override
	public cn aq() {
		return cx.kq_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lwl;"
	)
	@Override
	public wl aa() {
		return lz.ah();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lpi;"
	)
	@Override
	public pi ax() {
		return client.ck_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public static void ag(byte var0) {
		pl.ag_fld.av();
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lxj;I)V"
	)
	static final void em(dx var0, xj var1, int var2) throws EOFException {
		for (int var3 = 0; var3 < client.lx_fld; var3++) {
			int var4 = client.lj_fld[var3];
			ds var5 = (ds)var0.ax_fld.ae(var4);
			int var6 = var1.cg();
			if (0 != (var6 & 2)) {
				int var7 = var1.cg();
				var6 += var7 << 8;
			}

			if (0 != (var6 & 256)) {
				int var14 = var1.cg();
				var6 += var14 << 16;
			}

			if ((var6 & 131072) != 0) {
				int var15 = var1.cg();
				var6 += var15 << 24;
			}

			if ((var6 & 16) != 0) {
				int var16 = var1.cm();
				int var8 = var1.de();
				var5.ef(var16, var8, (byte)42);
			}

			if (0 != (var6 & 8192)) {
				var5.bo_fld = xi.gz(var1, 1274797101);
			}

			if ((var6 & 64) != 0) {
				var1.df();
				xi.iu(var1, 1072821124);
				xi.iu(var1, -479374172);
				var1.cg();
			}

			if (0 != (var6 & 4194304)) {
				if (var2 == 727166919) {
					return;
				}

				int var17 = xi.tl(var1, (byte)1);
				boolean var10000;
				if (var1.de() == 1) {
					if (var2 == 727166919) {
						return;
					}

					var10000 = true;
				} else {
					var10000 = false;
				}

				boolean var28 = var10000;
				var5.eg(var17, var28, 1299083104);
			}

			if ((var6 & 8) != 0) {
				int var18 = var1.eo();
				if (var18 == 65535) {
					var18 = -1;
				}

				int var29 = xi.iu(var1, 1500538901);
				ol var9 = qa.kw(var5.cm_fld, -266276921);
				if (var18 == var5.dq(85592568) && var18 != -1) {
					int var10 = var9.ba_fld;
					if (var10 == 1) {
						if (var2 == 727166919) {
							return;
						}

						var5.cm_fld.ar(461909079);
						var5.cq_fld = var29;
					}

					if (2 == var10) {
						qa.qn(var5.cm_fld, 83126811);
					}
				} else {
					label694: {
						if (var18 != -1) {
							if (var2 == 727166919) {
								return;
							}

							if (qa.jv(var5.cm_fld, 1204426167)) {
								if (var2 == 727166919) {
									return;
								}

								if (hm.ak(var18).bv_fld * -1232992871 < var9.bv_fld) {
									break label694;
								}
							}
						}

						qa.hs(var5.cm_fld, var18, -1932914994);
						var5.cm_fld.ar(461909079);
						var5.cq_fld = var29;
						var5.bg_fld = var5.ce_fld;
					}
				}
			}

			if ((var6 & 2048) != 0) {
				if (var2 == 727166919) {
					return;
				}

				var5.ag(xi.at(var1, -175374935), (byte)104);
			}

			if ((var6 & 32768) != 0) {
				var5.ah(var1.cg(), 1675800422);
			}

			if (0 != (var6 & 2097152)) {
				int var19 = xi.iu(var1, 1752626329);

				for (int var30 = 0; var30 < var19; var30++) {
					int var37 = xi.iu(var1, -1331509297);
					int var46 = var1.cm();
					int var11 = var1.ev();
					var5.db(var37, var46, var11 >> 16, var11 & 65535, (byte)-110);
				}
			}

			if ((var6 & 16777216) != 0) {
				int var20 = var1.df();
				if (var20 > 0) {
					for (int var31 = 0; var31 < var20; var31++) {
						int var38 = var1.dz();
						int var47 = var1.dz();
						if (var47 != 32767) {
							int var57 = var1.dz();
							int var12 = var1.cg();
							int var13 = var47 > 0 ? xi.iu(var1, 996744555) : var12;
							da.bm(var5, var38, client.dv_fld, var47, var57, var12, var13, -1778737047);
						} else {
							var5.du(var38, 1100355631);
						}
					}
				}
			}

			if ((var6 & 262144) != 0) {
				int var21 = var1.co((byte)-75);
				var5.bl_fld = 0 != (var21 & 1) ? var1.eo() : 336258841 * var5.ah_fld.cb_fld;
				var5.cj_fld = 0 != (var21 & 2) ? var1.cm() : -1478906749 * var5.ah_fld.co_fld;
				var5.dr_fld = 0 != (var21 & 4) ? var1.cm() : -1091792243 * var5.ah_fld.cu_fld;
				var5.cy_fld = (var21 & 8) != 0 ? xi.tl(var1, (byte)1) : var5.ah_fld.ci_fld * -1851976721;
				var5.bx_fld = (var21 & 16) != 0 ? var1.eo() : var5.ah_fld.cj_fld * 210253519;
				var5.dc_fld = (var21 & 32) != 0 ? var1.eo() : var5.ah_fld.ch_fld * -475101711;
				int var10001;
				if (0 != (var21 & 64)) {
					if (var2 == 727166919) {
						return;
					}

					var10001 = var1.cm();
				} else {
					var10001 = var5.ah_fld.ct_fld * -255667527;
				}

				var5.cl_fld = var10001;
				var5.dl_fld = 0 != (var21 & 128) ? var1.ex() : -1499633401 * var5.ah_fld.cl_fld;
				var5.dt_fld = (var21 & 256) != 0 ? var1.ex() : var5.ah_fld.dc_fld * 1388456395;
				var5.dz_fld = (var21 & 512) != 0 ? xi.tl(var1, (byte)1) : 1464675467 * var5.ah_fld.dh_fld;
				if ((var21 & 1024) != 0) {
					if (var2 == 727166919) {
						return;
					}

					var10001 = var1.eo();
				} else {
					var10001 = var5.ah_fld.dv_fld * 2060519443;
				}

				var5.ba_fld = var10001;
				if ((var21 & 2048) != 0) {
					if (var2 == 727166919) {
						return;
					}

					var10001 = var1.eo();
				} else {
					var10001 = 741240633 * var5.ah_fld.dz_fld;
				}

				var5.cc_fld = var10001;
				var5.bp_fld = (var21 & 4096) != 0 ? var1.cm() : 1075284735 * var5.ah_fld.dt_fld;
				var5.co_fld = ((var21 & 8192) != 0 ? var1.eo() : 927763251 * var5.ah_fld.dm_fld) * 1841939653;
				var5.cr_fld = 0 != (var21 & 16384) ? var1.eo() : -1339705085 * var5.ah_fld.ck_fld;
			}

			if (0 != (var6 & 32)) {
				var5.cx_fld = xi.at(var1, -1528037850);
				var5.st(-1);
				var5.ci_fld = 1304444708;
			}

			if (0 != (var6 & 1024)) {
				var5.by_fld = var1.ep();
				var5.dv_fld = var1.cw();
				var5.cv_fld = xi.pb(var1, -1929967812);
				var5.dh_fld = var1.dj();
				var5.bv_fld = var1.eo() + client.dv_fld;
				var5.bb_fld = var1.cm() + client.dv_fld;
				var5.bu_fld = var1.ex();
				var5.ce_fld = 0;
				var5.bg_fld = 0;
				var5.by_fld = var5.by_fld + var5.ca_fld[0] * 801314783;
				var5.dv_fld = var5.dv_fld + -366519347 * var5.dq_fld[0];
				var5.cv_fld = var5.cv_fld + var5.ca_fld[0] * -725275729;
				var5.dh_fld = var5.dh_fld + var5.dq_fld[0] * -1314563731;
			}

			if (0 != (var6 & 65536)) {
				int var22 = var1.cg();
				if (var22 > 0) {
					for (int var32 = 0; var32 < var22; var32++) {
						int var39 = var1.dz();
						int var48 = var1.dz();
						int var58 = var1.dz();
						int var67 = var1.dz();
						da.zn(var5, var39, var48, client.dv_fld, var58, var67, (byte)-86);
					}
				}
			}

			if ((var6 & 4096) != 0) {
				var1.de();
				var1.df();
				var1.eo();
				var1.cm();
				xi.tl(var1, (byte)1);
				var1.cg();
			}

			if ((var6 & 1) != 0) {
				if (var2 == 727166919) {
					return;
				}

				pp var75 = ca.az(xi.tl(var1, (byte)1));
				var5.cu(var75);
				var5.ah_fld = var75;
				vj.el(var5);
			}

			if (0 != (var6 & 128)) {
				int var23 = xi.iu(var1, 128597814);
				var5.en(var23, var1, (byte)-32);
			}

			if (0 != (var6 & 4)) {
				var1.eo();
				var1.ev();
			}

			if (0 != (var6 & 1048576)) {
				int var24 = var1.de();
				if (var24 == 0) {
					var5.by(-2041361568);
				} else {
					int[] var33 = new int[8];
					short[] var40 = new short[8];

					for (int var49 = 0; var49 < 8; var49++) {
						if (var2 == 727166919) {
							return;
						}

						if ((var24 & 1 << var49) != 0) {
							if (var2 == 727166919) {
								return;
							}

							var33[var49] = xi.kt(var1, (byte)-118);
							var40[var49] = (short)xi.in(var1, -2111893666);
						} else {
							var33[var49] = -1;
							var40[var49] = -1;
						}
					}

					var5.at(var33, var40, (short)-21618);
				}
			}

			if ((var6 & 512) != 0) {
				var1.de();
				var1.cg();
				var1.cm();
				var1.cm();
				var1.ex();
				var1.cg();
			}

			if ((var6 & 8388608) != 0) {
				if (var2 == 727166919) {
					return;
				}

				int var25 = var1.df();
				if (1 == (var25 & 1)) {
					ds.eb(var5, 70884293);
				} else {
					int[] var34 = null;
					if (2 == (var25 & 2)) {
						int var41 = var1.cg();
						var34 = new int[var41];

						for (int var50 = 0; var50 < var41; var50++) {
							int var59 = var1.em();
							var34[var50] = var59;
						}
					}

					short[] var42 = null;
					if (4 == (var25 & 4)) {
						int var51 = 0;
						if (var5.ah_fld.dd_fld != null) {
							if (var2 == 727166919) {
								return;
							}

							var51 = var5.ah_fld.dd_fld.length;
						}

						var42 = new short[var51];

						for (int var60 = 0; var60 < var51; var60++) {
							var42[var60] = (short)xi.tl(var1, (byte)1);
						}
					}

					short[] var52 = null;
					if (8 == (var25 & 8)) {
						int var61 = 0;
						if (null != var5.ah_fld.dr_fld) {
							var61 = var5.ah_fld.dr_fld.length;
						}

						var52 = new short[var61];

						for (int var68 = 0; var68 < var61; var68++) {
							if (var2 == 727166919) {
								return;
							}

							var52[var68] = (short)var1.ex();
						}
					}

					boolean var62 = false;
					if ((var25 & 16) != 0) {
						var62 = var1.cg() == 1;
					}

					long var69 = (ds.av_fld += 1655828877) * -1977108155 - 1;
					var5.bz(new pg(var69, var34, var42, var52, var62), -1631846114);
				}
			}

			if ((var6 & 524288) != 0) {
				int var26 = var1.de();
				if ((var26 & 1) == 1) {
					var5.bl(-1573802115);
				} else {
					int[] var35 = null;
					if ((var26 & 2) == 2) {
						if (var2 == 727166919) {
							return;
						}

						int var43 = var1.de();
						var35 = new int[var43];

						for (int var53 = 0; var53 < var43; var53++) {
							int var63 = var1.ev();
							var35[var53] = var63;
						}
					}

					short[] var44 = null;
					if (4 == (var26 & 4)) {
						int var54 = 0;
						if (var5.ah_fld.dd_fld != null) {
							var54 = var5.ah_fld.dd_fld.length;
						}

						var44 = new short[var54];

						for (int var64 = 0; var64 < var54; var64++) {
							if (var2 == 727166919) {
								return;
							}

							var44[var64] = (short)var1.ex();
						}
					}

					short[] var55 = null;
					if ((var26 & 8) == 8) {
						int var65 = 0;
						if (var5.ah_fld.dr_fld != null) {
							var65 = var5.ah_fld.dr_fld.length;
						}

						var55 = new short[var65];

						for (int var70 = 0; var70 < var65; var70++) {
							var55[var70] = (short)var1.ex();
						}
					}

					boolean var66 = false;
					if (0 != (var26 & 16)) {
						boolean var72;
						if (xi.iu(var1, 1561466228) == 1) {
							if (var2 == 727166919) {
								return;
							}

							var72 = true;
						} else {
							var72 = false;
						}

						var66 = var72;
					}

					long var71 = (ds.ae_fld += -596753387) * 2121362237 - 1;
					var5.bd(new pg(var71, var35, var44, var55, var66), -776631127);
				}
			}

			if ((var6 & 16384) != 0) {
				var5.bs_fld = client.dv_fld + var1.eo();
				var5.ct_fld = client.dv_fld + var1.eo();
				byte var27 = var1.ep();
				byte var36 = xi.pb(var1, -2025545866);
				byte var45 = var1.ep();
				byte var56 = (byte)var1.cg();
				fy.hv(var5.be_fld, var27, var36, var45, var56);
			}
		}
	}
}
