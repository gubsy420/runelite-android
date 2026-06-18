import java.io.EOFException;
import net.runelite.api.WorldEntity;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.coords.LocalPoint;

@ObfuscatedName("rg")
@Implements({"WorldEntity"})
public class rg extends vw implements xl, WorldEntity {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	public qa an_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public gu av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1930088645
	)
	public int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public dx ah_fld;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ev_fld = false;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public oy aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lrk;"
	)
	rk[] ay_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	ko af_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 757767689
	)
	public int ar_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1927577949
	)
	int al_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	public qa aa_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	ri au_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float ak_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ax_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1765208601
	)
	int as_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 526957175
	)
	public int ai_fld;

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int by() {
		return this.ah_fld.ah_fld * 491640768 + this.aw_fld.as(-654080199);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dj(int var1) {
		return this.av_fld.az();
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)V"
	)
	void dv(gu var1, int var2, int var3) {
		if (this.as_fld < 9) {
			this.as_fld++;
		}

		for (int var4 = this.as_fld; var4 > 0; var4--) {
			rk var5 = this.ay_fld[var4];
			this.ay_fld[var4] = this.ay_fld[var4 - 1];
			this.ay_fld[var4 - 1] = var5;
		}

		this.ay_fld[0].ak_fld.ay(var1);
		this.ay_fld[0].ag_fld = client.dv_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean av(int var1) {
		return 0.01F == this.ah_fld.az_fld.bi_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bl() {
		return gu.rg(this.av_fld, (byte)-119);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgu;B)V"
	)
	public void ad(gu var1, byte var2) {
		this.xk(var1);
		this.av_fld.ay(var1);
		this.ay_fld[0].ak_fld.ay(var1);
		this.as_fld = 0;
		this.ax_fld = false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lko;B)V"
	)
	public void af(ko var1, byte var2) {
		this.af_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ak(int var1) {
		if (this.ar_fld != 0) {
			dx var2 = client.da_fld.ae(this.ar_fld, (byte)-101);
			if (var2 != null) {
				return var2.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lgu;"
	)
	public gu aw(byte var1) {
		return 0 == this.as_fld ? this.av_fld : this.ay_fld[0].ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loy;I)V"
	)
	public void ay(oy var1, int var2) {
		try {
			this.aw_fld = var1;
			this.ah_fld.az_fld.eq_fld = var1.as(-654080199);
			this.ah_fld.az_fld.pm_fld = var1.ar((byte)0);
			wp(this, oy.is(var1, (byte)-27));
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)I"
	)
	public static int si(rg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld.ag();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;"
	)
	public ko as(int var1) {
		return this.af_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lkt;"
	)
	public kt ar(boolean var1, int var2) {
		return var1 ? kt.ag_fld : oy.bz(this.aw_fld, (byte)65);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bk() {
		return this.ah_fld.ah_fld * 491640768 + this.aw_fld.as(-654080199);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bs() {
		return 0.01F == this.ah_fld.az_fld.bi_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void aq(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ay_fld.length; var4++) {
			gu.tt(this.ay_fld[var4].ak_fld, var1, var2);
		}

		gu.tt(this.av_fld, var1, var2);
		this.au_fld.az(var1, var2, 960028481);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hg() {
		return this.av_fld.az();
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)V"
	)
	void cl(gu var1, int var2, int var3) {
		if (this.as_fld < 9) {
			this.as_fld += -1968619662;
		}

		for (int var4 = this.as_fld; var4 > 0; var4--) {
			rk var5 = this.ay_fld[var4];
			this.ay_fld[var4] = this.ay_fld[var4 - 1];
			this.ay_fld[var4 - 1] = var5;
		}

		this.ay_fld[0].ak_fld.ay(var1);
		this.ay_fld[0].ag_fld = client.dv_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lgu;III)V"
	)
	void ao(gu var1, int var2, int var3, int var4) {
		if (this.as_fld < 9) {
			this.as_fld++;
		}

		for (int var5 = this.as_fld; var5 > 0; var5--) {
			rk var6 = this.ay_fld[var5];
			this.ay_fld[var5] = this.ay_fld[var5 - 1];
			this.ay_fld[var5 - 1] = var6;
		}

		this.ay_fld[0].ak_fld.ay(var1);
		this.ay_fld[0].ag_fld = client.dv_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void ab(int var1, int var2) {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Ltu;"
	)
	public tu ap(int var1, int var2, int var3) {
		ul var4 = uv.ak();
		uy var5 = kv.ak();
		uz.lv(var4.ak_fld, of.ak(gu.rg(this.av_fld, (byte)-50)), 0.0F, 0.0F, -441697260);
		tu.fh(var4.ag_fld, this.av_fld.ak(), 0.0F, this.av_fld.az(), (byte)43);
		var1 -= qa(this, -1726802021);
		var2 -= re(this, (byte)62);
		var5.ax(var4);
		ul.hd(var4, (byte)-120);
		tu var6 = uy.tp(var5, var1, 0.0F, var2, -395379222);
		var5.aq();
		return var6;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bf() {
		if (this.ar_fld * 1501769558 != 0) {
			dx var1 = client.da_fld.ae(this.ar_fld, (byte)-51);
			if (var1 != null) {
				return var1.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
	}

	@ObfuscatedName("getCameraFocus")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getCameraFocus")
	@Override
	public LocalPoint getCameraFocus() {
		return this.getLocalLocation();
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)V"
	)
	void dh(gu var1, int var2, int var3) {
		if (this.as_fld < 9) {
			this.as_fld++;
		}

		for (int var4 = this.as_fld * 466646896; var4 > 0; var4--) {
			rk var5 = this.ay_fld[var4];
			this.ay_fld[var4] = this.ay_fld[var4 - 1];
			this.ay_fld[var4 - 1] = var5;
		}

		this.ay_fld[0].ak_fld.ay(var1);
		this.ay_fld[0].ag_fld = client.dv_fld;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void dm(int var1) {
		if (1926889297 * this.as_fld == 0) {
			this.ad(this.ay_fld[0].ak_fld, (byte)5);
		} else {
			if (!this.ax_fld) {
				this.au_fld.ak(this.av_fld, this.ay_fld[0], var1, -233432663);
				this.ax_fld = true;
			}

			if (this.au_fld.ag(this.av_fld, var1, this.as_fld, -2087252937)) {
				this.as_fld -= -906672928;
				this.ax_fld = false;
			}
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hs() {
		return this.av_fld.ak();
	}

	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void sa(int var1) {
		if (this.as_fld == 0) {
			this.wr(this.ay_fld[0].ak_fld);
		} else {
			if (!this.ax_fld) {
				if (this.ev_fld) {
					this.au_fld.kj(this.av_fld, var1 - 1, this.as_fld);
				}

				this.au_fld.vx(this.av_fld, this.ay_fld[0], var1);
				this.ax_fld = true;
			}

			if (this.au_fld.kj(this.av_fld, var1 + mt.vp_fld, this.as_fld)) {
				this.as_fld = this.as_fld * -1765208601 - 1;
				this.ax_fld = false;
			}

			this.ev_fld = true;
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hq() {
		return this.av_fld.ak();
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hl() {
		return this.av_fld.ak();
	}

	@ObfuscatedName("isHiddenForOverlap")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isHiddenForOverlap")
	@Override
	public boolean isHiddenForOverlap() {
		return this.av(-1345832895);
	}

	@ObfuscatedName("zp")
	@ObfuscatedSignature(
		descriptor = "(II)Ltu;"
	)
	public tu zp(int var1, int var2) {
		return this.ap(var1, var2, 1275202034);
	}

	@ObfuscatedName("getOwnerType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOwnerType")
	@Override
	public int getOwnerType() {
		throw new NoSuchMethodError("sanitized: dead bytecode referenced nonexistent symbol");
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hv() {
		return this.av_fld.az();
	}

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V"
	)
	public static void sn(rg var0, int var1) throws EOFException {
		try {
			qa.hs(var0.an_fld, var1, -323895660);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Lrg;II)V"
	)
	public static void wp(rg var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			qa.hs(var0.an_fld, var1, -1202374500);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hw_int() {
		return this.av_fld.az();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cv(int var1) {
		this.al_fld = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lqa;"
	)
	qa ac() {
		try {
			return 0 == this.ai_fld && qa.jv(this.aa_fld, -550885340) && qa.kw(this.aa_fld, 261892072).ao((byte)15) ? this.aa_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Ldx;Lgu;)V"
	)
	public static void df(rg var0, dx var1, gu var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = gu.ey(var2, (byte)0);
		int var4 = gu.kd(var2, -2037241942);
		if (!var1.ae(var3, var4, 769970368)) {
			var0.ad(var2, (byte)5);
		} else {
			int var5 = var2.ak() - var0.ay_fld[0].ak_fld.ak();
			int var6 = var2.az() - var0.ay_fld[0].ak_fld.az();
			var0.ao(var2, Math.abs(var5), Math.abs(var6), -1599494800);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lqa;"
	)
	qa aj() {
		try {
			return 0 == this.ai_fld && qa.jv(this.aa_fld, -526668112) && qa.kw(this.aa_fld, -682684200).ao((byte)7) ? this.aa_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void bd(boolean var1) {
		try {
			qa var2 = this.ag(673774737);
			qa var3 = var2 != null ? var2 : this.an_fld;
			this.ah_fld.az_fld.bo_fld.ay();
			if (var3 != null && qa.ps(var3, (byte)-66) != -1 && var3.an() && qa.kw(var3, 1365730073).aa(212852266)) {
				sp var4 = qa.kw(var3, 2139646107).am((byte)15);
				ek var5 = ea.ql(var4.ah_fld, (byte)40);
				si var6 = ek.jo(var5, 0, (byte)4);
				if (var6 != null) {
					var5.ae(var4, var3.aw(259295416));
					this.ah_fld.az_fld.bo_fld.as(var6.ae());
					this.ah_fld.az_fld.bo_fld.na_fld = -this.ah_fld.az_fld.bo_fld.na_fld;
				}
			}

			this.ah_fld.az_fld.bw_fld = this.ah_fld.ae_fld;
			if (var1) {
				this.ah_fld.az_fld.ux_fld = -1200;
				this.ah_fld.az_fld.bi_fld = 0.01F;
				int var11 = this.aw_fld.aa(1934381277);
				fy var12 = this.ah_fld.az_fld.bm_fld;
				byte var13 = ue.ak(var11, 1666593296);
				byte var7 = ue.ag(var11);
				byte var8 = (byte)(var11 & -871164164);
				fy.hv(var12, var13, var7, var8, (byte)127);
			} else {
				this.ah_fld.az_fld.ux_fld = 0;
				this.ah_fld.az_fld.bi_fld = 1.0F;
				this.ah_fld.az_fld.bm_fld.az();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lrg;ZI)V"
	)
	public static void gx(rg var0, boolean var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				qa var3 = var0.ag(673774737);
				qa var10000;
				if (var3 != null) {
					if (var2 <= -1253875524) {
						return;
					}

					var10000 = var3;
				} else {
					var10000 = var0.an_fld;
				}

				qa var4 = var10000;
				var0.ah_fld.az_fld.bo_fld.ay();
				if (var4 != null && qa.ps(var4, (byte)-101) != -1 && var4.an()) {
					if (var2 <= -1253875524) {
						return;
					}

					if (qa.kw(var4, -1006316719).aa(-1350311894)) {
						sp var5 = qa.kw(var4, 1285522444).am((byte)15);
						ek var6 = ea.ql(var5.ah_fld, (byte)82);
						si var7 = ek.jo(var6, 0, (byte)4);
						if (var7 != null) {
							var6.ae(var5, var4.aw(157471305));
							var0.ah_fld.az_fld.bo_fld.as(var7.ae());
							var0.ah_fld.az_fld.bo_fld.na_fld = -var0.ah_fld.az_fld.bo_fld.na_fld;
						}
					}
				}

				var0.ah_fld.az_fld.bw_fld = var0.ah_fld.ae_fld;
				if (var1) {
					var0.ah_fld.az_fld.ux_fld = -1200;
					var0.ah_fld.az_fld.bi_fld = 0.01F;
					int var11 = var0.aw_fld.aa(1934381277);
					fy var12 = var0.ah_fld.az_fld.bm_fld;
					byte var13 = ue.ak(var11, 1774733223);
					byte var8 = ue.ag(var11);
					byte var9 = (byte)(var11 & 127);
					fy.hv(var12, var13, var8, var9, (byte)127);
				} else {
					var0.ah_fld.az_fld.ux_fld = 0;
					var0.ah_fld.az_fld.bi_fld = 1.0F;
					var0.ah_fld.az_fld.bm_fld.az();
				}
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void bz(boolean var1) {
		try {
			qa var2 = this.ag(673774737);
			qa var3 = var2 != null ? var2 : this.an_fld;
			this.ah_fld.az_fld.bo_fld.ay();
			if (var3 != null && qa.ps(var3, (byte)-76) != -1 && var3.an() && qa.kw(var3, 90192222).aa(260923064)) {
				sp var4 = qa.kw(var3, 682224712).am((byte)15);
				ek var5 = ea.ql(var4.ah_fld, (byte)55);
				si var6 = ek.jo(var5, 0, (byte)4);
				if (var6 != null) {
					var5.ae(var4, var3.aw(-1339208094));
					this.ah_fld.az_fld.bo_fld.as(var6.ae());
					this.ah_fld.az_fld.bo_fld.na_fld = -this.ah_fld.az_fld.bo_fld.na_fld;
				}
			}

			this.ah_fld.az_fld.bw_fld = this.ah_fld.ae_fld;
			if (var1) {
				this.ah_fld.az_fld.ux_fld = -1200;
				this.ah_fld.az_fld.bi_fld = 0.01F;
				int var11 = this.aw_fld.aa(1934381277);
				fy var12 = this.ah_fld.az_fld.bm_fld;
				byte var13 = ue.ak(var11, 1668350478);
				byte var7 = ue.ag(var11);
				byte var8 = (byte)(var11 & 127);
				fy.hv(var12, var13, var7, var8, (byte)127);
			} else {
				this.ah_fld.az_fld.ux_fld = 0;
				this.ah_fld.az_fld.bi_fld = 1.0F;
				this.ah_fld.az_fld.bm_fld.az();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	public rg(int var1, dx var2) {
		this.co();
		this.av_fld = new gu();
		this.ae_fld = 0;
		this.ay_fld = new rk[10];
		this.as_fld = 0;
		this.ar_fld = 0;
		this.af_fld = ko.ak_fld;
		this.al_fld = 908559275;
		this.au_fld = new rn();
		this.ax_fld = false;
		this.an_fld = new qa();
		this.aa_fld = new qa();
		this.ai_fld = 0;
		this.ae_fld = var1;
		this.ah_fld = var2;
		this.as_fld = 0;

		for (int var3 = 0; var3 < 10; var3++) {
			this.ay_fld[var3] = new rk();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lqa;"
	)
	qa ag(int var1) {
		try {
			return 0 == this.ai_fld && qa.jv(this.aa_fld, 1097728695) && qa.kw(this.aa_fld, -1749385116).ao((byte)-127) ? this.aa_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("xc")
	@ObfuscatedSignature(
		descriptor = "(Lrg;IS)V"
	)
	public static void xc(rg var0, int var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bx() {
		return gu.rg(this.av_fld, (byte)-13);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cw() {
		return gu.rg(this.av_fld, (byte)-76);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int cu(rg var0) {
		return -889964364 * var0.ah_fld.aw_fld + var0.aw_fld.ar((byte)0);
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int gv(rg var0) {
		return var0.ah_fld.ah_fld * 491640768 + var0.aw_fld.as(-654080199);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Lgu;"
	)
	public gu bp() {
		return 0 == this.as_fld ? this.av_fld : this.ay_fld[0].ak_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lgu;B)V"
	)
	public final void am(dx var1, gu var2, byte var3) {
		int var4 = gu.ey(var2, (byte)0);
		int var5 = gu.kd(var2, -1817874787);
		if (!var1.ae(var4, var5, 1859642480)) {
			this.ad(var2, (byte)5);
		} else {
			int var6 = var2.ak() - this.ay_fld[0].ak_fld.ak();
			int var7 = var2.az() - this.ay_fld[0].ak_fld.az();
			this.ao(var2, Math.abs(var6), Math.abs(var7), -1026746134);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Lko;"
	)
	public ko bu() {
		return this.af_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Lko;"
	)
	public ko bn() {
		return this.af_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Z)Lkt;"
	)
	public kt bw(boolean var1) {
		return var1 ? kt.ag_fld : oy.bz(this.aw_fld, (byte)85);
	}

	@ObfuscatedName("transformToMainWorld")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/coords/LocalPoint;)Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("transformToMainWorld")
	@Override
	public LocalPoint transformToMainWorld(LocalPoint var1) {
		if (var1.getWorldView() != this.ae_fld) {
			throw new IllegalArgumentException("LocalPoint doesn't belong do this WorldEntity");
		} else {
			tu var2 = this.zp(var1.getX(), var1.getY());
			LocalPoint var3 = new LocalPoint((int)var2.ar_fld, (int)var2.as_fld, 0);
			var2.du();
			return var3;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	public void bg(ko var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	public void bb(ko var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)Lgu;"
	)
	public static gu ek(rg var0) {
		return 0 == var0.as_fld ? var0.av_fld : var0.ay_fld[0].ak_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	public void cd(ko var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lrg;II)V"
	)
	public static void ca(rg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var3 = 0; var3 < var0.ay_fld.length; var3++) {
			gu.tt(var0.ay_fld[var3].ak_fld, var1, var2);
		}

		gu.tt(var0.av_fld, var1, var2);
		var0.au_fld.az(var1, var2, 1754749356);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cc(int var1) {
		this.al_fld = 685226967 * var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Lqa;"
	)
	qa bm() {
		try {
			return 0 == this.ai_fld && qa.jv(this.aa_fld, -567802029) && qa.kw(this.aa_fld, -304607937).ao((byte)-103) ? this.aa_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()Lgu;"
	)
	public gu bt() {
		return 0 == this.as_fld ? this.av_fld : this.ay_fld[0].ak_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean cf(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.al_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bh() {
		return qa.ps(this.aa_fld, (byte)-127);
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	public void xk(gu var1) {
		this.ev_fld = false;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cy(int var1) {
		this.al_fld = var1;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cb() {
		return -558426560 * this.ah_fld.aw_fld + this.aw_fld.ar((byte)0);
	}

	@ObfuscatedName("getTargetLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getTargetLocation")
	@Override
	public LocalPoint getTargetLocation() {
		return this.as_fld > 0 ? new LocalPoint(this.ay_fld[0].ak_fld.ag_fld * -889401323, this.ay_fld[0].ak_fld.az_fld * -764828807, 0) : this.getLocalLocation();
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Lrg;B)I"
	)
	public static int dp(rg var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return qa.ps(var0.aa_fld, (byte)-23);
		}
	}

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "(Lrg;B)I"
	)
	public static int re(rg var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return -558426560 * var0.ah_fld.aw_fld + var0.aw_fld.ar((byte)0);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Ltu;"
	)
	public tu at(int var1, int var2, int var3) {
		ul var4 = uv.ak();
		uy var5 = kv.ak();
		uz.lv(var4.ak_fld, of.ak(gu.rg(this.av_fld, (byte)-4)), 0.0F, 0.0F, -1819376270);
		tu.fh(var4.ag_fld, this.av_fld.ak(), 0.0F, this.av_fld.az(), (byte)-21);
		var5.ax(var4);
		var5.aw();
		ul.hd(var4, (byte)-87);
		tu var6 = uy.tp(var5, var1, 0.0F, var2, 783438376);
		tu.gp(var6, qa(this, -120566184), 0.0F, re(this, (byte)24), -2047330257);
		var5.aq();
		return var6;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cs() {
		return this.av_fld.ag();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Lko;"
	)
	public ko bv() {
		return this.af_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void co(int var1, int var2) {
		for (int var3 = 0; var3 < this.ay_fld.length; var3++) {
			gu.tt(this.ay_fld[var3].ak_fld, var1, var2);
		}

		gu.tt(this.av_fld, var1, var2);
		this.au_fld.az(var1, var2, -592225575);
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dp(int var1) {
		return this.av_fld.ak();
	}

	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)I"
	)
	public static int qa(rg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ah_fld.ah_fld * 491640768 + var0.aw_fld.as(-654080199);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()Loy;"
	)
	public oy getConfig() {
		return this.aw_fld;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lgu;)V"
	)
	public final void ch(dx var1, gu var2) {
		int var3 = gu.ey(var2, (byte)0);
		int var4 = gu.kd(var2, -865798698);
		if (!var1.ae(var3, var4, 1220694257)) {
			this.ad(var2, (byte)5);
		} else {
			int var5 = var2.ak() - this.ay_fld[0].ak_fld.ak();
			int var6 = var2.az() - this.ay_fld[0].ak_fld.az();
			this.ao(var2, Math.abs(var5), Math.abs(var6), -1679750316);
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	public void ct(gu var1) {
		this.av_fld.ay(var1);
		this.ay_fld[0].ak_fld.ay(var1);
		this.as_fld = 0;
		this.ax_fld = false;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)I"
	)
	public static int es(rg var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return gu.rg(var0.av_fld, (byte)-122);
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ci(int var1, int var2) {
		for (int var3 = 0; var3 < this.ay_fld.length; var3++) {
			gu.tt(this.ay_fld[var3].ak_fld, var1, var2);
		}

		gu.tt(this.av_fld, var1, var2);
		this.au_fld.az(var1, var2, -1206093117);
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Export("getLocalLocation")
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.av_fld.ag_fld * -889401323, this.av_fld.az_fld * -764828807, 0);
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Lgu;II)V"
	)
	void dc(gu var1, int var2, int var3) {
		if (this.as_fld < 9) {
			this.as_fld++;
		}

		for (int var4 = this.as_fld; var4 > 0; var4--) {
			rk var5 = this.ay_fld[var4];
			this.ay_fld[var4] = this.ay_fld[var4 - 1];
			this.ay_fld[var4 - 1] = var5;
		}

		this.ay_fld[0].ak_fld.ay(var1);
		this.ay_fld[0].ag_fld = client.dv_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cq(int var1) {
		this.al_fld = var1;
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)I"
	)
	public static int en(rg var0) {
		return var0.ah_fld.ah_fld * 491640768 + var0.aw_fld.as(-654080199);
	}

	@ObfuscatedName("getOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOrientation")
	@Override
	public int getOrientation() {
		return this.av_fld.ak_fld * -1091125853;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return this.ah_fld;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hc() {
		return this.av_fld.ak();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bj() {
		if (this.ar_fld != 0) {
			dx var1 = client.da_fld.ae(this.ar_fld, (byte)-61);
			if (var1 != null) {
				return var1.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean au(int var1, int var2) {
		return var1 >= 0 && var1 <= 4 ? (this.al_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)Ltu;"
	)
	public tu dq(int var1, int var2) {
		ul var3 = uv.ak();
		uy var4 = kv.ak();
		uz.lv(var3.ak_fld, of.ak(gu.rg(this.av_fld, (byte)-115)), 0.0F, 0.0F, -359744933);
		tu.fh(var3.ag_fld, this.av_fld.ak(), 0.0F, this.av_fld.az(), (byte)104);
		var1 -= qa(this, -1863329263);
		var2 -= re(this, (byte)12);
		var4.ax(var3);
		ul.hd(var3, (byte)-2);
		tu var5 = uy.tp(var4, var1, 0.0F, var2, -1035003490);
		var4.aq();
		return var5;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)Ltu;"
	)
	public tu do_(int var1, int var2) {
		ul var3 = uv.ak();
		uy var4 = kv.ak();
		uz.lv(var3.ak_fld, of.ak(gu.rg(this.av_fld, (byte)-111)), 0.0F, 0.0F, -1998456983);
		tu.fh(var3.ag_fld, this.av_fld.ak(), 0.0F, this.av_fld.az(), (byte)15);
		var4.ax(var3);
		var4.aw();
		ul.hd(var3, (byte)-2);
		tu var5 = uy.tp(var4, var1, 0.0F, var2, -2030051869);
		tu.gp(var5, qa(this, -580601282), 0.0F, re(this, (byte)58), -2003300383);
		var4.aq();
		return var5;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int of() {
		return this.dp(527100376);
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int pa() {
		return this.dj(189745805);
	}

	@ObfuscatedName("getTargetOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTargetOrientation")
	@Override
	public int getTargetOrientation() {
		return this.as_fld > 0 ? this.ay_fld[0].ak_fld.ak_fld * -1091125853 : this.getOrientation();
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ri() {
		return this.ak(-1615592074);
	}

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float yd() {
		return this.av_fld.ag_fld * -889401323;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float kn() {
		return this.av_fld.az_fld * -764828807;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae(int var1) {
		return this.av_fld.ag();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	public void al(int var1, short var2) {
		this.as_fld = 1414781685 * var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ah(int var1) {
		if (this.ar_fld != 0) {
			dx var2 = client.da_fld.ae(this.ae_fld * 757767689, (byte)-101);
			if (var2 != null) {
				return var2.ag_fld;
			}
		}

		return bw.dk_fld.hc_int;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aa(int var1, int var2) {
		for (int var3 = 0; var3 < this.ay_fld.length; var3++) {
			gu.tt(this.ay_fld[var3].ak_fld, var1, var2);
		}

		gu.tt(this.av_fld, var1, var2);
		this.au_fld.az(var1, var2, -592225575);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void co() {
		client.rw_java_util_List.add(this);
	}

	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	public void wr(gu var1) {
		this.ad(var1, (byte)5);
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Z)V"
	)
	public static void tw(rg var0, boolean var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			qa var2 = var0.ag(673774737);
			qa var3 = var2 != null ? var2 : var0.an_fld;
			var0.ah_fld.az_fld.bo_fld.ay();
			if (var3 != null && qa.ps(var3, (byte)-54) != -1 && var3.an() && qa.kw(var3, -252470463).aa(735012886)) {
				sp var4 = qa.kw(var3, -215760155).am((byte)15);
				ek var5 = ea.ql(var4.ah_fld, (byte)-35);
				si var6 = ek.jo(var5, 0, (byte)4);
				if (var6 != null) {
					var5.ae(var4, var3.aw(-1146967224));
					var0.ah_fld.az_fld.bo_fld.as(var6.ae());
					var0.ah_fld.az_fld.bo_fld.na_fld = -var0.ah_fld.az_fld.bo_fld.na_fld;
				}
			}

			var0.ah_fld.az_fld.bw_fld = var0.ah_fld.ae_fld;
			if (var1) {
				var0.ah_fld.az_fld.ux_fld = -1200;
				var0.ah_fld.az_fld.bi_fld = 0.01F;
				int var11 = var0.aw_fld.aa(1934381277);
				fy var12 = var0.ah_fld.az_fld.bm_fld;
				byte var13 = ue.ak(var11, 1667923307);
				byte var7 = ue.ag(var11);
				byte var8 = (byte)(var11 & 127);
				fy.hv(var12, var13, var7, var8, (byte)127);
			} else {
				var0.ah_fld.az_fld.ux_fld = 0;
				var0.ah_fld.az_fld.bi_fld = 1.0F;
				var0.ah_fld.az_fld.bm_fld.az();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ai(byte var1) {
		return qa.ps(this.an_fld, (byte)-23);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void az(boolean var1, int var2) {
		try {
			qa var3 = this.ag(673774737);
			qa var10000;
			if (var3 != null) {
				if (var2 <= -1253875524) {
					return;
				}

				var10000 = var3;
			} else {
				var10000 = this.an_fld;
			}

			qa var4 = var10000;
			this.ah_fld.az_fld.bo_fld.ay();
			if (var4 != null && qa.ps(var4, (byte)-101) != -1 && var4.av(2117461040)) {
				if (var2 <= -1253875524) {
					return;
				}

				if (qa.kw(var4, -1006316719).aa(-1350311894)) {
					sp var5 = qa.kw(var4, 1285522444).am((byte)15);
					ek var6 = ea.ql(var5.ah_fld, (byte)82);
					si var7 = ek.jo(var6, 0, (byte)4);
					if (var7 != null) {
						var6.ae(var5, var4.ay());
						this.ah_fld.az_fld.bo_fld.as(var7.ae());
						this.ah_fld.az_fld.bo_fld.ga_fld = -this.ah_fld.az_fld.bo_fld.to_fld;
					}
				}
			}

			this.ah_fld.az_fld.oe_fld = this.ah_fld.aw_fld;
			if (var1) {
				this.ah_fld.az_fld.bx_fld = -1200;
				this.ah_fld.az_fld.ss_fld = 0.01F;
				int var11 = this.aw_fld.aa(1934381277);
				fy var12 = this.ah_fld.az_fld.bm_fld;
				byte var13 = ue.ak(var11, 1774733223);
				byte var8 = ue.ag(var11);
				byte var9 = (byte)(var11 & 127);
				fy.hv(var12, var13, var8, var9, (byte)127);
			} else {
				this.ah_fld.az_fld.ou_fld = 0;
				this.ah_fld.az_fld.ch_fld = 1.0F;
				this.ah_fld.az_fld.bm_fld.az();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ax(int var1) {
		return this.av_fld.az();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean be() {
		return 0.01F == this.ah_fld.az_fld.li_fld;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void nh(int var1, int var2) {
		this.aq(var1, var2, 1907474256);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int an(byte var1) {
		return -558426560 * this.ah_fld.ag_fld + this.aw_fld.ar((byte)0);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cr() {
		return this.av_fld.ae(-2006244178);
	}
}
