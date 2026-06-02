import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ia")
public class ia {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ar_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	no aq_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedGetter(
		longValue = 1966566564862348583L
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long aa_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedGetter(
		intValue = -583569019
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ai_fld = -1404100429;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lyv;"
	)
	static yv[] af_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ae(xi var1) {
		this.aa_fld = xi.ob(var1, 1174823850);
		this.ai_fld = var1.co();

		for (int var2 = var1.cg(); var2 != 0; var2 = var1.cg()) {
			Object var3;
			if (var2 == 3) {
				var3 = new ie(this);
			} else if (1 == var2) {
				var3 = new ha(this);
			} else if (13 == var2) {
				var3 = new id(this);
			} else if (var2 == 4) {
				var3 = new hu(this);
			} else if (var2 == 6) {
				var3 = new ij(this);
			} else if (5 == var2) {
				var3 = new ip(this);
			} else if (2 == var2) {
				var3 = new iq(this);
			} else if (var2 == 7) {
				var3 = new if_(this);
			} else if (14 == var2) {
				var3 = new il(this);
			} else if (var2 == 8) {
				var3 = new ih(this);
			} else if (9 == var2) {
				var3 = new im(this);
			} else if (var2 == 10) {
				var3 = new io(this);
			} else if (var2 == 11) {
				var3 = new is(this);
			} else if (12 == var2) {
				var3 = new in(this);
			} else {
				if (15 != var2) {
					throw new RuntimeException("");
				}

				var3 = new ix(this);
			}

			((ht)var3).ak(var1, -193612900);
			this.aq_fld.az((vw)var3);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)J"
	)
	public static long an(sl var0) {
		yq var2 = yq.ak_fld;
		om.ap(var0, var2, false, (byte)0);
		int[] var3 = var0.ak();
		int var4 = var0.av();
		long var5 = 0L;

		for (int var7 = 0; var7 < var4; var7++) {
			var5 += var3[var7];
		}

		return var5;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	public void ag(ik var1) {
		if (this.aa_fld == var1.aw_fld && this.ai_fld == var1.ay_fld) {
			for (ht var3 = (ht)this.aq_fld.ah(); null != var3; var3 = (ht)this.aq_fld.ay()) {
				var3.ag(var1, 1136319698);
			}

			var1.ay_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void az(xi var1) {
		this.aa_fld = xi.ob(var1, 6661307);
		this.ai_fld = var1.co();

		for (int var2 = var1.cg(); var2 != 0; var2 = var1.cg()) {
			Object var3;
			if (var2 == 3) {
				var3 = new ie(this);
			} else if (1 == var2) {
				var3 = new ha(this);
			} else if (13 == var2) {
				var3 = new id(this);
			} else if (var2 == 4) {
				var3 = new hu(this);
			} else if (var2 == 6) {
				var3 = new ij(this);
			} else if (5 == var2) {
				var3 = new ip(this);
			} else if (2 == var2) {
				var3 = new iq(this);
			} else if (var2 == 7) {
				var3 = new if_(this);
			} else if (14 == var2) {
				var3 = new il(this);
			} else if (var2 == 8) {
				var3 = new ih(this);
			} else if (9 == var2) {
				var3 = new im(this);
			} else if (var2 == 10) {
				var3 = new io(this);
			} else if (var2 == 11) {
				var3 = new is(this);
			} else if (12 == var2) {
				var3 = new in(this);
			} else {
				if (15 != var2) {
					throw new RuntimeException("");
				}

				var3 = new ix(this);
			}

			((ht)var3).ak(var1, 429083393);
			this.aq_fld.az((vw)var3);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aw(xi var1) {
		this.aa_fld = xi.ob(var1, 1091527213);
		this.ai_fld = var1.co();

		for (int var2 = var1.cg(); var2 != 0; var2 = var1.cg()) {
			Object var3;
			if (var2 == 3) {
				var3 = new ie(this);
			} else if (1 == var2) {
				var3 = new ha(this);
			} else if (13 == var2) {
				var3 = new id(this);
			} else if (var2 == 4) {
				var3 = new hu(this);
			} else if (var2 == 6) {
				var3 = new ij(this);
			} else if (5 == var2) {
				var3 = new ip(this);
			} else if (2 == var2) {
				var3 = new iq(this);
			} else if (var2 == 7) {
				var3 = new if_(this);
			} else if (14 == var2) {
				var3 = new il(this);
			} else if (var2 == 8) {
				var3 = new ih(this);
			} else if (9 == var2) {
				var3 = new im(this);
			} else if (var2 == 10) {
				var3 = new io(this);
			} else if (var2 == 11) {
				var3 = new is(this);
			} else if (12 == var2) {
				var3 = new in(this);
			} else {
				if (15 != var2) {
					throw new RuntimeException("");
				}

				var3 = new ix(this);
			}

			((ht)var3).ak(var1, 1721219377);
			this.aq_fld.az((vw)var3);
		}
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIZ)Z"
	)
	public static boolean ql(ev var0, int var1, int var2, int var3, int var4, boolean var5) {
		return var0.it(var0.ed_fld, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lia;Lxi;)V"
	)
	public static void cz(ia var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aa_fld = xi.ob(var1, -1517548190);
			var0.ai_fld = var1.co();

			for (int var2 = var1.cg(); var2 != 0; var2 = var1.cg()) {
				Object var3;
				if (var2 == 3) {
					var3 = new ie(var0);
				} else if (1 == var2) {
					var3 = new ha(var0);
				} else if (13 == var2) {
					var3 = new id(var0);
				} else if (var2 == 4) {
					var3 = new hu(var0);
				} else if (var2 == 6) {
					var3 = new ij(var0);
				} else if (5 == var2) {
					var3 = new ip(var0);
				} else if (2 == var2) {
					var3 = new iq(var0);
				} else if (var2 == 7) {
					var3 = new if_(var0);
				} else if (14 == var2) {
					var3 = new il(var0);
				} else if (var2 == 8) {
					var3 = new ih(var0);
				} else if (9 == var2) {
					var3 = new im(var0);
				} else if (var2 == 10) {
					var3 = new io(var0);
				} else if (var2 == 11) {
					var3 = new is(var0);
				} else if (12 == var2) {
					var3 = new in(var0);
				} else {
					if (15 != var2) {
						throw new RuntimeException("");
					}

					var3 = new ix(var0);
				}

				((ht)var3).ak(var1, -1722809779);
				var0.aq_fld.az((vw)var3);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	public void as(ik var1) {
		if (this.aa_fld == var1.aw_fld && this.ai_fld == var1.ay_fld) {
			for (ht var2 = (ht)this.aq_fld.ah(); null != var2; var2 = (ht)this.aq_fld.ay()) {
				var2.ag(var1, -56092734);
			}

			var1.ay_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V"
	)
	public static void pm(wl var0, int var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		gf var2 = var0.be(var1, -204323328);
		if (null != var2) {
			var0.aa(var2, 1899149716);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ah(xi var1) {
		this.aa_fld = xi.ob(var1, 212299371);
		this.ai_fld = var1.co() * -1279261165;

		for (int var2 = var1.cg(); var2 != 0; var2 = var1.cg()) {
			Object var3;
			if (var2 == 3) {
				var3 = new ie(this);
			} else if (1 == var2) {
				var3 = new ha(this);
			} else if (13 == var2) {
				var3 = new id(this);
			} else if (var2 == 4) {
				var3 = new hu(this);
			} else if (var2 == 6) {
				var3 = new ij(this);
			} else if (5 == var2) {
				var3 = new ip(this);
			} else if (2 == var2) {
				var3 = new iq(this);
			} else if (var2 == 7) {
				var3 = new if_(this);
			} else if (14 == var2) {
				var3 = new il(this);
			} else if (var2 == 8) {
				var3 = new ih(this);
			} else if (9 == var2) {
				var3 = new im(this);
			} else if (var2 == 10) {
				var3 = new io(this);
			} else if (var2 == 11) {
				var3 = new is(this);
			} else if (12 == var2) {
				var3 = new in(this);
			} else {
				if (15 != var2) {
					throw new RuntimeException("");
				}

				var3 = new ix(this);
			}

			((ht)var3).ak(var1, -1972609725);
			this.aq_fld.az((vw)var3);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)[Ljava/lang/Object;"
	)
	public static Object[] bq(yz var0) {
		return (Object[])var0.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ak(xi var1, int var2) {
		this.aa_fld = xi.ob(var1, 844731269);
		this.ai_fld = var1.co();

		for (int var3 = var1.cg(); var3 != 0; var3 = var1.cg()) {
			Object var4;
			if (false) {
				var4 = new ie(this);
			} else if (1 == var3) {
				if (var2 <= -1402835320) {
					return;
				}

				var4 = new ha(this);
			} else if (13 == var3) {
				var4 = new id(this);
			} else if (false) {
				var4 = new hu(this);
			} else if (false) {
				var4 = new ij(this);
			} else if (5 == var3) {
				if (var2 <= -1402835320) {
					return;
				}

				var4 = new ip(this);
			} else if (2 == var3) {
				if (var2 <= -1402835320) {
					return;
				}

				var4 = new iq(this);
			} else if (false) {
				if (var2 <= -1402835320) {
					return;
				}

				var4 = new if_(this);
			} else if (14 == var3) {
				var4 = new il(this);
			} else if (false) {
				var4 = new ih(this);
			} else if (9 == var3) {
				if (var2 <= -1402835320) {
					return;
				}

				var4 = new im(this);
			} else if (false) {
				if (var2 <= -1402835320) {
					return;
				}

				var4 = new io(this);
			} else if (false) {
				var4 = new is(this);
			} else if (12 == var3) {
				var4 = new in(this);
			} else {
				if (15 != var3) {
					throw new RuntimeException("");
				}

				var4 = new ix(this);
			}

			((ht)var4).ak(var1, -300954499);
			this.aq_fld.az((vw)var4);
		}
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;)Z"
	)
	public static boolean dy(ub var0, String var1, String var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = var0.bf_fld.ak(ov.ar(var1));
		int var4 = var0.bu_fld[var3].ak(ov.ar(var2));
		return var0.cc(var3, var4, 1505973679);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	public void ay(ik var1) {
		if (this.aa_fld == var1.aw_fld && this.ai_fld == var1.ay_fld) {
			for (ht var2 = (ht)this.aq_fld.ah(); null != var2; var2 = (ht)this.aq_fld.ay()) {
				var2.ag(var1, -1220058839);
			}

			var1.ay_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	public ia(xi var1) {
		this.aq_fld = new no();
		this.ak(var1, -230228195);
	}
}
