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
	@ObfuscatedGetter(
		longValue = -9141935322544180803L
	)
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "J"
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
	@ObfuscatedGetter(
		intValue = 1730587915
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int ae(long var0) {
		return (int)(var0 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void cp() {
		ev.gc(bw.dk_fld.az_fld);

		for (int var1 = 0; var1 < bw.dk_fld.am_fld.az(); var1++) {
			rg var2 = (rg)bw.dk_fld.an_fld.ak(bw.dk_fld.am_fld.ag(var1));
			if (var2 != null) {
				ev.gc(var2.ah_fld.az_fld);
			}
		}
	}

	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "(Lzg;I)Lzj;"
	)
	public static zj rf(zg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return (zj)(zj)var0.ap_fld.get(var1);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)V"
	)
	static final void cj(dx var0, byte var1) throws EOFException {
		for (bt var2 = (bt)var0.aq_fld.aw(); null != var2; var2 = (bt)var0.aq_fld.as()) {
			if (var0.ae_fld == var2.az_fld) {
				if (!var2.ak(2010441399)) {
					if (client.dv_fld >= var2.ag_fld) {
						ak.cd(var2, client.my_fld);
						if (var2.ak(2123820200)) {
							var2.gy_void();
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

			var2.gy_void();
		}
	}

	bj() {
	}
}
