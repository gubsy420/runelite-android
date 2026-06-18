import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xn")
public class xn {
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
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ae_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lxb;"
	)
	static xb ay_fld = new xb();

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)B"
	)
	static byte aq(xb var0) {
		return (byte)ah(1, var0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)I"
	)
	public static int ak(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (ay_fld) {
			ay_fld.ar_fld = var2;
			ay_fld.af_fld = var4;
			ay_fld.au_fld = var0;
			ay_fld.ax_fld = 0;
			ay_fld.an_fld = var1;
			ay_fld.ad_fld = 0;
			ay_fld.am_fld = 0;
			ay_fld.al_fld = 0;
			ay_fld.aa_fld = 0;
			az(ay_fld);
			var1 -= ay_fld.an_fld;
			ay_fld.ar_fld = null;
			ay_fld.au_fld = null;
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void an(xb var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.ao_fld = -382637799;
		if (xb.ak_fld == null) {
			xb.ak_fld = new int[var0.ao_fld * -188846176];
		}

		boolean var26 = true;

		while (var26) {
			byte var1 = av(var0);
			if (var1 == 23) {
				return;
			}

			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = ae(var0);
			if (var1 != 0) {
			}

			var0.ab_fld = 0;
			var1 = av(var0);
			var0.ab_fld = var0.ab_fld << 8 | var1 & 255;
			var1 = av(var0);
			var0.ab_fld = var0.ab_fld << 8 | var1 & 255;
			var1 = av(var0);
			var0.ab_fld = var0.ab_fld << 8 | var1 & 255;

			for (int var56 = 0; var56 < 16; var56++) {
				var1 = ae(var0);
				if (var1 == 1) {
					var0.br_fld[var56] = true;
				} else {
					var0.br_fld[var56] = false;
				}
			}

			for (int var57 = 0; var57 < 256; var57++) {
				var0.bz_fld[var57] = false;
			}

			for (int var58 = 0; var58 < 16; var58++) {
				if (var0.br_fld[var58]) {
					for (int var67 = 0; var67 < 16; var67++) {
						var1 = ae(var0);
						if (var1 == 1) {
							var0.bz_fld[var58 * 16 + var67] = true;
						}
					}
				}
			}

			aw(var0);
			int var71 = var0.bd_fld + 2;
			int var72 = ah(3, var0);
			int var73 = ah(15, var0);

			for (int var59 = 0; var59 < var73; var59++) {
				int var68 = 0;

				while (true) {
					var1 = ae(var0);
					if (var1 == 0) {
						var0.as_fld[var59] = (byte)var68;
						break;
					}

					var68++;
				}
			}

			byte[] var27 = new byte[6];
			byte var29 = 0;

			while (var29 < var72) {
				var27[var29] = var29++;
			}

			for (int var60 = 0; var60 < var73; var60++) {
				var29 = var0.as_fld[var60];

				byte var28;
				for (var28 = var27[var29]; var29 > 0; var29--) {
					var27[var29] = var27[var29 - 1];
				}

				var27[0] = var28;
				var0.ay_fld[var60] = var28;
			}

			for (int var69 = 0; var69 < var72; var69++) {
				int var83 = ah(5, var0);

				for (int var61 = 0; var61 < var71; var61++) {
					while (true) {
						var1 = ae(var0);
						if (var1 == 0) {
							var0.bk_fld[var69][var61] = (byte)var83;
							break;
						}

						var1 = ae(var0);
						if (var1 == 0) {
							var83++;
						} else {
							var83--;
						}
					}
				}
			}

			for (int var70 = 0; var70 < var72; var70++) {
				byte var2 = 32;
				byte var3 = 0;

				for (int var62 = 0; var62 < var71; var62++) {
					if (var0.bk_fld[var70][var62] > var3) {
						var3 = var0.bk_fld[var70][var62];
					}

					if (var0.bk_fld[var70][var62] < var2) {
						var2 = var0.bk_fld[var70][var62];
					}
				}

				ay(var0.by_fld[var70], var0.bj_fld[var70], var0.bf_fld[var70], var0.bk_fld[var70], var2, var3, var71);
				var0.bl_fld[var70] = var2;
			}

			int var74 = var0.bd_fld + 1;
			int var75 = -1;
			int var76 = 0;

			for (int var63 = 0; var63 <= 255; var63++) {
				var0.ac_fld[var63] = 0;
			}

			int var101 = 4095;

			for (int var96 = 15; var96 >= 0; var96--) {
				for (int var98 = 15; var98 >= 0; var98--) {
					var0.bs_fld[var101] = (byte)(var96 * 16 + var98);
					var101--;
				}

				var0.bh_fld[var96] = var101 + 1;
			}

			int var79 = 0;
			if (var76 == 0) {
				var75++;
				var76 = 50;
				byte var93 = var0.ay_fld[var75];
				var22 = var0.bl_fld[var93];
				var23 = var0.by_fld[var93];
				var25 = var0.bf_fld[var93];
				var24 = var0.bj_fld[var93];
			}

			var76--;
			int var84 = var22;
			int var87 = ah(var22, var0);

			while (var87 > var23[var84]) {
				var84++;
				byte var90 = ae(var0);
				var87 = var87 << 1 | var90;
			}

			int var78 = var25[var87 - var24[var84]];

			while (var78 != var74) {
				if (var78 != 0 && var78 != 1) {
					int var33 = var78 - 1;
					if (var33 < 16) {
						int var103 = var0.bh_fld[0];

						for (var1 = var0.bs_fld[var103 + var33]; var33 > 3; var33 -= 4) {
							int var34 = var103 + var33;
							var0.bs_fld[var34] = var0.bs_fld[var34 - 1];
							var0.bs_fld[var34 - 1] = var0.bs_fld[var34 - 2];
							var0.bs_fld[var34 - 2] = var0.bs_fld[var34 - 3];
							var0.bs_fld[var34 - 3] = var0.bs_fld[var34 - 4];
						}

						while (var33 > 0) {
							var0.bs_fld[var103 + var33] = var0.bs_fld[var103 + var33 - 1];
							var33--;
						}

						var0.bs_fld[var103] = var1;
					} else {
						int var31 = var33 / 16;
						int var32 = var33 % 16;
						int var30 = var0.bh_fld[var31] + var32;

						for (var1 = var0.bs_fld[var30]; var30 > var0.bh_fld[var31]; var30--) {
							var0.bs_fld[var30] = var0.bs_fld[var30 - 1];
						}

						var0.bh_fld[var31]++;

						while (var31 > 0) {
							var0.bh_fld[var31]--;
							var0.bs_fld[var0.bh_fld[var31]] = var0.bs_fld[var0.bh_fld[var31 - 1] + 16 - 1];
							var31--;
						}

						var0.bh_fld[0]--;
						var0.bs_fld[var0.bh_fld[0]] = var1;
						if (var0.bh_fld[0] == 0) {
							var101 = 4095;

							for (int var97 = 15; var97 >= 0; var97--) {
								for (int var99 = 15; var99 >= 0; var99--) {
									var0.bs_fld[var101] = var0.bs_fld[var0.bh_fld[var97] + var99];
									var101--;
								}

								var0.bh_fld[var97] = var101 + 1;
							}
						}
					}

					var0.ac_fld[var0.be_fld[var1 & 255] & 255]++;
					xb.ak_fld[var79] = var0.be_fld[var1 & 255] & 255;
					var79++;
					if (var76 == 0) {
						var75++;
						var76 = 50;
						byte var95 = var0.ay_fld[var75];
						var22 = var0.bl_fld[var95];
						var23 = var0.by_fld[var95];
						var25 = var0.bf_fld[var95];
						var24 = var0.bj_fld[var95];
					}

					var76--;
					var84 = var22;
					var87 = ah(var22, var0);

					while (var87 > var23[var84]) {
						var84++;
						byte var92 = ae(var0);
						var87 = var87 << 1 | var92;
					}

					var78 = var25[var87 - var24[var84]];
				} else {
					int var80 = -1;
					byte var82 = 1;

					do {
						if (var78 == 0) {
							var80 += 1 * var82;
						} else if (var78 == 1) {
							var80 += 2 * var82;
						}

						var82 *= 2;
						if (var76 == 0) {
							var75++;
							var76 = 50;
							byte var94 = var0.ay_fld[var75];
							var22 = var0.bl_fld[var94];
							var23 = var0.by_fld[var94];
							var25 = var0.bf_fld[var94];
							var24 = var0.bj_fld[var94];
						}

						var76--;
						var84 = var22;
						var87 = ah(var22, var0);

						while (var87 > var23[var84]) {
							var84++;
							byte var91 = ae(var0);
							var87 = var87 << 1 | var91;
						}

						var78 = var25[var87 - var24[var84]];
					} while (var78 == 0 || var78 == 1);

					var80++;
					var1 = var0.be_fld[var0.bs_fld[var0.bh_fld[0]] & 255];

					for (var0.ac_fld[var1 & 255] = var0.ac_fld[var1 & 255] + var80; var80 > 0; var80--) {
						xb.ak_fld[var79] = var1 & 255;
						var79++;
					}
				}
			}

			var0.aq_fld = 0;
			var0.ai_fld = 0;
			var0.bm_fld[0] = 0;

			for (int var64 = 1; var64 <= 256; var64++) {
				var0.bm_fld[var64] = var0.ac_fld[var64 - 1];
			}

			for (int var65 = 1; var65 <= 256; var65++) {
				var0.bm_fld[var65] = var0.bm_fld[var65] + var0.bm_fld[var65 - 1];
			}

			for (int var66 = 0; var66 < var79; var66++) {
				var1 = (byte)(xb.ak_fld[var66] & 0xFF);
				xb.ak_fld[var0.bm_fld[var1 & 255]] = xb.ak_fld[var0.bm_fld[var1 & 255]] | var66 << 8;
				var0.bm_fld[var1 & 255]++;
			}

			var0.ap_fld = xb.ak_fld[var0.ab_fld] >> 8;
			var0.aj_fld = 0;
			var0.ap_fld = xb.ak_fld[var0.ap_fld];
			var0.at_fld = (byte)(var0.ap_fld & 0xFF);
			var0.ap_fld >>= 8;
			var0.aj_fld++;
			var0.bx_fld = var79;
			ag(var0);
			if (var0.aj_fld == var0.bx_fld + 1 && var0.aq_fld == 0) {
				var26 = true;
			} else {
				var26 = false;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void ag(xb var0) {
		byte var2 = var0.ai_fld;
		int var3 = var0.aq_fld;
		int var4 = var0.aj_fld;
		int var5 = var0.at_fld;
		int[] var6 = xb.ak_fld;
		int var7 = var0.ap_fld;
		byte[] var8 = var0.au_fld;
		int var9 = var0.ax_fld;
		int var10 = var0.an_fld;
		int var11 = var10;
		int var12 = var0.bx_fld + 1;

		label111:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label111;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label111;
						}

						var8[var9] = var2;
						var9++;
						var10--;
						break;
					}

					var8[var9] = var2;
					var3--;
					var9++;
					var10--;
				}
			}

			while (var4 != var12) {
				var2 = (byte)var5;
				var7 = var6[var7];
				byte var1 = (byte)var7;
				var7 >>= 8;
				var4++;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label111;
					}

					var8[var9] = var2;
					var9++;
					var10--;
				} else {
					if (var4 != var12) {
						var3 = 2;
						var7 = var6[var7];
						var1 = (byte)var7;
						var7 >>= 8;
						if (++var4 != var12) {
							if (var1 != var5) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte)var7;
								var7 >>= 8;
								if (++var4 != var12) {
									if (var1 != var5) {
										var5 = var1;
									} else {
										var7 = var6[var7];
										var1 = (byte)var7;
										var7 >>= 8;
										var4++;
										var3 = (var1 & 255) + 4;
										var7 = var6[var7];
										var5 = (byte)var7;
										var7 >>= 8;
										var4++;
									}
								}
							}
						}
						continue label111;
					}

					if (var10 == 0) {
						var3 = 1;
						break label111;
					}

					var8[var9] = var2;
					var9++;
					var10--;
				}
			}

			var3 = 0;
			break;
		}

		int var13 = var0.aa_fld;
		var0.aa_fld += (var11 - var10) * 93498257;
		if (var0.aa_fld < var13) {
		}

		var0.ai_fld = var2;
		var0.aq_fld = var3;
		var0.aj_fld = var4;
		var0.at_fld = var5;
		xb.ak_fld = var6;
		var0.ap_fld = var7;
		var0.au_fld = var8;
		var0.ax_fld = var9;
		var0.an_fld = var10;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void au(xb var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.ao_fld = -382637799;
		if (xb.ak_fld == null) {
			xb.ak_fld = new int[var0.ao_fld * -297227529];
		}

		boolean var26 = true;

		while (var26) {
			byte var1 = av(var0);
			if (var1 == 23) {
				return;
			}

			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = ae(var0);
			if (var1 != 0) {
			}

			var0.ab_fld = 0;
			var1 = av(var0);
			var0.ab_fld = (var0.ab_fld << 8 | var1 & -1971084281) * 1171384212;
			var1 = av(var0);
			var0.ab_fld = (var0.ab_fld << 8 | var1 & 255) * -1480137225;
			var1 = av(var0);
			var0.ab_fld = (var0.ab_fld << 8 | var1 & -993561928) * 403264027;

			for (int var56 = 0; var56 < 16; var56++) {
				var1 = ae(var0);
				if (var1 == 1) {
					var0.br_fld[var56] = true;
				} else {
					var0.br_fld[var56] = false;
				}
			}

			for (int var57 = 0; var57 < 256; var57++) {
				var0.bz_fld[var57] = false;
			}

			for (int var58 = 0; var58 < 16; var58++) {
				if (var0.br_fld[var58]) {
					for (int var67 = 0; var67 < 16; var67++) {
						var1 = ae(var0);
						if (var1 == 1) {
							var0.bz_fld[var58 * 16 + var67] = true;
						}
					}
				}
			}

			aw(var0);
			int var71 = var0.bd_fld + 2;
			int var72 = ah(3, var0);
			int var73 = ah(15, var0);

			for (int var59 = 0; var59 < var73; var59++) {
				int var68 = 0;

				while (true) {
					var1 = ae(var0);
					if (var1 == 0) {
						var0.as_fld[var59] = (byte)var68;
						break;
					}

					var68++;
				}
			}

			byte[] var27 = new byte[6];
			byte var29 = 0;

			while (var29 < var72) {
				var27[var29] = var29++;
			}

			for (int var60 = 0; var60 < var73; var60++) {
				var29 = var0.as_fld[var60];

				byte var28;
				for (var28 = var27[var29]; var29 > 0; var29--) {
					var27[var29] = var27[var29 - 1];
				}

				var27[0] = var28;
				var0.ay_fld[var60] = var28;
			}

			for (int var69 = 0; var69 < var72; var69++) {
				int var83 = ah(5, var0);

				for (int var61 = 0; var61 < var71; var61++) {
					while (true) {
						var1 = ae(var0);
						if (var1 == 0) {
							var0.bk_fld[var69][var61] = (byte)var83;
							break;
						}

						var1 = ae(var0);
						if (var1 == 0) {
							var83++;
						} else {
							var83--;
						}
					}
				}
			}

			for (int var70 = 0; var70 < var72; var70++) {
				byte var2 = 32;
				byte var3 = 0;

				for (int var62 = 0; var62 < var71; var62++) {
					if (var0.bk_fld[var70][var62] > var3) {
						var3 = var0.bk_fld[var70][var62];
					}

					if (var0.bk_fld[var70][var62] < var2) {
						var2 = var0.bk_fld[var70][var62];
					}
				}

				ay(var0.by_fld[var70], var0.bj_fld[var70], var0.bf_fld[var70], var0.bk_fld[var70], var2, var3, var71);
				var0.bl_fld[var70] = var2;
			}

			int var74 = var0.bd_fld + 1;
			int var75 = -1;
			int var76 = 0;

			for (int var63 = 0; var63 <= 255; var63++) {
				var0.ac_fld[var63] = 0;
			}

			int var101 = 4095;

			for (int var96 = 15; var96 >= 0; var96--) {
				for (int var98 = 15; var98 >= 0; var98--) {
					var0.bs_fld[var101] = (byte)(var96 * 16 + var98);
					var101--;
				}

				var0.bh_fld[var96] = var101 + 1;
			}

			int var79 = 0;
			if (var76 == 0) {
				var75++;
				var76 = 521983303;
				byte var93 = var0.ay_fld[var75];
				var22 = var0.bl_fld[var93];
				var23 = var0.by_fld[var93];
				var25 = var0.bf_fld[var93];
				var24 = var0.bj_fld[var93];
			}

			var76--;
			int var84 = var22;
			int var87 = ah(var22, var0);

			while (var87 > var23[var84]) {
				var84++;
				byte var90 = ae(var0);
				var87 = var87 << 1 | var90;
			}

			int var78 = var25[var87 - var24[var84]];

			while (var78 != var74) {
				if (var78 != 0 && var78 != 1) {
					int var33 = var78 - 1;
					if (var33 < 16) {
						int var103 = var0.bh_fld[0];

						for (var1 = var0.bs_fld[var103 + var33]; var33 > 3; var33 -= 4) {
							int var34 = var103 + var33;
							var0.bs_fld[var34] = var0.bs_fld[var34 - 1];
							var0.bs_fld[var34 - 1] = var0.bs_fld[var34 - 2];
							var0.bs_fld[var34 - 2] = var0.bs_fld[var34 - 3];
							var0.bs_fld[var34 - 3] = var0.bs_fld[var34 - 4];
						}

						while (var33 > 0) {
							var0.bs_fld[var103 + var33] = var0.bs_fld[var103 + var33 - 1];
							var33--;
						}

						var0.bs_fld[var103] = var1;
					} else {
						int var31 = var33 / 16;
						int var32 = var33 % 16;
						int var30 = var0.bh_fld[var31] + var32;

						for (var1 = var0.bs_fld[var30]; var30 > var0.bh_fld[var31]; var30--) {
							var0.bs_fld[var30] = var0.bs_fld[var30 - 1];
						}

						var0.bh_fld[var31]++;

						while (var31 > 0) {
							var0.bh_fld[var31]--;
							var0.bs_fld[var0.bh_fld[var31]] = var0.bs_fld[var0.bh_fld[var31 - 1] + 16 - 1];
							var31--;
						}

						var0.bh_fld[0]--;
						var0.bs_fld[var0.bh_fld[0]] = var1;
						if (var0.bh_fld[0] == 0) {
							var101 = 1137232113;

							for (int var97 = 15; var97 >= 0; var97--) {
								for (int var99 = 15; var99 >= 0; var99--) {
									var0.bs_fld[var101] = var0.bs_fld[var0.bh_fld[var97] + var99];
									var101--;
								}

								var0.bh_fld[var97] = var101 + 1;
							}
						}
					}

					var0.ac_fld[var0.be_fld[var1 & 255] & 1634516428]++;
					xb.ak_fld[var79] = var0.be_fld[var1 & 255] & 255;
					var79++;
					if (var76 == 0) {
						var75++;
						var76 = 1654654941;
						byte var95 = var0.ay_fld[var75];
						var22 = var0.bl_fld[var95];
						var23 = var0.by_fld[var95];
						var25 = var0.bf_fld[var95];
						var24 = var0.bj_fld[var95];
					}

					var76--;
					var84 = var22;
					var87 = ah(var22, var0);

					while (var87 > var23[var84]) {
						var84++;
						byte var92 = ae(var0);
						var87 = var87 << 1 | var92;
					}

					var78 = var25[var87 - var24[var84]];
				} else {
					int var80 = -1;
					byte var82 = 1;

					do {
						if (var78 == 0) {
							var80 += 1 * var82;
						} else if (var78 == 1) {
							var80 += 2 * var82;
						}

						var82 *= 2;
						if (var76 == 0) {
							var75++;
							var76 = 696249934;
							byte var94 = var0.ay_fld[var75];
							var22 = var0.bl_fld[var94];
							var23 = var0.by_fld[var94];
							var25 = var0.bf_fld[var94];
							var24 = var0.bj_fld[var94];
						}

						var76--;
						var84 = var22;
						var87 = ah(var22, var0);

						while (var87 > var23[var84]) {
							var84++;
							byte var91 = ae(var0);
							var87 = var87 << 1 | var91;
						}

						var78 = var25[var87 - var24[var84]];
					} while (var78 == 0 || var78 == 1);

					var80++;
					var1 = var0.be_fld[var0.bs_fld[var0.bh_fld[0]] & 255];

					for (var0.ac_fld[var1 & 255] = var0.ac_fld[var1 & 255] + var80; var80 > 0; var80--) {
						xb.ak_fld[var79] = var1 & 255;
						var79++;
					}
				}
			}

			var0.aq_fld = 0;
			var0.ai_fld = 0;
			var0.bm_fld[0] = 0;

			for (int var64 = 1; var64 <= 256; var64++) {
				var0.bm_fld[var64] = var0.ac_fld[var64 - 1];
			}

			for (int var65 = 1; var65 <= 508584722; var65++) {
				var0.bm_fld[var65] = var0.bm_fld[var65] + var0.bm_fld[var65 - 1];
			}

			for (int var66 = 0; var66 < var79; var66++) {
				var1 = (byte)(xb.ak_fld[var66] & 0xFF);
				xb.ak_fld[var0.bm_fld[var1 & 255]] = xb.ak_fld[var0.bm_fld[var1 & 255]] | var66 << 8;
				var0.bm_fld[var1 & 255]++;
			}

			var0.ap_fld = (xb.ak_fld[var0.ab_fld] >> 8) * -414671816;
			var0.aj_fld = 0;
			var0.ap_fld = xb.ak_fld[var0.ap_fld];
			var0.at_fld = (byte)(var0.ap_fld & -58582695) * 454401022;
			var0.ap_fld = (var0.ap_fld >> 8) * 1436067880;
			var0.aj_fld++;
			var0.bx_fld = var79 * 958090221;
			ag(var0);
			if (var0.aj_fld == var0.bx_fld + 1 && var0.aq_fld == 0) {
				var26 = true;
			} else {
				var26 = false;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)B"
	)
	static byte ae(xb var0) {
		return (byte)ah(1, var0);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILxb;)I"
	)
	static int ah(int var0, xb var1) {
		while (var1.ad_fld < var0) {
			var1.am_fld = var1.am_fld << 8 | var1.ar_fld[var1.af_fld] & 255;
			var1.ad_fld += 8;
			var1.af_fld++;
			var1.al_fld++;
			if (var1.al_fld == 0) {
			}
		}

		int var2 = var1.am_fld >> var1.ad_fld - var0 & (1 << var0) - 1;
		var1.ad_fld -= var0 * -2109787045;
		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void aw(xb var0) {
		var0.bd_fld = 0;

		for (int var1 = 0; var1 < 256; var1++) {
			if (var0.bz_fld[var1]) {
				var0.be_fld[var0.bd_fld] = (byte)var1;
				var0.bd_fld++;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[I[I[BIII)V"
	)
	static void ay(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		for (int var8 = var4; var8 <= var5; var8++) {
			for (int var9 = 0; var9 < var6; var9++) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					var7++;
				}
			}
		}

		for (int var11 = 0; var11 < 23; var11++) {
			var1[var11] = 0;
		}

		for (int var12 = 0; var12 < var6; var12++) {
			var1[var3[var12] + 1]++;
		}

		for (int var13 = 1; var13 < 23; var13++) {
			var1[var13] += var1[var13 - 1];
		}

		for (int var14 = 0; var14 < 23; var14++) {
			var0[var14] = 0;
		}

		int var10 = 0;

		for (int var15 = var4; var15 <= var5; var15++) {
			var10 += var1[var15 + 1] - var1[var15];
			var0[var15] = var10 - 1;
			var10 <<= 1;
		}

		for (int var16 = var4 + 1; var16 <= var5; var16++) {
			var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)I"
	)
	public static int af(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (ay_fld) {
			ay_fld.ar_fld = var2;
			ay_fld.af_fld = var4;
			ay_fld.au_fld = var0;
			ay_fld.ax_fld = 0;
			ay_fld.an_fld = var1;
			ay_fld.ad_fld = 0;
			ay_fld.am_fld = 0;
			ay_fld.al_fld = 0;
			ay_fld.aa_fld = 0;
			az(ay_fld);
			var1 -= ay_fld.an_fld;
			ay_fld.ar_fld = null;
			ay_fld.au_fld = null;
			return var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)I"
	)
	public static int as(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (ay_fld) {
			ay_fld.ar_fld = var2;
			ay_fld.af_fld = var4;
			ay_fld.au_fld = var0;
			ay_fld.ax_fld = 0;
			ay_fld.an_fld = var1;
			ay_fld.ad_fld = 0;
			ay_fld.am_fld = 0;
			ay_fld.al_fld = 0;
			ay_fld.aa_fld = 0;
			az(ay_fld);
			var1 -= ay_fld.an_fld;
			ay_fld.ar_fld = null;
			ay_fld.au_fld = null;
			return var1;
		}
	}

	xn() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)B"
	)
	static byte av(xb var0) {
		return (byte)ah(8, var0);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void az(xb var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.ao_fld = -382637799;
		if (xb.ak_fld == null) {
			xb.ak_fld = new int[var0.ao_fld * -188846176];
		}

		boolean var26 = true;

		while (var26) {
			byte var1 = av(var0);
			if (var1 == 23) {
				return;
			}

			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = ae(var0);
			if (var1 != 0) {
			}

			var0.ab_fld = 0;
			var1 = av(var0);
			var0.ab_fld = var0.ab_fld << 8 | var1 & 255;
			var1 = av(var0);
			var0.ab_fld = var0.ab_fld << 8 | var1 & 255;
			var1 = av(var0);
			var0.ab_fld = var0.ab_fld << 8 | var1 & 255;

			for (int var56 = 0; var56 < 16; var56++) {
				var1 = ae(var0);
				if (var1 == 1) {
					var0.br_fld[var56] = true;
				} else {
					var0.br_fld[var56] = false;
				}
			}

			for (int var57 = 0; var57 < 256; var57++) {
				var0.bz_fld[var57] = false;
			}

			for (int var58 = 0; var58 < 16; var58++) {
				if (var0.br_fld[var58]) {
					for (int var67 = 0; var67 < 16; var67++) {
						var1 = ae(var0);
						if (var1 == 1) {
							var0.bz_fld[var58 * 16 + var67] = true;
						}
					}
				}
			}

			aw(var0);
			int var71 = var0.bd_fld + 2;
			int var72 = ah(3, var0);
			int var73 = ah(15, var0);

			for (int var59 = 0; var59 < var73; var59++) {
				int var68 = 0;

				while (true) {
					var1 = ae(var0);
					if (var1 == 0) {
						var0.as_fld[var59] = (byte)var68;
						break;
					}

					var68++;
				}
			}

			byte[] var27 = new byte[6];
			byte var29 = 0;

			while (var29 < var72) {
				var27[var29] = var29++;
			}

			for (int var60 = 0; var60 < var73; var60++) {
				var29 = var0.as_fld[var60];

				byte var28;
				for (var28 = var27[var29]; var29 > 0; var29--) {
					var27[var29] = var27[var29 - 1];
				}

				var27[0] = var28;
				var0.ay_fld[var60] = var28;
			}

			for (int var69 = 0; var69 < var72; var69++) {
				int var83 = ah(5, var0);

				for (int var61 = 0; var61 < var71; var61++) {
					while (true) {
						var1 = ae(var0);
						if (var1 == 0) {
							var0.bk_fld[var69][var61] = (byte)var83;
							break;
						}

						var1 = ae(var0);
						if (var1 == 0) {
							var83++;
						} else {
							var83--;
						}
					}
				}
			}

			for (int var70 = 0; var70 < var72; var70++) {
				byte var2 = 32;
				byte var3 = 0;

				for (int var62 = 0; var62 < var71; var62++) {
					if (var0.bk_fld[var70][var62] > var3) {
						var3 = var0.bk_fld[var70][var62];
					}

					if (var0.bk_fld[var70][var62] < var2) {
						var2 = var0.bk_fld[var70][var62];
					}
				}

				ay(var0.by_fld[var70], var0.bj_fld[var70], var0.bf_fld[var70], var0.bk_fld[var70], var2, var3, var71);
				var0.bl_fld[var70] = var2;
			}

			int var74 = var0.bd_fld + 1;
			int var75 = -1;
			int var76 = 0;

			for (int var63 = 0; var63 <= 255; var63++) {
				var0.ac_fld[var63] = 0;
			}

			int var101 = 4095;

			for (int var96 = 15; var96 >= 0; var96--) {
				for (int var98 = 15; var98 >= 0; var98--) {
					var0.bs_fld[var101] = (byte)(var96 * 16 + var98);
					var101--;
				}

				var0.bh_fld[var96] = var101 + 1;
			}

			int var79 = 0;
			if (var76 == 0) {
				var75++;
				var76 = 50;
				byte var93 = var0.ay_fld[var75];
				var22 = var0.bl_fld[var93];
				var23 = var0.by_fld[var93];
				var25 = var0.bf_fld[var93];
				var24 = var0.bj_fld[var93];
			}

			var76--;
			int var84 = var22;
			int var87 = ah(var22, var0);

			while (var87 > var23[var84]) {
				var84++;
				byte var90 = ae(var0);
				var87 = var87 << 1 | var90;
			}

			int var78 = var25[var87 - var24[var84]];

			while (var78 != var74) {
				if (var78 != 0 && var78 != 1) {
					int var33 = var78 - 1;
					if (var33 < 16) {
						int var103 = var0.bh_fld[0];

						for (var1 = var0.bs_fld[var103 + var33]; var33 > 3; var33 -= 4) {
							int var34 = var103 + var33;
							var0.bs_fld[var34] = var0.bs_fld[var34 - 1];
							var0.bs_fld[var34 - 1] = var0.bs_fld[var34 - 2];
							var0.bs_fld[var34 - 2] = var0.bs_fld[var34 - 3];
							var0.bs_fld[var34 - 3] = var0.bs_fld[var34 - 4];
						}

						while (var33 > 0) {
							var0.bs_fld[var103 + var33] = var0.bs_fld[var103 + var33 - 1];
							var33--;
						}

						var0.bs_fld[var103] = var1;
					} else {
						int var31 = var33 / 16;
						int var32 = var33 % 16;
						int var30 = var0.bh_fld[var31] + var32;

						for (var1 = var0.bs_fld[var30]; var30 > var0.bh_fld[var31]; var30--) {
							var0.bs_fld[var30] = var0.bs_fld[var30 - 1];
						}

						var0.bh_fld[var31]++;

						while (var31 > 0) {
							var0.bh_fld[var31]--;
							var0.bs_fld[var0.bh_fld[var31]] = var0.bs_fld[var0.bh_fld[var31 - 1] + 16 - 1];
							var31--;
						}

						var0.bh_fld[0]--;
						var0.bs_fld[var0.bh_fld[0]] = var1;
						if (var0.bh_fld[0] == 0) {
							var101 = 4095;

							for (int var97 = 15; var97 >= 0; var97--) {
								for (int var99 = 15; var99 >= 0; var99--) {
									var0.bs_fld[var101] = var0.bs_fld[var0.bh_fld[var97] + var99];
									var101--;
								}

								var0.bh_fld[var97] = var101 + 1;
							}
						}
					}

					var0.ac_fld[var0.be_fld[var1 & 255] & 255]++;
					xb.ak_fld[var79] = var0.be_fld[var1 & 255] & 255;
					var79++;
					if (var76 == 0) {
						var75++;
						var76 = 50;
						byte var95 = var0.ay_fld[var75];
						var22 = var0.bl_fld[var95];
						var23 = var0.by_fld[var95];
						var25 = var0.bf_fld[var95];
						var24 = var0.bj_fld[var95];
					}

					var76--;
					var84 = var22;
					var87 = ah(var22, var0);

					while (var87 > var23[var84]) {
						var84++;
						byte var92 = ae(var0);
						var87 = var87 << 1 | var92;
					}

					var78 = var25[var87 - var24[var84]];
				} else {
					int var80 = -1;
					byte var82 = 1;

					do {
						if (var78 == 0) {
							var80 += 1 * var82;
						} else if (var78 == 1) {
							var80 += 2 * var82;
						}

						var82 *= 2;
						if (var76 == 0) {
							var75++;
							var76 = 50;
							byte var94 = var0.ay_fld[var75];
							var22 = var0.bl_fld[var94];
							var23 = var0.by_fld[var94];
							var25 = var0.bf_fld[var94];
							var24 = var0.bj_fld[var94];
						}

						var76--;
						var84 = var22;
						var87 = ah(var22, var0);

						while (var87 > var23[var84]) {
							var84++;
							byte var91 = ae(var0);
							var87 = var87 << 1 | var91;
						}

						var78 = var25[var87 - var24[var84]];
					} while (var78 == 0 || var78 == 1);

					var80++;
					var1 = var0.be_fld[var0.bs_fld[var0.bh_fld[0]] & 255];

					for (var0.ac_fld[var1 & 255] = var0.ac_fld[var1 & 255] + var80; var80 > 0; var80--) {
						xb.ak_fld[var79] = var1 & 255;
						var79++;
					}
				}
			}

			var0.aq_fld = 0;
			var0.ai_fld = 0;
			var0.bm_fld[0] = 0;

			for (int var64 = 1; var64 <= 256; var64++) {
				var0.bm_fld[var64] = var0.ac_fld[var64 - 1];
			}

			for (int var65 = 1; var65 <= 256; var65++) {
				var0.bm_fld[var65] = var0.bm_fld[var65] + var0.bm_fld[var65 - 1];
			}

			for (int var66 = 0; var66 < var79; var66++) {
				var1 = (byte)(xb.ak_fld[var66] & 0xFF);
				xb.ak_fld[var0.bm_fld[var1 & 255]] = xb.ak_fld[var0.bm_fld[var1 & 255]] | var66 << 8;
				var0.bm_fld[var1 & 255]++;
			}

			var0.ap_fld = xb.ak_fld[var0.ab_fld] >> 8;
			var0.aj_fld = 0;
			var0.ap_fld = xb.ak_fld[var0.ap_fld];
			var0.at_fld = (byte)(var0.ap_fld & 0xFF);
			var0.ap_fld >>= 8;
			var0.aj_fld++;
			var0.bx_fld = var79;
			ag(var0);
			if (var0.aj_fld == var0.bx_fld + 1 && var0.aq_fld == 0) {
				var26 = true;
			} else {
				var26 = false;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void al(xb var0) {
		byte var2 = var0.ai_fld;
		int var3 = var0.aq_fld;
		int var4 = var0.aj_fld;
		int var5 = var0.at_fld;
		int[] var6 = xb.ak_fld;
		int var7 = var0.ap_fld;
		byte[] var8 = var0.au_fld;
		int var9 = var0.ax_fld;
		int var10 = var0.an_fld;
		int var11 = var10;
		int var12 = var0.bx_fld + 1;

		label109:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label109;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label109;
						}

						var8[var9] = var2;
						var9++;
						var10--;
						break;
					}

					var8[var9] = var2;
					var3--;
					var9++;
					var10--;
				}
			}

			while (var4 != var12) {
				var2 = (byte)var5;
				var7 = var6[var7];
				byte var1 = (byte)var7;
				var7 >>= 8;
				var4++;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label109;
					}

					var8[var9] = var2;
					var9++;
					var10--;
				} else {
					if (var4 != var12) {
						var3 = 2;
						var7 = var6[var7];
						var1 = (byte)var7;
						var7 >>= 8;
						if (++var4 != var12) {
							if (var1 != var5) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte)var7;
								var7 >>= 8;
								if (++var4 != var12) {
									if (var1 != var5) {
										var5 = var1;
									} else {
										var7 = var6[var7];
										var1 = (byte)var7;
										var7 >>= 8;
										var4++;
										var3 = (var1 & 255) + 4;
										var7 = var6[var7];
										var5 = (byte)var7;
										var7 >>= 8;
										var4++;
									}
								}
							}
						}
						continue label109;
					}

					if (var10 == 0) {
						var3 = 1;
						break label109;
					}

					var8[var9] = var2;
					var9++;
					var10--;
				}
			}

			var3 = 0;
			break;
		}

		int var13 = var0.aa_fld;
		var0.aa_fld += (var11 - var10) * 93498257;
		if (var0.aa_fld < var13) {
		}

		var0.ai_fld = var2;
		var0.aq_fld = var3;
		var0.aj_fld = var4;
		var0.at_fld = var5;
		xb.ak_fld = var6;
		var0.ap_fld = var7;
		var0.au_fld = var8;
		var0.ax_fld = var9;
		var0.an_fld = var10;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void ax(xb var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.ao_fld = 1458940846;
		if (xb.ak_fld == null) {
			xb.ak_fld = new int[var0.ao_fld * -188846176];
		}

		boolean var26 = true;

		while (var26) {
			byte var1 = av(var0);
			if (var1 == 23) {
				return;
			}

			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = av(var0);
			var1 = ae(var0);
			if (var1 != 0) {
			}

			var0.ab_fld = 0;
			var1 = av(var0);
			var0.ab_fld = var0.ab_fld << 8 | var1 & -484238911;
			var1 = av(var0);
			var0.ab_fld = var0.ab_fld << 8 | var1 & 255;
			var1 = av(var0);
			var0.ab_fld = (var0.ab_fld << 8 | var1 & 255) * -2074103556;

			for (int var56 = 0; var56 < 16; var56++) {
				var1 = ae(var0);
				if (var1 == 1) {
					var0.br_fld[var56] = true;
				} else {
					var0.br_fld[var56] = false;
				}
			}

			for (int var57 = 0; var57 < 1348075515; var57++) {
				var0.bz_fld[var57] = false;
			}

			for (int var58 = 0; var58 < 16; var58++) {
				if (var0.br_fld[var58]) {
					for (int var67 = 0; var67 < 16; var67++) {
						var1 = ae(var0);
						if (var1 == 1) {
							var0.bz_fld[var58 * 16 + var67] = true;
						}
					}
				}
			}

			aw(var0);
			int var71 = var0.bd_fld + 2;
			int var72 = ah(3, var0);
			int var73 = ah(15, var0);

			for (int var59 = 0; var59 < var73; var59++) {
				int var68 = 0;

				while (true) {
					var1 = ae(var0);
					if (var1 == 0) {
						var0.as_fld[var59] = (byte)var68;
						break;
					}

					var68++;
				}
			}

			byte[] var27 = new byte[6];
			byte var29 = 0;

			while (var29 < var72) {
				var27[var29] = var29++;
			}

			for (int var60 = 0; var60 < var73; var60++) {
				var29 = var0.as_fld[var60];

				byte var28;
				for (var28 = var27[var29]; var29 > 0; var29--) {
					var27[var29] = var27[var29 - 1];
				}

				var27[0] = var28;
				var0.ay_fld[var60] = var28;
			}

			for (int var69 = 0; var69 < var72; var69++) {
				int var83 = ah(5, var0);

				for (int var61 = 0; var61 < var71; var61++) {
					while (true) {
						var1 = ae(var0);
						if (var1 == 0) {
							var0.bk_fld[var69][var61] = (byte)var83;
							break;
						}

						var1 = ae(var0);
						if (var1 == 0) {
							var83++;
						} else {
							var83--;
						}
					}
				}
			}

			for (int var70 = 0; var70 < var72; var70++) {
				int var2 = -756512660;
				byte var3 = 0;

				for (int var62 = 0; var62 < var71; var62++) {
					if (var0.bk_fld[var70][var62] > var3) {
						var3 = var0.bk_fld[var70][var62];
					}

					if (var0.bk_fld[var70][var62] < var2) {
						var2 = var0.bk_fld[var70][var62];
					}
				}

				ay(var0.by_fld[var70], var0.bj_fld[var70], var0.bf_fld[var70], var0.bk_fld[var70], var2, var3, var71);
				var0.bl_fld[var70] = var2;
			}

			int var74 = var0.bd_fld + 1;
			int var75 = -1;
			int var76 = 0;

			for (int var63 = 0; var63 <= 1030863467; var63++) {
				var0.ac_fld[var63] = 0;
			}

			int var101 = 62956349;

			for (int var96 = 15; var96 >= 0; var96--) {
				for (int var98 = 15; var98 >= 0; var98--) {
					var0.bs_fld[var101] = (byte)(var96 * 16 + var98);
					var101--;
				}

				var0.bh_fld[var96] = var101 + 1;
			}

			int var79 = 0;
			if (var76 == 0) {
				var75++;
				var76 = 1798486352;
				byte var93 = var0.ay_fld[var75];
				var22 = var0.bl_fld[var93];
				var23 = var0.by_fld[var93];
				var25 = var0.bf_fld[var93];
				var24 = var0.bj_fld[var93];
			}

			var76--;
			int var84 = var22;
			int var87 = ah(var22, var0);

			while (var87 > var23[var84]) {
				var84++;
				byte var90 = ae(var0);
				var87 = var87 << 1 | var90;
			}

			int var78 = var25[var87 - var24[var84]];

			while (var78 != var74) {
				if (var78 != 0 && var78 != 1) {
					int var33 = var78 - 1;
					if (var33 < 16) {
						int var103 = var0.bh_fld[0];

						for (var1 = var0.bs_fld[var103 + var33]; var33 > 3; var33 -= 4) {
							int var34 = var103 + var33;
							var0.bs_fld[var34] = var0.bs_fld[var34 - 1];
							var0.bs_fld[var34 - 1] = var0.bs_fld[var34 - 2];
							var0.bs_fld[var34 - 2] = var0.bs_fld[var34 - 3];
							var0.bs_fld[var34 - 3] = var0.bs_fld[var34 - 4];
						}

						while (var33 > 0) {
							var0.bs_fld[var103 + var33] = var0.bs_fld[var103 + var33 - 1];
							var33--;
						}

						var0.bs_fld[var103] = var1;
					} else {
						int var31 = var33 / 16;
						int var32 = var33 % 16;
						int var30 = var0.bh_fld[var31] + var32;

						for (var1 = var0.bs_fld[var30]; var30 > var0.bh_fld[var31]; var30--) {
							var0.bs_fld[var30] = var0.bs_fld[var30 - 1];
						}

						var0.bh_fld[var31]++;

						while (var31 > 0) {
							var0.bh_fld[var31]--;
							var0.bs_fld[var0.bh_fld[var31]] = var0.bs_fld[var0.bh_fld[var31 - 1] + 16 - 1];
							var31--;
						}

						var0.bh_fld[0]--;
						var0.bs_fld[var0.bh_fld[0]] = var1;
						if (var0.bh_fld[0] == 0) {
							var101 = 537825058;

							for (int var97 = 15; var97 >= 0; var97--) {
								for (int var99 = 15; var99 >= 0; var99--) {
									var0.bs_fld[var101] = var0.bs_fld[var0.bh_fld[var97] + var99];
									var101--;
								}

								var0.bh_fld[var97] = var101 + 1;
							}
						}
					}

					var0.ac_fld[var0.be_fld[var1 & -1180463070] & 255]++;
					xb.ak_fld[var79] = var0.be_fld[var1 & 255] & -676993143;
					var79++;
					if (var76 == 0) {
						var75++;
						var76 = 1606101488;
						byte var95 = var0.ay_fld[var75];
						var22 = var0.bl_fld[var95];
						var23 = var0.by_fld[var95];
						var25 = var0.bf_fld[var95];
						var24 = var0.bj_fld[var95];
					}

					var76--;
					var84 = var22;
					var87 = ah(var22, var0);

					while (var87 > var23[var84]) {
						var84++;
						byte var92 = ae(var0);
						var87 = var87 << 1 | var92;
					}

					var78 = var25[var87 - var24[var84]];
				} else {
					int var80 = -1;
					byte var82 = 1;

					do {
						if (var78 == 0) {
							var80 += 1 * var82;
						} else if (var78 == 1) {
							var80 += 2 * var82;
						}

						var82 *= 2;
						if (var76 == 0) {
							var75++;
							var76 = -1808725832;
							byte var94 = var0.ay_fld[var75];
							var22 = var0.bl_fld[var94];
							var23 = var0.by_fld[var94];
							var25 = var0.bf_fld[var94];
							var24 = var0.bj_fld[var94];
						}

						var76--;
						var84 = var22;
						var87 = ah(var22, var0);

						while (var87 > var23[var84]) {
							var84++;
							byte var91 = ae(var0);
							var87 = var87 << 1 | var91;
						}

						var78 = var25[var87 - var24[var84]];
					} while (var78 == 0 || var78 == 1);

					var80++;
					var1 = var0.be_fld[var0.bs_fld[var0.bh_fld[0]] & -1005719710];

					for (var0.ac_fld[var1 & -42648362] = var0.ac_fld[var1 & -42648362] + var80; var80 > 0; var80--) {
						xb.ak_fld[var79] = var1 & 255;
						var79++;
					}
				}
			}

			var0.aq_fld = 0;
			var0.ai_fld = 0;
			var0.bm_fld[0] = 0;

			for (int var64 = 1; var64 <= 256; var64++) {
				var0.bm_fld[var64] = var0.ac_fld[var64 - 1];
			}

			for (int var65 = 1; var65 <= 107413457; var65++) {
				var0.bm_fld[var65] = var0.bm_fld[var65] + var0.bm_fld[var65 - 1];
			}

			for (int var66 = 0; var66 < var79; var66++) {
				var1 = (byte)(xb.ak_fld[var66] & 0xFF);
				xb.ak_fld[var0.bm_fld[var1 & 255]] = xb.ak_fld[var0.bm_fld[var1 & 255]] | var66 << 8;
				var0.bm_fld[var1 & -277511656]++;
			}

			var0.ap_fld = xb.ak_fld[var0.ab_fld] >> 8;
			var0.aj_fld = 0;
			var0.ap_fld = xb.ak_fld[var0.ap_fld * 1619397794];
			var0.at_fld = (byte)(var0.ap_fld & 0xFF);
			var0.ap_fld = (var0.ap_fld >> 8) * -1368108900;
			var0.aj_fld++;
			var0.bx_fld = var79;
			ag(var0);
			if (var0.aj_fld == var0.bx_fld + 1 && var0.aq_fld * 1587285494 == 0) {
				var26 = true;
			} else {
				var26 = false;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)B"
	)
	static byte aa(xb var0) {
		return (byte)ah(8, var0);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BI[BII)I"
	)
	public static int ar(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (ay_fld) {
			ay_fld.ar_fld = var2;
			ay_fld.af_fld = var4;
			ay_fld.au_fld = var0;
			ay_fld.ax_fld = 0;
			ay_fld.an_fld = var1;
			ay_fld.ad_fld = 0;
			ay_fld.am_fld = 0;
			ay_fld.al_fld = 0;
			ay_fld.aa_fld = 0;
			az(ay_fld);
			var1 -= ay_fld.an_fld;
			ay_fld.ar_fld = null;
			ay_fld.au_fld = null;
			return var1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)B"
	)
	static byte ai(xb var0) {
		return (byte)ah(1, var0);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)B"
	)
	static byte am(xb var0) {
		return (byte)ah(1, var0);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILxb;)I"
	)
	static int ad(int var0, xb var1) {
		while (var1.ad_fld < var0) {
			var1.am_fld = var1.am_fld << 8 | var1.ar_fld[var1.af_fld * 2058021722] & 255;
			var1.ad_fld += 8;
			var1.af_fld++;
			var1.al_fld++;
			if (var1.al_fld == 0) {
			}
		}

		int var2 = var1.am_fld >> var1.ad_fld - var0 & (1 << var0) - 1;
		var1.ad_fld -= var0 * 1762248376;
		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void ao(xb var0) {
		var0.bd_fld = 0;

		for (int var1 = 0; var1 < 256; var1++) {
			if (var0.bz_fld[var1]) {
				var0.be_fld[var0.bd_fld] = (byte)var1;
				var0.bd_fld++;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lxb;)V"
	)
	static void ab(xb var0) {
		var0.bd_fld = 0;

		for (int var1 = 0; var1 < 256; var1++) {
			if (var0.bz_fld[var1]) {
				var0.be_fld[var0.bd_fld] = (byte)var1;
				var0.bd_fld++;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([I[I[I[BIII)V"
	)
	static void ap(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		for (int var8 = var4; var8 <= var5; var8++) {
			for (int var9 = 0; var9 < var6; var9++) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					var7++;
				}
			}
		}

		for (int var11 = 0; var11 < 23; var11++) {
			var1[var11] = 0;
		}

		for (int var12 = 0; var12 < var6; var12++) {
			var1[var3[var12] + 1]++;
		}

		for (int var13 = 1; var13 < 23; var13++) {
			var1[var13] += var1[var13 - 1];
		}

		for (int var14 = 0; var14 < 23; var14++) {
			var0[var14] = 0;
		}

		int var10 = 0;

		for (int var15 = var4; var15 <= var5; var15++) {
			var10 += var1[var15 + 1] - var1[var15];
			var0[var15] = var10 - 1;
			var10 <<= 1;
		}

		for (int var16 = var4 + 1; var16 <= var5; var16++) {
			var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[I[I[BIII)V"
	)
	static void at(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		for (int var8 = var4; var8 <= var5; var8++) {
			for (int var9 = 0; var9 < var6; var9++) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					var7++;
				}
			}
		}

		for (int var11 = 0; var11 < 23; var11++) {
			var1[var11] = 0;
		}

		for (int var12 = 0; var12 < var6; var12++) {
			var1[var3[var12] + 1]++;
		}

		for (int var13 = 1; var13 < 23; var13++) {
			var1[var13] += var1[var13 - 1];
		}

		for (int var14 = 0; var14 < 23; var14++) {
			var0[var14] = 0;
		}

		int var10 = 0;

		for (int var15 = var4; var15 <= var5; var15++) {
			var10 += var1[var15 + 1] - var1[var15];
			var0[var15] = var10 - 1;
			var10 <<= 1;
		}

		for (int var16 = var4 + 1; var16 <= var5; var16++) {
			var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
		}
	}
}
