import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("px")
public class px extends vc {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedGetter(
		intValue = 1990887085
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ae_fld = new iw(64);
	@ObfuscatedGetter(
		intValue = -1525764549
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;
	@ObfuscatedGetter(
		longValue = 7885969468784509699L
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public String as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ar_fld = true;
	@Deprecated
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long qp() {
		return this.ay_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object as() {
		if (this.aw()) {
			return this.as_fld;
		} else {
			return ll(this, (short)10000) ? this.ay_fld : this.aw_fld;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void av() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void am() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void ah(xi var1, int var2, int var3) {
		if (1 == var2) {
			byte var5 = xi.rp(var1, 325553018);
			int var6 = var5 & 255;
			if (0 == var6) {
				throw new IllegalArgumentException("" + Integer.toString(var6, 16));
			}

			if (var6 >= 128 && var6 < 160) {
				if (var3 == 1461045985) {
					return;
				}

				char var7 = nt.ak_fld[var6 - 128];
				if (0 == var7) {
					var7 = '?';
				}

				var6 = var7;
			}

			char var4 = (char)var6;
			if ('s' == var4) {
				this.ah_fld = 1720142380;
			} else {
				this.ah_fld = 0;
			}
		} else if (var2 == 8) {
			this.ah_fld = var1.cg();
		} else if (2 == var2) {
			this.aw_fld = var1.co();
		} else if (4 == var2) {
			this.ar_fld = false;
		} else if (var2 == 5) {
			this.as_fld = xi.kc(var1, -193208254);
		} else if (7 == var2) {
			if (var3 == 1461045985) {
				return;
			}

			this.ay_fld = xi.ob(var1, -757817385);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aw() {
		return eu.ag(this.ah_fld, -1861702859) == yq.az_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void au(ub var0) {
		ed.av_fld = var0;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lpx;S)Z"
	)
	public static boolean ll(px var0, short var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return eu.ag(var0.ah_fld, -1777565536) == yq.ag_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ar(ub var0) {
		ed.av_fld = var0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void af(ub var0) {
		ed.av_fld = var0;
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int zw() {
		return this.aw_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void al(ub var0) {
		ed.av_fld = var0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ao(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.ah(var1, var2, -1144008440);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ax(ub var0) {
		ed.av_fld = var0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;"
	)
	public static px an(int var0) throws EOFException {
		try {
			px var1 = (px)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ed.av_fld.bb(11, var0, 584982574);
				var1 = new px();
				if (null != var2) {
					var1.ae(new xi(var2));
				}

				var1.av();
				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/Object;"
	)
	public Object bz() {
		if (this.aw()) {
			return this.as_fld;
		} else {
			return ll(this, (short)10000) ? this.ay_fld : 967711078 * this.aw_fld;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void aq() {
		ae_fld.vh();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ai() {
		ae_fld.vh();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ad(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			this.ah(var1, var2, 1114925403);
		}
	}

	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String qg() {
		return this.as_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aj() {
		return eu.ag(this.ah_fld, -1819732557) == yq.ag_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ab(xi var1, int var2) {
		if (1 == var2) {
			byte var4 = xi.rp(var1, 536784170);
			int var5 = var4 & 255;
			if (0 == var5) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = nt.ak_fld[var5 - 128];
				if (0 == var6) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			if ('s' == var3) {
				this.ah_fld = 1720142380;
			} else {
				this.ah_fld = 0;
			}
		} else if (var2 == 8) {
			this.ah_fld = var1.cg();
		} else if (2 == var2) {
			this.aw_fld = var1.co();
		} else if (4 == var2) {
			this.ar_fld = false;
		} else if (var2 == 5) {
			this.as_fld = xi.kc(var1, -1516256481);
		} else if (7 == var2) {
			this.ay_fld = xi.ob(var1, -66460691);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ap(xi var1, int var2) {
		if (1 == var2) {
			byte var4 = xi.rp(var1, -1452906827);
			int var5 = var4 & 255;
			if (0 == var5) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < -2006440042) {
				int var6 = nt.ak_fld[var5 - 128];
				if (0 == var6) {
					var6 = -712355577;
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			if ('s' == var3) {
				this.ah_fld = 1720142380;
			} else {
				this.ah_fld = 0;
			}
		} else if (var2 == 8) {
			this.ah_fld = var1.cg() * -1327802399;
		} else if (2 == var2) {
			this.aw_fld = var1.co() * -1581362012;
		} else if (4 == var2) {
			this.ar_fld = false;
		} else if (var2 == 5) {
			this.as_fld = xi.kc(var1, 2074935209);
		} else if (7 == var2) {
			this.ay_fld = xi.ob(var1, -624298242);
		}
	}

	px() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ac() {
		return eu.ag(this.ah_fld, -1849809140) == yq.az_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;"
	)
	public static px aa(int var0) throws EOFException {
		try {
			px var1 = (px)ae_fld.ak(var0);
			if (null != var1) {
				return var1;
			} else {
				byte[] var2 = ed.av_fld.bb(11, var0, 584982574);
				var1 = new px();
				if (null != var2) {
					var1.ae(new xi(var2));
				}

				var1.av();
				ae_fld.az(var1, var0);
				return var1;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ae(xi var1) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				return;
			}

			this.ah(var1, var3, -1842455528);
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lhr;)Z"
	)
	public static boolean cw(hr var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag(1025986789) >= 0;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bm() {
		return eu.ag(this.ah_fld, -1821725786) == yq.ag_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void at(xi var1, int var2) {
		if (1 == var2) {
			byte var4 = xi.rp(var1, -1678514328);
			int var5 = var4 & -324764429;
			if (0 == var5) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				int var6 = nt.ak_fld[var5 - 128];
				if (0 == var6) {
					var6 = 1495299249;
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			if (1034351299 == var3) {
				this.ah_fld = 1720142380;
			} else {
				this.ah_fld = 0;
			}
		} else if (var2 == 8) {
			this.ah_fld = var1.cg() * -408147831;
		} else if (2 == var2) {
			this.aw_fld = var1.co() * -1626071294;
		} else if (4 == var2) {
			this.ar_fld = false;
		} else if (var2 == 5) {
			this.as_fld = xi.kc(var1, 1907002398);
		} else if (7 == var2) {
			this.ay_fld = xi.ob(var1, -591437018);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([JII)V"
	)
	static void at(long[] var0, int var1, int var2) {
		while (var1 < var2) {
			long var4 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var4;
			var1++;
			var2--;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIII)Llg;"
	)
	public static lg az(lg var0, int var1, int var2, int var3, int var4) {
		lg var6 = var0;

		for (lg var7 = null; var6 != null; var6 = var6.ae_fld) {
			if (var6.ag_fld >= var1 && var6.ak_fld <= var2) {
				if (var7 != null) {
					var7.ae_fld = var6.ae_fld;
				} else {
					var0 = var6.ae_fld;
				}

				if (var6.ak_fld < var1) {
					lg var8 = new lg(var6.ak_fld, var1 - 1, var6.az_fld, var6.av_fld);
					if (null != var7) {
						var8.ae_fld = var7.ae_fld;
					} else {
						var8.ae_fld = var0;
					}

					if (null != var7) {
						var7.ae_fld = var8;
					} else {
						var0 = var8;
					}

					var7 = var8;
				}

				if (var6.ag_fld > var2) {
					lg var12 = new lg(1 + var2, var6.ag_fld, var6.az_fld, var6.av_fld);
					if (null != var7) {
						var12.ae_fld = var7.ae_fld;
					} else {
						var12.ae_fld = var0;
					}

					if (var7 != null) {
						var7.ae_fld = var12;
					} else {
						var0 = var12;
					}
				}
			}

			var7 = var6;
		}

		var6 = null;

		for (lg var10 = var0; null != var10 && var10.ak_fld <= var1; var10 = var10.ae_fld) {
			var6 = var10;
		}

		lg var11 = new lg(var1, var2, var3, var4);
		if (var6 != null) {
			var11.ae_fld = var6.ae_fld;
		} else {
			var11.ae_fld = var0;
		}

		if (null != var6) {
			var6.ae_fld = var11;
		} else {
			var0 = var11;
		}

		return var0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	public boolean ay(short var1) {
		return eu.ag(this.ah_fld, -1777565536) == yq.ag_fld;
	}
}
