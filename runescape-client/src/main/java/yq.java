import java.io.EOFException;
import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yq")
public class yq implements xm {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lyq;"
	)
	public static yq az_fld = new yq(1, 2, String.class, new yr());
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lyq;"
	)
	public static yq ag_fld = new yq(3, 1, Long.class, new yi());
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bu_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bk_fld;
	@ObfuscatedGetter(
		intValue = 1203613633
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lyq;"
	)
	static yq av_fld = new yq(2, 5, sl.class, new yf());
	@ObfuscatedGetter(
		intValue = -1347456803
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lyn;"
	)
	yn ay_fld;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bh_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lyq;"
	)
	public static yq ak_fld = new yq(0, 0, Integer.class, new yp());
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/Class;"
	)
	public Class aw_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;)Lyq;"
	)
	public static yq an(Class var0) {
		yq[] var1 = ak();

		for (int var2 = 0; var2 < var1.length; var2++) {
			yq var3 = var1[var2];
			if (var0 == var3.aw_fld) {
				return var3;
			}
		}

		return null;
	}

	yq(int var1, int var2, Class var3, yn var4) {
		this.ae_fld = var1;
		this.ah_fld = var2;
		this.aw_fld = var3;
		this.ay_fld = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;)Lyq;"
	)
	public static yq az(Class var0) {
		yq[] var2 = ak();

		for (int var3 = 0; var3 < var2.length; var3++) {
			yq var4 = var2[var3];
			if (var0 == var4.aw_fld) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	public static void aw(Object var0, xi var1) {
		yn var3 = ay(var0.getClass());
		var3.az(var0, var1, (byte)40);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()[Lyq;"
	)
	public static yq[] ak() {
		return new yq[]{ag_fld, ak_fld, az_fld, av_fld};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;)Lyn;"
	)
	static yn ad(Class var0) {
		yq var1 = az(var0);
		if (null == var1) {
			throw new IllegalArgumentException();
		} else {
			return var1.ay_fld;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	public Object as(xi var1) {
		return this.ay_fld.ag(var1, -356751225);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ah_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()[Lyq;"
	)
	public static yq[] ar() {
		return new yq[]{ag_fld, ak_fld, az_fld, av_fld};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()[Lyq;"
	)
	public static yq[] af() {
		return new yq[]{ag_fld, ak_fld, az_fld, av_fld};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()[Lyq;"
	)
	public static yq[] al() {
		return new yq[]{ag_fld, ak_fld, az_fld, av_fld};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()[Lyq;"
	)
	public static yq[] au() {
		return new yq[]{ag_fld, ak_fld, az_fld, av_fld};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;)Lyq;"
	)
	public static yq ax(Class var0) {
		yq[] var1 = ak();

		for (int var2 = 0; var2 < var1.length; var2++) {
			yq var3 = var1[var2];
			if (var0 == var3.aw_fld) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String toString() {
		if (this == ak_fld) {
			return "int";
		} else if (this == ag_fld) {
			return "long";
		} else {
			return this == az_fld ? "string" : "unknown";
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	public Object ao(xi var1) {
		return this.ay_fld.ag(var1, 283227155);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;)Lyq;"
	)
	public static yq aa(Class var0) {
		yq[] var1 = ak();

		for (int var2 = 0; var2 < var1.length; var2++) {
			yq var3 = var1[var2];
			if (var0 == var3.aw_fld) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	public static void ai(Object var0, xi var1) {
		yn var2 = ay(var0.getClass());
		var2.az(var0, var1, (byte)4);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxi;)V"
	)
	public static void aq(Object var0, xi var1) {
		yn var2 = ay(var0.getClass());
		var2.az(var0, var1, (byte)2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;)Lyn;"
	)
	static yn am(Class var0) {
		yq var1 = az(var0);
		if (null == var1) {
			throw new IllegalArgumentException();
		} else {
			return var1.ay_fld;
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)Lyq;"
	)
	public static yq jw(int var0) {
		return eu.ag(var0, -1779856707);
	}

	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public static void uk(pi var0) {
		var0.ai_fld = var0.az_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;)Lyn;"
	)
	static yn ay(Class var0) {
		yq var2 = az(var0);
		if (null == var2) {
			throw new IllegalArgumentException();
		} else {
			return var2.ay_fld;
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lsp;I)V"
	)
	public static void mi(fn var0, sp var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		ea var3 = var1.ah_fld;

		for (int var4 = 0; var4 < var3.ah_fld; var4++) {
			int var5 = var3.aw_fld[var4];
			if (var5 == 5 && var1.av_fld != null && var1.av_fld[var4] != null && var1.av_fld[var4][0] != null && var0.ci_fld != null && var0.cv_fld != null) {
				sn var6 = var1.av_fld[var4][0];

				for (int var10 : var3.ay_fld[var4]) {
					if (var10 < var0.ci_fld.length) {
						int[] var11 = var0.ci_fld[var10];

						for (int var12 = 0; var12 < var11.length; var12++) {
							int var13 = var11[var12];
							int var14 = (int)((var0.cv_fld[var13] & 255) + sn.ys(var6, var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							var0.cv_fld[var13] = (byte)var14;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Ljava/lang/Object;"
	)
	public Object ab(xi var1) {
		return this.ay_fld.ag(var1, 60252809);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	static void bs(int var0, int var1) {
		if (cj.gu() != 0 && var0 != -1) {
			ArrayList var3 = new ArrayList();
			var3.add(new me(ih.hm_fld, var0, 0, cj.gu(), false));
			hi.az(var3, 0, 0, 0, 0, true, (short)-13834);
			client.kc_fld = true;
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void fb(int var0) throws EOFException {
		if (client.nk_fld) {
			lu var1 = cf.cg_fld.ag(av.nj_fld, client.ny_fld, -1681198134);
			if (var1 != null) {
				if (var0 <= -348081132) {
					return;
				}

				if (null != var1.fc_fld) {
					yz var2 = tu.ak(var1).av((Object[])var1.fc_fld, 1252941561).ax(390781777);
					va.ak(var2);
				}
			}

			client.nn_fld = -1106240719;
			client.nk_fld = false;
		}
	}
}
