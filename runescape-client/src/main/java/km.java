import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("km")
public class km {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	static km av_fld = new km(3);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	public static km ag_fld = new km(1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	static km az_fld = new km(2);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	public static km ak_fld = new km(0);
	@ObfuscatedGetter(
		intValue = 598830903
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bj_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	static km ae_fld = new km(4);
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bv_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)[Lyv;"
	)
	public static yv[] az(ub var0, int var1, int var2) throws EOFException {
		if (!ms.ar(var0, var1, var2)) {
			return null;
		} else {
			yv[] var5 = new yv[yh.ak_fld];

			for (int var6 = 0; var6 < yh.ak_fld; var6++) {
				yv var7 = var5[var6] = new yv();
				var7.ad_fld = yh.ag_fld;
				var7.ao_fld = yh.az_fld;
				var7.as_fld = yh.av_fld[var6];
				var7.ar_fld = yh.ae_fld[var6];
				var7.aw_fld = yh.ah_fld[var6];
				var7.ay_fld = yh.aw_fld[var6];
				int var8 = var7.ay_fld * var7.aw_fld;
				byte[] var9 = yo.as_fld[var6];
				var7.ah_fld = new int[var8];

				for (int var10 = 0; var10 < var8; var10++) {
					int var11 = var9[var10] & 255;
					var7.ah_fld[var10] = yh.ay_fld[var11];
				}
			}

			jl.au();
			return var5;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static final void ag() {
		xh.ak(kh.hy_fld);
	}

	km(int var1) {
		this.ah_fld = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	static final boolean ak(int var0) {
		return 1 == var0 || var0 == 2 || var0 >= 3 && var0 <= 6 || var0 == 1001;
	}
}
