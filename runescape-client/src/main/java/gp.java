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
		var9.ak();
		int var10 = var9.ah();
		int var11 = var9.ae();
		int[][] var12 = var9.ay();
		int[][] var13 = var9.aw();
		int[] var14 = var9.as();
		int[] var15 = gj.fg(var9, -1374822839);
		boolean var16;
		if (1 == var3) {
			var16 = this.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.ae(var1, var2, var4, var5, var9);
		} else {
			var16 = this.ah(var1, var2, var3, var4, var5, var9, -315268593);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.az();
		int var20 = gj.ep(var9, (byte)14);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILgr;Lgn;Lgj;)Z"
	)
	final boolean aq(int var1, int var2, gr var3, gn var4, gj var5) {
		int var6 = var5.ah();
		int var7 = var5.ae();
		int[][] var8 = var5.ay();
		int[][] var9 = var5.aw();
		int[] var10 = var5.as();
		int[] var11 = gj.fg(var5, -1374822839);
		int var12 = var5.af();
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
				var5.ag(var13, var14);
				return true;
			}

			int var23 = 1 + var8[var15][var16];
			if (var15 > 0 && 0 == var9[var15 - 1][var16] && !var4.aw(var21 - 1, var22, 1076101384, -1545598134)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14;
				var19 = var19 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 1 && 0 == var9[1 + var15][var16] && !var4.aw(var21 + 1, var22, 1076101504, -837080473)) {
				var10[var19] = 1 + var13;
				var11[var19] = var14;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.aw(var21, var22 - 1, 1076101378, -1317875630)) {
				var10[var19] = var13;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && !var4.aw(var21, var22 + 1, 1076101408, -2027589615)) {
				var10[var19] = var13;
				var11[var19] = 1 + var14;
				var19 = var19 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][1 + var16] = var23;
			}

			if (var15 > 0
				&& var16 > 0
				&& 0 == var9[var15 - 1][var16 - 1]
				&& !var4.aw(var21 - 1, var22 - 1, 1076101390, -1857587499)
				&& !var4.aw(var21 - 1, var22, 1076101384, -892736473)
				&& !var4.aw(var21, var22 - 1, 1076101378, -1638225693)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 1
				&& var16 > 0
				&& var9[var15 + 1][var16 - 1] == 0
				&& !var4.aw(var21 + 1, var22 - 1, 1076101507, -2080272527)
				&& !var4.aw(var21 + 1, var22, 1076101504, -1363990491)
				&& !var4.aw(var21, var22 - 1, 1076101378, -1426374075)) {
				var10[var19] = var13 + 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var23;
			}

			if (var15 > 0
				&& var16 < var7 - 1
				&& var9[var15 - 1][var16 + 1] == 0
				&& !var4.aw(var21 - 1, 1 + var22, 1076101432, -1504475490)
				&& !var4.aw(var21 - 1, var22, 1076101384, -913446350)
				&& !var4.aw(var21, var22 + 1, 1076101408, -952890227)) {
				var10[var19] = var13 - 1;
				var11[var19] = 1 + var14;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][1 + var16] = var23;
			}

			if (var15 < var6 - 1
				&& var16 < var7 - 1
				&& 0 == var9[1 + var15][1 + var16]
				&& !var4.aw(1 + var21, var22 + 1, 1076101600, -1392220179)
				&& !var4.aw(1 + var21, var22, 1076101504, -719117823)
				&& !var4.aw(var21, var22 + 1, 1076101408, -2065396068)) {
				var10[var19] = 1 + var13;
				var11[var19] = var14 + 1;
				var19 = var19 + 1 & var12;
				var9[1 + var15][1 + var16] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		var5.ag(var13, var14);
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[II)I"
	)
	public int ag(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int al(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILgr;Lgn;Lgj;I)Z"
	)
	final boolean av(int var1, int var2, gr var3, gn var4, gj var5) {
		int var7 = var5.ah();
		int var8 = var5.ae();
		int[][] var9 = var5.ay();
		int[][] var10 = var5.aw();
		int[] var11 = var5.as();
		int[] var12 = gj.fg(var5, -1374822839);
		int var13 = var5.af();
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
				var5.ag(var14, var15);
				return true;
			}

			int var24 = 1 + var9[var16][var17];
			if (var16 > 0 && 0 == var10[var16 - 1][var17] && !var4.aw(var22 - 1, var23, 1076101384, -913945548)) {
				var11[var20] = var14 - 1;
				var12[var20] = var15;
				var20 = var20 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var24;
			}

			if (var16 < var7 - 1 && 0 == var10[1 + var16][var17] && !var4.aw(var22 + 1, var23, 1076101504, -1743307693)) {
				var11[var20] = 1 + var14;
				var12[var20] = var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var24;
			}

			if (var17 > 0 && var10[var16][var17 - 1] == 0 && !var4.aw(var22, var23 - 1, 1076101378, -1545078879)) {
				var11[var20] = var14;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var24;
			}

			if (var17 < var8 - 1 && var10[var16][var17 + 1] == 0 && !var4.aw(var22, var23 + 1, 1076101408, -1626826717)) {
				var11[var20] = var14;
				var12[var20] = 1 + var15;
				var20 = var20 + 1 & var13;
				var10[var16][var17 + 1] = 4;
				var9[var16][1 + var17] = var24;
			}

			if (var16 > 0
				&& var17 > 0
				&& 0 == var10[var16 - 1][var17 - 1]
				&& !var4.aw(var22 - 1, var23 - 1, 1076101390, -1844332012)
				&& !var4.aw(var22 - 1, var23, 1076101384, -1433681430)
				&& !var4.aw(var22, var23 - 1, 1076101378, -2022563883)) {
				var11[var20] = var14 - 1;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var24;
			}

			if (var16 < var7 - 1
				&& var17 > 0
				&& var10[var16 + 1][var17 - 1] == 0
				&& !var4.aw(var22 + 1, var23 - 1, 1076101507, -544181566)
				&& !var4.aw(var22 + 1, var23, 1076101504, -1978864739)
				&& !var4.aw(var22, var23 - 1, 1076101378, -1068627944)) {
				var11[var20] = var14 + 1;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[var16 + 1][var17 - 1] = var24;
			}

			if (var16 > 0
				&& var17 < var8 - 1
				&& var10[var16 - 1][var17 + 1] == 0
				&& !var4.aw(var22 - 1, 1 + var23, 1076101432, -1445991659)
				&& !var4.aw(var22 - 1, var23, 1076101384, -2116214992)
				&& !var4.aw(var22, var23 + 1, 1076101408, -747287051)) {
				var11[var20] = var14 - 1;
				var12[var20] = 1 + var15;
				var20 = 1 + var20 & var13;
				var10[var16 - 1][var17 + 1] = 6;
				var9[var16 - 1][1 + var17] = var24;
			}

			if (var16 < var7 - 1
				&& var17 < var8 - 1
				&& 0 == var10[1 + var16][1 + var17]
				&& !var4.aw(1 + var22, var23 + 1, 1076101600, -1989316490)
				&& !var4.aw(1 + var22, var23, 1076101504, -593501342)
				&& !var4.aw(var22, var23 + 1, 1076101408, -1954800883)) {
				var11[var20] = 1 + var14;
				var12[var20] = var15 + 1;
				var20 = var20 + 1 & var13;
				var10[1 + var16][1 + var17] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}

		var5.ag(var14, var15);
		return false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILgr;Lgn;Lgj;I)Z"
	)
	final boolean ae(int var1, int var2, gr var3, gn var4, gj var5) {
		int var7 = var5.ah();
		int var8 = var5.ae();
		int[][] var9 = var5.ay();
		int[][] var10 = var5.aw();
		int[] var11 = var5.as();
		int[] var12 = gj.fg(var5, -1374822839);
		int var13 = var5.af();
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
				var5.ag(var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0
				&& 0 == var10[var16 - 1][var17]
				&& !var4.aw(var22 - 1, var23, 1076101390, -910770422)
				&& !var4.aw(var22 - 1, 1 + var23, 1076101432, -552863426)) {
				var11[var20] = var14 - 1;
				var12[var20] = var15;
				var20 = var20 + 1 & var13;
				var10[var16 - 1][var17] = 2;
				var9[var16 - 1][var17] = var24;
			}

			if (var16 < var7 - 2
				&& var10[1 + var16][var17] == 0
				&& !var4.aw(2 + var22, var23, 1076101507, -730141781)
				&& !var4.aw(2 + var22, 1 + var23, 1076101600, -1010408250)) {
				var11[var20] = var14 + 1;
				var12[var20] = var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17] = 8;
				var9[var16 + 1][var17] = var24;
			}

			if (var17 > 0
				&& var10[var16][var17 - 1] == 0
				&& !var4.aw(var22, var23 - 1, 1076101390, -1508662444)
				&& !var4.aw(var22 + 1, var23 - 1, 1076101507, -1721429318)) {
				var11[var20] = var14;
				var12[var20] = var15 - 1;
				var20 = var20 + 1 & var13;
				var10[var16][var17 - 1] = 1;
				var9[var16][var17 - 1] = var24;
			}

			if (var17 < var8 - 2
				&& 0 == var10[var16][var17 + 1]
				&& !var4.aw(var22, 2 + var23, 1076101432, -1231190612)
				&& !var4.aw(1 + var22, 2 + var23, 1076101600, -1161489705)) {
				var11[var20] = var14;
				var12[var20] = var15 + 1;
				var20 = var20 + 1 & var13;
				var10[var16][1 + var17] = 4;
				var9[var16][var17 + 1] = var24;
			}

			if (var16 > 0
				&& var17 > 0
				&& var10[var16 - 1][var17 - 1] == 0
				&& !var4.aw(var22 - 1, var23, 1076101438, -744590054)
				&& !var4.aw(var22 - 1, var23 - 1, 1076101390, -2051315846)
				&& !var4.aw(var22, var23 - 1, 1076101519, -740785595)) {
				var11[var20] = var14 - 1;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16 - 1][var17 - 1] = 3;
				var9[var16 - 1][var17 - 1] = var24;
			}

			if (var16 < var7 - 2
				&& var17 > 0
				&& var10[var16 + 1][var17 - 1] == 0
				&& !var4.aw(var22 + 1, var23 - 1, 1076101519, -1043885921)
				&& !var4.aw(2 + var22, var23 - 1, 1076101507, -1694826798)
				&& !var4.aw(2 + var22, var23, 1076101603, -1123831512)) {
				var11[var20] = var14 + 1;
				var12[var20] = var15 - 1;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 - 1] = 9;
				var9[1 + var16][var17 - 1] = var24;
			}

			if (var16 > 0
				&& var17 < var8 - 2
				&& var10[var16 - 1][1 + var17] == 0
				&& !var4.aw(var22 - 1, var23 + 1, 1076101438, -701560839)
				&& !var4.aw(var22 - 1, 2 + var23, 1076101432, -1319952290)
				&& !var4.aw(var22, 2 + var23, 1076101624, -1570068548)) {
				var11[var20] = var14 - 1;
				var12[var20] = 1 + var15;
				var20 = var20 + 1 & var13;
				var10[var16 - 1][1 + var17] = 6;
				var9[var16 - 1][var17 + 1] = var24;
			}

			if (var16 < var7 - 2
				&& var17 < var8 - 2
				&& var10[1 + var16][1 + var17] == 0
				&& !var4.aw(var22 + 1, 2 + var23, 1076101624, -762777137)
				&& !var4.aw(var22 + 2, var23 + 2, 1076101600, -2006322353)
				&& !var4.aw(var22 + 2, var23 + 1, 1076101603, -691287100)) {
				var11[var20] = var14 + 1;
				var12[var20] = 1 + var15;
				var20 = 1 + var20 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}

		var5.ag(var14, var15);
		return false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Lgj;I)Z"
	)
	final boolean ah(int var1, int var2, int var3, gr var4, gn var5, gj var6, int var7) {
		int var8 = var6.ah();
		int var9 = var6.ae();
		int[][] var10 = var6.ay();
		int[][] var11 = var6.aw();
		int[] var12 = var6.as();
		int[] var13 = gj.fg(var6, -1374822839);
		int var14 = var6.af();
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
				var6.ag(var15, var16);
				return true;
			}

			int var25 = var10[var17][var18] + 1;
			if (var17 > 0
				&& 0 == var11[var17 - 1][var18]
				&& !var5.aw(var23 - 1, var24, 1076101390, -1406724550)
				&& !var5.aw(var23 - 1, var3 + var24 - 1, 1076101432, -1427702955)) {
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

					if (var5.aw(var23 - 1, var26 + var24, 1076101438, -715303544)) {
						break;
					}

					var26++;
				}
			}

			if (var17 < var8 - var3
				&& var11[1 + var17][var18] == 0
				&& !var5.aw(var3 + var23, var24, 1076101507, -1494965086)
				&& !var5.aw(var3 + var23, var24 + var3 - 1, 1076101600, -1056504534)) {
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

					if (var5.aw(var23 + var3, var24 + var30, 1076101603, -1960288072)) {
						break;
					}

					var30++;
				}
			}

			if (var18 > 0
				&& var11[var17][var18 - 1] == 0
				&& !var5.aw(var23, var24 - 1, 1076101390, -1059004945)
				&& !var5.aw(var23 + var3 - 1, var24 - 1, 1076101507, -991361508)) {
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

					if (var5.aw(var31 + var23, var24 - 1, 1076101519, -1204266551)) {
						break;
					}

					var31++;
				}
			}

			if (var18 < var9 - var3
				&& 0 == var11[var17][1 + var18]
				&& !var5.aw(var23, var3 + var24, 1076101432, -1505545784)
				&& !var5.aw(var23 + var3 - 1, var24 + var3, 1076101600, -1275741980)) {
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

					if (var5.aw(var23 + var32, var24 + var3, 1076101624, -1530259103)) {
						break;
					}

					var32++;
				}
			}

			if (var17 > 0 && var18 > 0 && var11[var17 - 1][var18 - 1] == 0 && !var5.aw(var23 - 1, var24 - 1, 1076101390, -2142787843)) {
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

					if (var5.aw(var23 - 1, var33 + (var24 - 1), 1076101438, -752515461) || var5.aw(var23 - 1 + var33, var24 - 1, 1076101519, -1042391176)) {
						break;
					}

					var33++;
				}
			}

			if (var17 < var8 - var3 && var18 > 0 && 0 == var11[1 + var17][var18 - 1] && !var5.aw(var3 + var23, var24 - 1, 1076101507, -2117518387)) {
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

					if (var5.aw(var3 + var23, var24 - 1 + var34, 1076101603, -772420503) || var5.aw(var34 + var23, var24 - 1, 1076101519, -2003588622)) {
						break;
					}

					var34++;
				}
			}

			if (var17 > 0 && var18 < var9 - var3 && 0 == var11[var17 - 1][1 + var18] && !var5.aw(var23 - 1, var24 + var3, 1076101432, -931412652)) {
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

					if (var5.aw(var23 - 1, var24 + var35, 1076101438, -703331924) || var5.aw(var35 + (var23 - 1), var24 + var3, 1076101624, -1846617038)) {
						break;
					}

					var35++;
				}
			}

			if (var17 < var8 - var3 && var18 < var9 - var3 && var11[var17 + 1][1 + var18] == 0 && !var5.aw(var3 + var23, var3 + var24, 1076101600, -891030214)) {
				for (int var36 = 1; var36 < var3; var36++) {
					if (var5.aw(var23 + var36, var24 + var3, 1076101624, -955184738) || var5.aw(var3 + var23, var36 + var24, 1076101603, -1762007458)) {
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

		var6.ag(var15, var16);
		return false;
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lyb;I)Lyb;"
	)
	public static yb nr(yb var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var0.ae_fld = var1 * 962472488;
			return var0;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void aw() {
		this.ak_fld = new gj[1];
		gh var1 = gh.az_fld;
		this.ak_fld[0] = new gj(var1.ar_fld, var1.af_fld);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void ay() {
		this.ak_fld = new gj[1];
		gh var1 = gh.az_fld;
		this.ak_fld[0] = new gj(var1.ar_fld, var1.af_fld);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int af(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIILem;IJIIII)Z"
	)
	public static boolean oa(ev var0, int var1, int var2, int var3, int var4, int var5, em var6, int var7, long var8, int var10, int var11, int var12, int var13) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		return var6 == null ? true : ev.jh(var0, var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IILgr;Lgn;Lgj;)Z"
	)
	public static boolean pq(gp var0, int var1, int var2, gr var3, gn var4, gj var5) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			int var6 = var5.ah();
			int var7 = var5.ae();
			int[][] var8 = var5.ay();
			int[][] var9 = var5.aw();
			int[] var10 = var5.as();
			int[] var11 = gj.fg(var5, -1374822839);
			int var12 = var5.af();
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
					var5.ag(var13, var14);
					return true;
				}

				int var23 = var8[var15][var16] + 1;
				if (var15 > 0
					&& 0 == var9[var15 - 1][var16]
					&& !var4.aw(var21 - 1, var22, 1076101390, -866703207)
					&& !var4.aw(var21 - 1, 1 + var22, 1076101432, -1874563929)) {
					var10[var19] = var13 - 1;
					var11[var19] = var14;
					var19 = var19 + 1 & var12;
					var9[var15 - 1][var16] = 2;
					var8[var15 - 1][var16] = var23;
				}

				if (var15 < var6 - 2
					&& var9[1 + var15][var16] == 0
					&& !var4.aw(2 + var21, var22, 1076101507, -1102341027)
					&& !var4.aw(2 + var21, 1 + var22, 1076101600, -847539740)) {
					var10[var19] = var13 + 1;
					var11[var19] = var14;
					var19 = 1 + var19 & var12;
					var9[var15 + 1][var16] = 8;
					var8[var15 + 1][var16] = var23;
				}

				if (var16 > 0
					&& var9[var15][var16 - 1] == 0
					&& !var4.aw(var21, var22 - 1, 1076101390, -1977493420)
					&& !var4.aw(var21 + 1, var22 - 1, 1076101507, -1069421180)) {
					var10[var19] = var13;
					var11[var19] = var14 - 1;
					var19 = var19 + 1 & var12;
					var9[var15][var16 - 1] = 1;
					var8[var15][var16 - 1] = var23;
				}

				if (var16 < var7 - 2
					&& 0 == var9[var15][var16 + 1]
					&& !var4.aw(var21, 2 + var22, 1076101432, -1587529742)
					&& !var4.aw(1 + var21, 2 + var22, 1076101600, -1602049427)) {
					var10[var19] = var13;
					var11[var19] = var14 + 1;
					var19 = var19 + 1 & var12;
					var9[var15][1 + var16] = 4;
					var8[var15][var16 + 1] = var23;
				}

				if (var15 > 0
					&& var16 > 0
					&& var9[var15 - 1][var16 - 1] == 0
					&& !var4.aw(var21 - 1, var22, 1076101438, -1993633170)
					&& !var4.aw(var21 - 1, var22 - 1, 1076101390, -1273888360)
					&& !var4.aw(var21, var22 - 1, 1076101519, -737066638)) {
					var10[var19] = var13 - 1;
					var11[var19] = var14 - 1;
					var19 = 1 + var19 & var12;
					var9[var15 - 1][var16 - 1] = 3;
					var8[var15 - 1][var16 - 1] = var23;
				}

				if (var15 < var6 - 2
					&& var16 > 0
					&& var9[var15 + 1][var16 - 1] == 0
					&& !var4.aw(var21 + 1, var22 - 1, 1076101519, -1917156997)
					&& !var4.aw(2 + var21, var22 - 1, 1076101507, -1580170085)
					&& !var4.aw(2 + var21, var22, 1076101603, -1234046761)) {
					var10[var19] = var13 + 1;
					var11[var19] = var14 - 1;
					var19 = 1 + var19 & var12;
					var9[var15 + 1][var16 - 1] = 9;
					var8[1 + var15][var16 - 1] = var23;
				}

				if (var15 > 0
					&& var16 < var7 - 2
					&& var9[var15 - 1][1 + var16] == 0
					&& !var4.aw(var21 - 1, var22 + 1, 1076101438, -2015611548)
					&& !var4.aw(var21 - 1, 2 + var22, 1076101432, -1822374169)
					&& !var4.aw(var21, 2 + var22, 1076101624, -673244678)) {
					var10[var19] = var13 - 1;
					var11[var19] = 1 + var14;
					var19 = var19 + 1 & var12;
					var9[var15 - 1][1 + var16] = 6;
					var8[var15 - 1][var16 + 1] = var23;
				}

				if (var15 < var6 - 2
					&& var16 < var7 - 2
					&& var9[1 + var15][1 + var16] == 0
					&& !var4.aw(var21 + 1, 2 + var22, 1076101624, -1840870640)
					&& !var4.aw(var21 + 2, var22 + 2, 1076101600, -1061691196)
					&& !var4.aw(var21 + 2, var22 + 1, 1076101603, -723680280)) {
					var10[var19] = var13 + 1;
					var11[var19] = 1 + var14;
					var19 = 1 + var19 & var12;
					var9[var15 + 1][var16 + 1] = 12;
					var8[var15 + 1][var16 + 1] = var23;
				}
			}

			var5.ag(var13, var14);
			return false;
		}
	}

	public gp() {
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILgr;Lgn;Z[I[ILgj;)I"
	)
	public static int ck(gp var0, int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			var9.ak();
			int var10 = var9.ah();
			int var11 = var9.ae();
			int[][] var12 = var9.ay();
			int[][] var13 = var9.aw();
			int[] var14 = var9.as();
			int[] var15 = gj.fg(var9, -1374822839);
			boolean var16;
			if (1 == var3) {
				var16 = var0.av(var1, var2, var4, var5, var9);
			} else if (var3 == 2) {
				var16 = var0.ae(var1, var2, var4, var5, var9);
			} else {
				var16 = var0.ah(var1, var2, var3, var4, var5, var9, -1802066765);
			}

			int var17 = var1 - (var10 >> 1);
			int var18 = var2 - (var11 >> 1);
			int var19 = var9.az();
			int var20 = gj.ep(var9, (byte)14);
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
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int au(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[I)I"
	)
	public int as(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8) {
		return this.az(var1, var2, var3, var4, var5, var6, var7, var8, this.ak_fld[0]);
	}

	@ObfuscatedName("zl")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILgr;Lgn;Lgj;)Z"
	)
	public static boolean zl(gp var0, int var1, int var2, int var3, gr var4, gn var5, gj var6) {
		if (var0 == null) {
			var0.getClass();
		}

		int var7 = var6.ah();
		int var8 = var6.ae();
		int[][] var9 = var6.ay();
		int[][] var10 = var6.aw();
		int[] var11 = var6.as();
		int[] var12 = gj.fg(var6, -1374822839);
		int var13 = var6.af();
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

		label349:
		while (var21 != var20) {
			var14 = var11[var21];
			var15 = var12[var21];
			var21 = 1 + var21 & var13;
			var16 = var14 - var18;
			var17 = var15 - var19;
			int var22 = var14 - var5.ak(-1502380992);
			int var23 = var15 - var5.ag((short)256);
			if (var4.ak(var3, var14, var15, var5, 882337165)) {
				var6.ag(var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0
				&& 0 == var10[var16 - 1][var17]
				&& !var5.aw(var22 - 1, var23, 1076101390, -1774501051)
				&& !var5.aw(var22 - 1, var3 + var23 - 1, 1076101432, -2145812068)) {
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

					if (var5.aw(var22 - 1, var25 + var23, 1305445253, -1523125117)) {
						break;
					}

					var25++;
				}
			}

			if (var16 < var7 - var3
				&& var10[1 + var16][var17] == 0
				&& !var5.aw(var3 + var22, var23, 1076101507, -1172633564)
				&& !var5.aw(var3 + var22, var23 + var3 - 1, 1076101600, -1150762729)) {
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

					if (var5.aw(var22 + var3, var23 + var29, 550110971, -1867441469)) {
						break;
					}

					var29++;
				}
			}

			if (var17 > 0
				&& var10[var16][var17 - 1] == 0
				&& !var5.aw(var22, var23 - 1, 1076101390, -1967780762)
				&& !var5.aw(var22 + var3 - 1, var23 - 1, 1076101507, -1365923277)) {
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

					if (var5.aw(var30 + var22, var23 - 1, 1076101519, -1068393421)) {
						break;
					}

					var30++;
				}
			}

			if (var17 < var8 - var3
				&& 0 == var10[var16][1 + var17]
				&& !var5.aw(var22, var3 + var23, 956168013, -1697707936)
				&& !var5.aw(var22 + var3 - 1, var23 + var3, 1625100339, -672937467)) {
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

					if (var5.aw(var22 + var31, var23 + var3, 1076101624, -888085430)) {
						break;
					}

					var31++;
				}
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !var5.aw(var22 - 1, var23 - 1, 1076101390, -1735877263)) {
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

					if (var5.aw(var22 - 1, var32 + (var23 - 1), 1076101438, -1308533786) || var5.aw(var22 - 1 + var32, var23 - 1, -1548735, -901946305)) {
						break;
					}

					var32++;
				}
			}

			if (var16 < var7 - var3 && var17 > 0 && 0 == var10[1 + var16][var17 - 1] && !var5.aw(var3 + var22, var23 - 1, 1658158335, -590131671)) {
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

					if (var5.aw(var3 + var22, var23 - 1 + var33, -1426031080, -921785731) || var5.aw(var33 + var22, var23 - 1, 1076101519, -815606436)) {
						break;
					}

					var33++;
				}
			}

			if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && !var5.aw(var22 - 1, var23 + var3, 1076101432, -614062020)) {
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

					if (var5.aw(var22 - 1, var23 + var34, 1076101438, -608247134) || var5.aw(var34 + (var22 - 1), var23 + var3, 1731728826, -1046216486)) {
						break;
					}

					var34++;
				}
			}

			if (var16 < var7 - var3 && var17 < var8 - var3 && var10[var16 + 1][1 + var17] == 0 && !var5.aw(var3 + var22, var3 + var23, 987930170, -1578662512)) {
				for (int var35 = 1; var35 < var3; var35++) {
					if (var5.aw(var22 + var35, var23 + var3, 2111656946, -1628759779) || var5.aw(var3 + var22, var35 + var23, 1076101603, -1892209817)) {
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

		var6.ag(var14, var15);
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[ILgj;)I"
	)
	int ax(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		var9.ak();
		int var10 = var9.ah();
		int var11 = var9.ae();
		int[][] var12 = var9.ay();
		int[][] var13 = var9.aw();
		int[] var14 = var9.as();
		int[] var15 = gj.fg(var9, -1374822839);
		boolean var16;
		if (1 == var3) {
			var16 = this.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.ae(var1, var2, var4, var5, var9);
		} else {
			var16 = this.ah(var1, var2, var3, var4, var5, var9, -1363540962);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.az();
		int var20 = gj.ep(var9, (byte)14);
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

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Lgp;IIILgr;Lgn;Lgj;)Z"
	)
	public static boolean og(gp var0, int var1, int var2, int var3, gr var4, gn var5, gj var6) {
		if (var0 == null) {
			var0.getClass();
		}

		int var7 = var6.ah();
		int var8 = var6.ae();
		int[][] var9 = var6.ay();
		int[][] var10 = var6.aw();
		int[] var11 = var6.as();
		int[] var12 = gj.fg(var6, -1374822839);
		int var13 = var6.af();
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
				var6.ag(var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0
				&& 0 == var10[var16 - 1][var17]
				&& !var5.aw(var22 - 1, var23, 1076101390, -1905072982)
				&& !var5.aw(var22 - 1, var3 + var23 - 1, 1076101432, -977868054)) {
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

					if (var5.aw(var22 - 1, var25 + var23, 379377091, -863352790)) {
						break;
					}

					var25++;
				}
			}

			if (var16 < var7 - var3
				&& var10[1 + var16][var17] == 0
				&& !var5.aw(var3 + var22, var23, 1076101507, -2001021994)
				&& !var5.aw(var3 + var22, var23 + var3 - 1, 1076101600, -940569310)) {
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

					if (var5.aw(var22 + var3, var23 + var29, 1076101603, -510581494)) {
						break;
					}

					var29++;
				}
			}

			if (var17 > 0
				&& var10[var16][var17 - 1] == 0
				&& !var5.aw(var22, var23 - 1, -703502976, -2006613863)
				&& !var5.aw(var22 + var3 - 1, var23 - 1, 614066417, -1110223144)) {
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

					if (var5.aw(var30 + var22, var23 - 1, 1931056539, -1002992483)) {
						break;
					}

					var30++;
				}
			}

			if (var17 < var8 - var3
				&& 0 == var10[var16][1 + var17]
				&& !var5.aw(var22, var3 + var23, 750150774, -817006998)
				&& !var5.aw(var22 + var3 - 1, var23 + var3, 1076101600, -816098411)) {
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

					if (var5.aw(var22 + var31, var23 + var3, 921961755, -1050559531)) {
						break;
					}

					var31++;
				}
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !var5.aw(var22 - 1, var23 - 1, -674107397, -641394550)) {
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

					if (var5.aw(var22 - 1, var32 + (var23 - 1), 1076101438, -628501899) || var5.aw(var22 - 1 + var32, var23 - 1, -247010685, -528849532)) {
						break;
					}

					var32++;
				}
			}

			if (var16 < var7 - var3 && var17 > 0 && 0 == var10[1 + var16][var17 - 1] && !var5.aw(var3 + var22, var23 - 1, 1076101507, -1229623332)) {
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

					if (var5.aw(var3 + var22, var23 - 1 + var33, 1076101603, -1734192024) || var5.aw(var33 + var22, var23 - 1, 620581630, -879783839)) {
						break;
					}

					var33++;
				}
			}

			if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && !var5.aw(var22 - 1, var23 + var3, 1076101432, -1862490529)) {
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

					if (var5.aw(var22 - 1, var23 + var34, 1076101438, -1051183523) || var5.aw(var34 + (var22 - 1), var23 + var3, 1959868711, -2126020802)) {
						break;
					}

					var34++;
				}
			}

			if (var16 < var7 - var3 && var17 < var8 - var3 && var10[var16 + 1][1 + var17] == 0 && !var5.aw(var3 + var22, var3 + var23, -733522062, -1148413005)) {
				for (int var35 = 1; var35 < var3; var35++) {
					if (var5.aw(var22 + var35, var23 + var3, 1076101624, -778786922) || var5.aw(var3 + var22, var35 + var23, 1746879720, -909606038)) {
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

		var6.ag(var14, var15);
		return false;
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(Ldx;ZLxj;B)V"
	)
	static final void ey(dx var0, boolean var1, xj var2, byte var3) throws EOFException {
		client.uk(var0, var1, var2);
		client.nv_fld = 0;
		client.lx_fld = 0;
		var2.as(-203585802);
		int var4 = var2.ar(8, -106081977);
		if (var4 < var0.am_fld.az()) {
			if (var3 == 0) {
				client.ls(var0, var1, var2);
				return;
			}

			for (int var5 = var4; var5 < var0.am_fld.az(); var5++) {
				if (var3 == 0) {
					client.ls(var0, var1, var2);
					return;
				}

				int var6 = yw.wk(var0.am_fld, var5, (byte)21);
				client.nm_fld[(client.nv_fld += 839171927) * -139289497 - 1] = var6;
				ds var7 = (ds)var0.ax_fld.ae(var6);
				var7.aw_fld = true;
			}
		}

		if (var4 > var0.am_fld.az()) {
			throw new RuntimeException("");
		} else {
			var0.am_fld.av();

			for (int var18 = 0; var18 < var4; var18++) {
				if (var3 == 0) {
					client.ls(var0, var1, var2);
					return;
				}

				int var21 = yw.wk(var0.am_fld, var18, (byte)66);
				ds var24 = (ds)var0.ax_fld.ae(var21);
				int var8 = var2.ar(1, -106081977);
				if (0 == var8) {
					var0.am_fld.ak(var21);
				} else {
					int var9 = var2.ar(2, -106081977);
					if (var9 == 0) {
						var0.am_fld.ak(var21);
						client.lj_fld[(client.lx_fld += 2012869705) * 1900822009 - 1] = var21;
					} else if (1 == var9) {
						var0.am_fld.ak(var21);
						int var10 = var2.ar(3, -106081977);
						var24.as(var10, gt.az_fld, -964878378);
						int var11 = var2.ar(1, -106081977);
						if (1 == var11) {
							client.lj_fld[(client.lx_fld += 2012869705) * 1900822009 - 1] = var21;
						}
					} else if (var9 == 2) {
						var0.am_fld.ak(var21);
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
				if (xj.mv(var2, client.appletStub.aw_fld) < var16 + 12) {
					break;
				}

				int var22 = var2.ar(var16, -106081977);
				if (var19 - 1 == var22) {
					break;
				}

				boolean var25 = false;
				ds var26 = (ds)var0.ax_fld.ae(var22);
				if (null == var26) {
					var26 = new ds(var22);
					xf.sk(var0.ax_fld, var26, var22);
					var25 = true;
				}

				var0.am_fld.ak(var22);
				var26.aw_fld = false;
				var26.bf_fld = var0.ag_fld;
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
					var26.bt_fld = (var26.bc_fld = -450034243 * var12) * 1246307829;
					da.mj(var26, var26.bt_fld, (byte)10);
				}

				pp var10001 = ca.az(var2.ar(14, -106081977));
				var26.cu(var10001);
				var26.ah_fld = var10001;
				int var31;
				if (var1) {
					var31 = var2.ar(8, -106081977);
					if (var31 > 127) {
						if (var3 == 0) {
							client.ls(var0, var1, var2);
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
						client.ls(var0, var1, var2);
						return;
					}

					var2.ar(32, -106081977);
				}

				vj.el(var26);
				if (var26.bw_fld == 0) {
					var26.bc_fld = 0;
				}

				boolean var15 = var27 == 1 || var25;
				var26.ar(var31 + ep.ex_fld, by.eo_fld + var33, var15, (byte)77);
				if (var25) {
					var0.as(var26, 1557190008);
				}
			}

			var2.af(-1180972180);
			bv.em(var0, var2, -201108339);

			for (int var17 = 0; var17 < client.nv_fld; var17++) {
				if (var3 == 0) {
					client.ls(var0, var1, var2);
					return;
				}

				int var20 = client.nm_fld[var17];
				ds var23 = (ds)var0.ax_fld.ae(var20);
				if (var23.aw_fld) {
					var23.cu((pp)null);
					var23.ah_fld = null;
					var23.mb();
				}
			}

			if (var2.au_fld != client.appletStub.aw_fld) {
				throw new RuntimeException(var2.au_fld + db.ag_fld + client.appletStub.aw_fld);
			} else {
				client.ls(var0, var1, var2);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[ILgj;)I"
	)
	int ai(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		var9.ak();
		int var10 = var9.ah();
		int var11 = var9.ae();
		int[][] var12 = var9.ay();
		int[][] var13 = var9.aw();
		int[] var14 = var9.as();
		int[] var15 = gj.fg(var9, -1374822839);
		boolean var16;
		if (1 == var3) {
			var16 = this.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.ae(var1, var2, var4, var5, var9);
		} else {
			var16 = this.ah(var1, var2, var3, var4, var5, var9, 371376448);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.az();
		int var20 = gj.ep(var9, (byte)14);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Lgj;)Z"
	)
	final boolean ab(int var1, int var2, int var3, gr var4, gn var5, gj var6) {
		int var7 = var6.ah();
		int var8 = var6.ae();
		int[][] var9 = var6.ay();
		int[][] var10 = var6.aw();
		int[] var11 = var6.as();
		int[] var12 = gj.fg(var6, -1374822839);
		int var13 = var6.af();
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
				var6.ag(var14, var15);
				return true;
			}

			int var24 = var9[var16][var17] + 1;
			if (var16 > 0
				&& 0 == var10[var16 - 1][var17]
				&& !var5.aw(var22 - 1, var23, 1076101390, -1574218925)
				&& !var5.aw(var22 - 1, var3 + var23 - 1, 286083789, -654819485)) {
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

					if (var5.aw(var22 - 1, var25 + var23, 1076101438, -1187890523)) {
						break;
					}

					var25++;
				}
			}

			if (var16 < var7 - var3
				&& var10[1 + var16][var17] == 0
				&& !var5.aw(var3 + var22, var23, 1076101507, -1523628931)
				&& !var5.aw(var3 + var22, var23 + var3 - 1, 613301150, -541846576)) {
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

					if (var5.aw(var22 + var3, var23 + var29, -629367919, -662183643)) {
						break;
					}

					var29++;
				}
			}

			if (var17 > 0
				&& var10[var16][var17 - 1] == 0
				&& !var5.aw(var22, var23 - 1, 597326187, -1173535782)
				&& !var5.aw(var22 + var3 - 1, var23 - 1, 1076101507, -1095458120)) {
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

					if (var5.aw(var30 + var22, var23 - 1, 1749763537, -1990976620)) {
						break;
					}

					var30++;
				}
			}

			if (var17 < var8 - var3
				&& 0 == var10[var16][1 + var17]
				&& !var5.aw(var22, var3 + var23, 1737933537, -573553264)
				&& !var5.aw(var22 + var3 - 1, var23 + var3, 1076101600, -1663944863)) {
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

					if (var5.aw(var22 + var31, var23 + var3, -1353704895, -1379763873)) {
						break;
					}

					var31++;
				}
			}

			if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !var5.aw(var22 - 1, var23 - 1, 1076101390, -825828105)) {
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

					if (var5.aw(var22 - 1, var32 + (var23 - 1), 1076101438, -805162707) || var5.aw(var22 - 1 + var32, var23 - 1, -1838373649, -2008752781)) {
						break;
					}

					var32++;
				}
			}

			if (var16 < var7 - var3 && var17 > 0 && 0 == var10[1 + var16][var17 - 1] && !var5.aw(var3 + var22, var23 - 1, 1076101507, -1093582423)) {
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

					if (var5.aw(var3 + var22, var23 - 1 + var33, 588813147, -1524486084) || var5.aw(var33 + var22, var23 - 1, 1076101519, -1225776294)) {
						break;
					}

					var33++;
				}
			}

			if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && !var5.aw(var22 - 1, var23 + var3, 1076101432, -1967317468)) {
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

					if (var5.aw(var22 - 1, var23 + var34, 1076101438, -973003676) || var5.aw(var34 + (var22 - 1), var23 + var3, 200084274, -1130403121)) {
						break;
					}

					var34++;
				}
			}

			if (var16 < var7 - var3 && var17 < var8 - var3 && var10[var16 + 1][1 + var17] == 0 && !var5.aw(var3 + var22, var3 + var23, 1076101600, -1356992536)) {
				for (int var35 = 1; var35 < var3; var35++) {
					if (var5.aw(var22 + var35, var23 + var3, -2037142406, -1526109949) || var5.aw(var3 + var22, var35 + var23, 1201336921, -567106132)) {
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

		var6.ag(var14, var15);
		return false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILgr;Lgn;Lgj;)Z"
	)
	final boolean am(int var1, int var2, gr var3, gn var4, gj var5) {
		int var6 = var5.ah();
		int var7 = var5.ae();
		int[][] var8 = var5.ay();
		int[][] var9 = var5.aw();
		int[] var10 = var5.as();
		int[] var11 = gj.fg(var5, -1374822839);
		int var12 = var5.af();
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
				var5.ag(var13, var14);
				return true;
			}

			int var23 = 1 + var8[var15][var16];
			if (var15 > 0 && 0 == var9[var15 - 1][var16] && !var4.aw(var21 - 1, var22, 1076101384, -1567737858)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14;
				var19 = var19 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 1 && 0 == var9[1 + var15][var16] && !var4.aw(var21 + 1, var22, 1076101504, -618948455)) {
				var10[var19] = 1 + var13;
				var11[var19] = var14;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.aw(var21, var22 - 1, 1076101378, -1631084301)) {
				var10[var19] = var13;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && !var4.aw(var21, var22 + 1, 1076101408, -1973747731)) {
				var10[var19] = var13;
				var11[var19] = 1 + var14;
				var19 = var19 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][1 + var16] = var23;
			}

			if (var15 > 0
				&& var16 > 0
				&& 0 == var9[var15 - 1][var16 - 1]
				&& !var4.aw(var21 - 1, var22 - 1, 1076101390, -896398706)
				&& !var4.aw(var21 - 1, var22, 1076101384, -2101607757)
				&& !var4.aw(var21, var22 - 1, 1076101378, -706114321)) {
				var10[var19] = var13 - 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 1
				&& var16 > 0
				&& var9[var15 + 1][var16 - 1] == 0
				&& !var4.aw(var21 + 1, var22 - 1, 1076101507, -925539473)
				&& !var4.aw(var21 + 1, var22, 1076101504, -687446719)
				&& !var4.aw(var21, var22 - 1, 1076101378, -1412860959)) {
				var10[var19] = var13 + 1;
				var11[var19] = var14 - 1;
				var19 = 1 + var19 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var23;
			}

			if (var15 > 0
				&& var16 < var7 - 1
				&& var9[var15 - 1][var16 + 1] == 0
				&& !var4.aw(var21 - 1, 1 + var22, 1076101432, -532010303)
				&& !var4.aw(var21 - 1, var22, 1076101384, -939729091)
				&& !var4.aw(var21, var22 + 1, 1076101408, -1412097845)) {
				var10[var19] = var13 - 1;
				var11[var19] = 1 + var14;
				var19 = 1 + var19 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][1 + var16] = var23;
			}

			if (var15 < var6 - 1
				&& var16 < var7 - 1
				&& 0 == var9[1 + var15][1 + var16]
				&& !var4.aw(1 + var21, var22 + 1, 1076101600, -547286685)
				&& !var4.aw(1 + var21, var22, 1076101504, -1627210723)
				&& !var4.aw(var21, var22 + 1, 1076101408, -1612360882)) {
				var10[var19] = 1 + var13;
				var11[var19] = var14 + 1;
				var19 = var19 + 1 & var12;
				var9[1 + var15][1 + var16] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		var5.ag(var13, var14);
		return false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[ILgj;B)I"
	)
	int az(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		var9.ak();
		int var11 = var9.ah();
		int var12 = var9.ae();
		int[][] var13 = var9.ay();
		int[][] var14 = var9.aw();
		int[] var15 = var9.as();
		int[] var16 = gj.fg(var9, -1374822839);
		boolean var17;
		if (1 == var3) {
			var17 = this.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var17 = this.ae(var1, var2, var4, var5, var9);
		} else {
			var17 = this.ah(var1, var2, var3, var4, var5, var9, -1526941346);
		}

		int var18 = var1 - (var11 >> 1);
		int var19 = var2 - (var12 >> 1);
		int var20 = var9.az();
		int var21 = gj.ep(var9, (byte)14);
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
		descriptor = "(I)V"
	)
	public void ak(int var1) {
		this.ak_fld = new gj[1];
		gh var2 = gh.az_fld;
		this.ak_fld[0] = new gj(var2.ar_fld, var2.af_fld);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	public static void aw(byte var0) {
		try {
			zu.pw(mh.af_fld, 1352694741);

			for (int var1 = 0; var1 < lz.am_fld; var1++) {
				if (var0 == 0) {
					return;
				}

				zu.pw(tw.au_fld[var1], 1352694741);
			}

			zu.pw(mh.al_fld, 1352694741);
			zu.pw(mh.ad_fld, 1352694741);
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILgr;Lgn;Z[I[ILgj;)I"
	)
	int an(int var1, int var2, int var3, gr var4, gn var5, boolean var6, int[] var7, int[] var8, gj var9) {
		var9.ak();
		int var10 = var9.ae();
		int var11 = var9.ah();
		int[][] var12 = var9.ay();
		int[][] var13 = var9.ay();
		int[] var14 = var9.ar(-2017213955);
		int[] var15 = gj.fg(var9, -1374822839);
		boolean var16;
		if (1 == var3) {
			var16 = this.av(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.ae(var1, var2, var4, var5, var9);
		} else {
			var16 = this.ah(var1, var2, var3, var4, var5, var9, 371376448);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.az();
		int var20 = gj.ep(var9, (byte)14);
		if (!var16) {
			if (!var6) {
				return -1;
			}

			int var21 = 402047182;
			int var22 = Integer.MAX_VALUE;
			byte var23 = 10;
			int var24 = var4.ak_fld;
			int var25 = -517554948 * var4.az_fld;
			int var26 = 618953957 * var4.az_fld;
			int var27 = 1755038709 * var4.ag_fld;

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
