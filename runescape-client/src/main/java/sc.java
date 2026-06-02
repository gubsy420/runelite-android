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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean ah(char var1) {
		return ll(this, var1, -757836094) && (this.ay_fld[var1] == 1 || this.ay_fld[var1] == 3);
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lsc;C)Z"
	)
	public static boolean my(sc var0, char var1) {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)V"
	)
	public void ag(char var1, int var2) {
		if (ll(this, var1, -968209209) && this.af(var2)) {
			this.ay_fld[var1] = var2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int av(char var1) {
		return ll(this, var1, -295352447) ? this.ay_fld[var1] : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ae(int var1) {
		return de(this, var1) && (this.aw_fld[var1] == 1 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)Z"
	)
	public static boolean qt(sc var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "(Lsc;II)V"
	)
	public static void tu(sc var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (de(var0, var1) && var0.af(var2)) {
				var0.aw_fld[var1] = var2;
			}
		}
	}

	public sc() {
		Arrays.fill(this.aw_fld, 3);
		Arrays.fill(this.ay_fld, 3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean ay(char var1) {
		return ll(this, var1, -662615940) && (this.ay_fld[var1] == 2 || 3 == this.ay_fld[var1]);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean br(int var1) {
		return de(this, var1) && (this.aw_fld[var1] == 2 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void al(int var1, int var2) {
		if (de(this, var1) && this.af(var2)) {
			this.aw_fld[var1] = var2;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int am(char var1) {
		return ll(this, var1, -1356510817) ? this.ay_fld[var1] : 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)V"
	)
	public void aa(char var1, int var2) {
		if (ll(this, var1, -2035989050) && this.af(var2)) {
			this.ay_fld[var1] = var2;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)V"
	)
	public void an(char var1, int var2) {
		if (ll(this, var1, -1768986791) && this.af(var2)) {
			this.ay_fld[var1] = var2;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ax(int var1, int var2) {
		if (de(this, var1) && this.af(var2)) {
			this.aw_fld[var1] = var2;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aq(int var1) {
		return de(this, var1) ? this.aw_fld[var1] : 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ai(int var1) {
		return de(this, var1) ? this.aw_fld[var1] : 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int ad(char var1) {
		return ll(this, var1, -1689199849) ? this.ay_fld[var1] : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(C)I"
	)
	public int ao(char var1) {
		return ll(this, var1, -281270759) ? this.ay_fld[var1] : 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ap(int var1) {
		return de(this, var1) && (this.aw_fld[var1] == 1 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean ac(int var1) {
		return de(this, var1) && (this.aw_fld[var1] == 1 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean aj(char var1) {
		return ll(this, var1, -885254818) && (this.ay_fld[var1] == 1 || this.ay_fld[var1] == 3);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bd(char var1) {
		return ll(this, var1, -1055975400) && (this.ay_fld[var1] == 1 || this.ay_fld[var1] == 3);
	}

	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "(Lsc;C)Z"
	)
	public static boolean rc(sc var0, char var1) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean af(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	public boolean be(int var1) {
		return de(this, var1) && (this.aw_fld[var1] == 2 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bs(char var1) {
		return ll(this, var1, -1869230271) && (this.ay_fld[var1] == 2 || 3 == this.ay_fld[var1]);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bh(char var1) {
		return ll(this, var1, -1926814462) && (this.ay_fld[var1] == 2 || 3 == this.ay_fld[var1]);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bx(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	boolean bl(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void ak(int var1, int var2) {
		if (de(this, var1) && this.af(var2)) {
			this.aw_fld[var1] = var2;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bo(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean bk(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
	)
	static void ax(String var0, String var1, String var2) {
		jz.ac(7);
		cl.ad(var0, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean aw(int var1, int var2) {
		return de(this, var1) && (this.ay_fld[var1] == 1 || 3 == this.aw_fld[var1]);
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)Z"
	)
	public static boolean ml(sc var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return de(var0, var1) && (var0.aw_fld[var1] == 2 || 3 == var0.aw_fld[var1]);
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)I"
	)
	public static int ed(sc var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return de(var0, var1) ? var0.aw_fld[var1] : 0;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean as(int var1, int var2) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lsc;CI)Z"
	)
	public static boolean ll(sc var0, char var1, int var2) {
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)Z"
	)
	public static boolean bz(sc var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return de(var0, var1) && (var0.aw_fld[var1] == 1 || 3 == var0.aw_fld[var1]);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z"
	)
	boolean ar(char var1, int var2) {
		return ll(this, var1, -662615940) && (this.aw_fld[var1] == 2 || 3 == this.ay_fld[var1]);
	}

	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "(Lsc;C)I"
	)
	public static int sd(sc var0, char var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return ll(var0, var1, -1570884562) ? var0.ay_fld[var1] : 0;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)Z"
	)
	public static boolean de(sc var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(C)Z"
	)
	public boolean bm(char var1) {
		return ll(this, var1, -1869230271) && (this.aw_fld[var1] == 2 || 3 == this.ay_fld[var1]);
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Lsc;C)Z"
	)
	public static boolean da(sc var0, char var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return ll(var0, var1, -521245648) && (var0.ay_fld[var1] == 1 || var0.ay_fld[var1] == 3);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int az(int var1, int var2) {
		return de(this, var1) ? this.aw_fld[var1] : 0;
	}
}
