import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("lk")
public class lk {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldx;Ldx;III)I"
	)
	static int cd(da var0, dx var1, dx var2, int var3, int var4) {
		tu var6 = sh.ak(var0.bi_fld, 0.0F, var0.dm_fld);
		tu var7;
		if (var1.ag_fld != var2.ag_fld) {
			if (0 == var1.ag_fld) {
				rg var8 = (rg)bw.dk_fld.an_fld.ak(var2.ag_fld);
				var7 = var8.ap(var3, var4, -1368737079);
			} else if (0 == var2.ag_fld) {
				rg var12 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
				var7 = var12.at(var3, var4, 172968906);
			} else {
				rg var13 = (rg)bw.dk_fld.an_fld.ak(var2.ag_fld);
				rg var9 = (rg)bw.dk_fld.an_fld.ak(var1.ag_fld);
				tu var10 = var13.ap(var3, var4, -840654472);
				var7 = var9.at((int)var10.ar_fld, (int)var10.as_fld, 1589175229);
				var10.ah();
			}
		} else {
			var7 = sh.ak(var3, 0.0F, var4);
		}

		int var14 = -1;
		int var15 = (int)(var6.ar_fld - var7.ar_fld);
		int var16 = (int)(var6.as_fld - var7.as_fld);
		if (0 != var15 || 0 != var16) {
			int var11 = (int)(Math.atan2(var15, var16) * 325.94932345220167) & 2047;
			var14 = var11;
		}

		var6.ah();
		var7.ah();
		return var14;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public static void jn(pi var0) {
		var0.al_fld = var0.az_fld;
	}

	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "(Laax;)Z"
	)
	public static boolean rf(aax var0) {
		return null != var0.ak_fld;
	}

	lk() throws Throwable {
		throw new Error();
	}
}
