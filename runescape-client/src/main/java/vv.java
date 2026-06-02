import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vv")
public class vv {
	@ObfuscatedGetter(
		intValue = -862353675
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ak_fld = new int[4];
	@ObfuscatedGetter(
		intValue = -1788928413
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ag_fld = new int[4];
	@ObfuscatedGetter(
		intValue = 866198115
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	public static vv[] ah_fld = new vv[vv.aw_fld];
	@ObfuscatedGetter(
		intValue = -875258919
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld = 1279477392;
	@ObfuscatedGetter(
		intValue = -2124815753
	)
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		synchronized (ah_fld) {
			if (ay_fld < aw_fld) {
				ah_fld[(ay_fld += -235759801) * -2124815753 - 1] = this;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvr;III)V"
	)
	public void at(vr var1, int var2, int var3, int var4) {
		this.ae_fld = -1449407518 * var1.ar_fld;
		int var6 = var4 + 64;
		int var5 = (var6 & 848091880) / 128;
		this.az_fld = (var2 + var1.az(var5)) * 993501619;
		this.av_fld = (var3 + var1.av(var5)) * 1423250428;
		this.ak_fld[0] = var2 + var1.ak(var5, 0);
		this.ag_fld[0] = var3 + var1.ag(var5, 0);
		this.ak_fld[1] = var2 + var1.ak(var5, 1);
		this.ag_fld[1] = var3 + var1.ag(var5, 1);
		this.ak_fld[2] = var2 + var1.ak(var5, 2);
		this.ag_fld[2] = var3 + var1.ag(var5, 2);
		this.ak_fld[3] = var2 + var1.ak(var5, 3);
		this.ag_fld[3] = var3 + var1.ag(var5, 3);
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lcn;)I"
	)
	public static int lp(cn var0) {
		return var0.al_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IB)I"
	)
	public static int tz(vv var0, int var1, byte var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ag_fld[var1];
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ae() {
		return this.az_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ah() {
		return this.av_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int an(int var1) {
		return this.ag_fld[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvr;III)V"
	)
	public void ay(vr var1, int var2, int var3, int var4) {
		this.ae_fld = var1.ar_fld;
		int var7 = var4 + 64;
		int var6 = (var7 & 2047) / 128;
		this.az_fld = var2 + var1.az(var6);
		this.av_fld = var3 + var1.av(var6);
		this.ak_fld[0] = var2 + var1.ak(var6, 0);
		this.ag_fld[0] = var3 + var1.ag(var6, 0);
		this.ak_fld[1] = var2 + var1.ak(var6, 1);
		this.ag_fld[1] = var3 + var1.ag(var6, 1);
		this.ak_fld[2] = var2 + var1.ak(var6, 2);
		this.ag_fld[2] = var3 + var1.ag(var6, 2);
		this.ak_fld[3] = var2 + var1.ak(var6, 3);
		this.ag_fld[3] = var3 + var1.ag(var6, 3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void as() {
		synchronized (ah_fld) {
			if (ay_fld < aw_fld) {
				ah_fld[(ay_fld += -235759801) * -2124815753 - 1] = this;
			}
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		this.az_fld = 0;
		this.av_fld = 0;
		this.ae_fld = 0;
		Arrays.fill(this.ak_fld, 0);
		Arrays.fill(this.ag_fld, 0);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aw() {
		return this.ae_fld;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Lvv;)I"
	)
	public static int ka(vv var0) {
		return var0.ae_fld;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvr;III)V"
	)
	public void ac(vr var1, int var2, int var3, int var4) {
		this.ae_fld = var1.ar_fld;
		int var6 = var4 + 64;
		int var5 = (var6 & 2047) / 128;
		this.az_fld = var2 + var1.az(var5);
		this.av_fld = var3 + var1.av(var5);
		this.ak_fld[0] = var2 + var1.ak(var5, 0);
		this.ag_fld[0] = var3 + var1.ag(var5, 0);
		this.ak_fld[1] = var2 + var1.ak(var5, 1);
		this.ag_fld[1] = var3 + var1.ag(var5, 1);
		this.ak_fld[2] = var2 + var1.ak(var5, 2);
		this.ag_fld[2] = var3 + var1.ag(var5, 2);
		this.ak_fld[3] = var2 + var1.ak(var5, 3);
		this.ag_fld[3] = var3 + var1.ag(var5, 3);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ag() {
		this.az_fld = 0;
		this.av_fld = 0;
		this.ae_fld = 0;
		Arrays.fill(this.ak_fld, 0);
		Arrays.fill(this.ag_fld, 0);
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
		return this.av_fld;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ax(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ab() {
		return this.ae_fld;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvr;III)V"
	)
	public void ap(vr var1, int var2, int var3, int var4) {
		this.ae_fld = var1.ar_fld;
		int var6 = var4 + 64;
		int var5 = (var6 & 2047) / 128;
		this.az_fld = var2 + var1.az(var5);
		this.av_fld = var3 + var1.av(var5);
		this.ak_fld[0] = var2 + var1.ak(var5, 0);
		this.ag_fld[0] = var3 + var1.ag(var5, 0);
		this.ak_fld[1] = var2 + var1.ak(var5, 1);
		this.ag_fld[1] = var3 + var1.ag(var5, 1);
		this.ak_fld[2] = var2 + var1.ak(var5, 2);
		this.ag_fld[2] = var3 + var1.ag(var5, 2);
		this.ak_fld[3] = var2 + var1.ak(var5, 3);
		this.ag_fld[3] = var3 + var1.ag(var5, 3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aq() {
		return this.az_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public int az(int var1, byte var2) {
		return this.ak_fld[var1];
	}
}
