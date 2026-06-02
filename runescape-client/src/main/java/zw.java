import java.util.Map;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zw")
public class zw {
	@ObfuscatedGetter(
		intValue = -664632441
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ak() {
		return this.ak_fld;
	}

	@ObfuscatedName("xe")
	@ObfuscatedSignature(
		descriptor = "(Lqx;)Ljava/util/Map;"
	)
	public static Map xe(qx var0) {
		return var0.az_fld;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lmj;)V"
	)
	public static void jf(mj var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.as_fld = null;
		var0.ah_fld[0] = 0.0F;
		var0.ah_fld[1] = 0.0F;
		var0.ah_fld[2] = 1.0F;
		var0.ah_fld[3] = 1.0F;
		var0.az_fld.clear();
		var0.av_fld.clear();
		var0.ag_fld.clear();
		var0.ay_fld.clear();
		var0.aw_fld.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return this.ak_fld;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lvv;)I"
	)
	public static int ci(vv var0) {
		return var0.av_fld;
	}

	zw(int var1, boolean var2) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int az() {
		return this.ak_fld;
	}
}
