import java.io.EOFException;
import java.util.Locale;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@xx
@ObfuscatedName("xh")
@zn
public class xh implements xm {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	static xh av_fld = new xh("PT", "pt", "Portuguese", xg.ak_fld, 3, "BR");
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	static xh ag_fld = new xh("DE", "de", "German", xg.ak_fld, 1, "DE");
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	public static xh ak_fld = new xh("EN", "en", "English", xg.ak_fld, 0, "GB");
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	public static xh az_fld = new xh("FR", "fr", "French", xg.ak_fld, 2, "FR");
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	static xh ae_fld = new xh("NL", "nl", "Dutch", xg.av_fld, 4, "NL");
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	public static xh ah_fld = new xh("ES", "es", "Spanish", xg.av_fld, 5, "ES");
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lxh;"
	)
	static xh[] as_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ay_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	static xh aw_fld = new xh("ES_MX", "es-mx", "Spanish (Latin American)", xg.ak_fld, 6, "MX");
	@ObfuscatedGetter(
		intValue = -1997957569
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String af_fld;
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static de jn_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ar_fld;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lku;)I"
	)
	public static int hp(ku var0) {
		return var0.ad_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String az() {
		return this.af_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ar_fld;
	}

	xh(String var1, String var2, String var3, xg var4, int var5, String var6) {
		this.ay_fld = var1;
		this.af_fld = var2;
		this.ar_fld = var5;
		if (null != var6) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return this.az().toLowerCase(Locale.ENGLISH);
	}

	static {
		xh[] var0 = new xh[]{ae_fld, ag_fld, aw_fld, ak_fld, ah_fld, az_fld, av_fld};
		as_fld = new xh[var0.length];
		xh[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; var3++) {
			xh var4 = var2[var3];
			if (null != as_fld[var4.ar_fld]) {
				throw new IllegalStateException();
			}

			as_fld[var4.ar_fld] = var4;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ar_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lxh;"
	)
	public static xh ak(int var0) {
		return var0 >= 0 && var0 < as_fld.length ? as_fld[var0] : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lxh;"
	)
	public static xh aw(int var0) {
		return var0 >= 0 && var0 < as_fld.length ? as_fld[var0] : null;
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.az().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.az().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ar_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lxh;"
	)
	public static xh ay(int var0) {
		return var0 >= 0 && var0 < as_fld.length ? as_fld[var0] : null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String ar() {
		return this.af_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static final void ak(String var0) {
		io.ag(30, "", var0);
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)V"
	)
	static final void en(dx var0, int var1, int var2, int var3, int var4) throws EOFException {
		na var5 = var0.aa_fld[var1][var2][var3];
		if (var5 == null) {
			var0.az_fld.bw(var1, var2, var3);
			client.zo(var0, var1, var2, var3);
		} else {
			long var6 = -99999999L;
			dw var8 = null;

			for (dw var9 = (dw)var5.aw(); null != var9; var9 = (dw)var5.as()) {
				og var10 = kb.ag(var9.ag_fld, -1752383175);
				long var11 = -1489673433 * var10.es_fld;
				if (1 == var10.dj_fld) {
					var11 *= var9.az_fld < Integer.MAX_VALUE ? var9.az_fld + 1 : var9.az_fld;
				}

				if (var11 > var6) {
					if (var4 >= 2124540861) {
						client.zo(var0, var1, var2, var3);
						return;
					}

					var6 = var11;
					var8 = var9;
				}
			}

			if (null == var8) {
				if (var4 >= 2124540861) {
					client.zo(var0, var1, var2, var3);
				} else {
					var0.az_fld.bw(var1, var2, var3);
					client.zo(var0, var1, var2, var3);
				}
			} else {
				var5.ai(var8);
				dw var42 = null;
				dw var43 = null;

				for (dw var41 = (dw)var5.aw(); null != var41; var41 = (dw)var5.as()) {
					if (var41.ag_fld != var8.ag_fld) {
						if (var4 >= 2124540861) {
							client.zo(var0, var1, var2, var3);
							return;
						}

						if (null == var42) {
							var42 = var41;
						}

						if (var41.ag_fld != var42.ag_fld && var43 == null) {
							if (var4 >= 2124540861) {
								client.zo(var0, var1, var2, var3);
								return;
							}

							var43 = var41;
						}
					}
				}

				int var12 = ev.av(var0.az_fld, var1, var2, var3);
				tu var13 = tu.av_fld;
				if (var12 == 0) {
					int var15 = var1;
					int var16 = var2 * 128;
					int var17 = var3 * 128;
					if (wo.dz(var0, var1, var2, var3)) {
						var15 = var1 + 1;
					}

					tu var18 = sh.ak(var16, var0.af_fld[var15][var2][var3], var17);
					tu var19 = sh.ak(var16 + 128, var0.af_fld[var15][var2 + 1][var3], var17);
					tu var20 = sh.ak(128 + var16, var0.af_fld[var15][var2 + 1][var3 + 1], var17 + 128);
					tu var21 = sh.ak(var16, var0.af_fld[var15][var2][1 + var3], 128 + var17);
					tu var14;
					if (var18.as_fld == var19.as_fld && var20.as_fld == var18.as_fld && var21.as_fld == var18.as_fld) {
						var18.ah();
						var19.ah();
						var20.ah();
						var21.ah();
						var14 = tu.av_fld;
					} else {
						tu var23;
						synchronized (tu.ae_fld) {
							if (tu.aw_fld == 0) {
								if (var4 >= 2124540861) {
									client.zo(var0, var1, var2, var3);
									return;
								}

								var23 = new tu(var19);
							} else {
								tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].ay(var19);
								var23 = tu.ae_fld[tu.aw_fld];
							}
						}

						var23.an(var18);
						tu var25;
						synchronized (tu.ae_fld) {
							if (0 == tu.aw_fld) {
								var25 = new tu(var21);
							} else {
								tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].ay(var21);
								var25 = tu.ae_fld[tu.aw_fld];
							}
						}

						var25.an(var18);
						tu var45 = dn.av(var23, var25);
						var23.ah();
						var25.ah();
						tu var28;
						synchronized (tu.ae_fld) {
							if (tu.aw_fld == 0) {
								var28 = new tu(var19);
							} else {
								tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].ay(var19);
								var28 = tu.ae_fld[tu.aw_fld];
							}
						}

						var28.an(var20);
						tu var30;
						synchronized (tu.ae_fld) {
							if (tu.aw_fld == 0) {
								var30 = new tu(var21);
							} else {
								tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].ay(var21);
								var30 = tu.ae_fld[tu.aw_fld];
							}
						}

						var30.an(var20);
						tu var46 = dn.av(var30, var28);
						var28.ah();
						var30.ah();
						var18.ah();
						var19.ah();
						var20.ah();
						var21.ah();
						tu var33;
						synchronized (tu.ae_fld) {
							if (tu.aw_fld == 0) {
								if (var4 >= 2124540861) {
									client.zo(var0, var1, var2, var3);
									return;
								}

								var33 = new tu(var45);
							} else {
								tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].ay(var45);
								var33 = tu.ae_fld[tu.aw_fld];
							}
						}

						tu.dk(var33, var46, (byte)-22);
						var45.ah();
						var46.ah();
						tu var47 = ex.ag(var33);
						var33.ah();
						var14 = var47;
					}

					var13 = var14;
				}

				var8.ar(var13, 964229480);
				if (var42 != null) {
					var42.ar(var13, 1056974951);
				}

				if (var43 != null) {
					var43.ar(var13, 1382870241);
				}

				long var44 = dt.ay(var1, var2, var3, 3, false, 0, var0.ag_fld);
				var0.az_fld.br(var1, var2, var3, jf.dv(var0, kj.as(var2), kj.as(var3), var1), var8, var44, var42, var43, var12);
				client.zo(var0, var1, var2, var3);
			}
		}
	}
}
