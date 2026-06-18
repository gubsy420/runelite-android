import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kl")
public class kl {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 283199525
	)
	static int bc_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ap_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(B)Ldx;"
	)
	static dx hk() {
		dx var1 = bw.dk_fld;
		switch (dn.ed_fld.ae_fld) {
			case 0:
				var1 = kx.ak(client.et_fld, client.da_fld);
				break;
			case 1:
				var1 = pd.ag(client.et_fld, client.da_fld);
				break;
			case 2:
				var1 = bw.dk_fld;
				break;
			case 3:
				kj.ag(client.et_fld);
				int var2 = kj.az(client.et_fld);
				int var3 = kj.av(client.et_fld);
				var1 = client.da_fld.aw(var2, var3, -1945699131);
		}

		return var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ay(int var0, int var1) {
		return var1 + (-3 - var0 << 8);
	}

	kl() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ah(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int aw(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("ym")
	@ObfuscatedSignature(
		descriptor = "(Lqu;)I"
	)
	public static int ym(qu var0) {
		return var0.ak_fld.hashCode();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int ar(int var0) {
		return var0 + -512;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int as(int var0, int var1) {
		return var1 + (-3 - var0 << 8);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int ae(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "(Lbq;)I"
	)
	public static int sj(bq var0) {
		return var0.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Lov;"
	)
	public static ov ag(int var0) throws EOFException {
		ov var2 = (ov)ov.ay_fld.ak(var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = ha.aw_fld.bb(4, var0, 584982574);
			var2 = new ov();
			if (var3 != null) {
				var2.av(new xi(var3), var0);
			}

			var2.az((byte)-13);
			ov.ay_fld.az(var2, var0);
			return var2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Llu;IILuo;Lqg;I)V"
	)
	public static void ah(lu var0, int var1, int var2, uo var3, qg var4) throws EOFException {
		lu var8 = -1 == var0.cv_fld ? null : var3.ag(var0.cv_fld, var0.cy_fld);
		int var6;
		int var7;
		if (null == var8) {
			var6 = var1;
			var7 = var2;
		} else {
			var6 = var8.bb_fld;
			var7 = var8.cd_fld;
		}

		kd.ae(var0, var6, var7, false, var3, var4, (short)-11330);
		eo.ak(var0, var6, var7);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public static int av(int var0, int var1) {
		return var1 + (var0 << 8);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BS)V"
	)
	public static void az(byte[] var0, short var1) {
		synchronized (zi.ae_fld) {
			if (100 == var0.length && zi.ah_fld < zi.ar_fld) {
				zi.ax_fld[(zi.ah_fld += -682137057) * 241275359 - 1] = var0;
			} else if (5000 != var0.length || zi.aw_fld >= zi.af_fld) {
				if (var0.length == 10000 && zi.ay_fld < zi.al_fld) {
					zi.aa_fld[(zi.ay_fld += 203987159) * -1700668697 - 1] = var0;
				} else if (var0.length == 30000 && zi.as_fld < zi.au_fld) {
					zi.ai_fld[(zi.as_fld += -145169513) * -741356505 - 1] = var0;
				} else {
					if (null != co.ad_fld) {
						for (int var3 = 0; var3 < ay.aq_fld.length; var3++) {
							if (var0.length == ay.aq_fld[var3] && zi.am_fld[var3] < co.ad_fld[var3].length) {
								if (var1 >= 1000) {
									return;
								}

								co.ad_fld[var3][zi.am_fld[var3]++] = var0;
								return;
							}
						}
					}
				}
			} else if (var1 < 1000) {
				zi.an_fld[(zi.aw_fld += -1402984011) * 1245723805 - 1] = var0;
			}
		}
	}
}
