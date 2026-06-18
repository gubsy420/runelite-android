import java.io.UnsupportedEncodingException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("vt")
public class vt implements vd {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lorg/json/JSONObject;"
	)
	JSONObject ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ak_fld;

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lyv;I)V"
	)
	public static void bl(yv var0, int var1) {
		int[] var2 = new int[var0.aw_fld * var0.ay_fld];
		int var3 = 0;

		for (int var4 = 0; var4 < var0.ay_fld; var4++) {
			for (int var5 = 0; var5 < var0.aw_fld; var5++) {
				int var6 = var0.ah_fld[var3];
				if (var6 == 0) {
					if (var5 > 0 && var0.ah_fld[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && var0.ah_fld[var3 - var0.aw_fld] != 0) {
						var6 = var1;
					} else if (var5 < var0.aw_fld - 1 && var0.ah_fld[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < var0.ay_fld - 1 && var0.ah_fld[var3 + var0.aw_fld] != 0) {
						var6 = var1;
					}
				}

				var2[var3++] = var6;
			}
		}

		var0.ah_fld = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvp;"
	)
	@Override
	public vp av() {
		return vp.ak_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void al(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.aw(var2);
	}

	public vt(byte[] var1) throws UnsupportedEncodingException {
		go(this, var1, -2600935);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lvp;"
	)
	@Override
	public vp ak(int var1) {
		return vp.ak_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lvp;"
	)
	@Override
	public vp az() {
		return vp.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;"
	)
	public JSONObject ay() {
		return this.ag_fld;
	}

	public vt(JSONObject var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "(Lvt;Ljava/lang/String;)V"
	)
	public static void tb(vt var0, String var1) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		} else {
			try {
				if (var1.charAt(0) == '{') {
					var0.ag_fld = new JSONObject(var1);
				} else {
					if (var1.charAt(0) != '[') {
						throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
					}

					JSONArray var2 = new JSONArray(var1);
					var0.ag_fld = new JSONObject();
					var0.ag_fld.put("arrayValues", var2);
				}
			} catch (JSONException var3) {
				throw new UnsupportedEncodingException(var3.getMessage());
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] ae() throws UnsupportedEncodingException {
		return this.ag_fld == null ? new byte[0] : this.ag_fld.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lvt;[BI)V"
	)
	public static void go(vt var0, byte[] var1, int var2) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		String var3 = new String(var1, "UTF-8");
		var0.aw(var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	@Override
	public byte[] ag(int var1) throws UnsupportedEncodingException {
		return this.ag_fld == null ? new byte[0] : this.ag_fld.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lorg/json/JSONObject;"
	)
	public JSONObject an() {
		return this.ag_fld;
	}

	@ObfuscatedName("ze")
	@ObfuscatedSignature(
		descriptor = "(Lvt;[B)V"
	)
	public static void ze(vt var0, byte[] var1) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		String var2 = new String(var1, "UTF-8");
		var0.aw(var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void af(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.aw(var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V"
	)
	void aw(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.ag_fld = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.ag_fld = new JSONObject();
				this.ag_fld.put("arrayValues", var3);
			}
		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void as(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.aw(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void au(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.ag_fld = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.ag_fld = new JSONObject();
				this.ag_fld.put("arrayValues", var2);
			}
		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	public vt(String var1) throws UnsupportedEncodingException {
		this.aw(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lorg/json/JSONObject;"
	)
	public JSONObject aa() {
		return this.ag_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BI)V"
	)
	void ah(byte[] var1, int var2) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.aw(var3);
	}
}
