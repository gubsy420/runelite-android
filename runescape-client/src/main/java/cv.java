import java.awt.Shape;
import java.io.EOFException;
import net.runelite.api.HeadIcon;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1494805637
	)
	int aa_fld = -462564429;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	String[] aw_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 989202053
	)
	int ad_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -628777755
	)
	int ae_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -543870599
	)
	int au_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1123602841
	)
	int ac_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1305484251
	)
	int ax_fld = 813537197;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 531981267
	)
	int as_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 743106107
	)
	int af_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1858699987
	)
	int ao_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 812871689
	)
	int ap_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	fn ai_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1728293973
	)
	int ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1351237605
	)
	int ah_fld;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1174367459
	)
	int bz_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1283912451
	)
	int ar_fld;
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
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -514558841
	)
	int aq_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ab_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1288048209
	)
	int am_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	rw bd_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1361036509
	)
	int al_fld;

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cr(int var1, int var2) {
		this.ca_fld[0] = var1;
		this.dq_fld[0] = var2;
		this.ce_fld = 0;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bn() {
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
			byte var3 = var1.cw();
			byte var4 = -1;
			this.aa_fld = var1.cw();
			this.ax_fld = var1.cw();
			int var5 = -1;
			this.ac_fld = 0;
			int[] var6 = new int[12];

			for (int var7 = 0; var7 < var6.length; var7++) {
				int var8 = var1.cg();
				if (var8 == 0) {
					var6[var7] = 0;
				} else {
					int var9 = var1.cg();
					int var10 = var9 + (var8 << 8);
					if (var7 == 0 && var10 == 65535) {
						var5 = var1.cm();
						break;
					}

					var6[var7] = var10;
					if (this.bd(var6[var7], 1464851194)) {
						int var11 = this.bz(var6[var7], -1179674321).ea_fld * 52476663;
						if (var11 != 0) {
							this.ac_fld = var11;
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
					this.hw();
					return;
				}

				label263: {
					var23 = var1.cg();
					if (var23 >= 0) {
						if (var2 == 76) {
							this.hw();
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

			this.cr_fld = var1.cm();
			if (65535 == this.cr_fld) {
				this.cr_fld = 1804501961;
			}

			this.bl_fld = var1.cm();
			if (65535 == this.bl_fld) {
				if (var2 == 76) {
					this.hw();
					return;
				}

				this.bl_fld = -390804923;
			}

			this.cj_fld = this.bl_fld;
			this.dr_fld = var1.cm();
			if (65535 == this.dr_fld) {
				this.dr_fld = -1736627783;
			}

			this.cy_fld = var1.cm();
			if (this.cy_fld == 65535) {
				this.cy_fld = 906384375;
			}

			this.bx_fld = var1.cm();
			if (65535 == this.bx_fld) {
				this.bx_fld = -302068843;
			}

			this.dc_fld = var1.cm();
			if (this.dc_fld == 65535) {
				if (var2 == 76) {
					this.hw();
					return;
				}

				this.dc_fld = -1430908963;
			}

			this.cl_fld = var1.cm();
			if (this.cl_fld == 65535) {
				this.cl_fld = 1064017983;
			}

			this.az_fld = new aax(xi.at(var1, 2142535304), fr.gv_fld);
			xo(this, (byte)28);
			this.ar(626304450);
			fc(this, -894616968);
			if (client.dj_fld == this.bq_fld) {
				aak.ag_fld = this.az_fld.ak(1176999008);
			}

			this.ad_fld = var1.cg();
			this.au_fld = var1.cm();
			boolean var10001;
			if (var1.cg() == 1) {
				if (var2 == 76) {
					this.hw();
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
			int var26 = var1.cm();
			boolean var10000;
			if (1 == (var26 >> 15 & 1)) {
				if (var2 == 76) {
					this.hw();
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
				this.aw_fld[var27] = xi.at(var1, 1013778352);
			}

			var4 = var1.cw();
			if (null == this.av_fld) {
				this.av_fld = new lp();
			}

			this.av_fld.ag(var16, var6, var21, var24, var18, var3, var5, var4, (byte)-112);
			if (var5 != -1) {
				this.bn_fld = ca.az(var5).cw_fld * -152112395;
			} else {
				this.bn_fld = 1283255373;
			}

			this.al_fld = (int)(this.bn_fld * 907428480 * 0.4F);
			this.hw();
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V"
	)
	public static void qc(cv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aj_fld = la.fq_fld.ad(var0.az_fld) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "(Lcv;B)V"
	)
	public static void xo(cv var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aj_fld = rw.ak_fld;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean ah(byte var1) {
		if (rw.ak_fld == this.aj_fld) {
			qc(this, 1166506911);
		}

		return this.aj_fld == rw.ag_fld;
	}

	@ObfuscatedName("getTeam")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTeam")
	@Override
	public int getTeam() {
		return this.ac_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ar(int var1) {
		this.bm_fld = rw.ak_fld;
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

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy ch() {
		return null;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(Lcv;Lxi;)V"
	)
	public static void ew(cv var0, xi var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var1.au_fld = 0;
			byte var2 = var1.cw();
			byte var3 = -1;
			var0.aa_fld = var1.cw();
			var0.ax_fld = var1.cw();
			int var4 = -1;
			var0.ac_fld = 0;
			int[] var5 = new int[12];

			for (int var6 = 0; var6 < var5.length; var6++) {
				int var7 = var1.cg();
				if (var7 == 0) {
					var5[var6] = 0;
				} else {
					int var8 = var1.cg();
					int var9 = var8 + (var7 << 8);
					if (var6 == 0 && var9 == 65535) {
						var4 = var1.cm();
						break;
					}

					var5[var6] = var9;
					if (var0.bd(var5[var6], -1438010566)) {
						int var10 = var0.bz(var5[var6], 89490593).ea_fld * 52476663;
						if (var10 != 0) {
							var0.ac_fld = var10;
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

			var0.cr_fld = var1.cm();
			if (65535 == var0.cr_fld) {
				var0.cr_fld = 1804501961;
			}

			var0.bl_fld = var1.cm();
			if (65535 == var0.bl_fld) {
				var0.bl_fld = -390804923;
			}

			var0.cj_fld = var0.bl_fld;
			var0.dr_fld = var1.cm();
			if (65535 == var0.dr_fld) {
				var0.dr_fld = -1736627783;
			}

			var0.cy_fld = var1.cm();
			if (var0.cy_fld == 65535) {
				var0.cy_fld = 906384375;
			}

			var0.bx_fld = var1.cm();
			if (65535 == var0.bx_fld) {
				var0.bx_fld = -302068843;
			}

			var0.dc_fld = var1.cm();
			if (var0.dc_fld == 65535) {
				var0.dc_fld = -1430908963;
			}

			var0.cl_fld = var1.cm();
			if (var0.cl_fld == 65535) {
				var0.cl_fld = 1064017983;
			}

			var0.az_fld = new aax(xi.at(var1, -1303329600), fr.gv_fld);
			xo(var0, (byte)110);
			var0.ar(626304450);
			fc(var0, 199811264);
			if (client.dj_fld == var0.bq_fld) {
				aak.ag_fld = var0.az_fld.ak(-676145544);
			}

			var0.ad_fld = var1.cg();
			var0.au_fld = var1.cm();
			var0.at_fld = var1.cg() == 1;
			if (client.gu_fld == 0 && client.jl_fld >= 2) {
				var0.at_fld = false;
			}

			oo[] var21 = null;
			boolean var24 = false;
			int var26 = var1.cm();
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
				var0.aw_fld[var27] = xi.at(var1, 1915529412);
			}

			var3 = var1.cw();
			if (null == var0.av_fld) {
				var0.av_fld = new lp();
			}

			var0.av_fld.ag(var16, var5, var21, var24, var18, var2, var4, var3, (byte)-101);
			if (var4 != -1) {
				var0.bn_fld = ca.az(var4).cw_fld * -152112395;
			} else {
				var0.bn_fld = 1283255373;
			}

			var0.al_fld = (int)(var0.bn_fld * 907428480 * 0.4F);
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hw() {
		og.ci_fld.getCallbacks().post(new PlayerChanged(this));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean at(int var1) {
		if (this.bd_fld == rw.ak_fld) {
			this.ab(209864395);
		}

		return this.bd_fld == rw.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			if (client.bz_java_util_function_IntPredicate != null
				&& client.bz_java_util_function_IntPredicate
					.test(super.cm_fld.ag_fld * 163458875 != -1 ? super.cm_fld.ag_fld * 163458875 : super.cw_fld.ag_fld * 163458875)) {
				int var2 = super.cm_fld.ae_fld * 249909987;
				int var3 = super.cw_fld.ae_fld * 249909987;

				fn var4;
				try {
					super.cm_fld.ae_fld = -2147483648 | Math.max(super.cm_fld.av_fld * 1668710195 - 1, 0) << 16 | var2;
					super.cw_fld.ae_fld = -1073741824 | Math.max(super.cw_fld.av_fld * 1668710195 - 1, 0) << 16 | var3;
					var4 = this.ag();
				} finally {
					super.cm_fld.ae_fld = var2;
					super.cw_fld.ae_fld = var3;
				}

				return var4;
			} else {
				return this.ag();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V"
	)
	public static void fc(cv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bd_fld = rw.ak_fld;
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
			} else if (this.dy(2115403831)) {
				return true;
			} else {
				fn var2 = this.av_fld.ar(null, -1, null, -1, (byte)-12);
				return var2 != null && var2.cv_fld != null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn ag() {
		try {
			int var2 = -178304394;
			fn var10000;
			if (this.av_fld == null) {
				Object var1 = null;
				var10000 = (fn)var1;
			} else {
				qa var3 = this.ew((byte)57);
				qa var4 = this.ab_fld ? null : da.yp(this, var3, 1602525762);
				if (var3 == null && var4 == null) {
					var4 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var5 = null == var3 ? null : qa.kw(var3, -1043297286);
				ol var6 = null == var4 ? null : qa.kw(var4, -572280472);
				int var7 = null == var3 ? -1 : var3.aw(-1324092050);
				int var8 = null == var4 ? -1 : var4.aw(1631731113);
				fn var9 = this.av_fld.ar(var5, var7, var6, var8, (byte)-103);
				if (var9 == null) {
					Object var14 = null;
					var10000 = (fn)var14;
				} else {
					var9.ap();
					this.cd_fld = var9.ez_fld;
					int var10 = var9.ke_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.as_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.ae_fld && client.dv_fld < this.as_fld) {
							fn var11 = this.ai_fld;
							fn.pn(var11, this.af_fld - this.bi_fld, this.ao_fld - this.am_fld, this.ap_fld - this.dm_fld);
							if (512 == this.bt_fld) {
								jv.ne(var11);
								jv.ne(var11);
								jv.ne(var11);
							} else if (1024 == this.bt_fld) {
								jv.ne(var11);
								jv.ne(var11);
							} else if (1536 == this.bt_fld) {
								jv.ne(var11);
							}

							fn[] var12 = new fn[]{var9, var11};
							var9 = new fn(var12, 2);
							if (512 == this.bt_fld) {
								jv.ne(var11);
							} else if (1024 == this.bt_fld) {
								jv.ne(var11);
								jv.ne(var11);
							} else if (1536 == this.bt_fld) {
								jv.ne(var11);
								jv.ne(var11);
								jv.ne(var11);
							}

							fn.pn(var11, this.bi_fld - this.af_fld, this.am_fld - this.ao_fld, this.dm_fld - this.ap_fld);
						}
					}

					var9.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var9.gj(this.be_fld, (short)var10);
					} else {
						var9.cs();
					}

					var10000 = var9;
				}
			}

			return var10000;
		} catch (Throwable var13) {
			throw new RuntimeException(var13);
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IILgt;)V"
	)
	final void cp(dx var1, int var2, int var3, gt var4) {
		try {
			if (qa.jv(this.cm_fld, 928215646) && qa.kw(this.cm_fld, -756200616).bw_fld * 1795231779 == 1) {
				this.do_(-1212122096);
			}

			if (ll.ak_fld == this.cg_fld.ak_fld) {
				da.yb(this, (byte)-10);
			}

			if (!var1.ae(var2, var3, -648786609)) {
				da.yv(this, var2, var3);
			} else if (!var1.ae(this.ca_fld[0], this.dq_fld[0], 692017376)) {
				da.yv(this, var2, var3);
			} else {
				if (var4 == gt.av_fld) {
					cv var5 = this;
					gt var6 = gt.av_fld;
					int var7 = this.ca_fld[0];
					int var8 = this.dq_fld[0];
					int var9 = -2106839931 * this.bn_fld;
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
						int var16 = var11.ag(var7, var8, var9, var15, var10, true, client.pf_fld, client.pd_fld);
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ci() {
		return this.et(260731919) ? 0 : this.al_fld;
	}

	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "()Llp;"
	)
	public lp getPlayerComposition() {
		return this.av_fld;
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
				qa var2 = this.ab_fld ? null : da.yp(this, var1, 1455735519);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : qa.kw(var1, 460151004);
				ol var4 = null == var2 ? null : qa.kw(var2, -1202818120);
				int var5 = null == var1 ? -1 : var1.aw(1255898958);
				int var6 = null == var2 ? -1 : var2.aw(-1384840775);
				fn var7 = this.av_fld.ar(var3, var5, var4, var6, (byte)11);
				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var8 = var7.ke_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.as_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.ae_fld && client.dv_fld < this.as_fld) {
							fn var9 = this.ai_fld;
							fn.pn(var9, this.af_fld - this.bi_fld, this.ao_fld - this.am_fld, this.ap_fld - this.dm_fld);
							if (512 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							} else if (1024 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1536 == this.bt_fld) {
								jv.ne(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (512 == this.bt_fld) {
								jv.ne(var9);
							} else if (1318904245 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1536 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							}

							fn.pn(var9, this.bi_fld - this.af_fld, this.am_fld - this.ao_fld, this.dm_fld - this.ap_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var8);
					} else {
						var7.cs();
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	int br(byte var1) {
		return this.et(260731919) ? 0 : this.al_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return super.bq_fld;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)Z"
	)
	public static boolean ok(cv var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return var1 >= 2048;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "(Lcv;II)V"
	)
	public static void vb(cv var0, int var1, int var2) {
		var0.ca_fld[0] = var1;
		var0.dq_fld[0] = var2;
		var0.ce_fld = 0;
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
				qa var2 = this.ab_fld ? null : da.yp(this, var1, 707394000);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : qa.kw(var1, 1101784462);
				ol var4 = null == var2 ? null : qa.kw(var2, 347457858);
				int var5 = null == var1 ? -1 : var1.aw(-1228724083);
				int var6 = null == var2 ? -1 : var2.aw(-1878046554);
				fn var7 = this.av_fld.ar(var3, var5, var4, var6, (byte)29);
				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var8 = var7.ke_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.as_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.ae_fld && client.dv_fld < this.as_fld) {
							fn var9 = this.ai_fld;
							fn.pn(var9, this.af_fld - this.bi_fld, this.ao_fld - this.am_fld, this.ap_fld - this.dm_fld);
							if (512 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							} else if (1024 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1804353656 == this.bt_fld) {
								jv.ne(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (-221960249 == this.bt_fld) {
								jv.ne(var9);
							} else if (1024 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1536 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							}

							fn.pn(var9, this.bi_fld - this.af_fld, this.am_fld - this.ao_fld, this.dm_fld - this.ap_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var8);
					} else {
						var7.cs();
					}

					return var7;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
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
				qa var2 = this.ab_fld ? null : da.yp(this, var1, 106468214);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : qa.kw(var1, 1169733040);
				ol var4 = null == var2 ? null : qa.kw(var2, 368445173);
				int var5 = null == var1 ? -1 : var1.aw(1094486228);
				int var6 = null == var2 ? -1 : var2.aw(-958659480);
				fn var7 = this.av_fld.ar(var3, var5, var4, var6, (byte)-25);
				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var8 = var7.ke_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.as_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.ae_fld && client.dv_fld < this.as_fld) {
							fn var9 = this.ai_fld;
							fn.pn(var9, this.af_fld - this.bi_fld, this.ao_fld - this.am_fld, this.ap_fld - this.dm_fld);
							if (512 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							} else if (1024 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1536 == this.bt_fld) {
								jv.ne(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (512 == this.bt_fld) {
								jv.ne(var9);
							} else if (1024 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1536 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							}

							fn.pn(var9, this.bi_fld - this.af_fld, this.am_fld - this.ao_fld, this.dm_fld - this.ap_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var8);
					} else {
						var7.cs();
					}

					return var7;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
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
			} else if (this.dy(1862216665)) {
				return true;
			} else {
				fn var1 = this.av_fld.ar(null, -1, null, -1, (byte)-121);
				return var1 != null && var1.cv_fld != null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
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
			} else if (this.dy(-655562034)) {
				return true;
			} else {
				fn var1 = this.av_fld.ar(null, -1, null, -1, (byte)-11);
				return var1 != null && var1.cv_fld != null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
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
			} else if (this.dy(1137143547)) {
				return true;
			} else {
				fn var1 = this.av_fld.ar(null, -1, null, -1, (byte)7);
				return var1 != null && var1.cv_fld != null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int kk() {
		return this.ax_fld;
	}

	@ObfuscatedName("getCombatLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getCombatLevel")
	@Override
	public int getCombatLevel() {
		return this.ad_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bj() {
		return this.aq_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)Luy;"
	)
	public static uy ag(uy var0) {
		synchronized (uy.ag_fld) {
			if (uy.av_fld == 0) {
				return new uy(var0);
			} else {
				uy.ag_fld[(uy.av_fld -= 1453506371) * 848250219].as(var0);
				return uy.ag_fld[uy.av_fld];
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bq() {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void aj(int var1, int var2, byte var3) {
		this.ca_fld[0] = var1;
		this.dq_fld[0] = var2;
		this.ce_fld = 0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bv() {
		this.aj_fld = la.fq_fld.ad(this.az_fld) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cv() {
		if (rw.ak_fld == this.bm_fld) {
			this.af(-964506246);
		}

		return this.bm_fld == rw.ag_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bi() {
		if (rw.ak_fld == this.bm_fld) {
			this.af(-4821924);
		}

		return this.bm_fld == rw.ag_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bc() {
		if (rw.ak_fld == this.bm_fld) {
			this.af(-2100631616);
		}

		return this.bm_fld == rw.ag_fld;
	}

	@ObfuscatedName("getFootprintSize")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getFootprintSize")
	@Override
	public int getFootprintSize() {
		return this.al_fld;
	}

	@ObfuscatedName("getConvexHull")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Shape;"
	)
	@Export("getConvexHull")
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
				return var1.kw(var2, super.bi_fld, super.dm_fld, this.getCurrentOrientation(), var3);
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bu() {
		if (rw.ak_fld == this.bm_fld) {
			this.af(-54664665);
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

	@ObfuscatedName("isClanMember")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isClanMember")
	@Override
	public boolean isClanMember() {
		return this.at(-725743415);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ba() {
		this.bm_fld = rw.ak_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bg() {
		this.bm_fld = jr.fa_fld != null && jr.fa_fld.bo(this.az_fld, 797843432) ? rw.ag_fld : rw.az_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bx() {
		this.aj_fld = rw.ak_fld;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int cj() {
		return this.et(260731919) ? 0 : this.al_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cc() {
		this.bd_fld = rw.ak_fld;
	}

	@ObfuscatedName("setSkullIcon")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setSkullIcon")
	@Override
	public void setSkullIcon(int var1) {
		this.aa_fld = var1;
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IILgt;)V"
	)
	final void cx(dx var1, int var2, int var3, gt var4) {
		try {
			if (qa.jv(this.cm_fld, -1572735491) && qa.kw(this.cm_fld, -1125759693).bw_fld * 1795231779 == 1) {
				this.do_(-708491016);
			}

			if (ll.ak_fld == this.cg_fld.ak_fld) {
				da.yb(this, (byte)-70);
			}

			if (!var1.ae(var2, var3, 364285948)) {
				da.yv(this, var2, var3);
			} else if (!var1.ae(this.ca_fld[0], this.dq_fld[0], 1376040715)) {
				da.yv(this, var2, var3);
			} else {
				if (var4 == gt.av_fld) {
					cv var5 = this;
					gt var6 = gt.av_fld;
					int var7 = this.ca_fld[0];
					int var8 = this.dq_fld[0];
					int var9 = -1262972253 * this.bn_fld;
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
						int var16 = var11.ag(var7, var8, var9, var15, var10, true, client.pf_fld, client.pd_fld);
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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IILgt;)V"
	)
	final void cs(dx var1, int var2, int var3, gt var4) {
		try {
			if (qa.jv(this.cm_fld, -1319255620) && qa.kw(this.cm_fld, -1263962848).bw_fld * 1786156186 == 1) {
				this.do_(-767301401);
			}

			if (ll.ak_fld == this.cg_fld.ak_fld) {
				da.yb(this, (byte)-57);
			}

			if (!var1.ae(var2, var3, 412600668)) {
				da.yv(this, var2, var3);
			} else if (!var1.ae(this.ca_fld[0], this.dq_fld[0], 2138045124)) {
				da.yv(this, var2, var3);
			} else {
				if (var4 == gt.av_fld) {
					cv var5 = this;
					gt var6 = gt.av_fld;
					int var7 = this.ca_fld[0];
					int var8 = this.dq_fld[0];
					int var9 = -2106839931 * this.bn_fld;
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
						int var16 = var11.ag(var7, var8, var9, var15, var10, true, client.pf_fld, client.pd_fld);
						if (var16 >= 1) {
							for (int var17 = 0; var17 < var16 - 1; var17++) {
								var5.dr(client.pf_fld[var17], client.pd_fld[var17], var6, (byte)-87);
							}
						}
					}
				}

				this.dr(var2, var3, var4, (byte)-15);
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "(Lcv;B)Z"
	)
	public static boolean rp(cv var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (rw.ak_fld == var0.bm_fld) {
			var0.af(-2011677913);
		}

		return var0.bm_fld == rw.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ak(int var1) {
		return this.aq_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IILgt;S)V"
	)
	final void ac(dx var1, int var2, int var3, gt var4, short var5) {
		try {
			if (qa.jv(this.cm_fld, -685861770) && qa.kw(this.cm_fld, 1913481013).bw_fld * 1795231779 == 1) {
				this.do_(282390218);
			}

			if (ll.ak_fld == this.cg_fld.ak_fld) {
				da.yb(this, (byte)-49);
			}

			if (!var1.ae(var2, var3, 1849692099)) {
				da.yv(this, var2, var3);
			} else if (!var1.ae(this.ca_fld[0], this.dq_fld[0], 2088006939)) {
				da.yv(this, var2, var3);
			} else {
				if (var4 == gt.av_fld) {
					cv var6 = this;
					gt var7 = gt.av_fld;
					int var8 = this.ca_fld[0];
					int var9 = this.dq_fld[0];
					int var10 = -2106839931 * this.bn_fld;
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
								int var17 = var12.ag(var8, var9, var10, var16, var11, true, client.pf_fld, client.pd_fld);
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ce(int var1, int var2) {
		this.ca_fld[0] = var1;
		this.dq_fld[0] = var2;
		this.ce_fld = 0;
	}

	cv(int var1) {
		super(var1);
		this.aw_fld = new String[3];
		this.ad_fld = 0;
		this.au_fld = 0;
		this.ae_fld = 0;
		this.as_fld = 0;
		this.ab_fld = false;
		this.ac_fld = 0;
		this.at_fld = false;
		this.aj_fld = rw.ak_fld;
		this.bm_fld = rw.ak_fld;
		this.bd_fld = rw.ak_fld;
		this.al_fld = 0;

		for (int var2 = 0; var2 < 3; var2++) {
			this.aw_fld[var2] = "";
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bf() {
		return this.aq_fld;
	}

	@ObfuscatedName("isFriendsChatMember")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isFriendsChatMember")
	@Override
	public boolean isFriendsChatMember() {
		return rp(this, (byte)-45);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	final boolean cw() {
		return null != this.av_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	@Override
	public float bs(int var1) {
		return 1.0F;
	}

	@ObfuscatedName("getOverheadIcon")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/HeadIcon;"
	)
	@Export("getOverheadIcon")
	@Override
	public HeadIcon getOverheadIcon() {
		switch (this.kk()) {
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

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	og ck(int var1) {
		try {
			return kb.ag(var1 - -2138669383, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	og cb(int var1) {
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
		return this.et(260731919) ? 0 : this.al_fld * -853085593;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int cu() {
		return this.et(260731919) ? 0 : this.al_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	final boolean cg() {
		return null != this.av_fld;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Lcv;Lxi;)V"
	)
	public static void hx(cv var0, xi var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var1.au_fld = 0;
			byte var2 = var1.cw();
			byte var3 = -1;
			var0.aa_fld = var1.cw() * -960203631;
			var0.ax_fld = var1.cw();
			int var4 = -1;
			var0.ac_fld = 0;
			int[] var5 = new int[12];

			for (int var6 = 0; var6 < var5.length; var6++) {
				int var7 = var1.cg();
				if (var7 == 0) {
					var5[var6] = 0;
				} else {
					int var8 = var1.cg();
					int var9 = var8 + (var7 << 8);
					if (var6 == 0 && var9 == 65535) {
						var4 = var1.cm();
						break;
					}

					var5[var6] = var9;
					if (var0.bd(var5[var6], -1506412559)) {
						int var10 = var0.bz(var5[var6], 334466785).ea_fld * 52476663;
						if (var10 != 0) {
							var0.ac_fld = var10;
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

			var0.cr_fld = var1.cm() * -707927111;
			if (65535 == var0.cr_fld) {
				var0.cr_fld = 1804501961;
			}

			var0.bl_fld = var1.cm() * -1308905955;
			if (537647957 == var0.bl_fld) {
				var0.bl_fld = -651549016;
			}

			var0.cj_fld = var0.bl_fld;
			var0.dr_fld = var1.cm() * 355553150;
			if (816483710 == var0.dr_fld) {
				var0.dr_fld = -1736627783;
			}

			var0.cy_fld = var1.cm() * -634785779;
			if (var0.cy_fld == 146171081) {
				var0.cy_fld = 906384375;
			}

			var0.bx_fld = var1.cm() * 1586994591;
			if (-2028983269 == var0.bx_fld) {
				var0.bx_fld = -1475292997;
			}

			var0.dc_fld = var1.cm() * -1338840356;
			if (var0.dc_fld == 65535) {
				var0.dc_fld = 1736820691;
			}

			var0.cl_fld = var1.cm();
			if (var0.cl_fld == 1239512959) {
				var0.cl_fld = 1064017983;
			}

			var0.az_fld = new aax(xi.at(var1, 130642954), fr.gv_fld);
			xo(var0, (byte)92);
			var0.ar(626304450);
			fc(var0, 1724389003);
			if (client.dj_fld == var0.bq_fld) {
				aak.ag_fld = var0.az_fld.ak(1157196131);
			}

			var0.ad_fld = var1.cg() * 1697727538;
			var0.au_fld = var1.cm();
			var0.at_fld = var1.cg() == 1;
			if (client.gu_fld == 0 && client.jl_fld >= 2) {
				var0.at_fld = false;
			}

			oo[] var21 = null;
			boolean var24 = false;
			int var26 = var1.cm();
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
				var0.aw_fld[var27] = xi.at(var1, -1717965652);
			}

			var3 = var1.cw();
			if (null == var0.av_fld) {
				var0.av_fld = new lp();
			}

			var0.av_fld.ag(var16, var5, var21, var24, var18, var2, var4, var3, (byte)42);
			if (var4 != -1) {
				var0.bn_fld = ca.az(var4).cw_fld * -320646218;
			} else {
				var0.bn_fld = 1283255373;
			}

			var0.al_fld = (int)(var0.bn_fld * 907428480 * 0.4F);
		} catch (Throwable var14) {
			throw new RuntimeException(var14);
		}
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
				qa var2 = this.ab_fld ? null : da.yp(this, var1, 808615915);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : qa.kw(var1, 709452838);
				ol var4 = null == var2 ? null : qa.kw(var2, 1548624720);
				int var5 = null == var1 ? -1 : var1.aw(-123827192);
				int var6 = null == var2 ? -1 : var2.aw(-2016643923);
				fn var7 = this.av_fld.ar(var3, var5, var4, var6, (byte)-107);
				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld * 800349380;
					int var8 = var7.ke_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.as_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.ae_fld && client.dv_fld < this.as_fld) {
							fn var9 = this.ai_fld;
							fn.pn(var9, this.af_fld - this.bi_fld, this.ao_fld - this.am_fld, this.ap_fld - this.dm_fld);
							if (-1630753081 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							} else if (-452505747 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (-356751353 == this.bt_fld) {
								jv.ne(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (512 == this.bt_fld) {
								jv.ne(var9);
							} else if (1024 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1536 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							}

							fn.pn(var9, this.bi_fld - this.af_fld, this.am_fld - this.ao_fld, this.dm_fld - this.ap_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var8);
					} else {
						var7.cs();
					}

					return var7;
				}
			}
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("getSkullIcon")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getSkullIcon")
	@Override
	public int getSkullIcon() {
		return this.aa_fld;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy ct() {
		return null;
	}

	@ObfuscatedName("isFriend")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isFriend")
	@Override
	public boolean isFriend() {
		return this.ah((byte)0);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy cl() {
		return null;
	}

	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public static void uu(cv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bd_fld = rw.ak_fld;
	}

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int xy() {
		return this.au_fld;
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

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float dc() {
		return 1.0F;
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean xk() {
		return this.at_fld;
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

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		if (this.az_fld == null) {
			return null;
		} else {
			String var1 = this.az_fld.cl();
			return var1 == null ? null : var1.replace(' ', ' ');
		}
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
				qa var2 = this.ab_fld ? null : da.yp(this, var1, 1556359700);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = null == var1 ? null : qa.kw(var1, -1677078878);
				ol var4 = null == var2 ? null : qa.kw(var2, -518930444);
				int var5 = null == var1 ? -1 : var1.aw(-1869784537);
				int var6 = null == var2 ? -1 : var2.aw(1070909318);
				fn var7 = this.av_fld.ar(var3, var5, var4, var6, (byte)-12);
				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var8 = var7.ke_fld;
					if (!this.ab_fld && null != this.ai_fld) {
						if (client.dv_fld >= this.as_fld) {
							this.ai_fld = null;
						}

						if (client.dv_fld >= this.ae_fld && client.dv_fld < this.as_fld) {
							fn var9 = this.ai_fld;
							fn.pn(var9, this.af_fld - this.bi_fld, this.ao_fld - this.am_fld, this.ap_fld - this.dm_fld);
							if (512 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							} else if (1024 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1536 == this.bt_fld) {
								jv.ne(var9);
							}

							fn[] var10 = new fn[]{var7, var9};
							var7 = new fn(var10, 2);
							if (512 == this.bt_fld) {
								jv.ne(var9);
							} else if (1024 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
							} else if (1536 == this.bt_fld) {
								jv.ne(var9);
								jv.ne(var9);
								jv.ne(var9);
							}

							fn.pn(var9, this.bi_fld - this.af_fld, this.am_fld - this.ao_fld, this.dm_fld - this.ap_fld);
						}
					}

					var7.cw_fld = true;
					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var8);
					} else {
						var7.cs();
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
	protected fk cy_fk() {
		return fk.az_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void aw(byte var1) {
		this.bm_fld = rw.az_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean as(byte var1) {
		if (rw.az_fld == this.aj_fld) {
			this.ar(-2011677913);
		}

		return this.aj_fld == rw.az_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ay(int var1) {
		this.bm_fld = la.fq_fld.ad(this.az_fld) ? rw.ak_fld : rw.ak_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ap(int var1) {
		this.aj_fld = rw.az_fld;
	}
}
