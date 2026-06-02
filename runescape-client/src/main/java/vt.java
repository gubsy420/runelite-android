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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lvp;"
	)
	@Override
	public vp az() {
		return vp.ak_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void as(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.aw(var2);
	}

	public vt(byte[] var1) throws UnsupportedEncodingException {
		nm(this, var1, -2600935);
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lvt;[BI)V"
	)
	public static void nm(vt var0, byte[] var1, int var2) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		String var3 = new String(var1, "UTF-8");
		var0.aw(var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lvp;"
	)
	@Override
	public vp ak(int var1) {
		return vp.ak_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvp;"
	)
	@Override
	public vp av() {
		return vp.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lorg/json/JSONObject;"
	)
	public JSONObject ay() {
		return this.ag_fld;
	}

	public vt(JSONObject var1) {
		this.ag_fld = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] ae() throws UnsupportedEncodingException {
		return this.ag_fld == null ? new byte[0] : this.ag_fld.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	@Override
	public byte[] ag(int var1) throws UnsupportedEncodingException {
		return this.ag_fld == null ? new byte[0] : this.ag_fld.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lorg/json/JSONObject;"
	)
	public JSONObject aa() {
		return this.ag_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void ar(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.aw(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void al(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.aw(var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void af(byte[] var1) throws UnsupportedEncodingException {
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	void ax(String var1) throws UnsupportedEncodingException {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lorg/json/JSONObject;"
	)
	public JSONObject an() {
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
