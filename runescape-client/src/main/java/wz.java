import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.Menu;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.BeforeMenuRender;
import net.runelite.api.events.MenuEntryAdded;

@ObfuscatedName("wz")
@Implements({"Menu"})
public class wz implements Menu {
	@ObfuscatedGetter(
		intValue = -906902563
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ay_fld;
	@ObfuscatedGetter(
		intValue = -930898849
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;
	@ObfuscatedGetter(
		intValue = 958556113
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ah_fld;
	// $VF: synthetic field
	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean la_fld = !wz.class.desiredAssertionStatus();
	@ObfuscatedGetter(
		intValue = -930898849
	)
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ey_fld = -1;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] aw_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] av_fld;
	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int mw_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] as_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/String;"
	)
	public String[] ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lwz;"
	)
	public wz[] af_fld;
	@ObfuscatedGetter(
		intValue = -930898849
	)
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ws_fld = -1;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	public boolean[] al_fld;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "[Lrl5;"
	)
	public rl5[] ne_fld;
	@ObfuscatedGetter(
		intValue = 1323538149
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aq_fld;
	@ObfuscatedGetter(
		intValue = 1881916129
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] az_fld;
	@ObfuscatedGetter(
		intValue = -670991091
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = -1435734125
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedGetter(
		longValue = -5285149903467884903L
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long am_fld;
	@ObfuscatedGetter(
		intValue = -930898849
	)
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int mm_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cz_fld;

	@ObfuscatedName("setMenuEntries")
	@ObfuscatedSignature(
		descriptor = "([Lnet/runelite/api/MenuEntry;)V"
	)
	@Override
	public void setMenuEntries(MenuEntry[] var1) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			boolean var2 = false;
			if (bp.na_fld != null && this.ag_fld > 0) {
				var2 = bp.na_fld.vl() == this.ae_fld[this.ag_fld - 1]
					&& bp.na_fld.xi() == this.ah_fld[this.ag_fld - 1]
					&& bp.na_fld.td() == this.as_fld[this.ag_fld - 1]
					&& bp.na_fld.jh() == this.ar_fld[this.ag_fld - 1]
					&& bp.na_fld.ud() == this.az_fld[this.ag_fld - 1]
					&& bp.na_fld.su() == this.av_fld[this.ag_fld - 1]
					&& bp.na_fld.dv() == this.aw_fld[this.ag_fld - 1]
					&& bp.na_fld.bp() == this.ay_fld[this.ag_fld - 1];
			}

			for (int var3 = 0; var3 < var1.length; var3++) {
				rl5 var4 = (rl5)var1[var3];
				if (var4.nj_fld != var3) {
					if (var4.tk_fld != this) {
						throw new IllegalArgumentException("menu entry at index " + var3 + " doesn't belong to this menu");
					}

					if (var4.nj_fld <= var3) {
						throw new IllegalArgumentException("menu entry out of order (are you passing the same menu twice?)");
					}

					this.qg(var4.nj_fld, var3);
				}
			}

			this.ag_fld = var1.length;
			this.mm_fld = var1.length;
			if (var2 && this.ag_fld > 0) {
				if (!la_fld && bp.na_fld == null) {
					throw new AssertionError();
				}

				bp.na_fld.zx(this.ae_fld[this.ag_fld - 1]);
				bp.na_fld.av(this.ah_fld[this.ag_fld - 1]);
				bp.na_fld.gc(this.as_fld[this.ag_fld - 1]);
				bp.na_fld.xq(this.ar_fld[this.ag_fld - 1]);
				bp.na_fld.pc(this.az_fld[this.ag_fld - 1]);
				bp.na_fld.lc(this.av_fld[this.ag_fld - 1]);
				bp.na_fld.ii(this.aw_fld[this.ag_fld - 1]);
				bp.na_fld.uo(this.ay_fld[this.ag_fld - 1]);
				bp.na_fld.cn_fld = this.ne_fld[this.ag_fld - 1].qy_fld;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public final void az(int var1, int var2, int var3) {
		lb.tm(this, -587498666);
		this.aq_fld = -955959571 * (var1 - this.ai_fld / 2);
		if (this.ai_fld + this.aq_fld > pf.qw_fld) {
			this.aq_fld = pf.qw_fld - this.ai_fld;
		}

		if (this.aq_fld < 0) {
			this.aq_fld = 0;
		}

		this.an_fld = var2;
		if (this.au_fld + this.an_fld > bc.qx_fld) {
			this.an_fld = bc.qx_fld - this.au_fld;
		}

		if (this.an_fld < 0) {
			this.an_fld = 0;
		}

		if (this.aa_fld != -1) {
			if (var3 == 1384127158) {
				return;
			}

			if (null != this.af_fld[this.aa_fld]) {
				this.af_fld[this.aa_fld].av(this, (byte)102);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwz;B)V"
	)
	final void av(wz var1, byte var2) {
		this.ed(var1);
		this.aq_fld = var1.ai_fld + var1.aq_fld;
		if (this.aq_fld + this.ai_fld > pf.qw_fld) {
			this.aq_fld = var1.aq_fld - this.ai_fld;
		}

		if (this.aq_fld < 0) {
			this.aq_fld = 0;
		}

		if (!la_fld && var1 != client.nr_fld) {
			throw new AssertionError();
		} else {
			this.an_fld = var1.an_fld + (var1.ag_fld - 1 - var1.aa_fld - client.ey_fld) * 15;
			if (this.au_fld + this.an_fld > bc.qx_fld) {
				this.an_fld = bc.qx_fld - this.au_fld;
			}

			if (this.an_fld < 0) {
				this.an_fld = 0;
			}
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(Lwz;II)Z"
	)
	public static boolean eh(wz var0, int var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (-1 != var0.aa_fld && var0.af_fld[-141267058 * var0.aa_fld] != null && jg(var0.af_fld[var0.aa_fld], var1, var2)) {
				return true;
			} else {
				int var3 = var0.ae(var1, var2, (byte)-18);
				if (-1 != var3) {
					var0.ah(var3, 1366320517);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bc() {
		hg(this, (short)29401);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lwz;S)V"
	)
	public static void hg(wz var0, short var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.aa_fld != -1) {
			if (var0.af_fld[var0.aa_fld] != null) {
				if (var1 <= 419) {
					return;
				}

				var0.af_fld[var0.aa_fld].ar(-1224295421);
			}

			var0.aa_fld = -176008309;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void ah(int var1, int var2) {
		try {
			if (var1 >= 0) {
				qd.fa(
					this.az_fld[var1],
					this.av_fld[var1],
					this.ae_fld[var1],
					this.ah_fld[var1],
					this.aw_fld[var1],
					this.ay_fld[var1],
					this.as_fld[var1],
					this.ar_fld[var1],
					tj.as_fld,
					tj.ar_fld
				);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void as(int var1) {
		this.aa_fld = -176008309;

		for (int var2 = 0; var2 < this.ag_fld; var2++) {
			if (null != this.af_fld[var2]) {
				this.af_fld[var2].as(-629793812);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void ar(int var1) {
		this.nm();
		hg(this, (short)29564);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void au(int var1) {
		BeforeMenuRender var2 = new BeforeMenuRender();
		og.ci_fld.getCallbacks().post(var2);
		if (!var2.isConsumed()) {
			client.rt(this);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void am(int var1, int var2) {
		lb.tm(this, 1385944206);
		this.aq_fld = -650041922 * (var1 - this.ai_fld / 2);
		if (this.ai_fld + this.aq_fld > pf.qw_fld) {
			this.aq_fld = pf.qw_fld - this.ai_fld;
		}

		if (this.aq_fld * -1267908038 < 0) {
			this.aq_fld = 0;
		}

		this.an_fld = var2;
		if (this.au_fld + this.an_fld > bc.qx_fld) {
			this.an_fld = bc.qx_fld - this.au_fld;
		}

		if (-460890451 * this.an_fld < 0) {
			this.an_fld = 0;
		}

		if (this.aa_fld != -1 && null != this.af_fld[this.aa_fld]) {
			this.af_fld[this.aa_fld].av(this, (byte)60);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;"
	)
	public final String ak(int var1, int var2) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.ar_fld[var1].isEmpty() ? this.as_fld[var1] + kh.hq_fld + this.ar_fld[var1] : this.as_fld[var1];
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I"
	)
	final int ae(int var1, int var2, byte var3) {
		int var4 = this == client.nr_fld ? client.ey_fld : client.ks_fld;

		for (int var5 = 0; var5 < this.ag_fld; var5++) {
			int var6 = this.an_fld + (this.ag_fld - 1 - var5 - var4) * 15 + 14;
			if (this.ak_fld) {
				var6 += 17;
			}

			if (var1 > this.aq_fld && var1 < this.ai_fld + this.aq_fld && var2 > var6 - 13 && var2 < var6 + 3) {
				return var5;
			}
		}

		return -1;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void nm() {
		this.am_fld = -1L;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void ad(int var1, int var2) {
		lb.tm(this, -1943760672);
		this.aq_fld = -955959571 * (var1 - this.ai_fld / 2);
		if (this.ai_fld + this.aq_fld > pf.qw_fld) {
			this.aq_fld = pf.qw_fld - this.ai_fld;
		}

		if (this.aq_fld < 0) {
			this.aq_fld = 0;
		}

		this.an_fld = var2;
		if (this.au_fld + this.an_fld > bc.qx_fld) {
			this.an_fld = bc.qx_fld - this.au_fld;
		}

		if (this.an_fld < 0) {
			this.an_fld = 0;
		}

		if (this.aa_fld != -1 && null != this.af_fld[this.aa_fld]) {
			this.af_fld[this.aa_fld].av(this, (byte)113);
		}
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public static void qc(wz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa_fld = -176008309;

		for (int var1 = 0; var1 < var0.ag_fld; var1++) {
			if (null != var0.af_fld[var1]) {
				var0.af_fld[var1].as(-629793812);
			}
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public void ed(wz var1) {
		int var2;
		if (var1 == null) {
			var2 = cu.dl_fld.getTextWidth("Choose Option");
		} else {
			var2 = cu.dl_fld.getTextWidth(var1.ar_fld[var1.aa_fld]);
		}

		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			String var4 = this.as_fld[var3];
			if (!this.ar_fld[var3].isEmpty()) {
				var4 = var4 + " " + this.ar_fld[var3];
			}

			if (this.af_fld[var3] != null) {
				var4 = var4 + " <gt>";
			}

			int var5 = cu.dl_fld.getTextWidth(var4);
			if (var5 > var2) {
				var2 = var5;
			}
		}

		var2 += 8;
		int var7 = this.ag_fld + 4;
		if (this.ak_fld) {
			var7 += 18;
		}

		this.ai_fld = var2;
		this.au_fld = var7;
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 mo(int var1) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else if (this.ag_fld >= this.mw_fld) {
			throw new IllegalStateException("Menu has exceeded the maximum number of entries (" + this.mw_fld + ")");
		} else {
			if (var1 < 0) {
				var1 = this.ag_fld + var1 + 1;
				if (var1 < 0) {
					throw new IllegalArgumentException();
				}
			}

			rl5 var2;
			if (var1 < this.ag_fld) {
				rl5 var3 = this.ne_fld[this.ag_fld];
				if (var3 == null) {
					var3 = this.ne_fld[this.ag_fld] = new rl5(this, this.ag_fld);
				}

				for (int var4 = this.ag_fld; var4 > var1; this.ne_fld[var4].nj_fld = var4--) {
					this.as_fld[var4] = this.as_fld[var4 - 1];
					this.ar_fld[var4] = this.ar_fld[var4 - 1];
					this.ah_fld[var4] = this.ah_fld[var4 - 1];
					this.ae_fld[var4] = this.ae_fld[var4 - 1];
					this.az_fld[var4] = this.az_fld[var4 - 1];
					this.av_fld[var4] = this.av_fld[var4 - 1];
					this.aw_fld[var4] = this.aw_fld[var4 - 1];
					this.ay_fld[var4] = this.ay_fld[var4 - 1];
					this.al_fld[var4] = this.al_fld[var4 - 1];
					this.af_fld[var4] = this.af_fld[var4 - 1];
					this.ne_fld[var4] = this.ne_fld[var4 - 1];
				}

				this.ag_fld = this.ag_fld * -930898849 + 1;
				this.mm_fld = this.ag_fld;
				var2 = var3;
				this.ne_fld[var1] = var3;
				var3.nj_fld = var1;
			} else {
				if (var1 != this.ag_fld) {
					throw new IllegalArgumentException();
				}

				var2 = this.ne_fld[this.ag_fld];
				if (var2 == null) {
					var2 = this.ne_fld[this.ag_fld] = new rl5(this, this.ag_fld);
				}

				this.ag_fld = this.ag_fld * -930898849 + 1;
				this.mm_fld = this.ag_fld;
			}

			this.as_fld[var2.nj_fld] = "";
			this.ar_fld[var2.nj_fld] = "";
			this.ae_fld[var2.nj_fld] = MenuAction.RUNELITE.getId();
			this.ah_fld[var2.nj_fld] = 0;
			this.az_fld[var2.nj_fld] = 0;
			this.av_fld[var2.nj_fld] = 0;
			this.aw_fld[var2.nj_fld] = -1;
			this.ay_fld[var2.nj_fld] = 0;
			this.af_fld[var2.nj_fld] = null;
			var2.qy_fld = null;
			return var2;
		}
	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(Lwz;I)Ljava/lang/String;"
	)
	public static String qy(wz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < 0) {
			return "";
		} else {
			return !var0.ar_fld[var1].isEmpty() ? var0.as_fld[var1] + kh.hq_fld + var0.ar_fld[var1] : var0.as_fld[var1];
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void al(int var1) {
		try {
			this.ah(var1, 434679823);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean db(int var1, int var2) {
		if (this.aa_fld == -1) {
			return false;
		} else {
			wz var3 = this.af_fld[this.aa_fld];
			if (var3 == null) {
				return false;
			} else if (var3.aq_fld > this.aq_fld) {
				int var9 = var3.aq_fld;
				float var10 = oy(var1, var2, var9, var3.an_fld);
				float var11 = oy(this.ey_fld, this.ws_fld, var9, var3.an_fld);
				float var12 = oy(var1, var2, var9, var3.an_fld + var3.au_fld);
				float var13 = oy(this.ey_fld, this.ws_fld, var9, var3.an_fld + var3.au_fld);
				return var10 >= var11 && var12 < var13 || var10 > var11 && var12 <= var13;
			} else {
				int var4 = this.aq_fld;
				float var5 = oy(var1, var2, var4, var3.an_fld);
				float var6 = oy(this.ey_fld, this.ws_fld, var4, var3.an_fld);
				float var7 = oy(var1, var2, var4, var3.an_fld + var3.au_fld);
				float var8 = oy(this.ey_fld, this.ws_fld, var4, var3.an_fld + var3.au_fld);
				return var5 <= var6 && var7 > var8 || var5 < var6 && var7 >= var8;
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I"
	)
	public final int bi(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (this.ag_fld < this.as_fld.length) {
			this.as_fld[this.ag_fld] = var1;
			this.ar_fld[this.ag_fld] = var2;
			this.ae_fld[this.ag_fld] = var3;
			this.ah_fld[this.ag_fld] = var4;
			this.az_fld[this.ag_fld] = var5;
			this.av_fld[this.ag_fld] = var6;
			this.aw_fld[this.ag_fld] = var7;
			this.ay_fld[this.ag_fld] = var9;
			this.al_fld[this.ag_fld] = var8;
			this.af_fld[this.ag_fld] = null;
			return (this.ag_fld += 1120518047) * -930898849 - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	final void ap(wz var1) {
		lb.tm(this, 290729817);
		this.aq_fld = var1.ai_fld + var1.aq_fld;
		if (this.ai_fld + this.aq_fld > pf.qw_fld) {
			this.aq_fld = var1.aq_fld - this.ai_fld;
		}

		if (this.aq_fld < 0) {
			this.aq_fld = 0;
		}

		int var2 = var1.an_fld + (var1.ag_fld - 15 - var1.aa_fld);
		if (var1.ak_fld) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.an_fld = var2;
		if (this.an_fld + this.au_fld > bc.qx_fld) {
			this.an_fld = -893845215 * (var3 - this.au_fld);
		}

		if (this.an_fld < 0) {
			this.an_fld = 0;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lwz;II)Z"
	)
	public static boolean jg(wz var0, int var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (-1 != var0.aa_fld && var0.af_fld[var0.aa_fld] != null && jg(var0.af_fld[var0.aa_fld], var1, var2)) {
				return true;
			} else {
				int var4 = var0.ae(var1, var2, (byte)-66);
				if (-1 != var4) {
					var0.ah(var4, -1412095682);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("getMenuX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMenuX() {
		return this.aq_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int ac(int var1, int var2) {
		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			int var4 = 15 * (this.ag_fld - 1 - var3) + this.an_fld + 14;
			if (this.ak_fld) {
				var4 += 17;
			}

			if (var1 > this.aq_fld && var1 < this.ai_fld + this.aq_fld && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int aj(int var1, int var2) {
		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			int var4 = 15 * (this.ag_fld - 1 - var3) + this.an_fld + 14;
			if (this.ak_fld) {
				var4 += 17;
			}

			if (var1 > this.aq_fld && var1 < this.ai_fld + this.aq_fld && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int bm(int var1, int var2) {
		for (int var3 = 0; var3 < this.ag_fld; var3++) {
			int var4 = 15 * (this.ag_fld - 1 - var3) + this.an_fld + 14;
			if (this.ak_fld) {
				var4 += 17;
			}

			if (var1 > this.aq_fld && var1 < this.ai_fld + this.aq_fld && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ht() {
		this.ar(263560702);
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ri() {
		hg(this, (short)29564);
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Lwz;I)Ljava/lang/String;"
	)
	public static String qh(wz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < 0) {
			return "";
		} else {
			return !var0.ar_fld[var1].isEmpty() ? var0.as_fld[var1] + kh.hq_fld + var0.ar_fld[var1] : var0.as_fld[var1];
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lwz;IIB)Z"
	)
	public static boolean ls(wz var0, int var1, int var2, byte var3) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			boolean var4;
			if (var0.aa_fld != -1 && var0.af_fld[var0.aa_fld] != null && var0.af_fld[var0.aa_fld].ry(var1, var2)) {
				var4 = true;
			} else if (var1 >= var0.aq_fld - 10 && var1 <= var0.ai_fld + var0.aq_fld + 10 && var2 >= var0.an_fld - 10 && var2 <= var0.au_fld + var0.an_fld + 10) {
				int var5 = var0.cv(var1, var2);
				if (var5 != -1 && var5 != var0.aa_fld) {
					long var6 = og.ci_fld.getGameCycle();
					int var8 = var5;
					long var9 = Math.max(var6, var0.am_fld);
					if (var0.aa_fld != -1) {
						if (var0.db(var1, var2)) {
							var8 = -1;
							var9 = Long.MAX_VALUE;
						} else if (var0.ax_fld == -1) {
							if (var1 == var0.ey_fld && var2 == var0.ws_fld) {
								var9 = var6 + 8L;
							} else {
								var9 = var6 + 2L;
							}
						}
					}

					var0.ax_fld = var8;
					var0.am_fld = var9;
					if (var0.am_fld <= var6) {
						var0.ax_fld = -1;
						var0.ri();
						wz var11 = var0.af_fld[var5];
						if (var11 != null) {
							var0.aa_fld = var5;
							var11.xn(var0);
							client.na_fld = 0;
							client.ks_fld = 0;
							if (var11.au_fld > og.ci_fld.getCanvasHeight()) {
								client.ks_fld = 0;
								client.na_fld = (var11.au_fld - og.ci_fld.getCanvasHeight() + 14) / 15;
							}
						}
					}
				}

				var4 = true;
			} else {
				var4 = false;
			}

			var0.ey_fld = var1;
			var0.ws_fld = var2;
			return var4;
		}
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("createMenuEntry")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/MenuEntry;"
	)
	@Override
	public MenuEntry createMenuEntry(int var1) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			return this.mo(var1);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void bz(int var1) {
		try {
			if (var1 >= 0) {
				qd.fa(
					this.az_fld[var1],
					this.av_fld[var1],
					this.ae_fld[var1],
					this.ah_fld[var1],
					this.aw_fld[var1],
					this.ay_fld[var1],
					this.as_fld[var1],
					this.ar_fld[var1],
					tj.as_fld,
					tj.ar_fld
				);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void br(int var1) {
		try {
			if (var1 >= 0) {
				qd.fa(
					this.az_fld[var1],
					this.av_fld[var1],
					this.ae_fld[var1],
					this.ah_fld[var1],
					this.aw_fld[var1],
					this.ay_fld[var1],
					this.as_fld[var1],
					this.ar_fld[var1],
					tj.as_fld,
					tj.ar_fld
				);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lwz;Lwz;)V"
	)
	public static void ne(wz var0, wz var1) {
		if (var0 == null) {
			var0.getClass();
		}

		lb.tm(var0, -558014707);
		var0.aq_fld = var1.ai_fld + var1.aq_fld;
		if (var0.ai_fld + var0.aq_fld > pf.qw_fld) {
			var0.aq_fld = var1.aq_fld - var0.ai_fld;
		}

		if (-954617658 * var0.aq_fld < 0) {
			var0.aq_fld = 0;
		}

		int var2 = var1.an_fld + (var1.ag_fld - 15 - var1.aa_fld);
		if (var1.ak_fld) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		var0.an_fld = 64586768 * var2;
		if (var0.an_fld + var0.au_fld > bc.qx_fld) {
			var0.an_fld = -893845215 * (var3 - var0.au_fld);
		}

		if (-405794088 * var0.an_fld < 0) {
			var0.an_fld = 0;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public final boolean be(int var1, int var2) {
		if (this.aa_fld != -1 && this.af_fld[this.aa_fld] != null && ls(this.af_fld[this.aa_fld], var1, var2, (byte)-10)) {
			return true;
		} else if (var1 >= this.aq_fld - 10 && var1 <= 10 + this.ai_fld + this.aq_fld && var2 >= this.an_fld - 10 && var2 <= this.au_fld + this.an_fld + 10) {
			int var3 = this.ae(var1, var2, (byte)-119);
			if (-1 != var3 && var3 != this.aa_fld) {
				if (var3 != this.ax_fld) {
					this.ax_fld = var3;
					this.am_fld = lz.ak();
					if (this.aa_fld != -1) {
						this.am_fld += 300L;
					}
				}

				if (this.am_fld <= lz.ak()) {
					this.ax_fld = 1715384015;
					hg(this, (short)1453);
					if (null != this.af_fld[var3]) {
						this.aa_fld = var3;
						this.af_fld[var3].av(this, (byte)49);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bl() {
		int var1 = -524091013 * this.aq_fld;
		int var2 = 662435170 * this.an_fld;
		int var3 = -1798968090;
		yu.dj(var1, var2, this.ai_fld, this.au_fld, var3);
		if (this.ak_fld) {
			yu.dj(1 + var1, var2 + 1, this.ai_fld - 2, 16, 0);
			yu.ed(var1 + 1, var2 + 18, this.ai_fld - 2, this.au_fld - 19, 0);
			zv.uj(cu.dl_fld, kh.hf_fld, 3 + var1, 14 + var2, var3, -1);
		} else {
			yu.ed(1 + var1, 1 + var2, this.ai_fld - 2, this.au_fld - 2, 0);
		}

		int var4 = -120908884 * tj.ae_fld;
		int var5 = tj.ah_fld;

		for (int var6 = 0; var6 < this.ag_fld; var6++) {
			int var7 = 14 + var2 + (this.ag_fld - 1 - var6) * 15;
			if (this.ak_fld) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < this.ai_fld + var1 && var5 > var7 - 13 && var5 < 3 + var7) {
				var8 = 16776960;
			}

			if (var6 == this.aa_fld || this.ax_fld == var6 && null != this.af_fld[var6]) {
				yu.dj(2 + var1, var7 - 12, this.ai_fld - 4, 15, 7496785);
			}

			zv.uj(cu.dl_fld, this.ak(var6, -990474041), var1 + 3, var7, var8, 0);
			if (this.af_fld[var6] != null) {
				cu.dl_fld.bk(822659648, this.ai_fld + var1 - 10, var7, 16777215);
			}
		}

		if (this.aa_fld != -1 && this.af_fld[this.aa_fld * 150808738] != null) {
			this.af_fld[-1767972534 * this.aa_fld].au(1949039079);
		}
	}

	@ObfuscatedName("getMenuWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMenuWidth() {
		return this.ai_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BI)V"
	)
	static void al(byte[] var0, int var1) {
		xi var2 = new xi(var0);
		var2.au_fld = 228932457 * (var0.length - 2);
		yh.ak_fld = xi.tx(var2, 814890427);
		yh.av_fld = new int[yh.ak_fld];
		yh.ae_fld = new int[yh.ak_fld];
		yh.ah_fld = new int[yh.ak_fld];
		yh.aw_fld = new int[yh.ak_fld];
		yo.as_fld = new byte[yh.ak_fld][];
		var2.au_fld = var0.length - 7 - yh.ak_fld;
		yh.ag_fld = xi.tx(var2, 2002325764);
		yh.az_fld = xi.tx(var2, 410128123);
		int var3 = (var2.cg() & 0xFF) + 1;

		for (int var4 = 0; var4 < yh.ak_fld; var4++) {
			yh.av_fld[var4] = xi.tx(var2, 1234205057);
		}

		for (int var14 = 0; var14 < yh.ak_fld; var14++) {
			yh.ae_fld[var14] = xi.tx(var2, 2141254423);
		}

		for (int var15 = 0; var15 < yh.ak_fld; var15++) {
			yh.ah_fld[var15] = xi.tx(var2, 347572063);
		}

		for (int var16 = 0; var16 < yh.ak_fld; var16++) {
			if (var1 <= -1246429003) {
				return;
			}

			yh.aw_fld[var16] = xi.tx(var2, 2023104693);
		}

		var2.au_fld = 228932457 * (var0.length - 7 - yh.ak_fld - (var3 - 1) * 3);
		yh.ay_fld = new int[var3];

		for (int var17 = 1; var17 < var3; var17++) {
			yh.ay_fld[var17] = var2.ck();
			if (yh.ay_fld[var17] == 0) {
				yh.ay_fld[var17] = 1;
			}
		}

		var2.au_fld = 0;

		for (int var18 = 0; var18 < yh.ak_fld; var18++) {
			int var5 = yh.ah_fld[var18];
			int var6 = yh.aw_fld[var18];
			int var7 = var6 * var5;
			byte[] var8 = new byte[var7];
			yo.as_fld[var18] = var8;
			int var9 = var2.cg();
			boolean var10000;
			if (1 == (var9 & 1)) {
				if (var1 <= -1246429003) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var10 = var10000;
			boolean var11 = (var9 & 2) == 2;
			if (!var10) {
				for (int var19 = 0; var19 < var7; var19++) {
					var8[var19] = xi.rp(var2, -2001074012);
				}
			} else {
				for (int var12 = 0; var12 < var5; var12++) {
					for (int var13 = 0; var13 < var6; var13++) {
						var8[var13 * var5 + var12] = xi.rp(var2, -2117403312);
					}
				}
			}

			if (var11) {
				var2.au_fld += var7 * 228932457;
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public final boolean bk(int var1, int var2) {
		try {
			if (-1 != this.aa_fld && this.af_fld[this.aa_fld] != null && jg(this.af_fld[this.aa_fld], var1, var2)) {
				return true;
			} else {
				int var3 = this.ae(var1, var2, (byte)-104);
				if (-1 != var3) {
					this.ah(var3, 1389946163);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public final boolean bj(int var1, int var2) {
		try {
			if (-1 != this.aa_fld && this.af_fld[this.aa_fld] != null && jg(this.af_fld[this.aa_fld], var1, var2)) {
				return true;
			} else {
				int var3 = this.ae(var1, var2, (byte)-105);
				if (-1 != var3) {
					this.ah(var3, -650875650);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void gt(int var1, int var2) {
		try {
			jg(this, var1, var2);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public final String an(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.ar_fld[var1].isEmpty() ? this.as_fld[var1] + kh.hq_fld + this.ar_fld[var1] : this.as_fld[var1];
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
		this.ai_fld = cu.dl_fld.an(kh.hf_fld) * 1488058010;

		for (int var1 = 0; var1 < this.ag_fld; var1++) {
			int var2 = cu.dl_fld.an(this.ak(var1, 1100909311));
			if (null != this.af_fld[var1]) {
				var2 += 15;
			}

			if (var2 > this.ai_fld) {
				this.ai_fld = var2 * -510239970;
			}
		}

		this.ai_fld += 1957934611;
		this.au_fld = this.ag_fld + -799381740;
		if (this.ak_fld) {
			this.au_fld += -1583739851;
		}
	}

	@ObfuscatedName("getMenuEntries")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/MenuEntry;"
	)
	@Override
	public MenuEntry[] getMenuEntries() {
		return (MenuEntry[])(MenuEntry[])Arrays.copyOf(this.ne_fld, this.ag_fld);
	}

	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "(Lwz;I)V"
	)
	public static void rt(wz var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var1 >= 0) {
				qd.fa(
					var0.az_fld[var1],
					var0.av_fld[var1],
					var0.ae_fld[var1],
					var0.ah_fld[var1],
					var0.aw_fld[var1],
					var0.ay_fld[var1],
					var0.as_fld[var1],
					var0.ar_fld[var1],
					tj.as_fld,
					tj.ar_fld
				);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void ao(int var1, int var2) {
		lb.tm(this, -932493222);
		this.aq_fld = -955959571 * (var1 - this.ai_fld / 2);
		if (this.ai_fld + this.aq_fld > pf.qw_fld) {
			this.aq_fld = pf.qw_fld - this.ai_fld;
		}

		if (this.aq_fld < 0) {
			this.aq_fld = 0;
		}

		this.an_fld = var2;
		if (this.au_fld + this.an_fld > bc.qx_fld) {
			this.an_fld = bc.qx_fld - this.au_fld;
		}

		if (this.an_fld < 0) {
			this.an_fld = 0;
		}

		if (this.aa_fld != -1 && null != this.af_fld[this.aa_fld]) {
			this.af_fld[this.aa_fld].av(this, (byte)69);
		}
	}

	public wz(boolean var1) {
		int var2 = var1 ? 500 : 64;
		this.ag_fld = 0;
		this.az_fld = new int[var2];
		this.av_fld = new int[var2];
		this.ae_fld = new int[var2];
		this.ah_fld = new int[var2];
		this.aw_fld = new int[var2];
		this.ay_fld = new int[var2];
		this.as_fld = new String[var2];
		this.ar_fld = new String[var2];
		this.af_fld = new wz[var2];
		this.al_fld = new boolean[var2];
		this.mw_fld = var2;
		this.ne_fld = new rl5[var2];
		this.ak_fld = true;
	}

	@ObfuscatedName("getMenuY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMenuY() {
		return this.an_fld;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public static void hy(wz var0) {
		int var1 = var0.aq_fld;
		int var2 = var0.an_fld;
		int var3 = 6116423;
		yu.dj(var1, var2, var0.ai_fld, var0.au_fld, var3);
		if (var0.ak_fld) {
			yu.dj(1 + var1, var2 + 1, var0.ai_fld - 2, 16, 0);
			yu.ed(var1 + 1, var2 + 18, var0.ai_fld - 2, var0.au_fld - 19, 0);
			zv.uj(cu.dl_fld, kh.hf_fld, 3 + var1, 14 + var2, var3, -1);
		} else {
			yu.ed(1 + var1, 1 + var2, var0.ai_fld - 2, var0.au_fld - 2, 0);
		}

		int var4 = tj.ae_fld;
		int var5 = tj.ah_fld;

		for (int var6 = 0; var6 < var0.ag_fld; var6++) {
			int var7 = 14 + var2 + (var0.ag_fld - 1 - var6) * 15;
			if (var0.ak_fld) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < var0.ai_fld + var1 && var5 > var7 - 13 && var5 < 3 + var7) {
				var8 = 16776960;
			}

			if (var6 == var0.aa_fld || var0.ax_fld == var6 && null != var0.af_fld[var6]) {
				yu.dj(2 + var1, var7 - 12, var0.ai_fld - 4, 15, 7496785);
			}

			zv.uj(cu.dl_fld, var0.ak(var6, -2070200544), var1 + 3, var7, var8, 0);
			if (var0.af_fld[var6] != null) {
				cu.dl_fld.bk(62, var0.ai_fld + var1 - 10, var7, 16777215);
			}
		}

		if (var0.aa_fld != -1 && var0.af_fld[var0.aa_fld] != null) {
			var0.af_fld[var0.aa_fld].au(169699247);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public final boolean bs(int var1, int var2) {
		if (this.aa_fld != -1 && this.af_fld[this.aa_fld * -1732359966] != null && ls(this.af_fld[this.aa_fld], var1, var2, (byte)-10)) {
			return true;
		} else if (var1 >= this.aq_fld - 10 && var1 <= 10 + this.ai_fld + this.aq_fld && var2 >= this.an_fld - 10 && var2 <= this.au_fld + this.an_fld + 10) {
			int var3 = this.ae(var1, var2, (byte)-75);
			if (-1 != var3 && var3 != this.aa_fld) {
				if (var3 != this.ax_fld) {
					this.ax_fld = var3;
					this.am_fld = lz.ak();
					if (this.aa_fld != -1) {
						this.am_fld += 300L;
					}
				}

				if (this.am_fld <= lz.ak()) {
					this.ax_fld = 1435904831;
					hg(this, (short)17752);
					if (null != this.af_fld[var3]) {
						this.aa_fld = 1495586608 * var3;
						this.af_fld[var3].av(this, (byte)84);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bv() {
		if (this.aa_fld != -1) {
			if (this.af_fld[634477213 * this.aa_fld] != null) {
				this.af_fld[892519906 * this.aa_fld].ar(-1914667578);
			}

			this.aa_fld = -1245414902;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I"
	)
	public final int bn(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (this.ag_fld < this.as_fld.length) {
			this.as_fld[this.ag_fld * -957588376] = var1;
			this.ar_fld[this.ag_fld * 1738059415] = var2;
			this.ae_fld[-1317086979 * this.ag_fld] = var3;
			this.ah_fld[706589578 * this.ag_fld] = var4;
			this.az_fld[this.ag_fld] = var5;
			this.av_fld[this.ag_fld * 634051032] = var6;
			this.aw_fld[this.ag_fld * -2055851220] = var7;
			this.ay_fld[this.ag_fld * 1661846058] = var9;
			this.al_fld[this.ag_fld * 1759567742] = var8;
			this.af_fld[this.ag_fld] = null;
			return (this.ag_fld += 572666071) * 450221003 - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("yf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void yf(int var1) {
		int var2 = this.mm_fld;
		int var3 = this.ag_fld;
		this.mm_fld = var3;
		if (var3 < var2) {
			for (int var4 = var3; var4 < var2; var4++) {
				this.ne_fld[var4].qy_fld = null;
			}
		} else if (var3 == var2 + 1) {
			rl5 var6 = this.ne_fld[var2];
			if (var6 == null) {
				var6 = this.ne_fld[var2] = new rl5(this, var2);
			} else {
				var6.qy_fld = null;
			}

			MenuEntryAdded var5 = new MenuEntryAdded(var6);
			og.ci_fld.getCallbacks().post(var5);
		}
	}

	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void qg(int var1, int var2) {
		if (!la_fld && var1 == var2) {
			throw new AssertionError();
		} else {
			String var3 = this.as_fld[var1];
			this.as_fld[var1] = this.as_fld[var2];
			this.as_fld[var2] = var3;
			var3 = this.ar_fld[var1];
			this.ar_fld[var1] = this.ar_fld[var2];
			this.ar_fld[var2] = var3;
			int var4 = this.ah_fld[var1];
			this.ah_fld[var1] = this.ah_fld[var2];
			this.ah_fld[var2] = var4;
			var4 = this.ae_fld[var1];
			this.ae_fld[var1] = this.ae_fld[var2];
			this.ae_fld[var2] = var4;
			var4 = this.az_fld[var1];
			this.az_fld[var1] = this.az_fld[var2];
			this.az_fld[var2] = var4;
			var4 = this.av_fld[var1];
			this.av_fld[var1] = this.av_fld[var2];
			this.av_fld[var2] = var4;
			var4 = this.aw_fld[var1];
			this.aw_fld[var1] = this.aw_fld[var2];
			this.aw_fld[var2] = var4;
			var4 = this.ay_fld[var1];
			this.ay_fld[var1] = this.ay_fld[var2];
			this.ay_fld[var2] = var4;
			boolean var5 = this.al_fld[var1];
			this.al_fld[var1] = this.al_fld[var2];
			this.al_fld[var2] = var5;
			wz var6 = this.af_fld[var1];
			this.af_fld[var1] = this.af_fld[var2];
			this.af_fld[var2] = var6;
			if (!la_fld && this.ne_fld[var1].tk_fld != this) {
				throw new AssertionError();
			} else if (!la_fld && this.ne_fld[var2].tk_fld != this) {
				throw new AssertionError();
			} else if (!la_fld && this.ne_fld[var1].nj_fld != var1) {
				throw new AssertionError();
			} else if (!la_fld && this.ne_fld[var2].nj_fld != var2) {
				throw new AssertionError();
			} else {
				rl5 var7 = this.ne_fld[var1];
				this.ne_fld[var1] = this.ne_fld[var2];
				this.ne_fld[var2] = var7;
				this.ne_fld[var1].nj_fld = var1;
				this.ne_fld[var2].nj_fld = var2;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I"
	)
	public final int al(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10) {
		if (this.ag_fld < this.as_fld.length) {
			this.as_fld[this.ag_fld] = var1;
			this.ar_fld[this.ag_fld] = var2;
			this.ae_fld[this.ag_fld] = var3;
			this.ah_fld[this.ag_fld] = var4;
			this.az_fld[this.ag_fld] = var5;
			this.av_fld[this.ag_fld] = var6;
			this.aw_fld[this.ag_fld] = var7;
			this.ay_fld[this.ag_fld] = var9;
			this.al_fld[this.ag_fld] = var8;
			this.af_fld[this.ag_fld] = null;
			int var10000 = this.ag_fld += 1120518047;
			this.yf(-1);
			return var10000 * -930898849 - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void by() {
		hg(this, (short)23418);
	}

	@ObfuscatedName("getMenuHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMenuHeight() {
		return this.au_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I"
	)
	public final int bu(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (this.ag_fld < this.as_fld.length) {
			this.as_fld[this.ag_fld * -2034662020] = var1;
			this.ar_fld[this.ag_fld * 37248620] = var2;
			this.ae_fld[this.ag_fld] = var3;
			this.ah_fld[376264987 * this.ag_fld] = var4;
			this.az_fld[this.ag_fld] = var5;
			this.av_fld[this.ag_fld] = var6;
			this.aw_fld[this.ag_fld] = var7;
			this.ay_fld[this.ag_fld * -511021042] = var9;
			this.al_fld[this.ag_fld * -1954898515] = var8;
			this.af_fld[this.ag_fld] = null;
			return (this.ag_fld += 1120518047) * -1825065699 - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(IIII)F"
	)
	public static float oy(int var0, int var1, int var2, int var3) {
		return ((float)var1 - var3) / (var2 - var0);
	}

	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public static void xb(wz var0) {
		if (var0.aa_fld != -1) {
			if (var0.af_fld[654679077 * var0.aa_fld] != null) {
				var0.af_fld[var0.aa_fld].ar(-1536265037);
			}

			var0.aa_fld = 1784034049;
		}
	}

	@ObfuscatedName("removeMenuEntry")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/MenuEntry;)V"
	)
	@Override
	public void removeMenuEntry(MenuEntry var1) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			rl5 var2 = (rl5)var1;
			int var3 = var2.nj_fld;
			if (var2.tk_fld == this && var3 < this.ag_fld) {
				if (la_fld || var3 >= 0 && var3 < this.ag_fld) {
					for (int var4 = var3; var4 < this.ag_fld - 1; this.ne_fld[var4].nj_fld = var4++) {
						this.as_fld[var4] = this.as_fld[var4 + 1];
						this.ar_fld[var4] = this.ar_fld[var4 + 1];
						this.ah_fld[var4] = this.ah_fld[var4 + 1];
						this.ae_fld[var4] = this.ae_fld[var4 + 1];
						this.az_fld[var4] = this.az_fld[var4 + 1];
						this.av_fld[var4] = this.av_fld[var4 + 1];
						this.aw_fld[var4] = this.aw_fld[var4 + 1];
						this.ay_fld[var4] = this.ay_fld[var4 + 1];
						this.al_fld[var4] = this.al_fld[var4 + 1];
						this.af_fld[var4] = this.af_fld[var4 + 1];
						this.ne_fld[var4] = this.ne_fld[var4 + 1];
					}

					var2.nj_fld = this.ag_fld - 1;
					this.ne_fld[this.ag_fld - 1] = var2;
					this.ag_fld = this.ag_fld * -930898849 - 1;
					this.mm_fld = this.ag_fld;
				} else {
					throw new AssertionError();
				}
			} else {
				throw new IllegalArgumentException("entry doesn't belong to menu");
			}
		}
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void op() {
		this.as(-629793812);
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lwz;Lwz;)V"
	)
	public static void le(wz var0, wz var1) {
		if (var0 == null) {
			var0.getClass();
		}

		lb.tm(var0, -202485118);
		var0.aq_fld = var1.ai_fld + var1.aq_fld;
		if (var0.ai_fld + var0.aq_fld > pf.qw_fld) {
			var0.aq_fld = var1.aq_fld - var0.ai_fld;
		}

		if (var0.aq_fld < 0) {
			var0.aq_fld = 0;
		}

		int var2 = var1.an_fld + (var1.ag_fld - 15 - var1.aa_fld);
		if (var1.ak_fld) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		var0.an_fld = var2;
		if (var0.an_fld + var0.au_fld > bc.qx_fld) {
			var0.an_fld = -1373651268 * (var3 - var0.au_fld);
		}

		if (1164975058 * var0.an_fld < 0) {
			var0.an_fld = 0;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int cv(int var1, int var2) {
		return this.ae(var1, var2, (byte)-66);
	}

	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ry(int var1, int var2) {
		return ls(this, var1, var2, (byte)-10);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	final void af(short var1) {
		if (this.an_fld != -1) {
			if (this.af_fld[-906902563 * this.ai_fld] != null) {
				if (var1 <= 419) {
					return;
				}

				this.af_fld[-906902563 * this.au_fld].au(-1224295421);
			}

			this.ax_fld = -176008309;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ag(int var1) {
		this.ed(null);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	public final boolean aw(int var1, int var2, byte var3) {
		boolean var4;
		if (this.ai_fld != -1 && this.af_fld[this.an_fld * -906902563] != null && this.af_fld[this.aq_fld * -906902563].db(var1, var2)) {
			var4 = true;
		} else if (var1 >= this.au_fld - 10 && var1 <= this.au_fld + this.aa_fld + 10 && var2 >= this.ai_fld - 10 && var2 <= this.aa_fld + this.an_fld + 10) {
			int var5 = this.cv(var1, var2);
			if (var5 != -1 && var5 != this.ax_fld) {
				long var6 = og.ci_fld.getRasterizer3D_clipMidX2();
				int var8 = var5;
				long var9 = Math.max(var6, this.am_fld);
				if (this.an_fld != -1) {
					if (this.db(var1, var2)) {
						var8 = -1;
						var9 = Long.MAX_VALUE;
					} else if (this.au_fld == -1) {
						if (var1 == this.ey_fld && var2 == this.ag_fld) {
							var9 = var6 + 8L;
						} else {
							var9 = var6 + 2L;
						}
					}
				}

				this.aq_fld = var8 * -1715384015;
				this.am_fld = var9;
				if (this.am_fld <= var6) {
					this.aq_fld = -1 * -1715384015;
					this.op();
					wz var11 = this.af_fld[var5];
					if (var11 != null) {
						this.an_fld = var5 * 176008309;
						var11.ed(this);
						client.wa_fld = 0;
						client.jl_fld = 0;
						if (var11.an_fld > og.ci_fld.getRasterizer3D_clipNegativeMidX()) {
							client.xn_fld = 0;
							client.ok_fld = (var11.aa_fld - og.ci_fld.getCameraYaw() + 14) / 15;
						}
					}
				}
			}

			var4 = true;
		} else {
			var4 = false;
		}

		this.mm_fld = var1;
		this.ws_fld = var2;
		return var4;
	}

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public void xn(wz var1) {
		this.av(var1, (byte)11);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public final boolean ay(int var1, int var2, int var3) {
		try {
			if (-1 != this.au_fld && this.af_fld[-906902563 * this.au_fld] != null && jg(this.af_fld[-906902563 * this.an_fld], var1, var2)) {
				return true;
			} else {
				int var4 = this.ae(var1, var2, (byte)-66);
				if (-1 != var4) {
					this.am(var4, -1412095682);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("xg")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void xg(int var1, int var2) {
		this.az(var1, var2, 986514081);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public final boolean bh(int var1, int var2) {
		try {
			if (-1 != this.aa_fld && this.af_fld[-906902563 * this.an_fld] != null && jg(this.af_fld[-906902563 * this.an_fld], var1, var2)) {
				return true;
			} else {
				int var3 = this.ae(var1, var2, (byte)-105);
				if (-1 != var3) {
					this.ao(var3, -650875650);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}
}
