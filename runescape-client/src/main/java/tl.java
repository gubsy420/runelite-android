import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.events.FocusChanged;

@ObfuscatedName("tl")
public class tl implements KeyListener, FocusListener {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Collection;"
	)
	Collection av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] ag_fld = new boolean[112];
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/Collection;"
	)
	Collection ae_fld;
	@ObfuscatedGetter(
		intValue = 16851769
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	volatile int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lts;"
	)
	ts[] az_fld = new ts[3];
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean ks_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V"
	)
	void av(Component var1, int var2) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	synchronized void aw(int var1) {
		Collection var2 = this.ae_fld;
		this.ae_fld = this.av_fld;
		this.av_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ag(int var1) {
		return this.ah_fld;
	}

	tl() {
		this.ah_fld = 0;
		this.av_fld = new ArrayList(100);
		this.ae_fld = new ArrayList(100);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lts;I)V"
	)
	void ar(ts var1, int var2) {
		this.az_fld[var2] = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V"
	)
	synchronized void ae(Component var1, int var2) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized (this) {
			this.av_fld.add(new ta(4, 0));
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void bl(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < ou.az(737059444)) {
			var2 = bn.ag(var2) & -129;
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.ag_fld[var2] = false;
			this.av_fld.add(new ta(2, var2));
		}

		var1.consume();
	}

	@ObfuscatedName("keyReleased")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	@Override
	public final synchronized void keyReleased(KeyEvent var1) {
		if (!ny(var1)) {
			og.ci_fld.getCallbacks().keyReleased(var1);
		}

		ta.yg_fld = var1.isConsumed();
		int var4 = var1.getKeyCode();
		if (var4 >= 0 && var4 < ou.az(1829510242)) {
			var4 = bn.ag(var4) & -129;
		} else {
			var4 = -1;
		}

		if (var4 >= 0) {
			this.ag_fld[var4] = false;
			this.av_fld.add(new ta(2, var4));
		}

		var1.consume();
		ta.yg_fld = false;
	}

	@ObfuscatedName("keyTyped")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	@Override
	public final synchronized void keyTyped(KeyEvent var1) {
		if (!ny(var1)) {
			og.ci_fld.getCallbacks().keyTyped(var1);
		}

		ta.yg_fld = var1.isConsumed();
		char var4 = var1.getKeyChar();
		if (0 != var4 && '\uffff' != var4) {
			boolean var5;
			label52:
			if ((var4 <= 0 || var4 >= 128) && (var4 < 160 || var4 > 255)) {
				if (var4 != 0) {
					char[] var6 = nt.ak_fld;

					for (int var7 = 0; var7 < var6.length; var7++) {
						char var8 = var6[var7];
						if (var4 == var8) {
							var5 = true;
							break label52;
						}
					}
				}

				var5 = false;
			} else {
				var5 = true;
			}

			if (var5) {
				this.av_fld.add(new ta(3, var4));
			}
		}

		var1.consume();
		ta.yg_fld = false;
	}

	@ObfuscatedName("focusGained")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	@Override
	public final synchronized void focusGained(FocusEvent var1) {
		this.av_fld.add(new ta(4, 1));
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ar() {
		return this.ah_fld;
	}

	@ObfuscatedName("afl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afl(FocusEvent var1) {
		this.av_fld.add(new ta(4, 1));
	}

	@ObfuscatedName("focusLost")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	@Override
	public final synchronized void focusLost(FocusEvent var1) {
		this.eb(var1);

		for (int var2 = 0; var2 < 112; var2++) {
			if (this.ag_fld[var2]) {
				this.ag_fld[var2] = false;
				this.av_fld.add(new ta(2, var2));
			}
		}

		this.av_fld.add(new ta(4, 0));
	}

	@ObfuscatedName("afz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afz(FocusEvent var1) {
		this.av_fld.add(new ta(4, 1));
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	synchronized void br() {
		Collection var1 = this.ae_fld;
		this.ae_fld = this.av_fld;
		this.av_fld = var1;
	}

	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "()[Z"
	)
	public boolean[] to() {
		return this.ag_fld;
	}

	@ObfuscatedName("afo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afo(FocusEvent var1) {
		this.av_fld.add(new ta(4, 1));
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	void am(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("afe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afe(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; var2++) {
			if (this.ag_fld[var2]) {
				this.ag_fld[var2] = false;
				this.av_fld.add(new ta(2, var2));
			}
		}

		this.av_fld.add(new ta(4, 0));
	}

	@ObfuscatedName("afr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afr(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; var2++) {
			if (this.ag_fld[var2]) {
				this.ag_fld[var2] = false;
				this.av_fld.add(new ta(2, var2));
			}
		}

		this.av_fld.add(new ta(4, 0));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean az(int var1) {
		return this.ah_fld <= 1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void bx(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < ou.az(-1198727095)) {
			var2 = bn.ag(var2) & -129;
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.ag_fld[var2] = false;
			this.av_fld.add(new ta(2, var2));
		}

		var1.consume();
	}

	@ObfuscatedName("afi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afi(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; var2++) {
			if (this.ag_fld[var2]) {
				this.ag_fld[var2] = false;
				this.av_fld.add(new ta(2, var2));
			}
		}

		this.av_fld.add(new ta(4, 0));
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public void eb(FocusEvent var1) {
		FocusChanged var2 = new FocusChanged();
		var2.setFocused(false);
		og.ci_fld.getCallbacks().post(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int au() {
		return this.ah_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean an() {
		return this.ah_fld <= 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aj() {
		this.ah_fld += -1724859623;
		this.aw(2111279219);
		Iterator var1 = this.ae_fld.iterator();

		while (var1.hasNext()) {
			ta var2 = (ta)(ta)var1.next();
			int var3 = 0;

			while (var3 < this.az_fld.length && !var2.ak(this.az_fld[var3])) {
				var3++;
			}
		}

		this.ae_fld.clear();
	}

	@ObfuscatedName("keyPressed")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	@Override
	public final synchronized void keyPressed(KeyEvent var1) {
		if (!ny(var1)) {
			og.ci_fld.getCallbacks().keyPressed(var1);
		}

		ta.yg_fld = var1.isConsumed();
		int var4 = var1.getKeyCode();
		if (var4 >= 0 && var4 < ou.az(-1964848360)) {
			var4 = bn.ag(var4);
			if (qm.av(var4)) {
				var4 = -1;
			}
		} else {
			var4 = -1;
		}

		if (var4 >= 0) {
			if (!this.ag_fld[var4]) {
				this.ah_fld = 0;
			}

			this.ag_fld[var4] = true;
			this.av_fld.add(new ta(1, var4));
		}

		var1.consume();
		ta.yg_fld = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	synchronized void ab(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized (this) {
			this.av_fld.add(new ta(4, 0));
		}
	}

	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lts;I)V"
	)
	public static void wr(tl var0, ts var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld[var2] = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	void ad(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	void ao(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	synchronized void at(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized (this) {
			this.av_fld.add(new ta(4, 0));
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aa() {
		return this.ah_fld <= 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	synchronized void ac(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized (this) {
			this.av_fld.add(new ta(4, 0));
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	synchronized void ap(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized (this) {
			this.av_fld.add(new ta(4, 0));
		}
	}

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V"
	)
	public static void vm(tl var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ah_fld++;
			var0.aw(582496563);
			Iterator var2 = var0.ae_fld.iterator();

			while (var2.hasNext()) {
				ta var3 = (ta)(ta)var2.next();

				for (int var4 = 0; var4 < var0.az_fld.length; var4++) {
					if (var1 >= 0) {
						return;
					}

					if (var3.ak(var0.az_fld[var4])) {
						break;
					}
				}
			}

			var0.ae_fld.clear();
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)Z"
	)
	public static boolean ny(KeyEvent var0) {
		return (og.ci_fld.oq() == 10 || og.ci_fld.oq() == 11) && og.ci_fld.getCurrentLoginField() == 1 && !var0.isMetaDown() && !var0.isControlDown();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lts;I)V"
	)
	void af(ts var1, int var2) {
		this.az_fld[var2] = var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bm() {
		this.ah_fld++;
		this.aw(479698170);
		Iterator var1 = this.ae_fld.iterator();

		while (var1.hasNext()) {
			ta var2 = (ta)(ta)var1.next();
			int var3 = 0;

			while (var3 < this.az_fld.length && !var2.ak(this.az_fld[var3])) {
				var3++;
			}
		}

		this.ae_fld.clear();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void bj(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < ou.az(715327999)) {
			var2 = bn.ag(var2);
			if (qm.av(var2)) {
				var2 = -1;
			}
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.ag_fld[var2]) {
				this.ah_fld = 0;
			}

			this.ag_fld[var2] = true;
			this.av_fld.add(new ta(1, var2));
		}

		var1.consume();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void bf(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < ou.az(1231309507)) {
			var2 = bn.ag(var2);
			if (qm.av(var2)) {
				var2 = -1;
			}
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.ag_fld[var2]) {
				this.ah_fld = 0;
			}

			this.ag_fld[var2] = true;
			this.av_fld.add(new ta(1, var2));
		}

		var1.consume();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void by(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < ou.az(-1959051908)) {
			var2 = bn.ag(var2) & -129;
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.ag_fld[var2] = false;
			this.av_fld.add(new ta(2, var2));
		}

		var1.consume();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ai() {
		return this.ah_fld <= 1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void bo(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (0 != var2 && '\uffff' != var2) {
			boolean var3;
			label48:
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 925668622)) {
				if (var2 != 0) {
					char[] var4 = nt.ak_fld;

					for (int var5 = 0; var5 < var4.length; var5++) {
						char var6 = var4[var5];
						if (var2 == var6) {
							var3 = true;
							break label48;
						}
					}
				}

				var3 = false;
			} else {
				var3 = true;
			}

			if (var3) {
				this.av_fld.add(new ta(3, var2));
			}
		}

		var1.consume();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void bp(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (0 != var2 && 1632152152 != var2) {
			boolean var3;
			label49:
			if ((var2 <= 0 || var2 >= -786494156) && (var2 < 829084939 || var2 > 255)) {
				if (var2 != 0) {
					char[] var4 = nt.ak_fld;

					for (int var5 = 0; var5 < var4.length; var5++) {
						char var6 = var4[var5];
						if (var2 == var6) {
							var3 = true;
							break label49;
						}
					}
				}

				var3 = false;
			} else {
				var3 = true;
			}

			if (var3) {
				this.av_fld.add(new ta(3, var2));
			}
		}

		var1.consume();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	synchronized void bd() {
		Collection var1 = this.ae_fld;
		this.ae_fld = this.av_fld;
		this.av_fld = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	synchronized void bz() {
		Collection var1 = this.ae_fld;
		this.ae_fld = this.av_fld;
		this.av_fld = var1;
	}

	@ObfuscatedName("afn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afn(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; var2++) {
			if (this.ag_fld[var2]) {
				this.ag_fld[var2] = false;
				this.av_fld.add(new ta(2, var2));
			}
		}

		this.av_fld.add(new ta(4, 0));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void ah(byte var1) {
		this.ah_fld++;
		this.aw(582496563);
		Iterator var2 = this.av_fld.iterator();

		while (var2.hasNext()) {
			ta var3 = (ta)(ta)var2.next();

			for (int var4 = 0; var4 < this.az_fld.length; var4++) {
				if (var1 >= 0) {
					return;
				}

				if (var3.ak(this.az_fld[var4])) {
					break;
				}
			}
		}

		this.ae_fld.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lts;II)V"
	)
	void ak(ts var1, int var2, int var3) {
		this.az_fld[var2] = var1;
	}
}
