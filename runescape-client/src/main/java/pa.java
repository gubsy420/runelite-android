import java.io.EOFException;
import net.runelite.api.HealthBarConfig;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -934934835
	)
	public int af_fld;
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
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1712951291
	)
	public int aa_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1955348211
	)
	public int as_fld = -1205718843;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1089243505
	)
	public int an_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -15245667
	)
	int ax_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2131395085
	)
	public int al_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -457605973
	)
	public int aw_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2047005697
	)
	int au_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub av_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 547164955
	)
	public int ay_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1328338365
	)
	public int ar_fld;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bp_fld;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv ax() {
		try {
			if (this.ax_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ah_fld.ak(this.ax_fld * -1216489584);
				if (null != var1) {
					return var1;
				} else {
					var1 = wf.av(av_fld, this.ax_fld * 805988221, 0);
					if (var1 != null) {
						ah_fld.az(var1, -1507337802 * this.ax_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ag(xi var1, int var2) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				this.un(var1);
				return;
			}

			this.az(var1, var3, (byte)124);
		}
	}

	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void un(xi var1) {
		PostHealthBarConfig var2 = new PostHealthBarConfig();
		var2.setHealthBarConfig(this);
		og.ci_fld.getCallbacks().post(var2);
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lpa;)Lyv;"
	)
	public static yv kz(pa var0) throws EOFException {
		try {
			if (var0.au_fld < 0) {
				return null;
			} else {
				yv var1 = (yv)ah_fld.ak(var0.au_fld);
				if (var1 != null) {
					return var1;
				} else {
					var1 = wf.av(av_fld, var0.au_fld, 0);
					if (null != var1) {
						ah_fld.az(var1, var0.au_fld);
					}

					return var1;
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("setPadding")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setPadding")
	@Override
	public void setPadding(int var1) {
		this.ar_fld = var1;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv av(int var1) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lyv;"
	)
	public yv ae(int var1) {
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

	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv getHealthBarBackSprite() {
		try {
			return this.ae(615685914);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "(Lpa;Lxi;I)V"
	)
	public static void rj(pa var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (1 == var2) {
			var1.cm();
		} else if (2 == var2) {
			var0.as_fld = var1.cg() * 842421679;
		} else if (var2 == 3) {
			var0.af_fld = var1.cg();
		} else if (var2 == 4) {
			var0.an_fld = 0;
		} else if (var2 == 5) {
			var0.aw_fld = var1.cm();
		} else if (6 == var2) {
			var1.cg();
		} else if (7 == var2) {
			var0.au_fld = xi.kt(var1, (byte)-67);
		} else if (8 == var2) {
			var0.ax_fld = xi.kt(var1, (byte)-111) * -465357928;
		} else if (11 == var2) {
			var0.an_fld = var1.cm() * 1037556387;
		} else if (var2 == 14) {
			var0.ay_fld = var1.cg();
		} else if (15 == var2) {
			var0.ar_fld = var1.cg() * -501210492;
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

			var1.cm();
		} else if (2 == var2) {
			this.as_fld = var1.cg();
		} else if (var2 == 3) {
			this.af_fld = var1.cg();
		} else if (var2 == 4) {
			this.an_fld = 0;
		} else if (var2 == 5) {
			this.aw_fld = var1.cm();
		} else if (6 == var2) {
			var1.cg();
		} else if (7 == var2) {
			this.au_fld = xi.kt(var1, (byte)-28);
		} else if (8 == var2) {
			this.ax_fld = xi.kt(var1, (byte)-52);
		} else if (11 == var2) {
			this.an_fld = var1.cm();
		} else if (var2 == 14) {
			this.ay_fld = var1.cg();
		} else if (15 == var2) {
			this.ar_fld = var1.cg();
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

	@ObfuscatedName("getHealthBarFrontSpriteId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getHealthBarFrontSpriteId")
	@Override
	public int getHealthBarFrontSpriteId() {
		return this.au_fld;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void as(xi var1, int var2) {
		if (1 == var2) {
			var1.cm();
		} else if (2 == var2) {
			this.as_fld = var1.cg();
		} else if (var2 == 3) {
			this.af_fld = var1.cg();
		} else if (var2 == 4) {
			this.an_fld = 0;
		} else if (var2 == 5) {
			this.aw_fld = var1.cm();
		} else if (6 == var2) {
			var1.cg();
		} else if (7 == var2) {
			this.au_fld = xi.kt(var1, (byte)-22);
		} else if (8 == var2) {
			this.ax_fld = xi.kt(var1, (byte)-112);
		} else if (11 == var2) {
			this.an_fld = var1.cm();
		} else if (var2 == 14) {
			this.ay_fld = var1.cg();
		} else if (15 == var2) {
			this.ar_fld = var1.cg();
		}
	}

	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	public yv getHealthBarFrontSprite() {
		try {
			return this.av(588330049);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Lpa;)Lyv;"
	)
	public static yv fp(pa var0) throws EOFException {
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
		this.af_fld = 93892347;
		this.an_fld = 167962735;
		this.al_fld = 64134341;
		this.aw_fld = 764359890;
		this.au_fld = -1166879745;
		this.ax_fld = 1195239499;
		this.ay_fld = 1894499386;
		this.ar_fld = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ay(xi var1, int var2) {
		if (1 == var2) {
			var1.cm();
		} else if (2 == var2) {
			this.as_fld = var1.cg();
		} else if (var2 == 3) {
			this.af_fld = var1.cg();
		} else if (var2 == 4) {
			this.an_fld = 0;
		} else if (var2 == 5) {
			this.aw_fld = var1.cm() * -1155218060;
		} else if (6 == var2) {
			var1.cg();
		} else if (7 == var2) {
			this.au_fld = xi.kt(var1, (byte)-121);
		} else if (8 == var2) {
			this.ax_fld = xi.kt(var1, (byte)-50);
		} else if (11 == var2) {
			this.an_fld = var1.cm();
		} else if (var2 == 14) {
			this.ay_fld = var1.cg() * 1069440859;
		} else if (15 == var2) {
			this.ar_fld = var1.cg();
		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int nl() {
		return this.ay_fld;
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
		descriptor = "(I)[Lsb;"
	)
	public static sb[] ak() {
		return new sb[]{sb.ak_fld, sb.ag_fld, sb.az_fld, sb.av_fld};
	}
}
