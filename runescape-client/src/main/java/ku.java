import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ku")
public class ku {
	@ObfuscatedGetter(
		intValue = 793666769
	)
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ad_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int fv_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedGetter(
		intValue = -664974735
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;
	@ObfuscatedGetter(
		intValue = 1516884691
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedGetter(
		intValue = 1832596073
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int am_fld;
	@ObfuscatedGetter(
		intValue = -456236897
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;
	@ObfuscatedGetter(
		intValue = 2113179607
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;
	@ObfuscatedGetter(
		intValue = -624216941
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean dc_fld;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	static xh gi_fld;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void ar(xi var1) {
		this.rq(var1);
		int var3 = var1.cg();
		switch (var3) {
			case 1:
				this.ax_fld = 1982466459;
				break;
			case 2:
				this.aq_fld = -147523136;
				this.am_fld = -1151371712;
				this.ax_fld = -330034378;
				break;
			case 3:
				this.aq_fld = 0;
				this.am_fld = -1151371712;
				this.ax_fld = -330034378;
				break;
			case 4:
				this.aq_fld = -295046272;
				this.am_fld = -1151371712;
				this.ax_fld = -330034378;
				break;
			case 5:
				this.aq_fld = -147523136;
				this.am_fld = 0;
				this.ax_fld = -330034378;
				break;
			case 6:
				this.aq_fld = -147523136;
				this.am_fld = 1992223872;
				this.ax_fld = -330034378;
			case 7:
			case 8:
			case 9:
			default:
				break;
			case 10:
				this.ax_fld = 1652432081;
				break;
			case 11:
				this.ax_fld = -660068756;
		}

		switch (this.ax_fld) {
			case 0:
				break;
			case 1:
			case 3:
				this.an_fld = xi.tx(var1, 1821465841);
				break;
			case 2:
				this.aa_fld = xi.tx(var1, 397624646);
				this.ai_fld = xi.tx(var1, 1523768435);
				this.ad_fld = var1.cg();
				break;
			case 4:
				this.an_fld = xi.tx(var1, 1369448770);
				this.ad_fld = var1.ck();
				break;
			default:
				throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		this.ax_fld = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aq() {
		return this.an_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ah() {
		return this.ai_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean aa() {
		return this.ax_fld != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int as() {
		return this.ad_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean an() {
		return this.ax_fld != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aw() {
		return this.aq_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ax() {
		this.ax_fld = 0;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)I"
	)
	public static int og(ku var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.an_fld;
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lku;)I"
	)
	public static int iu(ku var0) {
		return var0.aq_fld;
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)I"
	)
	public static int pj(ku var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.am_fld;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)I"
	)
	public static int id(ku var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ax_fld;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		this.ax_fld = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ai() {
		return this.ax_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ab() {
		return this.ai_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void bs(xi var1) {
		int var2 = var1.cg();
		switch (var2) {
			case 1:
				this.ax_fld = 1982466459;
				break;
			case 2:
				this.aq_fld = -1625674985;
				this.am_fld = -1230283424;
				this.ax_fld = 1323760565;
				break;
			case 3:
				this.aq_fld = 0;
				this.am_fld = 546400082;
				this.ax_fld = -1064126052;
				break;
			case 4:
				this.aq_fld = -295046272;
				this.am_fld = -1151371712;
				this.ax_fld = -330034378;
				break;
			case 5:
				this.aq_fld = -147523136;
				this.am_fld = 0;
				this.ax_fld = -330034378;
				break;
			case 6:
				this.aq_fld = 2099540693;
				this.am_fld = 1992223872;
				this.ax_fld = -808426385;
			case 7:
			case 8:
			case 9:
			default:
				break;
			case 10:
				this.ax_fld = -959149860;
				break;
			case 11:
				this.ax_fld = -1114842361;
		}

		switch (this.ax_fld) {
			case 0:
				break;
			case 1:
			case 3:
				this.an_fld = xi.tx(var1, 1887536514) * -246401716;
				break;
			case 2:
				this.aa_fld = xi.tx(var1, 1697920462) * 770037911;
				this.ai_fld = xi.tx(var1, 1156735081);
				this.ad_fld = var1.cg() * 526168658;
				break;
			case 4:
				this.an_fld = xi.tx(var1, 709112275);
				this.ad_fld = var1.ck() * 996999938;
				break;
			default:
				throw new RuntimeException("");
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int am() {
		return this.an_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ao() {
		return this.aa_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void be(xi var1) {
		int var2 = var1.cg();
		switch (var2) {
			case 1:
				this.ax_fld = 1982466459;
				break;
			case 2:
				this.aq_fld = -147523136;
				this.am_fld = -1151371712;
				this.ax_fld = -330034378;
				break;
			case 3:
				this.aq_fld = 0;
				this.am_fld = -1151371712;
				this.ax_fld = -330034378;
				break;
			case 4:
				this.aq_fld = -295046272;
				this.am_fld = -1151371712;
				this.ax_fld = -330034378;
				break;
			case 5:
				this.aq_fld = -147523136;
				this.am_fld = 0;
				this.ax_fld = -330034378;
				break;
			case 6:
				this.aq_fld = -147523136;
				this.am_fld = 1992223872;
				this.ax_fld = -330034378;
			case 7:
			case 8:
			case 9:
			default:
				break;
			case 10:
				this.ax_fld = 1652432081;
				break;
			case 11:
				this.ax_fld = -660068756;
		}

		switch (this.ax_fld) {
			case 0:
				break;
			case 1:
			case 3:
				this.an_fld = xi.tx(var1, 1133460031);
				break;
			case 2:
				this.aa_fld = xi.tx(var1, 2045825285);
				this.ai_fld = xi.tx(var1, 875595364);
				this.ad_fld = var1.cg();
				break;
			case 4:
				this.an_fld = xi.tx(var1, 2065146789);
				this.ad_fld = var1.ck();
				break;
			default:
				throw new RuntimeException("");
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int at() {
		return this.ai_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ac() {
		return this.aq_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ag() {
		return this.ax_fld != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ap() {
		return this.ai_fld;
	}

	public ku() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void ay_void(int var0) {
		synchronized (uw.ag_fld) {
			if (0 == uw.ah_fld) {
				ky.aw_fld = new Thread(new uw());
				client.oy();
				ky.aw_fld.setDaemon(true);
				ky.aw_fld.start();
				ky.aw_fld.setPriority(5);
			}

			uw.ah_fld = 1826819752;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lct;Lct;IZ)I"
	)
	static int ah(ct var0, ct var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.au_fld;
			int var6 = var1.au_fld;
			if (!var3) {
				if (-1 == var5) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.aa_fld - var1.aa_fld;
		} else if (3 == var2) {
			if (var0.an_fld.equals("-")) {
				if (var1.an_fld.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.an_fld.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.an_fld.compareTo(var1.an_fld);
			}
		} else if (var2 == 4) {
			return var0.au((byte)0) ? (var1.au((byte)0) ? 0 : 1) : (var1.au((byte)0) ? -1 : 0);
		} else if (var2 == 5) {
			return var0.an(1886978513) ? (var1.an(1886978513) ? 0 : 1) : (var1.an(1886978513) ? -1 : 0);
		} else if (6 == var2) {
			return var0.ax(2118441926) ? (var1.ax(1735609733) ? 0 : 1) : (var1.ax(1831063915) ? -1 : 0);
		} else if (7 == var2) {
			return var0.as((short)2048) ? (var1.as((short)2048) ? 0 : 1) : (var1.as((short)2048) ? -1 : 0);
		} else {
			return var0.af_fld - var1.af_fld;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int az(int var1) {
		return this.ax_fld;
	}

	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void rq(xi var1) {
		this.fv_fld = og.ci_fld.getPlane();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av(int var1) {
		return this.an_fld;
	}

	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int vv(da var0) {
		return var0.cm_fld.ah();
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)I"
	)
	public static int ph(ku var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aa_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae(int var1) {
		return this.aq_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ay(int var1) {
		return this.aa_fld;
	}
}
