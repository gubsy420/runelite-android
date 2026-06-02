import java.io.EOFException;
import net.runelite.api.Actor;
import net.runelite.api.Animation;
import net.runelite.api.Projectile;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ProjectileMoved;

@ObfuscatedName("bc")
@Implements({"Projectile"})
public class bc extends em implements Projectile {
	@ObfuscatedGetter(
		intValue = 1493175657
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double ao_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double an_fld;
	@ObfuscatedGetter(
		intValue = 407711893
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedGetter(
		intValue = 568267395
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = -812781125
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;
	@ObfuscatedGetter(
		intValue = -1206185707
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = 186672943
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedGetter(
		intValue = -692712159
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double aa_fld;
	@ObfuscatedGetter(
		intValue = 811418409
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = 1949208217
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = -1156448761
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = 1471247929
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedGetter(
		intValue = 2118723717
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 2096610047
	)
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int qx_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double ai_fld;
	@ObfuscatedGetter(
		intValue = -124599389
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -266919833
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ad_fld = false;
	@ObfuscatedGetter(
		intValue = -1279344039
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = -583165761
	)
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ab_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa ap_fld = new qa();
	@ObfuscatedGetter(
		intValue = 417252813
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = -218757885
	)
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bl_fld;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn al() {
		try {
			if (qa.jo(this.ap_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ab_fld * 51124229);
				fn var2 = var1.ae(qa.do_(this.ap_fld, -2088494224), 1556316946);
				if (null == var2) {
					return null;
				} else {
					var2.fy(this.am_fld);
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ah(int var1, int var2, int var3) {
		this.ag_fld += 378124001 * var1;
		this.az_fld += 1935771659 * var2;
		this.aw_fld += 533247549 * var1;
		this.ay_fld += -1793572913 * var2;
		this.an_fld = this.an_fld + kj.aw(var1);
		this.aa_fld = this.aa_fld + kj.aw(var2);
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.ab_fld;
	}

	@ObfuscatedName("getTargetLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTargetLevel() {
		return this.ah_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIB)V"
	)
	void aw(cx var1, int var2, int var3, byte var4) {
		try {
			if (var2 >= this.af_fld) {
				ProjectileMoved var23 = new ProjectileMoved();
				var23.setProjectile(this);
				var23.setPosition(this.getTarget());
				var23.setZ(this.as_fld);
				og.ci_fld.getCallbacks().post(var23);
			}

			if (var2 >= this.af_fld) {
				tu var5 = ah.ay(this.ar_fld, this.aw_fld, this.ay_fld, this.ah_fld, var1);
				int var6 = (int)var5.ay_fld;
				int var7 = (int)var5.ar_fld;
				int var8 = (int)var5.as_fld - this.as_fld;
				var5.ah();
				if (!this.ad_fld) {
					tu var9 = ah.ay(this.ae_fld, this.ag_fld, this.az_fld, this.ak_fld, var1);
					int var10 = (int)var9.ay_fld;
					int var11 = (int)var9.ar_fld;
					int var12 = (int)var9.as_fld - this.av_fld;
					var9.ah();
					double var13 = var6 - var10;
					double var15 = var7 - var11;
					double var17 = Math.sqrt(var13 * var13 + var15 * var15);
					double var10001;
					if (Math.abs(var17) < 0.01F) {
						if (var4 <= 4) {
							return;
						}

						var10001 = var10;
					} else {
						var10001 = var10 + this.ax_fld * var13 / var17;
					}

					this.an_fld = var10001;
					if (Math.abs(var17) < 0.01F) {
						if (var4 <= 4) {
							return;
						}

						var10001 = var11;
					} else {
						var10001 = var11 + this.ax_fld * var15 / var17;
					}

					this.aa_fld = var10001;
					this.ai_fld = var12;
				}

				double var25 = 1 + this.al_fld - var2;
				double var26 = (var6 - this.an_fld) / var25;
				double var27 = (var7 - this.aa_fld) / var25;
				double var28 = Math.sqrt(var26 * var26 + var27 * var27);
				if (!this.ad_fld) {
					this.ao_fld = -var28 * Math.tan(0.02454369 * this.au_fld);
				}

				double var29 = 2.0 * (var8 - this.ai_fld - this.ao_fld * var25) / (var25 * var25);
				this.ad_fld = true;
				this.an_fld += var26 * var3;
				this.aa_fld += var27 * var3;
				this.ai_fld = this.ai_fld + (this.ao_fld * var3 + var3 * (var3 * (0.5 * var29)));
				this.ao_fld += var3 * var29;
				this.aq_fld = (int)(Math.atan2(var26, var27) * 325.949) + 1024 & 2047;
				this.am_fld = (int)(Math.atan2(this.ao_fld, var28) * 325.949) & 2047;
				jm.kr_fld.av(bw.dk_fld, (int)this.an_fld, (int)this.aa_fld, false);
				cf.ak(this.ap_fld, var3, jm.kr_fld);
				jm.kr_fld.ae(2079953449);
			}
		} catch (Throwable var24) {
			throw new RuntimeException(var24);
		}
	}

	@ObfuscatedName("getStartHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getStartHeight() {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			if (qa.jo(this.ap_fld, 30)) {
				return null;
			} else {
				ot var2 = ou.ak(this.ab_fld);
				fn var3 = var2.ae(qa.do_(this.ap_fld, -209584203), 1593677237);
				if (null == var3) {
					return null;
				} else {
					var3.fy(this.am_fld);
					return var3;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getSourceActor")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Actor;"
	)
	@Override
	public Actor getSourceActor() {
		int var1 = this.ae_fld;
		dx var2 = bw.dk_fld;
		if (var1 > 0) {
			int var4 = var1 - 1;
			return (Actor)(Actor)var2.ax_fld.ss(var4);
		} else if (var1 < 0) {
			int var3 = -var1 - 1;
			return (Actor)(Actor)var2.au_fld.ss(var3);
		} else {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean af(int var0) {
		return var0 > 0;
	}

	@ObfuscatedName("getY")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	@Override
	public double getY() {
		return this.aa_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ap(int var0) {
		return var0 - 1;
	}

	@ObfuscatedName("getZ")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	@Override
	public double getZ() {
		return this.ai_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			if (this.ap_fld.av() && this.ap_fld.ae().ar(qa.do_(this.ap_fld, 588635183), (byte)38)) {
				return true;
			} else {
				ot var2 = ou.ak(this.ab_fld);
				fn var3 = ot.mm(var2, 1343616350);
				return var3 != null && var3.cv_fld != null;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			if (qa.jo(this.ap_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ab_fld * 1185648224);
				fn var2 = var1.ae(qa.do_(this.ap_fld, -871925616), 360793865);
				if (null == var2) {
					return null;
				} else {
					var2.fy(this.am_fld);
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getTargetActor")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Actor;"
	)
	@Override
	public Actor getTargetActor() {
		int var1 = this.ar_fld;
		dx var2 = bw.dk_fld;
		if (var1 > 0) {
			int var4 = var1 - 1;
			return (Actor)(Actor)var2.ax_fld.ss(var4);
		} else if (var1 < 0) {
			int var3 = -var1 - 1;
			return (Actor)(Actor)var2.au_fld.ss(var3);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn ax() {
		try {
			if (qa.jo(this.ap_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ab_fld);
				fn var2 = var1.ae(qa.do_(this.ap_fld, 491150945), 767253820);
				if (null == var2) {
					return null;
				} else {
					var2.fy(this.am_fld);
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("setEndCycle")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setEndCycle(int var1) {
		this.al_fld = var1;
	}

	@ObfuscatedName("getRemainingCycles")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getRemainingCycles() {
		int var1 = og.ci_fld.getGameCycle();
		return this.getEndCycle() - var1;
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void mu(int var1, int var2) {
		this.ah(var1, var2, 2027550484);
	}

	@ObfuscatedName("getFloor")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getFloor() {
		return this.getSourceLevel();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			if (qa.jo(this.ap_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ab_fld);
				fn var2 = var1.ae(qa.do_(this.ap_fld, -1162819380), 1244652132);
				if (null == var2) {
					return null;
				} else {
					var2.fy(this.am_fld);
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			if (qa.jo(this.ap_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ab_fld);
				fn var2 = var1.ae(qa.do_(this.ap_fld, -1752894636), 1544271151);
				if (null == var2) {
					return null;
				} else {
					var2.fy(this.am_fld);
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getX1")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getX1() {
		return LocalPoint.fromWorld(bw.dk_fld, this.ag_fld, this.az_fld).getX();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			if (this.ap_fld.av() && this.ap_fld.ae().ar(qa.do_(this.ap_fld, -97650296), (byte)25)) {
				return true;
			} else {
				ot var1 = ou.ak(this.ab_fld);
				fn var2 = ot.mm(var1, -1022641236);
				return var2 != null && var2.cv_fld != null;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeight() {
		return this.av_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIIILcx;)Ltu;"
	)
	static tu bh(int var0, int var1, int var2, int var3, cx var4) throws EOFException {
		try {
			tu var5 = null;
			dx var6 = null;
			boolean var7 = 0 != var0;
			if (var7) {
				Object var8;
				if (ux.ak(var0)) {
					int var9 = qs.ag(var0);
					var6 = pd.ag(var9, var4);
					var8 = (da)var6.ax_fld.ak(var9);
				} else {
					int var18 = -var0 - 1;
					var6 = kx.ak(var18, var4);
					var8 = dx.ii(var6, var18);
				}

				if (null != var8) {
					kj var19 = ((da)var8).es(var6, (byte)79);
					tu var10;
					synchronized (tu.ae_fld) {
						if (0 == tu.aw_fld) {
							var10 = new tu();
						} else {
							tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].as();
							var10 = tu.ae_fld[tu.aw_fld];
						}
					}

					var5 = var10;
					var10.ay_fld = var19.ag_fld;
					var10.ar_fld = var19.az_fld;
				}
			}

			if (null == var5) {
				var6 = var4.aw(var1, var2, -2047993165);
				int var17 = var1 - var6.ay_fld;
				int var20 = var2 - var6.as_fld;
				rg var21 = (rg)var4.ah(-225377813).an_fld.ak(var6.ag_fld);
				if (var21 != null) {
					var5 = rg.ql(var21, kj.as(var17), kj.as(var20));
				} else {
					var5 = sh.ak(kj.as(var17), 0.0F, kj.as(var20));
				}
			}

			int var22 = (int)var5.ay_fld;
			int var23 = (int)var5.ar_fld;
			int var12 = jf.dv(var6, var22, var23, var3);
			rg var13 = (rg)bw.dk_fld.an_fld.ak(var6.ag_fld);
			if (null != var13) {
				var12 += jf.dv(bw.dk_fld, var13.dp(1786067960), var13.dj(189745805), var13.ak(-1897631806));
			}

			var5.as_fld = var12;
			return var5;
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			if (this.ap_fld.av() && this.ap_fld.ae().ar(qa.do_(this.ap_fld, -1615632390), (byte)78)) {
				return true;
			} else {
				ot var1 = ou.ak(this.ab_fld);
				fn var2 = ot.mm(var1, -466863332);
				return var2 != null && var2.cv_fld != null;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getSlope")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSlope() {
		return this.au_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	protected int ae(byte var1) {
		return this.ap_fld.av() ? this.ap_fld.ae().bp_fld * 67262061 : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ao() {
		return this.ap_fld.av() ? this.ap_fld.ae().bp_fld * 67262061 : 0;
	}

	@ObfuscatedName("getX")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	@Override
	public double getX() {
		return this.an_fld;
	}

	@ObfuscatedName("getAnimation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Animation;"
	)
	@Override
	public Animation getAnimation() {
		return this.ap_fld.az_fld;
	}

	@ObfuscatedName("getEndHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getEndHeight() {
		return this.as_fld;
	}

	@ObfuscatedName("getStartPos")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getStartPos() {
		return this.ax_fld;
	}

	@ObfuscatedName("getEndCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getEndCycle() {
		return this.al_fld;
	}

	@ObfuscatedName("getAnimationFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAnimationFrame() {
		return this.ap_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIILfm;)I"
	)
	static int ao(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, fm var9) {
		int var11 = var0 + fm.lx(var9, 1585665713);
		int var12 = var0 + var9.ag(2034198810);
		int var13 = var1 + var9.az(-230572589);
		int var14 = var1 + var9.av((byte)0);
		int var15 = var2 + var9.ae((short)1401);
		int var16 = var2 + var9.ah(-1763450794);
		float var17 = var6 - var3;
		float var18 = var7 - var4;
		float var19 = var8 - var5;
		float var20 = 0.0F;
		float var21 = 1.0F;
		float var22 = 1.0E-9F;
		if (Math.abs(var17) < 1.0E-9F) {
			if (var3 < var11 || var3 > var12) {
				return -1;
			}
		} else {
			float var23 = 1.0F / var17;
			float var24 = var23 * (var11 - var3);
			float var25 = var23 * (var12 - var3);
			if (var24 > var25) {
				float var26 = var24;
				var24 = var25;
				var25 = var26;
			}

			var20 = Math.max(var20, var24);
			var21 = Math.min(var21, var25);
			if (var20 > var21) {
				return -1;
			}
		}

		if (Math.abs(var18) < 1.0E-9F) {
			if (var4 < var13 || var4 > var14) {
				return -1;
			}
		} else {
			float var28 = 1.0F / var18;
			float var31 = var28 * (var13 - var4);
			float var34 = (var14 - var4) * var28;
			if (var31 > var34) {
				float var37 = var31;
				var31 = var34;
				var34 = var37;
			}

			var20 = Math.max(var20, var31);
			var21 = Math.min(var21, var34);
			if (var20 > var21) {
				return -1;
			}
		}

		if (Math.abs(var19) < 1.0E-9F) {
			if (var5 < var15 || var5 > var16) {
				return -1;
			}
		} else {
			float var29 = 1.0F / var19;
			float var32 = var29 * (var15 - var5);
			float var35 = (var16 - var5) * var29;
			if (var32 > var35) {
				float var38 = var32;
				var32 = var35;
				var35 = var38;
			}

			var20 = Math.max(var20, var32);
			var21 = Math.min(var21, var35);
			if (var20 > var21) {
				return -1;
			}
		}

		float var30 = var3 + var17 * var20;
		float var33 = var4 + var18 * var20;
		float var36 = var5 + var20 * var19;
		return (int)Math.sqrt(var30 * var30 + var33 * var33 + var36 * var36);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean ar(int var0) {
		return var0 > 0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V"
	)
	static final void bv(int var0, int var1, int var2, byte var3) {
		if (ke.jd_fld < var0) {
			ke.jd_fld = ke.jd_fld + (ml.ob_fld + (var0 - ke.jd_fld) * sp.oc_fld / 1000) * -1242416717;
			if (ke.jd_fld > var0) {
				ke.jd_fld = var0;
			}
		}

		if (ke.jd_fld > var0) {
			ke.jd_fld = ke.jd_fld - (ml.ob_fld + (ke.jd_fld - var0) * sp.oc_fld / 1000) * -1242416717;
			if (ke.jd_fld < var0) {
				if (var3 <= 1) {
					return;
				}

				ke.jd_fld = var0;
			}
		}

		if (cs.jy_fld < var1) {
			if (var3 <= 1) {
				return;
			}

			cs.jy_fld = cs.jy_fld + (sp.oc_fld * (var1 - cs.jy_fld) / 1000 + ml.ob_fld) * -942740307;
			if (cs.jy_fld > var1) {
				cs.jy_fld = var1;
			}
		}

		if (cs.jy_fld > var1) {
			cs.jy_fld = cs.jy_fld - (sp.oc_fld * (cs.jy_fld - var1) / 1000 + ml.ob_fld) * -942740307;
			if (cs.jy_fld < var1) {
				cs.jy_fld = var1;
			}
		}

		if (gk.jc_fld < var2) {
			gk.jc_fld = gk.jc_fld + (ml.ob_fld + (var2 - gk.jc_fld) * sp.oc_fld / 1000) * 914526953;
			if (gk.jc_fld > var2) {
				gk.jc_fld = var2;
			}
		}

		if (gk.jc_fld > var2) {
			gk.jc_fld = gk.jc_fld - 914526953 * (ml.ob_fld + sp.oc_fld * (gk.jc_fld - var2) / 1000);
			if (gk.jc_fld < var2) {
				gk.jc_fld = var2;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean ab(int var0) {
		return var0 > 0;
	}

	bc(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) throws EOFException {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = var6;
		this.aw_fld = var7;
		this.ay_fld = var8;
		this.as_fld = var9;
		this.ar_fld = var10;
		this.ab_fld = var11;
		this.af_fld = var12;
		this.al_fld = var13;
		this.au_fld = var14;
		this.ax_fld = var15;
		qa.ju(this.ap_fld, ou.ak(this.ab_fld).ai_fld * 158714689, -1150821601);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aj(int var1, int var2) {
		this.ag_fld += 378124001 * var1;
		this.az_fld += 1935771659 * var2;
		this.aw_fld += 533247549 * var1;
		this.ay_fld += -1793572913 * var2;
		this.an_fld = this.an_fld + kj.aw(var1);
		this.aa_fld = this.aa_fld + kj.aw(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ac(int var1, int var2) {
		this.ag_fld += 551220164 * var1;
		this.az_fld += -1992156527 * var2;
		this.aw_fld += 533247549 * var1;
		this.ay_fld += -1793572913 * var2;
		this.an_fld = this.an_fld + kj.aw(var1);
		this.aa_fld = this.aa_fld + kj.aw(var2);
	}

	@ObfuscatedName("getSourcePoint")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getSourcePoint() {
		return new WorldPoint(this.ag_fld, this.az_fld, this.ak_fld);
	}

	@ObfuscatedName("getStartCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getStartCycle() {
		return this.af_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V"
	)
	void bm(cx var1, int var2, int var3) {
		try {
			if (var2 >= this.af_fld) {
				tu var4 = ah.ay(this.ar_fld, this.aw_fld, this.ay_fld, this.ah_fld, var1);
				int var5 = (int)var4.ay_fld;
				int var6 = (int)var4.ar_fld;
				int var7 = (int)var4.as_fld - this.as_fld;
				var4.ah();
				if (!this.ad_fld) {
					tu var8 = ah.ay(this.ae_fld, this.ag_fld, this.az_fld, this.ak_fld, var1);
					int var9 = (int)var8.ay_fld;
					int var10 = (int)var8.ar_fld;
					int var11 = (int)var8.as_fld - this.av_fld;
					var8.ah();
					double var12 = var5 - var9;
					double var14 = var6 - var10;
					double var16 = Math.sqrt(var12 * var12 + var14 * var14);
					this.an_fld = Math.abs(var16) < 0.01F ? var9 : var9 + this.ax_fld * var12 / var16;
					this.aa_fld = Math.abs(var16) < 0.01F ? var10 : var10 + this.ax_fld * var14 / var16;
					this.ai_fld = var11;
				}

				double var20 = 1 + this.al_fld - var2;
				double var21 = (var5 - this.an_fld) / var20;
				double var22 = (var6 - this.aa_fld) / var20;
				double var23 = Math.sqrt(var21 * var21 + var22 * var22);
				if (!this.ad_fld) {
					this.ao_fld = -var23 * Math.tan(0.02454369 * this.au_fld);
				}

				double var24 = 2.0 * (var7 - this.ai_fld - this.ao_fld * var20) / (var20 * var20);
				this.ad_fld = true;
				this.an_fld += var21 * var3;
				this.aa_fld += var22 * var3;
				this.ai_fld = this.ai_fld + (this.ao_fld * var3 + var3 * (var3 * (0.5 * var24)));
				this.ao_fld += var3 * var24;
				this.aq_fld = (int)(Math.atan2(var21, var22) * 325.949) + 1024 & 2047;
				this.am_fld = (int)(Math.atan2(this.ao_fld, var23) * 325.949) & 2047;
				jm.kr_fld.av(bw.dk_fld, (int)this.an_fld, (int)this.aa_fld, false);
				cf.ak(this.ap_fld, var3, jm.kr_fld);
				jm.kr_fld.ae(2010182198);
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("getY1")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getY1() {
		return LocalPoint.fromWorld(bw.dk_fld, this.ag_fld, this.az_fld).getY();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V"
	)
	void bd(cx var1, int var2, int var3) {
		try {
			if (var2 >= this.af_fld) {
				tu var4 = ah.ay(this.ar_fld, 1653292518 * this.aw_fld, this.ay_fld, this.ah_fld, var1);
				int var5 = (int)var4.ay_fld;
				int var6 = (int)var4.ar_fld;
				int var7 = (int)var4.as_fld - this.as_fld;
				var4.ah();
				if (!this.ad_fld) {
					tu var8 = ah.ay(this.ae_fld * 245197958, this.ag_fld, this.az_fld, this.ak_fld * 174088255, var1);
					int var9 = (int)var8.ay_fld;
					int var10 = (int)var8.ar_fld;
					int var11 = (int)var8.as_fld - this.av_fld;
					var8.ah();
					double var12 = var5 - var9;
					double var14 = var6 - var10;
					double var16 = Math.sqrt(var12 * var12 + var14 * var14);
					this.an_fld = Math.abs(var16) < 0.01F ? var9 : var9 + this.ax_fld * 2045606151 * var12 / var16;
					this.aa_fld = Math.abs(var16) < 0.01F ? var10 : var10 + this.ax_fld * -1941479940 * var14 / var16;
					this.ai_fld = var11;
				}

				double var20 = 1 + this.al_fld - var2;
				double var21 = (var5 - this.an_fld) / var20;
				double var22 = (var6 - this.aa_fld) / var20;
				double var23 = Math.sqrt(var21 * var21 + var22 * var22);
				if (!this.ad_fld) {
					this.ao_fld = -var23 * Math.tan(0.02454369 * (this.au_fld * -747020344));
				}

				double var24 = 2.0 * (var7 - this.ai_fld - this.ao_fld * var20) / (var20 * var20);
				this.ad_fld = true;
				this.an_fld += var21 * var3;
				this.aa_fld += var22 * var3;
				this.ai_fld = this.ai_fld + (this.ao_fld * var3 + var3 * (var3 * (0.5 * var24)));
				this.ao_fld += var3 * var24;
				this.aq_fld = ((int)(Math.atan2(var21, var22) * 325.949) + 1024 & 2047) * -1568693269;
				this.am_fld = ((int)(Math.atan2(this.ao_fld, var23) * 325.949) & -1001824047) * 1564534422;
				jm.kr_fld.av(bw.dk_fld, (int)this.an_fld, (int)this.aa_fld, false);
				cf.ak(this.ap_fld, var3, jm.kr_fld);
				jm.kr_fld.ae(2018412150);
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static boolean as(int var0) {
		return var0 > 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V"
	)
	void br(cx var1, int var2, int var3) {
		try {
			if (var2 >= this.af_fld) {
				tu var4 = ah.ay(this.ar_fld, this.aw_fld, this.ay_fld, this.ah_fld, var1);
				int var5 = (int)var4.ay_fld;
				int var6 = (int)var4.ar_fld;
				int var7 = (int)var4.as_fld - this.as_fld;
				var4.ah();
				if (!this.ad_fld) {
					tu var8 = ah.ay(this.ae_fld, this.ag_fld, this.az_fld, this.ak_fld, var1);
					int var9 = (int)var8.ay_fld;
					int var10 = (int)var8.ar_fld;
					int var11 = (int)var8.as_fld - this.av_fld;
					var8.ah();
					double var12 = var5 - var9;
					double var14 = var6 - var10;
					double var16 = Math.sqrt(var12 * var12 + var14 * var14);
					this.an_fld = Math.abs(var16) < 0.01F ? var9 : var9 + this.ax_fld * var12 / var16;
					this.aa_fld = Math.abs(var16) < 0.01F ? var10 : var10 + this.ax_fld * var14 / var16;
					this.ai_fld = var11;
				}

				double var20 = 1 + this.al_fld - var2;
				double var21 = (var5 - this.an_fld) / var20;
				double var22 = (var6 - this.aa_fld) / var20;
				double var23 = Math.sqrt(var21 * var21 + var22 * var22);
				if (!this.ad_fld) {
					this.ao_fld = -var23 * Math.tan(0.02454369 * this.au_fld);
				}

				double var24 = 2.0 * (var7 - this.ai_fld - this.ao_fld * var20) / (var20 * var20);
				this.ad_fld = true;
				this.an_fld += var21 * var3;
				this.aa_fld += var22 * var3;
				this.ai_fld = this.ai_fld + (this.ao_fld * var3 + var3 * (var3 * (0.5 * var24)));
				this.ao_fld += var3 * var24;
				this.aq_fld = (int)(Math.atan2(var21, var22) * 325.949) + 1024 & 2047;
				this.am_fld = (int)(Math.atan2(this.ao_fld, var23) * 325.949) & 2047;
				jm.kr_fld.av(bw.dk_fld, (int)this.an_fld, (int)this.aa_fld, false);
				cf.ak(this.ap_fld, var3, jm.kr_fld);
				jm.kr_fld.ae(2030760900);
			}
		} catch (Throwable var19) {
			throw new RuntimeException(var19);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIIILcx;)Ltu;"
	)
	static tu be(int var0, int var1, int var2, int var3, cx var4) throws EOFException {
		try {
			tu var5 = null;
			dx var6 = null;
			boolean var7 = 0 != var0;
			if (var7) {
				Object var8;
				if (ux.ak(var0)) {
					int var9 = qs.ag(var0);
					var6 = pd.ag(var9, var4);
					var8 = (da)var6.ax_fld.ak(var9);
				} else {
					int var18 = -var0 - 1;
					var6 = kx.ak(var18, var4);
					var8 = dx.ii(var6, var18);
				}

				if (null != var8) {
					kj var19 = ((da)var8).es(var6, (byte)92);
					tu var10;
					synchronized (tu.ae_fld) {
						if (0 == tu.aw_fld) {
							var10 = new tu();
						} else {
							tu.ae_fld[(tu.aw_fld -= -779610390) * -1635584687].as();
							var10 = tu.ae_fld[tu.aw_fld];
						}
					}

					var5 = var10;
					var10.ay_fld = var19.ag_fld;
					var10.ar_fld = var19.az_fld;
				}
			}

			if (null == var5) {
				var6 = var4.aw(var1, var2, -1925091775);
				int var17 = var1 - var6.ay_fld;
				int var20 = var2 - var6.as_fld;
				rg var21 = (rg)var4.ah(-225377813).an_fld.ak(var6.ag_fld);
				if (var21 != null) {
					var5 = rg.ql(var21, kj.as(var17), kj.as(var20));
				} else {
					var5 = sh.ak(kj.as(var17), 0.0F, kj.as(var20));
				}
			}

			int var22 = (int)var5.ay_fld;
			int var23 = (int)var5.ar_fld;
			int var12 = jf.dv(var6, var22, var23, var3);
			rg var13 = (rg)bw.dk_fld.an_fld.ak(-1654916745 * var6.ag_fld);
			if (null != var13) {
				var12 += jf.dv(bw.dk_fld, var13.dp(-1900719268), var13.dj(189745805), var13.ak(-1287511525));
			}

			var5.as_fld = var12;
			return var5;
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("getSourceLevel")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSourceLevel() {
		return this.ak_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ad() {
		return this.ap_fld.av() ? this.ap_fld.ae().bp_fld * 67262061 : 0;
	}

	@ObfuscatedName("getTargetPoint")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/WorldPoint;"
	)
	@Override
	public WorldPoint getTargetPoint() {
		return new WorldPoint(this.aw_fld, this.ay_fld, this.ah_fld);
	}

	@ObfuscatedName("getOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOrientation() {
		return this.aq_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIILcx;)Ltu;"
	)
	static tu bs(int var0, int var1, int var2, int var3, cx var4) throws EOFException {
		try {
			tu var5 = null;
			dx var6 = null;
			boolean var7 = 0 != var0;
			if (var7) {
				Object var8;
				if (ux.ak(var0)) {
					int var9 = qs.ag(var0);
					var6 = pd.ag(var9, var4);
					var8 = (da)var6.ax_fld.ak(var9);
				} else {
					int var18 = -var0 - 1;
					var6 = kx.ak(var18, var4);
					var8 = dx.ii(var6, var18);
				}

				if (null != var8) {
					kj var19 = ((da)var8).es(var6, (byte)71);
					tu var10;
					synchronized (tu.ae_fld) {
						if (0 == tu.aw_fld) {
							var10 = new tu();
						} else {
							tu.ae_fld[(tu.aw_fld -= 1568129921) * 234126465].as();
							var10 = tu.ae_fld[tu.aw_fld];
						}
					}

					var5 = var10;
					var10.ay_fld = var19.ag_fld;
					var10.ar_fld = var19.az_fld;
				}
			}

			if (null == var5) {
				var6 = var4.aw(var1, var2, -2022684817);
				int var17 = var1 - var6.ay_fld;
				int var20 = var2 - var6.as_fld;
				rg var21 = (rg)var4.ah(-225377813).an_fld.ak(var6.ag_fld);
				if (var21 != null) {
					var5 = rg.ql(var21, kj.as(var17), kj.as(var20));
				} else {
					var5 = sh.ak(kj.as(var17), 0.0F, kj.as(var20));
				}
			}

			int var22 = (int)var5.ay_fld;
			int var23 = (int)var5.ar_fld;
			int var12 = jf.dv(var6, var22, var23, var3);
			rg var13 = (rg)bw.dk_fld.an_fld.ak(var6.ag_fld);
			if (null != var13) {
				var12 += jf.dv(bw.dk_fld, var13.dp(-1027239621), var13.dj(189745805), var13.ak(-1505737834));
			}

			var5.as_fld = var12;
			return var5;
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	static void ay(xi var0, byte var1) {
		while (true) {
			int var2 = xi.tx(var0, 1287424361);
			if (0 == var2) {
				if (var1 == 1) {
					return;
				}
			} else {
				if (1 != var2) {
					if (var2 <= 49) {
						var0.cz();
					}
					continue;
				}

				if (var1 == 1) {
					return;
				}

				var0.cg();
			}

			return;
		}
	}

	@ObfuscatedName("getTarget")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getTarget() {
		return LocalPoint.fromWorld(bw.dk_fld, this.aw_fld, this.ay_fld);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			if (this.ap_fld.av() && this.ap_fld.ae().ar(qa.do_(this.ap_fld, -1204396551), (byte)65)) {
				return true;
			} else {
				ot var1 = ou.ak(this.ab_fld);
				fn var2 = ot.mm(var1, 1313172167);
				return var2 != null && var2.cv_fld != null;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIII)Lcs;"
	)
	static final cs et(dx var0, int var1, int var2, int var3, int var4) {
		for (cs var6 = (cs)var0.ai_fld.aw(); var6 != null; var6 = (cs)var0.ai_fld.as()) {
			if (var6.ag_fld == var1 && var2 == var6.av_fld && var6.ae_fld == var3 && var6.az_fld == var4) {
				return var6;
			}
		}

		return null;
	}
}
