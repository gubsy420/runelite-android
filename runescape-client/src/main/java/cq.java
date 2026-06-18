import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cq")
public class cq implements xm {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static cq ay_fld = new cq(7, 22);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static cq aw_fld = new cq(6, 19);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static cq av_fld = new cq(3, 4);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static cq ae_fld = new cq(4, 5);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static cq az_fld = new cq(2, 3);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static cq ah_fld = new cq(5, 6);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static cq ak_fld = new cq(0, -1);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static cq ag_fld = new cq(1, 2);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1716794191
	)
	int ar_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 99090547
	)
	int as_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	static short[][][] af_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int an_fld;
	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ll_fld;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lcq;"
	)
	static cq[] ay() {
		return new cq[]{aw_fld, ae_fld, ah_fld, az_fld, ak_fld, ay_fld, av_fld, ag_fld};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.as_fld;
	}

	cq(int var1, int var2) {
		this.ar_fld = var1;
		this.as_fld = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.as_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.as_fld;
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIIZ)V"
	)
	public static void mi(gn var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ax(var1, var2, var3, var4, 0, var5, -1942928115);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()[Lcq;"
	)
	static cq[] as() {
		return new cq[]{aw_fld, ae_fld, ah_fld, az_fld, ak_fld, ay_fld, av_fld, ag_fld};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lcq;"
	)
	static cq[] az() {
		return new cq[]{aw_fld, ae_fld, ah_fld, az_fld, ak_fld, ay_fld, av_fld, ag_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lcq;"
	)
	static cq[] aw() {
		return new cq[]{aw_fld, ae_fld, ah_fld, az_fld, ak_fld, ay_fld, av_fld, ag_fld};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.as_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int ag(int var0, int var1) {
		if (-2 == var0) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			return 127 - var1;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;Ljava/lang/String;Ljava/lang/String;I)Lzf;"
	)
	public static zf ay(ub var0, ub var1, String var2, String var3) throws EOFException {
		if (!var0.ck(var2, var3, (byte)31)) {
			return null;
		} else {
			int var5 = var0.cm(var2, (byte)1);
			int var6 = var0.cz(var5, var3, 213029302);
			return dv.ae(var0, var1, var5, var6);
		}
	}
}
