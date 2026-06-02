import java.awt.Shape;
import java.io.EOFException;
import net.runelite.api.HeadIcon;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PlayerChanged;

@ObfuscatedName("cv")
@Implements({"Player"})
public class cv extends da implements Player {
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	rw bm_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Laax;"
	)
	aax az_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	rw aj_fld;
	@ObfuscatedGetter(
		intValue = 1494805637
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld = -462564429;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	String[] aw_fld;
	@ObfuscatedGetter(
		intValue = 989202053
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = -628777755
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = -543870599
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = 1123602841
	)
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ap_fld;
	@ObfuscatedGetter(
		intValue = 1305484251
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld = 813537197;
	@ObfuscatedGetter(
		intValue = 531981267
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = 743106107
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = 1858699987
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedGetter(
		intValue = 812871689
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	fn ai_fld;
	@ObfuscatedGetter(
		intValue = -1728293973
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = -1351237605
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedGetter(
		intValue = 1174367459
	)
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ao_fld;
	@ObfuscatedGetter(
		intValue = -1283912451
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	lp av_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean at_fld;
	@ObfuscatedGetter(
		intValue = -514558841
	)
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ac_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ab_fld;
	@ObfuscatedGetter(
		intValue = 1288048209
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	rw bd_fld;
	@ObfuscatedGetter(
		intValue = -1361036509
	)
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bz_fld;

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ce(int var1, int var2) {
		this.dq_fld[0] = var1;
		this.do_fld[0] = var2;
		this.dm_fld = 0;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cv() {
		if (this.bd_fld == rw.ak_fld) {
			this.ab(-1374009535);
		}

		return this.bd_fld == rw.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	final void ag(xi var1, byte var2) {
		try {
			var1.au_fld = 0;
			byte var3 = xi.rp(var1, 137438186);
			byte var4 = -1;
			this.ae_fld = xi.rp(var1, -1284539204);
			this.ah_fld = xi.rp(var1, -1322270858);
			int var5 = -1;
			this.ap_fld = 0;
			int[] var6 = new int[12];

			for (int var7 = 0; var7 < var6.length; var7++) {
				int var8 = var1.cg();
				if (var8 == 0) {
					var6[var7] = 0;
				} else {
					int var9 = var1.cg();
					int var10 = var9 + (var8 << 8);
					if (var7 == 0 && var10 == 65535) {
						var5 = xi.tx(var1, 737955505);
						break;
					}

					var6[var7] = var10;
					if (ks(this, var6[var7])) {
						int var11 = ok(this, var6[var7]).ea_fld * 52476663;
						if (var11 != 0) {
							this.ap_fld = var11;
						}
					}
				}
			}

			int[] var16 = new int[12];

			for (int var17 = 0; var17 < var16.length; var17++) {
				int var19 = var1.cg();
				if (var19 == 0) {
					var16[var17] = 0;
				} else {
					int var22 = var1.cg();
					var16[var17] = var22 + (var19 << 8);
				}
			}

			int[] var18 = new int[5];

			for (int var20 = 0; var20 < var18.length; var20++) {
				int var23;
				if (var2 == 76) {
					this.gt();
					return;
				}

				label263: {
					var23 = var1.cg();
					if (var23 >= 0) {
						if (var2 == 76) {
							this.gt();
							return;
						}

						if (var23 < mn.av_fld[var20].length) {
							break label263;
						}
					}

					var23 = 0;
				}

				var18[var20] = var23;
			}

			this.bi_fld = xi.tx(var1, 328577478);
			if (65535 == this.bi_fld) {
				this.bi_fld = 1804501961;
			}

			this.bu_fld = xi.tx(var1, 631506037);
			if (65535 == this.bu_fld) {
				if (var2 == 76) {
					this.gt();
					return;
				}

				this.bu_fld = -390804923;
			}

			this.bn_fld = this.bu_fld;
			this.bc_fld = xi.tx(var1, 366301539);
			if (65535 == this.bc_fld) {
				this.bc_fld = -1736627783;
			}

			this.bw_fld = xi.tx(var1, 1639991632);
			if (this.bw_fld == 65535) {
				this.bw_fld = 906384375;
			}

			this.ba_fld = xi.tx(var1, 1810721685);
			if (65535 == this.ba_fld) {
				this.ba_fld = -302068843;
			}

			this.bq_fld = xi.tx(var1, 1822086600);
			if (this.bq_fld == 65535) {
				if (var2 == 76) {
					this.gt();
					return;
				}

				this.bq_fld = -1430908963;
			}

			this.bg_fld = xi.tx(var1, 664001935);
			if (this.bg_fld == 65535) {
				this.bg_fld = 1064017983;
			}

			this.az_fld = new aax(xi.kc(var1, 2142535304), fr.gv_fld);
			this.aw((byte)28);
			oj(this, 626304450);
			ex(this, -894616968);
			if (client.dj_fld == this.bx_fld) {
				aak.ag_fld = this.az_fld.ak(1176999008);
			}

			this.ay_fld = var1.cg();
			this.as_fld = xi.tx(var1, 340340959);
			boolean var10001;
			if (var1.cg() == 1) {
				if (var2 == 76) {
					this.gt();
					return;
				}

				var10001 = true;
			} else {
				var10001 = false;
			}

			this.at_fld = var10001;
			if (client.gu_fld == 0 && client.jl_fld >= 2) {
				this.at_fld = false;
			}

			oo[] var21 = null;
			boolean var24 = false;
			int var26 = xi.tx(var1, 1152591042);
			boolean var10000;
			if (1 == (var26 >> 15 & 1)) {
				if (var2 == 76) {
					this.gt();
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			var24 = var10000;
			if (var26 > 0 && var26 != 32768) {
				var21 = new oo[12];

				for (int var12 = 0; var12 < var21.length; var12++) {
					int var13 = var26 >> 12 - var12 & 1;
					if (var13 == 1) {
						var21[var12] = mk.ak(var6[var12] - 2048, var1);
					}
				}
			}

			for (int var27 = 0; var27 < 3; var27++) {
				this.aw_fld[var27] = xi.kc(var1, 1013778352);
			}

			var4 = xi.rp(var1, -1555642975);
			if (null == this.av_fld) {
				this.av_fld = new lp();
			}

			this.av_fld.ag(var16, var6, var21, var24, var18, var3, var5, var4, (byte)-112);
			if (var5 != -1) {
				this.bv_fld = ca.az(var5).cw_fld * -152112395;
			} else {
				this.bv_fld = 1283255373;
			}

			this.bz_fld = (int)(this.bv_fld * 907428480 * 0.4F);
			this.gt();
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean as(byte var1) {
		if (rw.ak_fld == this.aj_fld) {
			this.ay(1166506911);
		}

		return this.aj_fld == rw.ag_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void aw(byte var1) {
		this.aj_fld = rw.ak_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bt() {
		this.aj_fld = la.fq_fld.ad(this.az_fld) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V"
	)
	public static void oj(cv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bm_fld = rw.ak_fld;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean ah(byte var1) {
		if (rw.ak_fld == this.bm_fld) {
			this.af(-2011677913);
		}

		return this.bm_fld == rw.ag_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) {
		this.bm_fld = jr.fa_fld != null && jr.fa_fld.bo(this.az_fld, 1397106144) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ab(int var1) {
		for (int var2 = 0; var2 < 4; var2++) {
			if (client.fp_fld[var2] != null && client.fp_fld[var2].az(this.az_fld.ak(470590965), (byte)5) != -1 && var2 != 2) {
				this.bd_fld = rw.ag_fld;
				return;
			}
		}

		this.bd_fld = rw.az_fld;
	}

	@ObfuscatedName("setSkullIcon")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setSkullIcon(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy ch() {
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			if (client.xg_fld != null && client.xg_fld.test(super.cm_fld.ag_fld * 163458875 != -1 ? super.cm_fld.ag_fld * 163458875 : super.cw_fld.ag_fld * 163458875)) {
				int var2 = super.cm_fld.ae_fld * 249909987;
				int var3 = super.cw_fld.ae_fld * 249909987;

				fn var4;
				try {
					super.cm_fld.ae_fld = -2147483648 | Math.max(super.cm_fld.av_fld * 1668710195 - 1, 0) << 16 | var2;
					super.cw_fld.ae_fld = -1073741824 | Math.max(super.cw_fld.av_fld * 1668710195 - 1, 0) << 16 | var3;
					var4 = this.dp();
				} finally {
					super.cm_fld.ae_fld = var2;
					super.cw_fld.ae_fld = var3;
				}

				return var4;
			} else {
				return this.dp();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			if (null == this.av_fld) {
				return false;
			} else if (this.ai_fld != null && this.ai_fld.cv_fld != null) {
				return true;
			} else if (da.ll(this, 2115403831)) {
				return true;
			} else {
				fn var2 = lp.ph(this.av_fld, null, -1, null, -1, (byte)-12);
				return var2 != null && var2.cv_fld != null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Z"
	)
	public static boolean ks(cv var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= 2048;
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IILgt;)V"
	)
	final void cp(dx var1, int var2, int var3, gt var4) {
		try {
			if (this.cm_fld.av() && this.cm_fld.ae().bw_fld * 1795231779 == 1) {
				da.fz(this, -1212122096);
			}

			if (ll.ak_fld == this.cg_fld.ak_fld) {
				da.lq(this, (byte)-10);
			}

			if (!var1.ae(var2, var3, -648786609)) {
				this.da(var2, var3, 1395282958);
			} else if (!var1.ae(this.dq_fld[0], this.do_fld[0], 692017376)) {
				this.da(var2, var3, -2081611890);
			} else {
				if (var4 == gt.av_fld) {
					cv var5 = this;
					gt var6 = gt.av_fld;
					int var7 = this.dq_fld[0];
					int var8 = this.do_fld[0];
					int var9 = -2106839931 * this.bv_fld;
					gn var10 = var1.av_fld[var1.ae_fld];
					if (var7 >= var9
						&& var7 < var10.az(-614267994) - var9
						&& var8 >= var9
						&& var8 < var10.av((byte)-27) - var9
						&& var2 >= var9
						&& var2 < var10.az(-1476617600) - var9
						&& var3 >= var9
						&& var3 < var10.av((byte)-109) - var9) {
						gp var11 = client.bi_fld;
						client.cu_fld.ak_fld = var2;
						client.cu_fld.ag_fld = var3;
						client.cu_fld.az_fld = 1424130823;
						client.cu_fld.av_fld = -1481946841;
						bl var15 = client.cu_fld;
						int var16 = var11.ag(var7, var8, var9, var15, var10, true, client.pf_fld, client.pd_fld, 910082414);
						if (var16 >= 1) {
							for (int var17 = 0; var17 < var16 - 1; var17++) {
								var5.dr(client.pf_fld[var17], client.pd_fld[var17], var6, (byte)-70);
							}
						}
					}
				}

				this.dr(var2, var3, var4, (byte)-66);
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("isFriendsChatMember")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isFriendsChatMember() {
		return this.ah((byte)-45);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ci() {
		return this.et(260731919) ? 0 : this.bz_fld;
	}

	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean tu() {
		return this.at_fld;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V"
	)
	public static void ex(cv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bd_fld = rw.ak_fld;
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getName() {
		if (this.az_fld == null) {
			return null;
		} else {
			String var1 = this.az_fld.ah();
			return var1 == null ? null : var1.replace(' ', ' ');
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn ax() {
		try {
			if (this.av_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)11);
				qa var2 = this.ab_fld ? null : da.dp(this, var1, 1455735519);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (qa.jo(this.cz_fld, 30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : var1.ae();
				ol var4 = null == var2 ? null : var2.ae();
				int var5 = null == var1 ? -1 : qa.do_(var1, 1255898958);
				int var6 = null == var2 ? -1 : qa.do_(var2, -1384840775);
				fn var7 = lp.ph(this.av_fld, var3, var5, var4, var6, (byte)11);
				if (var7 == null) {
					return null;
				} else {
					var7.eu();
					this.dh_fld = var7.ez_fld;
					int var8 = var7.bw_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.al_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.af_fld && client.dv_fld < this.al_fld) {
							fn var9 = this.ai_fld;
							var9.fo(this.au_fld - this.bo_fld, this.ax_fld - this.ar_fld, this.aa_fld - this.bp_fld);
							if (512 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							} else if (1024 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1536 == this.dv_fld) {
								fn.hw(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (512 == this.dv_fld) {
								fn.hw(var9);
							} else if (1318904245 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1536 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							}

							var9.fo(this.bo_fld - this.au_fld, this.ar_fld - this.ax_fld, this.bp_fld - this.aa_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bf_fld && client.dv_fld < this.by_fld) {
						fn.li(var7, this.be_fld, (short)var8);
					} else {
						rl1.lx(var7);
					}

					return var7;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	final boolean bm(int var1) {
		return null != this.av_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	int br(byte var1) {
		return this.et(260731919) ? 0 : this.bz_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lfy;"
	)
	@Override
	public fy be(int var1) {
		return null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lfk;"
	)
	@Override
	protected fk bk(int var1) {
		return fk.az_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int bh(int var1) {
		return 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	final boolean ca() {
		return null != this.av_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cd() {
		this.bd_fld = rw.ak_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cq() {
		this.bd_fld = rw.ak_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			if (this.av_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)26);
				qa var2 = this.ab_fld ? null : da.dp(this, var1, 707394000);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (qa.jo(this.cz_fld, 30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : var1.ae();
				ol var4 = null == var2 ? null : var2.ae();
				int var5 = null == var1 ? -1 : qa.do_(var1, -1228724083);
				int var6 = null == var2 ? -1 : qa.do_(var2, -1878046554);
				fn var7 = lp.ph(this.av_fld, var3, var5, var4, var6, (byte)29);
				if (var7 == null) {
					return null;
				} else {
					var7.eu();
					this.dh_fld = var7.ez_fld;
					int var8 = var7.bw_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.al_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.af_fld && client.dv_fld < this.al_fld) {
							fn var9 = this.ai_fld;
							var9.fo(this.au_fld - this.bo_fld, this.ax_fld - this.ar_fld, this.aa_fld - this.bp_fld);
							if (512 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							} else if (1024 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1804353656 == this.dv_fld) {
								fn.hw(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (-221960249 == this.dv_fld) {
								fn.hw(var9);
							} else if (1024 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1536 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							}

							var9.fo(this.bo_fld - this.au_fld, this.ar_fld - this.ax_fld, this.bp_fld - this.aa_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bf_fld && client.dv_fld < this.by_fld) {
						fn.li(var7, this.be_fld, (short)var8);
					} else {
						rl1.lx(var7);
					}

					return var7;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Lcv;Ldx;IILgt;)V"
	)
	public static void ek(cv var0, dx var1, int var2, int var3, gt var4) throws EOFException {
		try {
			if (var0.cm_fld.av() && var0.cm_fld.ae().bw_fld * 1786156186 == 1) {
				da.fz(var0, -767301401);
			}

			if (ll.ak_fld == var0.cg_fld.ak_fld) {
				da.lq(var0, (byte)-57);
			}

			if (!var1.ae(var2, var3, 412600668)) {
				var0.da(var2, var3, -933510176);
			} else if (!var1.ae(var0.dq_fld[0], var0.do_fld[0], 2138045124)) {
				var0.da(var2, var3, 1206129961);
			} else {
				if (var4 == gt.av_fld) {
					cv var5 = var0;
					gt var6 = gt.av_fld;
					int var7 = var0.dq_fld[0];
					int var8 = var0.do_fld[0];
					int var9 = -2106839931 * var0.bv_fld;
					gn var10 = var1.av_fld[var1.ae_fld];
					if (var7 >= var9
						&& var7 < var10.az(253086087) - var9
						&& var8 >= var9
						&& var8 < var10.av((byte)-57) - var9
						&& var2 >= var9
						&& var2 < var10.az(658053471) - var9
						&& var3 >= var9
						&& var3 < var10.av((byte)-102) - var9) {
						gp var11 = client.bi_fld;
						client.cu_fld.ak_fld = var2;
						client.cu_fld.ag_fld = var3;
						client.cu_fld.az_fld = 817565282;
						client.cu_fld.av_fld = -1481946841;
						bl var15 = client.cu_fld;
						int var16 = var11.ag(var7, var8, var9, var15, var10, true, client.pf_fld, client.pd_fld, 503341895);
						if (var16 >= 1) {
							for (int var17 = 0; var17 < var16 - 1; var17++) {
								var5.dr(client.pf_fld[var17], client.pd_fld[var17], var6, (byte)-87);
							}
						}
					}
				}

				var0.dr(var2, var3, var4, (byte)-15);
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			if (this.av_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)83);
				qa var2 = this.ab_fld ? null : da.dp(this, var1, 106468214);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (qa.jo(this.cz_fld, 30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : var1.ae();
				ol var4 = null == var2 ? null : var2.ae();
				int var5 = null == var1 ? -1 : qa.do_(var1, 1094486228);
				int var6 = null == var2 ? -1 : qa.do_(var2, -958659480);
				fn var7 = lp.ph(this.av_fld, var3, var5, var4, var6, (byte)-25);
				if (var7 == null) {
					return null;
				} else {
					var7.eu();
					this.dh_fld = var7.ez_fld;
					int var8 = var7.bw_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.al_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.af_fld && client.dv_fld < this.al_fld) {
							fn var9 = this.ai_fld;
							var9.fo(this.au_fld - this.bo_fld, this.ax_fld - this.ar_fld, this.aa_fld - this.bp_fld);
							if (512 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							} else if (1024 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1536 == this.dv_fld) {
								fn.hw(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (512 == this.dv_fld) {
								fn.hw(var9);
							} else if (1024 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1536 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							}

							var9.fo(this.bo_fld - this.au_fld, this.ar_fld - this.ax_fld, this.bp_fld - this.aa_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bf_fld && client.dv_fld < this.by_fld) {
						fn.li(var7, this.be_fld, (short)var8);
					} else {
						rl1.lx(var7);
					}

					return var7;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			if (null == this.av_fld) {
				return false;
			} else if (this.ai_fld != null && this.ai_fld.cv_fld != null) {
				return true;
			} else if (da.ll(this, 1862216665)) {
				return true;
			} else {
				fn var1 = lp.ph(this.av_fld, null, -1, null, -1, (byte)-121);
				return var1 != null && var1.cv_fld != null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			if (null == this.av_fld) {
				return false;
			} else if (this.ai_fld != null && this.ai_fld.cv_fld != null) {
				return true;
			} else if (da.ll(this, -655562034)) {
				return true;
			} else {
				fn var1 = lp.ph(this.av_fld, null, -1, null, -1, (byte)-11);
				return var1 != null && var1.cv_fld != null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lcv;II)V"
	)
	public static void ak(cv var0, int var1, int var2) {
		var0.dq_fld[0] = var1;
		var0.do_fld[0] = var2;
		var0.dm_fld = 0;
	}

	@ObfuscatedName("getTeam")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTeam() {
		return this.ap_fld;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "()Llp;"
	)
	public lp getPlayerComposition() {
		return this.av_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			if (null == this.av_fld) {
				return false;
			} else if (this.ai_fld != null && this.ai_fld.cv_fld != null) {
				return true;
			} else if (da.ll(this, 1137143547)) {
				return true;
			} else {
				fn var1 = lp.ph(this.av_fld, null, -1, null, -1, (byte)7);
				return var1 != null && var1.cv_fld != null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bf() {
		return this.ac_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luy;)Luy;"
	)
	public static uy ag(uy var0) {
		synchronized (uy.ag_fld) {
			if (uy.av_fld == 0) {
				return new uy(var0);
			} else {
				uy.nf(uy.ag_fld[(uy.av_fld -= 1453506371) * 848250219], var0, (byte)-50);
				return uy.ag_fld[uy.av_fld];
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void by(xi var1) {
		try {
			var1.au_fld = 0;
			byte var2 = xi.rp(var1, -1013015895);
			byte var3 = -1;
			this.ae_fld = xi.rp(var1, 1386502140);
			this.ah_fld = xi.rp(var1, -1853159400);
			int var4 = -1;
			this.ap_fld = 0;
			int[] var5 = new int[12];

			for (int var6 = 0; var6 < var5.length; var6++) {
				int var7 = var1.cg();
				if (var7 == 0) {
					var5[var6] = 0;
				} else {
					int var8 = var1.cg();
					int var9 = var8 + (var7 << 8);
					if (var6 == 0 && var9 == 65535) {
						var4 = xi.tx(var1, 1457636920);
						break;
					}

					var5[var6] = var9;
					if (ks(this, var5[var6])) {
						int var10 = ok(this, var5[var6]).ea_fld * 52476663;
						if (var10 != 0) {
							this.ap_fld = var10;
						}
					}
				}
			}

			int[] var16 = new int[12];

			for (int var17 = 0; var17 < var16.length; var17++) {
				int var19 = var1.cg();
				if (var19 == 0) {
					var16[var17] = 0;
				} else {
					int var22 = var1.cg();
					var16[var17] = var22 + (var19 << 8);
				}
			}

			int[] var18 = new int[5];

			for (int var20 = 0; var20 < var18.length; var20++) {
				int var23 = var1.cg();
				if (var23 < 0 || var23 >= mn.av_fld[var20].length) {
					var23 = 0;
				}

				var18[var20] = var23;
			}

			this.bi_fld = xi.tx(var1, 1556794644);
			if (65535 == this.bi_fld) {
				this.bi_fld = 1804501961;
			}

			this.bu_fld = xi.tx(var1, 1980939767);
			if (65535 == this.bu_fld) {
				this.bu_fld = -390804923;
			}

			this.bn_fld = this.bu_fld;
			this.bc_fld = xi.tx(var1, 1080002613);
			if (65535 == this.bc_fld) {
				this.bc_fld = -1736627783;
			}

			this.bw_fld = xi.tx(var1, 620905512);
			if (this.bw_fld == 65535) {
				this.bw_fld = 906384375;
			}

			this.ba_fld = xi.tx(var1, 1718304053);
			if (65535 == this.ba_fld) {
				this.ba_fld = -302068843;
			}

			this.bq_fld = xi.tx(var1, 1337744617);
			if (this.bq_fld == 65535) {
				this.bq_fld = -1430908963;
			}

			this.bg_fld = xi.tx(var1, 1199967695);
			if (this.bg_fld == 65535) {
				this.bg_fld = 1064017983;
			}

			this.az_fld = new aax(xi.kc(var1, -1303329600), fr.gv_fld);
			this.aw((byte)110);
			oj(this, 626304450);
			ex(this, 199811264);
			if (client.dj_fld == this.bx_fld) {
				aak.ag_fld = this.az_fld.ak(-676145544);
			}

			this.ay_fld = var1.cg();
			this.as_fld = xi.tx(var1, 694469350);
			this.at_fld = var1.cg() == 1;
			if (client.gu_fld == 0 && client.jl_fld >= 2) {
				this.at_fld = false;
			}

			oo[] var21 = null;
			boolean var24 = false;
			int var26 = xi.tx(var1, 2019224741);
			var24 = 1 == (var26 >> 15 & 1);
			if (var26 > 0 && var26 != 32768) {
				var21 = new oo[12];

				for (int var11 = 0; var11 < var21.length; var11++) {
					int var12 = var26 >> 12 - var11 & 1;
					if (var12 == 1) {
						var21[var11] = mk.ak(var5[var11] - 2048, var1);
					}
				}
			}

			for (int var27 = 0; var27 < 3; var27++) {
				this.aw_fld[var27] = xi.kc(var1, 1915529412);
			}

			var3 = xi.rp(var1, -1404852006);
			if (null == this.av_fld) {
				this.av_fld = new lp();
			}

			this.av_fld.ag(var16, var5, var21, var24, var18, var2, var4, var3, (byte)-101);
			if (var4 != -1) {
				this.bv_fld = ca.az(var4).cw_fld * -152112395;
			} else {
				this.bv_fld = 1283255373;
			}

			this.bz_fld = (int)(this.bv_fld * 907428480 * 0.4F);
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	final void bl(xi var1) {
		try {
			var1.au_fld = 0;
			byte var2 = xi.rp(var1, -1096587227);
			byte var3 = -1;
			this.ae_fld = xi.rp(var1, -1375742173) * -960203631;
			this.ah_fld = xi.rp(var1, -627836699);
			int var4 = -1;
			this.ap_fld = 0;
			int[] var5 = new int[12];

			for (int var6 = 0; var6 < var5.length; var6++) {
				int var7 = var1.cg();
				if (var7 == 0) {
					var5[var6] = 0;
				} else {
					int var8 = var1.cg();
					int var9 = var8 + (var7 << 8);
					if (var6 == 0 && var9 == 65535) {
						var4 = xi.tx(var1, 1035063780);
						break;
					}

					var5[var6] = var9;
					if (ks(this, var5[var6])) {
						int var10 = ok(this, var5[var6]).ea_fld * 52476663;
						if (var10 != 0) {
							this.ap_fld = var10;
						}
					}
				}
			}

			int[] var16 = new int[12];

			for (int var17 = 0; var17 < var16.length; var17++) {
				int var19 = var1.cg();
				if (var19 == 0) {
					var16[var17] = 0;
				} else {
					int var22 = var1.cg();
					var16[var17] = var22 + (var19 << 8);
				}
			}

			int[] var18 = new int[5];

			for (int var20 = 0; var20 < var18.length; var20++) {
				int var23 = var1.cg();
				if (var23 < 0 || var23 >= mn.av_fld[var20].length) {
					var23 = 0;
				}

				var18[var20] = var23;
			}

			this.bi_fld = xi.tx(var1, 1040394538) * -707927111;
			if (65535 == this.bi_fld) {
				this.bi_fld = 1804501961;
			}

			this.bu_fld = xi.tx(var1, 725653574) * -1308905955;
			if (537647957 == this.bu_fld) {
				this.bu_fld = -651549016;
			}

			this.bn_fld = this.bu_fld;
			this.bc_fld = xi.tx(var1, 1986045708) * 355553150;
			if (816483710 == this.bc_fld) {
				this.bc_fld = -1736627783;
			}

			this.bw_fld = xi.tx(var1, 959428478) * -634785779;
			if (this.bw_fld == 146171081) {
				this.bw_fld = 906384375;
			}

			this.ba_fld = xi.tx(var1, 706820328) * 1586994591;
			if (-2028983269 == this.ba_fld) {
				this.ba_fld = -1475292997;
			}

			this.bq_fld = xi.tx(var1, 476595798) * -1338840356;
			if (this.bq_fld == 65535) {
				this.bq_fld = 1736820691;
			}

			this.bg_fld = xi.tx(var1, 2020168980);
			if (this.bg_fld == 1239512959) {
				this.bg_fld = 1064017983;
			}

			this.az_fld = new aax(xi.kc(var1, 130642954), fr.gv_fld);
			this.aw((byte)92);
			oj(this, 626304450);
			ex(this, 1724389003);
			if (client.dj_fld == this.bx_fld) {
				aak.ag_fld = this.az_fld.ak(1157196131);
			}

			this.ay_fld = var1.cg() * 1697727538;
			this.as_fld = xi.tx(var1, 972323741);
			this.at_fld = var1.cg() == 1;
			if (client.gu_fld == 0 && client.jl_fld >= 2) {
				this.at_fld = false;
			}

			oo[] var21 = null;
			boolean var24 = false;
			int var26 = xi.tx(var1, 1746689043);
			var24 = 1 == (var26 >> 15 & 1);
			if (var26 > 0 && var26 != 934269991) {
				var21 = new oo[12];

				for (int var11 = 0; var11 < var21.length; var11++) {
					int var12 = var26 >> 12 - var11 & 1;
					if (var12 == 1) {
						var21[var11] = mk.ak(var5[var11] - 2048, var1);
					}
				}
			}

			for (int var27 = 0; var27 < 3; var27++) {
				this.aw_fld[var27] = xi.kc(var1, -1717965652);
			}

			var3 = xi.rp(var1, 1465004284);
			if (null == this.av_fld) {
				this.av_fld = new lp();
			}

			this.av_fld.ag(var16, var5, var21, var24, var18, var2, var4, var3, (byte)42);
			if (var4 != -1) {
				this.bv_fld = ca.az(var4).cw_fld * -320646218;
			} else {
				this.bv_fld = 1283255373;
			}

			this.bz_fld = (int)(this.bv_fld * 907428480 * 0.4F);
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bq_void() {
		this.bm_fld = jr.fa_fld != null && jr.fa_fld.bo(this.az_fld, 973438713) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bo() {
		this.aj_fld = rw.ak_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bp() {
		this.aj_fld = la.fq_fld.ad(this.az_fld) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bv() {
		this.aj_fld = la.fq_fld.ad(this.az_fld) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bu() {
		if (rw.ak_fld == this.bm_fld) {
			this.af(-4821924);
		}

		return this.bm_fld == rw.ag_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bn() {
		if (rw.ak_fld == this.bm_fld) {
			this.af(-2100631616);
		}

		return this.bm_fld == rw.ag_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bw() {
		this.bm_fld = rw.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ay(int var1) {
		this.aj_fld = la.fq_fld.ad(this.az_fld) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bg() {
		this.bm_fld = jr.fa_fld != null && jr.fa_fld.bo(this.az_fld, 797843432) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int cj() {
		return this.et(260731919) ? 0 : this.bz_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cc() {
		this.bd_fld = rw.ak_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return super.bx_fld;
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lcv;II)V"
	)
	public static void ju(cv var0, int var1, int var2) {
		var0.dq_fld[0] = var1;
		var0.do_fld[0] = var2;
		var0.dm_fld = 0;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int dz() {
		return 0;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Lfk;"
	)
	@Override
	protected fk cf() {
		return fk.az_fld;
	}

	@ObfuscatedName("getCombatLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCombatLevel() {
		return this.ay_fld;
	}

	@ObfuscatedName("getConvexHull")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Override
	public Shape getConvexHull() {
		try {
			fn var1 = this.getModel();
			if (var1 == null) {
				return null;
			} else {
				dx var2 = this.getWorldView();
				int var3 = Perspective.getFootprintTileHeight(og.ci_fld, this.getLocalLocation(), var2.ae_fld, this.getFootprintSize());
				var3 -= this.getAnimationHeightOffset();
				return var1.bz(var2, super.bo_fld, super.bp_fld, this.getCurrentOrientation(), var3);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)Z"
	)
	public static boolean oh(cv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (rw.ak_fld == var0.bm_fld) {
			var0.af(-964506246);
		}

		return var0.bm_fld == rw.ag_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IILgt;)V"
	)
	final void cx(dx var1, int var2, int var3, gt var4) {
		try {
			if (this.cm_fld.av() && this.cm_fld.ae().bw_fld * 1795231779 == 1) {
				da.fz(this, -708491016);
			}

			if (ll.ak_fld == this.cg_fld.ak_fld) {
				da.lq(this, (byte)-70);
			}

			if (!var1.ae(var2, var3, 364285948)) {
				this.da(var2, var3, 781321144);
			} else if (!var1.ae(this.dq_fld[0], this.do_fld[0], 1376040715)) {
				this.da(var2, var3, -1364903307);
			} else {
				if (var4 == gt.av_fld) {
					cv var5 = this;
					gt var6 = gt.av_fld;
					int var7 = this.dq_fld[0];
					int var8 = this.do_fld[0];
					int var9 = -1262972253 * this.bv_fld;
					gn var10 = var1.av_fld[var1.ae_fld];
					if (var7 >= var9
						&& var7 < var10.az(826414555) - var9
						&& var8 >= var9
						&& var8 < var10.av((byte)-51) - var9
						&& var2 >= var9
						&& var2 < var10.az(1202265571) - var9
						&& var3 >= var9
						&& var3 < var10.av((byte)-52) - var9) {
						gp var11 = client.bi_fld;
						client.cu_fld.ak_fld = var2;
						client.cu_fld.ag_fld = var3;
						client.cu_fld.az_fld = 1424130823;
						client.cu_fld.av_fld = 432472349;
						bl var15 = client.cu_fld;
						int var16 = var11.ag(var7, var8, var9, var15, var10, true, client.pf_fld, client.pd_fld, -246552841);
						if (var16 >= 1) {
							for (int var17 = 0; var17 < var16 - 1; var17++) {
								var5.dr(client.pf_fld[var17], client.pd_fld[var17], var6, (byte)-38);
							}
						}
					}
				}

				this.dr(var2, var3, var4, (byte)-38);
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ak(int var1) {
		return this.ac_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IILgt;S)V"
	)
	final void ac(dx var1, int var2, int var3, gt var4, short var5) {
		try {
			if (this.cm_fld.av() && this.cm_fld.ae().bw_fld * 1795231779 == 1) {
				da.fz(this, 282390218);
			}

			if (ll.ak_fld == this.cg_fld.ak_fld) {
				da.lq(this, (byte)-49);
			}

			if (!var1.ae(var2, var3, 1849692099)) {
				this.da(var2, var3, -710971594);
			} else if (!var1.ae(this.dq_fld[0], this.do_fld[0], 2088006939)) {
				this.da(var2, var3, 8899605);
			} else {
				if (var4 == gt.av_fld) {
					cv var6 = this;
					gt var7 = gt.av_fld;
					int var8 = this.dq_fld[0];
					int var9 = this.do_fld[0];
					int var10 = -2106839931 * this.bv_fld;
					gn var11 = var1.av_fld[var1.ae_fld];
					if (var8 >= var10 && var8 < var11.az(-814430569) - var10 && var9 >= var10) {
						if (var9 >= var11.av((byte)-11) - var10) {
							if (var5 != 213) {
								return;
							}
						} else if (var2 >= var10 && var2 < var11.az(-288272409) - var10 && var3 >= var10) {
							if (var5 != 213) {
								return;
							}

							if (var3 < var11.av((byte)-120) - var10) {
								gp var12 = client.bi_fld;
								client.cu_fld.ak_fld = var2;
								client.cu_fld.ag_fld = var3;
								client.cu_fld.az_fld = 1424130823;
								client.cu_fld.av_fld = -1481946841;
								bl var16 = client.cu_fld;
								int var17 = var12.ag(var8, var9, var10, var16, var11, true, client.pf_fld, client.pd_fld, 707609116);
								if (var17 >= 1) {
									for (int var18 = 0; var18 < var17 - 1; var18++) {
										var6.dr(client.pf_fld[var18], client.pd_fld[var18], var7, (byte)2);
									}
								}
							}
						}
					}
				}

				this.dr(var2, var3, var4, (byte)-58);
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void gt() {
		og.ci_fld.getCallbacks().post(new PlayerChanged(this));
	}

	cv(int var1) {
		super(var1);
		this.aw_fld = new String[3];
		this.ay_fld = 0;
		this.as_fld = 0;
		this.af_fld = 0;
		this.al_fld = 0;
		this.ab_fld = false;
		this.ap_fld = 0;
		this.at_fld = false;
		this.aj_fld = rw.ak_fld;
		this.bm_fld = rw.ak_fld;
		this.bd_fld = rw.ak_fld;
		this.bz_fld = 0;

		for (int var2 = 0; var2 < 3; var2++) {
			this.aw_fld[var2] = "";
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn dp() {
		try {
			int var2 = -178304394;
			fn var10000;
			if (this.av_fld == null) {
				Object var1 = null;
				var10000 = (fn)var1;
			} else {
				qa var3 = this.ew((byte)57);
				qa var4 = this.ab_fld ? null : da.dp(this, var3, 1602525762);
				if (var3 == null && var4 == null) {
					var4 = this.cz_fld;
					if (qa.jo(this.cz_fld, 30)) {
						return null;
					}
				}

				ol var5 = null == var3 ? null : var3.ae();
				ol var6 = null == var4 ? null : var4.ae();
				int var7 = null == var3 ? -1 : qa.do_(var3, -1324092050);
				int var8 = null == var4 ? -1 : qa.do_(var4, 1631731113);
				fn var9 = lp.ph(this.av_fld, var5, var7, var6, var8, (byte)-103);
				if (var9 == null) {
					Object var14 = null;
					var10000 = (fn)var14;
				} else {
					var9.eu();
					this.dh_fld = var9.ez_fld;
					int var10 = var9.bw_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.al_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.af_fld && client.dv_fld < this.al_fld) {
							fn var11 = this.ai_fld;
							var11.fo(this.au_fld - this.bo_fld, this.ax_fld - this.ar_fld, this.aa_fld - this.bp_fld);
							if (512 == this.dv_fld) {
								fn.hw(var11);
								fn.hw(var11);
								fn.hw(var11);
							} else if (1024 == this.dv_fld) {
								fn.hw(var11);
								fn.hw(var11);
							} else if (1536 == this.dv_fld) {
								fn.hw(var11);
							}

							fn[] var12 = new fn[]{var9, var11};
							var9 = new fn(var12, 2);
							if (512 == this.dv_fld) {
								fn.hw(var11);
							} else if (1024 == this.dv_fld) {
								fn.hw(var11);
								fn.hw(var11);
							} else if (1536 == this.dv_fld) {
								fn.hw(var11);
								fn.hw(var11);
								fn.hw(var11);
							}

							var11.fo(this.bo_fld - this.au_fld, this.ar_fld - this.ax_fld, this.bp_fld - this.aa_fld);
						}
					}

					var9.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bf_fld && client.dv_fld < this.by_fld) {
						fn.li(var9, this.be_fld, (short)var10);
					} else {
						rl1.lx(var9);
					}

					var10000 = var9;
				}
			}

			return var10000;
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bj() {
		return this.ac_fld;
	}

	@ObfuscatedName("getSkullIcon")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSkullIcon() {
		return this.ae_fld;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	final boolean cw() {
		return null != this.av_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bq() {
		return this.ah_fld;
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ug() {
		return this.as_fld;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean cm(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("getFootprintSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getFootprintSize() {
		return this.bz_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	@Override
	public float bs(int var1) {
		return 1.0F;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	og cb(int var1) {
		try {
			return kb.ag(var1 - -2138669383, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("isFriend")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isFriend() {
		return this.as((byte)0);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	og cz(int var1) {
		try {
			return kb.ag(var1 - 2048, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int co() {
		return this.et(260731919) ? 0 : this.bz_fld * -853085593;
	}

	@ObfuscatedName("getOverheadIcon")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/HeadIcon;"
	)
	@Override
	public HeadIcon getOverheadIcon() {
		switch (this.bq()) {
			case 0:
				return HeadIcon.MELEE;
			case 1:
				return HeadIcon.RANGED;
			case 2:
				return HeadIcon.MAGIC;
			case 3:
				return HeadIcon.RETRIBUTION;
			case 4:
				return HeadIcon.SMITE;
			case 5:
				return HeadIcon.REDEMPTION;
			case 6:
				return HeadIcon.RANGE_MAGE;
			case 7:
				return HeadIcon.RANGE_MELEE;
			case 8:
				return HeadIcon.MAGE_MELEE;
			case 9:
				return HeadIcon.RANGE_MAGE_MELEE;
			case 10:
				return HeadIcon.WRATH;
			case 11:
				return HeadIcon.SOUL_SPLIT;
			case 12:
				return HeadIcon.DEFLECT_MELEE;
			case 13:
				return HeadIcon.DEFLECT_RANGE;
			case 14:
				return HeadIcon.DEFLECT_MAGE;
			default:
				return null;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int cu() {
		return this.et(260731919) ? 0 : this.bz_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	final boolean cg() {
		return null != this.av_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			if (this.av_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)68);
				qa var2 = this.ab_fld ? null : da.dp(this, var1, 808615915);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (qa.jo(this.cz_fld, 30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : var1.ae();
				ol var4 = null == var2 ? null : var2.ae();
				int var5 = null == var1 ? -1 : qa.do_(var1, -123827192);
				int var6 = null == var2 ? -1 : qa.do_(var2, -2016643923);
				fn var7 = lp.ph(this.av_fld, var3, var5, var4, var6, (byte)-107);
				if (var7 == null) {
					return null;
				} else {
					var7.eu();
					this.dh_fld = var7.ez_fld * 800349380;
					int var8 = var7.bw_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.al_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.af_fld && client.dv_fld < this.al_fld) {
							fn var9 = this.ai_fld;
							var9.fo(this.au_fld - this.bo_fld, this.ax_fld - this.ar_fld, this.aa_fld - this.bp_fld);
							if (-1630753081 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							} else if (-452505747 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (-356751353 == this.dv_fld) {
								fn.hw(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (512 == this.dv_fld) {
								fn.hw(var9);
							} else if (1024 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1536 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							}

							var9.fo(this.bo_fld - this.au_fld, this.ar_fld - this.ax_fld, this.bp_fld - this.aa_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bf_fld && client.dv_fld < this.by_fld) {
						fn.li(var7, this.be_fld, (short)var8);
					} else {
						rl1.lx(var7);
					}

					return var7;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy ct() {
		return null;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy cl() {
		return null;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float dc() {
		return 1.0F;
	}

	@ObfuscatedName("isClanMember")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isClanMember() {
		return fj(this, -725743415);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float dh() {
		return 1.0F;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int dv() {
		return 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn al() {
		try {
			if (this.av_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)71);
				qa var2 = this.ab_fld ? null : da.dp(this, var1, 1556359700);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (qa.jo(this.cz_fld, 30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : var1.ae();
				ol var4 = null == var2 ? null : var2.ae();
				int var5 = null == var1 ? -1 : qa.do_(var1, -1869784537);
				int var6 = null == var2 ? -1 : qa.do_(var2, 1070909318);
				fn var7 = lp.ph(this.av_fld, var3, var5, var4, var6, (byte)-12);
				if (var7 == null) {
					return null;
				} else {
					var7.eu();
					this.dh_fld = var7.ez_fld;
					int var8 = var7.bw_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.al_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.af_fld && client.dv_fld < this.al_fld) {
							fn var9 = this.ai_fld;
							var9.fo(this.au_fld - this.bo_fld, this.ax_fld - this.ar_fld, this.aa_fld - this.bp_fld);
							if (512 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							} else if (1024 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1536 == this.dv_fld) {
								fn.hw(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (512 == this.dv_fld) {
								fn.hw(var9);
							} else if (1024 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
							} else if (1536 == this.dv_fld) {
								fn.hw(var9);
								fn.hw(var9);
								fn.hw(var9);
							}

							var9.fo(this.bo_fld - this.au_fld, this.ar_fld - this.ax_fld, this.bp_fld - this.aa_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bf_fld && client.dv_fld < this.by_fld) {
						fn.li(var7, this.be_fld, (short)var8);
					} else {
						rl1.lx(var7);
					}

					return var7;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Lfk;"
	)
	@Override
	protected fk cy() {
		return fk.az_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ar(int var1) {
		this.bm_fld = rw.az_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean at(int var1) {
		if (this.aj_fld == rw.ag_fld) {
			this.af(209864395);
		}

		return this.bm_fld == rw.ak_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean bd(int var1, int var2) {
		return var1 >= 2048;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)Log;"
	)
	og bz(int var1, int var2) {
		try {
			return kb.ag(var1 - 2048, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "(Lcv;IIB)V"
	)
	public static void ua(cv var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.dq_fld[0] = var1;
		var0.do_fld[0] = var2;
		var0.dm_fld = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void aj(int var1, int var2, byte var3) {
		this.dq_fld[0] = var1;
		super.dq_fld[0] = var2;
		super.cn_fld = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ap(int var1) {
		this.aj_fld = rw.ak_fld;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bb() {
		this.bd_fld = rw.ak_fld;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Z"
	)
	public static boolean fj(cv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.bd_fld == rw.ak_fld) {
			var0.ab(209864395);
		}

		return var0.bd_fld == rw.ag_fld;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Log;"
	)
	public static og ok(cv var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				return kb.ag(var1 - 2048, -1752383175);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	og ck(int var1) {
		try {
			return kb.ag(var1 - 2048, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}
}
