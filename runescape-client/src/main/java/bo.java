import net.runelite.api.Friend;
import net.runelite.api.Ignore;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.RemovedFriend;

@ObfuscatedName("bo")
public class bo {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lzo;"
	)
	zo av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = 1141258743
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld = 0;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	public ro ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public re ah_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedGetter(
		intValue = 1683256539
	)
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int id_fld;
	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String lf_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ao_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V"
	)
	public final void am(String var1, boolean var2, int var3) {
		this.ze(var1, var2);
		if (var1 == null) {
			if (var3 == -1524373658) {
				;
			}
		} else {
			aax var4 = new aax(var1, this.av_fld);
			if (var4.az(1004146027)) {
				if (this.ah_fld.bi(var4, -2028548492)) {
					pi.sq(client.ck_fld, (byte)31);
					if (var2) {
						jm var5 = gi.ak(jb.ay_fld, client.aq_fld.av_fld);
						var5.ay_fld.bc(iq.bu(var1));
						var5.ay_fld.cc(var1, -330547344);
						client.aq_fld.az(var5);
					}
				}

				oh.gy(-1819596118);
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bl() {
		for (rd var1 = (rd)this.ae_fld.av_fld.ag(); null != var1; var1 = (rd)np.py(this.ae_fld.av_fld)) {
			if (var1.ak_fld * 1400815767 < lz.ak() / 1000L - 5L) {
				if (var1.az_fld > 0) {
					io.ag(5, "", var1.ag_fld + kh.gb_fld);
				}

				if (0 == var1.az_fld) {
					io.ag(5, "", var1.ag_fld + kh.gl_fld);
				}

				var1.ak();
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void ay() {
		this.aw_fld = 1018845127;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void cq(String var1) {
		if (null != var1) {
			aax var2 = new aax(var1, this.av_fld);
			if (var2.az(1004146027)) {
				if (this.ae_fld.bi(var2, -2095967975)) {
					pi.sq(client.ck_fld, (byte)55);
					jm var3 = gi.ak(jb.ap_fld, client.aq_fld.av_fld);
					var3.ay_fld.bc(iq.bu(var1));
					var3.ay_fld.cc(var1, 1694246247);
					client.aq_fld.az(var3);
				}

				is.gd(-1909330358);
			}
		}
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Lbo;Laax;)Z"
	)
	public static boolean wo(bo var0, aax var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return null == var1 ? false : var0.ah_fld.bo(var1, 1812385302);
		}
	}

	@ObfuscatedName("ze")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Z)V"
	)
	public void ze(String var1, boolean var2) {
		Ignore var3 = (Ignore)this.hj().findByName(var1);
		if (var3 != null) {
			og.ci_fld.getCallbacks().post(new RemovedFriend(var3));
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void af() {
		this.aw_fld = 0;
		rc.ns(this.ae_fld, (byte)0);
		rc.ns(this.ah_fld, (byte)0);
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lbo;Ljava/lang/String;)V"
	)
	public static void oj(bo var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			aax var2 = new aax(var1, var0.av_fld);
			if (var2.az(1004146027)) {
				if (var0.an()) {
					xh.ak(kh.ha_fld);
				} else {
					aax var3 = og.ci_fld.jn((byte)-14);
					if (var3 != null && var3.equals(var2)) {
						km.ag();
					} else if (var0.al(var2, false)) {
						xh.ak(var1 + kh.ht_fld);
					} else if (var0.au(var2)) {
						xh.ak(kh.ho_fld + var1 + kh.hm_fld);
					} else {
						jm var4 = gi.ak(jb.dh_fld, client.aq_fld.av_fld);
						var4.ay_fld.bc(iq.bu(var1));
						var4.ay_fld.cc(var1, 1781980823);
						client.aq_fld.az(var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Laax;Z)Z"
	)
	final boolean al(aax var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else {
			return var1.equals(og.ci_fld.jn((byte)-93)) ? true : this.ae_fld.az(var1, var2, (byte)88);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	final boolean au(aax var1) {
		return null == var1 ? false : this.ah_fld.bo(var1, -1110904091);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean an() {
		return this.ae_fld.bx((byte)3) || this.ae_fld.bl(-1440239599) >= 200 && 1 != client.ep_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean ai() {
		return this.ah_fld.bx((byte)113) || this.ah_fld.bl(-1440239599) >= 100 && 1 != client.ep_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void aq(String var1) {
		this.jq(var1);
		if (null != var1) {
			aax var3 = new aax(var1, this.av_fld);
			if (var3.az(1004146027)) {
				if (this.ae_fld.bi(var3, -2042048157)) {
					pi.sq(client.ck_fld, (byte)-47);
					jm var4 = gi.ak(jb.ap_fld, client.aq_fld.av_fld);
					var4.ay_fld.bc(iq.bu(var1));
					var4.ay_fld.cc(var1, 763597432);
					client.aq_fld.az(var4);
				}

				is.gd(-1869522727);
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	final boolean ad(aax var1) {
		rp var3 = (rp)rc.tl(this.ae_fld, var1, -94090974);
		return var3 != null && var3.bl(1023170160);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static final void ao(String var0) {
		io.ag(30, "", var0);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bz() {
		return this.aw_fld == 2;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Z)V"
	)
	public final void cf(String var1, boolean var2) {
		if (var1 != null) {
			aax var3 = new aax(var1, this.av_fld);
			if (var3.az(1004146027)) {
				if (this.ah_fld.bi(var3, -2077478581)) {
					pi.sq(client.ck_fld, (byte)-14);
					if (var2) {
						jm var4 = gi.ak(jb.ay_fld, client.aq_fld.av_fld);
						var4.ay_fld.bc(iq.bu(var1));
						var4.ay_fld.cc(var1, -579164489);
						client.aq_fld.az(var4);
					}
				}

				oh.gy(-1819596118);
			}
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Laax;Z)Z"
	)
	public boolean fn(aax var1, boolean var2) {
		return this.al(var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void at() {
		xh.ak(kh.hx_fld);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static final void ab(String var0) {
		io.ag(30, "", var0);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "()Lre;"
	)
	public re hj() {
		return this.ah_fld;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lbo;Ljava/lang/String;I)V"
	)
	public static void if_(bo var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			aax var3 = new aax(var1, var0.av_fld);
			if (var3.az(1004146027)) {
				if (var0.ai()) {
					cd.az_void(543406071);
				} else {
					aax var4 = og.ci_fld.jn((byte)-57);
					if (null != var4 && var4.equals(var3)) {
						ab.av((short)9049);
					} else if (var0.au(var3)) {
						xh.ak(var1 + kh.hu_fld);
					} else if (var0.al(var3, false)) {
						xh.ak(kh.ib_fld + var1 + kh.iz_fld);
					} else {
						im.ae(var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	static final void aj(String var0) {
		jm var1 = gi.ak(jb.cp_fld, client.aq_fld.av_fld);
		var1.ay_fld.bc(iq.bu(var0));
		var1.ay_fld.cc(var0, 1351241936);
		client.aq_fld.az(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lro;"
	)
	public ro ax() {
		return this.ae_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	static final void bm(String var0, int var1) {
		jm var2 = gi.ak(jb.cv_fld, client.aq_fld.av_fld);
		var2.ay_fld.bc(iq.bu(var0) + 1);
		var2.ay_fld.bc(var1);
		var2.ay_fld.cc(var0, -101014541);
		client.aq_fld.az(var2);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean bd() {
		return this.aw_fld == 2;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean bn() {
		return this.ae_fld.bx((byte)54) || this.ae_fld.bl(-1440239599) >= 200 && 1 != client.ep_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void br() {
		this.aw_fld = 1018845127;
	}

	bo(zo var1) {
		this.av_fld = var1;
		this.ae_fld = new ro(var1);
		this.ah_fld = new re(var1);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bs() {
		this.aw_fld = 1018845127;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bh() {
		this.aw_fld = -883403845;
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(Lbo;I)V"
	)
	public static void qz(bo var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (rd var2 = (rd)var0.ae_fld.av_fld.ag(); null != var2; var2 = (rd)np.py(var0.ae_fld.av_fld)) {
				if (var2.ak_fld < lz.ak() / 1000L - 5L) {
					if (var2.az_fld > 0) {
						io.ag(5, "", var2.ag_fld + kh.gb_fld);
					}

					if (0 == var2.az_fld) {
						io.ag(5, "", var2.ag_fld + kh.gl_fld);
					}

					var2.ak();
				}
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void be() {
		this.aw_fld = 1018845127;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void jq(String var1) {
		Friend var2 = (Friend)this.ax().findByName(var1);
		if (var2 != null) {
			og.ci_fld.getCallbacks().post(new RemovedFriend(var2));
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	final void bj(xi var1, int var2) {
		this.ae_fld.al(var1, var2, -1977191941);
		this.aw_fld = 2037690254;
		is.gd(-2029960693);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void ba(String var1) {
		if (var1 != null) {
			aax var2 = new aax(var1, this.av_fld);
			if (var2.az(1004146027)) {
				if (this.ai()) {
					cd.az_void(1170322606);
				} else {
					aax var3 = og.ci_fld.jn((byte)-41);
					if (null != var3 && var3.equals(var2)) {
						ab.av((short)4685);
					} else if (this.au(var2)) {
						xh.ak(var1 + kh.hu_fld);
					} else if (this.al(var2, false)) {
						xh.ak(kh.ib_fld + var1 + kh.iz_fld);
					} else {
						im.ae(var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void aa(String var1) {
		if (var1 != null) {
			aax var3 = new aax(var1, this.av_fld);
			if (var3.az(1004146027)) {
				if (this.an()) {
					xh.ak(kh.ha_fld);
				} else {
					aax var4 = og.ci_fld.jn((byte)-50);
					if (var4 != null && var4.equals(var3)) {
						km.ag();
					} else if (this.al(var3, false)) {
						xh.ak(var1 + kh.ht_fld);
					} else if (this.au(var3)) {
						xh.ak(kh.ho_fld + var1 + kh.hm_fld);
					} else {
						jm var5 = gi.ak(jb.dh_fld, client.aq_fld.av_fld);
						var5.ay_fld.bc(iq.bu(var1));
						var5.ay_fld.cc(var1, 331470056);
						client.aq_fld.az(var5);
					}
				}
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Laax;Z)Z"
	)
	final boolean bo(aax var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else {
			return var1.equals(og.ci_fld.jn((byte)-3)) ? true : this.ae_fld.az(var1, var2, (byte)18);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Laax;Z)Z"
	)
	final boolean bp(aax var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else {
			return var1.equals(og.ci_fld.jn((byte)-14)) ? true : this.ae_fld.az(var1, var2, (byte)78);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean bg() {
		return this.ah_fld.bx((byte)125) || this.ah_fld.bl(-1440239599) >= -2022220930 && 1 != client.ep_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void bv(String var1) {
		if (var1 != null) {
			aax var2 = new aax(var1, this.av_fld);
			if (var2.az(1004146027)) {
				if (this.an()) {
					xh.ak(kh.ha_fld);
				} else {
					aax var3 = og.ci_fld.jn((byte)-32);
					if (var3 != null && var3.equals(var2)) {
						km.ag();
					} else if (this.al(var2, false)) {
						xh.ak(var1 + kh.ht_fld);
					} else if (this.au(var2)) {
						xh.ak(kh.ho_fld + var1 + kh.hm_fld);
					} else {
						jm var4 = gi.ak(jb.dh_fld, client.aq_fld.av_fld);
						var4.ay_fld.bc(iq.bu(var1));
						var4.ay_fld.cc(var1, -102021529);
						client.aq_fld.az(var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bf() {
		for (rd var1 = (rd)this.ae_fld.av_fld.ag(); null != var1; var1 = (rd)np.py(this.ae_fld.av_fld)) {
			if (var1.ak_fld < lz.ak() / 1000L - 5L) {
				if (var1.az_fld > 0) {
					io.ag(5, "", var1.ag_fld + kh.gb_fld);
				}

				if (0 == var1.az_fld) {
					io.ag(5, "", var1.ag_fld + kh.gl_fld);
				}

				var1.ak();
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void bu(String var1) {
		if (var1 != null) {
			aax var2 = new aax(var1, this.av_fld);
			if (var2.az(1004146027)) {
				if (this.an()) {
					xh.ak(kh.ha_fld);
				} else {
					aax var3 = og.ci_fld.jn((byte)-47);
					if (var3 != null && var3.equals(var2)) {
						km.ag();
					} else if (this.al(var2, false)) {
						xh.ak(var1 + kh.ht_fld);
					} else if (this.au(var2)) {
						xh.ak(kh.ho_fld + var1 + kh.hm_fld);
					} else {
						jm var4 = gi.ak(jb.dh_fld, client.aq_fld.av_fld);
						var4.ay_fld.bc(iq.bu(var1));
						var4.ay_fld.cc(var1, 911748850);
						client.aq_fld.az(var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	final boolean cx(aax var1) {
		rp var2 = (rp)rc.tl(this.ae_fld, var1, 870376823);
		return var2 != null && var2.bl(1023170160);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean bb() {
		return this.ah_fld.bx((byte)41) || this.ah_fld.bl(-1440239599) >= 100 && 1 != client.ep_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void bq(String var1) {
		if (var1 != null) {
			aax var2 = new aax(var1, this.av_fld);
			if (var2.az(1004146027)) {
				if (this.ai()) {
					cd.az_void(405765937);
				} else {
					aax var3 = og.ci_fld.jn((byte)-111);
					if (null != var3 && var3.equals(var2)) {
						ab.av((short)27575);
					} else if (this.au(var2)) {
						xh.ak(var1 + kh.hu_fld);
					} else if (this.al(var2, false)) {
						xh.ak(kh.ib_fld + var1 + kh.iz_fld);
					} else {
						im.ae(var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	final boolean cp(aax var1) {
		rp var2 = (rp)rc.tl(this.ae_fld, var1, -205779034);
		return var2 != null && var2.bl(1023170160);
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Lbo;Laax;)Z"
	)
	public static boolean jz(bo var0, aax var1) {
		rp var2 = (rp)rc.tl(var0.ae_fld, var1, -1044966748);
		return var2 != null && var2.bl(1023170160);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	final void bk(xi var1, int var2) {
		this.ae_fld.al(var1, var2, -1191894446);
		this.aw_fld = 2037690254;
		is.gd(-1704219269);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean cd() {
		return this.ah_fld.bx((byte)63) || this.ah_fld.bl(-1440239599) >= 100 && 1 != client.ep_fld;
	}

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "(Lbo;I)Z"
	)
	public static boolean vc(bo var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aw_fld == 2;
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lbo;)V"
	)
	public static void lq(bo var0) {
		if (var0 == null) {
			var0.getClass();
		}

		for (rd var1 = (rd)var0.ae_fld.av_fld.ag(); null != var1; var1 = (rd)np.py(var0.ae_fld.av_fld)) {
			if (var1.ak_fld < lz.ak() / 1000L - 5L) {
				if (var1.az_fld > 0) {
					io.ag(5, "", var1.ag_fld + kh.gb_fld);
				}

				if (0 == var1.az_fld) {
					io.ag(5, "", var1.ag_fld + kh.gl_fld);
				}

				var1.ak();
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void cc(String var1) {
		if (null != var1) {
			aax var2 = new aax(var1, this.av_fld);
			if (var2.az(1004146027)) {
				if (this.ae_fld.bi(var2, -1889213927)) {
					pi.sq(client.ck_fld, (byte)44);
					jm var3 = gi.ak(jb.ap_fld, client.aq_fld.av_fld);
					var3.ay_fld.bc(iq.bu(var1));
					var3.ay_fld.cc(var1, 1037211187);
					client.aq_fld.az(var3);
				}

				is.gd(-1629045091);
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lbo;)Z"
	)
	public static boolean jg(bo var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ae_fld.bx((byte)25) || var0.ae_fld.bl(-1440239599) >= 200 && 1 != client.ep_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void ac() {
		Object var10000 = null;
		String var0 = kh.hz_fld;
		io.ag(30, "", var0);
	}

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public boolean ve(aax var1) {
		return this.au(var1);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	final void cv(String var1) {
		if (null != var1) {
			aax var2 = new aax(var1, this.av_fld);
			if (var2.az(1004146027)) {
				if (this.ae_fld.bi(var2, -1915537250)) {
					pi.sq(client.ck_fld, (byte)34);
					jm var3 = gi.ak(jb.ap_fld, client.aq_fld.av_fld);
					var3.ay_fld.bc(iq.bu(var1));
					var3.ay_fld.cc(var1, 1807191160);
					client.aq_fld.az(var3);
				}

				is.gd(-2047951888);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	final void as(xi var1, int var2) {
		this.ae_fld.al(var1, var2, 56120984);
		this.aw_fld = 2037690254;
		is.gd(-1162713175);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Z)V"
	)
	public final void cy(String var1, boolean var2) {
		if (var1 != null) {
			aax var3 = new aax(var1, this.av_fld);
			if (var3.az(1004146027)) {
				if (this.ah_fld.bi(var3, -1953834613)) {
					pi.sq(client.ck_fld, (byte)7);
					if (var2) {
						jm var4 = gi.ak(jb.ay_fld, client.aq_fld.av_fld);
						var4.ay_fld.bc(iq.bu(var1));
						var4.ay_fld.cc(var1, 881221679);
						client.aq_fld.az(var4);
					}
				}

				oh.gy(-1819596118);
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bx() {
		this.aw_fld = 0;
		rc.ns(this.ae_fld, (byte)0);
		rc.ns(this.ah_fld, (byte)0);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	final boolean bw() {
		return this.ae_fld.bx((byte)39) || this.ae_fld.bl(-1440239599) >= 501306115 && 1 != client.ep_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void ap() {
		xh.ak(kh.hy_fld);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	final boolean ce(aax var1) {
		rp var2 = (rp)rc.tl(this.ae_fld, var1, -1969663222);
		return var2 != null && var2.bl(1023170160);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	final boolean cn(aax var1) {
		rp var2 = (rp)rc.tl(this.ae_fld, var1, -866337928);
		return var2 != null && var2.bl(1023170160);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int bq(int var0, ba var1, boolean var2) {
		if (var0 == 6200) {
			gz.ax_fld -= 2;
			client.fj_fld = (short)mn.bw(bp.au_fld[gz.ax_fld]);
			if (client.fj_fld <= 0) {
				client.fj_fld = 256;
			}

			client.fb_fld = (short)mn.bw(bp.au_fld[1 + gz.ax_fld]);
			if (client.fb_fld <= 0) {
				client.fb_fld = 256;
			}

			return 1;
		} else if (6201 == var0) {
			gz.ax_fld -= 2;
			client.fk_fld = (short)bp.au_fld[gz.ax_fld];
			if (client.fk_fld <= 0) {
				client.fk_fld = 256;
			}

			client.fc_fld = (short)bp.au_fld[1 + gz.ax_fld];
			if (client.fc_fld <= 0) {
				client.fc_fld = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			gz.ax_fld -= 4;
			client.fh_fld = (short)bp.au_fld[gz.ax_fld];
			if (client.fh_fld <= 0) {
				client.fh_fld = 1;
			}

			client.fm_fld = (short)bp.au_fld[1 + gz.ax_fld];
			if (client.fm_fld <= 0) {
				client.fm_fld = 32767;
			} else if (client.fm_fld < client.fh_fld) {
				client.fm_fld = client.fh_fld;
			}

			client.fe_fld = (short)bp.au_fld[2 + gz.ax_fld];
			if (client.fe_fld <= 0) {
				client.fe_fld = 1;
			}

			client.fw_fld = (short)bp.au_fld[3 + gz.ax_fld];
			if (client.fw_fld <= 0) {
				client.fw_fld = 32767;
			} else if (client.fw_fld < client.fe_fld) {
				client.fw_fld = client.fe_fld;
			}

			return 1;
		} else if (var0 == 6203) {
			if (cf.cg_fld.aq_fld != null) {
				hw.cn(0, 0, cf.cg_fld.aq_fld.bb_fld * -1223437005, cf.cg_fld.aq_fld.cd_fld * 124430729, false);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fn_fld;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ft_fld;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fk_fld;
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.fc_fld;
			return 1;
		} else if (var0 == 6205) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fg.ba(client.fj_fld);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fg.ba(client.fb_fld);
			return 1;
		} else if (var0 == 6220) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			return 1;
		} else if (6222 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = pf.qw_fld;
			return 1;
		} else if (6223 == var0) {
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = bc.qx_fld;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void ar(int var1) {
		for (rd var2 = (rd)this.ae_fld.av_fld.ag(); null != var2; var2 = (rd)np.py(this.ae_fld.av_fld)) {
			if (var2.ak_fld < lz.ak() / 1000L - 5L) {
				if (var2.az_fld > 0) {
					io.ag(5, "", var2.ag_fld + kh.ht_fld);
				}

				if (0 == var2.az_fld) {
					io.ag(5, "", var2.ag_fld + kh.cs_fld);
				}

				var2.mr();
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	final void ax(String var1, int var2) {
		if (var1 != null) {
			aax var3 = new aax(var1, this.av_fld);
			if (var3.az(1004146027)) {
				if (this.ai()) {
					cd.az_void(543406071);
				} else {
					aax var4 = og.ci_fld.jn((byte)-57);
					if (null != var4 && var4.jg(var3)) {
						ab.av((short)9049);
					} else if (this.au(var3)) {
						xh.ak(var1 + kh.gk_fld);
					} else if (this.al(var3, false)) {
						xh.ak(kh.ao_fld + var1 + kh.le_fld);
					} else {
						im.ae(var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean aw(int var1) {
		return this.aw_fld == 2;
	}
}
