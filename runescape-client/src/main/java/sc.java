import java.util.Arrays;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sc")
public class sc {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aw_fld = new int[112];
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ay_fld = new int[192];

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	boolean by(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CII)V"
	)
	public void ag(char var1, int var2) {
		if (this.ar(var1) && this.af(var2)) {
			this.ay_fld[var1] = var2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void au(int var1, int var2) {
		if (this.as(var1) && this.af(var2)) {
			this.aw_fld[var1] = var2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CB)I"
	)
	public int av(char var1) {
		return this.ar(var1) ? this.ay_fld[var1] : 0;
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lsc;C)Z"
	)
	public static boolean nk(sc var0, char var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lsc;CI)Z"
	)
	public static boolean hf(sc var0, char var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ar(var1) && (var0.ay_fld[var1] == 1 || var0.ay_fld[var1] == 3);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ae(int var1) {
		return this.as(var1) && (this.aw_fld[var1] == 1 || 3 == this.aw_fld[var1]);
	}

	public sc() {
		Arrays.fill(this.aw_fld, 3);
		Arrays.fill(this.ay_fld, 3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean aw(int var1) {
		return this.as(var1) && (this.aw_fld[var1] == 2 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean as(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	boolean ar(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void al(int var1, int var2) {
		if (this.as(var1) && this.af(var2)) {
			this.aw_fld[var1] = var2;
		}
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Z)Lkt;"
	)
	public static kt qz(rg var0, boolean var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 ? kt.ag_fld : oy.bz(var0.aw_fld, (byte)44);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bj(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int am(char var1) {
		return this.ar(var1) ? this.ay_fld[var1] : 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)V"
	)
	public void an(char var1, int var2) {
		if (this.ar(var1) && this.af(var2)) {
			this.ay_fld[var1] = var2;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)Z"
	)
	public static boolean cq(sc var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lsc;CI)Z"
	)
	public static boolean bc(sc var0, char var1, int var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ar(var1) && (var0.ay_fld[var1] == 2 || 3 == var0.ay_fld[var1]);
		}
	}

	@ObfuscatedName("xz")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)Z"
	)
	public static boolean xz(sc var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.as(var1) && (var0.aw_fld[var1] == 1 || 3 == var0.aw_fld[var1]);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)V"
	)
	public void aa(char var1, int var2) {
		if (this.ar(var1) && this.af(var2)) {
			this.ay_fld[var1] = var2;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ax(int var1, int var2) {
		if (this.as(var1) && this.af(var2)) {
			this.aw_fld[var1] = var2;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ai(int var1) {
		return this.as(var1) ? this.aw_fld[var1] : 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aq(int var1) {
		return this.as(var1) ? this.aw_fld[var1] : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int ao(char var1) {
		return this.ar(var1) ? this.ay_fld[var1] : 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsc;C)Z"
	)
	public static boolean av(sc var0, char var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 < 1619854034) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int ab(char var1) {
		return this.ar(var1) ? this.ay_fld[var1] : 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ap(int var1) {
		return this.as(var1) && (this.aw_fld[var1] == 1 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean aj(char var1) {
		return this.ar(var1) && (this.ay_fld[var1] == 1 || this.ay_fld[var1] == 3);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bd(char var1) {
		return this.ar(var1) && (this.ay_fld[var1] == 1 || this.ay_fld[var1] == 3);
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)Z"
	)
	public static boolean do_(sc var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.as(var1) && (var0.aw_fld[var1] == 1 || 3 == var0.aw_fld[var1]);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z"
	)
	boolean af(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean bz(int var1) {
		return this.as(var1) && (this.aw_fld[var1] == 2 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean be(int var1) {
		return this.as(var1) && (this.aw_fld[var1] == 2 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bs(char var1) {
		return this.ar(var1) && (this.ay_fld[var1] == 2 || 3 == this.ay_fld[var1]);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bh(char var1) {
		return this.ar(var1) && (this.ay_fld[var1] == 2 || 3 == this.ay_fld[var1]);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bk(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V"
	)
	public void ak(int var1, int var2) {
		if (this.as(var1) && this.af(var2)) {
			this.aw_fld[var1] = var2;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int az(int var1, int var2) {
		return this.as(var1) ? this.aw_fld[var1] : 0;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bx(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)Z"
	)
	public static boolean aq(sc var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.as(var1) && (var0.aw_fld[var1] == 2 || 3 == var0.aw_fld[var1]);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V"
	)
	static void ax(String var0, String var1, String var2) {
		jz.ac(7);
		cl.ad(var0, var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	public boolean ah(char var1, int var2) {
		return this.ar(var1) && (this.aw_fld[var1] == 1 || this.ay_fld[var1] == 3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	public boolean ay(char var1, int var2) {
		return this.ar(var1) && (this.ay_fld[var1] == 1 || this.aw_fld[var1] == 3);
	}
}
