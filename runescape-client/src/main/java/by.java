import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("by")
public class by implements ff {
	@ObfuscatedGetter(
		intValue = 1406829559
	)
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int eo_fld;
	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static fn mg_fld;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv ho_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn ap(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		int var5 = var1.dq_fld;
		pp var6 = ca.az(var5);
		if (null != var6.dy_fld) {
			var6 = var6.ar((byte)6);
		}

		cv var7 = ot.ef();
		lp var8 = var7 == null ? null : var7.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var8, var6, null, (byte)-104);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Lfn;"
	)
	@Override
	public fn ak(lu var1, int var2) throws EOFException {
		og var3 = kb.ag(var1.ga_fld, -1752383175);
		if (var3 != null) {
			var3 = var3.ax(var1.gd_fld, -1781379588);
			return var3.al(1, (byte)-84);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Lfn;"
	)
	@Override
	public fn ag(lu var1, int var2) throws EOFException {
		if (var1.dq_fld == 0) {
			return lp.ph(client.ca_fld, null, -1, null, -1, (byte)-39);
		} else {
			cv var3 = ot.ef();
			return var3 != null ? var3.az(-178304394) : null;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int cc(int var0, ba var1, boolean var2) throws EOFException {
		if (6809 == var0) {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			oe var5 = ko.az(var4);
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var5 != null ? var5.cg_fld : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;II)Lfn;"
	)
	@Override
	public fn av(lu var1, ol var2, int var3, int var4) throws EOFException {
		if (-1 != var1.dq_fld) {
			oe var5 = ko.az(var1.dq_fld);
			return var5.al(10, 0, null, 0, 0, 0, var2, var3, -1764735280);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;II)Lfn;"
	)
	@Override
	public fn ae(lu var1, ol var2, int var3, int var4) throws EOFException {
		if (-1 != var1.dq_fld) {
			pp var5 = ca.az(var1.dq_fld);
			return var5.aw(var2, var3, null, -1, null, 1563184408);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZI)Lfn;"
	)
	@Override
	public fn ay(lu var1, ol var2, int var3, boolean var4, int var5) throws EOFException {
		cv var6 = ot.ef();
		lp var7 = null == var6 ? null : var6.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var7, null, null, (byte)-3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	@Override
	public fn as(lu var1) throws EOFException {
		og var2 = kb.ag(var1.ga_fld, -1752383175);
		if (var2 != null) {
			var2 = var2.ax(var1.gd_fld, -78585095);
			return var2.al(1, (byte)-76);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn ad(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		pp var5 = null;
		pg var6 = null;
		int var7 = var1.dq_fld;
		if (var7 >= 0) {
			ds var8 = (ds)bw.dk_fld.ax_fld.ak(var7);
			if (var8 != null && null != var8.ah_fld) {
				var5 = var8.ah_fld;
				if (var5.dy_fld != null) {
					var5 = var5.ar((byte)6);
				}

				var6 = var8.aj((byte)1);
			}
		}

		cv var10 = ot.ef();
		lp var9 = null == var10 ? null : var10.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var9, var5, var6, (byte)-11);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;I)Lfn;"
	)
	@Override
	public fn ai(lu var1, ol var2, int var3) throws EOFException {
		if (-1 != var1.dq_fld) {
			oe var4 = ko.az(var1.dq_fld);
			return var4.al(10, 0, null, 0, 0, 0, var2, var3, -1107633815);
		} else {
			return null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;I)Lfn;"
	)
	@Override
	public fn am(lu var1, ol var2, int var3) throws EOFException {
		if (-1 != var1.dq_fld) {
			pp var4 = ca.az(var1.dq_fld);
			return var4.aw(var2, var3, null, -1, null, 1255177026);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	@Override
	public fn ar(lu var1) throws EOFException {
		og var2 = kb.ag(var1.ga_fld, -1752383175);
		if (var2 != null) {
			var2 = var2.ax(var1.gd_fld, -1703500684);
			return var2.al(1, (byte)-48);
		} else {
			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	@Override
	public fn al(lu var1) throws EOFException {
		og var2 = kb.ag(var1.ga_fld, -1752383175);
		if (var2 != null) {
			var2 = var2.ax(var1.gd_fld, -852072229);
			return var2.al(1, (byte)-9);
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	@Override
	public fn au(lu var1) throws EOFException {
		if (var1.dq_fld == 0) {
			return lp.ph(client.ca_fld, null, -1, null, -1, (byte)-71);
		} else {
			cv var2 = ot.ef();
			return var2 != null ? var2.az(-789720778) : null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	@Override
	public fn ax(lu var1) throws EOFException {
		if (var1.dq_fld == 0) {
			return lp.ph(client.ca_fld, null, -1, null, -1, (byte)44);
		} else {
			cv var2 = ot.ef();
			return var2 != null ? var2.az(-1057016613) : null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	@Override
	public fn an(lu var1) throws EOFException {
		cv var2 = ot.ef();
		return var2 != null ? lp.ph(var1.dy_fld, null, -1, hm.ak(var2.bi_fld), qa.do_(var2.cw_fld, -1929419499), (byte)-106) : null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	@Override
	public fn aa(lu var1) throws EOFException {
		cv var2 = ot.ef();
		return var2 != null ? lp.ph(var1.dy_fld, null, -1, hm.ak(var2.bi_fld), qa.do_(var2.cw_fld, -82325529), (byte)63) : null;
	}

	by() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;I)Lfn;"
	)
	@Override
	public fn aq(lu var1, ol var2, int var3) throws EOFException {
		if (-1 != var1.dq_fld) {
			pp var4 = ca.az(var1.dq_fld);
			return var4.aw(var2, var3, null, -1, null, 1751035443);
		} else {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Lfn;"
	)
	@Override
	public fn az(lu var1, int var2) throws EOFException {
		cv var3 = ot.ef();
		return var3 != null ? lp.ph(var1.dy_fld, null, -1, hm.ak(var3.bi_fld), qa.do_(var3.cw_fld, 670935439), (byte)-44) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn aj(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		cv var5 = ot.ef();
		lp var6 = null == var5 ? null : var5.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var6, null, null, (byte)-50);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZI)Lfn;"
	)
	@Override
	public fn ah(lu var1, ol var2, int var3, boolean var4, int var5) throws EOFException {
		pp var6 = null;
		pg var7 = null;
		int var8 = var1.dq_fld;
		if (var8 >= 0) {
			ds var9 = (ds)bw.dk_fld.ax_fld.ak(var8);
			if (var9 != null && null != var9.ah_fld) {
				var6 = var9.ah_fld;
				if (var6.dy_fld != null) {
					var6 = var6.ar((byte)6);
				}

				var7 = var9.aj((byte)1);
			}
		}

		cv var11 = ot.ef();
		lp var10 = null == var11 ? null : var11.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var10, var6, var7, (byte)-28);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn ab(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		pp var5 = null;
		pg var6 = null;
		int var7 = var1.dq_fld;
		if (var7 >= 0) {
			ds var8 = (ds)bw.dk_fld.ax_fld.ak(var7);
			if (var8 != null && null != var8.ah_fld) {
				var5 = var8.ah_fld;
				if (var5.dy_fld != null) {
					var5 = var5.ar((byte)6);
				}

				var6 = var8.aj((byte)1);
			}
		}

		cv var10 = ot.ef();
		lp var9 = null == var10 ? null : var10.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var9, var5, var6, (byte)-30);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	@Override
	public fn af(lu var1) throws EOFException {
		og var2 = kb.ag(var1.ga_fld, -1752383175);
		if (var2 != null) {
			var2 = var2.ax(var1.gd_fld, 264606825);
			return var2.al(1, (byte)-13);
		} else {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn at(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		int var5 = var1.dq_fld;
		pp var6 = ca.az(var5);
		if (null != var6.dy_fld) {
			var6 = var6.ar((byte)6);
		}

		cv var7 = ot.ef();
		lp var8 = var7 == null ? null : var7.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var8, var6, null, (byte)-28);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn ac(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		int var5 = var1.dq_fld;
		pp var6 = ca.az(var5);
		if (null != var6.dy_fld) {
			var6 = var6.ar((byte)6);
		}

		cv var7 = ot.ef();
		lp var8 = var7 == null ? null : var7.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var8, var6, null, (byte)-14);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZB)Lfn;"
	)
	@Override
	public fn aw(lu var1, ol var2, int var3, boolean var4, byte var5) throws EOFException {
		int var6 = var1.dq_fld;
		pp var7 = ca.az(var6);
		if (null != var7.dy_fld) {
			var7 = var7.ar((byte)6);
		}

		cv var8 = ot.ef();
		lp var9 = var8 == null ? null : var8.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var9, var7, null, (byte)-30);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn bm(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		cv var5 = ot.ef();
		lp var6 = null == var5 ? null : var5.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var6, null, null, (byte)-6);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn bd(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		cv var5 = ot.ef();
		lp var6 = null == var5 ? null : var5.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var6, null, null, (byte)-8);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	@Override
	public fn ao(lu var1, ol var2, int var3, boolean var4) throws EOFException {
		pp var5 = null;
		pg var6 = null;
		int var7 = var1.dq_fld;
		if (var7 >= 0) {
			ds var8 = (ds)bw.dk_fld.ax_fld.ak(var7);
			if (var8 != null && null != var8.ah_fld) {
				var5 = var8.ah_fld;
				if (var5.dy_fld != null) {
					var5 = var5.ar((byte)6);
				}

				var6 = var8.aj((byte)1);
			}
		}

		cv var10 = ot.ef();
		lp var9 = null == var10 ? null : var10.av_fld;
		return var1.an(cf.cg_fld, var2, var3, var4, var9, var5, var6, (byte)-8);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int aa(int var0, int var1) {
		for (int var3 = 0; var3 < 8; var3++) {
			if (var1 <= 30 + var0) {
				return var3;
			}

			var0 += 30;
			var0 += var3 != 1 && var3 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISII)V"
	)
	static void dw(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) throws EOFException {
		di.dy(hk.mt_fld, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, (byte)-113);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([FI)V"
	)
	static void av(float[] var0, int var1) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		label52: {
			if (!(var0[0] > 1.0F)) {
				if (var1 == -1738065908) {
					return;
				}

				if (!(var0[1] > 1.0F)) {
					break label52;
				}
			}

			float var2 = (var0[1] - 2.0F) * var0[1] + var0[0] * (var0[0] - 2.0F + var0[1]) + 1.0F;
			if (sa.av_fld + var2 > 0.0F) {
				if (sa.av_fld + var0[0] < 1.3333334F) {
					if (var1 == -1738065908) {
						return;
					}

					float var3 = var0[0] - 2.0F;
					float var4 = var0[0] - 1.0F;
					float var5 = (float)Math.sqrt(var3 * var3 - var4 * (var4 * 4.0F));
					float var6 = 0.5F * (-var3 + var5);
					if (var0[1] + sa.av_fld > var6) {
						if (var1 == -1738065908) {
							return;
						}

						var0[1] = var6 - sa.av_fld;
					} else {
						var6 = 0.5F * (-var3 - var5);
						if (var0[1] < sa.av_fld + var6) {
							var0[1] = sa.av_fld + var6;
						}
					}
				} else {
					var0[0] = 1.3333334F - sa.av_fld;
					var0[1] = 0.33333334F - sa.av_fld;
				}
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	public static void ag(xj var0, int var1) {
		ze var2 = (ze)za.ak_fld.ah();
		if (null != var2) {
			int var3 = var0.au_fld;
			xi.ld(var0, var2.ak_fld, (byte)114);

			for (int var4 = 0; var4 < var2.ag_fld; var4++) {
				if (0 != var2.av_fld[var4]) {
					var0.bc(var2.av_fld[var4]);
				} else {
					try {
						int var5 = var2.az_fld[var4];
						if (0 == var5) {
							Field var6 = var2.ae_fld[var4];
							int var7 = var6.getInt(null);
							var0.bc(0);
							xi.ld(var0, var7, (byte)91);
						} else if (1 == var5) {
							if (var1 == -183117600) {
								return;
							}

							Field var23 = var2.ae_fld[var4];
							var23.setInt(null, var2.ah_fld[var4]);
							var0.bc(0);
						} else if (2 == var5) {
							Field var24 = var2.ae_fld[var4];
							int var27 = var24.getModifiers();
							var0.bc(0);
							xi.ld(var0, var27, (byte)122);
						}

						if (var5 != 3) {
							if (var5 == 4) {
								if (var1 == -183117600) {
									return;
								}

								Method var26 = var2.aw_fld[var4];
								int var29 = var26.getModifiers();
								var0.bc(0);
								xi.ld(var0, var29, (byte)100);
							}
						} else {
							Method var25 = var2.aw_fld[var4];
							byte[][] var28 = var2.ay_fld[var4];
							Object[] var8 = (Object[])(new Object[var28.length]);

							for (int var9 = 0; var9 < var28.length; var9++) {
								if (var1 == -183117600) {
									return;
								}

								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var28[var9]));
								var8[var9] = var10.readObject();
							}

							Object var30 = var25.invoke(null, (Object[])var8);
							if (null == var30) {
								var0.bc(0);
							} else if (var30 instanceof Number) {
								var0.bc(1);
								var0.fn(((Number)var30).longValue());
							} else if (var30 instanceof String) {
								var0.bc(2);
								var0.cc((String)var30, -564112273);
							} else {
								var0.bc(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.bc(-10);
					} catch (InvalidClassException var12) {
						var0.bc(-11);
					} catch (StreamCorruptedException var13) {
						var0.bc(-12);
					} catch (OptionalDataException var14) {
						var0.bc(-13);
					} catch (IllegalAccessException var15) {
						var0.bc(-14);
					} catch (IllegalArgumentException var16) {
						var0.bc(-15);
					} catch (InvocationTargetException var17) {
						var0.bc(-16);
					} catch (SecurityException var18) {
						var0.bc(-17);
					} catch (IOException var19) {
						var0.bc(-18);
					} catch (NullPointerException var20) {
						var0.bc(-19);
					} catch (Exception var21) {
						var0.bc(-20);
					} catch (Throwable var22) {
						var0.bc(-21);
					}
				}
			}

			var0.dg(var3);
			var2.gy_void();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public static void ak(String var0) {
		try {
			og.ci_fld.getCallbacks().openUrl(var0);
		} catch (Exception var3) {
			client.ii_fld.error("unable to open url {}", var0, var3);
		}
	}
}
