import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ka")
public class ka implements xm {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	public static ka ag_fld = new ka(1);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	public static ka az_fld = new ka(2);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	public static ka ak_fld = new ka(0);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 455123449
	)
	public int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	public static ka av_fld = new ka(3);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int an_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[BLun;B)V"
	)
	static void ae(int var0, byte[] var1, un var2) {
		ur var4 = new ur();
		var4.ak_fld = 0;
		var4.hc_long = var0;
		var4.ag_fld = var1;
		var4.az_fld = var2;
		synchronized (uw.ak_fld) {
			uw.ak_fld.az(var4);
		}

		ku.ay_void(755330953);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bj(int var0, ba var1, boolean var2) throws EOFException {
		if (3400 == var0) {
			gz.ax_fld -= 2;
			int var10 = bp.au_fld[gz.ax_fld];
			int var12 = bp.au_fld[1 + gz.ax_fld];
			os var13 = gx.ak(var10);
			if (!var13.af('s', (byte)32)) {
			}

			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.uw(var13, var12);
			return 1;
		} else if (3408 == var0) {
			gz.ax_fld -= 4;
			char var9 = (char)bp.au_fld[gz.ax_fld];
			char var11 = (char)bp.au_fld[gz.ax_fld + 1];
			int var6 = bp.au_fld[gz.ax_fld + 2];
			int var7 = bp.au_fld[gz.ax_fld + 3];
			os var8 = gx.ak(var6);
			if (os.xn(var8, var9, 1040248386) && var8.af(var11, (byte)88)) {
				if (var8.af('s', (byte)97)) {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = os.uw(var8, var7);
				} else if (var8.af('Ï', (byte)97)) {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var8.as(var7, (byte)45);
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var8.ay(var7, 1909759552);
				}

				return 1;
			} else {
				if (var11 == 's') {
					bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = kh.aj_fld;
				} else if (var11 == 207) {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = 0L;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				}

				return 1;
			}
		} else if (var0 == 3411) {
			int var4 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			os var5 = gx.ak(var4);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var5.av(1027586023);
			return 1;
		} else {
			return 2;
		}
	}

	ka(int var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Lxm;II)Lxm;"
	)
	public static xm ak(xm[] var0, int var1) {
		xm[] var3 = var0;

		for (int var4 = 0; var4 < var3.length; var4++) {
			xm var5 = var3[var4];
			if (var1 == var5.ag(116368110)) {
				return var5;
			}
		}

		return null;
	}
}
