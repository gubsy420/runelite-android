import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ti")
public class ti implements xm {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	static ti ak_fld = new ti(2, 1);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	static ti ag_fld = new ti(3, 2);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -42281481
	)
	int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	static ti av_fld = new ti(0, 10);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	static ti az_fld = new ti(1, 3);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 713013293
	)
	int ah_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	ti(int var1, int var2) {
		this.ae_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ah_fld;
	}

	@ObfuscatedName("yp")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIII)Z"
	)
	public static boolean yp(ev var0, int var1, int var2, int var3, int var4) {
		if (var0 == null) {
			var0.getClass();
		}

		if (!var0.cl(var1, var2, var3, var4)) {
			return var0.ch(var1, var2, var3, var4);
		} else {
			var0.dc(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + ev.ay_fld;
			int var6 = var2 * 64;
			int var7 = (var3 - var0.ds_fld - var0.cx_fld - 1) * 128;
			int var8 = (var4 - var0.ds_fld - var0.ca_fld - 1) * 128;

			for (int var9 = -var0.es_fld; var9 <= var0.bu_fld; var9 += 128) {
				if (var0.dm(var7, var0.dp_fld[var1] + var9, var8, var5, var6)) {
					return ev.mu(var0, var1, var2, var3, var4, true);
				}
			}

			return ev.mu(var0, var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V"
	)
	public static void ah(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var3 + var2) / 2;
			int var6 = var2;
			int var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;
			int var9 = Integer.MAX_VALUE == var7 ? 0 : 1;

			for (int var10 = var2; var10 < var3; var10++) {
				if (var0[var10] < (var10 & var9) + var7) {
					int var11 = var0[var10];
					var0[var10] = var0[var6];
					var0[var6] = var11;
					int var12 = var1[var10];
					var1[var10] = var1[var6];
					var1[var6++] = var12;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			ah(var0, var1, var2, var6 - 1);
			ah(var0, var1, 1 + var6, var3);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lki;"
	)
	public static ki[] ak() {
		return new ki[]{
			ki.as_fld,
			ki.av_fld,
			ki.aw_fld,
			ki.ay_fld,
			ki.ak_fld,
			ki.af_fld,
			ki.ar_fld,
			ki.an_fld,
			ki.az_fld,
			ki.ae_fld,
			ki.ai_fld,
			ki.aa_fld,
			ki.al_fld,
			ki.ax_fld,
			ki.au_fld,
			ki.ag_fld,
			ki.ah_fld
		};
	}
}
