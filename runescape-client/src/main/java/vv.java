import java.awt.Component;
import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vv")
public class vv {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -862353675
	)
	int ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ak_fld = new int[4];
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1788928413
	)
	int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ag_fld = new int[4];
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 866198115
	)
	int az_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	public static vv[] ah_fld = new vv[vv.aw_fld];
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -875258919
	)
	static int aw_fld = 1279477392;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2124815753
	)
	public static int ay_fld = 0;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		synchronized (ah_fld) {
			if (ay_fld < aw_fld) {
				ah_fld[(ay_fld += -235759801) * -2124815753 - 1] = this;
			}
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ltg;Ljava/awt/Component;)V"
	)
	public static void ls(tg var0, Component var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1.removeMouseWheelListener(var0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public void ak() {
		synchronized (ah_fld) {
			if (ay_fld < aw_fld) {
				ah_fld[(ay_fld += -235759801) * -2124815753 - 1] = this;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvr;III)V"
	)
	public void ac(vr var1, int var2, int var3, int var4) {
		this.az_fld = -1449407518 * var1.ax_fld;
		int var6 = var4 + 64;
		int var5 = (var6 & 848091880) / 128;
		this.av_fld = (var2 + vr.yc(var1, var5)) * 993501619;
		this.ae_fld = (var3 + var1.av(var5)) * 1423250428;
		this.ak_fld[0] = var2 + var1.ak(var5, 0);
		this.ag_fld[0] = var3 + vr.mq(var1, var5, 0);
		this.ak_fld[1] = var2 + var1.ak(var5, 1);
		this.ag_fld[1] = var3 + vr.mq(var1, var5, 1);
		this.ak_fld[2] = var2 + var1.ak(var5, 2);
		this.ag_fld[2] = var3 + vr.mq(var1, var5, 2);
		this.ak_fld[3] = var2 + var1.ak(var5, 3);
		this.ag_fld[3] = var3 + vr.mq(var1, var5, 3);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lvv;Lvr;IIIS)V"
	)
	public static void cn(vv var0, vr var1, int var2, int var3, int var4, short var5) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = var1.ax_fld;
		int var7 = var4 + 64;
		int var6 = (var7 & 2047) / 128;
		var0.av_fld = var2 + vr.yc(var1, var6);
		var0.ae_fld = var3 + var1.av(var6);
		var0.ak_fld[0] = var2 + var1.ak(var6, 0);
		var0.ag_fld[0] = var3 + vr.mq(var1, var6, 0);
		var0.ak_fld[1] = var2 + var1.ak(var6, 1);
		var0.ag_fld[1] = var3 + vr.mq(var1, var6, 1);
		var0.ak_fld[2] = var2 + var1.ak(var6, 2);
		var0.ag_fld[2] = var3 + vr.mq(var1, var6, 2);
		var0.ak_fld[3] = var2 + var1.ak(var6, 3);
		var0.ag_fld[3] = var3 + vr.mq(var1, var6, 3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public int av(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	int ae() {
		return this.av_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int an(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)I"
	)
	public static int cz(pi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.an_fld;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ar() {
		synchronized (ah_fld) {
			if (ay_fld < aw_fld) {
				ah_fld[(ay_fld += -235759801) * 170722148 - 1] = this;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ai(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lvv;)V"
	)
	public static void bg(vv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		synchronized (ah_fld) {
			if (ay_fld < aw_fld) {
				ah_fld[(ay_fld += -235759801) * -2124815753 - 1] = var0;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		this.av_fld = 0;
		this.ae_fld = 0;
		this.az_fld = 0;
		Arrays.fill(this.ak_fld, 0);
		Arrays.fill(this.ag_fld, 0);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvr;III)V"
	)
	public void ap(vr var1, int var2, int var3, int var4) {
		this.az_fld = var1.ax_fld;
		int var6 = var4 + 64;
		int var5 = (var6 & 2047) / 128;
		this.av_fld = var2 + vr.yc(var1, var5);
		this.ae_fld = var3 + var1.av(var5);
		this.ak_fld[0] = var2 + var1.ak(var5, 0);
		this.ag_fld[0] = var3 + vr.mq(var1, var5, 0);
		this.ak_fld[1] = var2 + var1.ak(var5, 1);
		this.ag_fld[1] = var3 + vr.mq(var1, var5, 1);
		this.ak_fld[2] = var2 + var1.ak(var5, 2);
		this.ag_fld[2] = var3 + vr.mq(var1, var5, 2);
		this.ak_fld[3] = var2 + var1.ak(var5, 3);
		this.ag_fld[3] = var3 + vr.mq(var1, var5, 3);
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)V"
	)
	public static void ey(vv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld = 0;
			var0.ae_fld = 0;
			var0.az_fld = 0;
			Arrays.fill(var0.ak_fld, 0);
			Arrays.fill(var0.ag_fld, 0);
		}
	}

	public vv() {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aa(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int au(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int am() {
		return this.ae_fld;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ad() {
		return this.ae_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ax(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ao() {
		return this.az_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvr;III)V"
	)
	public void at(vr var1, int var2, int var3, int var4) {
		this.az_fld = var1.ax_fld;
		int var6 = var4 + 64;
		int var5 = (var6 & 2047) / 128;
		this.av_fld = var2 + vr.yc(var1, var5);
		this.ae_fld = var3 + var1.av(var5);
		this.ak_fld[0] = var2 + var1.ak(var5, 0);
		this.ag_fld[0] = var3 + vr.mq(var1, var5, 0);
		this.ak_fld[1] = var2 + var1.ak(var5, 1);
		this.ag_fld[1] = var3 + vr.mq(var1, var5, 1);
		this.ak_fld[2] = var2 + var1.ak(var5, 2);
		this.ag_fld[2] = var3 + vr.mq(var1, var5, 2);
		this.ak_fld[3] = var2 + var1.ak(var5, 3);
		this.ag_fld[3] = var3 + vr.mq(var1, var5, 3);
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)I"
	)
	public static int dh(vv var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.az_fld;
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IB)I"
	)
	public static int ja(vv var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld[var1];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aq() {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public int az(int var1, byte var2) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvr;IIIS)V"
	)
	public void ay(vr var1, int var2, int var3, int var4, short var5) {
		this.av_fld = -1959366837 * var1.au_fld;
		int var7 = var4 + 64;
		int var6 = (var7 & 2047) / 128;
		this.ae_fld = (var2 + vr.yc(var1, var6)) * 1326994251;
		this.av_fld = (var3 + var1.av(var6)) * 198997341;
		this.ag_fld[0] = var2 + var1.ak(var6, 0);
		this.ag_fld[0] = var3 + vr.mq(var1, var6, 0);
		this.ag_fld[1] = var2 + var1.ak(var6, 1);
		this.ak_fld[1] = var3 + vr.mq(var1, var6, 1);
		this.ag_fld[2] = var2 + var1.ak(var6, 2);
		this.ak_fld[2] = var3 + vr.mq(var1, var6, 2);
		this.ag_fld[3] = var2 + var1.ak(var6, 3);
		this.ak_fld[3] = var3 + vr.mq(var1, var6, 3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aw(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ag(int var1) {
		this.av_fld = 0;
		this.ae_fld = 0;
		this.av_fld = 0;
		Arrays.fill(this.ak_fld, 0);
		Arrays.fill(this.ak_fld, 0);
	}
}
