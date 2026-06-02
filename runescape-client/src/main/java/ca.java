import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ca")
public class ca implements xm {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	static ca av_fld = new ca(3);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	static ca ag_fld = new ca(1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	static ca az_fld = new ca(2);
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "F"
	)
	static float br_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	static ca ae_fld = new ca(4);
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Lwl;"
	)
	static wl px_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	static ca ak_fld = new ca(0);
	@ObfuscatedGetter(
		intValue = 1249352911
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aq_fld;
	@ObfuscatedGetter(
		intValue = 1338931103
	)
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ot_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
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

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Los;Lxi;)V"
	)
	public static void jd(os var0, xi var1) {
		if (var0 == null) {
			var0.getClass();
		}

		while (true) {
			int var2 = var1.cg();
			if (0 == var2) {
				return;
			}

			os.ww(var0, var1, var2, (short)-24539);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ah_fld;
	}

	ca(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	static void bq(byte var0) throws EOFException {
		Iterator var1 = client.da_fld.iterator();

		while (var1.hasNext()) {
			dx var2 = (dx)(dx)var1.next();

			for (int var3 = 0; var3 < var2.am_fld.az(); var3++) {
				if (var0 == -1) {
					return;
				}

				int var4 = var2.am_fld.ag(var3);
				rg var5 = (rg)var2.an_fld.ak(var4);
				if (null != var5) {
					if (var0 == -1) {
						return;
					}

					var5.ab(client.dv_fld, -185821699);
				}

				jm.kr_fld.av(var2, var5.dp(527100376), var5.dj(189745805), false);
				if (var5.aa_fld.ae() != null) {
					if (var0 == -1) {
						return;
					}

					if (var5.aa_fld.ae().ad(466080322) != -1) {
						if (var5.ai_fld > 0) {
							var5.ai_fld--;
						} else {
							int var6 = cf.ak(var5.aa_fld, 1, jm.kr_fld);
							if (0 != (var6 & 2)) {
								var5.aa_fld.ag();
								var5.an_fld.ar(461909079);
							}
						}
					}
				}

				if (var5.an_fld.ae() != null && var5.an_fld.ae().ad(-554248240) != -1) {
					int var7 = cf.ak(var5.an_fld, 1, jm.kr_fld);
					if (0 != (var7 & 2)) {
						var5.an_fld.ar(461909079);
					}
				}

				jm.kr_fld.ae(2084058832);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lpp;"
	)
	public static pp az(int var0) throws EOFException {
		pp var2 = (pp)pp.cn_fld.ak(var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = pp.az_fld.bb(9, var0, 584982574);
			var2 = new pp();
			var2.ca_fld = var0;
			if (var3 != null) {
				var2.ae(new xi(var3), (byte)51);
			}

			var2.av((byte)12);
			pp.cn_fld.az(var2, var0);
			return var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lmf;"
	)
	public static mf ar() {
		try {
			return new mt();
		} catch (Throwable var2) {
			return new mm();
		}
	}
}
