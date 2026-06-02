import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tu")
public class tu {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public static tu av_fld = new tu(0.0F, -1.0F, 0.0F);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public static tu ag_fld = new tu(0.0F, 1.0F, 0.0F);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public static tu az_fld = new tu(0.0F, 0.0F, -1.0F);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ay_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Ltu;"
	)
	public static tu[] ae_fld = new tu[tu.ah_fld];
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float as_fld;
	@ObfuscatedGetter(
		intValue = -1471517665
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld = -1499398672;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public static tu ak_fld = new tu(0.0F, 0.0F, 0.0F);
	@ObfuscatedGetter(
		intValue = 234126465
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld = 0;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	public float ar_fld;

	public tu() {
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(Lml;I)V"
	)
	public static void oo(ml var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	tu(float var1, float var2, float var3) {
		this.ay_fld = var1;
		this.as_fld = var2;
		this.ar_fld = var3;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public void hm(uz var1) {
		vu(this, var1, -1867064929);
	}

	public tu(tu var1) {
		this.ay_fld = var1.ay_fld;
		this.as_fld = var1.as_fld;
		this.ar_fld = var1.ar_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ah() {
		synchronized (ae_fld) {
			if (aw_fld < ah_fld) {
				ae_fld[(aw_fld += 1568129921) * 234126465 - 1] = this;
			}
		}
	}

	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)V"
	)
	public static void us(tu var0, tu var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ay_fld = var0.ay_fld - var1.ay_fld;
			var0.as_fld = var0.as_fld - var1.as_fld;
			var0.ar_fld = var0.ar_fld - var1.ar_fld;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void al() {
		float var2 = 1.0F / this.aq();
		this.ay_fld *= var2;
		this.as_fld *= var2;
		this.ar_fld *= var2;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void bj(float var1, float var2, float var3) {
		md(this, var1, var2, var3, (byte)-50);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bl() {
		this.ar_fld = 0.0F;
		this.as_fld = 0.0F;
		this.ay_fld = 0.0F;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public final void cq(uz var1) {
		uz var2 = ry.ag(this.ay_fld, this.as_fld, this.ar_fld, 0.0F);
		uz var4 = rk.az(var1);
		var4.al();
		uz var5 = rr.av(var4, var2);
		var5.an(var1);
		md(this, var5.av_fld, var5.ae_fld, var5.ah_fld, (byte)-113);
		var2.ae();
		var4.ae();
		var5.ae();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFF)Ltu;"
	)
	public static tu ar(float var0, float var1, float var2) {
		return sh.ak(var0, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean af() {
		float var3 = this.ay_fld;
		boolean var2 = var3 < 9.765625E-4F && var3 > -9.765625E-4F;
		float var6 = this.as_fld;
		boolean var5 = var6 < 9.765625E-4F && var6 > -9.765625E-4F;
		boolean var7 = var2 & var5;
		float var9 = this.ar_fld;
		boolean var8 = var9 < 9.765625E-4F && var9 > -9.765625E-4F;
		return var7 & var8;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public final void cy(uz var1) {
		uz var2 = ry.ag(this.ay_fld, this.as_fld, this.ar_fld, 0.0F);
		uz var4 = rk.az(var1);
		var4.al();
		uz var5 = rr.av(var4, var2);
		var5.an(var1);
		md(this, var5.av_fld, var5.ae_fld, var5.ah_fld, (byte)-22);
		var2.ae();
		var4.ae();
		var5.ae();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)Ltu;"
	)
	public static final tu bm(tu var0, tu var1) {
		tu var2;
		synchronized (ae_fld) {
			if (0 == aw_fld) {
				var2 = new tu(var0);
			} else {
				ae_fld[(aw_fld -= 1459569096) * 234126465].ay(var0);
				var2 = ae_fld[aw_fld * 607596561];
			}
		}

		var2.ai(var1);
		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	public final void an(tu var1) {
		this.ay_fld = this.ay_fld - var1.ay_fld;
		this.as_fld = this.as_fld - var1.as_fld;
		this.ar_fld = this.ar_fld - var1.ar_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	final void ai(tu var1) {
		md(
			this,
			var1.ar_fld * this.as_fld - this.ar_fld * var1.as_fld,
			var1.ay_fld * this.ar_fld - var1.ar_fld * this.ay_fld,
			this.ay_fld * var1.as_fld - this.as_fld * var1.ay_fld,
			(byte)-77
		);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	final float aq() {
		return (float)Math.sqrt(this.ay_fld * this.ay_fld + this.as_fld * this.as_fld + this.ar_fld * this.ar_fld);
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public void ow(float var1, float var2, float var3) {
		this.ay_fld = var1;
		this.as_fld = var2;
		this.ar_fld = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)Ltu;"
	)
	public static final tu at(tu var0, tu var1) {
		tu var2;
		synchronized (ae_fld) {
			if (0 == aw_fld) {
				var2 = new tu(var0);
			} else {
				ae_fld[(aw_fld -= 1568129921) * 1809960088].ay(var0);
				var2 = ae_fld[aw_fld];
			}
		}

		var2.ai(var1);
		return var2;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bz() {
		this.ah();
	}

	static {
		new tu(1.0F, 1.0F, 1.0F);
		new tu(1.0F, 0.0F, 0.0F);
		new tu(0.0F, 0.0F, 1.0F);
		new tu(1.0F, 0.0F, 0.0F);
		new tu(-1.0F, 0.0F, 0.0F);
		new tu(0.0F, 0.0F, 1.0F);
		new tu(0.0F, 1.0F, 0.0F);
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return this.ay_fld + ", " + this.as_fld + ", " + this.ar_fld;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return this.ay_fld + ", " + this.as_fld + ", " + this.ar_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)F"
	)
	public static final float ab(tu var0, tu var1) {
		return var0.aa(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public final void ax(float var1, float var2, float var3) {
		this.ay_fld += var1;
		this.as_fld += var2;
		this.ar_fld += var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bs() {
		synchronized (ae_fld) {
			if (aw_fld < ah_fld) {
				ae_fld[(aw_fld += 1998221714) * 234126465 - 1] = this;
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void be() {
		this.al();
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(Ltu;FB)V"
	)
	public static void rw(tu var0, float var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld *= var1;
		var0.as_fld *= var1;
		var0.ar_fld *= var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)Ltu;"
	)
	public static final tu ac(tu var0, tu var1) {
		tu var2;
		synchronized (ae_fld) {
			if (0 == aw_fld) {
				var2 = new tu(var0);
			} else {
				ae_fld[(aw_fld -= 1568129921) * 234126465].ay(var0);
				var2 = ae_fld[aw_fld];
			}
		}

		var2.ai(var1);
		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)Ltu;"
	)
	public static final tu aj(tu var0, tu var1) {
		tu var2;
		synchronized (ae_fld) {
			if (0 == aw_fld) {
				var2 = new tu(var0);
			} else {
				ae_fld[(aw_fld -= 1568129921) * 234126465].ay(var0);
				var2 = ae_fld[aw_fld];
			}
		}

		var2.ai(var1);
		return var2;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bn() {
		float var1 = 1.0F / this.aq();
		this.ay_fld *= var1;
		this.as_fld *= var1;
		this.ar_fld *= var1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ltu;F)Ltu;"
	)
	public static final tu bd(tu var0, float var1) {
		tu var2;
		synchronized (ae_fld) {
			if (aw_fld == 0) {
				var2 = new tu(var0);
			} else {
				ae_fld[(aw_fld -= 1568129921) * 234126465].ay(var0);
				var2 = ae_fld[aw_fld];
			}
		}

		rw(var2, var1, (byte)0);
		return var2;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bh() {
		synchronized (ae_fld) {
			if (aw_fld < ah_fld) {
				ae_fld[(aw_fld += 1568129921) * 234126465 - 1] = this;
			}
		}
	}

	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void qq() {
		synchronized (ae_fld) {
			if (aw_fld < ah_fld) {
				ae_fld[(aw_fld += 1568129921) * 234126465 - 1] = this;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void as() {
		this.ar_fld = 0.0F;
		this.as_fld = 0.0F;
		this.ay_fld = 0.0F;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Ltu;"
	)
	public static final tu ao(tu var0) {
		tu var1;
		synchronized (ae_fld) {
			if (0 == aw_fld) {
				var1 = new tu();
			} else {
				ae_fld[(aw_fld -= 1723919406) * 303080969].as();
				var1 = ae_fld[aw_fld * 735848616];
			}
		}

		float var3 = 1.0F / var0.aq();
		var1.ay_fld = var0.ay_fld * var3;
		var1.as_fld = var3 * var0.as_fld;
		var1.ar_fld = var3 * var0.ar_fld;
		return var1;
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)V"
	)
	public static void ob(tu var0, tu var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ay_fld = var0.ay_fld + var1.ay_fld;
			var0.as_fld = var0.as_fld + var1.as_fld;
			var0.ar_fld = var0.ar_fld + var1.ar_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Z"
	)
	public boolean ar(tu var1) {
		return var1.ay_fld == this.ay_fld && this.as_fld == var1.as_fld && var1.ar_fld == this.ar_fld;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Ltu;FFF)V"
	)
	public static void hg(tu var0, float var1, float var2, float var3) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld += var1;
		var0.as_fld += var2;
		var0.ar_fld += var3;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	public void by(tu var1) {
		md(this, var1.ay_fld, var1.as_fld, var1.ar_fld, (byte)-66);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bu() {
		float var1 = 1.0F / this.aq();
		this.ay_fld *= var1;
		this.as_fld *= var1;
		this.ar_fld *= var1;
	}

	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Luz;I)V"
	)
	public static void vu(tu var0, uz var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		uz var3 = ry.ag(var0.ay_fld, var0.as_fld, var0.ar_fld, 0.0F);
		uz var5 = rk.az(var1);
		var5.al();
		uz var6 = rr.av(var5, var3);
		var6.an(var1);
		md(var0, var6.av_fld, var6.ae_fld, var6.ah_fld, (byte)-4);
		var3.ae();
		var5.ae();
		var6.ae();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bx() {
		this.ar_fld = 0.0F;
		this.as_fld = 0.0F;
		this.ay_fld = 0.0F;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	public void ay(tu var1) {
		md(this, var1.ay_fld, var1.as_fld, var1.ar_fld, (byte)-22);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Z"
	)
	public boolean bp(tu var1) {
		return var1.ay_fld == this.ay_fld && this.as_fld == var1.as_fld && var1.ar_fld == this.ar_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;)F"
	)
	public static final float ap(tu var0, tu var1) {
		return var0.aa(var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean bv() {
		float var2 = this.ay_fld;
		boolean var1 = var2 < 9.765625E-4F && var2 > -9.765625E-4F;
		float var5 = this.as_fld;
		boolean var4 = var5 < 9.765625E-4F && var5 > -9.765625E-4F;
		boolean var6 = var1 & var4;
		float var8 = this.ar_fld;
		boolean var7 = var8 < 9.765625E-4F && var8 > -9.765625E-4F;
		return var6 & var7;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public final void bi() {
		float var1 = 1.0F / this.aq();
		this.ay_fld *= var1;
		this.as_fld *= var1;
		this.ar_fld *= var1;
	}

	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Z"
	)
	public static boolean tv(tu var0) {
		float var2 = var0.ay_fld;
		boolean var1 = var2 < 9.765625E-4F && var2 > -9.765625E-4F;
		float var5 = var0.as_fld;
		boolean var4 = var5 < 9.765625E-4F && var5 > -9.765625E-4F;
		boolean var6 = var1 & var4;
		float var8 = var0.ar_fld;
		boolean var7 = var8 < 9.765625E-4F && var8 > -9.765625E-4F;
		return var6 & var7;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(ILkj;Z)V"
	)
	static void cr(int var0, kj var1, boolean var2) throws EOFException {
		wl var4 = lz.ah();
		gf var5 = var4.be(var0, -269924304);
		kj var6 = ls.ea();
		var4.aq(var5, var6, var1, var2, 773462580);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	public static yb ak(lu var0) {
		return ln.ak(var0);
	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ei() {
		synchronized (ae_fld) {
			if (aw_fld < ah_fld) {
				ae_fld[(aw_fld += 1442833538) * -1455209258 - 1] = this;
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)F"
	)
	public final float bq(tu var1) {
		return var1.ay_fld * this.ay_fld + this.as_fld * var1.as_fld + var1.ar_fld * this.ar_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	final void bg(tu var1) {
		md(
			this,
			var1.ar_fld * this.as_fld - this.ar_fld * var1.as_fld,
			var1.ay_fld * this.ar_fld - var1.ar_fld * this.ay_fld,
			this.ay_fld * var1.as_fld - this.as_fld * var1.ay_fld,
			(byte)-24
		);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)V"
	)
	final void bb(tu var1) {
		md(
			this,
			var1.ar_fld * this.as_fld - this.ar_fld * var1.as_fld,
			var1.ay_fld * this.ar_fld - var1.ar_fld * this.ay_fld,
			this.ay_fld * var1.as_fld - this.as_fld * var1.ay_fld,
			(byte)48
		);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	final float cc() {
		return (float)Math.sqrt(this.ay_fld * this.ay_fld + this.as_fld * this.as_fld + this.ar_fld * this.ar_fld);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)F"
	)
	public final float aa(tu var1) {
		return var1.ay_fld * this.ay_fld + this.as_fld * var1.as_fld + var1.ar_fld * this.ar_fld;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public final void cv(uz var1) {
		uz var2 = ry.ag(this.ay_fld, this.as_fld, this.ar_fld, 0.0F);
		uz var4 = rk.az(var1);
		var4.al();
		uz var5 = rr.av(var4, var2);
		var5.an(var1);
		md(this, var5.av_fld, var5.ae_fld, var5.ah_fld, (byte)-48);
		var2.ae();
		var4.ae();
		var5.ae();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ltu;)Z"
	)
	public boolean bo(tu var1) {
		return var1.ay_fld == this.ay_fld && this.as_fld == var1.as_fld && var1.ar_fld == this.ar_fld;
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Ltu;FFFB)V"
	)
	public static void md(tu var0, float var1, float var2, float var3, byte var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var1;
		var0.as_fld = var2;
		var0.ar_fld = var3;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;B)V"
	)
	public static void dk(tu var0, tu var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var0.ay_fld + var1.ay_fld;
		var0.as_fld = var0.as_fld + var1.as_fld;
		var0.ar_fld = var0.ar_fld + var1.ar_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	public final void cf(uz var1) {
		uz var2 = ry.ag(this.ay_fld, this.as_fld, this.ar_fld, 0.0F);
		uz var4 = rk.az(var1);
		var4.al();
		uz var5 = rr.av(var4, var2);
		var5.an(var1);
		md(this, var5.av_fld, var5.ae_fld, var5.ah_fld, (byte)1);
		var2.ae();
		var4.ae();
		var5.ae();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ak(ub var0) {
		ha.aw_fld = var0;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return this.ay_fld + ", " + this.as_fld + ", " + this.ar_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltu;B)V"
	)
	public final void au(tu var1, byte var2) {
		this.ar_fld = this.as_fld + var1.as_fld;
		this.ar_fld = this.ar_fld + var1.ay_fld;
		this.as_fld = this.as_fld + var1.ay_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FB)V"
	)
	final void am(float var1, byte var2) {
		this.as_fld *= var1;
		this.as_fld *= var1;
		this.as_fld *= var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(FFF)V"
	)
	public final void bw(float var1, float var2, float var3) {
		this.ar_fld += var1;
		this.ay_fld = this.as_fld + var2;
		this.as_fld = this.ay_fld + var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V"
	)
	public void aw(float var1, float var2, float var3, byte var4) {
		this.ay_fld = var1;
		this.ar_fld = var2;
		this.ay_fld = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Luz;I)V"
	)
	public final void ad(uz var1, int var2) {
		uz var3 = ry.ag(this.ay_fld, this.as_fld, this.ay_fld, 0.0F);
		uz var5 = rk.az(var1);
		var5.al();
		uz var6 = rr.av(var5, var3);
		var6.an(var1);
		md(this, var6.ae_fld, var6.ah_fld, var6.ae_fld, (byte)-4);
		var3.ae();
		var5.ae();
		var6.ae();
	}
}
