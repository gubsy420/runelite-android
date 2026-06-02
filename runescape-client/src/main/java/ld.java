import java.io.EOFException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ld")
public class ld {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	ln ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	sc az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	public li ak_fld = new li();
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Ljava/lang/Object;"
	)
	public Object[] aw_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lyv;"
	)
	static yv au_fld;

	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "(Lhg;II)I"
	)
	public static int uy(hg var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (9 == var2) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = 3 + var1 & 3;
		}

		if (11 == var2) {
			var1 = 3 + var1 & 3;
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)Lsp;"
	)
	public static sp ak(ub var0, ub var1, int var2) throws EOFException {
		boolean var4 = pl.ag(var0, var1, var2);
		if (!var4) {
			return null;
		} else {
			if (sp.ag_fld == null) {
				sp.ak_fld = Runtime.getRuntime().availableProcessors();
				sp.ag_fld = new ThreadPoolExecutor(0, sp.ak_fld, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(sp.ak_fld + 100), new sh());
			}

			try {
				return new sp(var0, var1, var2);
			} catch (Exception var6) {
				return null;
			}
		}
	}

	ld() {
		this.ag_fld = new ln();
		this.az_fld = new sc();
	}
}
