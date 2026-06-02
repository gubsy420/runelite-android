import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tg")
public class tg implements lh, MouseWheelListener {
	@ObfuscatedGetter(
		intValue = -652520411
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld = 0;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public synchronized int av() {
		int var1 = 8278843 * this.ak_fld;
		this.ak_fld = 0;
		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public synchronized int az() {
		int var1 = 1488928677 * this.ak_fld;
		this.ak_fld = 0;
		return var1;
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(Lrr;)I"
	)
	public static int pv(rr var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V"
	)
	void aw(Component var1, int var2) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("mouseWheelMoved")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseWheelEvent;)V"
	)
	@Override
	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		var1 = og.ci_fld.getCallbacks().mouseWheelMoved(var1);
		if (!var1.isConsumed()) {
			this.ak_fld = this.ak_fld + var1.getWheelRotation() * -824924243;
		}
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(Lgn;III)V"
	)
	public static void dj(gn var0, int var1, int var2, int var3) {
		var0.as(var1 - var0.by_fld, var2 - var0.bl_fld, var3, 1178493659);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public synchronized int ak(int var1) {
		int var2 = this.ak_fld;
		this.ak_fld = 0;
		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public synchronized int ag() {
		int var1 = this.ak_fld;
		this.ak_fld = 0;
		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	void af(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	void ar(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public synchronized int ae() {
		int var1 = this.ak_fld;
		this.ak_fld = 0;
		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	void as(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V"
	)
	void ah(Component var1, byte var2) {
		var1.addMouseWheelListener(this);
	}

	tg() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	void ay(Component var1) {
		var1.addMouseWheelListener(this);
	}
}
