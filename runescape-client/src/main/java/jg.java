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
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -453446773
	)
	public int ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 236620579
	)
	public int af_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bj_fld;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 9194500432155369601L
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
		descriptor = "(IIB)V"
	)
	static void fk(int var0, int var1) {
		jm var3 = gi.ak(jb.bu_fld, client.appletStub.av_fld);
		var3.ay_fld.et(var0);
		var3.ay_fld.ca(var1);
		client.appletStub.az(var3);
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
				jm var6 = gi.ak(jb.bx_fld, client.appletStub.av_fld);
				var6.ay_fld.ea(3 + iq.bu(var5));
				var6.ay_fld.ea(var0);
				xi.vy(var6.ay_fld, var1);
				xi.ph(var6.ay_fld, var5, 1317478836);
				client.appletStub.az(var6);
				return;
			}
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)I"
	)
	public static int hl(qa var0) {
		return var0.av_fld;
	}

	static {
		jg[] var0 = new jg[]{ae_fld, az_fld, aw_fld, ah_fld, ay_fld, ak_fld, av_fld, ag_fld};
		jg[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; var2++) {
			as_fld[var1[var2].ar_fld * -453446773] = var1[var2];
		}
	}

	@ObfuscatedName("tn")
	@ObfuscatedSignature(
		descriptor = "(Lsb;ZZZ)Z"
	)
	public static boolean tn(sb var0, boolean var1, boolean var2, boolean var3) {
		return var0.az(var0.ar_fld, var1, var2, var3);
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

	jg(int var1, int var2) {
		this.ar_fld = var1;
		this.af_fld = var2;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int cs(int var0, ba var1, boolean var2) {
		return 2;
	}
}
