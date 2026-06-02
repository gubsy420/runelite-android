import java.io.EOFException;
import net.runelite.api.WorldEntity;
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
	@ObfuscatedGetter(
		intValue = -1930088645
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	public dx ah_fld;
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
	@ObfuscatedGetter(
		intValue = 757767689
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ar_fld;
	@ObfuscatedGetter(
		intValue = 1927577949
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean pm_fld = false;
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
	@ObfuscatedGetter(
		intValue = -1765208601
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = 526957175
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ai_fld;

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cr() {
		return this.ah_fld.ah_fld * 491640768 + oy.ad(this.aw_fld, -654080199);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dj(int var1) {
		return gu.ns(this.av_fld, 866166425);
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int by() {
		return this.av_fld.av();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgu;B)V"
	)
	public void ad(gu var1, byte var2) {
		this.gh(var1);
		this.av_fld.ay(var1);
		this.ay_fld[0].ak_fld.ay(var1);
		this.as_fld = 0;
		this.ax_fld = false;
	}

	@ObfuscatedName("getLocalLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.av_fld.ag_fld * -889401323, this.av_fld.az_fld * -764828807, 0);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ah(int var1) {
		return this.av_fld.av();
	}

	@ObfuscatedName("getTargetOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTargetOrientation() {
		return this.as_fld > 0 ? this.ay_fld[0].ak_fld.ak_fld * -1091125853 : this.getOrientation();
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)Lgu;"
	)
	public static gu kj(rg var0) {
		return 0 == var0.as_fld ? var0.av_fld : var0.ay_fld[0].ak_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lgu;"
	)
	public gu aw(byte var1) {
		return 0 == this.as_fld ? this.av_fld : this.ay_fld[0].ak_fld;
	}

	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void rb(int var1, int var2) {
		this.aq(var1, var2, 1907474256);
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
		return var1 ? kt.ag_fld : oy.ma(this.aw_fld, (byte)65);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bs() {
		return 0.01F == this.ah_fld.az_fld.bi_fld;
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Ldx;Lgu;B)V"
	)
	public static void nd(rg var0, dx var1, gu var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		int var4 = gu.oq(var2, (byte)0);
		int var5 = var2.ae();
		if (!var1.ae(var4, var5, 1859642480)) {
			var0.ad(var2, (byte)5);
		} else {
			int var6 = var2.ah() - var0.ay_fld[0].ak_fld.ah();
			int var7 = gu.ns(var2, -2105950856) - gu.ns(var0.ay_fld[0].ak_fld, 441069255);
			ih(var0, var2, Math.abs(var6), Math.abs(var7));
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ax(int var1) {
		return this.ah_fld.ah_fld * 491640768 + oy.ad(this.aw_fld, -654080199);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V"
	)
	public static void bj(rg var0, int var1) throws EOFException {
		try {
			qa.ju(var0.an_fld, var1, 1620288489);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void aq(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.ay_fld.length; var4++) {
			gu.ry(this.ay_fld[var4].ak_fld, var1, var2);
		}

		gu.ry(this.av_fld, var1, var2);
		this.au_fld.az(var1, var2, 960028481);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Z)Lkt;"
	)
	public static kt ca(rg var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 ? kt.ag_fld : oy.ma(var0.aw_fld, (byte)85);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void aa(int var1, int var2) {
		try {
			qa.ju(this.an_fld, var1, -1202374500);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	public void az(boolean var1, int var2) {
		try {
			qa var3 = xt(this, 673774737);
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
			this.ah_fld.az_fld.bo_fld.aw();
			if (var4 != null && var4.ah() != -1 && qa.uq(var4, 2117461040)) {
				if (var2 <= -1253875524) {
					return;
				}

				if (var4.ae().aa(-1350311894)) {
					sp var5 = var4.ae().am((byte)15);
					ek var6 = var5.ah_fld.ag();
					si var7 = ek.mt(var6, 0, (byte)4);
					if (var7 != null) {
						var6.ae(var5, qa.do_(var4, 157471305));
						uy.nf(this.ah_fld.az_fld.bo_fld, var7.ae(), (byte)-59);
						this.ah_fld.az_fld.bo_fld.my_fld = -this.ah_fld.az_fld.bo_fld.my_fld;
					}
				}
			}

			this.ah_fld.az_fld.bx_fld = this.ah_fld.ae_fld;
			if (var1) {
				this.ah_fld.az_fld.bt_fld = -1200;
				this.ah_fld.az_fld.bi_fld = 0.01F;
				int var11 = this.aw_fld.aa(1934381277);
				fy var12 = this.ah_fld.az_fld.bm_fld;
				byte var13 = ue.ak(var11, 1774733223);
				byte var8 = ue.ag(var11);
				byte var9 = (byte)(var11 & 127);
				var12.ag(var13, var8, var9, (byte)127);
			} else {
				this.ah_fld.az_fld.bt_fld = 0;
				this.ah_fld.az_fld.bi_fld = 1.0F;
				this.ah_fld.az_fld.bm_fld.ar();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hl() {
		return gu.ns(this.av_fld, 1384150239);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public final void ab(int var1, int var2) {
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lgu;I)V"
	)
	public static void oi(rg var0, gu var1, int var2) {
		if (var0.as_fld < 9) {
			var0.as_fld++;
		}

		for (int var4 = var0.as_fld; var4 > 0; var4--) {
			rk var5 = var0.ay_fld[var4];
			var0.ay_fld[var4] = var0.ay_fld[var4 - 1];
			var0.ay_fld[var4 - 1] = var5;
		}

		var0.ay_fld[0].ak_fld.ay(var1);
		var0.ay_fld[0].ag_fld = client.dv_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bj() {
		if (this.ar_fld * 1501769558 != 0) {
			dx var1 = client.da_fld.ae(this.ar_fld, (byte)-51);
			if (var1 != null) {
				return var1.ae_fld;
			}
		}

		return bw.dk_fld.ae_fld;
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

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void dz(int var1) {
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

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hq() {
		return this.av_fld.ah();
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hc() {
		return this.av_fld.ah();
	}

	@ObfuscatedName("getOrientation")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOrientation() {
		return this.av_fld.ak_fld * -1091125853;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hv() {
		return this.av_fld.ah();
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Lrg;II)Ltu;"
	)
	public static tu ql(rg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		ul var4 = uv.ak();
		uy var5 = kv.ak();
		var4.ak_fld.ar(of.ak(var0.av_fld.av()), 0.0F, 0.0F);
		tu.md(var4.ag_fld, var0.av_fld.ah(), 0.0F, gu.ns(var0.av_fld, 436759147), (byte)43);
		var1 -= var0.ax(-1726802021);
		var2 -= var0.an((byte)62);
		var5.ax(var4);
		ul.ln(var4, (byte)-120);
		tu var6 = var5.ao(var1, 0.0F, var2);
		var5.az();
		return var6;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dg() {
		client.sw_java_util_List.add(this);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hs() {
		return gu.ns(this.av_fld, -433764056);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hg() {
		return gu.ns(this.av_fld, -809244396);
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void dm(int var1) {
		if (-329576718 * this.as_fld == 0) {
			this.ad(this.ay_fld[0].ak_fld, (byte)5);
		} else {
			if (!this.ax_fld) {
				this.au_fld.ak(this.av_fld, this.ay_fld[0], var1, 364480518);
				this.ax_fld = true;
			}

			if (this.au_fld.ag(this.av_fld, var1, this.as_fld, -1279780231)) {
				this.as_fld--;
				this.ax_fld = false;
			}
		}
	}

	@ObfuscatedName("getTargetLocation")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getTargetLocation() {
		return this.as_fld > 0 ? new LocalPoint(this.ay_fld[0].ak_fld.ag_fld * -889401323, this.ay_fld[0].ak_fld.az_fld * -764828807, 0) : this.getLocalLocation();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cv(int var1) {
		this.al_fld = var1;
	}

	@ObfuscatedName("zv")
	@ObfuscatedSignature(
		descriptor = "(Lrg;B)I"
	)
	public static int zv(rg var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aa_fld.ah();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lqa;"
	)
	qa ac() {
		try {
			return 0 == this.ai_fld && this.aa_fld.av() && this.aa_fld.ae().ao((byte)15) ? this.aa_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lrg;IS)V"
	)
	public static void em(rg var0, int var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae(int var1) {
		return this.av_fld.ag();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lqa;"
	)
	qa aj() {
		try {
			return 0 == this.ai_fld && this.aa_fld.av() && this.aa_fld.ae().ao((byte)7) ? this.aa_fld : null;
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
			qa var2 = xt(this, 673774737);
			qa var3 = var2 != null ? var2 : this.an_fld;
			this.ah_fld.az_fld.bo_fld.aw();
			if (var3 != null && var3.ah() != -1 && qa.uq(var3, 915746537) && var3.ae().aa(212852266)) {
				sp var4 = var3.ae().am((byte)15);
				ek var5 = var4.ah_fld.ag();
				si var6 = ek.mt(var5, 0, (byte)4);
				if (var6 != null) {
					var5.ae(var4, qa.do_(var3, 259295416));
					uy.nf(this.ah_fld.az_fld.bo_fld, var6.ae(), (byte)-19);
					this.ah_fld.az_fld.bo_fld.my_fld = -this.ah_fld.az_fld.bo_fld.my_fld;
				}
			}

			this.ah_fld.az_fld.bx_fld = this.ah_fld.ae_fld;
			if (var1) {
				this.ah_fld.az_fld.bt_fld = -1200;
				this.ah_fld.az_fld.bi_fld = 0.01F;
				int var11 = this.aw_fld.aa(1934381277);
				fy var12 = this.ah_fld.az_fld.bm_fld;
				byte var13 = ue.ak(var11, 1666593296);
				byte var7 = ue.ag(var11);
				byte var8 = (byte)(var11 & -871164164);
				var12.ag(var13, var7, var8, (byte)127);
			} else {
				this.ah_fld.az_fld.bt_fld = 0;
				this.ah_fld.az_fld.bi_fld = 1.0F;
				this.ah_fld.az_fld.bm_fld.ar();
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
			qa var2 = xt(this, 673774737);
			qa var3 = var2 != null ? var2 : this.an_fld;
			this.ah_fld.az_fld.bo_fld.aw();
			if (var3 != null && var3.ah() != -1 && qa.uq(var3, 1642841437) && var3.ae().aa(260923064)) {
				sp var4 = var3.ae().am((byte)15);
				ek var5 = var4.ah_fld.ag();
				si var6 = ek.mt(var5, 0, (byte)4);
				if (var6 != null) {
					var5.ae(var4, qa.do_(var3, -1339208094));
					uy.nf(this.ah_fld.az_fld.bo_fld, var6.ae(), (byte)-111);
					this.ah_fld.az_fld.bo_fld.my_fld = -this.ah_fld.az_fld.bo_fld.my_fld;
				}
			}

			this.ah_fld.az_fld.bx_fld = this.ah_fld.ae_fld;
			if (var1) {
				this.ah_fld.az_fld.bt_fld = -1200;
				this.ah_fld.az_fld.bi_fld = 0.01F;
				int var11 = this.aw_fld.aa(1934381277);
				fy var12 = this.ah_fld.az_fld.bm_fld;
				byte var13 = ue.ak(var11, 1668350478);
				byte var7 = ue.ag(var11);
				byte var8 = (byte)(var11 & 127);
				var12.ag(var13, var7, var8, (byte)127);
			} else {
				this.ah_fld.az_fld.bt_fld = 0;
				this.ah_fld.az_fld.bi_fld = 1.0F;
				this.ah_fld.az_fld.bm_fld.ar();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void br(boolean var1) {
		try {
			qa var2 = xt(this, 673774737);
			qa var3 = var2 != null ? var2 : this.an_fld;
			this.ah_fld.az_fld.bo_fld.aw();
			if (var3 != null && var3.ah() != -1 && qa.uq(var3, 1077125286) && var3.ae().aa(735012886)) {
				sp var4 = var3.ae().am((byte)15);
				ek var5 = var4.ah_fld.ag();
				si var6 = ek.mt(var5, 0, (byte)4);
				if (var6 != null) {
					var5.ae(var4, qa.do_(var3, -1146967224));
					uy.nf(this.ah_fld.az_fld.bo_fld, var6.ae(), (byte)-39);
					this.ah_fld.az_fld.bo_fld.my_fld = -this.ah_fld.az_fld.bo_fld.my_fld;
				}
			}

			this.ah_fld.az_fld.bx_fld = this.ah_fld.ae_fld;
			if (var1) {
				this.ah_fld.az_fld.bt_fld = -1200;
				this.ah_fld.az_fld.bi_fld = 0.01F;
				int var11 = this.aw_fld.aa(1934381277);
				fy var12 = this.ah_fld.az_fld.bm_fld;
				byte var13 = ue.ak(var11, 1667923307);
				byte var7 = ue.ag(var11);
				byte var8 = (byte)(var11 & 127);
				var12.ag(var13, var7, var8, (byte)127);
			} else {
				this.ah_fld.az_fld.bt_fld = 0;
				this.ah_fld.az_fld.bi_fld = 1.0F;
				this.ah_fld.az_fld.bm_fld.ar();
			}
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean be() {
		return 0.01F == this.ah_fld.az_fld.bi_fld;
	}

	public rg(int var1, dx var2) {
		this.dg();
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int an(byte var1) {
		return -558426560 * this.ah_fld.aw_fld + oy.ob(this.aw_fld, (byte)0);
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	public void gh(gu var1) {
		this.pm_fld = false;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lrg;)Lqa;"
	)
	public static qa le(rg var0) throws EOFException {
		try {
			return 0 == var0.ai_fld && var0.aa_fld.av() && var0.aa_fld.ae().ao((byte)-103) ? var0.aa_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bx() {
		return this.av_fld.av();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()Lgu;"
	)
	public gu bo() {
		return 0 == this.as_fld ? this.av_fld : this.ay_fld[0].ak_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Lgu;"
	)
	public gu bp() {
		return 0 == this.as_fld ? this.av_fld : this.ay_fld[0].ak_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Lko;"
	)
	public ko bi() {
		return this.af_fld;
	}

	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Z)Lkt;"
	)
	public static kt we(rg var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 ? kt.ag_fld : oy.ma(var0.aw_fld, (byte)44);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Lko;"
	)
	public ko bu() {
		return this.af_fld;
	}

	@ObfuscatedName("getOwnerType")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOwnerType() {
		throw new NoSuchMethodError("sanitized: dead bytecode referenced nonexistent symbol");
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Lko;"
	)
	public ko bn() {
		return this.af_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()Lko;"
	)
	public ko bc() {
		return this.af_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	public void bg(ko var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("transformToMainWorld")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/coords/LocalPoint;)Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint transformToMainWorld(LocalPoint var1) {
		if (var1.getWorldView() != this.ae_fld) {
			throw new IllegalArgumentException("LocalPoint doesn't belong do this WorldEntity");
		} else {
			tu var2 = this.vr(var1.getX(), var1.getY());
			LocalPoint var3 = new LocalPoint((int)var2.ay_fld, (int)var2.ar_fld, 0);
			var2.bz();
			return var3;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	public void cd(ko var1) {
		this.af_fld = var1;
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V"
	)
	public static void om(rg var0, int var1) {
		if (var0.as_fld == 0) {
			var0.ad(var0.ay_fld[0].ak_fld, (byte)5);
		} else {
			if (!var0.ax_fld) {
				var0.au_fld.ak(var0.av_fld, var0.ay_fld[0], var1, 30099946);
				var0.ax_fld = true;
			}

			if (var0.au_fld.ag(var0.av_fld, var1, var0.as_fld, -1331411623)) {
				var0.as_fld--;
				var0.ax_fld = false;
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void cc(int var1) {
		this.al_fld = 685226967 * var1;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Loy;I)V"
	)
	public static void ok(rg var0, oy var1, int var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			var0.aw_fld = var1;
			var0.ah_fld.az_fld.bp_fld = oy.ad(var1, -654080199);
			var0.ah_fld.az_fld.bv_fld = oy.ob(var1, (byte)0);
			var0.aa(oy.oj(var1, (byte)-27), -236168216);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void cz(int var1) {
		try {
			qa.ju(this.an_fld, var1, -323895660);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean cf(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.al_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx getWorldView() {
		return this.ah_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean cx(int var1) {
		return var1 >= 0 && var1 <= 4 ? (this.al_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("getCameraFocus")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/coords/LocalPoint;"
	)
	@Override
	public LocalPoint getCameraFocus() {
		return this.getLocalLocation();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cp() {
		return this.ah_fld.ah_fld * 491640768 + oy.ad(this.aw_fld, -654080199);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ce() {
		return this.ah_fld.ah_fld * 491640768 + oy.ad(this.aw_fld, -654080199);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cn() {
		return this.ah_fld.ah_fld * 491640768 + oy.ad(this.aw_fld, -654080199);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ca() {
		return -558426560 * this.ah_fld.aw_fld + oy.ob(this.aw_fld, (byte)0);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cw() {
		return -558426560 * this.ah_fld.aw_fld + oy.ob(this.aw_fld, (byte)0);
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
	)
	public void ql(gu var1) {
		this.ad(var1, (byte)5);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cm() {
		return 870102756 * this.ah_fld.aw_fld + oy.ob(this.aw_fld, (byte)0);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Ltu;"
	)
	public tu at(int var1, int var2, int var3) {
		ul var4 = uv.ak();
		uy var5 = kv.ak();
		var4.ak_fld.ar(of.ak(this.av_fld.av()), 0.0F, 0.0F);
		tu.md(var4.ag_fld, this.av_fld.ah(), 0.0F, gu.ns(this.av_fld, 614668120), (byte)-21);
		var5.ax(var4);
		var5.aq();
		ul.ln(var4, (byte)-87);
		tu var6 = var5.ao(var1, 0.0F, var2);
		var6.ax(this.ax(-120566184), 0.0F, this.an((byte)24));
		var5.az();
		return var6;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void co(int var1, int var2) {
		for (int var3 = 0; var3 < this.ay_fld.length; var3++) {
			gu.ry(this.ay_fld[var3].ak_fld, var1, var2);
		}

		gu.ry(this.av_fld, var1, var2);
		this.au_fld.az(var1, var2, -592225575);
	}

	@ObfuscatedName("xt")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)Lqa;"
	)
	public static qa xt(rg var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				return 0 == var0.ai_fld && var0.aa_fld.av() && var0.aa_fld.ae().ao((byte)-127) ? var0.aa_fld : null;
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int dp(int var1) {
		return this.av_fld.ah();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lgu;)V"
	)
	public final void cj(dx var1, gu var2) {
		int var3 = gu.oq(var2, (byte)0);
		int var4 = var2.ae();
		if (!var1.ae(var3, var4, 769970368)) {
			this.ad(var2, (byte)5);
		} else {
			int var5 = var2.ah() - this.ay_fld[0].ak_fld.ah();
			int var6 = gu.ns(var2, -472065317) - gu.ns(this.ay_fld[0].ak_fld, 1952191799);
			ih(this, var2, Math.abs(var5), Math.abs(var6));
		}
	}

	@ObfuscatedName("isHiddenForOverlap")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isHiddenForOverlap() {
		return this.av(-1345832895);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lgu;)V"
	)
	public final void ch(dx var1, gu var2) {
		int var3 = gu.oq(var2, (byte)0);
		int var4 = var2.ae();
		if (!var1.ae(var3, var4, 1220694257)) {
			this.ad(var2, (byte)5);
		} else {
			int var5 = var2.ah() - this.ay_fld[0].ak_fld.ah();
			int var6 = gu.ns(var2, 498579917) - gu.ns(this.ay_fld[0].ak_fld, 1704494906);
			ih(this, var2, Math.abs(var5), Math.abs(var6));
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ci(int var1, int var2) {
		for (int var3 = 0; var3 < this.ay_fld.length; var3++) {
			gu.ry(this.ay_fld[var3].ak_fld, var1, var2);
		}

		gu.ry(this.av_fld, var1, var2);
		this.au_fld.az(var1, var2, -1206093117);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int hw() {
		return this.av_fld.ah();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int bf() {
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
		var3.ak_fld.ar(of.ak(this.av_fld.av()), 0.0F, 0.0F);
		tu.md(var3.ag_fld, this.av_fld.ah(), 0.0F, gu.ns(this.av_fld, -611152310), (byte)104);
		var1 -= this.ax(-1863329263);
		var2 -= this.an((byte)12);
		var4.ax(var3);
		ul.ln(var3, (byte)-2);
		tu var5 = var4.ao(var1, 0.0F, var2);
		var4.az();
		return var5;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)Ltu;"
	)
	public tu do_(int var1, int var2) {
		ul var3 = uv.ak();
		uy var4 = kv.ak();
		var3.ak_fld.ar(of.ak(this.av_fld.av()), 0.0F, 0.0F);
		tu.md(var3.ag_fld, this.av_fld.ah(), 0.0F, gu.ns(this.av_fld, -281381342), (byte)15);
		var4.ax(var3);
		var4.aq();
		ul.ln(var3, (byte)-2);
		tu var5 = var4.ao(var1, 0.0F, var2);
		var5.ax(this.ax(-580601282), 0.0F, this.an((byte)58));
		var4.az();
		return var5;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lgu;II)V"
	)
	public static void ih(rg var0, gu var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var0.as_fld < 9) {
				var0.as_fld++;
			}

			for (int var5 = var0.as_fld; var5 > 0; var5--) {
				rk var6 = var0.ay_fld[var5];
				var0.ay_fld[var5] = var0.ay_fld[var5 - 1];
				var0.ay_fld[var5 - 1] = var6;
			}

			var0.ay_fld[0].ak_fld.ay(var1);
			var0.ay_fld[0].ag_fld = client.dv_fld;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int gb() {
		return this.dp(527100376);
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int wc() {
		return this.dj(189745805);
	}

	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int xz() {
		return this.ak(-1615592074);
	}

	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void qq(int var1) {
		if (this.as_fld == 0) {
			this.ql(this.ay_fld[0].ak_fld);
		} else {
			if (!this.ax_fld) {
				if (this.pm_fld) {
					this.au_fld.dz(this.av_fld, var1 - 1, this.as_fld);
				}

				this.au_fld.ol(this.av_fld, this.ay_fld[0], var1);
				this.ax_fld = true;
			}

			if (this.au_fld.dz(this.av_fld, var1 + mt.rg_fld, this.as_fld)) {
				this.as_fld = this.as_fld * -1765208601 - 1;
				this.ax_fld = false;
			}

			this.pm_fld = true;
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "()Loy;"
	)
	public oy getConfig() {
		return this.aw_fld;
	}

	@ObfuscatedName("xp")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float xp() {
		return this.av_fld.ag_fld * -889401323;
	}

	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	@Override
	public float ub() {
		return this.av_fld.az_fld * -764828807;
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(II)Ltu;"
	)
	public tu vr(int var1, int var2) {
		return ql(this, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loy;I)V"
	)
	public void ay(oy var1, int var2) {
		try {
			this.aw_fld = var1;
			this.ah_fld.az_fld.po_fld = oy.ad(var1, -654080199);
			this.ah_fld.az_fld.bv_fld = oy.ob(var1, (byte)0);
			this.aa(oy.oj(var1, (byte)-27), -236168216);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	public void al(int var1, short var2) {
		this.al_fld = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ai(byte var1) {
		return this.aa_fld.ah();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lgu;III)V"
	)
	void ao(gu var1, int var2, int var3, int var4) {
		if (this.al_fld < 9) {
			this.as_fld++;
		}

		for (int var5 = this.al_fld * -1765208601; var5 > 0; var5--) {
			rk var6 = this.ay_fld[var5];
			this.ay_fld[var5] = this.ay_fld[var5 - 1];
			this.ay_fld[var5 - 1] = var6;
		}

		this.ay_fld[0].ak_fld.ay(var1);
		this.ay_fld[0].ag_fld = client.ug_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Ltu;"
	)
	public tu ap(int var1, int var2, int var3) {
		ul var4 = uv.ak();
		uy var5 = kv.ak();
		var4.ak_fld.ar(of.ak(this.av_fld.av()), 0.0F, 0.0F);
		tu.md(var4.az_fld, this.av_fld.ah(), 0.0F, gu.ns(this.av_fld, 436759147), (byte)43);
		var1 -= this.ak(-1726802021);
		var2 -= this.an((byte)62);
		var5.ax(var4);
		ul.ln(var4, (byte)-120);
		tu var6 = var5.ao(var1, 0.0F, var2);
		var5.aq();
		return var6;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lqa;"
	)
	qa ag(int var1) {
		try {
			return 0 == this.ar_fld && this.an_fld.av() && this.aa_fld.ae().ao((byte)-127) ? this.an_fld : null;
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lgu;B)V"
	)
	public final void am(dx var1, gu var2, byte var3) {
		int var4 = gu.oq(var2, (byte)0);
		int var5 = var2.ae();
		if (!var1.ae(var4, var5, 1859642480)) {
			this.ad(var2, (byte)5);
		} else {
			int var6 = var2.ah() - this.ay_fld[0].ak_fld.ah();
			int var7 = gu.ns(var2, -2105950856) - gu.ns(this.ay_fld[0].ak_fld, 441069255);
			ih(this, var2, Math.abs(var6), Math.abs(var7));
		}
	}

	@ObfuscatedName("tn")
	@ObfuscatedSignature(
		descriptor = "(Lrg;II)V"
	)
	public static void tn(rg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		for (int var3 = 0; var3 < var0.ay_fld.length; var3++) {
			gu.ry(var0.ay_fld[var3].ak_fld, var1, var2);
		}

		gu.ry(var0.av_fld, var1, var2);
		var0.au_fld.az(var1, var2, 1754749356);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Z)Lkt;"
	)
	public kt ba(boolean var1) {
		return var1 ? kt.aw_fld : oy.ma(this.aw_fld, (byte)44);
	}
}
