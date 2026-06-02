import java.io.EOFException;
import net.runelite.api.HealthBarConfig;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.PostHealthBarConfig;

@ObfuscatedName("pa")
@Implements({"HealthBarConfig"})
public class pa extends vc implements HealthBarConfig {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static ub az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = -934934835
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int as_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ae_fld = new iw(64);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw ah_fld = new iw(64);
	@ObfuscatedGetter(
		intValue = -1712951291
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedGetter(
		intValue = 1955348211
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ay_fld = -1205718843;
	@ObfuscatedGetter(
		intValue = 1089243505
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ar_fld;
	@ObfuscatedGetter(
		intValue = -15245667
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedGetter(
		intValue = 2131395085
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int af_fld;
	@ObfuscatedGetter(
		intValue = -457605973
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int al_fld;
	@ObfuscatedGetter(
		intValue = 2047005697
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub av_fld;
	@ObfuscatedGetter(
		intValue = 547164955
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int an_fld;
	@ObfuscatedGetter(
		intValue = 1328338365
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aa_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bp_fld;

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Lpa;)Lyv;"
	)
	public static yv jz(pa var0) throws EOFException {
		try {
			if (var0.ax_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ah_fld.ak(var0.ax_fld * -1216489584);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(av_fld, var0.ax_fld * 805988221, 0);
					if (var1 != null) {
						ah_fld.az(var1, -1507337802 * var0.ax_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ax(xi var1) {
		PostHealthBarConfig var2 = new PostHealthBarConfig();
		var2.setHealthBarConfig(this);
		og.ci_fld.getCallbacks().post(var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ag(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				this.ax(var1);
				return;
			}

			this.az(var1, var3, (byte)124);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv au() {
		try {
			if (this.ax_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ah_fld.ak(this.ax_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(av_fld, this.ax_fld, 0);
					if (var1 != null) {
						ah_fld.az(var1, this.ax_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("zl")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv getHealthBarFrontSprite() {
		try {
			return this.ae(588330049);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lpa;)Lyv;"
	)
	public static yv pc(pa var0) throws EOFException {
		try {
			if (var0.ax_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ah_fld.ak(var0.ax_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(av_fld, var0.ax_fld, 0);
					if (var1 != null) {
						ah_fld.az(var1, var0.ax_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int jd() {
		return this.an_fld;
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv getHealthBarBackSprite() {
		try {
			return this.av(615685914);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv ae(int var1) {
		try {
			if (this.au_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ah_fld.ak(this.au_fld);
				if (var2 != null) {
					return var2;
				} else {
					var2 = wf.av(av_fld, this.au_fld, 0);
					if (null != var2) {
						ah_fld.az(var2, this.au_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv av(int var1) {
		try {
			if (this.ax_fld < 0) {
				return null;
			} else {
				yv var2 = (yv)ah_fld.ak(this.ax_fld);
				if (null != var2) {
					return var2;
				} else {
					var2 = wf.av(av_fld, this.ax_fld, 0);
					if (var2 != null) {
						ah_fld.az(var2, this.ax_fld);
					}

					return var2;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;IB)V"
	)
	void az(xi var1, int var2, byte var3) {
		if (1 == var2) {
			if (var3 <= 4) {
				return;
			}

			xi.tx(var1, 1429537331);
		} else if (2 == var2) {
			this.ay_fld = var1.cg();
		} else if (var2 == 3) {
			this.as_fld = var1.cg();
		} else if (var2 == 4) {
			this.ar_fld = 0;
		} else if (var2 == 5) {
			this.al_fld = xi.tx(var1, 1727894727);
		} else if (6 == var2) {
			var1.cg();
		} else if (7 == var2) {
			this.au_fld = var1.do_();
		} else if (8 == var2) {
			this.ax_fld = var1.do_();
		} else if (11 == var2) {
			this.ar_fld = xi.tx(var1, 503573983);
		} else if (var2 == 14) {
			this.an_fld = var1.cg();
		} else if (15 == var2) {
			this.aa_fld = var1.cg();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;)V"
	)
	public static void ah(ub var0, ub var1) {
		az_fld = var0;
		av_fld = var1;
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "(Lda;Lbb;)V"
	)
	public static void xp(da var0, bb var1) {
		var0.cg_fld.ag(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv aa() {
		try {
			if (this.ax_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ah_fld.ak(this.ax_fld);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(av_fld, this.ax_fld * -368414518, 0);
					if (var1 != null) {
						ah_fld.az(var1, 139005347 * this.ax_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getHealthBarFrontSpriteId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getHealthBarFrontSpriteId() {
		return this.au_fld;
	}

	@ObfuscatedName("setPadding")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setPadding(int var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void as(xi var1, int var2) {
		if (1 == var2) {
			xi.tx(var1, 617112266);
		} else if (2 == var2) {
			this.ay_fld = var1.cg();
		} else if (var2 == 3) {
			this.as_fld = var1.cg();
		} else if (var2 == 4) {
			this.ar_fld = 0;
		} else if (var2 == 5) {
			this.al_fld = xi.tx(var1, 1956452070);
		} else if (6 == var2) {
			var1.cg();
		} else if (7 == var2) {
			this.au_fld = var1.do_();
		} else if (8 == var2) {
			this.ax_fld = var1.do_();
		} else if (11 == var2) {
			this.ar_fld = xi.tx(var1, 641946706);
		} else if (var2 == 14) {
			this.an_fld = var1.cg();
		} else if (15 == var2) {
			this.aa_fld = var1.cg();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ar(xi var1, int var2) {
		if (1 == var2) {
			xi.tx(var1, 1266974086);
		} else if (2 == var2) {
			this.ay_fld = var1.cg() * 842421679;
		} else if (var2 == 3) {
			this.as_fld = var1.cg();
		} else if (var2 == 4) {
			this.ar_fld = 0;
		} else if (var2 == 5) {
			this.al_fld = xi.tx(var1, 471435696);
		} else if (6 == var2) {
			var1.cg();
		} else if (7 == var2) {
			this.au_fld = var1.do_();
		} else if (8 == var2) {
			this.ax_fld = var1.do_() * -465357928;
		} else if (11 == var2) {
			this.ar_fld = xi.tx(var1, 1684491473) * 1037556387;
		} else if (var2 == 14) {
			this.an_fld = var1.cg();
		} else if (15 == var2) {
			this.aa_fld = var1.cg() * -501210492;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv af() {
		try {
			if (this.au_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ah_fld.ak(this.au_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(av_fld, this.au_fld, 0);
					if (null != var1) {
						ah_fld.az(var1, this.au_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv al() {
		try {
			if (1528108461 * this.au_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ah_fld.ak(this.au_fld * 1502248528);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(av_fld, -1275104117 * this.au_fld, 0);
					if (null != var1) {
						ah_fld.az(var1, this.au_fld * -596832958);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	public pa() {
		this.as_fld = 93892347;
		this.ar_fld = 167962735;
		this.af_fld = 64134341;
		this.al_fld = 764359890;
		this.au_fld = -1166879745;
		this.ax_fld = 1195239499;
		this.an_fld = 1894499386;
		this.aa_fld = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ay(xi var1, int var2) {
		if (1 == var2) {
			xi.tx(var1, 332290131);
		} else if (2 == var2) {
			this.ay_fld = var1.cg();
		} else if (var2 == 3) {
			this.as_fld = var1.cg();
		} else if (var2 == 4) {
			this.ar_fld = 0;
		} else if (var2 == 5) {
			this.al_fld = xi.tx(var1, 397359865) * -1155218060;
		} else if (6 == var2) {
			var1.cg();
		} else if (7 == var2) {
			this.au_fld = var1.do_();
		} else if (8 == var2) {
			this.ax_fld = var1.do_();
		} else if (11 == var2) {
			this.ar_fld = xi.tx(var1, 1526568034);
		} else if (var2 == 14) {
			this.an_fld = var1.cg() * 1069440859;
		} else if (15 == var2) {
			this.aa_fld = var1.cg();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;)V"
	)
	public static void aw(ub var0, ub var1) {
		az_fld = var0;
		av_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Lsb;"
	)
	public static sb[] ak() {
		return new sb[]{sb.ak_fld, sb.ag_fld, sb.az_fld, sb.av_fld};
	}
}
