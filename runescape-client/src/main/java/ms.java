import java.io.EOFException;
import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ms")
public class ms extends vw {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bk_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ar_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lai;"
	)
	ai[] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] ah_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lmi;"
	)
	mi[] aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[B"
	)
	byte[] ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljava/util/ArrayList;"
	)
	ArrayList as_fld = new ArrayList(8);
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bo_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "[[B"
	)
	static byte[][] ly_fld;
	@ObfuscatedGetter(
		intValue = -376162231
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;
	@ObfuscatedGetter(
		intValue = -1996164195
	)
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ne_fld;

	ms(byte[] var1) {
		this.az_fld = new ai[128];
		this.av_fld = new short[128];
		this.ae_fld = new byte[128];
		this.ah_fld = new byte[128];
		this.aw_fld = new mi[128];
		this.ay_fld = new byte[128];
		this.ar_fld = new int[128];
		xi var2 = new xi(var1);
		int var3 = 0;

		while (var2.al_fld[var3 + var2.au_fld] != 0) {
			var3++;
		}

		byte[] var4 = new byte[var3];

		for (int var5 = 0; var5 < var3; var5++) {
			var4[var5] = xi.rp(var2, 412704007);
		}

		var2.au_fld++;
		var3++;
		int var39 = var2.au_fld;
		var2.au_fld += 228932457 * var3;
		int var6 = 0;

		while (0 != var2.al_fld[var2.au_fld + var6]) {
			var6++;
		}

		byte[] var7 = new byte[var6];

		for (int var8 = 0; var8 < var6; var8++) {
			var7[var8] = xi.rp(var2, -69874312);
		}

		var2.au_fld++;
		var6++;
		int var41 = var2.au_fld;
		var2.au_fld += 228932457 * var6;
		int var9 = 0;

		while (var2.al_fld[var9 + var2.au_fld] != 0) {
			var9++;
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; var11++) {
			var10[var11] = xi.rp(var2, -1750691241);
		}

		var2.au_fld++;
		byte[] var43 = new byte[++var9];
		int var12;
		if (var9 > 1) {
			var43[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (int var14 = 2; var14 < var9; var14++) {
				int var15 = var2.cg();
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						var15--;
					}

					var13 = var15;
				}

				var43[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		mi[] var44 = new mi[var12];

		for (int var45 = 0; var45 < var44.length; var45++) {
			mi var48 = var44[var45] = new mi();
			int var16 = var2.cg();
			if (var16 > 0) {
				var48.ak_fld = new byte[var16 * 2];
			}

			var16 = var2.cg();
			if (var16 > 0) {
				var48.ag_fld = new byte[2 + 2 * var16];
				var48.ag_fld[1] = 64;
			}
		}

		int var46 = var2.cg();
		byte[] var49 = var46 > 0 ? new byte[var46 * 2] : null;
		var46 = var2.cg();
		byte[] var52 = var46 > 0 ? new byte[var46 * 2] : null;
		int var17 = 0;

		while (0 != var2.al_fld[var2.au_fld + var17]) {
			var17++;
		}

		byte[] var18 = new byte[var17];

		for (int var19 = 0; var19 < var17; var19++) {
			var18[var19] = xi.rp(var2, 561637319);
		}

		var2.au_fld++;
		var17++;
		int var55 = 0;

		for (int var20 = 0; var20 < 128; var20++) {
			var55 += var2.cg();
			this.av_fld[var20] = (short)var55;
		}

		var55 = 0;

		for (int var61 = 0; var61 < 128; var61++) {
			var55 += var2.cg();
			this.av_fld[var61] = (short)(this.av_fld[var61] + (var55 << 8));
		}

		int var62 = 0;
		int var21 = 0;
		int var22 = 0;

		for (int var23 = 0; var23 < 128; var23++) {
			if (0 == var62) {
				if (var21 < var18.length) {
					var62 = var18[var21++];
				} else {
					var62 = -1;
				}

				var22 = var2.dd();
			}

			this.av_fld[var23] = (short)(this.av_fld[var23] + ((var22 - 1 & 2) << 14));
			this.ar_fld[var23] = var22;
			var62--;
		}

		var62 = 0;
		var21 = 0;
		int var71 = 0;

		for (int var24 = 0; var24 < 128; var24++) {
			if (this.ar_fld[var24] != 0) {
				if (0 == var62) {
					if (var21 < var4.length) {
						var62 = var4[var21++];
					} else {
						var62 = -1;
					}

					var71 = var2.al_fld[var39++] - 1;
				}

				this.ay_fld[var24] = (byte)var71;
				var62--;
			}
		}

		var62 = 0;
		var21 = 0;
		int var72 = 0;

		for (int var25 = 0; var25 < 128; var25++) {
			if (0 != this.ar_fld[var25]) {
				if (var62 == 0) {
					if (var21 < var7.length) {
						var62 = var7[var21++];
					} else {
						var62 = -1;
					}

					var72 = var2.al_fld[var41++] + 16 << 2;
				}

				this.ah_fld[var25] = (byte)var72;
				var62--;
			}
		}

		var62 = 0;
		var21 = 0;
		mi var73 = null;

		for (int var26 = 0; var26 < 128; var26++) {
			if (0 != this.ar_fld[var26]) {
				if (0 == var62) {
					var73 = var44[var43[var21]];
					if (var21 < var10.length) {
						var62 = var10[var21++];
					} else {
						var62 = -1;
					}
				}

				this.aw_fld[var26] = var73;
				var62--;
			}
		}

		var62 = 0;
		var21 = 0;
		int var74 = 0;

		for (int var27 = 0; var27 < 128; var27++) {
			if (0 == var62) {
				if (var21 < var18.length) {
					var62 = var18[var21++];
				} else {
					var62 = -1;
				}

				if (this.ar_fld[var27] > 0) {
					var74 = var2.cg() + 1;
				}
			}

			this.ae_fld[var27] = (byte)var74;
			var62--;
		}

		this.ag_fld = var2.cg() + 1;

		for (int var75 = 0; var75 < var12; var75++) {
			mi var28 = var44[var75];
			if (var28.ak_fld != null) {
				for (byte var29 = 1; var29 < var28.ak_fld.length; var29 += 2) {
					var28.ak_fld[var29] = xi.rp(var2, -545746081);
				}
			}

			if (var28.ag_fld != null) {
				for (byte var96 = 3; var96 < var28.ag_fld.length - 2; var96 += 2) {
					var28.ag_fld[var96] = xi.rp(var2, 631402217);
				}
			}
		}

		if (var49 != null) {
			for (byte var76 = 1; var76 < var49.length; var76 += 2) {
				var49[var76] = xi.rp(var2, -130876328);
			}
		}

		if (null != var52) {
			for (byte var77 = 1; var77 < var52.length; var77 += 2) {
				var52[var77] = xi.rp(var2, -1132714457);
			}
		}

		for (int var78 = 0; var78 < var12; var78++) {
			mi var89 = var44[var78];
			if (var89.ag_fld != null) {
				var55 = 0;

				for (byte var97 = 2; var97 < var89.ag_fld.length; var97 += 2) {
					var55 = 1 + var55 + var2.cg();
					var89.ag_fld[var97] = (byte)var55;
				}
			}
		}

		for (int var79 = 0; var79 < var12; var79++) {
			mi var90 = var44[var79];
			if (var90.ak_fld != null) {
				var55 = 0;

				for (byte var98 = 2; var98 < var90.ak_fld.length; var98 += 2) {
					var55 = var55 + 1 + var2.cg();
					var90.ak_fld[var98] = (byte)var55;
				}
			}
		}

		if (var49 != null) {
			var55 = var2.cg();
			var49[0] = (byte)var55;

			for (byte var80 = 2; var80 < var49.length; var80 += 2) {
				var55 = 1 + var55 + var2.cg();
				var49[var80] = (byte)var55;
			}

			byte var81 = var49[0];
			byte var91 = var49[1];

			for (int var99 = 0; var99 < var81; var99++) {
				this.ae_fld[var99] = (byte)(32 + this.ae_fld[var99] * var91 >> 6);
			}

			for (byte var100 = 2; var100 < var49.length; var100 += 2) {
				byte var30 = var49[var100];
				byte var31 = var49[var100 + 1];
				int var32 = (var30 - var81) * var91 + (var30 - var81) / 2;

				for (int var33 = var81; var33 < var30; var33++) {
					int var35 = var30 - var81;
					int var36 = var32 >>> 31;
					int var34 = (var32 + var36) / var35 - var36;
					this.ae_fld[var33] = (byte)(this.ae_fld[var33] * var34 + 32 >> 6);
					var32 += var31 - var91;
				}

				var81 = var30;
				var91 = var31;
			}

			for (int var103 = var81; var103 < 128; var103++) {
				this.ae_fld[var103] = (byte)(this.ae_fld[var103] * var91 + 32 >> 6);
			}

			var49 = null;
		}

		if (null != var52) {
			var55 = var2.cg();
			var52[0] = (byte)var55;

			for (byte var82 = 2; var82 < var52.length; var82 += 2) {
				var55 = 1 + var55 + var2.cg();
				var52[var82] = (byte)var55;
			}

			byte var83 = var52[0];
			int var92 = var52[1] << 1;

			for (int var101 = 0; var101 < var83; var101++) {
				int var104 = var92 + (this.ah_fld[var101] & 255);
				if (var104 < 0) {
					var104 = 0;
				}

				if (var104 > 128) {
					var104 = 128;
				}

				this.ah_fld[var101] = (byte)var104;
			}

			for (byte var102 = 2; var102 < var52.length; var102 += 2) {
				byte var105 = var52[var102];
				int var107 = var52[1 + var102] << 1;
				int var109 = (var105 - var83) * var92 + (var105 - var83) / 2;

				for (int var110 = var83; var110 < var105; var110++) {
					int var112 = var105 - var83;
					int var113 = var109 >>> 31;
					int var111 = (var109 + var113) / var112 - var113;
					int var37 = (this.ah_fld[var110] & 255) + var111;
					if (var37 < 0) {
						var37 = 0;
					}

					if (var37 > 128) {
						var37 = 128;
					}

					this.ah_fld[var110] = (byte)var37;
					var109 += var107 - var92;
				}

				var83 = var105;
				var92 = var107;
			}

			for (int var106 = var83; var106 < 128; var106++) {
				int var108 = (this.ah_fld[var106] & 255) + var92;
				if (var108 < 0) {
					var108 = 0;
				}

				if (var108 > 128) {
					var108 = 128;
				}

				this.ah_fld[var106] = (byte)var108;
			}

			var52 = null;
		}

		for (int var84 = 0; var84 < var12; var84++) {
			var44[var84].aw_fld = var2.cg();
		}

		for (int var85 = 0; var85 < var12; var85++) {
			mi var93 = var44[var85];
			if (var93.ak_fld != null) {
				var93.ah_fld = var2.cg();
			}

			if (var93.ag_fld != null) {
				var93.az_fld = var2.cg();
			}

			if (var93.aw_fld > 0) {
				var93.ae_fld = var2.cg();
			}
		}

		for (int var86 = 0; var86 < var12; var86++) {
			var44[var86].av_fld = var2.cg();
		}

		for (int var87 = 0; var87 < var12; var87++) {
			mi var94 = var44[var87];
			if (var94.av_fld > 0) {
				var94.as_fld = var2.cg();
			}
		}

		for (int var88 = 0; var88 < var12; var88++) {
			mi var95 = var44[var88];
			if (var95.as_fld > 0) {
				var95.ay_fld = var2.cg();
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lap;Ljava/util/BitSet;)Z"
	)
	boolean ak(ap var1, BitSet var2) {
		try {
			boolean var4 = true;
			int var5 = 0;
			ai var6 = new ai();
			int var7 = var2.nextSetBit(0);

			while (var7 != -1) {
				int var8 = var2.nextClearBit(var7);

				for (int var9 = var7; var9 < var8; var9++) {
					if (var2.get(var9)) {
						int var10 = this.ar_fld[var9];
						if (var10 != 0) {
							if (var10 != var5) {
								var5 = var10--;
								if ((var10 & 1) == 0) {
									var6 = new ai(ap.mv(var1, var10 >> 2));
								} else {
									var6 = var1.av(var10 >> 2);
								}

								if (var6.ak()) {
									var4 = false;
								} else {
									this.as_fld.add(this.as_fld.size(), var6);
								}
							}

							if (!var6.ak()) {
								this.az_fld[var9] = var6;
								this.ar_fld[var9] = 0;
							}
						}
					}
				}

				var7 = var2.nextSetBit(var8);
			}

			return var4;
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ag() {
		this.ar_fld = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILba;Z)I"
	)
	static int am(int var0, ba var1, boolean var2) throws EOFException {
		try {
			lu var4;
			if (var0 >= 2000) {
				var0 -= 1000;
				var4 = cf.cg_fld.ak(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
			} else {
				var4 = var2 ? gs.ap_fld : bp.ab_fld;
			}

			String var5 = (String)bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
			int[] var6 = null;
			if (!var5.isEmpty() && var5.charAt(var5.length() - 1) == 'Y') {
				int var7 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
				if (var7 > 0) {
					var6 = new int[var7];

					while (var7-- > 0) {
						var6[var7] = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
					}
				}

				var5 = var5.substring(0, var5.length() - 1);
			}

			Object[] var11 = (Object[])(new Object[var5.length() + 1]);

			for (int var8 = var11.length - 1; var8 >= 1; var8--) {
				switch (var5.charAt(var8 - 1)) {
					case 'W':
					case 'X':
					case 's':
						var11[var8] = bp.ai_fld[(ef.aq_fld -= -211521517) * -836183525];
						break;
					case 'Ï':
						var11[var8] = new Long(bp.an_fld[(db.aa_fld -= 432101741) * 867932261]);
						break;
					default:
						var11[var8] = new Integer(bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127]);
				}
			}

			int var12 = bp.au_fld[(gz.ax_fld -= -1684678759) * -776631127];
			if (var12 != -1) {
				var11[0] = new Integer(var12);
			} else {
				var11 = null;
			}

			if (var0 == 1400) {
				var4.ej_fld = (Object[])var11;
			} else if (var0 == 1401) {
				var4.fo_fld = (Object[])var11;
			} else if (1402 == var0) {
				var4.fa_fld = (Object[])var11;
			} else if (1403 == var0) {
				var4.fp_fld = (Object[])var11;
			} else if (1404 == var0) {
				var4.fv_fld = (Object[])var11;
			} else if (1405 == var0) {
				var4.fj_fld = (Object[])var11;
			} else if (1406 == var0) {
				var4.fc_fld = (Object[])var11;
			} else if (1407 == var0) {
				var4.fh_fld = (Object[])var11;
				var4.fm_fld = var6;
			} else if (1408 == var0) {
				var4.fn_fld = (Object[])var11;
			} else if (var0 == 1409) {
				var4.ft_fld = (Object[])var11;
			} else if (1410 == var0) {
				var4.fb_fld = (Object[])var11;
			} else if (1411 == var0) {
				var4.fy_fld = (Object[])var11;
			} else if (1412 == var0) {
				var4.fx_fld = (Object[])var11;
			} else if (var0 == 1414) {
				var4.fe_fld = (Object[])var11;
				var4.fw_fld = var6;
			} else if (1415 == var0) {
				var4.fl_fld = (Object[])var11;
				var4.fg_fld = var6;
			} else if (1416 == var0) {
				var4.fk_fld = (Object[])var11;
			} else if (1417 == var0) {
				var4.fq_fld = (Object[])var11;
			} else if (var0 == 1418) {
				var4.fs_fld = (Object[])var11;
			} else if (var0 == 1419) {
				var4.fu_fld = (Object[])var11;
			} else if (var0 == 1420) {
				var4.fz_fld = (Object[])var11;
			} else if (1421 == var0) {
				var4.ff_fld = (Object[])var11;
			} else if (var0 == 1422) {
				var4.go_fld = (Object[])var11;
			} else if (var0 == 1423) {
				var4.gn_fld = (Object[])var11;
			} else if (var0 == 1424) {
				var4.gh_fld = (Object[])var11;
			} else if (1425 == var0) {
				var4.gj_fld = (Object[])var11;
			} else if (1426 == var0) {
				var4.gt_fld = (Object[])var11;
			} else if (var0 == 1427) {
				var4.gr_fld = (Object[])var11;
			} else if (1428 == var0) {
				var4.gg_fld = (Object[])var11;
			} else if (var0 == 1429) {
				var4.gc_fld = (Object[])var11;
			} else if (1430 == var0) {
				var4.fr_fld = (Object[])var11;
			} else if (1431 == var0) {
				var4.fi_fld = (Object[])var11;
			} else if (1434 == var0) {
				var4.gs_fld = (Object[])var11;
			} else if (var0 == 1435) {
				var4.fd_fld = (Object[])var11;
			} else {
				if (var0 < 1436 || var0 > 1439) {
					return 2;
				}

				ld var9 = var4.bn((byte)-115);
				if (null != var9) {
					if (var0 == 1436) {
						var9.ae_fld = (Object[])var11;
					} else if (1437 == var0) {
						var9.ah_fld = (Object[])var11;
					} else if (var0 == 1438) {
						var9.aw_fld = (Object[])var11;
					} else if (var0 == 1439) {
						var9.av_fld = (Object[])var11;
					}
				}
			}

			var4.eh_fld = true;
			return 1;
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lap;Ljava/util/BitSet;)Z"
	)
	boolean av(ap var1, BitSet var2) {
		try {
			boolean var3 = true;
			int var4 = 0;
			ai var5 = new ai();
			int var6 = var2.nextSetBit(0);

			while (var6 != -1) {
				int var7 = var2.nextClearBit(var6);

				for (int var8 = var6; var8 < var7; var8++) {
					if (var2.get(var8)) {
						int var9 = this.ar_fld[var8];
						if (var9 != 0) {
							if (var9 != var4) {
								var4 = var9--;
								if ((var9 & 1) == 0) {
									var5 = new ai(ap.mv(var1, var9 >> 2));
								} else {
									var5 = var1.av(var9 >> 2);
								}

								if (var5.ak()) {
									var3 = false;
								} else {
									this.as_fld.add(this.as_fld.size(), var5);
								}
							}

							if (!var5.ak()) {
								this.az_fld[var8] = var5;
								this.ar_fld[var8] = 0;
							}
						}
					}
				}

				var6 = var2.nextSetBit(var7);
			}

			return var3;
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lap;Ljava/util/BitSet;)Z"
	)
	boolean ae(ap var1, BitSet var2) {
		try {
			boolean var3 = true;
			int var4 = 0;
			ai var5 = new ai();
			int var6 = var2.nextSetBit(0);

			while (var6 != -1) {
				int var7 = var2.nextClearBit(var6);

				for (int var8 = var6; var8 < var7; var8++) {
					if (var2.get(var8)) {
						int var9 = this.ar_fld[var8];
						if (var9 != 0) {
							if (var9 != var4) {
								var4 = var9--;
								if ((var9 & 1) == 0) {
									var5 = new ai(ap.mv(var1, var9 >> 2));
								} else {
									var5 = var1.av(var9 >> 2);
								}

								if (var5.ak()) {
									var3 = false;
								} else {
									this.as_fld.add(this.as_fld.size(), var5);
								}
							}

							if (!var5.ak()) {
								this.az_fld[var8] = var5;
								this.ar_fld[var8] = 0;
							}
						}
					}
				}

				var6 = var2.nextSetBit(var7);
			}

			return var3;
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void ay() {
		this.ar_fld = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void aw() {
		this.ar_fld = null;
	}

	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "(Lay;)Z"
	)
	public static boolean ur(ay var0) {
		return var0.av_fld.isDone();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lap;Ljava/util/BitSet;)Z"
	)
	boolean az(ap var1, BitSet var2) {
		try {
			boolean var3 = true;
			int var4 = 0;
			ai var5 = new ai();
			int var6 = var2.nextSetBit(0);

			while (var6 != -1) {
				int var7 = var2.nextClearBit(var6);

				for (int var8 = var6; var8 < var7; var8++) {
					if (var2.get(var8)) {
						int var9 = this.ar_fld[var8];
						if (var9 != 0) {
							if (var9 != var4) {
								var4 = var9--;
								if ((var9 & 1) == 0) {
									var5 = new ai(ap.mv(var1, var9 >> 2));
								} else {
									var5 = var1.av(var9 >> 2);
								}

								if (var5.ak()) {
									var3 = false;
								} else {
									this.as_fld.add(this.as_fld.size(), var5);
								}
							}

							if (!var5.ak()) {
								this.az_fld[var8] = var5;
								this.ar_fld[var8] = 0;
							}
						}
					}
				}

				var6 = var2.nextSetBit(var7);
			}

			return var3;
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lda;I)V"
	)
	static final void cq(dx var0, da var1, int var2) throws EOFException {
		try {
			int var3 = var1.dv_fld - var1.bt_fld & 2047;
			if (var3 != 0) {
				byte var4 = -1;
				boolean var5 = true;
				var1.dz_fld++;
				int var6 = var3 > 1024 ? -1 : 1;
				var1.bt_fld = var1.bt_fld + var1.dt_fld * var6 * -450034243;
				boolean var7 = true;
				if (var3 < var1.dt_fld || var3 > 2048 - var1.dt_fld) {
					var1.bt_fld = var1.dv_fld * -1509908899;
					var7 = false;
				}

				if (var1.dt_fld > 0) {
					if (var2 != 1764677584) {
						return;
					}

					label90:
					if (var1.dt((byte)50) == var1.bi_fld) {
						if (var1.dz_fld <= 25) {
							if (var2 != 1764677584) {
								return;
							}

							if (!var7) {
								break label90;
							}
						}

						if (-1 == var6 && -1 != var1.bu_fld) {
							var1.dm(var1.bu_fld, (byte)95);
						} else if (1 == var6 && -1 != var1.bn_fld) {
							var1.dm(var1.bn_fld, (byte)78);
						} else {
							var1.dm(var1.bc_fld, (byte)52);
						}
					}
				}

				var1.bt_fld = -450034243 * (var1.bt_fld & 2047);
			} else {
				if (var1.bj_fld) {
					var1.de((byte)75);
					var1.bj_fld = false;
				}

				var1.dz_fld = 0;
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)Z"
	)
	static boolean ar(ub var0, int var1, int var2) throws EOFException {
		try {
			byte[] var4 = var0.bb(var1, var2, 584982574);
			if (null == var4) {
				return false;
			} else {
				wz.al(var4, 2110264634);
				return true;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}
}
