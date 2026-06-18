import java.awt.Polygon;
import java.awt.Shape;
import java.io.EOFException;
import javax.annotation.Nullable;
import net.runelite.api.NPC;
import net.runelite.api.NpcOverrides;
import net.runelite.api.Perspective;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;

@ObfuscatedName("ds")
@Implements({"NPC"})
public class ds extends da implements NPC {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lxu;"
	)
	xu ar_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1147955469
	)
	int as_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld = -596753387;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	pp ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aw_fld = false;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	fy ax_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld = 1655828877;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ag_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	pg af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	pg al_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ay_fld = "";
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean au_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void bo(String var1) {
		this.ay_fld = null == var1 ? "" : var1;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Lds;B)Ljava/lang/String;"
	)
	public static String lh(ds var0, byte var1) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (!var0.ay_fld.isEmpty()) {
				return var0.ay_fld;
			} else {
				pp var2 = var0.ah_fld;
				if (null != var2.dy_fld) {
					var2 = var2.ar((byte)6);
					if (var2 == null) {
						var2 = var0.ah_fld;
					}
				}

				return var2.cg_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	void ag(String var1, byte var2) {
		this.ay_fld = null == var1 ? "" : var1;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String jv() {
		try {
			if (!og.ci_fld.isClientThread()) {
				if (!tf.$assertionsDisabled) {
					throw new AssertionError("must be called on client thread");
				} else {
					throw new IllegalStateException("must be called on client thread");
				}
			} else {
				return lh(this, (byte)1);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Llu;IB)I"
	)
	static int fz(lu var0, int var1) {
		if (null != var0.gu_fld && var1 < var0.gu_fld.length) {
			try {
				int[] var3 = var0.gu_fld[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;

				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (0 == var7) {
						return var4;
					}

					if (1 == var7) {
						var8 = client.er_fld[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = client.en_fld[var3[var5++]];
					}

					if (3 == var7) {
						var8 = client.eg_fld[var3[var5++]];
					}

					if (var7 == 4) {
						int var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						lu var11 = cf.cg_fld.ak(var10);
						int var12 = var3[var5++];
						if (var12 != -1 && (!kb.ag(var12, -1752383175).et_fld || client.ct_fld)) {
							for (int var13 = 0; var13 < var11.gf_fld.length; var13++) {
								if (1 + var12 == var11.gf_fld[var13]) {
									var8 += var11.gm_fld[var13];
								}
							}
						}
					}

					if (5 == var7) {
						var8 = rt.ag_fld[var3[var5++]];
					}

					if (6 == var7) {
						var8 = kv.az_fld[client.en_fld[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = rt.ag_fld[var3[var5++]] * 100 / 46875;
					}

					if (8 == var7) {
						cv var21 = ot.ef();
						var8 = null == var21 ? 0 : var21.ad_fld;
					}

					if (var7 == 9) {
						for (int var22 = 0; var22 < 25; var22++) {
							if (kv.ag_fld[var22]) {
								var8 += client.en_fld[var22];
							}
						}
					}

					if (var7 == 10) {
						int var23 = var3[var5++] << 16;
						var23 += var3[var5++];
						lu var29 = cf.cg_fld.ak(var23);
						int var31 = var3[var5++];
						if (var31 != -1 && (!kb.ag(var31, -1752383175).et_fld || client.ct_fld)) {
							for (int var32 = 0; var32 < var29.gf_fld.length; var32++) {
								if (var29.gf_fld[var32] == var31 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = client.ji_fld;
					}

					if (var7 == 12) {
						var8 = client.jr_fld;
					}

					if (var7 == 13) {
						int var25 = rt.ag_fld[var3[var5++]];
						int var30 = var3[var5++];
						var8 = 0 != (var25 & 1 << var30) ? 1 : 0;
					}

					if (14 == var7) {
						int var26 = var3[var5++];
						var8 = dv.ag(var26, (byte)105);
					}

					if (15 == var7) {
						var9 = 1;
					}

					if (16 == var7) {
						var9 = 2;
					}

					if (17 == var7) {
						var9 = 3;
					}

					if (var7 == 18) {
						cv var27 = ot.ef();
						var8 = bw.dk_fld.as_fld + (var27.bi_fld >> 7);
					}

					if (var7 == 19) {
						cv var28 = ot.ef();
						var8 = bw.dk_fld.ay_fld + (var28.dm_fld >> 7);
					}

					if (20 == var7) {
						var8 = var3[var5++];
					}

					if (0 == var9) {
						if (var6 == 0) {
							var4 += var8;
						}

						if (var6 == 1) {
							var4 -= var8;
						}

						if (var6 == 2 && 0 != var8) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 *= var8;
						}

						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("getOverheadSpriteIds")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Export("getOverheadSpriteIds")
	@Override
	public short[] getOverheadSpriteIds() {
		try {
			if (this.ar_fld != null) {
				return (short[])this.ar_fld.ag_fld.clone();
			} else {
				pp var1 = this.getTransformedComposition();
				return var1 != null && var1.dl_fld != null ? (short[])var1.dl_fld.clone() : null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	boolean aw(int var1, byte var2) {
		return var1 >= 0 && var1 <= 4 ? (this.as_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int co() {
		return this.et(260731919) ? 0 : this.ah_fld.ad(-1466954775);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)V"
	)
	public static void dp(ds var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILgt;I)V"
	)
	final void as(int var1, gt var2, int var3) {
		try {
			int var4 = this.ca_fld[0];
			int var5 = this.dq_fld[0];
			if (var1 == 0) {
				var4--;
				var5++;
			}

			if (1 == var1) {
				var5++;
			}

			if (var1 == 2) {
				var4++;
				var5++;
			}

			if (var1 == 3) {
				var4--;
			}

			if (4 == var1) {
				var4++;
			}

			if (var1 == 5) {
				var4--;
				var5--;
			}

			if (var1 == 6) {
				var5--;
			}

			if (7 == var1) {
				var4++;
				var5--;
			}

			if (qa.jv(this.cm_fld, 381023412) && qa.kw(this.cm_fld, -125194071).bw_fld * 1795231779 == 1) {
				this.do_(-1141818571);
			}

			this.dr(var4, var5, var2, (byte)-3);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V"
	)
	final void ar(int var1, int var2, boolean var3, byte var4) {
		try {
			if (qa.jv(this.cm_fld, 2134442109) && qa.kw(this.cm_fld, -1668414856).bw_fld * 1795231779 == 1) {
				if (var4 <= 0) {
					return;
				}

				this.do_(949041892);
			}

			if (!var3) {
				int var5 = var1 - this.ca_fld[0];
				int var6 = var2 - this.dq_fld[0];
				if (var5 >= -8) {
					if (var4 <= 0) {
						return;
					}

					if (var5 <= 8 && var6 >= -8) {
						if (var4 <= 0) {
							return;
						}

						if (var6 <= 8) {
							this.dr(var1, var2, gt.az_fld, (byte)-77);
							return;
						}
					}
				}
			}

			da.yv(this, var1, var2);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			if (this.ah_fld == null) {
				return false;
			} else if (this.dy(-466774676)) {
				return true;
			} else {
				fn var2 = null;
				if (null != this.af_fld && this.af_fld.ae_fld) {
					cv var3 = ot.ef();
					if (null != var3) {
						var2 = var3.av_fld.ar(null, -1, null, -1, (byte)-97);
					}
				} else {
					var2 = this.ah_fld.aw(null, 1, null, 1, this.af_fld, 1319378869);
				}

				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Lds;IIS)V"
	)
	public static void ky(ds var0, int var1, int var2, short var3) {
		if (var0.ar_fld == null) {
			var0.ar_fld = new xu(var0.ah_fld);
		}

		var0.ar_fld.az(var1, var2, var3);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	final boolean bm(int var1) {
		return null != this.ah_fld;
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lpg;)V"
	)
	void kg(pg var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		try {
			pp var1 = this.ah_fld;
			if (var1 != null && var1.getConfigs() != null) {
				var1 = var1.transform();
			}

			return var1 == null ? -1 : var1.getId();
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[S"
	)
	short[] ab(int var1) {
		return this.ar_fld != null ? xu.dp(this.ar_fld, (byte)42) : this.ah_fld.aq(-1910412766);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IISI)V"
	)
	void ap(int var1, int var2, short var3, int var4) {
		if (this.ar_fld == null) {
			this.ar_fld = new xu(this.ah_fld);
		}

		this.ar_fld.az(var1, var2, var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[SS)V"
	)
	void at(int[] var1, short[] var2, short var3) {
		if (null == this.ar_fld) {
			this.ar_fld = new xu(this.ah_fld);
		}

		this.ar_fld.av(var1, var2);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void by(int var1) {
		this.ar_fld = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	int[] af(int var1) {
		return null != this.ar_fld ? xu.zg(this.ar_fld, -929120066) : pp.mm(this.ah_fld, 1804117439);
	}

	@Nullable
	@ObfuscatedName("getChatheadOverrides")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/NpcOverrides;"
	)
	@Export("getChatheadOverrides")
	@Override
	public NpcOverrides getChatheadOverrides() {
		return this.al_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lpg;I)V"
	)
	void bd(pg var1, int var2) {
		this.al_fld = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lpg;I)V"
	)
	void bz(pg var1, int var2) {
		this.af_fld = var1;
	}

	@ObfuscatedName("getName")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getName")
	@Override
	public String getName() {
		try {
			if (this.ah_fld == null) {
				return null;
			} else {
				String var1 = this.jv();
				return var1.replace(' ', ' ');
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int hy() {
		try {
			return (-1 == -1692034698 * this.ah_fld.es_fld ? this.cd_fld : this.ah_fld.es_fld * 1822119256) + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lpg;"
	)
	pg aj(byte var1) {
		return this.al_fld;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int ep(int var1) {
		try {
			return (-1 == -695561327 * this.ah_fld.es_fld ? -1950304843 * this.cd_fld : this.ah_fld.es_fld * -695561327) + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	int br(byte var1) {
		return this.et(260731919) ? 0 : this.ah_fld.ad(-1466954775);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bi(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.as_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lfy;"
	)
	fy bx(int var1) {
		int var2 = this.ah_fld.ab(580930067);
		fy var3 = this.ax_fld;
		byte var4 = ue.ak(var2, 2115810139);
		byte var5 = ue.ag(var2);
		byte var6 = (byte)(var2 & 127);
		fy.hv(var3, var4, var5, var6, (byte)127);
		return this.ax_fld;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lpg;)V"
	)
	void kb(pg var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int bh(int var1) {
		return this.au_fld ? -5 : 0;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lfk;"
	)
	@Override
	protected fk bk(int var1) {
		return !this.ah_fld.eq_fld ? fk.az_fld : super.bk(-1855039250);
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	boolean eo(int var1) {
		return this.ah_fld.dq_fld;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean ia() {
		return this.ah_fld.dq_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn ax() {
		try {
			if (this.ah_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)-17);
				qa var2 = da.yp(this, var1, 2047884037);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = var1 == null ? null : qa.kw(var1, -2058472448);
				ol var4 = null == var2 ? null : qa.kw(var2, 253492857);
				int var5 = null == var1 ? -1 : var1.aw(-997382281);
				int var6 = null == var2 ? -1 : var2.aw(-1310865506);
				fn var7 = null;
				if (this.af_fld != null && this.af_fld.ae_fld) {
					cv var8 = ot.ef();
					if (var8 != null) {
						var7 = var8.av_fld.ar(var3, var5, var4, var6, (byte)-66);
					}
				} else {
					var7 = this.ah_fld.aw(var3, var5, var4, var6, this.af_fld, 1535988344);
				}

				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var11 = var7.ke_fld;
					if (1 == 1161975113 * this.ah_fld.cw_fld) {
						var7.cw_fld = true;
					}

					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var11);
					} else {
						var7.cs();
					}

					if (this.au_fld) {
						var7.gj(this.bx(-1393387783), (short)var7.ke_fld);
						var7.gu(0.01F);
						var7.ce(-5);
					}

					return var7;
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			if (this.ah_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)-4);
				qa var2 = da.yp(this, var1, 1841849619);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = var1 == null ? null : qa.kw(var1, -1189733917);
				ol var4 = null == var2 ? null : qa.kw(var2, -496071745);
				int var5 = null == var1 ? -1 : var1.aw(251970869);
				int var6 = null == var2 ? -1 : var2.aw(-500011755);
				fn var7 = null;
				if (this.af_fld != null && this.af_fld.ae_fld) {
					cv var8 = ot.ef();
					if (var8 != null) {
						var7 = var8.av_fld.ar(var3, var5, var4, var6, (byte)-90);
					}
				} else {
					var7 = this.ah_fld.aw(var3, var5, var4, var6, this.af_fld, 568753661);
				}

				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var11 = var7.ke_fld;
					if (1 == -1070340040 * this.ah_fld.cw_fld) {
						var7.cw_fld = true;
					}

					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var11);
					} else {
						var7.cs();
					}

					if (this.au_fld) {
						var7.gj(this.bx(-1393011857), (short)var7.ke_fld);
						var7.gu(0.01F);
						var7.ce(-5);
					}

					return var7;
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			if (this.ah_fld == null) {
				return false;
			} else if (this.dy(492977244)) {
				return true;
			} else {
				fn var1 = null;
				if (null != this.af_fld && this.af_fld.ae_fld) {
					cv var2 = ot.ef();
					if (null != var2) {
						var1 = var2.av_fld.ar(null, -1, null, -1, (byte)35);
					}
				} else {
					var1 = this.ah_fld.aw(null, 1, null, 1, this.af_fld, 1456747435);
				}

				return null != var1 && null != var1.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			if (this.ah_fld == null) {
				return false;
			} else if (this.dy(1891533554)) {
				return true;
			} else {
				fn var1 = null;
				if (null != this.af_fld && this.af_fld.ae_fld) {
					cv var2 = ot.ef();
					if (null != var2) {
						var1 = var2.av_fld.ar(null, -1, null, -1, (byte)84);
					}
				} else {
					var1 = this.ah_fld.aw(null, 1, null, 1, this.af_fld, 587301806);
				}

				return null != var1 && null != var1.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@Nullable
	@ObfuscatedName("getModelOverrides")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/NpcOverrides;"
	)
	@Export("getModelOverrides")
	@Override
	public NpcOverrides getModelOverrides() {
		return this.af_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			if (this.ah_fld == null) {
				return false;
			} else if (this.dy(-355522222)) {
				return true;
			} else {
				fn var1 = null;
				if (null != this.af_fld && this.af_fld.ae_fld) {
					cv var2 = ot.ef();
					if (null != var2) {
						var1 = var2.av_fld.ar(null, -1, null, -1, (byte)-94);
					}
				} else {
					var1 = this.ah_fld.aw(null, 1, null, 1, this.af_fld, 653422860);
				}

				return null != var1 && null != var1.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	@Override
	public float bs(int var1) {
		return this.au_fld ? 0.01F : 1.0F;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Lfk;"
	)
	@Override
	protected fk cf() {
		return !this.ah_fld.eq_fld ? fk.az_fld : super.bk(-1886635547);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	final boolean ca() {
		return null != this.ah_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	final boolean cg() {
		return null != this.ah_fld;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	final boolean cw() {
		return null != this.ah_fld;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "()Lpg;"
	)
	pg ke() {
		return this.al_fld;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ci() {
		return this.et(260731919) ? 0 : this.ah_fld.ad(-1466954775);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	final String bq() {
		try {
			if (!this.ay_fld.isEmpty()) {
				return this.ay_fld;
			} else {
				pp var1 = this.ah_fld;
				if (null != var1.dy_fld) {
					var1 = var1.ar((byte)6);
					if (var1 == null) {
						var1 = this.ah_fld;
					}
				}

				return var1.cg_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy ch() {
		return this.au_fld ? this.bx(-1088633684) : null;
	}

	@ObfuscatedName("getCombatLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getCombatLevel")
	@Override
	public int getCombatLevel() {
		try {
			if (!og.ci_fld.isClientThread()) {
				if (!tf.$assertionsDisabled) {
					throw new AssertionError("must be called on client thread");
				} else {
					throw new IllegalStateException("must be called on client thread");
				}
			} else if (super.bo_fld != -1) {
				return super.bo_fld;
			} else {
				pp var1 = this.ah_fld;
				if (var1 != null && var1.getConfigs() != null) {
					var1 = var1.transform();
				}

				return var1 == null ? -1 : var1.getCombatLevel();
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "()Lpp;"
	)
	public pp getComposition() {
		return this.ah_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void bt(String var1) {
		this.ay_fld = null == var1 ? "" : var1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy cl() {
		return this.au_fld ? this.bx(-1782600007) : null;
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void lw() {
		this.al_fld = null;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float dh() {
		return this.au_fld ? 0.01F : 1.0F;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int dv() {
		return this.au_fld ? 921978657 : 0;
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int dz() {
		return this.au_fld ? -5 : 0;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int hx() {
		try {
			return (-1 == -695561327 * this.ah_fld.es_fld ? this.cd_fld : this.ah_fld.es_fld * -695561327) + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int hu() {
		try {
			return (-1 == -695561327 * this.ah_fld.es_fld ? -1950304843 * this.cd_fld : this.ah_fld.es_fld * -695561327) + this.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ah(int var1, int var2) {
		this.as_fld = var1;
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean il() {
		return this.ah_fld.dq_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lfy;"
	)
	@Override
	public fy be(int var1) {
		return this.au_fld ? this.bx(-1402127565) : null;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	boolean iq() {
		return this.ah_fld.dq_fld;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int cu() {
		return this.et(260731919) ? 0 : this.ah_fld.ad(-1466954775);
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)Z"
	)
	public static boolean fe(ds var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return var1 >= 0 && var1 <= 4 ? (var0.as_fld & 1 << var1) != 0 : true;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getIndex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getIndex")
	@Override
	public int getIndex() {
		return super.bq_fld;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	fy ld() {
		int var1 = this.ah_fld.ab(-1367203244);
		fy var2 = this.ax_fld;
		byte var3 = ue.ak(var1, 1567829471);
		byte var4 = ue.ag(var1);
		byte var5 = (byte)(var1 & 127);
		fy.hv(var2, var3, var4, var5, (byte)127);
		return this.ax_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	final String ba() {
		try {
			if (!this.ay_fld.isEmpty()) {
				return this.ay_fld;
			} else {
				pp var1 = this.ah_fld;
				if (null != var1.dy_fld) {
					var1 = var1.ar((byte)6);
					if (var1 == null) {
						var1 = this.ah_fld;
					}
				}

				return var1.cg_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn al() {
		try {
			if (this.ah_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)111);
				qa var2 = da.yp(this, var1, 986577271);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = var1 == null ? null : qa.kw(var1, 1948391714);
				ol var4 = null == var2 ? null : qa.kw(var2, 1690515086);
				int var5 = null == var1 ? -1 : var1.aw(112655392);
				int var6 = null == var2 ? -1 : var2.aw(868342558);
				fn var7 = null;
				if (this.af_fld != null && this.af_fld.ae_fld) {
					cv var8 = ot.ef();
					if (var8 != null) {
						var7 = var8.av_fld.ar(var3, var5, var4, var6, (byte)-34);
					}
				} else {
					var7 = this.ah_fld.aw(var3, var5, var4, var6, this.af_fld, 875389717);
				}

				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var11 = var7.ke_fld;
					if (1 == 1161975113 * this.ah_fld.cw_fld) {
						var7.cw_fld = true;
					}

					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var11);
					} else {
						var7.cs();
					}

					if (this.au_fld) {
						var7.gj(this.bx(-1096023523), (short)var7.ke_fld);
						var7.gu(0.01F);
						var7.ce(-5);
					}

					return var7;
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	int[] cs() {
		return null != this.ar_fld ? xu.zg(this.ar_fld, -929120066) : pp.mm(this.ah_fld, 1041083137);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bu(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.as_fld & 1 << var1) != 0 : true;
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
				int var2 = this.getAnimationFrame();
				int var3 = this.getPoseAnimationFrame();

				fn var4;
				try {
					super.cm_fld.ae_fld = -2147483648 | Math.max(super.cm_fld.av_fld * 1668710195 - 1, 0) << 16 | var2;
					super.cw_fld.ae_fld = -1073741824 | Math.max(super.cw_fld.av_fld * 1668710195 - 1, 0) << 16 | var3;
					var4 = this.ma();
				} finally {
					super.cm_fld.ae_fld = var2;
					super.cw_fld.ae_fld = var3;
				}

				return var4;
			} else {
				return this.ma();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bw(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.as_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float dc() {
		return this.au_fld ? 0.01F : 1.0F;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Lfk;"
	)
	@Override
	protected fk cy_fk() {
		return !this.ah_fld.eq_fld ? fk.az_fld : super.bk(-1793541582);
	}

	@ObfuscatedName("getCanvasTilePoly")
	@ObfuscatedSignature(
		descriptor = "()Ljava/awt/Polygon;"
	)
	@Export("getCanvasTilePoly")
	@Override
	public Polygon getCanvasTilePoly() {
		try {
			pp var1 = this.getTransformedComposition();
			if (var1 == null) {
				return null;
			} else {
				int var2 = var1.getSize();
				return Perspective.getCanvasTileAreaPoly(og.ci_fld, this.getLocalLocation(), var2);
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILgt;)V"
	)
	final void bg(int var1, gt var2) {
		try {
			int var3 = this.ca_fld[0];
			int var4 = this.dq_fld[0];
			if (var1 == 0) {
				var3--;
				var4++;
			}

			if (1 == var1) {
				var4++;
			}

			if (var1 == 2) {
				var3++;
				var4++;
			}

			if (var1 == 3) {
				var3--;
			}

			if (4 == var1) {
				var3++;
			}

			if (var1 == 5) {
				var3--;
				var4--;
			}

			if (var1 == 6) {
				var4--;
			}

			if (7 == var1) {
				var3++;
				var4--;
			}

			if (qa.jv(this.cm_fld, -450914360) && qa.kw(this.cm_fld, -894791013).bw_fld * 1795231779 == 1) {
				this.do_(-236357370);
			}

			this.dr(var3, var4, var2, (byte)-56);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILgt;)V"
	)
	final void bb(int var1, gt var2) {
		try {
			int var3 = this.ca_fld[0];
			int var4 = this.dq_fld[0];
			if (var1 == 0) {
				var3--;
				var4++;
			}

			if (1 == var1) {
				var4++;
			}

			if (var1 == 2) {
				var3++;
				var4++;
			}

			if (var1 == 3) {
				var3--;
			}

			if (4 == var1) {
				var3++;
			}

			if (var1 == 5) {
				var3--;
				var4--;
			}

			if (var1 == 6) {
				var4--;
			}

			if (7 == var1) {
				var3++;
				var4--;
			}

			if (qa.jv(this.cm_fld, -1102730688) && qa.kw(this.cm_fld, 1005951296).bw_fld * 1795231779 == 1) {
				this.do_(-433686228);
			}

			this.dr(var3, var4, var2, (byte)-16);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lds;IIZ)V"
	)
	public static void kn(ds var0, int var1, int var2, boolean var3) throws EOFException {
		try {
			if (qa.jv(var0.cm_fld, 306236434) && qa.kw(var0.cm_fld, 543296740).bw_fld * 1795231779 == 1) {
				var0.do_(-678334586);
			}

			if (!var3) {
				int var4 = var1 - var0.ca_fld[0];
				int var5 = var2 - var0.dq_fld[0];
				if (var4 >= -1814132382 && var4 <= 8 && var5 >= -1649399838 && var5 <= 8) {
					var0.dr(var1, var2, gt.az_fld, (byte)-27);
					return;
				}
			}

			da.yv(var0, var1, var2);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILgt;)V"
	)
	final void cd(int var1, gt var2) {
		try {
			int var3 = this.ca_fld[0];
			int var4 = this.dq_fld[0];
			if (var1 == 0) {
				var3--;
				var4++;
			}

			if (1 == var1) {
				var4++;
			}

			if (var1 == 2) {
				var3++;
				var4++;
			}

			if (var1 == 3) {
				var3--;
			}

			if (4 == var1) {
				var3++;
			}

			if (var1 == 5) {
				var3--;
				var4--;
			}

			if (var1 == 6) {
				var4--;
			}

			if (7 == var1) {
				var3++;
				var4--;
			}

			if (qa.jv(this.cm_fld, -790395382) && qa.kw(this.cm_fld, 2010555377).bw_fld * 1795231779 == 1) {
				this.do_(515712444);
			}

			this.dr(var3, var4, var2, (byte)-81);
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			if (this.ah_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)98);
				qa var2 = da.yp(this, var1, 1460911999);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = var1 == null ? null : qa.kw(var1, 1677489811);
				ol var4 = null == var2 ? null : qa.kw(var2, 731812893);
				int var5 = null == var1 ? -1 : var1.aw(1246519469);
				int var6 = null == var2 ? -1 : var2.aw(974473945);
				fn var7 = null;
				if (this.af_fld != null && this.af_fld.ae_fld) {
					cv var8 = ot.ef();
					if (var8 != null) {
						var7 = var8.av_fld.ar(var3, var5, var4, var6, (byte)1);
					}
				} else {
					var7 = this.ah_fld.aw(var3, var5, var4, var6, this.af_fld, 340367328);
				}

				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var11 = var7.ke_fld;
					if (1 == 1161975113 * this.ah_fld.cw_fld) {
						var7.cw_fld = true;
					}

					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var11);
					} else {
						var7.cs();
					}

					if (this.au_fld) {
						var7.gj(this.bx(-1251080398), (short)var7.ke_fld);
						var7.gu(0.01F);
						var7.ce(-5);
					}

					return var7;
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("getOverheadArchiveIds")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getOverheadArchiveIds")
	@Override
	public int[] getOverheadArchiveIds() {
		try {
			if (this.ar_fld != null) {
				return (int[])this.ar_fld.ak_fld.clone();
			} else {
				pp var1 = this.getTransformedComposition();
				return var1 != null && var1.ez_fld != null ? (int[])var1.ez_fld.clone() : null;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IIZ)V"
	)
	final void cq(int var1, int var2, boolean var3) {
		try {
			if (qa.jv(this.cm_fld, -373035573) && qa.kw(this.cm_fld, 1733144161).bw_fld * 1795231779 == 1) {
				this.do_(815982508);
			}

			if (!var3) {
				int var4 = var1 - this.ca_fld[0];
				int var5 = var2 - this.dq_fld[0];
				if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
					this.dr(var1, var2, gt.az_fld, (byte)-4);
					return;
				}
			}

			da.yv(this, var1, var2);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "()Lfy;"
	)
	@Override
	public fy ct() {
		return this.au_fld ? this.bx(-1744481710) : null;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void lf() {
		this.af_fld = null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bl(int var1) {
		this.al_fld = null;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	short[] ce() {
		return this.ar_fld != null ? xu.dp(this.ar_fld, (byte)-16) : this.ah_fld.aq(-1910412766);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	short[] cn() {
		return this.ar_fld != null ? xu.dp(this.ar_fld, (byte)15) : this.ah_fld.aq(-1910412766);
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn ma() {
		try {
			int var2 = -178304394;
			fn var10000;
			if (this.ah_fld == null) {
				Object var1 = null;
				var10000 = (fn)var1;
			} else {
				qa var3 = this.ew((byte)57);
				qa var4 = da.yp(this, var3, 786862116);
				if (var3 == null && var4 == null) {
					var4 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var5 = var3 == null ? null : qa.kw(var3, 1466187605);
				ol var6 = null == var4 ? null : qa.kw(var4, 1974213854);
				int var7 = null == var3 ? -1 : var3.aw(808561641);
				int var8 = null == var4 ? -1 : var4.aw(1375890446);
				fn var9 = null;
				if (this.af_fld != null && this.af_fld.ae_fld) {
					cv var10 = ot.ef();
					if (var10 != null) {
						var9 = var10.av_fld.ar(var5, var7, var6, var8, (byte)-52);
					}
				} else {
					var9 = this.ah_fld.aw(var5, var7, var6, var8, this.af_fld, 830390062);
				}

				if (var9 == null) {
					Object var12 = null;
					var10000 = (fn)var12;
				} else {
					var9.ap();
					this.cd_fld = var9.ez_fld;
					int var14 = var9.ke_fld;
					if (1 == 1161975113 * this.ah_fld.cw_fld) {
						var9.cw_fld = true;
					}

					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var9.gj(this.be_fld, (short)var14);
					} else {
						var9.cs();
					}

					if (this.au_fld) {
						var9.gj(this.bx(-1315115765), (short)var9.ke_fld);
						var9.gu(0.01F);
						var9.ce(-5);
					}

					var10000 = var9;
				}
			}

			return var10000;
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bc(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.as_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	void cm(int var1, int var2, short var3) {
		if (this.ar_fld == null) {
			this.ar_fld = new xu(this.ah_fld);
		}

		this.ar_fld.az(var1, var2, var3);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "([I[S)V"
	)
	void cz(int[] var1, short[] var2) {
		if (null == this.ar_fld) {
			this.ar_fld = new xu(this.ah_fld);
		}

		this.ar_fld.av(var1, var2);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ck() {
		this.ar_fld = null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			if (this.ah_fld == null) {
				return null;
			} else {
				qa var1 = this.ew((byte)7);
				qa var2 = da.yp(this, var1, 575414411);
				if (var1 == null && var2 == null) {
					var2 = this.cz_fld;
					if (this.cz_fld.ax(30)) {
						return null;
					}
				}

				ol var3 = var1 == null ? null : qa.kw(var1, 724785712);
				ol var4 = null == var2 ? null : qa.kw(var2, -1026349814);
				int var5 = null == var1 ? -1 : var1.aw(687787343);
				int var6 = null == var2 ? -1 : var2.aw(-1636571502);
				fn var7 = null;
				if (this.af_fld != null && this.af_fld.ae_fld) {
					cv var8 = ot.ef();
					if (var8 != null) {
						var7 = var8.av_fld.ar(var3, var5, var4, var6, (byte)39);
					}
				} else {
					var7 = this.ah_fld.aw(var3, var5, var4, var6, this.af_fld, 1942585498);
				}

				if (var7 == null) {
					return null;
				} else {
					var7.ap();
					this.cd_fld = var7.ez_fld;
					int var11 = var7.ke_fld;
					if (1 == 1161975113 * this.ah_fld.cw_fld) {
						var7.cw_fld = true;
					}

					if (this.be_fld.av() && client.dv_fld >= this.bs_fld && client.dv_fld < this.ct_fld) {
						var7.gj(this.be_fld, (short)var11);
					} else {
						var7.cs();
					}

					if (this.au_fld) {
						var7.gj(this.bx(-2144113712), (short)var7.ke_fld);
						var7.gu(0.01F);
						var7.ce(-5);
					}

					return var7;
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "()Lpg;"
	)
	pg kq() {
		return this.al_fld;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Lpg;)V"
	)
	void kp(pg var1) {
		this.al_fld = var1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	int[] cx() {
		return null != this.ar_fld ? xu.zg(this.ar_fld, -929120066) : pp.mm(this.ah_fld, 1344491068);
	}

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "()Lpp;"
	)
	public pp getTransformedComposition() {
		try {
			pp var1 = this.getComposition();
			if (var1 != null && var1.getConfigs() != null) {
				var1 = var1.transform();
			}

			return var1;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	ds(int var1) {
		super(var1);
		this.as_fld = -949889755;
		this.ax_fld = new fy((byte)0, (byte)0, (byte)0, (byte)0);
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lpg;)V"
	)
	void ks(pg var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)V"
	)
	public static void eb(ds var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af_fld = null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void bp(String var1) {
		this.ay_fld = null == var1 ? "" : var1;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void le() {
		this.al_fld = null;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int cj() {
		return this.et(260731919) ? 0 : this.ah_fld.ad(-1466954775);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	public void cu(pp var1) {
		if (var1 == null) {
			og.ci_fld.getCallbacks().post(new NpcDespawned(this));
		} else {
			pp var2 = this.ah_fld;
			if (var2 == null) {
				client.hz_fld.add(new NpcSpawned(this));
			} else if (var1.getId() != var2.getId()) {
				client.la_java_util_List.add(new NpcChanged(this, var2));
			}
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void lg() {
		this.af_fld = null;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ln() {
		this.af_fld = null;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lpg;)V"
	)
	void kj(pg var1) {
		this.al_fld = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;IIIIIIB)V"
	)
	static void aw(dx var0, da var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) throws EOFException {
		try {
			if (ev.ti(var1, true)) {
				int var15 = var7;
				int var14 = var6;
				int var13 = var5;
				int var12 = var4;
				int var11 = var3;
				da var9 = var1;
				dx var58 = var0;
				byte var16 = 67;
				if (var1 != null && var1.bm(1078384859)) {
					zf var19;
					ku var21;
					int var22;
					int[] var23;
					boolean var24;
					int var25;
					if (var1 instanceof ds) {
						pp var17 = ((ds)var1).ah_fld;
						if (null != var17.dy_fld) {
							if (var16 <= 6) {
								return;
							}

							var17 = var17.ar((byte)6);
						}

						if (null == var17) {
							if (var16 <= 6) {
							}

							return;
						}
					}

					di var59 = client.db_fld;
					zf var18 = cu.dl_fld;
					var19 = ls.dd_fld;
					int var20 = client.ka_fld;
					var21 = client.le_fld;
					var22 = client.db_fld.al_fld;
					var23 = var59.ar_fld;
					var24 = var2 < var22;
					var25 = -2;
					label741:
					if (client.fr(1) && var1.cx_fld != null) {
						if (var16 <= 6) {
							return;
						}

						if (var24) {
							if (var1.cp_fld) {
								break label741;
							}

							if (var20 != 4) {
								if (var1.cs_fld) {
									break label741;
								}

								if (var20 != 0) {
									if (var16 <= 6) {
										return;
									}

									if (var20 != 3 && (var20 != 1 || !((cv)var1).ah((byte)0))) {
										break label741;
									}
								}
							}
						}

						nn.ay(var0, var1, var1.ep(-372081085));
						if (ch.at_fld > -1) {
							if (var16 <= 6) {
								return;
							}

							if (ch.af_fld < ch.al_fld) {
								ch.aa_fld[ch.af_fld] = var18.an(var1.cx_fld) / 2;
								ch.an_fld[ch.af_fld] = var18.ap_fld;
								ch.au_fld[ch.af_fld] = ch.at_fld;
								ch.ax_fld[ch.af_fld] = ch.ac_fld - var25;
								ch.ai_fld[ch.af_fld] = var1.cu_fld;
								ch.aq_fld[ch.af_fld] = var1.ck_fld;
								ch.ad_fld[ch.af_fld] = var1.ci_fld;
								ch.am_fld[ch.af_fld] = var1.do_fld;
								ch.ao_fld[ch.af_fld] = var1.cx_fld;
								ch.af_fld++;
								var25 += 12;
							}
						}
					}

					rg var26 = client.da_fld.ay(var1.bf_fld, (byte)34);
					if ((var26 == null || !var26.av(119840427)) && client.fr(1073741824)) {
						if (!var1.bk_fld.ar()) {
							nn.ay(var0, var1, var1.ep(1014380112) + 15);

							for (cr var27 = (cr)var1.bk_fld.ah(); null != var27; var27 = (cr)var9.bk_fld.ay()) {
								cp var28 = var27.ag(var15);
								if (var28 != null) {
									pa var29 = var27.az_fld;
									yv var30 = var29.ae(615685914);
									yv var31 = var29.av(588330049);
									int var33 = 0;
									int var32;
									if (var30 != null && var31 != null) {
										if (var29.ar_fld < var31.aw_fld) {
											if (var16 <= 6) {
												return;
											}

											var33 = var29.ar_fld;
										}

										var32 = var31.aw_fld - 2 * var33;
									} else {
										var32 = var29.ay_fld;
									}

									int var34 = 255;
									byte var35 = -1;
									int var36 = var15 - var28.av_fld;
									int var37 = var28.ak_fld * var32 / var29.ay_fld;
									int var81;
									if (var28.ag_fld > var36) {
										int var38 = 0 == var29.al_fld ? 0 : var36 / var29.al_fld * var29.al_fld;
										int var39 = var28.az_fld * var32 / var29.ay_fld;
										var81 = var39 + (var37 - var39) * var38 / var28.ag_fld;
									} else {
										var81 = var37;
										int var86 = var28.ag_fld + var29.aw_fld - var36;
										if (var29.an_fld >= 0) {
											if (var16 <= 6) {
												return;
											}

											var34 = (var86 << 8) / (var29.aw_fld - var29.an_fld);
										}
									}

									if (var28.ak_fld > 0 && var81 < 1) {
										var81 = 1;
									}

									if (var30 != null && null != var31) {
										if (var16 <= 6) {
											return;
										}

										if (var32 == var81) {
											var81 += var33 * 2;
										} else {
											var81 += var33;
										}

										int var88 = var30.ay_fld;
										var25 += var88;
										int var91 = var11 + ch.at_fld - (var32 >> 1);
										int var40 = var12 + ch.ac_fld - var25;
										var91 -= var33;
										if (var34 >= 0 && var34 < 255) {
											ow.dw(var30, var91, var40, var34);
											yu.dw(var91, var40, var81 + var91, var40 + var88);
											ow.dw(var31, var91, var40, var34);
										} else {
											yv.aj(var30, var91, var40);
											yu.dw(var91, var40, var91 + var81, var40 + var88);
											yv.aj(var31, var91, var40);
										}

										yu.dg(var11, var12, var13 + var11, var14 + var12);
										var25 += 2;
									} else {
										var25 += 5;
										if (ch.at_fld > -1) {
											int var87 = ch.at_fld + var11 - (var32 >> 1);
											int var90 = ch.ac_fld + var12 - var25;
											yu.dj(var87, var90, var81, 5, 65280);
											yu.dj(var81 + var87, var90, var32 - var81, 5, 16711680);
										}

										var25 += 2;
									}
								} else if (cr.jm(var27, -846113536)) {
									var27.gy();
								}
							}
						}

						if (var25 == -2) {
							var25 += 7;
						}

						if (var24) {
							if (var16 <= 6) {
								return;
							}

							if (var15 == var9.cn_fld && ea.dh((cv)var9)) {
								cv var64 = (cv)var9;
								if (var24) {
									nn.ay(var0, var9, var9.ep(-1864736738) + 15);
									var25 += 4;
									var19.ap(var64.az_fld.ak(-1340070115), ch.at_fld + var11, ch.ac_fld + var12 - var25, 16777215, 0);
									var25 += 18;
								}
							}
						}

						if (var24) {
							cv var65 = (cv)var9;
							if (var65.at_fld) {
								return;
							}

							if (var65.aa_fld != -1 || -1 != var65.ax_fld) {
								nn.ay(var0, var9, var9.ep(1518113170) + 15);
								if (ch.at_fld > -1) {
									if (-1 != var65.aa_fld) {
										var25 += 25;
										yv.aj(ch.ay_fld[var65.aa_fld], ch.at_fld + var11 - 12, var12 + ch.ac_fld - var25);
									}

									if (-1 != var65.ax_fld) {
										var25 += 25;
										yv.aj(ch.as_fld[var65.ax_fld], var11 + ch.at_fld - 12, ch.ac_fld + var12 - var25);
									}
								}
							}

							if (var2 >= 0 && ku.jy(var21, -1371589515) == 3) {
								if (var16 <= 6) {
									return;
								}

								if (ku.ve(var21, 205903255) == var23[var2]) {
									if (var16 <= 6) {
										return;
									}

									nn.ay(var0, var9, var9.ep(-1538655255) + 15);
									if (ch.at_fld > -1) {
										var25 += do_.ar_fld[1].ay_fld;
										yv.aj(do_.ar_fld[1], var11 + ch.at_fld - 12, ch.ac_fld + var12 - var25);
									}
								}
							}
						} else {
							ds var66 = (ds)var9;
							int[] var68 = var66.af(-1657027029);
							short[] var70 = var66.ab(297566127);
							if (null != var70 && null != var68) {
								for (int var72 = 0; var72 < var70.length; var72++) {
									if (var70[var72] >= 0 && var68[var72] >= 0) {
										long var74 = (long)var68[var72] << 8 | var70[var72];
										yv var77 = (yv)(yv)ch.ap_fld.ag(var74);
										if (var77 == null) {
											yv[] var79 = km.az(gz.hy_fld, var68[var72], 0);
											if (var79 != null && var70[var72] < var79.length) {
												var77 = var79[var70[var72]];
												ch.ap_fld.az(var74, var77);
											}
										}

										if (null != var77) {
											nn.ay(var58, var9, var9.ep(1777200565) + 15);
											if (ch.at_fld > -1) {
												yv.aj(var77, ch.at_fld + var11 - (var77.aw_fld >> 1), (var12 - var77.ay_fld - 2) * (1 + var72) - var77.ay_fld + ch.ac_fld - 4);
											}
										}
									}
								}
							}

							if (ku.jy(var21, 889949708) == 1 && ku.ve(var21, 205903255) == yw.wk(var58.am_fld, var2 - var22, (byte)84) && var15 % 20 < 10) {
								nn.ay(var58, var9, var9.ep(-74902208) + 15);
								if (ch.at_fld > -1) {
									if (var16 <= 6) {
										return;
									}

									yv.aj(do_.ar_fld[0], var11 + ch.at_fld - 12, var12 + ch.ac_fld - 28);
								}
							}
						}

						if (!var9.bh_fld.isEmpty()) {
							nn.ay(var58, var9, var9.ep(862163953) / 2);

							for (int var67 = 0; var67 < var9.bh_fld.size() && var16 > 6; var67++) {
								du var69 = (du)(du)var9.bh_fld.get(var67);
								if (var69.az(-32809735) > var15) {
									py var71 = gf.ak(du.zu(var69, (byte)54));
									if (null != var71.ac_fld) {
										var71 = var71.av();
										if (null == var71) {
											if (var16 <= 6) {
												break;
											}
											continue;
										}
									}

									if (var69.az(-32809735) - var71.ao_fld > var15) {
										if (var16 <= 6) {
											break;
										}
									} else {
										byte var73 = 2;
										yv var75 = var71.as();
										yv var76 = py.yl(var71, (byte)32);
										yv var78 = var71.ah();
										yv var80 = var71.aw();
										zf var83 = var71.ar();
										if (var83 == null) {
											var83 = ej.do_fld;
										}

										int var84 = var69.av(-1409959564);
										String var85 = var71.ae(var84);
										int var89 = var83.an(var85);
										int var93 = 0;
										if (null != var78) {
											if (var16 <= 6) {
												break;
											}

											if (null == var76 && var80 == null) {
												var93 = 1;
											} else {
												var93 = var89 / var78.aw_fld + 1;
											}
										}

										int var94 = 0;
										if (var75 != null) {
											if (var16 <= 6) {
												break;
											}

											var94 = var75.aw_fld;
										}

										var94 += 2;
										int var41 = var94;
										if (var76 != null) {
											var94 += var76.aw_fld;
										}

										int var42 = var94;
										int var43 = var94;
										if (null != var78) {
											int var44 = var78.aw_fld * var93;
											var94 += var44;
											var43 = var94 + (var44 - var89) / 2;
										} else {
											var94 += var89;
										}

										int var97 = var94;
										if (var80 != null) {
											var94 += var80.aw_fld;
										}

										int var45 = av.ak(var67);
										int var46 = ab.ag(var67);
										int var47 = var45 + ch.at_fld;
										int var48 = ch.ac_fld + var46;
										int var49 = var69.az(-32809735) - var15;
										int var50 = var71.ap_fld - var71.ap_fld * var49 / var71.ao_fld;
										int var51 = -var71.am_fld + var49 * var71.am_fld / var71.ao_fld;
										int var52 = var47 + var11 - (var94 >> 1) + var50;
										int var53 = var51 + (var48 + var12 - 12);
										int var54 = var71.ad_fld + 15 + var53;
										int var55 = 255;
										if (var71.au_fld >= 0) {
											var55 = (var49 << 8) / (var71.ao_fld - var71.au_fld);
										}

										if (var55 >= 0) {
											if (var16 <= 6) {
												break;
											}

											if (var55 < 255) {
												if (var75 != null) {
													ow.dw(var75, var52 - var75.as_fld, var53, var55);
												}

												if (null != var76) {
													ow.dw(var76, var41 + var52 - var76.as_fld, var53, var55);
												}

												if (var78 != null) {
													if (var16 <= 6) {
														break;
													}

													for (int var98 = 0; var98 < var93; var98++) {
														ow.dw(var78, var98 * var78.aw_fld + (var42 + var52 - var78.as_fld), var53, var55);
													}
												}

												if (var80 != null) {
													ow.dw(var80, var52 + var97 - var80.as_fld, var53, var55);
												}

												var83.ao(var71.ae(var69.av(-1409959564)), var43 + var52, var54, var71.at_fld, 0, var55);
												continue;
											}
										}

										if (null != var75) {
											yv.aj(var75, var52 - var75.as_fld, var53);
										}

										if (null != var76) {
											yv.aj(var76, var52 + var41 - var76.as_fld, var53);
										}

										if (null != var78) {
											for (int var56 = 0; var56 < var93; var56++) {
												if (var16 <= 6) {
													return;
												}

												yv.aj(var78, var78.aw_fld * var56 + (var42 + var52 - var78.as_fld), var53);
											}
										}

										if (null != var80) {
											yv.aj(var80, var52 + var97 - var80.as_fld, var53);
										}

										zv.uz(var83, var71.ae(var69.av(-1409959564)), var43 + var52, var54, var71.at_fld | 0xFF000000, 0);
									}
								}
							}
						}
					}
				}
			}
		} catch (Throwable var57) {
			throw new RuntimeException(var57);
		}
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

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void li() {
		this.al_fld = null;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void hc(int var0) {
		cn.ya(cx.kq_fld, client.ga_fld, (short)18462);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ac(int var1) {
		this.af_fld = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	final String ay(byte var1) {
		try {
			if (!this.ay_fld.isEmpty()) {
				return this.ay_fld;
			} else {
				pp var2 = this.ah_fld;
				if (null != var2.dy_fld) {
					var2 = var2.ar((byte)6);
					if (var2 == null) {
						var2 = this.ah_fld;
					}
				}

				return var2.cg_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}
}
