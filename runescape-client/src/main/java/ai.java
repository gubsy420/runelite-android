import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ai")
public class ai extends vw {
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	an ak_fld;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bi_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al al() {
		if (this.ak_fld != null && this.ak_fld.az_fld.tryLock()) {
			al var1;
			try {
				var1 = dm(this, -450296581);
			} finally {
				this.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	public ai() {
		this.ak_fld = null;
	}

	public ai(al var1) {
		this.ak_fld = new an(null, var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean as() {
		return null == this.ak_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lal;"
	)
	public al ag() {
		if (this.ak_fld != null && this.ak_fld.az_fld.tryLock()) {
			al var2;
			try {
				var2 = dm(this, 785737354);
			} finally {
				this.ak_fld.az_fld.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lai;)Lal;"
	)
	public static al hh(ai var0) {
		if (null != var0.ak_fld) {
			var0.ak_fld.az_fld.lock();

			al var1;
			try {
				var1 = dm(var0, 1382697372);
			} finally {
				var0.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lal;"
	)
	public al az() {
		if (null != this.ak_fld) {
			this.ak_fld.az_fld.lock();

			al var2;
			try {
				var2 = dm(this, -1501197418);
			} finally {
				this.ak_fld.az_fld.unlock();
			}

			return var2;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FI)F"
	)
	public static final float ae(float var0) {
		float var2 = 150.75377F / (var0 - 1.0100503F);
		return var2 / 14925.0F / 1.0100503F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ae() {
		return null == this.ak_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ah() {
		return null == this.ak_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al am() {
		if (null == this.ak_fld.ag_fld) {
			this.ak_fld.ag_fld = this.ak_fld.ak_fld.ao(null);
			this.ak_fld.ak_fld = null;
		}

		return this.ak_fld.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ay() {
		return null == this.ak_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ak() {
		return null == this.ak_fld;
	}

	ai(bz var1) {
		if (var1 != null) {
			this.ak_fld = new an(var1, null);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al au() {
		if (this.ak_fld != null && this.ak_fld.az_fld.tryLock()) {
			al var1;
			try {
				var1 = dm(this, -832250806);
			} finally {
				this.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al aa() {
		if (null != this.ak_fld) {
			this.ak_fld.az_fld.lock();

			al var1;
			try {
				var1 = dm(this, 1366082961);
			} finally {
				this.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al ai() {
		if (null != this.ak_fld) {
			this.ak_fld.az_fld.lock();

			al var1;
			try {
				var1 = dm(this, -634791640);
			} finally {
				this.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lai;I)Lal;"
	)
	public static al dm(ai var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var0.ak_fld.ag_fld) {
			var0.ak_fld.ag_fld = var0.ak_fld.ak_fld.ao(null);
			var0.ak_fld.ak_fld = null;
		}

		return var0.ak_fld.ag_fld;
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lai;)Lal;"
	)
	public static al py(ai var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var0.ak_fld) {
			var0.ak_fld.az_fld.lock();

			al var1;
			try {
				var1 = dm(var0, 1930513500);
			} finally {
				var0.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al aq() {
		if (null == this.ak_fld.ag_fld) {
			this.ak_fld.ag_fld = this.ak_fld.ak_fld.ao(null);
			this.ak_fld.ak_fld = null;
		}

		return this.ak_fld.ag_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	public al ar() {
		if (this.ak_fld != null && this.ak_fld.az_fld.tryLock()) {
			al var1;
			try {
				var1 = dm(this, 106711759);
			} finally {
				this.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "(Lai;)Lal;"
	)
	public static al rm(ai var0) {
		if (var0.ak_fld != null && var0.ak_fld.az_fld.tryLock()) {
			al var1;
			try {
				var1 = dm(var0, -1016296161);
			} finally {
				var0.ak_fld.az_fld.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aw() {
		return null == this.ak_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al ao() {
		if (null == this.ak_fld.ag_fld) {
			this.ak_fld.ag_fld = this.ak_fld.ak_fld.ao(null);
			this.ak_fld.ak_fld = null;
		}

		return this.ak_fld.ag_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bz(int var0, ba var1, boolean var2) throws EOFException {
		try {
			lu var4 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			if (2600 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cp_fld;
				return 1;
			} else if (2601 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ce_fld;
				return 1;
			} else if (var0 == 2602) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.dp_fld;
				return 1;
			} else if (2603 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cn_fld;
				return 1;
			} else if (2604 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cr_fld;
				return 1;
			} else if (2605 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.db_fld;
				return 1;
			} else if (var0 == 2606) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.dx_fld;
				return 1;
			} else if (var0 == 2607) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.du_fld;
				return 1;
			} else if (2608 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ds_fld;
				return 1;
			} else if (var0 == 2609) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cb_fld;
				return 1;
			} else if (2610 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.co_fld;
				return 1;
			} else if (2611 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ca_fld;
				return 1;
			} else if (var0 == 2612) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cg_fld;
				return 1;
			} else if (var0 == 2613) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ck_fld.ag(-1455922202);
				return 1;
			} else if (2614 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.dn_fld ? 1 : 0;
				return 1;
			} else {
				if (2617 == var0) {
					ln var5 = var4.bi(2027771629);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var5 ? var5.ak_fld : 0;
				}

				if (2618 == var0) {
					ln var25 = var4.bi(354405877);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var25 != null ? var25.ag_fld : 0;
					return 1;
				} else if (2619 == var0) {
					li var24 = lu.ax(var4, -1776742275);
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var24 != null ? li.mb(var24, 1769898168).ah() : "";
					return 1;
				} else if (var0 == 2620) {
					ln var23 = var4.bi(1536171649);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var23 ? var23.az_fld : 0;
					return 1;
				} else if (2621 == var0) {
					li var22 = lu.ax(var4, -1880200542);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var22 ? li.ge(var22, 625521875) : 0;
					return 1;
				} else if (var0 == 2622) {
					li var21 = lu.ax(var4, -532549016);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var21 ? var21.cx() : 0;
					return 1;
				} else if (var0 == 2623) {
					li var20 = lu.ax(var4, -501151198);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var20 ? var20.cs() : 0;
					return 1;
				} else if (var0 == 2624) {
					li var19 = lu.ax(var4, -1003045015);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var19 != null && var19.bb() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (2626 == var0) {
						li var18 = lu.ax(var4, -1484438494);
						bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var18 ? var18.ba().ak() : "";
						return 1;
					} else if (2627 == var0) {
						li var17 = lu.ax(var4, -2029948542);
						int var6 = var17 != null ? var17.cc() : 0;
						int var7 = null != var17 ? li.em(var17, (byte)11) : 0;
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Math.min(var6, var7);
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 2628) {
						li var16 = lu.ax(var4, -584103881);
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var16 ? li.em(var16, (byte)52) : 0;
						return 1;
					} else if (var0 == 2629) {
						li var15 = lu.ax(var4, -1178645032);
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var15 ? var15.cn() : 0;
						return 1;
					} else if (var0 == 2630) {
						li var14 = lu.ax(var4, -1835922240);
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var14 != null ? var14.cp() : 0;
						return 1;
					} else if (var0 == 2631) {
						li var13 = lu.ax(var4, -2074071534);
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var13 != null ? li.uu(var13, (byte)12) : 0;
						return 1;
					} else if (var0 == 2632) {
						li var12 = lu.ax(var4, -2114617661);
						bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12 != null ? var12.cg() : 0;
						return 1;
					} else if (var0 == 2633) {
						sc var11 = var4.bu(-850185034);
						bp.au_fld[gz.ax_fld - 1] = null != var11 ? var11.az(bp.au_fld[gz.ax_fld - 1], -27326864) : 0;
						return 1;
					} else if (var0 == 2634) {
						sc var10 = var4.bu(-864577391);
						bp.au_fld[gz.ax_fld - 1] = var10 != null ? var10.av((char)bp.au_fld[gz.ax_fld - 1]) : 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					li var9 = lu.ax(var4, -881867854);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var9 && var9.bg() ? 1 : 0;
					return 1;
				}
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	al ad() {
		if (null == this.ak_fld.ag_fld) {
			this.ak_fld.ag_fld = this.ak_fld.ak_fld.ao(null);
			this.ak_fld.ak_fld = null;
		}

		return this.ak_fld.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Lzf;Lzf;I)V"
	)
	static void ay(tf var0, zf var1, zf var2, int var3) throws FileNotFoundException, EOFException {
		try {
			if (bn.dq_fld) {
				rw.ao(var0, (byte)-85);
			} else {
				if ((1 == tj.ay_fld || !gu.hh_fld && 4 == tj.ay_fld) && tj.as_fld >= bn.bo_fld + 765 - 50 && tj.ar_fld >= 453 && tj.as_fld < bn.bo_fld + 765) {
					if (var3 != -736506160) {
						return;
					}

					if (tj.ar_fld < 503) {
						if (var3 != -736506160) {
							return;
						}

						cn.eu(cx.kq_fld, !cn.mv(cx.kq_fld, (short)21537), (byte)2);
						if (cn.mv(cx.kq_fld, (short)29865)) {
							sx.av(0, 0);
						} else {
							cp.bh("scape main", 255);
						}

						ah.ay();
					}
				}

				if (client.cl_fld != 5) {
					if (bn.dg_fld == -1L) {
						if (var3 != -736506160) {
							return;
						}

						bn.dg_fld = lz.ak() + 1000L;
					}

					long var4 = lz.ak();
					if (dx.au() && -1L == bn.dw_fld) {
						bn.dw_fld = var4;
						if (bn.dw_fld > bn.dg_fld) {
							bn.dg_fld = -1995937146888333109L * bn.dw_fld;
						}
					}

					if (10 == client.cl_fld || client.cl_fld == 11) {
						if (ku.gi_fld == xh.ak_fld) {
							if (tj.ay_fld == 1 || !gu.hh_fld && tj.ay_fld == 4) {
								int var6 = bn.bo_fld + 5;
								short var7 = 463;
								byte var8 = 100;
								byte var9 = 35;
								if (tj.as_fld >= var6 && tj.as_fld <= var8 + var6 && tj.ar_fld >= var7 && tj.ar_fld <= var9 + var7) {
									ow.ap();
									return;
								}
							}

							if (null != ct.ar_fld) {
								ow.ap();
							}
						}

						int var25 = tj.ay_fld;
						int var26 = tj.as_fld;
						int var27 = tj.ar_fld;
						if (0 == var25) {
							var26 = tj.ae_fld;
							var27 = tj.ah_fld;
						}

						if (!gu.hh_fld) {
							if (var3 != -736506160) {
								return;
							}

							if (4 == var25) {
								var25 = 1;
							}
						}

						fi var28 = iq.ay();
						if (0 == bn.co_fld) {
							boolean var61 = false;

							while (var28.az()) {
								if (84 == var28.aw_fld) {
									var61 = true;
								}
							}

							int var90 = bh.cb_fld - 80;
							short var105 = 291;
							if (1 == var25) {
								if (var3 != -736506160) {
									return;
								}

								if (var26 >= var90 - 75) {
									if (var3 != -736506160) {
										return;
									}

									if (var26 <= var90 + 75 && var27 >= var105 - 20 && var27 <= 20 + var105) {
										if (var3 != -736506160) {
											return;
										}

										by.ak(ph.hj("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws");
									}
								}
							}

							var90 = bh.cb_fld + 80;
							if (1 == var25 && var26 >= var90 - 75 && var26 <= 75 + var90 && var27 >= var105 - 20 && var27 <= 20 + var105 || var61) {
								if (hh.ar()) {
									if (client.dq_fld) {
										if (var3 != -736506160) {
											return;
										}

										if (bn.ba_fld != null && !bn.ba_fld.isEmpty()) {
											if (var3 != -736506160) {
												return;
											}

											bn.dz_fld = 1451298735;
											return;
										}
									}

									bn.dz_fld = 0;
								} else {
									lu.ai(false, (byte)-7);
								}
							}
						} else if (bn.co_fld == 1) {
							boolean var60 = client.de(og.ci_fld, (byte)122) || og.ci_fld.ie(1065694878) || og.ci_fld.iz(-2031365706);

							while (var28.az()) {
								if (var28.aw_fld == 84) {
									if (var60) {
										cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
										client.dm_fld = aao.ag_fld;
										ik.bz(false, 415314445);
										jk.af(20, (byte)-33);
									} else {
										lu.ai(false, (byte)110);
									}

									return;
								}

								if (13 == var28.aw_fld) {
									ei.aq(true);
									return;
								}
							}

							int var88 = bh.cb_fld - 80;
							short var104 = 321;
							if (1 == var25 && var26 >= var88 - 75 && var26 <= 75 + var88 && var27 >= var104 - 20 && var27 <= var104 + 20) {
								if (var3 != -736506160) {
									return;
								}

								if (var60) {
									cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
									client.dm_fld = aao.ag_fld;
									ik.bz(false, 1262952839);
									jk.af(20, (byte)6);
								} else {
									lu.ai(false, (byte)-33);
								}

								return;
							}

							var88 = bh.cb_fld + 80;
							if (var25 == 1 && var26 >= var88 - 75 && var26 <= var88 + 75 && var27 >= var104 - 20 && var27 <= 20 + var104) {
								ei.aq(true);
								return;
							}
						} else if (2 == bn.co_fld) {
							boolean var10000;
							short var55 = 201;
							int var56 = var55 + 52;
							if (var25 == 1 && var27 >= var56 - 12 && var27 < var56 + 2) {
								bn.dz_fld = 0;
							}

							var56 += 15;
							if (var25 == 1) {
								if (var3 != -736506160) {
									return;
								}

								if (var27 >= var56 - 12) {
									if (var3 != -736506160) {
										return;
									}

									if (var27 < var56 + 2) {
										bn.dz_fld = 1451298735;
									}
								}
							}

							var56 += 15;
							short var59 = 361;
							if (cg.bc_fld != null) {
								if (var3 != -736506160) {
									return;
								}

								int var83 = cg.bc_fld.ah_fld / 2;
								if (var25 == 1 && var26 >= cg.bc_fld.av_fld - var83 && var26 <= var83 + cg.bc_fld.av_fld && var27 >= var59 - 15 && var27 < var59) {
									switch (bn.bu_fld) {
										case 1:
											by.ak(kh.mi_fld);
											return;
										case 2:
											by.ak("https://support.runescape.com/hc/en-gb");
									}
								}
							}

							int var84 = bh.cb_fld - 80;
							short var101 = 321;
							if (1 == var25 && var26 >= var84 - 75) {
								if (var3 != -736506160) {
									return;
								}

								if (var26 <= var84 + 75 && var27 >= var101 - 20) {
									if (var3 != -736506160) {
										return;
									}

									if (var27 <= 20 + var101) {
										bn.ba_fld = bn.ba_fld.trim();
										client.og();
										if (bn.ba_fld.isEmpty()) {
											cl.ad(kh.fb_fld, kh.fk_fld, kh.fc_fld);
										} else if (bn.bq_fld.isEmpty()) {
											cl.ad(kh.fh_fld, kh.fm_fld, kh.fe_fld);
										} else {
											cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
											ik.bz(false, 795041858);
											jk.af(20, (byte)-27);
										}

										return;
									}
								}
							}

							var84 = 180 + bn.ck_fld + 80;
							if (var25 == 1 && var26 >= var84 - 75 && var26 <= var84 + 75) {
								if (var3 != -736506160) {
									return;
								}

								if (var27 >= var101 - 20 && var27 <= var101 + 20) {
									jz.ac(0);
									bn.ba_fld = "";
									client.og();
									bn.bq_fld = "";
									pe.cc_fld = 0;
									he.cq_fld = "";
									bn.cv_fld = true;
								}
							}

							label1380: {
								var84 = bh.cb_fld + -117;
								var101 = 277;
								if (var26 >= var84 && var26 < var84 + om.cl_fld && var27 >= var101) {
									if (var3 != -736506160) {
										return;
									}

									if (var27 < hk.dc_fld + var101) {
										var10000 = true;
										break label1380;
									}
								}

								var10000 = false;
							}

							bn.dh_fld = var10000;
							if (var25 == 1 && bn.dh_fld) {
								boolean var133;
								if (!client.dq_fld) {
									if (var3 != -736506160) {
										return;
									}

									var133 = true;
								} else {
									var133 = false;
								}

								client.dq_fld = var133;
								if (!client.dq_fld && cn.xx(cx.kq_fld, -1496496789) != null) {
									if (var3 != -736506160) {
										return;
									}

									cx.kq_fld.ac(null, -1923458067);
								}
							}

							var84 = bh.cb_fld + 24;
							var101 = 277;
							boolean var134;
							if (var26 >= var84 && var26 < var84 + om.cl_fld && var27 >= var101 && var27 < hk.dc_fld + var101) {
								if (var3 != -736506160) {
									return;
								}

								var134 = true;
							} else {
								var134 = false;
							}

							bn.dv_fld = var134;
							if (1 == var25 && bn.dv_fld) {
								cx.kq_fld.ay(!cx.kq_fld.bl(867710262), (byte)8);
								if (!cx.kq_fld.bl(1846569233)) {
									bn.ba_fld = "";
									client.og();
									cx.kq_fld.ac(null, -1989790931);
									if (client.dq_fld && null != bn.ba_fld && !bn.ba_fld.isEmpty()) {
										bn.dz_fld = 1451298735;
									} else {
										bn.dz_fld = 0;
									}
								}
							}

							label1355:
							while (var28.az()) {
								if (13 == var28.aw_fld) {
									jz.ac(0);
									bn.ba_fld = "";
									client.og();
									bn.bq_fld = "";
									pe.cc_fld = 0;
									he.cq_fld = "";
									bn.cv_fld = true;
								} else if (bn.dz_fld == 0) {
									char var111 = var28.ah_fld;

									for (int var118 = 0; var118 < bn.dt_fld.length(); var118++) {
										if (var111 == bn.dt_fld.charAt(var118)) {
											if (var3 != -736506160) {
												return;
											}
											break;
										}
									}

									if (85 == var28.aw_fld && !bn.ba_fld.isEmpty()) {
										bn.ba_fld = bn.ba_fld.substring(0, bn.ba_fld.length() - 1);
										client.og();
									}

									if (84 == var28.aw_fld || var28.aw_fld == 80) {
										bn.dz_fld = 1451298735;
									}

									char var124 = var28.ah_fld;
									boolean var119 = bn.dt_fld.indexOf(var124) != -1;
									if (var119 && bn.ba_fld.length() < 320) {
										bn.ba_fld = bn.ba_fld + var28.ah_fld;
										client.og();
									}
								} else if (1 == bn.dz_fld) {
									if (85 == var28.aw_fld && !bn.bq_fld.isEmpty()) {
										bn.bq_fld = bn.bq_fld.substring(0, bn.bq_fld.length() - 1);
									} else {
										label1480: {
											if (var28.aw_fld != 84) {
												if (var28.aw_fld != 80) {
													break label1480;
												}

												if (var3 != -736506160) {
													return;
												}
											}

											bn.dz_fld = 0;
											if (var28.aw_fld == 84) {
												bn.ba_fld = bn.ba_fld.trim();
												client.og();
												if (bn.ba_fld.isEmpty()) {
													cl.ad(kh.fb_fld, kh.fk_fld, kh.fc_fld);
												} else if (bn.bq_fld.isEmpty()) {
													cl.ad(kh.fh_fld, kh.fm_fld, kh.fe_fld);
												} else {
													cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
													ik.bz(false, 46307655);
													jk.af(20, (byte)95);
												}

												return;
											}
										}
									}

									label1332: {
										if (!var28.as(82)) {
											if (var3 != -736506160) {
												return;
											}

											if (!var28.as(87)) {
												break label1332;
											}
										}

										if (67 == var28.aw_fld) {
											Clipboard var112 = Toolkit.getDefaultToolkit().getSystemClipboard();
											Transferable var120 = var112.getContents(og.ci_fld);
											int var125 = 20 - bn.bq_fld.length();
											if (var125 > 0) {
												if (var3 != -736506160) {
													return;
												}

												try {
													String var127 = (String)(String)var120.getTransferData(DataFlavor.stringFlavor);
													int var128 = Math.min(var125, var127.length());
													int var129 = 0;

													while (true) {
														if (var129 >= var128) {
															bn.bq_fld = bn.bq_fld + var127.substring(0, var128);
															continue label1355;
														}

														if (!ap.ag(var127.charAt(var129))) {
															break;
														}

														char var132 = var127.charAt(var129);
														if (bn.dt_fld.indexOf(var132) != -1) {
															if (var3 != -736506160) {
																return;
															}

															var134 = true;
														} else {
															var134 = false;
														}

														boolean var130 = var134;
														if (!var130) {
															break;
														}

														var129++;
													}

													jz.ac(3);
													return;
												} catch (UnsupportedFlavorException var22) {
												} catch (IOException var23) {
												}
											}
											continue;
										}
									}

									if (ap.ag(var28.ah_fld)) {
										if (var3 != -736506160) {
											return;
										}

										char var121 = var28.ah_fld;
										boolean var113 = bn.dt_fld.indexOf(var121) != -1;
										if (var113) {
											if (var3 != -736506160) {
												return;
											}

											if (bn.bq_fld.length() < 20) {
												bn.bq_fld = bn.bq_fld + var28.ah_fld;
											}
										}
									}
								}
							}
						} else if (bn.co_fld == 3) {
							int var10 = bn.ck_fld + 180;
							short var11 = 241;
							uf var12 = zv.qj(var1, 25, kh.kv_fld.length() - 34, kh.kv_fld, var10, var11);
							if (1 == var25 && uf.uk(var12, var26, var27)) {
								if (var3 != -736506160) {
									return;
								}

								by.ak(kh.mc_fld);
							}

							var10 = 180 + bn.ck_fld;
							var11 = 276;
							if (1 == var25 && var26 >= var10 - 75 && var26 <= var10 + 75 && var27 >= var11 - 20 && var27 <= var11 + 20) {
								ei.aq(false);
							}

							var10 = bn.ck_fld + 180;
							var11 = 326;
							if (1 == var25 && var26 >= var10 - 75 && var26 <= var10 + 75 && var27 >= var11 - 20 && var27 <= var11 + 20) {
								if (var3 != -736506160) {
									return;
								}

								by.ak(kh.mi_fld);
								return;
							}
						} else if (bn.co_fld == 4) {
							if (var3 != -736506160) {
								return;
							}

							int var31 = bn.ck_fld + 180 - 80;
							short var64 = 321;
							if (1 == var25 && var26 >= var31 - 75 && var26 <= var31 + 75 && var27 >= var64 - 20) {
								if (var3 != -736506160) {
									return;
								}

								if (var27 <= 20 + var64) {
									he.cq_fld.trim();
									if (he.cq_fld.length() != 6) {
										cl.ad(kh.cy_fld, kh.cf_fld, kh.cx_fld);
									} else {
										pe.cc_fld = Integer.parseInt(he.cq_fld);
										he.cq_fld = "";
										ik.bz(true, 115428786);
										cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
										jk.af(20, (byte)73);
									}

									return;
								}
							}

							if (var25 == 1) {
								if (var3 != -736506160) {
									return;
								}

								if (var26 >= bn.ck_fld + 180 - 9 && var26 <= bn.ck_fld + 180 + 130 && var27 >= 263 && var27 <= 296) {
									bn.cv_fld = !bn.cv_fld;
								}
							}

							if (var25 == 1 && var26 >= bn.ck_fld + 180 - 34 && var26 <= 34 + 180 + bn.ck_fld) {
								if (var3 != -736506160) {
									return;
								}

								if (var27 >= 351 && var27 <= 363) {
									by.ak(kh.mi_fld);
								}
							}

							var31 = 80 + bn.ck_fld + 180;
							if (1 == var25 && var26 >= var31 - 75) {
								if (var3 != -736506160) {
									return;
								}

								if (var26 <= var31 + 75 && var27 >= var64 - 20 && var27 <= var64 + 20) {
									jz.ac(0);
									bn.ba_fld = "";
									client.og();
									bn.bq_fld = "";
									pe.cc_fld = 0;
									he.cq_fld = "";
								}
							}

							while (var28.az()) {
								boolean var92 = false;

								for (int var13 = 0; var13 < bn.dm_fld.length(); var13++) {
									if (var3 != -736506160) {
										return;
									}

									if (var28.ah_fld == bn.dm_fld.charAt(var13)) {
										var92 = true;
										break;
									}
								}

								if (var28.aw_fld == 13) {
									jz.ac(0);
									bn.ba_fld = "";
									client.og();
									bn.bq_fld = "";
									pe.cc_fld = 0;
									he.cq_fld = "";
								} else {
									if (var28.aw_fld == 85 && !he.cq_fld.isEmpty()) {
										he.cq_fld = he.cq_fld.substring(0, he.cq_fld.length() - 1);
									}

									if (var28.aw_fld == 84) {
										hs.as();
										return;
									}

									if (var92 && he.cq_fld.length() < 6) {
										he.cq_fld = he.cq_fld + var28.ah_fld;
									}
								}
							}
						} else if (5 == bn.co_fld) {
							int var33 = bn.ck_fld + 180 - 80;
							short var65 = 321;
							if (1 == var25 && var26 >= var33 - 75 && var26 <= var33 + 75 && var27 >= var65 - 20 && var27 <= var65 + 20) {
								bn.ba_fld = bn.ba_fld.trim();
								client.og();
								if (bn.ba_fld.isEmpty()) {
									cl.ad(kh.kx_fld, kh.kk_fld, kh.kg_fld);
								} else {
									long var108 = id.ak();
									int var94;
									if (var108 == 0L) {
										if (var3 != -736506160) {
											return;
										}

										var94 = 5;
									} else {
										var94 = qc.ag(var108, bn.ba_fld);
									}

									switch (var94) {
										case 2:
											cl.ad(kh.ks_fld, kh.kb_fld, kh.li_fld);
											jz.ac(6);
											break;
										case 3:
											cl.ad(kh.le_fld, kh.lb_fld, kh.lw_fld);
											break;
										case 4:
											cl.ad(kh.lg_fld, kh.ln_fld, kh.lf_fld);
											break;
										case 5:
											cl.ad(kh.ld_fld, kh.lp_fld, kh.ll_fld);
											break;
										case 6:
											cl.ad(kh.lo_fld, kh.lu_fld, kh.lt_fld);
											break;
										case 7:
											cl.ad(kh.lr_fld, kh.lx_fld, kh.lj_fld);
									}
								}

								return;
							}

							var33 = 180 + bn.ck_fld + 80;
							if (1 == var25 && var26 >= var33 - 75 && var26 <= var33 + 75 && var27 >= var65 - 20 && var27 <= var65 + 20) {
								lu.ai(true, (byte)117);
							}

							short var93 = 361;
							if (gp.bw_fld != null) {
								if (var3 != -736506160) {
									return;
								}

								int var106 = gp.bw_fld.ah_fld / 2;
								if (var25 == 1 && var26 >= gp.bw_fld.av_fld - var106 && var26 <= var106 + gp.bw_fld.av_fld && var27 >= var93 - 15 && var27 < var93) {
									by.ak(ph.hj("secure", true) + "m=weblogin/g=oldscape/cant_log_in");
								}
							}

							while (var28.az()) {
								boolean var107 = false;

								for (int var14 = 0; var14 < bn.dt_fld.length(); var14++) {
									if (var28.ah_fld == bn.dt_fld.charAt(var14)) {
										var107 = true;
										break;
									}
								}

								if (13 == var28.aw_fld) {
									lu.ai(true, (byte)23);
								} else {
									if (var28.aw_fld == 85 && !bn.ba_fld.isEmpty()) {
										bn.ba_fld = bn.ba_fld.substring(0, bn.ba_fld.length() - 1);
										client.og();
									}

									if (84 == var28.aw_fld) {
										bn.ba_fld = bn.ba_fld.trim();
										client.og();
										if (bn.ba_fld.isEmpty()) {
											cl.ad(kh.kx_fld, kh.kk_fld, kh.kg_fld);
										} else {
											long var15 = id.ak();
											int var114;
											if (0L == var15) {
												var114 = 5;
											} else {
												var114 = qc.ag(var15, bn.ba_fld);
											}

											switch (var114) {
												case 2:
													cl.ad(kh.ks_fld, kh.kb_fld, kh.li_fld);
													jz.ac(6);
													break;
												case 3:
													cl.ad(kh.le_fld, kh.lb_fld, kh.lw_fld);
													break;
												case 4:
													cl.ad(kh.lg_fld, kh.ln_fld, kh.lf_fld);
													break;
												case 5:
													cl.ad(kh.ld_fld, kh.lp_fld, kh.ll_fld);
													break;
												case 6:
													cl.ad(kh.lo_fld, kh.lu_fld, kh.lt_fld);
													break;
												case 7:
													cl.ad(kh.lr_fld, kh.lx_fld, kh.lj_fld);
											}
										}

										return;
									}

									if (var107 && bn.ba_fld.length() < 320) {
										if (var3 != -736506160) {
											return;
										}

										bn.ba_fld = bn.ba_fld + var28.ah_fld;
										client.og();
									}
								}
							}
						} else if (6 != bn.co_fld) {
							if (bn.co_fld == 7) {
								if (fv.dh_fld) {
									if (var3 != -736506160) {
										return;
									}

									if (!client.gz_fld) {
										boolean var126;
										int var38 = bh.cb_fld - 150;
										int var67 = 40 + 25 + 240 + var38;
										short var95 = 231;
										int var109 = 40 + var95;
										if (1 == var25 && var26 >= var38 && var26 <= var67 && var27 >= var95 && var27 <= var109) {
											bn.bb_fld = by.aa(var38, var26);
										}

										int var115 = bn.ck_fld + 180 - 80;
										short var122 = 321;
										if (1 == var25 && var26 >= var115 - 75 && var26 <= 75 + var115) {
											if (var3 != -736506160) {
												return;
											}

											if (var27 >= var122 - 20 && var27 <= 20 + var122) {
												var126 = aq.af();
												if (var126) {
													jk.af(50, (byte)62);
													return;
												}
											}
										}

										var115 = 180 + bn.ck_fld + 80;
										if (var25 == 1 && var26 >= var115 - 75 && var26 <= var115 + 75 && var27 >= var122 - 20 && var27 <= 20 + var122) {
											if (var3 != -736506160) {
												return;
											}

											bn.cd_fld = new String[8];
											lu.ai(true, (byte)-31);
										}

										do {
											if (!var28.az()) {
												return;
											}

											if (var3 != -736506160) {
												return;
											}

											if (101 == var28.aw_fld) {
												if (var3 != -736506160) {
													return;
												}

												bn.cd_fld[bn.bb_fld] = null;
											}

											if (85 == var28.aw_fld) {
												if (null == bn.cd_fld[bn.bb_fld] && bn.bb_fld > 0) {
													bn.bb_fld--;
												}

												bn.cd_fld[bn.bb_fld] = null;
											}

											if (var28.ah_fld >= '0' && var28.ah_fld <= '9') {
												bn.cd_fld[bn.bb_fld] = "" + var28.ah_fld;
												if (bn.bb_fld < 7) {
													bn.bb_fld++;
												}
											}
										} while (var28.aw_fld != 84);

										if (var3 != -736506160) {
											return;
										}

										label1135: {
											Date var17;
											try {
												var17 = dt.an();
											} catch (ParseException var21) {
												sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
												var126 = false;
												break label1135;
											}

											if (null == var17) {
												var126 = false;
											} else {
												Calendar var19 = Calendar.getInstance();
												var19.set(1, var19.get(1) - 13);
												var19.set(5, var19.get(5) + 1);
												var19.set(11, 0);
												var19.set(12, 0);
												var19.set(13, 0);
												var19.set(14, 0);
												Date var20 = var19.getTime();
												boolean var18 = var17.before(var20);
												boolean var131 = gi.al(var17);
												if (!var131) {
													sc.ax("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
													var126 = false;
												} else {
													if (!var18) {
														fe.bg_fld = 1229895895;
													} else {
														fe.bg_fld = (int)(var17.getTime() / 86400000L - 11745L);
													}

													var126 = true;
												}
											}
										}

										if (var126) {
											jk.af(50, (byte)13);
										}

										return;
									}
								}

								int var36 = bn.ck_fld + 180 - 80;
								short var66 = 321;
								if (var25 == 1) {
									if (var3 != -736506160) {
										return;
									}

									if (var26 >= var36 - 75 && var26 <= var36 + 75 && var27 >= var66 - 20 && var27 <= 20 + var66) {
										by.ak(ph.hj("secure", true) + "m=dob/set_dob.ws");
										cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
										jz.ac(6);
										return;
									}
								}

								var36 = 80 + 180 + bn.ck_fld;
								if (var25 == 1) {
									if (var3 != -736506160) {
										return;
									}

									if (var26 >= var36 - 75 && var26 <= var36 + 75) {
										if (var3 != -736506160) {
											return;
										}

										if (var27 >= var66 - 20 && var27 <= 20 + var66) {
											if (var3 != -736506160) {
												return;
											}

											lu.ai(true, (byte)78);
										}
									}
								}
							} else if (8 == bn.co_fld) {
								int var39 = bn.ck_fld + 180 - 80;
								short var68 = 321;
								if (1 == var25 && var26 >= var39 - 75 && var26 <= 75 + var39 && var27 >= var68 - 20) {
									if (var3 != -736506160) {
										return;
									}

									if (var27 <= var68 + 20) {
										by.ak("https://legal.jagex.com/docs/policies/privacy");
										cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
										jz.ac(6);
										return;
									}
								}

								var39 = 180 + bn.ck_fld + 80;
								if (var25 == 1 && var26 >= var39 - 75 && var26 <= var39 + 75) {
									if (var3 != -736506160) {
										return;
									}

									if (var27 >= var68 - 20 && var27 <= 20 + var68) {
										lu.ai(true, (byte)44);
									}
								}
							} else if (9 == bn.co_fld) {
								if (var3 != -736506160) {
									return;
								}

								int var41 = 180 + bn.ck_fld;
								short var69 = 311;
								boolean var96 = 1 == var25 && var26 >= var41 - 75 && var26 <= var41 + 75 && var27 >= var69 - 20 && var27 <= var69 + 20;

								while (var28.az()) {
									if (var28.aw_fld == 84 || var28.aw_fld == 13) {
										var96 = true;
									}
								}

								if (var96) {
									ei.aq(false);
								}
							} else if (bn.co_fld == 10) {
								int var42 = 180 + bn.ck_fld;
								short var70 = 209;
								boolean var97 = var25 == 1 && var26 >= var42 - 109 && var26 <= var42 + 109 && var27 >= var70 && var27 <= var70 + 68;

								while (var28.az()) {
									if (var28.aw_fld == 84) {
										if (var3 != -736506160) {
											return;
										}

										var97 = true;
									}
								}

								if (var97) {
									if (var3 != -736506160) {
										return;
									}

									if (hh.ar()) {
										return;
									}

									cl.ad(kh.jy_fld, kh.jc_fld, kh.je_fld);
									client.dm_fld = aao.ag_fld;
									ik.bz(false, -185796150);
									jk.af(20, (byte)-34);
								}
							} else if (bn.co_fld == 12) {
								int var43 = bh.cb_fld;
								short var71 = 233;
								uf var98 = zv.qj(var2, 0, 30, kh.ly_fld, var43, var71);
								uf var110 = zv.qj(var2, 32, 32, kh.ly_fld, var43, var71);
								uf var117 = zv.qj(var2, 70, 34, kh.ly_fld, var43, var71);
								int var72 = var71 + 17;
								uf var123 = zv.qj(var2, 0, 34, kh.lv_fld, var43, var72);
								if (var25 == 1) {
									if (uf.uk(var98, var26, var27)) {
										by.ak("https://legal.jagex.com/docs/terms");
									} else if (uf.uk(var110, var26, var27)) {
										by.ak("https://legal.jagex.com/docs/policies/privacy");
									} else if (uf.uk(var117, var26, var27) || uf.uk(var123, var26, var27)) {
										by.ak("https://legal.jagex.com/docs/terms/eula");
									}
								}

								var43 = bh.cb_fld - 80;
								short var73 = 311;
								if (var25 == 1 && var26 >= var43 - 75) {
									if (var3 != -736506160) {
										return;
									}

									if (var26 <= 75 + var43 && var27 >= var73 - 20 && var27 <= var73 + 20) {
										ds.hc(96818182);
										ei.aq(true);
									}
								}

								var43 = bh.cb_fld + 80;
								if (var25 == 1 && var26 >= var43 - 75 && var26 <= 75 + var43) {
									if (var3 != -736506160) {
										return;
									}

									if (var27 >= var73 - 20 && var27 <= var73 + 20) {
										bn.co_fld = -1104655693;
									}
								}
							} else if (bn.co_fld == 13) {
								int var46 = bh.cb_fld;
								short var74 = 321;
								if (var25 == 1 && var26 >= var46 - 75 && var26 <= 75 + var46 && var27 >= var74 - 20 && var27 <= 20 + var74) {
									ei.aq(true);
								}
							} else if (14 == bn.co_fld) {
								String var47 = "";
								switch (bn.bi_fld) {
									case 0:
										var47 = "https://secure.runescape.com/m=offence-appeal/account-history";
										break;
									case 1:
										var47 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
										break;
									case 2:
										var47 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
										break;
									default:
										lu.ai(false, (byte)70);
								}

								int var75 = bn.ck_fld + 180;
								short var99 = 276;
								if (1 == var25 && var26 >= var75 - 75 && var26 <= var75 + 75 && var27 >= var99 - 20 && var27 <= var99 + 20) {
									by.ak(var47);
									cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
									jz.ac(6);
									return;
								}

								var75 = 180 + bn.ck_fld;
								var99 = 326;
								if (1 == var25 && var26 >= var75 - 75 && var26 <= var75 + 75) {
									if (var3 != -736506160) {
										return;
									}

									if (var27 >= var99 - 20 && var27 <= var99 + 20) {
										lu.ai(false, (byte)85);
									}
								}
							} else if (24 == bn.co_fld) {
								if (var3 != -736506160) {
									return;
								}

								int var48 = bn.ck_fld + 180;
								short var77 = 301;
								if (1 == var25 && var26 >= var48 - 75 && var26 <= var48 + 75 && var27 >= var77 - 20 && var27 <= var77 + 20) {
									ei.aq(false);
								}
							} else if (32 == bn.co_fld) {
								int var49 = bn.ck_fld + 180 - 80;
								short var78 = 321;
								if (1 == var25 && var26 >= var49 - 75 && var26 <= var49 + 75 && var27 >= var78 - 20 && var27 <= var78 + 20) {
									by.ak(ph.hj("secure", true) + "m=dob/set_dob.ws");
									cl.ad(kh.kd_fld, kh.kp_fld, kh.kj_fld);
									jz.ac(6);
									return;
								}

								var49 = 180 + bn.ck_fld + 80;
								if (1 == var25 && var26 >= var49 - 75 && var26 <= var49 + 75 && var27 >= var78 - 20 && var27 <= var78 + 20) {
									lu.ai(true, (byte)5);
								}
							} else if (bn.co_fld == 33) {
								int var51 = 180 + bn.ck_fld;
								short var79 = 276;
								if (var25 == 1 && var26 >= var51 - 75 && var26 <= var51 + 75 && var27 >= var79 - 20 && var27 <= 20 + var79) {
									by.ak(kh.mc_fld);
								}

								var51 = bn.ck_fld + 180;
								var79 = 326;
								if (var25 == 1) {
									if (var3 != -736506160) {
										return;
									}

									if (var26 >= var51 - 75 && var26 <= 75 + var51 && var27 >= var79 - 20 && var27 <= 20 + var79) {
										lu.ai(true, (byte)29);
									}
								}
							} else if (34 == bn.co_fld) {
								int var53 = bn.ck_fld + 180;
								short var81 = 276;
								if (var25 == 1 && var26 >= var53 - 75 && var26 <= 75 + var53 && var27 >= var81 - 20 && var27 <= var81 + 20) {
									ow.ap();
									return;
								}

								if (ct.ar_fld != null) {
									ow.ap();
								}

								var53 = bn.ck_fld + 180;
								var81 = 326;
								if (var25 == 1 && var26 >= var53 - 75 && var26 <= 75 + var53) {
									if (var3 != -736506160) {
										return;
									}

									if (var27 >= var81 - 20) {
										if (var3 != -736506160) {
											return;
										}

										if (var27 <= 20 + var81) {
											lu.ai(false, (byte)78);
										}
									}
								}
							}
						} else {
							while (var28.az()) {
								if (var28.aw_fld == 84 || 13 == var28.aw_fld) {
									lu.ai(true, (byte)-74);
								}
							}

							short var35 = 321;
							if (var25 == 1 && var27 >= var35 - 20 && var27 <= 20 + var35) {
								lu.ai(true, (byte)24);
							}
						}
					}
				}
			}
		} catch (Throwable var24) {
			throw new RuntimeException(var24);
		}
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lcs;I)V"
	)
	static final void ex(dx var0, cs var1, int var2) {
		ev var3 = var0.az_fld;
		long var4 = 0L;
		int var6 = -1;
		int var7 = 0;
		int var8 = 0;
		if (var1.az_fld == 0) {
			var4 = var3.cd(var1.ag_fld, var1.av_fld, var1.ae_fld);
		}

		if (var1.az_fld == 1) {
			if (var2 >= -1254596105) {
				return;
			}

			var4 = ev.vm(var3, var1.ag_fld, var1.av_fld, var1.ae_fld);
		}

		if (2 == var1.az_fld) {
			var4 = var3.cq(var1.ag_fld, var1.av_fld, var1.ae_fld);
		}

		if (3 == var1.az_fld) {
			var4 = var3.cv(var1.ag_fld, var1.av_fld, var1.ae_fld);
		}

		if (var4 != 0L) {
			int var9 = var3.cx(var1.ag_fld, var1.av_fld, var1.ae_fld, var4);
			var6 = bj.ae(var4);
			var7 = var9 & 31;
			var8 = var9 >> 6 & 3;
		}

		var1.ah_fld = var6;
		var1.ay_fld = var7;
		var1.aw_fld = var8;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lal;"
	)
	al av(int var1) {
		if (null == this.ak_fld.ag_fld) {
			this.ak_fld.ag_fld = this.ak_fld.ak_fld.ab(null);
			this.ak_fld.ak_fld = null;
		}

		return this.ak_fld.ag_fld;
	}
}
