import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ml")
public class ml extends aj {
	@ObfuscatedGetter(
		intValue = -1505883987
	)
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bj_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ao_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ac_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/PriorityQueue;"
	)
	PriorityQueue ah_fld = new PriorityQueue(5, new ni());
	@ObfuscatedGetter(
		intValue = -1034371599
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld = 0;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ay_fld = new int[16];
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] as_fld = new int[16];
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] at_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/atomic/AtomicBoolean;"
	)
	static AtomicBoolean av_fld = null;
	@ObfuscatedGetter(
		intValue = -1541053651
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ap_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ax_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] an_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ad_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ar_fld = new int[16];
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ab_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[[Lmg;"
	)
	mg[][] be_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/ThreadPoolExecutor;"
	)
	static ThreadPoolExecutor ae_fld = null;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bz_fld;
	@ObfuscatedGetter(
		intValue = 1080906443
	)
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int bk_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bm_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] bd_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	xz af_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aj_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "[[Lmg;"
	)
	mg[][] br_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean bh_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	mw bs_fld;
	@ObfuscatedGetter(
		intValue = 1015356309
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		longValue = -856442476040697031L
	)
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long bf_fld;
	@ObfuscatedGetter(
		longValue = 2714334710322592109L
	)
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long by_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	mk bl_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	ao bx_fld;
	@ObfuscatedGetter(
		intValue = -1811355617
	)
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ob_fld;

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Lml;I)V"
	)
	public static void eg(ml var0, int var1) {
		if ((var0.ay_fld[var1] & 4) != 0) {
			for (mg var2 = (mg)var0.bl_fld.ak_fld.aw(); null != var2; var2 = (mg)var0.bl_fld.ak_fld.as()) {
				if (var1 == var2.ag_fld) {
					var2.ab_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "(Lml;II)V"
	)
	public static void rl(ml var0, int var1, int var2) {
		synchronized (var0.bx_fld) {
			var0.ai(var1, var2);
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void dl(int var1, int var2) {
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dy(int var1) {
		if (var1 >= 0) {
			this.ax_fld[var1] = 291338546;
			this.an_fld[var1] = -1135008213;
			this.ad_fld[var1] = -1737673987;
			this.at_fld[var1] = 529498919;
			this.ac_fld[var1] = 0;
			this.aj_fld[var1] = -1659309856;
			cz(this, var1, (byte)-113);
			this.aj(var1, 2075894094);
			this.ay_fld[var1] = 0;
			this.bm_fld[var1] = 32767;
			this.bd_fld[var1] = 146634449;
			this.as_fld[var1] = 0;
			this.bt(var1, 8192);
		} else {
			for (int var2 = 0; var2 < 16; var2++) {
				this.du(var2, 72295796);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lmz;Lub;Lap;)Z"
	)
	public boolean az(mz var1, ub var2, ap var3) {
		try {
			synchronized (this.bx_fld) {
				boolean var6 = true;
				synchronized (this.ah_fld) {
					this.ah_fld.clear();
				}

				for (mc var19 = (mc)var1.ak_fld.aq(); var19 != null; var19 = (mc)xz.aa(var1.ak_fld)) {
					int var8 = (int)var19.hc_fld;
					ms var9 = (ms)this.af_fld.ak(var8);
					if (var9 == null) {
						byte[] var11 = ub.ae(var2, var8, (byte)51);
						ms var10;
						if (null == var11) {
							var10 = null;
						} else {
							var10 = new ms(var11);
						}

						var9 = var10;
						if (null == var10) {
							var6 = false;
							continue;
						}

						this.af_fld.az(var10, var8);
					}

					if (!var9.ak(var3, var19.ak_fld)) {
						var6 = false;
					} else if (null != this.ah_fld) {
						synchronized (this.ah_fld) {
							Iterator var21 = var9.as_fld.iterator();

							while (var21.hasNext()) {
								ai var12 = (ai)(ai)var21.next();
								this.ah_fld.add(new mp(var19.ag_fld, var12));
							}
						}
					}
				}

				return var6;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void av(byte var1) {
		if (null != this.ah_fld) {
			if (null != av_fld) {
				if (var1 >= 64) {
					return;
				}

				av_fld.set(true);
			}

			av_fld = new AtomicBoolean(false);
			AtomicBoolean var2 = av_fld;
			if (null == ae_fld) {
				if (var1 >= 64) {
					return;
				}

				int var3 = Runtime.getRuntime().availableProcessors();
				ae_fld = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new mn(this));
			}

			ae_fld.submit(new md(this, var2));
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int bi(mg var1) {
		int var3 = var1.ar_fld + (var1.af_fld * var1.al_fld >> 12);
		var3 += (this.at_fld[var1.ag_fld] - 8192) * this.bd_fld[var1.ag_fld] >> 12;
		mi var4 = var1.ae_fld;
		if (var4.av_fld > 0 && (var4.as_fld > 0 || this.ac_fld[var1.ag_fld] > 0)) {
			int var5 = var4.as_fld << 2;
			int var6 = var4.ay_fld << 1;
			if (var1.aq_fld < var6) {
				var5 = var1.aq_fld * var5 / var6;
			}

			var5 += this.ac_fld[var1.ag_fld] >> 7;
			double var7 = Math.sin(0.01227184630308513 * (var1.am_fld & 511));
			var3 += (int)(var5 * var7);
		}

		int var11 = (int)(256 * var1.av_fld.ak_fld * Math.pow(2.0, 3.255208333333333E-4 * var3) / ao.ar_fld + 0.5);
		return var11 < 1 ? 1 : var11;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lml;I)V"
	)
	public static void gf(ml var0, int var1) {
		synchronized (var0.bx_fld) {
			var0.au_fld = var1 * 1950827619;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmz;Z)V"
	)
	public void al(mz var1, boolean var2) {
		synchronized (this.bx_fld) {
			this.au();
			this.bs_fld.ak(var1.ag_fld);
			this.bh_fld = var2;
			this.bf_fld = 0L;
			int var5 = this.bs_fld.av();

			for (int var6 = 0; var6 < var5; var6++) {
				this.bs_fld.ae(var6);
				this.bs_fld.ay(var6);
				this.bs_fld.ah(var6);
			}

			this.bj_fld = this.bs_fld.au();
			this.al_fld = -1322297411 * this.bs_fld.as_fld[this.bj_fld];
			this.by_fld = this.bs_fld.bw(this.al_fld);
		}
	}

	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "(Lml;Lmg;)I"
	)
	public static int rg(ml var0, mg var1) {
		if (var0 == null) {
			var0.getClass();
		}

		mi var2 = var1.ae_fld;
		int var3 = 4096 + var0.ax_fld[var1.ag_fld] * var0.ad_fld[var1.ag_fld] >> 13;
		var3 = 16384 + var3 * var3 >> 15;
		var3 = 16384 + var1.ay_fld * var3 >> 15;
		var3 = var0.au_fld * var3 + 128 >> 8;
		if (var2.aw_fld > 0) {
			var3 = (int)(var3 * Math.pow(0.5, var1.au_fld * 1.953125E-5 * var2.aw_fld) + 0.5);
		}

		if (null != var2.ak_fld) {
			int var4 = var1.ax_fld;
			int var5 = var2.ak_fld[1 + var1.an_fld];
			if (var1.an_fld < var2.ak_fld.length - 2) {
				int var6 = (var2.ak_fld[var1.an_fld] & 255) << 8;
				int var7 = (var2.ak_fld[2 + var1.an_fld] & 255) << 8;
				var5 += (var2.ak_fld[3 + var1.an_fld] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = 32 + var5 * var3 >> 6;
		}

		if (var1.aa_fld > 0 && var2.ag_fld != null) {
			int var11 = var1.aa_fld;
			int var12 = var2.ag_fld[var1.ai_fld + 1];
			if (var1.ai_fld < var2.ag_fld.length - 2) {
				int var13 = (var2.ag_fld[var1.ai_fld] & 255) << 8;
				int var14 = (var2.ag_fld[var1.ai_fld + 2] & 255) << 8;
				var12 += (var11 - var13) * (var2.ag_fld[3 + var1.ai_fld] - var12) / (var14 - var13);
			}

			var3 = 32 + var3 * var12 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lml;B)V"
	)
	public static void pc(ml var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (var0.bx_fld) {
			for (ms var3 = (ms)var0.af_fld.aq(); var3 != null; var3 = (ms)xz.aa(var0.af_fld)) {
				var3.ag();
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		synchronized (this.bx_fld) {
			rj.dl(this.bs_fld);
			cd(this, (byte)69);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ax() {
		synchronized (this.bx_fld) {
			return this.bs_fld.az();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void aa(int var1, int var2) {
		synchronized (this.bx_fld) {
			this.ai(var1, var2);
		}
	}

	@ObfuscatedName("yz")
	@ObfuscatedSignature(
		descriptor = "(Lfb;)V"
	)
	public static void yz(fb var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af_fld = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ai(int var1, int var2) {
		this.ao_fld[var1] = var2;
		this.ap_fld[var1] = var2 & -128;
		this.aq(var1, var2, (byte)76);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ak(int var1) {
		synchronized (this.bx_fld) {
			this.au_fld = var1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void am(int var1, int var2, int var3, int var4) {
		this.ao(var1, var2, 64, -560528402);
		if ((this.ay_fld[var1] & 2) != 0) {
			for (mg var5 = (mg)this.bl_fld.ak_fld.ay(); null != var5; var5 = (mg)this.bl_fld.ak_fld.ar()) {
				if (var1 == var5.ag_fld && var5.aa_fld < 0) {
					this.br_fld[var1][var5.aw_fld] = null;
					this.br_fld[var1][var2] = var5;
					int var6 = var5.ar_fld + (var5.af_fld * var5.al_fld >> 12);
					var5.ar_fld = var5.ar_fld + -1304214753 * (var2 - var5.aw_fld << 8);
					var5.af_fld = var6 - var5.ar_fld;
					var5.al_fld = -1184772096;
					var5.aw_fld = var2;
					return;
				}
			}
		}

		ms var9 = (ms)this.af_fld.ak(this.ab_fld[var1]);
		if (null != var9) {
			if (null != var9.az_fld[var2]) {
				al var10 = var9.az_fld[var2].ag();
				if (var10 != null) {
					mg var7 = new mg();
					var7.ag_fld = var1;
					var7.az_fld = var9;
					var7.av_fld = var10;
					var7.ae_fld = var9.aw_fld[var2];
					var7.ah_fld = -667066637 * var9.ay_fld[var2];
					var7.aw_fld = var2;
					var7.ay_fld = -1323091305 * (var9.ae_fld[var2] * var3 * var3 * var9.ag_fld + 1024 >> 11);
					var7.as_fld = var9.ah_fld[var2] & 255;
					var7.ar_fld = -1304214753 * ((var2 << 8) - (var9.av_fld[var2] & 32767));
					var7.au_fld = 0;
					var7.ax_fld = 0;
					var7.an_fld = 0;
					var7.aa_fld = -1507818479;
					var7.ai_fld = 0;
					if (0 == this.as_fld[var1]) {
						var7.ad_fld = ac.av(var10, this.bi(var7), this.bu(var7), this.bn(var7));
					} else {
						var7.ad_fld = ac.av(var10, this.bi(var7), 0, this.bn(var7));
						this.ad(var7, var9.av_fld[var2] < 0);
					}

					if (var9.av_fld[var2] < 0) {
						var7.ad_fld.bm(-1);
					}

					if (var7.ah_fld >= 0) {
						if (var4 == -505838743) {
							return;
						}

						mg var8 = this.be_fld[var1][var7.ah_fld];
						if (null != var8 && var8.aa_fld < 0) {
							this.br_fld[var1][var8.aw_fld] = null;
							var8.aa_fld = 0;
						}

						this.be_fld[var1][var7.ah_fld] = var7;
					}

					this.bl_fld.ak_fld.av(var7);
					this.br_fld[var1][var2] = var7;
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Z)V"
	)
	void ad(mg var1, boolean var2) {
		int var4 = var1.av_fld.ag_fld.length;
		int var5;
		if (var2 && var1.av_fld.ae_fld) {
			int var6 = var4 + var4 - var1.av_fld.az_fld;
			var5 = (int)((long)var6 * this.as_fld[var1.ag_fld] >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.ad_fld.fc(true);
			}
		} else {
			var5 = (int)((long)var4 * this.as_fld[var1.ag_fld] >> 6);
		}

		var1.ad_fld.bu(var5);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ao(int var1, int var2, int var3, int var4) {
		mg var5 = this.br_fld[var1][var2];
		if (null != var5) {
			this.br_fld[var1][var2] = null;
			if (0 != (this.ay_fld[var1] & 2)) {
				for (mg var6 = (mg)this.bl_fld.ak_fld.aw(); null != var6; var6 = (mg)this.bl_fld.ak_fld.as()) {
					if (var4 == 1271698495) {
						return;
					}

					if (var6.ag_fld == var5.ag_fld && var6.aa_fld < 0 && var5 != var6) {
						var5.aa_fld = 0;
						break;
					}
				}
			} else {
				var5.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ab(int var1, int var2, int var3) {
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dg(int var1) {
		for (mg var2 = (mg)this.bl_fld.ak_fld.aw(); var2 != null; var2 = (mg)this.bl_fld.ak_fld.as()) {
			if ((var1 < 0 || var1 == var2.ag_fld) && var2.aa_fld < 0) {
				this.br_fld[var2.ag_fld][var2.aw_fld] = null;
				var2.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void at(int var1, int var2) {
		this.at_fld[var1] = var2;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ep(int var1) {
		if ((this.ay_fld[var1] & 2) != 0) {
			for (mg var2 = (mg)this.bl_fld.ak_fld.aw(); null != var2; var2 = (mg)this.bl_fld.ak_fld.as()) {
				if (var1 == var2.ag_fld && null == this.br_fld[var1][var2.aw_fld] && var2.aa_fld < 0) {
					var2.aa_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void du(int var1, int var2) {
		if (var1 < 0) {
			for (int var3 = 0; var3 < 16; var3++) {
				if (var2 == 1957901333) {
					return;
				}

				this.du(var3, 162234397);
			}
		} else {
			this.ax_fld[var1] = 12800;
			this.an_fld[var1] = 8192;
			this.ad_fld[var1] = 16383;
			this.at_fld[var1] = 8192;
			this.ac_fld[var1] = 0;
			this.aj_fld[var1] = 8192;
			cz(this, var1, (byte)-34);
			this.aj(var1, 1254037898);
			this.ay_fld[var1] = 0;
			this.bm_fld[var1] = 32767;
			this.bd_fld[var1] = 256;
			this.as_fld[var1] = 0;
			this.bt(var1, 8192);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void bm(int var1, byte var2) {
		for (mg var3 = (mg)this.bl_fld.ak_fld.aw(); var3 != null; var3 = (mg)this.bl_fld.ak_fld.as()) {
			if (var2 >= 7) {
				return;
			}

			if (var1 >= 0) {
				if (var1 != var3.ag_fld) {
					continue;
				}

				if (var2 >= 7) {
					return;
				}
			}

			if (var3.aa_fld < 0) {
				this.br_fld[var3.ag_fld][var3.aw_fld] = null;
				var3.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	@Override
	protected void as(int[] var1, int var2, int var3) {
		if (this.bs_fld.az()) {
			int var4 = this.bs_fld.ay_fld * this.bk_fld / ao.ar_fld;

			do {
				long var5 = (long)var4 * var3 + this.bf_fld;
				if (this.by_fld - var5 >= 0L) {
					this.bf_fld = var5;
					break;
				}

				int var7 = (int)((this.by_fld - this.bf_fld + var4 - 1L) / var4);
				this.bf_fld += -8485410119410535671L * (long)var4 * var7;
				this.bl_fld.as(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.di();
			} while (this.bs_fld.az());
		}

		this.bl_fld.as(var1, var2, var3);
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ey() {
		long var3;
		int var1 = -1804236097 * this.bj_fld;
		int var2 = this.al_fld;

		for (var3 = this.by_fld; this.al_fld == var2; var3 = this.bs_fld.bw(var2)) {
			while (true) {
				if (var2 == this.bs_fld.as_fld[var1]) {
					this.bs_fld.ae(var1);
					int var5 = this.bs_fld.as(var1);
					if (1 != var5) {
						if ((var5 & 128) != 0) {
							this.bp(var5, (short)2477);
						}

						this.bs_fld.ay(var1);
						this.bs_fld.ah(var1);
						continue;
					}

					this.bs_fld.aw();
					this.bs_fld.ah(var1);
					if (this.bs_fld.ax()) {
						if (!this.bh_fld || 0 == var2) {
							cd(this, (byte)121);
							rj.dl(this.bs_fld);
							return;
						}

						this.bs_fld.an(var3);
					}
				}

				var1 = this.bs_fld.au();
				var2 = this.bs_fld.as_fld[var1];
				break;
			}
		}

		this.bj_fld = -1982113809 * var1;
		this.al_fld = var2 * 1039529548;
		this.by_fld = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aj(int var1, int var2) {
		if ((this.ay_fld[var1] & 4) != 0) {
			for (mg var3 = (mg)this.bl_fld.ak_fld.aw(); null != var3; var3 = (mg)this.bl_fld.ak_fld.as()) {
				if (var2 <= -508605803) {
					return;
				}

				if (var1 == var3.ag_fld) {
					var3.ab_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void bp(int var1, short var2) {
		int var3 = var1 & 240;
		if (var3 == 128) {
			int var14 = var1 & 15;
			int var20 = var1 >> 8 & 127;
			int var23 = var1 >> 16 & 127;
			this.ao(var14, var20, var23, -1422966972);
		} else if (var3 == 144) {
			int var13 = var1 & 15;
			int var19 = var1 >> 8 & 127;
			int var22 = var1 >> 16 & 127;
			if (var22 > 0) {
				this.am(var13, var19, var22, 1163065269);
			} else {
				this.ao(var13, var19, 64, -972000027);
			}
		} else if (var3 == 160) {
			int var12 = var1 & 15;
			int var18 = var1 >> 8 & 127;
			int var21 = var1 >> 16 & 127;
			this.ab(var12, var18, var21);
		} else if (176 == var3) {
			int var11 = var1 & 15;
			int var17 = var1 >> 8 & 127;
			int var6 = var1 >> 16 & 127;
			if (var17 == 0) {
				this.ap_fld[var11] = (this.ap_fld[var11] & -2080769) + (var6 << 14);
			}

			if (32 == var17) {
				this.ap_fld[var11] = (var6 << 7) + (this.ap_fld[var11] & -16257);
			}

			if (var17 == 1) {
				if (var2 <= 256) {
					return;
				}

				this.ac_fld[var11] = (this.ac_fld[var11] & -16257) + (var6 << 7);
			}

			if (33 == var17) {
				this.ac_fld[var11] = var6 + (this.ac_fld[var11] & -128);
			}

			if (var17 == 5) {
				this.aj_fld[var11] = (var6 << 7) + (this.aj_fld[var11] & -16257);
			}

			if (37 == var17) {
				this.aj_fld[var11] = (this.aj_fld[var11] & -128) + var6;
			}

			if (7 == var17) {
				if (var2 <= 256) {
					return;
				}

				this.ax_fld[var11] = (var6 << 7) + (this.ax_fld[var11] & -16257);
			}

			if (39 == var17) {
				this.ax_fld[var11] = var6 + (this.ax_fld[var11] & -128);
			}

			if (var17 == 10) {
				this.an_fld[var11] = (var6 << 7) + (this.an_fld[var11] & -16257);
			}

			if (var17 == 42) {
				this.an_fld[var11] = var6 + (this.an_fld[var11] & -128);
			}

			if (11 == var17) {
				this.ad_fld[var11] = (var6 << 7) + (this.ad_fld[var11] & -16257);
			}

			if (var17 == 43) {
				if (var2 <= 256) {
					return;
				}

				this.ad_fld[var11] = var6 + (this.ad_fld[var11] & -128);
			}

			if (64 == var17) {
				if (var6 >= 64) {
					this.ay_fld[var11] = this.ay_fld[var11] | 1;
				} else {
					this.ay_fld[var11] = this.ay_fld[var11] & -2;
				}
			}

			if (var17 == 65) {
				if (var6 >= 64) {
					this.ay_fld[var11] = this.ay_fld[var11] | 2;
				} else {
					cz(this, var11, (byte)-31);
					this.ay_fld[var11] = this.ay_fld[var11] & -3;
				}
			}

			if (99 == var17) {
				this.bm_fld[var11] = (this.bm_fld[var11] & 127) + (var6 << 7);
			}

			if (98 == var17) {
				this.bm_fld[var11] = var6 + (this.bm_fld[var11] & 16256);
			}

			if (101 == var17) {
				this.bm_fld[var11] = (var6 << 7) + 16384 + (this.bm_fld[var11] & 127);
			}

			if (var17 == 100) {
				this.bm_fld[var11] = 16384 + (this.bm_fld[var11] & 16256) + var6;
			}

			if (120 == var17) {
				if (var2 <= 256) {
					return;
				}

				this.ac(var11, (byte)2);
			}

			if (121 == var17) {
				this.du(var11, -1303242593);
			}

			if (var17 == 123) {
				this.bm(var11, (byte)-30);
			}

			if (var17 == 6) {
				if (var2 <= 256) {
					return;
				}

				int var7 = this.bm_fld[var11];
				if (var7 == 16384) {
					this.bd_fld[var11] = (this.bd_fld[var11] & -16257) + (var6 << 7);
				}
			}

			if (38 == var17) {
				int var24 = this.bm_fld[var11];
				if (var24 == 16384) {
					this.bd_fld[var11] = var6 + (this.bd_fld[var11] & -128);
				}
			}

			if (var17 == 16) {
				this.as_fld[var11] = (this.as_fld[var11] & -16257) + (var6 << 7);
			}

			if (48 == var17) {
				this.as_fld[var11] = var6 + (this.as_fld[var11] & -128);
			}

			if (81 == var17) {
				if (var6 >= 64) {
					if (var2 <= 256) {
						return;
					}

					this.ay_fld[var11] = this.ay_fld[var11] | 4;
				} else {
					this.aj(var11, 835613719);
					this.ay_fld[var11] = this.ay_fld[var11] & -5;
				}
			}

			if (17 == var17) {
				if (var2 <= 256) {
					return;
				}

				this.bt(var11, (this.bz_fld[var11] & -16257) + (var6 << 7));
			}

			if (49 == var17) {
				this.bt(var11, (this.bz_fld[var11] & -128) + var6);
			}
		} else if (var3 == 192) {
			int var10 = var1 & 15;
			int var16 = var1 >> 8 & 127;
			this.aq(var10, this.ap_fld[var10] + var16, (byte)-7);
		} else if (var3 == 208) {
			int var9 = var1 & 15;
			int var15 = var1 >> 8 & 127;
			mj(this, var9, var15, (byte)0);
		} else if (224 == var3) {
			if (var2 > 256) {
				int var4 = var1 & 15;
				int var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
				this.at(var4, var5);
			}
		} else {
			var3 = var1 & 0xFF;
			if (255 == var3) {
				cd(this, (byte)85);
			}
		}
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int ea(mg var1) {
		int var2 = this.an_fld[-1410557216 * var1.ag_fld];
		return var2 < 8192 ? -1893567016 + var1.as_fld * var2 >> 6 : 16384 - ((251007758 - var2) * (128 - var1.as_fld) + 32 >> 6);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lml;IB)V"
	)
	public static void cz(ml var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if ((var0.ay_fld[var1] & 2) != 0) {
				for (mg var3 = (mg)var0.bl_fld.ak_fld.aw(); null != var3; var3 = (mg)var0.bl_fld.ak_fld.as()) {
					if (var1 == var3.ag_fld && null == var0.br_fld[var1][var3.aw_fld] && var3.aa_fld < 0) {
						var3.aa_fld = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void ac(int var1, byte var2) {
		for (mg var3 = (mg)this.bl_fld.ak_fld.aw(); var3 != null; var3 = (mg)this.bl_fld.ak_fld.as()) {
			if (var1 >= 0) {
				if (var1 != var3.ag_fld) {
					continue;
				}

				if (var2 != 2) {
					return;
				}
			}

			if (null != var3.ad_fld) {
				var3.ad_fld.bq(ao.ar_fld / 100);
				if (var3.ad_fld.go()) {
					this.bl_fld.ag_fld.ax(var3.ad_fld);
				}

				var3.ak();
			}

			if (var3.aa_fld < 0) {
				this.br_fld[var3.ag_fld][var3.aw_fld] = null;
			}

			var3.gy_void();
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int bu(mg var1) {
		mi var3 = var1.ae_fld;
		int var4 = 4096 + this.ax_fld[var1.ag_fld] * this.ad_fld[var1.ag_fld] >> 13;
		var4 = 16384 + var4 * var4 >> 15;
		var4 = 16384 + var1.ay_fld * var4 >> 15;
		var4 = this.au_fld * var4 + 128 >> 8;
		if (var3.aw_fld > 0) {
			var4 = (int)(var4 * Math.pow(0.5, var1.au_fld * 1.953125E-5 * var3.aw_fld) + 0.5);
		}

		if (null != var3.ak_fld) {
			int var5 = var1.ax_fld;
			int var6 = var3.ak_fld[1 + var1.an_fld];
			if (var1.an_fld < var3.ak_fld.length - 2) {
				int var7 = (var3.ak_fld[var1.an_fld] & 255) << 8;
				int var8 = (var3.ak_fld[2 + var1.an_fld] & 255) << 8;
				var6 += (var3.ak_fld[3 + var1.an_fld] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = 32 + var6 * var4 >> 6;
		}

		if (var1.aa_fld > 0 && var3.ag_fld != null) {
			int var12 = var1.aa_fld;
			int var13 = var3.ag_fld[var1.ai_fld + 1];
			if (var1.ai_fld < var3.ag_fld.length - 2) {
				int var14 = (var3.ag_fld[var1.ai_fld] & 255) << 8;
				int var15 = (var3.ag_fld[var1.ai_fld + 2] & 255) << 8;
				var13 += (var12 - var14) * (var3.ag_fld[3 + var1.ai_fld] - var13) / (var15 - var14);
			}

			var4 = 32 + var4 * var13 >> 6;
		}

		return var4;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int bn(mg var1) {
		int var3 = this.an_fld[var1.ag_fld];
		return var3 < 8192 ? 32 + var1.as_fld * var3 >> 6 : 16384 - ((16384 - var3) * (128 - var1.as_fld) + 32 >> 6);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj ah() {
		return this.bl_fld;
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int eq(mg var1) {
		mi var2 = var1.ae_fld;
		int var3 = 4096 + this.ax_fld[-1550176199 * var1.ag_fld] * this.ad_fld[var1.ag_fld] >> 13;
		var3 = -1145031258 + var3 * var3 >> 15;
		var3 = 16384 + var1.ay_fld * var3 >> 15;
		var3 = this.au_fld * var3 + 128 >> 8;
		if (var2.aw_fld * 2126015036 > 0) {
			var3 = (int)(var3 * Math.pow(0.5, var1.au_fld * 1.953125E-5 * var2.aw_fld) + 0.5);
		}

		if (null != var2.ak_fld) {
			int var4 = -1935641663 * var1.ax_fld;
			int var5 = var2.ak_fld[1 + var1.an_fld];
			if (var1.an_fld < var2.ak_fld.length - 2) {
				int var6 = (var2.ak_fld[var1.an_fld] & -2077514290) << 8;
				int var7 = (var2.ak_fld[2 + var1.an_fld] & 230405623) << 8;
				var5 += (var2.ak_fld[3 + var1.an_fld] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = 796925766 + var5 * var3 >> 6;
		}

		if (719620567 * var1.aa_fld > 0 && var2.ag_fld != null) {
			int var11 = 1944133960 * var1.aa_fld;
			int var12 = var2.ag_fld[var1.ai_fld + 1];
			if (var1.ai_fld < var2.ag_fld.length - 2) {
				int var13 = (var2.ag_fld[var1.ai_fld] & 741627020) << 8;
				int var14 = (var2.ag_fld[var1.ai_fld + 2] & -512186737) << 8;
				var12 += (var11 - var13) * (var2.ag_fld[3 + var1.ai_fld] - var12) / (var14 - var13);
			}

			var3 = 1910680237 + var3 * var12 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ay() {
		return 0;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[III)Z"
	)
	boolean ba(mg var1, int[] var2, int var3, int var4) {
		var1.ao_fld = ao.ar_fld / 100;
		if (var1.aa_fld < 0 || null != var1.ad_fld && !var1.ad_fld.cc()) {
			int var6 = var1.al_fld;
			if (var6 > 0) {
				var6 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * this.aj_fld[var1.ag_fld]) + 0.5);
				if (var6 < 0) {
					var6 = 0;
				}

				var1.al_fld = var6;
			}

			var1.ad_fld.bb(this.bi(var1));
			mi var7 = var1.ae_fld;
			boolean var8 = false;
			var1.aq_fld++;
			var1.am_fld = var1.am_fld + var7.av_fld;
			double var9 = ((var1.al_fld * var1.af_fld >> 12) + (var1.aw_fld - 60 << 8)) * 5.086263020833333E-6;
			if (var7.aw_fld > 0) {
				if (var7.ae_fld > 0) {
					var1.au_fld = var1.au_fld + (int)(128.0 * Math.pow(2.0, var7.ae_fld * var9) + 0.5) * -1670103627;
				} else {
					var1.au_fld += 128;
				}
			}

			if (null != var7.ak_fld) {
				if (var7.ah_fld > 0) {
					var1.ax_fld = var1.ax_fld + (int)(128.0 * Math.pow(2.0, var9 * var7.ah_fld) + 0.5) * -288903135;
				} else {
					var1.ax_fld += 128;
				}

				while (var1.an_fld < var7.ak_fld.length - 2 && var1.ax_fld > (var7.ak_fld[var1.an_fld + 2] & 255) << 8) {
					var1.an_fld += 2;
				}

				if (var7.ak_fld.length - 2 == var1.an_fld && var7.ak_fld[1 + var1.an_fld] == 0) {
					var8 = true;
				}
			}

			if (var1.aa_fld >= 0 && null != var7.ag_fld && (this.ay_fld[var1.ag_fld] & 1) == 0 && (var1.ah_fld < 0 || this.be_fld[var1.ag_fld][var1.ah_fld] != var1)) {
				if (var7.az_fld > 0) {
					var1.aa_fld = var1.aa_fld + (int)(128.0 * Math.pow(2.0, var7.az_fld * var9) + 0.5) * 1507818479;
				} else {
					var1.aa_fld += 128;
				}

				while (var1.ai_fld < var7.ag_fld.length - 2 && var1.aa_fld > (var7.ag_fld[var1.ai_fld + 2] & 255) << 8) {
					var1.ai_fld += 2;
				}

				if (var7.ag_fld.length - 2 == var1.ai_fld) {
					var8 = true;
				}
			}

			if (var8) {
				var1.ad_fld.bq(var1.ao_fld);
				if (var2 != null) {
					var1.ad_fld.as(var2, var3, var4);
				} else {
					var1.ad_fld.af(var4);
				}

				if (var1.ad_fld.go()) {
					this.bl_fld.ag_fld.ax(var1.ad_fld);
				}

				var1.ak();
				if (var1.aa_fld >= 0) {
					var1.gy_void();
					if (var1.ah_fld > 0 && this.be_fld[var1.ag_fld][var1.ah_fld] == var1) {
						this.be_fld[var1.ag_fld][var1.ah_fld] = null;
					}
				}

				return true;
			} else {
				var1.ad_fld.ba(var1.ao_fld, this.bu(var1), this.bn(var1));
				return false;
			}
		} else {
			var1.ak();
			var1.gy_void();
			if (var1.ah_fld > 0 && var1 == this.be_fld[var1.ag_fld][var1.ah_fld]) {
				this.be_fld[var1.ag_fld][var1.ah_fld] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	protected void af(int var1) {
		if (this.bs_fld.az()) {
			int var2 = this.bs_fld.ay_fld * this.bk_fld / ao.ar_fld;

			do {
				long var3 = this.bf_fld + (long)var2 * var1;
				if (this.by_fld - var3 >= 0L) {
					this.bf_fld = var3;
					break;
				}

				int var5 = (int)((this.by_fld - this.bf_fld + var2 - 1L) / var2);
				this.bf_fld += (long)var5 * var2 * -8485410119410535671L;
				this.bl_fld.af(var5);
				var1 -= var5;
				this.di();
			} while (this.bs_fld.az());
		}

		this.bl_fld.af(var1);
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void di() {
		long var4;
		int var2 = this.bj_fld;
		int var3 = this.al_fld;

		for (var4 = this.by_fld; this.al_fld == var3; var4 = this.bs_fld.bw(var3)) {
			while (true) {
				if (var3 == this.bs_fld.as_fld[var2]) {
					this.bs_fld.ae(var2);
					int var6 = this.bs_fld.as(var2);
					if (1 != var6) {
						if ((var6 & 128) != 0) {
							this.bp(var6, (short)24677);
						}

						this.bs_fld.ay(var2);
						this.bs_fld.ah(var2);
						continue;
					}

					this.bs_fld.aw();
					this.bs_fld.ah(var2);
					if (this.bs_fld.ax()) {
						if (!this.bh_fld || 0 == var3) {
							cd(this, (byte)103);
							rj.dl(this.bs_fld);
							return;
						}

						this.bs_fld.an(var4);
					}
				}

				var2 = this.bs_fld.au();
				var3 = this.bs_fld.as_fld[var2];
				break;
			}
		}

		this.bj_fld = var2;
		this.al_fld = var3;
		this.by_fld = var4;
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ec(int var1, int var2) {
		this.ao_fld[var1] = var2;
		this.ap_fld[var1] = var2 & -128;
		this.aq(var1, var2, (byte)-100);
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Lml;II)V"
	)
	public static void gg(ml var0, int var1, int var2) {
		var0.at_fld[var1] = var2;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lmz;Z)V"
	)
	public void ca(mz var1, boolean var2) {
		synchronized (this.bx_fld) {
			this.au();
			this.bs_fld.ak(var1.ag_fld);
			this.bh_fld = var2;
			this.bf_fld = 0L;
			int var4 = this.bs_fld.av();

			for (int var5 = 0; var5 < var4; var5++) {
				this.bs_fld.ae(var5);
				this.bs_fld.ay(var5);
				this.bs_fld.ah(var5);
			}

			this.bj_fld = this.bs_fld.au();
			this.al_fld = 794666451 * this.bs_fld.as_fld[this.bj_fld];
			this.by_fld = this.bs_fld.bw(this.al_fld * -1500279650);
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void dz(int var1, int var2, int var3) {
		this.ao(var1, var2, -1659578683, 1618804520);
		if ((this.ay_fld[var1] & 2) != 0) {
			for (mg var4 = (mg)this.bl_fld.ak_fld.ay(); null != var4; var4 = (mg)this.bl_fld.ak_fld.ar()) {
				if (var1 == var4.ag_fld && 208545797 * var4.aa_fld < 0) {
					this.br_fld[var1][var4.aw_fld] = null;
					this.br_fld[var1][var2] = var4;
					int var5 = var4.ar_fld + (var4.af_fld * var4.al_fld >> 12);
					var4.ar_fld = var4.ar_fld + 366902059 * (var2 - var4.aw_fld << 8);
					var4.af_fld = var5 - var4.ar_fld;
					var4.al_fld = -1184772096;
					var4.aw_fld = var2;
					return;
				}
			}
		}

		ms var8 = (ms)this.af_fld.ak(this.ab_fld[var1]);
		if (null != var8) {
			if (null != var8.az_fld[var2]) {
				al var9 = var8.az_fld[var2].ag();
				if (var9 != null) {
					mg var6 = new mg();
					var6.ag_fld = var1 * 1816780116;
					var6.az_fld = var8;
					var6.av_fld = var9;
					var6.ae_fld = var8.aw_fld[var2];
					var6.ah_fld = -1362376155 * var8.ay_fld[var2];
					var6.aw_fld = var2;
					var6.ay_fld = -1323091305 * (var8.ae_fld[var2] * var3 * var3 * var8.ag_fld + 1066081486 >> 11);
					var6.as_fld = var8.ah_fld[var2] & 255;
					var6.ar_fld = -1304214753 * ((var2 << 8) - (var8.av_fld[var2] & -589759638));
					var6.au_fld = 0;
					var6.ax_fld = 0;
					var6.an_fld = 0;
					var6.aa_fld = -937102040;
					var6.ai_fld = 0;
					if (0 == this.as_fld[var1]) {
						var6.ad_fld = ac.av(var9, this.bi(var6), this.bu(var6), this.bn(var6));
					} else {
						var6.ad_fld = ac.av(var9, this.bi(var6), 0, this.bn(var6));
						this.ad(var6, var8.av_fld[var2] < 0);
					}

					if (var8.av_fld[var2] < 0) {
						var6.ad_fld.bm(-1);
					}

					if (var6.ah_fld >= 0) {
						mg var7 = this.be_fld[var1][var6.ah_fld * 632958462];
						if (null != var7 && var7.aa_fld < 0) {
							this.br_fld[var1][2037737328 * var7.aw_fld] = null;
							var7.aa_fld = 0;
						}

						this.be_fld[var1][var6.ah_fld] = var6;
					}

					this.bl_fld.ak_fld.av(var6);
					this.br_fld[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bd() {
		return this.bl_fld;
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Lml;Lmg;[III)Z"
	)
	public static boolean ye(ml var0, mg var1, int[] var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.ao_fld = ao.ar_fld / 100;
		if (1066208116 * var1.aa_fld < 0 || null != var1.ad_fld && !var1.ad_fld.cc()) {
			int var5 = var1.al_fld * -2044474560;
			if (var5 > 0) {
				var5 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * var0.aj_fld[-1177844351 * var1.ag_fld]) + 0.5);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.al_fld = var5;
			}

			var1.ad_fld.bb(var0.bi(var1));
			mi var6 = var1.ae_fld;
			boolean var7 = false;
			var1.aq_fld++;
			var1.am_fld = var1.am_fld + var6.av_fld;
			double var8 = ((var1.al_fld * var1.af_fld >> 12) + (var1.aw_fld - 60 << 8)) * 5.086263020833333E-6;
			if (var6.aw_fld * -242604838 > 0) {
				if (var6.ae_fld * 476215959 > 0) {
					var1.au_fld = var1.au_fld + (int)(128.0 * Math.pow(2.0, -1825581574 * var6.ae_fld * var8) + 0.5) * -1670103627;
				} else {
					var1.au_fld += 128;
				}
			}

			if (null != var6.ak_fld) {
				if (296881331 * var6.ah_fld > 0) {
					var1.ax_fld = var1.ax_fld + (int)(128.0 * Math.pow(2.0, var8 * (-872523021 * var6.ah_fld)) + 0.5) * -288903135;
				} else {
					var1.ax_fld += 163646026;
				}

				while (var1.an_fld < var6.ak_fld.length - 2 && var1.ax_fld > (var6.ak_fld[var1.an_fld + 2] & 255) << 8) {
					var1.an_fld += -1719975165;
				}

				if (var6.ak_fld.length - 2 == var1.an_fld && var6.ak_fld[1 + var1.an_fld] == 0) {
					var7 = true;
				}
			}

			if (var1.aa_fld >= 0
				&& null != var6.ag_fld
				&& (var0.ay_fld[var1.ag_fld] & 1) == 0
				&& (var1.ah_fld * -914867342 < 0 || var0.be_fld[var1.ag_fld][1753174565 * var1.ah_fld] != var1)) {
				if (var6.az_fld > 0) {
					var1.aa_fld = var1.aa_fld + (int)(128.0 * Math.pow(2.0, var6.az_fld * -787244539 * var8) + 0.5) * 1507818479;
				} else {
					var1.aa_fld += 128;
				}

				while (var1.ai_fld < var6.ag_fld.length - 2 && var1.aa_fld > (var6.ag_fld[var1.ai_fld + 2] & 255) << 8) {
					var1.ai_fld += -650923724;
				}

				if (var6.ag_fld.length - 2 == var1.ai_fld) {
					var7 = true;
				}
			}

			if (var7) {
				var1.ad_fld.bq(813444916 * var1.ao_fld);
				if (var2 != null) {
					var1.ad_fld.as(var2, var3, var4);
				} else {
					var1.ad_fld.af(var4);
				}

				if (var1.ad_fld.go()) {
					var0.bl_fld.ag_fld.ax(var1.ad_fld);
				}

				var1.ak();
				if (var1.aa_fld >= 0) {
					var1.gy_void();
					if (var1.ah_fld > 0 && var0.be_fld[var1.ag_fld][135857953 * var1.ah_fld] == var1) {
						var0.be_fld[851570888 * var1.ag_fld][var1.ah_fld] = null;
					}
				}

				return true;
			} else {
				var1.ad_fld.ba(var1.ao_fld, var0.bu(var1), var0.bn(var1));
				return false;
			}
		} else {
			var1.ak();
			var1.gy_void();
			if (-289611347 * var1.ah_fld > 0 && var1 == var0.be_fld[var1.ag_fld][var1.ah_fld]) {
				var0.be_fld[var1.ag_fld][1103559449 * var1.ah_fld] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void df() {
		this.ac(-1, (byte)2);
		this.du(-1, 1597289501);

		for (int var1 = 0; var1 < 16; var1++) {
			this.ab_fld[var1] = this.ao_fld[var1];
		}

		for (int var2 = 0; var2 < 16; var2++) {
			this.ap_fld[var2] = this.ao_fld[var2] & -1572258297;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj br() {
		return null;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj be() {
		return null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bs() {
		return null;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ed(int var1) {
		if (var1 >= 0) {
			this.ax_fld[var1] = 12800;
			this.an_fld[var1] = 8192;
			this.ad_fld[var1] = 16383;
			this.at_fld[var1] = 8192;
			this.ac_fld[var1] = 0;
			this.aj_fld[var1] = 8192;
			cz(this, var1, (byte)-83);
			this.aj(var1, 441650798);
			this.ay_fld[var1] = 0;
			this.bm_fld[var1] = 32767;
			this.bd_fld[var1] = 256;
			this.as_fld[var1] = 0;
			this.bt(var1, 8192);
		} else {
			for (int var2 = 0; var2 < 16; var2++) {
				this.du(var2, -376828960);
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int bk() {
		return 0;
	}

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "(Lml;I)I"
	)
	public static int xy(ml var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.au_fld;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int ez(mg var1) {
		int var2 = var1.ar_fld + (var1.af_fld * var1.al_fld >> 12);
		var2 += (this.at_fld[var1.ag_fld] - -579178918) * this.bd_fld[var1.ag_fld] >> 12;
		mi var3 = var1.ae_fld;
		if (var3.av_fld > 0 && (1636358593 * var3.as_fld > 0 || this.ac_fld[var1.ag_fld * 900843573] > 0)) {
			int var4 = var3.as_fld << 2;
			int var5 = var3.ay_fld << 1;
			if (var1.aq_fld < var5) {
				var4 = var1.aq_fld * var4 / var5;
			}

			var4 += this.ac_fld[var1.ag_fld * -1960696013] >> 7;
			double var6 = Math.sin(0.01227184630308513 * (var1.am_fld & 1801571173));
			var2 += (int)(var4 * var6);
		}

		int var10 = (int)(256 * var1.av_fld.ak_fld * Math.pow(2.0, 3.255208333333333E-4 * var2) / ao.ar_fld + 0.5);
		return var10 < 1 ? 1 : var10;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	protected void by(int var1) {
		if (this.bs_fld.az()) {
			int var2 = this.bs_fld.ay_fld * this.bk_fld / ao.ar_fld;

			do {
				long var3 = this.bf_fld + (long)var2 * var1;
				if (this.by_fld - var3 >= 0L) {
					this.bf_fld = var3;
					break;
				}

				int var5 = (int)((this.by_fld - this.bf_fld + var2 - 1L) / var2);
				this.bf_fld += (long)var5 * var2 * -8485410119410535671L;
				this.bl_fld.af(var5);
				var1 -= var5;
				this.di();
			} while (this.bs_fld.az());
		}

		this.bl_fld.af(var1);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	protected void bl(int var1) {
		if (this.bs_fld.az()) {
			int var2 = this.bs_fld.ay_fld * this.bk_fld / ao.ar_fld;

			do {
				long var3 = this.bf_fld + (long)var2 * var1;
				if (this.by_fld - var3 >= 0L) {
					this.bf_fld = var3;
					break;
				}

				int var5 = (int)((this.by_fld - this.bf_fld + var2 - 1L) / var2);
				this.bf_fld += (long)var5 * var2 * -8485410119410535671L;
				this.bl_fld.af(var5);
				var1 -= var5;
				this.di();
			} while (this.bs_fld.az());
		}

		this.bl_fld.af(var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bq(int var1) {
		synchronized (this.bx_fld) {
			this.au_fld = var1;
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lml;IIB)V"
	)
	public static void mj(ml var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bg(int var1) {
		synchronized (this.bx_fld) {
			this.au_fld = var1;
		}
	}

	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "(Lml;)V"
	)
	public static void tx(ml var0) {
		synchronized (var0.bx_fld) {
			for (ms var2 = (ms)var0.af_fld.aq(); var2 != null; var2 = (ms)xz.aa(var0.af_fld)) {
				var2.ag();
			}
		}
	}

	public ml(ao var1) {
		this.au_fld = -1075534592;
		this.bk_fld = 663502528;
		this.ax_fld = new int[16];
		this.an_fld = new int[16];
		this.ad_fld = new int[16];
		this.ao_fld = new int[16];
		this.ab_fld = new int[16];
		this.ap_fld = new int[16];
		this.at_fld = new int[16];
		this.ac_fld = new int[16];
		this.aj_fld = new int[16];
		this.bm_fld = new int[16];
		this.bd_fld = new int[16];
		this.bz_fld = new int[16];
		this.br_fld = new mg[16][128];
		this.be_fld = new mg[16][128];
		this.bs_fld = new mw();
		this.bl_fld = new mk(this);
		this.bx_fld = null;
		this.bx_fld = var1;
		this.af_fld = new xz(128);
		cd(this, (byte)93);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cj(int var1, int var2) {
		synchronized (this.bx_fld) {
			this.ai(var1, var2);
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[III)Z"
	)
	boolean fa(mg var1, int[] var2, int var3, int var4) {
		var1.ao_fld = ao.ar_fld / 100;
		if (var1.aa_fld < 0 || null != var1.ad_fld && !var1.ad_fld.cc()) {
			int var5 = var1.al_fld;
			if (var5 > 0) {
				var5 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * this.aj_fld[var1.ag_fld]) + 0.5);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.al_fld = var5;
			}

			var1.ad_fld.bb(this.bi(var1));
			mi var6 = var1.ae_fld;
			boolean var7 = false;
			var1.aq_fld++;
			var1.am_fld = var1.am_fld + var6.av_fld;
			double var8 = ((var1.al_fld * var1.af_fld >> 12) + (var1.aw_fld - 60 << 8)) * 5.086263020833333E-6;
			if (var6.aw_fld > 0) {
				if (var6.ae_fld > 0) {
					var1.au_fld = var1.au_fld + (int)(128.0 * Math.pow(2.0, var6.ae_fld * var8) + 0.5) * -1670103627;
				} else {
					var1.au_fld += 128;
				}
			}

			if (null != var6.ak_fld) {
				if (var6.ah_fld > 0) {
					var1.ax_fld = var1.ax_fld + (int)(128.0 * Math.pow(2.0, var8 * var6.ah_fld) + 0.5) * -288903135;
				} else {
					var1.ax_fld += 128;
				}

				while (var1.an_fld < var6.ak_fld.length - 2 && var1.ax_fld > (var6.ak_fld[var1.an_fld + 2] & 255) << 8) {
					var1.an_fld += 2;
				}

				if (var6.ak_fld.length - 2 == var1.an_fld && var6.ak_fld[1 + var1.an_fld] == 0) {
					var7 = true;
				}
			}

			if (var1.aa_fld >= 0 && null != var6.ag_fld && (this.ay_fld[var1.ag_fld] & 1) == 0 && (var1.ah_fld < 0 || this.be_fld[var1.ag_fld][var1.ah_fld] != var1)) {
				if (var6.az_fld > 0) {
					var1.aa_fld = var1.aa_fld + (int)(128.0 * Math.pow(2.0, var6.az_fld * var8) + 0.5) * 1507818479;
				} else {
					var1.aa_fld += 128;
				}

				while (var1.ai_fld < var6.ag_fld.length - 2 && var1.aa_fld > (var6.ag_fld[var1.ai_fld + 2] & 255) << 8) {
					var1.ai_fld += 2;
				}

				if (var6.ag_fld.length - 2 == var1.ai_fld) {
					var7 = true;
				}
			}

			if (var7) {
				var1.ad_fld.bq(var1.ao_fld);
				if (var2 != null) {
					var1.ad_fld.as(var2, var3, var4);
				} else {
					var1.ad_fld.af(var4);
				}

				if (var1.ad_fld.go()) {
					this.bl_fld.ag_fld.ax(var1.ad_fld);
				}

				var1.ak();
				if (var1.aa_fld >= 0) {
					var1.gy_void();
					if (var1.ah_fld > 0 && this.be_fld[var1.ag_fld][var1.ah_fld] == var1) {
						this.be_fld[var1.ag_fld][var1.ah_fld] = null;
					}
				}

				return true;
			} else {
				var1.ad_fld.ba(var1.ao_fld, this.bu(var1), this.bn(var1));
				return false;
			}
		} else {
			var1.ak();
			var1.gy_void();
			if (var1.ah_fld > 0 && var1 == this.be_fld[var1.ag_fld][var1.ah_fld]) {
				this.be_fld[var1.ag_fld][var1.ah_fld] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dw(int var1) {
		for (mg var2 = (mg)this.bl_fld.ak_fld.aw(); var2 != null; var2 = (mg)this.bl_fld.ak_fld.as()) {
			if ((var1 < 0 || var1 == var2.ag_fld) && var2.aa_fld * -93280530 < 0) {
				this.br_fld[var2.ag_fld][-106981642 * var2.aw_fld] = null;
				var2.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cy() {
		if (null != this.ah_fld) {
			if (null != av_fld) {
				av_fld.set(true);
			}

			av_fld = new AtomicBoolean(false);
			AtomicBoolean var1 = av_fld;
			if (null == ae_fld) {
				int var2 = Runtime.getRuntime().availableProcessors();
				ae_fld = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new mn(this));
			}

			ae_fld.submit(new md(this, var1));
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cf() {
		if (null != this.ah_fld) {
			if (null != av_fld) {
				av_fld.set(true);
			}

			av_fld = new AtomicBoolean(false);
			AtomicBoolean var1 = av_fld;
			if (null == ae_fld) {
				int var2 = Runtime.getRuntime().availableProcessors();
				ae_fld = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new mn(this));
			}

			ae_fld.submit(new md(this, var1));
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cx() {
		synchronized (this.bx_fld) {
			for (ms var2 = (ms)this.af_fld.aq(); var2 != null; var2 = (ms)xz.aa(this.af_fld)) {
				var2.ag();
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cp() {
		synchronized (this.bx_fld) {
			for (ms var2 = (ms)this.af_fld.aq(); var2 != null; var2 = (ms)xz.aa(this.af_fld)) {
				var2.gy_void();
			}
		}
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int ei(mg var1) {
		mi var2 = var1.ae_fld;
		int var3 = 403031854 + this.ax_fld[260948659 * var1.ag_fld] * this.ad_fld[1802236488 * var1.ag_fld] >> 13;
		var3 = 16384 + var3 * var3 >> 15;
		var3 = -1057565635 + var1.ay_fld * var3 >> 15;
		var3 = this.au_fld * var3 + 128 >> 8;
		if (var2.aw_fld > 0) {
			var3 = (int)(var3 * Math.pow(0.5, 1788918060 * var1.au_fld * 1.953125E-5 * (var2.aw_fld * 1878647377)) + 0.5);
		}

		if (null != var2.ak_fld) {
			int var4 = var1.ax_fld;
			int var5 = var2.ak_fld[1 + var1.an_fld];
			if (var1.an_fld < var2.ak_fld.length - 2) {
				int var6 = (var2.ak_fld[var1.an_fld] & 255) << 8;
				int var7 = (var2.ak_fld[2 + var1.an_fld] & -1342571509) << 8;
				var5 += (var2.ak_fld[3 + var1.an_fld] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = -1758593538 + var5 * var3 >> 6;
		}

		if (var1.aa_fld > 0 && var2.ag_fld != null) {
			int var11 = 488647989 * var1.aa_fld;
			int var12 = var2.ag_fld[var1.ai_fld + 1];
			if (var1.ai_fld < var2.ag_fld.length - 2) {
				int var13 = (var2.ag_fld[var1.ai_fld * -510479844] & 586487236) << 8;
				int var14 = (var2.ag_fld[var1.ai_fld + 2] & 255) << 8;
				var12 += (var11 - var13) * (var2.ag_fld[3 + var1.ai_fld] - var12) / (var14 - var13);
			}

			var3 = 32 + var3 * var12 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cn() {
		synchronized (this.bx_fld) {
			for (ms var2 = (ms)this.af_fld.aq(); var2 != null; var2 = (ms)xz.aa(this.af_fld)) {
				var2.gy_void();
			}
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lmz;Lub;Lap;)Z"
	)
	public boolean cq(mz var1, ub var2, ap var3) {
		try {
			synchronized (this.bx_fld) {
				boolean var5 = true;
				synchronized (this.ah_fld) {
					this.ah_fld.clear();
				}

				for (mc var19 = (mc)var1.ak_fld.aq(); var19 != null; var19 = (mc)xz.aa(var1.ak_fld)) {
					int var7 = (int)var19.hc_fld;
					ms var8 = (ms)this.af_fld.ak(var7);
					if (var8 == null) {
						byte[] var10 = ub.ae(var2, var7, (byte)120);
						ms var9;
						if (null == var10) {
							var9 = null;
						} else {
							var9 = new ms(var10);
						}

						var8 = var9;
						if (null == var9) {
							var5 = false;
							continue;
						}

						this.af_fld.az(var9, var7);
					}

					if (!var8.ak(var3, var19.ak_fld)) {
						var5 = false;
					} else if (null != this.ah_fld) {
						synchronized (this.ah_fld) {
							Iterator var21 = var8.as_fld.iterator();

							while (var21.hasNext()) {
								ai var11 = (ai)(ai)var21.next();
								this.ah_fld.add(new mp(var19.ag_fld * -1208215387, var11));
							}
						}
					}
				}

				return var5;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lmz;Z)V"
	)
	public void cg(mz var1, boolean var2) {
		synchronized (this.bx_fld) {
			this.au();
			this.bs_fld.ak(var1.ag_fld);
			this.bh_fld = var2;
			this.bf_fld = 0L;
			int var4 = this.bs_fld.av();

			for (int var5 = 0; var5 < var4; var5++) {
				this.bs_fld.ae(var5);
				this.bs_fld.ay(var5);
				this.bs_fld.ah(var5);
			}

			this.bj_fld = this.bs_fld.au();
			this.al_fld = -1322297411 * this.bs_fld.as_fld[this.bj_fld];
			this.by_fld = this.bs_fld.bw(this.al_fld);
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cw() {
		synchronized (this.bx_fld) {
			rj.dl(this.bs_fld);
			cd(this, (byte)122);
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cm() {
		synchronized (this.bx_fld) {
			return this.bs_fld.az();
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cz() {
		synchronized (this.bx_fld) {
			return this.bs_fld.az();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean an() {
		synchronized (this.bx_fld) {
			return this.af_fld.ag() > 0;
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lml;)V"
	)
	public static void nt(ml var0) {
		synchronized (var0.bx_fld) {
			for (ms var2 = (ms)var0.af_fld.aq(); var2 != null; var2 = (ms)xz.aa(var0.af_fld)) {
				var2.gy_void();
			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cb() {
		synchronized (this.bx_fld) {
			return this.af_fld.ag() > 0;
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void eh() {
		long var3;
		int var1 = this.bj_fld;
		int var2 = this.al_fld;

		for (var3 = this.by_fld; this.al_fld == var2; var3 = this.bs_fld.bw(var2)) {
			while (true) {
				if (var2 == this.bs_fld.as_fld[var1]) {
					this.bs_fld.ae(var1);
					int var5 = this.bs_fld.as(var1);
					if (1 != var5) {
						if ((var5 & -1041974652) != 0) {
							this.bp(var5, (short)26233);
						}

						this.bs_fld.ay(var1);
						this.bs_fld.ah(var1);
						continue;
					}

					this.bs_fld.aw();
					this.bs_fld.ah(var1);
					if (this.bs_fld.ax()) {
						if (!this.bh_fld || 0 == var2) {
							cd(this, (byte)80);
							rj.dl(this.bs_fld);
							return;
						}

						this.bs_fld.an(var3);
					}
				}

				var1 = this.bs_fld.au();
				var2 = this.bs_fld.as_fld[var1];
				break;
			}
		}

		this.bj_fld = var1;
		this.al_fld = var2;
		this.by_fld = var3;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void co(int var1, int var2) {
		synchronized (this.bx_fld) {
			this.ai(var1, var2);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bz() {
		return this.bl_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bo(int var1, int var2) {
		this.ao_fld[var1] = var2;
		this.ap_fld[var1] = var2 & 1305771923;
		this.aq(var1, var2, (byte)36);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ch(int var1, int var2) {
		if (var2 != this.ab_fld[var1]) {
			this.ab_fld[var1] = var2;

			for (int var3 = 0; var3 < 128; var3++) {
				this.be_fld[var1][var3] = null;
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void cl(int var1, int var2) {
		if (var2 != this.ab_fld[var1]) {
			this.ab_fld[var1] = var2;

			for (int var3 = 0; var3 < 128; var3++) {
				this.be_fld[var1][var3] = null;
			}
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean hi(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ci(var0.ew_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void dh(int var1, int var2, int var3) {
		this.ao(var1, var2, 64, -289660873);
		if ((this.ay_fld[var1] & 2) != 0) {
			for (mg var4 = (mg)this.bl_fld.ak_fld.ay(); null != var4; var4 = (mg)this.bl_fld.ak_fld.ar()) {
				if (var1 == var4.ag_fld && var4.aa_fld < 0) {
					this.br_fld[var1][var4.aw_fld] = null;
					this.br_fld[var1][var2] = var4;
					int var5 = var4.ar_fld + (var4.af_fld * var4.al_fld >> 12);
					var4.ar_fld = var4.ar_fld + -1304214753 * (var2 - var4.aw_fld << 8);
					var4.af_fld = var5 - var4.ar_fld;
					var4.al_fld = -1184772096;
					var4.aw_fld = var2;
					return;
				}
			}
		}

		ms var8 = (ms)this.af_fld.ak(this.ab_fld[var1]);
		if (null != var8) {
			if (null != var8.az_fld[var2]) {
				al var9 = var8.az_fld[var2].ag();
				if (var9 != null) {
					mg var6 = new mg();
					var6.ag_fld = var1;
					var6.az_fld = var8;
					var6.av_fld = var9;
					var6.ae_fld = var8.aw_fld[var2];
					var6.ah_fld = -667066637 * var8.ay_fld[var2];
					var6.aw_fld = var2;
					var6.ay_fld = -1323091305 * (var8.ae_fld[var2] * var3 * var3 * var8.ag_fld + 1024 >> 11);
					var6.as_fld = var8.ah_fld[var2] & 255;
					var6.ar_fld = -1304214753 * ((var2 << 8) - (var8.av_fld[var2] & 32767));
					var6.au_fld = 0;
					var6.ax_fld = 0;
					var6.an_fld = 0;
					var6.aa_fld = -1507818479;
					var6.ai_fld = 0;
					if (0 == this.as_fld[var1]) {
						var6.ad_fld = ac.av(var9, this.bi(var6), this.bu(var6), this.bn(var6));
					} else {
						var6.ad_fld = ac.av(var9, this.bi(var6), 0, this.bn(var6));
						this.ad(var6, var8.av_fld[var2] < 0);
					}

					if (var8.av_fld[var2] < 0) {
						var6.ad_fld.bm(-1);
					}

					if (var6.ah_fld >= 0) {
						mg var7 = this.be_fld[var1][var6.ah_fld];
						if (null != var7 && var7.aa_fld < 0) {
							this.br_fld[var1][var7.aw_fld] = null;
							var7.aa_fld = 0;
						}

						this.be_fld[var1][var6.ah_fld] = var6;
					}

					this.bl_fld.ak_fld.av(var6);
					this.br_fld[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int ek(mg var1) {
		int var2 = this.an_fld[var1.ag_fld];
		return var2 < 8192 ? 32 + var1.as_fld * var2 >> 6 : 16384 - ((16384 - var2) * (128 - var1.as_fld) + 32 >> 6);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void do_(int var1, int var2) {
		mg var4 = this.br_fld[var1][var2];
		if (null != var4) {
			this.br_fld[var1][var2] = null;
			if (0 != (this.ay_fld[var1] & 2)) {
				for (mg var5 = (mg)this.bl_fld.ak_fld.aw(); null != var5; var5 = (mg)this.bl_fld.ak_fld.as()) {
					if (var5.ag_fld == var4.ag_fld && -2028849047 * var5.aa_fld < 0 && var4 != var5) {
						var4.aa_fld = 0;
						break;
					}
				}
			} else {
				var4.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Z)V"
	)
	void dm(mg var1, boolean var2) {
		int var3 = var1.av_fld.ag_fld.length;
		int var4;
		if (var2 && var1.av_fld.ae_fld) {
			int var5 = var3 + var3 - var1.av_fld.az_fld;
			var4 = (int)((long)var5 * this.as_fld[var1.ag_fld] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.ad_fld.fc(true);
			}
		} else {
			var4 = (int)((long)var3 * this.as_fld[var1.ag_fld] >> 6);
		}

		var1.ad_fld.bu(var4);
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Lml;Lmg;Z)V"
	)
	public static void qh(ml var0, mg var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var3 = var1.av_fld.ag_fld.length;
			int var4;
			if (var2 && var1.av_fld.ae_fld) {
				int var5 = var3 + var3 - var1.av_fld.az_fld;
				var4 = (int)((long)var5 * var0.as_fld[var1.ag_fld] >> 6);
				var3 <<= 8;
				if (var4 >= var3) {
					var4 = var3 + var3 - 1 - var4;
					var1.ad_fld.fc(true);
				}
			} else {
				var4 = (int)((long)var3 * var0.as_fld[var1.ag_fld * 657733621] >> 6);
			}

			var1.ad_fld.bu(var4);
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Z)V"
	)
	void dq(mg var1, boolean var2) {
		int var3 = var1.av_fld.ag_fld.length;
		int var4;
		if (var2 && var1.av_fld.ae_fld) {
			int var5 = var3 + var3 - var1.av_fld.az_fld;
			var4 = (int)((long)var5 * this.as_fld[var1.ag_fld] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.ad_fld.fc(true);
			}
		} else {
			var4 = (int)((long)var3 * this.as_fld[var1.ag_fld] >> 6);
		}

		var1.ad_fld.bu(var4);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ar() {
		synchronized (this.bx_fld) {
			for (ms var3 = (ms)this.af_fld.aq(); var3 != null; var3 = (ms)xz.aa(this.af_fld)) {
				var3.gy_void();
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([III)V"
	)
	@Override
	protected void bj(int[] var1, int var2, int var3) {
		if (this.bs_fld.az()) {
			int var4 = this.bs_fld.ay_fld * this.bk_fld / ao.ar_fld;

			do {
				long var5 = (long)var4 * var3 + this.bf_fld;
				if (this.by_fld - var5 >= 0L) {
					this.bf_fld = var5;
					break;
				}

				int var7 = (int)((this.by_fld - this.bf_fld + var4 - 1L) / var4);
				this.bf_fld += -8485410119410535671L * (long)var4 * var7;
				this.bl_fld.as(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.di();
			} while (this.bs_fld.az());
		}

		this.bl_fld.as(var1, var2, var3);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj bh() {
		return null;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void da(int var1, int var2) {
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void dk(int var1, int var2) {
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ds(int var1) {
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bt(int var1, int var2) {
		this.bz_fld[var1] = var2;
		this.ar_fld[var1] = (int)(2097152.0 * Math.pow(2.0, var2 * 5.493164E-4F) + 0.5);
	}

	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "(Lml;Lmg;)I"
	)
	public static int rz(ml var0, mg var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var1.ar_fld + (var1.af_fld * var1.al_fld >> 12);
		var2 += (var0.at_fld[301628314 * var1.ag_fld] - -1741544819) * var0.bd_fld[var1.ag_fld] >> 12;
		mi var3 = var1.ae_fld;
		if (var3.av_fld > 0 && (1496729432 * var3.as_fld > 0 || var0.ac_fld[var1.ag_fld] > 0)) {
			int var4 = var3.as_fld << 2;
			int var5 = var3.ay_fld << 1;
			if (var1.aq_fld < var5) {
				var4 = var1.aq_fld * var4 / var5;
			}

			var4 += var0.ac_fld[var1.ag_fld] >> 7;
			double var6 = Math.sin(0.01227184630308513 * (var1.am_fld & 2037971595));
			var2 += (int)(var4 * var6);
		}

		int var10 = (int)(1419341637 * var1.av_fld.ak_fld * Math.pow(2.0, 3.255208333333333E-4 * var2) / ao.ar_fld + 0.5);
		return var10 < 1 ? 1 : var10;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void aq(int var1, int var2, byte var3) {
		if (var2 != this.ab_fld[var1]) {
			if (var3 == 0) {
				return;
			}

			this.ab_fld[var1] = var2;

			for (int var4 = 0; var4 < 128; var4++) {
				this.be_fld[var1][var4] = null;
			}
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ck() {
		synchronized (this.bx_fld) {
			return this.bs_fld.az();
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void de() {
		this.ac(-1, (byte)2);
		this.du(-1, -670939573);

		for (int var1 = 0; var1 < 16; var1++) {
			this.ab_fld[var1] = this.ao_fld[var1];
		}

		for (int var2 = 0; var2 < 16; var2++) {
			this.ap_fld[var2] = this.ao_fld[var2] & -128;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bc(int var1) {
		if ((this.ay_fld[var1] & 2) != 0) {
			for (mg var2 = (mg)this.bl_fld.ak_fld.aw(); null != var2; var2 = (mg)this.bl_fld.ak_fld.as()) {
				if (var1 == var2.ag_fld && null == this.br_fld[var1][var2.aw_fld] && var2.aa_fld < 0) {
					var2.aa_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cd() {
		return this.au_fld;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dj(int var1) {
		if ((this.ay_fld[var1] & 4) != 0) {
			for (mg var2 = (mg)this.bl_fld.ak_fld.aw(); null != var2; var2 = (mg)this.bl_fld.ak_fld.as()) {
				if (var1 == var2.ag_fld) {
					var2.ab_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lml;B)V"
	)
	public static void cd(ml var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ac(-1, (byte)2);
		var0.du(-1, -2062559172);

		for (int var2 = 0; var2 < 16; var2++) {
			var0.ab_fld[var2] = var0.ao_fld[var2];
		}

		for (int var3 = 0; var3 < 16; var3++) {
			var0.ap_fld[var3] = var0.ao_fld[var3] & -128;
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dp(int var1) {
		int var2 = var1 & 240;
		if (var2 == 128) {
			int var13 = var1 & 15;
			int var19 = var1 >> 8 & 127;
			int var22 = var1 >> 16 & 127;
			this.ao(var13, var19, var22, 545069652);
		} else if (var2 == 144) {
			int var12 = var1 & 15;
			int var18 = var1 >> 8 & 127;
			int var21 = var1 >> 16 & 127;
			if (var21 > 0) {
				this.am(var12, var18, var21, 544416550);
			} else {
				this.ao(var12, var18, 64, 1079587757);
			}
		} else if (var2 == 160) {
			int var11 = var1 & 15;
			int var17 = var1 >> 8 & 127;
			int var20 = var1 >> 16 & 127;
			this.ab(var11, var17, var20);
		} else if (176 == var2) {
			int var10 = var1 & 15;
			int var16 = var1 >> 8 & 127;
			int var5 = var1 >> 16 & 127;
			if (var16 == 0) {
				this.ap_fld[var10] = (this.ap_fld[var10] & -2080769) + (var5 << 14);
			}

			if (32 == var16) {
				this.ap_fld[var10] = (var5 << 7) + (this.ap_fld[var10] & -16257);
			}

			if (var16 == 1) {
				this.ac_fld[var10] = (this.ac_fld[var10] & -16257) + (var5 << 7);
			}

			if (33 == var16) {
				this.ac_fld[var10] = var5 + (this.ac_fld[var10] & -128);
			}

			if (var16 == 5) {
				this.aj_fld[var10] = (var5 << 7) + (this.aj_fld[var10] & -16257);
			}

			if (37 == var16) {
				this.aj_fld[var10] = (this.aj_fld[var10] & -128) + var5;
			}

			if (7 == var16) {
				this.ax_fld[var10] = (var5 << 7) + (this.ax_fld[var10] & -16257);
			}

			if (39 == var16) {
				this.ax_fld[var10] = var5 + (this.ax_fld[var10] & -128);
			}

			if (var16 == 10) {
				this.an_fld[var10] = (var5 << 7) + (this.an_fld[var10] & -16257);
			}

			if (var16 == 42) {
				this.an_fld[var10] = var5 + (this.an_fld[var10] & -128);
			}

			if (11 == var16) {
				this.ad_fld[var10] = (var5 << 7) + (this.ad_fld[var10] & -16257);
			}

			if (var16 == 43) {
				this.ad_fld[var10] = var5 + (this.ad_fld[var10] & -128);
			}

			if (64 == var16) {
				if (var5 >= 64) {
					this.ay_fld[var10] = this.ay_fld[var10] | 1;
				} else {
					this.ay_fld[var10] = this.ay_fld[var10] & -2;
				}
			}

			if (var16 == 65) {
				if (var5 >= 64) {
					this.ay_fld[var10] = this.ay_fld[var10] | 2;
				} else {
					cz(this, var10, (byte)-95);
					this.ay_fld[var10] = this.ay_fld[var10] & -3;
				}
			}

			if (99 == var16) {
				this.bm_fld[var10] = (this.bm_fld[var10] & 127) + (var5 << 7);
			}

			if (98 == var16) {
				this.bm_fld[var10] = var5 + (this.bm_fld[var10] & 16256);
			}

			if (101 == var16) {
				this.bm_fld[var10] = (var5 << 7) + 16384 + (this.bm_fld[var10] & 127);
			}

			if (var16 == 100) {
				this.bm_fld[var10] = 16384 + (this.bm_fld[var10] & 16256) + var5;
			}

			if (120 == var16) {
				this.ac(var10, (byte)2);
			}

			if (121 == var16) {
				this.du(var10, -452118919);
			}

			if (var16 == 123) {
				this.bm(var10, (byte)-19);
			}

			if (var16 == 6) {
				int var6 = this.bm_fld[var10];
				if (var6 == 16384) {
					this.bd_fld[var10] = (this.bd_fld[var10] & -16257) + (var5 << 7);
				}
			}

			if (38 == var16) {
				int var23 = this.bm_fld[var10];
				if (var23 == 16384) {
					this.bd_fld[var10] = var5 + (this.bd_fld[var10] & -128);
				}
			}

			if (var16 == 16) {
				this.as_fld[var10] = (this.as_fld[var10] & -16257) + (var5 << 7);
			}

			if (48 == var16) {
				this.as_fld[var10] = var5 + (this.as_fld[var10] & -128);
			}

			if (81 == var16) {
				if (var5 >= 64) {
					this.ay_fld[var10] = this.ay_fld[var10] | 4;
				} else {
					this.aj(var10, 804493702);
					this.ay_fld[var10] = this.ay_fld[var10] & -5;
				}
			}

			if (17 == var16) {
				this.bt(var10, (this.bz_fld[var10] & -16257) + (var5 << 7));
			}

			if (49 == var16) {
				this.bt(var10, (this.bz_fld[var10] & -128) + var5);
			}
		} else if (var2 == 192) {
			int var9 = var1 & 15;
			int var15 = var1 >> 8 & 127;
			this.aq(var9, this.ap_fld[var9] + var15, (byte)32);
		} else if (var2 == 208) {
			int var8 = var1 & 15;
			int var14 = var1 >> 8 & 127;
			mj(this, var8, var14, (byte)0);
		} else if (224 == var2) {
			int var3 = var1 & 15;
			int var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.at(var3, var4);
		} else {
			var2 = var1 & 0xFF;
			if (255 == var2) {
				cd(this, (byte)55);
			}
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ct(int var1, int var2) {
		this.bz_fld[var1] = var2;
		this.ar_fld[var1] = (int)(2097152.0 * Math.pow(2.0, var2 * 5.493164E-4F) + 0.5);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void dv(int var1, int var2, int var3) {
		this.ao(var1, var2, 527108455, 1493664187);
		if ((this.ay_fld[var1] & 2) != 0) {
			for (mg var4 = (mg)this.bl_fld.ak_fld.ay(); null != var4; var4 = (mg)this.bl_fld.ak_fld.ar()) {
				if (var1 == var4.ag_fld && -1699221349 * var4.aa_fld < 0) {
					this.br_fld[var1][var4.aw_fld] = null;
					this.br_fld[var1][var2] = var4;
					int var5 = var4.ar_fld + (var4.af_fld * var4.al_fld >> 12);
					var4.ar_fld = var4.ar_fld + 2146705777 * (var2 - var4.aw_fld << 8);
					var4.af_fld = (var5 - var4.ar_fld) * 541844817;
					var4.al_fld = -1184772096;
					var4.aw_fld = var2;
					return;
				}
			}
		}

		ms var8 = (ms)this.af_fld.ak(this.ab_fld[var1]);
		if (null != var8) {
			if (null != var8.az_fld[var2]) {
				al var9 = var8.az_fld[var2].ag();
				if (var9 != null) {
					mg var6 = new mg();
					var6.ag_fld = var1;
					var6.az_fld = var8;
					var6.av_fld = var9;
					var6.ae_fld = var8.aw_fld[var2];
					var6.ah_fld = 248439140 * var8.ay_fld[var2];
					var6.aw_fld = var2;
					var6.ay_fld = -858457911 * (var8.ae_fld[var2] * var3 * var3 * var8.ag_fld + 804390418 >> 11);
					var6.as_fld = (var8.ah_fld[var2] & 255) * 1738280163;
					var6.ar_fld = -1304214753 * ((var2 << 8) - (var8.av_fld[var2] & 925698777));
					var6.au_fld = 0;
					var6.ax_fld = 0;
					var6.an_fld = 0;
					var6.aa_fld = -1507818479;
					var6.ai_fld = 0;
					if (0 == this.as_fld[var1]) {
						var6.ad_fld = ac.av(var9, this.bi(var6), this.bu(var6), this.bn(var6));
					} else {
						var6.ad_fld = ac.av(var9, this.bi(var6), 0, this.bn(var6));
						this.ad(var6, var8.av_fld[var2] < 0);
					}

					if (var8.av_fld[var2] < 0) {
						var6.ad_fld.bm(-1);
					}

					if (1209916216 * var6.ah_fld >= 0) {
						mg var7 = this.be_fld[var1][var6.ah_fld * 1964824977];
						if (null != var7 && var7.aa_fld < 0) {
							this.br_fld[var1][var7.aw_fld] = null;
							var7.aa_fld = 0;
						}

						this.be_fld[var1][var6.ah_fld * 2098574532] = var6;
					}

					this.bl_fld.ak_fld.av(var6);
					this.br_fld[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int en(mg var1) {
		int var2 = var1.ar_fld + (var1.af_fld * var1.al_fld >> 12);
		var2 += (this.at_fld[var1.ag_fld] - 8192) * this.bd_fld[var1.ag_fld] >> 12;
		mi var3 = var1.ae_fld;
		if (var3.av_fld > 0 && (var3.as_fld > 0 || this.ac_fld[var1.ag_fld] > 0)) {
			int var4 = var3.as_fld << 2;
			int var5 = var3.ay_fld << 1;
			if (var1.aq_fld < var5) {
				var4 = var1.aq_fld * var4 / var5;
			}

			var4 += this.ac_fld[var1.ag_fld] >> 7;
			double var6 = Math.sin(0.01227184630308513 * (var1.am_fld & 511));
			var2 += (int)(var4 * var6);
		}

		int var10 = (int)(256 * var1.av_fld.ak_fld * Math.pow(2.0, 3.255208333333333E-4 * var2) / ao.ar_fld + 0.5);
		return var10 < 1 ? 1 : var10;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int eg(mg var1) {
		int var2 = var1.ar_fld + (var1.af_fld * var1.al_fld >> 12);
		var2 += (this.at_fld[var1.ag_fld] - 8192) * this.bd_fld[var1.ag_fld] >> 12;
		mi var3 = var1.ae_fld;
		if (var3.av_fld > 0 && (var3.as_fld > 0 || this.ac_fld[var1.ag_fld] > 0)) {
			int var4 = var3.as_fld << 2;
			int var5 = var3.ay_fld << 1;
			if (var1.aq_fld < var5) {
				var4 = var1.aq_fld * var4 / var5;
			}

			var4 += this.ac_fld[var1.ag_fld] >> 7;
			double var6 = Math.sin(0.01227184630308513 * (var1.am_fld & 511));
			var2 += (int)(var4 * var6);
		}

		int var10 = (int)(256 * var1.av_fld.ak_fld * Math.pow(2.0, 3.255208333333333E-4 * var2) / ao.ar_fld + 0.5);
		return var10 < 1 ? 1 : var10;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ci(int var1, int var2) {
		synchronized (this.bx_fld) {
			this.ai(var1, var2);
		}
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void dd(int var1, int var2) {
		mg var4 = this.br_fld[var1][var2];
		if (null != var4) {
			this.br_fld[var1][var2] = null;
			if (0 != (this.ay_fld[var1] & 2)) {
				for (mg var5 = (mg)this.bl_fld.ak_fld.aw(); null != var5; var5 = (mg)this.bl_fld.ak_fld.as()) {
					if (var5.ag_fld == var4.ag_fld && var5.aa_fld < 0 && var4 != var5) {
						var4.aa_fld = 0;
						break;
					}
				}
			} else {
				var4.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)I"
	)
	int ee(mg var1) {
		mi var2 = var1.ae_fld;
		int var3 = 4096 + this.ax_fld[var1.ag_fld] * this.ad_fld[var1.ag_fld] >> 13;
		var3 = 16384 + var3 * var3 >> 15;
		var3 = 16384 + var1.ay_fld * var3 >> 15;
		var3 = this.au_fld * var3 + 128 >> 8;
		if (var2.aw_fld > 0) {
			var3 = (int)(var3 * Math.pow(0.5, var1.au_fld * 1.953125E-5 * var2.aw_fld) + 0.5);
		}

		if (null != var2.ak_fld) {
			int var4 = var1.ax_fld;
			int var5 = var2.ak_fld[1 + var1.an_fld];
			if (var1.an_fld < var2.ak_fld.length - 2) {
				int var6 = (var2.ak_fld[var1.an_fld] & 255) << 8;
				int var7 = (var2.ak_fld[2 + var1.an_fld] & 255) << 8;
				var5 += (var2.ak_fld[3 + var1.an_fld] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = 32 + var5 * var3 >> 6;
		}

		if (var1.aa_fld > 0 && var2.ag_fld != null) {
			int var11 = var1.aa_fld;
			int var12 = var2.ag_fld[var1.ai_fld + 1];
			if (var1.ai_fld < var2.ag_fld.length - 2) {
				int var13 = (var2.ag_fld[var1.ai_fld] & 255) << 8;
				int var14 = (var2.ag_fld[var1.ai_fld + 2] & 255) << 8;
				var12 += (var11 - var13) * (var2.ag_fld[3 + var1.ai_fld] - var12) / (var14 - var13);
			}

			var3 = 32 + var3 * var12 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lml;)V"
	)
	public static void oi(ml var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ac(-1, (byte)2);
		var0.du(-1, 1789687461);

		for (int var1 = 0; var1 < 16; var1++) {
			var0.ab_fld[var1] = var0.ao_fld[var1];
		}

		for (int var2 = 0; var2 < 16; var2++) {
			var0.ap_fld[var2] = var0.ao_fld[var2] & 1925180386;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Laj;"
	)
	@Override
	protected aj aw() {
		return null;
	}

	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "(Lml;I)V"
	)
	public static void vo(ml var0, int var1) {
		if ((var0.ay_fld[var1] & 2) != 0) {
			for (mg var2 = (mg)var0.bl_fld.ak_fld.aw(); null != var2; var2 = (mg)var0.bl_fld.ak_fld.as()) {
				if (var1 == var2.ag_fld && null == var0.br_fld[var1][var2.aw_fld] && var2.aa_fld < 0) {
					var2.aa_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ce() {
		synchronized (this.bx_fld) {
			for (ms var2 = (ms)this.af_fld.aq(); var2 != null; var2 = (ms)xz.aa(this.af_fld)) {
				var2.gy_void();
			}
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ev() {
		long var3;
		int var1 = this.bj_fld;
		int var2 = this.al_fld;

		for (var3 = this.by_fld; this.al_fld == var2; var3 = this.bs_fld.bw(var2)) {
			while (true) {
				if (var2 == this.bs_fld.as_fld[var1]) {
					this.bs_fld.ae(var1);
					int var5 = this.bs_fld.as(var1);
					if (1 != var5) {
						if ((var5 & 128) != 0) {
							this.bp(var5, (short)18210);
						}

						this.bs_fld.ay(var1);
						this.bs_fld.ah(var1);
						continue;
					}

					this.bs_fld.aw();
					this.bs_fld.ah(var1);
					if (this.bs_fld.ax()) {
						if (!this.bh_fld || 0 == var2) {
							cd(this, (byte)45);
							rj.dl(this.bs_fld);
							return;
						}

						this.bs_fld.an(var3);
					}
				}

				var1 = this.bs_fld.au();
				var2 = this.bs_fld.as_fld[var1];
				break;
			}
		}

		this.bj_fld = var1;
		this.al_fld = var2;
		this.by_fld = var3;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lmz;Lub;Lap;)Z"
	)
	public boolean cv(mz var1, ub var2, ap var3) {
		try {
			synchronized (this.bx_fld) {
				boolean var5 = true;
				synchronized (this.ah_fld) {
					this.ah_fld.clear();
				}

				for (mc var19 = (mc)var1.ak_fld.aq(); var19 != null; var19 = (mc)xz.aa(var1.ak_fld)) {
					int var7 = (int)var19.hc_fld;
					ms var8 = (ms)this.af_fld.ak(var7);
					if (var8 == null) {
						byte[] var10 = ub.ae(var2, var7, (byte)101);
						ms var9;
						if (null == var10) {
							var9 = null;
						} else {
							var9 = new ms(var10);
						}

						var8 = var9;
						if (null == var9) {
							var5 = false;
							continue;
						}

						this.af_fld.az(var9, var7);
					}

					if (!var8.ak(var3, var19.ak_fld)) {
						var5 = false;
					} else if (null != this.ah_fld) {
						synchronized (this.ah_fld) {
							Iterator var21 = var8.as_fld.iterator();

							while (var21.hasNext()) {
								ai var11 = (ai)(ai)var21.next();
								this.ah_fld.add(new mp(var19.ag_fld, var11));
							}
						}
					}
				}

				return var5;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void em() {
		long var3;
		int var1 = -1731870599 * this.bj_fld;
		int var2 = this.al_fld;

		for (var3 = this.by_fld; this.al_fld == var2; var3 = this.bs_fld.bw(var2)) {
			while (true) {
				if (var2 == this.bs_fld.as_fld[var1]) {
					this.bs_fld.ae(var1);
					int var5 = this.bs_fld.as(var1);
					if (1 != var5) {
						if ((var5 & 128) != 0) {
							this.bp(var5, (short)23776);
						}

						this.bs_fld.ay(var1);
						this.bs_fld.ah(var1);
						continue;
					}

					this.bs_fld.aw();
					this.bs_fld.ah(var1);
					if (this.bs_fld.ax()) {
						if (!this.bh_fld || 0 == var2) {
							cd(this, (byte)85);
							rj.dl(this.bs_fld);
							return;
						}

						this.bs_fld.an(var3);
					}
				}

				var1 = this.bs_fld.au();
				var2 = this.bs_fld.as_fld[var1];
				break;
			}
		}

		this.bj_fld = -1484981466 * var1;
		this.al_fld = var2;
		this.by_fld = var3;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void el() {
		long var3;
		int var1 = this.bj_fld;
		int var2 = this.al_fld;

		for (var3 = this.by_fld; this.al_fld == var2; var3 = this.bs_fld.bw(var2)) {
			while (true) {
				if (var2 == this.bs_fld.as_fld[var1]) {
					this.bs_fld.ae(var1);
					int var5 = this.bs_fld.as(var1);
					if (1 != var5) {
						if ((var5 & 128) != 0) {
							this.bp(var5, (short)7629);
						}

						this.bs_fld.ay(var1);
						this.bs_fld.ah(var1);
						continue;
					}

					this.bs_fld.aw();
					this.bs_fld.ah(var1);
					if (this.bs_fld.ax()) {
						if (!this.bh_fld || 0 == var2) {
							cd(this, (byte)29);
							rj.dl(this.bs_fld);
							return;
						}

						this.bs_fld.an(var3);
					}
				}

				var1 = this.bs_fld.au();
				var2 = this.bs_fld.as_fld[var1];
				break;
			}
		}

		this.bj_fld = var1;
		this.al_fld = var2;
		this.by_fld = var3;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)Z"
	)
	boolean eu(mg var1) {
		if (null == var1.ad_fld) {
			if (var1.aa_fld * 1661656663 >= 0) {
				var1.gy_void();
				if (-1643914572 * var1.ah_fld > 0 && this.be_fld[var1.ag_fld * -1133618095][52944873 * var1.ah_fld] == var1) {
					this.be_fld[var1.ag_fld * 960970664][661518754 * var1.ah_fld] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)Z"
	)
	boolean ej(mg var1) {
		if (null == var1.ad_fld) {
			if (var1.aa_fld >= 0) {
				var1.gy_void();
				if (var1.ah_fld > 0 && this.be_fld[var1.ag_fld][var1.ah_fld] == var1) {
					this.be_fld[var1.ag_fld][var1.ah_fld] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lmz;Lub;Lap;)Z"
	)
	public boolean cc(mz var1, ub var2, ap var3) {
		try {
			synchronized (this.bx_fld) {
				boolean var5 = true;
				synchronized (this.ah_fld) {
					this.ah_fld.clear();
				}

				for (mc var19 = (mc)var1.ak_fld.aq(); var19 != null; var19 = (mc)xz.aa(var1.ak_fld)) {
					int var7 = (int)var19.hc_fld;
					ms var8 = (ms)this.af_fld.ak(var7);
					if (var8 == null) {
						byte[] var10 = ub.ae(var2, var7, (byte)73);
						ms var9;
						if (null == var10) {
							var9 = null;
						} else {
							var9 = new ms(var10);
						}

						var8 = var9;
						if (null == var9) {
							var5 = false;
							continue;
						}

						this.af_fld.az(var9, var7);
					}

					if (!var8.ak(var3, var19.ak_fld)) {
						var5 = false;
					} else if (null != this.ah_fld) {
						synchronized (this.ah_fld) {
							Iterator var21 = var8.as_fld.iterator();

							while (var21.hasNext()) {
								ai var11 = (ai)(ai)var21.next();
								this.ah_fld.add(new mp(var19.ag_fld, var11));
							}
						}
					}
				}

				return var5;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lmg;)Z"
	)
	boolean bw(mg var1) {
		if (null == var1.ad_fld) {
			if (var1.aa_fld >= 0) {
				var1.gy_void();
				if (var1.ah_fld > 0 && this.be_fld[var1.ag_fld][var1.ah_fld] == var1) {
					this.be_fld[var1.ag_fld][var1.ah_fld] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[III)Z"
	)
	boolean fo(mg var1, int[] var2, int var3, int var4) {
		var1.ao_fld = ao.ar_fld / 100;
		if (var1.aa_fld < 0 || null != var1.ad_fld && !var1.ad_fld.cc()) {
			int var5 = var1.al_fld;
			if (var5 > 0) {
				var5 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * this.aj_fld[var1.ag_fld]) + 0.5);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.al_fld = var5;
			}

			var1.ad_fld.bb(this.bi(var1));
			mi var6 = var1.ae_fld;
			boolean var7 = false;
			var1.aq_fld++;
			var1.am_fld = var1.am_fld + var6.av_fld;
			double var8 = ((var1.al_fld * var1.af_fld >> 12) + (var1.aw_fld - 60 << 8)) * 5.086263020833333E-6;
			if (var6.aw_fld > 0) {
				if (var6.ae_fld > 0) {
					var1.au_fld = var1.au_fld + (int)(128.0 * Math.pow(2.0, var6.ae_fld * var8) + 0.5) * -1670103627;
				} else {
					var1.au_fld += 128;
				}
			}

			if (null != var6.ak_fld) {
				if (var6.ah_fld > 0) {
					var1.ax_fld = var1.ax_fld + (int)(128.0 * Math.pow(2.0, var8 * var6.ah_fld) + 0.5) * -288903135;
				} else {
					var1.ax_fld += 128;
				}

				while (var1.an_fld < var6.ak_fld.length - 2 && var1.ax_fld > (var6.ak_fld[var1.an_fld + 2] & 255) << 8) {
					var1.an_fld += 2;
				}

				if (var6.ak_fld.length - 2 == var1.an_fld && var6.ak_fld[1 + var1.an_fld] == 0) {
					var7 = true;
				}
			}

			if (var1.aa_fld >= 0 && null != var6.ag_fld && (this.ay_fld[var1.ag_fld] & 1) == 0 && (var1.ah_fld < 0 || this.be_fld[var1.ag_fld][var1.ah_fld] != var1)) {
				if (var6.az_fld > 0) {
					var1.aa_fld = var1.aa_fld + (int)(128.0 * Math.pow(2.0, var6.az_fld * var8) + 0.5) * 1507818479;
				} else {
					var1.aa_fld += 128;
				}

				while (var1.ai_fld < var6.ag_fld.length - 2 && var1.aa_fld > (var6.ag_fld[var1.ai_fld + 2] & 255) << 8) {
					var1.ai_fld += 2;
				}

				if (var6.ag_fld.length - 2 == var1.ai_fld) {
					var7 = true;
				}
			}

			if (var7) {
				var1.ad_fld.bq(var1.ao_fld);
				if (var2 != null) {
					var1.ad_fld.as(var2, var3, var4);
				} else {
					var1.ad_fld.af(var4);
				}

				if (var1.ad_fld.go()) {
					this.bl_fld.ag_fld.ax(var1.ad_fld);
				}

				var1.ak();
				if (var1.aa_fld >= 0) {
					var1.gy_void();
					if (var1.ah_fld > 0 && this.be_fld[var1.ag_fld][var1.ah_fld] == var1) {
						this.be_fld[var1.ag_fld][var1.ah_fld] = null;
					}
				}

				return true;
			} else {
				var1.ad_fld.ba(var1.ao_fld, this.bu(var1), this.bn(var1));
				return false;
			}
		} else {
			var1.ak();
			var1.gy_void();
			if (var1.ah_fld > 0 && var1 == this.be_fld[var1.ag_fld][var1.ah_fld]) {
				this.be_fld[var1.ag_fld][var1.ah_fld] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.al_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ae(byte var1) {
		if (null != this.ah_fld) {
			if (null != av_fld) {
				if (var1 >= 64) {
					return;
				}

				av_fld.set(true);
			}

			av_fld = new AtomicBoolean(false);
			AtomicBoolean var2 = av_fld;
			if (null == ae_fld) {
				if (var1 >= 64) {
					return;
				}

				int var3 = Runtime.getRuntime().availableProcessors();
				ae_fld = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new mn(this));
			}

			ae_fld.submit(new md(this, var2));
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	void ap(int var1, int var2, byte var3) {
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void dr(int var1, int var2, int var3) {
		mg var4 = this.br_fld[var1][var2];
		if (null != var4) {
			this.be_fld[var1][var2] = null;
			if (0 != (this.ay_fld[var1] & 2)) {
				for (mg var5 = (mg)this.bl_fld.ak_fld.gu(); null != var5; var5 = (mg)this.bl_fld.ak_fld.ap()) {
					if (var5.ax_fld == var4.ar_fld && -1533340913 * var5.al_fld < 0 && var4 != var5) {
						var4.am_fld = 0;
						break;
					}
				}
			} else {
				var4.ab_fld = 0;
			}
		}
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void dc(int var1, int var2) {
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void dx(int var1, int var2) {
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void bf(byte var1) {
		this.bm(-1, (byte)2);
		this.ch(-1, -2062559172);

		for (int var2 = 0; var2 < 16; var2++) {
			this.aj_fld[var2] = this.ap_fld[var2];
		}

		for (int var3 = 0; var3 < 16; var3++) {
			this.as_fld[var3] = this.as_fld[var3] & -128;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void bx(int var1, byte var2) {
		if ((this.an_fld[var1] & 2) != 0) {
			for (mg var3 = (mg)this.bl_fld.ak_fld.as(); null != var3; var3 = (mg)this.bl_fld.ak_fld.fc()) {
				if (var1 == var3.af_fld && null == this.br_fld[var1][var3.ao_fld] && var3.ab_fld * -1533340913 < 0) {
					var3.as_fld = 0;
				}
			}
		}
	}
}
