import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("we")
public class we extends ws {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1776046265
	)
	int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -5009916022531722617L
	)
	long ak_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z"
	)
	@Override
	public boolean ak(short var1) {
		if (this.ak_fld < this.ag_fld) {
			this.ak_fld++;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "(Lpc;Lxi;I)V"
	)
	public static void we(pc var0, xi var1, int var2) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 == 1) {
			var0.aw_fld = xi.kt(var1, (byte)-103) * 1708454919;
		} else if (var2 == 2) {
			var0.ay_fld = xi.kt(var1, (byte)-38) * -647196930;
		} else if (var2 == 3) {
			var0.as_fld = xi.at(var1, -1583560597);
		} else if (var2 == 4) {
			var0.ar_fld = xi.lx(var1, -588889827) * -1020340517;
		} else if (5 == var2) {
			xi.lx(var1, 403985175);
		} else if (var2 == 6) {
			var0.af_fld = var1.cg() * 1461577841;
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
			var0.ax_fld[var2 - 10] = xi.at(var1, -552910182);
		} else if (var2 == 15) {
			int var6 = var1.cg();
			var0.aa_fld = new int[2 * var6];

			for (int var4 = 0; var4 < var6 * 2; var4++) {
				var0.aa_fld[var4] = var1.cz();
			}

			var1.co((byte)-128);
			int var9 = var1.cg();
			var0.ap_fld = new int[var9];

			for (int var5 = 0; var5 < var0.ap_fld.length; var5++) {
				var0.ap_fld[var5] = var1.co((byte)-10);
			}

			var0.at_fld = new byte[var6];

			for (int var10 = 0; var10 < var6; var10++) {
				var0.at_fld[var10] = var1.cw();
			}
		} else if (16 != var2) {
			if (17 == var2) {
				var0.an_fld = xi.at(var1, -1257740553);
			} else if (var2 == 18) {
				xi.kt(var1, (byte)-22);
			} else if (var2 == 19) {
				var0.ac_fld = var1.cm() * -1585832024;
			} else if (21 == var2) {
				var1.co((byte)-45);
			} else if (22 == var2) {
				var1.co((byte)-95);
			} else if (var2 == 23) {
				var1.cg();
				var1.cg();
				var1.cg();
			} else if (24 == var2) {
				var1.cz();
				var1.cz();
			} else if (25 == var2) {
				xi.kt(var1, (byte)-16);
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

	public we(ws var1, int var2) {
		super(var1);
		this.ag_fld = var2;
		this.aw_fld = "DelayFadeTask";
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean ag() {
		if (this.ak_fld < this.ag_fld * 594454270) {
			this.ak_fld++;
			return false;
		} else {
			return true;
		}
	}
}
