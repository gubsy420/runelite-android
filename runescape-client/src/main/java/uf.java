import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uf")
public class uf {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 804126433
	)
	public int ae_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1589377385
	)
	static int ag_fld = 1340000568;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -618950195
	)
	public static int az_fld = 0;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2145230791
	)
	public int av_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int am_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1460419515
	)
	public int ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 714950805
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void au() {
		synchronized (ak_fld) {
			if (az_fld < ag_fld) {
				ak_fld[(az_fld += 1007694475) * 1140861898 - 1] = this;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;I)V"
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

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "(Luf;II)Z"
	)
	public static boolean vc(uf var0, int var1, int var2) {
		return var1 >= var0.av_fld && var1 < var0.ah_fld + var0.av_fld && var2 >= var0.ae_fld && var2 < var0.ae_fld + var0.aw_fld;
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void bd(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void az(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int af() {
		return this.av_fld + this.ah_fld;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;I)V"
	)
	public void ah(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ag(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	public uf(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bt() {
		return this.ae_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int as() {
		return this.av_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ar() {
		return this.ae_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void bz(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void by(uf var1, uf var2) {
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

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String gi() {
		return null;
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Luf;III)Z"
	)
	public static boolean uk(uf var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= var0.av_fld && var1 < var0.ah_fld + var0.av_fld && var2 >= var0.ae_fld && var2 < var0.ae_fld + var0.aw_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bp() {
		return this.ae_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int al() {
		return this.ae_fld + this.aw_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void am(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = 571332909 * var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void aq(int var1, int var2) {
		this.ah_fld = var1 * -1585468391;
		this.aw_fld = var2 * -1694273172;
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;I)Z"
	)
	public static boolean py(uf var0, uf var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.av_fld <= var1.af() && var1.as() <= var0.af() && var0.ae_fld <= var1.al() && var1.ar() <= var0.al();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ax(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ad(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = 1705782511 * var2;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;Luf;)V"
	)
	public static void oi(uf var0, uf var1, uf var2) {
		var2.av_fld = 1 * var0.av_fld;
		var2.ah_fld = var0.ah_fld * -1460419515;
		if (var0.av_fld < var1.av_fld) {
			var2.ah_fld = var2.ah_fld - (var1.av_fld - var0.av_fld);
			var2.av_fld = var1.av_fld * 2145230791;
		}

		if (var2.af() > var1.af()) {
			var2.ah_fld = var2.ah_fld - (var2.af() - var1.af()) * -44126579;
		}

		if (var2.ah_fld * -2119330706 < 0) {
			var2.ah_fld = 0;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ai(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ao(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void aa(int var1, int var2) {
		this.ah_fld = var1 * 927078955;
		this.aw_fld = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void an(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2 * 1102569018;
	}

	public uf(int var1, int var2, int var3, int var4) {
		this.ag(var1, var2);
		this.az(var3, var4);
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
		return this.av_fld <= var1.af() && var1.as() <= this.af() && this.ae_fld <= var1.al() && var1.ar() <= this.al();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luf;)Z"
	)
	public boolean aj(uf var1) {
		return this.av_fld <= var1.af() && var1.as() <= this.af() && this.ae_fld <= var1.al() && var1.ar() <= this.al();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luf;)Z"
	)
	public boolean at(uf var1) {
		return this.av_fld <= var1.af() && var1.as() <= this.af() && this.ae_fld <= var1.al() && var1.ar() <= this.al();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;I)V"
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void be(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	public void bs(uf var1, uf var2) {
		this.aw(var1, var2);
		this.ay(var1, var2);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Luf;Luf;)V"
	)
	void bk(uf var1, uf var2) {
		var2.av_fld = 1 * this.av_fld;
		var2.ah_fld = this.ah_fld * -1460419515;
		if (this.av_fld < var1.av_fld) {
			var2.ah_fld = var2.ah_fld - (var1.av_fld - this.av_fld);
			var2.av_fld = var1.av_fld * 2145230791;
		}

		if (var2.af() > var1.af()) {
			var2.ah_fld = var2.ah_fld - (var2.af() - var1.af()) * -562777504;
		}

		if (var2.ah_fld < 0) {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ab(int var1, int var2) {
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

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Laax;Laax;)I"
	)
	public static int fv(aax var0, aax var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (null == var0.ak_fld) {
			return null == var1.ak_fld ? 0 : 1;
		} else {
			return var1.ak_fld == null ? -1 : var0.ak_fld.compareTo(var1.ak_fld);
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bn() {
		return this.ae_fld + this.aw_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Luf;I)Z"
	)
	public boolean ae(uf var1, int var2) {
		return this.ae_fld <= var1.as() && var1.as() <= this.af() && this.ae_fld <= var1.al() && var1.ar() <= this.ar();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean av(int var1, int var2, int var3) {
		return var1 >= this.av_fld && var1 < this.aw_fld + this.ah_fld && var2 >= this.ae_fld && var2 < this.ae_fld + this.ah_fld;
	}
}
