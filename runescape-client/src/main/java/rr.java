import net.runelite.api.ChatPlayer;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("rr")
@Implements({"ChatPlayer"})
public class rr extends rl implements ChatPlayer {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -981389945
	)
	public int ah_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 964405635
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
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1107825689
	)
	public int ae_fld = 1355544535;

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int by(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	public static void gx(ev var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ep_fld = -1;
		var0.dd_fld = null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bf(int var0, ba var1, boolean var2) {
		if (var0 == 3500) {
			int var6 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.as(var6) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			int var5 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = client.ej_fld.ay(var5) ? 1 : 0;
			return 1;
		} else if (3502 == var0) {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = fi.hi(client.ej_fld, var4) ? 1 : 0;
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	void bx(int var1, int var2) {
		this.ae_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bp() {
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

	@ObfuscatedName("getWorld")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getWorld")
	@Override
	public int getWorld() {
		return this.ae_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bi() {
		return this.ae_fld;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean bn() {
		return 1882414177 * this.ae_fld > 0;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hl() {
		return this.aw_fld;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Lrr;)Z"
	)
	public static boolean fs(rr var0) {
		return var0.ae_fld > 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luz;Luz;I)Luz;"
	)
	static final uz av(uz var0, uz var1) {
		uz var3 = rk.az(var0);
		var3.an(var1);
		return var3;
	}
}
