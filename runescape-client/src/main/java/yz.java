import java.awt.event.WindowEvent;
import net.runelite.api.ScriptEvent;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yz")
@Implements({"ScriptEvent"})
public class yz extends vw implements ScriptEvent {
	@ObfuscatedGetter(
		intValue = -1842485713
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
		intValue = 2015393673
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 1596122377
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedGetter(
		intValue = -587577453
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedGetter(
		intValue = 1811208177
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedGetter(
		intValue = -196917065
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ay_fld;
	@ObfuscatedGetter(
		intValue = 122425255
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
	@ObfuscatedGetter(
		intValue = -1842485713
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bn() {
		return this.af_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bs() {
		return this.as_fld;
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/WindowEvent;)V"
	)
	public static void ou(tf var0, WindowEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ah(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ay(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("getTypedKeyCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTypedKeyCode() {
		return this.as_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cd() {
		return this.ak_fld;
	}

	@ObfuscatedName("getTypedKeyChar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTypedKeyChar() {
		return this.ar_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ar(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int af(int var1) {
		return this.ar_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int al(byte var1) {
		return this.aw_fld;
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	public static yb aa(lu var0) {
		return ln.ak(var0);
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int br() {
		return this.ar_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public static yb ao(int var0) {
		return gs.ag(var0);
	}

	@ObfuscatedName("run")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void run() {
		try {
			client.to(this);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu at() {
		return this.az_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bg() {
		return this.ak_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bk() {
		return this.au_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ac() {
		return this.av_fld;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aj() {
		return this.av_fld;
	}

	@ObfuscatedName("getMouseY")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMouseY() {
		return this.ae_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bx() {
		return this.ae_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bm() {
		return this.ae_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return this.ae_fld;
	}

	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "(Lyz;S)I"
	)
	public static int ri(yz var0, short var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.al_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bd() {
		return this.ae_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lyb;"
	)
	public static yb ai(lu var0) {
		return ln.ak(var0);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bz() {
		return this.as_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bl() {
		return this.ah_fld;
	}

	@ObfuscatedName("getOp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getOp() {
		return this.ah_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bf() {
		return this.ay_fld;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lyz;I)[Ljava/lang/Object;"
	)
	public static Object[] hw(yz var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return (Object[])var0.ag_fld;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu by() {
		return this.ay_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String bu() {
		return this.af_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)Llu;"
	)
	public lu av(short var1) {
		return this.az_fld;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu getSource() {
		return this.az_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bo() {
		return this.ar_fld;
	}

	@ObfuscatedName("getOpbase")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getOpbase() {
		return this.af_fld;
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu getTarget() {
		return this.ay_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bh() {
		return this.aw_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bq() {
		return this.ak_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bw() {
		return this.au_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ba() {
		return this.ah_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ae(int var1) {
		return this.au_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bj() {
		return this.al_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bc() {
		return this.al_fld;
	}

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "(Lyz;I)Llu;"
	)
	public static lu wa_lu(yz var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ay_fld;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int be() {
		return this.al_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lyb;"
	)
	public static yb ad(int var0) {
		return gs.ag(var0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	public Object[] ab() {
		return (Object[])this.ag_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;"
	)
	public Object[] az(int var1) {
		return (Object[])this.ag_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aw(int var1) {
		return this.aw_fld;
	}

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "(Lyz;I)I"
	)
	public static int wa(yz var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ae_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
		return this.au_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu as(int var1) {
		return this.ay_fld;
	}

	@ObfuscatedName("getArguments")
	@ObfuscatedSignature(
		descriptor = "()[Ljava/lang/Object;"
	)
	@Override
	public Object[] getArguments() {
		return (Object[])this.ag_fld;
	}

	@ObfuscatedName("getMouseX")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMouseX() {
		return this.av_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	public int ax(short var1) {
		return this.al_fld;
	}
}
