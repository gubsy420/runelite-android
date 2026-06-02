import java.io.EOFException;
import net.runelite.api.ActorSpotAnim;
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
	@ObfuscatedGetter(
		intValue = -982125955
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld;
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
	@ObfuscatedGetter(
		intValue = 1978294967
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld = -1027742471;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;
	@ObfuscatedGetter(
		intValue = 148355747
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(JII)J"
	)
	public static long aw(long var0, int var2, int var3) {
		long var5 = ub.ak(var3 - var2 + 1, -1793925999);
		var5 <<= var2;
		return var0 | var5;
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
			} else if (client.dv_fld < this.az_fld) {
				return null;
			} else if (qa.jo(this.ag_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(-1142490094 * this.ak_fld);
				fn var2 = var1.ae(qa.do_(this.ag_fld, -1159308246), 708533907);
				if (null == var2) {
					return null;
				} else {
					var2.bx(-this.av_fld);
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					fn.li(var2, this.ae_fld.be(-117304951), (short)var2.bw_fld);
					fn.uv(var2, this.ae_fld.bs(-1073773374));
					var2.bx(this.ae_fld.bh(-31775092));
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

	@ObfuscatedName("setCycle")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setCycle(int var1) {
		this.ag_fld.av_fld = var1;
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
			} else if (client.dv_fld < this.az_fld) {
				return false;
			} else if (this.ag_fld.av() && this.ag_fld.ae().ar(qa.do_(this.ag_fld, -1531196546), (byte)76)) {
				return true;
			} else {
				fn var1 = ot.mm(ou.ak(this.ak_fld), -809422406);
				return var1 != null && null != var1.cv_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	static final void gh(double var0) {
		fc.az(var0);
		((eu)fc.ar_fld.aq_fld).ag(var0);
		if (ca.px_fld != null) {
			wl.th(ca.px_fld, (byte)20);
		}

		mn.av();
		cx.kq_fld.ai(var0);
	}

	@ObfuscatedName("setFrame")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setFrame(int var1) {
		this.ag_fld.ae_fld = var1;
	}

	public rq(int var1, int var2, int var3, da var4) throws EOFException {
		this.ag_fld = new qa();
		this.az_fld = 0;
		this.av_fld = 0;
		this.ak_fld = var1;
		this.av_fld = var2;
		this.az_fld = var3;
		this.ae_fld = var4;
		if (this.ak_fld >= 0) {
			qa.ju(this.ag_fld, ou.ak(this.ak_fld).ai_fld * 158714689, -2044211288);
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
			} else if (client.dv_fld < this.az_fld) {
				return null;
			} else if (qa.jo(this.ag_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ak_fld);
				fn var2 = var1.ae(qa.do_(this.ag_fld, -728002383), 572438483);
				if (null == var2) {
					return null;
				} else {
					var2.bx(-this.av_fld);
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					fn.li(var2, this.ae_fld.be(-1764098559), (short)var2.bw_fld);
					fn.uv(var2, this.ae_fld.bs(-1073773374));
					var2.bx(this.ae_fld.bh(-31775092));
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
			} else if (client.dv_fld < this.az_fld) {
				return null;
			} else if (qa.jo(this.ag_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ak_fld);
				fn var2 = var1.ae(qa.do_(this.ag_fld, -143676335), 1772033900);
				if (null == var2) {
					return null;
				} else {
					var2.bx(-this.av_fld);
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					fn.li(var2, this.ae_fld.be(-561100680), (short)var2.bw_fld);
					fn.uv(var2, this.ae_fld.bs(-1073773374));
					var2.bx(this.ae_fld.bh(-31775092));
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
			} else if (client.dv_fld < this.az_fld) {
				return null;
			} else if (qa.jo(this.ag_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ak_fld);
				fn var2 = var1.ae(qa.do_(this.ag_fld, -1771384501), 755042457);
				if (null == var2) {
					return null;
				} else {
					var2.bx(-(this.av_fld * 2053059635));
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					fn.li(var2, this.ae_fld.be(-778244749), (short)var2.bw_fld);
					fn.uv(var2, this.ae_fld.bs(-1073773374));
					var2.bx(this.ae_fld.bh(-31775092));
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
			if (this.ae_fld == null) {
				return null;
			} else if (client.dv_fld < this.az_fld) {
				return null;
			} else if (qa.jo(this.ag_fld, 30)) {
				return null;
			} else {
				ot var1 = ou.ak(this.ak_fld);
				fn var2 = var1.ae(qa.do_(this.ag_fld, -1231191735), 1942637814);
				if (null == var2) {
					return null;
				} else {
					var2.bx(-this.av_fld);
					if (this.ae_fld.ed((byte)1) == 1) {
						var2.cw_fld = true;
					}

					fn.li(var2, this.ae_fld.be(-1102882614), (short)var2.bw_fld);
					fn.uv(var2, this.ae_fld.bs(-1073773374));
					var2.bx(this.ae_fld.bh(-31775092));
					return var2;
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
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
			} else if (client.dv_fld < this.az_fld) {
				return false;
			} else if (this.ag_fld.av() && this.ag_fld.ae().ar(qa.do_(this.ag_fld, -1367295922), (byte)103)) {
				return true;
			} else {
				fn var1 = ot.mm(ou.ak(this.ak_fld), -1161547696);
				return var1 != null && null != var1.cv_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getStartCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getStartCycle() {
		return this.az_fld;
	}

	@ObfuscatedName("setId")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setId(int var1) {
		this.ak_fld = var1;
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
			} else if (client.dv_fld < this.az_fld) {
				return false;
			} else if (this.ag_fld.av() && this.ag_fld.ae().ar(qa.do_(this.ag_fld, -1453112016), (byte)19)) {
				return true;
			} else {
				fn var1 = ot.mm(ou.ak(this.ak_fld), -809567135);
				return var1 != null && null != var1.cv_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("setStartCycle")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setStartCycle(int var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("getHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHeight() {
		return this.av_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ah() {
		try {
			return ou.ak(this.ak_fld).aw();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.ak_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ad() {
		try {
			return this.ae_fld.ae((byte)-1);
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

	@ObfuscatedName("getFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getFrame() {
		return this.ag_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("getCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getCycle() {
		return this.ag_fld.av_fld * 1668710195;
	}

	@ObfuscatedName("setHeight")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setHeight(int var1) {
		this.av_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean ak(byte var1) {
		try {
			return ou.ak(this.ak_fld).aw();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
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
			} else if (client.dv_fld < this.az_fld) {
				return false;
			} else if (this.ag_fld.av() && this.ag_fld.ae().ar(qa.do_(this.ag_fld, -91962256), (byte)113)) {
				return true;
			} else {
				fn var2 = ot.mm(ou.ak(this.ak_fld), -1379476444);
				return var2 != null && null != var2.cv_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lrq;)Z"
	)
	public static boolean fq(rq var0) throws EOFException {
		try {
			return ou.ak(1324813523 * var0.ak_fld).aw();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aw() {
		try {
			return ou.ak(this.ak_fld).aw();
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean ee(ev var0, int var1, int var2, int var3, int var4) {
		return ev.aq(var0, var0.ed_fld, var1, var2, var3, var4);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			int var2 = this.ag_fld.ae_fld * 249909987;
			if (var2 != -1 && client.xg_fld != null && client.xg_fld.test(this.ag_fld.ag_fld * 163458875)) {
				this.ag_fld.ae_fld = -2147483648 | Math.max(this.ag_fld.av_fld * 1668710195 - 1, 0) << 16 | var2;
			}

			fn var3;
			try {
				int var6 = -178304394;
				fn var10000;
				if (this.ae_fld == null) {
					Object var5 = null;
					var10000 = (fn)var5;
				} else if (client.dv_fld < this.az_fld) {
					Object var13 = null;
					var10000 = (fn)var13;
				} else if (qa.jo(this.ag_fld, 30)) {
					Object var14 = null;
					var10000 = (fn)var14;
				} else {
					ot var7 = ou.ak(this.ak_fld);
					fn var8 = var7.ae(qa.do_(this.ag_fld, 1506555292), 677503036);
					if (null == var8) {
						Object var15 = null;
						var10000 = (fn)var15;
					} else {
						var8.bx(-this.av_fld);
						if (this.ae_fld.ed((byte)1) == 1) {
							var8.cw_fld = true;
						}

						fn.li(var8, this.ae_fld.be(-402314115), (short)var8.bw_fld);
						fn.uv(var8, this.ae_fld.bs(-1073773374));
						var8.bx(this.ae_fld.bh(-31775092));
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
}
