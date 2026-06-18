import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qt")
public class qt {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map av_fld = new HashMap();
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	public static String ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map ae_fld = new HashMap();
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljava/text/DecimalFormat;"
	)
	DecimalFormat ah_fld = new DecimalFormat();
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cx_fld;

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lvp;F)V"
	)
	void bt(vp var1, float var2) {
		this.ae_fld.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		fd(this, 1094302496);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V"
	)
	public void ak(HttpsURLConnection var1) {
		Iterator var3 = this.av_fld.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)(Entry)var3.next();
			var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	String au() {
		ArrayList var2 = new ArrayList(this.ae_fld.entrySet());
		Collections.sort(var2, new qs(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)(Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((vp)var5.getKey()).ak());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = this.ah_fld.format(var6);
				var3.append(";q=").append(var7);
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Lqj;Ljava/lang/String;I)V"
	)
	public static void oi(qt var0, qj var1, String var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		String var4 = String.format("%s %s", (Object[])(new Object[]{var1.ak(), var2}));
		kn(var0, "Authorization", var4, (byte)96);
	}

	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Ljavax/net/ssl/HttpsURLConnection;)V"
	)
	public static void qk(qt var0, HttpsURLConnection var1) {
		Iterator var2 = var0.av_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V"
	)
	public void ay(vp var1) {
		this.av_fld.put("Content-Type", var1.ak());
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void bd(String var1) {
		oi(this, qj.ak_fld, var1, 1790880503);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void ab(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.av_fld.put(var1, null != var2 ? var2 : "");
		}
	}

	public qt() {
		this.ah_fld.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public void bh(vp var1) {
		this.av_fld.put("Content-Type", var1.ak());
	}

	@ObfuscatedName("yb")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Ljava/lang/String;B)V"
	)
	public static void yb(qt var0, String var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			oi(var0, qj.ak_fld, var1, 1385298460);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;)V"
	)
	public void an(HttpsURLConnection var1) {
		Iterator var2 = this.av_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	public void ah(String var1, byte var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 >= 6) {
				return;
			}

			this.av_fld.remove(var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;)V"
	)
	public void aa(HttpsURLConnection var1) {
		Iterator var2 = this.av_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public void bx(vp var1) {
		this.af(var1, 1.0F);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public void bk(vp var1) {
		this.av_fld.put("Content-Type", var1.ak());
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void ad(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.av_fld.put(var1, null != var2 ? var2 : "");
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void ao(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.av_fld.put(var1, null != var2 ? var2 : "");
		}
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Lcl;Lcv;)V"
	)
	public static void zu(cl var0, cv var1) {
		var0.ak_fld.add(var1);
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Lvp;)V"
	)
	public static void mz(qt var0, vp var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af(var1, 1.0F);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void br(String var1) {
		oi(this, qj.ag_fld, var1, -1155676565);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;)V"
	)
	public void ap(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.av_fld.put(var1, null != var2 ? var2 : "");
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void at(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.av_fld.remove(var1);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void ac(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.av_fld.remove(var1);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void bm(String var1) {
		oi(this, qj.ak_fld, var1, 1505958397);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void be(String var1) {
		oi(this, qj.ag_fld, var1, -183241274);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public void bz(String var1) {
		oi(this, qj.ak_fld, var1, 1255038985);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvp;FI)V"
	)
	void af(vp var1, float var2) {
		this.ae_fld.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		fd(this, -942108932);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;"
	)
	public Map ag() {
		return this.av_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;)V"
	)
	public void ai(HttpsURLConnection var1) {
		Iterator var2 = this.av_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V"
	)
	public static void mz(qt var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld.remove("Content-Type");
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V"
	)
	public void ar(vp var1) {
		this.af(var1, 1.0F);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void bf() {
		this.av_fld.remove("Content-Type");
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public void by(vp var1) {
		this.af(var1, 1.0F);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Map;"
	)
	public Map aq() {
		return this.av_fld;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lvp;F)V"
	)
	void bo(vp var1, float var2) {
		this.ae_fld.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		fd(this, -1389332873);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lvp;F)V"
	)
	void bp(vp var1, float var2) {
		this.ae_fld.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		fd(this, -97894378);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	public void aw(String var1) {
		oi(this, qj.ag_fld, var1, 602689305);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bv() {
		this.av_fld.remove("Accept");
		if (!this.ae_fld.isEmpty()) {
			this.av_fld.put("Accept", this.au());
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String bi() {
		ArrayList var1 = new ArrayList(this.ae_fld.entrySet());
		Collections.sort(var1, new qs(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)(Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((vp)var4.getKey()).ak());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.ah_fld.format(var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Lvp;)V"
	)
	public static void rt(qt var0, vp var1) {
		var0.av_fld.put("Content-Type", var1.ak());
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String bu() {
		ArrayList var1 = new ArrayList(this.ae_fld.entrySet());
		Collections.sort(var1, new qs(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)(Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((vp)var4.getKey()).ak());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.ah_fld.format(var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V"
	)
	public static void fd(qt var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld.remove("Accept");
		if (!var0.ae_fld.isEmpty()) {
			var0.av_fld.put("Accept", var0.au());
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V"
	)
	public void az(String var1, String var2, byte var3) {
		if (var1 != null) {
			if (var3 != 96) {
				return;
			}

			if (!var1.isEmpty()) {
				if (var3 != 96) {
					return;
				}

				this.av_fld.put(var1, null != var2 ? var2 : "");
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	public void av(String var1, byte var2) {
		oi(this, qj.ag_fld, var1, 1385298460);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqj;Ljava/lang/String;I)V"
	)
	void ae(qj var1, String var2, int var3) {
		String var4 = String.format("%s %s", (Object[])(new Object[]{var1.ak(), var2}));
		kn(this, "Authorization", var4, (byte)96);
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Ljava/lang/String;Ljava/lang/String;B)V"
	)
	public static void kn(qt var0, String var1, String var2, byte var3) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			if (var3 != 96) {
				return;
			}

			if (!var1.isEmpty()) {
				if (var3 != 96) {
					return;
				}

				var0.av_fld.put(var1, null != var2 ? var2 : "");
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void as(int var1) {
		this.av_fld.remove("Content-Type");
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void al(int var1) {
		this.av_fld.remove("Accept");
		if (!this.av_fld.isEmpty()) {
			this.av_fld.put("Accept", this.au());
		}
	}
}
