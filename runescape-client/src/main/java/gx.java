import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gx")
public class gx {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	static gx ak_fld = new gx(0);
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "[Lyc;"
	)
	static yc[] dr_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 149085321
	)
	int az_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ac_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	static gx ag_fld = new gx(1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Los;"
	)
	public static os ak(int var0) throws EOFException {
		os var2 = (os)os.ar_fld.ak(var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = de.as_fld.bb(8, var0, 584982574);
			var2 = new os();
			if (null != var3) {
				os.ev(var2, new xi(var3), 1588184676);
			}

			os.ar_fld.az(var2, var0);
			return var2;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int ag(int var0, int var1) {
		bg var3 = (bg)xz.tw(bg.ak_fld, var0);
		if (null == var3) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.az_fld.length ? var3.az_fld[var1] : 0;
		}
	}

	gx(int var1) {
		this.az_fld = var1;
	}
}
