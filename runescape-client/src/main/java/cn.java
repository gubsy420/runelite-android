import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.Preferences;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.VolumeChanged;
import net.runelite.api.events.VolumeChanged.Type;

@ObfuscatedName("cn")
@Implements({"Preferences"})
public class cn implements Preferences {
	@ObfuscatedGetter(
		intValue = 1975834693
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;
	@ObfuscatedGetter(
		intValue = -1409945751
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -1246914735
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "D"
	)
	double af_fld = 0.8;
	@ObfuscatedGetter(
		intValue = -714800751
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld = 1412552975;
	@ObfuscatedGetter(
		intValue = 1522723071
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int au_fld;
	@ObfuscatedGetter(
		intValue = 548012203
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ax_fld;
	@ObfuscatedGetter(
		intValue = 1539521221
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -879403025
	)
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	String at(int var1) {
		return this.aa_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	boolean ae(byte var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	void ah(boolean var1, byte var2) {
		this.ah_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float ea() {
		return this.am_fld / 100.0F;
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "(Lcn;B)I"
	)
	public static int tr(cn var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ar_fld;
	}

	@ObfuscatedName("getAreaSoundEffectVolume")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAreaSoundEffectVolume() {
		return this.ax_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	boolean as(short var1) {
		return this.ay_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void ac(String var1, int var2) {
		this.aa_fld = var1;
		og.ag();
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean fe() {
		return this.ah_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	void an(int var1, byte var2) {
		this.ar_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ck() {
		ij(this, !this.as_fld, 818528863);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	void ai(double var1) {
		this.af_fld = var1;
		og.ag();
	}

	@ObfuscatedName("setSoundEffectVolume")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setSoundEffectVolume(int var1) {
		this.au_fld = var1;
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
		this.ua(-1);
		og.ag();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void ao(int var1, int var2) {
		this.au_fld = var1;
		this.xs(-1);
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
		this.nf(-1);
		og.ag();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cx() {
		return this.ar_fld;
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void bm(int var1, short var2) {
		this.an_fld = var1;
		og.ag();
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
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

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Lxi;"
	)
	public static xi fq(cn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		xi var1 = new xi(419, true);
		var1.bc(12);
		var1.bc(var0.ah_fld ? 1 : 0);
		var1.bc(var0.ay_fld ? 1 : 0);
		var1.bc(var0.ai_fld);
		var1.bc(var0.ae_fld.size());
		Iterator var2 = var0.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			xi.ld(var1, (Integer)var3.getKey(), (byte)114);
			xi.ld(var1, (Integer)var3.getValue(), (byte)106);
		}

		var1.cc(var0.aa_fld != null ? var0.aa_fld : "", 1294784421);
		var1.cd(var0.aw_fld);
		var1.bc((int)(100.0 * var0.af_fld));
		var1.bc(var0.al_fld);
		var1.bc(var0.au_fld);
		var1.bc(var0.ax_fld);
		var1.bc(var0.an_fld);
		var1.bc(var0.as_fld ? 1 : 0);
		xi.ld(var1, var0.ar_fld, (byte)119);
		var1.bc(var0.aq_fld);
		var1.bc(var0.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I"
	)
	int bs(String var1, short var2) {
		int var3 = this.bh(var1, -2143071321);
		return !this.ae_fld.containsKey(var3) ? 0 : (Integer)this.ae_fld.get(var3);
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
				int var4 = zb.fd(var0, var2, var3, var2.length - var3);
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

					if (ox.vd(var5, var2, var0)) {
						var1[on.ag(var2)] = var4 + 256;
						break;
					}
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)F"
	)
	float bf(int var1) {
		return this.am_fld / 100.0F;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void fv(boolean var1) {
		this.ad_fld = var1;
		og.ag();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bl(int var1) {
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
				int var4 = zb.fd(var0, var2, var3, var2.length - var3);
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
				int var4 = zb.fd(var0, var2, var3, var2.length - var3);
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
				int var4 = zb.fd(var0, var2, var3, var2.length - var3);
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

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ox() {
		return this.ai_fld;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dd(int var1) {
		this.al_fld = var1;
		og.ag();
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tw() {
		return this.an_fld;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void of(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		boolean var10001;
		if (!var0.as_fld) {
			if (var1 != 239763703) {
				return;
			}

			var10001 = true;
		} else {
			var10001 = false;
		}

		ij(var0, var10001, -137443408);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void bu() {
		zb var0 = null;

		try {
			var0 = cw.av("", es.gp_fld.aw_fld, true);
			xi var1 = cx.kq_fld.av((byte)42);
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

	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void vn(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aq_fld = var1;
		of.ai();
		og.ag();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	xi cd() {
		xi var1 = new xi(419, true);
		var1.bc(12);
		var1.bc(this.ah_fld ? 1 : 0);
		var1.bc(this.ay_fld ? 1 : 0);
		var1.bc(this.ai_fld);
		var1.bc(this.ae_fld.size());
		Iterator var2 = this.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			xi.ld(var1, (Integer)var3.getKey(), (byte)105);
			xi.ld(var1, (Integer)var3.getValue(), (byte)110);
		}

		var1.cc(this.aa_fld != null ? this.aa_fld : "", -913709051);
		var1.cd(this.aw_fld);
		var1.bc((int)(100.0 * this.af_fld));
		var1.bc(this.al_fld);
		var1.bc(this.au_fld);
		var1.bc(this.ax_fld);
		var1.bc(this.an_fld);
		var1.bc(this.as_fld ? 1 : 0);
		xi.ld(var1, this.ar_fld, (byte)120);
		var1.bc(this.aq_fld);
		var1.bc(this.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	xi bq() {
		xi var1 = new xi(419, true);
		var1.bc(12);
		var1.bc(this.ah_fld ? 1 : 0);
		var1.bc(this.ay_fld ? 1 : 0);
		var1.bc(this.ai_fld);
		var1.bc(this.ae_fld.size());
		Iterator var2 = this.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			xi.ld(var1, (Integer)var3.getKey(), (byte)126);
			xi.ld(var1, (Integer)var3.getValue(), (byte)110);
		}

		var1.cc(this.aa_fld != null ? this.aa_fld : "", 1838097939);
		var1.cd(this.aw_fld);
		var1.bc((int)(100.0 * this.af_fld));
		var1.bc(this.al_fld);
		var1.bc(this.au_fld);
		var1.bc(this.ax_fld);
		var1.bc(this.an_fld);
		var1.bc(this.as_fld ? 1 : 0);
		xi.ld(var1, this.ar_fld, (byte)117);
		var1.bc(this.aq_fld);
		var1.bc(this.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	xi bb() {
		xi var1 = new xi(419, true);
		var1.bc(12);
		var1.bc(this.ah_fld ? 1 : 0);
		var1.bc(this.ay_fld ? 1 : 0);
		var1.bc(this.ai_fld);
		var1.bc(this.ae_fld.size());
		Iterator var2 = this.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			xi.ld(var1, (Integer)var3.getKey(), (byte)127);
			xi.ld(var1, (Integer)var3.getValue(), (byte)88);
		}

		var1.cc(this.aa_fld != null ? this.aa_fld : "", -871501929);
		var1.cd(this.aw_fld);
		var1.bc((int)(100.0 * this.af_fld));
		var1.bc(this.al_fld);
		var1.bc(this.au_fld);
		var1.bc(this.ax_fld);
		var1.bc(this.an_fld);
		var1.bc(this.as_fld ? 1 : 0);
		xi.ld(var1, this.ar_fld, (byte)122);
		var1.bc(this.aq_fld);
		var1.bc(this.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void cs(boolean var1) {
		this.ah_fld = var1;
		og.ag();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cv() {
		return this.ah_fld;
	}

	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean rv() {
		return this.ay_fld;
	}

	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V"
	)
	public static void tu(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aq_fld = var1;
			of.ai();
			og.ag();
		}
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void ca(boolean var1) {
		this.aw_fld = var1;
		og.ag();
	}

	@ObfuscatedName("setRememberedUsername")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	@Override
	public void setRememberedUsername(String var1) {
		this.aa_fld = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean al(int var1) {
		return this.as_fld;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void cm(boolean var1) {
		this.ay_fld = var1;
		og.ag();
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void nf(int var1) {
		og.ci_fld.getCallbacks().post(new VolumeChanged(Type.AREA));
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void by(int var1, int var2) {
		this.am_fld = var1;
		og.ag();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cb() {
		ij(this, !this.as_fld, 1286286953);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Ljava/lang/String;)Z"
	)
	public static boolean aw(cn var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = var0.bh(var1, -1684341546);
		return var0.ae_fld.containsKey(var2);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean cu() {
		return this.as_fld;
	}

	cn() {
		this.ua(-1);
		this.au_fld = -505452415;
		this.xs(-1);
		this.ax_fld = 1592461181;
		this.nf(-1);
		this.an_fld = 407602547;
		this.aa_fld = null;
		this.ai_fld = 676696281;
		this.aq_fld = 982390903;
		this.am_fld = 1292653844;
		this.ad_fld = false;
		this.az(true, (byte)64);
		this.dp_void();
	}

	@ObfuscatedName("zo")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean zo() {
		return this.as_fld;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ch() {
		return this.as_fld;
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int du() {
		return this.ax_fld;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void dc(boolean var1) {
		this.as_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dl(int var1) {
		this.al_fld = var1;
		og.ag();
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Lxi;"
	)
	public static xi hl(cn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		xi var1 = new xi(419, true);
		var1.bc(12);
		var1.bc(var0.ah_fld ? 1 : 0);
		var1.bc(var0.ay_fld ? 1 : 0);
		var1.bc(var0.ai_fld);
		var1.bc(var0.ae_fld.size());
		Iterator var2 = var0.ae_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			xi.ld(var1, (Integer)var3.getKey(), (byte)81);
			xi.ld(var1, (Integer)var3.getValue(), (byte)120);
		}

		var1.cc(var0.aa_fld != null ? var0.aa_fld : "", 1821907130);
		var1.cd(var0.aw_fld);
		var1.bc((int)(100.0 * var0.af_fld));
		var1.bc(var0.al_fld);
		var1.bc(var0.au_fld);
		var1.bc(var0.ax_fld);
		var1.bc(var0.an_fld);
		var1.bc(var0.as_fld ? 1 : 0);
		xi.ld(var1, var0.ar_fld, (byte)127);
		var1.bc(var0.aq_fld);
		var1.bc(var0.ad_fld ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float em() {
		return this.am_fld / 100.0F;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(D)V"
	)
	void dm(double var1) {
		this.af_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dv() {
		return this.ar_fld;
	}

	cn(xi var1) {
		this.ua(-1);
		this.au_fld = -505452415;
		this.xs(-1);
		this.ax_fld = 1592461181;
		this.nf(-1);
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
						int var5 = var1.co();
						int var6 = var1.co();
						this.ae_fld.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.aa_fld = var1.ch();
				}

				if (var2 > 5) {
					this.aw_fld = var1.dw();
				}

				if (var2 > 6) {
					this.af_fld = var1.cg() / 100.0;
					this.al_fld = var1.cg();
					this.ua(-1);
					this.au_fld = var1.cg();
					this.xs(-1);
					this.ax_fld = var1.cg();
					this.nf(-1);
				}

				if (var2 > 7) {
					this.an_fld = var1.cg();
				}

				if (var2 > 8) {
					this.as_fld = var1.cg() == 1;
				}

				if (var2 > 9) {
					this.ar_fld = var1.co();
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

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void dr(int var1) {
		this.al_fld = var1 * 1991339516;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lxi;"
	)
	xi av(byte var1) {
		xi var2 = new xi(419, true);
		var2.bc(12);
		var2.bc(this.ah_fld ? 1 : 0);
		var2.bc(this.ay_fld ? 1 : 0);
		var2.bc(this.ai_fld);
		var2.bc(this.ae_fld.size());
		Iterator var3 = this.ae_fld.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)(Entry)var3.next();
			xi.ld(var2, (Integer)var4.getKey(), (byte)122);
			xi.ld(var2, (Integer)var4.getValue(), (byte)88);
		}

		var2.cc(this.aa_fld != null ? this.aa_fld : "", 1851466251);
		var2.cd(this.aw_fld);
		var2.bc((int)(100.0 * this.af_fld));
		var2.bc(this.al_fld);
		var2.bc(this.au_fld);
		var2.bc(this.ax_fld);
		var2.bc(this.an_fld);
		var2.bc(this.as_fld ? 1 : 0);
		xi.ld(var2, this.ar_fld, (byte)113);
		var2.bc(this.aq_fld);
		var2.bc(this.ad_fld ? 1 : 0);
		return var2;
	}

	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "(Lcn;ZB)V"
	)
	public static void up(cn var0, boolean var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ay_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dx() {
		return this.ax_fld;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ds() {
		return this.ax_fld;
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

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void db(int var1) {
		this.ax_fld = var1 * 913794755;
		og.ag();
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String dw() {
		return this.aa_fld;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String dy() {
		return this.aa_fld;
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "()D"
	)
	public double nt() {
		return this.af_fld;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String di() {
		return this.aa_fld;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String df() {
		return this.aa_fld;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void de(String var1) {
		this.aa_fld = var1;
		og.ag();
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int dp() {
		return this.an_fld;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)D"
	)
	public static double db(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.af_fld;
	}

	@ObfuscatedName("xf")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Ljava/lang/String;)I"
	)
	public static int xf(cn var0, String var1) {
		if (var0 == null) {
			var0.getClass();
		}

		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; var6++) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()F"
	)
	float ev() {
		return this.am_fld / 100.0F;
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

	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Z"
	)
	public static boolean vj(cn var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void dp_void() {
		this.ai_fld = 2;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int eb() {
		return this.ai_fld;
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int et() {
		return this.ai_fld;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lcn;ZI)V"
	)
	public static void ij(cn var0, boolean var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.as_fld = var1;
			og.ag();
		}
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

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cq() {
		return this.ah_fld;
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

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	void eo(String var1, int var2) {
		int var3 = this.bh(var1, -2134468946);
		if (this.ae_fld.size() >= 10 && !this.ae_fld.containsKey(var3)) {
			Iterator var4 = this.ae_fld.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.ae_fld.put(var3, var2);
		og.ag();
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	int eq(String var1) {
		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; var6++) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ee() {
		return this.aq_fld;
	}

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ek() {
		return this.aq_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lcn;Ljava/lang/String;I)V"
	)
	public static void cd(cn var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var0.bh(var1, -1737358803);
		if (var0.ae_fld.size() >= 10 && !var0.ae_fld.containsKey(var3)) {
			Iterator var4 = var0.ae_fld.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		var0.ae_fld.put(var3, var2);
		og.ag();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bd(int var1) {
		return this.ai_fld;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void cw(boolean var1) {
		this.ay_fld = var1;
		og.ag();
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
				int var4 = zb.fd(var0, var2, var3, var2.length - var3);
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

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void eh(int var1) {
		this.am_fld = var1;
		og.ag();
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ej() {
		return this.ad_fld;
	}

	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void xs(int var1) {
		og.ci_fld.getCallbacks().post(new VolumeChanged(Type.EFFECTS));
	}

	@ObfuscatedName("getSoundEffectVolume")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getSoundEffectVolume() {
		return this.au_fld;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean fy() {
		return this.ad_fld;
	}

	@ObfuscatedName("getRememberedUsername")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getRememberedUsername() {
		return this.aa_fld;
	}

	@ObfuscatedName("za")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)Z"
	)
	public static boolean za(cn var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aw_fld;
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

	@ObfuscatedName("getHideUsername")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean getHideUsername() {
		return this.aw_fld;
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cc() {
		return this.ah_fld;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void co() {
		ij(this, !this.as_fld, 101922610);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean aw(int var1) {
		return this.aw_fld;
	}

	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "()Lxi;"
	)
	public xi vc() {
		return this.av((byte)-69);
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Lcn;B)I"
	)
	public static int ka(cn var0, byte var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.aq_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	void ar(boolean var1, byte var2) {
		this.ah_fld = var1;
		og.ag();
	}

	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Z"
	)
	public static boolean tx(cn var0) {
		return var0.as_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void af(int var1) {
		og.ci_fld.getCallbacks().post(new VolumeChanged(Type.AREA));
	}

	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ua(int var1) {
		og.ci_fld.getCallbacks().post(new VolumeChanged(Type.MUSIC));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int aj(byte var1) {
		return this.al_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)I"
	)
	int ad(short var1) {
		return this.an_fld;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bk(int var1, int var2) {
		this.ar_fld = 1241886479 * var1;
		of.ai();
		og.ag();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)D"
	)
	public double aa(int var1) {
		return this.af_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ax(byte var1) {
		return this.an_fld;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lcn;S)I"
	)
	public static int kw(cn var0, short var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.au_fld;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V"
	)
	void au(boolean var1, int var2) {
		this.ad_fld = var1;
		og.ag();
	}

	@ObfuscatedName("setAreaSoundEffectVolume")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setAreaSoundEffectVolume(int var1) {
		this.ax_fld = var1;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ed() {
		return this.aq_fld;
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	boolean er(String var1) {
		int var2 = this.bh(var1, -1684341546);
		return this.ae_fld.containsKey(var2);
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	void fj(boolean var1) {
		this.ad_fld = var1;
		og.ag();
	}
}
