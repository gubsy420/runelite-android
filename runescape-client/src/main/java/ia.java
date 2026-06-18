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
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 1966566564862348583L
	)
	long aa_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -583569019
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
		this.aa_fld = var1.cu();
		this.ai_fld = var1.co((byte)-14);

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
			no.dx(this.aq_fld, (vw)var3);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)J"
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
		descriptor = "(Lik;I)V"
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

	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "(Lco;)Z"
	)
	public static boolean tk(co var0) {
		if (rw.ak_fld == var0.ay_fld) {
			var0.av(-776631127);
		}

		return rw.ag_fld == var0.ay_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void az(xi var1) {
		this.aa_fld = var1.cu();
		this.ai_fld = var1.co((byte)-108);

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
			no.dx(this.aq_fld, (vw)var3);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void aw(xi var1) {
		this.aa_fld = var1.cu();
		this.ai_fld = var1.co((byte)-7);

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
			no.dx(this.aq_fld, (vw)var3);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	public void ay(ik var1) {
		if (this.aa_fld == var1.aw_fld && this.ai_fld == var1.ay_fld) {
			for (ht var2 = (ht)this.aq_fld.ah(); null != var2; var2 = (ht)this.aq_fld.ay()) {
				var2.ag(var1, -56092734);
			}

			var1.ay_fld++;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ah(xi var1) {
		this.aa_fld = var1.cu();
		this.ai_fld = var1.co((byte)-50) * -1279261165;

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
			no.dx(this.aq_fld, (vw)var3);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ak(xi var1, int var2) {
		this.aa_fld = var1.cu();
		this.ai_fld = var1.co((byte)-93);

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
			no.dx(this.aq_fld, (vw)var4);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void av(xi var1) {
		this.aa_fld = var1.cu();
		this.ai_fld = var1.co((byte)-29);

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

			((ht)var3).ak(var1, -1722809779);
			no.dx(this.aq_fld, (vw)var3);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
	)
	public void as(ik var1) {
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
