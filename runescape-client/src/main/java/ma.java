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
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 769053905
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
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -153772103
	)
	int al_fld = -421574281;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lde;)Z"
	)
	public boolean at(String var1, String var2, de var3) {
		if (var1 == null || var1.isEmpty()) {
			return false;
		} else if (var3 == null) {
			return false;
		} else {
			this.an();

			try {
				this.au_fld = var1;
				this.aa_fld = var3.as(new URL(this.au_fld), (byte)12);
				this.al_fld = 0;
			} catch (MalformedURLException var5) {
				this.an();
				this.al_fld = 1686297124;
				return false;
			}

			if (!var2.isEmpty()) {
				this.an_fld = var2;
			}

			return true;
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

	@ObfuscatedName("yi")
	@ObfuscatedSignature(
		descriptor = "(Lma;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public static void yi(ma var0, String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ar_fld = cf.ak();
		var0.ax_fld = var1;
		var0.ar_fld.av(var0.ax_fld, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void an() {
		this.aa_fld = null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList bi() {
		return this.af_fld.av_fld;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int by(String var1) {
		return this.af_fld.aw_fld.containsKey(var1) ? (Integer)this.af_fld.aw_fld.get(var1) : -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ae() {
		return this.al_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean ah() {
		return this.af_fld != null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;"
	)
	public ArrayList ar() {
		return this.af_fld.av_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lmx;"
	)
	public mx ak() {
		return this.ar_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ai(byte var1) {
		Iterator var2 = this.af_fld.az_fld.iterator();

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

		this.an();
		this.al_fld = 2107871405;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;"
	)
	public ArrayList af() {
		return this.af_fld.ag_fld;
	}

	public ma() {
		this.ai_fld = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;"
	)
	public String ax() {
		return this.af_fld.az();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lde;I)Z"
	)
	public boolean aq(String var1, de var2) {
		try {
			JSONObject var4 = new vt(var1.getBytes()).ay();

			try {
				this.ai_fld = var4.getInt("version");
			} catch (Exception var6) {
				this.an();
				this.al_fld = -1765521610;
				return false;
			}

			if (!this.af_fld.ah(var4, this.ai_fld, var2)) {
				this.al_fld = -1765521610;
			}

			this.al_fld = !this.af_fld.az_fld.isEmpty() ? 1 : 2;
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
				this.an();
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
						this.an();
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
						this.af_fld = var6.av(this.an_fld);
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
					this.an();
					this.al_fld = -1765521610;
					return;
				}

				if (this.af_fld != null) {
					byte var10001;
					if (!this.af_fld.az_fld.isEmpty()) {
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cc() {
		return this.af_fld.az();
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
				this.an();
				this.al_fld = -1765521610;
				return false;
			}

			if (!this.af_fld.ah(var3, this.ai_fld, var2)) {
				this.al_fld = -1765521610;
			}

			this.al_fld = !this.af_fld.az_fld.isEmpty() ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.al_fld = -1765521610;
		}

		return this.al_fld < 3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;"
	)
	public ArrayList as() {
		return this.af_fld.az_fld;
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
			this.an();

			try {
				this.au_fld = var1;
				this.aa_fld = var3.as(new URL(this.au_fld), (byte)102);
				this.al_fld = 0;
			} catch (MalformedURLException var5) {
				this.an();
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
			this.an();

			try {
				this.au_fld = var1;
				this.aa_fld = var3.as(new URL(this.au_fld), (byte)8);
				this.al_fld = 0;
			} catch (MalformedURLException var5) {
				this.an();
				this.al_fld = 1686297124;
				return false;
			}

			if (!var2.isEmpty()) {
				this.an_fld = var2;
			}

			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lma;)Ljava/lang/String;"
	)
	public static String an(ma var0) {
		return var0.af_fld.as_fld;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int bl(String var1) {
		return this.af_fld.aw_fld.containsKey(var1) ? (Integer)this.af_fld.aw_fld.get(var1) : -1;
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void bd(String var1, String var2, String var3) throws UnsupportedEncodingException {
		this.ar_fld = cf.ak();
		this.ax_fld = var1;
		this.ar_fld.av(this.ax_fld, var2, var3);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	public void bz(de var1) {
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	public void br(de var1) {
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int be() {
		return this.al_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bs() {
		return this.al_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lmx;"
	)
	public mx ao() {
		return this.ar_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	public String ay(String var1) {
		return (String)(this.af_fld.ay_fld.containsKey(var1) ? this.af_fld.ay_fld.get(var1) : null);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lzv;C)I"
	)
	public static int ax(zv var0, char var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 == 160) {
			var1 = ' ';
		}

		return var0.be_fld[vj.ak(var1) & 0xFF];
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bj() {
		return this.af_fld != null;
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int bx(String var1) {
		return this.af_fld.aw_fld.containsKey(var1) ? (Integer)this.af_fld.aw_fld.get(var1) : -1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	public int bo(String var1) {
		return this.af_fld.aw_fld.containsKey(var1) ? (Integer)this.af_fld.aw_fld.get(var1) : -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
	)
	public void az(String var1, String var2, String var3) throws UnsupportedEncodingException {
		this.ar_fld = cf.ak();
		this.ax_fld = var1;
		this.ar_fld.av(this.ax_fld, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)[F"
	)
	public float[] au() {
		return this.af_fld.ah_fld;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String bp(String var1) {
		return (String)(this.af_fld.ay_fld.containsKey(var1) ? this.af_fld.ay_fld.get(var1) : null);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public String bt(String var1) {
		return (String)(this.af_fld.ay_fld.containsKey(var1) ? this.af_fld.ay_fld.get(var1) : null);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList bv() {
		return this.af_fld.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lde;I)Z"
	)
	public boolean ag(String var1, String var2, de var3) {
		if (var1 == null || var1.isEmpty()) {
			return false;
		} else if (var3 == null) {
			return false;
		} else {
			this.an();

			try {
				this.au_fld = var1;
				this.aa_fld = var3.as(new URL(this.au_fld), (byte)102);
				this.al_fld = 0;
			} catch (MalformedURLException var6) {
				this.an();
				this.al_fld = 1686297124;
				return false;
			}

			if (!var2.isEmpty()) {
				this.an_fld = var2;
			}

			return true;
		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lma;Lde;I)V"
	)
	public static void dh(ma var0, de var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			switch (var0.al_fld) {
				case 0:
					var0.aa(var1, -1035308349);
					break;
				case 1:
					var0.ai((byte)3);
					break;
				default:
					return;
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList bu() {
		return this.af_fld.av_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList bn() {
		return this.af_fld.av_fld;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/ArrayList;"
	)
	public ArrayList bw() {
		return this.af_fld.ag_fld;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()[F"
	)
	public float[] bg() {
		return this.af_fld.ah_fld;
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

	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "(Lma;Ljava/lang/String;I)I"
	)
	public static int rs(ma var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.af_fld.aw_fld.containsKey(var1) ? (Integer)var0.af_fld.aw_fld.get(var1) : -1;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String cd() {
		return this.af_fld.az();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cq() {
		this.aa_fld = null;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cv() {
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
				this.an();
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
						this.an();
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
						this.af_fld = var5.av(this.an_fld);
						if (this.af_fld != null) {
							this.ai((byte)3);
							this.al_fld = 421574281;
						} else {
							this.al_fld = -1343947329;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.an();
					this.al_fld = -1765521610;
					return;
				}

				if (this.af_fld != null) {
					this.al_fld = !this.af_fld.az_fld.isEmpty() ? 1 : 2;
				}

				this.aa_fld = null;
			}
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cf() {
		Iterator var1 = this.af_fld.az_fld.iterator();

		while (var1.hasNext()) {
			lq var2 = (lq)(lq)var1.next();
			if (null != var2.ak_fld && !var2.ak_fld.ak()) {
				return;
			}
		}

		var1 = this.af_fld.az_fld.iterator();

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

		this.an();
		this.al_fld = 2107871405;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cx() {
		Iterator var1 = this.af_fld.az_fld.iterator();

		while (var1.hasNext()) {
			lq var2 = (lq)(lq)var1.next();
			if (null != var2.ak_fld && !var2.ak_fld.ak()) {
				return;
			}
		}

		var1 = this.af_fld.az_fld.iterator();

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

		this.an();
		this.al_fld = 2107871405;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cp() {
		Iterator var1 = this.af_fld.az_fld.iterator();

		while (var1.hasNext()) {
			lq var2 = (lq)(lq)var1.next();
			if (null != var2.ak_fld && !var2.ak_fld.ak()) {
				return;
			}
		}

		var1 = this.af_fld.az_fld.iterator();

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

		this.an();
		this.al_fld = 2107871405;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
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
				var1 = (ur)zi.ex(uw.ae_fld);
			}

			if (var1 == null) {
				if (var0 <= 0) {
					return;
				}

				return;
			}

			var1.av_fld.ay(var1.az_fld, (int)var1.hc_long, var1.ag_fld, false);
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Lma;)V"
	)
	public static void ot(ma var0) {
		Iterator var1 = var0.af_fld.az_fld.iterator();

		while (var1.hasNext()) {
			lq var2 = (lq)(lq)var1.next();
			if (null != var2.ak_fld && !var2.ak_fld.ak()) {
				return;
			}
		}

		var1 = var0.af_fld.az_fld.iterator();

		while (var1.hasNext()) {
			lq var5 = (lq)(lq)var1.next();
			if (var5.ak_fld != null) {
				byte[] var3 = var5.ak_fld.ag();
				if (var3 != null && var3.length > 0) {
					var0.al_fld = -1592679137;
					return;
				}
			}
		}

		var0.an();
		var0.al_fld = -2093937202;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I"
	)
	public int aw(String var1, int var2) {
		return this.af_fld.ay_fld.containsKey(var1) ? (Integer)this.af_fld.aw_fld.get(var1) : -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lmx;"
	)
	public mx ad() {
		return this.ar_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V"
	)
	public void av(de var1, int var2) {
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
}
