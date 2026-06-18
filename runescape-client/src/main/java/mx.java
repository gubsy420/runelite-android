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
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -1781324348075015215L
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
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2139934127
	)
	int aa_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 475548679
	)
	int an_fld;
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

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Ljava/lang/String;I)Z"
	)
	public static boolean jg(mx var0, String var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag(2, var1);
		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V"
	)
	public void ag(int var1, String var2) {
		this.an_fld = var1;
		this.ai_fld = var2;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean be(String var1) {
		this.ag(2, var1);
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aw(int var1) throws UnsupportedEncodingException {
		if (!this.af_fld.isEmpty()) {
			String var2 = "";
			switch (this.an_fld) {
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
					this.ax_fld = this.ar(var3);
				} catch (IOException var5) {
					this.aa_fld = 1585665713;
				}

				this.aa_fld = 1585665713;
				this.an_fld = 0;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	public void ae() throws UnsupportedEncodingException {
		if (null == this.ax_fld) {
			if (!this.af_fld.isEmpty() && 1 == this.aa_fld) {
				long var2 = lz.ak();
				long var4 = var2 - this.al_fld;
				String var6 = this.ay_fld;
				var6 = var6 + "session/close/" + this.as_fld + "/" + this.af_fld;
				if (this.ar_fld.isEmpty()) {
					var6 = var6 + "?sessionDuration=" + var4;
				} else {
					var6 = var6 + "?userHash=" + this.ar_fld + "&sessionDuration=" + var4;
				}

				try {
					this.ax_fld = this.ar(var6);
				} catch (IOException var8) {
					this.aa_fld = 1585665713;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ah() {
		if (this.au_fld != null) {
			this.au_fld.az();
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean bs(String var1) {
		this.ag(2, var1);
		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ay() throws UnsupportedEncodingException {
		if (this.ax_fld != null && this.ax_fld.av()) {
			if (this.ax_fld.av() && this.ax_fld.ae().ak() == 200 && this.af_fld.isEmpty()) {
				String var2 = this.ax_fld.ae().av();
				if (var2.isEmpty()) {
					return;
				}

				this.af_fld = var2;
			}

			if (0 != this.an_fld) {
				this.aw(-1688076025);
			}
		}
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "(Lmx;ZB)V"
	)
	public static void qj(mx var0, boolean var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.aq_fld = var1;
			var0.au_fld = new qv("crmsession", 1, 1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ab() throws UnsupportedEncodingException {
		if (null == this.ax_fld) {
			if (!this.af_fld.isEmpty() && 1 == this.aa_fld) {
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
					this.ax_fld = this.ar(var5);
				} catch (IOException var7) {
					this.aa_fld = 1585665713;
				}
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
		this.aa_fld = 1585665713;
		this.an_fld = 0;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	public static void no(mx var0) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ax_fld != null && var0.ax_fld.av()) {
			if (var0.ax_fld.av() && var0.ax_fld.ae().ak() == 200 && var0.af_fld.isEmpty()) {
				String var1 = var0.ax_fld.ae().av();
				if (var1.isEmpty()) {
					return;
				}

				var0.af_fld = var1;
			}

			if (0 != var0.an_fld) {
				var0.aw(-1354162072);
			}
		}
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	public void ax(int var1, String var2) {
		this.an_fld = var1 * 682636216;
		this.ai_fld = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;)V"
	)
	public void au(int var1, String var2) {
		this.an_fld = var1 * -1301510288;
		this.ai_fld = var2;
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	public static void vf(mx var0) throws UnsupportedEncodingException {
		if (null == var0.ax_fld) {
			if (!var0.af_fld.isEmpty() && 1 == var0.aa_fld) {
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
					var0.ax_fld = var0.ar(var5);
				} catch (IOException var7) {
					var0.aa_fld = -1276685274;
				}
			}
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lmx;)V"
	)
	public static void lg(mx var0) {
		if (var0.au_fld != null) {
			var0.au_fld.az();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void an(boolean var1) {
		this.aq_fld = var1;
		this.au_fld = new qv("crmsession", 1, 1);
	}

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public static void ra(mx var0, String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		if (2 != var0.aa_fld) {
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
					var0.ax_fld = var0.ar(var4);
					var0.al_fld = lz.ak();
				} catch (IOException var6) {
					var0.ax_fld = null;
					var0.as_fld = "";
					var0.ar_fld = "";
				}
			}
		}
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	public static void pc(mx var0, String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (2 != var0.aa_fld) {
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
					var0.ax_fld = var0.ar(var4);
					var0.al_fld = lz.ak();
				} catch (IOException var6) {
					var0.ax_fld = null;
					var0.as_fld = "";
					var0.ar_fld = "";
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void aa(boolean var1) {
		this.aq_fld = var1;
		this.au_fld = new qv("crmsession", 1, 1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Z)V"
	)
	public void ai(boolean var1) {
		this.aq_fld = var1;
		this.au_fld = new qv("crmsession", 1, 1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ad() throws UnsupportedEncodingException {
		if (null == this.ax_fld) {
			if (!this.af_fld.isEmpty() && 1 == this.aa_fld) {
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
					this.ax_fld = this.ar(var5);
				} catch (IOException var7) {
					this.aa_fld = 115234211;
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ac() {
		if (this.au_fld != null) {
			this.au_fld.az();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() throws UnsupportedEncodingException {
		if (!this.af_fld.isEmpty()) {
			String var1 = "";
			switch (-1190252723 * this.an_fld) {
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
					this.ax_fld = this.ar(var2);
				} catch (IOException var4) {
					this.aa_fld = 1585665713;
				}

				this.aa_fld = 1585665713;
				this.an_fld = 0;
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
			switch (this.an_fld) {
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
					this.ax_fld = this.ar(var2);
				} catch (IOException var4) {
					this.aa_fld = 1585665713;
				}

				this.aa_fld = 1585665713;
				this.an_fld = 0;
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
			switch (this.an_fld) {
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
					this.ax_fld = this.ar(var2);
				} catch (IOException var4) {
					this.aa_fld = 1585665713;
				}

				this.aa_fld = 1585665713;
				this.an_fld = 0;
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Z"
	)
	public boolean bh(String var1) {
		this.ag(2, var1);
		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
	)
	void av(String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (2 != this.aa_fld) {
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
					this.ax_fld = this.ar(var5);
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

		return this.au_fld.ag(var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lqw;"
	)
	qw ar(String var1) throws IOException, MalformedURLException, UnsupportedEncodingException {
		URL var3 = new URL(var1);
		qk var4 = new qk(var3, qe.ak_fld, this.aq_fld);

		try {
			JSONObject var5 = new JSONObject();
			var4.ag(new vt(var5));
		} catch (Exception var6) {
		}

		return this.au_fld.ag(var4);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)V"
	)
	public void az(boolean var1, byte var2) {
		this.aq_fld = var1;
		this.au_fld = new qv("crmsession", 1, 1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	void am(String var1, String var2, String var3) throws UnsupportedEncodingException {
		if (2 != this.an_fld) {
			this.as_fld = var1;
			this.af_fld = var2;
			this.ar_fld = var3;
			if (!this.ay_fld.endsWith("/")) {
				this.ai_fld = this.af_fld + "/";
			}

			if (!this.as_fld.equals("")) {
				String var4 = this.ay_fld;
				var4 = var4 + "session/open/" + this.af_fld;
				if (this.as_fld.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.ar_fld;

				try {
					this.ax_fld = this.ar(var4);
					this.al_fld = lz.ak();
				} catch (IOException var6) {
					this.ax_fld = null;
					this.ar_fld = "";
					this.as_fld = "";
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z"
	)
	public boolean as(String var1, int var2) {
		this.ag(2, var1);
		return true;
	}
}
