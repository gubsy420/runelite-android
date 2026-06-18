import java.awt.Font;
import java.io.EOFException;
import net.runelite.api.WidgetNode;
import net.runelite.api.annotations.Export;
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
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1840969525
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
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1786860027
	)
	public int ak_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int cc(da var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.cg_fld.af_fld * 1878866955;
	}

	@ObfuscatedName("getId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getId")
	@Override
	public int getId() {
		return this.ak_fld;
	}

	@ObfuscatedName("getModalMode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getModalMode")
	@Override
	public int getModalMode() {
		return this.ag_fld;
	}

	pk() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIZLuo;Lqg;B)V"
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
