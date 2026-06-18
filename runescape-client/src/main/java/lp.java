import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.ColorTextureOverride;
import net.runelite.api.PlayerComposition;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.kit.KitType;

@ObfuscatedName("lp")
@Implements({"PlayerComposition"})
public class lp implements PlayerComposition {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -588464379
	)
	public static int as_fld = 0;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	public static iw aw_fld = new iw(260);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	public static short[] az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	public static ry ay_fld = new ry(16, qd.ak_fld);
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1905459279
	)
	int an_fld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aj_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] af_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] al_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -753683305
	)
	public int au_fld = 2125788377;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1953147203
	)
	public int ax_fld = 0;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -930543222749818841L
	)
	long aa_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ar_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -930543222749818841L
	)
	long ai_fld;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Loo;"
	)
	oo[] aq_fld;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean am_fld = false;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int dv_fld;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[II)V"
	)
	static void ac(int var0, int[] var1, int var2) throws EOFException {
		try {
			for (int var3 = 0; var3 < fi.am_fld; var3++) {
				ox var4 = qc.ak(var3);
				if (null != var4 && !var4.bz_fld && var4.av(var2, var0)) {
					var1[on.ag(var2)] = var3 + 256;
					break;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([I[I[Loo;Z[IIIIB)V"
	)
	public void ag(int[] var1, int[] var2, oo[] var3, boolean var4, int[] var5, int var6, int var7, int var8, byte var9) {
		try {
			this.aq_fld = var3;
			this.am_fld = var4;
			this.au_fld = var8;
			this.az(var1, var2, var5, var6, var7, 338885480);
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[I"
	)
	int[] av(int var1, int var2) {
		try {
			int[] var3 = new int[12];

			for (int var4 = 0; var4 < 7; var4++) {
				cn.ak(var1, var3, var4, (byte)-51);
			}

			return var3;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Llp;Lol;ILol;I)Lfn;"
	)
	public static fn bf(lp var0, ol var1, int var2, ol var3, int var4) throws EOFException {
		try {
			if (var0.an_fld != -1) {
				return ca.az(var0.an_fld * -1278473155).aw(var1, var2, var3, var4, null, 1723784842);
			} else {
				long var5 = var0.aa_fld;
				int[] var7 = var0.af_fld;
				if (null != var1 && (var1.bi_fld >= 0 || var1.bu_fld >= 0)) {
					var7 = new int[12];
					System.arraycopy(var0.af_fld, 0, var7, 0, var7.length);
					if (var1.bi_fld * -947518773 >= 0) {
						var5 ^= (long)(var1.bi_fld - var0.af_fld[of.ah_fld.aa_fld * -1949324611]) << 40;
						var7[of.ah_fld.aa_fld * 1507944290] = var0.ab(var1.bi_fld * 2128710014, -1684678759);
					}

					if (var1.bu_fld >= 0) {
						var5 ^= (long)(var1.bu_fld - var0.af_fld[of.av_fld.aa_fld * 1802823963]) << 48;
						var7[of.av_fld.aa_fld * 702342339] = var0.ab(914600407 * var1.bu_fld, -1684678759);
					}
				}

				fn var8 = (fn)aw_fld.ak(var5);
				if (null == var8) {
					boolean var9 = false;

					for (int var10 = 0; var10 < 12; var10++) {
						int var11 = var7[var10];
						if (var0.aq(var11, -717357547)) {
							ox var12 = oo(var0, var11);
							if (null != var12 && !var12.ae()) {
								var9 = true;
							}
						}

						if (ak(var0, var11, (short)193)) {
							oo var22 = var0.aq_fld == null ? null : var0.aq_fld[var10];
							if (!og.lt(ls(var0, var11, (byte)1), var0.ax_fld, var22)) {
								var9 = true;
							}
						}
					}

					if (var9) {
						if (-1L != var0.ai_fld) {
							var8 = (fn)aw_fld.ak(var0.ai_fld * -2733217539101250935L);
						}

						if (null == var8) {
							return null;
						}
					}

					if (var8 == null) {
						eg[] var20 = new eg[12];
						int var21 = 0;

						for (int var23 = 0; var23 < 12; var23++) {
							int var13 = var7[var23];
							if (var0.aq(var13, -717357547)) {
								ox var14 = oo(var0, var13);
								eg var15 = null;
								if (null != var14) {
									var15 = var14.ay();
								}

								if (var15 != null) {
									var20[var21++] = var15;
								}
							}

							if (ak(var0, var13, (short)193)) {
								og var26 = ls(var0, var13, (byte)1);
								oo var27 = null == var0.aq_fld ? null : var0.aq_fld[var23];
								eg var16 = og.gn(var26, var0.ax_fld, var27, (byte)24);
								if (null != var16) {
									var20[var21++] = var16;
								}
							}
						}

						eg var24 = new eg(var20, var21);

						for (int var25 = 0; var25 < 5; var25++) {
							if (var0.al_fld[var25] < mn.av_fld[var25].length) {
								var24.be(az_fld[var25], mn.av_fld[var25][var0.al_fld[var25]]);
							}

							if (var0.al_fld[var25] < rn.ah_fld[var25].length) {
								var24.be(ix.ae_fld[var25], rn.ah_fld[var25][var0.al_fld[var25]]);
							}
						}

						var8 = eg.et(var24, -2059515371, -716390962, 1533716246, -880691240, 858651678);
						aw_fld.az(var8, var5);
						var0.ai_fld = var5 * -7445695333835609159L;
					}
				}

				fn var19;
				if (var1 == null && null == var3) {
					var19 = var8.ay(true);
				} else if (var1 != null && null != var3) {
					var19 = ol.uq(var1, var8, var2, var3, var4);
				} else if (null != var1) {
					var19 = var1.as(var8, var2, (byte)-97);
				} else {
					var19 = var3.as(var8, var4, (byte)-52);
				}

				return var19;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cu(int var1) {
		return 1363073916 + (var1 - -1045654243);
	}

	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)V"
	)
	public static void vr(qa var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.ae_fld = 0;
				var0.av_fld = 0;
				var0.ah_fld = 0;
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZI)V"
	)
	public void ah(int var1, boolean var2, int var3) {
		int var4 = this.al_fld[var1];
		if (!var2) {
			do {
				if (--var4 < 0) {
					var4 = mn.av_fld[var1].length - 1;
				}
			} while (!fs.ak(var1, var4));
		} else {
			do {
				if (++var4 >= mn.av_fld[var1].length) {
					if (var3 <= -514769483) {
						return;
					}

					var4 = 0;
				}
			} while (!fs.ak(var1, var4));
		}

		this.al_fld[var1] = var4;
		de(this, (byte)62);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void bh(int var1, boolean var2) {
		int var3 = this.al_fld[var1];
		if (!var2) {
			do {
				if (--var3 < 0) {
					var3 = mn.av_fld[var1].length - 1;
				}
			} while (!fs.ak(var1, var3));
		} else {
			do {
				if (++var3 >= mn.av_fld[var1].length) {
					var3 = 0;
				}
			} while (!fs.ak(var1, var3));
		}

		this.al_fld[var1] = var3;
		de(this, (byte)109);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ay(xi var1, int var2) {
		var1.ea(this.ax_fld);

		for (int var3 = 0; var3 < 7; var3++) {
			int var4 = this.af_fld[on.ag(var3)];
			if (0 == var4) {
				if (var2 >= 681955997) {
					return;
				}

				xi.vy(var1, -1);
			} else {
				xi.vy(var1, var4 - 256);
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			var1.ea(this.al_fld[var5]);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lol;ILol;IB)Lfn;"
	)
	public fn ar(ol var1, int var2, ol var3, int var4, byte var5) {
		try {
			if (this.an_fld != -1) {
				return ca.az(this.an_fld).aw(var1, var2, var3, var4, null, 1195293953);
			} else {
				long var6 = this.aa_fld;
				int[] var8 = this.af_fld;
				if (null != var1 && (var1.bi_fld >= 0 || var1.bu_fld >= 0)) {
					var8 = new int[12];
					System.arraycopy(this.af_fld, 0, var8, 0, var8.length);
					if (var1.bi_fld >= 0) {
						var6 ^= (long)(var1.bi_fld - this.af_fld[of.ah_fld.aa_fld]) << 40;
						var8[of.ah_fld.aa_fld] = this.ab(var1.bi_fld, -1684678759);
					}

					if (var1.bu_fld >= 0) {
						var6 ^= (long)(var1.bu_fld - this.af_fld[of.av_fld.aa_fld]) << 48;
						var8[of.av_fld.aa_fld] = this.ab(var1.bu_fld, -1684678759);
					}
				}

				fn var9 = (fn)aw_fld.ak(var6);
				if (null == var9) {
					boolean var10 = false;

					for (int var11 = 0; var11 < 12; var11++) {
						int var12 = var8[var11];
						if (this.aq(var12, -717357547)) {
							ox var13 = oo(this, var12);
							if (null != var13 && !var13.ae()) {
								var10 = true;
							}
						}

						if (ak(this, var12, (short)193)) {
							oo var22 = this.aq_fld == null ? null : this.aq_fld[var11];
							if (!og.lt(ls(this, var12, (byte)1), this.ax_fld, var22)) {
								var10 = true;
							}
						}
					}

					if (var10) {
						if (-1L != this.ai_fld) {
							var9 = (fn)aw_fld.ak(this.ai_fld * -2733217539101250935L);
						}

						if (null == var9) {
							return null;
						}
					}

					if (var9 == null) {
						eg[] var20 = new eg[12];
						int var21 = 0;

						for (int var23 = 0; var23 < 12; var23++) {
							int var14 = var8[var23];
							if (this.aq(var14, -717357547)) {
								ox var15 = oo(this, var14);
								eg var16 = null;
								if (null != var15) {
									var16 = var15.ay();
								}

								if (var16 != null) {
									var20[var21++] = var16;
								}
							}

							if (ak(this, var14, (short)193)) {
								og var26 = ls(this, var14, (byte)1);
								oo var27 = null == this.aq_fld ? null : this.aq_fld[var23];
								eg var17 = og.gn(var26, this.ax_fld, var27, (byte)42);
								if (null != var17) {
									var20[var21++] = var17;
								}
							}
						}

						eg var24 = new eg(var20, var21);

						for (int var25 = 0; var25 < 5; var25++) {
							if (this.al_fld[var25] < mn.av_fld[var25].length) {
								var24.be(az_fld[var25], mn.av_fld[var25][this.al_fld[var25]]);
							}

							if (this.al_fld[var25] < rn.ah_fld[var25].length) {
								var24.be(ix.ae_fld[var25], rn.ah_fld[var25][this.al_fld[var25]]);
							}
						}

						var9 = eg.et(var24, 64, 850, -30, -50, -30);
						aw_fld.az(var9, var6);
						this.ai_fld = var6 * -7445695333835609159L;
					}
				}

				fn var19;
				if (var1 == null && null == var3) {
					var19 = var9.ay(true);
				} else if (var1 != null && null != var3) {
					var19 = ol.uq(var1, var9, var2, var3, var4);
				} else if (null != var1) {
					var19 = var1.as(var9, var2, (byte)-9);
				} else {
					var19 = var3.as(var9, var4, (byte)-24);
				}

				return var19;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Llp;B)V"
	)
	public static void de(lp var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			long var2 = var0.aa_fld;
			long[] var4 = xi.ar_fld;
			var0.aa_fld = 8948921258715193449L;

			for (int var5 = 0; var5 < 12; var5++) {
				var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.af_fld[var5] >> 24) & 255L)]);
				var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.af_fld[var5] >> 16) & 255L)]);
				var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.af_fld[var5] >> 8) & 255L)]);
				var0.aa_fld = var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.af_fld[var5]) & 255L)];
			}

			if (null != var0.aq_fld) {
				for (int var7 = 0; var7 < var0.aq_fld.length; var7++) {
					if (var0.aq_fld[var7] != null) {
						if (null != var0.aq_fld[var7].ae_fld) {
							for (int var6 = 0; var6 < var0.aq_fld[var7].ae_fld.length; var6++) {
								var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.aq_fld[var7].ae_fld[var6] >> 8) & 255L)]);
								var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.aq_fld[var7].ae_fld[var6]) & 255L)]);
							}
						}

						if (var0.aq_fld[var7].ah_fld != null) {
							for (int var9 = 0; var9 < var0.aq_fld[var7].ah_fld.length; var9++) {
								var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.aq_fld[var7].ah_fld[var9] >> 8) & 255L)]);
								var0.aa_fld = var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.aq_fld[var7].ah_fld[var9]) & 255L)];
							}
						}
					}
				}
			}

			for (int var8 = 0; var8 < 5; var8++) {
				var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.al_fld[var8]) & 255L)]);
			}

			var0.aa_fld = var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.ax_fld) & 255L)];
			if (0L == var2 || var0.aa_fld == var2) {
				if (!var0.am_fld) {
					return;
				}

				if (var1 <= 0) {
					return;
				}
			}

			aw_fld.ag(var2);
		}
	}

	@ObfuscatedName("getColorTextureOverride")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;)Lnet/runelite/api/ColorTextureOverride;"
	)
	@Export("getColorTextureOverride")
	@Override
	public ColorTextureOverride getColorTextureOverride(KitType var1) {
		return this.aq_fld != null ? this.aq_fld[var1.getIndex()] : null;
	}

	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "(Llp;)Leg;"
	)
	public static eg tc(lp var0) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var0.an_fld != -1) {
				return pp.tv(ca.az(var0.an_fld), null, -1845879739);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = var0.af_fld[var2];
					if (var0.aq(var3, -717357547)) {
						ox var4 = oo(var0, var3);
						if (null != var4 && !ox.yz(var4, (byte)109)) {
							var1 = true;
						}
					}

					if (ak(var0, var3, (short)193)) {
						oo var12 = null == var0.aq_fld ? null : var0.aq_fld[var2];
						if (!ls(var0, var3, (byte)1).ai(var0.ax_fld, var12, -1622134892)) {
							var1 = true;
						}
					}
				}

				if (var1) {
					return null;
				} else {
					eg[] var10 = new eg[12];
					int var11 = 0;

					for (int var13 = 0; var13 < 12; var13++) {
						int var5 = var0.af_fld[var13];
						if (var0.aq(var5, -717357547)) {
							ox var6 = oo(var0, var5);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ah();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (ak(var0, var5, (short)193)) {
							oo var16 = null == var0.aq_fld ? null : var0.aq_fld[var13];
							eg var17 = ls(var0, var5, (byte)1).aq(var0.ax_fld, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (var0.al_fld[var15] < mn.av_fld[var15].length) {
							var14.be(az_fld[var15], mn.av_fld[var15][var0.al_fld[var15]]);
						}

						if (var0.al_fld[var15] < rn.ah_fld[var15].length) {
							var14.be(ix.ae_fld[var15], rn.ah_fld[var15][var0.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("getKitId")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;)I"
	)
	@Export("getKitId")
	@Override
	public int getKitId(KitType var1) {
		int var2 = this.getEquipmentIds()[var1.getIndex()];
		return var2 >= 256 && var2 < 2048 ? var2 - 256 : -1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void bl(xi var1) {
		var1.ea(this.ax_fld);

		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = this.af_fld[on.ag(var2)];
			if (0 == var3) {
				xi.vy(var1, -1);
			} else {
				xi.vy(var1, var3 - 256);
			}
		}

		for (int var4 = 0; var4 < 5; var4++) {
			var1.ea(this.al_fld[var4]);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V"
	)
	void au(short var1) {
		try {
			this.az(this.ar_fld, this.af_fld, this.al_fld, this.ax_fld, this.an_fld, -1935098114);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bk(int var1) {
		try {
			if (var1 != this.ax_fld) {
				this.az(null, null, this.al_fld, var1, -1, -1133500904);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(Llp;)Leg;"
	)
	public static eg dx(lp var0) throws EOFException {
		try {
			if (var0.an_fld != -1) {
				return pp.tv(ca.az(var0.an_fld), null, -2012700360);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = var0.af_fld[var2];
					if (var0.aq(var3, -717357547)) {
						ox var4 = oo(var0, var3);
						if (null != var4 && !ox.yz(var4, (byte)88)) {
							var1 = true;
						}
					}

					if (ak(var0, var3, (short)193)) {
						oo var12 = null == var0.aq_fld ? null : var0.aq_fld[var2];
						if (!ls(var0, var3, (byte)1).ai(var0.ax_fld, var12, 2099099266)) {
							var1 = true;
						}
					}
				}

				if (var1) {
					return null;
				} else {
					eg[] var10 = new eg[12];
					int var11 = 0;

					for (int var13 = 0; var13 < 12; var13++) {
						int var5 = var0.af_fld[var13];
						if (var0.aq(var5, -717357547)) {
							ox var6 = oo(var0, var5);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ah();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (ak(var0, var5, (short)193)) {
							oo var16 = null == var0.aq_fld ? null : var0.aq_fld[var13];
							eg var17 = ls(var0, var5, (byte)1).aq(var0.ax_fld, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (var0.al_fld[var15] < mn.av_fld[var15].length) {
							var14.be(az_fld[var15], mn.av_fld[var15][var0.al_fld[var15]]);
						}

						if (var0.al_fld[var15] < rn.ah_fld[var15].length) {
							var14.be(ix.ae_fld[var15], rn.ah_fld[var15][var0.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean cn(int var1) {
		try {
			if (ak(this, this.af_fld[0], (short)193)) {
				og var2 = ls(this, this.af_fld[0], (byte)1);
				return of.al_fld.aa_fld != var2.eb_fld && of.al_fld.aa_fld != var2.ed_fld;
			} else {
				return false;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void aa(int var1, int var2, int var3) {
		try {
			this.al_fld[var1] = var2;
			this.au((short)-6379);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void aw(int var1, byte var2) {
		try {
			og var3 = kb.ag(var1, -1752383175);
			this.af_fld[var3.ep_fld * -616953337] = var1 + 2048;
			if (var3.eb_fld != -1) {
				if (var2 != 0) {
					return;
				}

				this.af_fld[var3.eb_fld * 681741211] = 0;
			}

			if (-1 != var3.ed_fld) {
				this.af_fld[var3.ed_fld] = 0;
			}

			this.au((short)816);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean aq(int var1, int var2) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Llj;)V"
	)
	public static void ht(lj var0) {
		if (var0.ag_fld != -1L) {
			var0.ae_fld = lz.ak() - var0.ag_fld;
			var0.ag_fld = 5440310270008829263L;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean an(int var1) {
		return var1 >= -63473784 && var1 < 2048;
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Llp;IZB)V"
	)
	public static void mm(lp var0, int var1, boolean var2, byte var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				int var4 = var0.af_fld[on.ag(var1)];
				if (0 != var4) {
					var4 -= 256;

					ox var5;
					do {
						if (!var2) {
							if (--var4 < 0) {
								if (var3 <= 0) {
									return;
								}

								var4 = fi.am_fld - 1;
							}
						} else if (++var4 >= fi.am_fld) {
							var4 = 0;
						}

						var5 = qc.ak(var4);
					} while (null == var5 || var5.bz_fld || !var5.av(var1, var0.ax_fld));

					var0.af_fld[on.ag(var1)] = 256 + var4;
					de(var0, (byte)114);
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	public static void pv(lp var0) throws EOFException {
		try {
			var0.az(var0.ar_fld, var0.af_fld, var0.al_fld, var0.ax_fld * 858051625, var0.an_fld, 138696245);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getEquipmentId")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;)I"
	)
	@Export("getEquipmentId")
	@Override
	public int getEquipmentId(KitType var1) {
		int var2 = this.getEquipmentIds()[var1.getIndex()];
		return var2 < 2048 ? -1 : var2 - 2048;
	}

	@ObfuscatedName("removeColorTextureOverride")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;)V"
	)
	@Export("removeColorTextureOverride")
	@Override
	public void removeColorTextureOverride(KitType var1) {
		if (this.aq_fld != null) {
			this.aq_fld[var1.getIndex()] = null;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean cr(int var1) {
		return var1 >= 589984965;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ab(int var1, int var2) {
		return 2048 + (var1 - 512);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I[II)V"
	)
	static void ap(int var0, int[] var1, int var2) throws EOFException {
		try {
			for (int var3 = 0; var3 < fi.am_fld; var3++) {
				ox var4 = qc.ak(var3);
				if (null != var4 && !var4.bz_fld && var4.av(var2, var0)) {
					var1[on.ag(var2)] = var3 + 256;
					break;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[II)V"
	)
	static void at(int var0, int[] var1, int var2) throws EOFException {
		try {
			for (int var3 = 0; var3 < fi.am_fld; var3++) {
				ox var4 = qc.ak(var3);
				if (null != var4 && !var4.bz_fld && var4.av(var2, var0)) {
					var1[on.ag(var2)] = var3 + 256;
					break;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cx(int var1, int var2) {
		try {
			this.al_fld[var1] = var2;
			this.au((short)15430);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	int[] bd(int var1) {
		try {
			int[] var2 = new int[12];

			for (int var3 = 0; var3 < 7; var3++) {
				cn.ak(var1, var2, var3, (byte)-69);
			}

			return var2;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([I[I[III)V"
	)
	public void bm(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		try {
			if (var1 == null) {
				var1 = this.av(var4, 788554055);
			}

			if (var2 == null) {
				var2 = this.av(var4, 379467589);
			}

			this.ar_fld = var1;
			this.af_fld = var2;
			this.al_fld = var3;
			this.ax_fld = var4;
			this.an_fld = var5;
			de(this, (byte)86);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	eg bv() {
		try {
			if (this.an_fld != -1) {
				return pp.tv(ca.az(this.an_fld), null, -1780879948);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = this.af_fld[var2];
					if (this.aq(var3, -717357547)) {
						ox var4 = oo(this, var3);
						if (null != var4 && !ox.yz(var4, (byte)26)) {
							var1 = true;
						}
					}

					if (ak(this, var3, (short)193)) {
						oo var12 = null == this.aq_fld ? null : this.aq_fld[var2];
						if (!ls(this, var3, (byte)1).ai(this.ax_fld, var12, -1322603220)) {
							var1 = true;
						}
					}
				}

				if (var1) {
					return null;
				} else {
					eg[] var10 = new eg[12];
					int var11 = 0;

					for (int var13 = 0; var13 < 12; var13++) {
						int var5 = this.af_fld[var13];
						if (this.aq(var5, -717357547)) {
							ox var6 = oo(this, var5);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ah();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (ak(this, var5, (short)193)) {
							oo var16 = null == this.aq_fld ? null : this.aq_fld[var13];
							eg var17 = ls(this, var5, (byte)1).aq(this.ax_fld, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (this.al_fld[var15] < mn.av_fld[var15].length) {
							var14.be(az_fld[var15], mn.av_fld[var15][this.al_fld[var15]]);
						}

						if (this.al_fld[var15] < rn.ah_fld[var15].length) {
							var14.be(ix.ae_fld[var15], rn.ah_fld[var15][this.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void br(int var1, boolean var2) {
		try {
			int var3 = this.af_fld[on.ag(var1)];
			if (0 != var3) {
				var3 -= 256;

				ox var4;
				do {
					if (!var2) {
						if (--var3 < 0) {
							var3 = fi.am_fld - 1;
						}
					} else if (++var3 >= fi.am_fld) {
						var3 = 0;
					}

					var4 = qc.ak(var3);
				} while (null == var4 || var4.bz_fld || !var4.av(var1, this.ax_fld));

				this.af_fld[on.ag(var1)] = 256 + var3;
				de(this, (byte)16);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	public lp() {
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void bs(int var1, boolean var2) {
		int var3 = this.al_fld[var1];
		if (!var2) {
			do {
				if (--var3 < 0) {
					var3 = mn.av_fld[var1].length - 1;
				}
			} while (!fs.ak(var1, var3));
		} else {
			do {
				if (++var3 >= mn.av_fld[var1].length) {
					var3 = 0;
				}
			} while (!fs.ak(var1, var3));
		}

		this.al_fld[var1] = var3;
		de(this, (byte)80);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;"
	)
	ox ca(int var1) {
		try {
			return qc.ak(var1 - -1040782927);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ba() {
		long var1 = this.aa_fld;
		if (this.an_fld != -1) {
			var1 = -65536L | this.an_fld;
		}

		Integer var3 = (Integer)(Integer)ay_fld.ag(var1);
		if (var3 == null) {
			var3 = (as_fld += 1200829901) * -588464379 - 1;
			ay_fld.az(var1, var3);
			as_fld %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bj(int var1) {
		try {
			if (var1 != this.ax_fld) {
				this.az(null, null, this.al_fld, var1, -1, 1905746404);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void bf(int var1) {
		try {
			if (var1 != this.ax_fld) {
				this.az(null, null, this.al_fld, var1, -1, 296722337);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	public void by(xi var1) {
		var1.ea(1298188575 * this.ax_fld);

		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = this.af_fld[on.ag(var2)];
			if (0 == var3) {
				xi.vy(var1, -1);
			} else {
				xi.vy(var1, var3 - 256);
			}
		}

		for (int var4 = 0; var4 < 5; var4++) {
			var1.ea(this.al_fld[var4]);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Leg;"
	)
	eg af(byte var1) {
		try {
			if (this.an_fld != -1) {
				return pp.tv(ca.az(this.an_fld), null, -1748724218);
			} else {
				boolean var2 = false;

				for (int var3 = 0; var3 < 12; var3++) {
					int var4 = this.af_fld[var3];
					if (this.aq(var4, -717357547)) {
						ox var5 = oo(this, var4);
						if (null != var5 && !ox.yz(var5, (byte)54)) {
							var2 = true;
						}
					}

					if (ak(this, var4, (short)193)) {
						oo var12 = null == this.aq_fld ? null : this.aq_fld[var3];
						if (!ls(this, var4, (byte)1).ai(this.ax_fld, var12, -428245724)) {
							var2 = true;
						}
					}
				}

				if (var2) {
					return null;
				} else {
					eg[] var10 = new eg[12];
					int var11 = 0;

					for (int var13 = 0; var13 < 12; var13++) {
						int var6 = this.af_fld[var13];
						if (this.aq(var6, -717357547)) {
							ox var7 = oo(this, var6);
							eg var8 = null;
							if (var7 != null) {
								var8 = var7.ah();
							}

							if (null != var8) {
								var10[var11++] = var8;
							}
						}

						if (ak(this, var6, (short)193)) {
							oo var16 = null == this.aq_fld ? null : this.aq_fld[var13];
							eg var17 = ls(this, var6, (byte)1).aq(this.ax_fld, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (this.al_fld[var15] < mn.av_fld[var15].length) {
							var14.be(az_fld[var15], mn.av_fld[var15][this.al_fld[var15]]);
						}

						if (this.al_fld[var15] < rn.ah_fld[var15].length) {
							var14.be(ix.ae_fld[var15], rn.ah_fld[var15][this.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bx() {
		long var1 = this.aa_fld;
		long[] var3 = xi.ar_fld;
		this.aa_fld = 8948921258715193449L;

		for (int var4 = 0; var4 < 12; var4++) {
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.af_fld[var4] >> 24) & 255L)]);
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.af_fld[var4] >> 16) & 255L)]);
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.af_fld[var4] >> 8) & 255L)]);
			this.aa_fld = this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.af_fld[var4]) & 255L)];
		}

		if (null != this.aq_fld) {
			for (int var6 = 0; var6 < this.aq_fld.length; var6++) {
				if (this.aq_fld[var6] != null) {
					if (null != this.aq_fld[var6].ae_fld) {
						for (int var5 = 0; var5 < this.aq_fld[var6].ae_fld.length; var5++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ae_fld[var5] >> 8) & 255L)]);
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ae_fld[var5]) & 255L)]);
						}
					}

					if (this.aq_fld[var6].ah_fld != null) {
						for (int var8 = 0; var8 < this.aq_fld[var6].ah_fld.length; var8++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ah_fld[var8] >> 8) & 255L)]);
							this.aa_fld = this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ah_fld[var8]) & 255L)];
						}
					}
				}
			}
		}

		for (int var7 = 0; var7 < 5; var7++) {
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.al_fld[var7]) & 255L)]);
		}

		this.aa_fld = this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.ax_fld) & 255L)];
		if (0L != var1 && this.aa_fld != var1 || this.am_fld) {
			aw_fld.ag(var1);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bo() {
		long var1 = this.aa_fld;
		long[] var3 = xi.ar_fld;
		this.aa_fld = 8948921258715193449L;

		for (int var4 = 0; var4 < 12; var4++) {
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.af_fld[var4] >> 24) & 255L)]);
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.af_fld[var4] >> 16) & 255L)]);
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.af_fld[var4] >> 8) & 255L)]);
			this.aa_fld = this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.af_fld[var4]) & 255L)];
		}

		if (null != this.aq_fld) {
			for (int var6 = 0; var6 < this.aq_fld.length; var6++) {
				if (this.aq_fld[var6] != null) {
					if (null != this.aq_fld[var6].ae_fld) {
						for (int var5 = 0; var5 < this.aq_fld[var6].ae_fld.length; var5++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ae_fld[var5] >> 8) & 255L)]);
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ae_fld[var5]) & 255L)]);
						}
					}

					if (this.aq_fld[var6].ah_fld != null) {
						for (int var8 = 0; var8 < this.aq_fld[var6].ah_fld.length; var8++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ah_fld[var8] >> 8) & 255L)]);
							this.aa_fld = this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ah_fld[var8]) & 255L)];
						}
					}
				}
			}
		}

		for (int var7 = 0; var7 < 5; var7++) {
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.al_fld[var7]) & 255L)]);
		}

		this.aa_fld = this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.ax_fld) & 255L)];
		if (0L != var1 && this.aa_fld != var1 || this.am_fld) {
			aw_fld.ag(var1);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lol;ILol;I)Lfn;"
	)
	public fn bt(ol var1, int var2, ol var3, int var4) {
		try {
			if (this.an_fld != -1) {
				return ca.az(this.an_fld).aw(var1, var2, var3, var4, null, 1345554045);
			} else {
				long var5 = this.aa_fld;
				int[] var7 = this.af_fld;
				if (null != var1 && (var1.bi_fld >= 0 || var1.bu_fld >= 0)) {
					var7 = new int[12];
					System.arraycopy(this.af_fld, 0, var7, 0, var7.length);
					if (var1.bi_fld >= 0) {
						var5 ^= (long)(var1.bi_fld - this.af_fld[of.ah_fld.aa_fld]) << 40;
						var7[of.ah_fld.aa_fld] = this.ab(var1.bi_fld, -1684678759);
					}

					if (var1.bu_fld >= 0) {
						var5 ^= (long)(var1.bu_fld - this.af_fld[of.av_fld.aa_fld]) << 48;
						var7[of.av_fld.aa_fld] = this.ab(var1.bu_fld, -1684678759);
					}
				}

				fn var8 = (fn)aw_fld.ak(var5);
				if (null == var8) {
					boolean var9 = false;

					for (int var10 = 0; var10 < 12; var10++) {
						int var11 = var7[var10];
						if (this.aq(var11, -717357547)) {
							ox var12 = oo(this, var11);
							if (null != var12 && !var12.ae()) {
								var9 = true;
							}
						}

						if (ak(this, var11, (short)193)) {
							oo var22 = this.aq_fld == null ? null : this.aq_fld[var10];
							if (!og.lt(ls(this, var11, (byte)1), this.ax_fld, var22)) {
								var9 = true;
							}
						}
					}

					if (var9) {
						if (-1L != this.ai_fld) {
							var8 = (fn)aw_fld.ak(this.ai_fld * -2733217539101250935L);
						}

						if (null == var8) {
							return null;
						}
					}

					if (var8 == null) {
						eg[] var20 = new eg[12];
						int var21 = 0;

						for (int var23 = 0; var23 < 12; var23++) {
							int var13 = var7[var23];
							if (this.aq(var13, -717357547)) {
								ox var14 = oo(this, var13);
								eg var15 = null;
								if (null != var14) {
									var15 = var14.ay();
								}

								if (var15 != null) {
									var20[var21++] = var15;
								}
							}

							if (ak(this, var13, (short)193)) {
								og var26 = ls(this, var13, (byte)1);
								oo var27 = null == this.aq_fld ? null : this.aq_fld[var23];
								eg var16 = og.gn(var26, this.ax_fld, var27, (byte)120);
								if (null != var16) {
									var20[var21++] = var16;
								}
							}
						}

						eg var24 = new eg(var20, var21);

						for (int var25 = 0; var25 < 5; var25++) {
							if (this.al_fld[var25] < mn.av_fld[var25].length) {
								var24.be(az_fld[var25], mn.av_fld[var25][this.al_fld[var25]]);
							}

							if (this.al_fld[var25] < rn.ah_fld[var25].length) {
								var24.be(ix.ae_fld[var25], rn.ah_fld[var25][this.al_fld[var25]]);
							}
						}

						var8 = eg.et(var24, 64, 850, -30, -50, -30);
						aw_fld.az(var8, var5);
						this.ai_fld = var5 * -7445695333835609159L;
					}
				}

				fn var19;
				if (var1 == null && null == var3) {
					var19 = var8.ay(true);
				} else if (var1 != null && null != var3) {
					var19 = ol.uq(var1, var8, var2, var3, var4);
				} else if (null != var1) {
					var19 = var1.as(var8, var2, (byte)0);
				} else {
					var19 = var3.as(var8, var4, (byte)-94);
				}

				return var19;
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void ai(int var1, byte var2) {
		try {
			if (var1 == this.ax_fld) {
				if (var2 != 1) {
					;
				}
			} else {
				this.az(null, null, this.al_fld, var1, -1, 430692500);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("setTransformedNpcId")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Export("setTransformedNpcId")
	@Override
	public void setTransformedNpcId(int var1) {
		this.an_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V"
	)
	public void az(int[] var1, int[] var2, int[] var3, int var4, int var5, int var6) {
		try {
			if (var1 == null) {
				var1 = this.av(var4, 189896760);
			}

			if (var2 == null) {
				if (var6 == 575364193) {
					return;
				}

				var2 = this.av(var4, -718531943);
			}

			this.ar_fld = var1;
			this.af_fld = var2;
			this.al_fld = var3;
			this.ax_fld = var4;
			this.an_fld = var5;
			de(this, (byte)66);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bw() {
		long var1 = this.aa_fld;
		if (this.an_fld != -1) {
			var1 = -65536L | this.an_fld;
		}

		Integer var3 = (Integer)(Integer)ay_fld.ag(var1);
		if (var3 == null) {
			var3 = (as_fld += 1200829901) * -588464379 - 1;
			ay_fld.az(var1, var3);
			as_fld %= 2089447994;
		}

		return var3;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Llp;IB)Log;"
	)
	public static og ls(lp var0, int var1, byte var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return kb.ag(var1 - 2048, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getGender")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getGender")
	@Override
	public int getGender() {
		return this.ax_fld;
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	public static void nx(lp var0) throws EOFException {
		try {
			var0.az(var0.ar_fld, var0.af_fld, var0.al_fld, var0.ax_fld, var0.an_fld, -1018594127);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bg() {
		try {
			this.az(this.ar_fld, this.af_fld, this.al_fld, this.ax_fld, this.an_fld, 1918074133);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cb(int var1) {
		return 2048 + (var1 - 512);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cv(int var1, int var2) {
		try {
			boolean var3 = this.ax_fld != var2;
			this.ax_fld = var2;
			if (var3) {
				if (var1 == this.ax_fld) {
					for (int var4 = 0; var4 < 7; var4++) {
						int var5 = on.ag(var4);
						if (this.af_fld[var5] > 0 && this.af_fld[var5] < 2048) {
							this.af_fld[var5] = this.ar_fld[var5];
						}
					}
				} else {
					if (this.af_fld[0] < 2048 || this.cn(820612562)) {
						this.af_fld[of.al_fld.aa_fld] = 1;
					}

					for (int var8 = 0; var8 < 7; var8++) {
						int var9 = on.ag(var8);
						if (this.af_fld[var9] > 0 && this.af_fld[var9] < 2048) {
							cn.ak(var2, this.af_fld, var8, (byte)41);
						}
					}
				}
			}

			this.au((short)9775);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cy(int var1, int var2) {
		try {
			boolean var3 = this.ax_fld != var2;
			this.ax_fld = var2;
			if (var3) {
				if (var1 == this.ax_fld) {
					for (int var4 = 0; var4 < 7; var4++) {
						int var5 = on.ag(var4);
						if (this.af_fld[var5] > 0 && this.af_fld[var5] < 2048) {
							this.af_fld[var5] = this.ar_fld[var5];
						}
					}
				} else {
					if (this.af_fld[0] < 2048 || this.cn(464288058)) {
						this.af_fld[of.al_fld.aa_fld] = 1;
					}

					for (int var8 = 0; var8 < 7; var8++) {
						int var9 = on.ag(var8);
						if (this.af_fld[var9] > 0 && this.af_fld[var9] < 2048) {
							cn.ak(var2, this.af_fld, var8, (byte)-40);
						}
					}
				}
			}

			this.au((short)-1939);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)Lox;"
	)
	public static ox hr(lp var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return qc.ak(var1 - 256);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	eg bu() {
		try {
			if (this.an_fld != -1) {
				return pp.tv(ca.az(this.an_fld * 2044197051), null, -1783532220);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = this.af_fld[var2];
					if (this.aq(var3, -717357547)) {
						ox var4 = oo(this, var3);
						if (null != var4 && !ox.yz(var4, (byte)109)) {
							var1 = true;
						}
					}

					if (ak(this, var3, (short)193)) {
						oo var12 = null == this.aq_fld ? null : this.aq_fld[var2];
						if (!ls(this, var3, (byte)1).ai(-157865995 * this.ax_fld, var12, 245375512)) {
							var1 = true;
						}
					}
				}

				if (var1) {
					return null;
				} else {
					eg[] var10 = new eg[12];
					int var11 = 0;

					for (int var13 = 0; var13 < 12; var13++) {
						int var5 = this.af_fld[var13];
						if (this.aq(var5, -717357547)) {
							ox var6 = oo(this, var5);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ah();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (ak(this, var5, (short)193)) {
							oo var16 = null == this.aq_fld ? null : this.aq_fld[var13];
							eg var17 = ls(this, var5, (byte)1).aq(this.ax_fld * 1886273405, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (this.al_fld[var15] < mn.av_fld[var15].length) {
							var14.be(az_fld[var15], mn.av_fld[var15][this.al_fld[var15]]);
						}

						if (this.al_fld[var15] < rn.ah_fld[var15].length) {
							var14.be(ix.ae_fld[var15], rn.ah_fld[var15][this.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Llp;)Z"
	)
	public static boolean hg(lp var0) throws EOFException {
		try {
			if (!ak(var0, var0.af_fld[0], (short)193)) {
				return false;
			} else {
				og var1 = ls(var0, var0.af_fld[0], (byte)1);
				return of.al_fld.aa_fld != var1.eb_fld && of.al_fld.aa_fld != var1.ed_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void be(int var1, boolean var2) {
		try {
			int var3 = this.af_fld[on.ag(var1)];
			if (0 != var3) {
				var3 -= 256;

				ox var4;
				do {
					if (!var2) {
						if (--var3 < 0) {
							var3 = fi.am_fld - 1;
						}
					} else if (++var3 >= fi.am_fld) {
						var3 = 0;
					}

					var4 = qc.ak(var3);
				} while (null == var4 || var4.bz_fld || !var4.av(var1, this.ax_fld));

				this.af_fld[on.ag(var1)] = 256 + var3;
				de(this, (byte)100);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([I[I[III)V"
	)
	public void aj(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		try {
			if (var1 == null) {
				var1 = this.av(var4, -944124310);
			}

			if (var2 == null) {
				var2 = this.av(var4, 1260070305);
			}

			this.ar_fld = var1;
			this.af_fld = var2;
			this.al_fld = var3;
			this.ax_fld = var4;
			this.an_fld = var5;
			de(this, (byte)91);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)I"
	)
	public static int ls(lp var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			long var2 = var0.aa_fld;
			if (var0.an_fld != -1) {
				var2 = -65536L | var0.an_fld;
			}

			Integer var4 = (Integer)(Integer)ay_fld.ag(var2);
			if (var4 == null) {
				var4 = (as_fld += 1200829901) * -588464379 - 1;
				ay_fld.az(var2, var4);
				as_fld %= 65535;
			}

			return var4;
		}
	}

	@ObfuscatedName("getColors")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getColors")
	@Override
	public int[] getColors() {
		return this.al_fld;
	}

	lp(lp var1) throws EOFException {
		if (null != var1) {
			int[] var2 = Arrays.copyOf(var1.af_fld, var1.af_fld.length);
			int[] var3 = Arrays.copyOf(var1.ar_fld, var1.ar_fld.length);
			oo[] var4 = null != var1.aq_fld ? Arrays.copyOf(var1.aq_fld, var1.aq_fld.length) : null;
			int[] var5 = Arrays.copyOf(var1.al_fld, var1.al_fld.length);
			this.ag(var3, var2, var4, false, var5, var1.ax_fld, var1.an_fld, var1.au_fld, (byte)-23);
		}
	}

	@ObfuscatedName("yo")
	@ObfuscatedSignature(
		descriptor = "(Llp;III)V"
	)
	public static void yo(lp var0, int var1, int var2, int var3) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				boolean var10000;
				if (var0.ax_fld != var2) {
					if (var3 == -784505437) {
						return;
					}

					var10000 = true;
				} else {
					var10000 = false;
				}

				boolean var4 = var10000;
				var0.ax_fld = var2;
				if (var4) {
					if (var1 == var0.ax_fld) {
						for (int var5 = 0; var5 < 7; var5++) {
							if (var3 == -784505437) {
								return;
							}

							int var6 = on.ag(var5);
							if (var0.af_fld[var6] > 0 && var0.af_fld[var6] < 2048) {
								var0.af_fld[var6] = var0.ar_fld[var6];
							}
						}
					} else {
						label87: {
							if (var0.af_fld[0] >= 2048) {
								if (var3 == -784505437) {
									return;
								}

								if (!var0.cn(1360988625)) {
									break label87;
								}
							}

							var0.af_fld[of.al_fld.aa_fld] = 1;
						}

						for (int var8 = 0; var8 < 7; var8++) {
							int var9 = on.ag(var8);
							if (var0.af_fld[var9] > 0 && var0.af_fld[var9] < 2048) {
								cn.ak(var2, var0.af_fld, var8, (byte)-59);
							}
						}
					}
				}

				var0.au((short)19379);
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	og cz(int var1) {
		try {
			return kb.ag(var1 - 2048, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("getEquipmentIds")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getEquipmentIds")
	@Override
	public int[] getEquipmentIds() {
		return this.af_fld;
	}

	@ObfuscatedName("setHash")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Export("setHash")
	@Override
	public void setHash() {
		de(this, (byte)66);
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(Llp;II)Lox;"
	)
	public static ox oo(lp var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else {
				return qc.ak(var1 - 256);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;"
	)
	ox cg(int var1) {
		try {
			return qc.ak(var1 - 256);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Log;"
	)
	og ck(int var1) {
		try {
			return kb.ag(var1 - 2048, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ce(int var1) {
		try {
			og var2 = kb.ag(var1, -1752383175);
			this.af_fld[var2.ep_fld * -296490700] = var1 + 2048;
			if (var2.eb_fld != -1) {
				this.af_fld[var2.eb_fld * 681741211] = 0;
			}

			if (-1 != var2.ed_fld) {
				this.af_fld[var2.ed_fld] = 0;
			}

			this.au((short)-14101);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int co(int var1) {
		return 2048 + (var1 - 679969849);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)Loc;"
	)
	static oc ae(xi var0) {
		if (null != var0) {
			boolean var2 = false;
			byte var3 = -1;
			boolean var4 = false;
			boolean var5 = false;
			boolean var6 = false;
			int var7 = var0.cm();
			int var8 = var0.cg();
			int var9 = var0.cg();
			int var10 = var0.cg();
			int var11 = var0.cg();
			if (var7 >= 1 && var9 >= 1 && var10 >= 0 && var11 >= 0) {
				return new oc(var7, var8, var9, var10, var11);
			}
		}

		return null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V"
	)
	static void aa(int var0, int var1, int var2, int var3, int var4, int var5) {
		bc.bl_fld = var0;
		ch.bx_fld = var1;
		ee.bo_fld = var2;
		dc.bp_fld = var3;
		bu.bt_fld = var4;
		hg.bv_fld = var5;
		se.bi_fld = (var3 + var0) / 2;
		fp.bu_fld = 1612252849 * ((var4 + var1) / 2);
		bw.bn_fld = (var5 + var2) / 2;
		kl.bc_fld = -411987027 * ((var3 - var0) / 2);
		hg.bw_fld = -1967709977 * ((var4 - var1) / 2);
		ei.ba_fld = -601056317 * ((var5 - var2) / 2);
		ki.bq_fld = Math.abs(kl.bc_fld);
		db.bg_fld = Math.abs(hg.bw_fld);
		hm.bb_fld = Math.abs(ei.ba_fld);
		tu.fh(ej.br_fld, var3 - var0, var4 - var1, var5 - var2, (byte)19);
		ej.br_fld.al();
		ej.bk_fld = true;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	public static void ja(lp var0) throws EOFException {
		try {
			var0.az(var0.ar_fld, var0.af_fld, var0.al_fld, var0.ax_fld, var0.an_fld, 428387755);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lox;"
	)
	ox am(int var1, int var2) {
		try {
			return qc.ak(var1 - 256);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IS)Z"
	)
	boolean ad(int var1, short var2) {
		return var1 >= 2048;
	}

	@ObfuscatedName("isFemale")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("isFemale")
	@Override
	public boolean isFemale() {
		return this.getGender() == 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V"
	)
	void as(byte var1) {
		long var2 = this.aa_fld;
		long[] var4 = xi.ar_fld;
		this.ai_fld = 8948921258715193449L;

		for (int var5 = 0; var5 < 12; var5++) {
			this.ai_fld = -8948921258715193449L * (this.ai_fld >>> 8 ^ var4[(int)((this.aa_fld ^ this.ar_fld[var5] >> 24) & 255L)]);
			this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var4[(int)((this.aa_fld ^ this.af_fld[var5] >> 16) & 255L)]);
			this.ai_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var4[(int)((this.aa_fld ^ this.al_fld[var5] >> 8) & 255L)]);
			this.ai_fld = this.aa_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.af_fld[var5]) & 255L)];
		}

		if (null != this.aq_fld) {
			for (int var7 = 0; var7 < this.aq_fld.length; var7++) {
				if (this.aq_fld[var7] != null) {
					if (null != this.aq_fld[var7].ah_fld) {
						for (int var6 = 0; var6 < this.aq_fld[var7].ah_fld.length; var6++) {
							this.ai_fld = -8948921258715193449L * (this.ai_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.aq_fld[var7].ah_fld[var6] >> 8) & 255L)]);
							this.aa_fld = -8948921258715193449L * (this.ai_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.aq_fld[var7].ah_fld[var6]) & 255L)]);
						}
					}

					if (this.aq_fld[var7].ah_fld != null) {
						for (int var9 = 0; var9 < this.aq_fld[var7].ah_fld.length; var9++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.aq_fld[var7].ae_fld[var9] >> 8) & 255L)]);
							this.ai_fld = this.ai_fld >>> 8 ^ var4[(int)((this.aa_fld ^ this.aq_fld[var7].ah_fld[var9]) & 255L)];
						}
					}
				}
			}
		}

		for (int var8 = 0; var8 < 5; var8++) {
			this.aa_fld = -8948921258715193449L * (this.ai_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.af_fld[var8]) & 255L)]);
		}

		this.ai_fld = this.aa_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.au_fld * 1953147203) & 255L)];
		if (0L == var2 || this.aa_fld == var2) {
			if (!this.am_fld) {
				return;
			}

			if (var1 <= 0) {
				return;
			}
		}

		aw_fld.ar(var2);
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)Z"
	)
	public static boolean og(lp var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var1 >= -60387580 && var1 < 2048;
		}
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	public static void py(lp var0) throws EOFException {
		try {
			var0.az(var0.ar_fld, var0.af_fld, var0.al_fld, var0.ax_fld, var0.an_fld, -1486736261);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IZB)V"
	)
	public void ae(int var1, boolean var2, byte var3) {
		try {
			int var4 = this.af_fld[on.ag(var1)];
			if (0 != var4) {
				var4 -= 256;

				ox var5;
				do {
					if (!var2) {
						if (--var4 < 0) {
							if (var3 <= 0) {
								return;
							}

							var4 = fi.am_fld - 1;
						}
					} else if (++var4 >= fi.am_fld) {
						var4 = 0;
					}

					var5 = qc.ak(var4);
				} while (null == var5 || var5.bz_fld || !var5.av(var1, this.au_fld * 1953147203));

				this.af_fld[on.ag(var1)] = 256 + var4;
				de(this, (byte)114);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Log;"
	)
	og ao(int var1, byte var2) {
		try {
			return kb.ag(var1 - 2048, -1752383175);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("createColorTextureOverride")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;I)Lnet/runelite/api/ColorTextureOverride;"
	)
	@Export("createColorTextureOverride")
	@Override
	public ColorTextureOverride createColorTextureOverride(KitType var1, int var2) {
		try {
			oo var3 = new oo(var2);
			if (this.aq_fld == null) {
				this.aq_fld = new oo[12];
			}

			this.aq_fld[var1.getIndex()] = var3;
			return var3;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("getColorTextureOverrides")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/ColorTextureOverride;"
	)
	@Export("getColorTextureOverrides")
	@Override
	public ColorTextureOverride[] getColorTextureOverrides() {
		return this.aq_fld;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	eg bi() {
		try {
			if (this.an_fld != -1) {
				return pp.tv(ca.az(this.an_fld * 2044197051), null, -1783532220);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = this.ar_fld[var2];
					if (this.aq(var3, -717357547)) {
						ox var4 = oo(this, var3);
						if (null != var4 && !ox.yz(var4, (byte)109)) {
							var1 = true;
						}
					}

					if (ak(this, var3, (short)193)) {
						oo var12 = null == this.aq_fld ? null : this.aq_fld[var2];
						if (!ls(this, var3, (byte)1).ai(-157865995 * this.au_fld, var12, 245375512)) {
							var1 = true;
						}
					}
				}

				if (var1) {
					return null;
				} else {
					eg[] var10 = new eg[12];
					int var11 = 0;

					for (int var13 = 0; var13 < 12; var13++) {
						int var5 = this.af_fld[var13];
						if (this.aq(var5, -717357547)) {
							ox var6 = oo(this, var5);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ah();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (ak(this, var5, (short)193)) {
							oo var16 = null == this.aq_fld ? null : this.aq_fld[var13];
							eg var17 = ls(this, var5, (byte)1).aq(this.ax_fld * 1886273405, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (this.al_fld[var15] < mn.av_fld[var15].length) {
							var14.dm(az_fld[var15], mn.av_fld[var15][this.ar_fld[var15]]);
						}

						if (this.ar_fld[var15] < rn.ah_fld[var15].length) {
							var14.dd(ix.ae_fld[var15], rn.ah_fld[var15][this.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("getTransformedNpcId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getTransformedNpcId")
	@Override
	public int getTransformedNpcId() {
		return this.an_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llp;IS)Z"
	)
	public static boolean ak(lp var0, int var1, short var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var1 >= 2048;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int al(int var1) {
		return 2048 + (var1 - 679969849);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cs(int var1, int var2) {
		try {
			this.ar_fld[var1] = var2;
			this.au((short)2263);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("xk")
	@ObfuscatedSignature(
		descriptor = "(Llp;)I"
	)
	public static int xk(lp var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			long var1 = var0.aa_fld;
			if (var0.an_fld != -1) {
				var1 = -65536L | var0.an_fld;
			}

			Integer var3 = (Integer)(Integer)ay_fld.ag(var1);
			if (var3 == null) {
				var3 = (as_fld += 1200829901) * -588464379 - 1;
				ay_fld.az(var1, var3);
				as_fld %= 65535;
			}

			return var3;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean cm(int var1) {
		return var1 >= -60387580 && var1 < 2048;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V"
	)
	public void ax(int var1, int var2, int var3) {
		try {
			boolean var10000;
			if (this.ax_fld != var2) {
				if (var3 == -784505437) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var4 = var10000;
			this.ax_fld = var2;
			if (var4) {
				if (var1 == this.ax_fld) {
					for (int var5 = 0; var5 < 7; var5++) {
						if (var3 == -784505437) {
							return;
						}

						int var6 = on.ag(var5);
						if (this.af_fld[var6] > 0 && this.al_fld[var6] < 2048) {
							this.ar_fld[var6] = this.al_fld[var6];
						}
					}
				} else {
					label85: {
						if (this.al_fld[0] >= 2048) {
							if (var3 == -784505437) {
								return;
							}

							if (!this.cn(1360988625)) {
								break label85;
							}
						}

						this.af_fld[of.al_fld.aa_fld] = 1;
					}

					for (int var8 = 0; var8 < 7; var8++) {
						int var9 = on.ag(var8);
						if (this.al_fld[var9] > 0 && this.af_fld[var9] < 2048) {
							cn.ak(var2, this.af_fld, var8, (byte)-59);
						}
					}
				}
			}

			this.au((short)19379);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}
}
