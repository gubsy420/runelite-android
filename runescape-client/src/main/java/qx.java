import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qx")
public class qx {
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int dh_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String av_fld;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int cu_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1586408085
	)
	int ak_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cd_fld;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Map;"
	)
	public Map af() {
		return this.az_fld;
	}

	qx(String var1) {
		this.ak_fld = -868866224;
		this.ag_fld = var1;
		this.az_fld = null;
		this.av_fld = "";
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String as() {
		return this.ag_fld;
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Lqx;)Ljava/util/Map;"
	)
	public static Map ug(qx var0) {
		return var0.az_fld;
	}

	qx(HttpURLConnection var1) throws IOException {
		this.ak_fld = var1.getResponseCode();
		this.ag_fld = var1.getResponseMessage();
		this.az_fld = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.ak_fld >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.av_fld = var2.toString();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;"
	)
	public Map az() {
		return this.az_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String av() {
		return this.av_fld;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lqx;)Ljava/lang/String;"
	)
	public static String of(qx var0) {
		return var0.av_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ah() {
		return this.ak_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String aw() {
		return this.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int ak() {
		return this.ak_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ay() {
		return this.ag_fld;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Map;"
	)
	public Map al() {
		return this.az_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/Map;"
	)
	public Map au() {
		return this.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ag() {
		return this.ag_fld;
	}
}
