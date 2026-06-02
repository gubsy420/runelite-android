import java.util.Arrays;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.Menu;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.Widget;

@ObfuscatedName("rl5")
@Implements({"MenuEntry"})
public class rl5 implements MenuEntry {
	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int nj_fld;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	public wz tk_fld;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/function/Consumer;"
	)
	public Consumer qy_fld;

	@ObfuscatedName("getItemId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getItemId() {
		return this.tk_fld.aw_fld[this.nj_fld];
	}

	@Nullable
	@ObfuscatedName("getNpc")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/NPC;"
	)
	@Override
	public NPC getNpc() {
		switch (rl6.dg_fld[this.getType().ordinal()]) {
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
				dx var1 = this.jc();
				int var2 = this.getIdentifier();
				return (NPC)(NPC)var1.ax_fld.ss(var2);
			default:
				return null;
		}
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setItemId(int var1) {
		this.tk_fld.aw_fld[this.nj_fld] = var1;
		return this;
	}

	@ObfuscatedName("getParam0")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getParam0() {
		return this.tk_fld.az_fld[this.nj_fld];
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setWorldViewId(int var1) {
		this.tk_fld.ay_fld[this.nj_fld] = var1;
		return this;
	}

	@ObfuscatedName("getParam1")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getParam1() {
		return this.tk_fld.av_fld[this.nj_fld];
	}

	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/function/Consumer;)Lrl5;"
	)
	public rl5 onClick(Consumer var1) {
		this.qy_fld = var1;
		return this;
	}

	@ObfuscatedName("getTarget")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getTarget() {
		return this.tk_fld.ar_fld[this.nj_fld];
	}

	@ObfuscatedName("hashCode")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
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

	@Nullable
	@ObfuscatedName("getPlayer")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Player;"
	)
	@Override
	public Player getPlayer() {
		int var1 = this.getIdentifier();
		switch (rl6.dg_fld[this.getType().ordinal()]) {
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
				dx var2 = this.jc();
				if (var2 == null) {
					return null;
				}

				return (Player)(Player)var2.au_fld.ss(var1);
			default:
				return null;
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setIdentifier(int var1) {
		this.tk_fld.ah_fld[this.nj_fld] = var1;
		return this;
	}

	@ObfuscatedName("getItemOp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getItemOp() {
		try {
			MenuAction var1 = this.getType();
			if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY || var1 == MenuAction.RUNELITE_WIDGET) {
				int var2 = this.tk_fld.ah_fld[this.nj_fld];
				int var3 = this.tk_fld.av_fld[this.nj_fld];
				int var4 = this.tk_fld.az_fld[this.nj_fld];
				if (var3 == 9764864) {
					switch (var2) {
						case 1:
							lu var5 = og.ci_fld.getWidget(var3);
							if (var5 != null && var4 != -1) {
								Widget var9 = var5.getChild(var4);
								if (var9 != null && var9.getItemId() > -1) {
									int var6 = og.ci_fld.am(var9.getItemId()).getShiftClickActionIndex();
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

	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "(Z)Lrl5;"
	)
	public rl5 setForceLeftClick(boolean var1) {
		this.tk_fld.al_fld[this.nj_fld] = var1;
		return this;
	}

	@Nullable
	@ObfuscatedName("getActor")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Actor;"
	)
	@Override
	public Actor getActor() {
		NPC var1 = this.getNpc();
		return (Actor)(var1 != null ? var1 : this.getPlayer());
	}

	@ObfuscatedName("toString")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
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

	@ObfuscatedName("createSubMenu")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/Menu;"
	)
	@Override
	public Menu createSubMenu() {
		return this.tk_fld.af_fld[this.nj_fld] = new wz(false);
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I)V"
	)
	public static void gu(sl var0, int var1) {
		if (var1 != var0.ae_fld) {
			var0.ae_fld = var1;
			if (yq.ak_fld == var0.ag_fld) {
				var0.aw_fld = Arrays.copyOf(var0.aw_fld, var1);
			} else if (var0.ag_fld == yq.ag_fld) {
				var0.ay_fld = Arrays.copyOf(var0.ay_fld, var1);
			} else if (var0.ag_fld == yq.az_fld) {
				var0.as_fld = (Object[])Arrays.copyOf((Object[])var0.as_fld, var1);
			}
		}
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Override
	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else if (!(var1 instanceof rl5)) {
			return false;
		} else {
			rl5 var2 = (rl5)var1;
			if (!var2.vw(this)) {
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

	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean vw(Object var1) {
		return var1 instanceof rl5;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lrl5;"
	)
	public rl5 setTarget(String var1) {
		this.tk_fld.ar_fld[this.nj_fld] = var1;
		return this;
	}

	@ObfuscatedName("getIdentifier")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getIdentifier() {
		return this.tk_fld.ah_fld[this.nj_fld];
	}

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setParam0(int var1) {
		this.tk_fld.az_fld[this.nj_fld] = var1;
		return this;
	}

	@ObfuscatedName("isItemOp")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isItemOp() {
		MenuAction var1 = this.getType();
		if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY || var1 == MenuAction.RUNELITE_WIDGET) {
			int var2 = this.tk_fld.ah_fld[this.nj_fld];
			int var3 = this.tk_fld.av_fld[this.nj_fld];
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

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "()Lwz;"
	)
	public wz getSubMenu() {
		return this.tk_fld.af_fld[this.nj_fld];
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl5;"
	)
	public rl5 setParam1(int var1) {
		this.tk_fld.av_fld[this.nj_fld] = var1;
		return this;
	}

	@ObfuscatedName("getWorldViewId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWorldViewId() {
		return this.tk_fld.ay_fld[this.nj_fld];
	}

	@ObfuscatedName("setDeprioritized")
	@ObfuscatedSignature(
		descriptor = "(Z)Lnet/runelite/api/MenuEntry;"
	)
	@Override
	public MenuEntry setDeprioritized(boolean var1) {
		if (var1) {
			if (this.tk_fld.ae_fld[this.nj_fld] < 2000) {
				this.tk_fld.ae_fld[this.nj_fld] = this.tk_fld.ae_fld[this.nj_fld] + 2000;
			}
		} else if (this.tk_fld.ae_fld[this.nj_fld] >= 2000) {
			this.tk_fld.ae_fld[this.nj_fld] = this.tk_fld.ae_fld[this.nj_fld] - 2000;
		}

		return this;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Lrl5;"
	)
	public rl5 setOption(String var1) {
		this.tk_fld.as_fld[this.nj_fld] = var1;
		return this;
	}

	@ObfuscatedName("isDeprioritized")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isDeprioritized() {
		return this.tk_fld.ae_fld[this.nj_fld] >= 2000;
	}

	@ObfuscatedName("getWidget")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/widgets/Widget;"
	)
	@Override
	public Widget getWidget() {
		switch (rl6.dg_fld[this.getType().ordinal()]) {
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

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/MenuAction;)Lrl5;"
	)
	public rl5 setType(MenuAction var1) {
		int var2 = this.tk_fld.ae_fld[this.nj_fld];
		short var3 = 0;
		if (var2 >= 2000) {
			var3 = 2000;
		}

		this.tk_fld.ae_fld[this.nj_fld] = var1.getId() + var3;
		return this;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "()Ldx;"
	)
	public dx jc() {
		return dx.ws(this.getWorldViewId());
	}

	@ObfuscatedName("onClick")
	@ObfuscatedSignature(
		descriptor = "()Ljava/util/function/Consumer;"
	)
	@Override
	public Consumer onClick() {
		return this.qy_fld;
	}

	@ObfuscatedName("deleteSubMenu")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void deleteSubMenu() {
		this.tk_fld.af_fld[this.nj_fld] = null;
	}

	@ObfuscatedName("isForceLeftClick")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean isForceLeftClick() {
		return this.tk_fld.al_fld[this.nj_fld];
	}

	@ObfuscatedName("getType")
	@ObfuscatedSignature(
		descriptor = "()Lnet/runelite/api/MenuAction;"
	)
	@Override
	public MenuAction getType() {
		int var1 = this.tk_fld.ae_fld[this.nj_fld];
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		return MenuAction.of(var1);
	}

	@ObfuscatedName("getOption")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	@Override
	public String getOption() {
		return this.tk_fld.as_fld[this.nj_fld];
	}

	public rl5(wz var1, int var2) {
		this.tk_fld = var1;
		this.nj_fld = var2;
	}
}
