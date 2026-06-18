import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("hk")
public class hk implements xm {
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String ik_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	static hk ag_fld = new hk(0, (byte)1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	static hk az_fld = new hk(2, (byte)2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	static hk av_fld = new hk(3, (byte)3);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1358916679
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ah_fld;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1461120801
	)
	static int dc_fld;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	static yc[] dl_fld;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	static dx mt_fld;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lyc;"
	)
	static yc cr_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cg_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	static hk ak_fld = new hk(1, (byte)0);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ao_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhk;"
	)
	static hk[] ak() {
		return new hk[]{av_fld, ak_fld, az_fld, ag_fld};
	}

	hk(int var1, byte var2) {
		this.ae_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(Loh;)V"
	)
	public static void nq(oh var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ah_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ah_fld;
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void ew() {
		for (cs var1 = (cs)bw.dk_fld.ai_fld.aw(); null != var1; var1 = (cs)na.iy(bw.dk_fld.ai_fld)) {
			if (var1.ax_fld == -1) {
				var1.au_fld = 0;
				ai.ex(bw.dk_fld, var1, -1323804254);
			} else {
				var1.gy();
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lhk;"
	)
	static hk[] az() {
		return new hk[]{av_fld, ak_fld, az_fld, ag_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lhk;"
	)
	static hk[] aw() {
		return new hk[]{av_fld, ak_fld, az_fld, ag_fld};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ah_fld;
	}
}
