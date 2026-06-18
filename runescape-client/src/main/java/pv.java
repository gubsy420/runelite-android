import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pv")
public class pv implements xm {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	static pv ak_fld = new pv(2, 0);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	static pv ag_fld = new pv(0, 1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	static pv az_fld = new pv(1, 2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1817025895
	)
	public int av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1972467765
	)
	int ae_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	pv(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Lsl;"
	)
	public static sl aa(xi var0) {
		int var2 = var0.cm();
		if (var2 >= 0 && var2 <= 5000) {
			int var3 = var0.cg();
			if (var3 == 0) {
				int[] var8 = new int[var2];

				for (int var10 = 0; var10 < var2; var10++) {
					var8[var10] = var0.co((byte)-1);
				}

				return pm.au(var8);
			} else if (1 == var3) {
				long[] var7 = new long[var2];

				for (int var9 = 0; var9 < var2; var9++) {
					var7[var9] = var0.cu();
				}

				return wn.ax(var7);
			} else if (2 != var3) {
				throw new RuntimeException();
			} else {
				String[] var4 = new String[var2];

				for (int var5 = 0; var5 < var2; var5++) {
					var4[var5] = xi.at(var0, 2008146716);
				}

				sl var6 = new sl(yq.az_fld, false);
				var6.as_fld = var4;
				var6.av_fld = -69344095 * var4.length;
				var6.ae_fld = var4.length;
				return var6;
			}
		} else {
			throw new RuntimeException();
		}
	}
}
