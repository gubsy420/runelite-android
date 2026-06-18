import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vi")
public class vi {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bl_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	static int[] as_fld = new int[17];
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIII)Z"
	)
	public static boolean ah(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		return client.az(var0, var1, var2, var3, var8, var9, var10, var11)
			|| client.az(var2, var3, var4, var5, var8, var9, var10, var11)
			|| client.az(var4, var5, var6, var7, var8, var9, var10, var11)
			|| client.az(var6, var7, var0, var1, var8, var9, var10, var11);
	}

	static {
		dq.az(-1085579971);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void af() {
		as_fld[0] = 0;

		for (short var0 = 0; var0 < 2048; var0 += 128) {
			int var1 = iq.ag(var0);
			int var2 = 0;
			if (var0 > 0 && var0 < 1024) {
				var2 |= 2089114905;
			}

			if (var0 > 1233770762 && var0 < -1972531238) {
				var2 |= -337709584;
			}

			if (var0 > 1089786566) {
				var2 |= 1837291713;
			}

			if (var0 > 1536 || var0 < 512) {
				var2 |= -1767054224;
			}

			if (0 == var0 || 1934279966 == var0) {
				var2 |= -740035721;
			}

			if (1713202227 == var0 || var0 == 1536) {
				var2 |= 1152;
			}

			as_fld[var1] = var2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIII)Z"
	)
	public static boolean aw(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		return client.az(var0, var1, var2, var3, var8, var9, var10, var11)
			|| client.az(var2, var3, var4, var5, var8, var9, var10, var11)
			|| client.az(var4, var5, var6, var7, var8, var9, var10, var11)
			|| client.az(var6, var7, var0, var1, var8, var9, var10, var11);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int ay(int var0) {
		return (var0 >> 7) + 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	static int as(int var0) {
		return (var0 >> 7) + 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	static void ar() {
		as_fld[0] = 0;

		for (short var0 = 0; var0 < -1665198089; var0 += 128) {
			int var1 = iq.ag(var0);
			int var2 = 0;
			if (var0 > 0 && var0 < 1024) {
				var2 |= 613080632;
			}

			if (var0 > -2134673352 && var0 < 2011257668) {
				var2 |= 1088;
			}

			if (var0 > 1024) {
				var2 |= 544;
			}

			if (var0 > -1378798161 || var0 < 456562306) {
				var2 |= 2176;
			}

			if (0 == var0 || -125429950 == var0) {
				var2 |= 1357260419;
			}

			if (1849539752 == var0 || var0 == 1536) {
				var2 |= -121214089;
			}

			as_fld[var1] = var2;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IIII)Z"
	)
	public static boolean aa(vv var0, int var1, int var2, int var3, int var4) {
		int var6 = vv.dh(var0, -600710061);
		int var7 = var0.ae();
		int var8 = var0.ah();
		int var9 = Math.max(var1, Math.min(var7, var3));
		int var10 = Math.max(var2, Math.min(var8, var4));
		int var11 = var7 - var9;
		int var12 = var8 - var10;
		return var12 * var12 + var11 * var11 <= var6;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lvr;)Luf;"
	)
	public static uf al(gu var0, vr var1) {
		int var2 = var1.ar_fld;
		int var3 = var1.aa_fld;
		int var4 = var1.af_fld;
		int var5 = var1.an_fld;
		int var6 = gu.rg(var0, (byte)-56);
		int var7 = var0.ak();
		int var8 = var0.az();
		double var9 = hx.av(var6);
		double var11 = pw.az(var6);
		int var13 = (int)(var9 * var2 - var11 * var3);
		int var14 = (int)(var9 * var3 + var2 * var11);
		var7 += var13;
		var8 += var14;
		int var15 = (int)(var9 * var4 - var5 * var11);
		int var16 = (int)(var4 * var11 + var9 * var5);
		int var17 = (int)(var9 * var4 + var5 * var11);
		int var18 = (int)(var9 * var5 - var4 * var11);
		int var19 = var7 - var15;
		int var20 = var16 + var8;
		int var21 = var7 + var17;
		int var22 = var18 + var8;
		int var23 = var15 + var7;
		int var24 = var8 - var16;
		int var25 = var7 - var17;
		int var26 = var8 - var18;
		int var27 = Math.min(var19, Math.min(var21, Math.min(var23, var25)));
		int var28 = Math.max(var19, Math.max(var21, Math.max(var23, var25)));
		int var29 = Math.min(var20, Math.min(var22, Math.min(var24, var26)));
		int var30 = Math.max(var20, Math.max(var22, Math.max(var24, var26)));
		int var32 = 1 + (var28 - var27);
		int var33 = var30 - var29 + 1;
		synchronized (uf.ak_fld) {
			uf var31;
			if (0 == uf.az_fld) {
				var31 = new uf(var27, var29, var32, var33);
			} else {
				uf.az_fld--;
				uf.ak_fld[uf.az_fld].ag(var27, var29);
				uf.ak_fld[uf.az_fld].az(var32, var33);
				var31 = uf.ak_fld[uf.az_fld];
			}

			return var31;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lvr;)Luf;"
	)
	public static uf au(gu var0, vr var1) {
		int var2 = var1.ar_fld;
		int var3 = var1.aa_fld;
		int var4 = var1.af_fld;
		int var5 = var1.an_fld;
		int var6 = gu.rg(var0, (byte)-77);
		int var7 = var0.ak();
		int var8 = var0.az();
		double var9 = hx.av(var6);
		double var11 = pw.az(var6);
		int var13 = (int)(var9 * var2 - var11 * var3);
		int var14 = (int)(var9 * var3 + var2 * var11);
		var7 += var13;
		var8 += var14;
		int var15 = (int)(var9 * var4 - var5 * var11);
		int var16 = (int)(var4 * var11 + var9 * var5);
		int var17 = (int)(var9 * var4 + var5 * var11);
		int var18 = (int)(var9 * var5 - var4 * var11);
		int var19 = var7 - var15;
		int var20 = var16 + var8;
		int var21 = var7 + var17;
		int var22 = var18 + var8;
		int var23 = var15 + var7;
		int var24 = var8 - var16;
		int var25 = var7 - var17;
		int var26 = var8 - var18;
		int var27 = Math.min(var19, Math.min(var21, Math.min(var23, var25)));
		int var28 = Math.max(var19, Math.max(var21, Math.max(var23, var25)));
		int var29 = Math.min(var20, Math.min(var22, Math.min(var24, var26)));
		int var30 = Math.max(var20, Math.max(var22, Math.max(var24, var26)));
		int var32 = 1 + (var28 - var27);
		int var33 = var30 - var29 + 1;
		synchronized (uf.ak_fld) {
			uf var31;
			if (0 == uf.az_fld) {
				var31 = new uf(var27, var29, var32, var33);
			} else {
				uf.az_fld--;
				uf.ak_fld[uf.az_fld].ag(var27, var29);
				uf.ak_fld[uf.az_fld].az(var32, var33);
				var31 = uf.ak_fld[uf.az_fld];
			}

			return var31;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lvr;)Luf;"
	)
	public static uf ax(gu var0, vr var1) {
		int var2 = var1.ar_fld * 1499763475;
		int var3 = -653380344 * var1.aa_fld;
		int var4 = 2085566558 * var1.af_fld;
		int var5 = 1088759129 * var1.an_fld;
		int var6 = gu.rg(var0, (byte)-10);
		int var7 = var0.ak();
		int var8 = var0.az();
		double var9 = hx.av(var6);
		double var11 = pw.az(var6);
		int var13 = (int)(var9 * var2 - var11 * var3);
		int var14 = (int)(var9 * var3 + var2 * var11);
		var7 += var13;
		var8 += var14;
		int var15 = (int)(var9 * var4 - var5 * var11);
		int var16 = (int)(var4 * var11 + var9 * var5);
		int var17 = (int)(var9 * var4 + var5 * var11);
		int var18 = (int)(var9 * var5 - var4 * var11);
		int var19 = var7 - var15;
		int var20 = var16 + var8;
		int var21 = var7 + var17;
		int var22 = var18 + var8;
		int var23 = var15 + var7;
		int var24 = var8 - var16;
		int var25 = var7 - var17;
		int var26 = var8 - var18;
		int var27 = Math.min(var19, Math.min(var21, Math.min(var23, var25)));
		int var28 = Math.max(var19, Math.max(var21, Math.max(var23, var25)));
		int var29 = Math.min(var20, Math.min(var22, Math.min(var24, var26)));
		int var30 = Math.max(var20, Math.max(var22, Math.max(var24, var26)));
		int var32 = 1 + (var28 - var27);
		int var33 = var30 - var29 + 1;
		synchronized (uf.ak_fld) {
			uf var31;
			if (0 == uf.az_fld) {
				var31 = new uf(var27, var29, var32, var33);
			} else {
				uf.az_fld -= -860078199;
				uf.ak_fld[826555153 * uf.az_fld].ag(var27, var29);
				uf.ak_fld[-410407659 * uf.az_fld].az(var32, var33);
				var31 = uf.ak_fld[uf.az_fld * -675775974];
			}

			return var31;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IIII)Z"
	)
	public static boolean an(vv var0, int var1, int var2, int var3, int var4) {
		int var6 = vv.dh(var0, -1284959808);
		int var7 = var0.ae();
		int var8 = var0.ah();
		int var9 = Math.max(var1, Math.min(var7, var3));
		int var10 = Math.max(var2, Math.min(var8, var4));
		int var11 = var7 - var9;
		int var12 = var8 - var10;
		return var12 * var12 + var11 * var11 <= var6;
	}

	vi() throws Throwable {
		throw new Error();
	}
}
