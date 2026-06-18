import java.io.EOFException;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gi")
public class gi extends hr {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	gw av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	ga ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -224814029
	)
	int az_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1520416231
	)
	int ah_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1282741609
	)
	int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1508527193
	)
	int ak_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ax_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ac_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int dc_fld;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z"
	)
	static boolean al(Date var0) {
		Date var2 = oe.au();
		return var0.after(var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int av(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.az_fld;
	}

	gi(kj var1, kj var2, int var3, ga var4) throws EOFException {
		super(var1, var2);
		this.ak_fld = var3;
		this.ag_fld = var4;
		this.ak();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int ae(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int as() {
		return this.az_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ah() {
		try {
			this.az_fld = oe.bm(ko.az(this.ak_fld), (byte)76).dm_fld * 1751034889;
			this.av_fld = this.ag_fld.bh(uh.ak(this.az_fld), -2140792005);
			pc var1 = uh.ak(this.ag(-723215383));
			yv var2 = var1.ae(false, -1994453809);
			if (var2 != null) {
				this.ae_fld = var2.aw_fld;
				this.ah_fld = var2.ay_fld;
			} else {
				this.ae_fld = 0;
				this.ah_fld = 0;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;"
	)
	@Override
	gw az(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljb;Lyk;B)Ljm;"
	)
	public static jm ak(jb var0, yk var1) {
		jm var3;
		if (jm.ae_fld == 0) {
			var3 = new jm();
		} else {
			var3 = jm.av_fld[(jm.ae_fld -= -586111491) * -245342379];
		}

		var3.ah_fld = var0;
		var3.aw_fld = var0.eq_fld;
		if (var3.aw_fld == -1) {
			var3.ay_fld = new xj(260);
		} else if (var3.aw_fld == -2) {
			var3.ay_fld = new xj(10000);
		} else if (var3.aw_fld <= 18) {
			var3.ay_fld = new xj(20);
		} else if (var3.aw_fld <= 98) {
			var3.ay_fld = new xj(100);
		} else {
			var3.ay_fld = new xj(260);
		}

		xj.uo(var3.ay_fld, var1, -1267112880);
		var3.ay_fld.av(-1740426857 * var3.ah_fld.ef_fld, 172743323);
		var3.as_fld = 0;
		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int an() {
		return this.ae_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ar() {
		return this.az_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ak() {
		try {
			this.az_fld = oe.bm(ko.az(this.ak_fld), (byte)39).dm_fld * 1751034889;
			this.av_fld = this.ag_fld.bh(uh.ak(this.az_fld), -2140792005);
			pc var2 = uh.ak(this.ag(-1175062448));
			yv var3 = var2.ae(false, -1982929332);
			if (var3 != null) {
				this.ae_fld = var3.aw_fld;
				this.ah_fld = var3.ay_fld;
			} else {
				this.ae_fld = 0;
				this.ah_fld = 0;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw al() {
		return this.av_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw au() {
		return this.av_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ax() {
		return this.ae_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		try {
			this.az_fld = oe.bm(ko.az(this.ak_fld), (byte)40).dm_fld * 1751034889;
			this.av_fld = this.ag_fld.bh(uh.ak(this.az_fld), -2140792005);
			pc var1 = uh.ak(this.ag(549616897));
			yv var2 = var1.ae(false, -2090041042);
			if (var2 != null) {
				this.ae_fld = var2.aw_fld;
				this.ah_fld = var2.ay_fld;
			} else {
				this.ae_fld = 0;
				this.ah_fld = 0;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int aa() {
		return this.ah_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
	)
	static int bx(int var0, ba var1, boolean var2) {
		if (var0 == 3800) {
			if (null != eu.fo_fld) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				gt.be_fld = eu.fo_fld;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3801) {
			int var19 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (client.fp_fld[var19] != null) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
				gt.be_fld = client.fp_fld[var19];
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		} else if (var0 == 3802) {
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.as_fld;
			return 1;
		} else if (3803 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.af_fld ? 1 : 0;
			return 1;
		} else if (3804 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.al_fld;
			return 1;
		} else if (3805 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.au_fld;
			return 1;
		} else if (var0 == 3806) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ax_fld;
			return 1;
		} else if (var0 == 3807) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.an_fld;
			return 1;
		} else if (3809 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.aa_fld;
			return 1;
		} else if (3810 == var0) {
			int var18 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.bm_fld[var18];
			return 1;
		} else if (3811 == var0) {
			int var17 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.aq_fld[var17];
			return 1;
		} else if (3812 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.at_fld;
			return 1;
		} else if (var0 == 3813) {
			int var16 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gt.be_fld.aj_fld[var16];
			return 1;
		} else if (3814 == var0) {
			gz.ax_fld -= 3;
			int var15 = bp.au_fld[gz.ax_fld];
			int var21 = bp.au_fld[1 + gz.ax_fld];
			int var22 = bp.au_fld[2 + gz.ax_fld];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.av(var15, var21, var22, -733852906);
			return 1;
		} else if (3815 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ab_fld;
			return 1;
		} else if (var0 == 3816) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ap_fld;
			return 1;
		} else if (3817 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.az((String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], (byte)5);
			return 1;
		} else if (var0 == 3818) {
			bp.au_fld[gz.ax_fld - 1] = gt.be_fld.ah(-1405952963)[bp.au_fld[gz.ax_fld - 1]];
			return 1;
		} else if (3819 == var0) {
			gz.ax_fld -= 2;
			int var14 = bp.au_fld[gz.ax_fld];
			int var20 = bp.au_fld[gz.ax_fld + 1];
			ei.gl(var20, var14);
			return 1;
		} else if (3820 == var0) {
			int var13 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ad_fld[var13];
			return 1;
		} else {
			if (var0 == 3821) {
				gz.ax_fld -= 3;
				int var4 = bp.au_fld[gz.ax_fld];
				boolean var5 = bp.au_fld[gz.ax_fld + 1] == 1;
				int var6 = bp.au_fld[2 + gz.ax_fld];
				cy.hr(var6, var4, var5);
			}

			if (3822 == var0) {
				int var12 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gt.be_fld.ao_fld[var12] ? 1 : 0;
				return 1;
			} else if (var0 == 3850) {
				if (null != fp.fx_fld) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					gw.bs_fld = fp.fx_fld;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (3851 == var0) {
				int var11 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (client.fv_fld[var11] != null) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 1;
					gw.bs_fld = client.fv_fld[var11];
					dy.bh_fld = var11;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3852) {
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = gw.bs_fld.az_fld;
				return 1;
			} else if (3853 == var0) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.ae_fld;
				return 1;
			} else if (var0 == 3854) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av_fld;
				return 1;
			} else if (var0 == 3855) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.av(-1091125853);
				return 1;
			} else if (var0 == 3856) {
				int var10 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = ((hx)gw.bs_fld.ak_fld.get(var10)).az_fld.ak(-843806702);
				return 1;
			} else if (3857 == var0) {
				int var9 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((hx)gw.bs_fld.ak_fld.get(var9)).ak_fld;
				return 1;
			} else if (3858 == var0) {
				int var8 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ((hx)gw.bs_fld.ak_fld.get(var8)).ag_fld * 1878330377;
				return 1;
			} else if (3859 == var0) {
				int var7 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				jg.gb(dy.bh_fld, var7, (byte)1);
				return 1;
			} else if (var0 == 3860) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = gw.bs_fld.ae((String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525], 1973081207);
				return 1;
			} else if (var0 == 3861) {
				bp.au_fld[gz.ax_fld - 1] = gw.bs_fld.ak(585672594)[bp.au_fld[gz.ax_fld - 1]];
				return 1;
			} else if (var0 == 3890) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != bl.ey_fld ? 1 : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lgw;"
	)
	@Override
	gw af() {
		return this.av_fld;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V"
	)
	static final void do_(xj var0) throws ExecutionException, InterruptedException, EOFException {
		try {
			client.fz(var0);
			int var2 = var0.ex();
			int var3 = xi.tl(var0, (byte)1);
			xi.xo(var0, 2022089410);
			client.qf_fld.ay(var3, var2);
			of.dl(client.qf_fld, var3, var2, false);
			client.gf(var0);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ay() {
		try {
			this.az_fld = oe.bm(ko.az(this.ak_fld), (byte)65).dm_fld * 393688288;
			this.av_fld = this.ag_fld.bh(uh.ak(this.az_fld), -2140792005);
			pc var1 = uh.ak(this.ag(-179198752));
			yv var2 = var1.ae(false, -2020914700);
			if (var2 != null) {
				this.ae_fld = var2.aw_fld * -875798982;
				this.ah_fld = var2.ay_fld * 1812667872;
			} else {
				this.ae_fld = 0;
				this.ah_fld = 0;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}
}
