import java.io.EOFException;
import java.util.HashMap;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xc")
public class xc {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ao_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/HashMap;"
	)
	HashMap az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	ub ak_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Lxy;)Ljava/util/HashMap;"
	)
	public HashMap ak(xy[] var1) throws EOFException {
		HashMap var3 = new HashMap();
		xy[] var4 = var1;

		for (int var5 = 0; var5 < var4.length; var5++) {
			xy var6 = var4[var5];
			if (this.az_fld.containsKey(var6)) {
				var3.put(var6, this.az_fld.get(var6));
			} else {
				zf var7 = cq.ay(this.ak_fld, this.ag_fld, var6.aw_fld, "");
				if (null != var7) {
					this.az_fld.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}

		return var3;
	}

	public xc(ub var1, ub var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = new HashMap();
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Lxc;[Lxy;)Ljava/util/HashMap;"
	)
	public static HashMap li(xc var0, xy[] var1) throws EOFException {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			HashMap var2 = new HashMap();
			xy[] var3 = var1;

			for (int var4 = 0; var4 < var3.length; var4++) {
				xy var5 = var3[var4];
				if (var0.az_fld.containsKey(var5)) {
					var2.put(var5, var0.az_fld.get(var5));
				} else {
					zf var6 = cq.ay(var0.ak_fld, var0.ag_fld, var5.aw_fld, "");
					if (null != var6) {
						var0.az_fld.put(var5, var6);
						var2.put(var5, var6);
					}
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Lxy;)Ljava/util/HashMap;"
	)
	public HashMap ag(xy[] var1) throws EOFException {
		HashMap var2 = new HashMap();
		xy[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; var4++) {
			xy var5 = var3[var4];
			if (this.az_fld.containsKey(var5)) {
				var2.put(var5, this.az_fld.get(var5));
			} else {
				zf var6 = cq.ay(this.ak_fld, this.ag_fld, var5.aw_fld, "");
				if (null != var6) {
					this.az_fld.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}
}
