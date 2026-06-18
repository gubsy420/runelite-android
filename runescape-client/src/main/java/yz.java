import net.runelite.api.ScriptEvent;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yz")
@Implements({"ScriptEvent"})
public class yz extends vw implements ScriptEvent {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1842485713
	)
	int ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	Object[] ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2015393673
	)
	int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1596122377
	)
	int aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -587577453
	)
	int ae_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1811208177
	)
	int ar_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -196917065
	)
	int al_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 122425255
	)
	int as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String af_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu az_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -520194263
	)
	int au_fld;

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bu() {
		return this.af_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;"
	)
	public Object[] az(int var1) {
		return (Object[])this.ag_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bi() {
		return this.af_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bx() {
		return this.as_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ah(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aw(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cd() {
		return this.ak_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ar(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int al(byte var1) {
		return this.aw_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bh() {
		return this.ah_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	public static yb aa(lu var0) {
		return ln.ak(var0);
	}

	@ObfuscatedName("getOpbase")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getOpbase")
	@Override
	public String getOpbase() {
		return this.af_fld;
	}

	yz(yb var1) {
		this.ak_fld = var1.ak_fld;
		this.ag_fld = (Object[])var1.ag_fld;
		this.az_fld = var1.ay_fld;
		this.av_fld = -1764825927 * var1.av_fld;
		this.ae_fld = var1.ae_fld * 1831171705;
		this.ah_fld = var1.ah_fld * 1293886749;
		this.aw_fld = var1.aw_fld * -625710363;
		this.ay_fld = var1.az_fld;
		this.as_fld = var1.as_fld * 70356291;
		this.ar_fld = var1.ar_fld * -262961751;
		this.af_fld = var1.af_fld;
		this.al_fld = var1.al_fld * 321713709;
		this.au_fld = var1.au_fld * -1691263151;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	public static yb aq(lu var0) {
		return ln.ak(var0);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public static yb am(int var0) {
		return gs.ag(var0);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bo() {
		return this.ar_fld;
	}

	@ObfuscatedName("xl")
	@ObfuscatedSignature(
		descriptor = "(Lyz;I)I"
	)
	public static int xl(yz var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ah_fld;
		}
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public static yb ao(int var0) {
		return gs.ag(var0);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu as(int var1) {
		return this.ay_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public Object[] ap() {
		return (Object[])this.ag_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu at() {
		return this.az_fld;
	}

	@ObfuscatedName("getTypedKeyCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTypedKeyCode")
	@Override
	public int getTypedKeyCode() {
		return this.as_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bm() {
		return this.av_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bd() {
		return this.av_fld;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lyz;I)I"
	)
	public static int lb(yz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.au_fld;
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(Lyz;I)I"
	)
	public static int qi(yz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ar_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bz() {
		return this.ae_fld;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int br() {
		return this.ae_fld;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int be() {
		return this.ae_fld;
	}

	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "(Lyz;B)Z"
	)
	public static boolean sx(yz var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak_fld;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bs() {
		return this.ae_fld;
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	public static yb ai(lu var0) {
		return ln.ak(var0);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bl() {
		return this.as_fld;
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(Lyz;I)Ljava/lang/String;"
	)
	public static String qf(yz var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.af_fld;
		}
	}

	@ObfuscatedName("getMouseY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getMouseY")
	@Override
	public int getMouseY() {
		return this.ae_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bf() {
		return this.ay_fld;
	}

	@ObfuscatedName("getTypedKeyChar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTypedKeyChar")
	@Override
	public int getTypedKeyChar() {
		return this.ar_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu by() {
		return this.ay_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	public int ax(short var1) {
		return this.al_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bn() {
		return this.af_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)Llu;"
	)
	public lu av(short var1) {
		return this.az_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
		return this.ar_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bq() {
		return this.ak_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bc() {
		return this.al_fld;
	}

	@ObfuscatedName("getMouseX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getMouseX")
	@Override
	public int getMouseX() {
		return this.av_fld;
	}

	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "(Lpd;)I"
	)
	public static int wr(pd var0) {
		return var0.av_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bw() {
		return this.al_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ba() {
		return this.al_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public static yb ad(int var0) {
		return gs.ag(var0);
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu getSource() {
		return this.az_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bv() {
		return this.af_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public Object[] ab() {
		return (Object[])this.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ay(int var1) {
		return this.al_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu getTarget() {
		return this.ay_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int af(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("run")
	@Override
	public void run() {
		try {
			client.wk(this);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String au(int var1) {
		return this.af_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean an(byte var1) {
		return this.ak_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aj() {
		return this.ae_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae(int var1) {
		return this.au_fld;
	}
}
