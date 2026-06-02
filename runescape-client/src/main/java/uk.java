import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("uk")
public class uk {
	@ObfuscatedGetter(
		intValue = -644733619
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ae_fld;
	@ObfuscatedGetter(
		intValue = -475758883
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu ak_fld = null;
	@ObfuscatedGetter(
		intValue = -1758852969
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean af_fld;
	@ObfuscatedGetter(
		intValue = 1130404125
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int as_fld;
	@ObfuscatedGetter(
		intValue = -209707919
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	lu aw_fld;
	@ObfuscatedGetter(
		intValue = 44361251
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = -1926925911
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	static yc[] mj_fld;

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bg() {
		return this.aw_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int an() {
		return this.au_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Z"
	)
	public boolean ae(lu var1, int var2, int var3) {
		if (this.ak_fld == var1) {
			this.ae_fld = true;
			this.al_fld = var2;
			this.au_fld = var3;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Llu;"
	)
	public static lu dz(uk var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;II)V"
	)
	void ak(lu var1, lu var2, int var3, int var4) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ah_fld = 0;
		this.ay_fld = false;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ci() {
		this.ay_fld = true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ay() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cg() {
		return this.ar_fld;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bq() {
		return this.aw_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int al() {
		return this.az_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int au() {
		return this.av_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ax() {
		return this.al_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;II)V"
	)
	void at(lu var1, lu var2, int var3, int var4) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = 2093588229 * var3;
		this.av_fld = var4 * 724622092;
		this.ah_fld = 0;
		this.ay_fld = false;
	}

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "(Luk;Llu;II)Z"
	)
	public static boolean vc(uk var0, lu var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 == var0.ag_fld) {
			var0.af_fld = true;
			var0.as_fld = var2;
			var0.ar_fld = var3;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aw() {
		this.ah_fld++;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void am() {
		if (this.ah_fld == 0) {
			this.ag();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		this.ak_fld = null;
		this.ag_fld = null;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dq() {
		return this.ae_fld;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dm() {
		return this.af_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ao() {
		return this.af_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ad() {
		this.ay_fld = true;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bm() {
		this.ak_fld = null;
		this.ag_fld = null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bd() {
		this.ak_fld = null;
		this.ag_fld = null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void bf(lu var1) {
		this.aw_fld = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Z"
	)
	public boolean br(lu var1, int var2, int var3) {
		if (this.ak_fld == var1) {
			this.ae_fld = true;
			this.al_fld = var2;
			this.au_fld = var3;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Z"
	)
	public boolean be(lu var1, int var2, int var3) {
		if (this.ak_fld == var1) {
			this.ae_fld = true;
			this.al_fld = var2;
			this.au_fld = var3;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ca() {
		return this.ar_fld;
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)I"
	)
	public static int kq(uk var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ar_fld;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void bj(lu var1) {
		this.aw_fld = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aq() {
		return this.ah_fld;
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Llu;"
	)
	public static lu ez(uk var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void az() {
		this.aw_fld = null;
		this.af_fld = false;
		this.as_fld = -361558325;
		this.ar_fld = -259007633;
		this.ae_fld = false;
		this.al_fld = -1795815207;
		this.au_fld = 1464483175;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cj() {
		return null != this.ak_fld;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ck() {
		if (this.ah_fld * 1337669217 == 0) {
			this.ag();
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bt() {
		return this.ak_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bv() {
		return this.ak_fld;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bu() {
		return this.ag_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu bw() {
		return this.ag_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu ba() {
		return this.aw_fld;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cs() {
		return this.au_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void by() {
		this.ah_fld += 1368364361;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cd() {
		return this.av_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cc() {
		return this.av_fld;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cv() {
		return this.av_fld;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cy() {
		return this.av_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cf() {
		return this.al_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)Z"
	)
	public boolean bh(lu var1, int var2, int var3) {
		if (var1 == this.ag_fld) {
			this.af_fld = true;
			this.as_fld = var2;
			this.ar_fld = var3;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cn() {
		return this.as_fld;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ce() {
		return this.as_fld;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bz() {
		this.aw_fld = null;
		this.af_fld = false;
		this.as_fld = -361558325;
		this.ar_fld = -259007633;
		this.ae_fld = false;
		this.al_fld = 1283187016;
		this.au_fld = 1464483175;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cr() {
		return this.as_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	public void ah(lu var1) {
		this.aw_fld = var1;
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)I"
	)
	public static int yq(uk var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.as_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ab() {
		return this.ae_fld;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cw() {
		return this.ah_fld;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cm() {
		return this.ah_fld;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cz() {
		return this.ah_fld;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cu() {
		this.ay_fld = true;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void co() {
		if (this.ah_fld * -272955476 == 0) {
			this.ag();
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bl() {
		return null != this.ak_fld;
	}

	uk() {
		this.ag_fld = null;
		this.az_fld = 0;
		this.av_fld = 0;
		this.ay_fld = false;
		this.aw_fld = null;
		this.af_fld = false;
		this.as_fld = -361558325;
		this.ar_fld = -259007633;
		this.ae_fld = false;
		this.al_fld = -1795815207;
		this.au_fld = 1464483175;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dh() {
		return this.ay_fld;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ch() {
		return this.ay_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ap() {
		return this.ay_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bo() {
		return this.ae_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Llu;"
	)
	public lu as() {
		return this.ak_fld;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean dv() {
		return this.af_fld;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cl() {
		return this.ay_fld;
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(Lql;)[Ljava/security/cert/Certificate;"
	)
	public static Certificate[] pw(ql var0) throws SSLPeerUnverifiedException {
		return var0.this$1.ak_fld;
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(Luk;Llu;II)Z"
	)
	public static boolean qc(uk var0, lu var1, int var2, int var3) {
		if (var1 == var0.ag_fld) {
			var0.af_fld = true;
			var0.as_fld = var2;
			var0.ar_fld = var3;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llu;III)Z"
	)
	public boolean av(lu var1, int var2, int var3, int var4) {
		if (var1 == this.ak_fld) {
			this.af_fld = true;
			this.ar_fld = var2 * 361558325;
			this.as_fld = 259007633 * var3;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Llu;"
	)
	public lu af(short var1) {
		return this.ag_fld;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aa(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ai(int var1) {
		return this.ar_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;S)Llu;"
	)
	public static lu am(uk var0, short var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aw_fld;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cb() {
		this.al_fld = this.au_fld + -239812115;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;"
	)
	public lu ar(int var1) {
		return this.ag_fld;
	}
}
