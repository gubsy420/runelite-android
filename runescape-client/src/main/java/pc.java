import java.io.EOFException;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.worldmap.MapElementConfig;

@ObfuscatedName("pc")
@Implements({"MapElementConfig"})
public class pc extends vc implements MapElementConfig {
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cy_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	public op ab_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean au_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = 335071679
	)
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ac_fld = -1160521279;
	@ObfuscatedGetter(
		intValue = 172118773
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld = 1019197091;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String as_fld;
	@ObfuscatedGetter(
		intValue = -2065753697
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedGetter(
		intValue = 2075360011
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld = 0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean al_fld = true;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] ax_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw az_fld = new iw(256);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String an_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ap_fld;
	@ObfuscatedGetter(
		intValue = 1862642651
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;
	@ObfuscatedGetter(
		intValue = 1722644261
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;
	@ObfuscatedGetter(
		intValue = -539785713
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedGetter(
		intValue = 732333643
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	public pv ao_fld;
	@ObfuscatedGetter(
		intValue = -2040139307
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int af_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aa_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] at_fld;
	@ObfuscatedGetter(
		intValue = 1507825799
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedGetter(
		intValue = -1108351195
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ar_fld;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ai() {
		if (this.ap_fld != null) {
			for (byte var1 = 0; var1 < this.ap_fld.length; var1 += 2) {
				if (this.ap_fld[var1] < this.ai_fld) {
					this.ai_fld = this.ap_fld[var1];
				} else if (this.ap_fld[var1] > this.am_fld) {
					this.am_fld = -1716213521 * this.ap_fld[var1];
				}

				if (this.ap_fld[1 + var1] < this.aq_fld) {
					this.aq_fld = this.ap_fld[1 + var1];
				} else if (this.ap_fld[var1 + 1] > this.ad_fld) {
					this.ad_fld = this.ap_fld[1 + var1];
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lyv;"
	)
	public yv ae(boolean var1, int var2) {
		try {
			int var3 = var1 ? this.ay_fld : this.ac_fld;
			return this.ah(var3, -1042571783);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	yv ac(int var1) {
		try {
			if (var1 < 0) {
				return null;
			} else {
				yv var2 = (yv)az_fld.ak(var1);
				if (var2 != null) {
					return var2;
				} else {
					var2 = wf.av(nz.av_fld, var1, 0);
					if (var2 != null) {
						az_fld.az(var2, var1);
					}

					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void av(int var1) {
		if (this.ap_fld != null) {
			if (var1 != 24957735) {
				return;
			}

			for (byte var2 = 0; var2 < this.ap_fld.length; var2 += 2) {
				if (this.ap_fld[var2] < this.ai_fld) {
					this.ai_fld = this.ap_fld[var2];
				} else if (this.ap_fld[var2] > this.am_fld) {
					this.am_fld = -1716213521 * this.ap_fld[var2];
				}

				if (this.ap_fld[1 + var2] < this.aq_fld) {
					this.aq_fld = this.ap_fld[1 + var2];
				} else if (this.ap_fld[var2 + 1] > this.ad_fld) {
					this.ad_fld = this.ap_fld[1 + var2];
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ax(xi var1, int var2) {
		if (var2 == 1) {
			this.ac_fld = var1.do_();
		} else if (var2 == 2) {
			this.ay_fld = var1.do_();
		} else if (var2 == 3) {
			this.as_fld = xi.kc(var1, 1665732844);
		} else if (var2 == 4) {
			this.af_fld = var1.ck();
		} else if (5 == var2) {
			var1.ck();
		} else if (var2 == 6) {
			this.aw_fld = var1.cg();
		} else if (7 == var2) {
			int var3 = var1.cg();
			if (0 == (var3 & 1)) {
				this.al_fld = false;
			}

			if (2 == (var3 & 2)) {
				this.au_fld = true;
			}
		} else if (var2 == 8) {
			var1.cg();
		} else if (var2 >= 10 && var2 <= 14) {
			this.ax_fld[var2 - 10] = xi.kc(var1, 1397619242);
		} else if (var2 == 15) {
			int var6 = var1.cg();
			this.ap_fld = new int[2 * var6];

			for (int var4 = 0; var4 < var6 * 2; var4++) {
				this.ap_fld[var4] = var1.cz();
			}

			var1.co();
			int var9 = var1.cg();
			this.aa_fld = new int[var9];

			for (int var5 = 0; var5 < this.aa_fld.length; var5++) {
				this.aa_fld[var5] = var1.co();
			}

			this.at_fld = new byte[var6];

			for (int var10 = 0; var10 < var6; var10++) {
				this.at_fld[var10] = xi.rp(var1, -274419677);
			}
		} else if (16 != var2) {
			if (17 == var2) {
				this.an_fld = xi.kc(var1, 680345209);
			} else if (var2 == 18) {
				var1.do_();
			} else if (var2 == 19) {
				this.ar_fld = xi.tx(var1, 1471936409);
			} else if (21 == var2) {
				var1.co();
			} else if (22 == var2) {
				var1.co();
			} else if (var2 == 23) {
				var1.cg();
				var1.cg();
				var1.cg();
			} else if (24 == var2) {
				var1.cz();
				var1.cz();
			} else if (25 == var2) {
				var1.do_();
			} else if (28 == var2) {
				var1.cg();
			} else if (29 == var2) {
				pv[] var7 = new pv[]{pv.ag_fld, pv.az_fld, pv.ak_fld};
				this.ao_fld = (pv)ka.ak(var7, var1.cg());
			} else if (30 == var2) {
				op[] var8 = new op[]{op.az_fld, op.ag_fld, op.ak_fld};
				this.ab_fld = (op)ka.ak(var8, var1.cg());
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lyv;"
	)
	yv ah(int var1, int var2) {
		try {
			if (var1 < 0) {
				return null;
			} else {
				yv var3 = (yv)az_fld.ak(var1);
				if (var3 != null) {
					return var3;
				} else {
					var3 = wf.av(nz.av_fld, var1, 0);
					if (var3 != null) {
						az_fld.az(var3, var1);
					}

					return var3;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aw(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ag(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				return;
			}

			this.az(var1, var3, 1981588006);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;"
	)
	public static pc as(int var0) {
		return var0 >= 0 && var0 < lq.ae_fld.length && lq.ae_fld[var0] != null ? lq.ae_fld[var0] : new pc(var0);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;"
	)
	public static pc ar(int var0) {
		return var0 >= 0 && var0 < lq.ae_fld.length && lq.ae_fld[var0] != null ? lq.ae_fld[var0] : new pc(var0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void al(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.az(var1, var2, 1964964903);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aa(xi var1, int var2) {
		if (var2 == 1) {
			this.ac_fld = var1.do_() * 1708454919;
		} else if (var2 == 2) {
			this.ay_fld = var1.do_() * -647196930;
		} else if (var2 == 3) {
			this.as_fld = xi.kc(var1, -1583560597);
		} else if (var2 == 4) {
			this.af_fld = var1.ck() * -1020340517;
		} else if (5 == var2) {
			var1.ck();
		} else if (var2 == 6) {
			this.aw_fld = var1.cg() * 1461577841;
		} else if (7 == var2) {
			int var3 = var1.cg();
			if (0 == (var3 & 1)) {
				this.al_fld = false;
			}

			if (2 == (var3 & 2)) {
				this.au_fld = true;
			}
		} else if (var2 == 8) {
			var1.cg();
		} else if (var2 >= 10 && var2 <= 14) {
			this.ax_fld[var2 - 10] = xi.kc(var1, -552910182);
		} else if (var2 == 15) {
			int var6 = var1.cg();
			this.ap_fld = new int[2 * var6];

			for (int var4 = 0; var4 < var6 * 2; var4++) {
				this.ap_fld[var4] = var1.cz();
			}

			var1.co();
			int var9 = var1.cg();
			this.aa_fld = new int[var9];

			for (int var5 = 0; var5 < this.aa_fld.length; var5++) {
				this.aa_fld[var5] = var1.co();
			}

			this.at_fld = new byte[var6];

			for (int var10 = 0; var10 < var6; var10++) {
				this.at_fld[var10] = xi.rp(var1, 65668008);
			}
		} else if (16 != var2) {
			if (17 == var2) {
				this.an_fld = xi.kc(var1, -1257740553);
			} else if (var2 == 18) {
				var1.do_();
			} else if (var2 == 19) {
				this.ar_fld = xi.tx(var1, 534280769) * -1585832024;
			} else if (21 == var2) {
				var1.co();
			} else if (22 == var2) {
				var1.co();
			} else if (var2 == 23) {
				var1.cg();
				var1.cg();
				var1.cg();
			} else if (24 == var2) {
				var1.cz();
				var1.cz();
			} else if (25 == var2) {
				var1.do_();
			} else if (28 == var2) {
				var1.cg();
			} else if (29 == var2) {
				pv[] var7 = new pv[]{pv.ag_fld, pv.az_fld, pv.ak_fld};
				this.ao_fld = (pv)ka.ak(var7, var1.cg());
			} else if (30 == var2) {
				op[] var8 = new op[]{op.az_fld, op.ag_fld, op.ak_fld};
				this.ab_fld = (op)ka.ak(var8, var1.cg());
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lpc;Z)Lyv;"
	)
	public static yv jg(pc var0, boolean var1) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				int var2 = var1 ? var0.ay_fld : var0.ac_fld;
				return var0.ah(var2, -1042571783);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int ye(gf var0) {
		return var0.aw_fld.az_fld * 1479124089;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aj() {
		return this.ah_fld;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Z)Lyv;"
	)
	public yv getMapIcon(boolean var1) {
		try {
			return this.ae(var1, -1928354355);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getCategory")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCategory() {
		return this.ar_fld;
	}

	public pc(int var1) {
		this.au_fld = false;
		this.ax_fld = new String[5];
		this.ai_fld = 1591584685;
		this.aq_fld = -1492241581;
		this.am_fld = Integer.MIN_VALUE;
		this.ad_fld = Integer.MIN_VALUE;
		this.ao_fld = pv.ag_fld;
		this.ab_fld = op.ag_fld;
		this.ar_fld = -121232557;
		this.ah_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void az(xi var1, int var2, int var3) {
		if (var2 == 1) {
			this.ac_fld = var1.do_();
		} else if (var2 == 2) {
			if (var3 <= 1846813669) {
				return;
			}

			this.ay_fld = var1.do_();
		} else if (var2 == 3) {
			if (var3 <= 1846813669) {
				return;
			}

			this.as_fld = xi.kc(var1, 512629655);
		} else if (var2 == 4) {
			this.af_fld = var1.ck();
		} else if (5 == var2) {
			var1.ck();
		} else if (var2 == 6) {
			this.aw_fld = var1.cg();
		} else if (7 == var2) {
			if (var3 <= 1846813669) {
				return;
			}

			int var4 = var1.cg();
			if (0 == (var4 & 1)) {
				if (var3 <= 1846813669) {
					return;
				}

				this.al_fld = false;
			}

			if (2 == (var4 & 2)) {
				if (var3 <= 1846813669) {
					return;
				}

				this.au_fld = true;
			}
		} else if (var2 == 8) {
			var1.cg();
		} else if (var2 >= 10 && var2 <= 14) {
			this.ax_fld[var2 - 10] = xi.kc(var1, 1331943736);
		} else if (var2 == 15) {
			int var7 = var1.cg();
			this.ap_fld = new int[2 * var7];

			for (int var5 = 0; var5 < var7 * 2; var5++) {
				this.ap_fld[var5] = var1.cz();
			}

			var1.co();
			int var10 = var1.cg();
			this.aa_fld = new int[var10];

			for (int var6 = 0; var6 < this.aa_fld.length; var6++) {
				this.aa_fld[var6] = var1.co();
			}

			this.at_fld = new byte[var7];

			for (int var11 = 0; var11 < var7; var11++) {
				if (var3 <= 1846813669) {
					return;
				}

				this.at_fld[var11] = xi.rp(var1, -506125783);
			}
		} else if (16 != var2) {
			if (17 == var2) {
				this.an_fld = xi.kc(var1, -1188549321);
			} else if (var2 == 18) {
				var1.do_();
			} else if (var2 == 19) {
				this.ar_fld = xi.tx(var1, 333047198);
			} else if (21 == var2) {
				var1.co();
			} else if (22 == var2) {
				var1.co();
			} else if (var2 == 23) {
				var1.cg();
				var1.cg();
				var1.cg();
			} else if (24 == var2) {
				var1.cz();
				var1.cz();
			} else if (25 == var2) {
				var1.do_();
			} else if (28 == var2) {
				var1.cg();
			} else if (29 == var2) {
				pv[] var8 = new pv[]{pv.ag_fld, pv.az_fld, pv.ak_fld};
				this.ao_fld = (pv)ka.ak(var8, var1.cg());
			} else if (30 == var2) {
				if (var3 <= 1846813669) {
					return;
				}

				op[] var9 = new op[]{op.az_fld, op.ag_fld, op.ak_fld};
				this.ab_fld = (op)ka.ak(var9, var1.cg());
			}
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lpc;Lxi;)V"
	)
	public static void jk(pc var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			var0.az(var1, var2, 1919121481);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void au(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.az(var1, var2, 2068067444);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aq() {
		if (this.ap_fld != null) {
			for (byte var1 = 0; var1 < this.ap_fld.length; var1 += 2) {
				if (this.ap_fld[var1] < this.ai_fld) {
					this.ai_fld = this.ap_fld[var1];
				} else if (this.ap_fld[var1] > this.am_fld) {
					this.am_fld = -1865123320 * this.ap_fld[var1];
				}

				if (this.ap_fld[1 + var1] < this.aq_fld) {
					this.aq_fld = this.ap_fld[1 + var1] * -1879080060;
				} else if (this.ap_fld[var1 + 1] > this.ad_fld) {
					this.ad_fld = this.ap_fld[1 + var1] * -924404712;
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void am() {
		if (this.ap_fld != null) {
			for (byte var1 = 0; var1 < this.ap_fld.length; var1 += 2) {
				if (this.ap_fld[var1] < this.ai_fld) {
					this.ai_fld = this.ap_fld[var1];
				} else if (this.ap_fld[var1] > this.am_fld) {
					this.am_fld = -1716213521 * this.ap_fld[var1];
				}

				if (this.ap_fld[1 + var1] < this.aq_fld) {
					this.aq_fld = this.ap_fld[1 + var1];
				} else if (this.ap_fld[var1 + 1] > this.ad_fld) {
					this.ad_fld = this.ap_fld[1 + var1];
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ad() {
		if (this.ap_fld != null) {
			for (byte var1 = 0; var1 < this.ap_fld.length; var1 += 2) {
				if (this.ap_fld[var1] < this.ai_fld) {
					this.ai_fld = this.ap_fld[var1];
				} else if (this.ap_fld[var1] > this.am_fld) {
					this.am_fld = -1716213521 * this.ap_fld[var1];
				}

				if (this.ap_fld[1 + var1] < this.aq_fld) {
					this.aq_fld = this.ap_fld[1 + var1];
				} else if (this.ap_fld[var1 + 1] > this.ad_fld) {
					this.ad_fld = this.ap_fld[1 + var1];
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Z)Lyv;"
	)
	public yv ao(boolean var1) {
		try {
			int var2 = var1 ? this.ay_fld : this.ac_fld * 915394219;
			return this.ah(var2, -1042571783);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void an(xi var1, int var2) {
		if (var2 == 1) {
			this.ac_fld = var1.do_();
		} else if (var2 == 2) {
			this.ay_fld = var1.do_();
		} else if (var2 == 3) {
			this.as_fld = xi.kc(var1, -22939073);
		} else if (var2 == 4) {
			this.af_fld = var1.ck() * -368452089;
		} else if (5 == var2) {
			var1.ck();
		} else if (var2 == 6) {
			this.aw_fld = var1.cg();
		} else if (7 == var2) {
			int var3 = var1.cg();
			if (0 == (var3 & 1)) {
				this.al_fld = false;
			}

			if (2 == (var3 & 2)) {
				this.au_fld = true;
			}
		} else if (var2 == 8) {
			var1.cg();
		} else if (var2 >= 10 && var2 <= 14) {
			this.ax_fld[var2 - 10] = xi.kc(var1, -444621049);
		} else if (var2 == 15) {
			int var6 = var1.cg();
			this.ap_fld = new int[2 * var6];

			for (int var4 = 0; var4 < var6 * 2; var4++) {
				this.ap_fld[var4] = var1.cz();
			}

			var1.co();
			int var9 = var1.cg();
			this.aa_fld = new int[var9];

			for (int var5 = 0; var5 < this.aa_fld.length; var5++) {
				this.aa_fld[var5] = var1.co();
			}

			this.at_fld = new byte[var6];

			for (int var10 = 0; var10 < var6; var10++) {
				this.at_fld[var10] = xi.rp(var1, 1116975392);
			}
		} else if (16 != var2) {
			if (17 == var2) {
				this.an_fld = xi.kc(var1, -1758080787);
			} else if (var2 == 18) {
				var1.do_();
			} else if (var2 == 19) {
				this.ar_fld = xi.tx(var1, 1694613017);
			} else if (21 == var2) {
				var1.co();
			} else if (22 == var2) {
				var1.co();
			} else if (var2 == 23) {
				var1.cg();
				var1.cg();
				var1.cg();
			} else if (24 == var2) {
				var1.cz();
				var1.cz();
			} else if (25 == var2) {
				var1.do_();
			} else if (28 == var2) {
				var1.cg();
			} else if (29 == var2) {
				pv[] var7 = new pv[]{pv.ag_fld, pv.az_fld, pv.ak_fld};
				this.ao_fld = (pv)ka.ak(var7, var1.cg());
			} else if (30 == var2) {
				op[] var8 = new op[]{op.az_fld, op.ag_fld, op.ak_fld};
				this.ab_fld = (op)ka.ak(var8, var1.cg());
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Z)Lyv;"
	)
	public yv at(boolean var1) {
		try {
			int var2 = var1 ? this.ay_fld * 52134598 : this.ac_fld * -774851068;
			return this.ah(var2, -1042571783);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;"
	)
	public static pc ay(int var0) {
		return var0 >= 0 && var0 < lq.ae_fld.length && lq.ae_fld[var0] != null ? lq.ae_fld[var0] : new pc(var0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Z)Lyv;"
	)
	public yv ab(boolean var1) {
		try {
			int var2 = var1 ? this.ay_fld * -508437599 : this.ac_fld;
			return this.ah(var2, -1042571783);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	public static String ae(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;

		for (int var6 = 0; var6 < var2; var6++) {
			int var7 = var0[var6 + var1] & 255;
			if (0 != var7) {
				if (var7 >= 128 && var7 < 160) {
					char var8 = nt.ak_fld[var7 - 128];
					if (0 == var8) {
						var8 = '?';
					}

					var7 = var8;
				}

				var4[var5++] = (char)var7;
			}
		}

		return new String(var4, 0, var5);
	}
}
