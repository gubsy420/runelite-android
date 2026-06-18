import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ou")
public class ou extends vc {
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	static String bu_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ak_fld = new iw(64);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static ub aw_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bl_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int az(int var0) {
		return sz.dd_fld.length;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lqk;Lvd;)V"
	)
	public static void ku(qk var0, vd var1) {
		if (!var0.ae_fld) {
			if (null == var1) {
				var0.ag_fld.ah("Content-Type", (byte)-64);
				var0.av_fld = null;
			} else {
				var0.av_fld = var1;
				if (var0.av_fld.ak(1557254738) != null) {
					var0.ag_fld.ay(var0.av_fld.ak(1557254738));
				} else {
					qt.mz(var0.ag_fld, 1777388989);
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ak_fld.av();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lot;"
	)
	public static ot ak(int var0) throws EOFException {
		try {
			ot var2 = (ot)ot.au_fld.ak(var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = hc.af_fld.bb(13, var0, 584982574);
				var2 = new ot();
				var2.an_fld = var0;
				if (var3 != null) {
					var2.az(new xi(var3));
				}

				ot.au_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void az() {
		ak_fld.av();
	}

	ou() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "(Lzg;)I"
	)
	public static int sw(zg var0) {
		return var0.at_fld;
	}
}
