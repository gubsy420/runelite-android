import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tg")
public class tg implements lh, MouseWheelListener {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -652520411
	)
	int ak_fld = 0;

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ltg;Ljava/awt/Component;)V"
	)
	public static void lv(tg var0, Component var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.removeMouseWheelListener(var0);
	}

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
	@Export("mouseWheelMoved")
	@Override
	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		var1 = og.ci_fld.getCallbacks().mouseWheelMoved(var1);
		if (!var1.isConsumed()) {
			this.ak_fld = this.ak_fld + var1.getWheelRotation() * -824924243;
		}
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

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Lwz;)V"
	)
	public static void mo(wz var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.af((short)23418);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	void ay(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)Z"
	)
	public static boolean mq(cn var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aw_fld;
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
}
