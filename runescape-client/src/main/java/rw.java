import java.io.EOFException;
import java.io.FileNotFoundException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rw")
public class rw {
	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	static byte[][] lh_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	public static rw az_fld = new rw();
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	public static rw ak_fld = new rw();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	public static rw ag_fld = new rw();
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;

	rw() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltf;B)V"
	)
	static void ao(tf var0, byte var1) throws FileNotFoundException, EOFException {
		fi var2 = iq.ay();

		while (var2.az()) {
			if (13 == var2.aw_fld) {
				if (34 == bn.co_fld) {
					lu.ai(false, (byte)-62);
				}

				bn.dq_fld = false;
				yu.dj(0, 0, yu.au_fld, yu.ax_fld, 0);
				hu.ce_fld.dq(bn.bo_fld, 0);
				nq.cn_fld.dq(382 + bn.bo_fld, 0);
				hk.cr_fld.ae(bn.bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
				return;
			}

			if (96 == var2.aw_fld) {
				if (bn.du_fld > 0 && null != wt.dk_fld) {
					if (var1 == 13) {
						return;
					}

					bn.du_fld--;
				}
			} else if (var2.aw_fld == 97 && bn.du_fld < bn.db_fld && null != bi.dx_fld) {
				bn.du_fld++;
			}
		}

		if (tj.ay_fld != 1) {
			if (var1 == 13) {
				return;
			}

			if (gu.hh_fld || 4 != tj.ay_fld) {
				return;
			}

			if (var1 == 13) {
				return;
			}
		}

		int var3 = bn.bo_fld + 280;
		if (tj.as_fld >= var3 && tj.as_fld <= 14 + var3) {
			if (var1 == 13) {
				return;
			}

			if (tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(0, 0, 2048865486);
				return;
			}
		}

		if (tj.as_fld >= var3 + 15 && tj.as_fld <= 80 + var3) {
			if (var1 == 13) {
				return;
			}

			if (tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(0, 1, -1772587468);
				return;
			}
		}

		int var4 = 390 + bn.bo_fld;
		if (tj.as_fld >= var4 && tj.as_fld <= 14 + var4) {
			if (var1 == 13) {
				return;
			}

			if (tj.ar_fld >= 4) {
				if (var1 == 13) {
					return;
				}

				if (tj.ar_fld <= 18) {
					jk.ag(1, 0, 1773094055);
					return;
				}
			}
		}

		if (tj.as_fld < var4 + 15 || tj.as_fld > 80 + var4 || tj.ar_fld < 4 || tj.ar_fld > 18) {
			int var5 = 500 + bn.bo_fld;
			if (tj.as_fld >= var5) {
				if (var1 == 13) {
					return;
				}

				if (tj.as_fld <= 14 + var5 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
					if (var1 == 13) {
						return;
					}

					jk.ag(2, 0, 885560213);
					return;
				}
			}

			if (tj.as_fld >= 15 + var5 && tj.as_fld <= var5 + 80) {
				if (var1 == 13) {
					return;
				}

				if (tj.ar_fld >= 4 && tj.ar_fld <= 18) {
					jk.ag(2, 1, 971129826);
					return;
				}
			}

			int var6 = 610 + bn.bo_fld;
			if (tj.as_fld >= var6 && tj.as_fld <= var6 + 14 && tj.ar_fld >= 4) {
				if (var1 == 13) {
					return;
				}

				if (tj.ar_fld <= 18) {
					jk.ag(3, 0, -1718256028);
					return;
				}
			}

			if (tj.as_fld >= var6 + 15 && tj.as_fld <= 80 + var6 && tj.ar_fld >= 4 && tj.ar_fld <= 18) {
				jk.ag(3, 1, 2071746045);
			} else if (tj.as_fld >= bn.bo_fld + 708 && tj.ar_fld >= 4 && tj.as_fld <= 708 + bn.bo_fld + 50 && tj.ar_fld <= 20) {
				if (var1 != 13) {
					if (34 == bn.co_fld) {
						if (var1 == 13) {
							return;
						}

						lu.ai(false, (byte)38);
					}

					bn.dq_fld = false;
					yu.dj(0, 0, yu.au_fld, yu.ax_fld, 0);
					hu.ce_fld.dq(bn.bo_fld, 0);
					nq.cn_fld.dq(382 + bn.bo_fld, 0);
					hk.cr_fld.ae(bn.bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
				}
			} else if (bn.ds_fld != -1) {
				ct var7 = yd.ae_fld[bn.ds_fld];
				boolean var8 = bp.ak(client.gt_fld, wu.ai_fld);
				boolean var9 = var7.al(-29492843);
				ku.dc_fld = var9;
				var7.an_fld = var9 ? "beta" : var7.an_fld;
				mv.ab(var7, 1958573397);
				if (34 == bn.co_fld) {
					lu.ai(false, (byte)5);
				}

				bn.dq_fld = false;
				yu.dj(0, 0, yu.au_fld, yu.ax_fld, 0);
				hu.ce_fld.dq(bn.bo_fld, 0);
				nq.cn_fld.dq(bn.bo_fld + 382, 0);
				hk.cr_fld.ae(bn.bo_fld + 382 - hk.cr_fld.az_fld / 2, 18);
				if (var8 != var9) {
					cb.as((byte)-86);
				}
			} else {
				if (bn.du_fld > 0 && wt.dk_fld != null && tj.as_fld >= 0) {
					if (var1 == 13) {
						return;
					}

					if (tj.as_fld <= wt.dk_fld.az_fld && tj.ar_fld >= bc.qx_fld / 2 - 50 && tj.ar_fld <= bc.qx_fld / 2 + 50) {
						bn.du_fld--;
					}
				}

				if (bn.du_fld < bn.db_fld) {
					if (var1 == 13) {
						return;
					}

					if (null != bi.dx_fld && tj.as_fld >= pf.qw_fld - bi.dx_fld.az_fld - 5 && tj.as_fld <= pf.qw_fld) {
						if (var1 == 13) {
							return;
						}

						if (tj.ar_fld >= bc.qx_fld / 2 - 50 && tj.ar_fld <= 50 + bc.qx_fld / 2) {
							bn.du_fld++;
						}
					}
				}
			}
		} else if (var1 != 13) {
			jk.ag(1, 1, 2033734877);
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int vm(da var0) {
		return var0.bn_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)I"
	)
	public static int ak(int var0, int var1, int var2) {
		var2 &= 3;
		if (0 == var2) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}
}
