import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gp")
public class gp {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static uf bw_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	gj[] ak_fld;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[ILgj;)I"
	)
	int aa(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		gj.wk(var9, -2104928424);
		int var10 = var9.ae();
		int var11 = var9.ah();
		int[][] var12 = var9.ay();
		int[][] var13 = var9.aw();
		int[] var14 = gj.sy(var9, 375228626);
		int[] var15 = var9.ar();
		boolean var16;
		if (1 == var3) {
			var16 = this.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.ae(var1, var2, var4, var5, var9);
		} else {
			var16 = tq(this, var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = gj.nd(var9, (byte)4);
		int var20 = var9.av();
		if (!var16) {
			if (!var6) {
				return -1;
			}

			int var21 = Integer.MAX_VALUE;
			int var22 = Integer.MAX_VALUE;
			byte var23 = 10;
			int var24 = var4.ak_fld;
			int var25 = var4.ag_fld;
			int var26 = 130609340 * var4.az_fld;
			int var27 = 950160028 * var4.av_fld;

			for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
				for (int var29 = var25 - var23; var29 <= var25 + var23; var29++) {
					int var30 = var28 - var17;
					int var31 = var29 - var18;
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < -179180127) {
						int var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) {
							var32 = var28 - (var26 + var24 - 1);
						}

						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = var32 * var32 + var33 * var33;
						if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
							var21 = var34;
							var22 = var12[var30][var31];
							var19 = var28;
							var20 = var29;
						}
					}
				}
			}

			if (var21 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var1 == var19 && var2 == var20) {
			var7[0] = var19;
			var8[0] = var20;
			return 0;
		} else {
			int var35 = 0;
			var14[var35] = var19;
			var15[var35++] = var20;

			int var38;
			for (int var37 = var38 = var13[var19 - var17][var20 - var18]; var1 != var19 || var20 != var2; var37 = var13[var19 - var17][var20 - var18]) {
				if (var38 != var37) {
					var38 = var37;
					var14[var35] = var19;
					var15[var35++] = var20;
				}

				if (0 != (var37 & 2)) {
					var19++;
				} else if (0 != (var37 & 8)) {
					var19--;
				}

				if (0 != (var37 & 1)) {
					var20++;
				} else if (0 != (var37 & 4)) {
					var20--;
				}
			}

			int var39 = 0;

			while (var35-- > 0) {
				var7[var39] = var14[var35];
				var8[var39++] = var15[var35];
				if (var39 >= var7.length) {
					break;
				}
			}

			return var39;
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IILgr;Lgn;Lgj;)Z"
	)
	public static boolean ix(gp var0, int var1, int var2, gr var3, gn var4, gj var5) {
		if (var0 == null) {
			var0.getClass();
		}

		int var6 = var5.ae();
		int var7 = var5.ah();
		int[][] var8 = var5.ay();
		int[][] var9 = var5.aw();
		int[] var10 = gj.sy(var5, 863981626);
		int[] var11 = var5.ar();
		int var12 = gj.iq(var5, (byte)-72);
		int var13 = var1;
		int var14 = var2;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var1 - var15;
		int var18 = var2 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		int var19 = 0;
		int var20 = 0;
		var10[var19] = var1;
		var11[var19++] = var2;

		while (var19 != var20) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = 1 + var20 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var21 = var13 - var4.ak(-1502380992);
			int var22 = var14 - var4.ag((short)256);
			if (var3.ak(1, var13, var14, var4, 816603914)) {
				gj.aj(var5, var13, var14);
				return true;
			}

			int var23 = 1 + var8[var15][var16];
			if (var15 > 0 && 0 == var9[var15 - 1][var16] && !gn.lb(var4, var21 - 1, var22, 1076101384)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14;
				var19 = var19 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 1 && 0 == var9[1 + var15][var16] && !gn.lb(var4, var21 + 1, var22, 1076101504)) {
				var10[var19] = 1 + var13;
				var11[var19] = var14;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !gn.lb(var4, var21, var22 - 1, 1076101378)) {
				var10[var19] = var13;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && !gn.lb(var4, var21, var22 + 1, 1076101408)) {
				var10[var19] = var13;
				var11[var19] = 1 + var14;
				var19 = var19 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][1 + var16] = var23;
			}

			if (var15 > 0
				&& var16 > 0
				&& 0 == var9[var15 - 1][var16 - 1]
				&& !gn.lb(var4, var21 - 1, var22 - 1, 1076101390)
				&& !gn.lb(var4, var21 - 1, var22, 1076101384)
				&& !gn.lb(var4, var21, var22 - 1, 1076101378)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 1
				&& var16 > 0
				&& var9[var15 + 1][var16 - 1] == 0
				&& !gn.lb(var4, var21 + 1, var22 - 1, 1076101507)
				&& !gn.lb(var4, var21 + 1, var22, 1076101504)
				&& !gn.lb(var4, var21, var22 - 1, 1076101378)) {
				var10[var19] = var13 + 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var23;
			}

			if (var15 > 0
				&& var16 < var7 - 1
				&& var9[var15 - 1][var16 + 1] == 0
				&& !gn.lb(var4, var21 - 1, 1 + var22, 1076101432)
				&& !gn.lb(var4, var21 - 1, var22, 1076101384)
				&& !gn.lb(var4, var21, var22 + 1, 1076101408)) {
				var10[var19] = var13 - 1;
				var11[var19] = 1 + var14;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][1 + var16] = var23;
			}

			if (var15 < var6 - 1
				&& var16 < var7 - 1
				&& 0 == var9[1 + var15][1 + var16]
				&& !gn.lb(var4, 1 + var21, var22 + 1, 1076101600)
				&& !gn.lb(var4, 1 + var21, var22, 1076101504)
				&& !gn.lb(var4, var21, var22 + 1, 1076101408)) {
				var10[var19] = 1 + var13;
				var11[var19] = var14 + 1;
				var19 = var19 + 1 & var12;
				var9[1 + var15][1 + var16] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		gj.aj(var5, var13, var14);
		return false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILgr;Lgn;Lgj;)Z"
	)
	final boolean aq(int var1, int var2, gr var3, gn var4, gj var5) {
		int var6 = var5.ae();
		int var7 = var5.ah();
		int[][] var8 = var5.ay();
		int[][] var9 = var5.aw();
		int[] var10 = gj.sy(var5, -391223004);
		int[] var11 = var5.ar();
		int var12 = gj.iq(var5, (byte)-49);
		int var13 = var1;
		int var14 = var2;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var1 - var15;
		int var18 = var2 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		int var19 = 0;
		int var20 = 0;
		var10[var19] = var1;
		var11[var19++] = var2;

		while (var19 != var20) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = 1 + var20 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var21 = var13 - var4.ak(-1502380992);
			int var22 = var14 - var4.ag((short)256);
			if (var3.ak(1, var13, var14, var4, 2130663626)) {
				gj.aj(var5, var13, var14);
				return true;
			}

			int var23 = 1 + var8[var15][var16];
			if (var15 > 0 && 0 == var9[var15 - 1][var16] && !gn.lb(var4, var21 - 1, var22, 1076101384)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14;
				var19 = var19 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 1 && 0 == var9[1 + var15][var16] && !gn.lb(var4, var21 + 1, var22, 1076101504)) {
				var10[var19] = 1 + var13;
				var11[var19] = var14;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !gn.lb(var4, var21, var22 - 1, 1076101378)) {
				var10[var19] = var13;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && !gn.lb(var4, var21, var22 + 1, 1076101408)) {
				var10[var19] = var13;
				var11[var19] = 1 + var14;
				var19 = var19 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][1 + var16] = var23;
			}

			if (var15 > 0
				&& var16 > 0
				&& 0 == var9[var15 - 1][var16 - 1]
				&& !gn.lb(var4, var21 - 1, var22 - 1, 1076101390)
				&& !gn.lb(var4, var21 - 1, var22, 1076101384)
				&& !gn.lb(var4, var21, var22 - 1, 1076101378)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 1
				&& var16 > 0
				&& var9[var15 + 1][var16 - 1] == 0
				&& !gn.lb(var4, var21 + 1, var22 - 1, 1076101507)
				&& !gn.lb(var4, var21 + 1, var22, 1076101504)
				&& !gn.lb(var4, var21, var22 - 1, 1076101378)) {
				var10[var19] = var13 + 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var23;
			}

			if (var15 > 0
				&& var16 < var7 - 1
				&& var9[var15 - 1][var16 + 1] == 0
				&& !gn.lb(var4, var21 - 1, 1 + var22, 1076101432)
				&& !gn.lb(var4, var21 - 1, var22, 1076101384)
				&& !gn.lb(var4, var21, var22 + 1, 1076101408)) {
				var10[var19] = var13 - 1;
				var11[var19] = 1 + var14;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][1 + var16] = var23;
			}

			if (var15 < var6 - 1
				&& var16 < var7 - 1
				&& 0 == var9[1 + var15][1 + var16]
				&& !gn.lb(var4, 1 + var21, var22 + 1, 1076101600)
				&& !gn.lb(var4, 1 + var21, var22, 1076101504)
				&& !gn.lb(var4, var21, var22 + 1, 1076101408)) {
				var10[var19] = 1 + var13;
				var11[var19] = var14 + 1;
				var19 = var19 + 1 & var12;
				var9[1 + var15][1 + var16] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		gj.aj(var5, var13, var14);
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[II)I"
	)
	public int ag(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, int var9) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILgr;Lgn;Z[I[ILgj;)I"
	)
	public static int mh(gp var0, int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		if (var0 == null) {
			var0.getClass();
		}

		gj.wk(var9, -1666345188);
		int var10 = var9.ae();
		int var11 = var9.ah();
		int[][] var12 = var9.ay();
		int[][] var13 = var9.aw();
		int[] var14 = gj.sy(var9, -586951514);
		int[] var15 = var9.ar();
		boolean var16;
		if (1 == var3) {
			var16 = var0.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = var0.ae(var1, var2, var4, var5, var9);
		} else {
			var16 = tq(var0, var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = gj.nd(var9, (byte)4);
		int var20 = var9.av();
		if (!var16) {
			if (!var6) {
				return -1;
			}

			int var21 = Integer.MAX_VALUE;
			int var22 = -1380333056;
			byte var23 = 10;
			int var24 = -433159306 * var4.ak_fld;
			int var25 = 1918299471 * var4.ag_fld;
			int var26 = var4.az_fld;
			int var27 = var4.av_fld;

			for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
				for (int var29 = var25 - var23; var29 <= var25 + var23; var29++) {
					int var30 = var28 - var17;
					int var31 = var29 - var18;
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
						int var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) {
							var32 = var28 - (var26 + var24 - 1);
						}

						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = var32 * var32 + var33 * var33;
						if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
							var21 = var34;
							var22 = var12[var30][var31];
							var19 = var28;
							var20 = var29;
						}
					}
				}
			}

			if (var21 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var1 == var19 && var2 == var20) {
			var7[0] = var19;
			var8[0] = var20;
			return 0;
		} else {
			int var35 = 0;
			var14[var35] = var19;
			var15[var35++] = var20;

			int var38;
			for (int var37 = var38 = var13[var19 - var17][var20 - var18]; var1 != var19 || var20 != var2; var37 = var13[var19 - var17][var20 - var18]) {
				if (var38 != var37) {
					var38 = var37;
					var14[var35] = var19;
					var15[var35++] = var20;
				}

				if (0 != (var37 & 2)) {
					var19++;
				} else if (0 != (var37 & 8)) {
					var19--;
				}

				if (0 != (var37 & 1)) {
					var20++;
				} else if (0 != (var37 & 4)) {
					var20--;
				}
			}

			int var39 = 0;

			while (var35-- > 0) {
				var7[var39] = var14[var35];
				var8[var39++] = var15[var35];
				if (var39 >= var7.length) {
					break;
				}
			}

			return var39;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int af(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILgr;Lgn;Lgj;)Z"
	)
	final boolean av(int var1, int var2, gr var3, gn var4, gj var5) {
		int var7 = var5.ae();
		int var8 = var5.ah();
		int[][] var9 = var5.ay();
		int[][] var10 = var5.aw();
		int[] var11 = gj.sy(var5, -1730303608);
		int[] var12 = var5.ar();
		int var13 = gj.iq(var5, (byte)-116);
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		int var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		var12[var20++] = var2;

		while (var20 != var21) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = 1 + var21 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var22 = var14 - var4.ak(-1502380992);
			int var23 = var15 - var4.ag((short)256);
			if (var3.ak(1, var14, var15, var4, 1135610559)) {
				gj.aj(var5, var14, var15);
				return true;
			}

			int var24 = 1 + var9[var16][var17];
			if (var16 > 0 && 0 == var10[var16 - 1][var17] && !gn.lb(var4, var22 - 1, var23, 1076101384)) {
				var11[var20] = var14 - 1;
				var12[var20] = var15;
				var20 = var20 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var24;
			}

			if (var16 < var7 - 1 && 0 == var10[1 + var16][var17] && !gn.lb(var4, var22 + 1, var23, 1076101504)) {
				var11[var20] = 1 + var14;
				var12[var20] = var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var24;
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && !gn.lb(var4, var22, var23 - 1, 1076101378)) {
				var11[var20] = var14;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var24;
			}

			if (var17 < var8 - 1 && var10[var16][var17 + 1] == 0 && !gn.lb(var4, var22, var23 + 1, 1076101408)) {
				var11[var20] = var14;
				var12[var20] = 1 + var15;
				var20 = var20 + 1 & var13;
				var10[var16][var17 + 1] = 4;
				var9[var16][1 + var17] = var24;
			}

			if (var16 > 0
				&& var17 > 0
				&& 0 == var10[var16 - 1][var17 - 1]
				&& !gn.lb(var4, var22 - 1, var23 - 1, 1076101390)
				&& !gn.lb(var4, var22 - 1, var23, 1076101384)
				&& !gn.lb(var4, var22, var23 - 1, 1076101378)) {
				var11[var20] = var14 - 1;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var24;
			}

			if (var16 < var7 - 1
				&& var17 > 0
				&& var10[var16 + 1][var17 - 1] == 0
				&& !gn.lb(var4, var22 + 1, var23 - 1, 1076101507)
				&& !gn.lb(var4, var22 + 1, var23, 1076101504)
				&& !gn.lb(var4, var22, var23 - 1, 1076101378)) {
				var11[var20] = var14 + 1;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[var16 + 1][var17 - 1] = var24;
			}

			if (var16 > 0
				&& var17 < var8 - 1
				&& var10[var16 - 1][var17 + 1] == 0
				&& !gn.lb(var4, var22 - 1, 1 + var23, 1076101432)
				&& !gn.lb(var4, var22 - 1, var23, 1076101384)
				&& !gn.lb(var4, var22, var23 + 1, 1076101408)) {
				var11[var20] = var14 - 1;
				var12[var20] = 1 + var15;
				var20 = 1 + var20 & var13;
				var10[var16 - 1][var17 + 1] = 6;
				var9[var16 - 1][1 + var17] = var24;
			}

			if (var16 < var7 - 1
				&& var17 < var8 - 1
				&& 0 == var10[1 + var16][1 + var17]
				&& !gn.lb(var4, 1 + var22, var23 + 1, 1076101600)
				&& !gn.lb(var4, 1 + var22, var23, 1076101504)
				&& !gn.lb(var4, var22, var23 + 1, 1076101408)) {
				var11[var20] = 1 + var14;
				var12[var20] = var15 + 1;
				var20 = var20 + 1 & var13;
				var10[1 + var16][1 + var17] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}

		gj.aj(var5, var14, var15);
		return false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILgr;Lgn;Lgj;)Z"
	)
	final boolean ae(int var1, int var2, gr var3, gn var4, gj var5) {
		int var7 = var5.ae();
		int var8 = var5.ah();
		int[][] var9 = var5.ay();
		int[][] var10 = var5.aw();
		int[] var11 = gj.sy(var5, 1219594720);
		int[] var12 = var5.ar();
		int var13 = gj.iq(var5, (byte)-61);
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		int var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		var12[var20++] = var2;

		while (var21 != var20) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = var21 + 1 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var22 = var14 - var4.ak(-1502380992);
			int var23 = var15 - var4.ag((short)256);
			if (var3.ak(2, var14, var15, var4, 1530221537)) {
				gj.aj(var5, var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0 && 0 == var10[var16 - 1][var17] && !gn.lb(var4, var22 - 1, var23, 1076101390) && !gn.lb(var4, var22 - 1, 1 + var23, 1076101432)) {
				var11[var20] = var14 - 1;
				var12[var20] = var15;
				var20 = var20 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var24;
			}

			if (var16 < var7 - 2 && var10[1 + var16][var17] == 0 && !gn.lb(var4, 2 + var22, var23, 1076101507) && !gn.lb(var4, 2 + var22, 1 + var23, 1076101600)) {
				var11[var20] = var14 + 1;
				var12[var20] = var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var24;
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && !gn.lb(var4, var22, var23 - 1, 1076101390) && !gn.lb(var4, var22 + 1, var23 - 1, 1076101507)) {
				var11[var20] = var14;
				var12[var20] = var15 - 1;
				var20 = var20 + 1 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var24;
			}

			if (var17 < var8 - 2 && 0 == var10[var16][var17 + 1] && !gn.lb(var4, var22, 2 + var23, 1076101432) && !gn.lb(var4, 1 + var22, 2 + var23, 1076101600)) {
				var11[var20] = var14;
				var12[var20] = var15 + 1;
				var20 = var20 + 1 & var13;
				var10[var16][1 + var17] = 4;
				var9[var16][var17 + 1] = var24;
			}

			if (var16 > 0
				&& var17 > 0
				&& var10[var16 - 1][var17 - 1] == 0
				&& !gn.lb(var4, var22 - 1, var23, 1076101438)
				&& !gn.lb(var4, var22 - 1, var23 - 1, 1076101390)
				&& !gn.lb(var4, var22, var23 - 1, 1076101519)) {
				var11[var20] = var14 - 1;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var24;
			}

			if (var16 < var7 - 2
				&& var17 > 0
				&& var10[var16 + 1][var17 - 1] == 0
				&& !gn.lb(var4, var22 + 1, var23 - 1, 1076101519)
				&& !gn.lb(var4, 2 + var22, var23 - 1, 1076101507)
				&& !gn.lb(var4, 2 + var22, var23, 1076101603)) {
				var11[var20] = var14 + 1;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[1 + var16][var17 - 1] = var24;
			}

			if (var16 > 0
				&& var17 < var8 - 2
				&& var10[var16 - 1][1 + var17] == 0
				&& !gn.lb(var4, var22 - 1, var23 + 1, 1076101438)
				&& !gn.lb(var4, var22 - 1, 2 + var23, 1076101432)
				&& !gn.lb(var4, var22, 2 + var23, 1076101624)) {
				var11[var20] = var14 - 1;
				var12[var20] = 1 + var15;
				var20 = var20 + 1 & var13;
				var10[var16 - 1][1 + var17] = 6;
				var9[var16 - 1][var17 + 1] = var24;
			}

			if (var16 < var7 - 2
				&& var17 < var8 - 2
				&& var10[1 + var16][1 + var17] == 0
				&& !gn.lb(var4, var22 + 1, 2 + var23, 1076101624)
				&& !gn.lb(var4, var22 + 2, var23 + 2, 1076101600)
				&& !gn.lb(var4, var22 + 2, var23 + 1, 1076101603)) {
				var11[var20] = var14 + 1;
				var12[var20] = 1 + var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}

		gj.aj(var5, var14, var15);
		return false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aw() {
		this.ak_fld = new gj[1];
		gh var1 = gh.az_fld;
		this.ak_fld[0] = new gj(var1.ay_fld, var1.ar_fld);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() {
		this.ak_fld = new gj[1];
		gh var1 = gh.az_fld;
		this.ak_fld[0] = new gj(var1.ay_fld, var1.ar_fld);
	}

	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILgr;Lgn;Lgj;)Z"
	)
	public static boolean tq(gp var0, int var1, int var2, int var3, gr var4, gn var5, gj var6) {
		if (var0 == null) {
			var0.getClass();
		}

		int var8 = var6.ae();
		int var9 = var6.ah();
		int[][] var10 = var6.ay();
		int[][] var11 = var6.aw();
		int[] var12 = gj.sy(var6, 1546261116);
		int[] var13 = var6.ar();
		int var14 = gj.iq(var6, (byte)-8);
		int var15 = var1;
		int var16 = var2;
		int var17 = var8 >> 1;
		int var18 = var9 >> 1;
		int var19 = var1 - var17;
		int var20 = var2 - var18;
		var11[var17][var18] = 99;
		var10[var17][var18] = 0;
		int var21 = 0;
		int var22 = 0;
		var12[var21] = var1;
		var13[var21++] = var2;

		label397:
		while (var22 != var21) {
			var15 = var12[var22];
			var16 = var13[var22];
			var22 = 1 + var22 & var14;
			var17 = var15 - var19;
			var18 = var16 - var20;
			int var23 = var15 - var5.ak(-1502380992);
			int var24 = var16 - var5.ag((short)256);
			if (var4.ak(var3, var15, var16, var5, 704474510)) {
				gj.aj(var6, var15, var16);
				return true;
			}

			int var25 = var10[var17][var18] + 1;
			if (var17 > 0 && 0 == var11[var17 - 1][var18] && !gn.lb(var5, var23 - 1, var24, 1076101390) && !gn.lb(var5, var23 - 1, var3 + var24 - 1, 1076101432)) {
				int var26 = 1;

				while (true) {
					if (var26 >= var3 - 1) {
						var12[var21] = var15 - 1;
						var13[var21] = var16;
						var21 = 1 + var21 & var14;
						var11[var17 - 1][var18] = 2;
						var10[var17 - 1][var18] = var25;
						break;
					}

					if (gn.lb(var5, var23 - 1, var26 + var24, 1076101438)) {
						break;
					}

					var26++;
				}
			}

			if (var17 < var8 - var3
				&& var11[1 + var17][var18] == 0
				&& !gn.lb(var5, var3 + var23, var24, 1076101507)
				&& !gn.lb(var5, var3 + var23, var24 + var3 - 1, 1076101600)) {
				int var30 = 1;

				while (true) {
					if (var30 >= var3 - 1) {
						var12[var21] = var15 + 1;
						var13[var21] = var16;
						var21 = 1 + var21 & var14;
						var11[var17 + 1][var18] = 8;
						var10[1 + var17][var18] = var25;
						break;
					}

					if (gn.lb(var5, var23 + var3, var24 + var30, 1076101603)) {
						break;
					}

					var30++;
				}
			}

			if (var18 > 0 && var11[var17][var18 - 1] == 0 && !gn.lb(var5, var23, var24 - 1, 1076101390) && !gn.lb(var5, var23 + var3 - 1, var24 - 1, 1076101507)) {
				int var31 = 1;

				while (true) {
					if (var31 >= var3 - 1) {
						var12[var21] = var15;
						var13[var21] = var16 - 1;
						var21 = var21 + 1 & var14;
						var11[var17][var18 - 1] = 1;
						var10[var17][var18 - 1] = var25;
						break;
					}

					if (gn.lb(var5, var31 + var23, var24 - 1, 1076101519)) {
						break;
					}

					var31++;
				}
			}

			if (var18 < var9 - var3
				&& 0 == var11[var17][1 + var18]
				&& !gn.lb(var5, var23, var3 + var24, 1076101432)
				&& !gn.lb(var5, var23 + var3 - 1, var24 + var3, 1076101600)) {
				int var32 = 1;

				while (true) {
					if (var32 >= var3 - 1) {
						var12[var21] = var15;
						var13[var21] = 1 + var16;
						var21 = var21 + 1 & var14;
						var11[var17][1 + var18] = 4;
						var10[var17][var18 + 1] = var25;
						break;
					}

					if (gn.lb(var5, var23 + var32, var24 + var3, 1076101624)) {
						break;
					}

					var32++;
				}
			}

			if (var17 > 0 && var18 > 0 && var11[var17 - 1][var18 - 1] == 0 && !gn.lb(var5, var23 - 1, var24 - 1, 1076101390)) {
				int var33 = 1;

				while (true) {
					if (var33 >= var3) {
						var12[var21] = var15 - 1;
						var13[var21] = var16 - 1;
						var21 = 1 + var21 & var14;
						var11[var17 - 1][var18 - 1] = 3;
						var10[var17 - 1][var18 - 1] = var25;
						break;
					}

					if (gn.lb(var5, var23 - 1, var33 + (var24 - 1), 1076101438) || gn.lb(var5, var23 - 1 + var33, var24 - 1, 1076101519)) {
						break;
					}

					var33++;
				}
			}

			if (var17 < var8 - var3 && var18 > 0 && 0 == var11[1 + var17][var18 - 1] && !gn.lb(var5, var3 + var23, var24 - 1, 1076101507)) {
				int var34 = 1;

				while (true) {
					if (var34 >= var3) {
						var12[var21] = var15 + 1;
						var13[var21] = var16 - 1;
						var21 = 1 + var21 & var14;
						var11[1 + var17][var18 - 1] = 9;
						var10[1 + var17][var18 - 1] = var25;
						break;
					}

					if (gn.lb(var5, var3 + var23, var24 - 1 + var34, 1076101603) || gn.lb(var5, var34 + var23, var24 - 1, 1076101519)) {
						break;
					}

					var34++;
				}
			}

			if (var17 > 0 && var18 < var9 - var3 && 0 == var11[var17 - 1][1 + var18] && !gn.lb(var5, var23 - 1, var24 + var3, 1076101432)) {
				int var35 = 1;

				while (true) {
					if (var35 >= var3) {
						var12[var21] = var15 - 1;
						var13[var21] = 1 + var16;
						var21 = 1 + var21 & var14;
						var11[var17 - 1][var18 + 1] = 6;
						var10[var17 - 1][var18 + 1] = var25;
						break;
					}

					if (gn.lb(var5, var23 - 1, var24 + var35, 1076101438) || gn.lb(var5, var35 + (var23 - 1), var24 + var3, 1076101624)) {
						break;
					}

					var35++;
				}
			}

			if (var17 < var8 - var3 && var18 < var9 - var3 && var11[var17 + 1][1 + var18] == 0 && !gn.lb(var5, var3 + var23, var3 + var24, 1076101600)) {
				for (int var36 = 1; var36 < var3; var36++) {
					if (gn.lb(var5, var23 + var36, var24 + var3, 1076101624) || gn.lb(var5, var3 + var23, var36 + var24, 1076101603)) {
						continue label397;
					}
				}

				var12[var21] = var15 + 1;
				var13[var21] = 1 + var16;
				var21 = 1 + var21 & var14;
				var11[var17 + 1][var18 + 1] = 12;
				var10[var17 + 1][var18 + 1] = var25;
			}
		}

		gj.aj(var6, var15, var16);
		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int as(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	public gp() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int al(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int au(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[ILgj;)I"
	)
	int ax(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		gj.wk(var9, -1851767817);
		int var10 = var9.ae();
		int var11 = var9.ah();
		int[][] var12 = var9.ay();
		int[][] var13 = var9.aw();
		int[] var14 = gj.sy(var9, -1905751608);
		int[] var15 = var9.ar();
		boolean var16;
		if (1 == var3) {
			var16 = this.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.ae(var1, var2, var4, var5, var9);
		} else {
			var16 = tq(this, var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = gj.nd(var9, (byte)4);
		int var20 = var9.av();
		if (!var16) {
			if (!var6) {
				return -1;
			}

			int var21 = Integer.MAX_VALUE;
			int var22 = -1292704095;
			byte var23 = 10;
			int var24 = -765256185 * var4.ak_fld;
			int var25 = 2056596013 * var4.ag_fld;
			int var26 = var4.az_fld;
			int var27 = -1584904731 * var4.av_fld;

			for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
				for (int var29 = var25 - var23; var29 <= var25 + var23; var29++) {
					int var30 = var28 - var17;
					int var31 = var29 - var18;
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 541057771) {
						int var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) {
							var32 = var28 - (var26 + var24 - 1);
						}

						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = var32 * var32 + var33 * var33;
						if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
							var21 = var34;
							var22 = var12[var30][var31];
							var19 = var28;
							var20 = var29;
						}
					}
				}
			}

			if (var21 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var1 == var19 && var2 == var20) {
			var7[0] = var19;
			var8[0] = var20;
			return 0;
		} else {
			int var35 = 0;
			var14[var35] = var19;
			var15[var35++] = var20;

			int var38;
			for (int var37 = var38 = var13[var19 - var17][var20 - var18]; var1 != var19 || var20 != var2; var37 = var13[var19 - var17][var20 - var18]) {
				if (var38 != var37) {
					var38 = var37;
					var14[var35] = var19;
					var15[var35++] = var20;
				}

				if (0 != (var37 & 2)) {
					var19++;
				} else if (0 != (var37 & 8)) {
					var19--;
				}

				if (0 != (var37 & 1)) {
					var20++;
				} else if (0 != (var37 & 4)) {
					var20--;
				}
			}

			int var39 = 0;

			while (var35-- > 0) {
				var7[var39] = var14[var35];
				var8[var39++] = var15[var35];
				if (var39 >= var7.length) {
					break;
				}
			}

			return var39;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int ar(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(Ldx;ZLxj;B)V"
	)
	static final void ey(dx var0, boolean var1, xj var2, byte var3) throws EOFException {
		client.ni(var0, var1, var2);
		client.nv_fld = 0;
		client.lx_fld = 0;
		var2.ap(-203585802);
		int var4 = var2.ar(8, -106081977);
		if (var4 < var0.ad_fld.az()) {
			if (var3 == 0) {
				client.sk(var0, var1, var2);
				return;
			}

			for (int var5 = var4; var5 < var0.ad_fld.az(); var5++) {
				if (var3 == 0) {
					client.sk(var0, var1, var2);
					return;
				}

				int var6 = var0.ad_fld.ag(var5);
				client.nm_fld[(client.nv_fld += 839171927) * -139289497 - 1] = var6;
				ds var7 = (ds)var0.ax_fld.ak(var6);
				var7.aw_fld = true;
			}
		}

		if (var4 > var0.ad_fld.az()) {
			throw new RuntimeException("");
		} else {
			var0.ad_fld.av();

			for (int var18 = 0; var18 < var4; var18++) {
				if (var3 == 0) {
					client.sk(var0, var1, var2);
					return;
				}

				int var21 = var0.ad_fld.ag(var18);
				ds var24 = (ds)var0.ax_fld.ak(var21);
				int var8 = var2.ar(1, -106081977);
				if (0 == var8) {
					var0.ad_fld.ak(var21);
				} else {
					int var9 = var2.ar(2, -106081977);
					if (var9 == 0) {
						var0.ad_fld.ak(var21);
						client.lj_fld[(client.lx_fld += 2012869705) * 1900822009 - 1] = var21;
					} else if (1 == var9) {
						var0.ad_fld.ak(var21);
						int var10 = var2.ar(3, -106081977);
						var24.as(var10, gt.az_fld, -964878378);
						int var11 = var2.ar(1, -106081977);
						if (1 == var11) {
							client.lj_fld[(client.lx_fld += 2012869705) * 1900822009 - 1] = var21;
						}
					} else if (var9 == 2) {
						var0.ad_fld.ak(var21);
						if (var2.ar(1, -106081977) == 1) {
							int var28 = var2.ar(3, -106081977);
							var24.as(var28, gt.av_fld, -964878378);
							int var32 = var2.ar(3, -106081977);
							var24.as(var32, gt.av_fld, -964878378);
						} else {
							int var29 = var2.ar(3, -106081977);
							var24.as(var29, gt.ag_fld, -964878378);
						}

						int var30 = var2.ar(1, -106081977);
						if (var30 == 1) {
							client.lj_fld[(client.lx_fld += 2012869705) * 1900822009 - 1] = var21;
						}
					} else if (var9 == 3) {
						client.nm_fld[(client.nv_fld += 839171927) * -139289497 - 1] = var21;
						var24.aw_fld = true;
					}
				}
			}

			while (true) {
				byte var16 = 16;
				int var19 = 1 << var16;
				if (xj.go(var2, client.aq_fld.ar_fld) < var16 + 12) {
					break;
				}

				int var22 = var2.ar(var16, -106081977);
				if (var19 - 1 == var22) {
					break;
				}

				boolean var25 = false;
				ds var26 = (ds)var0.ax_fld.ak(var22);
				if (null == var26) {
					var26 = new ds(var22);
					var0.ax_fld.ag(var26, var22);
					var25 = true;
				}

				var0.ad_fld.ak(var22);
				var26.aw_fld = false;
				var26.bl_fld = var0.ag_fld;
				int var33;
				if (var1) {
					var33 = var2.ar(8, -106081977);
					if (var33 > 127) {
						var33 -= 256;
					}
				} else {
					var33 = var2.ar(6, -106081977);
					if (var33 > 31) {
						var33 -= 64;
					}
				}

				int var27 = var2.ar(1, -106081977);
				int var12 = client.ns_fld[var2.ar(3, -106081977)];
				if (var25) {
					var26.dv_fld = (var26.bt_fld = -450034243 * var12) * 1246307829;
					var26.fy(var26.dv_fld, (byte)10);
				}

				pp var10001 = ca.az(var2.ar(14, -106081977));
				var26.cf(var10001);
				var26.ah_fld = var10001;
				int var31;
				if (var1) {
					var31 = var2.ar(8, -106081977);
					if (var31 > 127) {
						if (var3 == 0) {
							client.sk(var0, var1, var2);
							return;
						}

						var31 -= 256;
					}
				} else {
					var31 = var2.ar(6, -106081977);
					if (var31 > 31) {
						var31 -= 64;
					}
				}

				int var13 = var2.ar(1, -106081977);
				if (var13 == 1) {
					client.lj_fld[(client.lx_fld += 2012869705) * 1900822009 - 1] = var22;
				}

				boolean var14 = var2.ar(1, -106081977) == 1;
				if (var14) {
					if (var3 == 0) {
						client.sk(var0, var1, var2);
						return;
					}

					var2.ar(32, -106081977);
				}

				vj.el(var26);
				if (var26.dt_fld == 0) {
					var26.bt_fld = 0;
				}

				boolean var15 = var27 == 1 || var25;
				var26.ar(var31 + ep.ex_fld, by.eo_fld + var33, var15, (byte)77);
				if (var25) {
					var0.as(var26, 1557190008);
				}
			}

			var2.as(-1180972180);
			bv.em(var0, var2, -201108339);

			for (int var17 = 0; var17 < client.nv_fld; var17++) {
				if (var3 == 0) {
					client.sk(var0, var1, var2);
					return;
				}

				int var20 = client.nm_fld[var17];
				ds var23 = (ds)var0.ax_fld.ak(var20);
				if (var23.aw_fld) {
					var23.cf((pp)null);
					var23.ah_fld = null;
					var23.mb();
				}
			}

			if (var2.au_fld != client.aq_fld.ar_fld) {
				throw new RuntimeException(var2.au_fld + db.ag_fld + client.aq_fld.ar_fld);
			} else {
				client.sk(var0, var1, var2);
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Lgj;)Z"
	)
	final boolean ab(int var1, int var2, int var3, gr var4, gn var5, gj var6) {
		int var7 = var6.ae();
		int var8 = var6.ah();
		int[][] var9 = var6.ay();
		int[][] var10 = var6.aw();
		int[] var11 = gj.sy(var6, -586559227);
		int[] var12 = var6.ar();
		int var13 = gj.iq(var6, (byte)-53);
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = -761082901;
		var9[var16][var17] = 0;
		int var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		var12[var20++] = var2;

		label338:
		while (var21 != var20) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = 1 + var21 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var22 = var14 - var5.ak(-1502380992);
			int var23 = var15 - var5.ag((short)256);
			if (var4.ak(var3, var14, var15, var5, 1974125451)) {
				gj.aj(var6, var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0 && 0 == var10[var16 - 1][var17] && !gn.lb(var5, var22 - 1, var23, 1076101390) && !gn.lb(var5, var22 - 1, var3 + var23 - 1, 286083789)) {
				int var25 = 1;

				while (true) {
					if (var25 >= var3 - 1) {
						var11[var20] = var14 - 1;
						var12[var20] = var15;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17] = 2;
						var9[var16 - 1][var17] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var25 + var23, 1076101438)) {
						break;
					}

					var25++;
				}
			}

			if (var16 < var7 - var3
				&& var10[1 + var16][var17] == 0
				&& !gn.lb(var5, var3 + var22, var23, 1076101507)
				&& !gn.lb(var5, var3 + var22, var23 + var3 - 1, 613301150)) {
				int var29 = 1;

				while (true) {
					if (var29 >= var3 - 1) {
						var11[var20] = var14 + 1;
						var12[var20] = var15;
						var20 = 1 + var20 & var13;
						var10[var16 + 1][var17] = 8;
						var9[1 + var16][var17] = var24;
						break;
					}

					if (gn.lb(var5, var22 + var3, var23 + var29, -629367919)) {
						break;
					}

					var29++;
				}
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && !gn.lb(var5, var22, var23 - 1, 597326187) && !gn.lb(var5, var22 + var3 - 1, var23 - 1, 1076101507)) {
				int var30 = 1;

				while (true) {
					if (var30 >= var3 - 1) {
						var11[var20] = var14;
						var12[var20] = var15 - 1;
						var20 = var20 + 1 & var13;
						var10[var16][var17 - 1] = 1;
						var9[var16][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var30 + var22, var23 - 1, 1749763537)) {
						break;
					}

					var30++;
				}
			}

			if (var17 < var8 - var3
				&& 0 == var10[var16][1 + var17]
				&& !gn.lb(var5, var22, var3 + var23, 1737933537)
				&& !gn.lb(var5, var22 + var3 - 1, var23 + var3, 1076101600)) {
				int var31 = 1;

				while (true) {
					if (var31 >= var3 - 1) {
						var11[var20] = var14;
						var12[var20] = 1 + var15;
						var20 = var20 + 1 & var13;
						var10[var16][1 + var17] = 4;
						var9[var16][var17 + 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 + var31, var23 + var3, -1353704895)) {
						break;
					}

					var31++;
				}
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !gn.lb(var5, var22 - 1, var23 - 1, 1076101390)) {
				int var32 = 1;

				while (true) {
					if (var32 >= var3) {
						var11[var20] = var14 - 1;
						var12[var20] = var15 - 1;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17 - 1] = 3;
						var9[var16 - 1][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var32 + (var23 - 1), 1076101438) || gn.lb(var5, var22 - 1 + var32, var23 - 1, -1838373649)) {
						break;
					}

					var32++;
				}
			}

			if (var16 < var7 - var3 && var17 > 0 && 0 == var10[1 + var16][var17 - 1] && !gn.lb(var5, var3 + var22, var23 - 1, 1076101507)) {
				int var33 = 1;

				while (true) {
					if (var33 >= var3) {
						var11[var20] = var14 + 1;
						var12[var20] = var15 - 1;
						var20 = 1 + var20 & var13;
						var10[1 + var16][var17 - 1] = 9;
						var9[1 + var16][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var3 + var22, var23 - 1 + var33, 588813147) || gn.lb(var5, var33 + var22, var23 - 1, 1076101519)) {
						break;
					}

					var33++;
				}
			}

			if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && !gn.lb(var5, var22 - 1, var23 + var3, 1076101432)) {
				int var34 = 1;

				while (true) {
					if (var34 >= var3) {
						var11[var20] = var14 - 1;
						var12[var20] = 1 + var15;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17 + 1] = 6;
						var9[var16 - 1][var17 + 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var23 + var34, 1076101438) || gn.lb(var5, var34 + (var22 - 1), var23 + var3, 200084274)) {
						break;
					}

					var34++;
				}
			}

			if (var16 < var7 - var3 && var17 < var8 - var3 && var10[var16 + 1][1 + var17] == 0 && !gn.lb(var5, var3 + var22, var3 + var23, 1076101600)) {
				for (int var35 = 1; var35 < var3; var35++) {
					if (gn.lb(var5, var22 + var35, var23 + var3, -2037142406) || gn.lb(var5, var3 + var22, var35 + var23, 1201336921)) {
						continue label338;
					}
				}

				var11[var20] = var14 + 1;
				var12[var20] = 1 + var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}

		gj.aj(var6, var14, var15);
		return false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILgr;Lgn;Lgj;)Z"
	)
	final boolean ad(int var1, int var2, gr var3, gn var4, gj var5) {
		int var6 = var5.ae();
		int var7 = var5.ah();
		int[][] var8 = var5.ay();
		int[][] var9 = var5.aw();
		int[] var10 = gj.sy(var5, 1166562570);
		int[] var11 = var5.ar();
		int var12 = gj.iq(var5, (byte)-17);
		int var13 = var1;
		int var14 = var2;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var1 - var15;
		int var18 = var2 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		int var19 = 0;
		int var20 = 0;
		var10[var19] = var1;
		var11[var19++] = var2;

		while (var20 != var19) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var21 = var13 - var4.ak(-1502380992);
			int var22 = var14 - var4.ag((short)256);
			if (var3.ak(2, var13, var14, var4, 659392868)) {
				gj.aj(var5, var13, var14);
				return true;
			}

			int var23 = var8[var15][var16] + 1;
			if (var15 > 0 && 0 == var9[var15 - 1][var16] && !gn.lb(var4, var21 - 1, var22, 1076101390) && !gn.lb(var4, var21 - 1, 1 + var22, 1076101432)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14;
				var19 = var19 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 2 && var9[1 + var15][var16] == 0 && !gn.lb(var4, 2 + var21, var22, 1076101507) && !gn.lb(var4, 2 + var21, 1 + var22, 1076101600)) {
				var10[var19] = var13 + 1;
				var11[var19] = var14;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !gn.lb(var4, var21, var22 - 1, 1076101390) && !gn.lb(var4, var21 + 1, var22 - 1, 1076101507)) {
				var10[var19] = var13;
				var11[var19] = var14 - 1;
				var19 = var19 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 2 && 0 == var9[var15][var16 + 1] && !gn.lb(var4, var21, 2 + var22, 1076101432) && !gn.lb(var4, 1 + var21, 2 + var22, 1076101600)) {
				var10[var19] = var13;
				var11[var19] = var14 + 1;
				var19 = var19 + 1 & var12;
				var9[var15][1 + var16] = 4;
				var8[var15][var16 + 1] = var23;
			}

			if (var15 > 0
				&& var16 > 0
				&& var9[var15 - 1][var16 - 1] == 0
				&& !gn.lb(var4, var21 - 1, var22, 1076101438)
				&& !gn.lb(var4, var21 - 1, var22 - 1, 1076101390)
				&& !gn.lb(var4, var21, var22 - 1, 1076101519)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 2
				&& var16 > 0
				&& var9[var15 + 1][var16 - 1] == 0
				&& !gn.lb(var4, var21 + 1, var22 - 1, 1076101519)
				&& !gn.lb(var4, 2 + var21, var22 - 1, 1076101507)
				&& !gn.lb(var4, 2 + var21, var22, 1076101603)) {
				var10[var19] = var13 + 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[1 + var15][var16 - 1] = var23;
			}

			if (var15 > 0
				&& var16 < var7 - 2
				&& var9[var15 - 1][1 + var16] == 0
				&& !gn.lb(var4, var21 - 1, var22 + 1, 1076101438)
				&& !gn.lb(var4, var21 - 1, 2 + var22, 1076101432)
				&& !gn.lb(var4, var21, 2 + var22, 1076101624)) {
				var10[var19] = var13 - 1;
				var11[var19] = 1 + var14;
				var19 = var19 + 1 & var12;
				var9[var15 - 1][1 + var16] = 6;
				var8[var15 - 1][var16 + 1] = var23;
			}

			if (var15 < var6 - 2
				&& var16 < var7 - 2
				&& var9[1 + var15][1 + var16] == 0
				&& !gn.lb(var4, var21 + 1, 2 + var22, 1076101624)
				&& !gn.lb(var4, var21 + 2, var22 + 2, 1076101600)
				&& !gn.lb(var4, var21 + 2, var22 + 1, 1076101603)) {
				var10[var19] = var13 + 1;
				var11[var19] = 1 + var14;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		gj.aj(var5, var13, var14);
		return false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[ILgj;)I"
	)
	int az(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		gj.wk(var9, -1736995230);
		int var11 = var9.ae();
		int var12 = var9.ah();
		int[][] var13 = var9.ay();
		int[][] var14 = var9.aw();
		int[] var15 = gj.sy(var9, 1893822469);
		int[] var16 = var9.ar();
		boolean var17;
		if (1 == var3) {
			var17 = this.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var17 = this.ae(var1, var2, var4, var5, var9);
		} else {
			var17 = tq(this, var1, var2, var3, var4, var5, var9);
		}

		int var18 = var1 - (var11 >> 1);
		int var19 = var2 - (var12 >> 1);
		int var20 = gj.nd(var9, (byte)4);
		int var21 = var9.av();
		if (!var17) {
			if (!var6) {
				return -1;
			}

			int var22 = Integer.MAX_VALUE;
			int var23 = Integer.MAX_VALUE;
			byte var24 = 10;
			int var25 = var4.ak_fld;
			int var26 = var4.ag_fld;
			int var27 = var4.az_fld;
			int var28 = var4.av_fld;

			for (int var29 = var25 - var24; var29 <= var24 + var25; var29++) {
				for (int var30 = var26 - var24; var30 <= var26 + var24; var30++) {
					int var31 = var29 - var18;
					int var32 = var30 - var19;
					if (var31 >= 0 && var32 >= 0 && var31 < var11 && var32 < var12 && var13[var31][var32] < 100) {
						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = 0;
						if (var30 < var26) {
							var34 = var26 - var30;
						} else if (var30 > var28 + var26 - 1) {
							var34 = var30 - (var28 + var26 - 1);
						}

						int var35 = var33 * var33 + var34 * var34;
						if (var35 < var22 || var35 == var22 && var13[var31][var32] < var23) {
							var22 = var35;
							var23 = var13[var31][var32];
							var20 = var29;
							var21 = var30;
						}
					}
				}
			}

			if (var22 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var1 == var20 && var2 == var21) {
			var7[0] = var20;
			var8[0] = var21;
			return 0;
		} else {
			int var36 = 0;
			var15[var36] = var20;
			var16[var36++] = var21;

			int var39;
			for (int var38 = var39 = var14[var20 - var18][var21 - var19]; var1 != var20 || var21 != var2; var38 = var14[var20 - var18][var21 - var19]) {
				if (var39 != var38) {
					var39 = var38;
					var15[var36] = var20;
					var16[var36++] = var21;
				}

				if (0 != (var38 & 2)) {
					var20++;
				} else if (0 != (var38 & 8)) {
					var20--;
				}

				if (0 != (var38 & 1)) {
					var21++;
				} else if (0 != (var38 & 4)) {
					var21--;
				}
			}

			int var40 = 0;

			while (var36-- > 0) {
				var7[var40] = var15[var36];
				var8[var40++] = var16[var36];
				if (var40 >= var7.length) {
					break;
				}
			}

			return var40;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ak() {
		this.ak_fld = new gj[1];
		gh var2 = gh.az_fld;
		this.ak_fld[0] = new gj(var2.ay_fld, var2.ar_fld);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Lgj;)Z"
	)
	final boolean ap(int var1, int var2, int var3, gr var4, gn var5, gj var6) {
		int var7 = var6.ae();
		int var8 = var6.ah();
		int[][] var9 = var6.ay();
		int[][] var10 = var6.aw();
		int[] var11 = gj.sy(var6, -1684880627);
		int[] var12 = var6.ar();
		int var13 = gj.iq(var6, (byte)-89);
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 1520478973;
		var9[var16][var17] = 0;
		int var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		var12[var20++] = var2;

		label345:
		while (var21 != var20) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = 1 + var21 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var22 = var14 - var5.ak(-1502380992);
			int var23 = var15 - var5.ag((short)256);
			if (var4.ak(var3, var14, var15, var5, 882337165)) {
				gj.aj(var6, var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0 && 0 == var10[var16 - 1][var17] && !gn.lb(var5, var22 - 1, var23, 1076101390) && !gn.lb(var5, var22 - 1, var3 + var23 - 1, 1076101432)) {
				int var25 = 1;

				while (true) {
					if (var25 >= var3 - 1) {
						var11[var20] = var14 - 1;
						var12[var20] = var15;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17] = 2;
						var9[var16 - 1][var17] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var25 + var23, 1305445253)) {
						break;
					}

					var25++;
				}
			}

			if (var16 < var7 - var3
				&& var10[1 + var16][var17] == 0
				&& !gn.lb(var5, var3 + var22, var23, 1076101507)
				&& !gn.lb(var5, var3 + var22, var23 + var3 - 1, 1076101600)) {
				int var29 = 1;

				while (true) {
					if (var29 >= var3 - 1) {
						var11[var20] = var14 + 1;
						var12[var20] = var15;
						var20 = 1 + var20 & var13;
						var10[var16 + 1][var17] = 8;
						var9[1 + var16][var17] = var24;
						break;
					}

					if (gn.lb(var5, var22 + var3, var23 + var29, 550110971)) {
						break;
					}

					var29++;
				}
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && !gn.lb(var5, var22, var23 - 1, 1076101390) && !gn.lb(var5, var22 + var3 - 1, var23 - 1, 1076101507)) {
				int var30 = 1;

				while (true) {
					if (var30 >= var3 - 1) {
						var11[var20] = var14;
						var12[var20] = var15 - 1;
						var20 = var20 + 1 & var13;
						var10[var16][var17 - 1] = 1;
						var9[var16][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var30 + var22, var23 - 1, 1076101519)) {
						break;
					}

					var30++;
				}
			}

			if (var17 < var8 - var3
				&& 0 == var10[var16][1 + var17]
				&& !gn.lb(var5, var22, var3 + var23, 956168013)
				&& !gn.lb(var5, var22 + var3 - 1, var23 + var3, 1625100339)) {
				int var31 = 1;

				while (true) {
					if (var31 >= var3 - 1) {
						var11[var20] = var14;
						var12[var20] = 1 + var15;
						var20 = var20 + 1 & var13;
						var10[var16][1 + var17] = 4;
						var9[var16][var17 + 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 + var31, var23 + var3, 1076101624)) {
						break;
					}

					var31++;
				}
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !gn.lb(var5, var22 - 1, var23 - 1, 1076101390)) {
				int var32 = 1;

				while (true) {
					if (var32 >= var3) {
						var11[var20] = var14 - 1;
						var12[var20] = var15 - 1;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17 - 1] = 3;
						var9[var16 - 1][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var32 + (var23 - 1), 1076101438) || gn.lb(var5, var22 - 1 + var32, var23 - 1, -1548735)) {
						break;
					}

					var32++;
				}
			}

			if (var16 < var7 - var3 && var17 > 0 && 0 == var10[1 + var16][var17 - 1] && !gn.lb(var5, var3 + var22, var23 - 1, 1658158335)) {
				int var33 = 1;

				while (true) {
					if (var33 >= var3) {
						var11[var20] = var14 + 1;
						var12[var20] = var15 - 1;
						var20 = 1 + var20 & var13;
						var10[1 + var16][var17 - 1] = 9;
						var9[1 + var16][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var3 + var22, var23 - 1 + var33, -1426031080) || gn.lb(var5, var33 + var22, var23 - 1, 1076101519)) {
						break;
					}

					var33++;
				}
			}

			if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && !gn.lb(var5, var22 - 1, var23 + var3, 1076101432)) {
				int var34 = 1;

				while (true) {
					if (var34 >= var3) {
						var11[var20] = var14 - 1;
						var12[var20] = 1 + var15;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17 + 1] = 6;
						var9[var16 - 1][var17 + 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var23 + var34, 1076101438) || gn.lb(var5, var34 + (var22 - 1), var23 + var3, 1731728826)) {
						break;
					}

					var34++;
				}
			}

			if (var16 < var7 - var3 && var17 < var8 - var3 && var10[var16 + 1][1 + var17] == 0 && !gn.lb(var5, var3 + var22, var3 + var23, 987930170)) {
				for (int var35 = 1; var35 < var3; var35++) {
					if (gn.lb(var5, var22 + var35, var23 + var3, 2111656946) || gn.lb(var5, var3 + var22, var35 + var23, 1076101603)) {
						continue label345;
					}
				}

				var11[var20] = var14 + 1;
				var12[var20] = 1 + var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}

		gj.aj(var6, var14, var15);
		return false;
	}

	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILgr;Lgn;Z[I[ILgj;)I"
	)
	public static int tm(gp var0, int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			gj.wk(var9, -1880338058);
			int var10 = var9.ae();
			int var11 = var9.ah();
			int[][] var12 = var9.ay();
			int[][] var13 = var9.aw();
			int[] var14 = gj.sy(var9, -2017213955);
			int[] var15 = var9.ar();
			boolean var16;
			if (1 == var3) {
				var16 = var0.av(var1, var2, var4, var5, var9);
			} else if (var3 == 2) {
				var16 = var0.ae(var1, var2, var4, var5, var9);
			} else {
				var16 = tq(var0, var1, var2, var3, var4, var5, var9);
			}

			int var17 = var1 - (var10 >> 1);
			int var18 = var2 - (var11 >> 1);
			int var19 = gj.nd(var9, (byte)4);
			int var20 = var9.av();
			if (!var16) {
				if (!var6) {
					return -1;
				}

				int var21 = 402047182;
				int var22 = Integer.MAX_VALUE;
				byte var23 = 10;
				int var24 = var4.ak_fld;
				int var25 = -517554948 * var4.ag_fld;
				int var26 = 618953957 * var4.az_fld;
				int var27 = 1755038709 * var4.av_fld;

				for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
					for (int var29 = var25 - var23; var29 <= var25 + var23; var29++) {
						int var30 = var28 - var17;
						int var31 = var29 - var18;
						if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 1820670698) {
							int var32 = 0;
							if (var28 < var24) {
								var32 = var24 - var28;
							} else if (var28 > var26 + var24 - 1) {
								var32 = var28 - (var26 + var24 - 1);
							}

							int var33 = 0;
							if (var29 < var25) {
								var33 = var25 - var29;
							} else if (var29 > var27 + var25 - 1) {
								var33 = var29 - (var27 + var25 - 1);
							}

							int var34 = var32 * var32 + var33 * var33;
							if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
								var21 = var34;
								var22 = var12[var30][var31];
								var19 = var28;
								var20 = var29;
							}
						}
					}
				}

				if (var21 == Integer.MAX_VALUE) {
					return -1;
				}
			}

			if (var1 == var19 && var2 == var20) {
				var7[0] = var19;
				var8[0] = var20;
				return 0;
			} else {
				int var35 = 0;
				var14[var35] = var19;
				var15[var35++] = var20;

				int var38;
				for (int var37 = var38 = var13[var19 - var17][var20 - var18]; var1 != var19 || var20 != var2; var37 = var13[var19 - var17][var20 - var18]) {
					if (var38 != var37) {
						var38 = var37;
						var14[var35] = var19;
						var15[var35++] = var20;
					}

					if (0 != (var37 & 2)) {
						var19++;
					} else if (0 != (var37 & 8)) {
						var19--;
					}

					if (0 != (var37 & 1)) {
						var20++;
					} else if (0 != (var37 & 4)) {
						var20--;
					}
				}

				int var39 = 0;

				while (var35-- > 0) {
					var7[var39] = var14[var35];
					var8[var39++] = var15[var35];
					if (var39 >= var7.length) {
						break;
					}
				}

				return var39;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public static void aw(byte var0) {
		try {
			mh.af_fld.ak();

			for (int var1 = 0; var1 < lz.am_fld; var1++) {
				if (var0 == 0) {
					return;
				}

				tw.au_fld[var1].ak();
			}

			mh.al_fld.ak();
			mh.ad_fld.ak();
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Lgj;I)Z"
	)
	final boolean ah(int var1, int var2, int var3, gr var4, gn var5, gj var6, int var7) {
		int var8 = var6.ah();
		int var9 = var6.ae();
		int[][] var10 = var6.ay();
		int[][] var11 = var6.ay();
		int[] var12 = gj.sy(var6, 1546261116);
		int[] var13 = var6.as(-1374822839);
		int var14 = gj.iq(var6, (byte)-8);
		int var15 = var1;
		int var16 = var2;
		int var17 = var8 >> 1;
		int var18 = var9 >> 1;
		int var19 = var1 - var17;
		int var20 = var2 - var18;
		var11[var17][var18] = 99;
		var10[var17][var18] = 0;
		int var21 = 0;
		int var22 = 0;
		var12[var21] = var1;
		var13[var21++] = var2;

		label393:
		while (var22 != var21) {
			var15 = var12[var22];
			var16 = var13[var22];
			var22 = 1 + var22 & var14;
			var17 = var15 - var19;
			var18 = var16 - var20;
			int var23 = var15 - var5.ak(-1502380992);
			int var24 = var16 - var5.ag((short)256);
			if (var4.ak(var3, var15, var16, var5, 704474510)) {
				gj.aj(var6, var15, var16);
				return true;
			}

			int var25 = var10[var17][var18] + 1;
			if (var17 > 0 && 0 == var11[var17 - 1][var18] && !gn.lb(var5, var23 - 1, var24, 1076101390) && !gn.lb(var5, var23 - 1, var3 + var24 - 1, 1076101432)) {
				int var26 = 1;

				while (true) {
					if (var26 >= var3 - 1) {
						var12[var21] = var15 - 1;
						var13[var21] = var16;
						var21 = 1 + var21 & var14;
						var11[var17 - 1][var18] = 2;
						var10[var17 - 1][var18] = var25;
						break;
					}

					if (gn.lb(var5, var23 - 1, var26 + var24, 1076101438)) {
						break;
					}

					var26++;
				}
			}

			if (var17 < var8 - var3
				&& var11[1 + var17][var18] == 0
				&& !gn.lb(var5, var3 + var23, var24, 1076101507)
				&& !gn.lb(var5, var3 + var23, var24 + var3 - 1, 1076101600)) {
				int var30 = 1;

				while (true) {
					if (var30 >= var3 - 1) {
						var12[var21] = var15 + 1;
						var13[var21] = var16;
						var21 = 1 + var21 & var14;
						var11[var17 + 1][var18] = 8;
						var10[1 + var17][var18] = var25;
						break;
					}

					if (gn.lb(var5, var23 + var3, var24 + var30, 1076101603)) {
						break;
					}

					var30++;
				}
			}

			if (var18 > 0 && var11[var17][var18 - 1] == 0 && !gn.lb(var5, var23, var24 - 1, 1076101390) && !gn.lb(var5, var23 + var3 - 1, var24 - 1, 1076101507)) {
				int var31 = 1;

				while (true) {
					if (var31 >= var3 - 1) {
						var12[var21] = var15;
						var13[var21] = var16 - 1;
						var21 = var21 + 1 & var14;
						var11[var17][var18 - 1] = 1;
						var10[var17][var18 - 1] = var25;
						break;
					}

					if (gn.lb(var5, var31 + var23, var24 - 1, 1076101519)) {
						break;
					}

					var31++;
				}
			}

			if (var18 < var9 - var3
				&& 0 == var11[var17][1 + var18]
				&& !gn.lb(var5, var23, var3 + var24, 1076101432)
				&& !gn.lb(var5, var23 + var3 - 1, var24 + var3, 1076101600)) {
				int var32 = 1;

				while (true) {
					if (var32 >= var3 - 1) {
						var12[var21] = var15;
						var13[var21] = 1 + var16;
						var21 = var21 + 1 & var14;
						var11[var17][1 + var18] = 4;
						var10[var17][var18 + 1] = var25;
						break;
					}

					if (gn.lb(var5, var23 + var32, var24 + var3, 1076101624)) {
						break;
					}

					var32++;
				}
			}

			if (var17 > 0 && var18 > 0 && var11[var17 - 1][var18 - 1] == 0 && !gn.lb(var5, var23 - 1, var24 - 1, 1076101390)) {
				int var33 = 1;

				while (true) {
					if (var33 >= var3) {
						var12[var21] = var15 - 1;
						var13[var21] = var16 - 1;
						var21 = 1 + var21 & var14;
						var11[var17 - 1][var18 - 1] = 3;
						var10[var17 - 1][var18 - 1] = var25;
						break;
					}

					if (gn.lb(var5, var23 - 1, var33 + (var24 - 1), 1076101438) || gn.lb(var5, var23 - 1 + var33, var24 - 1, 1076101519)) {
						break;
					}

					var33++;
				}
			}

			if (var17 < var8 - var3 && var18 > 0 && 0 == var11[1 + var17][var18 - 1] && !gn.lb(var5, var3 + var23, var24 - 1, 1076101507)) {
				int var34 = 1;

				while (true) {
					if (var34 >= var3) {
						var12[var21] = var15 + 1;
						var13[var21] = var16 - 1;
						var21 = 1 + var21 & var14;
						var11[1 + var17][var18 - 1] = 9;
						var10[1 + var17][var18 - 1] = var25;
						break;
					}

					if (gn.lb(var5, var3 + var23, var24 - 1 + var34, 1076101603) || gn.lb(var5, var34 + var23, var24 - 1, 1076101519)) {
						break;
					}

					var34++;
				}
			}

			if (var17 > 0 && var18 < var9 - var3 && 0 == var11[var17 - 1][1 + var18] && !gn.lb(var5, var23 - 1, var24 + var3, 1076101432)) {
				int var35 = 1;

				while (true) {
					if (var35 >= var3) {
						var12[var21] = var15 - 1;
						var13[var21] = 1 + var16;
						var21 = 1 + var21 & var14;
						var11[var17 - 1][var18 + 1] = 6;
						var10[var17 - 1][var18 + 1] = var25;
						break;
					}

					if (gn.lb(var5, var23 - 1, var24 + var35, 1076101438) || gn.lb(var5, var35 + (var23 - 1), var24 + var3, 1076101624)) {
						break;
					}

					var35++;
				}
			}

			if (var17 < var8 - var3 && var18 < var9 - var3 && var11[var17 + 1][1 + var18] == 0 && !gn.lb(var5, var3 + var23, var3 + var24, 1076101600)) {
				for (int var36 = 1; var36 < var3; var36++) {
					if (gn.lb(var5, var23 + var36, var24 + var3, 1076101624) || gn.lb(var5, var3 + var23, var36 + var24, 1076101603)) {
						continue label393;
					}
				}

				var12[var21] = var15 + 1;
				var13[var21] = 1 + var16;
				var21 = 1 + var21 & var14;
				var11[var17 + 1][var18 + 1] = 12;
				var10[var17 + 1][var18 + 1] = var25;
			}
		}

		gj.aj(var6, var15, var16);
		return false;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILgr;Lgn;Lgj;)Z"
	)
	public static boolean fj(gp var0, int var1, int var2, int var3, gr var4, gn var5, gj var6) {
		if (var0 == null) {
			var0.getClass();
		}

		int var7 = var6.ae();
		int var8 = var6.ah();
		int[][] var9 = var6.ay();
		int[][] var10 = var6.aw();
		int[] var11 = gj.sy(var6, 1838507677);
		int[] var12 = var6.ar();
		int var13 = gj.iq(var6, (byte)-90);
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = -1215371457;
		var9[var16][var17] = 0;
		int var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		var12[var20++] = var2;

		label349:
		while (var21 != var20) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = 1 + var21 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var22 = var14 - var5.ak(-1502380992);
			int var23 = var15 - var5.ag((short)256);
			if (var4.ak(var3, var14, var15, var5, 626210118)) {
				gj.aj(var6, var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0 && 0 == var10[var16 - 1][var17] && !gn.lb(var5, var22 - 1, var23, 1076101390) && !gn.lb(var5, var22 - 1, var3 + var23 - 1, 1076101432)) {
				int var25 = 1;

				while (true) {
					if (var25 >= var3 - 1) {
						var11[var20] = var14 - 1;
						var12[var20] = var15;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17] = 2;
						var9[var16 - 1][var17] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var25 + var23, 379377091)) {
						break;
					}

					var25++;
				}
			}

			if (var16 < var7 - var3
				&& var10[1 + var16][var17] == 0
				&& !gn.lb(var5, var3 + var22, var23, 1076101507)
				&& !gn.lb(var5, var3 + var22, var23 + var3 - 1, 1076101600)) {
				int var29 = 1;

				while (true) {
					if (var29 >= var3 - 1) {
						var11[var20] = var14 + 1;
						var12[var20] = var15;
						var20 = 1 + var20 & var13;
						var10[var16 + 1][var17] = 8;
						var9[1 + var16][var17] = var24;
						break;
					}

					if (gn.lb(var5, var22 + var3, var23 + var29, 1076101603)) {
						break;
					}

					var29++;
				}
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && !gn.lb(var5, var22, var23 - 1, -703502976) && !gn.lb(var5, var22 + var3 - 1, var23 - 1, 614066417)) {
				int var30 = 1;

				while (true) {
					if (var30 >= var3 - 1) {
						var11[var20] = var14;
						var12[var20] = var15 - 1;
						var20 = var20 + 1 & var13;
						var10[var16][var17 - 1] = 1;
						var9[var16][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var30 + var22, var23 - 1, 1931056539)) {
						break;
					}

					var30++;
				}
			}

			if (var17 < var8 - var3
				&& 0 == var10[var16][1 + var17]
				&& !gn.lb(var5, var22, var3 + var23, 750150774)
				&& !gn.lb(var5, var22 + var3 - 1, var23 + var3, 1076101600)) {
				int var31 = 1;

				while (true) {
					if (var31 >= var3 - 1) {
						var11[var20] = var14;
						var12[var20] = 1 + var15;
						var20 = var20 + 1 & var13;
						var10[var16][1 + var17] = 4;
						var9[var16][var17 + 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 + var31, var23 + var3, 921961755)) {
						break;
					}

					var31++;
				}
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !gn.lb(var5, var22 - 1, var23 - 1, -674107397)) {
				int var32 = 1;

				while (true) {
					if (var32 >= var3) {
						var11[var20] = var14 - 1;
						var12[var20] = var15 - 1;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17 - 1] = 3;
						var9[var16 - 1][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var32 + (var23 - 1), 1076101438) || gn.lb(var5, var22 - 1 + var32, var23 - 1, -247010685)) {
						break;
					}

					var32++;
				}
			}

			if (var16 < var7 - var3 && var17 > 0 && 0 == var10[1 + var16][var17 - 1] && !gn.lb(var5, var3 + var22, var23 - 1, 1076101507)) {
				int var33 = 1;

				while (true) {
					if (var33 >= var3) {
						var11[var20] = var14 + 1;
						var12[var20] = var15 - 1;
						var20 = 1 + var20 & var13;
						var10[1 + var16][var17 - 1] = 9;
						var9[1 + var16][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var3 + var22, var23 - 1 + var33, 1076101603) || gn.lb(var5, var33 + var22, var23 - 1, 620581630)) {
						break;
					}

					var33++;
				}
			}

			if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && !gn.lb(var5, var22 - 1, var23 + var3, 1076101432)) {
				int var34 = 1;

				while (true) {
					if (var34 >= var3) {
						var11[var20] = var14 - 1;
						var12[var20] = 1 + var15;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17 + 1] = 6;
						var9[var16 - 1][var17 + 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var23 + var34, 1076101438) || gn.lb(var5, var34 + (var22 - 1), var23 + var3, 1959868711)) {
						break;
					}

					var34++;
				}
			}

			if (var16 < var7 - var3 && var17 < var8 - var3 && var10[var16 + 1][1 + var17] == 0 && !gn.lb(var5, var3 + var22, var3 + var23, -733522062)) {
				for (int var35 = 1; var35 < var3; var35++) {
					if (gn.lb(var5, var22 + var35, var23 + var3, 1076101624) || gn.lb(var5, var3 + var22, var35 + var23, 1746879720)) {
						continue label349;
					}
				}

				var11[var20] = var14 + 1;
				var12[var20] = 1 + var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}

		gj.aj(var6, var14, var15);
		return false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Lgj;)Z"
	)
	final boolean ao(int var1, int var2, int var3, gr var4, gn var5, gj var6) {
		int var7 = var6.ah();
		int var8 = var6.ah();
		int[][] var9 = var6.ay();
		int[][] var10 = var6.aw();
		int[] var11 = gj.sy(var6, 1838507677);
		int[] var12 = var6.as(-1374822839);
		int var13 = gj.iq(var6, (byte)-90);
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = -1215371457;
		var9[var16][var17] = 0;
		int var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		var12[var20++] = var2;

		label345:
		while (var21 != var20) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = 1 + var21 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var22 = var14 - var5.ak(-1502380992);
			int var23 = var15 - var5.ag((short)256);
			if (var4.ak(var3, var14, var15, var5, 626210118)) {
				gj.aj(var6, var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0 && 0 == var10[var16 - 1][var17] && !gn.lb(var5, var22 - 1, var23, 1076101390) && !gn.lb(var5, var22 - 1, var3 + var23 - 1, 1076101432)) {
				int var25 = 1;

				while (true) {
					if (var25 >= var3 - 1) {
						var11[var20] = var14 - 1;
						var12[var20] = var15;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17] = 2;
						var9[var16 - 1][var17] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var25 + var23, 379377091)) {
						break;
					}

					var25++;
				}
			}

			if (var16 < var7 - var3
				&& var10[1 + var16][var17] == 0
				&& !gn.lb(var5, var3 + var22, var23, 1076101507)
				&& !gn.lb(var5, var3 + var22, var23 + var3 - 1, 1076101600)) {
				int var29 = 1;

				while (true) {
					if (var29 >= var3 - 1) {
						var11[var20] = var14 + 1;
						var12[var20] = var15;
						var20 = 1 + var20 & var13;
						var10[var16 + 1][var17] = 8;
						var9[1 + var16][var17] = var24;
						break;
					}

					if (gn.lb(var5, var22 + var3, var23 + var29, 1076101603)) {
						break;
					}

					var29++;
				}
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && !gn.lb(var5, var22, var23 - 1, -703502976) && !gn.lb(var5, var22 + var3 - 1, var23 - 1, 614066417)) {
				int var30 = 1;

				while (true) {
					if (var30 >= var3 - 1) {
						var11[var20] = var14;
						var12[var20] = var15 - 1;
						var20 = var20 + 1 & var13;
						var10[var16][var17 - 1] = 1;
						var9[var16][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var30 + var22, var23 - 1, 1931056539)) {
						break;
					}

					var30++;
				}
			}

			if (var17 < var8 - var3
				&& 0 == var10[var16][1 + var17]
				&& !gn.lb(var5, var22, var3 + var23, 750150774)
				&& !gn.lb(var5, var22 + var3 - 1, var23 + var3, 1076101600)) {
				int var31 = 1;

				while (true) {
					if (var31 >= var3 - 1) {
						var11[var20] = var14;
						var12[var20] = 1 + var15;
						var20 = var20 + 1 & var13;
						var10[var16][1 + var17] = 4;
						var9[var16][var17 + 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 + var31, var23 + var3, 921961755)) {
						break;
					}

					var31++;
				}
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !gn.lb(var5, var22 - 1, var23 - 1, -674107397)) {
				int var32 = 1;

				while (true) {
					if (var32 >= var3) {
						var11[var20] = var14 - 1;
						var12[var20] = var15 - 1;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17 - 1] = 3;
						var9[var16 - 1][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var32 + (var23 - 1), 1076101438) || gn.lb(var5, var22 - 1 + var32, var23 - 1, -247010685)) {
						break;
					}

					var32++;
				}
			}

			if (var16 < var7 - var3 && var17 > 0 && 0 == var10[1 + var16][var17 - 1] && !gn.lb(var5, var3 + var22, var23 - 1, 1076101507)) {
				int var33 = 1;

				while (true) {
					if (var33 >= var3) {
						var11[var20] = var14 + 1;
						var12[var20] = var15 - 1;
						var20 = 1 + var20 & var13;
						var10[1 + var16][var17 - 1] = 9;
						var9[1 + var16][var17 - 1] = var24;
						break;
					}

					if (gn.lb(var5, var3 + var22, var23 - 1 + var33, 1076101603) || gn.lb(var5, var33 + var22, var23 - 1, 620581630)) {
						break;
					}

					var33++;
				}
			}

			if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && !gn.lb(var5, var22 - 1, var23 + var3, 1076101432)) {
				int var34 = 1;

				while (true) {
					if (var34 >= var3) {
						var11[var20] = var14 - 1;
						var12[var20] = 1 + var15;
						var20 = 1 + var20 & var13;
						var10[var16 - 1][var17 + 1] = 6;
						var9[var16 - 1][var17 + 1] = var24;
						break;
					}

					if (gn.lb(var5, var22 - 1, var23 + var34, 1076101438) || gn.lb(var5, var34 + (var22 - 1), var23 + var3, 1959868711)) {
						break;
					}

					var34++;
				}
			}

			if (var16 < var7 - var3 && var17 < var8 - var3 && var10[var16 + 1][1 + var17] == 0 && !gn.lb(var5, var3 + var22, var3 + var23, -733522062)) {
				for (int var35 = 1; var35 < var3; var35++) {
					if (gn.lb(var5, var22 + var35, var23 + var3, 1076101624) || gn.lb(var5, var3 + var22, var35 + var23, 1746879720)) {
						continue label345;
					}
				}

				var11[var20] = var14 + 1;
				var12[var20] = 1 + var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}

		gj.aj(var6, var14, var15);
		return false;
	}
}
