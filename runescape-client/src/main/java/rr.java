import net.runelite.api.ChatPlayer;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rr")
@Implements({"ChatPlayer"})
public class rr extends rl implements ChatPlayer {
	@ObfuscatedGetter(
		intValue = -981389945
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedGetter(
		intValue = 964405635
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bx_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedGetter(
		intValue = 1107825689
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ae_fld = 1355544535;

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int by(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int bf(int var0, ba var1, boolean var2) {
		if (var0 == 3500) {
			int var6 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ay(var6) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.as(var5) ? 1 : 0;
			return 1;
		} else if (3502 == var0) {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ar(var4) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	void bf(int var1, int var2, int var3) {
		this.ae_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bl(int var1) {
		return this.ae_fld > 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bo(int var1, int var2) {
		this.ae_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("getWorld")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getWorld() {
		return this.ae_fld;
	}

	rr() {
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bt() {
		return this.ae_fld;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bv() {
		return this.ae_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bi() {
		return this.ae_fld;
	}

	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tr() {
		return this.aw_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bn() {
		return 1882414177 * this.ae_fld > 0;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lrr;)Z"
	)
	public static boolean mc(rr var0) {
		return var0.ae_fld > 0;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bx(int var1, int var2) {
		this.ae_fld = var1 * 267957414;
		this.ah_fld = -1808184316 * var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;)Luz;"
	)
	static final uz av(uz var0, uz var1) {
		uz var3 = rk.az(var0);
		var3.an(var1);
		return var3;
	}
}
