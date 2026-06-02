import java.io.EOFException;
import java.util.Arrays;
import net.runelite.api.ColorTextureOverride;
import net.runelite.api.PlayerComposition;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.kit.KitType;

@ObfuscatedName("lp")
@Implements({"PlayerComposition"})
public class lp implements PlayerComposition {
	@ObfuscatedGetter(
		intValue = -588464379
	)
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = -1905459279
	)
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
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
	@ObfuscatedGetter(
		intValue = 1953147203
	)
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int au_fld = 2125788377;
	@ObfuscatedGetter(
		intValue = 1953147203
	)
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ax_fld = 0;
	@ObfuscatedGetter(
		longValue = -930543222749818841L
	)
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	long aa_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ar_fld;
	@ObfuscatedGetter(
		longValue = -930543222749818841L
	)
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "J"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)Z"
	)
	public static boolean an(lp var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var0.ad(var0.af_fld[0], (short)193)) {
				og var2 = er(var0, var0.af_fld[0], (byte)1);
				return of.al_fld.aa_fld != var2.eb_fld && of.al_fld.aa_fld != var2.ed_fld;
			} else {
				return false;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[II)V"
	)
	static void ac(int var0, int[] var1, int var2) throws EOFException {
		try {
			for (int var3 = 0; var3 < fi.am_fld; var3++) {
				ox var4 = qc.ak(var3);
				if (null != var4 && !var4.bz_fld && ox.vd(var4, var2, var0)) {
					var1[on.ag(var2)] = var3 + 256;
					break;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([I[I[Loo;Z[IIIIB)V"
	)
	public void ag(int[] var1, int[] var2, oo[] var3, boolean var4, int[] var5, int var6, int var7, int var8, byte var9) {
		try {
			this.aq_fld = var3;
			this.am_fld = var4;
			this.au_fld = var8 * -2125788377;
			this.az(var1, var2, var5, var6, var7, 338885480);
		} catch (Throwable var10) {
			throw new RuntimeException(var10);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IS)Z"
	)
	boolean ad(int var1, short var2) {
		return var1 >= 2048;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cb(int var1) {
		return 1363073916 + (var1 - -1045654243);
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
		zd(this, (byte)62);
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Llp;Lxi;)V"
	)
	public static void qh(lp var0, xi var1) {
		var1.bc(var0.ax_fld);

		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = var0.af_fld[on.ag(var2)];
			if (0 == var3) {
				var1.bw(-1);
			} else {
				var1.bw(var3 - 256);
			}
		}

		for (int var4 = 0; var4 < 5; var4++) {
			var1.bc(var0.al_fld[var4]);
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
				} while (null == var5 || var5.bz_fld || !ox.vd(var5, var1, this.ax_fld));

				this.af_fld[on.ag(var1)] = 256 + var4;
				zd(this, (byte)114);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("setTransformedNpcId")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setTransformedNpcId(int var1) {
		this.an_fld = var1;
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

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Llp;IB)Log;"
	)
	public static og er(lp var0, int var1, byte var2) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return kb.ag(var1 - 2048, -1752383175);
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void ai(int var1, byte var2) {
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
				this.af_fld[-1990169435 * var3.ed_fld] = 0;
			}

			this.au((short)816);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Llp;[I[I[III)V"
	)
	public static void ma(lp var0, int[] var1, int[] var2, int[] var3, int var4, int var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			if (var1 == null) {
				var1 = ug(var0, var4);
			}

			if (var2 == null) {
				var2 = ug(var0, var4);
			}

			var0.ar_fld = var1;
			var0.af_fld = var2;
			var0.al_fld = var3;
			var0.ax_fld = var4;
			var0.an_fld = var5;
			zd(var0, (byte)91);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean aq(int var1, int var2) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean cm(int var1) {
		return var1 >= 589984965;
	}

	@ObfuscatedName("zd")
	@ObfuscatedSignature(
		descriptor = "(Llp;B)V"
	)
	public static void zd(lp var0, byte var1) {
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
						if (null != var0.aq_fld[var7].ah_fld) {
							for (int var6 = 0; var6 < var0.aq_fld[var7].ah_fld.length; var6++) {
								var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.aq_fld[var7].ah_fld[var6] >> 8) & 255L)]);
								var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.aq_fld[var7].ah_fld[var6]) & 255L)]);
							}
						}

						if (var0.aq_fld[var7].ae_fld != null) {
							for (int var9 = 0; var9 < var0.aq_fld[var7].ae_fld.length; var9++) {
								var0.aa_fld = -8948921258715193449L * (var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.aq_fld[var7].ae_fld[var9] >> 8) & 255L)]);
								var0.aa_fld = var0.aa_fld >>> 8 ^ var4[(int)((var0.aa_fld ^ var0.aq_fld[var7].ae_fld[var9]) & 255L)];
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

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(Llp;Lol;ILol;IB)Lfn;"
	)
	public static fn ph(lp var0, ol var1, int var2, ol var3, int var4, byte var5) throws EOFException {
		try {
			if (var0 == null) {
				throw new NullPointerException();
			} else if (var0.an_fld != -1) {
				return ca.az(var0.an_fld).aw(var1, var2, var3, var4, null, 1195293953);
			} else {
				long var6 = var0.aa_fld;
				int[] var8 = var0.af_fld;
				if (null != var1 && (var1.bi_fld >= 0 || var1.bu_fld >= 0)) {
					var8 = new int[12];
					System.arraycopy(var0.af_fld, 0, var8, 0, var8.length);
					if (var1.bi_fld >= 0) {
						var6 ^= (long)(var1.bi_fld - var0.af_fld[of.ah_fld.aa_fld]) << 40;
						var8[of.ah_fld.aa_fld] = var0.ab(var1.bi_fld, -1684678759);
					}

					if (var1.bu_fld >= 0) {
						var6 ^= (long)(var1.bu_fld - var0.af_fld[of.av_fld.aa_fld]) << 48;
						var8[of.av_fld.aa_fld] = var0.ab(var1.bu_fld, -1684678759);
					}
				}

				fn var9 = (fn)aw_fld.ak(var6);
				if (null == var9) {
					boolean var10 = false;

					for (int var11 = 0; var11 < 12; var11++) {
						int var12 = var8[var11];
						if (var0.aq(var12, -717357547)) {
							ox var13 = var0.am(var12, -614347852);
							if (null != var13 && !var13.ae()) {
								var10 = true;
							}
						}

						if (var0.ad(var12, (short)193)) {
							oo var22 = var0.aq_fld == null ? null : var0.aq_fld[var11];
							if (!og.vo(er(var0, var12, (byte)1), var0.ax_fld, var22)) {
								var10 = true;
							}
						}
					}

					if (var10) {
						if (-1L != var0.ai_fld) {
							var9 = (fn)aw_fld.ak(var0.ai_fld * -2733217539101250935L);
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
							if (var0.aq(var14, -717357547)) {
								ox var15 = var0.am(var14, -1668243504);
								eg var16 = null;
								if (null != var15) {
									var16 = var15.ah();
								}

								if (var16 != null) {
									var20[var21++] = var16;
								}
							}

							if (var0.ad(var14, (short)193)) {
								og var26 = er(var0, var14, (byte)1);
								oo var27 = null == var0.aq_fld ? null : var0.aq_fld[var23];
								eg var17 = var26.aa(var0.ax_fld, var27, (byte)42);
								if (null != var17) {
									var20[var21++] = var17;
								}
							}
						}

						eg var24 = new eg(var20, var21);

						for (int var25 = 0; var25 < 5; var25++) {
							if (var0.al_fld[var25] < mn.av_fld[var25].length) {
								eg.hm(var24, az_fld[var25], mn.av_fld[var25][var0.al_fld[var25]]);
							}

							if (var0.al_fld[var25] < rn.ah_fld[var25].length) {
								eg.hm(var24, ix.ae_fld[var25], rn.ah_fld[var25][var0.al_fld[var25]]);
							}
						}

						var9 = var24.bx(64, 850, -30, -50, -30);
						aw_fld.az(var9, var6);
						var0.ai_fld = var6 * -7445695333835609159L;
					}
				}

				fn var19;
				if (var1 == null && null == var3) {
					var19 = var9.ay(true);
				} else if (var1 != null && null != var3) {
					var19 = var1.au(var9, var2, var3, var4, 1694329828);
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
				if (null != var4 && !var4.bz_fld && ox.vd(var4, var2, var0)) {
					var1[on.ag(var2)] = var3 + 256;
					break;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("getEquipmentIds")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getEquipmentIds() {
		return this.af_fld;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[II)V"
	)
	static void at(int var0, int[] var1, int var2) throws EOFException {
		try {
			for (int var3 = 0; var3 < fi.am_fld; var3++) {
				ox var4 = qc.ak(var3);
				if (null != var4 && !var4.bz_fld && ox.vd(var4, var2, var0)) {
					var1[on.ag(var2)] = var3 + 256;
					break;
				}
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("getColors")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getColors() {
		return this.al_fld;
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

	@ObfuscatedName("getTransformedNpcId")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getTransformedNpcId() {
		return this.an_fld;
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void bs(int var1, boolean var2) {
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
				} while (null == var4 || var4.bz_fld || !ox.vd(var4, var1, this.ax_fld));

				this.af_fld[on.ag(var1)] = 256 + var3;
				zd(this, (byte)114);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void bz(int var1, boolean var2) {
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
				} while (null == var4 || var4.bz_fld || !ox.vd(var4, var1, this.ax_fld));

				this.af_fld[on.ag(var1)] = 256 + var3;
				zd(this, (byte)16);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	public lp() {
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IZ)V"
	)
	public void be(int var1, boolean var2) {
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
		zd(this, (byte)80);
	}

	@ObfuscatedName("removeColorTextureOverride")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;)V"
	)
	@Override
	public void removeColorTextureOverride(KitType var1) {
		if (this.aq_fld != null) {
			this.aq_fld[var1.getIndex()] = null;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Llp;Lxi;I)V"
	)
	public static void ij(lp var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var1.bc(var0.ax_fld);

			for (int var3 = 0; var3 < 7; var3++) {
				int var4 = var0.af_fld[on.ag(var3)];
				if (0 == var4) {
					if (var2 >= 681955997) {
						return;
					}

					var1.bw(-1);
				} else {
					var1.bw(var4 - 256);
				}
			}

			for (int var5 = 0; var5 < 5; var5++) {
				var1.bc(var0.al_fld[var5]);
			}
		}
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

	@ObfuscatedName("setHash")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	public void setHash() {
		zd(this, (byte)66);
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

	@ObfuscatedName("getColorTextureOverride")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;)Lnet/runelite/api/ColorTextureOverride;"
	)
	@Override
	public ColorTextureOverride getColorTextureOverride(KitType var1) {
		return this.aq_fld != null ? this.aq_fld[var1.getIndex()] : null;
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
		var1.bc(1298188575 * this.ax_fld);

		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = this.af_fld[on.ag(var2)];
			if (0 == var3) {
				var1.bw(-1);
			} else {
				var1.bw(var3 - 256);
			}
		}

		for (int var4 = 0; var4 < 5; var4++) {
			var1.bc(this.al_fld[var4]);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Leg;"
	)
	eg af(byte var1) {
		try {
			if (this.an_fld != -1) {
				return ca.az(this.an_fld).ay(null, -1748724218);
			} else {
				boolean var2 = false;

				for (int var3 = 0; var3 < 12; var3++) {
					int var4 = this.af_fld[var3];
					if (this.aq(var4, -717357547)) {
						ox var5 = this.am(var4, -1295396224);
						if (null != var5 && !ox.nq(var5, (byte)54)) {
							var2 = true;
						}
					}

					if (this.ad(var4, (short)193)) {
						oo var12 = null == this.aq_fld ? null : this.aq_fld[var3];
						if (!er(this, var4, (byte)1).ai(this.ax_fld, var12, -428245724)) {
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
							ox var7 = this.am(var6, 1429223058);
							eg var8 = null;
							if (var7 != null) {
								var8 = var7.ay();
							}

							if (null != var8) {
								var10[var11++] = var8;
							}
						}

						if (this.ad(var6, (short)193)) {
							oo var16 = null == this.aq_fld ? null : this.aq_fld[var13];
							eg var17 = er(this, var6, (byte)1).aq(this.ax_fld, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (this.al_fld[var15] < mn.av_fld[var15].length) {
							eg.hm(var14, az_fld[var15], mn.av_fld[var15][this.al_fld[var15]]);
						}

						if (this.al_fld[var15] < rn.ah_fld[var15].length) {
							eg.hm(var14, ix.ae_fld[var15], rn.ah_fld[var15][this.al_fld[var15]]);
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
					if (null != this.aq_fld[var6].ah_fld) {
						for (int var5 = 0; var5 < this.aq_fld[var6].ah_fld.length; var5++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ah_fld[var5] >> 8) & 255L)]);
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ah_fld[var5]) & 255L)]);
						}
					}

					if (this.aq_fld[var6].ae_fld != null) {
						for (int var8 = 0; var8 < this.aq_fld[var6].ae_fld.length; var8++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ae_fld[var8] >> 8) & 255L)]);
							this.aa_fld = this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ae_fld[var8]) & 255L)];
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
					if (null != this.aq_fld[var6].ah_fld) {
						for (int var5 = 0; var5 < this.aq_fld[var6].ah_fld.length; var5++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ah_fld[var5] >> 8) & 255L)]);
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ah_fld[var5]) & 255L)]);
						}
					}

					if (this.aq_fld[var6].ae_fld != null) {
						for (int var8 = 0; var8 < this.aq_fld[var6].ae_fld.length; var8++) {
							this.aa_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ae_fld[var8] >> 8) & 255L)]);
							this.aa_fld = this.aa_fld >>> 8 ^ var3[(int)((this.aa_fld ^ this.aq_fld[var6].ae_fld[var8]) & 255L)];
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean cf() {
		try {
			if (!this.ad(this.af_fld[0], (short)193)) {
				return false;
			} else {
				og var1 = er(this, this.af_fld[0], (byte)1);
				return of.al_fld.aa_fld != var1.eb_fld && of.al_fld.aa_fld != var1.ed_fld;
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)I"
	)
	public static int pi(lp var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return 2048 + (var1 - 679969849);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
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
							ox var12 = this.am(var11, -1716470112);
							if (null != var12 && !var12.ae()) {
								var9 = true;
							}
						}

						if (this.ad(var11, (short)193)) {
							oo var22 = this.aq_fld == null ? null : this.aq_fld[var10];
							if (!og.vo(er(this, var11, (byte)1), this.ax_fld, var22)) {
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
								ox var14 = this.am(var13, -1744953134);
								eg var15 = null;
								if (null != var14) {
									var15 = var14.ah();
								}

								if (var15 != null) {
									var20[var21++] = var15;
								}
							}

							if (this.ad(var13, (short)193)) {
								og var26 = er(this, var13, (byte)1);
								oo var27 = null == this.aq_fld ? null : this.aq_fld[var23];
								eg var16 = var26.aa(this.ax_fld, var27, (byte)120);
								if (null != var16) {
									var20[var21++] = var16;
								}
							}
						}

						eg var24 = new eg(var20, var21);

						for (int var25 = 0; var25 < 5; var25++) {
							if (this.al_fld[var25] < mn.av_fld[var25].length) {
								eg.hm(var24, az_fld[var25], mn.av_fld[var25][this.al_fld[var25]]);
							}

							if (this.al_fld[var25] < rn.ah_fld[var25].length) {
								eg.hm(var24, ix.ae_fld[var25], rn.ah_fld[var25][this.al_fld[var25]]);
							}
						}

						var8 = var24.bx(64, 850, -30, -50, -30);
						aw_fld.az(var8, var5);
						this.ai_fld = var5 * -7445695333835609159L;
					}
				}

				fn var19;
				if (var1 == null && null == var3) {
					var19 = var8.ay(true);
				} else if (var1 != null && null != var3) {
					var19 = var1.au(var8, var2, var3, var4, 1805991101);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void aw(int var1, byte var2) {
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	eg bu() {
		try {
			if (this.an_fld != -1) {
				return ca.az(this.an_fld).ay(null, -1845879739);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = this.af_fld[var2];
					if (this.aq(var3, -717357547)) {
						ox var4 = this.am(var3, 841316294);
						if (null != var4 && !ox.nq(var4, (byte)109)) {
							var1 = true;
						}
					}

					if (this.ad(var3, (short)193)) {
						oo var12 = null == this.aq_fld ? null : this.aq_fld[var2];
						if (!er(this, var3, (byte)1).ai(this.ax_fld, var12, -1622134892)) {
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
							ox var6 = this.am(var5, -1855661364);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ay();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (this.ad(var5, (short)193)) {
							oo var16 = null == this.aq_fld ? null : this.aq_fld[var13];
							eg var17 = er(this, var5, (byte)1).aq(this.ax_fld, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (this.al_fld[var15] < mn.av_fld[var15].length) {
							eg.hm(var14, az_fld[var15], mn.av_fld[var15][this.al_fld[var15]]);
						}

						if (this.al_fld[var15] < rn.ah_fld[var15].length) {
							eg.hm(var14, ix.ae_fld[var15], rn.ah_fld[var15][this.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "(Llp;III)V"
	)
	public static void ub(lp var0, int var1, int var2, int var3) throws EOFException {
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

								if (!an(var0, 1360988625)) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V"
	)
	public void az(int[] var1, int[] var2, int[] var3, int var4, int var5, int var6) {
		try {
			if (var1 == null) {
				var1 = ug(this, var4);
			}

			if (var2 == null) {
				if (var6 == 575364193) {
					return;
				}

				var2 = ug(this, var4);
			}

			this.ar_fld = var1;
			this.af_fld = var2;
			this.al_fld = var3;
			this.ax_fld = var4;
			this.an_fld = var5;
			zd(this, (byte)66);
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("xo")
	@ObfuscatedSignature(
		descriptor = "(Llp;[I[I[III)V"
	)
	public static void xo(lp var0, int[] var1, int[] var2, int[] var3, int var4, int var5) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				if (var1 == null) {
					var1 = ug(var0, var4);
				}

				if (var2 == null) {
					var2 = ug(var0, var4);
				}

				var0.ar_fld = var1;
				var0.af_fld = var2;
				var0.al_fld = var3;
				var0.ax_fld = var4;
				var0.an_fld = var5;
				zd(var0, (byte)86);
			}
		} catch (Throwable var7) {
			throw new RuntimeException(var7);
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int bc() {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int al(int var1) {
		long var2 = this.aa_fld;
		if (this.an_fld != -1) {
			var2 = -65536L | this.an_fld;
		}

		Integer var4 = (Integer)(Integer)ay_fld.ag(var2);
		if (var4 == null) {
			var4 = (as_fld += 1200829901) * -588464379 - 1;
			ay_fld.az(var2, var4);
			as_fld %= 65535;
		}

		return var4;
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

	@ObfuscatedName("getColorTextureOverrides")
	@ObfuscatedSignature(
		descriptor = "()[Lnet/runelite/api/ColorTextureOverride;"
	)
	@Override
	public ColorTextureOverride[] getColorTextureOverrides() {
		return this.aq_fld;
	}

	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)V"
	)
	public static void st(lp var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			og var2 = kb.ag(var1, -1752383175);
			var0.af_fld[var2.ep_fld * -296490700] = var1 + 2048;
			if (var2.eb_fld != -1) {
				var0.af_fld[var2.eb_fld * 681741211] = 0;
			}

			if (-1 != var2.ed_fld) {
				var0.af_fld[-1990169435 * var2.ed_fld] = 0;
			}

			var0.au((short)-14101);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int cu(int var1) {
		return 2048 + (var1 - 512);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cc() {
		try {
			this.az(this.ar_fld, this.af_fld, this.al_fld, this.ax_fld * 858051625, this.an_fld, 138696245);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getGender")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getGender() {
		return this.ax_fld;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void cq() {
		try {
			this.az(this.ar_fld, this.af_fld, this.al_fld, this.ax_fld, this.an_fld, -1486736261);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Llp;)Leg;"
	)
	public static eg hi(lp var0) throws EOFException {
		try {
			if (var0.an_fld != -1) {
				return ca.az(var0.an_fld).ay(null, -1780879948);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = var0.af_fld[var2];
					if (var0.aq(var3, -717357547)) {
						ox var4 = var0.am(var3, -711831315);
						if (null != var4 && !ox.nq(var4, (byte)26)) {
							var1 = true;
						}
					}

					if (var0.ad(var3, (short)193)) {
						oo var12 = null == var0.aq_fld ? null : var0.aq_fld[var2];
						if (!er(var0, var3, (byte)1).ai(var0.ax_fld, var12, -1322603220)) {
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
							ox var6 = var0.am(var5, -2064443562);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ay();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (var0.ad(var5, (short)193)) {
							oo var16 = null == var0.aq_fld ? null : var0.aq_fld[var13];
							eg var17 = er(var0, var5, (byte)1).aq(var0.ax_fld, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (var0.al_fld[var15] < mn.av_fld[var15].length) {
							eg.hm(var14, az_fld[var15], mn.av_fld[var15][var0.al_fld[var15]]);
						}

						if (var0.al_fld[var15] < rn.ah_fld[var15].length) {
							eg.hm(var14, ix.ae_fld[var15], rn.ah_fld[var15][var0.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
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
					if (this.af_fld[0] < 2048 || an(this, 820612562)) {
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
					if (this.af_fld[0] < 2048 || an(this, 464288058)) {
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "()Leg;"
	)
	eg bi() {
		try {
			if (this.an_fld != -1) {
				return ca.az(this.an_fld * 2044197051).ay(null, -1783532220);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = this.af_fld[var2];
					if (this.aq(var3, -717357547)) {
						ox var4 = this.am(var3, 1708294303);
						if (null != var4 && !ox.nq(var4, (byte)109)) {
							var1 = true;
						}
					}

					if (this.ad(var3, (short)193)) {
						oo var12 = null == this.aq_fld ? null : this.aq_fld[var2];
						if (!er(this, var3, (byte)1).ai(-157865995 * this.ax_fld, var12, 245375512)) {
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
							ox var6 = this.am(var5, 962046161);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ay();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (this.ad(var5, (short)193)) {
							oo var16 = null == this.aq_fld ? null : this.aq_fld[var13];
							eg var17 = er(this, var5, (byte)1).aq(this.ax_fld * 1886273405, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (this.al_fld[var15] < mn.av_fld[var15].length) {
							eg.hm(var14, az_fld[var15], mn.av_fld[var15][this.al_fld[var15]]);
						}

						if (this.al_fld[var15] < rn.ah_fld[var15].length) {
							eg.hm(var14, ix.ae_fld[var15], rn.ah_fld[var15][this.al_fld[var15]]);
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
				} while (null == var4 || var4.bz_fld || !ox.vd(var4, var1, this.ax_fld));

				this.af_fld[on.ag(var1)] = 256 + var3;
				zd(this, (byte)100);
			}
		} catch (Throwable var6) {
			throw new RuntimeException(var6);
		}
	}

	@ObfuscatedName("getEquipmentId")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;)I"
	)
	@Override
	public int getEquipmentId(KitType var1) {
		int var2 = this.getEquipmentIds()[var1.getIndex()];
		return var2 < 2048 ? -1 : var2 - 2048;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cs(int var1, int var2) {
		try {
			this.al_fld[var1] = var2;
			this.au((short)2263);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)V"
	)
	public void cp(int var1, int var2) {
		try {
			this.al_fld[var1] = var2;
			this.au((short)4229);
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean cn(int var1) {
		return var1 >= -60387580 && var1 < 2048;
	}

	lp(lp var1) throws EOFException {
		if (null != var1) {
			int[] var2 = Arrays.copyOf(var1.af_fld, var1.af_fld.length);
			int[] var3 = Arrays.copyOf(var1.ar_fld, var1.ar_fld.length);
			oo[] var4 = null != var1.aq_fld ? Arrays.copyOf(var1.aq_fld, var1.aq_fld.length) : null;
			int[] var5 = Arrays.copyOf(var1.al_fld, var1.al_fld.length);
			this.ag(var3, var2, var4, false, var5, var1.ax_fld, var1.an_fld, var1.au_fld * -753683305, (byte)-23);
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

	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "(Llp;IZ)V"
	)
	public static void rk(lp var0, int var1, boolean var2) {
		int var3 = var0.al_fld[var1];
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

		var0.al_fld[var1] = var3;
		zd(var0, (byte)109);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	public static void ii(lp var0) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.az(var0.ar_fld, var0.af_fld, var0.al_fld, var0.ax_fld, var0.an_fld, 1540294160);
			}
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)[I"
	)
	public static int[] ug(lp var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			int[] var3 = new int[12];

			for (int var4 = 0; var4 < 7; var4++) {
				cn.ak(var1, var3, var4, (byte)-51);
			}

			return var3;
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Lox;"
	)
	ox cw(int var1) {
		try {
			return qc.ak(var1 - 256);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)Lox;"
	)
	public static ox bb(lp var0, int var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			}

			return qc.ak(var1 - 256);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	void bb() {
		try {
			this.az(this.ar_fld, this.af_fld, this.al_fld, this.ax_fld, this.an_fld, -1018594127);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getKitId")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;)I"
	)
	@Override
	public int getKitId(KitType var1) {
		int var2 = this.getEquipmentIds()[var1.getIndex()];
		return var2 >= 256 && var2 < 2048 ? var2 - 256 : -1;
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lol;ILol;I)Lfn;"
	)
	public fn bp(ol var1, int var2, ol var3, int var4) {
		try {
			if (this.an_fld != -1) {
				return ca.az(this.an_fld * -1278473155).aw(var1, var2, var3, var4, null, 1723784842);
			} else {
				long var5 = this.aa_fld;
				int[] var7 = this.af_fld;
				if (null != var1 && (var1.bi_fld >= 0 || var1.bu_fld >= 0)) {
					var7 = new int[12];
					System.arraycopy(this.af_fld, 0, var7, 0, var7.length);
					if (var1.bi_fld * -947518773 >= 0) {
						var5 ^= (long)(var1.bi_fld - this.af_fld[of.ah_fld.aa_fld * -1949324611]) << 40;
						var7[of.ah_fld.aa_fld * 1507944290] = this.ab(var1.bi_fld * 2128710014, -1684678759);
					}

					if (var1.bu_fld >= 0) {
						var5 ^= (long)(var1.bu_fld - this.af_fld[of.av_fld.aa_fld * 1802823963]) << 48;
						var7[of.av_fld.aa_fld * 702342339] = this.ab(914600407 * var1.bu_fld, -1684678759);
					}
				}

				fn var8 = (fn)aw_fld.ak(var5);
				if (null == var8) {
					boolean var9 = false;

					for (int var10 = 0; var10 < 12; var10++) {
						int var11 = var7[var10];
						if (this.aq(var11, -717357547)) {
							ox var12 = this.am(var11, 386270839);
							if (null != var12 && !var12.ae()) {
								var9 = true;
							}
						}

						if (this.ad(var11, (short)193)) {
							oo var22 = this.aq_fld == null ? null : this.aq_fld[var10];
							if (!og.vo(er(this, var11, (byte)1), this.ax_fld, var22)) {
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
								ox var14 = this.am(var13, 1829855829);
								eg var15 = null;
								if (null != var14) {
									var15 = var14.ah();
								}

								if (var15 != null) {
									var20[var21++] = var15;
								}
							}

							if (this.ad(var13, (short)193)) {
								og var26 = er(this, var13, (byte)1);
								oo var27 = null == this.aq_fld ? null : this.aq_fld[var23];
								eg var16 = var26.aa(this.ax_fld, var27, (byte)24);
								if (null != var16) {
									var20[var21++] = var16;
								}
							}
						}

						eg var24 = new eg(var20, var21);

						for (int var25 = 0; var25 < 5; var25++) {
							if (this.al_fld[var25] < mn.av_fld[var25].length) {
								eg.hm(var24, az_fld[var25], mn.av_fld[var25][this.al_fld[var25]]);
							}

							if (this.al_fld[var25] < rn.ah_fld[var25].length) {
								eg.hm(var24, ix.ae_fld[var25], rn.ah_fld[var25][this.al_fld[var25]]);
							}
						}

						var8 = var24.bx(-2059515371, -716390962, 1533716246, -880691240, 858651678);
						aw_fld.az(var8, var5);
						this.ai_fld = var5 * -7445695333835609159L;
					}
				}

				fn var19;
				if (var1 == null && null == var3) {
					var19 = var8.ay(true);
				} else if (var1 != null && null != var3) {
					var19 = var1.au(var8, var2, var3, var4, 1498642374);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)Loc;"
	)
	static oc ae(xi var0) {
		if (null != var0) {
			boolean var2 = false;
			byte var3 = -1;
			boolean var4 = false;
			boolean var5 = false;
			boolean var6 = false;
			int var7 = xi.tx(var0, 1681344961);
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
		descriptor = "(IIIIII)V"
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
		tu.md(ej.br_fld, var3 - var0, var4 - var1, var5 - var2, (byte)19);
		ej.br_fld.al();
		ej.bk_fld = true;
	}

	@ObfuscatedName("createColorTextureOverride")
	@ObfuscatedSignature(
		descriptor = "(Lnet/runelite/api/kit/KitType;I)Lnet/runelite/api/ColorTextureOverride;"
	)
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

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	public static void ds(lp var0) throws EOFException {
		try {
			var0.az(var0.ar_fld, var0.af_fld, var0.al_fld, var0.ax_fld, var0.an_fld, 428387755);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public void ay(xi var1, int var2) {
		var1.cn(this.ax_fld, -516160551);

		for (int var3 = 0; var3 < 7; var3++) {
			int var4 = this.al_fld[on.ag(var3)];
			if (0 == var4) {
				if (var2 >= 681955997) {
					return;
				}

				var1.ce(-1);
			} else {
				var1.ee(var4 - 256);
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			var1.bw(this.al_fld[var5]);
		}
	}

	@ObfuscatedName("isFemale")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
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
			this.ai_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var4[(int)((this.aa_fld ^ this.af_fld[var5] >> 24) & 255L)]);
			this.ai_fld = -8948921258715193449L * (this.ai_fld >>> 8 ^ var4[(int)((this.aa_fld ^ this.ar_fld[var5] >> 16) & 255L)]);
			this.ai_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.af_fld[var5] >> 8) & 255L)]);
			this.ai_fld = this.aa_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.af_fld[var5]) & 255L)];
		}

		if (null != this.aq_fld) {
			for (int var7 = 0; var7 < this.aq_fld.length; var7++) {
				if (this.aq_fld[var7] != null) {
					if (null != this.aq_fld[var7].ah_fld) {
						for (int var6 = 0; var6 < this.aq_fld[var7].ah_fld.length; var6++) {
							this.ai_fld = -8948921258715193449L * (this.ai_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.aq_fld[var7].ae_fld[var6] >> 8) & 255L)]);
							this.ai_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var4[(int)((this.aa_fld ^ this.aq_fld[var7].ae_fld[var6]) & 255L)]);
						}
					}

					if (this.aq_fld[var7].ae_fld != null) {
						for (int var9 = 0; var9 < this.aq_fld[var7].ah_fld.length; var9++) {
							this.ai_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.aq_fld[var7].ae_fld[var9] >> 8) & 255L)]);
							this.aa_fld = this.ai_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.aq_fld[var7].ah_fld[var9]) & 255L)];
						}
					}
				}
			}
		}

		for (int var8 = 0; var8 < 5; var8++) {
			this.ai_fld = -8948921258715193449L * (this.aa_fld >>> 8 ^ var4[(int)((this.ai_fld ^ this.al_fld[var8]) & 255L)]);
		}

		this.aa_fld = this.aa_fld >>> 8 ^ var4[(int)((this.aa_fld ^ this.au_fld) & 255L)];
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lol;ILol;IB)Lfn;"
	)
	public fn ar(ol var1, int var2, ol var3, int var4, byte var5) {
		try {
			if (this.an_fld != -1) {
				return ca.az(this.an_fld).aw(var1, var2, var3, var4, null, 1195293953);
			} else {
				long var6 = this.ai_fld;
				int[] var8 = this.af_fld;
				if (null != var1 && (var1.bi_fld >= 0 || -460905393 * var1.bc_fld >= 0)) {
					var8 = new int[12];
					System.arraycopy(this.af_fld, 0, var8, 0, var8.length);
					if (var1.yl_fld >= 0) {
						var6 ^= (long)(var1.bc_fld - this.al_fld[of.ah_fld.aa_fld]) << 40;
						var8[of.ah_fld.aa_fld] = this.ab(var1.bw_fld * 1853075277, -1684678759);
					}

					if (-460905393 * var1.bi_fld >= 0) {
						var6 ^= (long)(var1.bn_fld - this.ar_fld[of.ah_fld.aa_fld]) << 48;
						var8[of.al_fld.aa_fld] = this.ab(-460905393 * var1.ba_fld, -1684678759);
					}
				}

				fn var9 = (fn)aw_fld.ay(var6);
				if (null == var9) {
					boolean var10 = false;

					for (int var11 = 0; var11 < 12; var11++) {
						int var12 = var8[var11];
						if (this.aq(var12, -717357547)) {
							ox var13 = this.am(var12, -614347852);
							if (null != var13 && !var13.ae()) {
								var10 = true;
							}
						}

						if (this.ad(var12, (short)193)) {
							oo var22 = this.aq_fld == null ? null : this.aq_fld[var11];
							if (!og.vo(er(this, var12, (byte)1), this.ax_fld, var22)) {
								var10 = true;
							}
						}
					}

					if (var10) {
						if (-1L != this.aa_fld) {
							var9 = (fn)aw_fld.aw(this.ai_fld * -2733217539101250935L);
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
								ox var15 = this.am(var14, -1668243504);
								eg var16 = null;
								if (null != var15) {
									var16 = var15.ay();
								}

								if (var16 != null) {
									var20[var21++] = var16;
								}
							}

							if (this.ad(var14, (short)193)) {
								og var26 = er(this, var14, (byte)1);
								oo var27 = null == this.aq_fld ? null : this.aq_fld[var23];
								eg var17 = var26.aa(this.au_fld, var27, (byte)42);
								if (null != var17) {
									var20[var21++] = var17;
								}
							}
						}

						eg var24 = new eg(var20, var21);

						for (int var25 = 0; var25 < 5; var25++) {
							if (this.ar_fld[var25] < mn.av_fld[var25].length) {
								eg.hm(var24, az_fld[var25], mn.av_fld[var25][this.ar_fld[var25]]);
							}

							if (this.al_fld[var25] < rn.ah_fld[var25].length) {
								eg.hm(var24, ix.ae_fld[var25], rn.ah_fld[var25][this.ar_fld[var25]]);
							}
						}

						var9 = var24.bx(64, 850, -30, -50, -30);
						aw_fld.nk(var9, var6);
						this.aa_fld = var6 * -7445695333835609159L;
					}
				}

				fn var19;
				if (var1 == null && null == var3) {
					var19 = var9.cl(true);
				} else if (var1 != null && null != var3) {
					var19 = var1.au(var9, var2, var3, var4, 1694329828);
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

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(Llp;)Leg;"
	)
	public static eg er(lp var0) throws EOFException {
		try {
			if (var0.an_fld != -1) {
				return ca.az(var0.an_fld).ay(null, -2012700360);
			} else {
				boolean var1 = false;

				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = var0.af_fld[var2];
					if (var0.aq(var3, -717357547)) {
						ox var4 = var0.am(var3, 48550787);
						if (null != var4 && !ox.nq(var4, (byte)88)) {
							var1 = true;
						}
					}

					if (var0.ad(var3, (short)193)) {
						oo var12 = null == var0.aq_fld ? null : var0.aq_fld[var2];
						if (!er(var0, var3, (byte)1).ai(var0.ax_fld, var12, 2099099266)) {
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
							ox var6 = var0.am(var5, -1788894782);
							eg var7 = null;
							if (var6 != null) {
								var7 = var6.ay();
							}

							if (null != var7) {
								var10[var11++] = var7;
							}
						}

						if (var0.ad(var5, (short)193)) {
							oo var16 = null == var0.aq_fld ? null : var0.aq_fld[var13];
							eg var17 = er(var0, var5, (byte)1).aq(var0.ax_fld, var16, -1990169435);
							if (var17 != null) {
								var10[var11++] = var17;
							}
						}
					}

					eg var14 = new eg(var10, var11);

					for (int var15 = 0; var15 < 5; var15++) {
						if (var0.al_fld[var15] < mn.av_fld[var15].length) {
							eg.hm(var14, az_fld[var15], mn.av_fld[var15][var0.al_fld[var15]]);
						}

						if (var0.al_fld[var15] < rn.ah_fld[var15].length) {
							eg.hm(var14, ix.ae_fld[var15], rn.ah_fld[var15][var0.al_fld[var15]]);
						}
					}

					return var14;
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean an(int var1) {
		return var1 >= 589984965;
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
			this.au_fld = var2;
			if (var4) {
				if (var1 == this.ax_fld) {
					for (int var5 = 0; var5 < 7; var5++) {
						if (var3 == -784505437) {
							return;
						}

						int var6 = on.ag(var5);
						if (this.al_fld[var6] > 0 && this.ar_fld[var6] < 2048) {
							this.al_fld[var6] = this.al_fld[var6];
						}
					}
				} else {
					label85: {
						if (this.ar_fld[0] >= 2048) {
							if (var3 == -784505437) {
								return;
							}

							if (!an(this, 1360988625)) {
								break label85;
							}
						}

						this.af_fld[of.ah_fld.aa_fld] = 1;
					}

					for (int var8 = 0; var8 < 7; var8++) {
						int var9 = on.ag(var8);
						if (this.af_fld[var9] > 0 && this.af_fld[var9] < 2048) {
							cn.ak(var2, this.al_fld, var8, (byte)-59);
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
