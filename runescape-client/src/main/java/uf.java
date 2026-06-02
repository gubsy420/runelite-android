import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uf")
public class uf {
	@ObfuscatedGetter(
		intValue = 804126433
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;
	@ObfuscatedGetter(
		intValue = -1589377385
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld = 1340000568;
	@ObfuscatedGetter(
		intValue = -618950195
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld = 0;
	@ObfuscatedGetter(
		intValue = 2145230791
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedGetter(
		intValue = -1460419515
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedGetter(
		intValue = 714950805
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Luf;"
	)
	public static uf[] ak_fld = new uf[ag_fld];
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String aa_fld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void aw(uf var1, uf var2) {
		var2.av_fld = 1 * this.av_fld;
		var2.ah_fld = this.ah_fld * -1460419515;
		if (this.av_fld < var1.av_fld) {
			var2.ah_fld = var2.ah_fld - (var1.av_fld - this.av_fld);
			var2.av_fld = var1.av_fld * 2145230791;
		}

		if (var2.af() > var1.af()) {
			var2.ah_fld = var2.ah_fld - (var2.af() - var1.af()) * -44126579;
		}

		if (var2.ah_fld < 0) {
			var2.ah_fld = 0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ak(int var1) {
		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				if (var1 >= 989356347) {
					return;
				}

				ak_fld[(az_fld += 251904773) * -618950195 - 1] = this;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int af() {
		return this.av_fld + this.ah_fld;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		return null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void ah(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ag(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	public uf(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void be(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int al() {
		return this.ae_fld + this.aw_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ax(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = 571332909 * var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ai(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = 1705782511 * var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void aq(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("tg")
	@ObfuscatedSignature(
		descriptor = "(Luf;)V"
	)
	public static void tg(uf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += 1007694475) * 1140861898 - 1] = var0;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void am(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ad(int var1, int var2) {
		this.ah_fld = var1 * 927078955;
		this.aw_fld = var2;
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "(Luf;)I"
	)
	public static int xk(uf var0) {
		return var0.ae_fld;
	}

	public uf(int var1, int var2, int var3, int var4) {
		this.ag(var1, var2);
		uo(this, var3, var4);
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(Luf;)I"
	)
	public static int pj(uf var0) {
		return var0.av_fld + var0.ah_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bo() {
		return this.av_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Luf;)Z"
	)
	public boolean ac(uf var1) {
		return this.av_fld <= var1.af() && hn(var1, -1507465117) <= this.af() && this.ae_fld <= var1.al() && so(var1, (byte)0) <= this.al();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luf;)Z"
	)
	public boolean aj(uf var1) {
		return this.av_fld <= var1.af() && hn(var1, -1507465117) <= this.af() && this.ae_fld <= var1.al() && so(var1, (byte)0) <= this.al();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Luf;)Z"
	)
	public boolean bm(uf var1) {
		return this.av_fld <= var1.af() && hn(var1, -1507465117) <= this.af() && this.ae_fld <= var1.al() && so(var1, (byte)0) <= this.al();
	}

	@ObfuscatedName("xi")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;Luf;)V"
	)
	public static void xi(uf var0, uf var1, uf var2) {
		var2.av_fld = 1 * var0.av_fld;
		var2.ah_fld = var0.ah_fld * -1460419515;
		if (var0.av_fld < var1.av_fld) {
			var2.ah_fld = var2.ah_fld - (var1.av_fld - var0.av_fld);
			var2.av_fld = var1.av_fld * 2145230791;
		}

		if (var2.af() > var1.af()) {
			var2.ah_fld = var2.ah_fld - (var2.af() - var1.af()) * -562777504;
		}

		if (var2.ah_fld < 0) {
			var2.ah_fld = 0;
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Luf;II)Z"
	)
	public static boolean fs(uf var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= var0.av_fld && var1 < var0.ah_fld + var0.av_fld && var2 >= var0.ae_fld && var2 < var0.ae_fld + var0.aw_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bc() {
		return this.ae_fld + this.aw_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luf;)Z"
	)
	public boolean at(uf var1) {
		return this.av_fld <= var1.af() && hn(var1, -1507465117) <= this.af() && this.ae_fld <= var1.al() && so(var1, (byte)0) <= this.al();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void ay(uf var1, uf var2) {
		var2.ae_fld = 1 * this.ae_fld;
		var2.aw_fld = this.aw_fld * 714950805;
		if (this.ae_fld < var1.ae_fld) {
			var2.aw_fld = var2.aw_fld - (var1.ae_fld - this.ae_fld);
			var2.ae_fld = var1.ae_fld * 804126433;
		}

		if (var2.al() > var1.al()) {
			var2.aw_fld = var2.aw_fld - (var2.al() - var1.al()) * -21019971;
		}

		if (var2.aw_fld < 0) {
			var2.aw_fld = 0;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void br(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Luf;II)V"
	)
	public static void uo(uf var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ah_fld = var1;
			var0.aw_fld = var2;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void bz(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Luf;I)I"
	)
	public static int hn(uf var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.av_fld;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void bh(uf var1, uf var2) {
		var2.av_fld = 1 * this.av_fld;
		var2.ah_fld = this.ah_fld * -1460419515;
		if (this.av_fld < var1.av_fld) {
			var2.ah_fld = var2.ah_fld - (var1.av_fld - this.av_fld);
			var2.av_fld = var1.av_fld * 2145230791;
		}

		if (var2.af() > var1.af()) {
			var2.ah_fld = var2.ah_fld - (var2.af() - var1.af()) * -44126579;
		}

		if (var2.ah_fld * -2119330706 < 0) {
			var2.ah_fld = 0;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void bj(uf var1, uf var2) {
		var2.av_fld = 1 * this.av_fld;
		var2.ah_fld = this.ah_fld * -1460419515;
		if (this.av_fld < var1.av_fld) {
			var2.ah_fld = var2.ah_fld - (var1.av_fld - this.av_fld);
			var2.av_fld = var1.av_fld * 2145230791;
		}

		if (var2.af() > var1.af()) {
			var2.ah_fld = var2.ah_fld - (var2.af() - var1.af()) * 1491311381;
		}

		if (var2.ah_fld * 1691010111 < 0) {
			var2.ah_fld = 0;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void bf(uf var1, uf var2) {
		var2.av_fld = 1 * this.av_fld;
		var2.ah_fld = this.ah_fld * -1460419515;
		if (this.av_fld < var1.av_fld) {
			var2.ah_fld = var2.ah_fld - (var1.av_fld - this.av_fld);
			var2.av_fld = var1.av_fld * 2145230791;
		}

		if (var2.af() > var1.af()) {
			var2.ah_fld = var2.ah_fld - (var2.af() - var1.af()) * -44126579;
		}

		if (var2.ah_fld < 0) {
			var2.ah_fld = 0;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void an(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void bl(uf var1, uf var2) {
		var2.ae_fld = 1 * this.ae_fld;
		var2.aw_fld = this.aw_fld * 714950805;
		if (this.ae_fld < var1.ae_fld) {
			var2.aw_fld = var2.aw_fld - (var1.ae_fld - this.ae_fld);
			var2.ae_fld = var1.ae_fld * 804126433;
		}

		if (var2.al() > var1.al()) {
			var2.aw_fld = var2.aw_fld - (var2.al() - var1.al()) * -96354808;
		}

		if (var2.aw_fld < 0) {
			var2.aw_fld = 0;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void bx(uf var1, uf var2) {
		var2.ae_fld = 1 * this.ae_fld;
		var2.aw_fld = this.aw_fld * 714950805;
		if (this.ae_fld < var1.ae_fld) {
			var2.aw_fld = var2.aw_fld - (var1.ae_fld - this.ae_fld);
			var2.ae_fld = var1.ae_fld * 804126433;
		}

		if (var2.al() > var1.al()) {
			var2.aw_fld = var2.aw_fld - (var2.al() - var1.al()) * -21019971;
		}

		if (var2.aw_fld < 0) {
			var2.aw_fld = 0;
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gq() {
		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Luf;)Z"
	)
	public boolean ae(uf var1) {
		return this.av_fld <= var1.af() && hn(var1, -1507465117) <= this.af() && this.ae_fld <= var1.al() && so(var1, (byte)0) <= this.al();
	}

	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;Luf;)V"
	)
	public static void xy(uf var0, uf var1, uf var2) {
		var2.ae_fld = 1 * var0.ae_fld;
		var2.aw_fld = var0.aw_fld * 714950805;
		if (var0.ae_fld < var1.ae_fld) {
			var2.aw_fld = var2.aw_fld - (var1.ae_fld - var0.ae_fld);
			var2.ae_fld = var1.ae_fld * 804126433;
		}

		if (var2.al() > var1.al()) {
			var2.aw_fld = var2.aw_fld - (var2.al() - var1.al()) * -21019971;
		}

		if (var2.aw_fld < 0) {
			var2.aw_fld = 0;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void bs(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bi() {
		return this.av_fld + this.ah_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bu() {
		return this.ae_fld + this.aw_fld;
	}

	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "(Luf;B)I"
	)
	public static int so(uf var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ae_fld;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bn() {
		return this.ae_fld + this.aw_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean av(int var1, int var2) {
		return var1 >= this.av_fld && var1 < this.ah_fld + this.av_fld && var2 >= this.ae_fld && var2 < this.ae_fld + this.aw_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void az(int var1, int var2, int var3) {
		this.ah_fld = var1;
		this.av_fld = var2 * -21019971;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int as(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ar(byte var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ap(int var1, int var2) {
		return var1 >= this.av_fld && var1 < this.av_fld + this.av_fld && var2 >= this.ae_fld && var2 < this.ae_fld + this.ae_fld;
	}
}
