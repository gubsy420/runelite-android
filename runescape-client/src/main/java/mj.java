import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("mj")
public class mj {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList ag_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map ay_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String as_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[F"
	)
	float[] ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList az_fld = new ArrayList();
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map aw_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ae_fld;
	@ObfuscatedGetter(
		intValue = 1723986463
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aa_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String az() {
		return this.ae_fld;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	void bt(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); var3++) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.ay_fld.put(var2[var3], var4);
			} catch (Exception var7) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.ay_fld.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.ay_fld.put(var2[var3], 0);
					} else {
						this.aw_fld.put(var2[var3], var5);
					}
				} catch (Exception var6) {
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;)[F"
	)
	static float[] ax(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0);
			var2[1] = (float)var3.optDouble(1, 0.0);
			var2[2] = (float)var3.optDouble(2, 1.0);
			var2[3] = (float)var3.optDouble(3, 1.0);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ab() {
		this.as_fld = null;
		this.ah_fld[0] = 0.0F;
		this.ah_fld[1] = 0.0F;
		this.ah_fld[2] = 1.0F;
		this.ah_fld[3] = 1.0F;
		this.az_fld.clear();
		this.av_fld.clear();
		this.ag_fld.clear();
		this.ay_fld.clear();
		this.aw_fld.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILde;)Z"
	)
	boolean ah(JSONObject var1, int var2, de var3) {
		JSONObject var5 = var1;
		if (var2 < 2) {
			try {
				var5 = var5.getJSONObject("message");
			} catch (Exception var14) {
				this.ae();
				return false;
			}

			try {
				qo(this, var5.getJSONArray("images"), var3, (byte)65);
			} catch (Exception var13) {
				this.av_fld.clear();
			}

			try {
				this.as(var5.getJSONArray("labels"));
			} catch (Exception var12) {
				this.ag_fld.clear();
			}
		} else {
			try {
				this.ay(var5.getJSONObject("image"), var3);
			} catch (Exception var11) {
				this.av_fld.clear();
			}

			try {
				this.ar(var5.getJSONObject("label"));
			} catch (Exception var10) {
				this.ag_fld.clear();
			}
		}

		try {
			this.af(var5.getJSONObject("behaviour"), -1201017866);
		} catch (Exception var9) {
			this.as_fld = null;
			this.ah_fld[0] = 0.0F;
			this.ah_fld[1] = 0.0F;
			this.ah_fld[2] = 1.0F;
			this.ah_fld[3] = 1.0F;
			this.az_fld.clear();
		}

		try {
			JSONObject var6 = var5.optJSONObject("meta");
			if (var6 != null) {
				to(this, var5.getJSONObject("meta"), -298560643);
			}
		} catch (Exception var8) {
			this.ay_fld.clear();
			this.aw_fld.clear();
		}

		if (2 == var2) {
			try {
				this.ae_fld = var5.getString("id");
				this.ar_fld = Integer.parseInt(var5.getString("priority"));
			} catch (Exception var7) {
			}
		}

		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lde;)V"
	)
	void ay(JSONObject var1, de var2) throws JSONException {
		try {
			lq var4 = new lq(this);
			var4.ak_fld = var2.as(new URL(var1.getString("src")), (byte)83);
			var4.ag_fld = oy.ak(var1, "placement");
			this.av_fld.add(var4);
		} catch (MalformedURLException var5) {
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;)V"
	)
	void as(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var3 = 0; var3 < var1.length(); var3++) {
				JSONObject var4 = var1.getJSONObject(var3);
				mr var5 = new mr(this);
				var5.av_fld = var4.getString("text");
				var5.ah_fld = iz.ag(var4.getString("align_x"));
				var5.aw_fld = iz.ag(var4.getString("align_y"));
				var5.ay_fld = var4.getInt("font");
				var5.ae_fld = oy.ak(var4, "placement");
				this.ag_fld.add(var5);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	void ar(JSONObject var1) throws JSONException {
		mr var3 = new mr(this);
		var3.av_fld = var1.optString("text");
		var3.ah_fld = iz.ag(var1.optString("align_x"));
		var3.aw_fld = iz.ag(var1.optString("align_y"));
		var3.ay_fld = var1.optInt("font");
		var3.ae_fld = oy.ak(var1, "placement");
		this.ag_fld.add(var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;)[F"
	)
	static float[] au(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0);
			var2[1] = (float)var3.optDouble(1, 0.0);
			var2[2] = (float)var3.optDouble(2, 1.0);
			var2[3] = (float)var3.optDouble(3, 1.0);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lorg/json/JSONArray;)V"
	)
	public static void yd(mj var0, JSONArray var1) throws JSONException {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var1) {
			for (int var2 = 0; var2 < var1.length(); var2++) {
				JSONObject var3 = var1.getJSONObject(var2);
				mr var4 = new mr(var0);
				var4.av_fld = var3.getString("text");
				var4.ah_fld = iz.ag(var3.getString("align_x"));
				var4.aw_fld = iz.ag(var3.getString("align_y")) * -1852004561;
				var4.ay_fld = var3.getInt("font");
				var4.ae_fld = oy.ak(var3, "placement");
				var0.ag_fld.add(var4);
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String aq() {
		return this.ae_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILde;)Z"
	)
	boolean ac(JSONObject var1, int var2, de var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.ae();
				return false;
			}

			try {
				qo(this, var4.getJSONArray("images"), var3, (byte)101);
			} catch (Exception var12) {
				this.av_fld.clear();
			}

			try {
				this.as(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.ag_fld.clear();
			}
		} else {
			try {
				this.ay(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.av_fld.clear();
			}

			try {
				this.ar(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.ag_fld.clear();
			}
		}

		try {
			this.af(var4.getJSONObject("behaviour"), -1201017866);
		} catch (Exception var8) {
			this.as_fld = null;
			this.ah_fld[0] = 0.0F;
			this.ah_fld[1] = 0.0F;
			this.ah_fld[2] = 1.0F;
			this.ah_fld[3] = 1.0F;
			this.az_fld.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				to(this, var4.getJSONObject("meta"), -298560643);
			}
		} catch (Exception var7) {
			this.ay_fld.clear();
			this.aw_fld.clear();
		}

		if (2 == var2) {
			try {
				this.ae_fld = var4.getString("id");
				this.ar_fld = Integer.parseInt(var4.getString("priority")) * 145105418;
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;)[F"
	)
	static float[] an(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0);
			var2[1] = (float)var3.optDouble(1, 0.0);
			var2[2] = (float)var3.optDouble(2, 1.0);
			var2[3] = (float)var3.optDouble(3, 1.0);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)I"
	)
	static int aa(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String ai() {
		return this.ae_fld;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lorg/json/JSONObject;)V"
	)
	public static void eb(mj var0, JSONObject var1) throws JSONException {
		if (var0 == null) {
			var0.getClass();
		}

		mr var2 = new mr(var0);
		var2.av_fld = var1.optString("text");
		var2.ah_fld = iz.ag(var1.optString("align_x"));
		var2.aw_fld = iz.ag(var1.optString("align_y")) * -1318097456;
		var2.ay_fld = var1.optInt("font");
		var2.ae_fld = oy.ak(var1, "placement");
		var0.ag_fld.add(var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av() {
		return this.ar_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String am() {
		return this.ae_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ad() {
		return this.ar_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;)V"
	)
	void bh(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var2 = 0; var2 < var1.length(); var2++) {
				JSONObject var3 = var1.getJSONObject(var2);
				mr var4 = new mr(this);
				var4.av_fld = var3.getString("text");
				var4.ah_fld = iz.ag(var3.getString("align_x")) * -1612141016;
				var4.aw_fld = iz.ag(var3.getString("align_y")) * 1264343899;
				var4.ay_fld = var3.getInt("font");
				var4.ae_fld = oy.ak(var3, "placement");
				this.ag_fld.add(var4);
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILde;)Z"
	)
	boolean ap(JSONObject var1, int var2, de var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.ae();
				return false;
			}

			try {
				qo(this, var4.getJSONArray("images"), var3, (byte)45);
			} catch (Exception var12) {
				this.av_fld.clear();
			}

			try {
				this.as(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.ag_fld.clear();
			}
		} else {
			try {
				this.ay(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.av_fld.clear();
			}

			try {
				this.ar(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.ag_fld.clear();
			}
		}

		try {
			this.af(var4.getJSONObject("behaviour"), -1201017866);
		} catch (Exception var8) {
			this.as_fld = null;
			this.ah_fld[0] = 0.0F;
			this.ah_fld[1] = 0.0F;
			this.ah_fld[2] = 1.0F;
			this.ah_fld[3] = 1.0F;
			this.az_fld.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				to(this, var4.getJSONObject("meta"), -298560643);
			}
		} catch (Exception var7) {
			this.ay_fld.clear();
			this.aw_fld.clear();
		}

		if (2 == var2) {
			try {
				this.ae_fld = var4.getString("id");
				this.ar_fld = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILde;)Z"
	)
	boolean at(JSONObject var1, int var2, de var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.ae();
				return false;
			}

			try {
				qo(this, var4.getJSONArray("images"), var3, (byte)19);
			} catch (Exception var12) {
				this.av_fld.clear();
			}

			try {
				this.as(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.ag_fld.clear();
			}
		} else {
			try {
				this.ay(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.av_fld.clear();
			}

			try {
				this.ar(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.ag_fld.clear();
			}
		}

		try {
			this.af(var4.getJSONObject("behaviour"), -1201017866);
		} catch (Exception var8) {
			this.as_fld = null;
			this.ah_fld[0] = 0.0F;
			this.ah_fld[1] = 0.0F;
			this.ah_fld[2] = 1.0F;
			this.ah_fld[3] = 1.0F;
			this.az_fld.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				to(this, var4.getJSONObject("meta"), -298560643);
			}
		} catch (Exception var7) {
			this.ay_fld.clear();
			this.aw_fld.clear();
		}

		if (2 == var2) {
			try {
				this.ae_fld = var4.getString("id");
				this.ar_fld = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lorg/json/JSONObject;I)V"
	)
	public static void to(mj var0, JSONObject var1, int var2) throws JSONException {
		if (var0 == null) {
			var0.getClass();
		} else {
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); var4++) {
				if (var2 != -298560643) {
					return;
				}

				try {
					int var5 = var1.optInt(var3[var4]);
					var0.ay_fld.put(var3[var4], var5);
				} catch (Exception var8) {
					try {
						String var6 = var1.optString(var3[var4]);
						if (var6.equals("true")) {
							var0.ay_fld.put(var3[var4], 1);
						} else if (var6.equals("false")) {
							var0.ay_fld.put(var3[var4], 0);
						} else {
							var0.aw_fld.put(var3[var4], var6);
						}
					} catch (Exception var7) {
					}
				}
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lde;)V"
	)
	void bd(JSONObject var1, de var2) throws JSONException {
		try {
			lq var3 = new lq(this);
			var3.ak_fld = var2.as(new URL(var1.getString("src")), (byte)56);
			var3.ag_fld = oy.ak(var1, "placement");
			this.av_fld.add(var3);
		} catch (MalformedURLException var4) {
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lde;)V"
	)
	void aj(JSONArray var1, de var2) throws JSONException {
		if (null != var1) {
			for (int var3 = 0; var3 < var1.length(); var3++) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					lq var5 = new lq(this);
					var5.ak_fld = var2.as(new URL(var4.getString("src")), (byte)73);
					var5.ag_fld = oy.ak(var4, "placement");
					this.av_fld.add(var5);
				} catch (MalformedURLException var6) {
				}
			}
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;)V"
	)
	void by(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var2 = 0; var2 < var1.length(); var2++) {
				JSONObject var3 = var1.getJSONObject(var2);
				mr var4 = new mr(this);
				var4.av_fld = var3.getString("text");
				var4.ah_fld = iz.ag(var3.getString("align_x")) * 306809083;
				var4.aw_fld = iz.ag(var3.getString("align_y"));
				var4.ay_fld = var3.getInt("font") * 1000224902;
				var4.ae_fld = oy.ak(var3, "placement");
				this.ag_fld.add(var4);
			}
		}
	}

	mj() {
		this.av_fld = new ArrayList();
		this.ag_fld = new ArrayList();
		this.as_fld = null;
		this.ah_fld = new float[4];
		this.ay_fld = new HashMap();
		this.aw_fld = new HashMap();
		this.ar_fld = 0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lde;)V"
	)
	void bz(JSONObject var1, de var2) throws JSONException {
		try {
			lq var3 = new lq(this);
			var3.ak_fld = var2.as(new URL(var1.getString("src")), (byte)18);
			var3.ag_fld = oy.ak(var1, "placement");
			this.av_fld.add(var3);
		} catch (MalformedURLException var4) {
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([F[I)V"
	)
	public static void ar(float[] var0, int[] var1) {
		uv.af(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lde;)V"
	)
	void be(JSONObject var1, de var2) throws JSONException {
		try {
			lq var3 = new lq(this);
			var3.ak_fld = var2.as(new URL(var1.getString("src")), (byte)23);
			var3.ag_fld = oy.ak(var1, "placement");
			this.av_fld.add(var3);
		} catch (MalformedURLException var4) {
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lde;)V"
	)
	void br(JSONObject var1, de var2) throws JSONException {
		try {
			lq var3 = new lq(this);
			var3.ak_fld = var2.as(new URL(var1.getString("src")), (byte)41);
			var3.ag_fld = oy.ak(var1, "placement");
			this.av_fld.add(var3);
		} catch (MalformedURLException var4) {
		}
	}

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lorg/json/JSONArray;)V"
	)
	public static void rl(mj var0, JSONArray var1) throws JSONException {
		if (var0 == null) {
			var0.getClass();
		}

		if (null != var1) {
			for (int var2 = 0; var2 < var1.length(); var2++) {
				JSONObject var3 = var1.getJSONObject(var2);
				mr var4 = new mr(var0);
				var4.av_fld = var3.getString("text");
				var4.ah_fld = iz.ag(var3.getString("align_x"));
				var4.aw_fld = iz.ag(var3.getString("align_y"));
				var4.ay_fld = var3.getInt("font");
				var4.ae_fld = oy.ak(var3, "placement");
				var0.ag_fld.add(var4);
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;)V"
	)
	void bj(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var2 = 0; var2 < var1.length(); var2++) {
				JSONObject var3 = var1.getJSONObject(var2);
				mr var4 = new mr(this);
				var4.av_fld = var3.getString("text");
				var4.ah_fld = iz.ag(var3.getString("align_x"));
				var4.aw_fld = iz.ag(var3.getString("align_y"));
				var4.ay_fld = var3.getInt("font");
				var4.ae_fld = oy.ak(var3, "placement");
				this.ag_fld.add(var4);
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;)V"
	)
	void bf(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var2 = 0; var2 < var1.length(); var2++) {
				JSONObject var3 = var1.getJSONObject(var2);
				mr var4 = new mr(this);
				var4.av_fld = var3.getString("text");
				var4.ah_fld = iz.ag(var3.getString("align_x"));
				var4.aw_fld = iz.ag(var3.getString("align_y"));
				var4.ay_fld = var3.getInt("font");
				var4.ae_fld = oy.ak(var3, "placement");
				this.ag_fld.add(var4);
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	void bv(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); var3++) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.ay_fld.put(var2[var3], var4);
			} catch (Exception var7) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.ay_fld.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.ay_fld.put(var2[var3], 0);
					} else {
						this.aw_fld.put(var2[var3], var5);
					}
				} catch (Exception var6) {
				}
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	void bo(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.ah_fld = oy.ak(var1, "clickbounds");
			this.as_fld = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); var3++) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.az_fld.add(new ls(this, var2[var3], var4));
					} catch (Exception var7) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.az_fld.add(new ls(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.az_fld.add(new ls(this, var2[var3], 0));
							} else {
								this.az_fld.add(new ly(this, var2[var3], var5));
							}
						} catch (Exception var6) {
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	void bp(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); var3++) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.ay_fld.put(var2[var3], var4);
			} catch (Exception var7) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.ay_fld.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.ay_fld.put(var2[var3], 0);
					} else {
						this.aw_fld.put(var2[var3], var5);
					}
				} catch (Exception var6) {
				}
			}
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lde;)V"
	)
	void bm(JSONArray var1, de var2) throws JSONException {
		if (null != var1) {
			for (int var3 = 0; var3 < var1.length(); var3++) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					lq var5 = new lq(this);
					var5.ak_fld = var2.as(new URL(var4.getString("src")), (byte)12);
					var5.ag_fld = oy.ak(var4, "placement");
					this.av_fld.add(var5);
				} catch (MalformedURLException var6) {
				}
			}
		}
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lorg/json/JSONArray;Lde;B)V"
	)
	public static void qo(mj var0, JSONArray var1, de var2, byte var3) throws JSONException {
		if (var0 == null) {
			var0.getClass();
		} else if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); var4++) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					lq var6 = new lq(var0);
					var6.ak_fld = var2.as(new URL(var5.getString("src")), (byte)30);
					var6.ag_fld = oy.ak(var5, "placement");
					var0.av_fld.add(var6);
				} catch (MalformedURLException var7) {
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ae() {
		this.as_fld = null;
		this.ah_fld[0] = 0.0F;
		this.ah_fld[1] = 0.0F;
		this.ah_fld[2] = 1.0F;
		this.ah_fld[3] = 1.0F;
		this.az_fld.clear();
		this.av_fld.clear();
		this.ag_fld.clear();
		this.ay_fld.clear();
		this.aw_fld.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Luy;III)V"
	)
	static void an(uy var0, int var1, int var2, int var3) {
		if (!ej.bk_fld) {
			byte var5 = 50;
			int var6 = fh.az();
			int var7 = var5 * (ej.bs_fld - var1) / var3;
			int var8 = (ej.bh_fld - var2) * var5 / var3;
			int var9 = (ej.bs_fld - var1) * var6 / var3;
			int var10 = var6 * (ej.bh_fld - var2) / var3;
			uy var11 = cv.ag(var0);
			var11.aq();
			float[] var12 = new float[3];
			uy.vt(var11, var7, var8, var5, var12, 1304867146);
			var7 = (int)var12[0];
			var8 = (int)var12[1];
			int var13 = (int)var12[2];
			uy.vt(var11, var9, var10, var6, var12, 1250581457);
			var9 = (int)var12[0];
			var10 = (int)var12[1];
			var6 = (int)var12[2];
			uy.vt(var11, 0.0F, 0.0F, 0.0F, var12, 660712816);
			gz.bj_fld = -141247257 * (int)var12[0];
			wk.bf_fld = (int)var12[1];
			bv.by_fld = (int)var12[2];
			var7 -= gz.bj_fld;
			var8 -= wk.bf_fld;
			var13 -= bv.by_fld;
			var9 -= gz.bj_fld;
			var10 -= wk.bf_fld;
			var6 -= bv.by_fld;
			lp.aa(var7, var8, var13, var9, var10, var6);
			var11.az();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V"
	)
	void af(JSONObject var1, int var2) throws JSONException {
		if (var1 != null) {
			this.ah_fld = oy.ak(var1, "clickbounds");
			this.as_fld = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); var4++) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.az_fld.add(new ls(this, var3[var4], var5));
					} catch (Exception var8) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								if (var2 != -1201017866) {
									return;
								}

								this.az_fld.add(new ls(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.az_fld.add(new ls(this, var3[var4], 0));
							} else {
								this.az_fld.add(new ly(this, var3[var4], var6));
							}
						} catch (Exception var7) {
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lde;B)V"
	)
	void aw(JSONArray var1, de var2, byte var3) throws JSONException {
		if (null != var1) {
			for (int var4 = 0; var4 < var1.length(); var4++) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					lq var6 = new lq(this);
					var6.ak_fld = var2.as(new URL(var5.getString("src")), (byte)30);
					var6.ag_fld = oy.ak(var5, "placement");
					this.az_fld.add(var6);
				} catch (MalformedURLException var7) {
				}
			}
		}
	}

	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lorg/json/JSONObject;)V"
	)
	public static void wl(mj var0, JSONObject var1) throws JSONException {
		if (var0 == null) {
			var0.getClass();
		} else if (var1 != null) {
			var0.ah_fld = oy.ak(var1, "clickbounds");
			var0.as_fld = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); var3++) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						var0.az_fld.add(new ls(var0, var2[var3], var4));
					} catch (Exception var7) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								var0.az_fld.add(new ls(var0, var2[var3], 1));
							} else if (var5.equals("false")) {
								var0.az_fld.add(new ls(var0, var2[var3], 0));
							} else {
								var0.az_fld.add(new ly(var0, var2[var3], var5));
							}
						} catch (Exception var6) {
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V"
	)
	void al(JSONObject var1, int var2) {
		String[] var3 = JSONObject.getNames(var1);

		for (int var4 = 0; var4 < var1.length(); var4++) {
			if (var2 != -298560643) {
				return;
			}

			try {
				int var5 = var1.optInt(var3[var4]);
				this.ay_fld.put(var3[var4], var5);
			} catch (Exception var8) {
				try {
					String var6 = var1.optString(var3[var4]);
					if (var6.equals("true")) {
						this.aw_fld.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.ay_fld.put(var3[var4], 0);
					} else {
						this.ay_fld.put(var3[var4], var6);
					}
				} catch (Exception var7) {
				}
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	void bx(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.ah_fld = oy.ak(var1, "clickbounds");
			this.as_fld = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); var3++) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.ag_fld.add(new ls(this, var2[var3], var4));
					} catch (Exception var7) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.az_fld.add(new ls(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.az_fld.add(new ls(this, var2[var3], 0));
							} else {
								this.az_fld.add(new ly(this, var2[var3], var5));
							}
						} catch (Exception var6) {
						}
					}
				}
			}
		}
	}
}
