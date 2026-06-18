import java.awt.event.WindowEvent;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xm")
public interface xm {
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	default int sv() {
		return this.ag(3111403);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ag(int var1);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av();

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Ltf;Ljava/awt/event/WindowEvent;)V"
	)
	static void hj(tf var0, WindowEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ae();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ah();
}
