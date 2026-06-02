import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bh")
public class bh {
	@ObfuscatedGetter(
		intValue = -1842857219
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld = 0;
	@ObfuscatedGetter(
		intValue = 370435613
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld = 0;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] az_fld = null;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedGetter(
		intValue = -105675495
	)
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cb_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av() {
		int var2 = this.az_fld[this.ag_fld] >> this.ak_fld & 1;
		this.ak_fld++;
		this.ag_fld = this.ag_fld + (this.ak_fld >> 3) * 961229397;
		this.ak_fld &= -1701918005;
		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ak(int var1, int var2) {
		int var3 = 0;
		int var4 = 0;

		while (var1 >= 8 - this.ak_fld) {
			int var5 = 8 - this.ak_fld;
			int var6 = (1 << var5) - 1;
			var3 += (this.az_fld[this.ag_fld] >> this.ak_fld & var6) << var4;
			this.ak_fld = 0;
			this.ag_fld++;
			var4 += var5;
			var1 -= var5;
		}

		if (var1 > 0) {
			int var7 = (1 << var1) - 1;
			var3 += (this.az_fld[this.ag_fld] >> this.ak_fld & var7) << var4;
			this.ak_fld += 779848757 * var1;
		}

		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int ao(int var0, ba var1, boolean var2) {
		lu var4 = var2 ? gs.ap_fld : bp.ab_fld;
		if (1600 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cp_fld;
			return 1;
		} else if (var0 == 1601) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ce_fld;
			return 1;
		} else if (1602 == var0) {
			if (12 == var4.bx_fld) {
				li var25 = lu.bv(var4, -2038984526);
				if (null != var25) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var25.bc().ah();
					return 1;
				}
			}

			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var4.dp_fld;
			return 1;
		} else if (1603 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cn_fld;
			return 1;
		} else if (var0 == 1604) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cr_fld;
			return 1;
		} else if (1605 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.db_fld;
			return 1;
		} else if (1606 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.dx_fld;
			return 1;
		} else if (1607 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.du_fld;
			return 1;
		} else if (var0 == 1608) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ds_fld;
			return 1;
		} else if (1609 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cb_fld;
			return 1;
		} else if (var0 == 1610) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.co_fld;
			return 1;
		} else if (var0 == 1611) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ca_fld;
			return 1;
		} else if (1612 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.cg_fld;
			return 1;
		} else if (var0 == 1613) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.ck_fld.ag(1510166875);
			return 1;
		} else if (var0 == 1614) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var4.dn_fld ? 1 : 0;
			return 1;
		} else {
			if (1617 == var0) {
				ln var5 = var4.bi(-578232759);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5 != null ? var5.ak_fld : 0;
			}

			if (var0 == 1618) {
				ln var24 = var4.bi(-139402965);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var24 != null ? var24.ag_fld : 0;
				return 1;
			} else if (var0 == 1619) {
				li var23 = lu.bv(var4, -1498262069);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var23 ? var23.bw().ah() : "";
				return 1;
			} else if (1620 == var0) {
				ln var22 = var4.bi(-214998846);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var22 ? var22.az_fld : 0;
				return 1;
			} else if (1621 == var0) {
				li var21 = lu.bv(var4, -842594304);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var21 ? var21.cf() : 0;
				return 1;
			} else if (1622 == var0) {
				li var20 = lu.bv(var4, -539610030);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var20 != null ? var20.cx() : 0;
				return 1;
			} else if (1623 == var0) {
				li var19 = lu.bv(var4, -696605918);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var19 != null ? li.ih(var19, (byte)5) : 0;
				return 1;
			} else if (1624 == var0) {
				li var18 = lu.bv(var4, -1506481867);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var18 != null && li.vk(var18, (byte)34) ? 1 : 0;
				return 1;
			} else if (1625 != var0) {
				if (var0 == 1626) {
					li var17 = lu.bv(var4, -2123873050);
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var17 != null ? var17.ba().ak() : "";
					return 1;
				} else if (var0 == 1627) {
					li var16 = lu.bv(var4, -1087251015);
					int var6 = null != var16 ? var16.cc() : 0;
					int var7 = var16 != null ? li.dg(var16, (byte)-29) : 0;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Math.min(var6, var7);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Math.max(var6, var7);
					return 1;
				} else if (1628 == var0) {
					li var15 = lu.bv(var4, -1125385900);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var15 ? li.dg(var15, (byte)33) : 0;
					return 1;
				} else if (1629 == var0) {
					li var14 = lu.bv(var4, -1761619998);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var14 != null ? var14.cn() : 0;
					return 1;
				} else if (1630 == var0) {
					li var13 = lu.bv(var4, -1029534996);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var13 ? var13.cp() : 0;
					return 1;
				} else if (var0 == 1631) {
					li var12 = lu.bv(var4, -819351958);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var12 != null ? li.rz(var12, (byte)121) : 0;
					return 1;
				} else if (var0 == 1632) {
					li var11 = lu.bv(var4, -2012092754);
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var11 != null ? var11.cg() : 0;
					return 1;
				} else if (1633 == var0) {
					sc var10 = var4.bu(-1356446230);
					bp.au_fld[gz.ax_fld - 1] = null != var10 ? sc.ed(var10, bp.au_fld[gz.ax_fld - 1]) : 0;
					return 1;
				} else if (1634 == var0) {
					sc var9 = var4.bu(-263555530);
					bp.au_fld[gz.ax_fld - 1] = var9 != null ? var9.av((char)bp.au_fld[gz.ax_fld - 1]) : 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				li var8 = lu.bv(var4, -669148820);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var8 && var8.bg() ? 1 : 0;
				return 1;
			}
		}
	}

	bh() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ay() {
		int var1 = this.az_fld[this.ag_fld] >> this.ak_fld & 1;
		this.ak_fld++;
		this.ag_fld = this.ag_fld + (this.ak_fld >> 3) * 961229397;
		this.ak_fld &= -1701918005;
		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BI)V"
	)
	void ar(byte[] var1, int var2) {
		this.az_fld = var1;
		this.ag_fld = var2;
		this.ak_fld = 0;
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lbh;)I"
	)
	public static int ns(bh var0) {
		int var1 = var0.az_fld[var0.ag_fld * -1147705734] >> var0.ak_fld & 1;
		var0.ak_fld++;
		var0.ag_fld = var0.ag_fld + (var0.ak_fld >> 3) * -1810998573;
		var0.ak_fld = (var0.ak_fld & 7) * 225574760;
		return var1;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lbh;[BI)V"
	)
	public static void jm(bh var0, byte[] var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.az_fld = var1;
			var0.ag_fld = var2;
			var0.ak_fld = 0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ag(int var1) {
		int var2 = 0;
		int var3 = 0;

		while (var1 >= 8 - this.ak_fld) {
			int var4 = 8 - this.ak_fld;
			int var5 = (1 << var4) - 1;
			var2 += (this.az_fld[this.ag_fld] >> this.ak_fld & var5) << var3;
			this.ak_fld = 0;
			this.ag_fld++;
			var3 += var4;
			var1 -= var4;
		}

		if (var1 > 0) {
			int var6 = (1 << var1) - 1;
			var2 += (this.az_fld[this.ag_fld] >> this.ak_fld & var6) << var3;
			this.ak_fld += 779848757 * var1;
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FFFF)F"
	)
	static final float az(float var0, float var1, float var2, float var3) {
		return var0 * var2 - var1 * var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public static boolean ak(int var0, int var1, int var2) {
		return (var0 >> var1 & 1) != 0;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(Lbh;I)I"
	)
	public static int du(bh var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var2 = 0;
			int var3 = 0;

			while (var1 >= 8 - var0.ak_fld) {
				int var4 = 8 - var0.ak_fld;
				int var5 = (1 << var4) - 1;
				var2 += (var0.az_fld[var0.ag_fld] >> var0.ak_fld & var5) << var3;
				var0.ak_fld = 0;
				var0.ag_fld++;
				var3 += var4;
				var1 -= var4;
			}

			if (var1 > 0) {
				int var6 = (1 << var1) - 1;
				var2 += (var0.az_fld[var0.ag_fld] >> var0.ak_fld & var6) << var3;
				var0.ak_fld += 779848757 * var1;
			}

			return var2;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BII)V"
	)
	void az(byte[] var1, int var2, int var3) {
		this.az_fld = var1;
		this.ag_fld = var2;
		this.ak_fld = 0;
	}
}
