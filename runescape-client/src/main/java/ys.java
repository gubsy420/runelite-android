import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ys")
public class ys {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] ak_fld = new int[]{
		16777215,
		14942979,
		16747520,
		16772352,
		32806,
		2375822,
		7547266,
		16720268,
		11884176,
		5261772,
		10724259,
		13970688,
		15693351,
		16577588,
		494960,
		2208255,
		10178454,
		16756679,
		13722276,
		8105443,
		16751190,
		2543274,
		7591918,
		10246609,
		10021057,
		11894492,
		2894892,
		9699842,
		6371605,
		13680896,
		4882723,
		14504,
		8388736,
		14025328,
		10682978,
		4004472
	};
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lxh;I)Ljm;"
	)
	public static jm az(int var0, String var1, xh var2, int var3) {
		jm var4 = gi.ak(jb.ck_fld, client.aq_fld.av_fld);
		var4.ay_fld.bc(0);
		int var5 = var4.ay_fld.au_fld * -661977895;
		var4.ay_fld.bc(var0);
		String var6 = var1.toLowerCase();
		int var7 = 0;
		byte[] var8 = null;
		if (var6.startsWith(kh.ie_fld)) {
			var7 = 0;
			var1 = var1.substring(kh.ie_fld.length());
		} else if (var6.startsWith(kh.iv_fld)) {
			var7 = 1;
			var1 = var1.substring(kh.iv_fld.length());
		} else if (var6.startsWith(kh.im_fld)) {
			var7 = 2;
			var1 = var1.substring(kh.im_fld.length());
		} else if (var6.startsWith(kh.if_fld)) {
			var7 = 3;
			var1 = var1.substring(kh.if_fld.length());
		} else if (var6.startsWith(kh.ip_fld)) {
			var7 = 4;
			var1 = var1.substring(kh.ip_fld.length());
		} else if (var6.startsWith(kh.il_fld)) {
			var7 = 5;
			var1 = var1.substring(kh.il_fld.length());
		} else if (var6.startsWith(kh.ia_fld)) {
			var7 = 6;
			var1 = var1.substring(kh.ia_fld.length());
		} else if (var6.startsWith(kh.iq_fld)) {
			var7 = 7;
			var1 = var1.substring(kh.iq_fld.length());
		} else if (var6.startsWith(kh.is_fld)) {
			var7 = 8;
			var1 = var1.substring(kh.is_fld.length());
		} else if (var6.startsWith(kh.iy_fld)) {
			var7 = 9;
			var1 = var1.substring(kh.iy_fld.length());
		} else if (var6.startsWith(kh.ic_fld)) {
			var7 = 10;
			var1 = var1.substring(kh.ic_fld.length());
		} else if (var6.startsWith(kh.in_fld)) {
			var7 = 11;
			var1 = var1.substring(kh.in_fld.length());
		} else if (var6.startsWith(kh.io_fld)) {
			var7 = 12;
			var1 = var1.substring(kh.io_fld.length());
		} else if (var6.startsWith(kh.ik_fld)) {
			var8 = ge.ag(var6);
			if (null != var8) {
				var7 = var8.length + 12;
				var1 = var1.substring(kh.ik_fld.length() + var8.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var9 = 0;
		if (var6.startsWith(kh.ij_fld)) {
			var9 = 1;
			var1 = var1.substring(kh.ij_fld.length());
		} else if (var6.startsWith(kh.id_fld)) {
			var9 = 2;
			var1 = var1.substring(kh.id_fld.length());
		} else if (var6.startsWith(kh.ih_fld)) {
			var9 = 3;
			var1 = var1.substring(kh.ih_fld.length());
		} else if (var6.startsWith(kh.ix_fld)) {
			var9 = 4;
			var1 = var1.substring(kh.ix_fld.length());
		} else if (var6.startsWith(kh.iu_fld)) {
			var9 = 5;
			var1 = var1.substring(kh.iu_fld.length());
		}

		var4.ay_fld.bc(var7);
		var4.ay_fld.bc(var9);
		if (var8 != null) {
			for (int var10 = 0; var10 < var8.length; var10++) {
				var4.ay_fld.bc(var8[var10]);
			}
		}

		jj.ak(var4.ay_fld, var1);
		if (var0 == kf.av_fld.ag(-1197140574)) {
			var4.ay_fld.bc(var3);
		}

		var4.ay_fld.cp(var4.ay_fld.au_fld * 372501927 - var5);
		return var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)[B"
	)
	static byte[] av(String var0) {
		byte var1 = 48;
		byte var2 = 87;
		int var3 = kh.ik_fld.length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var4 + var3;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public static void fj(pi var0) {
		var0.aa_fld = var0.az_fld;
	}

	ys() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lda;)I"
	)
	public static int os(da var0) {
		return var0.cg_fld.ae_fld * 974676213;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	static void cf(int var0, byte var1) {
		client.em_fld = 0L;
		if (var0 >= 2) {
			client.el_fld = true;
			client.ms(-1);
		} else {
			client.el_fld = false;
			client.ms(-1);
		}

		if (xy.cy() == 1) {
			og.ci_fld.agh(765, 503, (byte)0);
		} else {
			og.ci_fld.agh(7680, 2160, (byte)0);
		}

		if (client.cl_fld >= 25) {
			if (var1 == 1) {
				return;
			}

			if (null != client.aq_fld && null != client.aq_fld.av_fld) {
				jm var2 = gi.ak(jb.bv_fld, client.aq_fld.av_fld);
				var2.ay_fld.bc(xy.cy());
				var2.ay_fld.bw(pf.qw_fld);
				var2.ay_fld.bw(bc.qx_fld);
				client.aq_fld.az(var2);
			}
		}
	}
}
