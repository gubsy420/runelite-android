import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mp")
public class mp {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	ai ag_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1981835385
	)
	int ak_fld;

	mp(int var1, ai var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lds;B)Z"
	)
	static boolean co(ds var0) {
		if (!var0.ah_fld.ao((short)180)) {
			return false;
		} else {
			for (int var2 = 0; var2 < bw.dk_fld.ad_fld.az(); var2++) {
				rg var3 = (rg)bw.dk_fld.an_fld.ak(yw.wk(bw.dk_fld.ad_fld, var2, (byte)47));
				if (null != var3 && client.dv_fld == var3.ah_fld.az_fld.bp_fld && !var3.av(-1169938664) && lg.cb(var3, var0)) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z"
	)
	static boolean ep(int var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		return lw.eb(hk.mt_fld.ae_fld, var0, var1, var2, var3, var4, var5);
	}
}
