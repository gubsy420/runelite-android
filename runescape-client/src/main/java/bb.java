import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bb")
public class bb {
	@ObfuscatedGetter(
		intValue = 1
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	lf ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	kx av_fld;
	@ObfuscatedGetter(
		intValue = 1
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	ll ak_fld;
	@ObfuscatedGetter(
		intValue = 1
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = 1
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedGetter(
		intValue = 1
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = 1
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lll;"
	)
	static ll[] al_fld = os.ak();
	@ObfuscatedGetter(
		intValue = 1
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Llf;"
	)
	static lf[] au_fld = ay.ak_Arrlf(-29007221);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lkx;"
	)
	static kx[] ax_fld = cj.ak();
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String jj_fld;
	@ObfuscatedGetter(
		intValue = -960016293
	)
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ij_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbb;ILxj;)V"
	)
	public static void ae(bb var0, int var1, xj var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = (ll)ka.ak(al_fld, var1 & 7);
		var0.ag_fld = (lf)ka.ak(au_fld, var1 >> 3 & 7);
		var0.az_fld = 1 == (var1 >> 6 & 1);
		switch (var0.ag_fld.ae_fld * 124918021) {
			case 0:
			default:
				break;
			case 1:
				var0.av_fld = (kx)ka.ak(ax_fld, var2.dz());
				var0.ae_fld = var2.do_() * 1672039261;
				var0.ah_fld = var2.dz() * 1321528339;
				break;
			case 2:
				var0.af_fld = var2.dz() * 1215197091;
				break;
			case 3:
				var0.aw_fld = var2.dz() * -1341950899;
				var0.ay_fld = var2.dz() * -701415113;
				int var3 = var2.dz();
				var0.as_fld = 23144171 * (var3 & 15);
				var0.ar_fld = -648842437 * (var3 >> 4 & 15);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void au(int var1, xj var2) {
		this.ak_fld = (ll)ka.ak(al_fld, var1 & 7);
		this.ag_fld = (lf)ka.ak(au_fld, var1 >> 3 & 7);
		this.az_fld = 1 == (var1 >> 6 & 1);
		switch (this.ag_fld.ae_fld * 1847194454) {
			case 0:
			default:
				break;
			case 1:
				this.av_fld = (kx)ka.ak(ax_fld, var2.dz());
				this.ae_fld = var2.do_() * -1171500835;
				this.ah_fld = var2.dz() * 1570304632;
				break;
			case 2:
				this.af_fld = var2.dz() * -1503293299;
				break;
			case 3:
				this.aw_fld = var2.dz() * -1341950899;
				this.ay_fld = var2.dz() * 918497154;
				int var3 = var2.dz();
				this.as_fld = 23144171 * (var3 & 15);
				this.ar_fld = 1824318534 * (var3 >> 4 & 15);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ak() {
		this.ak_fld = ll.ak_fld;
		this.ag_fld = lf.av_fld;
		this.az_fld = false;
		this.av_fld = kx.ak_fld;
		this.ae_fld = -1672039261;
		this.ah_fld = -1321528339;
		this.aw_fld = 1341950899;
		this.ay_fld = 701415113;
		this.as_fld = -23144171;
		this.ar_fld = 648842437;
		this.af_fld = -1215197091;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		this.ak_fld = ll.ak_fld;
		this.ag_fld = lf.av_fld;
		this.az_fld = false;
		this.av_fld = kx.ak_fld;
		this.ae_fld = -1672039261;
		this.ah_fld = -1321528339;
		this.aw_fld = 1341950899;
		this.ay_fld = 701415113;
		this.as_fld = -23144171;
		this.ar_fld = 648842437;
		this.af_fld = -1215197091;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lbb;III)V"
	)
	public static void jx(bb var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var5 = var1 + (var2 << 16);
			int var4 = 16777215;
			if (var4 == var5) {
				var5 = -1;
			}

			var0.ag_fld = lf.ak_fld;
			if (var5 == -1) {
				var0.av_fld = kx.ak_fld;
				var0.ae_fld = -1672039261;
			} else if (var5 < 65536) {
				if (var3 != -1106240719) {
					return;
				}

				var0.av_fld = kx.ag_fld;
				var0.ae_fld = 1672039261 * var5;
			} else {
				var0.av_fld = kx.az_fld;
				var0.ae_fld = 1672039261 * (var5 - 65536);
			}

			var0.ah_fld = -1321528339;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void az(int var1, xj var2) {
		this.ak_fld = (ll)ka.ak(al_fld, var1 & 7);
		this.ag_fld = (lf)ka.ak(au_fld, var1 >> 3 & 7);
		this.az_fld = 1 == (var1 >> 6 & 1);
		switch (this.ag_fld.ae_fld * 124918021) {
			case 0:
			default:
				break;
			case 1:
				this.av_fld = (kx)ka.ak(ax_fld, var2.dz());
				this.ae_fld = var2.do_() * 1672039261;
				this.ah_fld = var2.dz() * 1321528339;
				break;
			case 2:
				this.af_fld = var2.dz() * 1215197091;
				break;
			case 3:
				this.aw_fld = var2.dz() * -1341950899;
				this.ay_fld = var2.dz() * -701415113;
				int var4 = var2.dz();
				this.as_fld = 23144171 * (var4 & 15);
				this.ar_fld = -648842437 * (var4 >> 4 & 15);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aa(int var1, int var2) {
		int var4 = var1 + (var2 << 16);
		int var3 = 16777215;
		if (var3 == var4) {
			var4 = -1;
		}

		this.ag_fld = lf.ak_fld;
		if (var4 == -1) {
			this.av_fld = kx.ak_fld;
			this.ae_fld = -1672039261;
		} else if (var4 < 65536) {
			this.av_fld = kx.ag_fld;
			this.ae_fld = 1672039261 * var4;
		} else {
			this.av_fld = kx.az_fld;
			this.ae_fld = 1672039261 * (var4 - 65536);
		}

		this.ah_fld = -1321528339;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	void as(bb var1) {
		if (var1 != this) {
			this.ak_fld = var1.ak_fld;
			this.ag_fld = var1.ag_fld;
			this.az_fld = var1.az_fld;
			switch (this.ag_fld.ae_fld * 124918021) {
				case 0:
				default:
					break;
				case 1:
					this.av_fld = var1.av_fld;
					this.ae_fld = var1.ae_fld;
					this.ah_fld = var1.ah_fld;
					break;
				case 2:
					this.af_fld = var1.af_fld;
					break;
				case 3:
					this.aw_fld = var1.aw_fld;
					this.ay_fld = var1.ay_fld;
					this.as_fld = var1.as_fld;
					this.ar_fld = var1.ar_fld;
			}
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lbb;B)V"
	)
	public static void ie(bb var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = kx.ak_fld;
		var0.ae_fld = -1672039261;
		var0.ah_fld = -1321528339;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ay() {
		this.ak_fld = ll.ak_fld;
		this.ag_fld = lf.av_fld;
		this.az_fld = false;
		this.av_fld = kx.ak_fld;
		this.ae_fld = -1672039261;
		this.ah_fld = 250541200;
		this.aw_fld = 1341950899;
		this.ay_fld = 1640367602;
		this.as_fld = 721474587;
		this.ar_fld = 521884398;
		this.af_fld = -451191403;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
		this.av_fld = kx.ak_fld;
		this.ae_fld = -1672039261;
		this.ah_fld = -1321528339;
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lzu;)J"
	)
	public static long gj(zu var0) {
		return var0.af_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	void ar(bb var1) {
		if (var1 != this) {
			this.ak_fld = var1.ak_fld;
			this.ag_fld = var1.ag_fld;
			this.az_fld = var1.az_fld;
			switch (this.ag_fld.ae_fld * 124918021) {
				case 0:
				default:
					break;
				case 1:
					this.av_fld = var1.av_fld;
					this.ae_fld = var1.ae_fld;
					this.ah_fld = var1.ah_fld;
					break;
				case 2:
					this.af_fld = var1.af_fld;
					break;
				case 3:
					this.aw_fld = var1.aw_fld;
					this.ay_fld = var1.ay_fld;
					this.as_fld = var1.as_fld;
					this.ar_fld = var1.ar_fld;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	void af(bb var1) {
		if (var1 != this) {
			this.ak_fld = var1.ak_fld;
			this.ag_fld = var1.ag_fld;
			this.az_fld = var1.az_fld;
			switch (this.ag_fld.ae_fld * -909184756) {
				case 0:
				default:
					break;
				case 1:
					this.av_fld = var1.av_fld;
					this.ae_fld = var1.ae_fld;
					this.ah_fld = var1.ah_fld;
					break;
				case 2:
					this.af_fld = var1.af_fld;
					break;
				case 3:
					this.aw_fld = var1.aw_fld;
					this.ay_fld = var1.ay_fld;
					this.as_fld = var1.as_fld;
					this.ar_fld = var1.ar_fld;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbb;)V"
	)
	void ag(bb var1) {
		if (var1 != this) {
			this.ak_fld = var1.ak_fld;
			this.ag_fld = var1.ag_fld;
			this.az_fld = var1.az_fld;
			switch (this.ag_fld.ae_fld * 124918021) {
				case 0:
				default:
					break;
				case 1:
					this.av_fld = var1.av_fld;
					this.ae_fld = var1.ae_fld;
					this.ah_fld = var1.ah_fld;
					break;
				case 2:
					this.af_fld = var1.af_fld;
					break;
				case 3:
					this.aw_fld = var1.aw_fld;
					this.ay_fld = var1.ay_fld;
					this.as_fld = var1.as_fld;
					this.ar_fld = var1.ar_fld;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILxj;)V"
	)
	void ax(int var1, xj var2) {
		this.ak_fld = (ll)ka.ak(al_fld, var1 & 7);
		this.ag_fld = (lf)ka.ak(au_fld, var1 >> 3 & 7);
		this.az_fld = 1 == (var1 >> 6 & 1);
		switch (this.ag_fld.ae_fld * 124918021) {
			case 0:
			default:
				break;
			case 1:
				this.av_fld = (kx)ka.ak(ax_fld, var2.dz());
				this.ae_fld = var2.do_() * 179956315;
				this.ah_fld = var2.dz() * 1321528339;
				break;
			case 2:
				this.af_fld = var2.dz() * 1215197091;
				break;
			case 3:
				this.aw_fld = var2.dz() * -1341950899;
				this.ay_fld = var2.dz() * -701415113;
				int var3 = var2.dz();
				this.as_fld = 23144171 * (var3 & 15);
				this.ar_fld = -648842437 * (var3 >> 4 & 15);
		}
	}

	bb() {
		this.ak_fld = ll.ak_fld;
		this.ag_fld = lf.av_fld;
		this.av_fld = kx.ak_fld;
		this.aw_fld = 1341950899;
		this.af_fld = -1215197091;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	void av(int var1, boolean var2) {
		this.ag_fld = lf.az_fld;
		this.af_fld = 1215197091 * var1;
		this.az_fld = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		this.av_fld = kx.ak_fld;
		this.ae_fld = -1672039261;
		this.ah_fld = -1321528339;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;Z)V"
	)
	public static void ag(ub var0, ub var1, boolean var2) {
		if_.cf_fld = var0;
		dm.cx_fld = var1;
		oe.cy_fld = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)Z"
	)
	public static boolean ab(yz var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "(Lbb;ILxj;)V"
	)
	public static void xg(bb var0, int var1, xj var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = (ll)ka.ak(al_fld, var1 & 7);
			var0.ag_fld = (lf)ka.ak(au_fld, var1 >> 3 & 7);
			var0.az_fld = 1 == (var1 >> 6 & 1);
			switch (var0.ag_fld.ae_fld * 124918021) {
				case 0:
				default:
					break;
				case 1:
					var0.av_fld = (kx)ka.ak(ax_fld, var2.dz());
					var0.ae_fld = var2.do_() * 1672039261;
					var0.ah_fld = var2.dz() * 1321528339;
					break;
				case 2:
					var0.af_fld = var2.dz() * 1215197091;
					break;
				case 3:
					var0.aw_fld = var2.dz() * -1341950899;
					var0.ay_fld = var2.dz() * -701415113;
					int var3 = var2.dz();
					var0.as_fld = 23144171 * (var3 & 15);
					var0.ar_fld = -648842437 * (var3 >> 4 & 15);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void ae(int var1, int var2, int var3) {
		int var5 = var1 + (var2 << 16);
		int var4 = 16777215;
		if (var4 == var5) {
			var5 = -1;
		}

		this.ag_fld = lf.ak_fld;
		if (var5 == -1) {
			this.av_fld = kx.ak_fld;
			this.af_fld = -1672039261;
		} else if (var5 < 65536) {
			if (var3 != -1106240719) {
				return;
			}

			this.av_fld = kx.ag_fld;
			this.af_fld = 1672039261 * var5;
		} else {
			this.av_fld = kx.ag_fld;
			this.ay_fld = 1672039261 * (var5 - 65536);
		}

		this.ay_fld = -1321528339;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ah(byte var1) {
		this.av_fld = kx.ag_fld;
		this.af_fld = -1672039261;
		this.as_fld = -1321528339;
	}
}
