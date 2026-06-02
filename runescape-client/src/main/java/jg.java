import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jg")
public class jg implements jn {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int an_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static jg ag_fld = new jg(15, 20);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static jg az_fld = new jg(16, -2);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static jg ak_fld = new jg(14, 0);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static jg ay_fld = new jg(32, 66);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static jg ah_fld = new jg(21, 37);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	static jg aw_fld = new jg(27, 0);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static jg ae_fld = new jg(19, -2);
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ljg;"
	)
	static jg[] as_fld = new jg[33];
	@ObfuscatedGetter(
		intValue = -453446773
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ar_fld;
	@ObfuscatedGetter(
		intValue = 236620579
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int af_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bj_fld;
	@ObfuscatedGetter(
		longValue = 9194500432155369601L
	)
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	static long hq_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static jg av_fld = new jg(18, -2);
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld;

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	static void fk(int var0, int var1) {
		jm var3 = gi.ak(jb.bu_fld, client.aq_fld.av_fld);
		var3.ay_fld.ea(var0);
		xi.si(var3.ay_fld, var1);
		client.aq_fld.az(var3);
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	static final void gb(int var0, int var1, byte var2) {
		ib var3 = var0 >= 0 ? client.fv_fld[var0] : fp.fx_fld;
		if (var3 != null) {
			if (var2 != 1) {
				return;
			}

			if (var1 >= 0 && var1 < var3.av(-1091125853)) {
				hx var4 = (hx)(hx)var3.ak_fld.get(var1);
				if (var4.ak_fld != -1) {
					return;
				}

				String var5 = var4.az_fld.ak(-915963285);
				jm var6 = gi.ak(jb.bx_fld, client.aq_fld.av_fld);
				var6.ay_fld.bc(3 + iq.bu(var5));
				var6.ay_fld.bc(var0);
				var6.ay_fld.bw(var1);
				var6.ay_fld.cc(var5, 1317478836);
				client.aq_fld.az(var6);
				return;
			}
		}
	}

	static {
		jg[] var0 = new jg[]{ae_fld, az_fld, aw_fld, ah_fld, ay_fld, ak_fld, av_fld, ag_fld};
		jg[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; var2++) {
			as_fld[var1[var2].ar_fld * -453446773] = var1[var2];
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	static void hi(int var0) {
		if (client.dg_fld == 1) {
			if (var0 >= -1293157093) {
				return;
			}

			client.md_fld = true;
		}
	}

	@ObfuscatedName("yd")
	@ObfuscatedSignature(
		descriptor = "(Lac;)V"
	)
	public static void yd(ac var0) {
		if (var0.al_fld != 0) {
			if (var0.az_fld == Integer.MIN_VALUE) {
				var0.az_fld = 0;
			}

			var0.al_fld = 0;
			var0.er();
		}
	}

	jg(int var1, int var2) {
		this.ar_fld = var1;
		this.af_fld = var2;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int cs(int var0, ba var1, boolean var2) {
		return 2;
	}
}
