import net.runelite.api.VarbitComposition;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ph")
@Implements({"VarbitComposition"})
public class ph extends vc implements VarbitComposition {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 316985927
	)
	public int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2041933517
	)
	public int av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw az_fld = new iw(64);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -384013537
	)
	public int ah_fld;
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

			this.ae(var1, var3, 678852977);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void af() {
		az_fld.av();
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Loy;)I"
	)
	public static int ok(oy var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.bd_fld;
	}

	static {
		byte var0 = 2;

		for (int var1 = 0; var1 < 32; var1++) {
			ak_fld[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("getLeastSignificantBit")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getLeastSignificantBit")
	@Override
	public int getLeastSignificantBit() {
		return this.ae_fld;
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
		int var3 = ak_fld[this.ah_fld - this.ae_fld];
		return var1 >> this.ae_fld & var3;
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

			this.av_fld = var1.cm();
			this.ae_fld = var1.cg();
			this.ah_fld = var1.cg();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void as() {
		az_fld.av();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ar() {
		az_fld.av();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void al() {
		az_fld.av();
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

			this.ae(var1, var2, -1185526785);
		}
	}

	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lxi;)V"
	)
	public static void sn(ph var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			var0.ae(var1, var2, -393698678);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public static void ay(ub var0) {
		ag_fld = var0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void aa(xi var1, int var2) {
		if (var2 == 1) {
			this.av_fld = var1.cm();
			this.ae_fld = var1.cg() * 1101925757;
			this.ah_fld = var1.cg() * 1121342700;
		}
	}

	@ObfuscatedName("getIndex")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getIndex")
	@Override
	public int getIndex() {
		return this.av_fld;
	}

	@ObfuscatedName("getMostSignificantBit")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getMostSignificantBit")
	@Override
	public int getMostSignificantBit() {
		return this.ah_fld;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	void ai(xi var1, int var2) {
		if (var2 == 1) {
			this.av_fld = var1.cm();
			this.ae_fld = var1.cg();
			this.ah_fld = var1.cg();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int am(int var1) {
		int var2 = ak_fld[this.ah_fld - this.ae_fld];
		return var1 >> this.ae_fld & var2;
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lxi;)V"
	)
	public static void qd(ph var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			while (true) {
				int var2 = var1.cg();
				if (0 == var2) {
					return;
				}

				var0.ae(var1, var2, -679117816);
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aq(int var1) {
		int var2 = ak_fld[this.ah_fld - this.ae_fld];
		return var1 >> this.ae_fld & var2;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;"
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

			this.ae(var1, var2, -393698678);
		}
	}
}
