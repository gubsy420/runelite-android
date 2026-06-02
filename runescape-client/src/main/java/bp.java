import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bp")
public class bp {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] au_fld = new int[1000];
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] ae_fld = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	static long[] an_fld = new long[1000];
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	static double as_fld = Math.log(2.0);
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	static bi na_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedGetter(
		intValue = -991242929
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld = 0;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	static bj[] ad_fld = new bj[50];
	@ObfuscatedGetter(
		intValue = -148589753
	)
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ao_fld = 0;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	static lu ab_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static le at_fld = new le();
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	static Object[] al_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Calendar;"
	)
	static Calendar ac_fld = Calendar.getInstance();
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean bd_fld = false;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	static ArrayList bz_fld = new ArrayList();
	@ObfuscatedGetter(
		intValue = 1606897389
	)
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	static Object[] ai_fld = (Object[])(new Object[1000]);
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean bm_fld = false;

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gc(int var0, ba var1) {
		if (var0 == -1762701159) {
			int var5 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ay(var5) ? 1 : 0;
			return 1;
		} else if (var0 == -2077805494) {
			int var4 = au_fld[(gz.ax_fld -= 611026806) * -1495749901];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.as(var4) ? 1 : 0;
			return 1;
		} else if (3502 == var0) {
			int var3 = au_fld[(gz.ax_fld -= 2042424263) * 98525635];
			au_fld[(gz.ax_fld += -1637346685) * 1798410374 - 1] = client.ej_fld.ar(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lyz;II)V"
	)
	static void cb(yz var0, int var1, int var2) throws EOFException {
		Object[] var3 = (Object[])yz.hw(var0, 1697120891);
		ba var4;
		if (to.ak(var0.ae(2145063816))) {
			gb.aj_fld = (hv)var3[0];
			pc var5 = uh.ak(gb.aj_fld.ak_fld * -533319410);
			var4 = wl.ag(var0.ae(2060495527), -534683900 * var5.ah_fld, var5.ar_fld);
		} else if (me.ag(var0.ae(2051526966))) {
			int var6 = (Integer)var3[0];
			var4 = wl.ag(var0.ae(2026057704), var6, -1);
		} else {
			int var7 = (Integer)var3[0];
			var4 = an.ak(var7);
		}

		if (var4 != null) {
			me.az(var0, var4, var1, var2, 16711935);
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hh(int var0, ba var1) {
		if (var0 == 5630) {
			client.jk_fld = 362378318;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	static void dh(sl var0, int var1) {
		if (var1 < 0 || var1 >= var0.av()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int hd(int var0) {
		return (int)Math.pow(2.0, 7.0F + var0 / 256.0F);
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lyz;Lba;II)V"
	)
	static void cj(yz var0, ba var1, int var2, int var3) throws EOFException {
		Object[] var4 = (Object[])yz.hw(var0, 1697120891);
		gz.ax_fld = 0;
		db.aa_fld = 0;
		ef.aq_fld = 0;
		int var5 = -1;
		int[] var6 = var1.av_fld;
		int[] var7 = var1.ae_fld;
		int var8 = -1;
		am_fld = 0;
		bm_fld = false;
		boolean var9 = false;
		ao_fld = 0;
		boolean var23 = false /* VF: Semaphore variable */;

		label723: {
			label724: {
				try {
					var23 = true;
					ie.ar_fld = new int[var1.ay_fld * -1913436254];
					int var26 = 0;
					jq.af_fld = new long[447894039 * var1.as_fld];
					int var27 = 0;
					al_fld = (Object[])(new Object[var1.ar_fld * -378094016]);
					int var28 = 0;

					for (int var13 = 1; var13 < var4.length; var13++) {
						if (var4[var13] instanceof Integer) {
							int var14 = (Integer)var4[var13];
							if (var14 == -1006900888) {
								var14 = var0.ah(-1762702822);
							}

							if (var14 == -1829407953) {
								var14 = yz.wa(var0, 669757382);
							}

							if (-1881374166 == var14) {
								var14 = var0.av((short)24529) != null ? var0.av((short)-29488).bf_fld * -1717475673 : -1;
							}

							if (-2147483644 == var14) {
								var14 = var0.ay(-1347309706);
							}

							if (var14 == -2147483643) {
								var14 = var0.av((short)21124) != null ? var0.av((short)2388).by_fld * -801446727 : -1;
							}

							if (1611311064 == var14) {
								var14 = yz.wa_lu(var0, 383731706) != null ? yz.wa_lu(var0, 1541786094).bf_fld * 1125430606 : -1;
							}

							if (var14 == -2147483641) {
								var14 = yz.wa_lu(var0, 154847790) != null ? yz.wa_lu(var0, -1151038981).by_fld * -2140649577 : -1;
							}

							if (var14 == -2147483640) {
								var14 = var0.ar(-450034640);
							}

							if (var14 == -2147483639) {
								var14 = var0.af(1665838759);
							}

							if (var14 == -2147483638) {
								var14 = var0.al((byte)35);
							}

							ie.ar_fld[var26++] = var14;
						} else if (var4[var13] instanceof String) {
							String var45 = (String)var4[var13];
							if (var45.equals("event_opbase")) {
								var45 = var0.au(617634923);
							}

							al_fld[var28++] = var45;
						} else if (var4[var13] instanceof sl) {
							al_fld[var28++] = var4[var13];
						} else if (var4[var13] instanceof Long) {
							long var46 = (Long)var4[var13];
							jq.af_fld[var27++] = var46;
						}
					}

					br_fld = yz.ri(var0, (short)9903);

					label712:
					while (true) {
						ao_fld += 1173975000;
						if (ao_fld > var2) {
							throw new RuntimeException();
						}

						var8 = var6[++var5];
						if (var8 < 100) {
							if (var8 == 0) {
								au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var7[var5];
							} else if (1 == var8) {
								int var44 = var7[var5];
								au_fld[(gz.ax_fld += -1684678759) * -1896574278 - 1] = rt.ag_fld[var44];
							} else if (var8 == 2) {
								int var43 = var7[var5];
								rt.ag_fld[var43] = au_fld[(gz.ax_fld -= -1684678759) * -2056878773];
								ns.gk(var43, (byte)85);
							} else if (var8 == 3) {
								ai_fld[(ef.aq_fld += -700823647) * -836183525 - 1] = var1.ae(var5, -1684678759);
							} else if (6 == var8) {
								var5 += var7[var5];
							} else if (var8 == 7) {
								gz.ax_fld -= 2;
								if (au_fld[gz.ax_fld + 1] != au_fld[gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 8) {
								gz.ax_fld -= -1106867314;
								if (au_fld[gz.ax_fld] == au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 9) {
								gz.ax_fld -= 2;
								if (au_fld[-237382712 * gz.ax_fld] < au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 10) {
								gz.ax_fld -= 2;
								if (au_fld[gz.ax_fld * -2075695891] > au_fld[gz.ax_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 68) {
								db.aa_fld -= 2;
								if (an_fld[-26404695 * db.aa_fld] != an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (69 == var8) {
								db.aa_fld -= 815355106;
								if (an_fld[559664104 * db.aa_fld] == an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (1711432487 == var8) {
								db.aa_fld -= -1386092734;
								if (an_fld[db.aa_fld] < an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 244565452) {
								db.aa_fld -= 2;
								if (an_fld[db.aa_fld] > an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (21 == var8) {
								if (am_fld == 0) {
									var23 = false;
									break label724;
								}

								bj var41 = ad_fld[(am_fld -= -1774771793) * -1896017154];
								var1 = var41.ak_fld;
								var6 = var1.av_fld;
								var7 = var1.ae_fld;
								var5 = -173127471 * var41.ag_fld;
								ie.ar_fld = var41.az_fld;
								al_fld = (Object[])var41.av_fld;
								jq.af_fld = var41.ae_fld;
							} else if (var8 == 25) {
								int var40 = var7[var5];
								au_fld[(gz.ax_fld += -1684678759) * 857211766 - 1] = dv.ag(var40, (byte)102);
							} else if (var8 == 27) {
								int var39 = var7[var5];
								es.az(var39, au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
							} else if (var8 == 31) {
								gz.ax_fld -= -1012553408;
								if (au_fld[1410698259 * gz.ax_fld] <= au_fld[gz.ax_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 1959686650) {
								gz.ax_fld -= 80345846;
								if (au_fld[1371426617 * gz.ax_fld] >= au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (-847622524 == var8) {
								db.aa_fld -= 2;
								if (an_fld[db.aa_fld * -232222282] <= an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 73) {
								db.aa_fld -= 2;
								if (an_fld[db.aa_fld] >= an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 33) {
								au_fld[(gz.ax_fld += 1195376064) * -776631127 - 1] = ie.ar_fld[var7[var5]];
							} else if (34 == var8) {
								ie.ar_fld[var7[var5]] = au_fld[(gz.ax_fld -= 1328747266) * 1510934784];
							} else if (280026383 == var8) {
								ai_fld[(ef.aq_fld += 375399003) * -836183525 - 1] = al_fld[var7[var5]];
							} else if (36 == var8) {
								al_fld[var7[var5]] = ai_fld[(ef.aq_fld -= -211521517) * -1826787655];
							} else if (var8 == 37) {
								int var38 = var7[var5];
								ef.aq_fld -= -211521517 * var38;
								String var54 = kc.ak((Object[])ai_fld, -181436571 * ef.aq_fld, var38);
								ai_fld[(ef.aq_fld += 1842236624) * -2066933481 - 1] = var54;
							} else if (var8 == -1122995347) {
								gz.ax_fld--;
							} else if (39 == var8) {
								ef.aq_fld--;
							} else if (-608469863 == var8) {
								if (am_fld == 50) {
									throw new RuntimeException();
								}

								int var37 = var7[var5];
								ba var53 = an.ak(var37);
								int[] var56 = new int[1639999599 * var53.ay_fld];
								Object[] var16 = (Object[])(new Object[931598835 * var53.ar_fld]);
								long[] var17 = new long[var53.as_fld];
								if (var53.af_fld >= 0) {
									System.arraycopy(au_fld, 0 + (gz.ax_fld - var53.af_fld), var56, 0, var53.af_fld * 1542312603);
								}

								if (var53.al_fld >= 0) {
									System.arraycopy((Object)ai_fld, 0 + (ef.aq_fld - var53.al_fld), (Object)var16, 0, var53.al_fld);
								}

								if (var53.au_fld >= 0) {
									System.arraycopy(an_fld, 0 + (db.aa_fld - var53.au_fld), var17, 0, 95593920 * var53.au_fld);
								}

								gz.ax_fld = gz.ax_fld - var53.af_fld;
								ef.aq_fld = ef.aq_fld - var53.al_fld;
								db.aa_fld = db.aa_fld - var53.au_fld;
								bj var18 = new bj();
								var18.ak_fld = var1;
								var18.ag_fld = var5 * -55618284;
								var18.az_fld = ie.ar_fld;
								var18.av_fld = (Object[])al_fld;
								var18.ae_fld = jq.af_fld;
								ad_fld[(am_fld += -1774771793) * 1578456580 - 1] = var18;
								var1 = var53;
								var6 = var53.av_fld;
								var7 = var53.ae_fld;
								var5 = -1;
								ie.ar_fld = var56;
								al_fld = (Object[])var16;
								jq.af_fld = var17;
							} else if (var8 == 42) {
								au_fld[(gz.ax_fld += -1718459894) * -776631127 - 1] = ob.ek_fld.ag(var7[var5]);
							} else if (43 == var8) {
								ob.ek_fld.ak(var7[var5], au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
							} else if (-1678904946 == var8) {
								an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ob.ek_fld.av(var7[var5]);
							} else if (398822666 == var8) {
								dn.lq(ob.ek_fld, var7[var5], an_fld[(db.aa_fld -= 391403720) * 867932261]);
							} else if (316849481 == var8) {
								int var36 = var7[var5] >> 16;
								int var52 = var7[var5] & 65535;
								int var55 = au_fld[(gz.ax_fld -= 714321758) * -776631127];
								if (var55 < 0 || var55 > 797258467) {
									throw new RuntimeException();
								}

								if (var52 == 115) {
									al_fld[var36] = new sl(yq.az_fld, "", var55, var55);
								} else if (var52 != 834955525 && -560322957 != var52) {
									al_fld[var36] = new sl(yq.ak_fld, -1, var55, var55);
								} else {
									al_fld[var36] = new sl(yq.ak_fld, 0, var55, var55);
								}
							} else if (var8 == 45) {
								sl var30 = eh.av(var7[var5], al_fld[var7[var5]]);
								int var48 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
								nb.ae(var30, var48, (byte)100);
								if (yq.ak_fld == var30.ag_fld) {
									au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var30.ak()[var48];
								} else {
									ai_fld[(ef.aq_fld += -1535265562) * -836183525 - 1] = var30.az()[var48];
								}
							} else if (-378991395 == var8) {
								sl var31 = eh.av(var7[var5], al_fld[var7[var5]]);
								if (!var31.az_fld) {
									throw new RuntimeException();
								}

								if (var31.ag_fld == yq.ak_fld) {
									gz.ax_fld -= 2;
									int var49 = au_fld[-667745920 * gz.ax_fld];
									nb.ae(var31, var49, (byte)91);
									var31.ak()[var49] = au_fld[1 + gz.ax_fld];
								} else {
									int var50 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
									nb.ae(var31, var50, (byte)57);
									var31.az()[var50] = ai_fld[(ef.aq_fld -= 568065145) * 260777179];
								}
							} else if (var8 == -150520712) {
								String var32 = dn.vd(ob.ek_fld, var7[var5], (byte)95);
								ai_fld[(ef.aq_fld += -1977688645) * -483976794 - 1] = var32;
							} else if (var8 == -39951101) {
								ob.ek_fld.ae(var7[var5], (String)ai_fld[(ef.aq_fld -= -637681990) * -836183525]);
							} else if (var8 == -1712749086) {
								xv var33 = var1.ag_fld[var7[var5]];
								vl var51 = (vl)var33.ak(au_fld[(gz.ax_fld -= 67805981) * -776631127]);
								if (null != var51) {
									var5 += var51.ak_fld;
								}
							} else if (63 == var8) {
								ai_fld[(ef.aq_fld += -211521517) * 2106129048 - 1] = null;
							} else if (var8 == 61) {
								an_fld[(db.aa_fld += 837866175) * 1054282197 - 1] = var1.ah(var5, -1419748513);
							} else if (1986848329 == var8) {
								db.aa_fld -= -1636858440;
							} else if (var8 == 1291281791) {
								an_fld[(db.aa_fld += -1876559706) * 867932261 - 1] = jq.af_fld[var7[var5]];
							} else if (67 == var8) {
								jq.af_fld[var7[var5]] = an_fld[(db.aa_fld -= 1664991340) * 867932261];
							} else if (var8 == 74) {
								Integer var34 = ik.nd(gt.be_fld, var7[var5]);
								if (null == var34) {
									au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
								} else {
									au_fld[(gz.ax_fld += 1454081194) * -776631127 - 1] = var34;
								}
							} else {
								if (var8 != 76) {
									throw new IllegalStateException();
								}

								Integer var35 = bl.ey_fld.ak(var7[var5]);
								if (null == var35) {
									au_fld[(gz.ax_fld += 1727979444) * 1786211277 - 1] = -1;
								} else {
									au_fld[(gz.ax_fld += -1684678759) * 348109787 - 1] = var35;
								}
							}
						} else {
							boolean var29 = 1 == var1.ae_fld[var5];
							int var47 = qo.ah(var8, var1, var29);
							switch (var47) {
								case 0:
									var23 = false;
									break label712;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
							}
						}
					}
				} catch (Exception var24) {
					var9 = true;
					StringBuilder var11 = new StringBuilder(30);
					var11.append("").append(var1.hc_fld).append(" ");

					for (int var12 = am_fld - 1; var12 >= 0; var12--) {
						var11.append("").append(ad_fld[var12].ak_fld.hc_fld).append(" ");
					}

					var11.append("").append(var8);
					gl.ak(var11.toString(), var24);
					var23 = false;
					break label723;
				} finally {
					if (var23) {
						while (!bz_fld.isEmpty()) {
							dg var20 = (dg)(dg)bz_fld.remove(0);
							nt.fc(var20.ak(), dg.cl(var20, 181612643), dg.ed(var20, 321737442), dg.zi(var20, (byte)18), "", -990911053);
						}

						if (bm_fld) {
							bm_fld = false;
							nx.gf(1939516858);
						}

						if (!var9 && var3 > 0 && ao_fld >= var3) {
							gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld * 1287566635 + " of max " + var2, null);
						}
					}
				}

				while (!bz_fld.isEmpty()) {
					dg var15 = (dg)(dg)bz_fld.remove(0);
					nt.fc(var15.ak(), dg.cl(var15, 79866881), dg.ed(var15, 321737442), dg.zi(var15, (byte)25), "", -940500167);
				}

				if (bm_fld) {
					bm_fld = false;
					nx.gf(2092721554);
				}

				if (!var9 && var3 > 0 && ao_fld >= var3) {
					gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld + " of max " + var2, null);
				}

				return;
			}

			while (!bz_fld.isEmpty()) {
				dg var42 = (dg)(dg)bz_fld.remove(0);
				nt.fc(var42.ak(), dg.cl(var42, -867115864), dg.ed(var42, 321737442), dg.zi(var42, (byte)5), "", -804417685);
			}

			if (bm_fld) {
				bm_fld = false;
				nx.gf(1934522343);
			}

			if (!var9 && var3 > 0 && ao_fld >= var3) {
				gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld + " of max " + var2, null);
			}

			return;
		}

		while (!bz_fld.isEmpty()) {
			dg var10 = (dg)(dg)bz_fld.remove(0);
			nt.fc(var10.ak(), dg.cl(var10, -887044350), dg.ed(var10, 321737442), dg.zi(var10, (byte)50), "", -1103232035);
		}

		if (bm_fld) {
			bm_fld = false;
			nx.gf(2079837990);
		}

		if (!var9 && var3 > 0 && ao_fld >= var3) {
			gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld + " of max " + var2, null);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)Lsl;"
	)
	static sl ch(int var0, Object var1) {
		sl var2 = (sl)var1;
		if (null == var2) {
			throw new RuntimeException();
		} else {
			return var2;
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)Lsl;"
	)
	static sl ct(int var0, Object var1) {
		sl var2 = (sl)var1;
		if (null == var2) {
			throw new RuntimeException();
		} else {
			return var2;
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)Lsl;"
	)
	static sl cl(int var0, Object var1) {
		sl var2 = (sl)var1;
		if (null == var2) {
			throw new RuntimeException();
		} else {
			return var2;
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Llu;III)V"
	)
	static final void er(lu var0, int var1, int var2, int var3) {
		if (null == var0.eg_fld) {
			throw new RuntimeException();
		} else {
			var0.eg_fld[var1] = var2;
			var0.ef_fld[var1] = var3;
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ep(int var0, ba var1, boolean var2) throws EOFException, UnsupportedEncodingException {
		lu var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var3 = cf.cg_fld.ak(var4);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		if (var0 == 1100) {
			gz.ax_fld -= 2;
			int var39 = au_fld[gz.ax_fld];
			int var45 = au_fld[1 + gz.ax_fld];
			if (var3.bx_fld == 12) {
				li var46 = lu.bv(var3, -630987824);
				if (var46 != null && var46.al(var39, var45)) {
				}
			} else {
				var3.cp_fld = var39;
				if (var3.cp_fld > var3.cn_fld - var3.bb_fld) {
					var3.cp_fld = var3.cn_fld - var3.bb_fld;
				}

				if (var3.cp_fld < 0) {
					var3.cp_fld = 0;
				}

				var3.ce_fld = var45;
				if (var3.ce_fld > var3.cr_fld - var3.cd_fld) {
					var3.ce_fld = var3.cr_fld - var3.cd_fld;
				}

				if (var3.ce_fld < 0) {
					var3.ce_fld = 0;
				}
			}

			return 1;
		} else if (1101 == var0) {
			var3.ca_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1102) {
			var3.cz_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1103 == var0) {
			var3.cb_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1104) {
			var3.cu_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1105 == var0) {
			var3.cj_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1106 == var0) {
			var3.cl_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1107) {
			var3.dc_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1108 == var0) {
			var3.dm_fld = -1800825853;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1109) {
			gz.ax_fld -= 6;
			var3.da_fld = 1016596669 * au_fld[gz.ax_fld];
			var3.dk_fld = -139613485 * au_fld[gz.ax_fld + 1];
			var3.dx_fld = au_fld[gz.ax_fld + 2];
			var3.ds_fld = au_fld[3 + gz.ax_fld];
			var3.du_fld = au_fld[4 + gz.ax_fld];
			var3.db_fld = -964578897 * au_fld[gz.ax_fld + 5];
			return 1;
		} else if (1110 == var0) {
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var3.dl_fld != var38) {
				var3.dl_fld = var38;
				var3.gy_fld = 0;
				var3.gz_fld = 0;
			}

			return 1;
		} else if (var0 == 1111) {
			var3.di_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1112 == var0) {
			String var37 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			if (12 == var3.bx_fld) {
				li var44 = lu.bv(var3, -1951964732);
				if (var44 != null && var44.cq()) {
					li.sc(var44, var37, -1448617853);
				} else {
					var3.dp_fld = var37;
				}
			} else if (!var37.equals(var3.dp_fld)) {
				var3.dp_fld = var37;
			}

			return 1;
		} else if (1113 == var0) {
			var3.de_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (12 == var3.bx_fld) {
				li var36 = lu.bv(var3, -532011146);
				if (var36 != null) {
					var36.an();
				}
			}

			return 1;
		} else if (1114 == var0) {
			gz.ax_fld -= 3;
			if (var3.bx_fld == 12) {
				li var35 = lu.bv(var3, -1010753264);
				if (null != var35) {
					var35.af(au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld]);
					var35.au(au_fld[2 + gz.ax_fld]);
				}
			} else {
				var3.ep_fld = au_fld[gz.ax_fld];
				var3.eb_fld = 2097134267 * au_fld[gz.ax_fld + 1];
				var3.es_fld = au_fld[gz.ax_fld + 2];
			}

			return 1;
		} else if (var0 == 1115) {
			var3.ed_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1116 == var0) {
			var3.dh_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1117 == var0) {
			var3.dv_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1118) {
			var3.dz_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1119 == var0) {
			var3.dt_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1120 == var0) {
			gz.ax_fld -= 2;
			var3.cn_fld = au_fld[gz.ax_fld];
			var3.cr_fld = -348242603 * au_fld[1 + gz.ax_fld];
			if (var3.bx_fld == 0) {
				lu[] var34 = var3.by_fld == -1 ? cf.cg_fld.aw_fld[var3.bf_fld >> 16] : cf.cg_fld.ak(var3.cv_fld).ge_fld;
				tb.ag(var34, var3, false, cf.cg_fld, client.cz_fld, 37119670);
			}

			return 1;
		} else if (var0 == 1121) {
			jg.fk(var3.bf_fld, var3.by_fld);
			cf.cg_fld.bs(var3);
			return 1;
		} else if (var0 == 1122) {
			var3.ch_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1123) {
			var3.cg_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1124 == var0) {
			var3.co_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1125 == var0) {
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ym var43 = (ym)ka.ak(wt.ak(), var33);
			if (null != var43) {
				var3.ck_fld = var43;
			}

			return 1;
		} else if (1126 == var0) {
			boolean var32 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			var3.ci_fld = var32;
			return 1;
		} else if (1127 == var0) {
			boolean var31 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			var3.dn_fld = var31;
			return 1;
		} else if (var0 == 1129) {
			var3.ct_fld = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			return 1;
		} else if (1130 == var0) {
			var3.ac((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], "", xh.jn_fld, hb.at());
			return 1;
		} else if (1131 == var0) {
			gz.ax_fld -= 2;
			var3.bz(au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], -2010553364);
			return 1;
		} else if (var0 == 1132) {
			var3.br((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], au_fld[(gz.ax_fld -= -1684678759) * -776631127], -729957410);
			return 1;
		} else if (var0 == 1133) {
			gz.ax_fld--;
			ln var30 = var3.bi(372890496);
			if (null != var30) {
				var30.ak_fld = au_fld[gz.ax_fld];
			}

			return 1;
		} else if (var0 == 1134) {
			gz.ax_fld--;
			ln var29 = var3.bi(-131834580);
			if (null != var29) {
				var29.ag_fld = 171528145 * au_fld[gz.ax_fld];
			}

			return 1;
		} else if (1135 == var0) {
			ef.aq_fld--;
			li var28 = lu.bv(var3, -1824349168);
			if (null != var28) {
				var3.dj_fld = (String)ai_fld[ef.aq_fld];
			}

			return 1;
		} else if (1136 == var0) {
			gz.ax_fld--;
			ln var27 = var3.bi(707686003);
			if (null != var27) {
				var27.az_fld = au_fld[gz.ax_fld];
			}

			return 1;
		} else if (var0 == 1137) {
			gz.ax_fld--;
			li var26 = lu.bv(var3, -981873300);
			if (var26 != null && var26.ay(au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1138) {
			gz.ax_fld--;
			li var25 = lu.bv(var3, -1331495850);
			if (var25 != null && var25.as(au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1139) {
			gz.ax_fld--;
			li var24 = lu.bv(var3, -632938153);
			if (null != var24 && var24.ar(au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1140) {
			boolean var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			fu.xp(client.fy_fld, -654224871);
			li var42 = lu.bv(var3, -1113494621);
			if (null != var42 && var42.ag(var23) && var23) {
				client.fy_fld.ag(var3, 114546440);
			}

			return 1;
		} else if (var0 == 1141) {
			boolean var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (!var22 && client.fy_fld.ak() == var3) {
				fu.xp(client.fy_fld, -175839869);
			}

			li var41 = lu.bv(var3, -1241110597);
			if (null != var41) {
				var41.az(var22);
			}

			return 1;
		} else if (1142 == var0) {
			gz.ax_fld -= 2;
			li var21 = lu.bv(var3, -1549176859);
			if (null != var21 && li.ik(var21, au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld], (byte)-53)) {
			}

			return 1;
		} else if (var0 == 1143) {
			gz.ax_fld--;
			li var20 = lu.bv(var3, -1867849902);
			if (var20 != null && li.ik(var20, au_fld[gz.ax_fld], au_fld[gz.ax_fld], (byte)-105)) {
			}

			return 1;
		} else if (1144 == var0) {
			gz.ax_fld--;
			li var19 = lu.bv(var3, -1423973885);
			if (var19 != null) {
				var19.cr(au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1145) {
			gz.ax_fld--;
			li var18 = lu.bv(var3, -1072285527);
			if (null != var18) {
				var18.ce(au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1146) {
			gz.ax_fld--;
			li var17 = lu.bv(var3, -1322006260);
			if (null != var17) {
				li.ct(var17, au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1147) {
			gz.ax_fld--;
			li var16 = lu.bv(var3, -734097437);
			if (var16 != null) {
				li.jo(var16, au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1148) {
			gz.ax_fld -= 2;
			sc var15 = var3.bu(2075867486);
			if (var15 != null) {
				var15.ak(au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1]);
			}

			return 1;
		} else if (var0 == 1149) {
			gz.ax_fld -= 2;
			sc var14 = var3.bu(883755459);
			if (null != var14) {
				var14.ag((char)au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld]);
			}

			return 1;
		} else if (1150 == var0) {
			var3.bm((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], xh.jn_fld, (byte)-25);
			return 1;
		} else if (var0 == 1151) {
			ef.aq_fld -= 3;
			String var13 = (String)ai_fld[ef.aq_fld];
			String var40 = (String)ai_fld[1 + ef.aq_fld];
			String var6 = (String)ai_fld[ef.aq_fld + 2];
			long var7 = hb.at();
			long var9 = ha.ac();
			String var11 = lo.ae().az(lo.ae().bt_fld * -2048773107);
			if (var7 != -1L) {
				var13 = var13.replaceAll("%userid%", Long.toString(var7));
			}

			if (-1L != var9) {
				var13 = var13.replaceAll("%userhash%", Long.toString(var9));
			}

			if (!var11.isEmpty()) {
				var13 = var13.replaceAll("%deviceid%", var11);
			}

			var3.aj(var13, var40, var6, var11, Long.toString(var9), xh.jn_fld, -1534798489);
			return 1;
		} else if (1152 == var0) {
			if (11 != var3.bx_fld) {
				throw new RuntimeException();
			} else {
				ma var12 = var3.bx_ma(1908514348);
				boolean var5 = null != var12 && var12.ah() && cf.ak().as(var12.ax());
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5 ? 1 : 0;
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	static void dv(sl var0, int var1) {
		if (var1 < 0 || var1 >= var0.av()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Llu;I[B[B)V"
	)
	static final void ec(lu var0, int var1, byte[] var2, byte[] var3) {
		if (null == var0.er_fld) {
			if (var2 == null) {
				return;
			}

			var0.er_fld = new byte[11][];
			var0.en_fld = new byte[11][];
			var0.eg_fld = new int[11];
			var0.ef_fld = new int[11];
		}

		var0.er_fld[var1] = var2;
		if (var2 != null) {
			var0.ez_fld = true;
		} else {
			var0.ez_fld = false;

			for (int var4 = 0; var4 < var0.er_fld.length; var4++) {
				if (null != var0.er_fld[var4]) {
					var0.ez_fld = true;
					break;
				}
			}
		}

		var0.en_fld[var1] = var3;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ga(int var0, ba var1) throws EOFException {
		if (3903 == var0) {
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var33].av((byte)83);
			return 1;
		} else if (3904 == var0) {
			int var32 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2082911 * client.fs_fld[var32].ah_fld;
			return 1;
		} else if (var0 == 3905) {
			int var31 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var31].av_fld * -220330603;
			return 1;
		} else if (var0 == 3906) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 626220965 * client.fs_fld[var30].ag_fld;
			return 1;
		} else if (3907 == var0) {
			int var29 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var29].az_fld * -1164425433;
			return 1;
		} else if (3908 == var0) {
			int var28 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -701801723 * client.fs_fld[var28].ae_fld;
			return 1;
		} else if (var0 == 3910) {
			int var27 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var44 = client.fs_fld[var27].ag(-1788581507);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var44 == 0 ? 1 : 0;
			return 1;
		} else if (3911 == var0) {
			int var26 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var43 = client.fs_fld[var26].ag(1419304583);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var43 == 2 ? 1 : 0;
			return 1;
		} else if (3912 == var0) {
			int var25 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var42 = client.fs_fld[var25].ag(1790353672);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 5 == var42 ? 1 : 0;
			return 1;
		} else if (3913 == var0) {
			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var41 = client.fs_fld[var24].ag(-129998091);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1 == var41 ? 1 : 0;
			return 1;
		} else if (var0 == 3914) {
			boolean var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.az_fld, var23, 623273710);
			}

			return 1;
		} else if (3915 == var0) {
			boolean var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (ue.fu_fld != null) {
				nc.ur(ue.fu_fld, nc.ag_fld, var22, 623273710);
			}

			return 1;
		} else if (var0 == 3916) {
			gz.ax_fld -= 2;
			boolean var21 = au_fld[gz.ax_fld] == 1;
			boolean var40 = au_fld[gz.ax_fld + 1] == 1;
			if (null != ue.fu_fld) {
				client.fi_fld.ak_fld = var40;
				nc.ur(ue.fu_fld, client.fi_fld, var21, 623273710);
			}

			return 1;
		} else if (3917 == var0) {
			boolean var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.ak_fld, var20, 623273710);
			}

			return 1;
		} else if (var0 == 3918) {
			boolean var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.av_fld, var19, 623273710);
			}

			return 1;
		} else if (3919 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ue.fu_fld == null ? 0 : ue.fu_fld.ae_fld.size();
			return 1;
		} else if (var0 == 3920) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var39 = (nl)(nl)ue.fu_fld.ae_fld.get(var18);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var39.ak_fld;
			return 1;
		} else if (3921 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var38 = (nl)(nl)ue.fu_fld.ae_fld.get(var17);
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = nl.rl(var38, -1523881648);
			return 1;
		} else if (var0 == 3922) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var37 = (nl)(nl)ue.fu_fld.ae_fld.get(var16);
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var37.ag();
			return 1;
		} else if (3923 == var0) {
			int var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var36 = (nl)(nl)ue.fu_fld.ae_fld.get(var15);
			long var5 = lz.ak() - yf.fr_fld - var36.ag_fld;
			int var7 = (int)(var5 / 3600000L);
			int var8 = (int)((var5 - var7 * 3600000) / 60000L);
			int var9 = (int)((var5 - 3600000 * var7 - 60000 * var8) / 1000L);
			String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var10;
			return 1;
		} else if (3924 == var0) {
			int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var35 = (nl)(nl)ue.fu_fld.ae_fld.get(var14);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var35.az_fld.ag_fld * 626220965;
			return 1;
		} else if (var0 == 3925) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var34 = (nl)(nl)ue.fu_fld.ae_fld.get(var13);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -220330603 * var34.az_fld.av_fld;
			return 1;
		} else if (3926 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var4 = (nl)(nl)ue.fu_fld.ae_fld.get(var12);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2082911 * var4.az_fld.ah_fld;
			return 1;
		} else if (var0 == 3931) {
			int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var11, -1752383175).el_fld ? 1 : 0;
			return 1;
		} else if (3939 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var3, -1752383175).eh_fld ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fe(int var0, ba var1) throws EOFException {
		lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		if (var0 == 2800) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = nt.ag(uo.sa(cf.cg_fld, var3, 1442433108));
			return 1;
		} else if (2801 != var0) {
			if (var0 == 2802) {
				if (null == var3.eq_fld) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				} else {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.eq_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var4--;
			if (var3.ei_fld != null && var4 < var3.ei_fld.length && null != var3.ei_fld[var4]) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.ei_fld[var4];
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Llu;IZLba;)V"
	)
	static void dq(lu var0, int var1, boolean var2, ba var3) {
		if (null == var0.ge_fld) {
			var0.ge_fld = new lu[var1 + 1];
		}

		if (var0.ge_fld.length <= var1) {
			lu[] var4 = new lu[1 + var1];
			System.arraycopy(var0.ge_fld, 0, var4, 0, var0.ge_fld.length);
			var0.ge_fld = var4;
		} else {
			lu var5 = var0.ge_fld[var1];
			if (null != var5) {
				if (var2) {
					throw new RuntimeException("");
				}

				hy.cz(var5, var0);
			}
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lyz;II)V"
	)
	static void co(yz var0, int var1, int var2) throws EOFException {
		Object[] var3 = (Object[])yz.hw(var0, 1697120891);
		ba var4;
		if (to.ak(var0.ae(2105208731))) {
			gb.aj_fld = (hv)var3[0];
			pc var5 = uh.ak(gb.aj_fld.ak_fld);
			var4 = wl.ag(var0.ae(2078097916), var5.ah_fld, var5.ar_fld);
		} else if (me.ag(var0.ae(2102930113))) {
			int var6 = (Integer)var3[0];
			var4 = wl.ag(var0.ae(2077223207), var6, -1);
		} else {
			int var7 = (Integer)var3[0];
			var4 = an.ak(var7);
		}

		if (var4 != null) {
			me.az(var0, var4, var1, var2, 16711935);
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	static void dd(lu var0, int var1) {
		if (var0.bx_fld * 384468820 == 0 && var0.by_fld > -1) {
			if (var1 > var0.cs_fld) {
				var0.cs_fld = 391226644 * var1;
			}

			if (var1 < var0.cx_fld) {
				var0.cx_fld = var1;
			}
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	static void dl(lu var0, int var1) {
		if (var0.bx_fld == 0 && var0.by_fld > -1) {
			if (var1 > var0.cs_fld) {
				var0.cs_fld = var1;
			}

			if (var1 < var0.cx_fld) {
				var0.cx_fld = -745453760 * var1;
			}
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	static void dr(lu var0, int var1) {
		if (var0.bx_fld == 0 && var0.by_fld > -1) {
			if (var1 > var0.cs_fld) {
				var0.cs_fld = var1;
			}

			if (var1 < var0.cx_fld) {
				var0.cx_fld = var1;
			}
		}
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int da(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == 100) {
			gz.ax_fld -= 4;
			int var36 = au_fld[gz.ax_fld];
			int var56 = au_fld[1 + gz.ax_fld];
			int var71 = au_fld[gz.ax_fld + 2];
			boolean var84 = 0 != au_fld[3 + gz.ax_fld];
			if (var71 < 0) {
				throw new RuntimeException("");
			} else {
				lu var96 = cf.cg_fld.ak(var36);
				if (0 != var96.bx_fld) {
					throw new RuntimeException("");
				} else {
					mg.aw(var96, var71, var84, var1, (short)-11);
					lu var100 = new lu();
					var100.bx_fld = var56;
					var100.cv_fld = (var100.bf_fld = var96.bf_fld * 1) * 1050017623;
					var100.by_fld = var71;
					var100.bj_fld = true;
					if (12 == var56) {
						hg.cm(var100);
					}

					var96.ge_fld[var71] = var100;
					if (var2) {
						gs.ap_fld = var100;
					} else {
						ab_fld = var100;
					}

					return 1;
				}
			}
		} else if (var0 == 101) {
			lu var35 = var2 ? gs.ap_fld : ab_fld;
			lu var55 = cf.cg_fld.ak(var35.bf_fld);
			hy.cz(var35, var55);
			return 1;
		} else if (102 == var0) {
			gz.ax_fld--;
			int var34 = au_fld[gz.ax_fld];
			lu var54 = cf.cg_fld.ak(var34);
			var54.ge_fld = null;
			return 1;
		} else if (var0 == 105) {
			gz.ax_fld -= 3;
			int var33 = au_fld[gz.ax_fld];
			int var53 = au_fld[1 + gz.ax_fld];
			int var70 = au_fld[gz.ax_fld + 2];
			lu var83 = cf.cg_fld.ak(var33);
			lu var95 = cf.cg_fld.ag(var33, var53, -2139583145);
			if (var83 == null) {
				throw new RuntimeException("");
			} else if (var53 < 0) {
				throw new RuntimeException("");
			} else if (null == var95) {
				throw new RuntimeException("");
			} else if (var95.bx_fld == 0) {
				throw new RuntimeException("");
			} else {
				mg.aw(var83, var70, true, var1, (short)9401);
				if (-1 != var95.cy_fld) {
					lu var98 = cf.cg_fld.ag(var33, var95.cy_fld, 352179298);
					lr.ay(var98, var70, 1828744557);
				}

				lu var99 = new lu(var95);
				var99.by_fld = var70;
				if (12 == var95.bx_fld) {
					hg.cm(var99);
				}

				var83.ge_fld[var70] = var99;
				if (var2) {
					gs.ap_fld = var99;
				} else {
					ab_fld = var99;
				}

				return 1;
			}
		} else if (106 == var0) {
			gz.ax_fld -= 2;
			int var32 = au_fld[gz.ax_fld];
			int var52 = au_fld[gz.ax_fld + 1];
			lu var69 = var2 ? gs.ap_fld : ab_fld;
			if (var69 == null) {
				throw new RuntimeException("");
			} else {
				lu var82 = cf.cg_fld.ak(var69.cv_fld);
				if (var69.bx_fld != 0) {
					throw new RuntimeException("");
				} else if (var82.bx_fld != 0) {
					throw new RuntimeException();
				} else {
					mg.aw(var82, var52, true, var1, (short)11499);
					lr.ay(var69, var52, 1828744557);
					lu var94 = new lu();
					var94.bx_fld = var32;
					var94.cv_fld = (var94.bf_fld = var82.bf_fld * 1) * 1050017623;
					var94.cy_fld = var69.by_fld * -281153977;
					var94.by_fld = var52;
					var94.bj_fld = true;
					if (var32 == 12) {
						hg.cm(var94);
					}

					var82.ge_fld[var52] = var94;
					if (var2) {
						gs.ap_fld = var94;
					} else {
						ab_fld = var94;
					}

					return 1;
				}
			}
		} else if (var0 == 107) {
			gz.ax_fld -= 2;
			int var31 = au_fld[gz.ax_fld];
			int var51 = au_fld[1 + gz.ax_fld];
			lu var68 = var2 ? gs.ap_fld : ab_fld;
			if (null == var68) {
				throw new RuntimeException("");
			} else {
				lu var81 = cf.cg_fld.ag(var68.cv_fld, var68.cy_fld, -1959699676);
				lu var93 = cf.cg_fld.ak(var81.cv_fld);
				if (var81.bx_fld != 0) {
					throw new RuntimeException("");
				} else if (0 != var93.bx_fld) {
					throw new RuntimeException();
				} else {
					mg.aw(var93, var51, true, var1, (short)28939);
					lr.ay(var81, var51, 1828744557);
					lu var97 = new lu();
					var97.bx_fld = var31;
					var97.cv_fld = (var97.bf_fld = 1 * var93.bf_fld) * 1050017623;
					var97.cy_fld = var81.by_fld * -281153977;
					var97.by_fld = var51;
					var97.bj_fld = true;
					if (var31 == 12) {
						hg.cm(var97);
					}

					var93.ge_fld[var51] = var97;
					if (var2) {
						gs.ap_fld = var97;
					} else {
						ab_fld = var97;
					}

					return 1;
				}
			}
		} else if (200 == var0) {
			gz.ax_fld -= 2;
			int var30 = au_fld[gz.ax_fld];
			int var50 = au_fld[1 + gz.ax_fld];
			lu var67 = var50 != -1 ? cf.cg_fld.ag(var30, var50, -583759937) : null;
			ag.af(var67, var2);
			return 1;
		} else if (var0 == 201) {
			ag.af(cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]), var2);
			return 1;
		} else if (var0 == 204) {
			lu var29 = var2 ? gs.ap_fld : ab_fld;
			lu var49 = var29 != null ? cf.cg_fld.ag(var29.cv_fld, var29.cy_fld, 819675219) : null;
			ag.af(var49, var2);
			return 1;
		} else if (var0 == 205) {
			lu var28 = var2 ? gs.ap_fld : ab_fld;
			lu var48 = null != var28 ? cf.cg_fld.ak(var28.cv_fld) : null;
			ag.af(var48, var2);
			return 1;
		} else if (206 == var0) {
			lu var27 = var2 ? gs.ap_fld : ab_fld;
			if (var27 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var27.by_fld == -1) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var47 = cf.cg_fld.ak(var27.cv_fld);
				lu var66 = null;

				for (int var80 = var27.by_fld + 1; var80 < var47.ge_fld.length; var80++) {
					lu var92 = var47.ge_fld[var80];
					if (null != var92 && var92.cy_fld == var27.cy_fld) {
						var66 = var92;
						break;
					}
				}

				ag.af(var66, var2);
				return 1;
			}
		} else if (207 == var0) {
			lu var26 = var2 ? gs.ap_fld : ab_fld;
			if (var26 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (-1 == var26.by_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var46 = cf.cg_fld.ak(var26.cv_fld);
				lu var65 = null;

				for (int var79 = var26.by_fld - 1; var79 >= 0; var79--) {
					lu var91 = var46.ge_fld[var79];
					if (var91 != null && var26.cy_fld == var91.cy_fld) {
						var65 = var91;
						break;
					}
				}

				ag.af(var65, var2);
				return 1;
			}
		} else if (208 == var0) {
			lu var25 = var2 ? gs.ap_fld : ab_fld;
			if (null == var25) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (0 != var25.bx_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var45 = cf.cg_fld.ak(var25.cv_fld);
				if (var45.ge_fld == null) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				} else {
					int var64 = 0;

					for (int var78 = 0; var78 < var45.ge_fld.length; var78++) {
						lu var90 = var45.ge_fld[var78];
						if (var90 != null && var25.by_fld == var90.cy_fld) {
							var64++;
						}
					}

					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var64;
					return 1;
				}
			}
		} else if (var0 == 209) {
			lu var24 = var2 ? gs.ap_fld : ab_fld;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var24 != null ? var24.cy_fld : -1;
			return 1;
		} else if (var0 == 210) {
			int var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var44 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var63 = he.cg(var23);
			int var77 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var89 = he.cg(var44);
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			px var9 = kb.ag_px(var8, -849904790);
			Object var10 = var9.as();
			Object var11 = null;
			if (var77 >= 0) {
				px var12 = kb.ag_px(var77, -1237279207);
				var11 = var12.as();
			}

			lu var101 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			lu var13 = null;
			if (null != var101 && null != var101.ge_fld) {
				for (int var14 = 0; var14 < var101.ge_fld.length; var14++) {
					lu var15 = var101.ge_fld[var14];
					if (var15 != null && (var8 < 0 || var15.ao(var8, var10, -1870384990).equals(var89)) && (var77 < 0 || var15.ao(var77, var11, -2071585581).equals(var63))) {
						var13 = var15;
						break;
					}
				}
			}

			ag.af(var13, var2);
			return 1;
		} else if (var0 == 211) {
			gz.ax_fld -= 3;
			int var22 = au_fld[gz.ax_fld];
			lu var43 = cf.cg_fld.ak(au_fld[gz.ax_fld + 1]);
			int var62 = au_fld[2 + gz.ax_fld];
			at_fld.ak(var22, var43, var62, 1924061492);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.av();
			return 1;
		} else if (212 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			lu var42 = var2 ? gs.ap_fld : ab_fld;
			if (-1 == var42.by_fld) {
				at_fld.ak(var21, var42, -1, 1878593558);
			} else {
				at_fld.ak(var21, cf.cg_fld.ak(var42.cv_fld), var42.by_fld, 1592991402);
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.av();
			return 1;
		} else if (213 == var0) {
			ag.af(at_fld.ae(), var2);
			return 1;
		} else if (var0 == 214) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.ah();
			return 1;
		} else if (215 == var0) {
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ag.al(at_fld.aw());
			return 1;
		} else if (var0 == 216) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var41 = he.cg(var20);
			int var61 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			px var76 = kb.ag_px(var61, -487076897);
			Object var88 = var76.as();
			at_fld.ay(var61, var41, var88, -1531394760);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.av();
			return 1;
		} else if (217 == var0) {
			int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			lu var40 = var2 ? gs.ap_fld : ab_fld;
			if (var40 == null) {
				throw new RuntimeException("");
			} else if (var40.bx_fld != 0) {
				throw new RuntimeException("");
			} else {
				lu var60 = cf.cg_fld.ak(var40.cv_fld);
				if (var60.bx_fld != 0) {
					throw new RuntimeException();
				} else {
					lu var75 = cx.ar(var19, var60, var40);
					ag.af(var75, var2);
					return 1;
				}
			}
		} else if (218 == var0) {
			lu var18 = var2 ? gs.ap_fld : ab_fld;
			if (var18 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var39 = cf.cg_fld.ak(var18.cv_fld);
				if (var39 != null && null != var39.ge_fld) {
					lu var59 = null;

					for (int var74 = 0; var74 < var39.ge_fld.length; var74++) {
						lu var87 = var39.ge_fld[var74];
						if (null != var87 && var18.cy_fld == var87.cy_fld) {
							var59 = var87;
							break;
						}
					}

					ag.af(var59, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 219) {
			lu var17 = var2 ? gs.ap_fld : ab_fld;
			if (null == var17) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var38 = cf.cg_fld.ak(var17.cv_fld);
				if (null != var38 && null != var38.ge_fld) {
					lu var58 = null;

					for (int var73 = var38.ge_fld.length - 1; var73 >= 0; var73--) {
						lu var86 = var38.ge_fld[var73];
						if (null != var86 && var86.cy_fld == var17.cy_fld) {
							var58 = var86;
							break;
						}
					}

					ag.af(var58, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 220) {
			lu var16 = var2 ? gs.ap_fld : ab_fld;
			if (null == var16) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var16.bx_fld != 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var37 = cf.cg_fld.ak(var16.cv_fld);
				if (var37 != null && var37.ge_fld != null) {
					lu var57 = null;

					for (int var72 = 0; var72 < var37.ge_fld.length; var72++) {
						lu var85 = var37.ge_fld[var72];
						if (null != var85 && var85.cy_fld == var16.by_fld) {
							var57 = var85;
							break;
						}
					}

					ag.af(var57, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 221) {
			lu var3 = var2 ? gs.ap_fld : ab_fld;
			if (null == var3) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (0 != var3.bx_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var4 = cf.cg_fld.ak(var3.cv_fld);
				if (var4 != null && null != var4.ge_fld) {
					lu var5 = null;

					for (int var6 = var4.ge_fld.length - 1; var6 >= 0; var6--) {
						lu var7 = var4.ge_fld[var6];
						if (var7 != null && var7.cy_fld == var3.by_fld) {
							var5 = var7;
							break;
						}
					}

					ag.af(var5, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lsl;"
	)
	static sl jj(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (sl)var0;
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int dk(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == -1456718499) {
			gz.ax_fld -= 4;
			int var36 = au_fld[gz.ax_fld];
			int var56 = au_fld[1 + gz.ax_fld];
			int var71 = au_fld[gz.ax_fld + 2];
			boolean var84 = 0 != au_fld[3 + gz.ax_fld];
			if (var71 < 0) {
				throw new RuntimeException("");
			} else {
				lu var96 = cf.cg_fld.ak(var36);
				if (0 != var96.bx_fld) {
					throw new RuntimeException("");
				} else {
					mg.aw(var96, var71, var84, var1, (short)2643);
					lu var100 = new lu();
					var100.bx_fld = var56 * 2018394919;
					var100.cv_fld = (var100.bf_fld = var96.bf_fld * 1) * 1050017623;
					var100.by_fld = var71 * -75455828;
					var100.bj_fld = true;
					if (12 == var56) {
						hg.cm(var100);
					}

					var96.ge_fld[var71] = var100;
					if (var2) {
						gs.ap_fld = var100;
					} else {
						ab_fld = var100;
					}

					return 1;
				}
			}
		} else if (var0 == 101) {
			lu var35 = var2 ? gs.ap_fld : ab_fld;
			lu var55 = cf.cg_fld.ak(var35.bf_fld);
			hy.cz(var35, var55);
			return 1;
		} else if (102 == var0) {
			gz.ax_fld--;
			int var34 = au_fld[gz.ax_fld];
			lu var54 = cf.cg_fld.ak(var34);
			var54.ge_fld = null;
			return 1;
		} else if (var0 == 556486830) {
			gz.ax_fld -= -1861838431;
			int var33 = au_fld[gz.ax_fld];
			int var53 = au_fld[1 + gz.ax_fld];
			int var70 = au_fld[gz.ax_fld + 2];
			lu var83 = cf.cg_fld.ak(var33);
			lu var95 = cf.cg_fld.ag(var33, var53, 87425149);
			if (var83 == null) {
				throw new RuntimeException("");
			} else if (var53 < 0) {
				throw new RuntimeException("");
			} else if (null == var95) {
				throw new RuntimeException("");
			} else if (var95.bx_fld == 0) {
				throw new RuntimeException("");
			} else {
				mg.aw(var83, var70, true, var1, (short)4580);
				if (-1 != var95.cy_fld) {
					lu var98 = cf.cg_fld.ag(var33, var95.cy_fld, -1552201751);
					lr.ay(var98, var70, 1828744557);
				}

				lu var99 = new lu(var95);
				var99.by_fld = var70;
				if (12 == var95.bx_fld) {
					hg.cm(var99);
				}

				var83.ge_fld[var70] = var99;
				if (var2) {
					gs.ap_fld = var99;
				} else {
					ab_fld = var99;
				}

				return 1;
			}
		} else if (106 == var0) {
			gz.ax_fld -= 564948210;
			int var32 = au_fld[-798315446 * gz.ax_fld];
			int var52 = au_fld[gz.ax_fld + 1];
			lu var69 = var2 ? gs.ap_fld : ab_fld;
			if (var69 == null) {
				throw new RuntimeException("");
			} else {
				lu var82 = cf.cg_fld.ak(var69.cv_fld);
				if (var69.bx_fld * -834795989 != 0) {
					throw new RuntimeException("");
				} else if (var82.bx_fld * -328993849 != 0) {
					throw new RuntimeException();
				} else {
					mg.aw(var82, var52, true, var1, (short)-10657);
					lr.ay(var69, var52, 1828744557);
					lu var94 = new lu();
					var94.bx_fld = 396145366 * var32;
					var94.cv_fld = (var94.bf_fld = var82.bf_fld * 1) * 1050017623;
					var94.cy_fld = var69.by_fld * 1498331503;
					var94.by_fld = var52 * -2061553657;
					var94.bj_fld = true;
					if (var32 == 12) {
						hg.cm(var94);
					}

					var82.ge_fld[var52] = var94;
					if (var2) {
						gs.ap_fld = var94;
					} else {
						ab_fld = var94;
					}

					return 1;
				}
			}
		} else if (var0 == 638064672) {
			gz.ax_fld -= 2;
			int var31 = au_fld[gz.ax_fld * 738168369];
			int var51 = au_fld[1 + gz.ax_fld];
			lu var68 = var2 ? gs.ap_fld : ab_fld;
			if (null == var68) {
				throw new RuntimeException("");
			} else {
				lu var81 = cf.cg_fld.ag(1479536427 * var68.cv_fld, var68.cy_fld, -1459093320);
				lu var93 = cf.cg_fld.ak(-1426536822 * var81.cv_fld);
				if (var81.bx_fld != 0) {
					throw new RuntimeException("");
				} else if (0 != var93.bx_fld) {
					throw new RuntimeException();
				} else {
					mg.aw(var93, var51, true, var1, (short)8143);
					lr.ay(var81, var51, 1828744557);
					lu var97 = new lu();
					var97.bx_fld = var31;
					var97.cv_fld = (var97.bf_fld = 1 * var93.bf_fld) * -1606835828;
					var97.cy_fld = var81.by_fld * -281153977;
					var97.by_fld = var51;
					var97.bj_fld = true;
					if (var31 == 12) {
						hg.cm(var97);
					}

					var93.ge_fld[var51] = var97;
					if (var2) {
						gs.ap_fld = var97;
					} else {
						ab_fld = var97;
					}

					return 1;
				}
			}
		} else if (-578287845 == var0) {
			gz.ax_fld -= 1974913388;
			int var30 = au_fld[653880424 * gz.ax_fld];
			int var50 = au_fld[1 + gz.ax_fld];
			lu var67 = var50 != -1 ? cf.cg_fld.ag(var30, var50, 2063150398) : null;
			ag.af(var67, var2);
			return 1;
		} else if (var0 == -721715392) {
			ag.af(cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]), var2);
			return 1;
		} else if (var0 == -366420600) {
			lu var29 = var2 ? gs.ap_fld : ab_fld;
			lu var49 = var29 != null ? cf.cg_fld.ag(1187999824 * var29.cv_fld, var29.cy_fld, -1678916153) : null;
			ag.af(var49, var2);
			return 1;
		} else if (var0 == 1517533876) {
			lu var28 = var2 ? gs.ap_fld : ab_fld;
			lu var48 = null != var28 ? cf.cg_fld.ak(var28.cv_fld) : null;
			ag.af(var48, var2);
			return 1;
		} else if (206 == var0) {
			lu var27 = var2 ? gs.ap_fld : ab_fld;
			if (var27 == null) {
				au_fld[(gz.ax_fld += 36200849) * -178365097 - 1] = 0;
				return 1;
			} else if (var27.by_fld == -1) {
				au_fld[(gz.ax_fld += 628662547) * 1698401265 - 1] = 0;
				return 1;
			} else {
				lu var47 = cf.cg_fld.ak(var27.cv_fld);
				lu var66 = null;

				for (int var80 = var27.by_fld + 1; var80 < var47.ge_fld.length; var80++) {
					lu var92 = var47.ge_fld[var80];
					if (null != var92 && var92.cy_fld == var27.cy_fld) {
						var66 = var92;
						break;
					}
				}

				ag.af(var66, var2);
				return 1;
			}
		} else if (207 == var0) {
			lu var26 = var2 ? gs.ap_fld : ab_fld;
			if (var26 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (-1 == var26.by_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var46 = cf.cg_fld.ak(var26.cv_fld * -1007644850);
				lu var65 = null;

				for (int var79 = var26.by_fld - 1; var79 >= 0; var79--) {
					lu var91 = var46.ge_fld[var79];
					if (var91 != null && var26.cy_fld == var91.cy_fld) {
						var65 = var91;
						break;
					}
				}

				ag.af(var65, var2);
				return 1;
			}
		} else if (208 == var0) {
			lu var25 = var2 ? gs.ap_fld : ab_fld;
			if (null == var25) {
				au_fld[(gz.ax_fld += -1046712663) * 1107213453 - 1] = 0;
				return 1;
			} else if (0 != var25.bx_fld) {
				au_fld[(gz.ax_fld += -280024309) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var45 = cf.cg_fld.ak(var25.cv_fld);
				if (var45.ge_fld == null) {
					au_fld[(gz.ax_fld += 1761948579) * -290758054 - 1] = 0;
					return 1;
				} else {
					int var64 = 0;

					for (int var78 = 0; var78 < var45.ge_fld.length; var78++) {
						lu var90 = var45.ge_fld[var78];
						if (var90 != null && var25.by_fld == var90.cy_fld) {
							var64++;
						}
					}

					au_fld[(gz.ax_fld += -1781100914) * -39877532 - 1] = var64;
					return 1;
				}
			}
		} else if (var0 == 209) {
			lu var24 = var2 ? gs.ap_fld : ab_fld;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var24 != null ? var24.cy_fld * -1048715982 : -1;
			return 1;
		} else if (var0 == 210) {
			int var23 = au_fld[(gz.ax_fld -= 17924259) * 2008169065];
			int var44 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var63 = he.cg(var23);
			int var77 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var89 = he.cg(var44);
			int var8 = au_fld[(gz.ax_fld -= 213139597) * 1699766306];
			px var9 = kb.ag_px(var8, -1323720835);
			Object var10 = var9.as();
			Object var11 = null;
			if (var77 >= 0) {
				px var12 = kb.ag_px(var77, -1928121873);
				var11 = var12.as();
			}

			lu var101 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -1726329510]);
			lu var13 = null;
			if (null != var101 && null != var101.ge_fld) {
				for (int var14 = 0; var14 < var101.ge_fld.length; var14++) {
					lu var15 = var101.ge_fld[var14];
					if (var15 != null && (var8 < 0 || var15.ao(var8, var10, -1928256127).equals(var89)) && (var77 < 0 || var15.ao(var77, var11, -2120236788).equals(var63))) {
						var13 = var15;
						break;
					}
				}
			}

			ag.af(var13, var2);
			return 1;
		} else if (var0 == -152086253) {
			gz.ax_fld -= 3;
			int var22 = au_fld[gz.ax_fld];
			lu var43 = cf.cg_fld.ak(au_fld[gz.ax_fld + 1]);
			int var62 = au_fld[2 + gz.ax_fld];
			at_fld.ak(var22, var43, var62, 1953938037);
			au_fld[(gz.ax_fld += 1732421358) * -776631127 - 1] = at_fld.av();
			return 1;
		} else if (781846886 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			lu var42 = var2 ? gs.ap_fld : ab_fld;
			if (-1 == var42.by_fld) {
				at_fld.ak(var21, var42, -1, 2102854080);
			} else {
				at_fld.ak(var21, cf.cg_fld.ak(var42.cv_fld), -1920454430 * var42.by_fld, 1634348651);
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.av();
			return 1;
		} else if (213 == var0) {
			ag.af(at_fld.ae(), var2);
			return 1;
		} else if (var0 == 214) {
			au_fld[(gz.ax_fld += -1684678759) * -1640978897 - 1] = at_fld.ah();
			return 1;
		} else if (215 == var0) {
			ai_fld[(ef.aq_fld += 366491375) * -940345523 - 1] = ag.al(at_fld.aw());
			return 1;
		} else if (var0 == 216) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var41 = he.cg(var20);
			int var61 = au_fld[(gz.ax_fld -= -1684678759) * -642668386];
			px var76 = kb.ag_px(var61, -710612293);
			Object var88 = var76.as();
			at_fld.ay(var61, var41, var88, -1974771109);
			au_fld[(gz.ax_fld += -1684678759) * 1379391040 - 1] = at_fld.av();
			return 1;
		} else if (301719639 == var0) {
			int var19 = au_fld[(gz.ax_fld -= 1953067560) * -989525665];
			lu var40 = var2 ? gs.ap_fld : ab_fld;
			if (var40 == null) {
				throw new RuntimeException("");
			} else if (var40.bx_fld * -936826960 != 0) {
				throw new RuntimeException("");
			} else {
				lu var60 = cf.cg_fld.ak(110274687 * var40.cv_fld);
				if (-1310354723 * var60.bx_fld != 0) {
					throw new RuntimeException();
				} else {
					lu var75 = cx.ar(var19, var60, var40);
					ag.af(var75, var2);
					return 1;
				}
			}
		} else if (218 == var0) {
			lu var18 = var2 ? gs.ap_fld : ab_fld;
			if (var18 == null) {
				au_fld[(gz.ax_fld += 176941510) * -1921365929 - 1] = 0;
				return 1;
			} else {
				lu var39 = cf.cg_fld.ak(var18.cv_fld * 643355697);
				if (var39 != null && null != var39.ge_fld) {
					lu var59 = null;

					for (int var74 = 0; var74 < var39.ge_fld.length; var74++) {
						lu var87 = var39.ge_fld[var74];
						if (null != var87 && var18.cy_fld == var87.cy_fld) {
							var59 = var87;
							break;
						}
					}

					ag.af(var59, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -2109347841) * -379555169 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 219) {
			lu var17 = var2 ? gs.ap_fld : ab_fld;
			if (null == var17) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var38 = cf.cg_fld.ak(-705286432 * var17.cv_fld);
				if (null != var38 && null != var38.ge_fld) {
					lu var58 = null;

					for (int var73 = var38.ge_fld.length - 1; var73 >= 0; var73--) {
						lu var86 = var38.ge_fld[var73];
						if (null != var86 && var86.cy_fld == var17.cy_fld) {
							var58 = var86;
							break;
						}
					}

					ag.af(var58, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += 1838131754) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 983511622) {
			lu var16 = var2 ? gs.ap_fld : ab_fld;
			if (null == var16) {
				au_fld[(gz.ax_fld += -1684678759) * -1884398755 - 1] = 0;
				return 1;
			} else if (-669684091 * var16.bx_fld != 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var37 = cf.cg_fld.ak(-352932304 * var16.cv_fld);
				if (var37 != null && var37.ge_fld != null) {
					lu var57 = null;

					for (int var72 = 0; var72 < var37.ge_fld.length; var72++) {
						lu var85 = var37.ge_fld[var72];
						if (null != var85 && var85.cy_fld == var16.by_fld) {
							var57 = var85;
							break;
						}
					}

					ag.af(var57, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 221) {
			lu var3 = var2 ? gs.ap_fld : ab_fld;
			if (null == var3) {
				au_fld[(gz.ax_fld += -1684678759) * 1505541686 - 1] = 0;
				return 1;
			} else if (0 != var3.bx_fld) {
				au_fld[(gz.ax_fld += -233263027) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var4 = cf.cg_fld.ak(var3.cv_fld);
				if (var4 != null && null != var4.ge_fld) {
					lu var5 = null;

					for (int var6 = var4.ge_fld.length - 1; var6 >= 0; var6--) {
						lu var7 = var4.ge_fld[var6];
						if (var7 != null && var7.cy_fld == var3.by_fld) {
							var5 = var7;
							break;
						}
					}

					ag.af(var5, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -1302424541 - 1] = 0;
					return 1;
				}
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(ILlu;Llu;)Llu;"
	)
	static lu ds(int var0, lu var1, lu var2) {
		int var3 = 0;
		lu var4 = null;

		for (int var5 = var2.by_fld + 1; var5 < var1.ge_fld.length; var5++) {
			lu var6 = var1.ge_fld[var5];
			if (null != var6 && var6.cy_fld == var2.by_fld) {
				if (++var3 - 1 == var0) {
					var4 = var6;
					break;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fc(int var0, ba var1) throws EOFException {
		if (var0 == 2700) {
			lu var13 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var13.ga_fld;
			return 1;
		} else if (2701 == var0) {
			lu var12 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			if (var12.ga_fld != -1) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12.gd_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2702) {
			int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			pk var15 = (pk)cf.cg_fld.ai_fld.ak(var11);
			if (null != var15) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2703) {
			gz.ax_fld -= 3;
			int var10 = au_fld[gz.ax_fld];
			lu var14 = cf.cg_fld.ag(au_fld[1 + gz.ax_fld], au_fld[2 + gz.ax_fld], -83246590);
			px var16 = kb.ag_px(var10, -1861388306);
			if (var16.aw()) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14.ao(var10, var16.as_fld, -1936207525);
			} else if (px.ll(var16, (short)10000)) {
				an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var14.ap(var10, var16.ay_fld);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.jj(var14, var10, var16.aw_fld);
			}

			return 1;
		} else if (var0 == 2704) {
			gz.ax_fld -= 3;
			lu var9 = cf.cg_fld.ag(au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], -362344118);
			int var4 = au_fld[2 + gz.ax_fld];
			Object var5 = he.cg(var4);
			int var6 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var9.at(var6, var5, 583965381);
			return 1;
		} else if (2706 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cf.cg_fld.aa_fld;
			return 1;
		} else if (var0 == 2707) {
			lu var8 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.qz(var8, 1048277106) ? 1 : 0;
			return 1;
		} else if (2708 == var0) {
			lu var7 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			return ap(var7);
		} else if (2709 == var0) {
			lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			return ag.at(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(ILlu;Llu;)Llu;"
	)
	static lu db(int var0, lu var1, lu var2) {
		int var3 = 0;
		lu var4 = null;

		for (int var5 = var2.by_fld + 1; var5 < var1.ge_fld.length; var5++) {
			lu var6 = var1.ge_fld[var5];
			if (null != var6 && var6.cy_fld == var2.by_fld) {
				if (++var3 - 1 == var0) {
					var4 = var6;
					break;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(Llu;Z)V"
	)
	static void dg(lu var0, boolean var1) {
		if (null != var0) {
			au_fld[(gz.ax_fld += -1684678759) * 164789174 - 1] = 1;
			if (var1) {
				gs.ap_fld = var0;
			} else {
				ab_fld = var0;
			}
		} else {
			au_fld[(gz.ax_fld += 2085892806) * -1623415871 - 1] = 0;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ik(int var0, ba var1) {
		if (var0 == 13337) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ao_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Llu;Z)V"
	)
	static void dy(lu var0, boolean var1) {
		if (null != var0) {
			au_fld[(gz.ax_fld += 1563847789) * -776631127 - 1] = 1;
			if (var1) {
				gs.ap_fld = var0;
			} else {
				ab_fld = var0;
			}
		} else {
			au_fld[(gz.ax_fld += -1684678759) * 1058136884 - 1] = 0;
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gj(int var0, ba var1) {
		if (3600 == var0) {
			if (la.fq_fld.aw_fld == 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2;
			} else if (1 == la.fq_fld.aw_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.ae_fld.bl(-1440239599);
			}

			return 1;
		} else if (3601 == var0) {
			int var48 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -1557048686) && var48 >= 0 && var48 < la.fq_fld.ae_fld.bl(-1440239599)) {
				rp var51 = (rp)rc.sc(la.fq_fld.ae_fld, var48);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.hv(var51, (byte)1);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var51.at((byte)1);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3602) {
			int var47 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -1357124755) && var47 >= 0 && var47 < la.fq_fld.ae_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(la.fq_fld.ae_fld, var47)).ae_fld * 1107825689;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3603 == var0) {
			int var46 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -1338835525) && var46 >= 0 && var46 < la.fq_fld.ae_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(la.fq_fld.ae_fld, var46)).aw_fld * 964405635;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3604 == var0) {
			String var45 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var50 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ky.ah(var45, var50);
			return 1;
		} else if (var0 == 3605) {
			String var44 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aa(var44);
			return 1;
		} else if (var0 == 3606) {
			String var43 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aq(var43);
			return 1;
		} else if (3607 == var0) {
			String var42 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			bo.if_(la.fq_fld, var42, 122484889);
			return 1;
		} else if (3608 == var0) {
			String var41 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			boolean var49 = true;
			la.fq_fld.am(var41, var49, -1524373658);
			return 1;
		} else if (3609 == var0) {
			String var39 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			var39 = cr.hs(var39);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.al(new aax(var39, fr.gv_fld), false) ? 1 : 0;
			return 1;
		} else if (var0 == 3611) {
			if (jr.fa_fld != null) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.ae_fld;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3612) {
			if (jr.fa_fld != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jr.fa_fld.bl(-1440239599);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3613) {
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null != jr.fa_fld && var38 < jr.fa_fld.bl(-1440239599)) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rc.sc(jr.fa_fld, var38).ap(-1939318074).ak(-726713601);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3614 == var0) {
			int var37 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var37 < jr.fa_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(jr.fa_fld, var37)).by(-766796840);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3615) {
			int var36 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var36 < jr.fa_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(jr.fa_fld, var36)).aw_fld * 964405635;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3616) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jr.fa_fld != null ? jr.fa_fld.ah_fld : 0;
			return 1;
		} else if (3617 == var0) {
			String var35 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			hn.ge(var35);
			return 1;
		} else if (var0 == 3618) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != jr.fa_fld ? jr.fa_fld.aw_fld : 0;
			return 1;
		} else if (var0 == 3619) {
			String var34 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			jk.gw(var34);
			return 1;
		} else if (var0 == 3620) {
			bl.gx();
			return 1;
		} else if (3621 == var0) {
			if (!bo.vc(la.fq_fld, -1837564096)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.ah_fld.bl(-1440239599);
			}

			return 1;
		} else if (var0 == 3622) {
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -2007703174) && var33 >= 0 && var33 < la.fq_fld.ah_fld.bl(-1440239599)) {
				rt var4 = (rt)rc.sc(la.fq_fld.ah_fld, var33);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.hv(var4, (byte)1);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.at((byte)1);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3623) {
			String var31 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			var31 = cr.hs(var31);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.au(new aax(var31, fr.gv_fld)) ? 1 : 0;
			return 1;
		} else if (3624 == var0) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var30 < jr.fa_fld.bl(-1440239599) && rc.sc(jr.fa_fld, var30).ap(-1939318074).equals(og.ci_fld.jn((byte)-1))) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3625 == var0) {
			if (null != jr.fa_fld && null != jr.fa_fld.av_fld) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.av_fld;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3626 == var0) {
			int var29 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var29 < jr.fa_fld.bl(-1440239599) && ((rh)rc.sc(jr.fa_fld, var29)).ag((short)25664)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3627 != var0) {
			if (var0 == 3628) {
				la.fq_fld.ae_fld.cv(-1730556564);
				return 1;
			} else if (var0 == 3629) {
				boolean var28 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new xt(var28), 914411144);
				return 1;
			} else if (3630 == var0) {
				boolean var27 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new xq(var27), 190591136);
				return 1;
			} else if (var0 == 3631) {
				boolean var26 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ew(var26), -864911781);
				return 1;
			} else if (var0 == 3632) {
				boolean var25 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new es(var25), 544258352);
				return 1;
			} else if (var0 == 3633) {
				boolean var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new et(var24), 531625763);
				return 1;
			} else if (var0 == 3634) {
				boolean var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new eb(var23), -723968804);
				return 1;
			} else if (3635 == var0) {
				boolean var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ep(var22), 973164636);
				return 1;
			} else if (var0 == 3636) {
				boolean var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ed(var21), 1107290208);
				return 1;
			} else if (var0 == 3637) {
				boolean var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ex(var20), 2008517012);
				return 1;
			} else if (var0 == 3638) {
				boolean var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new eo(var19), -580429879);
				return 1;
			} else if (var0 == 3639) {
				la.fq_fld.ae_fld.ba((byte)0);
				return 1;
			} else if (3640 == var0) {
				la.fq_fld.ah_fld.cv(-1678034416);
				return 1;
			} else if (var0 == 3641) {
				boolean var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ah_fld.cy(new xt(var18), 1804852785);
				return 1;
			} else if (var0 == 3642) {
				boolean var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ah_fld.cy(new xq(var17), -1445931313);
				return 1;
			} else if (var0 == 3643) {
				la.fq_fld.ah_fld.ba((byte)0);
				return 1;
			} else if (3644 == var0) {
				if (jr.fa_fld != null) {
					jr.fa_fld.cv(-2130846999);
				}

				return 1;
			} else if (3645 == var0) {
				boolean var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new xt(var16), -251754938);
				}

				return 1;
			} else if (var0 == 3646) {
				boolean var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new xq(var15), 1631204887);
				}

				return 1;
			} else if (var0 == 3647) {
				boolean var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ew(var14), -2030652311);
				}

				return 1;
			} else if (var0 == 3648) {
				boolean var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new es(var13), -1892227692);
				}

				return 1;
			} else if (var0 == 3649) {
				boolean var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new et(var12), -1192058763);
				}

				return 1;
			} else if (var0 == 3650) {
				boolean var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new eb(var11), -1556053052);
				}

				return 1;
			} else if (3651 == var0) {
				boolean var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ep(var10), -981242007);
				}

				return 1;
			} else if (var0 == 3652) {
				boolean var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new ed(var9), -553709036);
				}

				return 1;
			} else if (3653 == var0) {
				boolean var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ex(var8), 167626795);
				}

				return 1;
			} else if (3654 == var0) {
				boolean var7 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new eo(var7), 574496287);
				}

				return 1;
			} else if (var0 == 3655) {
				if (null != jr.fa_fld) {
					jr.fa_fld.ba((byte)0);
				}

				return 1;
			} else if (var0 == 3656) {
				boolean var6 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ec(var6), -73079454);
				return 1;
			} else if (3657 == var0) {
				boolean var5 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ec(var5), -1169608696);
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null != jr.fa_fld && var3 < jr.fa_fld.bl(-1440239599) && ((rh)rc.sc(jr.fa_fld, var3)).ah((byte)59)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		}
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(Llu;Z)V"
	)
	static void dn(lu var0, boolean var1) {
		if (null != var0) {
			au_fld[(gz.ax_fld += 465924153) * -776631127 - 1] = 1;
			if (var1) {
				gs.ap_fld = var0;
			} else {
				ab_fld = var0;
			}
		} else {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ee(int var0, ba var1, boolean var2) throws EOFException {
		lu var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= 567006050) * 453678275]);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		String var4 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 1840035913) {
			int var6 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var6 > 0) {
				var5 = new int[var6];

				while (var6-- > 0) {
					var5[var6] = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = (Object[])(new Object[var4.length() + 1]);

		for (int var7 = var9.length - 1; var7 >= 1; var7--) {
			switch (var4.charAt(var7 - 1)) {
				case 'W':
				case 'X':
				case 's':
					var9[var7] = ai_fld[(ef.aq_fld -= -211521517) * -836183525];
					break;
				case 'Ï':
					var9[var7] = new Long(an_fld[(db.aa_fld -= -2095250487) * -1209616260]);
					break;
				default:
					var9[var7] = new Integer(au_fld[(gz.ax_fld -= -1684678759) * 1892333243]);
			}
		}

		int var10 = au_fld[(gz.ax_fld -= -1861575795) * -1605704901];
		if (var10 != -1) {
			var9[0] = new Integer(var10);
		} else {
			var9 = null;
		}

		if (var0 == 1400) {
			var3.ej_fld = (Object[])var9;
		} else if (var0 == 1401) {
			var3.fo_fld = (Object[])var9;
		} else if (-1901322687 == var0) {
			var3.fa_fld = (Object[])var9;
		} else if (1403 == var0) {
			var3.fp_fld = (Object[])var9;
		} else if (2025478582 == var0) {
			var3.fv_fld = (Object[])var9;
		} else if (-756999785 == var0) {
			var3.fj_fld = (Object[])var9;
		} else if (1406 == var0) {
			var3.fc_fld = (Object[])var9;
		} else if (1984623567 == var0) {
			var3.fh_fld = (Object[])var9;
			var3.fm_fld = var5;
		} else if (1408 == var0) {
			var3.fn_fld = (Object[])var9;
		} else if (var0 == -1753452982) {
			var3.ft_fld = (Object[])var9;
		} else if (1410 == var0) {
			var3.fb_fld = (Object[])var9;
		} else if (1411 == var0) {
			var3.fy_fld = (Object[])var9;
		} else if (1412 == var0) {
			var3.fx_fld = (Object[])var9;
		} else if (var0 == 1414) {
			var3.fe_fld = (Object[])var9;
			var3.fw_fld = var5;
		} else if (1415 == var0) {
			var3.fl_fld = (Object[])var9;
			var3.fg_fld = var5;
		} else if (1416 == var0) {
			var3.fk_fld = (Object[])var9;
		} else if (1417 == var0) {
			var3.fq_fld = (Object[])var9;
		} else if (var0 == -1378124192) {
			var3.fs_fld = (Object[])var9;
		} else if (var0 == 1419) {
			var3.fu_fld = (Object[])var9;
		} else if (var0 == 1420) {
			var3.fz_fld = (Object[])var9;
		} else if (1421 == var0) {
			var3.ff_fld = (Object[])var9;
		} else if (var0 == 1422) {
			var3.go_fld = (Object[])var9;
		} else if (var0 == -424093789) {
			var3.gn_fld = (Object[])var9;
		} else if (var0 == 2099382699) {
			var3.gh_fld = (Object[])var9;
		} else if (1425 == var0) {
			var3.gj_fld = (Object[])var9;
		} else if (1426 == var0) {
			var3.gt_fld = (Object[])var9;
		} else if (var0 == -1099642689) {
			var3.gr_fld = (Object[])var9;
		} else if (244715781 == var0) {
			var3.gg_fld = (Object[])var9;
		} else if (var0 == 1429) {
			var3.gc_fld = (Object[])var9;
		} else if (1430 == var0) {
			var3.fr_fld = (Object[])var9;
		} else if (1431 == var0) {
			var3.fi_fld = (Object[])var9;
		} else if (1434 == var0) {
			var3.gs_fld = (Object[])var9;
		} else if (var0 == 1435) {
			var3.fd_fld = (Object[])var9;
		} else {
			if (var0 < 1436 || var0 > -1860095417) {
				return 2;
			}

			ld var8 = var3.bn((byte)-86);
			if (null != var8) {
				if (var0 == 1436) {
					var8.ae_fld = (Object[])var9;
				} else if (1437 == var0) {
					var8.ah_fld = (Object[])var9;
				} else if (var0 == -249863043) {
					var8.aw_fld = (Object[])var9;
				} else if (var0 == 1439) {
					var8.av_fld = (Object[])var9;
				}
			}
		}

		var3.eh_fld = true;
		return 1;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int de(int var0, ba var1, boolean var2) throws EOFException {
		lu var3;
		if (var0 >= 1002202533) {
			var0 -= 1000;
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var3 = cf.cg_fld.ak(var4);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		if (var0 == -782237139) {
			gz.ax_fld -= 1310965625;
			var3.bn_fld = au_fld[gz.ax_fld];
			var3.bc_fld = au_fld[1 + gz.ax_fld] * 1221291423;
			var3.bt_fld = au_fld[2 + gz.ax_fld] * -429019160;
			var3.bv_fld = au_fld[3 + gz.ax_fld] * 744897332;
			kl.ah(var3, pf.qw_fld, 897648834 * bc.qx_fld, cf.cg_fld, client.cz_fld);
			if (var3.bx_fld == 0) {
				lu[] var7 = -1 == var3.by_fld ? cf.cg_fld.aw_fld[var3.bf_fld >> 16] : cf.cg_fld.ak(var3.cv_fld).ge_fld;
				tb.ag(var7, var3, false, cf.cg_fld, client.cz_fld, -108565105);
			}

			return 1;
		} else if (1375869146 == var0) {
			gz.ax_fld -= 358296466;
			var3.bw_fld = au_fld[1558312932 * gz.ax_fld] * -992901072;
			var3.ba_fld = -794239085 * au_fld[1 + gz.ax_fld];
			var3.bi_fld = 857759420 * au_fld[2 + gz.ax_fld];
			var3.bu_fld = 2048690254 * au_fld[3 + gz.ax_fld];
			kl.ah(var3, -539575368 * pf.qw_fld, bc.qx_fld * 2101815009, cf.cg_fld, client.cz_fld);
			if (var3.bx_fld == 0) {
				lu[] var6 = -1 == var3.by_fld ? cf.cg_fld.aw_fld[var3.bf_fld >> 16] : cf.cg_fld.ak(883746232 * var3.cv_fld).ge_fld;
				tb.ag(var6, var3, false, cf.cg_fld, client.cz_fld, 612707738);
			}

			return 1;
		} else if (var0 == 9994785) {
			boolean var5 = au_fld[(gz.ax_fld -= 226316393) * -776631127] == 1;
			if (var5 != var3.cf_fld) {
				var3.cf_fld = var5;
			}

			return 1;
		} else if (1005 == var0) {
			var3.hb_fld = au_fld[(gz.ax_fld -= 2039794100) * -776631127] == 1;
			return 1;
		} else if (var0 == 1873612716) {
			var3.hf_fld = au_fld[(gz.ax_fld -= -1684678759) * -1212710459] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lsl;"
	)
	static sl jb(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (sl)var0;
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int dj(int var0, ba var1, boolean var2) throws EOFException, UnsupportedEncodingException {
		lu var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var3 = cf.cg_fld.ak(var4);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		if (var0 == 1100) {
			gz.ax_fld -= 2;
			int var39 = au_fld[gz.ax_fld];
			int var45 = au_fld[1 + gz.ax_fld];
			if (var3.bx_fld == 12) {
				li var46 = lu.bv(var3, -1306192026);
				if (var46 != null && var46.al(var39, var45)) {
				}
			} else {
				var3.cp_fld = var39;
				if (var3.cp_fld > var3.cn_fld - var3.bb_fld) {
					var3.cp_fld = var3.cn_fld - var3.bb_fld;
				}

				if (var3.cp_fld < 0) {
					var3.cp_fld = 0;
				}

				var3.ce_fld = var45;
				if (var3.ce_fld > var3.cr_fld - var3.cd_fld) {
					var3.ce_fld = var3.cr_fld - var3.cd_fld;
				}

				if (var3.ce_fld < 0) {
					var3.ce_fld = 0;
				}
			}

			return 1;
		} else if (1101 == var0) {
			var3.ca_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1102) {
			var3.cz_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1103 == var0) {
			var3.cb_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1104) {
			var3.cu_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1105 == var0) {
			var3.cj_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1106 == var0) {
			var3.cl_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1107) {
			var3.dc_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1108 == var0) {
			var3.dm_fld = -1800825853;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1109) {
			gz.ax_fld -= 6;
			var3.da_fld = 1016596669 * au_fld[gz.ax_fld];
			var3.dk_fld = -139613485 * au_fld[gz.ax_fld + 1];
			var3.dx_fld = au_fld[gz.ax_fld + 2];
			var3.ds_fld = au_fld[3 + gz.ax_fld];
			var3.du_fld = au_fld[4 + gz.ax_fld];
			var3.db_fld = -964578897 * au_fld[gz.ax_fld + 5];
			return 1;
		} else if (1110 == var0) {
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var3.dl_fld != var38) {
				var3.dl_fld = var38;
				var3.gy_fld = 0;
				var3.gz_fld = 0;
			}

			return 1;
		} else if (var0 == 1111) {
			var3.di_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1112 == var0) {
			String var37 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			if (12 == var3.bx_fld) {
				li var44 = lu.bv(var3, -1019227113);
				if (var44 != null && var44.cq()) {
					li.sc(var44, var37, 761264292);
				} else {
					var3.dp_fld = var37;
				}
			} else if (!var37.equals(var3.dp_fld)) {
				var3.dp_fld = var37;
			}

			return 1;
		} else if (1113 == var0) {
			var3.de_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (12 == var3.bx_fld) {
				li var36 = lu.bv(var3, -1145455117);
				if (var36 != null) {
					var36.an();
				}
			}

			return 1;
		} else if (1114 == var0) {
			gz.ax_fld -= 3;
			if (var3.bx_fld == 12) {
				li var35 = lu.bv(var3, -939866837);
				if (null != var35) {
					var35.af(au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld]);
					var35.au(au_fld[2 + gz.ax_fld]);
				}
			} else {
				var3.ep_fld = au_fld[gz.ax_fld];
				var3.eb_fld = 2097134267 * au_fld[gz.ax_fld + 1];
				var3.es_fld = au_fld[gz.ax_fld + 2];
			}

			return 1;
		} else if (var0 == 1115) {
			var3.ed_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1116 == var0) {
			var3.dh_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1117 == var0) {
			var3.dv_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1118) {
			var3.dz_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1119 == var0) {
			var3.dt_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1120 == var0) {
			gz.ax_fld -= 2;
			var3.cn_fld = au_fld[gz.ax_fld];
			var3.cr_fld = -348242603 * au_fld[1 + gz.ax_fld];
			if (var3.bx_fld == 0) {
				lu[] var34 = var3.by_fld == -1 ? cf.cg_fld.aw_fld[var3.bf_fld >> 16] : cf.cg_fld.ak(var3.cv_fld).ge_fld;
				tb.ag(var34, var3, false, cf.cg_fld, client.cz_fld, 820347973);
			}

			return 1;
		} else if (var0 == 1121) {
			jg.fk(var3.bf_fld, var3.by_fld);
			cf.cg_fld.bs(var3);
			return 1;
		} else if (var0 == 1122) {
			var3.ch_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1123) {
			var3.cg_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1124 == var0) {
			var3.co_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1125 == var0) {
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ym var43 = (ym)ka.ak(wt.ak(), var33);
			if (null != var43) {
				var3.ck_fld = var43;
			}

			return 1;
		} else if (1126 == var0) {
			boolean var32 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			var3.ci_fld = var32;
			return 1;
		} else if (1127 == var0) {
			boolean var31 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			var3.dn_fld = var31;
			return 1;
		} else if (var0 == 1129) {
			var3.ct_fld = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			return 1;
		} else if (1130 == var0) {
			var3.ac((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], "", xh.jn_fld, hb.at());
			return 1;
		} else if (1131 == var0) {
			gz.ax_fld -= 2;
			var3.bz(au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], -2100807591);
			return 1;
		} else if (var0 == 1132) {
			var3.br((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], au_fld[(gz.ax_fld -= -1684678759) * -776631127], 392561076);
			return 1;
		} else if (var0 == 1133) {
			gz.ax_fld--;
			ln var30 = var3.bi(751788588);
			if (null != var30) {
				var30.ak_fld = au_fld[gz.ax_fld];
			}

			return 1;
		} else if (var0 == 1134) {
			gz.ax_fld--;
			ln var29 = var3.bi(2009255368);
			if (null != var29) {
				var29.ag_fld = 171528145 * au_fld[gz.ax_fld];
			}

			return 1;
		} else if (1135 == var0) {
			ef.aq_fld--;
			li var28 = lu.bv(var3, -879391446);
			if (null != var28) {
				var3.dj_fld = (String)ai_fld[ef.aq_fld];
			}

			return 1;
		} else if (1136 == var0) {
			gz.ax_fld--;
			ln var27 = var3.bi(1721323452);
			if (null != var27) {
				var27.az_fld = au_fld[gz.ax_fld];
			}

			return 1;
		} else if (var0 == 1137) {
			gz.ax_fld--;
			li var26 = lu.bv(var3, -1014323269);
			if (var26 != null && var26.ay(au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1138) {
			gz.ax_fld--;
			li var25 = lu.bv(var3, -612470505);
			if (var25 != null && var25.as(au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1139) {
			gz.ax_fld--;
			li var24 = lu.bv(var3, -1769959044);
			if (null != var24 && var24.ar(au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1140) {
			boolean var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			fu.xp(client.fy_fld, -1236981226);
			li var42 = lu.bv(var3, -1298392391);
			if (null != var42 && var42.ag(var23) && var23) {
				client.fy_fld.ag(var3, 114546440);
			}

			return 1;
		} else if (var0 == 1141) {
			boolean var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (!var22 && client.fy_fld.ak() == var3) {
				fu.xp(client.fy_fld, -144546535);
			}

			li var41 = lu.bv(var3, -855947476);
			if (null != var41) {
				var41.az(var22);
			}

			return 1;
		} else if (1142 == var0) {
			gz.ax_fld -= 2;
			li var21 = lu.bv(var3, -1176758895);
			if (null != var21 && li.ik(var21, au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld], (byte)-110)) {
			}

			return 1;
		} else if (var0 == 1143) {
			gz.ax_fld--;
			li var20 = lu.bv(var3, -1460667975);
			if (var20 != null && li.ik(var20, au_fld[gz.ax_fld], au_fld[gz.ax_fld], (byte)-45)) {
			}

			return 1;
		} else if (1144 == var0) {
			gz.ax_fld--;
			li var19 = lu.bv(var3, -2115288923);
			if (var19 != null) {
				var19.cr(au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1145) {
			gz.ax_fld--;
			li var18 = lu.bv(var3, -2026683194);
			if (null != var18) {
				var18.ce(au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1146) {
			gz.ax_fld--;
			li var17 = lu.bv(var3, -821100279);
			if (null != var17) {
				li.ct(var17, au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1147) {
			gz.ax_fld--;
			li var16 = lu.bv(var3, -1397170578);
			if (var16 != null) {
				li.jo(var16, au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1148) {
			gz.ax_fld -= 2;
			sc var15 = var3.bu(-980005510);
			if (var15 != null) {
				var15.ak(au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1]);
			}

			return 1;
		} else if (var0 == 1149) {
			gz.ax_fld -= 2;
			sc var14 = var3.bu(336955150);
			if (null != var14) {
				var14.ag((char)au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld]);
			}

			return 1;
		} else if (1150 == var0) {
			var3.bm((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], xh.jn_fld, (byte)-72);
			return 1;
		} else if (var0 == 1151) {
			ef.aq_fld -= 3;
			String var13 = (String)ai_fld[ef.aq_fld];
			String var40 = (String)ai_fld[1 + ef.aq_fld];
			String var6 = (String)ai_fld[ef.aq_fld + 2];
			long var7 = hb.at();
			long var9 = ha.ac();
			String var11 = lo.ae().az(lo.ae().bt_fld * -2048773107);
			if (var7 != -1L) {
				var13 = var13.replaceAll("%userid%", Long.toString(var7));
			}

			if (-1L != var9) {
				var13 = var13.replaceAll("%userhash%", Long.toString(var9));
			}

			if (!var11.isEmpty()) {
				var13 = var13.replaceAll("%deviceid%", var11);
			}

			var3.aj(var13, var40, var6, var11, Long.toString(var9), xh.jn_fld, 542922259);
			return 1;
		} else if (1152 == var0) {
			if (11 != var3.bx_fld) {
				throw new RuntimeException();
			} else {
				ma var12 = var3.bx_ma(1676851355);
				boolean var5 = null != var12 && var12.ah() && cf.ak().as(var12.ax());
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5 ? 1 : 0;
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int es(int var0, ba var1, boolean var2) throws EOFException, UnsupportedEncodingException {
		lu var3;
		if (var0 >= 2115246353) {
			var0 -= 1000;
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var3 = cf.cg_fld.ak(var4);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		if (var0 == 1100) {
			gz.ax_fld -= 1497732406;
			int var39 = au_fld[gz.ax_fld];
			int var45 = au_fld[1 + gz.ax_fld];
			if (var3.bx_fld == 12) {
				li var46 = lu.bv(var3, -1775320560);
				if (var46 != null && var46.al(var39, var45)) {
				}
			} else {
				var3.cp_fld = var39;
				if (var3.cp_fld > var3.cn_fld - var3.bb_fld) {
					var3.cp_fld = var3.cn_fld - var3.bb_fld;
				}

				if (1253353916 * var3.cp_fld < 0) {
					var3.cp_fld = 0;
				}

				var3.ce_fld = -710445226 * var45;
				if (var3.ce_fld > var3.cr_fld - var3.cd_fld) {
					var3.ce_fld = var3.cr_fld - var3.cd_fld;
				}

				if (var3.ce_fld * 1827648804 < 0) {
					var3.ce_fld = 0;
				}
			}

			return 1;
		} else if (1101 == var0) {
			var3.ca_fld = au_fld[(gz.ax_fld -= -802509686) * 341741556];
			return 1;
		} else if (var0 == 838420347) {
			var3.cz_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1306619312 == var0) {
			var3.cb_fld = au_fld[(gz.ax_fld -= -168021783) * 1916933269];
			return 1;
		} else if (var0 == 1104) {
			var3.cu_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (708042980 == var0) {
			var3.cj_fld = au_fld[(gz.ax_fld -= -1711601551) * -776631127] * -1112928248;
			return 1;
		} else if (-1057867511 == var0) {
			var3.cl_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] * 1637729073;
			return 1;
		} else if (var0 == 1107) {
			var3.dc_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1108 == var0) {
			var3.dm_fld = 181738441;
			var3.dq_fld = au_fld[(gz.ax_fld -= -2057612063) * -866686084];
			return 1;
		} else if (var0 == 1109) {
			gz.ax_fld -= 6;
			var3.da_fld = -642618553 * au_fld[gz.ax_fld];
			var3.dk_fld = -139613485 * au_fld[gz.ax_fld + 1];
			var3.dx_fld = au_fld[gz.ax_fld + 2];
			var3.ds_fld = au_fld[3 + gz.ax_fld] * -1741154650;
			var3.du_fld = au_fld[4 + gz.ax_fld] * -1672804636;
			var3.db_fld = -1472232230 * au_fld[gz.ax_fld + 5];
			return 1;
		} else if (1276403386 == var0) {
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var3.dl_fld != var38) {
				var3.dl_fld = var38;
				var3.gy_fld = 0;
				var3.gz_fld = 0;
			}

			return 1;
		} else if (var0 == 1111) {
			var3.di_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1112 == var0) {
			String var37 = (String)ai_fld[(ef.aq_fld -= -211521517) * -1111783078];
			if (12 == var3.bx_fld) {
				li var44 = lu.bv(var3, -1343153336);
				if (var44 != null && var44.cq()) {
					li.sc(var44, var37, 1739680055);
				} else {
					var3.dp_fld = var37;
				}
			} else if (!var37.equals(var3.dp_fld)) {
				var3.dp_fld = var37;
			}

			return 1;
		} else if (-760326280 == var0) {
			var3.de_fld = au_fld[(gz.ax_fld -= 1256335512) * 228290076] * 861290020;
			if (12 == var3.bx_fld) {
				li var36 = lu.bv(var3, -1878570712);
				if (var36 != null) {
					var36.an();
				}
			}

			return 1;
		} else if (-44658461 == var0) {
			gz.ax_fld -= 260716801;
			if (var3.bx_fld == 12) {
				li var35 = lu.bv(var3, -1398217820);
				if (null != var35) {
					var35.af(au_fld[gz.ax_fld * -2002858174], au_fld[1 + gz.ax_fld]);
					var35.au(au_fld[2 + gz.ax_fld]);
				}
			} else {
				var3.ep_fld = au_fld[-61552732 * gz.ax_fld] * -896907697;
				var3.eb_fld = 2097134267 * au_fld[gz.ax_fld + 1];
				var3.es_fld = au_fld[gz.ax_fld + 2] * 1244042438;
			}

			return 1;
		} else if (var0 == 1115) {
			var3.ed_fld = au_fld[(gz.ax_fld -= -1258949659) * -776631127] == 1;
			return 1;
		} else if (-874811062 == var0) {
			var3.dh_fld = au_fld[(gz.ax_fld -= 264077857) * -1266946937] * 1105074570;
			return 1;
		} else if (515705642 == var0) {
			var3.dv_fld = au_fld[(gz.ax_fld -= 2037506825) * -776631127] * -393600137;
			return 1;
		} else if (var0 == 141387076) {
			var3.dz_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1119 == var0) {
			var3.dt_fld = au_fld[(gz.ax_fld -= 1265132675) * 1449069479] == 1;
			return 1;
		} else if (1120 == var0) {
			gz.ax_fld -= 2;
			var3.cn_fld = au_fld[gz.ax_fld];
			var3.cr_fld = -1241756486 * au_fld[1 + gz.ax_fld];
			if (956631557 * var3.bx_fld == 0) {
				lu[] var34 = var3.by_fld == -1 ? cf.cg_fld.aw_fld[var3.bf_fld >> 16] : cf.cg_fld.ak(var3.cv_fld).ge_fld;
				tb.ag(var34, var3, false, cf.cg_fld, client.cz_fld, -837119703);
			}

			return 1;
		} else if (var0 == 2065775747) {
			jg.fk(var3.bf_fld, 1741792186 * var3.by_fld);
			cf.cg_fld.bs(var3);
			return 1;
		} else if (var0 == -2034043128) {
			var3.ch_fld = au_fld[(gz.ax_fld -= 2123239604) * -776631127];
			return 1;
		} else if (var0 == -1030204161) {
			var3.cg_fld = au_fld[(gz.ax_fld -= -790155226) * 169071191] * -199250068;
			return 1;
		} else if (-1278792141 == var0) {
			var3.co_fld = au_fld[(gz.ax_fld -= 2132696389) * -776631127];
			return 1;
		} else if (-1130092196 == var0) {
			int var33 = au_fld[(gz.ax_fld -= 1303191488) * -2045257485];
			ym var43 = (ym)ka.ak(wt.ak(), var33);
			if (null != var43) {
				var3.ck_fld = var43;
			}

			return 1;
		} else if (-843648097 == var0) {
			boolean var32 = au_fld[(gz.ax_fld -= 1712604185) * 777051515] == 1;
			var3.ci_fld = var32;
			return 1;
		} else if (1127 == var0) {
			boolean var31 = au_fld[(gz.ax_fld -= -1684678759) * -1400632207] == 1;
			var3.dn_fld = var31;
			return 1;
		} else if (var0 == 1129) {
			var3.ct_fld = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			return 1;
		} else if (1130 == var0) {
			var3.ac((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], "", xh.jn_fld, hb.at());
			return 1;
		} else if (877371443 == var0) {
			gz.ax_fld -= 2;
			var3.bz(au_fld[-1526197949 * gz.ax_fld], au_fld[gz.ax_fld + 1], -2021681966);
			return 1;
		} else if (var0 == 1132) {
			var3.br((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], au_fld[(gz.ax_fld -= 1341160371) * -1113152687], 137143067);
			return 1;
		} else if (var0 == 845317477) {
			gz.ax_fld--;
			ln var30 = var3.bi(-313837068);
			if (null != var30) {
				var30.ak_fld = au_fld[gz.ax_fld];
			}

			return 1;
		} else if (var0 == 819764291) {
			gz.ax_fld -= -1410233062;
			ln var29 = var3.bi(-28818000);
			if (null != var29) {
				var29.ag_fld = 171528145 * au_fld[gz.ax_fld];
			}

			return 1;
		} else if (1135 == var0) {
			ef.aq_fld -= 1837152698;
			li var28 = lu.bv(var3, -1938163075);
			if (null != var28) {
				var3.dj_fld = (String)ai_fld[1875411094 * ef.aq_fld];
			}

			return 1;
		} else if (1847436947 == var0) {
			gz.ax_fld -= 50686462;
			ln var27 = var3.bi(-40034618);
			if (null != var27) {
				var27.az_fld = au_fld[1752878386 * gz.ax_fld];
			}

			return 1;
		} else if (var0 == 2002081328) {
			gz.ax_fld -= -415852665;
			li var26 = lu.bv(var3, -1017507418);
			if (var26 != null && var26.ay(au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1138) {
			gz.ax_fld -= 1989017808;
			li var25 = lu.bv(var3, -2128110834);
			if (var25 != null && var25.as(au_fld[gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 1139) {
			gz.ax_fld--;
			li var24 = lu.bv(var3, -1461654263);
			if (null != var24 && var24.ar(au_fld[-1210160030 * gz.ax_fld])) {
			}

			return 1;
		} else if (var0 == 2009904496) {
			boolean var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			fu.xp(client.fy_fld, -739152078);
			li var42 = lu.bv(var3, -1412593454);
			if (null != var42 && var42.ag(var23) && var23) {
				client.fy_fld.ag(var3, 114546440);
			}

			return 1;
		} else if (var0 == 1141) {
			boolean var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (!var22 && client.fy_fld.ak() == var3) {
				fu.xp(client.fy_fld, -1054120612);
			}

			li var41 = lu.bv(var3, -865716206);
			if (null != var41) {
				var41.az(var22);
			}

			return 1;
		} else if (1142 == var0) {
			gz.ax_fld -= -431850774;
			li var21 = lu.bv(var3, -595289890);
			if (null != var21 && li.ik(var21, au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld], (byte)-60)) {
			}

			return 1;
		} else if (var0 == 1152167517) {
			gz.ax_fld -= 1808140664;
			li var20 = lu.bv(var3, -1625930965);
			if (var20 != null && li.ik(var20, au_fld[gz.ax_fld], au_fld[gz.ax_fld * 295810750], (byte)-37)) {
			}

			return 1;
		} else if (1144 == var0) {
			gz.ax_fld -= 1183087775;
			li var19 = lu.bv(var3, -1069120543);
			if (var19 != null) {
				var19.cr(au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == -448902593) {
			gz.ax_fld--;
			li var18 = lu.bv(var3, -720436972);
			if (null != var18) {
				var18.ce(au_fld[309417387 * gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1146) {
			gz.ax_fld--;
			li var17 = lu.bv(var3, -1784465692);
			if (null != var17) {
				li.ct(var17, au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == -1005674681) {
			gz.ax_fld--;
			li var16 = lu.bv(var3, -1448530687);
			if (var16 != null) {
				li.jo(var16, au_fld[gz.ax_fld]);
			}

			return 1;
		} else if (var0 == 1148) {
			gz.ax_fld -= 2;
			sc var15 = var3.bu(1181697306);
			if (var15 != null) {
				var15.ak(au_fld[-1443900434 * gz.ax_fld], au_fld[gz.ax_fld + 1]);
			}

			return 1;
		} else if (var0 == 511819594) {
			gz.ax_fld -= 2;
			sc var14 = var3.bu(1332230);
			if (null != var14) {
				var14.ag((char)au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld]);
			}

			return 1;
		} else if (1949487697 == var0) {
			var3.bm((String)ai_fld[(ef.aq_fld -= 883275982) * -1055349728], xh.jn_fld, (byte)-8);
			return 1;
		} else if (var0 == -8886266) {
			ef.aq_fld -= 3;
			String var13 = (String)ai_fld[ef.aq_fld];
			String var40 = (String)ai_fld[1 + ef.aq_fld];
			String var6 = (String)ai_fld[ef.aq_fld + 2];
			long var7 = hb.at();
			long var9 = ha.ac();
			String var11 = lo.ae().az(lo.ae().bt_fld * -1917191188);
			if (var7 != -1L) {
				var13 = var13.replaceAll("%userid%", Long.toString(var7));
			}

			if (-1L != var9) {
				var13 = var13.replaceAll("%userhash%", Long.toString(var9));
			}

			if (!var11.isEmpty()) {
				var13 = var13.replaceAll("%deviceid%", var11);
			}

			var3.aj(var13, var40, var6, var11, Long.toString(var9), xh.jn_fld, -1717021533);
			return 1;
		} else if (1246133890 == var0) {
			if (11 != var3.bx_fld) {
				throw new RuntimeException();
			} else {
				ma var12 = var3.bx_ma(1886086092);
				boolean var5 = null != var12 && var12.ah() && cf.ak().as(var12.ax());
				au_fld[(gz.ax_fld += 773046804) * -776631127 - 1] = var5 ? 1 : 0;
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	static final void eg(lu var0, int var1) {
		if (null == var0.er_fld) {
			throw new RuntimeException();
		} else {
			if (var0.hp_fld == null) {
				var0.hp_fld = new int[var0.er_fld.length];
			}

			var0.hp_fld[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int eb(int var0, ba var1, boolean var2) throws EOFException {
		lu var3;
		if (var0 >= -1647075928) {
			var0 -= 1000;
			var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		if (1271209856 == var0 || var0 == -39084134 || var0 == 1212) {
			gz.ax_fld -= 2;
			int var11 = au_fld[gz.ax_fld];
			int var14 = au_fld[1 + gz.ax_fld];
			var3.ga_fld = 201778177 * var11;
			var3.gd_fld = var14;
			og var16 = kb.ag(var11, -1752383175);
			var3.dx_fld = var16.di_fld * 1195532183;
			var3.ds_fld = var16.dn_fld * 115949585;
			var3.du_fld = -376214075 * var16.df_fld;
			var3.da_fld = var16.de_fld * -597889265;
			var3.dk_fld = var16.dp_fld * 1286466808;
			var3.db_fld = -780652221 * var16.dy_fld;
			if (var0 == 1205) {
				var3.df_fld = 0;
			} else if (var0 == 1212 | var16.dj_fld == 1) {
				var3.df_fld = 108305121;
			} else {
				var3.df_fld = 216610242;
			}

			if (var3.dg_fld * -332738031 > 0) {
				var3.db_fld = 1311311102 * (var3.db_fld / var3.dg_fld);
			} else if (var3.bw_fld > 0) {
				var3.db_fld = var3.db_fld / var3.bw_fld;
			}

			return 1;
		} else if (var0 == 1201) {
			var3.dm_fld = 1371652158;
			var3.dq_fld = au_fld[(gz.ax_fld -= 422726850) * -776631127] * -833234627;
			return 1;
		} else if (-372369569 == var0) {
			var3.dm_fld = -1964172130;
			cv var10 = ot.ef();
			var3.dq_fld = (var10 != null ? var10.av_fld.al(392600394) : -1) * 4361350;
			return 1;
		} else if (1207 == var0) {
			boolean var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			cv var13 = ot.ef();
			lp var15 = var13 != null ? var13.av_fld : null;
			lu.wo(var3, var15, var9, 1906259066);
			return 1;
		} else if (1208 == var0) {
			int var8 = au_fld[(gz.ax_fld -= -1072358096) * -776631127];
			if (null == var3.dy_fld) {
				throw new RuntimeException("");
			} else {
				var3.dy_fld.ai(var8, (byte)0);
				return 1;
			}
		} else if (1209 == var0) {
			gz.ax_fld -= 2;
			int var7 = au_fld[gz.ax_fld * 1493093142];
			int var12 = au_fld[gz.ax_fld + 1];
			if (var3.dy_fld == null) {
				throw new RuntimeException("");
			} else {
				var3.dy_fld.aa(var7, var12, 1990421417);
				return 1;
			}
		} else if (var0 == -941220597) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * 521823034];
			if (null == var3.dy_fld) {
				throw new RuntimeException("");
			} else {
				cv var5 = ot.ef();
				int var6 = var5 != null ? -813435157 * var5.av_fld.ax_fld : 0;
				lp.ub(var3.dy_fld, var6, var4, -494713083);
				return 1;
			}
		} else if (1887785675 == var0) {
			var3.dm_fld = -1521704936;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -1002823176] * -987387031;
			return 1;
		} else if (var0 == 432663089) {
			var3.dm_fld = -417337518;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -1971707823] * -2068010141;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ed(int var0, ba var1, boolean var2) throws EOFException {
		lu var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		if (1200 == var0 || var0 == 1205 || var0 == 1212) {
			gz.ax_fld -= 2;
			int var11 = au_fld[gz.ax_fld];
			int var14 = au_fld[1 + gz.ax_fld];
			var3.ga_fld = var11;
			var3.gd_fld = var14;
			og var16 = kb.ag(var11, -1752383175);
			var3.dx_fld = var16.di_fld * 1195532183;
			var3.ds_fld = var16.dn_fld * -2029380757;
			var3.du_fld = -376214075 * var16.df_fld;
			var3.da_fld = var16.de_fld * 2142646695;
			var3.dk_fld = var16.dp_fld * 596927033;
			var3.db_fld = -780652221 * var16.dy_fld;
			if (var0 == 1205) {
				var3.df_fld = 0;
			} else if (var0 == 1212 | var16.dj_fld == 1) {
				var3.df_fld = 108305121;
			} else {
				var3.df_fld = 216610242;
			}

			if (var3.dg_fld > 0) {
				var3.db_fld = -964578897 * (var3.db_fld / var3.dg_fld);
			} else if (var3.bw_fld > 0) {
				var3.db_fld = var3.db_fld / var3.bw_fld;
			}

			return 1;
		} else if (var0 == 1201) {
			var3.dm_fld = 693315590;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1202 == var0) {
			var3.dm_fld = -1107510263;
			cv var10 = ot.ef();
			var3.dq_fld = var10 != null ? var10.av_fld.al(674633258) : -1;
			return 1;
		} else if (1207 == var0) {
			boolean var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			cv var13 = ot.ef();
			lp var15 = var13 != null ? var13.av_fld : null;
			lu.wo(var3, var15, var9, 1866472138);
			return 1;
		} else if (1208 == var0) {
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null == var3.dy_fld) {
				throw new RuntimeException("");
			} else {
				var3.dy_fld.ai(var8, (byte)0);
				return 1;
			}
		} else if (1209 == var0) {
			gz.ax_fld -= 2;
			int var7 = au_fld[gz.ax_fld];
			int var12 = au_fld[gz.ax_fld + 1];
			if (var3.dy_fld == null) {
				throw new RuntimeException("");
			} else {
				var3.dy_fld.aa(var7, var12, 1991339778);
				return 1;
			}
		} else if (var0 == 1210) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null == var3.dy_fld) {
				throw new RuntimeException("");
			} else {
				cv var5 = ot.ef();
				int var6 = var5 != null ? 1953147203 * var5.av_fld.ax_fld : 0;
				lp.ub(var3.dy_fld, var6, var4, -1527164668);
				return 1;
			}
		} else if (1214 == var0) {
			var3.dm_fld = -1521704936;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1215) {
			var3.dm_fld = 972436507;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int et(int var0, ba var1, boolean var2) throws EOFException {
		lu var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		if (1200 == var0 || var0 == 1205 || var0 == 1212) {
			gz.ax_fld -= 2;
			int var11 = au_fld[gz.ax_fld];
			int var14 = au_fld[1 + gz.ax_fld];
			var3.ga_fld = var11;
			var3.gd_fld = var14;
			og var16 = kb.ag(var11, -1752383175);
			var3.dx_fld = var16.di_fld * 1195532183;
			var3.ds_fld = var16.dn_fld * -2029380757;
			var3.du_fld = -376214075 * var16.df_fld;
			var3.da_fld = var16.de_fld * 2142646695;
			var3.dk_fld = var16.dp_fld * 596927033;
			var3.db_fld = -780652221 * var16.dy_fld;
			if (var0 == 1205) {
				var3.df_fld = 0;
			} else if (var0 == 1212 | var16.dj_fld == 1) {
				var3.df_fld = 108305121;
			} else {
				var3.df_fld = 216610242;
			}

			if (var3.dg_fld > 0) {
				var3.db_fld = -964578897 * (var3.db_fld / var3.dg_fld);
			} else if (var3.bw_fld > 0) {
				var3.db_fld = var3.db_fld / var3.bw_fld;
			}

			return 1;
		} else if (var0 == 1201) {
			var3.dm_fld = 693315590;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (1202 == var0) {
			var3.dm_fld = -1107510263;
			cv var10 = ot.ef();
			var3.dq_fld = var10 != null ? var10.av_fld.al(1252831516) : -1;
			return 1;
		} else if (1207 == var0) {
			boolean var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			cv var13 = ot.ef();
			lp var15 = var13 != null ? var13.av_fld : null;
			lu.wo(var3, var15, var9, 1938303438);
			return 1;
		} else if (1208 == var0) {
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null == var3.dy_fld) {
				throw new RuntimeException("");
			} else {
				var3.dy_fld.ai(var8, (byte)0);
				return 1;
			}
		} else if (1209 == var0) {
			gz.ax_fld -= 2;
			int var7 = au_fld[gz.ax_fld];
			int var12 = au_fld[gz.ax_fld + 1];
			if (var3.dy_fld == null) {
				throw new RuntimeException("");
			} else {
				var3.dy_fld.aa(var7, var12, 1990375231);
				return 1;
			}
		} else if (var0 == 1210) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null == var3.dy_fld) {
				throw new RuntimeException("");
			} else {
				cv var5 = ot.ef();
				int var6 = var5 != null ? 1953147203 * var5.av_fld.ax_fld : 0;
				lp.ub(var3.dy_fld, var6, var4, -905789912);
				return 1;
			}
		} else if (1214 == var0) {
			var3.dm_fld = -1521704936;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1215) {
			var3.dm_fld = 972436507;
			var3.dq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ev(int var0, ba var1, boolean var2) {
		lu var3 = var2 ? gs.ap_fld : ab_fld;
		if (1500 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bq_fld;
			return 1;
		} else if (1501 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bg_fld;
			return 1;
		} else if (1502 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bb_fld;
			return 1;
		} else if (1503 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cd_fld;
			return 1;
		} else if (var0 == 1504) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cf_fld ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cv_fld;
			return 1;
		} else if (var0 != 1506) {
			return 2;
		} else {
			int var4 = var3.cv_fld;
			if (var4 == -1) {
				uo var5 = cf.cg_fld;

				for (pk var6 = (pk)var5.ai_fld.aq(); null != var6; var6 = (pk)xz.aa(var5.ai_fld)) {
					if (var6.ak_fld == var3.bf_fld >> 16) {
						var4 = (int)var6.hc_fld;
						break;
					}
				}
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hw(int var0, ba var1) throws EOFException {
		if (-587587016 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gv.ak() ? 1 : 0;
			return 1;
		} else if (1095223847 == var0) {
			ct var15 = gk.aw();
			if (null != var15) {
				au_fld[(gz.ax_fld += -1684678759) * 1625390328 - 1] = var15.af_fld;
				au_fld[(gz.ax_fld += -1684678759) * 2120311920 - 1] = 566538652 * var15.al_fld;
				ai_fld[(ef.aq_fld += -211521517) * -630796316 - 1] = var15.an_fld;
				au_fld[(gz.ax_fld += 1506790603) * -776631127 - 1] = var15.aa_fld * -329213800;
				au_fld[(gz.ax_fld += 2082488209) * 1985630603 - 1] = var15.au_fld * 1208996980;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var15.ax_fld;
			} else {
				au_fld[(gz.ax_fld += 1847658342) * -1887940067 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += 1046547174) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += 1500833324) * 2014182249 - 1] = 0;
				au_fld[(gz.ax_fld += 1051612339) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += 566228557) * -1947090015 - 1] = "";
			}

			return 1;
		} else if (6502 == var0) {
			ct var14 = ey.ay();
			if (var14 != null) {
				au_fld[(gz.ax_fld += -2019827832) * -776631127 - 1] = var14.af_fld * 368125667;
				au_fld[(gz.ax_fld += -1684678759) * 1420522693 - 1] = var14.al_fld * -413966337;
				ai_fld[(ef.aq_fld += -18883967) * -836183525 - 1] = var14.an_fld;
				au_fld[(gz.ax_fld += -1684678759) * 2118621294 - 1] = 753228346 * var14.aa_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 909974747 * var14.au_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14.ax_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * 1695196702 - 1] = -1;
				au_fld[(gz.ax_fld += 475996423) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += 2102872403) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * 436081930 - 1] = 0;
				ai_fld[(ef.aq_fld += 817913397) * 1170642860 - 1] = "";
			}

			return 1;
		} else if (var0 == 6506) {
			int var13 = au_fld[(gz.ax_fld -= 1564739812) * 1178151793];
			ct var22 = null;

			for (int var28 = 0; var28 < ct.ah_fld; var28++) {
				if (-1309312757 * yd.ae_fld[var28].af_fld == var13) {
					var22 = yd.ae_fld[var28];
					break;
				}
			}

			if (null != var22) {
				au_fld[(gz.ax_fld += 551614204) * -776631127 - 1] = -155487818 * var22.af_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.al_fld * 293473426;
				ai_fld[(ef.aq_fld += -1015021275) * -836183525 - 1] = var22.an_fld;
				au_fld[(gz.ax_fld += -227450089) * -776631127 - 1] = 52067091 * var22.aa_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.au_fld * 1111867395;
				ai_fld[(ef.aq_fld += -211521517) * -1868236207 - 1] = var22.ax_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -545368334 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * 16124054 - 1] = 0;
				ai_fld[(ef.aq_fld += 355756399) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -2026043356) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * 117088975 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == -2146723732) {
			gz.ax_fld -= 4;
			int var12 = au_fld[gz.ax_fld * 2024732712];
			boolean var21 = au_fld[gz.ax_fld + 1] == 1;
			int var27 = au_fld[2 + gz.ax_fld];
			boolean var6 = au_fld[3 + gz.ax_fld] == 1;
			tw.av(var12, var21, var27, var6, -1394286447);
			return 1;
		} else if (6511 != var0) {
			if (1872082149 == var0) {
				client.eq_fld = au_fld[(gz.ax_fld -= -775211135) * -1437449341] == 1;
				return 1;
			} else if (var0 == 1829277439) {
				gz.ax_fld -= 1828448140;
				int var11 = au_fld[gz.ax_fld * -1979733601];
				int var20 = au_fld[1 + gz.ax_fld];
				px var26 = kb.ag_px(var20, 205663160);
				if (var26.aw()) {
					ai_fld[(ef.aq_fld += 60610261) * -1583737409 - 1] = ca.az(var11).ax(var20, var26.as_fld, (byte)81);
				} else if (px.ll(var26, (short)10000)) {
					an_fld[(db.aa_fld += 231915541) * -1199586174 - 1] = ca.az(var11).au(var20, var26.ay_fld);
				} else {
					au_fld[(gz.ax_fld += 1069367986) * -776631127 - 1] = pp.kt(ca.az(var11), var20, var26.aw_fld * 1610230015, (byte)-58);
				}

				return 1;
			} else if (var0 == 6514) {
				gz.ax_fld -= 2;
				int var10 = au_fld[gz.ax_fld];
				int var19 = au_fld[gz.ax_fld + 1];
				px var25 = kb.ag_px(var19, -654652128);
				if (var25.aw()) {
					ai_fld[(ef.aq_fld += 1151304574) * -836183525 - 1] = ko.az(var10).ai(var19, var25.as_fld, -2080033686);
				} else if (px.ll(var25, (short)10000)) {
					an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ko.az(var10).aa(var19, var25.ay_fld);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ko.az(var10).an(var19, -1982668165 * var25.aw_fld, -1560682751);
				}

				return 1;
			} else if (var0 == 6515) {
				gz.ax_fld -= -1629583502;
				int var9 = au_fld[gz.ax_fld];
				int var18 = au_fld[gz.ax_fld + 1];
				px var24 = kb.ag_px(var18, -470134085);
				if (var24.aw()) {
					ai_fld[(ef.aq_fld += 1017828984) * 1976134463 - 1] = og.sw(kb.ag(var9, -1752383175), var18, var24.as_fld, (byte)49);
				} else if (px.ll(var24, (short)10000)) {
					an_fld[(db.aa_fld += 1887378067) * 867932261 - 1] = og.pv(kb.ag(var9, -1752383175), var18, var24.ay_fld);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var9, -1752383175).ad(var18, var24.aw_fld, -1766182682);
				}

				return 1;
			} else if (899741815 == var0) {
				gz.ax_fld -= 2;
				int var8 = au_fld[gz.ax_fld];
				int var17 = au_fld[1 + gz.ax_fld];
				px var23 = kb.ag_px(var17, -302141454);
				if (var23.aw()) {
					ai_fld[(ef.aq_fld += -878939263) * -988025283 - 1] = cr.ak(var8).aw(var17, var23.as_fld, 679862336);
				} else if (px.ll(var23, (short)10000)) {
					an_fld[(db.aa_fld += 789431076) * 867932261 - 1] = pw.bv(cr.ak(var8), var17, var23.ay_fld);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cr.ak(var8).ae(var17, var23.aw_fld, -718378719);
				}

				return 1;
			} else if (var0 == 854204145) {
				au_fld[(gz.ax_fld += -1684678759) * -1066666677 - 1] = client.gz_fld ? 1 : 0;
				return 1;
			} else if (-630628461 == var0) {
				au_fld[(gz.ax_fld += 1458179477) * -776631127 - 1] = client.gd_fld;
				return 1;
			} else if (1774430189 == var0) {
				return 1;
			} else if (291650179 == var0) {
				return 1;
			} else if (-376213730 == var0) {
				ef.aq_fld -= 538450926;
				gz.ax_fld -= -1015668545;
				return 1;
			} else if (var0 == 6523) {
				ef.aq_fld--;
				gz.ax_fld--;
				return 1;
			} else if (var0 == -1065344682) {
				au_fld[(gz.ax_fld += 1723043964) * -473326435 - 1] = -1;
				return 1;
			} else if (var0 == 1110428873) {
				au_fld[(gz.ax_fld += -1862971016) * 2069235039 - 1] = 1;
				return 1;
			} else if (6526 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -1067157109 - 1] = 1;
				return 1;
			} else if (1987669848 == var0) {
				au_fld[(gz.ax_fld += -148749598) * -776631127 - 1] = client.gy_fld * -1992180046;
				return 1;
			} else if (var0 == 6528) {
				gz.ax_fld -= 2;
				int var7 = au_fld[1676856381 * gz.ax_fld];
				int var16 = au_fld[1 + gz.ax_fld];
				px var5 = kb.ag_px(var16, -1747011148);
				if (var5.aw()) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = lg.ak(var7, 1781533312).ae(var16, var5.as_fld);
				} else {
					au_fld[(gz.ax_fld += 1626863117) * -776631127 - 1] = lg.ak(var7, 1641467902).av(var16, var5.aw_fld, 2011751109);
				}

				return 1;
			} else if (var0 == 6531) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1339007614;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				return 1;
			} else {
				return 2;
			}
		} else {
			int var3 = au_fld[(gz.ax_fld -= -1851346596) * -776631127];
			if (var3 >= 0 && var3 < ct.ah_fld) {
				ct var4 = yd.ae_fld[var3];
				au_fld[(gz.ax_fld += 333362396) * -279485301 - 1] = var4.af_fld;
				au_fld[(gz.ax_fld += -1684678759) * -970252311 - 1] = var4.al_fld * 5399460;
				ai_fld[(ef.aq_fld += -1263377232) * -836183525 - 1] = var4.an_fld;
				au_fld[(gz.ax_fld += 1491545834) * -774686715 - 1] = -1932934541 * var4.aa_fld;
				au_fld[(gz.ax_fld += 665377551) * -776631127 - 1] = var4.au_fld * 332059610;
				ai_fld[(ef.aq_fld += -314875302) * -836183525 - 1] = var4.ax_fld;
			} else {
				au_fld[(gz.ax_fld += -1481145349) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -1786604055) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += 514906006) * -1877479262 - 1] = 0;
				ai_fld[(ef.aq_fld += 1873564621) * -836183525 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int dp(int var0, ba var1, boolean var2) throws EOFException {
		lu var3;
		if (var0 >= -959636955) {
			var0 -= 1000;
			int var4 = au_fld[(gz.ax_fld -= 762760341) * -776631127];
			var3 = cf.cg_fld.ak(var4);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		if (var0 == 1000) {
			gz.ax_fld -= 931171421;
			var3.bn_fld = au_fld[gz.ax_fld] * -1708819479;
			var3.bc_fld = au_fld[1 + gz.ax_fld];
			var3.bt_fld = au_fld[2 + gz.ax_fld];
			var3.bv_fld = au_fld[3 + gz.ax_fld];
			kl.ah(var3, pf.qw_fld, -764732324 * bc.qx_fld, cf.cg_fld, client.cz_fld);
			if (-1830302246 * var3.bx_fld == 0) {
				lu[] var7 = -1 == var3.by_fld ? cf.cg_fld.aw_fld[var3.bf_fld >> 16] : cf.cg_fld.ak(1083407299 * var3.cv_fld).ge_fld;
				tb.ag(var7, var3, false, cf.cg_fld, client.cz_fld, 13267576);
			}

			return 1;
		} else if (1001 == var0) {
			gz.ax_fld -= 4;
			var3.bw_fld = au_fld[890396609 * gz.ax_fld] * -1848789392;
			var3.ba_fld = -794239085 * au_fld[1 + gz.ax_fld];
			var3.bi_fld = -1127061401 * au_fld[2 + gz.ax_fld];
			var3.bu_fld = -2039943749 * au_fld[3 + gz.ax_fld];
			kl.ah(var3, pf.qw_fld, bc.qx_fld, cf.cg_fld, client.cz_fld);
			if (var3.bx_fld * -402635829 == 0) {
				lu[] var6 = -1 == var3.by_fld ? cf.cg_fld.aw_fld[var3.bf_fld >> 16] : cf.cg_fld.ak(var3.cv_fld).ge_fld;
				tb.ag(var6, var3, false, cf.cg_fld, client.cz_fld, 142080484);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var5 = au_fld[(gz.ax_fld -= -1164321920) * -237507700] == 1;
			if (var5 != var3.cf_fld) {
				var3.cf_fld = var5;
			}

			return 1;
		} else if (1005 == var0) {
			var3.hb_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (var0 == 1006) {
			var3.hf_fld = au_fld[(gz.ax_fld -= -2073373362) * -1603832229] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lyz;Lba;II)V"
	)
	static void ci(yz var0, ba var1, int var2, int var3) throws EOFException {
		Object[] var4 = (Object[])yz.hw(var0, 1697120891);
		gz.ax_fld = 0;
		db.aa_fld = 0;
		ef.aq_fld = 0;
		int var5 = -1;
		int[] var6 = var1.av_fld;
		int[] var7 = var1.ae_fld;
		int var8 = -1;
		am_fld = 0;
		bm_fld = false;
		boolean var9 = false;
		ao_fld = 0;
		boolean var23 = false /* VF: Semaphore variable */;

		label723: {
			label724: {
				try {
					var23 = true;
					ie.ar_fld = new int[var1.ay_fld];
					int var26 = 0;
					jq.af_fld = new long[983545166 * var1.as_fld];
					int var27 = 0;
					al_fld = (Object[])(new Object[var1.ar_fld]);
					int var28 = 0;

					for (int var13 = 1; var13 < var4.length; var13++) {
						if (var4[var13] instanceof Integer) {
							int var14 = (Integer)var4[var13];
							if (var14 == 534786514) {
								var14 = var0.ah(-1762702822);
							}

							if (var14 == 1743380969) {
								var14 = yz.wa(var0, 669757382);
							}

							if (-2147483645 == var14) {
								var14 = var0.av((short)-2960) != null ? var0.av((short)4658).bf_fld * 1461045985 : -1;
							}

							if (-2147483644 == var14) {
								var14 = var0.ay(-610808415);
							}

							if (var14 == -1799312859) {
								var14 = var0.av((short)2677) != null ? var0.av((short)-16953).by_fld * 145282054 : -1;
							}

							if (430522714 == var14) {
								var14 = yz.wa_lu(var0, 1930993595) != null ? yz.wa_lu(var0, 1234179869).bf_fld * -362820456 : -1;
							}

							if (var14 == 850005457) {
								var14 = yz.wa_lu(var0, -236964255) != null ? yz.wa_lu(var0, 1750188505).by_fld * 1430402245 : -1;
							}

							if (var14 == -1473042451) {
								var14 = var0.ar(-450034640);
							}

							if (var14 == -2147483639) {
								var14 = var0.af(1665838759);
							}

							if (var14 == 1057780481) {
								var14 = var0.al((byte)102);
							}

							ie.ar_fld[var26++] = var14;
						} else if (var4[var13] instanceof String) {
							String var45 = (String)var4[var13];
							if (var45.equals("event_opbase")) {
								var45 = var0.au(800813021);
							}

							al_fld[var28++] = var45;
						} else if (var4[var13] instanceof sl) {
							al_fld[var28++] = var4[var13];
						} else if (var4[var13] instanceof Long) {
							long var46 = (Long)var4[var13];
							jq.af_fld[var27++] = var46;
						}
					}

					br_fld = yz.ri(var0, (short)21199);

					label712:
					while (true) {
						ao_fld += 1374468367;
						if (ao_fld > var2) {
							throw new RuntimeException();
						}

						var8 = var6[++var5];
						if (var8 < 100) {
							if (var8 == 0) {
								au_fld[(gz.ax_fld += -713599662) * -776631127 - 1] = var7[var5];
							} else if (1 == var8) {
								int var44 = var7[var5];
								au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = rt.ag_fld[var44];
							} else if (var8 == 2) {
								int var43 = var7[var5];
								rt.ag_fld[var43] = au_fld[(gz.ax_fld -= -1684678759) * 1033821460];
								ns.gk(var43, (byte)29);
							} else if (var8 == 3) {
								ai_fld[(ef.aq_fld += -211521517) * -665258858 - 1] = var1.ae(var5, -1684678759);
							} else if (6 == var8) {
								var5 += var7[var5];
							} else if (var8 == 7) {
								gz.ax_fld -= -1726876122;
								if (au_fld[gz.ax_fld + 1] != au_fld[gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 8) {
								gz.ax_fld -= 935159810;
								if (au_fld[gz.ax_fld] == au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 9) {
								gz.ax_fld -= 2;
								if (au_fld[187089739 * gz.ax_fld] < au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 10) {
								gz.ax_fld -= -680746667;
								if (au_fld[gz.ax_fld * -1395673549] > au_fld[gz.ax_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 68) {
								db.aa_fld -= 2;
								if (an_fld[db.aa_fld] != an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (69 == var8) {
								db.aa_fld -= 2;
								if (an_fld[-403436346 * db.aa_fld] == an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (70 == var8) {
								db.aa_fld -= 2;
								if (an_fld[db.aa_fld] < an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 71) {
								db.aa_fld -= 1240844987;
								if (an_fld[db.aa_fld] > an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (21 == var8) {
								if (am_fld * -1678092615 == 0) {
									var23 = false;
									break label724;
								}

								bj var41 = ad_fld[(am_fld -= -745212924) * -991242929];
								var1 = var41.ak_fld;
								var6 = var1.av_fld;
								var7 = var1.ae_fld;
								var5 = 1141575049 * var41.ag_fld;
								ie.ar_fld = var41.az_fld;
								al_fld = (Object[])var41.av_fld;
								jq.af_fld = var41.ae_fld;
							} else if (var8 == 25) {
								int var40 = var7[var5];
								au_fld[(gz.ax_fld += -1789313933) * -1637250089 - 1] = dv.ag(var40, (byte)120);
							} else if (var8 == 27) {
								int var39 = var7[var5];
								es.az(var39, au_fld[(gz.ax_fld -= -1684678759) * 787445519]);
							} else if (var8 == 1810413045) {
								gz.ax_fld -= 525101700;
								if (au_fld[gz.ax_fld] <= au_fld[gz.ax_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == -246833598) {
								gz.ax_fld -= -614021074;
								if (au_fld[-1749440310 * gz.ax_fld] >= au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (72 == var8) {
								db.aa_fld -= 1341192007;
								if (an_fld[db.aa_fld * 357871952] <= an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == -1888796001) {
								db.aa_fld -= 2;
								if (an_fld[db.aa_fld * 1826912365] >= an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 33) {
								au_fld[(gz.ax_fld += -106796697) * 1375964009 - 1] = ie.ar_fld[var7[var5]];
							} else if (-488051215 == var8) {
								ie.ar_fld[var7[var5]] = au_fld[(gz.ax_fld -= -1684678759) * -969015725];
							} else if (1278933568 == var8) {
								ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = al_fld[var7[var5]];
							} else if (36 == var8) {
								al_fld[var7[var5]] = ai_fld[(ef.aq_fld -= 1302442345) * 1162389928];
							} else if (var8 == 524936554) {
								int var38 = var7[var5];
								ef.aq_fld -= -1176054696 * var38;
								String var54 = kc.ak((Object[])ai_fld, ef.aq_fld, var38);
								ai_fld[(ef.aq_fld += -211521517) * -24050744 - 1] = var54;
							} else if (var8 == 38) {
								gz.ax_fld--;
							} else if (531742457 == var8) {
								ef.aq_fld -= 637798505;
							} else if (1545386691 == var8) {
								if (am_fld == 2065125107) {
									throw new RuntimeException();
								}

								int var37 = var7[var5];
								ba var53 = an.ak(var37);
								int[] var56 = new int[-1352039648 * var53.ay_fld];
								Object[] var16 = (Object[])(new Object[var53.ar_fld]);
								long[] var17 = new long[var53.as_fld];
								if (var53.af_fld >= 0) {
									System.arraycopy(au_fld, 0 + (gz.ax_fld - var53.af_fld), var56, 0, var53.af_fld * 458731112);
								}

								if (var53.al_fld * 327039067 >= 0) {
									System.arraycopy((Object)ai_fld, 0 + (ef.aq_fld - var53.al_fld), (Object)var16, 0, var53.al_fld * -1889454220);
								}

								if (var53.au_fld >= 0) {
									System.arraycopy(an_fld, 0 + (db.aa_fld - var53.au_fld), var17, 0, -1260763161 * var53.au_fld);
								}

								gz.ax_fld = gz.ax_fld - var53.af_fld;
								ef.aq_fld = ef.aq_fld - var53.al_fld;
								db.aa_fld = db.aa_fld - var53.au_fld;
								bj var18 = new bj();
								var18.ak_fld = var1;
								var18.ag_fld = var5 * -1033640306;
								var18.az_fld = ie.ar_fld;
								var18.av_fld = (Object[])al_fld;
								var18.ae_fld = jq.af_fld;
								ad_fld[(am_fld += 13758267) * -991242929 - 1] = var18;
								var1 = var53;
								var6 = var53.av_fld;
								var7 = var53.ae_fld;
								var5 = -1;
								ie.ar_fld = var56;
								al_fld = (Object[])var16;
								jq.af_fld = var17;
							} else if (var8 == -1897058847) {
								au_fld[(gz.ax_fld += -1179919087) * -776631127 - 1] = ob.ek_fld.ag(var7[var5]);
							} else if (392757021 == var8) {
								ob.ek_fld.ak(var7[var5], au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
							} else if (51 == var8) {
								an_fld[(db.aa_fld += 432101741) * -758583408 - 1] = ob.ek_fld.av(var7[var5]);
							} else if (-1380464970 == var8) {
								dn.lq(ob.ek_fld, var7[var5], an_fld[(db.aa_fld -= 173054962) * 867932261]);
							} else if (44 == var8) {
								int var36 = var7[var5] >> 16;
								int var52 = var7[var5] & -325842665;
								int var55 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
								if (var55 < 0 || var55 > 5000) {
									throw new RuntimeException();
								}

								if (var52 == 115) {
									al_fld[var36] = new sl(yq.az_fld, "", var55, var55);
								} else if (var52 != 105 && 49 != var52) {
									al_fld[var36] = new sl(yq.ak_fld, -1, var55, var55);
								} else {
									al_fld[var36] = new sl(yq.ak_fld, 0, var55, var55);
								}
							} else if (var8 == -1454413453) {
								sl var30 = eh.av(var7[var5], al_fld[var7[var5]]);
								int var48 = au_fld[(gz.ax_fld -= -1684678759) * -913372049];
								nb.ae(var30, var48, (byte)116);
								if (yq.ak_fld == var30.ag_fld) {
									au_fld[(gz.ax_fld += -1910768290) * -776631127 - 1] = var30.ak()[var48];
								} else {
									ai_fld[(ef.aq_fld += -219835109) * -900839947 - 1] = var30.az()[var48];
								}
							} else if (-594146985 == var8) {
								sl var31 = eh.av(var7[var5], al_fld[var7[var5]]);
								if (!var31.az_fld) {
									throw new RuntimeException();
								}

								if (var31.ag_fld == yq.ak_fld) {
									gz.ax_fld -= 1845301509;
									int var49 = au_fld[gz.ax_fld];
									nb.ae(var31, var49, (byte)115);
									var31.ak()[var49] = au_fld[1 + gz.ax_fld];
								} else {
									int var50 = au_fld[(gz.ax_fld -= -1769336855) * -776631127];
									nb.ae(var31, var50, (byte)113);
									var31.az()[var50] = ai_fld[(ef.aq_fld -= -211521517) * 1742206151];
								}
							} else if (var8 == 1274501718) {
								String var32 = dn.vd(ob.ek_fld, var7[var5], (byte)24);
								ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var32;
							} else if (var8 == 2042761866) {
								ob.ek_fld.ae(var7[var5], (String)ai_fld[(ef.aq_fld -= 1081286067) * -836183525]);
							} else if (var8 == -1180709631) {
								xv var33 = var1.ag_fld[var7[var5]];
								vl var51 = (vl)var33.ak(au_fld[(gz.ax_fld -= -101862783) * 1672178534]);
								if (null != var51) {
									var5 += var51.ak_fld;
								}
							} else if (1969887567 == var8) {
								ai_fld[(ef.aq_fld += 202769961) * -836183525 - 1] = null;
							} else if (var8 == -1987523684) {
								an_fld[(db.aa_fld += 430749742) * 867932261 - 1] = var1.ah(var5, -55920386);
							} else if (62 == var8) {
								db.aa_fld -= -2099059304;
							} else if (var8 == -526141639) {
								an_fld[(db.aa_fld += 1756976881) * 1335439385 - 1] = jq.af_fld[var7[var5]];
							} else if (-608118213 == var8) {
								jq.af_fld[var7[var5]] = an_fld[(db.aa_fld -= 432101741) * 599004518];
							} else if (var8 == 74) {
								Integer var34 = ik.nd(gt.be_fld, var7[var5]);
								if (null == var34) {
									au_fld[(gz.ax_fld += -1684678759) * -1663911900 - 1] = -1;
								} else {
									au_fld[(gz.ax_fld += -1912911139) * -776631127 - 1] = var34;
								}
							} else {
								if (var8 != 76) {
									throw new IllegalStateException();
								}

								Integer var35 = bl.ey_fld.ak(var7[var5]);
								if (null == var35) {
									au_fld[(gz.ax_fld += -1343157137) * -1992156479 - 1] = -1;
								} else {
									au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var35;
								}
							}
						} else {
							boolean var29 = 1 == var1.ae_fld[var5];
							int var47 = qo.ah(var8, var1, var29);
							switch (var47) {
								case 0:
									var23 = false;
									break label712;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
							}
						}
					}
				} catch (Exception var24) {
					var9 = true;
					StringBuilder var11 = new StringBuilder(30);
					var11.append("").append(var1.hc_fld).append(" ");

					for (int var12 = am_fld - 1; var12 >= 0; var12--) {
						var11.append("").append(ad_fld[var12].ak_fld.hc_fld).append(" ");
					}

					var11.append("").append(var8);
					gl.ak(var11.toString(), var24);
					var23 = false;
					break label723;
				} finally {
					if (var23) {
						while (!bz_fld.isEmpty()) {
							dg var20 = (dg)(dg)bz_fld.remove(0);
							nt.fc(var20.ak(), dg.cl(var20, 586336775), dg.ed(var20, 321737442), dg.zi(var20, (byte)94), "", -2045450896);
						}

						if (bm_fld) {
							bm_fld = false;
							nx.gf(1885870859);
						}

						if (!var9 && var3 > 0 && ao_fld >= var3) {
							gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld + " of max " + var2, null);
						}
					}
				}

				while (!bz_fld.isEmpty()) {
					dg var15 = (dg)(dg)bz_fld.remove(0);
					nt.fc(var15.ak(), dg.cl(var15, -519094443), dg.ed(var15, 321737442), dg.zi(var15, (byte)12), "", -2052544655);
				}

				if (bm_fld) {
					bm_fld = false;
					nx.gf(2043377671);
				}

				if (!var9 && var3 > 0 && ao_fld >= var3) {
					gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld + " of max " + var2, null);
				}

				return;
			}

			while (!bz_fld.isEmpty()) {
				dg var42 = (dg)(dg)bz_fld.remove(0);
				nt.fc(var42.ak(), dg.cl(var42, 313596555), dg.ed(var42, 321737442), dg.zi(var42, (byte)94), "", -914383042);
			}

			if (bm_fld) {
				bm_fld = false;
				nx.gf(1941780103);
			}

			if (!var9 && var3 > 0 && ao_fld >= var3) {
				gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld * -1333326222 + " of max " + var2, null);
			}

			return;
		}

		while (!bz_fld.isEmpty()) {
			dg var10 = (dg)(dg)bz_fld.remove(0);
			nt.fc(var10.ak(), dg.cl(var10, -50882746), dg.ed(var10, 321737442), dg.zi(var10, (byte)27), "", -1714804950);
		}

		if (bm_fld) {
			bm_fld = false;
			nx.gf(1967010585);
		}

		if (!var9 && var3 > 0 && ao_fld >= var3) {
			gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld * 201506441 + " of max " + var2, null);
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int in(int var0, ba var1) {
		if (var0 == 13337) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ao_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ht(int var0, ba var1) throws EOFException {
		if (6754 == var0) {
			int var6 = au_fld[(gz.ax_fld -= 1566330699) * 1453728527];
			pp var7 = ca.az(var6);
			ai_fld[(ef.aq_fld += 555452206) * -836183525 - 1] = null != var7 ? var7.cg_fld : "";
			return 1;
		} else if (-2088849697 == var0) {
			gz.ax_fld -= 1763194983;
			pp var5 = ca.az(au_fld[gz.ax_fld]);
			int var4 = au_fld[gz.ax_fld + 1];
			au_fld[(gz.ax_fld += -502179040) * 1975133476 - 1] = pp.dc(var5, var4);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.am(var4, 46130898);
			return 1;
		} else if (6765 == var0) {
			pp var3 = ca.az(au_fld[(gz.ax_fld -= -25536587) * -2139258454]);
			au_fld[(gz.ax_fld += -1684678759) * 1854343706 - 1] = null != var3 ? var3.dx_fld * -1264227525 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	static final void en(lu var0, int var1) {
		if (null == var0.er_fld) {
			throw new RuntimeException();
		} else {
			if (var0.hp_fld == null) {
				var0.hp_fld = new int[var0.er_fld.length];
			}

			var0.hp_fld[var1] = Integer.MAX_VALUE;
		}
	}

	bp() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	static final void ef(lu var0, int var1) {
		if (null == var0.er_fld) {
			throw new RuntimeException();
		} else {
			if (var0.hp_fld == null) {
				var0.hp_fld = new int[var0.er_fld.length];
			}

			var0.hp_fld[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V"
	)
	static final void eq(lu var0, int var1) {
		if (null == var0.er_fld) {
			throw new RuntimeException();
		} else {
			if (var0.hp_fld == null) {
				var0.hp_fld = new int[var0.er_fld.length];
			}

			var0.hp_fld[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ei(int var0, ba var1, boolean var2) throws EOFException {
		lu var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		String var4 = (String)ai_fld[(ef.aq_fld -= -1653416909) * -836183525];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == -1711031802) {
			int var6 = au_fld[(gz.ax_fld -= 1353591482) * -444526391];
			if (var6 > 0) {
				var5 = new int[var6];

				while (var6-- > 0) {
					var5[var6] = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = (Object[])(new Object[var4.length() + 1]);

		for (int var7 = var9.length - 1; var7 >= 1; var7--) {
			switch (var4.charAt(var7 - 1)) {
				case 'W':
				case 'X':
				case 's':
					var9[var7] = ai_fld[(ef.aq_fld -= -189098596) * 1752798837];
					break;
				case 'Ï':
					var9[var7] = new Long(an_fld[(db.aa_fld -= 432101741) * 867932261]);
					break;
				default:
					var9[var7] = new Integer(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			}
		}

		int var10 = au_fld[(gz.ax_fld -= -1684678759) * 861541286];
		if (var10 != -1) {
			var9[0] = new Integer(var10);
		} else {
			var9 = null;
		}

		if (var0 == 1400) {
			var3.ej_fld = (Object[])var9;
		} else if (var0 == -390412523) {
			var3.fo_fld = (Object[])var9;
		} else if (1402 == var0) {
			var3.fa_fld = (Object[])var9;
		} else if (1403 == var0) {
			var3.fp_fld = (Object[])var9;
		} else if (-495998208 == var0) {
			var3.fv_fld = (Object[])var9;
		} else if (1405 == var0) {
			var3.fj_fld = (Object[])var9;
		} else if (-1322467811 == var0) {
			var3.fc_fld = (Object[])var9;
		} else if (-606910204 == var0) {
			var3.fh_fld = (Object[])var9;
			var3.fm_fld = var5;
		} else if (1408 == var0) {
			var3.fn_fld = (Object[])var9;
		} else if (var0 == 884934135) {
			var3.ft_fld = (Object[])var9;
		} else if (1410 == var0) {
			var3.fb_fld = (Object[])var9;
		} else if (-463318270 == var0) {
			var3.fy_fld = (Object[])var9;
		} else if (1207152868 == var0) {
			var3.fx_fld = (Object[])var9;
		} else if (var0 == -861381559) {
			var3.fe_fld = (Object[])var9;
			var3.fw_fld = var5;
		} else if (83685539 == var0) {
			var3.fl_fld = (Object[])var9;
			var3.fg_fld = var5;
		} else if (1418599866 == var0) {
			var3.fk_fld = (Object[])var9;
		} else if (589938090 == var0) {
			var3.fq_fld = (Object[])var9;
		} else if (var0 == -1045902189) {
			var3.fs_fld = (Object[])var9;
		} else if (var0 == 1419) {
			var3.fu_fld = (Object[])var9;
		} else if (var0 == 1420) {
			var3.fz_fld = (Object[])var9;
		} else if (655176019 == var0) {
			var3.ff_fld = (Object[])var9;
		} else if (var0 == 1422) {
			var3.go_fld = (Object[])var9;
		} else if (var0 == 33009632) {
			var3.gn_fld = (Object[])var9;
		} else if (var0 == 1096774678) {
			var3.gh_fld = (Object[])var9;
		} else if (1425 == var0) {
			var3.gj_fld = (Object[])var9;
		} else if (1426 == var0) {
			var3.gt_fld = (Object[])var9;
		} else if (var0 == -307694974) {
			var3.gr_fld = (Object[])var9;
		} else if (1428 == var0) {
			var3.gg_fld = (Object[])var9;
		} else if (var0 == 983733927) {
			var3.gc_fld = (Object[])var9;
		} else if (1430 == var0) {
			var3.fr_fld = (Object[])var9;
		} else if (1431 == var0) {
			var3.fi_fld = (Object[])var9;
		} else if (1434 == var0) {
			var3.gs_fld = (Object[])var9;
		} else if (var0 == 1435) {
			var3.fd_fld = (Object[])var9;
		} else {
			if (var0 < -583063784 || var0 > 1866322243) {
				return 2;
			}

			ld var8 = var3.bn((byte)12);
			if (null != var8) {
				if (var0 == 1436) {
					var8.ae_fld = (Object[])var9;
				} else if (477658264 == var0) {
					var8.ah_fld = (Object[])var9;
				} else if (var0 == -1088612671) {
					var8.aw_fld = (Object[])var9;
				} else if (var0 == 1439) {
					var8.av_fld = (Object[])var9;
				}
			}
		}

		var3.eh_fld = true;
		return 1;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Llu;IZLba;)V"
	)
	static void do_(lu var0, int var1, boolean var2, ba var3) {
		if (null == var0.ge_fld) {
			var0.ge_fld = new lu[var1 + 1];
		}

		if (var0.ge_fld.length <= var1) {
			lu[] var4 = new lu[1 + var1];
			System.arraycopy(var0.ge_fld, 0, var4, 0, var0.ge_fld.length);
			var0.ge_fld = var4;
		} else {
			lu var5 = var0.ge_fld[var1];
			if (null != var5) {
				if (var2) {
					throw new RuntimeException("");
				}

				hy.cz(var5, var0);
			}
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ek(int var0, ba var1, boolean var2) throws EOFException {
		lu var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		} else {
			var3 = var2 ? gs.ap_fld : ab_fld;
		}

		String var4 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var6 > 0) {
				var5 = new int[var6];

				while (var6-- > 0) {
					var5[var6] = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = (Object[])(new Object[var4.length() + 1]);

		for (int var7 = var9.length - 1; var7 >= 1; var7--) {
			switch (var4.charAt(var7 - 1)) {
				case 'W':
				case 'X':
				case 's':
					var9[var7] = ai_fld[(ef.aq_fld -= -211521517) * -836183525];
					break;
				case 'Ï':
					var9[var7] = new Long(an_fld[(db.aa_fld -= 432101741) * 867932261]);
					break;
				default:
					var9[var7] = new Integer(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			}
		}

		int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
		if (var10 != -1) {
			var9[0] = new Integer(var10);
		} else {
			var9 = null;
		}

		if (var0 == 1400) {
			var3.ej_fld = (Object[])var9;
		} else if (var0 == 1401) {
			var3.fo_fld = (Object[])var9;
		} else if (1402 == var0) {
			var3.fa_fld = (Object[])var9;
		} else if (1403 == var0) {
			var3.fp_fld = (Object[])var9;
		} else if (1404 == var0) {
			var3.fv_fld = (Object[])var9;
		} else if (1405 == var0) {
			var3.fj_fld = (Object[])var9;
		} else if (1406 == var0) {
			var3.fc_fld = (Object[])var9;
		} else if (1407 == var0) {
			var3.fh_fld = (Object[])var9;
			var3.fm_fld = var5;
		} else if (1408 == var0) {
			var3.fn_fld = (Object[])var9;
		} else if (var0 == 1409) {
			var3.ft_fld = (Object[])var9;
		} else if (1410 == var0) {
			var3.fb_fld = (Object[])var9;
		} else if (1411 == var0) {
			var3.fy_fld = (Object[])var9;
		} else if (1412 == var0) {
			var3.fx_fld = (Object[])var9;
		} else if (var0 == 1414) {
			var3.fe_fld = (Object[])var9;
			var3.fw_fld = var5;
		} else if (1415 == var0) {
			var3.fl_fld = (Object[])var9;
			var3.fg_fld = var5;
		} else if (1416 == var0) {
			var3.fk_fld = (Object[])var9;
		} else if (1417 == var0) {
			var3.fq_fld = (Object[])var9;
		} else if (var0 == 1418) {
			var3.fs_fld = (Object[])var9;
		} else if (var0 == 1419) {
			var3.fu_fld = (Object[])var9;
		} else if (var0 == 1420) {
			var3.fz_fld = (Object[])var9;
		} else if (1421 == var0) {
			var3.ff_fld = (Object[])var9;
		} else if (var0 == 1422) {
			var3.go_fld = (Object[])var9;
		} else if (var0 == 1423) {
			var3.gn_fld = (Object[])var9;
		} else if (var0 == 1424) {
			var3.gh_fld = (Object[])var9;
		} else if (1425 == var0) {
			var3.gj_fld = (Object[])var9;
		} else if (1426 == var0) {
			var3.gt_fld = (Object[])var9;
		} else if (var0 == 1427) {
			var3.gr_fld = (Object[])var9;
		} else if (1428 == var0) {
			var3.gg_fld = (Object[])var9;
		} else if (var0 == 1429) {
			var3.gc_fld = (Object[])var9;
		} else if (1430 == var0) {
			var3.fr_fld = (Object[])var9;
		} else if (1431 == var0) {
			var3.fi_fld = (Object[])var9;
		} else if (1434 == var0) {
			var3.gs_fld = (Object[])var9;
		} else if (var0 == 1435) {
			var3.fd_fld = (Object[])var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			ld var8 = var3.bn((byte)3);
			if (null != var8) {
				if (var0 == 1436) {
					var8.ae_fld = (Object[])var9;
				} else if (1437 == var0) {
					var8.ah_fld = (Object[])var9;
				} else if (var0 == 1438) {
					var8.aw_fld = (Object[])var9;
				} else if (var0 == 1439) {
					var8.av_fld = (Object[])var9;
				}
			}
		}

		var3.eh_fld = true;
		return 1;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ea(int var0, ba var1, boolean var2) {
		lu var3 = var2 ? gs.ap_fld : ab_fld;
		if (1500 == var0) {
			au_fld[(gz.ax_fld += 455687557) * -296084962 - 1] = 568226901 * var3.bq_fld;
			return 1;
		} else if (624551534 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * 1380771989 - 1] = var3.bg_fld;
			return 1;
		} else if (1379546399 == var0) {
			au_fld[(gz.ax_fld += 627404755) * -1112396085 - 1] = var3.bb_fld;
			return 1;
		} else if (1503 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cd_fld;
			return 1;
		} else if (var0 == 1504) {
			au_fld[(gz.ax_fld += 775527026) * 621889331 - 1] = var3.cf_fld ? 1 : 0;
			return 1;
		} else if (var0 == 452639563) {
			au_fld[(gz.ax_fld += 1817714425) * -429969581 - 1] = var3.cv_fld;
			return 1;
		} else if (var0 != 83631734) {
			return 2;
		} else {
			int var4 = var3.cv_fld * -755370309;
			if (var4 == -1) {
				uo var5 = cf.cg_fld;

				for (pk var6 = (pk)var5.ai_fld.aq(); null != var6; var6 = (pk)xz.aa(var5.ai_fld)) {
					if (var6.ak_fld == var3.bf_fld >> 16) {
						var4 = (int)var6.hc_fld;
						break;
					}
				}
			}

			au_fld[(gz.ax_fld += -1684678759) * -119205950 - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int im(int var0, ba var1) throws EOFException {
		if (var0 == 7500) {
			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var30 = he.cg(var24);
			int var34 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			yo var37 = bu.hv(var34);
			if (null == var37) {
				throw new RuntimeException();
			} else {
				int var40 = og.az(var34);
				bq.fz_fld = var37.az(var30, var40);
				if (bq.fz_fld != null) {
					client.gg_fld = mk.ak(var34);
					gq.ff_fld = bq.fz_fld.iterator();
					if (var0 == 7500) {
						au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bq.fz_fld.size();
					}
				} else {
					client.gg_fld = 1162640019;
					gq.ff_fld = null;
					if (7500 == var0) {
						au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					}
				}

				return 1;
			}
		} else if (7501 != var0) {
			if (var0 == 7502) {
				gz.ax_fld -= 3;
				int var23 = au_fld[gz.ax_fld];
				int var29 = au_fld[gz.ax_fld + 1];
				int var33 = au_fld[gz.ax_fld + 2];
				int var36 = mk.ak(var29);
				int var39 = my.ag(var29);
				int var42 = og.az(var29);
				yg var43 = ct.ag(var36);
				int[] var44 = var43.az_fld[var39];
				int var45 = 0;
				int var12 = var44.length;
				if (var23 == -1) {
					for (int var46 = var45; var46 < var12; var46++) {
						yq var47 = eu.ag(var44[var46], -2063262817);
						if (yq.az_fld == var47) {
							ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
						} else if (var47 == yq.ag_fld) {
							an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = -1L;
						} else {
							au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = me.ak(var44[var46]);
						}
					}

					return 1;
				} else {
					yl var13 = ot.ak(var23);
					if (var42 >= 0) {
						if (var42 >= var12) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var42 + ", Max: " + var12);
						}

						var45 = var42;
						var12 = 1 + var42;
					}

					Object[] var14 = (Object[])var13.az(var39, (byte)-44);
					if (var14 == null && var43.av_fld != null) {
						var14 = (Object[])var43.av_fld[var39];
					}

					if (null == var14) {
						for (int var48 = var45; var48 < var12; var48++) {
							int var49 = var44[var48];
							yq var50 = eu.ag(var49, -1925233027);
							if (yq.az_fld == var50) {
								ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
							} else {
								au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = me.ak(var49);
							}
						}

						return 1;
					} else {
						int var15 = var14.length / var44.length;
						if (var33 >= 0 && var33 < var15) {
							for (int var16 = var45; var16 < var12; var16++) {
								int var17 = var44.length * var33 + var16;
								yq var18 = eu.ag(var44[var16], -2127135414);
								if (yq.az_fld == var18) {
									ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14[var17];
								} else {
									au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				}
			} else if (7503 == var0) {
				gz.ax_fld -= 2;
				int var22 = au_fld[gz.ax_fld];
				int var28 = au_fld[gz.ax_fld + 1];
				int var32 = 0;
				int var35 = mk.ak(var28);
				int var38 = my.ag(var28);
				yl var41 = ot.ak(var22);
				yg var9 = ct.ag(var35);
				int[] var10 = var9.az_fld[var38];
				Object[] var11 = (Object[])var41.az(var38, (byte)58);
				if (null == var11 && var9.av_fld != null) {
					var11 = (Object[])var9.av_fld[var38];
				}

				if (var11 != null) {
					var32 = var11.length / var10.length;
				}

				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32;
				return 1;
			} else if (var0 == 7504) {
				gz.ax_fld--;
				int var21 = au_fld[gz.ax_fld];
				yo var27 = me.ha(var21);
				if (null == var27) {
					throw new RuntimeException();
				} else {
					bq.fz_fld = var27.az(0, 0);
					int var31 = 0;
					if (null != bq.fz_fld) {
						client.gg_fld = var21;
						gq.ff_fld = bq.fz_fld.iterator();
						var31 = bq.fz_fld.size();
					}

					if (var0 == 7504) {
						au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var31;
					}

					return 1;
				}
			} else if (var0 == 7505) {
				int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				yl var26 = ot.ak(var20);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var26.ae_fld;
				return 1;
			} else if (var0 == 7506) {
				int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var25 = -1;
				if (bq.fz_fld != null && var19 >= 0 && var19 < bq.fz_fld.size()) {
					var25 = (Integer)bq.fz_fld.get(var19);
				}

				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var25;
				return 1;
			} else if (var0 == 7507) {
				int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				Object var4 = he.cg(var3);
				int var5 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				yo var6 = bu.hv(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (mk.ak(var5) != client.gg_fld) {
					throw new RuntimeException();
				} else if (null == bq.fz_fld && bq.fz_fld.isEmpty()) {
					throw new RuntimeException();
				} else {
					int var7 = og.az(var5);
					List var8 = var6.az(var4, var7);
					bq.fz_fld = new LinkedList(bq.fz_fld);
					if (null != var8) {
						bq.fz_fld.retainAll(var8);
					} else {
						bq.fz_fld.clear();
					}

					gq.ff_fld = bq.fz_fld.iterator();
					if (var0 == 7507) {
						au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bq.fz_fld.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (null != gq.ff_fld && gq.ff_fld.hasNext()) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (Integer)gq.ff_fld.next();
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ey(int var0, ba var1, boolean var2) {
		lu var3 = var2 ? gs.ap_fld : ab_fld;
		if (1459116190 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * 1061543350 - 1] = 781900126 * var3.cp_fld;
			return 1;
		} else if (var0 == 1601) {
			au_fld[(gz.ax_fld += -1684678759) * -1173562487 - 1] = var3.ce_fld;
			return 1;
		} else if (1602 == var0) {
			if (12 == var3.bx_fld) {
				li var24 = lu.bv(var3, -1094742564);
				if (null != var24) {
					ai_fld[(ef.aq_fld += -1429056063) * 1420179353 - 1] = var24.bc().ah();
					return 1;
				}
			}

			ai_fld[(ef.aq_fld += -211521517) * 427901230 - 1] = var3.dp_fld;
			return 1;
		} else if (544804805 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cn_fld;
			return 1;
		} else if (var0 == 730175071) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1219170377 * var3.cr_fld;
			return 1;
		} else if (1605 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * 1796667147 - 1] = var3.db_fld * 313503265;
			return 1;
		} else if (1606 == var0) {
			au_fld[(gz.ax_fld += 1999105565) * -776631127 - 1] = var3.dx_fld;
			return 1;
		} else if (1607 == var0) {
			au_fld[(gz.ax_fld += 616656719) * -776631127 - 1] = var3.du_fld;
			return 1;
		} else if (var0 == 1303847700) {
			au_fld[(gz.ax_fld += -1684678759) * 333335378 - 1] = 996231790 * var3.ds_fld;
			return 1;
		} else if (193776038 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -3100127 - 1] = var3.cb_fld * 157961810;
			return 1;
		} else if (var0 == 1610) {
			au_fld[(gz.ax_fld += -1162730120) * 415774679 - 1] = var3.co_fld;
			return 1;
		} else if (var0 == 1611) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -12872348 * var3.ca_fld;
			return 1;
		} else if (677332996 == var0) {
			au_fld[(gz.ax_fld += 1104383979) * -776631127 - 1] = var3.cg_fld * -1237644186;
			return 1;
		} else if (var0 == 845431215) {
			au_fld[(gz.ax_fld += 1912691674) * -776631127 - 1] = var3.ck_fld.ag(1403293838);
			return 1;
		} else if (var0 == 1614) {
			au_fld[(gz.ax_fld += 249841829) * -776631127 - 1] = var3.dn_fld ? 1 : 0;
			return 1;
		} else {
			if (1617 == var0) {
				ln var4 = var3.bi(283091394);
				au_fld[(gz.ax_fld += 2071809531) * -776631127 - 1] = var4 != null ? var4.ak_fld : 0;
			}

			if (var0 == -994994124) {
				ln var23 = var3.bi(1232602653);
				au_fld[(gz.ax_fld += -1684678759) * 1859536524 - 1] = var23 != null ? var23.ag_fld : 0;
				return 1;
			} else if (var0 == 1619) {
				li var22 = lu.bv(var3, -1040565795);
				ai_fld[(ef.aq_fld += 1105816516) * -836183525 - 1] = null != var22 ? var22.bw().ah() : "";
				return 1;
			} else if (1620 == var0) {
				ln var21 = var3.bi(1901100099);
				au_fld[(gz.ax_fld += 820776277) * -776631127 - 1] = null != var21 ? var21.az_fld : 0;
				return 1;
			} else if (1392053608 == var0) {
				li var20 = lu.bv(var3, -1256348378);
				au_fld[(gz.ax_fld += 946847293) * -776631127 - 1] = null != var20 ? var20.cf() : 0;
				return 1;
			} else if (1622 == var0) {
				li var19 = lu.bv(var3, -1608740992);
				au_fld[(gz.ax_fld += 1912298556) * 1882936579 - 1] = var19 != null ? var19.cx() : 0;
				return 1;
			} else if (1623 == var0) {
				li var18 = lu.bv(var3, -785202761);
				au_fld[(gz.ax_fld += -1684678759) * 217496557 - 1] = var18 != null ? li.ih(var18, (byte)5) : 0;
				return 1;
			} else if (1624 == var0) {
				li var17 = lu.bv(var3, -1672410490);
				au_fld[(gz.ax_fld += 97503500) * -776631127 - 1] = var17 != null && li.vk(var17, (byte)65) ? 1 : 0;
				return 1;
			} else if (-1548272894 != var0) {
				if (var0 == 1626) {
					li var16 = lu.bv(var3, -740243636);
					ai_fld[(ef.aq_fld += -928965226) * 1685564537 - 1] = var16 != null ? var16.ba().ak() : "";
					return 1;
				} else if (var0 == 1627) {
					li var15 = lu.bv(var3, -2029578443);
					int var5 = null != var15 ? var15.cc() : 0;
					int var6 = var15 != null ? li.dg(var15, (byte)-110) : 0;
					au_fld[(gz.ax_fld += -513466892) * -776631127 - 1] = Math.min(var5, var6);
					au_fld[(gz.ax_fld += -1066397439) * -200268790 - 1] = Math.max(var5, var6);
					return 1;
				} else if (1628 == var0) {
					li var14 = lu.bv(var3, -1077786874);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var14 ? li.dg(var14, (byte)23) : 0;
					return 1;
				} else if (458762755 == var0) {
					li var13 = lu.bv(var3, -735314092);
					au_fld[(gz.ax_fld += -1433155011) * -1987545916 - 1] = var13 != null ? var13.cn() : 0;
					return 1;
				} else if (-1367064459 == var0) {
					li var12 = lu.bv(var3, -1908927852);
					au_fld[(gz.ax_fld += -1684678759) * 1889667690 - 1] = null != var12 ? var12.cp() : 0;
					return 1;
				} else if (var0 == 1631) {
					li var11 = lu.bv(var3, -1853411823);
					au_fld[(gz.ax_fld += -1455105623) * -776631127 - 1] = var11 != null ? li.rz(var11, (byte)89) : 0;
					return 1;
				} else if (var0 == 1632) {
					li var10 = lu.bv(var3, -494076397);
					au_fld[(gz.ax_fld += -295469198) * -400904288 - 1] = var10 != null ? var10.cg() : 0;
					return 1;
				} else if (2094649406 == var0) {
					sc var9 = var3.bu(148126276);
					au_fld[gz.ax_fld - 1] = null != var9 ? sc.ed(var9, au_fld[gz.ax_fld - 1]) : 0;
					return 1;
				} else if (1634 == var0) {
					sc var8 = var3.bu(1370365004);
					au_fld[gz.ax_fld - 1] = var8 != null ? var8.av((char)au_fld[gz.ax_fld - 1]) : 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				li var7 = lu.bv(var3, -1864880268);
				au_fld[(gz.ax_fld += -721385045) * -1027173459 - 1] = null != var7 && var7.bg() ? 1 : 0;
				return 1;
			}
		}
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(Llu;Z)V"
	)
	static void di(lu var0, boolean var1) {
		if (null != var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			if (var1) {
				gs.ap_fld = var0;
			} else {
				ab_fld = var0;
			}
		} else {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(ILlu;Llu;)Llu;"
	)
	static lu du(int var0, lu var1, lu var2) {
		int var3 = 0;
		lu var4 = null;

		for (int var5 = var2.by_fld + 1; var5 < var1.ge_fld.length; var5++) {
			lu var6 = var1.ge_fld[var5];
			if (null != var6 && var6.cy_fld == var2.by_fld) {
				if (++var3 - 1 == var0) {
					var4 = var6;
					break;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	static int eh(lu var0) {
		if (11 != var0.bx_fld) {
			ef.aq_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			return 1;
		} else {
			String var1 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.fk(var0, var1, 1066778202);
			return 1;
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	static int eu(lu var0) {
		if (var0.bx_fld != 11) {
			ai_fld[ef.aq_fld - 1] = "";
			return 1;
		} else {
			String var1 = (String)ai_fld[(ef.aq_fld -= -211521517) * -1446044125];
			ai_fld[(ef.aq_fld += -211521517) * -587372267 - 1] = var0.bk(var1, (short)-16629);
			return 1;
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ej(int var0, ba var1, boolean var2) {
		lu var3 = var2 ? gs.ap_fld : ab_fld;
		if (var0 == 1800) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = nt.ag(uo.sa(cf.cg_fld, var3, 1963432945));
			return 1;
		} else if (1801 != var0) {
			if (var0 == 1802) {
				if (var3.eq_fld == null) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				} else {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.eq_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var4--;
			if (null != var3.ei_fld && var4 < var3.ei_fld.length && null != var3.ei_fld[var4]) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.ei_fld[var4];
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int fy(int var0, ba var1, boolean var2) {
		lu var3 = var2 ? gs.ap_fld : ab_fld;
		if (var0 == 1800) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = nt.ag(uo.sa(cf.cg_fld, var3, 2057497660));
			return 1;
		} else if (1801 != var0) {
			if (var0 == 1802) {
				if (var3.eq_fld == null) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				} else {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.eq_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var4--;
			if (null != var3.ei_fld && var4 < var3.ei_fld.length && null != var3.ei_fld[var4]) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.ei_fld[var4];
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int fa(int var0, ba var1, boolean var2) throws EOFException {
		if (1927 != var0 && var0 != 2927) {
			if (var0 == 1928) {
				lu var11 = var2 ? gs.ap_fld : ab_fld;
				int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (var14 >= 1 && var14 <= 10) {
					dg var16 = new dg(var14, var11.bf_fld, var11.by_fld, var11.ga_fld);
					bz_fld.add(var16);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				gz.ax_fld -= 3;
				int var10 = au_fld[gz.ax_fld];
				int var13 = au_fld[1 + gz.ax_fld];
				int var15 = au_fld[gz.ax_fld + 2];
				if (var15 >= 1 && var15 <= 10) {
					lu var17 = cf.cg_fld.ag(var10, var13, 1601648962);
					if (var17 == null) {
						throw new RuntimeException();
					} else {
						dg var19 = new dg(var15, var10, var13, var17.ga_fld);
						bz_fld.add(var19);
						return 1;
					}
				} else {
					throw new RuntimeException();
				}
			} else if (2929 == var0) {
				Object[] var9 = (Object[])ni.bm();
				gz.ax_fld -= 3;
				int var12 = au_fld[gz.ax_fld];
				int var5 = au_fld[gz.ax_fld + 1];
				int var6 = au_fld[gz.ax_fld + 2];
				byte var7 = -1;
				lu var8 = cf.cg_fld.ag(var5, var6, -619139843);
				if (var8 != null) {
					int var18 = var8.ga_fld;
					fp.fh(var5, var6, var18, var12, (Object[])var9, (byte)-80);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (br_fld >= 10) {
			throw new RuntimeException();
		} else {
			lu var3;
			if (var0 >= 2000) {
				var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			} else {
				var3 = var2 ? gs.ap_fld : ab_fld;
			}

			if (var3.gr_fld == null) {
				return 0;
			} else {
				yz var4 = yb.jc(tu.ak(var3).av((Object[])var3.gr_fld, 1125767117), br_fld + 1).ax(-1098637582);
				client.cz_fld.ak(var4);
				return 1;
			}
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ge(int var0, ba var1) throws EOFException {
		if (var0 == 4200) {
			int var26 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kb.ag(var26, -1752383175).dx_fld;
			return 1;
		} else if (var0 == 4201) {
			gz.ax_fld -= 2;
			int var25 = au_fld[gz.ax_fld];
			int var35 = au_fld[1 + gz.ax_fld];
			og var37 = kb.ag(var25, -1752383175);
			if (var35 >= 1 && var35 <= 5 && var37.ak(-2139788883).ag(var35 - 1, -1395072882)) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var37.ak(-2139788883).ae(var35 - 1, rt.ag_fld, 1899227782);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 4202) {
			gz.ax_fld -= 2;
			int var24 = au_fld[gz.ax_fld];
			int var34 = au_fld[gz.ax_fld + 1];
			og var36 = kb.ag(var24, -1752383175);
			if (var34 >= 1 && var34 <= 5 && null != var36.ex_fld[var34 - 1]) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var36.ex_fld[var34 - 1];
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (4222 == var0) {
			gz.ax_fld -= 3;
			int var23 = au_fld[gz.ax_fld];
			int var33 = au_fld[1 + gz.ax_fld];
			int var5 = au_fld[2 + gz.ax_fld];
			og var6 = kb.ag(var23, -1752383175);
			String var7 = null;
			if (var33 >= 1
				&& var33 <= 5
				&& null != var6.ex_fld[var33 - 1]
				&& var6.eo_fld != null
				&& null != var6.eo_fld[var33 - 1]
				&& var5 >= 1
				&& var5 <= var6.eo_fld[var33 - 1].length) {
				var7 = var6.eo_fld[var33 - 1][var5 - 1];
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var7 ? var7 : "";
			return 1;
		} else if (4203 == var0) {
			int var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var22, -1752383175).es_fld * -1489673433;
			return 1;
		} else if (4204 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var21, -1752383175).dj_fld * -2061559521 == 1 ? 1 : 0;
			return 1;
		} else if (var0 == 4205) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var32 = kb.ag(var20, -1752383175);
			if (-1 == var32.eg_fld && var32.en_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32.en_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var20;
			}

			return 1;
		} else if (var0 == 4206) {
			int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var31 = kb.ag(var19, -1752383175);
			if (var31.eg_fld >= 0 && var31.en_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var31.en_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var19;
			}

			return 1;
		} else if (4207 == var0) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var18, -1752383175).et_fld ? 1 : 0;
			return 1;
		} else if (var0 == 4208) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var30 = kb.ag(var17, -1752383175);
			if (var30.fa_fld == -1 && var30.fy_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var30.fy_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17;
			}

			return 1;
		} else if (4209 == var0) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var29 = kb.ag(var16, -1752383175);
			if (var29.fa_fld >= 0 && var29.fy_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var29.fy_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16;
			}

			return 1;
		} else if (var0 == 4210) {
			String var15 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var28 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			my.hb(var15, var28 == 1);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ey.gn_fld;
			return 1;
		} else if (var0 != 4211) {
			if (var0 == 4212) {
				tv.go_fld = 0;
				return 1;
			} else if (var0 == 4213) {
				int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var27 = kb.ag(var14, -1752383175).ap(-1759425067);
				if (var27 == -1) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27 + 1;
				}

				return 1;
			} else if (var0 == 4214) {
				int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var13, -1752383175).ep_fld * -616953337;
				return 1;
			} else if (var0 == 4215) {
				int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var12, -1752383175).eb_fld * 681741211;
				return 1;
			} else if (var0 == 4216) {
				int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var11, -1752383175).ed_fld * -1990169435;
				return 1;
			} else if (var0 == 4217) {
				int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				og var4 = kb.ag(var10, -1752383175);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ev_fld;
				return 1;
			} else if (4218 == var0) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kb.ag(var9, -1752383175).ds_fld;
				return 1;
			} else if (4219 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var8, -1752383175).ec_fld * 622243963;
				return 1;
			} else if (var0 == 4220) {
				int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var3, -1752383175).em_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			if (in.gc_fld != null && tv.go_fld < ey.gn_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = in.gc_fld[(tv.go_fld += -1770817561) * 1924770775 - 1] & '\uffff';
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	static Object[] fp() {
		String var0 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
		Object[] var1 = (Object[])(new Object[var0.length()]);

		for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
			if (var0.charAt(var2) == 'i') {
				var1[var2] = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			} else {
				var1[var2] = ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			}
		}

		return (Object[])var1;
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ff(int var0, ba var1) {
		if (var0 == 3500) {
			int var5 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ay(var5) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.as(var4) ? 1 : 0;
			return 1;
		} else if (3502 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ar(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fv(int var0, ba var1) throws EOFException {
		lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		if (2500 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bq_fld;
			return 1;
		} else if (2501 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bg_fld;
			return 1;
		} else if (2502 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bb_fld;
			return 1;
		} else if (2503 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cd_fld;
			return 1;
		} else if (2504 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cf_fld ? 1 : 0;
			return 1;
		} else if (2505 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cv_fld;
			return 1;
		} else if (2506 != var0) {
			return 2;
		} else {
			int var4 = var3.cv_fld;
			if (-1 == var4) {
				uo var5 = cf.cg_fld;

				for (pk var6 = (pk)var5.ai_fld.aq(); var6 != null; var6 = (pk)xz.aa(var5.ai_fld)) {
					if (var3.bf_fld >> 16 == var6.ak_fld) {
						var4 = (int)var6.hc_fld;
						break;
					}
				}
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fj(int var0, ba var1) throws EOFException {
		lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * 255882609]);
		if (2500 == var0) {
			au_fld[(gz.ax_fld += -1464768873) * -1636920983 - 1] = var3.bq_fld * -1330860283;
			return 1;
		} else if (-2033682834 == var0) {
			au_fld[(gz.ax_fld += -1738717971) * 1800791410 - 1] = 16524117 * var3.bg_fld;
			return 1;
		} else if (1220051858 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1605517478 * var3.bb_fld;
			return 1;
		} else if (-2081431357 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -397793368 - 1] = var3.cd_fld;
			return 1;
		} else if (2504 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cf_fld ? 1 : 0;
			return 1;
		} else if (1277987373 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cv_fld;
			return 1;
		} else if (-1623402570 != var0) {
			return 2;
		} else {
			int var4 = var3.cv_fld;
			if (-1 == var4) {
				uo var5 = cf.cg_fld;

				for (pk var6 = (pk)var5.ai_fld.aq(); var6 != null; var6 = (pk)xz.aa(var5.ai_fld)) {
					if (var3.bf_fld >> 16 == var6.ak_fld) {
						var4 = (int)var6.hc_fld;
						break;
					}
				}
			}

			au_fld[(gz.ax_fld += -1684678759) * -1181545021 - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Llu;IZLba;)V"
	)
	static void dt(lu var0, int var1, boolean var2, ba var3) {
		if (null == var0.ge_fld) {
			var0.ge_fld = new lu[var1 + 1];
		}

		if (var0.ge_fld.length <= var1) {
			lu[] var4 = new lu[1 + var1];
			System.arraycopy(var0.ge_fld, 0, var4, 0, var0.ge_fld.length);
			var0.ge_fld = var4;
		} else {
			lu var5 = var0.ge_fld[var1];
			if (null != var5) {
				if (var2) {
					throw new RuntimeException("");
				}

				hy.cz(var5, var0);
			}
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fk(int var0, ba var1) throws EOFException {
		lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		if (2600 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cp_fld;
			return 1;
		} else if (2601 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ce_fld;
			return 1;
		} else if (var0 == 2602) {
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.dp_fld;
			return 1;
		} else if (2603 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cn_fld;
			return 1;
		} else if (2604 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cr_fld;
			return 1;
		} else if (2605 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.db_fld;
			return 1;
		} else if (var0 == 2606) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.dx_fld;
			return 1;
		} else if (var0 == 2607) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.du_fld;
			return 1;
		} else if (2608 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ds_fld;
			return 1;
		} else if (var0 == 2609) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cb_fld;
			return 1;
		} else if (2610 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.co_fld;
			return 1;
		} else if (2611 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ca_fld;
			return 1;
		} else if (var0 == 2612) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cg_fld;
			return 1;
		} else if (var0 == 2613) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ck_fld.ag(-707677530);
			return 1;
		} else if (2614 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.dn_fld ? 1 : 0;
			return 1;
		} else {
			if (2617 == var0) {
				ln var4 = var3.bi(-106922941);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var4 ? var4.ak_fld : 0;
			}

			if (2618 == var0) {
				ln var23 = var3.bi(1057234861);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var23 != null ? var23.ag_fld : 0;
				return 1;
			} else if (2619 == var0) {
				li var22 = lu.bv(var3, -1100017296);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var22 != null ? var22.bw().ah() : "";
				return 1;
			} else if (var0 == 2620) {
				ln var21 = var3.bi(-207763122);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var21 ? var21.az_fld : 0;
				return 1;
			} else if (2621 == var0) {
				li var20 = lu.bv(var3, -1655683220);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var20 ? var20.cf() : 0;
				return 1;
			} else if (var0 == 2622) {
				li var19 = lu.bv(var3, -835732076);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var19 ? var19.cx() : 0;
				return 1;
			} else if (var0 == 2623) {
				li var18 = lu.bv(var3, -778471667);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var18 ? li.ih(var18, (byte)5) : 0;
				return 1;
			} else if (var0 == 2624) {
				li var17 = lu.bv(var3, -1075891757);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17 != null && li.vk(var17, (byte)40) ? 1 : 0;
				return 1;
			} else if (var0 != 2625) {
				if (2626 == var0) {
					li var16 = lu.bv(var3, -968636289);
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var16 ? var16.ba().ak() : "";
					return 1;
				} else if (2627 == var0) {
					li var15 = lu.bv(var3, -2057571457);
					int var5 = var15 != null ? var15.cc() : 0;
					int var6 = null != var15 ? li.dg(var15, (byte)74) : 0;
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Math.min(var5, var6);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Math.max(var5, var6);
					return 1;
				} else if (var0 == 2628) {
					li var14 = lu.bv(var3, -1734315993);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var14 ? li.dg(var14, (byte)17) : 0;
					return 1;
				} else if (var0 == 2629) {
					li var13 = lu.bv(var3, -1569080050);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var13 ? var13.cn() : 0;
					return 1;
				} else if (var0 == 2630) {
					li var12 = lu.bv(var3, -1053157426);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12 != null ? var12.cp() : 0;
					return 1;
				} else if (var0 == 2631) {
					li var11 = lu.bv(var3, -636976145);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var11 != null ? li.rz(var11, (byte)92) : 0;
					return 1;
				} else if (var0 == 2632) {
					li var10 = lu.bv(var3, -1961312160);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var10 != null ? var10.cg() : 0;
					return 1;
				} else if (var0 == 2633) {
					sc var9 = var3.bu(-349190191);
					au_fld[gz.ax_fld - 1] = null != var9 ? sc.ed(var9, au_fld[gz.ax_fld - 1]) : 0;
					return 1;
				} else if (var0 == 2634) {
					sc var8 = var3.bu(1693961831);
					au_fld[gz.ax_fld - 1] = var8 != null ? var8.av((char)au_fld[gz.ax_fld - 1]) : 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				li var7 = lu.bv(var3, -2108976732);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var7 && var7.bg() ? 1 : 0;
				return 1;
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fx(int var0, ba var1) throws EOFException {
		lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		if (2500 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bq_fld;
			return 1;
		} else if (2501 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bg_fld;
			return 1;
		} else if (2502 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bb_fld;
			return 1;
		} else if (2503 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cd_fld;
			return 1;
		} else if (2504 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cf_fld ? 1 : 0;
			return 1;
		} else if (2505 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cv_fld;
			return 1;
		} else if (2506 != var0) {
			return 2;
		} else {
			int var4 = var3.cv_fld;
			if (-1 == var4) {
				uo var5 = cf.cg_fld;

				for (pk var6 = (pk)var5.ai_fld.aq(); var6 != null; var6 = (pk)xz.aa(var5.ai_fld)) {
					if (var3.bf_fld >> 16 == var6.ak_fld) {
						var4 = (int)var6.hc_fld;
						break;
					}
				}
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Llu;I[B[B)V"
	)
	static final void ez(lu var0, int var1, byte[] var2, byte[] var3) {
		if (null == var0.er_fld) {
			if (var2 == null) {
				return;
			}

			var0.er_fld = new byte[11][];
			var0.en_fld = new byte[11][];
			var0.eg_fld = new int[11];
			var0.ef_fld = new int[11];
		}

		var0.er_fld[var1] = var2;
		if (var2 != null) {
			var0.ez_fld = true;
		} else {
			var0.ez_fld = false;

			for (int var4 = 0; var4 < var0.er_fld.length; var4++) {
				if (null != var0.er_fld[var4]) {
					var0.ez_fld = true;
					break;
				}
			}
		}

		var0.en_fld[var1] = var3;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fm(int var0, ba var1) throws EOFException {
		if (var0 == 2700) {
			lu var13 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var13.ga_fld;
			return 1;
		} else if (2701 == var0) {
			lu var12 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			if (var12.ga_fld != -1) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12.gd_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2702) {
			int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			pk var15 = (pk)cf.cg_fld.ai_fld.ak(var11);
			if (null != var15) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2703) {
			gz.ax_fld -= 3;
			int var10 = au_fld[gz.ax_fld];
			lu var14 = cf.cg_fld.ag(au_fld[1 + gz.ax_fld], au_fld[2 + gz.ax_fld], -2142233323);
			px var16 = kb.ag_px(var10, -1328755437);
			if (var16.aw()) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14.ao(var10, var16.as_fld, -2072922369);
			} else if (px.ll(var16, (short)10000)) {
				an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var14.ap(var10, var16.ay_fld);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.jj(var14, var10, var16.aw_fld);
			}

			return 1;
		} else if (var0 == 2704) {
			gz.ax_fld -= 3;
			lu var9 = cf.cg_fld.ag(au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], 1425765348);
			int var4 = au_fld[2 + gz.ax_fld];
			Object var5 = he.cg(var4);
			int var6 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var9.at(var6, var5, 583965381);
			return 1;
		} else if (2706 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cf.cg_fld.aa_fld;
			return 1;
		} else if (var0 == 2707) {
			lu var8 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.qz(var8, 1394782264) ? 1 : 0;
			return 1;
		} else if (2708 == var0) {
			lu var7 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			return ap(var7);
		} else if (2709 == var0) {
			lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			return ag.at(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;)V"
	)
	static void jz(lu var0, lu var1) {
		if (var0.bx_fld == 0) {
			for (int var2 = var0.cx_fld * 43402503; var2 <= var0.cs_fld; var2++) {
				lu var3 = var1.ge_fld[var2];
				if (null != var3 && var3.cy_fld == var0.by_fld) {
					hy.cz(var3, var1);
				}
			}
		}

		var1.ge_fld[var0.by_fld * -604657077] = null;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int fo(int var0, ba var1, boolean var2) throws EOFException {
		if (1927 != var0 && var0 != -255822848) {
			if (var0 == 1928) {
				lu var11 = var2 ? gs.ap_fld : ab_fld;
				int var14 = au_fld[(gz.ax_fld -= -1832474300) * -776631127];
				if (var14 >= 1 && var14 <= 10) {
					dg var16 = new dg(var14, -1684494346 * var11.bf_fld, var11.by_fld * -1831844510, -231461391 * var11.ga_fld);
					bz_fld.add(var16);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2072535597) {
				gz.ax_fld -= 3;
				int var10 = au_fld[gz.ax_fld * 1500815673];
				int var13 = au_fld[1 + gz.ax_fld];
				int var15 = au_fld[gz.ax_fld + 2];
				if (var15 >= 1 && var15 <= 10) {
					lu var17 = cf.cg_fld.ag(var10, var13, -297319775);
					if (var17 == null) {
						throw new RuntimeException();
					} else {
						dg var19 = new dg(var15, var10, var13, -1276269419 * var17.ga_fld);
						bz_fld.add(var19);
						return 1;
					}
				} else {
					throw new RuntimeException();
				}
			} else if (2929 == var0) {
				Object[] var9 = (Object[])ni.bm();
				gz.ax_fld -= -323515393;
				int var12 = au_fld[gz.ax_fld];
				int var5 = au_fld[gz.ax_fld + 1];
				int var6 = au_fld[gz.ax_fld + 2];
				byte var7 = -1;
				lu var8 = cf.cg_fld.ag(var5, var6, -74059130);
				if (var8 != null) {
					int var18 = var8.ga_fld;
					fp.fh(var5, var6, var18, var12, (Object[])var9, (byte)-98);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (br_fld >= 10) {
			throw new RuntimeException();
		} else {
			lu var3;
			if (var0 >= -29550518) {
				var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1631082168) * 985432634]);
			} else {
				var3 = var2 ? gs.ap_fld : ab_fld;
			}

			if (var3.gr_fld == null) {
				return 0;
			} else {
				yz var4 = yb.jc(tu.ak(var3).av((Object[])var3.gr_fld, 1104613283), br_fld + 1).ax(-1972995976);
				client.cz_fld.ak(var4);
				return 1;
			}
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fl(int var0, ba var1) throws EOFException {
		lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= 317288613) * -1299978598]);
		if (var0 == 2800) {
			au_fld[(gz.ax_fld += 463693274) * 1123277904 - 1] = nt.ag(uo.sa(cf.cg_fld, var3, 1564680404));
			return 1;
		} else if (2110144922 != var0) {
			if (var0 == 2802) {
				if (null == var3.eq_fld) {
					ai_fld[(ef.aq_fld += 1747025869) * -836183525 - 1] = "";
				} else {
					ai_fld[(ef.aq_fld += 1027984989) * -836183525 - 1] = var3.eq_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = au_fld[(gz.ax_fld -= 92071364) * -776631127];
			var4--;
			if (var3.ei_fld != null && var4 < var3.ei_fld.length && null != var3.ei_fld[var4]) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.ei_fld[var4];
			} else {
				ai_fld[(ef.aq_fld += -211521517) * 449786702 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int fg(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == 3100) {
			String var22 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			io.ag(0, "", var22);
			return 1;
		} else if (3101 == var0) {
			gz.ax_fld -= 2;
			cg.cv(ot.ef(), au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], -340720662);
			return 1;
		} else if (3103 == var0) {
			if (!bd_fld) {
				bm_fld = true;
			}

			return 1;
		} else if (var0 == 3104) {
			String var21 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var30 = 0;
			if (dz.ag(var21)) {
				var30 = tf.av(var21);
			}

			jm var33 = gi.ak(jb.do_fld, client.aq_fld.av_fld);
			xi.ld(var33.ay_fld, var30, (byte)120);
			client.aq_fld.az(var33);
			return 1;
		} else if (3105 == var0) {
			String var20 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			jm var29 = gi.ak(jb.bz_fld, client.aq_fld.av_fld);
			var29.ay_fld.bc(var20.length() + 1);
			var29.ay_fld.cc(var20, 1048056919);
			client.aq_fld.az(var29);
			return 1;
		} else if (var0 == 3106) {
			String var19 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			jm var28 = gi.ak(jb.cd_fld, client.aq_fld.av_fld);
			var28.ay_fld.bc(var19.length() + 1);
			var28.ay_fld.cc(var19, -203364073);
			client.aq_fld.az(var28);
			return 1;
		} else if (var0 == 3107) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			String var27 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			qk.fv(var18, var27, 966695779);
			return 1;
		} else if (var0 == 3108) {
			gz.ax_fld -= 3;
			int var17 = au_fld[gz.ax_fld];
			int var26 = au_fld[1 + gz.ax_fld];
			int var32 = au_fld[gz.ax_fld + 2];
			lu var35 = cf.cg_fld.ak(var32);
			if (!client.ng_fld && cf.cg_fld.br(var35, var17, var26)) {
				ot.ft();
			}

			return 1;
		} else if (var0 == 3109) {
			gz.ax_fld -= 2;
			int var16 = au_fld[gz.ax_fld];
			int var25 = au_fld[1 + gz.ax_fld];
			lu var31 = var2 ? gs.ap_fld : ab_fld;
			if (!client.ng_fld && cf.cg_fld.br(var31, var16, var25)) {
				ot.ft();
			}

			return 1;
		} else if (3110 == var0) {
			gu.hh_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (var0 == 3111) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cx.kq_fld.ae((byte)13) ? 1 : 0;
			return 1;
		} else if (var0 == 3112) {
			cx.kq_fld.ah(au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1, (byte)110);
			return 1;
		} else if (3113 == var0) {
			String var15 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld--;
			by.ak(var15);
			return 1;
		} else if (var0 == 3114) {
			String var14 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			long var24 = 0L;
			if (io.az(var14)) {
				var24 = gj.aw(var14);
			}

			jm var34 = gi.ak(jb.cu_fld, client.aq_fld.av_fld);
			var34.ay_fld.fn(var24);
			client.aq_fld.az(var34);
			return 1;
		} else if (var0 == 3115) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			jm var23 = gi.ak(jb.ex_fld, client.aq_fld.av_fld);
			var23.ay_fld.bw(var13);
			client.aq_fld.az(var23);
			return 1;
		} else if (3116 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ef.aq_fld -= 2;
			String var4 = (String)ai_fld[ef.aq_fld];
			String var5 = (String)ai_fld[ef.aq_fld + 1];
			if (var4.length() > 500) {
				return 1;
			} else if (var5.length() > 500) {
				return 1;
			} else {
				jm var6 = gi.ak(jb.ba_fld, client.aq_fld.av_fld);
				var6.ay_fld.bw(1 + iq.bu(var4) + iq.bu(var5));
				var6.ay_fld.cc(var5, 1937685198);
				xi.rs(var6.ay_fld, var12);
				var6.ay_fld.cc(var4, -40218751);
				client.aq_fld.az(var6);
				return 1;
			}
		} else if (3117 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (var0 == 3118) {
			client.ei_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (3119 == var0) {
			client.ec_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (3120 == var0) {
			if (au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
				client.ez_fld |= 959732103;
			} else {
				client.ez_fld &= -1919464206;
			}

			return 1;
		} else if (var0 == 3121) {
			if (au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
				client.ez_fld |= 1919464206;
			} else {
				client.ez_fld = 165289015 * (client.ez_fld & -3);
			}

			return 1;
		} else if (var0 == 3122) {
			if (au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
				client.ez_fld = 165289015 * (client.ez_fld | 4);
			} else {
				client.ez_fld &= -503693219;
			}

			return 1;
		} else if (var0 == 3123) {
			if (au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
				client.ez_fld = 165289015 * (client.ez_fld | 8);
			} else {
				client.ez_fld &= -47654335;
			}

			return 1;
		} else if (var0 == 3124) {
			client.ez_fld = 0;
			return 1;
		} else if (var0 == 3125) {
			client.df_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (3126 == var0) {
			client.dp_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (var0 == 3127) {
			rh.gg(au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1);
			return 1;
		} else if (var0 == 3128) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bf.gc() ? 1 : 0;
			return 1;
		} else if (var0 == 3129) {
			gz.ax_fld -= 2;
			client.di_fld = au_fld[gz.ax_fld];
			client.dn_fld = -868002529 * au_fld[1 + gz.ax_fld];
			return 1;
		} else if (var0 == 3130) {
			gz.ax_fld -= 2;
			return 1;
		} else if (3131 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (var0 == 3132) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = pf.qw_fld;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bc.qx_fld;
			return 1;
		} else if (3133 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (var0 == 3134) {
			return 1;
		} else if (3135 == var0) {
			gz.ax_fld -= 2;
			return 1;
		} else if (var0 == 3136) {
			cf.cg_fld.ap_fld = -930786535;
			cf.cg_fld.at_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 3137) {
			cf.cg_fld.ap_fld = -2052180122;
			cf.cg_fld.at_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (3138 == var0) {
			cf.cg_fld.ap_fld = 0;
			return 1;
		} else if (var0 == 3139) {
			cf.cg_fld.ap_fld = 1121393587;
			return 1;
		} else if (3140 == var0) {
			cf.cg_fld.ap_fld = -930786535;
			cf.cg_fld.at_fld = var2 ? gs.ap_fld.bf_fld : ab_fld.bf_fld;
			return 1;
		} else if (3141 == var0) {
			boolean var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			cx.kq_fld.ay(var11, (byte)7);
			return 1;
		} else if (var0 == 3142) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cn.za(cx.kq_fld, 1148878685) ? 1 : 0;
			return 1;
		} else if (var0 == 3143) {
			boolean var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			client.dq_fld = var10;
			if (!var10) {
				cx.kq_fld.ac("", -1848140940);
			}

			return 1;
		} else if (var0 == 3144) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.dq_fld ? 1 : 0;
			return 1;
		} else if (var0 == 3145) {
			return 1;
		} else if (3146 == var0) {
			boolean var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			cn.up(cx.kq_fld, !var9, (byte)2);
			return 1;
		} else if (3147 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cx.kq_fld.as((short)20397) ? 0 : 1;
			return 1;
		} else if (var0 == 3148) {
			return 1;
		} else if (3149 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3150) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3151) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3152) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3153 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bn.bt_fld;
			return 1;
		} else if (3154 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = of.ax();
			return 1;
		} else if (var0 == 3155) {
			ef.aq_fld--;
			return 1;
		} else if (var0 == 3156) {
			return 1;
		} else if (3157 == var0) {
			gz.ax_fld -= 2;
			return 1;
		} else if (var0 == 3158) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3159 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3160 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3161) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3162) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3163 == var0) {
			ef.aq_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3164 == var0) {
			gz.ax_fld--;
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			return 1;
		} else if (3165 == var0) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3166 == var0) {
			gz.ax_fld -= 2;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3167) {
			gz.ax_fld -= 2;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3168) {
			gz.ax_fld -= 2;
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			return 1;
		} else if (var0 == 3169) {
			return 1;
		} else if (var0 == 3170) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3171 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3172 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (3173 == var0) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3174 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (var0 == 3175) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3176 == var0) {
			return 1;
		} else if (3177 == var0) {
			return 1;
		} else if (var0 == 3178) {
			ef.aq_fld--;
			return 1;
		} else if (var0 == 3179) {
			return 1;
		} else if (var0 == 3180) {
			ef.aq_fld--;
			return 1;
		} else if (3181 == var0) {
			dj.gn(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			return 1;
		} else if (3182 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = hs.go();
			return 1;
		} else if (var0 == 3185) {
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			cn.tu(cx.kq_fld, var8);
			return 1;
		} else if (3186 == var0) {
			int var7 = cn.ka(cx.kq_fld, (byte)1);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var7;
			return 1;
		} else if (3189 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bv.hx(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int fn(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == 102697666) {
			String var22 = (String)ai_fld[(ef.aq_fld -= 1960775670) * -1762931770];
			io.ag(0, "", var22);
			return 1;
		} else if (3101 == var0) {
			gz.ax_fld -= 1688097348;
			cg.cv(ot.ef(), au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], 635924517);
			return 1;
		} else if (3103 == var0) {
			if (!bd_fld) {
				bm_fld = true;
			}

			return 1;
		} else if (var0 == 3104) {
			String var21 = (String)ai_fld[(ef.aq_fld -= -470658987) * -203396246];
			int var30 = 0;
			if (dz.ag(var21)) {
				var30 = tf.av(var21);
			}

			jm var33 = gi.ak(jb.do_fld, client.aq_fld.av_fld);
			xi.ld(var33.ay_fld, var30, (byte)103);
			client.aq_fld.az(var33);
			return 1;
		} else if (-2072252785 == var0) {
			String var20 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			jm var29 = gi.ak(jb.bz_fld, client.aq_fld.av_fld);
			var29.ay_fld.bc(var20.length() + 1);
			var29.ay_fld.cc(var20, -182692229);
			client.aq_fld.az(var29);
			return 1;
		} else if (var0 == 3106) {
			String var19 = (String)ai_fld[(ef.aq_fld -= -211521517) * -1558200486];
			jm var28 = gi.ak(jb.cd_fld, client.aq_fld.av_fld);
			var28.ay_fld.bc(var19.length() + 1);
			var28.ay_fld.cc(var19, -1193961697);
			client.aq_fld.az(var28);
			return 1;
		} else if (var0 == 3107) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			String var27 = (String)ai_fld[(ef.aq_fld -= 1709559422) * -836183525];
			qk.fv(var18, var27, 966695779);
			return 1;
		} else if (var0 == 3108) {
			gz.ax_fld -= 1340496664;
			int var17 = au_fld[gz.ax_fld];
			int var26 = au_fld[1 + gz.ax_fld];
			int var32 = au_fld[gz.ax_fld + 2];
			lu var35 = cf.cg_fld.ak(var32);
			if (!client.ng_fld && cf.cg_fld.br(var35, var17, var26)) {
				ot.ft();
			}

			return 1;
		} else if (var0 == 3109) {
			gz.ax_fld -= 1750560400;
			int var16 = au_fld[2080845051 * gz.ax_fld];
			int var25 = au_fld[1 + gz.ax_fld];
			lu var31 = var2 ? gs.ap_fld : ab_fld;
			if (!client.ng_fld && cf.cg_fld.br(var31, var16, var25)) {
				ot.ft();
			}

			return 1;
		} else if (773526478 == var0) {
			gu.hh_fld = au_fld[(gz.ax_fld -= -1684678759) * -439455766] == 1;
			return 1;
		} else if (var0 == 1098574298) {
			au_fld[(gz.ax_fld += 1488875894) * 280213280 - 1] = cx.kq_fld.ae((byte)-21) ? 1 : 0;
			return 1;
		} else if (var0 == 3112) {
			cx.kq_fld.ah(au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1, (byte)-94);
			return 1;
		} else if (-1704737952 == var0) {
			String var15 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld--;
			by.ak(var15);
			return 1;
		} else if (var0 == -533249425) {
			String var14 = (String)ai_fld[(ef.aq_fld -= -211521517) * 567874226];
			long var24 = 0L;
			if (io.az(var14)) {
				var24 = gj.aw(var14);
			}

			jm var34 = gi.ak(jb.cu_fld, client.aq_fld.av_fld);
			var34.ay_fld.fn(var24);
			client.aq_fld.az(var34);
			return 1;
		} else if (var0 == 3115) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			jm var23 = gi.ak(jb.ex_fld, client.aq_fld.av_fld);
			var23.ay_fld.bw(var13);
			client.aq_fld.az(var23);
			return 1;
		} else if (-1570692639 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ef.aq_fld -= -321398408;
			String var4 = (String)ai_fld[ef.aq_fld * 832732633];
			String var5 = (String)ai_fld[ef.aq_fld + 1];
			if (var4.length() > 500) {
				return 1;
			} else if (var5.length() > 1957698019) {
				return 1;
			} else {
				jm var6 = gi.ak(jb.ba_fld, client.aq_fld.av_fld);
				var6.ay_fld.bw(1 + iq.bu(var4) + iq.bu(var5));
				var6.ay_fld.cc(var5, 843121791);
				xi.rs(var6.ay_fld, var12);
				var6.ay_fld.cc(var4, -751012877);
				client.aq_fld.az(var6);
				return 1;
			}
		} else if (745863147 == var0) {
			gz.ax_fld -= -887599989;
			return 1;
		} else if (var0 == 3118) {
			client.ei_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (-1038526942 == var0) {
			client.ec_fld = au_fld[(gz.ax_fld -= -638042788) * -1441561796] == 1;
			return 1;
		} else if (1271853786 == var0) {
			if (au_fld[(gz.ax_fld -= -2037614017) * -1320422584] == 1) {
				client.ez_fld |= 959732103;
			} else {
				client.ez_fld &= -1919464206;
			}

			return 1;
		} else if (var0 == 3121) {
			if (au_fld[(gz.ax_fld -= 575093226) * -776631127] == 1) {
				client.ez_fld |= 1919464206;
			} else {
				client.ez_fld = 165289015 * (client.ez_fld & -3);
			}

			return 1;
		} else if (var0 == 3122) {
			if (au_fld[(gz.ax_fld -= 1686822503) * -259028809] == 1) {
				client.ez_fld = 165289015 * (client.ez_fld | 4);
			} else {
				client.ez_fld &= -993121112;
			}

			return 1;
		} else if (var0 == -1644613163) {
			if (au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
				client.ez_fld = 165289015 * (client.ez_fld | 8);
			} else {
				client.ez_fld &= -47654335;
			}

			return 1;
		} else if (var0 == 3124) {
			client.ez_fld = 0;
			return 1;
		} else if (var0 == 3125) {
			client.df_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (1155391424 == var0) {
			client.dp_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (var0 == 3127) {
			rh.gg(au_fld[(gz.ax_fld -= 1787368741) * 954310771] == 1);
			return 1;
		} else if (var0 == 3128) {
			au_fld[(gz.ax_fld += -1274966820) * -776631127 - 1] = bf.gc() ? 1 : 0;
			return 1;
		} else if (var0 == 3129) {
			gz.ax_fld -= -1685382803;
			client.di_fld = au_fld[gz.ax_fld];
			client.dn_fld = -868002529 * au_fld[1 + gz.ax_fld];
			return 1;
		} else if (var0 == 3130) {
			gz.ax_fld -= 1790224659;
			return 1;
		} else if (-603351845 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (var0 == -700453844) {
			au_fld[(gz.ax_fld += -948867739) * -776631127 - 1] = pf.qw_fld;
			au_fld[(gz.ax_fld += -1684678759) * -925917668 - 1] = bc.qx_fld * -817106773;
			return 1;
		} else if (-2075684214 == var0) {
			gz.ax_fld -= 1821900907;
			return 1;
		} else if (var0 == 1246847479) {
			return 1;
		} else if (-667109242 == var0) {
			gz.ax_fld -= -272938430;
			return 1;
		} else if (var0 == -2015893908) {
			cf.cg_fld.ap_fld = -930786535;
			cf.cg_fld.at_fld = au_fld[(gz.ax_fld -= 1773280369) * -2024451624] * 475826191;
			return 1;
		} else if (var0 == 3137) {
			cf.cg_fld.ap_fld = -2052180122;
			cf.cg_fld.at_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (-417752387 == var0) {
			cf.cg_fld.ap_fld = 0;
			return 1;
		} else if (var0 == 570775476) {
			cf.cg_fld.ap_fld = 1121393587;
			return 1;
		} else if (1074518403 == var0) {
			cf.cg_fld.ap_fld = -20777526;
			cf.cg_fld.at_fld = var2 ? -360867302 * gs.ap_fld.bf_fld : ab_fld.bf_fld;
			return 1;
		} else if (3141 == var0) {
			boolean var11 = au_fld[(gz.ax_fld -= 1412608953) * -776631127] == 1;
			cx.kq_fld.ay(var11, (byte)101);
			return 1;
		} else if (var0 == 3142) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cn.za(cx.kq_fld, 1610472339) ? 1 : 0;
			return 1;
		} else if (var0 == 3143) {
			boolean var10 = au_fld[(gz.ax_fld -= 1601777789) * -100515594] == 1;
			client.dq_fld = var10;
			if (!var10) {
				cx.kq_fld.ac("", -1620933649);
			}

			return 1;
		} else if (var0 == 1799577102) {
			au_fld[(gz.ax_fld += 138141264) * -776631127 - 1] = client.dq_fld ? 1 : 0;
			return 1;
		} else if (var0 == 3145) {
			return 1;
		} else if (3146 == var0) {
			boolean var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			cn.up(cx.kq_fld, !var9, (byte)2);
			return 1;
		} else if (3147 == var0) {
			au_fld[(gz.ax_fld += 1276959970) * 680325689 - 1] = cx.kq_fld.as((short)22552) ? 0 : 1;
			return 1;
		} else if (var0 == 1660093684) {
			return 1;
		} else if (1821019833 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == -1402163402) {
			au_fld[(gz.ax_fld += 463684331) * 131575176 - 1] = 0;
			return 1;
		} else if (var0 == -1231656423) {
			au_fld[(gz.ax_fld += -1684678759) * 402205518 - 1] = 0;
			return 1;
		} else if (var0 == -1818441099) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3153 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bn.bt_fld;
			return 1;
		} else if (3154 == var0) {
			au_fld[(gz.ax_fld += 1043971255) * -1132426459 - 1] = of.ax();
			return 1;
		} else if (var0 == -325244266) {
			ef.aq_fld -= -2040367475;
			return 1;
		} else if (var0 == 3156) {
			return 1;
		} else if (-915153263 == var0) {
			gz.ax_fld -= 703199321;
			return 1;
		} else if (var0 == 3158) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3159 == var0) {
			au_fld[(gz.ax_fld += 576577892) * -776631127 - 1] = 0;
			return 1;
		} else if (-884466733 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == -875930833) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -1855711775 - 1] = 0;
			return 1;
		} else if (var0 == 3162) {
			gz.ax_fld -= 918411983;
			au_fld[(gz.ax_fld += -1684678759) * 846846008 - 1] = 0;
			return 1;
		} else if (-1353804947 == var0) {
			ef.aq_fld--;
			au_fld[(gz.ax_fld += -2084026417) * -776631127 - 1] = 0;
			return 1;
		} else if (3164 == var0) {
			gz.ax_fld -= 1626523478;
			ai_fld[(ef.aq_fld += -211521517) * -255291086 - 1] = "";
			return 1;
		} else if (692759093 == var0) {
			gz.ax_fld -= -1114650458;
			au_fld[(gz.ax_fld += -1684678759) * 61352698 - 1] = 0;
			return 1;
		} else if (1633046436 == var0) {
			gz.ax_fld -= 88836236;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3167) {
			gz.ax_fld -= -158811513;
			au_fld[(gz.ax_fld += -1407333511) * 1315531623 - 1] = 0;
			return 1;
		} else if (var0 == 3168) {
			gz.ax_fld -= 2;
			ai_fld[(ef.aq_fld += -211521517) * -121181131 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * 995369414 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -1232792563 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -1784133372 - 1] = "";
			ai_fld[(ef.aq_fld += 1451385264) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * 476473215 - 1] = "";
			return 1;
		} else if (var0 == -412996243) {
			return 1;
		} else if (var0 == 1238180886) {
			au_fld[(gz.ax_fld += 2138712963) * -776631127 - 1] = 0;
			return 1;
		} else if (1171921467 == var0) {
			au_fld[(gz.ax_fld += -779342944) * -623276942 - 1] = 0;
			return 1;
		} else if (-1248025825 == var0) {
			gz.ax_fld -= 1754696240;
			return 1;
		} else if (3173 == var0) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -2116846925 - 1] = 0;
			return 1;
		} else if (1551379857 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (var0 == 333392523) {
			au_fld[(gz.ax_fld += 570413151) * -776631127 - 1] = 0;
			return 1;
		} else if (3176 == var0) {
			return 1;
		} else if (1482172167 == var0) {
			return 1;
		} else if (var0 == -963381539) {
			ef.aq_fld--;
			return 1;
		} else if (var0 == 3179) {
			return 1;
		} else if (var0 == 3180) {
			ef.aq_fld -= -1752554296;
			return 1;
		} else if (3181 == var0) {
			dj.gn(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			return 1;
		} else if (125285370 == var0) {
			au_fld[(gz.ax_fld += 876620151) * 1325318295 - 1] = hs.go();
			return 1;
		} else if (var0 == 2055204212) {
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			cn.tu(cx.kq_fld, var8);
			return 1;
		} else if (-1210274520 == var0) {
			int var7 = cn.ka(cx.kq_fld, (byte)1);
			au_fld[(gz.ax_fld += 1691105163) * 1377539528 - 1] = var7;
			return 1;
		} else if (1732491918 == var0) {
			int var3 = au_fld[(gz.ax_fld -= 2051637693) * -776631127];
			bv.hx(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ft(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == 3100) {
			String var22 = (String)ai_fld[(ef.aq_fld -= 411155232) * -836183525];
			io.ag(0, "", var22);
			return 1;
		} else if (-397378301 == var0) {
			gz.ax_fld -= 2;
			cg.cv(ot.ef(), au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], 39420300);
			return 1;
		} else if (3103 == var0) {
			if (!bd_fld) {
				bm_fld = true;
			}

			return 1;
		} else if (var0 == 3104) {
			String var21 = (String)ai_fld[(ef.aq_fld -= -938803004) * -1859055611];
			int var30 = 0;
			if (dz.ag(var21)) {
				var30 = tf.av(var21);
			}

			jm var33 = gi.ak(jb.do_fld, client.aq_fld.av_fld);
			xi.ld(var33.ay_fld, var30, (byte)87);
			client.aq_fld.az(var33);
			return 1;
		} else if (1803031401 == var0) {
			String var20 = (String)ai_fld[(ef.aq_fld -= 1142132426) * 144453249];
			jm var29 = gi.ak(jb.bz_fld, client.aq_fld.av_fld);
			var29.ay_fld.bc(var20.length() + 1);
			var29.ay_fld.cc(var20, -789648900);
			client.aq_fld.az(var29);
			return 1;
		} else if (var0 == 3106) {
			String var19 = (String)ai_fld[(ef.aq_fld -= -211521517) * -2007010342];
			jm var28 = gi.ak(jb.cd_fld, client.aq_fld.av_fld);
			var28.ay_fld.bc(var19.length() + 1);
			var28.ay_fld.cc(var19, -772422574);
			client.aq_fld.az(var28);
			return 1;
		} else if (var0 == 3107) {
			int var18 = au_fld[(gz.ax_fld -= 1735310802) * -776631127];
			String var27 = (String)ai_fld[(ef.aq_fld -= 212027586) * -36927047];
			qk.fv(var18, var27, 966695779);
			return 1;
		} else if (var0 == 3108) {
			gz.ax_fld -= -1325383342;
			int var17 = au_fld[gz.ax_fld * 1767221690];
			int var26 = au_fld[1 + gz.ax_fld];
			int var32 = au_fld[gz.ax_fld + 2];
			lu var35 = cf.cg_fld.ak(var32);
			if (!client.ng_fld && cf.cg_fld.br(var35, var17, var26)) {
				ot.ft();
			}

			return 1;
		} else if (var0 == 3109) {
			gz.ax_fld -= -588732287;
			int var16 = au_fld[gz.ax_fld];
			int var25 = au_fld[1 + gz.ax_fld];
			lu var31 = var2 ? gs.ap_fld : ab_fld;
			if (!client.ng_fld && cf.cg_fld.br(var31, var16, var25)) {
				ot.ft();
			}

			return 1;
		} else if (-512873279 == var0) {
			gu.hh_fld = au_fld[(gz.ax_fld -= -1684678759) * -186665573] == 1;
			return 1;
		} else if (var0 == -1784684591) {
			au_fld[(gz.ax_fld += 1417895240) * -776631127 - 1] = cx.kq_fld.ae((byte)16) ? 1 : 0;
			return 1;
		} else if (var0 == -649308440) {
			cx.kq_fld.ah(au_fld[(gz.ax_fld -= -1684678759) * 1060086437] == 1, (byte)4);
			return 1;
		} else if (3113 == var0) {
			String var15 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld--;
			by.ak(var15);
			return 1;
		} else if (var0 == -802793602) {
			String var14 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			long var24 = 0L;
			if (io.az(var14)) {
				var24 = gj.aw(var14);
			}

			jm var34 = gi.ak(jb.cu_fld, client.aq_fld.av_fld);
			var34.ay_fld.fn(var24);
			client.aq_fld.az(var34);
			return 1;
		} else if (var0 == 275164516) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * 307227445];
			jm var23 = gi.ak(jb.ex_fld, client.aq_fld.av_fld);
			var23.ay_fld.bw(var13);
			client.aq_fld.az(var23);
			return 1;
		} else if (3116 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -602621163) * -282082465];
			ef.aq_fld -= 2;
			String var4 = (String)ai_fld[ef.aq_fld * 1772869089];
			String var5 = (String)ai_fld[ef.aq_fld + 1];
			if (var4.length() > 500) {
				return 1;
			} else if (var5.length() > 485556196) {
				return 1;
			} else {
				jm var6 = gi.ak(jb.ba_fld, client.aq_fld.av_fld);
				var6.ay_fld.bw(1 + iq.bu(var4) + iq.bu(var5));
				var6.ay_fld.cc(var5, 924686529);
				xi.rs(var6.ay_fld, var12);
				var6.ay_fld.cc(var4, 80825105);
				client.aq_fld.az(var6);
				return 1;
			}
		} else if (311718792 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (var0 == 3118) {
			client.ei_fld = au_fld[(gz.ax_fld -= 1592684819) * 1502018351] == 1;
			return 1;
		} else if (628298608 == var0) {
			client.ec_fld = au_fld[(gz.ax_fld -= -1684678759) * -83697654] == 1;
			return 1;
		} else if (3120 == var0) {
			if (au_fld[(gz.ax_fld -= -999573128) * -1191441935] == 1) {
				client.ez_fld = (client.ez_fld | 1) * 1755126802;
			} else {
				client.ez_fld = (client.ez_fld & 133436758) * 1494373412;
			}

			return 1;
		} else if (var0 == 1632805613) {
			if (au_fld[(gz.ax_fld -= -1684678759) * -1124329528] == 1) {
				client.ez_fld |= 1919464206;
			} else {
				client.ez_fld = 165289015 * (client.ez_fld & -3);
			}

			return 1;
		} else if (var0 == 3122) {
			if (au_fld[(gz.ax_fld -= -2134337349) * 1075833370] == 1) {
				client.ez_fld = 165289015 * (client.ez_fld | 4);
			} else {
				client.ez_fld &= -1324226806;
			}

			return 1;
		} else if (var0 == 3123) {
			if (au_fld[(gz.ax_fld -= 1056918859) * 1540777619] == 1) {
				client.ez_fld = -1274654969 * (client.ez_fld | 8);
			} else {
				client.ez_fld = (client.ez_fld & -9) * -842665732;
			}

			return 1;
		} else if (var0 == 812982263) {
			client.ez_fld = 0;
			return 1;
		} else if (var0 == 1104346557) {
			client.df_fld = au_fld[(gz.ax_fld -= -1684678759) * 1471309485] == 1;
			return 1;
		} else if (1769031653 == var0) {
			client.dp_fld = au_fld[(gz.ax_fld -= -1087076110) * 2028020259] == 1;
			return 1;
		} else if (var0 == 3127) {
			rh.gg(au_fld[(gz.ax_fld -= -1684678759) * 1702490693] == 1);
			return 1;
		} else if (var0 == -1405025754) {
			au_fld[(gz.ax_fld += 1497334981) * -2130957329 - 1] = bf.gc() ? 1 : 0;
			return 1;
		} else if (var0 == 1707800942) {
			gz.ax_fld -= -146649731;
			client.di_fld = au_fld[gz.ax_fld] * -261071611;
			client.dn_fld = 12761323 * au_fld[1 + gz.ax_fld];
			return 1;
		} else if (var0 == 3130) {
			gz.ax_fld -= 2;
			return 1;
		} else if (-2145304848 == var0) {
			gz.ax_fld -= 1891808844;
			return 1;
		} else if (var0 == 730577834) {
			au_fld[(gz.ax_fld += 1739427055) * -776631127 - 1] = pf.qw_fld;
			au_fld[(gz.ax_fld += 1621480777) * -776631127 - 1] = bc.qx_fld * -1726085181;
			return 1;
		} else if (1439292610 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (var0 == 667522393) {
			return 1;
		} else if (3135 == var0) {
			gz.ax_fld -= 2;
			return 1;
		} else if (var0 == 1620548643) {
			cf.cg_fld.ap_fld = -930786535;
			cf.cg_fld.at_fld = au_fld[(gz.ax_fld -= -917101083) * 1776737979];
			return 1;
		} else if (var0 == 3137) {
			cf.cg_fld.ap_fld = -2052180122;
			cf.cg_fld.at_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (3138 == var0) {
			cf.cg_fld.ap_fld = 0;
			return 1;
		} else if (var0 == 3139) {
			cf.cg_fld.ap_fld = -1561660888;
			return 1;
		} else if (3140 == var0) {
			cf.cg_fld.ap_fld = -930786535;
			cf.cg_fld.at_fld = (var2 ? -332703795 * gs.ap_fld.bf_fld : ab_fld.bf_fld) * 1463985899;
			return 1;
		} else if (3141 == var0) {
			boolean var11 = au_fld[(gz.ax_fld -= -1439459360) * -346568501] == 1;
			cx.kq_fld.ay(var11, (byte)48);
			return 1;
		} else if (var0 == 513273608) {
			au_fld[(gz.ax_fld += -1684678759) * -988180436 - 1] = cn.za(cx.kq_fld, 900151210) ? 1 : 0;
			return 1;
		} else if (var0 == 600576707) {
			boolean var10 = au_fld[(gz.ax_fld -= -1684678759) * 2043781433] == 1;
			client.dq_fld = var10;
			if (!var10) {
				cx.kq_fld.ac("", -1436029610);
			}

			return 1;
		} else if (var0 == -1813619609) {
			au_fld[(gz.ax_fld += -1684678759) * -2089360515 - 1] = client.dq_fld ? 1 : 0;
			return 1;
		} else if (var0 == -954241313) {
			return 1;
		} else if (1362049017 == var0) {
			boolean var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			cn.up(cx.kq_fld, !var9, (byte)2);
			return 1;
		} else if (-2064782841 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * 1843087645 - 1] = cx.kq_fld.as((short)21700) ? 0 : 1;
			return 1;
		} else if (var0 == 3148) {
			return 1;
		} else if (1915343122 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -1955307021 - 1] = 0;
			return 1;
		} else if (var0 == -217463099) {
			au_fld[(gz.ax_fld += 828555419) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3151) {
			au_fld[(gz.ax_fld += 62572421) * -1401917152 - 1] = 0;
			return 1;
		} else if (var0 == -818032995) {
			au_fld[(gz.ax_fld += 1836664322) * -776631127 - 1] = 0;
			return 1;
		} else if (-1722532802 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1054239333 * bn.bt_fld;
			return 1;
		} else if (-402846922 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * 47849894 - 1] = of.ax();
			return 1;
		} else if (var0 == 3155) {
			ef.aq_fld--;
			return 1;
		} else if (var0 == -40783982) {
			return 1;
		} else if (1317377748 == var0) {
			gz.ax_fld -= -1312873933;
			return 1;
		} else if (var0 == 3158) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (1410898279 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -852147459 - 1] = 0;
			return 1;
		} else if (3160 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3161) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -262264256) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 3162) {
			gz.ax_fld -= 2090701673;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (-1191006035 == var0) {
			ef.aq_fld--;
			au_fld[(gz.ax_fld += 760012426) * -776631127 - 1] = 0;
			return 1;
		} else if (-671469601 == var0) {
			gz.ax_fld--;
			ai_fld[(ef.aq_fld += -1003555627) * -836183525 - 1] = "";
			return 1;
		} else if (3165 == var0) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (3166 == var0) {
			gz.ax_fld -= 2;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == -1693869108) {
			gz.ax_fld -= -298203953;
			au_fld[(gz.ax_fld += -505004457) * -620071151 - 1] = 0;
			return 1;
		} else if (var0 == 3168) {
			gz.ax_fld -= 1314392392;
			ai_fld[(ef.aq_fld += -211521517) * -1825637282 - 1] = "";
			ai_fld[(ef.aq_fld += 362593375) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += 775661425) * 1367004791 - 1] = "";
			ai_fld[(ef.aq_fld += 771432539) * -1188619290 - 1] = "";
			ai_fld[(ef.aq_fld += -1599039301) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -108822550) * 1973340037 - 1] = "";
			ai_fld[(ef.aq_fld += 1502438646) * -836183525 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * 2036572620 - 1] = "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			return 1;
		} else if (var0 == 3169) {
			return 1;
		} else if (var0 == 3170) {
			au_fld[(gz.ax_fld += -1684678759) * 168622648 - 1] = 0;
			return 1;
		} else if (3171 == var0) {
			au_fld[(gz.ax_fld += 1835611146) * -1121104482 - 1] = 0;
			return 1;
		} else if (3172 == var0) {
			gz.ax_fld--;
			return 1;
		} else if (1445678599 == var0) {
			gz.ax_fld--;
			au_fld[(gz.ax_fld += -1684678759) * 981465846 - 1] = 0;
			return 1;
		} else if (-377815302 == var0) {
			gz.ax_fld -= -705046118;
			return 1;
		} else if (var0 == -1688082212) {
			au_fld[(gz.ax_fld += -1684678759) * 986857816 - 1] = 0;
			return 1;
		} else if (-1787194060 == var0) {
			return 1;
		} else if (3177 == var0) {
			return 1;
		} else if (var0 == -1754322056) {
			ef.aq_fld--;
			return 1;
		} else if (var0 == -763150094) {
			return 1;
		} else if (var0 == -1557152736) {
			ef.aq_fld -= 208012673;
			return 1;
		} else if (3181 == var0) {
			dj.gn(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			return 1;
		} else if (3182 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = hs.go();
			return 1;
		} else if (var0 == -729126040) {
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * 429892409];
			cn.tu(cx.kq_fld, var8);
			return 1;
		} else if (-1085459201 == var0) {
			int var7 = cn.ka(cx.kq_fld, (byte)1);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var7;
			return 1;
		} else if (1195905222 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -1301370108];
			bv.hx(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fd(int var0, ba var1) {
		if (var0 == 1865870748) {
			gz.ax_fld -= -494547418;
			ah.kw_fld.ak(au_fld[gz.ax_fld * -109027133], au_fld[gz.ax_fld + 1], au_fld[2 + gz.ax_fld]);
			return 1;
		} else if (var0 == 3201) {
			gz.ax_fld -= 353745463;
			int var17 = au_fld[-1569172924 * gz.ax_fld];
			int var25 = au_fld[1 + gz.ax_fld];
			int var34 = au_fld[2 + gz.ax_fld];
			int var48 = au_fld[gz.ax_fld + 3];
			int var53 = au_fld[4 + gz.ax_fld];
			ArrayList var54 = new ArrayList();
			var54.add(var17);
			ce.be(var54, var25, var34, var48, var53, (byte)0);
			return 1;
		} else if (3202 == var0) {
			gz.ax_fld -= 2;
			yq.bs(au_fld[1438975482 * gz.ax_fld], au_fld[1 + gz.ax_fld]);
			return 1;
		} else if (var0 == 3212 || var0 == 3213 || 1184298391 == var0 || var0 == 3181 || 3203 == var0 || var0 == 1287885144 || -1866459548 == var0) {
			cq var16 = cq.ak_fld;
			cc var24 = cc.ak_fld;
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * 1192033789];
			if (var0 == 3212) {
				int var43 = au_fld[(gz.ax_fld -= 2053630744) * -776631127];
				var16 = (cq)ka.ak(dl.ak(), var43);
				if (var16 == null) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var43})));
				}
			}

			if (var0 == 3213) {
				int var44 = au_fld[(gz.ax_fld -= -1684678759) * -1921772442];
				var24 = (cc)ka.ak(ge.ak((byte)104), var44);
				if (var24 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var44})));
				}
			}

			if (var0 == 3209) {
				int var45 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var16 = (cq)ka.ak(dl.ak(), var45);
				if (null == var16) {
					var24 = (cc)ka.ak(ge.ak((byte)39), var45);
					if (null == var24) {
						throw new RuntimeException(String.format("Unrecognized client option %d", (Object[])(new Object[]{var45})));
					}
				}
			} else if (var0 == 3181) {
				var16 = cq.ah_fld;
			} else if (var0 == -620566911) {
				var24 = cc.az_fld;
			} else if (3205 == var0) {
				var24 = cc.av_fld;
			} else if (var0 == 1901404614) {
				var24 = cc.ae_fld;
			}

			if (var24 == cc.ak_fld) {
				switch (var16.ar_fld) {
					case 1:
						cx.kq_fld.ay(var33 == 1, (byte)100);
						break;
					case 2:
						cn.up(cx.kq_fld, var33 == 1, (byte)2);
						break;
					case 3:
						cn.ij(cx.kq_fld, 1 == var33, 361552831);
						break;
					case 4:
						if (var33 < 0) {
							var33 = 0;
						}

						cx.kq_fld.an(var33, (byte)-14);
						break;
					case 5:
						dj.gn(var33);
						break;
					case 6:
						cx.kq_fld.by(var33, 2075929096);
						fw.gr();
						break;
					case 7:
						cx.kq_fld.bx(var33 == 1, (byte)15);
						break;
					default:
						String var46 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var16}));
						throw new RuntimeException(var46);
				}
			} else {
				switch (var24.ah_fld * -1252166696) {
					case 1:
						cx.kq_fld.ah(var33 == 1, (byte)56);
						break;
					case 2:
						cx.kq_fld.am(var33, 1344857717);
						gd.gj((byte)-39);
						break;
					case 3:
						cx.kq_fld.ao(var33, 777660171);
						cd.gs();
						break;
					case 4:
						cx.kq_fld.ap(var33, 310137703);
						cu.gt();
						break;
					default:
						String var47 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var24}));
						throw new RuntimeException(var47);
				}
			}

			return 1;
		} else if (var0 == -1950600003 || var0 == 241967268 || var0 == -2005064914 || var0 == 1264482690 || var0 == 3204 || var0 == 3206 || var0 == -1329613967) {
			cq var15 = cq.ak_fld;
			cc var23 = cc.ak_fld;
			boolean var31 = false;
			if (3214 == var0) {
				int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var15 = (cq)ka.ak(dl.ak(), var38);
				if (null == var15) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var38})));
				}
			}

			if (var0 == 2039376391) {
				int var39 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var23 = (cc)ka.ak(ge.ak((byte)57), var39);
				if (var23 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var39})));
				}
			}

			if (359133305 == var0) {
				int var40 = au_fld[(gz.ax_fld -= -24328897) * -776631127];
				var15 = (cq)ka.ak(dl.ak(), var40);
				if (null == var15) {
					var23 = (cc)ka.ak(ge.ak((byte)92), var40);
					if (var23 == null) {
						throw new RuntimeException(String.format("Unrecognized client option %d", (Object[])(new Object[]{var40})));
					}
				}
			} else if (3182 == var0) {
				var15 = cq.ah_fld;
			} else if (3204 == var0) {
				var23 = cc.az_fld;
			} else if (3206 == var0) {
				var23 = cc.av_fld;
			} else if (var0 == 122877395) {
				var23 = cc.ae_fld;
			}

			int var32;
			if (var23 == cc.ak_fld) {
				switch (var15.ar_fld * -1893263555) {
					case 1:
						var32 = cn.za(cx.kq_fld, 684640244) ? 1 : 0;
						break;
					case 2:
						var32 = cx.kq_fld.as((short)14833) ? 1 : 0;
						break;
					case 3:
						var32 = cx.kq_fld.al(562053266) ? 1 : 0;
						break;
					case 4:
						var32 = cn.tr(cx.kq_fld, (byte)0);
						break;
					case 5:
						var32 = hs.go();
						break;
					case 6:
						var32 = (int)(cx.kq_fld.bf(465869533) * 100.0F);
						break;
					case 7:
						var32 = cx.kq_fld.bl(-604134089) ? 1 : 0;
						break;
					default:
						String var41 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var15}));
						throw new RuntimeException(var41);
				}
			} else {
				switch (var23.ah_fld) {
					case 1:
						var32 = cx.kq_fld.ae((byte)64) ? 1 : 0;
						break;
					case 2:
						var32 = cj.gu();
						break;
					case 3:
						var32 = ga.gv();
						break;
					case 4:
						var32 = ua.gp();
						break;
					default:
						String var42 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var23}));
						throw new RuntimeException(var42);
				}
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32;
			return 1;
		} else if (1875573950 == var0) {
			return 1;
		} else if (424905641 == var0) {
			int var14 = au_fld[(gz.ax_fld -= -1472565476) * -776631127];
			int var22 = 0;
			cq var30 = (cq)ka.ak(dl.ak(), var14);
			if (null != var30) {
				var22 = cq.ak_fld != var30 ? 1 : 0;
			}

			au_fld[(gz.ax_fld += 223999884) * -1076160270 - 1] = var22;
			return 1;
		} else if (var0 == -802509708) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var21 = 0;
			cc var29 = (cc)ka.ak(ge.ak((byte)65), var13);
			if (var29 != null) {
				var21 = cc.ak_fld != var29 ? 1 : 0;
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var21;
			return 1;
		} else if (558187422 == var0 || 3219 == var0) {
			cq var12 = cq.ak_fld;
			cc var20 = cc.ak_fld;
			byte var27 = -1;
			byte var36 = -1;
			if (-487770950 == var0) {
				int var49 = au_fld[(gz.ax_fld -= -601207588) * -776631127];
				var12 = (cq)ka.ak(dl.ak(), var49);
				if (null == var12) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var49})));
				}
			}

			if (3219 == var0) {
				int var50 = au_fld[(gz.ax_fld -= -1847141123) * -776631127];
				var20 = (cc)ka.ak(ge.ak((byte)104), var50);
				if (var20 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var50})));
				}
			}

			int var37;
			if (var20 == cc.ak_fld) {
				switch (var12.ar_fld) {
					case 1:
					case 2:
					case 3:
						var27 = 0;
						var37 = 1;
						break;
					case 4:
						var27 = 0;
						var37 = Integer.MAX_VALUE;
						break;
					case 5:
						var27 = 0;
						var37 = 100;
						break;
					default:
						String var51 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var12}));
						throw new RuntimeException(var51);
				}
			} else {
				switch (var20.ah_fld) {
					case 1:
						var27 = 0;
						var37 = 1;
						break;
					case 2:
					case 3:
					case 4:
						var27 = 0;
						var37 = 89688714;
						break;
					default:
						String var52 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var20}));
						throw new RuntimeException(var52);
				}
			}

			au_fld[(gz.ax_fld += -912396929) * -776631127 - 1] = var27;
			au_fld[(gz.ax_fld += 1773125303) * -776631127 - 1] = var37;
			return 1;
		} else if (3220 == var0) {
			gz.ax_fld -= 2;
			int var11 = au_fld[gz.ax_fld];
			int var19 = au_fld[1 + gz.ax_fld];
			sx.av(var11, var19);
			return 1;
		} else if (var0 == 3221) {
			gz.ax_fld -= 6;
			int var10 = au_fld[gz.ax_fld * 2109125032];
			int var18 = au_fld[1 + gz.ax_fld];
			int var26 = au_fld[2 + gz.ax_fld];
			int var35 = au_fld[3 + gz.ax_fld];
			int var7 = au_fld[gz.ax_fld + 4];
			int var8 = au_fld[gz.ax_fld + 5];
			ArrayList var9 = new ArrayList();
			var9.add(var10);
			var9.add(var18);
			ce.be(var9, var26, var35, var7, var8, (byte)0);
			return 1;
		} else if (var0 == 3222) {
			gz.ax_fld -= 28512205;
			int var3 = au_fld[gz.ax_fld];
			int var4 = au_fld[gz.ax_fld + 1];
			int var5 = au_fld[gz.ax_fld + 2];
			int var6 = au_fld[3 + gz.ax_fld];
			vr.ae(var3, var4, var5, var6, (byte)114);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fq(int var0, ba var1) {
		if (var0 == -1042544337) {
			gz.ax_fld -= -1667535317;
			ah.kw_fld.ak(au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], au_fld[2 + gz.ax_fld]);
			return 1;
		} else if (var0 == 355298065) {
			gz.ax_fld -= 1334149884;
			int var17 = au_fld[1275551532 * gz.ax_fld];
			int var25 = au_fld[1 + gz.ax_fld];
			int var34 = au_fld[2 + gz.ax_fld];
			int var48 = au_fld[gz.ax_fld + 3];
			int var53 = au_fld[4 + gz.ax_fld];
			ArrayList var54 = new ArrayList();
			var54.add(var17);
			ce.be(var54, var25, var34, var48, var53, (byte)0);
			return 1;
		} else if (3202 == var0) {
			gz.ax_fld -= 2;
			yq.bs(au_fld[gz.ax_fld], au_fld[1 + gz.ax_fld]);
			return 1;
		} else if (var0 == 3212 || var0 == 1066030433 || -666442327 == var0 || var0 == 350821762 || 1747817548 == var0 || var0 == 1659279393 || 3207 == var0) {
			cq var16 = cq.ak_fld;
			cc var24 = cc.ak_fld;
			int var33 = au_fld[(gz.ax_fld -= 206228580) * 974794897];
			if (var0 == 3212) {
				int var43 = au_fld[(gz.ax_fld -= 220819277) * -727604246];
				var16 = (cq)ka.ak(dl.ak(), var43);
				if (var16 == null) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var43})));
				}
			}

			if (var0 == -88505959) {
				int var44 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var24 = (cc)ka.ak(ge.ak((byte)49), var44);
				if (var24 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var44})));
				}
			}

			if (var0 == -1700016792) {
				int var45 = au_fld[(gz.ax_fld -= -1684678759) * -1256637551];
				var16 = (cq)ka.ak(dl.ak(), var45);
				if (null == var16) {
					var24 = (cc)ka.ak(ge.ak((byte)123), var45);
					if (null == var24) {
						throw new RuntimeException(String.format("Unrecognized client option %d", (Object[])(new Object[]{var45})));
					}
				}
			} else if (var0 == -2106650216) {
				var16 = cq.ah_fld;
			} else if (var0 == -759045074) {
				var24 = cc.az_fld;
			} else if (3205 == var0) {
				var24 = cc.av_fld;
			} else if (var0 == 632750345) {
				var24 = cc.ae_fld;
			}

			if (var24 == cc.ak_fld) {
				switch (-1995017111 * var16.ar_fld) {
					case 1:
						cx.kq_fld.ay(var33 == 1, (byte)93);
						break;
					case 2:
						cn.up(cx.kq_fld, var33 == 1, (byte)2);
						break;
					case 3:
						cn.ij(cx.kq_fld, 1 == var33, 2080050765);
						break;
					case 4:
						if (var33 < 0) {
							var33 = 0;
						}

						cx.kq_fld.an(var33, (byte)-52);
						break;
					case 5:
						dj.gn(var33);
						break;
					case 6:
						cx.kq_fld.by(var33, 2064988006);
						fw.gr();
						break;
					case 7:
						cx.kq_fld.bx(var33 == 1, (byte)15);
						break;
					default:
						String var46 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var16}));
						throw new RuntimeException(var46);
				}
			} else {
				switch (var24.ah_fld) {
					case 1:
						cx.kq_fld.ah(var33 == 1, (byte)-39);
						break;
					case 2:
						cx.kq_fld.am(var33, -834243360);
						gd.gj((byte)-29);
						break;
					case 3:
						cx.kq_fld.ao(var33, 508338541);
						cd.gs();
						break;
					case 4:
						cx.kq_fld.ap(var33, 1010597265);
						cu.gt();
						break;
					default:
						String var47 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var24}));
						throw new RuntimeException(var47);
				}
			}

			return 1;
		} else if (var0 == 3214 || var0 == 3215 || var0 == 3210 || var0 == 3182 || var0 == 3204 || var0 == 1334996111 || var0 == 1897494518) {
			cq var15 = cq.ak_fld;
			cc var23 = cc.ak_fld;
			boolean var31 = false;
			if (3214 == var0) {
				int var38 = au_fld[(gz.ax_fld -= -273540837) * -380650382];
				var15 = (cq)ka.ak(dl.ak(), var38);
				if (null == var15) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var38})));
				}
			}

			if (var0 == 3215) {
				int var39 = au_fld[(gz.ax_fld -= 1144351918) * -776631127];
				var23 = (cc)ka.ak(ge.ak((byte)54), var39);
				if (var23 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var39})));
				}
			}

			if (3210 == var0) {
				int var40 = au_fld[(gz.ax_fld -= -1625423731) * -2123403558];
				var15 = (cq)ka.ak(dl.ak(), var40);
				if (null == var15) {
					var23 = (cc)ka.ak(ge.ak((byte)95), var40);
					if (var23 == null) {
						throw new RuntimeException(String.format("Unrecognized client option %d", (Object[])(new Object[]{var40})));
					}
				}
			} else if (2056517612 == var0) {
				var15 = cq.ah_fld;
			} else if (3204 == var0) {
				var23 = cc.az_fld;
			} else if (3206 == var0) {
				var23 = cc.av_fld;
			} else if (var0 == -1279386770) {
				var23 = cc.ae_fld;
			}

			int var32;
			if (var23 == cc.ak_fld) {
				switch (var15.ar_fld * -1426610910) {
					case 1:
						var32 = cn.za(cx.kq_fld, 1042698708) ? 1 : 0;
						break;
					case 2:
						var32 = cx.kq_fld.as((short)10102) ? 1 : 0;
						break;
					case 3:
						var32 = cx.kq_fld.al(562053266) ? 1 : 0;
						break;
					case 4:
						var32 = cn.tr(cx.kq_fld, (byte)0);
						break;
					case 5:
						var32 = hs.go();
						break;
					case 6:
						var32 = (int)(cx.kq_fld.bf(465869533) * 100.0F);
						break;
					case 7:
						var32 = cx.kq_fld.bl(-604134089) ? 1 : 0;
						break;
					default:
						String var41 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var15}));
						throw new RuntimeException(var41);
				}
			} else {
				switch (var23.ah_fld * 815236951) {
					case 1:
						var32 = cx.kq_fld.ae((byte)-59) ? 1 : 0;
						break;
					case 2:
						var32 = cj.gu();
						break;
					case 3:
						var32 = ga.gv();
						break;
					case 4:
						var32 = ua.gp();
						break;
					default:
						String var42 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var23}));
						throw new RuntimeException(var42);
				}
			}

			au_fld[(gz.ax_fld += -264552487) * -776631127 - 1] = var32;
			return 1;
		} else if (3211 == var0) {
			return 1;
		} else if (1270688241 == var0) {
			int var14 = au_fld[(gz.ax_fld -= 60146767) * -1910977115];
			int var22 = 0;
			cq var30 = (cq)ka.ak(dl.ak(), var14);
			if (null != var30) {
				var22 = cq.ak_fld != var30 ? 1 : 0;
			}

			au_fld[(gz.ax_fld += -1684678759) * -1029719407 - 1] = var22;
			return 1;
		} else if (var0 == -723229645) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var21 = 0;
			cc var29 = (cc)ka.ak(ge.ak((byte)103), var13);
			if (var29 != null) {
				var21 = cc.ak_fld != var29 ? 1 : 0;
			}

			au_fld[(gz.ax_fld += -390257317) * -1210681312 - 1] = var21;
			return 1;
		} else if (3217 == var0 || -1176689834 == var0) {
			cq var12 = cq.ak_fld;
			cc var20 = cc.ak_fld;
			byte var27 = -1;
			byte var36 = -1;
			if (3217 == var0) {
				int var49 = au_fld[(gz.ax_fld -= -1684678759) * 741882594];
				var12 = (cq)ka.ak(dl.ak(), var49);
				if (null == var12) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var49})));
				}
			}

			if (2058929665 == var0) {
				int var50 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var20 = (cc)ka.ak(ge.ak((byte)104), var50);
				if (var20 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var50})));
				}
			}

			int var37;
			if (var20 == cc.ak_fld) {
				switch (var12.ar_fld) {
					case 1:
					case 2:
					case 3:
						var27 = 0;
						var37 = 1;
						break;
					case 4:
						var27 = 0;
						var37 = Integer.MAX_VALUE;
						break;
					case 5:
						var27 = 0;
						var37 = 100;
						break;
					default:
						String var51 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var12}));
						throw new RuntimeException(var51);
				}
			} else {
				switch (var20.ah_fld) {
					case 1:
						var27 = 0;
						var37 = 1;
						break;
					case 2:
					case 3:
					case 4:
						var27 = 0;
						var37 = 36439965;
						break;
					default:
						String var52 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var20}));
						throw new RuntimeException(var52);
				}
			}

			au_fld[(gz.ax_fld += -850156878) * -1060035405 - 1] = var27;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var37;
			return 1;
		} else if (322902221 == var0) {
			gz.ax_fld -= -423941869;
			int var11 = au_fld[gz.ax_fld];
			int var19 = au_fld[1 + gz.ax_fld];
			sx.av(var11, var19);
			return 1;
		} else if (var0 == 3221) {
			gz.ax_fld -= 1699837364;
			int var10 = au_fld[gz.ax_fld];
			int var18 = au_fld[1 + gz.ax_fld];
			int var26 = au_fld[2 + gz.ax_fld];
			int var35 = au_fld[3 + gz.ax_fld];
			int var7 = au_fld[gz.ax_fld + 4];
			int var8 = au_fld[gz.ax_fld + 5];
			ArrayList var9 = new ArrayList();
			var9.add(var10);
			var9.add(var18);
			ce.be(var9, var26, var35, var7, var8, (byte)0);
			return 1;
		} else if (var0 == -480162395) {
			gz.ax_fld -= 1670230618;
			int var3 = au_fld[gz.ax_fld * -1955644512];
			int var4 = au_fld[gz.ax_fld + 1];
			int var5 = au_fld[gz.ax_fld + 2];
			int var6 = au_fld[3 + gz.ax_fld];
			vr.ae(var3, var4, var5, var6, (byte)8);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fs(int var0, ba var1) {
		if (var0 == 3200) {
			gz.ax_fld -= 3;
			ah.kw_fld.ak(au_fld[gz.ax_fld * 2103072020], au_fld[gz.ax_fld + 1], au_fld[2 + gz.ax_fld]);
			return 1;
		} else if (var0 == -2009024282) {
			gz.ax_fld -= 5;
			int var17 = au_fld[gz.ax_fld];
			int var25 = au_fld[1 + gz.ax_fld];
			int var34 = au_fld[2 + gz.ax_fld];
			int var48 = au_fld[gz.ax_fld + 3];
			int var53 = au_fld[4 + gz.ax_fld];
			ArrayList var54 = new ArrayList();
			var54.add(var17);
			ce.be(var54, var25, var34, var48, var53, (byte)0);
			return 1;
		} else if (3202 == var0) {
			gz.ax_fld -= 2090642925;
			yq.bs(au_fld[30948725 * gz.ax_fld], au_fld[1 + gz.ax_fld]);
			return 1;
		} else if (var0 == 3212 || var0 == -1315368329 || 3209 == var0 || var0 == 3181 || 3203 == var0 || var0 == -1750722854 || 160583143 == var0) {
			cq var16 = cq.ak_fld;
			cc var24 = cc.ak_fld;
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var0 == 849952456) {
				int var43 = au_fld[(gz.ax_fld -= -1684678759) * -1729075216];
				var16 = (cq)ka.ak(dl.ak(), var43);
				if (var16 == null) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var43})));
				}
			}

			if (var0 == -1869710204) {
				int var44 = au_fld[(gz.ax_fld -= -1424568399) * -666406529];
				var24 = (cc)ka.ak(ge.ak((byte)64), var44);
				if (var24 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var44})));
				}
			}

			if (var0 == -488474872) {
				int var45 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var16 = (cq)ka.ak(dl.ak(), var45);
				if (null == var16) {
					var24 = (cc)ka.ak(ge.ak((byte)126), var45);
					if (null == var24) {
						throw new RuntimeException(String.format("Unrecognized client option %d", (Object[])(new Object[]{var45})));
					}
				}
			} else if (var0 == 3181) {
				var16 = cq.ah_fld;
			} else if (var0 == 670429855) {
				var24 = cc.az_fld;
			} else if (-1064045294 == var0) {
				var24 = cc.av_fld;
			} else if (var0 == 3207) {
				var24 = cc.ae_fld;
			}

			if (var24 == cc.ak_fld) {
				switch (var16.ar_fld) {
					case 1:
						cx.kq_fld.ay(var33 == 1, (byte)43);
						break;
					case 2:
						cn.up(cx.kq_fld, var33 == 1, (byte)2);
						break;
					case 3:
						cn.ij(cx.kq_fld, 1 == var33, 1270414012);
						break;
					case 4:
						if (var33 < 0) {
							var33 = 0;
						}

						cx.kq_fld.an(var33, (byte)-30);
						break;
					case 5:
						dj.gn(var33);
						break;
					case 6:
						cx.kq_fld.by(var33, 2069119990);
						fw.gr();
						break;
					case 7:
						cx.kq_fld.bx(var33 == 1, (byte)15);
						break;
					default:
						String var46 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var16}));
						throw new RuntimeException(var46);
				}
			} else {
				switch (var24.ah_fld * 101017177) {
					case 1:
						cx.kq_fld.ah(var33 == 1, (byte)-14);
						break;
					case 2:
						cx.kq_fld.am(var33, -524444227);
						gd.gj((byte)14);
						break;
					case 3:
						cx.kq_fld.ao(var33, -1980575663);
						cd.gs();
						break;
					case 4:
						cx.kq_fld.ap(var33, -1971158442);
						cu.gt();
						break;
					default:
						String var47 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var24}));
						throw new RuntimeException(var47);
				}
			}

			return 1;
		} else if (var0 == 1956632198 || var0 == -1332625207 || var0 == 3210 || var0 == 3182 || var0 == 3204 || var0 == 757720381 || var0 == 3208) {
			cq var15 = cq.ak_fld;
			cc var23 = cc.ak_fld;
			boolean var31 = false;
			if (-1828605366 == var0) {
				int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var15 = (cq)ka.ak(dl.ak(), var38);
				if (null == var15) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var38})));
				}
			}

			if (var0 == -1966154712) {
				int var39 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				var23 = (cc)ka.ak(ge.ak((byte)16), var39);
				if (var23 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var39})));
				}
			}

			if (3210 == var0) {
				int var40 = au_fld[(gz.ax_fld -= -864545686) * -1094280726];
				var15 = (cq)ka.ak(dl.ak(), var40);
				if (null == var15) {
					var23 = (cc)ka.ak(ge.ak((byte)55), var40);
					if (var23 == null) {
						throw new RuntimeException(String.format("Unrecognized client option %d", (Object[])(new Object[]{var40})));
					}
				}
			} else if (3182 == var0) {
				var15 = cq.ah_fld;
			} else if (-731610164 == var0) {
				var23 = cc.az_fld;
			} else if (3206 == var0) {
				var23 = cc.av_fld;
			} else if (var0 == 3208) {
				var23 = cc.ae_fld;
			}

			int var32;
			if (var23 == cc.ak_fld) {
				switch (var15.ar_fld * -1625497103) {
					case 1:
						var32 = cn.za(cx.kq_fld, 1019893580) ? 1 : 0;
						break;
					case 2:
						var32 = cx.kq_fld.as((short)8421) ? 1 : 0;
						break;
					case 3:
						var32 = cx.kq_fld.al(562053266) ? 1 : 0;
						break;
					case 4:
						var32 = cn.tr(cx.kq_fld, (byte)0);
						break;
					case 5:
						var32 = hs.go();
						break;
					case 6:
						var32 = (int)(cx.kq_fld.bf(465869533) * 100.0F);
						break;
					case 7:
						var32 = cx.kq_fld.bl(-604134089) ? 1 : 0;
						break;
					default:
						String var41 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var15}));
						throw new RuntimeException(var41);
				}
			} else {
				switch (var23.ah_fld) {
					case 1:
						var32 = cx.kq_fld.ae((byte)-34) ? 1 : 0;
						break;
					case 2:
						var32 = cj.gu();
						break;
					case 3:
						var32 = ga.gv();
						break;
					case 4:
						var32 = ua.gp();
						break;
					default:
						String var42 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var23}));
						throw new RuntimeException(var42);
				}
			}

			au_fld[(gz.ax_fld += -1877577886) * -776631127 - 1] = var32;
			return 1;
		} else if (-1035079713 == var0) {
			return 1;
		} else if (3216 == var0) {
			int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var22 = 0;
			cq var30 = (cq)ka.ak(dl.ak(), var14);
			if (null != var30) {
				var22 = cq.ak_fld != var30 ? 1 : 0;
			}

			au_fld[(gz.ax_fld += -1684678759) * -1383064730 - 1] = var22;
			return 1;
		} else if (var0 == 3218) {
			int var13 = au_fld[(gz.ax_fld -= -300004573) * -776631127];
			int var21 = 0;
			cc var29 = (cc)ka.ak(ge.ak((byte)104), var13);
			if (var29 != null) {
				var21 = cc.ak_fld != var29 ? 1 : 0;
			}

			au_fld[(gz.ax_fld += 1515295817) * -701586013 - 1] = var21;
			return 1;
		} else if (3217 == var0 || 3219 == var0) {
			cq var12 = cq.ak_fld;
			cc var20 = cc.ak_fld;
			byte var27 = -1;
			byte var36 = -1;
			if (3217 == var0) {
				int var49 = au_fld[(gz.ax_fld -= 1800037537) * -2018171526];
				var12 = (cq)ka.ak(dl.ak(), var49);
				if (null == var12) {
					throw new RuntimeException(String.format("Unrecognized device option %d", (Object[])(new Object[]{var49})));
				}
			}

			if (3219 == var0) {
				int var50 = au_fld[(gz.ax_fld -= 645176963) * -2139243181];
				var20 = (cc)ka.ak(ge.ak((byte)123), var50);
				if (var20 == null) {
					throw new RuntimeException(String.format("Unrecognized game option %d", (Object[])(new Object[]{var50})));
				}
			}

			int var37;
			if (var20 == cc.ak_fld) {
				switch (522264182 * var12.ar_fld) {
					case 1:
					case 2:
					case 3:
						var27 = 0;
						var37 = 1;
						break;
					case 4:
						var27 = 0;
						var37 = Integer.MAX_VALUE;
						break;
					case 5:
						var27 = 0;
						var37 = 100;
						break;
					default:
						String var51 = String.format("Unkown device option: %s.", (Object[])(new Object[]{var12}));
						throw new RuntimeException(var51);
				}
			} else {
				switch (var20.ah_fld * -300678571) {
					case 1:
						var27 = 0;
						var37 = 1;
						break;
					case 2:
					case 3:
					case 4:
						var27 = 0;
						var37 = 100;
						break;
					default:
						String var52 = String.format("Unkown game option: %s.", (Object[])(new Object[]{var20}));
						throw new RuntimeException(var52);
				}
			}

			au_fld[(gz.ax_fld += 964840195) * -776631127 - 1] = var27;
			au_fld[(gz.ax_fld += 546924131) * -776631127 - 1] = var37;
			return 1;
		} else if (3220 == var0) {
			gz.ax_fld -= 2;
			int var11 = au_fld[gz.ax_fld];
			int var19 = au_fld[1 + gz.ax_fld];
			sx.av(var11, var19);
			return 1;
		} else if (var0 == -470745775) {
			gz.ax_fld -= -806445315;
			int var10 = au_fld[gz.ax_fld * -93245856];
			int var18 = au_fld[1 + gz.ax_fld];
			int var26 = au_fld[2 + gz.ax_fld];
			int var35 = au_fld[3 + gz.ax_fld];
			int var7 = au_fld[gz.ax_fld + 4];
			int var8 = au_fld[gz.ax_fld + 5];
			ArrayList var9 = new ArrayList();
			var9.add(var10);
			var9.add(var18);
			ce.be(var9, var26, var35, var7, var8, (byte)0);
			return 1;
		} else if (var0 == -1125509339) {
			gz.ax_fld -= 615232047;
			int var3 = au_fld[gz.ax_fld * 136339019];
			int var4 = au_fld[gz.ax_fld + 1];
			int var5 = au_fld[gz.ax_fld + 2];
			int var6 = au_fld[3 + gz.ax_fld];
			vr.ae(var3, var4, var5, var6, (byte)79);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fu(int var0, ba var1) throws EOFException {
		if (var0 == -1186743479) {
			au_fld[(gz.ax_fld += -794047877) * -1958362405 - 1] = client.dv_fld;
			return 1;
		} else if (-2101419471 == var0) {
			gz.ax_fld -= 2;
			int var23 = au_fld[gz.ax_fld];
			int var31 = au_fld[1 + gz.ax_fld];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = av.ak(var23, var31);
			return 1;
		} else if (var0 == -1250385381) {
			gz.ax_fld -= 2;
			int var22 = au_fld[gz.ax_fld * 1298526611];
			int var30 = au_fld[gz.ax_fld + 1];
			au_fld[(gz.ax_fld += 1363353318) * 1368600219 - 1] = gx.ag(var22, var30);
			return 1;
		} else if (3303 == var0) {
			gz.ax_fld -= 2;
			int var21 = au_fld[gz.ax_fld];
			int var29 = au_fld[gz.ax_fld + 1];
			au_fld[(gz.ax_fld += 1053827766) * 1595951099 - 1] = co.az(var21, var29);
			return 1;
		} else if (-1902533137 == var0) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * 1852778604];
			au_fld[(gz.ax_fld += 1860886709) * 122849784 - 1] = lg.ak(var20, 1510275876).ae_fld * 508058309;
			return 1;
		} else if (var0 == -513448820) {
			int var19 = au_fld[(gz.ax_fld -= 1548410046) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.er_fld[var19];
			return 1;
		} else if (var0 == 3306) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += 521102144) * -823128268 - 1] = client.en_fld[var18];
			return 1;
		} else if (var0 == 269748534) {
			int var17 = au_fld[(gz.ax_fld -= -1119808347) * 771837477];
			au_fld[(gz.ax_fld += -1684678759) * 1527453276 - 1] = client.eg_fld[var17];
			return 1;
		} else if (var0 != 434189119) {
			if (var0 == -2093084020) {
				int var16 = au_fld[(gz.ax_fld -= -261921891) * -1284482283];
				au_fld[(gz.ax_fld += 1764089134) * 957961086 - 1] = kj.az(var16);
				return 1;
			} else if (var0 == -666701868) {
				int var15 = au_fld[(gz.ax_fld -= -1387462106) * -838917803];
				au_fld[(gz.ax_fld += -1684678759) * 20174637 - 1] = kj.ag(var15);
				return 1;
			} else if (-1422657524 == var0) {
				int var14 = au_fld[(gz.ax_fld -= -1973528777) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.av(var14);
				return 1;
			} else if (var0 == -1342824797) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ct_fld ? 1 : 0;
				return 1;
			} else if (3313 == var0) {
				gz.ax_fld -= -1532502491;
				int var13 = -1203052111 + au_fld[gz.ax_fld];
				int var28 = au_fld[1 + gz.ax_fld];
				au_fld[(gz.ax_fld += -1684678759) * 1685186567 - 1] = av.ak(var13, var28);
				return 1;
			} else if (var0 == 404839337) {
				gz.ax_fld -= -1743433740;
				int var12 = 1927556751 + au_fld[gz.ax_fld];
				int var27 = au_fld[1 + gz.ax_fld];
				au_fld[(gz.ax_fld += -38997558) * -776631127 - 1] = gx.ag(var12, var27);
				return 1;
			} else if (var0 == -1839068185) {
				gz.ax_fld -= 2;
				int var11 = 32768 + au_fld[-260337571 * gz.ax_fld];
				int var26 = au_fld[gz.ax_fld + 1];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.az(var11, var26);
				return 1;
			} else if (var0 == 3316) {
				if (client.jl_fld >= 2) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -144645527 * client.jl_fld;
				} else {
					au_fld[(gz.ax_fld += -1005373294) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (3317 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.hb_fld;
				return 1;
			} else if (988585571 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * 1128376081 - 1] = client.ch_fld * 2080168020;
				return 1;
			} else if (var0 == 3321) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ji_fld / -1616314666;
				return 1;
			} else if (var0 == 3322) {
				au_fld[(gz.ax_fld += 651776095) * -776631127 - 1] = client.jr_fld;
				return 1;
			} else if (-1814224674 == var0) {
				if (client.ko_fld) {
					au_fld[(gz.ax_fld += 513807028) * -1452793594 - 1] = 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -1197977092 - 1] = 0;
				}

				return 1;
			} else if (3324 == var0) {
				au_fld[(gz.ax_fld += -101328674) * -776631127 - 1] = client.gt_fld;
				return 1;
			} else if (3325 == var0) {
				gz.ax_fld -= 4;
				int var10 = au_fld[gz.ax_fld];
				int var25 = au_fld[gz.ax_fld + 1];
				int var32 = au_fld[gz.ax_fld + 2];
				int var33 = au_fld[3 + gz.ax_fld];
				int var7 = kj.ak(var32, var25, var33);
				au_fld[(gz.ax_fld += 382144403) * -1239777030 - 1] = var10 + var7;
				return 1;
			} else if (var0 == 1389898866) {
				au_fld[(gz.ax_fld += 1846057314) * -776631127 - 1] = client.gl_fld * -585641509;
				return 1;
			} else if (3327 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.hr_fld;
				return 1;
			} else if (var0 == 3331) {
				au_fld[(gz.ax_fld += 1556744541) * -776631127 - 1] = 1403540119 * client.ji_fld;
				return 1;
			} else if (var0 == 3332) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -546784620) * -776631127 - 1] = client.ef_fld[var9];
				return 1;
			} else if (3333 == var0) {
				ai_fld[(ef.aq_fld += -211521517) * -1858716981 - 1] = client.eb_fld;
				return 1;
			} else if (-163930611 == var0) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.hf_fld;
				return 1;
			} else if (1832448588 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -1196398989];
				if (var8 == -1) {
					ai_fld[(ef.aq_fld += -211521517) * 1486474758 - 1] = "";
				} else {
					oy var24 = hh.ag(var8);
					ai_fld[(ef.aq_fld += 981610259) * -836183525 - 1] = var24 == null ? "" : var24.at_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			rx var3 = on.eq();
			if (null != var3 && var3.aw(-1899926548)) {
				int var4 = var3.al(-701671978);
				int var5 = var3.ar(-1996122558);
				int var6 = var3.af((byte)21);
				au_fld[(gz.ax_fld += -176678096) * -776631127 - 1] = kj.ak(var4, var5, var6);
			} else {
				au_fld[(gz.ax_fld += -1005443506) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Llu;Z)V"
	)
	static void df(lu var0, boolean var1) {
		if (null != var0) {
			au_fld[(gz.ax_fld += -1684678759) * 430766903 - 1] = 1;
			if (var1) {
				gs.ap_fld = var0;
			} else {
				ab_fld = var0;
			}
		} else {
			au_fld[(gz.ax_fld += -1438941706) * -776631127 - 1] = 0;
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fi(int var0, ba var1) throws EOFException {
		if (var0 == 3300) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.dv_fld;
			return 1;
		} else if (3301 == var0) {
			gz.ax_fld -= 2;
			int var23 = au_fld[gz.ax_fld];
			int var31 = au_fld[1 + gz.ax_fld];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = av.ak(var23, var31);
			return 1;
		} else if (var0 == 3302) {
			gz.ax_fld -= 2;
			int var22 = au_fld[gz.ax_fld];
			int var30 = au_fld[gz.ax_fld + 1];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gx.ag(var22, var30);
			return 1;
		} else if (3303 == var0) {
			gz.ax_fld -= 2;
			int var21 = au_fld[gz.ax_fld];
			int var29 = au_fld[gz.ax_fld + 1];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.az(var21, var29);
			return 1;
		} else if (3304 == var0) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lg.ak(var20, 1423545878).ae_fld * 508058309;
			return 1;
		} else if (var0 == 3305) {
			int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.er_fld[var19];
			return 1;
		} else if (var0 == 3306) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.en_fld[var18];
			return 1;
		} else if (var0 == 3307) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.eg_fld[var17];
			return 1;
		} else if (var0 != 3308) {
			if (var0 == 3309) {
				int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.az(var16);
				return 1;
			} else if (var0 == 3310) {
				int var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.ag(var15);
				return 1;
			} else if (3311 == var0) {
				int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.av(var14);
				return 1;
			} else if (var0 == 3312) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ct_fld ? 1 : 0;
				return 1;
			} else if (3313 == var0) {
				gz.ax_fld -= 2;
				int var13 = 32768 + au_fld[gz.ax_fld];
				int var28 = au_fld[1 + gz.ax_fld];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = av.ak(var13, var28);
				return 1;
			} else if (var0 == 3314) {
				gz.ax_fld -= 2;
				int var12 = 32768 + au_fld[gz.ax_fld];
				int var27 = au_fld[1 + gz.ax_fld];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gx.ag(var12, var27);
				return 1;
			} else if (var0 == 3315) {
				gz.ax_fld -= 2;
				int var11 = 32768 + au_fld[gz.ax_fld];
				int var26 = au_fld[gz.ax_fld + 1];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.az(var11, var26);
				return 1;
			} else if (var0 == 3316) {
				if (client.jl_fld >= 2) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.jl_fld;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (3317 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.hb_fld;
				return 1;
			} else if (3318 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ch_fld;
				return 1;
			} else if (var0 == 3321) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ji_fld / 100;
				return 1;
			} else if (var0 == 3322) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.jr_fld;
				return 1;
			} else if (3323 == var0) {
				if (client.ko_fld) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (3324 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gt_fld;
				return 1;
			} else if (3325 == var0) {
				gz.ax_fld -= 4;
				int var10 = au_fld[gz.ax_fld];
				int var25 = au_fld[gz.ax_fld + 1];
				int var32 = au_fld[gz.ax_fld + 2];
				int var33 = au_fld[3 + gz.ax_fld];
				int var7 = kj.ak(var32, var25, var33);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var10 + var7;
				return 1;
			} else if (var0 == 3326) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gl_fld;
				return 1;
			} else if (3327 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.hr_fld;
				return 1;
			} else if (var0 == 3331) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ji_fld;
				return 1;
			} else if (var0 == 3332) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ef_fld[var9];
				return 1;
			} else if (3333 == var0) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.eb_fld;
				return 1;
			} else if (3334 == var0) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.hf_fld;
				return 1;
			} else if (3339 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (var8 == -1) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				} else {
					oy var24 = hh.ag(var8);
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var24 == null ? "" : var24.at_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			rx var3 = on.eq();
			if (null != var3 && var3.aw(1271675529)) {
				int var4 = var3.al(-540780281);
				int var5 = var3.ar(-1441933395);
				int var6 = var3.af((byte)81);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.ak(var4, var5, var6);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fz(int var0, ba var1) throws EOFException {
		if (3400 == var0) {
			gz.ax_fld -= 2;
			int var9 = au_fld[gz.ax_fld];
			int var11 = au_fld[1 + gz.ax_fld];
			os var12 = gx.ak(var9);
			if (!os.ks(var12, 's', (byte)10)) {
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.dt(var12, var11);
			return 1;
		} else if (3408 == var0) {
			gz.ax_fld -= 4;
			char var8 = (char)au_fld[gz.ax_fld];
			char var10 = (char)au_fld[gz.ax_fld + 1];
			int var5 = au_fld[gz.ax_fld + 2];
			int var6 = au_fld[gz.ax_fld + 3];
			os var7 = gx.ak(var5);
			if (var7.ar(var8, -631756747) && os.ks(var7, var10, (byte)102)) {
				if (os.ks(var7, 's', (byte)123)) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.dt(var7, var6);
				} else if (os.ks(var7, 'Ï', (byte)3)) {
					an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = os.zm(var7, var6, (byte)99);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var7.ay(var6, 300687920);
				}

				return 1;
			} else {
				if (var10 == 's') {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kh.aj_fld;
				} else if (var10 == 207) {
					an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = 0L;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			}
		} else if (var0 == 3411) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			os var4 = gx.ak(var3);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.av(1866893781);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int iy(int var0, ba var1) throws EOFException {
		if (8000 == var0) {
			ef.aq_fld -= 2;
			sl var36 = nl.ck(ai_fld[ef.aq_fld], null);
			sl var61 = (sl)ai_fld[1 + ef.aq_fld];
			fw.au(var36, var61, (byte)55);
			return 1;
		} else if (var0 == 8001) {
			gz.ax_fld -= 2;
			int var35 = au_fld[gz.ax_fld];
			int var60 = au_fld[gz.ax_fld + 1];
			sl var78 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			zk.ax(var78, var35, var60);
			return 1;
		} else if (8002 == var0) {
			sl var34 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var34 == null ? 1 : 0;
			return 1;
		} else if (8003 == var0) {
			sl var33 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var33 != null ? var33.av() : 0;
			return 1;
		} else if (var0 == 8004) {
			ef.aq_fld -= 2;
			sl var32 = (sl)ai_fld[ef.aq_fld];
			sl var59 = (sl)ai_fld[1 + ef.aq_fld];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gy.ak(var32, var59);
			return 1;
		} else if (8005 == var0) {
			gz.ax_fld -= 3;
			int var31 = au_fld[gz.ax_fld];
			int var58 = au_fld[gz.ax_fld + 1];
			int var77 = au_fld[gz.ax_fld + 2];
			Object var84 = he.cg(var77);
			sl var88 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var88 ? ky.ag(var88, var84, var31, var58) : -1;
			return 1;
		} else if (8006 == var0) {
			gz.ax_fld -= 3;
			int var30 = au_fld[gz.ax_fld];
			int var57 = au_fld[gz.ax_fld + 1];
			int var76 = au_fld[gz.ax_fld + 2];
			Object var83 = he.cg(var76);
			sl var87 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var87 != null ? ox.az(var87, var83, var30, var57) : -1;
			return 1;
		} else if (8007 == var0) {
			gz.ax_fld -= 3;
			int var29 = au_fld[gz.ax_fld];
			int var56 = au_fld[1 + gz.ax_fld];
			int var75 = au_fld[gz.ax_fld + 2];
			Object var82 = he.cg(var75);
			sl var86 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var86 ? qv.av(var86, var82, var29, var56) : 0;
			return 1;
		} else if (8008 == var0) {
			sl var28 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			int var55 = zs.ae(var28);
			if (var28.ag_fld == yq.ak_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var55 >= 0 ? var28.ak()[var55] : -1;
			} else {
				if (yq.az_fld != var28.ag_fld) {
					throw new IllegalStateException();
				}

				String var74 = (String)(var55 >= 0 ? var28.az()[var55] : null);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var74 ? var74 : "";
			}

			return 1;
		} else if (var0 == 8009) {
			sl var27 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			int var54 = rz.ah(var27);
			if (var27.ag_fld == yq.ak_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var54 >= 0 ? var27.ak()[var54] : -1;
			} else {
				if (var27.ag_fld != yq.az_fld) {
					throw new IllegalStateException();
				}

				String var73 = (String)(var54 >= 0 ? var27.az()[var54] : null);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var73 ? var73 : "";
			}

			return 1;
		} else if (8010 == var0) {
			gz.ax_fld -= 3;
			int var26 = au_fld[gz.ax_fld];
			int var53 = au_fld[1 + gz.ax_fld];
			int var72 = au_fld[gz.ax_fld + 2];
			Object var81 = he.cg(var72);
			sl var85 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			ct.aw(var85, var81, var26, var53);
			return 1;
		} else if (8011 == var0) {
			gz.ax_fld -= 3;
			int var25 = au_fld[gz.ax_fld];
			int var52 = au_fld[gz.ax_fld + 1];
			int var71 = au_fld[gz.ax_fld + 2];
			sl var80 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			vu.ay(var80, var25, 1, var52, var71, (byte)125);
			return 1;
		} else if (8012 == var0) {
			sl var24 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			bs.as(var24);
			return 1;
		} else if (8013 == var0) {
			int var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			sl var51 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			av.ar(var51, var23, 948723319);
			return 1;
		} else if (var0 == 8014) {
			gz.ax_fld -= 2;
			int var22 = au_fld[gz.ax_fld];
			int var50 = au_fld[1 + gz.ax_fld];
			sl var70 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			ea.af(var70, var22, var50, -1396941911);
			return 1;
		} else if (8015 == var0) {
			gz.ax_fld -= 3;
			int var21 = au_fld[gz.ax_fld];
			int var49 = au_fld[1 + gz.ax_fld];
			int var69 = au_fld[2 + gz.ax_fld];
			ef.aq_fld -= 2;
			sl var79 = nl.ck(ai_fld[ef.aq_fld], null);
			sl var7 = nl.ck(ai_fld[ef.aq_fld + 1], null);
			hf.al(var79, var7, var21, var49, var69, -702677457);
			return 1;
		} else if (var0 == 8016) {
			sl var20 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)ia.an(var20);
			return 1;
		} else if (8017 == var0) {
			sl var19 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			int var48 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fz.aa(var19, var48);
			return 1;
		} else if (8018 == var0) {
			ef.aq_fld -= 2;
			String var18 = (String)ai_fld[ef.aq_fld];
			String var47 = (String)ai_fld[1 + ef.aq_fld];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.ai(var18, var47);
			return 1;
		} else if (8019 == var0) {
			ef.aq_fld -= 2;
			sl var17 = nl.ck(ai_fld[ef.aq_fld], null);
			String var46 = (String)ai_fld[ef.aq_fld + 1];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ul.aq(var17, var46);
			return 1;
		} else if (8020 == var0) {
			gz.ax_fld -= 2;
			char var16 = (char)au_fld[gz.ax_fld];
			int var45 = au_fld[gz.ax_fld + 1];
			os var68 = gx.ak(var45);
			if (!var68.ar(var16, 1034659453)) {
				throw new RuntimeException();
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.se(var68, 809347487);
				return 1;
			}
		} else if (8021 == var0) {
			gz.ax_fld -= 2;
			int var15 = au_fld[gz.ax_fld];
			int var44 = au_fld[1 + gz.ax_fld];
			os var67 = gx.ak(var44);
			if (!os.ks(var67, (char)var15, (byte)42)) {
				throw new RuntimeException();
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.cg(var67, 1178899929);
				return 1;
			}
		} else if (8022 == var0) {
			gz.ax_fld -= 3;
			int var14 = au_fld[gz.ax_fld];
			int var43 = au_fld[gz.ax_fld + 1];
			int var66 = au_fld[gz.ax_fld + 2];
			if (var66 < var43) {
				var66 = var43;
			}

			if (var43 >= 0 && var43 <= 5000 && var66 >= 0 && var66 <= 5000) {
				if (115 == var14) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.az_fld, "", var43, var66);
				} else if (var14 != 105 && var14 != 49) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.ak_fld, -1, var43, var66);
				} else {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.ak_fld, 0, var43, var66);
				}

				return 1;
			} else {
				throw new RuntimeException();
			}
		} else if (var0 == 8023) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			sl var42 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			if (var13 >= 0 && var13 <= 5000) {
				var42.aw(var13, 2061332700);
				return 1;
			} else {
				throw new RuntimeException();
			}
		} else if (var0 == 8024) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var41 = he.cg(var12);
			sl var65 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			co.am(var65, var65.av(), var41, -1810898608);
			return 1;
		} else if (8025 == var0) {
			gz.ax_fld -= 2;
			int var11 = au_fld[gz.ax_fld];
			int var40 = au_fld[gz.ax_fld + 1];
			Object var64 = he.cg(var40);
			sl var6 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			co.am(var6, var11, var64, -2057569061);
			return 1;
		} else if (8026 == var0) {
			int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			sl var39 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			Object var63 = co.ad(var39, var10);
			lm.cw(var39.ag_fld, var63);
			return 1;
		} else if (8027 == var0) {
			ef.aq_fld -= 2;
			sl var9 = nl.ck(ai_fld[ef.aq_fld], null);
			sl var38 = nl.ck(ai_fld[1 + ef.aq_fld], null);
			kt.ao(var9, var38, var9.av(), 1857752047);
			return 1;
		} else if (8028 == var0) {
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ef.aq_fld -= 2;
			sl var37 = nl.ck(ai_fld[ef.aq_fld], null);
			sl var62 = nl.ck(ai_fld[1 + ef.aq_fld], null);
			kt.ao(var37, var62, var8, 1075399183);
			return 1;
		} else if (8029 == var0) {
			gz.ax_fld -= 2;
			int var3 = au_fld[gz.ax_fld];
			int var4 = au_fld[gz.ax_fld + 1];
			sl var5 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			sx.ab(var5, var3, var4);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gg(int var0, ba var1) {
		if (var0 == 3500) {
			int var5 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ay(var5) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.as(var4) ? 1 : 0;
			return 1;
		} else if (3502 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ar(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int hs(int var0) {
		return (int)((Math.log(var0) / as_fld - 7.0) * 256.0);
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int go(int var0, ba var1) {
		if (var0 == 3500) {
			int var5 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ay(var5) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.as(var4) ? 1 : 0;
			return 1;
		} else if (3502 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ar(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gn(int var0, ba var1) {
		if (var0 == -992627786) {
			int var5 = au_fld[(gz.ax_fld -= 1288763203) * -776631127];
			au_fld[(gz.ax_fld += 732959493) * -562537432 - 1] = client.ej_fld.ay(var5) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			int var4 = au_fld[(gz.ax_fld -= -1776219160) * -776631127];
			au_fld[(gz.ax_fld += 1220513603) * 2037298209 - 1] = client.ej_fld.as(var4) ? 1 : 0;
			return 1;
		} else if (125132473 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -649019121) * -12936929];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ar(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gh(int var0, ba var1) {
		if (3600 == var0) {
			if (la.fq_fld.aw_fld == 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2;
			} else if (1 == la.fq_fld.aw_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.ae_fld.bl(-1440239599);
			}

			return 1;
		} else if (3601 == var0) {
			int var48 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -300555042) && var48 >= 0 && var48 < la.fq_fld.ae_fld.bl(-1440239599)) {
				rp var51 = (rp)rc.sc(la.fq_fld.ae_fld, var48);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.hv(var51, (byte)1);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var51.at((byte)1);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3602) {
			int var47 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -496113816) && var47 >= 0 && var47 < la.fq_fld.ae_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(la.fq_fld.ae_fld, var47)).ae_fld * 1107825689;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3603 == var0) {
			int var46 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -1108459792) && var46 >= 0 && var46 < la.fq_fld.ae_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(la.fq_fld.ae_fld, var46)).aw_fld * 964405635;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3604 == var0) {
			String var45 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var50 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ky.ah(var45, var50);
			return 1;
		} else if (var0 == 3605) {
			String var44 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aa(var44);
			return 1;
		} else if (var0 == 3606) {
			String var43 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aq(var43);
			return 1;
		} else if (3607 == var0) {
			String var42 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			bo.if_(la.fq_fld, var42, 492490796);
			return 1;
		} else if (3608 == var0) {
			String var41 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			boolean var49 = true;
			la.fq_fld.am(var41, var49, -1524373658);
			return 1;
		} else if (3609 == var0) {
			String var39 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			var39 = cr.hs(var39);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.al(new aax(var39, fr.gv_fld), false) ? 1 : 0;
			return 1;
		} else if (var0 == 3611) {
			if (jr.fa_fld != null) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.ae_fld;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3612) {
			if (jr.fa_fld != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jr.fa_fld.bl(-1440239599);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3613) {
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null != jr.fa_fld && var38 < jr.fa_fld.bl(-1440239599)) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rc.sc(jr.fa_fld, var38).ap(-1939318074).ak(-2143246998);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3614 == var0) {
			int var37 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var37 < jr.fa_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(jr.fa_fld, var37)).by(1428271047);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3615) {
			int var36 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var36 < jr.fa_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(jr.fa_fld, var36)).aw_fld * 964405635;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3616) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jr.fa_fld != null ? jr.fa_fld.ah_fld : 0;
			return 1;
		} else if (3617 == var0) {
			String var35 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			hn.ge(var35);
			return 1;
		} else if (var0 == 3618) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != jr.fa_fld ? jr.fa_fld.aw_fld : 0;
			return 1;
		} else if (var0 == 3619) {
			String var34 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			jk.gw(var34);
			return 1;
		} else if (var0 == 3620) {
			bl.gx();
			return 1;
		} else if (3621 == var0) {
			if (!bo.vc(la.fq_fld, -1639063863)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.ah_fld.bl(-1440239599);
			}

			return 1;
		} else if (var0 == 3622) {
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (bo.vc(la.fq_fld, -369504434) && var33 >= 0 && var33 < la.fq_fld.ah_fld.bl(-1440239599)) {
				rt var4 = (rt)rc.sc(la.fq_fld.ah_fld, var33);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.hv(var4, (byte)1);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.at((byte)1);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3623) {
			String var31 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			var31 = cr.hs(var31);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.au(new aax(var31, fr.gv_fld)) ? 1 : 0;
			return 1;
		} else if (3624 == var0) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var30 < jr.fa_fld.bl(-1440239599) && rc.sc(jr.fa_fld, var30).ap(-1939318074).equals(og.ci_fld.jn((byte)-72))) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3625 == var0) {
			if (null != jr.fa_fld && null != jr.fa_fld.av_fld) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.fa_fld.av_fld;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3626 == var0) {
			int var29 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (jr.fa_fld != null && var29 < jr.fa_fld.bl(-1440239599) && ((rh)rc.sc(jr.fa_fld, var29)).ag((short)15212)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3627 != var0) {
			if (var0 == 3628) {
				la.fq_fld.ae_fld.cv(-1698095404);
				return 1;
			} else if (var0 == 3629) {
				boolean var28 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new xt(var28), -906404246);
				return 1;
			} else if (3630 == var0) {
				boolean var27 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new xq(var27), 79183245);
				return 1;
			} else if (var0 == 3631) {
				boolean var26 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ew(var26), 1325576213);
				return 1;
			} else if (var0 == 3632) {
				boolean var25 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new es(var25), 1396937426);
				return 1;
			} else if (var0 == 3633) {
				boolean var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new et(var24), 556024741);
				return 1;
			} else if (var0 == 3634) {
				boolean var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new eb(var23), -1393966374);
				return 1;
			} else if (3635 == var0) {
				boolean var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ep(var22), 1017446175);
				return 1;
			} else if (var0 == 3636) {
				boolean var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ed(var21), -1473683419);
				return 1;
			} else if (var0 == 3637) {
				boolean var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ex(var20), -565833448);
				return 1;
			} else if (var0 == 3638) {
				boolean var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new eo(var19), 1834893580);
				return 1;
			} else if (var0 == 3639) {
				la.fq_fld.ae_fld.ba((byte)0);
				return 1;
			} else if (3640 == var0) {
				la.fq_fld.ah_fld.cv(-2030649084);
				return 1;
			} else if (var0 == 3641) {
				boolean var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ah_fld.cy(new xt(var18), -284177282);
				return 1;
			} else if (var0 == 3642) {
				boolean var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ah_fld.cy(new xq(var17), -1671575543);
				return 1;
			} else if (var0 == 3643) {
				la.fq_fld.ah_fld.ba((byte)0);
				return 1;
			} else if (3644 == var0) {
				if (jr.fa_fld != null) {
					jr.fa_fld.cv(-1766391809);
				}

				return 1;
			} else if (3645 == var0) {
				boolean var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new xt(var16), -1438748306);
				}

				return 1;
			} else if (var0 == 3646) {
				boolean var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new xq(var15), 678256911);
				}

				return 1;
			} else if (var0 == 3647) {
				boolean var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ew(var14), -1270828285);
				}

				return 1;
			} else if (var0 == 3648) {
				boolean var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new es(var13), 635536341);
				}

				return 1;
			} else if (var0 == 3649) {
				boolean var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new et(var12), -989410782);
				}

				return 1;
			} else if (var0 == 3650) {
				boolean var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new eb(var11), 155749157);
				}

				return 1;
			} else if (3651 == var0) {
				boolean var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ep(var10), 989717841);
				}

				return 1;
			} else if (var0 == 3652) {
				boolean var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new ed(var9), -253120209);
				}

				return 1;
			} else if (3653 == var0) {
				boolean var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ex(var8), 335594879);
				}

				return 1;
			} else if (3654 == var0) {
				boolean var7 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new eo(var7), 865435866);
				}

				return 1;
			} else if (var0 == 3655) {
				if (null != jr.fa_fld) {
					jr.fa_fld.ba((byte)0);
				}

				return 1;
			} else if (var0 == 3656) {
				boolean var6 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ec(var6), 1665357787);
				return 1;
			} else if (3657 == var0) {
				boolean var5 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ec(var5), -532018162);
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null != jr.fa_fld && var3 < jr.fa_fld.bl(-1440239599) && ((rh)rc.sc(jr.fa_fld, var3)).ah((byte)22)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gr(int var0, ba var1) {
		if (1935890342 == var0) {
			if (1516341174 * la.fq_fld.aw_fld == 0) {
				au_fld[(gz.ax_fld += 1136447150) * 114334703 - 1] = -2;
			} else if (1 == la.fq_fld.aw_fld) {
				au_fld[(gz.ax_fld += -839784835) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += 1126691509) * -776631127 - 1] = la.fq_fld.ae_fld.bl(-1440239599);
			}

			return 1;
		} else if (164780657 == var0) {
			int var48 = au_fld[(gz.ax_fld -= -1684678759) * -694191016];
			if (bo.vc(la.fq_fld, -1870278527) && var48 >= 0 && var48 < la.fq_fld.ae_fld.bl(-1440239599)) {
				rp var51 = (rp)rc.sc(la.fq_fld.ae_fld, var48);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = rl.hv(var51, (byte)1);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var51.at((byte)1);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 185556189) {
			int var47 = au_fld[(gz.ax_fld -= 867904501) * 1066959951];
			if (bo.vc(la.fq_fld, -1292700929) && var47 >= 0 && var47 < la.fq_fld.ae_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(la.fq_fld.ae_fld, var47)).ae_fld * 1107825689;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * 2017271863 - 1] = 0;
			}

			return 1;
		} else if (-991859627 == var0) {
			int var46 = au_fld[(gz.ax_fld -= -203349696) * -776631127];
			if (bo.vc(la.fq_fld, -902135254) && var46 >= 0 && var46 < la.fq_fld.ae_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((rr)rc.sc(la.fq_fld.ae_fld, var46)).aw_fld * 1768793103;
			} else {
				au_fld[(gz.ax_fld += -113824170) * 1226158569 - 1] = 0;
			}

			return 1;
		} else if (3604 == var0) {
			String var45 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var50 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ky.ah(var45, var50);
			return 1;
		} else if (var0 == 774891030) {
			String var44 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aa(var44);
			return 1;
		} else if (var0 == 119409240) {
			String var43 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			la.fq_fld.aq(var43);
			return 1;
		} else if (60835166 == var0) {
			String var42 = (String)ai_fld[(ef.aq_fld -= -211521517) * -1058073806];
			bo.if_(la.fq_fld, var42, 1779369254);
			return 1;
		} else if (1693276165 == var0) {
			String var41 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			boolean var49 = true;
			la.fq_fld.am(var41, var49, -1524373658);
			return 1;
		} else if (3609 == var0) {
			String var39 = (String)ai_fld[(ef.aq_fld -= 1403952504) * 1136407380];
			var39 = cr.hs(var39);
			au_fld[(gz.ax_fld += -1684678759) * -1042960952 - 1] = la.fq_fld.al(new aax(var39, fr.gv_fld), false) ? 1 : 0;
			return 1;
		} else if (var0 == 3611) {
			if (jr.fa_fld != null) {
				ai_fld[(ef.aq_fld += -211521517) * 1242201027 - 1] = jr.fa_fld.ae_fld;
			} else {
				ai_fld[(ef.aq_fld += -1977305416) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 3612) {
			if (jr.fa_fld != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jr.fa_fld.bl(-1440239599);
			} else {
				au_fld[(gz.ax_fld += 2054915463) * -642046647 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3613) {
			int var38 = au_fld[(gz.ax_fld -= -1477698379) * -776631127];
			if (null != jr.fa_fld && var38 < jr.fa_fld.bl(-1440239599)) {
				ai_fld[(ef.aq_fld += -211521517) * 105697676 - 1] = rc.sc(jr.fa_fld, var38).ap(-1939318074).ak(-926863973);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -1114385194 - 1] = "";
			}

			return 1;
		} else if (3614 == var0) {
			int var37 = au_fld[(gz.ax_fld -= -1559401713) * 1161381053];
			if (jr.fa_fld != null && var37 < jr.fa_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += 741331463) * -776631127 - 1] = ((rr)rc.sc(jr.fa_fld, var37)).by(1956199288);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1454805404) {
			int var36 = au_fld[(gz.ax_fld -= 702691858) * -776631127];
			if (jr.fa_fld != null && var36 < jr.fa_fld.bl(-1440239599)) {
				au_fld[(gz.ax_fld += -1938760197) * 393693324 - 1] = ((rr)rc.sc(jr.fa_fld, var36)).aw_fld * 964405635;
			} else {
				au_fld[(gz.ax_fld += -1309465121) * 135750733 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3616) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jr.fa_fld != null ? jr.fa_fld.ah_fld : 0;
			return 1;
		} else if (644118861 == var0) {
			String var35 = (String)ai_fld[(ef.aq_fld -= -211521517) * -790148898];
			hn.ge(var35);
			return 1;
		} else if (var0 == 3618) {
			au_fld[(gz.ax_fld += -1526579388) * -904835397 - 1] = null != jr.fa_fld ? jr.fa_fld.aw_fld : 0;
			return 1;
		} else if (var0 == 3619) {
			String var34 = (String)ai_fld[(ef.aq_fld -= -932965564) * 1964963879];
			jk.gw(var34);
			return 1;
		} else if (var0 == 1899227782) {
			bl.gx();
			return 1;
		} else if (-143545089 == var0) {
			if (!bo.vc(la.fq_fld, -1730414915)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = la.fq_fld.ah_fld.bl(-1440239599);
			}

			return 1;
		} else if (var0 == 1059687451) {
			int var33 = au_fld[(gz.ax_fld -= -1791526914) * 710739298];
			if (bo.vc(la.fq_fld, -1090267200) && var33 >= 0 && var33 < la.fq_fld.ah_fld.bl(-1440239599)) {
				rt var4 = (rt)rc.sc(la.fq_fld.ah_fld, var33);
				ai_fld[(ef.aq_fld += 1576264005) * -1304861104 - 1] = rl.hv(var4, (byte)1);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.at((byte)1);
			} else {
				ai_fld[(ef.aq_fld += 898262491) * 2011826566 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * 269700718 - 1] = "";
			}

			return 1;
		} else if (var0 == 3623) {
			String var31 = (String)ai_fld[(ef.aq_fld -= 1456221094) * 572447741];
			var31 = cr.hs(var31);
			au_fld[(gz.ax_fld += -1851522902) * -776631127 - 1] = la.fq_fld.au(new aax(var31, fr.gv_fld)) ? 1 : 0;
			return 1;
		} else if (1543766816 == var0) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -445512385];
			if (jr.fa_fld != null && var30 < jr.fa_fld.bl(-1440239599) && rc.sc(jr.fa_fld, var30).ap(-1939318074).equals(og.ci_fld.jn((byte)-31))) {
				au_fld[(gz.ax_fld += -1684678759) * -48038100 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (3625 == var0) {
			if (null != jr.fa_fld && null != jr.fa_fld.av_fld) {
				ai_fld[(ef.aq_fld += -152006478) * -836183525 - 1] = jr.fa_fld.av_fld;
			} else {
				ai_fld[(ef.aq_fld += -1799229395) * -836183525 - 1] = "";
			}

			return 1;
		} else if (3626 == var0) {
			int var29 = au_fld[(gz.ax_fld -= -1684678759) * -298867089];
			if (jr.fa_fld != null && var29 < jr.fa_fld.bl(-1440239599) && ((rh)rc.sc(jr.fa_fld, var29)).ag((short)25552)) {
				au_fld[(gz.ax_fld += 569374714) * 1872522619 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += 51914681) * 1475659321 - 1] = 0;
			}

			return 1;
		} else if (-1460683725 != var0) {
			if (var0 == 3628) {
				la.fq_fld.ae_fld.cv(-1753698927);
				return 1;
			} else if (var0 == 3629) {
				boolean var28 = au_fld[(gz.ax_fld -= -1633422397) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new xt(var28), -1278468961);
				return 1;
			} else if (1796829124 == var0) {
				boolean var27 = au_fld[(gz.ax_fld -= -1578549251) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new xq(var27), -1375586548);
				return 1;
			} else if (var0 == -1765574671) {
				boolean var26 = au_fld[(gz.ax_fld -= 2021868228) * -131012114] == 1;
				la.fq_fld.ae_fld.cy(new ew(var26), -76862749);
				return 1;
			} else if (var0 == 3632) {
				boolean var25 = au_fld[(gz.ax_fld -= 274747470) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new es(var25), -148084551);
				return 1;
			} else if (var0 == 1729972261) {
				boolean var24 = au_fld[(gz.ax_fld -= -1684678759) * -1161758436] == 1;
				la.fq_fld.ae_fld.cy(new et(var24), -1085562515);
				return 1;
			} else if (var0 == 3634) {
				boolean var23 = au_fld[(gz.ax_fld -= 459219737) * 1666558565] == 1;
				la.fq_fld.ae_fld.cy(new eb(var23), -172363797);
				return 1;
			} else if (3635 == var0) {
				boolean var22 = au_fld[(gz.ax_fld -= -617656073) * -776631127] == 1;
				la.fq_fld.ae_fld.cy(new ep(var22), -1908845444);
				return 1;
			} else if (var0 == -2108769806) {
				boolean var21 = au_fld[(gz.ax_fld -= -1684678759) * -1535741773] == 1;
				la.fq_fld.ae_fld.cy(new ed(var21), 276655556);
				return 1;
			} else if (var0 == 1325296588) {
				boolean var20 = au_fld[(gz.ax_fld -= 289699688) * -1604146844] == 1;
				la.fq_fld.ae_fld.cy(new ex(var20), -1971222367);
				return 1;
			} else if (var0 == 3638) {
				boolean var19 = au_fld[(gz.ax_fld -= -1684678759) * 507519931] == 1;
				la.fq_fld.ae_fld.cy(new eo(var19), 2107872502);
				return 1;
			} else if (var0 == 3639) {
				la.fq_fld.ae_fld.ba((byte)0);
				return 1;
			} else if (3640 == var0) {
				la.fq_fld.ah_fld.cv(-1932828125);
				return 1;
			} else if (var0 == -876422342) {
				boolean var18 = au_fld[(gz.ax_fld -= 1598912150) * 16465995] == 1;
				la.fq_fld.ah_fld.cy(new xt(var18), -1024292216);
				return 1;
			} else if (var0 == -618970013) {
				boolean var17 = au_fld[(gz.ax_fld -= -1684678759) * 121504031] == 1;
				la.fq_fld.ah_fld.cy(new xq(var17), -310997480);
				return 1;
			} else if (var0 == 1423125258) {
				la.fq_fld.ah_fld.ba((byte)0);
				return 1;
			} else if (3644 == var0) {
				if (jr.fa_fld != null) {
					jr.fa_fld.cv(-1978935820);
				}

				return 1;
			} else if (-257837487 == var0) {
				boolean var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new xt(var16), -1125452854);
				}

				return 1;
			} else if (var0 == -234779693) {
				boolean var15 = au_fld[(gz.ax_fld -= 1085007739) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new xq(var15), -783200006);
				}

				return 1;
			} else if (var0 == 3647) {
				boolean var14 = au_fld[(gz.ax_fld -= -447537494) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ew(var14), -844731206);
				}

				return 1;
			} else if (var0 == 763373853) {
				boolean var13 = au_fld[(gz.ax_fld -= 1751925078) * 701423285] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new es(var13), -374521108);
				}

				return 1;
			} else if (var0 == 1792084185) {
				boolean var12 = au_fld[(gz.ax_fld -= -1309479672) * -776631127] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new et(var12), -2080195778);
				}

				return 1;
			} else if (var0 == 827769239) {
				boolean var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new eb(var11), 680094230);
				}

				return 1;
			} else if (3651 == var0) {
				boolean var10 = au_fld[(gz.ax_fld -= -1098989219) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ep(var10), 181726869);
				}

				return 1;
			} else if (var0 == -783347540) {
				boolean var9 = au_fld[(gz.ax_fld -= 1005052239) * -1438706912] == 1;
				if (jr.fa_fld != null) {
					jr.fa_fld.cy(new ed(var9), 135235012);
				}

				return 1;
			} else if (2017252816 == var0) {
				boolean var8 = au_fld[(gz.ax_fld -= -1959422598) * 1965387941] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ex(var8), -2087487446);
				}

				return 1;
			} else if (3654 == var0) {
				boolean var7 = au_fld[(gz.ax_fld -= -1684678759) * -1940208088] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new eo(var7), -313500743);
				}

				return 1;
			} else if (var0 == -2035836240) {
				if (null != jr.fa_fld) {
					jr.fa_fld.ba((byte)0);
				}

				return 1;
			} else if (var0 == 3656) {
				boolean var6 = au_fld[(gz.ax_fld -= -1684678759) * -1975921632] == 1;
				la.fq_fld.ae_fld.cy(new ec(var6), 513212777);
				return 1;
			} else if (3657 == var0) {
				boolean var5 = au_fld[(gz.ax_fld -= -158882718) * -776631127] == 1;
				if (null != jr.fa_fld) {
					jr.fa_fld.cy(new ec(var5), 288721529);
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (null != jr.fa_fld && var3 < jr.fa_fld.bl(-1440239599) && ((rh)rc.sc(jr.fa_fld, var3)).ah((byte)17)) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hb(int var0, ba var1) {
		if (5504 == var0) {
			gz.ax_fld -= 2;
			int var5 = au_fld[gz.ax_fld];
			int var4 = au_fld[gz.ax_fld + 1];
			if (!client.ki_fld) {
				client.jf_fld = var5;
				client.js_fld = var4;
			}

			return 1;
		} else if (5505 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.jf_fld;
			return 1;
		} else if (var0 == 5506) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.js_fld;
			return 1;
		} else if (5530 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var3 < 0) {
				var3 = 0;
			}

			client.dy_fld = var3;
			return 1;
		} else if (var0 == 5531) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.dy_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fr(int var0, ba var1) throws EOFException {
		if (var0 == 3300) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.dv_fld;
			return 1;
		} else if (3301 == var0) {
			gz.ax_fld -= 2;
			int var23 = au_fld[gz.ax_fld];
			int var31 = au_fld[1 + gz.ax_fld];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = av.ak(var23, var31);
			return 1;
		} else if (var0 == 3302) {
			gz.ax_fld -= 2;
			int var22 = au_fld[gz.ax_fld];
			int var30 = au_fld[gz.ax_fld + 1];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gx.ag(var22, var30);
			return 1;
		} else if (3303 == var0) {
			gz.ax_fld -= 2;
			int var21 = au_fld[gz.ax_fld];
			int var29 = au_fld[gz.ax_fld + 1];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.az(var21, var29);
			return 1;
		} else if (3304 == var0) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lg.ak(var20, 1557041696).ae_fld * 508058309;
			return 1;
		} else if (var0 == 3305) {
			int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.er_fld[var19];
			return 1;
		} else if (var0 == 3306) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.en_fld[var18];
			return 1;
		} else if (var0 == 3307) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.eg_fld[var17];
			return 1;
		} else if (var0 != 3308) {
			if (var0 == 3309) {
				int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.az(var16);
				return 1;
			} else if (var0 == 3310) {
				int var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.ag(var15);
				return 1;
			} else if (3311 == var0) {
				int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.av(var14);
				return 1;
			} else if (var0 == 3312) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ct_fld ? 1 : 0;
				return 1;
			} else if (3313 == var0) {
				gz.ax_fld -= 2;
				int var13 = 32768 + au_fld[gz.ax_fld];
				int var28 = au_fld[1 + gz.ax_fld];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = av.ak(var13, var28);
				return 1;
			} else if (var0 == 3314) {
				gz.ax_fld -= 2;
				int var12 = 32768 + au_fld[gz.ax_fld];
				int var27 = au_fld[1 + gz.ax_fld];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gx.ag(var12, var27);
				return 1;
			} else if (var0 == 3315) {
				gz.ax_fld -= 2;
				int var11 = 32768 + au_fld[gz.ax_fld];
				int var26 = au_fld[gz.ax_fld + 1];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = co.az(var11, var26);
				return 1;
			} else if (var0 == 3316) {
				if (client.jl_fld >= 2) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.jl_fld;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (3317 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.hb_fld;
				return 1;
			} else if (3318 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ch_fld;
				return 1;
			} else if (var0 == 3321) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ji_fld / 100;
				return 1;
			} else if (var0 == 3322) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.jr_fld;
				return 1;
			} else if (3323 == var0) {
				if (client.ko_fld) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (3324 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gt_fld;
				return 1;
			} else if (3325 == var0) {
				gz.ax_fld -= 4;
				int var10 = au_fld[gz.ax_fld];
				int var25 = au_fld[gz.ax_fld + 1];
				int var32 = au_fld[gz.ax_fld + 2];
				int var33 = au_fld[3 + gz.ax_fld];
				int var7 = kj.ak(var32, var25, var33);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var10 + var7;
				return 1;
			} else if (var0 == 3326) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gl_fld;
				return 1;
			} else if (3327 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.hr_fld;
				return 1;
			} else if (var0 == 3331) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ji_fld;
				return 1;
			} else if (var0 == 3332) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ef_fld[var9];
				return 1;
			} else if (3333 == var0) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.eb_fld;
				return 1;
			} else if (3334 == var0) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.hf_fld;
				return 1;
			} else if (3339 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (var8 == -1) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				} else {
					oy var24 = hh.ag(var8);
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var24 == null ? "" : var24.at_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			rx var3 = on.eq();
			if (null != var3 && var3.aw(797203529)) {
				int var4 = var3.al(-391122878);
				int var5 = var3.ar(-1606247648);
				int var6 = var3.af((byte)108);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.ak(var4, var5, var6);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gk(int var0, ba var1) {
		if (var0 == 3800) {
			if (null != eu.fo_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				gt.be_fld = eu.fo_fld;
			} else {
				au_fld[(gz.ax_fld += -1459285555) * -1994489469 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3801) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * 910466676];
			if (client.fp_fld[var18] != null) {
				au_fld[(gz.ax_fld += -1684678759) * -2064719172 - 1] = 1;
				gt.be_fld = client.fp_fld[var18];
			} else {
				au_fld[(gz.ax_fld += -1643154228) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1233420300) {
			ai_fld[(ef.aq_fld += -1331291808) * -836183525 - 1] = gt.be_fld.as_fld;
			return 1;
		} else if (3803 == var0) {
			au_fld[(gz.ax_fld += -350978318) * -776631127 - 1] = gt.be_fld.af_fld ? 1 : 0;
			return 1;
		} else if (3804 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.al_fld;
			return 1;
		} else if (3805 == var0) {
			au_fld[(gz.ax_fld += 1547523639) * -776631127 - 1] = gt.be_fld.au_fld;
			return 1;
		} else if (var0 == 3806) {
			au_fld[(gz.ax_fld += 44832512) * -776631127 - 1] = gt.be_fld.ax_fld;
			return 1;
		} else if (var0 == 3807) {
			au_fld[(gz.ax_fld += -110216524) * -776631127 - 1] = gt.be_fld.an_fld;
			return 1;
		} else if (216151036 == var0) {
			au_fld[(gz.ax_fld += -1230404781) * 325878528 - 1] = gt.be_fld.aa_fld;
			return 1;
		} else if (3810 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -2118834486) * 89706291];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.aj_fld[var17];
			return 1;
		} else if (1998784831 == var0) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -56052371 - 1] = gt.be_fld.aq_fld[var16];
			return 1;
		} else if (3812 == var0) {
			au_fld[(gz.ax_fld += -419051204) * -776631127 - 1] = gt.be_fld.at_fld;
			return 1;
		} else if (var0 == 3813) {
			int var15 = au_fld[(gz.ax_fld -= -1684678759) * -1767579591];
			ai_fld[(ef.aq_fld += -211521517) * 847887921 - 1] = gt.be_fld.bm_fld[var15];
			return 1;
		} else if (-1156002761 == var0) {
			gz.ax_fld -= 3;
			int var14 = au_fld[gz.ax_fld];
			int var20 = au_fld[1 + gz.ax_fld];
			int var21 = au_fld[2 + gz.ax_fld];
			au_fld[(gz.ax_fld += -698682323) * 252823202 - 1] = gt.be_fld.av(var14, var20, var21, 380336794);
			return 1;
		} else if (1886403713 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -385778352 - 1] = gt.be_fld.ab_fld;
			return 1;
		} else if (var0 == 118069287) {
			au_fld[(gz.ax_fld += -1684678759) * -28593059 - 1] = gt.be_fld.ap_fld;
			return 1;
		} else if (3817 == var0) {
			au_fld[(gz.ax_fld += 778362796) * 1490499479 - 1] = gt.be_fld.az((String)ai_fld[(ef.aq_fld -= -1840847405) * -836183525], (byte)5);
			return 1;
		} else if (var0 == 154410823) {
			au_fld[gz.ax_fld - 1] = ik.re(gt.be_fld, -114352575)[au_fld[gz.ax_fld - 1]];
			return 1;
		} else if (3819 == var0) {
			gz.ax_fld -= 336830744;
			int var13 = au_fld[gz.ax_fld];
			int var19 = au_fld[gz.ax_fld + 1];
			ei.gl(var19, var13);
			return 1;
		} else if (-818647394 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1734639500) * 2027748651];
			au_fld[(gz.ax_fld += -341264042) * 1342521997 - 1] = gt.be_fld.ad_fld[var12];
			return 1;
		} else {
			if (var0 == 3821) {
				gz.ax_fld -= 890236930;
				int var3 = au_fld[gz.ax_fld];
				boolean var4 = au_fld[gz.ax_fld + 1] == 1;
				int var5 = au_fld[2 + gz.ax_fld];
				cy.hr(var5, var3, var4);
			}

			if (-1932202261 == var0) {
				int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * 341477857 - 1] = gt.be_fld.ao_fld[var11] ? 1 : 0;
				return 1;
			} else if (var0 == -559358521) {
				if (null != fp.fx_fld) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					gw.bs_fld = fp.fx_fld;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -1857707424 - 1] = 0;
				}

				return 1;
			} else if (3851 == var0) {
				int var10 = au_fld[(gz.ax_fld -= -1684678759) * -2103869322];
				if (client.fv_fld[var10] != null) {
					au_fld[(gz.ax_fld += -1684678759) * -748097120 - 1] = 1;
					gw.bs_fld = client.fv_fld[var10];
					dy.bh_fld = var10;
				} else {
					au_fld[(gz.ax_fld += 77831264) * 812495039 - 1] = 0;
				}

				return 1;
			} else if (var0 == 1301898925) {
				ai_fld[(ef.aq_fld += 1404821919) * 1350038507 - 1] = gw.bs_fld.az_fld;
				return 1;
			} else if (924306556 == var0) {
				au_fld[(gz.ax_fld += -1961276095) * -91510905 - 1] = gw.bs_fld.ae_fld;
				return 1;
			} else if (var0 == 3854) {
				au_fld[(gz.ax_fld += -1012670377) * -357264121 - 1] = gw.bs_fld.av_fld;
				return 1;
			} else if (var0 == 671084129) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av(-1091125853);
				return 1;
			} else if (var0 == 57128563) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ai_fld[(ef.aq_fld += -1841076796) * -836183525 - 1] = ((hx)gw.bs_fld.ak_fld.get(var9)).az_fld.ak(441643444);
				return 1;
			} else if (2022362174 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -836966686];
				au_fld[(gz.ax_fld += -141470633) * 386354506 - 1] = ((hx)gw.bs_fld.ak_fld.get(var8)).ak_fld;
				return 1;
			} else if (3858 == var0) {
				int var7 = au_fld[(gz.ax_fld -= -895372150) * -776631127];
				au_fld[(gz.ax_fld += -1524829113) * -1664862864 - 1] = ((hx)gw.bs_fld.ak_fld.get(var7)).ag_fld * 1878330377;
				return 1;
			} else if (3859 == var0) {
				int var6 = au_fld[(gz.ax_fld -= -1684678759) * -2111342385];
				jg.gb(-1320796865 * dy.bh_fld, var6, (byte)1);
				return 1;
			} else if (var0 == 3860) {
				au_fld[(gz.ax_fld += -97516771) * -776631127 - 1] = gw.bs_fld.ae((String)ai_fld[(ef.aq_fld -= 1014427122) * -1937180529], 648383814);
				return 1;
			} else if (var0 == -863346338) {
				au_fld[gz.ax_fld - 1] = ib.vh(gw.bs_fld, -1598374644)[au_fld[gz.ax_fld - 1]];
				return 1;
			} else if (var0 == 307120949) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != bl.ey_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gu(int var0, ba var1) {
		if (var0 == 3800) {
			if (null != eu.fo_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				gt.be_fld = eu.fo_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3801) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (client.fp_fld[var18] != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				gt.be_fld = client.fp_fld[var18];
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3802) {
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.as_fld;
			return 1;
		} else if (3803 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.af_fld ? 1 : 0;
			return 1;
		} else if (3804 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.al_fld;
			return 1;
		} else if (3805 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.au_fld;
			return 1;
		} else if (var0 == 3806) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ax_fld;
			return 1;
		} else if (var0 == 3807) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.an_fld;
			return 1;
		} else if (3809 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.aa_fld;
			return 1;
		} else if (3810 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.aj_fld[var17];
			return 1;
		} else if (3811 == var0) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.aq_fld[var16];
			return 1;
		} else if (3812 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.at_fld;
			return 1;
		} else if (var0 == 3813) {
			int var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.bm_fld[var15];
			return 1;
		} else if (3814 == var0) {
			gz.ax_fld -= 3;
			int var14 = au_fld[gz.ax_fld];
			int var20 = au_fld[1 + gz.ax_fld];
			int var21 = au_fld[2 + gz.ax_fld];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.av(var14, var20, var21, 297240456);
			return 1;
		} else if (3815 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ab_fld;
			return 1;
		} else if (var0 == 3816) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ap_fld;
			return 1;
		} else if (3817 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.az((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], (byte)5);
			return 1;
		} else if (var0 == 3818) {
			au_fld[gz.ax_fld - 1] = ik.re(gt.be_fld, -1066514843)[au_fld[gz.ax_fld - 1]];
			return 1;
		} else if (3819 == var0) {
			gz.ax_fld -= 2;
			int var13 = au_fld[gz.ax_fld];
			int var19 = au_fld[gz.ax_fld + 1];
			ei.gl(var19, var13);
			return 1;
		} else if (3820 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ad_fld[var12];
			return 1;
		} else {
			if (var0 == 3821) {
				gz.ax_fld -= 3;
				int var3 = au_fld[gz.ax_fld];
				boolean var4 = au_fld[gz.ax_fld + 1] == 1;
				int var5 = au_fld[2 + gz.ax_fld];
				cy.hr(var5, var3, var4);
			}

			if (3822 == var0) {
				int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ao_fld[var11] ? 1 : 0;
				return 1;
			} else if (var0 == 3850) {
				if (null != fp.fx_fld) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					gw.bs_fld = fp.fx_fld;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (3851 == var0) {
				int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (client.fv_fld[var10] != null) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					gw.bs_fld = client.fv_fld[var10];
					dy.bh_fld = var10;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3852) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gw.bs_fld.az_fld;
				return 1;
			} else if (3853 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.ae_fld;
				return 1;
			} else if (var0 == 3854) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av_fld;
				return 1;
			} else if (var0 == 3855) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av(-1091125853);
				return 1;
			} else if (var0 == 3856) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ((hx)gw.bs_fld.ak_fld.get(var9)).az_fld.ak(-1388996057);
				return 1;
			} else if (3857 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((hx)gw.bs_fld.ak_fld.get(var8)).ak_fld;
				return 1;
			} else if (3858 == var0) {
				int var7 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((hx)gw.bs_fld.ak_fld.get(var7)).ag_fld * 1878330377;
				return 1;
			} else if (3859 == var0) {
				int var6 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				jg.gb(dy.bh_fld, var6, (byte)1);
				return 1;
			} else if (var0 == 3860) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.ae((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], -1067719232);
				return 1;
			} else if (var0 == 3861) {
				au_fld[gz.ax_fld - 1] = ib.vh(gw.bs_fld, -1007288523)[au_fld[gz.ax_fld - 1]];
				return 1;
			} else if (var0 == 3890) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != bl.ey_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gp(int var0, ba var1) {
		if (var0 == 3800) {
			if (null != eu.fo_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -764393172 - 1] = 1;
				gt.be_fld = eu.fo_fld;
			} else {
				au_fld[(gz.ax_fld += 1447137629) * 1338890444 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3801) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * 1294220639];
			if (client.fp_fld[var18] != null) {
				au_fld[(gz.ax_fld += 2006476766) * -776631127 - 1] = 1;
				gt.be_fld = client.fp_fld[var18];
			} else {
				au_fld[(gz.ax_fld += -1289416594) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1868489074) {
			ai_fld[(ef.aq_fld += -211521517) * -2134521363 - 1] = gt.be_fld.as_fld;
			return 1;
		} else if (3803 == var0) {
			au_fld[(gz.ax_fld += 224508649) * -1577822787 - 1] = gt.be_fld.af_fld ? 1 : 0;
			return 1;
		} else if (-342686613 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.al_fld;
			return 1;
		} else if (3805 == var0) {
			au_fld[(gz.ax_fld += -294087558) * -829492821 - 1] = gt.be_fld.au_fld;
			return 1;
		} else if (var0 == -1418361667) {
			au_fld[(gz.ax_fld += 1624301409) * -776631127 - 1] = gt.be_fld.ax_fld;
			return 1;
		} else if (var0 == 994905527) {
			au_fld[(gz.ax_fld += 1564912077) * -1613728032 - 1] = gt.be_fld.an_fld;
			return 1;
		} else if (3809 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * 1420816451 - 1] = gt.be_fld.aa_fld;
			return 1;
		} else if (3810 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.aj_fld[var17];
			return 1;
		} else if (3811 == var0) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -488967225];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.aq_fld[var16];
			return 1;
		} else if (3812 == var0) {
			au_fld[(gz.ax_fld += -499053261) * 51128308 - 1] = gt.be_fld.at_fld;
			return 1;
		} else if (var0 == -85414476) {
			int var15 = au_fld[(gz.ax_fld -= -58740111) * -747369333];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.bm_fld[var15];
			return 1;
		} else if (3814 == var0) {
			gz.ax_fld -= 3;
			int var14 = au_fld[gz.ax_fld];
			int var20 = au_fld[1 + gz.ax_fld];
			int var21 = au_fld[2 + gz.ax_fld];
			au_fld[(gz.ax_fld += -2081849407) * -776631127 - 1] = gt.be_fld.av(var14, var20, var21, 10508779);
			return 1;
		} else if (3815 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 198975896 * gt.be_fld.ab_fld;
			return 1;
		} else if (var0 == -78864963) {
			au_fld[(gz.ax_fld += -1684678759) * -1474963713 - 1] = gt.be_fld.ap_fld;
			return 1;
		} else if (-1592934623 == var0) {
			au_fld[(gz.ax_fld += 755668061) * -776631127 - 1] = gt.be_fld.az((String)ai_fld[(ef.aq_fld -= 198653684) * 327425340], (byte)5);
			return 1;
		} else if (var0 == 1220401382) {
			au_fld[gz.ax_fld - 1] = ik.re(gt.be_fld, 44137140)[au_fld[gz.ax_fld - 1]];
			return 1;
		} else if (3819 == var0) {
			gz.ax_fld -= 1917144723;
			int var13 = au_fld[gz.ax_fld];
			int var19 = au_fld[gz.ax_fld + 1];
			ei.gl(var19, var13);
			return 1;
		} else if (1717708453 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * 149264228];
			au_fld[(gz.ax_fld += 535919355) * -776631127 - 1] = gt.be_fld.ad_fld[var12];
			return 1;
		} else {
			if (var0 == 3821) {
				gz.ax_fld -= 3;
				int var3 = au_fld[gz.ax_fld];
				boolean var4 = au_fld[gz.ax_fld + 1] == 1;
				int var5 = au_fld[2 + gz.ax_fld];
				cy.hr(var5, var3, var4);
			}

			if (-240549167 == var0) {
				int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ao_fld[var11] ? 1 : 0;
				return 1;
			} else if (var0 == 3850) {
				if (null != fp.fx_fld) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					gw.bs_fld = fp.fx_fld;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -650766216 - 1] = 0;
				}

				return 1;
			} else if (3851 == var0) {
				int var10 = au_fld[(gz.ax_fld -= 1793643716) * -776631127];
				if (client.fv_fld[var10] != null) {
					au_fld[(gz.ax_fld += -1684678759) * 1443038407 - 1] = 1;
					gw.bs_fld = client.fv_fld[var10];
					dy.bh_fld = var10;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -1572100693 - 1] = 0;
				}

				return 1;
			} else if (var0 == 1954590945) {
				ai_fld[(ef.aq_fld += -1116560890) * -836183525 - 1] = gw.bs_fld.az_fld;
				return 1;
			} else if (3853 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.ae_fld;
				return 1;
			} else if (var0 == 3854) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av_fld;
				return 1;
			} else if (var0 == -657374274) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av(-1091125853);
				return 1;
			} else if (var0 == 920431334) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * 1854262320];
				ai_fld[(ef.aq_fld += -211521517) * -731241311 - 1] = ((hx)gw.bs_fld.ak_fld.get(var9)).az_fld.ak(171081776);
				return 1;
			} else if (1529102791 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1162104972) * -776631127];
				au_fld[(gz.ax_fld += -136784343) * -776631127 - 1] = ((hx)gw.bs_fld.ak_fld.get(var8)).ak_fld;
				return 1;
			} else if (3858 == var0) {
				int var7 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += 1501088608) * -645597718 - 1] = ((hx)gw.bs_fld.ak_fld.get(var7)).ag_fld * 219175616;
				return 1;
			} else if (-1969095560 == var0) {
				int var6 = au_fld[(gz.ax_fld -= 249663938) * -627771177];
				jg.gb(dy.bh_fld, var6, (byte)1);
				return 1;
			} else if (var0 == 3860) {
				au_fld[(gz.ax_fld += -1684678759) * -632061659 - 1] = gw.bs_fld.ae((String)ai_fld[(ef.aq_fld -= -758656987) * 12386197], -1128630592);
				return 1;
			} else if (var0 == 3861) {
				au_fld[gz.ax_fld - 1] = ib.vh(gw.bs_fld, -730707153)[au_fld[gz.ax_fld - 1]];
				return 1;
			} else if (var0 == 3890) {
				au_fld[(gz.ax_fld += 625954728) * -776631127 - 1] = null != bl.ey_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gv(int var0, ba var1) {
		if (var0 == 3800) {
			if (null != eu.fo_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				gt.be_fld = eu.fo_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3801) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (client.fp_fld[var18] != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				gt.be_fld = client.fp_fld[var18];
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3802) {
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.as_fld;
			return 1;
		} else if (3803 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.af_fld ? 1 : 0;
			return 1;
		} else if (3804 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.al_fld;
			return 1;
		} else if (3805 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.au_fld;
			return 1;
		} else if (var0 == 3806) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ax_fld;
			return 1;
		} else if (var0 == 3807) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.an_fld;
			return 1;
		} else if (3809 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.aa_fld;
			return 1;
		} else if (3810 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.aj_fld[var17];
			return 1;
		} else if (3811 == var0) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.aq_fld[var16];
			return 1;
		} else if (3812 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.at_fld;
			return 1;
		} else if (var0 == 3813) {
			int var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.bm_fld[var15];
			return 1;
		} else if (3814 == var0) {
			gz.ax_fld -= 3;
			int var14 = au_fld[gz.ax_fld];
			int var20 = au_fld[1 + gz.ax_fld];
			int var21 = au_fld[2 + gz.ax_fld];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.av(var14, var20, var21, -1327053209);
			return 1;
		} else if (3815 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ab_fld;
			return 1;
		} else if (var0 == 3816) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ap_fld;
			return 1;
		} else if (3817 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.az((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], (byte)5);
			return 1;
		} else if (var0 == 3818) {
			au_fld[gz.ax_fld - 1] = ik.re(gt.be_fld, -1011434065)[au_fld[gz.ax_fld - 1]];
			return 1;
		} else if (3819 == var0) {
			gz.ax_fld -= 2;
			int var13 = au_fld[gz.ax_fld];
			int var19 = au_fld[gz.ax_fld + 1];
			ei.gl(var19, var13);
			return 1;
		} else if (3820 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ad_fld[var12];
			return 1;
		} else {
			if (var0 == 3821) {
				gz.ax_fld -= 3;
				int var3 = au_fld[gz.ax_fld];
				boolean var4 = au_fld[gz.ax_fld + 1] == 1;
				int var5 = au_fld[2 + gz.ax_fld];
				cy.hr(var5, var3, var4);
			}

			if (3822 == var0) {
				int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ao_fld[var11] ? 1 : 0;
				return 1;
			} else if (var0 == 3850) {
				if (null != fp.fx_fld) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					gw.bs_fld = fp.fx_fld;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (3851 == var0) {
				int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (client.fv_fld[var10] != null) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					gw.bs_fld = client.fv_fld[var10];
					dy.bh_fld = var10;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3852) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gw.bs_fld.az_fld;
				return 1;
			} else if (3853 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.ae_fld;
				return 1;
			} else if (var0 == 3854) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av_fld;
				return 1;
			} else if (var0 == 3855) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av(-1091125853);
				return 1;
			} else if (var0 == 3856) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ((hx)gw.bs_fld.ak_fld.get(var9)).az_fld.ak(1692899568);
				return 1;
			} else if (3857 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((hx)gw.bs_fld.ak_fld.get(var8)).ak_fld;
				return 1;
			} else if (3858 == var0) {
				int var7 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((hx)gw.bs_fld.ak_fld.get(var7)).ag_fld * 1878330377;
				return 1;
			} else if (3859 == var0) {
				int var6 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				jg.gb(dy.bh_fld, var6, (byte)1);
				return 1;
			} else if (var0 == 3860) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.ae((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], 657672195);
				return 1;
			} else if (var0 == 3861) {
				au_fld[gz.ax_fld - 1] = ib.vh(gw.bs_fld, 697439251)[au_fld[gz.ax_fld - 1]];
				return 1;
			} else if (var0 == 3890) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != bl.ey_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gm(int var0, ba var1) throws EOFException {
		if (-665011145 == var0) {
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * 367192388];
			au_fld[(gz.ax_fld += -1223965526) * -776631127 - 1] = client.fs_fld[var33].av((byte)83);
			return 1;
		} else if (-609186055 == var0) {
			int var32 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -80790363) * -776631127 - 1] = 2126402206 * client.fs_fld[var32].ah_fld;
			return 1;
		} else if (var0 == 3905) {
			int var31 = au_fld[(gz.ax_fld -= -1269294880) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var31].av_fld * -220330603;
			return 1;
		} else if (var0 == 3906) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -1480227483];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1736688059 * client.fs_fld[var30].ag_fld;
			return 1;
		} else if (3907 == var0) {
			int var29 = au_fld[(gz.ax_fld -= -1684678759) * -1920014910];
			au_fld[(gz.ax_fld += -279446075) * -776631127 - 1] = client.fs_fld[var29].az_fld * -1164425433;
			return 1;
		} else if (-1153534725 == var0) {
			int var28 = au_fld[(gz.ax_fld -= -1335279166) * -1277900883];
			au_fld[(gz.ax_fld += -1684678759) * 1522819293 - 1] = 1052047428 * client.fs_fld[var28].ae_fld;
			return 1;
		} else if (var0 == 1076801216) {
			int var27 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var44 = client.fs_fld[var27].ag(-1144212634);
			au_fld[(gz.ax_fld += -1684678759) * 1384955503 - 1] = var44 == 0 ? 1 : 0;
			return 1;
		} else if (1793929688 == var0) {
			int var26 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var43 = client.fs_fld[var26].ag(10598537);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var43 == 2 ? 1 : 0;
			return 1;
		} else if (3912 == var0) {
			int var25 = au_fld[(gz.ax_fld -= 1070782953) * -776631127];
			int var42 = client.fs_fld[var25].ag(1284157789);
			au_fld[(gz.ax_fld += -874878453) * -776631127 - 1] = 5 == var42 ? 1 : 0;
			return 1;
		} else if (-343036965 == var0) {
			int var24 = au_fld[(gz.ax_fld -= -709374195) * -776631127];
			int var41 = client.fs_fld[var24].ag(-1690230044);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1 == var41 ? 1 : 0;
			return 1;
		} else if (var0 == 3914) {
			boolean var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.az_fld, var23, 623273710);
			}

			return 1;
		} else if (3915 == var0) {
			boolean var22 = au_fld[(gz.ax_fld -= -1321837040) * 2032886420] == 1;
			if (ue.fu_fld != null) {
				nc.ur(ue.fu_fld, nc.ag_fld, var22, 623273710);
			}

			return 1;
		} else if (var0 == -168884623) {
			gz.ax_fld -= 2;
			boolean var21 = au_fld[gz.ax_fld] == 1;
			boolean var40 = au_fld[gz.ax_fld + 1] == 1;
			if (null != ue.fu_fld) {
				client.fi_fld.ak_fld = var40;
				nc.ur(ue.fu_fld, client.fi_fld, var21, 623273710);
			}

			return 1;
		} else if (613591477 == var0) {
			boolean var20 = au_fld[(gz.ax_fld -= -112079673) * -776631127] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.ak_fld, var20, 623273710);
			}

			return 1;
		} else if (var0 == 3918) {
			boolean var19 = au_fld[(gz.ax_fld -= 977784374) * -1167886114] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.av_fld, var19, 623273710);
			}

			return 1;
		} else if (3919 == var0) {
			au_fld[(gz.ax_fld += -347987417) * -776631127 - 1] = ue.fu_fld == null ? 0 : ue.fu_fld.ae_fld.size();
			return 1;
		} else if (var0 == 3920) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var39 = (nl)(nl)ue.fu_fld.ae_fld.get(var18);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var39.ak_fld;
			return 1;
		} else if (3921 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1922584032) * 647884087];
			nl var38 = (nl)(nl)ue.fu_fld.ae_fld.get(var17);
			ai_fld[(ef.aq_fld += 1378714820) * 567297756 - 1] = nl.rl(var38, -1708077651);
			return 1;
		} else if (var0 == 3922) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * 1234402307];
			nl var37 = (nl)(nl)ue.fu_fld.ae_fld.get(var16);
			ai_fld[(ef.aq_fld += -525099396) * -836183525 - 1] = var37.ag();
			return 1;
		} else if (3923 == var0) {
			int var15 = au_fld[(gz.ax_fld -= 840227769) * 1498238045];
			nl var36 = (nl)(nl)ue.fu_fld.ae_fld.get(var15);
			long var5 = lz.ak() - yf.fr_fld - var36.ag_fld;
			int var7 = (int)(var5 / 3600000L);
			int var8 = (int)((var5 - var7 * -137325166) / 60000L);
			int var9 = (int)((var5 - -193242144 * var7 - 60000 * var8) / 1000L);
			String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var10;
			return 1;
		} else if (-672229042 == var0) {
			int var14 = au_fld[(gz.ax_fld -= 639516199) * -776631127];
			nl var35 = (nl)(nl)ue.fu_fld.ae_fld.get(var14);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var35.az_fld.ag_fld * -276541716;
			return 1;
		} else if (var0 == 3925) {
			int var13 = au_fld[(gz.ax_fld -= -1707622153) * -911223152];
			nl var34 = (nl)(nl)ue.fu_fld.ae_fld.get(var13);
			au_fld[(gz.ax_fld += -816597399) * 1725223150 - 1] = -220330603 * var34.az_fld.av_fld;
			return 1;
		} else if (3926 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * 771176814];
			nl var4 = (nl)(nl)ue.fu_fld.ae_fld.get(var12);
			au_fld[(gz.ax_fld += -169416249) * 60620796 - 1] = 192521732 * var4.az_fld.ah_fld;
			return 1;
		} else if (var0 == 3931) {
			int var11 = au_fld[(gz.ax_fld -= 663183502) * 238094508];
			au_fld[(gz.ax_fld += 918688244) * -776631127 - 1] = kb.ag(var11, -1752383175).el_fld ? 1 : 0;
			return 1;
		} else if (3939 == var0) {
			int var3 = au_fld[(gz.ax_fld -= 94636293) * -776631127];
			au_fld[(gz.ax_fld += -978405025) * -776631127 - 1] = kb.ag(var3, -1752383175).eh_fld ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gf(int var0, ba var1) throws EOFException {
		if (3903 == var0) {
			int var33 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var33].av((byte)83);
			return 1;
		} else if (3904 == var0) {
			int var32 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2082911 * client.fs_fld[var32].ah_fld;
			return 1;
		} else if (var0 == 3905) {
			int var31 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var31].av_fld * -220330603;
			return 1;
		} else if (var0 == 3906) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 626220965 * client.fs_fld[var30].ag_fld;
			return 1;
		} else if (3907 == var0) {
			int var29 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var29].az_fld * -1164425433;
			return 1;
		} else if (3908 == var0) {
			int var28 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -701801723 * client.fs_fld[var28].ae_fld;
			return 1;
		} else if (var0 == 3910) {
			int var27 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var44 = client.fs_fld[var27].ag(1575091512);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var44 == 0 ? 1 : 0;
			return 1;
		} else if (3911 == var0) {
			int var26 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var43 = client.fs_fld[var26].ag(-1166792915);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var43 == 2 ? 1 : 0;
			return 1;
		} else if (3912 == var0) {
			int var25 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var42 = client.fs_fld[var25].ag(-580088753);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 5 == var42 ? 1 : 0;
			return 1;
		} else if (3913 == var0) {
			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var41 = client.fs_fld[var24].ag(2122420498);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1 == var41 ? 1 : 0;
			return 1;
		} else if (var0 == 3914) {
			boolean var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.az_fld, var23, 623273710);
			}

			return 1;
		} else if (3915 == var0) {
			boolean var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (ue.fu_fld != null) {
				nc.ur(ue.fu_fld, nc.ag_fld, var22, 623273710);
			}

			return 1;
		} else if (var0 == 3916) {
			gz.ax_fld -= 2;
			boolean var21 = au_fld[gz.ax_fld] == 1;
			boolean var40 = au_fld[gz.ax_fld + 1] == 1;
			if (null != ue.fu_fld) {
				client.fi_fld.ak_fld = var40;
				nc.ur(ue.fu_fld, client.fi_fld, var21, 623273710);
			}

			return 1;
		} else if (3917 == var0) {
			boolean var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.ak_fld, var20, 623273710);
			}

			return 1;
		} else if (var0 == 3918) {
			boolean var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			if (null != ue.fu_fld) {
				nc.ur(ue.fu_fld, nc.av_fld, var19, 623273710);
			}

			return 1;
		} else if (3919 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ue.fu_fld == null ? 0 : ue.fu_fld.ae_fld.size();
			return 1;
		} else if (var0 == 3920) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var39 = (nl)(nl)ue.fu_fld.ae_fld.get(var18);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var39.ak_fld;
			return 1;
		} else if (3921 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var38 = (nl)(nl)ue.fu_fld.ae_fld.get(var17);
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = nl.rl(var38, -1819983588);
			return 1;
		} else if (var0 == 3922) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var37 = (nl)(nl)ue.fu_fld.ae_fld.get(var16);
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var37.ag();
			return 1;
		} else if (3923 == var0) {
			int var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var36 = (nl)(nl)ue.fu_fld.ae_fld.get(var15);
			long var5 = lz.ak() - yf.fr_fld - var36.ag_fld;
			int var7 = (int)(var5 / 3600000L);
			int var8 = (int)((var5 - var7 * 3600000) / 60000L);
			int var9 = (int)((var5 - 3600000 * var7 - 60000 * var8) / 1000L);
			String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var10;
			return 1;
		} else if (3924 == var0) {
			int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var35 = (nl)(nl)ue.fu_fld.ae_fld.get(var14);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var35.az_fld.ag_fld * 626220965;
			return 1;
		} else if (var0 == 3925) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var34 = (nl)(nl)ue.fu_fld.ae_fld.get(var13);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -220330603 * var34.az_fld.av_fld;
			return 1;
		} else if (3926 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			nl var4 = (nl)(nl)ue.fu_fld.ae_fld.get(var12);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2082911 * var4.az_fld.ah_fld;
			return 1;
		} else if (var0 == 3931) {
			int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var11, -1752383175).el_fld ? 1 : 0;
			return 1;
		} else if (3939 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var3, -1752383175).eh_fld ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	static void iw(lu var0) {
		var0.bt((byte)-114);
		li.ek(lu.bv(var0, -1553918110), new dy(var0), -80794516);
		li.vj(lu.bv(var0, -1448052813), new cg(var0), (byte)124);
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fw(int var0, ba var1) throws EOFException {
		lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= 742814956) * -776631127]);
		if (var0 == 2800) {
			au_fld[(gz.ax_fld += 1539135447) * -776631127 - 1] = nt.ag(uo.sa(cf.cg_fld, var3, -900379065));
			return 1;
		} else if (524060464 != var0) {
			if (var0 == -225543609) {
				if (null == var3.eq_fld) {
					ai_fld[(ef.aq_fld += -211521517) * -975991529 - 1] = "";
				} else {
					ai_fld[(ef.aq_fld += -1416974751) * -836183525 - 1] = var3.eq_fld;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var4--;
			if (var3.ei_fld != null && var4 < var3.ei_fld.length && null != var3.ei_fld[var4]) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.ei_fld[var4];
			} else {
				ai_fld[(ef.aq_fld += -2112515285) * -836183525 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gd(int var0, ba var1) throws EOFException {
		if (var0 == 4100) {
			String var36 = (String)ai_fld[(ef.aq_fld -= 1085481431) * -836183525];
			int var49 = au_fld[(gz.ax_fld -= -1684678759) * -1237744675];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var36 + var49;
			return 1;
		} else if (var0 == 4101) {
			ef.aq_fld -= 2;
			String var35 = (String)ai_fld[ef.aq_fld * 1578894429];
			String var48 = (String)ai_fld[ef.aq_fld + 1];
			ai_fld[(ef.aq_fld += 528899126) * 1299433157 - 1] = var35 + var48;
			return 1;
		} else if (var0 == 4102) {
			String var34 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var47 = au_fld[(gz.ax_fld -= -1125926846) * -2109410300];
			ai_fld[(ef.aq_fld += 1844307921) * -836183525 - 1] = var34 + is.ay(var47, true);
			return 1;
		} else if (var0 == 4103) {
			String var33 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			ai_fld[(ef.aq_fld += -211521517) * 488286110 - 1] = var33.toLowerCase();
			return 1;
		} else if (-505190576 == var0) {
			int var32 = au_fld[(gz.ax_fld -= -1684678759) * 1037920575];
			long var46 = (var32 + 11745L) * 86400000L;
			ac_fld.setTime(new Date(var46));
			int var61 = ac_fld.get(5);
			int var65 = ac_fld.get(2);
			int var66 = ac_fld.get(1);
			ai_fld[(ef.aq_fld += -211521517) * 569186419 - 1] = var61 + "-" + ae_fld[var65] + "-" + var66;
			return 1;
		} else if (var0 == 4105) {
			ef.aq_fld -= 1758415801;
			String var31 = (String)ai_fld[678100571 * ef.aq_fld];
			String var45 = (String)ai_fld[ef.aq_fld + 1];
			cv var56 = ot.ef();
			if (var56 != null && null != var56.av_fld && -1670047975 * var56.av_fld.ax_fld != 0) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var45;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -402803528 - 1] = var31;
			}

			return 1;
		} else if (4106 == var0) {
			int var30 = au_fld[(gz.ax_fld -= -1388646385) * -776631127];
			ai_fld[(ef.aq_fld += 721647701) * -1062036208 - 1] = Integer.toString(var30);
			return 1;
		} else if (4107 == var0) {
			ef.aq_fld -= 2;
			au_fld[(gz.ax_fld += -2012190545) * 238999246 - 1] = bs.aq(ee.ak((String)ai_fld[ef.aq_fld], (String)ai_fld[1 + ef.aq_fld], ku.gi_fld));
			return 1;
		} else if (var0 == 1322166773) {
			String var29 = (String)ai_fld[(ef.aq_fld -= -211521517) * -644622936];
			gz.ax_fld -= -1989521378;
			int var44 = au_fld[gz.ax_fld];
			int var55 = au_fld[1 + gz.ax_fld];
			byte[] var60 = ow.ie_fld.bb(var55, 0, 584982574);
			zf var64 = new zf(var60);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var64.aq(var29, var44);
			return 1;
		} else if (-905860994 == var0) {
			String var28 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= -1818174186;
			int var43 = au_fld[-2019032825 * gz.ax_fld];
			int var54 = au_fld[1 + gz.ax_fld];
			byte[] var59 = ow.ie_fld.bb(var54, 0, 584982574);
			zf var63 = new zf(var59);
			au_fld[(gz.ax_fld += -1684678759) * -734024589 - 1] = zv.cf(var63, var28, var43);
			return 1;
		} else if (var0 == 1838421958) {
			ef.aq_fld -= -1435011048;
			String var27 = (String)ai_fld[ef.aq_fld];
			String var42 = (String)ai_fld[ef.aq_fld + 1];
			if (au_fld[(gz.ax_fld -= -368194170) * -776631127] == 1) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var27;
			} else {
				ai_fld[(ef.aq_fld += 753798687) * -836183525 - 1] = var42;
			}

			return 1;
		} else if (var0 == 1215275351) {
			String var26 = (String)ai_fld[(ef.aq_fld -= -1190135822) * -836183525];
			ai_fld[(ef.aq_fld += 661214992) * -836183525 - 1] = zv.ay(var26);
			return 1;
		} else if (73141724 == var0) {
			String var25 = (String)ai_fld[(ef.aq_fld -= 826115742) * 1699504994];
			int var41 = au_fld[(gz.ax_fld -= -1684678759) * -97880840];
			ai_fld[(ef.aq_fld += -211521517) * 1561895608 - 1] = var25 + (char)var41;
			return 1;
		} else if (4113 == var0) {
			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -721806490];
			au_fld[(gz.ax_fld += 1044445774) * -776631127 - 1] = md.ai((char)var24) ? 1 : 0;
			return 1;
		} else if (-1552378449 == var0) {
			int var23 = au_fld[(gz.ax_fld -= -2012452406) * -1942909053];
			au_fld[(gz.ax_fld += -1684678759) * 684365788 - 1] = ey.au((char)var23) ? 1 : 0;
			return 1;
		} else if (4115 == var0) {
			int var22 = au_fld[(gz.ax_fld -= -1684678759) * 2061632595];
			au_fld[(gz.ax_fld += -1684678759) * -207479858 - 1] = eu.af((char)var22) ? 1 : 0;
			return 1;
		} else if (709691320 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * 54321302];
			au_fld[(gz.ax_fld += -813619976) * -776631127 - 1] = jw.al((char)var21) ? 1 : 0;
			return 1;
		} else if (-1485899701 == var0) {
			String var20 = (String)ai_fld[(ef.aq_fld -= -1232555324) * -836183525];
			if (null != var20) {
				au_fld[(gz.ax_fld += -1684678759) * 1368051544 - 1] = var20.length();
			} else {
				au_fld[(gz.ax_fld += -1684678759) * 2069935370 - 1] = 0;
			}

			return 1;
		} else if (-699258744 == var0) {
			String var19 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var40 = au_fld[2079033115 * gz.ax_fld];
			int var53 = au_fld[gz.ax_fld + 1];
			ai_fld[(ef.aq_fld += -211521517) * 1562400223 - 1] = var19.substring(var40, var53);
			return 1;
		} else if (var0 == 4119) {
			String var18 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			StringBuilder var39 = new StringBuilder(var18.length());
			boolean var52 = false;

			for (int var58 = 0; var58 < var18.length(); var58++) {
				char var62 = var18.charAt(var58);
				if ('<' == var62) {
					var52 = true;
				} else if (var62 == '>') {
					var52 = false;
				} else if (!var52) {
					var39.append(var62);
				}
			}

			ai_fld[(ef.aq_fld += 929193924) * 2095958454 - 1] = var39.toString();
			return 1;
		} else if (-1910808244 == var0) {
			String var17 = (String)ai_fld[(ef.aq_fld -= -1393191780) * 966191910];
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * 7177372];
			au_fld[(gz.ax_fld += -1684678759) * 1960385950 - 1] = var17.indexOf(var38);
			return 1;
		} else if (4121 == var0) {
			ef.aq_fld -= 827320033;
			String var16 = (String)ai_fld[ef.aq_fld * -912831673];
			String var37 = (String)ai_fld[ef.aq_fld + 1];
			int var51 = au_fld[(gz.ax_fld -= -1853404434) * -776631127];
			au_fld[(gz.ax_fld += 696131950) * -776631127 - 1] = var16.indexOf(var37, var51);
			return 1;
		} else if (1985651201 == var0) {
			String var15 = (String)ai_fld[(ef.aq_fld -= 1281726539) * -836183525];
			ai_fld[(ef.aq_fld += -1548899486) * -126044882 - 1] = var15.toUpperCase();
			return 1;
		} else if (var0 == 4123) {
			ef.aq_fld -= 1300514053;
			String var14 = (String)ai_fld[ef.aq_fld];
			String var4 = (String)ai_fld[ef.aq_fld + 1];
			String var50 = (String)ai_fld[ef.aq_fld + 2];
			cv var57 = ot.ef();
			if (null != var57 && null != var57.av_fld) {
				switch (-1451967319 * var57.av_fld.au_fld) {
					case 0:
						ai_fld[(ef.aq_fld += -211521517) * 1427458267 - 1] = var14;
						break;
					case 1:
						ai_fld[(ef.aq_fld += -211521517) * 1401079129 - 1] = var4;
						break;
					case 2:
					default:
						ai_fld[(ef.aq_fld += -211521517) * -415153689 - 1] = var50;
				}

				return 1;
			} else {
				ai_fld[(ef.aq_fld += -318634948) * -836183525 - 1] = var50;
				return 1;
			}
		} else if (var0 == 4124) {
			cv var13 = ot.ef();
			if (null != var13 && var13.av_fld != null) {
				au_fld[(gz.ax_fld += -1684678759) * -2095739047 - 1] = 523980853 * var13.av_fld.au_fld;
			} else {
				au_fld[(gz.ax_fld += 1568728304) * -233016553 - 1] = -1;
			}

			return 1;
		} else if (var0 == 4125) {
			long var12 = an_fld[(db.aa_fld -= 432101741) * 867932261];
			ai_fld[(ef.aq_fld += 1743682827) * -836183525 - 1] = Long.toString(var12);
			return 1;
		} else if (var0 != 489357859) {
			return 2;
		} else {
			long var3 = an_fld[(db.aa_fld -= -2134529049) * -2042932397];
			String var5 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			String var6;
			if (0L == var3) {
				var6 = "0";
			} else if (!var5.isEmpty()) {
				boolean var7 = var3 < 0L;
				long var8 = var7 ? -var3 : var3;
				StringBuilder var10 = new StringBuilder();

				for (int var11 = 1; var8 > 0L; var11++) {
					var10.insert(0, var8 % 10L);
					var8 /= 10L;
					if (var8 > 0L && var11 % 3 == 0) {
						var10.insert(0, ",");
					}
				}

				if (var7) {
					var10.insert(0, '-');
				}

				var6 = var10.toString();
			} else {
				var6 = Long.toString(var3);
			}

			ai_fld[(ef.aq_fld += -211521517) * -1047321668 - 1] = var6;
			return 1;
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gs(int var0, ba var1) {
		return 2;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gz(int var0, ba var1) throws EOFException {
		if (var0 == 4100) {
			String var36 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var49 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var36 + var49;
			return 1;
		} else if (var0 == 4101) {
			ef.aq_fld -= 2;
			String var35 = (String)ai_fld[ef.aq_fld];
			String var48 = (String)ai_fld[ef.aq_fld + 1];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var35 + var48;
			return 1;
		} else if (var0 == 4102) {
			String var34 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var47 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var34 + is.ay(var47, true);
			return 1;
		} else if (var0 == 4103) {
			String var33 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var33.toLowerCase();
			return 1;
		} else if (4104 == var0) {
			int var32 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			long var46 = (var32 + 11745L) * 86400000L;
			ac_fld.setTime(new Date(var46));
			int var61 = ac_fld.get(5);
			int var65 = ac_fld.get(2);
			int var66 = ac_fld.get(1);
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var61 + "-" + ae_fld[var65] + "-" + var66;
			return 1;
		} else if (var0 == 4105) {
			ef.aq_fld -= 2;
			String var31 = (String)ai_fld[ef.aq_fld];
			String var45 = (String)ai_fld[ef.aq_fld + 1];
			cv var56 = ot.ef();
			if (var56 != null && null != var56.av_fld && 1953147203 * var56.av_fld.ax_fld != 0) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var45;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var31;
			}

			return 1;
		} else if (4106 == var0) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = Integer.toString(var30);
			return 1;
		} else if (4107 == var0) {
			ef.aq_fld -= 2;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bs.aq(ee.ak((String)ai_fld[ef.aq_fld], (String)ai_fld[1 + ef.aq_fld], ku.gi_fld));
			return 1;
		} else if (var0 == 4108) {
			String var29 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var44 = au_fld[gz.ax_fld];
			int var55 = au_fld[1 + gz.ax_fld];
			byte[] var60 = ow.ie_fld.bb(var55, 0, 584982574);
			zf var64 = new zf(var60);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var64.aq(var29, var44);
			return 1;
		} else if (4109 == var0) {
			String var28 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var43 = au_fld[gz.ax_fld];
			int var54 = au_fld[1 + gz.ax_fld];
			byte[] var59 = ow.ie_fld.bb(var54, 0, 584982574);
			zf var63 = new zf(var59);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = zv.cf(var63, var28, var43);
			return 1;
		} else if (var0 == 4110) {
			ef.aq_fld -= 2;
			String var27 = (String)ai_fld[ef.aq_fld];
			String var42 = (String)ai_fld[ef.aq_fld + 1];
			if (au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var27;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var42;
			}

			return 1;
		} else if (var0 == 4111) {
			String var26 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = zv.ay(var26);
			return 1;
		} else if (4112 == var0) {
			String var25 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var41 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var25 + (char)var41;
			return 1;
		} else if (4113 == var0) {
			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = md.ai((char)var24) ? 1 : 0;
			return 1;
		} else if (4114 == var0) {
			int var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ey.au((char)var23) ? 1 : 0;
			return 1;
		} else if (4115 == var0) {
			int var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = eu.af((char)var22) ? 1 : 0;
			return 1;
		} else if (4116 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jw.al((char)var21) ? 1 : 0;
			return 1;
		} else if (4117 == var0) {
			String var20 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			if (null != var20) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var20.length();
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (4118 == var0) {
			String var19 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var40 = au_fld[gz.ax_fld];
			int var53 = au_fld[gz.ax_fld + 1];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var19.substring(var40, var53);
			return 1;
		} else if (var0 == 4119) {
			String var18 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			StringBuilder var39 = new StringBuilder(var18.length());
			boolean var52 = false;

			for (int var58 = 0; var58 < var18.length(); var58++) {
				char var62 = var18.charAt(var58);
				if ('<' == var62) {
					var52 = true;
				} else if (var62 == '>') {
					var52 = false;
				} else if (!var52) {
					var39.append(var62);
				}
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var39.toString();
			return 1;
		} else if (4120 == var0) {
			String var17 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17.indexOf(var38);
			return 1;
		} else if (4121 == var0) {
			ef.aq_fld -= 2;
			String var16 = (String)ai_fld[ef.aq_fld];
			String var37 = (String)ai_fld[ef.aq_fld + 1];
			int var51 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16.indexOf(var37, var51);
			return 1;
		} else if (4122 == var0) {
			String var15 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var15.toUpperCase();
			return 1;
		} else if (var0 == 4123) {
			ef.aq_fld -= 3;
			String var14 = (String)ai_fld[ef.aq_fld];
			String var4 = (String)ai_fld[ef.aq_fld + 1];
			String var50 = (String)ai_fld[ef.aq_fld + 2];
			cv var57 = ot.ef();
			if (null != var57 && null != var57.av_fld) {
				switch (-753683305 * var57.av_fld.au_fld) {
					case 0:
						ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14;
						break;
					case 1:
						ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4;
						break;
					case 2:
					default:
						ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var50;
				}

				return 1;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var50;
				return 1;
			}
		} else if (var0 == 4124) {
			cv var13 = ot.ef();
			if (null != var13 && var13.av_fld != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -753683305 * var13.av_fld.au_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		} else if (var0 == 4125) {
			long var12 = an_fld[(db.aa_fld -= 432101741) * 867932261];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = Long.toString(var12);
			return 1;
		} else if (var0 != 4126) {
			return 2;
		} else {
			long var3 = an_fld[(db.aa_fld -= 432101741) * 867932261];
			String var5 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			String var6;
			if (0L == var3) {
				var6 = "0";
			} else if (!var5.isEmpty()) {
				boolean var7 = var3 < 0L;
				long var8 = var7 ? -var3 : var3;
				StringBuilder var10 = new StringBuilder();

				for (int var11 = 1; var8 > 0L; var11++) {
					var10.insert(0, var8 % 10L);
					var8 /= 10L;
					if (var8 > 0L && var11 % 3 == 0) {
						var10.insert(0, ",");
					}
				}

				if (var7) {
					var10.insert(0, '-');
				}

				var6 = var10.toString();
			} else {
				var6 = Long.toString(var3);
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var6;
			return 1;
		}
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ex(int var0, ba var1, boolean var2) throws EOFException {
		boolean var3 = true;
		lu var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			var3 = false;
		} else {
			var4 = var2 ? gs.ap_fld : ab_fld;
		}

		if (1300 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			if (var17 >= 0 && var17 < 32) {
				var4.ai(var17, (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], 1722918626);
				return 1;
			} else {
				ef.aq_fld--;
				return 1;
			}
		} else if (1301 == var0) {
			gz.ax_fld -= 2;
			int var16 = au_fld[gz.ax_fld];
			int var22 = au_fld[gz.ax_fld + 1];
			var4.ea_fld = cf.cg_fld.ag(var16, var22, -1840551581);
			return 1;
		} else if (1302 == var0) {
			var4.em_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (var0 == 1303) {
			var4.ev_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1304) {
			var4.ey_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1305) {
			var4.eq_fld = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			return 1;
		} else if (1306 == var0) {
			var4.el_fld = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			return 1;
		} else if (1307 == var0) {
			var4.ei_fld = null;
			var4.ee_fld = null;
			return 1;
		} else if (1308 == var0) {
			var4.hh_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (var0 == 1309) {
			gz.ax_fld--;
			return 1;
		} else if (1310 == var0) {
			int var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			if (var15 >= 0 && var15 <= 9 && var4.ee_fld != null) {
				var4.ee_fld[var15] = null;
				return 1;
			} else {
				return 1;
			}
		} else if (1311 == var0) {
			int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			if (var21 >= 0 && var21 <= 9 && var14 >= 0) {
				var4.aq(var21, var14, (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], 1657547323);
				return 1;
			} else {
				throw new RuntimeException();
			}
		} else if (1312 == var0) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var13 == -1) {
				var4.ek_fld = 413932284;
			} else if (var13 >= 1 && var13 <= 32) {
				var4.ek_fld = -970258753 * (var13 - 1);
			}

			return 1;
		} else if (1350 != var0) {
			if (1351 == var0) {
				gz.ax_fld -= 2;
				byte var12 = 10;
				byte[] var20 = new byte[]{(byte)au_fld[gz.ax_fld]};
				byte[] var27 = new byte[]{(byte)au_fld[gz.ax_fld + 1]};
				kd.aa(var4, var12, var20, var27, 92998799);
				return 1;
			} else if (1352 == var0) {
				gz.ax_fld -= 3;
				int var11 = au_fld[gz.ax_fld] - 1;
				int var19 = au_fld[1 + gz.ax_fld];
				int var26 = au_fld[2 + gz.ax_fld];
				if (var11 >= 0 && var11 <= 9) {
					ct.ai(var4, var11, var19, var26);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1353) {
				byte var10 = 10;
				int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var25 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ct.ai(var4, var10, var18, var25);
				return 1;
			} else if (var0 == 1354) {
				gz.ax_fld--;
				int var9 = au_fld[gz.ax_fld] - 1;
				if (var9 >= 0 && var9 <= 9) {
					ox.aq(var4, var9, 1659524022);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1355) {
				byte var8 = 10;
				ox.aq(var4, var8, 1026661236);
				return 1;
			} else {
				return 2;
			}
		} else {
			byte[] var5 = null;
			byte[] var6 = null;
			if (var3) {
				gz.ax_fld -= 10;
				byte var7 = 0;

				while (var7 < 10 && au_fld[gz.ax_fld + var7] >= 0) {
					var7 += 2;
				}

				if (var7 > 0) {
					var5 = new byte[var7 / 2];
					var6 = new byte[var7 / 2];

					for (int var23 = var7 - 2; var23 >= 0; var23 -= 2) {
						var5[var23 / 2] = (byte)au_fld[gz.ax_fld + var23];
						var6[var23 / 2] = (byte)au_fld[gz.ax_fld + var23 + 1];
					}
				}
			} else {
				gz.ax_fld -= 2;
				var5 = new byte[]{(byte)au_fld[gz.ax_fld]};
				var6 = new byte[]{(byte)au_fld[1 + gz.ax_fld]};
			}

			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			if (var24 >= 0 && var24 <= 9) {
				kd.aa(var4, var24, var5, var6, 92998799);
				return 1;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gw(int var0, ba var1) throws EOFException {
		if (var0 == 4200) {
			int var26 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kb.ag(var26, -1752383175).dx_fld;
			return 1;
		} else if (var0 == 4201) {
			gz.ax_fld -= 2;
			int var25 = au_fld[gz.ax_fld];
			int var35 = au_fld[1 + gz.ax_fld];
			og var37 = kb.ag(var25, -1752383175);
			if (var35 >= 1 && var35 <= 5 && var37.ak(-2139788883).ag(var35 - 1, -1334372758)) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var37.ak(-2139788883).ae(var35 - 1, rt.ag_fld, 1899227782);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 4202) {
			gz.ax_fld -= 2;
			int var24 = au_fld[gz.ax_fld];
			int var34 = au_fld[gz.ax_fld + 1];
			og var36 = kb.ag(var24, -1752383175);
			if (var34 >= 1 && var34 <= 5 && null != var36.ex_fld[var34 - 1]) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var36.ex_fld[var34 - 1];
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (4222 == var0) {
			gz.ax_fld -= 3;
			int var23 = au_fld[gz.ax_fld];
			int var33 = au_fld[1 + gz.ax_fld];
			int var5 = au_fld[2 + gz.ax_fld];
			og var6 = kb.ag(var23, -1752383175);
			String var7 = null;
			if (var33 >= 1
				&& var33 <= 5
				&& null != var6.ex_fld[var33 - 1]
				&& var6.eo_fld != null
				&& null != var6.eo_fld[var33 - 1]
				&& var5 >= 1
				&& var5 <= var6.eo_fld[var33 - 1].length) {
				var7 = var6.eo_fld[var33 - 1][var5 - 1];
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var7 ? var7 : "";
			return 1;
		} else if (4203 == var0) {
			int var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var22, -1752383175).es_fld * -1489673433;
			return 1;
		} else if (4204 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var21, -1752383175).dj_fld * -2061559521 == 1 ? 1 : 0;
			return 1;
		} else if (var0 == 4205) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var32 = kb.ag(var20, -1752383175);
			if (-1 == var32.eg_fld && var32.en_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32.en_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var20;
			}

			return 1;
		} else if (var0 == 4206) {
			int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var31 = kb.ag(var19, -1752383175);
			if (var31.eg_fld >= 0 && var31.en_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var31.en_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var19;
			}

			return 1;
		} else if (4207 == var0) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var18, -1752383175).et_fld ? 1 : 0;
			return 1;
		} else if (var0 == 4208) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var30 = kb.ag(var17, -1752383175);
			if (var30.fa_fld == -1 && var30.fy_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var30.fy_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17;
			}

			return 1;
		} else if (4209 == var0) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var29 = kb.ag(var16, -1752383175);
			if (var29.fa_fld >= 0 && var29.fy_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var29.fy_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16;
			}

			return 1;
		} else if (var0 == 4210) {
			String var15 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var28 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			my.hb(var15, var28 == 1);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ey.gn_fld;
			return 1;
		} else if (var0 != 4211) {
			if (var0 == 4212) {
				tv.go_fld = 0;
				return 1;
			} else if (var0 == 4213) {
				int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var27 = kb.ag(var14, -1752383175).ap(-1115558799);
				if (var27 == -1) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27 + 1;
				}

				return 1;
			} else if (var0 == 4214) {
				int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var13, -1752383175).ep_fld * -616953337;
				return 1;
			} else if (var0 == 4215) {
				int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var12, -1752383175).eb_fld * 681741211;
				return 1;
			} else if (var0 == 4216) {
				int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var11, -1752383175).ed_fld * -1990169435;
				return 1;
			} else if (var0 == 4217) {
				int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				og var4 = kb.ag(var10, -1752383175);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ev_fld;
				return 1;
			} else if (4218 == var0) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kb.ag(var9, -1752383175).ds_fld;
				return 1;
			} else if (4219 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var8, -1752383175).ec_fld * 622243963;
				return 1;
			} else if (var0 == 4220) {
				int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var3, -1752383175).em_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			if (in.gc_fld != null && tv.go_fld < ey.gn_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = in.gc_fld[(tv.go_fld += -1770817561) * 1924770775 - 1] & '\uffff';
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gx(int var0, ba var1) throws EOFException {
		if (var0 == 4200) {
			int var26 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kb.ag(var26, -1752383175).dx_fld;
			return 1;
		} else if (var0 == 4201) {
			gz.ax_fld -= 2;
			int var25 = au_fld[gz.ax_fld];
			int var35 = au_fld[1 + gz.ax_fld];
			og var37 = kb.ag(var25, -1752383175);
			if (var35 >= 1 && var35 <= 5 && var37.ak(-2139788883).ag(var35 - 1, -1613701587)) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var37.ak(-2139788883).ae(var35 - 1, rt.ag_fld, 1899227782);
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 4202) {
			gz.ax_fld -= 2;
			int var24 = au_fld[gz.ax_fld];
			int var34 = au_fld[gz.ax_fld + 1];
			og var36 = kb.ag(var24, -1752383175);
			if (var34 >= 1 && var34 <= 5 && null != var36.ex_fld[var34 - 1]) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var36.ex_fld[var34 - 1];
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (4222 == var0) {
			gz.ax_fld -= 3;
			int var23 = au_fld[gz.ax_fld];
			int var33 = au_fld[1 + gz.ax_fld];
			int var5 = au_fld[2 + gz.ax_fld];
			og var6 = kb.ag(var23, -1752383175);
			String var7 = null;
			if (var33 >= 1
				&& var33 <= 5
				&& null != var6.ex_fld[var33 - 1]
				&& var6.eo_fld != null
				&& null != var6.eo_fld[var33 - 1]
				&& var5 >= 1
				&& var5 <= var6.eo_fld[var33 - 1].length) {
				var7 = var6.eo_fld[var33 - 1][var5 - 1];
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var7 ? var7 : "";
			return 1;
		} else if (4203 == var0) {
			int var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var22, -1752383175).es_fld * -1489673433;
			return 1;
		} else if (4204 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var21, -1752383175).dj_fld * -2061559521 == 1 ? 1 : 0;
			return 1;
		} else if (var0 == 4205) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var32 = kb.ag(var20, -1752383175);
			if (-1 == var32.eg_fld && var32.en_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32.en_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var20;
			}

			return 1;
		} else if (var0 == 4206) {
			int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var31 = kb.ag(var19, -1752383175);
			if (var31.eg_fld >= 0 && var31.en_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var31.en_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var19;
			}

			return 1;
		} else if (4207 == var0) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var18, -1752383175).et_fld ? 1 : 0;
			return 1;
		} else if (var0 == 4208) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var30 = kb.ag(var17, -1752383175);
			if (var30.fa_fld == -1 && var30.fy_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var30.fy_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17;
			}

			return 1;
		} else if (4209 == var0) {
			int var16 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			og var29 = kb.ag(var16, -1752383175);
			if (var29.fa_fld >= 0 && var29.fy_fld >= 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var29.fy_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16;
			}

			return 1;
		} else if (var0 == 4210) {
			String var15 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var28 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			my.hb(var15, var28 == 1);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ey.gn_fld;
			return 1;
		} else if (var0 != 4211) {
			if (var0 == 4212) {
				tv.go_fld = 0;
				return 1;
			} else if (var0 == 4213) {
				int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var27 = kb.ag(var14, -1752383175).ap(-1898983184);
				if (var27 == -1) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27 + 1;
				}

				return 1;
			} else if (var0 == 4214) {
				int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var13, -1752383175).ep_fld * -616953337;
				return 1;
			} else if (var0 == 4215) {
				int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var12, -1752383175).eb_fld * 681741211;
				return 1;
			} else if (var0 == 4216) {
				int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var11, -1752383175).ed_fld * -1990169435;
				return 1;
			} else if (var0 == 4217) {
				int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				og var4 = kb.ag(var10, -1752383175);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ev_fld;
				return 1;
			} else if (4218 == var0) {
				int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kb.ag(var9, -1752383175).ds_fld;
				return 1;
			} else if (4219 == var0) {
				int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var8, -1752383175).ec_fld * 622243963;
				return 1;
			} else if (var0 == 4220) {
				int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var3, -1752383175).em_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			if (in.gc_fld != null && tv.go_fld < ey.gn_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = in.gc_fld[(tv.go_fld += -1770817561) * 1924770775 - 1] & '\uffff';
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gb(int var0, ba var1) throws FileNotFoundException, EOFException, UnsupportedEncodingException {
		if (var0 == 5000) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ka_fld;
			return 1;
		} else if (5001 == var0) {
			gz.ax_fld -= 3;
			client.ka_fld = -1983418707 * au_fld[gz.ax_fld];
			hb.kt_fld = ue.ak(au_fld[1 + gz.ax_fld], (byte)119);
			if (null == hb.kt_fld) {
				hb.kt_fld = yt.ag_fld;
			}

			client.kf_fld = au_fld[2 + gz.ax_fld];
			jm var20 = gi.ak(jb.bw_fld, client.aq_fld.av_fld);
			var20.ay_fld.bc(client.ka_fld);
			var20.ay_fld.bc(hb.kt_fld.av_fld);
			var20.ay_fld.bc(client.kf_fld);
			client.aq_fld.az(var20);
			return 1;
		} else if (var0 == 5002) {
			String var19 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var28 = au_fld[gz.ax_fld];
			int var33 = au_fld[gz.ax_fld + 1];
			jm var35 = gi.ak(jb.de_fld, client.aq_fld.av_fld);
			var35.ay_fld.bc(iq.bu(var19) + 2);
			var35.ay_fld.cc(var19, 199169248);
			var35.ay_fld.bc(var28 - 1);
			var35.ay_fld.bc(var33);
			client.aq_fld.az(var35);
			return 1;
		} else if (var0 == 5003) {
			gz.ax_fld -= 2;
			int var18 = au_fld[gz.ax_fld];
			int var27 = au_fld[gz.ax_fld + 1];
			co var32 = bn.av(var18, var27);
			if (null != var32) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32.ak_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32.ag_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var32.av_fld != null ? var32.av_fld : "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var32.ah_fld ? var32.ah_fld : "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var32.aw_fld != null ? var32.aw_fld : "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32.az((byte)-97) ? 1 : (var32.ah((short)-695) ? 2 : 0);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (5004 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			co var26 = mh.ae(var17);
			if (null != var26) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var26.az_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var26.ag_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var26.av_fld != null ? var26.av_fld : "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var26.ah_fld ? var26.ah_fld : "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var26.aw_fld != null ? var26.aw_fld : "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var26.az((byte)-125) ? 1 : (var26.ah((short)-15360) ? 2 : 0);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 5005) {
			if (null == hb.kt_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = hb.kt_fld.av_fld;
			}

			return 1;
		} else if (var0 == 5008) {
			String var16 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var25 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			jm var31 = yi.ak(var25, var16, ku.gi_fld, -1);
			client.aq_fld.az(var31);
			return 1;
		} else if (var0 == 5009) {
			ef.aq_fld -= 2;
			String var15 = (String)ai_fld[ef.aq_fld];
			String var24 = (String)ai_fld[1 + ef.aq_fld];
			jm var30 = gi.ak(jb.be_fld, client.aq_fld.av_fld);
			var30.ay_fld.bw(0);
			int var34 = var30.ay_fld.au_fld * -661977895;
			var30.ay_fld.cc(var15, 909817156);
			jj.ak(var30.ay_fld, var24);
			xi.kn(var30.ay_fld, -661977895 * var30.ay_fld.au_fld - var34, -347611348);
			client.aq_fld.az(var30);
			return 1;
		} else if (5010 == var0) {
			String var14 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var23 = au_fld[gz.ax_fld];
			int var29 = au_fld[1 + gz.ax_fld];
			jm var6 = yi.ak(var23, var14, ku.gi_fld, var29);
			client.aq_fld.az(var6);
			return 1;
		} else if (var0 == 5015) {
			aax var13 = og.ci_fld.jn((byte)-94);
			String var22 = var13 != null ? var13.ak(-2079289) : "";
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var22;
			return 1;
		} else if (var0 == 5016) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.kf_fld;
			return 1;
		} else if (5017 == var0) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gb.ah(var12);
			return 1;
		} else if (var0 == 5018) {
			int var11 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = rb.ar(var11, (byte)12);
			return 1;
		} else if (5019 == var0) {
			int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ix.as(var10);
			return 1;
		} else if (var0 == 5020) {
			String var9 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			en.bx(var9, (byte)11);
			return 1;
		} else if (var0 == 5021) {
			client.kn_fld = ((String)ai_fld[(ef.aq_fld -= -211521517) * -836183525]).toLowerCase().trim();
			return 1;
		} else if (5022 == var0) {
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = client.kn_fld;
			return 1;
		} else if (5023 == var0) {
			String var8 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			System.out.println(var8);
			return 1;
		} else if (5030 == var0) {
			gz.ax_fld -= 2;
			int var7 = au_fld[gz.ax_fld];
			int var21 = au_fld[gz.ax_fld + 1];
			co var5 = bn.av(var7, var21);
			if (var5 != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.ak_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.ag_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var5.av_fld ? var5.av_fld : "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var5.ah_fld != null ? var5.ah_fld : "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var5.aw_fld ? var5.aw_fld : "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.az((byte)-85) ? 1 : (var5.ah((short)-13415) ? 2 : 0);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (5031 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			co var4 = mh.ae(var3);
			if (var4 != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.az_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ag_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var4.av_fld ? var4.av_fld : "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var4.ah_fld ? var4.ah_fld : "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var4.aw_fld ? var4.aw_fld : "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.az((byte)-61) ? 1 : (var4.ah((short)-25371) ? 2 : 0);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ew(int var0, ba var1, boolean var2) throws EOFException {
		boolean var3 = true;
		lu var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			var3 = false;
		} else {
			var4 = var2 ? gs.ap_fld : ab_fld;
		}

		if (1300 == var0) {
			int var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			if (var17 >= 0 && var17 < 32) {
				var4.ai(var17, (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], 619491455);
				return 1;
			} else {
				ef.aq_fld--;
				return 1;
			}
		} else if (1301 == var0) {
			gz.ax_fld -= 2;
			int var16 = au_fld[gz.ax_fld];
			int var22 = au_fld[gz.ax_fld + 1];
			var4.ea_fld = cf.cg_fld.ag(var16, var22, -1410630551);
			return 1;
		} else if (1302 == var0) {
			var4.em_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (var0 == 1303) {
			var4.ev_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1304) {
			var4.ey_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			return 1;
		} else if (var0 == 1305) {
			var4.eq_fld = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			return 1;
		} else if (1306 == var0) {
			var4.el_fld = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			return 1;
		} else if (1307 == var0) {
			var4.ei_fld = null;
			var4.ee_fld = null;
			return 1;
		} else if (1308 == var0) {
			var4.hh_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			return 1;
		} else if (var0 == 1309) {
			gz.ax_fld--;
			return 1;
		} else if (1310 == var0) {
			int var15 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			if (var15 >= 0 && var15 <= 9 && var4.ee_fld != null) {
				var4.ee_fld[var15] = null;
				return 1;
			} else {
				return 1;
			}
		} else if (1311 == var0) {
			int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			if (var21 >= 0 && var21 <= 9 && var14 >= 0) {
				var4.aq(var21, var14, (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525], 2042930086);
				return 1;
			} else {
				throw new RuntimeException();
			}
		} else if (1312 == var0) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var13 == -1) {
				var4.ek_fld = 413932284;
			} else if (var13 >= 1 && var13 <= 32) {
				var4.ek_fld = -970258753 * (var13 - 1);
			}

			return 1;
		} else if (1350 != var0) {
			if (1351 == var0) {
				gz.ax_fld -= 2;
				byte var12 = 10;
				byte[] var20 = new byte[]{(byte)au_fld[gz.ax_fld]};
				byte[] var27 = new byte[]{(byte)au_fld[gz.ax_fld + 1]};
				kd.aa(var4, var12, var20, var27, 92998799);
				return 1;
			} else if (1352 == var0) {
				gz.ax_fld -= 3;
				int var11 = au_fld[gz.ax_fld] - 1;
				int var19 = au_fld[1 + gz.ax_fld];
				int var26 = au_fld[2 + gz.ax_fld];
				if (var11 >= 0 && var11 <= 9) {
					ct.ai(var4, var11, var19, var26);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1353) {
				byte var10 = 10;
				int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var25 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				ct.ai(var4, var10, var18, var25);
				return 1;
			} else if (var0 == 1354) {
				gz.ax_fld--;
				int var9 = au_fld[gz.ax_fld] - 1;
				if (var9 >= 0 && var9 <= 9) {
					ox.aq(var4, var9, -1905731490);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1355) {
				byte var8 = 10;
				ox.aq(var4, var8, -444390851);
				return 1;
			} else {
				return 2;
			}
		} else {
			byte[] var5 = null;
			byte[] var6 = null;
			if (var3) {
				gz.ax_fld -= 10;
				byte var7 = 0;

				while (var7 < 10 && au_fld[gz.ax_fld + var7] >= 0) {
					var7 += 2;
				}

				if (var7 > 0) {
					var5 = new byte[var7 / 2];
					var6 = new byte[var7 / 2];

					for (int var23 = var7 - 2; var23 >= 0; var23 -= 2) {
						var5[var23 / 2] = (byte)au_fld[gz.ax_fld + var23];
						var6[var23 / 2] = (byte)au_fld[gz.ax_fld + var23 + 1];
					}
				}
			} else {
				gz.ax_fld -= 2;
				var5 = new byte[]{(byte)au_fld[gz.ax_fld]};
				var6 = new byte[]{(byte)au_fld[1 + gz.ax_fld]};
			}

			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] - 1;
			if (var24 >= 0 && var24 <= 9) {
				kd.aa(var4, var24, var5, var6, 92998799);
				return 1;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hr(int var0, ba var1) {
		if (5306 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = xy.cy();
			return 1;
		} else if (5307 == var0) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (1 == var4 || 2 == var4) {
				ys.cf(var4, (byte)77);
			}

			return 1;
		} else if (5308 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cx.kq_fld.bd(1226256711);
			return 1;
		} else if (var0 != 5309) {
			if (var0 == 5310) {
				gz.ax_fld--;
				return 1;
			} else {
				return 2;
			}
		} else {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var3 == 1 || 2 == var3) {
				cx.kq_fld.bz(var3, (byte)32);
			}

			return 1;
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hj(int var0, ba var1) {
		if (-50624459 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -1561688053 - 1] = xy.cy();
			return 1;
		} else if (5307 == var0) {
			int var4 = au_fld[(gz.ax_fld -= -996418263) * -776631127];
			if (1 == var4 || 2 == var4) {
				ys.cf(var4, (byte)35);
			}

			return 1;
		} else if (5308 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -439203765 - 1] = cx.kq_fld.bd(1195961225);
			return 1;
		} else if (var0 != 5309) {
			if (var0 == -453171102) {
				gz.ax_fld -= -1872130491;
				return 1;
			} else {
				return 2;
			}
		} else {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * 1938932829];
			if (var3 == 1 || 2 == var3) {
				cx.kq_fld.bz(var3, (byte)32);
			}

			return 1;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hp(int var0, ba var1) {
		if (5504 == var0) {
			gz.ax_fld -= -1019204696;
			int var5 = au_fld[gz.ax_fld * 1329736058];
			int var4 = au_fld[gz.ax_fld + 1];
			if (!client.ki_fld) {
				client.jf_fld = var5 * -822500371;
				client.js_fld = -989355811 * var4;
			}

			return 1;
		} else if (1828913380 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * 831299077 - 1] = -1695065175 * client.jf_fld;
			return 1;
		} else if (var0 == 5506) {
			au_fld[(gz.ax_fld += -1684678759) * -591067612 - 1] = 252427825 * client.js_fld;
			return 1;
		} else if (-687105169 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -272341990];
			if (var3 < 0) {
				var3 = 0;
			}

			client.dy_fld = var3;
			return 1;
		} else if (var0 == -2124959146) {
			au_fld[(gz.ax_fld += 440783600) * -718480033 - 1] = 1601139742 * client.dy_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	static void dc(sl var0, int var1) {
		if (var1 < 0 || var1 >= var0.av()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hf(int var0, ba var1) {
		if (var0 == 5630) {
			client.jk_fld = 362378318;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int hn(int var0) {
		return (int)Math.pow(2.0, 7.0F + var0 / 256.0F);
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int he(int var0, ba var1) {
		if (var0 == 2079901130) {
			client.jk_fld = 362378318;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(Llu;Z)V"
	)
	static void dw(lu var0, boolean var1) {
		if (null != var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
			if (var1) {
				gs.ap_fld = var0;
			} else {
				ab_fld = var0;
			}
		} else {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int hk(int var0) {
		return (int)Math.pow(2.0, 7.0F + var0 / 256.0F);
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int hi(int var0) {
		return (int)Math.pow(2.0, 7.0F + var0 / 256.0F);
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fh(int var0, ba var1) throws EOFException {
		if (var0 == 1837641460) {
			lu var13 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * 1267053666]);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var13.ga_fld;
			return 1;
		} else if (2701 == var0) {
			lu var12 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			if (var12.ga_fld != -1) {
				au_fld[(gz.ax_fld += -1071778103) * -797990543 - 1] = -1600290376 * var12.gd_fld;
			} else {
				au_fld[(gz.ax_fld += 1067816692) * 1961707016 - 1] = 0;
			}

			return 1;
		} else if (var0 == 400461166) {
			int var11 = au_fld[(gz.ax_fld -= -1684678759) * 960551942];
			pk var15 = (pk)cf.cg_fld.ai_fld.ak(var11);
			if (null != var15) {
				au_fld[(gz.ax_fld += -1684678759) * -107834356 - 1] = 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -307189035 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2703) {
			gz.ax_fld -= 2102971612;
			int var10 = au_fld[2016088705 * gz.ax_fld];
			lu var14 = cf.cg_fld.ag(au_fld[1 + gz.ax_fld], au_fld[2 + gz.ax_fld], -1243540727);
			px var16 = kb.ag_px(var10, -275986715);
			if (var16.aw()) {
				ai_fld[(ef.aq_fld += 228455798) * -555853665 - 1] = var14.ao(var10, var16.as_fld, -1908256595);
			} else if (px.ll(var16, (short)10000)) {
				an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var14.ap(var10, var16.ay_fld);
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.jj(var14, var10, var16.aw_fld);
			}

			return 1;
		} else if (var0 == 1628747162) {
			gz.ax_fld -= 3;
			lu var9 = cf.cg_fld.ag(au_fld[gz.ax_fld], au_fld[gz.ax_fld + 1], -802288279);
			int var4 = au_fld[2 + gz.ax_fld];
			Object var5 = he.cg(var4);
			int var6 = au_fld[(gz.ax_fld -= -1684678759) * -1038927038];
			var9.at(var6, var5, 583965381);
			return 1;
		} else if (2706 == var0) {
			au_fld[(gz.ax_fld += -2089251415) * 1621337600 - 1] = cf.cg_fld.aa_fld;
			return 1;
		} else if (var0 == 2707) {
			lu var8 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			au_fld[(gz.ax_fld += -1684678759) * 657493061 - 1] = lu.qz(var8, 1142195588) ? 1 : 0;
			return 1;
		} else if (2708 == var0) {
			lu var7 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -765808989]);
			return ap(var7);
		} else if (2709 == var0) {
			lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -1502000297]);
			return ag.at(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int io(int var0, ba var1) {
		if (var0 == 13337) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ao_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int hq(int var0) {
		return (int)((Math.log(var0) / as_fld - 7.0) * 256.0);
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hl(int var0, ba var1) {
		if (var0 == 6200) {
			gz.ax_fld -= 2;
			client.fj_fld = (short)mn.bw(au_fld[gz.ax_fld]);
			if (client.fj_fld <= 0) {
				client.fj_fld = 256;
			}

			client.fb_fld = (short)mn.bw(au_fld[1 + gz.ax_fld]);
			if (client.fb_fld <= 0) {
				client.fb_fld = 256;
			}

			return 1;
		} else if (6201 == var0) {
			gz.ax_fld -= 2;
			client.fk_fld = (short)au_fld[gz.ax_fld];
			if (client.fk_fld <= 0) {
				client.fk_fld = 256;
			}

			client.fc_fld = (short)au_fld[1 + gz.ax_fld];
			if (client.fc_fld <= 0) {
				client.fc_fld = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			gz.ax_fld -= 4;
			client.fh_fld = (short)au_fld[gz.ax_fld];
			if (client.fh_fld <= 0) {
				client.fh_fld = 1;
			}

			client.fm_fld = (short)au_fld[1 + gz.ax_fld];
			if (client.fm_fld <= 0) {
				client.fm_fld = 32767;
			} else if (client.fm_fld < client.fh_fld) {
				client.fm_fld = client.fh_fld;
			}

			client.fe_fld = (short)au_fld[2 + gz.ax_fld];
			if (client.fe_fld <= 0) {
				client.fe_fld = 1;
			}

			client.fw_fld = (short)au_fld[3 + gz.ax_fld];
			if (client.fw_fld <= 0) {
				client.fw_fld = 32767;
			} else if (client.fw_fld < client.fe_fld) {
				client.fw_fld = client.fe_fld;
			}

			return 1;
		} else if (var0 == 6203) {
			if (cf.cg_fld.aq_fld != null) {
				hw.cn(0, 0, cf.cg_fld.aq_fld.bb_fld * -1223437005, cf.cg_fld.aq_fld.cd_fld * 124430729, false);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fn_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ft_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fk_fld;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fc_fld;
			return 1;
		} else if (var0 == 6205) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fg.ba(client.fj_fld);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fg.ba(client.fb_fld);
			return 1;
		} else if (var0 == 6220) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (6222 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = pf.qw_fld;
			return 1;
		} else if (6223 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bc.qx_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Llu;I[B[B)V"
	)
	static final void eo(lu var0, int var1, byte[] var2, byte[] var3) {
		if (null == var0.er_fld) {
			if (var2 == null) {
				return;
			}

			var0.er_fld = new byte[11][];
			var0.en_fld = new byte[11][];
			var0.eg_fld = new int[11];
			var0.ef_fld = new int[11];
		}

		var0.er_fld[var1] = var2;
		if (var2 != null) {
			var0.ez_fld = true;
		} else {
			var0.ez_fld = false;

			for (int var4 = 0; var4 < var0.er_fld.length; var4++) {
				if (null != var0.er_fld[var4]) {
					var0.ez_fld = true;
					break;
				}
			}
		}

		var0.en_fld[var1] = var3;
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int fb(int var0, ba var1) throws EOFException {
		lu var3 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
		if (2500 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bq_fld;
			return 1;
		} else if (2501 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bg_fld;
			return 1;
		} else if (2502 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bb_fld;
			return 1;
		} else if (2503 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cd_fld;
			return 1;
		} else if (2504 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cf_fld ? 1 : 0;
			return 1;
		} else if (2505 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cv_fld;
			return 1;
		} else if (2506 != var0) {
			return 2;
		} else {
			int var4 = var3.cv_fld;
			if (-1 == var4) {
				uo var5 = cf.cg_fld;

				for (pk var6 = (pk)var5.ai_fld.aq(); var6 != null; var6 = (pk)xz.aa(var5.ai_fld)) {
					if (var3.bf_fld >> 16 == var6.ak_fld) {
						var4 = (int)var6.hc_fld;
						break;
					}
				}
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hg(int var0, ba var1) throws EOFException {
		if (6500 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gv.ak() ? 1 : 0;
			return 1;
		} else if (6501 == var0) {
			ct var15 = gk.aw();
			if (null != var15) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var15.af_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var15.al_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var15.an_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var15.aa_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var15.au_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var15.ax_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (6502 == var0) {
			ct var14 = ey.ay();
			if (var14 != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var14.af_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var14.al_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14.an_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var14.aa_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var14.au_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14.ax_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 6506) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ct var22 = null;

			for (int var28 = 0; var28 < ct.ah_fld; var28++) {
				if (-407267201 * yd.ae_fld[var28].af_fld == var13) {
					var22 = yd.ae_fld[var28];
					break;
				}
			}

			if (null != var22) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.af_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.al_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var22.an_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.aa_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22.au_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var22.ax_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		} else if (var0 == 6507) {
			gz.ax_fld -= 4;
			int var12 = au_fld[gz.ax_fld];
			boolean var21 = au_fld[gz.ax_fld + 1] == 1;
			int var27 = au_fld[2 + gz.ax_fld];
			boolean var6 = au_fld[3 + gz.ax_fld] == 1;
			tw.av(var12, var21, var27, var6, -1986014440);
			return 1;
		} else if (6511 != var0) {
			if (6512 == var0) {
				client.eq_fld = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				return 1;
			} else if (var0 == 6513) {
				gz.ax_fld -= 2;
				int var11 = au_fld[gz.ax_fld];
				int var20 = au_fld[1 + gz.ax_fld];
				px var26 = kb.ag_px(var20, -1832247727);
				if (var26.aw()) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ca.az(var11).ax(var20, var26.as_fld, (byte)25);
				} else if (px.ll(var26, (short)10000)) {
					an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ca.az(var11).au(var20, var26.ay_fld);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = pp.kt(ca.az(var11), var20, var26.aw_fld, (byte)-62);
				}

				return 1;
			} else if (var0 == 6514) {
				gz.ax_fld -= 2;
				int var10 = au_fld[gz.ax_fld];
				int var19 = au_fld[gz.ax_fld + 1];
				px var25 = kb.ag_px(var19, -904515343);
				if (var25.aw()) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ko.az(var10).ai(var19, var25.as_fld, -1778681744);
				} else if (px.ll(var25, (short)10000)) {
					an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ko.az(var10).aa(var19, var25.ay_fld);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ko.az(var10).an(var19, var25.aw_fld, -1605901331);
				}

				return 1;
			} else if (var0 == 6515) {
				gz.ax_fld -= 2;
				int var9 = au_fld[gz.ax_fld];
				int var18 = au_fld[gz.ax_fld + 1];
				px var24 = kb.ag_px(var18, -1962212836);
				if (var24.aw()) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = og.sw(kb.ag(var9, -1752383175), var18, var24.as_fld, (byte)-68);
				} else if (px.ll(var24, (short)10000)) {
					an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = og.pv(kb.ag(var9, -1752383175), var18, var24.ay_fld);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var9, -1752383175).ad(var18, var24.aw_fld, 18946152);
				}

				return 1;
			} else if (6516 == var0) {
				gz.ax_fld -= 2;
				int var8 = au_fld[gz.ax_fld];
				int var17 = au_fld[1 + gz.ax_fld];
				px var23 = kb.ag_px(var17, -416243951);
				if (var23.aw()) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = cr.ak(var8).aw(var17, var23.as_fld, 188832132);
				} else if (px.ll(var23, (short)10000)) {
					an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = pw.bv(cr.ak(var8), var17, var23.ay_fld);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cr.ak(var8).ae(var17, var23.aw_fld, -1223081848);
				}

				return 1;
			} else if (var0 == 6518) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gz_fld ? 1 : 0;
				return 1;
			} else if (6519 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gd_fld;
				return 1;
			} else if (6520 == var0) {
				return 1;
			} else if (6521 == var0) {
				return 1;
			} else if (6522 == var0) {
				ef.aq_fld--;
				gz.ax_fld--;
				return 1;
			} else if (var0 == 6523) {
				ef.aq_fld--;
				gz.ax_fld--;
				return 1;
			} else if (var0 == 6524) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				return 1;
			} else if (var0 == 6525) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				return 1;
			} else if (6526 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				return 1;
			} else if (6527 == var0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gy_fld;
				return 1;
			} else if (var0 == 6528) {
				gz.ax_fld -= 2;
				int var7 = au_fld[gz.ax_fld];
				int var16 = au_fld[1 + gz.ax_fld];
				px var5 = kb.ag_px(var16, -599530125);
				if (var5.aw()) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = lg.ak(var7, 1589363569).ae(var16, var5.as_fld);
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lg.ak(var7, 2080844814).av(var16, var5.aw_fld, 2011751109);
				}

				return 1;
			} else if (var0 == 6531) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 238;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				return 1;
			} else {
				return 2;
			}
		} else {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var3 >= 0 && var3 < ct.ah_fld) {
				ct var4 = yd.ae_fld[var3];
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.af_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.al_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.an_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.aa_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.au_fld;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.ax_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gl(int var0, ba var1) {
		if (-784886578 == var0) {
			au_fld[(gz.ax_fld += -142053218) * 1434852062 - 1] = xy.cy();
			return 1;
		} else if (-2144832839 == var0) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (1 == var4 || 2 == var4) {
				ys.cf(var4, (byte)14);
			}

			return 1;
		} else if (-1790058497 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = cx.kq_fld.bd(-1087450796);
			return 1;
		} else if (var0 != -1921352047) {
			if (var0 == -1068579175) {
				gz.ax_fld -= 1938067901;
				return 1;
			} else {
				return 2;
			}
		} else {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -666935848];
			if (var3 == 1 || 2 == var3) {
				cx.kq_fld.bz(var3, (byte)32);
			}

			return 1;
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ha(int var0, ba var1) throws EOFException {
		if (-1582077400 == var0) {
			int var6 = au_fld[(gz.ax_fld -= -353187982) * -197942998];
			pp var7 = ca.az(var6);
			ai_fld[(ef.aq_fld += 1126210811) * -836183525 - 1] = null != var7 ? var7.cg_fld : "";
			return 1;
		} else if (1300665899 == var0) {
			gz.ax_fld -= 1842653980;
			pp var5 = ca.az(au_fld[gz.ax_fld]);
			int var4 = au_fld[gz.ax_fld + 1];
			au_fld[(gz.ax_fld += 145695461) * -776631127 - 1] = pp.dc(var5, var4);
			au_fld[(gz.ax_fld += -1608632655) * -776631127 - 1] = var5.am(var4, 641801714);
			return 1;
		} else if (1649829843 == var0) {
			pp var3 = ca.az(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			au_fld[(gz.ax_fld += 554154904) * 916991340 - 1] = null != var3 ? var3.dx_fld * -1453723996 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(ILkj;Z)V"
	)
	static void ij(int var0, kj var1, boolean var2) throws EOFException {
		wl var3 = lz.ah();
		gf var4 = var3.be(var0, 268728233);
		kj var5 = ls.ea();
		var3.aq(var4, var5, var1, var2, 773462580);
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hx(int var0, ba var1) throws EOFException {
		if (6809 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			oe var4 = ko.az(var3);
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4 != null ? var4.cg_fld : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hu(int var0, ba var1) throws EOFException {
		if (6809 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			oe var4 = ko.az(var3);
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4 != null ? var4.cg_fld : "";
			return 1;
		} else {
			return 2;
		}
	}

	// $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
	// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lyz;Lba;II)V"
	)
	static void cu(yz var0, ba var1, int var2, int var3) throws EOFException {
		Object[] var4 = (Object[])yz.hw(var0, 1697120891);
		gz.ax_fld = 0;
		db.aa_fld = 0;
		ef.aq_fld = 0;
		int var5 = -1;
		int[] var6 = var1.av_fld;
		int[] var7 = var1.ae_fld;
		int var8 = -1;
		am_fld = 0;
		bm_fld = false;
		boolean var9 = false;
		ao_fld = 0;
		boolean var23 = false /* VF: Semaphore variable */;

		label723: {
			label724: {
				try {
					var23 = true;
					ie.ar_fld = new int[var1.ay_fld * -126550115];
					int var26 = 0;
					jq.af_fld = new long[1664084262 * var1.as_fld];
					int var27 = 0;
					al_fld = (Object[])(new Object[var1.ar_fld * 1671829906]);
					int var28 = 0;

					for (int var13 = 1; var13 < var4.length; var13++) {
						if (var4[var13] instanceof Integer) {
							int var14 = (Integer)var4[var13];
							if (var14 == -2147483647) {
								var14 = var0.ah(-1762702822);
							}

							if (var14 == -613504678) {
								var14 = yz.wa(var0, 669757382);
							}

							if (-2147483645 == var14) {
								var14 = var0.av((short)-20216) != null ? var0.av((short)-8702).bf_fld * 266035971 : -1;
							}

							if (-1311435799 == var14) {
								var14 = var0.ay(-1728011423);
							}

							if (var14 == -2147483643) {
								var14 = var0.av((short)-2664) != null ? var0.av((short)2352).by_fld * -2140649577 : -1;
							}

							if (-1601667899 == var14) {
								var14 = yz.wa_lu(var0, 318880332) != null ? yz.wa_lu(var0, -765535537).bf_fld * -916890266 : -1;
							}

							if (var14 == 1061084468) {
								var14 = yz.wa_lu(var0, 720201353) != null ? yz.wa_lu(var0, 1364007904).by_fld * 1611445419 : -1;
							}

							if (var14 == -1431851317) {
								var14 = var0.ar(-450034640);
							}

							if (var14 == -2147483639) {
								var14 = var0.af(1665838759);
							}

							if (var14 == -2147483638) {
								var14 = var0.al((byte)41);
							}

							ie.ar_fld[var26++] = var14;
						} else if (var4[var13] instanceof String) {
							String var45 = (String)var4[var13];
							if (var45.equals("event_opbase")) {
								var45 = var0.au(399920846);
							}

							al_fld[var28++] = var45;
						} else if (var4[var13] instanceof sl) {
							al_fld[var28++] = var4[var13];
						} else if (var4[var13] instanceof Long) {
							long var46 = (Long)var4[var13];
							jq.af_fld[var27++] = var46;
						}
					}

					br_fld = yz.ri(var0, (short)-21560);

					label712:
					while (true) {
						ao_fld++;
						if (ao_fld > var2) {
							throw new RuntimeException();
						}

						var8 = var6[++var5];
						if (var8 < 100) {
							if (var8 == 0) {
								au_fld[(gz.ax_fld += -1684678759) * 1277424979 - 1] = var7[var5];
							} else if (1 == var8) {
								int var44 = var7[var5];
								au_fld[(gz.ax_fld += 1742378696) * -1316128870 - 1] = rt.ag_fld[var44];
							} else if (var8 == 2) {
								int var43 = var7[var5];
								rt.ag_fld[var43] = au_fld[(gz.ax_fld -= -418079236) * 1370162716];
								ns.gk(var43, (byte)84);
							} else if (var8 == 3) {
								ai_fld[(ef.aq_fld += -211521517) * 1477056742 - 1] = var1.ae(var5, -1684678759);
							} else if (6 == var8) {
								var5 += var7[var5];
							} else if (var8 == 7) {
								gz.ax_fld -= 2;
								if (au_fld[gz.ax_fld + 1] != au_fld[gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 8) {
								gz.ax_fld -= 2;
								if (au_fld[gz.ax_fld * -1275839466] == au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 9) {
								gz.ax_fld -= -994134963;
								if (au_fld[1480188463 * gz.ax_fld] < au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (var8 == 10) {
								gz.ax_fld -= 1210601669;
								if (au_fld[gz.ax_fld] > au_fld[gz.ax_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 68) {
								db.aa_fld -= 2;
								if (an_fld[db.aa_fld] != an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (69 == var8) {
								db.aa_fld -= 2;
								if (an_fld[675556990 * db.aa_fld] == an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (1647678785 == var8) {
								db.aa_fld -= 1921947433;
								if (an_fld[-197226855 * db.aa_fld] < an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 71) {
								db.aa_fld -= 2;
								if (an_fld[db.aa_fld] > an_fld[1 + db.aa_fld]) {
									var5 += var7[var5];
								}
							} else if (21 == var8) {
								if (am_fld * -1657715896 == 0) {
									var23 = false;
									break label724;
								}

								bj var41 = ad_fld[(am_fld -= -1774771793) * -991242929];
								var1 = var41.ak_fld;
								var6 = var1.av_fld;
								var7 = var1.ae_fld;
								var5 = var41.ag_fld;
								ie.ar_fld = var41.az_fld;
								al_fld = (Object[])var41.av_fld;
								jq.af_fld = var41.ae_fld;
							} else if (var8 == 25) {
								int var40 = var7[var5];
								au_fld[(gz.ax_fld += 495068948) * -776631127 - 1] = dv.ag(var40, (byte)89);
							} else if (var8 == 27) {
								int var39 = var7[var5];
								es.az(var39, au_fld[(gz.ax_fld -= -2144076146) * -776631127]);
							} else if (var8 == -1663980085) {
								gz.ax_fld -= -994677902;
								if (au_fld[-1464205043 * gz.ax_fld] <= au_fld[gz.ax_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == 32) {
								gz.ax_fld -= 2;
								if (au_fld[gz.ax_fld] >= au_fld[1 + gz.ax_fld]) {
									var5 += var7[var5];
								}
							} else if (-1629339403 == var8) {
								db.aa_fld -= 366778259;
								if (an_fld[db.aa_fld] <= an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == -498049585) {
								db.aa_fld -= -1289002116;
								if (an_fld[db.aa_fld] >= an_fld[db.aa_fld + 1]) {
									var5 += var7[var5];
								}
							} else if (var8 == -578534982) {
								au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ie.ar_fld[var7[var5]];
							} else if (1221891465 == var8) {
								ie.ar_fld[var7[var5]] = au_fld[(gz.ax_fld -= 1524398443) * -776631127];
							} else if (742530978 == var8) {
								ai_fld[(ef.aq_fld += 1391783061) * -1859347413 - 1] = al_fld[var7[var5]];
							} else if (-1970278893 == var8) {
								al_fld[var7[var5]] = ai_fld[(ef.aq_fld -= -2101595520) * 776404706];
							} else if (var8 == 37) {
								int var38 = var7[var5];
								ef.aq_fld -= -211521517 * var38;
								String var54 = kc.ak((Object[])ai_fld, -479615958 * ef.aq_fld, var38);
								ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var54;
							} else if (var8 == 64968146) {
								gz.ax_fld--;
							} else if (-1828441574 == var8) {
								ef.aq_fld -= 1295497088;
							} else if (40 == var8) {
								if (am_fld == 50) {
									throw new RuntimeException();
								}

								int var37 = var7[var5];
								ba var53 = an.ak(var37);
								int[] var56 = new int[1160857085 * var53.ay_fld];
								Object[] var16 = (Object[])(new Object[var53.ar_fld]);
								long[] var17 = new long[757159543 * var53.as_fld];
								if (var53.af_fld >= 0) {
									System.arraycopy(au_fld, 0 + (gz.ax_fld - var53.af_fld), var56, 0, var53.af_fld * 2145206820);
								}

								if (var53.al_fld * 1447464909 >= 0) {
									System.arraycopy((Object)ai_fld, 0 + (ef.aq_fld - var53.al_fld), (Object)var16, 0, var53.al_fld);
								}

								if (var53.au_fld >= 0) {
									System.arraycopy(an_fld, 0 + (db.aa_fld - var53.au_fld), var17, 0, var53.au_fld);
								}

								gz.ax_fld = gz.ax_fld - var53.af_fld;
								ef.aq_fld = ef.aq_fld - var53.al_fld;
								db.aa_fld = db.aa_fld - var53.au_fld;
								bj var18 = new bj();
								var18.ak_fld = var1;
								var18.ag_fld = var5 * 361893213;
								var18.az_fld = ie.ar_fld;
								var18.av_fld = (Object[])al_fld;
								var18.ae_fld = jq.af_fld;
								ad_fld[(am_fld += 2000392093) * -991242929 - 1] = var18;
								var1 = var53;
								var6 = var53.av_fld;
								var7 = var53.ae_fld;
								var5 = -1;
								ie.ar_fld = var56;
								al_fld = (Object[])var16;
								jq.af_fld = var17;
							} else if (var8 == 1180892532) {
								au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ob.ek_fld.ag(var7[var5]);
							} else if (43 == var8) {
								ob.ek_fld.ak(var7[var5], au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
							} else if (51 == var8) {
								an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ob.ek_fld.av(var7[var5]);
							} else if (-1445422524 == var8) {
								dn.lq(ob.ek_fld, var7[var5], an_fld[(db.aa_fld -= 432101741) * 1903594739]);
							} else if (37586590 == var8) {
								int var36 = var7[var5] >> 16;
								int var52 = var7[var5] & 65535;
								int var55 = au_fld[(gz.ax_fld -= -1684678759) * -2107806915];
								if (var55 < 0 || var55 > 5000) {
									throw new RuntimeException();
								}

								if (var52 == 973500593) {
									al_fld[var36] = new sl(yq.az_fld, "", var55, var55);
								} else if (var52 != 105 && -140813396 != var52) {
									al_fld[var36] = new sl(yq.ak_fld, -1, var55, var55);
								} else {
									al_fld[var36] = new sl(yq.ak_fld, 0, var55, var55);
								}
							} else if (var8 == 45) {
								sl var30 = eh.av(var7[var5], al_fld[var7[var5]]);
								int var48 = au_fld[(gz.ax_fld -= -61037710) * 1368785359];
								nb.ae(var30, var48, (byte)85);
								if (yq.ak_fld == var30.ag_fld) {
									au_fld[(gz.ax_fld += 1155182570) * -776631127 - 1] = var30.ak()[var48];
								} else {
									ai_fld[(ef.aq_fld += 490836493) * -836183525 - 1] = var30.az()[var48];
								}
							} else if (46 == var8) {
								sl var31 = eh.av(var7[var5], al_fld[var7[var5]]);
								if (!var31.az_fld) {
									throw new RuntimeException();
								}

								if (var31.ag_fld == yq.ak_fld) {
									gz.ax_fld -= 331540636;
									int var49 = au_fld[gz.ax_fld];
									nb.ae(var31, var49, (byte)99);
									var31.ak()[var49] = au_fld[1 + gz.ax_fld];
								} else {
									int var50 = au_fld[(gz.ax_fld -= -1782615183) * -776631127];
									nb.ae(var31, var50, (byte)89);
									var31.az()[var50] = ai_fld[(ef.aq_fld -= -211521517) * -836183525];
								}
							} else if (var8 == -898934737) {
								String var32 = dn.vd(ob.ek_fld, var7[var5], (byte)63);
								ai_fld[(ef.aq_fld += -976919770) * -836183525 - 1] = var32;
							} else if (var8 == 50) {
								ob.ek_fld.ae(var7[var5], (String)ai_fld[(ef.aq_fld -= -1648705118) * -836183525]);
							} else if (var8 == 620108020) {
								xv var33 = var1.ag_fld[var7[var5]];
								vl var51 = (vl)var33.ak(au_fld[(gz.ax_fld -= -2140634186) * -776631127]);
								if (null != var51) {
									var5 += var51.ak_fld;
								}
							} else if (63 == var8) {
								ai_fld[(ef.aq_fld += -211521517) * 1269615344 - 1] = null;
							} else if (var8 == 61) {
								an_fld[(db.aa_fld += 2024672041) * 867932261 - 1] = var1.ah(var5, -1576211349);
							} else if (-1797238505 == var8) {
								db.aa_fld -= 751413327;
							} else if (var8 == -247249542) {
								an_fld[(db.aa_fld += 1811645719) * 867932261 - 1] = jq.af_fld[var7[var5]];
							} else if (67 == var8) {
								jq.af_fld[var7[var5]] = an_fld[(db.aa_fld -= 432101741) * -345949741];
							} else if (var8 == 74) {
								Integer var34 = ik.nd(gt.be_fld, var7[var5]);
								if (null == var34) {
									au_fld[(gz.ax_fld += -91268099) * -776631127 - 1] = -1;
								} else {
									au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var34;
								}
							} else {
								if (var8 != 2135555488) {
									throw new IllegalStateException();
								}

								Integer var35 = bl.ey_fld.ak(var7[var5]);
								if (null == var35) {
									au_fld[(gz.ax_fld += 1323514584) * -776631127 - 1] = -1;
								} else {
									au_fld[(gz.ax_fld += -1684678759) * -1720655528 - 1] = var35;
								}
							}
						} else {
							boolean var29 = 1 == var1.ae_fld[var5];
							int var47 = qo.ah(var8, var1, var29);
							switch (var47) {
								case 0:
									var23 = false;
									break label712;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
							}
						}
					}
				} catch (Exception var24) {
					var9 = true;
					StringBuilder var11 = new StringBuilder(30);
					var11.append("").append(var1.hc_fld).append(" ");

					for (int var12 = am_fld - 1; var12 >= 0; var12--) {
						var11.append("").append(ad_fld[var12].ak_fld.hc_fld).append(" ");
					}

					var11.append("").append(var8);
					gl.ak(var11.toString(), var24);
					var23 = false;
					break label723;
				} finally {
					if (var23) {
						while (!bz_fld.isEmpty()) {
							dg var20 = (dg)(dg)bz_fld.remove(0);
							nt.fc(var20.ak(), dg.cl(var20, 570987843), dg.ed(var20, 321737442), dg.zi(var20, (byte)82), "", -932519114);
						}

						if (bm_fld) {
							bm_fld = false;
							nx.gf(2011429457);
						}

						if (!var9 && var3 > 0 && ao_fld >= var3) {
							gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld * -307133043 + " of max " + var2, null);
						}
					}
				}

				while (!bz_fld.isEmpty()) {
					dg var15 = (dg)(dg)bz_fld.remove(0);
					nt.fc(var15.ak(), dg.cl(var15, 1977283224), dg.ed(var15, 321737442), dg.zi(var15, (byte)98), "", -945257939);
				}

				if (bm_fld) {
					bm_fld = false;
					nx.gf(1922912418);
				}

				if (!var9 && var3 > 0 && ao_fld >= var3) {
					gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld * -1614426173 + " of max " + var2, null);
				}

				return;
			}

			while (!bz_fld.isEmpty()) {
				dg var42 = (dg)(dg)bz_fld.remove(0);
				nt.fc(var42.ak(), dg.cl(var42, 749997302), dg.ed(var42, 321737442), dg.zi(var42, (byte)62), "", -1291192048);
			}

			if (bm_fld) {
				bm_fld = false;
				nx.gf(2044531310);
			}

			if (!var9 && var3 > 0 && ao_fld >= var3) {
				gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld + " of max " + var2, null);
			}

			return;
		}

		while (!bz_fld.isEmpty()) {
			dg var10 = (dg)(dg)bz_fld.remove(0);
			nt.fc(var10.ak(), dg.cl(var10, 223820461), dg.ed(var10, 321737442), dg.zi(var10, (byte)85), "", -1866985878);
		}

		if (bm_fld) {
			bm_fld = false;
			nx.gf(1898613136);
		}

		if (!var9 && var3 > 0 && ao_fld >= var3) {
			gl.ak("Warning: Script " + var1.az_fld + " finished at op count " + ao_fld + " of max " + var2, null);
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hz(int var0, ba var1) {
		return 2;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ho(int var0, ba var1) {
		return 2;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hm(int var0, ba var1) {
		return 2;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ib(int var0, ba var1) {
		return 2;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int iz(int var0, ba var1) {
		if (var0 == 7108) {
			au_fld[(gz.ax_fld += -1344814880) * 513021134 - 1] = qa.ej() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ie(int var0, ba var1) {
		if (var0 == 7463) {
			boolean var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			ox.hg(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int iv(int var0, ba var1) throws EOFException {
		if (var0 == 7500) {
			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var30 = he.cg(var24);
			int var34 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			yo var37 = bu.hv(var34);
			if (null == var37) {
				throw new RuntimeException();
			} else {
				int var40 = og.az(var34);
				bq.fz_fld = var37.az(var30, var40);
				if (bq.fz_fld != null) {
					client.gg_fld = mk.ak(var34);
					gq.ff_fld = bq.fz_fld.iterator();
					if (var0 == 7500) {
						au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bq.fz_fld.size();
					}
				} else {
					client.gg_fld = 1162640019;
					gq.ff_fld = null;
					if (7500 == var0) {
						au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					}
				}

				return 1;
			}
		} else if (7501 != var0) {
			if (var0 == 7502) {
				gz.ax_fld -= 3;
				int var23 = au_fld[gz.ax_fld];
				int var29 = au_fld[gz.ax_fld + 1];
				int var33 = au_fld[gz.ax_fld + 2];
				int var36 = mk.ak(var29);
				int var39 = my.ag(var29);
				int var42 = og.az(var29);
				yg var43 = ct.ag(var36);
				int[] var44 = var43.az_fld[var39];
				int var45 = 0;
				int var12 = var44.length;
				if (var23 == -1) {
					for (int var46 = var45; var46 < var12; var46++) {
						yq var47 = eu.ag(var44[var46], -1984107975);
						if (yq.az_fld == var47) {
							ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
						} else if (var47 == yq.ag_fld) {
							an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = -1L;
						} else {
							au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = me.ak(var44[var46]);
						}
					}

					return 1;
				} else {
					yl var13 = ot.ak(var23);
					if (var42 >= 0) {
						if (var42 >= var12) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var42 + ", Max: " + var12);
						}

						var45 = var42;
						var12 = 1 + var42;
					}

					Object[] var14 = (Object[])var13.az(var39, (byte)10);
					if (var14 == null && var43.av_fld != null) {
						var14 = (Object[])var43.av_fld[var39];
					}

					if (null == var14) {
						for (int var48 = var45; var48 < var12; var48++) {
							int var49 = var44[var48];
							yq var50 = eu.ag(var49, -2026707358);
							if (yq.az_fld == var50) {
								ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
							} else {
								au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = me.ak(var49);
							}
						}

						return 1;
					} else {
						int var15 = var14.length / var44.length;
						if (var33 >= 0 && var33 < var15) {
							for (int var16 = var45; var16 < var12; var16++) {
								int var17 = var44.length * var33 + var16;
								yq var18 = eu.ag(var44[var16], -1997522198);
								if (yq.az_fld == var18) {
									ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14[var17];
								} else {
									au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				}
			} else if (7503 == var0) {
				gz.ax_fld -= 2;
				int var22 = au_fld[gz.ax_fld];
				int var28 = au_fld[gz.ax_fld + 1];
				int var32 = 0;
				int var35 = mk.ak(var28);
				int var38 = my.ag(var28);
				yl var41 = ot.ak(var22);
				yg var9 = ct.ag(var35);
				int[] var10 = var9.az_fld[var38];
				Object[] var11 = (Object[])var41.az(var38, (byte)120);
				if (null == var11 && var9.av_fld != null) {
					var11 = (Object[])var9.av_fld[var38];
				}

				if (var11 != null) {
					var32 = var11.length / var10.length;
				}

				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var32;
				return 1;
			} else if (var0 == 7504) {
				gz.ax_fld--;
				int var21 = au_fld[gz.ax_fld];
				yo var27 = me.ha(var21);
				if (null == var27) {
					throw new RuntimeException();
				} else {
					bq.fz_fld = var27.az(0, 0);
					int var31 = 0;
					if (null != bq.fz_fld) {
						client.gg_fld = var21;
						gq.ff_fld = bq.fz_fld.iterator();
						var31 = bq.fz_fld.size();
					}

					if (var0 == 7504) {
						au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var31;
					}

					return 1;
				}
			} else if (var0 == 7505) {
				int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				yl var26 = ot.ak(var20);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var26.ae_fld;
				return 1;
			} else if (var0 == 7506) {
				int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var25 = -1;
				if (bq.fz_fld != null && var19 >= 0 && var19 < bq.fz_fld.size()) {
					var25 = (Integer)bq.fz_fld.get(var19);
				}

				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var25;
				return 1;
			} else if (var0 == 7507) {
				int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				Object var4 = he.cg(var3);
				int var5 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				yo var6 = bu.hv(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (mk.ak(var5) != client.gg_fld) {
					throw new RuntimeException();
				} else if (null == bq.fz_fld && bq.fz_fld.isEmpty()) {
					throw new RuntimeException();
				} else {
					int var7 = og.az(var5);
					List var8 = var6.az(var4, var7);
					bq.fz_fld = new LinkedList(bq.fz_fld);
					if (null != var8) {
						bq.fz_fld.retainAll(var8);
					} else {
						bq.fz_fld.clear();
					}

					gq.ff_fld = bq.fz_fld.iterator();
					if (var0 == 7507) {
						au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bq.fz_fld.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (null != gq.ff_fld && gq.ff_fld.hasNext()) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (Integer)gq.ff_fld.next();
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	static void dz(sl var0, int var1) {
		if (var1 < 0 || var1 >= var0.av()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int if_(int var0, ba var1) {
		return 2;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ip(int var0, ba var1) {
		return 2;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int il(int var0, ba var1) {
		if (-29263940 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			client.gj_fld = Math.max(var3, 0) * -145403987;
			return 1;
		} else if (var0 == 7901) {
			au_fld[(gz.ax_fld += -1684678759) * 195314828 - 1] = client.gj_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ia(int var0, ba var1) {
		if (7900 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			client.gj_fld = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gj_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int iq(int var0, ba var1) {
		if (192889480 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -927858949) * -1337725502];
			client.gj_fld = Math.max(var3, 0) * 1830451740;
			return 1;
		} else if (var0 == 717214750) {
			au_fld[(gz.ax_fld += -2022530011) * -356862651 - 1] = client.gj_fld * 57996313;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int is(int var0, ba var1) throws EOFException {
		if (8000 == var0) {
			ef.aq_fld -= 2;
			sl var36 = nl.ck(ai_fld[ef.aq_fld], null);
			sl var61 = (sl)ai_fld[1 + ef.aq_fld];
			fw.au(var36, var61, (byte)-33);
			return 1;
		} else if (var0 == 8001) {
			gz.ax_fld -= 2;
			int var35 = au_fld[gz.ax_fld];
			int var60 = au_fld[gz.ax_fld + 1];
			sl var78 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			zk.ax(var78, var35, var60);
			return 1;
		} else if (8002 == var0) {
			sl var34 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var34 == null ? 1 : 0;
			return 1;
		} else if (8003 == var0) {
			sl var33 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var33 != null ? var33.av() : 0;
			return 1;
		} else if (var0 == 8004) {
			ef.aq_fld -= 2;
			sl var32 = (sl)ai_fld[ef.aq_fld];
			sl var59 = (sl)ai_fld[1 + ef.aq_fld];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gy.ak(var32, var59);
			return 1;
		} else if (8005 == var0) {
			gz.ax_fld -= 3;
			int var31 = au_fld[gz.ax_fld];
			int var58 = au_fld[gz.ax_fld + 1];
			int var77 = au_fld[gz.ax_fld + 2];
			Object var84 = he.cg(var77);
			sl var88 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var88 ? ky.ag(var88, var84, var31, var58) : -1;
			return 1;
		} else if (8006 == var0) {
			gz.ax_fld -= 3;
			int var30 = au_fld[gz.ax_fld];
			int var57 = au_fld[gz.ax_fld + 1];
			int var76 = au_fld[gz.ax_fld + 2];
			Object var83 = he.cg(var76);
			sl var87 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var87 != null ? ox.az(var87, var83, var30, var57) : -1;
			return 1;
		} else if (8007 == var0) {
			gz.ax_fld -= 3;
			int var29 = au_fld[gz.ax_fld];
			int var56 = au_fld[1 + gz.ax_fld];
			int var75 = au_fld[gz.ax_fld + 2];
			Object var82 = he.cg(var75);
			sl var86 = (sl)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var86 ? qv.av(var86, var82, var29, var56) : 0;
			return 1;
		} else if (8008 == var0) {
			sl var28 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			int var55 = zs.ae(var28);
			if (var28.ag_fld == yq.ak_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var55 >= 0 ? var28.ak()[var55] : -1;
			} else {
				if (yq.az_fld != var28.ag_fld) {
					throw new IllegalStateException();
				}

				String var74 = (String)(var55 >= 0 ? var28.az()[var55] : null);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var74 ? var74 : "";
			}

			return 1;
		} else if (var0 == 8009) {
			sl var27 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			int var54 = rz.ah(var27);
			if (var27.ag_fld == yq.ak_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var54 >= 0 ? var27.ak()[var54] : -1;
			} else {
				if (var27.ag_fld != yq.az_fld) {
					throw new IllegalStateException();
				}

				String var73 = (String)(var54 >= 0 ? var27.az()[var54] : null);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var73 ? var73 : "";
			}

			return 1;
		} else if (8010 == var0) {
			gz.ax_fld -= 3;
			int var26 = au_fld[gz.ax_fld];
			int var53 = au_fld[1 + gz.ax_fld];
			int var72 = au_fld[gz.ax_fld + 2];
			Object var81 = he.cg(var72);
			sl var85 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			ct.aw(var85, var81, var26, var53);
			return 1;
		} else if (8011 == var0) {
			gz.ax_fld -= 3;
			int var25 = au_fld[gz.ax_fld];
			int var52 = au_fld[gz.ax_fld + 1];
			int var71 = au_fld[gz.ax_fld + 2];
			sl var80 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			vu.ay(var80, var25, 1, var52, var71, (byte)37);
			return 1;
		} else if (8012 == var0) {
			sl var24 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			bs.as(var24);
			return 1;
		} else if (8013 == var0) {
			int var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			sl var51 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			av.ar(var51, var23, 948723319);
			return 1;
		} else if (var0 == 8014) {
			gz.ax_fld -= 2;
			int var22 = au_fld[gz.ax_fld];
			int var50 = au_fld[1 + gz.ax_fld];
			sl var70 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			ea.af(var70, var22, var50, -1547118872);
			return 1;
		} else if (8015 == var0) {
			gz.ax_fld -= 3;
			int var21 = au_fld[gz.ax_fld];
			int var49 = au_fld[1 + gz.ax_fld];
			int var69 = au_fld[2 + gz.ax_fld];
			ef.aq_fld -= 2;
			sl var79 = nl.ck(ai_fld[ef.aq_fld], null);
			sl var7 = nl.ck(ai_fld[ef.aq_fld + 1], null);
			hf.al(var79, var7, var21, var49, var69, -1484982899);
			return 1;
		} else if (var0 == 8016) {
			sl var20 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)ia.an(var20);
			return 1;
		} else if (8017 == var0) {
			sl var19 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			int var48 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fz.aa(var19, var48);
			return 1;
		} else if (8018 == var0) {
			ef.aq_fld -= 2;
			String var18 = (String)ai_fld[ef.aq_fld];
			String var47 = (String)ai_fld[1 + ef.aq_fld];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = jr.ai(var18, var47);
			return 1;
		} else if (8019 == var0) {
			ef.aq_fld -= 2;
			sl var17 = nl.ck(ai_fld[ef.aq_fld], null);
			String var46 = (String)ai_fld[ef.aq_fld + 1];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ul.aq(var17, var46);
			return 1;
		} else if (8020 == var0) {
			gz.ax_fld -= 2;
			char var16 = (char)au_fld[gz.ax_fld];
			int var45 = au_fld[gz.ax_fld + 1];
			os var68 = gx.ak(var45);
			if (!var68.ar(var16, 957576213)) {
				throw new RuntimeException();
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.se(var68, 1820951113);
				return 1;
			}
		} else if (8021 == var0) {
			gz.ax_fld -= 2;
			int var15 = au_fld[gz.ax_fld];
			int var44 = au_fld[1 + gz.ax_fld];
			os var67 = gx.ak(var44);
			if (!os.ks(var67, (char)var15, (byte)89)) {
				throw new RuntimeException();
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.cg(var67, 1178899929);
				return 1;
			}
		} else if (8022 == var0) {
			gz.ax_fld -= 3;
			int var14 = au_fld[gz.ax_fld];
			int var43 = au_fld[gz.ax_fld + 1];
			int var66 = au_fld[gz.ax_fld + 2];
			if (var66 < var43) {
				var66 = var43;
			}

			if (var43 >= 0 && var43 <= 5000 && var66 >= 0 && var66 <= 5000) {
				if (115 == var14) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.az_fld, "", var43, var66);
				} else if (var14 != 105 && var14 != 49) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.ak_fld, -1, var43, var66);
				} else {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = new sl(yq.ak_fld, 0, var43, var66);
				}

				return 1;
			} else {
				throw new RuntimeException();
			}
		} else if (var0 == 8023) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			sl var42 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			if (var13 >= 0 && var13 <= 5000) {
				var42.aw(var13, 1832473250);
				return 1;
			} else {
				throw new RuntimeException();
			}
		} else if (var0 == 8024) {
			int var12 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var41 = he.cg(var12);
			sl var65 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			co.am(var65, var65.av(), var41, -1869926406);
			return 1;
		} else if (8025 == var0) {
			gz.ax_fld -= 2;
			int var11 = au_fld[gz.ax_fld];
			int var40 = au_fld[gz.ax_fld + 1];
			Object var64 = he.cg(var40);
			sl var6 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			co.am(var6, var11, var64, -1995299649);
			return 1;
		} else if (8026 == var0) {
			int var10 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			sl var39 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			Object var63 = co.ad(var39, var10);
			lm.cw(var39.ag_fld, var63);
			return 1;
		} else if (8027 == var0) {
			ef.aq_fld -= 2;
			sl var9 = nl.ck(ai_fld[ef.aq_fld], null);
			sl var38 = nl.ck(ai_fld[1 + ef.aq_fld], null);
			kt.ao(var9, var38, var9.av(), -1527372539);
			return 1;
		} else if (8028 == var0) {
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ef.aq_fld -= 2;
			sl var37 = nl.ck(ai_fld[ef.aq_fld], null);
			sl var62 = nl.ck(ai_fld[1 + ef.aq_fld], null);
			kt.ao(var37, var62, var8, -8846888);
			return 1;
		} else if (8029 == var0) {
			gz.ax_fld -= 2;
			int var3 = au_fld[gz.ax_fld];
			int var4 = au_fld[gz.ax_fld + 1];
			sl var5 = nl.ck(ai_fld[(ef.aq_fld -= -211521517) * -836183525], null);
			sx.ab(var5, var3, var4);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hy(int var0, ba var1) throws EOFException {
		if (422670651 == var0) {
			int var3 = au_fld[(gz.ax_fld -= -1662181709) * -175633256];
			oe var4 = ko.az(var3);
			ai_fld[(ef.aq_fld += 1466336236) * -836183525 - 1] = var4 != null ? var4.cg_fld : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int ic(int var0, ba var1) {
		if (var0 == 13337) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ao_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Llu;IZLba;)V"
	)
	static void dm(lu var0, int var1, boolean var2, ba var3) {
		if (null == var0.ge_fld) {
			var0.ge_fld = new lu[var1 + 1];
		}

		if (var0.ge_fld.length <= var1) {
			lu[] var4 = new lu[1 + var1];
			System.arraycopy(var0.ge_fld, 0, var4, 0, var0.ge_fld.length);
			var0.ge_fld = var4;
		} else {
			lu var5 = var0.ge_fld[var1];
			if (null != var5) {
				if (var2) {
					throw new RuntimeException("");
				}

				hy.cz(var5, var0);
			}
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int dx(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == 100) {
			gz.ax_fld -= 4;
			int var36 = au_fld[gz.ax_fld];
			int var56 = au_fld[1 + gz.ax_fld];
			int var71 = au_fld[gz.ax_fld + 2];
			boolean var84 = 0 != au_fld[3 + gz.ax_fld];
			if (var71 < 0) {
				throw new RuntimeException("");
			} else {
				lu var96 = cf.cg_fld.ak(var36);
				if (0 != var96.bx_fld) {
					throw new RuntimeException("");
				} else {
					mg.aw(var96, var71, var84, var1, (short)6385);
					lu var100 = new lu();
					var100.bx_fld = var56;
					var100.cv_fld = (var100.bf_fld = var96.bf_fld * 1) * 1050017623;
					var100.by_fld = var71;
					var100.bj_fld = true;
					if (12 == var56) {
						hg.cm(var100);
					}

					var96.ge_fld[var71] = var100;
					if (var2) {
						gs.ap_fld = var100;
					} else {
						ab_fld = var100;
					}

					return 1;
				}
			}
		} else if (var0 == 101) {
			lu var35 = var2 ? gs.ap_fld : ab_fld;
			lu var55 = cf.cg_fld.ak(var35.bf_fld);
			hy.cz(var35, var55);
			return 1;
		} else if (102 == var0) {
			gz.ax_fld--;
			int var34 = au_fld[gz.ax_fld];
			lu var54 = cf.cg_fld.ak(var34);
			var54.ge_fld = null;
			return 1;
		} else if (var0 == 105) {
			gz.ax_fld -= 3;
			int var33 = au_fld[gz.ax_fld];
			int var53 = au_fld[1 + gz.ax_fld];
			int var70 = au_fld[gz.ax_fld + 2];
			lu var83 = cf.cg_fld.ak(var33);
			lu var95 = cf.cg_fld.ag(var33, var53, 665088009);
			if (var83 == null) {
				throw new RuntimeException("");
			} else if (var53 < 0) {
				throw new RuntimeException("");
			} else if (null == var95) {
				throw new RuntimeException("");
			} else if (var95.bx_fld == 0) {
				throw new RuntimeException("");
			} else {
				mg.aw(var83, var70, true, var1, (short)-12845);
				if (-1 != var95.cy_fld) {
					lu var98 = cf.cg_fld.ag(var33, var95.cy_fld, 1506140873);
					lr.ay(var98, var70, 1828744557);
				}

				lu var99 = new lu(var95);
				var99.by_fld = var70;
				if (12 == var95.bx_fld) {
					hg.cm(var99);
				}

				var83.ge_fld[var70] = var99;
				if (var2) {
					gs.ap_fld = var99;
				} else {
					ab_fld = var99;
				}

				return 1;
			}
		} else if (106 == var0) {
			gz.ax_fld -= 2;
			int var32 = au_fld[gz.ax_fld];
			int var52 = au_fld[gz.ax_fld + 1];
			lu var69 = var2 ? gs.ap_fld : ab_fld;
			if (var69 == null) {
				throw new RuntimeException("");
			} else {
				lu var82 = cf.cg_fld.ak(var69.cv_fld);
				if (var69.bx_fld != 0) {
					throw new RuntimeException("");
				} else if (var82.bx_fld != 0) {
					throw new RuntimeException();
				} else {
					mg.aw(var82, var52, true, var1, (short)-10560);
					lr.ay(var69, var52, 1828744557);
					lu var94 = new lu();
					var94.bx_fld = var32;
					var94.cv_fld = (var94.bf_fld = var82.bf_fld * 1) * 1050017623;
					var94.cy_fld = var69.by_fld * -281153977;
					var94.by_fld = var52;
					var94.bj_fld = true;
					if (var32 == 12) {
						hg.cm(var94);
					}

					var82.ge_fld[var52] = var94;
					if (var2) {
						gs.ap_fld = var94;
					} else {
						ab_fld = var94;
					}

					return 1;
				}
			}
		} else if (var0 == 107) {
			gz.ax_fld -= 2;
			int var31 = au_fld[gz.ax_fld];
			int var51 = au_fld[1 + gz.ax_fld];
			lu var68 = var2 ? gs.ap_fld : ab_fld;
			if (null == var68) {
				throw new RuntimeException("");
			} else {
				lu var81 = cf.cg_fld.ag(var68.cv_fld, var68.cy_fld, -767780492);
				lu var93 = cf.cg_fld.ak(var81.cv_fld);
				if (var81.bx_fld != 0) {
					throw new RuntimeException("");
				} else if (0 != var93.bx_fld) {
					throw new RuntimeException();
				} else {
					mg.aw(var93, var51, true, var1, (short)7099);
					lr.ay(var81, var51, 1828744557);
					lu var97 = new lu();
					var97.bx_fld = var31;
					var97.cv_fld = (var97.bf_fld = 1 * var93.bf_fld) * 1050017623;
					var97.cy_fld = var81.by_fld * -281153977;
					var97.by_fld = var51;
					var97.bj_fld = true;
					if (var31 == 12) {
						hg.cm(var97);
					}

					var93.ge_fld[var51] = var97;
					if (var2) {
						gs.ap_fld = var97;
					} else {
						ab_fld = var97;
					}

					return 1;
				}
			}
		} else if (200 == var0) {
			gz.ax_fld -= 2;
			int var30 = au_fld[gz.ax_fld];
			int var50 = au_fld[1 + gz.ax_fld];
			lu var67 = var50 != -1 ? cf.cg_fld.ag(var30, var50, 1663120436) : null;
			ag.af(var67, var2);
			return 1;
		} else if (var0 == 201) {
			ag.af(cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]), var2);
			return 1;
		} else if (var0 == 204) {
			lu var29 = var2 ? gs.ap_fld : ab_fld;
			lu var49 = var29 != null ? cf.cg_fld.ag(var29.cv_fld, var29.cy_fld, -1663122902) : null;
			ag.af(var49, var2);
			return 1;
		} else if (var0 == 205) {
			lu var28 = var2 ? gs.ap_fld : ab_fld;
			lu var48 = null != var28 ? cf.cg_fld.ak(var28.cv_fld) : null;
			ag.af(var48, var2);
			return 1;
		} else if (206 == var0) {
			lu var27 = var2 ? gs.ap_fld : ab_fld;
			if (var27 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var27.by_fld == -1) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var47 = cf.cg_fld.ak(var27.cv_fld);
				lu var66 = null;

				for (int var80 = var27.by_fld + 1; var80 < var47.ge_fld.length; var80++) {
					lu var92 = var47.ge_fld[var80];
					if (null != var92 && var92.cy_fld == var27.cy_fld) {
						var66 = var92;
						break;
					}
				}

				ag.af(var66, var2);
				return 1;
			}
		} else if (207 == var0) {
			lu var26 = var2 ? gs.ap_fld : ab_fld;
			if (var26 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (-1 == var26.by_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var46 = cf.cg_fld.ak(var26.cv_fld);
				lu var65 = null;

				for (int var79 = var26.by_fld - 1; var79 >= 0; var79--) {
					lu var91 = var46.ge_fld[var79];
					if (var91 != null && var26.cy_fld == var91.cy_fld) {
						var65 = var91;
						break;
					}
				}

				ag.af(var65, var2);
				return 1;
			}
		} else if (208 == var0) {
			lu var25 = var2 ? gs.ap_fld : ab_fld;
			if (null == var25) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (0 != var25.bx_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var45 = cf.cg_fld.ak(var25.cv_fld);
				if (var45.ge_fld == null) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				} else {
					int var64 = 0;

					for (int var78 = 0; var78 < var45.ge_fld.length; var78++) {
						lu var90 = var45.ge_fld[var78];
						if (var90 != null && var25.by_fld == var90.cy_fld) {
							var64++;
						}
					}

					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var64;
					return 1;
				}
			}
		} else if (var0 == 209) {
			lu var24 = var2 ? gs.ap_fld : ab_fld;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var24 != null ? var24.cy_fld : -1;
			return 1;
		} else if (var0 == 210) {
			int var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			int var44 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var63 = he.cg(var23);
			int var77 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var89 = he.cg(var44);
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			px var9 = kb.ag_px(var8, -853151695);
			Object var10 = var9.as();
			Object var11 = null;
			if (var77 >= 0) {
				px var12 = kb.ag_px(var77, -1497058828);
				var11 = var12.as();
			}

			lu var101 = cf.cg_fld.ak(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			lu var13 = null;
			if (null != var101 && null != var101.ge_fld) {
				for (int var14 = 0; var14 < var101.ge_fld.length; var14++) {
					lu var15 = var101.ge_fld[var14];
					if (var15 != null && (var8 < 0 || var15.ao(var8, var10, -1865625265).equals(var89)) && (var77 < 0 || var15.ao(var77, var11, -2105837273).equals(var63))) {
						var13 = var15;
						break;
					}
				}
			}

			ag.af(var13, var2);
			return 1;
		} else if (var0 == 211) {
			gz.ax_fld -= 3;
			int var22 = au_fld[gz.ax_fld];
			lu var43 = cf.cg_fld.ak(au_fld[gz.ax_fld + 1]);
			int var62 = au_fld[2 + gz.ax_fld];
			at_fld.ak(var22, var43, var62, 1946223748);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.av();
			return 1;
		} else if (212 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			lu var42 = var2 ? gs.ap_fld : ab_fld;
			if (-1 == var42.by_fld) {
				at_fld.ak(var21, var42, -1, 1799039099);
			} else {
				at_fld.ak(var21, cf.cg_fld.ak(var42.cv_fld), var42.by_fld, 1876527962);
			}

			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.av();
			return 1;
		} else if (213 == var0) {
			ag.af(at_fld.ae(), var2);
			return 1;
		} else if (var0 == 214) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.ah();
			return 1;
		} else if (215 == var0) {
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ag.al(at_fld.aw());
			return 1;
		} else if (var0 == 216) {
			int var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			Object var41 = he.cg(var20);
			int var61 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			px var76 = kb.ag_px(var61, 58016718);
			Object var88 = var76.as();
			at_fld.ay(var61, var41, var88, -1139029396);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = at_fld.av();
			return 1;
		} else if (217 == var0) {
			int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			lu var40 = var2 ? gs.ap_fld : ab_fld;
			if (var40 == null) {
				throw new RuntimeException("");
			} else if (var40.bx_fld != 0) {
				throw new RuntimeException("");
			} else {
				lu var60 = cf.cg_fld.ak(var40.cv_fld);
				if (var60.bx_fld != 0) {
					throw new RuntimeException();
				} else {
					lu var75 = cx.ar(var19, var60, var40);
					ag.af(var75, var2);
					return 1;
				}
			}
		} else if (218 == var0) {
			lu var18 = var2 ? gs.ap_fld : ab_fld;
			if (var18 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var39 = cf.cg_fld.ak(var18.cv_fld);
				if (var39 != null && null != var39.ge_fld) {
					lu var59 = null;

					for (int var74 = 0; var74 < var39.ge_fld.length; var74++) {
						lu var87 = var39.ge_fld[var74];
						if (null != var87 && var18.cy_fld == var87.cy_fld) {
							var59 = var87;
							break;
						}
					}

					ag.af(var59, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 219) {
			lu var17 = var2 ? gs.ap_fld : ab_fld;
			if (null == var17) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var38 = cf.cg_fld.ak(var17.cv_fld);
				if (null != var38 && null != var38.ge_fld) {
					lu var58 = null;

					for (int var73 = var38.ge_fld.length - 1; var73 >= 0; var73--) {
						lu var86 = var38.ge_fld[var73];
						if (null != var86 && var86.cy_fld == var17.cy_fld) {
							var58 = var86;
							break;
						}
					}

					ag.af(var58, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 220) {
			lu var16 = var2 ? gs.ap_fld : ab_fld;
			if (null == var16) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (var16.bx_fld != 0) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var37 = cf.cg_fld.ak(var16.cv_fld);
				if (var37 != null && var37.ge_fld != null) {
					lu var57 = null;

					for (int var72 = 0; var72 < var37.ge_fld.length; var72++) {
						lu var85 = var37.ge_fld[var72];
						if (null != var85 && var85.cy_fld == var16.by_fld) {
							var57 = var85;
							break;
						}
					}

					ag.af(var57, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else if (var0 == 221) {
			lu var3 = var2 ? gs.ap_fld : ab_fld;
			if (null == var3) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else if (0 != var3.bx_fld) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				lu var4 = cf.cg_fld.ak(var3.cv_fld);
				if (var4 != null && null != var4.ge_fld) {
					lu var5 = null;

					for (int var6 = var4.ge_fld.length - 1; var6 >= 0; var6--) {
						lu var7 = var4.ge_fld[var6];
						if (var7 != null && var7.cy_fld == var3.by_fld) {
							var5 = var7;
							break;
						}
					}

					ag.af(var5, var2);
					return 1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				}
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gt(int var0, ba var1) {
		return 2;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hc(int var0, ba var1) {
		if (var0 == 6200) {
			gz.ax_fld -= 2;
			client.fj_fld = (short)mn.bw(au_fld[gz.ax_fld]);
			if (client.fj_fld <= 0) {
				client.fj_fld = 256;
			}

			client.fb_fld = (short)mn.bw(au_fld[1 + gz.ax_fld]);
			if (client.fb_fld <= 0) {
				client.fb_fld = 256;
			}

			return 1;
		} else if (6201 == var0) {
			gz.ax_fld -= 2;
			client.fk_fld = (short)au_fld[gz.ax_fld];
			if (client.fk_fld <= 0) {
				client.fk_fld = 256;
			}

			client.fc_fld = (short)au_fld[1 + gz.ax_fld];
			if (client.fc_fld <= 0) {
				client.fc_fld = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			gz.ax_fld -= 4;
			client.fh_fld = (short)au_fld[gz.ax_fld];
			if (client.fh_fld <= 0) {
				client.fh_fld = 1;
			}

			client.fm_fld = (short)au_fld[1 + gz.ax_fld];
			if (client.fm_fld <= 0) {
				client.fm_fld = 32767;
			} else if (client.fm_fld < client.fh_fld) {
				client.fm_fld = client.fh_fld;
			}

			client.fe_fld = (short)au_fld[2 + gz.ax_fld];
			if (client.fe_fld <= 0) {
				client.fe_fld = 1;
			}

			client.fw_fld = (short)au_fld[3 + gz.ax_fld];
			if (client.fw_fld <= 0) {
				client.fw_fld = 32767;
			} else if (client.fw_fld < client.fe_fld) {
				client.fw_fld = client.fe_fld;
			}

			return 1;
		} else if (var0 == 6203) {
			if (cf.cg_fld.aq_fld != null) {
				hw.cn(0, 0, cf.cg_fld.aq_fld.bb_fld * -1223437005, cf.cg_fld.aq_fld.cd_fld * 124430729, false);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fn_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ft_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fk_fld;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fc_fld;
			return 1;
		} else if (var0 == 6205) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fg.ba(client.fj_fld);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fg.ba(client.fb_fld);
			return 1;
		} else if (var0 == 6220) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (6222 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = pf.qw_fld;
			return 1;
		} else if (6223 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bc.qx_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(ILkj;Z)V"
	)
	static void id(int var0, kj var1, boolean var2) throws EOFException {
		wl var3 = lz.ah();
		gf var4 = var3.be(var0, 651041511);
		kj var5 = ls.ea();
		var3.aq(var4, var5, var1, var2, 773462580);
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lyq;)Ljava/lang/Object;"
	)
	static Object ih(yq var0) {
		if (null == var0) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch (var0.ae_fld) {
				case 0:
					return au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				case 1:
					return ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				case 2:
				default:
					throw new IllegalStateException("popValueOfType() failure - unsupported type");
				case 3:
					return an_fld[(db.aa_fld -= 432101741) * 867932261];
			}
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lyq;)Ljava/lang/Object;"
	)
	static Object ix(yq var0) {
		if (null == var0) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch (var0.ae_fld) {
				case 0:
					return au_fld[(gz.ax_fld -= -1091486286) * -1400786858];
				case 1:
					return ai_fld[(ef.aq_fld -= -1553717205) * 1931334978];
				case 2:
				default:
					throw new IllegalStateException("popValueOfType() failure - unsupported type");
				case 3:
					return an_fld[(db.aa_fld -= 432101741) * 867932261];
			}
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	static Object iu(int var0) {
		return var0 == -1 ? null : um.ca((yq)ka.ak(yq.ak(), var0));
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lyq;Ljava/lang/Object;)V"
	)
	static void ir(yq var0, Object var1) {
		if (var0 == null) {
			throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
		} else {
			switch (var0.ae_fld) {
				case 0:
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (Integer)var1;
					break;
				case 1:
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var1;
					break;
				case 2:
				default:
					throw new IllegalStateException("pushValueOfType() failure - unsupported type");
				case 3:
					an_fld[(db.aa_fld += -1577094660) * 1189776443 - 1] = (Long)var1;
			}
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	static void it(lu var0) {
		var0.bt((byte)-15);
		li.ek(lu.bv(var0, -619050943), new dy(var0), -80794516);
		li.vj(lu.bv(var0, -2115467206), new cg(var0), (byte)10);
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int hv(int var0, ba var1) throws EOFException {
		wl var3 = lz.ah();
		if (var0 == 6600) {
			kj var39 = ls.ea();
			if (kj.en(var39, -209352137)) {
				wl.eb(var3, var39.ak_fld, var39.ag_fld, var39.az_fld, true, (byte)61);
			}

			return 1;
		} else if (var0 == 6601) {
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			String var56 = "";
			gf var60 = var3.be(var38, 1461332417);
			if (var60 != null) {
				var56 = var60.af((byte)-37);
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var56;
			return 1;
		} else if (6602 == var0) {
			int var37 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var3.au(var37, (byte)-20);
			return 1;
		} else if (6603 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bm(359902140);
			return 1;
		} else if (var0 == 6604) {
			int var36 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var3.bd(var36, (byte)98);
			return 1;
		} else if (6605 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.gf(-2079704650) ? 1 : 0;
			return 1;
		} else if (6606 == var0) {
			kj var35 = new kj(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			var3.bs(var35.ag_fld, var35.az_fld, (byte)59);
			return 1;
		} else if (6607 == var0) {
			kj var34 = new kj(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			wl.mb(var3, var34.ag_fld, var34.az_fld);
			return 1;
		} else if (6608 == var0) {
			kj var33 = new kj(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			var3.bk(var33.ak_fld, var33.ag_fld, var33.az_fld, (short)483);
			return 1;
		} else if (var0 == 6609) {
			kj var32 = new kj(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			wl.kd(var3, var32.ak_fld, var32.ag_fld, var32.az_fld, 2064426671);
			return 1;
		} else if (var0 == 6610) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bo((byte)74);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.by(2131199674);
			return 1;
		} else if (var0 == 6611) {
			int var31 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			gf var55 = var3.be(var31, 1425527890);
			if (null == var55) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.bk(gf.fu(var55, 62388830), -653469420);
			}

			return 1;
		} else if (6612 == var0) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			gf var54 = var3.be(var30, 2037384707);
			if (null == var54) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (var54.aa(-96427469) - var54.an(1869924435) + 1) * 64;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (var54.aq(1243030231) - var54.ai(-1488742530) + 1) * 64;
			}

			return 1;
		} else if (6613 == var0) {
			int var29 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			gf var53 = var3.be(var29, 1572870235);
			if (null == var53) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var53.an(2146293241) * 64;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var53.ai(-1175378877) * 64;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var53.aa(1373107758) * 64 + 64 - 1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var53.aq(1893262749) * 64 + 64 - 1;
			}

			return 1;
		} else if (6614 == var0) {
			int var28 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			gf var52 = var3.be(var28, 1840690836);
			if (var52 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var52.ax(981736215);
			}

			return 1;
		} else if (6615 == var0) {
			kj var27 = var3.bl((byte)1);
			if (null == var27) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27.ag_fld;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var27.az_fld;
			}

			return 1;
		} else if (6616 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = wl.xq(var3, 2005715946);
			return 1;
		} else if (6617 == var0) {
			kj var26 = new kj(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			gf var51 = wl.vn(var3, 268646711);
			if (null == var51) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				return 1;
			} else {
				int[] var59 = var51.ae(var26.ak_fld, var26.ag_fld, var26.az_fld, 2081577648);
				if (var59 == null) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var59[0];
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var59[1];
				}

				return 1;
			}
		} else if (6618 == var0) {
			kj var25 = new kj(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			gf var50 = wl.vn(var3, 2145887640);
			if (var50 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				return 1;
			} else {
				kj var58 = gf.pk(var50, var25.ag_fld, var25.az_fld, (byte)23);
				if (var58 == null) {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				} else {
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.bk(var58, -578282613);
				}

				return 1;
			}
		} else if (6619 == var0) {
			gz.ax_fld -= 2;
			int var24 = au_fld[gz.ax_fld];
			kj var49 = new kj(au_fld[1 + gz.ax_fld]);
			tu.cr(var24, var49, false);
			return 1;
		} else if (var0 == 6620) {
			gz.ax_fld -= 2;
			int var23 = au_fld[gz.ax_fld];
			kj var48 = new kj(au_fld[1 + gz.ax_fld]);
			tu.cr(var23, var48, true);
			return 1;
		} else if (6621 == var0) {
			gz.ax_fld -= 2;
			int var22 = au_fld[gz.ax_fld];
			kj var47 = new kj(au_fld[gz.ax_fld + 1]);
			gf var57 = var3.be(var22, 720807392);
			if (var57 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				return 1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var57.az(var47.ak_fld, var47.ag_fld, var47.az_fld, (byte)7) ? 1 : 0;
				return 1;
			}
		} else if (6622 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bx(-155591304);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = wl.ag(var3, (byte)48);
			return 1;
		} else if (var0 == 6623) {
			kj var21 = new kj(au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			gf var46 = var3.af(var21.ak_fld, var21.ag_fld, var21.az_fld, 555461643);
			if (var46 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var46.ay(-143778459);
			}

			return 1;
		} else if (var0 == 6624) {
			wl.qw(var3, au_fld[(gz.ax_fld -= -1684678759) * -776631127], (byte)26);
			return 1;
		} else if (var0 == 6625) {
			var3.bt(1413966888);
			return 1;
		} else if (6626 == var0) {
			var3.bv(au_fld[(gz.ax_fld -= -1684678759) * -776631127], -1611422629);
			return 1;
		} else if (6627 == var0) {
			wl.bx(var3, (short)207);
			return 1;
		} else if (var0 == 6628) {
			boolean var20 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			var3.bu(var20, 1675838431);
			return 1;
		} else if (6629 == var0) {
			int var19 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var3.bn(var19, -523526465);
			return 1;
		} else if (var0 == 6630) {
			int var18 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			var3.bc(var18, -1273854263);
			return 1;
		} else if (var0 == 6631) {
			wl.wo(var3, 339762293);
			return 1;
		} else if (6632 == var0) {
			boolean var17 = au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
			var3.bb(var17, 1669274356);
			return 1;
		} else if (6633 == var0) {
			gz.ax_fld -= 2;
			int var16 = au_fld[gz.ax_fld];
			boolean var45 = 1 == au_fld[1 + gz.ax_fld];
			wl.ko(var3, var16, var45);
			return 1;
		} else if (var0 == 6634) {
			gz.ax_fld -= 2;
			int var15 = au_fld[gz.ax_fld];
			boolean var44 = au_fld[1 + gz.ax_fld] == 1;
			wl.ca(var3, var15, var44, (byte)-90);
			return 1;
		} else if (var0 == 6635) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.bg((byte)83) ? 1 : 0;
			return 1;
		} else if (6636 == var0) {
			int var14 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = wl.aw(var3, var14) ? 1 : 0;
			return 1;
		} else if (var0 == 6637) {
			int var13 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = wl.zo(var3, var13) ? 1 : 0;
			return 1;
		} else if (var0 == 6638) {
			gz.ax_fld -= 2;
			int var12 = au_fld[gz.ax_fld];
			kj var43 = new kj(au_fld[gz.ax_fld + 1]);
			kj var6 = var3.cy(var12, var43, (byte)46);
			if (null == var6) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.bk(var6, 1816057107);
			}

			return 1;
		} else if (6639 == var0) {
			hr var11 = var3.cx((short)11290);
			if (var11 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var11.ag(527187311);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.bk(var11.aw_fld, -788589951);
			}

			return 1;
		} else if (6640 == var0) {
			hr var10 = var3.cs((byte)-26);
			if (var10 == null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var10.ag(1937355809);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.bk(var10.aw_fld, 219224822);
			}

			return 1;
		} else if (var0 == 6693) {
			int var9 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			pc var42 = uh.ak(var9);
			if (var42.as_fld == null) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = "";
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var42.as_fld;
			}

			return 1;
		} else if (var0 == 6694) {
			int var8 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			pc var41 = uh.ak(var8);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var41.aw_fld;
			return 1;
		} else if (var0 == 6695) {
			int var7 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			pc var40 = uh.ak(var7);
			if (null == var40) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var40.ar_fld;
			}

			return 1;
		} else if (var0 == 6696) {
			int var4 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			pc var5 = uh.ak(var4);
			if (null == var5) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.ac_fld;
			}

			return 1;
		} else if (6697 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gb.aj_fld.ak_fld;
			return 1;
		} else if (var0 == 6698) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.bk(gb.aj_fld.ag_fld, -359388769);
			return 1;
		} else if (6699 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kj.bk(gb.aj_fld.az_fld, -1116210944);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	static void ii(lu var0) {
		var0.bt((byte)-28);
		li.ek(lu.bv(var0, -603080115), new dy(var0), -80794516);
		li.vj(lu.bv(var0, -1217521225), new cg(var0), (byte)32);
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;)V"
	)
	static void ig(lu var0, lu var1) {
		if (var0.bx_fld == 0) {
			for (int var2 = var0.cx_fld; var2 <= var0.cs_fld; var2++) {
				lu var3 = var1.ge_fld[var2];
				if (null != var3 && var3.cy_fld == var0.by_fld) {
					hy.cz(var3, var1);
				}
			}
		}

		var1.ge_fld[var0.by_fld * -31893090] = null;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int em(int var0, ba var1, boolean var2) {
		lu var3 = var2 ? gs.ap_fld : ab_fld;
		if (1600 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cp_fld;
			return 1;
		} else if (var0 == 1601) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ce_fld;
			return 1;
		} else if (1602 == var0) {
			if (12 == var3.bx_fld) {
				li var24 = lu.bv(var3, -1418034382);
				if (null != var24) {
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var24.bc().ah();
					return 1;
				}
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.dp_fld;
			return 1;
		} else if (1603 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cn_fld;
			return 1;
		} else if (var0 == 1604) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cr_fld;
			return 1;
		} else if (1605 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.db_fld;
			return 1;
		} else if (1606 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.dx_fld;
			return 1;
		} else if (1607 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.du_fld;
			return 1;
		} else if (var0 == 1608) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ds_fld;
			return 1;
		} else if (1609 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cb_fld;
			return 1;
		} else if (var0 == 1610) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.co_fld;
			return 1;
		} else if (var0 == 1611) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ca_fld;
			return 1;
		} else if (1612 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.cg_fld;
			return 1;
		} else if (var0 == 1613) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ck_fld.ag(1828022268);
			return 1;
		} else if (var0 == 1614) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.dn_fld ? 1 : 0;
			return 1;
		} else {
			if (1617 == var0) {
				ln var4 = var3.bi(566140608);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4 != null ? var4.ak_fld : 0;
			}

			if (var0 == 1618) {
				ln var23 = var3.bi(1679105839);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var23 != null ? var23.ag_fld : 0;
				return 1;
			} else if (var0 == 1619) {
				li var22 = lu.bv(var3, -1469502742);
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var22 ? var22.bw().ah() : "";
				return 1;
			} else if (1620 == var0) {
				ln var21 = var3.bi(1086245513);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var21 ? var21.az_fld : 0;
				return 1;
			} else if (1621 == var0) {
				li var20 = lu.bv(var3, -1176401517);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var20 ? var20.cf() : 0;
				return 1;
			} else if (1622 == var0) {
				li var19 = lu.bv(var3, -1455128415);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var19 != null ? var19.cx() : 0;
				return 1;
			} else if (1623 == var0) {
				li var18 = lu.bv(var3, -2024708607);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var18 != null ? li.ih(var18, (byte)5) : 0;
				return 1;
			} else if (1624 == var0) {
				li var17 = lu.bv(var3, -1938663678);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17 != null && li.vk(var17, (byte)77) ? 1 : 0;
				return 1;
			} else if (1625 != var0) {
				if (var0 == 1626) {
					li var16 = lu.bv(var3, -476823991);
					ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var16 != null ? var16.ba().ak() : "";
					return 1;
				} else if (var0 == 1627) {
					li var15 = lu.bv(var3, -1074078204);
					int var5 = null != var15 ? var15.cc() : 0;
					int var6 = var15 != null ? li.dg(var15, (byte)17) : 0;
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Math.min(var5, var6);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Math.max(var5, var6);
					return 1;
				} else if (1628 == var0) {
					li var14 = lu.bv(var3, -1441574564);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var14 ? li.dg(var14, (byte)9) : 0;
					return 1;
				} else if (1629 == var0) {
					li var13 = lu.bv(var3, -1791784586);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var13 != null ? var13.cn() : 0;
					return 1;
				} else if (1630 == var0) {
					li var12 = lu.bv(var3, -1664028181);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var12 ? var12.cp() : 0;
					return 1;
				} else if (var0 == 1631) {
					li var11 = lu.bv(var3, -1011475460);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var11 != null ? li.rz(var11, (byte)36) : 0;
					return 1;
				} else if (var0 == 1632) {
					li var10 = lu.bv(var3, -1055111226);
					au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var10 != null ? var10.cg() : 0;
					return 1;
				} else if (1633 == var0) {
					sc var9 = var3.bu(576591949);
					au_fld[gz.ax_fld - 1] = null != var9 ? sc.ed(var9, au_fld[gz.ax_fld - 1]) : 0;
					return 1;
				} else if (1634 == var0) {
					sc var8 = var3.bu(629876786);
					au_fld[gz.ax_fld - 1] = var8 != null ? var8.av((char)au_fld[gz.ax_fld - 1]) : 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				li var7 = lu.bv(var3, -1668205387);
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var7 && var7.bg() ? 1 : 0;
				return 1;
			}
		}
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int el(int var0, ba var1, boolean var2) throws EOFException {
		lu var3 = var2 ? gs.ap_fld : ab_fld;
		if (var0 == 1700) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.ga_fld;
			return 1;
		} else if (var0 == 794532230) {
			if (var3.ga_fld != -1) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var3.gd_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -1271859897 - 1] = 0;
			}

			return 1;
		} else if (1547186713 == var0) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -965591522 * var3.by_fld;
			return 1;
		} else if (var0 == -1338417117) {
			int var7 = au_fld[(gz.ax_fld -= 1277384388) * -776631127];
			px var8 = kb.ag_px(var7, 508282797);
			if (var8.aw()) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var3.ao(var7, var8.as_fld, -2016022013);
			} else if (px.ll(var8, (short)10000)) {
				an_fld[(db.aa_fld += 432101741) * 1376977330 - 1] = var3.ap(var7, var8.ay_fld);
			} else {
				au_fld[(gz.ax_fld += 2046102204) * -776631127 - 1] = lu.jj(var3, var7, -1886897708 * var8.aw_fld);
			}

			return 1;
		} else if (1704 == var0) {
			int var4 = au_fld[(gz.ax_fld -= -1938635090) * -776631127];
			Object var5 = he.cg(var4);
			int var6 = au_fld[(gz.ax_fld -= 1785916261) * -776631127];
			var3.at(var6, var5, 583965381);
			return 1;
		} else if (var0 == -420341535) {
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.qz(var3, 1764955536) ? 1 : 0;
			return 1;
		} else if (1708 == var0) {
			return ap(var3);
		} else {
			return var0 == 1709 ? ag.at(var3) : 2;
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lsl;"
	)
	static sl jk(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (sl)var0;
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lsl;"
	)
	static sl jn(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (sl)var0;
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(ILba;)I"
	)
	static int gy(int var0, ba var1) throws EOFException {
		if (var0 == 4100) {
			String var36 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var49 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var36 + var49;
			return 1;
		} else if (var0 == 4101) {
			ef.aq_fld -= 2;
			String var35 = (String)ai_fld[ef.aq_fld];
			String var48 = (String)ai_fld[ef.aq_fld + 1];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var35 + var48;
			return 1;
		} else if (var0 == 4102) {
			String var34 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var47 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var34 + is.ay(var47, true);
			return 1;
		} else if (var0 == 4103) {
			String var33 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var33.toLowerCase();
			return 1;
		} else if (4104 == var0) {
			int var32 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			long var46 = (var32 + 11745L) * 86400000L;
			ac_fld.setTime(new Date(var46));
			int var61 = ac_fld.get(5);
			int var65 = ac_fld.get(2);
			int var66 = ac_fld.get(1);
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var61 + "-" + ae_fld[var65] + "-" + var66;
			return 1;
		} else if (var0 == 4105) {
			ef.aq_fld -= 2;
			String var31 = (String)ai_fld[ef.aq_fld];
			String var45 = (String)ai_fld[ef.aq_fld + 1];
			cv var56 = ot.ef();
			if (var56 != null && null != var56.av_fld && 1953147203 * var56.av_fld.ax_fld != 0) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var45;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var31;
			}

			return 1;
		} else if (4106 == var0) {
			int var30 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = Integer.toString(var30);
			return 1;
		} else if (4107 == var0) {
			ef.aq_fld -= 2;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bs.aq(ee.ak((String)ai_fld[ef.aq_fld], (String)ai_fld[1 + ef.aq_fld], ku.gi_fld));
			return 1;
		} else if (var0 == 4108) {
			String var29 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var44 = au_fld[gz.ax_fld];
			int var55 = au_fld[1 + gz.ax_fld];
			byte[] var60 = ow.ie_fld.bb(var55, 0, 584982574);
			zf var64 = new zf(var60);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var64.aq(var29, var44);
			return 1;
		} else if (4109 == var0) {
			String var28 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var43 = au_fld[gz.ax_fld];
			int var54 = au_fld[1 + gz.ax_fld];
			byte[] var59 = ow.ie_fld.bb(var54, 0, 584982574);
			zf var63 = new zf(var59);
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = zv.cf(var63, var28, var43);
			return 1;
		} else if (var0 == 4110) {
			ef.aq_fld -= 2;
			String var27 = (String)ai_fld[ef.aq_fld];
			String var42 = (String)ai_fld[ef.aq_fld + 1];
			if (au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var27;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var42;
			}

			return 1;
		} else if (var0 == 4111) {
			String var26 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = zv.ay(var26);
			return 1;
		} else if (4112 == var0) {
			String var25 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var41 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var25 + (char)var41;
			return 1;
		} else if (4113 == var0) {
			int var24 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = md.ai((char)var24) ? 1 : 0;
			return 1;
		} else if (4114 == var0) {
			int var23 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ey.au((char)var23) ? 1 : 0;
			return 1;
		} else if (4115 == var0) {
			int var22 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = eu.af((char)var22) ? 1 : 0;
			return 1;
		} else if (4116 == var0) {
			int var21 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jw.al((char)var21) ? 1 : 0;
			return 1;
		} else if (4117 == var0) {
			String var20 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			if (null != var20) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var20.length();
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (4118 == var0) {
			String var19 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var40 = au_fld[gz.ax_fld];
			int var53 = au_fld[gz.ax_fld + 1];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var19.substring(var40, var53);
			return 1;
		} else if (var0 == 4119) {
			String var18 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			StringBuilder var39 = new StringBuilder(var18.length());
			boolean var52 = false;

			for (int var58 = 0; var58 < var18.length(); var58++) {
				char var62 = var18.charAt(var58);
				if ('<' == var62) {
					var52 = true;
				} else if (var62 == '>') {
					var52 = false;
				} else if (!var52) {
					var39.append(var62);
				}
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var39.toString();
			return 1;
		} else if (4120 == var0) {
			String var17 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var38 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17.indexOf(var38);
			return 1;
		} else if (4121 == var0) {
			ef.aq_fld -= 2;
			String var16 = (String)ai_fld[ef.aq_fld];
			String var37 = (String)ai_fld[ef.aq_fld + 1];
			int var51 = au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var16.indexOf(var37, var51);
			return 1;
		} else if (4122 == var0) {
			String var15 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var15.toUpperCase();
			return 1;
		} else if (var0 == 4123) {
			ef.aq_fld -= 3;
			String var14 = (String)ai_fld[ef.aq_fld];
			String var4 = (String)ai_fld[ef.aq_fld + 1];
			String var50 = (String)ai_fld[ef.aq_fld + 2];
			cv var57 = ot.ef();
			if (null != var57 && null != var57.av_fld) {
				switch (-753683305 * var57.av_fld.au_fld) {
					case 0:
						ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var14;
						break;
					case 1:
						ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4;
						break;
					case 2:
					default:
						ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var50;
				}

				return 1;
			} else {
				ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var50;
				return 1;
			}
		} else if (var0 == 4124) {
			cv var13 = ot.ef();
			if (null != var13 && var13.av_fld != null) {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -753683305 * var13.av_fld.au_fld;
			} else {
				au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		} else if (var0 == 4125) {
			long var12 = an_fld[(db.aa_fld -= 432101741) * 867932261];
			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = Long.toString(var12);
			return 1;
		} else if (var0 != 4126) {
			return 2;
		} else {
			long var3 = an_fld[(db.aa_fld -= 432101741) * 867932261];
			String var5 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			String var6;
			if (0L == var3) {
				var6 = "0";
			} else if (!var5.isEmpty()) {
				boolean var7 = var3 < 0L;
				long var8 = var7 ? -var3 : var3;
				StringBuilder var10 = new StringBuilder();

				for (int var11 = 1; var8 > 0L; var11++) {
					var10.insert(0, var8 % 10L);
					var8 /= 10L;
					if (var8 > 0L && var11 % 3 == 0) {
						var10.insert(0, ",");
					}
				}

				if (var7) {
					var10.insert(0, '-');
				}

				var6 = var10.toString();
			} else {
				var6 = Long.toString(var3);
			}

			ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var6;
			return 1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Llu;)I"
	)
	static int ap(lu var0) {
		if (11 != var0.bx_fld) {
			ef.aq_fld--;
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			return 1;
		} else {
			String var2 = (String)ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = lu.fk(var0, var2, 1076761987);
			return 1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILwu;)Z"
	)
	public static boolean ak(int var0, wu var1) {
		return (var0 & var1.ag(349709670)) != 0;
	}
}
