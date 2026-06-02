import java.io.EOFException;
import java.io.IOException;
import java.util.Date;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ch")
public class ch {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ai_fld = new int[ch.al_fld];
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aa_fld = new int[ch.al_fld];
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lyv;"
	)
	static yv[] ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lyv;"
	)
	static yv[] as_fld;
	@ObfuscatedGetter(
		intValue = 125057781
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld = 0;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] au_fld = new int[ch.al_fld];
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ax_fld = new int[ch.al_fld];
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] an_fld = new int[ch.al_fld];
	@ObfuscatedGetter(
		intValue = -95214299
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld = -1407607350;
	@ObfuscatedGetter(
		intValue = 214475281
	)
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld = -1067093745;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] aq_fld = new int[al_fld];
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[[I"
	)
	static int[][] am_fld = new int[al_fld][];
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	static String[] ao_fld = new String[al_fld];
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ad_fld = new int[al_fld];
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static ry ap_fld = new ry(8, qd.ak_fld);
	@ObfuscatedGetter(
		intValue = 1955653013
	)
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld = -143277501;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ab_fld = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = -1898870905
	)
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bx_fld;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lku;Ldx;III)V"
	)
	static final void aa(ku var0, dx var1, int var2, int var3, int var4) throws EOFException {
		if (ku.id(var0, 373479080) == 4) {
			rg var5 = (rg)var1.an_fld.ak(ku.og(var0, 205903255));
			if (null != var5) {
				int var6 = var5.ah_fld.ah_fld * 491640768;
				int var7 = var5.ah_fld.aw_fld * -558426560;
				id.as(var5.ah_fld, var6, var7, var0.as() * 2, 0, -884765348);
				if (at_fld > -1 && var4 % 20 < 10) {
					do_.ar_fld[0].ab(var2 + at_fld - 12, var3 + ac_fld - 28);
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;I)V"
	)
	static void bz(dx var0, da var1, int var2) throws EOFException {
		id.as(var0, var1.bo_fld, var1.bp_fld, var2, var1.br((byte)90), -1312173796);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Lyv;)V"
	)
	static void af(yv[] var0) {
		as_fld = var0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	static void ap(int var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		if (var0 >= 0) {
			dx var6 = kx.ak(var0, client.da_fld);
			cv var7 = dx.ii(var6, var0);
			if (null != var7) {
				int var8 = client.db_fld.aa(var0);
				ds.aw(var6, var7, var8, var1, var2, var3, var4, var5, (byte)84);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([Lyv;)V"
	)
	static void au(yv[] var0) {
		as_fld = var0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean ax() {
		return as_fld != null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	static boolean an() {
		return as_fld != null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V"
	)
	static void am(dx var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		af_fld = 0;
		aq.ae(var0, var1, var2, var3, var4, var5, 1350361408);

		for (int var6 = 0; var6 < var0.am_fld.az(); var6++) {
			rg var7 = (rg)var0.an_fld.ak(var0.am_fld.ag(var6));
			if (null != var7) {
				aq.ae(var7.ah_fld, var1, var2, var3, var4, var5, 1845204493);
			}
		}

		boolean var21 = client.ec_fld;
		if (var21) {
			ea.ah(client.dj_fld, var1, var2, var3, var4, var5);
		}

		ea.ah(client.nq_fld, var1, var2, var3, var4, var5);
		int var22 = client.ox_fld;
		zf var8 = cu.dl_fld;

		for (int var9 = 0; var9 < af_fld; var9++) {
			int var10 = au_fld[var9];
			int var11 = ax_fld[var9];
			int var12 = aa_fld[var9];
			int var13 = an_fld[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var15 = 0; var15 < var9; var15++) {
					if (2 + var11 > ax_fld[var15] - an_fld[var15]
						&& var11 - var13 < ax_fld[var15] + 2
						&& var10 - var12 < au_fld[var15] + aa_fld[var15]
						&& var10 + var12 > au_fld[var15] - aa_fld[var15]
						&& ax_fld[var15] - an_fld[var15] < var11) {
						var11 = ax_fld[var15] - an_fld[var15];
						var14 = true;
					}
				}
			}

			at_fld = 143277501 * au_fld[var9];
			ac_fld = ax_fld[var9] = var11;
			String var23 = ao_fld[var9];
			if (var22 == 0) {
				int var16 = 16776960;
				if (ai_fld[var9] < 6) {
					var16 = ab_fld[ai_fld[var9]];
				}

				if (6 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? 16711680 : 16776960;
				}

				if (7 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? 255 : '\uffff';
				}

				if (8 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? '뀀' : 8454016;
				}

				if (9 == ai_fld[var9]) {
					int var17 = 150 - ad_fld[var9];
					if (var17 < 50) {
						var16 = 16711680 + var17 * 1280;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = 65280 + (var17 - 100) * 5;
					}
				}

				if (ai_fld[var9] == 10) {
					int var24 = 150 - ad_fld[var9];
					if (var24 < 50) {
						var16 = 16711680 + 5 * var24;
					} else if (var24 < 100) {
						var16 = 16711935 - (var24 - 50) * 327680;
					} else if (var24 < 150) {
						var16 = 255 + 327680 * (var24 - 100) - 5 * (var24 - 100);
					}
				}

				if (ai_fld[var9] == 11) {
					int var25 = 150 - ad_fld[var9];
					if (var25 < 50) {
						var16 = 16777215 - 327685 * var25;
					} else if (var25 < 100) {
						var16 = 65280 + 327685 * (var25 - 50);
					} else if (var25 < 150) {
						var16 = 16777215 - 327680 * (var25 - 100);
					}
				}

				if (ai_fld[var9] == 12 && am_fld[var9] == null) {
					int var26 = var23.length();
					am_fld[var9] = new int[var26];

					for (int var18 = 0; var18 < var26; var18++) {
						int var19 = (int)(64.0F * ((float)var18 / var26));
						int var20 = var19 << 10 | 896 | 64;
						am_fld[var9][var18] = ue.as_fld[var20];
					}
				}

				if (0 == aq_fld[var9]) {
					var8.ha(var23, at_fld + var1, var2 + ac_fld, var16, 0, am_fld[var9]);
				}

				if (aq_fld[var9] == 1) {
					var8.bm(var23, var1 + at_fld, var2 + ac_fld, var16, 0, var5, am_fld[var9]);
				}

				if (2 == aq_fld[var9]) {
					var8.bd(var23, var1 + at_fld, var2 + ac_fld, var16, 0, var5, am_fld[var9]);
				}

				if (aq_fld[var9] == 3) {
					var8.bz(var23, var1 + at_fld, ac_fld + var2, var16, 0, var5, 150 - ad_fld[var9], am_fld[var9]);
				}

				if (aq_fld[var9] == 4) {
					int var27 = (150 - ad_fld[var9]) * (var8.an(var23) + 100) / 150;
					yu.dw(at_fld + var1 - 50, var2, at_fld + var1 + 50, var4 + var2);
					var8.br(var23, 50 + at_fld + var1 - var27, ac_fld + var2, var16, 0, am_fld[var9]);
					yu.dg(var1, var2, var1 + var3, var2 + var4);
				}

				if (5 == aq_fld[var9]) {
					int var28 = 150 - ad_fld[var9];
					int var29 = 0;
					if (var28 < 25) {
						var29 = var28 - 25;
					} else if (var28 > 125) {
						var29 = var28 - 125;
					}

					yu.dw(var1, ac_fld + var2 - var8.ap_fld - 1, var3 + var1, ac_fld + var2 + 5);
					var8.ha(var23, at_fld + var1, ac_fld + var2 + var29, var16, 0, am_fld[var9]);
					yu.dg(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				var8.ap(var23, var1 + at_fld, var2 + ac_fld, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V"
	)
	static void ai(dx var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		af_fld = 0;
		aq.ae(var0, var1, var2, var3, var4, var5, 1528749355);

		for (int var6 = 0; var6 < var0.am_fld.az(); var6++) {
			rg var7 = (rg)var0.an_fld.ak(var0.am_fld.ag(var6));
			if (null != var7) {
				aq.ae(var7.ah_fld, var1, var2, var3, var4, var5, 1457218787);
			}
		}

		boolean var21 = client.ec_fld;
		if (var21) {
			ea.ah(client.dj_fld, var1, var2, var3, var4, var5);
		}

		ea.ah(client.nq_fld, var1, var2, var3, var4, var5);
		int var22 = client.ox_fld;
		zf var8 = cu.dl_fld;

		for (int var9 = 0; var9 < af_fld; var9++) {
			int var10 = au_fld[var9];
			int var11 = ax_fld[var9];
			int var12 = aa_fld[var9];
			int var13 = an_fld[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var15 = 0; var15 < var9; var15++) {
					if (2 + var11 > ax_fld[var15] - an_fld[var15]
						&& var11 - var13 < ax_fld[var15] + 2
						&& var10 - var12 < au_fld[var15] + aa_fld[var15]
						&& var10 + var12 > au_fld[var15] - aa_fld[var15]
						&& ax_fld[var15] - an_fld[var15] < var11) {
						var11 = ax_fld[var15] - an_fld[var15];
						var14 = true;
					}
				}
			}

			at_fld = 143277501 * au_fld[var9];
			ac_fld = ax_fld[var9] = var11;
			String var23 = ao_fld[var9];
			if (var22 == 0) {
				int var16 = 16776960;
				if (ai_fld[var9] < 6) {
					var16 = ab_fld[ai_fld[var9]];
				}

				if (6 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? 16711680 : 16776960;
				}

				if (7 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? 255 : '\uffff';
				}

				if (8 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? '뀀' : 8454016;
				}

				if (9 == ai_fld[var9]) {
					int var17 = 150 - ad_fld[var9];
					if (var17 < 50) {
						var16 = 16711680 + var17 * 1280;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = 65280 + (var17 - 100) * 5;
					}
				}

				if (ai_fld[var9] == 10) {
					int var24 = 150 - ad_fld[var9];
					if (var24 < 50) {
						var16 = 16711680 + 5 * var24;
					} else if (var24 < 100) {
						var16 = 16711935 - (var24 - 50) * 327680;
					} else if (var24 < 150) {
						var16 = 255 + 327680 * (var24 - 100) - 5 * (var24 - 100);
					}
				}

				if (ai_fld[var9] == 11) {
					int var25 = 150 - ad_fld[var9];
					if (var25 < 50) {
						var16 = 16777215 - 327685 * var25;
					} else if (var25 < 100) {
						var16 = 65280 + 327685 * (var25 - 50);
					} else if (var25 < 150) {
						var16 = 16777215 - 327680 * (var25 - 100);
					}
				}

				if (ai_fld[var9] == 12 && am_fld[var9] == null) {
					int var26 = var23.length();
					am_fld[var9] = new int[var26];

					for (int var18 = 0; var18 < var26; var18++) {
						int var19 = (int)(64.0F * ((float)var18 / var26));
						int var20 = var19 << 10 | 896 | 64;
						am_fld[var9][var18] = ue.as_fld[var20];
					}
				}

				if (0 == aq_fld[var9]) {
					var8.ha(var23, at_fld + var1, var2 + ac_fld, var16, 0, am_fld[var9]);
				}

				if (aq_fld[var9] == 1) {
					var8.bm(var23, var1 + at_fld, var2 + ac_fld, var16, 0, var5, am_fld[var9]);
				}

				if (2 == aq_fld[var9]) {
					var8.bd(var23, var1 + at_fld, var2 + ac_fld, var16, 0, var5, am_fld[var9]);
				}

				if (aq_fld[var9] == 3) {
					var8.bz(var23, var1 + at_fld, ac_fld + var2, var16, 0, var5, 150 - ad_fld[var9], am_fld[var9]);
				}

				if (aq_fld[var9] == 4) {
					int var27 = (150 - ad_fld[var9]) * (var8.an(var23) + 100) / 150;
					yu.dw(at_fld + var1 - 50, var2, at_fld + var1 + 50, var4 + var2);
					var8.br(var23, 50 + at_fld + var1 - var27, ac_fld + var2, var16, 0, am_fld[var9]);
					yu.dg(var1, var2, var1 + var3, var2 + var4);
				}

				if (5 == aq_fld[var9]) {
					int var28 = 150 - ad_fld[var9];
					int var29 = 0;
					if (var28 < 25) {
						var29 = var28 - 25;
					} else if (var28 > 125) {
						var29 = var28 - 125;
					}

					yu.dw(var1, ac_fld + var2 - var8.ap_fld - 1, var3 + var1, ac_fld + var2 + 5);
					var8.ha(var23, at_fld + var1, ac_fld + var2 + var29, var16, 0, am_fld[var9]);
					yu.dg(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				var8.ap(var23, var1 + at_fld, var2 + ac_fld, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;I)V"
	)
	static void bd(dx var0, da var1, int var2) throws EOFException {
		id.as(var0, var1.bo_fld, var1.bp_fld, var2, var1.br((byte)55), -1245477554);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;IIIIII)V"
	)
	static void aj(dx var0, da var1, int var2, int var3, int var4, int var5, int var6, int var7) throws EOFException {
		if (var1 != null && var1.bm(1070008502)) {
			if (var1 instanceof ds) {
				pp var8 = ((ds)var1).ah_fld;
				if (null != var8.dy_fld) {
					var8 = var8.ar((byte)6);
				}

				if (null == var8) {
					return;
				}
			}

			di var48 = client.db_fld;
			zf var9 = cu.dl_fld;
			zf var10 = ls.dd_fld;
			int var11 = -918742234 * client.ka_fld;
			ku var12 = client.le_fld;
			int var13 = client.db_fld.al_fld;
			int[] var14 = var48.az_fld;
			boolean var15 = var2 < var13;
			int var16 = -2;
			if (var1.cx_fld != null && (!var15 || !var1.cp_fld && (var11 == 4 || !var1.cs_fld && (var11 == 0 || var11 == 3 || var11 == 1 && ((cv)var1).as((byte)0))))) {
				nn.ay(var0, var1, var1.ep(-364595603));
				if (at_fld > -1 && af_fld < al_fld) {
					aa_fld[af_fld] = var9.an(var1.cx_fld) / 2;
					an_fld[af_fld * 1465225387] = var9.ap_fld;
					au_fld[-399457454 * af_fld] = 282336863 * at_fld;
					ax_fld[1360505398 * af_fld] = ac_fld - var16;
					ai_fld[-1956894507 * af_fld] = 1716240526 * var1.cn_fld;
					aq_fld[af_fld * -12997300] = var1.cr_fld;
					ad_fld[2137214547 * af_fld] = var1.ce_fld;
					am_fld[af_fld * -884086567] = var1.ca_fld;
					ao_fld[-891516753 * af_fld] = var1.cx_fld;
					af_fld++;
					var16 += 12;
				}
			}

			rg var17 = client.da_fld.ay(var1.bl_fld * -1161216247, (byte)34);
			if (var17 == null || !var17.av(-519659998)) {
				if (!var1.bk_fld.bi()) {
					nn.ay(var0, var1, var1.ep(1287350166) + 15);

					for (cr var18 = (cr)var1.bk_fld.ah(); null != var18; var18 = (cr)var1.bk_fld.ay()) {
						cp var19 = var18.ag(var7);
						if (var19 != null) {
							pa var20 = var18.az_fld;
							yv var21 = var20.av(1787234897);
							yv var22 = var20.ae(-19613657);
							int var24 = 0;
							int var23;
							if (var21 != null && var22 != null) {
								if (var20.aa_fld < var22.aw_fld) {
									var24 = var20.aa_fld;
								}

								var23 = var22.aw_fld - 2 * var24;
							} else {
								var23 = var20.an_fld;
							}

							int var25 = 255;
							byte var26 = -1;
							int var27 = var7 - var19.ak_fld;
							int var28 = var19.az_fld * var23 / var20.an_fld;
							int var70;
							if (var19.av_fld > var27) {
								int var29 = 0 == var20.af_fld ? 0 : var27 / var20.af_fld * var20.af_fld;
								int var30 = var19.ag_fld * var23 / var20.an_fld;
								var70 = var30 + (var28 - var30) * var29 / var19.av_fld;
							} else {
								var70 = var28;
								int var75 = var19.av_fld + var20.al_fld - var27;
								if (var20.ar_fld * 683953094 >= 0) {
									var25 = (var75 << 8) / (var20.al_fld - var20.ar_fld);
								}
							}

							if (var19.az_fld > 0 && var70 < 1) {
								var70 = 1;
							}

							if (var21 != null && null != var22) {
								if (var23 == var70) {
									var70 += var24 * 2;
								} else {
									var70 += var24;
								}

								int var77 = var21.ay_fld;
								var16 += var77;
								int var80 = var3 + at_fld - (var23 >> 1);
								int var31 = var4 + ac_fld - var16;
								var80 -= var24;
								if (var25 >= 0 && var25 < 255) {
									var21.ac(var80, var31, var25);
									yu.dw(var80, var31, var70 + var80, var31 + var77);
									var22.ac(var80, var31, var25);
								} else {
									var21.ab(var80, var31);
									yu.dw(var80, var31, var80 + var70, var31 + var77);
									var22.ab(var80, var31);
								}

								yu.dg(var3, var4, var5 + var3, var6 + var4);
								var16 += 2;
							} else {
								var16 += 5;
								if (at_fld > -1) {
									int var76 = at_fld + var3 - (var23 >> 1);
									int var79 = ac_fld + var4 - var16;
									yu.dj(var76, var79, var70, 5, 65280);
									yu.dj(var70 + var76, var79, var23 - var70, 5, -1006641221);
								}

								var16 += 2;
							}
						} else if (var18.az()) {
							var18.gy_void();
						}
					}
				}

				if (var16 == 550491613) {
					var16 += 7;
				}

				if (var15 && var7 == var1.bs_fld && ea.dh((cv)var1)) {
					cv var53 = (cv)var1;
					if (var15) {
						nn.ay(var0, var1, var1.ep(897193419) + 15);
						var16 += 4;
						var10.ap(var53.az_fld.ak(-1017875073), at_fld + var3, ac_fld + var4 - var16, 16777215, 0);
						var16 += 18;
					}
				}

				if (var15) {
					cv var54 = (cv)var1;
					if (var54.at_fld) {
						return;
					}

					if (var54.ae_fld != -1 || -1 != var54.ah_fld) {
						nn.ay(var0, var1, var1.ep(1416748381) + 15);
						if (at_fld > -1) {
							if (-1 != var54.ae_fld) {
								var16 += 25;
								ay_fld[var54.ae_fld].ab(at_fld + var3 - 12, var4 + ac_fld - var16);
							}

							if (-1 != var54.ah_fld) {
								var16 += 25;
								as_fld[var54.ah_fld].ab(var3 + at_fld - 12, ac_fld + var4 - var16);
							}
						}
					}

					if (var2 >= 0 && ku.id(var12, 1421285918) == 3 && ku.og(var12, 205903255) == var14[var2]) {
						nn.ay(var0, var1, var1.ep(25314464) + 15);
						if (at_fld > -1) {
							var16 += do_.ar_fld[1].ay_fld;
							do_.ar_fld[1].ab(var3 + at_fld - 12, ac_fld + var4 - var16);
						}
					}
				} else {
					ds var55 = (ds)var1;
					int[] var57 = var55.af(-492920904);
					short[] var59 = ds.lu(var55, 247057776);
					if (null != var59 && null != var57) {
						for (int var61 = 0; var61 < var59.length; var61++) {
							if (var59[var61] >= 0 && var57[var61] >= 0) {
								long var63 = (long)var57[var61] << 8 | var59[var61];
								yv var66 = (yv)(yv)ap_fld.ag(var63);
								if (var66 == null) {
									yv[] var68 = km.az(gz.hy_fld, var57[var61], 0);
									if (var68 != null && var59[var61] < var68.length) {
										var66 = var68[var59[var61]];
										ap_fld.az(var63, var66);
									}
								}

								if (null != var66) {
									nn.ay(var0, var1, var1.ep(-1377932343) + 15);
									if (at_fld > -1) {
										var66.ab(at_fld + var3 - (var66.aw_fld >> 1), (var4 - var66.ay_fld - 2) * (1 + var61) - var66.ay_fld + ac_fld - 4);
									}
								}
							}
						}
					}

					if (ku.id(var12, -395298266) == 1 && ku.og(var12, 205903255) == var0.ad_fld.ag(var2 - var13) && var7 % 20 < 10) {
						nn.ay(var0, var1, var1.ep(-1076076493) + 15);
						if (at_fld > -1) {
							do_.ar_fld[0].ab(var3 + at_fld - 12, var4 + ac_fld - 28);
						}
					}
				}

				if (!var1.bh_fld.isEmpty()) {
					nn.ay(var0, var1, var1.ep(-819012704) / 2);

					for (int var56 = 0; var56 < var1.bh_fld.size(); var56++) {
						du var58 = (du)(du)var1.bh_fld.get(var56);
						if (du.fy(var58, -32809735) > var7) {
							py var60 = gf.ak(var58.ag((byte)72));
							if (null != var60.ac_fld) {
								var60 = py.cj(var60, (byte)119);
								if (null == var60) {
									continue;
								}
							}

							if (du.fy(var58, -32809735) - var60.ax_fld <= var7) {
								byte var62 = 2;
								yv var64 = py.ib(var60, -1079121744);
								yv var65 = var60.ay();
								yv var67 = var60.aw();
								yv var69 = var60.as();
								zf var72 = var60.ar();
								if (var72 == null) {
									var72 = ej.do_fld;
								}

								int var73 = var58.az(-1409959564);
								String var74 = var60.ae(var73);
								int var78 = var72.an(var74);
								int var82 = 0;
								if (null != var67) {
									if (null == var65 && var69 == null) {
										var82 = 1;
									} else {
										var82 = var78 / var67.aw_fld + 1;
									}
								}

								int var83 = 0;
								if (var64 != null) {
									var83 = var64.aw_fld;
								}

								var83 += 2;
								int var32 = var83;
								if (var65 != null) {
									var83 += var65.aw_fld;
								}

								int var33 = var83;
								int var34 = var83;
								if (null != var67) {
									int var35 = var67.aw_fld * var82;
									var83 += var35;
									var34 = var83 + (var35 - var78) / 2;
								} else {
									var83 += var78;
								}

								int var86 = var83;
								if (var69 != null) {
									var83 += var69.aw_fld;
								}

								int var36 = av.ak(var56);
								int var37 = ab.ag(var56);
								int var38 = var36 + at_fld;
								int var39 = ac_fld + var37;
								int var40 = du.fy(var58, -32809735) - var7;
								int var41 = var60.am_fld - var60.am_fld * var40 / var60.ax_fld;
								int var42 = -(var60.ad_fld * 1958517698) + var40 * var60.ad_fld / var60.ax_fld;
								int var43 = var38 + var3 - (var83 >> 1) + var41;
								int var44 = var42 + (var39 + var4 - 12);
								int var45 = var60.at_fld + 15 + var44;
								int var46 = 255;
								if (var60.ao_fld >= 0) {
									var46 = (var40 << 8) / (var60.ax_fld - var60.ao_fld);
								}

								if (var46 >= 0 && var46 < -1939367222) {
									if (var64 != null) {
										var64.ac(var43 - var64.as_fld, var44, var46);
									}

									if (null != var65) {
										var65.ac(var32 + var43 - var65.as_fld, var44, var46);
									}

									if (var67 != null) {
										for (int var87 = 0; var87 < var82; var87++) {
											var67.ac(var87 * var67.aw_fld + (var33 + var43 - var67.as_fld), var44, var46);
										}
									}

									if (var69 != null) {
										var69.ac(var43 + var86 - var69.as_fld, var44, var46);
									}

									var72.ao(var60.ae(var58.az(-1409959564)), var34 + var43, var45, -69132448 * var60.au_fld, 0, var46);
								} else {
									if (null != var64) {
										var64.ab(var43 - var64.as_fld, var44);
									}

									if (null != var65) {
										var65.ab(var43 + var32 - var65.as_fld, var44);
									}

									if (null != var67) {
										for (int var47 = 0; var47 < var82; var47++) {
											var67.ab(var67.aw_fld * var47 + (var33 + var43 - var67.as_fld), var44);
										}
									}

									if (null != var69) {
										var69.ab(var43 + var86 - var69.as_fld, var44);
									}

									zv.uj(var72, var60.ae(var58.az(-1409959564)), var34 + var43, var45, var60.au_fld | 0xFF000000, 0);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)V"
	)
	static void br(dx var0, int var1, int var2, int var3, int var4) throws EOFException {
		int var5 = var1;
		int var6 = var2;
		int var7 = gl.dt(var0, var1, var2, var0.ae_fld, var4) - var3;
		if (!var0.ak(-787091592)) {
			rg var8 = (rg)bw.dk_fld.an_fld.ak(var0.ag_fld);
			if (var8 != null) {
				tu var9 = mf.bn(var0, var1, var2);
				var5 = (int)var9.ay_fld;
				var6 = (int)var9.ar_fld;
				var7 += jf.dv(bw.dk_fld, var8.dp(583186865), var8.dj(189745805), bw.dk_fld.ae_fld * 1680276182);
				var9.ah();
			}
		}

		int var11 = 1930638333;
		short var12 = 128;
		int var13 = kj.aw(bw.dk_fld.ah_fld - 2);
		int var14 = kj.aw(bw.dk_fld.aw_fld - 2);
		if (var5 >= var11 && var13 >= var5 && var6 >= var12 && var14 >= var6) {
			int var20 = var5 - ke.jd_fld;
			int var10 = var7 - cs.jy_fld;
			int var22 = var6 - gk.jc_fld;
			int var15 = fc.ah_fld[-534185222 * hu.je_fld];
			int var16 = fc.aw_fld[hu.je_fld];
			int var17 = fc.ah_fld[ab.jx_fld];
			int var18 = fc.aw_fld[ab.jx_fld];
			int var19 = var18 * var20 + var17 * var22 >> 16;
			var22 = var18 * var22 - var17 * var20 >> 16;
			var19 = var16 * var10 - var22 * var15 >> 16;
			var22 = var22 * var16 + var10 * var15 >> 16;
			if (var22 >= 50) {
				at_fld = (var19 * client.fd_fld / var22 + client.fn_fld / 2) * -692200308;
				ac_fld = client.ft_fld / 2 + var19 * client.fd_fld / var22;
			} else {
				at_fld = 1887873850;
				ac_fld = -1067093745;
			}
		} else {
			at_fld = 1020790248;
			ac_fld = -757271976;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V"
	)
	static void ab(dx var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		di var6 = client.db_fld;
		int var7 = client.nq_fld;
		int var8 = client.dj_fld;
		int var9 = var6.al_fld * 980425947;
		int[] var10 = var6.az_fld;

		for (int var11 = 0; var11 < var9 + var0.ad_fld.az(); var11++) {
			da var12;
			if (var11 < var9) {
				var12 = (da)var0.au_fld.ak(var10[var11]);
				if (var7 == var10[var11] || var10[var11] == var8) {
					continue;
				}
			} else {
				var12 = (da)var0.ax_fld.ak(var0.ad_fld.ag(var11 - var9));
			}

			ds.aw(var0, var12, var11, var1, var2, var3, var4, var5, (byte)53);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Lyv;)V"
	)
	static void ar(yv[] var0) {
		as_fld = var0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V"
	)
	static void aq(dx var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		af_fld = 0;
		aq.ae(var0, var1, var2, var3, var4, var5, 1713588275);

		for (int var6 = 0; var6 < var0.am_fld.az(); var6++) {
			rg var7 = (rg)var0.an_fld.ak(var0.am_fld.ag(var6));
			if (null != var7) {
				aq.ae(var7.ah_fld, var1, var2, var3, var4, var5, 1603060499);
			}
		}

		boolean var21 = client.ec_fld;
		if (var21) {
			ea.ah(client.dj_fld, var1, var2, var3, var4, var5);
		}

		ea.ah(client.nq_fld, var1, var2, var3, var4, var5);
		int var22 = client.ox_fld;
		zf var8 = cu.dl_fld;

		for (int var9 = 0; var9 < af_fld; var9++) {
			int var10 = au_fld[var9];
			int var11 = ax_fld[var9];
			int var12 = aa_fld[var9];
			int var13 = an_fld[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var15 = 0; var15 < var9; var15++) {
					if (2 + var11 > ax_fld[var15] - an_fld[var15]
						&& var11 - var13 < ax_fld[var15] + 2
						&& var10 - var12 < au_fld[var15] + aa_fld[var15]
						&& var10 + var12 > au_fld[var15] - aa_fld[var15]
						&& ax_fld[var15] - an_fld[var15] < var11) {
						var11 = ax_fld[var15] - an_fld[var15];
						var14 = true;
					}
				}
			}

			at_fld = 143277501 * au_fld[var9];
			ac_fld = ax_fld[var9] = var11;
			String var23 = ao_fld[var9];
			if (var22 == 0) {
				int var16 = 16776960;
				if (ai_fld[var9] < 6) {
					var16 = ab_fld[ai_fld[var9]];
				}

				if (6 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? 16711680 : 16776960;
				}

				if (7 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? 255 : '\uffff';
				}

				if (8 == ai_fld[var9]) {
					var16 = var5 % 20 < 10 ? '뀀' : 8454016;
				}

				if (9 == ai_fld[var9]) {
					int var17 = 150 - ad_fld[var9];
					if (var17 < 50) {
						var16 = 16711680 + var17 * 1280;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = 65280 + (var17 - 100) * 5;
					}
				}

				if (ai_fld[var9] == 10) {
					int var24 = 150 - ad_fld[var9];
					if (var24 < 50) {
						var16 = 16711680 + 5 * var24;
					} else if (var24 < 100) {
						var16 = 16711935 - (var24 - 50) * 327680;
					} else if (var24 < 150) {
						var16 = 255 + 327680 * (var24 - 100) - 5 * (var24 - 100);
					}
				}

				if (ai_fld[var9] == 11) {
					int var25 = 150 - ad_fld[var9];
					if (var25 < 50) {
						var16 = 16777215 - 327685 * var25;
					} else if (var25 < 100) {
						var16 = 65280 + 327685 * (var25 - 50);
					} else if (var25 < 150) {
						var16 = 16777215 - 327680 * (var25 - 100);
					}
				}

				if (ai_fld[var9] == 12 && am_fld[var9] == null) {
					int var26 = var23.length();
					am_fld[var9] = new int[var26];

					for (int var18 = 0; var18 < var26; var18++) {
						int var19 = (int)(64.0F * ((float)var18 / var26));
						int var20 = var19 << 10 | 896 | 64;
						am_fld[var9][var18] = ue.as_fld[var20];
					}
				}

				if (0 == aq_fld[var9]) {
					var8.ha(var23, at_fld + var1, var2 + ac_fld, var16, 0, am_fld[var9]);
				}

				if (aq_fld[var9] == 1) {
					var8.bm(var23, var1 + at_fld, var2 + ac_fld, var16, 0, var5, am_fld[var9]);
				}

				if (2 == aq_fld[var9]) {
					var8.bd(var23, var1 + at_fld, var2 + ac_fld, var16, 0, var5, am_fld[var9]);
				}

				if (aq_fld[var9] == 3) {
					var8.bz(var23, var1 + at_fld, ac_fld + var2, var16, 0, var5, 150 - ad_fld[var9], am_fld[var9]);
				}

				if (aq_fld[var9] == 4) {
					int var27 = (150 - ad_fld[var9]) * (var8.an(var23) + 100) / 150;
					yu.dw(at_fld + var1 - 50, var2, at_fld + var1 + 50, var4 + var2);
					var8.br(var23, 50 + at_fld + var1 - var27, ac_fld + var2, var16, 0, am_fld[var9]);
					yu.dg(var1, var2, var1 + var3, var2 + var4);
				}

				if (5 == aq_fld[var9]) {
					int var28 = 150 - ad_fld[var9];
					int var29 = 0;
					if (var28 < 25) {
						var29 = var28 - 25;
					} else if (var28 > 125) {
						var29 = var28 - 125;
					}

					yu.dw(var1, ac_fld + var2 - var8.ap_fld - 1, var3 + var1, ac_fld + var2 + 5);
					var8.ha(var23, at_fld + var1, ac_fld + var2 + var29, var16, 0, am_fld[var9]);
					yu.dg(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				var8.ap(var23, var1 + at_fld, var2 + ac_fld, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;IIIIII)V"
	)
	static void at(dx var0, da var1, int var2, int var3, int var4, int var5, int var6, int var7) throws EOFException {
		if (var1 != null && var1.bm(939777534)) {
			if (var1 instanceof ds) {
				pp var8 = ((ds)var1).ah_fld;
				if (null != var8.dy_fld) {
					var8 = var8.ar((byte)6);
				}

				if (null == var8) {
					return;
				}
			}

			di var48 = client.db_fld;
			zf var9 = cu.dl_fld;
			zf var10 = ls.dd_fld;
			int var11 = client.ka_fld;
			ku var12 = client.le_fld;
			int var13 = client.db_fld.al_fld;
			int[] var14 = var48.az_fld;
			boolean var15 = var2 < var13;
			int var16 = -2;
			if (var1.cx_fld != null && (!var15 || !var1.cp_fld && (var11 == 4 || !var1.cs_fld && (var11 == 0 || var11 == 3 || var11 == 1 && ((cv)var1).as((byte)0))))) {
				nn.ay(var0, var1, var1.ep(-920062884));
				if (at_fld > -1 && af_fld < al_fld) {
					aa_fld[af_fld] = var9.an(var1.cx_fld) / 2;
					an_fld[af_fld] = var9.ap_fld;
					au_fld[af_fld] = at_fld;
					ax_fld[af_fld] = ac_fld - var16;
					ai_fld[af_fld] = var1.cn_fld;
					aq_fld[af_fld] = var1.cr_fld;
					ad_fld[af_fld] = var1.ce_fld;
					am_fld[af_fld] = var1.ca_fld;
					ao_fld[af_fld] = var1.cx_fld;
					af_fld++;
					var16 += 12;
				}
			}

			rg var17 = client.da_fld.ay(var1.bl_fld, (byte)-95);
			if (var17 == null || !var17.av(-1792380148)) {
				if (!var1.bk_fld.bi()) {
					nn.ay(var0, var1, var1.ep(1930198410) + 15);

					for (cr var18 = (cr)var1.bk_fld.ah(); null != var18; var18 = (cr)var1.bk_fld.ay()) {
						cp var19 = var18.ag(var7);
						if (var19 != null) {
							pa var20 = var18.az_fld;
							yv var21 = var20.av(617862401);
							yv var22 = var20.ae(686111225);
							int var24 = 0;
							int var23;
							if (var21 != null && var22 != null) {
								if (var20.aa_fld < var22.aw_fld) {
									var24 = var20.aa_fld;
								}

								var23 = var22.aw_fld - 2 * var24;
							} else {
								var23 = var20.an_fld;
							}

							int var25 = 255;
							byte var26 = -1;
							int var27 = var7 - var19.ak_fld;
							int var28 = var19.az_fld * var23 / var20.an_fld;
							int var70;
							if (var19.av_fld > var27) {
								int var29 = 0 == var20.af_fld ? 0 : var27 / var20.af_fld * var20.af_fld;
								int var30 = var19.ag_fld * var23 / var20.an_fld;
								var70 = var30 + (var28 - var30) * var29 / var19.av_fld;
							} else {
								var70 = var28;
								int var75 = var19.av_fld + var20.al_fld - var27;
								if (var20.ar_fld >= 0) {
									var25 = (var75 << 8) / (var20.al_fld - var20.ar_fld);
								}
							}

							if (var19.az_fld > 0 && var70 < 1) {
								var70 = 1;
							}

							if (var21 != null && null != var22) {
								if (var23 == var70) {
									var70 += var24 * 2;
								} else {
									var70 += var24;
								}

								int var77 = var21.ay_fld;
								var16 += var77;
								int var80 = var3 + at_fld - (var23 >> 1);
								int var31 = var4 + ac_fld - var16;
								var80 -= var24;
								if (var25 >= 0 && var25 < 255) {
									var21.ac(var80, var31, var25);
									yu.dw(var80, var31, var70 + var80, var31 + var77);
									var22.ac(var80, var31, var25);
								} else {
									var21.ab(var80, var31);
									yu.dw(var80, var31, var80 + var70, var31 + var77);
									var22.ab(var80, var31);
								}

								yu.dg(var3, var4, var5 + var3, var6 + var4);
								var16 += 2;
							} else {
								var16 += 5;
								if (at_fld > -1) {
									int var76 = at_fld + var3 - (var23 >> 1);
									int var79 = ac_fld + var4 - var16;
									yu.dj(var76, var79, var70, 5, 65280);
									yu.dj(var70 + var76, var79, var23 - var70, 5, 16711680);
								}

								var16 += 2;
							}
						} else if (var18.az()) {
							var18.gy_void();
						}
					}
				}

				if (var16 == -2) {
					var16 += 7;
				}

				if (var15 && var7 == var1.bs_fld && ea.dh((cv)var1)) {
					cv var53 = (cv)var1;
					if (var15) {
						nn.ay(var0, var1, var1.ep(1482714925) + 15);
						var16 += 4;
						var10.ap(var53.az_fld.ak(-420419987), at_fld + var3, ac_fld + var4 - var16, 16777215, 0);
						var16 += 18;
					}
				}

				if (var15) {
					cv var54 = (cv)var1;
					if (var54.at_fld) {
						return;
					}

					if (var54.ae_fld != -1 || -1 != var54.ah_fld) {
						nn.ay(var0, var1, var1.ep(250063706) + 15);
						if (at_fld > -1) {
							if (-1 != var54.ae_fld) {
								var16 += 25;
								ay_fld[var54.ae_fld].ab(at_fld + var3 - 12, var4 + ac_fld - var16);
							}

							if (-1 != var54.ah_fld) {
								var16 += 25;
								as_fld[var54.ah_fld].ab(var3 + at_fld - 12, ac_fld + var4 - var16);
							}
						}
					}

					if (var2 >= 0 && ku.id(var12, -1301724606) == 3 && ku.og(var12, 205903255) == var14[var2]) {
						nn.ay(var0, var1, var1.ep(-1469746336) + 15);
						if (at_fld > -1) {
							var16 += do_.ar_fld[1].ay_fld;
							do_.ar_fld[1].ab(var3 + at_fld - 12, ac_fld + var4 - var16);
						}
					}
				} else {
					ds var55 = (ds)var1;
					int[] var57 = var55.af(763810418);
					short[] var59 = ds.lu(var55, -545628789);
					if (null != var59 && null != var57) {
						for (int var61 = 0; var61 < var59.length; var61++) {
							if (var59[var61] >= 0 && var57[var61] >= 0) {
								long var63 = (long)var57[var61] << 8 | var59[var61];
								yv var66 = (yv)(yv)ap_fld.ag(var63);
								if (var66 == null) {
									yv[] var68 = km.az(gz.hy_fld, var57[var61], 0);
									if (var68 != null && var59[var61] < var68.length) {
										var66 = var68[var59[var61]];
										ap_fld.az(var63, var66);
									}
								}

								if (null != var66) {
									nn.ay(var0, var1, var1.ep(1407346278) + 15);
									if (at_fld > -1) {
										var66.ab(at_fld + var3 - (var66.aw_fld >> 1), (var4 - var66.ay_fld - 2) * (1 + var61) - var66.ay_fld + ac_fld - 4);
									}
								}
							}
						}
					}

					if (ku.id(var12, -801850213) == 1 && ku.og(var12, 205903255) == var0.ad_fld.ag(var2 - var13) && var7 % 20 < 10) {
						nn.ay(var0, var1, var1.ep(576397684) + 15);
						if (at_fld > -1) {
							do_.ar_fld[0].ab(var3 + at_fld - 12, var4 + ac_fld - 28);
						}
					}
				}

				if (!var1.bh_fld.isEmpty()) {
					nn.ay(var0, var1, var1.ep(1200617838) / 2);

					for (int var56 = 0; var56 < var1.bh_fld.size(); var56++) {
						du var58 = (du)(du)var1.bh_fld.get(var56);
						if (du.fy(var58, -32809735) > var7) {
							py var60 = gf.ak(var58.ag((byte)5));
							if (null != var60.ac_fld) {
								var60 = py.cj(var60, (byte)13);
								if (null == var60) {
									continue;
								}
							}

							if (du.fy(var58, -32809735) - var60.ax_fld <= var7) {
								byte var62 = 2;
								yv var64 = py.ib(var60, -1117998558);
								yv var65 = var60.ay();
								yv var67 = var60.aw();
								yv var69 = var60.as();
								zf var72 = var60.ar();
								if (var72 == null) {
									var72 = ej.do_fld;
								}

								int var73 = var58.az(-1409959564);
								String var74 = var60.ae(var73);
								int var78 = var72.an(var74);
								int var82 = 0;
								if (null != var67) {
									if (null == var65 && var69 == null) {
										var82 = 1;
									} else {
										var82 = var78 / var67.aw_fld + 1;
									}
								}

								int var83 = 0;
								if (var64 != null) {
									var83 = var64.aw_fld;
								}

								var83 += 2;
								int var32 = var83;
								if (var65 != null) {
									var83 += var65.aw_fld;
								}

								int var33 = var83;
								int var34 = var83;
								if (null != var67) {
									int var35 = var67.aw_fld * var82;
									var83 += var35;
									var34 = var83 + (var35 - var78) / 2;
								} else {
									var83 += var78;
								}

								int var86 = var83;
								if (var69 != null) {
									var83 += var69.aw_fld;
								}

								int var36 = av.ak(var56);
								int var37 = ab.ag(var56);
								int var38 = var36 + at_fld;
								int var39 = ac_fld + var37;
								int var40 = du.fy(var58, -32809735) - var7;
								int var41 = var60.am_fld - var60.am_fld * var40 / var60.ax_fld;
								int var42 = -var60.ad_fld + var40 * var60.ad_fld / var60.ax_fld;
								int var43 = var38 + var3 - (var83 >> 1) + var41;
								int var44 = var42 + (var39 + var4 - 12);
								int var45 = var60.at_fld + 15 + var44;
								int var46 = 255;
								if (var60.ao_fld >= 0) {
									var46 = (var40 << 8) / (var60.ax_fld - var60.ao_fld);
								}

								if (var46 >= 0 && var46 < 255) {
									if (var64 != null) {
										var64.ac(var43 - var64.as_fld, var44, var46);
									}

									if (null != var65) {
										var65.ac(var32 + var43 - var65.as_fld, var44, var46);
									}

									if (var67 != null) {
										for (int var87 = 0; var87 < var82; var87++) {
											var67.ac(var87 * var67.aw_fld + (var33 + var43 - var67.as_fld), var44, var46);
										}
									}

									if (var69 != null) {
										var69.ac(var43 + var86 - var69.as_fld, var44, var46);
									}

									var72.ao(var60.ae(var58.az(-1409959564)), var34 + var43, var45, var60.au_fld, 0, var46);
								} else {
									if (null != var64) {
										var64.ab(var43 - var64.as_fld, var44);
									}

									if (null != var65) {
										var65.ab(var43 + var32 - var65.as_fld, var44);
									}

									if (null != var67) {
										for (int var47 = 0; var47 < var82; var47++) {
											var67.ab(var67.aw_fld * var47 + (var33 + var43 - var67.as_fld), var44);
										}
									}

									if (null != var69) {
										var69.ab(var43 + var86 - var69.as_fld, var44);
									}

									zv.uj(var72, var60.ae(var58.az(-1409959564)), var34 + var43, var45, var60.au_fld | 0xFF000000, 0);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;IIIIII)V"
	)
	static void ac(dx var0, da var1, int var2, int var3, int var4, int var5, int var6, int var7) throws EOFException {
		if (var1 != null && var1.bm(272806700)) {
			if (var1 instanceof ds) {
				pp var8 = ((ds)var1).ah_fld;
				if (null != var8.dy_fld) {
					var8 = var8.ar((byte)6);
				}

				if (null == var8) {
					return;
				}
			}

			di var48 = client.db_fld;
			zf var9 = cu.dl_fld;
			zf var10 = ls.dd_fld;
			int var11 = -538582287 * client.ka_fld;
			ku var12 = client.le_fld;
			int var13 = client.db_fld.al_fld;
			int[] var14 = var48.az_fld;
			boolean var15 = var2 < var13;
			int var16 = -971421728;
			if (var1.cx_fld != null && (!var15 || !var1.cp_fld && (var11 == 4 || !var1.cs_fld && (var11 == 0 || var11 == 3 || var11 == 1 && ((cv)var1).as((byte)0))))) {
				nn.ay(var0, var1, var1.ep(552372424));
				if (at_fld > -1 && af_fld < al_fld) {
					aa_fld[af_fld * -500676254] = var9.an(var1.cx_fld) / 2;
					an_fld[af_fld * -421493696] = var9.ap_fld;
					au_fld[af_fld] = at_fld;
					ax_fld[af_fld] = ac_fld - var16;
					ai_fld[af_fld] = var1.cn_fld;
					aq_fld[af_fld * -2009786246] = var1.cr_fld;
					ad_fld[-1439617509 * af_fld] = -1471560630 * var1.ce_fld;
					am_fld[af_fld * -1759656613] = var1.ca_fld;
					ao_fld[380587636 * af_fld] = var1.cx_fld;
					af_fld++;
					var16 += 12;
				}
			}

			rg var17 = client.da_fld.ay(var1.bl_fld, (byte)-98);
			if (var17 == null || !var17.av(-603402508)) {
				if (!var1.bk_fld.bi()) {
					nn.ay(var0, var1, var1.ep(402223989) + 15);

					for (cr var18 = (cr)var1.bk_fld.ah(); null != var18; var18 = (cr)var1.bk_fld.ay()) {
						cp var19 = var18.ag(var7);
						if (var19 != null) {
							pa var20 = var18.az_fld;
							yv var21 = var20.av(1044581730);
							yv var22 = var20.ae(4199278);
							int var24 = 0;
							int var23;
							if (var21 != null && var22 != null) {
								if (var20.aa_fld < var22.aw_fld) {
									var24 = var20.aa_fld;
								}

								var23 = var22.aw_fld - 2 * var24;
							} else {
								var23 = -1276007848 * var20.an_fld;
							}

							int var25 = 255;
							byte var26 = -1;
							int var27 = var7 - var19.ak_fld;
							int var28 = var19.az_fld * var23 / var20.an_fld;
							int var70;
							if (var19.av_fld > var27) {
								int var29 = 0 == var20.af_fld ? 0 : var27 / var20.af_fld * var20.af_fld;
								int var30 = var19.ag_fld * var23 / var20.an_fld;
								var70 = var30 + (var28 - var30) * var29 / var19.av_fld;
							} else {
								var70 = var28;
								int var75 = var19.av_fld + var20.al_fld - var27;
								if (var20.ar_fld >= 0) {
									var25 = (var75 << 8) / (var20.al_fld - var20.ar_fld);
								}
							}

							if (var19.az_fld > 0 && var70 < 1) {
								var70 = 1;
							}

							if (var21 != null && null != var22) {
								if (var23 == var70) {
									var70 += var24 * 2;
								} else {
									var70 += var24;
								}

								int var77 = var21.ay_fld;
								var16 += var77;
								int var80 = var3 + at_fld - (var23 >> 1);
								int var31 = var4 + ac_fld - var16;
								var80 -= var24;
								if (var25 >= 0 && var25 < 255) {
									var21.ac(var80, var31, var25);
									yu.dw(var80, var31, var70 + var80, var31 + var77);
									var22.ac(var80, var31, var25);
								} else {
									var21.ab(var80, var31);
									yu.dw(var80, var31, var80 + var70, var31 + var77);
									var22.ab(var80, var31);
								}

								yu.dg(var3, var4, var5 + var3, var6 + var4);
								var16 += 2;
							} else {
								var16 += 5;
								if (at_fld > -1) {
									int var76 = at_fld + var3 - (var23 >> 1);
									int var79 = ac_fld + var4 - var16;
									yu.dj(var76, var79, var70, 5, 65280);
									yu.dj(var70 + var76, var79, var23 - var70, 5, 16711680);
								}

								var16 += 2;
							}
						} else if (var18.az()) {
							var18.gy_void();
						}
					}
				}

				if (var16 == -1617076388) {
					var16 += 7;
				}

				if (var15 && var7 == var1.bs_fld && ea.dh((cv)var1)) {
					cv var53 = (cv)var1;
					if (var15) {
						nn.ay(var0, var1, var1.ep(538776751) + 15);
						var16 += 4;
						var10.ap(var53.az_fld.ak(425833131), at_fld + var3, ac_fld + var4 - var16, 16777215, 0);
						var16 += 18;
					}
				}

				if (var15) {
					cv var54 = (cv)var1;
					if (var54.at_fld) {
						return;
					}

					if (var54.ae_fld != -1 || -1 != var54.ah_fld) {
						nn.ay(var0, var1, var1.ep(39650140) + 15);
						if (at_fld > -1) {
							if (-1 != var54.ae_fld) {
								var16 += 25;
								ay_fld[-731485712 * var54.ae_fld].ab(at_fld + var3 - 12, var4 + ac_fld - var16);
							}

							if (-1 != var54.ah_fld) {
								var16 += 25;
								as_fld[407700955 * var54.ah_fld].ab(var3 + at_fld - 12, ac_fld + var4 - var16);
							}
						}
					}

					if (var2 >= 0 && ku.id(var12, 1088102925) == 3 && ku.og(var12, 205903255) == var14[var2]) {
						nn.ay(var0, var1, var1.ep(1901640315) + 15);
						if (at_fld > -1) {
							var16 += do_.ar_fld[1].ay_fld;
							do_.ar_fld[1].ab(var3 + at_fld - 12, ac_fld + var4 - var16);
						}
					}
				} else {
					ds var55 = (ds)var1;
					int[] var57 = var55.af(-82780912);
					short[] var59 = ds.lu(var55, 353207536);
					if (null != var59 && null != var57) {
						for (int var61 = 0; var61 < var59.length; var61++) {
							if (var59[var61] >= 0 && var57[var61] >= 0) {
								long var63 = (long)var57[var61] << 8 | var59[var61];
								yv var66 = (yv)(yv)ap_fld.ag(var63);
								if (var66 == null) {
									yv[] var68 = km.az(gz.hy_fld, var57[var61], 0);
									if (var68 != null && var59[var61] < var68.length) {
										var66 = var68[var59[var61]];
										ap_fld.az(var63, var66);
									}
								}

								if (null != var66) {
									nn.ay(var0, var1, var1.ep(1436384365) + 15);
									if (at_fld > -1) {
										var66.ab(at_fld + var3 - (var66.aw_fld >> 1), (var4 - var66.ay_fld - 2) * (1 + var61) - var66.ay_fld + ac_fld - 4);
									}
								}
							}
						}
					}

					if (ku.id(var12, -1357893883) == 1 && ku.og(var12, 205903255) == var0.ad_fld.ag(var2 - var13) && var7 % 20 < 10) {
						nn.ay(var0, var1, var1.ep(-1939933042) + 15);
						if (at_fld > -1) {
							do_.ar_fld[0].ab(var3 + at_fld - 12, var4 + ac_fld - 28);
						}
					}
				}

				if (!var1.bh_fld.isEmpty()) {
					nn.ay(var0, var1, var1.ep(-1231318042) / 2);

					for (int var56 = 0; var56 < var1.bh_fld.size(); var56++) {
						du var58 = (du)(du)var1.bh_fld.get(var56);
						if (du.fy(var58, -32809735) > var7) {
							py var60 = gf.ak(var58.ag((byte)46));
							if (null != var60.ac_fld) {
								var60 = py.cj(var60, (byte)84);
								if (null == var60) {
									continue;
								}
							}

							if (du.fy(var58, -32809735) - var60.ax_fld <= var7) {
								byte var62 = 2;
								yv var64 = py.ib(var60, -2045135637);
								yv var65 = var60.ay();
								yv var67 = var60.aw();
								yv var69 = var60.as();
								zf var72 = var60.ar();
								if (var72 == null) {
									var72 = ej.do_fld;
								}

								int var73 = var58.az(-1409959564);
								String var74 = var60.ae(var73);
								int var78 = var72.an(var74);
								int var82 = 0;
								if (null != var67) {
									if (null == var65 && var69 == null) {
										var82 = 1;
									} else {
										var82 = var78 / var67.aw_fld + 1;
									}
								}

								int var83 = 0;
								if (var64 != null) {
									var83 = var64.aw_fld;
								}

								var83 += 2;
								int var32 = var83;
								if (var65 != null) {
									var83 += var65.aw_fld;
								}

								int var33 = var83;
								int var34 = var83;
								if (null != var67) {
									int var35 = var67.aw_fld * var82;
									var83 += var35;
									var34 = var83 + (var35 - var78) / 2;
								} else {
									var83 += var78;
								}

								int var86 = var83;
								if (var69 != null) {
									var83 += var69.aw_fld;
								}

								int var36 = av.ak(var56);
								int var37 = ab.ag(var56);
								int var38 = var36 + at_fld;
								int var39 = ac_fld + var37;
								int var40 = du.fy(var58, -32809735) - var7;
								int var41 = var60.am_fld - var60.am_fld * var40 / var60.ax_fld;
								int var42 = -var60.ad_fld + var40 * var60.ad_fld / var60.ax_fld;
								int var43 = var38 + var3 - (var83 >> 1) + var41;
								int var44 = var42 + (var39 + var4 - 12);
								int var45 = var60.at_fld + 15 + var44;
								int var46 = -1488201691;
								if (var60.ao_fld >= 0) {
									var46 = (var40 << 8) / (var60.ax_fld - var60.ao_fld);
								}

								if (var46 >= 0 && var46 < 255) {
									if (var64 != null) {
										var64.ac(var43 - var64.as_fld, var44, var46);
									}

									if (null != var65) {
										var65.ac(var32 + var43 - var65.as_fld, var44, var46);
									}

									if (var67 != null) {
										for (int var87 = 0; var87 < var82; var87++) {
											var67.ac(var87 * var67.aw_fld + (var33 + var43 - var67.as_fld), var44, var46);
										}
									}

									if (var69 != null) {
										var69.ac(var43 + var86 - var69.as_fld, var44, var46);
									}

									var72.ao(var60.ae(var58.az(-1409959564)), var34 + var43, var45, 1980495154 * var60.au_fld, 0, var46);
								} else {
									if (null != var64) {
										var64.ab(var43 - var64.as_fld, var44);
									}

									if (null != var65) {
										var65.ab(var43 + var32 - var65.as_fld, var44);
									}

									if (null != var67) {
										for (int var47 = 0; var47 < var82; var47++) {
											var67.ab(var67.aw_fld * var47 + (var33 + var43 - var67.as_fld), var44);
										}
									}

									if (null != var69) {
										var69.ab(var43 + var86 - var69.as_fld, var44);
									}

									zv.uj(var72, var60.ae(var58.az(-1409959564)), var34 + var43, var45, var60.au_fld | 0xFF000000, 0);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V"
	)
	static void ao(dx var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		di var6 = client.db_fld;
		int var7 = client.nq_fld;
		int var8 = client.dj_fld;
		int var9 = var6.al_fld;
		int[] var10 = var6.az_fld;

		for (int var11 = 0; var11 < var9 + var0.ad_fld.az(); var11++) {
			da var12;
			if (var11 < var9) {
				var12 = (da)var0.au_fld.ak(var10[var11]);
				if (var7 == var10[var11] || var10[var11] == var8) {
					continue;
				}
			} else {
				var12 = (da)var0.ax_fld.ak(var0.ad_fld.ag(var11 - var9));
			}

			ds.aw(var0, var12, var11, var1, var2, var3, var4, var5, (byte)73);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;I)V"
	)
	static void bm(dx var0, da var1, int var2) throws EOFException {
		id.as(var0, var1.bo_fld, var1.bp_fld, var2, var1.br((byte)122), 331659987);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIII)V"
	)
	static void ad(dx var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		di var6 = client.db_fld;
		int var7 = client.nq_fld * -194007995;
		int var8 = -1045234498 * client.dj_fld;
		int var9 = var6.al_fld;
		int[] var10 = var6.az_fld;

		for (int var11 = 0; var11 < var9 + var0.ad_fld.az(); var11++) {
			da var12;
			if (var11 < var9) {
				var12 = (da)var0.au_fld.ak(var10[var11]);
				if (var7 == var10[var11] || var10[var11] == var8) {
					continue;
				}
			} else {
				var12 = (da)var0.ax_fld.ak(var0.ad_fld.ag(var11 - var9));
			}

			ds.aw(var0, var12, var11, var1, var2, var3, var4, var5, (byte)10);
		}
	}

	ch() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Lyv;)V"
	)
	static void al(yv[] var0) {
		as_fld = var0;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)V"
	)
	static void be(dx var0, int var1, int var2, int var3, int var4) throws EOFException {
		int var5 = var1;
		int var6 = var2;
		int var7 = gl.dt(var0, var1, var2, var0.ae_fld, var4) - var3;
		if (!var0.ak(-787091592)) {
			rg var8 = (rg)bw.dk_fld.an_fld.ak(var0.ag_fld);
			if (var8 != null) {
				tu var9 = mf.bn(var0, var1, var2);
				var5 = (int)var9.ay_fld;
				var6 = (int)var9.ar_fld;
				var7 += jf.dv(bw.dk_fld, var8.dp(483976843), var8.dj(189745805), bw.dk_fld.ae_fld);
				var9.ah();
			}
		}

		short var11 = 128;
		short var12 = 128;
		int var13 = kj.aw(bw.dk_fld.ah_fld - 2);
		int var14 = kj.aw(bw.dk_fld.aw_fld - 2);
		if (var5 >= var11 && var13 >= var5 && var6 >= var12 && var14 >= var6) {
			int var20 = var5 - ke.jd_fld;
			int var10 = var7 - cs.jy_fld;
			int var22 = var6 - gk.jc_fld;
			int var15 = fc.ah_fld[hu.je_fld];
			int var16 = fc.aw_fld[hu.je_fld];
			int var17 = fc.ah_fld[ab.jx_fld];
			int var18 = fc.aw_fld[ab.jx_fld];
			int var19 = var18 * var20 + var17 * var22 >> 16;
			var22 = var18 * var22 - var17 * var20 >> 16;
			var19 = var16 * var10 - var22 * var15 >> 16;
			var22 = var22 * var16 + var10 * var15 >> 16;
			if (var22 >= 50) {
				at_fld = var19 * client.fd_fld / var22 + client.fn_fld / 2;
				ac_fld = client.ft_fld / 2 + var19 * client.fd_fld / var22;
			} else {
				at_fld = -143277501;
				ac_fld = -1067093745;
			}
		} else {
			at_fld = -143277501;
			ac_fld = -1067093745;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	static cn ak() {
		zb var1 = null;
		cn var2 = new cn();

		try {
			var1 = cw.av("", es.gp_fld.aw_fld, false);
			byte[] var3 = new byte[(int)var1.ah()];
			int var4 = 0;

			while (var4 < var3.length) {
				int var5 = zb.fd(var1, var3, var4, var3.length - var4);
				if (var5 == -1) {
					throw new IOException();
				}

				var4 += var5;
			}

			var2 = new cn(new xi(var3));
		} catch (Exception var7) {
		}

		try {
			if (var1 != null) {
				var1.av();
			}
		} catch (Exception var6) {
		}

		return var2;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int bt(int var0, ba var1, boolean var2) throws EOFException {
		if (var0 == 4100) {
			String var37 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var50 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var37 + var50;
			return 1;
		} else if (var0 == 4101) {
			ef.aq_fld -= 2;
			String var36 = (String)bp.ai_fld[ef.aq_fld];
			String var49 = (String)bp.ai_fld[ef.aq_fld + 1];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var36 + var49;
			return 1;
		} else if (var0 == 4102) {
			String var35 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var48 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var35 + is.ay(var48, true);
			return 1;
		} else if (var0 == 4103) {
			String var34 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var34.toLowerCase();
			return 1;
		} else if (4104 == var0) {
			int var33 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			long var47 = (var33 + 11745L) * 86400000L;
			bp.ac_fld.setTime(new Date(var47));
			int var62 = bp.ac_fld.get(5);
			int var66 = bp.ac_fld.get(2);
			int var67 = bp.ac_fld.get(1);
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var62 + "-" + bp.ae_fld[var66] + "-" + var67;
			return 1;
		} else if (var0 == 4105) {
			ef.aq_fld -= 2;
			String var32 = (String)bp.ai_fld[ef.aq_fld];
			String var46 = (String)bp.ai_fld[ef.aq_fld + 1];
			cv var57 = ot.ef();
			if (var57 != null && null != var57.av_fld && 1953147203 * var57.av_fld.ax_fld != 0) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var46;
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var32;
			}

			return 1;
		} else if (4106 == var0) {
			int var31 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = Integer.toString(var31);
			return 1;
		} else if (4107 == var0) {
			ef.aq_fld -= 2;
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bs.aq(ee.ak((String)bp.ai_fld[ef.aq_fld], (String)bp.ai_fld[1 + ef.aq_fld], ku.gi_fld));
			return 1;
		} else if (var0 == 4108) {
			String var30 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var45 = bp.au_fld[gz.ax_fld];
			int var56 = bp.au_fld[1 + gz.ax_fld];
			byte[] var61 = ow.ie_fld.bb(var56, 0, 584982574);
			zf var65 = new zf(var61);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var65.aq(var30, var45);
			return 1;
		} else if (4109 == var0) {
			String var29 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var44 = bp.au_fld[gz.ax_fld];
			int var55 = bp.au_fld[1 + gz.ax_fld];
			byte[] var60 = ow.ie_fld.bb(var55, 0, 584982574);
			zf var64 = new zf(var60);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = zv.cf(var64, var29, var44);
			return 1;
		} else if (var0 == 4110) {
			ef.aq_fld -= 2;
			String var28 = (String)bp.ai_fld[ef.aq_fld];
			String var43 = (String)bp.ai_fld[ef.aq_fld + 1];
			if (bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var28;
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var43;
			}

			return 1;
		} else if (var0 == 4111) {
			String var27 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = zv.ay(var27);
			return 1;
		} else if (4112 == var0) {
			String var26 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var42 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var26 + (char)var42;
			return 1;
		} else if (4113 == var0) {
			int var25 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = md.ai((char)var25) ? 1 : 0;
			return 1;
		} else if (4114 == var0) {
			int var24 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ey.au((char)var24) ? 1 : 0;
			return 1;
		} else if (4115 == var0) {
			int var23 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = eu.af((char)var23) ? 1 : 0;
			return 1;
		} else if (4116 == var0) {
			int var22 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = jw.al((char)var22) ? 1 : 0;
			return 1;
		} else if (4117 == var0) {
			String var21 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			if (null != var21) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var21.length();
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (4118 == var0) {
			String var20 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			gz.ax_fld -= 2;
			int var41 = bp.au_fld[gz.ax_fld];
			int var54 = bp.au_fld[gz.ax_fld + 1];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var20.substring(var41, var54);
			return 1;
		} else if (var0 == 4119) {
			String var19 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			StringBuilder var40 = new StringBuilder(var19.length());
			boolean var53 = false;

			for (int var59 = 0; var59 < var19.length(); var59++) {
				char var63 = var19.charAt(var59);
				if ('<' == var63) {
					var53 = true;
				} else if (var63 == '>') {
					var53 = false;
				} else if (!var53) {
					var40.append(var63);
				}
			}

			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var40.toString();
			return 1;
		} else if (4120 == var0) {
			String var18 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int var39 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var18.indexOf(var39);
			return 1;
		} else if (4121 == var0) {
			ef.aq_fld -= 2;
			String var17 = (String)bp.ai_fld[ef.aq_fld];
			String var38 = (String)bp.ai_fld[ef.aq_fld + 1];
			int var52 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var17.indexOf(var38, var52);
			return 1;
		} else if (4122 == var0) {
			String var16 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var16.toUpperCase();
			return 1;
		} else if (var0 == 4123) {
			ef.aq_fld -= 3;
			String var15 = (String)bp.ai_fld[ef.aq_fld];
			String var5 = (String)bp.ai_fld[ef.aq_fld + 1];
			String var51 = (String)bp.ai_fld[ef.aq_fld + 2];
			cv var58 = ot.ef();
			if (null != var58 && null != var58.av_fld) {
				switch (-753683305 * var58.av_fld.au_fld) {
					case 0:
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var15;
						break;
					case 1:
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var5;
						break;
					case 2:
					default:
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var51;
				}

				return 1;
			} else {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var51;
				return 1;
			}
		} else if (var0 == 4124) {
			cv var14 = ot.ef();
			if (null != var14 && var14.av_fld != null) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -753683305 * var14.av_fld.au_fld;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		} else if (var0 == 4125) {
			long var13 = bp.an_fld[(db.aa_fld -= 432101741) * 867932261];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = Long.toString(var13);
			return 1;
		} else if (var0 != 4126) {
			return 2;
		} else {
			long var4 = bp.an_fld[(db.aa_fld -= 432101741) * 867932261];
			String var6 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			String var7;
			if (0L == var4) {
				var7 = "0";
			} else if (!var6.isEmpty()) {
				boolean var8 = var4 < 0L;
				long var9 = var8 ? -var4 : var4;
				StringBuilder var11 = new StringBuilder();

				for (int var12 = 1; var9 > 0L; var12++) {
					var11.insert(0, var9 % 10L);
					var9 /= 10L;
					if (var9 > 0L && var12 % 3 == 0) {
						var11.insert(0, ",");
					}
				}

				if (var8) {
					var11.insert(0, '-');
				}

				var7 = var11.toString();
			} else {
				var7 = Long.toString(var4);
			}

			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var7;
			return 1;
		}
	}
}
