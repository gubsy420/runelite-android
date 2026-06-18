import java.awt.Graphics;
import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gb")
public class gb {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 455105703
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

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lte;Ljava/awt/Graphics;II)V"
	)
	public static void hh(te var0, Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(var0.ak_fld, var2, var3, var0.ag_fld);
		} catch (Exception var5) {
			var0.ag_fld.repaint();
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public static void be(rh var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = rw.ak_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I"
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

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Z)Lkt;"
	)
	public static kt ig(rg var0, boolean var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 ? kt.ag_fld : oy.bz(var0.aw_fld, (byte)59);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	static int ah(int var0) {
		bq var2 = (bq)(bq)cz.ak_fld.get(var0);
		return var2 == null ? 0 : var2.az(1126813738);
	}
}
