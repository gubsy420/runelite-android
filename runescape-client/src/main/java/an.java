import java.io.EOFException;
import java.util.concurrent.locks.ReentrantLock;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("an")
public class an {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ad_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/concurrent/locks/ReentrantLock;"
	)
	ReentrantLock az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	bz ak_fld;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -496440865
	)
	static int mu_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	al ag_fld;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean ow_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public static long bd_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lba;"
	)
	static ba ak(int var0) throws EOFException {
		ba var2 = (ba)ba.ak_fld.ak(var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = bj.ib_fld.bb(var0, 0, 584982574);
			if (var3 == null) {
				return null;
			} else {
				var2 = jv.av(var3);
				ba.ak_fld.az(var2, var0);
				return var2;
			}
		}
	}

	an(bz var1, al var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = new ReentrantLock();
	}

	@ObfuscatedName("zt")
	@ObfuscatedSignature(
		descriptor = "(Ldu;)I"
	)
	public static int zt(du var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.az_fld;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I"
	)
	static int cd(int var0, ba var1, boolean var2) throws EOFException {
		if (6754 == var0) {
			int var7 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			pp var8 = ca.az(var7);
			bp.ai_fld[(ef.aq_fld += -211521517) * -836183525 - 1] = null != var8 ? var8.cg_fld : "";
			return 1;
		} else if (6764 == var0) {
			gz.ax_fld -= 2;
			pp var6 = ca.az(bp.au_fld[gz.ax_fld]);
			int var5 = bp.au_fld[gz.ax_fld + 1];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var6.ai(var5, 894375913);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var6.am(var5, 1558744381);
			return 1;
		} else if (6765 == var0) {
			pp var4 = ca.az(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = null != var4 ? var4.dx_fld : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
