import java.awt.Rectangle;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.widgets.WidgetUtil;

@ObfuscatedName("gc")
public class gc {
	// $VF: synthetic field
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean uw_fld = !gc.class.desiredAssertionStatus();
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	jd az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	ja ag_fld;
	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	public static List zo_fld = new ArrayList();
	@ObfuscatedGetter(
		intValue = 1206983871
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = -351816847
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	ff ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	gg ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	go aw_fld = new go();
	@ObfuscatedGetter(
		intValue = -1339188605
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	jo av_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Llu;"
	)
	lu[] ar_fld;
	@ObfuscatedGetter(
		intValue = 291948049
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bh_fld;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ce_fld;
	@ObfuscatedName("zf")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/List;"
	)
	public static List zf_fld = new ArrayList();
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cc_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;II)V"
	)
	void az(lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13, int var14) throws EOFException {
		this.gw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
		yu.dg(var6, var7, var8, var9);
		fc.ai();

		for (int var15 = var2; var15 <= var3; var15++) {
			lu var16 = var1[var15];
			if (null == var16) {
				if (var14 >= 95947698) {
					this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
					return;
				}
			} else {
				if (var4 != var16.cv_fld || var5 != var16.cy_fld) {
					if (var4 != -1412584499) {
						continue;
					}

					if (var14 >= 95947698) {
						this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
						return;
					}

					if (var16 != var12.bd()) {
						continue;
					}
				}

				if (!var16.bj_fld || !var12.am(var16)) {
					if (var16.bp_fld > 0) {
						this.av(var16, var13, (byte)1);
					}

					int var17 = var10 + var16.bq_fld;
					int var18 = var16.bg_fld + var11;
					int var19 = var16.cb_fld;
					if (var12.bd() == var16) {
						uk var20 = var12.bm();
						if (var4 != -1412584499 && !var16.em_fld) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							this.ar_fld = var1;
							this.af_fld = var10;
							this.al_fld = var11;
							continue;
						}

						if (var20.ap() && var20.ao()) {
							int var21 = uk.yq(var20, 1045554451);
							int var22 = uk.kq(var20, -79080406);
							int var23 = uk.dz(var20, -1094587272).bb_fld * -1223437005;
							int var24 = uk.dz(var20, -1094587272).cd_fld * 124430729;
							int var25 = tj.ae_fld;
							int var26 = tj.ah_fld;
							var25 -= var20.al();
							var26 -= var20.au();
							if (var25 < var21) {
								var25 = var21;
							}

							if (var25 + var16.bb_fld > var21 + var23) {
								var25 = var21 + var23 - var16.bb_fld;
							}

							if (var26 < var22) {
								if (var14 >= 95947698) {
									this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
									return;
								}

								var26 = var22;
							}

							if (var16.cd_fld + var26 > var22 + var24) {
								var26 = var24 + var22 - var16.cd_fld;
							}

							var17 = var25;
							var18 = var26;
						}

						if (!var16.em_fld) {
							var19 = 128;
						}
					}

					int var34;
					int var35;
					int var36;
					int var37;
					if (var16.bx_fld == 9) {
						int var38 = var17;
						int var50 = var18;
						int var60 = var17 + var16.bb_fld;
						int var27 = var18 + var16.cd_fld;
						if (var60 < var17) {
							var38 = var60;
							var60 = var17;
						}

						if (var27 < var18) {
							var50 = var27;
							var27 = var18;
						}

						var60++;
						var27++;
						var34 = var38 > var6 ? var38 : var6;
						var35 = var50 > var7 ? var50 : var7;
						var36 = var60 < var8 ? var60 : var8;
						int var10000;
						if (var27 < var9) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							var10000 = var27;
						} else {
							var10000 = var9;
						}

						var37 = var10000;
					} else {
						int var39 = var16.bb_fld + var17;
						int var51 = var16.cd_fld + var18;
						var34 = var17 > var6 ? var17 : var6;
						var35 = var18 > var7 ? var18 : var7;
						var36 = var39 < var8 ? var39 : var8;
						int var91;
						if (var51 < var9) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							var91 = var51;
						} else {
							var91 = var9;
						}

						var37 = var91;
					}

					if (var16.bj_fld) {
						if (var14 >= 95947698) {
							this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
							return;
						}

						if (var34 >= var36) {
							continue;
						}

						if (var14 >= 95947698) {
							this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
							return;
						}

						if (var35 >= var37) {
							continue;
						}
					}

					if (0 != var16.bp_fld) {
						if (var14 >= 95947698) {
							this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
							return;
						}

						if (1336 == var16.bp_fld) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							this.ah(var17, var18, var16.bb_fld);
							continue;
						}

						if (var16.bp_fld == 1337) {
							this.ah_fld.ak(var17, var18, var16.bb_fld, var16.cd_fld, -1208787945);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (1338 == var16.bp_fld) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							this.ah_fld.ag(var16, var17, var18, 1096810380);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (1339 == var16.bp_fld) {
							this.ae(var16, var17, var18, var12);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (1400 == var16.bp_fld) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							this.ah_fld.az(var17, var18, var16.bb_fld, var16.cd_fld, var13, cn.db(this.ag_fld.ah(1939133209), -1708420678));
						}

						if (var16.bp_fld == 1401) {
							this.ah_fld.av(var17, var18, var16.bb_fld, var16.cd_fld, 1099094645);
						}

						if (var16.bp_fld == 1402) {
							this.ah_fld.ae(var17, var13, (byte)-101);
						}
					}

					if (0 == var16.bx_fld) {
						if (var14 >= 95947698) {
							this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
							return;
						}

						if (!var16.bj_fld && var12.am(var16)) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							if (!var12.ai().ag(var16)) {
								continue;
							}
						}

						if (!var16.bj_fld) {
							if (var16.ce_fld > var16.cr_fld - var16.cd_fld) {
								var16.ce_fld = var16.cr_fld - var16.cd_fld;
							}

							if (var16.ce_fld < 0) {
								if (var14 >= 95947698) {
									this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
									return;
								}

								var16.ce_fld = 0;
							}
						}

						this.az(
							var1,
							var16.cx_fld,
							var16.cs_fld,
							var16.bf_fld,
							var16.by_fld,
							var34,
							var35,
							var36,
							var37,
							var17 - var16.cp_fld,
							var18 - var16.ce_fld,
							var12,
							var13,
							-1046481876
						);
						if (var16.ge_fld != null) {
							this.az(
								var16.ge_fld,
								0,
								var16.ge_fld.length - 1,
								var16.bf_fld,
								-1,
								var34,
								var35,
								var36,
								var37,
								var17 - var16.cp_fld,
								var18 - var16.ce_fld,
								var12,
								var13,
								-1308901615
							);
						}

						if (var16.by_fld == -1) {
							pk var40 = (pk)var12.ai_fld.ak(var16.bf_fld);
							if (null != var40) {
								aj(this, var40.ak_fld, var34, var35, var36, var37, var17, var18, var12, var13, 883816832);
							}
						}

						yu.dg(var6, var7, var8, var9);
						fc.ai();
					} else if (11 == var16.bx_fld) {
						if (var12.am(var16) && !var12.ai().ag(var16)) {
							continue;
						}

						if (var16.ge_fld != null) {
							this.az(
								var16.ge_fld,
								0,
								var16.ge_fld.length - 1,
								var16.bf_fld,
								-1,
								var34,
								var35,
								var36,
								var37,
								var17 - var16.cp_fld,
								var18 - var16.ce_fld,
								var12,
								var13,
								-1061961330
							);
						}

						yu.dg(var6, var7, var8, var9);
						fc.ai();
					}

					if (var16.bx_fld == 0) {
						if (var14 >= 95947698) {
							this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
							return;
						}

						if (!var16.bj_fld && var16.cr_fld > var16.cd_fld) {
							nt(this, var16.bb_fld + var17, var18, var16.ce_fld, var16.cd_fld, var16.cr_fld);
						}
					}

					if (var16.bx_fld == 1) {
						if (var14 >= 95947698) {
							this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
							return;
						}
					} else if (var16.bx_fld == 3) {
						if (var14 >= 95947698) {
							this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
							return;
						}

						int var48;
						if (this.ar(var16, -918091783)) {
							var48 = var16.cg_fld;
							if (var12.ai().ag(var16) && 0 != var16.cm_fld) {
								if (var14 >= 95947698) {
									this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
									return;
								}

								var48 = var16.cm_fld;
							}
						} else {
							var48 = var16.ca_fld;
							if (var12.ai().ag(var16)) {
								if (var14 >= 95947698) {
									this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
									return;
								}

								if (0 != var16.cw_fld) {
									var48 = var16.cw_fld;
								}
							}
						}

						if (var16.cz_fld) {
							switch (-79906945 * var16.ck_fld.av_fld) {
								case 1:
									yu.es(var17, var18, var16.bb_fld, var16.cd_fld, var16.ca_fld, var16.cg_fld);
									break;
								case 2:
									yu.ep(var17, var18, var16.bb_fld, var16.cd_fld, var16.ca_fld, var16.cg_fld, 255 - (var16.cb_fld & 0xFF), 255 - (var16.co_fld & 0xFF));
									break;
								default:
									if (0 == var19) {
										yu.dj(var17, var18, var16.bb_fld, var16.cd_fld, var48);
									} else {
										yu.dp(var17, var18, var16.bb_fld, var16.cd_fld, var48, 256 - (var19 & 0xFF));
									}
							}
						} else if (0 == var19) {
							yu.ed(var17, var18, var16.bb_fld, var16.cd_fld, var48);
						} else {
							yu.et(var17, var18, var16.bb_fld, var16.cd_fld, var48, 256 - (var19 & 0xFF));
						}
					} else if (4 == var16.bx_fld) {
						zf var47 = lu.dg(var16, var12, (byte)-81);
						if (var47 != null) {
							String var68 = var16.dp_fld;
							int var58;
							if (this.ar(var16, 1199326574)) {
								var58 = var16.cg_fld;
								if (var12.ai().ag(var16) && 0 != var16.cm_fld) {
									var58 = var16.cm_fld;
								}

								if (!var16.dj_fld.isEmpty()) {
									var68 = var16.dj_fld;
								}
							} else {
								var58 = var16.ca_fld;
								if (var12.ai().ag(var16) && var16.cw_fld != 0) {
									var58 = var16.cw_fld;
								}
							}

							if (var16.bj_fld && -1 != var16.ga_fld) {
								og var76 = kb.ag(var16.ga_fld, -1752383175);
								var68 = var76.dx_fld;
								if (var68 == null) {
									var68 = kh.aj_fld;
								}

								if ((var76.dj_fld == 1 || var16.gd_fld != 1) && -1 != var16.gd_fld) {
									var68 = gd.ag(16748608, -1940547058) + var68 + db.ay_fld + " " + 'x' + lu.as(var16.gd_fld);
								}
							}

							if (uo.wp(var12, var16, -1978074686)) {
								var68 = kh.hn_fld;
								var58 = var16.ca_fld;
							}

							if (!var16.bj_fld) {
								var68 = this.ay(var68, var16);
							}

							var47.ac(var68, var17, var18, var16.bb_fld, var16.cd_fld, var58, var16.ed_fld ? 0 : -1, ue.ae(var16.cb_fld), var16.ep_fld, var16.eb_fld, var16.es_fld);
						}
					} else if (var16.bx_fld == 5) {
						if (!var16.bj_fld) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							yv var46 = lu.ef(var16, var12, this.ar(var16, -162730403), this.ag_fld.az(-1937754236), -423043034);
							if (null != var46) {
								var46.ab(var17, var18);
							}
						} else {
							yv var45;
							if (var16.ga_fld != -1) {
								var45 = ud.az(var16.ga_fld, var16.gd_fld, var16.dh_fld, var16.dv_fld, var16.df_fld, false, Math.max(36, var16.bb_fld), Math.max(32, var16.cd_fld));
							} else {
								var45 = lu.ef(var16, var12, false, this.ag_fld.az(-1439416521), -423043034);
							}

							if (null != var45) {
								if (var14 >= 95947698) {
									this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
									return;
								}

								int var57 = var45.ad_fld;
								int var67 = var45.ao_fld;
								if (!var16.dc_fld) {
									int var75 = var16.bb_fld / var57;
									if (0 != var16.cl_fld) {
										var45.in(var17 + var16.bb_fld / 2, var16.cd_fld / 2 + var18, var16.cl_fld, var75);
									} else if (0 != var19) {
										var45.aj(var17, var18, var16.bb_fld, var16.cd_fld, 256 - (var19 & 0xFF));
									} else if (var16.bb_fld == var57 && var67 == var16.cd_fld) {
										var45.ab(var17, var18);
									} else {
										yv.an(var45, var17, var18, var16.bb_fld, var16.cd_fld);
									}
								} else {
									yu.dw(var17, var18, var16.bb_fld + var17, var18 + var16.cd_fld);
									int var74 = (var57 - 1 + var16.bb_fld) / var57;
									int var82 = (var67 - 1 + var16.cd_fld) / var67;

									for (int var85 = 0; var85 < var74; var85++) {
										for (int var88 = 0; var88 < var82; var88++) {
											if (0 != var16.cl_fld) {
												var45.in(var85 * var57 + var17 + var57 / 2, var67 / 2 + var18 + var67 * var88, var16.cl_fld, 4096);
											} else if (var19 != 0) {
												var45.ac(var57 * var85 + var17, var88 * var67 + var18, 256 - (var19 & 0xFF));
											} else {
												var45.ab(var57 * var85 + var17, var67 * var88 + var18);
											}
										}
									}

									yu.dg(var6, var7, var8, var9);
								}
							}
						}
					} else if (var16.bx_fld == 6) {
						if (var14 >= 95947698) {
							this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
							return;
						}

						ol var44 = null;
						int var56 = -1;
						boolean var66 = this.ar(var16, -1174297123);
						int var73;
						if (var66) {
							var73 = var16.dr_fld;
						} else {
							var73 = var16.dl_fld;
						}

						if (var73 != -1) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							var44 = hm.ak(var73);
							var56 = var16.gy_fld;
						}

						fn var80 = null;
						int var84 = 0;
						if (var16.ga_fld != -1) {
							var80 = this.ae_fld.ak(var16, -587650022);
							if (null != var80) {
								var80.eu();
								var84 = var80.ez_fld / 2;
							}
						} else if (5 == var16.dm_fld) {
							var80 = this.ae_fld.ag(var16, 2078151528);
						} else if (var16.dm_fld == 7) {
							var80 = this.ae_fld.az(var16, 1188315573);
						} else if (8 == var16.dm_fld) {
							var80 = this.ae_fld.av(var16, var44, var56, 406371674);
						} else if (var16.dm_fld == 9) {
							var80 = this.ae_fld.ae(var16, var44, var56, -1652518394);
						} else if (var16.dm_fld == 6) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							var80 = this.ae_fld.ah(var16, var44, var56, var66, 45159315);
						} else if (var16.dm_fld == 2) {
							var80 = this.ae_fld.aw(var16, var44, var56, var66, (byte)0);
						} else {
							var80 = this.ae_fld.ay(var16, var44, var56, var66, -195877758);
						}

						fc.ad(var17 + var16.bb_fld / 2, var16.cd_fld / 2 + var18);
						int var87 = fc.ah_fld[var16.dx_fld] * var16.db_fld >> 16;
						int var90 = fc.aw_fld[var16.dx_fld] * var16.db_fld >> 16;
						if (null != var80) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							fc.ak(false);
							if (!var16.bj_fld) {
								var80.bv(0, var16.ds_fld, 0, var16.dx_fld, 0, var87, var90);
							} else {
								var80.eu();
								if (var16.di_fld) {
									if (var14 >= 95947698) {
										this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
										return;
									}

									var80.bi(0, var16.ds_fld, var16.du_fld, var16.dx_fld, var16.da_fld, var16.dk_fld + var84 + var87, var16.dk_fld + var90, var16.db_fld);
								} else {
									var80.bv(0, var16.ds_fld, var16.du_fld, var16.dx_fld, var16.da_fld, var16.dk_fld + var84 + var87, var90 + var16.dk_fld);
								}
							}
						}

						fc.am();
					} else if (var16.bx_fld == 8) {
						if (ui.in(var12.ai(), var16, (byte)120)) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							zf var43 = this.av_fld.ak(xy.ag_fld, (byte)2);
							int var54 = 0;
							int var64 = 0;
							zf var72 = var43;
							String var28 = var16.dp_fld;

							for (String var77 = this.ay(var28, var16); !var77.isEmpty(); var64 += var72.ap_fld + 1) {
								int var30 = var77.indexOf(db.aw_fld);
								String var29;
								if (var30 != -1) {
									var29 = var77.substring(0, var30);
									var77 = var77.substring(var30 + 4);
								} else {
									var29 = var77;
									var77 = "";
								}

								int var31 = var72.an(var29);
								if (var31 > var54) {
									var54 = var31;
								}
							}

							var54 += 6;
							var64 += 7;
							int var86 = var16.bb_fld + var17 - 5 - var54;
							int var89 = 5 + var18 + var16.cd_fld;
							if (var86 < 5 + var17) {
								var86 = 5 + var17;
							}

							if (var86 + var54 > var8) {
								if (var14 >= 95947698) {
									this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
									return;
								}

								var86 = var8 - var54;
							}

							if (var64 + var89 > var9) {
								var89 = var9 - var64;
							}

							yu.dj(var86, var89, var54, var64, 16777120);
							yu.ed(var86, var89, var54, var64, 0);
							var28 = var16.dp_fld;
							int var32 = 2 + var72.ap_fld + var89;

							for (String var79 = this.ay(var28, var16); !var79.isEmpty(); var32 += var72.ap_fld + 1) {
								int var33 = var79.indexOf(db.aw_fld);
								String var83;
								if (var33 != -1) {
									var83 = var79.substring(0, var33);
									var79 = var79.substring(var33 + 4);
								} else {
									var83 = var79;
									var79 = "";
								}

								zv.uj(var72, var83, var86 + 3, var32, 0, -1);
							}
						}
					} else if (var16.bx_fld == 9) {
						int var42;
						int var53;
						int var63;
						int var71;
						if (var16.ci_fld) {
							var42 = var17;
							var53 = var18 + var16.cd_fld;
							var63 = var16.bb_fld + var17;
							var71 = var18;
						} else {
							var42 = var17;
							var53 = var18;
							var63 = var16.bb_fld + var17;
							var71 = var16.cd_fld + var18;
						}

						if (var16.cu_fld == 1) {
							if (var14 >= 95947698) {
								this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
								return;
							}

							yu.ez(var42, var53, var63, var71, var16.ca_fld);
						} else {
							yu.ef(var42, var53, var63, var71, var16.cu_fld, var16.ca_fld);
						}
					} else if (var16.bx_fld == 12) {
						li var41 = lu.bv(var16, -856077719);
						ln var52 = var16.bi(1206336948);
						if (null != var41 && null != var52 && var41.cq()) {
							zf var62 = lu.dg(var16, var12, (byte)-24);
							if (null != var62) {
								label854: {
									this.aw_fld.ak(var17, var18, var16.bb_fld, var16.cd_fld, var41.cv(), var41.cy(), li.dg(var41, (byte)41), var41.cc(), var41.bb());
									int var70 = var16.ed_fld ? var16.dv_fld : -1;
									if (!li.vk(var41, (byte)91)) {
										if (var14 >= 95947698) {
											this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
											return;
										}

										if (var41.bc().az(1939769251)) {
											if (var14 >= 95947698) {
												this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
												return;
											}

											this.aw_fld.ag(var52.az_fld, var70, var52.ak_fld, var52.ag_fld, 655180396);
											this.aw_fld.az(var41.bw(), var62, (byte)77);
											break label854;
										}
									}

									this.aw_fld.ag(var16.ca_fld, var70, var52.ak_fld, var52.ag_fld, 1504158713);
									this.aw_fld.az(var41.bc(), var62, (byte)77);
								}

								yu.dg(var6, var7, var8, var9);
							}
						}
					}
				}
			}
		}

		this.mr(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(Lgc;Llu;I)V"
	)
	public static void pk(gc var0, lu var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var1.bp_fld;
		if (var3 == 324) {
			if (-1 == var0.ay_fld) {
				var0.ay_fld = var1.cj_fld;
				var0.as_fld = -32410905 * var1.ch_fld;
			}

			if (var0.az_fld.ay((byte)0) == 1) {
				var1.cj_fld = var0.ay_fld;
			} else {
				var1.cj_fld = var0.as_fld;
			}
		} else if (325 == var3) {
			if (-1 == var0.ay_fld) {
				var0.ay_fld = var1.cj_fld;
				var0.as_fld = var1.ch_fld * -32410905;
			}

			if (var0.az_fld.ay((byte)0) == 1) {
				var1.cj_fld = var0.as_fld;
			} else {
				var1.cj_fld = var0.ay_fld;
			}
		} else if (327 == var3) {
			var1.dx_fld = 284116746;
			var1.ds_fld = (int)(Math.sin(var2 / 40.0) * 256.0) & 2047;
			var1.dm_fld = -414194673;
			var1.dq_fld = 0;
		} else if (328 == var3) {
			var1.dx_fld = 284116746;
			var1.ds_fld = (int)(Math.sin(var2 / 40.0) * 256.0) & 2047;
			var1.dm_fld = -414194673;
			var1.dq_fld = 340962923;
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int cp(int var0, ba var1, boolean var2) {
		if (7900 == var0) {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			client.gj_fld = Math.max(var4, 0);
			return 1;
		} else if (var0 == 7901) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.gj_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Llu;IILuo;)V"
	)
	void ae(lu var1, int var2, int var3, uo var4) throws EOFException {
		kp var6 = var1.aa(var4, false, 15790320);
		if (var6 != null) {
			if (this.az_fld.az(-2007526119)) {
				this.av_fld.az(1703449457).br(var2, var3, var6.ak_fld, var6.ag_fld, 25, 25, this.az_fld.ar((byte)-92), 256, var2, var3, var6.av_fld, var6.az_fld);
			} else {
				yu.ei(var2, var3, 0, var6.av_fld, var6.az_fld);
			}
		}
	}

	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "(Lgc;III)V"
	)
	public static void wm(gc var0, int var1, int var2, int var3) {
		if (var0.ag_fld.ah(-1176952960).al(562053266)) {
			var2 += 15;
			zv.ps(ls.dd_fld, "Fps:" + var0.az_fld.ah(-865476005), var1 + var3, var2, 524417090, -1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int)((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 734104152;
			if (var5 > 775879943 && !var0.az_fld.aw(-1602735757)) {
				var6 = -365955221;
			}

			zv.ps(ls.dd_fld, "Mem:" + var5 + "k", var1 + var3, var2, var6, -1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ah(int var1, int var2, int var3) {
		if (this.ag_fld.ah(60489864).al(562053266)) {
			var2 += 15;
			zv.ps(ls.dd_fld, "Fps:" + this.az_fld.ah(-865476005), var1 + var3, var2, 16776960, -1);
			var2 += 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int)((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 16776960;
			if (var6 > 327680 && !this.az_fld.aw(-1439903911)) {
				var7 = 16711680;
			}

			zv.ps(ls.dd_fld, "Mem:" + var6 + "k", var1 + var3, var2, var7, -1);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	boolean bk(lu var1) {
		if (var1.gp_fld == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var1.gp_fld.length; var2++) {
				int var3 = this.az_fld.as(var1, var2, -2099346114);
				int var4 = var1.gv_fld[var2];
				if (2 == var1.gp_fld[var2]) {
					if (var3 >= var4) {
						return false;
					}
				} else if (3 == var1.gp_fld[var2]) {
					if (var3 <= var4) {
						return false;
					}
				} else if (4 == var1.gp_fld[var2]) {
					if (var4 == var3) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Llu;)Ljava/lang/String;"
	)
	String ay(String var1, lu var2) {
		if (var1.indexOf("%") != -1) {
			for (int var4 = 1; var4 <= 5; var4++) {
				while (true) {
					int var5 = var1.indexOf("%" + var4);
					if (var5 == -1) {
						break;
					}

					int var6 = this.az_fld.as(var2, var4 - 1, -2130205450);
					String var7;
					if (var6 < 999999999) {
						var7 = Integer.toString(var6);
					} else {
						var7 = "*";
					}

					var1 = var1.substring(0, var5) + var7 + var1.substring(var5 + 2);
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Lgc;Llu;I)V"
	)
	public static void ot(gc var0, lu var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = 1933780857 * var1.bp_fld;
		if (var3 == -1673002497) {
			if (-1 == var0.ay_fld) {
				var0.ay_fld = var1.cj_fld * 1195044950;
				var0.as_fld = -1672772631 * var1.ch_fld;
			}

			if (var0.az_fld.ay((byte)0) == 1) {
				var1.cj_fld = var0.ay_fld;
			} else {
				var1.cj_fld = var0.as_fld;
			}
		} else if (-991084423 == var3) {
			if (-1 == var0.ay_fld) {
				var0.ay_fld = var1.cj_fld;
				var0.as_fld = var1.ch_fld * -32410905;
			}

			if (var0.az_fld.ay((byte)0) == 1) {
				var1.cj_fld = var0.as_fld;
			} else {
				var1.cj_fld = var0.ay_fld * -1442961350;
			}
		} else if (327 == var3) {
			var1.dx_fld = 284116746;
			var1.ds_fld = ((int)(Math.sin(var2 / 40.0) * 256.0) & 2047) * -1449543758;
			var1.dm_fld = 399119440;
			var1.dq_fld = 0;
		} else if (642351838 == var3) {
			var1.dx_fld = 1432218559;
			var1.ds_fld = (int)(Math.sin(var2 / 40.0) * 256.0) & 312493911;
			var1.dm_fld = -414194673;
			var1.dq_fld = 340962923;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Llu;)Ljava/lang/String;"
	)
	String be(String var1, lu var2) {
		if (var1.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; var3++) {
				while (true) {
					int var4 = var1.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					int var5 = this.az_fld.as(var2, var3 - 1, -1999659510);
					String var6;
					if (var5 < 999999999) {
						var6 = Integer.toString(var5);
					} else {
						var6 = "*";
					}

					var1 = var1.substring(0, var4) + var6 + var1.substring(var4 + 2);
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILuo;IB)V"
	)
	void af(int var1, uo var2, int var3, byte var4) throws EOFException {
		if (!var2.az(var1)) {
			if (var4 < 0) {
				;
			}
		} else {
			this.al(var2.aw_fld[var1], 0, var2.aw_fld[var1].length - 1, -1, -1, var2, var3, -410976496);
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lgc;Llu;IILuo;)V"
	)
	public static void jw(gc var0, lu var1, int var2, int var3, uo var4) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		kp var5 = var1.aa(var4, false, 15790320);
		if (var5 != null) {
			if (var0.az_fld.az(1885974113)) {
				var0.av_fld.az(1602971346).br(var2, var3, var5.ak_fld, var5.ag_fld, 25, 25, var0.az_fld.ar((byte)-38), 256, var2, var3, var5.av_fld, var5.az_fld);
			} else {
				yu.ei(var2, var3, 0, var5.av_fld, var5.az_fld);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIILuo;II)V"
	)
	void al(lu[] var1, int var2, int var3, int var4, int var5, uo var6, int var7, int var8) throws EOFException {
		for (int var9 = var2; var9 <= var3; var9++) {
			lu var10 = var1[var9];
			if (var10 == null) {
				if (var8 >= 1973786740) {
					return;
				}
			} else if (var4 == var10.cv_fld && var5 == var10.cy_fld && (!var10.bj_fld || !var6.am(var10))) {
				if (var10.bx_fld == 0) {
					if (!var10.bj_fld && var6.am(var10) && !var6.ai().ag(var10)) {
						continue;
					}

					this.al(var1, var10.cx_fld, var10.cs_fld, var10.bf_fld, var10.by_fld, var6, var7, -1468954732);
					if (null != var10.ge_fld) {
						this.al(var10.ge_fld, 0, var10.ge_fld.length - 1, var10.bf_fld, -1, var6, var7, -2058725771);
					}

					if (-1 == var10.by_fld) {
						if (var8 >= 1973786740) {
							return;
						}

						pk var11 = (pk)var6.ai_fld.ak(var10.bf_fld);
						if (var11 != null) {
							if (var8 >= 1973786740) {
								return;
							}

							this.af(var11.ak_fld, var6, var7, (byte)-117);
						}
					}
				}

				if (var10.bx_fld == 6) {
					if (-1 != var10.dl_fld || var10.dr_fld != -1) {
						boolean var15 = this.ar(var10, 861601511);
						int var12;
						if (var15) {
							var12 = var10.dr_fld;
						} else {
							var12 = var10.dl_fld;
						}

						if (-1 != var12) {
							ol var13 = hm.ak(var12);
							if (!var13.aa(1119457634)) {
								var10.gz_fld += var7 * 431147417;

								while (var10.gz_fld > var13.bf_fld[var10.gy_fld]) {
									var10.gz_fld = var10.gz_fld - 431147417 * var13.bf_fld[var10.gy_fld];
									var10.gy_fld++;
									if (var10.gy_fld >= var13.bk_fld.length) {
										if (var8 >= 1973786740) {
											return;
										}

										var10.gy_fld = var10.gy_fld - var13.bl_fld;
										if (var10.gy_fld < 0 || var10.gy_fld >= var13.bk_fld.length) {
											var10.gy_fld = 0;
										}
									}
								}
							} else {
								var10.gy_fld += var7 * 1720105221;
								int var14 = var13.ai(-1509908899);
								if (var10.gy_fld >= var14) {
									var10.gy_fld = var10.gy_fld - var13.bl_fld;
									if (var10.gy_fld < 0 || var10.gy_fld >= var14) {
										var10.gy_fld = 0;
									}
								}
							}
						}
					}

					if (var10.dw_fld != 0 && !var10.bj_fld) {
						int var16 = var10.dw_fld >> 16;
						int var18 = var10.dw_fld << 16 >> 16;
						var16 *= var7;
						var18 *= var7;
						var10.dx_fld = var10.dx_fld + var16 & 2047;
						var10.ds_fld = var10.ds_fld + var18 & 2047;
					}
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILuo;II)V"
	)
	public void an(int var1, int var2, uo var3, int var4, int var5) throws EOFException {
		if (var3.aa_fld != -1) {
			this.af(var3.aa_fld * -656733669, var3, var5, (byte)-18);
			aj(this, var3.aa_fld, 0, 0, var1, var2, 0, 0, var3, var4, -1011825324);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILuo;I)V"
	)
	void bf(int var1, uo var2, int var3) throws EOFException {
		if (var2.az(var1)) {
			this.al(var2.aw_fld[var1], 0, var2.aw_fld[var1].length - 1, -1, -1, var2, var3, 897981470);
		}
	}

	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "(Lgc;Ljava/lang/String;Llu;)Ljava/lang/String;"
	)
	public static String tf(gc var0, String var1, lu var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; var3++) {
				while (true) {
					int var4 = var1.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					int var5 = var0.az_fld.as(var2, var3 - 1, -2074072763);
					String var6;
					if (var5 < 999999999) {
						var6 = Integer.toString(var5);
					} else {
						var6 = "*";
					}

					var1 = var1.substring(0, var4) + var6 + var1.substring(var4 + 2);
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IILuo;IIB)V"
	)
	public static void lc(gc var0, int var1, int var2, uo var3, int var4, int var5, byte var6) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var3.aa_fld != -1) {
				if (var6 == 1) {
					return;
				}

				var0.af(var3.aa_fld, var3, var5, (byte)-13);
				aj(var0, var3.aa_fld, 0, 0, var1, var2, 0, 0, var3, var4, -1646314622);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;I)V"
	)
	void ai(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9) throws EOFException {
		if (var8.az(var1)) {
			this.ar_fld = null;
			this.az(var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, -421736176);
			if (this.ar_fld != null) {
				this.az(this.ar_fld, 0, this.ar_fld.length - 1, -1412584499, -1412584499, var2, var3, var4, var5, this.af_fld, this.al_fld, var8, var9, -811282692);
				this.ar_fld = null;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;I)V"
	)
	void aa(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9) throws EOFException {
		if (var8.az(var1)) {
			this.ar_fld = null;
			this.az(var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, -1571451997);
			if (this.ar_fld != null) {
				this.az(this.ar_fld, 0, this.ar_fld.length - 1, -1412584499, -1412584499, var2, var3, var4, var5, this.af_fld, this.al_fld, var8, var9, -244968426);
				this.ar_fld = null;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;I)V"
	)
	void am(lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13) throws EOFException {
		yu.dg(var6, var7, var8, var9);
		fc.ai();

		for (int var14 = var2; var14 <= var3; var14++) {
			lu var15 = var1[var14];
			if (null != var15 && (var4 == var15.cv_fld && var5 == var15.cy_fld || var4 == -1412584499 && var15 == var12.bd()) && (!var15.bj_fld || !var12.am(var15))) {
				if (var15.bp_fld > 0) {
					this.av(var15, var13, (byte)1);
				}

				int var16 = var10 + var15.bq_fld;
				int var17 = var15.bg_fld + var11;
				int var18 = var15.cb_fld;
				if (var12.bd() == var15) {
					uk var19 = var12.bm();
					if (var4 != 862994306 && !var15.em_fld) {
						this.ar_fld = var1;
						this.af_fld = var10;
						this.al_fld = var11;
						continue;
					}

					if (var19.ap() && var19.ao()) {
						int var20 = uk.yq(var19, -53763678);
						int var21 = uk.kq(var19, -79080406);
						int var22 = uk.dz(var19, -1094587272).bb_fld * -1223437005;
						int var23 = uk.dz(var19, -1094587272).cd_fld * 124430729;
						int var24 = -1380007368 * tj.ae_fld;
						int var25 = -1523697895 * tj.ah_fld;
						var24 -= var19.al();
						var25 -= var19.au();
						if (var24 < var20) {
							var24 = var20;
						}

						if (var24 + var15.bb_fld > var20 + var22) {
							var24 = var20 + var22 - var15.bb_fld;
						}

						if (var25 < var21) {
							var25 = var21;
						}

						if (var15.cd_fld + var25 > var21 + var23) {
							var25 = var23 + var21 - var15.cd_fld;
						}

						var16 = var24;
						var17 = var25;
					}

					if (!var15.em_fld) {
						var18 = 1664710309;
					}
				}

				int var33;
				int var34;
				int var35;
				int var36;
				if (var15.bx_fld == 9) {
					int var37 = var16;
					int var49 = var17;
					int var59 = var16 + var15.bb_fld;
					int var26 = var17 + var15.cd_fld;
					if (var59 < var16) {
						var37 = var59;
						var59 = var16;
					}

					if (var26 < var17) {
						var49 = var26;
						var26 = var17;
					}

					var59++;
					var26++;
					var33 = var37 > var6 ? var37 : var6;
					var34 = var49 > var7 ? var49 : var7;
					var35 = var59 < var8 ? var59 : var8;
					var36 = var26 < var9 ? var26 : var9;
				} else {
					int var38 = var15.bb_fld + var16;
					int var50 = var15.cd_fld + var17;
					var33 = var16 > var6 ? var16 : var6;
					var34 = var17 > var7 ? var17 : var7;
					var35 = var38 < var8 ? var38 : var8;
					var36 = var50 < var9 ? var50 : var9;
				}

				if (!var15.bj_fld || var33 < var35 && var34 < var36) {
					if (0 != var15.bp_fld) {
						if (2033737466 == var15.bp_fld) {
							this.ah(var16, var17, var15.bb_fld);
							continue;
						}

						if (var15.bp_fld == 1337) {
							this.ah_fld.ak(var16, var17, var15.bb_fld, var15.cd_fld * 1690262659, -1862773329);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (822288224 == var15.bp_fld) {
							this.ah_fld.ag(var15, var16, var17, 1096810380);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (1339 == var15.bp_fld) {
							this.ae(var15, var16, var17, var12);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (1400 == var15.bp_fld) {
							this.ah_fld.az(var16, var17, -364699339 * var15.bb_fld, var15.cd_fld * 344017373, var13, cn.db(this.ag_fld.ah(73366555), -2098027066));
						}

						if (var15.bp_fld == 1401) {
							this.ah_fld.av(var16, var17, var15.bb_fld * 231135281, var15.cd_fld * -62184759, -65582783);
						}

						if (var15.bp_fld == 492931746) {
							this.ah_fld.ae(var16, var13, (byte)-34);
						}
					}

					if (0 == var15.bx_fld) {
						if (!var15.bj_fld && var12.am(var15) && !var12.ai().ag(var15)) {
							continue;
						}

						if (!var15.bj_fld) {
							if (var15.ce_fld > var15.cr_fld - var15.cd_fld) {
								var15.ce_fld = var15.cr_fld - var15.cd_fld;
							}

							if (var15.ce_fld * -1260668088 < 0) {
								var15.ce_fld = 0;
							}
						}

						this.az(
							var1,
							var15.cx_fld,
							var15.cs_fld * 620744576,
							var15.bf_fld,
							var15.by_fld,
							var33,
							var34,
							var35,
							var36,
							var16 - var15.cp_fld,
							var17 - var15.ce_fld,
							var12,
							var13,
							-2109841942
						);
						if (var15.ge_fld != null) {
							this.az(
								var15.ge_fld,
								0,
								var15.ge_fld.length - 1,
								var15.bf_fld,
								-1,
								var33,
								var34,
								var35,
								var36,
								var16 - var15.cp_fld,
								var17 - var15.ce_fld,
								var12,
								var13,
								-1164842048
							);
						}

						if (var15.by_fld == -1) {
							pk var39 = (pk)var12.ai_fld.ak(-869033767 * var15.bf_fld);
							if (null != var39) {
								aj(this, var39.ak_fld, var33, var34, var35, var36, var16, var17, var12, var13, -1947726350);
							}
						}

						yu.dg(var6, var7, var8, var9);
						fc.ai();
					} else if (11 == var15.bx_fld) {
						if (var12.am(var15) && !var12.ai().ag(var15)) {
							continue;
						}

						if (var15.ge_fld != null) {
							this.az(
								var15.ge_fld,
								0,
								var15.ge_fld.length - 1,
								var15.bf_fld * 270623666,
								-1,
								var33,
								var34,
								var35,
								var36,
								var16 - var15.cp_fld,
								var17 - var15.ce_fld,
								var12,
								var13,
								-878760761
							);
						}

						yu.dg(var6, var7, var8, var9);
						fc.ai();
					}

					if (var15.bx_fld == 0 && !var15.bj_fld && var15.cr_fld > var15.cd_fld) {
						nt(this, var15.bb_fld + var16, var17, -1498557336 * var15.ce_fld, var15.cd_fld, var15.cr_fld);
					}

					if (var15.bx_fld != 1) {
						if (var15.bx_fld == 3) {
							int var47;
							if (this.ar(var15, 1617411329)) {
								var47 = var15.cg_fld * 781128888;
								if (var12.ai().ag(var15) && 0 != var15.cm_fld) {
									var47 = var15.cm_fld;
								}
							} else {
								var47 = -1320464190 * var15.ca_fld;
								if (var12.ai().ag(var15) && 0 != var15.cw_fld) {
									var47 = var15.cw_fld;
								}
							}

							if (var15.cz_fld) {
								switch (1068527908 * var15.ck_fld.av_fld) {
									case 1:
										yu.es(var16, var17, var15.bb_fld * -1762899560, var15.cd_fld, var15.ca_fld, var15.cg_fld * -806122749);
										break;
									case 2:
										yu.ep(
											var16,
											var17,
											1158934592 * var15.bb_fld,
											var15.cd_fld * 1174510650,
											-564532752 * var15.ca_fld,
											2073531844 * var15.cg_fld,
											255 - (var15.cb_fld & 0xFF),
											-1994537555 - (var15.co_fld & 0xFF)
										);
										break;
									default:
										if (0 == var18) {
											yu.dj(var16, var17, var15.bb_fld, var15.cd_fld, var47);
										} else {
											yu.dp(var16, var17, -515522770 * var15.bb_fld, var15.cd_fld * -763192688, var47, 201454445 - (var18 & 922244532));
										}
								}
							} else if (0 == var18) {
								yu.ed(var16, var17, var15.bb_fld * -1478323860, -1773521197 * var15.cd_fld, var47);
							} else {
								yu.et(var16, var17, var15.bb_fld, var15.cd_fld, var47, -2066860091 - (var18 & 0xFF));
							}
						} else if (4 == var15.bx_fld) {
							zf var46 = lu.dg(var15, var12, (byte)-28);
							if (var46 != null) {
								String var67 = var15.dp_fld;
								int var57;
								if (this.ar(var15, -1407455664)) {
									var57 = -138445708 * var15.cg_fld;
									if (var12.ai().ag(var15) && 0 != var15.cm_fld) {
										var57 = var15.cm_fld;
									}

									if (!var15.dj_fld.isEmpty()) {
										var67 = var15.dj_fld;
									}
								} else {
									var57 = -1519217307 * var15.ca_fld;
									if (var12.ai().ag(var15) && var15.cw_fld != 0) {
										var57 = var15.cw_fld * -18549772;
									}
								}

								if (var15.bj_fld && -1 != var15.ga_fld) {
									og var75 = kb.ag(var15.ga_fld, -1752383175);
									var67 = var75.dx_fld;
									if (var67 == null) {
										var67 = kh.aj_fld;
									}

									if ((var75.dj_fld == 1 || var15.gd_fld != 1) && -1 != var15.gd_fld) {
										var67 = gd.ag(1696513371, -1940547058) + var67 + db.ay_fld + " " + 'x' + lu.as(var15.gd_fld * -273307491);
									}
								}

								if (uo.wp(var12, var15, -1978074686)) {
									var67 = kh.hn_fld;
									var57 = var15.ca_fld;
								}

								if (!var15.bj_fld) {
									var67 = this.ay(var67, var15);
								}

								var46.ac(
									var67,
									var16,
									var17,
									var15.bb_fld,
									var15.cd_fld * 1058951429,
									var57,
									var15.ed_fld ? 0 : -1,
									ue.ae(-279111552 * var15.cb_fld),
									var15.ep_fld,
									var15.eb_fld,
									var15.es_fld
								);
							}
						} else if (var15.bx_fld == 5) {
							if (!var15.bj_fld) {
								yv var45 = lu.ef(var15, var12, this.ar(var15, 251641431), this.ag_fld.az(-2101136891), -423043034);
								if (null != var45) {
									var45.ab(var16, var17);
								}
							} else {
								yv var44;
								if (var15.ga_fld != -1) {
									var44 = ud.az(
										var15.ga_fld * 796123893,
										var15.gd_fld,
										var15.dh_fld,
										var15.dv_fld,
										var15.df_fld,
										false,
										Math.max(-1608857396, 1030377076 * var15.bb_fld),
										Math.max(-1948021023, var15.cd_fld)
									);
								} else {
									var44 = lu.ef(var15, var12, false, this.ag_fld.az(-344822541), -423043034);
								}

								if (null != var44) {
									int var56 = var44.ad_fld;
									int var66 = var44.ao_fld;
									if (!var15.dc_fld) {
										int var74 = var15.bb_fld / var56;
										if (0 != var15.cl_fld) {
											var44.in(var16 + var15.bb_fld / 2, var15.cd_fld / 2 + var17, 1158989338 * var15.cl_fld, var74);
										} else if (0 != var18) {
											var44.aj(var16, var17, var15.bb_fld, var15.cd_fld, 256 - (var18 & 0xFF));
										} else if (var15.bb_fld == var56 && var66 == var15.cd_fld) {
											var44.ab(var16, var17);
										} else {
											yv.an(var44, var16, var17, var15.bb_fld, 1425747530 * var15.cd_fld);
										}
									} else {
										yu.dw(var16, var17, var15.bb_fld + var16, var17 + var15.cd_fld);
										int var73 = (var56 - 1 + var15.bb_fld) / var56;
										int var81 = (var66 - 1 + var15.cd_fld) / var66;

										for (int var84 = 0; var84 < var73; var84++) {
											for (int var87 = 0; var87 < var81; var87++) {
												if (0 != var15.cl_fld) {
													var44.in(var84 * var56 + var16 + var56 / 2, var66 / 2 + var17 + var66 * var87, var15.cl_fld * 510521500, 4096);
												} else if (var18 != 0) {
													var44.ac(var56 * var84 + var16, var87 * var66 + var17, 1204248102 - (var18 & -508799225));
												} else {
													var44.ab(var56 * var84 + var16, var66 * var87 + var17);
												}
											}
										}

										yu.dg(var6, var7, var8, var9);
									}
								}
							}
						} else if (var15.bx_fld == 6) {
							ol var43 = null;
							int var55 = -1;
							boolean var65 = this.ar(var15, 1733215567);
							int var72;
							if (var65) {
								var72 = var15.dr_fld;
							} else {
								var72 = var15.dl_fld;
							}

							if (var72 != -1) {
								var43 = hm.ak(var72);
								var55 = var15.gy_fld;
							}

							fn var79 = null;
							int var83 = 0;
							if (var15.ga_fld != -1) {
								var79 = this.ae_fld.ak(var15, 1691932237);
								if (null != var79) {
									var79.eu();
									var83 = var79.ez_fld / 2;
								}
							} else if (5 == var15.dm_fld) {
								var79 = this.ae_fld.ag(var15, 2083542439);
							} else if (var15.dm_fld == 7) {
								var79 = this.ae_fld.az(var15, 709789940);
							} else if (8 == var15.dm_fld) {
								var79 = this.ae_fld.av(var15, var43, var55, -1028566346);
							} else if (var15.dm_fld == 9) {
								var79 = this.ae_fld.ae(var15, var43, var55, 1924276889);
							} else if (var15.dm_fld == 6) {
								var79 = this.ae_fld.ah(var15, var43, var55, var65, -797195880);
							} else if (var15.dm_fld == 2) {
								var79 = this.ae_fld.aw(var15, var43, var55, var65, (byte)0);
							} else {
								var79 = this.ae_fld.ay(var15, var43, var55, var65, -195877758);
							}

							fc.ad(var16 + var15.bb_fld / 2, var15.cd_fld / 2 + var17);
							int var86 = fc.ah_fld[-1975455978 * var15.dx_fld] * var15.db_fld >> 16;
							int var89 = fc.aw_fld[-95103483 * var15.dx_fld] * var15.db_fld >> 16;
							if (null != var79) {
								fc.ak(false);
								if (!var15.bj_fld) {
									var79.bv(0, var15.ds_fld, 0, var15.dx_fld, 0, var86, var89);
								} else {
									var79.eu();
									if (var15.di_fld) {
										var79.bi(
											0,
											var15.ds_fld,
											var15.du_fld,
											var15.dx_fld * -1474051428,
											1748790203 * var15.da_fld,
											var15.dk_fld + var83 + var86,
											var15.dk_fld + var89,
											-1701252538 * var15.db_fld
										);
									} else {
										var79.bv(0, var15.ds_fld * -2015471694, var15.du_fld, var15.dx_fld * -703485506, var15.da_fld, var15.dk_fld + var83 + var86, var89 + var15.dk_fld);
									}
								}
							}

							fc.am();
						} else if (var15.bx_fld == 8) {
							if (ui.in(var12.ai(), var15, (byte)120)) {
								zf var42 = this.av_fld.ak(xy.ag_fld, (byte)2);
								int var53 = 0;
								int var63 = 0;
								zf var71 = var42;
								String var27 = var15.dp_fld;

								for (String var76 = this.ay(var27, var15); !var76.isEmpty(); var63 += var71.ap_fld + 1) {
									int var29 = var76.indexOf(db.aw_fld);
									String var28;
									if (var29 != -1) {
										var28 = var76.substring(0, var29);
										var76 = var76.substring(var29 + 4);
									} else {
										var28 = var76;
										var76 = "";
									}

									int var30 = var71.an(var28);
									if (var30 > var53) {
										var53 = var30;
									}
								}

								var53 += 6;
								var63 += 7;
								int var85 = var15.bb_fld + var16 - 5 - var53;
								int var88 = 5 + var17 + var15.cd_fld;
								if (var85 < 5 + var16) {
									var85 = 5 + var16;
								}

								if (var85 + var53 > var8) {
									var85 = var8 - var53;
								}

								if (var63 + var88 > var9) {
									var88 = var9 - var63;
								}

								yu.dj(var85, var88, var53, var63, -448732151);
								yu.ed(var85, var88, var53, var63, 0);
								var27 = var15.dp_fld;
								int var31 = 2 + var71.ap_fld + var88;

								for (String var78 = this.ay(var27, var15); !var78.isEmpty(); var31 += var71.ap_fld + 1) {
									int var32 = var78.indexOf(db.aw_fld);
									String var82;
									if (var32 != -1) {
										var82 = var78.substring(0, var32);
										var78 = var78.substring(var32 + 4);
									} else {
										var82 = var78;
										var78 = "";
									}

									zv.uj(var71, var82, var85 + 3, var31, 0, -1);
								}
							}
						} else if (var15.bx_fld == 9) {
							int var41;
							int var52;
							int var62;
							int var70;
							if (var15.ci_fld) {
								var41 = var16;
								var52 = var17 + var15.cd_fld;
								var62 = var15.bb_fld + var16;
								var70 = var17;
							} else {
								var41 = var16;
								var52 = var17;
								var62 = var15.bb_fld + var16;
								var70 = var15.cd_fld + var17;
							}

							if (var15.cu_fld == 1) {
								yu.ez(var41, var52, var62, var70, var15.ca_fld * 1890872391);
							} else {
								yu.ef(var41, var52, var62, var70, var15.cu_fld * -1349313452, var15.ca_fld);
							}
						} else if (var15.bx_fld == 12) {
							li var40 = lu.bv(var15, -2116031385);
							ln var51 = var15.bi(1705522151);
							if (null != var40 && null != var51 && var40.cq()) {
								zf var61 = lu.dg(var15, var12, (byte)-3);
								if (null != var61) {
									this.aw_fld.ak(var16, var17, var15.bb_fld, 296201566 * var15.cd_fld, var40.cv(), var40.cy(), li.dg(var40, (byte)19), var40.cc(), var40.bb());
									int var69 = var15.ed_fld ? var15.dv_fld : -1;
									if (!li.vk(var40, (byte)5) && var40.bc().az(1939769251)) {
										this.aw_fld.ag(var51.az_fld, var69, var51.ak_fld, -455848235 * var51.ag_fld, 1265619503);
										this.aw_fld.az(var40.bw(), var61, (byte)77);
									} else {
										this.aw_fld.ag(-1161596831 * var15.ca_fld, var69, var51.ak_fld, var51.ag_fld, 1520675595);
										this.aw_fld.az(var40.bc(), var61, (byte)77);
									}

									yu.dg(var6, var7, var8, var9);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IIIIIIILuo;II)V"
	)
	public static void aj(gc var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, int var10) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else if (var8.az(var1)) {
			var0.ar_fld = null;
			var0.az(var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, -1908831302);
			if (var0.ar_fld != null) {
				if (var10 == -2010931349) {
					return;
				}

				var0.az(var0.ar_fld, 0, var0.ar_fld.length - 1, -1412584499, -1412584499, var2, var3, var4, var5, var0.af_fld, var0.al_fld, var8, var9, -1350765159);
				var0.ar_fld = null;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;I)V"
	)
	void aq(lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13) throws EOFException {
		yu.dg(var6, var7, var8, var9);
		fc.ai();

		for (int var14 = var2; var14 <= var3; var14++) {
			lu var15 = var1[var14];
			if (null != var15 && (var4 == var15.cv_fld && var5 == var15.cy_fld || var4 == -1412584499 && var15 == var12.bd()) && (!var15.bj_fld || !var12.am(var15))) {
				if (var15.bp_fld > 0) {
					this.av(var15, var13, (byte)1);
				}

				int var16 = var10 + var15.bq_fld;
				int var17 = var15.bg_fld + var11;
				int var18 = var15.cb_fld;
				if (var12.bd() == var15) {
					uk var19 = var12.bm();
					if (var4 != -1412584499 && !var15.em_fld) {
						this.ar_fld = var1;
						this.af_fld = var10;
						this.al_fld = var11;
						continue;
					}

					if (var19.ap() && var19.ao()) {
						int var20 = uk.yq(var19, 752034013);
						int var21 = uk.kq(var19, -79080406);
						int var22 = uk.dz(var19, -1094587272).bb_fld * -1223437005;
						int var23 = uk.dz(var19, -1094587272).cd_fld * 124430729;
						int var24 = tj.ae_fld;
						int var25 = tj.ah_fld;
						var24 -= var19.al();
						var25 -= var19.au();
						if (var24 < var20) {
							var24 = var20;
						}

						if (var24 + var15.bb_fld > var20 + var22) {
							var24 = var20 + var22 - var15.bb_fld;
						}

						if (var25 < var21) {
							var25 = var21;
						}

						if (var15.cd_fld + var25 > var21 + var23) {
							var25 = var23 + var21 - var15.cd_fld;
						}

						var16 = var24;
						var17 = var25;
					}

					if (!var15.em_fld) {
						var18 = 128;
					}
				}

				int var33;
				int var34;
				int var35;
				int var36;
				if (var15.bx_fld == 9) {
					int var37 = var16;
					int var49 = var17;
					int var59 = var16 + var15.bb_fld;
					int var26 = var17 + var15.cd_fld;
					if (var59 < var16) {
						var37 = var59;
						var59 = var16;
					}

					if (var26 < var17) {
						var49 = var26;
						var26 = var17;
					}

					var59++;
					var26++;
					var33 = var37 > var6 ? var37 : var6;
					var34 = var49 > var7 ? var49 : var7;
					var35 = var59 < var8 ? var59 : var8;
					var36 = var26 < var9 ? var26 : var9;
				} else {
					int var38 = var15.bb_fld + var16;
					int var50 = var15.cd_fld + var17;
					var33 = var16 > var6 ? var16 : var6;
					var34 = var17 > var7 ? var17 : var7;
					var35 = var38 < var8 ? var38 : var8;
					var36 = var50 < var9 ? var50 : var9;
				}

				if (!var15.bj_fld || var33 < var35 && var34 < var36) {
					if (0 != var15.bp_fld) {
						if (1336 == var15.bp_fld) {
							this.ah(var16, var17, var15.bb_fld);
							continue;
						}

						if (var15.bp_fld == 1337) {
							this.ah_fld.ak(var16, var17, var15.bb_fld, var15.cd_fld, -585131191);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (1338 == var15.bp_fld) {
							this.ah_fld.ag(var15, var16, var17, 1096810380);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (1339 == var15.bp_fld) {
							this.ae(var15, var16, var17, var12);
							yu.dg(var6, var7, var8, var9);
							continue;
						}

						if (1400 == var15.bp_fld) {
							this.ah_fld.az(var16, var17, var15.bb_fld, var15.cd_fld, var13, cn.db(this.ag_fld.ah(955288262), -1697659908));
						}

						if (var15.bp_fld == 1401) {
							this.ah_fld.av(var16, var17, var15.bb_fld, var15.cd_fld, -1103188440);
						}

						if (var15.bp_fld == 1402) {
							this.ah_fld.ae(var16, var13, (byte)-44);
						}
					}

					if (0 == var15.bx_fld) {
						if (!var15.bj_fld && var12.am(var15) && !var12.ai().ag(var15)) {
							continue;
						}

						if (!var15.bj_fld) {
							if (var15.ce_fld > var15.cr_fld - var15.cd_fld) {
								var15.ce_fld = var15.cr_fld - var15.cd_fld;
							}

							if (var15.ce_fld < 0) {
								var15.ce_fld = 0;
							}
						}

						this.az(
							var1,
							var15.cx_fld,
							var15.cs_fld,
							var15.bf_fld,
							var15.by_fld,
							var33,
							var34,
							var35,
							var36,
							var16 - var15.cp_fld,
							var17 - var15.ce_fld,
							var12,
							var13,
							-521264444
						);
						if (var15.ge_fld != null) {
							this.az(
								var15.ge_fld,
								0,
								var15.ge_fld.length - 1,
								var15.bf_fld,
								-1,
								var33,
								var34,
								var35,
								var36,
								var16 - var15.cp_fld,
								var17 - var15.ce_fld,
								var12,
								var13,
								-1265231379
							);
						}

						if (var15.by_fld == -1) {
							pk var39 = (pk)var12.ai_fld.ak(var15.bf_fld);
							if (null != var39) {
								aj(this, var39.ak_fld, var33, var34, var35, var36, var16, var17, var12, var13, 2071356359);
							}
						}

						yu.dg(var6, var7, var8, var9);
						fc.ai();
					} else if (11 == var15.bx_fld) {
						if (var12.am(var15) && !var12.ai().ag(var15)) {
							continue;
						}

						if (var15.ge_fld != null) {
							this.az(
								var15.ge_fld,
								0,
								var15.ge_fld.length - 1,
								var15.bf_fld,
								-1,
								var33,
								var34,
								var35,
								var36,
								var16 - var15.cp_fld,
								var17 - var15.ce_fld,
								var12,
								var13,
								-83222016
							);
						}

						yu.dg(var6, var7, var8, var9);
						fc.ai();
					}

					if (var15.bx_fld == 0 && !var15.bj_fld && var15.cr_fld > var15.cd_fld) {
						nt(this, var15.bb_fld + var16, var17, var15.ce_fld, var15.cd_fld, var15.cr_fld);
					}

					if (var15.bx_fld != 1) {
						if (var15.bx_fld == 3) {
							int var47;
							if (this.ar(var15, 1184466282)) {
								var47 = var15.cg_fld;
								if (var12.ai().ag(var15) && 0 != var15.cm_fld) {
									var47 = var15.cm_fld;
								}
							} else {
								var47 = var15.ca_fld;
								if (var12.ai().ag(var15) && 0 != var15.cw_fld) {
									var47 = var15.cw_fld;
								}
							}

							if (var15.cz_fld) {
								switch (-79906945 * var15.ck_fld.av_fld) {
									case 1:
										yu.es(var16, var17, var15.bb_fld, var15.cd_fld, var15.ca_fld, var15.cg_fld);
										break;
									case 2:
										yu.ep(var16, var17, var15.bb_fld, var15.cd_fld, var15.ca_fld, var15.cg_fld, 255 - (var15.cb_fld & 0xFF), 255 - (var15.co_fld & 0xFF));
										break;
									default:
										if (0 == var18) {
											yu.dj(var16, var17, var15.bb_fld, var15.cd_fld, var47);
										} else {
											yu.dp(var16, var17, var15.bb_fld, var15.cd_fld, var47, 256 - (var18 & 0xFF));
										}
								}
							} else if (0 == var18) {
								yu.ed(var16, var17, var15.bb_fld, var15.cd_fld, var47);
							} else {
								yu.et(var16, var17, var15.bb_fld, var15.cd_fld, var47, 256 - (var18 & 0xFF));
							}
						} else if (4 == var15.bx_fld) {
							zf var46 = lu.dg(var15, var12, (byte)8);
							if (var46 != null) {
								String var67 = var15.dp_fld;
								int var57;
								if (this.ar(var15, 1192623094)) {
									var57 = var15.cg_fld;
									if (var12.ai().ag(var15) && 0 != var15.cm_fld) {
										var57 = var15.cm_fld;
									}

									if (!var15.dj_fld.isEmpty()) {
										var67 = var15.dj_fld;
									}
								} else {
									var57 = var15.ca_fld;
									if (var12.ai().ag(var15) && var15.cw_fld != 0) {
										var57 = var15.cw_fld;
									}
								}

								if (var15.bj_fld && -1 != var15.ga_fld) {
									og var75 = kb.ag(var15.ga_fld, -1752383175);
									var67 = var75.dx_fld;
									if (var67 == null) {
										var67 = kh.aj_fld;
									}

									if ((var75.dj_fld == 1 || var15.gd_fld != 1) && -1 != var15.gd_fld) {
										var67 = gd.ag(16748608, -1940547058) + var67 + db.ay_fld + " " + 'x' + lu.as(var15.gd_fld);
									}
								}

								if (uo.wp(var12, var15, -1978074686)) {
									var67 = kh.hn_fld;
									var57 = var15.ca_fld;
								}

								if (!var15.bj_fld) {
									var67 = this.ay(var67, var15);
								}

								var46.ac(var67, var16, var17, var15.bb_fld, var15.cd_fld, var57, var15.ed_fld ? 0 : -1, ue.ae(var15.cb_fld), var15.ep_fld, var15.eb_fld, var15.es_fld);
							}
						} else if (var15.bx_fld == 5) {
							if (!var15.bj_fld) {
								yv var45 = lu.ef(var15, var12, this.ar(var15, -368645726), this.ag_fld.az(1066344343), -423043034);
								if (null != var45) {
									var45.ab(var16, var17);
								}
							} else {
								yv var44;
								if (var15.ga_fld != -1) {
									var44 = ud.az(var15.ga_fld, var15.gd_fld, var15.dh_fld, var15.dv_fld, var15.df_fld, false, Math.max(36, var15.bb_fld), Math.max(32, var15.cd_fld));
								} else {
									var44 = lu.ef(var15, var12, false, this.ag_fld.az(1174099967), -423043034);
								}

								if (null != var44) {
									int var56 = var44.ad_fld;
									int var66 = var44.ao_fld;
									if (!var15.dc_fld) {
										int var74 = var15.bb_fld / var56;
										if (0 != var15.cl_fld) {
											var44.in(var16 + var15.bb_fld / 2, var15.cd_fld / 2 + var17, var15.cl_fld, var74);
										} else if (0 != var18) {
											var44.aj(var16, var17, var15.bb_fld, var15.cd_fld, 256 - (var18 & 0xFF));
										} else if (var15.bb_fld == var56 && var66 == var15.cd_fld) {
											var44.ab(var16, var17);
										} else {
											yv.an(var44, var16, var17, var15.bb_fld, var15.cd_fld);
										}
									} else {
										yu.dw(var16, var17, var15.bb_fld + var16, var17 + var15.cd_fld);
										int var73 = (var56 - 1 + var15.bb_fld) / var56;
										int var81 = (var66 - 1 + var15.cd_fld) / var66;

										for (int var84 = 0; var84 < var73; var84++) {
											for (int var87 = 0; var87 < var81; var87++) {
												if (0 != var15.cl_fld) {
													var44.in(var84 * var56 + var16 + var56 / 2, var66 / 2 + var17 + var66 * var87, var15.cl_fld, 4096);
												} else if (var18 != 0) {
													var44.ac(var56 * var84 + var16, var87 * var66 + var17, 256 - (var18 & 0xFF));
												} else {
													var44.ab(var56 * var84 + var16, var66 * var87 + var17);
												}
											}
										}

										yu.dg(var6, var7, var8, var9);
									}
								}
							}
						} else if (var15.bx_fld == 6) {
							ol var43 = null;
							int var55 = -1;
							boolean var65 = this.ar(var15, 1260059126);
							int var72;
							if (var65) {
								var72 = var15.dr_fld;
							} else {
								var72 = var15.dl_fld;
							}

							if (var72 != -1) {
								var43 = hm.ak(var72);
								var55 = var15.gy_fld;
							}

							fn var79 = null;
							int var83 = 0;
							if (var15.ga_fld != -1) {
								var79 = this.ae_fld.ak(var15, 1963376538);
								if (null != var79) {
									var79.eu();
									var83 = var79.ez_fld / 2;
								}
							} else if (5 == var15.dm_fld) {
								var79 = this.ae_fld.ag(var15, 1488519674);
							} else if (var15.dm_fld == 7) {
								var79 = this.ae_fld.az(var15, 432907332);
							} else if (8 == var15.dm_fld) {
								var79 = this.ae_fld.av(var15, var43, var55, -1067322245);
							} else if (var15.dm_fld == 9) {
								var79 = this.ae_fld.ae(var15, var43, var55, 1292995548);
							} else if (var15.dm_fld == 6) {
								var79 = this.ae_fld.ah(var15, var43, var55, var65, -570800027);
							} else if (var15.dm_fld == 2) {
								var79 = this.ae_fld.aw(var15, var43, var55, var65, (byte)0);
							} else {
								var79 = this.ae_fld.ay(var15, var43, var55, var65, -195877758);
							}

							fc.ad(var16 + var15.bb_fld / 2, var15.cd_fld / 2 + var17);
							int var86 = fc.ah_fld[var15.dx_fld] * var15.db_fld >> 16;
							int var89 = fc.aw_fld[var15.dx_fld] * var15.db_fld >> 16;
							if (null != var79) {
								fc.ak(false);
								if (!var15.bj_fld) {
									var79.bv(0, var15.ds_fld, 0, var15.dx_fld, 0, var86, var89);
								} else {
									var79.eu();
									if (var15.di_fld) {
										var79.bi(0, var15.ds_fld, var15.du_fld, var15.dx_fld, var15.da_fld, var15.dk_fld + var83 + var86, var15.dk_fld + var89, var15.db_fld);
									} else {
										var79.bv(0, var15.ds_fld, var15.du_fld, var15.dx_fld, var15.da_fld, var15.dk_fld + var83 + var86, var89 + var15.dk_fld);
									}
								}
							}

							fc.am();
						} else if (var15.bx_fld == 8) {
							if (ui.in(var12.ai(), var15, (byte)120)) {
								zf var42 = this.av_fld.ak(xy.ag_fld, (byte)2);
								int var53 = 0;
								int var63 = 0;
								zf var71 = var42;
								String var27 = var15.dp_fld;

								for (String var76 = this.ay(var27, var15); !var76.isEmpty(); var63 += var71.ap_fld + 1) {
									int var29 = var76.indexOf(db.aw_fld);
									String var28;
									if (var29 != -1) {
										var28 = var76.substring(0, var29);
										var76 = var76.substring(var29 + 4);
									} else {
										var28 = var76;
										var76 = "";
									}

									int var30 = var71.an(var28);
									if (var30 > var53) {
										var53 = var30;
									}
								}

								var53 += 6;
								var63 += 7;
								int var85 = var15.bb_fld + var16 - 5 - var53;
								int var88 = 5 + var17 + var15.cd_fld;
								if (var85 < 5 + var16) {
									var85 = 5 + var16;
								}

								if (var85 + var53 > var8) {
									var85 = var8 - var53;
								}

								if (var63 + var88 > var9) {
									var88 = var9 - var63;
								}

								yu.dj(var85, var88, var53, var63, 16777120);
								yu.ed(var85, var88, var53, var63, 0);
								var27 = var15.dp_fld;
								int var31 = 2 + var71.ap_fld + var88;

								for (String var78 = this.ay(var27, var15); !var78.isEmpty(); var31 += var71.ap_fld + 1) {
									int var32 = var78.indexOf(db.aw_fld);
									String var82;
									if (var32 != -1) {
										var82 = var78.substring(0, var32);
										var78 = var78.substring(var32 + 4);
									} else {
										var82 = var78;
										var78 = "";
									}

									zv.uj(var71, var82, var85 + 3, var31, 0, -1);
								}
							}
						} else if (var15.bx_fld == 9) {
							int var41;
							int var52;
							int var62;
							int var70;
							if (var15.ci_fld) {
								var41 = var16;
								var52 = var17 + var15.cd_fld;
								var62 = var15.bb_fld + var16;
								var70 = var17;
							} else {
								var41 = var16;
								var52 = var17;
								var62 = var15.bb_fld + var16;
								var70 = var15.cd_fld + var17;
							}

							if (var15.cu_fld == 1) {
								yu.ez(var41, var52, var62, var70, var15.ca_fld);
							} else {
								yu.ef(var41, var52, var62, var70, var15.cu_fld, var15.ca_fld);
							}
						} else if (var15.bx_fld == 12) {
							li var40 = lu.bv(var15, -1118603260);
							ln var51 = var15.bi(-155332722);
							if (null != var40 && null != var51 && var40.cq()) {
								zf var61 = lu.dg(var15, var12, (byte)-10);
								if (null != var61) {
									this.aw_fld.ak(var16, var17, var15.bb_fld, var15.cd_fld, var40.cv(), var40.cy(), li.dg(var40, (byte)62), var40.cc(), var40.bb());
									int var69 = var15.ed_fld ? var15.dv_fld : -1;
									if (!li.vk(var40, (byte)68) && var40.bc().az(1939769251)) {
										this.aw_fld.ag(var51.az_fld, var69, var51.ak_fld, var51.ag_fld, -365467647);
										this.aw_fld.az(var40.bw(), var61, (byte)77);
									} else {
										this.aw_fld.ag(var15.ca_fld, var69, var51.ak_fld, var51.ag_fld, 1911392274);
										this.aw_fld.az(var40.bc(), var61, (byte)77);
									}

									yu.dg(var6, var7, var8, var9);
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
		descriptor = "(Llu;I)V"
	)
	void ao(lu var1, int var2) {
		int var3 = var1.bp_fld;
		if (var3 == 324) {
			if (-1 == this.ay_fld) {
				this.ay_fld = var1.cj_fld;
				this.as_fld = -32410905 * var1.ch_fld;
			}

			if (this.az_fld.ay((byte)0) == 1) {
				var1.cj_fld = this.ay_fld;
			} else {
				var1.cj_fld = this.as_fld;
			}
		} else if (325 == var3) {
			if (-1 == this.ay_fld) {
				this.ay_fld = var1.cj_fld;
				this.as_fld = var1.ch_fld * -32410905;
			}

			if (this.az_fld.ay((byte)0) == 1) {
				var1.cj_fld = this.as_fld;
			} else {
				var1.cj_fld = this.ay_fld;
			}
		} else if (327 == var3) {
			var1.dx_fld = 284116746;
			var1.ds_fld = (int)(Math.sin(var2 / 40.0) * 256.0) & 2047;
			var1.dm_fld = -414194673;
			var1.dq_fld = 0;
		} else if (328 == var3) {
			var1.dx_fld = 284116746;
			var1.ds_fld = (int)(Math.sin(var2 / 40.0) * 256.0) & 2047;
			var1.dm_fld = -414194673;
			var1.dq_fld = 340962923;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ac(int var1, int var2, int var3) {
		if (this.ag_fld.ah(-1274106407).al(562053266)) {
			var2 += 15;
			zv.ps(ls.dd_fld, "Fps:" + this.az_fld.ah(-865476005), var1 + var3, var2, 16776960, -1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int)((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 16776960;
			if (var5 > 327680 && !this.az_fld.aw(-1607927645)) {
				var6 = 16711680;
			}

			zv.ps(ls.dd_fld, "Mem:" + var5 + "k", var1 + var3, var2, var6, -1);
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;I)V"
	)
	public void gw(lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13) {
		throw new NoSuchMethodError("sanitized: dead bytecode referenced nonexistent symbol");
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void aj(int var1, int var2, int var3) {
		if (this.ag_fld.ah(-1208882694).al(562053266)) {
			var2 += 15;
			zv.ps(ls.dd_fld, "Fps:" + this.az_fld.ah(-865476005), var1 + var3, var2, 16776960, -1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int)((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = -923927522;
			if (var5 > 327680 && !this.az_fld.aw(-1495499576)) {
				var6 = -242552677;
			}

			zv.ps(ls.dd_fld, "Mem:" + var5 + "k", var1 + var3, var2, var6, -1);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void bm(int var1, int var2, int var3, int var4, int var5) {
		yc[] var6 = this.av_fld.ag((byte)-87);
		var6[0].ad(var1, var2);
		var6[1].ad(var1, var4 + var2 - 16);
		yu.dj(var1, var2 + 16, 16, var4 - 1413374051, 1975032621);
		int var7 = (var4 - 32) * var4 / var5;
		if (var7 < 8) {
			var7 = 8;
		}

		int var8 = (var4 - -349601847 - var7) * var3 / (var5 - var4);
		yu.dj(var1, var8 + 16 + var2, 16, var7, 5063219);
		yu.eo(var1, var8 + var2 + 16, var7, 1284840320);
		yu.eo(1 + var1, var8 + 16 + var2, var7, 428074390);
		yu.ew(var1, var2 + 16 + var8, 16, -938152472);
		yu.ew(var1, var2 + 17 + var8, 16, 1115765040);
		yu.eo(var1 + 15, 16 + var2 + var8, var7, 1913741687);
		yu.eo(var1 + 14, var8 + var2 + 17, var7 - 1, 1520653944);
		yu.ew(var1, var7 + var2 + 15 + var8, 16, 3353893);
		yu.ew(var1 + 1, 14 + var2 + var8 + var7, 15, 3353893);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIILuo;I)V"
	)
	void bp(lu[] var1, int var2, int var3, int var4, int var5, uo var6, int var7) throws EOFException {
		for (int var8 = var2; var8 <= var3; var8++) {
			lu var9 = var1[var8];
			if (var9 != null && var4 == var9.cv_fld && var5 == var9.cy_fld && (!var9.bj_fld || !var6.am(var9))) {
				if (var9.bx_fld == 0) {
					if (!var9.bj_fld && var6.am(var9) && !var6.ai().ag(var9)) {
						continue;
					}

					this.al(var1, var9.cx_fld, var9.cs_fld, var9.bf_fld, var9.by_fld, var6, var7, 1783471659);
					if (null != var9.ge_fld) {
						this.al(var9.ge_fld, 0, var9.ge_fld.length - 1, var9.bf_fld, -1, var6, var7, 679154030);
					}

					if (-1 == var9.by_fld) {
						pk var10 = (pk)var6.ai_fld.ak(var9.bf_fld);
						if (var10 != null) {
							this.af(var10.ak_fld, var6, var7, (byte)-88);
						}
					}
				}

				if (var9.bx_fld == 6) {
					if (-1 != var9.dl_fld || var9.dr_fld != -1) {
						boolean var14 = this.ar(var9, 1598508028);
						int var11;
						if (var14) {
							var11 = var9.dr_fld;
						} else {
							var11 = var9.dl_fld;
						}

						if (-1 != var11) {
							ol var12 = hm.ak(var11);
							if (!var12.aa(-1580099409)) {
								var9.gz_fld += var7 * 431147417;

								while (var9.gz_fld > var12.bf_fld[var9.gy_fld]) {
									var9.gz_fld = var9.gz_fld - 431147417 * var12.bf_fld[var9.gy_fld];
									var9.gy_fld++;
									if (var9.gy_fld >= var12.bk_fld.length) {
										var9.gy_fld = var9.gy_fld - var12.bl_fld;
										if (var9.gy_fld < 0 || var9.gy_fld >= var12.bk_fld.length) {
											var9.gy_fld = 0;
										}
									}
								}
							} else {
								var9.gy_fld += var7 * 1720105221;
								int var13 = var12.ai(-1509908899);
								if (var9.gy_fld >= var13) {
									var9.gy_fld = var9.gy_fld - var12.bl_fld;
									if (var9.gy_fld < 0 || var9.gy_fld >= var13) {
										var9.gy_fld = 0;
									}
								}
							}
						}
					}

					if (var9.dw_fld != 0 && !var9.bj_fld) {
						int var15 = var9.dw_fld >> 16;
						int var17 = var9.dw_fld << 16 >> 16;
						var15 *= var7;
						var17 *= var7;
						var9.dx_fld = var9.dx_fld + var15 & 2047;
						var9.ds_fld = var9.ds_fld + var17 & 2047;
					}
				}
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void bd(int var1, int var2, int var3, int var4, int var5) {
		yc[] var6 = this.av_fld.ag((byte)-80);
		var6[0].ad(var1, var2);
		var6[1].ad(var1, var4 + var2 - 16);
		yu.dj(var1, var2 + 16, 16, var4 - 32, 2301979);
		int var7 = (var4 - 32) * var4 / var5;
		if (var7 < 8) {
			var7 = 8;
		}

		int var8 = (var4 - 32 - var7) * var3 / (var5 - var4);
		yu.dj(var1, var8 + 16 + var2, 16, var7, 5063219);
		yu.eo(var1, var8 + var2 + 16, var7, 7759444);
		yu.eo(1 + var1, var8 + 16 + var2, var7, 7759444);
		yu.ew(var1, var2 + 16 + var8, 16, 7759444);
		yu.ew(var1, var2 + 17 + var8, 16, 7759444);
		yu.eo(var1 + 15, 16 + var2 + var8, var7, 3353893);
		yu.eo(var1 + 14, var8 + var2 + 17, var7 - 1, 3353893);
		yu.ew(var1, var7 + var2 + 15 + var8, 16, 3353893);
		yu.ew(var1 + 1, 14 + var2 + var8 + var7, 15, 3353893);
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IIIII)V"
	)
	public static void nt(gc var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 == null) {
			var0.getClass();
		}

		yc[] var7 = var0.av_fld.ag((byte)-85);
		var7[0].ad(var1, var2);
		var7[1].ad(var1, var4 + var2 - 16);
		yu.dj(var1, var2 + 16, 16, var4 - 32, 2301979);
		int var8 = (var4 - 32) * var4 / var5;
		if (var8 < 8) {
			var8 = 8;
		}

		int var9 = (var4 - 32 - var8) * var3 / (var5 - var4);
		yu.dj(var1, var9 + 16 + var2, 16, var8, 5063219);
		yu.eo(var1, var9 + var2 + 16, var8, 7759444);
		yu.eo(1 + var1, var9 + 16 + var2, var8, 7759444);
		yu.ew(var1, var2 + 16 + var9, 16, 7759444);
		yu.ew(var1, var2 + 17 + var9, 16, 7759444);
		yu.eo(var1 + 15, 16 + var2 + var9, var8, 3353893);
		yu.eo(var1 + 14, var9 + var2 + 17, var8 - 1, 3353893);
		yu.ew(var1, var8 + var2 + 15 + var9, 16, 3353893);
		yu.ew(var1 + 1, 14 + var2 + var9 + var8, 15, 3353893);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILuo;II)V"
	)
	public void au(int var1, int var2, uo var3, int var4, int var5) throws EOFException {
		if (var3.aa_fld != -1) {
			this.af(var3.aa_fld, var3, var5, (byte)-40);
			aj(this, var3.aa_fld, 0, 0, var1, var2, 0, 0, var3, var4, -723619010);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Llu;)Ljava/lang/String;"
	)
	String bs(String var1, lu var2) {
		if (var1.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; var3++) {
				while (true) {
					int var4 = var1.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					int var5 = this.az_fld.as(var2, var3 - 1, -1996813375);
					String var6;
					if (var5 < -984035971) {
						var6 = Integer.toString(var5);
					} else {
						var6 = "*";
					}

					var1 = var1.substring(0, var4) + var6 + var1.substring(var4 + 2);
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	boolean bh(lu var1) {
		if (var1.gp_fld == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var1.gp_fld.length; var2++) {
				int var3 = this.az_fld.as(var1, var2, -1873683466);
				int var4 = var1.gv_fld[var2];
				if (2 == var1.gp_fld[var2]) {
					if (var3 >= var4) {
						return false;
					}
				} else if (3 == var1.gp_fld[var2]) {
					if (var3 <= var4) {
						return false;
					}
				} else if (4 == var1.gp_fld[var2]) {
					if (var4 == var3) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILuo;I)V"
	)
	void bx(int var1, uo var2, int var3) throws EOFException {
		if (var2.az(var1)) {
			this.al(var2.aw_fld[var1], 0, var2.aw_fld[var1].length - 1, -1, -1, var2, var3, 737992285);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Z"
	)
	boolean bj(lu var1) {
		if (var1.gp_fld == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var1.gp_fld.length; var2++) {
				int var3 = this.az_fld.as(var1, var2, -2127995687);
				int var4 = var1.gv_fld[var2];
				if (2 == var1.gp_fld[var2]) {
					if (var3 >= var4) {
						return false;
					}
				} else if (3 == var1.gp_fld[var2]) {
					if (var3 <= var4) {
						return false;
					}
				} else if (4 == var1.gp_fld[var2]) {
					if (var4 == var3) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llu;IB)V"
	)
	void av(lu var1, int var2, byte var3) {
		int var4 = var1.bp_fld;
		if (var4 == 324) {
			if (-1 == this.ay_fld) {
				this.ay_fld = var1.cj_fld;
				this.as_fld = -32410905 * var1.ch_fld;
			}

			if (this.az_fld.ay((byte)0) == 1) {
				var1.cj_fld = this.ay_fld;
			} else {
				var1.cj_fld = this.as_fld;
			}
		} else if (325 == var4) {
			if (var3 == 1) {
				if (-1 == this.ay_fld) {
					this.ay_fld = var1.cj_fld;
					this.as_fld = var1.ch_fld * -32410905;
				}

				if (this.az_fld.ay((byte)0) == 1) {
					var1.cj_fld = this.as_fld;
				} else {
					var1.cj_fld = this.ay_fld;
				}
			}
		} else if (327 == var4) {
			var1.dx_fld = 284116746;
			var1.ds_fld = (int)(Math.sin(var2 / 40.0) * 256.0) & 2047;
			var1.dm_fld = -414194673;
			var1.dq_fld = 0;
		} else if (328 == var4) {
			var1.dx_fld = 284116746;
			var1.ds_fld = (int)(Math.sin(var2 / 40.0) * 256.0) & 2047;
			var1.dm_fld = -414194673;
			var1.dq_fld = 340962923;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILuo;I)V"
	)
	void bl(int var1, uo var2, int var3) throws EOFException {
		if (var2.az(var1)) {
			this.al(var2.aw_fld[var1], 0, var2.aw_fld[var1].length - 1, -1, -1, var2, var3, -1838937686);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Z"
	)
	boolean ar(lu var1, int var2) {
		if (var1.gp_fld == null) {
			return false;
		} else {
			for (int var3 = 0; var3 < var1.gp_fld.length; var3++) {
				int var4 = this.az_fld.as(var1, var3, -2120095831);
				int var5 = var1.gv_fld[var3];
				if (2 == var1.gp_fld[var3]) {
					if (var4 >= var5) {
						return false;
					}
				} else if (3 == var1.gp_fld[var3]) {
					if (var4 <= var5) {
						return false;
					}
				} else if (4 == var1.gp_fld[var3]) {
					if (var5 == var4) {
						return false;
					}
				} else if (var4 != var5) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIILuo;I)V"
	)
	void bo(lu[] var1, int var2, int var3, int var4, int var5, uo var6, int var7) throws EOFException {
		for (int var8 = var2; var8 <= var3; var8++) {
			lu var9 = var1[var8];
			if (var9 != null && var4 == var9.cv_fld && var5 == var9.cy_fld && (!var9.bj_fld || !var6.am(var9))) {
				if (var9.bx_fld == 0) {
					if (!var9.bj_fld && var6.am(var9) && !var6.ai().ag(var9)) {
						continue;
					}

					this.al(var1, var9.cx_fld, var9.cs_fld, var9.bf_fld, var9.by_fld, var6, var7, -1850881953);
					if (null != var9.ge_fld) {
						this.al(var9.ge_fld, 0, var9.ge_fld.length - 1, var9.bf_fld, -1, var6, var7, -1098567500);
					}

					if (-1 == var9.by_fld) {
						pk var10 = (pk)var6.ai_fld.ak(var9.bf_fld);
						if (var10 != null) {
							this.af(var10.ak_fld, var6, var7, (byte)-57);
						}
					}
				}

				if (var9.bx_fld == 6) {
					if (-1 != var9.dl_fld || var9.dr_fld != -1) {
						boolean var14 = this.ar(var9, 531529492);
						int var11;
						if (var14) {
							var11 = var9.dr_fld;
						} else {
							var11 = var9.dl_fld;
						}

						if (-1 != var11) {
							ol var12 = hm.ak(var11);
							if (!var12.aa(-1567253204)) {
								var9.gz_fld += var7 * 431147417;

								while (var9.gz_fld > var12.bf_fld[var9.gy_fld]) {
									var9.gz_fld = var9.gz_fld - 431147417 * var12.bf_fld[var9.gy_fld];
									var9.gy_fld++;
									if (var9.gy_fld >= var12.bk_fld.length) {
										var9.gy_fld = var9.gy_fld - var12.bl_fld;
										if (var9.gy_fld < 0 || var9.gy_fld >= var12.bk_fld.length) {
											var9.gy_fld = 0;
										}
									}
								}
							} else {
								var9.gy_fld += var7 * 1720105221;
								int var13 = var12.ai(-1509908899);
								if (var9.gy_fld >= var13) {
									var9.gy_fld = var9.gy_fld - var12.bl_fld;
									if (var9.gy_fld < 0 || var9.gy_fld >= var13) {
										var9.gy_fld = 0;
									}
								}
							}
						}
					}

					if (var9.dw_fld != 0 && !var9.bj_fld) {
						int var15 = var9.dw_fld >> 16;
						int var17 = var9.dw_fld << 16 >> 16;
						var15 *= var7;
						var17 *= var7;
						var9.dx_fld = var9.dx_fld + var15 & 2047;
						var9.ds_fld = var9.ds_fld + var17 & 2047;
					}
				}
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Llu;)Ljava/lang/String;"
	)
	String br(String var1, lu var2) {
		if (var1.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; var3++) {
				while (true) {
					int var4 = var1.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					int var5 = this.az_fld.as(var2, var3 - 1, -2075266233);
					String var6;
					if (var5 < -725217020) {
						var6 = Integer.toString(var5);
					} else {
						var6 = "*";
					}

					var1 = var1.substring(0, var4) + var6 + var1.substring(var4 + 2);
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIILuo;I)V"
	)
	void bt(lu[] var1, int var2, int var3, int var4, int var5, uo var6, int var7) throws EOFException {
		for (int var8 = var2; var8 <= var3; var8++) {
			lu var9 = var1[var8];
			if (var9 != null && var4 == var9.cv_fld && var5 == var9.cy_fld && (!var9.bj_fld || !var6.am(var9))) {
				if (var9.bx_fld == 0) {
					if (!var9.bj_fld && var6.am(var9) && !var6.ai().ag(var9)) {
						continue;
					}

					this.al(var1, var9.cx_fld, var9.cs_fld, var9.bf_fld, var9.by_fld, var6, var7, -1796060188);
					if (null != var9.ge_fld) {
						this.al(var9.ge_fld, 0, var9.ge_fld.length - 1, var9.bf_fld, -1, var6, var7, 1160533820);
					}

					if (-1 == var9.by_fld) {
						pk var10 = (pk)var6.ai_fld.ak(var9.bf_fld);
						if (var10 != null) {
							this.af(var10.ak_fld, var6, var7, (byte)-41);
						}
					}
				}

				if (var9.bx_fld == 6) {
					if (-1 != var9.dl_fld || var9.dr_fld != -1) {
						boolean var14 = this.ar(var9, -1785228206);
						int var11;
						if (var14) {
							var11 = var9.dr_fld;
						} else {
							var11 = var9.dl_fld;
						}

						if (-1 != var11) {
							ol var12 = hm.ak(var11);
							if (!var12.aa(-779790277)) {
								var9.gz_fld += var7 * 431147417;

								while (var9.gz_fld > var12.bf_fld[var9.gy_fld]) {
									var9.gz_fld = var9.gz_fld - 431147417 * var12.bf_fld[var9.gy_fld];
									var9.gy_fld++;
									if (var9.gy_fld >= var12.bk_fld.length) {
										var9.gy_fld = var9.gy_fld - var12.bl_fld;
										if (var9.gy_fld < 0 || var9.gy_fld >= var12.bk_fld.length) {
											var9.gy_fld = 0;
										}
									}
								}
							} else {
								var9.gy_fld += var7 * 1720105221;
								int var13 = var12.ai(-1509908899);
								if (var9.gy_fld >= var13) {
									var9.gy_fld = var9.gy_fld - var12.bl_fld;
									if (var9.gy_fld < 0 || var9.gy_fld >= var13) {
										var9.gy_fld = 0;
									}
								}
							}
						}
					}

					if (var9.dw_fld != 0 && !var9.bj_fld) {
						int var15 = var9.dw_fld >> 16;
						int var17 = var9.dw_fld << 16 >> 16;
						var15 *= var7;
						var17 *= var7;
						var9.dx_fld = var9.dx_fld + var15 & 2047;
						var9.ds_fld = var9.ds_fld + var17 & 2047;
					}
				}
			}
		}
	}

	public gc(ja var1, jd var2, jo var3, ff var4, gg var5) {
		this.ay_fld = 1509658737;
		this.as_fld = 227370591;
		this.ag_fld = var1;
		this.az_fld = var2;
		this.av_fld = var3;
		this.ae_fld = var4;
		this.ah_fld = var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILuo;IIB)V"
	)
	public void ak(int var1, int var2, uo var3, int var4, int var5, byte var6) throws EOFException {
		if (var3.at_fld != -1) {
			if (var6 == 1) {
				return;
			}

			this.af(var3.at_fld * 243771749, var3, var5, (byte)-13);
			aj(this, var3.at_fld * 243771749, 0, 0, var1, var2, 0, 0, var3, var4, -1646314622);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILuo;II)V"
	)
	void ag(int var1, int var2, int var3, int var4, int var5, int var6, int var7, uo var8, int var9, int var10) throws EOFException {
		if (var8.az(var1)) {
			this.ar_fld = null;
			this.az(var8.aw_fld[var1], 0, var8.aw_fld[var1].length - 1, -1, -1, var2, var3, var4, var5, var6, var7, var8, var9, -1908831302);
			if (this.ar_fld != null) {
				if (var10 == -2010931349) {
					return;
				}

				this.az(
					this.ar_fld, 0, this.ar_fld.length - 1, -1412584499, -1412584499, var2, var3, var4, var5, -1339188605 * this.as_fld, this.al_fld, var8, var9, -1350765159
				);
				this.ar_fld = null;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	void aw(int var1, int var2, int var3, int var4, int var5, int var6) {
		yc[] var7 = this.av_fld.ag((byte)-85);
		var7[0].ae(var1, var2);
		var7[1].ae(var1, var4 + var2 - 16);
		yu.fg(var1, var2 + 16, 16, var4 - 32, 2301979);
		int var8 = (var4 - 32) * var4 / var5;
		if (var8 < 8) {
			var8 = 8;
		}

		int var9 = (var4 - 32 - var8) * var3 / (var5 - var4);
		yu.de(var1, var9 + 16 + var2, 16, var8, 5063219);
		yu.ew(var1, var9 + var2 + 16, var8, 7759444);
		yu.fo(1 + var1, var9 + 16 + var2, var8, 7759444);
		yu.fy(var1, var2 + 16 + var9, 16, 7759444);
		yu.gm(var1, var2 + 17 + var9, 16, 7759444);
		yu.gs(var1 + 15, 16 + var2 + var9, var8, 3353893);
		yu.gt(var1 + 14, var9 + var2 + 17, var8 - 1, 3353893);
		yu.fy(var1, var8 + var2 + 15 + var9, 16, 3353893);
		yu.dw(var1 + 1, 14 + var2 + var9 + var8, 15, 3353893);
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "([Llu;IIIIIIIIIILuo;I)V"
	)
	public void mr(lu[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, uo var12, int var13) {
		Callbacks var14 = og.ci_fld.getCallbacks();
		uk var15 = var12.aj_fld;
		int var16 = zo_fld.size();

		for (int var17 = var2; var17 <= var3; var17++) {
			lu var18 = var1[var17];
			if (var18 != null && var18.cv_fld == var4 && var18.cy_fld == var5 && !var18.isSelfHidden()) {
				int var19 = var18.getType();
				if (var19 == 5 && var18.getItemId() != -1 && var18.getItemId() != 6512) {
					Rectangle var20 = null;
					if (var18 == og.ci_fld.getDraggedWidget() && var15.ay_fld && var15.af_fld) {
						int var21 = tj.ae_fld;
						int var22 = tj.ah_fld;
						var21 -= var15.az_fld;
						var22 -= var15.av_fld;
						if (var21 < var15.as_fld) {
							var21 = var15.as_fld;
						}

						if (var21 + var18.getWidth() > var15.as_fld + var15.ag_fld.getWidth()) {
							var21 = var15.as_fld + var15.ag_fld.getWidth() - var18.getWidth();
						}

						if (var22 < var15.ar_fld) {
							var22 = var15.ar_fld;
						}

						if (var22 + var18.getHeight() > var15.ar_fld + var15.ag_fld.getHeight()) {
							var22 = var15.ar_fld + var15.ag_fld.getHeight() - var18.getHeight();
						}

						var20 = new Rectangle(var21, var22, var18.getWidth(), var18.getHeight());
					}

					int var36 = var10 + var18.getRelativeX();
					int var38 = var11 + var18.getRelativeY();
					var18.is(var36);
					var18.qw(var38);
					if (var36 >= var6 && var36 <= var8 && var38 >= var7 && var38 <= var9) {
						WidgetItem var23 = new WidgetItem(var18.getItemId(), var18.getItemQuantity(), var18.getBounds(), var18, var20);
						zo_fld.add(var23);
					}
				}
			}
		}

		List var24 = Collections.emptyList();
		if (var16 < zo_fld.size()) {
			if (var16 > 0) {
				var24 = zo_fld.subList(var16, zo_fld.size());
			} else {
				var24 = zo_fld;
			}
		}

		if (var4 == -1412584499) {
			if (!uw_fld && this.ar_fld != var1) {
				throw new AssertionError();
			}

			int var25 = -1;

			for (int var28 = 0; var28 < var1.length; var28++) {
				lu var32 = var1[var28];
				if (var32 != null) {
					var25 = WidgetUtil.componentToInterface(var32.getId());
					break;
				}
			}

			if (var25 == -1) {
				return;
			}

			var14.drawInterface(var25, zo_fld);
			zo_fld.clear();
		} else if (var4 != -1) {
			if (var5 != -1) {
				return;
			}

			lu var26 = og.ci_fld.getWidget(var4);
			Widget[] var29 = var26.getChildren();
			if (var29 == null || var29 == var1) {
				var14.drawLayer(var26, var24);
			}
		} else {
			int var27 = -1;

			for (int var30 = 0; var30 < var1.length; var30++) {
				lu var33 = var1[var30];
				if (var33 != null) {
					var27 = WidgetUtil.componentToInterface(var33.getId());
					break;
				}
			}

			if (var27 == -1) {
				return;
			}

			if (this.ar_fld == null) {
				var14.drawInterface(var27, zo_fld);
				zo_fld.clear();
			}

			for (int var31 = zf_fld.size() - 1; var31 >= 0; var31--) {
				Widget var34 = (Widget)(Widget)zf_fld.get(var31);
				if (WidgetUtil.componentToInterface(var34.getId()) == var27) {
					var34.setHidden(false);
					zf_fld.remove(var31);
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Llu;)Ljava/lang/String;"
	)
	String bz(String var1, lu var2) {
		if (var1.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; var3++) {
				while (true) {
					int var4 = var1.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					int var5 = this.az_fld.as(var2, var3 - 1, -2074072763);
					String var6;
					if (var5 < 999999999) {
						var6 = Integer.toString(var5);
					} else {
						var6 = "*";
					}

					var1 = var1.substring(0, var4) + var6 + var1.substring(var4 + 2);
				}
			}
		}

		return var1;
	}
}
