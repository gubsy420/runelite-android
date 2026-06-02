import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mw")
public class mw {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxi;"
	)
	xi aw_fld = new xi(null);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	static byte[] ah_fld = new byte[]{
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		1,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		2,
		0,
		1,
		2,
		1,
		0,
		0,
		0,
		0,
		0,
		0,
		0,
		0,
		0,
		0,
		0,
		0
	};
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] as_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ay_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] af_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] au_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long ax_fld;

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bq() {
		int var1 = this.al_fld.length;
		int var2 = -1;
		int var3 = -2010037581;

		for (int var4 = 0; var4 < var1; var4++) {
			if (this.al_fld[var4] >= 0 && this.as_fld[var4] < var3) {
				var2 = var4;
				var3 = this.as_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void ak(byte[] var1) {
		this.aw_fld.al_fld = var1;
		this.aw_fld.au_fld = -2005642726;
		int var2 = xi.tx(this.aw_fld, 1239155212);
		this.ay_fld = xi.tx(this.aw_fld, 1913785499);
		this.ar_fld = 500000;
		this.af_fld = new int[var2];
		int var3 = 0;

		while (var3 < var2) {
			int var4 = this.aw_fld.co();
			int var5 = this.aw_fld.co();
			if (var4 == 1297379947) {
				this.af_fld[var3] = this.aw_fld.au_fld * -661977895;
				var3++;
			}

			this.aw_fld.au_fld += var5 * 228932457;
		}

		this.ax_fld = 0L;
		this.al_fld = new int[var2];

		for (int var6 = 0; var6 < var2; var6++) {
			this.al_fld[var6] = this.af_fld[var6];
		}

		this.as_fld = new int[var2];
		this.au_fld = new int[var2];
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)J"
	)
	public static long ug(mw var0, int var1) {
		return var0.ax_fld + (long)var1 * var0.ar_fld;
	}

	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[B)V"
	)
	public static void uc(mw var0, byte[] var1) {
		var0.aw_fld.al_fld = var1;
		var0.aw_fld.au_fld = -2061518565;
		int var2 = xi.tx(var0.aw_fld, 892170994);
		var0.ay_fld = xi.tx(var0.aw_fld, 1325050877);
		var0.ar_fld = 500000;
		var0.af_fld = new int[var2];
		int var3 = 0;

		while (var3 < var2) {
			int var4 = var0.aw_fld.co();
			int var5 = var0.aw_fld.co();
			if (var4 == 1297379947) {
				var0.af_fld[var3] = var0.aw_fld.au_fld * -661977895;
				var3++;
			}

			var0.aw_fld.au_fld += var5 * 68888897;
		}

		var0.ax_fld = 0L;
		var0.al_fld = new int[var2];

		for (int var6 = 0; var6 < var2; var6++) {
			var0.al_fld[var6] = var0.af_fld[var6];
		}

		var0.as_fld = new int[var2];
		var0.au_fld = new int[var2];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean az() {
		return this.aw_fld.al_fld != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int av() {
		return this.al_fld.length;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ae(int var1) {
		this.aw_fld.au_fld = this.al_fld[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ah(int var1) {
		this.al_fld[var1] = this.aw_fld.au_fld * -661977895;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		this.aw_fld.au_fld = -228932457;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)I"
	)
	public static int kf(mw var0) {
		int var1 = var0.al_fld.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; var4++) {
			if (var0.al_fld[var4] >= 0 && var0.as_fld[var4] < var3) {
				var2 = var4;
				var3 = var0.as_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void ay(int var1) {
		int var2 = this.aw_fld.dd();
		this.as_fld[var1] = this.as_fld[var1] + var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int as(int var1) {
		return this.ar(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ar(int var1) {
		byte var2 = this.aw_fld.al_fld[this.aw_fld.au_fld * -661977895];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.au_fld[var1] = var5;
			this.aw_fld.au_fld++;
		} else {
			var5 = this.au_fld[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.af(var1, var5);
		} else {
			int var3 = this.aw_fld.dd();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.aw_fld.al_fld[this.aw_fld.au_fld * -661977895] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					this.aw_fld.au_fld++;
					this.au_fld[var1] = var4;
					return this.af(var1, var4);
				}
			}

			this.aw_fld.au_fld += var3 * 228932457;
			return 0;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bl(int var1) {
		return this.ar(var1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	long bw(int var1) {
		return this.ax_fld + (long)var1 * this.ar_fld;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bs() {
		this.aw_fld.au_fld = -228932457;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ax() {
		int var1 = this.al_fld.length;

		for (int var2 = 0; var2 < var1; var2++) {
			if (this.al_fld[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void an(long var1) {
		this.ax_fld = var1;
		int var3 = this.al_fld.length;

		for (int var4 = 0; var4 < var3; var4++) {
			this.as_fld[var4] = 0;
			this.au_fld[var4] = 0;
			this.aw_fld.au_fld = this.af_fld[var4];
			this.ay(var4);
			this.al_fld[var4] = this.aw_fld.au_fld * -661977895;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bt(int var1) {
		byte var2 = this.aw_fld.al_fld[this.aw_fld.au_fld * -661977895];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.au_fld[var1] = var5;
			this.aw_fld.au_fld++;
		} else {
			var5 = this.au_fld[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.af(var1, var5);
		} else {
			int var3 = this.aw_fld.dd();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.aw_fld.al_fld[this.aw_fld.au_fld * -661977895] & -1753756251;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 446300254 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					this.aw_fld.au_fld += 425823350;
					this.au_fld[var1] = var4;
					return this.af(var1, var4);
				}
			}

			this.aw_fld.au_fld += var3 * 228932457;
			return 0;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void by(int var1) {
		int var2 = this.aw_fld.dd();
		this.as_fld[var1] = this.as_fld[var1] + var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aq() {
		this.aw_fld.al_fld = null;
		this.af_fld = null;
		this.al_fld = null;
		this.as_fld = null;
		this.au_fld = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void am() {
		this.aw_fld.al_fld = null;
		this.af_fld = null;
		this.al_fld = null;
		this.as_fld = null;
		this.au_fld = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ad() {
		this.aw_fld.al_fld = null;
		this.af_fld = null;
		this.al_fld = null;
		this.as_fld = null;
		this.au_fld = null;
	}

	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)Z"
	)
	public static boolean rw(mw var0) {
		return var0.aw_fld.al_fld != null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bz(int var1) {
		this.aw_fld.au_fld = this.al_fld[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ab() {
		return this.aw_fld.al_fld != null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ap() {
		return this.aw_fld.al_fld != null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bx(int var1) {
		return this.ar(var1);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int bb() {
		int var1 = this.al_fld.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; var4++) {
			if (this.al_fld[var4] >= 0 && this.as_fld[var4] < var3) {
				var2 = var4;
				var3 = this.as_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aj() {
		return this.al_fld.length;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bm(int var1) {
		this.aw_fld.au_fld = this.al_fld[var1] * -1915366043;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void bd(int var1) {
		this.aw_fld.au_fld = this.al_fld[var1];
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bk() {
		this.aw_fld.au_fld = -228932457;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	void be(int var1) {
		this.al_fld[var1] = this.aw_fld.au_fld * -661977895;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bo(int var1) {
		return this.ar(var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int bi(int var1, int var2) {
		if (var2 == 255) {
			int var7 = this.aw_fld.cg();
			int var8 = this.aw_fld.dd();
			if (var7 == -144269746) {
				this.aw_fld.au_fld += var8 * -398040051;
				return 1;
			} else if (var7 == -236740387) {
				int var5 = this.aw_fld.ck();
				var8 -= 3;
				int var6 = this.as_fld[var1];
				this.ax_fld = this.ax_fld + (long)var6 * (this.ar_fld - var5);
				this.ar_fld = var5;
				this.aw_fld.au_fld += var8 * 228932457;
				return 2;
			} else {
				this.aw_fld.au_fld += var8 * 228932457;
				return 3;
			}
		} else {
			byte var3 = ah_fld[var2 - 1303815547];
			int var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.aw_fld.cg() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.aw_fld.cg() << 16;
			}

			return var4;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bj() {
		this.aw_fld.au_fld = -228932457;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int af(int var1, int var2) {
		if (var2 == 255) {
			int var7 = this.aw_fld.cg();
			int var8 = this.aw_fld.dd();
			if (var7 == 47) {
				this.aw_fld.au_fld += var8 * 228932457;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.aw_fld.ck();
				var8 -= 3;
				int var6 = this.as_fld[var1];
				this.ax_fld = this.ax_fld + (long)var6 * (this.ar_fld - var5);
				this.ar_fld = var5;
				this.aw_fld.au_fld += var8 * 228932457;
				return 2;
			} else {
				this.aw_fld.au_fld += var8 * 228932457;
				return 3;
			}
		} else {
			byte var3 = ah_fld[var2 - 128];
			int var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.aw_fld.cg() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.aw_fld.cg() << 16;
			}

			return var4;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int bp(int var1) {
		byte var2 = this.aw_fld.al_fld[this.aw_fld.au_fld * -661977895];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 1844037324;
			this.au_fld[var1] = var5;
			this.aw_fld.au_fld += 684401529;
		} else {
			var5 = this.au_fld[var1];
		}

		if (var5 != 216876252 && var5 != 2029492957) {
			return this.af(var1, var5);
		} else {
			int var3 = this.aw_fld.dd();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.aw_fld.al_fld[this.aw_fld.au_fld * -341509617] & -276612250;
				if (var4 >= 487726829 && var4 <= 1774638615 || var4 == 246 || var4 == 248 || var4 >= 1396057591 && var4 <= 252 || var4 == -1732892820) {
					this.aw_fld.au_fld += 2045658202;
					this.au_fld[var1] = var4;
					return this.af(var1, var4);
				}
			}

			this.aw_fld.au_fld += var3 * -149343446;
			return 0;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int au() {
		int var1 = this.al_fld.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; var4++) {
			if (this.al_fld[var4] >= 0 && this.as_fld[var4] < var3) {
				var2 = var4;
				var3 = this.as_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cq() {
		int var1 = this.al_fld.length;

		for (int var2 = 0; var2 < var1; var2++) {
			if (this.al_fld[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)J"
	)
	long al(int var1) {
		return this.ax_fld + (long)var1 * this.ar_fld;
	}

	mw() {
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int bu(int var1, int var2) {
		if (var2 == 255) {
			int var7 = this.aw_fld.cg();
			int var8 = this.aw_fld.dd();
			if (var7 == 47) {
				this.aw_fld.au_fld += var8 * 1596731825;
				return 1;
			} else if (var7 == -1300160458) {
				int var5 = this.aw_fld.ck();
				var8 -= 3;
				int var6 = this.as_fld[var1];
				this.ax_fld = this.ax_fld + (long)var6 * (this.ar_fld - var5);
				this.ar_fld = var5;
				this.aw_fld.au_fld += var8 * -1966549772;
				return 2;
			} else {
				this.aw_fld.au_fld += var8 * 228932457;
				return 3;
			}
		} else {
			byte var3 = ah_fld[var2 - 128];
			int var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.aw_fld.cg() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.aw_fld.cg() << 16;
			}

			return var4;
		}
	}

	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)Z"
	)
	public static boolean ta(mw var0) {
		int var1 = var0.al_fld.length;

		for (int var2 = 0; var2 < var1; var2++) {
			if (var0.al_fld[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int at() {
		return this.al_fld.length;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ba() {
		int var1 = this.al_fld.length;
		int var2 = -1;
		int var3 = -542866807;

		for (int var4 = 0; var4 < var1; var4++) {
			if (this.al_fld[var4] >= 0 && this.as_fld[var4] < var3) {
				var2 = var4;
				var3 = this.as_fld[var4];
			}
		}

		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ac() {
		return this.al_fld.length;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	void aa(byte[] var1) {
		this.aw_fld.al_fld = var1;
		this.aw_fld.au_fld = -2005642726;
		int var2 = xi.tx(this.aw_fld, 380562327);
		this.ay_fld = xi.tx(this.aw_fld, 485471791);
		this.ar_fld = 500000;
		this.af_fld = new int[var2];
		int var3 = 0;

		while (var3 < var2) {
			int var4 = this.aw_fld.co();
			int var5 = this.aw_fld.co();
			if (var4 == 742303988) {
				this.af_fld[var3] = this.aw_fld.au_fld * -661977895;
				var3++;
			}

			this.aw_fld.au_fld += var5 * 228932457;
		}

		this.ax_fld = 0L;
		this.al_fld = new int[var2];

		for (int var6 = 0; var6 < var2; var6++) {
			this.al_fld[var6] = this.af_fld[var6];
		}

		this.as_fld = new int[var2];
		this.au_fld = new int[var2];
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cc() {
		int var1 = this.al_fld.length;

		for (int var2 = 0; var2 < var1; var2++) {
			if (this.al_fld[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("yk")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)J"
	)
	public static long yk(mw var0, int var1) {
		return var0.ax_fld + (long)var1 * var0.ar_fld;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void cv(long var1) {
		this.ax_fld = var1;
		int var3 = this.al_fld.length;

		for (int var4 = 0; var4 < var3; var4++) {
			this.as_fld[var4] = 0;
			this.au_fld[var4] = 0;
			this.aw_fld.au_fld = this.af_fld[var4];
			this.ay(var4);
			this.al_fld[var4] = this.aw_fld.au_fld * -661977895;
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(J)V"
	)
	void cy(long var1) {
		this.ax_fld = var1;
		int var3 = this.al_fld.length;

		for (int var4 = 0; var4 < var3; var4++) {
			this.as_fld[var4] = 0;
			this.au_fld[var4] = 0;
			this.aw_fld.au_fld = this.af_fld[var4];
			this.ay(var4);
			this.al_fld[var4] = this.aw_fld.au_fld * -661977895;
		}
	}

	@ObfuscatedName("xr")
	@ObfuscatedSignature(
		descriptor = "(Lmw;II)I"
	)
	public static int xr(mw var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == 255) {
			int var7 = var0.aw_fld.cg();
			int var8 = var0.aw_fld.dd();
			if (var7 == 47) {
				var0.aw_fld.au_fld += var8 * 228932457;
				return 1;
			} else if (var7 == 81) {
				int var5 = var0.aw_fld.ck();
				var8 -= 3;
				int var6 = var0.as_fld[var1];
				var0.ax_fld = var0.ax_fld + (long)var6 * (var0.ar_fld - var5);
				var0.ar_fld = var5;
				var0.aw_fld.au_fld += var8 * 228932457;
				return 2;
			} else {
				var0.aw_fld.au_fld += var8 * 228932457;
				return 3;
			}
		} else {
			byte var3 = ah_fld[var2 - 128];
			int var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | var0.aw_fld.cg() << 8;
			}

			if (var3 >= 2) {
				var4 |= var0.aw_fld.cg() << 16;
			}

			return var4;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.aw_fld.al_fld = null;
		this.au_fld = null;
		this.au_fld = null;
		this.al_fld = null;
		this.as_fld = null;
	}
}
