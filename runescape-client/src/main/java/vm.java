import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vm")
public class vm implements vd {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Map;"
	)
	Map ak_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lvp;"
	)
	@Override
	public vp ak(int var1) {
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	@Override
	public byte[] ag(int var1) throws UnsupportedEncodingException {
		return this.ah().getBytes("UTF-8");
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ah() throws UnsupportedEncodingException {
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = this.ak_fld.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)(Entry)var3.next();
			String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
			String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
			var2.append(var5).append("=").append(var6).append("&");
		}

		if (var2.length() == 0) {
			return "";
		} else {
			var2.deleteCharAt(var2.length() - 1);
			var2.insert(0, "?");
			return var2.toString();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lvp;"
	)
	@Override
	public vp az() {
		return null;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Lvm;)Ljava/lang/String;"
	)
	public static String gc(vm var0) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		StringBuilder var1 = new StringBuilder();
		Iterator var2 = var0.ak_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}

		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvp;"
	)
	@Override
	public vp av() {
		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	@Override
	public byte[] ae() throws UnsupportedEncodingException {
		return this.ah().getBytes("UTF-8");
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Ldr;)V"
	)
	public static void gt(dr var0) {
		if (var0.ar_fld != null) {
			wh var1 = var0.ar_fld.av_fld;
			if (var0.as_fld != null) {
				var0.as_fld.ag(0, var0.as_fld.av(), var1.ae(), var1.ay());
				wj.nc(var0.as_fld, 1958953740);
			}

			if (var0.af_fld != null) {
				var0.af_fld.ag(0, var0.af_fld.av(), var1.ae(), var1.ay());
				wj.nc(var0.af_fld, 2145777782);
			}
		}
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public static void em(wz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ai_fld = cu.dl_fld.an(kh.hf_fld) * -1903031944;

		for (int var1 = 0; var1 < var0.ag_fld; var1++) {
			int var2 = cu.dl_fld.an(var0.ak(var1, -1326445416));
			if (null != var0.af_fld[var1]) {
				var2 += 15;
			}

			if (var2 > var0.ai_fld) {
				var0.ai_fld = var2;
			}
		}

		var0.ai_fld += 8;
		var0.au_fld = var0.ag_fld + -799381740;
		if (var0.ak_fld) {
			var0.au_fld += -608855278;
		}
	}

	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "(Lvm;)Ljava/lang/String;"
	)
	public static String vl(vm var0) throws UnsupportedEncodingException {
		if (var0 == null) {
			var0.getClass();
		}

		StringBuilder var1 = new StringBuilder();
		Iterator var2 = var0.ak_fld.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)(Entry)var2.next();
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}

		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}

	public vm(Map var1) {
		this.ak_fld = var1;
	}
}
