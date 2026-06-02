import net.runelite.api.ScriptEventBuilder;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.Widget;

@ObfuscatedName("yb")
@Implements({"ScriptEventBuilder"})
public class yb implements ScriptEventBuilder {
	@ObfuscatedGetter(
		intValue = 875093587
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	Object[] ag_fld;
	@ObfuscatedGetter(
		intValue = -1098344837
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 808084993
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ay_fld;
	@ObfuscatedGetter(
		intValue = 1811268377
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = 1096850189
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu az_fld;
	@ObfuscatedGetter(
		intValue = 1753093045
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld = false;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String af_fld;
	@ObfuscatedGetter(
		intValue = -1406688725
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedGetter(
		intValue = 1083501305
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bw(int var1) {
		this.ar_fld = var1;
		return this;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lyb;"
	)
	public yb az(boolean var1, byte var2) {
		this.ak_fld = var1;
		return this;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)Lyb;"
	)
	public yb av(Object[] var1, int var2) {
		this.ag_fld = (Object[])var1;
		return this;
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)Lyb;"
	)
	public yb wk(Object[] var1) {
		this.ag_fld = (Object[])var1;
		return this;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb ay(int var1, int var2) {
		this.ae_fld = var1;
		return this;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Lyb;Ljava/lang/String;I)Lyb;"
	)
	public static yb jo(yb var0, String var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.af_fld = var1;
			return var0;
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu getSource() {
		return this.ay_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)Lyb;"
	)
	public yb setArguments(Object[] var1) {
		this.ag_fld = (Object[])var1;
		return this;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb au(int var1, int var2) {
		this.ah_fld = var1;
		return this;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb ae(int var1, int var2) {
		this.aw_fld = var1;
		return this;
	}

	yb() {
		this.ag_fld = null;
		this.ay_fld = null;
		this.av_fld = 0;
		this.ae_fld = 0;
		this.ah_fld = 0;
		this.aw_fld = 0;
		this.az_fld = null;
		this.as_fld = 0;
		this.ar_fld = 0;
		this.af_fld = null;
		this.al_fld = 0;
		this.au_fld = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb ah(int var1, int var2) {
		this.ar_fld = var1;
		return this;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lyb;"
	)
	public yb bp(String var1) {
		this.af_fld = var1;
		return this;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Z)Lyb;"
	)
	public yb at(boolean var1) {
		this.ak_fld = var1;
		return this;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	static yb aa(lu var0) {
		yb var1 = new yb();
		var1.ay_fld = var0;
		return var1;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/widgets/Widget;)Lyb;"
	)
	public yb setSource(Widget var1) {
		this.ay_fld = (lu)var1;
		return this;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	static yb ap(int var0) {
		yb var1 = new yb();
		var1.au_fld = var0;
		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	static yb am(int var0) {
		yb var1 = new yb();
		var1.au_fld = var0;
		return var1;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/widgets/Widget;)Lyb;"
	)
	public yb setTarget(Widget var1) {
		this.az_fld = (lu)var1;
		return this;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	static yb ad(int var0) {
		yb var1 = new yb();
		var1.au_fld = var0;
		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	static yb ab(int var0) {
		yb var1 = new yb();
		var1.au_fld = var0;
		return var1;
	}

	@ObfuscatedName("getArguments")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Override
	public Object[] getArguments() {
		return (Object[])this.ag_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	static yb an(lu var0) {
		yb var1 = new yb();
		var1.ay_fld = var0;
		return var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bh(int var1) {
		this.ah_fld = var1;
		return this;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Lyz;"
	)
	public yz cd() {
		return new yz(this);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bj(int var1) {
		this.aw_fld = var1;
		return this;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	static yb aq(int var0) {
		yb var1 = new yb();
		var1.au_fld = var0;
		return var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bz(int var1) {
		this.av_fld = var1;
		return this;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb be(int var1) {
		this.ae_fld = var1;
		return this;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bs(int var1) {
		this.ae_fld = var1 * 962472488;
		return this;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb bl(yb var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.as_fld = var1;
			return var0;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb ba(int var1) {
		this.ar_fld = var1;
		return this;
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "()Lyz;"
	)
	public yz build() {
		return new yz(this);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bk(int var1) {
		this.ah_fld = var1;
		return this;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bq(int var1) {
		this.ar_fld = -177969435 * var1;
		return this;
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "(Lyb;Z)Lyb;"
	)
	public static yb ti(yb var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1;
		return var0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bf(int var1) {
		this.aw_fld = var1;
		return this;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb jc(yb var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.al_fld = var1;
			return var0;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb by(int var1) {
		this.aw_fld = -1535136176 * var1;
		return this;
	}

	@ObfuscatedName("getOp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOp() {
		return this.ah_fld;
	}

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu getTarget() {
		return this.az_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lyb;"
	)
	public yb bx(String var1) {
		this.af_fld = var1;
		return this;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lyb;"
	)
	public yb bo(String var1) {
		this.af_fld = var1;
		return this;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lyb;"
	)
	public yb bl(String var1) {
		this.af_fld = var1;
		return this;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	static yb ai(lu var0) {
		yb var1 = new yb();
		var1.ay_fld = var0;
		return var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bi(int var1) {
		this.as_fld = -650934038 * var1;
		return this;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bu(int var1) {
		this.as_fld = 732324736 * var1;
		return this;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lyb;Llu;B)Lyb;"
	)
	public static yb cc(yb var0, lu var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = var1;
		return var0;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bc(int var1) {
		this.ar_fld = var1;
		return this;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	public yb bv(lu var1) {
		this.az_fld = var1;
		return this;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	static yb ao(int var0) {
		yb var1 = new yb();
		var1.au_fld = var0 * -2049123316;
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lyz;"
	)
	public yz ax(int var1) {
		return new yz(this);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()Lyz;"
	)
	public yz bb() {
		return new yz(this);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb aw(int var1, int var2) {
		this.av_fld = var1;
		return this;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb setOp(int var1) {
		this.ah_fld = var1;
		return this;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Lyz;"
	)
	public yz cc() {
		return new yz(this);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(JII)J"
	)
	public static long ae(long var0, int var2, int var3) {
		long var5 = ub.ak(1 + (var3 - var2), -1793925999);
		var5 <<= var2;
		long var7;
		return var7 = var0 & ~var5;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lyb;"
	)
	public yb as(String var1, int var2) {
		this.af_fld = var1;
		return this;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)Lyb;"
	)
	public yb ar(lu var1, byte var2) {
		this.az_fld = var1;
		return this;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb af(int var1, int var2) {
		this.as_fld = -1688597373 * var1;
		return this;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)Lyb;"
	)
	public yb aj(Object[] var1) {
		this.ag_fld = (Object[])var1;
		return this;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb br(int var1) {
		this.as_fld = var1 * 410622465;
		return this;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb al(int var1, int var2) {
		this.as_fld = var1;
		return this;
	}
}
