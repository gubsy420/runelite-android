import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("bj")
public class bj {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[J"
	)
	long[] ae_fld;
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -9141935322544180803L
	)
	static long lz_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	Object[] av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1730587915
	)
	int ag_fld = 1907444061;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	ba ak_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv ib_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ah_fld;

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lli;II)V"
	)
	public static void ki(li var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var0.ap_fld && var0.bb()) {
			var1 += var0.bj_fld;
			var2 += var0.bf_fld;
			ve var3 = var0.dv();
			int var4 = var0.am_fld.am(var1 - (Integer)var3.ag_fld, var2 - (Integer)var3.ak_fld);
			switch (var0.ac_fld) {
				case 0:
					var0.ap(var0.bd_fld, var4);
					break;
				case 1:
					ve var9 = var0.cu(var0.bz_fld);
					ve var10 = var0.cu(var4);
					var0.cb(var9, var10);
					break;
				case 2:
					ve var5 = var0.co(var0.bz_fld);
					ve var6 = var0.co(var4);
					var0.cb(var5, var6);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int ae(long var0) {
		return (int)(var0 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static final void cp() {
		bw.dk_fld.az_fld.bo();

		for (int var1 = 0; var1 < bw.dk_fld.ad_fld.az(); var1++) {
			rg var2 = (rg)bw.dk_fld.an_fld.ak(yw.wk(bw.dk_fld.ad_fld, var1, (byte)48));
			if (var2 != null) {
				var2.ah_fld.az_fld.bo();
			}
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)V"
	)
	static final void cj(dx var0, byte var1) throws EOFException {
		for (bt var2 = (bt)var0.aq_fld.aw(); null != var2; var2 = (bt)na.iy(var0.aq_fld)) {
			if (var0.ae_fld == var2.az_fld) {
				if (!var2.ak(2010441399)) {
					if (client.dv_fld >= var2.ag_fld) {
						var2.ag(client.my_fld, 783018406);
						if (var2.ak(2123820200)) {
							var2.gy();
						} else {
							var0.az_fld.bj(var2.az_fld, var2.av_fld, var2.ae_fld, var2.ah_fld, 60, var2, 0, -1L, false);
						}
					}
					continue;
				}

				if (var1 == 1) {
					return;
				}
			}

			var2.gy();
		}
	}

	bj() {
	}
}
