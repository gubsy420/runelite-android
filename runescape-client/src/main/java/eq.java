import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("eq")
public class eq {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] az_fld = new int[500];
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ag_fld = new int[500];
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean af_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] av_fld = new int[500];
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	ea ae_fld = null;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld = -1;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] ak_fld = new int[500];
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ar_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgq;)V"
	)
	public static void ag(gq var0) {
		if (var0 == null) {
			var0.getClass();
		}
	}

	eq(byte[] var1, ea var2) {
		this.af_fld = false;
		this.ae_fld = var2;
		xi var3 = new xi(var1);
		xi var4 = new xi(var1);
		var3.au_fld = 457864914;
		int var5 = var3.cg();
		int var6 = -1;
		int var7 = 0;
		var4.au_fld = var3.au_fld + var5;

		for (int var8 = 0; var8 < var5; var8++) {
			int var9 = var3.cg();
			if (var9 > 0) {
				if (this.ae_fld.aw_fld[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; var10--) {
						if (this.ae_fld.aw_fld[var10] == 0) {
							ak_fld[var7] = var10;
							ag_fld[var7] = 0;
							az_fld[var7] = 0;
							av_fld[var7] = 0;
							var7++;
							break;
						}
					}
				}

				ak_fld[var7] = var8;
				short var12 = 0;
				if (this.ae_fld.aw_fld[var8] == 3) {
					var12 = 128;
				}

				if ((var9 & 1) != 0) {
					ag_fld[var7] = var4.dv();
				} else {
					ag_fld[var7] = var12;
				}

				if ((var9 & 2) != 0) {
					az_fld[var7] = var4.dv();
				} else {
					az_fld[var7] = var12;
				}

				if ((var9 & 4) != 0) {
					av_fld[var7] = var4.dv();
				} else {
					av_fld[var7] = var12;
				}

				var6 = var8;
				var7++;
				if (this.ae_fld.aw_fld[var8] == 5) {
					this.af_fld = true;
				}
			}
		}

		if (var4.au_fld != var1.length) {
			throw new RuntimeException();
		} else {
			this.ah_fld = var7;
			this.aw_fld = new int[var7];
			this.ay_fld = new int[var7];
			this.as_fld = new int[var7];
			this.ar_fld = new int[var7];

			for (int var11 = 0; var11 < var7; var11++) {
				this.aw_fld[var11] = ak_fld[var11];
				this.ay_fld[var11] = ag_fld[var11];
				this.as_fld[var11] = az_fld[var11];
				this.ar_fld[var11] = av_fld[var11];
			}

			var3.au_fld = var4.au_fld * -661977895;
		}
	}
}
