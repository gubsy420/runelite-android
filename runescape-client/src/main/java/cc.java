import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cc")
public class cc implements xm {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	static cc ag_fld = new cc(1, 1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	static cc az_fld = new cc(2, 7);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	static cc av_fld = new cc(3, 8);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	static cc ae_fld = new cc(4, 9);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -358424275
	)
	int aw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -227553919
	)
	int ah_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int al_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	static cc ak_fld = new cc(0, -1);
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aj_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bf_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int as_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ah_fld;
	}

	cc(int var1, int var2) {
		this.aw_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lcc;"
	)
	static cc[] az() {
		return new cc[]{ak_fld, az_fld, ae_fld, av_fld, ag_fld};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ah_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ah_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lcc;"
	)
	static cc[] aw() {
		return new cc[]{ak_fld, az_fld, ae_fld, av_fld, ag_fld};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lju;"
	)
	public static ju[] ak() {
		return new ju[]{ju.ah_fld, ju.av_fld, ju.ae_fld, ju.az_fld, ju.ag_fld, ju.ak_fld};
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lpc;Lxi;I)V"
	)
	public static void ge(pc var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2 == 1) {
				var0.aw_fld = xi.kt(var1, (byte)-45);
			} else if (var2 == 2) {
				var0.ay_fld = xi.kt(var1, (byte)-94);
			} else if (var2 == 3) {
				var0.as_fld = xi.at(var1, 1665732844);
			} else if (var2 == 4) {
				var0.ar_fld = xi.lx(var1, -1273208652);
			} else if (5 == var2) {
				xi.lx(var1, 102924750);
			} else if (var2 == 6) {
				var0.af_fld = var1.cg();
			} else if (7 == var2) {
				int var3 = var1.cg();
				if (0 == (var3 & 1)) {
					var0.al_fld = false;
				}

				if (2 == (var3 & 2)) {
					var0.au_fld = true;
				}
			} else if (var2 == 8) {
				var1.cg();
			} else if (var2 >= 10 && var2 <= 14) {
				var0.ax_fld[var2 - 10] = xi.at(var1, 1397619242);
			} else if (var2 == 15) {
				int var6 = var1.cg();
				var0.aa_fld = new int[2 * var6];

				for (int var4 = 0; var4 < var6 * 2; var4++) {
					var0.aa_fld[var4] = var1.cz();
				}

				var1.co((byte)-6);
				int var9 = var1.cg();
				var0.ap_fld = new int[var9];

				for (int var5 = 0; var5 < var0.ap_fld.length; var5++) {
					var0.ap_fld[var5] = var1.co((byte)-42);
				}

				var0.at_fld = new byte[var6];

				for (int var10 = 0; var10 < var6; var10++) {
					var0.at_fld[var10] = var1.cw();
				}
			} else if (16 != var2) {
				if (17 == var2) {
					var0.an_fld = xi.at(var1, 680345209);
				} else if (var2 == 18) {
					xi.kt(var1, (byte)-16);
				} else if (var2 == 19) {
					var0.ac_fld = var1.cm();
				} else if (21 == var2) {
					var1.co((byte)-128);
				} else if (22 == var2) {
					var1.co((byte)-97);
				} else if (var2 == 23) {
					var1.cg();
					var1.cg();
					var1.cg();
				} else if (24 == var2) {
					var1.cz();
					var1.cz();
				} else if (25 == var2) {
					xi.kt(var1, (byte)-24);
				} else if (28 == var2) {
					var1.cg();
				} else if (29 == var2) {
					pv[] var7 = new pv[]{pv.ag_fld, pv.az_fld, pv.ak_fld};
					var0.ao_fld = (pv)ka.ak(var7, var1.cg());
				} else if (30 == var2) {
					op[] var8 = new op[]{op.az_fld, op.ag_fld, op.ak_fld};
					var0.ab_fld = (op)ka.ak(var8, var1.cg());
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(J)J"
	)
	static long aw(long var0) {
		return var0 & -524289L;
	}
}
