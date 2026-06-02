import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ng")
public class ng {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	static char[] ak_fld = new char[64];
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	static char[] ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[C"
	)
	static char[] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] av_fld;
	@ObfuscatedGetter(
		intValue = 359913435
	)
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ir_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	static String ah(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 1195984731;
			var3.append(ak_fld[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[1 + var4] & 255;
				var3.append(ak_fld[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & -2066959063;
					var3.append(ak_fld[(var6 & 15) << 2 | var7 >>> 6]).append(ak_fld[var7 & -1117939880]);
				} else {
					var3.append(ak_fld[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(ak_fld[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	static {
		for (int var0 = 0; var0 < 26; var0++) {
			ak_fld[var0] = (char)(var0 + 65);
		}

		for (int var2 = 26; var2 < 52; var2++) {
			ak_fld[var2] = (char)(var2 + 97 - 26);
		}

		for (int var3 = 52; var3 < 62; var3++) {
			ak_fld[var3] = (char)(48 + var3 - 52);
		}

		ak_fld[62] = '+';
		ak_fld[63] = '/';
		ag_fld = new char[64];

		for (int var4 = 0; var4 < 26; var4++) {
			ag_fld[var4] = (char)(65 + var4);
		}

		for (int var5 = 26; var5 < 52; var5++) {
			ag_fld[var5] = (char)(var5 + 97 - 26);
		}

		for (int var6 = 52; var6 < 62; var6++) {
			ag_fld[var6] = (char)(48 + var6 - 52);
		}

		ag_fld[62] = '*';
		ag_fld[63] = '-';
		az_fld = new char[64];

		for (int var7 = 0; var7 < 26; var7++) {
			az_fld[var7] = (char)(65 + var7);
		}

		for (int var8 = 26; var8 < 52; var8++) {
			az_fld[var8] = (char)(var8 + 97 - 26);
		}

		for (int var9 = 52; var9 < 62; var9++) {
			az_fld[var9] = (char)(var9 + 48 - 52);
		}

		az_fld[62] = '-';
		az_fld[63] = '_';
		av_fld = new int[128];

		for (int var10 = 0; var10 < av_fld.length; var10++) {
			av_fld[var10] = -1;
		}

		for (int var11 = 65; var11 <= 90; var11++) {
			av_fld[var11] = var11 - 65;
		}

		for (int var12 = 97; var12 <= 122; var12++) {
			av_fld[var12] = var12 - 97 + 26;
		}

		for (int var13 = 48; var13 <= 57; var13++) {
			av_fld[var13] = 52 + (var13 - 48);
		}

		int[] var14 = av_fld;
		av_fld[43] = 62;
		var14[42] = 62;
		int[] var1 = av_fld;
		av_fld[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([B)Ljava/lang/String;"
	)
	public static String az(byte[] var0) {
		return dy.ag(var0, 0, var0.length);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	static String ae(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 182421429;
			var3.append(ak_fld[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[1 + var4] & 255;
				var3.append(ak_fld[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 710179311;
					var3.append(ak_fld[(var6 & 15) << 2 | var7 >>> 6]).append(ak_fld[var7 & -544671036]);
				} else {
					var3.append(ak_fld[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(ak_fld[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V"
	)
	static void fo(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
		if (18 == var2) {
			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var9 = var3 & 65535;
			int var10 = var3 >> 16;
			jm var11 = gi.ak(jb.ai_fld, client.aq_fld.av_fld);
			var11.ay_fld.di(var6 + var0);
			var11.ay_fld.di(var7 + var1);
			var11.ay_fld.bc(client.ej_fld.ay(82) ? 1 : 0);
			xi.si(var11.ay_fld, var9);
			xi.rs(var11.ay_fld, var10);
			client.aq_fld.az(var11);
		}

		if (var2 == 19) {
			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var12 = var3 & 65535;
			int var16 = var3 >> 16;
			jm var20 = gi.ak(jb.at_fld, client.aq_fld.av_fld);
			var20.ay_fld.dy(var16);
			var20.ay_fld.di(var0 + var6);
			var20.ay_fld.di(var12);
			xi.rs(var20.ay_fld, client.ej_fld.ay(82) ? 1 : 0);
			xi.be(var20.ay_fld, var7 + var1);
			client.aq_fld.az(var20);
		}

		if (20 == var2) {
			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var13 = var3 & 65535;
			int var17 = var3 >> 16;
			jm var21 = gi.ak(jb.ab_fld, client.aq_fld.av_fld);
			xi.be(var21.ay_fld, var0 + var6);
			xi.si(var21.ay_fld, var7 + var1);
			var21.ay_fld.dy(client.ej_fld.ay(82) ? 1 : 0);
			xi.rs(var21.ay_fld, var17);
			var21.ay_fld.bw(var13);
			client.aq_fld.az(var21);
		}

		if (21 == var2) {
			if (var8 <= 1) {
				return;
			}

			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var14 = var3 & 65535;
			int var18 = var3 >> 16;
			jm var22 = gi.ak(jb.cq_fld, client.aq_fld.av_fld);
			var22.ay_fld.di(var1 + var7);
			var22.ay_fld.dy(client.ej_fld.ay(82) ? 1 : 0);
			var22.ay_fld.bc(var18);
			var22.ay_fld.bw(var0 + var6);
			xi.be(var22.ay_fld, var14);
			client.aq_fld.az(var22);
		}

		if (var2 == 22) {
			if (var8 <= 1) {
				return;
			}

			client.ml_fld = var4;
			client.mw_fld = var5;
			client.mp_fld = -652374910;
			client.mn_fld = 0;
			client.oq_fld = var0;
			client.or_fld = var1;
			int var15 = var3 & 65535;
			int var19 = var3 >> 16;
			jm var23 = gi.ak(jb.dj_fld, client.aq_fld.av_fld);
			var23.ay_fld.ek(var19);
			var23.ay_fld.ek(client.ej_fld.ay(82) ? 1 : 0);
			var23.ay_fld.bw(var15);
			xi.si(var23.ay_fld, var7 + var1);
			xi.be(var23.ay_fld, var0 + var6);
			client.aq_fld.az(var23);
		}
	}

	ng() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BII)Ljava/lang/String;"
	)
	static String aw(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(ak_fld[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[1 + var4] & -1193890955;
				var3.append(ak_fld[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & -589116233;
					var3.append(ak_fld[(var6 & 15) << 2 | var7 >>> 6]).append(ak_fld[var7 & -449364118]);
				} else {
					var3.append(ak_fld[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(ak_fld[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([B)Ljava/lang/String;"
	)
	public static String av(byte[] var0) {
		return dy.ag(var0, 0, var0.length);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void aw() {
		bg.ak_fld = new xz(32);
	}
}
