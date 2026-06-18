import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tx")
public class tx {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[[S"
	)
	static short[][][] al_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public static void az(String var0) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(var0));
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public static void ag(String var0) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(var0));
			} catch (Exception var2) {
			}
		}
	}

	tx() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)V"
	)
	public static void av(String var0) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(var0));
			} catch (Exception var2) {
			}
		}
	}
}
