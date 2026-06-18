import java.io.EOFException;
import net.runelite.api.ActorSpotAnim;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rq")
@Implements({"ActorSpotAnim"})
public class rq extends em implements ActorSpotAnim {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bz_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	public qa ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -982125955
	)
	public int ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String au_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	da ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1978294967
	)
	public int az_fld = -1027742471;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 148355747
	)
	int av_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(JIII)J"
	)
	public static long aw(long var0, int var2, int var3) {
		long var5 = ub.ak(var3 - var2 + 1, -1793925999);
		var5 <<= var2;
		return var0 | var5;
	}

	@ObfuscatedName("setHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setHeight")
	@Override
	public void setHeight(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn ax() {
		try {
			if (this.ae_fld == null) {
				return null;
			} else if (client.dv_fld < this.ak_fld) {
				return null;
			} else if (this.ag_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(-1142490094 * this.az_fld);
				fn var2 = var1.ae(this.ag_fld.aw(-1159308246));
				if (null == var2) {
					return null;
				} else {
					var2.ce(-this.av_fld);
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					var2.gj(this.ae_fld.be(-117304951), (short)var2.ke_fld);
					var2.gu(this.ae_fld.bs(-1073773374));
					var2.ce(this.ae_fld.bh(-31775092));
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	protected int ae(byte var1) {
		try {
			return this.ae_fld.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			if (null == this.ae_fld) {
				return false;
			} else if (client.dv_fld < this.ak_fld) {
				return false;
			} else if (qa.jv(this.ag_fld, 818567523) && qa.kw(this.ag_fld, -1543446968).ar(this.ag_fld.aw(-1531196546), (byte)76)) {
				return true;
			} else {
				fn var1 = ot.nc(ou.ak(this.az_fld), -809422406);
				return var1 != null && null != var1.cv_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Lda;II)V"
	)
	public static void ia(da var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.cg_fld.ae(var1, var2, -1106240719);
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	static final void gh(double var0) {
		fc.az(var0);
		((eu)fc.ar_fld.aq_fld).ax(var0);
		if (ca.px_fld != null) {
			ca.px_fld.ao((byte)20);
		}

		mn.av();
		cx.kq_fld.ai(var0);
	}

	public rq(int var1, int var2, int var3, da var4) throws EOFException {
		this.ag_fld = new qa();
		this.ak_fld = 0;
		this.av_fld = 0;
		this.az_fld = var1;
		this.av_fld = var2;
		this.ak_fld = var3;
		this.ae_fld = var4;
		if (this.az_fld >= 0) {
			qa.hs(this.ag_fld, ou.ak(this.az_fld).ai_fld * 158714689, -2044211288);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			if (this.ae_fld == null) {
				return null;
			} else if (client.dv_fld < this.ak_fld) {
				return null;
			} else if (this.ag_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.az_fld);
				fn var2 = var1.ae(this.ag_fld.aw(-728002383));
				if (null == var2) {
					return null;
				} else {
					var2.ce(-this.av_fld);
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					var2.gj(this.ae_fld.be(-1764098559), (short)var2.ke_fld);
					var2.gu(this.ae_fld.bs(-1073773374));
					var2.ce(this.ae_fld.bh(-31775092));
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn al() {
		try {
			if (this.ae_fld == null) {
				return null;
			} else if (client.dv_fld < this.ak_fld) {
				return null;
			} else if (this.ag_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.az_fld);
				fn var2 = var1.ae(this.ag_fld.aw(-143676335));
				if (null == var2) {
					return null;
				} else {
					var2.ce(-this.av_fld);
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					var2.gj(this.ae_fld.be(-561100680), (short)var2.ke_fld);
					var2.gu(this.ae_fld.bs(-1073773374));
					var2.ce(this.ae_fld.bh(-31775092));
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			if (this.ae_fld == null) {
				return null;
			} else if (client.dv_fld < this.ak_fld) {
				return null;
			} else if (this.ag_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.az_fld);
				fn var2 = var1.ae(this.ag_fld.aw(-1771384501));
				if (null == var2) {
					return null;
				} else {
					var2.ce(-(this.av_fld * 2053059635));
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					var2.gj(this.ae_fld.be(-778244749), (short)var2.ke_fld);
					var2.gu(this.ae_fld.bs(-1073773374));
					var2.ce(this.ae_fld.bh(-31775092));
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("getCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getCycle")
	@Override
	public int getCycle() {
		return this.ag_fld.av_fld * 1668710195;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			if (this.ae_fld == null) {
				return null;
			} else if (client.dv_fld < this.ak_fld) {
				return null;
			} else if (this.ag_fld.ax(30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.az_fld);
				fn var2 = var1.ae(this.ag_fld.aw(-1231191735));
				if (null == var2) {
					return null;
				} else {
					var2.ce(-this.av_fld);
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					var2.gj(this.ae_fld.be(-1102882614), (short)var2.ke_fld);
					var2.gu(this.ae_fld.bs(-1073773374));
					var2.ce(this.ae_fld.bh(-31775092));
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("setCycle")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setCycle")
	@Override
	public void setCycle(int var1) {
		this.ag_fld.av_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			if (null == this.ae_fld) {
				return false;
			} else if (client.dv_fld < this.ak_fld) {
				return false;
			} else if (qa.jv(this.ag_fld, 1417371311) && qa.kw(this.ag_fld, -525072712).ar(this.ag_fld.aw(-1367295922), (byte)103)) {
				return true;
			} else {
				fn var1 = ot.nc(ou.ak(this.az_fld), -1161547696);
				return var1 != null && null != var1.cv_fld;
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
			if (null == this.ae_fld) {
				return false;
			} else if (client.dv_fld < this.ak_fld) {
				return false;
			} else if (qa.jv(this.ag_fld, -400363954) && qa.kw(this.ag_fld, 393237800).ar(this.ag_fld.aw(-1453112016), (byte)19)) {
				return true;
			} else {
				fn var1 = ot.nc(ou.ak(this.az_fld), -809567135);
				return var1 != null && null != var1.cv_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.az_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ah() {
		try {
			return ou.ak(this.az_fld).aw(2087667896);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ao() {
		try {
			return this.ae_fld.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ad_int() {
		try {
			return this.ae_fld.ae((byte)-1);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getStartCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getStartCycle")
	@Override
	public int getStartCycle() {
		return this.ak_fld;
	}

	@ObfuscatedName("getFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getFrame")
	@Override
	public int getFrame() {
		return this.ag_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			if (null == this.ae_fld) {
				return false;
			} else if (client.dv_fld < this.ak_fld) {
				return false;
			} else if (qa.jv(this.ag_fld, -208142640) && qa.kw(this.ag_fld, -93414468).ar(this.ag_fld.aw(-91962256), (byte)113)) {
				return true;
			} else {
				fn var2 = ot.nc(ou.ak(this.az_fld), -1379476444);
				return var2 != null && null != var2.cv_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lgn;)I"
	)
	public static int mv(gn var0) {
		return var0.by_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aw() {
		try {
			return ou.ak(this.az_fld).aw(-2133074518);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			int var2 = this.ag_fld.ae_fld * 249909987;
			if (var2 != -1 && client.bz_java_util_function_IntPredicate != null && client.bz_java_util_function_IntPredicate.test(this.ag_fld.ag_fld * 163458875)) {
				this.ag_fld.ae_fld = -2147483648 | Math.max(this.ag_fld.av_fld * 1668710195 - 1, 0) << 16 | var2;
			}

			fn var3;
			try {
				int var6 = -178304394;
				fn var10000;
				if (this.ae_fld == null) {
					Object var5 = null;
					var10000 = (fn)var5;
				} else if (client.dv_fld < this.ak_fld) {
					Object var13 = null;
					var10000 = (fn)var13;
				} else if (this.ag_fld.ax(30)) {
					Object var14 = null;
					var10000 = (fn)var14;
				} else {
					ot var7 = ou.ak(this.az_fld);
					fn var8 = var7.ae(this.ag_fld.aw(1506555292));
					if (null == var8) {
						Object var15 = null;
						var10000 = (fn)var15;
					} else {
						var8.ce(-this.av_fld);
						if (this.ae_fld.ed((byte)1) == 1) {
							var8.cw_fld = true;
						}

						var8.gj(this.ae_fld.be(-402314115), (short)var8.ke_fld);
						var8.gu(this.ae_fld.bs(-1073773374));
						var8.ce(this.ae_fld.bh(-31775092));
						var10000 = var8;
					}
				}

				var3 = var10000;
			} finally {
				this.ag_fld.ae_fld = var2;
			}

			return var3;
		} catch (Throwable var12) {
			throw new RuntimeException(var12);
		}
	}

	@ObfuscatedName("setFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setFrame")
	@Override
	public void setFrame(int var1) {
		this.ag_fld.ae_fld = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ag() {
		try {
			return ou.ak(1324813523 * this.az_fld).aw(-1243529450);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHeight")
	@Override
	public int getHeight() {
		return this.av_fld;
	}

	@ObfuscatedName("setStartCycle")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setStartCycle")
	@Override
	public void setStartCycle(int var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("setId")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setId")
	@Override
	public void setId(int var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)Z"
	)
	public static boolean ob(rq var0, byte var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return ou.ak(var0.az_fld).aw(131656774);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean ak(byte var1) {
		try {
			return ou.ak(1978294967 * this.ak_fld).aw(131656774);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}
}
