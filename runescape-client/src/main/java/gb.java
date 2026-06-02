import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gb")
public class gb {
	@ObfuscatedGetter(
		intValue = 455105703
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static gb ag_fld = new gb(1);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static gb ak_fld = new gb(0);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	static hv aj_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int by_fld;

	gb(int var1) {
		this.az_fld = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public static int as(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			var2++;
		}

		return var0 + var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ah(int var0) {
		bq var2 = (bq)(bq)cz.ak_fld.get(var0);
		return var2 == null ? 0 : var2.az(1126813738);
	}

	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Ljava/lang/String;"
	)
	public static String wp(aax var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak(-698622201);
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lli;)Z"
	)
	public static boolean fa(li var0) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.cq()) {
			return false;
		} else {
			boolean var1 = false;
			if (var0.am_fld.ae() > var0.bs_fld) {
				var0.am_fld.aq(405294111 * var0.bs_fld, var0.am_fld.ae(), -1275020628);
				var1 = true;
			}

			int var2 = var0.cx();
			if (var0.am_fld.aj() > var2) {
				int var3 = zg.vd(var0.am_fld, 0, var2, (byte)27) - 1;
				var0.am_fld.aq(var3, var0.am_fld.ae(), -1942876164);
				var1 = true;
			}

			if (var1) {
				int var6 = var0.bm_fld;
				int var4 = 1123580313 * var0.bd_fld;
				int var5 = var0.am_fld.ae();
				if (var0.bm_fld > var5) {
					var6 = var5;
				}

				if (var0.bd_fld > var5) {
					var4 = var5;
				}

				li.ik(var0, var4, var6, (byte)-52);
			}

			return var1;
		}
	}
}
