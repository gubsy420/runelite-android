import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uz")
public class uz {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -962038649
	)
	static int ag_fld = 1038160752;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 770960779
	)
	static int az_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	static uz[] ak_fld = new uz[ag_fld];
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	float aw_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;

	uz(float var1, float var2, float var3, float var4) {
		this.ah(var1, var2, var3, var4);
	}

	@ObfuscatedName("xq")
	@ObfuscatedSignature(
		descriptor = "(Luz;I)V"
	)
	public static void xq(uz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			float var4 = var0.ax(var0);
			float var2 = (float)Math.sqrt(var4);
			var4 = 1.0F / var2;
			var0.av_fld *= var4;
			var0.ae_fld *= var4;
			var0.ah_fld *= var4;
			var0.aw_fld *= var4;
		}
	}

	uz(uz var1) {
		ik(this, var1, (byte)-2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ae() {
		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += -1833938397) * 770960779 - 1] = this;
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Lqc;)I"
	)
	public static int lh(qc var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)V"
	)
	void ah(float var1, float var2, float var3, float var4) {
		this.av_fld = var1;
		this.ae_fld = var2;
		this.ah_fld = var3;
		this.aw_fld = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltu;FB)V"
	)
	public void ay(tu var1, float var2) {
		this.as(var1.ar_fld, var1.ay_fld, var1.as_fld, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V"
	)
	public void as(float var1, float var2, float var3, float var4) {
		float var6 = (float)Math.sin(0.5F * var4);
		float var7 = (float)Math.cos(0.5F * var4);
		this.av_fld = var1 * var6;
		this.ae_fld = var6 * var2;
		this.ah_fld = var3 * var6;
		this.aw_fld = var7;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Luz;"
	)
	public static uz aa() {
		synchronized (ak_fld) {
			if (az_fld == 0) {
				return new uz();
			} else {
				ak_fld[(az_fld -= -1833938397) * 770960779].af();
				return ak_fld[az_fld];
			}
		}
	}

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void wa(uz var1) {
		this.an(var1);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Luz;Ljava/lang/Object;)Z"
	)
	public static boolean ch(uz var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!(var1 instanceof uz)) {
			return false;
		} else {
			uz var2 = (uz)var1;
			return var0.av_fld == var2.av_fld && var0.ae_fld == var2.ae_fld && var2.ah_fld == var0.ah_fld && var0.aw_fld == var2.aw_fld;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bw() {
		this.af();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFF)Luz;"
	)
	static uz aq(float var0, float var1, float var2, float var3) {
		synchronized (ak_fld) {
			if (az_fld == 0) {
				return new uz(var0, var1, var2, var3);
			} else {
				ak_fld[(az_fld -= -1833938397) * 770960779].ah(var0, var1, var2, var3);
				return ak_fld[az_fld];
			}
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Luz;Ltu;F)V"
	)
	public static void dp(uz var0, tu var1, float var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as(var1.ar_fld, var1.ay_fld, var1.as_fld, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void al() {
		this.av_fld = -this.av_fld;
		this.ae_fld = -this.ae_fld;
		this.ah_fld = -this.ah_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void bs(float var1, float var2, float var3, float var4) {
		this.as(var1, var2, var3, var4);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;B)V"
	)
	public static void ik(uz var0, uz var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld = var1.av_fld;
			var0.ae_fld = var1.ae_fld;
			var0.ah_fld = var1.ah_fld;
			var0.aw_fld = var1.aw_fld;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;)Luz;"
	)
	static final uz ab(uz var0, uz var1) {
		uz var2 = rk.az(var0);
		var2.an(var1);
		return var2;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(Luz;)I"
	)
	public static int et(uz var0) {
		byte var1 = 31;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + var0.av_fld;
		var2 = var0.ae_fld + 31.0F * var2;
		var2 = 31.0F * var2 + var0.ah_fld;
		var2 = var0.aw_fld + var2 * 31.0F;
		return (int)var2;
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		byte var1 = 31;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.av_fld;
		var2 = this.ae_fld + 31.0F * var2;
		var2 = 31.0F * var2 + this.ah_fld;
		var2 = this.aw_fld + var2 * 31.0F;
		return (int)var2;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof uz)) {
			return false;
		} else {
			uz var2 = (uz)var1;
			return this.av_fld == var2.av_fld && this.ae_fld == var2.ae_fld && var2.ah_fld == this.ah_fld && this.aw_fld == var2.aw_fld;
		}
	}

	uz() {
		this.af();
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return this.av_fld + "," + this.ae_fld + "," + this.ah_fld + "," + this.aw_fld;
	}

	static {
		new uz();
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.av_fld + "," + this.ae_fld + "," + this.ah_fld + "," + this.aw_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ba() {
		this.ae();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Luz;I)V"
	)
	public final void an(uz var1) {
		this.ah(
			this.ah_fld * var1.ae_fld + (var1.av_fld * this.aw_fld + this.av_fld * var1.aw_fld) - this.ae_fld * var1.ah_fld,
			this.av_fld * var1.ah_fld + (var1.ae_fld * this.aw_fld + (var1.aw_fld * this.ae_fld - this.ah_fld * var1.av_fld)),
			this.ah_fld * var1.aw_fld + var1.av_fld * this.ae_fld - this.av_fld * var1.ae_fld + this.aw_fld * var1.ah_fld,
			var1.aw_fld * this.aw_fld - this.av_fld * var1.av_fld - this.ae_fld * var1.ae_fld - this.ah_fld * var1.ah_fld
		);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		if (!(var1 instanceof uz)) {
			return false;
		} else {
			uz var2 = (uz)var1;
			return this.av_fld == var2.av_fld && this.ae_fld == var2.ae_fld && var2.ah_fld == this.ah_fld && this.aw_fld == var2.aw_fld;
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		if (!(var1 instanceof uz)) {
			return false;
		} else {
			uz var2 = (uz)var1;
			return this.av_fld == var2.av_fld && this.ae_fld == var2.ae_fld && var2.ah_fld == this.ah_fld && this.aw_fld == var2.aw_fld;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	final void af() {
		this.ah_fld = 0.0F;
		this.ae_fld = 0.0F;
		this.av_fld = 0.0F;
		this.aw_fld = 1.0F;
	}

	@ObfuscatedName("afm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afm() {
		byte var1 = 31;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.av_fld;
		var2 = this.ae_fld + 31.0F * var2;
		var2 = 31.0F * var2 + this.ah_fld;
		var2 = this.aw_fld + var2 * 31.0F;
		return (int)var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;)Luz;"
	)
	static final uz at(uz var0, uz var1) {
		uz var2 = rk.az(var0);
		var2.an(var1);
		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Luz;"
	)
	public static uz ai() {
		synchronized (ak_fld) {
			if (az_fld * -301216645 == 0) {
				return new uz();
			} else {
				ak_fld[(az_fld -= 1537387783) * 770960779].af();
				return ak_fld[az_fld * -388367738];
			}
		}
	}

	@ObfuscatedName("afa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afa() {
		byte var1 = 31;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.av_fld;
		var2 = this.ae_fld + 31.0F * var2;
		var2 = 31.0F * var2 + this.ah_fld;
		var2 = this.aw_fld + var2 * 31.0F;
		return (int)var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luz;)Luz;"
	)
	static uz am(uz var0) {
		synchronized (ak_fld) {
			if (az_fld == 0) {
				return new uz(var0);
			} else {
				ik(ak_fld[(az_fld -= -1833938397) * 770960779], var0, (byte)-6);
				return ak_fld[az_fld];
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Luz;I)F"
	)
	final float ax(uz var1) {
		return this.av_fld * var1.av_fld + var1.ae_fld * this.ae_fld + var1.ah_fld * this.ah_fld + this.aw_fld * var1.aw_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luz;)Luz;"
	)
	static uz ao(uz var0) {
		synchronized (ak_fld) {
			if (az_fld == 0) {
				return new uz(var0);
			} else {
				ik(ak_fld[(az_fld -= -1833938397) * -1087670061], var0, (byte)-59);
				return ak_fld[645320320 * az_fld];
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Luz;)Luz;"
	)
	static uz ad(uz var0) {
		synchronized (ak_fld) {
			if (az_fld == 0) {
				return new uz(var0);
			} else {
				ik(ak_fld[(az_fld -= -1833938397) * 203040403], var0, (byte)-109);
				return ak_fld[-1843550974 * az_fld];
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	void bd(float var1, float var2, float var3, float var4) {
		this.av_fld = var1;
		this.ae_fld = var2;
		this.ah_fld = var3;
		this.aw_fld = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ac() {
		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += -1833938397) * 770960779 - 1] = this;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aj() {
		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += -1833938397) * 770960779 - 1] = this;
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bm() {
		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += -1833938397) * -483586743 - 1] = this;
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ltu;F)V"
	)
	public void be(tu var1, float var2) {
		this.as(var1.ar_fld, var1.ay_fld, var1.as_fld, var2);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void bh(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin(0.5F * var4);
		float var6 = (float)Math.cos(0.5F * var4);
		this.av_fld = var1 * var5;
		this.ae_fld = var5 * var2;
		this.ah_fld = var3 * var5;
		this.aw_fld = var6;
	}

	@ObfuscatedName("xw")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public static void xw(uz var0) {
		var0.av_fld = -var0.av_fld;
		var0.ae_fld = -var0.ae_fld;
		var0.ah_fld = -var0.ah_fld;
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void wq(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin(0.5F * var4);
		float var6 = (float)Math.cos(0.5F * var4);
		this.av_fld = var1 * var5;
		this.ae_fld = var5 * var2;
		this.ah_fld = var3 * var5;
		this.aw_fld = var6;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void bk(float var1, float var2, float var3) {
		this.as(0.0F, 1.0F, 0.0F, var1);
		uz var4 = qo.ak();
		var4.as(1.0F, 0.0F, 0.0F, var2);
		this.an(var4);
		var4.as(0.0F, 0.0F, 1.0F, var3);
		this.an(var4);
		var4.ae();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bj() {
		this.ah_fld = 0.0F;
		this.ae_fld = 0.0F;
		this.av_fld = 0.0F;
		this.aw_fld = 1.0F;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;)Luz;"
	)
	static final uz ap(uz var0, uz var1) {
		uz var2 = rk.az(var0);
		var2.an(var1);
		return var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bo() {
		float var3 = this.ax(this);
		float var1 = (float)Math.sqrt(var3);
		var3 = 1.0F / var1;
		this.av_fld *= var3;
		this.ae_fld *= var3;
		this.ah_fld *= var3;
		this.aw_fld *= var3;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "()Luz;"
	)
	public static uz ma() {
		return qo.ak();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void cr(float var1, float var2, float var3) {
		lv(this, var1, var2, var3, -441697260);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bl() {
		this.av_fld = -this.av_fld;
		this.ae_fld = -this.ae_fld;
		this.ah_fld = -this.ah_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bx() {
		float var3 = this.ax(this);
		float var1 = (float)Math.sqrt(var3);
		var3 = 1.0F / var1;
		this.av_fld *= var3;
		this.ae_fld *= var3;
		this.ah_fld *= var3;
		this.aw_fld *= var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ltu;F)V"
	)
	public void bz(tu var1, float var2) {
		this.as(var1.ar_fld, var1.ay_fld, var1.as_fld, var2);
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Luz;FFFI)V"
	)
	public static void lv(uz var0, float var1, float var2, float var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as(0.0F, 1.0F, 0.0F, var1);
		uz var5 = qo.ak();
		var5.as(1.0F, 0.0F, 0.0F, var2);
		var0.an(var5);
		var5.as(0.0F, 0.0F, 1.0F, var3);
		var0.an(var5);
		var5.ae();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bp() {
		float var3 = this.ax(this);
		float var1 = (float)Math.sqrt(var3);
		var3 = 1.0F / var1;
		this.av_fld *= var3;
		this.ae_fld *= var3;
		this.ah_fld *= var3;
		this.aw_fld *= var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Luz;)F"
	)
	final float bt(uz var1) {
		return this.av_fld * var1.av_fld + var1.ae_fld * this.ae_fld + var1.ah_fld * this.ah_fld + this.aw_fld * var1.aw_fld;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;)V"
	)
	public static void ek(uz var0, uz var1) {
		var0.ah(
			var0.ah_fld * var1.ae_fld + (var1.av_fld * var0.aw_fld + var0.av_fld * var1.aw_fld) - var0.ae_fld * var1.ah_fld,
			var0.av_fld * var1.ah_fld + (var1.ae_fld * var0.aw_fld + (var1.aw_fld * var0.ae_fld - var0.ah_fld * var1.av_fld)),
			var0.ah_fld * var1.aw_fld + var1.av_fld * var0.ae_fld - var0.av_fld * var1.ae_fld + var0.aw_fld * var1.ah_fld,
			var1.aw_fld * var0.aw_fld - var0.av_fld * var1.av_fld - var0.ae_fld * var1.ae_fld - var0.ah_fld * var1.ah_fld
		);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Luz;)F"
	)
	final float bv(uz var1) {
		return this.av_fld * var1.av_fld + var1.ae_fld * this.ae_fld + var1.ah_fld * this.ah_fld + this.aw_fld * var1.aw_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public final void bi(uz var1) {
		this.ah(
			this.ah_fld * var1.ae_fld + (var1.av_fld * this.aw_fld + this.av_fld * var1.aw_fld) - this.ae_fld * var1.ah_fld,
			this.av_fld * var1.ah_fld + (var1.ae_fld * this.aw_fld + (var1.aw_fld * this.ae_fld - this.ah_fld * var1.av_fld)),
			this.ah_fld * var1.aw_fld + var1.av_fld * this.ae_fld - this.av_fld * var1.ae_fld + this.aw_fld * var1.ah_fld,
			var1.aw_fld * this.aw_fld - this.av_fld * var1.av_fld - this.ae_fld * var1.ae_fld - this.ah_fld * var1.ah_fld
		);
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Luz;)Ljava/lang/String;"
	)
	public static String eg(uz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld + "," + var0.ae_fld + "," + var0.ah_fld + "," + var0.aw_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luz;B)V"
	)
	void aw(uz var1, byte var2) {
		this.av_fld = var1.aw_fld;
		this.ah_fld = var1.av_fld;
		this.ae_fld = var1.aw_fld;
		this.ae_fld = var1.av_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V"
	)
	public void ar(float var1, float var2, float var3, int var4) {
		this.as(0.0F, 1.0F, 0.0F, var1);
		uz var5 = qo.ak();
		var5.as(1.0F, 0.0F, 0.0F, var2);
		this.an(var5);
		var5.as(0.0F, 0.0F, 1.0F, var3);
		this.an(var5);
		var5.ae();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public final void au(int var1) {
		this.av_fld = 0.0F;
		this.av_fld = 0.0F;
		this.aw_fld = 0.0F;
		this.aw_fld = 1.0F;
	}
}
