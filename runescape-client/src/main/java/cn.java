import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.Preferences;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.VolumeChanged;
import net.runelite.api.events.VolumeChanged.Type;

@ObfuscatedName("cn")
@Implements({"Preferences"})
public class cn implements Preferences {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1975834693
	)
	int an_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1409945751
	)
	int ai_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map ae_fld = new LinkedHashMap();
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aw_fld = false;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean as_fld = false;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1246914735
	)
	int ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double af_fld = 0.8;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -714800751
	)
	int al_fld = 1412552975;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1522723071
	)
	int au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 548012203
	)
	int ax_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1539521221
	)
	int am_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String aa_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ay_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -879403025
	)
	int aq_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bs_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ad_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public static boolean az(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	void az(boolean var1, byte var2) {
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void ec(String var1, int var2) {
		int var3 = this.bh(var1, -1677044713);
		if (this.ae_fld.size() >= 10 && !this.ae_fld.containsKey(var3)) {
			Iterator var4 = this.ae_fld.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.ae_fld.put(var3, var2);
		og.ag();
	}

	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void wl(int var1) {
		og.ci_fld.getCallbacks().post(new VolumeChanged(Type.MUSIC));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean ae(byte var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("setAreaSoundEffectVolume")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setAreaSoundEffectVolume")
	@Override
	public void setAreaSoundEffectVolume(int var1) {
		this.ax_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	void ah(boolean var1, byte var2) {
		this.ah_fld = var1;
		og.ag();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bl(int var1) {
		return this.aw_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ao() {
		return this.as_fld;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float ea() {
		return this.am_fld / 100.0F;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) {
		boolean var10001;
		if (!this.as_fld) {
			if (var1 != 239763703) {
				return;
			}

			var10001 = true;
		} else {
			var10001 = false;
		}

		this.au(var10001, -137443408);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void ac(String var1, int var2) {
		this.aa_fld = var1;
		og.ag();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void an(int var1, byte var2) {
		this.ar_fld = var1;
		og.ag();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int aj(byte var1) {
		return this.ar_fld;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ck() {
		this.au(!this.as_fld, 818528863);
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dz(int var1) {
		this.ar_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	void ai(double var1) {
		this.af_fld = var1;
		og.ag();
	}

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int rx() {
		return this.ar_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aq(int var1) {
		return this.al_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void am(int var1, int var2) {
		this.al_fld = var1;
		this.wl(-1);
		og.ag();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	int ad(short var1) {
		return this.au_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ao(int var1, int var2) {
		this.au_fld = var1;
		this.yf(-1);
		og.ag();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ab(int var1) {
		return this.ax_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ap(int var1, int var2) {
		this.ax_fld = var1;
		this.qu(-1);
		og.ag();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void bz(int var1, byte var2) {
		this.ai_fld = var1;
		og.ag();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cj() {
		return this.as_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int bj(byte var1) {
		return this.an_fld;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	static void di(int var0, int var1, int var2, int var3, int var4) throws EOFException {
		try {
			od.dn(hk.mt_fld, var0, var1, var2, var3, var4);
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dk() {
		return this.au_fld;
	}

	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	public xi ue() {
		return sd(this, (byte)-69);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V"
	)
	void br(String var1, int var2, int var3) {
		int var4 = this.bh(var1, -1935000952);
		if (this.ae_fld.size() >= 10 && !this.ae_fld.containsKey(var4)) {
			Iterator var5 = this.ae_fld.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.ae_fld.put(var4, var2);
		og.ag();
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void da(int var1) {
		this.al_fld = var1 * 806881480;
		og.ag();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	static cn bi() {
		zb var0 = null;
		cn var1 = new cn();

		try {
			var0 = cw.av("", es.gp_fld.aw_fld, false);
			byte[] var2 = new byte[(int)var0.ah()];
			int var3 = 0;

			while (var3 < var2.length) {
				int var4 = zb.oe(var0, var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}

				var3 += var4;
			}

			var1 = new cn(new xi(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.av();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bk(int var1, int var2) {
		this.aq_fld = var1;
		of.ai();
		og.ag();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[IIB)V"
	)
	static void ak(int var0, int[] var1, int var2, byte var3) throws EOFException {
		try {
			for (int var4 = 0; var4 < fi.am_fld; var4++) {
				ox var5 = qc.ak(var4);
				if (null != var5 && !var5.bz_fld) {
					if (var3 == -1) {
						return;
					}

					if (var5.av(var2, var0)) {
						var1[on.ag(var2)] = var4 + 256;
						break;
					}
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean aw(int var1) {
		return this.ad_fld;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	void bx(boolean var1, byte var2) {
		this.ad_fld = var1;
		og.ag();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	static cn bo() {
		zb var0 = null;
		cn var1 = new cn();

		try {
			var0 = cw.av("", es.gp_fld.aw_fld, false);
			byte[] var2 = new byte[(int)var0.ah()];
			int var3 = 0;

			while (var3 < var2.length) {
				int var4 = zb.oe(var0, var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}

				var3 += var4;
			}

			var1 = new cn(new xi(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.av();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	static cn bp() {
		zb var0 = null;
		cn var1 = new cn();

		try {
			var0 = cw.av("", es.gp_fld.aw_fld, false);
			byte[] var2 = new byte[(int)var0.ah()];
			int var3 = 0;

			while (var3 < var2.length) {
				int var4 = zb.oe(var0, var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}

				var3 += var4;
			}

			var1 = new cn(new xi(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.av();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	static cn bt() {
		zb var0 = null;
		cn var1 = new cn();

		try {
			var0 = cw.av("", es.gp_fld.aw_fld, false);
			byte[] var2 = new byte[(int)var0.ah()];
			int var3 = 0;

			while (var3 < var2.length) {
				int var4 = zb.oe(var0, var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}

				var3 += var4;
			}

			var1 = new cn(new xi(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.av();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dd(int var1) {
		this.al_fld = var1;
		og.ag();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bu() {
		zb var0 = null;

		try {
			var0 = cw.av("", es.gp_fld.aw_fld, true);
			xi var1 = sd(cx.kq_fld, (byte)42);
			var0.az(var1.al_fld, 0, -1194856520 * var1.au_fld);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.ae(true);
			}
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void bn(boolean var1) {
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void bc(boolean var1) {
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void bw(boolean var1) {
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)F"
	)
	public static float uk(cn var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.am_fld / 100.0F;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	xi ba() {
		xi var1 = new xi(419, true);
		var1.ea(12);
		var1.ea(this.ah_fld ? 1 : 0);
		var1.ea(this.ay_fld ? 1 : 0);
		var1.ea(this.ai_fld);
		var1.ea(this.ae_fld.size());
		Iterator var2 = this.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.eb((Integer)var3.getKey());
			var1.eb((Integer)var3.getValue());
		}

		xi.ph(var1, this.aa_fld != null ? this.aa_fld : "", 1821907130);
		var1.cd(this.aw_fld);
		var1.ea((int)(100.0 * this.af_fld));
		var1.ea(this.al_fld);
		var1.ea(this.au_fld);
		var1.ea(this.ax_fld);
		var1.ea(this.an_fld);
		var1.ea(this.as_fld ? 1 : 0);
		var1.eb(this.ar_fld);
		var1.ea(this.aq_fld);
		var1.ea(this.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dj(int var1) {
		this.an_fld = var1;
		og.ag();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	xi bb() {
		xi var1 = new xi(419, true);
		var1.ea(12);
		var1.ea(this.ah_fld ? 1 : 0);
		var1.ea(this.ay_fld ? 1 : 0);
		var1.ea(this.ai_fld);
		var1.ea(this.ae_fld.size());
		Iterator var2 = this.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.eb((Integer)var3.getKey());
			var1.eb((Integer)var3.getValue());
		}

		xi.ph(var1, this.aa_fld != null ? this.aa_fld : "", 1838097939);
		var1.cd(this.aw_fld);
		var1.ea((int)(100.0 * this.af_fld));
		var1.ea(this.al_fld);
		var1.ea(this.au_fld);
		var1.ea(this.ax_fld);
		var1.ea(this.an_fld);
		var1.ea(this.as_fld ? 1 : 0);
		var1.eb(this.ar_fld);
		var1.ea(this.aq_fld);
		var1.ea(this.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	xi cd() {
		xi var1 = new xi(419, true);
		var1.ea(12);
		var1.ea(this.ah_fld ? 1 : 0);
		var1.ea(this.ay_fld ? 1 : 0);
		var1.ea(this.ai_fld);
		var1.ea(this.ae_fld.size());
		Iterator var2 = this.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.eb((Integer)var3.getKey());
			var1.eb((Integer)var3.getValue());
		}

		xi.ph(var1, this.aa_fld != null ? this.aa_fld : "", -871501929);
		var1.cd(this.aw_fld);
		var1.ea((int)(100.0 * this.af_fld));
		var1.ea(this.al_fld);
		var1.ea(this.au_fld);
		var1.ea(this.ax_fld);
		var1.ea(this.an_fld);
		var1.ea(this.as_fld ? 1 : 0);
		var1.eb(this.ar_fld);
		var1.ea(this.aq_fld);
		var1.ea(this.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cy() {
		return this.ah_fld;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cf() {
		return this.ah_fld;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void cx(boolean var1) {
		this.ah_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	void ay(boolean var1, byte var2) {
		this.aw_fld = var1;
		og.ag();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void cp(boolean var1) {
		this.ah_fld = var1;
		og.ag();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z"
	)
	boolean be(String var1, int var2) {
		int var3 = this.bh(var1, -1938503540);
		return this.ae_fld.containsKey(var3);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cn() {
		return this.aw_fld;
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tq() {
		return this.an_fld;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cr() {
		return this.aw_fld;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void ca(boolean var1) {
		this.aw_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Lxi;"
	)
	public static xi ht(cn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		xi var1 = new xi(419, true);
		var1.ea(12);
		var1.ea(var0.ah_fld ? 1 : 0);
		var1.ea(var0.ay_fld ? 1 : 0);
		var1.ea(var0.ai_fld);
		var1.ea(var0.ae_fld.size());
		Iterator var2 = var0.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.eb((Integer)var3.getKey());
			var1.eb((Integer)var3.getValue());
		}

		xi.ph(var1, var0.aa_fld != null ? var0.aa_fld : "", -913709051);
		var1.cd(var0.aw_fld);
		var1.ea((int)(100.0 * var0.af_fld));
		var1.ea(var0.al_fld);
		var1.ea(var0.au_fld);
		var1.ea(var0.ax_fld);
		var1.ea(var0.an_fld);
		var1.ea(var0.as_fld ? 1 : 0);
		var1.eb(var0.ar_fld);
		var1.ea(var0.aq_fld);
		var1.ea(var0.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean al(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void ke(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aq_fld = var1;
		of.ai();
		og.ag();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cb() {
		this.au(!this.as_fld, 1286286953);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ax(byte var1) {
		return this.aq_fld;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(Lcn;ZB)V"
	)
	public static void eu(cn var0, boolean var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ay_fld = var1;
			og.ag();
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cu() {
		return this.as_fld;
	}

	cn() {
		this.wl(-1);
		this.au_fld = -505452415;
		this.yf(-1);
		this.ax_fld = 1592461181;
		this.qu(-1);
		this.an_fld = 407602547;
		this.aa_fld = null;
		this.ai_fld = 676696281;
		this.aq_fld = 982390903;
		this.am_fld = 1292653844;
		this.ad_fld = false;
		this.az(true, (byte)64);
		this.kh();
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void ct(boolean var1) {
		this.as_fld = var1;
		og.ag();
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(Lcn;B)Lxi;"
	)
	public static xi sd(cn var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			xi var2 = new xi(419, true);
			var2.ea(12);
			var2.ea(var0.ah_fld ? 1 : 0);
			var2.ea(var0.ay_fld ? 1 : 0);
			var2.ea(var0.ai_fld);
			var2.ea(var0.ae_fld.size());
			Iterator var3 = var0.ae_fld.entrySet().iterator();

			while (var3.hasNext()) {
				Entry var4 = (Entry)(Entry)var3.next();
				var2.eb((Integer)var4.getKey());
				var2.eb((Integer)var4.getValue());
			}

			xi.ph(var2, var0.aa_fld != null ? var0.aa_fld : "", 1851466251);
			var2.cd(var0.aw_fld);
			var2.ea((int)(100.0 * var0.af_fld));
			var2.ea(var0.al_fld);
			var2.ea(var0.au_fld);
			var2.ea(var0.ax_fld);
			var2.ea(var0.an_fld);
			var2.ea(var0.as_fld ? 1 : 0);
			var2.eb(var0.ar_fld);
			var2.ea(var0.aq_fld);
			var2.ea(var0.ad_fld ? 1 : 0);
			return var2;
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void kh() {
		this.ai_fld = 2;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int du() {
		return this.ax_fld;
	}

	@ObfuscatedName("setRememberedUsername")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Export("setRememberedUsername")
	@Override
	public void setRememberedUsername(String var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void dc(boolean var1) {
		this.as_fld = var1;
		og.ag();
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)I"
	)
	public static int fk(cn var0) {
		return var0.ai_fld;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dl(int var1) {
		this.al_fld = var1;
		og.ag();
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	int en(String var1) {
		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; var6++) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dt(int var1) {
		this.ar_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	void dm(double var1) {
		this.af_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ya")
	@ObfuscatedSignature(
		descriptor = "(Lcn;IS)V"
	)
	public static void ya(cn var0, int var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.an_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dv() {
		return this.ar_fld;
	}

	@ObfuscatedName("getHideUsername")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("getHideUsername")
	@Override
	public boolean getHideUsername() {
		return this.aw_fld;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dq() {
		return this.al_fld;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(Llp;IZ)V"
	)
	public static void nv(lp var0, int var1, boolean var2) throws EOFException {
		try {
			int var3 = var0.af_fld[on.ag(var1)];
			if (0 != var3) {
				var3 -= 256;

				ox var4;
				do {
					if (!var2) {
						if (--var3 < 0) {
							var3 = fi.am_fld - 1;
						}
					} else if (++var3 >= fi.am_fld) {
						var3 = 0;
					}

					var4 = qc.ak(var3);
				} while (null == var4 || var4.bz_fld || !var4.av(var1, var0.ax_fld));

				var0.af_fld[on.ag(var1)] = 256 + var3;
				lp.de(var0, (byte)114);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	cn(xi var1) {
		this.wl(-1);
		this.au_fld = -505452415;
		this.yf(-1);
		this.ax_fld = 1592461181;
		this.qu(-1);
		this.an_fld = 407602547;
		this.aa_fld = null;
		this.ai_fld = 676696281;
		this.aq_fld = 982390903;
		this.am_fld = 1292653844;
		this.ad_fld = false;
		if (var1 != null && var1.al_fld != null && var1.al_fld.length != 0) {
			int var2 = var1.cg();
			if (var2 >= 0 && var2 <= 12) {
				if (var1.cg() == 1) {
					this.ah_fld = true;
				}

				if (var2 > 1) {
					this.ay_fld = var1.cg() == 1;
				}

				if (var2 > 3) {
					this.ai_fld = var1.cg();
				}

				if (var2 > 2) {
					int var3 = var1.cg();

					for (int var4 = 0; var4 < var3; var4++) {
						int var5 = var1.co((byte)-100);
						int var6 = var1.co((byte)-7);
						this.ae_fld.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.aa_fld = var1.cl();
				}

				if (var2 > 5) {
					this.aw_fld = var1.cj();
				}

				if (var2 > 6) {
					this.af_fld = var1.cg() / 100.0;
					this.al_fld = var1.cg();
					this.wl(-1);
					this.au_fld = var1.cg();
					this.yf(-1);
					this.ax_fld = var1.cg();
					this.qu(-1);
				}

				if (var2 > 7) {
					this.an_fld = var1.cg();
				}

				if (var2 > 8) {
					this.as_fld = var1.cg() == 1;
				}

				if (var2 > 9) {
					this.ar_fld = var1.co((byte)-65);
				}

				if (var2 > 10) {
					this.aq_fld = var1.cg();
				}

				if (var2 > 11) {
					var1.cg();
					this.ad_fld = false;
				}
			} else {
				this.az(true, (byte)64);
			}
		} else {
			this.az(true, (byte)64);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	void au(boolean var1, int var2) {
		this.as_fld = var1;
		og.ag();
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void es(int var1) {
		this.an_fld = var1 * 1121642689;
		og.ag();
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dx() {
		return this.ax_fld;
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Ljava/lang/String;I)V"
	)
	public static void op(cn var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var0.bh(var1, -2134468946);
		if (var0.ae_fld.size() >= 10 && !var0.ae_fld.containsKey(var3)) {
			Iterator var4 = var0.ae_fld.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		var0.ae_fld.put(var3, var2);
		og.ag();
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ds() {
		return this.ax_fld;
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean oh() {
		return this.ah_fld;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ch() {
		return this.ai_fld;
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean tr() {
		return this.ay_fld;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)I"
	)
	public static int mt(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ai_fld;
	}

	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void wz(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	int ef(String var1) {
		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; var6++) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Lcn;II)V"
	)
	public static void fg(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.am_fld = var1;
		og.ag();
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void db(int var1) {
		this.ax_fld = var1 * 913794755;
		og.ag();
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dg(int var1) {
		this.ax_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String dw() {
		return this.aa_fld;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String di() {
		return this.aa_fld;
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String dn() {
		return this.aa_fld;
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Lxi;"
	)
	public static xi tr(cn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		xi var1 = new xi(419, true);
		var1.ea(12);
		var1.ea(var0.ah_fld ? 1 : 0);
		var1.ea(var0.ay_fld ? 1 : 0);
		var1.ea(var0.ai_fld);
		var1.ea(var0.ae_fld.size());
		Iterator var2 = var0.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.eb((Integer)var3.getKey());
			var1.eb((Integer)var3.getValue());
		}

		xi.ph(var1, var0.aa_fld != null ? var0.aa_fld : "", 1294784421);
		var1.cd(var0.aw_fld);
		var1.ea((int)(100.0 * var0.af_fld));
		var1.ea(var0.al_fld);
		var1.ea(var0.au_fld);
		var1.ea(var0.ax_fld);
		var1.ea(var0.an_fld);
		var1.ea(var0.as_fld ? 1 : 0);
		var1.eb(var0.ar_fld);
		var1.ea(var0.aq_fld);
		var1.ea(var0.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("xx")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)Ljava/lang/String;"
	)
	public static String xx(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aa_fld;
	}

	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void qu(int var1) {
		og.ci_fld.getCallbacks().post(new VolumeChanged(Type.AREA));
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String df() {
		return this.aa_fld;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dp() {
		return this.an_fld;
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	int eg(String var1) {
		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; var6++) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ep(int var1) {
		this.an_fld = var1;
		og.ag();
	}

	@ObfuscatedName("zw")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void zw(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.al_fld = var1 * 1991339516;
		og.ag();
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int eb() {
		return this.ai_fld;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ew(int var1) {
		this.ai_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ex(int var1) {
		this.ai_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void ez(String var1, int var2) {
		int var3 = this.bh(var1, -1737358803);
		if (this.ae_fld.size() >= 10 && !this.ae_fld.containsKey(var3)) {
			Iterator var4 = this.ae_fld.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.ae_fld.put(var3, var2);
		og.ag();
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	boolean er(String var1) {
		int var2 = this.bh(var1, -1684341546);
		return this.ae_fld.containsKey(var2);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	int bh(String var1, int var2) {
		String var4 = var1.toLowerCase();
		int var5 = var4.length();
		int var6 = 0;

		for (int var7 = 0; var7 < var5; var7++) {
			var6 = (var6 << 5) - var6 + var4.charAt(var7);
		}

		return var6;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int do_() {
		return this.al_fld;
	}

	@ObfuscatedName("setSoundEffectVolume")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setSoundEffectVolume")
	@Override
	public void setSoundEffectVolume(int var1) {
		this.au_fld = var1;
	}

	@ObfuscatedName("zp")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)D"
	)
	public static double zp(cn var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.af_fld;
		}
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ek() {
		return this.aq_fld;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float ey() {
		return this.am_fld / 100.0F;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	static cn bv() {
		zb var0 = null;
		cn var1 = new cn();

		try {
			var0 = cw.av("", es.gp_fld.aw_fld, false);
			byte[] var2 = new byte[(int)var0.ah()];
			int var3 = 0;

			while (var3 < var2.length) {
				int var4 = zb.oe(var0, var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}

				var3 += var4;
			}

			var1 = new cn(new xi(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.av();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void el(int var1) {
		this.am_fld = var1 * 2117055099;
		og.ag();
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lcn;S)Z"
	)
	public static boolean mv(cn var0, short var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ay_fld;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void eu(int var1) {
		this.am_fld = var1 * 1106004157;
		og.ag();
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Ljava/lang/String;)I"
	)
	public static int gj(cn var0, String var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			String var3 = var1.toLowerCase();
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; var6++) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			return var5;
		}
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ej() {
		return this.ad_fld;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fy() {
		return this.ad_fld;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	public double jv() {
		return this.af_fld;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fa() {
		return this.ad_fld;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fo() {
		return this.ad_fld;
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void fp(boolean var1) {
		this.ad_fld = var1;
		og.ag();
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void fx(boolean var1) {
		this.ad_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dh() {
		return this.ar_fld;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void cz(boolean var1) {
		this.ay_fld = var1;
		og.ag();
	}

	@ObfuscatedName("getSoundEffectVolume")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getSoundEffectVolume")
	@Override
	public int getSoundEffectVolume() {
		return this.au_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	String at(int var1) {
		return this.aa_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	boolean as(short var1) {
		return this.aw_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	void ar(boolean var1, byte var2) {
		this.aw_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)V"
	)
	public static void ns(cn var0) {
		var0.au(!var0.as_fld, 101922610);
	}

	@ObfuscatedName("yf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void yf(int var1) {
		og.ci_fld.getCallbacks().post(new VolumeChanged(Type.EFFECTS));
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void bm(int var1, short var2) {
		this.an_fld = var1;
		og.ag();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I"
	)
	int bs(String var1, short var2) {
		int var3 = this.bh(var1, -2143071321);
		return !this.ae_fld.containsKey(var3) ? 0 : (Integer)this.ae_fld.get(var3);
	}

	@ObfuscatedName("getAreaSoundEffectVolume")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAreaSoundEffectVolume")
	@Override
	public int getAreaSoundEffectVolume() {
		return this.ax_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	float bf(int var1) {
		return this.am_fld / 100.0F;
	}

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Ljava/lang/String;S)I"
	)
	public static int wj(cn var0, String var1, short var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var3 = var0.bh(var1, -2143071321);
			return !var0.ae_fld.containsKey(var3) ? 0 : (Integer)var0.ae_fld.get(var3);
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cg() {
		return this.ad_fld;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void cm(boolean var1) {
		this.as_fld = var1;
		og.ag();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public double aa(int var1) {
		return this.af_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void by(int var1, int var2) {
		this.an_fld = 1241886479 * var1;
		of.ai();
		og.ag();
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dr(int var1) {
		this.am_fld = var1 * 1991339516;
		og.ag();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lxi;"
	)
	xi av(byte var1) {
		xi var2 = new xi(419, true);
		var2.ba(12);
		var2.cp(this.aw_fld ? 1 : 0);
		var2.bc(this.ay_fld ? 1 : 0);
		var2.ea(-1409945751 * this.aq_fld);
		var2.cp(this.ae_fld.size());
		Iterator var3 = this.ae_fld.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)(Entry)var3.next();
			var2.bq((Integer)var4.getKey());
			var2.eb((Integer)var4.getValue());
		}

		xi.ph(var2, this.aa_fld != null ? this.aa_fld : "", 1851466251);
		var2.cd(this.as_fld);
		var2.ca((int)(100.0 * this.af_fld));
		var2.bw(this.au_fld * -714800751);
		var2.bc(this.am_fld * 1522723071);
		var2.cn(this.ax_fld, 1165353420);
		var2.ed(1975834693 * this.aq_fld);
		var2.bw(this.aw_fld ? 1 : 0);
		var2.ek(this.an_fld * -1246914735);
		var2.ed(-879403025 * this.am_fld);
		var2.ca(this.ad_fld ? 1 : 0);
		return var2;
	}

	@ObfuscatedName("getRememberedUsername")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getRememberedUsername")
	@Override
	public String getRememberedUsername() {
		return this.aa_fld;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float ev() {
		return this.am_fld / 100.0F;
	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void eo(String var1, int var2) {
		int var3 = this.bh(var1, -1737358803);
		if (this.ae_fld.size() >= 10 && !this.ae_fld.containsKey(var3)) {
			Iterator var4 = this.ae_fld.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.ae_fld.put(var3, var2);
		og.ag();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bd(int var1) {
		return this.ai_fld;
	}
}
