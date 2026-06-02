import java.awt.Font;
import java.io.EOFException;
import net.runelite.api.WidgetNode;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements({"WidgetNode"})
public class pk extends vw implements WidgetNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedGetter(
		intValue = 1840969525
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean az_fld = false;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Ljava/awt/Font;"
	)
	static Font rp_fld;
	@ObfuscatedGetter(
		intValue = -1786860027
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;

	pk() {
	}

	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "(Luk;)Llu;"
	)
	public static lu wo(uk var0) {
		return var0.ak_fld;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getId() {
		return this.ak_fld;
	}

	@ObfuscatedName("getModalMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getModalMode() {
		return this.ag_fld;
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "(Laq;)I"
	)
	public static int ee(aq var0) {
		return var0.ab_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIZLuo;Lqg;)V"
	)
	public static final void az(int var0, int var1, int var2, boolean var3, uo var4, qg var5) throws EOFException {
		try {
			if (var4.az(var0)) {
				fm.av(var4.aw_fld[var0], 0, var4.aw_fld[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, -1235051868);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}
}
