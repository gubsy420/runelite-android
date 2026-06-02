import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("mx")
public class mx {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String as_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	static mx ae_fld = new mx();
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	qv au_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	qw ax_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld = 1;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String af_fld;
	@ObfuscatedGetter(
		longValue = -1781324348075015215L
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long al_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ay_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedGetter(
		intValue = -2139934127
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int an_fld;
	@ObfuscatedGetter(
		intValue = 475548679
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aa_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean aq_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean bh(String var1) {
		xa(this, 2, var1);
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) throws UnsupportedEncodingException {
		if (!this.af_fld.isEmpty()) {
			String var2 = "";
			switch (this.aa_fld) {
				case 1:
					var2 = "events/click";
					break;
				case 2:
					var2 = "events/dismissed";
					break;
				case 3:
					var2 = "events/impression";
			}

			if (this.ai_fld.isEmpty()) {
				if (var1 < -1020974466) {
					;
				}
			} else {
				String var3 = this.ay_fld;
				var3 = var3 + var2 + "/" + this.as_fld + "/" + this.af_fld + "/" + this.ai_fld + "?userHash=" + this.ar_fld;

				try {
					this.ax_fld = am(this, var3, (byte)-46);
				} catch (IOException var5) {
					this.an_fld = 1585665713;
				}

				this.an_fld = 1585665713;
				this.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ah() {
		if (this.au_fld != null) {
			qv.ye(this.au_fld, (byte)93);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean be(String var1) {
		xa(this, 2, var1);
		return true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void az(boolean var1) {
		this.aq_fld = var1;
		this.au_fld = new qv("crmsession", 1, 1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() throws UnsupportedEncodingException {
		if (this.ax_fld != null && this.ax_fld.av()) {
			if (this.ax_fld.av() && this.ax_fld.ae().ak() == 200 && this.af_fld.isEmpty()) {
				String var2 = qx.pj(this.ax_fld.ae(), (byte)0);
				if (var2.isEmpty()) {
					return;
				}

				this.af_fld = var2;
			}

			if (0 != this.aa_fld) {
				this.aw(-1688076025);
			}
		}
	}

	mx() {
		this.aw_fld = 2;
		this.ay_fld = "";
		this.as_fld = "";
		this.ar_fld = "";
		this.af_fld = "";
		this.al_fld = -6809936552125871409L;
		this.an_fld = 1585665713;
		this.aa_fld = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lmx;"
	)
	public static mx af() {
		return ae_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lmx;"
	)
	public static mx al() {
		return ae_fld;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	public static void eb(mx var0) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		} else if (null == var0.ax_fld) {
			if (!var0.af_fld.isEmpty() && 1 == var0.an_fld) {
				long var1 = lz.ak();
				long var3 = var1 - var0.al_fld;
				String var5 = var0.ay_fld;
				var5 = var5 + "session/close/" + var0.as_fld + "/" + var0.af_fld;
				if (var0.ar_fld.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + var0.ar_fld + "&sessionDuration=" + var3;
				}

				try {
					var0.ax_fld = am(var0, var5, (byte)103);
				} catch (IOException var7) {
					var0.an_fld = 115234211;
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	public void ax(int var1, String var2) {
		this.aa_fld = var1 * -1301510288;
		this.ai_fld = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void an(boolean var1) {
		this.aq_fld = var1;
		this.au_fld = new qv("crmsession", 1, 1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void aa(boolean var1) {
		this.aq_fld = var1;
		this.au_fld = new qv("crmsession", 1, 1);
	}

	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "(Lmx;ILjava/lang/String;)V"
	)
	public static void xa(mx var0, int var1, String var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aa_fld = var1;
		var0.ai_fld = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Ljava/lang/String;B)Lqw;"
	)
	public static qw am(mx var0, String var1, byte var2) throws IOException, MalformedURLException, UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		URL var3 = new URL(var1);
		qk var4 = new qk(var3, qe.ak_fld, var0.aq_fld);

		try {
			JSONObject var5 = new JSONObject();
			var4.ag(new vt(var5));
		} catch (Exception var6) {
		}

		return qv.xm(var0.au_fld, var4, 741408609);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void ai(boolean var1) {
		this.aq_fld = var1;
		this.au_fld = new qv("crmsession", 1, 1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	void aq(String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (2 != this.an_fld) {
			this.ay_fld = var1;
			this.as_fld = var2;
			this.ar_fld = var3;
			if (!this.ay_fld.endsWith("/")) {
				this.ay_fld = this.ay_fld + "/";
			}

			if (!this.as_fld.equals("")) {
				String var4 = this.ay_fld;
				var4 = var4 + "session/open/" + this.as_fld;
				if (this.ar_fld.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.ar_fld;

				try {
					this.ax_fld = am(this, var4, (byte)-29);
					this.al_fld = lz.ak();
				} catch (IOException var6) {
					this.ax_fld = null;
					this.as_fld = "";
					this.ar_fld = "";
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bz() throws UnsupportedEncodingException {
		if (null == this.ax_fld) {
			if (!this.af_fld.isEmpty() && 1 == this.an_fld) {
				long var1 = lz.ak();
				long var3 = var1 - this.al_fld;
				String var5 = this.ay_fld;
				var5 = var5 + "session/close/" + this.as_fld + "/" + this.af_fld;
				if (this.ar_fld.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.ar_fld + "&sessionDuration=" + var3;
				}

				try {
					this.ax_fld = am(this, var5, (byte)34);
				} catch (IOException var7) {
					this.an_fld = -1276685274;
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;"
	)
	static sf ak(int var0) {
		sf[] var2 = new sf[]{
			sf.ak_fld,
			sf.ag_fld,
			sf.az_fld,
			sf.av_fld,
			sf.ae_fld,
			sf.ah_fld,
			sf.aw_fld,
			sf.ay_fld,
			sf.as_fld,
			sf.ar_fld,
			sf.af_fld,
			sf.al_fld,
			sf.au_fld,
			sf.ax_fld,
			sf.an_fld,
			sf.aa_fld,
			sf.ai_fld
		};
		sf var3 = (sf)ka.ak(var2, var0);
		if (var3 == null) {
			var3 = sf.ak_fld;
		}

		return var3;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lmx;S)V"
	)
	public static void iv(mx var0, short var1) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		if (null == var0.ax_fld) {
			if (!var0.af_fld.isEmpty() && 1 == var0.an_fld) {
				long var2 = lz.ak();
				long var4 = var2 - var0.al_fld;
				String var6 = var0.ay_fld;
				var6 = var6 + "session/close/" + var0.as_fld + "/" + var0.af_fld;
				if (var0.ar_fld.isEmpty()) {
					var6 = var6 + "?sessionDuration=" + var4;
				} else {
					var6 = var6 + "?userHash=" + var0.ar_fld + "&sessionDuration=" + var4;
				}

				try {
					var0.ax_fld = am(var0, var6, (byte)32);
				} catch (IOException var8) {
					var0.an_fld = 1585665713;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ao() {
		if (this.au_fld != null) {
			qv.ye(this.au_fld, (byte)58);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() throws UnsupportedEncodingException {
		if (!this.af_fld.isEmpty()) {
			String var1 = "";
			switch (-1190252723 * this.aa_fld) {
				case 1:
					var1 = "events/click";
					break;
				case 2:
					var1 = "events/dismissed";
					break;
				case 3:
					var1 = "events/impression";
			}

			if (!this.ai_fld.isEmpty()) {
				String var2 = this.ay_fld;
				var2 = var2 + var1 + "/" + this.as_fld + "/" + this.af_fld + "/" + this.ai_fld + "?userHash=" + this.ar_fld;

				try {
					this.ax_fld = am(this, var2, (byte)-60);
				} catch (IOException var4) {
					this.an_fld = 1585665713;
				}

				this.an_fld = 1585665713;
				this.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bm() throws UnsupportedEncodingException {
		if (!this.af_fld.isEmpty()) {
			String var1 = "";
			switch (this.aa_fld) {
				case 1:
					var1 = "events/click";
					break;
				case 2:
					var1 = "events/dismissed";
					break;
				case 3:
					var1 = "events/impression";
			}

			if (!this.ai_fld.isEmpty()) {
				String var2 = this.ay_fld;
				var2 = var2 + var1 + "/" + this.as_fld + "/" + this.af_fld + "/" + this.ai_fld + "?userHash=" + this.ar_fld;

				try {
					this.ax_fld = am(this, var2, (byte)-39);
				} catch (IOException var4) {
					this.an_fld = 1585665713;
				}

				this.an_fld = 1585665713;
				this.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bd() throws UnsupportedEncodingException {
		if (!this.af_fld.isEmpty()) {
			String var1 = "";
			switch (this.aa_fld) {
				case 1:
					var1 = "events/click";
					break;
				case 2:
					var1 = "events/dismissed";
					break;
				case 3:
					var1 = "events/impression";
			}

			if (!this.ai_fld.isEmpty()) {
				String var2 = this.ay_fld;
				var2 = var2 + var1 + "/" + this.as_fld + "/" + this.af_fld + "/" + this.ai_fld + "?userHash=" + this.ar_fld;

				try {
					this.ax_fld = am(this, var2, (byte)-93);
				} catch (IOException var4) {
					this.an_fld = 1585665713;
				}

				this.an_fld = 1585665713;
				this.aa_fld = 0;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean as(String var1) {
		xa(this, 2, var1);
		return true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ad() throws UnsupportedEncodingException {
		if (this.ax_fld != null && this.ax_fld.av()) {
			if (this.ax_fld.av() && this.ax_fld.ae().ak() == 200 && this.af_fld.isEmpty()) {
				String var1 = qx.pj(this.ax_fld.ae(), (byte)0);
				if (var1.isEmpty()) {
					return;
				}

				this.af_fld = var1;
			}

			if (0 != this.aa_fld) {
				this.aw(-1354162072);
			}
		}
	}

	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	public static void so(mx var0) throws UnsupportedEncodingException {
		if (null == var0.ax_fld) {
			if (!var0.af_fld.isEmpty() && 1 == var0.an_fld) {
				long var1 = lz.ak();
				long var3 = var1 - var0.al_fld;
				String var5 = var0.ay_fld;
				var5 = var5 + "session/close/" + var0.as_fld + "/" + var0.af_fld;
				if (var0.ar_fld.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + var0.ar_fld + "&sessionDuration=" + var3;
				}

				try {
					var0.ax_fld = am(var0, var5, (byte)48);
				} catch (IOException var7) {
					var0.an_fld = 1585665713;
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean bs(String var1) {
		xa(this, 2, var1);
		return true;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void br() throws UnsupportedEncodingException {
		if (this.ax_fld != null && this.ax_fld.av()) {
			if (this.ax_fld.av() && this.ax_fld.ae().ak() == 1460918061 && this.af_fld.isEmpty()) {
				String var1 = qx.pj(this.ax_fld.ae(), (byte)0);
				if (var1.isEmpty()) {
					return;
				}

				this.af_fld = var1;
			}

			if (0 != this.aa_fld) {
				this.aw(-1871616205);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	void av(String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (2 != this.an_fld) {
			this.ay_fld = var1;
			this.as_fld = var2;
			this.ar_fld = var3;
			if (!this.ay_fld.endsWith("/")) {
				this.ay_fld = this.ay_fld + "/";
			}

			if (!this.as_fld.equals("")) {
				String var5 = this.ay_fld;
				var5 = var5 + "session/open/" + this.as_fld;
				if (this.ar_fld.equals("")) {
				}

				var5 = var5 + "?userHash=" + this.ar_fld;

				try {
					this.ax_fld = am(this, var5, (byte)-41);
					this.al_fld = lz.ak();
				} catch (IOException var7) {
					this.ax_fld = null;
					this.as_fld = "";
					this.ar_fld = "";
				}
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lqw;"
	)
	qw bk(String var1) throws IOException, MalformedURLException, UnsupportedEncodingException {
		URL var2 = new URL(var1);
		qk var3 = new qk(var2, qe.ak_fld, this.aq_fld);

		try {
			JSONObject var4 = new JSONObject();
			var3.ag(new vt(var4));
		} catch (Exception var5) {
		}

		return qv.xm(this.au_fld, var3, 741408609);
	}

	@ObfuscatedName("xl")
	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	public static void xl(mx var0) {
		if (var0.au_fld != null) {
			qv.ye(var0.au_fld, (byte)36);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V"
	)
	public void ag(int var1, String var2, int var3) {
		this.an_fld = var1 * -1198169673;
		this.af_fld = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	public void ae(short var1) throws UnsupportedEncodingException {
		if (null == this.ax_fld) {
			if (!this.ar_fld.isEmpty() && 1 == this.an_fld) {
				long var2 = lz.ak();
				long var4 = var2 - this.al_fld;
				String var6 = this.ay_fld;
				var6 = var6 + "session/close/" + this.as_fld + "/" + this.as_fld;
				if (this.as_fld.isEmpty()) {
					var6 = var6 + "?sessionDuration=" + var4;
				} else {
					var6 = var6 + "?userHash=" + this.ai_fld + "&sessionDuration=" + var4;
				}

				try {
					this.ax_fld = am(this, var6, (byte)32);
				} catch (IOException var8) {
					this.an_fld = 1585665713;
				}
			}
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)Z"
	)
	public static boolean mr(dw var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 0 && var1 <= 4 ? (var0.ay_fld & 1 << var1) != 0 : true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ac() throws UnsupportedEncodingException {
		if (null == this.ax_fld) {
			if (!this.ar_fld.isEmpty() && 1 == this.an_fld) {
				long var1 = lz.ak();
				long var3 = var1 - this.al_fld;
				String var5 = this.ai_fld;
				var5 = var5 + "session/close/" + this.ar_fld + "/" + this.as_fld;
				if (this.af_fld.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.as_fld + "&sessionDuration=" + var3;
				}

				try {
					this.ax_fld = am(this, var5, (byte)103);
				} catch (IOException var7) {
					this.aa_fld = 115234211;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public static void aa(mx var0, String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (2 != var0.an_fld) {
			var0.ay_fld = var1;
			var0.as_fld = var2;
			var0.ar_fld = var3;
			if (!var0.ay_fld.endsWith("/")) {
				var0.ay_fld = var0.ay_fld + "/";
			}

			if (!var0.as_fld.equals("")) {
				String var4 = var0.ay_fld;
				var4 = var4 + "session/open/" + var0.as_fld;
				if (var0.ar_fld.equals("")) {
				}

				var4 = var4 + "?userHash=" + var0.ar_fld;

				try {
					var0.ax_fld = am(var0, var4, (byte)1);
					var0.al_fld = lz.ak();
				} catch (IOException var6) {
					var0.ax_fld = null;
					var0.as_fld = "";
					var0.ar_fld = "";
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lqw;"
	)
	qw ar(String var1, byte var2) throws MalformedURLException, IOException, UnsupportedEncodingException {
		URL var3 = new URL(var1);
		qk var4 = new qk(var3, qe.ag_fld, this.aq_fld);

		try {
			JSONObject var5 = new JSONObject();
			var4.ag(new vt(var5));
		} catch (Exception var6) {
		}

		return qv.xm(this.au_fld, var4, 741408609);
	}
}
