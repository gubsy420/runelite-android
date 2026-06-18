import java.io.EOFException;
import java.math.BigInteger;
import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nn")
public class nn extends vc {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static iw ak_fld = new iw(64);
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lyc;"
	)
	static yc cf_fld;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ac_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ca_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void ag() {
		ak_fld.av();
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lpb;II)I"
	)
	public static int ng(pb var0, int var1, int var2) {
		if (var1 >= var0.ag_fld.size()) {
			return -1;
		} else {
			ArrayList var3 = (ArrayList)(ArrayList)var0.ag_fld.get(var1);

			for (int var4 = 0; var4 < var3.size(); var4++) {
				pm var5 = (pm)(pm)var3.get(var4);
				if (var5.ak_fld == var2) {
					return var4;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public static void az() {
		ak_fld.av();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;IB)V"
	)
	static void ay(dx var0, da var1, int var2) throws EOFException {
		try {
			id.as(var0, var1.bi_fld, var1.dm_fld, var2, var1.br((byte)63), -714968971);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I"
	)
	static int bp(int var0, ba var1, boolean var2) {
		if (4000 == var0) {
			gz.ax_fld -= 2;
			int var60 = bp.au_fld[gz.ax_fld];
			int var83 = bp.au_fld[gz.ax_fld + 1];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var83 + var60;
			return 1;
		} else if (4001 == var0) {
			gz.ax_fld -= 2;
			int var59 = bp.au_fld[gz.ax_fld];
			int var82 = bp.au_fld[gz.ax_fld + 1];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var59 - var82;
			return 1;
		} else if (4002 == var0) {
			gz.ax_fld -= 2;
			int var58 = bp.au_fld[gz.ax_fld];
			int var81 = bp.au_fld[1 + gz.ax_fld];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var58 * var81;
			return 1;
		} else if (var0 == 4003) {
			gz.ax_fld -= 2;
			int var57 = bp.au_fld[gz.ax_fld];
			int var80 = bp.au_fld[gz.ax_fld + 1];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var57 / var80;
			return 1;
		} else if (4004 == var0) {
			int var56 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)(Math.random() * var56);
			return 1;
		} else if (var0 == 4005) {
			int var55 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)(Math.random() * (var55 + 1));
			return 1;
		} else if (4006 == var0) {
			gz.ax_fld -= 5;
			int var54 = bp.au_fld[gz.ax_fld];
			int var79 = bp.au_fld[gz.ax_fld + 1];
			int var107 = bp.au_fld[gz.ax_fld + 2];
			int var113 = bp.au_fld[3 + gz.ax_fld];
			int var120 = bp.au_fld[gz.ax_fld + 4];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var54 + (var120 - var107) * (var79 - var54) / (var113 - var107);
			return 1;
		} else if (var0 == 4007) {
			gz.ax_fld -= 2;
			int var53 = bp.au_fld[gz.ax_fld];
			int var78 = bp.au_fld[1 + gz.ax_fld];
			bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var53 + var78 * var53 / 100;
			return 1;
		} else if (4008 == var0) {
			gz.ax_fld -= 2;
			int var52 = bp.au_fld[gz.ax_fld];
			int var77 = bp.au_fld[1 + gz.ax_fld];
			if (var77 >= 0 && var77 <= 31) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var52 | 1 << var77;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var52;
			}

			return 1;
		} else if (var0 == 4009) {
			gz.ax_fld -= 2;
			int var51 = bp.au_fld[gz.ax_fld];
			int var76 = bp.au_fld[gz.ax_fld + 1];
			if (var76 >= 0 && var76 <= 31) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var51 & -1 - (1 << var76);
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var51;
			}

			return 1;
		} else if (4010 != var0) {
			if (var0 == 4011) {
				gz.ax_fld -= 2;
				int var50 = bp.au_fld[gz.ax_fld];
				int var75 = bp.au_fld[gz.ax_fld + 1];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var50 % var75;
				return 1;
			} else if (var0 == 4012) {
				gz.ax_fld -= 2;
				int var49 = bp.au_fld[gz.ax_fld];
				int var74 = bp.au_fld[gz.ax_fld + 1];
				if (0 == var49) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)Math.pow(var49, var74);
				}

				return 1;
			} else if (var0 == 4013) {
				gz.ax_fld -= 2;
				int var48 = bp.au_fld[gz.ax_fld];
				int var73 = bp.au_fld[gz.ax_fld + 1];
				if (var48 == 0) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
					return 1;
				} else {
					switch (var73) {
						case 0:
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = Integer.MAX_VALUE;
							break;
						case 1:
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var48;
							break;
						case 2:
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)Math.sqrt(var48);
							break;
						case 3:
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)Math.cbrt(var48);
							break;
						case 4:
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)Math.sqrt(Math.sqrt(var48));
							break;
						default:
							bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)Math.pow(var48, 1.0 / var73);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				gz.ax_fld -= 2;
				int var47 = bp.au_fld[gz.ax_fld];
				int var72 = bp.au_fld[1 + gz.ax_fld];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var47 & var72;
				return 1;
			} else if (var0 == 4015) {
				gz.ax_fld -= 2;
				int var46 = bp.au_fld[gz.ax_fld];
				int var71 = bp.au_fld[1 + gz.ax_fld];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var46 | var71;
				return 1;
			} else if (4016 == var0) {
				gz.ax_fld -= 2;
				int var45 = bp.au_fld[gz.ax_fld];
				int var70 = bp.au_fld[1 + gz.ax_fld];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var45 < var70 ? var45 : var70;
				return 1;
			} else if (var0 == 4017) {
				gz.ax_fld -= 2;
				int var44 = bp.au_fld[gz.ax_fld];
				int var69 = bp.au_fld[gz.ax_fld + 1];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var44 > var69 ? var44 : var69;
				return 1;
			} else if (4018 == var0) {
				gz.ax_fld -= 3;
				long var43 = bp.au_fld[gz.ax_fld];
				long var106 = bp.au_fld[1 + gz.ax_fld];
				long var119 = bp.au_fld[gz.ax_fld + 2];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = (int)(var43 * var119 / var106);
				return 1;
			} else if (4025 == var0) {
				int var42 = hm.ag(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var42;
				return 1;
			} else if (var0 == 4026) {
				gz.ax_fld -= 2;
				int var41 = bp.au_fld[gz.ax_fld];
				int var68 = bp.au_fld[gz.ax_fld + 1];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var41 ^ 1 << var68;
				return 1;
			} else if (4027 == var0) {
				gz.ax_fld -= 3;
				int var40 = bp.au_fld[gz.ax_fld];
				int var67 = bp.au_fld[gz.ax_fld + 1];
				int var105 = bp.au_fld[2 + gz.ax_fld];
				if (var67 >= 0 && var67 <= 31 && var105 >= 0 && var105 <= 31) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = ce.ah(var40, var67, var105);
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var40;
					return 1;
				}
			} else if (4028 == var0) {
				gz.ax_fld -= 3;
				int var39 = bp.au_fld[gz.ax_fld];
				int var66 = bp.au_fld[gz.ax_fld + 1];
				int var104 = bp.au_fld[2 + gz.ax_fld];
				if (var66 >= 0 && var66 <= 31 && var104 >= 0 && var104 <= 31) {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = vh.av(var39, var66, var104);
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var39;
					return 1;
				}
			} else if (var0 == 4029) {
				gz.ax_fld -= 3;
				int var38 = bp.au_fld[gz.ax_fld];
				int var65 = bp.au_fld[1 + gz.ax_fld];
				int var103 = bp.au_fld[2 + gz.ax_fld];
				if (var65 >= 0 && var65 <= 31 && var103 >= 0 && var103 <= 31) {
					int var112 = 31 - var103;
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var38 << var112 >>> var65 + var112;
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var38;
					return 1;
				}
			} else if (4030 == var0) {
				gz.ax_fld -= 4;
				int var36 = bp.au_fld[gz.ax_fld];
				int var64 = bp.au_fld[gz.ax_fld + 1];
				int var102 = bp.au_fld[2 + gz.ax_fld];
				int var111 = bp.au_fld[3 + gz.ax_fld];
				if (var102 >= 0 && var102 <= 31 && var111 >= 0 && var111 <= 31) {
					var36 = vh.av(var36, var102, var111);
					int var118 = (int)ub.ak(var111 - var102 + 1, -1793925999);
					if (var64 > var118) {
						var64 = var118;
					}

					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var36 | var64 << var102;
					return 1;
				} else {
					bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var36;
					return 1;
				}
			} else if (4032 == var0) {
				bp.au_fld[gz.ax_fld - 1] = xg.az(bp.au_fld[gz.ax_fld - 1], 1484270745);
				return 1;
			} else if (4033 == var0) {
				bp.au_fld[gz.ax_fld - 1] = ok.av(bp.au_fld[gz.ax_fld - 1]);
				return 1;
			} else if (4034 == var0) {
				gz.ax_fld -= 2;
				int var35 = bp.au_fld[gz.ax_fld];
				int var63 = bp.au_fld[gz.ax_fld + 1];
				int var101 = cy.ag(var35, var63);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var101;
				return 1;
			} else if (4035 == var0) {
				bp.au_fld[gz.ax_fld - 1] = Math.abs(bp.au_fld[gz.ax_fld - 1]);
				return 1;
			} else if (4036 == var0) {
				String var34 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
				int var62 = -1;
				if (dz.ag(var34)) {
					var62 = tf.av(var34);
				}

				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var62;
				return 1;
			} else if (4037 == var0) {
				db.aa_fld -= 2;
				long var33 = bp.an_fld[db.aa_fld];
				long var100 = bp.an_fld[1 + db.aa_fld];
				long var117 = var100 + var33;
				if (var117 > var33 != var100 > 0L) {
					throw new RuntimeException("");
				} else {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var117;
					return 1;
				}
			} else if (var0 == 4038) {
				db.aa_fld -= 2;
				long var32 = bp.an_fld[db.aa_fld];
				long var99 = bp.an_fld[1 + db.aa_fld];
				long var116 = var32 - var99;
				if (var116 > var32 != var99 < 0L) {
					throw new RuntimeException("");
				} else {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var116;
					return 1;
				}
			} else if (var0 == 4039) {
				db.aa_fld -= 2;
				long var31 = bp.an_fld[db.aa_fld];
				long var98 = bp.an_fld[db.aa_fld + 1];
				long var115 = var98 * var31;
				if (var98 != 0L && var115 / var98 != var31) {
					throw new RuntimeException("");
				} else {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var115;
					return 1;
				}
			} else if (var0 == 4040) {
				db.aa_fld -= 2;
				long var30 = bp.an_fld[db.aa_fld];
				long var97 = bp.an_fld[db.aa_fld + 1];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var30 / var97;
				return 1;
			} else if (4041 == var0) {
				db.aa_fld -= 2;
				long var29 = bp.an_fld[db.aa_fld];
				long var96 = bp.an_fld[db.aa_fld + 1];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var29 < var96 ? var29 : var96;
				return 1;
			} else if (4042 == var0) {
				db.aa_fld -= 2;
				long var28 = bp.an_fld[db.aa_fld];
				long var95 = bp.an_fld[db.aa_fld + 1];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var28 > var95 ? var28 : var95;
				return 1;
			} else if (var0 == 4043) {
				db.aa_fld -= 3;
				BigInteger var27 = BigInteger.valueOf(bp.an_fld[db.aa_fld]);
				BigInteger var61 = BigInteger.valueOf(bp.an_fld[db.aa_fld + 1]);
				BigInteger var94 = BigInteger.valueOf(bp.an_fld[2 + db.aa_fld]);
				if (BigInteger.ZERO == var61) {
					throw new RuntimeException("");
				} else {
					BigInteger var110 = var27.multiply(var94).divide(var61);
					if (var110.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && var110.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
						bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var110.longValue();
						return 1;
					} else {
						throw new RuntimeException("");
					}
				}
			} else if (4044 == var0) {
				gz.ax_fld--;
				int var26 = bp.au_fld[gz.ax_fld];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var26;
				return 1;
			} else if (var0 == 4047) {
				db.aa_fld--;
				gz.ax_fld--;
				long var25 = bp.an_fld[db.aa_fld];
				int var93 = bp.au_fld[gz.ax_fld];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var25 | 1L << var93;
				return 1;
			} else if (4048 == var0) {
				db.aa_fld--;
				gz.ax_fld--;
				long var24 = bp.an_fld[db.aa_fld];
				int var92 = bp.au_fld[gz.ax_fld];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var24 & -1L - (1L << var92);
				return 1;
			} else if (4049 == var0) {
				db.aa_fld--;
				gz.ax_fld--;
				long var23 = bp.an_fld[db.aa_fld];
				int var91 = bp.au_fld[gz.ax_fld];
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0L != (var23 & 1L << var91) ? 1 : 0;
				return 1;
			} else if (var0 == 4050) {
				int var22 = ot.az(bp.an_fld[(db.aa_fld -= 432101741) * 867932261]);
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = var22;
				return 1;
			} else if (4051 == var0) {
				db.aa_fld--;
				gz.ax_fld--;
				long var21 = bp.an_fld[db.aa_fld];
				int var90 = bp.au_fld[gz.ax_fld];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var21 ^ 1L << var90;
				return 1;
			} else if (4052 == var0) {
				db.aa_fld--;
				gz.ax_fld -= 2;
				long var20 = bp.an_fld[db.aa_fld];
				int var89 = og.al(0, 63, bp.au_fld[gz.ax_fld]);
				int var109 = og.al(0, 63, bp.au_fld[gz.ax_fld + 1]);
				if (var109 < var89) {
					throw new RuntimeException("");
				} else {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = rq.aw(var20, var89, var109);
					return 1;
				}
			} else if (var0 == 4053) {
				db.aa_fld--;
				gz.ax_fld -= 2;
				long var19 = bp.an_fld[db.aa_fld];
				int var88 = og.al(0, 63, bp.au_fld[gz.ax_fld]);
				int var108 = og.al(0, 63, bp.au_fld[1 + gz.ax_fld]);
				if (var108 < var88) {
					throw new RuntimeException("");
				} else {
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = yb.ae(var19, var88, var108);
					return 1;
				}
			} else if (4054 == var0) {
				db.aa_fld--;
				gz.ax_fld -= 2;
				long var18 = bp.an_fld[db.aa_fld];
				int var87 = og.al(0, 63, bp.au_fld[gz.ax_fld]);
				int var7 = og.al(0, 63, bp.au_fld[1 + gz.ax_fld]);
				if (var7 < var87) {
					throw new RuntimeException("");
				} else {
					int var114 = 63 - var7;
					bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var18 << var114 >>> var87 + var114;
					return 1;
				}
			} else if (4055 == var0) {
				db.aa_fld -= 2;
				long var17 = bp.an_fld[db.aa_fld];
				long var86 = bp.an_fld[db.aa_fld + 1];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var17 % var86;
				return 1;
			} else if (var0 == 4056) {
				db.aa_fld -= 2;
				long var16 = bp.an_fld[db.aa_fld];
				long var85 = bp.an_fld[1 + db.aa_fld];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var16 & var85;
				return 1;
			} else if (var0 == 4057) {
				db.aa_fld -= 2;
				long var15 = bp.an_fld[db.aa_fld];
				long var84 = bp.an_fld[1 + db.aa_fld];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var15 | var84;
				return 1;
			} else if (var0 == 4058) {
				db.aa_fld--;
				long var14 = bp.an_fld[db.aa_fld];
				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = ~var14;
				return 1;
			} else if (var0 == 4059) {
				gz.ax_fld -= 2;
				db.aa_fld -= 2;
				long var12 = bp.an_fld[db.aa_fld];
				long var6 = bp.an_fld[db.aa_fld + 1];
				int var8 = bp.au_fld[gz.ax_fld];
				int var9 = bp.au_fld[1 + gz.ax_fld];
				var12 = yb.ae(var12, var8, var9);
				long var10 = ub.ak(var9 - var8 + 1, -1793925999);
				if (var6 > var10) {
					var6 = var10;
				}

				bp.an_fld[(db.aa_fld += 432101741) * 867932261 - 1] = var12 | var6 << var8;
				return 1;
			} else {
				return 2;
			}
		} else {
			gz.ax_fld -= 2;
			int var4 = bp.au_fld[gz.ax_fld];
			int var5 = bp.au_fld[1 + gz.ax_fld];
			if (var5 >= 0 && var5 <= 31) {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0 != (var4 & 1 << var5) ? 1 : 0;
			} else {
				bp.au_fld[(gz.ax_fld += -1684678759) * -776631127 - 1] = 0;
			}

			return 1;
		}
	}

	nn() throws Throwable {
		throw new Error();
	}
}
