import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ma")
public class ma {
	@ObfuscatedGetter(
		intValue = 769053905
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ai_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	dj aa_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	mj af_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	mx ar_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ax_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bk_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String an_fld;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub bv_fld;
	@ObfuscatedGetter(
		intValue = -153772103
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld = -421574281;

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lma;I)Lmx;"
	)
	public static mx gb(ma var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ar_fld;
		}
	}

	public ma(ma var1) {
		this.ai_fld = 0;
		if (var1 != null) {
			this.ar_fld = var1.ar_fld;
			this.af_fld = var1.af_fld;
			this.al_fld = 1 * var1.al_fld;
			this.au_fld = var1.au_fld;
			this.ax_fld = var1.ax_fld;
			this.an_fld = var1.an_fld;
			this.aa_fld = null;
			this.ai_fld = 1 * var1.ai_fld;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList bi() {
		return this.af_fld.ag_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int bo(String var1) {
		return this.af_fld.ay_fld.containsKey(var1) ? (Integer)this.af_fld.ay_fld.get(var1) : -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean ah() {
		return this.af_fld != null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int aw(String var1) {
		return this.af_fld.ay_fld.containsKey(var1) ? (Integer)this.af_fld.ay_fld.get(var1) : -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ai(byte var1) {
		Iterator var2 = this.af_fld.av_fld.iterator();

		while (var2.hasNext()) {
			if (var1 != 3) {
				return;
			}

			lq var3 = (lq)(lq)var2.next();
			if (null != var3.ak_fld && !var3.ak_fld.ak()) {
				return;
			}
		}

		var2 = this.af_fld.av_fld.iterator();

		while (var2.hasNext()) {
			lq var6 = (lq)(lq)var2.next();
			if (var6.ak_fld != null) {
				byte[] var4 = var6.ak_fld.ag();
				if (var4 != null && var4.length > 0) {
					this.al_fld = 843148562;
					return;
				}
			}
		}

		le(this, (byte)97);
		this.al_fld = 2107871405;
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Lma;)Ljava/lang/String;"
	)
	public static String pl(ma var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.af_fld.az();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList ar() {
		return this.af_fld.az_fld;
	}

	public ma() {
		this.ai_fld = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ax() {
		return this.af_fld.az();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lde;)Z"
	)
	public boolean aq(String var1, de var2) {
		try {
			JSONObject var4 = new vt(var1.getBytes()).ay();

			try {
				this.ai_fld = var4.getInt("version");
			} catch (Exception var6) {
				le(this, (byte)121);
				this.al_fld = -1765521610;
				return false;
			}

			if (!this.af_fld.ah(var4, this.ai_fld, var2)) {
				this.al_fld = -1765521610;
			}

			this.al_fld = !this.af_fld.av_fld.isEmpty() ? 1 : 2;
		} catch (UnsupportedEncodingException var7) {
			this.al_fld = -1765521610;
		}

		return this.al_fld < 3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V"
	)
	void aa(de var1, int var2) {
		if (null != this.aa_fld && this.aa_fld.ak()) {
			byte[] var3 = this.aa_fld.ag();
			if (var3 == null) {
				le(this, (byte)36);
				this.al_fld = 1686297124;
			} else {
				try {
					vt var4 = new vt(var3);
					JSONObject var5 = var4.ay();
					if (var5 == null) {
						return;
					}

					try {
						this.ai_fld = var5.getInt("version");
					} catch (Exception var8) {
						le(this, (byte)114);
						this.al_fld = -1765521610;
						return;
					}

					if (this.ai_fld < 2) {
						if (!this.af_fld.ah(var5, this.ai_fld, var1)) {
							this.al_fld = -1765521610;
						}
					} else if (this.ai_fld == 2) {
						mo var6 = mo.ag_fld;
						var6.ak(var5, this.ai_fld, var1);
						this.af_fld = mo.lo(var6, this.an_fld, -39423082);
						if (this.af_fld != null) {
							if (var2 == -310015507) {
								return;
							}

							this.ai((byte)3);
							this.al_fld = 421574281;
						} else {
							this.al_fld = -1343947329;
						}
					}
				} catch (UnsupportedEncodingException var9) {
					le(this, (byte)8);
					this.al_fld = -1765521610;
					return;
				}

				if (this.af_fld != null) {
					byte var10001;
					if (!this.af_fld.av_fld.isEmpty()) {
						if (var2 == -310015507) {
							return;
						}

						var10001 = 1;
					} else {
						var10001 = 2;
					}

					this.al_fld = var10001;
				}

				this.aa_fld = null;
			}
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lde;)Z"
	)
	public boolean ce(String var1, de var2) {
		try {
			JSONObject var3 = new vt(var1.getBytes()).ay();

			try {
				this.ai_fld = var3.getInt("version");
			} catch (Exception var5) {
				le(this, (byte)92);
				this.al_fld = -1765521610;
				return false;
			}

			if (!this.af_fld.ah(var3, this.ai_fld, var2)) {
				this.al_fld = -1765521610;
			}

			this.al_fld = !this.af_fld.av_fld.isEmpty() ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.al_fld = -1765521610;
		}

		return this.al_fld < 3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lma;S)[F"
	)
	public static float[] ao(ma var0, short var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.af_fld.ah_fld;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lmx;"
	)
	public mx ao() {
		return this.ar_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList as() {
		return this.af_fld.av_fld;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lde;)Z"
	)
	public boolean ab(String var1, String var2, de var3) {
		if (var1 == null || var1.isEmpty()) {
			return false;
		} else if (var3 == null) {
			return false;
		} else {
			le(this, (byte)83);

			try {
				this.au_fld = var1;
				this.aa_fld = var3.as(new URL(this.au_fld), (byte)102);
				this.al_fld = 0;
			} catch (MalformedURLException var5) {
				le(this, (byte)62);
				this.al_fld = -73295458;
				return false;
			}

			if (!var2.isEmpty()) {
				this.an_fld = var2;
			}

			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lde;)Z"
	)
	public boolean ap(String var1, String var2, de var3) {
		if (var1 == null || var1.isEmpty()) {
			return false;
		} else if (var3 == null) {
			return false;
		} else {
			le(this, (byte)102);

			try {
				this.au_fld = var1;
				this.aa_fld = var3.as(new URL(this.au_fld), (byte)8);
				this.al_fld = 0;
			} catch (MalformedURLException var5) {
				le(this, (byte)46);
				this.al_fld = 1686297124;
				return false;
			}

			if (!var2.isEmpty()) {
				this.an_fld = var2;
			}

			return true;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] bb() {
		return this.af_fld.ah_fld;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void bm(String var1, String var2, String var3) throws UnsupportedEncodingException {
		this.ar_fld = cf.ak();
		this.ax_fld = var1;
		this.ar_fld.av(this.ax_fld, var2, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	public void av(de var1) {
		switch (this.al_fld) {
			case 0:
				this.aa(var1, -1035308349);
				break;
			case 1:
				this.ai((byte)3);
				break;
			default:
				return;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void aj(String var1, String var2, String var3) throws UnsupportedEncodingException {
		this.ar_fld = cf.ak();
		this.ax_fld = var1;
		this.ar_fld.av(this.ax_fld, var2, var3);
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Lma;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public static void hx(ma var0, String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld = cf.ak();
		var0.ax_fld = var1;
		var0.ar_fld.av(var0.ax_fld, var2, var3);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	public void br(de var1) {
		switch (1165787205 * this.al_fld) {
			case 0:
				this.aa(var1, -527070890);
				break;
			case 1:
				this.ai((byte)3);
				break;
			default:
				return;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	public void bz(de var1) {
		switch (this.al_fld) {
			case 0:
				this.aa(var1, -1157110091);
				break;
			case 1:
				this.ai((byte)3);
				break;
			default:
				return;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bs() {
		return this.al_fld;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lma;Ljava/lang/String;)I"
	)
	public static int iy(ma var0, String var1) {
		return var0.af_fld.ay_fld.containsKey(var1) ? (Integer)var0.af_fld.ay_fld.get(var1) : -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lmx;"
	)
	public mx am() {
		return this.ar_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String ay(String var1) {
		return (String)(this.af_fld.aw_fld.containsKey(var1) ? this.af_fld.aw_fld.get(var1) : null);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lma;I)Ljava/util/ArrayList;"
	)
	public static ArrayList ck(ma var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.af_fld.ag_fld;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bj() {
		return this.af_fld != null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void bd(String var1, String var2, String var3) throws UnsupportedEncodingException {
		this.ar_fld = cf.ak();
		this.ax_fld = var1;
		this.ar_fld.av(this.ax_fld, var2, var3);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int bl(String var1) {
		return this.af_fld.ay_fld.containsKey(var1) ? (Integer)this.af_fld.ay_fld.get(var1) : -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void az(String var1, String var2, String var3) throws UnsupportedEncodingException {
		this.ar_fld = cf.ak();
		this.ax_fld = var1;
		this.ar_fld.av(this.ax_fld, var2, var3);
	}

	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "(Lma;B)I"
	)
	public static int wj(ma var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.al_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String bp(String var1) {
		return (String)(this.af_fld.aw_fld.containsKey(var1) ? this.af_fld.aw_fld.get(var1) : null);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String bt(String var1) {
		return (String)(this.af_fld.aw_fld.containsKey(var1) ? this.af_fld.aw_fld.get(var1) : null);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lde;)Z"
	)
	public boolean ag(String var1, String var2, de var3) {
		if (var1 == null || var1.isEmpty()) {
			return false;
		} else if (var3 == null) {
			return false;
		} else {
			le(this, (byte)83);

			try {
				this.au_fld = var1;
				this.aa_fld = var3.as(new URL(this.au_fld), (byte)102);
				this.al_fld = 0;
			} catch (MalformedURLException var6) {
				le(this, (byte)99);
				this.al_fld = 1686297124;
				return false;
			}

			if (!var2.isEmpty()) {
				this.an_fld = var2;
			}

			return true;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList bu() {
		return this.af_fld.ag_fld;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList bc() {
		return this.af_fld.az_fld;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ba() {
		return this.af_fld.as_fld;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lma;B)V"
	)
	public static void le(ma var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa_fld = null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bf() {
		return this.af_fld != null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bh() {
		return this.al_fld;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cc() {
		return this.af_fld.az();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cf() {
		this.aa_fld = null;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cx() {
		this.aa_fld = null;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	void cy(de var1) {
		if (null != this.aa_fld && this.aa_fld.ak()) {
			byte[] var2 = this.aa_fld.ag();
			if (var2 == null) {
				le(this, (byte)75);
				this.al_fld = 1686297124;
			} else {
				try {
					vt var3 = new vt(var2);
					JSONObject var4 = var3.ay();
					if (var4 == null) {
						return;
					}

					try {
						this.ai_fld = var4.getInt("version");
					} catch (Exception var7) {
						le(this, (byte)72);
						this.al_fld = -1765521610;
						return;
					}

					if (this.ai_fld < 2) {
						if (!this.af_fld.ah(var4, this.ai_fld, var1)) {
							this.al_fld = -1765521610;
						}
					} else if (this.ai_fld == 2) {
						mo var5 = mo.ag_fld;
						var5.ak(var4, this.ai_fld, var1);
						this.af_fld = mo.lo(var5, this.an_fld, -579204255);
						if (this.af_fld != null) {
							this.ai((byte)3);
							this.al_fld = 421574281;
						} else {
							this.al_fld = -1343947329;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					le(this, (byte)13);
					this.al_fld = -1765521610;
					return;
				}

				if (this.af_fld != null) {
					this.al_fld = !this.af_fld.av_fld.isEmpty() ? 1 : 2;
				}

				this.aa_fld = null;
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cv() {
		Iterator var1 = this.af_fld.av_fld.iterator();

		while (var1.hasNext()) {
			lq var2 = (lq)(lq)var1.next();
			if (null != var2.ak_fld && !var2.ak_fld.ak()) {
				return;
			}
		}

		var1 = this.af_fld.av_fld.iterator();

		while (var1.hasNext()) {
			lq var5 = (lq)(lq)var1.next();
			if (var5.ak_fld != null) {
				byte[] var3 = var5.ak_fld.ag();
				if (var3 != null && var3.length > 0) {
					this.al_fld = 843148562;
					return;
				}
			}
		}

		le(this, (byte)34);
		this.al_fld = 2107871405;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cs() {
		Iterator var1 = this.af_fld.av_fld.iterator();

		while (var1.hasNext()) {
			lq var2 = (lq)(lq)var1.next();
			if (null != var2.ak_fld && !var2.ak_fld.ak()) {
				return;
			}
		}

		var1 = this.af_fld.av_fld.iterator();

		while (var1.hasNext()) {
			lq var5 = (lq)(lq)var1.next();
			if (var5.ak_fld != null) {
				byte[] var3 = var5.ak_fld.ag();
				if (var3 != null && var3.length > 0) {
					this.al_fld = 843148562;
					return;
				}
			}
		}

		le(this, (byte)96);
		this.al_fld = 2107871405;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cq() {
		Iterator var1 = this.af_fld.av_fld.iterator();

		while (var1.hasNext()) {
			lq var2 = (lq)(lq)var1.next();
			if (null != var2.ak_fld && !var2.ak_fld.ak()) {
				return;
			}
		}

		var1 = this.af_fld.av_fld.iterator();

		while (var1.hasNext()) {
			lq var5 = (lq)(lq)var1.next();
			if (var5.ak_fld != null) {
				byte[] var3 = var5.ak_fld.ag();
				if (var3 != null && var3.length > 0) {
					this.al_fld = -1592679137;
					return;
				}
			}
		}

		le(this, (byte)117);
		this.al_fld = -2093937202;
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Lma;)V"
	)
	public static void lz(ma var0) {
		Iterator var1 = var0.af_fld.av_fld.iterator();

		while (var1.hasNext()) {
			lq var2 = (lq)(lq)var1.next();
			if (null != var2.ak_fld && !var2.ak_fld.ak()) {
				return;
			}
		}

		var1 = var0.af_fld.av_fld.iterator();

		while (var1.hasNext()) {
			lq var5 = (lq)(lq)var1.next();
			if (var5.ak_fld != null) {
				byte[] var3 = var5.ak_fld.ag();
				if (var3 != null && var3.length > 0) {
					var0.al_fld = 843148562;
					return;
				}
			}
		}

		le(var0, (byte)28);
		var0.al_fld = 2107871405;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String al() {
		return this.af_fld.as_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public static void aw(byte var0) {
		while (true) {
			ur var1;
			synchronized (uw.ak_fld) {
				var1 = (ur)uw.ae_fld.ae();
			}

			if (var1 == null) {
				if (var0 <= 0) {
					return;
				}

				return;
			}

			var1.av_fld.ay(var1.az_fld, (int)var1.hc_fld, var1.ag_fld, false);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bk() {
		return this.ai_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void an(byte var1) {
		Iterator var2 = this.af_fld.av_fld.iterator();

		while (var2.hasNext()) {
			if (var1 != 3) {
				return;
			}

			lq var3 = (lq)(lq)var2.next();
			if (null != var3.ak_fld && !var3.ak_fld.ak()) {
				return;
			}
		}

		var2 = this.af_fld.az_fld.iterator();

		while (var2.hasNext()) {
			lq var6 = (lq)(lq)var2.next();
			if (var6.ak_fld != null) {
				byte[] var4 = var6.ak_fld.ag();
				if (var4 != null && var4.length > 0) {
					this.al_fld = 843148562;
					return;
				}
			}
		}

		le(this, (byte)97);
		this.al_fld = 2107871405;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ae(byte var1) {
		return this.al_fld;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lma;Ljava/lang/String;Ljava/lang/String;Lde;)Z"
	)
	public static boolean iu(ma var0, String var1, String var2, de var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 == null || var1.isEmpty()) {
			return false;
		} else if (var3 == null) {
			return false;
		} else {
			le(var0, (byte)75);

			try {
				var0.au_fld = var1;
				var0.aa_fld = var3.as(new URL(var0.au_fld), (byte)12);
				var0.al_fld = 0;
			} catch (MalformedURLException var5) {
				le(var0, (byte)118);
				var0.al_fld = 1686297124;
				return false;
			}

			if (!var2.isEmpty()) {
				var0.an_fld = var2;
			}

			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;"
	)
	public ArrayList af(int var1) {
		return this.af_fld.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lmx;"
	)
	public mx ak(int var1) {
		return this.ar_fld;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cd() {
		return this.af_fld.ae_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)[F"
	)
	public float[] au(short var1) {
		return this.af_fld.ah_fld;
	}
}
