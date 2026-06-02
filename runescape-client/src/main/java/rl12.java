import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl12")
class rl12 extends ComponentAdapter {
	// $VF: synthetic field
	@ObfuscatedName("zk")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	public tf zk_fld;

	@ObfuscatedName("componentResized")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/ComponentEvent;)V"
	)
	@Override
	public void componentResized(ComponentEvent var1) {
		this.zk_fld.sd_fld = this.zk_fld.sa_fld.getSize();
	}

	public rl12(tf var1) {
		this.zk_fld = var1;
	}
}
