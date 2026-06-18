import java.awt.Graphics;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xa")
public class xa {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ae_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aw_fld;

	xa() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean az(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || 13 == var0 || var0 == 14 || var0 == 15 || 16 == var0 || var0 == 17;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lte;Ljava/awt/Graphics;II)V"
	)
	public static void bq(te var0, Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(var0.ak_fld, var2, var3, var0.ag_fld);
		} catch (Exception var5) {
			var0.ag_fld.repaint();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean av(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || 13 == var0 || var0 == 14 || var0 == 15 || 16 == var0 || var0 == 17;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean ae(int var0) {
		return 18 == var0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean ah(int var0) {
		return 18 == var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public static boolean aw(int var0) {
		return 18 == var0;
	}
}
