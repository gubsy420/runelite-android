import net.runelite.api.VarbitComposition;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ph")
@Implements({"VarbitComposition"})
public class ph extends vc implements VarbitComposition {
	@ObfuscatedGetter(
		intValue = 316985927
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedGetter(
		intValue = 2041933517
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw az_fld = new iw(64);
	@ObfuscatedGetter(
		intValue = -384013537
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ak_fld = new int[32];

	ph() {
	}

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "(Lph;I)I"
	)
	public static int tb(ph var0, int var1) {
		int var2 = ak_fld[var0.av_fld - var0.ah_fld];
		return var1 >> var0.ah_fld & var2;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lxi;II)V"
	)
	public static void jq(ph var0, xi var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2 == 1) {
				if (var3 == -1936444468) {
					return;
				}

				var0.ae_fld = xi.tx(var1, 656868958);
				var0.ah_fld = var1.cg();
				var0.av_fld = var1.cg();
			}
		}
	}

	@ObfuscatedName("zd")
	@ObfuscatedSignature(
		descriptor = "(Lew;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int zd(ew var0, Object var1, Object var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return ew.uy(var0, (rr)var1, (rr)var2, 172675043);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;B)V"
	)
	void av(xi var1, byte var2) {
		while (true) {
			int var3 = var1.cg();
			if (0 == var3) {
				return;
			}

			jq(this, var1, var3, 678852977);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void af() {
		az_fld.vh();
	}

	static {
		byte var0 = 2;

		for (int var1 = 0; var1 < 32; var1++) {
			ak_fld[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void aw(ub var0) {
		ag_fld = var0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int ah(int var1, byte var2) {
		int var3 = ak_fld[this.av_fld - this.ah_fld];
		return var1 >> this.ah_fld & var3;
	}

	@ObfuscatedName("getMostSignificantBit")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getMostSignificantBit() {
		return this.av_fld;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lxi;I)V"
	)
	public static void fw(ph var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == 1) {
			var0.ae_fld = xi.tx(var1, 773822344);
			var0.ah_fld = var1.cg();
			var0.av_fld = var1.cg();
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lxi;I)V"
	)
	public static void ma(ph var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == 1) {
			var0.ae_fld = xi.tx(var1, 385354450);
			var0.ah_fld = var1.cg() * 1101925757;
			var0.av_fld = var1.cg() * 1121342700;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void as() {
		az_fld.vh();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ar() {
		az_fld.vh();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void al() {
		az_fld.vh();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void ax(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			jq(this, var1, var2, -679117816);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void au(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			jq(this, var1, var2, -1185526785);
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lph;I)I"
	)
	public static int hz(ph var0, int var1) {
		int var2 = ak_fld[var0.av_fld - var0.ah_fld];
		return var1 >> var0.ah_fld & var2;
	}

	@ObfuscatedName("getIndex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getIndex() {
		return this.ae_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ay(ub var0) {
		ag_fld = var0;
	}

	@ObfuscatedName("getLeastSignificantBit")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getLeastSignificantBit() {
		return this.ah_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	void an(xi var1) {
		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			jq(this, var1, var2, -393698678);
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;"
	)
	static String hj(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (1 == client.gu_fld) {
			var0 = var0 + "-wtrc";
		} else if (2 == client.gu_fld) {
			var0 = var0 + "-wtqa";
		} else if (client.gu_fld == 3) {
			var0 = var0 + "-wtwip";
		} else if (5 == client.gu_fld) {
			var0 = var0 + "-wti";
		} else if (4 == client.gu_fld) {
			var0 = "local";
		}

		String var4 = "";
		if (null != fr.gf_fld) {
			var4 = "/p=" + fr.gf_fld;
		}

		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + ku.gi_fld + "/a=" + ub.gm_fld + var4 + "/";
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;II)V"
	)
	void ae(xi var1, int var2, int var3) {
		if (var2 == 1) {
			if (var3 == -1936444468) {
				return;
			}

			this.ah_fld = xi.tx(var1, 656868958) * 1136406021;
			this.ae_fld = var1.co() * -614254729;
			this.av_fld = var1.ew();
		}
	}
}
