import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.Menu;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.Widget;

@ObfuscatedName("rl5")
@Implements({"MenuEntry"})
public class rl5 implements MenuEntry {
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/function/Consumer;"
	)
	public Consumer le_fld;
	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	public wz qp_fld;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int sj_fld;

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "()Lwz;"
	)
	public wz getSubMenu() {
		return this.qp_fld.af_fld[this.sj_fld];
	}

	@ObfuscatedName("getItemOp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getItemOp")
	@Override
	public int getItemOp() {
		try {
			MenuAction var1 = this.getType();
			if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY || var1 == MenuAction.RUNELITE_WIDGET) {
				int var2 = this.qp_fld.ah_fld[this.sj_fld];
				int var3 = this.qp_fld.av_fld[this.sj_fld];
				int var4 = this.qp_fld.az_fld[this.sj_fld];
				if (var3 == 9764864) {
					switch (var2) {
						case 1:
							lu var5 = og.ci_fld.getWidget(var3);
							if (var5 != null && var4 != -1) {
								Widget var9 = var5.getChild(var4);
								if (var9 != null && var9.getItemId() > -1) {
									int var6 = og.ci_fld.df(var9.getItemId()).getShiftClickActionIndex();
									if (var6 >= 0) {
										return var6 + 1;
									}
								}
							}
							break;
						case 2:
							return 1;
						case 3:
							return 2;
						case 4:
							return 3;
						case 5:
						default:
							break;
						case 6:
							return 4;
						case 7:
							return 5;
					}
				}
			}

			return -1;
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}

	@ObfuscatedName("isDeprioritized")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isDeprioritized")
	@Override
	public boolean isDeprioritized() {
		return this.qp_fld.ae_fld[this.sj_fld] >= 2000;
	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/function/Consumer;)Lrl5;"
	)
	public rl5 onClick(Consumer var1) {
		this.le_fld = var1;
		return this;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean hf(Object var1) {
		return var1 instanceof rl5;
	}

	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int wc(pi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ai_fld;
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setItemId(int var1) {
		this.qp_fld.aw_fld[this.sj_fld] = var1;
		return this;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setWorldViewId(int var1) {
		this.qp_fld.ay_fld[this.sj_fld] = var1;
		return this;
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("hashCode")
	@Override
	public int hashCode() {
		byte var1 = 59;
		byte var2 = 1;
		int var6 = var2 * 59 + this.getIdentifier();
		var6 = var6 * 59 + this.getParam0();
		var6 = var6 * 59 + this.getParam1();
		var6 = var6 * 59 + this.getItemId();
		var6 = var6 * 59 + (this.isForceLeftClick() ? 79 : 97);
		var6 = var6 * 59 + this.getWorldViewId();
		var6 = var6 * 59 + (this.isDeprioritized() ? 79 : 97);
		String var3 = this.getOption();
		var6 = var6 * 59 + (var3 == null ? 43 : var3.hashCode());
		String var4 = this.getTarget();
		var6 = var6 * 59 + (var4 == null ? 43 : var4.hashCode());
		MenuAction var5 = this.getType();
		return var6 * 59 + (var5 == null ? 43 : var5.hashCode());
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else if (!(var1 instanceof rl5)) {
			return false;
		} else {
			rl5 var2 = (rl5)var1;
			if (!var2.hf(this)) {
				return false;
			} else if (this.getIdentifier() != var2.getIdentifier()) {
				return false;
			} else if (this.getParam0() != var2.getParam0()) {
				return false;
			} else if (this.getParam1() != var2.getParam1()) {
				return false;
			} else if (this.getItemId() != var2.getItemId()) {
				return false;
			} else if (this.isForceLeftClick() != var2.isForceLeftClick()) {
				return false;
			} else if (this.getWorldViewId() != var2.getWorldViewId()) {
				return false;
			} else if (this.isDeprioritized() != var2.isDeprioritized()) {
				return false;
			} else {
				String var3 = this.getOption();
				String var4 = var2.getOption();
				if (var3 == null ? var4 == null : var3.equals(var4)) {
					String var5 = this.getTarget();
					String var6 = var2.getTarget();
					if (var5 == null ? var6 == null : var5.equals(var6)) {
						MenuAction var7 = this.getType();
						MenuAction var8 = var2.getType();
						return var7 == null ? var8 == null : var7.equals(var8);
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("getParam1")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getParam1")
	@Override
	public int getParam1() {
		return this.qp_fld.av_fld[this.sj_fld];
	}

	@ObfuscatedName("xe")
	@ObfuscatedSignature(
		descriptor = "(Lsl;)[J"
	)
	public static long[] xe(sl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ay_fld;
	}

	@ObfuscatedName("getParam0")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getParam0")
	@Override
	public int getParam0() {
		return this.qp_fld.az_fld[this.sj_fld];
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("toString")
	@Override
	public String toString() {
		return "MenuEntryImpl(getOption="
			+ this.getOption()
			+ ", getTarget="
			+ this.getTarget()
			+ ", getIdentifier="
			+ this.getIdentifier()
			+ ", getType="
			+ this.getType()
			+ ", getParam0="
			+ this.getParam0()
			+ ", getParam1="
			+ this.getParam1()
			+ ", getItemId="
			+ this.getItemId()
			+ ", isForceLeftClick="
			+ this.isForceLeftClick()
			+ ", getWorldViewId="
			+ this.getWorldViewId()
			+ ", isDeprioritized="
			+ this.isDeprioritized()
			+ ")";
	}

	@ObfuscatedName("getWorldViewId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWorldViewId")
	@Override
	public int getWorldViewId() {
		return this.qp_fld.ay_fld[this.sj_fld];
	}

	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lrl5;"
	)
	public rl5 setOption(String var1) {
		this.qp_fld.as_fld[this.sj_fld] = var1;
		return this;
	}

	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/MenuAction;)Lrl5;"
	)
	public rl5 setType(MenuAction var1) {
		int var2 = this.qp_fld.ae_fld[this.sj_fld];
		short var3 = 0;
		if (var2 >= 2000) {
			var3 = 2000;
		}

		this.qp_fld.ae_fld[this.sj_fld] = var1.getId() + var3;
		return this;
	}

	@ObfuscatedName("isItemOp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isItemOp")
	@Override
	public boolean isItemOp() {
		MenuAction var1 = this.getType();
		if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY || var1 == MenuAction.RUNELITE_WIDGET) {
			int var2 = this.qp_fld.ah_fld[this.sj_fld];
			int var3 = this.qp_fld.av_fld[this.sj_fld];
			if (var3 == 9764864) {
				switch (var2) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 6:
					case 7:
						return true;
					case 5:
				}
			}
		}

		return false;
	}

	@ObfuscatedName("getTarget")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getTarget")
	@Override
	public String getTarget() {
		return this.qp_fld.ar_fld[this.sj_fld];
	}

	@ObfuscatedName("onClick")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/function/Consumer;"
	)
	@Export("onClick")
	@Override
	public Consumer onClick() {
		return this.le_fld;
	}

	@ObfuscatedName("getItemId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getItemId")
	@Override
	public int getItemId() {
		return this.qp_fld.aw_fld[this.sj_fld];
	}

	@ObfuscatedName("getOption")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Export("getOption")
	@Override
	public String getOption() {
		return this.qp_fld.as_fld[this.sj_fld];
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Z)Lrl5;"
	)
	public rl5 setForceLeftClick(boolean var1) {
		this.qp_fld.al_fld[this.sj_fld] = var1;
		return this;
	}

	@ObfuscatedName("setDeprioritized")
	@ObfuscatedSignature(
		descriptor = "(Z)Lnet/runelite/api/MenuEntry;"
	)
	@Export("setDeprioritized")
	@Override
	public MenuEntry setDeprioritized(boolean var1) {
		if (var1) {
			if (this.qp_fld.ae_fld[this.sj_fld] < 2000) {
				this.qp_fld.ae_fld[this.sj_fld] = this.qp_fld.ae_fld[this.sj_fld] + 2000;
			}
		} else if (this.qp_fld.ae_fld[this.sj_fld] >= 2000) {
			this.qp_fld.ae_fld[this.sj_fld] = this.qp_fld.ae_fld[this.sj_fld] - 2000;
		}

		return this;
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setParam1(int var1) {
		this.qp_fld.av_fld[this.sj_fld] = var1;
		return this;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setParam0(int var1) {
		this.qp_fld.az_fld[this.sj_fld] = var1;
		return this;
	}

	@ObfuscatedName("zu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lrl5;"
	)
	public rl5 setTarget(String var1) {
		this.qp_fld.ar_fld[this.sj_fld] = var1;
		return this;
	}

	@Nullable
	@ObfuscatedName("getActor")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Actor;"
	)
	@Export("getActor")
	@Override
	public Actor getActor() {
		NPC var1 = this.getNpc();
		return (Actor)(var1 != null ? var1 : this.getPlayer());
	}

	@Nullable
	@ObfuscatedName("getNpc")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/NPC;"
	)
	@Export("getNpc")
	@Override
	public NPC getNpc() {
		switch (rl6.jd_fld[this.getType().ordinal()]) {
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
				dx var1 = this.be();
				int var2 = this.getIdentifier();
				return (NPC)(NPC)var1.ax_fld.av(var2);
			default:
				return null;
		}
	}

	@ObfuscatedName("deleteSubMenu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("deleteSubMenu")
	@Override
	public void deleteSubMenu() {
		this.qp_fld.af_fld[this.sj_fld] = null;
	}

	@Nullable
	@ObfuscatedName("getPlayer")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Player;"
	)
	@Export("getPlayer")
	@Override
	public Player getPlayer() {
		int var1 = this.getIdentifier();
		switch (rl6.jd_fld[this.getType().ordinal()]) {
			case 15:
				var1--;
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
				dx var2 = this.be();
				if (var2 == null) {
					return null;
				}

				return (Player)(Player)var2.au_fld.av(var1);
			default:
				return null;
		}
	}

	@ObfuscatedName("getWidget")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/widgets/Widget;"
	)
	@Export("getWidget")
	@Override
	public Widget getWidget() {
		switch (rl6.jd_fld[this.getType().ordinal()]) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				int var1 = this.getParam1();
				int var2 = this.getParam0();
				Widget var3 = og.ci_fld.getWidget(var1);
				if (var3 != null && var2 > -1) {
					var3 = var3.getChild(var2);
				}

				return (Widget)var3;
			default:
				return null;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx be() {
		return dx.bu(this.getWorldViewId());
	}

	@ObfuscatedName("createSubMenu")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Menu;"
	)
	@Export("createSubMenu")
	@Override
	public Menu createSubMenu() {
		return this.qp_fld.af_fld[this.sj_fld] = new wz(false);
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setIdentifier(int var1) {
		this.qp_fld.ah_fld[this.sj_fld] = var1;
		return this;
	}

	@ObfuscatedName("getType")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/MenuAction;"
	)
	@Export("getType")
	@Override
	public MenuAction getType() {
		int var1 = this.qp_fld.ae_fld[this.sj_fld];
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		return MenuAction.of(var1);
	}

	@ObfuscatedName("isForceLeftClick")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isForceLeftClick")
	@Override
	public boolean isForceLeftClick() {
		return this.qp_fld.al_fld[this.sj_fld];
	}

	@ObfuscatedName("getIdentifier")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getIdentifier")
	@Override
	public int getIdentifier() {
		return this.qp_fld.ah_fld[this.sj_fld];
	}

	public rl5(wz var1, int var2) {
		this.qp_fld = var1;
		this.sj_fld = var2;
	}
}
