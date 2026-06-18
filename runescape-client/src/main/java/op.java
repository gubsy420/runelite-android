import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("op")
public class op implements xm {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static op ak_fld = new op(2, 0);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static op az_fld = new op(0, 2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1567188249
	)
	public int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 996915081
	)
	int ae_fld;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bm_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static op ag_fld = new op(1, 1);
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bu_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;

	op(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "(Lwj;III)I"
	)
	public static int rv(wj var0, int var1, int var2, int var3) {
		if (var0 == null) {
			var0.getClass();
		}

		return var2 >= var3 ? var1 : (int)((float)var2 / var3 * var1);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIIIII)V"
	)
	static final void av(dx var0, byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (var0.av_fld != null) {
			for (int var7 = 0; var7 < 4; var7++) {
				gn var8 = var0.av_fld[var7];

				for (int var9 = var2; var9 < var2 + 64; var9++) {
					for (int var10 = var3; var10 < var3 + 64; var10++) {
						if (gn.ve(var8, var9, var10, (byte)2)) {
							var8.ar(var9, var10, 1073741824, 1646253375);
						}
					}
				}
			}
		}

		xi var13 = new xi(var1);

		for (int var14 = 0; var14 < 4; var14++) {
			for (int var16 = 0; var16 < 64; var16++) {
				for (int var18 = 0; var18 < 64; var18++) {
					int var11 = var16 + var2;
					int var12 = var3 + var18;
					ck.aw(var0, var13, var14, var11, var12, var4 + var11, var5 + var12, 0, 1620897511);
				}
			}
		}

		int var10000;
		if (var13.au_fld < var13.al_fld.length) {
			if (var6 == -1414256990) {
				return;
			}

			var10000 = var13.cg();
		} else {
			var10000 = 0;
		}

		int var15 = var10000;
		boolean var17 = 0 != (var15 & 1);
		if (var17) {
			if (var6 == -1414256990) {
				return;
			}

			for (int var19 = 0; var19 < 64; var19++) {
				for (int var20 = 0; var20 < 64; var20++) {
					bc.ay(var13, (byte)16);
				}
			}
		}
	}
}
