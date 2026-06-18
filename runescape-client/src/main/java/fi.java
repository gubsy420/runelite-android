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
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -143778459
	)
	public int aw_fld;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -143778459
	)
	public int es_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] an_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] av_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1398458967
	)
	int ar_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "C"
	)
	public char ah_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -119611441
	)
	public static int am_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1509281207
	)
	public int ba_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	char[] ay_fld;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] vj_fld;
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
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1509281207
	)
	public int az_fld = 0;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2022334937
	)
	int af_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] au_fld;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] ky_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Z"
	)
	boolean[] ax_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -51953095
	)
	int al_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int at_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2043860685
	)
	int ae_fld;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean ad(int var1) {
		this.au_fld[var1] = false;
		this.ax_fld[var1] = false;
		this.an_fld[var1] = true;
		if (this.ar_fld < 1517657515) {
			this.av_fld[(this.ar_fld += -1096532327) * -1796427354 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	@Override
	public boolean av(int var1, int var2) {
		if (ta.pw_fld) {
			if (this.az_fld < this.ag_fld.length) {
				int[] var10000 = this.ag_fld;
				int var10001 = this.az_fld * 1509281207;
				this.az_fld = this.az_fld * 1509281207 + 1;
				var10000[var10001] = var1;
			}
		} else {
			int var4 = 1905801461;
			this.ak(var1, (short)-13119);
			this.au_fld[var1] = true;
			this.ax_fld[var1] = true;
			this.an_fld[var1] = false;
			if (this.az_fld < 128) {
				this.ag_fld[(this.az_fld += -2081185785) * 1509281207 - 1] = var1;
			}

			boolean var5 = true;
			if (this.ba_fld < this.vj_fld.length) {
				this.vj_fld[this.ba_fld++] = var1;
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
		if (ta.pw_fld) {
			if (this.ar_fld < this.av_fld.length) {
				int[] var10000 = this.av_fld;
				int var10001 = this.ar_fld * -1398458967;
				this.ar_fld = this.ar_fld * -1398458967 + 1;
				var10000[var10001] = var1;
			}
		} else {
			int var4 = 1080632209;
			this.au_fld[var1] = false;
			this.ax_fld[var1] = false;
			this.an_fld[var1] = true;
			if (this.ar_fld < 128) {
				this.av_fld[(this.ar_fld += -1096532327) * -1398458967 - 1] = var1;
			}

			boolean var5 = true;
			if (this.es_fld < this.ky_fld.length) {
				this.ky_fld[this.es_fld++] = var1;
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
		if (!ta.pw_fld) {
			short var4 = -3730;
			int var5 = this.ae_fld + 1 & 127;
			if (this.al_fld != var5) {
				this.as_fld[this.ae_fld] = -1;
				this.ay_fld[this.ae_fld] = var1;
				this.ae_fld = var5;
			}

			boolean var6 = false;
		}

		return true;
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
		int var2 = this.ae_fld + 1 & 127;
		if (this.al_fld != var2) {
			this.as_fld[-986832323 * this.ae_fld] = -1;
			this.ay_fld[this.ae_fld] = var1;
			this.ae_fld = 952648909 * var2;
		}

		return false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public final boolean az() {
		if (this.af_fld == this.al_fld) {
			return false;
		} else {
			this.aw_fld = this.as_fld[this.al_fld];
			this.ah_fld = this.ay_fld[this.al_fld];
			this.al_fld = -1696330743 * (this.al_fld + 1 & 127);
			return true;
		}
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ql() {
		this.vj_fld = new int[this.ag_fld.length];
		this.ky_fld = new int[this.av_fld.length];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public boolean ay(int var1) {
		return var1 >= 0 && var1 < 112 ? this.ax_fld[var1] : false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	public boolean as(int var1) {
		return var1 >= 0 && var1 < 112 ? this.au_fld[var1] : false;
	}

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "(Lfi;)Z"
	)
	public static boolean yo(fi var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var0.af_fld == var0.al_fld) {
			return false;
		} else {
			var0.aw_fld = var0.as_fld[var0.al_fld * -1512162818];
			var0.ah_fld = var0.ay_fld[var0.al_fld];
			var0.al_fld = -1832982414 * (var0.al_fld + 1 & 127);
			return true;
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "()[Z"
	)
	public boolean[] lj() {
		return this.au_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	public int[] af() {
		int[] var2 = new int[this.ba_fld];

		for (int var3 = 0; var3 < this.ba_fld; var3++) {
			var2[var3] = this.vj_fld[var3];
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)V"
	)
	void ak(int var1, short var2) {
		int var3 = this.ae_fld + 1 & 127;
		if (this.al_fld != var3) {
			if (var2 == 3302) {
				return;
			}

			this.as_fld[this.ae_fld] = var1;
			this.ay_fld[this.ae_fld] = 0;
			this.ae_fld = var3;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean aq(int var1) {
		this.ak(var1, (short)-11236);
		this.au_fld[var1] = true;
		this.ax_fld[var1] = true;
		this.an_fld[var1] = false;
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
		int var2 = this.ae_fld + 1 & 127;
		if (this.al_fld != var2) {
			this.as_fld[this.ae_fld] = -1;
			this.ay_fld[673982436 * this.ae_fld] = var1;
			this.ae_fld = var2;
		}

		return false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ac(char var1) {
		int var2 = this.ae_fld + 1 & -869395372;
		if (this.al_fld != var2) {
			this.as_fld[1661877433 * this.ae_fld] = -1;
			this.ay_fld[42665135 * this.ae_fld] = var1;
			this.ae_fld = 1399960528 * var2;
		}

		return false;
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean qj(int var1) {
		return this.as(var1);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hw() {
		this.ba_fld = 0;
		this.es_fld = 0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean bz() {
		if (this.af_fld == this.al_fld) {
			return false;
		} else {
			this.aw_fld = this.as_fld[this.al_fld];
			this.ah_fld = this.ay_fld[this.al_fld];
			this.al_fld = -1696330743 * (this.al_fld + 1 & 127);
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
		int var2 = this.ae_fld + 1 & 127;
		if (this.al_fld != var2) {
			this.as_fld[this.ae_fld] = -1;
			this.ay_fld[this.ae_fld] = var1;
			this.ae_fld = var2;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void au(int var1) {
		int var2 = this.ae_fld + 1 & 127;
		if (this.al_fld != var2) {
			this.as_fld[this.ae_fld] = var1;
			this.ay_fld[this.ae_fld] = 0;
			this.ae_fld = var2;
		}
	}

	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "(Lda;IZ)V"
	)
	public static void vx(da var0, int var1, boolean var2) {
		var0.cg_fld.av(var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void an(int var1) {
		int var2 = this.ae_fld + 1 & 127;
		if (this.al_fld != var2) {
			this.as_fld[this.ae_fld] = var1;
			this.ay_fld[this.ae_fld] = 0;
			this.ae_fld = var2;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void aa(int var1) {
		int var2 = this.ae_fld + 1 & 127;
		if (this.al_fld != var2) {
			this.as_fld[this.ae_fld] = var1;
			this.ay_fld[this.ae_fld] = 0;
			this.ae_fld = var2;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ai() {
		this.al_fld = 1756863649 * this.af_fld;
		this.af_fld = this.ae_fld * 1829941227;
		this.az_fld = 0;
		this.ar_fld = 0;
		Arrays.fill(this.ax_fld, false);
		Arrays.fill(this.an_fld, false);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bk(int var1) {
		return var1 >= 0 && var1 < 112 ? this.an_fld[var1] : false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	@Override
	public boolean ab(char var1) {
		int var2 = this.ae_fld + 1 & 127;
		if (this.al_fld != var2) {
			this.as_fld[-1627434824 * this.ae_fld] = -1;
			this.ay_fld[-182212944 * this.ae_fld] = var1;
			this.ae_fld = -1212385560 * var2;
		}

		return false;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean br() {
		if (this.af_fld == this.al_fld) {
			return false;
		} else {
			this.aw_fld = this.as_fld[this.al_fld * -1442937575] * -1858775683;
			this.ah_fld = this.ay_fld[this.al_fld * -471186907];
			this.al_fld = 2009259992 * (this.al_fld + 1 & -1086475121);
			return true;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bs(int var1) {
		return var1 >= 0 && var1 < 112 ? this.ax_fld[var1] : false;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bh(int var1) {
		return var1 >= 0 && var1 < 112 ? this.an_fld[var1] : false;
	}

	public fi() {
		this.av_fld = new int[128];
		this.ar_fld = 0;
		this.ay_fld = new char[128];
		this.as_fld = new int[128];
		this.al_fld = 0;
		this.ae_fld = 0;
		this.af_fld = 0;
		this.au_fld = new boolean[112];
		this.ax_fld = new boolean[112];
		this.an_fld = new boolean[112];
		this.ql();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bj(int var1) {
		return var1 >= 0 && var1 < 112 ? this.an_fld[var1] : false;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lfi;II)Z"
	)
	public static boolean hi(fi var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= 0 && var1 < 112 ? var0.an_fld[var1] : false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ag() {
		this.hw();
		this.al_fld = 1756863649 * this.af_fld;
		this.af_fld = this.ae_fld * 1829941227;
		this.az_fld = 0;
		this.ar_fld = 0;
		Arrays.fill(this.ax_fld, false);
		Arrays.fill(this.an_fld, false);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	@Override
	public boolean am(int var1) {
		this.au_fld[var1] = false;
		this.ax_fld[var1] = false;
		this.an_fld[var1] = true;
		if (this.ar_fld < 128) {
			this.av_fld[(this.ar_fld += -1096532327) * -1804250476 - 1] = var1;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	public int[] al() {
		int[] var2 = new int[this.es_fld];

		for (int var3 = 0; var3 < this.es_fld; var3++) {
			var2[var3] = this.ky_fld[var3];
		}

		return var2;
	}

	@ObfuscatedName("zz")
	@ObfuscatedSignature(
		descriptor = "(Lfi;)[I"
	)
	public static int[] zz(fi var0) {
		int[] var1 = new int[-1920721077 * var0.ar_fld];

		for (int var2 = 0; var2 < var0.ar_fld; var2++) {
			var1[var2] = var0.av_fld[var2];
		}

		return var1;
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

	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "(Lfi;)[I"
	)
	public static int[] vm(fi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		int[] var1 = new int[var0.az_fld];

		for (int var2 = 0; var2 < var0.az_fld; var2++) {
			var1[var2] = var0.ag_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bt() {
		int[] var1 = new int[1026424866 * this.ar_fld];

		for (int var2 = 0; var2 < this.ar_fld; var2++) {
			var1[var2] = this.av_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ar(int var1, int var2) {
		return var1 >= 0 && var1 < 112 ? this.au_fld[var1] : false;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Lfi;)Z"
	)
	public static boolean dp(fi var0) {
		if (var0.af_fld == var0.al_fld) {
			return false;
		} else {
			var0.aw_fld = var0.as_fld[var0.al_fld];
			var0.ah_fld = var0.ay_fld[var0.al_fld];
			var0.al_fld = -1696330743 * (var0.al_fld + 1 & 127);
			return true;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] bx() {
		int[] var1 = new int[1509281207 * this.es_fld];

		for (int var2 = 0; var2 < this.aw_fld; var2++) {
			var1[var2] = this.ky_fld[var2];
		}

		return var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public final boolean be() {
		if (this.al_fld == this.ar_fld) {
			return false;
		} else {
			this.es_fld = this.av_fld[this.ar_fld * -51953095];
			this.ah_fld = this.ay_fld[this.af_fld * -51953095];
			this.al_fld = -1696330743 * (this.ar_fld + 1 & 127);
			return true;
		}
	}
}
