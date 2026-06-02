import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yh")
public class yh {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] ay_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] aw_fld;
	@ObfuscatedGetter(
		intValue = 1459641139
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public static int[] ah_fld;
	@ObfuscatedGetter(
		intValue = 1144730429
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedGetter(
		intValue = 764623883
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)Z"
	)
	public static boolean bh(ub var0, int var1) throws EOFException {
		byte[] var2 = ub.ae(var0, var1, (byte)88);
		if (var2 == null) {
			return false;
		} else {
			wz.al(var2, 1933295967);
			return true;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void bl() {
		av_fld = null;
		ae_fld = null;
		ah_fld = null;
		aw_fld = null;
		ay_fld = null;
		yo.as_fld = null;
	}

	yh() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lyc;"
	)
	static yc aa(ub var0, int var1, int var2) throws EOFException {
		if (!ms.ar(var0, var1, var2)) {
			return null;
		} else {
			yc var4 = new yc();
			var4.aw_fld = 2146878929 * ag_fld;
			var4.ay_fld = -2072019991 * az_fld;
			var4.ae_fld = av_fld[0];
			var4.ah_fld = ae_fld[0];
			var4.az_fld = ah_fld[0];
			var4.av_fld = aw_fld[0];
			var4.ag_fld = ay_fld;
			var4.ak_fld = yo.as_fld[0];
			jl.au();
			return var4;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)[Lyv;"
	)
	public static yv[] aq(ub var0, int var1, int var2) throws EOFException {
		if (!ms.ar(var0, var1, var2)) {
			return null;
		} else {
			yv[] var4 = new yv[ak_fld];

			for (int var5 = 0; var5 < ak_fld; var5++) {
				yv var6 = var4[var5] = new yv();
				var6.ad_fld = ag_fld;
				var6.ao_fld = az_fld;
				var6.as_fld = av_fld[var5];
				var6.ar_fld = ae_fld[var5];
				var6.aw_fld = ah_fld[var5];
				var6.ay_fld = aw_fld[var5];
				int var7 = var6.ay_fld * var6.aw_fld;
				byte[] var8 = yo.as_fld[var5];
				var6.ah_fld = new int[var7];

				for (int var9 = 0; var9 < var7; var9++) {
					int var10 = var8[var9] & 255;
					var6.ah_fld[var9] = ay_fld[var10];
				}
			}

			jl.au();
			return var4;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)[Lyc;"
	)
	public static yc[] ax(ub var0, int var1, int var2) throws EOFException {
		if (!ms.ar(var0, var1, var2)) {
			return null;
		} else {
			yc[] var4 = new yc[ak_fld];

			for (int var5 = 0; var5 < ak_fld; var5++) {
				yc var6 = var4[var5] = new yc();
				var6.aw_fld = ag_fld;
				var6.ay_fld = az_fld;
				var6.ae_fld = av_fld[var5];
				var6.ah_fld = ae_fld[var5];
				var6.az_fld = ah_fld[var5];
				var6.av_fld = aw_fld[var5];
				var6.ag_fld = ay_fld;
				var6.ak_fld = yo.as_fld[var5];
			}

			jl.au();
			return var4;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lyv;"
	)
	public static yv am(ub var0, int var1, int var2) throws EOFException {
		return !ms.ar(var0, var1, var2) ? null : kh.as();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lyv;"
	)
	public static yv ad(ub var0, int var1, int var2) throws EOFException {
		return !ms.ar(var0, var1, var2) ? null : kh.as();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;II)Lzf;"
	)
	public static zf ao(ub var0, ub var1, int var2, int var3) throws EOFException {
		if (!ms.ar(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.bb(var2, var3, 584982574);
			zf var4;
			if (null == var5) {
				var4 = null;
			} else {
				zf var6 = new zf(var5, av_fld, ae_fld, ah_fld, aw_fld, ay_fld, yo.as_fld);
				jl.au();
				var4 = var6;
			}

			return var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;II)Lzf;"
	)
	public static zf ab(ub var0, ub var1, int var2, int var3) throws EOFException {
		if (!ms.ar(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.bb(var2, var3, 584982574);
			zf var4;
			if (null == var5) {
				var4 = null;
			} else {
				zf var6 = new zf(var5, av_fld, ae_fld, ah_fld, aw_fld, ay_fld, yo.as_fld);
				jl.au();
				var4 = var6;
			}

			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;II)Lzf;"
	)
	public static zf ap(ub var0, ub var1, int var2, int var3) throws EOFException {
		if (!ms.ar(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.bb(var2, var3, 584982574);
			zf var4;
			if (null == var5) {
				var4 = null;
			} else {
				zf var6 = new zf(var5, av_fld, ae_fld, ah_fld, aw_fld, ay_fld, yo.as_fld);
				jl.au();
				var4 = var6;
			}

			return var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;)[Lyc;"
	)
	public static yc[] at(ub var0, String var1, String var2) throws EOFException {
		if (!ub.mo(var0, var1, var2, (byte)18)) {
			return null;
		} else {
			int var3 = var0.cm(var1, (byte)1);
			int var4 = var0.cz(var3, var2, -1074450495);
			return ck.ak(var0, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;)[Lyc;"
	)
	public static yc[] ac(ub var0, String var1, String var2) throws EOFException {
		if (!ub.mo(var0, var1, var2, (byte)1)) {
			return null;
		} else {
			int var3 = var0.cm(var1, (byte)1);
			int var4 = var0.cz(var3, var2, -845050516);
			return ck.ak(var0, var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;)Lyc;"
	)
	public static yc aj(ub var0, String var1, String var2) throws EOFException {
		if (!ub.mo(var0, var1, var2, (byte)21)) {
			return null;
		} else {
			int var3 = var0.cm(var1, (byte)1);
			int var4 = var0.cz(var3, var2, -810263247);
			return vq.ag(var0, var3, var4);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lyc;"
	)
	static yc ai(ub var0, int var1, int var2) throws EOFException {
		if (!ms.ar(var0, var1, var2)) {
			return null;
		} else {
			yc var4 = new yc();
			var4.aw_fld = ag_fld;
			var4.ay_fld = az_fld;
			var4.ae_fld = av_fld[0];
			var4.ah_fld = ae_fld[0];
			var4.az_fld = ah_fld[0];
			var4.av_fld = aw_fld[0];
			var4.ag_fld = ay_fld;
			var4.ak_fld = yo.as_fld[0];
			jl.au();
			return var4;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	static yv bd() {
		yv var0 = new yv();
		var0.ad_fld = ag_fld;
		var0.ao_fld = az_fld;
		var0.as_fld = av_fld[0];
		var0.ar_fld = ae_fld[0];
		var0.aw_fld = ah_fld[0];
		var0.ay_fld = aw_fld[0];
		int var1 = var0.ay_fld * var0.aw_fld;
		byte[] var2 = yo.as_fld[0];
		var0.ah_fld = new int[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			var0.ah_fld[var3] = ay_fld[var2[var3] & 255];
		}

		jl.au();
		return var0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	static yv bz() {
		yv var0 = new yv();
		var0.ad_fld = ag_fld;
		var0.ao_fld = az_fld;
		var0.as_fld = av_fld[0];
		var0.ar_fld = ae_fld[0];
		var0.aw_fld = ah_fld[0];
		var0.ay_fld = aw_fld[0];
		int var1 = var0.ay_fld * var0.aw_fld;
		byte[] var2 = yo.as_fld[0];
		var0.ah_fld = new int[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			var0.ah_fld[var3] = ay_fld[var2[var3] & 255];
		}

		jl.au();
		return var0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Z"
	)
	static boolean br(ub var0, int var1, int var2) throws EOFException {
		byte[] var3 = var0.bb(var1, var2, 584982574);
		if (null == var3) {
			return false;
		} else {
			wz.al(var3, 682968870);
			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)[Lyc;"
	)
	public static yc[] an(ub var0, int var1, int var2) throws EOFException {
		if (!ms.ar(var0, var1, var2)) {
			return null;
		} else {
			yc[] var4 = new yc[ak_fld];

			for (int var5 = 0; var5 < ak_fld; var5++) {
				yc var6 = var4[var5] = new yc();
				var6.aw_fld = ag_fld;
				var6.ay_fld = az_fld;
				var6.ae_fld = av_fld[var5];
				var6.ah_fld = ae_fld[var5];
				var6.az_fld = ah_fld[var5];
				var6.av_fld = aw_fld[var5];
				var6.ag_fld = ay_fld;
				var6.ak_fld = yo.as_fld[var5];
			}

			jl.au();
			return var4;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Z"
	)
	static boolean bs(ub var0, int var1, int var2) throws EOFException {
		byte[] var3 = var0.bb(var1, var2, 584982574);
		if (null == var3) {
			return false;
		} else {
			wz.al(var3, 752694556);
			return true;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "()Lyv;"
	)
	static yv bm() {
		yv var0 = new yv();
		var0.ad_fld = ag_fld;
		var0.ao_fld = az_fld;
		var0.as_fld = av_fld[0];
		var0.ar_fld = ae_fld[0];
		var0.aw_fld = ah_fld[0];
		var0.ay_fld = aw_fld[0];
		int var1 = var0.ay_fld * var0.aw_fld;
		byte[] var2 = yo.as_fld[0];
		var0.ah_fld = new int[var1];

		for (int var3 = 0; var3 < var1; var3++) {
			var0.ah_fld[var3] = ay_fld[var2[var3] & 255];
		}

		jl.au();
		return var0;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)Z"
	)
	public static boolean bk(ub var0, int var1) throws EOFException {
		byte[] var2 = ub.ae(var0, var1, (byte)125);
		if (var2 == null) {
			return false;
		} else {
			wz.al(var2, 1854454938);
			return true;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)Z"
	)
	public static boolean bj(ub var0, int var1) throws EOFException {
		byte[] var2 = ub.ae(var0, var1, (byte)60);
		if (var2 == null) {
			return false;
		} else {
			wz.al(var2, -1022322152);
			return true;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)Z"
	)
	public static boolean bf(ub var0, int var1) throws EOFException {
		byte[] var2 = ub.ae(var0, var1, (byte)59);
		if (var2 == null) {
			return false;
		} else {
			wz.al(var2, 461753073);
			return true;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([B)V"
	)
	static void by(byte[] var0) {
		xi var1 = new xi(var0);
		var1.au_fld = 228932457 * (var0.length - 2);
		ak_fld = xi.tx(var1, 378119831);
		av_fld = new int[ak_fld * -48327361];
		ae_fld = new int[ak_fld];
		ah_fld = new int[ak_fld * -447745276];
		aw_fld = new int[ak_fld];
		yo.as_fld = new byte[ak_fld][];
		var1.au_fld = (var0.length - 7 - ak_fld) * 1661102340;
		ag_fld = xi.tx(var1, 959169113) * 1427930946;
		az_fld = xi.tx(var1, 1210633907);
		int var2 = (var1.cg() & 0xFF) + 1;

		for (int var3 = 0; var3 < ak_fld; var3++) {
			av_fld[var3] = xi.tx(var1, 1183739295);
		}

		for (int var13 = 0; var13 < ak_fld; var13++) {
			ae_fld[var13] = xi.tx(var1, 2087228665);
		}

		for (int var14 = 0; var14 < ak_fld; var14++) {
			ah_fld[var14] = xi.tx(var1, 1447787414);
		}

		for (int var15 = 0; var15 < ak_fld; var15++) {
			aw_fld[var15] = xi.tx(var1, 1133478261);
		}

		var1.au_fld = 228932457 * (var0.length - 7 - ak_fld - (var2 - 1) * 3);
		ay_fld = new int[var2];

		for (int var16 = 1; var16 < var2; var16++) {
			ay_fld[var16] = var1.ck();
			if (ay_fld[var16] == 0) {
				ay_fld[var16] = 1;
			}
		}

		var1.au_fld = 0;

		for (int var17 = 0; var17 < ak_fld; var17++) {
			int var4 = ah_fld[var17];
			int var5 = aw_fld[var17];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			yo.as_fld[var17] = var7;
			int var8 = var1.cg();
			boolean var9 = 1 == (var8 & 1);
			boolean var10 = (var8 & 2) == 2;
			if (!var9) {
				for (int var18 = 0; var18 < var6; var18++) {
					var7[var18] = xi.rp(var1, -1026068996);
				}
			} else {
				for (int var11 = 0; var11 < var4; var11++) {
					for (int var12 = 0; var12 < var5; var12++) {
						var7[var12 * var4 + var11] = xi.rp(var1, 1129555023);
					}
				}
			}

			if (var10) {
				var1.au_fld += var6 * -319846606;
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Z"
	)
	static boolean be(ub var0, int var1, int var2) throws EOFException {
		byte[] var3 = var0.bb(var1, var2, 584982574);
		if (null == var3) {
			return false;
		} else {
			wz.al(var3, 125032102);
			return true;
		}
	}
}
