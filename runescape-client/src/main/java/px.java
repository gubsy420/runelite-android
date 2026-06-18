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
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1990887085
	)
	public int aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ae_fld = new iw(64);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1525764549
	)
	int ah_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 7885969468784509699L
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void av() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int an() {
		return this.aw_fld;
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
			byte var5 = var1.cw();
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
			this.aw_fld = var1.co((byte)-95);
		} else if (4 == var2) {
			this.ar_fld = false;
		} else if (var2 == 5) {
			this.as_fld = xi.at(var1, -193208254);
		} else if (7 == var2) {
			if (var3 == 1461045985) {
				return;
			}

			this.ay_fld = var1.cu();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean aw() {
		return eu.ag(this.ah_fld, -1861702859) == yq.az_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	public boolean ay() {
		return eu.ag(this.ah_fld, -1777565536) == yq.ag_fld;
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int eh(pi var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void au(ub var0) {
		ed.av_fld = var0;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lxi;I)V"
	)
	public static void kn(px var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (1 == var2) {
				byte var4 = var1.cw();
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
					var0.ah_fld = 1720142380;
				} else {
					var0.ah_fld = 0;
				}
			} else if (var2 == 8) {
				var0.ah_fld = var1.cg() * -1327802399;
			} else if (2 == var2) {
				var0.aw_fld = var1.co((byte)-120) * -1581362012;
			} else if (4 == var2) {
				var0.ar_fld = false;
			} else if (var2 == 5) {
				var0.as_fld = xi.at(var1, 2074935209);
			} else if (7 == var2) {
				var0.ay_fld = var1.cu();
			}
		}
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)Ljava/lang/Object;"
	)
	public static Object ug(px var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.aw()) {
			return var0.as_fld;
		} else {
			return var0.ay() ? var0.ay_fld : var0.aw_fld;
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

	@ObfuscatedName("yt")
	@ObfuscatedSignature(
		descriptor = "(Lae;ILjava/lang/String;J)Z"
	)
	public static boolean yt(ae var0, int var1, String var2, long var3) {
		if (var0 == null) {
			var0.getClass();
		}

		byte[] var5 = ae.jn(var0, var2, var3);
		return ae.ak(var5) >= var1;
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bd() {
		return eu.ag(this.ah_fld, -1905233451) == yq.ag_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void aq() {
		ae_fld.av();
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lpx;)Ljava/lang/Object;"
	)
	public static Object hk(px var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.aw()) {
			return var0.as_fld;
		} else {
			return var0.ay() ? var0.ay_fld : 967711078 * var0.aw_fld;
		}
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)V"
	)
	public static void og(zg var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bf(0, var0.ap_fld.size(), -965052253);
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String mq() {
		return this.as_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ai() {
		ae_fld.av();
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
			byte var4 = var1.cw();
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
			this.aw_fld = var1.co((byte)-110);
		} else if (4 == var2) {
			this.ar_fld = false;
		} else if (var2 == 5) {
			this.as_fld = xi.at(var1, -1516256481);
		} else if (7 == var2) {
			this.ay_fld = var1.cu();
		}
	}

	px() {
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "()J"
	)
	public long eg() {
		return this.ay_fld;
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
		descriptor = "(Lxi;I)V"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void at(xi var1, int var2) {
		if (1 == var2) {
			byte var4 = var1.cw();
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
			this.aw_fld = var1.co((byte)-87) * -1626071294;
		} else if (4 == var2) {
			this.ar_fld = false;
		} else if (var2 == 5) {
			this.as_fld = xi.at(var1, 1907002398);
		} else if (7 == var2) {
			this.ay_fld = var1.cu();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([JIII)V"
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

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lpx;)Z"
	)
	public static boolean mv(px var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return eu.ag(var0.ah_fld, -1821725786) == yq.ag_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIIIB)Llg;"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	public Object as(int var1) {
		if (this.aw()) {
			return this.as_fld;
		} else {
			return this.ay() ? this.ay_fld : this.aw_fld;
		}
	}
}
