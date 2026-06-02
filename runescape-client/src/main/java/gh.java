import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gh")
public class gh {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static gh ae_fld = new gh(2, 64, 64);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static gh ag_fld = new gh(0, 16, 16);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static gh az_fld = new gh(3, 32, 32);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static gh av_fld = new gh(5, 48, 48);
	@ObfuscatedGetter(
		intValue = 1893069287
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static gh ah_fld = new gh(4, 96, 96);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static gh ak_fld = new gh(1, 8, 8);
	@ObfuscatedGetter(
		intValue = -685467397
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lgh;"
	)
	static gh[] as_fld = cm.ak_Arrgh(1187895499);
	@ObfuscatedGetter(
		intValue = 1863655475
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static gh aw_fld = new gh(6, 128, 128);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int as() {
		return this.ay_fld * this.ar_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ag(int var1) {
		return this.ay_fld * this.ar_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Lyb;"
	)
	public static yb ag(int var0, byte var1) {
		return gs.ag(var0);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lgh;"
	)
	static gh[] az() {
		return new gh[]{ag_fld, ak_fld, ae_fld, az_fld, ah_fld, av_fld, aw_fld};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()[Lgh;"
	)
	static gh[] av() {
		return new gh[]{ag_fld, ak_fld, ae_fld, az_fld, ah_fld, av_fld, aw_fld};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[Lgh;"
	)
	static gh[] ae() {
		return new gh[]{ag_fld, ak_fld, ae_fld, az_fld, ah_fld, av_fld, aw_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aw() {
		return this.ay_fld * this.ar_fld;
	}

	gh(int var1, int var2, int var3) {
		this.af_fld = var1;
		this.ay_fld = var2;
		this.ar_fld = var3;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lqe;)Z"
	)
	public static boolean fd(qe var0) {
		return var0.as_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ay() {
		return this.ay_fld * this.ar_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()[Lgh;"
	)
	static gh[] ah() {
		return new gh[]{ag_fld, ak_fld, ae_fld, az_fld, ah_fld, av_fld, aw_fld};
	}

	static {
		Arrays.sort(as_fld, new gv());
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZZ)Lyc;"
	)
	static yc av(boolean var0, boolean var1) {
		return var0 ? (var1 ? ee.cz_fld : ik.cm_fld) : (var1 ? gl.cw_fld : yg.cg_fld);
	}
}
