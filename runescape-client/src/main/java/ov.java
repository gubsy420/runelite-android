import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ov")
public class ov extends vc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1612882831
	)
	public int ax_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ay_fld = new iw(64);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -818707745
	)
	public int as_fld = 0;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -257869793
	)
	public int ar_fld = -304104415;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 969392233
	)
	public int aq_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2003604399
	)
	public int au_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 118789131
	)
	public int al_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -318949387
	)
	public int an_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1404626681
	)
	public int aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1747055815
	)
	public int ai_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean af_fld = true;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void az(byte var1) {
		if (this.al_fld != -1) {
			if (var1 >= 0) {
				return;
			}

			this.ah(this.al_fld, -407249997);
			this.aa_fld = -1098035687 * this.au_fld;
			this.ai_fld = -490603257 * this.ax_fld;
			this.aq_fld = 1103661485 * this.an_fld;
		}

		this.ah(this.as_fld, 1428783919);
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int lf() {
		return this.ax_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	public void av(xi var1, int var2) {
		while (true) {
			int var4 = var1.cg();
			if (var4 == 0) {
				return;
			}

			this.ae(var1, var4, var2, 1804819550);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;III)V"
	)
	void ae(xi var1, int var2, int var3, int var4) {
		if (var2 == 1) {
			this.as_fld = xi.lx(var1, 1581103516);
		} else if (2 == var2) {
			this.ar_fld = var1.cg();
		} else if (5 == var2) {
			this.af_fld = false;
		} else if (7 == var2) {
			this.al_fld = xi.lx(var1, 1676912464);
		} else if (var2 == 8) {
			if (var4 <= 1221891465) {
				return;
			}
		} else if (var2 == 9) {
			if (var4 <= 1221891465) {
				return;
			}

			var1.cg();
		}
	}

	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tu() {
		return this.al_fld;
	}

	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "(Lli;)V"
	)
	public static void uu(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var0.by_fld) {
			var0.by_fld.ak(671838725);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	public static ov ar(int var0) throws EOFException {
		try {
			ov var1 = (ov)ay_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ha.aw_fld.bb(4, var0, 584982574);
				var1 = new ov();
				if (var2 != null) {
					var1.av(new xi(var2), var0);
				}

				var1.az((byte)-108);
				ay_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void yd() {
		this.az((byte)-31);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void aw(ub var0) {
		ha.aw_fld = var0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	public static ov ay(int var0) throws EOFException {
		try {
			ov var1 = (ov)ay_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ha.aw_fld.bb(4, var0, 584982574);
				var1 = new ov();
				if (var2 != null) {
					var1.av(new xi(var2), var0);
				}

				var1.az((byte)-63);
				ay_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bo(int var0, ba var1, boolean var2) throws EOFException {
		try {
			if (3903 == var0) {
				int var35 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var35].av((byte)83);
				return 1;
			} else if (3904 == var0) {
				int var34 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2082911 * client.fs_fld[var34].ag_fld;
				return 1;
			} else if (var0 == 3905) {
				int var33 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var33].az_fld * -220330603;
				return 1;
			} else if (var0 == 3906) {
				int var32 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 626220965 * client.fs_fld[var32].av_fld;
				return 1;
			} else if (3907 == var0) {
				int var31 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fs_fld[var31].ae_fld * -1164425433;
				return 1;
			} else if (3908 == var0) {
				int var30 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -701801723 * client.fs_fld[var30].ah_fld;
				return 1;
			} else if (var0 == 3910) {
				int var29 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var46 = client.fs_fld[var29].ag(1005317946);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var46 == 0 ? 1 : 0;
				return 1;
			} else if (3911 == var0) {
				int var28 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var45 = client.fs_fld[var28].ag(-1932068154);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var45 == 2 ? 1 : 0;
				return 1;
			} else if (3912 == var0) {
				int var27 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var44 = client.fs_fld[var27].ag(576382747);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 5 == var44 ? 1 : 0;
				return 1;
			} else if (3913 == var0) {
				int var26 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				int var43 = client.fs_fld[var26].ag(1063157641);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1 == var43 ? 1 : 0;
				return 1;
			} else if (var0 == 3914) {
				boolean var25 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != ue.fu_fld) {
					nc.dv(ue.fu_fld, nc.az_fld, var25, 623273710);
				}

				return 1;
			} else if (3915 == var0) {
				boolean var24 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (ue.fu_fld != null) {
					nc.dv(ue.fu_fld, nc.ag_fld, var24, 623273710);
				}

				return 1;
			} else if (var0 == 3916) {
				gz.ax_fld -= 2;
				boolean var23 = bp.au_fld[gz.ax_fld] == 1;
				boolean var42 = bp.au_fld[gz.ax_fld + 1] == 1;
				if (null != ue.fu_fld) {
					client.fi_fld.ak_fld = var42;
					nc.dv(ue.fu_fld, client.fi_fld, var23, 623273710);
				}

				return 1;
			} else if (3917 == var0) {
				boolean var22 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != ue.fu_fld) {
					nc.dv(ue.fu_fld, nc.ak_fld, var22, 623273710);
				}

				return 1;
			} else if (var0 == 3918) {
				boolean var21 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127] == 1;
				if (null != ue.fu_fld) {
					nc.dv(ue.fu_fld, nc.av_fld, var21, 623273710);
				}

				return 1;
			} else if (3919 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ue.fu_fld == null ? 0 : ue.fu_fld.ae_fld.size();
				return 1;
			} else if (var0 == 3920) {
				int var20 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				nl var41 = (nl)(nl)ue.fu_fld.ae_fld.get(var20);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var41.ak_fld;
				return 1;
			} else if (3921 == var0) {
				int var19 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				nl var40 = (nl)(nl)ue.fu_fld.ae_fld.get(var19);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = nl.dq(var40, -1855110611);
				return 1;
			} else if (var0 == 3922) {
				int var18 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				nl var39 = (nl)(nl)ue.fu_fld.ae_fld.get(var18);
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var39.ag();
				return 1;
			} else if (3923 == var0) {
				int var17 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				nl var38 = (nl)(nl)ue.fu_fld.ae_fld.get(var17);
				long var6 = lz.ak() - yf.fr_fld - var38.ag_fld;
				int var8 = (int)(var6 / 3600000L);
				int var9 = (int)((var6 - var8 * 3600000) / 60000L);
				int var10 = (int)((var6 - 3600000 * var8 - 60000 * var9) / 1000L);
				String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = var11;
				return 1;
			} else if (3924 == var0) {
				int var16 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				nl var37 = (nl)(nl)ue.fu_fld.ae_fld.get(var16);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var37.az_fld.av_fld * 626220965;
				return 1;
			} else if (var0 == 3925) {
				int var15 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				nl var36 = (nl)(nl)ue.fu_fld.ae_fld.get(var15);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -220330603 * var36.az_fld.az_fld;
				return 1;
			} else if (3926 == var0) {
				int var14 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				nl var5 = (nl)(nl)ue.fu_fld.ae_fld.get(var14);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -2082911 * var5.az_fld.ag_fld;
				return 1;
			} else if (var0 == 3931) {
				int var13 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var13, -1752383175).el_fld ? 1 : 0;
				return 1;
			} else if (3939 == var0) {
				int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = kb.ag(var4, -1752383175).eh_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	public ov() {
		this.al_fld = -914511779;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ah(int var1, int var2) {
		double var3 = (var1 >> 16 & 0xFF) / 256.0;
		double var5 = (var1 >> 8 & 0xFF) / 256.0;
		double var7 = (var1 & 0xFF) / 256.0;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0;
		double var15 = 0.0;
		double var17 = (var11 + var9) / 2.0;
		if (var9 != var11) {
			if (var17 < 0.5) {
				var15 = (var11 - var9) / (var11 + var9);
			}

			if (var17 >= 0.5) {
				if (var2 == 1017517179) {
					return;
				}

				var15 = (var11 - var9) / (2.0 - var11 - var9);
			}

			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = 2.0 + (var7 - var3) / (var11 - var9);
			} else if (var11 == var7) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0;
			}
		}

		var13 /= 6.0;
		this.au_fld = (int)(var13 * 256.0);
		this.ax_fld = 1360337775 * (int)(256.0 * var15);
		this.an_fld = -196576163 * (int)(var17 * 256.0);
		if (this.ax_fld < 0) {
			if (var2 == 1017517179) {
				return;
			}

			this.ax_fld = 0;
		} else if (this.ax_fld > 255) {
			this.ax_fld = -1006218351;
		}

		if (this.an_fld < 0) {
			this.an_fld = 0;
		} else if (this.an_fld > 255) {
			this.an_fld = 1412685987;
		}
	}

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Lov;Lxi;II)V"
	)
	public static void vw(ov var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == 1) {
			var0.as_fld = xi.lx(var1, -1694893987);
		} else if (2 == var2) {
			var0.ar_fld = var1.cg();
		} else if (5 == var2) {
			var0.af_fld = false;
		} else if (7 == var2) {
			var0.al_fld = xi.lx(var1, 295656973);
		} else if (var2 != 8 && var2 == 9) {
			var1.cg();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		if (this.al_fld != -1) {
			this.ah(this.al_fld, -765531326);
			this.aa_fld = -1098035687 * this.au_fld;
			this.ai_fld = -490603257 * this.ax_fld;
			this.aq_fld = 1103661485 * this.an_fld;
		}

		this.ah(this.as_fld, -126432209);
	}

	@ObfuscatedName("tn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tn() {
		return this.aa_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void aa(xi var1, int var2) {
		if (var2 == 1) {
			this.as_fld = xi.lx(var1, 1126590131) * 1724479615;
		} else if (2 == var2) {
			this.ar_fld = var1.cg();
		} else if (5 == var2) {
			this.af_fld = false;
		} else if (7 == var2) {
			this.al_fld = xi.lx(var1, -589532412) * 548278813;
		} else if (var2 != 8 && var2 == 9) {
			var1.cg();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	public static ov as(int var0) throws EOFException {
		try {
			ov var1 = (ov)ay_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ha.aw_fld.bb(4, var0, 584982574);
				var1 = new ov();
				if (var2 != null) {
					var1.av(new xi(var2), var0);
				}

				var1.az((byte)-19);
				ay_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void an(xi var1, int var2) {
		this.av(var1, var2);
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int gt() {
		return this.ai_fld;
	}

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int wj() {
		return this.ar_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ax(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			this.ae(var1, var3, var2, 2095526824);
		}
	}

	@ObfuscatedName("xj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int xj() {
		return this.an_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		if (this.al_fld != -1) {
			this.ah(this.al_fld, -1416028414);
			this.aa_fld = -1098035687 * this.au_fld;
			this.ai_fld = 967520609 * this.ax_fld;
			this.aq_fld = 1103661485 * this.an_fld;
		}

		this.ah(this.as_fld * -1283469134, -1540801985);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hn() {
		return this.au_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;"
	)
	public static ov af(int var0) throws EOFException {
		try {
			ov var1 = (ov)ay_fld.ak(var0);
			if (var1 != null) {
				return var1;
			} else {
				byte[] var2 = ha.aw_fld.bb(4, var0, 584982574);
				var1 = new ov();
				if (var2 != null) {
					var1.av(new xi(var2), var0);
				}

				var1.az((byte)-46);
				ay_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void aq(xi var1, int var2) {
		if (var2 == 1) {
			this.as_fld = xi.lx(var1, 1717731064);
		} else if (2 == var2) {
			this.ar_fld = var1.cg();
		} else if (5 == var2) {
			this.af_fld = false;
		} else if (7 == var2) {
			this.al_fld = xi.lx(var1, 567840395);
		} else if (var2 != 8 && var2 == 9) {
			var1.cg();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void am(int var1) {
		double var2 = (var1 >> 16 & 0xFF) / 256.0;
		double var4 = (var1 >> 8 & 0xFF) / 256.0;
		double var6 = (var1 & 0xFF) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0 + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0;
			}
		}

		var12 /= 6.0;
		this.au_fld = (int)(var12 * 256.0);
		this.ax_fld = 1360337775 * (int)(256.0 * var14);
		this.an_fld = -196576163 * (int)(var16 * 256.0);
		if (this.ax_fld < 0) {
			this.ax_fld = 0;
		} else if (this.ax_fld > 255) {
			this.ax_fld = -1006218351;
		}

		if (this.an_fld < 0) {
			this.an_fld = 0;
		} else if (this.an_fld > 255) {
			this.an_fld = 1412685987;
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jj() {
		return this.aq_fld;
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int qs() {
		return this.as_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ad(int var1) {
		double var2 = (var1 >> 16 & 0xFF) / 256.0;
		double var4 = (var1 >> 8 & 0xFF) / 256.0;
		double var6 = (var1 & 0xFF) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0 + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0;
			}
		}

		var12 /= 6.0;
		this.au_fld = (int)(var12 * 256.0);
		this.ax_fld = 1360337775 * (int)(256.0 * var14);
		this.an_fld = -196576163 * (int)(var16 * 256.0);
		if (this.ax_fld < 0) {
			this.ax_fld = 0;
		} else if (this.ax_fld > 255) {
			this.ax_fld = -1006218351;
		}

		if (this.an_fld < 0) {
			this.an_fld = 0;
		} else if (this.an_fld > 255) {
			this.an_fld = 1412685987;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I"
	)
	public static int ar(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; var4++) {
			var3 = (var3 << 5) - var3 + vj.ak(var0.charAt(var4));
		}

		return var3;
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ye(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (var3 == 0) {
				return;
			}

			this.ae(var1, var3, var2, 1932523537);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void ai(xi var1, int var2, int var3) {
		while (true) {
			int var4 = var1.dm();
			if (var4 == 0) {
				return;
			}

			this.ae(var1, var4, var2, 1804819550);
		}
	}
}
