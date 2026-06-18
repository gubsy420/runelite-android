import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ra")
public class ra {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lqe;)Ljava/lang/String;"
	)
	public static String nn(qe var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcx;)Ldx;"
	)
	public static dx aw(int var0, cx var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();
			if (var3.ax_fld.ae(var0) != null) {
				return var3;
			}
		}

		return cx.gw(var1, -225377813);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcx;)Ldx;"
	)
	public static dx az(int var0, cx var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();
			cv var4 = (cv)var3.au_fld.ae(var0);
			if (var4 != null && !var3.ak(-787091592)) {
				return var3;
			}
		}

		return cx.gw(var1, -225377813);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcx;)Ldx;"
	)
	public static dx av(int var0, cx var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();
			cv var4 = (cv)var3.au_fld.ae(var0);
			if (var4 != null && !var3.ak(-787091592)) {
				return var3;
			}
		}

		return cx.gw(var1, -225377813);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcx;)Ldx;"
	)
	public static dx ah(int var0, cx var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();
			if (var3.ax_fld.ae(var0) != null) {
				return var3;
			}
		}

		return cx.gw(var1, -225377813);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILcx;)Ldx;"
	)
	public static dx ae(int var0, cx var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			dx var3 = (dx)(dx)var2.next();
			if (var3.ax_fld.ae(var0) != null) {
				return var3;
			}
		}

		return cx.gw(var1, -225377813);
	}

	ra() throws Throwable {
		throw new Error();
	}
}
