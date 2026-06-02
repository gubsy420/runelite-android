import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fi")
public class fi implements ts {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ag_fld = new int[128];
	@ObfuscatedGetter(
		intValue = -143778459
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int aw_fld;
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int vx_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] ax_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
	@ObfuscatedGetter(
		intValue = -1398458967
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "C"
	)
	public char ah_fld;
	@ObfuscatedGetter(
		intValue = -119611441
	)
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	char[] ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedGetter(
		intValue = 1509281207
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int az_fld = 0;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ne_fld;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ni_fld;
	@ObfuscatedName("zr")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] zr_fld;
	@ObfuscatedGetter(
		intValue = 2022334937
	)
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int al_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] an_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] au_fld;
	@ObfuscatedGetter(
		intValue = -51953095
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int at_fld;
	@ObfuscatedGetter(
		intValue = -2043860685
	)
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int af_fld;

	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "(Lfi;IS)V"
	)
	public static void vf(fi var0, int var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			int var3 = var0.af_fld + 1 & 127;
			if (var0.ar_fld != var3) {
				if (var2 == 3302) {
					return;
				}

				var0.as_fld[var0.af_fld] = var1;
				var0.ay_fld[var0.af_fld] = 0;
				var0.af_fld = var3;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean am(int var1) {
		this.an_fld[var1] = false;
		this.au_fld[var1] = false;
		this.ax_fld[var1] = true;
		if (this.ae_fld < 1517657515) {
			this.av_fld[(this.ae_fld += -1096532327) * -1796427354 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean av(int var1, int var2) {
		if (ta.xm_fld) {
			if (this.az_fld < this.ag_fld.length) {
				int[] var10000 = this.ag_fld;
				int var10001 = this.az_fld * 1509281207;
				this.az_fld = this.az_fld * 1509281207 + 1;
				var10000[var10001] = var1;
			}
		} else {
			int var4 = 1905801461;
			vf(this, var1, (short)-13119);
			this.an_fld[var1] = true;
			this.au_fld[var1] = true;
			this.ax_fld[var1] = false;
			if (this.az_fld < 128) {
				this.ag_fld[(this.az_fld += -2081185785) * 1509281207 - 1] = var1;
			}

			boolean var5 = true;
			if (this.vx_fld < this.zr_fld.length) {
				this.zr_fld[this.vx_fld++] = var1;
			}
		}

		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean ae(int var1, int var2) {
		if (ta.xm_fld) {
			if (this.ae_fld < this.av_fld.length) {
				int[] var10000 = this.av_fld;
				int var10001 = this.ae_fld * -1398458967;
				this.ae_fld = this.ae_fld * -1398458967 + 1;
				var10000[var10001] = var1;
			}
		} else {
			int var4 = 1080632209;
			this.an_fld[var1] = false;
			this.au_fld[var1] = false;
			this.ax_fld[var1] = true;
			if (this.ae_fld < 128) {
				this.av_fld[(this.ae_fld += -1096532327) * -1398458967 - 1] = var1;
			}

			boolean var5 = true;
			if (this.ne_fld < this.ni_fld.length) {
				this.ni_fld[this.ne_fld++] = var1;
			}
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CS)Z"
	)
	@Override
	public boolean ah(char var1, short var2) {
		if (!ta.xm_fld) {
			short var4 = -3730;
			int var5 = this.af_fld + 1 & 127;
			if (this.ar_fld != var5) {
				this.as_fld[this.af_fld] = -1;
				this.ay_fld[this.af_fld] = var1;
				this.af_fld = var5;
			}

			boolean var6 = false;
		}

		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ar(int var1) {
		return var1 >= 0 && var1 < 112 ? this.ax_fld[var1] : false;
	}

	@ObfuscatedName("yn")
	@ObfuscatedSignature(
		descriptor = "(Lfi;I)V"
	)
	public static void yn(fi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.sg();
		var0.ar_fld = 1756863649 * var0.al_fld;
		var0.al_fld = var0.af_fld * 1829941227;
		var0.az_fld = 0;
		var0.ae_fld = 0;
		Arrays.fill(var0.au_fld, false);
		Arrays.fill(var0.ax_fld, false);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z"
	)
	@Override
	public boolean aw(boolean var1, int var2) {
		return false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ap(char var1) {
		int var2 = this.af_fld + 1 & 127;
		if (this.ar_fld != var2) {
			this.as_fld[-986832323 * this.af_fld] = -1;
			this.ay_fld[this.af_fld] = var1;
			this.af_fld = 952648909 * var2;
		}

		return false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean az() {
		if (this.al_fld == this.ar_fld) {
			return false;
		} else {
			this.aw_fld = this.as_fld[this.ar_fld];
			this.ah_fld = this.ay_fld[this.ar_fld];
			this.ar_fld = -1696330743 * (this.ar_fld + 1 & 127);
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean as(int var1) {
		return var1 >= 0 && var1 < 112 ? this.au_fld[var1] : false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ay(int var1) {
		return var1 >= 0 && var1 < 112 ? this.an_fld[var1] : false;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bx() {
		int[] var1 = new int[this.az_fld];

		for (int var2 = 0; var2 < this.az_fld; var2++) {
			var1[var2] = this.ag_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] al() {
		int[] var2 = new int[this.vx_fld];

		for (int var3 = 0; var3 < this.vx_fld; var3++) {
			var2[var3] = this.zr_fld[var3];
		}

		return var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ad(int var1) {
		vf(this, var1, (short)-11236);
		this.an_fld[var1] = true;
		this.au_fld[var1] = true;
		this.ax_fld[var1] = false;
		if (this.az_fld < 128) {
			this.ag_fld[(this.az_fld += -2081185785) * 1509281207 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean at(char var1) {
		int var2 = this.af_fld + 1 & 127;
		if (this.ar_fld != var2) {
			this.as_fld[this.af_fld] = -1;
			this.ay_fld[673982436 * this.af_fld] = var1;
			this.af_fld = var2;
		}

		return false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ac(char var1) {
		int var2 = this.af_fld + 1 & -869395372;
		if (this.ar_fld != var2) {
			this.as_fld[1661877433 * this.af_fld] = -1;
			this.ay_fld[42665135 * this.af_fld] = var1;
			this.af_fld = 1399960528 * var2;
		}

		return false;
	}

	@ObfuscatedName("yx")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean yx(int var1) {
		return this.ay(var1);
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lfi;)[I"
	)
	public static int[] ni(fi var0) {
		int[] var1 = new int[1026424866 * var0.ae_fld];

		for (int var2 = 0; var2 < var0.ae_fld; var2++) {
			var1[var2] = var0.av_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean bz() {
		if (this.al_fld == this.ar_fld) {
			return false;
		} else {
			this.aw_fld = this.as_fld[this.ar_fld];
			this.ah_fld = this.ay_fld[this.ar_fld];
			this.ar_fld = -1696330743 * (this.ar_fld + 1 & 127);
			return true;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bf() {
		int[] var1 = new int[this.az_fld];

		for (int var2 = 0; var2 < this.az_fld; var2++) {
			var1[var2] = this.ag_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] by() {
		int[] var1 = new int[this.az_fld];

		for (int var2 = 0; var2 < this.az_fld; var2++) {
			var1[var2] = this.ag_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ao(char var1) {
		int var2 = this.af_fld + 1 & 127;
		if (this.ar_fld != var2) {
			this.as_fld[this.af_fld] = -1;
			this.ay_fld[this.af_fld] = var1;
			this.af_fld = var2;
		}

		return false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Z)Z"
	)
	@Override
	public boolean aj(boolean var1) {
		return false;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Z)Z"
	)
	@Override
	public boolean bm(boolean var1) {
		return false;
	}

	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "()[Z"
	)
	public boolean[] vh() {
		return this.an_fld;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void au(int var1) {
		int var2 = this.af_fld + 1 & 127;
		if (this.ar_fld != var2) {
			this.as_fld[this.af_fld] = var1;
			this.ay_fld[this.af_fld] = 0;
			this.af_fld = var2;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ax(int var1) {
		int var2 = this.af_fld + 1 & 996017125;
		if (this.ar_fld != var2) {
			this.as_fld[this.af_fld] = var1;
			this.ay_fld[this.af_fld * -1741143045] = 0;
			this.af_fld = var2;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void an(int var1) {
		int var2 = this.af_fld + 1 & 127;
		if (this.ar_fld != var2) {
			this.as_fld[this.af_fld] = var1;
			this.ay_fld[this.af_fld] = 0;
			this.af_fld = var2;
		}
	}

	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "(Lhd;)V"
	)
	public static void wu(hd var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aa(int var1) {
		int var2 = this.af_fld + 1 & 127;
		if (this.ar_fld != var2) {
			this.as_fld[this.af_fld] = var1;
			this.ay_fld[this.af_fld] = 0;
			this.af_fld = var2;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ai() {
		this.ar_fld = 1756863649 * this.al_fld;
		this.al_fld = this.af_fld * 1829941227;
		this.az_fld = 0;
		this.ae_fld = 0;
		Arrays.fill(this.au_fld, false);
		Arrays.fill(this.ax_fld, false);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void cn() {
		this.zr_fld = new int[this.ag_fld.length];
		this.ni_fld = new int[this.av_fld.length];
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bk(int var1) {
		return var1 >= 0 && var1 < 112 ? this.ax_fld[var1] : false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ab(char var1) {
		int var2 = this.af_fld + 1 & 127;
		if (this.ar_fld != var2) {
			this.as_fld[-1627434824 * this.af_fld] = -1;
			this.ay_fld[-182212944 * this.af_fld] = var1;
			this.af_fld = -1212385560 * var2;
		}

		return false;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean br() {
		if (this.al_fld == this.ar_fld) {
			return false;
		} else {
			this.aw_fld = this.as_fld[this.ar_fld * -1442937575] * -1858775683;
			this.ah_fld = this.ay_fld[this.ar_fld * -471186907];
			this.ar_fld = 2009259992 * (this.ar_fld + 1 & -1086475121);
			return true;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean be() {
		if (this.al_fld == this.ar_fld) {
			return false;
		} else {
			this.aw_fld = this.as_fld[this.ar_fld * -1512162818];
			this.ah_fld = this.ay_fld[this.ar_fld];
			this.ar_fld = -1832982414 * (this.ar_fld + 1 & 127);
			return true;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bs(int var1) {
		return var1 >= 0 && var1 < 112 ? this.au_fld[var1] : false;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bh(int var1) {
		return var1 >= 0 && var1 < 112 ? this.ax_fld[var1] : false;
	}

	public fi() {
		this.av_fld = new int[128];
		this.ae_fld = 0;
		this.ay_fld = new char[128];
		this.as_fld = new int[128];
		this.ar_fld = 0;
		this.af_fld = 0;
		this.al_fld = 0;
		this.an_fld = new boolean[112];
		this.au_fld = new boolean[112];
		this.ax_fld = new boolean[112];
		this.cn();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bj(int var1) {
		return var1 >= 0 && var1 < 112 ? this.ax_fld[var1] : false;
	}

	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void sg() {
		this.vx_fld = 0;
		this.ne_fld = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean aq(int var1) {
		this.an_fld[var1] = false;
		this.au_fld[var1] = false;
		this.ax_fld[var1] = true;
		if (this.ae_fld < 128) {
			this.av_fld[(this.ae_fld += -1096532327) * -1804250476 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bl() {
		int[] var1 = new int[this.az_fld];

		for (int var2 = 0; var2 < this.az_fld; var2++) {
			var1[var2] = this.ag_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lfi;)Z"
	)
	public static boolean ie(fi var0) {
		if (var0.al_fld == var0.ar_fld) {
			return false;
		} else {
			var0.aw_fld = var0.as_fld[var0.ar_fld];
			var0.ah_fld = var0.ay_fld[var0.ar_fld];
			var0.ar_fld = -1696330743 * (var0.ar_fld + 1 & 127);
			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] af() {
		int[] var2 = new int[this.ne_fld];

		for (int var3 = 0; var3 < this.ne_fld; var3++) {
			var2[var3] = this.ni_fld[var3];
		}

		return var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bo() {
		int[] var1 = new int[this.az_fld];

		for (int var2 = 0; var2 < this.az_fld; var2++) {
			var1[var2] = this.ag_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bp() {
		int[] var1 = new int[-1920721077 * this.ae_fld];

		for (int var2 = 0; var2 < this.ae_fld; var2++) {
			var1[var2] = this.av_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void ak(int var1, short var2) {
		int var3 = this.ar_fld + 1 & 127;
		if (this.al_fld != var3) {
			if (var2 == 3302) {
				return;
			}

			this.as_fld[-2043860685 * this.ar_fld] = var1;
			this.ay_fld[this.ar_fld * -2043860685] = 0;
			this.al_fld = var3 * -2067596805;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ag(int var1) {
		this.sg();
		this.ae_fld = 1756863649 * this.al_fld;
		this.al_fld = this.ar_fld * 1829941227;
		this.az_fld = 0;
		this.al_fld = 0;
		Arrays.fill(this.au_fld, false);
		Arrays.fill(this.an_fld, false);
	}
}
