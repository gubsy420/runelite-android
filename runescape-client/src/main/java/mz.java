import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("mz")
public class mz extends vw {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	xz ak_fld = new xz(16);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] ag_fld;

	mz(xi var1) {
		var1.au_fld = var1.al_fld.length - 3;
		int var2 = var1.cg();
		int var3 = xi.tx(var1, 1293187923);
		int var4 = 14 + var2 * 10;
		var1.au_fld = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		int var12 = 0;

		for (int var13 = 0; var13 < var2; var13++) {
			int var14 = -1;

			while (true) {
				int var15 = var1.cg();
				if (var15 != var14) {
					var4++;
				}

				var14 = var15 & 15;
				if (var15 == 7) {
					break;
				}

				if (var15 == 23) {
					var5++;
				} else if (var14 == 0) {
					var7++;
				} else if (var14 == 1) {
					var8++;
				} else if (var14 == 2) {
					var6++;
				} else if (var14 == 3) {
					var9++;
				} else if (var14 == 4) {
					var10++;
				} else if (var14 == 5) {
					var11++;
				} else {
					if (var14 != 6) {
						throw new RuntimeException();
					}

					var12++;
				}
			}
		}

		var4 += 5 * var5;
		var4 += 2 * (var7 + var8 + var6 + var9 + var11);
		var4 += var10 + var12;
		int var78 = var1.au_fld;
		int var79 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

		for (int var80 = 0; var80 < var79; var80++) {
			var1.dd();
		}

		var4 += var1.au_fld - var78;
		int var81 = var1.au_fld;
		int var16 = 0;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		int var22 = 0;
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28 = 0;

		for (int var29 = 0; var29 < var6; var29++) {
			var28 = var28 + var1.cg() & 127;
			if (var28 == 0 || var28 == 32) {
				var12++;
			} else if (var28 == 1) {
				var16++;
			} else if (var28 == 33) {
				var17++;
			} else if (var28 == 7) {
				var18++;
			} else if (var28 == 39) {
				var19++;
			} else if (var28 == 10) {
				var20++;
			} else if (var28 == 42) {
				var21++;
			} else if (var28 == 99) {
				var22++;
			} else if (var28 == 98) {
				var23++;
			} else if (var28 == 101) {
				var24++;
			} else if (var28 == 100) {
				var25++;
			} else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
				var27++;
			} else {
				var26++;
			}
		}

		int var83 = 0;
		int var30 = var1.au_fld;
		var1.au_fld += var26 * 228932457;
		int var31 = var1.au_fld;
		var1.au_fld += var11 * 228932457;
		int var32 = var1.au_fld;
		var1.au_fld += var10 * 228932457;
		int var33 = var1.au_fld;
		var1.au_fld += var9 * 228932457;
		int var34 = var1.au_fld;
		var1.au_fld += var16 * 228932457;
		int var35 = var1.au_fld;
		var1.au_fld += var18 * 228932457;
		int var36 = var1.au_fld;
		var1.au_fld += var20 * 228932457;
		int var37 = var1.au_fld;
		var1.au_fld += (var7 + var8 + var11) * 228932457;
		int var38 = var1.au_fld;
		var1.au_fld += var7 * 228932457;
		int var39 = var1.au_fld;
		var1.au_fld += var27 * 228932457;
		int var40 = var1.au_fld;
		var1.au_fld += var8 * 228932457;
		int var41 = var1.au_fld;
		var1.au_fld += var17 * 228932457;
		int var42 = var1.au_fld;
		var1.au_fld += var19 * 228932457;
		int var43 = var1.au_fld;
		var1.au_fld += var21 * 228932457;
		int var44 = var1.au_fld;
		var1.au_fld += var12 * 228932457;
		int var45 = var1.au_fld;
		var1.au_fld += var9 * 228932457;
		int var46 = var1.au_fld;
		var1.au_fld += var22 * 228932457;
		int var47 = var1.au_fld;
		var1.au_fld += var23 * 228932457;
		int var48 = var1.au_fld;
		var1.au_fld += var24 * 228932457;
		int var49 = var1.au_fld;
		var1.au_fld += var25 * 228932457;
		int var50 = var1.au_fld;
		var1.au_fld += var5 * 686797371;
		this.ag_fld = new byte[var4];
		xi var51 = new xi(this.ag_fld);
		xi.ld(var51, 1297377380, (byte)88);
		xi.ld(var51, 6, (byte)92);
		var51.bw(var2 > 1 ? 1 : 0);
		var51.bw(var2);
		var51.bw(var3);
		var1.au_fld = var78;
		int var52 = 0;
		byte var53 = 0;
		byte var54 = 0;
		byte var55 = 0;
		int var56 = 0;
		byte var57 = 0;
		byte var58 = 0;
		int[] var59 = new int[128];
		var28 = 0;
		int[] var60 = new int[16];
		int[] var61 = new int[16];
		var61[9] = 128;
		var60[9] = 128;

		for (int var63 = 0; var63 < var2; var63++) {
			xi.ld(var51, 1297379947, (byte)82);
			var51.au_fld += 4;
			int var64 = var51.au_fld;
			int var65 = var64;
			int var66 = -1;

			while (true) {
				int var67 = var1.dd();
				var51.cn(var67, -1758086084);
				var65 += var67;
				int var68 = var1.al_fld[var83++] & 255;
				boolean var69 = var68 != var66;
				var66 = var68 & 15;
				if (var68 == 7) {
					if (var69) {
						var51.bc(255);
					}

					var51.bc(47);
					var51.bc(0);
					var51.cx(var51.au_fld - var64);
					break;
				}

				if (var68 == 23) {
					if (var69) {
						var51.bc(255);
					}

					var51.bc(81);
					var51.bc(3);
					var51.bc(var1.al_fld[var50++]);
					var51.bc(var1.al_fld[var50++]);
					var51.bc(var1.al_fld[var50++]);
				} else {
					var52 ^= var68 >> 4;
					if (var66 == 0) {
						if (var69) {
							var51.bc(144 + var52);
						}

						var53 += var1.al_fld[var37++];
						var54 += var1.al_fld[var38++];
						int var89 = var53 & 127;
						int var90 = var54 & 127;
						var51.bc(var89);
						var51.bc(var90);
						if (var90 > 0) {
							int var72 = var61[var52];
							mc var73 = (mc)this.ak_fld.ak(var72);
							if (var73 == null) {
								var73 = new mc(var65);
								this.ak_fld.az(var73, var72);
							}

							var73.ak_fld.set(var89);
						}
					} else if (var66 == 1) {
						if (var69) {
							var51.bc(128 + var52);
						}

						var53 += var1.al_fld[var37++];
						var55 += var1.al_fld[var40++];
						var51.bc(var53 & 127);
						var51.bc(var55 & 127);
					} else if (var66 == 2) {
						if (var69) {
							var51.bc(176 + var52);
						}

						var28 = var28 + var1.al_fld[var81++] & 127;
						var51.bc(var28);
						byte var87;
						if (var28 == 0 || var28 == 32) {
							var87 = var1.al_fld[var44++];
						} else if (var28 == 1) {
							var87 = var1.al_fld[var34++];
						} else if (var28 == 33) {
							var87 = var1.al_fld[var41++];
						} else if (var28 == 7) {
							var87 = var1.al_fld[var35++];
						} else if (var28 == 39) {
							var87 = var1.al_fld[var42++];
						} else if (var28 == 10) {
							var87 = var1.al_fld[var36++];
						} else if (var28 == 42) {
							var87 = var1.al_fld[var43++];
						} else if (var28 == 99) {
							var87 = var1.al_fld[var46++];
						} else if (var28 == 98) {
							var87 = var1.al_fld[var47++];
						} else if (var28 == 101) {
							var87 = var1.al_fld[var48++];
						} else if (var28 == 100) {
							var87 = var1.al_fld[var49++];
						} else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
							var87 = var1.al_fld[var39++];
						} else {
							var87 = var1.al_fld[var30++];
						}

						int var88 = var87 + var59[var28];
						var59[var28] = var88;
						int var71 = var88 & 127;
						var51.bc(var71);
						if (var28 == 0) {
							var60[var52] = (var60[var52] & -2080769) + (var71 << 14);
						}

						if (var28 == 32) {
							var60[var52] = (var60[var52] & -16257) + (var71 << 7);
						}
					} else if (var66 == 3) {
						if (var69) {
							var51.bc(224 + var52);
						}

						int var86 = var56 + var1.al_fld[var45++];
						var56 = var86 + (var1.al_fld[var33++] << 7);
						var51.bc(var56 & 127);
						var51.bc(var56 >> 7 & 127);
					} else if (var66 == 4) {
						if (var69) {
							var51.bc(208 + var52);
						}

						var57 += var1.al_fld[var32++];
						var51.bc(var57 & 127);
					} else if (var66 == 5) {
						if (var69) {
							var51.bc(160 + var52);
						}

						var53 += var1.al_fld[var37++];
						var58 += var1.al_fld[var31++];
						var51.bc(var53 & 127);
						var51.bc(var58 & 127);
					} else {
						if (var66 != 6) {
							throw new RuntimeException();
						}

						if (var69) {
							var51.bc(192 + var52);
						}

						byte var70 = var1.al_fld[var44++];
						var61[var52] = var60[var52] + var70;
						var51.bc(var70);
					}
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lmz;"
	)
	public static mz av(ub var0, int var1, int var2) throws EOFException {
		try {
			byte[] var3 = var0.bb(var1, var2, 584982574);
			return var3 == null ? null : new mz(new xi(var3));
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lmz;"
	)
	public static mz ag(ub var0, int var1, int var2) throws EOFException {
		try {
			byte[] var3 = var0.bb(var1, var2, 584982574);
			return var3 == null ? null : new mz(new xi(var3));
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lmz;"
	)
	public static mz az(ub var0, int var1, int var2) throws EOFException {
		try {
			byte[] var3 = var0.bb(var1, var2, 584982574);
			return var3 == null ? null : new mz(new xi(var3));
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lmz;"
	)
	public static mz ak(ub var0, int var1, int var2) throws EOFException {
		try {
			byte[] var3 = var0.bb(var1, var2, 584982574);
			return var3 == null ? null : new mz(new xi(var3));
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Lmz;"
	)
	public static mz ae(ub var0, int var1, int var2) throws EOFException {
		try {
			byte[] var3 = var0.bb(var1, var2, 584982574);
			return var3 == null ? null : new mz(new xi(var3));
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}
}
