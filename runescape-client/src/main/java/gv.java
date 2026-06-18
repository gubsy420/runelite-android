import java.io.EOFException;
import java.net.URL;
import java.util.Comparator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gv")
public class gv implements Comparator {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bt_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	static boolean ak() {
		try {
			if (null == ct.ar_fld) {
				ct.ar_fld = xh.jn_fld.as(new URL(uh.gq_fld), (byte)87);
			} else if (ct.ar_fld.ak()) {
				byte[] var1 = ct.ar_fld.ag();
				xi var2 = new xi(var1);
				var2.co((byte)-2);
				ct.ah_fld = var2.cm();
				yd.ae_fld = new ct[ct.ah_fld];
				int var3 = 0;

				while (var3 < ct.ah_fld) {
					ct var4 = yd.ae_fld[var3] = new ct();
					var4.aa_fld = var2.cm();
					var4.au_fld = var2.co((byte)-61);
					var4.aq_fld = xi.at(var2, -1962007566);
					var4.ax_fld = xi.at(var2, 354774734);
					var4.ai_fld = var2.cg();
					var4.af_fld = var2.cz();
					var4.ad(-1);
					var4.al_fld = var3++;
				}

				cf.az(yd.ae_fld, 0, yd.ae_fld.length - 1, ct.as_fld, ct.ay_fld, -1056972390);
				ct.ar_fld = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			ct.ar_fld = null;
		}

		return false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Z"
	)
	public static boolean af(ub var0, int var1) throws EOFException {
		try {
			byte[] var3 = ub.xk(var0, var1, (byte)127);
			if (var3 == null) {
				return false;
			} else {
				wz.al(var3, 1471828694);
				return true;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((gh)var1, (gh)var2, (byte)0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgh;Lgh;B)I"
	)
	int ak(gh var1, gh var2, byte var3) {
		return var1.ag(93143085) - var2.ag(93143085);
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int ah(Object var1, Object var2) {
		return this.ak((gh)var1, (gh)var2, (byte)0);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jt(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jg(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgh;Lgh;)I"
	)
	int ag(gh var1, gh var2) {
		return var1.ag(93143085) - var2.ag(93143085);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lgh;Lgh;)I"
	)
	int az(gh var1, gh var2) {
		return var1.ag(93143085) - var2.ag(93143085);
	}

	gv() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((gh)var1, (gh)var2, (byte)0);
	}
}
