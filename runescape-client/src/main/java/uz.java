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
	@ObfuscatedGetter(
		intValue = -962038649
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld = 1038160752;
	@ObfuscatedGetter(
		intValue = 770960779
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.av_fld + "," + this.ae_fld + "," + this.ah_fld + "," + this.aw_fld;
	}

	@ObfuscatedName("uq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void uq() {
		this.ae();
	}

	uz(uz var1) {
		this.aw(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ae() {
		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += -1833938397) * 770960779 - 1] = this;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	void ah(float var1, float var2, float var3, float var4) {
		this.av_fld = var1;
		this.ae_fld = var2;
		this.ah_fld = var3;
		this.aw_fld = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	void aw(uz var1) {
		this.av_fld = var1.av_fld;
		this.ae_fld = var1.ae_fld;
		this.ah_fld = var1.ah_fld;
		this.aw_fld = var1.aw_fld;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	public static void iq(uk var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = null;
		var0.ag_fld = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltu;F)V"
	)
	public void ay(tu var1, float var2) {
		this.as(var1.ay_fld, var1.as_fld, var1.ar_fld, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bm() {
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

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Luz;)Ljava/lang/String;"
	)
	public static String mk(uz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld + "," + var0.ae_fld + "," + var0.ah_fld + "," + var0.aw_fld;
	}

	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void vs(uz var1) {
		this.an(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void al() {
		this.av_fld = -this.av_fld;
		this.ae_fld = -this.ae_fld;
		this.ah_fld = -this.ah_fld;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void ar(float var1, float var2, float var3) {
		this.as(0.0F, 1.0F, 0.0F, var1);
		uz var5 = qo.ak();
		var5.as(1.0F, 0.0F, 0.0F, var2);
		this.an(var5);
		var5.as(0.0F, 0.0F, 1.0F, var3);
		this.an(var5);
		var5.ae();
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void bb(float var1, float var2, float var3, float var4) {
		this.as(var1, var2, var3, var4);
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return this.av_fld + "," + this.ae_fld + "," + this.ah_fld + "," + this.aw_fld;
	}

	static {
		new uz();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public final void an(uz var1) {
		this.ah(
			this.ah_fld * var1.ae_fld + (var1.av_fld * this.aw_fld + this.av_fld * var1.aw_fld) - this.ae_fld * var1.ah_fld,
			this.av_fld * var1.ah_fld + (var1.ae_fld * this.aw_fld + (var1.aw_fld * this.ae_fld - this.ah_fld * var1.av_fld)),
			this.ah_fld * var1.aw_fld + var1.av_fld * this.ae_fld - this.av_fld * var1.ae_fld + this.aw_fld * var1.ah_fld,
			var1.aw_fld * this.aw_fld - this.av_fld * var1.av_fld - this.ae_fld * var1.ae_fld - this.ah_fld * var1.ah_fld
		);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public static void ex(uz var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			synchronized (ak_fld) {
				if (az_fld < ag_fld) {
					ak_fld[(az_fld += -1833938397) * 770960779 - 1] = var0;
				}
			}
		}
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

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		if (!(var1 instanceof uz)) {
			return false;
		} else {
			uz var2 = (uz)var1;
			return this.av_fld == var2.av_fld && this.ae_fld == var2.ae_fld && var2.ah_fld == this.ah_fld && this.aw_fld == var2.aw_fld;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void af() {
		this.ah_fld = 0.0F;
		this.ae_fld = 0.0F;
		this.av_fld = 0.0F;
		this.aw_fld = 1.0F;
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

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Luz;FFFF)V"
	)
	public static void jh(uz var0, float var1, float var2, float var3, float var4) {
		if (var0 == null) {
			var0.getClass();
		}

		float var5 = (float)Math.sin(0.5F * var4);
		float var6 = (float)Math.cos(0.5F * var4);
		var0.av_fld = var1 * var5;
		var0.ae_fld = var5 * var2;
		var0.ah_fld = var3 * var5;
		var0.aw_fld = var6;
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luz;)Luz;"
	)
	static uz am(uz var0) {
		synchronized (ak_fld) {
			if (az_fld == 0) {
				return new uz(var0);
			} else {
				ak_fld[(az_fld -= -1833938397) * 770960779].aw(var0);
				return ak_fld[az_fld];
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Luz;)F"
	)
	final float ax(uz var1) {
		return this.av_fld * var1.av_fld + var1.ae_fld * this.ae_fld + var1.ah_fld * this.ah_fld + this.aw_fld * var1.aw_fld;
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "()Luz;"
	)
	public static uz lx() {
		return qo.ak();
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
				ak_fld[(az_fld -= -1833938397) * -1087670061].aw(var0);
				return ak_fld[645320320 * az_fld];
			}
		}
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void ov(float var1, float var2, float var3) {
		this.ar(var1, var2, var3);
	}

	@ObfuscatedName("afc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int afc() {
		byte var1 = 31;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.av_fld;
		var2 = this.ae_fld + 31.0F * var2;
		var2 = 31.0F * var2 + this.ah_fld;
		var2 = this.aw_fld + var2 * 31.0F;
		return (int)var2;
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
				ak_fld[(az_fld -= -1833938397) * 203040403].aw(var0);
				return ak_fld[-1843550974 * az_fld];
			}
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void mi() {
		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += -1833938397) * -483586743 - 1] = this;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void au() {
		float var4 = this.ax(this);
		float var2 = (float)Math.sqrt(var4);
		var4 = 1.0F / var2;
		this.av_fld *= var4;
		this.ae_fld *= var4;
		this.ah_fld *= var4;
		this.aw_fld *= var4;
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

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public static void kl(uz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += -1833938397) * 770960779 - 1] = var0;
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ltu;F)V"
	)
	public void br(tu var1, float var2) {
		this.as(var1.ay_fld, var1.as_fld, var1.ar_fld, var2);
	}

	@ObfuscatedName("zy")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public static void zy(uz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ah_fld = 0.0F;
		var0.ae_fld = 0.0F;
		var0.av_fld = 0.0F;
		var0.aw_fld = 1.0F;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ltu;F)V"
	)
	public void be(tu var1, float var2) {
		this.as(var1.ay_fld, var1.as_fld, var1.ar_fld, var2);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(FFFF)V"
	)
	public void bs(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin(0.5F * var4);
		float var6 = (float)Math.cos(0.5F * var4);
		this.av_fld = var1 * var5;
		this.ae_fld = var5 * var2;
		this.ah_fld = var3 * var5;
		this.aw_fld = var6;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Luz;)I"
	)
	public static int ok(uz var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			byte var1 = 31;
			float var2 = 1.0F;
			var2 = var2 * 31.0F + var0.av_fld;
			var2 = var0.ae_fld + 31.0F * var2;
			var2 = 31.0F * var2 + var0.ah_fld;
			var2 = var0.aw_fld + var2 * 31.0F;
			return (int)var2;
		}
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lda;Lbb;)V"
	)
	public static void ca(da var0, bb var1) {
		var0.cg_fld.ag(var1);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void by() {
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	final void bj() {
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
		this.as(var1.ay_fld, var1.as_fld, var1.ar_fld, var2);
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Luz;)F"
	)
	final float bv(uz var1) {
		return this.av_fld * var1.av_fld + var1.ae_fld * this.ae_fld + var1.ah_fld * this.ah_fld + this.aw_fld * var1.aw_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public final void bu(uz var1) {
		this.ah(
			this.ah_fld * var1.ae_fld + (var1.av_fld * this.aw_fld + this.av_fld * var1.aw_fld) - this.ae_fld * var1.ah_fld,
			this.av_fld * var1.ah_fld + (var1.ae_fld * this.aw_fld + (var1.aw_fld * this.ae_fld - this.ah_fld * var1.av_fld)),
			this.ah_fld * var1.aw_fld + var1.av_fld * this.ae_fld - this.av_fld * var1.ae_fld + this.aw_fld * var1.ah_fld,
			var1.aw_fld * this.aw_fld - this.av_fld * var1.av_fld - this.ae_fld * var1.ae_fld - this.ah_fld * var1.ah_fld
		);
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
}
