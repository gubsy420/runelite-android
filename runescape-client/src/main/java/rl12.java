import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rl12")
class rl12 extends ComponentAdapter {
	// $VF: synthetic field
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	public tf ce_fld;

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lda;ILxj;)V"
	)
	public static void dh(da var0, int var1, xj var2) {
		bb.pt(var0.cg_fld, var1, var2, (byte)-51);
	}

	@ObfuscatedName("componentResized")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/ComponentEvent;)V"
	)
	@Export("componentResized")
	@Override
	public void componentResized(ComponentEvent var1) {
		this.ce_fld.qm_java_awt_Dimension = this.ce_fld.sa_fld.getSize();
	}

	public rl12(tf var1) {
		this.ce_fld = var1;
	}
}
