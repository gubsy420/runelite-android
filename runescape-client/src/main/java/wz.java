import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.Menu;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.BeforeMenuRender;
import net.runelite.api.events.MenuEntryAdded;

@ObfuscatedName("wz")
@Implements({"Menu"})
public class wz implements Menu {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ee_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -906902563
	)
	int ai_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ay_fld;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -930898849
	)
	public int ot_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 958556113
	)
	int aq_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ae_fld;
	// $VF: synthetic field
	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public static boolean zk_fld = !wz.class.desiredAssertionStatus();
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ah_fld;
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
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1120518047
	)
	public int ag_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lwz;"
	)
	public wz[] af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	public boolean[] al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1323538149
	)
	int au_fld;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -930898849
	)
	public int kc_fld = -1;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1881916129
	)
	int ax_fld;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -930898849
	)
	public int en_fld = -1;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] az_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -670991091
	)
	int aa_fld;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "[Lrl5;"
	)
	public rl5[] vh_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1435734125
	)
	int an_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -5285149903467884903L
	)
	long am_fld;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cz_fld;

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bf() {
		this.ai_fld = -176008309;

		for (int var1 = 0; var1 < this.ot_fld; var1++) {
			if (null != this.af_fld[var1]) {
				this.af_fld[var1].as(-629793812);
			}
		}
	}

	@ObfuscatedName("zl")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public void zl(wz var1) {
		int var2;
		if (var1 == null) {
			var2 = cu.dl_fld.getTextWidth("Choose Option");
		} else {
			var2 = cu.dl_fld.getTextWidth(var1.ar_fld[var1.ai_fld]);
		}

		for (int var3 = 0; var3 < this.ot_fld; var3++) {
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
		int var7 = this.ot_fld + 4;
		if (this.ak_fld) {
			var7 += 18;
		}

		this.an_fld = var2;
		this.aa_fld = var7;
	}

	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public void qm(wz var1) {
		cf(this, var1, (byte)11);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	final void af(short var1) {
		if (this.ai_fld != -1) {
			if (this.af_fld[this.ai_fld] != null) {
				if (var1 <= 419) {
					return;
				}

				this.af_fld[this.ai_fld].ar(-1224295421);
			}

			this.ai_fld = -176008309;
		}
	}

	@ObfuscatedName("zr")
	@ObfuscatedSignature(
		descriptor = "(Lwz;Lwz;)V"
	)
	public static void zr(wz var0, wz var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ag(-558014707);
			var0.au_fld = var1.an_fld + var1.au_fld;
			if (var0.an_fld + var0.au_fld > pf.qw_fld) {
				var0.au_fld = var1.au_fld - var0.an_fld;
			}

			if (-954617658 * var0.au_fld < 0) {
				var0.au_fld = 0;
			}

			int var2 = var1.ax_fld + (var1.ot_fld - 15 - var1.ai_fld);
			if (var1.ak_fld) {
				var2 += 17;
			}

			int var3 = var2 + 19;
			var0.ax_fld = 64586768 * var2;
			if (var0.ax_fld + var0.aa_fld > bc.qx_fld) {
				var0.ax_fld = -893845215 * (var3 - var0.aa_fld);
			}

			if (-405794088 * var0.ax_fld < 0) {
				var0.ax_fld = 0;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ag(int var1) {
		this.zl(null);
	}

	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean vb(int var1, int var2) {
		return this.aw(var1, var2, (byte)-10);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public final void az(int var1, int var2, int var3) {
		this.ag(-587498666);
		this.au_fld = -955959571 * (var1 - this.an_fld / 2);
		if (this.an_fld + this.au_fld > pf.qw_fld) {
			this.au_fld = pf.qw_fld - this.an_fld;
		}

		if (this.au_fld < 0) {
			this.au_fld = 0;
		}

		this.ax_fld = var2;
		if (this.aa_fld + this.ax_fld > bc.qx_fld) {
			this.ax_fld = bc.qx_fld - this.aa_fld;
		}

		if (this.ax_fld < 0) {
			this.ax_fld = 0;
		}

		if (this.ai_fld != -1) {
			if (var3 == 1384127158) {
				return;
			}

			if (null != this.af_fld[this.ai_fld]) {
				cf(this.af_fld[this.ai_fld], this, (byte)102);
			}
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z"
	)
	public final boolean aw(int var1, int var2, byte var3) {
		boolean var4;
		if (this.ai_fld != -1 && this.af_fld[this.ai_fld] != null && this.af_fld[this.ai_fld].vb(var1, var2)) {
			var4 = true;
		} else if (var1 >= this.au_fld - 10 && var1 <= this.an_fld + this.au_fld + 10 && var2 >= this.ax_fld - 10 && var2 <= this.aa_fld + this.ax_fld + 10) {
			int var5 = this.cz(var1, var2);
			if (var5 != -1 && var5 != this.ai_fld) {
				long var6 = og.ci_fld.getGameCycle();
				int var8 = var5;
				long var9 = Math.max(var6, this.am_fld);
				if (this.ai_fld != -1) {
					if (this.ea(var1, var2)) {
						var8 = -1;
						var9 = Long.MAX_VALUE;
					} else if (this.aq_fld == -1) {
						if (var1 == this.kc_fld && var2 == this.en_fld) {
							var9 = var6 + 8L;
						} else {
							var9 = var6 + 2L;
						}
					}
				}

				this.aq_fld = var8;
				this.am_fld = var9;
				if (this.am_fld <= var6) {
					this.aq_fld = -1;
					this.mm();
					wz var11 = this.af_fld[var5];
					if (var11 != null) {
						this.ai_fld = var5;
						var11.qm(this);
						client.zh_fld = 0;
						client.ue_fld = 0;
						if (var11.aa_fld > og.ci_fld.getCanvasHeight()) {
							client.ue_fld = 0;
							client.zh_fld = (var11.aa_fld - og.ci_fld.getCanvasHeight() + 14) / 15;
						}
					}
				}
			}

			var4 = true;
		} else {
			var4 = false;
		}

		this.kc_fld = var1;
		this.en_fld = var2;
		return var4;
	}

	@ObfuscatedName("getMenuEntries")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/MenuEntry;"
	)
	@Export("getMenuEntries")
	@Override
	public MenuEntry[] getMenuEntries() {
		return (MenuEntry[])(MenuEntry[])Arrays.copyOf(this.vh_fld, this.ot_fld);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public final boolean ay(int var1, int var2, int var3) {
		try {
			if (-1 != this.ai_fld && this.af_fld[this.ai_fld] != null && this.af_fld[this.ai_fld].ay(var1, var2, 1816843707)) {
				return true;
			} else {
				int var4 = this.ae(var1, var2, (byte)-66);
				if (-1 != var4) {
					this.ah(var4, -1412095682);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void as(int var1) {
		this.ai_fld = -176008309;

		for (int var2 = 0; var2 < this.ot_fld; var2++) {
			if (null != this.af_fld[var2]) {
				this.af_fld[var2].as(-629793812);
			}
		}
	}

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void xi(int var1, int var2) {
		if (!zk_fld && var1 == var2) {
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
			if (!zk_fld && this.vh_fld[var1].qp_fld != this) {
				throw new AssertionError();
			} else if (!zk_fld && this.vh_fld[var2].qp_fld != this) {
				throw new AssertionError();
			} else if (!zk_fld && this.vh_fld[var1].sj_fld != var1) {
				throw new AssertionError();
			} else if (!zk_fld && this.vh_fld[var2].sj_fld != var2) {
				throw new AssertionError();
			} else {
				rl5 var7 = this.vh_fld[var1];
				this.vh_fld[var1] = this.vh_fld[var2];
				this.vh_fld[var2] = var7;
				this.vh_fld[var1].sj_fld = var1;
				this.vh_fld[var2].sj_fld = var2;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void ar(int var1) {
		this.ja();
		this.af((short)29564);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public final boolean bh(int var1, int var2) {
		try {
			if (-1 != this.ai_fld && this.af_fld[-141267058 * this.ai_fld] != null && this.af_fld[this.ai_fld].ay(var1, var2, 1352541606)) {
				return true;
			} else {
				int var3 = this.ae(var1, var2, (byte)-18);
				if (-1 != var3) {
					this.ah(var3, 1366320517);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lwz;II)Z"
	)
	public static boolean jw(wz var0, int var1, int var2) throws EOFException {
		try {
			if (-1 != var0.ai_fld && var0.af_fld[var0.ai_fld] != null && var0.af_fld[var0.ai_fld].ay(var1, var2, -1545476325)) {
				return true;
			} else {
				int var3 = var0.ae(var1, var2, (byte)-105);
				if (-1 != var3) {
					var0.ah(var3, -650875650);
					return true;
				} else {
					return false;
				}
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bt() {
		if (this.ai_fld != -1) {
			if (this.af_fld[this.ai_fld] != null) {
				this.af_fld[this.ai_fld].ar(1167085109);
			}

			this.ai_fld = -176008309;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void au(int var1) {
		BeforeMenuRender var2 = new BeforeMenuRender();
		og.ci_fld.getCallbacks().post(var2);
		if (!var2.isConsumed()) {
			client.hf(this);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public final String aa(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.ar_fld[var1].isEmpty() ? this.as_fld[var1] + kh.hq_fld + this.ar_fld[var1] : this.as_fld[var1];
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void am(int var1, int var2) {
		this.ag(1385944206);
		this.au_fld = -650041922 * (var1 - this.an_fld / 2);
		if (this.an_fld + this.au_fld > pf.qw_fld) {
			this.au_fld = pf.qw_fld - this.an_fld;
		}

		if (this.au_fld * -1267908038 < 0) {
			this.au_fld = 0;
		}

		this.ax_fld = var2;
		if (this.aa_fld + this.ax_fld > bc.qx_fld) {
			this.ax_fld = bc.qx_fld - this.aa_fld;
		}

		if (-460890451 * this.ax_fld < 0) {
			this.ax_fld = 0;
		}

		if (this.ai_fld != -1 && null != this.af_fld[this.ai_fld]) {
			cf(this.af_fld[this.ai_fld], this, (byte)60);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public final String ax(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.ar_fld[var1].isEmpty() ? this.as_fld[var1] + kh.hq_fld + this.ar_fld[var1] : this.as_fld[var1];
		}
	}

	@ObfuscatedName("getMenuWidth")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getMenuWidth")
	@Override
	public int getMenuWidth() {
		return this.an_fld;
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

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ch(int var1, int var2) {
		try {
			this.ay(var1, var2, -1627029347);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		this.an_fld = cu.dl_fld.an(kh.hf_fld) * -1903031944;

		for (int var1 = 0; var1 < this.ot_fld; var1++) {
			int var2 = cu.dl_fld.an(this.ak(var1, -1326445416));
			if (null != this.af_fld[var1]) {
				var2 += 15;
			}

			if (var2 > this.an_fld) {
				this.an_fld = var2;
			}
		}

		this.an_fld += 8;
		this.aa_fld = this.ot_fld + -799381740;
		if (this.ak_fld) {
			this.aa_fld += -608855278;
		}
	}

	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void vj(int var1, int var2) {
		this.az(var1, var2, 986514081);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I"
	)
	final int ae(int var1, int var2, byte var3) {
		int var4 = this == client.nr_fld ? client.xz_fld : client.ue_fld;

		for (int var5 = 0; var5 < this.ot_fld; var5++) {
			int var6 = this.ax_fld + (this.ot_fld - 1 - var5 - var4) * 15 + 14;
			if (this.ak_fld) {
				var6 += 17;
			}

			if (var1 > this.au_fld && var1 < this.an_fld + this.au_fld && var2 > var6 - 13 && var2 < var6 + 3) {
				return var5;
			}
		}

		return -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void ad(int var1, int var2) {
		this.ag(-1943760672);
		this.au_fld = -955959571 * (var1 - this.an_fld / 2);
		if (this.an_fld + this.au_fld > pf.qw_fld) {
			this.au_fld = pf.qw_fld - this.an_fld;
		}

		if (this.au_fld < 0) {
			this.au_fld = 0;
		}

		this.ax_fld = var2;
		if (this.aa_fld + this.ax_fld > bc.qx_fld) {
			this.ax_fld = bc.qx_fld - this.aa_fld;
		}

		if (this.ax_fld < 0) {
			this.ax_fld = 0;
		}

		if (this.ai_fld != -1 && null != this.af_fld[this.ai_fld]) {
			cf(this.af_fld[this.ai_fld], this, (byte)113);
		}
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(Lwz;I)Ljava/lang/String;"
	)
	public static String rb(wz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 < 0) {
			return "";
		} else {
			return !var0.ar_fld[var1].isEmpty() ? var0.as_fld[var1] + kh.hq_fld + var0.ar_fld[var1] : var0.as_fld[var1];
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIII)F"
	)
	public static float kq(int var0, int var1, int var2, int var3) {
		return ((float)var1 - var3) / (var2 - var0);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I"
	)
	public final int bi(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (this.ot_fld < this.as_fld.length) {
			this.as_fld[this.ot_fld] = var1;
			this.ar_fld[this.ot_fld] = var2;
			this.ae_fld[this.ot_fld] = var3;
			this.ah_fld[this.ot_fld] = var4;
			this.az_fld[this.ot_fld] = var5;
			this.av_fld[this.ot_fld] = var6;
			this.aw_fld[this.ot_fld] = var7;
			this.ay_fld[this.ot_fld] = var9;
			this.al_fld[this.ot_fld] = var8;
			this.af_fld[this.ot_fld] = null;
			return (this.ot_fld += 1120518047) * -930898849 - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ja() {
		this.am_fld = -1L;
	}

	@ObfuscatedName("getMenuHeight")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getMenuHeight")
	@Override
	public int getMenuHeight() {
		return this.aa_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	final void ap(wz var1) {
		this.ag(290729817);
		this.au_fld = var1.an_fld + var1.au_fld;
		if (this.an_fld + this.au_fld > pf.qw_fld) {
			this.au_fld = var1.au_fld - this.an_fld;
		}

		if (this.au_fld < 0) {
			this.au_fld = 0;
		}

		int var2 = var1.ax_fld + (var1.ot_fld - 15 - var1.ai_fld);
		if (var1.ak_fld) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.ax_fld = var2;
		if (this.ax_fld + this.aa_fld > bc.qx_fld) {
			this.ax_fld = -893845215 * (var3 - this.aa_fld);
		}

		if (this.ax_fld < 0) {
			this.ax_fld = 0;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	final void at(wz var1) {
		this.ag(-202485118);
		this.au_fld = var1.an_fld + var1.au_fld;
		if (this.an_fld + this.au_fld > pf.qw_fld) {
			this.au_fld = var1.au_fld - this.an_fld;
		}

		if (this.au_fld < 0) {
			this.au_fld = 0;
		}

		int var2 = var1.ax_fld + (var1.ot_fld - 15 - var1.ai_fld);
		if (var1.ak_fld) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.ax_fld = var2;
		if (this.ax_fld + this.aa_fld > bc.qx_fld) {
			this.ax_fld = -1373651268 * (var3 - this.aa_fld);
		}

		if (1164975058 * this.ax_fld < 0) {
			this.ax_fld = 0;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	final int ac(int var1, int var2) {
		for (int var3 = 0; var3 < this.ot_fld; var3++) {
			int var4 = 15 * (this.ot_fld - 1 - var3) + this.ax_fld + 14;
			if (this.ak_fld) {
				var4 += 17;
			}

			if (var1 > this.au_fld && var1 < this.an_fld + this.au_fld && var2 > var4 - 13 && var2 < var4 + 3) {
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
		for (int var3 = 0; var3 < this.ot_fld; var3++) {
			int var4 = 15 * (this.ot_fld - 1 - var3) + this.ax_fld + 14;
			if (this.ak_fld) {
				var4 += 17;
			}

			if (var1 > this.au_fld && var1 < this.an_fld + this.au_fld && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("setMenuEntries")
	@ObfuscatedSignature(
		descriptor = "([Lnet/runelite/api/MenuEntry;)V"
	)
	@Export("setMenuEntries")
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
			if (bp.na_fld != null && this.ot_fld > 0) {
				var2 = bp.na_fld.ed() == this.ae_fld[this.ot_fld - 1]
					&& bp.na_fld.sv() == this.ah_fld[this.ot_fld - 1]
					&& bp.na_fld.xp() == this.as_fld[this.ot_fld - 1]
					&& bp.na_fld.fv() == this.ar_fld[this.ot_fld - 1]
					&& bp.na_fld.rz() == this.az_fld[this.ot_fld - 1]
					&& bp.na_fld.ym() == this.av_fld[this.ot_fld - 1]
					&& bp.na_fld.yf() == this.aw_fld[this.ot_fld - 1]
					&& bp.na_fld.oq() == this.ay_fld[this.ot_fld - 1];
			}

			for (int var3 = 0; var3 < var1.length; var3++) {
				rl5 var4 = (rl5)var1[var3];
				if (var4.sj_fld != var3) {
					if (var4.qp_fld != this) {
						throw new IllegalArgumentException("menu entry at index " + var3 + " doesn't belong to this menu");
					}

					if (var4.sj_fld <= var3) {
						throw new IllegalArgumentException("menu entry out of order (are you passing the same menu twice?)");
					}

					this.xi(var4.sj_fld, var3);
				}
			}

			this.ot_fld = var1.length;
			this.ag_fld = var1.length;
			if (var2 && this.ot_fld > 0) {
				if (!zk_fld && bp.na_fld == null) {
					throw new AssertionError();
				}

				bp.na_fld.dn(this.ae_fld[this.ot_fld - 1]);
				bp.na_fld.gp(this.ah_fld[this.ot_fld - 1]);
				bp.na_fld.qa(this.as_fld[this.ot_fld - 1]);
				bp.na_fld.lq(this.ar_fld[this.ot_fld - 1]);
				bp.na_fld.yh(this.az_fld[this.ot_fld - 1]);
				bp.na_fld.ew(this.av_fld[this.ot_fld - 1]);
				bp.na_fld.to(this.aw_fld[this.ot_fld - 1]);
				bp.na_fld.fu(this.ay_fld[this.ot_fld - 1]);
				bp.na_fld.xr_fld = this.vh_fld[this.ot_fld - 1].le_fld;
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void bd(int var1) {
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

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "(Lwz;Ljava/lang/String;Ljava/lang/String;IIIIIZII)I"
	)
	public static int xy(wz var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var0.ot_fld < var0.as_fld.length) {
				var0.as_fld[var0.ot_fld] = var1;
				var0.ar_fld[var0.ot_fld] = var2;
				var0.ae_fld[var0.ot_fld] = var3;
				var0.ah_fld[var0.ot_fld] = var4;
				var0.az_fld[var0.ot_fld] = var5;
				var0.av_fld[var0.ot_fld] = var6;
				var0.aw_fld[var0.ot_fld] = var7;
				var0.ay_fld[var0.ot_fld] = var9;
				var0.al_fld[var0.ot_fld] = var8;
				var0.af_fld[var0.ot_fld] = null;
				int var10000 = var0.ot_fld += 1120518047;
				var0.dr(-1);
				return var10000 * -930898849 - 1;
			} else {
				return -1;
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bc() {
		int var1 = -524091013 * this.au_fld;
		int var2 = 662435170 * this.ax_fld;
		int var3 = -1798968090;
		yu.dj(var1, var2, this.an_fld, this.aa_fld, var3);
		if (this.ak_fld) {
			yu.dj(1 + var1, var2 + 1, this.an_fld - 2, 16, 0);
			yu.ed(var1 + 1, var2 + 18, this.an_fld - 2, this.aa_fld - 19, 0);
			zv.uz(cu.dl_fld, kh.hf_fld, 3 + var1, 14 + var2, var3, -1);
		} else {
			yu.ed(1 + var1, 1 + var2, this.an_fld - 2, this.aa_fld - 2, 0);
		}

		int var4 = -120908884 * tj.ae_fld;
		int var5 = tj.ah_fld;

		for (int var6 = 0; var6 < this.ot_fld; var6++) {
			int var7 = 14 + var2 + (this.ot_fld - 1 - var6) * 15;
			if (this.ak_fld) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < this.an_fld + var1 && var5 > var7 - 13 && var5 < 3 + var7) {
				var8 = 16776960;
			}

			if (var6 == this.ai_fld || this.aq_fld == var6 && null != this.af_fld[var6]) {
				yu.dj(2 + var1, var7 - 12, this.an_fld - 4, 15, 7496785);
			}

			zv.uz(cu.dl_fld, this.ak(var6, -990474041), var1 + 3, var7, var8, 0);
			if (this.af_fld[var6] != null) {
				cu.dl_fld.bk(822659648, this.an_fld + var1 - 10, var7, 16777215);
			}
		}

		if (this.ai_fld != -1 && this.af_fld[this.ai_fld * 150808738] != null) {
			this.af_fld[-1767972534 * this.ai_fld].au(1949039079);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BI)V"
	)
	static void al(byte[] var0, int var1) {
		xi var2 = new xi(var0);
		var2.au_fld = 228932457 * (var0.length - 2);
		yh.ak_fld = var2.cm();
		yh.av_fld = new int[yh.ak_fld];
		yh.ae_fld = new int[yh.ak_fld];
		yh.ah_fld = new int[yh.ak_fld];
		yh.aw_fld = new int[yh.ak_fld];
		yo.as_fld = new byte[yh.ak_fld][];
		var2.au_fld = var0.length - 7 - yh.ak_fld;
		yh.ag_fld = var2.cm();
		yh.az_fld = var2.cm();
		int var3 = (var2.cg() & 0xFF) + 1;

		for (int var4 = 0; var4 < yh.ak_fld; var4++) {
			yh.av_fld[var4] = var2.cm();
		}

		for (int var14 = 0; var14 < yh.ak_fld; var14++) {
			yh.ae_fld[var14] = var2.cm();
		}

		for (int var15 = 0; var15 < yh.ak_fld; var15++) {
			yh.ah_fld[var15] = var2.cm();
		}

		for (int var16 = 0; var16 < yh.ak_fld; var16++) {
			if (var1 <= -1246429003) {
				return;
			}

			yh.aw_fld[var16] = var2.cm();
		}

		var2.au_fld = 228932457 * (var0.length - 7 - yh.ak_fld - (var3 - 1) * 3);
		yh.ay_fld = new int[var3];

		for (int var17 = 1; var17 < var3; var17++) {
			yh.ay_fld[var17] = xi.lx(var2, 944254035);
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
					var8[var19] = var2.cw();
				}
			} else {
				for (int var12 = 0; var12 < var5; var12++) {
					for (int var13 = 0; var13 < var6; var13++) {
						var8[var13 * var5 + var12] = var2.cw();
					}
				}
			}

			if (var11) {
				var2.au_fld += var7 * 228932457;
			}
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mm() {
		this.af((short)29564);
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void nl(int var1) {
		try {
			this.ah(var1, 434679823);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public final boolean bk(int var1, int var2) {
		try {
			if (-1 != this.ai_fld && this.af_fld[this.ai_fld] != null && this.af_fld[this.ai_fld].ay(var1, var2, -1017440427)) {
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 bp(int var1) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else if (this.ot_fld >= this.ee_fld) {
			throw new IllegalStateException("Menu has exceeded the maximum number of entries (" + this.ee_fld + ")");
		} else {
			if (var1 < 0) {
				var1 = this.ot_fld + var1 + 1;
				if (var1 < 0) {
					throw new IllegalArgumentException();
				}
			}

			rl5 var2;
			if (var1 < this.ot_fld) {
				rl5 var3 = this.vh_fld[this.ot_fld];
				if (var3 == null) {
					var3 = this.vh_fld[this.ot_fld] = new rl5(this, this.ot_fld);
				}

				for (int var4 = this.ot_fld; var4 > var1; this.vh_fld[var4].sj_fld = var4--) {
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
					this.vh_fld[var4] = this.vh_fld[var4 - 1];
				}

				this.ot_fld = this.ot_fld * -930898849 + 1;
				this.ag_fld = this.ot_fld;
				var2 = var3;
				this.vh_fld[var1] = var3;
				var3.sj_fld = var1;
			} else {
				if (var1 != this.ot_fld) {
					throw new IllegalArgumentException();
				}

				var2 = this.vh_fld[this.ot_fld];
				if (var2 == null) {
					var2 = this.vh_fld[this.ot_fld] = new rl5(this, this.ot_fld);
				}

				this.ot_fld = this.ot_fld * -930898849 + 1;
				this.ag_fld = this.ot_fld;
			}

			this.as_fld[var2.sj_fld] = "";
			this.ar_fld[var2.sj_fld] = "";
			this.ae_fld[var2.sj_fld] = MenuAction.RUNELITE.getId();
			this.ah_fld[var2.sj_fld] = 0;
			this.az_fld[var2.sj_fld] = 0;
			this.av_fld[var2.sj_fld] = 0;
			this.aw_fld[var2.sj_fld] = -1;
			this.ay_fld[var2.sj_fld] = 0;
			this.af_fld[var2.sj_fld] = null;
			var2.le_fld = null;
			return var2;
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void dr(int var1) {
		int var2 = this.ag_fld;
		int var3 = this.ot_fld;
		this.ag_fld = var3;
		if (var3 < var2) {
			for (int var4 = var3; var4 < var2; var4++) {
				this.vh_fld[var4].le_fld = null;
			}
		} else if (var3 == var2 + 1) {
			rl5 var6 = this.vh_fld[var2];
			if (var6 == null) {
				var6 = this.vh_fld[var2] = new rl5(this, var2);
			} else {
				var6.le_fld = null;
			}

			MenuEntryAdded var5 = new MenuEntryAdded(var6);
			og.ci_fld.getCallbacks().post(var5);
		}
	}

	@ObfuscatedName("yj")
	@ObfuscatedSignature(
		descriptor = "(Lwz;II)Z"
	)
	public static boolean yj(wz var0, int var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var0.ai_fld != -1 && var0.af_fld[var0.ai_fld * -1732359966] != null && var0.af_fld[var0.ai_fld].aw(var1, var2, (byte)-10)) {
				return true;
			} else if (var1 >= var0.au_fld - 10 && var1 <= 10 + var0.an_fld + var0.au_fld && var2 >= var0.ax_fld - 10 && var2 <= var0.aa_fld + var0.ax_fld + 10) {
				int var3 = var0.ae(var1, var2, (byte)-75);
				if (-1 != var3 && var3 != var0.ai_fld) {
					if (var3 != var0.aq_fld) {
						var0.aq_fld = var3;
						var0.am_fld = lz.ak();
						if (var0.ai_fld != -1) {
							var0.am_fld += 300L;
						}
					}

					if (var0.am_fld <= lz.ak()) {
						var0.aq_fld = 1435904831;
						var0.af((short)17752);
						if (null != var0.af_fld[var3]) {
							var0.ai_fld = 1495586608 * var3;
							cf(var0.af_fld[var3], var0, (byte)84);
						}
					}
				}

				return true;
			} else {
				return false;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ai() {
		this.an_fld = cu.dl_fld.an(kh.hf_fld) * 1488058010;

		for (int var1 = 0; var1 < this.ot_fld; var1++) {
			int var2 = cu.dl_fld.an(this.ak(var1, 1100909311));
			if (null != this.af_fld[var1]) {
				var2 += 15;
			}

			if (var2 > this.an_fld) {
				this.an_fld = var2 * -510239970;
			}
		}

		this.an_fld += 1957934611;
		this.aa_fld = this.ot_fld + -799381740;
		if (this.ak_fld) {
			this.aa_fld += -1583739851;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lwz;Lwz;B)V"
	)
	public static void cf(wz var0, wz var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.zl(var1);
			var0.au_fld = var1.an_fld + var1.au_fld;
			if (var0.au_fld + var0.an_fld > pf.qw_fld) {
				var0.au_fld = var1.au_fld - var0.an_fld;
			}

			if (var0.au_fld < 0) {
				var0.au_fld = 0;
			}

			if (!zk_fld && var1 != client.nr_fld) {
				throw new AssertionError();
			} else {
				var0.ax_fld = var1.ax_fld + (var1.ot_fld - 1 - var1.ai_fld - client.xz_fld) * 15;
				if (var0.aa_fld + var0.ax_fld > bc.qx_fld) {
					var0.ax_fld = bc.qx_fld - var0.aa_fld;
				}

				if (var0.ax_fld < 0) {
					var0.ax_fld = 0;
				}
			}
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void vm() {
		this.ar(263560702);
	}

	// $VF: synthetic method
	// $VF: bridge method
	@ObfuscatedName("createMenuEntry")
	@ObfuscatedSignature(
		descriptor = "(I)Lnet/runelite/api/MenuEntry;"
	)
	@Export("createMenuEntry")
	@Override
	public MenuEntry createMenuEntry(int var1) {
		if (!og.ci_fld.isClientThread()) {
			if (!tf.$assertionsDisabled) {
				throw new AssertionError("must be called on client thread");
			} else {
				throw new IllegalStateException("must be called on client thread");
			}
		} else {
			return this.bp(var1);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int cz(int var1, int var2) {
		return this.ae(var1, var2, (byte)-66);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void ao(int var1, int var2) {
		this.ag(-932493222);
		this.au_fld = -955959571 * (var1 - this.an_fld / 2);
		if (this.an_fld + this.au_fld > pf.qw_fld) {
			this.au_fld = pf.qw_fld - this.an_fld;
		}

		if (this.au_fld < 0) {
			this.au_fld = 0;
		}

		this.ax_fld = var2;
		if (this.aa_fld + this.ax_fld > bc.qx_fld) {
			this.ax_fld = bc.qx_fld - this.aa_fld;
		}

		if (this.ax_fld < 0) {
			this.ax_fld = 0;
		}

		if (this.ai_fld != -1 && null != this.af_fld[this.ai_fld]) {
			cf(this.af_fld[this.ai_fld], this, (byte)69);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bx() {
		this.af((short)17322);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bo() {
		this.af((short)17731);
	}

	public wz(boolean var1) {
		int var2 = var1 ? 500 : 64;
		this.ot_fld = 0;
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
		this.ee_fld = var2;
		this.vh_fld = new rl5[var2];
		this.ak_fld = true;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bv() {
		if (this.ai_fld != -1) {
			if (this.af_fld[634477213 * this.ai_fld] != null) {
				this.af_fld[892519906 * this.ai_fld].ar(-1914667578);
			}

			this.ai_fld = -1245414902;
		}
	}

	@ObfuscatedName("removeMenuEntry")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/MenuEntry;)V"
	)
	@Export("removeMenuEntry")
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
			int var3 = var2.sj_fld;
			if (var2.qp_fld == this && var3 < this.ot_fld) {
				if (zk_fld || var3 >= 0 && var3 < this.ot_fld) {
					for (int var4 = var3; var4 < this.ot_fld - 1; this.vh_fld[var4].sj_fld = var4++) {
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
						this.vh_fld[var4] = this.vh_fld[var4 + 1];
					}

					var2.sj_fld = this.ot_fld - 1;
					this.vh_fld[this.ot_fld - 1] = var2;
					this.ot_fld = this.ot_fld * -930898849 - 1;
					this.ag_fld = this.ot_fld;
				} else {
					throw new AssertionError();
				}
			} else {
				throw new IllegalArgumentException("entry doesn't belong to menu");
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)I"
	)
	public final int bn(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (this.ot_fld < this.as_fld.length) {
			this.as_fld[this.ot_fld * -957588376] = var1;
			this.ar_fld[this.ot_fld * 1738059415] = var2;
			this.ae_fld[-1317086979 * this.ot_fld] = var3;
			this.ah_fld[706589578 * this.ot_fld] = var4;
			this.az_fld[this.ot_fld] = var5;
			this.av_fld[this.ot_fld * 634051032] = var6;
			this.aw_fld[this.ot_fld * -2055851220] = var7;
			this.ay_fld[this.ot_fld * 1661846058] = var9;
			this.al_fld[this.ot_fld * 1759567742] = var8;
			this.af_fld[this.ot_fld] = null;
			return (this.ot_fld += 572666071) * 450221003 - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bw() {
		int var1 = this.au_fld;
		int var2 = this.ax_fld;
		int var3 = 6116423;
		yu.dj(var1, var2, this.an_fld, this.aa_fld, var3);
		if (this.ak_fld) {
			yu.dj(1 + var1, var2 + 1, this.an_fld - 2, 16, 0);
			yu.ed(var1 + 1, var2 + 18, this.an_fld - 2, this.aa_fld - 19, 0);
			zv.uz(cu.dl_fld, kh.hf_fld, 3 + var1, 14 + var2, var3, -1);
		} else {
			yu.ed(1 + var1, 1 + var2, this.an_fld - 2, this.aa_fld - 2, 0);
		}

		int var4 = tj.ae_fld;
		int var5 = tj.ah_fld;

		for (int var6 = 0; var6 < this.ot_fld; var6++) {
			int var7 = 14 + var2 + (this.ot_fld - 1 - var6) * 15;
			if (this.ak_fld) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < this.an_fld + var1 && var5 > var7 - 13 && var5 < 3 + var7) {
				var8 = 16776960;
			}

			if (var6 == this.ai_fld || this.aq_fld == var6 && null != this.af_fld[var6]) {
				yu.dj(2 + var1, var7 - 12, this.an_fld - 4, 15, 7496785);
			}

			zv.uz(cu.dl_fld, this.ak(var6, -2070200544), var1 + 3, var7, var8, 0);
			if (this.af_fld[var6] != null) {
				cu.dl_fld.bk(62, this.an_fld + var1 - 10, var7, 16777215);
			}
		}

		if (this.ai_fld != -1 && this.af_fld[this.ai_fld] != null) {
			this.af_fld[this.ai_fld].au(169699247);
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void go() {
		this.as(-629793812);
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ea(int var1, int var2) {
		if (this.ai_fld == -1) {
			return false;
		} else {
			wz var3 = this.af_fld[this.ai_fld];
			if (var3 == null) {
				return false;
			} else if (var3.au_fld > this.au_fld) {
				int var9 = var3.au_fld;
				float var10 = kq(var1, var2, var9, var3.ax_fld);
				float var11 = kq(this.kc_fld, this.en_fld, var9, var3.ax_fld);
				float var12 = kq(var1, var2, var9, var3.ax_fld + var3.aa_fld);
				float var13 = kq(this.kc_fld, this.en_fld, var9, var3.ax_fld + var3.aa_fld);
				return var10 >= var11 && var12 < var13 || var10 > var11 && var12 <= var13;
			} else {
				int var4 = this.au_fld;
				float var5 = kq(var1, var2, var4, var3.ax_fld);
				float var6 = kq(this.kc_fld, this.en_fld, var4, var3.ax_fld);
				float var7 = kq(var1, var2, var4, var3.ax_fld + var3.aa_fld);
				float var8 = kq(this.kc_fld, this.en_fld, var4, var3.ax_fld + var3.aa_fld);
				return var5 <= var6 && var7 > var8 || var5 < var6 && var7 >= var8;
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Lwz;Ljava/lang/String;Ljava/lang/String;IIIIIZI)I"
	)
	public static int ga(wz var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (var0.ot_fld < var0.as_fld.length) {
			var0.as_fld[var0.ot_fld * -2034662020] = var1;
			var0.ar_fld[var0.ot_fld * 37248620] = var2;
			var0.ae_fld[var0.ot_fld] = var3;
			var0.ah_fld[376264987 * var0.ot_fld] = var4;
			var0.az_fld[var0.ot_fld] = var5;
			var0.av_fld[var0.ot_fld] = var6;
			var0.aw_fld[var0.ot_fld] = var7;
			var0.ay_fld[var0.ot_fld * -511021042] = var9;
			var0.al_fld[var0.ot_fld * -1954898515] = var8;
			var0.af_fld[var0.ot_fld] = null;
			return (var0.ot_fld += 1120518047) * -1825065699 - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bp() {
		if (this.ai_fld != -1) {
			if (this.af_fld[654679077 * this.ai_fld] != null) {
				this.af_fld[this.ai_fld].ar(-1536265037);
			}

			this.ai_fld = 1784034049;
		}
	}

	@ObfuscatedName("yx")
	@ObfuscatedSignature(
		descriptor = "(Lru;Lpn;ZZ)V"
	)
	public static void yx(ru var0, pn var1, boolean var2, boolean var3) {
		if (var0.az_fld != null) {
			var0.az(var2, 1796016238);
		}

		var0.az_fld = var1;
		var0.av_fld = var3;

		for (int var4 = 0; var4 < var1.ao(); var4++) {
			var0.ae_fld[var4] = null;
		}

		if (var1.aw() != null) {
			int var6 = var1.aw().ag_fld * -239181913;
			int var7 = var1.aw().az_fld * -1441812743;
			int var5 = var6 + (int)(Math.random() * (var7 - var6));
			var0.aw_fld = var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwz;B)V"
	)
	final void av(wz var1, byte var2) {
		this.zl(var1);
		this.aa_fld = (var1.an_fld + var1.au_fld) * -955959571;
		if (this.ax_fld + this.aq_fld > pf.qw_fld) {
			this.ai_fld = (var1.ax_fld - this.an_fld) * -955959571;
		}

		if (this.au_fld < 0) {
			this.au_fld = 0;
		}

		if (!zk_fld && var1 != client.nr_fld) {
			throw new AssertionError();
		} else {
			this.ai_fld = (var1.ax_fld + (var1.ag_fld - 1 - var1.au_fld - client.xq_fld) * 15) * -893845215;
			if (this.ax_fld + this.aa_fld > bc.qx_fld) {
				this.au_fld = (bc.qx_fld - this.au_fld) * -893845215;
			}

			if (this.ax_fld < 0) {
				this.aq_fld = 0 * -893845215;
			}
		}
	}

	@ObfuscatedName("getMenuY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getMenuY")
	@Override
	public int getMenuY() {
		return this.ax_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	final void ab(wz var1) {
		this.ag(-558014707);
		this.ai_fld = var1.an_fld + var1.au_fld;
		if (this.aq_fld + this.aa_fld > pf.qw_fld) {
			this.aa_fld = var1.ax_fld - this.ax_fld;
		}

		if (-954617658 * this.au_fld < 0) {
			this.au_fld = 0;
		}

		int var2 = var1.aq_fld + (var1.kc_fld - 15 - var1.au_fld);
		if (var1.ak_fld) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.ai_fld = 64586768 * var2;
		if (this.ax_fld + this.aa_fld > bc.qx_fld) {
			this.ax_fld = -893845215 * (var3 - this.aq_fld);
		}

		if (-405794088 * this.ai_fld < 0) {
			this.au_fld = 0;
		}
	}

	@ObfuscatedName("getMenuX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getMenuX")
	@Override
	public int getMenuX() {
		return this.au_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public final boolean bs(int var1, int var2) {
		try {
			if (-1 != this.ai_fld && this.af_fld[-906902563 * this.an_fld] != null && this.af_fld[this.ai_fld].ay(var1, var2, -1017440427)) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I"
	)
	public final int al(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10) {
		try {
			if (this.ot_fld < this.as_fld.length) {
				this.as_fld[this.kc_fld] = var1;
				this.ar_fld[this.kc_fld] = var2;
				this.ay_fld[this.kc_fld] = var3;
				this.az_fld[this.en_fld] = var4;
				this.aw_fld[this.en_fld] = var5;
				this.ah_fld[this.ag_fld * -930898849] = var6;
				this.ay_fld[this.ag_fld * -930898849] = var7;
				this.az_fld[this.kc_fld] = var9;
				this.al_fld[this.kc_fld] = var8;
				this.af_fld[this.ot_fld] = null;
				int var10000 = this.ag_fld = this.kc_fld + 1120518047;
				this.nl(-1);
				return var10000 * -930898849 - 1;
			} else {
				return -1;
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}
}
