import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tj")
public class tj implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 239763703
	)
	public static int ah_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1541106701
	)
	public static int as_fld = 0;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1655706797
	)
	public static int ae_fld = 0;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -986603765
	)
	public static volatile int an_fld = -893170851;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 2971777033881788867L
	)
	public static long aw_fld = 0L;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 650181903
	)
	public static int ay_fld = 0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -745911063
	)
	public static volatile int am_fld = 0;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -696668623
	)
	public static int ar_fld = 0;
	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int zs_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 1647697972015203379L
	)
	public static long af_fld = 0L;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	public static tj al_fld = new tj();
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1348315183
	)
	public static volatile int au_fld = 0;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1810582965
	)
	public static volatile int ax_fld = 0;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 520063087
	)
	public static int av_fld = 0;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1349112737
	)
	public static volatile int ad_fld = 0;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 5010146363439028381L
	)
	public static volatile long ai_fld = -8060177374858423733L;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1957580763
	)
	public static volatile int aq_fld = 0;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -73337183
	)
	public static volatile int aa_fld = 1090491039;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -7428537788650121477L
	)
	public static volatile long ao_fld = 0L;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bw_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bl_fld;

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Ltj;Ljava/awt/event/MouseEvent;)V"
	)
	public static void oq(tj var0, MouseEvent var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1.isPopupTrigger()) {
				var1.consume();
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I"
	)
	final int av(MouseEvent var1, byte var2) {
		int var3 = var1.getButton();
		if (var1.isAltDown() || 2 == var3) {
			return 4;
		} else {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		}
	}

	@ObfuscatedName("mousePressed")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	@Export("mousePressed")
	@Override
	public final synchronized void mousePressed(MouseEvent var1) {
		if (this.zs_fld == 0) {
			var1 = og.ci_fld.getCallbacks().mousePressed(var1);
		}

		if (!var1.isConsumed()) {
			this.zs_fld++;

			try {
				if (null != al_fld) {
					au_fld = 0;
					client.vq();
					am_fld = var1.getX();
					ad_fld = var1.getY() * -1061603633;
					ao_fld = lz.ak() * 1561039802566058621L;
					aq_fld = this.av(var1, (byte)10);
					if (aq_fld != 0) {
						ax_fld = 1141398239 * aq_fld;
					}
				}

				if (var1.isPopupTrigger()) {
					var1.consume();
				}
			} finally {
				this.zs_fld--;
			}
		}
	}

	@ObfuscatedName("mouseReleased")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	@Export("mouseReleased")
	@Override
	public final synchronized void mouseReleased(MouseEvent var1) {
		if (this.zs_fld == 0) {
			var1 = og.ci_fld.getCallbacks().mouseReleased(var1);
		}

		if (!var1.isConsumed()) {
			this.zs_fld++;

			try {
				if (null != al_fld) {
					au_fld = 0;
					client.vq();
					ax_fld = 0;
				}

				if (var1.isPopupTrigger()) {
					var1.consume();
				}
			} finally {
				this.zs_fld--;
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void bd(MouseEvent var1) {
		if (null != al_fld) {
			au_fld = 0;
			an_fld = -527047635;
			aa_fld = -892126275;
			ai_fld = var1.getWhen();
		}
	}

	@ObfuscatedName("mouseEntered")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	@Export("mouseEntered")
	@Override
	public final synchronized void mouseEntered(MouseEvent var1) {
		if (this.zs_fld == 0) {
			var1 = og.ci_fld.getCallbacks().mouseEntered(var1);
		}

		if (!var1.isConsumed()) {
			this.zs_fld++;

			try {
				this.mouseMoved(var1);
			} finally {
				this.zs_fld--;
			}
		}
	}

	@ObfuscatedName("mouseExited")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	@Export("mouseExited")
	@Override
	public final synchronized void mouseExited(MouseEvent var1) {
		if (this.zs_fld == 0) {
			var1 = og.ci_fld.getCallbacks().mouseExited(var1);
		}

		if (!var1.isConsumed()) {
			this.zs_fld++;

			try {
				if (null != al_fld) {
					au_fld = 0;
					client.vq();
					an_fld = -893170851;
					aa_fld = 1090491039;
					ai_fld = var1.getWhen();
				}
			} finally {
				this.zs_fld--;
			}
		}
	}

	@ObfuscatedName("mouseMoved")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	@Export("mouseMoved")
	@Override
	public final synchronized void mouseMoved(MouseEvent var1) {
		if (this.zs_fld == 0) {
			var1 = og.ci_fld.getCallbacks().mouseMoved(var1);
		}

		if (!var1.isConsumed()) {
			this.zs_fld++;

			try {
				if (al_fld != null) {
					au_fld = 0;
					client.vq();
					an_fld = var1.getX();
					aa_fld = var1.getY();
					ai_fld = var1.getWhen();
				}
			} finally {
				this.zs_fld--;
			}
		}
	}

	@ObfuscatedName("afo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afo(FocusEvent var1) {
	}

	@ObfuscatedName("focusLost")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	@Export("focusLost")
	@Override
	public final synchronized void focusLost(FocusEvent var1) {
		if (null != al_fld) {
			ax_fld = 0;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	static void ae(Component var0) {
		var0.addMouseListener(al_fld);
		var0.addMouseMotionListener(al_fld);
		var0.addFocusListener(al_fld);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	static void ah(Component var0) {
		var0.addMouseListener(al_fld);
		var0.addMouseMotionListener(al_fld);
		var0.addFocusListener(al_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	static void aw(Component var0) {
		var0.addMouseListener(al_fld);
		var0.addMouseMotionListener(al_fld);
		var0.addFocusListener(al_fld);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void bz(MouseEvent var1) {
		if (null != al_fld) {
			au_fld = 0;
			ax_fld = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	static void as(Component var0) {
		var0.addMouseListener(al_fld);
		var0.addMouseMotionListener(al_fld);
		var0.addFocusListener(al_fld);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int ar() {
		return (au_fld += -1864675613) * -1348315183 - 1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void bk(MouseEvent var1) {
		if (null != al_fld) {
			au_fld = 0;
			am_fld = var1.getX();
			ad_fld = var1.getY() * -1061603633;
			ao_fld = lz.ak() * 1561039802566058621L;
			aq_fld = this.av(var1, (byte)30);
			if (aq_fld != 0) {
				ax_fld = -1013614354 * aq_fld;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int al() {
		return (au_fld += -453549775) * -1348315183 - 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int au() {
		return (au_fld += -453549775) * -1348315183 - 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int ax() {
		return (au_fld += -453549775) * -1348315183 - 1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void bm(MouseEvent var1) {
		if (al_fld != null) {
			au_fld = 0;
			an_fld = var1.getX();
			aa_fld = var1.getY() * 1343338076;
			ai_fld = var1.getWhen();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void aa(int var0) {
		au_fld = 1301562575 * var0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)I"
	)
	final int ai(MouseEvent var1) {
		int var2 = var1.getButton();
		if (var1.isAltDown() || 2 == var2) {
			return 4;
		} else {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		}
	}

	@ObfuscatedName("afn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afn(FocusEvent var1) {
		if (null != al_fld) {
			ax_fld = 0;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void aj(MouseEvent var1) {
		if (null != al_fld) {
			au_fld = 0;
			ax_fld = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@ObfuscatedName("mouseClicked")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	@Export("mouseClicked")
	@Override
	public final void mouseClicked(MouseEvent var1) {
		var1 = og.ci_fld.getCallbacks().mouseClicked(var1);
		if (!var1.isConsumed() && var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@ObfuscatedName("mouseDragged")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	@Export("mouseDragged")
	@Override
	public final synchronized void mouseDragged(MouseEvent var1) {
		if (this.zs_fld == 0) {
			var1 = og.ci_fld.getCallbacks().mouseDragged(var1);
		}

		if (!var1.isConsumed()) {
			this.zs_fld++;

			try {
				this.mouseMoved(var1);
			} finally {
				this.zs_fld--;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void ac(MouseEvent var1) {
		if (al_fld != null) {
			au_fld = 0;
			an_fld = var1.getX();
			aa_fld = var1.getY();
			ai_fld = var1.getWhen();
		}
	}

	tj() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void am(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void aq(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;)V"
	)
	static void ay(Component var0) {
		var0.addMouseListener(al_fld);
		var0.addMouseMotionListener(al_fld);
		var0.addFocusListener(al_fld);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void bh(MouseEvent var1) {
		if (null != al_fld) {
			au_fld = 0;
			an_fld = -670808577;
			aa_fld = 1924089922;
			ai_fld = var1.getWhen();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public static void an(int var0) {
		au_fld = -302336477 * var0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void ad(MouseEvent var1) {
		if (al_fld != null) {
			au_fld = 0;
			an_fld = var1.getX();
			aa_fld = var1.getY();
			ai_fld = var1.getWhen();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltj;Ljava/awt/event/MouseEvent;)V"
	)
	public static void av(tj var0, MouseEvent var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var1.isPopupTrigger()) {
				var1.consume();
			}
		}
	}

	@ObfuscatedName("focusGained")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	@Export("focusGained")
	@Override
	public final void focusGained(FocusEvent var1) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final void ab(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public static int af() {
		return (au_fld += -453549775) * -1348315183 - 1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void be(MouseEvent var1) {
		if (al_fld != null) {
			au_fld = 0;
			an_fld = var1.getX();
			aa_fld = var1.getY() * -1306674708;
			ai_fld = var1.getWhen();
		}
	}

	@ObfuscatedName("afl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afl(FocusEvent var1) {
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void bs(MouseEvent var1) {
		if (null != al_fld) {
			au_fld = 0;
			an_fld = -893170851;
			aa_fld = 1090491039;
			ai_fld = var1.getWhen();
		}
	}

	@ObfuscatedName("afz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void afz(FocusEvent var1) {
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void br(MouseEvent var1) {
		if (al_fld != null) {
			au_fld = 0;
			an_fld = var1.getX();
			aa_fld = var1.getY();
			ai_fld = var1.getWhen();
		}
	}

	@ObfuscatedName("afi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afi(FocusEvent var1) {
		if (null != al_fld) {
			ax_fld = 0;
		}
	}

	@ObfuscatedName("afe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afe(FocusEvent var1) {
		if (null != al_fld) {
			ax_fld = 0;
		}
	}

	@ObfuscatedName("afr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void afr(FocusEvent var1) {
		if (null != al_fld) {
			ax_fld = 0;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final void at(MouseEvent var1) {
		if (null != al_fld) {
			am_fld = 0;
			am_fld = var1.getX();
			an_fld = var1.getY() * -1061603633;
			ao_fld = lz.ak() * 1561039802566058621L;
			ad_fld = this.av(var1, (byte)30) * -1217588141;
			if (aq_fld != 0) {
				aq_fld = -1013614354 * aa_fld;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}
}
