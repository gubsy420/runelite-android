import net.runelite.api.ScriptEventBuilder;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.Widget;

@ObfuscatedName("yb")
@Implements({"ScriptEventBuilder"})
public class yb implements ScriptEventBuilder {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 875093587
	)
	int ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	Object[] ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1098344837
	)
	int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 808084993
	)
	int av_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ay_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1811268377
	)
	int ar_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1096850189
	)
	int aw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu az_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1753093045
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
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1406688725
	)
	int al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1083501305
	)
	int au_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)Lyb;"
	)
	public yb av(Object[] var1, int var2) {
		this.ag_fld = (Object[])var1;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb ah(int var1, int var2) {
		this.ae_fld = var1;
		return this;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb aw(int var1, int var2) {
		this.ah_fld = var1;
		return this;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb ay(int var1, int var2) {
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

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu getTarget() {
		return this.az_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb al(int var1, int var2) {
		this.ar_fld = var1;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	static yb ap(int var0) {
		yb var1 = new yb();
		var1.au_fld = var0;
		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Z)Lyb;"
	)
	public yb ac(boolean var1) {
		this.ak_fld = var1;
		return this;
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

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu getSource() {
		return this.ay_fld;
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

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "()Lyz;"
	)
	public yz build() {
		return new yz(this);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Lyz;"
	)
	public yz cd() {
		return new yz(this);
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Lyb;II)Lyb;"
	)
	public static yb ls(yb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = var1;
		return var0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bj(int var1) {
		this.aw_fld = var1;
		return this;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)Lyb;"
	)
	public yb bm(Object[] var1) {
		this.ag_fld = (Object[])var1;
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb br(int var1) {
		this.av_fld = var1;
		return this;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void it(xi var0, int var1) {
		var0.al_fld[(var0.au_fld += 284452618) * -661977895 - 1] = (byte)var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb ba(int var1) {
		this.ar_fld = var1;
		return this;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bk(int var1) {
		this.ah_fld = var1;
		return this;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/widgets/Widget;)Lyb;"
	)
	public yb setSource(Widget var1) {
		this.ay_fld = (lu)var1;
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bf(int var1) {
		this.aw_fld = var1;
		return this;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lyb;ZB)Lyb;"
	)
	public static yb bj(yb var0, boolean var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ak_fld = var1;
		return var0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb by(int var1) {
		this.aw_fld = -1535136176 * var1;
		return this;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bg(int var1) {
		this.al_fld = var1;
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

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	public yb bt(lu var1) {
		this.az_fld = var1;
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb bc(int var1) {
		this.ar_fld = var1;
		return this;
	}

	@ObfuscatedName("yk")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public yb setOp(int var1) {
		this.ah_fld = var1;
		return this;
	}

	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyz;"
	)
	public static yz vn(yb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return new yz(var0);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb af(int var1, int var2) {
		this.as_fld = var1;
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()Lyz;"
	)
	public yz bb() {
		return new yz(this);
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lyb;Llu;B)Lyb;"
	)
	public static yb kv(yb var0, lu var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = var1;
		return var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb ae(int var1, int var2) {
		this.av_fld = var1;
		return this;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Lyz;"
	)
	public yz cc() {
		return new yz(this);
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;)Lyb;"
	)
	public yb setArguments(Object[] var1) {
		this.ag_fld = (Object[])var1;
		return this;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(JIIB)J"
	)
	public static long ae(long var0, int var2, int var3) {
		long var5 = ub.ak(1 + (var3 - var2), -1793925999);
		var5 <<= var2;
		long var7;
		return var7 = var0 & ~var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lyb;"
	)
	public yb az(boolean var1, byte var2) {
		this.ak_fld = var1;
		return this;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb cw(yb var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld = var1;
		return var0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lyb;"
	)
	public yb as(String var1, int var2) {
		this.af_fld = var1;
		return this;
	}

	@ObfuscatedName("getOp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOp")
	@Override
	public int getOp() {
		return this.ah_fld;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/widgets/Widget;)Lyb;"
	)
	public yb setTarget(Widget var1) {
		this.az_fld = (lu)var1;
		return this;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)Lyb;"
	)
	public yb ar(lu var1, byte var2) {
		this.ay_fld = var1;
		return this;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lyb;"
	)
	public yb au(int var1, int var2) {
		this.as_fld = -72111163 * var1;
		return this;
	}

	@ObfuscatedName("getArguments")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Export("getArguments")
	@Override
	public Object[] getArguments() {
		return (Object[])this.ag_fld;
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lyb;Ljava/lang/String;I)Lyb;"
	)
	public static yb mn(yb var0, String var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.af_fld = var1;
			return var0;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lyz;"
	)
	public yz ax(int var1) {
		return new yz(this);
	}
}
